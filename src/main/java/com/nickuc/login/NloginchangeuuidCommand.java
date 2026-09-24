package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginchangeuuidCommand extends NLoginCore_353 {
   private static int ck = (35651584 >>> 181 | 35651584 << -181) & -1;
   private static int cs = 304 >>> 228 | 304 << -228;
   private static int cv = Integer.reverse(671088640);
   private static int ed = Integer.reverse(-1073741824);
   private static long ec = Long.reverse(567441105355488133L);
   private static int z = Integer.reverse(-1);
   private static long ag = Long.reverse(1576247421886479237L);
   private static long bb = Long.reverse(1297036692682702848L);
   private static int ci = 8388608 >>> 55 | 8388608 << ~55 + 1;
   private static int bq = Integer.reverse(0);
   private static long ab = Long.reverse(567441105355488133L);
   private static int co = Integer.reverse(1207959552);
   private static int ee = (0 >>> 85 | 0 << ~85 + 1) & -1;
   private static int az = Integer.reverse(-805306368);
   private static int eh = Integer.reverse(Integer.MIN_VALUE);
   private static int var_do = (15872 >>> 41 | 15872 << -41) & -1;
   private static int bl = Integer.reverse(-1);
   private static int ch = 0 >>> 87 | 0 << ~87 + 1;
   private static long as = Long.reverse(567441105355488133L);
   private static long cq = Long.reverse(1297036692682702848L);
   private static int bk = Integer.reverse(1879048192);
   private static int bu = (786432 >>> 242 | 786432 << -242) & -1;
   private static long cy = Long.reverse(567441105355488133L);
   private static int br = ('\uf000' >>> 140 | 61440 << ~140 + 1) & -1;
   private static int y = (64 >>> 101 | 64 << ~101 + 1) & -1;
   private static long g = Long.reverse(1297036692682702848L);
   private static String[] b = new String[var_do];
   private static long bi = Long.reverse(567441105355488133L);
   private static int au = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(0);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int cx = Integer.reverse(-1476395008);
   private static int aj = Integer.reverse(-536870912);
   private static int dt = Integer.reverse(0);
   private static int c = Integer.reverse(0);
   private static long dw = Long.reverse(1297036692682702848L);
   private static int r = -1 >>> 197 | -1 << ~197 + 1;
   private static int w = 4194304 >>> 214 | 4194304 << -214;
   private static long dz = Long.reverse(567441105355488133L);
   private static int bz = (0 >>> 148 | 0 << -148) & -1;
   private static long aw = Long.reverse(1576247421886479237L);
   private static long bd = Long.reverse(1576247421886479237L);
   private static int bj = Integer.reverse(0);
   private static int cj = (16777216 >>> 119 | 16777216 << -119) & -1;
   private static long al = Long.reverse(1297036692682702848L);
   private static int du = 838860800 >>> 89 | 838860800 << -89;
   private static long v = Long.reverse(1297036692682702848L);
   private static int dp = 1073741824 >>> 61 | 1073741824 << -61;
   private static int j = 0 >>> 248 | 0 << ~248 + 1;
   private static long cm = Long.reverse(567441105355488133L);
   private static int dn = Integer.reverse(-134217728);
   private static int el = Integer.reverse(1073741824);
   private static int an = Integer.reverse(-1);
   private static int em = Integer.reverse(2013265920);
   private static int cg = 6291456 >>> 117 | 6291456 << ~117 + 1;
   private static long cw = Long.reverse(567441105355488133L);
   private static final int m = NloginchangeuuidCommand.dq;
   private static int bv = (0 >>> 219 | 0 << -219) & -1;
   private static long u = Long.reverse(1576247421886479237L);
   private static int dx = Integer.reverse(Integer.MIN_VALUE);
   private static int at = 0 >>> 202 | 0 << ~202 + 1;
   private static int ef = Integer.reverse(939524096);
   private static long be = Long.reverse(1297036692682702848L);
   private static int eb = Integer.reverse(-671088640);
   private static long ao = Long.reverse(567441105355488133L);
   private static final List<String> e;
   private static int aq = '退' >>> 'L' | 36864 << ~76 + 1;
   private static int l = 33554432 >>> 57 | 33554432 << ~57 + 1;
   private static long ba = Long.reverse(1576247421886479237L);
   private static int dj = (6144 >>> 107 | 6144 << -107) & -1;
   private static long ek = Long.reverse(1297036692682702848L);
   private static long eg = Long.reverse(567441105355488133L);
   private static int bc = Integer.reverse(805306368);
   private static int da = Integer.reverse(-1);
   private static long db = Long.reverse(567441105355488133L);
   private static int bw = Integer.reverse(Integer.MIN_VALUE);
   private static int ae = 0 >>> 113 | 0 << ~113 + 1;
   private static int x = (0 >>> 82 | 0 << ~82 + 1) & -1;
   private static long ak = Long.reverse(1576247421886479237L);
   private static long de = Long.reverse(1297036692682702848L);
   private static int ca = Integer.reverse(0);
   private static long cf = Long.reverse(567441105355488133L);
   private static String[] a = new String[dn];
   private static int cd = (1073741824 >>> 26 | 1073741824 << ~26 + 1) & -1;
   private static long dg = Long.reverse(567441105355488133L);
   private static int cn = Integer.reverse(0);
   private static int dq = Integer.reverse(0);
   private static int dk = 1024 >>> 169 | 1024 << -169;
   private static int aa = Integer.reverse(536870912);
   private static long ah = Long.reverse(1297036692682702848L);
   private static long s = Long.reverse(567441105355488133L);
   private static int dy = Integer.reverse(1476395008);
   private static int bn = Integer.reverse(1073741824);
   private static long dd = Long.reverse(1576247421886479237L);
   private static long ej = Long.reverse(1576247421886479237L);
   private static long ax = Long.reverse(1297036692682702848L);
   private static int dh = Integer.reverse(0);
   private static float cc = Float.intBitsToFloat(Integer.reverse(514));
   private static final int o = dp;
   private static long ad = Long.reverse(567441105355488133L);
   private static int bx = Integer.reverse(1073741824);
   private static int k = 768 >>> 104 | 768 << ~104 + 1;
   private static int h = (16 >>> 100 | 16 << -100) & -1;
   private static int cr = Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190;
   private static long dv = Long.reverse(1576247421886479237L);
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int ai = (0 >>> 97 | 0 << ~97 + 1) & -1;
   private static long d = Long.reverse(567441105355488133L);
   private static int ds = Integer.reverse(-1073741824);
   private static int cu = Integer.reverse(0);
   private static int q = 8388608 >>> 150 | 8388608 << ~150 + 1;
   private static int dr = (8192 >>> 13 | 8192 << ~13 + 1) & -1;
   private static int by = (536870912 >>> 29 | 536870912 << ~29 + 1) & -1;
   private static int ac = Integer.reverse(-1610612736);
   private static int dl = Integer.reverse(0);
   private static int i = Integer.reverse(0);
   private static long f = Long.reverse(1576247421886479237L);
   private static int dm = 131072 >>> 209 | 131072 << -209;
   private static int cz = 704 >>> 133 | 704 << ~133 + 1;
   private static final List<String> d;
   private static final int n = dr;
   private static int dc = Integer.reverse(-402653184);
   private static long bs = Long.reverse(1576247421886479237L);
   private static int bf = Integer.reverse(0);
   private static int ay = 0 >>> 56 | 0 << ~56 + 1;
   private static long c;
   private static long en = Long.reverse(567441105355488133L);
   private static int bh = -1 >>> 133 | -1 << -133;
   private static int av = 5 >>> 191 | 5 << ~191 + 1;
   private static int ei = Integer.reverse(-1207959552);
   private static long ct = Long.reverse(567441105355488133L);
   private static int t = 24 >>> 3 | 24 << ~3 + 1;
   private static int ce = (-1 >>> 138 | -1 << ~138 + 1) & -1;
   private static int am = 8 >>> 224 | 8 << ~224 + 1;
   private static float cb = Float.intBitsToFloat(536064 >>> 245 | 536064 << ~245 + 1);
   private static int ar = -1 >>> 114 | -1 << -114;
   private static long bm = Long.reverse(567441105355488133L);
   private static int af = 25165824 >>> 22 | 25165824 << -22;
   private static int cl = Integer.reverse(-1);
   private static int bo = 0 >>> 17 | 0 << ~17 + 1;
   private static int df = (6144 >>> 72 | 6144 << ~72 + 1) & -1;
   private static long cp = Long.reverse(1576247421886479237L);
   private static long bt = Long.reverse(1297036692682702848L);
   private static int ea = Integer.reverse(1073741824);
   private static int di = Integer.reverse(-1);
   private static int ap = 0 >>> 36 | 0 << -36;
   private static int bg = Integer.reverse(-1342177280);

   public NloginchangeuuidCommand(NLoginType_008 var1) {
      super(var1, a(c, d), a(e, f ^ g), (boolean)h, (boolean)i);
   }

   private int a(@Nullable UUID var1, @Nullable UUID var2) {
      if (var1 == null) {
         return di;
      } else if (var1.version() == dj) {
         return dk;
      } else {
         return var1.equals(var2) ? dl : dm;
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != k) {
         NLoginCore_487 var22 = NLoginCore_487.x;
         Object[] var26 = new Object[l];
         var26[p] = a(q & r, s) + this.e().toLowerCase(Locale.ENGLISH) + a(t, u ^ v);
         NLoginCore_150.a(var1, var22, var26);
      } else {
         NLoginCore_270 var3 = new NLoginCore_270();
         NLoginCore_291 var4 = this.a.a();
         ForceRegisterConfig var5 = var4.a(var1, super.l, var2, var2[w]);
         if (var5 != null) {
            if (!var5.r()) {
               NLoginCore_150.a(var1, NLoginCore_487.t);
            } else {
               UUID var6 = var5.a();
               UUID var7 = var5.getMojangId();
               int var8 = this.a(var6, var7);
               String var9 = var2[y].toLowerCase(Locale.ENGLISH);
               UUID var10 = null;
               int var11 = d.indexOf(var9);
               if (var11 == z) {
                  try {
                     switch (var9.length()) {
                        case 32:
                        case 36:
                           var10 = NLoginCore_432.c(var9);
                           var11 = this.a(var10, var7);
                           break;
                        default:
                           NLoginCore_150.a(var1, a(aa, ab) + String.join(a(ac, ad), d));
                           return;
                     }
                  } catch (IllegalArgumentException var17) {
                     NLoginCore_150.a(var1, a(af, ag ^ ah) + var9);
                     return;
                  }
               }

               if ((var11 != 0 || var8 != var11) && (var6 == null || !var6.equals(var10))) {
                  String var12 = var5.i();
                  if (var10 == null) {
                     switch (var11) {
                        case 0:
                           if (var7 != null) {
                              var10 = var7;
                           } else {
                              NLoginCore_150.a(var1, a(aq & ar, as));
                              NLoginCore_259 var13 = NLoginCore_371.a(this.a, var12, (boolean)au);
                              if (var13 == null) {
                                 NLoginCore_150.a(var1, a(av, aw ^ ax));
                                 return;
                              }

                              UUID var14 = var13.b();
                              if (var14 == null) {
                                 NLoginCore_150.a(var1, a(az, ba ^ bb) + var12 + a(bc, bd ^ be));
                                 return;
                              }

                              var10 = var14;
                           }
                           break;
                        case 1:
                           var10 = UUID.randomUUID();
                           break;
                        case 2:
                           var10 = NLoginCore_432.d(var12);
                           break;
                        default:
                           NLoginCore_150.a(var1, a(bg & bh, bi) + var11);
                     }
                  }

                  if (var6 != null && var6.equals(var10)) {
                     String var21 = a(bk & bl, bm);
                     Object[] var25 = new Object[bn];
                     var25[bo] = var6;
                     var25[bp] = e.get(var11);
                     NLoginCore_150.a(var1, var21, var25);
                  } else {
                     NLoginCore_024 var18 = var4.a(var10);
                     if (var18 == null) {
                        NLoginCore_150.a(var1, NLoginCore_487.w);
                        NLoginCore_150.a(var1, NLoginCore_194.F);
                     } else if (var18.d != null) {
                        String var20 = a(br, bs ^ bt);
                        Object[] var24 = new Object[bu];
                        var24[bv] = var18.d.i();
                        var24[bw] = var6;
                        var24[bx] = e.get(var11);
                        NLoginCore_150.a(var1, var20, var24);
                     } else {
                        synchronized (var5.c) {
                           var5.a(var10);
                           NLoginCore_436[] var10002 = new NLoginCore_436[by];
                           var10002[bz] = NLoginCore_436.c;
                           if (!var4.a(var5, var10002)) {
                              NLoginCore_150.a(var1, NLoginCore_487.w);
                              NLoginCore_150.a(var1, NLoginCore_194.F);
                           } else {
                              NLoginCore_150.a(var1, NLoginCore_194.C, cb, cc);
                              String var10001 = a(cd & ce, cf);
                              Object[] var23 = new Object[cg];
                              var23[ch] = var12;
                              var23[ci] = var10;
                              var23[cj] = e.get(var11);
                              NLoginCore_150.a(var1, var10001, var23);
                              NLoginCore_150.a(var1, a(ck & cl, cm));
                              NLoginCore_150.a(var1, a(co, cp ^ cq) + var3.a(TimeUnit.SECONDS, cr) + a(cs, ct));
                              NLoginCore_370.b(
                                 a(cv, cw)
                                    + var12
                                    + a(cx, cy)
                                    + var10
                                    + a(cz & da, db)
                                    + d.get(var11)
                                    + a(dc, dd ^ de)
                                    + var1.getName()
                                    + a(df, dg)
                              );
                           }
                        }
                     }
                  }
               } else {
                  NLoginCore_150.a(var1, a(aj, ak ^ al) + var6 + a(am & an, ao) + e.get(var11));
               }
            }
         }
      }
   }

   static {
      b();
      String[] var10000 = new String[ds];
      var10000[dt] = a(du, dv ^ dw);
      var10000[dx] = a(dy, dz);
      var10000[ea] = a(eb, ec);
      d = Arrays.asList(var10000);
      var10000 = new String[ed];
      var10000[ee] = a(ef, eg);
      var10000[eh] = a(ei, ej ^ ek);
      var10000[el] = a(em, en);
      e = Arrays.asList(var10000);
   }

   private static void b() {
      c = -6783311833472173144L;
      long var0 = c ^ 3638998580718457570L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               (byte)(39 + 30),
               (byte)(30 + 53),
               47,
               (byte)(26 + 41),
               (byte)(60 + 6),
               (byte)(8 + 59),
               (byte)(17 + 30),
               80,
               (byte)(65 + 10),
               (byte)(36 + 31),
               (byte)(39 + 44),
               (byte)(9 + 44),
               (byte)(63 + 17),
               (byte)(47 + 50),
               (byte)(45 + 55),
               (byte)(22 + 78),
               (byte)(54 + 51),
               (byte)(81 + 29),
               (byte)(26 + 77)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_127.B("ŝƗŴŞƕƢƘſƫŦŤƃƠƄƎƊŭưŪūƒƏżŽ", (byte)85, 66);
               b[1] = NLoginCore_091.F("՜սեՄց՝ջՠկլքբբֈևհզ֓\u058cև։խֈ֏՜\u058c՛հձաբ՛փց֨ը֝փ֥ռձְ֠սկ֨\u058cַ֔ղօյ֍ևքօ", (byte)85, 70);
               b[2] = NLoginCore_173.E("պջխՖտը։թր\u0590ց՝թ\u0590խւ֑ժ֛՛\u058cէդե", (byte)85, 69);
               b[3] = NLoginCore_241.E("փփՠՙ֎\u0557ոևփֆֆբխփրն֎եՓզ֔թղլ֖մ֛֘֟ձ֡ֆ֣֫֨խ֗սէֲծ֊ռչ", (byte)85, 69);
               b[4] = NLoginCore_173.C("ԥӼԩԞԫԜӪԩԈԨӲԴԥԄԻԈԕԺӱԹԜՁԌԢԕԏԵԳԠԣԻԫ", (byte)85, 67);
               b[5] = NLoginCore_110.C("ӟԮԄӢԣԎԤԲӰӭԗӼ", (byte)85, 67);
               b[6] = NLoginCore_471.D("ӵԊԘԘ\u0530ԲԠԊӫԖԃԗԫԗԮԷԪԩԶԕԉԻՁԚԦՅԚՉԾԻԄԝ", (byte)85, 68);
               b[7] = NLoginCore_530.F("ՓՓխ\u058bֈթհ\u058cց֔֕ՏեֆըթկՕ֒֝֗֟՞\u0557֢վջՠ֔֕ք֙նշ֣ք֡֎\u058b֟֫ճև֞կֵ֎ֱִֹֽ֙֩֜ռ֭տֱ֑֡֞փׄւ", (byte)85, 70);
               b[8] = NLoginCore_141.E("՝պՇէ՛՞պևթլվՙ", (byte)85, 69);
               b[9] = NLoginCore_575.F("չոՄ֎ՠվ֊է՜՝Ջֆ֎֍ֈպըհ֘Ֆ՝֥֚֙֗֜֘սքփւռմյլիս֚տ֦պ֠֍\u058b֎ֻ֣֦֕֯֫֕մվ֏֡־ֶ׃ִָֺ֖֓", (byte)85, 70);
               b[10] = NLoginCore_387.F("նՂՌեկս֎զճթ՟փթիւյպՕխ՝իչ֊֠ՠ֍բչ֤ՙ֛նև֩ե\u058c\u058b֝֎\u0590ք֊ֳ\u0590֑֖ճֵյ֚֒օִ֭քօ", (byte)85, 70);
               b[11] = NLoginCore_127.D("ԆԌԍԍԚԞԩԦԮԈԓԱԃԊԗԹԧӸԾԨ\u0530ԡԭԃԸԯԘӺԓԣԕԈՇԇԬԎՇԻՈՆՎԡԢՃԹԣԹԭՔԚԗ՝՟ԺԧԨ", (byte)85, 68);
               b[12] = NLoginCore_223.C("Ԃӿ\u0530ӦԄԏӳԭԅԞԔԳӱԷӳӺӴԲԚԖԸ\u0530ԎԵՃԯԶԁՊՈԷԨ", (byte)85, 67);
               b[13] = NLoginCore_324.F("Ն՟օՋՇՠռեպֈ՜ե֏տ\u058bի֘Ֆժզ֘։՝սւ֝ցբ֗ւ֤֦փք֙\u058cր֥֞ր֛֮րչ", (byte)85, 70);
               b[14] = NLoginCore_553.C("ӶӶԐԮԫԌԓԯԤԷԸӲԈԩԋԌԒӸԵՀԺՂԁӺՅԡԞԃԷԸԧԼԙԚՆԧՄԱԮՂՎԖԪՁԒ\u0558Ա՜\u0557ԼՌՠԿՔԡ\u0557ԵԴԶը՜աՙԧլեԨ\u0530ղճՑԭԧԿՓԼ", (byte)85, 67);
               b[15] = NLoginCore_092.B("ƙƄŤƦƧŝƀƈŢƅŦťƆƄŹƤƫƥƫƑƭƘƂƧűƐŮƊŶŻơƫƀƌƣƻƚƗƶǊƛǄǃǉƶƥƏƈǌǔƟơƱǉƲǁǙǅǒǞƖǘƷƶǙǡƯǏƳǘƻƽǀǋƵǁǙǄƻǞǣƿǑǑǫƭǙǏǒǑƷƵƹǋǨǝ", (byte)85, 66);
               b[16] = NLoginCore_451.C(
                  "ԀԏԎԫԐԆԎԂӯԔԢԴԑԫԓԍԭԸԝԙԊӺԋԾԃԶԸԞԘԂԚԡԗՁՇԣԙՂՃ\u0530ԤՐԥՎՙԓԓ՚՛Ջ\u0530ԭՖԙ՟ԣՑէԠԶՑ՞ԹԶԧԥՋխեԫՇ՝ՁՃՓդՏմիեԴԽԶկՓ\u0558ՔԻ՜է՛սֆՙ\u058cջ", (byte)85, 67
               );
               b[17] = NLoginCore_138.A("ƠƓŜƒůŻƜƔƓƋƌű", (byte)85, 65);
               b[18] = NLoginCore_521.D("ӭԯԊԭԲԀ\u0530ӪԉԈԗӮӳԕԛԉԑӰӽӲԠԶԠԓԅԚՄӺԀԢԤԟԆՅԆԣՏԠԩԑԨԯԒԜ", (byte)85, 68);
               b[19] = NLoginCore_201.A("ƗųƟžŠƗżŢƟźƪű", (byte)85, 65);
               b[20] = NLoginCore_138.B("ƖŢƀſŰƄƈƓơũƄű", (byte)85, 66);
               b[21] = NLoginCore_575.A("ŲƢƃŻƤŦơƃŠťžżƇůŢƲŰŪƨƏŨƑƕƄƭŵƷƘžƇƈźơƠƬưƢƓƻǄƢǌƅƚǍƟǏƪǊǎǌǂǎƯƜƝ", (byte)85, 65);
               b[22] = NLoginCore_138.F("՟լ\u0558օչ՝զիիւ֎ՙ", (byte)85, 70);
               b[23] = NLoginCore_127.A("ŲűžţƘŵűƀƨųƈű", (byte)85, 65);
               b[24] = NLoginCore_223.C("ӵԯԣԙԚӾԐԨԝԩԥӼ", (byte)85, 67);
               b[25] = NLoginCore_559.B("ŶůŭŜŶŻƙƈƔżƦű", (byte)85, 66);
               b[26] = NLoginCore_324.A("ŘƒƘƑŴƞšŸƕūżű", (byte)85, 65);
               b[27] = NLoginCore_433.B("ƏŬŢƤƄŶŸŢƤƂƌű", (byte)85, 66);
               b[28] = NLoginCore_138.E("՞ՈՇֆնռՊօփՏ֔՞ւֆծ֔ւձ֜ժխշդե", (byte)85, 69);
               b[29] = NLoginCore_201.B("şŚƣƢơŰŵƛƪũƗƬŤŮƀơưŮƃưƧƥżŽ", (byte)85, 66);
               b[30] = NLoginCore_471.A("ūŵƏƁƠƂžƜżƪƆƌƃūƠŽƠƅƫŬƕƥżŽ", (byte)85, 65);
               break;
            case 1:
               b[0] = NLoginCore_427.A("ŝƗŴŞƕƢƘſƫŦŤŶŸƗƐơƝƝƉƝŨƥżŽ", (byte)85, 65);
               b[1] = NLoginCore_091.F("՜սեՄց՝ջՠկլքբբֈևհզ֓\u058cև։խֈ֏՜\u058c՛հձաբ՛փց֨ը֝փ֥ռձְ֟֒խթֵ֢ձ֧ֈպַֽքօ", (byte)85, 70);
               b[2] = NLoginCore_223.A("ƒƓƅŮƗƀơƁƘƨƘƉƝŻūƲƟƈƪƉƔƥżŽ", (byte)85, 65);
               b[3] = NLoginCore_559.D("ԦԦԃӼԱӺԛԪԦԩԩԅԐԦԣԙԱԈӶԉԷԌԕԏԹԗԾԻՂԔՄԩԵԬՈՐԊԏԳՑԍԮՅԫՌԩՆՆԪԸԴԜՂԪԧԨ", (byte)85, 68);
               b[4] = NLoginCore_027.D("ԥӼԩԞԫԜӪԩԈԨӲԴԥԄԻԈԕԺӱԹԜӴԀԂԭՅԡԈԱԄԳԝ", (byte)85, 68);
               b[5] = NLoginCore_076.B("ŪŞűžŹŲƑƞƊŦżű", (byte)85, 66);
               b[6] = NLoginCore_076.C("ӵԊԘԘ\u0530ԲԠԊӫԖԃԗԫԗԮԷԪԩԶԕԉԴԢԙӿԳԣԵԽՇԆԋԝԼՏԻԱԋԥԵՑԏՅԜ", (byte)85, 67);
               b[7] = NLoginCore_453.A("ūūƅƣƠƁƈƤƙƬƭŧŽƞƀƁƇŭƪƵƯƷŶůƺƖƓŸƬƭƜƱƎƏƻƜƹƦƣƷǃƋƟƶƇǍƦǑǌƱǁǕƴǓƱƙǙƴǙǔǘǐƸƳ", (byte)85, 65);
               b[8] = NLoginCore_004.C("ԇӸԐӯԡԜԊԂԞԗԡӼ", (byte)85, 67);
               b[9] = NLoginCore_027.A("ƑƐŜƦŸƖƢſŴŵţƞƦƥƠƒƀƈưŮŵƱƯƴƲưƽƕƜƛƚƔƌƍƄƃƕƲƗƾƒƸƥƣƦƭǇǃƭƻǓƾƌƓǋƙƕǎƦǎǝǓƖƫ", (byte)85, 65);
               b[10] = NLoginCore_076.B("ƎŚŤŽƇƕƦžƋƁŷƛƁƃƚƍƒŭƅŵƃƑƢƸŸƥźƑƼűƳƎƟǁŽƤƣƵƦƨƜƢǊǁƪƪƯǌƒƅƿǋǂǔƷǊǄƮǖƥƐǀƪƸ", (byte)85, 66);
               b[11] = NLoginCore_027.A("ŻƁƂƂƏƓƞƛƣŽƈƦŸſƌƮƜŭƳƝƥƖƢŸƭƤƍůƈƘƊŽƼżơƃƼưƽƻǃƖƔƜƩƯƈǑƦƥƤƧƱǅƜƝ", (byte)85, 65);
               b[12] = NLoginCore_559.C("Ԃӿ\u0530ӦԄԏӳԭԅԞԔԳӱԷӳӺӴԲԚԖԸԳԎӼԒԁԟԔԢՋԚԪԿԞԣԍԺԭՍԥՔԞՍԜ", (byte)85, 67);
               b[13] = NLoginCore_173.E("Ն՟օՋՇՠռեպֈ՜ե֏տ\u058bի֘Ֆժզ֘։՝սւ֝ցբ֗ւ֤֦֡ե֢ւ֣վ֍֧ձճղքձֈ\u0590֪ք֊։ֺּ֗քօ", (byte)85, 69);
               b[14] = NLoginCore_521.D("ӶӶԐԮԫԌԓԯԤԷԸӲԈԩԋԌԒӸԵՀԺՂԁӺՅԡԞԃԷԸԧԼԙԚՆԧՄԱԮՂՎԖԪՁԒ\u0558Ա՜\u0557ԼՌՠԿՔԡ\u0557ԵԴԶը՜աՙԧժ՟Ըեղճ՜էծԬՏԼ", (byte)85, 68);
               b[15] = NLoginCore_027.E(
                  "ցլՌ֎֏ՅըհՊխՎՍծլա\u058c֓֍֓չ֕րժ֏ՙոՖղ՞գ։֓ըմ\u058b֣ւտֲ֞փֱ֬֫֞֍շհִּև։ֱֺׁ֚֭֙֩׆վ׀ׁ֟֞\u05c9ַ֛֗׀ֳׁ֣֥֣֨֝֩֬׆\u05cbֹֹ֧ד֘מָׁנוֶודִד", (byte)85, 69
               );
               b[16] = NLoginCore_471.D(
                  "ԀԏԎԫԐԆԎԂӯԔԢԴԑԫԓԍԭԸԝԙԊӺԋԾԃԶԸԞԘԂԚԡԗՁՇԣԙՂՃ\u0530ԤՐԥՎՙԓԓ՚՛Ջ\u0530ԭՖԙ՟ԣՑէԠԶՑ՞ԹԶԧԥՋխեԫՇ՝ՁՃՓդՏմիեԴԽԶկՓՒհՌռՓքՓպրքՌ", (byte)85, 68
               );
               b[17] = NLoginCore_004.B("ŸŞƢƢźƞŤŻƖũţű", (byte)85, 66);
               b[18] = NLoginCore_232.F("Պ\u058cէ֊֏՝֍ՇզեմՋՐղոզծՍ՚Տս֓սհբշ֡\u0557՝տցռ֥֥֢֕ծչ\u0590էֲօֲ֨ֈ֬֓։֎֗ճֳ֧֗քօ", (byte)85, 70);
               b[19] = NLoginCore_232.B("žƛŵƆƗƄŠſƞƋŵŬſƈƨƁƃƳŦƪơƏżŽ", (byte)85, 66);
               b[20] = NLoginCore_223.D("ӺԤԀԦӽԧԠԝԲӯԤӵԵӴԧӹԐԵԈԵԭՀԇԈ", (byte)85, 68);
               b[21] = NLoginCore_433.A("ŲƢƃŻƤŦơƃŠťžżƇůŢƲŰŪƨƏŨƑƕƄƭŵƷƘžƇƈźơƠƬưƢƓƻǄƢǌƅƊǂǉƉǍƩǀƼƐƈƯƜƝ", (byte)85, 65);
               b[22] = NLoginCore_141.A("ƝƛŢƢŠſƤźƝƪŸű", (byte)85, 65);
               b[23] = NLoginCore_553.A("ƗŚƀűƆŴƂũƙƉƦű", (byte)85, 65);
               b[24] = NLoginCore_530.A("ŮŜƎűƀƢŹţƣƌƖű", (byte)85, 65);
               b[25] = NLoginCore_110.B("ŶƛƞƤŦůƨƞơƅūƖƊūƯƁƚơſƨƟƏżŽ", (byte)85, 66);
               b[26] = NLoginCore_110.C("ӫԛӪԭӼԈԃԥԶԥԕӶӱԧԕԶԨӻԶӻԵԚԇԈ", (byte)85, 67);
               b[27] = NLoginCore_110.B("ƗƎƐƑƝŞƓŸƈƌƍƞƆƤƋƏƯƉƲƳƵƵżŽ", (byte)85, 66);
               b[28] = NLoginCore_232.E("՞ՈՇֆնռՊօփՏ֔ՓՈ֑կճ֏\u058b\u0590Տ֗շդե", (byte)85, 69);
               b[29] = NLoginCore_427.F("ՇՂ\u058b֊։\u0558՝փ֒ՑտՑբբ֕\u0557֓ձձկֈ֝դե", (byte)85, 70);
               b[30] = NLoginCore_446.D("ӶԀԚԌԫԍԉԧԇԵԏӲԃԂӷӵԅӷԕԉԪӿԂԮԤԮԧԟԥԣԨԄ", (byte)85, 68);
               break;
            case 2:
               b[0] = NLoginCore_553.A("ŢŕƃƤſƑƘƅƗƝƫŽŹƫŻŮƦƳƑƧűƥżŽ", (byte)85, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.A("żƍƚťŘŦŰŷŠƪƌű", (byte)85, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 72L;
      var1 ^= 3638998580718457570L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(44 + 25),
                     (byte)(48 + 35),
                     (byte)(25 + 22),
                     (byte)(16 + 51),
                     (byte)(2 + 64),
                     (byte)(55 + 12),
                     (byte)(14 + 33),
                     (byte)(16 + 64),
                     (byte)(23 + 52),
                     (byte)(57 + 10),
                     (byte)(66 + 17),
                     53,
                     80,
                     (byte)(65 + 32),
                     (byte)(23 + 77),
                     (byte)(28 + 72),
                     (byte)(86 + 19),
                     (byte)(36 + 74),
                     (byte)(75 + 28)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.A("üĉĈËċćĂċĖąÒĐĔčĐĖØѡѠєѴїѬѬѹѸ", (byte)13, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NloginchangeuuidCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.B("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 66), NloginchangeuuidCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_232.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠟࠞࠒ࠲ࠕࠪࠪ࠷࠶ҫ", (byte)54, 68) + var1 + NLoginCore_138.D("ґ", (byte)54, 68) + var2.toString(), var4);
      }
   }
}
