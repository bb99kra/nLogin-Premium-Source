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

public class NLoginCore_068 {
   private static int j = 16384 >>> 205 | 16384 << ~205 + 1;
   private static long u = Long.reverse(-6917529027641081856L);
   private static int s = Integer.reverse(536870912);
   private static int b = (0 >>> 127 | 0 << ~127 + 1) & -1;
   private static long l = Long.reverse(-6917529027641081856L);
   private static long x = Long.reverse(-2047184366358920393L);
   private static int ae = Integer.reverse(-536870912);
   private static int a = 0 >>> 232 | 0 << ~232 + 1;
   private static int d = 0 >>> 176 | 0 << ~176 + 1;
   private static long k = Long.reverse(-2047184366358920393L);
   private static String[] ZKM_STR_A = new String[NLoginCore_068.ad];
   private static int p = (402653184 >>> 155 | 402653184 << ~155 + 1) & -1;
   private static long e = Long.reverse(-2047184366358920393L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = (0 >>> 11 | 0 << -11) & -1;
   private static long ab = Long.reverse(-6917529027641081856L);
   private static int q = -1 >>> 61 | -1 << ~61 + 1;
   private static int w = (1342177280 >>> 60 | 1342177280 << -60) & -1;
   private static int ac = Integer.reverse(0);
   private static long h = Long.reverse(-2047184366358920393L);
   private static long i = Long.reverse(-6917529027641081856L);
   private static long t = Long.reverse(-2047184366358920393L);
   private static long r = Long.reverse(4870344661282161463L);
   private static int ad = Integer.reverse(-536870912);
   private static int m = 0 >>> 70 | 0 << ~70 + 1;
   private static int g = 32 >>> 165 | 32 << -165;
   private static long f = Long.reverse(-6917529027641081856L);
   private static String[] ZKM_STR_B = new String[ae];
   private static long y = Long.reverse(-6917529027641081856L);
   private static int v = Integer.reverse(0);
   private static long c;
   private static int z = Integer.reverse(1610612736);
   private static long aa = Long.reverse(-2047184366358920393L);
   private static int c = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 5L;
      var1 ^= 4619764335393803488L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(27 + 42),
                     (byte)(46 + 37),
                     (byte)(20 + 27),
                     (byte)(35 + 32),
                     (byte)(22 + 44),
                     (byte)(30 + 37),
                     (byte)(4 + 43),
                     (byte)(38 + 42),
                     (byte)(38 + 37),
                     (byte)(16 + 51),
                     (byte)(75 + 8),
                     (byte)(42 + 11),
                     (byte)(60 + 20),
                     97,
                     100,
                     (byte)(46 + 54),
                     (byte)(74 + 31),
                     (byte)(98 + 12),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࡎࡆࠜࡃࠪࡎࡉࡍ", (byte)64, 67));
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

   private static void b() {
      c = -1386670313671005753L;
      long var0 = c ^ 4619764335393803488L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(37 + 32),
               (byte)(20 + 63),
               (byte)(14 + 33),
               (byte)(30 + 37),
               (byte)(26 + 40),
               (byte)(41 + 26),
               (byte)(36 + 11),
               (byte)(51 + 29),
               75,
               (byte)(39 + 28),
               (byte)(41 + 42),
               (byte)(34 + 19),
               (byte)(68 + 12),
               (byte)(47 + 50),
               (byte)(64 + 36),
               (byte)(22 + 78),
               (byte)(71 + 34),
               (byte)(8 + 102),
               (byte)(56 + 47)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_559.A("ååíëðäÏöâéÛĊĈĘĜĘĠöðĢĢäĀ÷āĜėĦĄĎĄĨ", (byte)13, 65);
               ZKM_STR_B[1] = NLoginCore_241.B("äċÑäâĐïâĔåÓØčúČúĒìāĠúãĝãāùĔĄùèāĩýûôôĞēĀĭĂĔĜøİĚđĵĀĮĂ÷ĦĨģĒĸŌėčĤľıŅďĲĭľŁĦĭœŐŘėġ", (byte)13, 66);
               ZKM_STR_B[2] = NLoginCore_451.F("ӺԍӺԟԕԖՉՃԾԥԶԑ", (byte)13, 70);
               ZKM_STR_B[3] = NLoginCore_183.C("ЎЎяИАїВЬјћнмЩњЭмТцћеСвЯа", (byte)13, 67);
               ZKM_STR_B[4] = NLoginCore_092.B("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàßģãéĬċíĤáĨĤ", (byte)13, 66);
               ZKM_STR_B[5] = NLoginCore_091.A("ËËČÕÍĔÏéĕĘúùæėêùßăĘòÞïìí", (byte)13, 65);
               ZKM_STR_B[6] = NLoginCore_575.E("ԠԸԚԀԛԐԾԇԴՂԺԥՄԥԹԡԍԜԧՌԐԏՓԓԙ՜ԻԝՔԑ\u0558Ք", (byte)13, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_004.E("ԕԕԝԛԠԔӿԦԒԙԋԺԸՈՌՈՐԦԠՒՒԓԔԳՓԥՈԗԯ\u0557ԸՑ", (byte)13, 69);
               ZKM_STR_B[1] = NLoginCore_110.F("ԔԻԁԔԒՀԟԒՄԕԃԈԽԪԼԪՂԜԱՐԪԓՍԓԱԩՄԴԩԘԱՙԭԫԤԤՎՃ\u0530՝ԲՄՌԨՠՊՁե\u0530՞ԲԧՖ\u0558ՓՂըռՇԽՔծայղ՛մՁեմև՚ՆՅֆՑ", (byte)13, 70);
               ZKM_STR_B[2] = NLoginCore_451.D("ГАјРЏЦуЖэИЫФ", (byte)13, 68);
               ZKM_STR_B[3] = NLoginCore_076.D("ЎЎяИАїВЬјћоюКћЫижєјиштЯа", (byte)13, 68);
               ZKM_STR_B[4] = NLoginCore_397.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàâçđüýãĘĈĪĪČ", (byte)13, 65);
               ZKM_STR_B[5] = NLoginCore_471.F("ӻӻԼԅӽՄӿԙՅՈԪԼԚՎՉԣԞԡՓԴԞՅԜԝ", (byte)13, 70);
               ZKM_STR_B[6] = NLoginCore_471.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàåęûĒĖĥĩĉĠîą", (byte)13, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.E("ԵԢԤԚԐՇԄԑԇԄԂԄԄՉԎՊԾԓԎԵԫԯԜԝ", (byte)13, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_110.C("УпЫЊИЌэИоЭЬЪЗДОйЮРООкџШньљѠуѲџѳѦ", (byte)13, 67);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(NLoginType_008 var0, String var1, String var2, ForceRegisterConfig var3) {
      if (var1 != null && var2 != null) {
         long var4 = System.nanoTime();
         NLoginCore_566 var6 = BCryptHashProvider.b();
         int var7 = b;
         boolean var13 = false /* VF: Semaphore variable */;

         int var10;
         try {
            var13 = true;
            int var8 = c;
            NLoginCore_566 var9 = var3.a();
            if (var9 == null) {
               NLoginCore_370.c(a(d, e ^ f) + var3.i() + a(g, h ^ i) + var2 + a(j, k ^ l));
            } else {
               var8 = var9.a().i(var1, var2);
            }

            if (var8 != 0) {
               var7 = var9 == var6 && !var9.a().v(var2) ? o : n;
            }

            var10 = var8;
            var13 = false;
         } finally {
            if (var13) {
               NLoginCore_548.a(NLoginCore_425.l, var4);
               if (var7 != 0) {
                  NLoginCore_370.b(a(w, x ^ y) + var3.i() + a(z, aa ^ ab) + var6.name());
                  var0.a().c(var3, var1);
               }
            }
         }

         NLoginCore_548.a(NLoginCore_425.l, var4);
         if (var7 != 0) {
            NLoginCore_370.b(a(p & q, r) + var3.i() + a(s, t ^ u) + var6.name());
            var0.a().c(var3, var1);
         }

         return (var10 != 0);
      } else {
         return (a != 0);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_068.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.B("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 66), NLoginCore_068.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶԐԈӞԅӬԐԋԏƊ", (byte)92, 66) + var1 + NLoginCore_559.A("ű", (byte)92, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
