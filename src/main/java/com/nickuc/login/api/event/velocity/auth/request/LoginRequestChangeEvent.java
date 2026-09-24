package com.nickuc.login.api.event.velocity.auth.request;

import com.nickuc.login.api.enums.event.LockableEventAction;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.nickuc.login.api.event.internal.velocity.VelocityLockableNewActionEvent;
import com.velocitypowered.api.proxy.Player;
import lombok.Generated;

public class LoginRequestChangeEvent extends VelocityLockableNewActionEvent<LoginRequestEvent> implements EventWithPlayer {
   public LoginRequestChangeEvent(LoginRequestEvent loginRequestEvent, Object plugin, LockableEventAction action) {
      super(loginRequestEvent, plugin, action);
   }

   public LoginRequestEvent getLoginRequestEvent() {
      return this.getEvent();
   }

   public Player getPlayer() {
      return this.getLoginRequestEvent().getPlayer();
   }

   @Generated
   @Override
   public String toString() {
      return "LoginRequestChangeEvent()";
   }
}
