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

public class NLoginCore_038 implements NLoginInterface_010, NLoginInterface_035 {
   private static int e = (2 >>> 1 | 2 << ~1 + 1) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_038.n];
   private static long c;
   private final NLoginCore_211 ac;
   private static long l = Long.reverse(-4899916394579099648L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static int n = Integer.reverse(1073741824);
   private static int f = (0 >>> 70 | 0 << ~70 + 1) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_038.m];
   private static int c = (0 >>> 63 | 0 << -63) & -1;
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(1073741824);
   private static int g = Integer.reverse(0);
   private static long i = Long.reverse(6713520503537449911L);
   private static int d = Integer.reverse(0);
   private static int a = 301989888 >>> 153 | 301989888 << ~153 + 1;
   private static int h = -1 >>> 124 | -1 << ~124 + 1;
   private static long k = Long.reverse(-2221621157165614153L);

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return ((var1.a() != 0).n() == a && var1.a().q() && this.a(var3).av() ? b : c);
   }

   static {
      b();
   }

   @Generated
   public NLoginCore_038(NLoginCore_211 var1) {
      this.ac = var1;
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.ac;
   }

   private static void b() {
      c = -1306776578278239097L;
      long var0 = c ^ 3739436817657354170L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(41 + 28),
               (byte)(51 + 32),
               (byte)(14 + 33),
               (byte)(58 + 9),
               (byte)(46 + 20),
               (byte)(16 + 51),
               (byte)(5 + 42),
               (byte)(54 + 26),
               (byte)(62 + 13),
               67,
               (byte)(46 + 37),
               53,
               (byte)(54 + 26),
               (byte)(68 + 29),
               (byte)(14 + 86),
               (byte)(23 + 77),
               (byte)(4 + 101),
               (byte)(32 + 78),
               (byte)(96 + 7)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(13 + 56), (byte)(17 + 66)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.E("ԊԤԎԃԵԲӿԨӼԗԄՌԶՎՅԩԧԦՎԦՕԟԜԝ", (byte)13, 69);
               ZKM_STR_B[1] = NLoginCore_173.B("ČñäçĐôāĔöîĝđèúÿċòëÿåėðççĕĉćß÷īĄĂįĨğĂíĨīĂĦĲęĞĘĕĖĿěĒďĭĖćĲĚąăĄĜčĨĺıőĭĝŖŊŋĴĔŕĺĸġ", (byte)13, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_138.C("НзСЖшхВлЏЪЖПммОКѐлїѣштЯа", (byte)13, 67);
               ZKM_STR_B[1] = NLoginCore_427.F("ԼԡԔԗՀԤԱՄԦԞՍՁԘԪԯԻԢԛԯԕՇԠԗԗՅԹԷԏԧ՛ԴԲ՟\u0558ՏԲԝ\u0558՛ԲՖբՉՎՈՅՆկՋՂԿ՝ՆԷբՊԵԳԴՌԽ\u0558ժաղ՜ետ՟ևջՇֈվ\u0558Ց", (byte)13, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.E("ԠԌԳՃԞԹՅԶԥԳԦՎԷԩՎՀՀԲՒԭԨԡՂՇՎՈԩՙ՝ԨաՂ", (byte)13, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_471.F("ԮԢՁԽԺԒԗԻԢԉԊԩԮԭԂԃՇՈՏԩՅԯԜԝ", (byte)13, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_038.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), NLoginCore_038.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.D("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծࣹࣿࣝआंࣶ࣯ँࣱփ", (byte)126, 68) + var1 + NLoginCore_453.D("թ", (byte)126, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 61L;
      var1 ^= 3739436817657354170L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     (byte)(6 + 63),
                     (byte)(81 + 2),
                     (byte)(41 + 6),
                     67,
                     66,
                     (byte)(64 + 3),
                     (byte)(28 + 19),
                     (byte)(29 + 51),
                     (byte)(34 + 41),
                     (byte)(49 + 18),
                     (byte)(81 + 2),
                     (byte)(51 + 2),
                     (byte)(15 + 65),
                     (byte)(63 + 34),
                     (byte)(86 + 14),
                     (byte)(95 + 5),
                     (byte)(73 + 32),
                     (byte)(63 + 47),
                     (byte)(73 + 30)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(51 + 32)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӁһҟӈӄҸұӃҳ", (byte)57, 66));
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
      NLoginCore_150.a(var2, NLoginCore_237.n, var1x -> {
         if (var1x.contains(a(g & h, i))) {
            var4.c(var1x, a(j, k ^ l));
         } else {
            var4.a(var1x);
         }
      });
      NLoginCore_445[] var10001 = new NLoginCore_445[e];
      var10001[f] = NLoginCore_445.a;
      return GUIButtonContainer.a(var2, var10001);
   }
}
