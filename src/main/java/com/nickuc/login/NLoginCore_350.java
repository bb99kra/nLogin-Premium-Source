package com.nickuc.login;

import com.nickuc.login.lib.zip4j.ZipFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_350 {
   private static String[] ZKM_STR_B = new String[NLoginCore_350.k];
   private static long c;
   private static long b = Long.reverse(-1118616149201015303L);
   private static long f = Long.reverse(-7171454048386961927L);
   private static int k = Integer.reverse(-1073741824);
   private static String[] ZKM_STR_A = new String[NLoginCore_350.j];
   private static long i = Long.reverse(-7171454048386961927L);
   private static int e = 32 >>> 229 | 32 << -229;
   private static int h = -1 >>> 176 | -1 << -176;
   private static int j = (25165824 >>> 247 | 25165824 << ~247 + 1) & -1;
   private static int g = (134217728 >>> 58 | 134217728 << -58) & -1;
   private static int a = 0 >>> 7 | 0 << ~7 + 1;
   private static long d = Long.reverse(7782220156096217088L);

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_350.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.C("ЖикКоѝѕѫїЦѤњѨѢЫѐѲѱѩѯѩо", (byte)19, 67), NLoginCore_350.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.A("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѽѶѩѬэўяѵ҆џ҅҈ѕѸѬÿ", (byte)19, 65) + var1 + NLoginCore_471.B("ß", (byte)19, 66) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -6938398447392809457L;
      long var0 = c ^ -1383967005392765319L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               (byte)(5 + 64),
               (byte)(77 + 6),
               47,
               (byte)(56 + 11),
               (byte)(12 + 54),
               (byte)(66 + 1),
               (byte)(34 + 13),
               (byte)(8 + 72),
               (byte)(45 + 30),
               (byte)(60 + 7),
               (byte)(17 + 66),
               (byte)(23 + 30),
               (byte)(4 + 76),
               (byte)(21 + 76),
               (byte)(57 + 43),
               (byte)(89 + 11),
               (byte)(88 + 17),
               (byte)(72 + 38),
               (byte)(60 + 43)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), (byte)(66 + 17)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.D("ӞӑԈӡԐәԖԘӖӚԖԡԓԐӾӯԢӜԛӡӦԔԦӻԣӦӫԜӬӱԃԫԖԎԘԆԖӲԴԘԔԱԗԠԫԫՂԐՅԻԘՉԺԢԏԐ", (byte)77, 68);
               ZKM_STR_B[1] = NLoginCore_553.E("Կ՝վկյչ\u0558Իռսժ\u058bՍծակժՒվ֍Ոն֓դջ՚֍ըճչ֒՝փ֔՛ՠՠ՝՟ֈզֈգձ", (byte)77, 69);
               ZKM_STR_B[2] = NLoginCore_241.F("Կ՝վկյչ\u0558Իռսժն֎փ՝Վ֊լաի\u058cշզ֑֗դկյ֖֖֡պռ֒ղ֥֘֠օտժջ֦ձ", (byte)77, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.E("ՋԾյՎսՆփօՃՇփ֎րսի՜֏ՉֈՎՓց֓ը\u0590Փ\u0558։ՙ՞հ֘փջօճփ՟֡օց֞քռ֤օցպ֝հղֱֵ֥ռս", (byte)77, 69);
               ZKM_STR_B[1] = NLoginCore_183.F("Կ՝վկյչ\u0558Իռսժ\u058bՍծակժՒվ֍Ոն֓դջ՚֍ըճչ֒՝՟֠՟նդա֦֢֟֝֠ըֈևպկ֏֤զ֍ֱֵռս", (byte)77, 70);
               ZKM_STR_B[2] = NLoginCore_183.D("ӒӰԑԂԈԌӫӎԏԐӽԉԡԖӰӡԝӿӴӾԟԊӹԪԤӷԂԈԩԩԴԍӭԏԶԬԆԌԺԸԧԔԷӻԳӸԹՃԗԟԣԹՉՈԏԐ", (byte)77, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.F("Ձ՜ճօ՚\u0557աեՙսՋՑ", (byte)77, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_110.D("ӰԎӗӣԔӷԕӜԔӳԀӼӻӠӠӰԔӴԐԈԤӲӯӰ", (byte)77, 68);
         }
      }
   }

   public static void b(File var0, File var1) {
      ZipFile var2 = new ZipFile(var1);

      try {
         if (var0.isDirectory()) {
            var2.addFolder(var0);
         } else {
            var2.addFile(var0);
         }
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
   }

   public static void a(List<File> var0, File var1) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException(a(a, b ^ d));
      } else {
         ZipFile var2 = new ZipFile(var1);

         try {
            for (File var4 : var0) {
               if (var4.isDirectory()) {
                  var2.addFolder(var4);
               } else {
                  var2.addFile(var4);
               }
            }
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 54L;
      var1 ^= -1383967005392765319L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(21 + 48),
                     (byte)(56 + 27),
                     (byte)(42 + 5),
                     (byte)(41 + 26),
                     (byte)(34 + 32),
                     (byte)(35 + 32),
                     47,
                     (byte)(6 + 74),
                     (byte)(3 + 72),
                     (byte)(55 + 12),
                     (byte)(60 + 23),
                     (byte)(16 + 37),
                     (byte)(48 + 32),
                     (byte)(2 + 95),
                     (byte)(27 + 73),
                     (byte)(95 + 5),
                     105,
                     (byte)(36 + 74),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), (byte)(45 + 38)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.A("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎӧӠӓӖҷӈҹӟӰӉӯӲҿӢӖ", (byte)72, 65));
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

   public static byte[] b(byte[] var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DeflaterOutputStream var2 = new DeflaterOutputStream(var1);

         try {
            var2.write(var0);
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var1.toByteArray();
      } catch (IOException var7) {
         throw new RuntimeException(a(e, f), var7);
      }
   }

   public static byte[] c(byte[] var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         InflaterOutputStream var2 = new InflaterOutputStream(var1);

         try {
            var2.write(var0);
            var2.flush();
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var1.toByteArray();
      } catch (IOException var7) {
         throw new RuntimeException(a(g & h, i), var7);
      }
   }

   public static void a(File var0, File var1) {
      ZipFile var2 = new ZipFile(var0);

      try {
         var2.extractAll(var1.toString());
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
   }
}
