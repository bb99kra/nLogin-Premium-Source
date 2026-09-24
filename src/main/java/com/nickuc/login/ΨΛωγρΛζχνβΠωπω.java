package com.nickuc.login;

import java.sql.Connection;
import lombok.Generated;

public class ΨΛωγρΛζχνβΠωπω implements ΨδΨξξοζεΦεςνδς {
   private final τπχωρμσκμΓασ a;
   private final ρΣππμζθμπνοΣ h;

   @Override
   public void c() {
      this.a.c();
   }

   @Override
   public void a(Connection var1) {
      var1.close();
   }

   @Override
   public ρΣππμζθμπνοΣ a() {
      return this.h;
   }

   @Generated
   private ΨΛωγρΛζχνβΠωπω(ρΣππμζθμπνοΣ var1, τπχωρμσκμΓασ var2) {
      this.h = var1;
      this.a = var2;
   }

   @Override
   public Connection a() {
      return this.a.d();
   }
}
