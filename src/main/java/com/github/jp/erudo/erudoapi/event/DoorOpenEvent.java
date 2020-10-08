package com.github.jp.erudo.erudoapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DoorOpenEvent extends Event {

    private Player player;

    private static final HandlerList handlers = new HandlerList();

    public DoorOpenEvent(Player player) {
        this.player = player;
    }


    public Player getPlayer() {
        return player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
