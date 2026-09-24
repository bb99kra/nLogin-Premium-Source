package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_100 implements NLoginInterface_011<Object>, NLoginInterface_004 {
   private static long l = Long.reverse(-5179720868741954712L);
   private static long j = Long.reverse(2458384099278406504L);
   private static int o = 2048 >>> 169 | 2048 << -169;
   private static long g = Long.reverse(-7349874591868649472L);
   private static int a = Integer.reverse(0);
   private static String[] a = new String[NLoginCore_100.n];
   private static long m = Long.reverse(-7349874591868649472L);
   private static int k = 12582912 >>> 118 | 12582912 << ~118 + 1;
   private static String[] b = new String[o];
   private static long c;
   private static int n = (256 >>> 102 | 256 << ~102 + 1) & -1;
   private static long f = Long.reverse(-5179720868741954712L);
   private static int h = Integer.reverse(1073741824);
   private static int e = 256 >>> 232 | 256 << ~232 + 1;
   private static long b = Long.reverse(-5179720868741954712L);
   protected NLoginInterface_011<?> a;
   private static int i = Integer.reverse(-1);
   private static long d = Long.reverse(-7349874591868649472L);

   @Override
   public File c() {
      return this.a.c();
   }

   @Override
   public String s() {
      return this.a.s();
   }

   @Override
   public <T extends NLoginCore_100> T b() {
      return (T)this;
   }

   @Override
   public NLoginInterface_020 a() {
      return this.a.a();
   }

   @Override
   public NLoginCore_364 b() {
      return this.a.b();
   }

   public void j() {
   }

   @Override
   public void c() {
      this.a.c();
   }

   @Override
   public Object a(int var1) {
      return this.a.a(var1);
   }

   @Override
   public NLoginInterface_047 b() {
      return this.a.b();
   }

   public NLoginInterface_034[] a() {
      return this.a().a();
   }

   @Override
   public String toString() {
      return this.a.q() + a(a, b ^ d) + this.a.s() + (this.a.a() == null ? a(e, f ^ g) : a(h & i, j) + this.a.a().G() + a(k, l ^ m));
   }

   void a(NLoginInterface_011<?> var1) {
      this.a = var1;
   }

   public void O() {
   }

   @Override
   public NLoginInterface_022 b(boolean var1) {
      return this.a.b(var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_100.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_076.E("ԳՕ\u0557Է՛պղֈմՃցշօտՈխ֏֎ֆ\u058cֆ՛", (byte)79, 69), NLoginCore_100.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.D("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡆࡨࡽ\u085fࡱࡩ\u086d\u086eࡷࡳ\u086fࢄࢄࡴӻ", (byte)79, 68) + var1 + NLoginCore_138.D("Ӝ", (byte)79, 68) + var2.toString(),
            var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 89L;
      var1 ^= -2563453556609821998L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     (byte)(22 + 47),
                     83,
                     (byte)(34 + 13),
                     (byte)(40 + 27),
                     (byte)(46 + 20),
                     (byte)(49 + 18),
                     47,
                     (byte)(57 + 23),
                     (byte)(9 + 66),
                     (byte)(51 + 16),
                     (byte)(77 + 6),
                     (byte)(32 + 21),
                     (byte)(14 + 66),
                     (byte)(48 + 49),
                     (byte)(74 + 26),
                     (byte)(33 + 67),
                     (byte)(73 + 32),
                     (byte)(36 + 74),
                     (byte)(23 + 80)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.A("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӛӽԒӴԆӾԂԃԌԈԄԙԙԉ", (byte)92, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         a[var0] = new String(var3.doFinal(Base64.getDecoder().decode(b[var0])), StandardCharsets.UTF_8);
      }

      return a[var0];
   }

   @Override
   public void a(NLoginInterface_013 var1, NLoginInterface_013... var2) {
      this.a.a(var1, var2);
   }

   @Override
   public NLoginCore_572 a() {
      return this.a.a();
   }

   public void T() {
   }

   @Override
   public NLoginInterface_026 a() {
      return this.a.a();
   }

   @Override
   public boolean N() {
      return this.a.N();
   }

   public void i() {
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public Object b() {
      return this.a.b();
   }

   static {
      b();
   }

   private static void b() {
      c = 1640066127251355677L;
      long var0 = c ^ -2563453556609821998L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(8 + 61),
               (byte)(70 + 13),
               (byte)(18 + 29),
               (byte)(41 + 26),
               (byte)(65 + 1),
               (byte)(38 + 29),
               (byte)(5 + 42),
               (byte)(31 + 49),
               (byte)(73 + 2),
               (byte)(64 + 3),
               (byte)(28 + 55),
               (byte)(47 + 6),
               (byte)(41 + 39),
               (byte)(29 + 68),
               (byte)(32 + 68),
               (byte)(23 + 77),
               105,
               (byte)(98 + 12),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(55 + 28)}, StandardCharsets.UTF_8));
      byte[] var4 = new byte[8];
      var4[0] = (byte)(var0 >>> 56);

      for (int var5 = 1; var5 < 8; var5++) {
         var4[var5] = (byte)(var0 << var5 * 8 >>> 56);
      }

      var2.init(2, var3.generateSecret(new DESKeySpec(var4)), new IvParameterSpec(new byte[8]));
      byte var7 = 1;

      for (int var6 = 0; var6 < var7; var6++) {
         switch (var6) {
            case 0:
               b[0] = NLoginCore_446.E("ԴԶՆՉթ՝իԨզծ\u0530Ժ", (byte)54, 69);
               b[1] = NLoginCore_559.A("ĮőĵňħŖĤţŗķŘĳ", (byte)54, 65);
               b[2] = NLoginCore_127.F("ՓԪեԨեՐահՑՑԵԴ\u0530Ն\u0557\u0558ԲէեԶռծՅՆ", (byte)54, 70);
               b[3] = NLoginCore_453.F("՛ԼՍախԫղ՛ե՜ԴԺ", (byte)54, 70);
               break;
            case 1:
               b[0] = NLoginCore_027.F("՛ԶԩԤ՞գՆազԭէԺ", (byte)54, 70);
               b[1] = NLoginCore_427.F("դ՜ՅՖԿՈՃգՁէՉԺ", (byte)54, 70);
               b[2] = NLoginCore_384.D("ҸҏӊҍӊҵӆӕҶҶҐүӚӍҳҚҽһҰҠҾӓҪҫ", (byte)54, 68);
               b[3] = NLoginCore_451.C("ҟҧҢӒҟҲҍҕӀҘҶҟ", (byte)54, 67);
               break;
            case 2:
               b[0] = NLoginCore_575.B("ŜŅĜŢĨŇœŝŀŁħľŚśňŋőŢŬũťŁľĿ", (byte)54, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_092.D("ҋ҇ҍқӌӋҿӑӊӆӋһӚӅҭҿӝҬҮҫӘӣҪҫ", (byte)54, 68);
         }
      }
   }

   @Override
   public String q() {
      return this.a.q();
   }

   @Override
   public void a(NLoginCore_168<?> var1, NLoginCore_168<?>... var2) {
      this.a.a(var1, var2);
   }
}
