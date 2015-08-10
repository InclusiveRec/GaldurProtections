package com.github.inclusiverec.protectgaldur.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashSet;

public class BuildListener implements Listener {

    public static HashSet<String> builders;

    public BuildListener() {
        builders = new HashSet<String>();
    }

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
