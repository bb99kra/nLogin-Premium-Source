package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_136 {
   public static final String ck = a(NLoginCore_136.g, NLoginCore_136.h ^ NLoginCore_136.i);
   public static final String cl = a(NLoginCore_136.k, NLoginCore_136.l);
   private static int o = Integer.reverse(1610612736);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   public static final int an = NLoginCore_136.c;
   public static final int at = NLoginCore_136.n;
   private static int s = Integer.reverse(0);
   private static int e = -1 >>> 224 | -1 << -224;
   private static int q = Integer.reverse(-1073741824);
   private static int a = (25165824 >>> 55 | 25165824 << -55) & -1;
   private static long l = Long.reverse(5597267065567692908L);
   private static int d = Integer.reverse(0);
   private static int m = Integer.reverse(1073741824);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   public static final int as = NLoginCore_136.j;
   private static int n = 5120 >>> 106 | 5120 << -106;
   private static long f = Long.reverse(5597267065567692908L);
   public static final int au = o;
   public static final int ar = q;
   public static final int av = NLoginCore_136.r;
   private static int k = (8388608 >>> 86 | 8388608 << -86) & -1;
   private static long c;
   public static final String cj = a(d & e, f);
   private static int b = (1610612736 >>> 157 | 1610612736 << ~157 + 1) & -1;
   private static int c = -1 >>> 78 | -1 << -78;
   public static final int ap = p;
   private static int r = 7168 >>> 138 | 7168 << -138;
   public static final int aq = m;
   private static long i = Long.reverse(-4611686018427387904L);
   private static int j = 16 >>> 226 | 16 << -226;
   private static String[] b;
   public static final int ao = s;
   private static String[] a;
   private static long h = Long.reverse(-8237790989714470804L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_136.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.F("ӴԖԘӸԜԻԳՉԵԄՂԸՆՀԉԮՐՏՇՍՇԜ", (byte)16, 70), NLoginCore_136.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_521.B("ĂďĎÑđčĈđĜċØĖĚēĖĜÞѢѶѲцѷѪѲѮò", (byte)16, 66) + var1 + NLoginCore_076.F("Ԇ", (byte)16, 70) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 3L;
      var1 ^= -220068646566759314L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(60 + 9),
                     (byte)(21 + 62),
                     (byte)(36 + 11),
                     (byte)(7 + 60),
                     (byte)(51 + 15),
                     67,
                     (byte)(15 + 32),
                     (byte)(50 + 30),
                     (byte)(4 + 71),
                     (byte)(31 + 36),
                     (byte)(48 + 35),
                     (byte)(22 + 31),
                     (byte)(34 + 46),
                     (byte)(14 + 83),
                     (byte)(81 + 19),
                     (byte)(21 + 79),
                     105,
                     (byte)(34 + 76),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.A("ŨŵŴķŷųŮŷƂűľżƀŹżƂńӈӜӘҬӝӐӘӔ", (byte)67, 65));
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

   static {
      a = new String[a];
      b = new String[b];
      b();
   }

   private static void b() {
      c = 3896708970525406641L;
      long var0 = c ^ -220068646566759314L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(57 + 11),
               (byte)(46 + 23),
               (byte)(64 + 19),
               (byte)(7 + 40),
               (byte)(3 + 64),
               (byte)(34 + 32),
               (byte)(43 + 24),
               (byte)(44 + 3),
               (byte)(7 + 73),
               (byte)(74 + 1),
               (byte)(31 + 36),
               83,
               53,
               (byte)(67 + 13),
               (byte)(27 + 70),
               (byte)(25 + 75),
               (byte)(89 + 11),
               (byte)(14 + 91),
               (byte)(99 + 11),
               (byte)(94 + 9)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.F("ԞՍեՀ՚՟զԵԺՂՊԳ", (byte)47, 70);
               b[1] = NLoginCore_530.D("Ұ҆ҎѶҨҖҋҞӀҴүҊ", (byte)47, 68);
               b[2] = NLoginCore_530.C("ңҲҷҎҕҋҽӂҼҙҁҵ҆ҒҤҵҸҶҙӀҿҘҕҖ", (byte)47, 67);
               break;
            case 1:
               b[0] = NLoginCore_141.C("һҐҰґҝѸҡҮѾҞҗҴҝҙһҗ҅ҪһҿӈҨҕҖ", (byte)47, 67);
               b[1] = NLoginCore_451.F("ԴՅԽՕ՝՚ՄԝԫՌՉ\u0557Ԩ\u0530եՂԯբՁՌԷՑԾԿ", (byte)47, 70);
               b[2] = NLoginCore_241.E("Ռ՛ՠԷԾԴզիեՂԪՀՎլՑԭՇԲՒԵեէԾԿ", (byte)47, 69);
               break;
            case 2:
               b[0] = NLoginCore_553.C("ѷҗѵѹҔҗҕҍҷҜҴҐӄңҤ҄ҾҿӋһҮҘҕҖ", (byte)47, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.F("՝ԿդզԚԳէգԤծՎհԩՊԩԪՏԲՁՏզթՕժՇծոԽ՜ցՍ՛", (byte)47, 70);
         }
      }
   }
}
