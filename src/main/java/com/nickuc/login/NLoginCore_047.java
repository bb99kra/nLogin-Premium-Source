package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_047 {
   private static int c = 268435456 >>> 92 | 268435456 << -92;
   private static int b = 0 >>> 210 | 0 << ~210 + 1;
   private static int l = Integer.reverse(1073741824);
   private static int i = -1 >>> 15 | -1 << ~15 + 1;
   private static int k = (2 >>> 224 | 2 << ~224 + 1) & -1;
   private static String[] ZKM_STR_A = new String[k];
   private static int e = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   @Nullable
   private final UUID i;
   private static String[] ZKM_STR_B = new String[l];
   private static long c;
   private static long f = Long.reverse(8682684165395296526L);
   private static int h = 4 >>> 162 | 4 << -162;
   private static long j = Long.reverse(-5440604266038578930L);
   private static int a = 256 >>> 168 | 256 << -168;
   private static long g = Long.reverse(-3746994889972252672L);

   @Generated
   public NLoginCore_047(@Nullable UUID var1) {
      this.i = var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_047.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.F("ӧԉԋӫԏԮԦԼԨӷԵԫԹԳӼԡՃՂԺՀԺԏ", (byte)3, 70), NLoginCore_047.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.A("èõô·÷óî÷Ăñ¾üĀùüĂÄњзщдєьѥѦњљѝќъєÞ", (byte)3, 65) + var1 + NLoginCore_183.F("ӹ", (byte)3, 70) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 51L;
      var1 ^= -9216615509431271512L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(5 + 63),
                     (byte)(12 + 57),
                     (byte)(71 + 12),
                     (byte)(27 + 20),
                     (byte)(44 + 23),
                     (byte)(31 + 35),
                     67,
                     (byte)(23 + 24),
                     (byte)(6 + 74),
                     (byte)(49 + 26),
                     (byte)(26 + 41),
                     (byte)(33 + 50),
                     (byte)(48 + 5),
                     (byte)(9 + 71),
                     (byte)(39 + 58),
                     (byte)(33 + 67),
                     (byte)(28 + 72),
                     (byte)(84 + 21),
                     110,
                     (byte)(50 + 53)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.E("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢭࢊ࢜ࢇࢧ࢟ࢸࢹࢭࢬࢰࢯ࢝ࢧ", (byte)28, 69));
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

   @Generated
   @Override
   public String toString() {
      return a(e, f ^ g) + this.b() + a(h & i, j);
   }

   public boolean a(NLoginInterface_011<?> var1) {
      return ((this.i != null && NLoginCore_371.a(var1, this.i) != 0) ? c : d);
   }

   public boolean a(@Nullable NLoginCore_259 var1) {
      return ((this.i != null && NLoginCore_371.a(var1, this.i) != 0) ? a : b);
   }

   static {
      b();
   }

   private static void b() {
      c = 8110370481538399774L;
      long var0 = c ^ -9216615509431271512L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(51 + 17),
               (byte)(23 + 46),
               (byte)(73 + 10),
               (byte)(33 + 14),
               (byte)(60 + 7),
               (byte)(11 + 55),
               (byte)(19 + 48),
               47,
               (byte)(26 + 54),
               (byte)(41 + 34),
               (byte)(18 + 49),
               (byte)(18 + 65),
               (byte)(7 + 46),
               (byte)(64 + 16),
               (byte)(2 + 95),
               (byte)(20 + 80),
               100,
               (byte)(100 + 5),
               (byte)(20 + 90),
               (byte)(90 + 13)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_521.E("ԞԙՃԞԜՐըՙթ՝թծԧԨէՂ՛ՏԼՄգՋԯՆիՒ՜ՒԸրՓՓցՂոԽԸԾտգՙՓնՑ", (byte)45, 69);
               ZKM_STR_B[1] = NLoginCore_521.D("ҶҴ҆҆ѳ҈ҷҦғҚ҇҄", (byte)45, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_446.C("ѱѬҖѱѯңһҬҼҰҼӁѺѻҺҕҮҢҏҗҶҞ҂ҙҾҥүҥҋӓҦҦҵӅґӏҦӘҒҺҫӍҚҤ", (byte)45, 67);
               ZKM_STR_B[1] = NLoginCore_027.E("՞ԚԤՐԝՓըԡՃՉԴԱ", (byte)45, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_183.F("՝ՕԜ\u0557ԿԢէԤը՟ՀԱ", (byte)45, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_241.E("ՕՂԱԵԲԱԹԳԨՠլիԹԯՉԼՃՐթՆՑյԼԽ", (byte)45, 69);
         }
      }
   }

   @Nullable
   @Generated
   public UUID b() {
      return this.i;
   }
}
