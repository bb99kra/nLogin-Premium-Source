package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_147 {
   private static int i = Integer.reverse(1073741824);
   private static int aa = (7168 >>> 42 | 7168 << -42) & -1;
   private static long g = Long.reverse(-4353473760353724618L);
   private static long h = Long.reverse(6629298651489370112L);
   private static long p = Long.reverse(-6947547145719130314L);
   private static int b = -1 >>> 235 | -1 << -235;
   private static long s = Long.reverse(6629298651489370112L);
   private static int a = (0 >>> 161 | 0 << -161) & -1;
   private final String ay;
   private static int u = 4194304 >>> 214 | 4194304 << ~214 + 1;
   private static int l = (196608 >>> 16 | 196608 << -16) & -1;
   private static int t = (33554432 >>> 249 | 33554432 << -249) & -1;
   private static long j = Long.reverse(-4353473760353724618L);
   private static int v = Integer.reverse(1610612736);
   private static int e = Integer.reverse(-65536);
   private static long m = Long.reverse(-4353473760353724618L);
   private static int ab = (7168 >>> 106 | 7168 << -106) & -1;
   private static String[] ZKM_STR_A = new String[aa];
   private static int y = (8 >>> 67 | 8 << ~67 + 1) & -1;
   private final String az;
   private static int w = (-1 >>> 14 | -1 << -14) & -1;
   private final String ax;
   private final String aw;
   private static int f = (16384 >>> 110 | 16384 << ~110 + 1) & -1;
   private static String[] ZKM_STR_B = new String[ab];
   private final Properties b;
   private static long k = Long.reverse(6629298651489370112L);
   private static int z = 0 >>> 170 | 0 << -170;
   private static long x = Long.reverse(-6947547145719130314L);
   private static int o = (1024 >>> 200 | 1024 << ~200 + 1) & -1;
   private static long d = Long.reverse(-6947547145719130314L);
   private static int q = 83886080 >>> 152 | 83886080 << ~152 + 1;
   private static long n = Long.reverse(6629298651489370112L);
   private static long r = Long.reverse(-4353473760353724618L);
   private final int G;
   private static long c;

   private static void b() {
      c = 7848512995458722243L;
      long var0 = c ^ -1602145472984800573L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(66 + 3),
               (byte)(36 + 47),
               (byte)(14 + 33),
               (byte)(54 + 13),
               66,
               (byte)(23 + 44),
               (byte)(21 + 26),
               (byte)(34 + 46),
               (byte)(33 + 42),
               (byte)(51 + 16),
               (byte)(53 + 30),
               (byte)(12 + 41),
               (byte)(60 + 20),
               (byte)(30 + 67),
               (byte)(84 + 16),
               100,
               (byte)(69 + 36),
               (byte)(30 + 80),
               (byte)(19 + 84)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_241.A("ĊĹĜłČĩłĬĩŀŏŌİŃŇĹĬŉęĭĸĸřŚšĶĿĶĳřġĹĹŅŅĬśŪĮňŮľĭĻ", (byte)42, 65);
               ZKM_STR_B[1] = NLoginCore_127.C("ҞѧѮҡѩѮүҟѲҳ҉҈ҫңҥҋһѴҼҹҠҙ҆҇", (byte)42, 67);
               ZKM_STR_B[2] = NLoginCore_110.B("ĿĻĞįņĿĨğňĽŉĳŋĢĸŕŕļŖļŕŉřęĸįĥįģĹřľŇĵŝřŦŭůňŀŌłŪŕīİŖůŎŔŧŀŉņŇ", (byte)42, 66);
               ZKM_STR_B[3] = NLoginCore_453.E("ՖԳԻՖԛԬՅԴՇ՝ՇՖՠ՞\u0558՟ՂԹՒԻԾԽհՏՃդՐՖՅիծՑՈղԼջխձտցդհեՎ", (byte)42, 69);
               ZKM_STR_B[4] = NLoginCore_559.B("ĿŌŊĨĜŌŌđņŃĐņĩĪĦģĪŝňŞĮłĢŚŌĴņšĸţĪŤĶūŪťĿĮĪŀĦŔŠĻ", (byte)42, 66);
               ZKM_STR_B[5] = NLoginCore_433.D("ҤҀҀҬ҃҂ҊұҞѱѱѻ", (byte)42, 68);
               ZKM_STR_B[6] = NLoginCore_138.F("ՑԚԡՔԜԡբՒԥզԼԻ՞Ֆ\u0558ԾծԧկլՓՌԹԺ", (byte)42, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.B("ĊĹĜłČĩłĬĩŀŏŌİŃŇĹĬŉęĭĸĸřŚšĶĿĶĳřġĹŀŠŎįĿūŁţĴīŤĻ", (byte)42, 66);
               ZKM_STR_B[1] = NLoginCore_110.A("ľćĎŁĉĎŏĿĒœĦĖŉńŌĨĭĭĹħĬşĮłĹĥĻŨŦĻķł", (byte)42, 65);
               ZKM_STR_B[2] = NLoginCore_183.A("ĿĻĞįņĿĨğňĽŉĳŋĢĸŕŕļŖļŕŉřęĸįĥįģĹřľŇĵŝřŦŭůňŀŌŃĳŵŒŪŪŒŞŜļŝřņŇ", (byte)42, 65);
               ZKM_STR_B[3] = NLoginCore_397.C("ңҀ҈ңѨѹҒҁҔҪҔңҭҫҥҬҏ҆ҟ҈ҋҊҽҜҐұҝңҒҸһҞҪ҄ҤӈӇҧҮӏҎүҦқ", (byte)42, 67);
               ZKM_STR_B[4] = NLoginCore_232.A("ĿŌŊĨĜŌŌđņŃĐņĩĪĦģĪŝňŞĮłĢŚŌĴņšĸţĪŤŉšĺşĺťĤœĭőłĻ", (byte)42, 65);
               ZKM_STR_B[5] = NLoginCore_397.D("ҥѹѨѹҎҏҢҏңҮҬѻ", (byte)42, 68);
               ZKM_STR_B[6] = NLoginCore_173.A("ľćĎŁĉĎŏĿĒœĩĵŃęđĩŏĖķěěŢĽŜľŤĝŦũťņœ", (byte)42, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.D("ѹ҅ҫ҉ѫґҚѱѮұѱҒҁ҅ҖҪѻҞѶѱ҈ѼҶҷҭҤѾӈҁҙҚӅ", (byte)42, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.D("҄ѻҠѦҬѪҠ҉ҲҦҳҴҌѶғҒүѳҋӀҞҴҚҔқҲҝҵҧӀҔһ", (byte)42, 68);
         }
      }
   }

   public static NLoginCore_147 a(String var0, String var1, String var2, String var3, Properties var4, int var5) {
      String[] var6 = var0.split(a(q, r ^ s));

      int var7;
      try {
         var7 = var6.length > t ? Integer.parseInt(var6[u]) : var5;
      } catch (NumberFormatException var9) {
         throw new IllegalArgumentException(a(v & w, x) + var6[y]);
      }

      return a(var6.length > 0 ? var6[z] : var0, var7, var1, var2, var3, var4);
   }

   @Generated
   public String y() {
      return this.ax;
   }

   @Generated
   public String j() {
      return this.az;
   }

   @Generated
   public String z() {
      return this.ay;
   }

   @Generated
   public Properties a() {
      return this.b;
   }

   public static NLoginCore_147 a(String var0, int var1, String var2, String var3, String var4, Properties var5) {
      return new NLoginCore_147(var0, var1, var2, var3, var4, var5);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_147.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.B("ÿġģăħņľŔŀďōŃőŋĔĹśŚŒŘŒħ", (byte)44, 66), NLoginCore_147.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_575.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸߞ߾ߴࠊࠐࠖࠉࠅࠌࠗࠖࠊ࠘ґ", (byte)44, 67) + var1 + NLoginCore_471.F("Ԣ", (byte)44, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public int j() {
      return this.G;
   }

   @Generated
   public String x() {
      return this.aw;
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -1602145472984800573L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(35 + 33),
                     (byte)(32 + 37),
                     83,
                     (byte)(5 + 42),
                     (byte)(40 + 27),
                     (byte)(15 + 51),
                     (byte)(5 + 62),
                     (byte)(43 + 4),
                     (byte)(42 + 38),
                     (byte)(23 + 52),
                     (byte)(7 + 60),
                     (byte)(60 + 23),
                     (byte)(27 + 26),
                     (byte)(69 + 11),
                     (byte)(65 + 32),
                     (byte)(54 + 46),
                     (byte)(95 + 5),
                     (byte)(31 + 74),
                     110,
                     (byte)(82 + 21)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.E("Քաՠԣգ՟՚գծ՝Ԫըլեըծ\u0530\u0896ࢶࢬࣂࣈ࣎ࣁࢽࣄ࣏࣎ࣂ࣐", (byte)53, 69));
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

   private NLoginCore_147(String var1, int var2, String var3, String var4, String var5, Properties var6) {
      if (var1 == null || var1.isEmpty()) {
         throw new IllegalArgumentException(a(a & b, d));
      } else if (var2 <= 0 || var2 > e) {
         throw new IllegalArgumentException(a(f, g ^ h) + var2);
      } else if (var3 == null || var3.isEmpty()) {
         throw new IllegalArgumentException(a(i, j ^ k));
      } else if (var4 == null) {
         throw new IllegalArgumentException(a(l, m ^ n));
      } else if (var5 == null) {
         throw new IllegalArgumentException(a(o, p));
      } else {
         this.aw = var1;
         this.G = var2;
         this.ax = var3;
         this.ay = var4;
         this.az = var5;
         this.b = var6;
      }
   }

   static {
      b();
   }
}
