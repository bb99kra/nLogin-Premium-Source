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

public class NLoginCore_501 {
   private static int d = Integer.reverse(0);
   private static int h = Integer.reverse(-1);
   private final boolean at;
   private static int c = (131072 >>> 241 | 131072 << -241) & -1;
   private static int j = Integer.reverse(-1);
   private static int l = (268435456 >>> 92 | 268435456 << -92) & -1;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_A = new String[k];
   private int ab = j;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_B = new String[l];
   private static int b = (16777216 >>> 248 | 16777216 << ~248 + 1) & -1;
   private final boolean ar;
   private static long c;
   private static int g = Integer.reverse(0);
   private static long i = Long.reverse(-856311664099574001L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int f = -1 >>> 208 | -1 << -208;
   private final NLoginType_008 s;
   private final boolean as;

   public synchronized NLoginCore_211 a() {
      return this.b().a();
   }

   @Nullable
   public synchronized NLoginInterface_012 b(NLoginCore_277 var1, NLoginCore_509 var2) {
      if (this.ab + a >= NLoginCore_211.size()) {
         return null;
      } else {
         int var3 = this.ab = this.ab + b;
         NLoginInterface_012 var4 = NLoginCore_211.a(var3, this.s.a().p()).a();
         if (var4 instanceof NLoginInterface_035 && !this.at) {
            return this.b(var1, var2);
         } else if (this.ar && !(var4 instanceof NLoginInterface_044)) {
            return this.b(var1, var2);
         } else {
            int var5 = var4 instanceof NLoginInterface_039 && ((NLoginInterface_039)var4).c(this.s) ? c : d;
            if ((!this.as || var5 != 0) && (this.as || var5 == 0)) {
               return !var4.a(this.s, var1, var2) ? this.b(var1, var2) : var4;
            } else {
               return this.b(var1, var2);
            }
         }
      }
   }

   private static void b() {
      c = -1081908274134796261L;
      long var0 = c ^ 5181515925203540853L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(13 + 56),
               (byte)(12 + 71),
               (byte)(28 + 19),
               (byte)(41 + 26),
               (byte)(16 + 50),
               (byte)(35 + 32),
               (byte)(17 + 30),
               (byte)(35 + 45),
               (byte)(43 + 32),
               (byte)(12 + 55),
               (byte)(11 + 72),
               (byte)(26 + 27),
               (byte)(3 + 77),
               (byte)(9 + 88),
               (byte)(76 + 24),
               100,
               (byte)(81 + 24),
               (byte)(59 + 51),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_575.D("ӈӌӟӰӱӮԀӠӲӥԃӞӜӗӗӵӬӺԎӬӟӰӼӒԇӳӮԑԂԊԔӦ", (byte)69, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.D("ӈӌӟӰӱӮԀӠӲӥԃӞӜӗӗӵӬӺԎӬӟӮӾԌԌԖӑӗԁӴӒӶ", (byte)69, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.C("ӲӏӨӖӋӗӻԄӅӞӦӺԄԊӃӤӉӣԈӣӬӚӗӘ", (byte)69, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.F("գԵդըՊ՚Ջ՚իՋԻՉ", (byte)69, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 52L;
      var1 ^= 5181515925203540853L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(35 + 34),
                     83,
                     (byte)(6 + 41),
                     (byte)(6 + 61),
                     (byte)(45 + 21),
                     (byte)(45 + 22),
                     (byte)(6 + 41),
                     (byte)(10 + 70),
                     (byte)(47 + 28),
                     (byte)(13 + 54),
                     (byte)(79 + 4),
                     (byte)(43 + 10),
                     (byte)(35 + 45),
                     (byte)(25 + 72),
                     (byte)(18 + 82),
                     (byte)(87 + 13),
                     (byte)(50 + 55),
                     (byte)(22 + 88),
                     (byte)(22 + 81)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.F("ԟԬԫӮԮԪԥԮԹԨӵԳԷ\u0530ԳԹӻࢇࢊࡷ\u0897ࡺ\u0893࢈࢚\u0895࢈", (byte)0, 70));
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

   public NLoginCore_501 a() {
      NLoginCore_501 var1 = new NLoginCore_501(this.s, this.ar, this.as, (e != 0));
      var1.ab = this.ab;
      return var1;
   }

   @Generated
   public NLoginCore_501(NLoginType_008 var1, boolean var2, boolean var3, boolean var4) {
      this.s = var1;
      this.ar = var2;
      this.as = var3;
      this.at = var4;
   }

   static {
      b();
   }

   public synchronized NLoginInterface_012 b() {
      if (this.ab == f) {
         throw new IllegalStateException(a(g & h, i));
      } else {
         return NLoginCore_211.a(this.ab, this.s.a().p()).a();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_501.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.F("ՎհղՒն֕֍֣֏՞֚֜֒֠գֈ֪֧֩֡֡ն", (byte)106, 70), NLoginCore_501.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.A("ƶǃǂƅǅǁƼǅǐƿƌǊǎǇǊǐƒԞԡԎԮԑԪԟԱԬԟƨ", (byte)106, 65) + var1 + NLoginCore_521.D("ԭ", (byte)106, 68) + var2.toString(), var4
         );
      }
   }
}
