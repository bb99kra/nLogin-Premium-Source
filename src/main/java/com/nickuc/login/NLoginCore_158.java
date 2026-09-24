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

public final class NLoginCore_158 {
   private static int m = Integer.reverse(536870912);
   private static long e = Long.reverse(-5908722711110090752L);
   private static int f = Integer.reverse(1073741824);
   private static int i = Integer.reverse(-1073741824);
   private static long d = Long.reverse(2528377302165917558L);
   private static int l = Integer.reverse(536870912);
   private static long b = Long.reverse(-8280261803523272842L);
   private static long c;
   private static long j = Long.reverse(2528377302165917558L);
   private static long h = Long.reverse(-5908722711110090752L);
   private static String[] b = new String[m];
   private static String[] a = new String[l];
   private static long g = Long.reverse(2528377302165917558L);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long k = Long.reverse(-5908722711110090752L);
   private static int a = 0 >>> 94 | 0 << ~94 + 1;

   private static String a(int var0, long var1) {
      var1 ^= 117L;
      var1 ^= -5548013784763017427L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(56 + 12),
                     (byte)(34 + 35),
                     (byte)(81 + 2),
                     (byte)(26 + 21),
                     (byte)(14 + 53),
                     (byte)(56 + 10),
                     (byte)(19 + 48),
                     (byte)(12 + 35),
                     80,
                     75,
                     (byte)(44 + 23),
                     (byte)(13 + 70),
                     (byte)(43 + 10),
                     (byte)(30 + 50),
                     (byte)(49 + 48),
                     (byte)(80 + 20),
                     (byte)(92 + 8),
                     (byte)(92 + 13),
                     (byte)(10 + 100),
                     (byte)(3 + 100)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), (byte)(16 + 67)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӥӐӷӟԉӶӳӼԉԉԏԅӨ", (byte)86, 66));
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

   private static void b() {
      c = 7994245121922656452L;
      long var0 = c ^ -5548013784763017427L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               69,
               (byte)(30 + 53),
               (byte)(44 + 3),
               (byte)(3 + 64),
               (byte)(17 + 49),
               67,
               (byte)(33 + 14),
               (byte)(70 + 10),
               (byte)(2 + 73),
               (byte)(46 + 21),
               (byte)(75 + 8),
               (byte)(21 + 32),
               (byte)(61 + 19),
               (byte)(51 + 46),
               (byte)(40 + 60),
               (byte)(5 + 95),
               (byte)(97 + 8),
               (byte)(62 + 48),
               (byte)(73 + 30)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_173.B("ƦƠƅǃǏǄƠǁƓǅǇǅƲƔƒƨƗƬƨǐƭǋƫƫǠǀưƣƿǢǜƴ", (byte)106, 66);
               b[1] = NLoginCore_559.C("ՠէԪդհգԾկՁէբկՅՇՋՊԶիՓղճԷփմՃ՚Լճբշւզ՛։ջՎք֎գՋՊևՍ՛", (byte)106, 67);
               b[2] = NLoginCore_138.D("ՆՀԥգկդՀաԳեէեՒԴԲՈԷՌՈհՍիՋՋրՠՐՃ՟ւռՔ", (byte)106, 68);
               b[3] = NLoginCore_521.B("ƊƌƺƪƽƟƏƎǌƋǈưǘƘƥǘƽƺƜǈƛƳǘǕƺǗƠǂǗƧƻǅ", (byte)106, 66);
               break;
            case 1:
               b[0] = NLoginCore_387.F("չճ\u0558֖֢֗ճ֔զ֚֘֘օէեջժտջ֣ր֕\u058b֦ց֤֕ո֧չյ֟", (byte)106, 70);
               b[1] = NLoginCore_530.B("ǀǇƊǄǐǃƞǏơǇǂǏƥƧƫƪƖǋƳǒǓƗǣǔƣƺƜǓǂǗǢǆƼǘǡǏǬǍƾǊǎƳƱƻ", (byte)106, 66);
               b[2] = NLoginCore_076.A("ƦƠƅǃǏǄƠǁƓǅǇǅƲƔƒƨƗƬƨǐƭƻǃƹǥǑǖơǖǈǟƢǆƭǂǫǩǂǡǭǡǭǨƻ", (byte)106, 65);
               b[3] = NLoginCore_110.D("ԪԬ՚Պ՝ԿԯԮլԫըՐոԸՅո՝՚ԼըԻ\u0557նռՂտՕեաշդս", (byte)106, 68);
               break;
            case 2:
               b[0] = NLoginCore_471.F("՚֔ս֏փք֣՜օ֖ձծ", (byte)106, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_433.B("ǅǀƫƦƢƫưƏƭƤǆƐǅƮưƚƲƸƭƼƬƵǖǏƿǆƹƧǩƤƿƻ", (byte)106, 66);
         }
      }
   }

   public static byte[] a(byte[] var0) {
      try {
         return Base64.getDecoder().decode(var0);
      } catch (Exception var2) {
         throw new RuntimeException(a(c, d ^ e), var2);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_158.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.B("ÝÿāáąĤĜĲĞíīġįĩòėĹĸİĶİą", (byte)27, 66), NLoginCore_158.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.B("ĘĥĤçħģĞħĲġîĬİĩĬĲôѯњҁѩғҀѽ҆ғғҙҏѲč", (byte)27, 66) + var1 + NLoginCore_076.B("ï", (byte)27, 66) + var2.toString(), var4
         );
      }
   }

   public static String a(byte[] var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(a(i, j ^ k));
      } else {
         return new String(Base64.getEncoder().encode(var0));
      }
   }

   public static String u(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(a(a, b));
      } else {
         byte[] var1 = a(var0.getBytes(StandardCharsets.UTF_8));
         return new String(var1);
      }
   }

   public static String v(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(a(f, g ^ h));
      } else {
         return a(var0.getBytes(StandardCharsets.UTF_8));
      }
   }

   static {
      b();
   }
}
