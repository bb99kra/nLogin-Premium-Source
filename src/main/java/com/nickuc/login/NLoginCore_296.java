package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_296 extends NLoginCore_353 {
   private static long e = Long.reverse(576460752303423488L);
   private static int h = Integer.reverse(0);
   private static int j = (8192 >>> 140 | 8192 << ~140 + 1) & -1;
   private static long r = Long.reverse(-7047809977831099304L);
   private static long w = Long.reverse(576460752303423488L);
   private static long m = Long.reverse(-7624270730134522792L);
   private static long ab = Long.reverse(-7047809977831099304L);
   private static long ae = Long.reverse(576460752303423488L);
   private static int u = 16384 >>> 12 | 16384 << -12;
   private static int p = Integer.reverse(-1073741824);
   private static long v = Long.reverse(-7624270730134522792L);
   private static String[] a = new String[NLoginCore_296.ah];
   private static int ai = (14680064 >>> 21 | 14680064 << ~21 + 1) & -1;
   private static int ac = Integer.reverse(1610612736);
   private static int ah = 3670016 >>> 51 | 3670016 << -51;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int q = (-1 >>> 9 | -1 << -9) & -1;
   private static long d = Long.reverse(-7624270730134522792L);
   private static String[] b = new String[ai];
   private static long c;
   private static int z = 640 >>> 103 | 640 << -103;
   private static int s = 2 >>> 161 | 2 << ~161 + 1;
   private static long g = Long.reverse(-7047809977831099304L);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int c = 0 >>> 68 | 0 << -68;
   private static long n = Long.reverse(576460752303423488L);
   private static long ad = Long.reverse(-7624270730134522792L);
   private static int y = 0 >>> 151 | 0 << -151;
   private static int ag = Integer.reverse(0);
   private static int af = 0 >>> 205 | 0 << ~205 + 1;
   private static int i = (0 >>> 252 | 0 << ~252 + 1) & -1;
   private static int x = 2 >>> 1 | 2 << -1;
   private static int k = 0 >>> 185 | 0 << ~185 + 1;
   private static int aa = Integer.reverse(-1);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int l = Integer.reverse(1073741824);

   public NLoginCore_296(NLoginType_008 var1) {
      String var10002 = a(c, d ^ e);
      String var10003 = a(f, g);
      int var10004 = h;
      int var10005 = i;
      String[] var10006 = new String[j];
      var10006[k] = a(l, m ^ n);
      var10006[o] = a(p & q, r);
      super(var1, var10002, var10003, (boolean)var10004, (boolean)var10005, var10006);
   }

   private static String a(int var0, long var1) {
      var1 ^= 16L;
      var1 ^= 7707795042888235717L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(67 + 1),
                     (byte)(47 + 22),
                     (byte)(59 + 24),
                     (byte)(29 + 18),
                     (byte)(44 + 23),
                     (byte)(64 + 2),
                     (byte)(60 + 7),
                     (byte)(33 + 14),
                     (byte)(34 + 46),
                     (byte)(65 + 10),
                     (byte)(9 + 58),
                     (byte)(67 + 16),
                     (byte)(3 + 50),
                     (byte)(60 + 20),
                     97,
                     (byte)(37 + 63),
                     (byte)(4 + 96),
                     (byte)(38 + 67),
                     (byte)(104 + 6),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(15 + 54), (byte)(11 + 72)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.D("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤ\u085f\u086eࡲ\u086eࡍࡴࡐࡐࡺࡒࡠ", (byte)80, 68));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_296.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝\u0557ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_296.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.E("ՆՓՒԕՕՑՌՕՠՏԜ՚՞\u0557՚ՠԢ࢝ࢬࢰࢬࢋࢲࢎࢎࢸ\u0890࢞Թ", (byte)39, 69) + var1 + NLoginCore_092.D("Ѥ", (byte)39, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      int var3 = var2.length > s && var2[t].equalsIgnoreCase(a(u, v ^ w)) ? x : y;
      NLoginCore_515 var4 = var3 != 0 ? BCryptHashProvider.b(this.a) : BCryptHashProvider.a(this.a);
      if (!var4.aQ()) {
         NLoginCore_150.a(var1, var3 != 0 ? a(z & aa, ab) : a(ac, ad ^ ae));
         NLoginCore_150.a(var1, NLoginCore_194.F);
      } else {
         NLoginCore_150.a(var1, NLoginCore_487.p);
         NLoginCore_150.a(var1, NLoginCore_194.C);
      }
   }

   private static void b() {
      c = 1886506047643094121L;
      long var0 = c ^ 7707795042888235717L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(33 + 36),
               (byte)(22 + 61),
               (byte)(13 + 34),
               (byte)(55 + 12),
               (byte)(13 + 53),
               (byte)(26 + 41),
               (byte)(3 + 44),
               (byte)(12 + 68),
               (byte)(14 + 61),
               (byte)(18 + 49),
               (byte)(18 + 65),
               (byte)(28 + 25),
               (byte)(60 + 20),
               97,
               (byte)(49 + 51),
               (byte)(80 + 20),
               (byte)(22 + 83),
               (byte)(72 + 38),
               (byte)(27 + 76)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(44 + 25), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_076.C("ԃԑӯӔӞԔԂԒӕԔԆӡ", (byte)76, 67);
               b[1] = NLoginCore_559.F("րյվջկրյՇֆե\u058cՔՆռՏիչ՞ը\u0590կք՛՜", (byte)76, 70);
               b[2] = NLoginCore_076.B("ōőƍšůƐůŶŹŏƈş", (byte)76, 66);
               b[3] = NLoginCore_141.A("ũƑƉůņŦŕŐœƕŢş", (byte)76, 65);
               b[4] = NLoginCore_076.C("ԁӟӌӯԎԑӐәӴӺӴӡ", (byte)76, 67);
               b[5] = NLoginCore_127.D("ӧӮӊԁԉӒӭӘԎӤӖӔӧԚӯԜӢӞԜԀԓӤӰԩԨԔӬԝԏԎԢԁԢӥԢԞӶԫӷԮԬԶԼӻԘԻԴԢԗԗԴԴԿԏԌԍ", (byte)76, 68);
               b[6] = NLoginCore_138.A("ťŬňſƇŐūŖƌŢŒųřƔűŭƊƝŶŝƃŴƇƄƉƞƫſźƮŻƨƑŪƀƦơŰƤƦƄŰƇƼƐƐƺƏŻƓƷƤǂƷơƁƇƂƹƓǉǎƗƹƯǂƱƼƭƵƟƉƷǈǋƤǇǞǙƸƵǂƵƮǜǕƜǨƺǞǈǢǨƼƤƷǥǃƩǉǈǞǩǩǍƷǖƿ", (byte)76, 65);
               break;
            case 1:
               b[0] = NLoginCore_027.D("ԁԈԑԆӕԕӕӯӴԉԗӴԔӜӖӳԌԌԛԅԏԥӬӭ", (byte)76, 68);
               b[1] = NLoginCore_173.C("ԑԆԏԌԀԑԆӘԗӶԝӬԟӳӮԛәӟӾӯԎӯӬӭ", (byte)76, 67);
               b[2] = NLoginCore_183.A("ŎƎŦťŊŔŨŒƋŋŕş", (byte)76, 65);
               b[3] = NLoginCore_183.E("ՉսՁղՒփյբք՟ՂՐ", (byte)76, 69);
               b[4] = NLoginCore_091.F("ՎցփՑկոփՑՂյճեդՆրրֈհղի֊՞՛՜", (byte)76, 70);
               b[5] = NLoginCore_471.D("ӧӮӊԁԉӒӭӘԎӤӖӔӧԚӯԜӢӞԜԀԓӤӰԩԨԔӬԝԏԎԢԁԢӥԢԞӶԫӷԮԬԶԺӸԙԷԋԎԼӿԂԺԥԖ\u0530ՅԵԚԜՃԪԇԊԏ", (byte)76, 68);
               b[6] = NLoginCore_201.E(
                  "Ֆ՝ԹհոՁ՜ՇսՓՃդՊօբ՞ջ֎էՎմեոյպ֏֜հի֟լ֙ւ՛ձ֗֒ա֕֗յաո֭ցց֫րլքֳ֨֕֨֒ղոճ֪քֺֿֈֳ֪֢֦֭֠֞\u0590պָֹּ֨֕\u05cf\u05caֳ֦֦֩֟\u05cd׆֍י֫\u05cfֹדיּ֭֕֨\u05cbז׀֣ן׃גר֡׆ףצץח׀ׇבֽהׇ״ֻּ",
                  (byte)76,
                  69
               );
               break;
            case 2:
               b[0] = NLoginCore_110.E("ՏՕբյտմ՝ֈՅ՚վտցխխօսր՟թֆՎ\u058cՊ֍֗֘\u058cՓտմ֜", (byte)76, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_232.B("ŽŏŰƆųŠŎťŪŔŤƏƕŹƝƠűŸƏźƁŽŪū", (byte)76, 66);
         }
      }
   }
}
