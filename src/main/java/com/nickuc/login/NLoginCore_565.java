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

public class NLoginCore_565 extends NLoginCore_490 {
   private static long q = Long.reverse(-5476377146882523136L);
   private static long p = Long.reverse(-8838202167232214859L);
   private static String[] ZKM_STR_A = new String[NLoginCore_565.z];
   private static int e = Integer.reverse(0);
   private static String[] ZKM_STR_B = new String[NLoginCore_565.af];
   private static long i;
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int af = (128 >>> 103 | 128 << -103) & -1;

   private static void b() {
      i = -5975554785143285087L;
      long var0 = i ^ -1343879526035112174L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(8 + 60),
               (byte)(33 + 36),
               (byte)(39 + 44),
               (byte)(45 + 2),
               (byte)(35 + 32),
               66,
               (byte)(7 + 60),
               (byte)(37 + 10),
               (byte)(10 + 70),
               (byte)(27 + 48),
               (byte)(26 + 41),
               (byte)(22 + 61),
               (byte)(4 + 49),
               (byte)(66 + 14),
               (byte)(14 + 83),
               (byte)(69 + 31),
               (byte)(11 + 89),
               (byte)(81 + 24),
               (byte)(76 + 34),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_241.B("ƘŵƝŸƒƋŗŝƠſƥƅťŽŽŠŶƇŶƌƉƇŴŵ", (byte)81, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.D("ԟӼԤӿԙԒӞӤԧԆԪӷԘөӦԟӯ\u0530ԁӴԮԴӻӼ", (byte)81, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_241.C("ӽӻӸԍԜӟӣԈԝӜԟԁӤԞӨԠӣԋԭԩԟԴӻӼ", (byte)81, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_183.F("\u0558չ՞ՆղտԾյջիոՙժռատժ֍լլխ֜չՖ֘է֏֝\u058c֡ց֢", (byte)81, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 45L;
      var1 ^= -1343879526035112174L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(10 + 59),
                     (byte)(51 + 32),
                     (byte)(34 + 13),
                     (byte)(44 + 23),
                     (byte)(53 + 13),
                     67,
                     (byte)(17 + 30),
                     (byte)(6 + 74),
                     (byte)(41 + 34),
                     (byte)(31 + 36),
                     (byte)(80 + 3),
                     (byte)(51 + 2),
                     (byte)(21 + 59),
                     (byte)(84 + 13),
                     (byte)(38 + 62),
                     (byte)(28 + 72),
                     (byte)(35 + 70),
                     (byte)(71 + 39),
                     (byte)(6 + 97)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.E("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࡽࢁࢂ࢚\u0897\u0892ࢢࢧ", (byte)13, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_565.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.D("ГезЗлњђѨєУѡїѥџШэѯѮѦѬѦл", (byte)18, 68), NLoginCore_565.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.A("ĆēĒÕĕđČĕĠďÜĚĞėĚĠâїћќѴѱѬѼҁö", (byte)18, 65) + var1 + NLoginCore_446.D("Х", (byte)18, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public NLoginCore_565(NLoginType_008 var1) {
      super(var1, NLoginCore_479.G, a(e, p ^ q));
   }
}
