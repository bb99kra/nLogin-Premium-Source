package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_043 extends NLoginType_032 {
   private static long bd = Long.reverse(-5431326810738397933L);
   private static int dw = Integer.reverse(-1);
   private static long dd = Long.reverse(-5431326810738397933L);
   private static int dp = (11 >>> 255 | 11 << -255) & -1;
   private static long fv = Long.reverse(-5431326810738397933L);
   private static int dk = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = 0 >>> 171 | 0 << -171;
   private static int gh = (589824 >>> 144 | 589824 << ~144 + 1) & -1;
   private static long er = Long.reverse(-4710750870359118573L);
   private static long dr = Long.reverse(-5431326810738397933L);
   private static long dm = Long.reverse(-4710750870359118573L);
   private static long fs = Long.reverse(-5431326810738397933L);
   private static int fj = Integer.reverse(Integer.MIN_VALUE);
   private static long da = Long.reverse(720575940379279360L);
   private static int ff = (278528 >>> 13 | 278528 << -13) & -1;
   private static int ge = Integer.reverse(1610612736);
   private static int gg = ('耀' >>> 140 | 32768 << ~140 + 1) & -1;
   private static long ax = Long.reverse(720575940379279360L);
   private static int fc = (-1 >>> 192 | -1 << ~192 + 1) & -1;
   private static long bw = Long.reverse(-4710750870359118573L);
   private static int ci = (1536 >>> 103 | 1536 << -103) & -1;
   private static int bc = (-1073741824 >>> 254 | -1073741824 << ~254 + 1) & -1;
   private static int gd = (160 >>> 197 | 160 << ~197 + 1) & -1;
   private static long e;
   private static int bv = 1179648 >>> 145 | 1179648 << ~145 + 1;
   private static int eo = (0 >>> 10 | 0 << -10) & -1;
   private static int dq = Integer.reverse(-1);
   private static int gr = -1073741820 >>> 190 | -1073741820 << -190;
   private static int fw = 1073741824 >>> 254 | 1073741824 << ~254 + 1;
   private static long cq = Long.reverse(-5431326810738397933L);
   private static long cz = Long.reverse(-4710750870359118573L);
   private static int em = -1 >>> 128 | -1 << ~128 + 1;
   private static int fu = Integer.reverse(1677721600);
   private static long fp = Long.reverse(-5431326810738397933L);
   private static int ek = Integer.reverse(0);
   private static int fz = (2097152 >>> 117 | 2097152 << -117) & -1;
   private static int bm = -1073741823 >>> 62 | -1073741823 << ~62 + 1;
   private static int dc = -1 >>> 183 | -1 << -183;
   private static int gq = 1073741826 >>> 29 | 1073741826 << -29;
   private static long fd = Long.reverse(-5431326810738397933L);
   private static int cl = Integer.reverse(-1342177280);
   private static int bp = (0 >>> 214 | 0 << -214) & -1;
   private static long dx = Long.reverse(-5431326810738397933L);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);
   private static int dg = Integer.reverse(-939524096);
   private static long du = Long.reverse(720575940379279360L);
   private static long cu = Long.reverse(720575940379279360L);
   private static int gy = 65536 >>> 176 | 65536 << ~176 + 1;
   private static long ef = Long.reverse(720575940379279360L);
   private static int ga = Integer.reverse(1073741824);
   private static int fk = 4480 >>> 103 | 4480 << -103;
   private static long ev = Long.reverse(-4710750870359118573L);
   private static long b = Long.reverse(-4710750870359118573L);
   private static int eg = Integer.reverse(0);
   private static long bl = Long.reverse(720575940379279360L);
   private static int de = Integer.reverse(-1073741824);
   private static int gc = (4 >>> 192 | 4 << -192) & -1;
   private static int by = Integer.reverse(0);
   private static long cb = Long.reverse(720575940379279360L);
   private static long ec = Long.reverse(-5431326810738397933L);
   private static int gx = 0 >>> 73 | 0 << -73;
   private static int gu = 11264 >>> 201 | 11264 << ~201 + 1;
   private static int he = Integer.reverse(335544320);
   private static long ct = Long.reverse(-4710750870359118573L);
   private static int bj = 1572864 >>> 50 | 1572864 << ~50 + 1;
   private static int ed = Integer.reverse(-671088640);
   private static int fr = Integer.reverse(-1);
   private static long ew = Long.reverse(720575940379279360L);
   private static int cj = Integer.reverse(-1);
   private static int di = Integer.reverse(671088640);
   private static int bh = 83886080 >>> 56 | 83886080 << ~56 + 1;
   private static int ce = (-1 >>> 124 | -1 << ~124 + 1) & -1;
   private static long cx = Long.reverse(720575940379279360L);
   private static long fl = Long.reverse(-4710750870359118573L);
   private static long bo = Long.reverse(720575940379279360L);
   private static int cv = 4 >>> 222 | 4 << ~222 + 1;
   private static int eq = Integer.reverse(2013265920);
   private static int go = Integer.reverse(134217728);
   private static int eh = Integer.reverse(939524096);
   private static int cc = (0 >>> 152 | 0 << ~152 + 1) & -1;
   private static int ay = Integer.reverse(0);
   private static int cp = -1 >>> 239 | -1 << ~239 + 1;
   private static long cf = Long.reverse(-5431326810738397933L);
   private static int cy = Integer.reverse(-2013265920);
   private static int bq = Integer.reverse(-1879048192);
   private static long bx = Long.reverse(720575940379279360L);
   private static int br = (268435456 >>> 217 | 268435456 << -217) & -1;
   private static long dn = Long.reverse(720575940379279360L);
   private static long dt = Long.reverse(-4710750870359118573L);
   private static long bs = Long.reverse(-4710750870359118573L);
   private static int fx = Integer.reverse(-402653184);
   private static int cd = Integer.reverse(-805306368);
   private List<NLoginCore_353> a = Collections.emptyList();
   private static int eu = Integer.reverse(-134217728);
   private static int ds = Integer.reverse(-402653184);
   private static int ep = Integer.reverse(0);
   private static int gn = 122880 >>> 109 | 122880 << ~109 + 1;
   private static int bb = 0 >>> 100 | 0 << ~100 + 1;
   private static String[] c = new String[he];
   private static long hc = Long.reverse(720575940379279360L);
   private static int dy = -2147483636 >>> 31 | -2147483636 << ~31 + 1;
   private static long bg = Long.reverse(720575940379279360L);
   private static long hb = Long.reverse(-4710750870359118573L);
   private static int ex = (0 >>> 151 | 0 << ~151 + 1) & -1;
   private static int ft = 0 >>> 15 | 0 << -15;
   private static int ey = Integer.reverse(67108864);
   private static long es = Long.reverse(720575940379279360L);
   private static int var_do = Integer.reverse(1073741824);
   private static long ea = Long.reverse(720575940379279360L);
   private static int bz = (20971520 >>> 181 | 20971520 << ~181 + 1) & -1;
   private static long bn = Long.reverse(-4710750870359118573L);
   private static long ez = Long.reverse(-5431326810738397933L);
   private static int fe = 0 >>> 172 | 0 << ~172 + 1;
   private static long ej = Long.reverse(720575940379279360L);
   private static int a = Integer.reverse(0);
   private static int fa = (0 >>> 207 | 0 << ~207 + 1) & -1;
   private static int gl = Integer.reverse(-1342177280);
   private static int gk = Integer.reverse(805306368);
   private static long cw = Long.reverse(-4710750870359118573L);
   private static int df = Integer.reverse(0);
   private static int be = (262144 >>> 240 | 262144 << -240) & -1;
   private static int gj = 184549376 >>> 248 | 184549376 << -248;
   private static long dz = Long.reverse(-4710750870359118573L);
   private static long dh = Long.reverse(-5431326810738397933L);
   private static int fy = (0 >>> 219 | 0 << ~219 + 1) & -1;
   private static int ha = (-536870908 >>> 189 | -536870908 << ~189 + 1) & -1;
   private static long fm = Long.reverse(720575940379279360L);
   private static int gi = 40 >>> 162 | 40 << -162;
   private static long dj = Long.reverse(-5431326810738397933L);
   private static int fb = -2147483632 >>> 223 | -2147483632 << -223;
   private static int et = (0 >>> 55 | 0 << -55) & -1;
   private static int gw = Integer.reverse(Integer.MIN_VALUE);
   private static int db = Integer.reverse(1207959552);
   private static int fn = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(720575940379279360L);
   private static long en = Long.reverse(-5431326810738397933L);
   private static int gb = (-1073741824 >>> 222 | -1073741824 << -222) & -1;
   private static int cs = (-536870911 >>> 29 | -536870911 << -29) & -1;
   private static int fq = 2424832 >>> 16 | 2424832 << -16;
   private static int gf = Integer.reverse(-536870912);
   private static int fo = Integer.reverse(603979776);
   private static long ck = Long.reverse(-5431326810738397933L);
   private static long bk = Long.reverse(-4710750870359118573L);
   private static long bt = Long.reverse(720575940379279360L);
   private static long fh = Long.reverse(720575940379279360L);
   private static int gz = Integer.reverse(0);
   private static int fi = Integer.reverse(0);
   private static int el = 1073741831 >>> 222 | 1073741831 << ~222 + 1;
   private static long ba = Long.reverse(-5431326810738397933L);
   private static int gt = 176160768 >>> 87 | 176160768 << ~87 + 1;
   private static long ei = Long.reverse(-4710750870359118573L);
   private static int az = (64 >>> 101 | 64 << -101) & -1;
   private static int gs = Integer.reverse(671088640);
   private static int dv = Integer.reverse(402653184);
   private static int cg = Integer.reverse(-1073741824);
   private static int gp = Integer.reverse(-2013265920);
   private static int ch = 0 >>> 149 | 0 << -149;
   private static int cr = 4096 >>> 11 | 4096 << ~11 + 1;
   private static int eb = 13312 >>> 41 | 13312 << -41;
   private static int av = 2 >>> 97 | 2 << ~97 + 1;
   private static long bf = Long.reverse(-4710750870359118573L);
   private static long bi = Long.reverse(-5431326810738397933L);
   private static String[] d = new String[NLoginCore_043.hf];
   private static int dl = Integer.reverse(-1476395008);
   private static int hf = Integer.reverse(335544320);
   private static long ee = Long.reverse(-4710750870359118573L);
   private static int gm = 29360128 >>> 181 | 29360128 << ~181 + 1;
   private static long aw = Long.reverse(-4710750870359118573L);
   private static int hd = Integer.reverse(0);
   private static long fg = Long.reverse(-4710750870359118573L);
   private static int gv = Integer.reverse(0);
   private static long cm = Long.reverse(-5431326810738397933L);
   private static int co = 58720256 >>> 54 | 58720256 << ~54 + 1;
   private static long ca = Long.reverse(-4710750870359118573L);

   @Override
   public List<String> b(NLoginInterface_042 var1, String var2, String[] var3) {
      if (var3.length <= fj) {
         ArrayList var9 = new ArrayList();
         String var10 = var3.length == 0 ? a(fk, fl ^ fm) : var3[var3.length - fn];
         if (!var10.isEmpty()) {
            for (NLoginCore_353 var13 : this.a) {
               String var15 = var13.e();
               if (var15.startsWith(var10.toLowerCase(Locale.ENGLISH)) && (var13.f() == null || var1.i(a(fo, fp)) || var1.i(var13.f()))) {
                  var9.add(var15);
               }
            }
         } else {
            for (NLoginCore_353 var14 : this.a) {
               String var16 = var14.f();
               if (var16 == null || var1.i(a(fq & fr, fs)) || var1.i(var16)) {
                  var9.add(var14.e());
               }
            }
         }

         Collections.sort(var9);
         return var9;
      } else {
         String var4 = var3[ft].toLowerCase(Locale.ENGLISH);
         NLoginCore_187 var5 = this.a.a();

         for (NLoginCore_353 var7 : this.a) {
            if (var4.equals(var7.e()) || var7.b().contains(var4)) {
               if (!(var7 instanceof NLoginCore_207) && !(var7 instanceof NLoginCore_131) && var1 instanceof NLoginCore_277 && !var5.b((NLoginCore_277)var1)) {
                  return null;
               } else {
                  String var8 = var7.f();
                  return var8 != null && !var1.i(a(fu, fv)) && !var1.i(var8) ? null : var7.c(var1, var4, Arrays.copyOfRange(var3, fw, var3.length));
               }
            }
         }

         return null;
      }
   }

   private void a(NLoginInterface_042 var1) {
      if (!var1.i(a(a, b ^ d)) && !var1.i(a(av, aw ^ ax))) {
         NLoginCore_150.a(var1, NLoginCore_487.y);
         if (var1 instanceof NLoginCore_277) {
            NLoginCore_150.a(var1, NLoginCore_194.F);
         }
      } else {
         NLoginCore_150.a(var1, a(az, ba));
         NLoginCore_150.a(
            var1,
            a(bc, bd)
               + this.a.q()
               + a(be, bf ^ bg)
               + this.a.s()
               + a(bh, bi)
               + this.a.a().G()
               + (this.a.a().ai() ? a(bj, bk ^ bl) : a(bm, bn ^ bo))
         );
         if (this.a.a().n() == bq) {
            NLoginCore_150.a(var1, a(br, bs ^ bt));
         }

         NLoginCore_150.a(var1, a(bv, bw ^ bx));
         if (this.a.isEmpty()) {
            NLoginCore_150.a(var1, a(bz, ca ^ cb));
         } else {
            if (var1 instanceof NLoginCore_277) {
               NLoginCore_277 var2 = (NLoginCore_277)var1;
               NLoginCore_509 var3 = this.a.a().b(var2);
               NLoginInterface_024 var4 = var3.a();
               boolean var5 = this.a.a().b(var2).j();

               for (NLoginCore_353 var7 : this.a) {
                  if (!var7.o()) {
                     String var8 = var7.f();
                     if (var8 == null || var2.i(var8)) {
                        List var9 = var7.b();
                        String var10;
                        if (var5) {
                           String var10000 = a(cd & ce, cf);
                           Object[] var10001 = new Object[cg];
                           var10001[ch] = var7.n() && NLoginCore_477.F.ar() ? a(ci & cj, ck) : a(cl, cm);
                           var10001[cn] = var8 == null ? a(co & cp, cq) : var8;
                           var10001[cr] = !var9.isEmpty() ? a(cs, ct ^ cu) + String.join(a(cv, cw ^ cx), var9) : a(cy, cz ^ da);
                           var10 = String.format(var10000, var10001);
                        } else {
                           String var14 = a(db & dc, dd);
                           Object[] var15 = new Object[de];
                           var15[df] = var7.n() && NLoginCore_477.F.ar() ? a(dg, dh) : a(di, dj);
                           var15[dk] = var8 == null ? a(dl, dm ^ dn) : var8;
                           var15[var_do] = !var9.isEmpty() ? a(dp & dq, dr) + String.join(a(ds, dt ^ du), var9) : a(dv & dw, dx);
                           var10 = String.format(var14, var15);
                        }

                        String var11 = var7.e();
                        var4.a(a(dy, dz ^ ea) + var11, var10, a(eb, ec) + var11);
                     }
                  }
               }

               NLoginCore_150.a(var2, NLoginCore_194.C);
            } else {
               for (NLoginCore_353 var13 : this.a) {
                  if (!var13.o()) {
                     NLoginCore_150.a(var1, a(ed, ee ^ ef) + var13.e());
                  }
               }
            }

            NLoginCore_150.a(var1, a(eh, ei ^ ej));
         }
      }
   }

   static {
      b();
   }

   @Override
   public void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (var3.length == 0) {
         this.a(var1);
      } else if (this.a.isEmpty()) {
         NLoginCore_150.a(var1, a(el & em, en));
      } else {
         NLoginCore_187 var4 = this.a.a();
         boolean var5 = var1 instanceof NLoginCore_277;
         String var6 = var3[ep].toLowerCase(Locale.ENGLISH);

         for (NLoginCore_353 var8 : this.a) {
            if (var6.equalsIgnoreCase(var8.e()) || var8.b().contains(var6)) {
               if (!(var8 instanceof NLoginCore_207) && !(var8 instanceof NLoginCore_131) && var5 && !var4.b((NLoginCore_277)var1)) {
                  return;
               } else {
                  String var9 = var8.f();
                  if (var9 != null && !var1.i(a(eq, er ^ es)) && !var1.i(var9)) {
                     NLoginCore_150.a(var1, NLoginCore_487.y);
                     if (var1 instanceof NLoginCore_277) {
                        NLoginCore_150.a(var1, NLoginCore_194.F);
                     }

                     return;
                  } else if (var5 && var8.n() && NLoginCore_477.F.ar()) {
                     if (var4.b((NLoginCore_277)var1).j()) {
                        NLoginCore_150.a(var1, a(eu, ev ^ ew));
                        NLoginCore_150.a(var1, a(ey, ez));
                     } else {
                        NLoginCore_150.a(var1, a(fb & fc, fd));
                        NLoginCore_150.a(var1, a(ff, fg ^ fh));
                     }

                     return;
                  } else {
                     var8.a(var1, var3);
                     return;
                  }
               }
            }
         }

         if (!var5 || var4.b((NLoginCore_277)var1)) {
            this.a(var1);
         }
      }
   }

   private static void b() {
      e = -3983566622199642755L;
      long var0 = e ^ -3371451457957107596L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(40 + 29),
               (byte)(74 + 9),
               (byte)(40 + 7),
               (byte)(56 + 11),
               (byte)(30 + 36),
               67,
               (byte)(3 + 44),
               80,
               (byte)(8 + 67),
               (byte)(33 + 34),
               (byte)(81 + 2),
               (byte)(26 + 27),
               (byte)(14 + 66),
               (byte)(64 + 33),
               (byte)(46 + 54),
               (byte)(79 + 21),
               (byte)(12 + 93),
               (byte)(74 + 36),
               (byte)(77 + 26)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_232.E("֣բշպճ֧՟֪֥ծ֢֍հվ֨֫\u0590ְֳֳֶַ֚֮֘֩շսւׁօք", (byte)114, 69);
               d[1] = NLoginCore_324.A("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 65);
               d[2] = NLoginCore_173.B("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 66);
               d[3] = NLoginCore_091.E("ևփն֪֚ըպս֢֡֩կ֔փ֧\u0590օְ֢ո֙֔ցւ", (byte)114, 69);
               d[4] = NLoginCore_453.C("ՖճսշՑՒՒիթչզՓ", (byte)114, 67);
               d[5] = NLoginCore_446.B("ƩƻǋǝƜƭƶǖơǔǆƫ", (byte)114, 66);
               d[6] = NLoginCore_397.F("ե՟֪\u058bշ֣ջ֞֍֘է֤ղց֑֦ցֵ֦֍֬\u058bֺ֚ևջ׀֎ֻֿ֡֡", (byte)114, 70);
               d[7] = NLoginCore_223.B("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 66);
               d[8] = NLoginCore_223.F("փբը֢֙վօ\u058c֝։և֒ծֲֵַַ֦֥֣֪֮֮֠֫տ֍֘յ֎֛֭", (byte)114, 70);
               d[9] = NLoginCore_232.F("ց։փմճ֚չջփ֞ցն", (byte)114, 70);
               d[10] = NLoginCore_110.F("֖֕զ֩՝գ֦֟և֣֨֩֩֫֕֬ֈյ֬֍ַ\u058c֒ոׁ֖֡֓֙׀֕րւ׃րֵּ֣֭֭֮֗֨\u058b\u05c8ֱֳ֧֣֤֡\u0590\u05caך֢֡", (byte)114, 70);
               d[11] = NLoginCore_397.D("ՑԼտՐմփաուՌշվխֈՍ֓֏Ջ֏ց֙֔֊֎ճլխ՛֎֙հռ֔֔ջղ֦թՠ֓։֎֮ռցְ֣֢֡ցւ\u058bօչչ\u0590ֱַֹ֛֮֯֕ս", (byte)114, 68);
               d[12] = NLoginCore_091.E("ձայ֙ի֢֬շ։\u058bցն", (byte)114, 69);
               d[13] = NLoginCore_110.A("ǖǗǎƞǈǋƢƾƣƻƺƫ", (byte)114, 65);
               d[14] = NLoginCore_223.D("քԿկզձ՜ֆէց՛թո\u058cՑլ՟՜֒\u0590ըենՐգլջխ՜յլլմր֎֧՟֦ֆ֘փմն֍փ֧ձռ֛լծֳָּ֥֭֔֫֔֨\u058c֪\u058bֳ־", (byte)114, 68);
               d[15] = NLoginCore_433.A("ƜǊƦǍƒƼǂǡǒǙƟǚǗƱǙǦǂǇƾǅǞƱǯǂƮǠƮưǀǱǎǄ", (byte)114, 65);
               d[16] = NLoginCore_451.F("֗ա՛֚֔բռոըւ֧ն", (byte)114, 70);
               d[17] = NLoginCore_384.A("ƶƾƸƩƨǏƮưƸǓƶƫ", (byte)114, 65);
               d[18] = NLoginCore_575.A("ƸƙƗƗƺƽƜƽǅƺǒǖǂƢǘƦƫǉƽǦǢǝǣǭǁǌƶǡǋǺǘǺǗƯǆǓǎǁǔǤǻƷǥǵǹǱǠȃȍǄǝǦǿȋȂǤǧȀȅǶǤǧȅǒ", (byte)114, 65);
               d[19] = NLoginCore_433.B("ƦƖƪǎƠǡǗƬƾǀƶƫ", (byte)114, 66);
               d[20] = NLoginCore_173.E("֢֡֙թ֖֓խ։ծֆօն", (byte)114, 69);
               d[21] = NLoginCore_521.B("ǆǗƩƬǁƓǡƟƟƭǢǢƻƺǃƣǙǢǭǍƾǜƾǦǃǃƶǬǊǨǓǼǵǨǨǵǲǋǔƹȄǿǤǁȆǙǸǷǂǛǋǭǟǤǯǧǰȂǷǩȌǒȋǕ", (byte)114, 66);
               d[22] = NLoginCore_232.C("ՎծտձցՔՁքբպց\u0590֎֑իգՒՇՖթ֙ք։֖֙Օո֑ձրկծ", (byte)114, 67);
               d[23] = NLoginCore_127.A("ǌƖƐǏǉƗƱƭƝƷǜƫ", (byte)114, 65);
               d[24] = NLoginCore_091.D("՞զՠՑՐշՖ\u0558ՠջ՞Փ", (byte)114, 68);
               d[25] = NLoginCore_004.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ\u0557ձժզպն֟֊ս֏մք", (byte)114, 67);
               d[26] = NLoginCore_127.D("շ՞վվՖթփփօածՓ", (byte)114, 68);
               d[27] = NLoginCore_471.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ\u0557ձժզպն֟֊ս֏մք", (byte)114, 67);
               d[28] = NLoginCore_223.E("ց։փմճ֚չջփ֞ցն", (byte)114, 69);
               d[29] = NLoginCore_387.D("ճղՃֆԺՀփռդօֆֆֈրղ։եՒ։ժ֔թկՕճ֞վհն֝ղ՝՟֠՝մ֒օ֊֊\u058bր֙ը֥֎վ\u0590քրցխַ֧վտ", (byte)114, 68);
               d[30] = NLoginCore_397.A("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 65);
               d[31] = NLoginCore_110.F(
                  "ՠֈ֕ց֚\u058cյխ\u058cքֆ֦ժօֱֲ֢֫֫ֈֲչֳռֵ֕֎ֲָֽ֓վ֝տջ־\u05cbָ\u05c9\u05cbօ׆\u05cdֻ֛֧֓֏ׅ\u0590יֲֳ֖֚֗היִֺ֯֙־ס֤֥שֵֽ֢ףז֬\u05caׂװֿ׳\u05f6ֲִעׯײׅ\u05fcי\u05ebם\u05cb\u05cdִ\u05f5וז׳",
                  (byte)114,
                  70
               );
               d[32] = NLoginCore_223.B("ƕƬƺǓǠƝƠƿǡǜƴƿƧǃƻǬƾƭǜǎǣǒǍǉƮǌǍǷƱƵƱƳƻǎǮǌǽƸǴƽǬƻȀǤǒȊǿǗǺǛǻǡǹȌȑȂǬȋǐǗǔǮȑǯǭǗǨȕǬȀǷȕǞǰǿȐǶǨȅǽǴșȥȪȡǨǯǭȥȳȣȪȄȘǲȰ", (byte)114, 66);
               d[33] = NLoginCore_127.A("ƦǆƬǌƩƲƪǠǢƺƵƴǓǠƢƳǦǖǗƺǘǉǌǄƱǳǧǃƷƹǕǨƷǭǬǐǳǋǗǒǐǞǹǦȉǸȋƽȆȇȊȐȑǞǌǥǪȕǮȈǷȓǳǒǒǩȍȍǵǛǺǾǣǭǱȒȑȔȔǪǻȋǤȏȮǹǶǷ", (byte)114, 65);
               d[34] = NLoginCore_004.B("ƪƼǉƼƝǘǑǤǥǝǅǨǁǦơǧǉƽƪƸƨƿǨǥƲǩǕǭǫǕǙǎǚǕǴǮǭǎǜǂǓǥǆǥȄǣǈǛȍȆǶȉǏǯǾǡȁȔȉȊȓȕȏȅǼȉǞǕǖȜȔǾȠȀǝǫ", (byte)114, 66);
               d[35] = NLoginCore_451.F("ց։փմճ֚չջփ֞ցն", (byte)114, 70);
               d[36] = NLoginCore_241.D("ՎՃՁՃւբճը\u0557դՎս\u0558֊Ռկ՝ևէ֑ոա՞՟", (byte)114, 68);
               d[37] = NLoginCore_559.C("ՎՃՁՃւբճը\u0557դՎս\u0558֊Ռկ՝ևէ֑ոա՞՟", (byte)114, 67);
               d[38] = NLoginCore_173.B("ƦƛƙƛǚƺǋǀƯƼƦǕưǢƤǇƵǟƿǩǐƹƶƷ", (byte)114, 66);
               d[39] = NLoginCore_453.F("հ֒եփվ֦֚֚֝֘ըփ֊\u058bտ֭֩յ֢\u058c֥֮յֹֻ֝֘չ֛վ֝֎րֈֵֻֽֈֿׁ֚֩\u058c֖", (byte)114, 70);
               break;
            case 1:
               d[0] = NLoginCore_141.D("րԿՔ\u0557ՐքԼևւՋտժՍ՛օֈխ\u0590֓\u0590֔\u058bմշ\u058cՔզ՜֑ի֛պ֠֎֞ց֜ցսբֈ֚֠ճ", (byte)114, 68);
               d[1] = NLoginCore_201.E("ձզդզ֥օ֖\u058bպևգֆ\u058bְ֪յָֺ֢֬֔֯ցւ", (byte)114, 69);
               d[2] = NLoginCore_521.F("հշ֜֓սմշոշ֝չն", (byte)114, 70);
               d[3] = NLoginCore_387.C("դՠՓշևՅ\u0557՚տվևօ\u0558Ց֒՝՟֓դֆճմշֆքծ\u0558֎֓պ֙֜", (byte)114, 67);
               d[4] = NLoginCore_387.F("ջյ֠ք֖և֕֙տր֟ն", (byte)114, 70);
               d[5] = NLoginCore_387.A("ǅƚƵƘƸƚǡǢƝǅƝƫ", (byte)114, 65);
               d[6] = NLoginCore_521.D("ՂԼևըՔր\u0558ջժյՄցՏ՞ծփ՞֒փժ։ըո֎֛նզսՖլ\u058c֠", (byte)114, 68);
               d[7] = NLoginCore_521.F("՝֓չ֤է֪վսկ֘ցն", (byte)114, 70);
               d[8] = NLoginCore_004.A("ƸƗƝǗǎƳƺǁǒƾƼǇƣǕǛǧǚǬǣǣǘǡǡǏǯǩǕǪǐǡǦƸǗǚǾǴƲȁǽǙƿƷǼǋ", (byte)114, 65);
               d[9] = NLoginCore_110.C("ՐԷռ՚ևՕնՆտՙքՓ", (byte)114, 67);
               d[10] = NLoginCore_384.F("֖֕զ֩՝գ֦֟և֣֨֩֩֫֕֬ֈյ֬֍ַ\u058c֒ոׁ֖֡֓֙׀֕րւ׃րֵּ֣֭֭֮֗֨։։ׇ֡֡\u05cdִ׆֣֤֢֔֡", (byte)114, 70);
               d[11] = NLoginCore_076.B("ƩƔǗƨǌǛƹǐǚƤǏǖǅǠƥǫǧƣǧǙǱǬǢǦǋǄǅƳǦǱǈǔǬǬǓǊǾǁƸǫǡǦȆǔǙǹǻȈǺǙǚǣǝǉǤȓȐǾǫȈȃȂǬǒ", (byte)114, 66);
               d[12] = NLoginCore_384.D("ց՛ՃռվբՠԽ՛֎ը֏ՠչՈ։իՇեՔֆա՞՟", (byte)114, 68);
               d[13] = NLoginCore_553.F("ռսֆք\u058c֊յ֬֙ծջ֊ևսձ֨հ֏ց֘փֺցւ", (byte)114, 70);
               d[14] = NLoginCore_453.E("֧բ֒։֔տ֩֊֤վ\u058c֛֯մ֏ւտֳֵ\u058bֈ֙ճֆ֏֞\u0590տ֘֏֏ֱ֣֗\u05caւ\u05c9ְֻ֦֦֩֗֙\u05ca֔֟־֏֑זאַ\u05cb֮אל֮֮ךֵ֬צ֣", (byte)114, 69);
               d[15] = NLoginCore_223.A("ƜǊƦǍƒƼǂǡǒǙƟǚǗƱǙǦǂǇƾǅǞƨƬǱǎǢƯǓǤƴƬǚ", (byte)114, 65);
               d[16] = NLoginCore_427.F("վ֚֩ոէռ֊֭֏֯֯ն", (byte)114, 70);
               d[17] = NLoginCore_384.F("֒֩ճ֧զ\u058cթ֏շ֨ցն", (byte)114, 70);
               d[18] = NLoginCore_091.B("ƸƙƗƗƺƽƜƽǅƺǒǖǂƢǘƦƫǉƽǦǢǝǣǭǁǌƶǡǋǺǘǺǗƯǆǓǎǁǔǤǻƷǥǵǹǱǠȃȍǄǝǦǿȁǏȉȊǋǡǍǳȖȐȜǨǺǸȚǨȘțǭȝǷǥǫ", (byte)114, 66);
               d[19] = NLoginCore_433.A("ƔƾƨƝǘǙƲǀǂǆƘƯǞơǛƼǜƹǣƯǘƹƶƷ", (byte)114, 65);
               d[20] = NLoginCore_575.C("Խկ՜՛ֈզժռախփՊբ֏ռհհՌժՔ\u0557և՞՟", (byte)114, 67);
               d[21] = NLoginCore_138.C("ծտՑՔթԻ։ՇՇՕ֊֊գբիՋց֊֕յզքզ֎իի՞֔ղ\u0590ջ֤֝\u0590\u0590֚֝ճռա֧֬\u058cթ֮ց֠֟ժփճ֕ևցօ֦պև֩֎ֳ֝\u058cջ", (byte)114, 67);
               d[22] = NLoginCore_427.F("ձ֑֢֤֔շդ֧օֱֳִ֤֝֎ֆյժչ\u058cּּ֙մ־ֹֹֻֿ֢֬֙", (byte)114, 70);
               d[23] = NLoginCore_427.D("նճպ՝ատ՚Ֆ՚չծՓ", (byte)114, 68);
               d[24] = NLoginCore_173.D("ՍֆֆՂփ\u0558ՒշքիֈՓ", (byte)114, 68);
               d[25] = NLoginCore_530.F("օ֣֊ճ֩ռ֊֝֏բփ֒ե֟խ֕\u058bֲո֍պ֧կֲֵָָ֯֗֯֕֜", (byte)114, 70);
               d[26] = NLoginCore_027.D("քֆղՑՓ՚ԼՄա՚սՊ՜Պց֒\u058cՎնէծձ՞՟", (byte)114, 68);
               d[27] = NLoginCore_173.C("բրէՐֆՙէպլԿՠկՂռՊղը֏Օժ\u0557ղշօի\u0590\u058cժն֡֙՞", (byte)114, 67);
               d[28] = NLoginCore_575.A("ƶƼǑƾǝǓƬƣǚǏƥƫ", (byte)114, 65);
               d[29] = NLoginCore_397.A("ǋǊƛǞƒƘǛǔƼǝǞǞǠǘǊǡƽƪǡǂǬǁǇƭǋǶǖǈǎǵǊƵƷǸƵǌǪǝǢǢǣǘǰǰȈǚǡȌǵǼǎǺǜȏǖǗ", (byte)114, 65);
               d[30] = NLoginCore_141.F("ձզդզ֥օ֖\u058bպևէֱ։ֳ֤ձկָֹ֑֮֬\u058b֚֬֍ַַׅ֭֡֕", (byte)114, 70);
               d[31] = NLoginCore_091.D(
                  "Խեղ՞շթՒՊթագփՇբ֎֏ֈֈտե֏Ֆ\u0590ՙղ֒իհ֏֚֕՛պ՜\u0558֛֦֨֕֨բ֣֪ո֘հքլ֢խֶմ\u0590ճշ֏ֱֶ֗\u058cն֑֛־ցւ׆֒տ֚׀ֳ։֧֟\u05cd֜אד֑֏ֿ\u05cc\u05cf֢ך֫֙ל֛֧ג֖\u05ceד\u05ce",
                  (byte)114,
                  68
               );
               d[32] = NLoginCore_232.B(
                  "ƕƬƺǓǠƝƠƿǡǜƴƿƧǃƻǬƾƭǜǎǣǒǍǉƮǌǍǷƱƵƱƳƻǎǮǌǽƸǴƽǬƻȀǤǒȊǿǗǺǛǻǡǹȌȑȂǬȋǐǗǔǮȑǯǭǗǨȕǬȀǷȕǞǰǿȐǶǨȅǽǴșȥȪȡǫȠǳȫȫȶȑȓȅȌǸȚȐȻȋȺǻȳȓȴȘɀȋ", (byte)114, 66
               );
               d[33] = NLoginCore_091.C(
                  "ՎծՔմՑ՚Ւֈ֊բ՝՜ջֈՊ՛֎վտբրձմլՙ֛֏ի՟աս\u0590՟֕֔ո֛ճտպոֆ֡֎ֱֳ֠եֲָֹ֮֯ֆմ֍ְֻֽ֖֛֒֟պպֵֵ֑֝փ֢֦\u058b֛֕֙֜א֢\u05ce֪\u058b׆ׇ֦ח֞֟", (byte)114, 67
               );
               d[34] = NLoginCore_553.F(
                  "յև֔ևըְ֣֜֯֨\u0590ֳ\u058cֱլֲ֔ֈյփճ֊ְֳսִֶָָֹֿ֤֥֧֠֠֙֠֙֍ְְ֑֞\u05cf֦֮֓טבׁהֺ֚\u05c9֬\u05ccןהומנךאףךּנזׅתףאב\u05ca\u05edפ׳\u05f5ץאֱ׆\u05cf\u05c9הׁׂ",
                  (byte)114,
                  70
               );
               d[35] = NLoginCore_141.E("՞֓յժմ։զֆջ֣֫ն", (byte)114, 69);
               d[36] = NLoginCore_397.A("ƦƛƙƛǚƺǋǀƯƼƦǔǘǘǘǥƴǬǦƾǩǄƨǏǌǶǴƳǢǋǶǮ", (byte)114, 65);
               d[37] = NLoginCore_559.A("ƦƛƙƛǚƺǋǀƯƼƥǅƴƿƠǟƧǠǬǆǃƹƶƷ", (byte)114, 65);
               d[38] = NLoginCore_384.B("ƦƛƙƛǚƺǋǀƯƼƘơǟǕƴƸǩǡƶǅǪǟƶƷ", (byte)114, 66);
               d[39] = NLoginCore_453.E("հ֒եփվ֦֚֚֝֘ըփ֊\u058bտ֭֩յ֢\u058c֥֮յֹֻ֝֘չ֛վ֝֎\u0590ַ֣֖֘֙֬ևׇֿ֤\u058c֨׀֦֎֣֖֣֛֓ך֢֡", (byte)114, 69);
               break;
            case 2:
               d[0] = NLoginCore_004.A("ǏǉƜƿǘƚƘǂǌƸǔǞƧǘƺǀƢǧǞǊǇǊƪǋƳǣǀǋǄǰǊǓ", (byte)114, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_446.E("դւզ֘֩֠֬ևեիծօրց֯֬ևְ֓ւո֔ցւ", (byte)114, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 80L;
      var1 ^= -3371451457957107596L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(63 + 6),
                     (byte)(56 + 27),
                     (byte)(35 + 12),
                     (byte)(52 + 15),
                     (byte)(7 + 59),
                     (byte)(61 + 6),
                     (byte)(9 + 38),
                     (byte)(14 + 66),
                     (byte)(14 + 61),
                     (byte)(58 + 9),
                     (byte)(69 + 14),
                     53,
                     (byte)(55 + 25),
                     (byte)(32 + 65),
                     (byte)(93 + 7),
                     100,
                     (byte)(63 + 42),
                     (byte)(25 + 85),
                     (byte)(76 + 27)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(6 + 77)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.B("òÿþÁāýøāČûÈĆĊăĆČÎѧеѫѨѥюцѐѭѫ", (byte)8, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   public NLoginCore_043(NLoginCore_466 var1) {
      super(var1);
      this.b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_043.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.A("ƝƿǁơǅǤǜǲǞƭǫǡǯǩƲǗǹǸǰǶǰǅ", (byte)123, 65), NLoginCore_043.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.D("։֖֕\u0558֘֔֏֣֘֒՟֣֚֝֡֝եࣾ࣌ंࣿࣼࣥࣝࣧऄंջ", (byte)123, 68) + var1 + NLoginCore_451.A("Ư", (byte)123, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   public void s() {
      Class[] var10000 = new Class[fx];
      var10000[fy] = NLoginCore_441.class;
      var10000[fz] = NLoginCore_067.class;
      var10000[ga] = NLoginCore_274.class;
      var10000[gb] = NLoginCore_340.class;
      var10000[gc] = NLoginCore_505.class;
      var10000[gd] = NloginchangepassCommand.class;
      var10000[ge] = NloginchangeuuidCommand.class;
      var10000[gf] = NLoginCore_376.class;
      var10000[gg] = NlogindeleteCommand.class;
      var10000[gh] = NLoginCore_503.class;
      var10000[gi] = NLoginType_022.class;
      var10000[gj] = NloginregisterCommand.class;
      var10000[gk] = NloginunbanCommand.class;
      var10000[gl] = NloginunregisterCommand.class;
      var10000[gm] = NloginverifyCommand.class;
      var10000[gn] = NLoginCore_005.class;
      var10000[go] = NLoginCore_431.class;
      var10000[gp] = NLoginCore_131.class;
      var10000[gq] = NLoginCore_296.class;
      var10000[gr] = NLoginCore_485.class;
      var10000[gs] = NLoginCore_396.class;
      var10000[gt] = SpawnCommand.class;
      var10000[gu] = NLoginCore_207.class;
      Class[] var1 = var10000;
      ArrayList var2 = new ArrayList();
      Class[] var3 = var1;
      int var4 = var1.length;

      for (int var5 = gv; var5 < var4; var5++) {
         Class var6 = var3[var5];

         try {
            Class[] var10001 = new Class[gw];
            var10001[gx] = NLoginType_008.class;
            Constructor var9 = var6.getConstructor(var10001);
            Object[] var10 = new Object[gy];
            var10[gz] = this.a;
            NLoginCore_353 var7 = (NLoginCore_353)var9.newInstance(var10);
            var2.add(var7);
         } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException var8) {
            NLoginCore_370.c(a(ha, hb ^ hc) + var6.getSimpleName(), var8);
         }
      }

      var2.sort((var0, var1x) -> var0.e().compareToIgnoreCase(var1x.e()));
      this.a = var2;
   }
}
