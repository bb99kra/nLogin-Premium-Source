package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI.nLoginInternal;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.plugin.Plugin;

public class αΨμχΛΩΠωιν extends σηηκτλρχωβΓιξ {
   private static int bg = 224 >>> 101 | 224 << -101;
   private static int aa = Integer.reverse(536870912);
   private static int af = 335544320 >>> 26 | 335544320 << -26;
   private static long bj = Long.reverse(-8791026472627208192L);
   private final ΣυΓιψΠτφο a = new ΣυΓιψΠτφο(this);
   private static long h = Long.reverse(1783136753152097006L);
   private static long s = Long.reverse(1783136753152097006L);
   private static int f = 0 >>> 34 | 0 << ~34 + 1;
   private static long bi = Long.reverse(-7007889719475111186L);
   private static long e;
   private static String[] c = new String[αΨμχΛΩΠωιν.bo];
   private static long k = Long.reverse(-8791026472627208192L);
   private static int g = -1 >>> 52 | -1 << ~52 + 1;
   private static int ab = Integer.reverse(-1);
   private static long j = Long.reverse(-7007889719475111186L);
   private static long w = Long.reverse(-8791026472627208192L);
   private static long aj = Long.reverse(-8791026472627208192L);
   private static int aq = Integer.reverse(1610612736);
   private static String[] d = new String[αΨμχΛΩΠωιν.bp];
   private static long ag = Long.reverse(-7007889719475111186L);
   private static long as = Long.reverse(-7007889719475111186L);
   private static int bo = 16777216 >>> 181 | 16777216 << ~181 + 1;
   private static int q = Integer.reverse(1073741824);
   private static long v = Long.reverse(-7007889719475111186L);
   private static long au = Long.reverse(-8791026472627208192L);
   private static int u = (3 >>> 32 | 3 << -32) & -1;
   private static long ac = Long.reverse(1783136753152097006L);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int bp = 4096 >>> 41 | 4096 << ~41 + 1;

   private static String a(int var0, long var1) {
      var1 ^= 97L;
      var1 ^= 7087781155177731265L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(4 + 65),
                     (byte)(9 + 74),
                     (byte)(39 + 8),
                     (byte)(22 + 45),
                     (byte)(52 + 14),
                     (byte)(41 + 26),
                     (byte)(46 + 1),
                     (byte)(43 + 37),
                     (byte)(64 + 11),
                     (byte)(23 + 44),
                     (byte)(26 + 57),
                     (byte)(26 + 27),
                     (byte)(11 + 69),
                     97,
                     (byte)(16 + 84),
                     (byte)(91 + 9),
                     (byte)(4 + 101),
                     (byte)(41 + 69),
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(29 + 54)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χΠξΦιζΨΣωΦσΨζ.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѭѥѺ҆ћѪѢҌѽ҂", (byte)22, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  αΨμχΛΩΠωιν.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πχσδΦΦνθΔπ.F("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)46, 70), αΨμχΛΩΠωιν.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ΣφδσΔζιΠρα.D("ҢүҮѱұҭҨұҼҫѸҶҺҳҶҼѾࠁ߹ࠎࠚ߯߾߶ࠠࠑࠖҔ", (byte)46, 68) + var1 + πηγμΣΔκκ.E("Ԥ", (byte)46, 69) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   @Nonnull
   public nLoginInternal internal() {
      return this.a;
   }

   private static void b() {
      e = 8601674832332946809L;
      long var0 = e ^ 7087781155177731265L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(57 + 12),
               (byte)(4 + 79),
               (byte)(32 + 15),
               67,
               (byte)(54 + 12),
               (byte)(53 + 14),
               (byte)(16 + 31),
               (byte)(74 + 6),
               (byte)(52 + 23),
               (byte)(17 + 50),
               (byte)(35 + 48),
               (byte)(26 + 27),
               (byte)(52 + 28),
               (byte)(13 + 84),
               (byte)(17 + 83),
               (byte)(77 + 23),
               105,
               (byte)(40 + 70),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
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
               d[0] = ΨΦνΨΦωυΩνβςμ.C("ӘӾӵӂӹӜӠӾӻӘԂӪӬԌԍӮԐӏԗԐԙӘӓӬӦԎԌӚӽԔԞԅ", (byte)72, 67);
               d[1] = μζξτΩσσφυδεπλΨ.D("ӲӶӁӲӚԃӞӽӠԄԑӰӼӏԈӾԆӵӫәӚԍӬӷӝәԚӸԣԒӴӗӯԖԓӺԈԞԛӦӶԧԀӵ", (byte)72, 68);
               d[2] = πηγμΣΔκκ.E("թխԸթՑպՕմ\u0557ջֈշղջՙՉՋևք՚՝ՎռՋնտՠղ֗\u0558ռ\u058c", (byte)72, 69);
               d[3] = ΦδφπθΩΩλζξ.A("ŲšŸłŗƇƏŽƍżƒŜſƉƋŭƔƌƔōŵƙƚŷžźřŸƙƟšƣƇŢƈųƖƠžƏſżƬŷ", (byte)72, 65);
               d[4] = ΨφιωσρΓδΔθ.D("ӞӠӾԁӵӅӜӅӅԅӏӕ", (byte)72, 68);
               d[5] = ΨΦνΨΦωυΩνβςμ.B("ũŪŽūŴŇžŬŘŲňťűšŦŲŐŷũƏřŨŦŪƓƙƣżŴƤƔƢƈŨƒŷƥƀƍŨŻƀžŷ", (byte)72, 66);
               d[6] = χφπρψπφΦθμπ.D("ӧӨӻөӲӅӼӪӖӰӐӠӰԆӫӮӭԊԁӒԅԙӧԕԍԞԝӸԛӞӚӛԜӾԠԩԂԕԩԋԂԁӯӵ", (byte)72, 68);
               d[7] = βεξΠθρρςΔΦμ.D("ԁӑӞӞԀӚӵӗӖӮӹӲӝԊԐԉӣӓӰӫӪӳӠӡ", (byte)72, 68);
               break;
            case 1:
               d[0] = ΣδτΠνεγοΓορητ.D("ӘӾӵӂӹӜӠӾӻӘԂӪӬԌԍӮԐӏԗԐԙӔӻӥӗԏԜԞԞԒӴԀӯӥӱԢԥӹԣԙԬԇӯӵ", (byte)72, 68);
               d[1] = ΠΛΨοδΩσμνΛγΦφβς.E("թխԸթՑպՕմ\u0557ջֈէճՆտյսլբՐՑքգծՔՐ֑կ֚։իՎըտ֛՟ձ֡֒֕ց֓ււ֠ր֢֗և\u058b֠զխ֊շո", (byte)72, 69);
               d[2] = φδχεθοκψαλΛογλ.D("ӲӶӁӲӚԃӞӽӠԄԑԀӻԄӢӒӔԐԍӣӦӒӽӪԎԊԞԛԜӷԂӣԢӵԠӦӼԅԂӺӬԨӯӵ", (byte)72, 68);
               d[3] = ΣδτΠνεγοΓορητ.E("էՖխԷՌռքղւձևՑմվրբ։ց։Ղժ֎֏լճկՎխ֎֔Ֆ֘լՙ֊֟֠տ՛շփձ֥լ", (byte)72, 69);
               d[4] = ιΠοθΩΦξκ.A("ŚƃŝœƆƅƂŞżŊŪŗ", (byte)72, 65);
               d[5] = φδχεθοκψαλΛογλ.A("ũŪŽūŴŇžŬŘŲňťűšŦŲŐŷũƏřŨŦŪƓƙƣżŴƤƔƢƅƀťƂƔƬƫƗŦŧŭŷ", (byte)72, 65);
               d[6] = θεωψξβΛσσ.B("ũŪŽūŴŇžŬŘŲŒŢŲƈŭŰůƌƃŔƇƛũƗƏƠƟźƝŠŜŝŨŦŴƇƇţżƪƱƝŮƍƩƵƎŲơƲƆƮƕƻƂƃ", (byte)72, 66);
               d[7] = φΨαξωυθανΣφυκη.F("ոՈՕՕշՑլՎՍեըՔԻպզրՅՋՈզ֊\u0590\u0557\u0558", (byte)72, 70);
               break;
            case 2:
               d[0] = θεωψξβΛσσ.E("լՉԽննԿՠԿոՒՖ։Փՙմթ՜\u0557ՁՂՉիօծիտփակւֈե", (byte)72, 69);
            case 3:
            default:
               break;
            case 4:
               d[0] = δΛψπξκσβγςα.E("ճոնԹՑԻհՂՠ\u0557շզՒՀՂ՞Պ֍՚Ղըժ\u0557\u0558", (byte)72, 69);
         }
      }
   }

   public Optional<Location> getSpawnLocation(@Nonnull SpawnType var1) {
      throw new UnsupportedOperationException(c<"㺀">(f & g, h));
   }

   public void requestLogin(Identity var1, Object var2) {
      if (var2 == null) {
         throw new IllegalArgumentException(c<"㺀">(i, j ^ k));
      } else if (!(var2 instanceof Plugin)) {
         throw new IllegalArgumentException(c<"㺃">(q, s) + var2 + c<"㺆">(u, v ^ w) + Plugin.class + c<"㺉">(aa & ab, ac));
      } else if (var1 == null) {
         throw new IllegalArgumentException(c<"㺌">(af, ag ^ aj));
      } else if (!(var1 instanceof δΓβςζΣψΠ)) {
         throw new IllegalArgumentException(c<"㺏">(aq, as ^ au) + δΓβςζΣψΠ.class.getCanonicalName() + c<"㺒">(bg, bi ^ bj) + var1.getClass().getCanonicalName());
      } else {
         String var3 = this.b(var1);
         ΨαχΨχΣλεΠψΦ var4 = this.a.b().a(var3);
         if (var4 != null) {
            this.a.b().a().c(var4, this.a.a().b(var4));
         }
      }
   }

   public αΨμχΛΩΠωιν(ΨγημιδξΓτοθαζ var1) {
      super(var1);
   }
}
