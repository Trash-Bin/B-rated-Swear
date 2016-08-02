package io.github.bswearteam.bswear;

import java.util.List;

//Bukkit API
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

//BSwear Classes
import io.github.bswearteam.bswear.Main;

/**
 *
 * @Author TheBSwearTeam
 */
public class Advertising implements Listener {

   public final Permission ADVERTISING_PERM = new Permission("bswear.advertising.bypass");
   
   @EventHandler
   public void OnChatAdvertising(AsyncPlayerChatEvent event) {
      Player player = event.getPlayer();
      if (!player.hasPermission(ADVERTISING_PERM)) {
         String msg = event.getMessage().toLowerCase().replaceAll("[-_*. ]", "");
         String swearer = player.getName();
         //String prefix = config.getString("prefix");
         //String advert = config.getStringList("advertising");
         if (msg.contains(".com")) {
            player.sendMessage("No Advertising");
         }
      }
   }
}