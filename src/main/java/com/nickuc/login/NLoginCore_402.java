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

class NLoginCore_402 {
   private final String W;
   private static long f = Long.reverse(3215621239612192462L);
   private static long l = Long.reverse(3215621239612192462L);
   private static long x = Long.reverse(3215621239612192462L);
   private static int z = Integer.reverse(268435456);
   private static int e = (8192 >>> 205 | 8192 << ~205 + 1) & -1;
   private static long g = Long.reverse(7782220156096217088L);
   private static int q = 5120 >>> 10 | 5120 << ~10 + 1;
   private final String V;
   private static int o = -1 >>> 227 | -1 << ~227 + 1;
   private static String[] ZKM_STR_A = new String[z];
   private final NLoginCore_020 a;
   private static long p = Long.reverse(4656773120370751182L);
   private static int k = Integer.reverse(-1073741824);
   private final int t;
   private static int a = 0 >>> 162 | 0 << ~162 + 1;
   private static long i = Long.reverse(3215621239612192462L);
   private static int h = (2048 >>> 42 | 2048 << -42) & -1;
   private static int b = Integer.reverse(-1);
   private static String[] ZKM_STR_B = new String[NLoginCore_402.aa];
   private static int u = Integer.reverse(1610612736);
   private static long m = Long.reverse(7782220156096217088L);
   private static long s = Long.reverse(7782220156096217088L);
   private static long r = Long.reverse(3215621239612192462L);
   private static int aa = (8192 >>> 106 | 8192 << ~106 + 1) & -1;
   private static long y = Long.reverse(7782220156096217088L);
   private static long d = Long.reverse(4656773120370751182L);
   private static long c;
   private static long v = Long.reverse(4656773120370751182L);
   private final String X;
   private final String T;
   private static long j = Long.reverse(7782220156096217088L);
   private final String U;
   private static int w = (234881024 >>> 121 | 234881024 << ~121 + 1) & -1;
   private static int n = Integer.reverse(536870912);

   private static String a(int var0, long var1) {
      var1 ^= 54L;
      var1 ^= 1166266988865545439L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(22 + 46),
                     (byte)(26 + 43),
                     (byte)(78 + 5),
                     (byte)(31 + 16),
                     67,
                     (byte)(40 + 26),
                     (byte)(28 + 39),
                     (byte)(10 + 37),
                     (byte)(64 + 16),
                     (byte)(73 + 2),
                     (byte)(41 + 26),
                     (byte)(57 + 26),
                     (byte)(3 + 50),
                     (byte)(35 + 45),
                     (byte)(89 + 8),
                     (byte)(55 + 45),
                     (byte)(44 + 56),
                     105,
                     (byte)(3 + 107),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѹѶѩѿ҂ѸѭѐљѥѶѧ҃ѿ", (byte)19, 66));
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
   NLoginCore_402(NLoginCore_020 var1, String var2, String var3, String var4, String var5, int var6, String var7) {
      this.a = var1;
      this.T = var2;
      this.U = var3;
      this.V = var4;
      this.W = var5;
      this.t = var6;
      this.X = var7;
   }

   @Generated
   @Override
   public String toString() {
      return a(a & b, d)
         + this.a
         + a(e, f ^ g)
         + this.T
         + a(h, i ^ j)
         + this.U
         + a(k, l ^ m)
         + this.V
         + a(n & o, p)
         + this.W
         + a(q, r ^ s)
         + this.t
         + a(u, v)
         + this.X
         + a(w, x ^ y);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_402.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_402.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.E("ՉՖՕԘ\u0558ՔՏ\u0558գՒԟ՝ա՚՝գԥࢺࢷࢪࣀࣃࢹࢮ\u0891࢚ࢦࢷࢨࣄࣀԿ", (byte)42, 69) + var1 + NLoginCore_553.E("Ԡ", (byte)42, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 8317184168625964340L;
      long var0 = c ^ 1166266988865545439L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               (byte)(30 + 39),
               83,
               (byte)(17 + 30),
               (byte)(23 + 44),
               (byte)(41 + 25),
               (byte)(12 + 55),
               (byte)(26 + 21),
               80,
               (byte)(25 + 50),
               (byte)(12 + 55),
               (byte)(35 + 48),
               (byte)(8 + 45),
               (byte)(25 + 55),
               (byte)(35 + 62),
               (byte)(45 + 55),
               (byte)(31 + 69),
               (byte)(28 + 77),
               (byte)(75 + 35),
               (byte)(55 + 48)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(29 + 54)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_138.E("լհբ֔կ\u0590օ\u058bՖկն֍֗ղչ֧֦֝շնջ֗չքծժ֛կրִ֔֟֒շոփֳջ֊մև֑ղׁ֖րֿ֮ցֳրֹּׂ\u0590֑", (byte)97, 69);
               ZKM_STR_B[1] = NLoginCore_141.D("ԇԒԝԫԕ\u0530Ձ\u0558ԪՓՍԭՈԝԱԬՙԞԾ՟ԜԾԫԬ", (byte)97, 68);
               ZKM_STR_B[2] = NLoginCore_092.F("ն֍\u0590գ֛ծևըֈրոե", (byte)97, 70);
               ZKM_STR_B[3] = NLoginCore_446.C("Ԩ\u0530ՀԟՉԣԟԵԓՙԫԠ", (byte)97, 67);
               ZKM_STR_B[4] = NLoginCore_201.D("ԣԝՏԨՎԟԑԫԋԖԔԘԪՆԸԛԷԽԲԼՑդԫԬ", (byte)97, 68);
               ZKM_STR_B[5] = NLoginCore_324.B("ŴźƻƾŰƑƮƯžƤǂƉ", (byte)97, 66);
               ZKM_STR_B[6] = NLoginCore_427.D("ՎՁԬԿԢՃՑԒԙ՚ԖԠ", (byte)97, 68);
               ZKM_STR_B[7] = NLoginCore_397.F("Ֆղքևչ\u0558հջ֔֗֞ե", (byte)97, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.E("լհբ֔կ\u0590օ\u058bՖկն֍֗ղչ֧֦֝շնջ֗չքծժ֛կրִ֔֟֒շոփֳջ֊մև֑տ֊ֹ֝֡սք׃ֿ֞\u05c8ֹ\u0590֑", (byte)97, 69);
               ZKM_STR_B[1] = NLoginCore_127.D("ԇԒԝԫԕ\u0530Ձ\u0558ԪՓՍԯԜԨԮԳ\u0557ԢԜ\u0530՞ՔԫԬ", (byte)97, 68);
               ZKM_STR_B[2] = NLoginCore_446.B("ųűƥƵŰƞŲƪǁƀƍżƙƁƝƼǁǅƕƉƌƗƔƕ", (byte)97, 66);
               ZKM_STR_B[3] = NLoginCore_223.C("ԙԲԾ\u0530ԪԶՍԫՖ՛ՔԤԙ՟ԴՙԠԟՄԝԟԾԫԬ", (byte)97, 67);
               ZKM_STR_B[4] = NLoginCore_076.A("ƌƆƸƑƷƈźƔŴſŽƥưƘƳǂƧƓǈƾƅƗƔƕ", (byte)97, 65);
               ZKM_STR_B[5] = NLoginCore_471.E("֏֔չՓՐ՛ղ\u0558\u0558ըղսյյխՠ֑՞֥գ֪ճհձ", (byte)97, 69);
               ZKM_STR_B[6] = NLoginCore_110.C("ՏՉԛՒԕԈՎՀՄԬԼՐՓ\u0557՚ԲԬՋ\u0557բ՛դԫԬ", (byte)97, 67);
               ZKM_STR_B[7] = NLoginCore_201.C("ԲՉԴԬՁԎԯՆՈԴՙԠ", (byte)97, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.A("ƇƷƒƌƓƩƟƊǃƭƵƟƲǀƵƘƇƢƈƺƸƗƔƕ", (byte)97, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_451.C("ՍԩԓԠԥԎ\u0557ԶՅԵԹՒ՚ԱԚՐԚՐՁՓԢՔԫԬ", (byte)97, 67);
         }
      }
   }

   @Generated
   public static NLoginCore_086 a() {
      return new NLoginCore_086();
   }
}
