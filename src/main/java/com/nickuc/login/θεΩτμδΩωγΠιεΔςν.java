package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class θεΩτμδΩωγΠιεΔςν implements ΦοιυξχςΩΦψξΓΣΨ {
   private final αοΛσφψΦε e;
   private static int a = (1073741824 >>> 126 | 1073741824 << -126) & -1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void a(PlayerInteractAtEntityEvent var1) {
      if (this.e.a(var1)) {
         var1.setCancelled((boolean)a);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void b(EntityDamageByEntityEvent var1) {
      if (this.e.a(var1)) {
         var1.setCancelled((boolean)b);
      }
   }

   @Generated
   public θεΩτμδΩωγΠιεΔςν(αοΛσφψΦε var1) {
      this.e = var1;
   }
}
