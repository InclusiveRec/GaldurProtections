package com.github.inclusiverec.galdurprotections;
import com.github.inclusiverec.galdurprotections.commands.BuildCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class GaldurProtections extends JavaPlugin {

	
	public GaldurProtections plugin;
	
    @Override
    public void onEnable() {
        registerCommands();
        loadConfiguration();
        return;
    }

    @Override
    public void onDisable() {
        return;
    }

    public void registerCommands() {
        getCommand("build").setExecutor(new BuildCommand(this));
    }
    
    public void loadConfiguration() {
		plugin.getConfig().options().copyDefaults(true);
		plugin.saveConfig();
	}

}
