package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_295 extends NLoginType_002 {
   private static int lt = (112 >>> 4 | 112 << ~4 + 1) & -1;
   private static int kv = Integer.reverse(-1);
   private static int ei = Integer.reverse(0);
   private static int lq = 3 >>> 255 | 3 << ~255 + 1;
   private static int lj = (14680064 >>> 180 | 14680064 << -180) & -1;
   private static int df = 532676608 >>> 85 | 532676608 << ~85 + 1;
   private static int km = Integer.reverse(0);
   private static int cw = -1073741821 >>> 254 | -1073741821 << -254;
   private static int bv = Integer.reverse(-1073741824);
   private static int lu = (1140850688 >>> 154 | 1140850688 << ~154 + 1) & -1;
   private static int jz = (0 >>> 76 | 0 << -76) & -1;
   private static int lf = Integer.reverse(-1073741824);
   private static int bk = 8192 >>> 13 | 8192 << -13;
   private static final List<String> g;
   private static int gi = Integer.reverse(Integer.MIN_VALUE);
   private static long de = Long.reverse(2141878823347187465L);
   private static int lc = Integer.reverse(805306368);
   private static int cc = Integer.reverse(Integer.MIN_VALUE);
   private static int kr = (18874368 >>> 212 | 18874368 << ~212 + 1) & -1;
   private static int ks = Integer.reverse(268435456);
   private static int el = (Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << -94) & -1;
   private static int fk = Integer.reverse(-1);
   private static long bu = Long.reverse(5188146770730811392L);
   private static long kw = Long.reverse(2141878823347187465L);
   private static int kn = (4608 >>> 9 | 4608 << ~9 + 1) & -1;
   private static int lm = (320 >>> 166 | 320 << ~166 + 1) & -1;
   private static int ge = Integer.reverse(268435456);
   private static int du = Integer.reverse(0);
   private static int bb = Integer.reverse(1073741824);
   private static long gc = Long.reverse(2141878823347187465L);
   private static int cy = Integer.reverse(Integer.MIN_VALUE);
   private static int dc = (1073741824 >>> 92 | 1073741824 << ~92 + 1) & -1;
   private static int lb = Integer.reverse(1073741824);
   private static int da = 0 >>> 229 | 0 << -229;
   private static long ll = Long.reverse(2141878823347187465L);
   private static long fm = Long.reverse(2141878823347187465L);
   private static int kl = 2097152 >>> 245 | 2097152 << -245;
   private static String[] e = new String[NLoginCore_295.kq];
   private static long ca = Long.reverse(2141878823347187465L);
   private static long bi = Long.reverse(2141878823347187465L);
   private static int cd = 8388608 >>> 182 | 8388608 << -182;
   private static int lr = Integer.reverse(134217728);
   private static int cg = Integer.reverse(0);
   private static int fe = (10485760 >>> 213 | 10485760 << -213) & -1;
   private static int kt = Integer.reverse(0);
   private static int hm = -536870911 >>> 157 | -536870911 << -157;
   private static int iy = (536870912 >>> 55 | 536870912 << -55) & -1;
   private static int jy = Integer.reverse(0);
   private static int gz = Integer.reverse(0);
   private static int ga = Integer.reverse(-1);
   private static int lg = Integer.reverse(-1342177280);
   private static long bl = Long.reverse(2141878823347187465L);
   private static long fg = Long.reverse(5188146770730811392L);
   private static int kh = Integer.reverse(0);
   private static long ls = Long.reverse(2141878823347187465L);
   private static int fd = 0 >>> 66 | 0 << -66;
   private static int fp = '\ue000' >>> 141 | 57344 << ~141 + 1;
   private static int dz = Integer.reverse(0);
   private static int ez = Integer.reverse(Integer.MIN_VALUE);
   private static int gx = (8388608 >>> 151 | 8388608 << -151) & -1;
   private static int dq = 0 >>> 83 | 0 << ~83 + 1;
   private static int cs = (4096 >>> 76 | 4096 << ~76 + 1) & -1;
   private static int dl = 131072 >>> 17 | 131072 << -17;
   private static int var_do = Integer.reverse(0);
   private static int ko = (-1 >>> 176 | -1 << -176) & -1;
   private static long lh = Long.reverse(2141878823347187465L);
   private static String[] f = new String[kr];
   private static int lk = Integer.reverse(-1);
   private static int kx = Integer.reverse(Integer.MIN_VALUE);
   private static long la = Long.reverse(2141878823347187465L);
   private static int by = Integer.reverse(-1);
   private static int ku = 40 >>> 130 | 40 << ~130 + 1;
   private static int ld = Integer.reverse(-1);
   private static int dt = 0 >>> 214 | 0 << -214;
   private static int cq = (2 >>> 65 | 2 << -65) & -1;
   private static int gf = Integer.reverse(-1);
   private static int bd = Integer.reverse(Integer.MIN_VALUE);
   private static long gg = Long.reverse(2141878823347187465L);
   private static int bg = Integer.reverse(0);
   private static int fi = Integer.reverse(1610612736);
   private static int var_if = Integer.reverse(Integer.MIN_VALUE);
   private static long bt = Long.reverse(6177104089471151881L);
   private static int hp = 16 >>> 35 | 16 << -35;
   private static int kg = Integer.reverse(0);
   private static int li = Integer.reverse(536870912);
   private static int be = (0 >>> 178 | 0 << -178) & -1;
   private static int gj = Integer.reverse(0);
   private static long g;
   private static long kp = Long.reverse(2141878823347187465L);
   private static long ff = Long.reverse(6177104089471151881L);
   private static int dd = Integer.reverse(-1);
   private static int ho = Integer.reverse(0);
   private static int br = Integer.reverse(0);
   private static int ky = 92274688 >>> 87 | 92274688 << -87;
   private static int ln = Integer.reverse(-268435456);
   private static int dj = (0 >>> 77 | 0 << -77) & -1;
   private static int dw = (512 >>> 201 | 512 << ~201 + 1) & -1;
   private static int jk = Integer.reverse(-1);
   private static long lo = Long.reverse(6177104089471151881L);
   private static long lv = Long.reverse(6177104089471151881L);
   private static long lp = Long.reverse(5188146770730811392L);
   private static int dg = Integer.reverse(1073741824);
   private static int kz = -1 >>> 40 | -1 << -40;
   private static long le = Long.reverse(2141878823347187465L);
   private static int bs = 16384 >>> 173 | 16384 << -173;
   private static int hl = Integer.reverse(0);
   private static int kd = 64 >>> 70 | 64 << ~70 + 1;
   private static int fo = 0 >>> 147 | 0 << ~147 + 1;
   private static int gn = (1048576 >>> 116 | 1048576 << ~116 + 1) & -1;
   private static long lw = Long.reverse(5188146770730811392L);
   private static int kc = (0 >>> 240 | 0 << ~240 + 1) & -1;
   private static int ee = 8 >>> 34 | 8 << ~34 + 1;
   private static int kq = Integer.reverse(1207959552);
   private static int hj = 536870912 >>> 157 | 536870912 << ~157 + 1;
   private static int ek = 1048576 >>> 244 | 1048576 << ~244 + 1;
   private static int ct = Integer.reverse(0);
   private static int di = Integer.reverse(0);
   private static int dr = 4096 >>> 12 | 4096 << ~12 + 1;

   @Override
   protected void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginInterface_038 var3, String var4, String[] var5) {
      if (var5.length != el) {
         NLoginCore_487 var10 = NLoginCore_487.x;
         Object[] var13 = new Object[ez];
         var13[fd] = a(fe, ff ^ fg)
            + var4.toLowerCase(Locale.ENGLISH)
            + a(fi & fk, fm)
            + var5[fo].toLowerCase(Locale.ENGLISH)
            + a(fp & ga, gc)
            + this.a.u()
            + a(ge & gf, gg);
         NLoginCore_150.a(var1, var10, var13);
      } else {
         String var6 = this.a.b(var2);
         if (var6 == null) {
            NLoginCore_487 var9 = NLoginCore_487.aj;
            Object[] var12 = new Object[gi];
            var12[gj] = this.a.u();
            NLoginCore_150.a(var1, var9, var12);
         } else {
            String var7 = var5[gn];
            if (!var6.equalsIgnoreCase(var7)) {
               NLoginCore_487 var8 = NLoginCore_487.bk;
               Object[] var11 = new Object[gx];
               var11[gz] = this.a.u();
               NLoginCore_150.a(var1, var8, var11);
            } else if (this.a.b(var2, NLoginCore_137.b) && this.a.d(var2)) {
               NLoginCore_487 var10001 = NLoginCore_487.ao;
               Object[] var10002 = new Object[hj];
               var10002[hl] = hm;
               NLoginCore_150.a(var1, var10001, var10002);
            } else {
               var3.b(var2, var1);
               NLoginCore_150.a(var1, NLoginCore_487.ax);
            }
         }
      }
   }

   private static void b() {
      g = -8001118041022751318L;
      long var0 = g ^ -6642237469917545936L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(6 + 62),
               (byte)(37 + 32),
               (byte)(60 + 23),
               (byte)(24 + 23),
               67,
               (byte)(60 + 6),
               (byte)(44 + 23),
               (byte)(2 + 45),
               80,
               (byte)(64 + 11),
               (byte)(19 + 48),
               (byte)(47 + 36),
               (byte)(29 + 24),
               (byte)(58 + 22),
               (byte)(28 + 69),
               (byte)(67 + 33),
               (byte)(21 + 79),
               (byte)(21 + 84),
               (byte)(59 + 51),
               (byte)(65 + 38)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_141.D("ӀҕҘҰҘҿҿҕҔҾҼғ", (byte)50, 68);
               f[1] = NLoginCore_575.F("Ն\u0557ՄՃՋԽԦՌՀ՟ԨԶ", (byte)50, 70);
               f[2] = NLoginCore_559.D("ҙҶҒҹѿғ҅Ҹҫҭӈғ", (byte)50, 68);
               f[3] = NLoginCore_241.B("ĹĹŒįŒİőŚĠķŘī", (byte)50, 66);
               f[4] = NLoginCore_138.F("գՆՂԣաԾԹլաԮՑԶ", (byte)50, 70);
               f[5] = NLoginCore_127.A("ŘĭİňİŗŗĭĬŖŔī", (byte)50, 65);
               f[6] = NLoginCore_183.C("ңҴҡҠҨҚ҃ҩҝҼ҅ғ", (byte)50, 67);
               f[7] = NLoginCore_530.F("ԼՙԵ՜ԢԶԨ՛ՎՐիԶ", (byte)50, 70);
               f[8] = NLoginCore_451.C("ҡҡҺҗҺҘҹӂ҈ҟӀғ", (byte)50, 67);
               f[9] = NLoginCore_241.C("ӀңҟҀҾқҖӉҾҋҮғ", (byte)50, 67);
               f[10] = NLoginCore_183.F("\u0557զ՛ԧՉխաՊգՄխԿՊՊՔՖՁՓՋՍՕժՁՂ", (byte)50, 70);
               f[11] = NLoginCore_091.A("ĦŜĳĞĮĻŠĳŝőŏŞŝőĴŉśğĽŅŝşĶķ", (byte)50, 65);
               f[12] = NLoginCore_384.C("ҺҲӂӂ҅҇ҁҬӅҩ҄ҥҧҧҺ҉ҭғҵҶҨҡҞҟ", (byte)50, 67);
               f[13] = NLoginCore_575.E("ՠ՛ՒՇ՜Զը՚ԽհժՎկՈԫԴըԸԱ\u0530ռպՁՂ", (byte)50, 69);
               f[14] = NLoginCore_110.D("ҕҡҀӇӃҠҾӄҌӁ҄ҽӊ҈ҿғӓӐӕ҉ҐұҞҟ", (byte)50, 68);
               f[15] = NLoginCore_183.D("ӂҭҥѾұ҃ӂҦҵҸҙҼҜұқ҅ӐҤҰґұҡҞҟ", (byte)50, 68);
               f[16] = NLoginCore_127.F("դ\u0557ԼՖՀԹ՞ՂՁԨգՓԲձՖՆյկթԸհՄՁՂ", (byte)50, 70);
               f[17] = NLoginCore_173.A("ĭŊĩşĚĞŖĴĤġśĽĽķĲŉţŢŖšōşĶķ", (byte)50, 65);
               break;
            case 1:
               f[0] = NLoginCore_110.E("ԱԼՂՇԡԞԿՁբ՟գԶ", (byte)50, 69);
               f[1] = NLoginCore_092.E("ՕգԼ\u0558ԢԷխՉգԬկԶ", (byte)50, 69);
               f[2] = NLoginCore_091.A("ĹĩĸĲŕŚŞţĬĞĝī", (byte)50, 65);
               f[3] = NLoginCore_427.D("ӃҀҎҒ҄ӃӋҚӇҟҞғ", (byte)50, 68);
               f[4] = NLoginCore_183.E("\u0530ԶՑԩՌԬՅՙՉՀԨԶ", (byte)50, 69);
               f[5] = NLoginCore_453.C("ѼғҒҼұҶҠ҃҇ҡҮғ", (byte)50, 67);
               f[6] = NLoginCore_201.F("ՠԧժդՋՠԵՄՅԩՅԶ", (byte)50, 70);
               f[7] = NLoginCore_324.D("ҵѾҠҶҰҩҁӉҨҥҦғ", (byte)50, 68);
               f[8] = NLoginCore_433.C("ҝҎҚҸ҂ҴғҔҠӁҼғ", (byte)50, 67);
               f[9] = NLoginCore_241.F("ՄԸԸՖԨՅՕբՍԯՁԶ", (byte)50, 70);
               f[10] = NLoginCore_092.E("\u0557զ՛ԧՉխաՊգՄիեԫԬՖՀԮՕՐԱԱժՁՂ", (byte)50, 69);
               f[11] = NLoginCore_141.E("ԱէԾԩԹՆիԾը՜ՑԯԿծՇՠՆԸբԵէԸԶՐԻղոբՙսՒտ", (byte)50, 69);
               f[12] = NLoginCore_387.D("ҺҲӂӂ҅҇ҁҬӅҩҎ҇ҚҌҲҜҳҐҠңҲӗӂҘҖҹҽҩҘҷӍҹ", (byte)50, 68);
               f[13] = NLoginCore_223.F("ՠ՛ՒՇ՜Զը՚Խհը՜ըՎյՇԲԷ\u0530Շ՛ժՁՂ", (byte)50, 70);
               f[14] = NLoginCore_141.C("ҕҡҀӇӃҠҾӄҌӁҀӎһӄҍҢҭңҒҕӒҡҞҟ", (byte)50, 67);
               f[15] = NLoginCore_451.C("ӂҭҥѾұ҃ӂҦҵҸҙӁ҂ҚҽӓӋӌґҷӓӇҞҟ", (byte)50, 67);
               f[16] = NLoginCore_232.D("ӁҴҙҳҝҖһҟҞ҅ӁӃҩҋҠӍҬҋӊҭҳӇҞҟ", (byte)50, 68);
               f[17] = NLoginCore_530.A("ĭŊĩşĚĞŖĴĤġŚŧţşŕŨĴŚŅśŜůĶķ", (byte)50, 65);
               break;
            case 2:
               f[0] = NLoginCore_553.E("ՄՒՉՀՉԢթ՛ԫՃՉԶ", (byte)50, 69);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_127.E("Եՠ՛՞ԡԾ՞ՆԺՏ՛Զ", (byte)50, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 18L;
      var1 ^= -6642237469917545936L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(30 + 38),
                     (byte)(19 + 50),
                     (byte)(53 + 30),
                     47,
                     (byte)(2 + 65),
                     (byte)(38 + 28),
                     (byte)(10 + 57),
                     (byte)(6 + 41),
                     (byte)(11 + 69),
                     (byte)(58 + 17),
                     (byte)(21 + 46),
                     (byte)(4 + 79),
                     53,
                     (byte)(37 + 43),
                     (byte)(32 + 65),
                     (byte)(14 + 86),
                     (byte)(10 + 90),
                     (byte)(9 + 96),
                     (byte)(16 + 94),
                     (byte)(29 + 74)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.B("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӴӨӂӧӄӹөӼӸӷ", (byte)78, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   @Override
   protected List<String> b(NLoginInterface_042 var1, String var2, String[] var3) {
      if (var3.length == hp) {
         String var4 = var3[var_if];
         if (!var4.isEmpty()) {
            int var5 = var4.lastIndexOf(iy);
            if (var5 != jk) {
               List var6 = NLoginCore_363.s.a(new Object[jy]);
               List var7 = NLoginCore_363.t.a(new Object[jz]);
               if (!var6.isEmpty()) {
                  return var6.stream()
                     .map(var0 -> a(kn & ko, kp) + var0)
                     .filter(var2x -> var2x.toLowerCase(Locale.ENGLISH).startsWith(var4.substring(var5)))
                     .filter(var1x -> (boolean)(!var7.contains(var1x) ? kl : km))
                     .map(var2x -> var4.substring(kh, var5) + var2x)
                     .collect(Collectors.toList());
               }

               return g.stream()
                  .filter(var2x -> var2x.toLowerCase(Locale.ENGLISH).startsWith(var4.substring(var5)))
                  .filter(var1x -> (boolean)(!var7.contains(var1x) ? kd : kg))
                  .map(var2x -> var4.substring(kc, var5) + var2x)
                  .collect(Collectors.toList());
            }
         }
      }

      return super.b(var1, var2, var3);
   }

   static {
      b();
      String[] var10000 = new String[ks];
      var10000[kt] = a(ku & kv, kw);
      var10000[kx] = a(ky & kz, la);
      var10000[lb] = a(lc & ld, le);
      var10000[lf] = a(lg, lh);
      var10000[li] = a(lj & lk, ll);
      var10000[lm] = a(ln, lo ^ lp);
      var10000[lq] = a(lr, ls);
      var10000[lt] = a(lu, lv ^ lw);
      g = Arrays.asList(var10000);
   }

   @Override
   protected void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginCore_509 var3, NLoginInterface_038 var4, String var5, String[] var6) {
      if (var6.length != bb) {
         NLoginCore_487 var18 = NLoginCore_487.x;
         Object[] var23 = new Object[bd];
         var23[be] = a(bg, bi)
            + var5.toLowerCase(Locale.ENGLISH)
            + a(bk, bl)
            + var6[br].toLowerCase(Locale.ENGLISH)
            + a(bs, bt ^ bu)
            + this.a.u()
            + a(bv & by, ca);
         NLoginCore_150.a(var1, var18, var23);
      } else {
         String var7 = var6[cc].toLowerCase(Locale.ENGLISH);
         String var8 = this.a.a(var2);
         if (var8 != null && this.a.b(var2, NLoginCore_137.a)) {
            if (var8.equalsIgnoreCase(var7)) {
               NLoginCore_487 var17 = NLoginCore_487.aq;
               Object[] var22 = new Object[cd];
               var22[cg] = this.a.u();
               var22[cq] = var8;
               NLoginCore_150.a(var1, var17, var22);
               return;
            }

            if (this.a.d(var2)) {
               NLoginCore_487 var16 = NLoginCore_487.ao;
               Object[] var21 = new Object[cs];
               var21[ct] = cw;
               NLoginCore_150.a(var1, var16, var21);
               return;
            }
         }

         if (var2.a().l() != null) {
            NLoginCore_487 var15 = NLoginCore_487.ak;
            Object[] var20 = new Object[cy];
            var20[da] = this.a.u();
            NLoginCore_150.a(var1, var15, var20);
         } else {
            String[] var9 = var7.split(a(dc & dd, de));
            if (var7.length() < df && var9.length == dg) {
               List var10 = NLoginCore_363.s.a(new Object[dj]);
               if (!var10.isEmpty() && !var10.contains(var9[dl].toLowerCase(Locale.ENGLISH))) {
                  NLoginCore_150.a(var1, NLoginCore_487.bl);
               } else {
                  List var11 = NLoginCore_363.t.a(new Object[dq]);
                  if (!var11.isEmpty() && var11.contains(var9[dr].toLowerCase(Locale.ENGLISH))) {
                     NLoginCore_150.a(var1, NLoginCore_487.bl);
                  } else {
                     String var12 = this.a.a().a().a().cA;
                     if (var12.equalsIgnoreCase(var7)) {
                        NLoginCore_150.a(var1, NLoginCore_487.bm);
                     } else {
                        int var13 = NLoginCore_363.q.r();
                        if (var13 > 0 && this.a.a(this.a, var7) >= var13) {
                           NLoginCore_487 var14 = NLoginCore_487.al;
                           Object[] var19 = new Object[dw];
                           var19[dz] = this.a.u();
                           NLoginCore_150.a(var1, var14, var19);
                        } else {
                           this.a.b(var2);
                           this.a.b(var2, var7);
                           var4.a(var2, var1, var7);
                           NLoginCore_487 var10001 = NLoginCore_487.aq;
                           Object[] var10002 = new Object[ee];
                           var10002[ei] = this.a.u();
                           var10002[ek] = var7;
                           NLoginCore_150.a(var1, var10001, var10002);
                        }
                     }
                  }
               }
            } else {
               NLoginCore_150.a(var1, NLoginCore_487.bk);
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_295.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԅԧԩԉԭՌՄ՚ՆԕՓՉ\u0557ՑԚԿաՠ\u0558՞\u0558ԭ", (byte)33, 69), NLoginCore_295.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.C("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߱ߥ\u07bfߤ߁߶ߦ߹ߵߴѭ", (byte)33, 67) + var1 + NLoginCore_173.D("ђ", (byte)33, 68) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_295(NLoginCore_466 var1) {
      super(var1, NLoginCore_311.f);
   }
}
