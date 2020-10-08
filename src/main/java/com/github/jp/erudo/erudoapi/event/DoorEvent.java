package com.github.jp.erudo.erudoapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DoorEvent extends Event {

    private Player player;
    private boolean open;

    private static final HandlerList handlers = new HandlerList();

    public DoorEvent(Player player, boolean open) {
        this.player = player;
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }


    public Player getPlayer() {
        return player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
