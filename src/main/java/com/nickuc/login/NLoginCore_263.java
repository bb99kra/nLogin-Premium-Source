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

public class NLoginCore_263 extends NLoginCore_098 {
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
   private static String[] ZKM_STR_B = new String[NLoginCore_263.db];
   private static int bp = Integer.reverse(-1);
   private static int bd = 3145728 >>> 180 | 3145728 << ~180 + 1;
   private static long cx = Long.reverse(-7061644215716937728L);
   private static String[] ZKM_STR_A = new String[NLoginCore_263.da];
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

   public NLoginCore_263(NLoginType_008 var1) {
      super(var1, NLoginCore_479.B, a(e, p), a(y, ab ^ ac));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(bd, be ^ bh));
      String var2 = var1.getString(a(bi, bk ^ bm));
      String var3 = var1.getString(a(bn & bp, br)).toUpperCase(Locale.ENGLISH);
      int var5 = bu;
      switch (var3.hashCode()) {
         case -1850268089:
            if (var3.equals(a(cb, cd))) {
               var5 = ce;
            }
            break;
         case -1850265334:
            if (var3.equals(a(cg, ci))) {
               var5 = cj;
            }
            break;
         case 76158:
            if (var3.equals(a(bw, by))) {
               var5 = bz;
            }
            break;
         case 1953930828:
            if (var3.equals(a(cm, cn ^ cp))) {
               var5 = cr;
            }
      }

      switch (var5) {
         case 0:
         case 1:
         case 2:
            var2 = a(cs, ct ^ cu) + var3 + a(cv, cw ^ cx) + var2;
         case 3:
            String var4 = var1.getString(a(cy, cz));
            this.a(this.r, var2, var4, null);
            return;
         default:
            this.e(this.r, var2, var3);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 121L;
      var1 ^= 2437385693199204834L;
      if (ZKM_STR_A[var0] == null) {
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
            throw new RuntimeException(NLoginCore_471.B("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѦѡїѥљѭѨѱшѶёѲыѲѳ", (byte)14, 66));
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
               ZKM_STR_B[0] = NLoginCore_530.C("ԹԄԤՁԛԪԥՇՊԋԏԫԱԏՆՕԤԫԗԲՎ՞ԥԦ", (byte)95, 67);
               ZKM_STR_B[1] = NLoginCore_201.C("ԖԌՀՇԏԦԟՅ\u0530ԢՍԔՈԓԋԹԺԱՍՋ\u0530ԨԥԦ", (byte)95, 67);
               ZKM_STR_B[2] = NLoginCore_127.D("ՂԔԄԼԏԍԉԠԻԍՋԚ", (byte)95, 68);
               ZKM_STR_B[3] = NLoginCore_553.B("ŲſƨƘƲƥƩƻƌƬƺƅ", (byte)95, 66);
               ZKM_STR_B[4] = NLoginCore_127.E("թճ֖ցրլՙդնճվծ֞Փյփծց֙ն֠֗ծկ", (byte)95, 69);
               ZKM_STR_B[5] = NLoginCore_223.C("ԝՀՈԾԍԍՒԼԼԳԥԚ", (byte)95, 67);
               ZKM_STR_B[6] = NLoginCore_324.A("ƎƫƙųƭŴƜƘƧƗƪƅ", (byte)95, 65);
               ZKM_STR_B[7] = NLoginCore_324.D("ԅԫԇԦԾԧԜԄՔԭՇԚ", (byte)95, 68);
               ZKM_STR_B[8] = NLoginCore_446.A("ůųƧƶƥƲƐŶŹŸƺƅ", (byte)95, 65);
               ZKM_STR_B[9] = NLoginCore_451.B("ƆƘƮƩƯƍƹƘƈƏſƅ", (byte)95, 66);
               ZKM_STR_B[10] = NLoginCore_223.E("ՠղր֓֙օծօծ֝֔գ", (byte)95, 69);
               ZKM_STR_B[11] = NLoginCore_427.B("ƂƔƢƵƻƧƐƧƐƿƶƅ", (byte)95, 66);
               ZKM_STR_B[12] = NLoginCore_397.E("ՏՑտհխ֚ղ֖֊կ֔գ", (byte)95, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_173.D("ԹԄԤՁԛԪԥՇՊԋԍԖԣԎՒՃԘՌՐԳԟԸԥԦ", (byte)95, 68);
               ZKM_STR_B[1] = NLoginCore_241.C("ԖԌՀՇԏԦԟՅ\u0530ԢՌ\u0557ՂԶՑԔԺԽՙԪՊՎԥԦ", (byte)95, 67);
               ZKM_STR_B[2] = NLoginCore_173.D("ԨԺՌԾԋՆԇԑՎԍԔԪԵՒԺԻՕՉԖԞՎԨԥԦ", (byte)95, 68);
               ZKM_STR_B[3] = NLoginCore_183.B("ƗƸŮƖŲƄƮƺƜƑƺƅ", (byte)95, 66);
               ZKM_STR_B[4] = NLoginCore_027.F("թճ֖ցրլՙդնճվժ֏ճ՜\u0590ւ֝պպք֧ծկ", (byte)95, 70);
               ZKM_STR_B[5] = NLoginCore_223.C("ԴՆԖԇԝԂՆՂՔՋՉԵԷԫԘՖԦԧՕ\u0558ՌՎԥԦ", (byte)95, 67);
               ZKM_STR_B[6] = NLoginCore_091.B("ƍƎŶƱƍƒƨƴźƗƘƅ", (byte)95, 66);
               ZKM_STR_B[7] = NLoginCore_446.D("ԨԧԢԎԥՉԺԫՌՇՃՕԲՕՙԺԥՓԘՖՠԸԥԦ", (byte)95, 68);
               ZKM_STR_B[8] = NLoginCore_173.D("ԣԡԕԝԬԥՅԑԪԤԌՓՏԒԒՆ\u0558ՈԚԫՓԨԥԦ", (byte)95, 68);
               ZKM_STR_B[9] = NLoginCore_141.F("՞Վծՠՠի֊օֆ։֑լ֓ւ֒մ֢֤ք֕ո֧ծկ", (byte)95, 70);
               ZKM_STR_B[10] = NLoginCore_446.B("ƆƨűƇƒƜƴƚƷƜƲƅ", (byte)95, 66);
               ZKM_STR_B[11] = NLoginCore_553.F("եփօ\u058bՕն֗ձլ֜ՙգ", (byte)95, 70);
               ZKM_STR_B[12] = NLoginCore_223.E("սևՔ֍ժՙղղլ֍նգ", (byte)95, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.F("էբօեթղ֘Ք\u058b֜՜և\u0558֑֏֖լ֕ջ֛փցծկ", (byte)95, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.B("ŮƈŲƑƏƨƬƛƉƶƴƓƷźƃƻǂƞƂǈǄƿƴǁƊƻǅƞƚƋƞƮ", (byte)95, 66);
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
                  NLoginCore_263.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.C("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)88, 67), NLoginCore_263.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.E("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փ࣐࣒ࣦࣟࣚࣞ࣡࣪ࣁ࣯࣊࣫ࣄ࣫࣬ծ", (byte)88, 69) + var1 + NLoginCore_076.B("ũ", (byte)88, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      File var2 = new File(this.b(), a(al & ao, at));
      this.d = NLoginCore_586.a(this.m, var2, new Properties());
   }
}
