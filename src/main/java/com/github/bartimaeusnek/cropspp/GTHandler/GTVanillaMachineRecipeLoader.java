package com.github.bartimaeusnek.cropspp.GTHandler;

import com.github.bartimaeusnek.cropspp.fluids.CppFluids;
import com.github.bartimaeusnek.cropspp.items.CppItems;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

public class GTVanillaMachineRecipeLoader implements Runnable {
	
	
	public GTVanillaMachineRecipeLoader() {
		super();
	}
	
	@Override
	public void run() {
		
		//Space Modifier = Space Plant (Tier13, Naquadah plant +1 tier)
		//Magic Modifier = Primordial Pearl,
		
		//StonePlant
		GT_Values.RA.addCompressorRecipe(Materials.Marble.getDust(9), Materials.Marble.getBlocks(1), 300, 2);// Materials.Marble.getPlates(1), 300, 2);
		GT_Values.RA.addCompressorRecipe(Materials.GraniteRed.getDust(1), Materials.GraniteRed.getPlates(1), 300, 2);
		GT_Values.RA.addCompressorRecipe(Materials.GraniteBlack.getDust(1), Materials.GraniteBlack.getPlates(1), 300, 2);
		GT_Values.RA.addCompressorRecipe(Materials.Stone.getPlates(9), new ItemStack(Blocks.stone), 300, 2);
		GT_Values.RA.addCompressorRecipe(Materials.GraniteRed.getPlates(9), new ItemStack(GregTech_API.sBlockGranites, 1, 8), 300, 2);
		GT_Values.RA.addCompressorRecipe(Materials.GraniteBlack.getPlates(9), new ItemStack(GregTech_API.sBlockGranites), 300, 2);
		
		
		//honey related
		GT_Values.RA.addCentrifugeRecipe(GT_Utility.getIntegratedCircuit(9), GT_Values.NI, new FluidStack(FluidRegistry.getFluid("for.honey"), 1000), GT_Values.NF, new ItemStack(Items.sugar, 9, 0), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Values.NI, new int[]{10000}, 1020, 8);
		GT_Values.RA.addFermentingRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.Mash, 10), new FluidStack(CppFluids.Wash, 8), 1000, false);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.Korn, 1000), new FluidStack[]{Materials.Ethanol.getFluid(320L), Materials.Water.getFluid(680L)}, GT_Values.NI, 80, 180);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.DKorn, 1000), new FluidStack[]{Materials.Ethanol.getFluid(380L), Materials.Water.getFluid(620L)}, GT_Values.NI, 80, 180);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.SWhine, 1000), new FluidStack[]{Materials.Ethanol.getFluid(700L), Materials.Water.getFluid(300L)}, GT_Values.NI, 80, 180);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.GHP, 1000), new FluidStack[]{Materials.Ethanol.getFluid(750L), Materials.Water.getFluid(250L)}, GT_Values.NI, 80, 180);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.jagi, 1000), new FluidStack[]{Materials.Ethanol.getFluid(350L), Materials.Water.getFluid(650L)}, GT_Values.NI, 80, 180);
		GT_Values.RA.addDistillationTowerRecipe(new FluidStack(CppFluids.njagi, 1000), new FluidStack[]{Materials.Ethanol.getFluid(350L), Materials.Water.getFluid(650L)}, GT_Values.NI, 80, 180);

		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.Korn, 100), Materials.Ethanol.getFluid(25L), 16, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(2), new FluidStack(CppFluids.Korn, 100), Materials.Water.getFluid(68L), 16, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.DKorn, 100), Materials.Ethanol.getFluid(30L), 16, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(2), new FluidStack(CppFluids.DKorn, 100), Materials.Water.getFluid(62L), 16, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.FWheat, 80), new FluidStack(CppFluids.Korn, 1), 22, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(4), new FluidStack(CppFluids.FWheat, 200), new FluidStack(FluidRegistry.getFluid("fermentedbiomass"), 3), 28, 64, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(5), new FluidStack(CppFluids.FWheat, 1000), Materials.Ethanol.getFluid(4L), 220, 120, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.FReed, 100), new FluidStack(CppFluids.SWhine, 7), 22, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(4), new FluidStack(CppFluids.FReed, 200), new FluidStack(FluidRegistry.getFluid("fermentedbiomass"), 4), 24, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(5), new FluidStack(CppFluids.FReed, 1000), Materials.Ethanol.getFluid(5L), 220, 120, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(4), new FluidStack(CppFluids.Mash, 200), new FluidStack(FluidRegistry.getFluid("biomass"), 4), 24, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(1), new FluidStack(CppFluids.Wash, 100), new FluidStack(CppFluids.GHP, 6), 22, 24, false);
		GT_Values.RA.addDistilleryRecipe(GT_Utility.getIntegratedCircuit(4), new FluidStack(CppFluids.Wash, 100), new FluidStack(FluidRegistry.getFluid("fermentedbiomass"), 14), 24, 24, false);
		
		GT_Values.RA.addMixerRecipe(Materials.Osmiridium.getDustTiny(1), ItemList.Crop_Drop_Lemon.get(64), CppItems.ModifierMagic.splitStack(8), CppItems.ModifierSpace.splitStack(9), new FluidStack(CppFluids.njagi, 8000), new FluidStack(CppFluids.jagi, 250), GT_Values.NI, 1, 1920);
		
		
		//Brewery
		if (OreDictionary.getOres("listAllberry").size() >= 1)
			for (int i = 0; i < OreDictionary.getOres("listAllberry").size(); i++)
				GT_Values.RA.addBrewingRecipe(OreDictionary.getOres("listAllberry").get(i).splitStack(16), Materials.Water.getFluid(1000L).getFluid(), CppFluids.Mash, false);
		//GT_Values.RA.addBrewingRecipe(new ItemStack(BppItems.BppBerries,1,1), Materials.Water.getFluid(1000L).getFluid(), FluidRegistry.getFluid("potion.reedwater"), false);
		
		
		//Sugar Related
		GT_Values.RA.addExtractorRecipe(new ItemStack(CppItems.CppBerries, 1, 1), new ItemStack(Items.sugar, 8, 0), 160, 8);
		
		//Dyes from Plants
		for (int i = 0; i < OreDictionary.getOres("cropBlackberry").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropBlackberry").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblack"), 288), new ItemStack(Items.sugar), 600, 48);
		for (int i = 0; i < OreDictionary.getOres("cropBlueberry").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropBlueberry").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeblue"), 288), new ItemStack(Items.sugar), 600, 48);
		for (int i = 0; i < OreDictionary.getOres("cropRaspberry").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropRaspberry").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyepink"), 288), new ItemStack(Items.sugar), 600, 48);
		for (int i = 0; i < OreDictionary.getOres("cropVine").size(); i++) {
			if (!OreDictionary.getOres("cropVine").get(i).getUnlocalizedName().equals("tile.Thornvines"))
				GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropVine").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyegreen"), 288), GT_Values.NI, 600, 48);
			else
				GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropVine").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeyellow"), 288), GT_Values.NI, 600, 48);
		}
		for (int i = 0; i < OreDictionary.getOres("cropCacti").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropCacti").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyegreen"), 288), GT_Values.NI, 600, 48);
		for (int i = 0; i < OreDictionary.getOres("cropGooseberry").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropGooseberry").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyeyellow"), 288), new ItemStack(Items.sugar), 600, 48);
		for (int i = 0; i < OreDictionary.getOres("cropStrawberry").size(); i++)
			GT_Values.RA.addChemicalRecipe(OreDictionary.getOres("cropStrawberry").get(i).splitStack(16), Materials.Salt.getDust(2), Materials.SulfuricAcid.getFluid(432L), new FluidStack(FluidRegistry.getFluid("dye.chemical.dyered"), 288), new ItemStack(Items.sugar), 600, 48);
		
		//Goldfish
		GT_Values.RA.addFluidExtractionRecipe(CppItems.GoldfischS, new ItemStack(Items.gold_nugget), Materials.FishOil.getFluid(100L), 1, 16, 8);
		GT_Values.RA.addPulveriserRecipe(CppItems.GoldfischS, new ItemStack[]{Materials.MeatRaw.getDust(1), Materials.Gold.getDustTiny(1)}, new int[]{10000, 100}, 3, 8, false);
		
		//Space Modifier
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Iron.getDust(1), new ItemStack(CppItems.Modifier, 16, 0)}, new FluidStack[]{Materials.UUMatter.getFluid(Materials.MeteoricIron.getNeutrons() + Materials.MeteoricIron.getProtons())}, new FluidStack[]{}, new ItemStack[]{Materials.MeteoricIron.getDust(1)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Steel.getDust(1), new ItemStack(CppItems.Modifier, 16, 0)}, new FluidStack[]{Materials.UUMatter.getFluid(Materials.MeteoricSteel.getNeutrons() + Materials.MeteoricSteel.getProtons())}, new FluidStack[]{}, new ItemStack[]{Materials.MeteoricSteel.getDust(1)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Bismuth.getDust(1), new ItemStack(CppItems.Modifier, 16, 0)}, new FluidStack[]{Materials.UUMatter.getFluid(Materials.Orichalcum.getNeutrons() + Materials.Orichalcum.getProtons())}, new FluidStack[]{}, new ItemStack[]{Materials.Orichalcum.getDust(1)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Titanium.getDust(1), new ItemStack(CppItems.Modifier, 16, 0)}, new FluidStack[]{Materials.UUMatter.getFluid(Materials.Desh.getNeutrons() + Materials.Desh.getProtons())}, new FluidStack[]{}, new ItemStack[]{Materials.Desh.getDust(1)}, 240, 480);
		//NON-ELEMENTAR
		//UV
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.MeteoricIron.getDust(1), new ItemStack(CppItems.Modifier, 64, 0)}, new FluidStack[]{Materials.UUMatter.getFluid((Materials.Neutronium.getNeutrons() + Materials.Neutronium.getProtons()))}, new FluidStack[]{}, new ItemStack[]{Materials.DeepIron.getDust(1)}, 120, 500000);
		//IV
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Lead.getDust(1), new ItemStack(CppItems.Modifier, 16, 0)}, new FluidStack[]{Materials.UUMatter.getFluid((Materials.Water.getProtons() + Materials.Water.getNeutrons()) * 10)}, new FluidStack[]{}, new ItemStack[]{Materials.Ledox.getDust(1)}, 240, 7680);
		
		//Trophy
		GT_Values.RA.addExtruderRecipe(Materials.Neutronium.getBlocks(64), Materials.Neutronium.getBlocks(64), CppItems.Trophy, 2147483647, 8);
		GT_Values.RA.addFluidExtractionRecipe(new ItemStack(CppItems.Modifier, 1, 0), GT_Values.NI, Materials.UUMatter.getFluid(2L), 5000, 128, 4);
		
		//Chem Refine
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_ModHandler.getModItem("GalacticraftCore", "item.meteoricIronRaw", 1L, 0)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{Materials.MeteoricIron.getDust(4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_ModHandler.getModItem("GalacticraftMars", "item.null", 1L, 0)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{Materials.Desh.getDust(4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.MeteoricIron), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.MeteoricIron), 4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.Desh), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.Desh), 4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.Oriharukon), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.Oriharukon), 4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.Ledox), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.Ledox), 4)}, 240, 480);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.BlackPlutonium), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.BlackPlutonium), 4)}, 240, 30720);
		GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{new ItemStack(CppItems.Modifier, 9, 0), GT_OreDictUnificator.get(OrePrefixes.crushed.get(Materials.DeepIron), 1)}, new FluidStack[]{Materials.Water.getFluid(1000L)}, new FluidStack[]{}, new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.crushedPurified.get(Materials.DeepIron), 4)}, 240, 30720);
		
		
	}
	
}
