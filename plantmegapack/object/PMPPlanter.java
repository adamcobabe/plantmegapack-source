package plantmegapack.object;

import net.minecraft.util.text.translation.I18n;

public enum PMPPlanter
{
	planterSquareAsper("bambooPlanterSquareAsper", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooAsperBlock1", "plantmegapack:blocks/bambooAsperBlock", "plantmegapack:blocks/bambooAsperBlock1"),	planterSquareFargesiaRobusta("bambooPlanterSquareFargesiaRobusta", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooFargesiaRobustaBlock1", "plantmegapack:blocks/bambooFargesiaRobustaBlock", "plantmegapack:blocks/bambooFargesiaRobustaBlock1"),	planterSquareGiantTimber("bambooPlanterSquareGiantTimber", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooGiantTimberBlock1", "plantmegapack:blocks/bambooGiantTimberBlock", "plantmegapack:blocks/bambooGiantTimberBlock1"),	planterSquareGolden("bambooPlanterSquareGolden", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooGoldenBlock1", "plantmegapack:blocks/bambooGoldenBlock", "plantmegapack:blocks/bambooGoldenBlock1"),	planterSquareMoso("bambooPlanterSquareMoso", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooMosoBlock1", "plantmegapack:blocks/bambooMosoBlock", "plantmegapack:blocks/bambooMosoBlock1"),	planterSquareShortTassled("bambooPlanterSquareShortTassled", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooShortTassledBlock1", "plantmegapack:blocks/bambooShortTassledBlock", "plantmegapack:blocks/bambooShortTassledBlock1"),	planterSquareTimorBlack("bambooPlanterSquareTimorBlack", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooTimorBlackBlock1", "plantmegapack:blocks/bambooTimorBlackBlock", "plantmegapack:blocks/bambooTimorBlackBlock1"),	planterSquareTropicalBlue("bambooPlanterSquareTropicalBlue", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooTropicalBlueBlock1", "plantmegapack:blocks/bambooTropicalBlueBlock", "plantmegapack:blocks/bambooTropicalBlueBlock1"),	planterSquareWetForest("bambooPlanterSquareWetForest", PMPPlanterType.squareBamboo, "plantmegapack:blocks/bambooWetForestBlock1", "plantmegapack:blocks/bambooWetForestBlock", "plantmegapack:blocks/bambooWetForestBlock1"),	planterSquareAcacia("woodPlanterSquareAcacia", PMPPlanterType.squareWood, "blocks/planks_acacia", "blocks/planks_acacia", "blocks/log_acacia"),	planterSquareBirch("woodPlanterSquareBirch", PMPPlanterType.squareWood, "blocks/planks_birch", "blocks/planks_birch", "blocks/log_birch"),	planterSquareDarkOak("woodPlanterSquareDarkOak", PMPPlanterType.squareWood, "blocks/planks_big_oak", "blocks/planks_big_oak", "blocks/log_big_oak"),	planterSquareJungle("woodPlanterSquareJungle", PMPPlanterType.squareWood, "blocks/planks_jungle", "blocks/planks_jungle", "blocks/log_jungle"),	planterSquareOak("woodPlanterSquareOak", PMPPlanterType.squareWood, "blocks/planks_oak", "blocks/planks_oak", "blocks/log_oak"),	planterSquareSpruce("woodPlanterSquareSpruce", PMPPlanterType.squareWood, "blocks/planks_spruce", "blocks/planks_spruce", "blocks/log_spruce"),	planterSquareFruitwoodGray("woodPlanterSquareFruitwoodGray", PMPPlanterType.squareWood, "plantmegapack:blocks/woodfruitgrayPlanks", "plantmegapack:blocks/woodfruitgrayPlanks", "plantmegapack:blocks/woodfruitgrayBlock"),	planterSquareAndesite("stonePlanterSquareAndesite", PMPPlanterType.squareStone, "blocks/stone_andesite", "blocks/stone_andesite", "blocks/stone_andesite"),	planterSquareCobblestone("stonePlanterSquareCobblestone", PMPPlanterType.squareStone, "blocks/cobblestone", "blocks/cobblestone", "blocks/cobblestone"),	planterSquareDiorite("stonePlanterSquareDiorite", PMPPlanterType.squareStone, "blocks/stone_diorite", "blocks/stone_diorite", "blocks/stone_diorite"),	planterSquareGranite("stonePlanterSquareGranite", PMPPlanterType.squareStone, "blocks/stone_granite", "blocks/stone_granite", "blocks/stone_granite"),	planterSquareLapis("stonePlanterSquareLapis", PMPPlanterType.squareStone, "blocks/lapis_block", "blocks/lapis_block", "blocks/lapis_block"),	planterSquareObsidian("stonePlanterSquareObsidian", PMPPlanterType.squareStone, "blocks/obsidian", "blocks/obsidian", "blocks/obsidian"),	planterSquarePrismarine("stonePlanterSquarePrismarine", PMPPlanterType.squareStone, "blocks/prismarine_rough", "blocks/prismarine_rough", "blocks/prismarine_rough"),	planterSquareQuartz("stonePlanterSquareQuartz", PMPPlanterType.squareStone, "blocks/quartz_block_bottom", "blocks/quartz_block_bottom", "blocks/quartz_block_bottom"),	planterSquareRedSandstone("stonePlanterSquareRedSandstone", PMPPlanterType.squareStone, "blocks/red_sandstone_normal", "blocks/red_sandstone_normal", "blocks/red_sandstone_normal"),	planterSquareSandstone("stonePlanterSquareSandstone", PMPPlanterType.squareStone, "blocks/sandstone_normal", "blocks/sandstone_normal", "blocks/sandstone_normal"),	planterSquareStone("stonePlanterSquareStone", PMPPlanterType.squareStone, "blocks/stone", "blocks/stone", "blocks/stone"),	planterSquareGold("metalPlanterSquareGold", PMPPlanterType.squareMetal, "blocks/gold_block", "blocks/gold_block", "blocks/gold_block"),	planterSquareIron("metalPlanterSquareIron", PMPPlanterType.squareMetal, "blocks/iron_block", "blocks/iron_block", "blocks/iron_block"),	planterColumnAsper("bambooPlanterColumnAsper", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooAsperBlock1", "plantmegapack:blocks/bambooAsperBlock", "plantmegapack:blocks/bambooAsperBlock1"),	planterColumnFargesiaRobusta("bambooPlanterColumnFargesiaRobusta", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooFargesiaRobustaBlock1", "plantmegapack:blocks/bambooFargesiaRobustaBlock", "plantmegapack:blocks/bambooFargesiaRobustaBlock1"),	planterColumnGiantTimber("bambooPlanterColumnGiantTimber", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooGiantTimberBlock1", "plantmegapack:blocks/bambooGiantTimberBlock", "plantmegapack:blocks/bambooGiantTimberBlock1"),	planterColumnGolden("bambooPlanterColumnGolden", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooGoldenBlock1", "plantmegapack:blocks/bambooGoldenBlock", "plantmegapack:blocks/bambooGoldenBlock1"),	planterColumnMoso("bambooPlanterColumnMoso", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooMosoBlock1", "plantmegapack:blocks/bambooMosoBlock", "plantmegapack:blocks/bambooMosoBlock1"),	planterColumnShortTassled("bambooPlanterColumnShortTassled", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooShortTassledBlock1", "plantmegapack:blocks/bambooShortTassledBlock", "plantmegapack:blocks/bambooShortTassledBlock1"),	planterColumnTimorBlack("bambooPlanterColumnTimorBlack", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooTimorBlackBlock1", "plantmegapack:blocks/bambooTimorBlackBlock", "plantmegapack:blocks/bambooTimorBlackBlock1"),	planterColumnTropicalBlue("bambooPlanterColumnTropicalBlue", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooTropicalBlueBlock1", "plantmegapack:blocks/bambooTropicalBlueBlock", "plantmegapack:blocks/bambooTropicalBlueBlock1"),	planterColumnWetForest("bambooPlanterColumnWetForest", PMPPlanterType.columnBamboo, "plantmegapack:blocks/bambooWetForestBlock1", "plantmegapack:blocks/bambooWetForestBlock", "plantmegapack:blocks/bambooWetForestBlock1"),	planterColumnAcacia("woodPlanterColumnAcacia", PMPPlanterType.columnWood, "blocks/log_acacia", "blocks/log_acacia", "blocks/planks_acacia"),	planterColumnBirch("woodPlanterColumnBirch", PMPPlanterType.columnWood, "blocks/log_birch", "blocks/log_birch", "blocks/planks_birch"),	planterColumnDarkOak("woodPlanterColumnDarkOak", PMPPlanterType.columnWood, "blocks/log_big_oak", "blocks/log_big_oak", "blocks/planks_big_oak"),	planterColumnJungle("woodPlanterColumnJungle", PMPPlanterType.columnWood, "blocks/log_jungle", "blocks/log_jungle", "blocks/planks_jungle"),	planterColumnOak("woodPlanterColumnOak", PMPPlanterType.columnWood, "blocks/log_oak", "blocks/log_oak", "blocks/planks_oak"),	planterColumnSpruce("woodPlanterColumnSpruce", PMPPlanterType.columnWood, "blocks/log_spruce", "blocks/log_spruce", "blocks/planks_spruce"),	planterColumnFruitwoodGray("woodPlanterColumnFruitwoodGray", PMPPlanterType.columnWood, "plantmegapack:blocks/woodfruitgrayBlock", "plantmegapack:blocks/woodfruitgrayBlock", "plantmegapack:blocks/woodfruitgrayPlanks"),	planterColumnClayWhite("clayPlanterColumnClayWhite", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_white", "blocks/hardened_clay_stained_white", "blocks/hardened_clay_stained_white"),	planterColumnClayOrange("clayPlanterColumnClayOrange", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_orange", "blocks/hardened_clay_stained_orange", "blocks/hardened_clay_stained_orange"),	planterColumnClayMagenta("clayPlanterColumnClayMagenta", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_magenta", "blocks/hardened_clay_stained_magenta", "blocks/hardened_clay_stained_magenta"),	planterColumnClayLightBlue("clayPlanterColumnClayLightBlue", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_light_blue", "blocks/hardened_clay_stained_light_blue", "blocks/hardened_clay_stained_light_blue"),	planterColumnClayYellow("clayPlanterColumnClayYellow", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_yellow", "blocks/hardened_clay_stained_yellow", "blocks/hardened_clay_stained_yellow"),	planterColumnClayLime("clayPlanterColumnClayLime", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_lime", "blocks/hardened_clay_stained_lime", "blocks/hardened_clay_stained_lime"),	planterColumnClayPink("clayPlanterColumnClayPink", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_pink", "blocks/hardened_clay_stained_pink", "blocks/hardened_clay_stained_pink"),	planterColumnClayGray("clayPlanterColumnClayGray", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_gray", "blocks/hardened_clay_stained_gray", "blocks/hardened_clay_stained_gray"),	planterColumnClayLightGray("clayPlanterColumnClayLightGray", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_silver", "blocks/hardened_clay_stained_silver", "blocks/hardened_clay_stained_silver"),	planterColumnClayCyan("clayPlanterColumnClayCyan", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_cyan", "blocks/hardened_clay_stained_cyan", "blocks/hardened_clay_stained_cyan"),	planterColumnClayPurple("clayPlanterColumnClayPurple", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_purple", "blocks/hardened_clay_stained_purple", "blocks/hardened_clay_stained_purple"),	planterColumnClayBlue("clayPlanterColumnClayBlue", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_blue", "blocks/hardened_clay_stained_blue", "blocks/hardened_clay_stained_blue"),	planterColumnClayBrown("clayPlanterColumnClayBrown", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_brown", "blocks/hardened_clay_stained_brown", "blocks/hardened_clay_stained_brown"),	planterColumnClayGreen("clayPlanterColumnClayGreen", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_green", "blocks/hardened_clay_stained_green", "blocks/hardened_clay_stained_green"),	planterColumnClayRed("clayPlanterColumnClayRed", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_red", "blocks/hardened_clay_stained_red", "blocks/hardened_clay_stained_red"),	planterColumnClayBlack("clayPlanterColumnClayBlack", PMPPlanterType.columnClay, "blocks/hardened_clay_stained_black", "blocks/hardened_clay_stained_black", "blocks/hardened_clay_stained_black"),	planterColumnAndesite("stonePlanterColumnAndesite", PMPPlanterType.columnStone, "blocks/stone_andesite", "blocks/stone_andesite", "blocks/stone_andesite"),	planterColumnCobblestone("stonePlanterColumnCobblestone", PMPPlanterType.columnStone, "blocks/cobblestone", "blocks/cobblestone", "blocks/cobblestone"),	planterColumnDiorite("stonePlanterColumnDiorite", PMPPlanterType.columnStone, "blocks/stone_diorite", "blocks/stone_diorite", "blocks/stone_diorite"),	planterColumnGranite("stonePlanterColumnGranite", PMPPlanterType.columnStone, "blocks/stone_granite", "blocks/stone_granite", "blocks/stone_granite"),	planterColumnLapis("stonePlanterColumnLapis", PMPPlanterType.columnStone, "blocks/lapis_block", "blocks/lapis_block", "blocks/lapis_block"),	planterColumnObsidian("stonePlanterColumnObsidian", PMPPlanterType.columnStone, "blocks/obsidian", "blocks/obsidian", "blocks/obsidian"),	planterColumnPrismarine("stonePlanterColumnPrismarine", PMPPlanterType.columnStone, "blocks/prismarine_rough", "blocks/prismarine_rough", "blocks/prismarine_rough"),	planterColumnQuartz("stonePlanterColumnQuartz", PMPPlanterType.columnStone, "blocks/quartz_block_bottom", "blocks/quartz_block_bottom", "blocks/quartz_block_bottom"),	planterColumnRedSandstone("stonePlanterColumnRedSandstone", PMPPlanterType.columnStone, "blocks/red_sandstone_normal", "blocks/red_sandstone_normal", "blocks/red_sandstone_normal"),	planterColumnSandstone("stonePlanterColumnSandstone", PMPPlanterType.columnStone, "blocks/sandstone_normal", "blocks/sandstone_normal", "blocks/sandstone_normal"),	planterColumnStone("stonePlanterColumnStone", PMPPlanterType.columnStone, "blocks/stone", "blocks/stone", "blocks/stone");
	
	public final String oreDictName;
	public final PMPPlanterType planterType;
	public final String textureBottom;
	public final String textureMaterial;
	public final String textureTrim;
	
	private PMPPlanter(String oreDictName, PMPPlanterType planterType, String textureBlock, String textureMaterial, String textureTrim) {
		this.oreDictName = oreDictName;
		this.planterType = planterType;
		this.textureBottom = textureBlock;
		this.textureMaterial = textureMaterial;
		this.textureTrim = textureTrim;
	}
	
	public String getLocalizedName() {
		return I18n.translateToLocal("tile." + name() + ".name");
	}
}