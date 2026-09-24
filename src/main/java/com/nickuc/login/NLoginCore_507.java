package com.nickuc.login;

import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_507 implements NLoginInterface_027 {
   private final NLoginCore_089 b;
   private final Server d;

   @Generated
   public NLoginCore_507(NLoginCore_089 var1, Server var2) {
      this.b = var1;
      this.d = var2;
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void c(PlayerLoginEvent var1) {
      Player var2 = var1.getPlayer();
      NLoginCore_577.b.put(var2, NLoginCore_577.b(this.b, this.d, var2));
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void c(PlayerQuitEvent var1) {
      NLoginCore_577.b.remove(var1.getPlayer());
   }
}
