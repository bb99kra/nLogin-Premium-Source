package com.nickuc.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ωςδωλλνδδ {
   private static int a = 0 >>> 10 | 0 << -10;
   private static int b = Integer.reverse(-1);
   private static long g = Long.reverse(-5908722711110090752L);
   private static long d = Long.reverse(-8612114837731653299L);
   private static String[] a = new String[ωςδωλλνδδ.h];
   private static long f = Long.reverse(2772985020260960589L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int i = Integer.reverse(1073741824);
   private static int h = (512 >>> 72 | 512 << -72) & -1;
   private static String[] b = new String[i];

   public static List<String> a(File var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   private static String a(int var0, long var1) {
      var1 ^= 117L;
      var1 ^= 6989257399102169349L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(49 + 19),
                     (byte)(11 + 58),
                     (byte)(38 + 45),
                     (byte)(33 + 14),
                     (byte)(43 + 24),
                     (byte)(49 + 17),
                     (byte)(57 + 10),
                     (byte)(43 + 4),
                     (byte)(70 + 10),
                     (byte)(48 + 27),
                     (byte)(24 + 43),
                     (byte)(60 + 23),
                     53,
                     (byte)(17 + 63),
                     (byte)(64 + 33),
                     (byte)(22 + 78),
                     (byte)(37 + 63),
                     105,
                     (byte)(107 + 3),
                     (byte)(48 + 55)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(φΨαξωυθανΣφυκη.A("âïî±ñíèñüë¸öúóöü¾љѓцќяѐѓыь", (byte)0, 65));
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

   public static String b(InputStream var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   public static String a(File var0, Charset var1) {
      List var2 = a(var0, var1);
      return String.join(c<"㺀">(a & b, d), var2);
   }

   public static List<String> a(InputStream var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   public static String a(InputStream var0, Charset var1) {
      List var2 = a(var0, var1);
      return String.join(c<"㺀">(e, f ^ g), var2);
   }

   public static String b(File var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   @CheckReturnValue
   public static ΔΨμωχωΦλΦπΩυ a(File var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   @CheckReturnValue
   public static ΔΨμωχωΦλΦπΩυ a(File var0, Charset var1) {
      try {
         FileInputStream var2 = new FileInputStream(var0);
         return a(var2, var1);
      } catch (FileNotFoundException var3) {
         throw new RuntimeException(var3);
      }
   }

   public static List<String> a(File var0, Charset var1) {
      ArrayList var2 = new ArrayList();
      if (var0.exists()) {
         ΔΨμωχωΦλΦπΩυ var3 = a(var0, var1);

         String var4;
         try {
            while ((var4 = var3.ah()) != null) {
               var2.add(var4);
            }
         } catch (Throwable var7) {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (var3 != null) {
            var3.close();
         }
      }

      return var2;
   }

   public static List<String> a(InputStream var0, Charset var1) {
      ArrayList var2 = new ArrayList();
      ΔΨμωχωΦλΦπΩυ var3 = a(var0, var1);

      String var4;
      try {
         while ((var4 = var3.ah()) != null) {
            var2.add(var4);
         }
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      return var2;
   }

   @CheckReturnValue
   public static ΔΨμωχωΦλΦπΩυ a(InputStream var0) {
      return a(var0, StandardCharsets.UTF_8);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωςδωλλνδδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣερμΔσατσκ.B("ƋƭƯƏƳǒǊǠǌƛǙǏǝǗƠǅǧǦǞǤǞƳ", (byte)114, 66), ωςδωλλνδδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΠΛΨοδΩσμνΛγΦφβς.E("֑֞֝ՠ֚֠֜֗֠֫է֥֢֥֩֫խईंࣵऋࣾࣿंࣺࣻւ", (byte)114, 69) + var1 + ΨφιωσρΓδΔθ.C("Յ", (byte)114, 67) + var2.toString(), var4
         );
      }
   }

   @CheckReturnValue
   public static ΔΨμωχωΦλΦπΩυ a(InputStream var0, Charset var1) {
      return new ΔΨμωχωΦλΦπΩυ(var0, var1);
   }

   static {
      b();
   }

   private static void b() {
      c = -5579321976939749788L;
      long var0 = c ^ 6989257399102169349L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(20 + 48),
               (byte)(64 + 5),
               (byte)(33 + 50),
               47,
               (byte)(61 + 6),
               (byte)(18 + 48),
               (byte)(37 + 30),
               (byte)(36 + 11),
               (byte)(76 + 4),
               (byte)(7 + 68),
               (byte)(8 + 59),
               (byte)(40 + 43),
               (byte)(3 + 50),
               (byte)(39 + 41),
               (byte)(15 + 82),
               (byte)(67 + 33),
               100,
               (byte)(29 + 76),
               (byte)(13 + 97),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = δΛψπξκσβγςα.D("֦֛֗մև֓ռ֛֣֥֠մ", (byte)125, 68);
               b[1] = ντθΔζβΔζ.C("֦֛֗մև֓ռ֛֣֥֠մ", (byte)125, 67);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.F("ցֆ։վַ֎ֱֺ֊֮֜ց", (byte)125, 70);
               b[1] = λΣΩσμφγχ.A("ǦǆǢƫǰǌǵǁǘǗǶǁ", (byte)125, 65);
               break;
            case 2:
               b[0] = μεςΩΔΣγν.A("ǄǑǌǬǗƮǙưƷǑǽƻǘƽǈƿǛǯƻǄǿȅǌǍ", (byte)125, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣδτΠνεγοΓορητ.D("ւձոպղցըչրռժְր֨ց\u058bփըղ\u0590հ֒տր", (byte)125, 68);
         }
      }
   }
}
