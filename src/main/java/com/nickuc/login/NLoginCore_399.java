package com.nickuc.login;

import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

public class NLoginCore_399 implements NLoginInterface_027 {
   private final NLoginCore_209 a;
   private static int c = (8192 >>> 45 | 8192 << ~45 + 1) & -1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int a = (128 >>> 39 | 128 << ~39 + 1) & -1;

   @Generated
   public NLoginCore_399(NLoginCore_209 var1) {
      this.a = var1;
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(BlockPlaceEvent var1) {
      if (this.a.b(var1.getPlayer())) {
         var1.setCancelled((boolean)a);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(SignChangeEvent var1) {
      if (this.a.b(var1.getPlayer())) {
         var1.setCancelled((boolean)c);
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH,
      ignoreCancelled = true
   )
   public void a(BlockBreakEvent var1) {
      if (this.a.b(var1.getPlayer())) {
         var1.setCancelled((boolean)b);
      }
   }
}
