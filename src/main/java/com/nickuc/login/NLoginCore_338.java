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

public enum NLoginCore_338 {
   a,
   b,
   c,
   d,
   e;

   private static String[] ZKM_STR_A = new String[NLoginCore_338.p];
   private static String[] ZKM_STR_B = new String[NLoginCore_338.q];
   private static long c;
   private static int a = Integer.reverse(0);
   private static int b = (-1 >>> 138 | -1 << ~138 + 1) & -1;
   private static long d = Long.reverse(-5842805912236222858L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int f = -1 >>> 213 | -1 << ~213 + 1;
   private static long g = Long.reverse(-5842805912236222858L);
   private static int h = 134217728 >>> 250 | 134217728 << ~250 + 1;
   private static long i = Long.reverse(-5842805912236222858L);
   private static int j = 320 >>> 198 | 320 << ~198 + 1;
   private static int k = Integer.reverse(0);
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(1073741824);
   private static int n = Integer.reverse(-1073741824);
   private static int o = (65536 >>> 110 | 65536 << ~110 + 1) & -1;
   private static int p = (65536 >>> 205 | 65536 << -205) & -1;
   private static int q = 268435456 >>> 89 | 268435456 << ~89 + 1;
   private static int r = Integer.reverse(-1073741824);
   private static long s = Long.reverse(-5842805912236222858L);
   private static int t = 0 >>> 192 | 0 << ~192 + 1;
   private static int u = Integer.reverse(536870912);
   private static long v = Long.reverse(2371759808087561846L);
   private static long w = Long.reverse(-8214565720323784704L);
   private static int x = 134217728 >>> 155 | 134217728 << ~155 + 1;
   private static int y = Integer.reverse(-1610612736);
   private static int z = Integer.reverse(-1);
   private static long aa = Long.reverse(-5842805912236222858L);
   private static int ab = (256 >>> 39 | 256 << -39) & -1;
   private static int ac = (196608 >>> 15 | 196608 << ~15 + 1) & -1;
   private static long ad = Long.reverse(-5842805912236222858L);
   private static int ae = 3145728 >>> 180 | 3145728 << ~180 + 1;
   private static int af = (234881024 >>> 57 | 234881024 << ~57 + 1) & -1;
   private static long ag = Long.reverse(2371759808087561846L);
   private static long ah = Long.reverse(-8214565720323784704L);
   private static int ai = 1024 >>> 8 | 1024 << ~8 + 1;

   public String e(String var1) {
      switch (this) {
         case a:
            return a(a & b, d) + var1;
         case b:
            return a(e & f, g) + var1;
         case c:
            return a(h, i) + var1;
         default:
            return var1;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 113L;
      var1 ^= -4615728477138931328L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(19 + 49),
                     (byte)(25 + 44),
                     (byte)(81 + 2),
                     (byte)(45 + 2),
                     (byte)(4 + 63),
                     66,
                     (byte)(62 + 5),
                     (byte)(16 + 31),
                     (byte)(13 + 67),
                     (byte)(58 + 17),
                     (byte)(11 + 56),
                     (byte)(20 + 63),
                     (byte)(38 + 15),
                     (byte)(46 + 34),
                     97,
                     (byte)(96 + 4),
                     (byte)(72 + 28),
                     (byte)(80 + 25),
                     (byte)(57 + 53),
                     (byte)(22 + 81)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(35 + 48)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.E("Ս՚ՙԜ՜\u0558Փ՜էՖԣաե՞աէԩ\u0896ࢳࢮࢸࣇࢨࢸࣀࢺ", (byte)46, 69));
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
      c = 7956129555380721412L;
      long var0 = c ^ -4615728477138931328L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(36 + 32),
               (byte)(11 + 58),
               (byte)(53 + 30),
               (byte)(10 + 37),
               (byte)(46 + 21),
               (byte)(11 + 55),
               67,
               (byte)(24 + 23),
               (byte)(41 + 39),
               (byte)(13 + 62),
               (byte)(5 + 62),
               (byte)(76 + 7),
               (byte)(18 + 35),
               (byte)(71 + 9),
               (byte)(62 + 35),
               (byte)(27 + 73),
               100,
               (byte)(103 + 2),
               (byte)(23 + 87),
               (byte)(76 + 27)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.E("ԺնշՆթՖցսժՕ\u0558Չ", (byte)69, 69);
               ZKM_STR_B[1] = NLoginCore_223.D("ӍӓԀԁӑӹӽҶӶԁӴԄӲӜӦӽԎԍԉӹӪӚӗӘ", (byte)69, 68);
               ZKM_STR_B[2] = NLoginCore_232.C("ӌӴҵӓҽӍӽӴӡҼԃҾԁӨӾԋӖӷӪӭӏԀӗӘ", (byte)69, 67);
               ZKM_STR_B[3] = NLoginCore_027.D("ӵӐӑӀӞҼӢӀӄҼӓӌ", (byte)69, 68);
               ZKM_STR_B[4] = NLoginCore_232.C("ӇӝӴӾӭӐӟӵәӺӹӌ", (byte)69, 67);
               ZKM_STR_B[5] = NLoginCore_241.C("ӯӳӺӉӖӪӣӠӂӘӓӌ", (byte)69, 67);
               ZKM_STR_B[6] = NLoginCore_553.F("ՏԱղշՆ՜\u0557ԷծշվՉ", (byte)69, 70);
               ZKM_STR_B[7] = NLoginCore_110.B("ŞŞŔŎŝŔŗŸŢŊŠő", (byte)69, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.B("ĺĻœƄůŘőƇŇšŔő", (byte)69, 66);
               ZKM_STR_B[1] = NLoginCore_027.D("ӍӓԀԁӑӹӽҶӶԁӱԂӨҼӥԇӕӀӸӼԐӚӗӘ", (byte)69, 68);
               ZKM_STR_B[2] = NLoginCore_091.E("ՉձԲՐԺՊպձ՞Թտշտ՚պՔ՜զժբս\u0557ՔՕ", (byte)69, 69);
               ZKM_STR_B[3] = NLoginCore_324.B("ŶŀńŤŮŴňşţżŕŕƂŋƏŊŢţŰƓŐůŜŝ", (byte)69, 66);
               ZKM_STR_B[4] = NLoginCore_110.C("ӾӋӓӡӿӗӖӞӳӜӜӚӅӸӧӄӦӌӹԃԋԐӗӘ", (byte)69, 67);
               ZKM_STR_B[5] = NLoginCore_453.C("ӴӵӌӊӰӻӚӃӭӲӥԉӕԄӴӛԈӼӹӇӮӪӗӘ", (byte)69, 67);
               ZKM_STR_B[6] = NLoginCore_092.B("ůōōŻœŅŠœŗśşşŽƄŠşƂŲƈſŵůŜŝ", (byte)69, 66);
               ZKM_STR_B[7] = NLoginCore_433.A("ĹžŀŒŚƂŜňƂŅŤżšŇōōŻŠƆŴŭůŜŝ", (byte)69, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_451.E("Ե՜՝ԸԸ՝ՑԺճՎսՕյԹԾպՅգգ֍ք\u0557ՔՕ", (byte)69, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_127.F("ՃՙՐ՜նՇ՞՞մափճնբմղ\u058bգՉՄտէՔՕ", (byte)69, 70);
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
                  NLoginCore_338.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.A("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 65), NLoginCore_338.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_397.B("ĊėĖÙęĕĐęĤēàĞĢěĞĤæѓѰѫѵ҄ѥѵѽѷû", (byte)20, 66) + var1 + NLoginCore_553.E("Ԋ", (byte)20, 69) + var2.toString(), var4);
      }
   }
}
