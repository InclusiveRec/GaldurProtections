package com.github.inclusiverec.galdurprotections.areas;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;

import java.util.List;

public interface Area {

    public String getName();
    public boolean containsLocation(Location location);
    public List<OfflinePlayer> getResidents();
    
}
