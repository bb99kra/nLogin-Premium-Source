package com.nickuc.login.api.event.velocity.auth;

import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.velocitypowered.api.proxy.Player;
import lombok.Generated;

public class AuthenticateEvent implements EventWithPlayer {
   private final Player player;

   public AuthenticateEvent(Player player) {
      this.player = player;
   }

   public Player getPlayer() {
      return this.player;
   }

   @Generated
   @Override
   public String toString() {
      return "AuthenticateEvent(player=" + this.getPlayer() + ")";
   }
}
