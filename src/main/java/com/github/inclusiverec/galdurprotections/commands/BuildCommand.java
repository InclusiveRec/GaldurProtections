package com.github.inclusiverec.galdurprotections.commands;

import com.github.inclusiverec.galdurprotections.GaldurProtections;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class BuildCommand implements CommandExecutor {

    public GaldurProtections plugin;

    public BuildCommand(GaldurProtections plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(command.getName().equalsIgnoreCase("build")) {
            if(sender instanceof ConsoleCommandSender) sender.sendMessage("You are typing on the console.");
            else sender.sendMessage("You are in-game.");
            return false;
        }
        return false;
    }
}
