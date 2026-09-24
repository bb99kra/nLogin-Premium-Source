package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_396 extends NLoginCore_353 {
   private static int db = (0 >>> 67 | 0 << -67) & -1;
   private static long ad = Long.reverse(4939586391751297975L);
   private static long ew = Long.reverse(472015561399765943L);
   private static int cs = (-1 >>> 207 | -1 << -207) & -1;
   private static int cf = -1 >>> 136 | -1 << ~136 + 1;
   private static long de = Long.reverse(4939586391751297975L);
   private static float dz = Float.intBitsToFloat(Integer.reverse(3714));
   private static int bv = (2 >>> 128 | 2 << ~128 + 1) & -1;
   private static int dd = Integer.reverse(939524096);
   private static long av = Long.reverse(4755801206503243776L);
   private static int at = Integer.reverse(805306368);
   private static long bt = Long.reverse(4755801206503243776L);
   private static long cp = Long.reverse(472015561399765943L);
   private static int dn = Integer.reverse(2013265920);
   private static long du = Long.reverse(472015561399765943L);
   private static long da = Long.reverse(4939586391751297975L);
   private static long ef = Long.reverse(472015561399765943L);
   private static long fp = Long.reverse(4939586391751297975L);
   private static int di = 0 >>> 186 | 0 << ~186 + 1;
   private static long cj = Long.reverse(4939586391751297975L);
   private static int d = -1 >>> 116 | -1 << ~116 + 1;
   private static long fe = Long.reverse(4939586391751297975L);
   private static long cg = Long.reverse(4939586391751297975L);
   private static int bm = Integer.reverse(0);
   private static int cr = Integer.reverse(-1744830464);
   private static int dl = Integer.reverse(Integer.MIN_VALUE);
   private static int fz = Integer.reverse(1946157056);
   private static int fs = 0 >>> 54 | 0 << ~54 + 1;
   private final AtomicBoolean b;
   private static int fb = (0 >>> 83 | 0 << -83) & -1;
   private static long cl = Long.reverse(472015561399765943L);
   private static long ek = Long.reverse(472015561399765943L);
   private static int dw = Integer.reverse(0);
   private static long bf = Long.reverse(4755801206503243776L);
   private static long cw = Long.reverse(472015561399765943L);
   private static int i = Integer.reverse(0);
   private static long e = Long.reverse(4939586391751297975L);
   private static int ab = (6291456 >>> 212 | 6291456 << -212) & -1;
   private static long cc = Long.reverse(472015561399765943L);
   private static long h = Long.reverse(4939586391751297975L);
   private static long cd = Long.reverse(4755801206503243776L);
   private static int ak = Integer.reverse(-1879048192);
   private static long ct = Long.reverse(4939586391751297975L);
   private static long bb = Long.reverse(4939586391751297975L);
   private static int z = Integer.reverse(-1);
   private static int fw = 1048576 >>> 52 | 1048576 << ~52 + 1;
   private static long ds = Long.reverse(4755801206503243776L);
   private static int am = (10240 >>> 234 | 10240 << -234) & -1;
   private static long cq = Long.reverse(4755801206503243776L);
   private static int bq = Integer.reverse(Integer.MIN_VALUE);
   private static int y = Integer.reverse(-1610612736);
   private static int an = Integer.reverse(-1);
   private static int fj = Integer.reverse(1409286144);
   private static long p = Long.reverse(472015561399765943L);
   private static int bj = 2097152 >>> 49 | 2097152 << -49;
   private static int eh = 0 >>> 27 | 0 << -27;
   private static long aa = Long.reverse(4939586391751297975L);
   private static long fr = Long.reverse(4939586391751297975L);
   private static int af = (-536870912 >>> 29 | -536870912 << ~29 + 1) & -1;
   private static int ee = Integer.reverse(1140850688);
   private static int bi = -1 >>> 50 | -1 << ~50 + 1;
   private static int fx = (0 >>> 103 | 0 << -103) & -1;
   private static int ej = Integer.reverse(-1006632960);
   private static float ea = Float.intBitsToFloat((526336 >>> 213 | 526336 << -213) & -1);
   private static float dj = Float.intBitsToFloat(134016 >>> 179 | 134016 << -179);
   private static long fv = Long.reverse(4755801206503243776L);
   private static int ck = Integer.reverse(-402653184);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(0);
   private static int ci = (1408 >>> 134 | 1408 << -134) & -1;
   private static int br = Integer.reverse(1207959552);
   private static int bh = 4096 >>> 140 | 4096 << ~140 + 1;
   private static int dq = -134217728 >>> 155 | -134217728 << ~155 + 1;
   private static long x = Long.reverse(4755801206503243776L);
   private static long cx = Long.reverse(4755801206503243776L);
   private static int g = -1 >>> 52 | -1 << -52;
   private static long aj = Long.reverse(4755801206503243776L);
   private static int s = Integer.reverse(-1073741824);
   private static int az = 3584 >>> 136 | 3584 << ~136 + 1;
   private static long fh = Long.reverse(472015561399765943L);
   private static long eq = Long.reverse(472015561399765943L);
   private static int ac = (-1 >>> 78 | -1 << -78) & -1;
   private static int ch = 1024 >>> 105 | 1024 << ~105 + 1;
   private static int dc = Integer.reverse(Integer.MIN_VALUE);
   private static long w = Long.reverse(472015561399765943L);
   private static int cb = 5 >>> 254 | 5 << ~254 + 1;
   private static long bz = Long.reverse(472015561399765943L);
   private static long bk = Long.reverse(472015561399765943L);
   private static long ed = Long.reverse(4755801206503243776L);
   private static long dh = Long.reverse(4755801206503243776L);
   private static int fd = (1310720 >>> 175 | 1310720 << -175) & -1;
   private static int eu = 6 >>> 32 | 6 << ~32 + 1;
   private static long ec = Long.reverse(472015561399765943L);
   private static int ah = Integer.reverse(268435456);
   private static int ar = Integer.reverse(-1);
   private static long au = Long.reverse(472015561399765943L);
   private static long dg = Long.reverse(472015561399765943L);
   private static long ax = Long.reverse(472015561399765943L);
   private static int dt = 16777216 >>> 211 | 16777216 << ~211 + 1;
   private static int ae = (0 >>> 47 | 0 << -47) & -1;
   private static int by = Integer.reverse(-939524096);
   private static long dr = Long.reverse(472015561399765943L);
   private static long eo = Long.reverse(4755801206503243776L);
   private static int v = Integer.reverse(536870912);
   private static int eb = Integer.reverse(-2080374784);
   private static long dp = Long.reverse(4755801206503243776L);
   private static int ce = 22020096 >>> 212 | 22020096 << -212;
   private static long fi = Long.reverse(4755801206503243776L);
   private static int o = 128 >>> 230 | 128 << -230;
   private static float dk = Float.intBitsToFloat((-2139095040 >>> 161 | -2139095040 << ~161 + 1) & -1);
   private static int cy = Integer.reverse(-671088640);
   private static int f = 262144 >>> 146 | 262144 << -146;
   private static int et = 125829120 >>> 118 | 125829120 << ~118 + 1;
   private static long ay = Long.reverse(4755801206503243776L);
   private static int fn = Integer.reverse(-738197504);
   private static int l = Integer.reverse(0);
   private static long el = Long.reverse(4755801206503243776L);
   private static long be = Long.reverse(472015561399765943L);
   private static int ey = Integer.reverse(-469762048);
   private static int c = (0 >>> 130 | 0 << -130) & -1;
   private static int fq = (44 >>> 32 | 44 << ~32 + 1) & -1;
   private static long ao = Long.reverse(4939586391751297975L);
   private static long q = Long.reverse(4755801206503243776L);
   private static int ep = (4736 >>> 7 | 4736 << ~7 + 1) & -1;
   private static int bx = (0 >>> 146 | 0 << -146) & -1;
   private static int fa = Integer.reverse(0);
   private static int fc = 0 >>> 182 | 0 << -182;
   private static long c;
   private static int df = 30408704 >>> 52 | 30408704 << -52;
   private static long eg = Long.reverse(4755801206503243776L);
   private static int cu = Integer.reverse(0);
   private static long bl = Long.reverse(4755801206503243776L);
   private static long fl = Long.reverse(4939586391751297975L);
   private static int es = Integer.reverse(0);
   private static int n = Integer.reverse(-1073741824);
   private static long bs = Long.reverse(472015561399765943L);
   private static int co = 393216 >>> 46 | 393216 << -46;
   private static long cm = Long.reverse(4755801206503243776L);
   private static int fm = Integer.reverse(0);
   private static int em = 1152 >>> 133 | 1152 << ~133 + 1;
   private static int dy = (24576 >>> 12 | 24576 << -12) & -1;
   private static int fy = Integer.reverse(1946157056);
   private static int fo = -1 >>> 81 | -1 << -81;
   private static int ba = Integer.reverse(-1);
   private static int m = (524288 >>> 146 | 524288 << ~146 + 1) & -1;
   private static int r = Integer.reverse(0);
   private static int bg = 0 >>> 157 | 0 << -157;
   private static long ca = Long.reverse(4755801206503243776L);
   private static int bc = (0 >>> 60 | 0 << ~60 + 1) & -1;
   private static int bd = (480 >>> 101 | 480 << -101) & -1;
   private static long er = Long.reverse(4755801206503243776L);
   private static int ff = 8 >>> 131 | 8 << ~131 + 1;
   private static int ft = -1610612731 >>> 157 | -1610612731 << ~157 + 1;
   private static int bn = Integer.reverse(-2013265920);
   private static String[] b = new String[fz];
   private static long en = Long.reverse(472015561399765943L);
   private static long as = Long.reverse(4939586391751297975L);
   private static int aq = Integer.reverse(-805306368);
   private static long ag = Long.reverse(4939586391751297975L);
   private static long ez = Long.reverse(4939586391751297975L);
   private static int ap = (0 >>> 189 | 0 << -189) & -1;
   private static int cn = Integer.reverse(0);
   private static long bo = Long.reverse(472015561399765943L);
   private static int dx = 7864320 >>> 114 | 7864320 << ~114 + 1;
   private static long fu = Long.reverse(472015561399765943L);
   private static int cz = Integer.reverse(-1);
   private static int fk = (-1 >>> 228 | -1 << ~228 + 1) & -1;
   private static int cv = (425984 >>> 46 | 425984 << ~46 + 1) & -1;
   private static long var_do = Long.reverse(472015561399765943L);
   private static long ai = Long.reverse(472015561399765943L);
   private static int aw = 218103808 >>> 216 | 218103808 << ~216 + 1;
   private static long al = Long.reverse(4939586391751297975L);
   private static int fg = 20992 >>> 201 | 20992 << -201;
   private static long u = Long.reverse(4939586391751297975L);
   private static long ex = Long.reverse(4755801206503243776L);
   private static int bw = 256 >>> 8 | 256 << -8;
   private static int dm = 0 >>> 137 | 0 << -137;
   private static long dv = Long.reverse(4755801206503243776L);
   private static int t = -1 >>> 11 | -1 << ~11 + 1;
   private static int ev = Integer.reverse(1677721600);
   private static int bu = Integer.reverse(1073741824);
   private static int ei = 67108864 >>> 154 | 67108864 << -154;
   private static long bp = Long.reverse(4755801206503243776L);
   private static String[] a = new String[fy];

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      String var3 = this.e().toLowerCase(Locale.ENGLISH);
      if (var2.length != m && var2.length != n) {
         NLoginCore_150.a(var1, a(o, p ^ q));
         NLoginCore_150.a(var1, a(s & t, u) + var3 + a(v, w ^ x) + (this.j() ? a(y & z, aa) : a(ab & ac, ad)));
         NLoginCore_150.a(var1, a(af, ag) + var3 + a(ah, ai ^ aj) + (this.j() ? a(ak, al) : a(am & an, ao)));
         NLoginCore_150.a(var1, a(aq & ar, as) + var3 + a(at, au ^ av) + (this.j() ? a(aw, ax ^ ay) : a(az & ba, bb)));
         NLoginCore_150.a(var1, a(bd, be ^ bf));
      } else {
         String var4 = var2[bh].toLowerCase(Locale.ENGLISH);
         int var6 = bi;
         switch (var4.hashCode()) {
            case 3005871:
               if (var4.equals(a(br, bs ^ bt))) {
                  var6 = bu;
               }
               break;
            case 738950403:
               if (var4.equals(a(bj, bk ^ bl))) {
                  var6 = bm;
               }
               break;
            case 951117504:
               if (var4.equals(a(bn, bo ^ bp))) {
                  var6 = bq;
               }
         }

         switch (var6) {
            case 0:
               if (var2.length == bv) {
                  NLoginCore_487 var10001 = NLoginCore_487.x;
                  Object[] var10002 = new Object[bw];
                  var10002[bx] = a(by, bz ^ ca) + var3 + a(cb, cc ^ cd) + var4 + a(ce & cf, cg);
                  NLoginCore_150.a(var1, var10001, var10002);
               } else {
                  NLoginCore_204 var14 = NLoginCore_204.a(var2[ch]);
                  if (var14 == null) {
                     NLoginCore_150.a(var1, this.j() ? a(ci, cj) : a(ck, cl ^ cm));
                  } else {
                     this.a.a().a(var14);
                     if (var14 == NLoginCore_204.b) {
                        NLoginCore_150.a(var1, this.j() ? a(co, cp ^ cq) : a(cr & cs, ct));
                     } else {
                        NLoginCore_150.a(var1, this.j() ? a(cv, cw ^ cx) : a(cy & cz, da));
                     }
                  }
               }
               break;
            case 1:
               if (this.b.getAndSet((boolean)dc)) {
                  boolean var11 = false /* VF: Semaphore variable */;

                  label251: {
                     try {
                        var11 = true;
                        NLoginCore_224 var13 = this.a.a();
                        NLoginCore_233 var15 = var13.a();
                        if (var15.ah() || !this.a.a().a().ad()) {
                           this.a.a().am();
                        }

                        if (this.a.a().a().ad()) {
                           if (!var15.ah()) {
                              NLoginCore_150.a(var1, this.j() ? a(dd, de) : a(df, dg ^ dh));
                              NLoginCore_150.a(var1, NLoginCore_194.C, dj, dk);
                              var15.e((boolean)dl);
                              var11 = false;
                              break label251;
                           }

                           if (var1 instanceof NLoginCore_277) {
                              ((NLoginCore_277)var1).a(a(dn, var_do ^ dp), this.j() ? a(dq, dr ^ ds) : a(dt, du ^ dv), dw, dx, dy);
                              NLoginCore_150.a(var1, NLoginCore_194.C, dz, ea);
                           } else {
                              NLoginCore_150.a(var1, this.j() ? a(eb, ec ^ ed) : a(ee, ef ^ eg));
                           }

                           var15.e((boolean)ei);
                           var11 = false;
                        } else {
                           if (var1 instanceof NLoginCore_277) {
                              ((NLoginCore_277)var1).a(a(ej, ek ^ el), this.j() ? a(em, en ^ eo) : a(ep, eq ^ er), es, et, eu);
                           }

                           NLoginCore_150.a(var1, this.j() ? a(ev, ew ^ ex) : a(ey, ez));
                           var11 = false;
                        }
                     } finally {
                        if (var11) {
                           this.b.set((boolean)fc);
                        }
                     }

                     this.b.set((boolean)fb);
                     return;
                  }

                  this.b.set((boolean)dm);
               }
               break;
            case 2:
               NLoginCore_224 var7 = this.a.a();
               NLoginCore_482 var8 = var7.a();
               boolean var9 = var8.a(a(fd, fe), (boolean)ff);
               if (var9) {
                  NLoginCore_150.a(var1, this.j() ? a(fg, fh ^ fi) : a(fj & fk, fl));
               } else {
                  NLoginCore_150.a(var1, this.j() ? a(fn & fo, fp) : a(fq, fr));
               }

               var8.a(a(ft, fu ^ fv), (boolean)(!var9 ? fw : fx));
         }
      }
   }

   public NLoginCore_396(NLoginType_008 var1) {
      super(var1, a(c & d, e), a(f & g, h), (boolean)i, (boolean)j);
      this.b = new AtomicBoolean((boolean)l);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_396.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.C("ЫэяЯѓѲѪҀѬлѹѯѽѷрѥ҇҆Ѿ҄Ѿѓ", (byte)26, 67), NLoginCore_396.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.A("ĖģĢåĥġĜĥİğìĪĮħĪİòѼ҉ѼѿѮҐґѽ҂ѿ҆҈Ċ", (byte)26, 65) + var1 + NLoginCore_027.B("í", (byte)26, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 66L;
      var1 ^= 4160068692682691683L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(54 + 14),
                     (byte)(66 + 3),
                     (byte)(72 + 11),
                     (byte)(12 + 35),
                     (byte)(28 + 39),
                     (byte)(65 + 1),
                     (byte)(17 + 50),
                     (byte)(27 + 20),
                     (byte)(70 + 10),
                     (byte)(21 + 54),
                     (byte)(10 + 57),
                     83,
                     (byte)(34 + 19),
                     80,
                     (byte)(76 + 21),
                     (byte)(4 + 96),
                     (byte)(57 + 43),
                     (byte)(42 + 63),
                     (byte)(85 + 25),
                     (byte)(20 + 83)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.B("ôāĀÃăÿúăĎýÊĈČąĈĎÐњѧњѝьѮѯћѠѝѤѦ", (byte)9, 66));
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

   private static void b() {
      c = -1310251038326443680L;
      long var0 = c ^ 4160068692682691683L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(41 + 27),
               (byte)(41 + 28),
               (byte)(71 + 12),
               (byte)(44 + 3),
               (byte)(33 + 34),
               (byte)(24 + 42),
               (byte)(6 + 61),
               (byte)(45 + 2),
               80,
               (byte)(46 + 29),
               (byte)(20 + 47),
               (byte)(39 + 44),
               53,
               (byte)(63 + 17),
               (byte)(27 + 70),
               (byte)(12 + 88),
               (byte)(67 + 33),
               (byte)(81 + 24),
               (byte)(62 + 48),
               (byte)(89 + 14)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_433.C("ҼҹҳҘҷ҈ҷӌӌҼҼғ", (byte)50, 67);
               b[1] = NLoginCore_201.A("ŘŌŐĨıŎšŎĬŕőŚšĿŀļĺŗŧũŊůĶķ", (byte)50, 65);
               b[2] = NLoginCore_387.D("ҏҒѼӆҡҴӋҽ҉ҫӄғ", (byte)50, 68);
               b[3] = NLoginCore_451.A("ŝņŎěěĸĢĚĞŒĶĳĹšĦŕĽŬĺġŧŌŨœŲĵĭŴšĶŗũ", (byte)50, 65);
               b[4] = NLoginCore_127.A("ĖĚņĕĶŖśŌįļŐĳŜřĴūūĻŅľŭŐŤűŠĭŷŤĸŔŭĶĶĵžūźŉŴŮťŻƄŤŝźŞŋŔƇƀŚƁƏŖŗ", (byte)50, 65);
               b[5] = NLoginCore_559.F("ԼթԳՠզաՋԸԮՄԭԻԬՒ\u0530ԲԯԲՁմչշՋԻԱվԽԿՂՖճճսաՙոէՂ՚լ֍լֈՎմ\u058cևգՉ֊ւև֏֊աբ", (byte)50, 70);
               b[6] = NLoginCore_076.A("ōľňĬıľŕşĶĢĝńĺšŉļťŬůĭŎŐŤŀŭųŬŰŖĶŤĲųĻŪŏňřŪĺļżŎŋ", (byte)50, 65);
               b[7] = NLoginCore_223.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏҴӐһӚҝҕӜӉҞҿӑ", (byte)50, 68);
               b[8] = NLoginCore_223.E("՛ԨՈԲԿԿՙլՇՃղՎՌԮբդ\u0558զհԶՊՔՁՂ", (byte)50, 69);
               b[9] = NLoginCore_241.F("\u0557Ղ՚դԹԬԵՂԡՄՊլՑյէՠղթԯ՛մզԴՋըշպձցՙոե՛ջ՟՝՚ՃւՋ՝կ։ը\u058bֆեՔււ֍֓ռ֚աբ", (byte)50, 70);
               b[10] = NLoginCore_127.F("ՙէԧԥՂՉլՅՀլՍդՐԭՄձՌԳըԵռզժ՞Շծ՜յ\u0557լեև՚Փ\u0558\u0558ևըՅփթկաՖ", (byte)50, 70);
               b[11] = NLoginCore_575.E("ըՑՙԦԦՃԭԥԩ՝ՁԾՄլԱՠՈշՅԬղ\u0557ճ՞սՀԸտլՁբմ", (byte)50, 69);
               b[12] = NLoginCore_127.C("ҙѾүӅ҅ҢҺҡҝҗ҇ӎҫһӌӔғҒҕҨҫӗҞҟ", (byte)50, 67);
               b[13] = NLoginCore_092.D("ҷҽ҃ҧӅҧҫҩңҬӏҟҋҐӅҾӍҝӑҫҵҰӌҴҔӑӘӠӐғӐҢӒҶҵҾҿҤӗӗҷӦӯӨҹӞӡӲӕӧӐҭҮӲӗӮӹӘӴӕҺһӜӮ", (byte)50, 68);
               b[14] = NLoginCore_433.B("ŘľļĻįľīğłŒŏĤĨĺłńŝŅĮŨĦŏŬūŨŅŧşŷŚŹŦĹŕŎŏĻſŪūœŹƅűœƀţŵľŕŀƎƅſŖŗ", (byte)50, 66);
               b[15] = NLoginCore_559.C("ҏҒѼӆҡҴӋҽ҉ҫӄғ", (byte)50, 67);
               b[16] = NLoginCore_559.E("ԼՈ՜ՄԢԶ՛\u0558ԷԿԹԶ", (byte)50, 69);
               b[17] = NLoginCore_183.B("ŎĭŉğřĘşńĚģĮī", (byte)50, 66);
               b[18] = NLoginCore_387.A("ŚĴĐĭĹĳįŜĖŐŐī", (byte)50, 65);
               b[19] = NLoginCore_453.A("ĸňĺşĻİğěĵŘŚğŀŘŪłŠĿŅŠŧĹĶķ", (byte)50, 65);
               b[20] = NLoginCore_076.D("ҼѻӅҒұҺӂҥҪӄҞғ", (byte)50, 68);
               b[21] = NLoginCore_427.A("ĵŚĵĹĳŌŔšŖřĶĥŧŕĢĶŉĶŝŌĺĹĶķ", (byte)50, 65);
               b[22] = NLoginCore_173.D("ҖҟҐҘҁҖӇҁҷҾҸӍҐӑҬҾӃӂӏӉӍӎҸӘҰҲӟҴұҳӑӗҷӥӠӈӄӝӛһәӜҼӗҿӐҫӏӔҬӁӰӆӲҴӔөӝӽһӼӻӖӱ", (byte)50, 68);
               b[23] = NLoginCore_433.D("ңҠҽқҝ҉ҢҵҌһӌҹӌҦҦҫ҆ҞҖӔӏҹӇҮӉҨҧґӉҪҳҿӌӢӕәӓӊӋңҺӛҤӗүӤӲӜӰӀҾӴӅӑҾҿ", (byte)50, 68);
               b[24] = NLoginCore_127.B("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŪŗļśŲŹőŵŃŰŚŜŔŗśžŖśŌŷƋŝťŏŝƃŪŪŷšƃů", (byte)50, 66);
               b[25] = NLoginCore_076.A("ĜĚĚőĵŘĝĠťŘľŖĳŪśķĴŋķĺŅĮŋœňĬũĮŌŨůŵŎĽŋŲľžŻŰżŵŴżŁƉŷňŘƆŎņŽŻűŠōŢƉŦŏŔŚƐ", (byte)50, 65);
               b[26] = NLoginCore_384.F("ԷԶՇա\u0558\u0558աԠՁՌԺ՜ԾհՀթժաԱՊԭնշԴ՝Լչձ՛\u0557ւ՝ՙ։ՠֆ՟՜\u0558֏\u0557\u058cպլա֕աֈֈնկջճե՛֍խ։աՔ֍ճ֣֓ր֞՛֞։֥֗֏֞֯ըն", (byte)50, 70);
               b[27] = NLoginCore_138.E("ԧԥԥ՜ՀգԨԫհգՉաԾյզՂԿՖՂՅՐԹՖ՞ՓԷմԹ\u0557ճպր\u0558չ՝ֆՙգՈ֊Ռժ֊ՒՒռ\u0590Տծշ\u058cղպֈպ։ձհ՛լՕո֥֑֗՞րփչ՞փպզկօն", (byte)50, 69);
               b[28] = NLoginCore_433.A(
                  "ŗıĹŀĲĹţĲĴĹŏŖŒŉħĳŧřŅŚİħĨŮŢŐŔŦŒİŃżōźŹıŴĿūŗľƂšœłŠŊƃłũŽŭƄőŬƌŵƍƁŬţƇƋƆŦųƟžŬŜƙŭśŗƖűƑŴƄżƪƅžƊƀƜżſƑůƊűƌŵƍƳŮƚƆƭƸƫŻƲƌƼƺƑžǇƠƾƆƞǇơƜƏƯǅƩƢǕƗƯǔǆưƺƱưƫƳǕǏƞǔƠƺƫ",
                  (byte)50,
                  65
               );
               b[29] = NLoginCore_471.D(
                  "ҸҒҖҝғҾӈ҄ҴҊҶҿҡҫҿҌҩӏҩҫӄҥӛҶӕҗӚҨүҚҭҴӝҷӒӠӓӀҷӡҞӘӍҮӊүҺҬӵӆӵӐӐҸӉӉӨӍӵҽӌӬҸӬԂӳӗӤӰөԁӷԂӘӗӸӤӃӳӧԃԎԂӧӎәәԊӰԝӦӹӸԉӻӴԍԙԃԥԒӻԄԄԤԂԞԨԁԏԦӮԀԭԊԆӴԤԊԴԌԫԧӿԱԘԖԺӻԍԢӽԺԥԊԸԃԦԖԓ",
                  (byte)50,
                  68
               );
               b[30] = NLoginCore_241.F("ԲԵԟթՄ\u0557ծՠԬՎէԶ", (byte)50, 70);
               b[31] = NLoginCore_471.B("ŒĳŝĻŕŖŞŕĴĝĞšŖşŪĪśģĩľńşŢŭŇŶĶŏŊŤňŎŊŅľŠşžŏĺŶŅŰźƄżşŬŻƎŇŅŚƆŽŧũƉƎŭŬŷŐƋ", (byte)50, 66);
               b[32] = NLoginCore_384.F("ՇըԠբՊդՍՇՏՊ՟ՀՋՂՈՄդՍժծեՈՉՉ՟ՠՓՍ՛Ղ՚ճդս՟ՓՊՙՉչռռհ\u058b\u058b\u058bփՓև\u058cզյ֖֕֝Ֆլ\u0590ՙ՝ՙ՛֓\u0558", (byte)50, 70);
               b[33] = NLoginCore_553.C("ҺқӅңҽҾӆҽҜ҅҆ӉҾӇӒҒӃҋґҦҬӇӊӕүӞҞҷҲӌҰҶҲҭҦӈӇӦҷҢӞҭӘӢӬӤӇӔӣӶүҭӂӮӥӏӑӱӶӕӔӟҸӳ", (byte)50, 67);
               b[34] = NLoginCore_521.D("ҤӅѽҿҧӁҪҤҬҧҼҝҨҟҥҡӁҪӇӋӂҥҦҦҼҽҰҪҸҟҷӐӁӚҼҰҧҶҦӖәәӍӨӨӨӠҰӤөӃӒӲӳӺҳӉӭҶҺҶҸӰҵ", (byte)50, 68);
               b[35] = NLoginCore_141.F("ԲԵԟթՄ\u0557ծՠԬՎէԶ", (byte)50, 70);
               b[36] = NLoginCore_232.F("ԦԴաԠ՟՚ԻկԩՍ՞ԿՄՄԱկթՃՑդըլսՆՏԼԼՂծխջՆՁտ։\u0558եՌք֍ե՞՝Ֆ", (byte)50, 70);
               b[37] = NLoginCore_451.F("ՠՈՃՃՃԻԻզՐ\u0558ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէզՃզ՝֊բըՍշ\u0558թՖ", (byte)50, 70);
               b[38] = NLoginCore_453.D("҃ґҾѽҼҷҘӌ҆ҪһҜҡҡҎӌӆҠҮӁӅӉӚңҬҙҙҟӋӊӘңҞӜӦҵӂҩӡӪӂһҺҳ", (byte)50, 68);
               b[39] = NLoginCore_433.A("ŕĽĸĸĸİİśŅōĺŇĽńŠŀŦļŧŭőşŲĳŰŠŅŢĮŏŻŜŜņŐŋſŕĹŽŗƃĽŋ", (byte)50, 65);
               b[40] = NLoginCore_223.D("ѺҭѼҏӆҚӁқҦ҆ҧҩҜӃҼҤӌӖӏҰӔҡҞҟ", (byte)50, 68);
               b[41] = NLoginCore_110.E("՜ՕՄԠՊԤՍԿԬՊկթղդԴՌաԪճԳպ\u0557ՋիՐջՊն՝կվՔնՐշաբևՅտւՇչըՅ֑։բ\u058bօ֗իֈ\u0590պՕի՜\u0590֊\u0590ց֏դֆ։բ֗իշ֣ռպ֙լն", (byte)50, 69);
               b[42] = NLoginCore_471.B("ĩĬŎŏļĶĹŢōŠœŤĽķśšŞōľŐłũŉŏőİňĵŖŉŊřĲŌĹśŵųůŸŃşŚŧŒőŖŊƍŌŶŏƌƏŨŏŨŏūƃƃƌŦƖ", (byte)50, 66);
               b[43] = NLoginCore_110.A("ŚėĹĳľśōĹĤıťŜĺĶņĺŠŎŞłŨŦŌŅūŴůłŀůŲĲĮũŋŋŵŌżŷĶļŮŘƄśƊŔŭƃšŢŨűžžšƊůŶƁŶŖŤ", (byte)50, 65);
               b[44] = NLoginCore_553.F("ՇԾՆԾԦԼԿՍՉ՞ը՞ԼՏԲԭՕչՑՑՅչնռԵխԾչՖԾՑչջՠՔըՇփու՛ևՎՊ֎ՋՒֆ\u0590ծՓ֖իշ֜ճնջիչք֜ռ՞", (byte)50, 70);
               b[45] = NLoginCore_451.E("ԝՐԟԲթԽդԾՉԩՊՌԿզ՟ՇկչղՓշՄՁՂ", (byte)50, 69);
               break;
            case 1:
               b[0] = NLoginCore_521.D("ѽҕҿҿҀҷӂҡқӂҧҤӆҭҺґӀӏӈҴҐӗҞҟ", (byte)50, 68);
               b[1] = NLoginCore_559.B("ŘŌŐĨıŎšŎĬŕőŧĴŤŘŬŬśśŁşŢŰŅŧŧŌĴųŦĹķ", (byte)50, 66);
               b[2] = NLoginCore_127.E("Ԧ\u0558ԹԸՁԵդթՀԬԬԶ", (byte)50, 69);
               b[3] = NLoginCore_451.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏӄғӘҸӏӈҙӌҶӛҳ", (byte)50, 68);
               b[4] = NLoginCore_027.A("ĖĚņĕĶŖśŌįļŐĳŜřĴūūĻŅľŭŐŤűŠĭŷŤĸŔŭĶĶĵžūźŉŴŮťŻƆŻŃŪžƅƉŧƁšŽſŖŗ", (byte)50, 65);
               b[5] = NLoginCore_127.E("ԼթԳՠզաՋԸԮՄԭԻԬՒ\u0530ԲԯԲՁմչշՋԻԱվԽԿՂՖճճսաՙոէՂ՚լ֍լ։տ֒է֍՞֗\u0558մ֙ճդաբ", (byte)50, 69);
               b[6] = NLoginCore_201.F("\u0558ՉՓԷԼՉՠժՁԭԨՏՅլՔՇհշպԸՙ՛կՋովշջաՁկԽՂհդտմՌտ\u058bՎ֍թՖ", (byte)50, 70);
               b[7] = NLoginCore_092.B("ŝņŎěěĸĢĚĞŒĶĳĹšĦŕĽŬĺġŧőŞšŦœŮŊķŗŕŎ", (byte)50, 66);
               b[8] = NLoginCore_241.E("՛ԨՈԲԿԿՙլՇՃհՂկխդդԷՋըՅծպՁՂ", (byte)50, 69);
               b[9] = NLoginCore_324.C("ҴҟҷӁҖ҉ҒҟѾҡҧӉҮӒӄҽӏӆҌҸӑӃґҨӅӔӗӎӞҶӕӂҸӘҼҺҷҠӟҨҺӌӤӏҼӡӤӏұӀӗӍҵӧҾҿ", (byte)50, 67);
               b[10] = NLoginCore_127.F("ՙէԧԥՂՉլՅՀլՍդՐԭՄձՌԳըԵռզժ՞Շծ՜յ\u0557լեևցՔշբ\u058b՟ժ\u058bջ՞տՖ", (byte)50, 70);
               b[11] = NLoginCore_241.D("ӅҮҶ҃҃ҠҊ҂҆ҺҞқҡӉҎҽҥӔҢ҉ӏҹҴҳҴӕҫҩҹӌҭҺ", (byte)50, 68);
               b[12] = NLoginCore_183.A("ıĖŇŝĝĺŒĹĵįĝĶģĴŨŧōħľĻōşĶķ", (byte)50, 65);
               b[13] = NLoginCore_110.D("ҷҽ҃ҧӅҧҫҩңҬӏҟҋҐӅҾӍҝӑҫҵҰӌҴҔӑӘӠӐғӐҢӒҶҵҾҿҤӗӗҷӦӯӨҹӞӡӲӕӧӐҭҮӯӛөӵҷӟӺҶӳӮәҾԄӒӾӸӄԉӳӘӆӮӓ", (byte)50, 68);
               b[14] = NLoginCore_384.C("ӀҦҤңҗҦғ҇ҪҺҷҌҐҢҪҬӅҭҖӐҎҷӔӓӐҭӏӇӟӂӡӎҡҽҶҷңӧӒӓһӡӬүӘӐҪҮӕӝӂҰӌӁҾҿ", (byte)50, 67);
               b[15] = NLoginCore_397.F("ԲթՔՉԨ՛ԟՙԥ՝կԶ", (byte)50, 70);
               b[16] = NLoginCore_110.E("զ՚ԥՀդա՝ՉԪՋկճՈՠ\u0530ճ՟ոԲԳՐՄՁՂ", (byte)50, 69);
               b[17] = NLoginCore_223.F("ՙՙԷՖաՈազթաՍՅԯՉմՌՃՓՊիԵժՁՂ", (byte)50, 70);
               b[18] = NLoginCore_223.D("ѼһҤҤ҅ҁӅҟҞ҅ҧ҉ӋӊҭҫғұҍҷҧӇҞҟ", (byte)50, 68);
               b[19] = NLoginCore_027.E("ՃՓՅժՆԻԪԦՀգդՆԲՍըՎԵչՍնՆՄՁՂ", (byte)50, 69);
               b[20] = NLoginCore_433.F("ԢՑդբեՠՈՃԨթՉԶ", (byte)50, 70);
               b[21] = NLoginCore_241.B("ĵŚĵĹĳŌŔšŖřĹśĤĿŧŉŃĵśřŋŢĪŝţŤŗŪńńńŹ", (byte)50, 66);
               b[22] = NLoginCore_027.F("ԹՂԳԻԤԹժԤ՚ա՛հԳմՏազեղլհձ՛ջՓՕւ\u0557ՔՖմպ՚ֈփիէրվ՞ռտ՟պբճՎղշՏդ֓թ֕֗շ՝\u058b֎շռճջ֜", (byte)50, 70);
               b[23] = NLoginCore_004.F("ՆՃՠԾՀԬՅ\u0558ԯ՞կ՜կՉՉՎԩՁԹշղ՜ժՑլՋՊԴլՍՖբկօոռնխծՆ՝վՇկՉ\u058bդ՟բՔլևևֆեն՝֎խղոչ֣օ", (byte)50, 70);
               b[24] = NLoginCore_004.A("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŪŗļśŲŹőŵŃŰŚŜŔŗśžŖśŌŷƋŤťƒƄŮŏşƘũƆŴ", (byte)50, 65);
               b[25] = NLoginCore_091.A("ĜĚĚőĵŘĝĠťŘľŖĳŪśķĴŋķĺŅĮŋœňĬũĮŌŨůŵŎĽŋŲľžŻŰżŵŴżŁƉŷňŘƆŎņŽůŭŦƍšƍƕƐũŷŦŸťŬƉƜƎŶżśŵžū", (byte)50, 65);
               b[26] = NLoginCore_575.A("ĬīļŖōōŖĕĶŁįőĳťĵŞşŖĦĿĢūŬĩŒıŮŦŐŌŷŒŎžŕŻŔőōƄŌƁůšŖƊŖŽŽūŤŰŨŚŐƂŢžŖŉƂŨƈƘŵŕŮƞŬşŘƤŴżŮŴƞƩšťƬƥƧŬƯƯŶŷ", (byte)50, 65);
               b[27] = NLoginCore_387.E(
                  "ԧԥԥ՜ՀգԨԫհգՉաԾյզՂԿՖՂՅՐԹՖ՞ՓԷմԹ\u0557ճպր\u0558չ՝ֆՙգՈ֊Ռժ֊ՒՒռ\u0590Տծշ\u058cղպֈպ։ձհ՛լՕո֥֦֗ս֞ՠճ֬եզփֱ֦֘լ֍ָ֥֑֥֓լֵքցւ", (byte)50, 69
               );
               b[28] = NLoginCore_559.B(
                  "ŗıĹŀĲĹţĲĴĹŏŖŒŉħĳŧřŅŚİħĨŮŢŐŔŦŒİŃżōźŹıŴĿūŗľƂšœłŠŊƃłũŽŭƄőŬƌŵƍƁŬţƇƋƆŦųƟžŬŜƙŭśŗƖűƑŴƄżƪƅžƊƀƜżſƑůƊűƌŵƍƳŮƚƆƭƸƫŻƲƌƼƺƑžǇƠƾƆƞǇơƜƏƯǅƩƢǕƗƯǔǆưƴƷƫƕǝǎƹƵǝƞǅƝơǥǒǝƶǈǫǘǌǯƶƷ",
                  (byte)50,
                  66
               );
               b[29] = NLoginCore_201.D(
                  "ҸҒҖҝғҾӈ҄ҴҊҶҿҡҫҿҌҩӏҩҫӄҥӛҶӕҗӚҨүҚҭҴӝҷӒӠӓӀҷӡҞӘӍҮӊүҺҬӵӆӵӐӐҸӉӉӨӍӵҽӌӬҸӬԂӳӗӤӰөԁӷԂӘӗӸӤӃӳӧԃԎԂӧӎәәԊӰԝӦӹӸԉӻӴԍԙԃԥԒӻԄԄԤԂԞԨԁԏԦӮԀԭԊԆӴԤԊԴԌԫԧӿԱԘԖԺԤԟԐԞԠԂՈԆԗՄԞԓ",
                  (byte)50,
                  68
               );
               b[30] = NLoginCore_559.B("ĭŐĮşŜőľĽŗģľī", (byte)50, 66);
               b[31] = NLoginCore_427.F("՝ԾըՆՠաթՠԿԨԩլաժյԵզԮԴՉՏժխոՒցՁ՚ՕկՓՙՕՐՉիժ։՚ՅցՐջօ֏ևժշֆ֙ՒՐե֙֎ն\u0590֟֡՞մ֛\u0590ռֈր։֟ֆ֜պֆ֟֩։ն", (byte)50, 70);
               b[32] = NLoginCore_530.A("ļŝĕŗĿřłļńĿŔĵŀķĽĹřłşţŚĽľľŔŕňłŐķŏŨřŲŔňĿŎľŮűűťƀƀƀŸňżƁśŪƊƉŊšſŇŬũƑŘƅƐ", (byte)50, 65);
               b[33] = NLoginCore_446.B("ŒĳŝĻŕŖŞŕĴĝĞšŖşŪĪśģĩľńşŢŭŇŶĶŏŊŤňŎŊŅľŠşžŏĺŶŅŰźƄżşŬŻƎŇŅŚſżśŽŤŠŒŸőŭƍŶƊſőƊƎƋŲƓƟƆū", (byte)50, 66);
               b[34] = NLoginCore_110.C("ҤӅѽҿҧӁҪҤҬҧҼҝҨҟҥҡӁҪӇӋӂҥҦҦҼҽҰҪҸҟҷӐӁӚҼҰҧҶҦӖәәӍӨӨӨӠҰӤөӃӒӲӧӏӶҳӐӊҿҺӳӁӵ", (byte)50, 67);
               b[35] = NLoginCore_092.D("ҘӀӃҺҶҠҀҖӅҸҞғ", (byte)50, 68);
               b[36] = NLoginCore_241.C("҃ґҾѽҼҷҘӌ҆ҪһҜҡҡҎӌӆҠҮӁӅӉӚңҬҙҙҟӋӊӘңӡҠӥһәҨӜӧҫӮҫӭӝҼҨӈӨӐӂӌӸӑҾҿ", (byte)50, 67);
               b[37] = NLoginCore_530.E("ՠՈՃՃՃԻԻզՐ\u0558ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէ՟ցբնՂ՚ՌՌՅքՌՖ", (byte)50, 69);
               b[38] = NLoginCore_553.B("ěĩŖĕŔŏİŤĞłœĴĹĹĦŤŞĸņřŝšŲĻńııķţŢŰĻŪũŎųŋƁœűſƂœŲŀżŸņţŦũƎŸřŖŗ", (byte)50, 66);
               b[39] = NLoginCore_559.F("ՠՈՃՃՃԻԻզՐ\u0558ՅՒՈՏիՋձՇղո՜ժսԾջիՐխԹ՚ֆէքՂՒյ֊Ջս֎ժՌ՝Ֆ", (byte)50, 70);
               b[40] = NLoginCore_451.B("ĒŅĔħŞĲřĳľĞŀŕĴŗĳĿħŬĬŰŨĹĶķ", (byte)50, 66);
               b[41] = NLoginCore_183.C("ҹҲҡѽҧҁҪҜ҉ҧӌӆӏӁґҩҾ҇ӐҐӗҴҨӈҭӘҧӓҺӌӛұӓҭӔҾҿӤҢӜӟҤӖӅҢӮӦҿӨӢӴӈӥӭӗҲӈҹӭӧӭӞӬӁӯӻԄӲӛӟӼӽӌӷӍӓ", (byte)50, 67);
               b[42] = NLoginCore_127.F("ԴԷՙ՚ՇՁՄխ\u0558ի՞կՈՂզլթ\u0558Չ՛ՍմՔ՚՜ԻՓՀաՔՕդԽ\u0557ՄզրվպփՎժեղ՝՜աՕ֘\u0557ց՚֗Փ՜֗֠վ֚Ք՟վձղ", (byte)50, 70);
               b[43] = NLoginCore_453.F("եԢՄԾՉզ\u0558ՄԯԼհէՅՁՑՅիՙթՍճձ\u0557ՐնտպՍՋպսԽԹմՖՖր\u0557ևւՁՇչգ֏զ֕՟ո֎լխճշճչՙ֠֏՛ո֛֕֏՝ֆձ֞փ՞֧ֆ֥կ֣ն", (byte)50, 70);
               b[44] = NLoginCore_223.F("ՇԾՆԾԦԼԿՍՉ՞ը՞ԼՏԲԭՕչՑՑՅչնռԵխԾչՖԾՑչջՠՔըՇփու՛ևՎՊ֎ՋՒֆ\u0590ծՓ֖ի։չ֊ժ֠ղվ՜ո֑֠", (byte)50, 70);
               b[45] = NLoginCore_397.A("ĒŅĔħŞĲřĳľĞŀģĻŧĪĽĺŎŗļŞĹĶķ", (byte)50, 65);
               break;
            case 2:
               b[0] = NLoginCore_004.E("Մ՜եՈԸ՟լԭՂԫդթԫԴզգՈմՍձՅՏԽՒՖ՚ՖՒԵճ\u0557ֆ", (byte)50, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_232.C("ҀҐҧҷ҄ӈҢӇӇҾҪҧ҆ҿӃҎҞҳҫґұӇҞҟ", (byte)50, 67);
         }
      }
   }
}
