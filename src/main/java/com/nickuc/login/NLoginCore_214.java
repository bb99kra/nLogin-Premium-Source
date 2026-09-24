package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_214 {
   a(a(NLoginCore_214.at, NLoginCore_214.au ^ NLoginCore_214.av)),
   b(a(NLoginCore_214.ba, NLoginCore_214.bb ^ NLoginCore_214.bc)),
   c(a(NLoginCore_214.bh, NLoginCore_214.bi)),
   d(a(NLoginCore_214.bn & NLoginCore_214.bo, NLoginCore_214.bp)),
   e(a(NLoginCore_214.bu & NLoginCore_214.bv, NLoginCore_214.bw));

   private final String S;
   private static String[] a = new String[NLoginCore_214.an];
   private static String[] b = new String[NLoginCore_214.ao];
   private static long c;
   private static int a = (-1 >>> 192 | -1 << ~192 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static long d = Long.reverse(-7044609931319461281L);
   private static long e = Long.reverse(1441151880758558720L);
   private static int f = Integer.reverse(0);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long h = Long.reverse(-7044609931319461281L);
   private static long i = Long.reverse(1441151880758558720L);
   private static int j = 4 >>> 98 | 4 << -98;
   private static int k = Integer.reverse(1073741824);
   private static long l = Long.reverse(-7044609931319461281L);
   private static long m = Long.reverse(1441151880758558720L);
   private static int n = Integer.reverse(1073741824);
   private static int o = '쀀' >>> 142 | 49152 << ~142 + 1;
   private static long p = Long.reverse(-7044609931319461281L);
   private static long q = Long.reverse(1441151880758558720L);
   private static int r = '쀀' >>> 142 | 49152 << -142;
   private static int s = Integer.reverse(536870912);
   private static long t = Long.reverse(-7044609931319461281L);
   private static long u = Long.reverse(1441151880758558720L);
   private static int v = Integer.reverse(536870912);
   private static int w = 20480 >>> 108 | 20480 << -108;
   private static long x = Long.reverse(-7044609931319461281L);
   private static long y = Long.reverse(1441151880758558720L);
   private static int z = (41943040 >>> 183 | 41943040 << -183) & -1;
   private static int aa = '쀀' >>> 237 | 49152 << -237;
   private static int ab = (-1 >>> 179 | -1 << -179) & -1;
   private static long ac = Long.reverse(-8485761812078020001L);
   private static int ad = -1073741824 >>> 189 | -1073741824 << ~189 + 1;
   private static int ae = 14680064 >>> 213 | 14680064 << ~213 + 1;
   private static long af = Long.reverse(-8485761812078020001L);
   private static int ag = (224 >>> 69 | 224 << ~69 + 1) & -1;
   private static int ah = 160 >>> 133 | 160 << ~133 + 1;
   private static int ai = (0 >>> 113 | 0 << -113) & -1;
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = Integer.reverse(1073741824);
   private static int al = Integer.reverse(-1073741824);
   private static int am = 16384 >>> 140 | 16384 << -140;
   private static int an = Integer.reverse(1207959552);
   private static int ao = 9 >>> 31 | 9 << ~31 + 1;
   private static int ap = (8 >>> 64 | 8 << ~64 + 1) & -1;
   private static int aq = Integer.reverse(-1);
   private static long ar = Long.reverse(-8485761812078020001L);
   private static int as = Integer.reverse(0);
   private static int at = (603979776 >>> 58 | 603979776 << ~58 + 1) & -1;
   private static long au = Long.reverse(-7044609931319461281L);
   private static long av = Long.reverse(1441151880758558720L);
   private static int aw = Integer.reverse(1342177280);
   private static long ax = Long.reverse(-7044609931319461281L);
   private static long ay = Long.reverse(1441151880758558720L);
   private static int az = (2097152 >>> 213 | 2097152 << ~213 + 1) & -1;
   private static int ba = Integer.reverse(-805306368);
   private static long bb = Long.reverse(-7044609931319461281L);
   private static long bc = Long.reverse(1441151880758558720L);
   private static int bd = Integer.reverse(805306368);
   private static long be = Long.reverse(-7044609931319461281L);
   private static long bf = Long.reverse(1441151880758558720L);
   private static int bg = (8 >>> 2 | 8 << -2) & -1;
   private static int bh = Integer.reverse(-1342177280);
   private static long bi = Long.reverse(-8485761812078020001L);
   private static int bj = (3670016 >>> 178 | 3670016 << -178) & -1;
   private static int bk = Integer.reverse(-1);
   private static long bl = Long.reverse(-8485761812078020001L);
   private static int bm = 12 >>> 2 | 12 << -2;
   private static int bn = Integer.reverse(-268435456);
   private static int bo = Integer.reverse(-1);
   private static long bp = Long.reverse(-8485761812078020001L);
   private static int bq = Integer.reverse(134217728);
   private static long br = Long.reverse(-7044609931319461281L);
   private static long bs = Long.reverse(1441151880758558720L);
   private static int bt = Integer.reverse(536870912);
   private static int bu = 34 >>> 129 | 34 << -129;
   private static int bv = Integer.reverse(-1);
   private static long bw = Long.reverse(-8485761812078020001L);

   @Generated
   private NLoginCore_214(String var3) {
      this.S = var3;
   }

   private static void b() {
      c = -405955743651382151L;
      long var0 = c ^ 5142098516373544963L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(36 + 33),
               (byte)(11 + 72),
               (byte)(43 + 4),
               67,
               (byte)(51 + 15),
               67,
               (byte)(46 + 1),
               (byte)(41 + 39),
               (byte)(61 + 14),
               (byte)(48 + 19),
               (byte)(8 + 75),
               (byte)(32 + 21),
               (byte)(10 + 70),
               (byte)(54 + 43),
               (byte)(31 + 69),
               (byte)(66 + 34),
               (byte)(41 + 64),
               (byte)(8 + 102),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_453.A("ÊĀçÍúËĎÓÐóêÛ", (byte)10, 65);
               b[1] = NLoginCore_387.E("ԕԺԟԵԜՁՅԶԄԩԑԎ", (byte)10, 69);
               b[2] = NLoginCore_091.E("ӽԮӹԚԒՃԝԓԷԜԈԎ", (byte)10, 69);
               b[3] = NLoginCore_387.E("ԬԸӷՃԔԎԖԛԳԁԿԎ", (byte)10, 69);
               b[4] = NLoginCore_232.C("ЌЅЎЌЭэъсРЫжЛ", (byte)10, 67);
               b[5] = NLoginCore_427.C("ЈпуЭЯнЮШфшЍЭЪШДЕьєЫигйЦЧ", (byte)10, 67);
               b[6] = NLoginCore_076.F("ӻԲԶԠԢ\u0530ԡԛԷԻԃՆԙՃԛՊԋԹՑԥԠԜԙԚ", (byte)10, 70);
               b[7] = NLoginCore_173.C("ЪЩрМцЩЏямѕяжИЯЦйнМдПьяЦЧ", (byte)10, 67);
               b[8] = NLoginCore_521.C("ЊрЧЍкЋюГАгЪЛ", (byte)10, 67);
               b[9] = NLoginCore_427.F("ӽԳԚԀԭӾՁԆԃԦԝԎ", (byte)10, 70);
               b[10] = NLoginCore_324.D("ЊлІЧПѐЪРфЩЕЛ", (byte)10, 68);
               b[11] = NLoginCore_241.F("ӽԮӹԚԒՃԝԓԷԜԈԎ", (byte)10, 70);
               b[12] = NLoginCore_138.E("ԜӽӳԮԐԂԯԆԕ\u0530ՉԈӽԪԼԇԋՂԜԉԿՒԙԚ", (byte)10, 69);
               b[13] = NLoginCore_427.C("ЊцЫЪцЭаШдВвЛ", (byte)10, 67);
               b[14] = NLoginCore_530.C("ЩЊЀлНЏмГТніуВаЮюЎцЧщвЩЦЧ", (byte)10, 67);
               b[15] = NLoginCore_451.A("çăæØáýĆďćàâÛ", (byte)10, 65);
               b[16] = NLoginCore_027.C("ЗыунЌЦбХУщЈПхфщЕѕЮўШмЩЦЧ", (byte)10, 67);
               b[17] = NLoginCore_559.E("ӻԜԁԝԁԿԮՃԏԔԤԩՋԺӿԣՈՍԤՐԅԜԙԚ", (byte)10, 69);
               break;
            case 1:
               b[0] = NLoginCore_575.A("ûõÙúëðąëććÎăçïçéÖĈĕÿĘğæç", (byte)10, 65);
               b[1] = NLoginCore_223.B("ùè÷üàðÿĀîáöåóĊĐçÚ×êÞÝğæç", (byte)10, 66);
               b[2] = NLoginCore_387.E("ԯԍՁӹӾӽԹԿՆԽԦԟԨԤԷԆՊՈՃԏՊԬԙԚ", (byte)10, 69);
               b[3] = NLoginCore_451.D("ИъФЁчвЪѓъэуРётыЖаїАНняЦЧ", (byte)10, 68);
               b[4] = NLoginCore_173.D("ЕЕлшІѐМЍмєяшеЗеЛїцЖШзйЦЧ", (byte)10, 68);
               b[5] = NLoginCore_076.D("ЈпуЭЯнЮШфшЎвйЧєЬгѓьпЖџЦЧ", (byte)10, 68);
               b[6] = NLoginCore_559.B("ÈÿăíïýîèĄĈÎõĀėóĘćĒëçĒďæç", (byte)10, 66);
               b[7] = NLoginCore_183.D("ЪЩрМцЩЏямѕябдяцдЯиЙюійЦЧ", (byte)10, 68);
               b[8] = NLoginCore_559.F("ӵԹԵԀӼӽԸԔԱԟԞԵԛՌԢԇԩՁԐԟԼԬԙԚ", (byte)10, 70);
               b[9] = NLoginCore_553.C("щЛХяРфђьюЯФюёУщыияѝщИйЦЧ", (byte)10, 67);
               b[10] = NLoginCore_521.D("УЦМмПБнФмдЯЮѓШЖђГЕИЖќЩЦЧ", (byte)10, 68);
               b[11] = NLoginCore_575.F("ԠԈԿՂӾԱԺՁԀԴԹԟՅԃԋԢԉՆԐԧԏԬԙԚ", (byte)10, 70);
               b[12] = NLoginCore_173.C("ЩЊЀлНЏмГТнідЬйФицЧЮўЫяЦЧ", (byte)10, 67);
               b[13] = NLoginCore_201.F("ԋԺԚԎԳԮԥԮԿԇԄԎ", (byte)10, 70);
               b[14] = NLoginCore_521.B("éÊÀûÝÏüÓâýĔãĉĚęÕĄúċþëďæç", (byte)10, 66);
               b[15] = NLoginCore_141.E("ӽԐԜԚԿԑԳԳԺԈԳԎ", (byte)10, 69);
               b[16] = NLoginCore_433.A("×ċăýÌæñåãĉÌÕėďëüĔçñĠØďæç", (byte)10, 65);
               b[17] = NLoginCore_553.A("ÈéÎêÎČûĐÜáðăĐÐĒéċèČċØğæç", (byte)10, 65);
               break;
            case 2:
               b[0] = NLoginCore_387.D("ЗчщСПшщюМЪгуіхаЍлнбоѠяЦЧ", (byte)10, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.A("ÆÆÅçÝãòâĂĖáïēúĕąæôĈÚċĝĎìĔôąĀĒÿāė", (byte)10, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 40L;
      var1 ^= 5142098516373544963L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(61 + 7),
                     (byte)(45 + 24),
                     (byte)(22 + 61),
                     (byte)(21 + 26),
                     (byte)(50 + 17),
                     (byte)(44 + 22),
                     (byte)(64 + 3),
                     47,
                     (byte)(18 + 62),
                     (byte)(13 + 62),
                     (byte)(5 + 62),
                     (byte)(29 + 54),
                     (byte)(29 + 24),
                     (byte)(55 + 25),
                     (byte)(91 + 6),
                     (byte)(31 + 69),
                     (byte)(57 + 43),
                     (byte)(80 + 25),
                     (byte)(98 + 12),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж\u07bcߌ߀ޱ߃߆ߋߌߍߗߔ", (byte)22, 68));
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
                  NLoginCore_214.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.B("«ÍÏ¯ÓòêĀì»ùïý÷ÀåćĆþĄþÓ", (byte)2, 66), NLoginCore_214.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_141.C("ОЫЪϭЭЩФЭиЧϴвжЯвиϺހސބݵއފޏސޑޛޘБ", (byte)2, 67) + var1 + NLoginCore_575.C("ϵ", (byte)2, 67) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   @Nullable
   private static NLoginCore_214 a(String var0) {
      String var1 = var0.toUpperCase(Locale.ENGLISH);
      int var2 = a;
      switch (var1.hashCode()) {
         case -1850268089:
            if (var1.equals(a(b, d ^ e))) {
               var2 = f;
            }
            break;
         case -1850265334:
            if (var1.equals(a(k, l ^ m))) {
               var2 = n;
            }
            break;
         case -1523887726:
            if (var1.equals(a(g, h ^ i))) {
               var2 = j;
            }
            break;
         case -1523884971:
            if (var1.equals(a(o, p ^ q))) {
               var2 = r;
            }
            break;
         case -138420880:
            if (var1.equals(a(w, x ^ y))) {
               var2 = z;
            }
            break;
         case -138420856:
            if (var1.equals(a(aa & ab, ac))) {
               var2 = ad;
            }
            break;
         case 579484053:
            if (var1.equals(a(ae, af))) {
               var2 = ag;
            }
            break;
         case 1953930828:
            if (var1.equals(a(s, t ^ u))) {
               var2 = v;
            }
      }

      switch (var2) {
         case 0:
         case 1:
            return a;
         case 2:
         case 3:
            return b;
         case 4:
         case 5:
            return c;
         case 6:
            return d;
         case 7:
            return e;
         default:
            return null;
      }
   }
}
