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

public class NLoginCore_378 extends NLoginCore_302 {
   private static long v = Long.reverse(4075606706816641089L);
   private static long bb = Long.reverse(-4179340454199820288L);
   private static String[] ZKM_STR_A = new String[NLoginCore_378.bc];
   private static long r;
   private static long ba = Long.reverse(4075606706816641089L);
   private static long ap = Long.reverse(4075606706816641089L);
   private static long ac = Long.reverse(-4179340454199820288L);
   private static long ax = Long.reverse(4075606706816641089L);
   private static long ay = Long.reverse(-4179340454199820288L);
   private static long as = Long.reverse(-4179340454199820288L);
   private static int bc = Integer.reverse(536870912);
   private static int bd = (Integer.MIN_VALUE >>> 93 | Integer.MIN_VALUE << -93) & -1;
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static int az = 1610612736 >>> 93 | 1610612736 << -93;
   private static int m = Integer.reverse(0);
   private static int aw = Integer.reverse(1073741824);
   private static String[] ZKM_STR_B = new String[bd];

   static {
      b();
   }

   private static void b() {
      r = -9072923476357091044L;
      long var0 = r ^ 2809110681252580028L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               69,
               (byte)(25 + 58),
               (byte)(35 + 12),
               (byte)(25 + 42),
               (byte)(22 + 44),
               (byte)(27 + 40),
               (byte)(5 + 42),
               (byte)(61 + 19),
               (byte)(50 + 25),
               (byte)(35 + 32),
               (byte)(74 + 9),
               (byte)(28 + 25),
               (byte)(15 + 65),
               (byte)(80 + 17),
               (byte)(47 + 53),
               (byte)(39 + 61),
               (byte)(43 + 62),
               (byte)(86 + 24),
               (byte)(98 + 5)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_451.E("ԦԝԿԚԡՃԣԜԪԯԡՏՌԥԉՏԓԦԙ\u0558Խ՜ԣԤ", (byte)20, 69);
               ZKM_STR_B[1] = NLoginCore_183.C("ѢсћюьХћѲѓўѮй", (byte)20, 67);
               ZKM_STR_B[2] = NLoginCore_092.A("ėĚĎßñ×ġúġéĂï", (byte)20, 65);
               ZKM_STR_B[3] = NLoginCore_027.D("ћѠѢУжлйсыѥѮй", (byte)20, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_397.B("ýôĖñøĚúóāĆùæĪûìĊęįīČĊčúû", (byte)20, 66);
               ZKM_STR_B[1] = NLoginCore_138.D("ЩЧљјьщёбѬлрй", (byte)20, 68);
               ZKM_STR_B[2] = NLoginCore_173.F("ԩԸԙԖԶԮՅԾԼԿՑԘ", (byte)20, 70);
               ZKM_STR_B[3] = NLoginCore_004.E("ԛԃՉԈՄԜԫՑԠՑՉԘ", (byte)20, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_453.A("ĚóğñĀĚĥħāĘĘï", (byte)20, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_397.B("čĖġċğôüćåĒĆüëĂĦøÿĆěđòđĠįøùĄččĨĜį", (byte)20, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 99L;
      var1 ^= 2809110681252580028L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(15 + 54),
                     (byte)(37 + 46),
                     (byte)(17 + 30),
                     (byte)(23 + 44),
                     (byte)(48 + 18),
                     (byte)(50 + 17),
                     47,
                     (byte)(26 + 54),
                     (byte)(5 + 70),
                     (byte)(9 + 58),
                     (byte)(14 + 69),
                     (byte)(13 + 40),
                     (byte)(45 + 35),
                     (byte)(82 + 15),
                     (byte)(11 + 89),
                     100,
                     (byte)(83 + 22),
                     (byte)(10 + 100),
                     (byte)(6 + 97)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.C("анмϿплжпъйІфшсфъЌޟޝޥޡޔޖݷޥޙލާݼޛ", (byte)8, 67));
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

   public NLoginCore_378(NLoginType_008 var1) {
      super(var1, NLoginCore_479.I, a(m, v ^ ac), a(ai, ap ^ as), a(aw, ax ^ ay), a(az, ba ^ bb));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_378.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_471.D("ϯБГϳЗжЮфаϿнгслЄЩыътштЗ", (byte)6, 68), NLoginCore_378.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.F("ԥԲԱӴԴ\u0530ԫԴԿԮӻԹԽԶԹԿԁ\u0894\u0892࢚\u0896ࢉࢋ\u086c࢚ࢎࢂ࢜ࡱ\u0890Ԛ", (byte)6, 70)
               + var1
               + NLoginCore_092.F("Ӽ", (byte)6, 70)
               + var2.toString(),
            var4
         );
      }
   }
}
