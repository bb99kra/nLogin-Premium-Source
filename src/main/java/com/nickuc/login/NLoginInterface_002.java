package com.nickuc.login;

import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface NLoginInterface_002<K> {
   @Nullable
   default List<?> b(K var1) {
      return this.d((K)var1);
   }

   default long a(K var1, long var2) {
      Object var4 = this.b((K)var1, var2);
      return var4 instanceof Long ? (Long)var4 : Long.parseLong(var4.toString());
   }

   default int a(K var1) {
      Object var2 = this.e((K)var1);
      if (var2 instanceof Integer) {
         return (Integer)var2;
      } else {
         return var2 != null ? Integer.parseInt(var2.toString()) : 0;
      }
   }

   default long b(K var1) {
      Object var2 = this.e((K)var1);
      if (var2 instanceof Long) {
         return (Long)var2;
      } else {
         return var2 != null ? Long.parseLong(var2.toString()) : 0L;
      }
   }

   @Nullable
   default <T> T d(K var1) {
      Object var2 = this.e((K)var1);

      try {
         return (T)var2;
      } catch (Throwable var4) {
         throw new RuntimeException(
            NLoginCore_559.B("ĒļĲŅņôĸķŊŌùĿœĿłŎœŉŐŐďĄŐŋŠĈ", (byte)40, 66)
               + var1
               + (var2 != null ? NLoginCore_397.F("Ԑԅ՜ՈՔ՞ՏԋՏՙՏբգԑ", (byte)40, 70) + var2.getClass().getCanonicalName() : ""),
            var4
         );
      }
   }

   @Nonnull
   default List<Integer> c(K var1, List<Integer> var2) {
      return this.a((K)var1, var2);
   }

   @Nullable
   Object a(K var1);

   @Nonnull
   default <T> T a(K var1, T var2) {
      Object var3 = this.b((K)var1, var2);

      try {
         return (T)var3;
      } catch (Throwable var5) {
         throw new RuntimeException(
            NLoginCore_384.E("ԙՃԹՌՍӻԿԾՑՓԀՆ՚ՆՉՕ՚Ր\u0557\u0557Ԗԋ\u0557Ւէԏ", (byte)26, 69)
               + var1
               + (var3 != null ? NLoginCore_241.C("ЯФѻѧѳѽѮЪѮѸѮҁ҂а", (byte)26, 67) + var3.getClass().getCanonicalName() : ""),
            var5
         );
      }
   }

   @Nullable
   default List<String> a(K var1) {
      return this.d((K)var1);
   }

   default int a(K var1, int var2) {
      Object var3 = this.b((K)var1, var2);
      return var3 instanceof Integer ? (Integer)var3 : Integer.parseInt(var3.toString());
   }

   default boolean a(K var1, boolean var2) {
      Object var3 = this.b((K)var1, var2);
      return var3 instanceof Boolean ? (Boolean)var3 : Boolean.parseBoolean(var3.toString());
   }

   @Nonnull
   default Object b(K var1, Object var2) {
      if (var2 == null) {
         throw new IllegalArgumentException(NLoginCore_453.A("ķřśŗŬŤŭĚűŝũųŤĠŤţűŲŴźħŪŮĪŹƁŹźİ", (byte)58, 65));
      } else {
         Object var3 = this.e((K)var1);
         return var3 != null ? var3 : var2;
      }
   }

   @Nonnull
   default List<?> b(K var1, List<?> var2) {
      return this.a((K)var1, var2);
   }

   @Nullable
   default Object e(K var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(NLoginCore_387.E("ԭՈ՝ԅՉՈՖ\u0557ՙ՟ԌՏՓԏ՞զ՞՟ԕ", (byte)38, 69));
      } else {
         return this.c((K)var1) ? this.a((K)var1) : null;
      }
   }

   default short a(K var1, short var2) {
      Object var3 = this.b((K)var1, var2);
      return var3 instanceof Short ? (Short)var3 : Short.parseShort(var3.toString());
   }

   default boolean d(K var1) {
      Object var2 = this.e((K)var1);
      return var2 instanceof Boolean ? (Boolean)var2 : var2 != null && Boolean.parseBoolean(var2.toString());
   }

   default String b(K var1) {
      Object var2 = this.e((K)var1);
      return var2 != null ? var2.toString() : null;
   }

   @Nonnull
   default <T> T c(K var1) {
      Object var2 = this.e((K)var1);
      if (var2 == null) {
         throw new IllegalStateException(NLoginCore_004.D("ҙҴӉѱ", (byte)51, 68) + var1 + NLoginCore_241.E("ԏ՞ՠզԓ՚դիե՜Ԛ", (byte)51, 69));
      } else {
         try {
            return (T)var2;
         } catch (Throwable var4) {
            throw new RuntimeException(
               NLoginCore_138.E("Բ՜ՒեզԔ\u0558\u0557ժլԙ՟ճ՟բծճթհհԯԤհիրԨ", (byte)51, 69)
                  + var1
                  + (var2 != null ? NLoginCore_241.A("đĆŝŉŕşŐČŐŚŐţŤĒ", (byte)51, 65) + var2.getClass().getCanonicalName() : ""),
               var4
            );
         }
      }
   }

   @Nullable
   default List<Integer> c(K var1) {
      return this.d((K)var1);
   }

   boolean c(K var1);

   default double a(K var1) {
      Object var2 = this.e((K)var1);
      if (var2 instanceof Double) {
         return (Double)var2;
      } else {
         return var2 != null ? Double.parseDouble(var2.toString()) : 0.0;
      }
   }

   @Nonnull
   default List<String> a(K var1, List<String> var2) {
      return this.a((K)var1, var2);
   }

   default double a(K var1, double var2) {
      Object var4 = this.b((K)var1, var2);
      return var4 instanceof Double ? (Double)var4 : Double.parseDouble(var4.toString());
   }

   default short a(K var1) {
      Object var2 = this.e((K)var1);
      if (var2 instanceof Short) {
         return (Short)var2;
      } else {
         return var2 != null ? Short.parseShort(var2.toString()) : 0;
      }
   }

   @Nonnull
   default String a(K var1, String var2) {
      Object var3 = this.b((K)var1, var2);
      return var3.toString();
   }
}
