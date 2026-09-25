package com.nickuc.login;

import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.ChannelRegistrar;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_390 extends NLoginCore_483<NLoginCore_455> {
   private static long x = Long.reverse(-4738291147680419599L);
   private static int o = Integer.reverse(-1);
   private static String[] ZKM_STR_A = new String[NLoginCore_390.ap];
   private static int u = -1 >>> 151 | -1 << ~151 + 1;
   private static long j = Long.reverse(4611686018427387904L);
   private static long am = Long.reverse(4611686018427387904L);
   private static long f;
   private static String[] ZKM_STR_B = new String[NLoginCore_390.aq];
   private static int ae = Integer.reverse(1073741824);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static long y = Long.reverse(4611686018427387904L);
   private static int ak = Integer.reverse(1610612736);
   private static int aa = 0 >>> 15 | 0 << ~15 + 1;
   private static int an = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(-4738291147680419599L);
   private static int n = 4 >>> 2 | 4 << ~2 + 1;
   private static int b = 0 >>> 145 | 0 << ~145 + 1;
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = -1610612736 >>> 253 | -1610612736 << ~253 + 1;
   private static long p = Long.reverse(-126605129253031695L);
   private static int ab = (0 >>> 25 | 0 << ~25 + 1) & -1;
   private static int ap = Integer.reverse(-536870912);
   private static long aj = Long.reverse(4611686018427387904L);
   private static int w = 768 >>> 168 | 768 << ~168 + 1;
   private static int aq = Integer.reverse(-536870912);
   private static long al = Long.reverse(-4738291147680419599L);
   private static int ac = Integer.reverse(536870912);
   private static long ad = Long.reverse(-126605129253031695L);
   private static int af = Integer.reverse(0);
   private static int q = (4096 >>> 43 | 4096 << -43) & -1;
   private static int r = 0 >>> 27 | 0 << ~27 + 1;
   private static int t = 1048576 >>> 19 | 1048576 << -19;
   private static int z = 134217728 >>> 59 | 134217728 << ~59 + 1;
   private static long ai = Long.reverse(-4738291147680419599L);
   private static int ao = Integer.reverse(0);
   private static long v = Long.reverse(-126605129253031695L);

   public NLoginCore_390(NLoginCore_455 var1) {
      super(var1);
   }

   @Override
   public void b(Object var1) {
      this.a(var1, null);
   }

   @Override
   public void c(Object var1) {
      Object var2;
      if (var1 instanceof String) {
         String var3 = (String)var1;
         String[] var4 = var3.split(a(ac, ad));
         var2 = var4.length == ae ? MinecraftChannelIdentifier.create(var4[af], var4[ag]) : new LegacyChannelIdentifier(var3);
      } else {
         if (!(var1 instanceof ChannelIdentifier)) {
            throw new IllegalArgumentException(a(ah, ai ^ aj) + var1 + a(ak, al ^ am) + var1.getClass().getCanonicalName());
         }

         var2 = (ChannelIdentifier)var1;
      }

      ChannelRegistrar var10000 = this.h.a().getChannelRegistrar();
      ChannelIdentifier[] var10001 = new ChannelIdentifier[an];
      var10001[ao] = (ChannelIdentifier)var2;
      var10000.unregister(var10001);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_390.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.D("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 68), NLoginCore_390.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.A("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԃԚӨԒԈԑԒԍԏӯƖ", (byte)97, 65) + var1 + NLoginCore_446.D("Ԓ", (byte)97, 68) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      f = -8138422193124246403L;
      long var0 = f ^ 2363048601338260596L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(35 + 33),
               (byte)(56 + 13),
               (byte)(81 + 2),
               (byte)(29 + 18),
               (byte)(65 + 2),
               (byte)(57 + 9),
               (byte)(21 + 46),
               (byte)(3 + 44),
               80,
               (byte)(74 + 1),
               (byte)(25 + 42),
               (byte)(48 + 35),
               (byte)(51 + 2),
               (byte)(45 + 35),
               (byte)(44 + 53),
               100,
               (byte)(33 + 67),
               (byte)(56 + 49),
               (byte)(32 + 78),
               (byte)(12 + 91)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.C("ҊҞҶҒӌӖӑӕҰӕӊҸҜӞҜӎһҠӠҞҡӛӗҶӌӠӋӛӨӄӋӂ", (byte)55, 67);
               ZKM_STR_B[1] = NLoginCore_387.B("ŘőĵĸţĥŖĶĩūŚĵ", (byte)55, 66);
               ZKM_STR_B[2] = NLoginCore_471.B("ĝıŉĥşũŤŨŃŨŚıŲŤűőłũŕŨŴūŏŜřŻŐŵĺƁŰĽŏŞźłƊŦŤťŉſŋŕ", (byte)55, 66);
               ZKM_STR_B[3] = NLoginCore_427.F("ԫըՏեՈ՟լհԽծԭԻ", (byte)55, 70);
               ZKM_STR_B[4] = NLoginCore_451.D("ӅҾҢҥӐҒӃңҖӘӇҢ", (byte)55, 68);
               ZKM_STR_B[5] = NLoginCore_232.C("ҊҞҶҒӌӖӑӕҰӕӇҞӟӑӞҾүӖӂӕӡӘҼӉӆӨҽӢҧӮӝҪҼӋӧүӷӓӑӒҶӬҸӂ", (byte)55, 67);
               ZKM_STR_B[6] = NLoginCore_324.F("ԫըՏեՈ՟լհԽծԭԻ", (byte)55, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_127.A("ĝıŉĥşũŤŨŃŨŝŋįűįšŎĳųıĴűŇĹŧŐŞŀļŏŶł", (byte)55, 65);
               ZKM_STR_B[1] = NLoginCore_004.C("ӍҏҠӔғҤҺһүҰұҢ", (byte)55, 67);
               ZKM_STR_B[2] = NLoginCore_521.B("ĝıŉĥşũŤŨŃŨŚıŲŤűőłũŕŨŴūŏŜřŻŐŵĺƁŰĽŞƅŠŖƂŸŖŌƁŧōƂůŉŭŨųŒŒŶƖţŠš", (byte)55, 66);
               ZKM_STR_B[3] = NLoginCore_091.E("Քգա՞՚ըՂ՟ԽիՎԻ", (byte)55, 69);
               ZKM_STR_B[4] = NLoginCore_530.D("ҠӔҪӅҗәҤҚҰӚҹҢ", (byte)55, 68);
               ZKM_STR_B[5] = NLoginCore_232.C("ҊҞҶҒӌӖӑӕҰӕӇҞӟӑӞҾүӖӂӕӡӘҼӉӆӨҽӢҧӮӝҪҮүӝҾӠӂӎӯӣҵҸӉҾӖԀӼәӯӣӚӘԆӍӎ", (byte)55, 67);
               ZKM_STR_B[6] = NLoginCore_127.C("ӈӊҒҡҤҷӈҷӘӉҭҢ", (byte)55, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_232.A("įŦšĽĩŇĤŦĬĻňőłĲŌōūŴŷŉŚĸŉŜŧũŴŮŁŶŜœ", (byte)55, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_559.B("ĞĴĽŅłĳĺĽĪŰŮŨŎņŁŁšŦťťŢŕĴűŔŉĿŹŋĿŖť", (byte)55, 66);
         }
      }
   }

   @Override
   public void a(Object var1, Object var2) {
      if (var2 != null && !(var2 instanceof NLoginInterface_029)) {
         throw new IllegalArgumentException(a(b, i ^ j) + var2.getClass().getCanonicalName());
      } else {
         Object var3;
         if (var1 instanceof String) {
            String var4 = (String)var1;
            String[] var5 = var4.split(a(n & o, p));
            var3 = var5.length == q ? MinecraftChannelIdentifier.create(var5[r], var5[s]) : new LegacyChannelIdentifier(var4);
         } else {
            if (!(var1 instanceof ChannelIdentifier)) {
               throw new IllegalArgumentException(a(t & u, v) + var1 + a(w, x ^ y) + var1.getClass().getCanonicalName());
            }

            var3 = (ChannelIdentifier)var1;
         }

         ChannelRegistrar var10000 = this.h.a().getChannelRegistrar();
         ChannelIdentifier[] var10001 = new ChannelIdentifier[z];
         var10001[aa] = (ChannelIdentifier)var3;
         var10000.register(var10001);
         if (var2 != null) {
            this.h.a((NLoginInterface_013)var2, new NLoginInterface_013[ab]);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= 2363048601338260596L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(31 + 37),
                     (byte)(44 + 25),
                     (byte)(12 + 71),
                     (byte)(31 + 16),
                     67,
                     (byte)(24 + 42),
                     (byte)(18 + 49),
                     (byte)(16 + 31),
                     (byte)(7 + 73),
                     (byte)(53 + 22),
                     (byte)(65 + 2),
                     (byte)(30 + 53),
                     53,
                     (byte)(59 + 21),
                     (byte)(20 + 77),
                     (byte)(78 + 22),
                     (byte)(24 + 76),
                     (byte)(71 + 34),
                     (byte)(84 + 26),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_521.A("ĮĻĺýĽĹĴĽňķĄłņĿłňĊҍҤѲҜҒқҜҗҙѹ", (byte)38, 65));
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
