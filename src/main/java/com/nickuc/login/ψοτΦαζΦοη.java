package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class ψοτΦαζΦοη implements ΦοιυξχςΩΦψξΓΣΨ {
   private final αοΛσφψΦε f;
   private static int a = (1 >>> 160 | 1 << ~160 + 1) & -1;

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(PlayerSwapHandItemsEvent var1) {
      if (this.f.a(var1)) {
         var1.setCancelled((boolean)a);
      }
   }

   @Generated
   public ψοτΦαζΦοη(αοΛσφψΦε var1) {
      this.f = var1;
   }
}
