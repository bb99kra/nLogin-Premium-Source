package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_498 implements Filter {
   private static int o = (262144 >>> 17 | 262144 << ~17 + 1) & -1;
   private static String[] a = new String[NLoginCore_498.n];
   private static int e = Integer.reverse(0);
   private static int b = 0 >>> 155 | 0 << ~155 + 1;
   private static int n = 256 >>> 71 | 256 << -71;
   private static int a = (2 >>> 65 | 2 << -65) & -1;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(-2738188573441261568L);
   private static int k = 0 >>> 1 | 0 << ~1 + 1;
   private static long j = Long.reverse(-8226694404059166417L);
   private static int p = (0 >>> 156 | 0 << ~156 + 1) & -1;
   private static int d = 0 >>> 44 | 0 << -44;
   private static int h = (0 >>> 169 | 0 << -169) & -1;
   private boolean ac;
   private static final Object[] c = new Object[p];
   private final Filter a;
   private static int i = 1 >>> 128 | 1 << ~128 + 1;
   private static int l = 4 >>> 130 | 4 << -130;
   private static String[] b = new String[o];
   private static long f = Long.reverse(6328939591602276655L);
   private static int m = Integer.reverse(0);
   private static long c;

   private static String a(int var0, long var1) {
      var1 ^= 91L;
      var1 ^= -1060502292199797024L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(35 + 33),
                     (byte)(27 + 42),
                     (byte)(67 + 16),
                     (byte)(9 + 38),
                     (byte)(62 + 5),
                     (byte)(64 + 2),
                     (byte)(6 + 61),
                     (byte)(34 + 13),
                     (byte)(17 + 63),
                     (byte)(22 + 53),
                     67,
                     (byte)(29 + 54),
                     (byte)(39 + 14),
                     80,
                     (byte)(48 + 49),
                     (byte)(80 + 20),
                     (byte)(96 + 4),
                     (byte)(101 + 4),
                     (byte)(107 + 3),
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.B("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҕҦҦҪҮҢҺҸҬ҉ҊҸҵҷҾ", (byte)46, 66));
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

   static {
      b();
   }

   private static void b() {
      c = -824094670751061014L;
      long var0 = c ^ -1060502292199797024L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(50 + 18),
               69,
               (byte)(23 + 60),
               (byte)(41 + 6),
               (byte)(21 + 46),
               (byte)(6 + 60),
               (byte)(48 + 19),
               (byte)(42 + 5),
               (byte)(73 + 7),
               (byte)(54 + 21),
               (byte)(10 + 57),
               (byte)(19 + 64),
               53,
               (byte)(44 + 36),
               (byte)(55 + 42),
               (byte)(65 + 35),
               (byte)(61 + 39),
               (byte)(99 + 6),
               (byte)(16 + 94),
               (byte)(25 + 78)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_127.C("ҰӅӋұӊӴӖӖӘүӹӪӴҷӾӃӰӼӁӤԀԉԄԇӾөԆӽөԀӾӉӪӌӿӥԐӱԔӯӼԗӭԗӝӠӮӕӹԣӝԤԥӤӳӹԬӪԚԬԏԎԌԳ", (byte)66, 67);
               b[1] = NLoginCore_384.A("ŅŲŦŪŞĳŘŐŖķŜŒŴŃŝŦņŤŖŨƃŌŭŠŜŋƉƏŲƍŢżŸŔŦŕƠƑŷŢƙųŝū", (byte)66, 65);
               break;
            case 1:
               b[0] = NLoginCore_232.B("ĸōœĹŒżŞŞŠķƁŲżĿƆŋŸƄŉŬƈƑƌƏƆűƎƅűƈƆőŲŔƇŭƘŹƜŷƄƟŵƟťŨŶŝƁƫťƬƭŰƳƏƍƌƆƓƤŵƑƌ", (byte)66, 66);
               b[1] = NLoginCore_223.A("ŅŲŦŪŞĳŘŐŖķŜŒŴŃŝŦņŤŖŨƃŌŭŠŜŋƉƏŲƍŢżūŬŴŴŚƚƐƁŹƝžū", (byte)66, 65);
               break;
            case 2:
               b[0] = NLoginCore_183.A("ŊťşĻŖƁŐŵŃżżŨŃŒŵƈżňŊŇŬřŖŗ", (byte)66, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_521.F("եբկդԵդԸջԼՒնչՍ՟նաղՕՂՃ\u058b՝՛Մռչ֏ժխվֆե", (byte)66, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_498.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.C("ӄӦӨӈӬԋԃԙԅӔԒԈԖԐәӾԠԟԗԝԗӬ", (byte)77, 67), NLoginCore_498.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.C("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡖࡧࡧ\u086b\u086fࡣࡻࡹ\u086dࡊࡋࡹࡶࡸࡿӶ", (byte)77, 67) + var1 + NLoginCore_004.A("œ", (byte)77, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_498(Filter var1) {
      this.a = var1;
   }

   @Override
   public boolean isLoggable(LogRecord var1) {
      if (var1 != null && var1.getMessage() != null && !this.ac) {
         Object[] var2 = var1.getParameters();
         if (!NLoginCore_370.d().stream().noneMatch(var3 -> {
            try {
               return var3.filter(var1.getLoggerName(), var1.getMessage(), var2 == null ? c : var2);
            } catch (Throwable var5) {
               NLoginCore_370.c(a(i, j), var5);
               this.ac = (boolean)l;
               return (boolean)m;
            }
         })) {
            var1.setMessage(a(e, f ^ g));
            return (boolean)h;
         } else {
            return (boolean)(this.a != null && !this.a.isLoggable(var1) ? d : c);
         }
      } else {
         return (boolean)(this.a != null && !this.a.isLoggable(var1) ? b : a);
      }
   }
}
