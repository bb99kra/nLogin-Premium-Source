package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class H2DatabaseProvider extends NLoginCore_021 {
   private static long q = Long.reverse(5764607523034234880L);
   private static int r = 2 >>> 160 | 2 << ~160 + 1;
   private static int a = 131072 >>> 241 | 131072 << -241;
   private static int n = (128 >>> 197 | 128 << ~197 + 1) & -1;
   private static String[] ZKM_STR_B = new String[H2DatabaseProvider.ap];
   private final String aA;
   private static int l = Integer.reverse(1073741824);
   private static int ai = Integer.reverse(-1073741824);
   private static int am = 0 >>> 1 | 0 << ~1 + 1;
   private static int al = (2 >>> 32 | 2 << -32) & -1;
   private static int c = 0 >>> 66 | 0 << -66;
   private static int ah = 16777216 >>> 119 | 16777216 << ~119 + 1;
   private static long t = Long.reverse(5764607523034234880L);
   private static int u = Integer.reverse(-1073741824);
   private static int ak = 0 >>> 220 | 0 << ~220 + 1;
   private static long e = Long.reverse(5764607523034234880L);
   private static int b = 0 >>> 179 | 0 << -179;
   private static long s = Long.reverse(5461652613437406826L);
   private static long ad = Long.reverse(2002888099616865898L);
   private final NLoginCore_282 a;
   private static int z = Integer.reverse(-1);
   private static long aa = Long.reverse(2002888099616865898L);
   @Nullable
   private final String aB;
   private static int j = 0 >>> 34 | 0 << ~34 + 1;
   @Nullable
   private final Object e;
   private final Properties c;
   private static long p = Long.reverse(5461652613437406826L);
   private static long v = Long.reverse(5461652613437406826L);
   private static long w = Long.reverse(5764607523034234880L);
   private static int i = Integer.reverse(-1610612736);
   private static String[] ZKM_STR_A = new String[H2DatabaseProvider.ao];
   private static long d = Long.reverse(5461652613437406826L);
   private static int ap = (384 >>> 102 | 384 << ~102 + 1) & -1;
   private static int ab = Integer.reverse(-1610612736);
   private static int h = (16 >>> 132 | 16 << -132) & -1;
   private static int g = (0 >>> 214 | 0 << -214) & -1;
   private static int ac = (-1 >>> 100 | -1 << ~100 + 1) & -1;
   private static int an = Integer.reverse(Integer.MIN_VALUE);
   private final Constructor<?> c;
   private static int ao = '쀀' >>> '-' | 49152 << ~45 + 1;
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(1073741824);
   private static int af = Integer.reverse(0);
   private static int k = 134217728 >>> 251 | 134217728 << -251;
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static int ae = Integer.reverse(-1610612736);
   private static long c;
   private static int x = Integer.reverse(0);
   private static int aj = (2 >>> 159 | 2 << ~159 + 1) & -1;
   private static int y = (16384 >>> 172 | 16384 << -172) & -1;
   private static int m = Integer.reverse(-1073741824);

   @Override
   public NLoginCore_036 a() {
      return NLoginCore_036.g;
   }

   @Override
   protected Connection c() {
      try {
         Object var3;
         if (this.a.compareTo(NLoginCore_282.c) >= 0) {
            var3 = this.c;
            Object[] var10001 = new Object[ae];
            var10001[af] = this.aA;
            var10001[ag] = this.c;
            var10001[ah] = this.aB;
            var10001[ai] = this.e;
            var10001[aj] = Boolean.valueOf((ak != 0));
            var3 = (Constructor)var3.newInstance(var10001);
         } else {
            var3 = this.c;
            Object[] var5 = new Object[al];
            var5[am] = this.aA;
            var5[an] = this.c;
            var3 = (Constructor)var3.newInstance(var5);
         }

         Object var1 = var3;
         return (Connection)var1;
      } catch (ReflectiveOperationException var2) {
         if (var2.getCause() instanceof SQLException) {
            throw (SQLException)var2.getCause();
         } else {
            throw new RuntimeException(var2);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 10L;
      var1 ^= -4129804051208352222L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(13 + 56),
                     (byte)(68 + 15),
                     (byte)(45 + 2),
                     67,
                     (byte)(22 + 44),
                     (byte)(18 + 49),
                     (byte)(5 + 42),
                     80,
                     (byte)(30 + 45),
                     (byte)(64 + 3),
                     (byte)(74 + 9),
                     (byte)(24 + 29),
                     (byte)(44 + 36),
                     (byte)(8 + 89),
                     (byte)(90 + 10),
                     (byte)(59 + 41),
                     (byte)(66 + 39),
                     (byte)(104 + 6),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.D("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸࠀࠎߧࠔࠕࠋ߹ࠊࠕࠍࠇࠔࠖࠋ࠙", (byte)44, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  H2DatabaseProvider.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.D("ӐӲӴӔӸԗԏԥԑӠԞԔԢԜӥԊԬԫԣԩԣӸ", (byte)81, 68), H2DatabaseProvider.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧ\u086fࡽࡖࢃࢄࡺࡨࡹࢄࡼࡶࢃࢅࡺ࢈Ԃ", (byte)81, 67) + var1 + NLoginCore_387.B("ś", (byte)81, 66) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 6232033446920573906L;
      long var0 = c ^ -4129804051208352222L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(41 + 27),
               (byte)(65 + 4),
               (byte)(3 + 80),
               (byte)(11 + 36),
               (byte)(16 + 51),
               (byte)(55 + 11),
               (byte)(38 + 29),
               (byte)(15 + 32),
               (byte)(6 + 74),
               (byte)(73 + 2),
               (byte)(11 + 56),
               (byte)(7 + 76),
               (byte)(48 + 5),
               (byte)(79 + 1),
               (byte)(9 + 88),
               (byte)(31 + 69),
               (byte)(70 + 30),
               105,
               110,
               (byte)(79 + 24)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_201.A("ģŌĒĴņŖķŇŐĹşŖŞŒĢĻŢĴŁœŋŚśĩĬŀīŏŦőŁĲŒŷĳŌļŭŒœūĳŸŇ", (byte)48, 65);
               ZKM_STR_B[1] = NLoginCore_427.D("҆ҵҺҏҖҋҎӄӄҽ҂҈ҞҾ҆ҥӂӅӆҪҝӉҧҿҔҏӎңӇӍӄӊҘҲҬӑӖҫӠӕәӞҴҭ", (byte)48, 68);
               ZKM_STR_B[2] = NLoginCore_553.F("ՄՖԞՠԽՂՔ՝՜՞ՏԴ", (byte)48, 70);
               ZKM_STR_B[3] = NLoginCore_427.C("үҠҝӂүѾҬҭ҄ӃҲҍ", (byte)48, 67);
               ZKM_STR_B[4] = NLoginCore_575.F("ՖՇՄթՖԥՓՔԫժՙԴ", (byte)48, 70);
               ZKM_STR_B[5] = NLoginCore_451.D("ѷҵҌҊҎҒѼӆҗӆҨ҈҅ҦҔ҆ҜӎҧӆӃҫҘҙ", (byte)48, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.C("҉ҲѸҚҬҼҝҭҶҟӅҼӄҸ҈ҡӈҚҧҹұӀӁҏҒҦґҵӌҷҧҘһӒҚҮӗӟҼӐҹӥӦҭ", (byte)48, 67);
               ZKM_STR_B[1] = NLoginCore_427.A("ĠŏŔĩİĥĨŞŞŗĜĢĸŘĠĿŜşŠńķţŁřĮĩŨĽšŧŞŤłňůţŪĽļſűŗŸŇ", (byte)48, 65);
               ZKM_STR_B[2] = NLoginCore_453.F("ՕԶԼՕգՀի՝բժՃԴ", (byte)48, 70);
               ZKM_STR_B[3] = NLoginCore_471.A("ĕġņķļĭĝŝŝēŃŔģŅŦŞłĤşŉōŅĲĳ", (byte)48, 65);
               ZKM_STR_B[4] = NLoginCore_446.F("ԥ՞\u0530Ց՛՚ՓբաԷ\u0557զԯ՟իՅբԾեճԸՒԿՀ", (byte)48, 70);
               ZKM_STR_B[5] = NLoginCore_173.B("đŏĦĤĨĬĖŠıŠłĲĜĞĘİŚŪŀŊŗśĲĳ", (byte)48, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.F("ՅԸՙԼՕԩբԸիԬ՝Դ", (byte)48, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_110.D("ҰҠҨҼҼҠҸӀқҖғҖӁӊҋҿҍӈҝӋӋӁҘҙ", (byte)48, 68);
         }
      }
   }

   private H2DatabaseProvider(NLoginInterface_011<?> var1, NLoginCore_282 var2, File var3, Properties var4, @Nullable String var5, @Nullable Object var6) {
      NLoginCore_583 var10000 = var1.a();
      NLoginInterface_034[] var10001 = new NLoginInterface_034[a];
      var10001[b] = NLoginCore_282.a(var2);
      NLoginCore_200 var7 = var10000.a(var10001);

      try {
         Class var8 = var7.loadClass(a(c, d ^ e));
         Constructor var12;
         if (var2 == NLoginCore_282.b) {
            Class[] var10002 = new Class[f];
            var10002[g] = String.class;
            var10002[h] = Properties.class;
            var12 = var8.getConstructor(var10002);
         } else {
            Class[] var13 = new Class[i];
            var13[j] = String.class;
            var13[k] = Properties.class;
            var13[l] = String.class;
            var13[m] = Object.class;
            var13[n] = boolean.class;
            var12 = var8.getConstructor(var13);
         }

         this.c = var12;
      } catch (ReflectiveOperationException var10) {
         throw new RuntimeException(var10);
      }

      File var11 = var3.getParentFile();
      if (!var11.exists() && !var11.mkdirs()) {
         throw new RuntimeException(a(o, p ^ q) + var11 + a(r, s ^ t));
      } else {
         String var9 = var3.getAbsolutePath();
         if (var9.endsWith(a(u, v ^ w))) {
            var9 = var9.substring(x, var9.length() - a(y & z, aa).length());
         }

         this.a = var2;
         this.aA = a(ab & ac, ad) + var9;
         this.c = var4;
         this.aB = var5;
         this.e = var6;
      }
   }

   public static H2DatabaseProvider a(NLoginInterface_011<?> var0, NLoginCore_282 var1, File var2, Properties var3, @Nullable String var4, @Nullable Object var5) {
      return new H2DatabaseProvider(var0, var1, var2, var3, var4, var5);
   }

   public static H2DatabaseProvider a(NLoginInterface_011<?> var0, NLoginCore_282 var1, File var2, Properties var3) {
      return a(var0, var1, var2, var3, null, null);
   }
}
