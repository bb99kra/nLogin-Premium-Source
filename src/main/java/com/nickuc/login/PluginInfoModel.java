package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class PluginInfoModel {
   private static int o = 83886080 >>> 24 | 83886080 << ~24 + 1;
   private static String[] ZKM_STR_A = new String[o];
   @Nullable
   private final Path a;
   private final String bz;
   private static int h = Integer.reverse(1073741824);
   private static long d = Long.reverse(4467570830351532032L);
   private static long i = Long.reverse(-6385736449816462996L);
   private static long g = Long.reverse(4467570830351532032L);
   private static int k = -1 >>> 199 | -1 << ~199 + 1;
   private static long n = Long.reverse(-6385736449816462996L);
   private static int p = 320 >>> 198 | 320 << -198;
   private final List<String> m;
   private static long b = Long.reverse(-7394542766347454100L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int m = 67108864 >>> 216 | 67108864 << ~216 + 1;
   private static long l = Long.reverse(-6385736449816462996L);
   private final String bA;
   private static String[] ZKM_STR_B = new String[p];
   private static long f = Long.reverse(-7394542766347454100L);
   private static int j = (-2147483647 >>> 31 | -2147483647 << -31) & -1;
   private static long c;
   private static int a = Integer.reverse(0);

   @Generated
   public String getName() {
      return this.bz;
   }

   @Generated
   public String getVersion() {
      return this.bA;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  PluginInfoModel.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.F("ԄԦԨԈԬՋՃՙՅԔՒՈՖՐԙԾՠ՟\u0557՝\u0557Ԭ", (byte)32, 70), PluginInfoModel.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.D("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒє߉ߟߎ\u07bcߦߪ߇߰ߠߡߤѫ", (byte)32, 68) + var1 + NLoginCore_453.A("ù", (byte)32, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public List<String> f() {
      return this.m;
   }

   private static String a(int var0, long var1) {
      var1 ^= 124L;
      var1 ^= 820860335062832355L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(10 + 59),
                     (byte)(19 + 64),
                     (byte)(10 + 37),
                     (byte)(63 + 4),
                     (byte)(39 + 27),
                     (byte)(51 + 16),
                     (byte)(40 + 7),
                     (byte)(8 + 72),
                     75,
                     (byte)(16 + 51),
                     (byte)(58 + 25),
                     (byte)(43 + 10),
                     (byte)(58 + 22),
                     (byte)(49 + 48),
                     (byte)(58 + 42),
                     (byte)(99 + 1),
                     (byte)(4 + 101),
                     (byte)(105 + 5),
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.B("ƶǃǂƅǅǁƼǅǐƿƌǊǎǇǊǐƒԇԝԌӺԤԨԅԮԞԟԢ", (byte)106, 66));
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
   public PluginInfoModel(String var1, String var2, List<String> var3, @Nullable Path var4) {
      this.bz = var1;
      this.bA = var2;
      this.m = var3;
      this.a = var4;
   }

   static {
      b();
   }

   @Generated
   @Override
   public String toString() {
      return a(a, b ^ d) + this.getName() + a(e, f ^ g) + this.getVersion() + a(h, i) + this.f() + a(j & k, l) + this.a() + a(m, n);
   }

   private static void b() {
      c = 3935925021237741209L;
      long var0 = c ^ 820860335062832355L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               (byte)(45 + 24),
               (byte)(58 + 25),
               47,
               (byte)(64 + 3),
               (byte)(62 + 4),
               (byte)(35 + 32),
               47,
               (byte)(8 + 72),
               (byte)(5 + 70),
               (byte)(18 + 49),
               (byte)(82 + 1),
               (byte)(37 + 16),
               (byte)(53 + 27),
               (byte)(88 + 9),
               (byte)(29 + 71),
               (byte)(84 + 16),
               (byte)(94 + 11),
               (byte)(71 + 39),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(57 + 26)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_232.A("ĝĎĻėŃķĲĎąćĩđńęŅĘŅęģďĮŅĲĭĖĲďďđĘŊŊĖğīŋŚŌŃšśŗŦĭ", (byte)35, 65);
               ZKM_STR_B[1] = NLoginCore_397.B("þþİĎēùþĸėłĹņěņħĶŎĚľłŒěĘę", (byte)35, 66);
               ZKM_STR_B[2] = NLoginCore_471.E("ԦԖԳԨԥԚԪՈԿԸՁՎՐԸՠԽ՜ԥԻԫա՛ԲԳ", (byte)35, 69);
               ZKM_STR_B[3] = NLoginCore_173.A("ĈúÿĴûĲŁġĎĕĘč", (byte)35, 65);
               ZKM_STR_B[4] = NLoginCore_183.F("ԤՅԬՄԶԜԜԴՋԮՌԧ", (byte)35, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_575.A("ĝĎĻėŃķĲĎąćĩđńęŅĘŅęģďĮŅĲĭĖĲďďđĘŊŊŝŋřĞıĲĮłŏŔļŀŕŇŠŠĨśşİŅĻĸĹ", (byte)35, 65);
               ZKM_STR_B[1] = NLoginCore_324.B("þþİĎēùþĸėłĶŁňļėčĜĿİđĤőĘę", (byte)35, 66);
               ZKM_STR_B[2] = NLoginCore_446.C("ѥѕѲѧѤљѩ҇ѾѷѿѳҀћҟҥҚҠ҄ѲҬҚѱѲ", (byte)35, 67);
               ZKM_STR_B[3] = NLoginCore_451.B("ĖįþĻĸıĀŀıĴĂķĦĦľěĄŎıŋĜőĘę", (byte)35, 66);
               ZKM_STR_B[4] = NLoginCore_553.E("ՅԔԙՐԳՑԗՔԻԺՌԧ", (byte)35, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.E("ՕԳՑ՜ԨԷՏԶՁՒԹԜԡՔԸՏՃԳԥԥԦՈ՟ծԢ՞հեՌԯճԳ", (byte)35, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_183.E("ԒՕՒԔԸՌՒԜԩԡ՚դԚԶՙ\u0530ԡՀիՠ՟ԬԸԷհ՞ԨԩԦղՠ\u0557", (byte)35, 69);
         }
      }
   }

   @Nullable
   @Generated
   public Path a() {
      return this.a;
   }
}
