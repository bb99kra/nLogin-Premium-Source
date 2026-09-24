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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_412 extends NLoginCore_098 {
   private static long ds = Long.reverse(7570680814927839205L);
   private static int ie = Integer.reverse(-1006632960);
   private static int im = Integer.reverse(-1543503872);
   private static long il = Long.reverse(5908722711110090752L);
   private static long hn = Long.reverse(4256031489183154149L);
   private static long ge = Long.reverse(4256031489183154149L);
   private static int ch = Integer.reverse(268435456);
   private static int bl = 0 >>> 248 | 0 << ~248 + 1;
   private static long by = Long.reverse(4256031489183154149L);
   private static int fs = (268435456 >>> 28 | 268435456 << ~28 + 1) & -1;
   private static long fx = Long.reverse(7570680814927839205L);
   private static long ha = Long.reverse(5908722711110090752L);
   private static long gk = Long.reverse(5908722711110090752L);
   private static int bi = Integer.reverse(-1);
   private static long ci = Long.reverse(4256031489183154149L);
   private static long eo = Long.reverse(7570680814927839205L);
   private static long hi = Long.reverse(4256031489183154149L);
   private static long gu = Long.reverse(5908722711110090752L);
   private static int cb = Integer.reverse(1073741824);
   private static long gr = Long.reverse(4256031489183154149L);
   private static int dz = -2147483644 >>> 158 | -2147483644 << -158;
   private static int hg = Integer.reverse(-134217728);
   private static long br = Long.reverse(7570680814927839205L);
   private static int bp = -1 >>> 243 | -1 << -243;
   private static int dh = Integer.reverse(-1342177280);
   private static int hy = 2112 >>> 102 | 2112 << ~102 + 1;
   private static int gc = Integer.reverse(1476395008);
   private static int ic = -2013265920 >>> 186 | -2013265920 << ~186 + 1;
   private static int e = (0 >>> 131 | 0 << -131) & -1;
   private static long dp = Long.reverse(7570680814927839205L);
   private static long ig = Long.reverse(7570680814927839205L);
   private static int ey = (0 >>> 22 | 0 << ~22 + 1) & -1;
   private static int bd = 12 >>> 34 | 12 << -34;
   private static int gq = Integer.reverse(-1207959552);
   private static String[] e = new String[im];
   private static int var_if = -1 >>> 159 | -1 << -159;
   private static int fe = -1 >>> 2 | -1 << -2;
   private static long ct = Long.reverse(7570680814927839205L);
   private static long ab = Long.reverse(7570680814927839205L);
   private static long hp = Long.reverse(5908722711110090752L);
   private static int eu = Integer.reverse(1744830464);
   private static int ek = Integer.reverse(-939524096);
   private static int dq = 1048576 >>> 80 | 1048576 << -80;
   private static int fd = Integer.reverse(-402653184);
   private static long ca = Long.reverse(5908722711110090752L);
   private static long eb = Long.reverse(4256031489183154149L);
   private static int dl = Integer.reverse(-1);
   private static int bn = Integer.reverse(-1610612736);
   private static long gx = Long.reverse(4256031489183154149L);
   private static int em = Integer.reverse(671088640);
   private static long cz = Long.reverse(4256031489183154149L);
   private static long di = Long.reverse(4256031489183154149L);
   private static long go = Long.reverse(7570680814927839205L);
   private static long cd = Long.reverse(4256031489183154149L);
   private static int gg = (1048576 >>> 148 | 1048576 << ~148 + 1) & -1;
   private static int fl = (98304 >>> 12 | 98304 << ~12 + 1) & -1;
   private static int fa = Integer.reverse(-67108864);
   private static int dd = (201326592 >>> 248 | 201326592 << -248) & -1;
   private static int bu = Integer.reverse(Integer.MIN_VALUE);
   private static int cg = Integer.reverse(-1073741824);
   private static int fz = Integer.reverse(0);
   private static int gn = (917504 >>> 111 | 917504 << -111) & -1;
   private static long p = Long.reverse(7570680814927839205L);
   private static int gv = Integer.reverse(2013265920);
   private static long dv = Long.reverse(4256031489183154149L);
   private static int ii = Integer.reverse(603979776);
   private static int z = Integer.reverse(-1);
   private static long o;
   private static long bk = Long.reverse(7570680814927839205L);
   private static int cv = Integer.reverse(1342177280);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int dk = Integer.reverse(1879048192);
   private static int cc = Integer.reverse(-536870912);
   private static int gm = Integer.reverse(1073741824);
   private static int fw = (838860800 >>> 153 | 838860800 << ~153 + 1) & -1;
   private static int in = 148 >>> 98 | 148 << ~98 + 1;
   private static int hm = (1048576 >>> 143 | 1048576 << -143) & -1;
   private static long at = Long.reverse(7570680814927839205L);
   private static long dy = Long.reverse(5908722711110090752L);
   private static int fv = Integer.reverse(-1);
   private static long cf = Long.reverse(5908722711110090752L);
   private static long fn = Long.reverse(4256031489183154149L);
   private static long ck = Long.reverse(5908722711110090752L);
   private static int co = Integer.reverse(-1879048192);
   private static long ff = Long.reverse(7570680814927839205L);
   private static long dc = Long.reverse(5908722711110090752L);
   private static long ev = Long.reverse(7570680814927839205L);
   private static long gf = Long.reverse(5908722711110090752L);
   private static int cr = (-1 >>> 196 | -1 << -196) & -1;
   private static int cm = (2097152 >>> 19 | 2097152 << ~19 + 1) & -1;
   private static int ex = (4 >>> 33 | 4 << -33) & -1;
   private static int al = 131072 >>> 48 | 131072 << -48;
   private static long gi = Long.reverse(4256031489183154149L);
   private static long id = Long.reverse(7570680814927839205L);
   private static long ik = Long.reverse(4256031489183154149L);
   private static int ao = -1 >>> 54 | -1 << -54;
   private static int bw = Integer.reverse(1610612736);
   private static int fb = (512 >>> 73 | 512 << -73) & -1;
   private static long dm = Long.reverse(7570680814927839205L);
   private static long dj = Long.reverse(5908722711110090752L);
   private static long el = Long.reverse(7570680814927839205L);
   private static int fr = (0 >>> 73 | 0 << -73) & -1;
   private static int gh = Integer.reverse(-671088640);
   private static int dt = (4352 >>> 40 | 4352 << -40) & -1;
   private static long fo = Long.reverse(5908722711110090752L);
   private static long be = Long.reverse(4256031489183154149L);
   private static long ee = Long.reverse(5908722711110090752L);
   private static long bh = Long.reverse(5908722711110090752L);
   private static int dn = Integer.reverse(-268435456);
   private static long hl = Long.reverse(5908722711110090752L);
   private static int en = (-1 >>> 219 | -1 << ~219 + 1) & -1;
   private static int fh = (0 >>> 178 | 0 << -178) & -1;
   private static long hz = Long.reverse(7570680814927839205L);
   private static int fp = Integer.reverse(1073741824);
   private static int cy = Integer.reverse(-805306368);
   private static int m = Integer.reverse(-1);
   private static int eq = Integer.reverse(-1476395008);
   private static long cw = Long.reverse(7570680814927839205L);
   private static int bj = Integer.MIN_VALUE >>> 221 | Integer.MIN_VALUE << -221;
   private static long es = Long.reverse(7570680814927839205L);
   private static String[] f = new String[in];
   private static long df = Long.reverse(7570680814927839205L);

   @Override
   protected File b() {
      return new File(this.m.c().getParentFile(), this.a.p().toLowerCase(Locale.ENGLISH));
   }

   private static String a(int var0, long var1) {
      var1 ^= 74L;
      var1 ^= -7288467033676124245L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     (byte)(3 + 66),
                     (byte)(46 + 37),
                     47,
                     (byte)(21 + 46),
                     (byte)(50 + 16),
                     (byte)(48 + 19),
                     (byte)(9 + 38),
                     (byte)(26 + 54),
                     (byte)(27 + 48),
                     (byte)(20 + 47),
                     (byte)(15 + 68),
                     (byte)(20 + 33),
                     (byte)(45 + 35),
                     (byte)(94 + 3),
                     (byte)(44 + 56),
                     100,
                     (byte)(23 + 82),
                     (byte)(19 + 91),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(17 + 52), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.A("ðýü¿ÿûöÿĊùÆĄĈāĄĊÌњѣљѓѓыѢѧѮѨњ", (byte)7, 65));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_412.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.D("ґҳҵҕҹӘӐӦӒҡӟӕӣӝҦӋӭӬӤӪӤҹ", (byte)60, 68), NLoginCore_412.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.F("՛ըէԪժզաժյդԱկճլկյԷࣅ࣎ࣄࢾࢾࢶ࣒࣓࣍ࣙࣅՎ", (byte)60, 70) + var1 + NLoginCore_387.E("Բ", (byte)60, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al & ao, at), a(bd, be ^ bh)).toLowerCase(Locale.ROOT);
      int var4 = bi;
      switch (var2.hashCode()) {
         case -2105481388:
            if (var2.equals(a(ch, ci ^ ck))) {
               var4 = cm;
            }
            break;
         case -894935028:
            if (var2.equals(a(bn & bp, br))) {
               var4 = bu;
            }
            break;
         case 3274:
            if (var2.equals(a(bj, bk))) {
               var4 = bl;
            }
            break;
         case 104382626:
            if (var2.equals(a(bw, by ^ ca))) {
               var4 = cb;
            }
            break;
         case 839186932:
            if (var2.equals(a(cc, cd ^ cf))) {
               var4 = cg;
            }
      }

      switch (var4) {
         case 0:
            this.P = a(co & cr, ct);
            this.d = H2DatabaseProvider.a(this.m, NLoginCore_282.c, new File(var1.d().getParentFile(), a(cv, cw)), new Properties());
            break;
         case 1:
            this.P = a(cy, cz ^ dc);
            this.d = NLoginCore_586.a(this.m, new File(var1.d().getParentFile(), a(dd, df)), new Properties());
            break;
         case 2:
         case 3:
         case 4:
            String var5 = var1.a(a(dh, di ^ dj), a(dk & dl, dm));
            String var6 = var1.a(a(dn, dp), a(dq, ds));
            String var7 = var1.a(a(dt, dv ^ dy), a(dz, eb ^ ee));
            String var8 = var1.a(a(ek, el), a(em & en, eo));
            Properties var9 = new Properties();
            String var10 = var1.a(a(eq, es), a(eu, ev));
            if (var10.length() >= ex && var10.charAt(ey) == fa) {
               var10 = var10.substring(fb);
               String[] var11 = var10.split(a(fd & fe, ff));
               int var12 = var11.length;

               for (int var13 = fh; var13 < var12; var13++) {
                  String var14 = var11[var13];
                  String[] var15 = var14.split(a(fl, fn ^ fo));
                  if (var15.length == fp) {
                     var9.put(var15[fr], var15[fs]);
                  }
               }
            }

            int var17 = fv;
            switch (var2.hashCode()) {
               case -2105481388:
                  if (var2.equals(a(gh, gi ^ gk))) {
                     var17 = gm;
                  }
                  break;
               case 104382626:
                  if (var2.equals(a(gc, ge ^ gf))) {
                     var17 = gg;
                  }
                  break;
               case 839186932:
                  if (var2.equals(a(fw, fx))) {
                     var17 = fz;
                  }
            }

            switch (var17) {
               case 0:
                  this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var9, NLoginCore_036.c.i()));
                  return;
               case 1:
                  this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var9, NLoginCore_036.d.i()));
                  return;
               case 2:
                  this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var5, var8, var6, var7, var9, NLoginCore_036.e.i()));
                  return;
               default:
                  return;
            }
         default:
            throw new UnsupportedOperationException(a(gn, go) + var2);
      }
   }

   private static void b() {
      o = -6341413999125591844L;
      long var0 = o ^ -7288467033676124245L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(32 + 37),
               (byte)(13 + 70),
               (byte)(25 + 22),
               (byte)(30 + 37),
               (byte)(13 + 53),
               67,
               (byte)(4 + 43),
               (byte)(43 + 37),
               (byte)(66 + 9),
               (byte)(26 + 41),
               (byte)(43 + 40),
               (byte)(19 + 34),
               (byte)(77 + 3),
               (byte)(66 + 31),
               (byte)(67 + 33),
               (byte)(40 + 60),
               (byte)(23 + 82),
               (byte)(75 + 35),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_453.B("ƪǀǄƨǌƭǝǱǃǭǤǴƴǥǎƵǋǷưǸǼǙǆǇ", (byte)122, 66);
               f[1] = NLoginCore_183.B("ƽƾǆǰǜǛǡǋǃǇǬƻ", (byte)122, 66);
               f[2] = NLoginCore_384.F("֞սծ֎ճհլ֔֕ոֵփ֣֛֮֓֕֘վ\u058cׇ֣֮ׄ֠֙־ք֗\u05cd־֫", (byte)122, 70);
               f[3] = NLoginCore_446.B("ƣǤƶǅǂưƨǪǨǭƭƻ", (byte)122, 66);
               f[4] = NLoginCore_384.F("զ֧չֈօճիְ֭֫հվ", (byte)122, 70);
               f[5] = NLoginCore_201.B("ǤǘƫƼǑǛǇƪǜǴƾƻ", (byte)122, 66);
               f[6] = NLoginCore_127.B("ǭƬǀƫǢǊǬǋǭǴǊƻ", (byte)122, 66);
               f[7] = NLoginCore_521.B("ƩǫǆƷǨƾǬǑǮǊǒƻ", (byte)122, 66);
               f[8] = NLoginCore_076.E("ծ։֍ղթֈ֟տ֢֕֡և։օ֬֍֘֫\u058b֔־ׂ։֊", (byte)122, 69);
               f[9] = NLoginCore_521.C("խծն֠\u058c\u058b֑ջճշ֜ի", (byte)122, 67);
               f[10] = NLoginCore_232.D("֍՛\u0557վ։\u0590֗կմշն֦ոՠ֣֥֞֨\u058c֊չչնշ", (byte)122, 68);
               f[11] = NLoginCore_232.B("ƽƾǆǰǜǛǡǋǃǇǬƻ", (byte)122, 66);
               f[12] = NLoginCore_433.C("֍՛\u0557վ։\u0590֗կմշն֪֞֟յսս֕֎կէչնշ", (byte)122, 67);
               f[13] = NLoginCore_471.E("֞սծ֎ճհլ֔֕ոִ\u058cָշֲ֗սְֺֻֻ֫֗֝׆֞֒\u05c8ֈׂ֚\u05cc", (byte)122, 69);
               f[14] = NLoginCore_141.B("ǠǀǪǂƢǙǦǣǳǬƾǫǓǆǎƻǑǧǶƺǝǙǆǇ", (byte)122, 66);
               f[15] = NLoginCore_141.B("ǛƺƫǋưƭƩǑǒƵǱǓǨǑǃǣǮǲƵǩǝǯǆǇ", (byte)122, 66);
               f[16] = NLoginCore_397.D("ֈ՚֎ծ՞։տնա֟\u0590ի", (byte)122, 68);
               f[17] = NLoginCore_183.A("ǛƺƫǋưƭƩǑǒƵǳǅǎǖǌǰǔƵǩǍǟǍȃǋǘǣȂǴǰȅǪǚ", (byte)122, 65);
               f[18] = NLoginCore_324.E("֤֡էֆ֞֎֔֞֊ֱָ֫֩֔֔֩շ֏֡׀ֿ\u058c։֊", (byte)122, 69);
               f[19] = NLoginCore_397.F("֞սծ֎ճհլ֔֕ոֶ֎ַ֓նռֺ֔֯տֳֵֶַ֛֖֕\u05c8֜\u05c9ׂ֠", (byte)122, 70);
               f[20] = NLoginCore_138.A("ǡǞƤǃǛǋǑǛǇǨǮǦǑǵǑǦƴǌǞǽǼǉǆǇ", (byte)122, 65);
               f[21] = NLoginCore_575.C("\u058bժ՛ջՠ՝ՙցւե֣սփբ֗դբ֙վ֢թծցճ֊֬ք֢\u0590ևֹճ֧֗։ֵׁ֖֘\u058cָֹ֢\u058b", (byte)122, 67);
               f[22] = NLoginCore_559.B("ƻƧƼƦǎưǈƱǔǶǟƱǢǅǻƴǘǱƶǊǈǛǻǂǱǱǵǻǄǒȆǔǔǌȊǞȉǾǦǪȕȁǯȎǹȆȇǵǓȖǞǞǶǱȜǚȠȞǲșǻȑǧȫǵǦǻȢȜǻǮǱȢǱȬǻ", (byte)122, 66);
               f[23] = NLoginCore_127.B("ǃǣƤǠƼƫǲǎƼǋǤƻ", (byte)122, 66);
               f[24] = NLoginCore_141.D("֕ջ֒խՠն֡֎փջծի", (byte)122, 68);
               f[25] = NLoginCore_141.D("ՙ֛նէ֘ծ֜ց֞պւի", (byte)122, 68);
               f[26] = NLoginCore_324.C("֝՜հ՛֒պ֜ջ֤֝պի", (byte)122, 67);
               f[27] = NLoginCore_530.A("ƫǆǊƯƦǅǜƼǟǒǞǄǆǂǩǊǕǨǈǑǻǿǆǇ", (byte)122, 65);
               f[28] = NLoginCore_173.B("ǛƨƮǢǃǫǠǝǃǒǭƲǊǒǥǍǤǸǗǑƿǰǿǶǻǠȀǳǷǜǫǥǃǿȏǇǿǜȉǣȍȐȀǛ", (byte)122, 66);
               f[29] = NLoginCore_091.C("զը֟֝ծ֞֏ս֡դկջ֑֕րշ֛վո֘ռչնշ", (byte)122, 67);
               f[30] = NLoginCore_141.D("\u0590ժվ֎֜րճձւջ֘ի", (byte)122, 68);
               f[31] = NLoginCore_446.F("֝֍ծս֭խ֦ք\u058b֤հվ", (byte)122, 70);
               f[32] = NLoginCore_427.C("կՓծ\u0590ի֡ն֤ւՠ\u0590ի", (byte)122, 67);
               f[33] = NLoginCore_232.A("ƢƿǫǠƼǲƻǯƱƮǨƻ", (byte)122, 65);
               f[34] = NLoginCore_183.A("ǙǛƮǆǮǉǆǫǴǞǪƴǧǘǓǸǬǻǋǔǈǯǆǇ", (byte)122, 65);
               f[35] = NLoginCore_451.A("ǍǈƬǜǍǣǜƱǈǊƱƻ", (byte)122, 65);
               f[36] = NLoginCore_433.D("՜֞վսրջպտ֟֗ւի", (byte)122, 68);
               break;
            case 1:
               f[0] = NLoginCore_241.F("խփևի֏հִ֠ֆְ֪ֈ֍ַֻֻ֒տց֓\u0590\u058c։֊", (byte)122, 70);
               f[1] = NLoginCore_127.D("֒֓լճ՞֔Ք֛՜\u0590֔ի", (byte)122, 68);
               f[2] = NLoginCore_127.F("֞սծ֎ճհլ֔֕ոֵփ֣֛֮֓֕֘վ\u058c֣֟֍ֽֽ֛֞փׅ֨\u05c9֬\u05c9ֹּ֪־֓֏׀ֿ֥֭֞", (byte)122, 70);
               f[3] = NLoginCore_004.D("թն\u0558և֙֠\u058bմդ֦ծի", (byte)122, 68);
               f[4] = NLoginCore_471.A("ǉǊƭǝǈƱǡǆưǋǬƻ", (byte)122, 65);
               f[5] = NLoginCore_076.F("֎ֆֈ֭ճ֟է֢ճ֡֔֊ֳֻ֘յֲֽֿ֑֫֝։֊", (byte)122, 70);
               f[6] = NLoginCore_384.C("\u0557Քն֝֕\u058bՔղ֖֎՜տճ֦ր֥֤֨֞֫֙֯նշ", (byte)122, 67);
               f[7] = NLoginCore_183.F("֤֎խլհ֫խհ֭֗քփո֯֍ֳֽ֮֡֫֕\u058c։֊", (byte)122, 70);
               f[8] = NLoginCore_183.A("ƫǆǊƯƦǅǜƼǟǒǖǃƴưǛǯǶǋǙǮǗǯǆǇ", (byte)122, 65);
               f[9] = NLoginCore_521.A("ǩǪǎǀǥǠǜƱǬǡǊƻ", (byte)122, 65);
               f[10] = NLoginCore_384.E("֠ծժ֑֣֪֜ւև֊։։ոָֆֆ֪֝տցւׂ։֊", (byte)122, 69);
               f[11] = NLoginCore_324.B("ǟǃǝƪǋǪǤǑǲǕƾǨǒǘǫƺǮƼƵǧƲǙǆǇ", (byte)122, 66);
               f[12] = NLoginCore_324.F("֠ծժ֑֣֪֜ւև֊\u058c֊֏֩־\u058bֱֳ־֛֤֤֪֗֬֜֗֜֙֕ֈ֡", (byte)122, 70);
               f[13] = NLoginCore_232.B("ǛƺƫǋưƭƩǑǒƵǱǉǵƴǔǯƺǨǸǭǔǜǝǤǢȃǚǁǑȃȁǅ", (byte)122, 66);
               f[14] = NLoginCore_004.C("\u0590հ֚ղՒ։֖֣֓֜հ֖զ։֙ջտ֡ֆ֧֥կ\u0590ֲխ֑յրֶֶ֖֥", (byte)122, 67);
               f[15] = NLoginCore_451.D("\u058bժ՛ջՠ՝ՙցւե֢֡֞֔՜֗֨։նց֠չնշ", (byte)122, 68);
               f[16] = NLoginCore_397.B("ǚƹǇƾǀƽǮǑǫƭƾƻ", (byte)122, 66);
               f[17] = NLoginCore_384.E("֞սծ֎ճհլ֔֕ոֶֈ֑֙֏ֳ֗ո֬\u0590ִַַ֢֕֓֓֞׀ֺ֍֍", (byte)122, 69);
               f[18] = NLoginCore_427.A("ǡǞƤǃǛǋǑǛǇǨǮǇǘǋǌǒƼǎǲǭǴǯǆǇ", (byte)122, 65);
               f[19] = NLoginCore_092.F("֞սծ֎ճհլ֔֕ոֶ֎ַ֓նռֺ֔֯տַ\u0590օֵֹֺֽׁ֤փ֨׃", (byte)122, 70);
               f[20] = NLoginCore_241.D("֑֎Քճ\u058bջց\u058bշ֘֞ֈջ֥տ֘֟֎պ֡֨֟նշ", (byte)122, 68);
               f[21] = NLoginCore_141.C("\u058bժ՛ջՠ՝ՙցւե֣սփբ֗դբ֙վ֢թծցճ֊֬ք֢\u0590ևֹճ֎֝֕ձշֱրռսռֶַַ֢֜\u05c9ֻք\u058cֿֿ֖֞֗", (byte)122, 67);
               f[22] = NLoginCore_232.A("ƻƧƼƦǎưǈƱǔǶǟƱǢǅǻƴǘǱƶǊǈǛǻǂǱǱǵǻǄǒȆǔǔǌȊǞȉǾǦǪȕȁǯȎǹȆȇǵǓȖǞǞǶǱȜǚȠȞǲșǻȑǧȫǫȋȅǨȤǣȆȓȐȊȬǻ", (byte)122, 65);
               f[23] = NLoginCore_173.E("֢֏քս֊֊էծַ֬հվ", (byte)122, 69);
               f[24] = NLoginCore_138.D("քեռ՛ճստն\u0590ղ֠ի", (byte)122, 68);
               f[25] = NLoginCore_553.E("֞֫\u058b֒վִ֪֯ւ֣֡֔֎֔։ֱ֘֓֙ջֲ֭։֊", (byte)122, 69);
               f[26] = NLoginCore_173.F("ըվְ֩֞ժ֢֍յ֓֕վ", (byte)122, 70);
               f[27] = NLoginCore_201.E("ծ։֍ղթֈ֟տֳ֢֚֕֏ֶ֑֍ֺ֚֔֬ռ֜։֊", (byte)122, 69);
               f[28] = NLoginCore_324.C("\u058b\u0558՞֒ճ֛\u0590֍ճւ֝բպւ֕ս֔֨ևցկ֦֠֯֫\u0590ְ֣֧\u058cּ֛֕֗շ֟־׀ׁպս֜ց\u058b", (byte)122, 67);
               f[29] = NLoginCore_232.B("ƶƸǯǭƾǮǟǍǱƴǁǒǡǺǢǷǗǧǟǩǞǙǆǇ", (byte)122, 66);
               f[30] = NLoginCore_387.F("օ֧ց֑կ֓֝֗֫֯յչֹ֣֙նտ֪\u058cֽ֝֜։֊", (byte)122, 70);
               f[31] = NLoginCore_553.E("֊փֈրսևծ֪֫ձցվ", (byte)122, 69);
               f[32] = NLoginCore_076.A("ƿǉǨǩǈǐǭǪǀǝǡǒǅǕǆǄǴǉǳǰǊǿǆǇ", (byte)122, 65);
               f[33] = NLoginCore_387.D("քնծ֒Ֆ֤֘֡չ֑աի", (byte)122, 68);
               f[34] = NLoginCore_232.A("ǙǛƮǆǮǉǆǫǴǞǨƮǷǺǲƷǊƺƽǊǚǿǆǇ", (byte)122, 65);
               f[35] = NLoginCore_076.F("֯կ֣֜֠֕քֵխַկչ\u058bֆֽֆֱ֮֓֡֙֜։֊", (byte)122, 70);
               f[36] = NLoginCore_433.F("։ըպւ֑֩֊֊շַָվ", (byte)122, 70);
               break;
            case 2:
               f[0] = NLoginCore_004.E("թծ֤֓֏հ֣։ַփ֧վ", (byte)122, 69);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_173.B("ƩǂǧƫǮǄǤǡǈƭǲǊǆǎǰǇǮǮǞǿǴǉǆǇ", (byte)122, 66);
         }
      }
   }

   public NLoginCore_412(NLoginType_008 var1) {
      super(var1, NLoginCore_479.j, a(e & m, p), a(y & z, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(gq, gr ^ gu));
      String var2 = var1.getString(a(gv, gx ^ ha));
      String var3 = var1.getString(a(hg, hi ^ hl));
      long var4 = var1.getLong(a(hm, hn ^ hp));
      UUID var6 = NLoginCore_432.c(var1.getString(a(hy, hz)));
      UUID var7 = NLoginCore_432.c(var1.getString(a(ic, id)));
      if (var2 != null) {
         var2 = var2.replace(a(ie & var_if, ig), a(ii, ik ^ il));
      }

      Consumer var8 = var2x -> var2x.a(var4, var4);
      if (var7 != null) {
         this.a(this.r, var2, var3, var6, var7, var8);
      } else {
         this.a(this.r, var2, var3, var6, var8);
      }
   }
}
