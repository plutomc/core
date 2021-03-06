package com.plutomc.core.client.gui;

import com.plutomc.core.Core;
import com.plutomc.core.common.containers.ContainerQuernStone;
import com.plutomc.core.common.tileentities.TileEntityQuernStone;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
@SideOnly(Side.CLIENT)
public class GuiQuernStone extends GuiContainer
{
	private static final ResourceLocation GUI_TEXTURE = new ResourceLocation(Core.MOD_ID + ":textures/gui/container/quern_stone.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityQuernStone tileEntity;
	private int grindingRotation;

	public GuiQuernStone(InventoryPlayer playerInventory, TileEntityQuernStone tileEntity)
	{
		super(new ContainerQuernStone(playerInventory, tileEntity));
		this.playerInventory = playerInventory;
		this.tileEntity = tileEntity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String s = tileEntity.getDisplayName().getUnformattedText();
		fontRendererObj.drawString(s, xSize / 2 - fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
		fontRendererObj.drawString(playerInventory.getDisplayName().getUnformattedText(), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1, 1, 1, 1);
		mc.getTextureManager().bindTexture(GUI_TEXTURE);
		int i = (width - xSize) / 2;
		int j = (height - ySize) / 2;
		drawTexturedModalRect(i, j, 0, 0, xSize, ySize);

		if (tileEntity.isGrinding())
		{
			drawTexturedModalRect(i + 48, j + 35, 176,  16 + grindingRotation / 4 * 14, 14, 14);

			if (++grindingRotation > 31)
			{
				grindingRotation = 0;
			}
		}

		int l = getProgressScaled(24);
		drawTexturedModalRect(i + 73, j + 34, 176, 0, l + 1, 16);
	}

	private int getProgressScaled(int pixels)
	{
		int i = tileEntity.getField(0);
		int j = tileEntity.getField(1);
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}
