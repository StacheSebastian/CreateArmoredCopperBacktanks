package createab.register;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.ponder.PonderLocalization;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class ModPonder {
    public static void register() {}


    public static void generateLang(CreateRegistrate registrate, GatherDataEvent event) {
        register();
        PonderLocalization.provideRegistrateLang(registrate);
    }
}
