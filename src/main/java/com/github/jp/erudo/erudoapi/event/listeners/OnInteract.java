package com.github.jp.erudo.erudoapi.event.listeners;

import com.github.jp.erudo.erudoapi.Main;
import com.github.jp.erudo.erudoapi.event.DoorOpenEvent;
import com.github.jp.erudo.erudoapi.utils.Doors;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnInteract implements Listener {

    public OnInteract(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this,plugin);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            //Call DoorOpenEvent
            if (Doors.doors.contains(e.getClickedBlock().getType())) {
                DoorOpenEvent event = new DoorOpenEvent(e.getPlayer());
                Bukkit.getServer().getPluginManager().callEvent(event);
            }
        }


    }
}
