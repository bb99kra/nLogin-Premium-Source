package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum NLoginCore_532 implements NLoginInterface_005 {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h,
   i,
   j;

   private static final NLoginCore_208 c = new NLoginCore_208(a(NLoginCore_532.fv, NLoginCore_532.fw ^ NLoginCore_532.fx), values().length);
   private final NLoginCore_474 c;
   private final Object l;
   private static String[] a = new String[NLoginCore_532.y];
   private static String[] b = new String[NLoginCore_532.z];
   private static long c;
   private static int a = (0 >>> 133 | 0 << -133) & -1;
   private static long b = Long.reverse(-1800576345174209748L);
   private static long d = Long.reverse(7493989779944505344L);
   private static int e = 16777216 >>> 120 | 16777216 << -120;
   private static long f = Long.reverse(-1800576345174209748L);
   private static long g = Long.reverse(7493989779944505344L);
   private static int h = Integer.reverse(1073741824);
   private static long i = Long.reverse(-8141644620511868116L);
   private static int j = (0 >>> 186 | 0 << ~186 + 1) & -1;
   private static int k = (0 >>> 29 | 0 << ~29 + 1) & -1;
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(0);
   private static int n = Integer.reverse(1342177280);
   private static int o = (0 >>> 139 | 0 << -139) & -1;
   private static int p = 1073741824 >>> 30 | 1073741824 << -30;
   private static int q = Integer.reverse(1073741824);
   private static int r = Integer.reverse(-1073741824);
   private static int s = 32 >>> 3 | 32 << ~3 + 1;
   private static int t = Integer.reverse(-1610612736);
   private static int u = (805306368 >>> 59 | 805306368 << ~59 + 1) & -1;
   private static int v = 234881024 >>> 25 | 234881024 << ~25 + 1;
   private static int w = Integer.reverse(268435456);
   private static int x = (576 >>> 166 | 576 << -166) & -1;
   private static int y = 328 >>> 163 | 328 << ~163 + 1;
   private static int z = Integer.reverse(-1811939328);
   private static int aa = (48 >>> 100 | 48 << -100) & -1;
   private static int ab = Integer.reverse(-1);
   private static long ac = Long.reverse(-8141644620511868116L);
   private static int ad = Integer.reverse(0);
   private static int ae = Integer.reverse(-1073741824);
   private static int af = (0 >>> 51 | 0 << -51) & -1;
   private static int ag = Integer.reverse(536870912);
   private static long ah = Long.reverse(-8141644620511868116L);
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static int aj = Integer.reverse(-1610612736);
   private static long ak = Long.reverse(-1800576345174209748L);
   private static long al = Long.reverse(7493989779944505344L);
   private static int am = Integer.reverse(1073741824);
   private static int an = 1610612736 >>> 220 | 1610612736 << ~220 + 1;
   private static long ao = Long.reverse(-1800576345174209748L);
   private static long ap = Long.reverse(7493989779944505344L);
   private static int aq = 1879048192 >>> 92 | 1879048192 << ~92 + 1;
   private static long ar = Long.reverse(-1800576345174209748L);
   private static long as = Long.reverse(7493989779944505344L);
   private static int at = (4194304 >>> 83 | 4194304 << -83) & -1;
   private static long au = Long.reverse(-1800576345174209748L);
   private static long av = Long.reverse(7493989779944505344L);
   private static int aw = (32 >>> 229 | 32 << -229) & -1;
   private static int ax = (Integer.MIN_VALUE >>> 222 | Integer.MIN_VALUE << -222) & -1;
   private static int ay = Integer.reverse(0);
   private static int az = (1073741826 >>> 254 | 1073741826 << ~254 + 1) & -1;
   private static int ba = (-1 >>> 240 | -1 << -240) & -1;
   private static long bb = Long.reverse(-8141644620511868116L);
   private static int bc = 134217728 >>> 155 | 134217728 << ~155 + 1;
   private static int bd = Integer.reverse(1342177280);
   private static int be = Integer.reverse(-1);
   private static long bf = Long.reverse(-8141644620511868116L);
   private static int bg = Integer.reverse(Integer.MIN_VALUE);
   private static int bh = (2883584 >>> 82 | 2883584 << -82) & -1;
   private static long bi = Long.reverse(-8141644620511868116L);
   private static int bj = Integer.reverse(1073741824);
   private static int bk = (4096 >>> 204 | 4096 << ~204 + 1) & -1;
   private static int bl = Integer.reverse(0);
   private static int bm = 100663296 >>> 55 | 100663296 << -55;
   private static long bn = Long.reverse(-8141644620511868116L);
   private static int bo = (2 >>> 193 | 2 << -193) & -1;
   private static int bp = Integer.reverse(-1342177280);
   private static long bq = Long.reverse(-8141644620511868116L);
   private static int br = Integer.reverse(-1073741824);
   private static int bs = (131072 >>> 79 | 131072 << ~79 + 1) & -1;
   private static int bt = (0 >>> 205 | 0 << -205) & -1;
   private static int bu = (-536870912 >>> 60 | -536870912 << ~60 + 1) & -1;
   private static long bv = Long.reverse(-1800576345174209748L);
   private static long bw = Long.reverse(7493989779944505344L);
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static int by = Integer.reverse(-268435456);
   private static long bz = Long.reverse(-8141644620511868116L);
   private static int ca = Integer.reverse(1073741824);
   private static int cb = Integer.reverse(134217728);
   private static long cc = Long.reverse(-8141644620511868116L);
   private static int cd = Integer.reverse(-1073741824);
   private static int ce = 2176 >>> 167 | 2176 << -167;
   private static long cf = Long.reverse(-1800576345174209748L);
   private static long cg = Long.reverse(7493989779944505344L);
   private static int ch = Integer.reverse(Integer.MIN_VALUE);
   private static int ci = Integer.reverse(1207959552);
   private static long cj = Long.reverse(-1800576345174209748L);
   private static long ck = Long.reverse(7493989779944505344L);
   private static int cl = (1073741824 >>> 92 | 1073741824 << ~92 + 1) & -1;
   private static int cm = Integer.reverse(1073741824);
   private static int cn = (0 >>> 151 | 0 << ~151 + 1) & -1;
   private static int co = Integer.reverse(-939524096);
   private static long cp = Long.reverse(-1800576345174209748L);
   private static long cq = Long.reverse(7493989779944505344L);
   private static int cr = 67108864 >>> 26 | 67108864 << ~26 + 1;
   private static int cs = 10240 >>> 41 | 10240 << ~41 + 1;
   private static long ct = Long.reverse(-1800576345174209748L);
   private static long cu = Long.reverse(7493989779944505344L);
   private static int cv = 128000 >>> 40 | 128000 << -40;
   private static int cw = Integer.reverse(-1476395008);
   private static int cx = -1 >>> 193 | -1 << ~193 + 1;
   private static long cy = Long.reverse(-8141644620511868116L);
   private static int cz = (20971520 >>> 86 | 20971520 << -86) & -1;
   private static int da = Integer.reverse(1073741824);
   private static int db = 0 >>> 172 | 0 << -172;
   private static int dc = Integer.reverse(1744830464);
   private static long dd = Long.reverse(-1800576345174209748L);
   private static long de = Long.reverse(7493989779944505344L);
   private static int df = (8192 >>> 141 | 8192 << ~141 + 1) & -1;
   private static int dg = Integer.reverse(-402653184);
   private static long dh = Long.reverse(-1800576345174209748L);
   private static long di = Long.reverse(7493989779944505344L);
   private static int dj = Integer.reverse(298319872);
   private static int dk = ('쀀' >>> 'k' | 49152 << ~107 + 1) & -1;
   private static long dl = Long.reverse(-1800576345174209748L);
   private static long dm = Long.reverse(7493989779944505344L);
   private static int dn = 6 >>> 96 | 6 << ~96 + 1;
   private static int var_do = Integer.reverse(-1073741824);
   private static int dp = Integer.reverse(0);
   private static int dq = -939524096 >>> 251 | -939524096 << ~251 + 1;
   private static int dr = (-1 >>> 181 | -1 << -181) & -1;
   private static long ds = Long.reverse(-8141644620511868116L);
   private static int dt = Integer.reverse(Integer.MIN_VALUE);
   private static int du = 425984 >>> 110 | 425984 << -110;
   private static long dv = Long.reverse(-1800576345174209748L);
   private static long dw = Long.reverse(7493989779944505344L);
   private static int dx = Integer.reverse(1073741824);
   private static int dy = Integer.reverse(-671088640);
   private static int dz = -1 >>> 43 | -1 << ~43 + 1;
   private static long ea = Long.reverse(-8141644620511868116L);
   private static int eb = Integer.reverse(0);
   private static int ec = Integer.reverse(939524096);
   private static long ed = Long.reverse(-8141644620511868116L);
   private static int ee = 58720256 >>> 23 | 58720256 << -23;
   private static int ef = Integer.reverse(Integer.MIN_VALUE);
   private static int eg = Integer.reverse(0);
   private static int eh = (237568 >>> 141 | 237568 << ~141 + 1) & -1;
   private static long ei = Long.reverse(-8141644620511868116L);
   private static int ej = Integer.reverse(2013265920);
   private static long ek = Long.reverse(-1800576345174209748L);
   private static long el = Long.reverse(7493989779944505344L);
   private static int em = Integer.reverse(268435456);
   private static int en = 1 >>> 94 | 1 << -94;
   private static int eo = 0 >>> 118 | 0 << ~118 + 1;
   private static int ep = Integer.reverse(-134217728);
   private static long eq = Long.reverse(-8141644620511868116L);
   private static int er = (32 >>> 5 | 32 << ~5 + 1) & -1;
   private static int es = 128 >>> 226 | 128 << -226;
   private static int et = Integer.reverse(-1);
   private static long eu = Long.reverse(-8141644620511868116L);
   private static int ev = 8192 >>> 236 | 8192 << ~236 + 1;
   private static int ew = Integer.reverse(-2080374784);
   private static int ex = (-1 >>> 253 | -1 << -253) & -1;
   private static long ey = Long.reverse(-8141644620511868116L);
   private static int ez = Integer.reverse(-1073741824);
   private static int fa = Integer.reverse(1140850688);
   private static long fb = Long.reverse(-8141644620511868116L);
   private static int fc = Integer.reverse(0);
   private static int fd = (36700160 >>> 244 | 36700160 << -244) & -1;
   private static long fe = Long.reverse(-1800576345174209748L);
   private static long ff = Long.reverse(7493989779944505344L);
   private static int fg = 1207959552 >>> 251 | 1207959552 << ~251 + 1;
   private static int fh = Integer.reverse(-1073741824);
   private static int fi = (0 >>> 94 | 0 << ~94 + 1) & -1;
   private static int fj = 4718592 >>> 49 | 4718592 << -49;
   private static long fk = Long.reverse(-8141644620511868116L);
   private static int fl = 4096 >>> 108 | 4096 << -108;
   private static int fm = 1212416 >>> 47 | 1212416 << -47;
   private static long fn = Long.reverse(-1800576345174209748L);
   private static long fo = Long.reverse(7493989779944505344L);
   private static int fp = 64 >>> 5 | 64 << -5;
   private static int fq = Integer.reverse(1677721600);
   private static long fr = Long.reverse(-1800576345174209748L);
   private static long fs = Long.reverse(7493989779944505344L);
   private static int ft = Integer.reverse(-469762048);
   private static long fu = Long.reverse(-8141644620511868116L);
   private static int fv = (2621440 >>> 240 | 2621440 << ~240 + 1) & -1;
   private static long fw = Long.reverse(-1800576345174209748L);
   private static long fx = Long.reverse(7493989779944505344L);

   private static String a(int var0, long var1) {
      var1 ^= 22L;
      var1 ^= 8376234106499791656L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(2 + 66),
                     (byte)(22 + 47),
                     (byte)(71 + 12),
                     (byte)(30 + 17),
                     (byte)(18 + 49),
                     (byte)(54 + 12),
                     (byte)(49 + 18),
                     (byte)(29 + 18),
                     80,
                     (byte)(7 + 68),
                     (byte)(15 + 52),
                     (byte)(77 + 6),
                     (byte)(18 + 35),
                     80,
                     (byte)(56 + 41),
                     (byte)(22 + 78),
                     (byte)(74 + 26),
                     (byte)(87 + 18),
                     (byte)(52 + 58),
                     (byte)(97 + 6)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.E("\u058b֘֗՚֖֑֥֚֚֔ա֣֥֟֜֟է࣮࣡ࣽࣿࣸःँऄࣹࣕࣗ", (byte)108, 69));
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

   @Override
   public int a() {
      return this.ordinal();
   }

   private NLoginCore_532(NLoginCore_474 var3, Object var4) {
      this.l = var4;
      this.c = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(aa & ab, ac);
      int var10003 = ad;
      String[] var10004 = new String[ae];
      var10004[af] = a(ag, ah);
      var10004[ai] = a(aj, ak ^ al);
      var10004[am] = a(an, ao ^ ap);
      a = new NLoginCore_532(NLoginCore_474.a(var10004), Collections.singletonList(a(aq, ar ^ as)));
      var10002 = a(at, au ^ av);
      var10003 = aw;
      var10004 = new String[ax];
      var10004[ay] = a(az & ba, bb);
      var10004[bc] = a(bd & be, bf);
      b = new NLoginCore_532(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)bg));
      var10002 = a(bh, bi);
      var10003 = bj;
      var10004 = new String[bk];
      var10004[bl] = a(bm, bn);
      c = new NLoginCore_532(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)bo));
      var10002 = a(bp, bq);
      var10003 = br;
      var10004 = new String[bs];
      var10004[bt] = a(bu, bv ^ bw);
      var10004[bx] = a(by, bz);
      var10004[ca] = a(cb, cc);
      var10004[cd] = a(ce, cf ^ cg);
      d = new NLoginCore_532(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)ch));
      var10002 = a(ci, cj ^ ck);
      var10003 = cl;
      var10004 = new String[cm];
      var10004[cn] = a(co, cp ^ cq);
      var10004[cr] = a(cs, ct ^ cu);
      e = new NLoginCore_532(NLoginCore_474.a(var10004), cv);
      var10002 = a(cw & cx, cy);
      var10003 = cz;
      var10004 = new String[da];
      var10004[db] = a(dc, dd ^ de);
      var10004[df] = a(dg, dh ^ di);
      f = new NLoginCore_532(NLoginCore_474.a(var10004), dj);
      var10002 = a(dk, dl ^ dm);
      var10003 = dn;
      var10004 = new String[var_do];
      var10004[dp] = a(dq & dr, ds);
      var10004[dt] = a(du, dv ^ dw);
      var10004[dx] = a(dy & dz, ea);
      g = new NLoginCore_532(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)eb));
      var10002 = a(ec, ed);
      var10003 = ee;
      var10004 = new String[ef];
      var10004[eg] = a(eh, ei);
      h = new NLoginCore_532(NLoginCore_474.a(var10004), Collections.emptyList());
      var10002 = a(ej, ek ^ el);
      var10003 = em;
      var10004 = new String[en];
      var10004[eo] = a(ep, eq);
      var10004[er] = a(es & et, eu);
      var10004[ev] = a(ew & ex, ey);
      var10004[ez] = a(fa, fb);
      i = new NLoginCore_532(NLoginCore_474.a(var10004), Boolean.valueOf((boolean)fc));
      var10002 = a(fd, fe ^ ff);
      var10003 = fg;
      var10004 = new String[fh];
      var10004[fi] = a(fj, fk);
      var10004[fl] = a(fm, fn ^ fo);
      var10004[fp] = a(fq, fr ^ fs);
      j = new NLoginCore_532(NLoginCore_474.a(var10004), Collections.singletonList(a(ft, fu)));
   }

   @Override
   public NLoginCore_474 a() {
      return this.c;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_532.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.A("ťƇƉũƍƬƤƺƦŵƳƩƷƱźƟǁǀƸƾƸƍ", (byte)95, 65), NLoginCore_532.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_553.F("վ\u058b֊Ս֍։ք֍֘ևՔ֖֒֏֒֘՚ࣰࣲࣶࣔ࣫࣡ࣴࣷ࣬ࣈ࣊ձ", (byte)95, 70) + var1 + NLoginCore_324.B("ŷ", (byte)95, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public NLoginCore_208 a() {
      return c;
   }

   public static void a(NLoginInterface_011<?> var0, boolean var1) {
      NLoginCore_219 var2 = new NLoginCore_219(a(a, b ^ d), new File(var0.c(), a(e, f ^ g)));
      NLoginCore_195.a(var0, var2, a(h, i), var1);
      NLoginCore_525.a(values(), c, var2);
      List var3 = j.b(new Object[j]);
      var3.removeIf(var0x -> (boolean)(var0x != null && !var0x.trim().isEmpty() ? m : l));
      if (!var3.isEmpty()) {
         NLoginCore_525.a(j, c, var3);
      } else {
         NLoginCore_525.a(i, c, Boolean.valueOf((boolean)k));
      }
   }

   @Override
   public Object a() {
      return this.l;
   }

   private static void b() {
      c = 3806059938875752679L;
      long var0 = c ^ 8376234106499791656L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(57 + 11),
               (byte)(35 + 34),
               (byte)(29 + 54),
               (byte)(6 + 41),
               67,
               (byte)(26 + 40),
               (byte)(60 + 7),
               (byte)(46 + 1),
               (byte)(71 + 9),
               (byte)(3 + 72),
               (byte)(66 + 1),
               83,
               (byte)(37 + 16),
               (byte)(31 + 49),
               (byte)(31 + 66),
               (byte)(32 + 68),
               (byte)(61 + 39),
               (byte)(72 + 33),
               (byte)(14 + 96),
               (byte)(48 + 55)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.A("ĔčóĚĈĜľļđĕľģěćĨĠĩģĴĄŎōĔĕ", (byte)33, 65);
               b[1] = NLoginCore_451.F("ԡՖՊՖԶ՛ԯՋ՞՜Դԥ", (byte)33, 70);
               b[2] = NLoginCore_559.C("ѹѣыэѾҕѱѦ҉қґҘѝѺѸҖҏҙњҍґғҥҢҘҥѝҔҌҩҠҢ", (byte)33, 67);
               b[3] = NLoginCore_004.C("ҏщђҍђҕѥѠ҇ѷғҏѬѿҍѶҊҝѡњҚҤѫѬ", (byte)33, 67);
               b[4] = NLoginCore_575.B("ĆĦĆĬĺĜĵĜĞăĶŀŇėľŁĚĕĚĘĹĊŅĜĨĭīīłīĔı", (byte)33, 66);
               b[5] = NLoginCore_397.F("ԟՀՁԔ՚ՇԔՈԘՓԺՏԚ՚ԛԴԤԻէդՉՌԽՉՌՄգըղկՇԴ", (byte)33, 70);
               b[6] = NLoginCore_453.D("ыѡѯҋѕэїҗјѯїѮѓѐѱҘҖҎҟҏҙҙѵҘҟҜқҥҪҟҨѼүқѭ҈ҴҒҏ҅ҲҥѺҀ", (byte)33, 68);
               b[7] = NLoginCore_324.B("ôċěĒĈċğĺįüĠĉ", (byte)33, 66);
               b[8] = NLoginCore_521.A("īôĚĘĮŀĿüĴĔöĸıĨłĲęĪōĩĸŋĂĻĢĐňŊœĤňđ", (byte)33, 65);
               b[9] = NLoginCore_553.A("ĆĦĆĬĺĜĵĜĞăĹńĀĆĚĤěĩĶĿĆęıŎİčŏĳĎėĒŃŎķĻņīĚĽĪţŢŢĩ", (byte)33, 65);
               b[10] = NLoginCore_110.F("ՇՋԴ\u0558ՐԦԵՉ՟ՓՊԘԲՁգաԤԢՉՄԳՈԤ՝ՁԧՋՈկբՈՐ", (byte)33, 70);
               b[11] = NLoginCore_004.A("ĆĜĜĈķĴĈıĪĺģĞĘĽķĴľĕłňŉĿŃŋļĞĤŖŇĸňŋ", (byte)33, 65);
               b[12] = NLoginCore_530.B("ĥĖĉěĵıĈěľýĺĮĎķćŀąĨĄŌĎČĨņŁįŒŌČĦĬņŊŅŅŏĨĹŞĜĪģŖĩ", (byte)33, 66);
               b[13] = NLoginCore_530.D("ѱѰѤѤҀѴѥѮ҅҇҈єѾіғҊѾҌѷѳҙ҅ҟҘѥ҇ҌѶ҅ѭ҃ҏ", (byte)33, 68);
               b[14] = NLoginCore_530.D("ѼѭѠѲҌ҈џѲҕєҔѷҌћѰѬҢѻѷқѱҒѸѠҘҖҤѼҩҋ҉ҰѽҭҮҝѮҞңҙҦҨҏҀ", (byte)33, 68);
               b[15] = NLoginCore_091.B("ĎįĕİıİòóĶĸĶĶĂĦġňĺľĂģĉĭğĽĝđŐıĔģŇė", (byte)33, 66);
               b[16] = NLoginCore_183.B("ĈĳěčĉđďěđĐŃĝěđŇĔńĖĉģŅĽĔĕ", (byte)33, 66);
               b[17] = NLoginCore_004.E("ՇԤԒԭ\u0530ԦԤՑՔՌԛ՜\u0558ԵՏՃԣԞՉԷԽԹՙՇԼ՝՜ԮՈՈՊԵ", (byte)33, 69);
               b[18] = NLoginCore_453.A("õģĜĺùĒĸûłČĝčĆĆľıėĖŀÿğĩŃŅŅĻŐœŏġėŕ", (byte)33, 65);
               b[19] = NLoginCore_451.A("ĥĖĉěĵıĈěľýĻĞĀĚĀćģĥĺĭłĪĽĽĚģōŔŏģĔŐ", (byte)33, 65);
               b[20] = NLoginCore_451.B("ĥĖĉěĵıĈěľýĽęĖĿňļŀęėŁŀħĤńĒĭčŕńīŇďČŒĕŕśķŁęşĵĞğśśœŃŝŢīľŜŝĴĵ", (byte)33, 66);
               b[21] = NLoginCore_451.F("ԑԿԸՖԕԮՔԗ՞ԨԹԽՌԴԯ\u0558ՐԞԥԹԷԡՀԣազդհԻՔԾԫ", (byte)33, 70);
               b[22] = NLoginCore_241.A("ĥĖĉěĵıĈěľýĺÿĚĀĝġģĊĥĺłĽĂĪīŁġĿĐŘĮĲ", (byte)33, 65);
               b[23] = NLoginCore_141.B("ĥĖĉěĵıĈěľýĽęĖĿňļŀęėŁŀĨĪŉďĩĎĦŐĬōōĨŅĲěŎĿŒĭİĳŚĩ", (byte)33, 66);
               b[24] = NLoginCore_471.F("ԑԿԸՖԕԮՔԗ՞ԨԻՐՒՂդե\u0557ՏԤՖՅ՟ԿծիՋ՛հՈԭՌԳ", (byte)33, 70);
               b[25] = NLoginCore_471.D("ѼѭѠѲҌ҈џѲҕєҔѫҊѿҙѺґҘѳќѼ҇ѦғҡѡҊҍѭѷѮѼҧґҟѰҢ҂ңѴѶѷҹҀ", (byte)33, 68);
               b[26] = NLoginCore_530.F("ՁԲԥԷՑՍԤԷ՚ԙՙ\u0530ՏՄ՞ԿՖ՝ԸԡՁՌԫ\u0558զԦՏՒԲԼԳՁհՄըլՊՙՌոս՜ՈՅ", (byte)33, 70);
               b[27] = NLoginCore_453.B("ĥĖĉěĵıĈěľýĺķĄķıĒĵěĔŀńŎĹĽĈĿŐćőŕĮŕłĕėĨĳěėĲĻįĞğšıħĳŢĪśľīŭĴĵ", (byte)33, 66);
               b[28] = NLoginCore_575.A("õģĜĺùĒĸûłČğĴĶĦňŉĻĳĈĺĩľŊčľŋŏœĮıĸĘŖŘĎĽĵňĴėķķńĩ", (byte)33, 65);
               b[29] = NLoginCore_241.B("ĥĖĉěĵıĈěľýĽĔĳĨłģĺŁĜąĥĺħĚďĻġŎœĸĪŋŋřĔņĳŐřŐġĞğĩ", (byte)33, 66);
               b[30] = NLoginCore_451.A("õģĜĺùĒĸûłČĜÿąļŃķĚĳŊčōńĠŒŏįŉĪġĐħĖ", (byte)33, 65);
               b[31] = NLoginCore_384.A("ĥĖĉěĵıĈěľýĽęĖĿňļŀęėŁŀĭğčĺŐĿłŉĸĐŌĭĵĔĩņŒĸŕĺĝģĩ", (byte)33, 65);
               b[32] = NLoginCore_453.C("ѼѭѠѲҌ҈џѲҕєҔѰѭҖҟғҗѰѮҘҗ҄ѶѤґҧҖҙҠҏѧңҍҢҜҟҀҗҒ҉ҥҶҭҀ", (byte)33, 67);
               b[33] = NLoginCore_183.E("ԨՆՐԑԶԥՓԜԛ\u0530ԼՙԷԶՂՒԽ\u0530ՑԠՕԪԸԷՆԾ՝աԿիԲՓ", (byte)33, 69);
               b[34] = NLoginCore_223.C("ѩ҆ҏ҆҂҆ғѐҒѦѸѓҒіѽѹ҂ҐѬ҄ѻҧҝ҃ѲҖҋҖѿҥѩѧүғҐѿҦѲҠҢѸҕҹҀ", (byte)33, 67);
               b[35] = NLoginCore_173.F("ԑԿԸՖԕԮՔԗ՞ԨԸԛԡ\u0558՟ՓԶՏզԩթբ\u0557ԿՋաՊՊ՟ԮԮՍՏգԯշշԵպղՎԿնՅ", (byte)33, 70);
               b[36] = NLoginCore_324.D("ѼѭѠѲҌ҈џѲҕєҔѰѭҖҟғҗѰѮҘҗҁҘҕ҇җҖѣ҈҃ҧ҇ѪұҟѰҠҊ҂ҥҦҊҥҀ", (byte)33, 68);
               b[37] = NLoginCore_223.F("ԨՆՐԑԶԥՓԜԛ\u0530ԼՙԷԶՂՒԽ\u0530ՑԠՕԧԾՖԬ՚Ԭբզ՟ՂնՇդՍՂՎ\u0557ղո՟ղՕթՒփԽԽևհ՜ֈՓգՐՑ", (byte)33, 70);
               b[38] = NLoginCore_446.A("ĒįĸįīįļùĻďġüĻÿĦĢīĹĕĭĤŎĺęŌċľņĭŀĤĒĚģĺľĭĻŖřĽŏıĹŐħļĻŕŇĺŃĿŝĴĵ", (byte)33, 65);
               b[39] = NLoginCore_173.F("ԐԧԷԮԤԧԻՖՋԘԼԥ", (byte)33, 70);
               b[40] = NLoginCore_397.B("ìěĹĨěķĠđēġĵďĸùĸĩęĳĆĊćĽĔĕ", (byte)33, 66);
               break;
            case 1:
               b[0] = NLoginCore_092.A("ĔčóĚĈĜľļđĕľěĆÿļĄĩĴăŌłĽĔĕ", (byte)33, 65);
               b[1] = NLoginCore_453.D("ҁэѼ҉чѠѱѪҕѳҔюҚѺѾҙҡҋѲѢѴѮѫѬ", (byte)33, 68);
               b[2] = NLoginCore_433.B("ĢČôöħľĚďĲńĺŁĆģġĿĸłăĶĺĪĂŌĐŃłĨŗŃŀœ", (byte)33, 66);
               b[3] = NLoginCore_575.C("ҏщђҍђҕѥѠ҇ѷґјҎѮѼѼњѝҡҎҔҤѫѬ", (byte)33, 67);
               b[4] = NLoginCore_397.A("ĆĦĆĬĺĜĵĜĞăĶŀŇėľŁĚĕĚĘĹŐĺĞĪŎŌĕłńĕėōŘęőĶřĹŜĹĬİĩ", (byte)33, 65);
               b[5] = NLoginCore_092.B("ăĤĥøľīøĬüķĞĳþľÿĘĈğŋňĭĻĨĮĪİŎłŀĦŁĭĹśřŉĺěŉěĝĻĸĩ", (byte)33, 66);
               b[6] = NLoginCore_110.D("ыѡѯҋѕэїҗјѯїѮѓѐѱҘҖҎҟҏҙҙѵҘҟҜқҥҪҟҨѼү҆Ҥҡғ҅ҷҨѱѵѳҮҙҰ҈ѻҾѹҒҌҶҞҋҌ", (byte)33, 68);
               b[7] = NLoginCore_127.E("ՋՄՔԱԖԬԜՐ՞Պ\u0530ԥ", (byte)33, 69);
               b[8] = NLoginCore_076.B("īôĚĘĮŀĿüĴĔöĸıĨłĲęĪōĩĸłŌČņņŅĴķĩœģ", (byte)33, 66);
               b[9] = NLoginCore_397.C("ѝѽѝ҃ґѳҌѳѵњҐқїѝѱѻѲҀҍҖѝѰ҈ҥ҇ѤҦҊѥѮѩҚѱҨ҇ҰҭҏҀҩѶҷҭҀ", (byte)33, 67);
               b[10] = NLoginCore_384.B("īįĘļĴĊęĭŃķĮüĖĥŇŅĈĆĭĨėĩďŋĩŐĬīĢĲŔħ", (byte)33, 66);
               b[11] = NLoginCore_092.C("ѝѳѳџҎҋџ҈ҁґѺѵѯҔҎҋҕѬҙҟҠҝҐњҊқѿѩҖҍҫѭ", (byte)33, 67);
               b[12] = NLoginCore_451.B("ĥĖĉěĵıĈěľýĺĮĎķćŀąĨĄŌĎČĨņŁįŒŌČĦĬņįœŌŖŗīşšőőŀĩ", (byte)33, 66);
               b[13] = NLoginCore_232.B("ĚęččĩĝĎėĮİıýħÿļĳħĵĠĜłįğİīěĠĶĕŃĒĤ", (byte)33, 66);
               b[14] = NLoginCore_183.F("ՁԲԥԷՑՍԤԷ՚ԙՙԼՑԠԵԱէՀԼՠԶ\u0557Խԥ՝՛թՁծՐՎյԮծՍոՉլզ՝պյՖլռՀՎԻվՇյռ՚գՐՑ", (byte)33, 70);
               b[15] = NLoginCore_451.C("ѥ҆Ѭ҇҈҇щъҍҏҍҍљѽѸҟґҕљѺѠ҃ҨѽѳҫѢ҈ѫѾѩҝ", (byte)33, 67);
               b[16] = NLoginCore_092.D("џҊѲѤѠѨѦѲѨѧқѳіѸҟҒѩҔѢҞҠѿѵўҀҘҚҁҜңҨҠ", (byte)33, 68);
               b[17] = NLoginCore_173.D("҂џэѨѫѡџҌҏ҇іҗғѰҊѾўљ҄ѲѸѮґ҆҂ѻѼѫѤҡѪ҆ү҅ѰҩѲҦҪҬү҈җҀ", (byte)33, 68);
               b[18] = NLoginCore_232.A("õģĜĺùĒĸûłČĝčĆĆľıėĖŀÿğĸĹŇĨĮłőĕĶįŎŏŕŏķŌļŋŔķęŞĩ", (byte)33, 65);
               b[19] = NLoginCore_521.D("ѼѭѠѲҌ҈џѲҕєҒѵїѱїўѺѼґ҄ҙҀѸѦґѶ҅Җџҁ҈ҐѺҚѱҵҪ҉ҋҐҵѰѶҀ", (byte)33, 68);
               b[20] = NLoginCore_530.E("ՁԲԥԷՑՍԤԷ՚ԙՙԵԲ՛դ\u0558՜ԵԳ՝՜ՃՀՠԮՉԩձՠՇգԫԨծԱձշՓ՝ԵջՑԸ՜ՕաչԿ՛ֈչգփ։ՐՑ", (byte)33, 69);
               b[21] = NLoginCore_453.A("õģĜĺùĒĸûłČĝġİĘēļĴĂĉĝěćĿĎĿğœĭĵŕŔė", (byte)33, 65);
               b[22] = NLoginCore_241.A("ĥĖĉěĵıĈěľýĺÿĚĀĝġģĊĥĺłŋČĝİœňĿņĖŃĦĻŔńĜĻŗĨĻıŀěĩ", (byte)33, 65);
               b[23] = NLoginCore_559.A("ĥĖĉěĵıĈěľýĽęĖĿňļŀęėŁŀĨĪŉďĩĎĦŐĬōōĘŗŊŌĵĘĮœĹĲŤıķľłŠŒŇģľŊŭĴĵ", (byte)33, 65);
               b[24] = NLoginCore_076.E("ԑԿԸՖԕԮՔԗ՞ԨԻՐՒՂդե\u0557ՏԤՖՅՙ՛՞զԼԬԱԮահժԬնախձԷճռէՏնՅ", (byte)33, 69);
               b[25] = NLoginCore_141.A("ĥĖĉěĵıĈěľýĽĔĳĨłģĺŁĜąĥİďļŊĊĳĶĖĠėĥŊŎņŎĺŗėŘĢŢŎĩ", (byte)33, 65);
               b[26] = NLoginCore_138.E("ՁԲԥԷՑՍԤԷ՚ԙՙ\u0530ՏՄ՞ԿՖ՝ԸԡՁՌԫ\u0558զԦՏՒԲԼԳՁՀԴԱ\u0557շշՊՐՉձղՅ", (byte)33, 69);
               b[27] = NLoginCore_384.C("ѼѭѠѲҌ҈џѲҕєґҎћҎ҈ѩҌѲѫҗқҥҐҔџҖҧўҨҬ҅ҬҙѬѮѿҊѲѮ҉Ғ҆ѴґүҙѱҬѻҿҤґӆҞҋҌ", (byte)33, 67);
               b[28] = NLoginCore_004.E("ԑԿԸՖԕԮՔԗ՞ԨԻՐՒՂդե\u0557ՏԤՖՅ՚զԩ՚էիկՊՍՔԴմժՊԶԹՖէկԺ՚Ոս\u0558ՖմմՎը\u0558բոՓՐՑ", (byte)33, 69);
               b[29] = NLoginCore_387.D("ѼѭѠѲҌ҈џѲҕєҔѫҊѿҙѺґҘѳќѼґѾѱѦҒѸҥҪҏҁҢҠѲѾѴҩѴҬғүҵқҀ", (byte)33, 68);
               b[30] = NLoginCore_127.A("õģĜĺùĒĸûłČĜÿąļŃķĚĳŊčōŌġőŉĬőıŎġĶŌ", (byte)33, 65);
               b[31] = NLoginCore_201.C("ѼѭѠѲҌ҈џѲҕєҔѰѭҖҟғҗѰѮҘҗ҄ѶѤґҧҖҙҠҏѧңҐѮѽ҂ѽҶ҃ѲҊһҋҀ", (byte)33, 67);
               b[32] = NLoginCore_127.A("ĥĖĉěĵıĈěľýĽęĖĿňļŀęėŁŀĭğčĺŐĿłŉĸĐŌŐřĘĪŜĚĳĹĠĵĴĩ", (byte)33, 65);
               b[33] = NLoginCore_092.A("ČĪĴõĚĉķĀÿĔĠĽěĚĦĶġĔĵĄĹčĻĎĻđıčŀġĶŌĖĨŎŖħœĭĺŋĺŖĩ", (byte)33, 65);
               b[34] = NLoginCore_127.F("ԮՋՔՋՇՋ\u0558ԕ\u0557ԫԽԘ\u0557ԛՂԾՇՕԱՉՀլբՈԷ՛Ր՛ՄժԮԬկյՃծ՛\u0558ԻղզՙԲԻՖռշխՂղ\u0558չցՓՐՑ", (byte)33, 70);
               b[35] = NLoginCore_232.E("ԑԿԸՖԕԮՔԗ՞ԨԸԛԡ\u0558՟ՓԶՏզԩթբ\u0557ԿՋաՊՊ՟ԮԮՍՑԳՈԹՍԱդպհր\u0558Յ", (byte)33, 69);
               b[36] = NLoginCore_575.F("ՁԲԥԷՑՍԤԷ՚ԙՙԵԲ՛դ\u0558՜ԵԳ՝՜Ն՝՚Ռ՜՛ԨՍՈլՌՋՖԸԱՄՔՓՉԽՑՐՅ", (byte)33, 70);
               b[37] = NLoginCore_141.E("ԨՆՐԑԶԥՓԜԛ\u0530ԼՙԷԶՂՒԽ\u0530ՑԠՕԧԾՖԬ՚Ԭբզ՟ՂնՇդՍՂՎ\u0557ղո՟ղ\u0557Ծհ՛ՁկՙմՂՙՁ։ՐՑ", (byte)33, 69);
               b[38] = NLoginCore_173.B("ĒįĸįīįļùĻďġüĻÿĦĢīĹĕĭĤŎĺęŌċľņĭŀĤĒĚģĺľĭĻŖřĽŏİİıĳŜěŀĝŚūĽĭļŏĻŁőŶŔůĸŉ", (byte)33, 66);
               b[39] = NLoginCore_427.B("ĒĄĵĞćČĐĀĀķûĉ", (byte)33, 66);
               b[40] = NLoginCore_397.B("ìěĹĨěķĠđēġĵėĘķėėĂğĺğĮŎĠňņĨľłıŅĹň", (byte)33, 66);
               break;
            case 2:
               b[0] = NLoginCore_127.B("óĎĬĚēĶľĠāĻĄĜĢĐĝĠĤĘĥĢĶĽĔĕ", (byte)33, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_173.A("ćİěĖĻěčĻĵŀĎİĮĶĒĚüĬĄņĖĻōńŀŒŊĵĮŊħŋ", (byte)33, 65);
         }
      }
   }
}
