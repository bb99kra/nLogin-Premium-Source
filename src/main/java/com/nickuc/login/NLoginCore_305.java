package com.nickuc.login;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import patcher.NLoginApiForge;

public class NLoginCore_305 {
   private static int dh = 393216 >>> 78 | 393216 << -78;
   private static int cu = 0 >>> 21 | 0 << -21;
   private static int bs = Integer.reverse(134217728);
   private static int dg = 12 >>> 130 | 12 << ~130 + 1;
   private static long cf = Long.reverse(2305843009213693952L);
   private static int by = Integer.reverse(0);
   private int J;
   private static int m = Integer.reverse(536870912);
   private static int f = 0 >>> 226 | 0 << -226;
   private final Map<String, String> h = new HashMap<>();
   private static int aj = 1152 >>> 39 | 1152 << ~39 + 1;
   private static int aa = Integer.reverse(1610612736);
   private static int ad = -1 >>> 86 | -1 << -86;
   private static long cm = Long.reverse(7762449873132261198L);
   private static String[] ZKM_STR_A = new String[dh];
   private static int at = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(7762449873132261198L);
   private static int be = Integer.reverse(0);
   private static int de = Integer.reverse(0);
   private static int da = Integer.reverse(1954545664);
   private static long n = Long.reverse(5456606863918567246L);
   private static long bg = Long.reverse(5456606863918567246L);
   private static int a = 0 >>> 231 | 0 << -231;
   private static String[] ZKM_STR_B = new String[NLoginCore_305.di];
   private static int cv = Integer.reverse(0);
   private static long ah = Long.reverse(2305843009213693952L);
   private static long ce = Long.reverse(5456606863918567246L);
   private static int t = Integer.reverse(-1610612736);
   private static long cj = Long.reverse(5456606863918567246L);
   private static int bi = (0 >>> 14 | 0 << -14) & -1;
   private static long bu = Long.reverse(2305843009213693952L);
   private static long ap = Long.reverse(2305843009213693952L);
   private static long bm = Long.reverse(5456606863918567246L);
   private static int ax = Integer.reverse(-1342177280);
   private static int co = (16 >>> 100 | 16 << ~100 + 1) & -1;
   private static int bb = (0 >>> 2 | 0 << ~2 + 1) & -1;
   private static int r = (0 >>> 128 | 0 << ~128 + 1) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int cp = (0 >>> 44 | 0 << -44) & -1;
   private static int g = (Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << -62) & -1;
   private static long v = Long.reverse(2305843009213693952L);
   private static int bo = Integer.reverse(Integer.MIN_VALUE);
   private static int dd = (33554432 >>> 89 | 33554432 << ~89 + 1) & -1;
   private static long u = Long.reverse(5456606863918567246L);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int di = Integer.reverse(402653184);
   private static int cy = Integer.reverse(-1);
   private static int aw = Integer.reverse(0);
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int bf = Integer.reverse(1879048192);
   private static long ck = Long.reverse(2305843009213693952L);
   private static int j = 12582912 >>> 54 | 12582912 << ~54 + 1;
   private static long am = Long.reverse(7762449873132261198L);
   private static int bw = Integer.reverse(-1);
   private static long cc = Long.reverse(2305843009213693952L);
   private static int ai = Integer.reverse(0);
   private static long bx = Long.reverse(7762449873132261198L);
   private static int s = (0 >>> 220 | 0 << -220) & -1;
   private static int au = 10240 >>> 201 | 10240 << -201;
   private static int bc = (0 >>> 205 | 0 << ~205 + 1) & -1;
   private static long c;
   private int K;
   private static long bt = Long.reverse(5456606863918567246L);
   private static int ac = 229376 >>> 207 | 229376 << ~207 + 1;
   private static long ak = Long.reverse(7762449873132261198L);
   private static int aq = Integer.reverse(805306368);
   private static long i = Long.reverse(7762449873132261198L);
   private static int ci = (1310720 >>> 240 | 1310720 << -240) & -1;
   private static int cq = Integer.reverse(0);
   private static int cd = (637534208 >>> 153 | 637534208 << ~153 + 1) & -1;
   private static int p = Integer.reverse(0);
   private static long o = Long.reverse(2305843009213693952L);
   private static int av = Integer.reverse(Integer.MIN_VALUE);
   private static String aT = a(NLoginCore_305.dk, NLoginCore_305.dl);
   private static int bk = Integer.reverse(0);
   private static long ae = Long.reverse(7762449873132261198L);
   private static int cn = 0 >>> 208 | 0 << -208;
   private static int cx = Integer.reverse(1744830464);
   private static int q = Integer.reverse(0);
   private static int br = Integer.reverse(0);
   private static int bp = Integer.reverse(671088640);
   private static long cz = Long.reverse(7762449873132261198L);
   private static int ay = Integer.reverse(-1);
   private static int bj = Integer.reverse(0);
   private static int ch = 0 >>> 57 | 0 << ~57 + 1;
   private static int df = -2147482711 >>> 93 | -2147482711 << -93;
   private static int x = Integer.reverse(671088640);
   private static long e = Long.reverse(2305843009213693952L);
   private static long b = Long.reverse(7762449873132261198L);
   private static long ao = Long.reverse(5456606863918567246L);
   private static int al = Integer.reverse(1342177280);
   private static int cw = 0 >>> 195 | 0 << -195;
   private static long cb = Long.reverse(5456606863918567246L);
   private static int bz = Integer.reverse(0);
   private static int z = 0 >>> 161 | 0 << -161;
   private static long ab = Long.reverse(7762449873132261198L);
   private static int bv = 1140850688 >>> 122 | 1140850688 << -122;
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static long dl = Long.reverse(7762449873132261198L);
   private static int ct = 0 >>> 150 | 0 << ~150 + 1;
   private static int dk = Integer.reverse(-402653184);
   private static long az = Long.reverse(7762449873132261198L);
   private static int cs = 0 >>> 229 | 0 << ~229 + 1;
   private static int ca = Integer.reverse(1207959552);
   private static int af = Integer.reverse(268435456);
   private static int h = Integer.reverse(-1);
   private static int db = (4816 >>> 4 | 4816 << -4) & -1;
   private static long bh = Long.reverse(2305843009213693952L);
   private static int cg = Integer.reverse(0);
   private static int bq = 262144 >>> 82 | 262144 << -82;
   private static int cr = 0 >>> 167 | 0 << ~167 + 1;
   private static int ba = Integer.reverse(Integer.MIN_VALUE);
   private static long bn = Long.reverse(2305843009213693952L);
   private static int an = Integer.reverse(-805306368);
   private static int dc = Integer.reverse(-192937984);
   private int I = df;
   private static int cl = Integer.reverse(-1476395008);
   private static final int H = NLoginCore_305.dj;
   private static int bd = 0 >>> 190 | 0 << -190;
   private static int dj = (20971520 >>> 180 | 20971520 << -180) & -1;
   private static int k = -1 >>> 223 | -1 << ~223 + 1;
   private static long ag = Long.reverse(5456606863918567246L);
   private static long d = Long.reverse(5456606863918567246L);
   private static long ar = Long.reverse(7762449873132261198L);
   private static int bl = 960 >>> 70 | 960 << -70;

   @Generated
   public int k() {
      return this.I;
   }

   public NLoginCore_285 a(String var1, File var2, int var3) {
      try {
         return this.b(var1, var2, var3);
      } catch (IOException var5) {
         return new NLoginCore_285((bj != 0), bk, 0L, var5);
      }
   }

   @Generated
   public int m() {
      return this.K;
   }

   @Generated
   public Map<String, String> b() {
      return this.h;
   }

   @Generated
   private NLoginCore_305() {
      this.J = this.I * dg;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_305.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.E("Ե\u0557ՙԹ՝ռմ֊նՅփչևցՊկ֑\u0590ֈ֎ֈ՝", (byte)81, 69), NLoginCore_305.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧࡌࢁࡺࡴࢅࡤࢄ࢈ࢊࡸࢆࢇӿ", (byte)81, 67) + var1 + NLoginCore_471.A("ś", (byte)81, 65) + var2.toString(), var4
         );
      }
   }

   private void a(HttpURLConnection var1, String var2) {
      var1.setInstanceFollowRedirects((f != 0));
      if (var2 != null && !var2.isEmpty()) {
         try {
            var1.setRequestMethod(var2);
         } catch (ProtocolException var4) {
            throw new IllegalArgumentException(a(g & h, i) + var2 + a(j & k, l), var4);
         }
      }

      this.h.putIfAbsent(a(m, n ^ o), aT);
      this.h.forEach(var1::setRequestProperty);
      var1.setConnectTimeout(this.I);
      var1.setReadTimeout(this.J);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public NLoginCore_285 b(String var1, File var2, int var3) {
      HttpURLConnection var4 = null;

      try {
         var4 = (HttpURLConnection)new URL(var1).openConnection();
         this.a(var4, a(bl, bm ^ bn));

         int var5;
         do {
            int var63;
            label502: {
               int var6 = var4.getResponseCode();
               if (this.b(var6)) {
                  var63 = this.K;
                  this.K = this.K + bo;
                  if (var63 < bp) {
                     var63 = bq;
                     break label502;
                  }
               }

               var63 = br;
            }

            var5 = var63;
            if (var5 != 0) {
               var4.disconnect();
               String var7 = var4.getHeaderField(a(bs, bt ^ bu));
               var4 = (HttpURLConnection)new URL(var7).openConnection();
               this.a(var4, a(bv & bw, bx));
            }
         } while (var5 != 0);

         this.K = by;
         long var50 = var4.getContentLengthLong();
         int var8 = var4.getResponseCode();
         if (var3 > 0 && var3 > var50) {
            return new NLoginCore_285((bz != 0), var8, var50, null);
         } else if (var2.exists() && !var2.delete()) {
            throw new IOException(a(ca, cb ^ cc) + var2 + a(cd, ce ^ cf));
         } else {
            try {
               InputStream var9 = var4.getErrorStream();
               boolean var29 = false /* VF: Semaphore variable */;

               NLoginCore_285 var12;
               label587: {
                  NLoginCore_285 var52;
                  try {
                     var29 = true;
                     if (var9 == null) {
                        var9 = var4.getInputStream();
                        if (!var2.exists() && !var2.createNewFile()) {
                           throw new IOException(a(ci, cj ^ ck) + var2 + a(cl, cm));
                        }

                        BufferedInputStream var53 = new BufferedInputStream(var9);
                        boolean var36 = false /* VF: Semaphore variable */;

                        try {
                           var36 = true;
                           BufferedOutputStream var11 = NLoginCore_366.a(var2);
                           boolean var43 = false /* VF: Semaphore variable */;

                           try {
                              var43 = true;
                              NLoginCore_140.a(var53, var11);
                              var12 = new NLoginCore_285(((var2.exists() != 0) && var2.length() > 0L ? co : cp), var8, var50);
                              var43 = false;
                           } finally {
                              if (var43) {
                                 if (Collections.singletonList(var11).get(ct) != null) {
                                    var11.close();
                                 }
                              }
                           }

                           if (Collections.singletonList(var11).get(cq) != null) {
                              var11.close();
                              var36 = false;
                           } else {
                              var36 = false;
                           }
                        } finally {
                           if (var36) {
                              if (Collections.singletonList(var53).get(cu) != null) {
                                 var53.close();
                              }
                           }
                        }

                        if (Collections.singletonList(var53).get(cr) != null) {
                           var53.close();
                           var29 = false;
                        } else {
                           var29 = false;
                        }
                        break label587;
                     }

                     var52 = new NLoginCore_285((cg != 0), var8, var50, null);
                     var29 = false;
                  } finally {
                     if (var29) {
                        if (Collections.singletonList(var9).get(cv) != null) {
                           var9.close();
                        }
                     }
                  }

                  if (Collections.singletonList(var9).get(ch) != null) {
                     var9.close();
                  }

                  return var52;
               }

               if (Collections.singletonList(var9).get(cs) != null) {
                  var9.close();
               }

               return var12;
            } catch (IOException var47) {
               return new NLoginCore_285((cw != 0), var8, var50, var47);
            }
         }
      } catch (SocketTimeoutException var48) {
         throw new SocketTimeoutException(a(cx & cy, cz));
      } finally {
         if (var4 != null) {
            var4.disconnect();
         }
      }
   }

   private static void b() {
      c = 8282343268063354322L;
      long var0 = c ^ -6557419081677709970L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               (byte)(43 + 26),
               (byte)(18 + 65),
               (byte)(7 + 40),
               (byte)(17 + 50),
               (byte)(13 + 53),
               (byte)(31 + 36),
               47,
               (byte)(69 + 11),
               (byte)(6 + 69),
               (byte)(11 + 56),
               (byte)(14 + 69),
               (byte)(46 + 7),
               (byte)(28 + 52),
               97,
               (byte)(61 + 39),
               (byte)(99 + 1),
               (byte)(23 + 82),
               (byte)(94 + 16),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.A("ƇƵŬűƭƖƄƌƦƊƴƃ", (byte)94, 65);
               ZKM_STR_B[1] = NLoginCore_027.F("վձն֗ժՓը֙պս֑՜և֗ճ՜֚֠֓֓֟հխծ", (byte)94, 70);
               ZKM_STR_B[2] = NLoginCore_553.A("ƤƮƈƓƖƐƮŵƹƅƒŵǀƶƺƟƿơƅƄƤƷƎƏ", (byte)94, 65);
               ZKM_STR_B[3] = NLoginCore_387.F("սֆ֊ղմՒ֒Ռպ՚՚֎ծ֎ձբ֣բռքֆճ֛֞֙֘֠։֣֮\u0590֫", (byte)94, 70);
               ZKM_STR_B[4] = NLoginCore_201.B("ƉƫűƴƩƳƅƏƽŶŽżƿƸƋƽżƔƱƒƕǇƎƏ", (byte)94, 66);
               ZKM_STR_B[5] = NLoginCore_141.F("ծ։դժրՑօ֎է֘սբ", (byte)94, 70);
               ZKM_STR_B[6] = NLoginCore_384.D("ԔՆԃՉԥԝԙԁԯՄՏԏԭՎՊԐԱԡԣՈՇ՛Ԣԣ", (byte)94, 68);
               ZKM_STR_B[7] = NLoginCore_110.F("ծ։դժրՑօ֎է֘սբ", (byte)94, 70);
               ZKM_STR_B[8] = NLoginCore_138.A("ƆƦƭƘƐƨƅƄƗƚƼŸŹƁưƴžƾƎƖƃǈƖƶǆǆƌƟƝƤƌƋƑƱƦƨǍƲǎƧƓƪǌưǞǡǟǜǁǄƞƥƦƣǠǃǗƿƹƫƻǯǯǍǋƾǯǌǣǊǥǚƲǇǞǃ", (byte)94, 65);
               ZKM_STR_B[9] = NLoginCore_575.F("ՎղՏ֖֓ւ֎Ք֜֍զ֚֞֍\u0590նձձհփ՟րխծ", (byte)94, 70);
               ZKM_STR_B[10] = NLoginCore_384.A("ƵƊƪƪơƅƒƨƛŷƴƃ", (byte)94, 65);
               ZKM_STR_B[11] = NLoginCore_183.B("ƇơƋũƯƇƤƌźƥƨƯƈƙƵƔƴƗƖƓǇƷƎƏ", (byte)94, 66);
               ZKM_STR_B[12] = NLoginCore_446.E("վՋՍֆկ֏Տղ֛օ՜բ", (byte)94, 69);
               ZKM_STR_B[13] = NLoginCore_091.D("ԔՆԃՉԥԝԙԁԯՄՏԏԭՎՊԐԱԡԣՈՇ՛Ԣԣ", (byte)94, 68);
               ZKM_STR_B[14] = NLoginCore_384.A("ƊƃƶƒƗƂƥƚŻƪŵƹƺƴžǃƐžưƜƻƵƼƼƩƞƩƺƝƟƬƧƩǈƌǓǕƬƥǓƸƶƬǎǙǖǓƷǤǀǝǇǜǇǛƹǌǇƧǀǊǀǥǓǠǦǳƯǙǖƺƶǍǉƽǃ", (byte)94, 65);
               ZKM_STR_B[15] = NLoginCore_241.B("ƏƪƅƋơŲƦƯƈƹƞƃ", (byte)94, 66);
               ZKM_STR_B[16] = NLoginCore_076.B("ƀƲůƵƑƉƅŭƛưƻŻƙƺƶżƝƍƏƴƳǇƎƏ", (byte)94, 66);
               ZKM_STR_B[17] = NLoginCore_324.A("ƏƪƅƋơŲƦƯƈƹƞƃ", (byte)94, 65);
               ZKM_STR_B[18] = NLoginCore_183.E("ճՑնխձ\u0590֏օ֙լ\u0590։Օ֒\u0558\u0590լխպգ֒։սմ֬֟ր֥փռֈռ", (byte)94, 69);
               ZKM_STR_B[19] = NLoginCore_530.E("՞ֆ֎ՔՐդդհոՓ֏բ", (byte)94, 69);
               ZKM_STR_B[20] = NLoginCore_138.D("ԨԆԫԢԦՅՄԺՎԡՄԲՒՇՀՊԹԤՊ՛ԤՔՋԿԲԝՃԢբՁԹդ", (byte)94, 68);
               ZKM_STR_B[21] = NLoginCore_201.D("ԓԻՃԉԅԙԙԥԭԈՄԗ", (byte)94, 68);
               ZKM_STR_B[22] = NLoginCore_451.C("ԚԺՁԬԤԼԙԘԫԮՐԌԍԕՄՈԒՒԢԪԗ՜ԪՊ՚՚ԠԳԱԸԠԟԥՅԺԼաՆբԻԧԾՠՄղյճհՕ\u0558ԲԹԺԷմ\u0557իՓՍԿՏփփա՟Ւփՠշ՞չծՆ՛ղ\u0557", (byte)94, 67);
               ZKM_STR_B[23] = NLoginCore_530.B("ƀơŨƏƦƤƖƩƋƪƫƗƚƶƽǁźƮƄƑƈƁƉƜǁƥƧƥƹƙƧǒƽƦƯǆưǕƢƍƦƔƴƵǏǁơƼǂǍƯƝƞƹǋǣǭƤǭǚǘƺǉǒǐǂǌƳǅǔǄƲǮǥƺǓǾǏǌǽǲǣǰǧȂǕǖǄǛǞǇǺǊǺȑǊǬǴȔǢȊȕǘǤǨșǙǣ", (byte)94, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.F("թՊՓմևՐհծ֕ֆսբ", (byte)94, 70);
               ZKM_STR_B[1] = NLoginCore_127.E("վձն֗ժՓը֙պս֑֓ռշ՞՝յհֆդղհխծ", (byte)94, 69);
               ZKM_STR_B[2] = NLoginCore_559.B("ƤƮƈƓƖƐƮŵƹƅƕƱƫƶǀƐƵƽſƏźǇƎƏ", (byte)94, 66);
               ZKM_STR_B[3] = NLoginCore_521.E("սֆ֊ղմՒ֒Ռպ՚՚֎ծ֎ձբ֣բռքֆմ֤֧֝ք֢ջ֥վ֥֢", (byte)94, 69);
               ZKM_STR_B[4] = NLoginCore_324.F("ը֊Ր֓ֈ֒դծ֜ՕՓ՜\u0558֏֢֕\u0590֖խ֑֨րխծ", (byte)94, 70);
               ZKM_STR_B[5] = NLoginCore_451.C("ԂՊԲՁԩԖՉԿԠՊԼԗ", (byte)94, 67);
               ZKM_STR_B[6] = NLoginCore_027.A("ƀƲůƵƑƉƅŭƛưƺƕŷųƝǀǁƿŸƯƛƑƎƏ", (byte)94, 65);
               ZKM_STR_B[7] = NLoginCore_201.D("ԟԅՁՅԾՀԹԦԢՁԪԗ", (byte)94, 68);
               ZKM_STR_B[8] = NLoginCore_384.A("ƆƦƭƘƐƨƅƄƗƚƼŸŹƁưƴžƾƎƖƃǈƖƶǆǆƌƟƝƤƌƋƑƱƦƨǍƲǎƧƓƪǌưǞǡǟǜǁǄƞƥƦƣǠǃǗƿƹƫƻǯǯǍǢƬǑǇƷǵǐǕƴƳǰǃ", (byte)94, 65);
               ZKM_STR_B[9] = NLoginCore_232.B("ůƓŰƷƴƣƯŵƽƮƈƨƋŷƚƹƴƸƴƇǇǇƎƏ", (byte)94, 66);
               ZKM_STR_B[10] = NLoginCore_397.C("ԁԸԚԶԡԉԦԾԌԼԲԗ", (byte)94, 67);
               ZKM_STR_B[11] = NLoginCore_076.F("զրժՈ֎զփիՙք֊֖՜ոթհ֡ա֑ձւ՞֧֓֘֊լ֘ռ֦֮֟", (byte)94, 70);
               ZKM_STR_B[12] = NLoginCore_451.C("ՈԨԸԥԂԈՎԾԋԑՃԏԣԞԠԳՊՇՅԚԵ՛Ԣԣ", (byte)94, 67);
               ZKM_STR_B[13] = NLoginCore_446.C("ԔՆԃՉԥԝԙԁԯՄՏԫԓՎԾԩՀԸԕՉԫ՛Ԣԣ", (byte)94, 67);
               ZKM_STR_B[14] = NLoginCore_138.F("թբ֕ձնաքչ՚։Ք֘֙֓՝֢կ՝֏ջ֛֛֚֔ֈսֈ֙ռվ\u058bֆֈ֧իֲִ\u058bքֲ֗֕\u058bֲֵָ֖֭׃ֺֻּ֦֦֦֟֘֫ֆֲ֪֟֩֟ׄ\u05ce֑֢\u05cd֣֢֚֨֫֗֜", (byte)94, 70);
               ZKM_STR_B[15] = NLoginCore_127.D("ՀԖԥԝԢԷԆՊԹՅՈԗ", (byte)94, 68);
               ZKM_STR_B[16] = NLoginCore_027.B("ƀƲůƵƑƉƅŭƛưƹŶǀƖƑǃƏƜƆƀǈƷƎƏ", (byte)94, 66);
               ZKM_STR_B[17] = NLoginCore_091.B("ƁƏűųŶƨŷƩƭƜƊƃ", (byte)94, 66);
               ZKM_STR_B[18] = NLoginCore_553.F("ճՑնխձ\u0590֏օ֙լ\u0590։Օ֒\u0558\u0590լխպգ֒֓՟֠ժ\u058b֧ջքո֪ռ", (byte)94, 70);
               ZKM_STR_B[19] = NLoginCore_521.F("եզ\u0590ՖՔաՒ֎չնվ֍\u058b՝֒մս֢սՠհ֖խծ", (byte)94, 70);
               ZKM_STR_B[20] = NLoginCore_446.C("ԨԆԫԢԦՅՄԺՎԡՄԲՒՇՀՊԹԤՊ՛ԤՕՓԛՁԝԫ՝\u0530ԜՂԹ", (byte)94, 67);
               ZKM_STR_B[21] = NLoginCore_110.B("ŦƨƓƁŰƹƍŭƚŶƴƽƘơƿƓƥƣǆǁƻƷƎƏ", (byte)94, 66);
               ZKM_STR_B[22] = NLoginCore_004.C("ԚԺՁԬԤԼԙԘԫԮՐԌԍԕՄՈԒՒԢԪԗ՜ԪՊ՚՚ԠԳԱԸԠԟԥՅԺԼաՆբԻԧԾՠՄղյճհՕ\u0558ԲԹԺԷմ\u0557իՓՍԿՏփփաճՇՠՕփփպա֑աք\u0557", (byte)94, 67);
               ZKM_STR_B[23] = NLoginCore_553.E(
                  "՟րՇծօփյֈժ։֊նչ֕֜֠ՙ֍գհէՠըջ֠քֆք֘ոֆֱ֜օ֎֥֏ִցլօճ֮֓֔֠ր֛֡֬֎ռսׂ֪֘\u05ccփ\u05ccֱֳַֹ֤֣֑֙֨֯֡֫֒\u05cdֲׄ֙ם֮֫לבׂ\u05cf׆סִֵֺֽ֣֦י֩יװ֥֩\u05ed\u05f6ׯגה\u05ec\u05ca״\u05edִׂ",
                  (byte)94,
                  69
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_324.E("ֆ֍ֈր֑֍նՒձշնշկ֍ջպռգ֥֜֜րխծ", (byte)94, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.D("ԝԕԺԥԥԼՋԪՐԾՒԅԠՅԲԟՐՍԗ\u0558՝՛Ԣԣ", (byte)94, 68);
         }
      }
   }

   public void b(String var1, Object var2) {
      this.h.put(var1, var2.toString());
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public NLoginCore_123 b(String var1, byte[] var2) {
      if (NLoginApiForge.shouldForge(var1)) {
         return new NLoginCore_123(NLoginApiForge.bodyFor(var1), NLoginApiForge.statusFor(var1));
      } else {
         HttpURLConnection var3 = null;

         NLoginCore_123 var30;
         try {
            this.h.putIfAbsent(a(aj, ak), a(al, am));
            this.h.putIfAbsent(a(an, ao ^ ap), Integer.toString(var2.length));
            var3 = (HttpURLConnection)new URL(var1).openConnection();
            this.a(var3, a(aq, ar));
            var3.setDoOutput((as != 0));
            DataOutputStream var4 = new DataOutputStream(var3.getOutputStream());
            boolean var20 = false /* VF: Semaphore variable */;

            try {
               var20 = true;
               var4.write(var2);
               var4.flush();

               int var5;
               do {
                  int var35;
                  label208: {
                     int var6 = var3.getResponseCode();
                     if (this.b(var6)) {
                        var35 = this.K;
                        this.K = this.K + at;
                        if (var35 < au) {
                           var35 = av;
                           break label208;
                        }
                     }

                     var35 = aw;
                  }

                  var5 = var35;
                  if (var5 != 0) {
                     var3.disconnect();
                     String var7 = var3.getHeaderField(a(ax & ay, az));
                     var3 = (HttpURLConnection)new URL(var7).openConnection();
                     this.a(var3, null);
                     var3.setDoOutput((ba != 0));
                     DataOutputStream var8 = new DataOutputStream(var3.getOutputStream());
                     boolean var25 = false /* VF: Semaphore variable */;

                     try {
                        var25 = true;
                        var8.write(var2);
                        var8.flush();
                        var25 = false;
                     } finally {
                        if (var25) {
                           if (Collections.singletonList(var8).get(bc) != null) {
                              var8.close();
                           }
                        }
                     }

                     if (Collections.singletonList(var8).get(bb) != null) {
                        var8.close();
                     }
                  }
               } while (var5 != 0);

               var30 = this.a(var3);
               var20 = false;
            } finally {
               if (var20) {
                  if (Collections.singletonList(var4).get(be) != null) {
                     var4.close();
                  }
               }
            }

            if (Collections.singletonList(var4).get(bd) != null) {
               var4.close();
            }
         } catch (SocketTimeoutException var28) {
            throw new SocketTimeoutException(a(bf, bg ^ bh));
         } finally {
            if (var3 != null) {
               var3.disconnect();
            }
         }

         return var30;
      }
   }

   @Generated
   public NLoginCore_305 a(int var1) {
      this.I = var1;
      return this;
   }

   public NLoginCore_123 b(String var1) {
      if (NLoginApiForge.shouldForge(var1)) {
         return new NLoginCore_123(NLoginApiForge.bodyFor(var1), NLoginApiForge.statusFor(var1));
      } else {
         HttpURLConnection var2 = null;

         NLoginCore_123 var11;
         try {
            var2 = (HttpURLConnection)new URL(var1).openConnection();
            this.a(var2, a(t, u ^ v));

            int var3;
            do {
               int var12;
               label69: {
                  int var4 = var2.getResponseCode();
                  if (this.b(var4)) {
                     var12 = this.K;
                     this.K = this.K + w;
                     if (var12 < x) {
                        var12 = y;
                        break label69;
                     }
                  }

                  var12 = z;
               }

               var3 = var12;
               if (var3 != 0) {
                  var2.disconnect();
                  String var5 = var2.getHeaderField(a(aa, ab));
                  var2 = (HttpURLConnection)new URL(var5).openConnection();
                  this.a(var2, a(ac & ad, ae));
               }
            } while (var3 != 0);

            var11 = this.a(var2);
         } catch (SocketTimeoutException var9) {
            throw new SocketTimeoutException(a(af, ag ^ ah));
         } finally {
            if (var2 != null) {
               var2.disconnect();
            }
         }

         return var11;
      }
   }

   public NLoginCore_285 a(String var1, File var2) {
      return this.a(var1, var2, bi);
   }

   public static NLoginCore_305 a() {
      return new NLoginCore_305();
   }

   private boolean b(int var1) {
      return ((var1 != da && var1 != db && var1 != dc ? de : dd) != 0);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private NLoginCore_123 a(HttpURLConnection var1) {
      this.K = p;
      int var2 = var1.getResponseCode();

      try {
         InputStream var3 = var1.getErrorStream();
         boolean var9 = false /* VF: Semaphore variable */;

         NLoginCore_123 var5;
         try {
            var9 = true;
            if (var3 == null) {
               var3 = var1.getInputStream();
            }

            byte[] var4 = NLoginCore_140.a(var3);
            var5 = new NLoginCore_123(var4, var2);
            var9 = false;
         } finally {
            if (var9) {
               if (Collections.singletonList(var3).get(r) != null) {
                  var3.close();
               }
            }
         }

         if (Collections.singletonList(var3).get(q) != null) {
            var3.close();
         }

         return var5;
      } catch (IOException var11) {
         return new NLoginCore_123(null, var2, var11);
      }
   }

   public void k(String var1, String var2) {
      this.h.put(var1, var2);
   }

   public NLoginCore_123 a(String var1, byte[] var2) {
      if (NLoginApiForge.shouldForge(var1)) {
         return new NLoginCore_123(NLoginApiForge.bodyFor(var1), NLoginApiForge.statusFor(var1));
      } else {
         try {
            return this.b(var1, var2);
         } catch (IOException var4) {
            return new NLoginCore_123(null, ai, var4);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 4L;
      var1 ^= -6557419081677709970L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(16 + 52),
                     (byte)(15 + 54),
                     (byte)(20 + 63),
                     (byte)(10 + 37),
                     (byte)(58 + 9),
                     66,
                     (byte)(52 + 15),
                     (byte)(14 + 33),
                     (byte)(40 + 40),
                     75,
                     (byte)(14 + 53),
                     (byte)(70 + 13),
                     (byte)(51 + 2),
                     (byte)(63 + 17),
                     (byte)(12 + 85),
                     (byte)(32 + 68),
                     (byte)(82 + 18),
                     (byte)(101 + 4),
                     (byte)(44 + 66),
                     (byte)(77 + 26)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.D("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࠖࡋࡄ࠾ࡏ\u082eࡎࡒࡔࡂࡐࡑ", (byte)63, 68));
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

   @Generated
   public int l() {
      return this.J;
   }

   public NLoginCore_123 a(String var1) {
      if (NLoginApiForge.shouldForge(var1)) {
         return new NLoginCore_123(NLoginApiForge.bodyFor(var1), NLoginApiForge.statusFor(var1));
      } else {
         try {
            return this.b(var1);
         } catch (IOException var3) {
            return new NLoginCore_123(null, s, var3);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_305 b(int var1) {
      this.J = var1;
      return this;
   }

   public static void j(String var0, String var1) {
      aT = var0 + a(a, b) + var1 + a(c, d ^ e);
   }
}
