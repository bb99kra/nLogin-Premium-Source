package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
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

public class NLoginCore_180 {
   private static int f = Integer.reverse(0);
   private static int i = 0 >>> 91 | 0 << ~91 + 1;
   private static long b = Long.reverse(1095279556709755679L);
   private final String aY;
   private static int j = 33554432 >>> 249 | 33554432 << -249;
   private static int k = (1 >>> 32 | 1 << ~32 + 1) & -1;
   private static int d = (10240 >>> 103 | 10240 << ~103 + 1) & -1;
   private static String[] b = new String[k];
   private static int g = (0 >>> 180 | 0 << ~180 + 1) & -1;
   private static int h = (0 >>> 36 | 0 << -36) & -1;
   private static long c;
   private static int a = Integer.reverse(0);
   private final String aZ;
   private static int e = (0 >>> 192 | 0 << ~192 + 1) & -1;
   private static String[] a = new String[j];
   private static int c = 1031798784 >>> 215 | 1031798784 << -215;

   public boolean a(JSONObject var1, String var2, byte[] var3) {
      return true;
   }

   @Generated
   public String T() {
      return this.aZ;
   }

   @Generated
   public NLoginCore_180(String var1, String var2) {
      this.aY = var1;
      this.aZ = var2;
   }

   static {
      b();
   }

   private static void b() {
      c = -516375928563250036L;
      long var0 = c ^ 4976315622005182375L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(23 + 45),
               (byte)(41 + 28),
               (byte)(37 + 46),
               (byte)(32 + 15),
               (byte)(43 + 24),
               (byte)(44 + 22),
               (byte)(4 + 63),
               (byte)(45 + 2),
               (byte)(16 + 64),
               (byte)(13 + 62),
               67,
               (byte)(54 + 29),
               (byte)(45 + 8),
               80,
               (byte)(28 + 69),
               (byte)(47 + 53),
               (byte)(44 + 56),
               (byte)(29 + 76),
               (byte)(57 + 53),
               (byte)(38 + 65)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_110.C("ԡԹӶՃԝԏԻԘԜԣԶՈՊՊՆԝՒԊԥԡԶՕԜԝ", (byte)92, 67);
               break;
            case 1:
               b[0] = NLoginCore_324.F("հֈՅ֒լ՞֊էիղօ֑֖֕ձռՙլսդնվիլ", (byte)92, 70);
               break;
            case 2:
               b[0] = NLoginCore_553.C("ԴԾԥԯԁԃԆԛԤԄՊԑ", (byte)92, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_397.A("ƟƊƌƈƴƯƊƘƙƁƣƐƙƾƛƗŷƕƭƾƘƾƚǁƤǁƢƩƚǅƎǊ", (byte)92, 65);
         }
      }
   }

   @Generated
   public String S() {
      return this.aY;
   }

   private static String a(int var0, long var1) {
      var1 ^= 124L;
      var1 ^= 4976315622005182375L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(51 + 18),
                     (byte)(46 + 37),
                     (byte)(44 + 3),
                     (byte)(4 + 63),
                     (byte)(41 + 25),
                     (byte)(53 + 14),
                     (byte)(31 + 16),
                     (byte)(76 + 4),
                     (byte)(46 + 29),
                     (byte)(28 + 39),
                     (byte)(51 + 32),
                     (byte)(37 + 16),
                     (byte)(50 + 30),
                     (byte)(87 + 10),
                     (byte)(70 + 30),
                     (byte)(15 + 85),
                     (byte)(64 + 41),
                     110,
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(73 + 10)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.E("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծउࣼः࣭࣮ࣴऀआࣜऎऍओ", (byte)115, 69));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         a[var0] = new String(var3.doFinal(Base64.getDecoder().decode(b[var0])), StandardCharsets.UTF_8);
      }

      return a[var0];
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_180.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.D("ҦӈӊҪӎӭӥӻӧҶӴӪӸӲһӠԂԁӹӿӹӎ", (byte)67, 68), NLoginCore_180.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.F("բկծԱձխըձռիԸնպճնռԾ࣓ࣙ࣌ࣄࢽࢾ࣐ࣖࢬࣣࣞࣝՖ", (byte)67, 70) + var1 + NLoginCore_446.E("Թ", (byte)67, 69) + var2.toString(), var4
         );
      }
   }
}
