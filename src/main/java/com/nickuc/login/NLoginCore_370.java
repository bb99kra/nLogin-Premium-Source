package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_370 {
   private static int bg = Integer.reverse(1879048192);
   private static long bh = Long.reverse(7194391655466613771L);
   private static int ah = -1 >>> 225 | -1 << ~225 + 1;
   private static long ax = Long.reverse(7194391655466613771L);
   private static int ca = (-1 >>> 106 | -1 << ~106 + 1) & -1;
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int t = (536870912 >>> 29 | 536870912 << -29) & -1;
   private static long c;
   private static int o = -1 >>> 223 | -1 << ~223 + 1;
   private static int g = 2048 >>> 107 | 2048 << ~107 + 1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int bn = Integer.reverse(134217728);
   private static long m = Long.reverse(5320894210480487435L);
   private static int s = 0 >>> 31 | 0 << -31;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long aq = Long.reverse(3026418949592973312L);
   private static int bw = Integer.reverse(0);
   private static long bi = Long.reverse(3026418949592973312L);
   private static int h = Integer.reverse(0);
   private static int am = (58720256 >>> 215 | 58720256 << ~215 + 1) & -1;
   private static long be = Long.reverse(7194391655466613771L);
   private static long bl = Long.reverse(7194391655466613771L);
   private static int r = (256 >>> 8 | 256 << -8) & -1;
   private static int bj = (0 >>> 120 | 0 << ~120 + 1) & -1;
   private static int v = (536870912 >>> 221 | 536870912 << -221) & -1;
   private static long ay = Long.reverse(3026418949592973312L);
   private static long ai = Long.reverse(5320894210480487435L);
   private static int at = (10485760 >>> 244 | 10485760 << ~244 + 1) & -1;
   private static long an = Long.reverse(5320894210480487435L);
   private static long bm = Long.reverse(3026418949592973312L);
   private static int n = (393216 >>> 177 | 393216 << -177) & -1;
   private static long bs = Long.reverse(5320894210480487435L);
   private static int aj = Integer.reverse(1610612736);
   private static long ae = Long.reverse(7194391655466613771L);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static long bc = Long.reverse(3026418949592973312L);
   private static int a = 0 >>> 173 | 0 << ~173 + 1;
   private static int au = (-1 >>> 29 | -1 << -29) & -1;
   private static int q = (0 >>> 67 | 0 << -67) & -1;
   private static int l = Integer.reverse(-1);
   private static int bx = Integer.reverse(671088640);
   private static int br = -1 >>> 47 | -1 << -47;
   private static int y = 134217728 >>> 219 | 134217728 << -219;
   private static String D = a(NLoginCore_370.bz & ca, NLoginCore_370.cb);
   private static long cb = Long.reverse(5320894210480487435L);
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int by = Integer.reverse(671088640);
   private static long d = Long.reverse(5320894210480487435L);
   private static long bb = Long.reverse(7194391655466613771L);
   private static int bd = 832 >>> 134 | 832 << -134;
   private static long as = Long.reverse(5320894210480487435L);
   private static long al = Long.reverse(3026418949592973312L);
   private static int b = (-1 >>> 214 | -1 << -214) & -1;
   private static long af = Long.reverse(3026418949592973312L);
   private static NLoginInterface_011<?> a;
   private static boolean Z = (NLoginCore_370 != 0).cc;
   private static long j = Long.reverse(5320894210480487435L);
   private static long ak = Long.reverse(7194391655466613771L);
   private static int w = Integer.reverse(0);
   private static int z = (0 >>> 24 | 0 << ~24 + 1) & -1;
   private static long av = Long.reverse(5320894210480487435L);
   private static int bv = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(0);
   private static int bz = (637534208 >>> 153 | 637534208 << -153) & -1;
   private static boolean aa = (NLoginCore_370 != 0).cd;
   private static int cd = Integer.reverse(Integer.MIN_VALUE);
   private static long bo = Long.reverse(5320894210480487435L);
   private static long p = Long.reverse(5320894210480487435L);
   private static int ar = 2359296 >>> 242 | 2359296 << -242;
   private static long bf = Long.reverse(3026418949592973312L);
   private static int ab = (33554432 >>> 153 | 33554432 << ~153 + 1) & -1;
   private static int ao = Integer.reverse(268435456);
   private static int cc = (524288 >>> 147 | 524288 << ~147 + 1) & -1;
   private static int aa = 0 >>> 102 | 0 << -102;
   private static int aw = Integer.reverse(-805306368);
   private static int f = (0 >>> 35 | 0 << -35) & -1;
   private static long ap = Long.reverse(7194391655466613771L);
   private static final Set<NLoginInterface_016> m = ConcurrentHashMap.newKeySet();
   private static long bu = Long.reverse(5320894210480487435L);
   private static int ba = (12 >>> 192 | 12 << -192) & -1;
   private static PrintWriter a;
   private static int k = (256 >>> 103 | 256 << -103) & -1;
   private static int bk = Integer.reverse(-268435456);
   private static int ad = (1048576 >>> 242 | 1048576 << -242) & -1;
   private static String[] ZKM_STR_A = new String[bx];
   private static int bp = (32 >>> 165 | 32 << ~165 + 1) & -1;
   private static int bt = 1073741826 >>> 29 | 1073741826 << -29;
   private static int ag = (2621440 >>> 19 | 2621440 << -19) & -1;
   private static boolean ab;
   private static int bq = Integer.reverse(-2013265920);
   private static String[] ZKM_STR_B = new String[by];

   public static void c(String var0, Object... var1) {
      b(var0, null, var1);
      if (var0 != null && var0.contains("By:") && var0.contains("nickuc.com")) {
         c("  Thanks for using Black-Minecraft.com");
      }
   }

   public static void a(Throwable var0) {
      var0.printStackTrace();
      if (a != null) {
         var0.printStackTrace(a);
         a.flush();
      }
   }

   public static void e(String var0, Object... var1) {
      d(var0, null, var1);
      if (var0 != null && var0.contains("By:") && var0.contains("nickuc.com")) {
         e("  Thanks for using Black-Minecraft.com");
      }
   }

   public static void close() {
      if (a != null) {
         a.flush();
         a.close();
         a = null;
      }
   }

   public static void a(String var0, String... var1) {
      m.stream().filter(var0x -> var0x instanceof NLoginCore_439).findFirst().ifPresent(var2 -> ((NLoginCore_439)var2).a(var0, var1));
   }

   private static void a(NLoginCore_145 var0, String var1, @Nullable Throwable var2, boolean var3) {
      if (a != null) {
         try {
            if (var2 != null) {
               var2.printStackTrace(a);
            }

            NLoginCore_189 var4 = new NLoginCore_189();
            String var5 = a(ad, ae ^ af)
               + var4.an()
               + a(ag & ah, ai)
               + var4.am()
               + a(aj, ak ^ al)
               + var4.al()
               + a(am, an)
               + var4.ak()
               + a(ao, ap ^ aq)
               + var4.aj()
               + a(ar, as)
               + var4.ai()
               + a(at & au, av)
               + var0.toString()
               + a(aw, ax ^ ay)
               + (var3 ? NLoginCore_065.c(var1, (az != 0)) : var1);
            a.println(var5);
         } finally {
            a.flush();
         }
      }
   }

   public static void c(String var0, @Nullable Throwable var1, Object... var2) {
      if (var2.length > 0) {
         var0 = String.format(var0, var2);
      }

      if (Z) {
         a(NLoginCore_145.d, var0, var1);
      } else {
         if (!aa) {
            var0 = NLoginCore_065.c(var0, (v != 0));
         }

         a.a().b(var0, var1);
         a(NLoginCore_145.d, var0, var1, aa);
      }
   }

   public static void a(NLoginInterface_016 var0, NLoginInterface_016... var1) {
      m.add(var0);
      m.addAll(Arrays.asList(var1));
   }

   private static String a(int var0, long var1) {
      var1 ^= 84L;
      var1 ^= 7880861573352966726L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(31 + 37),
                     (byte)(52 + 17),
                     (byte)(3 + 80),
                     (byte)(12 + 35),
                     (byte)(39 + 28),
                     (byte)(21 + 45),
                     (byte)(14 + 53),
                     (byte)(18 + 29),
                     (byte)(6 + 74),
                     (byte)(58 + 17),
                     (byte)(39 + 28),
                     (byte)(36 + 47),
                     (byte)(22 + 31),
                     (byte)(12 + 68),
                     97,
                     (byte)(25 + 75),
                     (byte)(29 + 71),
                     105,
                     (byte)(99 + 11),
                     (byte)(3 + 100)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.F("ւ֏֎Ց֑֍ֈ֑֜\u058b\u0558֖֖֚֓֜՞ࣸࣄࣱࣱ࣭ࣻࣷࣿࣿँࣣࣕ", (byte)99, 70));
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

   public static void b(String var0, @Nullable Throwable var1, Object... var2) {
      if (var2.length > 0) {
         var0 = String.format(var0, var2);
      }

      if (Z) {
         a(NLoginCore_145.c, var0, var1);
      } else {
         if (!aa) {
            var0 = NLoginCore_065.c(var0, (t != 0));
         }

         a.a().a(var0, var1);
         a(NLoginCore_145.c, var0, var1, aa);
      }
   }

   public static void a(NLoginCore_145 var0, String var1, @Nullable Throwable var2, Object... var3) {
      if (var3.length > 0) {
         var1 = String.format(var1, var3);
      }

      if (var2 != null) {
         var2.printStackTrace();
      }

      if (a == null) {
         String var4 = NLoginCore_065.c(var1, (y != 0));
         System.out.println(var0.b(var4, (z != 0)));
         a(var0, var4, var2, (aa != 0));
      } else {
         a.b().a().k(var0.b(var1, (ab != 0)));
         a(var0, var1, var2, (ac != 0));
      }
   }

   @Generated
   public static boolean aj() {
      return ab;
   }

   public static void d(String var0, Object... var1) {
      c(var0, null, var1);
      if (var0 != null && var0.contains("By:") && var0.contains("nickuc.com")) {
         d("  Thanks for using Black-Minecraft.com");
      }
   }

   public static void d(String var0, @Nullable Throwable var1, Object... var2) {
      if (var2.length > 0) {
         var0 = String.format(var0, var2);
      }

      if (Z) {
         a(NLoginCore_145.a, var0, var1);
      } else {
         if (!aa) {
            var0 = NLoginCore_065.c(var0, (x != 0));
         }

         a.a().q(var0);
         a(NLoginCore_145.a, var0, var1, aa);
      }
   }

   public static void f(String var0, Object... var1) {
      a(NLoginCore_145.a, var0, null, var1);
      if (var0 != null && var0.contains("By:") && var0.contains("nickuc.com")) {
         f("  Thanks for using Black-Minecraft.com");
      }
   }

   public static void a(String var0, @Nullable Throwable var1, Object... var2) {
      if (var2.length > 0) {
         var0 = String.format(var0, var2);
      }

      if (ab) {
         d(NLoginCore_145.b.bl + NLoginCore_145.b.bk + var0, var1);
      } else {
         a(NLoginCore_145.b, var0, var1, (r != 0));
      }
   }

   public static void b(String var0, Object... var1) {
      a(var0, null, var1);
      if (var0 != null && var0.contains("By:") && var0.contains("nickuc.com")) {
         b("  Thanks for using Black-Minecraft.com");
      }
   }

   @Generated
   public static void f(boolean var0) {
      ab = var0;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_370.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.E("ԙԻԽԝՁՠ\u0558ծ՚ԩէ՝իեԮՓյմլղլՁ", (byte)53, 69), NLoginCore_370.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.D("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғ࠭߹࠰ࠬࠢࠦ࠴ࠦ࠴࠶ࠊ࠘ҫ", (byte)53, 68) + var1 + NLoginCore_004.C("Ҏ", (byte)53, 67) + var2.toString(), var4
         );
      }
   }

   public static Set<NLoginInterface_016> d() {
      return m;
   }

   public static void a(NLoginInterface_011<?> var0, boolean var1, boolean var2) {
      if (a != null) {
         throw new IllegalStateException(a(a & b, d));
      } else {
         int var3 = var0.b().a() == NLoginCore_419.b ? e : f;
         String var4 = var0.q();
         m.add((var2x, var3x, var4x) -> {
            String var5 = var3x.toLowerCase(Locale.ENGLISH);
            if (var3 && var4.equals(var2x) && var5.contains(a(bk, bl ^ bm)) && var5.contains(a(bn, bo))) {
               return (bp != 0);
            } else {
               return ((var5.contains(a(bq & br, bs) != 0)) && var5.contains(a(bt, bu)) ? bv : bw);
            }
         });
         Set var10000 = m;
         KeySetView var10003 = ConcurrentHashMap.newKeySet();
         String[] var10004 = new String[g];
         var10004[h] = a(i, j);
         var10000.add(new NLoginCore_439(var10003, var10004));
         a = var0;
         D = a(k & l, m) + var4 + a(n & o, p);
         Z = var1;
         aa = var2;
      }
   }

   private static void b() {
      c = -3441602323112399930L;
      long var0 = c ^ 7880861573352966726L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(45 + 23),
               (byte)(40 + 29),
               (byte)(77 + 6),
               (byte)(36 + 11),
               (byte)(51 + 16),
               (byte)(15 + 51),
               67,
               (byte)(26 + 21),
               80,
               (byte)(20 + 55),
               (byte)(54 + 13),
               (byte)(26 + 57),
               (byte)(47 + 6),
               (byte)(39 + 41),
               (byte)(81 + 16),
               (byte)(61 + 39),
               (byte)(7 + 93),
               (byte)(46 + 59),
               (byte)(31 + 79),
               (byte)(69 + 34)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(38 + 31), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_471.E("ֈՅէ՛Ճծզիծ՜՛ՒֈՐՏաՙ\u058b֏՚լ֛շՠ֎յ֢փպշաս", (byte)84, 69);
               ZKM_STR_B[1] = NLoginCore_559.F("ՠդպվո՞\u058bձք֏ճ\u0558", (byte)84, 70);
               ZKM_STR_B[2] = NLoginCore_183.E("ԻՁ՝վբլ՟ռծՊՊ\u0558", (byte)84, 69);
               ZKM_STR_B[3] = NLoginCore_223.D("ԢԁԗԌԩԂԨԨӤԪԐӹ", (byte)84, 68);
               ZKM_STR_B[4] = NLoginCore_427.F("ԻՁ՝վբլ՟ռծՊՊ\u0558", (byte)84, 70);
               ZKM_STR_B[5] = NLoginCore_433.A("ŜŸƙŞųůųŠƅťƨů", (byte)84, 65);
               ZKM_STR_B[6] = NLoginCore_141.F("ՅաւՇ՜\u0558՜ՉծՎ֑\u0558", (byte)84, 70);
               ZKM_STR_B[7] = NLoginCore_223.C("ԖԩӺԆӬԤԁӺԐԳӼӹ", (byte)84, 67);
               ZKM_STR_B[8] = NLoginCore_427.C("ӺԇԫԙԇԞӭӺԟԛԀӹ", (byte)84, 67);
               ZKM_STR_B[9] = NLoginCore_110.E("ՙզ֊ոզսՌՙվպ՟\u0558", (byte)84, 69);
               ZKM_STR_B[10] = NLoginCore_201.A("ƌƟŰżŢƚŷŰƆƩŲů", (byte)84, 65);
               ZKM_STR_B[11] = NLoginCore_575.E("ն՞փՌՄպ՜՞գ֒գ\u0558", (byte)84, 69);
               ZKM_STR_B[12] = NLoginCore_201.C("ԩӦԈӼӤԏԇԌԏӽӿԩԞԨԌԬ\u0530ӴԹԛ\u0530ԜԳԜԋԂԎՆԳԜԿԽԦՅՃՄԍՉՏՄՄԉՊԙ", (byte)84, 67);
               ZKM_STR_B[13] = NLoginCore_559.E("քՄՂդ\u058c֊ո։՝՚ՍՎ֕շՉևք֛ն\u058cս֎\u0558Ւ֍ա֢այբ֤֚", (byte)84, 69);
               ZKM_STR_B[14] = NLoginCore_521.B("ŶƑƚšůŶţůŲƖƊů", (byte)84, 66);
               ZKM_STR_B[15] = NLoginCore_451.F("՝օփՖթՍ՞աՇզՊ֒֔֎ւՑփ\u0590ֈխէ֜գդ", (byte)84, 70);
               ZKM_STR_B[16] = NLoginCore_397.D("ԒӥӶԇԯԥӼԀԦԢԎӱԳԫԵԨԋԘӮԯӼԍԾӺԳԁԲՁԀԐԢԪՄԻԖԝՆԿԇՌԑՉՊՇԠԏԗԣԹՓԽ՝ԞԾՙԯԭԸԮ\u0530՝\u0558ՐԤգԡՈ՚ՍԷՊ՜հՌԳԹ", (byte)84, 68);
               ZKM_STR_B[17] = NLoginCore_141.B("ƑƢŻƝžƣƁƣƀƥƘů", (byte)84, 66);
               ZKM_STR_B[18] = NLoginCore_324.A("ŞƂơřűƃƢűƦƦŧƬƍžƫƜŭƣơƊƫƣźŻ", (byte)84, 65);
               ZKM_STR_B[19] = NLoginCore_110.B("ƠůŜƖżťŢƖƘƨŶů", (byte)84, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.A("ƟŜžŲŚƅŽƂƅųŲũƟŧŦŸŰƢƦűƃƣƐƣŴƂƊƤƮƻƊƝ", (byte)84, 65);
               ZKM_STR_B[1] = NLoginCore_471.B("ƜƕŸŵžƥƇƛƢƜƆƞƙŻƮƚƌƑűƴƀƍźŻ", (byte)84, 66);
               ZKM_STR_B[2] = NLoginCore_521.D("ӧԇԩӼԊԗԨԫԐԌԞӹ", (byte)84, 68);
               ZKM_STR_B[3] = NLoginCore_127.F("ՀՈԽՖոՅՋՊևօՊ\u0558", (byte)84, 70);
               ZKM_STR_B[4] = NLoginCore_453.E("Ւթֆջ՚ՠզտպևօ\u0558", (byte)84, 69);
               ZKM_STR_B[5] = NLoginCore_387.D("ӥӨԬԜԇӹӻԤӪԛԢӹ", (byte)84, 68);
               ZKM_STR_B[6] = NLoginCore_559.B("ŲơƜŮƙţƃƏųƙťů", (byte)84, 66);
               ZKM_STR_B[7] = NLoginCore_397.B("ƞƍżřųƂűŰŚƅƂů", (byte)84, 66);
               ZKM_STR_B[8] = NLoginCore_004.A("ŻžƜƚųƐŠŴƟƨƨů", (byte)84, 65);
               ZKM_STR_B[9] = NLoginCore_110.D("ӠԤԡԁӨӺԥԒӯԓԔӹ", (byte)84, 68);
               ZKM_STR_B[10] = NLoginCore_559.B("ƉƚƗŞƃƎƞƚżƢƨů", (byte)84, 66);
               ZKM_STR_B[11] = NLoginCore_027.F("ջդ\u058bՔպՖժ՝կց֑\u0558", (byte)84, 70);
               ZKM_STR_B[12] = NLoginCore_004.E("ֈՅէ՛Ճծզիծ՜՞ֈսևի\u058b֏Փ֘պ֏ջ֒ջժախ֥֒ջ֞֜չեի֢֭֞զ֟ֈ֟֓ո", (byte)84, 69);
               ZKM_STR_B[13] = NLoginCore_183.F("քՄՂդ\u058c֊ո։՝՚ՍՎ֕շՉևք֛ն\u058cս\u0590֔\u0558՟֖֕լ֔՞դ֑", (byte)84, 70);
               ZKM_STR_B[14] = NLoginCore_223.F("֊ռ\u0558իՊ\u0557ծ՛թֆՉՊՠՓդՊխփձ֖ն\u058cգդ", (byte)84, 70);
               ZKM_STR_B[15] = NLoginCore_553.C("ӾԦԤӷԊӮӿԂӨԇӬԳӳԓԪԂԫԶԲԺ\u0530ՀԪԵԑՀӿԞԢՈԩԹ", (byte)84, 67);
               ZKM_STR_B[16] = NLoginCore_387.B("ƈśŬŽƥƛŲŶƜƘƄŧƩơƫƞƁƎŤƥŲƃƴŰƩŷƨƷŶƆƘƠƺƱƌƓƼƵŽǂƇƿǀƽƖƅƍƙƯǉƳǓƔƴǏƥƣƮƤƦǓǎǆƚƟƷƝǁǍǛƯƥơǧǔƯ", (byte)84, 66);
               ZKM_STR_B[17] = NLoginCore_091.F("ՄՒ։էե֊֏֏՝Չ֍\u0558", (byte)84, 70);
               ZKM_STR_B[18] = NLoginCore_387.E("Շի֊Ղ՚լ\u058b՚֏֏ՐՋ֕֒֍֒֙Ռօնչ֜գդ", (byte)84, 69);
               ZKM_STR_B[19] = NLoginCore_201.B("ƗšŘŜųƘƇơŰƦƠů", (byte)84, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.F("ժճՕ՛ՕխֆտՎ֊վխզ֊֓աը֚կյձզգդ", (byte)84, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_387.E("՞ը։ՈՕքխպջՐռՠժ֏ֈՠֆՒշ՜\u058bո֏֘\u058c\u058b\u0590\u0590աղ֕մ", (byte)84, 69);
         }
      }
   }

   public static void d(File var0) {
      if (a != null) {
         throw new IllegalStateException(a(ba, bb ^ bc));
      } else if (!NLoginCore_366.b(var0)) {
         throw new IOException(a(bd, be ^ bf) + var0.getPath() + a(bg, bh ^ bi));
      } else {
         a = NLoginCore_294.a(var0, StandardCharsets.UTF_8, (bj != 0));
      }
   }

   static {
      b();
   }
}
