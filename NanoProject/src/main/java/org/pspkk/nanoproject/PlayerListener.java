package org.pspkk.nanoproject;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.eclipse.sisu.Priority;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        System.out.println("this is called first");
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoinLate(PlayerJoinEvent event){
        System.out.println("this is called late");
    }
}
