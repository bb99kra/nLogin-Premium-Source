package com.nickuc.login;

import java.sql.Connection;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Generated;

public class ΓθαΣαζζζ implements ΨδΨξξοζεΦεςνδς {
   private static int a = Integer.reverse(0);
   private final int r;
   private static int b = 16 >>> 100 | 16 << ~100 + 1;
   private final AtomicInteger a = new AtomicInteger();
   private final ΨδΨξξοζεΦεςνδς c;
   private final Connection a;

   @Generated
   public int c() {
      return this.r;
   }

   @Override
   public Connection a() {
      if (this.a.getAndIncrement() >= this.r) {
         this.a.set(b);
         this.a.commit();
      }

      return this.a;
   }

   @Override
   public void a(Connection var1) {
      if (this.a.get() > 0) {
         var1.commit();
      }
   }

   public ΓθαΣαζζζ(ΨδΨξξοζεΦεςνδς var1, int var2) {
      this.c = var1;
      this.r = var2;
      this.a = var1.a();
      this.a.setAutoCommit((boolean)a);
   }

   @Override
   public ρΣππμζθμπνοΣ a() {
      return this.c.a();
   }

   @Override
   public void c() {
      if (this.a.get() > 0) {
         this.a.commit();
      }

      this.a.close();
   }
}
