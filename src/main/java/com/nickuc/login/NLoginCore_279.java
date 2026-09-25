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

public class NLoginCore_279 implements NLoginInterface_010, NLoginInterface_035 {
   private static int n = Integer.reverse(-1);
   private static int q = Integer.reverse(1073741824);
   private static int j = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NLoginCore_279.p];
   private static int f = 0 >>> 90 | 0 << -90;
   private static long c;
   private static int i = (0 >>> 9 | 0 << -9) & -1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_211 ab;
   private static long k = Long.reverse(-7137549614140544533L);
   private static int p = 268435456 >>> 91 | 268435456 << ~91 + 1;
   private static int d = (0 >>> 210 | 0 << ~210 + 1) & -1;
   private static int c = (0 >>> 227 | 0 << -227) & -1;
   private static int m = (4096 >>> 108 | 4096 << -108) & -1;
   private static int a = Integer.reverse(-1879048192);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(1073741824);
   private static long o = Long.reverse(-5119936981078562325L);
   private static int g = (4096 >>> 140 | 4096 << ~140 + 1) & -1;
   private static long l = Long.reverse(2594073385365405696L);
   private static String[] ZKM_STR_B = new String[q];

   @Generated
   public NLoginCore_279(NLoginCore_211 var1) {
      this.ab = var1;
   }

   static {
      b();
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ab;
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= 7163277145169251723L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(57 + 12),
                     (byte)(81 + 2),
                     (byte)(41 + 6),
                     (byte)(27 + 40),
                     (byte)(5 + 61),
                     (byte)(24 + 43),
                     (byte)(45 + 2),
                     (byte)(7 + 73),
                     75,
                     (byte)(9 + 58),
                     (byte)(17 + 66),
                     (byte)(13 + 40),
                     (byte)(28 + 52),
                     (byte)(14 + 83),
                     100,
                     (byte)(31 + 69),
                     (byte)(48 + 57),
                     (byte)(83 + 27),
                     (byte)(50 + 53)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.E("ԪԷԶӹԹԵ\u0530ԹՄԳԀԾՂԻԾՄԆ\u0890ࢊ\u0890࢟\u0897ࡱࡲ࢚", (byte)11, 69));
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

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.m, var1x -> {
         if (var1x.contains(a(j, k ^ l))) {
            var4.c(var1x, a(m & n, o));
         } else {
            var4.a(var1x);
         }
      });
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.b;
      var10001[g] = NLoginCore_445.c;
      return GUIButtonContainer.a(var2, var10001);
   }

   private static void b() {
      c = -2912502550363484359L;
      long var0 = c ^ 7163277145169251723L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(26 + 42),
               (byte)(8 + 61),
               (byte)(2 + 81),
               (byte)(41 + 6),
               (byte)(46 + 21),
               (byte)(18 + 48),
               (byte)(5 + 62),
               (byte)(26 + 21),
               (byte)(51 + 29),
               (byte)(54 + 21),
               (byte)(22 + 45),
               (byte)(23 + 60),
               53,
               80,
               (byte)(29 + 68),
               (byte)(9 + 91),
               (byte)(93 + 7),
               (byte)(11 + 94),
               (byte)(5 + 105),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.D("ҠңӅӂҥӅңҎӓӆӗҔәӛҖҗҮӌҿӡһҺҧҨ", (byte)53, 68);
               ZKM_STR_B[1] = NLoginCore_173.D("ҊҠҝ҂ңңӓҔҰңҍҤҹҦҪӅүӚӖӋҳҝӑҳқҲұӓӛҹӠөӈӠҾӮӏӈҿӁҴӃӠӔӆөӓӕӱӾӉӨӟҾӏӑӚӣӀӿӇӽԄԈӿӘӢԆԇӉӼӟԐԄӯӜ", (byte)53, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_433.E("ԽՀբ՟ՂբՀԫհգղնՄՄժըժՍԶ՝՚խՄՅ", (byte)53, 69);
               ZKM_STR_B[1] = NLoginCore_384.B("ğĵĲėĸĸŨĩŅĸĢĹŎĻĿŚńůūŠňĲŦňİŇņŨŰŎŵžŝŵœƃŤŝŔŖŉŘŵũśžŨŪƆƓŞŽŴœŤŦůŸŕƔŜƒƙƝƢƂŻşƛŞťƘƨŹƞű", (byte)53, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_471.D("҃ҶҮҞҦҾҮӀӍӐӂӀҭҗәӕӇҜҰӐәӠҧҨ", (byte)53, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.E("ՁՌԼԫ՛ՅԯՊԩԥժճԭԲԪէժՌԹՏ\u0558խՄՅ", (byte)53, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_279.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.A("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 65), NLoginCore_279.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.F("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢭࢧࢭࢼࢴࢎ\u088fࢷԷ", (byte)40, 70) + var1 + NLoginCore_091.D("ѧ", (byte)40, 68) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_188.C[var5.ordinal()]) {
         case 1:
         case 2:
            this.a(var3).i(((var5 == NLoginCore_445.b ? h : i) != 0));
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return ((var1.a() != 0).n() == a && var1.a().q() ? b : c);
   }
}
