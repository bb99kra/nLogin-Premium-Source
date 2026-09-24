package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class NLoginCore_144 implements NLoginInterface_038 {
   private static int be = (144 >>> 67 | 144 << ~67 + 1) & -1;
   private static final String cz = a(NLoginCore_144.ej, NLoginCore_144.ek);
   private static int ej = 163577856 >>> 22 | 163577856 << -22;
   private static int cx = (0 >>> 133 | 0 << ~133 + 1) & -1;
   private static long ci = Long.reverse(4046135846001245267L);
   private static long ah = Long.reverse(2594073385365405696L);
   private static long cr = Long.reverse(2028523212939263059L);
   private static int ac = Integer.reverse(-1879048192);
   private static long ao = Long.reverse(2028523212939263059L);
   private static long dr = Long.reverse(2594073385365405696L);
   private static long dz = Long.reverse(2028523212939263059L);
   private static long n = Long.reverse(2028523212939263059L);
   private static int ef = (20480 >>> 137 | 20480 << ~137 + 1) & -1;
   private static int ds = Integer.reverse(603979776);
   private static int da = (524288 >>> 14 | 524288 << -14) & -1;
   private static int bo = Integer.reverse(-1476395008);
   private static int cj = 939524096 >>> 153 | 939524096 << ~153 + 1;
   private static int bf = (-1 >>> 96 | -1 << -96) & -1;
   private static int w = Integer.reverse(-536870912);
   private static int dp = 1120 >>> 165 | 1120 << ~165 + 1;
   private static int by = Integer.reverse(0);
   private static long c;
   private static int dx = (16777216 >>> 88 | 16777216 << -88) & -1;
   private static long u = Long.reverse(2028523212939263059L);
   private static int bl = Integer.reverse(671088640);
   private static long v = Long.reverse(2594073385365405696L);
   private static int eb = Integer.reverse(0);
   private static int q = (83886080 >>> 216 | 83886080 << ~216 + 1) & -1;
   private static int z = Integer.reverse(268435456);
   private static int ax = Integer.reverse(1610612736);
   private static int m = 8192 >>> 11 | 8192 << -11;
   private static long dn = Long.reverse(2028523212939263059L);
   private static int ay = Integer.reverse(134217728);
   private static long cc = Long.reverse(4046135846001245267L);
   private static int t = 6144 >>> 106 | 6144 << ~106 + 1;
   private static int ec = (0 >>> 49 | 0 << -49) & -1;
   private static long r = Long.reverse(2028523212939263059L);
   private static int dy = Integer.reverse(-1543503872);
   private static long bq = Long.reverse(2594073385365405696L);
   private static final String cy = a(NLoginCore_144.eg, NLoginCore_144.eh ^ NLoginCore_144.ei);
   private static long var_do = Long.reverse(2594073385365405696L);
   private static int cg = Integer.reverse(0);
   private static int f = Integer.reverse(-1);
   private static int bh = Integer.reverse(0);
   private static long ek = Long.reverse(4046135846001245267L);
   private static String[] b = new String[ef];
   private static long aa = Long.reverse(2028523212939263059L);
   private static int av = (0 >>> 40 | 0 << -40) & -1;
   private static long ab = Long.reverse(2594073385365405696L);
   private static long ae = Long.reverse(4046135846001245267L);
   private static long cv = Long.reverse(4046135846001245267L);
   private static long ba = Long.reverse(2594073385365405696L);
   private static long dk = Long.reverse(4046135846001245267L);
   private static int cq = Integer.reverse(2013265920);
   private static int h = Integer.reverse(1073741824);
   private static long o = Long.reverse(2594073385365405696L);
   private static long g = Long.reverse(4046135846001245267L);
   private static long s = Long.reverse(2594073385365405696L);
   private static int bc = Integer.reverse(-2013265920);
   private static int br = Integer.reverse(0);
   private static int dv = 2097152 >>> 117 | 2097152 << -117;
   private static long ck = Long.reverse(2028523212939263059L);
   private static int cw = 65536 >>> 16 | 65536 << -16;
   private static long ap = Long.reverse(2594073385365405696L);
   private static long ea = Long.reverse(2594073385365405696L);
   private static int cz = 0 >>> 13 | 0 << ~13 + 1;
   private static long ca = Long.reverse(4046135846001245267L);
   private static int e = 4 >>> 98 | 4 << -98;
   private static int bb = Integer.reverse(0);
   private static long i = Long.reverse(4046135846001245267L);
   private static int ai = Integer.reverse(-805306368);
   private static long l = Long.reverse(2594073385365405696L);
   private NLoginCore_153 a;
   private static int bn = Integer.reverse(1610612736);
   private static long bg = Long.reverse(4046135846001245267L);
   private static int dm = Integer.reverse(1140850688);
   private static long bj = Long.reverse(2028523212939263059L);
   private static int bs = (720896 >>> 111 | 720896 << -111) & -1;
   private static int al = Integer.reverse(805306368);
   private static long cl = Long.reverse(2594073385365405696L);
   private static int dh = Integer.reverse(0);
   private static int x = Integer.reverse(-1);
   private static int eg = 152 >>> 34 | 152 << ~34 + 1;
   private static int an = 425984 >>> 15 | 425984 << ~15 + 1;
   private static long dq = Long.reverse(2028523212939263059L);
   private static int cy = 4 >>> 98 | 4 << ~98 + 1;
   private static long bm = Long.reverse(4046135846001245267L);
   private static long bu = Long.reverse(2594073385365405696L);
   private static int ch = Integer.reverse(-671088640);
   private static long bd = Long.reverse(4046135846001245267L);
   private static int cn = (973078528 >>> 249 | 973078528 << -249) & -1;
   private static long dt = Long.reverse(2028523212939263059L);
   private static int ct = Integer.reverse(-134217728);
   private static long bp = Long.reverse(2028523212939263059L);
   private static long ei = Long.reverse(2594073385365405696L);
   private static long b = Long.reverse(2028523212939263059L);
   private static long am = Long.reverse(4046135846001245267L);
   private static long cs = Long.reverse(2594073385365405696L);
   private static long ar = Long.reverse(2028523212939263059L);
   private static long dc = Long.reverse(4046135846001245267L);
   private static int dg = (0 >>> 79 | 0 << ~79 + 1) & -1;
   private static long eh = Long.reverse(2028523212939263059L);
   private static int co = Integer.reverse(-1);
   private static int aq = (1835008 >>> 241 | 1835008 << -241) & -1;
   private static int at = Integer.reverse(-268435456);
   private static long y = Long.reverse(4046135846001245267L);
   private static long au = Long.reverse(4046135846001245267L);
   private static int cu = (-1 >>> 169 | -1 << -169) & -1;
   private static long cp = Long.reverse(4046135846001245267L);
   private static int ee = (167772160 >>> 86 | 167772160 << -86) & -1;
   private static int bw = Integer.reverse(-1);
   private static int di = 0 >>> 104 | 0 << ~104 + 1;
   private static int af = Integer.reverse(1342177280);
   private static long aj = Long.reverse(2028523212939263059L);
   private boolean aC;
   private static int dd = Integer.reverse(Integer.MIN_VALUE);
   private static long bx = Long.reverse(4046135846001245267L);
   private static long ag = Long.reverse(2028523212939263059L);
   private static long as = Long.reverse(2594073385365405696L);
   private static long k = Long.reverse(2028523212939263059L);
   private static int bz = Integer.reverse(402653184);
   private static int dw = Integer.reverse(Integer.MIN_VALUE);
   private static int de = 0 >>> 192 | 0 << -192;
   private static int cd = (1572864 >>> 242 | 1572864 << ~242 + 1) & -1;
   private static int cm = Integer.reverse(0);
   private static int a = Integer.reverse(0);
   private static int j = 25165824 >>> 23 | 25165824 << -23;
   private static int dj = (276824064 >>> 247 | 276824064 << ~247 + 1) & -1;
   private static int cb = (204800 >>> 141 | 204800 << ~141 + 1) & -1;
   private static int bv = (24117248 >>> 244 | 24117248 << -244) & -1;
   private static int db = -1 >>> 223 | -1 << ~223 + 1;
   private static long cf = Long.reverse(4046135846001245267L);
   private final NLoginCore_308 c;
   private static int df = Integer.reverse(Integer.MIN_VALUE);
   private static int aw = 65536 >>> 80 | 65536 << ~80 + 1;
   private static long az = Long.reverse(2028523212939263059L);
   private static int ce = 1073741827 >>> 157 | 1073741827 << ~157 + 1;
   private static int ed = (65536 >>> 240 | 65536 << -240) & -1;
   private static long ak = Long.reverse(2594073385365405696L);
   private static int p = 629145601 >>> 183 | 629145601 << -183;
   private static int ad = Integer.reverse(-1);
   private static int bi = Integer.reverse(-939524096);
   private static long bt = Long.reverse(2028523212939263059L);
   private static long bk = Long.reverse(2594073385365405696L);
   private static long du = Long.reverse(2594073385365405696L);
   private final NLoginType_008 J;
   private static String[] a = new String[ee];
   private static int dl = Integer.reverse(1073741824);
   private static long d = Long.reverse(2594073385365405696L);

   @Override
   public void a(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      String var4 = var2.getName();
      String var5 = NLoginCore_354.a(NLoginCore_198.d, ax);
      NLoginCore_311.f.a(var1, var5, NLoginCore_137.a);
      String var6 = String.join(a(ay, az ^ ba), NLoginCore_150.c(NLoginCore_487.br)).replace(a(bc, bd), var4).replace(a(be & bf, bg), var5);
      String var7 = NLoginCore_150.a(NLoginCore_487.bq).replace(a(bi, bj ^ bk), var4).replace(a(bl, bm), var5);
      this.a(var3, var7, var6, var1x -> {
         if (!var1x) {
            NLoginCore_311.f.a(var1, null, null);
         }
      });
   }

   private boolean a(String var1, String var2, String var3) {
      if (!this.aC) {
         return (boolean)dh;
      } else if (this.a == null) {
         return (boolean)di;
      } else if (var1.split(a(dj, dk)).length != dl) {
         throw new IllegalArgumentException(a(dm, dn ^ var_do) + var1);
      } else if (var2 == null || var2.isEmpty()) {
         throw new IllegalArgumentException(a(dp, dq ^ dr));
      } else if (var3 != null && !var3.isEmpty()) {
         HtmlEmail var4 = new HtmlEmail();
         var4.setHostName(this.a.cG);
         var4.setAuthenticator(new DefaultAuthenticator(this.a.cC, this.a.cD));
         var4.setSmtpPort(this.a.aF);
         var4.setCharset(this.a.cE);
         var4.setDebug(this.a.aD);
         switch (this.a.a) {
            case c:
               var4.setStartTLSEnabled((boolean)dw);
               break;
            case d:
               var4.setSSLOnConnect((boolean)dv);
               var4.setSslSmtpPort(Integer.toString(this.a.aF));
         }

         try {
            var4.setFrom(this.a.cA, this.a.cB);
            var4.addTo(var1);
            var4.setSubject(var2);
            var4.setContent(var3, this.a.cF);
            var4.send();
            return (boolean)dx;
         } catch (EmailException var6) {
            NLoginCore_370.c(a(dy, dz ^ ea), var6);
            return (boolean)ec;
         }
      } else {
         throw new IllegalArgumentException(a(ds, dt ^ du));
      }
   }

   private static void b() {
      c = -3873368724689689544L;
      long var0 = c ^ 6164304245843914351L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               (byte)(35 + 34),
               83,
               (byte)(31 + 16),
               (byte)(43 + 24),
               (byte)(11 + 55),
               (byte)(9 + 58),
               (byte)(2 + 45),
               (byte)(47 + 33),
               (byte)(63 + 12),
               (byte)(50 + 17),
               (byte)(54 + 29),
               (byte)(18 + 35),
               (byte)(52 + 28),
               (byte)(67 + 30),
               (byte)(85 + 15),
               (byte)(92 + 8),
               (byte)(79 + 26),
               110,
               (byte)(76 + 27)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.D("ϰϺгДОЇемϿМхϼЯϾвнСМϾзЇЁыѐѓЩцХѕщЖђ", (byte)4, 68);
               b[1] = NLoginCore_127.F("ӱԩԮԋ\u0530ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷԾՊՅՄՏՀՍԧԏԔԥ", (byte)4, 70);
               b[2] = NLoginCore_223.C("ϲЪЯЌбкЯДРивϼЖслЩМОЪЈЇЌиХНсдВшТїъ", (byte)4, 67);
               b[3] = NLoginCore_201.E("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 69);
               b[4] = NLoginCore_241.A("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôēćåðĕěĉüüĞØ", (byte)4, 65);
               b[5] = NLoginCore_559.E("ӱԩԮԋ\u0530ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՉՇՆԞԣԯՀԎԤԢՐԕՎՒԻԸՔ՞ԝՁԵԿԨ", (byte)4, 69);
               b[6] = NLoginCore_387.A("ÒëºüåßÔÆ÷ćâÏ", (byte)4, 65);
               b[7] = NLoginCore_091.F("ӱԩԮԋ\u0530ԹԮԓԟԷԳԱԚՀԣԑԇԩԉՈՂՂՄԿՇԪԒՏԩԱԧՇ", (byte)4, 70);
               b[8] = NLoginCore_201.B("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôÕöĈĉÔ×ďúúĐČ", (byte)4, 66);
               b[9] = NLoginCore_241.F("ӱԩԮԋ\u0530ԹԮԓԟԷԴ\u0530ԛՆԔԶԷԽԪՇՀԧՊՂՁԽԪՐԒՑԪՕ", (byte)4, 70);
               b[10] = NLoginCore_453.B("Ê³ÝÚĄñ¼äúĉÞÏ", (byte)4, 66);
               b[11] = NLoginCore_201.B("¸ðõÒ÷ĀõÚæþùăØÄøïÜĀċēæÍĔċĕ÷đĕĉÖûČ", (byte)4, 66);
               b[12] = NLoginCore_241.C("ϬдДЫЗϼЉАЬКЖбхцЩшЄЉцкжЗДЕ", (byte)4, 67);
               b[13] = NLoginCore_183.D("ϲЪЯЌбкЯДРигОЏТЖедЊЬсщьЩЦФврЍшфюя", (byte)4, 68);
               b[14] = NLoginCore_091.B("¿ÏõăþðÿÕéÉÓćĊÌĆÉìäčćÊíÚÛ", (byte)4, 66);
               b[15] = NLoginCore_530.D("ϲЪЯЌбкЯДРиеможϿЩжЧОжННсЦЛбЋтЫчсЮ", (byte)4, 68);
               b[16] = NLoginCore_384.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
               b[17] = NLoginCore_004.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
               b[18] = NLoginCore_453.E("ԉԴӱԅԧԇӵӲԋԂԂԈ", (byte)4, 69);
               b[19] = NLoginCore_559.E("ԈԫԨ\u0530ԍӶԱԶԫԐԱԈ", (byte)4, 69);
               b[20] = NLoginCore_427.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
               b[21] = NLoginCore_397.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
               b[22] = NLoginCore_384.C("ЉЬЩбЎϷвзЬБвЉ", (byte)4, 67);
               b[23] = NLoginCore_110.F("ԉԴӱԅԧԇӵӲԋԂԂԈ", (byte)4, 70);
               b[24] = NLoginCore_553.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
               b[25] = NLoginCore_092.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
               b[26] = NLoginCore_173.F("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 70);
               b[27] = NLoginCore_433.D("ЉЬЩбЎϷвзЬБвЉ", (byte)4, 68);
               b[28] = NLoginCore_223.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
               b[29] = NLoginCore_138.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
               b[30] = NLoginCore_384.C("ЊеϲІШЈ϶ϳЌЃЃЉ", (byte)4, 67);
               b[31] = NLoginCore_553.E("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 69);
               b[32] = NLoginCore_397.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
               b[33] = NLoginCore_223.C("ϰкЏϷгрЀСмϾДЉ", (byte)4, 67);
               b[34] = NLoginCore_127.A("Ì¾ôĂĀÅçöÙÄÄĀĆäÿçØĂáĀæÝÚÛ", (byte)4, 65);
               b[35] = NLoginCore_110.F("ԳӺԼԛԻԗԴԟԙӴԘԡԻԒԤӾԶՃՌԔԝՃԽԉՀՍԑՌՖՏԲՃԋՅՆԒԾ՞ՙՍԻԴԭԞՔԽՈԲԲժՙԷէՆԳԴ", (byte)4, 70);
               b[36] = NLoginCore_559.C("ЭЇкЇЛЍϲЕЀЀжГНВшЀтиІЦТШЇцыТЪщФиЧѕТёэчѐзмєќжЛСѤеОЦлхшиЦяѭѭнѠгшеѰѶѷ", (byte)4, 67);
               b[37] = NLoginCore_451.E(
                  "ӳԏԖԱԞԗӱӶԞԻԃԏԅӸԑӺԄӼԠՆԽԬԉԇՃԞԐԲԫԐՓԬՑԸՈԭՓՎԴԖԙՒԳԼԲՇԡԠՔԵՕիՈԹ՜՝էԮԱյդելեմՔպՅնռտմԾժձեմՓոջբՀթոՍՆսաօֆ\u0590՟՟֏ղղցօյք֝\u058c֎լ֑շ֎խ֖պ֙։նժիիք֜ճմ",
                  (byte)4,
                  69
               );
               b[38] = NLoginCore_027.D("ϲЪЯЌбкЯДРидЍрлдЦЃпжНПЧДЕ", (byte)4, 68);
               b[39] = NLoginCore_241.B("àĀÏõôä¼ÃôÙāúÇÅāÊÌïêýçíÚÛ", (byte)4, 66);
               break;
            case 1:
               b[0] = NLoginCore_232.B("¶ÀùÚäÍûĂÅâċÂõÄøăçâÄýÍÐìĄÐĚøĕćðìô", (byte)4, 66);
               b[1] = NLoginCore_471.E("ӱԩԮԋ\u0530ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՇԯԜԼՅԮՀԬԔԷԕԫԬԭԪ\u0557ՐԪՑՔ\u0530ԿԨ", (byte)4, 69);
               b[2] = NLoginCore_138.C("ϲЪЯЌбкЯДРивϼЖслЩМОЪЈЇюКФчпђЋЪзВГ", (byte)4, 67);
               b[3] = NLoginCore_110.A("ÈÕÔþòÓâçþÖÖÏ", (byte)4, 65);
               b[4] = NLoginCore_553.A("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôÕĈðÖÔíÖĖĔúø", (byte)4, 65);
               b[5] = NLoginCore_397.F("ӱԩԮԋ\u0530ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՉՇՆԞԣԯՀԎԤԢՐԣԙՅԖ՚ԾՍԝՏ՝ՑԨ", (byte)4, 70);
               b[6] = NLoginCore_092.A("õÒĂîÓăÖüĀýąćÖÇäçĆèßÉĒÝÚÛ", (byte)4, 65);
               b[7] = NLoginCore_451.D("ϲЪЯЌбкЯДРидвЛсФВЈЪЊщуфМкёЋпваюХж", (byte)4, 68);
               b[8] = NLoginCore_451.C("ϲЪЯЌбкЯДРигцАЇИГзОЫϿЮЁьЭХвнАохуЯчДлѕеўЗѐЮѠПЩ", (byte)4, 67);
               b[9] = NLoginCore_451.B("¸ðõÒ÷ĀõÚæþû÷âčÛýþĄñĎćôĀĉôñĄõĔùĜĕĐò÷ĖîåĜĀġĥĤï", (byte)4, 66);
               b[10] = NLoginCore_553.B("ËÕ÷íÍÍÎçÒć÷ßËăÙãìĄĂąðíÚÛ", (byte)4, 66);
               b[11] = NLoginCore_521.E("ӱԩԮԋ\u0530ԹԮԓԟԷԲԼԑӽԱԨԕԹՄՌԟԄԼԉԲԜԣԝԵՆԯԶՍԯԫՓԘԕԟ՛՝աԚԨ", (byte)4, 69);
               b[12] = NLoginCore_384.C("ϬдДЫЗϼЉАЬКЕЗцДжЗПІриЫэДЕ", (byte)4, 67);
               b[13] = NLoginCore_241.B("¸ðõÒ÷ĀõÚæþùäÕèÜûúÐòćďĎąāđċëÕñðĕû", (byte)4, 66);
               b[14] = NLoginCore_127.E("ӸԈԮԼԷԩԸԎԢԂԍԣՅԡԲԾӻՄԈՍԘԽՆԏԻԐԛԤԝԡՖԊ", (byte)4, 69);
               b[15] = NLoginCore_091.C("ϲЪЯЌбкЯДРиеможϿЩжЧОжНХПТуывШѐягБЯШіДНъеѕЯѓѢЩ", (byte)4, 67);
               b[16] = NLoginCore_092.B("ÿ»êãðĆ¸ÙôóÒÏ", (byte)4, 66);
               b[17] = NLoginCore_092.A("ñ¸ÓÁ¾¾áć×ÒĈúâ÷ßËđčÌêĔíÚÛ", (byte)4, 65);
               b[18] = NLoginCore_141.B("¾òÛÚāÄåïÅòÞÏ", (byte)4, 66);
               b[19] = NLoginCore_201.D("ЛЧМЛоϻЛϿЫАрбзПзУрКЫмхЧДЕ", (byte)4, 68);
               b[20] = NLoginCore_183.D("϶ФАϼбдИϸбФМЉ", (byte)4, 68);
               b[21] = NLoginCore_446.D("ЊижЯбШЪлОсМЉ", (byte)4, 68);
               b[22] = NLoginCore_223.B("½Ê´ÃĄÔîÙôÜÖÄ÷öËÊåÃäïåÝÚÛ", (byte)4, 66);
               b[23] = NLoginCore_453.A("ðÓîĀăÖÝÙÂāĉ½ĊćĉêðÜÍððēÚÛ", (byte)4, 65);
               b[24] = NLoginCore_141.E("ԄԭԹӵӽӰԍԖԋԯԚԮԀӽԣԀԱԫՌԔԅԦԓԔ", (byte)4, 69);
               b[25] = NLoginCore_384.D("ЩϻгХзЯЈДТпуоМчйϻГПепТЧДЕ", (byte)4, 68);
               b[26] = NLoginCore_201.A("É×ùÛûÝÒÜÃçÞÏ", (byte)4, 65);
               b[27] = NLoginCore_004.B("ý·óµÃØößÂùĈÃÌìĂÍéèďÊĒēÚÛ", (byte)4, 66);
               b[28] = NLoginCore_138.D("ФЊϹЪМЕвЊЏЌрЅвϾРлукСЍЈЗДЕ", (byte)4, 68);
               b[29] = NLoginCore_446.A("áíâáĄÁáÅñÖąóčüĄþÆāíäĐăÚÛ", (byte)4, 65);
               b[30] = NLoginCore_384.A("ÐúÿĀüÃÐãáĄĊÈÊÜØøñïĂÒæíÚÛ", (byte)4, 65);
               b[31] = NLoginCore_223.C("ЅкжХЭиИϿЛоЮЉ", (byte)4, 67);
               b[32] = NLoginCore_141.B("ÊþÂÞÓąÏăüèĄÏ", (byte)4, 66);
               b[33] = NLoginCore_141.E("ԪԬӷԍӶԊӻԈԲԖԭԈ", (byte)4, 69);
               b[34] = NLoginCore_027.F("ԅӷԭԻԹӾԠԯԒӽӽԗԹԔԏՆԛՋՊԥԋՎՉԍՑԤՎՁԓՓՀԖ", (byte)4, 70);
               b[35] = NLoginCore_223.F("ԳӺԼԛԻԗԴԟԙӴԘԡԻԒԤӾԶՃՌԔԝՃԽԉՀՍԑՌՖՏԲՃԋՅՆԒԾ՞ՙՍԻԴԮԱԟ\u0558Ց\u0557ԠՆԼժ\u0558Շբդ՜\u0530ՁՅԳՂԵը", (byte)4, 70);
               b[36] = NLoginCore_241.E("ԬԆԹԆԚԌӱԔӿӿԵԒԜԑՇӿՁԷԅԥԡԧԆՅՊԡԩՈԣԷԦՔԡՐՌՆՏԶԻՓ՛ԵԚԠգԴԝԥԺՄՇԷԥՈԨթՆգԽըըՖՈՇ", (byte)4, 69);
               b[37] = NLoginCore_141.F(
                  "ӳԏԖԱԞԗӱӶԞԻԃԏԅӸԑӺԄӼԠՆԽԬԉԇՃԞԐԲԫԐՓԬՑԸՈԭՓՎԴԖԙՒԳԼԲՇԡԠՔԵՕիՈԹ՜՝էԮԱյդելեմՔպՅնռտմԾժձեմՓոջբՀթոՍՆսաօֆ\u0590՟՟֏ղղցօյք֝\u058c֎լ֑շ֍գ\u0590֥կ֣֠փթ֗֜ցֆց֩֩ր\u058cփֶխ֫",
                  (byte)4,
                  70
               );
               b[38] = NLoginCore_553.D("ϲЪЯЌбкЯДРигЗЙнйІсХЛХЭрЋкЋЎьрЕчЫѕ", (byte)4, 68);
               b[39] = NLoginCore_004.C("КкЉЯЮО϶ϽЮГнЛзЧсЇцИКзНйфкЫШбВАраГ", (byte)4, 67);
               break;
            case 2:
               b[0] = NLoginCore_141.A("öÉÔĀÓÍç÷þćÅÏ", (byte)4, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_575.E("ԩԈԨԤԹӷԼӲԯӻԖԂԄԣԸԾԶԄԿԝՎԦԓԔ", (byte)4, 69);
         }
      }
   }

   @Generated
   public NLoginCore_153 a() {
      return this.a;
   }

   @Generated
   public NLoginCore_144(NLoginType_008 var1, NLoginCore_308 var2) {
      this.J = var1;
      this.c = var2;
   }

   @Override
   public void c(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      String var4 = var1.a().l();
      String var10000 = a(da & db, dc);
      NLoginCore_487 var10001 = NLoginCore_487.bz;
      Object[] var10003 = new Object[dd];
      var10003[de] = var3;
      String var5 = String.join(var10000, NLoginCore_150.a(var10001, var2, var10003));
      NLoginCore_487 var7 = NLoginCore_487.by;
      Object[] var10002 = new Object[df];
      var10002[dg] = var3;
      String var6 = NLoginCore_150.a(var7, var2, var10002);
      this.a(var4, var6, var5, null);
   }

   public void a(String var1, String var2, String var3, @Nullable Consumer<Boolean> var4) {
      this.J.b((boolean)ed).a(() -> {
         boolean var5 = this.a(var1, var2, var3);
         if (var4 != null) {
            var4.accept(var5);
         }
      });
   }

   @Generated
   public NLoginCore_308 a() {
      return this.c;
   }

   @Generated
   public NLoginType_008 b() {
      return this.J;
   }

   @Override
   public void aH() {
      NLoginCore_219 var1 = this.c.c();
      if (var1 == null) {
         throw new IllegalStateException(this + a(a, b ^ d));
      } else {
         String var2 = var1.b(a(e & f, g));
         if (var2 != null) {
            String var3 = var1.a(a(h, i), a(j, k ^ l));
            if (var3.isEmpty()) {
               var3 = var2;
            }

            int var4 = var1.a(a(m, n ^ o), p);
            NLoginCore_164 var5 = NLoginCore_164.b(var1.a(a(q, r ^ s), a(t, u ^ v)), var4);
            this.a = new NLoginCore_153(
               var2,
               var1.b(a(w & x, y)),
               var3,
               var1.b(a(z, aa ^ ab)),
               var1.a(a(ac & ad, ae), a(af, ag ^ ah)),
               var1.a(a(ai, aj ^ ak), a(al, am)),
               var1.a(a(an, ao ^ ap), a(aq, ar ^ as)),
               var4,
               var5,
               var1.a(a(at, au), (boolean)av)
            );
            this.aC = (boolean)aw;
         }
      }
   }

   @Generated
   @Override
   public boolean aF() {
      return this.aC;
   }

   @Override
   public void b(ForceRegisterConfig var1, NLoginCore_277 var2) {
      String var3 = var2.getName();
      String var4 = var1.a().l();
      if (!NLoginCore_311.f.b(var1, NLoginCore_137.b)) {
         String var5 = NLoginCore_354.a(NLoginCore_198.d, cd);
         NLoginCore_311.f.a(var1, var5, NLoginCore_137.b);
         String var6 = String.join(a(ce, cf), NLoginCore_150.c(NLoginCore_487.bv)).replace(a(ch, ci), var3).replace(a(cj, ck ^ cl), var5);
         String var7 = NLoginCore_150.a(NLoginCore_487.bu).replace(a(cn & co, cp), var3).replace(a(cq, cr ^ cs), var5);
         this.a(var4, var7, var6, var1x -> {
            if (!var1x) {
               NLoginCore_311.f.a(var1, null, null);
            }
         });
      }
   }

   static {
      b();
   }

   @Override
   public void b(ForceRegisterConfig var1, NLoginCore_277 var2, String var3) {
      String var4 = var1.a().l();
      String var10000 = a(ct & cu, cv);
      NLoginCore_487 var10001 = NLoginCore_487.bx;
      Object[] var10003 = new Object[cw];
      var10003[cx] = var3;
      String var5 = String.join(var10000, NLoginCore_150.a(var10001, var2, var10003));
      NLoginCore_487 var7 = NLoginCore_487.bw;
      Object[] var10002 = new Object[cy];
      var10002[cz] = var3;
      String var6 = NLoginCore_150.a(var7, var2, var10002);
      this.a(var4, var6, var5, null);
   }

   @Override
   public void a(ForceRegisterConfig var1, NLoginCore_277 var2) {
      String var3 = var2.getName();
      String var4 = var1.a().l();
      if (!NLoginCore_311.f.b(var1, NLoginCore_137.c)) {
         String var5 = NLoginCore_354.a(NLoginCore_198.d, bn);
         NLoginCore_311.f.a(var1, var5, NLoginCore_137.c);
         String var6 = String.join(a(bo, bp ^ bq), NLoginCore_150.c(NLoginCore_487.bt)).replace(a(bs, bt ^ bu), var3).replace(a(bv & bw, bx), var5);
         String var7 = NLoginCore_150.a(NLoginCore_487.bs).replace(a(bz, ca), var3).replace(a(cb, cc), var5);
         this.a(var4, var7, var6, var1x -> {
            if (!var1x) {
               NLoginCore_311.f.a(var1, null, null);
            }
         });
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= 6164304245843914351L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(14 + 54),
                     (byte)(17 + 52),
                     (byte)(50 + 33),
                     (byte)(11 + 36),
                     (byte)(52 + 15),
                     (byte)(30 + 36),
                     (byte)(32 + 35),
                     (byte)(19 + 28),
                     80,
                     (byte)(13 + 62),
                     (byte)(62 + 5),
                     (byte)(60 + 23),
                     (byte)(4 + 49),
                     (byte)(3 + 77),
                     (byte)(42 + 55),
                     (byte)(48 + 52),
                     (byte)(23 + 77),
                     105,
                     (byte)(2 + 108),
                     (byte)(59 + 44)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(76 + 7)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.D("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴ࠸ࡇࠛࡄࡒ࠴ࡉࡒࡃࡔࡅࡓ", (byte)64, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_144.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.B("³Õ×·ÛúòĈôÃā÷ąÿÈíďĎĆČĆÛ", (byte)6, 66), NLoginCore_144.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.D("ЪзжϹйеайфгЀотлофІފޙݭޖޤކޛޤޕަޗޥО", (byte)6, 68) + var1 + NLoginCore_092.D("Ё", (byte)6, 68) + var2.toString(), var4
         );
      }
   }
}
