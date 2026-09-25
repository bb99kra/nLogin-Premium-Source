package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_026 {
   a((char)NLoginCore_026.q, var0 -> TimeUnit.MILLISECONDS.toDays(var0) % NLoginCore_026.e),
   b((char)NLoginCore_026.v, var0 -> TimeUnit.MILLISECONDS.toHours(var0) % NLoginCore_026.d),
   c((char)NLoginCore_026.aa, var0 -> TimeUnit.MILLISECONDS.toMinutes(var0) % NLoginCore_026.b),
   d((char)NLoginCore_026.af, var0 -> TimeUnit.MILLISECONDS.toSeconds(var0) % NLoginCore_026.a);

   private final char e;
   private final Function<Long, Long> a;
   private static String[] ZKM_STR_A = new String[NLoginCore_026.k];
   private static String[] ZKM_STR_B = new String[NLoginCore_026.l];
   private static long c;
   private static long a = Long.reverse(4323455642275676160L);
   private static long b = Long.reverse(4323455642275676160L);
   private static long d = Long.reverse(1729382256910270464L);
   private static long e = Long.reverse(-2L);
   private static int f = ('耀' >>> 173 | 32768 << -173) & -1;
   private static int g = 0 >>> 67 | 0 << ~67 + 1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int i = Integer.reverse(1073741824);
   private static int j = Integer.reverse(-1073741824);
   private static int k = 4194304 >>> 84 | 4194304 << ~84 + 1;
   private static int l = Integer.reverse(536870912);
   private static int m = 0 >>> 109 | 0 << -109;
   private static long n = Long.reverse(1958570383982790985L);
   private static long o = Long.reverse(-1729382256910270464L);
   private static int p = (0 >>> 64 | 0 << -64) & -1;
   private static int q = (13107200 >>> 49 | 13107200 << -49) & -1;
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static long s = Long.reverse(1958570383982790985L);
   private static long t = Long.reverse(-1729382256910270464L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(369098752);
   private static int w = Integer.reverse(1073741824);
   private static int x = Integer.reverse(-1);
   private static long y = Long.reverse(-923733377534326455L);
   private static int z = Integer.reverse(1073741824);
   private static int aa = 6976 >>> 70 | 6976 << -70;
   private static int ab = Integer.reverse(-1073741824);
   private static long ac = Long.reverse(1958570383982790985L);
   private static long ad = Long.reverse(-1729382256910270464L);
   private static int ae = 402653184 >>> 123 | 402653184 << ~123 + 1;
   private static int af = Integer.reverse(-838860800);

   static {
      b();
   }

   @Generated
   private NLoginCore_026(char var3, Function<Long, Long> var4) {
      this.e = var3;
      this.a = var4;
   }

   private static String a(int var0, long var1) {
      var1 ^= 23L;
      var1 ^= -5969186228851583487L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(44 + 25),
                     (byte)(9 + 74),
                     (byte)(17 + 30),
                     (byte)(17 + 50),
                     (byte)(33 + 33),
                     (byte)(18 + 49),
                     (byte)(27 + 20),
                     (byte)(72 + 8),
                     (byte)(47 + 28),
                     (byte)(45 + 22),
                     (byte)(74 + 9),
                     (byte)(4 + 49),
                     (byte)(37 + 43),
                     97,
                     (byte)(24 + 76),
                     (byte)(92 + 8),
                     (byte)(69 + 36),
                     (byte)(13 + 97),
                     (byte)(57 + 46)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣤईःࣻऋःई࣫ऄंࣶ", (byte)119, 70));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_026.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_530.B("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 66), NLoginCore_026.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.D("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡍࡱ\u086cࡤࡴ\u086cࡱࡔ\u086d\u086b\u085fӲ", (byte)77, 68) + var1 + NLoginCore_232.C("Ӗ", (byte)77, 67) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -7885619171130837800L;
      long var0 = c ^ -5969186228851583487L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(49 + 20),
               (byte)(50 + 33),
               (byte)(35 + 12),
               (byte)(60 + 7),
               (byte)(15 + 51),
               (byte)(15 + 52),
               (byte)(43 + 4),
               (byte)(64 + 16),
               (byte)(60 + 15),
               (byte)(12 + 55),
               (byte)(26 + 57),
               (byte)(18 + 35),
               (byte)(56 + 24),
               (byte)(28 + 69),
               (byte)(8 + 92),
               (byte)(51 + 49),
               (byte)(87 + 18),
               110,
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.E("ՀզզՏիՌՙհՋԹՉՂ", (byte)62, 69);
               ZKM_STR_B[1] = NLoginCore_173.A("ŌŔŬņŠŸŨŷŸŚŖŃ", (byte)62, 65);
               ZKM_STR_B[2] = NLoginCore_427.C("ӄӂңӊӥӡҪҼӠҰӬҷ", (byte)62, 67);
               ZKM_STR_B[3] = NLoginCore_004.B("őŵİŮĸŕĵńŪŰĵŃ", (byte)62, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.E("ե՜ՈԿԳՑՔ\u0557շԺՑՂ", (byte)62, 69);
               ZKM_STR_B[1] = NLoginCore_397.F("՝ըՎլնչթխդհԼՂ", (byte)62, 70);
               ZKM_STR_B[2] = NLoginCore_387.A("ŉŴŠŉŪńūŭĺŖŭūĶĸĴŋżŏřŖŚšŎŏ", (byte)62, 65);
               ZKM_STR_B[3] = NLoginCore_553.D("ҽҡӀӀҪҸҮҭҪӎҿӱӞӉӮӕӪӸӍӑӌӕӂӃ", (byte)62, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.E("ըԳՂՀճխհ\u0558լհհԼՋԸՍԺՠՓ՞քսՠՍՎ", (byte)62, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_183.C("ӅӒӈҳәӚӀӫӁҼӜӨҾӫӈӟӰӅӯӻӝӅӂӃ", (byte)62, 67);
         }
      }
   }
}
