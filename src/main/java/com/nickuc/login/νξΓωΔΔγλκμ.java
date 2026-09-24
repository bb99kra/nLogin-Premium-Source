package com.nickuc.login;

import java.sql.Connection;
import lombok.Generated;

public class νξΓωΔΔγλκμ implements AutoCloseable {
   protected final ΨδΨξξοζεΦεςνδς f;
   private final Connection c;

   @Override
   public void close() {
      this.f.a(this.c);
   }

   @Generated
   private νξΓωΔΔγλκμ(ΨδΨξξοζεΦεςνδς var1, Connection var2) {
      this.f = var1;
      this.c = var2;
   }

   public Connection b() {
      return this.c;
   }
}
