package com.nickuc.login;

import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ΩξβΦυνΛαΔ implements ΦοιυξχςΩΦψξΓΣΨ {
   private final μΛΔθΛτναεαΓ b;
   private final Server d;

   @Generated
   public ΩξβΦυνΛαΔ(μΛΔθΛτναεαΓ var1, Server var2) {
      this.b = var1;
      this.d = var2;
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void c(PlayerLoginEvent var1) {
      Player var2 = var1.getPlayer();
      ΨεηηνμγυΩαγ.b.put(var2, ΨεηηνμγυΩαγ.b(this.b, this.d, var2));
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void c(PlayerQuitEvent var1) {
      ΨεηηνμγυΩαγ.b.remove(var1.getPlayer());
   }
}
