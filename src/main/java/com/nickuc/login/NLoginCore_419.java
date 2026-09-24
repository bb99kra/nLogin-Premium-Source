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
import lombok.Generated;

public enum NLoginCore_419 {
   b(a(NLoginCore_419.k, NLoginCore_419.l ^ NLoginCore_419.m), a(NLoginCore_419.n, NLoginCore_419.o ^ NLoginCore_419.p), (boolean)NLoginCore_419.q),
   c(a(NLoginCore_419.v & NLoginCore_419.w, NLoginCore_419.x), a(NLoginCore_419.y & NLoginCore_419.z, NLoginCore_419.aa), (boolean)NLoginCore_419.ab),
   d(a(NLoginCore_419.ag, NLoginCore_419.ah), a(NLoginCore_419.ai, NLoginCore_419.aj), (boolean)NLoginCore_419.ak);

   private final String bs;
   private final String bt;
   private final boolean ak;
   private static String[] a = new String[NLoginCore_419.e];
   private static String[] b = new String[NLoginCore_419.f];
   private static long c;
   private static int a = 50331648 >>> 152 | 50331648 << -152;
   private static int b = Integer.reverse(0);
   private static int c = (536870912 >>> 29 | 536870912 << -29) & -1;
   private static int d = (16 >>> 227 | 16 << ~227 + 1) & -1;
   private static int e = Integer.reverse(-1879048192);
   private static int f = (301989888 >>> 185 | 301989888 << -185) & -1;
   private static int g = Integer.reverse(0);
   private static int h = -1 >>> 110 | -1 << -110;
   private static long i = Long.reverse(-2289189663309512030L);
   private static int j = Integer.reverse(0);
   private static int k = (1073741824 >>> 190 | 1073741824 << ~190 + 1) & -1;
   private static long l = Long.reverse(5493030492786705058L);
   private static long m = Long.reverse(-6052837899185946624L);
   private static int n = Integer.reverse(1073741824);
   private static long o = Long.reverse(5493030492786705058L);
   private static long p = Long.reverse(-6052837899185946624L);
   private static int q = Integer.reverse(0);
   private static int r = 6 >>> 225 | 6 << ~225 + 1;
   private static int s = Integer.reverse(-1);
   private static long t = Long.reverse(-2289189663309512030L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(536870912);
   private static int w = -1 >>> 155 | -1 << ~155 + 1;
   private static long x = Long.reverse(-2289189663309512030L);
   private static int y = (2621440 >>> 51 | 2621440 << -51) & -1;
   private static int z = Integer.reverse(-1);
   private static long aa = Long.reverse(-2289189663309512030L);
   private static int ab = Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << -95;
   private static int ac = 98304 >>> 110 | 98304 << ~110 + 1;
   private static long ad = Long.reverse(5493030492786705058L);
   private static long ae = Long.reverse(-6052837899185946624L);
   private static int af = (8388608 >>> 22 | 8388608 << ~22 + 1) & -1;
   private static int ag = Integer.reverse(-536870912);
   private static long ah = Long.reverse(-2289189663309512030L);
   private static int ai = (32 >>> 66 | 32 << -66) & -1;
   private static long aj = Long.reverse(-2289189663309512030L);
   private static int ak = Integer.reverse(Integer.MIN_VALUE);

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= 8318748135263035818L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     (byte)(9 + 60),
                     (byte)(71 + 12),
                     (byte)(23 + 24),
                     (byte)(16 + 51),
                     (byte)(17 + 49),
                     (byte)(16 + 51),
                     (byte)(17 + 30),
                     (byte)(24 + 56),
                     (byte)(58 + 17),
                     67,
                     (byte)(14 + 69),
                     (byte)(23 + 30),
                     80,
                     (byte)(82 + 15),
                     (byte)(47 + 53),
                     (byte)(96 + 4),
                     (byte)(89 + 16),
                     (byte)(91 + 19),
                     (byte)(98 + 5)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.E("թնյԸոմկոփղԿսցպսփՅ࣑࣑࣐࣋࣌ࣤࣟࣥ࣡ࣃ࣓ࣂࣆࣘ", (byte)74, 69));
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
   public String toString() {
      return this.bs;
   }

   @Generated
   private NLoginCore_419(String var3, String var4, boolean var5) {
      this.bs = var3;
      this.bt = var4;
      this.ak = var5;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_419.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.A("šƃƅťƉƨƠƶƢűƯƥƳƭŶƛƽƼƴƺƴƉ", (byte)93, 65), NLoginCore_419.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.F("ռ։ֈՋ\u058bևւ\u058b֖օՒ\u0590֔֍\u0590֖\u0558ࣲࣣࣦࣤࣤࣞࣟࣷࣸࣴࣖࣕࣙ࣫ղ", (byte)93, 70)
               + var1
               + NLoginCore_091.A("ų", (byte)93, 65)
               + var2.toString(),
            var4
         );
      }
   }

   @Generated
   public String getName() {
      return this.bs;
   }

   private static void b() {
      c = 4990849839527156786L;
      long var0 = c ^ 8318748135263035818L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(64 + 5),
               83,
               (byte)(45 + 2),
               (byte)(42 + 25),
               (byte)(32 + 34),
               (byte)(64 + 3),
               (byte)(25 + 22),
               (byte)(14 + 66),
               (byte)(53 + 22),
               (byte)(18 + 49),
               (byte)(8 + 75),
               53,
               (byte)(15 + 65),
               (byte)(33 + 64),
               (byte)(39 + 61),
               (byte)(75 + 25),
               (byte)(56 + 49),
               (byte)(107 + 3),
               (byte)(11 + 92)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_471.E("՞րրտՖձըձ֎ոժգ", (byte)95, 69);
               b[1] = NLoginCore_223.F("լժ֎֒։Ջ֎֑֘ն֜գ", (byte)95, 70);
               b[2] = NLoginCore_559.A("ƎƌưƴƫŭưƳƺƘƾƅ", (byte)95, 65);
               b[3] = NLoginCore_223.D("ԚԾԮԦՊՆՒԺԟԢՋԚ", (byte)95, 68);
               b[4] = NLoginCore_232.E("ՔցեՠշՔ՚\u0557֏ճՙ՞֚ննյռյևՙ֛֧ծկ", (byte)95, 69);
               b[5] = NLoginCore_453.C("ԣԧԊԎԦԏԬԜԱԔԔԚ", (byte)95, 67);
               b[6] = NLoginCore_183.E("լսև֔֒ն\u0558իեզհնն֢ա֢֓ՠ֓օը֗ծկ", (byte)95, 69);
               b[7] = NLoginCore_451.E("օՒ՞տՓֈՓ\u058bհև֙՛֑ի֣֡օ՝՟չէցծկ", (byte)95, 69);
               b[8] = NLoginCore_183.D("ԼԉԕԶԊԿԊՂԧԾՐԒՈԢ՚\u0558ԼԔԖ\u0530ԞԸԥԦ", (byte)95, 68);
               break;
            case 1:
               b[0] = NLoginCore_446.D("ԂԦԥԻԗԭԃԪԉԩԦՄՈԒԸ\u0557ԻԼԲՆՙԸԥԦ", (byte)95, 68);
               b[1] = NLoginCore_387.F("Պ՝ֈ։֙\u0557պ֗֝մպ՞֞վ֞֒\u0590փ֛տչձծկ", (byte)95, 70);
               b[2] = NLoginCore_183.C("ԋԪԤԣՉԂԡԥՋԩԯԒՉՔՆԬՃԭԖՐՠԸԥԦ", (byte)95, 67);
               b[3] = NLoginCore_232.A("ƐƠŪƦŷƧŴƲƔŸǀƿƕƃſƷƀǁǉƓƉƣƐƑ", (byte)95, 65);
               b[4] = NLoginCore_110.D("ԋԸԜԗԮԋԑԎՆԪԒՓԯԧԓԹԸՇՍԮԶ՞ԥԦ", (byte)95, 68);
               b[5] = NLoginCore_183.A("ƀŷƔŶųƊźƏƾƿƊƳƠƠƣƵƂƣƑǇƢƹƐƑ", (byte)95, 65);
               b[6] = NLoginCore_027.A("ƎƟƩƶƴƘźƍƇƈƓƕƋƺƷƙƴǆƺƇƼƓƐƑ", (byte)95, 65);
               b[7] = NLoginCore_223.B("ƧŴƀơŵƪŵƭƒƩƽƴŻƒƘƶƜƑƵƗƚǉƐƑ", (byte)95, 66);
               b[8] = NLoginCore_471.E("օՒ՞տՓֈՓ\u058bհև֙\u0557\u0558֤֚֒ւխ֡չզ֧ծկ", (byte)95, 69);
               break;
            case 2:
               b[0] = NLoginCore_553.A("ƫƓŷƒƉưƪƯƽŻƶƅ", (byte)95, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.F("֏\u058bէր\u0558֑֍քֆ֓\u0590գ", (byte)95, 70);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public boolean L() {
      return this.ak;
   }

   @Generated
   public String Z() {
      return this.bt;
   }
}
