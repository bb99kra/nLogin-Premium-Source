package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_556 {
   a(a(NLoginCore_556.n, NLoginCore_556.o)),
   b(a(NLoginCore_556.t & NLoginCore_556.u, NLoginCore_556.v)),
   c(a(NLoginCore_556.z, NLoginCore_556.aa ^ NLoginCore_556.ab)),
   d(a(NLoginCore_556.ag, NLoginCore_556.ah)),
   e(a(NLoginCore_556.al, NLoginCore_556.am ^ NLoginCore_556.an));

   private final String bC;
   private static String[] ZKM_STR_A = new String[NLoginCore_556.h];
   private static String[] ZKM_STR_B = new String[NLoginCore_556.i];
   private static long c;
   private static int a = (0 >>> 144 | 0 << ~144 + 1) & -1;
   private static int b = (1073741825 >>> 222 | 1073741825 << -222) & -1;
   private static int c = (0 >>> 139 | 0 << ~139 + 1) & -1;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int e = 1073741824 >>> 253 | 1073741824 << ~253 + 1;
   private static int f = Integer.reverse(-1073741824);
   private static int g = 536870912 >>> 123 | 536870912 << ~123 + 1;
   private static int h = 327680 >>> 239 | 327680 << -239;
   private static int i = (40 >>> 194 | 40 << -194) & -1;
   private static int j = (0 >>> 222 | 0 << ~222 + 1) & -1;
   private static long k = Long.reverse(7138119635336514272L);
   private static long l = Long.reverse(-5620492334958379008L);
   private static int m = Integer.reverse(0);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(-3382289094200964384L);
   private static int p = Integer.reverse(1073741824);
   private static long q = Long.reverse(7138119635336514272L);
   private static long r = Long.reverse(-5620492334958379008L);
   private static int s = (2048 >>> 11 | 2048 << -11) & -1;
   private static int t = Integer.reverse(-1073741824);
   private static int u = Integer.reverse(-1);
   private static long v = Long.reverse(-3382289094200964384L);
   private static int w = Integer.reverse(536870912);
   private static long x = Long.reverse(-3382289094200964384L);
   private static int y = Integer.reverse(1073741824);
   private static int z = Integer.reverse(-1610612736);
   private static long aa = Long.reverse(7138119635336514272L);
   private static long ab = Long.reverse(-5620492334958379008L);
   private static int ac = Integer.reverse(1610612736);
   private static int ad = Integer.reverse(-1);
   private static long ae = Long.reverse(-3382289094200964384L);
   private static int af = Integer.reverse(-1073741824);
   private static int ag = 7340032 >>> 84 | 7340032 << -84;
   private static long ah = Long.reverse(-3382289094200964384L);
   private static int ai = 8192 >>> 170 | 8192 << ~170 + 1;
   private static long aj = Long.reverse(-3382289094200964384L);
   private static int ak = 1024 >>> 232 | 1024 << ~232 + 1;
   private static int al = 18432 >>> 203 | 18432 << -203;
   private static long am = Long.reverse(7138119635336514272L);
   private static long an = Long.reverse(-5620492334958379008L);

   @Generated
   private NLoginCore_556(String var3) {
      this.bC = var3;
   }

   @Nullable
   public static NLoginCore_556 a(String var0) {
      NLoginCore_556[] var1 = values();
      int var2 = var1.length;

      for (int var3 = a; var3 < var2; var3++) {
         NLoginCore_556 var4 = var1[var3];
         if (var4.bC.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_556.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.A("ųƕƗŷƛƺƲǈƴƃǁƷǅƿƈƭǏǎǆǌǆƛ", (byte)102, 65), NLoginCore_556.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.F("օ֑֒Ք֔\u0590\u058b֔֟֎՛֖֙֝֙֟ա࣭ࣷࣵࣻࣝ࣬\u08e2࣭ࣷն", (byte)102, 70) + var1 + NLoginCore_223.C("ԡ", (byte)102, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   public String af() {
      return this.bC;
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 77L;
      var1 ^= 4045632527767543620L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(38 + 30),
                     (byte)(64 + 5),
                     (byte)(15 + 68),
                     (byte)(40 + 7),
                     (byte)(6 + 61),
                     (byte)(46 + 20),
                     67,
                     (byte)(37 + 10),
                     (byte)(18 + 62),
                     (byte)(38 + 37),
                     67,
                     (byte)(75 + 8),
                     (byte)(16 + 37),
                     (byte)(30 + 50),
                     (byte)(3 + 94),
                     (byte)(53 + 47),
                     (byte)(9 + 91),
                     (byte)(9 + 96),
                     (byte)(72 + 38),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.C("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢞\u0894࢜ࢢࢄ\u0893ࢉ࢞\u0894", (byte)92, 67));
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
      c = 527658055745007814L;
      long var0 = c ^ 4045632527767543620L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(57 + 11),
               (byte)(33 + 36),
               (byte)(17 + 66),
               (byte)(17 + 30),
               (byte)(43 + 24),
               (byte)(23 + 43),
               (byte)(27 + 40),
               (byte)(35 + 12),
               (byte)(10 + 70),
               (byte)(44 + 31),
               (byte)(17 + 50),
               83,
               (byte)(32 + 21),
               (byte)(75 + 5),
               97,
               (byte)(28 + 72),
               (byte)(56 + 44),
               (byte)(97 + 8),
               (byte)(76 + 34),
               (byte)(74 + 29)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.A("ŤĿŔşĹŇŋĺłĵĺĳ", (byte)54, 65);
               ZKM_STR_B[1] = NLoginCore_446.A("ĜŒŒĶŤĹŘńňĿľĳ", (byte)54, 65);
               ZKM_STR_B[2] = NLoginCore_027.E("գէԼԬէԹԯՒ՟ՇճԺ", (byte)54, 69);
               ZKM_STR_B[3] = NLoginCore_232.D("ӐҟӑқҡӑҤҰӅҦҺҟ", (byte)54, 68);
               ZKM_STR_B[4] = NLoginCore_387.E("ՠԾբՙԦձՆԲՂԼԴԺ", (byte)54, 69);
               ZKM_STR_B[5] = NLoginCore_110.F("ԹԵլՃԭծ\u0530՟ՇՌիԺ", (byte)54, 70);
               ZKM_STR_B[6] = NLoginCore_232.E("Ը՚՞ԠգՇաՅԯՊԭՒժխ՚եՐ՛չպՍվՅՆ", (byte)54, 69);
               ZKM_STR_B[7] = NLoginCore_027.B("ķşŦŐĳţũĿĬŁŠĳ", (byte)54, 66);
               ZKM_STR_B[8] = NLoginCore_446.C("ҨҊӈӑӈҦңҧӁҒӘҟ", (byte)54, 67);
               ZKM_STR_B[9] = NLoginCore_559.C("ӑҠҽүӇҐҒҍҰҕӈҟ", (byte)54, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_453.C("ҮұҮҌҏҎӗҷӂӒӕӕҽӇӈҕҵұӓӡәӣҪҫ", (byte)54, 67);
               ZKM_STR_B[1] = NLoginCore_183.C("ҽҼҏҿӌҋҦ҉ӊҒҙҟ", (byte)54, 67);
               ZKM_STR_B[2] = NLoginCore_223.B("ĿĹšŢĵŊŞŃĬĵĬŇīİŝİŇŵŭŌĸŁľĿ", (byte)54, 66);
               ZKM_STR_B[3] = NLoginCore_241.F("\u0558ԨԩՠՆՈԣՉԻՠԽԺ", (byte)54, 70);
               ZKM_STR_B[4] = NLoginCore_173.B("ŞĸŁőŨšŠĵĵĦĽĸŅŰĩŤŧĴņŴňŧľĿ", (byte)54, 66);
               ZKM_STR_B[5] = NLoginCore_110.A("ŠĝĻŗŘŧşŔĞĽņĳ", (byte)54, 65);
               ZKM_STR_B[6] = NLoginCore_446.F("Ը՚՞ԠգՇաՅԯՊԯԳՐ\u0530ԵԶՙԺԽ՛պծՅՆ", (byte)54, 70);
               ZKM_STR_B[7] = NLoginCore_559.C("ҸҝҢӄҢҟҟӏҰҩӈҟ", (byte)54, 67);
               ZKM_STR_B[8] = NLoginCore_433.A("ŗġģĞŃřŪŃŦŜĽřļŀĺİŨĮňŎŹŁľĿ", (byte)54, 65);
               ZKM_STR_B[9] = NLoginCore_201.D("ӁҡҝӅҧүҶҏҒҨӄҟ", (byte)54, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_076.F("ՠԤժզ՚ԻՙԮՁըՍԺ", (byte)54, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.A("ĻŤŃĶğĳģşŇřļĥĨŒŎőŝũĲŕŤŧľĿ", (byte)54, 65);
         }
      }
   }
}
