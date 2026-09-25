package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.tasks.CmdAfterAuthTask;
import com.nickuc.login.tasks.LoginMainQueueTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_001 {
   private static int l = (0 >>> 148 | 0 << -148) & -1;
   private static int ag = Integer.reverse(536870912);
   private static long bb = Long.reverse(-3458764513820540928L);
   private static int dh = Integer.reverse(134217728);
   private static long di = Long.reverse(-4042632916536581323L);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(-1073741824);
   private static int dq = Integer.reverse(-1073741824);
   private static int bp = Integer.reverse(-1);
   private static int cb = (65536 >>> 175 | 65536 << -175) & -1;
   private static int ad = Integer.reverse(-1073741824);
   private static int aa = (134217728 >>> 219 | 134217728 << -219) & -1;
   private static int w = 0 >>> 164 | 0 << ~164 + 1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long co = Long.reverse(-3458764513820540928L);
   private static int au = 8 >>> 35 | 8 << -35;
   private static long j = Long.reverse(1721974606497653557L);
   private static int r = 16384 >>> 78 | 16384 << -78;
   private static int g = (4194304 >>> 149 | 4194304 << -149) & -1;
   private static int cd = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_B = new String[NLoginType_001.ea];
   private static long ba = Long.reverse(-4042632916536581323L);
   private static long p = Long.reverse(-3458764513820540928L);
   private static long dp = Long.reverse(1721974606497653557L);
   private static int cl = (0 >>> 80 | 0 << -80) & -1;
   private static int cv = Integer.reverse(0);
   private static int cf = Integer.reverse(-805306368);
   private static int dd = (0 >>> 183 | 0 << ~183 + 1) & -1;
   private static int ac = (4194304 >>> 22 | 4194304 << -22) & -1;
   private static int av = 268435456 >>> 220 | 268435456 << -220;
   private static int dl = (16777216 >>> 152 | 16777216 << -152) & -1;
   private static long dj = Long.reverse(-3458764513820540928L);
   private static long bt = Long.reverse(-4042632916536581323L);
   private static long ak = Long.reverse(-4042632916536581323L);
   private static int de = 1 >>> 126 | 1 << -126;
   private static int n = Integer.reverse(1073741824);
   private static int at = Integer.reverse(0);
   private static int c = (0 >>> 163 | 0 << ~163 + 1) & -1;
   private static int bo = Integer.reverse(-1879048192);
   private static int bd = Integer.reverse(0);
   private static int cs = (125829120 >>> 215 | 125829120 << ~215 + 1) & -1;
   private static int dg = 0 >>> 240 | 0 << -240;
   private static int q = 671088640 >>> 187 | 671088640 << -187;
   private static int dm = (1024 >>> 73 | 1024 << ~73 + 1) & -1;
   private static long cn = Long.reverse(-4042632916536581323L);
   private static long e = Long.reverse(1721974606497653557L);
   private static int bf = -1 >>> 137 | -1 << ~137 + 1;
   private static int ax = 0 >>> 71 | 0 << -71;
   private static String[] ZKM_STR_A = new String[NLoginType_001.dz];
   private static int z = (0 >>> 77 | 0 << ~77 + 1) & -1;
   private static int ao = Integer.reverse(0);
   private static int var_do = Integer.reverse(-1);
   private static int cp = (1835008 >>> 209 | 1835008 << -209) & -1;
   private static int i = Integer.reverse(-1);
   private static int db = (-2147483636 >>> 158 | -2147483636 << -158) & -1;
   private static int dz = Integer.reverse(-939524096);
   private static long c;
   private static long bm = Long.reverse(1721974606497653557L);
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static long bu = Long.reverse(-3458764513820540928L);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = Integer.reverse(-536870912);
   private static long af = Long.reverse(-3458764513820540928L);
   private static int cq = -1 >>> 67 | -1 << -67;
   private static int bz = (0 >>> 157 | 0 << -157) & -1;
   private static int dr = Integer.reverse(536870912);
   private static int f = 65536 >>> 80 | 65536 << ~80 + 1;
   private static int ea = Integer.reverse(-939524096);
   private static int bc = (0 >>> 81 | 0 << ~81 + 1) & -1;
   private static long ch = Long.reverse(-3458764513820540928L);
   private final NLoginType_005 a;
   private static int dt = -1 >>> 243 | -1 << -243;
   private static int cz = Integer.reverse(1073741824);
   private static int br = 134217728 >>> 218 | 134217728 << ~218 + 1;
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int ca = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(1073741824);
   private static int by = (33554432 >>> 249 | 33554432 << ~249 + 1) & -1;
   private static int ct = (-1 >>> 46 | -1 << ~46 + 1) & -1;
   private static int dv = (-2147483646 >>> 255 | -2147483646 << ~255 + 1) & -1;
   private static int dc = Integer.reverse(-1073741824);
   private static int bs = Integer.reverse(1342177280);
   private static int ci = 3145728 >>> 50 | 3145728 << ~50 + 1;
   private static long ae = Long.reverse(-4042632916536581323L);
   private static int b = '쀀' >>> 'M' | 49152 << -77;
   private static int dw = (0 >>> 149 | 0 << -149) & -1;
   private static int cy = Integer.reverse(0);
   private static int cx = Integer.reverse(Integer.MIN_VALUE);
   private static int ar = (262144 >>> 80 | 262144 << -80) & -1;
   private static long cj = Long.reverse(1721974606497653557L);
   private static int s = Integer.reverse(0);
   private final NLoginType_008 b;
   private static int ce = Integer.reverse(-1073741824);
   private static int aw = Integer.reverse(1073741824);
   private static long bq = Long.reverse(1721974606497653557L);
   private static int u = Integer.reverse(0);
   private static int as = (0 >>> 218 | 0 << ~218 + 1) & -1;
   private static long bh = Long.reverse(-4042632916536581323L);
   private static long cg = Long.reverse(-4042632916536581323L);
   private static int x = 65536 >>> 240 | 65536 << ~240 + 1;
   private static int dk = Integer.reverse(Integer.MIN_VALUE);
   private static int cm = (436207616 >>> 185 | 436207616 << ~185 + 1) & -1;
   private static int bw = Integer.reverse(0);
   private static long ah = Long.reverse(1721974606497653557L);
   private static int ab = 0 >>> 20 | 0 << -20;
   private static long bi = Long.reverse(-3458764513820540928L);
   private static int aj = 671088640 >>> 27 | 671088640 << -27;
   private static long al = Long.reverse(-3458764513820540928L);
   private static int aq = Integer.reverse(0);
   private static long du = Long.reverse(1721974606497653557L);
   private static int be = (1048576 >>> 78 | 1048576 << ~78 + 1) & -1;
   private static int az = Integer.reverse(1610612736);
   private static int ds = Integer.reverse(1207959552);
   private static long cr = Long.reverse(1721974606497653557L);
   private static int bn = 2048 >>> 107 | 2048 << ~107 + 1;
   private static int df = Integer.reverse(1610612736);
   private static int d = Integer.reverse(0);
   private static int cw = (16777216 >>> 24 | 16777216 << -24) & -1;
   private static int dx = Integer.reverse(-201326592);
   private static int da = 0 >>> 39 | 0 << -39;
   private static int ck = 8388608 >>> 151 | 8388608 << -151;
   private static int bv = Integer.reverse(-1073741824);
   private static int y = Integer.reverse(0);
   private static int m = (4 >>> 96 | 4 << ~96 + 1) & -1;
   private static int bk = Integer.reverse(268435456);
   private static int dy = Integer.reverse(Integer.MIN_VALUE);
   private static long cu = Long.reverse(1721974606497653557L);
   private static int an = 0 >>> 212 | 0 << ~212 + 1;
   private static int ai = Integer.reverse(0);
   private static int bj = 0 >>> 208 | 0 << ~208 + 1;
   private static long o = Long.reverse(-4042632916536581323L);
   private static int cc = Integer.reverse(0);
   private static int ay = (48 >>> 4 | 48 << ~4 + 1) & -1;
   private static int bl = (-1 >>> 141 | -1 << -141) & -1;
   private static int ap = Integer.reverse(0);
   private static int dn = Integer.reverse(-2013265920);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_001.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_397.C("ӷԙԛӻԟԾԶՌԸԇՅԻՉՃԌԱՓՒՊՐՊԟ", (byte)94, 67), NLoginType_001.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.D("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢢࢥࢋࢉࢤࢦ࢝\u0890ࡻԣ", (byte)94, 68) + var1 + NLoginCore_223.A("ŵ", (byte)94, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public void a(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3) {
      if (var3) {
         this.a.a(var1, var2);
      }

      NLoginInterface_012 var4 = var2.a(NLoginCore_567.H);
      if (var4 != null) {
         var4.c(this.b, var1, var2);
      }

      String var5 = var2.a(NLoginCore_567.G);
      if (var5 != null) {
         NLoginCore_487 var10001 = NLoginCore_487.ay;
         Object[] var10002 = new Object[am];
         var10002[an] = var5;
         NLoginCore_150.a(var1, var10001, var10002);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 3419259884363249088L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(64 + 5),
                     (byte)(20 + 63),
                     (byte)(19 + 28),
                     (byte)(51 + 16),
                     (byte)(11 + 55),
                     (byte)(33 + 34),
                     (byte)(9 + 38),
                     (byte)(71 + 9),
                     (byte)(12 + 63),
                     (byte)(57 + 10),
                     83,
                     (byte)(49 + 4),
                     (byte)(51 + 29),
                     (byte)(78 + 19),
                     (byte)(61 + 39),
                     (byte)(66 + 34),
                     (byte)(92 + 13),
                     110,
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.B("äñð³óïêóþíºøüõøþÀєїнліјятЭ", (byte)1, 66));
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

   private void a(NLoginCore_277 var1, boolean var2) {
      List var3 = var2 ? NLoginCore_477.aq.a(new Object[ao]) : NLoginCore_477.ar.a(new Object[ap]);
      if (!var3.isEmpty()) {
         Runnable var4 = () -> var3.forEach(var2xx -> {
            var2xx = var2xx.trim();
            if (!var2xx.isEmpty()) {
               String var3x = var1.getName();
               Object[] var10000 = new Object[ar];
               var10000[as] = Boolean.valueOf((at != 0));
               var10000[au] = Boolean.valueOf((av != 0));
               var10000[aw] = ax;
               var10000[ay] = null;
               Object[] var4x = var10000;
               String[] var5 = var2xx.split(a(az, ba ^ bb));
               StringBuilder var6 = new StringBuilder();

               for (int var7 = bc; var7 < var5.length; var7++) {
                  String var8 = var5[var7];
                  if (!var8.isEmpty()) {
                     if (var8.charAt(bd) == be) {
                        String var9 = var8.toLowerCase(Locale.ENGLISH);
                        int var10 = bf;
                        switch (var9.hashCode()) {
                           case 59834243:
                              if (var9.equals(a(bs, bt ^ bu))) {
                                 var10 = bv;
                              }
                              break;
                           case 822222103:
                              if (var9.equals(a(bg, bh ^ bi))) {
                                 var10 = bj;
                              }
                              break;
                           case 1927733571:
                              if (var9.equals(a(bo & bp, bq))) {
                                 var10 = br;
                              }
                              break;
                           case 1939206702:
                              if (var9.equals(a(bk & bl, bm))) {
                                 var10 = bn;
                              }
                        }

                        switch (var10) {
                           case 0:
                              var4x[bw] = Boolean.valueOf((bx != 0));
                              continue;
                           case 1:
                              var4x[by] = Boolean.valueOf((bz != 0));
                              continue;
                           case 2:
                              if (var7 + ca < var5.length) {
                                 var4x[cb] = NLoginCore_449.a(var5[++var7], cc);
                                 continue;
                              }
                              break;
                           case 3:
                              if (var7 + cd < var5.length) {
                                 String var11 = var5[++var7];
                                 if (var11 != null) {
                                    int var10001 = ce;
                                    String[] var10002;
                                    if (var11.contains(a(cf, cg ^ ch))) {
                                       var10002 = var11.split(a(ci, cj));
                                    } else {
                                       var10002 = new String[ck];
                                       var10002[cl] = var11;
                                    }

                                    var4x[var10001] = var10002;
                                 }
                                 continue;
                              }
                        }
                     }

                     if (var6.length() > 0) {
                        var6.append(a(cm, cn ^ co));
                     }

                     var6.append(var8);
                  }
               }

               String var14 = var6.toString().replace(a(cp & cq, cr), var3x).replace(a(cs & ct, cu), var1.ac());
               if (!var14.isEmpty()) {
                  boolean var15 = (Boolean)var4x[cv];
                  int var16 = this.b.L() && var4x[cw] ? cx : cy;
                  int var17 = Math.max((Integer)var4x[cz], da) * db;
                  String[] var18 = (String[])var4x[dc];
                  Runnable var12 = () -> {
                     if (var16) {
                        NLoginType_010 var6x = this.b.c();
                        if (var18 != null) {
                           String var7x = var6x.a(var1);
                           if (Arrays.stream(var18).noneMatch(var1xxxx -> var1xxxx.equals(var7x))) {
                              return;
                           }
                        }

                        NLoginCore_199 var10000x = var6x.a();
                        int var10002x = de;
                        Object[] var10003 = new Object[df];
                        var10003[dg] = a(dh, di ^ dj);
                        var10003[dk] = dl;
                        var10003[dm] = a(dn & var_do, dp);
                        var10003[dq] = var14;
                        var10003[dr] = a(ds & dt, du);
                        var10003[dv] = var15;
                        var10000x.a(var1, var10002x, var10003);
                     } else if (var15) {
                        this.b.b().a().l(var14);
                     } else {
                        if (this.b.L() && var18 != null) {
                           NLoginType_010 var8x = this.b.c();
                           String var9x = var8x.a(var1);
                           if (Arrays.stream(var18).noneMatch(var1xxxx -> var1xxxx.equals(var9x))) {
                              return;
                           }
                        }

                        if (var14.charAt(dw) == dx && this.b.b().a() != NLoginCore_419.b) {
                           var1.l(var14);
                        } else {
                           var1.p(var14);
                        }
                     }
                  };
                  if (var17 == 0) {
                     var12.run();
                  } else {
                     this.b.b((dd != 0)).a(new CmdAfterAuthTask(var12), (long)var17, TimeUnit.MILLISECONDS);
                  }
               }
            }
         });
         this.b.b((aq != 0)).a(new CmdAfterAuthTask(var4));
      }
   }

   @Generated
   public NLoginType_001(NLoginType_008 var1, NLoginType_005 var2) {
      this.b = var1;
      this.a = var2;
   }

   private static void b() {
      c = -5997509100165552157L;
      long var0 = c ^ 3419259884363249088L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(2 + 66),
               (byte)(58 + 11),
               (byte)(55 + 28),
               (byte)(9 + 38),
               (byte)(52 + 15),
               (byte)(43 + 23),
               (byte)(44 + 23),
               47,
               (byte)(62 + 18),
               (byte)(13 + 62),
               67,
               (byte)(75 + 8),
               (byte)(13 + 40),
               (byte)(21 + 59),
               (byte)(30 + 67),
               (byte)(47 + 53),
               (byte)(51 + 49),
               (byte)(79 + 26),
               (byte)(34 + 76),
               (byte)(68 + 35)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.B("ƂǇƭƨǊƬƾǕǑưƑƟ", (byte)108, 66);
               ZKM_STR_B[1] = NLoginCore_127.D("ՆԼբՔՏՎՈԵՅՐզՇՍչաՏպՎՓՀյ՚բմֆՊաՃՇևզ՟", (byte)108, 68);
               ZKM_STR_B[2] = NLoginCore_553.C("ԪՇՒՇմգԵՎգՑԴ\u0557ՆղՌԷ՞ռճմԽՏՌՍ", (byte)108, 67);
               ZKM_STR_B[3] = NLoginCore_127.F("֠\u0590մ֢ձ֛պոգ֚֭֗ը֜֙֬֊֤֝֜օղֶ֒֫ո֑֒ո֖֯׀։ֳ֜ռֱַֹֽ֖֘֡׆ׂ֛֦ׅ֠֨׀ֵד֮֞֠ׄדׇֻ֛־ֶֹ֛֮׀ׁף֡\u05c8֠\u05caֿ\u05cbְ", (byte)108, 70);
               ZKM_STR_B[4] = NLoginCore_433.D("բծ՜ԬՀէՠՔզխԳՁ", (byte)108, 68);
               ZKM_STR_B[5] = NLoginCore_141.B("ƢƛǅǇƧƬƟƷǍǚƬǎǖǒƱǕƠƪǁǐǓǀƿǇǉǁǔǛƿƿƹǊǱǐƬǭǝǭƱǡǇǶǋǻǋǷƵǳǮǢƾȁǙǽǲǼǰǞǙȇǵǄǥȃǌȇȃǌȋȐǐǠșȃǧȓǺȕȜǕȋǠȕȌȣȓȔǴȝǾȨȝȔǣȣș", (byte)108, 66);
               ZKM_STR_B[6] = NLoginCore_241.E("֑ՙլյ֖վ՞պ֚֨ջհ", (byte)108, 69);
               ZKM_STR_B[7] = NLoginCore_091.B("ǎƢƎƫƊƧƞƮƮǓƷƣƕǌưǋƬǊƝƷƠƽƪƫ", (byte)108, 66);
               ZKM_STR_B[8] = NLoginCore_387.C("ԲԱբՃՏաԳՌԶթնՁ", (byte)108, 67);
               ZKM_STR_B[9] = NLoginCore_110.B("ƪǌǅƼƤƠǌƏƠǑƪƟ", (byte)108, 66);
               ZKM_STR_B[10] = NLoginCore_553.C("ՅՁԯըըԲլՌԱդղՁ", (byte)108, 67);
               ZKM_STR_B[11] = NLoginCore_446.C("Ճ՛ՇԿՐԿթՊձՐԳՁ", (byte)108, 67);
               ZKM_STR_B[12] = NLoginCore_127.E("ղ֊նծտծ֘չ֠տբհ", (byte)108, 69);
               ZKM_STR_B[13] = NLoginCore_471.E("֑ՙլյ֖վ՞պ֚֨ջհ", (byte)108, 69);
               ZKM_STR_B[14] = NLoginCore_575.E("֝\u058cյ՚ղ֦֓֝֙յբհ", (byte)108, 69);
               ZKM_STR_B[15] = NLoginCore_027.D("ԱբդԬԿ\u0558գծ՚ԸԴԴշծհ\u0557ՔՌՒքմօՌՍ", (byte)108, 68);
               ZKM_STR_B[16] = NLoginCore_530.B("ưưƯƯƜƯƧƨǆƖǔƟ", (byte)108, 66);
               ZKM_STR_B[17] = NLoginCore_451.D("Ղ՝ՀիՍՄՅՙՙԷ\u0558Ձ", (byte)108, 68);
               ZKM_STR_B[18] = NLoginCore_092.F("֡նձ֛ՠ֔՟֘գ֕թ֜ժ֖֎֯֎ցֲ֝օվջռ", (byte)108, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.F("֞֏ջ֜՛֎֏՟՟֧֥֗ց֎ռ֘֟թ֠խְ֎ջռ", (byte)108, 70);
               ZKM_STR_B[1] = NLoginCore_471.A("ƤƚǀƲƭƬƦƓƣƮǄƥƫǗƿƭǘƬƱƞǓƺƘǖƟƿƢƺƦƼǝƦ", (byte)108, 65);
               ZKM_STR_B[2] = NLoginCore_453.A("ƈƥưƥǒǁƓƬǁƯƒƵưƬƨƷƛǎǔǁǓƽƪƫ", (byte)108, 65);
               ZKM_STR_B[3] = NLoginCore_559.F("֠\u0590մ֢ձ֛պոգ֚֭֗ը֜֙֬֊֤֝֜օղֶ֒֫ո֑֒ո֖֯׀։ֳ֜ռֱַֹֽ֖֘֡׆ׂ֛֦ׅ֠֨׀ֵד֮֞֠ׄדׇֻ֛־֛֢֚֮עגסׇ׆֞דְֿ֠", (byte)108, 70);
               ZKM_STR_B[4] = NLoginCore_453.C("ԬՓզԧճԳՄզյլՌՁ", (byte)108, 67);
               ZKM_STR_B[5] = NLoginCore_553.A("ƢƛǅǇƧƬƟƷǍǚƬǎǖǒƱǕƠƪǁǐǓǀƿǇǉǁǔǛƿƿƹǊǱǐƬǭǝǭƱǡǇǶǋǻǋǷƵǳǮǢƾȁǙǽǲǼǰǞǙȇǵǄǥȃǌȇȃǌȋȐǐǠșȃǧȓǺȕȜǕȋǠȕȌȣȡǸǦȣȅȂȈȜȧȂǫȟȮȡǰȁǬȉȸȔȦǹǿ", (byte)108, 65);
               ZKM_STR_B[6] = NLoginCore_324.C("կԽՀԾլՇԪՍդՕՌՁ", (byte)108, 67);
               ZKM_STR_B[7] = NLoginCore_201.A("ǎƢƎƫƊƧƞƮƮǓƷǃǌǞƜưƲǡƟƽǕǣƪƫ", (byte)108, 65);
               ZKM_STR_B[8] = NLoginCore_127.B("ƂǌƒƎǍǆƦǍǗƴǃƒưǗǙƳƚƿƮƛǟǣƪƫ", (byte)108, 66);
               ZKM_STR_B[9] = NLoginCore_575.D("ՁՓյԵզՍչԫՖՍԷԴՙճՋԾՙ՚ՔՎԾՏՌՍ", (byte)108, 68);
               ZKM_STR_B[10] = NLoginCore_559.B("ƧƑƛƜơƽƷǁƢƴǚǗǓǍǚǓƴƠƙǘǁƽƪƫ", (byte)108, 66);
               ZKM_STR_B[11] = NLoginCore_183.E("\u0558ՠպւ֝քց֡վնփհ", (byte)108, 69);
               ZKM_STR_B[12] = NLoginCore_173.C("ըաՔԬձզՙժպԭՐՁ", (byte)108, 67);
               ZKM_STR_B[13] = NLoginCore_575.D("՚՛ՕլիԲՊՙՖԲժՁ", (byte)108, 68);
               ZKM_STR_B[14] = NLoginCore_451.F("շ֏բդֆն֖֩գաա֊֠֍ւվձ֒֍ֆ֕֎ջռ", (byte)108, 70);
               ZKM_STR_B[15] = NLoginCore_384.F("ՠ֑֓՛ծև֒֝։էեպե֬\u058c֣֚֘֜֡֒֎ջռ", (byte)108, 70);
               ZKM_STR_B[16] = NLoginCore_451.F("֛յբջ֢հոՠ֖ըթ֢֖\u058c֭֙֠։֮ւծִջռ", (byte)108, 70);
               ZKM_STR_B[17] = NLoginCore_530.C("Սխկ՝Ղ՟ՒչպԴՒՏՋմԸ\u0558ՍպԽտ՜օՌՍ", (byte)108, 67);
               ZKM_STR_B[18] = NLoginCore_092.A("ǐƥƠǊƏǃƎǇƒǄƗƮǉǌƔǌƻǑƻǁǍǓƪƫ", (byte)108, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.B("ƙƎƈƩƬǓƩƨƕǚƹƬǊǕƘǌǀƠƻǚƽǣƪƫ", (byte)108, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.C("ՇՋ՞ձԶԶՒ\u0558բՉճԺՈՓՉթԿՌՍգՐֈՁփ֊\u0558ռԿօ\u0558֍ւ", (byte)108, 67);
         }
      }
   }

   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3, LoginType var4, String var5) {
      try {
         if (!var2.R()) {
            return;
         }

         var3.a(NLoginCore_077.g, NLoginCore_077.f);
         LoginMainQueueTask.n(var2);
         boolean var6 = var1.v();
         if (var4 != LoginType.REGISTER) {
            this.b.a().a(var1, var2.ac(), var5);
         }

         if (this.b.L()) {
            NLoginType_010 var7 = this.b.c();
            NLoginCore_199 var10000 = var7.a();
            int var10002 = a;
            Object[] var10003 = new Object[b];
            var10003[c] = a(d, e);
            var10003[f] = var4.ordinal();
            var10003[g] = a(h & i, j);
            var10003[k] = Boolean.valueOf((l != 0));
            var10003[m] = a(n, o ^ p);
            var10003[q] = Boolean.valueOf(((!var3.a(NLoginCore_567.L) != 0) && !NLoginCore_532.g.ar() && !NLoginCore_532.i.ar() ? r : s));
            var10000.a(var2, var10002, var10003);
         }

         NLoginCore_033 var12 = this.b.b().a();
         if (var12 != null) {
            var12.a(var2, NLoginCore_035.a);
         }

         this.a(var2, ((var4 != LoginType.REGISTER && !var6 ? u : t) != 0));
         NLoginType_008 var13 = this.b;
         EventEnum var10001 = EventEnum.AUTHENTICATE_EVENT;
         Object[] var14 = new Object[v];
         var14[w] = var2;
         var13.a(var10001, var14);
         int var8 = x;
         if (this.b.L() && (var3.a(NLoginCore_567.L) || NLoginCore_532.g.ar() || NLoginCore_532.i.ar())) {
            NLoginType_010 var9 = this.b.c();
            int var10 = Math.max(NLoginCore_532.e.r(), y);
            if (var10 > 0) {
               var8 = z;
               this.b.b((aa != 0)).a(() -> {
                  if (var2.R()) {
                     if (var9.a(var2, var3) == null) {
                        this.a(var2, var3, (dy != 0));
                     }
                  }
               }, (long)var10, TimeUnit.MILLISECONDS);
            } else if (var9.a(var2, var3) != null) {
               var8 = ab;
            }
         }

         if (var8 != 0) {
            this.a(var2, var3, (ac != 0));
         }
      } catch (Throwable var11) {
         NLoginCore_370.c(a(ad, ae ^ af) + var2.getName() + a(ag, ah), var11);
         var2.a(a(aj, ak ^ al));
      }
   }
}
