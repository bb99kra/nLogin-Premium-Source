package com.nickuc.login;

import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class πφυΨεξβνΛΠψ implements ΦοιυξχςΩΦψξΓΣΨ {
   private final μΛΔθΛτναεαΓ c;
   private final Server e;

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void c(PlayerQuitEvent var1) {
      ΨεηηνμγυΩαγ.b.remove(var1.getPlayer());
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void c(PlayerJoinEvent var1) {
      Player var2 = var1.getPlayer();
      ΨεηηνμγυΩαγ.b.put(var2, ΨεηηνμγυΩαγ.b(this.c, this.e, var2));
   }

   @Generated
   public πφυΨεξβνΛΠψ(μΛΔθΛτναεαΓ var1, Server var2) {
      this.c = var1;
      this.e = var2;
   }
}
