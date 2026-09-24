package com.nickuc.login;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Generated;

public abstract class NLoginCore_353 {
   private final boolean w;
   private final String p;
   protected NLoginCore_055 a;
   private final boolean x;
   private static int a = 16 >>> 4 | 16 << -4;
   private final List<String> b;
   protected final NLoginCore_466 l = NLoginCore_466.b;
   private final String o;
   private static int b = Integer.reverse(0);
   protected NLoginType_008 a;

   protected boolean j() {
      return (boolean)(this.a != NLoginCore_055.c && this.a != NLoginCore_055.s ? b : a);
   }

   public void a(NLoginInterface_042 var1, String[] var2) {
      this.a = var1 instanceof NLoginCore_277 ? this.a.a().b((NLoginCore_277)var1).a() : NLoginCore_150.c();
      this.b(var1, var2);
   }

   protected List<String> c(NLoginInterface_042 var1, String var2, String[] var3) {
      return null;
   }

   @Generated
   public NLoginType_008 b() {
      return this.a;
   }

   @Generated
   public boolean o() {
      return this.x;
   }

   protected abstract void b(NLoginInterface_042 var1, String[] var2);

   @Generated
   public NLoginCore_466 a() {
      return this.l;
   }

   @Generated
   public boolean n() {
      return this.w;
   }

   public NLoginCore_353(NLoginType_008 var1, String var2, String var3, boolean var4, boolean var5, String... var6) {
      this.a = var1;
      this.o = var2;
      this.p = var3;
      this.w = var4;
      this.x = var5;
      this.b = var6.length == 0 ? Collections.emptyList() : Arrays.asList(var6);
   }

   @Generated
   public String f() {
      return this.p;
   }

   @Generated
   public List<String> b() {
      return this.b;
   }

   @Generated
   public String e() {
      return this.o;
   }

   @Generated
   public NLoginCore_055 a() {
      return this.a;
   }
}
