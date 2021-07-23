package pers.deckdes.plugins.explosiveentitycleaner;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tntconsole implements CommandExecutor {
    public final ExplosiveEntityCleaner plugin;

    public tntconsole(ExplosiveEntityCleaner plugin){
        this.plugin=plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
if (command.getName().equalsIgnoreCase("tnt")){
    if(!(sender instanceof Player)) {
        sender.sendMessage(ChatColor.DARK_AQUA + "[ExplosiveEntityCleaner]:只能是玩家输入这个指令！");
        return false;
    }else {
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(ChatColor.LIGHT_PURPLE + "[ExplosiveEntityCleaner]:need help? /tnt help");

            return true;
        }
        if (args[0].equalsIgnoreCase("help")){
            player.sendMessage(ChatColor.YELLOW+"+----------[ExplosiveEntityCleaner]----------+");
            player.sendMessage(ChatColor.YELLOW+"|             /tnt open          打开插件                   |");
            player.sendMessage(ChatColor.YELLOW+"|             /tnt close         关闭插件                   |");
            player.sendMessage(ChatColor.YELLOW+"+----------[ExplosiveEntityCleaner]----------+");
    }
        if (args[0].equalsIgnoreCase("open")) {
            TNT.tnt = true;
            player.sendMessage(ChatColor.RED + "[ExplosiveEntityCleaner]:TNT清除已开启");
        }
        if (args[0].equalsIgnoreCase("close")) {
            TNT.tnt = false;
            player.sendMessage(ChatColor.RED + "[ExplosiveEntityCleaner]:TNT清除已关闭");
        }
      }
          }return false;
    }
}