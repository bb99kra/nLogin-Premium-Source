package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;

public class NLoginCore_467 extends NLoginCore_490 {
   private static int e = (0 >>> 21 | 0 << -21) & -1;
   private static int ai = 4 >>> 226 | 4 << ~226 + 1;
   private static String[] ZKM_STR_A = new String[NLoginCore_467.ah];
   private static long i;
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static long q = Long.reverse(-6629298651489370112L);
   private static int af = (0 >>> 225 | 0 << ~225 + 1) & -1;
   private static long p = Long.reverse(-1654303089243699310L);
   private static int ah = (1073741824 >>> 126 | 1073741824 << ~126 + 1) & -1;
   private static String[] ZKM_STR_B = new String[ai];

   public NLoginCore_467(NLoginType_008 var1) {
      super(var1, NLoginCore_479.n, a(e, p ^ q), ((var1.b() != 0).a() == NLoginCore_419.b ? z : af));
   }

   private static void b() {
      i = 5323874297179885719L;
      long var0 = i ^ 1252717169337802467L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(10 + 58),
               (byte)(31 + 38),
               (byte)(50 + 33),
               (byte)(45 + 2),
               67,
               (byte)(28 + 38),
               (byte)(34 + 33),
               (byte)(4 + 43),
               (byte)(10 + 70),
               (byte)(42 + 33),
               (byte)(49 + 18),
               83,
               (byte)(37 + 16),
               (byte)(26 + 54),
               (byte)(16 + 81),
               (byte)(98 + 2),
               (byte)(99 + 1),
               (byte)(77 + 28),
               (byte)(30 + 80),
               (byte)(40 + 63)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_232.E("ԫԡԙӭӷԧԱԷԩԾԭԺԿԝԎԼԄԴՆԅՁՋԒԓ", (byte)3, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.E("ԫԡԙӭӷԧԱԷԩԾԭՃԖԡԚԯԒԼԄԞՆԕԒԓ", (byte)3, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.B("úØÓÊÊ¾»ĀûãĀöüĀâĉîÈçýÛßóĄéēãÕďöĘö", (byte)3, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.B("°ØÓïÎÚßăåôåéàÔ×ĂúîãàßđØÙ", (byte)3, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= 1252717169337802467L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(40 + 29),
                     (byte)(63 + 20),
                     (byte)(19 + 28),
                     (byte)(52 + 15),
                     (byte)(7 + 59),
                     (byte)(30 + 37),
                     (byte)(9 + 38),
                     (byte)(75 + 5),
                     75,
                     (byte)(3 + 64),
                     83,
                     (byte)(38 + 15),
                     (byte)(59 + 21),
                     (byte)(88 + 9),
                     (byte)(69 + 31),
                     (byte)(23 + 77),
                     (byte)(30 + 75),
                     (byte)(19 + 91),
                     (byte)(94 + 9)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.F("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒ࢛࢜\u088fࢰࢠࢬ࢟\u0891", (byte)23, 70));
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
   protected void h(String var1, String var2) {
      UUID var3 = NLoginCore_432.c(var1);
      OfflinePlayer var4 = this.m.b().<Server>c().getOfflinePlayer(var3);
      this.a(var4.getName(), var2, null, var3);
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_467.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.B("ŁţťŅũƈƀƖƂőƏƅƓƍŖŻƝƜƔƚƔũ", (byte)77, 66), NLoginCore_467.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.A("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӡӢӕӶӦӲӥӗŬ", (byte)77, 65) + var1 + NLoginCore_173.F("Ճ", (byte)77, 70) + var2.toString(), var4
         );
      }
   }
}
