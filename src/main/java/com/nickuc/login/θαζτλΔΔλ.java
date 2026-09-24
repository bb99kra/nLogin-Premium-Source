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

public class θαζτλΔΔλ implements ιΨφαρελΣζΠΔΩ, κΓΦνκχβδ {
   private static int n = Integer.reverse(-1);
   private static int q = Integer.reverse(1073741824);
   private static int j = Integer.reverse(0);
   private static String[] a = new String[θαζτλΔΔλ.p];
   private static int f = 0 >>> 90 | 0 << -90;
   private static long c;
   private static int i = (0 >>> 9 | 0 << -9) & -1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private final ΩγΛξιχγτ ab;
   private static long k = Long.reverse(-7137549614140544533L);
   private static int p = 268435456 >>> 91 | 268435456 << ~91 + 1;
   private static int d = (0 >>> 210 | 0 << ~210 + 1) & -1;
   private static int c = (0 >>> 227 | 0 << -227) & -1;
   private static int m = (4096 >>> 108 | 4096 << -108) & -1;
   private static int a = Integer.reverse(-1879048192);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(1073741824);
   private static long o = Long.reverse(-5119936981078562325L);
   private static int g = (4096 >>> 140 | 4096 << ~140 + 1) & -1;
   private static long l = Long.reverse(2594073385365405696L);
   private static String[] b = new String[q];

   @Generated
   public θαζτλΔΔλ(ΩγΛξιχγτ var1) {
      this.ab = var1;
   }

   static {
      b();
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
      return this.ab;
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= 7163277145169251723L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(57 + 12),
                     (byte)(81 + 2),
                     (byte)(41 + 6),
                     (byte)(27 + 40),
                     (byte)(5 + 61),
                     (byte)(24 + 43),
                     (byte)(45 + 2),
                     (byte)(7 + 73),
                     75,
                     (byte)(9 + 58),
                     (byte)(17 + 66),
                     (byte)(13 + 40),
                     (byte)(28 + 52),
                     (byte)(14 + 83),
                     100,
                     (byte)(31 + 69),
                     (byte)(48 + 57),
                     (byte)(83 + 27),
                     (byte)(50 + 53)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.E("ԪԷԶӹԹԵ\u0530ԹՄԳԀԾՂԻԾՄԆ\u0890ࢊ\u0890࢟\u0897ࡱࡲ࢚", (byte)11, 69));
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

   @Override
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      εδδΠηδξΛΣχ.a(var2, ευτβπαψω.m, var1x -> {
         if (var1x.contains(c<"㺀">(j, k ^ l))) {
            var4.c(var1x, c<"㺃">(m & n, o));
         } else {
            var4.a(var1x);
         }
      });
      γοηλιμεπη[] var10001 = new γοηλιμεπη[e];
      var10001[f] = γοηλιμεπη.b;
      var10001[g] = γοηλιμεπη.c;
      return αΠαβσΠτΦ.a(var2, var10001);
   }

   private static void b() {
      c = -2912502550363484359L;
      long var0 = c ^ 7163277145169251723L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(26 + 42),
               (byte)(8 + 61),
               (byte)(2 + 81),
               (byte)(41 + 6),
               (byte)(46 + 21),
               (byte)(18 + 48),
               (byte)(5 + 62),
               (byte)(26 + 21),
               (byte)(51 + 29),
               (byte)(54 + 21),
               (byte)(22 + 45),
               (byte)(23 + 60),
               53,
               80,
               (byte)(29 + 68),
               (byte)(9 + 91),
               (byte)(93 + 7),
               (byte)(11 + 94),
               (byte)(5 + 105),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               b[0] = μζξτΩσσφυδεπλΨ.D("ҠңӅӂҥӅңҎӓӆӗҔәӛҖҗҮӌҿӡһҺҧҨ", (byte)53, 68);
               b[1] = βθκςνθΩθυμςτκχ.D("ҊҠҝ҂ңңӓҔҰңҍҤҹҦҪӅүӚӖӋҳҝӑҳқҲұӓӛҹӠөӈӠҾӮӏӈҿӁҴӃӠӔӆөӓӕӱӾӉӨӟҾӏӑӚӣӀӿӇӽԄԈӿӘӢԆԇӉӼӟԐԄӯӜ", (byte)53, 68);
               break;
            case 1:
               b[0] = φδχεθοκψαλΛογλ.E("ԽՀբ՟ՂբՀԫհգղնՄՄժըժՍԶ՝՚խՄՅ", (byte)53, 69);
               b[1] = πχσδΦΦνθΔπ.B("ğĵĲėĸĸŨĩŅĸĢĹŎĻĿŚńůūŠňĲŦňİŇņŨŰŎŵžŝŵœƃŤŝŔŖŉŘŵũśžŨŪƆƓŞŽŴœŤŦůŸŕƔŜƒƙƝƢƂŻşƛŞťƘƨŹƞű", (byte)53, 66);
               break;
            case 2:
               b[0] = οοθδΨιοΦΠβδζ.D("҃ҶҮҞҦҾҮӀӍӐӂӀҭҗәӕӇҜҰӐәӠҧҨ", (byte)53, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = φδχεθοκψαλΛογλ.E("ՁՌԼԫ՛ՅԯՊԩԥժճԭԲԪէժՌԹՏ\u0558խՄՅ", (byte)53, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  θαζτλΔΔλ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.A("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 65), θαζτλΔΔλ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣερμΔσατσκ.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢭࢧࢭࢼࢴࢎ\u088fࢷԷ", (byte)40, 70) + var1 + ΠΛΨοδΩσμνΛγΦφβς.D("ѧ", (byte)40, 68) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4, γοηλιμεπη var5) {
      switch (ΨΨμριξχογοη.C[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).i((boolean)(var5 == γοηλιμεπη.b ? h : i));
            κΓΦνκχβδ.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      return (boolean)(var1.a().n() == a && var1.a().q() ? b : c);
   }
}
