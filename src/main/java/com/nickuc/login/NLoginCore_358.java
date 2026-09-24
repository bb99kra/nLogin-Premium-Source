package com.nickuc.login;

import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;

public class NLoginCore_358 implements NLoginInterface_006 {
   private final ConsoleCommandSender a;
   private static int b = (0 >>> 179 | 0 << ~179 + 1) & -1;
   private static int a = 256 >>> 39 | 256 << -39;
   private final Server b;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int c = (12032 >>> 40 | 12032 << -40) & -1;

   @Override
   public void l(String var1) {
      if (var1.length() >= a && var1.charAt(b) == c) {
         var1 = var1.substring(d);
      }

      if (this.b.isPrimaryThread()) {
         this.b.dispatchCommand(this.a, var1);
      } else {
         String var2 = var1;
         NLoginCore_012.a(() -> this.b.dispatchCommand(this.a, var2));
      }
   }

   @Override
   public boolean i(String var1) {
      return this.a.hasPermission(var1);
   }

   @Override
   public void k(String var1) {
      this.a.sendMessage(var1);
   }

   public static NLoginInterface_006 a(Server var0, ConsoleCommandSender var1) {
      return (NLoginInterface_006)(var1 != null ? new NLoginCore_358(var0, var1) : NLoginCore_015.a);
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public String getName() {
      return this.a.getName();
   }

   @Generated
   private NLoginCore_358(Server var1, ConsoleCommandSender var2) {
      this.b = var1;
      this.a = var2;
   }
}
