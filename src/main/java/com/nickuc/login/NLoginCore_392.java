package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_392 extends HikariConnectionPool {
   private static long aj = Long.reverse(3257427245783188660L);
   private static int am = 10240 >>> 10 | 10240 << ~10 + 1;
   private static long ao = Long.reverse(-921913208416631628L);
   private static long n = Long.reverse(-921913208416631628L);
   private static int af = 536870912 >>> 58 | 536870912 << -58;
   private static long ah = Long.reverse(-2449958197289549824L);
   private static int au = Integer.reverse(805306368);
   private static int o = Integer.reverse(-1073741824);
   private static long r = Long.reverse(-2449958197289549824L);
   private static long f;
   private static long ag = Long.reverse(3257427245783188660L);
   private static long aq = Long.reverse(3257427245783188660L);
   private static int an = (-1 >>> 223 | -1 << -223) & -1;
   private static int j = (-1 >>> 246 | -1 << ~246 + 1) & -1;
   private static int y = 384 >>> 166 | 384 << -166;
   private static long q = Long.reverse(3257427245783188660L);
   private static int m = (-1 >>> 249 | -1 << ~249 + 1) & -1;
   private static long ae = Long.reverse(-921913208416631628L);
   private static int u = 1280 >>> 8 | 1280 << ~8 + 1;
   private static int ac = 1792 >>> 40 | 1792 << -40;
   private static int ad = Integer.reverse(-1);
   private static long w = Long.reverse(-921913208416631628L);
   private static long h = Long.reverse(-921913208416631628L);
   private static String[] ZKM_STR_B = new String[au];
   private static int d = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_392.as];
   private static long k = Long.reverse(-921913208416631628L);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(-1);
   private static long ab = Long.reverse(-2449958197289549824L);
   private static int l = Integer.reverse(1073741824);
   private static int as = 786432 >>> 80 | 786432 << ~80 + 1;
   private static long t = Long.reverse(-921913208416631628L);
   private static long aa = Long.reverse(3257427245783188660L);
   private static int ai = Integer.reverse(-1879048192);
   private static int s = Integer.reverse(536870912);
   private static long ar = Long.reverse(-2449958197289549824L);
   private static long al = Long.reverse(-2449958197289549824L);
   private static int ap = (352 >>> 197 | 352 << -197) & -1;
   private static int e = (-1 >>> 25 | -1 << ~25 + 1) & -1;

   private static void b() {
      f = 3251714733130984628L;
      long var0 = f ^ -1112873471120472647L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(44 + 24),
               (byte)(25 + 44),
               (byte)(11 + 72),
               (byte)(30 + 17),
               (byte)(19 + 48),
               (byte)(28 + 38),
               (byte)(3 + 64),
               (byte)(27 + 20),
               (byte)(17 + 63),
               75,
               67,
               (byte)(79 + 4),
               (byte)(7 + 46),
               (byte)(8 + 72),
               (byte)(83 + 14),
               (byte)(8 + 92),
               (byte)(30 + 70),
               (byte)(88 + 17),
               (byte)(15 + 95),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.F("գւնզֈ֔ց֢֡ըտքփ\u0590ձ֫քթֆճշ֨֬ֈֿ\u058c֍֏պֳֺշׇֻּ֪ւ֪ׄտ֢֧֪֬֡־\u058c\u05cfֶָ֣\u05cbׂי֠֡", (byte)113, 70);
               ZKM_STR_B[1] = NLoginCore_521.B("ƱǕǄǌǉƲƴƶǀǐǚǤǒǓǄƴƢǉƞƫǨǍƹƬǈǁǥǨǵǣǩǦ", (byte)113, 66);
               ZKM_STR_B[2] = NLoginCore_575.F("դզ֙֟ֆնևիօ֏֢յ", (byte)113, 70);
               ZKM_STR_B[3] = NLoginCore_446.A("ǊƚƙƹƹǐưǖƿƝƼƩ", (byte)113, 65);
               ZKM_STR_B[4] = NLoginCore_384.D("Ծ՝ՑՁգկ՜ռսՃ՚՟՞իՌֆ՟ՄաՎՒփևգ֚էըժՕ֕֎Ւ֢֖֗օ՝օ֟՚ևստ֕գդ֚֮֝ֆ֤ֆ֒֫ֈմֱֱַ֣֚֎ֽ֔սջյ֤ցׇւ֘֡օ֟\u0590", (byte)113, 68);
               ZKM_STR_B[5] = NLoginCore_201.D("ԹղՠձգԿև\u0557ՑՅ֊՚ա\u0557ջՎ\u058cՏւէՋք՛՜", (byte)113, 68);
               ZKM_STR_B[6] = NLoginCore_232.C("՞ՒկԻնՂ՛պսՙևօզթպօ։ճօՓ֎ծ՛՜", (byte)113, 67);
               ZKM_STR_B[7] = NLoginCore_183.F("֕ջմ֖֫պ֥֛֦վբ֧֮ձ֏֞֎֖ցֵֹ֥րց", (byte)113, 70);
               ZKM_STR_B[8] = NLoginCore_141.C("ՖշԺճ՞ԸՇ՚՜։ՂՐ", (byte)113, 67);
               ZKM_STR_B[9] = NLoginCore_451.C("ԷՋՏյՏՅնըՆա\u0558ՈքջևբՋՋքղՏծ՛՜", (byte)113, 67);
               ZKM_STR_B[10] = NLoginCore_138.D("ՙիջՂնՆՁ\u0557ՀՇֈՈեըփջ֑ք\u058cբթ՞՛՜", (byte)113, 68);
               ZKM_STR_B[11] = NLoginCore_110.F("աղ֓ը֕՝ւ֣սկֱ֢֮֠֠֫հմ֮֍֤֯ֆև֧ո֟׀ց֥֕ׄ", (byte)113, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.F("գւնզֈ֔ց֢֡ըտքփ\u0590ձ֫քթֆճշ֨֬ֈֿ\u058c֍֏պֳֺշׇֻּ֪ւ֪ׄտֲ֢֧֬\u05cf֠הֲׁהֳָׂ֯֗ילַמֵֺ֛֟ע", (byte)113, 70);
               ZKM_STR_B[1] = NLoginCore_223.D("\u0558ռիճհՙ՛՝էշց\u058bչպի՛ՉհՅՒ֏ճցֆնդփ֏ֈն։խ", (byte)113, 68);
               ZKM_STR_B[2] = NLoginCore_223.A("ƱƙƗǕƯǀƗǂƵưƟƩ", (byte)113, 65);
               ZKM_STR_B[3] = NLoginCore_183.E("ֆ՟զ֛֜֟֜։ְ֣րյ", (byte)113, 69);
               ZKM_STR_B[4] = NLoginCore_324.B("ƗƶƪƚƼǈƵǕǖƜƳƸƷǄƥǟƸƝƺƧƫǜǠƼǳǀǁǃƮǮǧƫǻǯǰǞƶǞǸƳǠǖǘǮƼƽȇǳǶǟǽǟǫȄǡǍǼȊǳȐȊǧȖǭǗǍǪǹǿǴǷǲǾȑǠȤȢȠǞȞǪȞȣȩǦȭǴǵ", (byte)113, 66);
               ZKM_STR_B[5] = NLoginCore_076.C("ԹղՠձգԿև\u0557ՑՅ\u058cԾխՀ։ևգՐՏ֕քք՛՜", (byte)113, 67);
               ZKM_STR_B[6] = NLoginCore_553.F("փշ֔ՠ֛էր֢֟վ֑֫\u058cվַ֦֦֧֞֒ոֹրց", (byte)113, 70);
               ZKM_STR_B[7] = NLoginCore_530.F("֕ջմ֖֫պ֥֛֦վզ֑֎\u058b֢խִֵָ֒հֹրց", (byte)113, 70);
               ZKM_STR_B[8] = NLoginCore_427.B("ǇƚƱƧǇƫǘƳƹƻǢƩ", (byte)113, 66);
               ZKM_STR_B[9] = NLoginCore_138.D("ԷՋՏյՏՅնըՆա\u0558գվնՌ\u058cգբզՍքծ՛՜", (byte)113, 68);
               ZKM_STR_B[10] = NLoginCore_092.B("ƲǄǔƛǏƟƚưƙƠǟƥǂƟǒǦǛƫǭǡƤǭƴƵ", (byte)113, 66);
               ZKM_STR_B[11] = NLoginCore_027.D("ԼՍծՃհԸ՝վ\u0558Պջջ։\u058cֆսՋՏ։ը֊կ֕ըմ՚շՔ֝ղ՝Ֆ", (byte)113, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_223.C("՜ԻհճՑղՒե՝՛գջցՋպՇդբղ՟֍Ցյՠչթ֒֜կ֝։֟", (byte)113, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_324.A("ǊƥƵƳƗǗƞǂƺƺƱǕǒǀƨǄǢƾǟǗǝǇƴƵ", (byte)113, 65);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 123L;
      var1 ^= -1112873471120472647L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(11 + 58),
                     (byte)(6 + 77),
                     (byte)(44 + 3),
                     (byte)(8 + 59),
                     (byte)(15 + 51),
                     (byte)(23 + 44),
                     47,
                     (byte)(64 + 16),
                     (byte)(4 + 71),
                     (byte)(13 + 54),
                     83,
                     (byte)(21 + 32),
                     (byte)(47 + 33),
                     (byte)(46 + 51),
                     (byte)(32 + 68),
                     (byte)(9 + 91),
                     (byte)(24 + 81),
                     (byte)(61 + 49),
                     (byte)(63 + 40)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.A("ĊėĖÙęĕĐęĤēàĞĢěĞĤæѠљѰѻѐѹҀѼѹѴ҆ѼѵѾљ", (byte)20, 65));
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
   protected void a(Properties var1, boolean var2) {
      super.a(var1, var2);
      var1.remove(a(am & an, ao));
      var1.remove(a(ap, aq ^ ar));
   }

   @Override
   protected String a(NLoginCore_147 var1) {
      return a(i & j, k) + var1.x() + a(l & m, n) + var1.j() + a(o, q ^ r) + var1.y();
   }

   @Override
   protected String w() {
      return a(d & e, h);
   }

   private NLoginCore_392(NLoginInterface_011<?> var1, NLoginCore_147 var2, Consumer<HikariConfig> var3, NLoginCore_536 var4) {
      super(NLoginCore_036.e, var1, var2, var3, var4);
   }

   public static NLoginCore_392 a(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return a(var0, var1, null);
   }

   public static NLoginCore_392 a(NLoginInterface_011<?> var0, NLoginCore_147 var1, Consumer<HikariConfig> var2) {
      return new NLoginCore_392(var0, var1, var2, NLoginCore_536.a);
   }

   @Override
   protected void a(HikariConfig var1, NLoginCore_147 var2) {
      var1.setDataSourceClassName(a(s, t));
      var1.addDataSourceProperty(a(u & v, w), var2.x());
      var1.addDataSourceProperty(a(y, aa ^ ab), Integer.toString(var2.j()));
      var1.addDataSourceProperty(a(ac & ad, ae), var2.y());
      var1.addDataSourceProperty(a(af, ag ^ ah), var2.z());
      var1.addDataSourceProperty(a(ai, aj ^ al), var2.j());
   }

   public static NLoginCore_392 b(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return new NLoginCore_392(var0, var1, null, NLoginCore_536.b);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_392.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.B("õėęùĝļĴŊĶąŃĹŇŁĊįőŐňŎňĝ", (byte)39, 66), NLoginCore_392.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.A("İĽļÿĿĻĶĿŊĹĆńňŁńŊČ҆ѿҖҡѶҟҦҢҟҚҬҢқҤѿħ", (byte)39, 65) + var1 + NLoginCore_127.B("ć", (byte)39, 66) + var2.toString(), var4
         );
      }
   }
}
