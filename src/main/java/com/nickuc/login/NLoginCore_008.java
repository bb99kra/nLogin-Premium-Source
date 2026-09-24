package com.nickuc.login;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Generated;

public class NLoginCore_008 implements NLoginInterface_029 {
   private final NLoginCore_455 c;
   private final ProxyServer d;

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(DisconnectEvent var1) {
      NLoginCore_420.j.remove(var1.getPlayer());
   }

   @Subscribe(
      order = PostOrder.FIRST
   )
   public void a(LoginEvent var1) {
      Player var2 = var1.getPlayer();
      NLoginCore_420.j.put(var2, NLoginCore_420.b(this.c, this.d, var2));
   }

   @Generated
   public NLoginCore_008(NLoginCore_455 var1, ProxyServer var2) {
      this.c = var1;
      this.d = var2;
   }
}
