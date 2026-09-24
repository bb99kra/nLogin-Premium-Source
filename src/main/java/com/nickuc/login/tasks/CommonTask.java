package com.nickuc.login.tasks;

import lombok.Generated;

public abstract class CommonTask implements Runnable {
   private final Runnable e;

   @Generated
   public CommonTask(Runnable var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      this.e.run();
   }
}
