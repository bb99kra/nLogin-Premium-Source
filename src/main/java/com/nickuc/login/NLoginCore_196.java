package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_196 extends NLoginCore_098 {
   private static int it = (80 >>> 65 | 80 << -65) & -1;
   private static long ds = Long.reverse(5188146770730811392L);
   private static int e = (0 >>> 120 | 0 << ~120 + 1) & -1;
   private static int fe = 536870914 >>> 188 | 536870914 << ~188 + 1;
   private static long kz = Long.reverse(5188146770730811392L);
   private static int ea = Integer.reverse(-1);
   private static int je = (0 >>> 95 | 0 << -95) & -1;
   private static long lt = Long.reverse(-8580017017535464934L);
   private static long cp = Long.reverse(5188146770730811392L);
   private static long o;
   private static int ch = -1 >>> 177 | -1 << -177;
   private static int mc = Integer.reverse(1543503872);
   private static int ks = (98566144 >>> 53 | 98566144 << -53) & -1;
   private static int ii = (-1811939328 >>> 186 | -1811939328 << ~186 + 1) & -1;
   private static long gr = Long.reverse(-4544791751411500518L);
   private static int jb = 21 >>> 63 | 21 << ~63 + 1;
   private static int fr = 16777216 >>> 184 | 16777216 << -184;
   private static long cw = Long.reverse(-4544791751411500518L);
   private static int ec = 0 >>> 116 | 0 << -116;
   private static long bm = Long.reverse(-4544791751411500518L);
   private static long cx = Long.reverse(5188146770730811392L);
   private static int iq = Integer.reverse(-469762048);
   private static long ik = Long.reverse(-8580017017535464934L);
   private static int lx = Integer.reverse(469762048);
   private static long bh = Long.reverse(-4544791751411500518L);
   private static long cf = Long.reverse(5188146770730811392L);
   private static long lv = Long.reverse(-4544791751411500518L);
   private static int fz = -536870912 >>> 27 | -536870912 << -27;
   private static int bw = 536870912 >>> 26 | 536870912 << -26;
   private static int dk = 2 >>> 253 | 2 << -253;
   private static int ls = Integer.reverse(-1);
   private static long bs = Long.reverse(5188146770730811392L);
   private static int bf = 33554432 >>> 87 | 33554432 << -87;
   private static long ca = Long.reverse(5188146770730811392L);
   private static long q = Long.reverse(5188146770730811392L);
   private static long lg = Long.reverse(-8580017017535464934L);
   private static int lo = ('퐀' >>> 'j' | 54272 << ~106 + 1) & -1;
   private static long ee = Long.reverse(-4544791751411500518L);
   private static long bo = Long.reverse(5188146770730811392L);
   private static long gk = Long.reverse(5188146770730811392L);
   private static long cu = Long.reverse(5188146770730811392L);
   private static int ll = Integer.reverse(738197504);
   private static int fl = (159744 >>> 12 | 159744 << -12) & -1;
   private static int ix = 0 >>> 66 | 0 << -66;
   private static long id = Long.reverse(-4544791751411500518L);
   private static int dz = 9728 >>> 233 | 9728 << -233;
   private static long dc = Long.reverse(-4544791751411500518L);
   private static int kq = 33554432 >>> 185 | 33554432 << ~185 + 1;
   private static long et = Long.reverse(5188146770730811392L);
   private static int jl = 16777216 >>> 216 | 16777216 << -216;
   private static int kx = 1610612736 >>> 25 | 1610612736 << -25;
   private static int ji = (0 >>> 135 | 0 << -135) & -1;
   private static long lm = Long.reverse(-8580017017535464934L);
   private static int fa = Integer.reverse(0);
   private static final String R = a(NLoginCore_196.md, NLoginCore_196.me ^ NLoginCore_196.mf);
   private static int jo = (2048 >>> 202 | 2048 << -202) & -1;
   private static long ci = Long.reverse(-8580017017535464934L);
   private static int fd = Integer.reverse(1140850688);
   private static int cm = Integer.reverse(-805306368);
   private static int fh = 312 >>> 163 | 312 << -163;
   private static int mb = 232 >>> 226 | 232 << ~226 + 1;
   private static long eb = Long.reverse(-8580017017535464934L);
   private static long eo = Long.reverse(-8580017017535464934L);
   private static long kk = Long.reverse(-8580017017535464934L);
   private static int fs = 4194304 >>> 54 | 4194304 << ~54 + 1;
   private static long hl = Long.reverse(5188146770730811392L);
   private static long ge = Long.reverse(-8580017017535464934L);
   private static long ky = Long.reverse(-4544791751411500518L);
   private static long ig = Long.reverse(5188146770730811392L);
   private static int kr = Integer.reverse(0);
   private static long cz = Long.reverse(-8580017017535464934L);
   private static int kc = (50331648 >>> 151 | 50331648 << -151) & -1;
   private static long hp = Long.reverse(-8580017017535464934L);
   private static long hz = Long.reverse(-8580017017535464934L);
   private static int jp = (512 >>> 9 | 512 << ~9 + 1) & -1;
   private static int li = Integer.reverse(-872415232);
   private static int ho = -1 >>> 136 | -1 << -136;
   private static int ke = 2097152 >>> 21 | 2097152 << ~21 + 1;
   private static long lj = Long.reverse(-4544791751411500518L);
   private static int cv = (416 >>> 197 | 416 << ~197 + 1) & -1;
   private static long gu = Long.reverse(5188146770730811392L);
   private static int gq = Integer.reverse(-134217728);
   private static int bp = -1073741824 >>> 61 | -1073741824 << -61;
   private static long gx = Long.reverse(-4544791751411500518L);
   private static int hg = 8448 >>> 136 | 8448 << -136;
   private static int jt = Integer.reverse(Integer.MIN_VALUE);
   private static long lw = Long.reverse(5188146770730811392L);
   private static long kn = Long.reverse(5188146770730811392L);
   private static long gi = Long.reverse(-4544791751411500518L);
   private static int lb = (-1 >>> 187 | -1 << -187) & -1;
   private static int dh = Integer.reverse(Integer.MIN_VALUE);
   private static long be = Long.reverse(-8580017017535464934L);
   private static int eq = Integer.reverse(-402653184);
   private static long mf = Long.reverse(5188146770730811392L);
   private static long dv = Long.reverse(-4544791751411500518L);
   private static long fq = Long.reverse(-8580017017535464934L);
   private static long jg = Long.reverse(-8580017017535464934L);
   private static int im = 159383552 >>> 22 | 159383552 << -22;
   private static int kl = Integer.reverse(1946157056);
   private static long lq = Long.reverse(5188146770730811392L);
   private static int ij = (-1 >>> 189 | -1 << ~189 + 1) & -1;
   private static long bv = Long.reverse(-8580017017535464934L);
   private static int la = 1644167168 >>> 249 | 1644167168 << ~249 + 1;
   private static int gm = Integer.reverse(2013265920);
   private static long gp = Long.reverse(5188146770730811392L);
   private static int kh = 256 >>> 70 | 256 << -70;
   private static int bd = Integer.reverse(-1073741824);
   private static long lc = Long.reverse(-8580017017535464934L);
   private static int ex = Integer.reverse(-1744830464);
   private static long by = Long.reverse(-4544791751411500518L);
   private static long km = Long.reverse(-4544791751411500518L);
   private static long ha = Long.reverse(5188146770730811392L);
   private static int md = 57 >>> 64 | 57 << -64;
   private static int kf = Integer.reverse(1073741824);
   private static long kb = Long.reverse(-8580017017535464934L);
   private static int ek = Integer.reverse(-1476395008);
   private static int ic = Integer.reverse(603979776);
   private static int da = Integer.reverse(-268435456);
   private static int kv = (393216 >>> 17 | 393216 << ~17 + 1) & -1;
   private static int em = 11534336 >>> 211 | 11534336 << -211;
   private static long es = Long.reverse(-4544791751411500518L);
   private static long dy = Long.reverse(5188146770730811392L);
   private static int ln = Integer.reverse(Integer.MIN_VALUE);
   private static int hm = Integer.reverse(1140850688);
   private static long df = Long.reverse(5188146770730811392L);
   private static int ma = 536870912 >>> 91 | 536870912 << -91;
   private static long iz = Long.reverse(-8580017017535464934L);
   private static long io = Long.reverse(-8580017017535464934L);
   private static int eu = Integer.reverse(402653184);
   private static long jc = Long.reverse(-8580017017535464934L);
   private static int al = 0 >>> 32 | 0 << ~32 + 1;
   private static int lu = Integer.reverse(-335544320);
   private static int cb = (-1879048192 >>> 188 | -1879048192 << -188) & -1;
   private static long cd = Long.reverse(-4544791751411500518L);
   private Boolean b;
   private static long lk = Long.reverse(5188146770730811392L);
   private static int cg = (655360 >>> 80 | 655360 << -80) & -1;
   private static long ew = Long.reverse(5188146770730811392L);
   private static long fy = Long.reverse(5188146770730811392L);
   private static int z = Integer.reverse(-1);
   private static long p = Long.reverse(-4544791751411500518L);
   private static int kd = 0 >>> 195 | 0 << -195;
   private static int kg = Integer.reverse(-1073741824);
   private static int le = Integer.reverse(1275068416);
   private static int ki = Integer.reverse(-1610612736);
   private static int cj = Integer.reverse(1462763520);
   private static long me = Long.reverse(-4544791751411500518L);
   private static int lr = (110592 >>> 235 | 110592 << ~235 + 1) & -1;
   private static long bk = Long.reverse(5188146770730811392L);
   private static long is = Long.reverse(-8580017017535464934L);
   private static long dp = Long.reverse(-4544791751411500518L);
   private static int cr = 196608 >>> 238 | 196608 << -238;
   private static int hy = Integer.reverse(-1006632960);
   private static int bl = Integer.reverse(-1610612736);
   private static long ku = Long.reverse(5188146770730811392L);
   private static int kw = Integer.reverse(536870912);
   private static long cn = Long.reverse(-4544791751411500518L);
   private static int cy = Integer.reverse(1879048192);
   private static long br = Long.reverse(-4544791751411500518L);
   private static long dm = Long.reverse(-8580017017535464934L);
   private static int ja = Integer.reverse(Integer.MIN_VALUE);
   private static long hi = Long.reverse(-4544791751411500518L);
   private static int ao = Integer.reverse(1073741824);
   private static long iv = Long.reverse(-8580017017535464934L);
   private static long ct = Long.reverse(-4544791751411500518L);
   private static long ab = Long.reverse(-8580017017535464934L);
   private static int fp = Integer.reverse(-1);
   private static int ed = (671088640 >>> 249 | 671088640 << -249) & -1;
   private static long el = Long.reverse(-8580017017535464934L);
   private static int fm = Integer.reverse(1476395008);
   private static long fx = Long.reverse(-4544791751411500518L);
   private static int gv = 32 >>> 32 | 32 << ~32 + 1;
   private static int gg = Integer.reverse(-1207959552);
   private static int bu = 28672 >>> 236 | 28672 << -236;
   private static int ld = (32 >>> 4 | 32 << ~4 + 1) & -1;
   private static long at = Long.reverse(-8580017017535464934L);
   private static long ev = Long.reverse(-4544791751411500518L);
   private static int fv = Integer.reverse(-671088640);
   private static long ly = Long.reverse(-4544791751411500518L);
   private static int ka = 2816 >>> 70 | 2816 << -70;
   private static int lh = (524288 >>> 51 | 524288 << ~51 + 1) & -1;
   private static int jf = 11008 >>> 200 | 11008 << -200;
   private static long lp = Long.reverse(-4544791751411500518L);
   private static int ko = Integer.reverse(0);
   private static int dt = 150994944 >>> 87 | 150994944 << -87;
   private static long ef = Long.reverse(5188146770730811392L);
   private Boolean a;
   private static long lz = Long.reverse(5188146770730811392L);
   private static int dn = Integer.reverse(-2013265920);
   private static long ez = Long.reverse(-8580017017535464934L);
   private static int gc = (-1 >>> 95 | -1 << -95) & -1;
   private static int lf = -1 >>> 230 | -1 << -230;
   private static int kj = Integer.reverse(-1275068416);
   private static int iy = (164 >>> 34 | 164 << ~34 + 1) & -1;
   private static long go = Long.reverse(-4544791751411500518L);
   private static int kp = 1073741826 >>> 60 | 1073741826 << ~60 + 1;
   private static String[] ZKM_STR_A = new String[mb];
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_B = new String[mc];
   private static long kt = Long.reverse(-4544791751411500518L);
   private static int in = Integer.reverse(-1);
   private static int fb = Integer.reverse(Integer.MIN_VALUE);

   static {
      b();
   }

   @Override
   protected File b() {
      File var1 = super.b();
      if (!var1.exists()) {
         var1 = new File(this.m.c().getParentFile(), this.a.p().toLowerCase(Locale.ENGLISH));
      }

      return var1;
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      File var2 = new File(this.b(), this.O);
      NLoginCore_549 var3 = NLoginCore_428.a(var2);

      try {
         EnumMap var4 = new EnumMap<>(NLoginCore_020.class);
         NLoginCore_086 var5 = null;
         NLoginCore_020 var6 = null;
         int var8 = al;

         String var7;
         while ((var7 = var3.ah()) != null) {
            String var9 = var7.trim();
            if (var5 != null) {
               if (var9.equals(a(ao, at))) {
                  NLoginCore_402 var10 = var5.a();
                  var4.put(NLoginCore_402.a(var10), var10);
                  var5 = null;
               } else if (var9.startsWith(a(bd, be))) {
                  var5.a(this.f(var9, a(bf, bh ^ bk)));
               } else if (var9.startsWith(a(bl, bm ^ bo))) {
                  var5.b(this.f(var9, a(bp, br ^ bs)));
               } else if (var9.startsWith(a(bu, bv))) {
                  var5.d(this.f(var9, a(bw, by ^ ca)));
               } else if (var9.startsWith(a(cb, cd ^ cf))) {
                  var5.a(NLoginCore_449.a(this.f(var9, a(cg & ch, ci)), cj));
               } else if (var9.startsWith(a(cm, cn ^ cp))) {
                  var5.c(this.f(var9, a(cr, ct ^ cu)));
               } else if (var9.startsWith(a(cv, cw ^ cx))) {
                  var5.e(this.f(var9, a(cy, cz)));
               }
            } else if (var9.equals(a(da, dc ^ df))) {
               var8 = dh;
            } else if (var8 != 0) {
               if (var9.startsWith(a(dk, dm))) {
                  String var20 = this.f(var9, a(dn, dp ^ ds));
                  if ((var6 = NLoginCore_020.a(var20)) == null) {
                     throw new UnsupportedOperationException(a(dt, dv ^ dy) + var20 + a(dz & ea, eb));
                  }

                  var8 = ec;
               } else {
                  NLoginCore_020 var21 = NLoginCore_020.b(var9);
                  if (var21 != null) {
                     var5 = NLoginCore_402.a().a(var21);
                  }
               }
            }
         }

         if (var6 == null) {
            throw new IllegalStateException(a(ed, ee ^ ef));
         }

         NLoginCore_402 var19 = (NLoginCore_402)var4.get(var6);
         if (var19 == null) {
            throw new IllegalStateException(a(ek, el) + var6 + a(em, eo));
         }

         switch (var6) {
            case b:
            case c:
               int var22 = NLoginCore_402.a(var19);
               String var11 = NLoginCore_402.a(var19);
               String var12 = NLoginCore_402.b(var19);
               String var13 = NLoginCore_402.c(var19);
               String var14 = NLoginCore_402.d(var19);
               this.d = (NLoginCore_459)(var6 == NLoginCore_020.b
                  ? NLoginCore_034.b(this.m, NLoginCore_147.a(var11, var22, var12, var13, var14, new Properties()))
                  : NLoginCore_392.b(this.m, NLoginCore_147.a(var11, var22, var12, var13, var14, new Properties())));
               break;
            case d:
               String var15 = NLoginCore_402.e(var19);
               if (var15 == null) {
                  throw new IllegalStateException(a(eq, es ^ et) + var6 + a(eu, ev ^ ew));
               }

               File var16 = new File(this.b(), var15);
               this.d = NLoginCore_586.a(this.m, var16, new Properties());
         }
      } catch (Throwable var18) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var17) {
               var18.addSuppressed(var17);
            }
         }

         throw var18;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   @Override
   protected NLoginCore_219 a(String var1) {
      return null;
   }

   private String f(String var1, String var2) {
      if (var1.length() == var2.length()) {
         return a(ex, ez);
      } else {
         String var3 = var1.substring(var2.length());
         char var4 = var3.charAt(fa);
         char var5 = var3.charAt(var3.length() - fb);
         if (var4 == fd && var5 == fe || var4 == fh && var5 == fl) {
            switch (var3.length()) {
               case 1:
                  return var3;
               case 2:
                  return a(fm & fp, fq);
               default:
                  return var3.substring(fr, var3.length() - fs);
            }
         } else {
            return var3;
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 18L;
      var1 ^= -1060590598806074599L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(2 + 67),
                     (byte)(51 + 32),
                     (byte)(10 + 37),
                     (byte)(12 + 55),
                     (byte)(37 + 29),
                     (byte)(33 + 34),
                     (byte)(8 + 39),
                     (byte)(33 + 47),
                     (byte)(24 + 51),
                     67,
                     (byte)(19 + 64),
                     53,
                     (byte)(38 + 42),
                     (byte)(65 + 32),
                     (byte)(93 + 7),
                     (byte)(79 + 21),
                     (byte)(24 + 81),
                     (byte)(27 + 83),
                     (byte)(33 + 70)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(27 + 41), 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.D("փ\u0590֏Ւ֒֎։֒֝\u058cՙ֛֗֔֗֝՟ࣶ࣭ࣸࣗ࣬ࣉࣱࣹࣳࣷ", (byte)121, 68));
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

   private static void b() {
      o = 6368018941178394371L;
      long var0 = o ^ -1060590598806074599L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(36 + 33),
               (byte)(46 + 37),
               (byte)(22 + 25),
               (byte)(15 + 52),
               (byte)(39 + 27),
               (byte)(8 + 59),
               (byte)(19 + 28),
               (byte)(53 + 27),
               (byte)(37 + 38),
               (byte)(12 + 55),
               (byte)(65 + 18),
               (byte)(41 + 12),
               (byte)(37 + 43),
               (byte)(76 + 21),
               (byte)(52 + 48),
               (byte)(61 + 39),
               (byte)(7 + 98),
               (byte)(43 + 67),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_027.D("ՑըԹ՛ԺԶչծլլ\u0558՚ՖջսՇֆՔ՞\u058bցվՕՖ", (byte)111, 68);
               ZKM_STR_B[1] = NLoginCore_433.A("ǍǖƖƹǅƮƒƔƲǑƞƯǛƟƾƼƟƵƴơǤǅƞǡǧǮƨǤǃǛǳǄ", (byte)111, 65);
               ZKM_STR_B[2] = NLoginCore_397.B("ƫǎƱƴƻǚǆưƼƜƸƥ", (byte)111, 66);
               ZKM_STR_B[3] = NLoginCore_559.F("՟֑֝սևն֢ր֦֦֤֪֫\u058b֡֍֏ք֢֟ֈַվտ", (byte)111, 70);
               ZKM_STR_B[4] = NLoginCore_427.A("ƑǃǏƯƹƨǔƲǝǘǘǖǜƽǓƿǁƶǑǔƺǩưƱ", (byte)111, 65);
               ZKM_STR_B[5] = NLoginCore_138.B("ǗǖǙǘƣƴƲǆƻƯƸƥ", (byte)111, 66);
               ZKM_STR_B[6] = NLoginCore_427.D("ռջվսՈՙ\u0557իՠՔ՝Պ", (byte)111, 68);
               ZKM_STR_B[7] = NLoginCore_397.F("խ֤֚֔ևՠ֝փ֛֢ւ֣\u058c\u058c֣֏քֆձ֪կ֧վտ", (byte)111, 70);
               ZKM_STR_B[8] = NLoginCore_427.C("Մձջի՞Էմ՚ղչՙպգգպզ՛՝ՈցՆվՕՖ", (byte)111, 67);
               ZKM_STR_B[9] = NLoginCore_004.F("բ֛֔վոյն֚ռ֤֙ճ", (byte)111, 70);
               ZKM_STR_B[10] = NLoginCore_092.F("բ֛֔վոյն֚ռ֤֙ճ", (byte)111, 70);
               ZKM_STR_B[11] = NLoginCore_127.F("֛֠ջֈ֞֙ճո֟վթճ", (byte)111, 70);
               ZKM_STR_B[12] = NLoginCore_384.B("ǒǍƭƺǐǋƥƪǑưƛƥ", (byte)111, 66);
               ZKM_STR_B[13] = NLoginCore_232.B("ƪǃƤƬƮǑǌǖƵƼƗƥ", (byte)111, 66);
               ZKM_STR_B[14] = NLoginCore_324.D("ՏըՉՑՓնձջ՚աԼՊ", (byte)111, 68);
               ZKM_STR_B[15] = NLoginCore_446.C("ԶըմՔ՞Սչ\u0557ւսռԽ\u0558քՕ՛վբւըՈըՕՖ", (byte)111, 67);
               ZKM_STR_B[16] = NLoginCore_092.D("եխսնխիխղդ՝աՊ", (byte)111, 68);
               ZKM_STR_B[17] = NLoginCore_091.A("ǀǈǘǑǈǆǈǍƿƸƼƥ", (byte)111, 65);
               ZKM_STR_B[18] = NLoginCore_324.D("կՈՍՙ՜ՈԷճիռշՑդօփՓչՙՌ֊ւչՙ֑ցվգշՐ։պ֏\u0557֑֕՝վձՓչ՛շՠժ", (byte)111, 68);
               ZKM_STR_B[19] = NLoginCore_110.B("ƵƦǑƺƥƪƘƻƴƫƼƥ", (byte)111, 66);
               ZKM_STR_B[20] = NLoginCore_004.D("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ\u058cն֍յչց\u058c֙֏պ֞֗շկ\u0558պշծյ֘֩ց֤ժ֧ևզ֧վ֏հ֥֡իֲַփ֪պմֵַָ֍֬֜չׁսք֊", (byte)111, 68);
               ZKM_STR_B[21] = NLoginCore_027.D("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ\u058cն֍յչց\u058c֎\u0558։լ֝թ֢ի֒՝՛՞ՙ։ւպ֞֬֝ծըֈյն", (byte)111, 68);
               ZKM_STR_B[22] = NLoginCore_127.D("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑\u058cկ֖֒Տիֆ֓֝խ՚Օ։մփ\u058bօդժ", (byte)111, 68);
               ZKM_STR_B[23] = NLoginCore_446.D("ՎԵնԼջտՊչԿոՅյՆսվիբ֊զ֏ը\u058b֏ՑՐ֕ըՔ\u0590Ր\u0557ճչ֏\u058cֆ֍՟֘լ֗շ֓եփջևվ։֙֨֏֛֮յն", (byte)111, 68);
               ZKM_STR_B[24] = NLoginCore_027.C("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑\u058cկ֖֒Տիֆ֓֝խ՚Օ։մփ\u058bօդժ", (byte)111, 67);
               ZKM_STR_B[25] = NLoginCore_397.A("ǒǑǐƋƸǅƲƫǞƱǒƥ", (byte)111, 65);
               ZKM_STR_B[26] = NLoginCore_241.A("ǒǑǐƋƸǅƲƫǞƱǒƥ", (byte)111, 65);
               ZKM_STR_B[27] = NLoginCore_575.F("ղչզդ֠ըր֕ջյթճ", (byte)111, 70);
               ZKM_STR_B[28] = NLoginCore_575.F("֙ո֞՝֚աճյ֖֬֠ճ", (byte)111, 70);
               ZKM_STR_B[29] = NLoginCore_232.D("ՍմՙխՍժծՙՃճ\u0557տՒշ֊դ֊ջվՖՙ\u0558ՕՖ", (byte)111, 68);
               ZKM_STR_B[30] = NLoginCore_387.A("ƭǕǎƺƐǙǏƺƩƹƬƥ", (byte)111, 65);
               ZKM_STR_B[31] = NLoginCore_091.B("ƠưǅǈƷǇƒƭưƗƾƞǟǑƾƥƴƸǃƵƷǙưƱ", (byte)111, 66);
               ZKM_STR_B[32] = NLoginCore_027.E("֣ձ֏֜և֕ք֤ոդխվ֬֏֚։ֲ֨֔յ֊֧վտ", (byte)111, 69);
               ZKM_STR_B[33] = NLoginCore_559.F("ղչզդ֠ըր֕ջյթճ", (byte)111, 70);
               ZKM_STR_B[34] = NLoginCore_453.E("֙ո֞՝֚աճյ֖֬֠ճ", (byte)111, 69);
               ZKM_STR_B[35] = NLoginCore_232.B("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 66);
               ZKM_STR_B[36] = NLoginCore_004.E("֑֍՜֟\u0590֧ո֣֥֤֡ճ", (byte)111, 69);
               ZKM_STR_B[37] = NLoginCore_433.F("֑֍՜֟\u0590֧ո֣֥֤֡ճ", (byte)111, 70);
               ZKM_STR_B[38] = NLoginCore_387.A("ǓƒƲǄǆǊǏǝǜǏƨƥ", (byte)111, 65);
               ZKM_STR_B[39] = NLoginCore_397.F("֑֍՜֟\u0590֧ո֣֥֤֡ճ", (byte)111, 70);
               ZKM_STR_B[40] = NLoginCore_553.A("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 65);
               ZKM_STR_B[41] = NLoginCore_387.A("ǃƿƎǑǂǙƪǕǗǓǖƥ", (byte)111, 65);
               ZKM_STR_B[42] = NLoginCore_223.D("ոԷ\u0557թիկմւցմՍՊ", (byte)111, 68);
               ZKM_STR_B[43] = NLoginCore_141.C("Վճ\u0558նՌջԿրոՍշՊ", (byte)111, 67);
               ZKM_STR_B[44] = NLoginCore_138.F("֜՛ր֞֟ՠ֥ջ֤֨դփ֞օհ֊ֆ֣֡փ\u058c֫ճ֮֎־ֳ֛շ֎տ֟֗֎֢֤֒ևֶֈ׀\u058bֽ֦֚֊֛\u05cf֑֡֒\u05ccזֱ֞֟", (byte)111, 70);
               ZKM_STR_B[45] = NLoginCore_521.F("֤խ֕մ֗ձ֛ժ֕֬փ\u058bչ֭րժձճ֎ֶ֓չ֖֬մ\u058b֊֚֗ռְָ֡փ֏֑ւ֤֫֓֔տׇ\u05ccֱ։ֽ֭֬׆֤\u05caָׇ֞֟", (byte)111, 70);
               ZKM_STR_B[46] = NLoginCore_451.D("ջՕԽՕնրկԿԵռՄՊ", (byte)111, 68);
               ZKM_STR_B[47] = NLoginCore_173.C("ոԷ\u0557թիկմւցմՍՊ", (byte)111, 67);
               ZKM_STR_B[48] = NLoginCore_451.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
               ZKM_STR_B[49] = NLoginCore_451.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
               ZKM_STR_B[50] = NLoginCore_092.C("ըդԳնէվՏպռոջՊ", (byte)111, 67);
               ZKM_STR_B[51] = NLoginCore_201.F("֑֍՜֟\u0590֧ո֣֥֤֡ճ", (byte)111, 70);
               ZKM_STR_B[52] = NLoginCore_559.F("րվ֙֟վքցվյ֞ֆճ", (byte)111, 70);
               ZKM_STR_B[53] = NLoginCore_559.D("ջՄլՋծՈղՁլփ՚բՐք\u0557ՁՈՊե֍ժՐխփՋբաձծՓ֏ևո՚զըՙջւժիՖ֣֞ֈՠփ֔ք֝ջ֡֏֞յն", (byte)111, 68);
               ZKM_STR_B[54] = NLoginCore_027.E("֤վզվ֟֩֘ը՞֥խճ", (byte)111, 69);
               ZKM_STR_B[55] = NLoginCore_427.F("֚ՠշ֤֟վգ֧֦ք֘ճ", (byte)111, 70);
               ZKM_STR_B[56] = NLoginCore_076.F("վ֝՟֤ցոե֨֜։ցլֱ֫֯եծյտ֫ց֑վտ", (byte)111, 70);
               ZKM_STR_B[57] = NLoginCore_092.C("ՑըԹ՛ԺԶչծլլ\u0558՚ՖջսՇֆՔ՞\u058bցվՕՖ", (byte)111, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_138.F("պ֑բքգ՟֢֗֕֕վ֍֪֩֞֨վհַ֕֒ցվտ", (byte)111, 70);
               ZKM_STR_B[1] = NLoginCore_433.C("ղջԻ՞ժՓԷԹ\u0557նՃՔրՄգաՄ՚ՙՆ։թՠաֆա։ցբ֏֏֒", (byte)111, 67);
               ZKM_STR_B[2] = NLoginCore_387.D("\u0557ՍԽՏըԽլգբլՀՊ", (byte)111, 68);
               ZKM_STR_B[3] = NLoginCore_530.D("ԶըմՔ՞Սչ\u0557ւսռջԾՇւրՉտիւջըՕՖ", (byte)111, 68);
               ZKM_STR_B[4] = NLoginCore_530.B("ƑǃǏƯƹƨǔƲǝǘǘǔǋǓƣǞǝưǧƠƠǙưƱ", (byte)111, 66);
               ZKM_STR_B[5] = NLoginCore_138.E("֥֚֓ռ֥ջճ֗֙յիֈվ֏իծ֞\u058bհֳַ֒վտ", (byte)111, 69);
               ZKM_STR_B[6] = NLoginCore_397.C("ԵժՙլԶմՊՐիջկՊ", (byte)111, 67);
               ZKM_STR_B[7] = NLoginCore_397.B("ƟǌǖǆƹƒǏƵǍǔƴǍƳƞƵǐƯǅǓǟƲǩưƱ", (byte)111, 66);
               ZKM_STR_B[8] = NLoginCore_092.F("խ֤֚֔ևՠ֝փ֛֢ք֝չ֥֝֯տ։մկղ֧վտ", (byte)111, 70);
               ZKM_STR_B[9] = NLoginCore_575.A("ƑƦǖǋƧǋǗǏǎǕǗƷƹƫƱƝǇƺƥǢƢǩưƱ", (byte)111, 65);
               ZKM_STR_B[10] = NLoginCore_223.A("ǈƭǊƣǚƫǅǑǋƛƩƫǍƾǓǤǣƲƾǩǫǩưƱ", (byte)111, 65);
               ZKM_STR_B[11] = NLoginCore_091.E("յ֥գ֟ձ֥֡ցէ֣֟ս֝֡պֳսֱֳֵַ֭վտ", (byte)111, 69);
               ZKM_STR_B[12] = NLoginCore_530.A("ǁǔƲƭƭǓǉǌǙǠƸƥ", (byte)111, 65);
               ZKM_STR_B[13] = NLoginCore_076.D("ԷղՏհՇՉ՟\u0558դսՙԼՙտ՛դճքՕաՇըՕՖ", (byte)111, 68);
               ZKM_STR_B[14] = NLoginCore_384.A("ƴƷƫǖǂǉƭǎƖǌǎƥ", (byte)111, 65);
               ZKM_STR_B[15] = NLoginCore_451.A("ƑǃǏƯƹƨǔƲǝǘǙơƷǃǢƽƜǐƺǆƠƳưƱ", (byte)111, 65);
               ZKM_STR_B[16] = NLoginCore_027.F("ւ֥֑֢֪֜֝֘յ֚֘ճ", (byte)111, 70);
               ZKM_STR_B[17] = NLoginCore_553.F("խ\u0557֝ջ֩թտւ֙֎֭֗֩ֆ֥հր֧֪ւ։֧վտ", (byte)111, 70);
               ZKM_STR_B[18] = NLoginCore_173.D("կՈՍՙ՜ՈԷճիռշՑդօփՓչՙՌ֊ւչՙ֑ցվգշՐ։պ֏\u058cճհպ\u0557֕֗֘ռ֎֟ժ", (byte)111, 68);
               ZKM_STR_B[19] = NLoginCore_127.D("նՕջԷ՝ԲիփՌչկՊ", (byte)111, 68);
               ZKM_STR_B[20] = NLoginCore_553.C("ՎԵնԼջտՊչԿոԻյյ՟ժօՈՉՙշՇծՌէջ\u058cն֍յչց\u058c֙֏պ֞֗շկ\u0558պշծյ֘֩ց֤ժ֧ևզ֧վ֏հ֥֡իֲַփ֪պֲ֪֥֫֞־\u058b֒տպ֡֊", (byte)111, 67);
               ZKM_STR_B[21] = NLoginCore_387.F("շ՞֟ե֤֨ճ֢ը֡դ֞֞ֈ֮֓ձղւ֠հ֗յ\u0590ֵֵֶַ֤֢֪֟֞ցֲ֕׆֒\u05cbֻ֔ֆ֎ֈ֦֚֚֏\u05c9ׄ׆֣\u05caךוֱֹ֚֓גֱ\u05cfַ\u05cb", (byte)111, 70);
               ZKM_STR_B[22] = NLoginCore_091.B("ǋƮƖƪǊƸƷƚƶƨǎƮǡƷǁǙǝǝƦǗǞƶǙǨǬǧǊǱǭƪǆǡǀǶǖǅǱǘǕǅǘǴǔǅ", (byte)111, 66);
               ZKM_STR_B[23] = NLoginCore_092.B("ƩƐǑƗǖǚƥǔƚǓƠǐơǘǙǆƽǥǁǪǃǦǪƬƫǰǃƯǫƫƲǎǔǪǧǡǨƺǳǇǲǒǮǽǮǹǝƷǔƽǩǻȊǣǐǑ", (byte)111, 66);
               ZKM_STR_B[24] = NLoginCore_453.D("հՓԻՏկ՝՜Կ՛ՍճՓֆ՜զվււՋռփ՛վ֍֑\u058cկ֖֒Տիֆ֜ղինըի֊ամ֏դժ", (byte)111, 68);
               ZKM_STR_B[25] = NLoginCore_091.C("ՍՅՇոջռ\u0557ն՟կՀՊ", (byte)111, 67);
               ZKM_STR_B[26] = NLoginCore_076.B("ƦƫǆƲǗǃƬǕǞƝƗƥ", (byte)111, 66);
               ZKM_STR_B[27] = NLoginCore_027.F("քծ֞և֓վ֝֊֞դ֜֗քևտե֖֦֩ն֠ցվտ", (byte)111, 70);
               ZKM_STR_B[28] = NLoginCore_232.A("ƶǑǋƏǘǓǌƫƛǟǞƥ", (byte)111, 65);
               ZKM_STR_B[29] = NLoginCore_553.B("ƨǏƴǈƨǅǉƴƞǎƲǟƫƬƱǚǑǚǧǗơǫƢƿǇƮƦǣǮǤǃƱ", (byte)111, 66);
               ZKM_STR_B[30] = NLoginCore_223.E("վծ֙ջ֦֒ֈքէիֆճ", (byte)111, 69);
               ZKM_STR_B[31] = NLoginCore_521.D("ՅՕժխ՜լԷՒՕԼաՏՂԺՅն\u0558ՙ՛դ՛թՙՠ֓աՓ֖\u058b֗֕ջ", (byte)111, 68);
               ZKM_STR_B[32] = NLoginCore_091.E("֣ձ֏֜և֕ք֤ոդՠ֥֡ր֍֦֑֥֠֯֒֊ճ֣֏ֲպֹ\u058bִֿ֛", (byte)111, 69);
               ZKM_STR_B[33] = NLoginCore_451.D("ԶծՋժըՒցկջ՛տՊ", (byte)111, 68);
               ZKM_STR_B[34] = NLoginCore_433.A("ƦƱƸƳƦƬƨǗƯƯƞƜƲƫƾǤƷƠƲǓǕǩưƱ", (byte)111, 65);
               ZKM_STR_B[35] = NLoginCore_092.D("ԻՆԶվՊպԿՍՙջջՊ", (byte)111, 68);
               ZKM_STR_B[36] = NLoginCore_471.F("֠֜՝֙պ֊ճգց֕֘ճ", (byte)111, 70);
               ZKM_STR_B[37] = NLoginCore_138.E("յ֦֓֓եՠ֣֓գոֆճ", (byte)111, 69);
               ZKM_STR_B[38] = NLoginCore_201.D("\u0557ճլձՉԺԽԼգԶՀՊ", (byte)111, 68);
               ZKM_STR_B[39] = NLoginCore_110.E("֢֗֙֝ղղՠ֡ռնթճ", (byte)111, 69);
               ZKM_STR_B[40] = NLoginCore_201.B("ƍƨǉƥǇƣƴƱǊƿƴƥ", (byte)111, 66);
               ZKM_STR_B[41] = NLoginCore_183.D("լՅզ՞խվչՑՂ՛աՊ", (byte)111, 68);
               ZKM_STR_B[42] = NLoginCore_027.B("ǊƑƠƺƮǒưƷƖǌƴƥ", (byte)111, 66);
               ZKM_STR_B[43] = NLoginCore_110.D("յճՖէԽըղՙԿԻկՊ", (byte)111, 68);
               ZKM_STR_B[44] = NLoginCore_575.A("ǎƍƲǐǑƒǗƭǖǚƖƵǐƷƢƼƸǓǕƵƾǝƥǠǀǰǍǥƩǀƱǑǉǀǔǖǄƹǨƺǲƽǯǢǝǭǚǜǽǅǿǪǞǓǐǑ", (byte)111, 65);
               ZKM_STR_B[45] = NLoginCore_521.A("ǖƟǇƦǉƣǍƜǇǞƵƽƫǟƲƜƣƥǀǨǅƫǈǞƦƽƼǌǉƮǪǢǓƵǁǃƴǖǝǅǆƱǸƿƹǶǮȆǰȃȃƻǵǣǐǑ", (byte)111, 65);
               ZKM_STR_B[46] = NLoginCore_091.A("ƥưǂǄƕƨǋƚƻƜƗƥ", (byte)111, 65);
               ZKM_STR_B[47] = NLoginCore_471.A("ƠǓƊƒǅǗƦǊǗƖǀƥ", (byte)111, 65);
               ZKM_STR_B[48] = NLoginCore_453.C("ԭԵՅԺպ՟ծՙյխԼՊ", (byte)111, 67);
               ZKM_STR_B[49] = NLoginCore_232.D("հՌթՆճ՝ճնճտՀՊ", (byte)111, 68);
               ZKM_STR_B[50] = NLoginCore_453.E("ՠխհ֥֙֓֡տր֡֠ճ", (byte)111, 69);
               ZKM_STR_B[51] = NLoginCore_451.B("ƿǆǃƮƲǘǙƬǛƜƼƥ", (byte)111, 66);
               ZKM_STR_B[52] = NLoginCore_004.E("֤֥֢֤֟֔ֆև֡ֈե֎ְ֞֓ջ֍֎\u058cֵ֧֙վտ", (byte)111, 69);
               ZKM_STR_B[53] = NLoginCore_004.E("֤խ֕մ֗ձ֛ժ֕֬փ\u058bչ֭րժձճ֎ֶ֓չ֖֬մ\u058b֊֚֗ռְָ֡փ֏֑ւ֤֫֓֔տׅ֍־֚֫֓\u05c9ֿ\u05cf֠׀ח֞֟", (byte)111, 69);
               ZKM_STR_B[54] = NLoginCore_324.E("ծփ֙հֆշ֠գժ֜ֆճ", (byte)111, 69);
               ZKM_STR_B[55] = NLoginCore_433.A("ƶƫǒƭǅƔƻǙǈƑƹƻǙǜǢǙƯƹǒƹǉǙưƱ", (byte)111, 65);
               ZKM_STR_B[56] = NLoginCore_223.F("վ֝՟֤ցոե֨֜։տ֡տ֤֙֫ցտ֍ֶ֧֮վտ", (byte)111, 70);
               ZKM_STR_B[57] = NLoginCore_397.E("պ֑բքգ՟֢֗֕֕տիլ֣֤։֠տ։ְ֯ցվտ", (byte)111, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_141.D("շՋԯ՛նՠբ՟իՎջբգֈձ՝եՅևծզըՕՖ", (byte)111, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.A("ǂǉƫǋǅƳǇǅƛƹƨƥ", (byte)111, 65);
         }
      }
   }

   @Override
   protected void b(ResultSet var1) {
      if (this.a == null) {
         this.a = NLoginCore_323.a(var1, a(fv, fx ^ fy));
      }

      if (this.b == null) {
         this.b = NLoginCore_323.a(var1, a(fz & gc, ge));
      }

      this.r = var1.getString(a(gg, gi ^ gk));
      if (this.r != null) {
         UUID var2 = NLoginCore_432.c(var1.getString(a(gm, go ^ gp)));
         UUID var3 = NLoginCore_432.c(var1.getString(a(gq, gr ^ gu)));
         String var4 = var1.getString(a(gv, gx ^ ha));
         String var5;
         if (var4 == null || var4.isEmpty()) {
            var5 = null;
         } else if (this.a) {
            String var7 = var1.getString(a(hg, hi ^ hl));
            NLoginCore_214 var6;
            if (this.b) {
               var6 = NLoginCore_214.b(var1.getString(a(hm & ho, hp)));
            } else {
               switch (var4.length()) {
                  case 64:
                     var6 = NLoginCore_214.a;
                     break;
                  case 128:
                     var6 = NLoginCore_214.b;
                     break;
                  default:
                     var6 = null;
               }
            }

            if (var6 == null) {
               this.e(this.r, var4, null);
               return;
            }

            switch (var6) {
               case a:
               case b:
                  var5 = a(hy, hz) + NLoginCore_214.a(var6) + a(ic, id ^ ig) + var4 + a(ii & ij, ik) + var7;
                  break;
               case c:
               case d:
                  String[] var19 = var4.split(a(im & in, io));
                  var5 = a(iq, is) + NLoginCore_214.a(var6) + a(it, iv) + var19[ix] + a(iy, iz) + var7 + var19[ja];
                  break;
               case e:
                  String[] var8 = var4.split(a(jb, jc));
                  String[] var9 = var8[je].split(a(jf, jg));
                  int var10 = Integer.parseInt(var9[ji]);
                  int var11 = Integer.parseInt(var9[jl]);
                  int var12 = Integer.parseInt(var9[jo]);
                  int var13 = jp;
                  byte[] var14 = Base64.getDecoder().decode(var7);
                  byte[] var15 = Base64.getDecoder().decode(var8[jt]);
                  String var10000 = a(ka, kb);
                  Object[] var10001 = new Object[kc];
                  var10001[kd] = var10;
                  var10001[ke] = var12;
                  var10001[kf] = var11;
                  var10001[kg] = var13;
                  var10001[kh] = Base64.getEncoder().withoutPadding().encodeToString(var14);
                  var10001[ki] = Base64.getEncoder().withoutPadding().encodeToString(var15);
                  var5 = String.format(var10000, var10001);
                  break;
               default:
                  throw new UnsupportedOperationException(a(kj, kk) + var6 + a(kl, km ^ kn));
            }
         } else {
            int var20 = var4.charAt(ko) == kp ? kq : kr;
            String[] var22 = var4.split(a(ks, kt ^ ku));
            if (var22.length != kv && var22.length != kw) {
               this.e(this.r, var4, null);
               return;
            }

            NLoginCore_214 var16 = NLoginCore_214.b(var22[var20].toUpperCase(Locale.ENGLISH));
            if (var16 == null) {
               this.e(this.r, var4, null);
               return;
            }

            switch (var16) {
               case a:
               case b:
                  var5 = a(kx, ky ^ kz) + NLoginCore_214.a(var16) + a(la & lb, lc) + var22[var20 + ld] + a(le & lf, lg) + var22[var20 + lh];
                  break;
               case c:
               case d:
                  var5 = a(li, lj ^ lk) + NLoginCore_214.a(var16) + var4.substring(a(ll, lm).length() + var20 + ln);
                  break;
               default:
                  throw new UnsupportedOperationException(a(lo, lp ^ lq) + var16 + a(lr & ls, lt));
            }
         }

         Timestamp var17 = var1.getTimestamp(a(lu, lv ^ lw));
         Timestamp var18 = var1.getTimestamp(a(lx, ly ^ lz));
         Consumer var21 = var2x -> var2x.a(var17 != null ? var17.getTime() : null, var18 != null ? var18.getTime() : null);
         if (var3 != null && var3.version() != ma) {
            var3 = null;
         }

         if (var3 != null) {
            this.a(this.r, var5, null, var2, var3, var21);
         } else {
            this.a(this.r, var5, null, var2, var21);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_196.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginCore_196.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_451.A("ŰŽżĿſŻŶſƊŹņƄƈƁƄƊŌӣӚӥӄәҶӠӦӤӞŢ", (byte)71, 65) + var1 + NLoginCore_232.C("ӄ", (byte)71, 67) + var2.toString(), var4);
      }
   }

   public NLoginCore_196(NLoginType_008 var1) {
      super(var1, NLoginCore_479.l, a(e, p ^ q), a(y & z, ab));
   }
}
