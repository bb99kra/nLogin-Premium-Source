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

public enum NLoginCore_282 {
   b(NLoginCore_315.x),
   c(NLoginCore_315.y),
   d(NLoginCore_315.z);

   private final NLoginInterface_034 a;
   private static String[] a = new String[NLoginCore_282.e];
   private static String[] b = new String[NLoginCore_282.f];
   private static long c;
   private static int a = (3145728 >>> 116 | 3145728 << ~116 + 1) & -1;
   private static int b = (0 >>> 136 | 0 << ~136 + 1) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (131072 >>> 208 | 131072 << ~208 + 1) & -1;
   private static int e = Integer.reverse(-1073741824);
   private static int f = (100663296 >>> 89 | 100663296 << -89) & -1;
   private static int g = Integer.reverse(0);
   private static long h = Long.reverse(-8085016042473780364L);
   private static int i = (0 >>> 175 | 0 << -175) & -1;
   private static int j = (524288 >>> 243 | 524288 << ~243 + 1) & -1;
   private static int k = Integer.reverse(-1);
   private static long l = Long.reverse(-8085016042473780364L);
   private static int m = 4 >>> 34 | 4 << -34;
   private static int n = Integer.reverse(1073741824);
   private static int o = Integer.reverse(-1);
   private static long p = Long.reverse(-8085016042473780364L);
   private static int q = Integer.reverse(1073741824);

   private static void b() {
      c = 3373231887190471586L;
      long var0 = c ^ -2799056446113524558L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(26 + 43),
               83,
               (byte)(5 + 42),
               (byte)(14 + 53),
               66,
               (byte)(47 + 20),
               (byte)(38 + 9),
               (byte)(74 + 6),
               (byte)(73 + 2),
               (byte)(36 + 31),
               (byte)(9 + 74),
               (byte)(25 + 28),
               (byte)(61 + 19),
               (byte)(13 + 84),
               (byte)(91 + 9),
               (byte)(16 + 84),
               (byte)(86 + 19),
               (byte)(81 + 29),
               (byte)(70 + 33)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_027.A("æüíåăïĐáÕä×á", (byte)13, 65);
               b[1] = NLoginCore_446.A("êûÎĈéÓæõâě×á", (byte)13, 65);
               b[2] = NLoginCore_471.E("ԞӽԻԡӽԸԣՆԤԓԤԑ", (byte)13, 69);
               break;
            case 1:
               b[0] = NLoginCore_138.A("ÐĒăĊĈĐÑÑÔòðá", (byte)13, 65);
               b[1] = NLoginCore_138.B("ÌÏëčèçèāċÒĎá", (byte)13, 66);
               b[2] = NLoginCore_471.A("ïÐđçČêéĐØúĆá", (byte)13, 65);
               break;
            case 2:
               b[0] = NLoginCore_223.F("ӴԳԥՆԽԞԓԘԤԊԙԥԝՀՌՃՈԞԢԍԢՕԜԝ", (byte)13, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.C("АщьБЙЭзѕШњѝФ", (byte)13, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 83L;
      var1 ^= -2799056446113524558L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     69,
                     (byte)(10 + 73),
                     (byte)(11 + 36),
                     (byte)(27 + 40),
                     (byte)(48 + 18),
                     (byte)(54 + 13),
                     (byte)(16 + 31),
                     (byte)(65 + 15),
                     (byte)(70 + 5),
                     (byte)(50 + 17),
                     (byte)(36 + 47),
                     (byte)(49 + 4),
                     (byte)(68 + 12),
                     (byte)(2 + 95),
                     (byte)(2 + 98),
                     (byte)(59 + 41),
                     (byte)(72 + 33),
                     110,
                     (byte)(98 + 5)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢯࢣࢣࢆࢲࢀࢨࢩࢱࢬࢪࢮࢼࢴ", (byte)27, 69));
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

   @Generated
   private NLoginCore_282(NLoginInterface_034 var3) {
      this.a = var3;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_282.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.A("ƉƫƭƍƱǐǈǞǊƙǗǍǛǕƞǃǥǤǜǢǜƱ", (byte)113, 65), NLoginCore_282.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_232.D("իոշԺպնձպօմՁտփռտօՇ࣠ࣔࣔࢷࣣࢱࣙࣚ\u08e2࣭ࣝࣛࣟࣥա", (byte)113, 68) + var1 + NLoginCore_183.E("է", (byte)113, 69) + var2.toString(), var4
         );
      }
   }
}
