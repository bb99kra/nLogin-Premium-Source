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

public class χβΔΦλΣρνΣςβ extends ΛδνδπΛζψηξαρΨ {
   private static int aq = (-1 >>> 175 | -1 << -175) & -1;
   private static int ao = (256 >>> 7 | 256 << -7) & -1;
   private static long n;
   private static long bo = Long.reverse(367455956913910535L);
   private static long br = Long.reverse(367455956913910535L);
   private static String[] f = new String[χβΔΦλΣρνΣςβ.bw];
   private static int bn = (-1 >>> 182 | -1 << -182) & -1;
   private static int af = (128 >>> 199 | 128 << -199) & -1;
   private static long ay = Long.reverse(6629298651489370112L);
   private static long o = Long.reverse(367455956913910535L);
   private static int ah = -1 >>> 174 | -1 << -174;
   private static int bc = Integer.reverse(-1);
   private static long am = Long.reverse(367455956913910535L);
   private static long as = Long.reverse(367455956913910535L);
   private static String[] e = new String[χβΔΦλΣρνΣςβ.bu];
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
      τφθχΔαΣγτφς var2 = new τφθχΔαΣγτφς(var1);
      if (var2.p(c<"㺀">(af & ah, am)) && var2.p(c<"㺃">(ao & aq, as)) && var2.p(c<"㺆">(aw, ax ^ ay))) {
         boolean var3 = var2.d(c<"㺉">(az & bc, be));
         if (var3) {
            String var4 = var2.b(c<"㺌">(bf, bh ^ bk));
            String var5 = var2.b(c<"㺏">(bl & bn, bo));
            this.a(var4, c<"㺒">(bp, br) + var5, null, null);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -6967988587294133751L;
      if (e[var0] == null) {
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
            throw new RuntimeException(ΣερμΔσατσκ.A("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒҫҗѺҍңҌҫҨҏүҠ", (byte)42, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
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
               f[0] = θεωψξβΛσσ.A("ēĹĢþüęĵŃĸĸĭĤċĸńňģĽĿıĎğĜĝ", (byte)37, 65);
               f[1] = ξψθρΣΠΣς.D("ҐҚѵѷѿѮҗѝҘҥѿѬ", (byte)37, 68);
               f[2] = ιΠοθΩΦξκ.A("ĒĢĻęĝıŉûĹĆćđ", (byte)37, 65);
               f[3] = χφπρψπφΦθμπ.B("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 66);
               f[4] = χφπρψπφΦθμπ.A("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 65);
               f[5] = δΛψπξκσβγςα.A("ĵĿĚĜĤēļĂĽŊĤđ", (byte)37, 65);
               f[6] = πχσδΦΦνθΔπ.E("ԪԺՓԱԵՉաԓՑԞԟԩ", (byte)37, 69);
               f[7] = ξψθρΣΠΣς.C("҆ҟѝқљѼҔѠќќҙѬ", (byte)37, 67);
               break;
            case 1:
               f[0] = ζοηκορΦνΣθγΩ.A("ēĹĢþüęĵŃĸĸĴŋŎĥĻĠĠąĆŕčįĜĝ", (byte)37, 65);
               f[1] = ζοηκορΦνΣθγΩ.E("ԭՋԘԮԝԱՔՙԮ՜՚ԩ", (byte)37, 69);
               f[2] = ΨΦνΨΦωυΩνβςμ.A("ĿĿŅĥįıŁĕĄīþĊğĩĸņıīİĎĵŕĜĝ", (byte)37, 65);
               f[3] = ιΠοθΩΦξκ.A("ĸûČĜĻąķğĕĉĻłňĦĈĨįēĊģĠŕĜĝ", (byte)37, 65);
               f[4] = ΣδτΠνεγοΓορητ.D("ғіѧѷҖѠҒѺѰѤҕҕҙҜѣҪѷҙ҉қҬҠѷѸ", (byte)37, 68);
               f[5] = ΨΦνΨΦωυΩνβςμ.D("їѳѷџ҉ҎҟѸўѽѷѬ", (byte)37, 68);
               f[6] = χφπρψπφΦθμπ.C("ѸѰқҌѮѹѻґѵ҂ңҥҜҪң҆ң҈ѽҰѾҠѷѸ", (byte)37, 67);
               f[7] = ιΠοθΩΦξκ.F("ԩՈԶՏՏԴԽԜԴՐԬԩ", (byte)37, 70);
               break;
            case 2:
               f[0] = ζοηκορΦνΣθγΩ.F("ԪԴԴՔԕՉՐԻՂԞԠ՜ՃԤԢե՜ՆԻՖԮԹէժԱ՟ՀՠգելԶ", (byte)37, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = φΨαξωυθανΣφυκη.C("ѳѻќҀѝҡѢѝҁґґѬ", (byte)37, 67);
         }
      }
   }

   static {
      b();
   }

   public χβΔΦλΣρνΣςβ(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.x, c<"㺀">(d, o), (boolean)z);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  χβΔΦλΣρνΣςβ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ιΠοθΩΦξκ.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), χβΔΦλΣρνΣςβ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.C("ҖңҢѥҥҡҜҥҰҟѬҪҮҧҪҰѲࠋ߷ߚ߭ࠃ߬ࠋࠈ߯ࠏࠀ҉", (byte)42, 67) + var1 + ΣερμΔσατσκ.D("ѭ", (byte)42, 68) + var2.toString(), var4
         );
      }
   }
}
