package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginType_016 {
   a(a(NLoginType_016.bz, NLoginType_016.ca), a(NLoginType_016.cb & NLoginType_016.cc, NLoginType_016.cd), SpawnType.JOIN),
   b(a(NLoginType_016.ci, NLoginType_016.cj), a(NLoginType_016.ck, NLoginType_016.cl), SpawnType.FIRST_JOIN),
   c(a(NLoginType_016.cq, NLoginType_016.cr ^ NLoginType_016.cs), a(NLoginType_016.ct, NLoginType_016.cu), SpawnType.LOGIN),
   d(a(NLoginType_016.cz, NLoginType_016.da ^ NLoginType_016.db), a(NLoginType_016.dc, NLoginType_016.dd ^ NLoginType_016.de), SpawnType.REGISTER),
   e(a(NLoginType_016.dj, NLoginType_016.dk), a(NLoginType_016.dl, NLoginType_016.dm ^ NLoginType_016.dn), SpawnType.RESPAWN),
   f(a(NLoginType_016.ds & NLoginType_016.dt, NLoginType_016.du), a(NLoginType_016.dv, NLoginType_016.dw), null);

   public static final List<String> t = Arrays.stream(values()).map(var0 -> var0.cR).collect(Collectors.toList());
   public final String cR;
   public final String cS;
   public final SpawnType a;
   private static String[] a = new String[NLoginType_016.bu];
   private static String[] b = new String[NLoginType_016.bv];
   private static long c;
   private static int a = (0 >>> 247 | 0 << -247) & -1;
   private static int b = -1 >>> 238 | -1 << ~238 + 1;
   private static long d = Long.reverse(-7645743546635613635L);
   private static int e = (8192 >>> 205 | 8192 << -205) & -1;
   private static long f = Long.reverse(2154089242522585661L);
   private static long g = Long.reverse(-8646911284551352320L);
   private static int h = (16384 >>> 173 | 16384 << ~173 + 1) & -1;
   private static long i = Long.reverse(2154089242522585661L);
   private static long j = Long.reverse(-8646911284551352320L);
   private static int k = (3072 >>> 170 | 3072 << ~170 + 1) & -1;
   private static long l = Long.reverse(2154089242522585661L);
   private static long m = Long.reverse(-8646911284551352320L);
   private static int n = Integer.reverse(536870912);
   private static int o = Integer.reverse(-1);
   private static long p = Long.reverse(-7645743546635613635L);
   private static int q = (327680 >>> 16 | 327680 << ~16 + 1) & -1;
   private static long r = Long.reverse(-7645743546635613635L);
   private static int s = (3145728 >>> 83 | 3145728 << -83) & -1;
   private static long t = Long.reverse(2154089242522585661L);
   private static long u = Long.reverse(-8646911284551352320L);
   private static int v = 29360128 >>> 150 | 29360128 << ~150 + 1;
   private static int w = Integer.reverse(-1);
   private static long x = Long.reverse(-7645743546635613635L);
   private static int y = Integer.reverse(268435456);
   private static long z = Long.reverse(-7645743546635613635L);
   private static int aa = 589824 >>> 16 | 589824 << -16;
   private static int ab = Integer.reverse(-1);
   private static long ac = Long.reverse(-7645743546635613635L);
   private static int ad = (1310720 >>> 113 | 1310720 << -113) & -1;
   private static long ae = Long.reverse(-7645743546635613635L);
   private static int af = Integer.reverse(-805306368);
   private static long ag = Long.reverse(-7645743546635613635L);
   private static int ah = (393216 >>> 239 | 393216 << ~239 + 1) & -1;
   private static int ai = (-1 >>> 14 | -1 << ~14 + 1) & -1;
   private static long aj = Long.reverse(-7645743546635613635L);
   private static int ak = (851968 >>> 240 | 851968 << ~240 + 1) & -1;
   private static long al = Long.reverse(2154089242522585661L);
   private static long am = Long.reverse(-8646911284551352320L);
   private static int an = -1 >>> 153 | -1 << ~153 + 1;
   private static int ao = Integer.reverse(1879048192);
   private static long ap = Long.reverse(-7645743546635613635L);
   private static int aq = Integer.reverse(0);
   private static int ar = Integer.reverse(-268435456);
   private static long as = Long.reverse(2154089242522585661L);
   private static long at = Long.reverse(-8646911284551352320L);
   private static int au = 2 >>> 1 | 2 << ~1 + 1;
   private static int av = (131072 >>> 205 | 131072 << -205) & -1;
   private static int aw = Integer.reverse(-1);
   private static long ax = Long.reverse(-7645743546635613635L);
   private static int ay = 131072 >>> 240 | 131072 << ~240 + 1;
   private static int az = 17 >>> 128 | 17 << ~128 + 1;
   private static long ba = Long.reverse(-7645743546635613635L);
   private static int bb = (25165824 >>> 215 | 25165824 << -215) & -1;
   private static int bc = Integer.reverse(1207959552);
   private static int bd = Integer.reverse(-1);
   private static long be = Long.reverse(-7645743546635613635L);
   private static int bf = (2048 >>> 201 | 2048 << -201) & -1;
   private static int bg = Integer.reverse(-939524096);
   private static int bh = (-1 >>> 19 | -1 << -19) & -1;
   private static long bi = Long.reverse(-7645743546635613635L);
   private static int bj = Integer.reverse(-1610612736);
   private static int bk = 5 >>> 222 | 5 << ~222 + 1;
   private static int bl = (-1 >>> 68 | -1 << -68) & -1;
   private static long bm = Long.reverse(-7645743546635613635L);
   private static int bn = (12582912 >>> 85 | 12582912 << -85) & -1;
   private static int bo = Integer.reverse(0);
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int bq = Integer.reverse(1073741824);
   private static int br = 12582912 >>> 86 | 12582912 << ~86 + 1;
   private static int bs = 131072 >>> 47 | 131072 << ~47 + 1;
   private static int bt = Integer.reverse(-1610612736);
   private static int bu = Integer.reverse(-469762048);
   private static int bv = 4992 >>> 7 | 4992 << ~7 + 1;
   private static int bw = Integer.reverse(-1476395008);
   private static long bx = Long.reverse(-7645743546635613635L);
   private static int by = 0 >>> 106 | 0 << -106;
   private static int bz = Integer.reverse(1744830464);
   private static long ca = Long.reverse(-7645743546635613635L);
   private static int cb = -2147483637 >>> 127 | -2147483637 << ~127 + 1;
   private static int cc = -1 >>> 194 | -1 << -194;
   private static long cd = Long.reverse(-7645743546635613635L);
   private static int ce = Integer.reverse(402653184);
   private static long cf = Long.reverse(2154089242522585661L);
   private static long cg = Long.reverse(-8646911284551352320L);
   private static int ch = Integer.reverse(Integer.MIN_VALUE);
   private static int ci = (12800 >>> 9 | 12800 << -9) & -1;
   private static long cj = Long.reverse(-7645743546635613635L);
   private static int ck = (109051904 >>> 118 | 109051904 << ~118 + 1) & -1;
   private static long cl = Long.reverse(-7645743546635613635L);
   private static int cm = 221184 >>> 205 | 221184 << -205;
   private static int cn = (-1 >>> 43 | -1 << ~43 + 1) & -1;
   private static long co = Long.reverse(-7645743546635613635L);
   private static int cp = (134217728 >>> 122 | 134217728 << ~122 + 1) & -1;
   private static int cq = Integer.reverse(939524096);
   private static long cr = Long.reverse(2154089242522585661L);
   private static long cs = Long.reverse(-8646911284551352320L);
   private static int ct = Integer.reverse(-1207959552);
   private static long cu = Long.reverse(-7645743546635613635L);
   private static int cv = 15728640 >>> 115 | 15728640 << -115;
   private static int cw = Integer.reverse(-1);
   private static long cx = Long.reverse(-7645743546635613635L);
   private static int cy = 3 >>> 224 | 3 << ~224 + 1;
   private static int cz = 124 >>> 66 | 124 << ~66 + 1;
   private static long da = Long.reverse(2154089242522585661L);
   private static long db = Long.reverse(-8646911284551352320L);
   private static int dc = Integer.reverse(67108864);
   private static long dd = Long.reverse(2154089242522585661L);
   private static long de = Long.reverse(-8646911284551352320L);
   private static int df = Integer.reverse(-2080374784);
   private static long dg = Long.reverse(2154089242522585661L);
   private static long dh = Long.reverse(-8646911284551352320L);
   private static int di = (2048 >>> 105 | 2048 << ~105 + 1) & -1;
   private static int dj = Integer.reverse(1140850688);
   private static long dk = Long.reverse(-7645743546635613635L);
   private static int dl = Integer.reverse(-1006632960);
   private static long dm = Long.reverse(2154089242522585661L);
   private static long dn = Long.reverse(-8646911284551352320L);
   private static int var_do = (18874368 >>> 83 | 18874368 << -83) & -1;
   private static long dp = Long.reverse(2154089242522585661L);
   private static long dq = Long.reverse(-8646911284551352320L);
   private static int dr = Integer.reverse(-1610612736);
   private static int ds = Integer.reverse(-1543503872);
   private static int dt = Integer.reverse(-1);
   private static long du = Long.reverse(-7645743546635613635L);
   private static int dv = Integer.reverse(1677721600);
   private static long dw = Long.reverse(-7645743546635613635L);

   static {
      b();
   }

   @Nullable
   public static NLoginType_016 a(String var0) {
      int var2 = an;
      switch (var0.hashCode()) {
         case -1806776514:
            if (var0.equals(a(bg & bh, bi))) {
               var2 = bj;
            }
            break;
         case -690213213:
            if (var0.equals(a(az, ba))) {
               var2 = bb;
            }
            break;
         case 3005864:
            if (var0.equals(a(av & aw, ax))) {
               var2 = ay;
            }
            break;
         case 3267882:
            if (var0.equals(a(ao, ap))) {
               var2 = aq;
            }
            break;
         case 133683162:
            if (var0.equals(a(ar, as ^ at))) {
               var2 = au;
            }
            break;
         case 1097387304:
            if (var0.equals(a(bc & bd, be))) {
               var2 = bf;
            }
      }

      switch (var2) {
         case 0:
            return a;
         case 1:
            return b;
         case 2:
            return c;
         case 3:
            return d;
         case 4:
            return e;
         case 5:
            return f;
         default:
            return null;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_016.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.C("ӽԟԡԁԥՄԼՒԾԍՋՁՏՉԒԷՙ\u0558ՐՖՐԥ", (byte)96, 67), NLoginType_016.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.B("ƢƯƮűƱƭƨƱƼƫŸƶƺƳƶƼžԑԂԆԍԐӵӪԈԡԎԑԐӷƗ", (byte)96, 66) + var1 + NLoginCore_559.D("ԏ", (byte)96, 68) + var2.toString(), var4
         );
      }
   }

   public String d(boolean var1) {
      switch (this) {
         case a:
            return var1 ? a(a & b, d) : a(e, f ^ g);
         case b:
            return var1 ? a(h, i ^ j) : a(k, l ^ m);
         case c:
            return var1 ? a(n & o, p) : a(q, r);
         case d:
            return var1 ? a(s, t ^ u) : a(v & w, x);
         case e:
            return var1 ? a(y, z) : a(aa & ab, ac);
         case f:
            return var1 ? a(ad, ae) : a(af, ag);
         default:
            throw new IllegalArgumentException(a(ah & ai, aj) + this);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static NLoginType_016 a(SpawnType var0) {
      switch (NLoginType_026.ah[var0.ordinal()]) {
         case 1:
            return a;
         case 2:
            return b;
         case 3:
            return c;
         case 4:
            return d;
         case 5:
            return e;
         default:
            throw new IllegalArgumentException(a(bk & bl, bm) + var0);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 17L;
      var1 ^= 4922123160483050168L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(40 + 29),
                     83,
                     (byte)(5 + 42),
                     (byte)(30 + 37),
                     (byte)(33 + 33),
                     (byte)(17 + 50),
                     (byte)(13 + 34),
                     (byte)(43 + 37),
                     (byte)(71 + 4),
                     (byte)(41 + 26),
                     (byte)(50 + 33),
                     (byte)(12 + 41),
                     (byte)(20 + 60),
                     (byte)(74 + 23),
                     100,
                     (byte)(53 + 47),
                     (byte)(37 + 68),
                     (byte)(87 + 23),
                     (byte)(95 + 8)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҹҪҮҵҸҝҒҰӉҶҹҸҟ", (byte)52, 65));
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

   public String aE() {
      return a(ak, al ^ am) + this.cR;
   }

   @Generated
   private NLoginType_016(String var3, String var4, SpawnType var5) {
      this.cR = var3;
      this.cS = var4;
      this.a = var5;
   }

   private static void b() {
      c = -4877063272974833736L;
      long var0 = c ^ 4922123160483050168L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               69,
               (byte)(43 + 40),
               (byte)(10 + 37),
               (byte)(38 + 29),
               (byte)(22 + 44),
               (byte)(45 + 22),
               (byte)(25 + 22),
               (byte)(37 + 43),
               (byte)(28 + 47),
               (byte)(19 + 48),
               (byte)(31 + 52),
               (byte)(10 + 43),
               (byte)(56 + 24),
               (byte)(20 + 77),
               (byte)(88 + 12),
               (byte)(67 + 33),
               (byte)(93 + 12),
               110,
               (byte)(10 + 93)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_384.D("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫүӹӁӄӘӷӪһӸӺҺӂӕӲӑәӜӆӡӪӽӺӑ", (byte)60, 68);
               b[1] = NLoginCore_521.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄոընՓ։քՖֈ՛ոի", (byte)60, 69);
               b[2] = NLoginCore_110.B("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĽƇŏŒŦƅŸŉƆƈňŉƀťƈƉŞŶťŹťŌŕƜƈƋŧƛƗŶƝŖſƀŻƝŨſƉƀźƝŽ", (byte)60, 66);
               b[3] = NLoginCore_232.C("ҿӤҷӜҟҟӚҠҧңҿӫӣӁӃҭӆӎҦҲҵӬӄӂӏӚҺҳӗһӬӢӪҾӽӥӦԂӧҿӡӘӚӨӎӹӠԏԋӐӨӽԊӧӭӋԍԆӳӏԉӜӴӯ", (byte)60, 67);
               b[4] = NLoginCore_521.A("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĿłŶšňŨŖŇƉŊťƐƐňœŪŏŦŢŤŸƐş", (byte)60, 65);
               b[5] = NLoginCore_241.A("ōŲŅŪĭĭŨĮĵıōŇŇźŦŨňĺŴŀŷœľŽŝƆŁſŞŮƆŞŜƊŬƈƕōŠƏŒƕőş", (byte)60, 65);
               b[6] = NLoginCore_076.A("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹĿƆŹƆŢūƂŴŖŽƐžťűżƕƏƍųŖƗƘş", (byte)60, 65);
               b[7] = NLoginCore_092.B("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŵŞĹŅńŞſƌŽƋŁŊƌŉŜŌŌŔŵŗŬřş", (byte)60, 66);
               b[8] = NLoginCore_553.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫҳҪӳӱҷӜӰӵӨӷҷӣҿӴӗԂӢԉӻӹәӇӑ", (byte)60, 67);
               b[9] = NLoginCore_127.C("ҿӤҷӜҟҟӚҠҧңҼҩҥӗӫүӚӭӎӧӁӦӦӢӔһӓӑӚҽӜԀӿӰҶӖӄӕӛӘӨӁӃӑ", (byte)60, 67);
               b[10] = NLoginCore_092.E("խԺժ՝ՄԾՖՍպզՇպՒվՑԻՊրլՒԼաճՖ\u0557ռՕլչ՛Պ՝ՠրիտփէծձՑպկյկՔն\u058bհ֖Օ֤֞֘պ֙ռ֔֬նչ\u058bֆծջ\u058b֔ռ֖֓թր֓֍պր", (byte)60, 69);
               b[11] = NLoginCore_427.E("խԨՅծԯըՎ\u0557ՐՐՍլԶծՠԶՁՒՌլֆՏ՞ՙճի՜՚էՎՊ\u0558զ՞ՎՎՍվփքթ֕\u058b\u0557էի՜֛֊֓ր֥֤֠֔պֱ֪֦֢֤֦֝֝֩֘֘֡հկֱֲօֹ֬ր", (byte)60, 69);
               b[12] = NLoginCore_553.D("ҭӕңӅӔӡӄҵҥӇҴҿӎҾҬҼӜӇӎӉӦүӥӕӂӓӰһӹҶҶӌӀӛӥӸӝԀӀӜӨӡӃӑ", (byte)60, 68);
               b[13] = NLoginCore_141.F("ըՆհՎՏՔնՇԷպ\u0557Հ", (byte)60, 70);
               b[14] = NLoginCore_141.C("ӞҜӓӥӎӘӡӤӜӔӌұ", (byte)60, 67);
               b[15] = NLoginCore_530.E("ԽԤմխըմՑՖպչ՚թԼՆԻծՕԴՀդ՜՞ՋՌ", (byte)60, 69);
               b[16] = NLoginCore_223.F("՚ՃԭՂԿդզեՂՈ\u0557Հ", (byte)60, 70);
               b[17] = NLoginCore_471.E("ԾԻձժՑձՊԲՁէէԮոոՉչՀվիմն՞ՋՌ", (byte)60, 69);
               b[18] = NLoginCore_223.C("ӃҰӥҝҞңҴҦҹҧӚұ", (byte)60, 67);
               b[19] = NLoginCore_004.D("ұҲӑҡңӣӒӢҤӗӠҨӨҦӍӧӮӌӲӝӇӏҼҽ", (byte)60, 68);
               b[20] = NLoginCore_027.E("ԼդԲՔգհՓՄԴՖՃՎ՝ՍԻՋիՖ՝\u0558յԾմդՑբտՊֈՅՅ՛Տժմևլ֏ՏիշհՒՠ", (byte)60, 69);
               b[21] = NLoginCore_451.A("ĩśļŬŅōŋİŊĸĹĿ", (byte)60, 65);
               b[22] = NLoginCore_530.B("ŬĪšųŜŦůŲŪŢŚĿ", (byte)60, 66);
               b[23] = NLoginCore_451.C("ҷҠҹҼӥӀӥқҾӌӚұ", (byte)60, 67);
               b[24] = NLoginCore_530.F("ՁՋ՟ՈՊգդՕՌթնթ\u0557Ս՟ՎբվԹՙեմՋՌ", (byte)60, 70);
               b[25] = NLoginCore_201.A("ļģųŬŧųŐŕŹŸřŨĻŅĺŭŔĳĿţśŝŊŋ", (byte)60, 65);
               b[26] = NLoginCore_232.B("ĩļŁŋņŀŭŨŖźńŻŎųĹŘŜũŕźľƃŊŋ", (byte)60, 66);
               b[27] = NLoginCore_027.E("ԪԩՑՋղՒՅԸէԷխՀ", (byte)60, 69);
               b[28] = NLoginCore_223.A("řłĬŁľţťŤŁŇŖĿ", (byte)60, 65);
               b[29] = NLoginCore_451.E("ՏիՃՁԯ՟ճՔՄմՋՀ", (byte)60, 69);
               b[30] = NLoginCore_324.B("ľĭŀŧūōŗŉōųŗŭŌŽŬĶŬŭŹƃĻųŊŋ", (byte)60, 66);
               b[31] = NLoginCore_553.B("ĽĺŰũŐŰŉıŀŦŦĭŷŷňŸĿŽŪųŵŝŊŋ", (byte)60, 66);
               b[32] = NLoginCore_141.C("ҽҷқүҦұӈӜҲҽӗӍӍҧөӥӣҬҫӳӒӵҼҽ", (byte)60, 67);
               b[33] = NLoginCore_559.D("ӞӌӜҽңүһӢӆӟӈұ", (byte)60, 68);
               b[34] = NLoginCore_173.C("ӃҰӥҝҞңҴҦҹҧӚұ", (byte)60, 67);
               b[35] = NLoginCore_201.E("\u0530՟ՏԮՇՇաՓՒգՋՀ", (byte)60, 69);
               b[36] = NLoginCore_553.C("ӂҝӗҜӧӤӦҲӀҢӬӎҼӤҩӥӉӆҬӀӅӵҼҽ", (byte)60, 67);
               b[37] = NLoginCore_223.B("ĿŀşįıűŠŰĲťŮĶŶĴśŵżŚƀūŕŝŊŋ", (byte)60, 66);
               b[38] = NLoginCore_183.C("ҔҳӔҤӦҡӘӘһҢӁҼӎӋҰӄӜӔҽӵӶӏҼҽ", (byte)60, 67);
               break;
            case 1:
               b[0] = NLoginCore_027.E("՞ՆՁՁՇՄկՈԴՖԵՓԼյԱՊԼ՟ն՜պԾֈՐՓէֆչՊև։ՉՎխռՐ\u058b֓թ֍Ւէգՠ", (byte)60, 69);
               b[1] = NLoginCore_173.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄտցոէտԽս֊֎֍\u058cՊձգՒ֕Րգէն֎իՠ", (byte)60, 69);
               b[2] = NLoginCore_553.D("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫүӹӁӄӘӷӪһӸӺҺһӲӗӺӻӐӨӗӫӗҾӇԎӺӽәԍԉӨԏӈӿԖԆӤӼӥӝԘӕӞӬ", (byte)60, 68);
               b[3] = NLoginCore_173.E("ՎճՆիԮԮթԯԶԲՎպղՐՒԼՕ՝ԵՁՄջՓՑ՞թՉՂզՊջձչՍ\u058cմյ֑նՎհէթշ՝ֈկ֚֞՟շ\u058c֙յձհղ֟֗֙քևա֝", (byte)60, 69);
               b[4] = NLoginCore_004.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫұҴӨӓҺӚӈҹӻҼӗӑәӽӑӔӥӀҿӤԋӤӚԁӦӨӌӽԐӭԃӠӟӜӝ", (byte)60, 67);
               b[5] = NLoginCore_397.B("ōŲŅŪĭĭŨĮĵıōŇŇźŦŨňĺŴŀŷœľŽŝƆŁſŞŮƆŞřźżƎƀƒƑƅŨƎƇƇŰŝƉŻƔŚŸƑŜƣŪū", (byte)60, 66);
               b[6] = NLoginCore_387.C("ӏҷҲҲҸҵӠҹҥӇҦӄҭӦҢһҭӐӧӍӫұӸӫӸӔӝӴӦӈӯԂҺҵӶӓӦӄӣԁӛԌӡӣԏӊӇӠԒԇөӬԐӟӜӝ", (byte)60, 67);
               b[7] = NLoginCore_232.B("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŵŞĹŅńŞſƌŽƋŁƊƃſŲņŋŲƖŬœŗŻƒƙŹřſƊŷŞŸƣŪū", (byte)60, 66);
               b[8] = NLoginCore_232.B("ŝŅŀŀņŃŮŇĳŕĴŒĻŴİŉĻŞŵśŹŁĸƁſŅŪžƃŶƅŅşƉƄŊŪŶőƐƔŋůƈŹŦŚŞƓƞƁƣƔƣŪū", (byte)60, 66);
               b[9] = NLoginCore_138.A("ōŲŅŪĭĭŨĮĵıŊķĳťŹĽŨŻŜŵŏŴŴŰŢŉšşŨŋŪƎŜźŧšůŋŖƖƁŒŪş", (byte)60, 65);
               b[10] = NLoginCore_138.F("խԺժ՝ՄԾՖՍպզՇպՒվՑԻՊրլՒԼաճՖ\u0557ռՕլչ՛Պ՝ՠրիտփէծձՑպկյկՔն\u058bհ֖Օ֤֞֘պ֙ռ֔֬նչ\u058bֆծրծիզ֦վրո֚֗փր", (byte)60, 70);
               b[11] = NLoginCore_141.F("խԨՅծԯըՎ\u0557ՐՐՍլԶծՠԶՁՒՌլֆՏ՞ՙճի՜՚էՎՊ\u0558զ՞ՎՎՍվփքթ֕\u058b\u0557էի՜֛֊֓ր֥֤֠֔պ֪֦֢֝֝֩֘֘ֆֈ։քֈֱֵ֧֨չղր", (byte)60, 70);
               b[12] = NLoginCore_076.A("ĻţıœŢůŒŃĳŕłōŜŌĺŊŪŕŜŗŴĽųţŐšžŉƇńńŚťōƈſņŽŌŠŏƕƈş", (byte)60, 65);
               b[13] = NLoginCore_092.C("ҲӂӎӜҺұӄӞӨӇҦӄҹҿӁӮӈӤӈӝӒӥҼҽ", (byte)60, 67);
               b[14] = NLoginCore_138.C("һӏӀңұһӐӗӠӤӊҷӮӢӇҨӆҬӑӶӀӥҼҽ", (byte)60, 67);
               b[15] = NLoginCore_138.C("ҮҕӥӞәӥӂӇӫӪӉӝһҫҭҿӳӂӪӞӯӥҼҽ", (byte)60, 67);
               b[16] = NLoginCore_138.E("ը՛թ՞յՖՌլԷջթՖՙտԹԽձՑշբՂքՋՌ", (byte)60, 69);
               b[17] = NLoginCore_232.C("үҬӢӛӂӢһңҲӘӖӣӢӪӏӌӪӄҪӑӋӥҼҽ", (byte)60, 67);
               b[18] = NLoginCore_127.E("ԯԭՄ՞ՋՋԮԪշՔՇխԶՑ՝ԺՙռլչՃ՞ՋՌ", (byte)60, 69);
               b[19] = NLoginCore_530.D("ұҲӑҡңӣӒӢҤӗӞҶҤӃҧӏӳҾӊӆӮӤӗҹҴҭӲӭӑӺӎӶ", (byte)60, 68);
               b[20] = NLoginCore_521.A("ĻţıœŢůŒŃĳŕłōŜŌĺŊŪŕŜŗŴĽųţŐšžŉƇńńŚŪƅŨƑſŲŔƂƘŵőş", (byte)60, 65);
               b[21] = NLoginCore_453.F("Չ՟ԭՆՏԳեչՂՂԶՀ", (byte)60, 70);
               b[22] = NLoginCore_451.D("ҞұӢҜҘүӂӦҲӛҺӞҮӐӇҾӨӓөӞӟӏҼҽ", (byte)60, 68);
               b[23] = NLoginCore_201.D("ҢҸӠҸӛӑҿҥҢӞӛӁӇәӦӋӈҪҽҿӯҿҼҽ", (byte)60, 68);
               b[24] = NLoginCore_446.E("ՁՋ՟ՈՊգդՕՌթն\u0558ոՙԾց\u0557ՑՓխՅմՋՌ", (byte)60, 69);
               b[25] = NLoginCore_110.F("ԽԤմխըմՑՖպչ՚Վյ՚է՜ծա՜ո՛՞ՋՌ", (byte)60, 70);
               b[26] = NLoginCore_223.D("қҮҳҽҸҲӟӚӈӬҵҺӏҬҧҫӞӒӏӰӳҿҼҽ", (byte)60, 68);
               b[27] = NLoginCore_110.C("ҴӁҳҷӎӃӇӘӝӈҫұ", (byte)60, 67);
               b[28] = NLoginCore_241.E("՜ՀաըԯԮԿՖժկյՀ", (byte)60, 69);
               b[29] = NLoginCore_559.C("ӁҬңҾӧӘӆөӋӨӖұ", (byte)60, 67);
               b[30] = NLoginCore_127.C("ҰҟҲәӝҿӉһҿӥӉӛӦӃүҧӍӃӔҳӐҿҼҽ", (byte)60, 67);
               b[31] = NLoginCore_027.B("ĽĺŰũŐŰŉıŀŦťĭŵĸũŷŕĹţŞƄōŊŋ", (byte)60, 66);
               b[32] = NLoginCore_471.A("ŋŅĩĽĴĿŖŪŀŋŤŵļŧŷŹŚŲőūŮŝŊŋ", (byte)60, 65);
               b[33] = NLoginCore_223.F("\u0530աՏՠՃը\u0558ՠ\u0557նՍԷ\u0558ՉձծՖվհ\u0557րքՋՌ", (byte)60, 70);
               b[34] = NLoginCore_173.C("ҳӐҰӤҲӝҤҟӕҫҵҸӭәӪӰӄҾӬӋӱӏҼҽ", (byte)60, 67);
               b[35] = NLoginCore_427.E("\u0530լԫՠՕԬեՋչՅդԷՓյիԹծԹՓ՝ՒՎՋՌ", (byte)60, 69);
               b[36] = NLoginCore_453.E("ՑԬզԫնճյՁՏԱպյԻՏՏ՟Քն՟ՑահԿ\u0558ՈՈը՜ո֏Շֆ", (byte)60, 69);
               b[37] = NLoginCore_433.C("ұҲӑҡңӣӒӢҤӗӟӬҪӗӬҿӇӲӬӝҮҰӯӐҬҺҷӓӆҷӝӿ", (byte)60, 67);
               b[38] = NLoginCore_110.D("ҔҳӔҤӦҡӘӘһҢӂӂӘҽҢҧҮҩӠӲӱҿҼҽ", (byte)60, 68);
               break;
            case 2:
               b[0] = NLoginCore_027.D("ҚҠҚӂҵұӞӢҡӟӦӆӤӝҰӦҫүӁҵӵӥҼҽ", (byte)60, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_091.E("՝ԬխՏՇՌՏ\u0558ՑՂՄՐԽտԾԲպՒՔհ՚՞ՋՌ", (byte)60, 69);
         }
      }
   }
}
