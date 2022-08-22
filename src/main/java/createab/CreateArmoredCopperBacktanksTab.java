package createab;

import com.simibubi.create.AllItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreateArmoredCopperBacktanksTab extends CreativeModeTab {
    public CreateArmoredCopperBacktanksTab()
    {
        super ("createabtab");
    }

    @Override
    public ItemStack makeIcon() {
        return AllItems.COPPER_BACKTANK.asStack();
    }
}
