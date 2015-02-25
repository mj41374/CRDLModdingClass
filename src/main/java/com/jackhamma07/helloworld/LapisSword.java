package com.jackhamma07.helloworld;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class LapisSword extends ItemSword {

        public LapisSword(String unlocalizedName, ToolMaterial material) {
            super(material);
            this.setUnlocalizedName(unlocalizedName);
            this.maxStackSize = 1;
            this.setMaxDamage(20);
            this.setCreativeTab(CreativeTabs.tabMisc);

        }


}
