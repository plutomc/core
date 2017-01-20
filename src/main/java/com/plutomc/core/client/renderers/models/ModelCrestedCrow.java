package com.plutomc.core.client.renderers.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrestedCrow extends ModelBase
{
	private ModelRenderer ArmLeftStart;
	private ModelRenderer ArmLeftEnd;
	private ModelRenderer WingLeftStart;
	private ModelRenderer WingLeftEnd;
	private ModelRenderer BeakTop;
	private ModelRenderer BeakBottom;
	private ModelRenderer CrestFront;
	private ModelRenderer CrestMiddle;
	private ModelRenderer CrestBack;
	private ModelRenderer TailFront;
	private ModelRenderer TailMid;
	private ModelRenderer TailBack;
	private ModelRenderer LegLeft;
	private ModelRenderer LegLeftTop;
	private ModelRenderer LegLeftFoot;
	private ModelRenderer LegRight;
	private ModelRenderer LegRightTop;
	private ModelRenderer LegRightFoot;
	private ModelRenderer ArmRightStart;
	private ModelRenderer ArmRightEnd;
	private ModelRenderer WingRightEnd;
	private ModelRenderer WingRightStart;
	private ModelRenderer Neck;
	private ModelRenderer Head;
	private ModelRenderer Body;
	private ModelRenderer ToeLeft2;
	private ModelRenderer ToeLeft1;
	private ModelRenderer ToeLeft3;
	private ModelRenderer ToeRight1;
	private ModelRenderer ToeRight2;
	private ModelRenderer ToeRight3;

	public ModelCrestedCrow()
	{
		textureWidth = 77;
		textureHeight = 52;

		ArmLeftStart = new ModelRenderer(this, 0, 48);
		ArmLeftStart.addBox(0F, 0F, 0F, 8, 2, 2);
		ArmLeftStart.setRotationPoint(4F, 4F, 1F);
		ArmLeftStart.setTextureSize(textureWidth, textureHeight);
		ArmLeftStart.mirror = true;
		setRotation(ArmLeftStart, 0F, 0F, 0F);
		ArmLeftEnd = new ModelRenderer(this, 0, 48);
		ArmLeftEnd.addBox(0F, 0F, 0F, 8, 2, 2);
		ArmLeftEnd.setRotationPoint(12F, 4F, 3F);
		ArmLeftEnd.setTextureSize(textureWidth, textureHeight);
		ArmLeftEnd.mirror = true;
		setRotation(ArmLeftEnd, 0F, 0F, 0F);
		WingLeftStart = new ModelRenderer(this, 40, 9);
		WingLeftStart.addBox(0F, 0F, 0F, 8, 1, 10);
		WingLeftStart.setRotationPoint(4F, 4F, 3F);
		WingLeftStart.setTextureSize(textureWidth, textureHeight);
		WingLeftStart.mirror = true;
		setRotation(WingLeftStart, 0F, 0F, 0F);
		WingLeftEnd = new ModelRenderer(this, 40, 0);
		WingLeftEnd.addBox(0F, 0F, 0F, 8, 1, 8);
		WingLeftEnd.setRotationPoint(12F, 4F, 5F);
		WingLeftEnd.setTextureSize(textureWidth, textureHeight);
		WingLeftEnd.mirror = true;
		setRotation(WingLeftEnd, 0F, 0F, 0F);
		BeakTop = new ModelRenderer(this, 24, 5);
		BeakTop.addBox(0F, 0F, 0F, 2, 1, 5);
		BeakTop.setRotationPoint(-1F, -5F, -6F);
		BeakTop.setTextureSize(textureWidth, textureHeight);
		BeakTop.mirror = true;
		setRotation(BeakTop, 0F, 0F, 0F);
		BeakBottom = new ModelRenderer(this, 24, 0);
		BeakBottom.addBox(0F, 0F, 0F, 2, 1, 3);
		BeakBottom.setRotationPoint(-1F, -4F, -4F);
		BeakBottom.setTextureSize(textureWidth, textureHeight);
		BeakBottom.mirror = true;
		setRotation(BeakBottom, 0F, 0F, 0F);
		CrestFront = new ModelRenderer(this, 0, 0);
		CrestFront.addBox(0F, 0F, 0F, 1, 4, 1);
		CrestFront.setRotationPoint(-0.5F, -12F, -1F);
		CrestFront.setTextureSize(textureWidth, textureHeight);
		CrestFront.mirror = true;
		setRotation(CrestFront, 0F, 0F, 0F);
		CrestMiddle = new ModelRenderer(this, 4, 0);
		CrestMiddle.addBox(0F, 0F, 0F, 2, 4, 1);
		CrestMiddle.setRotationPoint(-1F, -12F, 1F);
		CrestMiddle.setTextureSize(textureWidth, textureHeight);
		CrestMiddle.mirror = true;
		setRotation(CrestMiddle, 0F, 0F, 0F);
		CrestBack = new ModelRenderer(this, 10, 0);
		CrestBack.addBox(0F, 0F, 0F, 3, 4, 1);
		CrestBack.setRotationPoint(-1.5F, -12F, 3F);
		CrestBack.setTextureSize(textureWidth, textureHeight);
		CrestBack.mirror = true;
		setRotation(CrestBack, 0F, 0F, 0F);
		TailFront = new ModelRenderer(this, 0, 37);
		TailFront.addBox(0F, 0F, 0F, 6, 7, 4);
		TailFront.setRotationPoint(-3F, 5F, 14F);
		TailFront.setTextureSize(textureWidth, textureHeight);
		TailFront.mirror = true;
		setRotation(TailFront, 0F, 0F, 0F);
		TailMid = new ModelRenderer(this, 20, 37);
		TailMid.addBox(0F, 0F, 0F, 4, 4, 3);
		TailMid.setRotationPoint(-2F, 6F, 18F);
		TailMid.setTextureSize(textureWidth, textureHeight);
		TailMid.mirror = true;
		setRotation(TailMid, 0F, 0F, 0F);
		TailBack = new ModelRenderer(this, 21, 37);
		TailBack.addBox(0F, 0F, 0F, 2, 1, 13);
		TailBack.setRotationPoint(-1F, 7F, 21F);
		TailBack.setTextureSize(textureWidth, textureHeight);
		TailBack.mirror = true;
		setRotation(TailBack, 0F, 0F, 0F);
		LegLeft = new ModelRenderer(this, 40, 0);
		LegLeft.addBox(0F, 0F, 0F, 1, 7, 1);
		LegLeft.setRotationPoint(1F, 16F, 5F);
		LegLeft.setTextureSize(textureWidth, textureHeight);
		LegLeft.mirror = true;
		setRotation(LegLeft, 0F, 0F, 0F);
		LegLeftTop = new ModelRenderer(this, 40, 20);
		LegLeftTop.addBox(0F, 0F, 0F, 3, 2, 3);
		LegLeftTop.setRotationPoint(0F, 14F, 4F);
		LegLeftTop.setTextureSize(textureWidth, textureHeight);
		LegLeftTop.mirror = true;
		setRotation(LegLeftTop, 0F, 0F, 0F);
		LegLeftFoot = new ModelRenderer(this, 40, 9);
		LegLeftFoot.addBox(0F, 0F, 0F, 3, 1, 2);
		LegLeftFoot.setRotationPoint(0F, 23F, 4F);
		LegLeftFoot.setTextureSize(textureWidth, textureHeight);
		LegLeftFoot.mirror = true;
		setRotation(LegLeftFoot, 0F, 0F, 0F);
		LegRight = new ModelRenderer(this, 40, 0);
		LegRight.addBox(0F, 0F, 0F, 1, 7, 1);
		LegRight.setRotationPoint(-2F, 16F, 5F);
		LegRight.setTextureSize(textureWidth, textureHeight);
		LegRight.mirror = true;
		setRotation(LegRight, 0F, 0F, 0F);
		LegRightTop = new ModelRenderer(this, 40, 20);
		LegRightTop.addBox(0F, 0F, 0F, 3, 2, 3);
		LegRightTop.setRotationPoint(-3F, 14F, 4F);
		LegRightTop.setTextureSize(textureWidth, textureHeight);
		LegRightTop.mirror = true;
		setRotation(LegRightTop, 0F, 0F, 0F);
		LegRightFoot = new ModelRenderer(this, 40, 9);
		LegRightFoot.addBox(0F, 0F, 0F, 3, 1, 2);
		LegRightFoot.setRotationPoint(-3F, 23F, 4F);
		LegRightFoot.setTextureSize(textureWidth, textureHeight);
		LegRightFoot.mirror = true;
		setRotation(LegRightFoot, 0F, 0F, 0F);
		ArmRightStart = new ModelRenderer(this, 0, 48);
		ArmRightStart.addBox(0F, 0F, 0F, 8, 2, 2);
		ArmRightStart.setRotationPoint(-12F, 4F, 1F);
		ArmRightStart.setTextureSize(textureWidth, textureHeight);
		ArmRightStart.mirror = true;
		setRotation(ArmRightStart, 0F, 0F, 0F);
		ArmRightEnd = new ModelRenderer(this, 0, 48);
		ArmRightEnd.addBox(0F, 0F, 0F, 8, 2, 2);
		ArmRightEnd.setRotationPoint(-20F, 4F, 3F);
		ArmRightEnd.setTextureSize(textureWidth, textureHeight);
		ArmRightEnd.mirror = true;
		setRotation(ArmRightEnd, 0F, 0F, 0F);
		WingRightEnd = new ModelRenderer(this, 40, 0);
		WingRightEnd.addBox(0F, 0F, 0F, 8, 1, 8);
		WingRightEnd.setRotationPoint(-20F, 4F, 5F);
		WingRightEnd.setTextureSize(textureWidth, textureHeight);
		WingRightEnd.mirror = true;
		setRotation(WingRightEnd, 0F, 0F, 0F);
		WingRightStart = new ModelRenderer(this, 40, 9);
		WingRightStart.addBox(0F, 0F, 0F, 8, 1, 10);
		WingRightStart.setRotationPoint(-12F, 4F, 3F);
		WingRightStart.setTextureSize(textureWidth, textureHeight);
		WingRightStart.mirror = true;
		setRotation(WingRightStart, 0F, 0F, 0F);
		Neck = new ModelRenderer(this, 0, 17);
		Neck.addBox(0F, 0F, 0F, 4, 6, 4);
		Neck.setRotationPoint(-2F, -2F, 0F);
		Neck.setTextureSize(textureWidth, textureHeight);
		Neck.mirror = true;
		setRotation(Neck, 0F, 0F, 0F);
		Head = new ModelRenderer(this, 0, 5);
		Head.addBox(0F, 0F, 0F, 6, 6, 6);
		Head.setRotationPoint(-3F, -8F, -1F);
		Head.setTextureSize(textureWidth, textureHeight);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Body = new ModelRenderer(this, 8, 11);
		Body.addBox(0F, 0F, 0F, 8, 10, 16);
		Body.setRotationPoint(-4F, 4F, -2F);
		Body.setTextureSize(textureWidth, textureHeight);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		ToeLeft2 = new ModelRenderer(this, 40, 12);
		ToeLeft2.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeLeft2.setRotationPoint(2F, 23F, 2F);
		ToeLeft2.setTextureSize(textureWidth, textureHeight);
		ToeLeft2.mirror = true;
		setRotation(ToeLeft2, 0F, 0F, 0F);
		ToeLeft1 = new ModelRenderer(this, 40, 12);
		ToeLeft1.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeLeft1.setRotationPoint(0F, 23F, 2F);
		ToeLeft1.setTextureSize(textureWidth, textureHeight);
		ToeLeft1.mirror = true;
		setRotation(ToeLeft1, 0F, 0F, 0F);
		ToeLeft3 = new ModelRenderer(this, 40, 12);
		ToeLeft3.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeLeft3.setRotationPoint(1F, 23F, 6F);
		ToeLeft3.setTextureSize(textureWidth, textureHeight);
		ToeLeft3.mirror = true;
		setRotation(ToeLeft3, 0F, 0F, 0F);
		ToeRight1 = new ModelRenderer(this, 40, 12);
		ToeRight1.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeRight1.setRotationPoint(-1F, 23F, 2F);
		ToeRight1.setTextureSize(textureWidth, textureHeight);
		ToeRight1.mirror = true;
		setRotation(ToeRight1, 0F, 0F, 0F);
		ToeRight2 = new ModelRenderer(this, 40, 12);
		ToeRight2.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeRight2.setRotationPoint(-3F, 23F, 2F);
		ToeRight2.setTextureSize(textureWidth, textureHeight);
		ToeRight2.mirror = true;
		setRotation(ToeRight2, 0F, 0F, 0F);
		ToeRight3 = new ModelRenderer(this, 40, 12);
		ToeRight3.addBox(0F, 0F, 0F, 1, 1, 2);
		ToeRight3.setRotationPoint(-2F, 23F, 6F);
		ToeRight3.setTextureSize(textureWidth, textureHeight);
		ToeRight3.mirror = true;
		setRotation(ToeRight3, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		ArmLeftStart.render(scale);
		ArmLeftEnd.render(scale);
		WingLeftStart.render(scale);
		WingLeftEnd.render(scale);
		BeakTop.render(scale);
		BeakBottom.render(scale);
		CrestFront.render(scale);
		CrestMiddle.render(scale);
		CrestBack.render(scale);
		TailFront.render(scale);
		TailMid.render(scale);
		TailBack.render(scale);
		LegLeft.render(scale);
		LegLeftTop.render(scale);
		LegLeftFoot.render(scale);
		LegRight.render(scale);
		LegRightTop.render(scale);
		LegRightFoot.render(scale);
		ArmRightStart.render(scale);
		ArmRightEnd.render(scale);
		WingRightEnd.render(scale);
		WingRightStart.render(scale);
		Neck.render(scale);
		Head.render(scale);
		Body.render(scale);
		ToeLeft2.render(scale);
		ToeLeft1.render(scale);
		ToeLeft3.render(scale);
		ToeRight1.render(scale);
		ToeRight2.render(scale);
		ToeRight3.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
