package com.nickuc.login;

import java.util.ArrayList;
import java.util.List;

public interface λρζηΓζςφζ {
   default double c() {
      return this.a(this.a());
   }

   default short a(κξυΔχιυψΓ var1) {
      return this.<Short>b(var1);
   }

   default short a() {
      return this.a(this.a());
   }

   default Object a(λρζηΓζςφζ var1, Object var2) {
      return var2;
   }

   default List<Integer> i() {
      return this.c(this.a());
   }

   default long a(κξυΔχιυψΓ var1) {
      return this.<Long>b(var1);
   }

   default List<?> b(κξυΔχιυψΓ var1) {
      return new ArrayList(this.a(var1));
   }

   default List<Integer> c(κξυΔχιυψΓ var1) {
      return this.b(var1);
   }

   default String a(Object... var1) {
      return this.a(this.a(), var1);
   }

   ΛγαρωΠΠπδςπΛξτ a();

   κξυΔχιυψΓ a();

   default List<Integer> j() {
      return this.d(this.a());
   }

   default int a(κξυΔχιυψΓ var1) {
      return this.<Integer>b(var1);
   }

   default List<String> b(Object... var1) {
      return this.b(this.a(), var1);
   }

   default int r() {
      return this.a(this.a());
   }

   default List<?> h() {
      return this.b(this.a());
   }

   default List<String> a(κξυΔχιυψΓ var1, Object... var2) {
      List var3 = this.b(var1);
      if (var2 != null && var2.length > 0) {
         String[] var4 = var3.toArray(new String[0]);
         boolean var5 = false;

         for (int var6 = 0; var6 < var4.length; var6++) {
            String var7 = var4[var6];
            String var8 = βιχγΓλχΠσπ.a(var7, var2);
            if (!var5 && !var7.equals(var8)) {
               var5 = true;
            }

            var4[var6] = var8;
         }

         if (var5) {
            return ηζησΠΠωΓργπ.a(var4);
         }
      }

      return var3;
   }

   default long g() {
      return this.a(this.a());
   }

   default boolean ar() {
      return this.a(this.a());
   }

   default Object f() {
      return this.a(this.a());
   }

   default List<?> a(κξυΔχιυψΓ var1) {
      return this.b(var1);
   }

   default List<Integer> d(κξυΔχιυψΓ var1) {
      return new ArrayList<>(this.c(var1));
   }

   default double a(κξυΔχιυψΓ var1) {
      return this.<Double>b(var1);
   }

   int a();

   default <T> T g() {
      return this.b(this.a());
   }

   default List<String> b(κξυΔχιυψΓ var1, Object... var2) {
      return new ArrayList<>(this.a(var1, var2));
   }

   Object a();

   default boolean a(κξυΔχιυψΓ var1) {
      return this.<Boolean>b(var1);
   }

   default List<String> a(Object... var1) {
      return this.a(this.a(), var1);
   }

   default <T> T b(κξυΔχιυψΓ var1) {
      Object var2 = οΣνδΠξΓςηλ.a(this, var1);
      if (var2 == null) {
         var2 = this.a();
         if (var2 == null) {
            throw new IllegalArgumentException(ιΠοθΩΦξκ.D("қҽҿһӐӈӑѾӕӁӍӗӈ҄ӈӇӕӖӘӞҋӎӒҎӝӥӝӞҔ", (byte)54, 68));
         }
      }

      try {
         return (T)var2;
      } catch (Throwable var4) {
         throw new RuntimeException(ςΦζσμτΓσ.C("ҬӆҺҼӇӁѽӒӎҀӄӃӖӘ҅", (byte)54, 67) + this + πψυκΠΨμΛΩβΣφμφσ.E("Ԓէգԕը՜թծ՟ծհբբԟմպղըԥ", (byte)54, 69), var4);
      }
   }

   default Object a(κξυΔχιυψΓ var1) {
      return this.b(var1);
   }

   default List<?> g() {
      return this.a(this.a());
   }

   default String a(κξυΔχιυψΓ var1, Object... var2) {
      return βιχγΓλχΠσπ.a(this.b(var1), var2);
   }
}
