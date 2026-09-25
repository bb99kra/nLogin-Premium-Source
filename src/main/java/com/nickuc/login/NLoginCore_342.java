package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_342 {
   b(a(NLoginCore_342.v & NLoginCore_342.w, NLoginCore_342.x), a(NLoginCore_342.y, NLoginCore_342.z ^ NLoginCore_342.aa)),
   c(a(NLoginCore_342.af, NLoginCore_342.ag ^ NLoginCore_342.ah), a(NLoginCore_342.ai, NLoginCore_342.aj ^ NLoginCore_342.ak)),
   d(a(NLoginCore_342.ap, NLoginCore_342.aq ^ NLoginCore_342.ar), a(NLoginCore_342.as, NLoginCore_342.at ^ NLoginCore_342.au));

   private final String bD;
   private final String bE;
   private static String[] ZKM_STR_A = new String[NLoginCore_342.p];
   private static String[] ZKM_STR_B = new String[NLoginCore_342.q];
   private static long c;
   private static int a = 0 >>> 225 | 0 << ~225 + 1;
   private static int b = (-1 >>> 69 | -1 << -69) & -1;
   private static long d = Long.reverse(-7562755073886666454L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int g = -1 >>> 252 | -1 << -252;
   private static long h = Long.reverse(-7562755073886666454L);
   private static int i = 67108864 >>> 186 | 67108864 << ~186 + 1;
   private static int j = Integer.reverse(0);
   private static int k = Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1;
   private static int l = 192 >>> 166 | 192 << ~166 + 1;
   private static int m = Integer.reverse(0);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = Integer.reverse(1073741824);
   private static int p = 180224 >>> 206 | 180224 << -206;
   private static int q = Integer.reverse(-805306368);
   private static int r = Integer.reverse(1073741824);
   private static int s = -1 >>> 114 | -1 << ~114 + 1;
   private static long t = Long.reverse(-7562755073886666454L);
   private static int u = 0 >>> 152 | 0 << ~152 + 1;
   private static int v = (50331648 >>> 152 | 50331648 << ~152 + 1) & -1;
   private static int w = (-1 >>> 58 | -1 << -58) & -1;
   private static long x = Long.reverse(-7562755073886666454L);
   private static int y = Integer.reverse(536870912);
   private static long z = Long.reverse(5984072605243785514L);
   private static long aa = Long.reverse(-4323455642275676160L);
   private static int ab = (5242880 >>> 212 | 5242880 << ~212 + 1) & -1;
   private static int ac = Integer.reverse(-1);
   private static long ad = Long.reverse(-7562755073886666454L);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int af = Integer.reverse(1610612736);
   private static long ag = Long.reverse(5984072605243785514L);
   private static long ah = Long.reverse(-4323455642275676160L);
   private static int ai = (-2147483645 >>> 223 | -2147483645 << ~223 + 1) & -1;
   private static long aj = Long.reverse(5984072605243785514L);
   private static long ak = Long.reverse(-4323455642275676160L);
   private static int al = Integer.reverse(268435456);
   private static long am = Long.reverse(5984072605243785514L);
   private static long an = Long.reverse(-4323455642275676160L);
   private static int ao = 65536 >>> 143 | 65536 << ~143 + 1;
   private static int ap = (576 >>> 166 | 576 << -166) & -1;
   private static long aq = Long.reverse(5984072605243785514L);
   private static long ar = Long.reverse(-4323455642275676160L);
   private static int as = (80 >>> 67 | 80 << -67) & -1;
   private static long at = Long.reverse(5984072605243785514L);
   private static long au = Long.reverse(-4323455642275676160L);

   public boolean a(File var1, String var2) {
      String var3 = this.a(var1);
      return var3.equals(var2);
   }

   public String a(InputStream var1) {
      try {
         return NLoginCore_140.a(var1, this.a());
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   static {
      b();
   }

   public String a(File var1) {
      try {
         return NLoginCore_366.a(var1, this.a());
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   @Generated
   public String ag() {
      return this.bE;
   }

   @Generated
   private NLoginCore_342(String var3, String var4) {
      this.bD = var3;
      this.bE = var4;
   }

   public boolean a(InputStream var1, String var2) {
      String var3 = this.a(var1);
      return var3.equals(var2);
   }

   private static void b() {
      c = 6089937183153443018L;
      long var0 = c ^ -3673723561223497315L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(8 + 60),
               (byte)(11 + 58),
               (byte)(26 + 57),
               (byte)(8 + 39),
               (byte)(4 + 63),
               (byte)(22 + 44),
               (byte)(37 + 30),
               (byte)(28 + 19),
               (byte)(54 + 26),
               (byte)(47 + 28),
               (byte)(64 + 3),
               (byte)(61 + 22),
               53,
               80,
               (byte)(92 + 5),
               (byte)(17 + 83),
               (byte)(73 + 27),
               (byte)(62 + 43),
               (byte)(35 + 75),
               (byte)(5 + 98)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.D("ӹӘӀӚԁӷԄԌԁԄԂӕ", (byte)72, 68);
               ZKM_STR_B[1] = NLoginCore_553.B("ŶŃżŅŪƋŪŹŽƌŪŗ", (byte)72, 66);
               ZKM_STR_B[2] = NLoginCore_241.C("ӠӤӜӵөӈԁӅӡԄԎӕ", (byte)72, 67);
               ZKM_STR_B[3] = NLoginCore_446.C("ӠӤӜӵөӈԁӅӡԄԎӕ", (byte)72, 67);
               ZKM_STR_B[4] = NLoginCore_110.B("ŰŉœźņƅƀŻŬťƌŗ", (byte)72, 66);
               ZKM_STR_B[5] = NLoginCore_091.B("ƀŲŷƆŨƇŚŌŻƎŞŗ", (byte)72, 66);
               ZKM_STR_B[6] = NLoginCore_446.D("ӯԃԇӾӃӘӬӛӖԐӤӕ", (byte)72, 68);
               ZKM_STR_B[7] = NLoginCore_127.E("լԹ՜մ՜ցԺծՁ՜ցՌ", (byte)72, 69);
               ZKM_STR_B[8] = NLoginCore_141.E("ՙՖ՜՜վՋՋԶոՐ\u0557Ռ", (byte)72, 69);
               ZKM_STR_B[9] = NLoginCore_387.F("կՈՍՠՏՠԹհխևՓՌ", (byte)72, 70);
               ZKM_STR_B[10] = NLoginCore_201.B("ƁĻŁşŉŹşřƃŧōŗ", (byte)72, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.B("ŽŗƋşŴŮƀſśƄőŗ", (byte)72, 66);
               ZKM_STR_B[1] = NLoginCore_223.E("ճտրՠլբՓՌրՕէՌ", (byte)72, 69);
               ZKM_STR_B[2] = NLoginCore_183.E("ոձճոա\u0557Ր\u0557՚՞էՌ", (byte)72, 69);
               ZKM_STR_B[3] = NLoginCore_427.A("ŴŤƆŃřƊŇŠŽŭőŗ", (byte)72, 65);
               ZKM_STR_B[4] = NLoginCore_559.A("ŁŠƀŬƅƁƎšŝƆŞŗ", (byte)72, 65);
               ZKM_STR_B[5] = NLoginCore_027.A("ŹƈŁƄťƅŜƐƉőŚŗ", (byte)72, 65);
               ZKM_STR_B[6] = NLoginCore_575.C("ԂӡӧӜӛӉӛӚԉԃӾӕ", (byte)72, 67);
               ZKM_STR_B[7] = NLoginCore_076.F("ԵՍԿՊռԼ՞ե՛ՄցՌ", (byte)72, 70);
               ZKM_STR_B[8] = NLoginCore_530.A("ƆƁŷŷƅŜůŋŭŬƊśţŤŭŢƀŰůƏũťŢţ", (byte)72, 65);
               ZKM_STR_B[9] = NLoginCore_446.D("ӡԃӜӾԋԃӉӡӄԅӜӞԅӅӍӴӈԋԕӣӪԉӠӡ", (byte)72, 68);
               ZKM_STR_B[10] = NLoginCore_027.D("ӀӝԃӿӴӉӈӢӚӛӎԎӡӝӽԂӣԎԐӫӗԙӠӡ", (byte)72, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.E("՛\u0530մԻՁՐԾՌվմՂԾէջչՙևկՎ֑՜ր\u0557\u0558", (byte)72, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_384.E("ԳՖՐՍԺժՠվբքՔՓՒւքՈըցՈտ֍\u0590\u0557\u0558", (byte)72, 69);
         }
      }
   }

   public boolean g(String var1, String var2) {
      String var3 = this.w(var1);
      return var3.equals(var2);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_342.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.E("ԝԿՁԡՅդ՜ղ՞ԭիակթԲ\u0557չոհնհՅ", (byte)57, 69), NLoginCore_342.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.C("ӃӐӏҒӒӎӉӒӝӌҙӗӛӔӗӝҟࠗ\u082f࠵ࠥࠛ࠙࠳ࠡࠡࠝࠡ࠼࠾Ҹ", (byte)57, 67) + var1 + NLoginCore_138.C("Қ", (byte)57, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 35L;
      var1 ^= -3673723561223497315L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(36 + 32),
                     (byte)(40 + 29),
                     (byte)(34 + 49),
                     (byte)(20 + 27),
                     67,
                     66,
                     (byte)(19 + 48),
                     (byte)(35 + 12),
                     (byte)(52 + 28),
                     (byte)(10 + 65),
                     (byte)(2 + 65),
                     (byte)(13 + 70),
                     (byte)(14 + 39),
                     (byte)(14 + 66),
                     (byte)(37 + 60),
                     (byte)(67 + 33),
                     (byte)(60 + 40),
                     (byte)(86 + 19),
                     (byte)(60 + 50),
                     (byte)(18 + 85)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.A("ĊėĖÙęĕĐęĤēàĞĢěĞĤæўѶѼѬѢѠѺѨѨѤѨ҃҅", (byte)20, 65));
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

   public MessageDigest a() {
      try {
         return MessageDigest.getInstance(this.bD);
      } catch (NoSuchAlgorithmException var2) {
         throw new RuntimeException(var2);
      }
   }

   public String w(String var1) {
      return this.b(var1.getBytes());
   }

   public String b(byte[] var1) {
      MessageDigest var2 = this.a();
      var2.reset();
      var2.update(var1);
      byte[] var3 = var2.digest();
      String var10000 = a(a & b, d) + (var3.length << e) + a(f & g, h);
      Object[] var10001 = new Object[i];
      var10001[j] = new BigInteger(k, var3);
      return String.format(var10000, var10001);
   }
}
