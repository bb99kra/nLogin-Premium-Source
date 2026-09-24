package com.nickuc.login;

import lombok.Generated;
import org.slf4j.Logger;

public class ΠφψΨΣΠνΛΠ implements ΠζΣΨαΩψοηιηΓΓ {
   private final Logger b;

   @Override
   public void a(String var1, Throwable var2) {
      this.b.warn(var1, var2);
   }

   @Override
   public void r(String var1) {
      this.b.warn(var1);
   }

   @Override
   public void s(String var1) {
      this.b.error(var1);
   }

   @Override
   public <T> T c() {
      return (T)this.b;
   }

   @Override
   public void b(String var1, Throwable var2) {
      this.b.error(var1, var2);
   }

   @Generated
   public ΠφψΨΣΠνΛΠ(Logger var1) {
      this.b = var1;
   }

   @Override
   public void q(String var1) {
      this.b.info(var1);
   }
}
