package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class NLoginCore_011 implements NLoginInterface_027 {
   private final nLoginBukkit f;
   private static int a = (1073741824 >>> 126 | 1073741824 << ~126 + 1) & -1;

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(AsyncPlayerChatEvent var1) {
      NLoginCore_277 var2 = this.f.b().a(var1.getPlayer());
      if (this.f.a().b().a(var2, var1.getMessage())) {
         var1.setCancelled((boolean)a);
      }
   }

   @Generated
   public NLoginCore_011(nLoginBukkit var1) {
      this.f = var1;
   }
}
