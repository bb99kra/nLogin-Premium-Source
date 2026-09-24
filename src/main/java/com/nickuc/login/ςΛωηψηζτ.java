package com.nickuc.login;

import java.io.File;
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

public class ςΛωηψηζτ implements ητςΛζξμΣμΨξ {
   private static int ax = 0 >>> 239 | 0 << ~239 + 1;
   private static int al = -1 >>> 164 | -1 << -164;
   private static int x = Integer.reverse(-536870912);
   private static long q = Long.reverse(-6601735690560536718L);
   private static int n = Integer.reverse(-1);
   private static int p = 80 >>> 132 | 80 << ~132 + 1;
   private static int ad = 0 >>> 173 | 0 << ~173 + 1;
   private static long i = Long.reverse(-4440007869422698638L);
   private static int h = Integer.reverse(-1);
   private static int ai = (16 >>> 36 | 16 << ~36 + 1) & -1;
   private static int k = (-1 >>> 189 | -1 << -189) & -1;
   private static int v = Integer.reverse(-1);
   private static int ak = (8 >>> 0 | 8 << -0) & -1;
   private static int aq = Integer.reverse(0);
   private static String[] b = new String[ςΛωηψηζτ.az];
   private ρρΣηκοωβ a;
   private static int at = (0 >>> 90 | 0 << ~90 + 1) & -1;
   private static int ag = Integer.reverse(-1073741824);
   private static long aw = Long.reverse(-4440007869422698638L);
   @Nullable
   private τφθχΔαΣγτφς d;
   private static int av = (-1 >>> 155 | -1 << -155) & -1;
   private static int b = (0 >>> 73 | 0 << ~73 + 1) & -1;
   private static int j = (-2147483647 >>> 223 | -2147483647 << ~223 + 1) & -1;
   private βπΓλψΩνυευες a;
   private static int ae = (65536 >>> 112 | 65536 << ~112 + 1) & -1;
   private static long w = Long.reverse(-4440007869422698638L);
   private static int ab = 176 >>> 132 | 176 << -132;
   private static long ap = Long.reverse(7349874591868649472L);
   private static int au = 1408 >>> 71 | 1408 << ~71 + 1;
   private static int aj = (2048 >>> 74 | 2048 << -74) & -1;
   private static long r = Long.reverse(7349874591868649472L);
   private static int ar = (10240 >>> 42 | 10240 << ~42 + 1) & -1;
   private static long f = Long.reverse(-4440007869422698638L);
   private static int ac = Integer.reverse(-1073741824);
   private static long d = Long.reverse(-4440007869422698638L);
   private static int t = 0 >>> 54 | 0 << ~54 + 1;
   private static int az = 196608 >>> 174 | 196608 << -174;
   private static int aa = Integer.reverse(0);
   private static String[] a = new String[ςΛωηψηζτ.ay];
   private static long z = Long.reverse(-4440007869422698638L);
   private static int a = Integer.reverse(-1879048192);
   private static int af = Integer.reverse(1073741824);
   private static int y = (-1 >>> 192 | -1 << -192) & -1;
   private static long c;
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static long am = Long.reverse(-4440007869422698638L);
   private static long as = Long.reverse(-4440007869422698638L);
   private static int m = Integer.reverse(536870912);
   private static int g = (262144 >>> 113 | 262144 << ~113 + 1) & -1;
   private static int an = Integer.reverse(-1879048192);
   private static long ao = Long.reverse(-6601735690560536718L);
   private static int ay = 201326592 >>> 152 | 201326592 << ~152 + 1;
   @Nullable
   private τφθχΔαΣγτφς c;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = Integer.reverse(0);
   private static long o = Long.reverse(-4440007869422698638L);
   private static long l = Long.reverse(-4440007869422698638L);
   private static int u = Integer.reverse(1610612736);

   private static String a(int var0, long var1) {
      var1 ^= 102L;
      var1 ^= 6599876204176493251L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(34 + 34),
                     (byte)(6 + 63),
                     (byte)(18 + 65),
                     (byte)(9 + 38),
                     (byte)(36 + 31),
                     (byte)(2 + 64),
                     (byte)(34 + 33),
                     47,
                     (byte)(18 + 62),
                     (byte)(74 + 1),
                     (byte)(64 + 3),
                     (byte)(54 + 29),
                     (byte)(7 + 46),
                     (byte)(11 + 69),
                     (byte)(8 + 89),
                     (byte)(76 + 24),
                     (byte)(18 + 82),
                     105,
                     (byte)(64 + 46),
                     (byte)(98 + 5)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(βεξΠθρρςΔΦμ.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸࠌߦࠕࠄࠖࠆࠆࠕ", (byte)44, 67));
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

   static {
      b();
   }

   @Nullable
   @Generated
   public τφθχΔαΣγτφς c() {
      return this.d;
   }

   @Generated
   public ρρΣηκοωβ a() {
      return this.a;
   }

   private static void b() {
      c = 5692401459396052517L;
      long var0 = c ^ 6599876204176493251L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(8 + 60),
               69,
               (byte)(31 + 52),
               (byte)(15 + 32),
               (byte)(37 + 30),
               (byte)(5 + 61),
               (byte)(48 + 19),
               (byte)(33 + 14),
               (byte)(62 + 18),
               (byte)(36 + 39),
               (byte)(44 + 23),
               83,
               (byte)(31 + 22),
               (byte)(5 + 75),
               (byte)(31 + 66),
               (byte)(42 + 58),
               (byte)(75 + 25),
               (byte)(9 + 96),
               (byte)(21 + 89),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(34 + 49)}, StandardCharsets.UTF_8));
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
               b[0] = βεξΠθρρςΔΦμ.A("ƄƒƫƩƎƒƕƪƲǀƲƉ", (byte)97, 65);
               b[1] = χΠξΦιζΨΣωΦσΨζ.C("ՄՎ\u0530ԯԵԕԨ\u0558ՖՑՙԠ", (byte)97, 67);
               b[2] = μεςΩΔΣγν.C("ԯԪՅՉԔԥԭՊԖԮՕԎԩՊՕԲԗԛՐՍՔդԫԬ", (byte)97, 67);
               b[3] = βεξΠθρρςΔΦμ.D("ԏՓՊՕԶԮՊՏԦԵՎԭՒՎԖԜ\u0558ՐՑՀ\u0558ԦԾԨԺ՟իԻԤ՝\u0557ԾիՍեճՇԴոՉՅշԺԺխ՚ՖհժՏգ\u0558ք՞ՋՌ", (byte)97, 68);
               b[4] = πχσδΦΦνθΔπ.D("ԉՎՂԲՏՂԨՕԢՇՑՓԏԚԖԞԝԾՖԤԲԾԫԬ", (byte)97, 68);
               b[5] = φδχεθοκψαλΛογλ.D("ԏՓՊՕԶԮՊՏԦԵՎՕՒԶԿԗԼՔԫԮԶԻԥԳՔԿԥԞ՞լԾՍԪԲՐՄՑԮեծՎ\u0530եՀ", (byte)97, 68);
               b[6] = χΠξΦιζΨΣωΦσΨζ.A("ŸƫƸƜŽƺƓƒƭŵƕƟƸǆưƇƢƚƭǅǊƽƺǑƈƤƋǈƔǔƹǄƨƪƪƶƕƘƬǎǀǛƳǣǚƳƵƶƵǖƼƶǀǈƺǲǢƩǏǮǪƴǗǡǶǐǖǅǵǹǕǔǴǞǾǉ", (byte)97, 65);
               b[7] = θεωψξβΛσσ.B("ŸƫƸƜŽƺƓƒƭŵƕŻŸƒƳƵƠƃƫƮƜƜǏƫơǄƐǖƥƱǕǍǛƱǕǘƙǊǜǔƷǐƯǎǥǢưǡǅǞǚǉǄǗǟǦǇƫǬǮǣǈǱǂ", (byte)97, 66);
               b[8] = ΠΛΨοδΩσμνΛγΦφβς.F(
                  "\u058b֓մղ֓\u0590իլՖխ֗֞֏ՠլ՜֗֕քտգէ֤սշվ֦ի֝\u0590ֱ\u058cվֆղֱօջղ֪֖֭֚֞֝ռտ֢֪֚֯֠\u05c9ֺ֥֚֙֎ֺ֢֩\u058cגִ֥֯֬טַ֩ב֩ה\u05cc׀֥", (byte)97, 70
               );
               b[9] = ντθΔζβΔζ.C("ՆՎԯԭՎՋԦԧԑԨՒՓԪ՟ԕԲՀադաՀՠ՞ԡեՙԥԶԺԭԼաԾՏՂլկԳԩԮգԺՉՒ՛ռ՝՝ԷբճդՅմՋՌ", (byte)97, 67);
               b[10] = ΣφδσΔζιΠρα.D("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԢԾՄՁԼԳԻԬիաԾ", (byte)97, 68);
               b[11] = φδχεθοκψαλΛογλ.F("ֆշչֆՌք֑պ\u0557\u058c֖չ\u058b֚դ֥ձ֏՟՟շ֬ե֦ռխֈ֚֮թ֭֓", (byte)97, 70);
               break;
            case 1:
               b[0] = ΨφιωσρΓδΔθ.B("ƢƆƝƻƔƠƌƢƗƀưƏǃƓƆơƙƁƘƄƿƗƔƕ", (byte)97, 66);
               b[1] = ΦδφπθΩΩλζξ.D("ՀՍԛԦԮՃ\u0557ԢՙԕՕԠ", (byte)97, 68);
               b[2] = ιΠοθΩΦξκ.B("ƘƓƮƲŽƎƖƳſƗƾƗƧƳƄƵƳơƼƚƍǍƔƕ", (byte)97, 66);
               b[3] = μεςΩΔΣγν.B("ŸƼƳƾƟƗƳƸƏƞƷƖƻƷſƅǁƹƺƩǁƏƧƑƣǈǔƤƍǆǀƧǔƶǎǜưƝǡƲƮǠƚƲƜǨǃǩǞǕǉǉǤǭƴƵ", (byte)97, 66);
               b[4] = ΣφδσΔζιΠρα.D("ԉՎՂԲՏՂԨՕԢՇՔԺԛՌՓՌՑԞԳԞՁդԫԬ", (byte)97, 68);
               b[5] = ντθΔζβΔζ.D("ԏՓՊՕԶԮՊՏԦԵՎՕՒԶԿԗԼՔԫԮԶԻԥԳՔԿԥԞ՞լԾՍՅԾԲգ՟ԯՖդզՌիյՖճ՜տՐնգծԽ՞ՋՌ", (byte)97, 68);
               b[6] = ΨΦνΨΦωυΩνβςμ.C("ԏՂՏԳԔՑԪԩՄԌԬԶՏ՝ՇԞԹԱՄ՜աՔՑըԟԻԢ՟ԫիՐ՛ԿՁՁՍԬԯՃե\u0557ղՊպձՊՌՍՌխՓՍ\u0557՟Ց։չՀզօցՋծոել֓ս։վ֗րհմ֘հ՚ը\u0590՛ժ֜հ՚֍ծիլ", (byte)97, 67);
               b[7] = ζβησεθωυγτ.E("Քև֔ոՙ֖կծ։Ցձ\u0557Քծ֏֑ռ՟և֊ոո֫ևս֠լֲց֍ֱַ֩֍ֱִյְָ֦֓֬\u058bׁ֪־\u058cֶֺֽ֥֡֠֨ք\u05c9ׂ֬\u05cbֹ\u05cdְ׃֪", (byte)97, 69);
               b[8] = ξψθρΣΠΣς.E(
                  "\u058b֓մղ֓\u0590իլՖխ֗֞֏ՠլ՜֗֕քտգէ֤սշվ֦ի֝\u0590ֱ\u058cվֆղֱօջղ֪֖֭֚֞֝ռտ֢֪֚֯֠\u05c9ֺ֥֚֙֎ֺ֢֩\u058cגִ֧֔֗֏הִ֚֨\u05cdדמ֥", (byte)97, 69
               );
               b[9] = ζοηκορΦνΣθγΩ.C("ՆՎԯԭՎՋԦԧԑԨՒՓԪ՟ԕԲՀադաՀՠ՞ԡեՙԥԶԺԭԼաԾՏՂլկԳԩԮգԺՇՋ՚\u0557իձմտդՂՃձջԿ՟էՓ՛՜գ֍ւ", (byte)97, 67);
               b[10] = δΛψπξκσβγςα.C("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԦՓՃ՝Ԡ՞ԿԦՎժ\u0558ծՠԩըճԿՁ\u0558Ֆ\u0557ՇՀ", (byte)97, 67);
               b[11] = ΠΛΨοδΩσμνΛγΦφβς.D("ՁԲԴՁԇԿՌԵԒՇՑԴՆՕԟՠԬՊԚԚԲԞԺ՛դԶՈԶի\u0558ՍՃՂԿՅԬՇՔԯզմ\u0530խՀ", (byte)97, 68);
               break;
            case 2:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.E("կբեՐ֕պ֍֗։՜֔֞ծ֚մ֣ն֪֟֡ւփհձ", (byte)97, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςΦζσμτΓσ.A("ƦƵƽźƎƮƍƬƵƌŽǄƦƥƄƆǂƖƘƃǇǍƔƕ", (byte)97, 65);
         }
      }
   }

   public void g(ΨγημιδξΓτοθαζ var1) {
      try {
         if (this.a != null) {
            this.a.aE();
            this.a = null;
         }
      } catch (Exception var4) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(ar, as), var4);
      }

      try {
         if (this.a != null) {
            this.a.aE();
            this.a = null;
         }
      } catch (Exception var3) {
         ψΓωτιμωκχψΛΨ.c(c<"㺃">(au & av, aw), var3);
      }

      this.c = null;
      this.d = null;
   }

   @Override
   public void a(ΨγημιδξΓτοθαζ var1, boolean var2) {
      this.g(var1);
      if (var1.a().n() == a) {
         File var3 = new File(var1.c() + File.separator + c<"㺀">(b, d), c<"㺃">(e, f));
         ςιΠδφμηωη.a(var1, this.c = new τφθχΔαΣγτφς(c<"㺆">(g & h, i), var3), c<"㺉">(j & k, l), var2);
         ςιΠδφμηωη.a(var1, this.d = new τφθχΔαΣγτφς(c<"㺌">(m & n, o), var3), c<"㺏">(p, q ^ r), var2);
         βφμυζκζξβΛγΛζΩΠ.o(var1);
         ΔυΠωθαψδΣΣαδψω var4 = var1.a();
         boolean var5 = εδδΠηδξΛΣχ.j();

         try {
            if (βφμυζκζξβΛγΛζΩΠ.a.ar()) {
               ρΣνμχγΨοΔΦ[] var10001 = new ρΣνμχγΨοΔΦ[s];
               var10001[t] = ΩψΨρεξοσΠςΛυ.k;
               if (var4.a(var10001)) {
                  (this.a = new ρρΣηκοωβ(var1, this)).aH();
               }
            }
         } catch (Throwable var8) {
            ψΓωτιμωκχψΛΨ.c(var5 ? c<"㺒">(u & v, w) : c<"㺕">(x & y, z), var8);
         }

         try {
            if (βφμυζκζξβΛγΛζΩΠ.k.ar()) {
               if (ξρναΔχψογΣξΔω.u() >= ab) {
                  ρΣνμχγΨοΔΦ[] var9 = new ρΣνμχγΨοΔΦ[ac];
                  var9[ad] = ΩψΨρεξοσΠςΛυ.e;
                  var9[ae] = ΩψΨρεξοσΠςΛυ.f;
                  var9[af] = ΩψΨρεξοσΠςΛυ.g;
                  if (!var4.a(var9)) {
                     return;
                  }
               }

               ρΣνμχγΨοΔΦ[] var10 = new ρΣνμχγΨοΔΦ[ag];
               var10[ah] = ΩψΨρεξοσΠςΛυ.h;
               var10[ai] = ΩψΨρεξοσΠςΛυ.j;
               var10[aj] = ΩψΨρεξοσΠςΛυ.i;
               if (var4.a(var10)) {
                  (this.a = new βπΓλψΩνυευες(var1, this)).aH();
               }
            }
         } catch (Throwable var7) {
            ψΓωτιμωκχψΛΨ.c(var5 ? c<"㺘">(ak & al, am) : c<"㺛">(an, ao ^ ap), var7);
         }
      }
   }

   @Nullable
   @Generated
   public τφθχΔαΣγτφς b() {
      return this.c;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ςΛωηψηζτ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ντθΔζβΔζ.E("ԿագՃէֆվ֔րՏ֍փ֑\u058bՔչ֛֚֒֘֒է", (byte)91, 69), ςΛωηψηζτ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ςπυηννναΣ.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴԈӢԑԀԒԂԂԑƈ", (byte)91, 66) + var1 + ξψθρΣΠΣς.D("Ԁ", (byte)91, 68) + var2.toString(), var4);
      }
   }

   @Generated
   public βπΓλψΩνυευες a() {
      return this.a;
   }
}
