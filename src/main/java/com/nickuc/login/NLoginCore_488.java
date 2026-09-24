package com.nickuc.login;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_488 {
   private static String[] b = new String[NLoginCore_488.af];
   private static int r = Integer.reverse(-1610612736);
   private static long u = Long.reverse(-3118583018860398773L);
   private static int b = Integer.reverse(0);
   private static long aa = Long.reverse(-720575940379279360L);
   private static long ad = Long.reverse(-3118583018860398773L);
   private static int f = 0 >>> 209 | 0 << -209;
   private static int g = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191;
   private static long n = Long.reverse(-720575940379279360L);
   private static int ab = Integer.reverse(-1879048192);
   private static int y = (16777216 >>> 181 | 16777216 << -181) & -1;
   private static int l = (1610612736 >>> 125 | 1610612736 << ~125 + 1) & -1;
   private static long m = Long.reverse(2501909316097980235L);
   private static int t = 3 >>> 31 | 3 << ~31 + 1;
   private static long q = Long.reverse(-720575940379279360L);
   private static int o = Integer.reverse(536870912);
   private static int h = (-1 >>> 143 | -1 << ~143 + 1) & -1;
   private static long s = Long.reverse(-3118583018860398773L);
   private static long p = Long.reverse(2501909316097980235L);
   private static int ae = 2560 >>> 200 | 2560 << -200;
   private static long k = Long.reverse(-3118583018860398773L);
   private static long d = Long.reverse(2501909316097980235L);
   private static int v = (14680064 >>> 245 | 14680064 << -245) & -1;
   private static int af = 2560 >>> 8 | 2560 << -8;
   private static int j = (1 >>> 223 | 1 << ~223 + 1) & -1;
   private static int ac = (-1 >>> 139 | -1 << -139) & -1;
   private static long i = Long.reverse(-3118583018860398773L);
   private static long z = Long.reverse(2501909316097980235L);
   private static long c;
   private static long x = Long.reverse(-3118583018860398773L);
   private static int a = Integer.reverse(1073741824);
   private static String[] a = new String[ae];
   private static int w = -1 >>> 159 | -1 << -159;
   private static long e = Long.reverse(-720575940379279360L);

   private static String a(int var0, long var1) {
      var1 ^= 111L;
      var1 ^= 1852539058544358666L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(67 + 2),
                     83,
                     (byte)(13 + 34),
                     (byte)(65 + 2),
                     (byte)(24 + 42),
                     (byte)(14 + 53),
                     (byte)(24 + 23),
                     (byte)(26 + 54),
                     (byte)(34 + 41),
                     (byte)(30 + 37),
                     (byte)(17 + 66),
                     (byte)(44 + 9),
                     (byte)(11 + 69),
                     (byte)(75 + 22),
                     (byte)(45 + 55),
                     (byte)(88 + 12),
                     (byte)(81 + 24),
                     (byte)(70 + 40),
                     (byte)(54 + 49)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘңңҭҥҖҲҥґҧғҷ", (byte)45, 65));
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

   public static byte[] a(NLoginCore_305 var0, byte[] var1) {
      var0.k(a(v & w, x), a(y, z ^ aa));

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         GZIPOutputStream var3 = new GZIPOutputStream(var2);

         try {
            var3.write(var1);
         } catch (Throwable var7) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         var3.close();
         return var2.toByteArray();
      } catch (IOException var8) {
         throw new RuntimeException(a(ab & ac, ad), var8);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_488.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.B("ůƑƓųƗƶƮǄưſƽƳǁƻƄƩǋǊǂǈǂƗ", (byte)100, 66), NLoginCore_488.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.A("ƪƷƶŹƹƵưƹǄƳƀƾǂƻƾǄƆԑԑԛԓԄԠԓӿԕԁԥƝ", (byte)100, 65) + var1 + NLoginCore_004.A("Ɓ", (byte)100, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -3247866681111274172L;
      long var0 = c ^ 1852539058544358666L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(6 + 62),
               (byte)(6 + 63),
               (byte)(14 + 69),
               (byte)(3 + 44),
               (byte)(52 + 15),
               (byte)(24 + 42),
               67,
               (byte)(28 + 19),
               (byte)(47 + 33),
               75,
               (byte)(53 + 14),
               (byte)(27 + 56),
               (byte)(35 + 18),
               (byte)(41 + 39),
               (byte)(63 + 34),
               (byte)(16 + 84),
               (byte)(4 + 96),
               (byte)(98 + 7),
               (byte)(93 + 17),
               (byte)(29 + 74)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.C("ҕѸҘҍѸѻҡ҃ѽѢҔҤѸҢҀѶҬҡҚҨҰғҨѦ҂ҒҮҋҡҖ҆ҹғҨҼҌҘһҷҌѽҥҕӃӂҚ҂҃ӀӎқҿҢҚҗҘ", (byte)37, 67);
               b[1] = NLoginCore_110.F("ՌԴԥԵԞՏԙԵԻ\u0530Ւԩ", (byte)37, 70);
               b[2] = NLoginCore_173.F("Ԛԍ՜ՐԵ\u0530աԴ\u0530ՒՂԝԴԣԥՈՄԥՄՍ՞՜դԼղաԿՓ՟ԵՏզ", (byte)37, 70);
               b[3] = NLoginCore_201.E("ՔՓԵ\u0557Ԭԭ՝ՍԿՕԛԩ", (byte)37, 69);
               b[4] = NLoginCore_471.B("ĵĜŁčþŅăĝēĦĶđ", (byte)37, 66);
               b[5] = NLoginCore_076.E("ԥԭԶ՝ԹՓԟԗՔՖ՚ԩ", (byte)37, 69);
               b[6] = NLoginCore_387.E("ՔՓԵ\u0557Ԭԭ՝ՍԿՕԛԩ", (byte)37, 69);
               b[7] = NLoginCore_530.B("ķŃĖěłĹĥĪĔĶĭġĶĊőŋņĊŔĽĿĿĬďĕřŕŗŝŞıē", (byte)37, 66);
               b[8] = NLoginCore_241.C("ҝљѴҙѮҞѽћҁҡ҇Ѭ", (byte)37, 67);
               b[9] = NLoginCore_433.E("ԔՅԪՅԲԹԟԛԴԠՓԵաըԤՕ՟՚ՠԶՠԾՀլէՌՄՂԭՑՈըԷՑՌԴտն՟ՠՔլպՉ", (byte)37, 69);
               break;
            case 1:
               b[0] = NLoginCore_433.F("ՒԵՕՊԵԸ՞ՀԺԟՑաԵ՟ԽԳթ՞\u0557եխՐեԣԿՏիՈ՞ՓՃնՐեչՉՕոմՉԺբՑՀեզ՚ձըՁՋռռհ\u058bեՈվ֑֎գՕՎո", (byte)37, 70);
               b[1] = NLoginCore_092.A("ÿûĵďąńłĥĵłłđ", (byte)37, 65);
               b[2] = NLoginCore_241.C("ѝѐҟғѸѳҤѷѳҕ҅ѠѷѦѨҋ҇Ѩ҇ҐҡқҝѦҬ҄ѿҢҩүѺҭ", (byte)37, 67);
               b[3] = NLoginCore_324.B("ĔúėĥĔĄĕĈĽńćđ", (byte)37, 66);
               b[4] = NLoginCore_521.C("ѵѫѺґ҂ѯҏҒ҅ҧѢѬ", (byte)37, 67);
               b[5] = NLoginCore_173.C("ѬћѕѺѸћқғҞҔ҇Ѭ", (byte)37, 67);
               b[6] = NLoginCore_575.F("Ԣ\u0558Ւԓ\u0557ՊՖՍԟԫՙՀԲԟԲԳՈԼԫգԮ՝ԴԵ", (byte)37, 70);
               b[7] = NLoginCore_446.D("ҒҞѱѶҝҔҀ҅ѯґ҈ѼґѥҬҦҡѥүҘҚҊѲѪ҃ѰҷҡҪ҈ҍѹ", (byte)37, 68);
               b[8] = NLoginCore_004.A("üĺĄĢŇēļĆĨĪċđ", (byte)37, 65);
               b[9] = NLoginCore_232.D("ї҈ѭ҈ѵѼѢўѷѣҖѸҤҫѧҘҢҝңѹңҁ҃үҪҏ҇҅ѰҔҋҫѸѵҒҡҒҕҤғҭҮҢҢҷӋһӍҵҞӊ҈ӌҪҗҘ", (byte)37, 68);
               break;
            case 2:
               b[0] = NLoginCore_138.C("ҙѽҖҌҐҀғўџ҅ѣџҘҦѩўѵҚң҅ҠҠѷѸ", (byte)37, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.A("ĸĸķĖķİĄĸėĕōÿňęğōōŔĔĞņŕĜĝ", (byte)37, 65);
         }
      }
   }

   public static byte[] a(Object... var0) {
      if (var0.length % a != 0) {
         throw new IllegalArgumentException(a(b, d ^ e));
      } else {
         StringBuilder var1 = new StringBuilder();

         for (int var2 = f; var2 < var0.length; var2++) {
            if (var1.length() > 0) {
               var1.append(a(g & h, i));
            }

            Object var3 = var0[var2++];
            if (var3 == null) {
               throw new IllegalArgumentException(a(j, k));
            }

            Object var4 = var0[var2];

            try {
               var1.append(URLEncoder.encode(var3.toString(), a(l, m ^ n)))
                  .append(a(o, p ^ q))
                  .append(URLEncoder.encode(var4 == null ? a(r, s) : var4.toString(), a(t, u)));
            } catch (UnsupportedEncodingException var6) {
               throw new RuntimeException(var6);
            }
         }

         return var1.toString().getBytes(StandardCharsets.UTF_8);
      }
   }

   static {
      b();
   }
}
