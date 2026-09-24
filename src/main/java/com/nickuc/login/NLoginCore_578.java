package com.nickuc.login;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class NLoginCore_578 {
   private volatile CountDownLatch b;
   private final List<NLoginInterface_048> l = new ArrayList<>();

   public void c(NLoginInterface_048 var1) {
      synchronized (this.l) {
         this.l.remove(var1);
         if (this.b != null) {
            this.b.countDown();
         }
      }
   }

   public void b(NLoginInterface_048 var1) {
      synchronized (this.l) {
         this.l.add(var1);
      }
   }

   public List<NLoginInterface_048> e() {
      synchronized (this.l) {
         return NLoginCore_135.a(this.l);
      }
   }

   public boolean a(long var1, TimeUnit var3) {
      synchronized (this.l) {
         if (this.b == null) {
            this.b = new CountDownLatch(this.l.size());
         }
      }

      boolean var7 = this.b.await(var1, var3);
      this.b = null;
      return var7;
   }
}
