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

public class NLoginCore_330 implements NLoginInterface_010, NLoginInterface_035 {
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[NLoginCore_330.h];
   private static int b = 0 >>> 181 | 0 << -181;
   private static String[] b = new String[i];
   private static int g = 0 >>> 176 | 0 << -176;
   private static long c;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int f = (134217728 >>> 59 | 134217728 << -59) & -1;
   private static int c = 0 >>> 78 | 0 << ~78 + 1;
   private static long d = Long.reverse(5792409605608779150L);
   private final NLoginCore_211 X;
   private static long e = Long.reverse(-288230376151711744L);
   private static int h = 33554432 >>> 89 | 33554432 << ~89 + 1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_330.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.A("ŝſƁšƅƤƜƲƞŭƫơƯƩŲƗƹƸưƶưƅ", (byte)91, 65), NLoginCore_330.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.F("պևֆՉ։օր։֔փՐ֎֒\u058b֎֔Ֆࣞࣄ࣐࣠ࣥ࣡ࣂࣰ\u08e2ի", (byte)91, 70) + var1 + NLoginCore_223.C("Ԁ", (byte)91, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_330(NLoginCore_211 var1) {
      this.X = var1;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().p();
   }

   private static void b() {
      c = 8193450574933607946L;
      long var0 = c ^ 8873165954278435705L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(44 + 24),
               (byte)(32 + 37),
               (byte)(53 + 30),
               (byte)(16 + 31),
               67,
               (byte)(60 + 6),
               (byte)(51 + 16),
               (byte)(13 + 34),
               (byte)(72 + 8),
               (byte)(10 + 65),
               (byte)(50 + 17),
               (byte)(52 + 31),
               (byte)(33 + 20),
               (byte)(28 + 52),
               (byte)(38 + 59),
               (byte)(8 + 92),
               (byte)(73 + 27),
               (byte)(24 + 81),
               (byte)(10 + 100),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_173.A("ŹƨƝƦŷƿƔƼƠƙƣƶƙǂƹǇǁƻƽƧƟǂƻƐƮƲǕǄƱƔǘƴ", (byte)97, 65);
               break;
            case 1:
               b[0] = NLoginCore_575.E("ՕքչւՓ֛հ֘ռյտ֒յ֣֞֕֝֗֙փջ֡֍֦֡֝սֲ֤ևլվ֦֎ֹ֖֢օּ֥֖֠ֈօ", (byte)97, 69);
               break;
            case 2:
               b[0] = NLoginCore_004.C("ՑԍԊԑԑԠԸՉԗՊԍՆԾԵԺԪ\u0530ԡՂՍԠՔԫԬ", (byte)97, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.A("ƉƒƲƏźƈưƟƎƯƂƞƒƝƇƱƷƉƶǍƬƗƔƕ", (byte)97, 65);
         }
      }
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_237 var10001 = NLoginCore_237.v;
      Object[] var10002 = new Object[a];
      var10002[b] = a(c, d ^ e);
      NLoginCore_150.a(var2, var10001, var10002);
      NLoginCore_445[] var5 = new NLoginCore_445[f];
      var5[g] = NLoginCore_445.a;
      return GUIButtonContainer.a(var2, var5);
   }

   private static String a(int var0, long var1) {
      var1 ^= 63L;
      var1 ^= 8873165954278435705L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(13 + 56),
                     (byte)(73 + 10),
                     47,
                     (byte)(31 + 36),
                     (byte)(18 + 48),
                     (byte)(55 + 12),
                     (byte)(13 + 34),
                     (byte)(10 + 70),
                     (byte)(74 + 1),
                     (byte)(3 + 64),
                     (byte)(64 + 19),
                     (byte)(19 + 34),
                     (byte)(59 + 21),
                     (byte)(75 + 22),
                     (byte)(75 + 25),
                     (byte)(53 + 47),
                     (byte)(83 + 22),
                     (byte)(12 + 98),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.C("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗ࢟ࢅࢡࢦࢢ\u0891ࢃࢱࢣ", (byte)97, 67));
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

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.X;
   }

   static {
      b();
   }
}
