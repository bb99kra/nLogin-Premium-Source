package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.nio.charset.StandardCharsets;

public interface θαΩΦνυψγ {
   static byte[] a(JSONObject var0, boolean var1) {
      byte[] var2 = πελπφβυψεσαωοΦ.a(var1x -> var1x.a(var0.toString().getBytes(StandardCharsets.UTF_8)));
      return a(var2, var1);
   }

   boolean a(ΨαχΨχΣλεΠψΦ var1, γΦΠυρρρπη var2, Object var3, byte[] var4);

   void b(Object var1);

   default boolean a(γΦΠυρρρπη var1, Object var2, byte[] var3) {
      return this.a(null, var1, var2, var3);
   }

   static byte[] a(byte[] var0) {
      boolean var1 = var0[0] == 1;
      byte[] var2 = new byte[var0.length - 1];
      System.arraycopy(var0, 1, var2, 0, var2.length);
      if (var1) {
         var2 = χοαγΓΣΓθψΠυχΓεΨ.c(var2);
      }

      return var2;
   }

   static byte[] a(byte[] var0, boolean var1) {
      byte[] var2;
      if (var1) {
         byte[] var3 = χοαγΓΣΓθψΠυχΓεΨ.b(var0);
         var2 = new byte[1 + var3.length];
         var2[0] = 1;
         System.arraycopy(var3, 0, var2, 1, var3.length);
      } else {
         var2 = new byte[1 + var0.length];
         var2[0] = 0;
         System.arraycopy(var0, 0, var2, 1, var0.length);
      }

      return var2;
   }

   void c(Object var1);

   static JSONObject a(byte[] var0) {
      byte[] var1 = a(var0);
      String var2 = new String(var1, StandardCharsets.UTF_8);
      return new JSONObject(var2);
   }

   void a(Object var1, Object var2);
}
