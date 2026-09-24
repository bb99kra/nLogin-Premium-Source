package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.bukkit.nLoginBukkit;
import lombok.Generated;

public class NLoginCore_111 implements NLoginInterface_018 {
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int c = (64 >>> 70 | 64 << -70) & -1;
   private final nLoginBukkit m;
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);

   public NLoginCore_511 a() {
      return new NLoginCore_511(this.m);
   }

   @Override
   public void c() {
   }

   @Override
   public nLoginAPI a() {
      return new NLoginType_012(this.m);
   }

   @Override
   public NLoginInterface_030 a() {
      return new NLoginCore_252(this.m);
   }

   @Generated
   public NLoginCore_111(nLoginBukkit var1) {
      this.m = var1;
   }

   @Override
   public NLoginCore_056 a() {
      return new NLoginCore_209(this.m.b(), this.m, (boolean)c);
   }

   @Override
   public boolean a() {
      return NLoginCore_134.a(this.m, (boolean)b);
   }

   @Override
   public void b() {
      NLoginType_008 var1 = this.m.a();
      this.m.b().c().forEach(var0 -> var0.a(NLoginCore_150.a(NLoginCore_487.p, var0)));
      NLoginCore_478.a(this.m, (boolean)a);
      this.m.a().n();
   }
}
