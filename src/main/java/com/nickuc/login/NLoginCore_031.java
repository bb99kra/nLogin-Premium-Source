package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_031 implements NLoginInterface_034 {
   private static int af = (1552 >>> 100 | 1552 << ~100 + 1) & -1;
   private static int t = (0 >>> 67 | 0 << -67) & -1;
   private static int a = (4194304 >>> 150 | 4194304 << -150) & -1;
   private static int ak = (-671088639 >>> 187 | -671088639 << ~187 + 1) & -1;
   private static int am = Integer.reverse(-603979776);
   private static int ap = (22544384 >>> 83 | 22544384 << ~83 + 1) & -1;
   private static int i = 33554432 >>> 248 | 33554432 << -248;
   private static int u = 0 >>> 46 | 0 << -46;
   private static int f = (8192 >>> 109 | 8192 << ~109 + 1) & -1;
   private static int ab = Integer.reverse(-234881024);
   private static int ag = (-2147483619 >>> 191 | -2147483619 << ~191 + 1) & -1;
   private static int y = 30932992 >>> 83 | 30932992 << ~83 + 1;
   private static int ad = (1933312 >>> 143 | 1933312 << ~143 + 1) & -1;
   private static int c = 0 >>> 20 | 0 << ~20 + 1;
   private static long d = Long.reverse(-5700010101555140080L);
   private static int aj = 45088768 >>> 20 | 45088768 << ~20 + 1;
   private static int ao = (247463936 >>> 86 | 247463936 << -86) & -1;
   private static long j = Long.reverse(-5700010101555140080L);
   private static int ac = Integer.reverse(-2046820352);
   private final String aF;
   private static long h = Long.reverse(-5620492334958379008L);
   private static int aa = (944 >>> 164 | 944 << -164) & -1;
   private final boolean U;
   private static int s = Integer.reverse(0);
   private final String aD;
   private static int ai = (15104 >>> 168 | 15104 << -168) & -1;
   private static int v = Integer.reverse(0);
   private static int aq = Integer.reverse(536870912);
   private static int p = Integer.reverse(0);
   private static long c;
   private static int x = 262144 >>> 210 | 262144 << ~210 + 1;
   private static int al = Integer.reverse(-738197504);
   private static long m = Long.reverse(208712609554950672L);
   private static int b = 4 >>> 66 | 4 << -66;
   private static int w = 0 >>> 33 | 0 << -33;
   private static int l = Integer.reverse(-1073741824);
   private static String[] a = new String[aq];
   private final String aE;
   private static long e = Long.reverse(-5620492334958379008L);
   private static int ah = 88064 >>> 75 | 88064 << -75;
   private static int q = 0 >>> 98 | 0 << -98;
   private static int an = Integer.reverse(-738197504);
   @Nullable
   private final String aG;
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long k = Long.reverse(-5620492334958379008L);
   private static int ar = ('耀' >>> 173 | 32768 << -173) & -1;
   private static int z = (32 >>> 229 | 32 << ~229 + 1) & -1;
   private static long g = Long.reverse(-5700010101555140080L);
   private static int ae = Integer.reverse(-234881024);
   private static int r = Integer.reverse(0);
   private final boolean T;
   private final List<NLoginCore_398> h;
   private static int o = 0 >>> 109 | 0 << ~109 + 1;
   private static String[] b = new String[ar];

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_031.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.A("çĉċëďĮĦļĨ÷ĵīĹĳüġŃłĺŀĺď", (byte)32, 65), NLoginCore_031.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒєߗߨ߈ߏ߅ߠߧ߯ߗ߷ߦѫ", (byte)32, 67) + var1 + NLoginCore_433.F("Ԗ", (byte)32, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   @Override
   public boolean c() {
      return this.U;
   }

   @Generated
   @Override
   public int hashCode() {
      int var1 = y;
      int var2 = z;
      var2 = var2 * aa + (this.b() ? ab : ac);
      var2 = var2 * ad + (this.c() ? ae : af);
      String var3 = this.a();
      var2 = var2 * ag + (var3 == null ? ah : var3.hashCode());
      String var4 = this.b();
      var2 = var2 * ai + (var4 == null ? aj : var4.hashCode());
      String var5 = this.getVersion();
      var2 = var2 * ak + (var5 == null ? al : var5.hashCode());
      String var6 = this.c();
      var2 = var2 * am + (var6 == null ? an : var6.hashCode());
      List var7 = this.a();
      return var2 * ao + (var7 == null ? ap : var7.hashCode());
   }

   private static String a(int var0, long var1) {
      var1 ^= 77L;
      var1 ^= -2468381736727184126L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(66 + 2),
                     69,
                     (byte)(40 + 43),
                     (byte)(44 + 3),
                     (byte)(46 + 21),
                     (byte)(4 + 62),
                     (byte)(24 + 43),
                     (byte)(5 + 42),
                     (byte)(50 + 30),
                     (byte)(50 + 25),
                     (byte)(12 + 55),
                     (byte)(38 + 45),
                     (byte)(36 + 17),
                     80,
                     (byte)(14 + 83),
                     (byte)(87 + 13),
                     (byte)(87 + 13),
                     (byte)(41 + 64),
                     (byte)(18 + 92),
                     (byte)(59 + 44)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.A("ĖģĢåĥġĜĥİğìĪĮħĪİòѵ҆ѦѭѣѾ҅ҍѵҕ҄", (byte)26, 65));
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

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return (boolean)n;
      } else if (!(var1 instanceof NLoginCore_031)) {
         return (boolean)o;
      } else {
         NLoginCore_031 var2 = (NLoginCore_031)var1;
         if (!var2.b(this)) {
            return (boolean)p;
         } else if (this.b() != var2.b()) {
            return (boolean)q;
         } else if (this.c() != var2.c()) {
            return (boolean)r;
         } else {
            String var3 = this.a();
            String var4 = var2.a();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.b();
               String var6 = var2.b();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  String var7 = this.getVersion();
                  String var8 = var2.getVersion();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     String var9 = this.c();
                     String var10 = var2.c();
                     if (var9 == null ? var10 == null : var9.equals(var10)) {
                        List var11 = this.a();
                        List var12 = var2.a();
                        return (boolean)((var11 == null ? var12 == null : var11.equals(var12)) ? x : w);
                     } else {
                        return (boolean)v;
                     }
                  } else {
                     return (boolean)u;
                  }
               } else {
                  return (boolean)t;
               }
            } else {
               return (boolean)s;
            }
         }
      }
   }

   public NLoginCore_031(String var1, String var2, String var3, @Nullable String var4, NLoginCore_398... var5) {
      this(var1, var2, var3, var4, (boolean)a, (boolean)b, var5);
   }

   public NLoginCore_031(String var1, String var2, String var3, @Nullable String var4, boolean var5, boolean var6, NLoginCore_398... var7) {
      this.aD = var1.replace(a(c, d ^ e), a(f, g ^ h));
      this.aE = var2.replace(a(i, j ^ k), a(l, m));
      this.aF = var3;
      this.aG = var4;
      this.T = var5;
      this.U = var6;
      this.h = Arrays.asList(var7);
   }

   @Nullable
   @Generated
   @Override
   public String c() {
      return this.aG;
   }

   @Generated
   @Override
   public String getVersion() {
      return this.aF;
   }

   @Generated
   protected boolean b(Object var1) {
      return var1 instanceof NLoginCore_031;
   }

   static {
      b();
   }

   @Generated
   @Override
   public List<NLoginCore_398> a() {
      return this.h;
   }

   @Generated
   @Override
   public String b() {
      return this.aE;
   }

   private static void b() {
      c = 601042657262610189L;
      long var0 = c ^ -2468381736727184126L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(10 + 59),
               (byte)(13 + 70),
               (byte)(36 + 11),
               (byte)(15 + 52),
               (byte)(65 + 1),
               (byte)(18 + 49),
               (byte)(2 + 45),
               (byte)(27 + 53),
               (byte)(2 + 73),
               (byte)(8 + 59),
               (byte)(3 + 80),
               (byte)(24 + 29),
               (byte)(64 + 16),
               (byte)(14 + 83),
               100,
               (byte)(62 + 38),
               105,
               (byte)(83 + 27),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_553.B("ƈƪƚūƩƬƪƭƲűƨŻ", (byte)90, 66);
               b[1] = NLoginCore_173.D("ԄԫԛԙӻԏԠӽԄԥԅԋ", (byte)90, 68);
               b[2] = NLoginCore_433.D("ԘԺԪӻԹԼԺԽՂԁԸԋ", (byte)90, 68);
               b[3] = NLoginCore_471.D("ԄԫԛԙӻԏԠӽԄԥԅԋ", (byte)90, 68);
               break;
            case 1:
               b[0] = NLoginCore_092.D("ԐӳԒԵԩԿԖԸԄ\u0530ԁԋ", (byte)90, 68);
               b[1] = NLoginCore_451.B("ƨƎƖƬƫƝơŽƐƈƖŻ", (byte)90, 66);
               b[2] = NLoginCore_091.D("ԴӷԞԗӶԘԍԏՄԘԦԋ", (byte)90, 68);
               b[3] = NLoginCore_559.E("ֆպեՎՉձ֍\u058cմմՔ՞", (byte)90, 69);
               break;
            case 2:
               b[0] = NLoginCore_091.D("ӺԼԝԔԭԀՂՁԝԠӽԿԕԃԖՄԚԗՍԢՐԩԖԗ", (byte)90, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.D("ԒԹԛԊԙԑԺԔՅԤԎԛՃՁԻԘԼՉԟԻԪԿԖԗ", (byte)90, 68);
         }
      }
   }

   @Generated
   @Override
   public String a() {
      return this.aD;
   }

   @Generated
   @Override
   public boolean b() {
      return this.T;
   }
}
