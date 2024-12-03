package org.pspkk.nanoproject;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class EntityListener implements Listener {
    @EventHandler
    public void  onEntityRightClick(PlayerInteractEntityEvent event) {
        System.out.println("Right clicked: "+ event.getRightClicked().getClass());

        if(event.getHand() != EquipmentSlot.HAND)
            return;

        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();

        if (entity instanceof Cow && entity.hasMetadata("NanoProject") && player.getItemInHand().getType() == Material.BUCKET) {
            Cow cow = (Cow) entity;

            cow.getWorld().createExplosion(cow.getLocation(), 2.5F);
        }

        if (event.getRightClicked().getType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getRightClicked();

            zombie.getWorld().createExplosion(zombie.getLocation(), 10F);
        }

    }
}
