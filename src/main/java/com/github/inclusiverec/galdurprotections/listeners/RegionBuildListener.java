package com.github.inclusiverec.galdurprotections.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashSet;

public class RegionBuildListener {

    public static HashSet<String> builders;

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if(!builders.contains(event.getPlayer().getName())) return;
        // Or else do something.
        return;
    }

    @EventHandler
    public void onLogOut(PlayerQuitEvent event) {
        String name = event.getPlayer().getName();
        if(builders.contains(name)) builders.remove(name);
    }

}
