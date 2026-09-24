package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.net.InetAddress;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class NLoginCore_554 implements NLoginInterface_027 {
   private final nLoginBukkit k;

   @Generated
   public NLoginCore_554(nLoginBukkit var1) {
      this.k = var1;
   }

   @EventHandler(
      priority = EventPriority.LOWEST
   )
   public void b(AsyncPlayerPreLoginEvent var1) {
      if (var1.getLoginResult() == Result.ALLOWED) {
         InetAddress var2 = var1.getAddress();

         InetAddress var3;
         try {
            var3 = var1.getRawAddress();
         } catch (NoSuchMethodError var5) {
            var3 = null;
         }

         com.nickuc.login.bukkit.BukkitHelper_001 var4 = com.nickuc.login.bukkit.BukkitHelper_001.a(var1.getName(), var2, var3);
         if (var4 != null && var4.a != null) {
            var4.a.run();
         }
      }
   }
}
