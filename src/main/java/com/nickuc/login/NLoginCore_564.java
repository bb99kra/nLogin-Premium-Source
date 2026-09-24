package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_564 extends NLoginCore_374 {
   private static long ag = Long.reverse(3124544086110385047L);
   private static long u = Long.reverse(3124544086110385047L);
   private static int w = (16777216 >>> 87 | 16777216 << -87) & -1;
   private static long aj = Long.reverse(-6052837899185946624L);
   private static long i = Long.reverse(-6052837899185946624L);
   private static int al = 4194304 >>> 116 | 4194304 << ~116 + 1;
   private final String N;
   private static int c = 0 >>> 167 | 0 << ~167 + 1;
   private static int s = 0 >>> 20 | 0 << ~20 + 1;
   private static int m = Integer.reverse(0);
   private static long f;
   private static long v = Long.reverse(-6052837899185946624L);
   private static int ae = Integer.reverse(-1073741824);
   private static long g = Long.reverse(3124544086110385047L);
   private static int y = Integer.reverse(-1);
   private static int t = (2048 >>> 107 | 2048 << -107) & -1;
   private static String[] d = new String[NLoginCore_564.an];
   private static int an = Integer.reverse(536870912);
   private static int ak = Integer.reverse(0);
   private static long aa = Long.reverse(-8692901336109796457L);
   private static String[] c = new String[al];

   static {
      b();
   }

   public NLoginCore_564(NLoginType_008 var1, NLoginCore_479 var2, String var3, boolean var4) {
      super(var1, var2, var4);
      this.N = var3;
   }

   @Override
   protected void b(NLoginInterface_042 var1) {
      File var2 = new File(this.b(), this.N);
      if (var2.isDirectory()) {
         File[] var3 = var2.listFiles();
         if (var3 == null) {
            if (var1 != null) {
               NLoginCore_150.a(var1, a(c, g ^ i));
            }
         } else {
            this.j = var3.length;
            File[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = s; var6 < var5; var6++) {
               File var7 = var4[var6];

               try {
                  this.a(var7);
               } catch (Exception var12) {
                  NLoginCore_370.b(a(t, u ^ v) + this.a.getName() + a(w & y, aa) + var7.getName() + a(ae, ag ^ aj), var12);
               } finally {
                  this.l++;
               }
            }

            this.c(var1);
         }
      }
   }

   protected abstract void a(File var1);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_564.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.C("ՑճյՕչ֘\u0590֦֒ա֣֟֕֝զ\u058b֤֪֤֭֬չ", (byte)124, 67), NLoginCore_564.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.E("֛֧֨ժֵ֪֦֪֤֡ձֳֵ֯֬֯շࣤࣾईऀऍࣩअघईऐऄकࣽ\u0590", (byte)124, 69) + var1 + NLoginCore_433.A("Ʊ", (byte)124, 65) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      f = -1599880070909314348L;
      long var0 = f ^ -5510114918239256024L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(4 + 65),
               (byte)(54 + 29),
               (byte)(19 + 28),
               (byte)(6 + 61),
               (byte)(33 + 33),
               (byte)(46 + 21),
               (byte)(7 + 40),
               (byte)(36 + 44),
               (byte)(55 + 20),
               (byte)(45 + 22),
               (byte)(26 + 57),
               53,
               (byte)(25 + 55),
               (byte)(8 + 89),
               (byte)(7 + 93),
               (byte)(67 + 33),
               (byte)(90 + 15),
               (byte)(14 + 96),
               (byte)(58 + 45)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_004.B("ňōƒŮƋƒŗœſŗŻŬƃƚŠƠŸƝƥƜƋƣŵƊƚƛƂŽŤŬƜƭƪŲƥƌŰƼƵƆƌƶƖƶǃƝǂƚƔƑƓƝǅƜƃƚƣƗƩƉƋƥƼƌ", (byte)79, 66);
               d[1] = NLoginCore_453.F("ՂնՅւցՠՊչիՋ՚Փ", (byte)79, 70);
               d[2] = NLoginCore_433.D("ӺӜӱԆӶӯӭӽԘӽԁӪ", (byte)79, 68);
               d[3] = NLoginCore_387.A("žƘƕůŘƌƌŸƆŷƑƒŚŸŖƀƂŦƂŶŴƋƠƁƄƨƥƅơƯƂƟŵƥƈůƴƼƖƉƚƫƶƅ", (byte)79, 65);
               break;
            case 1:
               d[0] = NLoginCore_387.C("ӍӒԗӳԐԗӜӘԄӜԀӱԈԟӥԥӽԢԪԡԐԨӺԏԟԠԇԂөӱԡԲԯӷԪԑӵՁԺԋԑԻԛԻՈԢՇԟԙԖԘԢՊԥՑԚԴՄՐԱՏՎՈԢ", (byte)79, 67);
               d[1] = NLoginCore_387.F("վՀ՜փգղՃբո\u058b՚Փ", (byte)79, 70);
               d[2] = NLoginCore_451.C("ӴԒԘӾӑӻӿԜԏӣԀӵӹԘԛӸԈӻԞӽԚԮӵӶ", (byte)79, 67);
               d[3] = NLoginCore_324.B("žƘƕůŘƌƌŸƆŷƑƒŚŸŖƀƂŦƂŶŴƋƠƁƄƨƥƅơƯƂƟųƗƎƬƘƊƮƫƳűƠƅ", (byte)79, 66);
               break;
            case 2:
               d[0] = NLoginCore_451.F("ՔշշչԿք՛Օէի։րբհի֏՞ղե\u0557Պ֒չքմի֗\u0557ս\u058b֔՛", (byte)79, 70);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_232.B("ųŲůƒųųƏŵŰźŨť", (byte)79, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 53L;
      var1 ^= -5510114918239256024L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(20 + 49),
                     (byte)(35 + 48),
                     (byte)(16 + 31),
                     (byte)(12 + 55),
                     (byte)(28 + 38),
                     (byte)(8 + 59),
                     47,
                     80,
                     (byte)(46 + 29),
                     (byte)(3 + 64),
                     (byte)(30 + 53),
                     (byte)(36 + 17),
                     (byte)(24 + 56),
                     (byte)(93 + 4),
                     (byte)(77 + 23),
                     (byte)(83 + 17),
                     (byte)(101 + 4),
                     (byte)(54 + 56),
                     (byte)(34 + 69)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.D("ыјїКњіёњѥєСџѣќџѥЧޔޮ\u07b8ް\u07bdޙ\u07b5߈\u07b8߀\u07b4߅ޭ", (byte)17, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }
}
