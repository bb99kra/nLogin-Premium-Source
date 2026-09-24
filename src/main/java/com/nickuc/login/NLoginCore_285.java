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

public class NLoginCore_285 {
   private static long h = Long.reverse(-6629298651489370112L);
   private final long r;
   private static String[] a = new String[NLoginCore_285.n];
   private static int i = Integer.reverse(-1073741824);
   private static long k = Long.reverse(-4336315595795333368L);
   private final Throwable a;
   private static int a = Integer.reverse(0);
   private static String[] b = new String[NLoginCore_285.o];
   private static int c = (4194304 >>> 118 | 4194304 << -118) & -1;
   private static long c;
   private static int o = Integer.reverse(-1610612736);
   private static long b = Long.reverse(-4336315595795333368L);
   private static long d = Long.reverse(7481129826424848136L);
   private final int X;
   private static int f = Integer.reverse(1073741824);
   private static long g = Long.reverse(7481129826424848136L);
   private static int n = 655360 >>> 17 | 655360 << ~17 + 1;
   private static int l = Integer.reverse(536870912);
   private final boolean W;
   private static long m = Long.reverse(-4336315595795333368L);
   private static int j = (-1 >>> 168 | -1 << ~168 + 1) & -1;
   private static long e = Long.reverse(-6629298651489370112L);

   @Generated
   @Override
   public String toString() {
      return a(a, b) + this.af() + a(c, d ^ e) + this.p() + a(f, g ^ h) + this.f() + a(i & j, k) + this.a() + a(l, m);
   }

   @Generated
   public int p() {
      return this.X;
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_285.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.D("нџѡсѥ҄ѼҒѾэҋҁҏ҉ђѷҙҘҐҖҐѥ", (byte)32, 68), NLoginCore_285.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.C("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒєߘ߇߬ߩߨ߫߇ߴߥߕߖߌߣѭ", (byte)32, 67) + var1 + NLoginCore_091.E("Ԗ", (byte)32, 69) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= 9101914001231995433L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(27 + 41),
                     (byte)(38 + 31),
                     (byte)(68 + 15),
                     (byte)(37 + 10),
                     (byte)(42 + 25),
                     (byte)(10 + 56),
                     (byte)(41 + 26),
                     (byte)(25 + 22),
                     (byte)(79 + 1),
                     (byte)(7 + 68),
                     (byte)(14 + 53),
                     (byte)(11 + 72),
                     (byte)(8 + 45),
                     (byte)(4 + 76),
                     (byte)(59 + 38),
                     (byte)(36 + 64),
                     (byte)(31 + 69),
                     105,
                     110,
                     (byte)(46 + 57)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.C("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ\u088fࡾࢣࢠ࢟ࢢࡾࢫ࢜ࢌࢍࢃ࢚", (byte)93, 67));
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
   public long f() {
      return this.r;
   }

   private static void b() {
      c = 1224844395853007846L;
      long var0 = c ^ 9101914001231995433L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(64 + 4),
               (byte)(44 + 25),
               (byte)(56 + 27),
               (byte)(37 + 10),
               (byte)(60 + 7),
               (byte)(33 + 33),
               67,
               (byte)(28 + 19),
               (byte)(8 + 72),
               (byte)(18 + 57),
               (byte)(29 + 38),
               83,
               (byte)(19 + 34),
               (byte)(21 + 59),
               (byte)(18 + 79),
               (byte)(39 + 61),
               (byte)(61 + 39),
               (byte)(104 + 1),
               (byte)(57 + 53),
               (byte)(96 + 7)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_138.F("ԕԹԫԥՌԲԯԮ՜ՔՒԶԷՕԺՖԱԿՈԣԨԤՂՃ՜ճմԼՏԵՊն", (byte)36, 70);
               b[1] = NLoginCore_387.D("ҋқѤҏ҆ѽҖѶѴҋѵѡҏҖҙ҃ҫѺҌѽ҂ҭѴѵ", (byte)36, 68);
               b[2] = NLoginCore_324.D("ѳіѤ҇҆ѿҠҏҙѴҡѿҒҔѥѺҜҝѨҋҧ҂ѬѬғґҳҧҵҏҵҢ", (byte)36, 68);
               b[3] = NLoginCore_138.B("ĬĒęĜÿüēĔĝĩĹŌĬĘĶĥĪĥĐđĿĭĚě", (byte)36, 66);
               b[4] = NLoginCore_173.C("҃њҌҕѩ҈ѶѲѽғѴѩ", (byte)36, 67);
               break;
            case 1:
               b[0] = NLoginCore_433.B("üĠĒČĳęĖĕŃĻĹĝĞļġĽĘĦįĊďċĴŊħĦĒĥņőĞĨĞŊłńŢŠŚŠŒĩĶį", (byte)36, 66);
               b[1] = NLoginCore_387.E("Պ՚ԣՎՅԼՕԵԳՊԵԠԴԴ՛ԡՒՅ՚՞Կ՚դծհէԲՈբՆՃՌ", (byte)36, 69);
               b[2] = NLoginCore_553.F("ԲԕԣՆՅԾ՟Վ\u0558ԳՠԾՑՓԤԹ՛՜ԧՊզԽՋԩզԨթ\u0530Ԯլմթ", (byte)36, 70);
               b[3] = NLoginCore_127.E("ՅԫԲԵԘԕԬԭԶՂՔՃԟՐՃ՝ՑիԢԽ՞Խ՝եԿ՛եժԱՋյՒ", (byte)36, 69);
               b[4] = NLoginCore_453.C("ѐѻѥѦїҊѫҖңҖ҄ѩ", (byte)36, 67);
               break;
            case 2:
               b[0] = NLoginCore_110.F("\u0558ԖԪԙՑԺԭԽԓԽԳՍ՞\u0558\u0558ՖՇԾԢՀՄՄթՌՎԺ՟ղԫ՞թՠ", (byte)36, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_138.A("ĨēĭĖģįĎįăĖĴňĦĹņĦĘęŁŎōĝĚě", (byte)36, 65);
         }
      }
   }

   public NLoginCore_285(boolean var1, int var2, long var3) {
      this(var1, var2, var3, null);
   }

   @Generated
   public Throwable a() {
      return this.a;
   }

   @Generated
   public boolean af() {
      return this.W;
   }

   @Generated
   public NLoginCore_285(boolean var1, int var2, long var3, Throwable var5) {
      this.W = var1;
      this.X = var2;
      this.r = var3;
      this.a = var5;
   }
}
