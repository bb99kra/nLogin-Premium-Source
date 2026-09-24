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

@Generated
public class NLoginCore_086 {
   private static long f = Long.reverse(-7435424456220289670L);
   @Generated
   private String s;
   private static long r = Long.reverse(346795699875927418L);
   private static long y = Long.reverse(-7205759403792793600L);
   private static long b = Long.reverse(-7435424456220289670L);
   private static long i = Long.reverse(-7435424456220289670L);
   private static int e = (131072 >>> 81 | 131072 << -81) & -1;
   @Generated
   private String T;
   private static int k = Integer.reverse(-1073741824);
   private static int aa = (128 >>> 100 | 128 << -100) & -1;
   private static int a = (0 >>> 105 | 0 << -105) & -1;
   private static long j = Long.reverse(-7205759403792793600L);
   private static int w = 7340032 >>> 84 | 7340032 << -84;
   private static long c;
   private static int n = 16 >>> 34 | 16 << ~34 + 1;
   private static long o = Long.reverse(-7435424456220289670L);
   private static long d = Long.reverse(-7205759403792793600L);
   @Generated
   private NLoginCore_020 a;
   private static long p = Long.reverse(-7205759403792793600L);
   private static long g = Long.reverse(-7205759403792793600L);
   private static int u = -1 >>> 39 | -1 << ~39 + 1;
   @Generated
   private int t;
   private static long l = Long.reverse(-7435424456220289670L);
   @Generated
   private String X;
   private static long m = Long.reverse(-7205759403792793600L);
   @Generated
   private String V;
   private static int q = Integer.reverse(-1610612736);
   private static String[] b = new String[aa];
   private static long x = Long.reverse(-7435424456220289670L);
   private static long v = Long.reverse(346795699875927418L);
   private static int s = Integer.reverse(1610612736);
   private static int h = 4096 >>> 171 | 4096 << ~171 + 1;
   private static String[] a = new String[NLoginCore_086.z];
   private static int z = 4194304 >>> 19 | 4194304 << -19;
   @Generated
   private String U;

   @Generated
   public NLoginCore_086 d(String var1) {
      this.s = var1;
      return this;
   }

   @Generated
   public NLoginCore_086 c(String var1) {
      this.V = var1;
      return this;
   }

   @Generated
   public NLoginCore_086 a(NLoginCore_020 var1) {
      this.a = var1;
      return this;
   }

   static {
      b();
   }

   @Generated
   NLoginCore_086() {
   }

   @Generated
   public NLoginCore_086 a(int var1) {
      this.t = var1;
      return this;
   }

   @Generated
   @Override
   public String toString() {
      return a(a, b ^ d)
         + this.a
         + a(e, f ^ g)
         + this.T
         + a(h, i ^ j)
         + this.U
         + a(k, l ^ m)
         + this.V
         + a(n, o ^ p)
         + this.s
         + a(q, r)
         + this.t
         + a(s & u, v)
         + this.X
         + a(w, x ^ y);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_086.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.C("Ѥ҆҈ѨҌҫңҹҥѴҲҨҶҰѹҞӀҿҷҽҷҌ", (byte)45, 67), NLoginCore_086.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.F("Ռՙ\u0558ԛ՛\u0557Ւ՛զՕԢՠդ՝ՠզԨࢶࢷࣂࢳࢿࣃࢳࣀࢺࣁࣆࣁࢯՁ", (byte)45, 70) + var1 + NLoginCore_141.B("ē", (byte)45, 66) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_086 e(String var1) {
      this.X = var1;
      return this;
   }

   @Generated
   public NLoginCore_086 b(String var1) {
      this.U = var1;
      return this;
   }

   @Generated
   public NLoginCore_086 a(String var1) {
      this.T = var1;
      return this;
   }

   private static String a(int var0, long var1) {
      var1 ^= 57L;
      var1 ^= 2387258427881515113L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(65 + 4),
                     (byte)(49 + 34),
                     (byte)(34 + 13),
                     (byte)(7 + 60),
                     (byte)(34 + 32),
                     67,
                     (byte)(15 + 32),
                     (byte)(33 + 47),
                     (byte)(21 + 54),
                     (byte)(23 + 44),
                     (byte)(50 + 33),
                     (byte)(16 + 37),
                     (byte)(62 + 18),
                     (byte)(91 + 6),
                     100,
                     (byte)(28 + 72),
                     (byte)(9 + 96),
                     (byte)(47 + 63),
                     (byte)(98 + 5)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߇߈ߓ߄ߐߔ߄ߑߋߒߗߒ߀", (byte)23, 67));
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
   public NLoginCore_402 a() {
      return new NLoginCore_402(this.a, this.T, this.U, this.V, this.s, this.t, this.X);
   }

   private static void b() {
      c = 6821613269758249753L;
      long var0 = c ^ 2387258427881515113L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(21 + 47),
               69,
               83,
               (byte)(13 + 34),
               (byte)(38 + 29),
               (byte)(32 + 34),
               (byte)(57 + 10),
               (byte)(16 + 31),
               (byte)(61 + 19),
               (byte)(28 + 47),
               (byte)(41 + 26),
               (byte)(70 + 13),
               (byte)(26 + 27),
               (byte)(30 + 50),
               (byte)(68 + 29),
               (byte)(92 + 8),
               (byte)(42 + 58),
               (byte)(3 + 102),
               (byte)(56 + 54),
               (byte)(52 + 51)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(81 + 2)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_127.A("ÈĀýÝąďæąÍÎôďÕåčĕĘÒēÔùØû÷ėÛìĥąüāąýĪĭČç÷îįêăēĊîéĕùėİĈĉĳñďĵĒļĹığĘĄĹķĸėĠĹćĘŎņŅĮĠįņĲĴĐĚĭĻĩķĤĥ", (byte)9, 65);
               b[1] = NLoginCore_451.B("ĄÆçăçÏÐĂĊÓĈĔĐĂĊêěĆēĔéčäå", (byte)9, 66);
               b[2] = NLoginCore_446.D("хвЇЈНЙЪЧтцэИ", (byte)9, 68);
               b[3] = NLoginCore_076.D("ЉФгЊжМомвщёИ", (byte)9, 68);
               b[4] = NLoginCore_241.C("ϻгЁЉЋмймМяНФбЍиСтХѕдяжУФ", (byte)9, 67);
               b[5] = NLoginCore_384.F("ԵԒӽԓԖԋԮԘՁԾՂԍ", (byte)9, 70);
               b[6] = NLoginCore_559.F("ӹԖԓԠԁӾԬԖՇԸԺԍ", (byte)9, 70);
               b[7] = NLoginCore_110.B("ÞĄÿÄèèĀäÄÉĆÙ", (byte)9, 66);
               break;
            case 1:
               b[0] = NLoginCore_110.C("ЇпмМфюХфЌЍгюДФьєїБђГиЗкжіКЫѤфлрфмѩѬыЦжЭѮЩтђщЭШєиіѯчшѲаюѴёѻѸѰўїуѸѶѷіџѸцїҍ҅҄ѭѤѯ҄ѸҌѺѶѰѦѧҜѣѤ", (byte)9, 67);
               b[1] = NLoginCore_324.A("ĄÆçăçÏÐĂĊÓĈéîāÎĐôïÒéěçäå", (byte)9, 65);
               b[2] = NLoginCore_091.B("åØúċýËäÑÈÜëýéàÕČíûæĉýčäå", (byte)9, 66);
               b[3] = NLoginCore_433.D("лчодЋыЪкцЩєпдѓїЩїЭћЩИќУФ", (byte)9, 68);
               b[4] = NLoginCore_453.A("¼ôÂÊÌýúýÝĐÞĐÖăęĎĄĎĄþìçäå", (byte)9, 65);
               b[5] = NLoginCore_076.A("âÂċÈÞìÛĉÍßâĖĊêèñéćêĈç÷äå", (byte)9, 65);
               b[6] = NLoginCore_232.B("àĀËÌÞäíòâþðÏĊöĈāÌĈùĝþçäå", (byte)9, 66);
               b[7] = NLoginCore_183.A("āćýÝčþĈæĒĆĆÙ", (byte)9, 65);
               break;
            case 2:
               b[0] = NLoginCore_223.E("ԐԪԳԴӺԺӼԍԢԶԇԍ", (byte)9, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_530.D("ІвФЈнНЉрЌьПИ", (byte)9, 68);
         }
      }
   }
}
