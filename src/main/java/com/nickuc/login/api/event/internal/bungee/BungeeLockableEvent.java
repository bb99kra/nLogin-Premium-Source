package com.nickuc.login.api.event.internal.bungee;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.event.LockableEventAction;
import com.nickuc.login.api.event.internal.LockableEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
import net.md_5.bungee.api.plugin.Plugin;

public abstract class BungeeLockableEvent extends BungeeCancellableEvent implements LockableEvent {
   private final AtomicInteger lock = new AtomicInteger();
   private final AtomicBoolean finished = new AtomicBoolean();

   protected BungeeLockableEvent() {
   }

   protected abstract BungeeLockableNewActionEvent<?> createNewActionEvent(Plugin var1, LockableEventAction var2);

   protected abstract void internalCall(int var1);

   public void lock(@Nonnull Plugin owner) {
      if (this.checkConditions(owner)) {
         this.lock.incrementAndGet();
         nLoginAPI.getApi().internal().lockableNewAction(this.createNewActionEvent(owner, LockableEventAction.LOCK));
      }
   }

   public void unlock(@Nonnull Plugin owner) {
      if (this.lock.get() > 0 && this.checkConditions(owner)) {
         this.lock.decrementAndGet();
         nLoginAPI.getApi().internal().lockableNewAction(this.createNewActionEvent(owner, LockableEventAction.UNLOCK));
         this.tryFinish();
      }
   }

   public int count() {
      return this.lock.get();
   }

   @Deprecated
   public byte getLock() {
      return (byte)this.count();
   }

   @Override
   public boolean callEvt() {
      this.internalCall(1);
      this.tryFinish();
      return !this.isCancelled();
   }

   protected void tryFinish() {
      if (this.lock.get() == 0 && !this.finished.getAndSet(true)) {
         this.internalCall(2);
      }
   }

   private boolean checkConditions(Plugin plugin) {
      return !"nLogin".equalsIgnoreCase(plugin.getDescription().getName());
   }
}
