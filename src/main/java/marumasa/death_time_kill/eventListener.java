package marumasa.death_time_kill;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class eventListener implements Listener {

    private final minecraft mc;

    public eventListener(minecraft minecraft) {
        mc = minecraft;
    }

    @EventHandler
    public void onSpawn(EntitySpawnEvent event) {
        final Entity Entity = event.getEntity();
        if (Entity instanceof LivingEntity LivingEntity)
            new check(LivingEntity).runTaskLater(mc, 60L);
    }

    @EventHandler
    public void onDeath(EntityDeathEvent event) {
        final LivingEntity Entity = event.getEntity();
        new check(Entity).runTaskLater(mc, 60L);
    }
}
