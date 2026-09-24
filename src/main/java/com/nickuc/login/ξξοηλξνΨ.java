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

public enum ξξοηλξνΨ {
   a(ΣλνΨουΩΔοθεβ.f),
   b(ΣλνΨουΩΔοθεβ.g),
   c(ΣλνΨουΩΔοθεβ.h),
   d(ΣλνΨουΩΔοθεβ.i),
   e(ΣλνΨουΩΔοθεβ.j),
   f(ΣλνΨουΩΔοθεβ.k),
   g(ΣλνΨουΩΔοθεβ.l),
   h(ΣλνΨουΩΔοθεβ.m),
   i(ΣλνΨουΩΔοθεβ.n),
   j(ΣλνΨουΩΔοθεβ.o),
   k(ΣλνΨουΩΔοθεβ.p),
   l(ΣλνΨουΩΔοθεβ.q);

   private final ΣλνΨουΩΔοθεβ a;
   private static String[] a = new String[ξξοηλξνΨ.t];
   private static String[] b = new String[ξξοηλξνΨ.u];
   private static long c;
   private static int a = 0 >>> 105 | 0 << ~105 + 1;
   private static int b = 0 >>> 203 | 0 << ~203 + 1;
   private static long d = Long.reverse(-2788354012379512943L);
   private static long e = Long.reverse(8358680908399640576L);
   private static int f = Integer.reverse(0);
   private static int g = 6144 >>> 9 | 6144 << -9;
   private static int h = 0 >>> 46 | 0 << ~46 + 1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int j = 256 >>> 135 | 256 << -135;
   private static int k = Integer.reverse(-1073741824);
   private static int l = (16 >>> 34 | 16 << -34) & -1;
   private static int m = Integer.reverse(-1610612736);
   private static int n = (3072 >>> 137 | 3072 << ~137 + 1) & -1;
   private static int o = Integer.reverse(-536870912);
   private static int p = Integer.reverse(268435456);
   private static int q = (36 >>> 66 | 36 << ~66 + 1) & -1;
   private static int r = Integer.reverse(1342177280);
   private static int s = 2816 >>> 200 | 2816 << ~200 + 1;
   private static int t = 3328 >>> 8 | 3328 << -8;
   private static int u = Integer.reverse(-1342177280);
   private static int v = 16 >>> 4 | 16 << ~4 + 1;
   private static long w = Long.reverse(-2788354012379512943L);
   private static long x = Long.reverse(8358680908399640576L);
   private static int y = Integer.reverse(0);
   private static int z = 268435456 >>> 219 | 268435456 << ~219 + 1;
   private static long aa = Long.reverse(-2788354012379512943L);
   private static long ab = Long.reverse(8358680908399640576L);
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = 24576 >>> 77 | 24576 << -77;
   private static long ae = Long.reverse(-5958888150048342127L);
   private static int af = Integer.reverse(1073741824);
   private static int ag = 8 >>> 97 | 8 << ~97 + 1;
   private static long ah = Long.reverse(-2788354012379512943L);
   private static long ai = Long.reverse(8358680908399640576L);
   private static int aj = 6144 >>> 139 | 6144 << -139;
   private static int ak = 5 >>> 0 | 5 << -0;
   private static long al = Long.reverse(-2788354012379512943L);
   private static long am = Long.reverse(8358680908399640576L);
   private static int an = 1 >>> 62 | 1 << ~62 + 1;
   private static int ao = Integer.reverse(1610612736);
   private static long ap = Long.reverse(-2788354012379512943L);
   private static long aq = Long.reverse(8358680908399640576L);
   private static int ar = Integer.reverse(-1610612736);
   private static int as = 7 >>> 96 | 7 << -96;
   private static long at = Long.reverse(-2788354012379512943L);
   private static long au = Long.reverse(8358680908399640576L);
   private static int av = 100663296 >>> 88 | 100663296 << ~88 + 1;
   private static int aw = Integer.reverse(268435456);
   private static long ax = Long.reverse(-2788354012379512943L);
   private static long ay = Long.reverse(8358680908399640576L);
   private static int az = Integer.reverse(-536870912);
   private static int ba = 1207959552 >>> 59 | 1207959552 << -59;
   private static int bb = Integer.reverse(-1);
   private static long bc = Long.reverse(-5958888150048342127L);
   private static int bd = Integer.reverse(268435456);
   private static int be = (10 >>> 0 | 10 << -0) & -1;
   private static int bf = Integer.reverse(-1);
   private static long bg = Long.reverse(-5958888150048342127L);
   private static int bh = 18 >>> 193 | 18 << ~193 + 1;
   private static int bi = Integer.reverse(-805306368);
   private static int bj = -1 >>> 169 | -1 << -169;
   private static long bk = Long.reverse(-5958888150048342127L);
   private static int bl = 1280 >>> 135 | 1280 << -135;
   private static int bm = Integer.reverse(805306368);
   private static long bn = Long.reverse(-2788354012379512943L);
   private static long bo = Long.reverse(8358680908399640576L);
   private static int bp = Integer.reverse(-805306368);

   public static String a(String var0, ξξοηλξνΨ... var1) {
      if (var0 == null) {
         throw new IllegalArgumentException(c<"㺀">(b, d ^ e));
      } else {
         String[] var2 = new String[var1.length];

         for (int var3 = f; var3 < var2.length; var3++) {
            var2[var3] = var1[var3].getName();
         }

         return String.format(var0, var2);
      }
   }

   @Generated
   private ξξοηλξνΨ(ΣλνΨουΩΔοθεβ var3) {
      this.a = var3;
   }

   public String getName() {
      return this.a.a(new Object[a]);
   }

   private static void b() {
      c = -8503174288958573925L;
      long var0 = c ^ 5010285145015539190L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(44 + 25),
               (byte)(51 + 32),
               47,
               67,
               (byte)(64 + 2),
               (byte)(31 + 36),
               (byte)(18 + 29),
               (byte)(51 + 29),
               (byte)(35 + 40),
               (byte)(51 + 16),
               (byte)(65 + 18),
               (byte)(36 + 17),
               (byte)(51 + 29),
               (byte)(10 + 87),
               (byte)(65 + 35),
               (byte)(48 + 52),
               (byte)(8 + 97),
               (byte)(72 + 38),
               (byte)(101 + 2)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = χφπρψπφΦθμπ.D("цбЈчфЏШсДиЏЧёЛнМчЭыОРбѦцРпђћѕѝћѮ", (byte)11, 68);
               b[1] = ζβησεθωυγτ.D("УЋЫЋЊЏЦхђРйО", (byte)11, 68);
               b[2] = ΣερμΔσατσκ.A("éâÝĒĂëĊďĊñĉíÒåĆõØïēáóđèé", (byte)11, 65);
               b[3] = μεςΩΔΣγν.C("СФНБЯѐЌЩЎхЙтЭѝјћпъЪјнмЩЪ", (byte)11, 67);
               b[4] = θεωψξβΛσσ.D("ѐмЪаЅБяѐЉСУЪБЭДйЕєСбРђЩЪ", (byte)11, 68);
               b[5] = βθκςνθΩθυμςτκχ.B("Ĉ÷ÂĄÎïćĒċéîè×ĕĊëòĞÚġĂđèé", (byte)11, 66);
               b[6] = ςΦζσμτΓσ.F("ԗԹԎԼӽԄԠԳԴՇԨՅԿԟԆԯՌԋԧԴԎԝԚԛ", (byte)11, 70);
               b[7] = χφπρψπφΦθμπ.E("\u0530ԛԽӽԄՄԓӹԴԅԖԏ", (byte)11, 69);
               b[8] = ζβησεθωυγτ.E("ԍԼԮԹԹԟԁԻԕԛՈԢԚՂԠԠՎԽԢՆՔՓԚԛ", (byte)11, 69);
               b[9] = ΨφιωσρΓδΔθ.A("ăĈÏëêçîĂàĀØúĎěĆØ÷ćÜđěđèé", (byte)11, 65);
               b[10] = πψυκΠΨμΛΩβΣφμφσ.D("шЌЉЧѓбРВивХО", (byte)11, 68);
               b[11] = ιΠοθΩΦξκ.B("ĆëüáìËĂÍĊäèÝ", (byte)11, 66);
               b[12] = οΩνΩρωλΨηΛδωδ.D("кЉшѐъЫЏѕѓЏфщШЗЯЕнѕзэьђЩЪ", (byte)11, 68);
               break;
            case 1:
               b[0] = οΩνΩρωλΨηΛδωδ.D("цбЈчфЏШсДиЏЧёЛнМчЭыОРбнњкѦѓсѓіѩЫчЧџаѫѰѥцѡтѫо", (byte)11, 68);
               b[1] = ζοηκορΦνΣθγΩ.D("КтЛщЛдѓЍТЭбО", (byte)11, 68);
               b[2] = χφπρψπφΦθμπ.E("ԛԔԏՄԴԝԼՁԼԣԸԬԽԞԎՐԍՆՒՒԼՓԚԛ", (byte)11, 69);
               b[3] = δΛψπξκσβγςα.E("ԒԕԎԂԠՁӽԚӿԶԀՋԛԹՃԯԻՆԨԋԊԝԚԛ", (byte)11, 69);
               b[4] = ΦδφπθΩΩλζξ.B("ďûéïÄÐĎďÈàâąēè÷Ûďï÷þĊġèé", (byte)11, 66);
               b[5] = λΣΩσμφγχ.B("Ĉ÷ÂĄÎïćĒċéïďĚõõÜĔė÷đġġèé", (byte)11, 66);
               b[6] = ΣδτΠνεγοΓορητ.B("åćÜĊËÒîāĂĕôĉèðĖċíĊĝëāûèé", (byte)11, 66);
               b[7] = ζβησεθωυγτ.C("ЭШЋКЯШцЭпіцЩЍКцЮШўмыкѢЩЪ", (byte)11, 67);
               b[8] = λΣΩσμφγχ.A("ÛĊüććíÏĉãéĖĄúĕĎĕĒċõáßđèé", (byte)11, 65);
               b[9] = ΠΛΨοδΩσμνΛγΦφβς.B("ăĈÏëêçîĂàĀÎăÐùÚåûéßßĚĒÞòõđĘāĦĥĨĠ", (byte)11, 66);
               b[10] = βθκςνθΩθυμςτκχ.B("îúçĎãëąóČÓ÷øøíĕĕĒòøĊĚġèé", (byte)11, 66);
               b[11] = λΣΩσμφγχ.C("ЫФЧнЏдЏХЪЖкхЗбЗКјылрїђЩЪ", (byte)11, 67);
               b[12] = ΠΛΨοδΩσμνΛγΦφβς.D("кЉшѐъЫЏѕѓЏхЌвЬыўљїёўйЬЩЪ", (byte)11, 68);
               break;
            case 2:
               b[0] = ςΦζσμτΓσ.B("ßĎíûÐþāÿĈąĘĊÒúďÙÿĖÿďüøøğāöþéóĆăĢ", (byte)11, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΨΦνΨΦωυΩνβςμ.B("ÄøêÍßäüþç×ÒñĘčċîĔØÒÝØ÷ìñõĨüēÜæĜċ", (byte)11, 66);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 5010285145015539190L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(59 + 10),
                     (byte)(78 + 5),
                     (byte)(31 + 16),
                     (byte)(49 + 18),
                     (byte)(60 + 6),
                     (byte)(48 + 19),
                     47,
                     (byte)(49 + 31),
                     (byte)(22 + 53),
                     (byte)(49 + 18),
                     (byte)(42 + 41),
                     (byte)(16 + 37),
                     (byte)(56 + 24),
                     (byte)(29 + 68),
                     100,
                     (byte)(90 + 10),
                     (byte)(23 + 82),
                     (byte)(39 + 71),
                     (byte)(19 + 84)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨΦνΨΦωυΩνβςμ.D("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠝࠞࠠ࠙ࠞࠢࠢࠎ", (byte)51, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ξξοηλξνΨ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.C("ХчщЩэѬѤѺѦеѳѩѷѱкџҁҀѸѾѸэ", (byte)24, 67), ξξοηλξνΨ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φδχεθοκψαλΛογλ.A("ĒğĞáġĝĘġĬěèĦĪģĦĬîѾѿҁѺѿ҃҃ѯĂ", (byte)24, 65) + var1 + θεωψξβΛσσ.E("Ԏ", (byte)24, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
