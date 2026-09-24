package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityAirChangeEvent;

public class ξφςηβςΦΓθβφεμα implements ΦοιυξχςΩΦψξΓΣΨ {
   private final αοΛσφψΦε d;
   private static int a = (256 >>> 40 | 256 << ~40 + 1) & -1;

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityAirChangeEvent var1) {
      if (this.d.a(var1)) {
         var1.setCancelled((boolean)a);
      }
   }

   @Generated
   public ξφςηβςΦΓθβφεμα(αοΛσφψΦε var1) {
      this.d = var1;
   }
}
