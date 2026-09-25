package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_317 extends NLoginCore_098 {
   private static long bh = Long.reverse(4899916394579099648L);
   private static long bk = Long.reverse(2015632717855931477L);
   private static int y = 268435456 >>> 124 | 268435456 << -124;
   private static int al = 4 >>> 33 | 4 << ~33 + 1;
   private static int bz = 1073741824 >>> 219 | 1073741824 << -219;
   private static String[] ZKM_STR_B = new String[NLoginCore_317.cb];
   private static int cb = 1 >>> 221 | 1 << -221;
   private static long by = Long.reverse(4899916394579099648L);
   private static long p = Long.reverse(2015632717855931477L);
   private static int bd = Integer.reverse(-1073741824);
   private static int m = Integer.reverse(-1);
   private static int bi = Integer.reverse(536870912);
   private static long br = Long.reverse(6915549112435031125L);
   private static long be = Long.reverse(6915549112435031125L);
   private static String[] ZKM_STR_A = new String[bz];
   private static long bm = Long.reverse(6915549112435031125L);
   private static long bs = Long.reverse(4899916394579099648L);
   private static int bp = Integer.reverse(1610612736);
   private static long bo = Long.reverse(4899916394579099648L);
   private static int bl = -2147483646 >>> 255 | -2147483646 << ~255 + 1;
   private static long o;
   private static int ao = (-1 >>> 178 | -1 << -178) & -1;
   private static long ab = Long.reverse(2015632717855931477L);
   private static int bu = 58720256 >>> 183 | 58720256 << ~183 + 1;
   private static long at = Long.reverse(2015632717855931477L);
   private static long bv = Long.reverse(6915549112435031125L);
   private static int e = 0 >>> 10 | 0 << ~10 + 1;

   public NLoginCore_317(NLoginType_008 var1) {
      super(var1, NLoginCore_479.f, a(e & m, p), a(y, ab));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_317.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.A("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 65), NLoginCore_317.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࢾࢬࢨࣇࢭࣉࣄ࣋ࢦ࣌ࣈ࣑࣍Պ", (byte)54, 69) + var1 + NLoginCore_397.E("Ԭ", (byte)54, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      File var2 = new File(this.b(), a(al & ao, at));
      this.d = NLoginCore_586.a(this.m, var2, new Properties());
   }

   private static void b() {
      o = -6179872685713055750L;
      long var0 = o ^ 1292524769632727104L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(63 + 6),
               (byte)(34 + 49),
               (byte)(11 + 36),
               (byte)(21 + 46),
               (byte)(61 + 5),
               (byte)(64 + 3),
               (byte)(4 + 43),
               (byte)(16 + 64),
               (byte)(74 + 1),
               (byte)(48 + 19),
               (byte)(15 + 68),
               53,
               (byte)(38 + 42),
               (byte)(7 + 90),
               (byte)(9 + 91),
               (byte)(34 + 66),
               (byte)(51 + 54),
               (byte)(45 + 65),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_092.E("ԏԔԓԱՇԮՍ՚ԜԾՊբԝԾՑԦԤԚԴՈԩԴԱԲ", (byte)34, 69);
               ZKM_STR_B[1] = NLoginCore_127.C("ѱў҅҅ғҐѸҙѭҎҎҋҚҡѠҡѡѿҦҤҤҁѮѯ", (byte)34, 67);
               ZKM_STR_B[2] = NLoginCore_232.F("ԯԡՂԒՌՋԗԹ\u0530ԚՓԝԹԜԵԢ՜ԸԳԿԸժԱԲ", (byte)34, 70);
               ZKM_STR_B[3] = NLoginCore_575.F("ՄՌՑԻԷՄԝԾՑԪՒԼբ՞զՑ՝՝ԺԤԵՄԱԲ", (byte)34, 70);
               ZKM_STR_B[4] = NLoginCore_387.B("ěóĳě÷ĴİĒľłľıģĸġĨėŉėŇĢęĖė", (byte)34, 66);
               ZKM_STR_B[5] = NLoginCore_471.C("ҐѧҕѱѦї҅ѩѩҐѲѣ", (byte)34, 67);
               ZKM_STR_B[6] = NLoginCore_324.F("ԑԏՆԐ\u0558ՔԼԞՍԷՊԝԸՙ՜ՠՏԞՙԪլժԱԲ", (byte)34, 70);
               ZKM_STR_B[7] = NLoginCore_433.E("ՈԸ՚ՇԷԤԻԝԮԠՋԦ", (byte)34, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.F("ԏԔԓԱՇԮՍ՚ԜԾՊՍԜաԹ՟ՏԤԸՠԝ՚ԱԲ", (byte)34, 70);
               ZKM_STR_B[1] = NLoginCore_201.F("ԴԡՈՈՖՓԻ՜\u0530ՑՑԘՏԼդՂ՟ԢԼ՜՛ԴԱԲ", (byte)34, 70);
               ZKM_STR_B[2] = NLoginCore_223.F("ԯԡՂԒՌՋԗԹ\u0530ԚՖԝԶ՟ԤԴՇՇԷԨԻԴԱԲ", (byte)34, 70);
               ZKM_STR_B[3] = NLoginCore_076.D("ҁ҉ҎѸѴҁњѻҎѧҏѪҕѩјғҍћѸѥ҈ҁѮѯ", (byte)34, 68);
               ZKM_STR_B[4] = NLoginCore_110.B("ěóĳě÷ĴİĒľłĽĀľňķěĿŉōŅŁŏĖė", (byte)34, 66);
               ZKM_STR_B[5] = NLoginCore_451.A("īĭøĪĞĒĊŁĲĕĀńŇĵĤćğķĤėŊĩĖė", (byte)34, 65);
               ZKM_STR_B[6] = NLoginCore_451.A("öôīõĽĹġăĲĜħŇğĸĩŋĻăėŎĢŏĖė", (byte)34, 65);
               ZKM_STR_B[7] = NLoginCore_223.E("ԷԒԱՈԚ\u0558ԸԨՈ\u0530Ԛԟ՞բ՛Ԟ՚ՑժՕեԴԱԲ", (byte)34, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.A("óıľĸĔġĔłŃŀĸĒĤňĸĂĽăĨĭŐŒįņģģĳĴİŗĵĩ", (byte)34, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_076.E("ԑԑԹԢՃԱԕԕԙԠԾԡԬ\u0557ԯԶ՚ՅԦՃԵ՚ԱԲ", (byte)34, 69);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 34L;
      var1 ^= 1292524769632727104L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(60 + 9),
                     (byte)(50 + 33),
                     (byte)(3 + 44),
                     (byte)(12 + 55),
                     (byte)(41 + 25),
                     (byte)(18 + 49),
                     (byte)(12 + 35),
                     (byte)(79 + 1),
                     (byte)(43 + 32),
                     (byte)(27 + 40),
                     (byte)(17 + 66),
                     (byte)(30 + 23),
                     (byte)(47 + 33),
                     (byte)(48 + 49),
                     (byte)(77 + 23),
                     100,
                     (byte)(12 + 93),
                     110,
                     (byte)(77 + 26)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.E("ԽՊՉԌՌՈՃՌ\u0557ՆԓՑՕՎՑ\u0557ԙࢦ\u0894\u0890ࢯ\u0895ࢱࢬࢳࢎࢴࢰࢹࢵ", (byte)30, 69));
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
   public File b() {
      return super.b();
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(bd, be ^ bh));
      String var2 = var1.getString(a(bi, bk));
      String var3 = var1.getString(a(bl, bm ^ bo));
      long var4 = var1.getLong(a(bp, br ^ bs));
      long var6 = var1.getLong(a(bu, bv ^ by));
      this.a(this.r, var2, var3, null, var4x -> var4x.a(var6, var4));
   }
}
