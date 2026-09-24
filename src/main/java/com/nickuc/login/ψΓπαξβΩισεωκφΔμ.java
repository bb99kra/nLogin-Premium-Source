package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.geysermc.api.Geyser;

public class ψΓπαξβΩισεωκφΔμ implements αεθζδβΨξςρπΩζθδ {
   private static int m = Integer.reverse(0);
   private static int a = (512 >>> 105 | 512 << -105) & -1;
   private static int o = 1024 >>> 9 | 1024 << -9;
   private static String[] b = new String[o];
   private static long e = Long.reverse(7349874591868649472L);
   private static int k = Integer.reverse(0);
   private static String[] a = new String[ψΓπαξβΩισεωκφΔμ.n];
   private static int c = 0 >>> 119 | 0 << ~119 + 1;
   private static long c;
   private static int n = Integer.reverse(1073741824);
   private static int l = 0 >>> 246 | 0 << -246;
   private static int b = Integer.reverse(0);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(7349874591868649472L);
   private static int g = (0 >>> 163 | 0 << -163) & -1;
   private static long d = Long.reverse(-1949611926973728091L);
   private static long i = Long.reverse(-1949611926973728091L);
   private static int f = (134217728 >>> 219 | 134217728 << ~219 + 1) & -1;

   @Override
   public boolean a(UUID var1) {
      try {
         return (boolean)(var1 != null && Geyser.api().connectionByUuid(var1) != null ? a : b);
      } catch (Throwable var3) {
         if (var3.getCause() instanceof ClassNotFoundException) {
            String var10000 = c<"㺀">(c, d ^ e);
            Object[] var10001 = new Object[f];
            var10001[g] = var3.getMessage();
            ψΓωτιμωκχψΛΨ.c(var10000, var10001);
         } else {
            ψΓωτιμωκχψΛΨ.b(c<"㺃">(h, i ^ j), var3);
         }

         return (boolean)l;
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψΓπαξβΩισεωκφΔμ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.B("©ËÍ\u00adÑðèþê¹÷íûõ¾ãąĄüĂüÑ", (byte)1, 66), ψΓπαξβΩισεωκφΔμ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΠΛΨοδΩσμνΛγΦφβς.D("ЛШЧϪЪЦСЪеФϱЯгЬЯеϷޑݝދݽދހݸމޔއޜގޛݪޓВ", (byte)1, 68) + var1 + οοθδΨιοΦΠβδζ.A("»", (byte)1, 65) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 102L;
      var1 ^= 472306534428645310L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(30 + 38),
                     (byte)(62 + 7),
                     (byte)(30 + 53),
                     (byte)(43 + 4),
                     67,
                     (byte)(62 + 4),
                     (byte)(5 + 62),
                     (byte)(17 + 30),
                     (byte)(72 + 8),
                     (byte)(24 + 51),
                     (byte)(49 + 18),
                     (byte)(49 + 34),
                     (byte)(5 + 48),
                     (byte)(77 + 3),
                     (byte)(87 + 10),
                     (byte)(69 + 31),
                     (byte)(48 + 52),
                     (byte)(20 + 85),
                     (byte)(109 + 1),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ιΠοθΩΦξκ.C("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғ࠭߹ࠧ࠙ࠧࠜࠔࠥ࠰ࠣ࠸ࠪ࠷ࠆ\u082f", (byte)53, 67));
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

   @Override
   public boolean J() {
      return (boolean)m;
   }

   private static void b() {
      c = -6530857914856796377L;
      long var0 = c ^ 472306534428645310L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(59 + 9),
               69,
               (byte)(28 + 55),
               (byte)(39 + 8),
               (byte)(15 + 52),
               (byte)(52 + 14),
               (byte)(56 + 11),
               (byte)(23 + 24),
               (byte)(29 + 51),
               (byte)(27 + 48),
               (byte)(53 + 14),
               83,
               (byte)(37 + 16),
               (byte)(19 + 61),
               (byte)(4 + 93),
               (byte)(47 + 53),
               (byte)(71 + 29),
               (byte)(23 + 82),
               (byte)(15 + 95),
               (byte)(65 + 38)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               b[0] = βεξΠθρρςΔΦμ.E(
                  "՟եԨՍի\u0530ԸըԲՏժ՛ՊրկղՑՙ\u0557՝՞Հ՜Ձռ՜սՊդրջբՋւ՞\u058cձՓՐճ\u0590ծ\u0590ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճ֝խձֱֱִֵ֦֦֧֛֚֨֘֘֏ׅ֬֗֡\u05c9֖֠׃֤֜֞օ֊\u05ceֻ\u05cb֣\u05cf֞\u0590֏֖֓\u05cc֭֔\u05c8ךֲ֫\u05ceכהּ׆זםח֮֯",
                  (byte)63,
                  69
               );
               b[1] = ΦδφπθΩΩλζξ.D(
                  "ӖӜҟӄӢҧүӟҩӆӡӒӁӷӦөӈӐӎӔӕҷӓҸӳӓӴӁӛӷӲәӂӹӕԃӨӊӇӪԇӥԇӳԑԁԄӲӹԚԑӹԎԝԊӯԁӡӗԖӦԨӡӪӡԔԜӾӨԛӼӨԴԪԴӿԊԪԊԦԳԪԚԍԊԷԵӾԤԑՅՀӾԢԟԞԚՂԤԸՊԜԾՄՈՉԢԭԥԬԮԲԬՐՈԫՌԱ՜ԜԱԤԵՃՈՓ՞Ջ",
                  (byte)63,
                  68
               );
               break;
            case 1:
               b[0] = χΠξΦιζΨΣωΦσΨζ.E(
                  "՟եԨՍի\u0530ԸըԲՏժ՛ՊրկղՑՙ\u0557՝՞Հ՜Ձռ՜սՊդրջբՋւ՞\u058cձՓՐճ\u0590ծ\u0590ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճ֝խձֱֱִֵ֦֦֧֛֚֨֘֘֏ׅ֬֗֡\u05c9֖֠׃֤֜֞օ֊\u05ceֻ\u05cb֣\u05cf֞\u0590֏֖֓\u05cc֭֔\u05c9ֺ֯־ֲֶ֢֫ג֠כׁ֮֯",
                  (byte)63,
                  69
               );
               b[1] = φδχεθοκψαλΛογλ.F(
                  "՟եԨՍի\u0530ԸըԲՏժ՛ՊրկղՑՙ\u0557՝՞Հ՜Ձռ՜սՊդրջբՋւ՞\u058cձՓՐճ\u0590ծ\u0590ռ֚֊֍ջւ֣֚ւ֦֗֓ո֊ժՠ֟կֱժճժ֥֝ևձ֤օձֳֽֽֈֳֳּ֣֖֓֓֯֓׀־և֭֚\u05ce\u05c9և֧֣֫֨\u05cbׁ֭דׇ֥\u05cdבגֵֵֶַֻ֮֫יבִוֻ֦עַ֥֨֬ן\u05cb֫ױ",
                  (byte)63,
                  70
               );
               break;
            case 2:
               b[0] = ιΠοθΩΦξκ.D("ӧӃӤӇҡҺҭӣӜӢӏҭҰӍӦӏӧӲӧҴҵӾӅӆ", (byte)63, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ντθΔζβΔζ.B("ŒŷİŅĳĭŇįŰňŮŅ", (byte)63, 66);
         }
      }
   }
}
