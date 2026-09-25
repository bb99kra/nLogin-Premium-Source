package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_204 {
   b(a(NLoginCore_204.k & NLoginCore_204.l, NLoginCore_204.m)),
   c(a(NLoginCore_204.r, NLoginCore_204.s ^ NLoginCore_204.t)),
   d(a(NLoginCore_204.x, NLoginCore_204.y ^ NLoginCore_204.z));

   private final String bb;
   private static String[] ZKM_STR_A = new String[NLoginCore_204.f];
   private static String[] ZKM_STR_B = new String[NLoginCore_204.g];
   private static long c;
   private static int a = (0 >>> 232 | 0 << -232) & -1;
   private static int b = Integer.reverse(-1073741824);
   private static int c = Integer.reverse(0);
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.MIN_VALUE >>> 254 | Integer.MIN_VALUE << -254;
   private static int f = 96 >>> 132 | 96 << -132;
   private static int g = 25165824 >>> 214 | 25165824 << -214;
   private static int h = Integer.reverse(0);
   private static long i = Long.reverse(-5421394454540546411L);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int l = (-1 >>> 243 | -1 << -243) & -1;
   private static long m = Long.reverse(-5421394454540546411L);
   private static int n = 8 >>> 2 | 8 << ~2 + 1;
   private static int o = Integer.reverse(-1);
   private static long p = Long.reverse(-5421394454540546411L);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int r = 98304 >>> 239 | 98304 << -239;
   private static long s = Long.reverse(-3403781821478564203L);
   private static long t = Long.reverse(7205759403792793600L);
   private static int u = (16 >>> 34 | 16 << ~34 + 1) & -1;
   private static long v = Long.reverse(-5421394454540546411L);
   private static int w = Integer.reverse(1073741824);
   private static int x = Integer.reverse(-1610612736);
   private static long y = Long.reverse(-3403781821478564203L);
   private static long z = Long.reverse(7205759403792793600L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_204.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝\u0557ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_204.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.E("ՆՓՒԕՕՑՌՕՠՏԜ՚՞\u0557՚ՠԢࢧࢧࢭ\u0892ࢮࢴࢹࢯ\u0897ࣄࢰࣈԺ", (byte)39, 69) + var1 + NLoginCore_471.B("ć", (byte)39, 66) + var2.toString(), var4
         );
      }
   }

   @Nullable
   public static NLoginCore_204 a(int var0) {
      NLoginCore_204[] var1 = values();
      return var1.length > var0 ? var1[var0] : null;
   }

   private static void b() {
      c = -6237085648517676277L;
      long var0 = c ^ -6659706440532852428L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(65 + 4),
               (byte)(29 + 54),
               (byte)(16 + 31),
               (byte)(13 + 54),
               (byte)(56 + 10),
               67,
               (byte)(39 + 8),
               (byte)(70 + 10),
               (byte)(49 + 26),
               (byte)(56 + 11),
               (byte)(28 + 55),
               (byte)(36 + 17),
               (byte)(35 + 45),
               97,
               (byte)(98 + 2),
               (byte)(15 + 85),
               (byte)(6 + 99),
               (byte)(19 + 91),
               (byte)(29 + 74)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.A("ĵĿōŞţıłĺĢıŚĭ", (byte)51, 65);
               ZKM_STR_B[1] = NLoginCore_183.E("ՁդՒզԾըՁՐԭԭԺԷ", (byte)51, 69);
               ZKM_STR_B[2] = NLoginCore_384.C("҃ѾҵҝҚҽҽҞҥқҙҖ", (byte)51, 67);
               ZKM_STR_B[3] = NLoginCore_183.B("ĜĕŕłŗŞŕŤŜŦŢĭ", (byte)51, 66);
               ZKM_STR_B[4] = NLoginCore_127.B("īĽĿŁęŌţŢŒŜŢĭ", (byte)51, 66);
               ZKM_STR_B[5] = NLoginCore_173.F("ՠԴՕՃԥՕԺԨԦԭըԷ", (byte)51, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.D("үұҧғ҃ӂңһӀҺӎҺӓҒҍӌҔұӔӈҖӊҡҢ", (byte)51, 68);
               ZKM_STR_B[1] = NLoginCore_004.C("ҟҡҶҟӅҖҭӀӎҡҝӊӂҨӍӐӃҠҏҦҔӊҡҢ", (byte)51, 67);
               ZKM_STR_B[2] = NLoginCore_553.D("ҜҠ҂҄ҝҬӎҹҺҪӋҨҰӓҦӈӗҰӒҦұҴҡҢ", (byte)51, 68);
               ZKM_STR_B[3] = NLoginCore_110.E("բԢ՟ՖՊԤՏ՛ըդ՛ՄԦեյդՍՎդը՛իՂՃ", (byte)51, 69);
               ZKM_STR_B[4] = NLoginCore_324.D("ѽҽғӃҋңӋҼҮҜһҖ", (byte)51, 68);
               ZKM_STR_B[5] = NLoginCore_127.D("җғҥҪҿҜӋҀҰҌҝҖ", (byte)51, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.F("ԥԴԹիխԨ՝զզՐՍՋՐկՠ\u0558աՖ\u0530խհՕՂՃ", (byte)51, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.A("įĬōŊŘĶŢļŧŧŒĭ", (byte)51, 65);
         }
      }
   }

   @Generated
   private NLoginCore_204(String var3) {
      this.bb = var3;
   }

   @Nullable
   public static NLoginCore_204 a(String var0) {
      NLoginCore_204[] var1 = values();
      int var2 = var1.length;

      for (int var3 = a; var3 < var2; var3++) {
         NLoginCore_204 var4 = var1[var3];
         if (var4.bb.equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String getName() {
      return this.bb;
   }

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= -6659706440532852428L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(67 + 1),
                     (byte)(27 + 42),
                     (byte)(73 + 10),
                     47,
                     (byte)(17 + 50),
                     (byte)(50 + 16),
                     (byte)(12 + 55),
                     (byte)(11 + 36),
                     (byte)(64 + 16),
                     (byte)(63 + 12),
                     (byte)(56 + 11),
                     (byte)(42 + 41),
                     (byte)(39 + 14),
                     (byte)(72 + 8),
                     (byte)(57 + 40),
                     (byte)(3 + 97),
                     (byte)(24 + 76),
                     (byte)(72 + 33),
                     (byte)(65 + 45),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.F("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢙࢙࢟ࢄࢠࢦࢫࢡࢉࢶࢢࢺ", (byte)25, 70));
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

   static {
      b();
   }
}
