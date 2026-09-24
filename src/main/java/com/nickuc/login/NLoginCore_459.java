package com.nickuc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.annotation.CheckReturnValue;

public interface NLoginCore_459 {
   @CheckReturnValue
   default NLoginCore_171 a(String var1, Object... var2) {
      Connection var3 = this.a();
      PreparedStatement var4 = null;

      try {
         var4 = var3.prepareStatement(var1);
         this.a(var4, var2);
         ResultSet var5 = var4.executeQuery();
         return new NLoginCore_171(this, var3, var4, var5, null);
      } catch (SQLException var6) {
         if (var4 != null) {
            var4.close();
         }

         this.a(var3);
         throw var6;
      }
   }

   default NLoginCore_218<Integer> b(String var1, Object... var2) {
      Connection var3 = this.a();

      NLoginCore_218 var5;
      try {
         PreparedStatement var4 = var3.prepareStatement(var1);

         try {
            this.a(var4, var2);
            var5 = new NLoginCore_218(var4.executeUpdate(), null);
         } catch (Throwable var12) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         this.a(var3);
      }

      return var5;
   }

   @CheckReturnValue
   default NLoginCore_365 a() {
      return new NLoginCore_365(this, this.a(), null);
   }

   default void a(String var1, Object... var2) {
      Connection var3 = this.a();

      try {
         PreparedStatement var4 = var3.prepareStatement(var1);

         try {
            this.a(var4, var2);
            var4.execute();
         } catch (Throwable var12) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         this.a(var3);
      }
   }

   Connection a();

   default void a(PreparedStatement var1, Object[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         Object var4 = var2[var3];
         if (var4 instanceof String) {
            var1.setString(var3 + 1, (String)var4);
         } else if (var4 instanceof Long) {
            var1.setLong(var3 + 1, (Long)var4);
         } else if (var4 instanceof Integer) {
            var1.setInt(var3 + 1, (Integer)var4);
         } else if (var4 instanceof Timestamp) {
            var1.setTimestamp(var3 + 1, (Timestamp)var4);
         } else if (var4 instanceof byte[]) {
            var1.setBytes(var3 + 1, (byte[])var4);
         } else {
            var1.setObject(var3 + 1, var4);
         }
      }
   }

   void c();

   @CheckReturnValue
   default NLoginCore_288 a(String var1, Object... var2) {
      Connection var3 = this.a();
      PreparedStatement var4 = null;

      try {
         var4 = var3.prepareStatement(var1);
         this.a(var4, var2);
         return new NLoginCore_288(this, var3, var4, null);
      } catch (SQLException var6) {
         if (var4 != null) {
            var4.close();
         }

         this.a(var3);
         throw var6;
      }
   }

   NLoginCore_036 a();

   default NLoginCore_218<Boolean> a(String var1, Object... var2) {
      Connection var3 = this.a();

      NLoginCore_218 var5;
      try {
         PreparedStatement var4 = var3.prepareStatement(var1);

         try {
            this.a(var4, var2);
            var5 = new NLoginCore_218(var4.execute(), null);
         } catch (Throwable var12) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         this.a(var3);
      }

      return var5;
   }

   void a(Connection var1);
}
