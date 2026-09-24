package com.nickuc.login;

import java.sql.Connection;
import lombok.Generated;

public class NLoginCore_365 implements AutoCloseable {
   protected final NLoginCore_459 f;
   private final Connection c;

   @Override
   public void close() {
      this.f.a(this.c);
   }

   @Generated
   private NLoginCore_365(NLoginCore_459 var1, Connection var2) {
      this.f = var1;
      this.c = var2;
   }

   public Connection b() {
      return this.c;
   }
}
