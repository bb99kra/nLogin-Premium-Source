package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_143 implements NLoginInterface_010 {
   private static float w = Float.intBitsToFloat(Integer.reverse(3714));
   private static long u = Long.reverse(5691428554653457055L);
   private static int n = Integer.reverse(-1073741824);
   private static int a = 0 >>> 190 | 0 << ~190 + 1;
   private static long l = Long.reverse(5691428554653457055L);
   private static int aa = Integer.reverse(0);
   private final NLoginCore_211 W;
   private static long v = Long.reverse(-4035225266123964416L);
   private static int z = Integer.reverse(0);
   private static int f = (0 >>> 234 | 0 << ~234 + 1) & -1;
   private static int t = (134217728 >>> 57 | 134217728 << ~57 + 1) & -1;
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(1073741824);
   private static int g = 16 >>> 164 | 16 << -164;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static long b = Long.reverse(5691428554653457055L);
   private static long m = Long.reverse(-4035225266123964416L);
   private static long d = Long.reverse(-4035225266123964416L);
   private static int o = (-1 >>> 92 | -1 << -92) & -1;
   private static int i = 16384 >>> 14 | 16384 << -14;
   private static String[] b = new String[NLoginCore_143.ac];
   private static float x = Float.intBitsToFloat(257 >>> 170 | 257 << ~170 + 1);
   private static int s = Integer.reverse(0);
   private static String[] a = new String[NLoginCore_143.ab];
   private static int h = 0 >>> 232 | 0 << ~232 + 1;
   private static long p = Long.reverse(-8720090252932130145L);
   private static long j = Long.reverse(-8720090252932130145L);
   private static int r = Integer.reverse(0);
   private static int ab = Integer.reverse(-1610612736);
   private static int y = Integer.reverse(671088640);
   private static int ac = Integer.reverse(-1610612736);

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().p() && !var2.i(a(a, b ^ d)) ? e : f);
   }

   @Generated
   public NLoginCore_143(NLoginCore_211 var1) {
      this.W = var1;
   }

   private static void b() {
      c = -478994485135523982L;
      long var0 = c ^ -1044004690730198371L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(27 + 41),
               (byte)(36 + 33),
               83,
               (byte)(37 + 10),
               67,
               (byte)(16 + 50),
               (byte)(20 + 47),
               (byte)(39 + 8),
               (byte)(23 + 57),
               (byte)(44 + 31),
               (byte)(19 + 48),
               (byte)(19 + 64),
               (byte)(40 + 13),
               (byte)(16 + 64),
               (byte)(49 + 48),
               (byte)(49 + 51),
               (byte)(79 + 21),
               (byte)(81 + 24),
               (byte)(55 + 55),
               (byte)(78 + 25)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_027.B("ŘœŖĽĵŘĸľŰűŦśŏűĬŘŁőłűļŻłŃ", (byte)56, 66);
               b[1] = NLoginCore_223.A("ŘœŖĽĵŘĸľŰűŦśŏűĬŘŁőłűļŻłŃ", (byte)56, 65);
               b[2] = NLoginCore_324.A("ĽŃŇĺŘĸŧōōĩıķ", (byte)56, 65);
               b[3] = NLoginCore_092.A("ŚğĸřŕĹĺŦŨĭĭķ", (byte)56, 65);
               b[4] = NLoginCore_201.E("՝\u0558՛ՂԺ՝ԽՃյնիՠՔնԱ՝ՆՖՇնՁրՇՈ", (byte)56, 69);
               break;
            case 1:
               b[0] = NLoginCore_427.C("ӆӁӄҫңӆҦҬӞӟӔҜӋӔҬҥӧҦӝҢӜҳҰұ", (byte)56, 67);
               b[1] = NLoginCore_004.A("ŘœŖĽĵŘĸľŰűŤœŊĵŧŧŴūŧĸőŻłŃ", (byte)56, 65);
               b[2] = NLoginCore_446.E("ԦԠթժՠՌձԴճ\u0530ՌՌնՑըզյ՝խԹԻհՇՈ", (byte)56, 69);
               b[3] = NLoginCore_173.A("ĸĥşśĸĥķĮŅĺŰŧőŴŅĳœŔĸŉŉŕłŃ", (byte)56, 65);
               b[4] = NLoginCore_397.C("ӆӁӄҫңӆҦҬӞӟӓӜӝҜӢҽӚҵұӞӝәҰұ", (byte)56, 67);
               break;
            case 2:
               b[0] = NLoginCore_141.F("Խ՜ԥԾԹ՟ԯԲղճՂԴԹծթԵ\u0557Վկռջ՚ՇՈ", (byte)56, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_223.B("ŐńġĴĤŀŦŗūōłķ", (byte)56, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 19L;
      var1 ^= -1044004690730198371L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(46 + 23),
                     (byte)(8 + 75),
                     (byte)(4 + 43),
                     (byte)(38 + 29),
                     (byte)(46 + 20),
                     (byte)(10 + 57),
                     (byte)(39 + 8),
                     (byte)(71 + 9),
                     (byte)(14 + 61),
                     (byte)(41 + 26),
                     (byte)(13 + 70),
                     (byte)(22 + 31),
                     (byte)(9 + 71),
                     (byte)(54 + 43),
                     100,
                     (byte)(12 + 88),
                     (byte)(18 + 87),
                     (byte)(95 + 15),
                     (byte)(44 + 59)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.E("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼࡴࡸࢎࢅ࢙\u086eࡷࢇࡩ࢛ࢉ\u0891࢝\u0895\u0896", (byte)1, 69));
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

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
   }

   @Override
   public boolean au() {
      return (boolean)s;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_055 var5 = var3.b();
      if (var5 == null || var5 == NLoginCore_055.d) {
         var5 = NLoginCore_150.c();
      }

      NLoginCore_150.a(var1, var5);
      NLoginCore_316 var6 = NLoginCore_150.a(var5);
      NLoginCore_237 var10001 = NLoginCore_237.d;
      Object[] var10002 = new Object[g];
      var10002[h] = a(i, j);
      List var7 = var6.a(var10001, var10002);
      var4.a(String.join(a(k, l ^ m), var7).replace(a(n & o, p), var2.getName()));
      AtomicInteger var8 = new AtomicInteger();
      var1.b((boolean)q).a(var6x -> {
         if (var2.R() && this.a(var3)) {
            NLoginCore_501 var7x = var3.d(NLoginCore_567.n);
            if (var7x == null) {
               var6x.Z();
            } else if (var2.i(a(t, u ^ v))) {
               var3.a(NLoginCore_567.n, var7x.a());
               var6x.Z();
               NLoginCore_150.a(var2, NLoginCore_194.C, w, x);
               this.b(var1, var2, var3);
            } else {
               if (var8.incrementAndGet() >= y) {
                  var8.set(z);
                  var6.a(NLoginCore_508.m).a(var2);
               }
            }
         } else {
            var6x.Z();
         }
      }, 1L, 1L, TimeUnit.SECONDS);
      return new GUIButtonContainer[r];
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.W;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_143.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_076.F("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)49, 70), NLoginCore_143.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.A("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҘҜҲҩҽҒқҫҍҿҭҵӁҹҺĻ", (byte)49, 65) + var1 + NLoginCore_553.C("҂", (byte)49, 67) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
