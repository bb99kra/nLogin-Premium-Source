package com.nickuc.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_303 {
   private static long b = Long.reverse(-7171626733408485983L);
   private static int a = Integer.reverse(0);
   private static long c;
   private static int g = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_303.i];
   private static String[] ZKM_STR_B = new String[NLoginCore_303.j];
   private static int e = 0 >>> 120 | 0 << ~120 + 1;
   private static int h = (0 >>> 87 | 0 << -87) & -1;
   private static int i = 2 >>> 225 | 2 << ~225 + 1;
   private static int j = 524288 >>> 115 | 524288 << -115;
   private static int f = Integer.reverse(0);
   private static int c = (2048 >>> 75 | 2048 << -75) & -1;
   private static int d = Integer.reverse(0);

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static NLoginCore_556 a() {
      try {
         InputStream var0 = NLoginCore_140.a(a(a, b), (c != 0));
         boolean var8 = false /* VF: Semaphore variable */;

         NLoginCore_556 var2;
         label126: {
            try {
               var8 = true;
               if (var0 != null) {
                  BufferedReader var1 = new BufferedReader(new InputStreamReader(var0, StandardCharsets.UTF_8));
                  boolean var12 = false /* VF: Semaphore variable */;

                  try {
                     var12 = true;
                     var2 = NLoginCore_556.a(var1.readLine());
                     var12 = false;
                  } finally {
                     if (var12) {
                        if (Collections.singletonList(var1).get(f) != null) {
                           var1.close();
                        }
                     }
                  }

                  if (Collections.singletonList(var1).get(d) != null) {
                     var1.close();
                     var8 = false;
                  } else {
                     var8 = false;
                  }
                  break label126;
               }

               var8 = false;
            } finally {
               if (var8) {
                  if (Collections.singletonList(var0).get(h) != null) {
                     var0.close();
                  }
               }
            }

            if (Collections.singletonList(var0).get(g) != null) {
               var0.close();
            }

            return null;
         }

         if (Collections.singletonList(var0).get(e) != null) {
            var0.close();
         }

         return var2;
      } catch (IOException var15) {
         throw new RuntimeException(var15);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_303.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.E("ԬՎՐ\u0530ՔճիցխԼպհվոՁզֈևտօտՔ", (byte)72, 69), NLoginCore_303.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.D("ӰӽӼҿӿӻӶӿԊӹӆԄԈԁԄԊӌࡖ࠺ࡖ࡞ࡔࡆࡊࡘ\u086f࠺\u085fӣ", (byte)72, 68) + var1 + NLoginCore_201.E("Ծ", (byte)72, 69) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -8809112640597877225L;
      long var0 = c ^ 7834102707199675997L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(9 + 60),
               (byte)(24 + 59),
               (byte)(7 + 40),
               67,
               66,
               (byte)(56 + 11),
               (byte)(3 + 44),
               (byte)(19 + 61),
               (byte)(20 + 55),
               (byte)(56 + 11),
               (byte)(40 + 43),
               (byte)(10 + 43),
               (byte)(28 + 52),
               (byte)(14 + 83),
               (byte)(61 + 39),
               (byte)(5 + 95),
               (byte)(48 + 57),
               (byte)(102 + 8),
               (byte)(16 + 87)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_141.A("ǊǒƿƶƴǖǧǚǃƽǤǨƾƬǙǬǛǥǩǎǪǯǵǤǤǪǕǰưǱǝǐ", (byte)117, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_138.F("֚֒ևվռ֢֞֯\u058bօְ֬ֆմֱֲִֶ֣֖֭֡պ֬֏ִ֛֚֙սֵ֞", (byte)117, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.F("֢ևւ֘օֈֱ֥֢֝֡լֵֶծւ֣ղֽ֩֕֬քօ", (byte)117, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.A("ƛƯƾǖǛǐưƣǓǡƸǟƻǜǄǙƬǉǢǥǂǥƼƽ", (byte)117, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 7834102707199675997L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(32 + 36),
                     (byte)(50 + 19),
                     (byte)(45 + 38),
                     47,
                     (byte)(37 + 30),
                     66,
                     (byte)(3 + 64),
                     (byte)(40 + 7),
                     (byte)(7 + 73),
                     (byte)(73 + 2),
                     (byte)(48 + 19),
                     (byte)(42 + 41),
                     (byte)(43 + 10),
                     (byte)(3 + 77),
                     (byte)(20 + 77),
                     (byte)(35 + 65),
                     (byte)(69 + 31),
                     (byte)(19 + 86),
                     (byte)(105 + 5),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.C("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴж߀ޤ߀߈\u07beް\u07b4߂ߙޤ߉", (byte)22, 67));
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
