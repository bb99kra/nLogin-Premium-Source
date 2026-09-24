package com.nickuc.login;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Generated;

public class ζθχζνΓζςδζθαΩ implements ωΩΩαομοΣψΩ {
   private final νεΓτεκΓηζεΔλιΩ c;
   private final ProxyServer d;

   @Subscribe(
      order = PostOrder.LAST
   )
   public void a(DisconnectEvent var1) {
      ξοφψβΔδξΦπυδ.j.remove(var1.getPlayer());
   }

   @Subscribe(
      order = PostOrder.FIRST
   )
   public void a(LoginEvent var1) {
      Player var2 = var1.getPlayer();
      ξοφψβΔδξΦπυδ.j.put(var2, ξοφψβΔδξΦπυδ.b(this.c, this.d, var2));
   }

   @Generated
   public ζθχζνΓζςδζθαΩ(νεΓτεκΓηζεΔλιΩ var1, ProxyServer var2) {
      this.c = var1;
      this.d = var2;
   }
}
