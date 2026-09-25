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

public class GUIButtonContainer {
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int f = (1073741824 >>> 190 | 1073741824 << ~190 + 1) & -1;
   private final NLoginCore_445 q;
   private final NLoginCore_190 a;
   private static long d = Long.reverse(-7741388606031145556L);
   private static String[] ZKM_STR_A = new String[f];
   private static int e = (0 >>> 1 | 0 << ~1 + 1) & -1;
   private static long c;
   private static int b = -1 >>> 79 | -1 << -79;
   private static String[] ZKM_STR_B = new String[g];
   private static int a = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 24L;
      var1 ^= 5176793162442191896L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(62 + 6),
                     (byte)(66 + 3),
                     (byte)(21 + 62),
                     (byte)(27 + 20),
                     (byte)(32 + 35),
                     (byte)(14 + 52),
                     (byte)(51 + 16),
                     (byte)(45 + 2),
                     (byte)(6 + 74),
                     (byte)(24 + 51),
                     (byte)(16 + 51),
                     (byte)(22 + 61),
                     (byte)(21 + 32),
                     80,
                     (byte)(56 + 41),
                     100,
                     (byte)(37 + 63),
                     (byte)(28 + 77),
                     (byte)(68 + 42),
                     (byte)(64 + 39)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡧࡗࡩ\u086bࡽ࡛ࢀࡣ", (byte)80, 67));
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
      c = 3867328363765467441L;
      long var0 = c ^ 5176793162442191896L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(13 + 55),
               (byte)(10 + 59),
               (byte)(29 + 54),
               47,
               (byte)(65 + 2),
               (byte)(2 + 64),
               (byte)(56 + 11),
               (byte)(6 + 41),
               (byte)(45 + 35),
               (byte)(40 + 35),
               67,
               (byte)(45 + 38),
               (byte)(21 + 32),
               (byte)(74 + 6),
               (byte)(2 + 95),
               (byte)(5 + 95),
               (byte)(68 + 32),
               (byte)(102 + 3),
               (byte)(40 + 70),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.A("ƟƦƗǋǐƷǎƺǓǞƠǔǣǞƯǅǠǛƦǇǒƴǆǌƭǛǮǅǲǅǃƱƮǦǒǯǉǍǲǚǴǻǶǅ", (byte)111, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_471.A("ƟƦƗǋǐƷǎƺǓǞƠǔǣǞƯǅǠǛƦǇǒƴǆǌƭǛǮǅǲǅǃƱƯƵǧǋƸǧǴǝǪǭǘǅ", (byte)111, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_521.A("ǒǍƢƴƐǐǏƧƱƸǡƚƼǚǟƱǐǂǀǘǦǅƤǮǋǩǪǰǪǛǉǋ", (byte)111, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.E("շ֕ձցօն֣֪֦֝նիօթ֍֤֞֔֊։ַցվտ", (byte)111, 69);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_445 a() {
      return this.q;
   }

   public static GUIButtonContainer[] a(NLoginCore_277 var0, NLoginCore_445... var1) {
      if (var1.length == 0) {
         throw new IllegalArgumentException(a(a & b, d));
      } else {
         GUIButtonContainer[] var2 = new GUIButtonContainer[var1.length];

         for (int var3 = e; var3 < var2.length; var3++) {
            NLoginCore_445 var4 = var1[var3];
            var2[var3] = var4.a(var0);
         }

         return var2;
      }
   }

   @Generated
   public NLoginCore_190 a() {
      return this.a;
   }

   @Generated
   public GUIButtonContainer(NLoginCore_445 var1, NLoginCore_190 var2) {
      this.q = var1;
      this.a = var2;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  GUIButtonContainer.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.B("ÍïñÑõĔČĢĎÝěđğęâćĩĨĠĦĠõ", (byte)19, 66), GUIButtonContainer.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.E("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎ\u0891ࢁ\u0893\u0895ࢧࢅࢪࢍԢ", (byte)19, 69) + var1 + NLoginCore_232.F("ԉ", (byte)19, 70) + var2.toString(), var4
         );
      }
   }
}
