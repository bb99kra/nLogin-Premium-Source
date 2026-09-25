package com.nickuc.login;

import com.nickuc.login.api.enums.DatabaseType;
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

public class NLoginType_028 implements NLoginInterface_019<DatabaseType> {
   private static long d = Long.reverse(5120072687237916776L);
   private static long g = Long.reverse(5120072687237916776L);
   private static String[] ZKM_STR_B = new String[NLoginType_028.i];
   private static String[] ZKM_STR_A = new String[NLoginType_028.h];
   private static int f = (-1 >>> 134 | -1 << -134) & -1;
   private static long c;
   private static int i = (512 >>> 72 | 512 << ~72 + 1) & -1;
   private static int b = Integer.reverse(-1);
   private static int h = (128 >>> 134 | 128 << -134) & -1;
   public static final NLoginType_028 a = new NLoginType_028();
   private static int a = (0 >>> 209 | 0 << -209) & -1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);

   public JSONObject a(@Nonnull DatabaseType var1) {
      JSONObject var2 = new JSONObject();
      var2.put(a(a & b, d), var1);
      return var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 122L;
      var1 ^= -7647566453437985983L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(35 + 33),
                     (byte)(11 + 58),
                     (byte)(10 + 73),
                     (byte)(25 + 22),
                     67,
                     (byte)(30 + 36),
                     (byte)(19 + 48),
                     (byte)(34 + 13),
                     (byte)(65 + 15),
                     (byte)(29 + 46),
                     (byte)(41 + 26),
                     (byte)(77 + 6),
                     (byte)(18 + 35),
                     (byte)(21 + 59),
                     97,
                     (byte)(31 + 69),
                     (byte)(92 + 8),
                     (byte)(97 + 8),
                     (byte)(108 + 2),
                     (byte)(15 + 88)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(28 + 55)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.D("ѦѳѲеѵѱѬѵҀѯмѺѾѷѺҀтߐߔߝߟߟߏߔߡ", (byte)26, 68));
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

   static {
      b();
   }

   private static void b() {
      c = 1591880952850968728L;
      long var0 = c ^ -7647566453437985983L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(39 + 30),
               (byte)(77 + 6),
               (byte)(11 + 36),
               (byte)(61 + 6),
               (byte)(28 + 38),
               (byte)(12 + 55),
               (byte)(28 + 19),
               (byte)(40 + 40),
               (byte)(37 + 38),
               (byte)(10 + 57),
               (byte)(82 + 1),
               (byte)(8 + 45),
               80,
               (byte)(37 + 60),
               (byte)(8 + 92),
               (byte)(12 + 88),
               105,
               (byte)(56 + 54),
               (byte)(6 + 97)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_138.A("ƛŸƦƤƮƂƲƟūƶƖŻ", (byte)90, 65);
               ZKM_STR_B[1] = NLoginCore_183.F("վ՛։և֑ե֕ւՎ֙չ՞", (byte)90, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_575.B("ƖũžŭŬŹưűƩƉƎƲƆŶŴűƵƫƨŶǁƿƆƇ", (byte)90, 66);
               ZKM_STR_B[1] = NLoginCore_173.C("ԅԹԜԐԨӻԔԒӿԓԚԋ", (byte)90, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_427.D("ԑԭԫԋԫԌԬԯՃԹՁӹԥԀԨԁԻԬԘՎԜԩԖԗ", (byte)90, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.C("ԷӴԉӶԓӻԔӵԢԂԙԘӾԪԁԙԇԹԪՄԊՏԖԗ", (byte)90, 67);
         }
      }
   }

   public DatabaseType a(@Nonnull JSONObject var1) {
      return (DatabaseType)var1.getEnum(DatabaseType.class, a(e & f, g));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_028.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.A("ÏñóÓ÷ĖĎĤĐßĝēġěäĉīĪĢĨĢ÷", (byte)20, 65), NLoginType_028.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.F("ԳՀԿԂՂԾԹՂՍԼԉՇՋՄՇՍԏ࢝ࢡࢪࢬࢬ࢜ࢡࢮԣ", (byte)20, 70) + var1 + NLoginCore_559.C("Ы", (byte)20, 67) + var2.toString(), var4
         );
      }
   }

   @Override
   public Class<?> a() {
      return DatabaseType.class;
   }
}
