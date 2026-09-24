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

public class NLoginCore_067 extends NLoginCore_353 {
   private static int j = Integer.reverse(-1);
   private static long e = Long.reverse(2793422078774879394L);
   private static String[] a = new String[NLoginCore_067.u];
   private static long k = Long.reverse(2793422078774879394L);
   private static int v = (1024 >>> 136 | 1024 << -136) & -1;
   private static long p = Long.reverse(1729382256910270464L);
   private static long t = Long.reverse(1729382256910270464L);
   private static String[] b = new String[v];
   private static int n = (16384 >>> 237 | 16384 << -237) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long s = Long.reverse(4522804335685149858L);
   private static int i = (67108864 >>> 122 | 67108864 << ~122 + 1) & -1;
   private static int l = (128 >>> 134 | 128 << ~134 + 1) & -1;
   private static int r = 192 >>> 134 | 192 << -134;
   private static int h = Integer.reverse(0);
   private static int f = (0 >>> 64 | 0 << ~64 + 1) & -1;
   private static int d = (-1 >>> 47 | -1 << ~47 + 1) & -1;
   private static long o = Long.reverse(4522804335685149858L);
   private static int q = 2097152 >>> 181 | 2097152 << -181;
   private static int u = (262144 >>> 48 | 262144 << -48) & -1;
   private static int c = 0 >>> 245 | 0 << -245;
   private static int m = Integer.reverse(0);
   private static long c;

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      String var10001 = a(i & j, k);
      Object[] var10002 = new Object[l];
      var10002[m] = a(n, o ^ p);
      var10002[q] = a(r, s ^ t);
      NLoginCore_150.a(var1, var10001, var10002);
   }

   private static String a(int var0, long var1) {
      var1 ^= 24L;
      var1 ^= -6123150761954910612L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(32 + 36),
                     (byte)(27 + 42),
                     (byte)(30 + 53),
                     (byte)(33 + 14),
                     (byte)(20 + 47),
                     (byte)(23 + 43),
                     (byte)(35 + 32),
                     (byte)(27 + 20),
                     (byte)(28 + 52),
                     (byte)(71 + 4),
                     (byte)(52 + 15),
                     (byte)(30 + 53),
                     (byte)(4 + 49),
                     80,
                     97,
                     (byte)(3 + 97),
                     (byte)(26 + 74),
                     (byte)(19 + 86),
                     (byte)(3 + 107),
                     (byte)(48 + 55)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.A("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӹӘӲӾӽԄԀԀԍԀӷԁԇ", (byte)86, 65));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_067.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_183.C("\u0530ՒՔԴ\u0558շկօձՀվմւռՅժ\u058c\u058bփ։փ\u0558", (byte)113, 67), NLoginCore_067.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.E("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣻࣚࣴऀࣿआंंएंࣹःउօ", (byte)113, 69) + var1 + NLoginCore_091.D("Ղ", (byte)113, 68) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_067(NLoginType_008 var1) {
      super(var1, a(c & d, e), null, (boolean)f, (boolean)g);
   }

   private static void b() {
      c = 4982169318253667196L;
      long var0 = c ^ -6123150761954910612L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(10 + 59),
               (byte)(24 + 59),
               (byte)(33 + 14),
               (byte)(45 + 22),
               (byte)(43 + 23),
               (byte)(5 + 62),
               (byte)(44 + 3),
               (byte)(19 + 61),
               (byte)(15 + 60),
               (byte)(12 + 55),
               (byte)(26 + 57),
               (byte)(13 + 40),
               (byte)(42 + 38),
               (byte)(74 + 23),
               (byte)(60 + 40),
               (byte)(83 + 17),
               (byte)(62 + 43),
               (byte)(13 + 97),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_076.F("ԷՌիեՎԩՒՏՖՊՃԼ", (byte)56, 70);
               b[1] = NLoginCore_387.C("ҵӒҲүӏӘҎӎҪҹҼҸәӁӁұҦӔҽӗӋӢӡӖӥҬӂӚҭӤӋӏӳӵӍӈӥӯӄҶӛәһӠԂҽҺәӖӔӇӦӴӚӾӄӠӁӇԌӰԒӟӡ", (byte)56, 67);
               b[2] = NLoginCore_004.A("ĨĥūśĶĵłŚŞŃşŰųōŌųřĹűĵřŅłŃ", (byte)56, 65);
               b[3] = NLoginCore_384.E("ԧլգԸՏզի՟ԫԳԮթԲիՇձղտՊՉԿհՇՈ", (byte)56, 69);
               break;
            case 1:
               b[0] = NLoginCore_138.D("ҏӅҷҷҧҰҩӏӈҟҩқұҶҚҝҟҼӔҦӦөҰұ", (byte)56, 68);
               b[1] = NLoginCore_453.C("ҵӒҲүӏӘҎӎҪҹҼҸәӁӁұҦӔҽӗӋӢӡӖӥҬӂӚҭӤӋӏӳӵӍӈӥӯӄҶӛәһӠԂҽҺәӖӔӇӦӴӟӨӦӖӋӻԋӢӟԔӠ", (byte)56, 67);
               b[2] = NLoginCore_232.B("ĨĥūśĶĵłŚŞŃŜņņŖŵńťİřźŏŕłŃ", (byte)56, 66);
               b[3] = NLoginCore_183.A("ĢŧŞĳŊšŦŚĦĮĩōŌŐŢūķŷŭőůŅłŃ", (byte)56, 65);
               break;
            case 2:
               b[0] = NLoginCore_397.D("ӍҗҶҕҒӋӆҧһҫҨҴҷҭұӒҴҿӃҽӞөҰұ", (byte)56, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_427.C("ҢҖӈҬҚӗӚӎҖҰҠҝһҴҾқӤӅҦӕӃҳҰұ", (byte)56, 67);
         }
      }
   }
}
