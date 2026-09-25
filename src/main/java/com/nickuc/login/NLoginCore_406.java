package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_406 {
   a(a(NLoginCore_406.ab, NLoginCore_406.ac), a(NLoginCore_406.ad & NLoginCore_406.ae, NLoginCore_406.af), NLoginCore_342.c),
   b(a(NLoginCore_406.ak, NLoginCore_406.al ^ NLoginCore_406.am), a(NLoginCore_406.an, NLoginCore_406.ao), NLoginCore_342.c);

   private final String aI;
   private final String aJ;
   private final NLoginCore_342 a;
   private static String[] ZKM_STR_A = new String[NLoginCore_406.w];
   private static String[] ZKM_STR_B = new String[NLoginCore_406.x];
   private static long c;
   private static int a = 33554432 >>> 25 | 33554432 << -25;
   private static int b = (104857600 >>> 19 | 104857600 << ~19 + 1) & -1;
   private static int c = 8 >>> 131 | 8 << ~131 + 1;
   private static int d = (0 >>> 153 | 0 << ~153 + 1) & -1;
   private static int e = (0 >>> 251 | 0 << -251) & -1;
   private static long f = Long.reverse(5143792255989051168L);
   private static long g = Long.reverse(-3458764513820540928L);
   private static int h = Integer.reverse(1946157056);
   private static int i = Integer.reverse(-201326592);
   private static int j = (131072 >>> 145 | 131072 << -145) & -1;
   private static int k = Integer.reverse(-1);
   private static long l = Long.reverse(-7538344294686265568L);
   private static int m = Integer.reverse(1073741824);
   private static long n = Long.reverse(5143792255989051168L);
   private static long o = Long.reverse(-3458764513820540928L);
   private static int p = (24576 >>> 13 | 24576 << -13) & -1;
   private static long q = Long.reverse(5143792255989051168L);
   private static long r = Long.reverse(-3458764513820540928L);
   private static int s = Integer.reverse(0);
   private static int t = Integer.reverse(1073741824);
   private static int u = Integer.reverse(0);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int w = Integer.reverse(1342177280);
   private static int x = 20 >>> 225 | 20 << ~225 + 1;
   private static int y = 67108864 >>> 56 | 67108864 << -56;
   private static long z = Long.reverse(-7538344294686265568L);
   private static int aa = 0 >>> 116 | 0 << -116;
   private static int ab = 40 >>> 99 | 40 << ~99 + 1;
   private static long ac = Long.reverse(-7538344294686265568L);
   private static int ad = (201326592 >>> 25 | 201326592 << -25) & -1;
   private static int ae = Integer.reverse(-1);
   private static long af = Long.reverse(-7538344294686265568L);
   private static int ag = Integer.reverse(-536870912);
   private static long ah = Long.reverse(5143792255989051168L);
   private static long ai = Long.reverse(-3458764513820540928L);
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = (32 >>> 2 | 32 << ~2 + 1) & -1;
   private static long al = Long.reverse(5143792255989051168L);
   private static long am = Long.reverse(-3458764513820540928L);
   private static int an = (18 >>> 225 | 18 << -225) & -1;
   private static long ao = Long.reverse(-7538344294686265568L);

   public boolean a(NLoginInterface_034 var1, File var2) {
      if (var2.exists()) {
         return (a != 0);
      } else {
         String var3 = this.c(var1);
         NLoginCore_305 var4 = NLoginCore_305.a();
         NLoginCore_285 var5 = var4.a(var3, var2);
         return ((var5.p() != 0) == b && var5.af() ? c : d);
      }
   }

   @Generated
   public NLoginCore_342 a() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 7895778612731772372L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(41 + 27),
                     (byte)(17 + 52),
                     (byte)(15 + 68),
                     (byte)(27 + 20),
                     (byte)(28 + 39),
                     (byte)(40 + 26),
                     (byte)(7 + 60),
                     (byte)(27 + 20),
                     (byte)(15 + 65),
                     (byte)(19 + 56),
                     (byte)(47 + 20),
                     (byte)(77 + 6),
                     (byte)(12 + 41),
                     (byte)(37 + 43),
                     (byte)(52 + 45),
                     (byte)(19 + 81),
                     100,
                     (byte)(56 + 49),
                     (byte)(77 + 33),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱ࣊ࢽࢹ࢚ࢪࣁࢲࣁ࢞", (byte)54, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_406.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.D("ЊЬЮЎвёщџыКјюќіПфѦѥѝѣѝв", (byte)15, 68), NLoginCore_406.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.C("хђёДєѐыєџюЛљѝіљџС\u07baޭީފޚޱޢޱގж", (byte)15, 67) + var1 + NLoginCore_446.A("×", (byte)15, 65) + var2.toString(), var4
         );
      }
   }

   @Nullable
   public String b(NLoginInterface_034 var1) {
      return this.a(var1, this.a);
   }

   @Nullable
   public String a(NLoginInterface_034 var1, NLoginCore_342 var2) {
      String var3 = this.c(var1) + a(e, f ^ g) + var2.ag();
      return NLoginCore_305.a().a(var3).V();
   }

   @Generated
   private NLoginCore_406(String var3, String var4, NLoginCore_342 var5) {
      this.aI = var3;
      this.aJ = var4;
      this.a = var5;
   }

   static {
      b();
   }

   @Generated
   public String D() {
      return this.aJ;
   }

   private static void b() {
      c = 357901015067281122L;
      long var0 = c ^ 7895778612731772372L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(52 + 17),
               (byte)(74 + 9),
               (byte)(4 + 43),
               (byte)(38 + 29),
               (byte)(34 + 32),
               (byte)(42 + 25),
               (byte)(22 + 25),
               (byte)(3 + 77),
               (byte)(64 + 11),
               (byte)(30 + 37),
               (byte)(36 + 47),
               53,
               80,
               (byte)(49 + 48),
               (byte)(67 + 33),
               (byte)(99 + 1),
               (byte)(102 + 3),
               (byte)(67 + 43),
               (byte)(37 + 66)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_241.B("ƉƎŭƋƄƢŵƅƃťƤů", (byte)84, 66);
               ZKM_STR_B[1] = NLoginCore_138.D("ԡԨԂӦԨԅԤӭԨԔӼӹ", (byte)84, 68);
               ZKM_STR_B[2] = NLoginCore_091.B("ƗƞŸŜƞŻƚţƞƊŲů", (byte)84, 66);
               ZKM_STR_B[3] = NLoginCore_387.B("ƗƞŸŜƞŻƚţƞƊŲů", (byte)84, 66);
               ZKM_STR_B[4] = NLoginCore_092.A("ŴƑƖŝƟƙƜŰơƈƥŴƁƠƊơƅũƭƋƳƣźŻ", (byte)84, 65);
               ZKM_STR_B[5] = NLoginCore_141.E("աՉչՖ՟֎\u058cհկՊՓխ֒Ֆօ֊Ւՙ֑ժ\u0557\u0558՞\u058c֜սՕգվպ֦֞", (byte)84, 69);
               ZKM_STR_B[6] = NLoginCore_397.D("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӵԿԩՂԵԘԑӽӿԐԙԾՉԄՊԎԌՁՏՃԧԝԩԖԖԕՌԩՄՎԾՋՍԤԥ", (byte)84, 68);
               ZKM_STR_B[7] = NLoginCore_201.B("ƜƍƛƕžŗƏŤƥƝųƛƨƌơƣƈſƭƪƈƳźŻ", (byte)84, 66);
               ZKM_STR_B[8] = NLoginCore_446.A("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮůƊƩƶƒŴƬƹưƌƙ", (byte)84, 65);
               ZKM_STR_B[9] = NLoginCore_141.C("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӿԗԶԵՃӶӿԲԣԇԦԒԤՈԨԼԠԽՑՀԊՏԎԵԍԨԱԓՉԕՔՈՍԤԥ", (byte)84, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.C("ԨԔԌӿԫӪԠԫԉԐԀӹ", (byte)84, 67);
               ZKM_STR_B[1] = NLoginCore_324.C("ԠӤԟӤԮԜԀԲԥԜԀӹ", (byte)84, 67);
               ZKM_STR_B[2] = NLoginCore_201.D("ӷԢԙԣӪԊԛԧӱӽԢӹ", (byte)84, 68);
               ZKM_STR_B[3] = NLoginCore_530.D("ԪԚԣԛԙԥԠӬԃӫԮӹ", (byte)84, 68);
               ZKM_STR_B[4] = NLoginCore_091.F("՝պտՆֈւօՙ֊ձ֍վ\u058bե֏քև֛֗շ։֚յչ՟ւբ՚խւ֣֗", (byte)84, 70);
               ZKM_STR_B[5] = NLoginCore_201.B("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮŵŴƤƌƵƣŲƘƆƗƱƩƟƎŻƴơƼƲźƹƖƏ", (byte)84, 66);
               ZKM_STR_B[6] = NLoginCore_453.A("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮūƵƟƸƫƎƇųŵƆƏƴƿźǀƄƂƷǅƹƝƒƷƠǀƗƌƱƈưƮƥƐƧǃǆƥƙǄƳƬǚǇ", (byte)84, 65);
               ZKM_STR_B[7] = NLoginCore_553.C("ԦԗԥԟԈӡԙӮԯԧӾԒԈԌԉԐԣԼԩӺԒԒԞԽԺԻԛԟ\u0530Ӿԥԟ", (byte)84, 67);
               ZKM_STR_B[8] = NLoginCore_232.B("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮƳŮƕƙơƴƊŴƱżƚƒƠƍƻŽƷƻƚƈƙƉƏ", (byte)84, 66);
               ZKM_STR_B[9] = NLoginCore_530.C("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӿԗԶԵՃӶӿԲԣԇԦԒԤՈԨԼԠԽՑՀԊՑՄԮՓԐՔՍԺԕԱԪԺՙԫՙՑ\u0558ՁԱ՞Ճ\u0558", (byte)84, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_027.B("ŘſƋƟƗơşƗƃƇƆŪŽŭŷŷƥűƏơŮƣźŻ", (byte)84, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.D("ԘԡӢԙԍԌӹӼӤԞӯԭӳӵӪԶӲԳӲԯԔԇԄԅ", (byte)84, 68);
         }
      }
   }

   public String c(NLoginInterface_034 var1) {
      return this.aJ
         + var1.a().replace((char)h, (char)i)
         + a(j & k, l)
         + var1.b()
         + a(m, n ^ o)
         + var1.getVersion()
         + a(p, q ^ r)
         + var1.c((s != 0));
   }

   @Generated
   public String C() {
      return this.aI;
   }
}
