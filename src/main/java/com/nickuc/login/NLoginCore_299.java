package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
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
import org.bukkit.plugin.PluginManager;

public class NLoginCore_299 implements NLoginInterface_030, NLoginInterface_025 {
   private static long e = Long.reverse(7205759403792793600L);
   private NLoginInterface_031 a;
   private static long b = Long.reverse(2726314876657775759L);
   private static long o = Long.reverse(2726314876657775759L);
   private static String[] ZKM_STR_B = new String[NLoginCore_299.q];
   private static int p = 48 >>> 35 | 48 << ~35 + 1;
   private static int c = 524288 >>> 211 | 524288 << -211;
   private NLoginCore_033 a;
   private static int q = 24 >>> 162 | 24 << -162;
   private static long h = Long.reverse(7205759403792793600L);
   private static long l = Long.reverse(2726314876657775759L);
   private NLoginCore_563 a;
   private static int n = -1 >>> 57 | -1 << ~57 + 1;
   private final nLoginBukkit r;
   private static int i = Integer.reverse(-1073741824);
   private static int f = Integer.reverse(1073741824);
   private static int a = Integer.reverse(0);
   private static long g = Long.reverse(4743927509719757967L);
   private static long d = Long.reverse(4743927509719757967L);
   private static int m = 'ꀀ' >>> '-' | 40960 << ~45 + 1;
   private static String[] ZKM_STR_A = new String[p];
   private static long c;
   private static int k = 1073741824 >>> 124 | 1073741824 << -124;
   private NLoginCore_087 a;
   private static long j = Long.reverse(2726314876657775759L);

   @Generated
   public NLoginCore_299(nLoginBukkit var1) {
      this.r = var1;
   }

   private static void b() {
      c = -1068144133143811198L;
      long var0 = c ^ 4337087533029183391L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(54 + 14),
               (byte)(53 + 16),
               (byte)(3 + 80),
               47,
               (byte)(57 + 10),
               (byte)(43 + 23),
               (byte)(31 + 36),
               (byte)(28 + 19),
               (byte)(16 + 64),
               (byte)(22 + 53),
               (byte)(50 + 17),
               (byte)(39 + 44),
               53,
               (byte)(66 + 14),
               (byte)(41 + 56),
               (byte)(42 + 58),
               (byte)(4 + 96),
               (byte)(40 + 65),
               (byte)(44 + 66),
               (byte)(22 + 81)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.E("Վ\u0558ԕԲՉԱՒ\u0557ԗԲՌԱ\u0558ՀդըԤ՝գՔզՆԳԴ", (byte)36, 69);
               ZKM_STR_B[1] = NLoginCore_232.F("Պԓ\u0558՝ԕՒԑ՟ՒՀՄԸԻԽՃ՞Փ՜Նդ՞՜ԳԴ", (byte)36, 70);
               ZKM_STR_B[2] = NLoginCore_027.C("ѓѓѨѼѪѺѵҟҡҘҗѱѦљқҠ҄ѵҍҟѪ҇Ѵѵ", (byte)36, 67);
               ZKM_STR_B[3] = NLoginCore_232.B("òĠāĔēĕďĲăļŀăļġŋķŌįċōŐŃĚě", (byte)36, 66);
               ZKM_STR_B[4] = NLoginCore_091.D("ѭҙѧҏҌқѬҊҌҏіѰҐѾѻқҢѤҔҥѪҭѴѵ", (byte)36, 68);
               ZKM_STR_B[5] = NLoginCore_110.D("ѭҙѧҏҌқѬҊҌҏіѰҐѾѻқҢѤҔҥѪҭѴѵ", (byte)36, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.D("ҏҙіѳҊѲғҘјѳ҅Ғ҇ѱ҈ҟѷѢҝѪҌҭѴѵ", (byte)36, 68);
               ZKM_STR_B[1] = NLoginCore_092.E("Պԓ\u0558՝ԕՒԑ՟ՒՀՌ՜ԸՖաԚդԺՅՆԸ՜ԳԴ", (byte)36, 69);
               ZKM_STR_B[2] = NLoginCore_553.C("ѓѓѨѼѪѺѵҟҡҘҙңҒҤґѥѻѝҜѷҪѷѴѵ", (byte)36, 67);
               ZKM_STR_B[3] = NLoginCore_397.B("òĠāĔēĕďĲăļŃĚōĦĪĨĽīőĿľŐĲĶĤōŔŊņśĵę", (byte)36, 66);
               ZKM_STR_B[4] = NLoginCore_453.A("ēĿčĵĲŁĒİĲĵĉķōąĦŉŋōőŀĽœĚě", (byte)36, 65);
               ZKM_STR_B[5] = NLoginCore_138.B("ēĿčĵĲŁĒİĲĵĀĴŉĝĀĪĩęĲŇİĭĚě", (byte)36, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.B("ĚįŁĮńĿĦĚĂģĪĕĖŀĤĮŇğĚŌīœĚě", (byte)36, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.A("ûāŃĒĺĴĸľąĘĈŁħĕŊāĎňĽċģĝĚě", (byte)36, 65);
         }
      }
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      this.k();
   }

   @Override
   public void l() {
      if (this.a != null) {
         NLoginCore_120 var1 = this.r.a();
         var1.c(a(m & n, o));
      }

      this.a = null;
   }

   @Generated
   @Override
   public NLoginCore_087 a() {
      return this.a;
   }

   static {
      b();
   }

   @Override
   public void k() {
      NLoginType_008 var1 = this.r.a();
      PluginManager var2 = this.r.a().getPluginManager();
      if (var2.getPlugin(a(a, b)) != null) {
         this.a = new NLoginCore_087();
      }

      if (var2.getPlugin(a(c, d ^ e)) != null) {
         this.a = new NLoginCore_563();
      }

      if (var2.getPlugin(a(f, g ^ h)) != null) {
         this.a = new NLoginCore_418(var1);
      } else if (var2.getPlugin(a(i, j)) != null) {
         this.a = new NLoginCore_185();
      } else {
         this.a = null;
      }

      if (this.a == null) {
         this.a = new NLoginCore_033(var1);
         NLoginCore_542 var3 = new NLoginCore_542(this.r, this.a);
         NLoginCore_120 var4 = this.r.a();
         var4.a(a(k, l), var3);
      }
   }

   @Generated
   @Override
   public NLoginInterface_031 a() {
      return this.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_299.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.F("ӼԞԠԀԤՃԻՑԽԌՊՀՎՈԑԶ\u0558\u0557ՏՕՏԤ", (byte)24, 70), NLoginCore_299.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.B("ĒğĞáġĝĘġĬěèĦĪģĦĬî҆ѤѿѽѶѿҀѼћҋĄ", (byte)24, 66) + var1 + NLoginCore_559.F("Ԏ", (byte)24, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_563 a() {
      return this.a;
   }

   @Generated
   @Override
   public NLoginCore_033 a() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= 4337087533029183391L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(40 + 29),
                     (byte)(28 + 55),
                     47,
                     (byte)(30 + 37),
                     (byte)(16 + 50),
                     (byte)(6 + 61),
                     (byte)(42 + 5),
                     (byte)(6 + 74),
                     (byte)(73 + 2),
                     (byte)(8 + 59),
                     (byte)(11 + 72),
                     (byte)(27 + 26),
                     (byte)(49 + 31),
                     (byte)(74 + 23),
                     (byte)(99 + 1),
                     (byte)(5 + 95),
                     (byte)(103 + 2),
                     (byte)(78 + 32),
                     (byte)(96 + 7)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.C("ёўѝРѠќїѠѫњЧѥѩѢѥѫЭ߅ޣ\u07be\u07bc\u07b5\u07be\u07bf\u07bbޚߊ", (byte)19, 67));
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
}
