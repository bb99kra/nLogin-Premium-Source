package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.lib.bcrypt.BCrypt.Result;
import com.nickuc.login.lib.bcrypt.BCrypt.Version;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_113 implements NLoginInterface_037 {
   private static int cz = Integer.reverse(67108864);
   private static long cq = Long.reverse(-8039961209861159291L);
   private static long h = Long.reverse(-8472306774088726907L);
   private static long bx = Long.reverse(-8039961209861159291L);
   private static long ax = Long.reverse(1873497444986126336L);
   private static int cu = 245760 >>> 77 | 245760 << -77;
   private static long ar = Long.reverse(-8039961209861159291L);
   private static int cr = Integer.reverse(-1207959552);
   private static long y = Long.reverse(-8472306774088726907L);
   private static int ai = 0 >>> 240 | 0 << ~240 + 1;
   private static long c;
   private static long bf = Long.reverse(-8472306774088726907L);
   private static int av = (192 >>> 68 | 192 << -68) & -1;
   private static long al = Long.reverse(-8039961209861159291L);
   private static int bh = Integer.reverse(134217728);
   private static long ct = Long.reverse(1873497444986126336L);
   private static long z = Long.reverse(1873497444986126336L);
   private static long cj = Long.reverse(-8039961209861159291L);
   private static int e = (8192 >>> 45 | 8192 << -45) & -1;
   private static int dc = -1 >>> 175 | -1 << -175;
   private static int t = Integer.reverse(402653184);
   private static int cm = (1728 >>> 102 | 1728 << -102) & -1;
   private static int v = (-1 >>> 135 | -1 << ~135 + 1) & -1;
   private static long ao = Long.reverse(1873497444986126336L);
   private static long m = Long.reverse(1873497444986126336L);
   private static int bc = -1 >>> 30 | -1 << ~30 + 1;
   private static int ce = Integer.reverse(402653184);
   private static long b = Long.reverse(-8472306774088726907L);
   private static int as = -1342177280 >>> 124 | -1342177280 << -124;
   private static long af = Long.reverse(-8472306774088726907L);
   private static int cb = Integer.reverse(-402653184);
   private static long bd = Long.reverse(-8039961209861159291L);
   private static int ch = Integer.reverse(-1744830464);
   private static int k = (268435456 >>> 27 | 268435456 << ~27 + 1) & -1;
   private static long dd = Long.reverse(-8039961209861159291L);
   private static long cf = Long.reverse(-8472306774088726907L);
   private static int ac = Integer.reverse(1610612736);
   private static int ah = 0 >>> 81 | 0 << -81;
   private static long bm = Long.reverse(-8039961209861159291L);
   private static long bg = Long.reverse(1873497444986126336L);
   public static final String co = a(NLoginCore_113.dv, NLoginCore_113.dw);
   private static long aw = Long.reverse(-8472306774088726907L);
   private static long df = Long.reverse(-8472306774088726907L);
   private static int a = Integer.reverse(0);
   private static long d = Long.reverse(1873497444986126336L);
   private static int q = Integer.reverse(0);
   private static long l = Long.reverse(-8472306774088726907L);
   private static long cs = Long.reverse(-8472306774088726907L);
   private static int be = Integer.reverse(-268435456);
   private static String[] a = new String[NLoginCore_113.dt];
   private static long bv = Long.reverse(1873497444986126336L);
   private static long az = Long.reverse(-8472306774088726907L);
   private static int p = 0 >>> 224 | 0 << -224;
   private static int ae = 234881024 >>> 121 | 234881024 << -121;
   private static int r = 0 >>> 113 | 0 << -113;
   private static long cl = Long.reverse(-8039961209861159291L);
   private static int bt = (327680 >>> 238 | 327680 << -238) & -1;
   private static int g = (2097152 >>> 85 | 2097152 << -85) & -1;
   private static int dv = 19456 >>> 201 | 19456 << -201;
   private static int by = Integer.reverse(1744830464);
   private static int dh = -2147483631 >>> 223 | -2147483631 << -223;
   private static int ay = Integer.reverse(-1342177280);
   private static int u = Integer.reverse(536870912);
   private static long i = Long.reverse(1873497444986126336L);
   private static int bk = Integer.reverse(-2013265920);
   private static long dg = Long.reverse(1873497444986126336L);
   private static int dq = Integer.reverse(Integer.MIN_VALUE);
   private static int cc = (-1 >>> 184 | -1 << -184) & -1;
   private static int bw = (1409286144 >>> 218 | 1409286144 << ~218 + 1) & -1;
   private static long bp = Long.reverse(1873497444986126336L);
   private static int bb = 458752 >>> 15 | 458752 << ~15 + 1;
   private static int ck = Integer.reverse(1476395008);
   private static long co = Long.reverse(1873497444986126336L);
   private static long cg = Long.reverse(1873497444986126336L);
   private static int cx = 65011712 >>> 181 | 65011712 << -181;
   private static long bs = Long.reverse(1873497444986126336L);
   private static long at = Long.reverse(-8472306774088726907L);
   private static int x = Integer.reverse(-1610612736);
   private static long var_do = Long.reverse(-8472306774088726907L);
   private static int ap = Integer.reverse(1342177280);
   private static long ba = Long.reverse(1873497444986126336L);
   private static int dk = Integer.reverse(603979776);
   private static int du = (-2147483629 >>> 223 | -2147483629 << -223) & -1;
   private static long bj = Long.reverse(1873497444986126336L);
   private static long cd = Long.reverse(-8039961209861159291L);
   private static int j = 512 >>> 104 | 512 << -104;
   private static int de = 142606336 >>> 150 | 142606336 << ~150 + 1;
   private static int bl = (-1 >>> 214 | -1 << ~214 + 1) & -1;
   private static int bq = Integer.reverse(-939524096);
   private static int aj = Integer.reverse(301989888);
   private static long bu = Long.reverse(-8472306774088726907L);
   private static long cn = Long.reverse(-8472306774088726907L);
   private static long au = Long.reverse(1873497444986126336L);
   private static long da = Long.reverse(-8039961209861159291L);
   private static int cv = (-1 >>> 68 | -1 << ~68 + 1) & -1;
   private static int aa = Integer.reverse(0);
   private static long dl = Long.reverse(-8039961209861159291L);
   private static int am = Integer.reverse(-1879048192);
   private static long dj = Long.reverse(1873497444986126336L);
   private static int aq = Integer.reverse(-1);
   private static int n = Integer.reverse(-1073741824);
   private static int dt = 2496 >>> 166 | 2496 << ~166 + 1;
   private static int ds = Integer.reverse(Integer.MIN_VALUE);
   private static int db = -2147483632 >>> 63 | -2147483632 << ~63 + 1;
   private static int ab = (0 >>> 79 | 0 << ~79 + 1) & -1;
   private static int ak = (128 >>> 132 | 128 << ~132 + 1) & -1;
   private static long bi = Long.reverse(-8472306774088726907L);
   private static int s = Integer.reverse(134217728);
   private static long o = Long.reverse(-8039961209861159291L);
   private static int dr = Integer.reverse(0);
   private static long an = Long.reverse(-8472306774088726907L);
   private static int cp = (458752 >>> 14 | 458752 << -14) & -1;
   private static int ci = Integer.reverse(-1);
   private static long ca = Long.reverse(1873497444986126336L);
   private static int dn = 671088641 >>> 187 | 671088641 << ~187 + 1;
   private static int bn = (1073741826 >>> 189 | 1073741826 << -189) & -1;
   public static final NLoginCore_479 S = NLoginCore_479.h;
   private static long ad = Long.reverse(-8039961209861159291L);
   private static long dp = Long.reverse(1873497444986126336L);
   private static long bz = Long.reverse(-8472306774088726907L);
   private static long cw = Long.reverse(-8039961209861159291L);
   private static String[] b = new String[du];
   private static int f = Integer.reverse(0);
   private static long cy = Long.reverse(-8039961209861159291L);
   private static long dw = Long.reverse(-8039961209861159291L);
   private static long br = Long.reverse(-8472306774088726907L);
   private static long ag = Long.reverse(1873497444986126336L);
   private static long bo = Long.reverse(-8472306774088726907L);
   private static long di = Long.reverse(-8472306774088726907L);
   private static int dm = ('耀' >>> 175 | 32768 << ~175 + 1) & -1;
   private static long w = Long.reverse(-8039961209861159291L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_113.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.D("҅ҧҩ҉ҭӌӄӚӆҕӓӉӗӑҚҿӡӠӘӞӘҭ", (byte)56, 68), NLoginCore_113.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.A("ŒşŞġšŝŘšŬśĨŦŪţŦŬĮҺӀҳҗӅҫӆҚҼӏӎӓӒŇ", (byte)56, 65) + var1 + NLoginCore_433.D("җ", (byte)56, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= -6487987833702488976L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(5 + 63),
                     (byte)(54 + 15),
                     (byte)(7 + 76),
                     (byte)(31 + 16),
                     (byte)(22 + 45),
                     66,
                     (byte)(43 + 24),
                     (byte)(12 + 35),
                     (byte)(33 + 47),
                     75,
                     (byte)(4 + 63),
                     (byte)(23 + 60),
                     (byte)(30 + 23),
                     (byte)(44 + 36),
                     (byte)(26 + 71),
                     (byte)(29 + 71),
                     (byte)(47 + 53),
                     (byte)(28 + 77),
                     (byte)(76 + 34),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣾऄࣷࣛउ࣯ऊࣞऀओऒगख", (byte)119, 70));
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
   public boolean i(String var1, String var2) {
      if (var2.length() < a(a, b ^ d).length() + e) {
         return (boolean)f;
      } else {
         try {
            byte[] var3 = Base64.getDecoder().decode(var2.substring(a(g, h ^ i).length() + j).getBytes(StandardCharsets.UTF_8));
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));

            int var18;
            label63: {
               boolean var23;
               label62: {
                  label61: {
                     try {
                        int var5 = Math.toIntExact(var4.readLong());
                        NLoginCore_115 var6 = NLoginCore_115.a(var5);
                        if (var6 == null) {
                           NLoginCore_370.c(a(k, l ^ m) + S.getName() + a(n, o) + var5);
                           var18 = q;
                           break label63;
                        }

                        switch (var6) {
                           case g:
                              String var17 = var4.readUTF();
                              String var19 = var4.readUTF();
                              int var20 = var4.readInt();
                              String var21 = var1;

                              for (int var22 = r; var22 < var20; var22++) {
                                 int var12 = var4.readInt();
                                 var21 = a(var12, var21, var17);
                              }

                              var23 = var19.equals(var21);
                              break label62;
                           case j:
                              var18 = var4.read();
                              byte[] var8 = NLoginCore_526.a(var4, s);
                              byte[] var9 = NLoginCore_526.a(var4, t);
                              Result var10 = BCrypt.verifyer(Version.VERSION_BC).verify(e(var1), var18, var8, var9);
                              var23 = var10.verified;
                              break label61;
                           default:
                              NLoginCore_370.c(a(u & v, w) + S.getName() + a(x, y ^ z) + var6);
                              var18 = ab;
                        }
                     } catch (Throwable var14) {
                        try {
                           var4.close();
                        } catch (Throwable var13) {
                           var14.addSuppressed(var13);
                        }

                        throw var14;
                     }

                     var4.close();
                     return (boolean)var18;
                  }

                  var4.close();
                  return var23;
               }

               var4.close();
               return var23;
            }

            var4.close();
            return (boolean)var18;
         } catch (Exception var15) {
            NLoginCore_370.b(a(ac, ad) + S.getName() + a(ae, af ^ ag), var15);
            return (boolean)ai;
         }
      }
   }

   private static void b() {
      c = -6817761056102140335L;
      long var0 = c ^ -6487987833702488976L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(48 + 21),
               (byte)(66 + 17),
               (byte)(34 + 13),
               (byte)(59 + 8),
               (byte)(39 + 27),
               (byte)(17 + 50),
               (byte)(15 + 32),
               (byte)(67 + 13),
               (byte)(7 + 68),
               (byte)(29 + 38),
               (byte)(71 + 12),
               (byte)(46 + 7),
               80,
               (byte)(84 + 13),
               (byte)(12 + 88),
               100,
               (byte)(11 + 94),
               (byte)(83 + 27),
               (byte)(57 + 46)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_141.A("ćğĕöíĞÿôúĒģĀĝåĜĬģįčıİıøù", (byte)19, 65);
               b[1] = NLoginCore_433.F("ԱՉԿԠԗՈԩԞԤԼՍԪՇԏՆՖՍՙԷ՛՚՛Ԣԣ", (byte)19, 70);
               b[2] = NLoginCore_076.A("ðĘĀíģĕÞßðăĦí", (byte)19, 65);
               b[3] = NLoginCore_173.F("ՄԾԪՈՊԮԊԼՊԬԐԑԣՐԥՌՊՔՎԣՄԻԪԧ\u0558ՕաՏԱբԮՖՂՉդԵՀԤ՚ՁԪԣՆԱէԧգԶԴԫպԺծլկՓշՌպՔՙկդց", (byte)19, 70);
               b[4] = NLoginCore_183.E("ԚՂԪԗՍԿԈԉԚԭՐԗ", (byte)19, 69);
               b[5] = NLoginCore_241.F("ՄԾԪՈՊԮԊԼՊԬԐԑԣՐԥՌՊՔՎԣՄԻԪԧ\u0558ՕաՏԱբԮՖՂՉդԵՀԤ՚ՁԪԣՈԯՔՑՖՃԳՑՌՋՅնՏԸՀտԽՑրղՖտ", (byte)19, 70);
               b[6] = NLoginCore_387.B("ðĘĀíģĕÞßðăĦí", (byte)19, 66);
               b[7] = NLoginCore_433.C("ПѠхѦѢТзоѧѡџшфхѭыбѥњгѳхлѨѮҀгмѝѾѤҀ҇куѹшїьѮѣѣѼҀҎѠґѷѯѧґѮѺѴѡѢ", (byte)19, 67);
               b[8] = NLoginCore_232.B("ĊõøþöĝñøúĂĥĊćâĩíćĢçíĈıøù", (byte)19, 66);
               b[9] = NLoginCore_575.A("ØÚÿĜğÞĞĆĄĄĒí", (byte)19, 65);
               b[10] = NLoginCore_141.E("ԳԀԅԳԬԉԶԇՏՎՈԗ", (byte)19, 69);
               b[11] = NLoginCore_575.D("зѝйъѫѡѬщйЫйж", (byte)19, 68);
               b[12] = NLoginCore_127.B("÷čĘþòóĥęăĨĀí", (byte)19, 66);
               b[13] = NLoginCore_453.D("СсЩџѣЦыѝыыйж", (byte)19, 68);
               b[14] = NLoginCore_110.E("ԁԱՋԔԂԥՇԚԈԎԢԗ", (byte)19, 69);
               b[15] = NLoginCore_451.E("ԇԴՋԗԔԠՆԈԚԨԏՅԾԏԡՒԡԳԪԫՆՋԢԣ", (byte)19, 69);
               b[16] = NLoginCore_173.D("оѦъѩлѧійѭмыѬџуьѭђѐѸѢюфст", (byte)19, 68);
               b[17] = NLoginCore_324.C("есљШѡѢџѦяыЬЪлхщчтцѵкфѪст", (byte)19, 67);
               b[18] = NLoginCore_092.C("хЧљќифѧоЦрЫЬнхѪШѪѹѐѦуѪст", (byte)19, 67);
               b[19] = NLoginCore_559.E("ԃՀԿԉԞӿԤԗԽՃԲԗ", (byte)19, 69);
               b[20] = NLoginCore_553.F("ԨՁԞԾԽԘԈԫԢԏԮԗ", (byte)19, 70);
               b[21] = NLoginCore_076.E("ԘԺԸԆԭԌԽԨՋԊԏԯԋԟՐԢՓԘԯԒՅԵԢԣ", (byte)19, 69);
               b[22] = NLoginCore_241.E("ԒԔՈӽԨՄԘԯԘԟԏԑԋԨԒՏՒԩՉԗՉ՛Ԣԣ", (byte)19, 69);
               b[23] = NLoginCore_183.A("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļľİýĪŁĎĹŀğĲńĦĸĔļŌŅŃĉĚĻěĘę", (byte)19, 65);
               b[24] = NLoginCore_183.A("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļĭÿĚĳĹđĚĿĞŅąĂĔěĦĠģĘČďĞŁĘę", (byte)19, 65);
               b[25] = NLoginCore_027.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅уѤпѲ҄҂ѹўѠѮяѩҁѦѠѣѩѦѵѶѰѤѡѢ", (byte)19, 67);
               b[26] = NLoginCore_397.F("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵՉՖԟԻ՜ԿԾԾԭԲզԺԴՀՃԽբ՛ՍզՋԺԥմՈեղ\u0530ՇԵՎ\u0557ջՂՃ", (byte)19, 70);
               b[27] = NLoginCore_453.C("ћХйлсфџЪЯЭкѭмѳрѓвтѪкјѪст", (byte)19, 67);
               b[28] = NLoginCore_559.A("ĒÜðòøûĖáæäñąĖêħäĊûıČăġøù", (byte)19, 65);
               b[29] = NLoginCore_232.F("ԼԆԚԜԢԥՀԋԐԎԚԤՁՂԭԎԘԓՔԚՈՋԢԣ", (byte)19, 70);
               b[30] = NLoginCore_387.E("ԹՈԝԙՄՃՉԯԤ\u0530ԑԗ", (byte)19, 69);
               b[31] = NLoginCore_433.F("ԱԘԤԅԘԚԩՐԈԤԑԗ", (byte)19, 70);
               b[32] = NLoginCore_446.F("ӺՂԿԼԵՀԎԬԢԺԪԗ", (byte)19, 70);
               b[33] = NLoginCore_324.E("ԈԈԀԖԄԾԶԋԭԡԍԗ", (byte)19, 69);
               b[34] = NLoginCore_241.E("ԔԧԪӽԟԭՊՅԮԥԢԗ", (byte)19, 69);
               b[35] = NLoginCore_138.E("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵՆԼՊաԠԾԮդԻՒԟ", (byte)19, 69);
               b[36] = NLoginCore_384.F("ԵԃԙՉԇՍԯԯԹԧԪԗ", (byte)19, 70);
               b[37] = NLoginCore_559.D("ѥѦѧѕѬжчѩйуѧж", (byte)19, 68);
               b[38] = NLoginCore_446.D("ѐѨўпжѧшнућѬщѦЮѥѵѬѸіѺѹѺст", (byte)19, 68);
               break;
            case 1:
               b[0] = NLoginCore_241.A("ćğĕöíĞÿôúĒĥþĔċèĬćîĩČĦıøù", (byte)19, 65);
               b[1] = NLoginCore_201.C("ѐѨўпжѧшнућѬЮѰѫѨтуѪяушфст", (byte)19, 67);
               b[2] = NLoginCore_397.A("üĈÞïàôĢâòĜøí", (byte)19, 65);
               b[3] = NLoginCore_141.A("ĚĔĀĞĠĄàĒĠĂæçùĦûĢĠĪĤùĚđĀýĮīķĥćĸĄĬĘğĺċĖúİėĀùĜćĽýĹČĊāŐĐńŋĥďœŘĤőœŇĒœ", (byte)19, 65);
               b[4] = NLoginCore_232.E("ԐԤՅԤՈԼՎՐԩԮԲԗ", (byte)19, 69);
               b[5] = NLoginCore_183.D("ѣѝщѧѩэЩћѩыЯатѯфѫѩѳѭтѣњщцѷѴҀѮѐҁэѵѡѨ҃єџуѹѠщтѧюѳѰѵѢђѰѫѪѤҙҕҌҙѨҙҝҏҟңќ", (byte)19, 68);
               b[6] = NLoginCore_127.A("ĔüĉĕġĝđÝēėøí", (byte)19, 65);
               b[7] = NLoginCore_451.B("ÖėüĝęÙîõĞĘĖÿûüĤĂèĜđêĪüòğĥķêóĔĵěķľñúİÿĎăĥĚĚĳłŃĕąĬĭĠĞĩİīĘę", (byte)19, 66);
               b[8] = NLoginCore_092.B("ĊõøþöĝñøúĂĥúéĕāĝêĢĎĲİıøù", (byte)19, 66);
               b[9] = NLoginCore_451.E("ԑԂԕԞԾԄԄԘԱՁԪԗ", (byte)19, 69);
               b[10] = NLoginCore_397.E("ԗԳԠԫԝԅԬՉԨԇԞԗ", (byte)19, 69);
               b[11] = NLoginCore_076.E("ԄԶԶԹԃԷԼԽԚՎՁԜՍԬՅԡԶԲ՚ՋՙԥԢԣ", (byte)19, 69);
               b[12] = NLoginCore_559.A("èÿĐúÜĄĞĥïģĈí", (byte)19, 65);
               b[13] = NLoginCore_241.E("ԤԀԴԹՉԍԪԏԏԺԼԬԏՇՌՖԷԲԑՔՔՋԢԣ", (byte)19, 69);
               b[14] = NLoginCore_027.E("ԑԖԇԞՅՎԜՉԽԇԊՐԥԯԣԲԶԢԻՇԪԵԢԣ", (byte)19, 69);
               b[15] = NLoginCore_241.C("ЦѓѪжгпѥЧйчЮѠЯгѣѨтѓсѩфѺст", (byte)19, 67);
               b[16] = NLoginCore_027.E("ԟՇԫՊԜՈԷԚՎԝԫԐ\u0530ՖԔՃԓԨԳԘԎԵԢԣ", (byte)19, 69);
               b[17] = NLoginCore_127.C("есљШѡѢџѦяыЬѢѢрѰѕпѦѶтѹєст", (byte)19, 67);
               b[18] = NLoginCore_427.B("üÞĐēïûĞõÝ÷ßĩąĉĚģíøĮİāıøù", (byte)19, 66);
               b[19] = NLoginCore_521.B("ÝęĝÜßėġěĐėýøæãĬĈĖÿčçěûøù", (byte)19, 66);
               b[20] = NLoginCore_324.A("ěĚèĕčÙáĞĢďąæēĪěõďĈĢþĦċøù", (byte)19, 65);
               b[21] = NLoginCore_324.E("ԘԺԸԆԭԌԽԨՋԊԏՐԜԳԈԕԷՑԤ՚ԩԵԢԣ", (byte)19, 69);
               b[22] = NLoginCore_521.F("ԒԔՈӽԨՄԘԯԘԟԐՁՉՓԟԟՂԭԴԑԼՋԢԣ", (byte)19, 70);
               b[23] = NLoginCore_091.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅҇ѹцѳҊї҂҉ѨѻҋѲћєҕ҃ѰѬѸ҂ҏҚѡѢ", (byte)19, 67);
               b[24] = NLoginCore_451.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅ѶшѣѼ҂њѣ҈ѧҎяҌ҄Ѱѽ҉ҁѫѱҋѼѴѡѢ", (byte)19, 67);
               b[25] = NLoginCore_433.B("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļúěöĩĻĹİĕėĥĆĠņĻņčĈĠĐĽĈīĘę", (byte)19, 66);
               b[26] = NLoginCore_076.D("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅љѓџѢќҁѺѬ҅ѪћѨѫѽҌѩэѩѳ҇ѤѤѡѢ", (byte)19, 68);
               b[27] = NLoginCore_553.B("ĒÜðòøûĖáæäóģėĂĈĘċùġęĜċøù", (byte)19, 66);
               b[28] = NLoginCore_201.A("ĒÜðòøûĖáæäó÷ģÝĀûěćĎĉĊıøù", (byte)19, 65);
               b[29] = NLoginCore_387.F("ԼԆԚԜԢԥՀԋԐԎԛԭԴԽԟԤՈԢՒ\u0557ԎԵԢԣ", (byte)19, 70);
               b[30] = NLoginCore_427.E("ՂԛԃՆՀԦԇԅ\u0530ԙԱՈՄՆԢԫԡՅՂՖՔԥԢԣ", (byte)19, 69);
               b[31] = NLoginCore_091.B("ğėööõôÖĥħïâĝħĕğéĝýúċðûøù", (byte)19, 66);
               b[32] = NLoginCore_004.B("ĖÑđĠÞĤôÞæĈâĂÜĘģĢċĢĆĠĞıøù", (byte)19, 66);
               b[33] = NLoginCore_201.B("ÜßðõìãÖĂïĐùħğĥĄČĩîêąĎûøù", (byte)19, 66);
               b[34] = NLoginCore_127.D("уѨЛХЦѧѥЩЮѮЩџрќѦђѶѣѱэїєст", (byte)19, 68);
               b[35] = NLoginCore_575.F("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵԻԾԩՊ\u0557ԱԷ՟գՄԻՅ\u0557ՠգԾԩԠԬ\u0530ՠՠԷ", (byte)19, 70);
               b[36] = NLoginCore_384.C("ЧѥХмѥлуцљѣэж", (byte)19, 67);
               b[37] = NLoginCore_138.B("ĔëĎÿăĚăùġĜüí", (byte)19, 66);
               b[38] = NLoginCore_027.A("ćğĕöíĞÿôúĒģĄàĢâąĜěîĝăıøù", (byte)19, 65);
               break;
            case 2:
               b[0] = NLoginCore_183.D("РѡкѧутіѥшьѡЪХђѝѴѶѕбѥэѪст", (byte)19, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_451.C("хлѪзУтппцЫѩаѐџаѣчфитѵѺст", (byte)19, 67);
         }
      }
   }

   static {
      b();
   }

   private static byte[] e(String var0) {
      byte[] var1 = var0.getBytes(StandardCharsets.UTF_8);
      if (var1.length > aj) {
         var1 = MessageDigest.getInstance(a(ak, al)).digest(var1);
      }

      return var1;
   }

   private static String a(int var0, String var1, String var2) {
      switch (var0) {
         case 1:
            return var1;
         case 2:
            return var1 + var2;
         case 3:
            return i(var1, a(am, an ^ ao));
         case 4:
            return i(var1, a(ap & aq, ar));
         case 5:
            return ((MD5HashProvider)NLoginCore_566.j.a()).C(var1);
         case 6:
            return i(var1, a(as, at ^ au));
         case 7:
            return i(var1, a(av, aw ^ ax));
         case 8:
            return i(var1, a(ay, az ^ ba));
         case 9:
            return ((NLoginCore_369)NLoginCore_566.i.a()).E(var1);
         case 10:
            return i(var1, a(bb & bc, bd));
         case 11:
            return ((NLoginCore_250)NLoginCore_566.h.a()).E(var1);
         case 12:
            return i(var1, a(be, bf ^ bg));
         case 13:
            return i(var1, a(bh, bi ^ bj));
         case 14:
            return i(var1, a(bk & bl, bm));
         case 15:
            return i(var1, a(bn, bo ^ bp));
         case 16:
            return i(var1, a(bq, br ^ bs));
         case 17:
            return i(var1, a(bt, bu ^ bv));
         case 18:
            return i(var1, a(bw, bx));
         case 19:
            return i(var1, a(by, bz ^ ca));
         case 20:
            throw new UnsupportedOperationException(a(cb & cc, cd));
         case 21:
            throw new UnsupportedOperationException(a(ce, cf ^ cg));
         case 22:
            throw new UnsupportedOperationException(a(ch & ci, cj));
         case 23:
            throw new UnsupportedOperationException(a(ck, cl));
         case 24:
            return i(var1, a(cm, cn ^ co));
         case 25:
            return i(var1, a(cp, cq));
         case 26:
            return i(var1, a(cr, cs ^ ct));
         case 27:
            return i(var1, a(cu & cv, cw));
         case 28:
            return i(var1, a(cx, cy));
         case 29:
            return i(var1, a(cz, da));
         case 30:
            return i(var1, a(db & dc, dd));
         case 31:
            return i(var1, a(de, df ^ dg));
         default:
            throw new UnsupportedOperationException(a(dh, di ^ dj) + var0);
      }
   }

   private static String i(String var0, String var1) {
      MessageDigest var2;
      try {
         var2 = MessageDigest.getInstance(var1);
      } catch (NoSuchAlgorithmException var4) {
         throw new RuntimeException(var4);
      }

      var2.reset();
      var2.update(var0.getBytes(StandardCharsets.UTF_8));
      byte[] var3 = var2.digest();
      String var10000 = a(dk, dl) + (var3.length << dm) + a(dn, var_do ^ dp);
      Object[] var10001 = new Object[dq];
      var10001[dr] = new BigInteger(ds, var3);
      return String.format(var10000, var10001);
   }
}
