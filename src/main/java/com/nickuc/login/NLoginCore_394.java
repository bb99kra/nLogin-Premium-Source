package com.nickuc.login;

import io.github.waterfallmc.waterfall.event.ProxyDefineCommandsEvent;
import java.util.Locale;
import java.util.Set;
import lombok.Generated;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_394 implements NLoginInterface_046 {
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private final Set<String> l;
   private static int a = Integer.reverse(1543503872);
   private final String aq;

   @Generated
   NLoginCore_394(String var1, Set<String> var2) {
      this.aq = var1;
      this.l = var2;
   }

   @EventHandler(
      priority = -32
   )
   public void a(ProxyDefineCommandsEvent var1) {
      if (var1.getReceiver() instanceof ProxiedPlayer) {
         var1.getCommands().values().removeIf(var1x -> {
            String var2 = var1x.getName().toLowerCase(Locale.ENGLISH);
            return (boolean)(!var2.startsWith(this.aq + a) && !this.l.contains(var2) ? c : b);
         });
      }
   }
}
