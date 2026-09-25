package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.tasks.StartAsyncLoginTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_015 {
   private static int bq = Integer.reverse(0);
   private static int as = (524288 >>> 211 | 524288 << -211) & -1;
   private static int h = Integer.reverse(0);
   private static int bl = -1 >>> 84 | -1 << -84;
   private static int cl = Integer.reverse(1879048192);
   private static int bg = (0 >>> 130 | 0 << -130) & -1;
   private static int af = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static int co = (960 >>> 70 | 960 << -70) & -1;
   private static int bf = Integer.reverse(0);
   private static int ag = 524288 >>> 51 | 524288 << ~51 + 1;
   private final NLoginType_005 b;
   private static int i = 0 >>> 125 | 0 << -125;
   private static int ck = (0 >>> 251 | 0 << -251) & -1;
   private static long cd = Long.reverse(4179340454199820288L);
   private static int bo = Integer.reverse(0);
   private static long k = Long.reverse(4947871273982203747L);
   private static long cm = Long.reverse(9127211728182024035L);
   private static long z = Long.reverse(4179340454199820288L);
   private static int av = Integer.reverse(-1610612736);
   private static int cu = 35651584 >>> 149 | 35651584 << -149;
   private static int v = Integer.reverse(-1);
   private static long bs = Long.reverse(9127211728182024035L);
   private static int ap = (0 >>> 190 | 0 << -190) & -1;
   private static int a = (32 >>> 197 | 32 << -197) & -1;
   private static int cz = Integer.reverse(-939524096);
   private static long bj = Long.reverse(4947871273982203747L);
   private static int cr = Integer.reverse(134217728);
   private static long ba = Long.reverse(4179340454199820288L);
   private static int ai = Integer.reverse(0);
   private static int j = (-1 >>> 224 | -1 << -224) & -1;
   private static int bz = 0 >>> 26 | 0 << ~26 + 1;
   private static long cj = Long.reverse(4179340454199820288L);
   private static int cx = 36 >>> 1 | 36 << -1;
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = (0 >>> 125 | 0 << ~125 + 1) & -1;
   private static int aq = 1024 >>> 10 | 1024 << ~10 + 1;
   private static long cn = Long.reverse(4179340454199820288L);
   private static long c;
   private static long ct = Long.reverse(4947871273982203747L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int da = Integer.reverse(-939524096);
   private static int bb = Integer.reverse(0);
   private static long bd = Long.reverse(9127211728182024035L);
   private static int at = Integer.reverse(Integer.MIN_VALUE);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int cb = (-2147483643 >>> 159 | -2147483643 << ~159 + 1) & -1;
   private static int cv = -1 >>> 206 | -1 << -206;
   private static String[] ZKM_STR_B = new String[da];
   private static int al = Integer.reverse(0);
   private final NLoginType_008 d;
   private static int b = (0 >>> 225 | 0 << ~225 + 1) & -1;
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int ar = Integer.reverse(0);
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = (0 >>> 235 | 0 << -235) & -1;
   private static int q = Integer.reverse(-1073741824);
   private static int n = 1073741824 >>> 61 | 1073741824 << ~61 + 1;
   private static int ab = (0 >>> 147 | 0 << ~147 + 1) & -1;
   private static int bw = 4 >>> 162 | 4 << ~162 + 1;
   private static int ah = Integer.reverse(Integer.MIN_VALUE);
   private static int bh = (1048576 >>> 49 | 1048576 << -49) & -1;
   private static int bc = 1792 >>> 40 | 1792 << -40;
   private static int x = (-1073741824 >>> 126 | -1073741824 << -126) & -1;
   private static String[] ZKM_STR_A = new String[cz];
   private static int s = Integer.reverse(0);
   private static int ay = Integer.reverse(1610612736);
   private static int br = Integer.reverse(1342177280);
   private static int ch = Integer.reverse(-1342177280);
   private static int bx = (268435456 >>> 252 | 268435456 << ~252 + 1) & -1;
   private static int ak = (0 >>> 176 | 0 << -176) & -1;
   private static int cf = Integer.reverse(-1);
   private static int e = Integer.reverse(0);
   private static int cq = (0 >>> 133 | 0 << -133) & -1;
   private static long w = Long.reverse(4947871273982203747L);
   private static long y = Long.reverse(9127211728182024035L);
   private static long p = Long.reverse(4947871273982203747L);
   private static long cp = Long.reverse(4947871273982203747L);
   private static long bm = Long.reverse(4947871273982203747L);
   private static long ci = Long.reverse(9127211728182024035L);
   private static int bn = Integer.reverse(0);
   private static int r = 16384 >>> 238 | 16384 << ~238 + 1;
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int g = 67108864 >>> 56 | 67108864 << ~56 + 1;
   private static int aa = 0 >>> 233 | 0 << -233;
   private static int by = Integer.reverse(Integer.MIN_VALUE);
   private static long an = Long.reverse(4947871273982203747L);
   private static int u = (8 >>> 2 | 8 << -2) & -1;
   private static long be = Long.reverse(4179340454199820288L);
   private static int aj = 64 >>> 37 | 64 << ~37 + 1;
   private static long cy = Long.reverse(4947871273982203747L);
   private static int au = (0 >>> 235 | 0 << ~235 + 1) & -1;
   private static int bv = 0 >>> 142 | 0 << -142;
   private static long cw = Long.reverse(4947871273982203747L);
   private static int c = (0 >>> 194 | 0 << ~194 + 1) & -1;
   private static long cc = Long.reverse(9127211728182024035L);
   private static int bi = Integer.reverse(-1);
   private static int am = (536870912 >>> 59 | 536870912 << ~59 + 1) & -1;
   private static int bk = Integer.reverse(-1879048192);
   private static int ce = 12 >>> 96 | 12 << ~96 + 1;
   private static int bp = (0 >>> 5 | 0 << ~5 + 1) & -1;
   private static long cg = Long.reverse(4947871273982203747L);
   private static long bt = Long.reverse(4179340454199820288L);
   private static int ca = Integer.reverse(0);
   private static int m = Integer.reverse(0);
   private static long ax = Long.reverse(4179340454199820288L);
   private static int d = 0 >>> 185 | 0 << ~185 + 1;
   private static int f = Integer.reverse(0);
   private static int cs = (-1 >>> 233 | -1 << ~233 + 1) & -1;
   private static long aw = Long.reverse(9127211728182024035L);
   private static long az = Long.reverse(9127211728182024035L);

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_015.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.B("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 66), NLoginType_015.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.F("ԳՀԿԂՂԾԹՂՍԼԉՇՋՄՇՍԏࡴࢨࢧࢡࢦࢣࢬࢩࢌԤ", (byte)20, 70) + var1 + NLoginCore_387.D("Ы", (byte)20, 68) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void b(NLoginCore_277 var1, NLoginCore_509 var2) {
      var2.a(NLoginCore_567.A);
      var2.a(NLoginCore_567.z, e);
      if (this.d.L()) {
         NLoginType_010 var3 = this.d.c();
         NLoginCore_199 var4 = var3.a();
         int var10002 = f;
         Object[] var10003 = new Object[g];
         var10003[h] = a(i & j, k);
         var10003[l] = m;
         var10003[n] = a(o, p);
         var10003[q] = BCryptHashProvider.aD();
         var4.c(var1, var10002, var10003);
      }

      ForceRegisterConfig var11 = var2.a();
      if (NLoginCore_363.a.ar() && this.d.b().a() == NLoginCore_419.b && var11.a().m() == null) {
         NLoginCore_299 var12 = (NLoginCore_299)this.d.b();
         NLoginCore_563 var5 = var12.a();
         if (var5 != null) {
            String var6 = var5.a(var1.a());
            if (var6 != null) {
               var11.a().c(var6);
               NLoginCore_291 var10000 = this.d.a();
               NLoginCore_436[] var22 = new NLoginCore_436[r];
               var22[s] = NLoginCore_436.k;
               var10000.a(var11, var22);
            }
         }
      }

      boolean var13 = var11.A();
      if (!var13) {
         if (NLoginCore_329.n.ar() && var11.t()) {
            this.b.b(var11, var1, var2);
            return;
         }

         if (NLoginCore_329.k.ar() && var11.u() && var2.d(NLoginCore_567.e)) {
            this.b.c(var11, var1, var2);
            return;
         }

         String var14 = var1.ac();
         switch (NLoginCore_133.c[this.d.a().a(var11, var14).ordinal()]) {
            case 1:
               this.b.a(var11, var1, var2);
               return;
            case 2:
               var2.a(NLoginCore_567.B, Boolean.valueOf((t != 0)));
         }
      }

      if (var2.a(NLoginCore_567.C)) {
         NLoginCore_370.b(a(u & v, w) + var1.getName() + a(x, y ^ z));
         this.b.a(var11, var1, var2, null, var2.d(NLoginCore_567.C), (ab != 0));
      } else {
         NLoginInterface_017 var15 = var2.a();
         NLoginCore_042 var16 = var15.a();
         if (var16 != null) {
            if (var13) {
               this.b.a(var11, var1, var2, var16.au(), var16.av(), (ac != 0), (ad != 0));
            } else {
               this.b.a(var11, var1, var2, var16.au(), (ae != 0), (af != 0));
            }
         } else {
            int var7 = ag;
            if (var2.d(NLoginCore_567.e)) {
               NLoginInterface_031 var8 = this.d.b().a();
               if (var8 instanceof NLoginCore_418) {
                  NLoginCore_418 var9 = (NLoginCore_418)var8;
                  NLoginCore_118 var10 = var9.a();
                  if (var10 != null) {
                     var7 = (var13 ? var10.b(var1, var2, var11) : var10.a(var1, var2, var11)) ? ai : ah;
                  }

                  var2.a(NLoginCore_567.A, NLoginCore_477.E.r() * aj);
               }
            } else if (BCryptHashProvider.a() == NLoginCore_175.d) {
               NLoginCore_581 var17 = this.d.b();
               User var19 = var17.a(var1);
               if (var19.getClientVersion().isNewerThanOrEquals(ClientVersion.V_1_21_6) && var17.a(var19).isNewerThanOrEquals(ClientVersion.V_1_21_6)) {
                  if (var13) {
                     var17.a().a(var19, var2.d(), null);
                  } else {
                     var17.a().a(var19, var2.d(), NLoginCore_367.a(this.d, var11), null);
                  }

                  var7 = ak;
               }
            }

            if (var7 != 0) {
               this.c(var1, var2, var13);
            }

            if (var15.f()) {
               NLoginCore_466.i.a(var1, var2);
            }

            NLoginCore_033 var18 = this.d.b().a();
            byte[] var20 = var2.d(NLoginCore_567.N);
            if (var18 != null && var20 != null) {
               int var21 = !var11.a().c(a(am, an)) ? ao : ap;
               var18.a(var1, var20, (var21 != 0), ((!var13 ? aq : ar) != 0));
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 92L;
      var1 ^= 1665244592284857352L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(52 + 16),
                     (byte)(11 + 58),
                     (byte)(57 + 26),
                     (byte)(12 + 35),
                     (byte)(41 + 26),
                     (byte)(52 + 14),
                     (byte)(13 + 54),
                     (byte)(12 + 35),
                     80,
                     (byte)(11 + 64),
                     (byte)(35 + 32),
                     (byte)(49 + 34),
                     (byte)(34 + 19),
                     (byte)(22 + 58),
                     (byte)(95 + 2),
                     (byte)(89 + 11),
                     (byte)(67 + 33),
                     105,
                     (byte)(26 + 84),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(45 + 38)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.B("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎҳӧӦӠӥӢӫӨӋ", (byte)72, 66));
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

   public void b(NLoginCore_277 var1, boolean var2) {
      if (var1 != null && var1.R()) {
         if (!var2) {
            this.d.b((as != 0)).a(new StartAsyncLoginTask(() -> {
               if (var1.R()) {
                  NLoginCore_509 var2x = this.d.a().a(var1);
                  if (var2x == null) {
                     NLoginCore_370.c(a(ce & cf, cg) + var1.getName() + a(ch, ci ^ cj));
                  } else if (!var2x.a().d(NLoginCore_077.b)) {
                     try {
                        this.b(var1);
                        boolean var3 = this.d.b().a().a(var1, var2x);
                        var2x.a(var3 ? NLoginCore_077.c : NLoginCore_077.d, NLoginCore_077.b);
                        if (!var3) {
                           this.b(var1, var2x);
                        }

                        LoginMainQueueTask.m(var1);
                     } catch (Throwable var4) {
                        NLoginCore_370.c(a(cl, cm ^ cn) + var1.getName() + a(co, cp), var4);
                        var1.a(a(cr & cs, ct));
                     }
                  }
               }
            }));
         }
      }
   }

   private static void b() {
      c = -4113607188004842114L;
      long var0 = c ^ 1665244592284857352L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(3 + 66),
               (byte)(50 + 33),
               (byte)(13 + 34),
               (byte)(20 + 47),
               (byte)(14 + 52),
               67,
               (byte)(16 + 31),
               80,
               (byte)(30 + 45),
               (byte)(3 + 64),
               (byte)(3 + 80),
               (byte)(43 + 10),
               (byte)(47 + 33),
               (byte)(8 + 89),
               (byte)(36 + 64),
               (byte)(25 + 75),
               (byte)(80 + 25),
               (byte)(80 + 30),
               (byte)(52 + 51)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_451.C("ԔԠӿԩԸԓԐԶӹԻԅԂ", (byte)87, 67);
               ZKM_STR_B[1] = NLoginCore_127.E("ջյՎ\u058bֆ։թգաֈզ՛", (byte)87, 69);
               ZKM_STR_B[2] = NLoginCore_110.A("ƃơƢťƊƗơŻƆƯƮƝƃƝƈƄƦơŪūƻƩƀƁ", (byte)87, 65);
               ZKM_STR_B[3] = NLoginCore_575.D("ԦԒӱԠԀԀӰԑԒӻԕӽԫԷӷԜԵԐՁԠӿԶԍԎ", (byte)87, 68);
               ZKM_STR_B[4] = NLoginCore_427.D("ԎӯԫԣӵԱԐԍԩԩԾӷӸԮӽՁԯԭԏԅԄՆԍԎ", (byte)87, 68);
               ZKM_STR_B[5] = NLoginCore_110.C("ԁԟӯԪԨԬԌԱӭԐԩԗԎԒԺԵԕԢԢՂԣՅՃԩԢՅԵԟՐԆԲԎԣԮԥԕՁՂՈԕՋԸԓՍՉԷԗԡՄԞԻ\u0530Ծթ\u0558ԣԷԨԬՁեխԽաԪԫիՃ\u0530ՃՐԲռկՙՂ", (byte)87, 67);
               ZKM_STR_B[6] = NLoginCore_004.C("ԯԋӭԦԤԓԴԤԎԏԙԂ", (byte)87, 67);
               ZKM_STR_B[7] = NLoginCore_076.F(
                  "ՔՃ՞տագՎւագֈՎֈ\u058cչյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։\u0590գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡\u05c9\u058bׇ֣֦֩־֎וְׇ֕֨גׅך\u05ceֺמ\u05caסֽ֢֝֗־נ׃םץם",
                  (byte)87,
                  70
               );
               ZKM_STR_B[8] = NLoginCore_451.E("՝ֈՎ՛հթ՝ֈէօ֖ճժ֓և։ն\u058cզ՟ձ֏զէ", (byte)87, 69);
               ZKM_STR_B[9] = NLoginCore_453.D("ԎԃԤԡԭԤԆԒԒӴԶӻԑԜԍԱԭӼԑԁԤԠԍԎ", (byte)87, 68);
               ZKM_STR_B[10] = NLoginCore_127.F("՝ֈՎ՛հթ՝ֈէօ֖ճժ֓և։ն\u058cզ՟ձ֏զէ", (byte)87, 70);
               ZKM_STR_B[11] = NLoginCore_387.F("ՌտՖլքէկՊյզժ՛", (byte)87, 70);
               ZKM_STR_B[12] = NLoginCore_173.E("ը\u058bժ֏ՠռՈ՜֒հ։ՎՖմ֘֘էծ֝՟֡տղգպգւպր֘չբ֕գօխզ֧֤֮տ\u058bմւմ֎ֆ\u0590֜֜ջֹ֛։ֆև", (byte)87, 69);
               ZKM_STR_B[13] = NLoginCore_004.A("ƘŻƢƒƋŹūŵŬƎŪƆƎƒƧůſƗƖƅƆƹƜżƉƺưƠƸƀžƘƖƿǆƠƠƄƿſƤǍƏƕ", (byte)87, 65);
               ZKM_STR_B[14] = NLoginCore_173.C(
                  "ԁԟӯԪԨԬԌԱӭԐԩԗԎԒԺԵԕԢԢՂԣՅՃԩԢՅԵԟՐԆԲԎԣԮԥԕՁՂՈԕՋԸԓԛ՜ԟԭ՟՜Ֆԯԣ՟էՄ՛ԹՇԟ\u0557ԼձԱԪեհԴՑոշԴԱ\u0558ՈՖտԾ՚իտվՍ\u0558ՔքևֈՊբց՟՛Վի\u058bկ", (byte)87, 67
               );
               ZKM_STR_B[15] = NLoginCore_427.F("ֈդՆտսլ֍սէըղ՛", (byte)87, 70);
               ZKM_STR_B[16] = NLoginCore_232.F(
                  "ՔՃ՞տագՎւագֈՎֈ\u058cչյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։\u0590գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡\u05c9\u058bׇ֣֦֩־֎וְׇ֕֨גׅך\u05ceֺמ\u05caסֽ֢֝֗־נ׃םץם",
                  (byte)87,
                  70
               );
               ZKM_STR_B[17] = NLoginCore_324.D("ԏԟԖԁԪԄӸԧԩԶӴԂ", (byte)87, 68);
               ZKM_STR_B[18] = NLoginCore_553.A("ƖƇŦťŧŝƊƃƫũƅũžƄƃƇƋƸƒƧƑƃƀƁ", (byte)87, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.B("ťƂƃƟƒƖƣŷƟƜƄƎƳųƟƯƠƊƅƗƊƃƀƁ", (byte)87, 66);
               ZKM_STR_B[1] = NLoginCore_453.B("ŸƏŸųƟƕƅƁŭƉŸƥŬƌƲƶƉƷƖƇŹƓƀƁ", (byte)87, 66);
               ZKM_STR_B[2] = NLoginCore_092.C("ԐԮԯӲԗԤԮԈԓԼԽԳԻӺԠԭԴԡԹՃԿՆԍԎ", (byte)87, 67);
               ZKM_STR_B[3] = NLoginCore_201.D("ԦԒӱԠԀԀӰԑԒӻԘԸԹԔԠԏԕԏԓԆՈԐԍԎ", (byte)87, 68);
               ZKM_STR_B[4] = NLoginCore_397.C("ԎӯԫԣӵԱԐԍԩԩԽԧԚԗԼՁԎԵԝԙԛԠԍԎ", (byte)87, 67);
               ZKM_STR_B[5] = NLoginCore_183.E("՚ոՈփցօե֊Նթւհէի֓֎ծջջ֛ռ֞֜ւջ֞֎ո֩՟\u058bէռևվծ֛֚֡ծ֤֑լ֦֢\u0590հպ֝շ֔։ֱׂ֗ռ\u0590ցօ֚־׆ֺ֖֊֫֞֊և֮ֈ֍ׂ\u058b֛֕", (byte)87, 69);
               ZKM_STR_B[6] = NLoginCore_127.E("սՋՆցՍՍ\u0590ւ՟ՠծ՛", (byte)87, 69);
               ZKM_STR_B[7] = NLoginCore_241.E(
                  "ՔՃ՞տագՎւագֈՎֈ\u058cչյՙլկ՛՜խց՝֥ճ֧ո֙յցթբք֛։\u0590գ֓֞լկֶ֤֥֙մղ֙ֈ֚սְִִַַּׅ֑ׅ֚֝֩֡\u05c9\u058bׇ֣֦֩־֎וְׇ֕֨גׅך\u05ceֺמ\u05caןם\u05cdֶַֻ֗אִ֥ף׆כׂ׃סְױ\u05ca׆ױ\u05ecֻ",
                  (byte)87,
                  69
               );
               ZKM_STR_B[8] = NLoginCore_110.F("՝ֈՎ՛հթ՝ֈէօ֕Փճդ֑\u058bո֜\u058c\u0590ծւ՚֛֗յ՟֦ձ֨֡ո", (byte)87, 70);
               ZKM_STR_B[9] = NLoginCore_521.F("է՜սպֆս՟իիՍ֎ֈշը֓֏֗՛֞։՟չզէ", (byte)87, 70);
               ZKM_STR_B[10] = NLoginCore_092.F("՝ֈՎ՛հթ՝ֈէօ֗ֆւն\u058cմՎպկլղշ֖֑֕՝֒֏ևմՠա", (byte)87, 70);
               ZKM_STR_B[11] = NLoginCore_575.E("ըփնը։՟ըՍՊև\u058c՛", (byte)87, 69);
               ZKM_STR_B[12] = NLoginCore_575.D("ԏԲԑԶԇԣӯԃԹԗ\u0530ӵӽԛԿԿԎԕՄԆՈԦԙԊԡԊԩԡԧԿԠԉԼԊԬԔԍՎՕՋԦԲԚ՞ԚԼԠԡՒԾ\u0530ԜԻՀԭԮ", (byte)87, 68);
               ZKM_STR_B[13] = NLoginCore_138.A("ƘŻƢƒƋŹūŵŬƎŪƆƎƒƧůſƗƖƅƆƹƜżƉƺưƠƸƀžƘƛƂƲƔƨǋƾǈƝǐƠƕ", (byte)87, 65);
               ZKM_STR_B[14] = NLoginCore_453.F(
                  "՚ոՈփցօե֊Նթւհէի֓֎ծջջ֛ռ֞֜ւջ֞֎ո֩՟\u058bէռևվծ֛֚֡ծ֤֑լմֵոֆֵָ֯ֈռָ׀ִ֝֒֠ոְ֕\u05ca֊փ־\u05c9֍֪בא֍֊ֱ֡֯טֳ֗ׄטחֱ֦֭םנֱֳב׃זי֧ׄ־י", (byte)87, 70
               );
               ZKM_STR_B[15] = NLoginCore_223.A("ƛƘŽżƛƀƦƮƈůƚŵ", (byte)87, 65);
               ZKM_STR_B[16] = NLoginCore_453.B(
                  "ŮŝŸƙŻŽŨƜŻŽƢŨƢƦƓƏųƆƉŵŶƇƛŷƿƍǁƒƳƏƛƃżƞƵƣƪŽƭƸƆƉǐƾƳƿƎƌƳƢƴƗƷǎǎǖǑǊǟƴƫǃǟǑƻǣƥƽǃǀǡǘƨǯǡǊƯǂǬǟǴǨǔǸǤƳǤǧƷǿǍǢǸǯƻǞǁǛȇǸǊǊǠǟǩȅǨǕ", (byte)87, 66
               );
               ZKM_STR_B[17] = NLoginCore_530.E("փ\u058b\u058bըօֆևՍհփևՍէծք֎և\u0558֗՛ճչզէ", (byte)87, 69);
               ZKM_STR_B[18] = NLoginCore_575.A("ƖƇŦťŧŝƊƃƫũƄƁūƮƜƂŮƠƧƬƤƹƀƁ", (byte)87, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.F("Չւ՞֏սաւժ֊մղյլճ֓\u0557Օ֜֔ևխյ֛յփրսե֜զ֧ը", (byte)87, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_575.A("ťšƂŴƥƞƜſƘƥƁƦŪƠŭƦƔƷŶƺźƓƀƁ", (byte)87, 65);
         }
      }
   }

   public void c(NLoginCore_277 var1, NLoginCore_509 var2) {
      try {
         synchronized (var2.n) {
            if (var2.a().b(NLoginCore_077.b)) {
               return;
            }

            var2.a(NLoginCore_077.b, NLoginCore_077.a);
            NLoginType_008 var10000 = this.d;
            EventEnum var10001 = EventEnum.LOGIN_REQUEST;
            Object[] var10002 = new Object[at];
            var10002[au] = var1;
            if (var10000.a(var10001, var10002)) {
               this.b.b(var1, var2, var2.a().w());
            } else {
               var2.a(NLoginCore_077.a, NLoginCore_077.b);
            }
         }
      } catch (Throwable var6) {
         NLoginCore_370.c(a(av, aw ^ ax) + var1.getName() + a(ay, az ^ ba), var6);
         var1.a(a(bc, bd ^ be));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean a(NLoginCore_277 var1, NLoginCore_509 var2, ForceRegisterConfig var3, UUID var4, boolean var5, InetSocketAddress var6) {
      if (!NLoginCore_532.c.ar()) {
         return (bf != 0);
      } else {
         NLoginCore_311[] var7 = NLoginCore_311.values();
         int var8 = var7.length;

         for (int var9 = bg; var9 < var8; var9++) {
            NLoginCore_311 var10 = var7[var9];
            if (var10.d(this.d)) {
               if (var10.b(var3) != null) {
                  NLoginInterface_038 var11 = var10.a(this.d);
                  if (var11.aF()) {
                     if (!var1.i(a(bh & bi, bj) + var10.getName()) && !var1.i(a(bk & bl, bm) + var10.getName())) {
                        String var12 = var3.k();
                        if (var12 == null || var12.equals(var6.getAddress().getHostAddress())) {
                           return (bn != 0);
                        }
                     }

                     if (var10.e(var3)) {
                        return (bo != 0);
                     }
                  }
               } else if (var10.aJ()) {
                  if (!var3.t() || var10.aK()) {
                     return (bp != 0);
                  }

                  if (!var3.u() || var10.aL()) {
                     return (bq != 0);
                  }

                  if (!var1.i(a(br, bs ^ bt) + var10.getName())) {
                     return (bu != 0);
                  }
               }
            }
         }

         if (var3.A()) {
            return (bv != 0);
         } else if (NLoginCore_329.n.ar() && var3.t()) {
            return var5;
         } else if (NLoginCore_329.k.ar() && var2.d(NLoginCore_567.e)) {
            return (bw != 0);
         } else {
            switch (NLoginCore_133.c[this.d.a().a(var3, var6.getAddress().getHostAddress()).ordinal()]) {
               case 1:
                  return (bx != 0);
               case 2:
                  var2.a(NLoginCore_567.B, Boolean.valueOf((by != 0)));
                  return (bz != 0);
               default:
                  return (ca != 0);
            }
         }
      }
   }

   public void c(NLoginCore_277 var1, NLoginCore_509 var2, boolean var3) {
      var2.a(NLoginCore_567.x, Boolean.valueOf((a != 0)));
      NLoginCore_150.a(var1, var3 ? NLoginCore_508.b : NLoginCore_508.a);
      NLoginInterface_024 var4 = var2.a();
      if (var3) {
         NLoginCore_150.a(var1, NLoginCore_487.e, var1x -> var4.e(var1x, a(cx, cy)));
      } else {
         NLoginCore_150.a(var1, NLoginCore_487.d, var1x -> var4.e(var1x, a(cu & cv, cw)));
      }
   }

   private void b(NLoginCore_277 var1) {
      var1.o(a(cb, cc ^ cd));
      var1.ad();
   }

   @Generated
   public NLoginType_015(NLoginType_008 var1, NLoginType_005 var2) {
      this.d = var1;
      this.b = var2;
   }
}
