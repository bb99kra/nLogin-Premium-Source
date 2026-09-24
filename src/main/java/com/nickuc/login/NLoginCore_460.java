package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_460 {
   b((boolean)NLoginCore_460.n),
   c((boolean)NLoginCore_460.s),
   d((boolean)NLoginCore_460.x),
   e((boolean)NLoginCore_460.ac);

   private final boolean aQ;
   private static String[] a = new String[NLoginCore_460.h];
   private static String[] b = new String[NLoginCore_460.i];
   private static long c;
   private static int a = (256 >>> 200 | 256 << -200) & -1;
   private static int b = Integer.reverse(0);
   private static int c = 262144 >>> 16 | 262144 << -16;
   private static int d = (0 >>> 211 | 0 << -211) & -1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int f = (2097152 >>> 148 | 2097152 << ~148 + 1) & -1;
   private static int g = Integer.reverse(-1073741824);
   private static int h = Integer.reverse(536870912);
   private static int i = 536870912 >>> 219 | 536870912 << -219;
   private static int j = 0 >>> 89 | 0 << -89;
   private static long k = Long.reverse(5733027401080614785L);
   private static long l = Long.reverse(6917529027641081856L);
   private static int m = Integer.reverse(0);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = 65536 >>> 144 | 65536 << ~144 + 1;
   private static long p = Long.reverse(5733027401080614785L);
   private static long q = Long.reverse(6917529027641081856L);
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static int s = (16384 >>> 78 | 16384 << -78) & -1;
   private static int t = Integer.reverse(1073741824);
   private static long u = Long.reverse(5733027401080614785L);
   private static long v = Long.reverse(6917529027641081856L);
   private static int w = Integer.reverse(1073741824);
   private static int x = Integer.reverse(0);
   private static int y = 1610612736 >>> 157 | 1610612736 << ~157 + 1;
   private static int z = (-1 >>> 186 | -1 << -186) & -1;
   private static long aa = Long.reverse(3427184391866920833L);
   private static int ab = Integer.reverse(-1073741824);
   private static int ac = Integer.reverse(0);

   @Generated
   private NLoginCore_460(boolean var3) {
      this.aQ = var3;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_460.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.D("ӮԐԒӲԖԵԭՃԯӾԼԲՀԺԃԨՊՉՁՇՁԖ", (byte)91, 68), NLoginCore_460.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.F("պևֆՉ։օր։֔փՐ֎֒\u058b֎֔Ֆࣟࣞࢽࣲ࣒ࣦ࣓ࣝࣴࣗࣷࣨծ", (byte)91, 70) + var1 + NLoginCore_521.C("Ԁ", (byte)91, 67) + var2.toString(), var4
         );
      }
   }

   private static boolean c(List<Pattern> var0, String var1) {
      for (Pattern var3 : var0) {
         if (var3.matcher(var1).matches()) {
            return (boolean)a;
         }
      }

      return (boolean)b;
   }

   private static String a(int var0, long var1) {
      var1 ^= 6L;
      var1 ^= 5231837008477060644L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(12 + 57),
                     (byte)(58 + 25),
                     (byte)(43 + 4),
                     67,
                     (byte)(49 + 17),
                     (byte)(35 + 32),
                     (byte)(2 + 45),
                     (byte)(15 + 65),
                     (byte)(51 + 24),
                     (byte)(40 + 27),
                     (byte)(46 + 37),
                     (byte)(40 + 13),
                     (byte)(7 + 73),
                     (byte)(21 + 76),
                     (byte)(14 + 86),
                     (byte)(58 + 42),
                     (byte)(70 + 35),
                     (byte)(65 + 45),
                     (byte)(39 + 64)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.D("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯ߸߷ߖ߶߫ࠍ߰ࠐࠋࠁ߿߬", (byte)41, 68));
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
   public boolean aQ() {
      return this.aQ;
   }

   private static void b() {
      c = -9082143033239801358L;
      long var0 = c ^ 5231837008477060644L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(44 + 25),
               (byte)(32 + 51),
               (byte)(14 + 33),
               (byte)(6 + 61),
               (byte)(32 + 34),
               (byte)(17 + 50),
               (byte)(8 + 39),
               (byte)(70 + 10),
               (byte)(6 + 69),
               (byte)(43 + 24),
               (byte)(19 + 64),
               (byte)(27 + 26),
               80,
               97,
               (byte)(5 + 95),
               (byte)(16 + 84),
               (byte)(6 + 99),
               (byte)(42 + 68),
               (byte)(91 + 12)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(74 + 9)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_451.F("րՔը՞Ջբ՞և՜Մօ\u0558", (byte)84, 70);
               b[1] = NLoginCore_553.E("Իւը\u058cֈևևՌվթէ\u0558", (byte)84, 69);
               b[2] = NLoginCore_091.F("վՖ֊իպՠ֊Ջժռ։\u0558", (byte)84, 70);
               b[3] = NLoginCore_232.F("քՔ֊֍չն՜ռ\u0590֓֍\u0558", (byte)84, 70);
               break;
            case 1:
               b[0] = NLoginCore_138.F("պ֊քՔչֆիՇեռբզֈՐ\u058cՑկ։փֈձ֜գդ", (byte)84, 70);
               b[1] = NLoginCore_232.C("ӼԤԀӧԍԙԈӹԁԒ\u0530ӽԫӲӵԙӰԺԚԓԦԗԄԅ", (byte)84, 67);
               b[2] = NLoginCore_521.E("՛Ք\u0558։ֆշՆ՟ՎՊՅփՒխֈմՏՌհ\u0557պնգդ", (byte)84, 69);
               b[3] = NLoginCore_453.F("ձՖ՚\u0558լ՟ՎՐը֎Վ\u0558", (byte)84, 70);
               break;
            case 2:
               b[0] = NLoginCore_127.E("ցևւ\u058cժՠա\u0558ՙ֒ս\u0590֓թ֒Փ֏֗Ւևէզգդ", (byte)84, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_446.E("զցը՚գռջֈ\u0590ևլ֎օխՖ֙ձՒյխխխշՒ֞\u058c֖֤֝֠փա", (byte)84, 69);
         }
      }
   }

   public static NLoginCore_460 a(String var0) {
      String var1 = var0.toLowerCase();
      boolean var2 = c(BCryptHashProvider.k(), var1);
      boolean var3 = c(BCryptHashProvider.l(), var1);
      if (var2 && var3) {
         return e;
      } else if (var2) {
         return b;
      } else {
         return var3 ? c : d;
      }
   }

   static {
      b();
   }
}
