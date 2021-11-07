// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspider_queen extends EntityModel<Entity> {
	private final ModelRenderer Base;
	private final ModelRenderer Abdomen;
	private final ModelRenderer ABP3_r1;
	private final ModelRenderer ABP2_r1;
	private final ModelRenderer Base2;
	private final ModelRenderer Chest;
	private final ModelRenderer Rightlegs;
	private final ModelRenderer WRLEGS1;
	private final ModelRenderer RL1_r1;
	private final ModelRenderer Rleg2;
	private final ModelRenderer RG2_r1;
	private final ModelRenderer Rleg3;
	private final ModelRenderer RG3_r1;
	private final ModelRenderer WRLEGS2;
	private final ModelRenderer RL1_r2;
	private final ModelRenderer Rleg4;
	private final ModelRenderer RG2_r2;
	private final ModelRenderer Rleg5;
	private final ModelRenderer RG3_r2;
	private final ModelRenderer WRLEGS3;
	private final ModelRenderer RL1_r3;
	private final ModelRenderer Rleg6;
	private final ModelRenderer RG2_r3;
	private final ModelRenderer Rleg7;
	private final ModelRenderer RG3_r3;
	private final ModelRenderer WRLEGS4;
	private final ModelRenderer RL1_r4;
	private final ModelRenderer Rleg8;
	private final ModelRenderer RG2_r4;
	private final ModelRenderer Rleg9;
	private final ModelRenderer RG3_r4;
	private final ModelRenderer Leftlegs;
	private final ModelRenderer WLLEG1;
	private final ModelRenderer LG1_r1;
	private final ModelRenderer Lleg2;
	private final ModelRenderer LG2_r1;
	private final ModelRenderer Lleg3;
	private final ModelRenderer LG3_r1;
	private final ModelRenderer WLLEG2;
	private final ModelRenderer LG1_r2;
	private final ModelRenderer Lleg4;
	private final ModelRenderer LG2_r2;
	private final ModelRenderer Lleg5;
	private final ModelRenderer LG3_r2;
	private final ModelRenderer WLLEG3;
	private final ModelRenderer LG1_r3;
	private final ModelRenderer Lleg6;
	private final ModelRenderer LG2_r3;
	private final ModelRenderer Lleg7;
	private final ModelRenderer LG3_r3;
	private final ModelRenderer WLLEG4;
	private final ModelRenderer LG1_r4;
	private final ModelRenderer Lleg8;
	private final ModelRenderer LG2_r4;
	private final ModelRenderer Lleg9;
	private final ModelRenderer LG3_r4;
	private final ModelRenderer Head;
	private final ModelRenderer Facetendrils;
	private final ModelRenderer TFFT;
	private final ModelRenderer TFFT1_r1;
	private final ModelRenderer TFFT2;
	private final ModelRenderer TFFT2_r1;
	private final ModelRenderer TRFT;
	private final ModelRenderer TRFT1_r1;
	private final ModelRenderer TRFT2;
	private final ModelRenderer TRFT2_r1;
	private final ModelRenderer BLFT;
	private final ModelRenderer BLFT1_r1;
	private final ModelRenderer BLFT2;
	private final ModelRenderer BLFT2_r1;
	private final ModelRenderer BRFT;
	private final ModelRenderer BRFT1_r1;
	private final ModelRenderer BRFT2;
	private final ModelRenderer BRFT2_r1;
	private final ModelRenderer Headpieces;
	private final ModelRenderer Hp4_r1;
	private final ModelRenderer Crown2_r1;
	private final ModelRenderer Teeth;
	private final ModelRenderer Bottomjsaw;
	private final ModelRenderer BJPs;
	private final ModelRenderer BjR1_r1;
	private final ModelRenderer BjR3_r1;
	private final ModelRenderer BjR4_r1;
	private final ModelRenderer Bjteeth;
	private final ModelRenderer Teeth4_r1;

	public Modelspider_queen() {
		textureWidth = 352;
		textureHeight = 352;

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, -29.5F, -22.5F);

		Abdomen = new ModelRenderer(this);
		Abdomen.setRotationPoint(0.3333F, -16.6051F, 33.2717F);
		Base.addChild(Abdomen);
		setRotationAngle(Abdomen, 0.1745F, 0.0F, 0.0F);
		Abdomen.setTextureOffset(192, 196).addBox(-15.3333F, -11.4074F, -23.1972F, 30.0F, 32.0F, 12.0F, 0.0F, false);

		ABP3_r1 = new ModelRenderer(this);
		ABP3_r1.setRotationPoint(1.1667F, 0.9987F, 33.0508F);
		Abdomen.addChild(ABP3_r1);
		setRotationAngle(ABP3_r1, 0.3054F, 0.0F, 0.0F);
		ABP3_r1.setTextureOffset(0, 0).addBox(-28.5F, -36.5F, -38.0F, 54.0F, 54.0F, 68.0F, 0.0F, false);

		ABP2_r1 = new ModelRenderer(this);
		ABP2_r1.setRotationPoint(-0.3333F, 2.0926F, -8.1972F);
		Abdomen.addChild(ABP2_r1);
		setRotationAngle(ABP2_r1, 0.1745F, 0.0F, 0.0F);
		ABP2_r1.setTextureOffset(110, 122).addBox(-19.0F, -20.5F, -7.0F, 38.0F, 41.0F, 12.0F, 0.0F, false);

		Base2 = new ModelRenderer(this);
		Base2.setRotationPoint(0.0F, 2.5F, -1.0F);
		Base.addChild(Base2);

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Base2.addChild(Chest);
		Chest.setTextureOffset(176, 0).addBox(-10.0F, -1.0F, -11.5F, 20.0F, 6.0F, 29.0F, 0.1F, false);
		Chest.setTextureOffset(0, 168).addBox(-11.0F, -18.0F, -11.5F, 22.0F, 17.0F, 29.0F, 0.0F, false);

		Rightlegs = new ModelRenderer(this);
		Rightlegs.setRotationPoint(-9.6988F, -8.5424F, -2.9217F);
		Base2.addChild(Rightlegs);

		WRLEGS1 = new ModelRenderer(this);
		WRLEGS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightlegs.addChild(WRLEGS1);
		setRotationAngle(WRLEGS1, 0.0F, -0.48F, 0.0F);

		RL1_r1 = new ModelRenderer(this);
		RL1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		WRLEGS1.addChild(RL1_r1);
		setRotationAngle(RL1_r1, -0.4363F, -0.5672F, 0.5672F);
		RL1_r1.setTextureOffset(192, 240).addBox(-36.5597F, -8.6207F, -1.9319F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Rleg2 = new ModelRenderer(this);
		Rleg2.setRotationPoint(-30.5863F, -19.4856F, -23.1039F);
		WRLEGS1.addChild(Rleg2);
		setRotationAngle(Rleg2, -0.3133F, -0.039F, -0.0466F);

		RG2_r1 = new ModelRenderer(this);
		RG2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rleg2.addChild(RG2_r1);
		setRotationAngle(RG2_r1, 0.0F, -0.5672F, 0.5672F);
		RG2_r1.setTextureOffset(262, 260).addBox(-2.4973F, -8.7976F, 0.3931F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Rleg3 = new ModelRenderer(this);
		Rleg3.setRotationPoint(-27.5749F, 37.6127F, -1.9413F);
		Rleg2.addChild(Rleg3);

		RG3_r1 = new ModelRenderer(this);
		RG3_r1.setRotationPoint(-0.879F, -0.0125F, -0.4766F);
		Rleg3.addChild(RG3_r1);
		setRotationAngle(RG3_r1, 0.2861F, -0.4968F, 0.0142F);
		RG3_r1.setTextureOffset(306, 24).addBox(4.1345F, -1.8277F, 1.3931F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WRLEGS2 = new ModelRenderer(this);
		WRLEGS2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightlegs.addChild(WRLEGS2);
		setRotationAngle(WRLEGS2, 0.0F, 0.1309F, 0.0F);

		RL1_r2 = new ModelRenderer(this);
		RL1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		WRLEGS2.addChild(RL1_r2);
		setRotationAngle(RL1_r2, -0.4363F, -0.5672F, 0.5672F);
		RL1_r2.setTextureOffset(210, 142).addBox(-42.1227F, -6.2876F, 2.8468F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Rleg4 = new ModelRenderer(this);
		Rleg4.setRotationPoint(-30.5863F, -19.4856F, -23.1039F);
		WRLEGS2.addChild(Rleg4);
		setRotationAngle(Rleg4, -0.3133F, -0.039F, -0.0466F);

		RG2_r2 = new ModelRenderer(this);
		RG2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rleg4.addChild(RG2_r2);
		setRotationAngle(RG2_r2, 0.0F, -0.5672F, 0.5672F);
		RG2_r2.setTextureOffset(0, 260).addBox(-8.1296F, -4.9896F, 3.9989F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Rleg5 = new ModelRenderer(this);
		Rleg5.setRotationPoint(-27.5749F, 37.6127F, -1.9413F);
		Rleg4.addChild(Rleg5);

		RG3_r2 = new ModelRenderer(this);
		RG3_r2.setRotationPoint(-0.879F, -0.0125F, -0.4766F);
		Rleg5.addChild(RG3_r2);
		setRotationAngle(RG3_r2, 0.2861F, -0.4968F, 0.0142F);
		RG3_r2.setTextureOffset(112, 289).addBox(-2.6198F, -1.0506F, 4.9989F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WRLEGS3 = new ModelRenderer(this);
		WRLEGS3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightlegs.addChild(WRLEGS3);
		setRotationAngle(WRLEGS3, 0.0F, 0.9425F, 0.0F);

		RL1_r3 = new ModelRenderer(this);
		RL1_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		WRLEGS3.addChild(RL1_r3);
		setRotationAngle(RL1_r3, -0.4363F, -0.5672F, 0.5672F);
		RL1_r3.setTextureOffset(210, 122).addBox(-48.4976F, -2.763F, 0.364F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Rleg6 = new ModelRenderer(this);
		Rleg6.setRotationPoint(-30.5863F, -19.4856F, -23.1039F);
		WRLEGS3.addChild(Rleg6);
		setRotationAngle(Rleg6, -0.3133F, -0.039F, -0.0466F);

		RG2_r3 = new ModelRenderer(this);
		RG2_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rleg6.addChild(RG2_r3);
		setRotationAngle(RG2_r3, 0.0F, -0.5672F, 0.5672F);
		RG2_r3.setTextureOffset(166, 252).addBox(-13.6419F, -1.1912F, 0.2026F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Rleg7 = new ModelRenderer(this);
		Rleg7.setRotationPoint(-27.5749F, 37.6127F, -1.9413F);
		Rleg6.addChild(Rleg7);

		RG3_r3 = new ModelRenderer(this);
		RG3_r3.setRotationPoint(-0.879F, -0.0125F, -0.4766F);
		Rleg7.addChild(RG3_r3);
		setRotationAngle(RG3_r3, 0.2861F, -0.4968F, 0.0142F);
		RG3_r3.setTextureOffset(88, 289).addBox(-9.2631F, -0.2267F, 1.2026F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WRLEGS4 = new ModelRenderer(this);
		WRLEGS4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rightlegs.addChild(WRLEGS4);
		setRotationAngle(WRLEGS4, 0.0F, 1.5272F, 0.0F);

		RL1_r4 = new ModelRenderer(this);
		RL1_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		WRLEGS4.addChild(RL1_r4);
		setRotationAngle(RL1_r4, -0.4363F, -0.5672F, 0.5672F);
		RL1_r4.setTextureOffset(173, 175).addBox(-48.4976F, -2.763F, 0.364F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Rleg8 = new ModelRenderer(this);
		Rleg8.setRotationPoint(-30.5863F, -19.4856F, -23.1039F);
		WRLEGS4.addChild(Rleg8);
		setRotationAngle(Rleg8, -0.3133F, -0.039F, -0.0466F);

		RG2_r4 = new ModelRenderer(this);
		RG2_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rleg8.addChild(RG2_r4);
		setRotationAngle(RG2_r4, 0.0F, -0.5672F, 0.5672F);
		RG2_r4.setTextureOffset(0, 0).addBox(-13.6419F, -1.1912F, 0.2026F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Rleg9 = new ModelRenderer(this);
		Rleg9.setRotationPoint(-27.5749F, 37.6127F, -1.9413F);
		Rleg8.addChild(Rleg9);

		RG3_r4 = new ModelRenderer(this);
		RG3_r4.setRotationPoint(-0.879F, -0.0125F, -0.4766F);
		Rleg9.addChild(RG3_r4);
		setRotationAngle(RG3_r4, 0.2861F, -0.4968F, 0.0142F);
		RG3_r4.setTextureOffset(64, 260).addBox(-9.2631F, -0.2267F, 1.2026F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		Leftlegs = new ModelRenderer(this);
		Leftlegs.setRotationPoint(9.6988F, -8.5424F, -2.9217F);
		Base2.addChild(Leftlegs);

		WLLEG1 = new ModelRenderer(this);
		WLLEG1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leftlegs.addChild(WLLEG1);
		setRotationAngle(WLLEG1, 0.0F, 0.48F, 0.0F);

		LG1_r1 = new ModelRenderer(this);
		LG1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		WLLEG1.addChild(LG1_r1);
		setRotationAngle(LG1_r1, -0.4363F, 0.5672F, -0.5672F);
		LG1_r1.setTextureOffset(0, 240).addBox(-6.4403F, -8.6207F, -1.9319F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Lleg2 = new ModelRenderer(this);
		Lleg2.setRotationPoint(30.5863F, -19.4856F, -23.1039F);
		WLLEG1.addChild(Lleg2);
		setRotationAngle(Lleg2, -0.3133F, 0.039F, 0.0466F);

		LG2_r1 = new ModelRenderer(this);
		LG2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lleg2.addChild(LG2_r1);
		setRotationAngle(LG2_r1, 0.0F, 0.5672F, -0.5672F);
		LG2_r1.setTextureOffset(230, 260).addBox(-5.5027F, -8.7976F, 0.3931F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Lleg3 = new ModelRenderer(this);
		Lleg3.setRotationPoint(27.5749F, 37.6127F, -1.9413F);
		Lleg2.addChild(Lleg3);

		LG3_r1 = new ModelRenderer(this);
		LG3_r1.setRotationPoint(0.879F, -0.0125F, -0.4766F);
		Lleg3.addChild(LG3_r1);
		setRotationAngle(LG3_r1, 0.2861F, 0.4968F, -0.0142F);
		LG3_r1.setTextureOffset(303, 162).addBox(-10.1345F, -1.8277F, 1.3931F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WLLEG2 = new ModelRenderer(this);
		WLLEG2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leftlegs.addChild(WLLEG2);
		setRotationAngle(WLLEG2, 0.0F, -0.1309F, 0.0F);

		LG1_r2 = new ModelRenderer(this);
		LG1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		WLLEG2.addChild(LG1_r2);
		setRotationAngle(LG1_r2, -0.4363F, 0.5672F, -0.5672F);
		LG1_r2.setTextureOffset(96, 230).addBox(-0.8773F, -6.2876F, 2.8468F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Lleg4 = new ModelRenderer(this);
		Lleg4.setRotationPoint(30.5863F, -19.4856F, -23.1039F);
		WLLEG2.addChild(Lleg4);
		setRotationAngle(Lleg4, -0.3133F, 0.039F, 0.0466F);

		LG2_r2 = new ModelRenderer(this);
		LG2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lleg4.addChild(LG2_r2);
		setRotationAngle(LG2_r2, 0.0F, 0.5672F, -0.5672F);
		LG2_r2.setTextureOffset(198, 260).addBox(0.1296F, -4.9896F, 3.9989F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Lleg5 = new ModelRenderer(this);
		Lleg5.setRotationPoint(27.5749F, 37.6127F, -1.9413F);
		Lleg4.addChild(Lleg5);

		LG3_r2 = new ModelRenderer(this);
		LG3_r2.setRotationPoint(0.879F, -0.0125F, -0.4766F);
		Lleg5.addChild(LG3_r2);
		setRotationAngle(LG3_r2, 0.2861F, 0.4968F, -0.0142F);
		LG3_r2.setTextureOffset(294, 254).addBox(-3.3802F, -1.0506F, 4.9989F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WLLEG3 = new ModelRenderer(this);
		WLLEG3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leftlegs.addChild(WLLEG3);
		setRotationAngle(WLLEG3, 0.0F, -0.9512F, 0.0F);

		LG1_r3 = new ModelRenderer(this);
		LG1_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		WLLEG3.addChild(LG1_r3);
		setRotationAngle(LG1_r3, -0.4363F, 0.5672F, -0.5672F);
		LG1_r3.setTextureOffset(0, 214).addBox(5.2942F, -2.8939F, 0.6157F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Lleg6 = new ModelRenderer(this);
		Lleg6.setRotationPoint(30.5863F, -19.4856F, -23.1039F);
		WLLEG3.addChild(Lleg6);
		setRotationAngle(Lleg6, -0.3133F, 0.039F, 0.0466F);

		LG2_r3 = new ModelRenderer(this);
		LG2_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lleg6.addChild(LG2_r3);
		setRotationAngle(LG2_r3, 0.0F, 0.5672F, -0.5672F);
		LG2_r3.setTextureOffset(32, 260).addBox(5.4865F, -1.3001F, 0.4955F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Lleg7 = new ModelRenderer(this);
		Lleg7.setRotationPoint(27.5749F, 37.6127F, -1.9413F);
		Lleg6.addChild(Lleg7);

		LG3_r3 = new ModelRenderer(this);
		LG3_r3.setRotationPoint(0.879F, -0.0125F, -0.4766F);
		Lleg7.addChild(LG3_r3);
		setRotationAngle(LG3_r3, 0.2861F, 0.4968F, -0.0142F);
		LG3_r3.setTextureOffset(136, 289).addBox(3.075F, -0.2515F, 1.4955F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		WLLEG4 = new ModelRenderer(this);
		WLLEG4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leftlegs.addChild(WLLEG4);
		setRotationAngle(WLLEG4, 0.0F, -1.4835F, 0.0F);

		LG1_r4 = new ModelRenderer(this);
		LG1_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		WLLEG4.addChild(LG1_r4);
		setRotationAngle(LG1_r4, -0.4363F, 0.5672F, -0.5672F);
		LG1_r4.setTextureOffset(176, 35).addBox(5.2942F, -2.8939F, 0.6157F, 43.0F, 10.0F, 10.0F, 0.0F, false);

		Lleg8 = new ModelRenderer(this);
		Lleg8.setRotationPoint(30.5863F, -19.4856F, -23.1039F);
		WLLEG4.addChild(Lleg8);
		setRotationAngle(Lleg8, -0.3133F, 0.039F, 0.0466F);

		LG2_r4 = new ModelRenderer(this);
		LG2_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lleg8.addChild(LG2_r4);
		setRotationAngle(LG2_r4, 0.0F, 0.5672F, -0.5672F);
		LG2_r4.setTextureOffset(32, 0).addBox(5.4865F, -1.3001F, 0.4955F, 8.0F, 52.0F, 8.0F, 0.0F, false);

		Lleg9 = new ModelRenderer(this);
		Lleg9.setRotationPoint(27.5749F, 37.6127F, -1.9413F);
		Lleg8.addChild(Lleg9);

		LG3_r4 = new ModelRenderer(this);
		LG3_r4.setRotationPoint(0.879F, -0.0125F, -0.4766F);
		Lleg9.addChild(LG3_r4);
		setRotationAngle(LG3_r4, 0.2861F, 0.4968F, -0.0142F);
		LG3_r4.setTextureOffset(279, 162).addBox(3.075F, -0.2515F, 1.4955F, 6.0F, 46.0F, 6.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -5.125F, -9.0625F);
		Base2.addChild(Head);

		Facetendrils = new ModelRenderer(this);
		Facetendrils.setRotationPoint(0.0F, 6.125F, -22.4375F);
		Head.addChild(Facetendrils);

		TFFT = new ModelRenderer(this);
		TFFT.setRotationPoint(7.6625F, -2.0161F, -1.1168F);
		Facetendrils.addChild(TFFT);
		setRotationAngle(TFFT, 0.0F, -0.2182F, 0.0F);

		TFFT1_r1 = new ModelRenderer(this);
		TFFT1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TFFT.addChild(TFFT1_r1);
		setRotationAngle(TFFT1_r1, -0.4051F, -0.2415F, 0.1022F);
		TFFT1_r1.setTextureOffset(101, 175).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		TFFT2 = new ModelRenderer(this);
		TFFT2.setRotationPoint(1.6823F, -2.4027F, -5.8006F);
		TFFT.addChild(TFFT2);

		TFFT2_r1 = new ModelRenderer(this);
		TFFT2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TFFT2.addChild(TFFT2_r1);
		setRotationAngle(TFFT2_r1, -0.4051F, -0.2415F, 0.1022F);
		TFFT2_r1.setTextureOffset(178, 208).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 12.0F, 3.0F, -0.1F, false);

		TRFT = new ModelRenderer(this);
		TRFT.setRotationPoint(-7.6625F, -2.0161F, -1.1168F);
		Facetendrils.addChild(TRFT);
		setRotationAngle(TRFT, 0.0F, 0.2182F, 0.0F);

		TRFT1_r1 = new ModelRenderer(this);
		TRFT1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TRFT.addChild(TRFT1_r1);
		setRotationAngle(TRFT1_r1, -0.4051F, 0.2415F, -0.1022F);
		TRFT1_r1.setTextureOffset(95, 122).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);

		TRFT2 = new ModelRenderer(this);
		TRFT2.setRotationPoint(-1.5529F, -2.2179F, -5.3544F);
		TRFT.addChild(TRFT2);

		TRFT2_r1 = new ModelRenderer(this);
		TRFT2_r1.setRotationPoint(0.0F, -0.4619F, 0.1913F);
		TRFT2.addChild(TRFT2_r1);
		setRotationAngle(TRFT2_r1, -0.4051F, 0.2415F, -0.1022F);
		TRFT2_r1.setTextureOffset(117, 188).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 12.0F, 4.0F, -0.1F, false);

		BLFT = new ModelRenderer(this);
		BLFT.setRotationPoint(8.2345F, 2.959F, 13.938F);
		Facetendrils.addChild(BLFT);
		setRotationAngle(BLFT, 0.5255F, -0.0582F, -0.0179F);

		BLFT1_r1 = new ModelRenderer(this);
		BLFT1_r1.setRotationPoint(-0.2588F, -0.3696F, 0.8924F);
		BLFT.addChild(BLFT1_r1);
		setRotationAngle(BLFT1_r1, 0.3957F, -0.1209F, -0.0503F);
		BLFT1_r1.setTextureOffset(276, 214).addBox(-2.9211F, -1.3999F, -21.3349F, 4.0F, 4.0F, 20.0F, 0.0F, false);

		BLFT2 = new ModelRenderer(this);
		BLFT2.setRotationPoint(1.3523F, 8.0108F, -16.4651F);
		BLFT.addChild(BLFT2);

		BLFT2_r1 = new ModelRenderer(this);
		BLFT2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		BLFT2.addChild(BLFT2_r1);
		setRotationAngle(BLFT2_r1, 0.395F, -0.1048F, -0.0436F);
		BLFT2_r1.setTextureOffset(244, 87).addBox(-2.0F, -11.5F, -2.0F, 4.0F, 12.0F, 4.0F, -0.1F, false);

		BRFT = new ModelRenderer(this);
		BRFT.setRotationPoint(-8.2345F, 2.959F, 13.938F);
		Facetendrils.addChild(BRFT);
		setRotationAngle(BRFT, 0.5255F, 0.0582F, 0.0179F);

		BRFT1_r1 = new ModelRenderer(this);
		BRFT1_r1.setRotationPoint(0.2588F, -0.3696F, 0.8924F);
		BRFT.addChild(BRFT1_r1);
		setRotationAngle(BRFT1_r1, 0.3957F, 0.1209F, 0.0503F);
		BRFT1_r1.setTextureOffset(73, 168).addBox(-1.0789F, -1.3999F, -21.3349F, 4.0F, 4.0F, 20.0F, 0.0F, false);

		BRFT2 = new ModelRenderer(this);
		BRFT2.setRotationPoint(-1.3523F, 8.0108F, -16.4651F);
		BRFT.addChild(BRFT2);

		BRFT2_r1 = new ModelRenderer(this);
		BRFT2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		BRFT2.addChild(BRFT2_r1);
		setRotationAngle(BRFT2_r1, 0.395F, 0.1048F, 0.0436F);
		BRFT2_r1.setTextureOffset(73, 168).addBox(-2.0F, -11.5F, -2.0F, 4.0F, 12.0F, 4.0F, -0.1F, false);

		Headpieces = new ModelRenderer(this);
		Headpieces.setRotationPoint(0.0F, 3.625F, -11.4375F);
		Head.addChild(Headpieces);
		Headpieces.setTextureOffset(106, 208).addBox(-4.0F, -25.5F, -11.75F, 8.0F, 11.0F, 9.0F, 0.0F, false);
		Headpieces.setTextureOffset(244, 87).addBox(-10.0F, -18.5F, -13.0F, 20.0F, 4.0F, 23.0F, 0.0F, false);
		Headpieces.setTextureOffset(0, 122).addBox(-12.0F, -14.5F, -15.0F, 24.0F, 15.0F, 31.0F, 0.0F, false);
		Headpieces.setTextureOffset(102, 175).addBox(-10.0F, 0.5F, -14.5F, 20.0F, 2.0F, 31.0F, 0.0F, false);
		Headpieces.setTextureOffset(244, 55).addBox(-8.0F, 2.5F, -14.0F, 16.0F, 2.0F, 30.0F, 0.0F, false);

		Hp4_r1 = new ModelRenderer(this);
		Hp4_r1.setRotationPoint(0.0F, -2.0F, 9.5F);
		Headpieces.addChild(Hp4_r1);
		setRotationAngle(Hp4_r1, 1.1345F, 0.0F, 0.0F);
		Hp4_r1.setTextureOffset(90, 250).addBox(-11.0F, -18.4F, -10.5F, 22.0F, 23.0F, 16.0F, 0.0F, false);

		Crown2_r1 = new ModelRenderer(this);
		Crown2_r1.setRotationPoint(-0.0152F, -23.0884F, -7.25F);
		Headpieces.addChild(Crown2_r1);
		setRotationAngle(Crown2_r1, 0.0F, 0.0F, -0.7854F);
		Crown2_r1.setTextureOffset(140, 208).addBox(-2.3269F, -6.6945F, -4.5F, 9.0F, 9.0F, 9.0F, -0.1F, false);

		Teeth = new ModelRenderer(this);
		Teeth.setRotationPoint(0.5F, -26.0F, -9.25F);
		Headpieces.addChild(Teeth);
		Teeth.setTextureOffset(28, 60).addBox(-6.5F, 30.5F, -4.75F, 12.0F, 1.0F, 0.0F, 0.0F, false);
		Teeth.setTextureOffset(24, 0).addBox(-3.5F, 31.5F, -4.75F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		Teeth.setTextureOffset(0, 4).addBox(-1.5F, 32.5F, -4.75F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		Bottomjsaw = new ModelRenderer(this);
		Bottomjsaw.setRotationPoint(0.0F, 5.625F, -3.4375F);
		Head.addChild(Bottomjsaw);
		setRotationAngle(Bottomjsaw, 0.4189F, 0.0F, 0.0F);
		Bottomjsaw.setTextureOffset(245, 0).addBox(-7.0F, 0.5F, -21.0F, 14.0F, 3.0F, 21.0F, 0.0F, false);

		BJPs = new ModelRenderer(this);
		BJPs.setRotationPoint(0.0F, 2.0F, -11.0F);
		Bottomjsaw.addChild(BJPs);

		BjR1_r1 = new ModelRenderer(this);
		BjR1_r1.setRotationPoint(6.6F, -7.7231F, -3.6627F);
		BJPs.addChild(BjR1_r1);
		setRotationAngle(BjR1_r1, 1.309F, 0.0F, 0.0F);
		BjR1_r1.setTextureOffset(0, 168).addBox(-0.5F, -4.0F, -7.8F, 1.0F, 9.0F, 13.0F, 0.0F, false);
		BjR1_r1.setTextureOffset(272, 24).addBox(-0.5F, 5.0F, -5.3F, 1.0F, 9.0F, 11.0F, 0.0F, false);
		BjR1_r1.setTextureOffset(294, 0).addBox(-13.7F, 5.0F, -5.3F, 1.0F, 9.0F, 11.0F, -0.1F, false);
		BjR1_r1.setTextureOffset(176, 0).addBox(-13.7F, -4.0F, -7.8F, 1.0F, 9.0F, 13.0F, -0.1F, false);

		BjR3_r1 = new ModelRenderer(this);
		BjR3_r1.setRotationPoint(6.6F, -15.9973F, -0.928F);
		BJPs.addChild(BjR3_r1);
		setRotationAngle(BjR3_r1, 0.637F, 0.0F, 0.0F);
		BjR3_r1.setTextureOffset(162, 212).addBox(-0.5F, -1.3F, -5.5F, 1.0F, 3.0F, 14.0F, -0.1F, false);
		BjR3_r1.setTextureOffset(0, 122).addBox(-0.5F, -1.3F, -5.5F, 1.0F, 10.0F, 14.0F, -0.2F, false);

		BjR4_r1 = new ModelRenderer(this);
		BjR4_r1.setRotationPoint(-6.6F, -15.9973F, -0.928F);
		BJPs.addChild(BjR4_r1);
		setRotationAngle(BjR4_r1, 0.637F, 0.0F, 0.0F);
		BjR4_r1.setTextureOffset(79, 122).addBox(-0.5F, -1.3F, -5.5F, 1.0F, 10.0F, 14.0F, -0.2F, false);
		BjR4_r1.setTextureOffset(244, 55).addBox(-0.5F, -1.3F, -5.5F, 1.0F, 3.0F, 14.0F, -0.1F, false);

		Bjteeth = new ModelRenderer(this);
		Bjteeth.setRotationPoint(0.0F, 2.0F, -11.0F);
		Bottomjsaw.addChild(Bjteeth);

		Teeth4_r1 = new ModelRenderer(this);
		Teeth4_r1.setRotationPoint(0.0F, -1.525F, -10.0F);
		Bjteeth.addChild(Teeth4_r1);
		setRotationAngle(Teeth4_r1, -0.2182F, 0.0F, 0.0F);
		Teeth4_r1.setTextureOffset(0, 2).addBox(-1.0F, -6.975F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Teeth4_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.975F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);
		Teeth4_r1.setTextureOffset(0, 61).addBox(-5.0F, -2.975F, 0.0F, 10.0F, 2.0F, 0.0F, 0.0F, false);
		Teeth4_r1.setTextureOffset(0, 60).addBox(-7.0F, -0.975F, 0.0F, 14.0F, 1.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Base.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}