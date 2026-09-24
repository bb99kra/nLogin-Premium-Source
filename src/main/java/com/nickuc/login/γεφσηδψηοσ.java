package com.nickuc.login;

import java.util.Locale;
import java.util.Set;
import lombok.Generated;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class γεφσηδψηοσ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int a = -1610612733 >>> 60 | -1610612733 << -60;
   private static int c = Integer.reverse(0);
   private final String ad;
   private final Set<String> f;
   private static int b = 268435456 >>> 28 | 268435456 << -28;

   @EventHandler(
      priority = EventPriority.LOW
   )
   public void a(PlayerCommandSendEvent var1) {
      var1.getCommands().removeIf(var1x -> {
         var1x = var1x.toLowerCase(Locale.ENGLISH);
         return (boolean)(!var1x.startsWith(this.ad + a) && !this.f.contains(var1x) ? c : b);
      });
   }

   @Generated
   γεφσηδψηοσ(String var1, Set<String> var2) {
      this.ad = var1;
      this.f = var2;
   }
}
