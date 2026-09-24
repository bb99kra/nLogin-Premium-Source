package com.nickuc.login;

import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Generated;

public class NLoginCore_170 implements NLoginInterface_020 {
   private final Logger a;

   @Override
   public void b(String var1, Throwable var2) {
      this.a.log(Level.SEVERE, var1, var2);
   }

   @Override
   public void q(String var1) {
      this.a.info(var1);
   }

   @Generated
   public NLoginCore_170(Logger var1) {
      this.a = var1;
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public void a(String var1, Throwable var2) {
      this.a.log(Level.WARNING, var1, var2);
   }

   @Override
   public void s(String var1) {
      this.a.severe(var1);
   }

   @Override
   public void r(String var1) {
      this.a.warning(var1);
   }
}
