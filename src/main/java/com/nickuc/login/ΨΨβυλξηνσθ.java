package com.nickuc.login;

import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.event.EventHandler;

public class ΨΨβυλξηνσθ implements χιςζΓθωφρο {
   private final πργηπνπτΨζξσΓΓ c;
   private final ProxyServer d;

   @Generated
   public ΨΨβυλξηνσθ(πργηπνπτΨζξσΓΓ var1, ProxyServer var2) {
      this.c = var1;
      this.d = var2;
   }

   @EventHandler(
      priority = -128
   )
   public void a(PostLoginEvent var1) {
      ProxiedPlayer var2 = var1.getPlayer();
      ΓκυξρχλγθρςΦ.c.put(var2, ΓκυξρχλγθρςΦ.b(this.c, this.d, var2));
   }

   @EventHandler(
      priority = 127
   )
   public void a(PlayerDisconnectEvent var1) {
      ΓκυξρχλγθρςΦ.c.remove(var1.getPlayer());
   }
}
