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

public enum κωΣΦΣεφκκκθποω {
   a((boolean)κωΣΦΣεφκκκθποω.i),
   b((boolean)κωΣΦΣεφκκκθποω.n);

   private final boolean aR;
   private static String[] a = new String[κωΣΦΣεφκκκθποω.d];
   private static String[] b = new String[κωΣΦΣεφκκκθποω.e];
   private static long c;
   private static int a = Integer.reverse(1073741824);
   private static int b = (0 >>> 158 | 0 << -158) & -1;
   private static int c = (16 >>> 68 | 16 << ~68 + 1) & -1;
   private static int d = 524288 >>> 242 | 524288 << -242;
   private static int e = (256 >>> 39 | 256 << -39) & -1;
   private static int f = 0 >>> 106 | 0 << ~106 + 1;
   private static long g = Long.reverse(-8731838616572922688L);
   private static int h = (0 >>> 247 | 0 << ~247 + 1) & -1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1;
   private static long k = Long.reverse(2509146053343835328L);
   private static long l = Long.reverse(-6629298651489370112L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(0);

   @Generated
   private κωΣΦΣεφκκκθποω(boolean var3) {
      this.aR = var3;
   }

   @Generated
   public boolean aQ() {
      return this.aR;
   }

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= 2993217613557451407L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(7 + 62),
                     (byte)(13 + 70),
                     (byte)(42 + 5),
                     (byte)(46 + 21),
                     (byte)(33 + 33),
                     67,
                     (byte)(40 + 7),
                     (byte)(29 + 51),
                     (byte)(63 + 12),
                     (byte)(47 + 20),
                     (byte)(36 + 47),
                     (byte)(20 + 33),
                     (byte)(28 + 52),
                     (byte)(3 + 94),
                     (byte)(21 + 79),
                     (byte)(6 + 94),
                     (byte)(71 + 34),
                     (byte)(11 + 99),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΠΛΨοδΩσμνΛγΦφβς.F("ՉՖՕԘ\u0558ՔՏ\u0558գՒԟ՝ա՚՝գԥࢱࣁ࢜ࢠ࢞ࢱࣃࢸࢹࢺࢹࣂࣂ࣍", (byte)42, 70));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κωΣΦΣεφκκκθποω.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φδχεθοκψαλΛογλ.E("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)106, 69), κωΣΦΣεφκκκθποω.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            λΣΩσμφγχ.C("Ֆգբԥեա՜եհ՟ԬժծէժհԲࢾ࣎ࢩࢭࢫࢾ࣐ࣅࣆࣇࣆ࣏࣏ࣚՌ", (byte)106, 67) + var1 + δΛψπξκσβγςα.F("ՠ", (byte)106, 70) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 229548312357915460L;
      long var0 = c ^ 2993217613557451407L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(33 + 36),
               (byte)(75 + 8),
               (byte)(32 + 15),
               (byte)(56 + 11),
               (byte)(21 + 45),
               (byte)(62 + 5),
               (byte)(20 + 27),
               (byte)(49 + 31),
               (byte)(29 + 46),
               67,
               (byte)(11 + 72),
               (byte)(10 + 43),
               (byte)(6 + 74),
               (byte)(44 + 53),
               (byte)(28 + 72),
               100,
               (byte)(50 + 55),
               (byte)(100 + 10),
               (byte)(54 + 49)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(45 + 24), 83}, StandardCharsets.UTF_8));
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
               b[0] = βεξΠθρρςΔΦμ.E("ՅՏՆՕ\u058bՇ\u0558\u058cկօլՕ", (byte)81, 69);
               b[1] = θεωψξβΛσσ.F("ֆ\u0557ըւվՉքՄիտհՕ", (byte)81, 70);
               break;
            case 1:
               b[0] = ζβησεθωυγτ.E("ՐՇՅւտ\u0558ՂՈւբՇՕ", (byte)81, 69);
               b[1] = πηγμΣΔκκ.B("ŤűƎŻŜƓƁƏŶŬşũ", (byte)81, 66);
               break;
            case 2:
               b[0] = χΠξΦιζΨΣωΦσΨζ.E("բըֈ՞ՂևփՄկփրբհժ\u058c֕ՐքփղՕգՠա", (byte)81, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = θεωψξβΛσσ.D("ӭӮԓԤԁӜӟԐӿӧԌԧӫԖԉԆԱӯԃԩԆԅӱԩԸԆԯԵԔԵԟԚ", (byte)81, 68);
         }
      }
   }
}
