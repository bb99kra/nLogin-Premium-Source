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

public class NLoginCore_375 extends PBKDF2HashProvider implements NLoginInterface_009 {
   private static int w = (0 >>> 27 | 0 << ~27 + 1) & -1;
   private static int ad = (0 >>> 29 | 0 << -29) & -1;
   private static long ai = Long.reverse(-7102334855700795069L);
   private static int k = 100663296 >>> 88 | 100663296 << -88;
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static long e;
   private static int p = 1073741824 >>> 93 | 1073741824 << ~93 + 1;
   private static String[] d = new String[NLoginCore_375.ak];
   private static int q = 25165824 >>> 151 | 25165824 << ~151 + 1;
   private static int aj = 192 >>> 198 | 192 << -198;
   private static int n = 0 >>> 142 | 0 << -142;
   private static long h = Long.reverse(7885644704188215619L);
   private static int f = Integer.reverse(0);
   private static int ah = 2048 >>> 170 | 2048 << -170;
   private static long ag = Long.reverse(-7102334855700795069L);
   private static long j = Long.reverse(-1152921504606846976L);
   private static int s = Integer.reverse(536870912);
   private static String[] c = new String[aj];
   private static int v = 20 >>> 66 | 20 << -66;
   private static int ak = Integer.reverse(-1073741824);
   private static int af = -1 >>> 29 | -1 << ~29 + 1;

   private static void b() {
      e = -4428119974517737802L;
      long var0 = e ^ -769132196522835955L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               (byte)(41 + 28),
               (byte)(66 + 17),
               (byte)(31 + 16),
               (byte)(42 + 25),
               66,
               (byte)(34 + 33),
               47,
               (byte)(32 + 48),
               (byte)(60 + 15),
               (byte)(37 + 30),
               (byte)(69 + 14),
               (byte)(23 + 30),
               (byte)(6 + 74),
               (byte)(75 + 22),
               (byte)(27 + 73),
               (byte)(60 + 40),
               (byte)(50 + 55),
               (byte)(37 + 73),
               (byte)(61 + 42)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_138.E("Կ՟ձՒՍ՚ՄԴծԴ՛Մ", (byte)64, 69);
               d[1] = NLoginCore_530.C("ӣӘӛӛӈӇӎӔӄӪӑӃӺөӷҸәӯһӓҸӱӈӉ", (byte)64, 67);
               d[2] = NLoginCore_471.E("ՇԶյՙլԵ\u0558զՅՑ՟Մ", (byte)64, 69);
               break;
            case 1:
               d[0] = NLoginCore_446.E("գզԭՌՏԺՕձ\u0558յԶՄ", (byte)64, 69);
               d[1] = NLoginCore_138.A("ŭŢťťŒőŘŞŎŴŝŰŃĿřńƁƁłŘƊƋŒœ", (byte)64, 65);
               d[2] = NLoginCore_384.E("էԳՈՊՋԳՌՇԹ՜ՋՄ", (byte)64, 69);
               break;
            case 2:
               d[0] = NLoginCore_092.B("ŃŃŷŃżűķŌŎŐœĻŔşřŸŝƃŖŋťŻŒœ", (byte)64, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_201.A("ŔūūıĹŎİĿŨĿżĿŭťžžũśŲųţŉŇŁƏŋŜţŌſŬŲ", (byte)64, 65);
         }
      }
   }

   @Override
   public String w(String var1) {
      String var2 = NLoginCore_477.ae.a(new Object[ad]);
      int var3 = NLoginCore_477.ad.r();
      return a(ae & af, ag) + var2 + a(ah, ai) + c(var2, var3, var1);
   }

   @Override
   public boolean i(String var1, String var2) {
      String[] var3 = var2.split(a(f, h ^ j));
      if (var3.length != k) {
         return (boolean)n;
      } else {
         String var4 = var3[p];
         int var5 = Integer.parseInt(var3[q]);
         int var6 = b(var4);
         byte[] var7 = Base64.getUrlDecoder().decode(var3[s]);
         byte[] var8 = Base64.getUrlDecoder().decode(var3[v]);
         byte[] var9 = a(var4, var1.toCharArray(), var7, var5, var6);
         return a(var8, var9);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 15L;
      var1 ^= -769132196522835955L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(38 + 30),
                     (byte)(56 + 13),
                     (byte)(36 + 47),
                     (byte)(26 + 21),
                     (byte)(11 + 56),
                     (byte)(4 + 62),
                     67,
                     (byte)(25 + 22),
                     (byte)(40 + 40),
                     75,
                     (byte)(36 + 31),
                     (byte)(30 + 53),
                     (byte)(10 + 43),
                     (byte)(54 + 26),
                     (byte)(24 + 73),
                     (byte)(65 + 35),
                     (byte)(83 + 17),
                     (byte)(48 + 57),
                     (byte)(51 + 59),
                     (byte)(79 + 24)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.E("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣻࣸࣤऀࣿःआउࣷऄ࣭आࣙईࣰ", (byte)109, 69));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   @Override
   public boolean v(String var1) {
      return (boolean)w;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_375.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_375.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.A("ǎǛǚƝǝǙǔǝǨǗƤǢǦǟǢǨƪԽԺԦՂՁՅՈՋԹՆԯՈԛՊԲǅ", (byte)118, 65) + var1 + NLoginCore_173.D("Ց", (byte)118, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
