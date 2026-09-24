package com.nickuc.login;

import lombok.Generated;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;

public class NLoginCore_513 implements NLoginInterface_006 {
   private final ProxyServer b;
   private static int d = 1024 >>> 202 | 1024 << ~202 + 1;
   private static int c = (-1140850688 >>> 218 | -1140850688 << -218) & -1;
   private final CommandSender a;
   private static int a = 4096 >>> 235 | 4096 << ~235 + 1;
   private static int b = Integer.reverse(0);

   @Override
   public void l(String var1) {
      if (var1.length() >= a && var1.charAt(b) == c) {
         var1 = var1.substring(d);
      }

      this.b.getPluginManager().dispatchCommand(this.a, var1);
   }

   public static NLoginCore_513 a(ProxyServer var0, CommandSender var1) {
      return new NLoginCore_513(var0, var1);
   }

   @Override
   public String getName() {
      return this.a.getName();
   }

   @Generated
   private NLoginCore_513(ProxyServer var1, CommandSender var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public boolean i(String var1) {
      return this.a.hasPermission(var1);
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public void k(String var1) {
      this.a.sendMessage(TextComponent.fromLegacyText(var1));
   }
}
