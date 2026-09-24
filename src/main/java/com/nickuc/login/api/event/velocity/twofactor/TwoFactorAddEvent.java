package com.nickuc.login.api.event.velocity.twofactor;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.velocitypowered.api.proxy.Player;
import java.util.UUID;
import javax.annotation.Nullable;
import lombok.Generated;

public class TwoFactorAddEvent implements EventWithPlayer {
   private final TwoFactorType type;
   private final Player player;
   private final UUID playerId;
   private final String playerName;
   private final String account;

   public TwoFactorAddEvent(TwoFactorType type, Player player, UUID playerId, String playerName, String account) {
      this.type = type;
      this.player = player;
      this.playerId = playerId;
      this.playerName = playerName;
      this.account = account;
   }

   public TwoFactorType getType() {
      return this.type;
   }

   @Nullable
   public Player getPlayer() {
      return this.player;
   }

   public UUID getPlayerId() {
      return this.playerId;
   }

   public String getPlayerName() {
      return this.playerName;
   }

   public String getAccount() {
      return this.account;
   }

   @Generated
   @Override
   public String toString() {
      return "TwoFactorAddEvent(type="
         + this.getType()
         + ", player="
         + this.getPlayer()
         + ", playerId="
         + this.getPlayerId()
         + ", playerName="
         + this.getPlayerName()
         + ", account="
         + this.getAccount()
         + ")";
   }
}
