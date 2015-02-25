package com.jackhamma07.helloworld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.ShapedOreRecipe;

@Mod(modid = "HelloWorld", name = "Hello World", version = "1.7.2-1.0")
public class HelloWorld {

    // The instance of your mod that Forge will use
    @Mod.Instance("HelloWorld")
    public static HelloWorld instance;

    //Define a custom material
    //addToolMaterial(CUSTOMMATERIALNAME, harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
    public static Item.ToolMaterial SWORD = EnumHelper.addToolMaterial("SWORD", 0, 10, 0, 20, 22);
    //Assign it to our sword object
    public static final ItemSword LapisSword = new LapisSword("LapisSword", SWORD);

    //This is the pre-init phase of loading your mod by Forge
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //pre init stuff

        GameRegistry.registerItem(LapisSword, "LapisSword"); //register the item in Minecraft
        LapisSword.setTextureName("HelloWorld" + ":" + "LapisSword");
    }

    //This is the init phase of loading your mod by Forge
    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        //init stuff here

        //Now create the shaped-crafting recipe for the LapisSword:


        //ShapedOre Version that utilizes Forge's Ore Dictionary! Makes it compatible with other Mods!!
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(HelloWorld.LapisSword), " l ", " l ", " s ", "stickWood"));
        //Ore Dictionary located at: http://www.minecraftforge.net/wiki/Common_Oredict_names
        //this.setDamage(new ItemStack(LapisSword),100);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(LapisSword), "ool", "edo", "seo", 'l', "gemLapis", 'd', "gemDiamond", 'e', "gemEmerald", 's', "stickWood", 'o', new ItemStack(Blocks.obsidian)));
    }

    //This is the post init phase of loading your mod by Forge
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //post init stuff here
    }

}
