package com.nickuc.login;

import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;
import lombok.Generated;

public class Πρπμαθδθρυθ implements ΨδΨξξοζεΦεςνδς {
   private final ρΣππμζθμπνοΣ i;
   private final Driver a;
   private final String av;
   private final Properties a;

   @Override
   public ρΣππμζθμπνοΣ a() {
      return this.i;
   }

   @Override
   public void c() {
   }

   @Override
   public void a(Connection var1) {
      var1.close();
   }

   @Override
   public Connection a() {
      return this.a.connect(this.av, this.a);
   }

   @Generated
   private Πρπμαθδθρυθ(ρΣππμζθμπνοΣ var1, Driver var2, String var3, Properties var4) {
      this.i = var1;
      this.a = var2;
      this.av = var3;
      this.a = var4;
   }
}
