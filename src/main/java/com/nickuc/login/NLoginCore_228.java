package com.nickuc.login;

import java.sql.Connection;

public abstract class NLoginCore_228<T> extends NLoginCore_218<T> implements AutoCloseable {
   protected final Connection b;
   protected final NLoginCore_459 e;

   private NLoginCore_228(NLoginCore_459 var1, Connection var2, T var3) {
      super(var3, null);
      this.e = var1;
      this.b = var2;
   }
}
