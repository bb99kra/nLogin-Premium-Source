package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_371 {
   private static int ce = 0 >>> 199 | 0 << -199;
   private static int r = Integer.reverse(1610612736);
   private static long dp = Long.reverse(-2594073385365405696L);
   private static int aj = Integer.reverse(0);
   private static int eq = Integer.reverse(1677721600);
   private static int bg = (0 >>> 166 | 0 << -166) & -1;
   private static int ed = (285212672 >>> 119 | 285212672 << ~119 + 1) & -1;
   private static int bw = (0 >>> 183 | 0 << -183) & -1;
   private static long et = Long.reverse(3663701719793690145L);
   private static int cc = Integer.reverse(0);
   private static int bl = Integer.reverse(1879048192);
   private static long co = Long.reverse(-2594073385365405696L);
   private static int am = 25165824 >>> 23 | 25165824 << ~23 + 1;
   private static long cq = Long.reverse(-1236214674785409503L);
   private static long ck = Long.reverse(3663701719793690145L);
   private static String[] ZKM_STR_B = new String[NLoginCore_371.fa];
   private static long cy = Long.reverse(-2594073385365405696L);
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(-2594073385365405696L);
   private static long eo = Long.reverse(-2594073385365405696L);
   private static int eg = Integer.reverse(-1006632960);
   private static int cm = 1073741825 >>> 60 | 1073741825 << -60;
   private static long ek = Long.reverse(3663701719793690145L);
   private static int bk = Integer.reverse(0);
   private static long f = Long.reverse(-1236214674785409503L);
   private static long cv = Long.reverse(-2594073385365405696L);
   private static long ew = Long.reverse(3663701719793690145L);
   private static long bv = Long.reverse(1711367858400788480L);
   private static long i = Long.reverse(-1236214674785409503L);
   private static int ev = Integer.reverse(335544320);
   private static int au = Integer.reverse(0);
   private static long cb = Long.reverse(-2594073385365405696L);
   private static int cp = Integer.reverse(-1476395008);
   private static int ba = Integer.reverse(0);
   private static long l = Long.reverse(-1236214674785409503L);
   private static int al = Integer.reverse(1073741824);
   private static long ea = Long.reverse(-2594073385365405696L);
   private static int ez = 536870917 >>> 29 | 536870917 << -29;
   private static long cn = Long.reverse(3663701719793690145L);
   private static int as = Integer.reverse(0);
   private static int ak = (16384 >>> 14 | 16384 << ~14 + 1) & -1;
   private static int dt = Integer.reverse(2013265920);
   private static int bi = (0 >>> 178 | 0 << -178) & -1;
   private static long db = Long.reverse(-2594073385365405696L);
   private static long ar = Long.reverse(-1236214674785409503L);
   private static int g = Integer.reverse(1073741824);
   private static int bm = Integer.reverse(-1);
   private static long q = Long.reverse(-1236214674785409503L);
   private static long ec = Long.reverse(-1236214674785409503L);
   private static final AtomicInteger b = new AtomicInteger();
   private static int dk = 3456 >>> 7 | 3456 << -7;
   private static int em = Integer.reverse(-1543503872);
   private static long er = Long.reverse(-1236214674785409503L);
   private static long bs = Long.reverse(3663701719793690145L);
   private static int eb = 276824064 >>> 183 | 276824064 << ~183 + 1;
   private static int v = Integer.reverse(-536870912);
   private static long ds = Long.reverse(-1236214674785409503L);
   private static int av = 4 >>> 128 | 4 << ~128 + 1;
   private static int dq = Integer.reverse(-1207959552);
   private static int bf = Integer.reverse(0);
   private static long ei = Long.reverse(-2594073385365405696L);
   private static int ey = (0 >>> 236 | 0 << ~236 + 1) & -1;
   private static int cg = Integer.reverse(1207959552);
   private static long dm = Long.reverse(-2594073385365405696L);
   private static long bn = Long.reverse(-1236214674785409503L);
   private static int es = Integer.reverse(-469762048);
   private static int b = -1 >>> 199 | -1 << -199;
   private static int dy = Integer.reverse(67108864);
   private static long dl = Long.reverse(3663701719793690145L);
   private static long n = Long.reverse(-1236214674785409503L);
   private static int cr = 360448 >>> 46 | 360448 << -46;
   private static int bz = Integer.reverse(-2013265920);
   private static long cu = Long.reverse(3663701719793690145L);
   private static int bo = 3840 >>> 8 | 3840 << ~8 + 1;
   private static long el = Long.reverse(-2594073385365405696L);
   private static long bu = Long.reverse(1827335548805578752L);
   private static int dd = (0 >>> 145 | 0 << ~145 + 1) & -1;
   private static int dr = (-1 >>> 223 | -1 << -223) & -1;
   private static long ex = Long.reverse(-2594073385365405696L);
   private static int aw = Integer.reverse(0);
   private static int ap = 24576 >>> 235 | 24576 << -235;
   private static final AtomicLong c = new AtomicLong();
   private static final Cache<String, NLoginCore_259> k = Caffeine.newBuilder().expireAfterWrite(NLoginCore_371.fb, TimeUnit.MINUTES).build();
   private static long eh = Long.reverse(3663701719793690145L);
   private static int bh = 134217728 >>> 155 | 134217728 << ~155 + 1;
   private static long by = Long.reverse(561014812956426240L);
   private static long bq = Long.reverse(-2594073385365405696L);
   private static long d = Long.reverse(-1236214674785409503L);
   private static int af = Integer.reverse(1342177280);
   private static int de = -1342177273 >>> 92 | -1342177273 << -92;
   private static long cs = Long.reverse(-1236214674785409503L);
   private static long du = Long.reverse(-1236214674785409503L);
   private static int br = (64 >>> 194 | 64 << -194) & -1;
   private static long c;
   private static long dw = Long.reverse(-1236214674785409503L);
   private static int dv = 2080374784 >>> 26 | 2080374784 << -26;
   private static int p = -1 >>> 28 | -1 << -28;
   private static int df = (4 >>> 162 | 4 << ~162 + 1) & -1;
   private static int k = -2147483647 >>> 127 | -2147483647 << ~127 + 1;
   private static int u = Integer.reverse(0);
   private static int cj = 1275068416 >>> 58 | 1275068416 << -58;
   private static int dc = 262144 >>> 16 | 262144 << -16;
   private static long fb = Long.reverse(5764607523034234880L);
   private static int ep = (0 >>> 114 | 0 << ~114 + 1) & -1;
   private static int ai = Integer.reverse(536870912);
   private static long w = Long.reverse(3663701719793690145L);
   private static long t = Long.reverse(-2594073385365405696L);
   private static long bp = Long.reverse(3663701719793690145L);
   private static long bd = Long.reverse(-1236214674785409503L);
   private static int bx = (6400 >>> 7 | 6400 << ~7 + 1) & -1;
   private static long ao = Long.reverse(-1236214674785409503L);
   private static volatile long z;
   private static int ax = Integer.reverse(0);
   private static long ab = Long.reverse(-2594073385365405696L);
   private static int dh = (109051904 >>> 118 | 109051904 << -118) & -1;
   private static long var_do = Long.reverse(3663701719793690145L);
   private static int dn = (-1073741823 >>> 156 | -1073741823 << ~156 + 1) & -1;
   private static long cl = Long.reverse(-2594073385365405696L);
   private static int fa = -1543503872 >>> 250 | -1543503872 << -250;
   private static int h = Integer.reverse(-1);
   private static int ej = Integer.reverse(603979776);
   private static long ae = Long.reverse(-2594073385365405696L);
   private static String[] ZKM_STR_A = new String[ez];
   private static int aq = -1 >>> 103 | -1 << -103;
   private static int be = 4194304 >>> 84 | 4194304 << -84;
   private static long ag = Long.reverse(3663701719793690145L);
   private static long ca = Long.reverse(3663701719793690145L);
   private static int a = 0 >>> 187 | 0 << -187;
   private static long ci = Long.reverse(-2594073385365405696L);
   private static int ct = Integer.reverse(-402653184);
   private static long cx = Long.reverse(3663701719793690145L);
   private static int dx = 0 >>> 93 | 0 << -93;
   private static long bt = Long.reverse(-2594073385365405696L);
   private static long ch = Long.reverse(3663701719793690145L);
   private static int cd = (10240 >>> 139 | 10240 << -139) & -1;
   private static int cz = 409600 >>> 206 | 409600 << ~206 + 1;
   private static long dj = Long.reverse(-2594073385365405696L);
   private static long di = Long.reverse(3663701719793690145L);
   private static int at = (134217728 >>> 219 | 134217728 << -219) & -1;
   private static long ad = Long.reverse(3663701719793690145L);
   private static int cf = Integer.reverse(-1610612736);
   private static int ef = (0 >>> 28 | 0 << -28) & -1;
   private static long aa = Long.reverse(3663701719793690145L);
   private static int dg = 16384000 >>> 145 | 16384000 << ~145 + 1;
   private static int j = 0 >>> 133 | 0 << -133;
   private static long ee = Long.reverse(-1236214674785409503L);
   private static int bc = Integer.reverse(-1);
   private static int bj = 67108864 >>> 58 | 67108864 << -58;
   private static int m = (65536 >>> 14 | 65536 << ~14 + 1) & -1;
   private static long da = Long.reverse(3663701719793690145L);
   private static long s = Long.reverse(3663701719793690145L);
   private static int ay = 33554432 >>> 185 | 33554432 << -185;
   private static volatile long y;
   private static int cw = Integer.reverse(402653184);
   private static int y = Integer.reverse(268435456);
   private static long en = Long.reverse(3663701719793690145L);
   private static long dz = Long.reverse(3663701719793690145L);
   private static int ac = Integer.reverse(-1879048192);
   private static int an = -1342177280 >>> 60 | -1342177280 << -60;
   private static int o = 327680 >>> 80 | 327680 << -80;
   private static long x = Long.reverse(-2594073385365405696L);
   private static int bb = 54525952 >>> 118 | 54525952 << ~118 + 1;
   private static long eu = Long.reverse(-2594073385365405696L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);

   public static NLoginCore_123 a(NLoginInterface_011<?> var0, String var1, String var2, @Nullable String var3) {
      NLoginCore_305 var4 = NLoginCore_305.a();
      NLoginCore_364 var5 = var0.b();
      var4.k(a(v, w ^ x), var5.q());
      var4.k(a(y, aa ^ ab), a(ac, ad ^ ae));
      String var10001 = a(af, ag ^ ah);
      Object[] var10002 = new Object[ai];
      var10002[aj] = BedrockFloodgateHook.cI;
      var10002[ak] = var1;
      var10002[al] = var2;
      var10002[am] = var3 == null ? a(an, ao) : a(ap & aq, ar) + var3;
      return var4.a(String.format(var10001, var10002));
   }

   private static String a(int var0, long var1) {
      var1 ^= 59L;
      var1 ^= -5373653831346280818L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     (byte)(3 + 66),
                     (byte)(72 + 11),
                     (byte)(42 + 5),
                     67,
                     (byte)(16 + 50),
                     (byte)(28 + 39),
                     (byte)(11 + 36),
                     (byte)(48 + 32),
                     (byte)(13 + 62),
                     (byte)(50 + 17),
                     (byte)(48 + 35),
                     (byte)(12 + 41),
                     (byte)(49 + 31),
                     (byte)(82 + 15),
                     (byte)(24 + 76),
                     (byte)(58 + 42),
                     (byte)(91 + 14),
                     110,
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.F("Քաՠԣգ՟՚գծ՝Ԫըլեըծ\u0530ࢳࣁࢿ࣍ࢷࣉࢮ࣎ࢾࢿࢬࣃ࣓࣋", (byte)53, 70));
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(@Nullable NLoginCore_259 var0, UUID var1) {
      if (var1.version() != av) {
         return (aw != 0);
      } else {
         NLoginCore_555 var2 = BCryptHashProvider.c();
         switch (NLoginCore_489.S[var2.ordinal()]) {
            case 1:
               return (ax != 0);
            case 2:
               return (ay != 0);
            case 3:
               return ((var0 != null && !var1.equals(var0.b() != 0)) ? ba : az);
            default:
               throw new IllegalArgumentException(a(bb & bc, bd) + var2);
         }
      }
   }

   @Nullable
   public static NLoginCore_259 a(NLoginInterface_011<?> var0, String var1, boolean var2) {
      return a(var0, a(bo, bp ^ bq), var1, var2);
   }

   public static boolean a(NLoginInterface_011<?> var0, @Nullable NLoginCore_259 var1, String var2) {
      if (var1 == null) {
         var1 = a(var0, var2, (as != 0));
      }

      return ((var1 != null && var1.b() != 0) == null ? au : at);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(NLoginInterface_011<?> var0, UUID var1) {
      if (var1.version() != be) {
         return (bf != 0);
      } else {
         NLoginCore_555 var2 = BCryptHashProvider.c();
         switch (NLoginCore_489.S[var2.ordinal()]) {
            case 1:
               return (bg != 0);
            case 2:
               return (bh != 0);
            case 3:
               NLoginCore_259 var3 = a(var0, var1, (bi != 0));
               return ((var3 != null && var3.b() != 0) == null ? bk : bj);
            default:
               throw new IllegalArgumentException(a(bl & bm, bn) + var2);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_371.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.F("ԑԳԵԕԹ\u0558ՐզՒԡ՟Օգ՝ԦՋխլդժդԹ", (byte)45, 70), NLoginCore_371.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘқҩҧҵҟұҖҶҦҧҔҫһҳĲ", (byte)45, 65) + var1 + NLoginCore_559.A("ē", (byte)45, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -8906340186839311540L;
      long var0 = c ^ -5373653831346280818L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(65 + 4),
               (byte)(63 + 20),
               (byte)(27 + 20),
               67,
               (byte)(25 + 41),
               67,
               (byte)(32 + 15),
               (byte)(16 + 64),
               (byte)(68 + 7),
               (byte)(64 + 3),
               (byte)(68 + 15),
               (byte)(33 + 20),
               (byte)(15 + 65),
               (byte)(71 + 26),
               (byte)(83 + 17),
               (byte)(66 + 34),
               (byte)(82 + 23),
               (byte)(108 + 2),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.B("ƢƳƘǅƳǤƺƶǅƨƥƳ", (byte)118, 66);
               ZKM_STR_B[1] = NLoginCore_076.F("֊֭֭֠պ֞\u0590\u058cֱ֧֧պ", (byte)118, 70);
               ZKM_STR_B[2] = NLoginCore_201.C("ՆպՊ֔֊Ցդե\u0557։֘յըհՐխ\u0558՜֝ղ\u058c֓ժի", (byte)118, 67);
               ZKM_STR_B[3] = NLoginCore_553.D("ռչ֒՟ըդՈ֘֒թՙ՟", (byte)118, 68);
               ZKM_STR_B[4] = NLoginCore_387.A("ǂǍơǔǖƾƹƻǣǈǨƫǬǛǯǪǠǍǖǌƳǁƾƿ", (byte)118, 65);
               ZKM_STR_B[5] = NLoginCore_553.E("֭֗֔պփտգֳ֭քմպ", (byte)118, 69);
               ZKM_STR_B[6] = NLoginCore_446.B("ǂǍơǔǖƾƹƻǣǈǨƫǬǛǯǪǠǍǖǌƳǁƾƿ", (byte)118, 66);
               ZKM_STR_B[7] = NLoginCore_232.F("֕\u058b֥֭֮֝֬ժւֲլխշ֪֙֗ոַ֗֜֠־օֆ", (byte)118, 70);
               ZKM_STR_B[8] = NLoginCore_521.A("ǙǆǅǦƹǇƺǋǨƧƿǭƫƱǠƳǌǳƴǳǴǧƾƿ", (byte)118, 65);
               ZKM_STR_B[9] = NLoginCore_201.C("Շ՜եջ֊֍բ֖կօ\u0590֗ֆ\u0557֘՜ց՞֍ծ֑ձն֑դնր֙տժտ֎", (byte)118, 67);
               ZKM_STR_B[10] = NLoginCore_384.F(
                  "ե֦ւ֬֡պտ։֢֊կք֥հօָփ\u058b֦֍ֲֵָ֪֯֞֍ֳֺּֽ֙֨֡֡\u05cc֙בּד֏֯\u05caֱבֲֲֶ֪֮֫\u05c8זד֮הֵנֳט־׀ֳָןס֦֩\u05ec֦֨\u05ca\u05ccען\u05caז׀ׂ׳וֲב״לטׅ׆",
                  (byte)118,
                  70
               );
               ZKM_STR_B[11] = NLoginCore_110.B("ƠƵƤƲǙƩǝǋƾǃƭƳ", (byte)118, 66);
               ZKM_STR_B[12] = NLoginCore_138.E("գ֦էնծժ֒֞։վ֕պ", (byte)118, 69);
               ZKM_STR_B[13] = NLoginCore_183.F("֡֍֛ռըվց։հռֈ֖֔ծֶ֘\u058cք֊\u058bְֲշ֝֘ռ֚׀ֺ֦\u05c9ׁ֢ׄ\u05c8ֻ֗ևׄדֵ֣֚֜", (byte)118, 70);
               ZKM_STR_B[14] = NLoginCore_427.C("ֆղրաՍգզծՕախջչՓս֛ձթկհ֗֕՜ւսատ֥֟\u058b֮֩և֦֭ռ֠լָ֩ֈց֚տ", (byte)118, 67);
               ZKM_STR_B[15] = NLoginCore_575.C(
                  "\u058cե֍ՎՊՐՎևչ\u0557Փ֕Օօևճ\u0590ցղ֜հղկ֛գչչա֕ե֘ոօձռְև\u058cֲցհ\u058c֖֑֯կյև֖֜ռ֖ׄ֠սֱօ\u05c9\u05c8ֹ֧֚։֑֗֡\u05c8֫֓֒\u05ccְ֫יִ֧֫׆ֱ\u05ca\u05c9ֿ֢֢֛נֹח֥֨טמ\u05edרַ֧",
                  (byte)118,
                  67
               );
               ZKM_STR_B[16] = NLoginCore_241.E(
                  "֧ր֨թեիթ֢֔ղծְհ֢֠֎֫֜֍ַ\u058b֍֊ֶվ֔֔ռְրֳ֓֠\u058c֗\u05cb֢֧\u05cd֜\u058b֧\u05caגֲ\u05c8ֹ\u05c8ֶָ֭\u0590ג֚֠֞יְםׅח׆ץנ֥ץםס־֭֫ר\u05ec\u05caׁצב\u05f8\u05f7\u05f8רֵֻ\u05cb\u05faסכ\u05faיב\u05ffָ؇ן\u05ff׀",
                  (byte)118,
                  69
               );
               ZKM_STR_B[17] = NLoginCore_559.D(
                  "ժ\u058bֆ\u058bտզծ֎յ֗ժ\u0558մջ֒Ցլյ֍կռ֠֕ո֩և֟֟ցք֙֞թը֑֒֓ս֒կձָ֑֘ֆչ\u058c։պֵ֖ց֡վׇ֧֣֒֒֔֝\u05cb\u05ccְ֭֮\u05cf֍\u0590\u05cc\u05cb֒֒ׄא֟",
                  (byte)118,
                  68
               );
               ZKM_STR_B[18] = NLoginCore_141.A("ƿǁƣǀơǡǆǨƽǌƽǋƿǮǭǋǀǬǋǨǎǑƾƿ", (byte)118, 65);
               ZKM_STR_B[19] = NLoginCore_138.B("ƠƵƤƲǙƩǝǋƾǃƭƳ", (byte)118, 66);
               ZKM_STR_B[20] = NLoginCore_427.A("ǍƞǏǂǨǃǧǞǂƸǈƬǩǬǌǓǰƾƾǮǶǑƾƿ", (byte)118, 65);
               ZKM_STR_B[21] = NLoginCore_559.F("էռիչ֠հ֤֒օ֊մպ", (byte)118, 70);
               ZKM_STR_B[22] = NLoginCore_575.D("՛հվբց֍փե֑կնպՙ֎֗յ\u058b֛֢֑՟֣ժի", (byte)118, 68);
               ZKM_STR_B[23] = NLoginCore_521.B("ƻƮƲǥƨǗǟƻǪƨƻǮƸǬǦƻǠǵǪǓǕǑƾƿ", (byte)118, 66);
               ZKM_STR_B[24] = NLoginCore_138.C("հգ\u058bՓՎժՓՕզ֔Օ՟", (byte)118, 67);
               ZKM_STR_B[25] = NLoginCore_241.D("սջհռտՐվ֗֏մպ՟", (byte)118, 68);
               ZKM_STR_B[26] = NLoginCore_530.D("Վ՟Մձ՟\u0590զբձՔՑ՟", (byte)118, 68);
               ZKM_STR_B[27] = NLoginCore_575.E("֊֭֭֠պ֞\u0590\u058cֱ֧֧պ", (byte)118, 69);
               ZKM_STR_B[28] = NLoginCore_201.D("Վ՟Մձ՟\u0590զբձՔՑ՟", (byte)118, 68);
               ZKM_STR_B[29] = NLoginCore_521.F("֊֭֭֠պ֞\u0590\u058cֱ֧֧պ", (byte)118, 70);
               ZKM_STR_B[30] = NLoginCore_092.D("ևՃգ՛սխ֍ժշմ֔՟", (byte)118, 68);
               ZKM_STR_B[31] = NLoginCore_141.C("ևՃգ՛սխ֍ժշմ֔՟", (byte)118, 67);
               ZKM_STR_B[32] = NLoginCore_173.F("բ֖֙ւէ֣֯֍լժ֔լֲ֣֯\u058c\u0590\u058bֱ֜\u058b׀ָցֵֶֶֺֿ֑֦ׄ֕ׄ֊֦֫ւְׂ֑֢֥א\u05ce\u05c8\u05c8֙זל֝ןּ\u05ce֥֦", (byte)118, 70);
               ZKM_STR_B[33] = NLoginCore_076.F("պ\u058c֡֊֥\u0590֫դ֢֣֔ծճփնֻ֏֍֎ְֶֶֿׂջֿս׃׀ִׄ֞և׆ָֹ֚֩\u05cbֲ֛\u0590ֱ֚", (byte)118, 70);
               ZKM_STR_B[34] = NLoginCore_384.D("Նգր֓Փէլկՠէ֘՟", (byte)118, 68);
               ZKM_STR_B[35] = NLoginCore_141.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǞȉȇȁȁǒȏȕǖȘǵȇǞǟ", (byte)118, 65);
               ZKM_STR_B[36] = NLoginCore_521.E("է֦֫և֦֟֯֯ևծ\u0590ַ֤֠֡օֺֻ֧֓֝֊֢֑֛֭֓־ֳָֽ֤\u05c9ֵ֟׀א\u05ccփִ֤ׄ\u05cb֚", (byte)118, 69);
               ZKM_STR_B[37] = NLoginCore_232.D("Նգր֓Փէլկՠէ֘՟", (byte)118, 68);
               ZKM_STR_B[38] = NLoginCore_324.D("ՇջվէՌ֔ֈղՑՏչՑ֗ֈ֔ձյհ֖ցհ֥֝զ֩պ֛֛֚֟ն֤֩\u058bկ\u0590\u058bէն֧֕և֊ֳֵ֭֭վֻׁւֳׄ֡֊\u058b", (byte)118, 68);
               ZKM_STR_B[39] = NLoginCore_384.C("Ջք֍՞֏Փ։զֈօպ\u058cև֛վըմ\u058b֣֖ւպՠդ։եյ֧ֆչ֣֞հ֯։֦֨֫ճկւֺ֦֑֔֩֞֙׀ָ֢֮֍ֳ֊\u058b", (byte)118, 67);
               ZKM_STR_B[40] = NLoginCore_027.B("ƚƷǔǧƧƻǀǃƴƻǬƳ", (byte)118, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.C("Չտ՝ՋՆՓօ֗֔ղՙ՟", (byte)118, 67);
               ZKM_STR_B[1] = NLoginCore_091.B("ǙǏǕǇƥǡǧǣǦǉǇǣǩǙǫǬǬǭƯƭƳǧƾƿ", (byte)118, 66);
               ZKM_STR_B[2] = NLoginCore_446.D("ՆպՊ֔֊Ցդե\u0557։֛Ք֒ի֎֍\u0590֗\u0558ձ֎֓ժի", (byte)118, 68);
               ZKM_STR_B[3] = NLoginCore_110.C("՞՝֓\u0590ՑւՏի\u0557ծՙ՟", (byte)118, 67);
               ZKM_STR_B[4] = NLoginCore_427.D("ծչՍրւժեէ֏մ֗֓Ւ֑ձ֗ՠծ֞՟֚խժի", (byte)118, 68);
               ZKM_STR_B[5] = NLoginCore_387.B("ƞǔǂǣǑƳƷƷƦƫǝǈƼǭƮǉƼǱƳǳƳǑƾƿ", (byte)118, 66);
               ZKM_STR_B[6] = NLoginCore_530.F("։֔ը֛֝օրւ֪֏ְքִֶֆ֯ք֍ֈ֯\u0590־օֆ", (byte)118, 70);
               ZKM_STR_B[7] = NLoginCore_127.C("պհ֊֒ւ֑֓Տէ֗ՒՖի\u058bժ֠՞ղ֎լ֍֓ժի", (byte)118, 67);
               ZKM_STR_B[8] = NLoginCore_223.C("օղձ֒եճզշ֔Փժ\u0557։֚\u0558չ֛֖միչ֓ժի", (byte)118, 67);
               ZKM_STR_B[9] = NLoginCore_530.C("Շ՜եջ֊֍բ֖կօ\u0590֗ֆ\u0557֘՜ց՞֍ծ֑ճ֔ոփ։֣չ֗֗ո֠", (byte)118, 67);
               ZKM_STR_B[10] = NLoginCore_427.B("ƞǟƻǥǚƳƸǂǛǃƨƽǞƩƾǱƼǄǟǆǨǣǫǮǗǱǆǬǵǳǒǡǚǶǚȅǒȊǵȌǈǨȃǪȊǤǧǫǫǯǣȁȏȌǧȍǮșǬȑǷǹǱǬȘȚǟǢȥǟǡȃȅțȘȢȮǪȦǬȀȨȱȑǪȷǾǿ", (byte)118, 66);
               ZKM_STR_B[11] = NLoginCore_384.C("ՠտՉ֎օբ֔դձքֈ՟", (byte)118, 67);
               ZKM_STR_B[12] = NLoginCore_241.E("ռֈ֩\u058cե֫֟ս֤֟ցպ", (byte)118, 69);
               ZKM_STR_B[13] = NLoginCore_575.B("ǚǆǔƵơƷƺǂƩƵǁǏǍƧǑǯǅƽǃǄǫǩưǖǑƵǓǹǳǟȂǽǄǘǕǜǘȊǓȄǸǤȍǢǚǹǲȅȅȕȒȔȖǱǞǟ", (byte)118, 66);
               ZKM_STR_B[14] = NLoginCore_433.C("ֆղրաՍգզծՕախջչՓս֛ձթկհ֗֕՜ւսատ֥֟\u058b֮֩հկ֏\u058b֪֔փֱր֭լֿ֫֙֞֍ֺּ׀յւ׃֊\u058b", (byte)118, 67);
               ZKM_STR_B[15] = NLoginCore_127.A(
                  "ǠƹǡƢƞƤƢǛǍƫƧǩƩǙǛǇǤǕǆǰǄǆǃǯƷǍǍƵǩƹǬǌǙǅǐȄǛǠȆǕǄǠȃǪǥǃǉǛǰǪǐȘǪǴǑȅǙȝȜǮǻȍǝǫǵǥȜǿǧǦȠǿȄȭȈǿǻȚȅȞȝȓǶǶǯȵǲȜȖǵȺȇȭȒȝɃȳɂȥȼȁȶȄȫȫɈɌȓ", (byte)118, 65
               );
               ZKM_STR_B[16] = NLoginCore_110.F(
                  "֧ր֨թեիթ֢֔ղծְհ֢֠֎֫֜֍ַ\u058b֍֊ֶվ֔֔ռְրֳ֓֠\u058c֗\u05cb֢֧\u05cd֜\u058b֧\u05caגֲ\u05c8ֹ\u05c8ֶָ֭\u0590ג֚֠֞יְםׅח׆ץנ֥ץםס־֭֫ר\u05ec\u05caׁצב\u05f8\u05f7\u05f8רֵֻ\u05cb\u05faםָ\u0600כם\u05ce\u05ce\u05fd\u0604\u05fa\u05feׇ\u05f7\u05fd\u05f6؉מ\u0601\u05fb\u05ec؆؏ך",
                  (byte)118,
                  70
               );
               ZKM_STR_B[17] = NLoginCore_397.C(
                  "ժ\u058bֆ\u058bտզծ֎յ֗ժ\u0558մջ֒Ցլյ֍կռ֠֕ո֩և֟֟ցք֙֞թը֑֒֓ս֒կձָ֑֘ֆչ\u058c։պֵ֖ց֡վׇ֧֣֒֒֔֝\u05cb\u05ccְ\u05cbג֛֫\u05cbג֎֣ׄהֳ֨י֏ֳ֫אָג\u05ccו֪֭֫",
                  (byte)118,
                  67
               );
               ZKM_STR_B[18] = NLoginCore_027.E("ֆֈժևը֨֍֯ք֓փւ֍֣ևּֽ֘\u058c֏֛־օֆ", (byte)118, 69);
               ZKM_STR_B[19] = NLoginCore_232.C("Ղչ\u058cփ՝Շժէօ֒ՙ՟", (byte)118, 67);
               ZKM_STR_B[20] = NLoginCore_004.E("֔ե֖։֯֊֥֮։տ\u0590ղտֵյնմ֩նջ֎֮օֆ", (byte)118, 69);
               ZKM_STR_B[21] = NLoginCore_091.D("հ։՟՛Փ\u0590֔ժ֘ևղ՟", (byte)118, 68);
               ZKM_STR_B[22] = NLoginCore_453.A("ƯǄǒƶǕǡǗƹǥǃǍǏǨǌǡǢƫǐǄǩǉǑƾƿ", (byte)118, 65);
               ZKM_STR_B[23] = NLoginCore_575.D("է՚՞֑Քփ\u058bէ֖Քթևժս՞՝\u0557՞֡֡մեֆտձֈ֥֦ք֨տ֘", (byte)118, 68);
               ZKM_STR_B[24] = NLoginCore_076.F("֠պն֘֙ծ֑֑֫֞ծ֖մծկ֪֖֧֮֙֝ֈօֆ", (byte)118, 70);
               ZKM_STR_B[25] = NLoginCore_427.C("ՙՈռգ֒փղՓւին՟", (byte)118, 67);
               ZKM_STR_B[26] = NLoginCore_387.B("ƢƳǒƣǣǡǥƶƿǡǘƳ", (byte)118, 66);
               ZKM_STR_B[27] = NLoginCore_397.C("եՏ֊ճևդՑօ֑ցՑ։֛Տֆմթղմ\u058bս֣ժի", (byte)118, 67);
               ZKM_STR_B[28] = NLoginCore_397.B("ǢǁǚƝǂƩǆǧǝǬǨƳ", (byte)118, 66);
               ZKM_STR_B[29] = NLoginCore_076.A("ƞƼǧƦƟǞǆǀǋǌǘƳ", (byte)118, 65);
               ZKM_STR_B[30] = NLoginCore_223.C("֑֎Պխը֖ՌՉքկ֊\u058bըյՐվ֓֞\u058c֘՚սժի", (byte)118, 67);
               ZKM_STR_B[31] = NLoginCore_387.D("Վ՜հկքլ՞ց\u058bեծ՟", (byte)118, 68);
               ZKM_STR_B[32] = NLoginCore_530.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǡǼǢȌǮǯǣȐǡǤǱǕǒȎǸǚǹǑȓȒȁȠ", (byte)118, 65);
               ZKM_STR_B[33] = NLoginCore_004.F("պ\u058c֡֊֥\u0590֫դ֢֣֔ծճփնֻ֏֍֎ְֶֶֿׂջֿս׃׀ִַׄ֞֕֟֠֎֥֊֑֑ׅ׃֚", (byte)118, 70);
               ZKM_STR_B[34] = NLoginCore_223.F("֗֩տ֊֙֟֝֠֫րլպ", (byte)118, 70);
               ZKM_STR_B[35] = NLoginCore_553.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǟǼȌǾȒȎǍȃǓȇǦȗǞǟ", (byte)118, 65);
               ZKM_STR_B[36] = NLoginCore_141.D("Ռ\u058b\u0590լք֔\u058b֔լՓյ։օ֜ֆժու\u058c֠֟կոև֒նր֣֘֝։֢ջ\u058c֟֜֠րքֱ֩֬֬տ", (byte)118, 68);
               ZKM_STR_B[37] = NLoginCore_110.F("շ֩թ֣ք֪֮֠ւ֤սպ", (byte)118, 70);
               ZKM_STR_B[38] = NLoginCore_387.A("ƛǏǒƻƠǨǜǆƥƣǍƥǫǜǨǅǉǄǪǕǄǹǱƺǽǎǯǮǳǯǊǽǸǟǃǤǟƻǊǩǻǛǡǽȌǈǪǪȂǓǕȐȁȁǌȘȓȆȊǵǛǪǹǛ", (byte)118, 65);
               ZKM_STR_B[39] = NLoginCore_553.E("զ֟֨չ֪ծ֤ցֶ֣֧֢֠֕֙փ֏֦־ֱ֝֕ջտ֤ր\u0590ׂ֡֔־ֹ\u058b\u05ca֤׃ׁ׆֎֊֝וֿ֯גגֳׄ֔\u05ceׇָ֛֥֦֚", (byte)118, 69);
               ZKM_STR_B[40] = NLoginCore_110.C("ֈֈՎ֓աքյՏև֊ՙ՟", (byte)118, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_433.D("սռլՋՠ\u058c֔Վժ֗֔՟", (byte)118, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_530.B("ǖǐƥǟƳǙǀǩƦƵǯƥǅǪƨưǨǞǤǌǌǚǋƳǕǸǴǼǬƾǡǮ", (byte)118, 66);
         }
      }
   }

   @Nullable
   public static NLoginCore_259 a(NLoginInterface_011<?> var0, UUID var1, boolean var2) {
      return a(var0, a(br, bs ^ bt), NLoginCore_432.b(var1), var2);
   }

   public static NLoginCore_259 a(String var0) {
      JSONObject var1 = new JSONObject(var0);
      UUID var2 = NLoginCore_432.c(var1.getString(a(a & b, d)));
      String var3 = var1.getString(a(e, f));
      JSONArray var4 = var1.getJSONArray(a(g & h, i));
      ArrayList var5 = new ArrayList();

      for (int var6 = j; var6 < var4.length(); var6++) {
         JSONObject var7 = var4.getJSONObject(var6);
         if (var7.has(a(k, l)) && var7.has(a(m, n))) {
            var5.add(new NLoginCore_454(var7.getString(a(o & p, q)), var7.getString(a(r, s ^ t))));
            break;
         }
      }

      return new NLoginCore_259(var2, var3, var5.toArray(new NLoginCore_454[u]));
   }

   static {
      b();
   }

   @Nullable
   private static NLoginCore_259 a(NLoginInterface_011<?> var0, String var1, String var2, boolean var3) {
      String var4 = var2.toLowerCase(Locale.ENGLISH);
      NLoginCore_259 var5 = (NLoginCore_259)k.getIfPresent(var4);
      if (var5 != null) {
         return var5;
      } else {
         if (!var3) {
            long var6 = System.currentTimeMillis();
            if (var6 - z <= bu) {
               return null;
            }

            if (var6 - y > bv) {
               b.set(bw);
               y = var6;
            }

            if (b.incrementAndGet() >= bx) {
               if (var6 - c.getAndSet(var6) > by) {
                  NLoginCore_370.c(a(bz, ca ^ cb));
               }

               z = var6;
               return null;
            }
         }

         NLoginCore_227 var15 = var0.a();
         NLoginCore_109 var7 = var15.a();
         NLoginCore_180 var8 = var15.a();
         int var9 = cd;
         NLoginCore_123 var10 = null;
         String var11 = null;

         label96:
         for (int var12 = ce; var12 < cf; var12++) {
            String var13 = var1.replace(a(cg, ch ^ ci), var8 != null ? var8.S() : a(cj, ck ^ cl))
               .replace(a(cm, cn ^ co), var7 != null ? Long.toString(var7.e()) : a(cp, cq))
               .replace(a(cr, cs), Integer.toString(var0.b().a().ordinal()))
               .replace(a(ct, cu ^ cv), var2)
               .replace(a(cw, cx ^ cy), Integer.toString(var12));
            var10 = NLoginCore_305.a().a(var13);
            switch (var10.p()) {
               case 200:
                  String var14 = var10.V();
                  if (a(cz, da ^ db).equals(var14)) {
                     return null;
                  }

                  var11 = var14;
                  break label96;
               case 204:
               case 404:
                  var5 = new NLoginCore_259(null, null);
                  break label96;
               default:
                  if (var12 == dc) {
                     return null;
                  }
            }
         }

         if (var5 == null && var11 != null && !var11.isEmpty()) {
            if (var11.charAt(dd) == de && var11.charAt(var11.length() - df) == dg) {
               JSONObject var16 = new JSONObject(var11);
               if (var16.has(a(dh, di ^ dj)) && var16.has(a(dk, dl ^ dm))) {
                  String var19 = var16.getString(a(dn, var_do ^ dp));
                  String var20 = var16.getString(a(dq & dr, ds));
                  var5 = new NLoginCore_259(NLoginCore_432.c(var19), var20);
               } else if (var16.has(a(dt, du))) {
                  String var18 = var16.getString(a(dv, dw));
                  var5 = new NLoginCore_259(NLoginCore_432.c(var18), null);
               }
            }

            if (var5 == null) {
               var5 = new NLoginCore_259(null, null);
            }
         }

         if (var5 != null) {
            k.put(var4, var5);
         } else {
            int var17 = var10 != null ? var10.p() : dx;
            switch (var17) {
               case 0:
                  NLoginCore_370.c(a(eg, eh ^ ei) + var2 + a(ej, ek ^ el) + var10.p() + a(em, en ^ eo));
                  break;
               case 429:
                  NLoginCore_370.c(a(dy, dz ^ ea) + var2 + a(eb, ec) + var10.p() + a(ed, ee));
                  break;
               default:
                  NLoginCore_370.c(a(eq, er) + var2 + a(es, et ^ eu) + var10.p() + a(ev, ew ^ ex));
            }
         }

         return var5;
      }
   }
}
