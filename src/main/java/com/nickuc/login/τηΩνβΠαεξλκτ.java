package com.nickuc.login;

import java.sql.Connection;
import lombok.Generated;

public abstract class τηΩνβΠαεξλκτ implements ΨδΨξξοζεΦεςνδς {
   private Connection a;

   @Override
   public void a(Connection var1) {
   }

   @Override
   public synchronized Connection a() {
      if (this.a == null || this.a.isClosed()) {
         this.a = this.c();
      }

      return this.a;
   }

   @Generated
   protected τηΩνβΠαεξλκτ() {
   }

   protected abstract Connection c();

   @Override
   public synchronized void c() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }
}
