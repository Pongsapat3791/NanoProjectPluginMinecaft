package org.pspkk.nanoproject;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class NanoProject extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("@NanoProject has been enabled!");
        getServer().getPluginManager().registerEvents(new PlayerListener(),this);
        getServer().getPluginManager().registerEvents(new EntityListener(),this);
        getCommand("ZB").setExecutor(new NanoCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("@NanoProject has been disabled!");

    }

    public static NanoProject getInstance() {
        return getPlugin(NanoProject.class);
    }
}
