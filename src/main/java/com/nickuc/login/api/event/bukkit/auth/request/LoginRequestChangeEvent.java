package com.nickuc.login.api.event.bukkit.auth.request;

import com.nickuc.login.api.enums.event.LockableEventAction;
import com.nickuc.login.api.event.internal.EventWithPlayer;
import com.nickuc.login.api.event.internal.bukkit.BukkitLockableNewActionEvent;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class LoginRequestChangeEvent extends BukkitLockableNewActionEvent<LoginRequestEvent> implements EventWithPlayer {
   public LoginRequestChangeEvent(LoginRequestEvent loginRequestEvent, Plugin plugin, LockableEventAction action) {
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
