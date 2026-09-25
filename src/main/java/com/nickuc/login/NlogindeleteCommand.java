package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NlogindeleteCommand extends NLoginCore_353 {
   private static long p = Long.reverse(6579213328731782189L);
   private static int at = 1280 >>> 167 | 1280 << ~167 + 1;
   private static int ah = Integer.reverse(0);
   private static int j = (134217728 >>> 155 | 134217728 << ~155 + 1) & -1;
   private static long ax = Long.reverse(3408679191062953005L);
   private static long e = Long.reverse(6579213328731782189L);
   private static int q = Integer.reverse(-1073741824);
   private static int v = (0 >>> 131 | 0 << ~131 + 1) & -1;
   private static int bb = 1536 >>> 199 | 1536 << ~199 + 1;
   private static long ay = Long.reverse(8358680908399640576L);
   private static long ag = Long.reverse(6579213328731782189L);
   private static int k = 0 >>> 185 | 0 << -185;
   private static int u = Integer.reverse(0);
   private static int l = Integer.reverse(1073741824);
   private static int an = Integer.reverse(-1);
   private static float w = Float.intBitsToFloat(Integer.reverse(3714));
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static long h = Long.reverse(8358680908399640576L);
   private static int c = Integer.reverse(0);
   private static long c;
   private static long au = Long.reverse(3408679191062953005L);
   private static int y = 134217728 >>> 249 | 134217728 << -249;
   private static int i = (1 >>> 224 | 1 << ~224 + 1) & -1;
   private static int ai = -1073741823 >>> 190 | -1073741823 << ~190 + 1;
   private static long ao = Long.reverse(6579213328731782189L);
   private static String[] ZKM_STR_A = new String[NlogindeleteCommand.ba];
   private static int al = Integer.reverse(1073741824);
   private static long ak = Long.reverse(8358680908399640576L);
   private static String[] ZKM_STR_B = new String[bb];
   private static long g = Long.reverse(3408679191062953005L);
   private static long ad = Long.reverse(6579213328731782189L);
   private static int ap = 0 >>> 10 | 0 << ~10 + 1;
   private static int af = Integer.reverse(1610612736);
   private static int o = (4194304 >>> 181 | 4194304 << ~181 + 1) & -1;
   private static long ar = Long.reverse(3408679191062953005L);
   private static int ac = (-1 >>> 239 | -1 << ~239 + 1) & -1;
   private static long as = Long.reverse(8358680908399640576L);
   private static int aw = Integer.reverse(-805306368);
   private static int aq = 603979776 >>> 186 | 603979776 << -186;
   private static int am = Integer.reverse(268435456);
   private static int n = Integer.reverse(0);
   private static int z = -1 >>> 204 | -1 << ~204 + 1;
   private static int ab = Integer.reverse(-1610612736);
   private static long r = Long.reverse(3408679191062953005L);
   private static long av = Long.reverse(8358680908399640576L);
   private static int ba = Integer.reverse(805306368);
   private static int ae = (0 >>> 106 | 0 << ~106 + 1) & -1;
   private static long aa = Long.reverse(6579213328731782189L);
   private static int az = (0 >>> 228 | 0 << ~228 + 1) & -1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long aj = Long.reverse(3408679191062953005L);
   private static long s = Long.reverse(8358680908399640576L);
   private static int d = (-1 >>> 122 | -1 << -122) & -1;
   private static int m = 2097152 >>> 181 | 2097152 << ~181 + 1;
   private static float x = Float.intBitsToFloat((1028 >>> 236 | 1028 << ~236 + 1) & -1);

   public NlogindeleteCommand(NLoginType_008 var1) {
      super(var1, a(c & d, e), a(f, g ^ h), (i != 0), (j != 0));
   }

   private static void b() {
      c = -5459126873152785676L;
      long var0 = c ^ -8139960284009414418L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(26 + 43),
               (byte)(11 + 72),
               47,
               (byte)(59 + 8),
               (byte)(62 + 4),
               (byte)(34 + 33),
               (byte)(22 + 25),
               (byte)(5 + 75),
               (byte)(4 + 71),
               (byte)(5 + 62),
               83,
               (byte)(3 + 50),
               (byte)(17 + 63),
               (byte)(89 + 8),
               (byte)(52 + 48),
               (byte)(59 + 41),
               (byte)(66 + 39),
               (byte)(80 + 30),
               (byte)(31 + 72)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_091.C("֊սՠվօՐծ՝֑֔֕՜", (byte)117, 67);
               ZKM_STR_B[1] = NLoginCore_127.B("ǑƯǓǤǖǢǧǡǨǪǃƻǩǞǈƻǮǏƴǭǳǴƲǋƲǰǯƻƼǬƼƳǸǬƼǖƸǳǓǥǦǅȂǑ", (byte)117, 66);
               ZKM_STR_B[2] = NLoginCore_138.D("ժֆտՠտղղգգժՕ֗օկմ֚ՙ՞ՙյծ֠էը", (byte)117, 68);
               ZKM_STR_B[3] = NLoginCore_471.D("դչ֊էՇ՛խ՟ևքՑւֈՖ֙Ւ֗՝և֡ճ֠էը", (byte)117, 68);
               ZKM_STR_B[4] = NLoginCore_091.B("ƳǔƜǢƘǕƹǗǩǥǔǍǘƼǑǧǇǪǣƾǈǂǈǸǇƶǑǍǘǻǛǰǐȄǑǐƼǨǳǵǀȁȆǮȃǡȐǢǯȎǑȖȊǿǏǕȚȓǚǙȇȟǛȠ", (byte)117, 66);
               ZKM_STR_B[5] = NLoginCore_384.E("էժթ֍֥ւ\u058bֱ֢ր\u0590քֱִַֺ֣֣֭֭֫֟քօ", (byte)117, 69);
               ZKM_STR_B[6] = NLoginCore_004.D("փ\u0558֏ևՌ֏դսՒ֏՟՜", (byte)117, 68);
               ZKM_STR_B[7] = NLoginCore_110.A("ǣǃǌƮƴƠƼǝƨơǚƺǧƹǫǡǋǮǌǢǏƩƲǹǴǶǝǨǘǈƾǋǮȄǶƿƿǳǥȉǼǊǔǑ", (byte)117, 65);
               ZKM_STR_B[8] = NLoginCore_183.E("պ֤֚պ֜ւ֪\u058c֩սրչ", (byte)117, 69);
               ZKM_STR_B[9] = NLoginCore_004.F("ն֦ջ֊֥֍֥֊ֳ֟֞չ", (byte)117, 70);
               ZKM_STR_B[10] = NLoginCore_530.C("լփըՇ։տՋֈՋծ\u0557ճ֑֕\u0558ևՓստմխի՜ձ֤֚֘֟տպ֜֊ս֖խ֬վֲխֱֳ֞֨֙֫ճֲ֎ֹ֚֬֟֬֞ևֈ", (byte)117, 67);
               ZKM_STR_B[11] = NLoginCore_397.D("չոՠ՜քՉֈձօէէ՜", (byte)117, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.C("֍ՙլ՜ՙժհեդօ֗\u058bՕփևձ֖՛՚֠֙ժէը", (byte)117, 67);
               ZKM_STR_B[1] = NLoginCore_433.D("ռ՚վ֏ց֍֒\u058c֓֕ծզ֔։ճզ֙պ՟֘֞֟՝ն՝֛֚զէ֗է՞փ֧֮ֆ֫և֥֦վַ֭ռ", (byte)117, 68);
               ZKM_STR_B[2] = NLoginCore_446.F("և֣֜ս֜֏֏րրևկցճַָ֖֛֯֘\u0590ֽ֫քօ", (byte)117, 70);
               ZKM_STR_B[3] = NLoginCore_183.E("ց֖֧քդո֊ռ֤֡ծֳֶ֪֯֫֙ղּ־ָ֭քօ", (byte)117, 69);
               ZKM_STR_B[4] = NLoginCore_223.F(
                  "ջ֜դ֪ՠ֝ցֱ֭֟֜֕֠ք֙֯֏ֲ֫ֆ\u0590֊\u0590׀֏վ֙֕֠׃ָ֣֘\u05cc֙֘քְֻֽֈ\u05c9\u05ceֶ\u05cb֩טַ֪ז֙מג׀נִׁאִׅעמעֶע\u05cb\u05ebׁף\u05c9֨֯ר֯׀ֹ", (byte)117, 70
               );
               ZKM_STR_B[5] = NLoginCore_324.B("ƟƢơǅǝƺǃǩǚƸǉǘƸƸƼǝƫǆǉǈǴǡǫǗǛƴǺǞǇǝȀƹ", (byte)117, 66);
               ZKM_STR_B[6] = NLoginCore_559.D("ֆտ՚ֆևհէՍ֊է֕՜", (byte)117, 68);
               ZKM_STR_B[7] = NLoginCore_241.E("֫\u058b֔նռըք֥հթ֢ւ֯ցֳֶ֪֩֓֔֗ձպּׁ־ְ֥֠\u0590ֆ֓֒փֽ֥֚֚֏֢֑׃֞גׇ֧֑֭֒֨ב֕ךַ֤֥", (byte)117, 69);
               ZKM_STR_B[8] = NLoginCore_575.B("ƪƺǎǙƸǘƨǑƧƸǧƭǊƦǧǯǇǎǮǃǲǵƼƽ", (byte)117, 66);
               ZKM_STR_B[9] = NLoginCore_232.B("ǜƫƤǡǛǤǢƹơǂǞƱ", (byte)117, 66);
               ZKM_STR_B[10] = NLoginCore_110.A("ǁǘƽƜǞǔƠǝƠǃƬǈǪǦƭǜƨǒǔǉǂǀƱǆǭǴǹǯǔǏǱǟǒǫǂȁǓȇǂǳǽȆȆǌȏǷǫǦǋȔǴǯǪȅǜǝ", (byte)117, 65);
               ZKM_STR_B[11] = NLoginCore_427.F("ց֪֗զըլրէլ֢֝չ", (byte)117, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.D("ՈՎֆՋ՝ղկբժ֔֍զՖօզ՛֊որհ֘\u0590էը", (byte)117, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.B("ƯƷƶƤƳǗǝǔƜǥǁǃǥǠǍƺǎǑǟǢǭǱƸƳǕǴǚǶǱǳȁƽ", (byte)117, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= -8139960284009414418L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     69,
                     (byte)(38 + 45),
                     (byte)(45 + 2),
                     (byte)(23 + 44),
                     (byte)(45 + 21),
                     (byte)(9 + 58),
                     (byte)(30 + 17),
                     (byte)(78 + 2),
                     (byte)(71 + 4),
                     (byte)(5 + 62),
                     (byte)(32 + 51),
                     (byte)(50 + 3),
                     (byte)(48 + 32),
                     (byte)(4 + 93),
                     (byte)(36 + 64),
                     (byte)(51 + 49),
                     (byte)(103 + 2),
                     (byte)(99 + 11),
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(42 + 41)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.A("ŮŻźĽŽŹŴŽƈŷńƂƆſƂƈŊӖұӏӘӜӕӟӌӭӠӦӜ", (byte)70, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NlogindeleteCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.A("űƓƕŵƙƸưǆƲƁƿƵǃƽƆƫǍǌǄǊǄƙ", (byte)101, 65), NlogindeleteCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.D("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢯࢊࢨࢱࢵࢮࢸࢥࣆࢹࢿࢵԻ", (byte)101, 68) + var1 + NLoginCore_433.F("՛", (byte)101, 70) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != l) {
         NLoginCore_487 var10001 = NLoginCore_487.x;
         Object[] var10002 = new Object[m];
         var10002[n] = a(o, p) + this.e() + a(q, r ^ s);
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         NLoginCore_270 var3 = new NLoginCore_270();
         String var4 = var2[t];
         NLoginCore_291 var5 = this.a.a();
         ForceRegisterConfig var6 = var5.a(var1, super.l, var2, var4);
         if (var6 != null) {
            synchronized (var6.c) {
               if (!var6.r()) {
                  NLoginCore_150.a(var1, NLoginCore_487.t);
                  NLoginCore_150.a(var1, NLoginCore_194.F);
               } else if (!var5.b(var6)) {
                  NLoginCore_150.a(var1, NLoginCore_487.w);
                  NLoginCore_150.a(var1, NLoginCore_194.F);
               } else {
                  NLoginCore_150.a(var1, NLoginCore_194.C, w, x);
                  String var8 = var6.i();
                  NLoginCore_150.a(var1, a(y & z, aa) + var8 + a(ab & ac, ad));
                  NLoginCore_150.a(var1, a(af, ag));
                  NLoginCore_150.a(var1, a(ai, aj ^ ak) + var3.a(TimeUnit.MILLISECONDS, al) + a(am & an, ao));
                  NLoginCore_370.b(a(aq, ar ^ as) + var8 + a(at, au ^ av) + var1.getName() + a(aw, ax ^ ay));
               }
            }
         }
      }
   }
}
