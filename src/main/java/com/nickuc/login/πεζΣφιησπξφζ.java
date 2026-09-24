package com.nickuc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class πεζΣφιησπξφζ extends ΣπΩεΨρωωΔσψβ<PreparedStatement> {
   @Override
   public void close() {
      this.d().close();
      this.e.a(this.b);
   }

   private πεζΣφιησπξφζ(ΨδΨξξοζεΦεςνδς var1, Connection var2, PreparedStatement var3) {
      super(var1, var2, var3, null);
   }
}
