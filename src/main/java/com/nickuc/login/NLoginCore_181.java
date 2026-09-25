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

public class NLoginCore_181 extends NLoginCore_098 {
   private static int fz = Integer.reverse(Integer.MIN_VALUE);
   private static long eo = Long.reverse(716057597160989091L);
   private static long ee = Long.reverse(7493989779944505344L);
   private static int al = (67108864 >>> 153 | 67108864 << ~153 + 1) & -1;
   private static int bd = Integer.reverse(-1073741824);
   private static long gk = Long.reverse(7493989779944505344L);
   private static int gv = (939524096 >>> 185 | 939524096 << -185) & -1;
   private static int e = Integer.reverse(0);
   private static long el = Long.reverse(7057125872498647459L);
   private static long eb = Long.reverse(716057597160989091L);
   private static int cs = (0 >>> 178 | 0 << ~178 + 1) & -1;
   private static long by = Long.reverse(7057125872498647459L);
   private static long ff = Long.reverse(7057125872498647459L);
   private static long ac = Long.reverse(7493989779944505344L);
   private static int gh = 6553600 >>> 146 | 6553600 << ~146 + 1;
   private static long hb = Long.reverse(7493989779944505344L);
   private static long ge = Long.reverse(716057597160989091L);
   private static int hg = Integer.reverse(2013265920);
   private static String[] ZKM_STR_A = new String[NLoginCore_181.hk];
   private static long gr = Long.reverse(716057597160989091L);
   private static long dc = Long.reverse(7493989779944505344L);
   private static int ex = ('耀' >>> '/' | 32768 << -47) & -1;
   private static int fm = -1 >>> 61 | -1 << -61;
   private static long ab = Long.reverse(716057597160989091L);
   private static long gu = Long.reverse(7493989779944505344L);
   private static int gy = Integer.reverse(-1207959552);
   private static int hm = Integer.reverse(-134217728);
   private static int dh = Integer.reverse(Integer.MIN_VALUE);
   private static int cj = (8388608 >>> 22 | 8388608 << -22) & -1;
   private static String[] ZKM_STR_B = new String[hm];
   private static int eq = (9961472 >>> 179 | 9961472 << -179) & -1;
   private static int ce = (2621440 >>> 242 | 2621440 << ~242 + 1) & -1;
   private static long gi = Long.reverse(716057597160989091L);
   private static int fl = Integer.reverse(Integer.MIN_VALUE);
   private static long gx = Long.reverse(7057125872498647459L);
   private static int co = '뀀' >>> 236 | 45056 << ~236 + 1;
   private static long ft = Long.reverse(7493989779944505344L);
   private static long bm = Long.reverse(7493989779944505344L);
   private static int gm = 26 >>> 64 | 26 << -64;
   private static int bi = 433324032 >>> 209 | 433324032 << ~209 + 1;
   private static int ey = (0 >>> 228 | 0 << ~228 + 1) & -1;
   private static long ca = Long.reverse(7057125872498647459L);
   private static int eu = 16 >>> 196 | 16 << -196;
   private static int fh = (786432 >>> 178 | 786432 << -178) & -1;
   private static int bf = Integer.reverse(536870912);
   private static int fd = 42 >>> 33 | 42 << -33;
   private static int cm = 0 >>> 202 | 0 << ~202 + 1;
   private static int hk = (-2147483633 >>> 95 | -2147483633 << -95) & -1;
   private static int cy = Integer.reverse(805306368);
   private static int em = Integer.reverse(1207959552);
   private static long gp = Long.reverse(7493989779944505344L);
   private static int bu = (-536870912 >>> 189 | -536870912 << -189) & -1;
   private static int y = 2 >>> 129 | 2 << ~129 + 1;
   private static int bw = Integer.reverse(-1);
   private static long cd = Long.reverse(7057125872498647459L);
   private static long cp = Long.reverse(716057597160989091L);
   private static long at = Long.reverse(7057125872498647459L);
   private static int bn = (201326592 >>> 249 | 201326592 << ~249 + 1) & -1;
   private static long bk = Long.reverse(716057597160989091L);
   private static long cf = Long.reverse(716057597160989091L);
   private static int bj = Integer.reverse(-1610612736);
   private static long ha = Long.reverse(716057597160989091L);
   private static long ds = Long.reverse(7057125872498647459L);
   private static long hi = Long.reverse(7057125872498647459L);
   private static long dm = Long.reverse(716057597160989091L);
   private static long et = Long.reverse(7493989779944505344L);
   private static int ao = Integer.reverse(-1);
   private static long fq = Long.reverse(716057597160989091L);
   private static long dv = Long.reverse(716057597160989091L);
   private static long o;
   private static long be = Long.reverse(7057125872498647459L);
   private static long go = Long.reverse(716057597160989091L);
   private static int gg = (Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << ~190 + 1) & -1;
   private static long bo = Long.reverse(716057597160989091L);
   private static long gf = Long.reverse(7493989779944505344L);
   private static int hj = (512 >>> 39 | 512 << ~39 + 1) & -1;
   private static int de = Integer.reverse(0);
   private static int dz = 1073741824 >>> 58 | 1073741824 << -58;
   private static long cq = Long.reverse(7493989779944505344L);
   private static long fc = Long.reverse(7057125872498647459L);
   private static long p = Long.reverse(716057597160989091L);
   private static long bh = Long.reverse(7057125872498647459L);
   private static int fv = (0 >>> 26 | 0 << ~26 + 1) & -1;
   private static long ep = Long.reverse(7493989779944505344L);
   private static int hh = -1 >>> 227 | -1 << ~227 + 1;
   private static long cz = Long.reverse(716057597160989091L);
   private static int fw = Integer.reverse(-402653184);
   private static int cr = Integer.reverse(1073741824);
   private static long br = Long.reverse(7493989779944505344L);
   private static long es = Long.reverse(716057597160989091L);
   private static long dy = Long.reverse(7493989779944505344L);
   private static int dd = Integer.reverse(1073741824);
   private static int dk = Integer.reverse(-1342177280);
   private static long q = Long.reverse(7493989779944505344L);
   private static int gw = Integer.reverse(-1);
   private static int dq = Integer.reverse(1879048192);
   private static long dp = Long.reverse(7493989779944505344L);
   private static int fp = Integer.reverse(1744830464);
   private static int ek = Integer.reverse(-2013265920);
   private static int fa = (41943040 >>> 149 | 41943040 << -149) & -1;
   private static int gq = Integer.reverse(-671088640);
   private static long fx = Long.reverse(7057125872498647459L);
   private static int cv = (67108864 >>> 122 | 67108864 << -122) & -1;
   private static int dt = Integer.reverse(-268435456);
   private static long ci = Long.reverse(7493989779944505344L);
   private static int cb = Integer.reverse(-1879048192);
   private static int bz = 1024 >>> 103 | 1024 << ~103 + 1;
   private static int gc = Integer.reverse(402653184);

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(dt, dv ^ dy));
      UUID var2 = NLoginCore_432.c(var1.getString(a(dz, eb ^ ee)));
      String var3 = var1.getString(a(ek, el));
      String var4 = var1.getString(a(em, eo ^ ep));
      int var5 = var1.getInt(a(eq, es ^ et)) == eu ? ex : ey;
      String var6 = null;
      if (var3 != null && !a(fa, fc).equals(var3)) {
         String[] var7 = var3.split(a(fd, ff));
         if (var7.length >= fh) {
            String var8 = var7[fl].toUpperCase(Locale.ENGLISH);
            int var10 = fm;
            switch (var8.hashCode()) {
               case 1615:
                  if (var8.equals(a(fp, fq ^ ft))) {
                     var10 = fv;
                  }
                  break;
               case 1639:
                  if (var8.equals(a(fw, fx))) {
                     var10 = fz;
                  }
                  break;
               case 82060:
                  if (var8.equals(a(gc, ge ^ gf))) {
                     var10 = gg;
                  }
            }

            switch (var10) {
               case 0:
               case 1:
               case 2:
                  var6 = var3;
                  break;
               default:
                  this.e(this.r, var6, var8);
            }
         } else {
            String var11 = var1.getString(a(gh, gi ^ gk));
            int var9 = var3.length();
            switch (var9) {
               case 64:
                  var6 = a(gm, go ^ gp) + var3 + a(gq, gr ^ gu) + var11;
                  break;
               case 128:
                  var6 = a(gv & gw, gx) + var3 + a(gy, ha ^ hb) + var11;
                  break;
               default:
                  this.e(this.r, var6, a(hg & hh, hi) + var9);
            }
         }
      }

      if (var5 != 0) {
         this.a(this.r, var6, var4, var2, var2 != null && var2.version() == hj ? var2 : null);
      } else if (var6 != null) {
         this.a(this.r, var6, var4, var2);
      }
   }

   public NLoginCore_181(NLoginType_008 var1) {
      super(var1, NLoginCore_479.o, a(e, p ^ q), a(y, ab ^ ac));
      if (new File(this.b(), a(al & ao, at)).exists()) {
         this.O = a(bd, be);
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_181.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.A("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 65), NLoginCore_181.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("ӃӐӏҒӒӎӉӒӝӌҙӗӛӔӗӝҟࠪࠨ࠶ࠥࠪ࠵࠺࠘ࠔࠚ\u082fࠟ\u082eࠡ࠱Һ", (byte)57, 67) + var1 + NLoginCore_027.D("Қ", (byte)57, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 22L;
      var1 ^= 5562851582114399192L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(52 + 17),
                     (byte)(47 + 36),
                     (byte)(45 + 2),
                     (byte)(6 + 61),
                     (byte)(14 + 52),
                     67,
                     (byte)(37 + 10),
                     80,
                     (byte)(56 + 19),
                     (byte)(54 + 13),
                     (byte)(76 + 7),
                     (byte)(48 + 5),
                     (byte)(29 + 51),
                     (byte)(64 + 33),
                     (byte)(88 + 12),
                     (byte)(97 + 3),
                     (byte)(22 + 83),
                     (byte)(62 + 48),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.A("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҥңұҠҥҰҵғҏҕҪҚҩҜҬ", (byte)46, 65));
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

   @Override
   protected void c(NLoginCore_219 var1) {
      int var2 = var1.a(a(bf, bh), bi);
      String var3 = var1.b(a(bj, bk ^ bm));
      String var4 = var1.b(a(bn, bo ^ br));
      String var5 = var1.b(a(bu & bw, by));
      String var6 = var1.b(a(bz, ca));
      Properties var7 = new Properties();
      String var8 = var1.b(a(cb, cd));
      if (var8 != null) {
         String[] var9 = var8.split(a(ce, cf ^ ci));
         if (var9.length >= cj) {
            String[] var10 = var9;
            int var11 = var9.length;

            for (int var12 = cm; var12 < var11; var12++) {
               String var13 = var10[var12];
               String[] var14 = var13.split(a(co, cp ^ cq));
               if (var14.length == cr) {
                  var7.setProperty(var14[cs], var14[cv]);
               }
            }
         } else {
            String[] var16 = var8.split(a(cy, cz ^ dc));
            if (var16.length == dd) {
               var7.setProperty(var16[de], var16[dh]);
            }
         }
      }

      boolean var15 = var1.d(a(dk, dm ^ dp));
      var7.setProperty(a(dq, ds), Boolean.toString(var15));
      this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var3, var2, var4, var5, var6, var7));
   }

   private static void b() {
      o = -4214241440432130160L;
      long var0 = o ^ 5562851582114399192L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               69,
               (byte)(16 + 67),
               (byte)(6 + 41),
               (byte)(10 + 57),
               (byte)(51 + 15),
               (byte)(43 + 24),
               (byte)(2 + 45),
               (byte)(76 + 4),
               (byte)(9 + 66),
               (byte)(32 + 35),
               (byte)(21 + 62),
               (byte)(17 + 36),
               (byte)(23 + 57),
               (byte)(17 + 80),
               (byte)(20 + 80),
               (byte)(66 + 34),
               (byte)(3 + 102),
               (byte)(11 + 99),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.E("եդթդԺՇՇլծԺՑՐՈՒԾՇդէդՊծՓՀՁ", (byte)49, 69);
               ZKM_STR_B[1] = NLoginCore_387.B("ĕŇħĩīđőĘĭŠŜŜŢŗĥőšŗĵŦōŝĴĵ", (byte)49, 66);
               ZKM_STR_B[2] = NLoginCore_091.D("ҜҪҬҰңүѹңҾҦӈӀӍӅҭҘӎҦҰҏҭӔқҜ", (byte)49, 68);
               ZKM_STR_B[3] = NLoginCore_471.B("ĵŃŅŉļňĒļŗĿšřŦŞņıŧĿŉĨņŭĴĵ", (byte)49, 66);
               ZKM_STR_B[4] = NLoginCore_387.E("դՄՖՅՔԪԣ\u0557ԧԼխԽճՄՋթԳԷԯՄժՃՀՁ", (byte)49, 69);
               ZKM_STR_B[5] = NLoginCore_433.C("ѺҫҬҜ҅҅қӅ҂ӄӅ҃ҩӎӉӎҹҝҫҞҎҞқҜ", (byte)49, 67);
               ZKM_STR_B[6] = NLoginCore_076.D("ҺҲҫҘҭҰҧҐӀҊҢ҅ҊҘӏҌҙҾғӔҤҞқҜ", (byte)49, 68);
               ZKM_STR_B[7] = NLoginCore_173.F("\u0557ՈՠեԥՄ\u0557\u0558ԫեԼղՉէՋղՓԲիՕ\u0558թՀՁ", (byte)49, 70);
               ZKM_STR_B[8] = NLoginCore_232.F("ՏՖԸՆ՟ԻՋԬզԥըաԭՃՊծթՋՄԸՇչՀՁ", (byte)49, 70);
               ZKM_STR_B[9] = NLoginCore_004.F("\u0558դե՝ԡՀաԼՆՈ՟\u0530ՈղխՖյԲճՔԱՓՀՁ", (byte)49, 70);
               ZKM_STR_B[10] = NLoginCore_076.C("ѺҀҚҭҎҹҢғҀҨӉҐ", (byte)49, 67);
               ZKM_STR_B[11] = NLoginCore_427.D("ғҪҿ҃ңҏҝҸӁӄҫҐ", (byte)49, 68);
               ZKM_STR_B[12] = NLoginCore_521.C("ғҪҿ҃ңҏҝҸӁӄҫҐ", (byte)49, 67);
               ZKM_STR_B[13] = NLoginCore_471.F("՚՞Չ՞ՕՀԴԹդ՝Ԩԣ՟ԲդԵբ\u0557ճՁԹՃՀՁ", (byte)49, 70);
               ZKM_STR_B[14] = NLoginCore_471.D("Ҕұҝ҄҃Ґ҄ӆ҂ҧӉҐ", (byte)49, 68);
               ZKM_STR_B[15] = NLoginCore_223.A("ķĕĬŉĵĽşœĬŚğĩ", (byte)49, 65);
               ZKM_STR_B[16] = NLoginCore_446.F("ԣԧԿՄՉՓՂՙ\u0558հ՞Ե", (byte)49, 70);
               ZKM_STR_B[17] = NLoginCore_183.F("Ղԙը\u0557՞ԢալլՇԦՉՎԫծՌԯՠՉկըչՀՁ", (byte)49, 70);
               ZKM_STR_B[18] = NLoginCore_027.A("ŒŏĬŊŜŏĵŘĝĸļĩ", (byte)49, 65);
               ZKM_STR_B[19] = NLoginCore_471.A("ŒēśŗŘŋŜġĭŔģĩ", (byte)49, 65);
               ZKM_STR_B[20] = NLoginCore_575.E("Ղ\u0558ՠՙՅՖժՎԻէզԵ", (byte)49, 69);
               ZKM_STR_B[21] = NLoginCore_451.B("ėĪŎŒľœĬġĪěģĩ", (byte)49, 66);
               ZKM_STR_B[22] = NLoginCore_433.D("ұѹҡ҄ҞҏґӇҹҕ҆Ґ", (byte)49, 68);
               ZKM_STR_B[23] = NLoginCore_232.E("ԢՏԽդաբՋաէՐԸԵ", (byte)49, 69);
               ZKM_STR_B[24] = NLoginCore_091.C("ұҐѵѼҒҝӅ҃ҵңңҐ", (byte)49, 67);
               ZKM_STR_B[25] = NLoginCore_232.A("łħŕēŚĸŏĞŞĴğĩ", (byte)49, 65);
               ZKM_STR_B[26] = NLoginCore_183.C("ҐғҁҶ҂ӇһҲѻ҇Ҟҧ҄ҦҫһҾӇӌҌҿӄқҜ", (byte)49, 67);
               ZKM_STR_B[27] = NLoginCore_127.B("ČĲĮĲęŎŎěĠĺĸĩ", (byte)49, 66);
               ZKM_STR_B[28] = NLoginCore_141.B("ĖĥŖĬŜŕŕśĔīĝņİŨśĴģħŗŌĥŇĴĵ", (byte)49, 66);
               ZKM_STR_B[29] = NLoginCore_004.B("ČĲĮĲęŎŎěĠĺĸĩ", (byte)49, 66);
               ZKM_STR_B[30] = NLoginCore_451.A("ķĻŅŋļŒőĻĳĺŗĽĸœĹŦŘŉĞļşŭĴĵ", (byte)49, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.F("եդթդԺՇՇլծԺ\u0558ԧՉղծբիկՈձԳթՀՁ", (byte)49, 70);
               ZKM_STR_B[1] = NLoginCore_397.B("ĕŇħĩīđőĘĭŠśĢģŀœńĵŢīšśŭĴĵ", (byte)49, 66);
               ZKM_STR_B[2] = NLoginCore_141.D("ҜҪҬҰңүѹңҾҦӅҬҗҋҽҠҏӀҡҒӁӔқҜ", (byte)49, 68);
               ZKM_STR_B[3] = NLoginCore_110.C("ҜҪҬҰңүѹңҾҦӆҞҌӉӊҌҜҼӇңүӔқҜ", (byte)49, 67);
               ZKM_STR_B[4] = NLoginCore_453.D("ҿҟұҠү҅ѾҲ҂җӈқҝҶҚҏһӆґӑӃҮқҜ", (byte)49, 68);
               ZKM_STR_B[5] = NLoginCore_223.B("ēńŅĵĞĞĴŞěŝŠİĥĢŔšŤřĶŚŬŭĴĵ", (byte)49, 66);
               ZKM_STR_B[6] = NLoginCore_183.A("œŋńıņŉŀĩřģĻŦĸňŐŧĲĺŦĹŉŰůŁńůŒŴŷōŢņ", (byte)49, 65);
               ZKM_STR_B[7] = NLoginCore_091.F("\u0557ՈՠեԥՄ\u0557\u0558ԫեԾՀլԱհՉյՏՏՇԹչՀՁ", (byte)49, 70);
               ZKM_STR_B[8] = NLoginCore_110.C("ҪұғҡҺҖҦ҇ӁҀӃӍӆӎҙҞӐӁҬҳґӌӌӁҙӑҬӌӝҷӖӕ", (byte)49, 67);
               ZKM_STR_B[9] = NLoginCore_575.E("\u0558դե՝ԡՀաԼՆՈՠ՞ՒՠԽԿԲԩՇԴԬչՀՁ", (byte)49, 69);
               ZKM_STR_B[10] = NLoginCore_173.C("ґҁҗӂӅҵҙҢҶҲӅҐ", (byte)49, 67);
               ZKM_STR_B[11] = NLoginCore_027.B("ŐĥśŏŚĽĮĝŃĵĬĩ", (byte)49, 66);
               ZKM_STR_B[12] = NLoginCore_004.C("ҼҲӂґҤ҃ҸҠҳҿӁҐ", (byte)49, 67);
               ZKM_STR_B[13] = NLoginCore_451.E("՚՞Չ՞ՕՀԴԹդ՝ԪձՈՋՓԱթժՆՙՊՃՀՁ", (byte)49, 69);
               ZKM_STR_B[14] = NLoginCore_173.A("ĔĻŚŐĶşňěŞęĜťįľĴħłšŖŉľŝĴĵ", (byte)49, 65);
               ZKM_STR_B[15] = NLoginCore_201.D("ҏҐҳҔҳңңқұҟҊҐ", (byte)49, 68);
               ZKM_STR_B[16] = NLoginCore_324.D("ҪӂҗҸѾ҆҂ҧҧҢқҐ", (byte)49, 68);
               ZKM_STR_B[17] = NLoginCore_076.E("Ղԙը\u0557՞ԢալլՇ\u0530\u0530՝ԼՄ՝ՎՒՊծ՛չՀՁ", (byte)49, 69);
               ZKM_STR_B[18] = NLoginCore_397.D("ѻѼӁҜҭҖҳҼҥ҉һҵҡҺӌҾӍҐҪӂӐҮқҜ", (byte)49, 68);
               ZKM_STR_B[19] = NLoginCore_575.C("ҳҋүҽҒґҹҖӀһҩҿ҉ңҊҰҲҿҭҫҪӄқҜ", (byte)49, 67);
               ZKM_STR_B[20] = NLoginCore_004.A("ŏŕĶĕīŖŞłĪĢŒĩ", (byte)49, 65);
               ZKM_STR_B[21] = NLoginCore_004.B("ŐēňņĹĵōĞšœĴĩ", (byte)49, 66);
               ZKM_STR_B[22] = NLoginCore_027.A("ŚĒőĚĭĶŜēĸŢŎĩ", (byte)49, 65);
               ZKM_STR_B[23] = NLoginCore_110.A("ĥħņĚĸŠŐĪĵĵļĩ", (byte)49, 65);
               ZKM_STR_B[24] = NLoginCore_559.B("ĬēėŐıĺĲľŋĲěĩ", (byte)49, 66);
               ZKM_STR_B[25] = NLoginCore_397.B("ĮčŔİĘğĻĘŖĮńĩ", (byte)49, 66);
               ZKM_STR_B[26] = NLoginCore_241.C("ҐғҁҶ҂ӇһҲѻ҇ҜӀҌҜҾӑҍҎӄҜңҞқҜ", (byte)49, 67);
               ZKM_STR_B[27] = NLoginCore_223.A("ŉőĬĘĻĜļŒıţŖĩ", (byte)49, 65);
               ZKM_STR_B[28] = NLoginCore_446.B("ĖĥŖĬŜŕŕśĔīĞŢŇŤĵĠĿŊśşņŇĴĵ", (byte)49, 66);
               ZKM_STR_B[29] = NLoginCore_241.B("ňśĘĮřŒĨįıŢĴĩ", (byte)49, 66);
               ZKM_STR_B[30] = NLoginCore_324.C("ҞҢҬҲңҹҸҢҚҡҿӌ҄ҼҠӄ҈ҐҤӍүҮқҜ", (byte)49, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.E("ԾԢԳԴէՉԬԣծԾՁ՝ԼՊմխիՆՓյԸ\u0558մՍԶնոԺՐձազ", (byte)49, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_397.B("ĸńĲśĝŔŋŚİőŀįśłţšřŃňũĶķĴĵ", (byte)49, 66);
         }
      }
   }
}
