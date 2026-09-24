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

public class NLoginCore_450 extends NLoginCore_302 {
   private static int az = (1 >>> 94 | 1 << ~94 + 1) & -1;
   private static int m = (0 >>> 74 | 0 << -74) & -1;
   private static int ai = (536870912 >>> 125 | 536870912 << -125) & -1;
   private static long ax = Long.reverse(-6440258856993471698L);
   private static long v = Long.reverse(-6440258856993471698L);
   private static int ar = ('耀' >>> 142 | 32768 << -142) & -1;
   private static String[] g = new String[az];
   private static long r;
   private static long at = Long.reverse(-576460752303423488L);
   private static long as = Long.reverse(6818338445985268526L);
   private static String[] h = new String[NLoginCore_450.bc];
   private static int bc = Integer.reverse(536870912);
   private static long ap = Long.reverse(-6440258856993471698L);
   private static int aw = 1610612736 >>> 93 | 1610612736 << ~93 + 1;

   public NLoginCore_450(NLoginType_008 var1) {
      super(var1, NLoginCore_479.F, a(m, v), a(ai, ap), a(ar, as ^ at), a(aw, ax));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_450.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.A("ÝÿāáąĤĜĲĞíīġįĩòėĹĸİĶİą", (byte)27, 65), NLoginCore_450.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.F("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࢥ࢝࢜ࢳࢬࢳ\u0897ࢳࢱࢶࢫࢭࢺ࢞࢞Ա", (byte)27, 70) + var1 + NLoginCore_530.F("ԑ", (byte)27, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      r = 8413545304046565754L;
      long var0 = r ^ -1935704956077959593L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               (byte)(32 + 37),
               (byte)(49 + 34),
               (byte)(15 + 32),
               (byte)(41 + 26),
               (byte)(38 + 28),
               67,
               47,
               (byte)(49 + 31),
               (byte)(30 + 45),
               (byte)(34 + 33),
               (byte)(40 + 43),
               (byte)(26 + 27),
               (byte)(77 + 3),
               (byte)(67 + 30),
               (byte)(66 + 34),
               (byte)(14 + 86),
               (byte)(76 + 29),
               (byte)(78 + 32),
               (byte)(57 + 46)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
               h[0] = NLoginCore_575.A("ŻǃƢƐƂƑƖƒǆƕƼƉǌǄƪƤƬǀǔǋǋǅƜƝ", (byte)101, 65);
               h[1] = NLoginCore_076.B("ƵƼƕƚƗƼƃƙƧƣƔƑ", (byte)101, 66);
               h[2] = NLoginCore_397.E("զ\u0558նՙմ՝ջծւ֢֙թ", (byte)101, 69);
               h[3] = NLoginCore_110.E("և֕\u0557\u0590ձշ\u058b֎֕՛֖թ", (byte)101, 69);
               break;
            case 1:
               h[0] = NLoginCore_076.F("Փ֛պը՚թծժ֞խ֒՟քռրջճքփպ֍֝մյ", (byte)101, 70);
               h[1] = NLoginCore_173.A("ƾƖƣƻƖƁƴŻơƪǀƋƀǅƤƪǄƫǔǍƓǕƜƝ", (byte)101, 65);
               h[2] = NLoginCore_384.D("՜ՖՇՙԻ՟ԳԣբՀԠԹՆԨդՔՕԧՈԯՙԺԷԸ", (byte)101, 68);
               h[3] = NLoginCore_091.B("ƱŻƟƁưǆǆǊƿǁƾƑ", (byte)101, 66);
               break;
            case 2:
               h[0] = NLoginCore_397.B("ƀưƬŻƛƘǄƱƷƥƞƶƸǊƞƲƊƛƴƲƬǄƢǒǅƷǊƥǑƳƙƾ", (byte)101, 66);
            case 3:
            default:
               break;
            case 4:
               h[0] = NLoginCore_173.C("ՉԐԳԫԞԲԱՒԟԱ՟ԼՇՀՙ՚ԸԪՃկԪԻաղհԵՌԸԹիմզ", (byte)101, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 31L;
      var1 ^= -1935704956077959593L;
      if (g[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(57 + 12),
                     (byte)(2 + 81),
                     (byte)(20 + 27),
                     (byte)(63 + 4),
                     (byte)(39 + 27),
                     (byte)(31 + 36),
                     (byte)(14 + 33),
                     (byte)(56 + 24),
                     (byte)(71 + 4),
                     (byte)(2 + 65),
                     83,
                     (byte)(30 + 23),
                     (byte)(25 + 55),
                     (byte)(84 + 13),
                     (byte)(96 + 4),
                     (byte)(41 + 59),
                     (byte)(58 + 47),
                     (byte)(36 + 74),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(14 + 69)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.E("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬࢻࢳࢲࣉࣂࣉࢭࣉࣇ࣌ࣁࣃ࣐ࢴࢴ", (byte)49, 69));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         g[var0] = new String(var3.doFinal(Base64.getDecoder().decode(h[var0])), StandardCharsets.UTF_8);
      }

      return g[var0];
   }

   static {
      b();
   }
}
