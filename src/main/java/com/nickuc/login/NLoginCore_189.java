package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_189 {
   private static int ai = 5 >>> 63 | 5 << -63;
   private static long f = Long.reverse(2707130259706826224L);
   private static int w = Integer.reverse(-536870912);
   private static int ab = (268435456 >>> 249 | 268435456 << -249) & -1;
   private static long ah = Long.reverse(2161727821137838080L);
   private static long aa = Long.reverse(456833887201394688L);
   private static long d = Long.reverse(2161727821137838080L);
   private static long s = Long.reverse(2161727821137838080L);
   private String bL;
   private static int n = (1073741824 >>> 252 | 1073741824 << ~252 + 1) & -1;
   private static int y = (0 >>> 2 | 0 << -2) & -1;
   private static long l = Long.reverse(2707130259706826224L);
   private static long x = Long.reverse(4292397328541240816L);
   private static long b = Long.reverse(2707130259706826224L);
   private static long i = Long.reverse(2707130259706826224L);
   private String bM;
   private static long ad = Long.reverse(1711367858400788480L);
   private String bN;
   private static long j = Long.reverse(2161727821137838080L);
   private String bK;
   private static int a = Integer.reverse(0);
   private static int t = Integer.reverse(1610612736);
   private String bJ;
   private static long m = Long.reverse(2161727821137838080L);
   private static long o = Long.reverse(2707130259706826224L);
   private static String[] b = new String[NLoginCore_189.aj];
   private final Locale a;
   private static int e = (2 >>> 65 | 2 << -65) & -1;
   private static int h = 512 >>> 104 | 512 << ~104 + 1;
   private String bP;
   private String bI;
   private static long c;
   private static int aj = 20480 >>> 75 | 20480 << ~75 + 1;
   private static int af = (147456 >>> 174 | 147456 << -174) & -1;
   private static long v = Long.reverse(4292397328541240816L);
   private static String[] a = new String[ai];
   private final long w;
   private static long g = Long.reverse(2161727821137838080L);
   private static int u = (-1 >>> 244 | -1 << ~244 + 1) & -1;
   private static int k = (805306368 >>> 124 | 805306368 << ~124 + 1) & -1;
   private String bO;
   private static int q = Integer.reverse(-1610612736);
   private static long p = Long.reverse(2161727821137838080L);
   private static long ag = Long.reverse(2707130259706826224L);
   private static double ae = Double.longBitsToDouble(Long.reverse(192770L));
   private static long ac = Long.reverse(4292397328541240816L);
   private static int z = (0 >>> 243 | 0 << ~243 + 1) & -1;
   private static long r = Long.reverse(2707130259706826224L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_189.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.D("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 68), NLoginCore_189.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_453.F("չֆօՈֈքտֈ֓ւՏ֍֑֊֍֓Օࢺࣲࣣࣦࣩࣹࣶ࣫࣫ࣨ࣠ࣥࣟծ", (byte)90, 70) + var1 + NLoginCore_241.F("Ր", (byte)90, 70) + var2.toString(), var4
         );
      }
   }

   private void aC() {
      if (this.bI == null) {
         this.bI = this.x(a(a, b ^ d));
         this.bJ = this.x(a(e, f ^ g));
         this.bK = this.x(a(h, i ^ j));
         this.bL = this.x(a(k, l ^ m));
         this.bM = this.x(a(n, o ^ p));
         this.bN = this.x(a(q, r ^ s));
         this.bO = this.x(a(t & u, v));
         this.bP = this.x(a(w, x));
      }
   }

   private String x(String var1) {
      return new SimpleDateFormat(var1, this.a).format(new Date(this.w));
   }

   public String aj() {
      this.aC();
      return this.bJ;
   }

   public NLoginCore_189(long var1, Locale var3) {
      this.w = var1;
      this.a = var3;
   }

   public String ap() {
      this.aC();
      return this.bP;
   }

   public String an() {
      this.aC();
      return this.bN;
   }

   public NLoginCore_189() {
      this(Locale.getDefault());
   }

   public String ak() {
      this.aC();
      return this.bK;
   }

   public String ao() {
      this.aC();
      return this.bO;
   }

   public NLoginCore_189(long var1) {
      this(var1, Locale.getDefault());
   }

   public NLoginCore_189(Locale var1) {
      this(System.currentTimeMillis(), var1);
   }

   public static String a(long var0, long var2) {
      return a(var0, var2, (boolean)y);
   }

   private static void b() {
      c = 1131126207817288100L;
      long var0 = c ^ 6509695702090928939L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(51 + 18),
               (byte)(45 + 38),
               (byte)(43 + 4),
               (byte)(40 + 27),
               66,
               67,
               (byte)(25 + 22),
               (byte)(9 + 71),
               (byte)(47 + 28),
               (byte)(15 + 52),
               (byte)(70 + 13),
               (byte)(9 + 44),
               (byte)(74 + 6),
               (byte)(23 + 74),
               (byte)(72 + 28),
               (byte)(16 + 84),
               (byte)(2 + 103),
               (byte)(33 + 77),
               (byte)(97 + 6)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_433.A("žƀŞţžťƓŶƚŽƈű", (byte)85, 65);
               b[1] = NLoginCore_127.E("ՃշՋՅջը՛Տ՟ֈՓՙ", (byte)85, 69);
               b[2] = NLoginCore_173.A("ŘŷƗƏƣƣƨƣƟŵƌű", (byte)85, 65);
               b[3] = NLoginCore_521.E("՛պՌՠ\u0557Ջ՝ղէևվՙ", (byte)85, 69);
               b[4] = NLoginCore_324.D("ԫԋӷӬԦԲԬԟԞԟԭӼ", (byte)85, 68);
               b[5] = NLoginCore_384.D("ԛԤԬԊӰԌӽԯԍԦӿӼ", (byte)85, 68);
               b[6] = NLoginCore_201.A("ƣƚŞƄŢźŵżżšūű", (byte)85, 65);
               b[7] = NLoginCore_183.F("ճռպՅտ֎գ֊բՠհՙ", (byte)85, 70);
               b[8] = NLoginCore_004.D("ԙӫԚԋԩԓԟԌԍԦԱӼ", (byte)85, 68);
               b[9] = NLoginCore_127.F("դՋռէրհ֏՟ի֒հՙ", (byte)85, 70);
               break;
            case 1:
               b[0] = NLoginCore_141.D("ԎԌԮӬԁԡԋӾԮԳӶӼ", (byte)85, 68);
               b[1] = NLoginCore_183.E("ՠդՄՠՖ՛ՆձՄՑ՜ՙ", (byte)85, 69);
               b[2] = NLoginCore_453.C("ԚԖӦԍԜԥԪӽӽԵԓӼ", (byte)85, 67);
               b[3] = NLoginCore_092.B("ƠƀƟŵŶƂŦƀƈūƌű", (byte)85, 66);
               b[4] = NLoginCore_091.F("օեՂր՟փէծՋՅըՙ", (byte)85, 70);
               b[5] = NLoginCore_004.B("ƏŲƁƜŸƙŠƟƉƄƆƈƄŸƣƯƮƟƉƍƔſżŽ", (byte)85, 66);
               b[6] = NLoginCore_451.B("źşƗŴŻƄƛťŻŨƄƋƯżƀƬŲƬƞƌžƵżŽ", (byte)85, 66);
               b[7] = NLoginCore_324.C("ӟӫӷԢԪԠԥԤԐӭӭԹԇԅԧԧԦԺԯԵӷԊԇԈ", (byte)85, 67);
               b[8] = NLoginCore_201.D("ӧԇԣԤԙԑ\u0530ԔӱԌԭӼ", (byte)85, 68);
               b[9] = NLoginCore_091.A("ƐūŽţƒƤźžŧƔƞű", (byte)85, 65);
               break;
            case 2:
               b[0] = NLoginCore_241.A("ſūśťŮšƕŤžŽŧƫƁƉƀưƑƍŽƢƗƥżŽ", (byte)85, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.B("ƓŝƁƓſƕƚƀƤƚƦƂƉƙƍŬŬƇƆƊƷųƠƈųƒƯƽƟƼƔŽ", (byte)85, 66);
         }
      }
   }

   public static String b(long var0) {
      return a(var0, System.currentTimeMillis());
   }

   private static String a(int var0, long var1) {
      var1 ^= 120L;
      var1 ^= 6509695702090928939L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(58 + 10),
                     (byte)(41 + 28),
                     83,
                     (byte)(7 + 40),
                     (byte)(17 + 50),
                     66,
                     (byte)(8 + 59),
                     (byte)(42 + 5),
                     (byte)(53 + 27),
                     (byte)(52 + 23),
                     (byte)(39 + 28),
                     (byte)(29 + 54),
                     (byte)(24 + 29),
                     (byte)(59 + 21),
                     (byte)(16 + 81),
                     (byte)(56 + 44),
                     (byte)(22 + 78),
                     (byte)(7 + 98),
                     (byte)(56 + 54),
                     (byte)(83 + 20)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.F("Վ՛՚ԝ՝ՙՔ՝ը\u0557Ԥբզ՟բըԪ\u088fࣀࣀࢽࢵࢺࢴࢸࢻࢾࣇ࣎࣋", (byte)47, 70));
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

   public static String a(long var0, long var2, boolean var4) {
      long var5 = Math.max(var0, var2) - Math.min(var0, var2);
      StringBuilder var7 = new StringBuilder();
      NLoginCore_026[] var8 = NLoginCore_026.values();
      int var9 = var8.length;

      for (int var10 = z; var10 < var9; var10++) {
         NLoginCore_026 var11 = var8[var10];
         if (!var4 || var11 != NLoginCore_026.d || var5 < aa) {
            long var12 = (Long)NLoginCore_026.a(var11).apply(var5);
            if (var12 > 0L) {
               if (var7.length() > 0) {
                  var7.append(a(ab, ac));
               }

               var7.append(var12).append(NLoginCore_026.a(var11));
            }
         }
      }

      if (var7.length() == 0) {
         double var14 = var5 % ad / ae;
         return var14 + a(af, ag ^ ah);
      } else {
         return var7.toString();
      }
   }

   public String al() {
      this.aC();
      return this.bL;
   }

   public String am() {
      this.aC();
      return this.bM;
   }

   public String ai() {
      this.aC();
      return this.bI;
   }

   static {
      b();
   }
}
