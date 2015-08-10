package com.github.inclusiverec.protectgaldur;
import com.github.inclusiverec.protectgaldur.commands.BuildCommand;
import com.github.inclusiverec.protectgaldur.listeners.BuildListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ProtectGaldur extends JavaPlugin {

    @Override
    public void onEnable() {
        setupCommands();
        setupListeners();
    }

    @Override
    public void onDisable() {
        return;
    }

    public void setupCommands() {
        getCommand("build").setExecutor(new BuildCommand(this));
    }

    public void setupListeners() {
        getServer().getPluginManager().registerEvents(new BuildListener(),this);
    }

}
