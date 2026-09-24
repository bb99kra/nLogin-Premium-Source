package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_195 {
   private static long br = Long.reverse(-9061982545526500820L);
   private static long c;
   private static int u = (50331648 >>> 87 | 50331648 << ~87 + 1) & -1;
   private static long n = Long.reverse(-9061982545526500820L);
   private static long ar = Long.reverse(-9061982545526500820L);
   private static int aa = 33554432 >>> 22 | 33554432 << ~22 + 1;
   private static long e = Long.reverse(-9061982545526500820L);
   private static int ag = Integer.reverse(1342177280);
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(-1);
   private static long t = Long.reverse(-9061982545526500820L);
   private static int d = Integer.reverse(-1);
   private static long q = Long.reverse(-1441151880758558720L);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = Integer.reverse(-1);
   private static int am = Integer.reverse(-1);
   private static int b = 1024 >>> 10 | 1024 << -10;
   private static int o = Integer.reverse(536870912);
   private static long af = Long.reverse(-1441151880758558720L);
   private static int s = Integer.reverse(-1);
   private static long bd = Long.reverse(-9061982545526500820L);
   private static int ab = Integer.reverse(-1);
   private static long k = Long.reverse(-9061982545526500820L);
   private static long bi = Long.reverse(7943609647424492076L);
   private static int j = -1 >>> 33 | -1 << -33;
   private static long p = Long.reverse(7943609647424492076L);
   private static long av = Long.reverse(7943609647424492076L);
   private static int bh = 4608 >>> 104 | 4608 << -104;
   private static int f = 65536 >>> 80 | 65536 << ~80 + 1;
   private static int ba = Integer.reverse(0);
   private static int bq = Integer.reverse(-939524096);
   private static long ah = Long.reverse(7943609647424492076L);
   private static int bo = (0 >>> 26 | 0 << ~26 + 1) & -1;
   private static int a = Integer.reverse(0);
   private static int bb = Integer.reverse(134217728);
   private static int x = Integer.reverse(-536870912);
   private static int be = (2228224 >>> 209 | 2228224 << -209) & -1;
   private static long y = Long.reverse(7943609647424492076L);
   private static int bt = Integer.reverse(0);
   private static int cd = 92274688 >>> 54 | 92274688 << -54;
   private static int bm = 0 >>> 218 | 0 << -218;
   private static int c = Integer.reverse(0);
   private static long ak = Long.reverse(-9061982545526500820L);
   private static long bw = Long.reverse(-9061982545526500820L);
   private static String[] a = new String[NLoginCore_195.cc];
   private static int bk = (Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31) & -1;
   private static int ap = (13 >>> 64 | 13 << ~64 + 1) & -1;
   private static int aj = Integer.reverse(-805306368);
   private static int bx = Integer.reverse(-1476395008);
   private static int bp = 0 >>> 67 | 0 << ~67 + 1;
   private static int cb = 0 >>> 69 | 0 << ~69 + 1;
   private static int i = (32 >>> 196 | 32 << ~196 + 1) & -1;
   private static long by = Long.reverse(7943609647424492076L);
   private static int au = 917504 >>> 208 | 917504 << -208;
   private static int ao = Integer.reverse(0);
   private static int bn = (2097152 >>> 245 | 2097152 << ~245 + 1) & -1;
   private static int ax = Integer.reverse(-268435456);
   private static long ac = Long.reverse(-9061982545526500820L);
   private static int al = (6144 >>> 233 | 6144 << -233) & -1;
   private static int r = 20 >>> 226 | 20 << -226;
   private static long bg = Long.reverse(-1441151880758558720L);
   private static long az = Long.reverse(-1441151880758558720L);
   private static long ay = Long.reverse(7943609647424492076L);
   private static long bj = Long.reverse(-1441151880758558720L);
   private static int ca = 16384 >>> 174 | 16384 << ~174 + 1;
   private static int bv = Integer.reverse(671088640);
   private static long bf = Long.reverse(7943609647424492076L);
   private static long h = Long.reverse(-1441151880758558720L);
   private static long v = Long.reverse(7943609647424492076L);
   private static int at = Integer.reverse(0);
   private static int cc = Integer.reverse(1744830464);
   private static int l = Integer.reverse(-1073741824);
   private static int bl = Integer.reverse(Integer.MIN_VALUE);
   private static long aw = Long.reverse(-1441151880758558720L);
   private static long ai = Long.reverse(-1441151880758558720L);
   private static long ae = Long.reverse(7943609647424492076L);
   private static long z = Long.reverse(-1441151880758558720L);
   private static long w = Long.reverse(-1441151880758558720L);
   private static int ad = Integer.reverse(-1879048192);
   private static String[] b = new String[cd];
   private static long bz = Long.reverse(-1441151880758558720L);
   private static long g = Long.reverse(7943609647424492076L);
   private static int bc = Integer.reverse(-1);
   private static int bs = 256 >>> 167 | 256 << -167;
   private static long an = Long.reverse(-9061982545526500820L);

   private static String a(int var0, long var1) {
      var1 ^= 55L;
      var1 ^= -7098136564574111160L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(57 + 11),
                     (byte)(5 + 64),
                     (byte)(46 + 37),
                     (byte)(37 + 10),
                     67,
                     (byte)(27 + 39),
                     (byte)(12 + 55),
                     (byte)(21 + 26),
                     (byte)(48 + 32),
                     (byte)(9 + 66),
                     (byte)(5 + 62),
                     (byte)(29 + 54),
                     53,
                     (byte)(39 + 41),
                     (byte)(9 + 88),
                     (byte)(56 + 44),
                     (byte)(2 + 98),
                     (byte)(45 + 60),
                     (byte)(78 + 32),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.D("ս֊։Ռ\u058cֈփ\u058c֗ֆՓ֑֕֎֑֗ՙ࣭ࣥ࣍\u08e2ࣵ࣬ࣨࣻ࣪", (byte)119, 68));
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

   static void b(NLoginType_008 var0, boolean var1) {
      NLoginCore_270 var2 = new NLoginCore_270();
      String var3 = NLoginCore_150.aC();
      NLoginCore_150.b = NLoginCore_055.b(var3);
      int var4 = !var1 && NLoginCore_477.ap.ar() ? bm : bl;
      NLoginCore_055[] var10000;
      if (var4 != 0) {
         var10000 = new NLoginCore_055[bn];
         var10000[bo] = NLoginCore_150.b;
      } else {
         var10000 = Arrays.stream(NLoginCore_055.values()).filter(var0x -> (boolean)(var0x != NLoginCore_055.x ? ca : cb)).toArray(NLoginCore_055[]::new);
      }

      NLoginCore_055[] var5 = var10000;
      NLoginCore_055[] var6 = var5;
      int var7 = var5.length;

      for (int var8 = bp; var8 < var7; var8++) {
         NLoginCore_055 var9 = var6[var8];
         NLoginCore_150.a(var0, var9);
      }

      String var10 = a(bq, br);
      Object[] var10001 = new Object[bs];
      var10001[bt] = var2.h();
      var10001[bu] = var4 != 0 ? a(bv, bw) : a(bx, by ^ bz);
      NLoginCore_370.b(var10, var10001);
   }

   public static boolean e(NLoginType_008 var0) {
      return BCryptHashProvider.a(var0, (boolean)a, (boolean)b).aQ();
   }

   static {
      b();
   }

   private static void b() {
      c = 3767921502993431670L;
      long var0 = c ^ -7098136564574111160L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(19 + 50),
               (byte)(52 + 31),
               47,
               (byte)(28 + 39),
               (byte)(38 + 28),
               (byte)(28 + 39),
               (byte)(39 + 8),
               (byte)(56 + 24),
               (byte)(16 + 59),
               (byte)(29 + 38),
               (byte)(6 + 77),
               (byte)(24 + 29),
               (byte)(51 + 29),
               (byte)(43 + 54),
               (byte)(27 + 73),
               (byte)(36 + 64),
               (byte)(17 + 88),
               (byte)(109 + 1),
               (byte)(12 + 91)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(56 + 27)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.F("շՂքշցֆ\u0558՛Սսւ\u0590սծ֕֊Սցչ֕քգՠա", (byte)81, 70);
               b[1] = NLoginCore_173.D("ԁԋӵԢӭԔӠԚԆӽԛӦԮӧԟԉԅԎӭԑԄӾӻӼ", (byte)81, 68);
               b[2] = NLoginCore_427.A("ƈƍŧŦŦƜŠƠŵƋŚƚƖƅƚũŵũƦŪƜƇŴŵ", (byte)81, 65);
               b[3] = NLoginCore_141.F("մչՓՒՒֈՌ\u058cաշՆֆւձֆՕաՕ֒Ֆֈճՠա", (byte)81, 70);
               b[4] = NLoginCore_004.B("ŷŻřřŻźƋžƑƟşũ", (byte)81, 66);
               b[5] = NLoginCore_223.D("ӾԂӠӠԂԁԒԅԘԦӦӰ", (byte)81, 68);
               b[6] = NLoginCore_446.C("ԏԔӮӭӭԣӧԧӼԒӡԨԈԁԎԟԂӭӭԈԔԤӻӼ", (byte)81, 67);
               b[7] = NLoginCore_223.C("ԏԔӮӭӭԣӧԧӼԒӡԡԝԌԡӰӼӰԭӱԣԎӻӼ", (byte)81, 67);
               b[8] = NLoginCore_141.F("Փվևղ֊֊լւպՏՍ\u0590զիֆ֔խՑ֙ա֚֙ՠա", (byte)81, 70);
               b[9] = NLoginCore_091.D("ԏԔӮӭӭԣӧԧӼԒӡӧӧԏӼԠӽԀԈԳԇԧԦԡ\u0530ԚԊԅԕԩԞӹ", (byte)81, 68);
               b[10] = NLoginCore_173.F("ԾՒ՟՜Ք։Ֆշե՛՜Օ", (byte)81, 70);
               b[11] = NLoginCore_138.B("ţŒƐůƈƜŭƞƍƂŹŜżŹšŦŪƘƝŵŨŷŴŵ", (byte)81, 66);
               b[12] = NLoginCore_451.A("ŒƇŔƌźƕŨŶųŽƢũ", (byte)81, 65);
               b[13] = NLoginCore_183.F("ԼՆՂփՙբցՃ\u058b\u0558՞ժբ՟ֈ֔խրմգ֛ծէհ֝֙իռ֒ՙլ֟գ֕֙յճ֡ւ\u058b֞֎\u058cյ", (byte)81, 70);
               b[14] = NLoginCore_575.F("չ\u0557՞աօմ\u058cդՇխհՕ", (byte)81, 70);
               b[15] = NLoginCore_575.C("ӱӞӽԌԖԐӞԘԦԞԞӪԖԀ\u0530ԮԣԱԒӴԳԔԂԖԁӬӶԴԮԖԕԡԩԑԲԁԐԯԁԽՆՄԓԐ", (byte)81, 67);
               b[16] = NLoginCore_387.A("ŚōũœŰƑůƟƑƙƘƔŞŤƨŵƆźơƃƃƇŴŵ", (byte)81, 65);
               b[17] = NLoginCore_559.B("ŪƕƛŶƛŕũūŝſƏƤƞŶšŦƛƚƅƍƙƐůŰƇũƂūŶųƩƷ", (byte)81, 66);
               b[18] = NLoginCore_127.C("ԌԔԙӽԛӶԙӲԉԁӥԗԚԡԠӯԯԆӮԄԃԎӻӼ", (byte)81, 67);
               b[19] = NLoginCore_521.A("ŹƚŭŰŕƐŴŽŘƢƅŽŰƓŴƖƇŨƤƃƥŽƠţžƏŽƵƩŮƍƬƇƃƬƗƒƚſƞƠƌƙƞƔƄƙơƨƥǌƺǅƽƔƕ", (byte)81, 65);
               b[20] = NLoginCore_451.D("ӠԃԠӿԣԂԠԟԇӤӡԔԡԬԅԡԈԮԁԱԨӾӻӼ", (byte)81, 68);
               b[21] = NLoginCore_183.E("զԹճտֈչս֍պ\u058cցըՒՍ֒օխբ֓ժ֖ճՠա", (byte)81, 69);
               break;
            case 1:
               b[0] = NLoginCore_427.D("ԒӝԟԒԜԡӳӶӨԘԠԧԌԆԫԩӹԊԀԐԍӾӻӼ", (byte)81, 68);
               b[1] = NLoginCore_004.E("զհ՚ևՒչՅտիբտծցքփըթ\u0590Փքքճՠա", (byte)81, 69);
               b[2] = NLoginCore_173.F("մչՓՒՒֈՌ\u058cաշՐ\u058cթ֎ֈժՑ։Վչֈ։ՠա", (byte)81, 70);
               b[3] = NLoginCore_397.F("մչՓՒՒֈՌ\u058cաշՐհիս֑խվգհժ֚գՠա", (byte)81, 70);
               b[4] = NLoginCore_201.F("\u0557ՆբՒ՝Ջ\u0558ստՈՙՃծֈ֏՞ժէ֊թՖճՠա", (byte)81, 70);
               b[5] = NLoginCore_387.A("ƔőƏŘųƗŲſƖŷŬũ", (byte)81, 65);
               b[6] = NLoginCore_004.A("ƈƍŧŦŦƜŠƠŵƋŤŻŞƥšŻƉŸūťſƙžƉƫƳŬƬƁųƬū", (byte)81, 65);
               b[7] = NLoginCore_451.A("ƈƍŧŦŦƜŠƠŵƋţŭƇƧŻţƫƙŵƎŧƭŴŵ", (byte)81, 65);
               b[8] = NLoginCore_232.B("ŧƒƛƆƞƞƀƖƎţşųŰŷŵƂſƛƬƩŧƨźƲŲŽƣƖŴƘƌƍ", (byte)81, 66);
               b[9] = NLoginCore_138.B("ƈƍŧŦŦƜŠƠŵƋŚŠŠƈŵƙŶŹƁƬƀƞƠƮƣơƉƕƊƯƆƕ", (byte)81, 66);
               b[10] = NLoginCore_427.B("ŲőŶŨŐƘŨŗŷƙƒƟŲŸƟƂŪžƈƀƈƇŴŵ", (byte)81, 66);
               b[11] = NLoginCore_183.F("ՏԾռ՛մֈՙ֊չծե՟ցջՆմՒև֓զղՒ։֞։ղջ֓չՙ֟֡", (byte)81, 70);
               b[12] = NLoginCore_027.E("ՠՕջ։մ՝\u058b\u058cէոՋՕ", (byte)81, 69);
               b[13] = NLoginCore_471.B("ŐŚŖƗŭŶƕŗƟŬŲžŶųƜƨƁƔƈŷƯƂŻƄƱƭſƐƦŭƀƳƔƦƤŹŵƟƋƓƽƺƮƉ", (byte)81, 66);
               b[14] = NLoginCore_559.E("գչցթԼսա֊ռժֆՕ", (byte)81, 69);
               b[15] = NLoginCore_387.B("ŪŗŶƅƏƉŗƑƟƗƗţƏŹƩƧƜƪƋŭƬƍŻƏźťůƭƧƏƎƚƅƷƱƴƏƏƝǀƹƜǂƞƹƾƹƉƗƦƽƠƺƽƔƕ", (byte)81, 66);
               b[16] = NLoginCore_575.C("ӡӔӰӚӷԘӶԦԘԠԝӬԣԞԜӧԆԞԦӭԶӮԆӮԓԋԲԭӼӶӹԳ", (byte)81, 67);
               b[17] = NLoginCore_173.B("ŪƕƛŶƛŕũūŝſƏƤƞŶšŦƛƚƅƍƙƎůƃűƤưſƇƋƈƯƍƥƍƕƴƬƉƹƘŽƤƉ", (byte)81, 66);
               b[18] = NLoginCore_127.A("ƅƍƒŶƔůƒūƂźŜŵţŢƑŽƆƞƦƍžƇŴŵ", (byte)81, 65);
               b[19] = NLoginCore_027.E("եֆՙ՜ՁռՠթՄ֎ձթ՜տՠւճՔ\u0590կ֑թ\u058cՏժջթ֡֕՚չ֘ճկ֘փվֆի֊\u058cոֆժ\u058bր֢֧հֵ֢֮լ֓րց", (byte)81, 69);
               b[20] = NLoginCore_183.B("řżƙŸƜŻƙƘƀŝŖśƝžŧŨƀƣƌƁƇƭŴŵ", (byte)81, 66);
               b[21] = NLoginCore_530.B("źōƇƓƜƍƑơƎƠƔƎƚŽųšƤƆƗƩŧƭžƨƐƒŽƔƦƓƢƧ", (byte)81, 66);
               break;
            case 2:
               b[0] = NLoginCore_076.D("ӪԘԑӜӢӘԙӟӱӴԥӨԧԘԮԁԮԜԏӪӾӾӻӼ", (byte)81, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.E("դվՙՓ\u058bթքՙ՛ՊսՍֆռծՌժ\u0590ՑՑ֎ղՖ֙կկՖ։սրսգ", (byte)81, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_195.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.B("ŽƟơƁƥǄƼǒƾƍǋǁǏǉƒƷǙǘǐǖǐƥ", (byte)107, 66), NLoginCore_195.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.D("ՙզեԨըդ՟ըճբԯխձժխճԵࣉࣁࢩࢾ࣑ࣈࣄࣗࣆՊ", (byte)107, 68) + var1 + NLoginCore_091.D("\u0530", (byte)107, 68) + var2.toString(), var4
         );
      }
   }

   public static NLoginCore_515 a(NLoginInterface_011<?> var0, NLoginCore_219 var1, String var2, boolean var3) {
      return a(var0, var1, var2, null, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static NLoginCore_515 a(NLoginInterface_011<?> var0, NLoginCore_219 var1, String var2, @Nullable NLoginCore_055 var3, boolean var4) {
      if (var1.r() && !var4) {
         return NLoginCore_515.a;
      } else {
         if (var3 == null) {
            NLoginCore_556 var5 = NLoginCore_303.a();
            if (var5 != null) {
               switch (NLoginCore_255.af[var5.ordinal()]) {
                  case 1:
                     var3 = NLoginCore_055.m;
                     break;
                  case 2:
                     var3 = NLoginCore_055.d;
                     break;
                  case 3:
                     var3 = NLoginCore_055.e;
                     break;
                  case 4:
                     var3 = NLoginCore_055.c;
                     break;
                  case 5:
                     var3 = NLoginCore_055.g;
               }
            }
         }

         if (var3 == null) {
            File var8 = new File(var0.c().getParentFile(), a(c & d, e));
            if (var8.exists() && var8.isDirectory()) {
               NLoginCore_219 var6 = new NLoginCore_219(a(f, g ^ h), var8);
               if (var6.p(a(i & j, k))) {
                  String var7 = var6.b(a(l & m, n));
                  if (var7 != null) {
                     if (!var7.endsWith(a(o, p ^ q))) {
                        var7 = var7 + a(r & s, t);
                     }

                     var3 = NLoginCore_055.b(var7);
                  }
               }
            }
         }

         if (var3 == null) {
            String var9 = var0.a().a(a(u, v ^ w), var0.a().a(a(x, y ^ z), a(aa & ab, ac)));
            var3 = NLoginCore_055.b(var9);
         }

         if (var4) {
            NLoginCore_055 var10 = NLoginCore_055.a(var1.a((String)a(ad, ae ^ af)));
            if (var10 == var3) {
               return NLoginCore_515.a;
            }

            File var11 = var1.d();
            File var12 = NLoginCore_366.a(var11, NLoginCore_366.c(var11) + a(ag, ah ^ ai));
            if (!var11.renameTo(var12)) {
               NLoginCore_370.c(a(aj, ak) + var11.getAbsolutePath() + a(al & am, an) + var12.getAbsolutePath());
               return NLoginCore_515.b;
            }
         }

         StringBuilder var10001 = new StringBuilder().append(a(ap & aq, ar));
         Object[] var10003 = new Object[as];
         var10003[at] = var3.cP;
         if (var1.o(var10001.append(String.format(var2, var10003)).toString())) {
            NLoginCore_370.b(a(au, av ^ aw) + var1.d().getName() + a(ax, ay ^ az));
            if (a(bb & bc, bd).equals(var2) || a(be, bf ^ bg).equals(var2)) {
               var0.a().a().a(a(bh, bi ^ bj), (boolean)bk).ag();
            }
         }

         return NLoginCore_515.a;
      }
   }
}
