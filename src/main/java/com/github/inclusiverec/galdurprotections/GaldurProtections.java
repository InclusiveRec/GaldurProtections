package com.github.inclusiverec.galdurprotections;
import com.github.inclusiverec.galdurprotections.commands.BuildCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class GaldurProtections extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        return;
    }

    @Override
    public void onDisable() {
        return;
    }

    public void registerCommands() {
        getCommand("build").setExecutor(new BuildCommand(this));
    }

}
