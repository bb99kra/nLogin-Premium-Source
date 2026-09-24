package com.nickuc.login;

import java.sql.Connection;
import lombok.Generated;

public class NLoginCore_484 implements NLoginCore_459 {
   private final NLoginCore_269 a;
   private final NLoginCore_036 h;

   @Override
   public void c() {
      this.a.c();
   }

   @Override
   public void a(Connection var1) {
      var1.close();
   }

   @Override
   public NLoginCore_036 a() {
      return this.h;
   }

   @Generated
   private NLoginCore_484(NLoginCore_036 var1, NLoginCore_269 var2) {
      this.h = var1;
      this.a = var2;
   }

   @Override
   public Connection a() {
      return this.a.d();
   }
}
