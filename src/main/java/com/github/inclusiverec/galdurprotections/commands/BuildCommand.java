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

            if(args.length==0) return false;

            if(args[0].equalsIgnoreCase("help")) {
                return buildHelp(sender,args);
            }


        }
        return false;
    }

    private boolean buildHelp(CommandSender sender, String[] args) {

        String[] returnMessage;
        returnMessage = new String[0];

        if (args.length==1) {
            returnMessage = new String[3];
            returnMessage[0] = "ProtectGaldur recognises several types of protected area.";
            returnMessage[1] = "Construction is accomplished through the /build command.";
            returnMessage[2] = "Valid subcommands: [new|cancel]";
        }

        else {
            if(args[1].equalsIgnoreCase("new")) {
                returnMessage = new String[4];
                returnMessage[0] = "Use /build new to start construction of a new protected area.";
                returnMessage[1] = "After that, follow chat prompts.  If you make a mistake, the";
                returnMessage[2] = "process will automatically abort.";
                returnMessage[3] = "Type /build cancel at any time to manually abort.";
            }
            if(args[1].equalsIgnoreCase("cancel")) {
                returnMessage = new String[1];
                returnMessage[0] = "/build cancel aborts an active building process.";
            }
        }

        if (returnMessage.length==0) return false;

        for(String s:returnMessage) {
            sender.sendMessage(s);
        }
        return true;
    }
}
