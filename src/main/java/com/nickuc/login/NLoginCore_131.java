package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class NLoginCore_131 extends NLoginCore_353 {
   private static long ad = Long.reverse(-7605888784154954279L);
   private static long ds = Long.reverse(6805630023430632921L);
   private static int fe = Integer.reverse(-738197504);
   private static int fo = Integer.reverse(0);
   private static int ai = (32 >>> 197 | 32 << -197) & -1;
   private static long av = Long.reverse(-4035225266123964416L);
   private static int dv = Integer.reverse(1140850688);
   private static int cz = Integer.reverse(939524096);
   private static int fl = Integer.reverse(-1275068416);
   private static long ey = Long.reverse(-4035225266123964416L);
   private static long dw = Long.reverse(6805630023430632921L);
   private static long dp = Long.reverse(-4035225266123964416L);
   private static long cx = Long.reverse(-4035225266123964416L);
   private static int fr = Integer.reverse(0);
   private static long cw = Long.reverse(6805630023430632921L);
   private static int dc = 0 >>> 108 | 0 << -108;
   private static long au = Long.reverse(6805630023430632921L);
   private static long dh = Long.reverse(-7605888784154954279L);
   private static int l = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255;
   private static long eu = Long.reverse(-4035225266123964416L);
   private static long cj = Long.reverse(6805630023430632921L);
   private static long bz = Long.reverse(6805630023430632921L);
   private static int ar = (-1 >>> 152 | -1 << -152) & -1;
   private static int bu = Integer.reverse(0);
   private static long g = Long.reverse(-7605888784154954279L);
   private static int dm = 0 >>> 234 | 0 << -234;
   private static long ax = Long.reverse(6805630023430632921L);
   private static String[] ZKM_STR_A = new String[NLoginCore_131.fv];
   private static long p = Long.reverse(-7605888784154954279L);
   private static int dy = (0 >>> 63 | 0 << -63) & -1;
   private static int fh = Integer.reverse(0);
   private static long bb = Long.reverse(-4035225266123964416L);
   private static int at = Integer.reverse(-805306368);
   private static long v = Long.reverse(-4035225266123964416L);
   private static int cl = Integer.reverse(402653184);
   private static long bn = Long.reverse(6805630023430632921L);
   private static long ef = Long.reverse(-4035225266123964416L);
   private static long s = Long.reverse(-4035225266123964416L);
   private static long fm = Long.reverse(6805630023430632921L);
   private static int dz = Integer.reverse(-1006632960);
   private static int fi = Integer.reverse(872415232);
   private static int cf = Integer.reverse(1744830464);
   private static long em = Long.reverse(6805630023430632921L);
   private static int ew = Integer.reverse(-1811939328);
   private static int dn = Integer.reverse(67108864);
   private static int df = 0 >>> 146 | 0 << -146;
   private static int co = (0 >>> 224 | 0 << ~224 + 1) & -1;
   private static int eh = 4849664 >>> 17 | 4849664 << ~17 + 1;
   private static long bx = Long.reverse(-7605888784154954279L);
   private static int m = (0 >>> 201 | 0 << ~201 + 1) & -1;
   private static int cs = Integer.reverse(1476395008);
   private static int eg = Integer.reverse(0);
   private static int ap = (0 >>> 171 | 0 << ~171 + 1) & -1;
   private static int ci = Integer.reverse(-402653184);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = 0 >>> 195 | 0 << -195;
   private static int by = Integer.reverse(671088640);
   private static long da = Long.reverse(6805630023430632921L);
   private static int fk = Integer.reverse(0);
   private static long ej = Long.reverse(-4035225266123964416L);
   private static long ay = Long.reverse(-4035225266123964416L);
   private static long cq = Long.reverse(-7605888784154954279L);
   private static long bi = Long.reverse(-4035225266123964416L);
   private static int dj = Integer.reverse(-134217728);
   private static long e = Long.reverse(-4035225266123964416L);
   private static long ch = Long.reverse(-4035225266123964416L);
   private static long fj = Long.reverse(-7605888784154954279L);
   private static int f = (262144 >>> 242 | 262144 << -242) & -1;
   private static long ee = Long.reverse(6805630023430632921L);
   private static int bg = Integer.reverse(-268435456);
   private static int aw = Integer.reverse(805306368);
   private static long cd = Long.reverse(6805630023430632921L);
   private static int eo = Integer.reverse(0);
   private static long cm = Long.reverse(6805630023430632921L);
   private static int t = Integer.reverse(536870912);
   private static long as = Long.reverse(-7605888784154954279L);
   private static long eq = Long.reverse(-7605888784154954279L);
   private static long db = Long.reverse(-4035225266123964416L);
   private static int w = (1342177280 >>> 188 | 1342177280 << ~188 + 1) & -1;
   private static int h = 0 >>> 218 | 0 << -218;
   private static int fu = Integer.reverse(0);
   private static long ft = Long.reverse(-7605888784154954279L);
   private static long br = Long.reverse(-4035225266123964416L);
   private static int o = Integer.reverse(-1);
   private static int bp = Integer.reverse(1207959552);
   private static long r = Long.reverse(6805630023430632921L);
   private static int cb = 0 >>> 23 | 0 << ~23 + 1;
   private static long d = Long.reverse(6805630023430632921L);
   private static int ab = 3 >>> 63 | 3 << ~63 + 1;
   private static long ag = Long.reverse(6805630023430632921L);
   private static long ah = Long.reverse(-4035225266123964416L);
   private static long fc = Long.reverse(-7605888784154954279L);
   private static long ex = Long.reverse(6805630023430632921L);
   private static int ea = -1 >>> 36 | -1 << ~36 + 1;
   private static int bj = (0 >>> 209 | 0 << ~209 + 1) & -1;
   private static long fq = Long.reverse(-7605888784154954279L);
   private static int cp = Integer.reverse(-1744830464);
   private static long ei = Long.reverse(6805630023430632921L);
   private static int bd = (3670016 >>> 82 | 3670016 << -82) & -1;
   private static int k = Integer.reverse(1073741824);
   private static long dt = Long.reverse(-4035225266123964416L);
   private static long bo = Long.reverse(-4035225266123964416L);
   private static long eb = Long.reverse(-7605888784154954279L);
   private static long ce = Long.reverse(-4035225266123964416L);
   private static long x = Long.reverse(6805630023430632921L);
   private static long cn = Long.reverse(-4035225266123964416L);
   private static long var_do = Long.reverse(6805630023430632921L);
   private static long ak = Long.reverse(6805630023430632921L);
   private static int aa = (-1 >>> 148 | -1 << ~148 + 1) & -1;
   private static long ck = Long.reverse(-4035225266123964416L);
   private static long ca = Long.reverse(-4035225266123964416L);
   private static long ba = Long.reverse(6805630023430632921L);
   private static int cy = Integer.reverse(0);
   private static int cr = Integer.reverse(0);
   private static long u = Long.reverse(6805630023430632921L);
   private static int z = 2097152 >>> 85 | 2097152 << -85;
   private static int es = Integer.reverse(335544320);
   private static int aj = (1048576 >>> 49 | 1048576 << ~49 + 1) & -1;
   private static int bs = Integer.reverse(318767104);
   private static int fp = Integer.reverse(1946157056);
   private static int bv = Integer.reverse(-939524096);
   private static int ae = (0 >>> 240 | 0 << ~240 + 1) & -1;
   private static long bq = Long.reverse(6805630023430632921L);
   private static long c;
   private static int fb = Integer.reverse(-1);
   private static int bk = (2 >>> 157 | 2 << -157) & -1;
   private static int c = (0 >>> 96 | 0 << ~96 + 1) & -1;
   private static long fg = Long.reverse(-4035225266123964416L);
   private static long en = Long.reverse(-4035225266123964416L);
   private static long dl = Long.reverse(-7605888784154954279L);
   private static int ed = Integer.reverse(603979776);
   private static int ec = Integer.reverse(0);
   private static int fd = Integer.reverse(0);
   private static int am = Integer.reverse(-1879048192);
   private static int dd = Integer.reverse(-1207959552);
   private static int ek = (0 >>> 82 | 0 << -82) & -1;
   private static int dq = Integer.reverse(0);
   private static int fv = (96 >>> 193 | 96 << ~193 + 1) & -1;
   private static long ct = Long.reverse(-7605888784154954279L);
   private static long y = Long.reverse(-4035225266123964416L);
   private static long an = Long.reverse(6805630023430632921L);
   private static int du = Integer.reverse(0);
   private static long al = Long.reverse(-4035225266123964416L);
   private static long be = Long.reverse(6805630023430632921L);
   private static int dk = (-1 >>> 54 | -1 << ~54 + 1) & -1;
   private static int cv = (1811939328 >>> 58 | 1811939328 << ~58 + 1) & -1;
   private static int ez = Integer.reverse(0);
   private static int bw = -1 >>> 55 | -1 << -55;
   private static int q = Integer.reverse(-1073741824);
   private static long bl = Long.reverse(-7605888784154954279L);
   private static int cu = 0 >>> 202 | 0 << ~202 + 1;
   private static long dx = Long.reverse(-4035225266123964416L);
   private static long bh = Long.reverse(6805630023430632921L);
   private static int dr = 134217729 >>> 155 | 134217729 << -155;
   private static long bf = Long.reverse(-4035225266123964416L);
   private static long ao = Long.reverse(-4035225266123964416L);
   private static int aq = Integer.reverse(1342177280);
   private static int ac = (-1 >>> 90 | -1 << ~90 + 1) & -1;
   private static int ev = (0 >>> 194 | 0 << ~194 + 1) & -1;
   private static long de = Long.reverse(-7605888784154954279L);
   private static int bt = Integer.reverse(Integer.MIN_VALUE);
   private static int cc = Integer.reverse(-1476395008);
   private static int fs = Integer.reverse(-201326592);
   private static int n = (4194304 >>> 21 | 4194304 << -21) & -1;
   private static long et = Long.reverse(6805630023430632921L);
   private static long cg = Long.reverse(6805630023430632921L);
   private static int bm = Integer.reverse(-2013265920);
   private static int ep = -1677721600 >>> 90 | -1677721600 << ~90 + 1;
   private static long fn = Long.reverse(-4035225266123964416L);
   private static int fa = 86016 >>> 11 | 86016 << ~11 + 1;
   private static int er = (0 >>> 3 | 0 << -3) & -1;
   private static int el = (-1744830464 >>> 218 | -1744830464 << -218) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_131.fw];
   private static int az = (106496 >>> 173 | 106496 << -173) & -1;
   private static long ff = Long.reverse(6805630023430632921L);
   private static int di = Integer.reverse(0);
   private static int dg = (491520 >>> 78 | 491520 << ~78 + 1) & -1;
   private static int j = (0 >>> 108 | 0 << ~108 + 1) & -1;
   private static int af = Integer.reverse(-536870912);
   private static int fw = Integer.reverse(201326592);

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != k) {
         NLoginCore_487 var10001 = NLoginCore_487.x;
         Object[] var10002 = new Object[l];
         var10002[m] = a(n & o, p) + this.e().toLowerCase(Locale.ENGLISH) + a(q, r ^ s);
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         if (var1 instanceof NLoginCore_277) {
            NLoginCore_277 var3 = (NLoginCore_277)var1;
            if (!this.a.a().b(var3)) {
               NLoginCore_509 var4 = this.a.a().b(var3);
               NLoginCore_501 var5 = var4.d(NLoginCore_567.n);
               if (var5 == null) {
                  return;
               }

               if (!(var5.b() instanceof NLoginCore_139)) {
                  return;
               }
            }
         }

         BiConsumer var10 = (var2x, var3x) -> {
            if (this.j()) {
               if (var2x) {
                  NLoginCore_150.a(var1, a(cl, cm ^ cn));
                  NLoginCore_150.a(var1, a(cp, cq));
                  NLoginCore_150.a(var1, a(cs, ct));
                  NLoginCore_150.a(var1, a(cv, cw ^ cx));
                  NLoginCore_150.a(var1, a(cz, da ^ db));
                  NLoginCore_150.a(var1, a(dd, de));
                  NLoginCore_150.a(var1, a(dg, dh));
               } else {
                  NLoginCore_150.a(var1, a(dj & dk, dl));
                  NLoginCore_150.a(var1, a(dn, var_do ^ dp));
                  NLoginCore_150.a(var1, a(dr, ds ^ dt));
                  NLoginCore_150.a(var1, a(dv, dw ^ dx) + var3x);
                  NLoginCore_150.a(var1, a(dz & ea, eb));
               }
            } else if (var2x) {
               NLoginCore_150.a(var1, a(ed, ee ^ ef));
               NLoginCore_150.a(var1, a(eh, ei ^ ej));
               NLoginCore_150.a(var1, a(el, em ^ en));
               NLoginCore_150.a(var1, a(ep, eq));
               NLoginCore_150.a(var1, a(es, et ^ eu));
               NLoginCore_150.a(var1, a(ew, ex ^ ey));
               NLoginCore_150.a(var1, a(fa & fb, fc));
            } else {
               NLoginCore_150.a(var1, a(fe, ff ^ fg));
               NLoginCore_150.a(var1, a(fi, fj));
               NLoginCore_150.a(var1, a(fl, fm ^ fn));
               NLoginCore_150.a(var1, a(fp, fq) + var3x);
               NLoginCore_150.a(var1, a(fs, ft));
            }
         };
         NLoginCore_556 var11 = NLoginCore_556.a(NLoginCore_150.c().cN);
         String var12 = var11 != null ? a(t, u ^ v) + var11.af() : a(w, x ^ y);
         String var6 = var2[z].toLowerCase(Locale.ENGLISH);
         int var8 = aa;
         switch (var6.hashCode()) {
            case 104639686:
               if (var6.equals(a(af, ag ^ ah))) {
                  var8 = ai;
               }
               break;
            case 1883680503:
               if (var6.equals(a(ab & ac, ad))) {
                  var8 = ae;
               }
         }

         switch (var8) {
            case 0:
               NLoginCore_150.a(var1, this.j() ? a(aj, ak ^ al) : a(am, an ^ ao));
               String var13 = a(aq & ar, as) + var12;
               this.a(var1, a(at, au ^ av), var13, var2x -> var10.accept(var2x, var13));
               break;
            case 1:
               if (this.a.b().a() != NLoginCore_419.b) {
                  NLoginCore_150.a(var1, this.j() ? a(aw, ax ^ ay) : a(az, ba ^ bb));
                  return;
               }

               NLoginCore_150.a(var1, this.j() ? a(bd, be ^ bf) : a(bg, bh ^ bi));
               String var9 = a(bk, bl) + var12;
               this.a(var1, a(bm, bn ^ bo), var9, var3x -> {
                  if (var3x) {
                     PluginManager var4x = this.a.b().<Server>c().getPluginManager();
                     Plugin var5x = var4x.getPlugin(a(cc, cd ^ ce));
                     if (var5x != null && !a(cf, cg ^ ch).equals(var5x.getDescription().getVersion())) {
                        File var6x = NLoginCore_366.a(var5x.getClass());
                        if (!var6x.delete()) {
                           var6x.deleteOnExit();
                        }
                     }

                     Plugin var8x = var4x.getPlugin(a(ci, cj ^ ck));
                     if (var8x != null) {
                        File var7 = NLoginCore_366.a(var8x.getClass());
                        if (!var7.delete()) {
                           var7.deleteOnExit();
                        }
                     }
                  }

                  var10.accept(var3x, var9);
               });
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 19L;
      var1 ^= -2881038661714308252L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(36 + 32),
                     69,
                     (byte)(61 + 22),
                     (byte)(11 + 36),
                     (byte)(38 + 29),
                     (byte)(23 + 43),
                     (byte)(13 + 54),
                     (byte)(30 + 17),
                     (byte)(23 + 57),
                     (byte)(17 + 58),
                     (byte)(55 + 12),
                     (byte)(77 + 6),
                     (byte)(32 + 21),
                     (byte)(2 + 78),
                     (byte)(40 + 57),
                     (byte)(44 + 56),
                     (byte)(96 + 4),
                     (byte)(102 + 3),
                     110,
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.B("ĦĳĲõĵıĬĵŀįüĺľķĺŀĂѧѨґҏҝҌѺғѿ", (byte)34, 66));
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

   private void a(NLoginInterface_042 var1, String var2, String var3, Consumer<Boolean> var4) {
      if (!this.a.b().j(this.a.b().a() == NLoginCore_419.d ? var2.toLowerCase(Locale.ENGLISH) : var2)) {
         File var5 = new File(this.a.c().getParentFile(), var2 + a(bp, bq ^ br));
         NLoginCore_285 var6 = NLoginCore_305.a().a(var3, var5);
         var4.accept(Boolean.valueOf(((var6.p() != 0) == bs && var6.af() ? bt : bu)));
      } else {
         NLoginCore_150.a(var1, this.j() ? a(bv & bw, bx) : a(by, bz ^ ca));
      }
   }

   private static void b() {
      c = -7228547008600060294L;
      long var0 = c ^ -2881038661714308252L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(7 + 62),
               (byte)(63 + 20),
               (byte)(19 + 28),
               (byte)(26 + 41),
               (byte)(5 + 61),
               (byte)(8 + 59),
               (byte)(30 + 17),
               (byte)(21 + 59),
               (byte)(2 + 73),
               (byte)(32 + 35),
               83,
               (byte)(19 + 34),
               (byte)(37 + 43),
               (byte)(59 + 38),
               (byte)(52 + 48),
               (byte)(97 + 3),
               (byte)(52 + 53),
               (byte)(95 + 15),
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(13 + 56), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_453.B("ƫƳƊǄǈƬƽƲǏƚƸƥ", (byte)111, 66);
               ZKM_STR_B[1] = NLoginCore_027.B("ƌǄƱƺƳǕƬƮƾǐǊǞƿƯƻƜǏƳǀƩƴǩưƱ", (byte)111, 66);
               ZKM_STR_B[2] = NLoginCore_397.D("չԻկմշձ\u0558սքՠհճԿֈՖՖ\u0557ջ\u0558իծ\u0558ՕՖ", (byte)111, 68);
               ZKM_STR_B[3] = NLoginCore_397.F("֥֛կե՞ւ֪ռ֥֖֚֙ֈպռ֭կ֕ծծ֖֑վտ", (byte)111, 70);
               ZKM_STR_B[4] = NLoginCore_384.D("Բ՜ՏՉՐԹւՎինեՊ", (byte)111, 68);
               ZKM_STR_B[5] = NLoginCore_091.C("ԳԮՔՇԽ\u0558՝ՋվՏ՝Պ", (byte)111, 67);
               ZKM_STR_B[6] = NLoginCore_232.D("ՐխՌվՙլղփյ\u0558՝քեպՆ֊րևՖցՊըՕՖ", (byte)111, 68);
               ZKM_STR_B[7] = NLoginCore_446.D("ՙՔ՜ծծշԹմՀրփՊ", (byte)111, 68);
               ZKM_STR_B[8] = NLoginCore_127.A("ƫǔƔƘǌǜƕǑƼǟǕƫƔƸƶǁƯƢƲƢƪǢǔǤǆǰƾƭǎǎǆǏǍǮǵǐǘǣǆǻǴǸȀǕǚǭǾǒǚǙǿǖǟǉǭǽȄǬǘǣȊǐǠǲȔȑǤǋǌǓȅȉȑȟǛǥ", (byte)111, 65);
               ZKM_STR_B[9] = NLoginCore_521.A("ǏƯưƔƫƳƳƹǈǀƯƛǁǄƶƼǂǨơǅǁƧǙǛƠƿǠǄǤǧǂǦǳƶƷǏǔǍǶǪǞǳƼǬǼǜǞȅǏȀǝǘǝǢȅǄȀǘǥǢȂǴǳǞǡȐǴǹǖǛǳǓǲȑȞǥ", (byte)111, 65);
               ZKM_STR_B[10] = NLoginCore_451.F("֣֟ՠցշ֗֓քե֪քր֨֊֤֝֍֏֣ն֤ֆհ\u058cֲֳֹ֛֑֬֨֯քֶփ֤և֡ׄ֔׃ֿ֟֙\u05cf֊ְֲׇ֯֓֜֩֓אזֲֳׇָ֚\u05c9י֠", (byte)111, 70);
               ZKM_STR_B[11] = NLoginCore_446.E("֞ՠև֜ձփ՜֛֍։֊ւ֮լջքօֶ֧֘֍֧վտ", (byte)111, 69);
               ZKM_STR_B[12] = NLoginCore_324.B("ƬƶǗƺƢưưǓǘǉƞƽǌǡǁơơǤǒǜƢƴǦǟǎǯǭǅǟƳǝǕǭǦǡǁƶǛǆǵƾǾǝǴǺǰǬǦǛǄǥǤǤǹǬǪǉǥǡȈȁǬǿȎȐȍȏǑǩǤǴȜȋǚȈȌǡȖǵȡȂǦȇȊȢǧȚȌȍȐǢǬȇȐȬǿȁȌȂȯȊȴȸȕǰȮȲȅ", (byte)111, 66);
               ZKM_STR_B[13] = NLoginCore_173.B("ǊǔƵƵƨƼƽǍƿƶǛǟƻƛǢǓƯǢǦƴǡǗǕƼƼǀǅǇǁǳƬǞƱǉǦǑǅǼƸƳƴǚǾǎǚǔǝǎƾǇȀǡǕǚǪǤǣǉȎǨǐȑǼȖǨȂǫȄȏȇȎǪȜȇǜǠǔǺǬǡǜǾȜȩȦǾȀȈǠȀȧȈȰȉȫȣ", (byte)111, 66);
               ZKM_STR_B[14] = NLoginCore_076.B("ƫǔƔƘǌǜƕǑƼǟǕƫƔƸƶǁƯƢƲƢƪǢǔǤǆǰƾƭǎǎǆǏǍǮǵǐǘǣǆǻǴǸǿǘǑǖǏǛǅǐǞǷǉȄȌȇȊǤǍȑǛǦȌǔ", (byte)111, 66);
               ZKM_STR_B[15] = NLoginCore_433.E(
                  "֝սվբչցցև֖֎սթ֏֒ք֊\u0590ֶկ֓֏յ֧֩ծ֍ֲֵ֮֒\u0590ִׁքօָׁ֢֛֝ׄ֬\u058cցֽ֟ב׆ּ\u058bֶ֧\u05c9ַ֥\u05c9ֱ\u05c8\u05c9ְי֘֠זיׁםׇּׄר֥כָנֳ", (byte)111, 69
               );
               ZKM_STR_B[16] = NLoginCore_575.D("պնԷ\u0558Վծժ՛Լց՛\u0557տաջմդզպՍջ՝Շգ\u0590֊փղտըֆ։՛֍՚ջ՞ո֛ի֚նկջ֑֗֩ց՝զէ֭֫փ։֤֦֟մկ֫մ֣ձ", (byte)111, 68);
               ZKM_STR_B[17] = NLoginCore_384.F("փ֣֙գ֨մե֬նտ֎ճ", (byte)111, 70);
               ZKM_STR_B[18] = NLoginCore_127.E("պ֛հյ֕֟պբ֚քնճ", (byte)111, 69);
               ZKM_STR_B[19] = NLoginCore_183.B("ǆƦǎǐǗƖǆưǞǏƘǒƵǏǟǂǙƸƹơǀǂǩǍǉƯƼǠǛǪǕǩǲǸǙǦǋǊǋǔǵƸǊǼǪǋǂǟǠǞǰȃǗǬǪȁȄǾǛȇǿǫǩǦȏȆȔȗȍǛȇǵǸǾǴǥ", (byte)111, 66);
               ZKM_STR_B[20] = NLoginCore_027.C(
                  "ՏխԵհՌԶՊսՐատռֈՠ\u0558ր՜ֆՠ՝֎՛և֏ֆՑփ֒Վժ\u058b֘\u0590Ֆյ\u0558֚֒ճխմ՞֖պր֛ձոգ֢֭րօբֲ֪ձվִքրմ֡ն֮֫ևֳ֛֖֣֚֮֜֫֘֟֘֡֡\u058b֠֙։֧֖֨֕", (byte)111, 67
               );
               ZKM_STR_B[21] = NLoginCore_092.B("ǑǖǃơǅƭƨƫǜưǁǠǝƭǓǝǀƴǣƼǖǙưƱ", (byte)111, 66);
               ZKM_STR_B[22] = NLoginCore_530.E("\u058c՝֑֟֙չ֚ցպնֆճ", (byte)111, 69);
               ZKM_STR_B[23] = NLoginCore_433.E("֢\u0557շկզ֙ժև֣֮֨֊֢լ֝֞րի֓փքַվտ", (byte)111, 69);
               ZKM_STR_B[24] = NLoginCore_076.D("ԳԮՔՇԽ\u0558՝ՋվՏ՝Պ", (byte)111, 68);
               ZKM_STR_B[25] = NLoginCore_575.D("եԼՋմտշձբԺճձ՚շՓպես\u0558ևորխռՍ՞Փ՞։ո֕ՖՑ։պՖ֝րն֗֕շլհ֏զձչ֫ֆ֩֨իր֦֑֬֯ռְ֢յֲ֕֗", (byte)111, 68);
               ZKM_STR_B[26] = NLoginCore_530.F(
                  "֘ռ֏֥֜֒վ֔֔տ֤֮\u0590լձ\u058bռ\u058c֠խ֏ճլֱ֧֚֟֜־ֺֻ֫֓րׁ֤֠ֆ։ׇֻ֫\u05ceֳֽ֧֦֛֤֙֔זג֩ׄ֍ֱ֨ו\u05caֺ\u05caסטט֜אחׂ֨ם\u05ecזן\u05ee֢֮\u05ca֩\u05ccש\u05eeׅאֲק־ֿ",
                  (byte)111,
                  70
               );
               ZKM_STR_B[27] = NLoginCore_076.E("՜\u0557սհզցֆմ֧ոֆճ", (byte)111, 69);
               ZKM_STR_B[28] = NLoginCore_521.B("ǍƢǍƹƧǕƽƩƶƱƾǁƜǛƷǗƴǣƦǨǙǈǄǉǏơƢǃǒƽƭǃǧǬǸǈǎƴǯǰǆǝǭǶȁǿǣǯǹǤǆȄǃȆǜǜȊǭǜǣȉǐǨȌ", (byte)111, 66);
               ZKM_STR_B[29] = NLoginCore_173.E("ՠպղհ֨ա֦ցգը֚ս\u058bջ֥֪կ\u058cհնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖\u058c֤֛\u0590֤֮֏\u058bֵ֞֓ח֞֟", (byte)111, 69);
               ZKM_STR_B[30] = NLoginCore_141.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
               ZKM_STR_B[31] = NLoginCore_521.E("՜\u0557սհզցֆմ֧ոֆճ", (byte)111, 69);
               ZKM_STR_B[32] = NLoginCore_521.C("ղնճԸ՛ԾԾՀՀհջշՑպՑ՚լֈ՜նՊբ֒հմ՞ըըկ֓\u0558գճ֎զլյՖհ֕ՙ֎֦՟֢։ևցօ֝ի\u058c֜ծ\u0590օջձֲ֮֠֩֯\u058b", (byte)111, 67);
               ZKM_STR_B[33] = NLoginCore_446.D("ջ՜ըՎլջշԺՎխ՝՛նՓջզսմշս՝խ֍կ֓եծՍրՏՓ֍\u0557֊եղսթ֕ՙ՟֍աևձ֦֗֊զ֛֪֛֬֬լձ֬֡֟մ֪օկչյքֺ֟ոָֺ֥֜֕֞֊", (byte)111, 68);
               ZKM_STR_B[34] = NLoginCore_092.D("ԲՆմյ՛Օկ՞Փ\u0557փՊ", (byte)111, 68);
               ZKM_STR_B[35] = NLoginCore_451.F("՜\u0557սհզցֆմ֧ոֆճ", (byte)111, 70);
               ZKM_STR_B[36] = NLoginCore_183.F("՜\u0557սհզցֆմ֧ոֆճ", (byte)111, 70);
               ZKM_STR_B[37] = NLoginCore_387.E("ծրոչ֓֜ֈնթ֕֍֢֥֨֩տִ֮֮խձ֣֒֍ֆ֏ֲ֓վּ֊ֱ֡տֹ֧׀ֵ֓\u05c8ֈֺֿ֫֜֨֨\u058c֍ֲֿ֥֩֡֞֟", (byte)111, 69);
               ZKM_STR_B[38] = NLoginCore_241.A("ƠƲƪƫǅǎƺƨƛǇƽǔǠǣƵǓǙƱƱǖǜƳǠǇǬǨǆǆǍǅƿǬǣǷǀǺǂǙƺǗǇǈǯƼǞǱȁǑǥǔǀǇǃǧǵǨǖǷȉǋȃǽǐǩǨǯȒȍǖȍǱȎǰǬǮǯȝǭȗǲǦǝȒȆȠǳǰǱ", (byte)111, 65);
               ZKM_STR_B[39] = NLoginCore_110.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
               ZKM_STR_B[40] = NLoginCore_076.A("ǐǁƫǔƕǚǏƾƿǊƶƛƼƳǁơƷƦǟǅǋǫǍǙƺǟǟƺǊǅƿǵǥǖǹǤǕǬǌƻǳǚǿǡǭǮǻǦǜȈǜȆǳȂǬǺȁǁǪǨǿǐȔȈȀȂȂǱȉǒǩȗǹǜȀǥ", (byte)111, 65);
               ZKM_STR_B[41] = NLoginCore_471.C("ԷՑՉՇտԸս\u0558ԺԿձՔբՒռցՆգՇՍՊր՛աՠցՇ֗իձղՑռ֏՝ձ֚ժ՝\u0558ախգջղէօջզբյժ\u058c֮յն", (byte)111, 67);
               ZKM_STR_B[42] = NLoginCore_446.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
               ZKM_STR_B[43] = NLoginCore_427.A("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 65);
               ZKM_STR_B[44] = NLoginCore_004.C("Րխվծ՟ծրԿՓյաՎ՚ե՟տ\u0558Ծյՙուց֏Ռյ\u0590կրժևՐՍ\u0558\u058c֚\u0557֏չմշ֔գ֛յ֤րգ՝ռ֢ի֤֭֩ֆ֨֫է֊֢֣֪֬", (byte)111, 67);
               ZKM_STR_B[45] = NLoginCore_397.D("ԶջնսԱցոշՏսշԸոՒՒջավֈ\u0557ժ\u058cսեՉըձւյ\u058cոՐֈ֊Փյճ՞ս՜֕՚֓֏֏֝֔շ֛֪֗\u058cև֚֍֨ռ֠փֲ֣֑֗փֻ֪֮־ֻ֪֪֫֟֘ׄ֊", (byte)111, 68);
               ZKM_STR_B[46] = NLoginCore_397.F("՛կ֝֞քվ֘ևռր֬ճ", (byte)111, 70);
               ZKM_STR_B[47] = NLoginCore_092.E("՜\u0557սհզցֆմ֧ոֆճ", (byte)111, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.A("ƱǇǙǙƩƱƒƴǋƬƯƞƴƻƻƯƺǥǃƣǟǩưƱ", (byte)111, 65);
               ZKM_STR_B[1] = NLoginCore_451.A("ƌǄƱƺƳǕƬƮƾǐǋǔƼƻǝǔǘƹǈǥǝǫƵǕǬƼǊƮƤƭƾǅ", (byte)111, 65);
               ZKM_STR_B[2] = NLoginCore_397.F("֢դ֚֘֝֠ց֦֭։֛֬օւ֤֮֝֡կֆ֑֙վտ", (byte)111, 70);
               ZKM_STR_B[3] = NLoginCore_384.C("ռղՆԼԵՙցՓռխղՎտռյէջցՄՌգ֎ՕՖ", (byte)111, 67);
               ZKM_STR_B[4] = NLoginCore_387.E("֞֠ծճբ֡֨վ\u058c֦֤֮֡խըս\u058c֥փ֣\u0590ցվտ", (byte)111, 69);
               ZKM_STR_B[5] = NLoginCore_521.D("ՃԴղԽԶՠՋժչհկՊ", (byte)111, 68);
               ZKM_STR_B[6] = NLoginCore_110.A("ƫǈƧǙƴǇǍǞǐƳƸǛǐƾǖƝƯǀƵƶǖǃưƱ", (byte)111, 65);
               ZKM_STR_B[7] = NLoginCore_427.B("ƲƍǘǏƐƹƲƜƦǋƬƥ", (byte)111, 66);
               ZKM_STR_B[8] = NLoginCore_183.C("ՐչԹԽձցԺնաքպՐԹ՝՛զՔՇ\u0557ՇՏևչ։ի֕գՒճճիմղ֚֓յսֈի֥֠֙֝պտ֣֒շտվ֤ջքծ֢֑֒֩սֈ֯յօ֦֦֗֨֏սְ֟׀ֲ֥֮֊", (byte)111, 67);
               ZKM_STR_B[9] = NLoginCore_110.C(
                  "մՔՕԹՐ\u0558\u0558՞խեՔՀզթ՛աէ֍ՆժզՌվրՅդօթ։\u058cէ\u058b֘՛՜մչղ֛֏փ֘ա֑֡ցփ֪մ֥ւսւև֪թ֥ս֊և֧֙֘փ֎։ռ֟־։ׂվֳֺׂ־֓־ׄ\u05caսօׄ֯ց֖֨֕", (byte)111, 67
               );
               ZKM_STR_B[10] = NLoginCore_201.E("֣֟ՠցշ֗֓քե֪քր֨֊֤֝֍֏֣ն֤ֆհ\u058cֲֳֹ֛֑֬֨֯քֶփ֤և֡ׄ֔׃ֿ֟֙\u05cf֊ְֲ֯֓֜֩֓זַֻּ֖֛֙֘\u05cd֯אכֶ֭וֽנ֜\u05ccיקנֳ", (byte)111, 69);
               ZKM_STR_B[11] = NLoginCore_559.A("ǐƒƹǎƣƵƎǍƿƻƿǒƿǕƻǄƴǕǅƟǒǩưƱ", (byte)111, 65);
               ZKM_STR_B[12] = NLoginCore_471.B(
                  "ƬƶǗƺƢưưǓǘǉƞƽǌǡǁơơǤǒǜƢƴǦǟǎǯǭǅǟƳǝǕǭǦǡǁƶǛǆǵƾǾǝǴǺǰǬǦǛǄǥǤǤǹǬǪǉǥǡȈȁǬǿȎȐȍȏǑǩǤǴȜȋǚȈȌǡȖǵȡȂǦȇȊȢǧȚȌȍȐǢǬȇȐȬǿǶȢȎǹȕȌǳȌȼȏȎȕȎȿȢȘȾȁȹȒȇȣȐȑ", (byte)111, 66
               );
               ZKM_STR_B[13] = NLoginCore_110.B("ǊǔƵƵƨƼƽǍƿƶǛǟƻƛǢǓƯǢǦƴǡǗǕƼƼǀǅǇǁǳƬǞƱǉǦǑǅǼƸƳƴǚǾǎǚǔǝǎƾǇȀǡǕǚǪǤǣǉȎǨǐȑǼȖǨȂǫȄȏȇȎǪȜȇǜǠǔǺǬǡǜǾȜȩȦǹȆȟȡȌȏǨǩȒȬȩ", (byte)111, 66);
               ZKM_STR_B[14] = NLoginCore_232.C("ՐչԹԽձցԺնաքպՐԹ՝՛զՔՇ\u0557ՇՏևչ։ի֕գՒճճիմղ֚֓յսֈի֤֠֙֝սնջմրժյփ֜ծ֥֮լֲ֥֭հְֲָּֽ֡֬֓֊ֵׂ֟֍ւր֊", (byte)111, 67);
               ZKM_STR_B[15] = NLoginCore_173.B("ǏƯưƔƫƳƳƹǈǀƯƛǁǄƶƼǂǨơǅǁƧǙǛƠƿǠǄǤǧǂǦǳƶƷǏǔǍǶǪǞǳƾƳǑǯȃǸǮƽǙǨǻǩǗǻǣǺǻǢȋǊǒȈǢǵǶǒǺǔȖǓȍȈȚǥ", (byte)111, 66);
               ZKM_STR_B[16] = NLoginCore_553.A("ǕǑƒƳƩǉǅƶƗǜƶƲǚƼǖǏƿǁǕƨǖƸƢƾǫǥǞǍǚǃǡǤƶǨƵǖƹǓǶǆǵǑǊǖǲǬȄǜƸǁǂȆȈǚȈǩǧǎȁǙǻȍǠǐ", (byte)111, 65);
               ZKM_STR_B[17] = NLoginCore_173.D("ռԲՌխոյԹկՋխ\u0557ՔէՔ֊զևա֍բՁ֎ՕՖ", (byte)111, 68);
               ZKM_STR_B[18] = NLoginCore_092.E("գ֎֤շռղմ֜֩զ֠ճ", (byte)111, 69);
               ZKM_STR_B[19] = NLoginCore_433.E(
                  "֔մ֥֜֞դ֔վ֬֝զ֠փ֭֝\u0590֧ֆևկ֎\u0590ַ֛֗ս֊ַָ֣֮֩׀׆ִ֧֢֙֘֙׃ֆ֘\u05caָ֙\u0590֭֮֬־בָֺ֥\u05cfג\u05cc֩ו\u05cdִִַֹ֭ןֺׁ֥\u05c8ךׁ֦֧װ֬א֪דֳרש\u05c8ׄק־ֿ",
                  (byte)111,
                  69
               );
               ZKM_STR_B[20] = NLoginCore_521.C("ՏխԵհՌԶՊսՐատռֈՠ\u0558ր՜ֆՠ՝֎՛և֏ֆՑփ֒Վժ\u058b֘\u0590Ֆյ\u0558֚֒ճխմ՞֖պր֛ձոգ֢֭րօբֲ֪ձվִքրմ֡ն֮֫ևֱֳׇ֛֖֤֥֚֜֫֘֡׀ֺׅ֛֖֫֙֨֕", (byte)111, 67);
               ZKM_STR_B[21] = NLoginCore_397.E("֤֑֟կ֓ջնչ֪վ֗օջ֡֍֊ճհր֧֖ցվտ", (byte)111, 69);
               ZKM_STR_B[22] = NLoginCore_433.D("ՄսնԹԹՑլց՚ւփՊ", (byte)111, 68);
               ZKM_STR_B[23] = NLoginCore_201.D("չԮՎՆԽհՁ՞տպփճԹ՜սՅ\u0557ց՝ոքըՕՖ", (byte)111, 68);
               ZKM_STR_B[24] = NLoginCore_138.A("ǒƵǆƖƱǆƽǜǎǌƴƥ", (byte)111, 65);
               ZKM_STR_B[25] = NLoginCore_530.C("եԼՋմտշձբԺճձ՚շՓպես\u0558ևորխռՍ՞Փ՞։ո֕ՖՑ։պՖ֝րն֗֕շլհ֏զձչ֫ֆ֩֨իր֣֮ձ֥֢֔֨\u0590֎֗֓\u058bչָֽ֗֠֝\u058cֶ׀֙֊", (byte)111, 67);
               ZKM_STR_B[26] = NLoginCore_092.C(
                  "կՓզճթռՕիիՖօջէՃՈբՓգշՄզՊՃֈձվնճ֑֕֒ւժ\u0557ջշ֘՝ՠւ֥֒֞վսհղ֊֔իջ֭֩ր֛դֈտָ֑֬֡֡֯֯ճ֧֮֙տִ׃ֶֹ֭ׄ֝׃ֲ\u05c8֡׀ֻׁ֯և\u058cׇּ֪֏ֱ֤חהַ", (byte)111, 67
               );
               ZKM_STR_B[27] = NLoginCore_004.F("ծֆ֎֗գե֜ր֭֗֬ճ", (byte)111, 70);
               ZKM_STR_B[28] = NLoginCore_427.E(
                  "֛հ֛ևյ֣\u058bշքտ\u058c֏ժ֩օ֥ւֱմֶ֧֖֒֗֝կհ֑֠\u058bջֵֺ֑׆֖֜ւֽ־ֻ֔֫ׄ\u05cf\u05cdֱֲׇֽ֔ג֑\u05c9\u05c9ֹֹֹֹֻֻׂ֥֓֡֠םיף֥גץט֪\u05ceֳ", (byte)111, 69
               );
               ZKM_STR_B[29] = NLoginCore_141.E("ՠպղհ֨ա֦ցգը֚ս\u058bջ֥֪կ\u058cհնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖։֘ֆ׆׃ֵ֞\u05ceׇ֤֓֫֞֟", (byte)111, 69);
               ZKM_STR_B[30] = NLoginCore_138.C("ՙՍճռԵՍտ՜ճոկՊ", (byte)111, 67);
               ZKM_STR_B[31] = NLoginCore_397.B("ƶǇǈƦƧƭǋƷƳƘǀƥ", (byte)111, 66);
               ZKM_STR_B[32] = NLoginCore_201.F("֛֟֜աքէէթթ֤֙֠պ֣պփֱ֕օ֟ճ\u058bֻ֙֝ևּ֑֑֘ց\u058cַ֜֏֕֞տ֙־ւַ\u05cfֈ\u05cbְֲ֪֮׆ֵׅ֔חה֙ךּ׆א־ְֱֱׁ֙מֵ֣֠פך֥\u05ebֳ֥", (byte)111, 70);
               ZKM_STR_B[33] = NLoginCore_575.B("ǖƷǃƩǇǖǒƕƩǈƸƶǑƮǖǁǘǏǒǘƸǈǨǊǮǀǉƨǛƪƮǨƲǥǀǍǘǄǰƴƺǨƼǢǌǲȁǥǁǶȅȇǶȇǇǌȇǼǺǏȅǠǊǔȕǧȀǨǓȜșșǸȊǴǥ", (byte)111, 66);
               ZKM_STR_B[34] = NLoginCore_575.B("ƱǅǘǑƑǜǜƶƭǝƼƩƬǝƱơǑƶƷƻǂǙưƱ", (byte)111, 66);
               ZKM_STR_B[35] = NLoginCore_530.C("ձԷ՚հսՓժՐԼրաՊ", (byte)111, 67);
               ZKM_STR_B[36] = NLoginCore_453.E("՞֍մ֟֙դջփ֝ռ֘ճ", (byte)111, 69);
               ZKM_STR_B[37] = NLoginCore_110.A("ƠƲƪƫǅǎƺƨƛǇƿǚǔǗǛƱǦǠǠƟƣǕǄƿƸǁǅǤưǮƼǓǣƱǫǙǲǅǧǺƺǝǏǕǪǬǙǯǄǡǱȀǶǣǐǑ", (byte)111, 65);
               ZKM_STR_B[38] = NLoginCore_521.E(
                  "ծրոչ֓֜ֈնթ֕\u058bֱ֢֮փ֧֡տտ֤֪ցֶֺ֛֮֕֔֔֓֍ֱֺׅ֎\u05c8\u0590֧ֈֽ֥֖֕֊ֿ֬\u05cfֳ֢֟֎ֵ֑֕׃ֶ֤ׅח֙ב\u05cbֶַֽ֞נכ֤כֿל־ֺֹּ\u05ceׅ\u05ccרש\u05c9ןקײ\u05f7־ֿ",
                  (byte)111,
                  69
               );
               ZKM_STR_B[39] = NLoginCore_241.B("ǉƥǔƸǈƤǓƺǈƪƛƥ", (byte)111, 66);
               ZKM_STR_B[40] = NLoginCore_004.B("ǐǁƫǔƕǚǏƾƿǊƶƛƼƳǁơƷƦǟǅǋǫǍǙƺǟǟƺǊǅƿǵǥǖǹǤǕǬǌƻǳǚǿǡǭǮǻǦǜȈǜȆǳȂǬǺȁǁǪǨǿǐȔȈǑǥȘȕȒǒǲȘǬǹȒǥ", (byte)111, 66);
               ZKM_STR_B[41] = NLoginCore_446.F("ՠպղհ֨ա֦ցգը֚ս\u058bջ֥֪կ\u058cհնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖֊ׇֻׁׂ֬\u05ccֱֱׅ֓ח֞֟", (byte)111, 70);
               ZKM_STR_B[42] = NLoginCore_004.C("ՃՙջՐը\u0557ՐԻսմՍՊ", (byte)111, 67);
               ZKM_STR_B[43] = NLoginCore_223.F("֜սձ֝էսՠմ֧֭֎ճ", (byte)111, 70);
               ZKM_STR_B[44] = NLoginCore_138.D("Րխվծ՟ծրԿՓյաՎ՚ե՟տ\u0558Ծյՙուց֏Ռյ\u0590կրժևՐՍ\u0558\u058c֚\u0557֏չմշ֔գ֛յ֤րգ՝ռ֢ի֤֭ւր֍ֵ֭\u058b\u058c֤օ֍", (byte)111, 68);
               ZKM_STR_B[45] = NLoginCore_433.B("ƑǖǑǘƌǜǓǒƪǘǒƓǓƭƭǖƼǙǣƲǅǧǘǀƤǃǌǝǐǧǓƫǣǥƮǐǎƹǘƷǰƵǮǪǪǸǯǒǶǲȅǧǢǵǨȃǗǻǞȍǾǬǲǞǕȀǊȊȅȏǧǥǳȋȀǥ", (byte)111, 66);
               ZKM_STR_B[46] = NLoginCore_092.B("ưƶƸǓƦƗƸƗǌǗǊƥ", (byte)111, 66);
               ZKM_STR_B[47] = NLoginCore_553.B("ƱƗǑƤǛǃƓǕǝƼǀƥ", (byte)111, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.E("խե֖բցմ֚֔վևջ֠ո֣խ֧փխ֎քֈ֑վտ", (byte)111, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_127.F("՟֝ձ֘֗է֖֛֛֝֟֎ռ֒դժֈ֬֒\u058b֣֧վտ", (byte)111, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_131.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_471.D("ϩЋЍϭБаШоЪϹзЭлеϾУхфмтмБ", (byte)4, 68), NLoginCore_131.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.F("ԣ\u0530ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿࡤࡥࢎࢌ࢚ࢉࡷ\u0890ࡼԔ", (byte)4, 70) + var1 + NLoginCore_183.D("ϻ", (byte)4, 68) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_131(NLoginType_008 var1) {
      super(var1, a(c, d ^ e), a(f, g), (h != 0), (i != 0));
   }

   static {
      b();
   }
}
