package com.nickuc.login.api.event.velocity.auth.request;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.event.LockableEventAction;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.nickuc.login.api.event.internal.velocity.VelocityLockableEvent;
import com.velocitypowered.api.proxy.Player;
import lombok.Generated;

public class LoginRequestEvent extends VelocityLockableEvent implements EventWithPlayer {
   private final Player player;

   public LoginRequestEvent(Player player) {
      this.player = player;
   }

   protected LoginRequestChangeEvent createNewActionEvent(Object owner, LockableEventAction action) {
      return new LoginRequestChangeEvent(this, owner, action);
   }

   @Override
   protected void internalCall(int id) {
      nLoginAPI.getApi().internal().lockableEvent(this, (byte)0, (byte)id);
   }

   public Player getPlayer() {
      return this.player;
   }

   @Generated
   @Override
   public String toString() {
      return "LoginRequestEvent(player=" + this.getPlayer() + ")";
   }
}
