package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_003 implements NLoginInterface_019<AccountData> {
   private static long ag = Long.reverse(864691128455135232L);
   private static int n = (0 >>> 122 | 0 << -122) & -1;
   private static int t = (8388608 >>> 181 | 8388608 << ~181 + 1) & -1;
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int y = 512 >>> 201 | 512 << -201;
   private static int ah = Integer.reverse(-1879048192);
   private static int bf = Integer.reverse(-2013265920);
   private static long aw = Long.reverse(864691128455135232L);
   private static long ao = Long.reverse(9006060072021402901L);
   private static int c = Integer.reverse(0);
   private static int bd = 33554432 >>> 181 | 33554432 << ~181 + 1;
   private static long u = Long.reverse(8141368943566267669L);
   private static int a = Integer.reverse(0);
   private static long aj = Long.reverse(864691128455135232L);
   private static long am = Long.reverse(864691128455135232L);
   private static int bb = (-1 >>> 128 | -1 << ~128 + 1) & -1;
   private static long ar = Long.reverse(9006060072021402901L);
   private final Field[] a = AccountDataImpl.class.getDeclaredFields();
   private static long d = Long.reverse(8141368943566267669L);
   private static long al = Long.reverse(9006060072021402901L);
   private static int bh = (2304 >>> 167 | 2304 << -167) & -1;
   private static String[] ZKM_STR_A = new String[NLoginType_003.bq];
   private static int ax = Integer.reverse(1879048192);
   private static int ba = Integer.reverse(-268435456);
   private static long bi = Long.reverse(8141368943566267669L);
   private static int p = Integer.reverse(1073741824);
   private final Constructor<?> a;
   private static int br = (-1342177280 >>> 91 | -1342177280 << ~91 + 1) & -1;
   private static long i = Long.reverse(8141368943566267669L);
   private static long be = Long.reverse(8141368943566267669L);
   private static int bm = (320 >>> 164 | 320 << -164) & -1;
   private static long c;
   private static int ae = '耀' >>> 'L' | 32768 << ~76 + 1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long bl = Long.reverse(8141368943566267669L);
   private static long bg = Long.reverse(8141368943566267669L);
   private static int b = (1073741824 >>> 158 | 1073741824 << ~158 + 1) & -1;
   private static long av = Long.reverse(9006060072021402901L);
   private static int ak = -1610612736 >>> 220 | -1610612736 << ~220 + 1;
   private static int bk = Integer.reverse(-1);
   private static int m = Integer.reverse(0);
   private static int at = Integer.reverse(0);
   private static int ab = (939524096 >>> 219 | 939524096 << -219) & -1;
   private static long ap = Long.reverse(864691128455135232L);
   private static long x = Long.reverse(8141368943566267669L);
   private static int w = -1 >>> 228 | -1 << ~228 + 1;
   private static int bo = Integer.reverse(-1476395008);
   private static int r = 8 >>> 97 | 8 << ~97 + 1;
   private static long ad = Long.reverse(864691128455135232L);
   private static long aa = Long.reverse(8141368943566267669L);
   private static int v = Integer.reverse(-1610612736);
   private static long g = Long.reverse(864691128455135232L);
   private static long as = Long.reverse(864691128455135232L);
   private static long bn = Long.reverse(8141368943566267669L);
   private static int ay = (-1 >>> 169 | -1 << -169) & -1;
   private static long af = Long.reverse(9006060072021402901L);
   private static int h = Integer.reverse(1073741824);
   private static long bp = Long.reverse(8141368943566267669L);
   private static long l = Long.reverse(864691128455135232L);
   private static int z = (12582912 >>> 53 | 12582912 << -53) & -1;
   private static long ai = Long.reverse(9006060072021402901L);
   private static int j = Integer.reverse(-1073741824);
   private static long f = Long.reverse(9006060072021402901L);
   private static int q = Integer.reverse(-1073741824);
   private static String[] ZKM_STR_B = new String[br];
   private static int aq = 6291456 >>> 115 | 6291456 << -115;
   private static int an = 11264 >>> 106 | 11264 << -106;
   private static long bc = Long.reverse(8141368943566267669L);
   public static NLoginType_003 a = new NLoginType_003();
   private static long az = Long.reverse(8141368943566267669L);
   private static long ac = Long.reverse(9006060072021402901L);
   private static long k = Long.reverse(9006060072021402901L);
   private static int au = Integer.reverse(-1342177280);
   private static int s = (167772160 >>> 121 | 167772160 << ~121 + 1) & -1;
   private static int bq = ('뀀' >>> 'K' | 45056 << ~75 + 1) & -1;
   private static int bj = (318767104 >>> 88 | 318767104 << -88) & -1;

   public AccountData a(@Nonnull JSONObject var1) {
      JSONArray var2 = var1.getJSONArray(a(aq, ar ^ as));
      Object[] var3 = new Object[var2.length()];

      for (int var4 = at; var4 < var3.length; var4++) {
         JSONObject var5 = var2.getJSONObject(var4);
         if (var5.has(a(au, av ^ aw))) {
            int var6 = var5.getInt(a(ax & ay, az));
            switch (var6) {
               case 0:
               case 2:
                  var3[var4] = var5.get(a(ba & bb, bc));
                  break;
               case 1:
                  var3[var4] = UUID.fromString((String)var5.get(a(bj & bk, bl)));
                  break;
               case 3:
                  var3[var4] = var5.getLong(a(bd, be));
                  break;
               case 4:
                  var3[var4] = var5.getJSONObject(a(bf, bg)).toMap();
                  break;
               case 5:
                  var3[var4] = var5.getEnum(AccountType.class, a(bh, bi));
            }
         }
      }

      try {
         return (AccountData)this.a.newInstance(var3);
      } catch (ReflectiveOperationException var7) {
         throw new RuntimeException(a(bm, bn) + AccountData.class.getCanonicalName() + a(bo, bp), var7);
      }
   }

   public NLoginType_003() {
      Field[] var1 = this.a;
      int var2 = var1.length;

      for (int var3 = a; var3 < var2; var3++) {
         Field var4 = var1[var3];
         var4.setAccessible((b != 0));
      }

      try {
         Class[] var6 = Arrays.stream(this.a).map(Field::getType).toArray(Class[]::new);
         this.a = AccountDataImpl.class.getConstructor(var6);
      } catch (NoSuchMethodException var5) {
         throw new RuntimeException(a(c, d) + AccountDataImpl.class.getCanonicalName() + a(e, f ^ g), var5);
      }
   }

   private static void b() {
      c = -6294812530500968642L;
      long var0 = c ^ 6334200019160320784L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               69,
               83,
               (byte)(16 + 31),
               (byte)(51 + 16),
               (byte)(20 + 46),
               (byte)(33 + 34),
               (byte)(29 + 18),
               (byte)(43 + 37),
               (byte)(50 + 25),
               (byte)(5 + 62),
               (byte)(25 + 58),
               (byte)(26 + 27),
               (byte)(48 + 32),
               (byte)(13 + 84),
               (byte)(59 + 41),
               (byte)(36 + 64),
               (byte)(32 + 73),
               (byte)(63 + 47),
               (byte)(92 + 11)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(25 + 44), (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_451.E("֏ֈըտ֪֢ֆ\u058b֪֊հպ֠ււ֑֥֓իֻ֭֊ֳָ֫վոֹ֚֟րְֲֳ֓\u05c9ִ։ֿ֪\u058cֱֈ֖", (byte)114, 69);
               ZKM_STR_B[1] = NLoginCore_092.D("քՔֆը։՞ճշոիֈՓ", (byte)114, 68);
               ZKM_STR_B[2] = NLoginCore_453.B("ǍƭǐƛǛƾƢǓưƯǕƯƼƼǦǫƧƥǚǮǑƱǬǄǅǖǴǎǌǅǆǋǪǊƾǺǷǻǺȁǎǘǘǽǙǖǢǙǼǬǬȂǇǟȒȅǓȑȎǔȓȑȖț", (byte)114, 66);
               ZKM_STR_B[3] = NLoginCore_384.F("֧շ֩\u058b֬ց֖֛֚֎֫ն", (byte)114, 70);
               ZKM_STR_B[4] = NLoginCore_183.F("֞֕֞֗֔դո֘\u058b֘վրֱ֪֓֩րֶ֛֘֫։ֳ֨ֈ֠տ֭յּֿւָּ֦֚֕׀ׁ֡\u05c8֥֖֩", (byte)114, 70);
               ZKM_STR_B[5] = NLoginCore_183.A("ƳƛƺƩǁƹƙƮǒƮƾƫ", (byte)114, 65);
               ZKM_STR_B[6] = NLoginCore_471.A("ǘƩǌǌƨǡǗƿǤǥǜƫ", (byte)114, 65);
               ZKM_STR_B[7] = NLoginCore_004.C("րՑմմՐ։տէ\u058c֍քՓ", (byte)114, 67);
               ZKM_STR_B[8] = NLoginCore_553.E("ֆՠ֊պմռը֎ռւհն", (byte)114, 69);
               ZKM_STR_B[9] = NLoginCore_553.A("ǄƽƝƴǟǗƻǀǟƿƘǞǅƛǒƺǩǋǀǗǯƿǩƼǟǫǁǑǸǱǛǐ", (byte)114, 65);
               ZKM_STR_B[10] = NLoginCore_138.A("ǜƬǞǀǡƶǋǏǐǃǠƫ", (byte)114, 65);
               ZKM_STR_B[11] = NLoginCore_387.C("հրՠւմՕեՆ՝ջծՓ", (byte)114, 67);
               ZKM_STR_B[12] = NLoginCore_173.C("հրՠւմՕեՆ՝ջծՓ", (byte)114, 67);
               ZKM_STR_B[13] = NLoginCore_521.C("րՑմմՐ։տէ\u058c֍քՓ", (byte)114, 67);
               ZKM_STR_B[14] = NLoginCore_575.A("ƻƕƿƯƩƱƝǃƱƷƥƫ", (byte)114, 65);
               ZKM_STR_B[15] = NLoginCore_387.C("րՑմմՐ։տէ\u058c֍քՓ", (byte)114, 67);
               ZKM_STR_B[16] = NLoginCore_141.E("֣մ֗֗ճ֢֬֊ְ֧֯ն", (byte)114, 69);
               ZKM_STR_B[17] = NLoginCore_141.C("րՑմմՐ։տէ\u058c֍քՓ", (byte)114, 67);
               ZKM_STR_B[18] = NLoginCore_076.E("֣մ֗֗ճ֢֬֊ְ֧֯ն", (byte)114, 69);
               ZKM_STR_B[19] = NLoginCore_127.B("ǘƩǌǌƨǡǗƿǤǥǜƫ", (byte)114, 66);
               ZKM_STR_B[20] = NLoginCore_453.D("լեՅ՜ևտգըևէՍ՜\u058bՉբճվ\u058bւ֖Քշ֖֑էթ՞սյ\u0590Ք֕", (byte)114, 68);
               ZKM_STR_B[21] = NLoginCore_183.B("ǜƬǞǀǡƶǋǏǐǃǠƫ", (byte)114, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_027.E("֏ֈըտ֪֢ֆ\u058b֪֊հպ֠ււ֑֥֓իֻ֭֊ֳָ֫վոֹ֚֟րְֺֻ֑֦ׅ֑֨֜֔֡֠֊ׂ֪֟֩\u05ceט׃בֻ֤֢֡", (byte)114, 69);
               ZKM_STR_B[1] = NLoginCore_183.D("ՓբՃաէՅՄբ՛աՖ\u0590հղՉՅ֑ՠաՐաձ՞՟", (byte)114, 68);
               ZKM_STR_B[2] = NLoginCore_553.D("յՕոՃփզՊջ\u0558\u0557ս\u0557դդ֎֓ՏՍւ֖չՙ֔լխվ֜նմխծճ֒ղզ֢֣֢֟֩նրր֥ցվ֊ց֤֪֔֔կւ֛քօռְֱ֖֨֬֏", (byte)114, 68);
               ZKM_STR_B[3] = NLoginCore_183.B("ǆƴƦƪǀǑƟǛƿǎƠǅǢǝǆǝǠǡǞǀưǯƶƷ", (byte)114, 66);
               ZKM_STR_B[4] = NLoginCore_575.C("ջղջմձՁՕյըյ՛՝ևհ֎ֆ՝յֈ֓ոզօ\u0590ես՜֊Ւ֙֜՟\u058cղապն֨ֈտշխ֬ճ", (byte)114, 67);
               ZKM_STR_B[5] = NLoginCore_127.A("ǚǚǘƷǟƳǂǖǔǗƾƫ", (byte)114, 65);
               ZKM_STR_B[6] = NLoginCore_384.C("ԻՖդՓ\u0558ֆպևց\u0557ՎդՈ՟եՎՊևւլ֊ա՞՟", (byte)114, 67);
               ZKM_STR_B[7] = NLoginCore_241.D("ձԾգպղՆՃմ\u058cեբՓ", (byte)114, 68);
               ZKM_STR_B[8] = NLoginCore_091.A("ƹƙƖǔƲǕƮƯƴǗƺƫ", (byte)114, 65);
               ZKM_STR_B[9] = NLoginCore_232.D("լեՅ՜ևտգըևէՀֆխՃպբ֑ճըտ֗բմջ՛խ֕֝։ա\u058bի", (byte)114, 68);
               ZKM_STR_B[10] = NLoginCore_183.B("ǆƴƔƵƺƿƫưƱƼǝƵǒƸǪǬǍǬǀƹǮǟƶƷ", (byte)114, 66);
               ZKM_STR_B[11] = NLoginCore_446.E("քդ֡վպ\u058bְֱ֤֭֮֠֒\u0590֮ձְָֹյִֺցւ", (byte)114, 69);
               ZKM_STR_B[12] = NLoginCore_223.C("ոՠնԿռը֊տռ\u058c\u058b՞խֆւՠրբ֊րֆև՞՟", (byte)114, 67);
               ZKM_STR_B[13] = NLoginCore_027.D("ՒՙցՑՃո՞տ։ֆևգխթՈՌֆ֔հ\u0590ճա՞՟", (byte)114, 68);
               ZKM_STR_B[14] = NLoginCore_138.A("ǋƺǍƨǟǒƷǙƟǝǘƫ", (byte)114, 65);
               ZKM_STR_B[15] = NLoginCore_004.A("ƨǞƖƲǜƠƜǐǏƜƥƫ", (byte)114, 65);
               ZKM_STR_B[16] = NLoginCore_110.A("ƨǇƴƶƝơƚƜǑƼǜƫ", (byte)114, 65);
               ZKM_STR_B[17] = NLoginCore_453.A("ƼƴǛƨƩǝǙǢƯƶƟǔǤƧǟǉǧƺǋǟǞǟƶƷ", (byte)114, 65);
               ZKM_STR_B[18] = NLoginCore_324.A("ǑƧƪǉƺǝǎǂƱǑƼǓƨǒǨǣǉǨǞƫƾǟƶƷ", (byte)114, 65);
               ZKM_STR_B[19] = NLoginCore_092.E("ջփևգւ։֖֮խտգ֜\u058bֱծ֦տց֑ֈֺ֖ցւ", (byte)114, 69);
               ZKM_STR_B[20] = NLoginCore_091.C("լեՅ՜ևտգըևէՍ՜\u058bՉբճվ\u058bւ֖Քցՙչչը֊Ց֢֛֛֗", (byte)114, 67);
               ZKM_STR_B[21] = NLoginCore_110.C("\u0557ռ՝ռօ՞ոՆլչեՇէՃվռէՋօգզև՞՟", (byte)114, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.E("բջքգ֔։֧֨֝վֲ֪֥֜ձ֭ևյցָֻ֛֑֫֯֕֩֓׃׀ֲ֭", (byte)114, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.E("֏֑տ֖֓զչ֣֠֙֙հֱ֖֮֍֥֔֕֒չ֪ցւ", (byte)114, 69);
         }
      }
   }

   static {
      b();
   }

   @Override
   public Class<?> a() {
      return AccountData.class;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_003.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.F("ԆԨԪԊԮՍՅ՛ՇԖՔՊ\u0558ՒԛՀբաՙ՟ՙԮ", (byte)34, 70), NLoginType_003.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_183.D("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњߏ߶ߔ߯߸߫ߺ߇ߚߛѰ", (byte)34, 68) + var1 + NLoginCore_324.F("Ԙ", (byte)34, 70) + var2.toString(), var4);
      }
   }

   public JSONObject a(@Nonnull AccountData var1) {
      if (!(var1 instanceof AccountDataImpl)) {
         throw new IllegalArgumentException(a(h, i) + AccountDataImpl.class.getCanonicalName() + a(j, k ^ l) + var1.getClass().getCanonicalName());
      } else {
         JSONObject var2 = new JSONObject();
         JSONArray var3 = new JSONArray();

         try {
            for (int var4 = m; var4 < this.a.length; var4++) {
               JSONObject var5 = new JSONObject();
               var3.put(var4, var5);
               Object var6 = this.ZKM_STR_A[var4].get(var1);
               if (var6 != null) {
                  int var7;
                  if (var6 instanceof String) {
                     var7 = n;
                  } else if (var6 instanceof UUID) {
                     var7 = o;
                  } else if (var6 instanceof Boolean) {
                     var7 = p;
                  } else if (var6 instanceof Long) {
                     var7 = q;
                  } else if (var6 instanceof Map) {
                     var7 = r;
                  } else {
                     if (!(var6 instanceof AccountType)) {
                        throw new IllegalArgumentException(a(t, u) + var6.getClass().getCanonicalName() + a(v & w, x) + var6);
                     }

                     var7 = s;
                  }

                  if (var7 == y) {
                     var5.put(a(z, aa), var6.toString());
                  } else {
                     var5.put(a(ab, ac ^ ad), var6);
                  }

                  var5.put(a(ae, af ^ ag), var7);
               }
            }
         } catch (ReflectiveOperationException var8) {
            throw new RuntimeException(a(ah, ai ^ aj) + AccountData.class.getCanonicalName() + a(ak, al ^ am), var8);
         }

         var2.put(a(an, ao ^ ap), var3);
         return var2;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 48L;
      var1 ^= 6334200019160320784L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(8 + 61),
                     (byte)(67 + 16),
                     (byte)(30 + 17),
                     (byte)(35 + 32),
                     (byte)(62 + 4),
                     (byte)(47 + 20),
                     (byte)(8 + 39),
                     (byte)(54 + 26),
                     (byte)(28 + 47),
                     (byte)(64 + 3),
                     (byte)(15 + 68),
                     (byte)(10 + 43),
                     80,
                     (byte)(72 + 25),
                     (byte)(58 + 42),
                     (byte)(56 + 44),
                     (byte)(66 + 39),
                     110,
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.E("պևֆՉ։օր։֔փՐ֎֒\u058b֎֔Ֆࣲ࣐ࣶ࣋࣫ࣴࣧࣃࣖࣗ", (byte)91, 69));
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
}
