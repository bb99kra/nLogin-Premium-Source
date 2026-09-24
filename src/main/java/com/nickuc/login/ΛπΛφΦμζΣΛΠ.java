package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ΛπΛφΦμζΣΛΠ extends ιΓαΩλςηναΩλγδΓ {
   private static int j = 0 >>> 202 | 0 << -202;
   private static long ak = Long.reverse(4758684495168256122L);
   private static int o = (0 >>> 251 | 0 << ~251 + 1) & -1;
   private static int ac = 128 >>> 7 | 128 << ~7 + 1;
   private static long t = Long.reverse(-3744111601307240326L);
   private static int c = 0 >>> 110 | 0 << -110;
   private static long d = Long.reverse(-3744111601307240326L);
   private static long ae = Long.reverse(4758684495168256122L);
   private static long ao = Long.reverse(4758684495168256122L);
   private static long g = Long.reverse(-3744111601307240326L);
   private static String[] b = new String[ΛπΛφΦμζΣΛΠ.ar];
   private static long am = Long.reverse(4758684495168256122L);
   private static long e = Long.reverse(-8214565720323784704L);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int f = 131072 >>> 81 | 131072 << ~81 + 1;
   private static int ap = 0 >>> 164 | 0 << -164;
   private static int al = Integer.reverse(-536870912);
   private static int aq = (1207959552 >>> 27 | 1207959552 << -27) & -1;
   private static int aa = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static int k = 0 >>> 96 | 0 << ~96 + 1;
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int w = 0 >>> 156 | 0 << ~156 + 1;
   private static long h = Long.reverse(-8214565720323784704L);
   private static int i = (16 >>> 100 | 16 << -100) & -1;
   private static int y = Integer.reverse(0);
   private static int s = 402653184 >>> 187 | 402653184 << -187;
   private static int q = Integer.reverse(-1);
   private static int af = Integer.reverse(-1610612736);
   private static long ah = Long.reverse(4758684495168256122L);
   private static int aj = (6291456 >>> 148 | 6291456 << -148) & -1;
   private static long r = Long.reverse(4758684495168256122L);
   private static int n = 262144 >>> 82 | 262144 << -82;
   private static long u = Long.reverse(-8214565720323784704L);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(1073741824);
   private static int m = Integer.reverse(1073741824);
   private static String[] a = new String[aq];
   private static int an = Integer.reverse(268435456);
   private static int ai = 0 >>> 20 | 0 << ~20 + 1;
   private static int ar = '退' >>> 204 | 36864 << -204;
   private static int ag = Integer.reverse(-1);
   private static int ad = (8 >>> 225 | 8 << -225) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΛπΛφΦμζΣΛΠ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πχσδΦΦνθΔπ.E("ԣՅՇԧՋժբոդԳձէյկԸ՝տվնռնՋ", (byte)63, 69), ΛπΛφΦμζΣΛΠ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.A("ŠŭŬįůūŦůźũĶŴŸűŴźļҩӏҫӗҸӏӊҸұҷŒ", (byte)63, 65) + var1 + δΛψπξκσβγςα.B("ķ", (byte)63, 66) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 113L;
      var1 ^= -9067283583422954456L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     69,
                     (byte)(49 + 34),
                     (byte)(40 + 7),
                     (byte)(9 + 58),
                     (byte)(61 + 5),
                     (byte)(8 + 59),
                     (byte)(22 + 25),
                     (byte)(74 + 6),
                     (byte)(71 + 4),
                     (byte)(52 + 15),
                     (byte)(75 + 8),
                     (byte)(32 + 21),
                     (byte)(77 + 3),
                     (byte)(2 + 95),
                     (byte)(31 + 69),
                     (byte)(56 + 44),
                     (byte)(35 + 70),
                     (byte)(26 + 84),
                     (byte)(38 + 65)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μεςΩΔΣγν.D("ѾҋҊэҍ҉҄ҍҘ҇єҒҖҏҒҘњ߇߭߉ߵߖ߭ߨߖߏߕ", (byte)34, 68));
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

   private static void b() {
      c = 6781740645846110259L;
      long var0 = c ^ -9067283583422954456L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(32 + 37),
               83,
               (byte)(12 + 35),
               (byte)(34 + 33),
               (byte)(63 + 3),
               (byte)(11 + 56),
               (byte)(29 + 18),
               (byte)(12 + 68),
               (byte)(49 + 26),
               (byte)(21 + 46),
               83,
               (byte)(14 + 39),
               (byte)(71 + 9),
               (byte)(10 + 87),
               (byte)(40 + 60),
               (byte)(12 + 88),
               (byte)(104 + 1),
               (byte)(6 + 104),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ΣφδσΔζιΠρα.F("շբօժְր֡ճֈֵմփոֈִִ֪\u058cճ֮ր֜։֊", (byte)122, 70);
               b[1] = ςπυηννναΣ.E("֫ի֙ժեռִ֦֒֙նֶ\u058cղ֑վյ֑֬֊ֱ֜։֊", (byte)122, 69);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.E("֘\u058b֢֒հւֲֶ֑֥֓ձַ֣ջֈ֟֫շ֍ֲֿ։֊", (byte)122, 69);
               b[3] = πχσδΦΦνθΔπ.B("ǋǖǣƧǥƧǉƽǯǎǟǤǢǥǏǈƸǓǔǾƿǙǆǇ", (byte)122, 66);
               b[4] = βεξΠθρρςΔΦμ.C("՛կժո֓խիղ֘\u0590ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱ֣֪֖֯֜նֽ֭ռׂ֎օָ\u058b", (byte)122, 67);
               b[5] = οοθδΨιοΦΠβδζ.D("կծ֞ֈկխ՟ծ՝սղճ֛֞֔եթս֍֊հ։նշ", (byte)122, 68);
               b[6] = ΨΦνΨΦωυΩνβςμ.C("Փժղ֠՛֜֍ն՜ռպի", (byte)122, 67);
               b[7] = ΨφιωσρΓδΔθ.B("ƧǇƽƾǨǋƿǥǆǅƵǠǩƷƶǯǦǌǛǏǚƾǍǐȀǸǽǃǑǚǠȃǵǢǭǸȄǧǮȐǑȄǷǭǠǢǭǛǺǔǾȒǩǷǷȖǶȘȑȆȖǩȔǿ", (byte)122, 66);
               b[8] = θεωψξβΛσσ.C("ք\u058bկլջջււճցֆի", (byte)122, 67);
               break;
            case 1:
               b[0] = θεωψξβΛσσ.B("ƴƟǂƧǭƽǞưǅǲƱǟƪǂƸǓǴǍǌǬƸǯǆǇ", (byte)122, 66);
               b[1] = οοθδΨιοΦΠβδζ.D("֘\u0558ֆ\u0557Ւթ֓֡տֆաե֥մաիյվֈէ֛չնշ", (byte)122, 68);
               b[2] = ζβησεθωυγτ.A("ǕǈǟǏƭƿǎǳǢǯǎǲǮǅƷƵǗǝǛǭǴǉǆǇ", (byte)122, 65);
               b[3] = χφπρψπφΦθμπ.E("֎֦֙ժ֨ժ\u058cրֲ֑֚չ֥֛֪յֻտ֒\u0590־\u058c։֊", (byte)122, 69);
               b[4] = ΠΛΨοδΩσμνΛγΦφβς.D("՛կժո֓խիղ֘\u0590ս֒֔ւ֓պցֆփ֬֍֍ք֥֜խ֨շճֱֱֳּׁ֣֛֣֯֩֡׃ֻׄ\u058b", (byte)122, 68);
               b[5] = βθκςνθΩθυμςτκχ.C("կծ֞ֈկխ՟ծ՝սղ՝մր֨գ֖֗֙ըְ֟նշ", (byte)122, 67);
               b[6] = θεωψξβΛσσ.D("հ֊ըճց֢ոՠ֍ցւի", (byte)122, 68);
               b[7] = ΣφδσΔζιΠρα.F("ժ֊րց֫֎ւ֨։ֈո֣֬պչֲ֩֏֞֒֝ց\u0590֓׃ֻ׀ֆ֣֔֝׆ְֱָׇֻ֥֪דְְׇֺֽׁ֣֥֔֞֗וֻ֭֬פְֱפֹׅ֧֨ץ", (byte)122, 70);
               b[8] = φδχεθοκψαλΛογλ.F("ելջլֆփ֒֗֓հ։վ", (byte)122, 70);
               break;
            case 2:
               b[0] = βθκςνθΩθυμςτκχ.F("ջջ\u058b֪֛֍֊֦֗ք֫ճֈոֱ֪֔֩֠\u058cֲ֜։֊", (byte)122, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.E("պְգ֒ժֆ֔մւղ֊ֱ֤շ֮֫֟ղցֲ֚֠։֊", (byte)122, 69);
         }
      }
   }

   public ΛπΛφΦμζΣΛΠ(ΨγημιδξΓτοθαζ var1) {
      super(var1, c<"㺀">(c, d ^ e), c<"㺃">(f, g ^ h), (boolean)i, (boolean)j);
   }

   @Override
   public void b(θΦγνΩερριδκ var1, String[] var2) {
      if (var1 instanceof ΨαχΨχΣλεΠψΦ) {
         εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.A);
      } else if (var2.length != m) {
         πωιψγηξΓρφυ var9 = πωιψγηξΓρφυ.x;
         Object[] var11 = new Object[n];
         var11[o] = c<"㺀">(p & q, r) + this.e().toLowerCase(Locale.ENGLISH) + c<"㺃">(s, t ^ u);
         εδδΠηδξΛΣχ.a(var1, var9, var11);
      } else {
         ΨαχΨχΣλεΠψΦ var3 = this.a.b().a(var2[v]);
         if (var3 == null) {
            εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.u);
         } else {
            εσλρΔμΔψχεθυνΔ var4 = this.a.a();
            ιηοψσγξςΩγδ var5 = var4.b(var3);
            στΩξξχκι var6 = var5.a();
            if (!var6.h()) {
               πωιψγηξΓρφυ var8 = πωιψγηξΓρφυ.t;
               Object[] var10 = new Object[x];
               var10[y] = var3.getName();
               εδδΠηδξΛΣχ.a(var1, var8, var10);
            } else if (var4.b(var3)) {
               πωιψγηξΓρφυ var10001 = πωιψγηξΓρφυ.F;
               Object[] var10002 = new Object[z];
               var10002[aa] = var3.getName();
               εδδΠηδξΛΣχ.a(var1, var10001, var10002);
            } else {
               this.a.b().a(var6, var3, (boolean)ab, (boolean)ac);
               String var7 = var6.i();
               εδδΠηδξΛΣχ.a(var1, c<"㺆">(ad, ae) + var7 + c<"㺉">(af & ag, ah));
               ψΓωτιμωκχψΛΨ.b(c<"㺌">(aj, ak) + var7 + c<"㺏">(al, am) + var1.getName() + c<"㺒">(an, ao));
            }
         }
      }
   }
}
