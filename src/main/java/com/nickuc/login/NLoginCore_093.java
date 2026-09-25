package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_093 extends NLoginCore_098 {
   private static int fb = Integer.reverse(-1);
   private static int cr = Integer.reverse(1342177280);
   private static long eo = Long.reverse(-5085607933408232490L);
   private static int en = Integer.reverse(-1);
   private static long cn = Long.reverse(823114777701858262L);
   private static int eu = Integer.reverse(1073741824);
   private static long cf = Long.reverse(-5620492334958379008L);
   private static int dn = 1920 >>> 167 | 1920 << -167;
   private static long ab = Long.reverse(-5085607933408232490L);
   private static int ex = Integer.reverse(1744830464);
   private static long cx = Long.reverse(-5620492334958379008L);
   private static int bu = 2 >>> 193 | 2 << ~193 + 1;
   private static long ee = Long.reverse(-5085607933408232490L);
   private static int er = 172032 >>> 77 | 172032 << ~77 + 1;
   private static long fx = Long.reverse(-5085607933408232490L);
   private static int da = Integer.reverse(805306368);
   private static long cw = Long.reverse(823114777701858262L);
   private static long gi = Long.reverse(823114777701858262L);
   private static int ec = (-1 >>> 238 | -1 << -238) & -1;
   private static long p = Long.reverse(-5085607933408232490L);
   private static long ds = Long.reverse(-5085607933408232490L);
   private static int bp = 1073741825 >>> 30 | 1073741825 << ~30 + 1;
   private static long ca = Long.reverse(-5620492334958379008L);
   private static long gb = Long.reverse(-5620492334958379008L);
   private static int bw = 96 >>> 100 | 96 << ~100 + 1;
   private static long ct = Long.reverse(823114777701858262L);
   private static long di = Long.reverse(-5085607933408232490L);
   private static long dm = Long.reverse(-5085607933408232490L);
   private static int cv = Integer.reverse(-805306368);
   private static long dy = Long.reverse(-5085607933408232490L);
   private static long fn = Long.reverse(-5085607933408232490L);
   private static int e = (0 >>> 121 | 0 << ~121 + 1) & -1;
   private static long cu = Long.reverse(-5620492334958379008L);
   private static long ga = Long.reverse(823114777701858262L);
   private static long fq = Long.reverse(-5085607933408232490L);
   private static long bm = Long.reverse(-5085607933408232490L);
   private static int gh = Integer.reverse(-134217728);
   private static int fv = 3584 >>> 7 | 3584 << -7;
   private static int dk = Integer.reverse(1879048192);
   private static int bn = Integer.reverse(0);
   private static int bd = (48 >>> 36 | 48 << -36) & -1;
   private static long bh = Long.reverse(-5085607933408232490L);
   private static int bf = Integer.reverse(-1);
   private static long gf = Long.reverse(-5620492334958379008L);
   private static int ek = 0 >>> 162 | 0 << ~162 + 1;
   private static long by = Long.reverse(823114777701858262L);
   private static long o;
   private static String[] ZKM_STR_B = new String[NLoginCore_093.gq];
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int gd = Integer.reverse(2013265920);
   private static int eq = (1048576 >>> 148 | 1048576 << -148) & -1;
   private static long br = Long.reverse(823114777701858262L);
   private static int dh = 3407872 >>> 82 | 3407872 << ~82 + 1;
   private static long gk = Long.reverse(-5620492334958379008L);
   private static int dq = (1 >>> 28 | 1 << -28) & -1;
   private static int fl = (536870915 >>> 189 | 536870915 << ~189 + 1) & -1;
   private static long ge = Long.reverse(823114777701858262L);
   private static long eb = Long.reverse(-5085607933408232490L);
   private static long cd = Long.reverse(823114777701858262L);
   private static int cb = '耀' >>> 238 | 32768 << -238;
   private static int cy = (0 >>> 228 | 0 << -228) & -1;
   private static int z = Integer.reverse(-1);
   private static int cm = (18874368 >>> 53 | 18874368 << -53) & -1;
   private static long ft = Long.reverse(-5085607933408232490L);
   private static int fh = Integer.reverse(0);
   private static int cc = Integer.reverse(-536870912);
   private static int al = (8388608 >>> 182 | 8388608 << ~182 + 1) & -1;
   private static int fa = 94208 >>> 44 | 94208 << -44;
   private static int ey = (-1 >>> 74 | -1 << ~74 + 1) & -1;
   private static int dz = Integer.reverse(1207959552);
   private static int bi = -1 >>> 37 | -1 << ~37 + 1;
   private static int dr = Integer.reverse(-1);
   private static int gg = Integer.reverse(0);
   private static int fe = Integer.reverse(-1);
   private static long dc = Long.reverse(823114777701858262L);
   private static long cp = Long.reverse(-5620492334958379008L);
   private static int em = 335544320 >>> 24 | 335544320 << ~24 + 1;
   private static int bl = Integer.reverse(-1);
   private static long fc = Long.reverse(-5085607933408232490L);
   private static int du = (536870914 >>> 253 | 536870914 << ~253 + 1) & -1;
   private static long df = Long.reverse(-5620492334958379008L);
   private static int gq = Integer.reverse(67108864);
   private static int cg = 12582912 >>> 86 | 12582912 << -86;
   private static int gc = (-1 >>> 14 | -1 << -14) & -1;
   private static long at = Long.reverse(-5085607933408232490L);
   private static int bj = (131072 >>> 143 | 131072 << ~143 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_093.gn];
   private static long es = Long.reverse(-5085607933408232490L);
   private static int gn = (128 >>> 2 | 128 << ~2 + 1) & -1;
   private static int fp = Integer.reverse(1476395008);
   private static int fw = (-1 >>> 24 | -1 << -24) & -1;
   private static long dp = Long.reverse(-5085607933408232490L);
   private static long bs = Long.reverse(-5620492334958379008L);
   private static long ci = Long.reverse(-5085607933408232490L);
   private static int dw = Integer.reverse(-1);
   private static long ff = Long.reverse(-5085607933408232490L);
   private static int fd = Integer.reverse(402653184);
   private static int m = -1 >>> 95 | -1 << -95;
   private static int cj = (33554432 >>> 151 | 33554432 << -151) & -1;
   private static int dt = Integer.reverse(-65536);
   private static int fz = 3801088 >>> 209 | 3801088 << ~209 + 1;
   private static int ed = 19456 >>> 10 | 19456 << ~10 + 1;
   private static int ch = Integer.reverse(268435456);
   private static long ez = Long.reverse(-5085607933408232490L);
   private static int fr = (54 >>> 1 | 54 << -1) & -1;
   private static int gm = (134217728 >>> 187 | 134217728 << -187) & -1;

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al, at), a(bd & bf, bh)).toUpperCase(Locale.ENGLISH);
      int var4 = bi;
      switch (var2.hashCode()) {
         case -1841605620:
            if (var2.equals(a(bp, br ^ bs))) {
               var4 = bu;
            }
            break;
         case -1620389036:
            if (var2.equals(a(ch, ci))) {
               var4 = cj;
            }
            break;
         case 73844866:
            if (var2.equals(a(bw, by ^ ca))) {
               var4 = cb;
            }
            break;
         case 997105585:
            if (var2.equals(a(bj & bl, bm))) {
               var4 = bn;
            }
            break;
         case 1557169620:
            if (var2.equals(a(cc, cd ^ cf))) {
               var4 = cg;
            }
      }

      switch (var4) {
         case 0:
            throw new UnsupportedOperationException(a(cm, cn ^ cp));
         case 1:
            this.d = NLoginCore_586.a(this.m, new File(var1.d().getParentFile(), a(cr, ct ^ cu)), new Properties());
            return;
         case 2:
         case 3:
         case 4:
            boolean var5 = var1.a(a(cv, cw ^ cx), (cy != 0));
            String var6 = var1.b(a(da, dc ^ df));
            String var7 = var1.b(a(dh, di));
            String var8 = var1.b(a(dk, dm));
            String var9 = var1.b(a(dn, dp));
            int var10 = var1.a((String)a(dq & dr, ds));
            if (var10 > 0 && var10 < dt) {
               var6 = var6 + a(du & dw, dy) + var10;
            }

            Properties var11 = new Properties();
            var11.setProperty(a(dz, eb), Boolean.toString(var5));
            int var13 = ec;
            switch (var2.hashCode()) {
               case -1620389036:
                  if (var2.equals(a(er, es))) {
                     var13 = eu;
                  }
                  break;
               case 73844866:
                  if (var2.equals(a(ed, ee))) {
                     var13 = ek;
                  }
                  break;
               case 1557169620:
                  if (var2.equals(a(em & en, eo))) {
                     var13 = eq;
                  }
            }

            switch (var13) {
               case 0:
                  this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var6, var9, var7, var8, var11, NLoginCore_036.d.i()));
                  return;
               case 1:
                  this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var6, var9, var7, var8, var11, NLoginCore_036.c.i()));
                  return;
               case 2:
                  this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var6, var9, var7, var8, var11, NLoginCore_036.e.i()));
                  return;
               default:
                  return;
            }
         default:
            throw new IllegalArgumentException(a(ex & ey, ez) + var2);
      }
   }

   @Override
   protected NLoginCore_171 a(NLoginCore_459 var1) {
      return var1.a(a(fa & fb, fc) + this.P + a(fd & fe, ff));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_093.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.F("Ի՝՟Կգւպ\u0590ռՋ։տ֍ևՐյ֖֗֎֔֎գ", (byte)87, 70), NLoginCore_093.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.C("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹ\u0891ࡧࢅࢂࢌࢊࢎࢇࢌ࢙ࡩࡹࡷࢀԓ", (byte)87, 67) + var1 + NLoginCore_091.F("Ս", (byte)87, 70) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 77L;
      var1 ^= -2249534634030986947L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     (byte)(21 + 48),
                     (byte)(27 + 56),
                     (byte)(25 + 22),
                     (byte)(51 + 16),
                     (byte)(40 + 26),
                     (byte)(59 + 8),
                     47,
                     80,
                     (byte)(41 + 34),
                     (byte)(37 + 30),
                     (byte)(20 + 63),
                     (byte)(47 + 6),
                     (byte)(61 + 19),
                     (byte)(91 + 6),
                     (byte)(84 + 16),
                     (byte)(46 + 54),
                     (byte)(103 + 2),
                     (byte)(70 + 40),
                     (byte)(57 + 46)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖ\u082eࠄࠢࠟࠩࠧࠫࠤࠩ࠶ࠆࠖࠔࠝ", (byte)54, 68));
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

   public NLoginCore_093(NLoginType_008 var1) {
      super(var1, NLoginCore_479.q, a(e & m, p), a(y & z, ab));
   }

   static {
      b();
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(fl, fn));
      String var2 = var1.getString(a(fp, fq));
      String var3 = var1.getString(a(fr, ft));
      UUID var4 = NLoginCore_432.c(var1.getString(a(fv & fw, fx)));
      UUID var5 = NLoginCore_432.c(var1.getString(a(fz, ga ^ gb)));
      int var7 = gc;
      switch (var3.hashCode()) {
         case 1938817085:
            if (var3.equals(a(gh, gi ^ gk))) {
               var7 = gm;
            }
            break;
         case 1953930828:
            if (var3.equals(a(gd, ge ^ gf))) {
               var7 = gg;
            }
      }

      switch (var7) {
         case 0:
         case 1:
            if (var5 != null) {
               this.a(this.r, var2, null, var4, var5);
            } else {
               this.a(this.r, var2, null, var4);
            }

            return;
         default:
            this.e(this.r, var2, var3);
      }
   }

   private static void b() {
      o = 7772318499322607312L;
      long var0 = o ^ -2249534634030986947L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(67 + 2),
               (byte)(79 + 4),
               (byte)(36 + 11),
               (byte)(65 + 2),
               (byte)(42 + 24),
               (byte)(35 + 32),
               (byte)(26 + 21),
               (byte)(64 + 16),
               (byte)(6 + 69),
               (byte)(25 + 42),
               (byte)(52 + 31),
               (byte)(23 + 30),
               (byte)(35 + 45),
               (byte)(44 + 53),
               100,
               100,
               (byte)(47 + 58),
               (byte)(45 + 65),
               (byte)(57 + 46)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.C("҈ѼҮҏѻѻѾҞҘѾҏҥҳҒѿҽ҂ҕӋ҅ҋӎҕҖ", (byte)47, 67);
               ZKM_STR_B[1] = NLoginCore_027.D("ѺҴҼҍѼҘӀҖѾҗҺҕѽҝҁҷҕңӅҘӀҨҕҖ", (byte)47, 68);
               ZKM_STR_B[2] = NLoginCore_076.F("ՙգՔԱ՜ՔէաԬ՝՛հթԱՍգԴձլզզՁի\u0557Ցն՛կՏՀցՐղբ՟ռոօ՜ճքխՉՓ", (byte)47, 70);
               ZKM_STR_B[3] = NLoginCore_433.C("ҮѺҩҷҠҽҐҀҺӃҳҊ", (byte)47, 67);
               ZKM_STR_B[4] = NLoginCore_521.D("ҮѺҩҷҠҽҐҀҺӃҳҊ", (byte)47, 68);
               ZKM_STR_B[5] = NLoginCore_076.E("ԽԜգԿ՝՛դե՟ՍՆԳ", (byte)47, 69);
               ZKM_STR_B[6] = NLoginCore_451.E("ԵՔբԣՆՂԿդԩխ՜Գ", (byte)47, 69);
               ZKM_STR_B[7] = NLoginCore_183.A("ġĉĭŎłŕŐŎŜŔĨĥ", (byte)47, 65);
               ZKM_STR_B[8] = NLoginCore_232.C("ҋҽҌҽҺѾҰңӁӃҟҤ҅ѾҀӉӌҸқҩӀҨҕҖ", (byte)47, 67);
               ZKM_STR_B[9] = NLoginCore_110.A(
                  "ĵĨŉĖŒńňĺşŝĬĳļĸİğıļĻŔŕĩŊŪńŞņİĻťĭţŕņņŲŖśŭĳžųőƂƂŵŲŹƅœűŒƅƈŕōŸŻƂŏƈƎŋƖŰŕŐťƒŴŷƍƚŗűƑƖƋŻźƘƔƜƤŽƅƉŷŨƩŬŽƞƓŴƄƶƆƀűźƕƘƧŻƚƚƖŹƘƹƤǀƆƶǊƅƕƗǂƗƍǅƃƑƋƐƝ",
                  (byte)47,
                  65
               );
               ZKM_STR_B[10] = NLoginCore_183.B("ĒŋēēŏİēĚĕĚĴıŏĠŚŁńłŚħķũİı", (byte)47, 66);
               ZKM_STR_B[11] = NLoginCore_530.C("ҰҺҫ҈ҳҫҾҸ҃ҴұґѾҳҢҠҞҼҌҥӄҥӒӑ҅ҍҪҾҕҪҴҰ", (byte)47, 67);
               ZKM_STR_B[12] = NLoginCore_553.D("ҰҺҫ҈ҳҫҾҸ҃Ҵүү҇ҷӁӆҷҧ҇ҘҹӇҊӅҰҬҥҖӓӋӉӈ", (byte)47, 68);
               ZKM_STR_B[13] = NLoginCore_127.F("ՙգՔԱ՜ՔէաԬ՝\u0558ԷՀ՞՞ՔՈԯՆՎՁՉ՚թՆՆԸի՟տ՞ն", (byte)47, 70);
               ZKM_STR_B[14] = NLoginCore_521.A("ŋŕņģŎņřœĞŏŊőŋśĮŘġŚťŊŕģĶŦūĪŧŅŠŭŇĳ", (byte)47, 65);
               ZKM_STR_B[15] = NLoginCore_127.F("ՙգՔԱ՜ՔէաԬ՝՚ազԽճհիՆծԿդ\u0530ՒըմպղՔառՀՖ", (byte)47, 70);
               ZKM_STR_B[16] = NLoginCore_559.B("ŋŕņģŎņřœĞŏŊőŋśĮŘġŚťŊŕĤŧūŦŉĩĮŢňĭĴ", (byte)47, 66);
               ZKM_STR_B[17] = NLoginCore_553.D("ѱҪѶұҗҚҠӃҘҾҳҊ", (byte)47, 68);
               ZKM_STR_B[18] = NLoginCore_446.C("ҏҔҸҐѶҷұѼҢ҂ҍҊ", (byte)47, 67);
               ZKM_STR_B[19] = NLoginCore_530.D("ҌҫҹѺҝҙҖһҀӄҳҊ", (byte)47, 68);
               ZKM_STR_B[20] = NLoginCore_559.F("ԯԗԻ՜Րգ՞՜ժբԶԳ", (byte)47, 70);
               ZKM_STR_B[21] = NLoginCore_092.B("ĦŘħŘŕęŋľŜŞĺĿĠęěŤŧœĶńśŃİı", (byte)47, 66);
               ZKM_STR_B[22] = NLoginCore_384.A("ĩĉĲĔőśĻįőŏœŁŚŘľŀřĤŇĽĴŨķŖĨīŁįũţŅŲŇűœŎŊĻŤŝųŖŲŅ", (byte)47, 65);
               ZKM_STR_B[23] = NLoginCore_027.B("ķķŀŔģħŖňĬŠĞĠęłĤņŃĳİĿŀŬĵŜŖŌŠŎŋĳŪŇŏőōŕũńŐŕŸŗŗŸŜŶƁľůņřƃƂłŋŬňūźŪƉƂŏƖŢŎŶŵźƃƛƆŷşƌƀƘƐƁƂžƨšƊźƘũƮƤƘƭŬƤŮƵƐ", (byte)47, 66);
               ZKM_STR_B[24] = NLoginCore_446.B("ŃĳĮęśĨŉŞřŏōŔŗŘŃįŠģİŖŪŜŤţşŏŊŅŌİĬŏĬōůłĺůŮŦŧľŝľŗŢŻŽŽŘŃřžŵŻžńŠŢƆŋƐŋƃŶūŬƊŨŶźŜƘƋƀť", (byte)47, 66);
               ZKM_STR_B[25] = NLoginCore_397.B("ĭŊŃŚŋřĚŋěōĹęšİŒĸŤœŤřŖũİı", (byte)47, 66);
               ZKM_STR_B[26] = NLoginCore_092.B("ĲŒŒŕđřĜŇĚōĘľĘġŤńĵŔşħŕŃİı", (byte)47, 66);
               ZKM_STR_B[27] = NLoginCore_433.A("ġĩďĶŖńęņįįŒĥ", (byte)47, 65);
               ZKM_STR_B[28] = NLoginCore_530.B("ŏĵŇĵĭīŕĖĘğŀĥ", (byte)47, 66);
               ZKM_STR_B[29] = NLoginCore_521.C("Ґ҄ҳѹҩҴѼҀҁҖұҔҽҠ҄҉һҡҋҀҹӎҕҖ", (byte)47, 67);
               ZKM_STR_B[30] = NLoginCore_076.F("ԯԷ՚ՂՄ՜ԣԫՇՍՊԳ", (byte)47, 70);
               ZKM_STR_B[31] = NLoginCore_530.C("ҎҴҕѵҗҮґҿҾѿ҄Ҋ", (byte)47, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.C("҈ѼҮҏѻѻѾҞҘѾҐҞѾқҩ҂҇ӉӂҨҙҨҕҖ", (byte)47, 67);
               ZKM_STR_B[1] = NLoginCore_553.D("ѺҴҼҍѼҘӀҖѾҗҹҲҔқҽҊӌҠҺҺҷҤҊ҉үҬҎҵҔғӎҩ", (byte)47, 68);
               ZKM_STR_B[2] = NLoginCore_427.F("ՙգՔԱ՜ՔէաԬ՝՛հթԱՍգԴձլզզՁի\u0557Ցն՛կՏՀցՐգ\u0557ծըըՓՇժն՟ոՓ", (byte)47, 70);
               ZKM_STR_B[3] = NLoginCore_183.A("ŔłňŔŇįīŋŕĕŗľĭőľŚŀňŔĸŇŃİı", (byte)47, 65);
               ZKM_STR_B[4] = NLoginCore_397.F("Բԯ՛էԵԾՀՋՃՉԻԸգՂեդՕէԾՎՎՁԾԿ", (byte)47, 70);
               ZKM_STR_B[5] = NLoginCore_446.F("ԤՑԷՏԟՙԲ՛թԸԼ՝ՇՉԪծԽձՑգՇՁԾԿ", (byte)47, 70);
               ZKM_STR_B[6] = NLoginCore_223.A("ĶŋŐķČĔĮĥķşĲŌĵğĲėŇşťķŗũİı", (byte)47, 65);
               ZKM_STR_B[7] = NLoginCore_223.C("҆ҴҊғґҝҙҞҢҏҹҠѹҼҜҼҔѾҘҞҗҘҕҖ", (byte)47, 67);
               ZKM_STR_B[8] = NLoginCore_173.A("ĦŘħŘŕęŋľŜŞĺŠęŋĮĠŔŤĨĥņřİı", (byte)47, 65);
               ZKM_STR_B[9] = NLoginCore_427.B(
                  "ĵĨŉĖŒńňĺşŝĬĳļĸİğıļĻŔŕĩŊŪńŞņİĻťĭţŕņņŲŖśŭĳžųőƂƂŵŲŹƅœűŒƅƈŕōŸŻƂŏƈƎŋƖŰŕŐťƒŴŷƍƚŗűƑƖƋŻźƘƔƜƤŽƅƉŷŨƩŬŽƞƓŴƄƶƆƀűźƕƘƧŻƚƚƖŹƘƹƤǀƆƶǊƅƕƠǆƷƫƏƿƪǎƝƥ",
                  (byte)47,
                  66
               );
               ZKM_STR_B[10] = NLoginCore_451.C("ѷҰѸѸҴҕѸѿѺѿҜҔҷҽҺҩҤҶңҟҥҘҕҖ", (byte)47, 67);
               ZKM_STR_B[11] = NLoginCore_183.D("ҰҺҫ҈ҳҫҾҸ҃ҴұґѾҳҢҠҞҼҌҥӄҥҡӀҨӁӅҰӔәҭұ", (byte)47, 68);
               ZKM_STR_B[12] = NLoginCore_092.E("ՙգՔԱ՜ՔէաԬ՝\u0558\u0558\u0530ՠժկՠՐ\u0530Ձբխ\u0557ՐզսէռտՑնԼՐճՔտ՛ե՝իժպ՚Փ", (byte)47, 69);
               ZKM_STR_B[13] = NLoginCore_433.E("ՙգՔԱ՜ՔէաԬ՝\u0558ԷՀ՞՞ՔՈԯՆՎՁՎե\u0558ԷՐՋ՟խՕ՚ՂՍխՅ\u0558վփֆրվնՅՓ", (byte)47, 69);
               ZKM_STR_B[14] = NLoginCore_091.C("ҰҺҫ҈ҳҫҾҸ҃ҴүҶҰӀғҽ҆ҿӊүҺҐҠқӉҌҟұӖӔҪұӍӆӘҔҶҖӗҿүһӗҪ", (byte)47, 67);
               ZKM_STR_B[15] = NLoginCore_446.A("ŋŕņģŎņřœĞŏŌœŘįťŢŝĸŠıŖĝłŅŝĹŞļŰĮŐŪ", (byte)47, 65);
               ZKM_STR_B[16] = NLoginCore_471.C("ҰҺҫ҈ҳҫҾҸ҃ҴүҶҰӀғҽ҆ҿӊүҺӎҢҜӉӁҢҕӌҔӒҦ", (byte)47, 67);
               ZKM_STR_B[17] = NLoginCore_091.B("ĿĶĔīńŅīĥĳĹŚĥ", (byte)47, 66);
               ZKM_STR_B[18] = NLoginCore_397.A("ĨŀĮĺĴķŒĜŌśŌşıŖĚĴĺĴĵşĽŃİı", (byte)47, 65);
               ZKM_STR_B[19] = NLoginCore_004.F("ԷՒ՜\u0530ՙԼՁՆԞՆԾԳ", (byte)47, 70);
               ZKM_STR_B[20] = NLoginCore_173.B("ņĿŏŇįĘńĻŔĘĽįěĮŗōģņŕĻŚũİı", (byte)47, 66);
               ZKM_STR_B[21] = NLoginCore_183.B("ĦŘħŘŕęŋľŜŞĻĶĳĳŞğŇŁŚńŃřİı", (byte)47, 66);
               ZKM_STR_B[22] = NLoginCore_530.D("ҎѮҗѹҶӀҠҔҶҴҸҦҿҽңҥҾ҉ҬҢҙӍҜһҍҐҦҔӎӈҪӗҬҲӔӏҸӌҿӜӜӏұҪ", (byte)47, 68);
               ZKM_STR_B[23] = NLoginCore_223.C(
                  "ҜҜҥҹ҈ҌһҭґӅ҃҅Ѿҧ҉ҫҨҘҕҤҥӑҚӁһұӅҳҰҘӏҬҴҶҲҺӎҩҵҺӝҼҼӝӁӛӦңӔҫҾӨӧҧҰӑҭӐӟӏӮӧҴӻӇҳӛӚӟӨԀӫӜӄӱӥӽӵӦӧӣԍӆӯӟӰӲԀԂӜԊӱӫӫӺӪӔԈӫԗӗԜԛԊԖӹԓӪ", (byte)47, 67
               );
               ZKM_STR_B[24] = NLoginCore_446.B("ŃĳĮęśĨŉŞřŏōŔŗŘŃįŠģİŖŪŜŤţşŏŊŅŌİĬŏĬōůłĺůŮŦŧľŝľŗŢŻŽŽŘŃřžŵŻžńŠŢƆŋƐŋƃƁƔŸŸűźƈůŝŝŪƌƛƓŹƏŝŹƂŢƟƙŰű", (byte)47, 66);
               ZKM_STR_B[25] = NLoginCore_127.D("ҒүҨҿҰҾѿҰҀҲҠѿҸҧӉ҃Ҡ҆һҷӍҘҕҖ", (byte)47, 68);
               ZKM_STR_B[26] = NLoginCore_427.F("ՀՠՠգԟէԪՕԨ՛ԦհէԧՁ՟զԾըՋ\u0530ճձ\u0557պՅղ\u0557ՌՑ՞Լ", (byte)47, 70);
               ZKM_STR_B[27] = NLoginCore_241.C("җҒҮѻҬҠҕҴҹүҍҊ", (byte)47, 67);
               ZKM_STR_B[28] = NLoginCore_387.F("ՒՓԘբԾՂԾՃԺԤՁԼԪլԨԽՂիլ\u0530թէԾԿ", (byte)47, 70);
               ZKM_STR_B[29] = NLoginCore_453.E("Թԭ՜ԢՒ՝ԥԩԪԿ՛ԧթԫԬՑՏլզՑՂՁԾԿ", (byte)47, 69);
               ZKM_STR_B[30] = NLoginCore_553.F("Ԣ\u0557՟ԺՁ՚ՄգԿԵՎԿԸհՎգեՎՇՓՠշԾԿ", (byte)47, 70);
               ZKM_STR_B[31] = NLoginCore_138.D("ѺѼҰҬѶғҸҫѹүҚҼ҄ҾҨҕҙҬ҈Ҏ҆ҾҕҖ", (byte)47, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.A("ĠŗņđĨŜĩĺĞĸŚĥ", (byte)47, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.E("ԵԺԝԠէԟՃ՜ե՝՞ՎդԺլԪԾՐղՅխշմՃՍյոՍչՌգռ", (byte)47, 69);
         }
      }
   }
}
