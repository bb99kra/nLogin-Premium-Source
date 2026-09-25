package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_014 implements NLoginInterface_019<AccountType> {
   private static long c;
   private static int a = Integer.reverse(0);
   private static int i = Integer.reverse(1073741824);
   public static final NLoginType_014 a = new NLoginType_014();
   private static String[] ZKM_STR_A = new String[NLoginType_014.h];
   private static long f = Long.reverse(4008162054993171222L);
   private static int e = (8388608 >>> 23 | 8388608 << -23) & -1;
   private static long g = Long.reverse(3458764513820540928L);
   private static int b = Integer.reverse(-1);
   private static long d = Long.reverse(549397541172630294L);
   private static int h = Integer.reverse(1073741824);
   private static String[] ZKM_STR_B = new String[i];

   public AccountType a(@Nonnull JSONObject var1) {
      return (AccountType)var1.getEnum(AccountType.class, a(e, f ^ g));
   }

   @Override
   public Class<?> a() {
      return AccountType.class;
   }

   private static String a(int var0, long var1) {
      var1 ^= 12L;
      var1 ^= 6091675053296965135L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     69,
                     (byte)(50 + 33),
                     (byte)(20 + 27),
                     (byte)(45 + 22),
                     (byte)(4 + 62),
                     (byte)(25 + 42),
                     (byte)(45 + 2),
                     (byte)(51 + 29),
                     (byte)(28 + 47),
                     (byte)(48 + 19),
                     83,
                     (byte)(49 + 4),
                     (byte)(77 + 3),
                     (byte)(25 + 72),
                     (byte)(19 + 81),
                     (byte)(63 + 37),
                     (byte)(5 + 100),
                     (byte)(55 + 55),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.E("ԶՃՂԅՅՁԼՅՐԿԌՊՎՇՊՐԒࢢ࢙ࢡࢂࢥࡼࢦࢳࢨࢠࢵࢮࢸ࢚", (byte)23, 69));
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
                  NLoginType_014.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.C("ЍЯбБеєьѢюНћёџљТчѩѨѠѦѠе", (byte)16, 67), NLoginType_014.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_575.E("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ࢛\u0892࢚ࡻ࢞ࡵ࢟ࢬࢡ࢙ࢮࢧࢱ\u0893ԥ", (byte)16, 69) + var1 + NLoginCore_521.A("Ù", (byte)16, 65) + var2.toString(), var4
         );
      }
   }

   public JSONObject a(@Nonnull AccountType var1) {
      JSONObject var2 = new JSONObject();
      var2.put(a(a & b, d), var1);
      return var2;
   }

   static {
      b();
   }

   private static void b() {
      c = 7550997554710444524L;
      long var0 = c ^ 6091675053296965135L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(43 + 26),
               83,
               (byte)(23 + 24),
               (byte)(49 + 18),
               (byte)(45 + 21),
               (byte)(44 + 23),
               47,
               (byte)(6 + 74),
               (byte)(65 + 10),
               (byte)(40 + 27),
               (byte)(66 + 17),
               (byte)(8 + 45),
               (byte)(79 + 1),
               (byte)(68 + 29),
               (byte)(61 + 39),
               (byte)(30 + 70),
               (byte)(40 + 65),
               (byte)(6 + 104),
               (byte)(82 + 21)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.B("ĥøăæïçíěĆĠñû", (byte)26, 66);
               ZKM_STR_B[1] = NLoginCore_453.F("ՈԛԦԉԒԊԐԾԩՃԔԞ", (byte)26, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.B("úøĉåíûëĭĒħĪďöĆąİĥĬČĽĜĿĆć", (byte)26, 66);
               ZKM_STR_B[1] = NLoginCore_173.F("ԎՐՐՑԩԳԠԳԮԎՐՄ\u0558ԛԚՒ՝Լԡԙ\u0530ԬԩԪ", (byte)26, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.C("йћѱѬйѡѣњѼѹѰы", (byte)26, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_241.B("ĘėĠåęĢĢĉĞČĆû", (byte)26, 66);
         }
      }
   }
}
