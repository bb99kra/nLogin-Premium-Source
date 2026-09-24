package com.nickuc.login;

import lombok.Generated;
import org.apache.logging.log4j.Logger;

public class NLoginCore_040 implements NLoginInterface_020 {
   private final Logger a;

   @Override
   public void r(String var1) {
      this.a.warn(var1);
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public void s(String var1) {
      this.a.error(var1);
   }

   @Override
   public void a(String var1, Throwable var2) {
      this.a.warn(var1, var2);
   }

   @Generated
   public NLoginCore_040(Logger var1) {
      this.a = var1;
   }

   @Override
   public void b(String var1, Throwable var2) {
      this.a.error(var1, var2);
   }

   @Override
   public void q(String var1) {
      this.a.info(var1);
   }
}
