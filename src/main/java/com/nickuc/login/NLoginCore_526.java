package com.nickuc.login;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_526 extends NLoginCore_098 {
   private static long bs = Long.reverse(8502796096475496448L);
   private static int hh = Integer.reverse(-1);
   private static long fi = Long.reverse(2291054160690583547L);
   private static int jo = Integer.reverse(-1);
   private static long iw = Long.reverse(8502796096475496448L);
   private static long bm = Long.reverse(2291054160690583547L);
   private static int gj = Integer.reverse(0);
   private static long el = Long.reverse(2291054160690583547L);
   private static long ha = Long.reverse(8502796096475496448L);
   private static long hp = Long.reverse(8502796096475496448L);
   private static int bf = 536870912 >>> 125 | 536870912 << ~125 + 1;
   private static int gs = Integer.reverse(939524096);
   private static int cm = (-1 >>> 47 | -1 << -47) & -1;
   private static long ge = Long.reverse(7623316119497250811L);
   private static int hg = Integer.reverse(2013265920);
   private static long hl = Long.reverse(7623316119497250811L);
   private static int dd = 65536 >>> 111 | 65536 << -111;
   private static long ik = Long.reverse(7623316119497250811L);
   private static int iq = 304 >>> 67 | 304 << -67;
   private static int dq = (6656 >>> 73 | 6656 << ~73 + 1) & -1;
   private static int fz = Integer.reverse(0);
   private static long ds = Long.reverse(2291054160690583547L);
   private static int jl = (172 >>> 226 | 172 << -226) & -1;
   private static int kf = Integer.reverse(0);
   private static int bu = Integer.reverse(1610612736);
   private static long ip = Long.reverse(8502796096475496448L);
   private static int dx = Integer.reverse(-1);
   private static int hm = Integer.reverse(67108864);
   private static long fu = Long.reverse(8502796096475496448L);
   private static int fr = Integer.reverse(-402653184);
   private static long iv = Long.reverse(2291054160690583547L);
   private static int dw = (28 >>> 129 | 28 << ~129 + 1) & -1;
   private static long io = Long.reverse(2291054160690583547L);
   private static long is = Long.reverse(7623316119497250811L);
   private static long fn = Long.reverse(7623316119497250811L);
   private static int je = (164 >>> 226 | 164 << ~226 + 1) & -1;
   private static int bl = (1073741824 >>> 156 | 1073741824 << ~156 + 1) & -1;
   private static long jj = Long.reverse(2291054160690583547L);
   private static long go = Long.reverse(7623316119497250811L);
   private static long ab = Long.reverse(7623316119497250811L);
   private static int cy = (327680 >>> 15 | 327680 << ~15 + 1) & -1;
   private static long cd = Long.reverse(8502796096475496448L);
   private static int kh = (3008 >>> 198 | 3008 << -198) & -1;
   private static int gh = Integer.reverse(1476395008);
   private static int ch = Integer.reverse(-1);
   private static int e = Integer.reverse(0);
   private static long eo = Long.reverse(8502796096475496448L);
   private static long kd = Long.reverse(7623316119497250811L);
   private static int ic = (557056 >>> 46 | 557056 << -46) & -1;
   private static long ee = Long.reverse(8502796096475496448L);
   private static int fp = (369098752 >>> 216 | 369098752 << -216) & -1;
   private static int jt = 5632 >>> 199 | 5632 << ~199 + 1;
   private static int ji = (5505024 >>> 17 | 5505024 << ~17 + 1) & -1;
   private static int gq = Integer.reverse(Integer.MIN_VALUE);
   private static int fv = Integer.reverse(402653184);
   private static int ii = (-2147483644 >>> 93 | -2147483644 << ~93 + 1) & -1;
   private static int cr = 150994944 >>> 152 | 150994944 << -152;
   private static long q = Long.reverse(8502796096475496448L);
   private static int fw = -1 >>> 167 | -1 << -167;
   private static long ft = Long.reverse(2291054160690583547L);
   private static long hi = Long.reverse(7623316119497250811L);
   private static long ez = Long.reverse(7623316119497250811L);
   private static int eq = -2013265920 >>> 123 | -2013265920 << ~123 + 1;
   private static int hj = Integer.reverse(-134217728);
   private static long bv = Long.reverse(2291054160690583547L);
   private static int gm = Integer.reverse(-671088640);
   private static int bd = Integer.reverse(0);
   private static long fc = Long.reverse(2291054160690583547L);
   private static long gx = Long.reverse(2291054160690583547L);
   private static long by = Long.reverse(8502796096475496448L);
   private static int kg = Integer.reverse(Integer.MIN_VALUE);
   private static int ix = (20480 >>> 73 | 20480 << ~73 + 1) & -1;
   private static int ie = Integer.reverse(-1006632960);
   private static int gc = -134215681 >>> 251 | -134215681 << -251;
   private static int al = (2048 >>> 10 | 2048 << -10) & -1;
   private static long eb = Long.reverse(2291054160690583547L);
   private static int bz = Integer.reverse(-536870912);
   private static long jk = Long.reverse(8502796096475496448L);
   private static int er = Integer.reverse(-1);
   private static long gi = Long.reverse(7623316119497250811L);
   private static long df = Long.reverse(7623316119497250811L);
   private static int cj = Integer.reverse(268435456);
   private static long dp = Long.reverse(8502796096475496448L);
   private static int z = Integer.reverse(-1);
   private static int bg = 201326592 >>> 218 | 201326592 << ~218 + 1;
   private static int gv = Integer.reverse(1073741824);
   private static long bo = Long.reverse(8502796096475496448L);
   private static int it = (327155712 >>> 55 | 327155712 << ~55 + 1) & -1;
   private static long cn = Long.reverse(7623316119497250811L);
   private static long jq = Long.reverse(7623316119497250811L);
   private static int gd = Integer.reverse(-1744830464);
   private static int dz = Integer.reverse(-268435456);
   private static long at = Long.reverse(7623316119497250811L);
   private static int gg = Integer.reverse(-1);
   private static int ce = Integer.reverse(0);
   private static int ao = Integer.reverse(-1);
   private static long dy = Long.reverse(7623316119497250811L);
   private static long fq = Long.reverse(7623316119497250811L);
   private static long ig = Long.reverse(7623316119497250811L);
   private static long dm = Long.reverse(2291054160690583547L);
   private static long o;
   private static int bp = (10 >>> 161 | 10 << -161) & -1;
   private static int ek = Integer.reverse(134217728);
   private static long ca = Long.reverse(2291054160690583547L);
   private static long es = Long.reverse(7623316119497250811L);
   private static int dk = Integer.reverse(805306368);
   private static int hy = (16896 >>> 169 | 16896 << ~169 + 1) & -1;
   private static int de = (46137344 >>> 182 | 46137344 << ~182 + 1) & -1;
   private static long jv = Long.reverse(8502796096475496448L);
   private static long gu = Long.reverse(7623316119497250811L);
   private static long p = Long.reverse(2291054160690583547L);
   private static int gw = Integer.reverse(-1207959552);
   private static int im = (606208 >>> 14 | 606208 << -14) & -1;
   private static long id = Long.reverse(7623316119497250811L);
   private static long fj = Long.reverse(8502796096475496448L);
   private static long jc = Long.reverse(8502796096475496448L);
   private static int ex = (-1 >>> 231 | -1 << -231) & -1;
   private static long cz = Long.reverse(2291054160690583547L);
   private static long hn = Long.reverse(2291054160690583547L);
   private static int ka = Integer.reverse(-1275068416);
   private static int ki = 6016 >>> 135 | 6016 << ~135 + 1;
   private static int dh = (12288 >>> 76 | 12288 << -76) & -1;
   private static String[] e = new String[kh];
   private static int co = Integer.reverse(0);
   private static long ct = Long.reverse(7623316119497250811L);
   private static long br = Long.reverse(2291054160690583547L);
   private static int fa = (152 >>> 99 | 152 << ~99 + 1) & -1;
   private static long iz = Long.reverse(2291054160690583547L);
   private static int cv = (33554432 >>> 217 | 33554432 << -217) & -1;
   private static int eu = Integer.reverse(1207959552);
   private static int ir = -1 >>> 198 | -1 << -198;
   private static int bi = -1 >>> 86 | -1 << -86;
   private static int kc = (96468992 >>> 213 | 96468992 << ~213 + 1) & -1;
   private static long bk = Long.reverse(7623316119497250811L);
   private static int fl = Integer.reverse(-1476395008);
   private static int y = 256 >>> 136 | 256 << -136;
   private static int ke = (32 >>> 132 | 32 << ~132 + 1) & -1;
   private static int fh = Integer.reverse(671088640);
   private static long fx = Long.reverse(7623316119497250811L);
   private static long ju = Long.reverse(2291054160690583547L);
   private static String[] f = new String[ki];
   private static long dv = Long.reverse(8502796096475496448L);
   private static int cg = 8388608 >>> 215 | 8388608 << ~215 + 1;
   private static long ff = Long.reverse(8502796096475496448L);
   private static long jg = Long.reverse(7623316119497250811L);
   private static long kb = Long.reverse(7623316119497250811L);
   private static long hz = Long.reverse(7623316119497250811L);
   private static long dc = Long.reverse(8502796096475496448L);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(hg & hh, hi));
      byte[] var2 = var1.getBytes(a(hj, hl));
      if (var2.length != 0) {
         String var3;
         try {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var2));

            label49: {
               try {
                  int var5 = Math.toIntExact(var4.readLong());
                  NLoginCore_115 var6 = NLoginCore_115.a(var5);
                  if (var6 != null) {
                     switch (NLoginCore_082.o[var6.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                           var3 = new String(a(var4, var4.available()), StandardCharsets.UTF_8);
                           break label49;
                        case 5:
                        case 6:
                           String var15 = new String(a(var4, var4.available()), StandardCharsets.UTF_8);
                           var3 = a(hy, hz) + var6.cp + a(ic, id) + var15;
                           break label49;
                        case 7:
                        case 8:
                           String var14 = var4.readUTF();
                           String var8 = var4.readUTF();
                           var3 = a(ie, ig) + var6.cp + a(ii, ik) + var14 + a(im, io ^ ip) + var8;
                           break label49;
                        case 9:
                        case 10:
                           var4.reset();
                           String var7 = Base64.getEncoder().withoutPadding().encodeToString(a(var4, var4.available()));
                           var3 = a(iq & ir, is) + var7;
                           break label49;
                        default:
                           throw new UnsupportedOperationException(a(it, iv ^ iw) + var6 + a(ix, iz ^ jc));
                     }
                  }

                  this.e(this.r, var2.length + a(hm, hn ^ hp), Integer.toString(var5));
               } catch (Throwable var10) {
                  try {
                     var4.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }

                  throw var10;
               }

               var4.close();
               return;
            }

            var4.close();
         } catch (IOException var11) {
            throw new IllegalArgumentException(a(je, jg) + this.r);
         }

         boolean var12 = var1.getBoolean(a(ji, jj ^ jk));
         UUID var13 = NLoginCore_432.c(var1.getString(a(jl & jo, jq)));
         if (var12) {
            this.a(this.r, var3, null, var13, null);
         } else {
            this.a(this.r, var3, null, var13);
         }
      }
   }

   @Override
   protected NLoginCore_219 a(String var1) {
      NLoginCore_219 var2 = new NLoginCore_219(var1, new File(this.b() + File.separator + a(al & ao, at)), (boolean)bd);
      var2.a((boolean)bf);
      return var2;
   }

   public NLoginCore_526(NLoginType_008 var1) {
      super(var1, NLoginCore_479.h, a(e, p ^ q), a(y & z, ab));
   }

   public static byte[] a(InputStream var0, int var1) {
      byte[] var2 = new byte[var1];
      int var3 = var0.read(var2);
      if (var3 != var1) {
         throw new IllegalArgumentException(a(jt, ju ^ jv) + var1 + a(ka, kb) + var3);
      } else {
         return var2;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 110L;
      var1 ^= 3606981043438543869L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(34 + 34),
                     (byte)(48 + 21),
                     (byte)(46 + 37),
                     (byte)(22 + 25),
                     (byte)(57 + 10),
                     (byte)(49 + 17),
                     (byte)(38 + 29),
                     (byte)(22 + 25),
                     (byte)(5 + 75),
                     (byte)(31 + 44),
                     (byte)(3 + 64),
                     (byte)(62 + 21),
                     (byte)(29 + 24),
                     (byte)(33 + 47),
                     97,
                     100,
                     (byte)(15 + 85),
                     (byte)(93 + 12),
                     (byte)(102 + 8),
                     (byte)(86 + 17)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.D("шѕєЗїѓюїѢёОќѠљќѢФ\u07b6ި\u07b8\u07bd\u07b7\u07b2߅߆ް", (byte)16, 68));
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

   private static void b() {
      o = -2312276769397353480L;
      long var0 = o ^ 3606981043438543869L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               69,
               (byte)(17 + 66),
               (byte)(9 + 38),
               (byte)(11 + 56),
               (byte)(5 + 61),
               (byte)(44 + 23),
               (byte)(42 + 5),
               (byte)(22 + 58),
               75,
               (byte)(46 + 21),
               (byte)(40 + 43),
               (byte)(8 + 45),
               (byte)(11 + 69),
               (byte)(14 + 83),
               (byte)(33 + 67),
               (byte)(16 + 84),
               (byte)(104 + 1),
               (byte)(37 + 73),
               (byte)(50 + 53)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_076.D("ѰҞѯѭѾѸљѝѻҐѶѴҕҚѽѣҭѦҍҜ҄ҊѷѸ", (byte)37, 68);
               f[1] = NLoginCore_223.E("ՍԤՏԯՐՑՕ՝ԝԴԣ՟ՀԴեԠ\u0557ՙխծՍԽԮԾԻԮՏաէՃԵՃ", (byte)37, 69);
               f[2] = NLoginCore_138.E("ՑՐԪ՜ԮԘՈԗԻԡԼԩ", (byte)37, 69);
               f[3] = NLoginCore_324.B("İĒÿľľĽĿûĻĖěĞČāęġĚčēŐķŕĜĝ", (byte)37, 66);
               f[4] = NLoginCore_427.F("ԫԨԓԴՓԳԛԱՁԚՖԩ", (byte)37, 70);
               f[5] = NLoginCore_324.C("ѲѲҀѴѰѸѽѷџҕғҢ҇҇ѻѢҍҭҡѼ҂ҊѷѸ", (byte)37, 67);
               f[6] = NLoginCore_183.C("ѕҋѾћғѻҡѷќѦѲѨҥҘ҂҄҆ҝҌ҃҅ҰѷѸ", (byte)37, 67);
               f[7] = NLoginCore_110.C("ҔғѭҟѱћҋњѾѤѿѬ", (byte)37, 67);
               f[8] = NLoginCore_241.B("ēĐûĜĻěăęĩĂľđ", (byte)37, 66);
               f[9] = NLoginCore_559.A("úĀĭýŁĒĲıĠĦĠđ", (byte)37, 65);
               f[10] = NLoginCore_091.A("ĳļûĵĻĕĜĦĕēłđ", (byte)37, 65);
               f[11] = NLoginCore_127.E("Ը\u0530ՋԻԩԴԻաԘՕԼԴԺՓՑդՄ՟խՂՍխԴԵ", (byte)37, 69);
               f[12] = NLoginCore_446.C("ѵҊҚҗѡҞґҌѽҀ҇Ѭ", (byte)37, 67);
               f[13] = NLoginCore_092.E("՚ԫԯԴ՝ՋԨՍ՝ԸԚԻՅՔԥԿեՃԴԷԮխԴԵ", (byte)37, 69);
               f[14] = NLoginCore_223.A("ĿłłĘĺģıľĊĔĺđ", (byte)37, 65);
               f[15] = NLoginCore_453.D("ҋѭњҙҙҘҚіҖѱѳѵѷҒѾѺҤѹҜ҄ҁ҆Ҫ҂҃ѨҵҎҮңҦҏ", (byte)37, 68);
               f[16] = NLoginCore_575.F("ԮՎԤԲԬ՛ՊԩԶԾԼ՜ԡՔՕՙթՆՍԤՃԷԴԵ", (byte)37, 70);
               f[17] = NLoginCore_138.E("ՈԪԗՖՖՕ\u0557ԓՓԮ\u0530ԭՆԷԣ՟ԜեՙԟԥկԹ՛ՀՓխըժԩժ\u0557", (byte)37, 69);
               f[18] = NLoginCore_521.B("ĹÿįĔĎāĿĄĤġĜđ", (byte)37, 66);
               f[19] = NLoginCore_387.C("ҋѭњҙҙҘҚіҖѱѵҙѤҔҬҩ҄ѬѹҤ҆ҎҀѪҊҫҭ҇ѵѵҫҔ", (byte)37, 67);
               f[20] = NLoginCore_138.E("ԥՉՆԜԜ\u0558ԹԹ՜\u0530ԺՓզԙԱԠՕԥՕՋ\u0557խԴԵ", (byte)37, 69);
               f[21] = NLoginCore_183.D("ҋѭњҙҙҘҚіҖѱѵҠҪҥ҇Ҕ҈ҦѼҬҪҲҤҪѬҌ҃ҕҳҐѸґ", (byte)37, 68);
               f[22] = NLoginCore_553.F("\u0530ՎՅԥՈՙԨԘՍԺՍ\u0558ԠՖՔթԵԨխէՀխԴԵ", (byte)37, 70);
               f[23] = NLoginCore_324.F("ԥ\u0530ԺԲԭՏԨՒ\u0558՛՛ԥԸԧԷԼՈբԞխկ՝ԴԵ", (byte)37, 70);
               f[24] = NLoginCore_446.D("ҋѭњҙҙҘҚіҖѱѶҨѶҁҥқѿѻҊѿѩѺѷѸ", (byte)37, 68);
               f[25] = NLoginCore_110.F("ՖԥԹԼԷՙԝԓՙգՀԩ", (byte)37, 70);
               f[26] = NLoginCore_091.E("ԒԘՅԕՙԪՊՉԸԾԸԩ", (byte)37, 69);
               f[27] = NLoginCore_241.E("ՋՔԓՍՓԭԴԾԭԫ՚ԩ", (byte)37, 69);
               f[28] = NLoginCore_183.E("Ը\u0530ՋԻԩԴԻաԘՕԼԴԺՓՑդՄ՟խՂՍխԴԵ", (byte)37, 69);
               f[29] = NLoginCore_173.B("ĴĒĜĕĲęĈňľłċŃŉĉŌŎĐħĲĥģňħőİīļĩŚřŚōįšġĳĺŤĠťĨŊňı", (byte)37, 66);
               f[30] = NLoginCore_530.C("ѬҐҎѸѯѫ҂џў҇ҕѬ", (byte)37, 67);
               f[31] = NLoginCore_183.B("čıĮĄĄŀġġńĘĢĻŎāęĈĽčĽĳĿŕĜĝ", (byte)37, 66);
               f[32] = NLoginCore_553.F("ՏԤԬԽ՜ՈԫԳԹՁԟԩ", (byte)37, 70);
               f[33] = NLoginCore_138.D("ҋѯќјѷѶќғҟ҂ѳѬ", (byte)37, 68);
               f[34] = NLoginCore_141.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
               f[35] = NLoginCore_575.E("ՈԬԙԕԴԳԙՐ՜Կ\u0530ԩ", (byte)37, 69);
               f[36] = NLoginCore_397.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
               f[37] = NLoginCore_027.A("İĔāýĜěāĸńħĘđ", (byte)37, 65);
               f[38] = NLoginCore_433.A("įĒýĂĒĺĝēĳĺĺģĞłňōĎđČĪĈįĜĝ", (byte)37, 65);
               f[39] = NLoginCore_004.C("ѬѼҐҗҎѠ҄ҟѹѷ҇ңҀѩҌѵңҞҋѨҫҬ҂ҡҴңѩ҅ѯѵҗғүҬғҘѷҏӀҺ҅҃ґҀҝҀ҄ҙӄҚқҟҧӐҗҘ", (byte)37, 67);
               f[40] = NLoginCore_223.C("ѮќѳѲҍѫѡҌңўѦѬ", (byte)37, 67);
               f[41] = NLoginCore_127.C("ѺҗҏҚҞҚҒѝҟѾҗџ҃ѽѡҀѬҦҚҟѰҟѥ҅ҍѬҨҲҪҮѲҵҘҺѸҮҊҺҕҙҗѼұҵҝӄҦҝҤҮҷҤҽӀҗҘ", (byte)37, 67);
               f[42] = NLoginCore_201.A("ûĹĸĞāŀĿĜŋĩĠđ", (byte)37, 65);
               f[43] = NLoginCore_110.F("ՑԤ\u0557ՖԿԑ՟ԯԠԛԬԩ", (byte)37, 70);
               f[44] = NLoginCore_110.C("ғҋёҖѯҜ҃ѼѾ҆ҨѺҔѺҦ҄ҟѹҰҢҰҊѷѸ", (byte)37, 67);
               f[45] = NLoginCore_004.E("ՆԕՖ՚՝՝ԞԴ՜ԡբ՚զԤԞՁԻԼխՌԺ՞Ԧաղ՞Վծզի\u0530ԲիՈՈՒՑղՈՖւոՍ՟ՅյՃցՁ\u0558աՍլէՔՕ", (byte)37, 69);
               f[46] = NLoginCore_110.E("ԨՏԜ՝ԞԵՐՎՖ\u0530Ԭԩ", (byte)37, 69);
               break;
            case 1:
               f[0] = NLoginCore_183.C("ѰҞѯѭѾѸљѝѻҐѳўҥҡ҄ѪҮҨҞѯѼҠѷѸ", (byte)37, 67);
               f[1] = NLoginCore_559.B("ĵČķėĸĹĽŅąĜċŇĨĜōĈĿŁŕŖĵĦœŗĸħŝĵĿŒĜĜĪęĚŚŤĵıĶħŢŌı", (byte)37, 66);
               f[2] = NLoginCore_183.B("ěĖĎģąĔĖĸĀģħĤōĉĢŃďŃīĶčğĜĝ", (byte)37, 66);
               f[3] = NLoginCore_201.C("ҋѭњҙҙҘҚіҖѱѵҚґѾҌқѼҌҩ҇ѧѲѱҴңҩҕѷҵ҇ҙҸ", (byte)37, 67);
               f[4] = NLoginCore_446.D("ґҝҏњҕҏҙѰѶѰҝѬ", (byte)37, 68);
               f[5] = NLoginCore_241.D("ѲѲҀѴѰѸѽѷџҕҔҕѷҁѝѼҪѩѽѼҧҠѷѸ", (byte)37, 68);
               f[6] = NLoginCore_471.B("úİģĀĸĠņĜāċėġľŊĻŀņĉĩĵğŅĜĝ", (byte)37, 66);
               f[7] = NLoginCore_433.B("ĹĖĬďĳģĨāķĝĦěąċĩĽģĩńĤœŕĜĝ", (byte)37, 66);
               f[8] = NLoginCore_183.B("ĐûļĕħĳĳđēāĔđ", (byte)37, 66);
               f[9] = NLoginCore_173.D("қҎҊҚҞҗ҂ґҤҚѾҢѤҚѺҝҎҭҊ҄ѨѺѷѸ", (byte)37, 68);
               f[10] = NLoginCore_446.A("āėĬąĐđĞĺĖĳĆōŊčŁīĢĭĨģĞğĜĝ", (byte)37, 65);
               f[11] = NLoginCore_446.A("ĠĘĳģđĜģŉĀĽħćĸŀĮŊŌħēłŇğĜĝ", (byte)37, 65);
               f[12] = NLoginCore_575.B("čěČņĳĹĐęŃęĠđ", (byte)37, 66);
               f[13] = NLoginCore_397.C("ҝѮѲѷҠҎѫҐҠѻѧѼҗѵѻ҇ѣѬҀҫҜҊѷѸ", (byte)37, 67);
               f[14] = NLoginCore_451.A("ĽĴĔĿįăĲĕŀěŊđ", (byte)37, 65);
               f[15] = NLoginCore_451.A("İĒÿľľĽĿûĻĖĘĚĜķģğŉĞŁĩĦĨŅĦĕĲňĽōľŎŋ", (byte)37, 65);
               f[16] = NLoginCore_091.F("ԮՎԤԲԬ՛ՊԩԶԾԿԞԣԸԚՙՠԫ՟ԬՄ՝ԴԵ", (byte)37, 70);
               f[17] = NLoginCore_004.B("İĒÿľľĽĿûĻĖĘĕĮğċŇĄōŁćčĔĩđłĹĪŉŐļŋĭ", (byte)37, 66);
               f[18] = NLoginCore_451.B("ŀŃČėŁĕúĆģāĚłĻļĿıĈĢĵġŏğĜĝ", (byte)37, 66);
               f[19] = NLoginCore_241.A("İĒÿľľĽĿûĻĖĚľĉĹőŎĩđĞŉīķŇŖŅŋŋňĭėĚś", (byte)37, 65);
               f[20] = NLoginCore_384.A("čıĮĄĄŀġġńĘĠęĝąŁŎĄŐŃĬďŅĜĝ", (byte)37, 65);
               f[21] = NLoginCore_453.F("ՈԪԗՖՖՕ\u0557ԓՓԮԲ՝էբՄՑՅգԹթէԡԢԺԼՋՑԾՁմըը", (byte)37, 70);
               f[22] = NLoginCore_027.A("ĘĶĭčİŁĐĀĵĢĴĞĎċĿĞŇĪĥĥİŅĜĝ", (byte)37, 65);
               f[23] = NLoginCore_384.A("čĘĢĚĕķĐĺŀŃŃŎġįįōĮĳĎďĤĮĢņįĭŘĝňŏĨĬ", (byte)37, 65);
               f[24] = NLoginCore_453.B("İĒÿľľĽĿûĻĖęĸąŀĞĉŏİčďĨŕĜĝ", (byte)37, 66);
               f[25] = NLoginCore_173.A("ĭĔĐ÷ėĕėĆĿĹĠđ", (byte)37, 65);
               f[26] = NLoginCore_183.C("ѵҊўѹѪѹҐѽҒҎ҃ѳѡғѨѺҮҫѸѨѮҠѷѸ", (byte)37, 67);
               f[27] = NLoginCore_397.A("ĕùúĜġĒłğĘĹňĠģĝĚŒĽŇľŎŖįĜĝ", (byte)37, 65);
               f[28] = NLoginCore_141.B("ĠĘĳģđĜģŉĀĽĤĿĦĦńĐĢĒĦĬľŅĜĝ", (byte)37, 66);
               f[29] = NLoginCore_397.D("ҏѭѷѰҍѴѣңҙҝѦҞҤѤҧҩѫ҂ҍҀѾң҂Ҭҋ҆җ҄ҵҴҵҨҩҕҺҹӁҼҮүѽӇѾҌ", (byte)37, 68);
               f[30] = NLoginCore_223.F("ԥԳԫ\u0530ՉԙՀԚՔաՁՂաԠ\u0557\u0557ՉԸ՛ՌՈԷԴԵ", (byte)37, 70);
               f[31] = NLoginCore_433.F("ԥՉՆԜԜ\u0558ԹԹ՜\u0530ԹԝԵ\u0557դԷՅԣՀՊ՛ՇԴԵ", (byte)37, 70);
               f[32] = NLoginCore_091.E("ՋՊԒԖԭՌԸՍՎՕՅ՞\u0558դՈԠԠԵգՊԮԷԴԵ", (byte)37, 69);
               f[33] = NLoginCore_241.F("ՐԹՆՒԘԻՏԷՊԹՒԩ", (byte)37, 70);
               f[34] = NLoginCore_575.E("ՎԱՆԱՓ՞ՑԠ՚ԾՀԩ", (byte)37, 69);
               f[35] = NLoginCore_092.E("ԴՙՓԲ\u0558ԻԺ\u0530ՁԶբԩ", (byte)37, 69);
               f[36] = NLoginCore_092.C("ѻѭѶњҗѝѕҝѺ҄ґѬ", (byte)37, 67);
               f[37] = NLoginCore_027.A("ĒĺĕĐăĜĩĽŉĄłđ", (byte)37, 65);
               f[38] = NLoginCore_127.A("įĒýĂĒĺĝēĳĺĻĮŊōįōŎĻĦēĭŕĜĝ", (byte)37, 65);
               f[39] = NLoginCore_232.A("đġĵļĳąĩńĞĜĬňĥĎıĚňŃİčŐőħņřňĎĪĔĚļĸŔőĸĽĜĴťşĪĨķĺņŪŮűŁĿĿŲŕŀĮĶŒňųŚŦŖœƀ", (byte)37, 65);
               f[40] = NLoginCore_446.C("ѶҝіѸѶқҁҗғѳҕѬ", (byte)37, 67);
               f[41] = NLoginCore_027.F("ԷՔՌ\u0557՛\u0557ՏԚ՜ԻՔԜՀԺԞԽԩգ\u0557՜ԭ՜ԢՂՊԩեկէիԯղՕշԵիՇշՒՖՔԹկփցՀ՜բՉեզռկէՔՕ", (byte)37, 70);
               f[42] = NLoginCore_201.B("ùăĒýĜĨĿĂĨľņėĹĚŏġőĩğēŖŅĜĝ", (byte)37, 66);
               f[43] = NLoginCore_427.A("ĮăüĞĴħĜăļęĔđ", (byte)37, 65);
               f[44] = NLoginCore_092.D("ғҋёҖѯҜ҃ѼѾ҆ҥѼ҅җ҈ѤңҙѸңѮѪҩѼҟҪҨ҃ҕҳҍѵ", (byte)37, 68);
               f[45] = NLoginCore_559.D("҉јҙҝҠҠѡѷҟѤҥҝҩѧѡ҄ѾѿҰҏѽҡѩҤҵҡґұҩҮѳѵҮҋҋҕҔҵҋҙӅһҒҔѿҖҙӀҾӎӄҪӆӐҗҘ", (byte)37, 68);
               f[46] = NLoginCore_521.A("ûŃēĞĐĸħĺĦĩŊđ", (byte)37, 65);
               break;
            case 2:
               f[0] = NLoginCore_521.F("ԨԲՕ\u0530\u0558ԪՀԾԜՂՁ՞՛ԣԣՇ՚ըԹԷ՚ԷԴԵ", (byte)37, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_387.C("ѯѦѬҙҏҁҕѾѮѰҢѶҡҕҋ҈ѻѧ҄ѫ҇ҰѷѸ", (byte)37, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_526.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.E("ԮՐՒԲՖյխփկԾռղրպՃը֊։ցևցՖ", (byte)74, 69), NLoginCore_526.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_451.F("թնյԸոմկոփղԿսցպսփՅࣗࣉ࣓ࣦ࣑ࣙࣞࣘࣧ՚", (byte)74, 70) + var1 + NLoginCore_427.C("Ӎ", (byte)74, 67) + var2.toString(), var4);
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(bg & bi, bk), a(bl, bm ^ bo)).toLowerCase(Locale.ROOT);
      File var3 = new File(this.b(), a(bp, br ^ bs));
      NLoginCore_219 var4 = new NLoginCore_219(a(bu, bv ^ by), new File(this.b() + File.separator + a(bz, ca ^ cd)), (boolean)ce);
      var4.a((boolean)cg);
      int var6 = ch;
      switch (var2.hashCode()) {
         case -2105481388:
            if (var2.equals(a(de, df))) {
               var6 = dh;
            }
            break;
         case 3274:
            if (var2.equals(a(cj & cm, cn))) {
               var6 = co;
            }
            break;
         case 104382626:
            if (var2.equals(a(cr, ct))) {
               var6 = cv;
            }
            break;
         case 839186932:
            if (var2.equals(a(cy, cz ^ dc))) {
               var6 = dd;
            }
      }

      switch (var6) {
         case 0:
            this.d = H2DatabaseProvider.a(
               this.m,
               NLoginCore_282.d,
               new File(var3, a(dk, dm ^ dp) + File.separator + a(dq, ds ^ dv)),
               new Properties(),
               a(dw & dx, dy),
               null
            );
            return;
         case 1:
         case 2:
         case 3:
            String var7 = var1.a(a(dz, eb ^ ee), a(ek, el ^ eo));
            String var8 = var1.a(a(eq & er, es), a(eu & ex, ez));
            String var9 = var1.a(a(fa, fc ^ ff), a(fh, fi ^ fj));
            String var10 = var1.a(a(fl, fn), a(fp, fq));
            List var11 = var4.k(a(fr, ft ^ fu));
            int var12 = var1.a(a(fv & fw, fx), fz);
            if (var12 > 0 && var12 < gc) {
               var7 = var7 + a(gd, ge) + var12;
            }

            Properties var13 = new Properties();
            var11.forEach(var1x -> {
               String[] var2x = var1x.split(a(kc, kd));
               if (var2x.length == ke) {
                  var13.setProperty(var2x[kf], var2x[kg]);
               }
            });
            int var15 = gg;
            switch (var2.hashCode()) {
               case -2105481388:
                  if (var2.equals(a(gs, gu))) {
                     var15 = gv;
                  }
                  break;
               case 104382626:
                  if (var2.equals(a(gh, gi))) {
                     var15 = gj;
                  }
                  break;
               case 839186932:
                  if (var2.equals(a(gm, go))) {
                     var15 = gq;
                  }
            }

            switch (var15) {
               case 0:
                  this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var7, var10, var8, var9, var13, NLoginCore_036.d.i()));
                  return;
               case 1:
                  this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(var7, var10, var8, var9, var13, NLoginCore_036.c.i()));
                  return;
               case 2:
                  this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(var7, var10, var8, var9, var13, NLoginCore_036.e.i()));
                  return;
               default:
                  return;
            }
         default:
            throw new UnsupportedOperationException(a(gw, gx ^ ha) + var2);
      }
   }
}
