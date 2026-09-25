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

public final class NLoginCore_250 extends NLoginCore_166 {
   private static int ab = Integer.reverse(-1);
   private static long ac = Long.reverse(3536807717277558182L);
   private static String[] ZKM_STR_B = new String[NLoginCore_250.ah];
   private static int ah = Integer.reverse(1073741824);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int af = Integer.reverse(1073741824);
   private static String[] ZKM_STR_A = new String[af];
   private static long n = Long.reverse(-2371914993832532570L);
   private static long o = Long.reverse(-1297036692682702848L);
   private static int d = (0 >>> 54 | 0 << -54) & -1;
   private static long m;

   private static String a(int var0, long var1) {
      var1 ^= 119L;
      var1 ^= -1795440633743762510L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     (byte)(10 + 59),
                     (byte)(70 + 13),
                     (byte)(7 + 40),
                     (byte)(38 + 29),
                     66,
                     (byte)(49 + 18),
                     (byte)(26 + 21),
                     (byte)(33 + 47),
                     (byte)(32 + 43),
                     (byte)(44 + 23),
                     (byte)(37 + 46),
                     (byte)(22 + 31),
                     (byte)(45 + 35),
                     97,
                     (byte)(48 + 52),
                     (byte)(51 + 49),
                     (byte)(25 + 80),
                     (byte)(62 + 48),
                     (byte)(3 + 100)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.E("\u0557դգԦզբ՝զձՠԭիկըիձԳ࣎ࣃ࣏࢜ࣉࣄࢮࣉ࣌", (byte)56, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_250.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 69), NLoginCore_250.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.C("իոշԺպնձպօմՁտփռտօՇ\u08e2ࣣࣗࢰࣝࣘࣂࣝ࣠՜", (byte)113, 67) + var1 + NLoginCore_110.C("Ղ", (byte)113, 67) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_250() {
      super(a(d, n ^ o), a(x & ab, ac));
   }

   private static void b() {
      m = 7324555942325037307L;
      long var0 = m ^ -1795440633743762510L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(36 + 33),
               (byte)(76 + 7),
               (byte)(32 + 15),
               (byte)(30 + 37),
               (byte)(65 + 1),
               (byte)(47 + 20),
               (byte)(35 + 12),
               (byte)(68 + 12),
               (byte)(3 + 72),
               (byte)(21 + 46),
               (byte)(56 + 27),
               53,
               (byte)(17 + 63),
               (byte)(76 + 21),
               (byte)(12 + 88),
               100,
               (byte)(5 + 100),
               (byte)(59 + 51),
               (byte)(16 + 87)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_324.A("ƎƧƨƟƣƮƪǔǋǑǒơ", (byte)109, 65);
               ZKM_STR_B[1] = NLoginCore_451.E("֣ծ֝վյ֛֧֓գ֤֢ձ", (byte)109, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.E("ձ\u0590՟ճ֖֚՟֓֓֟գգ֨րկ\u058cֈֲ֜մֵ֥ռս", (byte)109, 69);
               ZKM_STR_B[1] = NLoginCore_223.C("ձմյնշնՌ՛ըզոՏՓՖճ\u0557ցնկֈ՛ոՏՐ", (byte)109, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.B("ƬƯǕƪƟƎǁǄƒƸƨơ", (byte)109, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.B("ƮƬƲƟǐƿƶƯƩƖƤƩǗǝǉƬǛƫǞǑƮƯƬƭ", (byte)109, 66);
         }
      }
   }
}
