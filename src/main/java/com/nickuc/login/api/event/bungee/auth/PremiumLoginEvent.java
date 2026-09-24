package com.nickuc.login.api.event.bungee.auth;

import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.nickuc.login.api.event.internal.bungee.BungeeEvent;
import lombok.Generated;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class PremiumLoginEvent extends BungeeEvent implements EventWithPlayer {
   private final ProxiedPlayer player;

   public PremiumLoginEvent(ProxiedPlayer player) {
      this.player = player;
   }

   public ProxiedPlayer getPlayer() {
      return this.player;
   }

   @Generated
   @Override
   public String toString() {
      return "PremiumLoginEvent(player=" + this.getPlayer() + ")";
   }
}
