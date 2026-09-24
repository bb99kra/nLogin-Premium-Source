package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_229 {
   a,
   b,
   c,
   d;

   private static String[] a = new String[NLoginCore_229.ak];
   private static String[] b = new String[NLoginCore_229.al];
   private static long c;
   private static int a = Integer.reverse(0);
   private static long b = Long.reverse(-8533289152044351052L);
   private static long d = Long.reverse(7493989779944505344L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(-2192220876706692684L);
   private static int g = 16384 >>> 173 | 16384 << ~173 + 1;
   private static long h = Long.reverse(-8533289152044351052L);
   private static long i = Long.reverse(7493989779944505344L);
   private static int j = Integer.reverse(-1073741824);
   private static long k = Long.reverse(-2192220876706692684L);
   private static int l = Integer.reverse(536870912);
   private static int m = -1 >>> 22 | -1 << ~22 + 1;
   private static long n = Long.reverse(-2192220876706692684L);
   private static int o = Integer.reverse(-1610612736);
   private static long p = Long.reverse(-8533289152044351052L);
   private static long q = Long.reverse(7493989779944505344L);
   private static int r = (402653184 >>> 122 | 402653184 << ~122 + 1) & -1;
   private static long s = Long.reverse(-2192220876706692684L);
   private static int t = Integer.reverse(-536870912);
   private static long u = Long.reverse(-8533289152044351052L);
   private static long v = Long.reverse(7493989779944505344L);
   private static int w = (268435456 >>> 153 | 268435456 << -153) & -1;
   private static long x = Long.reverse(-8533289152044351052L);
   private static long y = Long.reverse(7493989779944505344L);
   private static int z = 1152 >>> 199 | 1152 << -199;
   private static long aa = Long.reverse(-8533289152044351052L);
   private static long ab = Long.reverse(7493989779944505344L);
   private static int ac = (10240 >>> 74 | 10240 << -74) & -1;
   private static long ad = Long.reverse(-8533289152044351052L);
   private static long ae = Long.reverse(7493989779944505344L);
   private static int af = 64 >>> 36 | 64 << -36;
   private static int ag = Integer.reverse(0);
   private static int ah = 134217728 >>> 123 | 134217728 << -123;
   private static int ai = (16 >>> 67 | 16 << -67) & -1;
   private static int aj = 402653184 >>> 155 | 402653184 << -155;
   private static int ak = Integer.reverse(-268435456);
   private static int al = Integer.reverse(-268435456);
   private static int am = 184549376 >>> 56 | 184549376 << ~56 + 1;
   private static long an = Long.reverse(-2192220876706692684L);
   private static int ao = Integer.reverse(0);
   private static int ap = Integer.reverse(805306368);
   private static long aq = Long.reverse(-8533289152044351052L);
   private static long ar = Long.reverse(7493989779944505344L);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static int at = (13631488 >>> 180 | 13631488 << ~180 + 1) & -1;
   private static int au = Integer.reverse(-1);
   private static long av = Long.reverse(-2192220876706692684L);
   private static int aw = Integer.reverse(1073741824);
   private static int ax = -2147483645 >>> 254 | -2147483645 << -254;
   private static long ay = Long.reverse(-8533289152044351052L);
   private static long az = Long.reverse(7493989779944505344L);
   private static int ba = Integer.reverse(-1073741824);

   public String b(boolean var1) {
      return this.a(var1, (var0, var1x) -> var0 + var1x);
   }

   private static String a(int var0, long var1) {
      var1 ^= 22L;
      var1 ^= 6800870372164756070L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(4 + 64),
                     (byte)(10 + 59),
                     (byte)(42 + 41),
                     (byte)(18 + 29),
                     67,
                     (byte)(7 + 59),
                     67,
                     (byte)(44 + 3),
                     (byte)(54 + 26),
                     (byte)(6 + 69),
                     (byte)(9 + 58),
                     (byte)(32 + 51),
                     (byte)(44 + 9),
                     (byte)(27 + 53),
                     (byte)(91 + 6),
                     (byte)(72 + 28),
                     (byte)(93 + 7),
                     (byte)(18 + 87),
                     (byte)(15 + 95),
                     (byte)(19 + 84)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ\u0530ԳԹӻ\u0890ࡩ࢘ࡤ\u0891ࢎࢅ\u0893\u0897", (byte)0, 69));
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
      b();
   }

   public String a(boolean var1, BiFunction<String, String, String> var2) {
      switch (this) {
         case a:
            return (String)var2.apply(a(a, b ^ d), a(e, f));
         case b:
            return (String)var2.apply(a(g, h ^ i), a(j, k));
         case c:
            return (String)var2.apply(a(l & m, n), a(o, p ^ q));
         case d:
            return (String)var2.apply(a(r, s), var1 ? a(t, u ^ v) : a(w, x ^ y));
         default:
            throw new IllegalArgumentException(a(z, aa ^ ab) + this + a(ac, ad ^ ae));
      }
   }

   private static void b() {
      c = 3279690887681395089L;
      long var0 = c ^ 6800870372164756070L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(2 + 67),
               (byte)(14 + 69),
               (byte)(30 + 17),
               (byte)(65 + 2),
               (byte)(56 + 10),
               (byte)(6 + 61),
               (byte)(16 + 31),
               (byte)(65 + 15),
               (byte)(13 + 62),
               (byte)(42 + 25),
               (byte)(23 + 60),
               (byte)(7 + 46),
               (byte)(66 + 14),
               (byte)(55 + 42),
               (byte)(83 + 17),
               100,
               (byte)(96 + 9),
               110,
               (byte)(83 + 20)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_387.E("ճեկ֍ձւՔ֑պմ֒ա", (byte)93, 69);
               b[1] = NLoginCore_553.F("եւխկբ֑֔ցգֈ՛ա", (byte)93, 70);
               b[2] = NLoginCore_091.F("ւք՟֕Րձճ֍կ֎՛ա", (byte)93, 70);
               b[3] = NLoginCore_453.E("ՠժէթ\u058bխշ֘֍քֆա", (byte)93, 69);
               b[4] = NLoginCore_232.E("ճեկ֍ձւՔ֑պմ֒ա", (byte)93, 69);
               b[5] = NLoginCore_092.B("ŰƀưƴŮƨƫƚƢŹŷƁ", (byte)93, 66);
               b[6] = NLoginCore_232.F("ւք՟֕Րձճ֍կ֎՛ա", (byte)93, 70);
               b[7] = NLoginCore_575.C("ԶԆՄԂԧԙԝԡՃՋԛԯՌՇՂԞՃՔԗԫ\u0530ԲԟԠ", (byte)93, 67);
               b[8] = NLoginCore_110.B("ƨƜŽƁƈųƸƓưƻƙƻƲƈƳưƜŽƝǂǂƟƌƍ", (byte)93, 66);
               b[9] = NLoginCore_433.A("ƇƃƨƥƟƩƍƘƷƍŷƐŷƍſƬƙƛǀǁƕƶƜǄƆƼƘǌƄƋƊƫ", (byte)93, 65);
               b[10] = NLoginCore_092.A("ƦŬƇƌƣŭƆƊƚƒƘƁ", (byte)93, 65);
               b[11] = NLoginCore_553.E("ատՑՏդՓ\u0557լՙՓ՛ա", (byte)93, 69);
               b[12] = NLoginCore_433.D("ՅՃӽԕԽՁԓԼԧԌՁԔ", (byte)93, 68);
               b[13] = NLoginCore_530.E("հև֏փՒ\u0590ՏՏ\u058bը֎ա", (byte)93, 69);
               b[14] = NLoginCore_530.A("űųƧŭƂƵƈƶƸƛƅƷƫƎƕƖƸơƹƳƆƟƌƍ", (byte)93, 65);
               break;
            case 1:
               b[0] = NLoginCore_173.D("ԾԵՇԃՊԜԔӾՈԣԟԔ", (byte)93, 68);
               b[1] = NLoginCore_223.B("ŰƯƅƧŲųƵŸƕƒƚŶƽƮƭƭƎƑƻžơǅƌƍ", (byte)93, 66);
               b[2] = NLoginCore_092.E("Վլփփբ֒֎Օէքդա", (byte)93, 69);
               b[3] = NLoginCore_027.B("ƳŰƞƉƈƅŸƳƺźƄƍƔƛžƿƼƯżǂƢƏƌƍ", (byte)93, 66);
               b[4] = NLoginCore_110.C("ԎԲԠӺԕԼԣՋԇԈԹԔ", (byte)93, 67);
               b[5] = NLoginCore_092.F("Ւխ֓ծնՎ֓֗Քխզյշոը֖֞՛֛բհկլխ", (byte)93, 70);
               b[6] = NLoginCore_433.E("գ\u0590ֆ֔Ք֍կբ\u0557Ցֆա", (byte)93, 69);
               b[7] = NLoginCore_110.A("ƣųƱůƔƆƊƎưƸƋƛƙſŸƮƱƋƳƶƟƵƌƍ", (byte)93, 65);
               b[8] = NLoginCore_127.E("ֈռ՝աըՓ֘ճ\u0590֛պմ֜մ՟՟֚ի֠ճ՟֪֟֝մցմ֧֪֚֙֘", (byte)93, 69);
               b[9] = NLoginCore_553.D("ԚԖԻԸԲԼԠԫՊԠԊԣԊԠԒԿԬԮՓՔԨՏՃՈԩԺԹԽՁՠՠԟ", (byte)93, 68);
               b[10] = NLoginCore_575.A("ƄƜűŽƀƔƦŷƊƃƔƁ", (byte)93, 65);
               b[11] = NLoginCore_553.A("ƢƯƒƲƈƯųƓƸƱƍƫƬſƿƠƕƐƹżƆƵƌƍ", (byte)93, 65);
               b[12] = NLoginCore_127.E("թ՜ֈՐ֒ժմ\u0558\u0590յմ\u058cծֈ֏֊բպոչեկլխ", (byte)93, 69);
               b[13] = NLoginCore_575.C("ӽԱԓՆԱԶԽԈԝԅՂԤԢԮՆԾԠԈԢՎՙ\u0558ԟԠ", (byte)93, 67);
               b[14] = NLoginCore_110.D("ԄԆԺԀԕՈԛՉՋԮԗԯԋԺԭԾԮԶԩԷԮ\u0558ԲԲ՞ԿՊՎԟԬԛՅ", (byte)93, 68);
               break;
            case 2:
               b[0] = NLoginCore_201.A("ƣƭƱƬưƆƓƒƥƎưƒƳƫƜƙƠƂƿƃƀƸǃǂƀƊƷƛǌƜǋǌ", (byte)93, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_138.D("ՀԛԝԞԵԙԓԆԝԗԎՋԱԡԠԳԣՍԍԵՇԲԟԠ", (byte)93, 68);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_229.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.A("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 65), NLoginCore_229.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.F("՞իժԭխթդխոէԴղնկղոԺ࣏ࢨࣗࢣ࣐࣍ࣄ࣒ࣖՏ", (byte)63, 70) + var1 + NLoginCore_471.E("Ե", (byte)63, 69) + var2.toString(), var4
         );
      }
   }
}
