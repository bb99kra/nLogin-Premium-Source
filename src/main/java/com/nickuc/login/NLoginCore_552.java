package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_552 extends NLoginCore_098 {
   private static int cc = (-1 >>> 57 | -1 << -57) & -1;
   private static int bu = Integer.reverse(1462763520);
   private static int bf = -1 >>> 27 | -1 << -27;
   private static long ci = Long.reverse(9209550432295673602L);
   private static int bi = 8388608 >>> 213 | 8388608 << -213;
   private static int cb = Integer.reverse(-536870912);
   private static long ct = Long.reverse(9209550432295673602L);
   private static int cy = 6144 >>> 73 | 6144 << -73;
   private static String[] ZKM_STR_A = new String[NLoginCore_552.da];
   private static int cm = -1 >>> 10 | -1 << ~10 + 1;
   private static long q = Long.reverse(4611686018427387904L);
   private static int cg = Integer.reverse(-1);
   private static long bh = Long.reverse(9209550432295673602L);
   private static int cv = Integer.reverse(-805306368);
   private static long cn = Long.reverse(9209550432295673602L);
   private static long by = Long.reverse(4597864413868285698L);
   private static long cw = Long.reverse(9209550432295673602L);
   private static long at = Long.reverse(9209550432295673602L);
   private static int co = Integer.reverse(1342177280);
   private static long ca = Long.reverse(4611686018427387904L);
   private static int bw = Integer.reverse(1610612736);
   private static int bd = (50331648 >>> 120 | 50331648 << ~120 + 1) & -1;
   private static long o;
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int da = -805306368 >>> 252 | -805306368 << ~252 + 1;
   private static long cd = Long.reverse(9209550432295673602L);
   private static long p = Long.reverse(4597864413868285698L);
   private static long br = Long.reverse(4611686018427387904L);
   private static long cz = Long.reverse(9209550432295673602L);
   private static int e = 0 >>> 178 | 0 << ~178 + 1;
   private static long ab = Long.reverse(9209550432295673602L);
   private static int al = Integer.reverse(1073741824);
   private static int db = Integer.reverse(-1342177280);
   private static long bk = Long.reverse(4597864413868285698L);
   private static int cj = Integer.reverse(-1879048192);
   private static String[] ZKM_STR_B = new String[db];
   private static long bo = Long.reverse(4597864413868285698L);
   private static long bm = Long.reverse(4611686018427387904L);
   private static int bn = Integer.reverse(-1610612736);
   private static int ce = 268435456 >>> 121 | 268435456 << -121;
   private static int cr = (-1 >>> 86 | -1 << -86) & -1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= -5305873479334988795L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(45 + 24),
                     (byte)(60 + 23),
                     (byte)(14 + 33),
                     (byte)(57 + 10),
                     (byte)(7 + 59),
                     (byte)(44 + 23),
                     (byte)(13 + 34),
                     (byte)(73 + 7),
                     75,
                     (byte)(60 + 7),
                     (byte)(35 + 48),
                     53,
                     (byte)(28 + 52),
                     (byte)(32 + 65),
                     (byte)(82 + 18),
                     (byte)(25 + 75),
                     (byte)(80 + 25),
                     (byte)(57 + 53),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(43 + 40)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.F("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծऀइ࣪ࣾईࣨࣷआࣣआࣝࣟ࣠ऒ", (byte)115, 70));
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

   public NLoginCore_552(NLoginType_008 var1) {
      super(var1, NLoginCore_479.y, a(e, p ^ q), a(y, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(cv, cw));
      String var2 = NLoginCore_158.u(var1.getString(a(cy, cz)));
      this.a(this.r, var2, null, null);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_552.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.F("ՠւքդֈֵ֧֟֡հֲ֤֮֬յֳֳֹֻּ֚ֈ", (byte)124, 70), NLoginCore_552.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.C("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣺँࣤࣸं\u08e2ࣱऀࣝऀࣗࣙࣚऌւ", (byte)124, 67) + var1 + NLoginCore_521.A("Ʊ", (byte)124, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      o = 4682301428124316668L;
      long var0 = o ^ -5305873479334988795L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(47 + 22),
               (byte)(79 + 4),
               (byte)(33 + 14),
               (byte)(9 + 58),
               (byte)(9 + 57),
               67,
               (byte)(2 + 45),
               (byte)(24 + 56),
               (byte)(20 + 55),
               (byte)(39 + 28),
               (byte)(32 + 51),
               (byte)(24 + 29),
               80,
               (byte)(43 + 54),
               (byte)(35 + 65),
               (byte)(17 + 83),
               (byte)(104 + 1),
               (byte)(62 + 48),
               (byte)(82 + 21)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.D("ԅԛӸԹӼԩԉӹԀԱԡԘԮԀԆՂԅԤԡԽԞԦԓԔ", (byte)89, 68);
               ZKM_STR_B[1] = NLoginCore_451.F("դդաՙ՛ռևՕւֈ֖՝", (byte)89, 70);
               ZKM_STR_B[2] = NLoginCore_553.E("՜ՆՆբ\u0590ֈձ՟֎՟\u058cժժ\u058cզիՖ֏֕կժջըթ", (byte)89, 69);
               ZKM_STR_B[3] = NLoginCore_173.E("ա\u058cծ։ճօ՟ճ֖ո֎՝", (byte)89, 69);
               ZKM_STR_B[4] = NLoginCore_201.B("ƉƚŬŹŬƫƌƝƅſƔŹ", (byte)89, 66);
               ZKM_STR_B[5] = NLoginCore_201.A("ŸŢŢžƬƤƍŻƪŻƧƩůưƠŹŲƐżƥƲƇƄƅ", (byte)89, 65);
               ZKM_STR_B[6] = NLoginCore_384.F("՜ՆՆբ\u0590ֈձ՟֎՟֍խքշյսս\u058b֚\u0558ռ֑ըթ", (byte)89, 70);
               ZKM_STR_B[7] = NLoginCore_387.A("ŸŢŢžƬƤƍŻƪŻƨƋƱƸƩƒƌƲƓƉƋƫŸƝǁƢƵƏǀƜƞƗ", (byte)89, 65);
               ZKM_STR_B[8] = NLoginCore_127.D("ԇӱӱԍԻԳԜԊԹԊԶԳԹӸԝԓԉԹԸԦԩՄԁԨԍԍԬՅԩԲԤ\u0530", (byte)89, 68);
               ZKM_STR_B[9] = NLoginCore_387.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՅԿԘՉԽԻԾԇԦԮԤ", (byte)89, 67);
               ZKM_STR_B[10] = NLoginCore_091.A("ƗšƛƈƘƌƭƲŽƮƩƳƬƨƄƆŹƛƭƸƾƇƄƅ", (byte)89, 65);
               ZKM_STR_B[11] = NLoginCore_004.F("վռգձֈ֎֓ը֒\u0590Տ՝", (byte)89, 70);
               ZKM_STR_B[12] = NLoginCore_453.E("փստՈՏի֔մվ֏յ\u058b\u0590զՔէկչ֚Փպիըթ", (byte)89, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.D("ԅԛӸԹӼԩԉӹԀԱԟՁ\u0530ԄԆԂԝԪԶԻԸԖԓԔ", (byte)89, 68);
               ZKM_STR_B[1] = NLoginCore_027.B("ƦƅŧƤżťŹƐƄƞƁŲƇƳŶƅƒƒƆƐƺƇƄƅ", (byte)89, 66);
               ZKM_STR_B[2] = NLoginCore_324.E("՜ՆՆբ\u0590ֈձ՟֎՟֊օհձ֑֛֙\u058c֏ա֛ց՚ա՜վ֖֘֟֨յզ", (byte)89, 69);
               ZKM_STR_B[3] = NLoginCore_521.D("ӯԭԌԜӸԆԵԵԷԭӺӺԁ\u0530ԿԜՊԵԠԦԍՌԓԔ", (byte)89, 68);
               ZKM_STR_B[4] = NLoginCore_076.F("գդՏ։ֆ։֍ղ֓֗լ\u0557Քծը\u0558֊֔֊ւՠ֑ըթ", (byte)89, 70);
               ZKM_STR_B[5] = NLoginCore_223.E("՜ՆՆբ\u0590ֈձ՟֎՟֊Ցկգ֑֒֊֓֔՞\u0558\u0590կվ՟֑տշբ՝֧֙", (byte)89, 69);
               ZKM_STR_B[6] = NLoginCore_223.F("՜ՆՆբ\u0590ֈձ՟֎՟\u058cֈջ֊՚չ֑թ֢֓\u058c֔՝֏ճ֔ղ֜՜բֈի", (byte)89, 70);
               ZKM_STR_B[7] = NLoginCore_446.D("ԇӱӱԍԻԳԜԊԹԊԷԚՀՇԸԡԛՁԢԘԚԬՂԿՃԋԓԯԯԍԏՉ", (byte)89, 68);
               ZKM_STR_B[8] = NLoginCore_397.F("՜ՆՆբ\u0590ֈձ՟֎՟\u058bֈ֎Սղը՞֎֍ջվ֓պ֓֠վ֩բր\u058cրք", (byte)89, 70);
               ZKM_STR_B[9] = NLoginCore_575.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՂՇԪԾՅՉԬՋԔՄՏ", (byte)89, 67);
               ZKM_STR_B[10] = NLoginCore_559.A("ƗšƛƈƘƌƭƲŽƮƨƋƆƘŷƓƎƹƏƯŵƗƄƅ", (byte)89, 65);
               ZKM_STR_B[11] = NLoginCore_183.B("ŶƦƣƮƦƭžƥƦƪƈŹ", (byte)89, 66);
               ZKM_STR_B[12] = NLoginCore_110.E("փստՈՏի֔մվ֏յբիթկիֆ՞\u0557ճց֡ըթ", (byte)89, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.F("իռձ՝ՒֆխայնւնՑժ֛\u0590ջ֠շ֝՚֡ըթ", (byte)89, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.D("ԊԤԉԻԮԺԙԉԾԍԬӿԱԁԟԜԄՂԅԷԺԸԬՈԧ\u0530ԮԩԿԞԲՕ", (byte)89, 68);
         }
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      boolean var2 = var1.a(a(al, at), a(bd & bf, bh)).equalsIgnoreCase(a(bi, bk ^ bm));
      if (var2) {
         int var3 = var1.a(a(bn, bo ^ br), bu);
         String var4 = var1.b(a(bw, by ^ ca));
         String var5 = var1.b(a(cb & cc, cd));
         String var6 = var1.b(a(ce & cg, ci));
         String var7 = var1.b(a(cj & cm, cn));
         this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var4, var3, var7, var5, var6, new Properties()));
      } else {
         File var8 = new File(this.b(), a(co & cr, ct));
         this.d = NLoginCore_586.a(this.m, var8, new Properties());
      }
   }
}
