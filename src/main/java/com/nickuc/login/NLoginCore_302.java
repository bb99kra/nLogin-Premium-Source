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

public class NLoginCore_302 extends NLoginCore_410 {
   private static long o;
   private static String[] f = new String[NLoginCore_302.af];
   private final String L;
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static long q = Long.reverse(1152921504606846976L);
   private static String[] e = new String[z];
   private static long p = Long.reverse(-5301499054767291160L);
   private final String M;
   private static int e = 0 >>> 128 | 0 << ~128 + 1;

   public NLoginCore_302(NLoginType_008 var1, NLoginCore_479 var2, String var3, String var4, String var5, String var6) {
      super(var1, var2, var3, var4);
      this.L = var5;
      this.M = var6;
   }

   private static void b() {
      o = 1667284027609101933L;
      long var0 = o ^ 5605225946695381735L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(45 + 24),
               (byte)(51 + 32),
               (byte)(5 + 42),
               (byte)(57 + 10),
               (byte)(44 + 22),
               (byte)(61 + 6),
               (byte)(44 + 3),
               (byte)(60 + 20),
               (byte)(36 + 39),
               (byte)(14 + 53),
               83,
               (byte)(47 + 6),
               (byte)(69 + 11),
               (byte)(53 + 44),
               100,
               (byte)(51 + 49),
               (byte)(57 + 48),
               (byte)(43 + 67),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_453.D("ԊԮՅՈԚԾԮԵՁՍԓԝ", (byte)96, 68);
               break;
            case 1:
               f[0] = NLoginCore_387.B("ƲƬźƭƉƳƴƜƝƼƸƇ", (byte)96, 66);
               break;
            case 2:
               f[0] = NLoginCore_241.A("ƇƹƆƍƶƔƍƚƫƬƁƞƟƑƮƓƶƠƸƆƘƕƒƓ", (byte)96, 65);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_076.F("մ֍֖գն՚միշիչիկմփ՞ւջ֟ն՛ղկհ", (byte)96, 70);
         }
      }
   }

   @Override
   protected void a(NLoginCore_219 var1, String var2, String var3) {
      String var4 = var1.b(var3 + this.L);
      String var5 = null;
      if (this.M != null) {
         var5 = var1.b(var3 + this.M);
         if (a(e, p ^ q).equals(var5)) {
            var5 = null;
         }
      }

      this.a(var2, var4, var5, null);
      this.l++;
   }

   private static String a(int var0, long var1) {
      var1 ^= 8L;
      var1 ^= 5605225946695381735L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(68 + 1),
                     83,
                     (byte)(17 + 30),
                     (byte)(12 + 55),
                     (byte)(28 + 38),
                     67,
                     (byte)(14 + 33),
                     (byte)(48 + 32),
                     (byte)(12 + 63),
                     (byte)(51 + 16),
                     (byte)(64 + 19),
                     (byte)(19 + 34),
                     (byte)(62 + 18),
                     (byte)(21 + 76),
                     (byte)(88 + 12),
                     (byte)(39 + 61),
                     (byte)(65 + 40),
                     (byte)(42 + 68),
                     (byte)(27 + 76)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.A("òÿþÁāýøāČûÈĆĊăĆČÎрљќѢѡѝсѢљѰѬп", (byte)8, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_302.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.E("Ԏ\u0530ԲԒԶՕՍգՏԞ՜Ւՠ՚ԣՈժթաէաԶ", (byte)42, 69), NLoginCore_302.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.A("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒ҄ҝҠҦҥҡ҅ҦҝҴҰ҃Ī", (byte)42, 65) + var1 + NLoginCore_384.B("č", (byte)42, 66) + var2.toString(), var4
         );
      }
   }
}
