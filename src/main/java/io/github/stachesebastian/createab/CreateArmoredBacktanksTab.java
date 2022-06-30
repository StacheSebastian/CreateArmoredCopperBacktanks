package io.github.stachesebastian.createab;

import com.simibubi.create.AllItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreateArmoredBacktanksTab extends CreativeModeTab {
    public CreateArmoredBacktanksTab()
    {
        super ("createabtab");
    }

    @Override
    public ItemStack makeIcon() {
        return AllItems.COPPER_BACKTANK.asStack();
    }
}
