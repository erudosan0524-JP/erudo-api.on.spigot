package com.github.jp.erudo.erudoapi.event.listeners;

import com.github.jp.erudo.erudoapi.Main;
import com.github.jp.erudo.erudoapi.event.DoorEvent;
import com.github.jp.erudo.erudoapi.utils.Doors;
import org.bukkit.Bukkit;
import org.bukkit.block.data.type.Door;
import org.bukkit.block.data.type.TrapDoor;
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
            if (Doors.doors.contains(e.getClickedBlock().getType())) {
                Door door = (Door) e.getClickedBlock().getState().getBlockData();

                if (door.isOpen()) {
                    DoorEvent event = new DoorEvent(e.getPlayer(),true);
                    Bukkit.getServer().getPluginManager().callEvent(event);
                } else {
                    DoorEvent event = new DoorEvent(e.getPlayer(),false);
                    Bukkit.getServer().getPluginManager().callEvent(event);
                }
            }

            if (Doors.trap_doors.contains(e.getClickedBlock().getType())) {
                TrapDoor trap_door = (TrapDoor) e.getClickedBlock().getState().getBlockData();

                if(trap_door.isOpen()) {
                    DoorEvent event = new DoorEvent(e.getPlayer(),true);
                    Bukkit.getServer().getPluginManager().callEvent(event);
                } else {
                    DoorEvent event = new DoorEvent(e.getPlayer(), false);
                    Bukkit.getServer().getPluginManager().callEvent(event);
                }
            }
        }
    }

    @EventHandler
    public void onDoor(DoorEvent e) {
        if (e.isOpen()) {
            e.getPlayer().sendMessage("Door is opened");
        } else {
            e.getPlayer().sendMessage("door is closed");
        }
    }
}
