package me.accountzero.morecraft;

import me.accountzero.morecraft.events.CustomMobs;
import org.bukkit.plugin.java.JavaPlugin;

public final class Morecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CustomMobs(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
