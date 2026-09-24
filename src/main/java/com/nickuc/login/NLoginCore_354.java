package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_354 {
   private static int m = 24 >>> 227 | 24 << -227;
   private static int l = Integer.reverse(0);
   private static long d = Long.reverse(-403948210295038824L);
   private static int i = 2097152 >>> 116 | 2097152 << -116;
   private static long h = Long.reverse(6917529027641081856L);
   private static long j = Long.reverse(-403948210295038824L);
   private static int f = 2048 >>> 171 | 2048 << -171;
   private static int a = (0 >>> 158 | 0 << -158) & -1;
   private static int b = (0 >>> 120 | 0 << ~120 + 1) & -1;
   private static int n = Integer.reverse(-1073741824);
   private static final Random a = new Random();
   private static long k = Long.reverse(6917529027641081856L);
   private static final SecureRandom b = new SecureRandom();
   private static long e = Long.reverse(6917529027641081856L);
   private static long g = Long.reverse(-403948210295038824L);
   private static String[] a = new String[m];
   private static long c;
   private static String[] b = new String[n];

   static {
      b();
   }

   private static void b() {
      c = 1817674743521158751L;
      long var0 = c ^ -3013983042085480386L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(36 + 32),
               (byte)(28 + 41),
               (byte)(39 + 44),
               (byte)(9 + 38),
               (byte)(2 + 65),
               (byte)(59 + 7),
               (byte)(14 + 53),
               47,
               (byte)(51 + 29),
               75,
               (byte)(39 + 28),
               (byte)(65 + 18),
               (byte)(3 + 50),
               (byte)(62 + 18),
               (byte)(64 + 33),
               (byte)(17 + 83),
               (byte)(70 + 30),
               (byte)(23 + 82),
               (byte)(24 + 86),
               (byte)(64 + 39)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_521.E("ԎՄՏԴԣ\u0530ՆՏԣԘՈԙՖ\u0557ԙԽՌՔ՚ՔԹՂԻե՟՚ՍբԬզՉՠԥՠՈճղզդՍԻԺԼՂ", (byte)30, 69);
               b[1] = NLoginCore_141.C("҉ҊѵѸјчѺюѢѾѩѼ҆ѽѩѸҁҕѤѷѼҔѩғѪҐҁ҃҂ғјҥҠ҅ѪѥѻҊҟѭ҃ҥѱѷ", (byte)30, 67);
               b[2] = NLoginCore_384.B("ćõèòīøĥ÷ĹüĴĮĳüďĽıčĕňĔľćĠķčĨĞņįńŉĥŉğħĕďňĻļěĕģ", (byte)30, 66);
               break;
            case 1:
               b[0] = NLoginCore_141.D("уѹ҄ѩјѥѻ҄јэѽюҋҌюѲҁ҉ҏ҉ѮѷѰҚҔҏ҂җѡқѾҕҁҧҚѫѧҁ҉ҟѹҁұҋҦғҵҥҶҡѵҊҤһ҂҃", (byte)30, 68);
               b[1] = NLoginCore_530.D("҉ҊѵѸјчѺюѢѾѩѼ҆ѽѩѸҁҕѤѷѼҔѩғѪҐҁ҃҂ғјҥѷѨ҉ҖѷѪҏѹҥ҄ѭѪҥ҅ҡҠ҅ҺҎҊҴҕ҂҃", (byte)30, 68);
               b[2] = NLoginCore_127.B("ćõèòīøĥ÷ĹüĴĮĳüďĽıčĕňĔľćĠķčĨĞņįńŉħłňıŁŐňŊĨŖĺģ", (byte)30, 66);
               break;
            case 2:
               b[0] = NLoginCore_076.A("ðĭĪĭęĦēíĩĵćööĩĪěāăŀĀĜđĎď", (byte)30, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_092.E("ԥՅՁՕՂԊՕԳԩԒՓԢ", (byte)30, 69);
         }
      }
   }

   public static String a(char[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = l; var3 < var1; var3++) {
         var2.append(var0[b.nextInt(var0.length)]);
      }

      return var2.toString();
   }

   public static int a(int var0) {
      return var0 == 0 ? a : a.nextInt(var0);
   }

   private static String a(int var0, long var1) {
      var1 ^= 6L;
      var1 ^= -3013983042085480386L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(7 + 62),
                     (byte)(14 + 69),
                     (byte)(7 + 40),
                     (byte)(41 + 26),
                     (byte)(56 + 10),
                     (byte)(33 + 34),
                     (byte)(33 + 14),
                     (byte)(51 + 29),
                     (byte)(10 + 65),
                     (byte)(30 + 37),
                     (byte)(67 + 16),
                     (byte)(25 + 28),
                     (byte)(11 + 69),
                     (byte)(72 + 25),
                     (byte)(93 + 7),
                     (byte)(87 + 13),
                     105,
                     (byte)(72 + 38),
                     (byte)(61 + 42)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.D("ӧӴӳҶӶӲӭӶԁӰҽӻӿӸӻԁӃࡎ\u085dࡠ\u085dࡏ࡚ࡣࡓ࡙ࡧ࠳ࡤࡇ࡚", (byte)69, 68));
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

   public static String a(String var0, int var1) {
      return a(var0.toCharArray(), var1);
   }

   public static Random a() {
      return a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_354.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_575.E("ԯՑՓԳ\u0557նծքհԿսճցջՄթ\u058b֊ւֈւ\u0557", (byte)75, 69), NLoginCore_354.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.A("ŸƅƄŇƇƃžƇƒƁŎƌƐƉƌƒŔӟӮӱӮӠӫӴӤӪӸӄӵӘӫŮ", (byte)75, 65) + var1 + NLoginCore_138.B("ŏ", (byte)75, 66) + var2.toString(), var4
         );
      }
   }

   public static String a(NLoginCore_198 var0, int var1) {
      return a(NLoginCore_198.a(var0), var1);
   }

   public static int a(int var0, int var1) {
      if (var0 == var1) {
         throw new IllegalArgumentException(a(b, d ^ e));
      } else if (var0 < 0) {
         throw new IllegalArgumentException(a(f, g ^ h));
      } else if (var1 <= 0) {
         throw new IllegalArgumentException(a(i, j ^ k));
      } else {
         if (var0 > var1) {
            int var2 = var1;
            var1 = var0;
            var0 = var2;
         }

         int var4 = var1 - var0;
         int var3 = a(var4);
         return var0 + var3;
      }
   }
}
