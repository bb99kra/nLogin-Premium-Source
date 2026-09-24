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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class κδΩζΩμζξΔρΛλΓιι extends ξΠτΣτγαψηρψΓΠτξ {
   private static long o;
   private static int cy = Integer.reverse(805306368);
   private static long ab = Long.reverse(1766771940589646713L);
   private static long cd = Long.reverse(-8753636788947831943L);
   private static int cj = 64 >>> 37 | 64 << ~37 + 1;
   private static long br = Long.reverse(-8753636788947831943L);
   private static long at = Long.reverse(-8753636788947831943L);
   private static int cv = Integer.reverse(-805306368);
   private static int bz = Integer.reverse(0);
   private static long cz = Long.reverse(-8753636788947831943L);
   private static int cg = (4194304 >>> 211 | 4194304 << ~211 + 1) & -1;
   private static int ce = Integer.reverse(Integer.MIN_VALUE);
   private static long bm = Long.reverse(-7061644215716937728L);
   private static long p = Long.reverse(-8753636788947831943L);
   private static int al = Integer.reverse(1073741824);
   private static int cr = Integer.reverse(-1073741824);
   private static long be = Long.reverse(1766771940589646713L);
   private static int bw = Integer.reverse(1610612736);
   private static int ao = Integer.reverse(-1);
   private static long cn = Long.reverse(1766771940589646713L);
   private static String[] f = new String[κδΩζΩμζξΔρΛλΓιι.db];
   private static int bp = Integer.reverse(-1);
   private static int bd = 3145728 >>> 180 | 3145728 << ~180 + 1;
   private static long cx = Long.reverse(-7061644215716937728L);
   private static String[] e = new String[κδΩζΩμζξΔρΛλΓιι.da];
   private static int e = (0 >>> 164 | 0 << ~164 + 1) & -1;
   private static long cp = Long.reverse(-7061644215716937728L);
   private static long bk = Long.reverse(1766771940589646713L);
   private static long ci = Long.reverse(-8753636788947831943L);
   private static int bu = Integer.reverse(-1);
   private static int db = Integer.reverse(-1342177280);
   private static int cs = -2147483646 >>> 126 | -2147483646 << -126;
   private static int bn = (167772160 >>> 153 | 167772160 << ~153 + 1) & -1;
   private static long by = Long.reverse(-8753636788947831943L);
   private static long ac = Long.reverse(-7061644215716937728L);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static long cu = Long.reverse(-7061644215716937728L);
   private static long cw = Long.reverse(1766771940589646713L);
   private static long ct = Long.reverse(1766771940589646713L);
   private static int cb = Integer.reverse(-536870912);
   private static long bh = Long.reverse(-7061644215716937728L);
   private static int da = (-805306368 >>> 252 | -805306368 << -252) & -1;
   private static int cm = 144 >>> 164 | 144 << -164;
   private static int bi = (64 >>> 68 | 64 << -68) & -1;

   public κδΩζΩμζξΔρΛλΓιι(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.B, c<"㺀">(e, p), c<"㺃">(y, ab ^ ac));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(c<"㺀">(bd, be ^ bh));
      String var2 = var1.getString(c<"㺃">(bi, bk ^ bm));
      String var3 = var1.getString(c<"㺆">(bn & bp, br)).toUpperCase(Locale.ENGLISH);
      int var5 = bu;
      switch (var3.hashCode()) {
         case -1850268089:
            if (var3.equals(c<"㺌">(cb, cd))) {
               var5 = ce;
            }
            break;
         case -1850265334:
            if (var3.equals(c<"㺏">(cg, ci))) {
               var5 = cj;
            }
            break;
         case 76158:
            if (var3.equals(c<"㺉">(bw, by))) {
               var5 = bz;
            }
            break;
         case 1953930828:
            if (var3.equals(c<"㺒">(cm, cn ^ cp))) {
               var5 = cr;
            }
      }

      switch (var5) {
         case 0:
         case 1:
         case 2:
            var2 = c<"㺕">(cs, ct ^ cu) + var3 + c<"㺘">(cv, cw ^ cx) + var2;
         case 3:
            String var4 = var1.getString(c<"㺛">(cy, cz));
            this.a(this.r, var2, var4, null);
            return;
         default:
            this.e(this.r, var2, var3);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 121L;
      var1 ^= 2437385693199204834L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(50 + 19),
                     (byte)(24 + 59),
                     (byte)(29 + 18),
                     (byte)(11 + 56),
                     (byte)(30 + 36),
                     (byte)(46 + 21),
                     (byte)(36 + 11),
                     (byte)(20 + 60),
                     (byte)(8 + 67),
                     (byte)(58 + 9),
                     (byte)(76 + 7),
                     (byte)(48 + 5),
                     (byte)(33 + 47),
                     (byte)(59 + 38),
                     (byte)(86 + 14),
                     (byte)(95 + 5),
                     (byte)(20 + 85),
                     (byte)(7 + 103),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), (byte)(50 + 33)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(οοθδΨιοΦΠβδζ.B("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѦѡїѥљѭѨѱшѶёѲыѲѳ", (byte)14, 66));
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
      o = -7004047707347410664L;
      long var0 = o ^ 2437385693199204834L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(12 + 57),
               83,
               (byte)(25 + 22),
               (byte)(59 + 8),
               (byte)(26 + 40),
               (byte)(48 + 19),
               (byte)(19 + 28),
               (byte)(66 + 14),
               (byte)(22 + 53),
               (byte)(41 + 26),
               (byte)(62 + 21),
               (byte)(21 + 32),
               (byte)(72 + 8),
               (byte)(91 + 6),
               (byte)(40 + 60),
               (byte)(78 + 22),
               (byte)(50 + 55),
               (byte)(107 + 3),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
               f[0] = θεωψξβΛσσ.C("ԹԄԤՁԛԪԥՇՊԋԏԫԱԏՆՕԤԫԗԲՎ՞ԥԦ", (byte)95, 67);
               f[1] = πψυκΠΨμΛΩβΣφμφσ.C("ԖԌՀՇԏԦԟՅ\u0530ԢՍԔՈԓԋԹԺԱՍՋ\u0530ԨԥԦ", (byte)95, 67);
               f[2] = ΨΦνΨΦωυΩνβςμ.D("ՂԔԄԼԏԍԉԠԻԍՋԚ", (byte)95, 68);
               f[3] = λΣΩσμφγχ.B("ŲſƨƘƲƥƩƻƌƬƺƅ", (byte)95, 66);
               f[4] = ΨΦνΨΦωυΩνβςμ.E("թճ֖ցրլՙդնճվծ֞Փյփծց֙ն֠֗ծկ", (byte)95, 69);
               f[5] = βεξΠθρρςΔΦμ.C("ԝՀՈԾԍԍՒԼԼԳԥԚ", (byte)95, 67);
               f[6] = ςΦζσμτΓσ.A("ƎƫƙųƭŴƜƘƧƗƪƅ", (byte)95, 65);
               f[7] = ςΦζσμτΓσ.D("ԅԫԇԦԾԧԜԄՔԭՇԚ", (byte)95, 68);
               f[8] = μζξτΩσσφυδεπλΨ.A("ůųƧƶƥƲƐŶŹŸƺƅ", (byte)95, 65);
               f[9] = ΣφδσΔζιΠρα.B("ƆƘƮƩƯƍƹƘƈƏſƅ", (byte)95, 66);
               f[10] = βεξΠθρρςΔΦμ.E("ՠղր֓֙օծօծ֝֔գ", (byte)95, 69);
               f[11] = ιΠοθΩΦξκ.B("ƂƔƢƵƻƧƐƧƐƿƶƅ", (byte)95, 66);
               f[12] = οΩνΩρωλΨηΛδωδ.E("ՏՑտհխ֚ղ֖֊կ֔գ", (byte)95, 69);
               break;
            case 1:
               f[0] = βθκςνθΩθυμςτκχ.D("ԹԄԤՁԛԪԥՇՊԋԍԖԣԎՒՃԘՌՐԳԟԸԥԦ", (byte)95, 68);
               f[1] = ΣερμΔσατσκ.C("ԖԌՀՇԏԦԟՅ\u0530ԢՌ\u0557ՂԶՑԔԺԽՙԪՊՎԥԦ", (byte)95, 67);
               f[2] = βθκςνθΩθυμςτκχ.D("ԨԺՌԾԋՆԇԑՎԍԔԪԵՒԺԻՕՉԖԞՎԨԥԦ", (byte)95, 68);
               f[3] = δΛψπξκσβγςα.B("ƗƸŮƖŲƄƮƺƜƑƺƅ", (byte)95, 66);
               f[4] = ζβησεθωυγτ.F("թճ֖ցրլՙդնճվժ֏ճ՜\u0590ւ֝պպք֧ծկ", (byte)95, 70);
               f[5] = βεξΠθρρςΔΦμ.C("ԴՆԖԇԝԂՆՂՔՋՉԵԷԫԘՖԦԧՕ\u0558ՌՎԥԦ", (byte)95, 67);
               f[6] = ΠΛΨοδΩσμνΛγΦφβς.B("ƍƎŶƱƍƒƨƴźƗƘƅ", (byte)95, 66);
               f[7] = μζξτΩσσφυδεπλΨ.D("ԨԧԢԎԥՉԺԫՌՇՃՕԲՕՙԺԥՓԘՖՠԸԥԦ", (byte)95, 68);
               f[8] = βθκςνθΩθυμςτκχ.D("ԣԡԕԝԬԥՅԑԪԤԌՓՏԒԒՆ\u0558ՈԚԫՓԨԥԦ", (byte)95, 68);
               f[9] = ξψθρΣΠΣς.F("՞Վծՠՠի֊օֆ։֑լ֓ւ֒մ֢֤ք֕ո֧ծկ", (byte)95, 70);
               f[10] = μζξτΩσσφυδεπλΨ.B("ƆƨűƇƒƜƴƚƷƜƲƅ", (byte)95, 66);
               f[11] = λΣΩσμφγχ.F("եփօ\u058bՕն֗ձլ֜ՙգ", (byte)95, 70);
               f[12] = βεξΠθρρςΔΦμ.E("սևՔ֍ժՙղղլ֍նգ", (byte)95, 69);
               break;
            case 2:
               f[0] = ντθΔζβΔζ.F("էբօեթղ֘Ք\u058b֜՜և\u0558֑֏֖լ֕ջ֛փցծկ", (byte)95, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = ζβησεθωυγτ.B("ŮƈŲƑƏƨƬƛƉƶƴƓƷźƃƻǂƞƂǈǄƿƴǁƊƻǅƞƚƋƞƮ", (byte)95, 66);
         }
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κδΩζΩμζξΔρΛλΓιι.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πχσδΦΦνθΔπ.C("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)88, 67), κδΩζΩμζξΔρΛλΓιι.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.E("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փ࣐࣒ࣦࣟࣚࣞ࣡࣪ࣁ࣯࣊࣫ࣄ࣫࣬ծ", (byte)88, 69) + var1 + ΣδτΠνεγοΓορητ.B("ũ", (byte)88, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void c(τφθχΔαΣγτφς var1) {
      File var2 = new File(this.b(), c<"㺀">(al & ao, at));
      this.d = ΩαυΩξτκΛ.a(this.m, var2, new Properties());
   }
}
