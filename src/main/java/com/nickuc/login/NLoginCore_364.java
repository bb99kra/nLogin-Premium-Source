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

public class NLoginCore_364 {
   private static long c;
   private static long o = Long.reverse(-432345564227567616L);
   private static int r = Integer.reverse(1610612736);
   private static long b = Long.reverse(-4038004580557324366L);
   private static long d = Long.reverse(-432345564227567616L);
   private static int a = (0 >>> 83 | 0 << ~83 + 1) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_364.s];
   private static int s = '쀀' >>> 173 | 49152 << -173;
   private static long f = Long.reverse(-4038004580557324366L);
   private final String br;
   private final boolean aj;
   private static long g = Long.reverse(-432345564227567616L);
   private static long i = Long.reverse(4464791515918172082L);
   private final String bp;
   private static long n = Long.reverse(-4038004580557324366L);
   private static int k = Integer.reverse(-1);
   private static long q = Long.reverse(4464791515918172082L);
   private final NLoginCore_419 a;
   private static int p = (20480 >>> 172 | 20480 << -172) & -1;
   private final String bq;
   private static String[] ZKM_STR_A = new String[r];
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long l = Long.reverse(4464791515918172082L);
   private static int m = 16384 >>> 108 | 16384 << -108;
   private static int j = 786432 >>> 82 | 786432 << ~82 + 1;
   private static int h = 134217728 >>> 218 | 134217728 << ~218 + 1;

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_364.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.E("՞րւբֆֳ֥֝֟ծְ֢֪֬ճֱֱַֺֹ֘ֆ", (byte)122, 69), NLoginCore_364.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.B("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԼԭԡՅՌԩՇԞՑՆՆՑՓǋ", (byte)122, 66) + var1 + NLoginCore_553.A("ƭ", (byte)122, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public String Y() {
      return this.br;
   }

   private static String a(int var0, long var1) {
      var1 ^= 95L;
      var1 ^= -9162959630490938289L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     (byte)(54 + 15),
                     (byte)(28 + 55),
                     (byte)(31 + 16),
                     67,
                     (byte)(48 + 18),
                     (byte)(58 + 9),
                     (byte)(38 + 9),
                     (byte)(79 + 1),
                     (byte)(17 + 58),
                     (byte)(8 + 59),
                     (byte)(53 + 30),
                     (byte)(31 + 22),
                     (byte)(74 + 6),
                     (byte)(66 + 31),
                     100,
                     (byte)(30 + 70),
                     (byte)(101 + 4),
                     (byte)(2 + 108),
                     (byte)(91 + 12)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.E("\u058c֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣲࣣࣗࣻंࣟࣽࣔइࣼࣼइउ", (byte)109, 69));
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
   public NLoginCore_364(String var1, String var2, String var3, NLoginCore_419 var4, boolean var5) {
      this.bp = var1;
      this.bq = var2;
      this.br = var3;
      this.a = var4;
      this.aj = var5;
   }

   private static void b() {
      c = 5620314722424614883L;
      long var0 = c ^ -9162959630490938289L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(62 + 7),
               (byte)(17 + 66),
               (byte)(28 + 19),
               (byte)(22 + 45),
               (byte)(51 + 15),
               (byte)(66 + 1),
               (byte)(45 + 2),
               80,
               (byte)(46 + 29),
               (byte)(41 + 26),
               (byte)(31 + 52),
               (byte)(52 + 1),
               (byte)(8 + 72),
               (byte)(8 + 89),
               (byte)(26 + 74),
               (byte)(72 + 28),
               (byte)(82 + 23),
               (byte)(69 + 41),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.B("ĭĩŋĺęĵĻĬŐĬĸĕģğğĥšŢĺśţŭłĸŝĿŝŦœŮŴŤ", (byte)48, 66);
               ZKM_STR_B[1] = NLoginCore_324.E("ԜՎՑԦԤեԦ՜\u0558խԿ\u0530ձԤզՏԫՉԯ\u0557ՕՒԿՀ", (byte)48, 69);
               ZKM_STR_B[2] = NLoginCore_173.B("ĲŊŚŒŌŚĵĴįĺĞřĮńġņİŝŀŨŨūĲĳ", (byte)48, 66);
               ZKM_STR_B[3] = NLoginCore_559.C("ҳѽҹҐӂӀѾҳҏғҤҍ", (byte)48, 67);
               ZKM_STR_B[4] = NLoginCore_076.C("ѵһҕҒҔҕҡғӂ҃ҒҺӁӀ҂ҶҾҟҺҪҊӁҘҙ", (byte)48, 67);
               ZKM_STR_B[5] = NLoginCore_324.E("ԡԞԿՑԢՅԣեԿՋԿԴ", (byte)48, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_201.F("ԺԶ\u0558ՇԦՂՈԹ՝ԹՅԢ\u0530ԬԬԲծկՇըհոՆՊպՓԺՒՉյխղպՏղ։ջ։Քև՚Շ՛Ք", (byte)48, 70);
               ZKM_STR_B[1] = NLoginCore_027.D("ѵҧҪѿѽҾѿҵұӆҙ҆ӀҽҨ҇҄҅ӑҡҾқҘҙ", (byte)48, 68);
               ZKM_STR_B[2] = NLoginCore_451.B("ĲŊŚŒŌŚĵĴįĺĞŤıŏţœŜŉĳĶĤŎńņĪŐŤĲūŤńİ", (byte)48, 66);
               ZKM_STR_B[3] = NLoginCore_183.D("ѹҩҪѺұӄҥһҜҙ҇ҤҕӅҧӋӄһҋӄҾӁҘҙ", (byte)48, 68);
               ZKM_STR_B[4] = NLoginCore_127.B("ďŕįĬĮįĻĭŜĝīİĺœťĴłńĩřŃśĲĳ", (byte)48, 66);
               ZKM_STR_B[5] = NLoginCore_110.D("ҳҙҐҴҁҔґҸҥӁҶҍ", (byte)48, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.A("ĨĔģĶŝďĳķŕœġħ", (byte)48, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_127.B("ŌŏőĤŚœęśŀŁıńĿŒıņĞŘķŠŧśĲĳ", (byte)48, 66);
         }
      }
   }

   @Generated
   public boolean ao() {
      return this.aj;
   }

   @Generated
   @Override
   public String toString() {
      return a(a, b ^ d)
         + this.q()
         + a(e, f ^ g)
         + this.s()
         + a(h, i)
         + this.Y()
         + a(j & k, l)
         + this.a()
         + a(m, n ^ o)
         + this.ao()
         + a(p, q);
   }

   @Generated
   public NLoginCore_419 a() {
      return this.a;
   }

   @Generated
   public String q() {
      return this.bp;
   }

   @Generated
   public String s() {
      return this.bq;
   }
}
