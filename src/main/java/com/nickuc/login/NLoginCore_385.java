package com.nickuc.login;

import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_385 implements NLoginInterface_027 {
   private final NLoginCore_089 c;
   private final Server e;

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void c(PlayerQuitEvent var1) {
      NLoginCore_577.b.remove(var1.getPlayer());
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void c(PlayerJoinEvent var1) {
      Player var2 = var1.getPlayer();
      NLoginCore_577.b.put(var2, NLoginCore_577.b(this.c, this.e, var2));
   }

   @Generated
   public NLoginCore_385(NLoginCore_089 var1, Server var2) {
      this.c = var1;
      this.e = var2;
   }
}
