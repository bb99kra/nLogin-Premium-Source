package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class ιχρΨκεπυξ<T extends εηχβγρΦβΦΛκγΦοδ<?>> {
   private List<String> k;
   private static int l = Integer.reverse(0);
   private String Z;
   private static int j = (-1 >>> 167 | -1 << -167) & -1;
   private boolean am;
   private static long p = Long.reverse(5827742062194508055L);
   private static int d = (0 >>> 29 | 0 << -29) & -1;
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static final Set<String> o = ConcurrentHashMap.newKeySet();
   private static int n = (65536 >>> 143 | 65536 << -143) & -1;
   private static int aa = (5120 >>> 74 | 5120 << -74) & -1;
   private static long ac = Long.reverse(7638104968020361216L);
   private boolean al;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int x = (128 >>> 167 | 128 << ~167 + 1) & -1;
   private static int an = 589824 >>> 208 | 589824 << ~208 + 1;
   private static String[] a = new String[ιχρΨκεπυξ.am];
   private static long c;
   private static long s = Long.reverse(4242474993360093463L);
   private static int u = 4096 >>> 42 | 4096 << -42;
   private static long k = Long.reverse(5827742062194508055L);
   private static double a = Double.longBitsToDouble(Long.reverse(2044L));
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int aj = '耀' >>> 140 | 32768 << ~140 + 1;
   private static double b = Double.longBitsToDouble(Long.reverse(6456360425798341628L));
   private static int m = 1073741824 >>> 62 | 1073741824 << -62;
   private static long v = Long.reverse(5827742062194508055L);
   private static long h = Long.reverse(5827742062194508055L);
   private static int z = Integer.reverse(0);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int ae = -1 >>> 126 | -1 << -126;
   protected T a;
   private static long af = Long.reverse(5827742062194508055L);
   private static String[] b = new String[an];
   private static int w = 0 >>> 55 | 0 << ~55 + 1;
   private static final Cache<String, Long> f = Caffeine.newBuilder().expireAfterWrite(ιχρΨκεπυξ.ao, TimeUnit.SECONDS).build();
   private static int c = 2048 >>> 75 | 2048 << -75;
   private double e = a;
   private String bw;
   private static int ad = Integer.reverse(1610612736);
   private ωΔτζχιαυΔτ a;
   private static long ab = Long.reverse(4242474993360093463L);
   private static int o = -1 >>> 31 | -1 << ~31 + 1;
   private double f = b;
   private static long ah = Long.reverse(4242474993360093463L);
   private static int al = (0 >>> 240 | 0 << -240) & -1;
   private static long t = Long.reverse(7638104968020361216L);
   private static long ai = Long.reverse(7638104968020361216L);
   private static long ak = Long.reverse(5827742062194508055L);
   private static int f = 0 >>> 211 | 0 << ~211 + 1;
   private static int g = Integer.reverse(-1);
   private static int r = Integer.reverse(-1073741824);
   private List<String> b;
   private static int ag = Integer.reverse(-536870912);
   private static int am = (2304 >>> 136 | 2304 << ~136 + 1) & -1;
   private static long ao = Long.reverse(-6917529027641081856L);

   @Generated
   public ιχρΨκεπυξ<T> a(boolean var1) {
      this.al = var1;
      return this;
   }

   @Generated
   public ιχρΨκεπυξ<T> b(String var1) {
      this.bw = var1;
      return this;
   }

   @Generated
   public ιχρΨκεπυξ<T> a(String var1) {
      this.Z = var1;
      return this;
   }

   @Nullable
   public final List<String> a(Object var1, String var2, boolean var3, String var4, String[] var5) {
      String var6 = c<"㺀">(n & o, p) + var2.toLowerCase(Locale.ENGLISH);
      if (var3) {
         Long var7 = (Long)f.getIfPresent(var6);
         long var8 = System.currentTimeMillis();
         if (var7 != null && var8 - var7 <= this.e) {
            return null;
         }

         f.put(var6, var8);
      }

      if (this.al && !o.add(var6)) {
         return null;
      } else {
         List var14;
         try {
            Object var13 = var3 ? this.a.a(var1) : this.a.a();
            var14 = this.d((θΦγνΩερριδκ)var13, var4, var5);
         } finally {
            o.remove(var6);
         }

         return var14;
      }
   }

   public void s() {
   }

   @Generated
   public T a() {
      return this.a;
   }

   protected List<String> a(θΦγνΩερριδκ var1, String var2, String[] var3) {
      return null;
   }

   public final void d(θΦγνΩερριδκ var1, String var2, String[] var3) {
      if (this.a(var1, var2, var3, (boolean)l)) {
         Runnable var4 = () -> {
            if (!(var1 instanceof ΨαχΨχΣλεΠψΦ) || ((ΨαχΨχΣλεΠψΦ)var1).R()) {
               try {
                  this.b(var1, var2, var3);
               } catch (Exception var5) {
                  var1.k(c<"㺀">(aa, ab ^ ac));
                  ψΓωτιμωκχψΛΨ.c(c<"㺃">(ad & ae, af) + var2.toLowerCase(Locale.ENGLISH) + c<"㺆">(ag, ah ^ ai) + var1.getName() + c<"㺉">(aj, ak) + this.am, var5);
               }
            }
         };
         if (this.am) {
            this.a.b((boolean)m).a(var4);
         } else {
            var4.run();
         }
      }
   }

   public ιχρΨκεπυξ(String var1) {
      this.al = (boolean)c;
      this.Z = var1;
      this.b = new ArrayList<>();
      this.k = new ArrayList<>();
   }

   public ιχρΨκεπυξ<T> b() {
      this.am = (boolean)e;
      return this;
   }

   @Generated
   public ιχρΨκεπυξ<T> a(double var1) {
      this.e = var1;
      return this;
   }

   @Generated
   public List<String> d() {
      return this.k;
   }

   @Generated
   public ιχρΨκεπυξ<T> a(List<String> var1) {
      this.b = var1;
      return this;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ιχρΨκεπυξ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.F("ӬԎԐӰԔԳԫՁԭӼԺ\u0530ԾԸԁԦՈՇԿՅԿԔ", (byte)8, 70), ιχρΨκεπυξ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ξψθρΣΠΣς.F("ԧԴԳӶԶԲԭԶՁ\u0530ӽԻԿԸԻՁԃࢎ࢝࢘ࢀ\u0893\u088f࢛ࢡ࢛Ԙ", (byte)8, 70) + var1 + οοθδΨιοΦΠβδζ.E("Ӿ", (byte)8, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   public double b() {
      return this.f;
   }

   public final void a(Object var1, String var2, boolean var3, String var4, String[] var5) {
      String var6 = c<"㺀">(f & g, h) + var2.toLowerCase(Locale.ENGLISH);
      if (var3) {
         Long var7 = (Long)f.getIfPresent(var6);
         long var8 = System.currentTimeMillis();
         if (var7 != null && var8 - var7 <= this.e) {
            return;
         }

         f.put(var6, var8);
      }

      if (!this.al || o.add(var6)) {
         try {
            Object var13 = var3 ? this.a.a(var1) : this.a.a();
            this.d((θΦγνΩερριδκ)var13, var4, var5);
         } finally {
            o.remove(var6);
         }
      }
   }

   @Generated
   public double a() {
      return this.e;
   }

   protected boolean a(θΦγνΩερριδκ var1, String var2, String[] var3, boolean var4) {
      if (this.k.isEmpty()) {
         return (boolean)x;
      } else {
         for (String var6 : this.k) {
            if (var1.i(var6)) {
               return (boolean)y;
            }
         }

         return (boolean)z;
      }
   }

   @Generated
   public boolean aq() {
      return this.am;
   }

   private List<String> d(θΦγνΩερριδκ var1, String var2, String[] var3) {
      if (!this.a(var1, var2, var3, (boolean)q)) {
         return null;
      } else {
         try {
            return this.a(var1, var2, var3);
         } catch (Exception var5) {
            var1.k(c<"㺀">(r, s ^ t));
            ψΓωτιμωκχψΛΨ.c(c<"㺃">(u, v) + var2.toLowerCase(Locale.ENGLISH), var5);
            return null;
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 86L;
      var1 ^= -8783148707470470624L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(19 + 49),
                     (byte)(57 + 12),
                     (byte)(24 + 59),
                     (byte)(6 + 41),
                     (byte)(23 + 44),
                     (byte)(36 + 30),
                     (byte)(4 + 63),
                     (byte)(29 + 18),
                     (byte)(9 + 71),
                     (byte)(63 + 12),
                     (byte)(20 + 47),
                     (byte)(37 + 46),
                     (byte)(19 + 34),
                     80,
                     (byte)(32 + 65),
                     (byte)(99 + 1),
                     100,
                     (byte)(41 + 64),
                     (byte)(104 + 6),
                     (byte)(58 + 45)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ςΦζσμτΓσ.B("öăĂÅąāüąĐÿÌĊĎćĊĐÒѝѬѧяѢўѪѰѪ", (byte)10, 66));
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

   public οηΔΦθκορ a(εηχβγρΦβΦΛκγΦοδ<?> var1) {
      this.a = (T)var1;
      this.a = this.a.b();
      οηΔΦθκορ var2 = this.a.a(this);
      var2.W();
      this.s();
      return var2;
   }

   protected abstract void b(θΦγνΩερριδκ var1, String var2, String[] var3);

   @Generated
   public String aa() {
      return this.Z;
   }

   public void a(String... var1) {
      String[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = d; var4 < var3; var4++) {
         String var5 = var2[var4];
         this.b.add(var5.toLowerCase(Locale.ENGLISH));
      }
   }

   @Generated
   public String ab() {
      return this.bw;
   }

   @Generated
   public ιχρΨκεπυξ<T> b(List<String> var1) {
      this.k = var1;
      return this;
   }

   private static void b() {
      c = -1692458702756247716L;
      long var0 = c ^ -8783148707470470624L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(44 + 24),
               (byte)(2 + 67),
               (byte)(40 + 43),
               (byte)(7 + 40),
               (byte)(53 + 14),
               66,
               (byte)(62 + 5),
               (byte)(15 + 32),
               (byte)(39 + 41),
               (byte)(71 + 4),
               67,
               (byte)(19 + 64),
               (byte)(20 + 33),
               (byte)(9 + 71),
               (byte)(72 + 25),
               (byte)(18 + 82),
               (byte)(55 + 45),
               (byte)(35 + 70),
               (byte)(22 + 88),
               (byte)(102 + 1)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
               b[0] = οοθδΨιοΦΠβδζ.E("ԴեՉճխԺպոնՍշՆ", (byte)66, 69);
               b[1] = ΣερμΔσατσκ.B("ĹŪŎŸŲĿſŽŻŒżŋ", (byte)66, 66);
               b[2] = ζοηκορΦνΣθγΩ.E("՟Տա\u0530հղ\u0557ջոշաՆ", (byte)66, 69);
               b[3] = ντθΔζβΔζ.D(
                  "ҬӉөҴҷӎӘҴӎӘӝӒӻӷӓәӹӘӽԅӦӨӥԇԌӦӦӽӻӟӰӪԃӎԏӐӨԑԎӮԖӻԈӚәӷӭӮԕӯԧӹӹӴӴԡӹԝԤӬԠӱԭԀԆԤԋԴԆӴԃԺԈԔԹԝԍԏӽԷԛԅԒԙԷԈԦԸԝԆՃՄԂԐԺԞԋԠՃԏԳԩԭԶՍԳ՞ԹԖ՞ՙԝՂԾ՚ՔԧԦԢԡբԺԼ՝ՉՒՠՀ",
                  (byte)66,
                  68
               );
               b[4] = ςΦζσμτΓσ.A("ŔŋűŜůƀľŹťŕŚżƆŜŔŚśƅŞƇōƎŭŦƂƋŷŠŪƃŭƈƌŻŘŗŭŲƚšŻŽƤū", (byte)66, 65);
               b[5] = πηγμΣΔκκ.B(
                  "ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐƆƩƘƫƕƥƢŻƄƍſƥƍůƋƱŶƸƸƃƩƍƩƗƵƀƸƟƼƵƃƜƕƗƱƚǀƵƽƅƣǋǍƉƮƱƦƒǉǏǈƺǏƹǔƐǇǀƛơǖƽǡǒǃƣǨƳƼǫǈƪƽǛǂƿǜƴǉǬǉǐǮƸǚ",
                  (byte)66,
                  66
               );
               b[6] = δΛψπξκσβγςα.A("ŔŋűŜůƀľŹťŕśŕűƈŜŉŋŊſŉƅƊƁōŝŐŔŬŏƃūƅ", (byte)66, 65);
               b[7] = χφπρψπφΦθμπ.E("ԵԶՙԲյջչհ՟ԺթՔփՕՁՁ\u0557՞գես֊ՑՒ", (byte)66, 69);
               b[8] = ΣφδσΔζιΠρα.C("ӡӱҾӃӄӔөӌәӍӓӪӜӝӼӔӄӓӝӏәӷӎӏ", (byte)66, 67);
               break;
            case 1:
               b[0] = βθκςνθΩθυμςτκχ.F("գ\u0558ՈԲնԮ՜՝ՌՠտՆ", (byte)66, 70);
               b[1] = φδχεθοκψαλΛογλ.D("ӭӫӀӟӣӇӧҶӻӜӴӃ", (byte)66, 68);
               b[2] = ΨΦνΨΦωυΩνβςμ.E("ԮԳՋդիՖԵպ՜ՖՉՆ", (byte)66, 69);
               b[3] = βεξΠθρρςΔΦμ.A(
                  "ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐŢšſŵŶƝŷƯƁƁżżƩƁƥƬŴƨŹƵƈƎƬƓƼƎżƋǂƐƜǁƥƕƗƅƿƣƍƚơƿƐƮǀƥƎǋǌƊƘǂƦƓƨǋƗƻƱƵƾǕƻǦǁƞǦǡƥǊǆǢǜƯƧƩƮƦǉǲǓǩǅǱǅ",
                  (byte)66,
                  65
               );
               b[4] = πχσδΦΦνθΔπ.C("ӌӃөӔӧӸҶӱӝӍӒӴӾӔӌӒӓӽӖӿӅԆӥӞӺԃӯӘӢӻӥԀԑӝӎӔӤӳԖԔԛӺӨӟԟӠӿӿӬӢԕԓԀԗӮӯ", (byte)66, 67);
               b[5] = ςΦζσμτΓσ.B(
                  "ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐƆƩƘƫƕƥƢŻƄƍſƥƍůƋƱŶƸƸƃƩƍƩƗƵƀƸƟƼƵƃƜƕƗƱƚǀƵƽƅƣǋǍƉƮƱƦƒǉǏǈƺǏƹǔƐǇǀƛơǖƽǡǒǃƣǨƳƼǫǈƪƽǛƺǣǊǀƽƱǔǆǬǆǰǫƴǇǞƸǶǐǟǍǑȀǋ",
                  (byte)66,
                  66
               );
               b[6] = ΣδτΠνεγοΓορητ.C("ӌӃөӔӧӸҶӱӝӍӓӍөԀӔӁӃӂӷӁӽӿԃԉӥӠӬӾӐӮӥԊӠԋӳӣԌӷӥӦԘԎӮӣ", (byte)66, 67);
               b[7] = οοθδΨιοΦΠβδζ.E("ԵԶՙԲյջչհ՟Ժթհյս\u0558դւՇՑևգՔՑՒ", (byte)66, 69);
               b[8] = πψυκΠΨμΛΩβΣφμφσ.D("ӡӱҾӃӄӔөӌәӍӕӝҼӭӏӤһӥӣәӾӷӎӏ", (byte)66, 68);
               break;
            case 2:
               b[0] = οοθδΨιοΦΠβδζ.B("ĲĳųŴŋƂžżĺŚņţŖŕśżńŚŪŉżƋƇŮőƁŔūƘŖŭŵ", (byte)66, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣερμΔσατσκ.E("խՓՄՆզԸվծիԼլԺ՛աՁմՒքճ\u0558ջ֊ՑՒ", (byte)66, 69);
         }
      }
   }

   @Generated
   public ιχρΨκεπυξ<T> b(double var1) {
      this.f = var1;
      return this;
   }

   @Generated
   public List<String> c() {
      return this.b;
   }

   @Generated
   public boolean ap() {
      return this.al;
   }

   @Generated
   public ωΔτζχιαυΔτ b() {
      return this.a;
   }

   public final void c(θΦγνΩερριδκ var1, String var2, String[] var3) {
      String var4 = c<"㺀">(i & j, k) + var1.getName().toLowerCase(Locale.ENGLISH);
      if (var1 instanceof ΨαχΨχΣλεΠψΦ) {
         Long var5 = (Long)f.getIfPresent(var4);
         long var6 = System.currentTimeMillis();
         if (var5 != null && var6 - var5 <= this.e) {
            return;
         }

         f.put(var4, var6);
      }

      if (!this.al || o.add(var4)) {
         try {
            this.d(var1, var2, var3);
         } finally {
            o.remove(var4);
         }
      }
   }

   static {
      b();
   }

   public void u(String var1) {
      this.k.add(var1.toLowerCase(Locale.ENGLISH));
   }
}
