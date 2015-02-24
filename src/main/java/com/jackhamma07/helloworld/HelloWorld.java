package com.jackhamma07.helloworld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = "HelloWorld", name = "Hello World", version = "1.7.2-1.0")
public class HelloWorld {

    //Define our custom item
    public static Item LapisSword;

    // The instance of your mod that Forge will use
    @Mod.Instance("HelloWorld")
    public static HelloWorld instance;

    //This is the pre-init phase of loading your mod by Forge
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //pre init stuff

        //Tell forge about our Item
        LapisSword = new LapisSword(); //create an instance of the item
        GameRegistry.registerItem(LapisSword, "LapisSword"); //register the item in Minecraft
    }

    //This is the init phase of loading your mod by Forge
    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        //init stuff here
    }

    //This is the post init phase of loading your mod by Forge
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //post init stuff here
    }

}
