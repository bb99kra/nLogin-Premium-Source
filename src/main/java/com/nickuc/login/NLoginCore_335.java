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

public class NLoginCore_335 {
   private static int t = 160 >>> 69 | 160 << -69;
   private static int k = (1024 >>> 73 | 1024 << ~73 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int w = Integer.reverse(1610612736);
   private static long u = Long.reverse(-8719673895045069726L);
   private static long c;
   private static int b = 0 >>> 196 | 0 << -196;
   private static int j = Integer.reverse(0);
   private static long e = Long.reverse(1873497444986126336L);
   private static long o = Long.reverse(-7134406826210655134L);
   private static long m = Long.reverse(-8719673895045069726L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int q = (512 >>> 71 | 512 << -71) & -1;
   private static String[] a = new String[NLoginCore_335.v];
   String u;
   private static long d = Long.reverse(-7134406826210655134L);
   private static long r = Long.reverse(-7134406826210655134L);
   String v;
   private static long s = Long.reverse(1873497444986126336L);
   private static long i = Long.reverse(-8719673895045069726L);
   private static int v = 3072 >>> 9 | 3072 << -9;
   private static String[] b = new String[w];
   private static int c = Integer.reverse(0);
   private static int f = 0 >>> 115 | 0 << ~115 + 1;
   private static long p = Long.reverse(1873497444986126336L);
   private static int n = Integer.reverse(-1073741824);
   private static int l = Integer.reverse(-1);
   private static int h = Integer.reverse(-1);

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= 9053991683981047506L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(10 + 58),
                     (byte)(45 + 24),
                     (byte)(23 + 60),
                     (byte)(19 + 28),
                     (byte)(17 + 50),
                     (byte)(45 + 21),
                     (byte)(48 + 19),
                     (byte)(28 + 19),
                     (byte)(77 + 3),
                     (byte)(57 + 18),
                     (byte)(26 + 41),
                     (byte)(52 + 31),
                     (byte)(43 + 10),
                     (byte)(9 + 71),
                     97,
                     (byte)(24 + 76),
                     (byte)(26 + 74),
                     (byte)(39 + 66),
                     (byte)(38 + 72),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.F("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըंࣿःअࣵࣚंࣲऊ࣫ࣷ", (byte)109, 70));
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

   public void c(boolean var1) {
      this.b.a.a(a(n, o ^ p), var1);
   }

   @Generated
   public String m() {
      return this.v;
   }

   public void b(boolean var1) {
      this.b.a.a(a(k & l, m), var1);
   }

   public boolean D() {
      return this.b.a.a(a(g & h, i), Boolean.valueOf((boolean)j));
   }

   @Generated
   public void b(String var1) {
      this.u = var1;
   }

   public void H() {
      this.v = null;
      this.u = null;
      this.b.a.d(a(q, r ^ s));
      this.b.a.d(a(t, u));
   }

   @Generated
   public String l() {
      return this.u;
   }

   public boolean B() {
      return (boolean)(this.u == null && this.v == null ? b : a);
   }

   private static void b() {
      c = 5053576483151200057L;
      long var0 = c ^ 9053991683981047506L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(23 + 46),
               (byte)(82 + 1),
               47,
               (byte)(31 + 36),
               (byte)(41 + 25),
               (byte)(16 + 51),
               (byte)(33 + 14),
               (byte)(79 + 1),
               (byte)(18 + 57),
               (byte)(2 + 65),
               83,
               (byte)(4 + 49),
               (byte)(14 + 66),
               (byte)(35 + 62),
               (byte)(47 + 53),
               (byte)(42 + 58),
               (byte)(51 + 54),
               (byte)(18 + 92),
               (byte)(56 + 47)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_433.B("ŰůńİļŅįūĴŢňŅŵőŉŧŚŚļşřōŊŋ", (byte)60, 66);
               b[1] = NLoginCore_521.F("Տ՞ՍՔՠՄաբխՄ՚ԲԹէԻ՝յռՙՑքՎՋՌ", (byte)60, 70);
               b[2] = NLoginCore_553.B("ŰůńİļŅįūĴŢňŅŵőŉŧŚŚļşřōŊŋ", (byte)60, 66);
               b[3] = NLoginCore_575.C("ӀӏҾӅӑҵӒӓӞҵӋңҪӘҬӎӦӭӊӂӵҿҼҽ", (byte)60, 67);
               b[4] = NLoginCore_530.D("ӢӡҶҢҮҷҡӝҦӔҺҷӧӃһәӌӌҮӑӋҿҼҽ", (byte)60, 68);
               b[5] = NLoginCore_384.D("ӀӏҾӅӑҵӒӓӞҵӋңҪӘҬӎӦӭӊӂӵҿҼҽ", (byte)60, 68);
               break;
            case 1:
               b[0] = NLoginCore_521.C("ӢӡҶҢҮҷҡӝҦӔҸӂҺӥӨӨӪӁҭҽӀӥҼҽ", (byte)60, 67);
               b[1] = NLoginCore_173.D("ӀӏҾӅӑҵӒӓӞҵӊҥӫҭӦҮӍұӤӤӄҿҼҽ", (byte)60, 68);
               b[2] = NLoginCore_451.D("ӢӡҶҢҮҷҡӝҦӔҺҼӣӯӞӤӄӄӕӖӬӥҼҽ", (byte)60, 68);
               b[3] = NLoginCore_241.D("ӀӏҾӅӑҵӒӓӞҵӉӤҾҾӛӪӟөӃӶҴӵҼҽ", (byte)60, 68);
               b[4] = NLoginCore_559.F("ձհՅԱԽՆ\u0530լԵգՇԶժ\u0557՝ԷԳԾՋՄփ՞ՋՌ", (byte)60, 70);
               b[5] = NLoginCore_201.A("ŎŝŌœşŃŠšŬŃřĵůžŧŵĻŴřŢťōŊŋ", (byte)60, 65);
               break;
            case 2:
               b[0] = NLoginCore_223.D("ӍҸӅӏӠӢҹҦӇӘӁӗӚҮҭӰӤӟӧӔӐӏҼҽ", (byte)60, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.F("ՠէիՏ՞ՋՠՙթՅՅՅշպս՝ձիՔճպ՞ՋՌ", (byte)60, 70);
         }
      }
   }

   static {
      b();
   }

   @Generated
   public void c(String var1) {
      this.v = var1;
   }

   public boolean C() {
      return this.b.a.a(a(c, d ^ e), Boolean.valueOf((boolean)f));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_335.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.B("ďıĳēķŖŎŤŐğŝœšśĤŉūŪŢŨŢķ", (byte)52, 66), NLoginCore_335.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦӀҽӁӃҳҘӀҰӈҩҵĽ", (byte)52, 65) + var1 + NLoginCore_451.E("Ԫ", (byte)52, 69) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_335(ForceRegisterConfig var1) {
      this.b = var1;
   }
}
