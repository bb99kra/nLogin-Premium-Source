package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_123 {
   private static long m = Long.reverse(5188146770730811392L);
   private static long d = Long.reverse(5506700702827252376L);
   private static long h = Long.reverse(318553932096440984L);
   private static String[] ZKM_STR_A = new String[NLoginCore_123.n];
   private static int k = (25165824 >>> 87 | 25165824 << -87) & -1;
   private static int i = Integer.reverse(1073741824);
   private static int o = Integer.reverse(536870912);
   private static long l = Long.reverse(5506700702827252376L);
   private static String[] ZKM_STR_B = new String[o];
   private final byte[] c;
   private static long j = Long.reverse(318553932096440984L);
   private static long e = Long.reverse(5188146770730811392L);
   private static int c = Integer.reverse(0);
   private final int Y;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private final Throwable b;
   private static int n = Integer.reverse(536870912);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int b = (0 >>> 251 | 0 << -251) & -1;
   private static int g = -1 >>> 157 | -1 << ~157 + 1;

   private static String a(int var0, long var1) {
      var1 ^= 18L;
      var1 ^= 1964696809488945445L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(67 + 2),
                     83,
                     (byte)(8 + 39),
                     67,
                     (byte)(32 + 34),
                     (byte)(22 + 45),
                     (byte)(10 + 37),
                     (byte)(24 + 56),
                     (byte)(43 + 32),
                     (byte)(61 + 6),
                     (byte)(5 + 78),
                     (byte)(7 + 46),
                     (byte)(62 + 18),
                     (byte)(30 + 67),
                     (byte)(95 + 5),
                     (byte)(77 + 23),
                     (byte)(35 + 70),
                     (byte)(67 + 43),
                     (byte)(69 + 34)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.E("ծջպԽսչմսֈշՄւֆտւֈՊ࣒࣓ࣙࣝࣝࣘࣘ࣋ࣥࢸ࣌", (byte)79, 69));
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

   public String V() {
      return this.c == null ? null : new String(this.c, StandardCharsets.UTF_8);
   }

   public boolean ag() {
      return ((this.Y != 0 ? a : b) != 0);
   }

   @Generated
   public byte[] c() {
      return this.c;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_123.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_076.A("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 65), NLoginCore_123.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìѻѴѿѿѵѺѺѭ҇њѮă", (byte)23, 65) + var1 + NLoginCore_173.E("ԍ", (byte)23, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   @Override
   public String toString() {
      return a(c, d ^ e) + Arrays.toString(this.c()) + a(f & g, h) + this.p() + a(i, j) + this.a() + a(k, l ^ m);
   }

   @Generated
   public int p() {
      return this.Y;
   }

   static {
      b();
   }

   @Generated
   public Throwable a() {
      return this.b;
   }

   public NLoginCore_123(byte[] var1, int var2) {
      this(var1, var2, null);
   }

   private static void b() {
      c = 1824404460065904178L;
      long var0 = c ^ 1964696809488945445L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(13 + 55),
               (byte)(31 + 38),
               (byte)(82 + 1),
               (byte)(25 + 22),
               (byte)(9 + 58),
               (byte)(56 + 10),
               (byte)(38 + 29),
               (byte)(31 + 16),
               (byte)(62 + 18),
               (byte)(54 + 21),
               67,
               (byte)(5 + 78),
               (byte)(50 + 3),
               (byte)(11 + 69),
               97,
               (byte)(27 + 73),
               (byte)(67 + 33),
               (byte)(6 + 99),
               (byte)(100 + 10),
               (byte)(20 + 83)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_004.D("ҌӗҵҦҧӓҜӔӟӋҴӒҝһӒҮӅӗҤӗӪҶөөҠӛүӡӛӈӂӬ", (byte)56, 68);
               ZKM_STR_B[1] = NLoginCore_446.B("ŧşņľŦħŗķũŬŪœŨŐŮŨŘĹŗŜĸŻłŃ", (byte)56, 66);
               ZKM_STR_B[2] = NLoginCore_324.B("ŜœşŠĸğŌšİĪŭļšŮĨŵŵŧĶŌĺŕłŃ", (byte)56, 66);
               ZKM_STR_B[3] = NLoginCore_004.B("ŀŜĽūŨŋŏŞůũľķ", (byte)56, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.A("ĞũŇĸĹťĮŦűŝņŤįōŤŀŗũĶũżŌŨŻŉƂŘŗŝŅţřŅŸŖƆŵƀũũŸŧŪŗ", (byte)56, 65);
               ZKM_STR_B[1] = NLoginCore_387.E("լդՋՃիԬ՜ԼծձկՎՒԶՒեՇժԿ՞ի՜՞կՅշւՓ\u0557ՙՃփ", (byte)56, 69);
               ZKM_STR_B[2] = NLoginCore_553.E("ա\u0558դեԽԤՑզԵԯճթծմՍԸձջՐվՁՊՇՈ", (byte)56, 69);
               ZKM_STR_B[3] = NLoginCore_183.A("ğũŉļŪĿŪŠĩřľķ", (byte)56, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.A("ŁŇĢĪņōĩľůľĨŞĮŁšĭķĲūĳůŕłŃ", (byte)56, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_091.D("ӌҍґҸҸҔҘҧҖӜӏҚӌӄӣҮӃӆҶӈҡҳҰұ", (byte)56, 68);
         }
      }
   }

   @Generated
   public NLoginCore_123(byte[] var1, int var2, Throwable var3) {
      this.c = var1;
      this.Y = var2;
      this.b = var3;
   }
}
