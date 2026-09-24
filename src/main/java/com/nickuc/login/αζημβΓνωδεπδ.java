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

public class αζημβΓνωδεπδ extends ΠθκονθΛλαχςΔ {
   private static int aw = 100663296 >>> 89 | 100663296 << -89;
   private static long as = Long.reverse(794710641361266000L);
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static long at = Long.reverse(1873497444986126336L);
   private static int az = (98304 >>> 111 | 98304 << -111) & -1;
   private static long ap = Long.reverse(1227056205588833616L);
   private static long ac = Long.reverse(1873497444986126336L);
   private static String[] g = new String[aw];
   private static long r;
   private static int ar = Integer.reverse(1073741824);
   private static String[] h = new String[az];
   private static int m = 0 >>> 251 | 0 << -251;
   private static long v = Long.reverse(794710641361266000L);

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= -7370788415259141245L;
      if (g[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(9 + 60),
                     (byte)(77 + 6),
                     47,
                     (byte)(8 + 59),
                     (byte)(12 + 54),
                     (byte)(18 + 49),
                     (byte)(32 + 15),
                     (byte)(28 + 52),
                     (byte)(44 + 31),
                     (byte)(52 + 15),
                     (byte)(54 + 29),
                     (byte)(40 + 13),
                     (byte)(23 + 57),
                     (byte)(66 + 31),
                     100,
                     (byte)(87 + 13),
                     (byte)(94 + 11),
                     (byte)(13 + 97),
                     (byte)(18 + 85)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨφιωσρΓδΔθ.F("՞իժԭխթդխոէԴղնկղոԺࢽࣃࣅ࣋ࣂࢤ࣏ࣜࣈ࣊ࣖ࣋", (byte)63, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         g[var0] = new String(var3.doFinal(Base64.getDecoder().decode(h[var0])), StandardCharsets.UTF_8);
      }

      return g[var0];
   }

   public αζημβΓνωδεπδ(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.z, c<"㺀">(m, v ^ ac), c<"㺃">(ai, ap), c<"㺆">(ar, as ^ at), null);
   }

   private static void b() {
      r = 767285000235573456L;
      long var0 = r ^ -7370788415259141245L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(55 + 13),
               69,
               (byte)(27 + 56),
               (byte)(32 + 15),
               (byte)(16 + 51),
               (byte)(32 + 34),
               (byte)(31 + 36),
               (byte)(38 + 9),
               (byte)(18 + 62),
               (byte)(42 + 33),
               (byte)(58 + 9),
               (byte)(80 + 3),
               (byte)(52 + 1),
               (byte)(22 + 58),
               (byte)(22 + 75),
               100,
               (byte)(42 + 58),
               (byte)(86 + 19),
               (byte)(79 + 31),
               (byte)(75 + 28)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
               h[0] = ΠΛΨοδΩσμνΛγΦφβς.A("ŠŠšůƐƍƔƜƐƚŬżƝƕƀƢŰŤƢƗƤƗŮů", (byte)78, 65);
               h[1] = ΠΛΨοδΩσμνΛγΦφβς.D("ӓӥԄԒԄԆԚԗԁԖԘӧ", (byte)78, 68);
               h[2] = πχσδΦΦνθΔπ.A("ŭŶƐūŭƃƐŮƌŻžţ", (byte)78, 65);
               break;
            case 1:
               h[0] = μεςΩΔΣγν.E("ՏՏՐ՞տռփ\u058bտ։՜\u0558\u0590գջ֑գփՇև֕ՠ՝՞", (byte)78, 69);
               h[1] = ΣερμΔσατσκ.D("ӢӐӥӯӭӷӴԚԟӱԊԢӢӣӿӴӾӶԘӺԦԛӲӳ", (byte)78, 68);
               h[2] = ΣερμΔσατσκ.B("ſƉƃťŢƎŖŵŕźŴŝŬƌƋƁŢŜƁƏƞűŮů", (byte)78, 66);
               break;
            case 2:
               h[0] = λΣΩσμφγχ.F("վՀղտՖյջ։ց\u058cյՆՌՐՇհղ՞աՐզծհՒպ֛Տ֏խ֙֙֜", (byte)78, 70);
            case 3:
            default:
               break;
            case 4:
               h[0] = βεξΠθρρςΔΦμ.C("ӎԔԓӔԎӏӱԈӗԡԘӧ", (byte)78, 67);
         }
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  αζημβΓνωδεπδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.A("řŻŽŝƁƠƘƮƚũƧƝƫƥŮƓƵƴƬƲƬƁ", (byte)89, 65), αζημβΓνωδεπδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ςΦζσμτΓσ.F("ոօքՇևփվև֒ցՎ\u058c\u0590։\u058c֒Քࣗࣝࣟࣥࣜࢾࣩࣶ\u08e2ࣰࣤࣥլ", (byte)89, 70) + var1 + θεωψξβΛσσ.B("ū", (byte)89, 66) + var2.toString(), var4
         );
      }
   }
}
