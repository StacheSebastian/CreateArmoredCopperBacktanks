package createab.register;

import createab.register.render.DiamondBacktankRenderer;
import createab.register.render.GoldBacktankRenderer;
import createab.register.render.NetheriteBacktankRenderer;
import createab.register.render.IronBacktankRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ModEvents {

    @Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModBusEvents {

        @SubscribeEvent
        public static void addEntityRendererLayers(EntityRenderersEvent.AddLayers event) {
            EntityRenderDispatcher dispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
            IronBacktankRenderer.registerOnAll(dispatcher);
            GoldBacktankRenderer.registerOnAll(dispatcher);
            DiamondBacktankRenderer.registerOnAll(dispatcher);
            NetheriteBacktankRenderer.registerOnAll(dispatcher);
        }
    }
}
