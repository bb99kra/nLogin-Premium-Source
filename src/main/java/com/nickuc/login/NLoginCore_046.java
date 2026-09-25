package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class NLoginCore_046 implements NLoginInterface_027 {
   private final NLoginCore_209 e;
   private static int a = (1073741824 >>> 126 | 1073741824 << -126) & -1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void a(PlayerInteractAtEntityEvent var1) {
      if (this.e.a(var1)) {
         var1.setCancelled((a != 0));
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void b(EntityDamageByEntityEvent var1) {
      if (this.e.a(var1)) {
         var1.setCancelled((b != 0));
      }
   }

   @Generated
   public NLoginCore_046(NLoginCore_209 var1) {
      this.e = var1;
   }
}
