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

public class NLoginCore_015 implements NLoginInterface_006 {
   public static final NLoginCore_015 a = new NLoginCore_015();
   private static String[] ZKM_STR_B = new String[NLoginCore_015.h];
   private static long b = Long.reverse(6161421232654485144L);
   private static int a = Integer.reverse(0);
   private static int f = Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << -31;
   private static int g = 16384 >>> 110 | 16384 << ~110 + 1;
   private static long d = Long.reverse(-4899916394579099648L);
   private static long c;
   private static String[] ZKM_STR_A = new String[g];
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(Integer.MIN_VALUE);

   @Override
   public <T> T c() {
      throw new UnsupportedOperationException();
   }

   static {
      b();
   }

   @Override
   public boolean i(String var1) {
      return (e != 0);
   }

   @Generated
   private NLoginCore_015() {
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_015.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.C("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ\u0530ՕշնծմծՃ", (byte)106, 67), NLoginCore_015.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.C("Ֆգբԥեա՜եհ՟ԬժծէժհԲࣈࣅ࣊ࣄࣄ࣑ࣉ࣍ࢯ࣒࣋Չ", (byte)106, 67) + var1 + NLoginCore_397.B("ƍ", (byte)106, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 61L;
      var1 ^= 5432086587237976437L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(38 + 31),
                     (byte)(50 + 33),
                     (byte)(2 + 45),
                     (byte)(63 + 4),
                     (byte)(3 + 63),
                     (byte)(6 + 61),
                     (byte)(14 + 33),
                     (byte)(44 + 36),
                     (byte)(34 + 41),
                     (byte)(34 + 33),
                     83,
                     (byte)(16 + 37),
                     (byte)(63 + 17),
                     (byte)(45 + 52),
                     100,
                     (byte)(90 + 10),
                     (byte)(50 + 55),
                     (byte)(97 + 13),
                     (byte)(44 + 59)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(23 + 60)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.F("\u0530ԽԼӿԿԻԶԿՊԹԆՄՈՁՄՊԌࢢ࢟ࢤ࢞࢞ࢫࢣࢧࢉࢬࢥ", (byte)17, 70));
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
   public void k(String var1) {
      System.out.println(NLoginCore_065.d(var1, (f != 0)));
   }

   private static void b() {
      c = 1828980241834672554L;
      long var0 = c ^ 5432086587237976437L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(57 + 12),
               (byte)(73 + 10),
               (byte)(28 + 19),
               (byte)(31 + 36),
               (byte)(18 + 48),
               (byte)(35 + 32),
               (byte)(23 + 24),
               (byte)(68 + 12),
               75,
               (byte)(10 + 57),
               (byte)(65 + 18),
               (byte)(6 + 47),
               (byte)(6 + 74),
               (byte)(6 + 91),
               (byte)(73 + 27),
               (byte)(34 + 66),
               (byte)(79 + 26),
               110,
               (byte)(18 + 85)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.A("ũŒŉōŭĲŐŷŕŅŎŃ", (byte)62, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.E("ՐաաբթՀԹնծՐձյՔըլւՏՃջղնֆՍՎ", (byte)62, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.F("ԯԯՒԶոՒշՆծղոՙխճթՙւ\u0557ակՐ՟ևղՇ\u0558շՆշւՌփ", (byte)62, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.D("ҹӀҼӃӅӧҾӞӢӬӞұӓҳҲӍӭӬӘӫӉӇӘӗӞӺӯӳӲӔӯӹ", (byte)62, 68);
         }
      }
   }

   @Override
   public void l(String var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public String getName() {
      return a(a, b ^ d);
   }
}
