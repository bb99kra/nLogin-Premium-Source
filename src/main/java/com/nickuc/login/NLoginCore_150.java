package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_150 {
   private static int be = Integer.reverse(1073741824);
   private static int q = 256 >>> 166 | 256 << ~166 + 1;
   private static int h = 4194304 >>> 54 | 4194304 << -54;
   private static int aw = Integer.reverse(536870912);
   private static float av = Float.intBitsToFloat(Integer.reverse(3714));
   private static int ao = (-1 >>> 196 | -1 << ~196 + 1) & -1;
   private static int k = (256 >>> 135 | 256 << -135) & -1;
   private static int ah = Integer.reverse(1342177280);
   private static long br = Long.reverse(-4323455642275676160L);
   private static long ai = Long.reverse(-3229487089779144374L);
   private static int bc = 1048576 >>> 20 | 1048576 << ~20 + 1;
   private static final EnumMap<NLoginCore_055, NLoginCore_316> b = new EnumMap<>(NLoginCore_055.class);
   private static long r = Long.reverse(-3229487089779144374L);
   private static int bj = (16777216 >>> 214 | 16777216 << -214) & -1;
   private static int bi = Integer.reverse(-1073741824);
   private static long p = Long.reverse(-4323455642275676160L);
   private static long o = Long.reverse(-3229487089779144374L);
   private static int az = (2013265920 >>> 251 | 2013265920 << -251) & -1;
   private static int t = (1280 >>> 168 | 1280 << ~168 + 1) & -1;
   private static int u = (-1 >>> 87 | -1 << -87) & -1;
   private static int bn = -1610612736 >>> 93 | -1610612736 << ~93 + 1;
   private static int bk = Integer.reverse(-2013265920);
   private static int bg = Integer.reverse(-1);
   private static String[] ZKM_STR_A = new String[NLoginCore_150.bv];
   private static int w = (805306368 >>> 59 | 805306368 << ~59 + 1) & -1;
   private static long ar = Long.reverse(1670429304799955274L);
   private static long ag = Long.reverse(1670429304799955274L);
   private static long g = Long.reverse(1670429304799955274L);
   private static int bd = (0 >>> 170 | 0 << -170) & -1;
   private static long i = Long.reverse(-3229487089779144374L);
   private static long s = Long.reverse(-4323455642275676160L);
   private static int an = 48 >>> 2 | 48 << -2;
   private static long bu = Long.reverse(1670429304799955274L);
   private static long l = Long.reverse(-3229487089779144374L);
   private static long ac = Long.reverse(-3229487089779144374L);
   private static int f = 0 >>> 22 | 0 << -22;
   private static int e = 0 >>> 43 | 0 << ~43 + 1;
   private static long v = Long.reverse(1670429304799955274L);
   private static int ab = '耀' >>> 140 | 32768 << -140;
   private static int bs = Integer.reverse(-536870912);
   private static long ad = Long.reverse(-4323455642275676160L);
   private static int bp = Integer.reverse(1207959552);
   private static int bv = (83886080 >>> 54 | 83886080 << ~54 + 1) & -1;
   private static int d = 0 >>> 179 | 0 << -179;
   private static long ap = Long.reverse(1670429304799955274L);
   private static int a = 2048 >>> 11 | 2048 << ~11 + 1;
   private static long am = Long.reverse(-4323455642275676160L);
   private static int y = Integer.reverse(-536870912);
   static NLoginCore_055 b = NLoginCore_055.d;
   private static int ae = Integer.reverse(-1879048192);
   private static int b = 0 >>> 38 | 0 << -38;
   private static long z = Long.reverse(-3229487089779144374L);
   private static long bq = Long.reverse(-3229487089779144374L);
   private static long m = Long.reverse(-4323455642275676160L);
   private static int bw = Integer.reverse(671088640);
   private static int ax = Integer.reverse(268435456);
   private static long au = Long.reverse(1670429304799955274L);
   private static long ba = Long.reverse(-3229487089779144374L);
   private static int ay = (0 >>> 218 | 0 << ~218 + 1) & -1;
   private static int bt = (19922944 >>> 52 | 19922944 << -52) & -1;
   private static int bf = (2048 >>> 39 | 2048 << -39) & -1;
   private static long bm = Long.reverse(-4323455642275676160L);
   private static long aa = Long.reverse(-4323455642275676160L);
   private static int at = Integer.reverse(-1);
   private static long bh = Long.reverse(1670429304799955274L);
   private static long al = Long.reverse(-3229487089779144374L);
   private static int as = Integer.reverse(1879048192);
   private static long bb = Long.reverse(-4323455642275676160L);
   private static int ak = 92274688 >>> 215 | 92274688 << ~215 + 1;
   private static long x = Long.reverse(1670429304799955274L);
   private static long bl = Long.reverse(-3229487089779144374L);
   private static int aq = Integer.reverse(-1342177280);
   private static long c;
   private static int c = (524288 >>> 51 | 524288 << -51) & -1;
   private static long j = Long.reverse(-4323455642275676160L);
   private static String[] ZKM_STR_B = new String[bw];
   private static int bo = Integer.reverse(1610612736);
   private static int n = 393216 >>> 209 | 393216 << -209;
   private static int af = Integer.reverse(-1);
   private static long aj = Long.reverse(-4323455642275676160L);

   public static NLoginCore_190 a(NLoginCore_102 var0, NLoginCore_277 var1) {
      NLoginCore_509 var2 = NLoginType_008.c().a().b(var1);
      NLoginCore_055 var3 = var2 != null ? var2.a() : c();
      return a(var3).a(var0);
   }

   public static String aC() {
      return NLoginCore_477.b.a(new Object[e]);
   }

   private static String a(int var0, long var1) {
      var1 ^= 35L;
      var1 ^= 6776558358972209642L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     (byte)(65 + 4),
                     (byte)(27 + 56),
                     (byte)(7 + 40),
                     (byte)(13 + 54),
                     (byte)(48 + 18),
                     (byte)(41 + 26),
                     (byte)(46 + 1),
                     (byte)(59 + 21),
                     (byte)(45 + 30),
                     (byte)(55 + 12),
                     (byte)(15 + 68),
                     53,
                     (byte)(42 + 38),
                     (byte)(72 + 25),
                     (byte)(42 + 58),
                     100,
                     (byte)(4 + 101),
                     (byte)(99 + 11),
                     (byte)(31 + 72)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.C("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼࢃࢃࢄࡱࢉࢇ\u0892ࡰࡹ࢞", (byte)88, 67));
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

   public static NLoginCore_316 a(NLoginCore_055 var0) {
      NLoginCore_316 var1 = b.get(var0);
      if (var1 == null) {
         throw new IllegalStateException(var0 + a(f, g));
      } else {
         return var1;
      }
   }

   public static List<String> c(NLoginCore_487 var0, Object... var1) {
      return a(b).b(var0, var1);
   }

   public static String a(NLoginCore_055 var0, NLoginCore_487 var1, Object... var2) {
      return var1.aJ ? String.join(a(h, i ^ j), a(var0).a(var1, var2)) + a(k, l ^ m) : a(var0).a(var1, var2);
   }

   public static String a(NLoginCore_487 var0, String var1, @Nullable NLoginCore_277 var2, Object... var3) {
      NLoginCore_509 var4 = var2 != null ? NLoginType_008.c().a().a(var2) : null;
      NLoginCore_055 var5 = var4 != null ? var4.a() : c();
      if (var0.aJ) {
         List var6 = a(var5).a(var0, var3);
         return String.join(a(n, o ^ p), var6).replace(a(q, r ^ s), var1) + a(t & u, v);
      } else {
         return a(var5).a(var0, var3).replace(a(w, x), var1);
      }
   }

   public static void a(NLoginCore_277 var0, NLoginCore_508 var1, Object... var2) {
      NLoginCore_509 var3 = NLoginType_008.c().a().b(var0);
      a(var3.a()).a(var1).a(var0, var2);
   }

   public static String a(NLoginCore_487 var0, NLoginCore_277 var1, Object... var2) {
      return a(var0, var1.getName(), var1, var2);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_150.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginCore_150.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.E("զճղԵյձլյրկԼպվշպրՂࣉࣉ࣊ࢷ࣏࣍ࣘࢶࢿࣤ\u0558", (byte)71, 69) + var1 + NLoginCore_521.A("Ň", (byte)71, 65) + var2.toString(), var4
         );
      }
   }

   public static List<String> a(NLoginCore_487 var0, NLoginCore_277 var1, Object... var2) {
      return a(var0, var1.getName(), var1, var2);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_487 var1, Object... var2) {
      a(var0, var1, null, var2);
   }

   public static List<String> a(NLoginCore_487 var0, String var1, @Nullable NLoginCore_277 var2, Object... var3) {
      NLoginCore_509 var4 = var2 != null ? NLoginType_008.c().a().a(var2) : null;
      NLoginCore_055 var5 = var4 != null ? var4.a() : c();
      List var6 = a(var5).b(var0, var3);
      var6.replaceAll(var1x -> var1x.replace(a(bt, bu), var1));
      return var6;
   }

   public static boolean aM() {
      return ((b == NLoginCore_055.g ? c : d) != 0);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_194 var1, float var2, float var3) {
      if (var0 instanceof NLoginCore_277 && NLoginCore_477.am.ar()) {
         NLoginCore_277 var4 = (NLoginCore_277)var0;
         if (NLoginType_008.c().L()) {
            NLoginType_010 var5 = NLoginType_008.c().c();
            NLoginCore_199 var10000 = var5.a();
            int var10002 = aw;
            Object[] var10003 = new Object[ax];
            var10003[ay] = a(az, ba ^ bb);
            var10003[bc] = bd;
            var10003[be] = a(bf & bg, bh);
            var10003[bi] = var1.name();
            var10003[bj] = a(bk, bl ^ bm);
            var10003[bn] = var2;
            var10003[bo] = a(bp, bq ^ br);
            var10003[bs] = var3;
            var10000.a(var4, var10002, var10003);
         } else {
            Player var6 = var4.c();
            var1.a(var3x -> var6.playSound(var6.getLocation(), var3x, var2, var3));
         }
      }
   }

   public static String a(NLoginCore_487 var0, Object... var1) {
      return a(b, var0, var1);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_194 var1) {
      a(var0, var1, av, 1.0F);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_237 var1, Consumer<String> var2, Object... var3) {
      if (var0 instanceof NLoginCore_277) {
         NLoginCore_277 var4 = (NLoginCore_277)var0;
         String var5 = var4.getName();
         NLoginCore_509 var6 = NLoginType_008.c().a().b(var4);
         NLoginCore_055 var7 = var6.a();
         NLoginInterface_024 var8 = var6.a();
         if (var2 == null) {
            var2 = var8::a;
         }

         if (var1.aI) {
            for (String var11 : a(var7).b(var1, var3)) {
               var2.accept(var11.replace(a(ak, al ^ am), var5).replace(a(an & ao, ap), var4.ac()));
            }
         } else {
            String var16 = a(var7).a(var1, var3);
            if (!var16.isEmpty()) {
               var2.accept(var16.replace(a(aq, ar), var5).replace(a(as & at, au), var4.ac()));
            }
         }
      } else {
         if (var2 == null) {
            var2 = var0::k;
         }

         if (var1.aI) {
            for (String var15 : a(b).a(var1, var3)) {
               var2.accept(var15);
            }
         } else {
            String var13 = a(b).a(var1, var3);
            if (!var13.isEmpty()) {
               var2.accept(var13);
            }
         }
      }
   }

   public static void a(NLoginInterface_042 var0, String var1, Object... var2) {
      if (var2.length > 0) {
         var1 = String.format(var1, var2);
      }

      if (var0 instanceof NLoginCore_277) {
         NLoginCore_509 var3 = NLoginType_008.c().a().b((NLoginCore_277)var0);
         var3.a().a(var1, null, null, null, null);
      } else {
         var0.k(var1);
      }
   }

   public static boolean j() {
      return ((b != NLoginCore_055.c && b != NLoginCore_055.s ? b : a) != 0);
   }

   public static void a(NLoginType_008 var0, NLoginCore_055 var1) {
      NLoginCore_316 var2 = new NLoginCore_316(var0, var1, var1 == NLoginCore_055.x ? aC() : var1.cO);
      b.put(var1, var2);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_237 var1, Object... var2) {
      a(var0, var1, null, var2);
   }

   public static void a(NLoginInterface_042 var0, NLoginCore_487 var1, Consumer<String> var2, Object... var3) {
      if (var0 instanceof NLoginCore_277) {
         NLoginCore_277 var4 = (NLoginCore_277)var0;
         String var5 = var4.getName();
         NLoginCore_509 var6 = NLoginType_008.c().a().b(var4);
         NLoginCore_055 var7 = var6.a();
         NLoginInterface_024 var8 = var6.a();
         if (var2 == null) {
            var2 = var8::a;
         }

         if (var1.aJ) {
            for (String var11 : a(var7).b(var1, var3)) {
               var2.accept(var11.replace(a(y, z ^ aa), var5).replace(a(ab, ac ^ ad), var4.ac()));
            }
         } else {
            String var16 = a(var7).a(var1, var3);
            if (!var16.isEmpty()) {
               var2.accept(var16.replace(a(ae & af, ag), var5).replace(a(ah, ai ^ aj), var4.ac()));
            }
         }
      } else {
         if (var2 == null) {
            var2 = var0::k;
         }

         if (var1.aJ) {
            for (String var15 : a(b).a(var1, var3)) {
               var2.accept(var15);
            }
         } else {
            String var13 = a(b).a(var1, var3);
            if (!var13.isEmpty()) {
               var2.accept(var13);
            }
         }
      }
   }

   @Generated
   public static NLoginCore_055 c() {
      return b;
   }

   private static void b() {
      c = 5949396860357670091L;
      long var0 = c ^ 6776558358972209642L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(17 + 52),
               (byte)(57 + 26),
               (byte)(40 + 7),
               (byte)(55 + 12),
               (byte)(14 + 52),
               (byte)(3 + 64),
               (byte)(29 + 18),
               (byte)(8 + 72),
               (byte)(50 + 25),
               (byte)(43 + 24),
               83,
               (byte)(14 + 39),
               (byte)(57 + 23),
               (byte)(90 + 7),
               100,
               (byte)(43 + 57),
               (byte)(83 + 22),
               (byte)(72 + 38),
               (byte)(81 + 22)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.A("ƈƺƌƬƓŸƀƺƱƏƝƓƦƒǋƥǁƝƶƪƬƯƛǅǒǐƢƩƭƫǐƨ", (byte)98, 65);
               ZKM_STR_B[1] = NLoginCore_141.C("ԐՑՋ\u0558ԥԲԱԙԤ՚ԕԣ", (byte)98, 67);
               ZKM_STR_B[2] = NLoginCore_223.A("ƭƴŴƿƳƝƴƮǄǆưƋ", (byte)98, 65);
               ZKM_STR_B[3] = NLoginCore_183.F("Փ֔֎֛ըյմ՜է֝\u0558զ", (byte)98, 70);
               ZKM_STR_B[4] = NLoginCore_559.C("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 67);
               ZKM_STR_B[5] = NLoginCore_027.F("ֈ֏Տ֚֎ո֏։֟֡\u058bզ", (byte)98, 70);
               ZKM_STR_B[6] = NLoginCore_446.A("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 65);
               ZKM_STR_B[7] = NLoginCore_471.F("լչ\u058b։իղ՜էժՙ\u0558զ", (byte)98, 70);
               ZKM_STR_B[8] = NLoginCore_223.D("ԏԏԪԕՐԗԯԦՌԱԻՖՋՎ՝գՂՎԺ՟ԼէԮԯ", (byte)98, 68);
               ZKM_STR_B[9] = NLoginCore_530.B("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 66);
               ZKM_STR_B[10] = NLoginCore_433.B("ŷŷƒŽƸſƗƎƴƙƣƾƳƶǅǋƪƶƢǇƤǏƖƗ", (byte)98, 66);
               ZKM_STR_B[11] = NLoginCore_141.D("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 68);
               ZKM_STR_B[12] = NLoginCore_092.E("ՒՒխ\u0558֓՚ղթ֏մվ֙֎֑֦֠օ֑ս֢տ֪ձղ", (byte)98, 69);
               ZKM_STR_B[13] = NLoginCore_201.A("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 65);
               ZKM_STR_B[14] = NLoginCore_201.F("ՒՒխ\u0558֓՚ղթ֏մվ֙֎֑֦֠օ֑ս֢տ֪ձղ", (byte)98, 70);
               ZKM_STR_B[15] = NLoginCore_575.C("ԢԪԲԫԵՐՍ՛ՎԩԦԣ", (byte)98, 67);
               ZKM_STR_B[16] = NLoginCore_559.B("ƉƋƮŶžŻơǄƾƚƚƋ", (byte)98, 66);
               ZKM_STR_B[17] = NLoginCore_091.A("ƪƓŶƾƚơƲŵƗƚƅƋ", (byte)98, 65);
               ZKM_STR_B[18] = NLoginCore_110.B("ƇƯưƖƙƮƞƑƜƃƸƋ", (byte)98, 66);
               ZKM_STR_B[19] = NLoginCore_433.C("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.C("ԠՒԤՄԫԐԘՒՉԧԵԫԾԪգԽՙԵՎՂՄՉ՝ՈԦ՚ԩեՐՒՓԬ", (byte)98, 67);
               ZKM_STR_B[1] = NLoginCore_004.F("լաՑ֔զ՚\u058cս֒ցմռ֔ջ֒ե֔հ֧֨ճմձղ", (byte)98, 70);
               ZKM_STR_B[2] = NLoginCore_232.E("ի\u0557ի֏նք֊\u058bկ֞֗զ", (byte)98, 69);
               ZKM_STR_B[3] = NLoginCore_453.B("ŻƜƗŸǁưƷƷƻƚŽƖƴƥƪƠƫƅƋƟƮƩƖƗ", (byte)98, 66);
               ZKM_STR_B[4] = NLoginCore_397.C("ՊԯԤՆՖԡԙՈՕԻԹԽԶԽՁԞԽԽԟԹԻԱԮԯ", (byte)98, 67);
               ZKM_STR_B[5] = NLoginCore_427.D("ՁԏԿԱՃՈՏՄԧԯԝԣ", (byte)98, 68);
               ZKM_STR_B[6] = NLoginCore_091.A("ƎźƏƝƎƫƘƳƺƖŸƏƣƢƳƉƿƗƾƷƣƿƖƗ", (byte)98, 65);
               ZKM_STR_B[7] = NLoginCore_183.B("ƎƫƷźƱƴǁƲƴƅƐƶƢƲƻƋǊſƼƥƼƙƖƗ", (byte)98, 66);
               ZKM_STR_B[8] = NLoginCore_387.D("ԏԏԪԕՐԗԯԦՌԱԺԘԴԫ՚դԼ\u0530ԻԞԷՁԮԯ", (byte)98, 68);
               ZKM_STR_B[9] = NLoginCore_183.E("\u058cաըէ֚֙թժ֖֙՟սլ֣֖֜տ\u0590֘է֠քձղ", (byte)98, 69);
               ZKM_STR_B[10] = NLoginCore_173.A("ŷŷƒŽƸſƗƎƴƙƥǄƕǀƅƶǍƧǅǎǋƩƖƗ", (byte)98, 65);
               ZKM_STR_B[11] = NLoginCore_223.E("ՠկշՒչ֓ռծ՛կ՜՝՛ռ֘ռպպյփիքձղ", (byte)98, 69);
               ZKM_STR_B[12] = NLoginCore_183.E("ՒՒխ\u0558֓՚ղթ֏մտւ՞֥մ֛՝֗՛ռ֢֪ձղ", (byte)98, 69);
               ZKM_STR_B[13] = NLoginCore_141.D("ԣԝՂԦՖՂՓԱՍԫԬ՛ԽբԲՋԲՖԺՈԶ\u0557Ԯԯ", (byte)98, 68);
               ZKM_STR_B[14] = NLoginCore_173.D("ԏԏԪԕՐԗԯԦՌԱԼԹԩԭԘԷգԟԱ՛ԱէԮԯ", (byte)98, 68);
               ZKM_STR_B[15] = NLoginCore_004.A("ŮƮƬƺơƕƚƏƬǅżƸƩƥƺƹƫƹƪƘƿǏƖƗ", (byte)98, 65);
               ZKM_STR_B[16] = NLoginCore_141.C("ՑԇՇԡԐԮԮԣԥԥԜԽԴԘԜգՒ\u0530էՖ՛էԮԯ", (byte)98, 67);
               ZKM_STR_B[17] = NLoginCore_183.A("ƷƖƟƒžơŻƚƔƤƮƶƇƢƳǋƝƄƅƺƊƿƖƗ", (byte)98, 65);
               ZKM_STR_B[18] = NLoginCore_530.E("Տ֏֗յիՕչէ֛֜֒զ", (byte)98, 69);
               ZKM_STR_B[19] = NLoginCore_092.B("ƱƶƏƒƷƺǃǃƂƺƳǈǀƽƔƫƩƷǀƦƻƩƖƗ", (byte)98, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.C("ԾԇՏԬ\u0530ԵԕՏ՜ԵԬԴԵԸԵՕՁԥԤ՜՟ԣ՞ՂՆդԼԧէը՛ի", (byte)98, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_092.D("ԴՐՌԎԐԷՒ\u0530՛ԵՌԣ", (byte)98, 68);
         }
      }
   }
}
