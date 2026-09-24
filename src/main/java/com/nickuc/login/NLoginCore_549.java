package com.nickuc.login;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public class NLoginCore_549 implements Closeable {
   private InputStreamReader a;
   private BufferedReader a;
   private InputStream a;

   @Nullable
   public String ah() {
      return this.a.readLine();
   }

   @Override
   public void close() {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

      if (this.a != null) {
         this.a.close();
         this.a = null;
      }
   }

   NLoginCore_549(InputStream var1, Charset var2) {
      this.a = var1;
      this.a = new InputStreamReader(var1, var2);
      this.a = new BufferedReader(this.a);
   }
}
