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
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class NLoginCore_238 extends NLoginCore_098 {
   private static int fl = (-1 >>> 36 | -1 << ~36 + 1) & -1;
   private static int bn = (134217728 >>> 25 | 134217728 << ~25 + 1) & -1;
   private static long bo = Long.reverse(-6633926007117835420L);
   private static int fv = Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1;
   private static int gg = Integer.reverse(536870912);
   private static int ek = 0 >>> 24 | 0 << ~24 + 1;
   private static long gr = Long.reverse(-8363308264028105884L);
   private static int gs = Integer.reverse(1476395008);
   private static long dc = Long.reverse(2882303761517117440L);
   private static int cy = Integer.reverse(1342177280);
   private static int fr = Integer.reverse(0);
   private static int cb = 8192 >>> 237 | 8192 << -237;
   private static long dp = Long.reverse(-8363308264028105884L);
   private static long ez = Long.reverse(-6633926007117835420L);
   private static int e = (0 >>> 36 | 0 << -36) & -1;
   private static long be = Long.reverse(-8363308264028105884L);
   private static long ck = Long.reverse(2882303761517117440L);
   private static int dk = Integer.reverse(-1);
   private static long eo = Long.reverse(-6633926007117835420L);
   private static long ee = Long.reverse(-6633926007117835420L);
   private static long cf = Long.reverse(2882303761517117440L);
   private static int cc = Integer.reverse(1610612736);
   private static long ft = Long.reverse(-6633926007117835420L);
   private static long et = Long.reverse(2882303761517117440L);
   private static long ca = Long.reverse(2882303761517117440L);
   private static int gd = Integer.reverse(-1073741824);
   private static int bd = Integer.reverse(-1);
   private static long o;
   private static int ex = Integer.reverse(-1476395008);
   private static int bu = Integer.reverse(0);
   private static int hg = (1610612736 >>> 253 | 1610612736 << ~253 + 1) & -1;
   private static int ed = (4456448 >>> 82 | 4456448 << ~82 + 1) & -1;
   private static int cr = Integer.reverse(1462763520);
   private static long dy = Long.reverse(-8363308264028105884L);
   private static int gv = (432 >>> 228 | 432 << -228) & -1;
   private static long ff = Long.reverse(-8363308264028105884L);
   private static int hj = -2147483637 >>> 254 | -2147483637 << -254;
   private static int var_do = (-1 >>> 200 | -1 << ~200 + 1) & -1;
   private static int er = Integer.reverse(-939524096);
   private static long by = Long.reverse(-6633926007117835420L);
   private static int z = (-1 >>> 227 | -1 << -227) & -1;
   private static int gj = (8 >>> 193 | 8 << -193) & -1;
   private static long ci = Long.reverse(-6633926007117835420L);
   private static String[] e = new String[NLoginCore_238.hk];
   private static int hh = (268435456 >>> 249 | 268435456 << -249) & -1;
   private static String[] f = new String[NLoginCore_238.hm];
   private static long cn = Long.reverse(-6633926007117835420L);
   private static long ef = Long.reverse(2882303761517117440L);
   private static int gm = Integer.reverse(-1610612736);
   private static int fs = Integer.reverse(402653184);
   private static int dh = Integer.reverse(805306368);
   private static long cd = Long.reverse(-6633926007117835420L);
   private static long gx = Long.reverse(-6633926007117835420L);
   private static int bf = (12288 >>> 76 | 12288 << ~76 + 1) & -1;
   private static long p = Long.reverse(-6633926007117835420L);
   private static long fc = Long.reverse(2882303761517117440L);
   private static long gu = Long.reverse(-8363308264028105884L);
   private static long ep = Long.reverse(2882303761517117440L);
   private static int cg = (1048576 >>> 211 | 1048576 << ~211 + 1) & -1;
   private static int ar = 16 >>> 163 | 16 << -163;
   private static long bk = Long.reverse(2882303761517117440L);
   private static long dm = Long.reverse(-8363308264028105884L);
   private static int fp = Integer.reverse(-536870912);
   private static long df = Long.reverse(-6633926007117835420L);
   private static int gq = Integer.reverse(-1744830464);
   private static int hk = 1835008 >>> 48 | 1835008 << ~48 + 1;
   private static int gn = (3072 >>> 137 | 3072 << -137) & -1;
   private static long fn = Long.reverse(-8363308264028105884L);
   private static int gt = (-1 >>> 89 | -1 << -89) & -1;
   private static int cv = Integer.reverse(-1);
   private static long cw = Long.reverse(-8363308264028105884L);
   private static long ds = Long.reverse(-6633926007117835420L);
   private static int fe = -1 >>> 112 | -1 << ~112 + 1;
   private static int dn = Integer.reverse(-1342177280);
   private static int dq = 469762048 >>> 249 | 469762048 << ~249 + 1;
   private static int cs = Integer.reverse(-1879048192);
   private static int gh = (1073741824 >>> 28 | 1073741824 << -28) & -1;
   private static int fh = (23 >>> 64 | 23 << ~64 + 1) & -1;
   private static int bw = Integer.reverse(-1610612736);
   private static int fd = Integer.reverse(1744830464);
   private static int ch = Integer.reverse(-536870912);
   private static int gc = (-419430369 >>> 245 | -419430369 << -245) & -1;
   private static long es = Long.reverse(-6633926007117835420L);
   private static int dw = Integer.reverse(-268435456);
   private static int em = Integer.reverse(1207959552);
   private static long br = Long.reverse(2882303761517117440L);
   private static long fu = Long.reverse(2882303761517117440L);
   private static int hm = (14680064 >>> 83 | 14680064 << ~83 + 1) & -1;
   private static long bh = Long.reverse(-6633926007117835420L);
   private static long q = Long.reverse(2882303761517117440L);
   private static long ha = Long.reverse(2882303761517117440L);
   private static int eq = (128 >>> 7 | 128 << ~7 + 1) & -1;
   private static int ea = (-1 >>> 179 | -1 << -179) & -1;
   private static int cm = Integer.reverse(268435456);
   private static int ec = Integer.reverse(-1);
   private static int dz = Integer.reverse(134217728);
   private static int fw = (304 >>> 36 | 304 << ~36 + 1) & -1;
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int bl = Integer.reverse(-1);
   private static long ev = Long.reverse(-8363308264028105884L);
   private static long dg = Long.reverse(2882303761517117440L);
   private static long cz = Long.reverse(-6633926007117835420L);
   private static int eu = ('ꀀ' >>> 203 | 40960 << ~203 + 1) & -1;
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int ao = Integer.reverse(0);
   private static long dv = Long.reverse(2882303761517117440L);
   private static long ab = Long.reverse(-8363308264028105884L);
   private static long hi = Long.reverse(-72057594037927936L);
   private static int fz = Integer.reverse(1073741824);
   private static int dd = Integer.reverse(-805306368);
   private static long cp = Long.reverse(2882303761517117440L);
   private static long eb = Long.reverse(-8363308264028105884L);

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(ar & bd, be), a(bf, bh ^ bk)).toLowerCase(Locale.ROOT);
      int var4 = bl;
      switch (var2.hashCode()) {
         case -2105481388:
            if (var2.equals(a(cc, cd ^ cf))) {
               var4 = cg;
            }
            break;
         case -894935028:
            if (var2.equals(a(bn, bo ^ br))) {
               var4 = bu;
            }
            break;
         case 104382626:
            if (var2.equals(a(bw, by ^ ca))) {
               var4 = cb;
            }
      }

      switch (var4) {
         case 0:
            this.d = NLoginCore_586.a(this.m, new File(var1.d().getParentFile(), a(ch, ci ^ ck)), new Properties());
            return;
         case 1:
         case 2:
            int var5 = var1.a(a(cm, cn ^ cp), cr);
            String var6 = var1.a(a(cs & cv, cw), a(cy, cz ^ dc));
            String var7 = var1.a(a(dd, df ^ dg), a(dh & dk, dm));
            String var8 = var1.a(a(dn & var_do, dp), a(dq, ds ^ dv));
            String var9 = var1.a(a(dw, dy), a(dz & ea, eb));
            Properties var10 = new Properties();
            int var12 = ec;
            switch (var2.hashCode()) {
               case -2105481388:
                  if (var2.equals(a(em, eo ^ ep))) {
                     var12 = eq;
                  }
                  break;
               case 104382626:
                  if (var2.equals(a(ed, ee ^ ef))) {
                     var12 = ek;
                  }
            }

            switch (var12) {
               case 0:
                  this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var6, var5, var9, var7, var8, var10));
                  return;
               case 1:
                  this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var6, var5, var9, var7, var8, var10));
                  return;
               default:
                  return;
            }
         default:
            throw new UnsupportedOperationException(a(er, es ^ et) + var2);
      }
   }

   private static String a(long var0) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = hg; var3 >= 0; var3--) {
         var2.append(var0 >> var3 * hh & hi);
         if (var3 > 0) {
            var2.append((char)hj);
         }
      }

      return var2.toString();
   }

   private static String a(int var0, long var1) {
      var1 ^= 20L;
      var1 ^= -7052984229617245224L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(50 + 19),
                     (byte)(69 + 14),
                     (byte)(24 + 23),
                     (byte)(8 + 59),
                     66,
                     (byte)(33 + 34),
                     (byte)(37 + 10),
                     80,
                     (byte)(56 + 19),
                     (byte)(23 + 44),
                     (byte)(50 + 33),
                     (byte)(19 + 34),
                     (byte)(36 + 44),
                     (byte)(71 + 26),
                     (byte)(7 + 93),
                     (byte)(14 + 86),
                     (byte)(53 + 52),
                     (byte)(89 + 21),
                     (byte)(43 + 60)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), (byte)(40 + 43)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢫ࢟ࢮ\u0891ࢡ\u0890ࢎ\u088fࢦࢌࢷ", (byte)27, 69));
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

   private static void b() {
      o = 2794520898742384581L;
      long var0 = o ^ -7052984229617245224L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(60 + 8),
               (byte)(11 + 58),
               (byte)(54 + 29),
               (byte)(12 + 35),
               (byte)(34 + 33),
               (byte)(22 + 44),
               (byte)(23 + 44),
               (byte)(41 + 6),
               (byte)(78 + 2),
               (byte)(42 + 33),
               (byte)(11 + 56),
               (byte)(65 + 18),
               53,
               (byte)(6 + 74),
               (byte)(43 + 54),
               (byte)(54 + 46),
               (byte)(68 + 32),
               (byte)(21 + 84),
               (byte)(65 + 45),
               (byte)(46 + 57)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_384.B("ưǫǪǬǖǦƳǸǹǯƹǮǾǕǍǁȂǿǕǐǯǏǌǍ", (byte)125, 66);
               f[1] = NLoginCore_471.A("ǜƪǐǅǞǗǑǱǴǬǤǎǲǒȀƺǱǴǽǯǵǏǌǍ", (byte)125, 65);
               f[2] = NLoginCore_575.A("ǠǌǉƿǨǃǒǆƵǱǙǽǽȀǫǾǻǜǬǀƽǟǌǍ", (byte)125, 65);
               f[3] = NLoginCore_138.D("֕՜՟ողէ֤պոցփմ", (byte)125, 68);
               f[4] = NLoginCore_076.E("֢թլօտմֱևօ֎\u0590ց", (byte)125, 69);
               f[5] = NLoginCore_232.E("ևֲ֤սնְַ֑֬։ֺց", (byte)125, 69);
               f[6] = NLoginCore_324.E("ִ֮ֈ֬֎֘֯ֈհֵնս\u058c֍ֿ\u0590վְׁ֥֭֟\u058c֍", (byte)125, 69);
               f[7] = NLoginCore_530.B("ǜƪǐǅǞǗǑǱǴǬǝǳǋǕȁǚǻǚȁǔȂǡƾǠǓȋȁȁǞǝȄǬ", (byte)125, 66);
               f[8] = NLoginCore_232.F("֠\u058c։տ֨փ֒ֆյֱ֚պ֔ս֠ոֻ֯֟֎ֽׅ\u058c֍", (byte)125, 70);
               f[9] = NLoginCore_076.F("֠\u058c։տ֨փ֒ֆյֱָ֛֊չֱֻֻ־նֻվֽ֛֩օ֧\u05c9֨\u05ce֍֦֙", (byte)125, 70);
               f[10] = NLoginCore_183.B("ǪǩǴǕǮǳǍǆƳǹǯǭƸǠǈǹǂǌǐǿǰǟǌǍ", (byte)125, 66);
               f[11] = NLoginCore_521.E("֠\u058c։տ֨փ֒ֆյֱ֛֚֏ս֖֊ֿ֢֛֥֫\u05c8ֹ֧֧֒ֈֶֻֆ\u058c֠", (byte)125, 69);
               f[12] = NLoginCore_453.B("ƤǋǣǡƭƮǢǍǉǘǘǁ", (byte)125, 66);
               f[13] = NLoginCore_324.C("֓տռղ֛նօչը֤֎֣տ֫։֬քձֵ֦֭֩֘օּմֵ֑֓֊֒֬", (byte)125, 67);
               f[14] = NLoginCore_521.E("֢֟և֯ծֆճկ֯։֯֜֍֗֔։ֵ֓֫֝֗֒\u058c֍", (byte)125, 69);
               f[15] = NLoginCore_471.B("ǠǌǉƿǨǃǒǆƵǱǘǗǮƿƽǮǷǿǷǢǐǿȇǈǻǘȆǊȄǸȊǝ", (byte)125, 66);
               f[16] = NLoginCore_521.D("խր֟եովփը֍֎֥մ", (byte)125, 68);
               f[17] = NLoginCore_559.B("ǇǤǲƽƶǬǷǰǑǉǺǁ", (byte)125, 66);
               f[18] = NLoginCore_232.B("ǮǴǈǬǎǘǯǈưǵƶƽǌǍǿǐƾǭǰȁǥǟǌǍ", (byte)125, 66);
               f[19] = NLoginCore_521.C("֥շո՟֦վ֤֝\u058bտփ֚֩հկռէ֤֗ր֯լն֎ս֚ռֱֶֹׂׂ֑֠֨֩־֩֠׀֛֬\u05cd֔", (byte)125, 67);
               f[20] = NLoginCore_127.F("֜֨֔ևև֘֏ִֺ֔֨ց", (byte)125, 70);
               f[21] = NLoginCore_201.E("֢֟և֯ծֆճկ֯։֯֜֍֗֔։ֵ֓֫֝֗֒\u058c֍", (byte)125, 69);
               f[22] = NLoginCore_384.C("֚դեմ֪օբտ֫֍֭մ", (byte)125, 67);
               f[23] = NLoginCore_141.D("֝վճ֡։֢֘֜թ֥եւխְլ֪֖ծֹ֕օ֥֚֓նսջն֟־ֲֶֺ׀ׇ֢ր׃ַֺ֜\u05cbׁ֔", (byte)125, 68);
               f[24] = NLoginCore_427.B("ƿǍƭǫƲƵǦǰǎƷǛǙǳǚƻǰǔǱȃǔǖǏǌǍ", (byte)125, 66);
               f[25] = NLoginCore_553.F("֏֑֦֪֫֯֬֕\u058c֥շց", (byte)125, 70);
               f[26] = NLoginCore_384.B("ƤǁƮǳǔǊǸǒǓǨǱƸƹƱȁǎƾǾǙǂǄǏǌǍ", (byte)125, 66);
               f[27] = NLoginCore_138.F("֨ծִ֯\u0590ֈ\u058cָ֍֚֍֦֎ּ֞־ׂ֟֍ׁ֥ׅ\u058c֍", (byte)125, 70);
               break;
            case 1:
               f[0] = NLoginCore_027.A("ưǫǪǬǖǦƳǸǹǯƸǝǇȀƷǑǺǂǿǢǮǏǌǍ", (byte)125, 65);
               f[1] = NLoginCore_223.B("ǜƪǐǅǞǗǑǱǴǬǝǪǜǵǝǮǟƾǜǃǧȅǌǍ", (byte)125, 66);
               f[2] = NLoginCore_384.F("֠\u058c։տ֨փ֒ֆյֱ֙֓֊֔ջ\u058cְ֙֜֔֗ևֱׇֹֽ֪օ\u058cׅ֠\u05ca", (byte)125, 70);
               f[3] = NLoginCore_223.C("ջձջ֩է֧ֆ֠֊լֆ֣ժս֦զ\u058cղ֣֓նָտր", (byte)125, 67);
               f[4] = NLoginCore_223.D("ռ֘֙֘֓վ֣֠րշ֦ոխ֦֮֝֔֕խո\u0590֒տր", (byte)125, 68);
               f[5] = NLoginCore_138.D("մյւուփք֊յ֠փմ", (byte)125, 68);
               f[6] = NLoginCore_446.B("ǮǴǈǬǎǘǯǈưǵƳǳǓƱǟǟǼǎȂȂǮǟǌǍ", (byte)125, 66);
               f[7] = NLoginCore_127.C("֏՝փո֑֊ք֤֧֟\u0590֦վֈִ֍֮֍ִևֵ֦ջ֎֛֮֘տ֊մַվ", (byte)125, 67);
               f[8] = NLoginCore_076.A("ǠǌǉƿǨǃǒǆƵǱǚǻǚǞǷǢǰǲǀȄǢǠȁƻƼȊǦǛǻǫȁǑ", (byte)125, 65);
               f[9] = NLoginCore_173.B("ǠǌǉƿǨǃǒǆƵǱǛǸǊƹǻǻǱǾƶǻƾǞǑǆǈǗǪǶǪǜǹǽ", (byte)125, 66);
               f[10] = NLoginCore_559.B("ǪǩǴǕǮǳǍǆƳǹǮǋǐǘƿǞƺǌǡǴǟǵǌǍ", (byte)125, 66);
               f[11] = NLoginCore_141.C("֓տռղ֛նօչը֤֎֍ւհ։ս֕֞֎ֲ֘պ֛֎ն֬֔֝֊ֳִֺ", (byte)125, 67);
               f[12] = NLoginCore_241.C("ր֢մռօ֣ցնրժծմ", (byte)125, 67);
               f[13] = NLoginCore_241.A("ǠǌǉƿǨǃǒǆƵǱǛǰǌǸǖǹǑƾǶȂǥǿǜȅǘǪȌȃǇȀǭǼ", (byte)125, 65);
               f[14] = NLoginCore_004.D("֒֕պ֢աչզբ֢ռ֥֡ր֊֥ֆտֶնղց֨տր", (byte)125, 68);
               f[15] = NLoginCore_232.A("ǠǌǉƿǨǃǒǆƵǱǘǗǮƿƽǮǷǿǷǢǐǸǾǅǞǿȅǈǌǊȍǃ", (byte)125, 65);
               f[16] = NLoginCore_575.E("փ֦֨֒յֱևղք։֔ց", (byte)125, 69);
               f[17] = NLoginCore_575.B("ƲǒǌƿưƴƶƳǙƸƷǁ", (byte)125, 66);
               f[18] = NLoginCore_451.C("֧֡ջ֟ց\u058b֢ջգ֨ը֝խ֤֍հֶ֝ֆ֖֥֒տր", (byte)125, 67);
               f[19] = NLoginCore_433.F("ֲքօլֳ\u058bֱ֪֘\u058c\u0590ֶ֧սռ։մֱ֤֍ּչփ֛֊֧։֞\u05cf׆׃ֲ֭\u05ca\u05cfִ֤֫֕ב֥טג֡", (byte)125, 70);
               f[20] = NLoginCore_433.B("ƺƳƳǮǎƯǗǫǰǖƻǁ", (byte)125, 66);
               f[21] = NLoginCore_384.A("ǟǢǇǯƮǆƳƯǯǉǱǳǋƸƶǎǑǙƺƽǛȅǌǍ", (byte)125, 65);
               f[22] = NLoginCore_232.F("ֲճֶ֔ը֎րօ֛֙ջց", (byte)125, 70);
               f[23] = NLoginCore_384.B("ǪǋǀǮǖǯǥǩƶǲƲǏƺǽƹǷǣƻǢȆǒǧǠǲǃǊǈǃǬȋǿȃȃǯǔǌȗǓǮǐǧǷǗǡ", (byte)125, 66);
               f[24] = NLoginCore_183.C("ղրՠ֞եը֣֙ցժ\u058bֱ֝֨֒ղև֔ֈֹիָտր", (byte)125, 67);
               f[25] = NLoginCore_387.D("֎ա՞֞ֈթ֣փթ֣֩խ֤֪֑֯֞կ֧֖֯֒տր", (byte)125, 68);
               f[26] = NLoginCore_324.C("\u0557մա֦ևս֫օֆ֛֣֠֎վջկ֧ճք֥ւ֒տր", (byte)125, 67);
               f[27] = NLoginCore_183.E("֨ծִ֯\u0590ֈ\u058cָ֍֚֍մ֮֩֜־֎ִֵ֮֡֕\u058c֍", (byte)125, 69);
               break;
            case 2:
               f[0] = NLoginCore_173.C("գւ֧֤֢ժբչ֧շ\u058b֍ժ\u058bֆռ֟֯֫ճցֹ֤֯օ֙׀ׁ֭պִ֞", (byte)125, 67);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_223.F("ցִ֥֣֑֯ծ֥մօ֗֨֍ֽ֭֯֯֏ռֹֹׂׄ֙֜֨ւ֜\u05cfֺׁ֨", (byte)125, 70);
         }
      }
   }

   static {
      b();
   }

   public NLoginCore_238(NLoginType_008 var1) {
      super(var1, NLoginCore_479.j, a(e, p ^ q), a(y & z, ab), (boolean)(var1.b().a() == NLoginCore_419.b ? al : ao));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_238.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.E("\u0557չջ՛տ֖֞֬֘է֥֛֣֩լְֲֳ֑֪֪տ", (byte)115, 69), NLoginCore_238.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.C("ձվսՀրռշր\u058bպՇօ։ւօ\u058bՍ\u08e2ࣖࣥࣈࣘࣇࣅࣆࣝࣃ࣮դ", (byte)115, 67) + var1 + NLoginCore_138.E("թ", (byte)115, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void b(ResultSet var1) {
      UUID var2 = NLoginCore_432.c(var1.getString(a(eu, ev)));
      OfflinePlayer var3 = this.m.b().<Server>c().getOfflinePlayer(var2);
      this.r = var3.getName();
      String var4 = var1.getString(a(ex, ez ^ fc));
      byte[] var5 = Base64.getDecoder().decode(var1.getString(a(fd & fe, ff)));
      String var6 = Base64.getEncoder().withoutPadding().encodeToString(var5);
      String var10000 = a(fh & fl, fn);
      Object[] var10001 = new Object[fp];
      var10001[fr] = a(fs, ft ^ fu);
      var10001[fv] = fw;
      var10001[fz] = gc;
      var10001[gd] = gg;
      var10001[gh] = gj;
      var10001[gm] = var6;
      var10001[gn] = var4;
      String var7 = String.format(var10000, var10001);
      String var8 = var1.getString(a(gq, gr));
      String var9 = a(var1.getLong(a(gs & gt, gu)));
      long var10 = var1.getLong(a(gv, gx ^ ha));
      Consumer var12 = var3x -> {
         var3x.a(var10, var10);
         var3x.a().b(var8);
      };
      this.a(this.r, var7, var9, var2, var12);
   }
}
