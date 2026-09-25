package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_352 extends NLoginCore_564 {
   private static int aq = (-1 >>> 175 | -1 << -175) & -1;
   private static int ao = (256 >>> 7 | 256 << -7) & -1;
   private static long n;
   private static long bo = Long.reverse(367455956913910535L);
   private static long br = Long.reverse(367455956913910535L);
   private static String[] ZKM_STR_B = new String[NLoginCore_352.bw];
   private static int bn = (-1 >>> 182 | -1 << -182) & -1;
   private static int af = (128 >>> 199 | 128 << -199) & -1;
   private static long ay = Long.reverse(6629298651489370112L);
   private static long o = Long.reverse(367455956913910535L);
   private static int ah = -1 >>> 174 | -1 << -174;
   private static int bc = Integer.reverse(-1);
   private static long am = Long.reverse(367455956913910535L);
   private static long as = Long.reverse(367455956913910535L);
   private static String[] ZKM_STR_A = new String[NLoginCore_352.bu];
   private static int z = (16 >>> 36 | 16 << -36) & -1;
   private static int az = Integer.reverse(536870912);
   private static int bw = (16777216 >>> 181 | 16777216 << -181) & -1;
   private static long be = Long.reverse(367455956913910535L);
   private static int bu = 256 >>> 5 | 256 << -5;
   private static int bf = Integer.reverse(-1610612736);
   private static int aw = (-2147483647 >>> 31 | -2147483647 << -31) & -1;
   private static long bk = Long.reverse(6629298651489370112L);
   private static long ax = Long.reverse(6420293856099857159L);
   private static long bh = Long.reverse(6420293856099857159L);
   private static int d = (0 >>> 45 | 0 << -45) & -1;
   private static int bp = Integer.reverse(-536870912);
   private static int bl = Integer.reverse(1610612736);

   @Override
   protected void a(File var1) {
      NLoginCore_219 var2 = new NLoginCore_219(var1);
      if (var2.p(a(af & ah, am)) && var2.p(a(ao & aq, as)) && var2.p(a(aw, ax ^ ay))) {
         boolean var3 = var2.d(a(az & bc, be));
         if (var3) {
            String var4 = var2.b(a(bf, bh ^ bk));
            String var5 = var2.b(a(bl & bn, bo));
            this.a(var4, a(bp, br) + var5, null, null);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -6967988587294133751L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(65 + 3),
                     (byte)(67 + 2),
                     (byte)(26 + 57),
                     (byte)(46 + 1),
                     (byte)(22 + 45),
                     (byte)(26 + 40),
                     (byte)(18 + 49),
                     (byte)(7 + 40),
                     (byte)(12 + 68),
                     (byte)(44 + 31),
                     (byte)(63 + 4),
                     (byte)(63 + 20),
                     (byte)(2 + 51),
                     80,
                     (byte)(84 + 13),
                     (byte)(18 + 82),
                     (byte)(6 + 94),
                     105,
                     (byte)(17 + 93),
                     (byte)(19 + 84)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_241.A("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒҫҗѺҍңҌҫҨҏүҠ", (byte)42, 65));
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
      n = -2247808107639039846L;
      long var0 = n ^ -6967988587294133751L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(22 + 46),
               (byte)(59 + 10),
               (byte)(21 + 62),
               (byte)(34 + 13),
               (byte)(27 + 40),
               (byte)(50 + 16),
               (byte)(59 + 8),
               (byte)(33 + 14),
               (byte)(47 + 33),
               (byte)(3 + 72),
               67,
               (byte)(4 + 79),
               (byte)(39 + 14),
               (byte)(52 + 28),
               (byte)(25 + 72),
               (byte)(5 + 95),
               (byte)(52 + 48),
               105,
               (byte)(42 + 68),
               (byte)(62 + 41)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(38 + 31), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.A("ēĹĢþüęĵŃĸĸĭĤċĸńňģĽĿıĎğĜĝ", (byte)37, 65);
               ZKM_STR_B[1] = NLoginCore_141.D("ҐҚѵѷѿѮҗѝҘҥѿѬ", (byte)37, 68);
               ZKM_STR_B[2] = NLoginCore_427.A("ĒĢĻęĝıŉûĹĆćđ", (byte)37, 65);
               ZKM_STR_B[3] = NLoginCore_004.B("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 66);
               ZKM_STR_B[4] = NLoginCore_004.A("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 65);
               ZKM_STR_B[5] = NLoginCore_183.A("ĵĿĚĜĤēļĂĽŊĤđ", (byte)37, 65);
               ZKM_STR_B[6] = NLoginCore_384.E("ԪԺՓԱԵՉաԓՑԞԟԩ", (byte)37, 69);
               ZKM_STR_B[7] = NLoginCore_141.C("҆ҟѝқљѼҔѠќќҙѬ", (byte)37, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.A("ēĹĢþüęĵŃĸĸĴŋŎĥĻĠĠąĆŕčįĜĝ", (byte)37, 65);
               ZKM_STR_B[1] = NLoginCore_092.E("ԭՋԘԮԝԱՔՙԮ՜՚ԩ", (byte)37, 69);
               ZKM_STR_B[2] = NLoginCore_127.A("ĿĿŅĥįıŁĕĄīþĊğĩĸņıīİĎĵŕĜĝ", (byte)37, 65);
               ZKM_STR_B[3] = NLoginCore_427.A("ĸûČĜĻąķğĕĉĻłňĦĈĨįēĊģĠŕĜĝ", (byte)37, 65);
               ZKM_STR_B[4] = NLoginCore_076.D("ғіѧѷҖѠҒѺѰѤҕҕҙҜѣҪѷҙ҉қҬҠѷѸ", (byte)37, 68);
               ZKM_STR_B[5] = NLoginCore_127.D("їѳѷџ҉ҎҟѸўѽѷѬ", (byte)37, 68);
               ZKM_STR_B[6] = NLoginCore_004.C("ѸѰқҌѮѹѻґѵ҂ңҥҜҪң҆ң҈ѽҰѾҠѷѸ", (byte)37, 67);
               ZKM_STR_B[7] = NLoginCore_427.F("ԩՈԶՏՏԴԽԜԴՐԬԩ", (byte)37, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.F("ԪԴԴՔԕՉՐԻՂԞԠ՜ՃԤԢե՜ՆԻՖԮԹէժԱ՟ՀՠգելԶ", (byte)37, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.C("ѳѻќҀѝҡѢѝҁґґѬ", (byte)37, 67);
         }
      }
   }

   static {
      b();
   }

   public NLoginCore_352(NLoginType_008 var1) {
      super(var1, NLoginCore_479.x, a(d, o), (z != 0));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_352.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_352.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.C("ҖңҢѥҥҡҜҥҰҟѬҪҮҧҪҰѲࠋ߷ߚ߭ࠃ߬ࠋࠈ߯ࠏࠀ҉", (byte)42, 67) + var1 + NLoginCore_241.D("ѭ", (byte)42, 68) + var2.toString(), var4
         );
      }
   }
}
