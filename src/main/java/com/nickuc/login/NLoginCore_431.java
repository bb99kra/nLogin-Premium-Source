package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_431 extends NLoginCore_353 {
   private static int db = Integer.reverse(-2080374784);
   private static long w = Long.reverse(5405050147170225556L);
   private static int fm = Integer.reverse(-872415232);
   private static long cz = Long.reverse(5405050147170225556L);
   private static int aj = 75497472 >>> 151 | 75497472 << -151;
   private static int ei = Integer.reverse(-1);
   private static long cx = Long.reverse(3891110078048108544L);
   private static long ct = Long.reverse(5405050147170225556L);
   private static int fg = Integer.reverse(0);
   private static long bt = Long.reverse(3891110078048108544L);
   private static int k = Integer.reverse(0);
   private static int bw = -1207959552 >>> 251 | -1207959552 << -251;
   private static int i = Integer.reverse(0);
   private static int fj = Integer.reverse(1275068416);
   private static long bz = Long.reverse(9007929849066622356L);
   private static int ck = Integer.reverse(-1);
   private static long dm = Long.reverse(9007929849066622356L);
   private static long m = Long.reverse(9007929849066622356L);
   private static long fi = Long.reverse(4296434044511453184L);
   private static int bp = (-1 >>> 245 | -1 << -245) & -1;
   private static int cu = Integer.reverse(0);
   private static int dt = (1610612738 >>> 220 | 1610612738 << ~220 + 1) & -1;
   private static long cf = Long.reverse(5405050147170225556L);
   private static int fq = Integer.reverse(738197504);
   private static long bq = Long.reverse(5405050147170225556L);
   private static long c;
   private static String[] ZKM_STR_A = new String[NLoginCore_431.fp];
   private static long ao = Long.reverse(3891110078048108544L);
   private static long ag = Long.reverse(5405050147170225556L);
   private static int ci = Integer.reverse(0);
   private static long dz = Long.reverse(3891110078048108544L);
   private static int r = Integer.reverse(0);
   private static int ds = Integer.reverse(0);
   private static long dk = Long.reverse(3891110078048108544L);
   private static int em = Integer.reverse(872415232);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int dp = Integer.reverse(-1543503872);
   private static int ay = (458752 >>> 15 | 458752 << ~15 + 1) & -1;
   private static long cw = Long.reverse(9007929849066622356L);
   private static int ab = Integer.reverse(-1);
   private static int co = Integer.reverse(Integer.MIN_VALUE);
   private static int de = Integer.reverse(1140850688);
   private static int eq = (-1 >>> 184 | -1 << -184) & -1;
   private static long ak = Long.reverse(9007929849066622356L);
   private static long fk = Long.reverse(9007929849066622356L);
   private static long fc = Long.reverse(3891110078048108544L);
   private static long ff = Long.reverse(5405050147170225556L);
   private static long bv = Long.reverse(5405050147170225556L);
   private static long dj = Long.reverse(9007929849066622356L);
   private static long dc = Long.reverse(9007929849066622356L);
   private static int ep = (23592960 >>> 243 | 23592960 << -243) & -1;
   private static long fn = Long.reverse(9007929849066622356L);
   private static long bs = Long.reverse(9007929849066622356L);
   private static long ac = Long.reverse(5405050147170225556L);
   private static long e = Long.reverse(5405050147170225556L);
   private static long bd = Long.reverse(3891110078048108544L);
   private static long er = Long.reverse(5405050147170225556L);
   private static long u = Long.reverse(5405050147170225556L);
   private static int ec = (-1 >>> 7 | -1 << -7) & -1;
   private static int dw = 0 >>> 89 | 0 << ~89 + 1;
   private static int bo = Integer.reverse(671088640);
   private static long bn = Long.reverse(5405050147170225556L);
   private static int bh = Integer.reverse(-2013265920);
   private static int eu = (1073741825 >>> 29 | 1073741825 << -29) & -1;
   private static int dl = (9 >>> 126 | 9 << ~126 + 1) & -1;
   private static long dg = Long.reverse(3891110078048108544L);
   private static int fa = Integer.reverse(201326592);
   private static long al = Long.reverse(3891110078048108544L);
   private static long en = Long.reverse(9007929849066622356L);
   private static int bl = (76 >>> 130 | 76 << -130) & -1;
   private static int s = 524288 >>> 115 | 524288 << ~115 + 1;
   private static int x = Integer.reverse(1610612736);
   private static int eh = (1376256 >>> 111 | 1376256 << ~111 + 1) & -1;
   private static long bi = Long.reverse(5405050147170225556L);
   private static long aw = Long.reverse(9007929849066622356L);
   private static int as = (3072 >>> 232 | 3072 << ~232 + 1) & -1;
   private static int d = -1 >>> 151 | -1 << ~151 + 1;
   private static int ai = (0 >>> 203 | 0 << ~203 + 1) & -1;
   private static long bk = Long.reverse(5405050147170225556L);
   private static long bc = Long.reverse(9007929849066622356L);
   private static long au = Long.reverse(3891110078048108544L);
   private static int c = Integer.reverse(0);
   private static long z = Long.reverse(5405050147170225556L);
   private static long ex = Long.reverse(3891110078048108544L);
   private static long n = Long.reverse(3891110078048108544L);
   private static long dr = Long.reverse(3891110078048108544L);
   private static int ad = (16777216 >>> 88 | 16777216 << ~88 + 1) & -1;
   private static int ey = Integer.reverse(-201326592);
   private static long ez = Long.reverse(5405050147170225556L);
   private static int cn = 16384 >>> 45 | 16384 << ~45 + 1;
   private static int h = Integer.reverse(0);
   private static int di = (805306370 >>> 28 | 805306370 << -28) & -1;
   private static int fp = 851968 >>> 174 | 851968 << ~174 + 1;
   private static int ev = Integer.reverse(1946157056);
   private static int bm = Integer.reverse(-1);
   private static long cc = Long.reverse(9007929849066622356L);
   private static long dn = Long.reverse(3891110078048108544L);
   private static long an = Long.reverse(9007929849066622356L);
   private static int ce = (109051904 >>> 22 | 109051904 << -22) & -1;
   private static long ba = Long.reverse(5405050147170225556L);
   private static long bx = Long.reverse(5405050147170225556L);
   private static int bu = (180224 >>> 173 | 180224 << ~173 + 1) & -1;
   private static int ea = Integer.reverse(0);
   private static long ew = Long.reverse(9007929849066622356L);
   private static int eb = Integer.reverse(335544320);
   private static int fd = Integer.reverse(-1946157056);
   private static int da = 0 >>> 135 | 0 << ~135 + 1;
   private static int cj = Integer.reverse(939524096);
   private static long cl = Long.reverse(5405050147170225556L);
   private static long eo = Long.reverse(3891110078048108544L);
   private static int av = Integer.reverse(-1342177280);
   private static long fl = Long.reverse(3891110078048108544L);
   private static int fh = 0 >>> 226 | 0 << ~226 + 1;
   private static int dx = Integer.reverse(-469762048);
   private static int am = Integer.reverse(1342177280);
   private static int ae = (0 >>> 252 | 0 << -252) & -1;
   private static long df = Long.reverse(9007929849066622356L);
   private static long fb = Long.reverse(9007929849066622356L);
   private static int br = (2688 >>> 167 | 2688 << ~167 + 1) & -1;
   private static int az = -1 >>> 129 | -1 << -129;
   private static int et = Integer.reverse(671088640);
   private static long eg = Long.reverse(5405050147170225556L);
   private static long du = Long.reverse(9007929849066622356L);
   private static String[] ZKM_STR_B = new String[fq];
   private static long ar = Long.reverse(3891110078048108544L);
   private static long cr = Long.reverse(5405050147170225556L);
   private static int ek = Integer.reverse(-738197504);
   private static int bj = (75497472 >>> 182 | 75497472 << ~182 + 1) & -1;
   private static int y = Integer.reverse(-1);
   private static int be = Integer.reverse(134217728);
   private static long g = Long.reverse(5405050147170225556L);
   private static long q = Long.reverse(3891110078048108544L);
   private static long ej = Long.reverse(5405050147170225556L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int t = (32 >>> 227 | 32 << ~227 + 1) & -1;
   private static int ef = (83968 >>> 203 | 83968 << ~203 + 1) & -1;
   private static long bf = Long.reverse(9007929849066622356L);
   private static int var_do = Integer.reverse(0);
   private static int af = Integer.reverse(268435456);
   private static int dh = Integer.reverse(0);
   private static int by = Integer.reverse(402653184);
   private static long dq = Long.reverse(9007929849066622356L);
   private static int cb = Integer.reverse(-1744830464);
   private static long aq = Long.reverse(9007929849066622356L);
   private static int cm = Integer.reverse(0);
   private static long ed = Long.reverse(5405050147170225556L);
   private static long dv = Long.reverse(3891110078048108544L);
   private static int cs = Integer.reverse(2013265920);
   private static int v = Integer.reverse(-1610612736);
   private static long cd = Long.reverse(3891110078048108544L);
   private static int cv = 124 >>> 34 | 124 << -34;
   private static long ax = Long.reverse(3891110078048108544L);
   private static int o = (50331648 >>> 152 | 50331648 << -152) & -1;
   private static long bg = Long.reverse(3891110078048108544L);
   private static int cy = (512 >>> 36 | 512 << ~36 + 1) & -1;
   private static long ca = Long.reverse(3891110078048108544L);
   private static int aa = Integer.reverse(-536870912);
   private static long dd = Long.reverse(3891110078048108544L);
   private static int cq = -1 >>> 234 | -1 << ~234 + 1;
   private static int cg = (110592 >>> 204 | 110592 << -204) & -1;
   private static int l = 512 >>> 136 | 512 << ~136 + 1;
   private static long p = Long.reverse(9007929849066622356L);
   private static int fe = Integer.reverse(-1);
   private static long dy = Long.reverse(9007929849066622356L);
   private static long el = Long.reverse(5405050147170225556L);
   private static int es = Integer.reverse(0);
   private static int cp = Integer.reverse(-1207959552);
   private static long fo = Long.reverse(3891110078048108544L);
   private static int ah = Integer.reverse(Integer.MIN_VALUE);
   private static int ee = Integer.reverse(0);
   private static int bb = Integer.reverse(-268435456);
   private static long ch = Long.reverse(5405050147170225556L);
   private static int ap = Integer.reverse(-805306368);
   private static long at = Long.reverse(9007929849066622356L);

   public NLoginCore_431(NLoginType_008 var1) {
      String var10002 = a(c & d, e);
      String var10003 = a(f, g);
      int var10004 = h;
      int var10005 = i;
      String[] var10006 = new String[j];
      var10006[k] = a(l, m ^ n);
      super(var1, var10002, var10003, (var10004 != 0), (var10005 != 0), var10006);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_431.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.A("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 65), NLoginCore_431.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.F("ջֈևՊ֊ֆց֊֕քՑ֏֓\u058c֏֕\u0557ࣰࣩࣣ࣭࣪ࣟࣨࣖի", (byte)92, 70) + var1 + NLoginCore_201.D("ԃ", (byte)92, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != cn) {
         this.a(var1);
      } else {
         String var3 = var2[co].toUpperCase(Locale.ENGLISH);
         NLoginCore_479 var4 = NLoginCore_479.a(var3);
         if (var4 == null) {
            NLoginCore_150.a(var1, this.j() ? a(cp & cq, cr) : a(cs, ct));
         } else {
            NLoginCore_374 var5 = var4.a();
            if (var5 == null) {
               NLoginCore_150.a(var1, this.j() ? a(cv, cw ^ cx) : a(cy, cz));
            } else if (!var5.G()) {
               NLoginCore_150.a(var1, this.j() ? a(db, dc ^ dd) : a(de, df ^ dg));
            } else {
               NLoginCore_036 var6 = this.a.a().a().a();
               if (var4 != NLoginCore_479.R || var6 != NLoginCore_036.d && var6 != NLoginCore_036.c) {
                  if (var4 == NLoginCore_479.Q && var6 == NLoginCore_036.f) {
                     if (this.j()) {
                        NLoginCore_150.a(var1, a(dp, dq ^ dr));
                        NLoginCore_150.a(var1, a(dt, du ^ dv));
                     } else {
                        NLoginCore_150.a(var1, a(dx, dy ^ dz));
                        NLoginCore_150.a(var1, a(eb & ec, ed));
                     }
                  } else {
                     if (var1 instanceof NLoginCore_277) {
                        ((NLoginCore_277)var1)
                           .a(
                              a(ef, eg),
                              this.j() ? a(eh & ei, ej) + var4.getName() + a(ek, el) : a(em, en ^ eo) + var4.getName() + a(ep & eq, er),
                              es,
                              et,
                              eu
                           );
                     } else {
                        NLoginCore_150.a(
                           var1, this.j() ? a(ev, ew ^ ex) + var4.getName() + a(ey, ez) : a(fa, fb ^ fc) + var4.getName() + a(fd & fe, ff)
                        );
                     }

                     this.a.b((fh != 0)).a(() -> var5.d(var1), fi, TimeUnit.MILLISECONDS);
                  }
               } else {
                  NLoginCore_150.a(var1, this.j() ? a(di, dj ^ dk) : a(dl, dm ^ dn));
               }
            }
         }
      }
   }

   private void a(NLoginInterface_042 var1) {
      NLoginCore_150.a(var1, a(o, p ^ q));
      if (var1 instanceof NLoginCore_277) {
         NLoginCore_277 var2 = (NLoginCore_277)var1;
         NLoginCore_509 var3 = this.a.a().b(var2);
         NLoginInterface_024 var4 = var3.a();
         int var5 = s;

         for (NLoginCore_479 var7 : NLoginCore_479.b()) {
            NLoginCore_374 var8 = var7.a();
            if (var8 != null && var8.G() && !var7.H()) {
               String var9 = this.a((var5 != 0));
               var4.a(
                  a(t, u) + var9 + var7.getName(),
                  this.j() ? a(v, w) : a(x & y, z),
                  a(aa & ab, ac) + var7.getName().toLowerCase(Locale.ENGLISH)
               );
               var5 = var5 == 0 ? ad : ae;
            }
         }

         var4.a(a(af, ag));
         String var13 = this.a((var5 != 0));
         var5 = var5 == 0 ? ah : ai;
         String var14 = this.a((var5 != 0));
         if (this.j()) {
            String var15 = a(aj, ak ^ al);
            var4.a(a(am, an ^ ao) + var13 + a(ap, aq ^ ar) + var13 + a(as, at ^ au), var15, a(av, aw ^ ax));
            var4.a(a(ay & az, ba) + var14 + a(bb, bc ^ bd) + var14 + a(be, bf ^ bg), var15, a(bh, bi));
         } else {
            String var16 = a(bj, bk);
            var4.a(a(bl & bm, bn) + var13 + a(bo & bp, bq) + var13 + a(br, bs ^ bt), var16, a(bu, bv));
            var4.a(a(bw, bx) + var14 + a(by, bz ^ ca) + var14 + a(cb, cc ^ cd), var16, a(ce, cf));
         }
      } else {
         for (NLoginCore_479 var11 : NLoginCore_479.b()) {
            NLoginCore_150.a(var1, a(cg, ch) + var11.getName().toLowerCase(Locale.ENGLISH));
         }
      }

      NLoginCore_150.a(var1, a(cj & ck, cl));
   }

   private String a(boolean var1) {
      return var1 ? a(fj, fk ^ fl) : a(fm, fn ^ fo);
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 108L;
      var1 ^= -1591182043178912210L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     (byte)(17 + 52),
                     (byte)(27 + 56),
                     (byte)(25 + 22),
                     (byte)(10 + 57),
                     (byte)(52 + 14),
                     67,
                     (byte)(6 + 41),
                     (byte)(45 + 35),
                     (byte)(68 + 7),
                     (byte)(27 + 40),
                     (byte)(33 + 50),
                     (byte)(23 + 30),
                     (byte)(25 + 55),
                     (byte)(56 + 41),
                     (byte)(46 + 54),
                     (byte)(36 + 64),
                     (byte)(58 + 47),
                     (byte)(83 + 27),
                     (byte)(46 + 57)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢵࢼࢯࢹࢶࢫࢴࢢ", (byte)40, 70));
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
      c = 3004044975099429054L;
      long var0 = c ^ -1591182043178912210L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(51 + 17),
               (byte)(32 + 37),
               (byte)(12 + 71),
               (byte)(9 + 38),
               (byte)(8 + 59),
               (byte)(31 + 35),
               (byte)(46 + 21),
               (byte)(18 + 29),
               (byte)(77 + 3),
               75,
               67,
               (byte)(50 + 33),
               (byte)(29 + 24),
               (byte)(75 + 5),
               (byte)(64 + 33),
               (byte)(93 + 7),
               (byte)(32 + 68),
               (byte)(30 + 75),
               (byte)(83 + 27),
               (byte)(73 + 30)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(35 + 48)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.E("ԫԩՎՖՕԵԸԮ՚ՁԽԦ", (byte)34, 69);
               ZKM_STR_B[1] = NLoginCore_384.F("ԿԥԑԮԥԨԪԞԕԚԠգԳ՛Լՙԙԧ՚եՆՄԱԲ", (byte)34, 70);
               ZKM_STR_B[2] = NLoginCore_397.C("ѯџҖѣѮҎҗ҈ҋіѮѻѰѿҔѵіѯ҂ҠѰѱѮѯ", (byte)34, 67);
               ZKM_STR_B[3] = NLoginCore_223.C("ѡҒҕ҇ґяҔіѨѵѮѣ", (byte)34, 67);
               ZKM_STR_B[4] = NLoginCore_471.F("ԍԣՙ՛ՎԽՇԳՇԶԸբԶՐՃբՆէեՕԩ՚ԱԲ", (byte)34, 70);
               ZKM_STR_B[5] = NLoginCore_471.C("҇ѲѬҔѵѷҐ҃҉ѓѝҙҘҜўҟѲҒѮҁҩҡѼҝ҅ѿ҃үҜҚ҄ҫѾҵҦҴҠҢҏ҅ҫҏҺҔҏҲҬҎ҄ҭҲҞҙҶӋҧ҃ҷҫӐҘҡӌқӃңӃӂңҘӖҷӉҷҾң", (byte)34, 67);
               ZKM_STR_B[6] = NLoginCore_553.A("ĤĴĞùĠĲčĎěĂÿĞăĚĀŊŋĕňľıľĥŅĐĽČĿĨłłŖŚĴĿĪŊĻŋļġĭŠĥĺĲŠśŌŞŜŠŦĮŋŜĮĳĴĭťŭŵūŝĺŷĶŉŵľŰƂźŞŋ", (byte)34, 65);
               ZKM_STR_B[7] = NLoginCore_553.D("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅ҒңѫҤѸҙѮѭ҉ҐѮ", (byte)34, 68);
               ZKM_STR_B[8] = NLoginCore_076.A("ĉĺĽįĹ÷ļþĐĝĖċ", (byte)34, 65);
               ZKM_STR_B[9] = NLoginCore_471.A("įĚĔļĝğĸīıûąŁŀńĆŇĚĺĖĩőŉĤŅĭħīŗńłĬœĦŝŎŜňŊķĭœķšľŅĻŤţŌĤĿĸľĽŊŐŅŤĵŖűŤśŲļūŪūŲůœŹŰŁŢśŚśųŅňŘşřūũŖŗ", (byte)34, 65);
               ZKM_STR_B[10] = NLoginCore_453.E("ԍԣՙ՛ՎԽՇԳՇԶԸբԶՐՃբՆէեՕԩ՚ԱԲ", (byte)34, 69);
               ZKM_STR_B[11] = NLoginCore_110.F("ԐԱՔԔԔԦՖՏԯԲՓԪՓԬ՝Մ՚ըՠաԢժԱԲ", (byte)34, 70);
               ZKM_STR_B[12] = NLoginCore_027.B("ęĎôďİĪĲüĒęĖċ", (byte)34, 66);
               ZKM_STR_B[13] = NLoginCore_232.D("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅҄ѦҕѬѺҠҧҋҐ҂Ҳҝҥҋѱҍҋ҂ҏҚҒ҆҃", (byte)34, 68);
               ZKM_STR_B[14] = NLoginCore_004.D("ъѠҖҘҋѺ҄Ѱ҄ѳѵҟѳҍҀҟ҃ҤҢҒѦҗѮѯ", (byte)34, 68);
               ZKM_STR_B[15] = NLoginCore_223.C("ъёѕҍѓѕѶѪғҝҘ҈ћҔҗѾҘѥҦҟѥѱѮѯ", (byte)34, 67);
               ZKM_STR_B[16] = NLoginCore_201.F("ՖՃ\u0558ԢԩԜԶԶԹՏԵԦ", (byte)34, 70);
               ZKM_STR_B[17] = NLoginCore_173.E("ԏԐԴՏՍԎՒՊԷԳբԪԡԽ՞ԽԟՕ՚՞ՈՔլէհԺըձԲդՅՆԴԶ\u0557\u0558ԳջՒխէՌԼՆ", (byte)34, 69);
               ZKM_STR_B[18] = NLoginCore_183.A("ĤĴĞùĠĲčĎěĂÿĞăĚĀŊŋĕňľıľĥŅĐĽČĿĨłłŖŚĴĿĪŊĻŋļġĭŠŤŔŖĠŪŬŝŅŌŇŏņųŴŝŉūŧıőŜŷĻŴķŴŖĹŶŹŀŸŋ", (byte)34, 65);
               ZKM_STR_B[19] = NLoginCore_397.B("òĈľŀĳĢĬĘĬěĝŇěĵĨŇīŌŊĺĎĿĖė", (byte)34, 66);
               ZKM_STR_B[20] = NLoginCore_076.B("õĖĹùùċĻĴĔėĸďĸđłĩĿōŅņćŏĖė", (byte)34, 66);
               ZKM_STR_B[21] = NLoginCore_387.E("ԴԩԏԪՋՅՍԗԭԴԱԦ", (byte)34, 69);
               ZKM_STR_B[22] = NLoginCore_521.D("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅҄ѦҕѬѺҠҧҋҐ҂Ҳҝҥҋѱҍҋ҂ҏҚҒ҆҃", (byte)34, 68);
               ZKM_STR_B[23] = NLoginCore_027.B("òĈľŀĳĢĬĘĬěĝŇěĵĨŇīŌŊĺĎĿĖė", (byte)34, 66);
               ZKM_STR_B[24] = NLoginCore_241.B("òùýĵûýĞĒĻŅŀİăļĿĦŀčŎŇčęĖė", (byte)34, 66);
               ZKM_STR_B[25] = NLoginCore_553.C("ғҀҕџѦљѳѳѶҌѲѣ", (byte)34, 67);
               ZKM_STR_B[26] = NLoginCore_397.C("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅ґҩҤҭѷҥҮѯҡ҂҃ѱѳҔҕѰҸҏҪҤ҉ѹ҃", (byte)34, 67);
               ZKM_STR_B[27] = NLoginCore_397.A("òĈľŀĳĢĬĘĬěĝĲģĪĚćĠĵĹńġŃĈįĞĞňŎģĲřŋŗĔőŝīĸĴģĬĮĲī", (byte)34, 65);
               ZKM_STR_B[28] = NLoginCore_553.C("ѡҒҕ҇ґяҔіѨѵѮѣ", (byte)34, 67);
               ZKM_STR_B[29] = NLoginCore_223.E("ԷՖՔԴԪԸԱԝԑ՚Ԙ\u0557Ԭ՛ԱՃԢՆԦԥԼԿՌԬ\u0558իԼբԾԭծԵաՋԵՎկ՚էՑՉՑջկԵՕ՚րԿոմյոպՑՒ", (byte)34, 69);
               ZKM_STR_B[30] = NLoginCore_427.C("҃ѫ҈ѨѩѲѶѪқѯҖҌіҔҁңѵѷѣҀў҆ҟқҫҎҊҞґҍҜҰҢҁѳҪҁ҄҅ҶҲ҈ҋҠҸҐҴҿҒҲҀғҁ҇ӃҟҖҵҋҙӌңүҍ", (byte)34, 67);
               ZKM_STR_B[31] = NLoginCore_530.E(
                  "ՌԵՄԫՔԻՔՊԝԹՉ\u0557՜ՙՑՎՃԨԡգզՀՙկԦԿԱՎժԭէգոՕյգգզՒՎխրւՁչՙվցՙշբփս՜Ռբպխ\u058c֓վՆՓյփ֗Տշ֊ճՏՖ֘տ֖\u0590\u058b֙֔֡հդև\u058b֨դ֥դ֥\u058bսդ֒իֶ֥֪֭֕֙\u058b֎\u0590ָֽ֏\u0590ִչּւֳֶֿ֞֘֡\u05ca֑֒",
                  (byte)34,
                  69
               );
               ZKM_STR_B[32] = NLoginCore_138.B("ĐĴĽēŁđĂüġĿĺĥĥûĈņėĭħĽŃņĤĳńĮŒġŒĔĕīřŊŕśĹĲĮıŝşŀŨķţřŪĨķŃġĪłŅŬţŵŷĩĪŹŴżŋĸũŔŴśĺžŝŴņŘŴłƋũŨŬůŷŢƏŧűżŽƇƂŠŤƆƘƄŘŲūŠƑųŞƚƒŝū", (byte)34, 66);
               ZKM_STR_B[33] = NLoginCore_446.C(
                  "Ѡ҆҅҃ѠђҘѩҐѧљҠќѳѰѾҀѢҏҦҜѴҢғҗѩҠҪҞҰѺҞҤ҈ҪѳҎҙҏҫѮҍҸҿѸҌҳҤңӆҰӃҥҢғҟҤӂһҿҼҬӑҲҠӏұҴӂӁҢҹӓҮқӓҺҮӎңӢҞӣӥӚӅәӃӣӥӬүӀӢӤӣҭҧӧӉӈӪӲӖӼӯӎӃ", (byte)34, 67
               );
               ZKM_STR_B[34] = NLoginCore_091.C("ҐџғѱѨҘѬєҘѥѮќҡѪџҖғѾѶѤңҒѠҔѸѩҥѦҁѬѮҞѮҩҊҤѲҔҩҺҰ҈ҾҨҏҽғ҂қҮӀҴҳҕҜӃӆҌҫҮӄңҾҼҳҨңҡӑӏҖҘӉҬӇӔҗӢӢҴӛӤӠһӇӔҿҨҾӇӎӜӡӡӰӒ", (byte)34, 67);
               ZKM_STR_B[35] = NLoginCore_384.C(
                  "ѽўѮѥѳ҂Ҍ҇қѷѧѧҊћҍѿҗџҟѺҟћѢ҈ѫҫѷѡ҄ҌҍҬѲҞҡҸҙңғҒҦҥқҖҰҞҟѽӃҘѼҽѾҝҴҴӍҫңҗұүҮҰҲҐҠӊҕҷӓӃҘӕҿұҘәӋҷӤӀҺҿӒӜӚҷӋҾҦҡӞҰӇӨӌҮӣӦӨҴӬӍӖҳӒӃ", (byte)34, 67
               );
               ZKM_STR_B[36] = NLoginCore_183.D(
                  "ѳьѴџѥҙѨҚѨѲ҇ѺҀѮҔѮѭѴҎљҒѥҞғ҅ҟҀҨѰҬѿҭѫѿ҂҃҇ҏҹҮҷҝѺҋҟѷҎҏґңҮҷѺҕҳҘӆӅҤӊҤӊӈҐҽҢӗҧҸҬҤҙӉҲҙҞӘӊҠӢҠӄӢҲҧӨҳҽӢӉӢӤҭӦҪҰҦӟүӶӆҰӑӬәӏӬӃ", (byte)34, 68
               );
               ZKM_STR_B[37] = NLoginCore_027.F("ՀԡԱԨԶՅՏՊ՞ԺԪԪՍԞՐՂ՚ԢբԽբԞԥՋԮծԺԤՇՏՐկԵադջ՜զՖՕթը՞ՙճաբՀֆ՛ԿրՁՠշշ\u0590ծզ՚մղձճյՓգ֍\u0558պ֖ֆ՛֘ւմ՛֜֎պ֧փսւ֧֕զ֜օ֚ֆ֥ֆ֕֫մ", (byte)34, 70);
               ZKM_STR_B[38] = NLoginCore_201.F("ՈՒԣԢԯՆԬ՞\u0558ԲՓԜՏՌաբ՜էԾԨՓէԻ՚ՅԺգՌԮԳբՇդոէԳՋէԺԾէ\u0557ՀոՎՙՄԿջռՔպ՛պՑՒ", (byte)34, 70);
               ZKM_STR_B[39] = NLoginCore_427.A("ěôĜćčŁĐłĐĚįĢĨĖļĖĕĜĶāĺčņĻĭŇĨŐĘŔħŕēħĪīįķšŖşŅĢĳŇğĶķĹŋŖşĢĽśŀŮŭŌŲŌŲŰĸťŊſŏŠŔŌŁűŚŃŶĺŞłŁňŅŤƈŇƐňōƉƓŠƆŦŨƎőœżƎŽŻŠŚūųƤžū", (byte)34, 65);
               ZKM_STR_B[40] = NLoginCore_232.E("\u0558ԱԶՒԑԹՅԹԴԲ՛ԼՑԮ՛զՒՔՄԢՆզ՞ԺԭՆիհԫԮՑդիՁՉշկՇՐվչՉ՟ԽՃՐշՏՅվՙշ՝դզֆՊդեՏՊցՠՕ", (byte)34, 69);
               ZKM_STR_B[41] = NLoginCore_223.B("ĉĺĽįĹ÷ļþĐĝĖċ", (byte)34, 66);
               ZKM_STR_B[42] = NLoginCore_384.B("ĹûĐľČČŃĒĜăłħúĿŃĻĆėĿĉĚŌĢĒİľįĥŒėĴĩŌıěķěŞĚŤĢŁŘī", (byte)34, 66);
               ZKM_STR_B[43] = NLoginCore_324.C("ѩ҆ґҁюѷѵѱѳҕҘѣ", (byte)34, 67);
               ZKM_STR_B[44] = NLoginCore_173.C("ҕѫѨѤ҆ѯљѵҎїҔѭјљљҖѤѺҠљҜѨҔѺҁѶѿҙҘ҂Ғѫ", (byte)34, 67);
               ZKM_STR_B[45] = NLoginCore_241.F("ՃՏՃԸԙԪԗԞՇ՛ՁԘԯԯԮԿՇԾԟԷԽԴԱԲ", (byte)34, 70);
               ZKM_STR_B[46] = NLoginCore_091.E("ՔԖԫՙԧԧ՞ԭԷԞ՝Ղԕ՚՞ՖԡԲ՚ԤԵէԽԭՋՙՊՀխԲՏՄէՌԶՒԶչԵտԽ՜ճՆ", (byte)34, 69);
               ZKM_STR_B[47] = NLoginCore_559.C("ѩ҆ґҁюѷѵѱѳҕҘѣ", (byte)34, 67);
               ZKM_STR_B[48] = NLoginCore_433.F("\u0558ԮԫԧՉԲԜԸՑԚ\u0557\u0530ԛԜԜՙԧԽգԜ՟ԫ\u0557ԽՄԹՂ՜՛ՅՕԮ", (byte)34, 70);
               ZKM_STR_B[49] = NLoginCore_433.D("ҀҌҀѵіѧєћ҄ҘѾѕѬѬѫѼ҄ѻќѴѺѱѮѯ", (byte)34, 68);
               ZKM_STR_B[50] = NLoginCore_004.A("ħĪöĩďĴĭįļĒĚċ", (byte)34, 65);
               ZKM_STR_B[51] = NLoginCore_173.F("ՐԤԐԲՕՏՖՎԝԶԹԦ", (byte)34, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.F("ԠԊԡ\u0530Մ\u0557ՓԙԨԖՏԞՓՒԱԻԤ\u0557ՙԽՂ՚ԱԲ", (byte)34, 70);
               ZKM_STR_B[1] = NLoginCore_232.A("ĤĊöēĊčďăúÿĆďĳĖŊęŊĞĠłĉĈōŃĒŌĞğĮŕŅģ", (byte)34, 65);
               ZKM_STR_B[2] = NLoginCore_446.A("ėćľċĖĶĿİĳþĖĿąĞŇĸğŀļčćĩĖė", (byte)34, 65);
               ZKM_STR_B[3] = NLoginCore_138.B("ĳĭĆĊđþĵıĮ÷İċ", (byte)34, 66);
               ZKM_STR_B[4] = NLoginCore_427.F("ԍԣՙ՛ՎԽՇԳՇԶԵգԹԣԣՒՄԧԹթՕ՚ԱԲ", (byte)34, 70);
               ZKM_STR_B[5] = NLoginCore_004.A("įĚĔļĝğĸīıûąŁŀńĆŇĚĺĖĩőŉĤŅĭħīŗńłĬœĦŝŎŜňŊķĭœķŢļķŚŔĶĬŕŚņŁŞųŏīşœŸŀŉŴŃĻűźŴŲŚŏŵłŗƀŋ", (byte)34, 65);
               ZKM_STR_B[6] = NLoginCore_127.A("ĤĴĞùĠĲčĎěĂÿĞăĚĀŊŋĕňľıľĥŅĐĽČĿĨłłŖŚĴĿĪŊĻŋļġĭŠĥĺĲŠśŌŞŜŠŦĮŋŜĮĳĴĭťŭŵūŚŮŴĺőŶŋśšƆŰŋ", (byte)34, 65);
               ZKM_STR_B[7] = NLoginCore_004.D("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅ҊҦғ҆ҧѿѾҞҧѫҨ", (byte)34, 68);
               ZKM_STR_B[8] = NLoginCore_004.F("ԍԴԲԥԛԜԕԔԯԗԽԦ", (byte)34, 70);
               ZKM_STR_B[9] = NLoginCore_183.C("҇ѲѬҔѵѷҐ҃҉ѓѝҙҘҜўҟѲҒѮҁҩҡѼҝ҅ѿ҃үҜҚ҄ҫѾҵҦҴҠҢҏ҅ҫҏҹҖҝғҼһҤѼҗҐҖҕҢҨҝҼҍҮӉҼҳӊҔӃӂӃӊӇҫӑӈҙҼҳҝҩҞӂңӒӘүҳұҮү", (byte)34, 67);
               ZKM_STR_B[10] = NLoginCore_183.F("ԍԣՙ՛ՎԽՇԳՇԶԷԭՖԛբԶ՟աԸԴԤՄԱԲ", (byte)34, 70);
               ZKM_STR_B[11] = NLoginCore_471.D("эѮґёёѣғҌѬѯґҞѶҌѢҞѹћѥҦѻҗѮѯ", (byte)34, 68);
               ZKM_STR_B[12] = NLoginCore_027.A("ĔđüğüĳĶÿłĞŇþŀĀīŌĝĨĮłŉŏĖė", (byte)34, 65);
               ZKM_STR_B[13] = NLoginCore_521.D("ьэѱҌҊыҏ҇ѴѰҟѧўѺқѺќҒҗқ҅҄ѦҕѬѺҠҧҋҐ҂ҲҕҬҭҊҐҁ҇ҫҕҝҰҾҴѸѻҀҮҢҿҺ҆ґҎҏ", (byte)34, 68);
               ZKM_STR_B[14] = NLoginCore_223.D("ъѠҖҘҋѺ҄Ѱ҄ѳѳќҔѿѳѸѠѤҠҧѨҁѮѯ", (byte)34, 68);
               ZKM_STR_B[15] = NLoginCore_575.F("ԍԔԘՐԖԘԹԭՖՠ՜ԺԼՁՄԤԵՒՁԾԤՉՁգՁիՠՆՐՈնն", (byte)34, 70);
               ZKM_STR_B[16] = NLoginCore_091.D("ҒѶџѸіѲҊҚҜљѳҌҡѯҋҤѶѲқѱңѱѮѯ", (byte)34, 68);
               ZKM_STR_B[17] = NLoginCore_241.A("ôõęĴĲóķįĜĘŇďĆĢŃĢĄĺĿŃĭĹőŌŕğōŖėŉĪīŊŔĐśœıŌĹĮĜŎĦŉŦŀŔŁķŗŘťůĶķ", (byte)34, 65);
               ZKM_STR_B[18] = NLoginCore_471.D("ѼҌѶёѸҊѥѦѳњїѶћѲјҢңѭҠҖ҉ҖѽҝѨҕѤҗҀҚҚҮҲҌҗ҂ҢғңҔѹ҅ҸҼҬҮѸӂӄҵҝҤҟҧҞӋӌҵҡӃҿ҉ҩҴҾӍґӆҭӋӂҴҗӚҺң", (byte)34, 68);
               ZKM_STR_B[19] = NLoginCore_553.A("òĈľŀĳĢĬĘĬěěĂĀđĞćĚąŏĆĊŏĖė", (byte)34, 65);
               ZKM_STR_B[20] = NLoginCore_433.A("õĖĹùùċĻĴĔėĸľıĦěāŀńĦīĢŏĖė", (byte)34, 65);
               ZKM_STR_B[21] = NLoginCore_553.A("ĲĔöĵŁıĕùĻįħĸęĒĤŊĬŇĚĩĉĿĖė", (byte)34, 65);
               ZKM_STR_B[22] = NLoginCore_201.B("ôõęĴĲóķįĜĘŇďĆĢŃĢĄĺĿŃĭĬĎĽĔĢňŏĳĸĪŚĶēķőŔĝĞĻĭŢŝŕŜŞĥĺĻľĸůŧůĶķ", (byte)34, 66);
               ZKM_STR_B[23] = NLoginCore_138.B("òĈľŀĳĢĬĘĬěěÿąėĴĕĚħĪōĩęĖė", (byte)34, 66);
               ZKM_STR_B[24] = NLoginCore_241.A("òùýĵûýĞĒĻŅłĆğĜňĬĘćŊĬĉĩĖė", (byte)34, 65);
               ZKM_STR_B[25] = NLoginCore_530.D("Ғҁѷ҇Ѭяѻҙѹѕѝѣ", (byte)34, 68);
               ZKM_STR_B[26] = NLoginCore_201.A("ôõęĴĲóķįĜĘŇďĆĢŃĢĄĺĿŃĭĹőŌŕğōŖėŉĪīēŉĔĮĖĿĪŞĶĵŖŃŅŨĥšľŪĬŧŜŉĶķ", (byte)34, 65);
               ZKM_STR_B[27] = NLoginCore_092.A("òĈľŀĳĢĬĘĬěĝĲģĪĚćĠĵĹńġŃĈįĞĞňŎģĲřŋōħĝĲĸĠľıĠŀĽŘĲŢŠŦŠĽŏĪŪŉĶķ", (byte)34, 65);
               ZKM_STR_B[28] = NLoginCore_559.B("đĺĻùĵĐłĭłđńċ", (byte)34, 66);
               ZKM_STR_B[29] = NLoginCore_092.F("ԷՖՔԴԪԸԱԝԑ՚Ԙ\u0557Ԭ՛ԱՃԢՆԦԥԼԿՌԬ\u0558իԼբԾԭծԵաՋԵՎկ՚էՑՉՑջՊԼյՒԽՆօ\u0557ՙՉեՈ\u058bծ֎ր՝հՒ֑Ֆ", (byte)34, 70);
               ZKM_STR_B[30] = NLoginCore_004.B("īēİĐđĚĞĒŃėľĴþļĩŋĝğċĨĆĮŇŃœĶĲņĹĵńŘŊĩěŒĩĬĭŞŚİĳňŠĸŜŧĺŚĨĻĩŲįıůšşŲŌŌťŦ", (byte)34, 66);
               ZKM_STR_B[31] = NLoginCore_141.B(
                  "ıĚĩĐĹĠĹįĂĞĮļŁľĶĳĨčĆňŋĥľŔċĤĖĳŏĒŌňŝĺŚňňŋķĳŒťŧĦŞľţŦľŜŇŨŢŁıŇşŒűŸţīĸŚŨżĴŜůŘĴĻŽŤŻŵŰžŹƆŕŉŬŰƍŉƊŉƊŰŢŉŷŐƒƛƊźžƏŰųŵƢƝŴŲŶƆƗƠŹƦźŸƠƠŹŶŷ", (byte)34, 66
               );
               ZKM_STR_B[32] = NLoginCore_223.E(
                  "ԫՏ\u0558Ԯ՜ԬԝԗԼ՚ՕՀՀԖԣաԲՈՂ\u0558՞աԿՎ՟ՉխԼխԯ\u0530ՆմեհնՔՍՉՌոպ՛փՒվմօՃՒ՞ԼՅ՝ՠևվ\u0590֒ՄՅ֔֏֗զՓքկ֏նՕ֙ո֏աճ֏՝֦քփև֊֒ս֪ւ\u058c֢֗֘֝ջտֲֳ֮֡ց֗֎֙ս֓ս֭րֆ",
                  (byte)34,
                  69
               );
               ZKM_STR_B[33] = NLoginCore_232.F(
                  "ԣՉՈՆԣԕ՛ԬՓԪԜգԟԶԳՁՃԥՒթ՟ԷեՖ՚ԬգխաճԽաէՋխԶՑ՜ՒծԱՐջւԻՏնէզ։ճֆըեՖբէօվւտկ֔յգ֒մշօքեռ֖ձ՞֖սձ֑զ֥ա֦֨֝ֈ֜ֆ֦֨֯ղփ֥֧֦֒ծւ֭֒ռմֈֲׂ֨ւֵ֒֠փֵׁ־֤֑֜֡֒", (byte)34, 70
               );
               ZKM_STR_B[34] = NLoginCore_553.C("ҐџғѱѨҘѬєҘѥѮќҡѪџҖғѾѶѤңҒѠҔѸѩҥѦҁѬѮҞѮҩҊҤѲҔҩҺҰ҈ҾҨҏҽғ҂қҮӀҴҳҕҜӃӆҌҫҮӄңҾҼҳҨңҡӑӏҖҘӉҬӇӔҗӢӢҴӛӤӠһӇӈҨӨҫңӢӗӚӟӞӭ", (byte)34, 67);
               ZKM_STR_B[35] = NLoginCore_173.F(
                  "ՀԡԱԨԶՅՏՊ՞ԺԪԪՍԞՐՂ՚ԢբԽբԞԥՋԮծԺԤՇՏՐկԵադջ՜զՖՕթը՞ՙճաբՀֆ՛ԿրՁՠշշ\u0590ծզ՚մղձճյՓգ֍\u0558պ֖ֆ՛֘ւմ՛֜֎պ֧փսւ֕֟֝պ֎ցթդ֡ճ֊֪֫հւֺոִշְֱ֦֙ֆ", (byte)34, 70
               );
               ZKM_STR_B[36] = NLoginCore_232.B(
                  "ěôĜćčŁĐłĐĚįĢĨĖļĖĕĜĶāĺčņĻĭŇĨŐĘŔħŕēħĪīįķšŖşŅĢĳŇğĶķĹŋŖşĢĽśŀŮŭŌŲŌŲŰĸťŊſŏŠŔŌŁűŚŁņƀŲňƊňŬƊŚŏƐśťƊűƊƌŕƎŒŘŚŜƆŚƟơšƁŬŰŝū", (byte)34, 66
               );
               ZKM_STR_B[37] = NLoginCore_384.F(
                  "ՀԡԱԨԶՅՏՊ՞ԺԪԪՍԞՐՂ՚ԢբԽբԞԥՋԮծԺԤՇՏՐկԵադջ՜զՖՕթը՞ՙճաբՀֆ՛ԿրՁՠշշ\u0590ծզ՚մղձճյՓգ֍\u0558պ֖ֆ՛֘ւմ՛֜֎պ֧փսւ֕֨ջ֢֚֞֜իֆֱհ֕֍֎հֳ֎։ִֽշսռֆ", (byte)34, 70
               );
               ZKM_STR_B[38] = NLoginCore_110.E("ՈՒԣԢԯՆԬ՞\u0558ԲՓԜՏՌաբ՜էԾԨՓէԻ՚ՅԺգՌԮԳբՇդոէԳՋէԺԾէ\u0557ՀփՁ՝ւՃֆՈՑբ՞օ\u058cըփփՈ֒֎Տեֈ", (byte)34, 69);
               ZKM_STR_B[39] = NLoginCore_451.E(
                  "ԶԏԷԢԨ՜ԫ՝ԫԵՊԽՃԱ\u0557Ա\u0530ԷՑԜՕԨաՖՈբՃիԳկՂհԮՂՅՆՊՒռձպՠԽՎբԺՑՒՔզձպԽ\u0558ն՛։ֈէ֍է֍\u058bՓրե֚ժջկէ՜\u058cյ՞֑Օչ՝՜գՠտ֣բ֫գը֤֮ջ֡ցփ֩լ\u058cֳ֬ձջֆ֧֪֯֕֙ֆ",
                  (byte)34,
                  69
               );
               ZKM_STR_B[40] = NLoginCore_201.F("\u0558ԱԶՒԑԹՅԹԴԲ՛ԼՑԮ՛զՒՔՄԢՆզ՞ԺԭՆիհԫԮՑդիՁՉշկՇՐվչՉ՟ԽՃՐշՏՅվՙշ՝դՌւ\u0558դը\u0590կՠ֍կեցքՓ֕ծ֛պռ՟ձզ", (byte)34, 70);
               ZKM_STR_B[41] = NLoginCore_076.A("ĭĻĻĕĿĪüĭĽńĒċ", (byte)34, 65);
               ZKM_STR_B[42] = NLoginCore_575.C("ґѓѨҖѤѤқѪѴћҚѿђҗқғўѯҗѡѲҤѺѪ҈Җ҇ѽҪѯҌҁҫґҋҵ҂ғ҅ҊғҔҰ҃", (byte)34, 67);
               ZKM_STR_B[43] = NLoginCore_433.C("ѓѰџѬѐҐѬёі҆љѣ", (byte)34, 67);
               ZKM_STR_B[44] = NLoginCore_110.B("ĽēĐČĮėāĝĶÿļĕĀāāľČĢňāńďĥőčďŎĵŘŘŖŜ", (byte)34, 66);
               ZKM_STR_B[45] = NLoginCore_092.C("ҀҌҀѵіѧєћ҄Ҙ҆ҟҙҀѰғѽҘѺѴѾ҉ҖѣҩҚҁҎұҐѪѿ", (byte)34, 67);
               ZKM_STR_B[46] = NLoginCore_141.D("ґѓѨҖѤѤқѪѴћҚѿђҗқғўѯҗѡѲҤѺѪ҈Җ҇ѽҪѯҌҁ҅ҕҀҍҡҮҌѷҫҺҰ҃", (byte)34, 68);
               ZKM_STR_B[47] = NLoginCore_232.E("ԟ\u0530ԴՃԬՉ\u0557ՇԵԵԹԦ", (byte)34, 69);
               ZKM_STR_B[48] = NLoginCore_173.C("ҕѫѨѤ҆ѯљѵҎїҔѭјљљҖѤѺҠљҜҪҔҧҖѸҝѥѩұѼҳ", (byte)34, 67);
               ZKM_STR_B[49] = NLoginCore_397.B("ĨĴĨĝþďüăĬŀħĦĝłęńīĜĆŇŇĜĝňĦňŎŀĘřĳŋ", (byte)34, 66);
               ZKM_STR_B[50] = NLoginCore_451.D("҉҅җѠҋҙѓѱѭ҉Ҙѣ", (byte)34, 68);
               ZKM_STR_B[51] = NLoginCore_232.D("҃ѓҕєѥяѵғғғҜѣ", (byte)34, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.E("ՖՆՃԯԺԳՌԮԼԬԮԳԚ՝ՓԵ՟\u0530ՙՙէ\u0557իԫՍՄթ\u0530կԯդԴ", (byte)34, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_387.B("Đěļ÷ĉŀĻīĠľĿŅĄĔĽĿĿŃğĎĎďċňĵğňĳĲĸđœ", (byte)34, 66);
         }
      }
   }
}
