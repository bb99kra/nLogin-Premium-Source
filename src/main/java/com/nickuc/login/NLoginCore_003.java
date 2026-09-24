package com.nickuc.login;

import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.event.EventHandler;

public class NLoginCore_003 implements NLoginInterface_046 {
   private final NLoginCore_383 c;
   private final ProxyServer d;

   @Generated
   public NLoginCore_003(NLoginCore_383 var1, ProxyServer var2) {
      this.c = var1;
      this.d = var2;
   }

   @EventHandler(
      priority = -128
   )
   public void a(PostLoginEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      NLoginCore_230.c.put(var2, NLoginCore_230.b(this.c, this.d, var2));
   }

   @EventHandler(
      priority = 127
   )
   public void a(PlayerDisconnectEvent var1) {
      NLoginCore_230.c.remove(var1.getPlayer());
   }
}
