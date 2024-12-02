package org.pspkk.nanoproject;

import org.bukkit.plugin.java.JavaPlugin;

public final class NanoProject extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("@NanoProject has been enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info("@NanoProject has been disabled!");
    }
}
