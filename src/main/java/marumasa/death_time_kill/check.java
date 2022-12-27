package marumasa.death_time_kill;

import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitRunnable;

public class check extends BukkitRunnable {

    private final LivingEntity entry;

    public check(LivingEntity entity) {
        entry = entity;
    }

    @Override
    public void run() {
        if (entry.getHealth() == 0) entry.remove();
        this.cancel();
    }
}
