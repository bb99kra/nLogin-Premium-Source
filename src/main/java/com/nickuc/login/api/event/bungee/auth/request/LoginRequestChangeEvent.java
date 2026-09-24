package com.nickuc.login.api.event.bungee.auth.request;

import com.nickuc.login.api.enums.event.LockableEventAction;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.nickuc.login.api.event.internal.bungee.BungeeLockableNewActionEvent;
import lombok.Generated;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;

public class LoginRequestChangeEvent extends BungeeLockableNewActionEvent<LoginRequestEvent> implements EventWithPlayer {
   public LoginRequestChangeEvent(LoginRequestEvent loginRequestEvent, Plugin plugin, LockableEventAction action) {
      super(loginRequestEvent, plugin, action);
   }

   public LoginRequestEvent getLoginRequestEvent() {
      return this.getEvent();
   }

   public ProxiedPlayer getPlayer() {
      return this.getLoginRequestEvent().getPlayer();
   }

   @Generated
   @Override
   public String toString() {
      return "LoginRequestChangeEvent()";
   }
}
