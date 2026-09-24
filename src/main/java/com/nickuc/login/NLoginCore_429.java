package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_429 implements Cloneable {
   private static int h = 6291456 >>> 85 | 6291456 << -85;
   private static int c = Integer.reverse(0);
   private static long c;
   private static String[] a;
   private String bG;
   static NLoginCore_429 b = new NLoginCore_429(a(c, NLoginCore_429.d), a(NLoginCore_429.e & NLoginCore_429.f, NLoginCore_429.g), TimeUnit.MILLISECONDS, h);
   private static String[] b;
   private static int f = (-1 >>> 122 | -1 << ~122 + 1) & -1;
   private String bF;
   private static int a = (4194304 >>> 117 | 4194304 << ~117 + 1) & -1;
   private static long g = Long.reverse(-3040907170101238456L);
   private int af;
   private TimeUnit a;
   private static long d = Long.reverse(-3040907170101238456L);
   private static int b = (4096 >>> 139 | 4096 << ~139 + 1) & -1;
   private static int e = Integer.reverse(Integer.MIN_VALUE);

   @Generated
   public NLoginCore_429(String var1, String var2, TimeUnit var3, int var4) {
      this.bF = var1;
      this.bG = var2;
      this.a = var3;
      this.af = var4;
   }

   @Generated
   public NLoginCore_429 a(int var1) {
      this.af = var1;
      return this;
   }

   @Generated
   public NLoginCore_429 b(String var1) {
      this.bG = var1;
      return this;
   }

   static {
      a = new String[a];
      b = new String[b];
      b();
   }

   @Generated
   public NLoginCore_429 a(String var1) {
      this.bF = var1;
      return this;
   }

   private static void b() {
      c = 1343960354209739714L;
      long var0 = c ^ -1209676437886953321L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(30 + 39),
               (byte)(15 + 68),
               47,
               (byte)(39 + 28),
               (byte)(12 + 54),
               (byte)(55 + 12),
               (byte)(21 + 26),
               (byte)(32 + 48),
               (byte)(11 + 64),
               (byte)(9 + 58),
               (byte)(60 + 23),
               (byte)(5 + 48),
               (byte)(49 + 31),
               (byte)(13 + 84),
               (byte)(5 + 95),
               (byte)(3 + 97),
               (byte)(66 + 39),
               110,
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_451.E("աԸՐհիՠը՟ժԷՂկճլչՌԺ՝ԹԺԾիՀ՞ԿևեՁփոոպծլՍՏ՝կ՜ե՞յոո֕Ս֝֊՜\u0590֙\u058c\u058b՞֥աֆբզպ֕դբեժլչ֭ֈփքևֆַքս", (byte)57, 69);
               b[1] = NLoginCore_324.E("ԭժՠԭբխԫՕԾՇդգջ՚ՌժյԾ՚՜ՔձՈՉ", (byte)57, 69);
               break;
            case 1:
               b[0] = NLoginCore_453.A("ŝĴŌŬŧŜŤśŦĳľūůŨŵňĶřĵĶĺŧļŚĻƃšĽſŴŴŶŪŨŉŋřūŘšŚűŴŴƑŉƙƆŘƌƕƈƇŚơŝƂŞŢŶƑŠŞšƘŧŧŻƗƉƤƄŲƨƈŹ", (byte)57, 65);
               b[1] = NLoginCore_446.A("ĩŦŜĩŞũħőĺŃŠŝĲįŃŚŒśĵĺŋſŪĽşŲőŶƅņƀŖ", (byte)57, 65);
               break;
            case 2:
               b[0] = NLoginCore_324.E("զԼԿա՜ՒմՀՓէՆԳգՎծՏվՋ՛չ՚ցՈՉ", (byte)57, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_433.C("ҴҴӓҜҴӉӟӁұӏҾӎҤҮӀҹӀӉӇӊҶӀӇӬӝӦӳӏӯӍӌӊ", (byte)57, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 105L;
      var1 ^= -1209676437886953321L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(59 + 10),
                     (byte)(41 + 42),
                     (byte)(46 + 1),
                     (byte)(3 + 64),
                     (byte)(6 + 60),
                     (byte)(50 + 17),
                     (byte)(27 + 20),
                     (byte)(42 + 38),
                     (byte)(69 + 6),
                     (byte)(34 + 33),
                     (byte)(49 + 34),
                     53,
                     (byte)(3 + 77),
                     (byte)(42 + 55),
                     (byte)(92 + 8),
                     (byte)(52 + 48),
                     (byte)(38 + 67),
                     (byte)(94 + 16),
                     (byte)(41 + 62)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҰӇӅҵҕҶӆҫӆӋ", (byte)55, 66));
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
   public NLoginCore_429 a(TimeUnit var1) {
      this.a = var1;
      return this;
   }

   public static NLoginCore_429 a() {
      try {
         return (NLoginCore_429)b.clone();
      } catch (CloneNotSupportedException var1) {
         throw new RuntimeException(var1);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_429.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.D("ѹқҝѽҡӀҸӎҺ҉ӇҽӋӅҎҳӕӔӌӒӌҡ", (byte)52, 68), NLoginCore_429.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.D("ҴӁӀ҃ӃҿҺӃӎҽҊӈӌӅӈӎҐࠔࠫࠩ࠙߹ࠚࠪࠏࠪ\u082fҦ", (byte)52, 68) + var1 + NLoginCore_201.A("ġ", (byte)52, 65) + var2.toString(), var4
         );
      }
   }
}
