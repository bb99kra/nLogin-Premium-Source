package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

abstract class NLoginCore_166 extends NLoginCore_130 {
   private static String[] ZKM_STR_B = new String[NLoginCore_166.ba];
   private static int t = Integer.reverse(0);
   private static int an = (768 >>> 103 | 768 << ~103 + 1) & -1;
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int u = (16384 >>> 141 | 16384 << -141) & -1;
   private static int ar = 1792 >>> 232 | 1792 << ~232 + 1;
   private static long af = Long.reverse(-1214176938398294320L);
   private static int aq = Integer.reverse(402653184);
   private static long ap = Long.reverse(720575940379279360L);
   private static int aw = Integer.reverse(-1879048192);
   private static long ao = Long.reverse(-1934752878777573680L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int ag = Integer.reverse(536870912);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(-1934752878777573680L);
   private static long as = Long.reverse(-1214176938398294320L);
   private static long am = Long.reverse(720575940379279360L);
   private static int ak = Integer.reverse(-1610612736);
   private static int au = (-1 >>> 172 | -1 << ~172 + 1) & -1;
   private static long ai = Long.reverse(720575940379279360L);
   private static int aa = (Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190) & -1;
   private static long f;
   private final String cu;
   private static int ae = -1 >>> 164 | -1 << ~164 + 1;
   private static long x = Long.reverse(-1214176938398294320L);
   private static int y = (16777216 >>> 247 | 16777216 << -247) & -1;
   private static long ay = Long.reverse(-1214176938398294320L);
   private static int ba = -2147483646 >>> 222 | -2147483646 << -222;
   private static int aj = ('쀀' >>> 238 | 49152 << ~238 + 1) & -1;
   private static int ad = 1572864 >>> 179 | 1572864 << ~179 + 1;
   private static int at = (2097152 >>> 50 | 2097152 << -50) & -1;
   private static int l = (268435456 >>> 250 | 268435456 << ~250 + 1) & -1;
   private static long ah = Long.reverse(-1934752878777573680L);
   private static int ax = Integer.reverse(-1);
   private static int k = Integer.reverse(-1073741824);
   private static int w = Integer.reverse(-1);
   private static long j = Long.reverse(720575940379279360L);
   private static int c = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_166.az];
   private static int ac = Integer.reverse(0);
   private static long av = Long.reverse(-1214176938398294320L);
   private static long ab = Long.reverse(-1214176938398294320L);
   private static int az = Integer.reverse(1342177280);
   private static long al = Long.reverse(-1934752878777573680L);
   private static int r = Integer.reverse(0);

   public String j(String var1, String var2) {
      return a(ar, as) + this.cu + a(at & au, av) + this.E(this.E(var1) + var2) + a(aw & ax, ay) + var2;
   }

   static {
      b();
   }

   @Override
   public String w(String var1) {
      return this.D(var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_166.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.D("ПсуУчѦўѴѠЯѭѣѱѫдљѻѺѲѸѲч", (byte)22, 68), NLoginCore_166.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.F("ԵՂՁԄՄՀԻՄՏԾԋՉՍՆՉՏԑ࢘ࢍࢬࢪ࢛࢙ࢦ\u0890ࢲࢨ\u0895ࢡࢩࢹࢳԬ", (byte)22, 70) + var1 + NLoginCore_141.E("Ԍ", (byte)22, 69) + var2.toString(), var4
         );
      }
   }

   public String E(String var1) {
      return super.w(var1);
   }

   private static void b() {
      f = 827028695545177255L;
      long var0 = f ^ -1368022113552861184L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(49 + 20),
               (byte)(48 + 35),
               (byte)(21 + 26),
               (byte)(3 + 64),
               66,
               (byte)(58 + 9),
               (byte)(41 + 6),
               (byte)(9 + 71),
               (byte)(44 + 31),
               (byte)(57 + 10),
               (byte)(45 + 38),
               (byte)(50 + 3),
               (byte)(34 + 46),
               (byte)(61 + 36),
               (byte)(72 + 28),
               (byte)(83 + 17),
               (byte)(26 + 79),
               (byte)(59 + 51),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.B("ƽǀƹǂǉǆƝƈƑưƋƙ", (byte)105, 66);
               ZKM_STR_B[1] = NLoginCore_092.F("հ֠ՙ\u0590֠֙՝ձշա֢խ", (byte)105, 70);
               ZKM_STR_B[2] = NLoginCore_575.D("ԻիԤ՛իդԨԼՂԬխԸ", (byte)105, 68);
               ZKM_STR_B[3] = NLoginCore_223.A("ƵƔƻǃƚƞƭƺƿƦƤƙ", (byte)105, 65);
               ZKM_STR_B[4] = NLoginCore_397.D("ՔԳ՚բԹԽՌՙ՞ՅՃԸ", (byte)105, 68);
               ZKM_STR_B[5] = NLoginCore_138.D("ԟ՜՛ԿԤՎԽՅՑՀգԬՊհՏԱ\u0557ԳռժՑ՜՚վՁհյեբճ\u0558րՈ\u058bօ֊ջՠ՛դսՐՓսեվևեհճ֘դ\u0590\u058cգդ", (byte)105, 68);
               ZKM_STR_B[6] = NLoginCore_427.D("ԛժէՊԾբբՙՃձԿԸ", (byte)105, 68);
               ZKM_STR_B[7] = NLoginCore_201.B("ƵƔƻǃƚƞƭƺƿƦƤƙ", (byte)105, 66);
               ZKM_STR_B[8] = NLoginCore_553.E("։ը֏֗ծղց֎֓պոխ", (byte)105, 69);
               ZKM_STR_B[9] = NLoginCore_004.F("։ը֏֗ծղց֎֓պոխ", (byte)105, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.D("՟ԹԷՌ՜ԩՂՌՌՂՓԸ", (byte)105, 68);
               ZKM_STR_B[1] = NLoginCore_027.F("\u058c֑֝՚֖֎֞չՠ֝քխ", (byte)105, 70);
               ZKM_STR_B[2] = NLoginCore_446.D("՛գՕ՞ԾԾՎՊխԾ՝Ը", (byte)105, 68);
               ZKM_STR_B[3] = NLoginCore_471.E("յ֞֍ՙ\u058c֤֠֜շև֖խ", (byte)105, 69);
               ZKM_STR_B[4] = NLoginCore_521.E("֎֗ր\u0590֟ցւ\u0557֡֏֚խ", (byte)105, 69);
               ZKM_STR_B[5] = NLoginCore_397.B("ƀƽƼƠƅƯƞƦƲơǄƍƫǑưƒƸƔǝǋƲƽƻǟƢǑǖǆǃǔƹǡƩǬǦǫǜǁƼǅǞƱƴǭǶǈǪǬǐǵǥǆǈǇǄǅ", (byte)105, 66);
               ZKM_STR_B[6] = NLoginCore_387.C("ՓԴՇԹՠԿԸ՜ԽՊԮԸ", (byte)105, 67);
               ZKM_STR_B[7] = NLoginCore_575.F("լյ\u0590րփ՚ա՟֏ք֞խ", (byte)105, 70);
               ZKM_STR_B[8] = NLoginCore_201.F("ժ֍հռ֝յվձպֆ֦խ", (byte)105, 70);
               ZKM_STR_B[9] = NLoginCore_453.C("\u0557Չ\u0558ԥծԶ\u0557կՍՍԮԸ", (byte)105, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_223.F("\u0557ր֠֕ն֏փպ֏֛ձփա֟չֆվ֢֜ի֞օ֢֊֕նֱ֤֕ն֪֒", (byte)105, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.E("\u0558Ցհ֕յ֍՞֛ևչզ֠֊֖տխծְչֳ֯ղ֧կֱ֨քֳֵֹּշ", (byte)105, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 80L;
      var1 ^= -1368022113552861184L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(6 + 63),
                     83,
                     (byte)(11 + 36),
                     (byte)(14 + 53),
                     (byte)(23 + 43),
                     (byte)(41 + 26),
                     47,
                     (byte)(34 + 46),
                     (byte)(37 + 38),
                     (byte)(24 + 43),
                     (byte)(82 + 1),
                     (byte)(14 + 39),
                     (byte)(18 + 62),
                     (byte)(36 + 61),
                     (byte)(75 + 25),
                     (byte)(59 + 41),
                     (byte)(68 + 37),
                     (byte)(73 + 37),
                     (byte)(55 + 48)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.D("ր֍\u058cՏ֏\u058bֆ֏֚։Ֆ֑֚֔֘֔՜ࣱࣣࣦࣘࣷࣵࣤࣛࣽࣳ࣠࣬ࣴऄࣾ", (byte)120, 68));
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

   @Override
   public boolean i(String var1, String var2) {
      String[] var3 = var2.split(a(c, i ^ j));
      if (var3.length != k && var3.length != l) {
         return (r != 0);
      } else {
         String var4 = var3[s];
         if (!var4.equalsIgnoreCase(this.cu)) {
            return (t != 0);
         } else {
            String var5 = this.E(var1);
            String var6 = var3[u];
            switch (var3.length) {
               case 3:
                  String[] var7 = var2.split(a(v & w, x));
                  if (var7.length == y) {
                     String var9 = var7[z];
                     return var6.equals(this.E(var5 + var9) + a(aa, ab) + var9);
                  } else {
                     if (var7.length > 0) {
                        return var7[ac].equals(a(ad & ae, af) + var4 + a(ag, ah ^ ai) + var5);
                     }

                     return var6.equals(var5);
                  }
               case 4:
                  String var8 = var3[aj];
                  return var6.equals(this.E(var5 + var8));
               default:
                  throw new IllegalArgumentException(a(ak, al ^ am) + super.cm + a(an, ao ^ ap) + var3.length);
            }
         }
      }
   }

   public String D(String var1) {
      String var2 = NLoginCore_354.a(NLoginCore_198.c, aq);
      return this.j(var1, var2);
   }

   protected NLoginCore_166(String var1, String var2) {
      super(var1);
      this.cu = var2;
   }
}
