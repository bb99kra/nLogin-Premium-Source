package com.nickuc.login;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Generated;

public abstract class ιΓαΩλςηναΩλγδΓ {
   private final boolean w;
   private final String p;
   protected εθσξξτΛακπΣ a;
   private final boolean x;
   private static int a = 16 >>> 4 | 16 << -4;
   private final List<String> b;
   protected final ηισξπαΠχΩ l = ηισξπαΠχΩ.b;
   private final String o;
   private static int b = Integer.reverse(0);
   protected ΨγημιδξΓτοθαζ a;

   protected boolean j() {
      return (boolean)(this.a != εθσξξτΛακπΣ.c && this.a != εθσξξτΛακπΣ.s ? b : a);
   }

   public void a(θΦγνΩερριδκ var1, String[] var2) {
      this.a = var1 instanceof ΨαχΨχΣλεΠψΦ ? this.a.a().b((ΨαχΨχΣλεΠψΦ)var1).a() : εδδΠηδξΛΣχ.c();
      this.b(var1, var2);
   }

   protected List<String> c(θΦγνΩερριδκ var1, String var2, String[] var3) {
      return null;
   }

   @Generated
   public ΨγημιδξΓτοθαζ b() {
      return this.a;
   }

   @Generated
   public boolean o() {
      return this.x;
   }

   protected abstract void b(θΦγνΩερριδκ var1, String[] var2);

   @Generated
   public ηισξπαΠχΩ a() {
      return this.l;
   }

   @Generated
   public boolean n() {
      return this.w;
   }

   public ιΓαΩλςηναΩλγδΓ(ΨγημιδξΓτοθαζ var1, String var2, String var3, boolean var4, boolean var5, String... var6) {
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
   public εθσξξτΛακπΣ a() {
      return this.a;
   }
}
