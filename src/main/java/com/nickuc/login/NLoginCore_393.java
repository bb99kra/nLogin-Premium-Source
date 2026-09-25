package com.nickuc.login;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Location;

public class NLoginCore_393 {
   private static int a = (0 >>> 129 | 0 << -129) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_393.n];
   private static int g = (0 >>> 153 | 0 << -153) & -1;
   private static long f = Long.reverse(-3217450014347722719L);
   private static int i = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   private static int e = 0 >>> 22 | 0 << ~22 + 1;
   private static int b = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[NLoginCore_393.o];
   private static long m = Long.reverse(-5908722711110090752L);
   private static long c;
   private static int c = Integer.reverse(0);
   private static int o = 16384 >>> 77 | 16384 << ~77 + 1;
   private static long l = Long.reverse(9032340972100026401L);
   private static int h = (0 >>> 141 | 0 << ~141 + 1) & -1;
   private static int j = (0 >>> 140 | 0 << -140) & -1;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static final NLoginCore_265 a = new NLoginCore_265();
   private static int n = 1024 >>> 169 | 1024 << ~169 + 1;

   public static NLoginCore_265 a() {
      return a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 117L;
      var1 ^= -4879476169011492491L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(45 + 23),
                     69,
                     (byte)(13 + 70),
                     (byte)(43 + 4),
                     (byte)(45 + 22),
                     (byte)(22 + 44),
                     (byte)(12 + 55),
                     (byte)(4 + 43),
                     (byte)(71 + 9),
                     (byte)(26 + 49),
                     (byte)(48 + 19),
                     (byte)(80 + 3),
                     (byte)(39 + 14),
                     (byte)(62 + 18),
                     (byte)(23 + 74),
                     (byte)(91 + 9),
                     (byte)(67 + 33),
                     105,
                     (byte)(20 + 90),
                     (byte)(41 + 62)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.A("ŤűŰĳųůŪųžŭĺŸżŵŸžŀӐӓӛӎӈӘӔӘӍӔӥ", (byte)65, 65));
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

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Location a(String var0) {
      try {
         if (var0 != null) {
            byte[] var1 = Base64.getDecoder().decode(var0.getBytes(StandardCharsets.UTF_8));
            ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
            boolean var10 = false /* VF: Semaphore variable */;

            Location var4;
            try {
               var10 = true;
               DataInputStream var3 = new DataInputStream(var2);
               boolean var14 = false /* VF: Semaphore variable */;

               try {
                  var14 = true;
                  var4 = a.a(var3);
                  var14 = false;
               } finally {
                  if (var14) {
                     if (Collections.singletonList(var3).get(i) != null) {
                        var3.close();
                     }
                  }
               }

               if (Collections.singletonList(var3).get(g) != null) {
                  var3.close();
                  var10 = false;
               } else {
                  var10 = false;
               }
            } finally {
               if (var10) {
                  if (Collections.singletonList(var2).get(j) != null) {
                     var2.close();
                  }
               }
            }

            if (Collections.singletonList(var2).get(h) != null) {
               var2.close();
            }

            return var4;
         } else {
            return null;
         }
      } catch (IOException var17) {
         throw new RuntimeException(a(k, l ^ m), var17);
      }
   }

   private static void b() {
      c = -8934758771846374722L;
      long var0 = c ^ -4879476169011492491L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               69,
               (byte)(20 + 63),
               (byte)(46 + 1),
               (byte)(25 + 42),
               (byte)(30 + 36),
               (byte)(43 + 24),
               (byte)(4 + 43),
               (byte)(41 + 39),
               75,
               (byte)(21 + 46),
               (byte)(3 + 80),
               (byte)(33 + 20),
               (byte)(63 + 17),
               (byte)(33 + 64),
               (byte)(79 + 21),
               (byte)(69 + 31),
               (byte)(63 + 42),
               (byte)(96 + 14),
               (byte)(26 + 77)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(25 + 44), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.C("ӣӟӇӻӟӝӛԍԍӰԌԐӚԈӝԕӓӠӶӯӵӵӭԈӫԝӫөӶԤӹԏӵӦӽԝԞԘԘԉԘԂӫӵ", (byte)72, 67);
               ZKM_STR_B[1] = NLoginCore_384.A("ťšŉŽšşŝƏƏŲƌŦƏſƕƋŹŔţƄƛŰƔųƉƀŰƖŜŴƎƤŧſƙŵũƕƛƚŰƃưŷ", (byte)72, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.A("ťšŉŽšşŝƏƏŲƎƒŜƊşƗŕŢŸűŷŷůƊŭƟŭūŸƦŻƑűƃƞƆƤƗƇƐƬƚƎŷ", (byte)72, 65);
               ZKM_STR_B[1] = NLoginCore_575.A("ťšŉŽšşŝƏƏŲƌŦƏſƕƋŹŔţƄƛŰƔųƉƀŰƖŜŴƎƤŤťƠƫƥƍƄƈżŨưŷ", (byte)72, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_559.C("ӂӱӗԊӔәӛԁӢӎԍӢӎӤӨӫԋӶӳӲӰӣӠӡ", (byte)72, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_384.F("ՖսՙՔնտջ՜ե՟Ղջ։ՔՋՙնՖէՇթ՚֑֒ւֈօՐՑ\u0590ջ՜", (byte)72, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_393.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.B("íďđñĕĴĬłĮýĻıĿĹĂħŉňŀņŀĕ", (byte)35, 66), NLoginCore_393.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_141.C("ҁҎҍѐҐҌ҇ҐқҊїҕҙҒҕқѝ߭߰߸߫ߥߵ߱ߵߪ߱ࠂѴ", (byte)35, 67) + var1 + NLoginCore_397.F("ԙ", (byte)35, 70) + var2.toString(), var4
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String a(Location var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         boolean var9 = false /* VF: Semaphore variable */;

         String var3;
         try {
            var9 = true;
            DataOutputStream var2 = new DataOutputStream(var1);
            boolean var13 = false /* VF: Semaphore variable */;

            try {
               var13 = true;
               a.a(var0, var2);
               var3 = new String(Base64.getEncoder().encode(var1.toByteArray()), StandardCharsets.UTF_8);
               var13 = false;
            } finally {
               if (var13) {
                  if (Collections.singletonList(var2).get(c) != null) {
                     var2.close();
                  }
               }
            }

            if (Collections.singletonList(var2).get(a) != null) {
               var2.close();
               var9 = false;
            } else {
               var9 = false;
            }
         } finally {
            if (var9) {
               if (Collections.singletonList(var1).get(d) != null) {
                  var1.close();
               }
            }
         }

         if (Collections.singletonList(var1).get(b) != null) {
            var1.close();
         }

         return var3;
      } catch (IOException var16) {
         throw new RuntimeException(a(e, f), var16);
      }
   }
}
