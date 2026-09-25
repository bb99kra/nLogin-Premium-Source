package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityAirChangeEvent;

public class NLoginCore_025 implements NLoginInterface_027 {
   private final NLoginCore_209 d;
   private static int a = (256 >>> 40 | 256 << ~40 + 1) & -1;

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityAirChangeEvent var1) {
      if (this.d.a(var1)) {
         var1.setCancelled((a != 0));
      }
   }

   @Generated
   public NLoginCore_025(NLoginCore_209 var1) {
      this.d = var1;
   }
}
