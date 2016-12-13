package com.plutomc.core.common.tileentities;

import com.plutomc.core.init.BlockRegistry;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * plutomc_core
 * Copyright (C) 2016  Kevin Boxhoorn
 *
 * plutomc_core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * plutomc_core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with plutomc_core.  If not, see <http://www.gnu.org/licenses/>.
 */
public class TileEntityQuernStone extends TileEntity implements ITickable, ISidedInventory
{
	private static final int[] SLOTS_TOP = new int[] { 0 };
	private static final int[] SLOTS_SIDES = new int[] { 1 };
	private static final int[] SLOTS_BOTTOM = new int[] { 2 };

	private NonNullList<ItemStack> quernItemStacks;
	private int grindTime;
	private int totalGrindTime;
	private String customName;

	public TileEntityQuernStone()
	{
		this.quernItemStacks = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
	}

	@Override
	public void tick()
	{

	}

	@Nonnull
	@Override
	public int[] getSlotsForFace(EnumFacing side)
	{
		return side == EnumFacing.DOWN ? SLOTS_BOTTOM : (side == EnumFacing.UP ? SLOTS_TOP : SLOTS_SIDES);
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
	{
		return isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
	{
		if (direction == EnumFacing.DOWN && index == 0)
		{
			Item item = stack.getItem();
			// TODO: Change to ItemRegistry.HAND_STONE that has durability remaining.
			if (item != Items.WATER_BUCKET && item != Items.BUCKET)
			{
				return false;
			}
		}

		return true;
	}

	@Override
	public int getSizeInventory()
	{
		return 3;
	}

	@Override
	public boolean isEmpty()
	{
		for (ItemStack itemStack : quernItemStacks)
		{
			if (!itemStack.isEmpty())
			{
				return false;
			}
		}

		return true;
	}

	@Nonnull
	@Override
	public ItemStack getStackInSlot(int index)
	{
		return quernItemStacks.get(index);
	}

	@Nonnull
	@Override
	public ItemStack decrStackSize(int index, int count)
	{
		return ItemStackHelper.getAndSplit(quernItemStacks, index, count);
	}

	@Nonnull
	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		return ItemStackHelper.getAndRemove(quernItemStacks, index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack)
	{
		ItemStack itemStack = getStackInSlot(index);
		boolean flag = !stack.isEmpty() && stack.isItemEqual(itemStack) && ItemStack.areItemStackTagsEqual(stack, itemStack);
		quernItemStacks.set(index, stack);

		if (stack.getCount() > getInventoryStackLimit())
		{
			stack.setCount(getInventoryStackLimit());
		}

		if (index == 1 && !flag)
		{
			grindTime = 0;
			totalGrindTime = getGrindTime(stack);
			markDirty();
		}
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player)
	{
		return world.getTileEntity(pos) == this && player.getDistanceSq(pos.getX() + 0.5d, pos.getY() + 0.5d, pos.getZ() + 0.5d) <= 64d;
	}

	@Override
	public void openInventory(EntityPlayer player)
	{

	}

	@Override
	public void closeInventory(EntityPlayer player)
	{

	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack)
	{
		if (index == 2)
		{
			return false;
		}
		else if (index != 0)
		{
			return true;
		}
		else
		{
			return isItemHandStone(stack);
		}
	}

	@Override
	public int getField(int id)
	{
		switch (id)
		{
			case 0:
				return grindTime;
			case 1:
				return totalGrindTime;
			default:
				return 0;
		}
	}

	@Override
	public void setField(int id, int value)
	{
		switch (id)
		{
			case 0:
				this.grindTime = value;
				break;
			case 1:
				this.totalGrindTime = value;
				break;
		}
	}

	@Override
	public int getFieldCount()
	{
		return 2;
	}

	@Nonnull
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("GrindTime", grindTime);
		compound.setInteger("TotalGrindTime", totalGrindTime);
		ItemStackHelper.saveAllItems(compound, quernItemStacks);

		if (hasCustomName())
		{
			compound.setString("CustomName", customName);
		}

		return compound;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.grindTime = compound.getInteger("GrindTime");
		this.totalGrindTime = compound.getInteger("TotalGrindTime");
		ItemStackHelper.loadAllItems(compound, quernItemStacks);

		if (compound.hasKey("CustomName", 8))
		{
			setCustomName(compound.getString("CustomName"));
		}
	}

	@Nonnull
	@Override
	public NBTTagCompound getUpdateTag()
	{
		return writeToNBT(new NBTTagCompound());
	}

	@Nullable
	@Override
	public SPacketUpdateTileEntity getUpdatePacket()
	{
		return new SPacketUpdateTileEntity(getPos(), BlockRegistry.Data.QUERN_STONE.getTileEntityID(), getUpdateTag());
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		readFromNBT(pkt.getNbtCompound());
	}

	@Override
	public void clear()
	{

	}

	@Nonnull
	@Override
	public String getName()
	{
		return hasCustomName() ? customName : "container.quern_stone";
	}

	@Override
	public boolean hasCustomName()
	{
		return customName != null && !customName.isEmpty();
	}

	@Nonnull
	@Override
	public ITextComponent getDisplayName()
	{
		return hasCustomName() ? new TextComponentString(getName()) : new TextComponentTranslation(getName());
	}

	public void setCustomName(String customName)
	{
		this.customName = customName;
	}

	private int getGrindTime(ItemStack stack)
	{
		// TODO: Have different grind times for different items.
		return 100;
	}

	public boolean isGrinding()
	{
		return grindTime > 0;
	}

	public static boolean isItemHandStone(ItemStack stack)
	{
		// TODO: Add handstone item.
		return false;
	}
}