package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_246 {
   private static String[] a = new String[NLoginCore_246.y];
   private static int r = Integer.reverse(536870912);
   private static int k = Integer.reverse(0);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long p = Long.reverse(-2940184331469415262L);
   private static int q = 2048 >>> 171 | 2048 << ~171 + 1;
   private static long f = Long.reverse(-2940184331469415262L);
   private static int m = (0 >>> 230 | 0 << -230) & -1;
   private static int u = 10240 >>> 11 | 10240 << ~11 + 1;
   private static long h = Long.reverse(-2940184331469415262L);
   private static int t = 33554432 >>> 119 | 33554432 << ~119 + 1;
   private static int x = Integer.reverse(1073741824);
   private static int y = Integer.reverse(1610612736);
   private static int i = (512 >>> 103 | 512 << -103) & -1;
   private static int a = Integer.reverse(0);
   private static int z = Integer.reverse(1610612736);
   private static final SecureRandom a = new SecureRandom();
   private static long b = Long.reverse(-1643147638786712414L);
   private static int o = (-1073741824 >>> 222 | -1073741824 << ~222 + 1) & -1;
   private static int g = Integer.reverse(1073741824);
   private static String[] b = new String[z];
   private static int n = 512 >>> 231 | 512 << ~231 + 1;
   private static long d = Long.reverse(4467570830351532032L);
   private static long c;
   private static long v = Long.reverse(-1643147638786712414L);
   private static long w = Long.reverse(4467570830351532032L);
   private static int j = Integer.reverse(536870912);
   private static int l = (0 >>> 236 | 0 << -236) & -1;
   private static long s = Long.reverse(-2940184331469415262L);

   public static byte[] d(byte[] var0, Key var1) {
      try {
         return e(var0, var1);
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(a(r, s), var3);
      }
   }

   public static byte[] a(String var0, Key var1) {
      return d(Base64.getDecoder().decode(var0), var1);
   }

   static {
      b();
   }

   private static void b() {
      c = 4988045712076459159L;
      long var0 = c ^ 2388747609373501624L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(15 + 53),
               (byte)(10 + 59),
               (byte)(20 + 63),
               (byte)(12 + 35),
               67,
               (byte)(48 + 18),
               (byte)(50 + 17),
               (byte)(17 + 30),
               (byte)(63 + 17),
               (byte)(36 + 39),
               (byte)(49 + 18),
               (byte)(55 + 28),
               53,
               (byte)(8 + 72),
               (byte)(95 + 2),
               (byte)(54 + 46),
               (byte)(80 + 20),
               (byte)(41 + 64),
               (byte)(12 + 98),
               (byte)(2 + 101)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.A("ǠǨǜǳƱǋǈǭưƹǆƿ", (byte)124, 65);
               b[1] = NLoginCore_110.D("֚֒֎֥գսպ֟բիոձ", (byte)124, 68);
               b[2] = NLoginCore_427.B("ǉƩƬƭǡǟǣǑǖǡǉǄǜǔǙǺǲƷǻǳƶǁǄȃȃǗǝǛǆȂȄȏǺǙǠǮǯǽȊǟǐǴȈǟ", (byte)124, 66);
               b[3] = NLoginCore_324.F("ִ֡֩֝ղ\u058c։֮ձպևր", (byte)124, 70);
               b[4] = NLoginCore_427.B("ǉƩƬƭǡǟǣǑǖǡǇƻƺǊǇǎǿǟǪǛǄȃƸǱǺǤǴǩǽǙǖǎȑȉȐǻǧǾǫȂǢǣǮǟ", (byte)124, 66);
               b[5] = NLoginCore_433.D("֚֒֎֥գսպ֟բիոձ", (byte)124, 68);
               break;
            case 1:
               b[0] = NLoginCore_575.A("ǡǏǌǌǎǧǔǭǹǤǂƿ", (byte)124, 65);
               b[1] = NLoginCore_183.D("շւ՟շֆ֤֞՟փզ֪ձ", (byte)124, 68);
               b[2] = NLoginCore_241.E("֊ժխծ֢֤֢֠֒֗֊օֳֻ֚֝֕ոִּշւօׄׄ֘֞֜և׃ׅא\u05cbּד־֤֕\u0590֊ֲ\u0590֚֠", (byte)124, 69);
               b[3] = NLoginCore_232.B("ǚưƾǔǦǧǆǎǏǹǴƿ", (byte)124, 66);
               b[4] = NLoginCore_397.C("ջ՛՞՟֑֓֕փֈ֓չխլռչրֱ֑֜֍նֵժ֣֖֦֛֬֯\u058bֈր׃փ֟֓ց֗ւׂ֛֦֑֔", (byte)124, 67);
               b[5] = NLoginCore_521.A("ƽǢǒǐǃǔǞƩƪǡƱƿ", (byte)124, 65);
               break;
            case 2:
               b[0] = NLoginCore_387.A("ǭǌǡǞǡǲǂǲǯǊǶǧƷǅǹǷǍǹǏǴǏȀȃǴǀȇǁȋǹǗǋȃ", (byte)124, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_397.E("֜֓կկսֱ֔օִ֖֢֪֭֩֍֊ֵ֘֍֘֟֞\u058b\u058c", (byte)124, 69);
         }
      }
   }

   public static PublicKey a(byte[] var0) {
      KeyFactory var1 = KeyFactory.getInstance(a(a, b ^ d));
      X509EncodedKeySpec var2 = new X509EncodedKeySpec(var0);
      return var1.generatePublic(var2);
   }

   public static byte[] c(byte[] var0, Key var1) {
      Cipher var2 = Cipher.getInstance(a(o, p));
      var2.init(q, var1);
      return var2.doFinal(var0);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_246.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.E("ՒմնՖպ֑֧֙֓բ֖֤֠֞է\u058c֥֥֭֮֫պ", (byte)110, 69), NLoginCore_246.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.D("բկծԱձխըձռիԸնպճնռԾࣕࢥ࣑࣊࣍ࣚࣞ࣋࣎Փ", (byte)110, 68) + var1 + NLoginCore_004.F("դ", (byte)110, 70) + var2.toString(), var4
         );
      }
   }

   public static byte[] a(byte[] var0, Key var1) {
      try {
         return b(var0, var1);
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(a(g, h), var3);
      }
   }

   public static PrivateKey a(byte[] var0) {
      KeyFactory var1 = KeyFactory.getInstance(a(e, f));
      PKCS8EncodedKeySpec var2 = new PKCS8EncodedKeySpec(var0);
      return var1.generatePrivate(var2);
   }

   public static byte[] f(byte[] var0, Key var1) {
      Cipher var2 = Cipher.getInstance(a(u, v ^ w));
      var2.init(x, var1);
      return var2.doFinal(var0);
   }

   public static byte[] e(byte[] var0, Key var1) {
      byte[] var2 = f(var0, var1);
      return Arrays.copyOfRange(var2, t, var2.length);
   }

   public static byte[] b(byte[] var0, Key var1) {
      byte[] var2 = new byte[var0.length + i];
      byte[] var3 = new byte[j];
      a.nextBytes(var3);
      System.arraycopy(var3, k, var2, l, var3.length);
      System.arraycopy(var0, m, var2, n, var0.length);
      return c(var2, var1);
   }

   public static String a(byte[] var0, Key var1) {
      return Base64.getEncoder().encodeToString(a(var0, var1));
   }

   private static String a(int var0, long var1) {
      var1 ^= 124L;
      var1 ^= 2388747609373501624L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(54 + 14),
                     (byte)(41 + 28),
                     (byte)(23 + 60),
                     (byte)(42 + 5),
                     (byte)(24 + 43),
                     (byte)(17 + 49),
                     (byte)(42 + 25),
                     (byte)(29 + 18),
                     (byte)(24 + 56),
                     (byte)(49 + 26),
                     (byte)(19 + 48),
                     83,
                     (byte)(17 + 36),
                     (byte)(69 + 11),
                     (byte)(3 + 94),
                     100,
                     (byte)(42 + 58),
                     (byte)(90 + 15),
                     (byte)(42 + 68),
                     (byte)(64 + 39)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.A("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸӏҟӄӇӔӘӋӅӈ", (byte)61, 65));
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
}
