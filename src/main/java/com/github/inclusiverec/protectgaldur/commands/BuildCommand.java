package com.github.inclusiverec.protectgaldur.commands;

import com.github.inclusiverec.protectgaldur.ProtectGaldur;
import com.github.inclusiverec.protectgaldur.geometry.AreaType;
import com.github.inclusiverec.protectgaldur.listeners.BuildListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuildCommand implements CommandExecutor {

    public ProtectGaldur plugin;

    public BuildCommand(ProtectGaldur plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(command.getName().equalsIgnoreCase("build")) {

            if(args.length==0) return false;

            if(args[0].equalsIgnoreCase("help")) {
                return buildHelp(sender,args);
            }

            if(args[0].equalsIgnoreCase("new")) {

                // No console access at this time.
            /*    if(!(sender instanceof Player)) {
                    sender.sendMessage("You can only build areas from in-game.");
                    return true;
                }
*/
                // Already building
                if(BuildListener.builders.contains(sender.getName())) {
                    sender.sendMessage("You are already building an area!");
                    sender.sendMessage("Use /build cancel to exit building mode, or /build erase to start over.");
                    return true;
                }

                // Wrong number of arguments.
                if (args.length < 3) return buildHelp(sender,args);


                // Find type
                AreaType type = AreaType.valueOf(args[1]);
                if(type==null) {
                    sender.sendMessage("Incorrect type.");
                    sender.sendMessage("Valid types are:");
                    return true;
                }


            }


        }
        return false;
    }

    private void startBuilding(Player builder, String[] args) {

        if(args.length!=3) {
            buildHelp(builder,args);
            return;
        }

        if(BuildListener.builders.contains(builder.getName())) {

        }



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
                returnMessage[0] = "Usage: /build new <area type> <area id>";
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
