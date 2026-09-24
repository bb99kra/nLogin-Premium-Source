package com.nickuc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NLoginCore_171 extends NLoginCore_228<ResultSet> {
   private final PreparedStatement a;

   private NLoginCore_171(NLoginCore_459 var1, Connection var2, PreparedStatement var3, ResultSet var4) {
      super(var1, var2, var4, null);
      this.a = var3;
   }

   @Override
   public void close() {
      this.d().close();
      this.a.close();
      this.e.a(this.b);
   }
}
