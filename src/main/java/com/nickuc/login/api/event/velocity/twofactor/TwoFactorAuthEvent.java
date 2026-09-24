package com.nickuc.login.api.event.velocity.twofactor;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.velocitypowered.api.proxy.Player;
import lombok.Generated;

public class TwoFactorAuthEvent implements EventWithPlayer {
   private final TwoFactorType type;
   private final Player player;
   private final String account;

   public TwoFactorAuthEvent(TwoFactorType type, Player player, String account) {
      this.type = type;
      this.player = player;
      this.account = account;
   }

   public TwoFactorType getType() {
      return this.type;
   }

   public Player getPlayer() {
      return this.player;
   }

   public String getAccount() {
      return this.account;
   }

   @Generated
   @Override
   public String toString() {
      return "TwoFactorAuthEvent(type=" + this.getType() + ", player=" + this.getPlayer() + ", account=" + this.getAccount() + ")";
   }
}
