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

public enum NLoginCore_175 {
   b,
   c,
   d;

   private static String[] ZKM_STR_A = new String[NLoginCore_175.e];
   private static String[] ZKM_STR_B = new String[NLoginCore_175.f];
   private static long c;
   private static int a = Integer.reverse(-1073741824);
   private static int b = 0 >>> 92 | 0 << -92;
   private static int c = (16 >>> 100 | 16 << ~100 + 1) & -1;
   private static int d = (1 >>> 31 | 1 << ~31 + 1) & -1;
   private static int e = Integer.reverse(-1073741824);
   private static int f = Integer.reverse(-1073741824);
   private static int g = (0 >>> 131 | 0 << ~131 + 1) & -1;
   private static long h = Long.reverse(6087308755368631894L);
   private static long i = Long.reverse(-5044031582654955520L);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(6087308755368631894L);
   private static long m = Long.reverse(-5044031582654955520L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = Integer.reverse(1073741824);
   private static long p = Long.reverse(6087308755368631894L);
   private static long q = Long.reverse(-5044031582654955520L);
   private static int r = Integer.reverse(1073741824);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_175.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_175.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.E("ըյմԷշճծշւձԾռրչռւՄࢶࣉࣘࣙࢭࣤࢷࣃࣣ࣑ࣉࣝࢶ՝", (byte)73, 69) + var1 + NLoginCore_553.B("ŋ", (byte)73, 66) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 7672721467870436906L;
      long var0 = c ^ 5955034340644069892L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(11 + 58),
               (byte)(30 + 53),
               (byte)(14 + 33),
               (byte)(21 + 46),
               (byte)(54 + 12),
               67,
               (byte)(38 + 9),
               (byte)(60 + 20),
               (byte)(16 + 59),
               (byte)(10 + 57),
               (byte)(56 + 27),
               53,
               (byte)(9 + 71),
               (byte)(23 + 74),
               (byte)(74 + 26),
               (byte)(57 + 43),
               (byte)(70 + 35),
               (byte)(61 + 49),
               (byte)(29 + 74)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_521.F("լմՐԽՠրղՂւֆչՌ", (byte)72, 70);
               ZKM_STR_B[1] = NLoginCore_027.C("ҿӡӔӲӺӳԇԂӸӠӠӝԂӮӼԕөӸӵӫӢԙӠӡ", (byte)72, 67);
               ZKM_STR_B[2] = NLoginCore_138.C("ӷӾӚԃӟӳԀӞӠԁӯӝӿӪԃӏӲԍӴԇӹԉӠӡ", (byte)72, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_559.A("ŅƊƆŽƃŪƇƂŇŤŪŗ", (byte)72, 65);
               ZKM_STR_B[1] = NLoginCore_397.A("ŁţŖŴżŵƉƄźŢŤƓƑŦŵƈŦŬƅŲƝƛŢţ", (byte)72, 65);
               ZKM_STR_B[2] = NLoginCore_451.E("ծյՑպՖժշՕ\u0557ոե՚ԿԼՠ՚ջ\u0557զՊպժ\u0557\u0558", (byte)72, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_027.E("ԹԸ՛խՖս\u0558շկՕՏՌ", (byte)72, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.B("ŹŘƄũƄƂſŗŜŪƀŗ", (byte)72, 66);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 93L;
      var1 ^= 5955034340644069892L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(7 + 62),
                     (byte)(23 + 60),
                     (byte)(9 + 38),
                     (byte)(51 + 16),
                     (byte)(49 + 17),
                     (byte)(47 + 20),
                     (byte)(5 + 42),
                     80,
                     75,
                     (byte)(42 + 25),
                     (byte)(64 + 19),
                     (byte)(45 + 8),
                     (byte)(5 + 75),
                     (byte)(31 + 66),
                     (byte)(49 + 51),
                     (byte)(96 + 4),
                     (byte)(104 + 1),
                     (byte)(40 + 70),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧ࡙\u086cࡻࡼࡐࢇ࡚ࡦࢆࡴ\u086cࢀ࡙", (byte)81, 67));
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
}
