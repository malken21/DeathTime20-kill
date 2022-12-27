package marumasa.death_time_kill;

import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new eventListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
