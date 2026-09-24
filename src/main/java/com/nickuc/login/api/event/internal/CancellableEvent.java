package com.nickuc.login.api.event.internal;

public interface CancellableEvent {
   boolean isCancelled();

   void setCancelled(boolean var1);
}
