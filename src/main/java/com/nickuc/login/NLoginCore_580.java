package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_580 implements NLoginInterface_010, NLoginInterface_035 {
   private static long as = Long.reverse(-2516312631103244786L);
   private static long r = Long.reverse(2882303761517117440L);
   private static int ad = Integer.reverse(-1);
   private static int ai = (3 >>> 63 | 3 << ~63 + 1) & -1;
   private static long l = Long.reverse(1008806316530991104L);
   private static int c = 67108864 >>> 186 | 67108864 << ~186 + 1;
   private static int j = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255) & -1;
   private static long aq = Long.reverse(1008806316530991104L);
   private static long c;
   private static long n = Long.reverse(-3236888571482524146L);
   private static int w = 0 >>> 251 | 0 << ~251 + 1;
   private static int av = (160 >>> 164 | 160 << ~164 + 1) & -1;
   private static int ac = (2 >>> 31 | 2 << -31) & -1;
   private static int ab = Integer.reverse(0);
   private static int e = 0 >>> 8 | 0 << ~8 + 1;
   private static long ap = Long.reverse(-3236888571482524146L);
   private static long aa = Long.reverse(1008806316530991104L);
   private static int a = 0 >>> 88 | 0 << -88;
   private final NLoginCore_211 Y;
   private static int am = -1 >>> 230 | -1 << -230;
   private static long ae = Long.reverse(-2516312631103244786L);
   private static int b = 0 >>> 14 | 0 << -14;
   private static int v = Integer.reverse(0);
   private static long f = Long.reverse(-3236888571482524146L);
   private static int at = Integer.reverse(0);
   private static int x = Integer.reverse(0);
   private static int m = 4096 >>> 235 | 4096 << -235;
   private static int ao = Integer.reverse(268435456);
   private static int s = 4 >>> 65 | 4 << ~65 + 1;
   private static int i = (0 >>> 66 | 0 << ~66 + 1) & -1;
   private static int y = (-1073741824 >>> 254 | -1073741824 << -254) & -1;
   private static int ar = 147456 >>> 174 | 147456 << -174;
   private static long ag = Long.reverse(-3236888571482524146L);
   private static long z = Long.reverse(-3236888571482524146L);
   private static String[] ZKM_STR_B = new String[NLoginCore_580.aw];
   private static int t = 0 >>> 239 | 0 << -239;
   private static int au = Integer.reverse(0);
   private static int p = (262144 >>> 210 | 262144 << ~210 + 1) & -1;
   private static long g = Long.reverse(1008806316530991104L);
   private static long ah = Long.reverse(1008806316530991104L);
   private static long aj = Long.reverse(-3236888571482524146L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static long an = Long.reverse(-2516312631103244786L);
   private static int d = Integer.reverse(0);
   private static int aw = 20 >>> 97 | 20 << -97;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long q = Long.reverse(2882303761517117440L);
   private static int af = (83886080 >>> 56 | 83886080 << ~56 + 1) & -1;
   private static long ak = Long.reverse(1008806316530991104L);
   private static long o = Long.reverse(1008806316530991104L);
   private static int al = 896 >>> 231 | 896 << ~231 + 1;
   private static String[] ZKM_STR_A = new String[av];
   private static long k = Long.reverse(-3236888571482524146L);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_360.B[var5.ordinal()]) {
         case 1:
            this.d(var1, var2, var3);
            NLoginCore_150.a(var2, NLoginCore_487.p);
            NLoginInterface_010.super.a(var1, var2, var3, var4, var5);
            break;
         case 2:
            NLoginCore_150.a(var2, NLoginCore_487.p);
            NLoginInterface_010.super.a(var1, var2, var3, var4, var5);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 112L;
      var1 ^= 7878246881788664513L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(63 + 6),
                     (byte)(35 + 48),
                     (byte)(26 + 21),
                     (byte)(11 + 56),
                     (byte)(25 + 41),
                     (byte)(11 + 56),
                     (byte)(40 + 7),
                     (byte)(23 + 57),
                     (byte)(61 + 14),
                     (byte)(64 + 3),
                     (byte)(80 + 3),
                     (byte)(8 + 45),
                     (byte)(35 + 45),
                     (byte)(77 + 20),
                     (byte)(57 + 43),
                     (byte)(77 + 23),
                     (byte)(79 + 26),
                     110,
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(66 + 3), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.A("ƂƏƎőƑƍƈƑƜƋŘƖƚƓƖƜŞӐӤӰӫӱӝӖӝӼӽӝӼ", (byte)80, 65));
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

   private static void b() {
      c = 8101064159325726923L;
      long var0 = c ^ 7878246881788664513L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(35 + 34),
               (byte)(67 + 16),
               (byte)(9 + 38),
               (byte)(22 + 45),
               (byte)(8 + 58),
               (byte)(23 + 44),
               (byte)(43 + 4),
               (byte)(77 + 3),
               (byte)(13 + 62),
               67,
               (byte)(48 + 35),
               (byte)(33 + 20),
               (byte)(18 + 62),
               (byte)(3 + 94),
               (byte)(93 + 7),
               (byte)(26 + 74),
               (byte)(80 + 25),
               (byte)(109 + 1),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_453.C(
                  "ԢԝՖՋՖԦԯՓ՝ԴԫԱՒԫՍդԮդ\u0558ըԲՇ՚ԩ՛ՈԺթբ՞Մ՞ՑԭՈոՃ՚ՖԻՇԹխԽՀՖՌԻՏշՆձմ՚\u0558օՌվ֎ժժ՝ըզ\u058b֎\u058cխֈ\u058cՌժռ֕֞Ցռ֢՝֣֢֞չո֛ֈ\u058b֞֝֎֗֬֊֯ըե֦ղ֏֏֤֬֫ճշַ֑֮֔֕ջ֠ցֶ֚׀և֡֎֏",
                  (byte)98,
                  67
               );
               ZKM_STR_B[1] = NLoginCore_076.F("ձեժջ֊֗Տձ֝֎յզ", (byte)98, 70);
               ZKM_STR_B[2] = NLoginCore_433.F("ղֈ֑ջֈթՔհֈճ֓զ", (byte)98, 70);
               ZKM_STR_B[3] = NLoginCore_453.F(
                  "եՠ֙֎֙թղ֖֠շծմ֕ծ\u0590֧ձ֧֛֫յ֊֝լ֞\u058bս֥֬֡և֡֔հ\u058bֻֆ֝֙վ֊ռְրփ֙֏վֺ֒։ִַ֛֝\u05c8֏ׁב֭֭֠֫֩\u05ceב\u05cfְ\u05cb\u05cf֏ֿ֭טן֬דגֱֵ֮֞טשו\u05eb׃ׁׅ֮\u05cdץׄדׂ־\u05ccגׯֳו\u05ee\u05ebֽׯ\u05ebּ׆",
                  (byte)98,
                  70
               );
               ZKM_STR_B[4] = NLoginCore_471.B("ƄƶƐƋƈƗƕǃƒǄƼƋ", (byte)98, 66);
               ZKM_STR_B[5] = NLoginCore_241.F("եզւ֑֙֕ստխ֚ծջ֑՞աւ՝֨վև֪֕ձղ", (byte)98, 70);
               ZKM_STR_B[6] = NLoginCore_553.F("ՉՑ֛֒\u0558֛։զև֔՜զ", (byte)98, 70);
               ZKM_STR_B[7] = NLoginCore_427.C("ԦՎԧՃՂՍՊՈԫԵ\u0530ՙԱԴՏ\u0557՚ԞՓՐԣԱԮԯ", (byte)98, 67);
               ZKM_STR_B[8] = NLoginCore_453.C("ՄՇՒՕՕՆ՚ԦՏՒՌՎ՜ՂԚԜԡԱաՏՆ\u0557Ԯԯ", (byte)98, 67);
               ZKM_STR_B[9] = NLoginCore_223.A("ŮŽŸƷƨƮƜŽưƥơƁǇƂƈƕƫƹƪƾƜƩƖƗ", (byte)98, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_004.F(
                  "եՠ֙֎֙թղ֖֠շծմ֕ծ\u0590֧ձ֧֛֫յ֊֝լ֞\u058bս֥֬֡և֡֔հ\u058bֻֆ֝֙վ֊ռְրփ֙֏վֺ֒։ִַ֛֝\u05c8֏ׁב֭֭֠֫֩\u05ceב\u05cfְ\u05cb\u05cf֏ֿ֭טסֿ֔ץ֠סצץֻּמ\u05cb\u05ceסנבךׯ\u05cdײ֫֨שֵגגקׯ\u05eeֶֺהז\u0603\u05fc\u05fdעע\u0603ץ\u05f9ׁׅ\u05faבג",
                  (byte)98,
                  70
               );
               ZKM_STR_B[1] = NLoginCore_201.C("ԫՒԎՁՈՊՃԥՄՊԗՒՖԱՎԷ\u0558՛ՑԥԿ\u0557Ԯԯ", (byte)98, 67);
               ZKM_STR_B[2] = NLoginCore_076.A("ƍŸƪűƋơƑƺƶƻƷƿƽƩƒƧƖǊǆƩǃƿƖƗ", (byte)98, 65);
               ZKM_STR_B[3] = NLoginCore_241.A(
                  "ƊƅƾƳƾƎƗƻǅƜƓƙƺƓƵǌƖǌǀǐƚƯǂƑǃưƢǑǊǆƬǆƹƕưǠƫǂƾƣƯơǕƥƨƾƴƣƷǟƮǙǜǂǀǭƴǦǶǒǒǅǐǎǳǶǴǕǰǴƴǒǤǽȄǑǸǷǖǓǃǚǽȎǺȐǨǓǪǦǲȊǩǸǧǣȉǺȕǑǨǝȜǹȥȢǵǠȜȂȉȁǶǩǧșǹȉǶǷ", (byte)98, 65
               );
               ZKM_STR_B[4] = NLoginCore_451.B("ƧƞƫƯƸŸŸŵƟƂƔƨǉŻƛƓƘƻƈƭǇƩƖƗ", (byte)98, 66);
               ZKM_STR_B[5] = NLoginCore_397.A("ƊƋƧƾƶƺƢƤƒƿƕƖƂƠƅƵơǇƪƉƟǏƖƗ", (byte)98, 65);
               ZKM_STR_B[6] = NLoginCore_127.E("փ֎ՙըջե\u0558֜ծ֔֟զ", (byte)98, 69);
               ZKM_STR_B[7] = NLoginCore_471.A("ƎƶƏƫƪƵƲưƓƝƘƓƳǀƾƬǇƋƥǈǈƙƖƗ", (byte)98, 65);
               ZKM_STR_B[8] = NLoginCore_127.C("ՄՇՒՕՕՆ՚ԦՏՒՎՋ՜աԱ՜ՃՖՙԡՠ\u0557Ԯԯ", (byte)98, 67);
               ZKM_STR_B[9] = NLoginCore_127.E("Չ\u0558Փ֒փ։շ\u0558\u058bրպր\u0590֥֚֞ձ։֥֥փք֪֚֍խ։֍լ֧֭֓", (byte)98, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_241.D("ՅՍԕԦՎԯՇԦԴԨԭԑ՚ՁՓՏԳԣԶԳթ\u0557Ԯԯ", (byte)98, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_530.A("ưưŶƿƿưžƻƙƵƠƻƄƽƻƩƠǁǁƿƍǏƖƗ", (byte)98, 65);
         }
      }
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (!var1.a().q()) {
         return (a != 0);
      } else {
         NLoginCore_055 var4 = var3.b();
         if (var4 == NLoginCore_150.c()) {
            return (b != 0);
         } else {
            return ((var4 != null && var4 != NLoginCore_055.x ? c : d) != 0);
         }
      }
   }

   static {
      b();
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.Y;
   }

   private void d(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      NLoginCore_055 var4 = var3.b();
      if (var4 == null) {
         throw new IllegalStateException(a(y, z ^ aa));
      } else if (NLoginCore_150.c() != var4) {
         if (!var1.a().p()) {
            NLoginCore_519.a(var1, null, (ab != 0));
         }

         var1.a().Y();
         File var5 = new File(var1.c(), a(ac & ad, ae));
         new File(var5, a(af, ag ^ ah)).delete();
         File var6 = new File(var5, a(ai, aj ^ ak));
         new File(var6, a(al & am, an)).delete();
         new File(var6, a(ao, ap ^ aq)).delete();
         NLoginCore_195.a(var1, var1.a(), a(ar, as), var4, (at != 0));
         BCryptHashProvider.a(var1);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_580.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.A("őųŵŕŹƘƐƦƒšƟƕƣƝŦƋƭƬƤƪƤŹ", (byte)85, 65), NLoginCore_580.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.D("ԗԤԣӦԦԢԝԦԱԠӭԫԯԨԫԱӳࡥࡹࢅࢀࢆࡲ\u086bࡲ\u0891\u0892ࡲ\u0891ԋ", (byte)85, 68) + var1 + NLoginCore_173.E("Ջ", (byte)85, 69) + var2.toString(),
            var4
         );
      }
   }

   @Generated
   public NLoginCore_580(NLoginCore_211 var1) {
      this.Y = var1;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_055 var5 = var3.b();
      if (var5 == null) {
         throw new IllegalStateException(a(e, f ^ g));
      } else {
         NLoginCore_150.a(var1, var5);
         NLoginCore_316 var6 = NLoginCore_150.a(var5);
         NLoginCore_237 var10001 = NLoginCore_237.c;
         Object[] var10002 = new Object[h];
         var10002[i] = NLoginCore_112.y(var5.u());
         List var7 = var6.a(var10001, var10002);
         var4.a(String.join(a(j, k ^ l), var7).replace(a(m, n ^ o), var2.getName()));
         NLoginCore_190 var8 = var6.a(NLoginCore_102.c);
         NLoginCore_190 var9 = var6.a(NLoginCore_102.d);
         var1.b((p != 0)).a(var4x -> {
            if (var2.R() && this.a(var3)) {
               var6.a(NLoginCore_508.m).a(var2);
            } else {
               var4x.Z();
            }
         }, q, r, TimeUnit.SECONDS);
         GUIButtonContainer[] var10000 = new GUIButtonContainer[s];
         var10000[t] = new GUIButtonContainer(NLoginCore_445.b, new NLoginCore_190(var8.ar(), var8.as()));
         var10000[u] = new GUIButtonContainer(NLoginCore_445.c, new NLoginCore_190(var9.ar(), var9.as()));
         return var10000;
      }
   }

   @Override
   public boolean au() {
      return (x != 0);
   }
}
