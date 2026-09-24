package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ιηοψσγξςΩγδ implements αδξΠψβΣλωΛκ<πβκνλοΛκΠδΦτφλ> {
   private static String[] b = new String[ιηοψσγξςΩγδ.ay];
   private static long aw = Long.reverse(-8547827263782859108L);
   private static long e = Long.reverse(2594073385365405696L);
   private static long ai = Long.reverse(-5953753878417453412L);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int l = Integer.reverse(-1073741824);
   private static int u = Integer.reverse(1610612736);
   private static long d = Long.reverse(-5953753878417453412L);
   private static long as = Long.reverse(-8547827263782859108L);
   private static int x = Integer.reverse(-536870912);
   static final int aJ = ιηοψσγξςΩγδ.az;
   private static long p = Long.reverse(-5953753878417453412L);
   final AtomicInteger c;
   private static int o = (8388608 >>> 21 | 8388608 << ~21 + 1) & -1;
   private static int s = Integer.reverse(-1);
   private static int a = Integer.reverse(0);
   private static int ax = (33554432 >>> 149 | 33554432 << ~149 + 1) & -1;
   private static int av = Integer.reverse(-268435456);
   private static int r = Integer.reverse(-1610612736);
   private static int bc = Integer.reverse(-1);
   private static long k = Long.reverse(2594073385365405696L);
   private static long aj = Long.reverse(2594073385365405696L);
   private static long m = Long.reverse(-5953753878417453412L);
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int at = Integer.reverse(1879048192);
   private static int ak = Integer.reverse(1342177280);
   private static int g = Integer.reverse(-1);
   private static long n = Long.reverse(2594073385365405696L);
   public final Object n;
   private static int ae = Integer.reverse(268435456);
   private final ΨαχΨχΣλεΠψΦ e;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   static final int aI = bc;
   private static long c;
   private static int ad = (16384 >>> 142 | 16384 << ~142 + 1) & -1;
   private static int ac = Integer.reverse(-1);
   private static int az = 0 >>> 202 | 0 << ~202 + 1;
   private static long au = Long.reverse(-8547827263782859108L);
   private static int am = Integer.reverse(-805306368);
   private static long y = Long.reverse(-5953753878417453412L);
   private static long z = Long.reverse(2594073385365405696L);
   private static int ao = ('쀀' >>> 172 | 49152 << -172) & -1;
   private static long w = Long.reverse(2594073385365405696L);
   private static long h = Long.reverse(-8547827263782859108L);
   private static int ab = (0 >>> 27 | 0 << ~27 + 1) & -1;
   private static long an = Long.reverse(-8547827263782859108L);
   private static int b = 0 >>> 78 | 0 << ~78 + 1;
   private static int ah = Integer.reverse(-1879048192);
   private static long v = Long.reverse(-5953753878417453412L);
   private static String[] a = new String[ax];
   private static long al = Long.reverse(-8547827263782859108L);
   private static int ay = Integer.reverse(134217728);
   private static int i = (512 >>> 200 | 512 << ~200 + 1) & -1;
   private static long q = Long.reverse(2594073385365405696L);
   private static int ba = (-16777217 >>> 88 | -16777217 << -88) & -1;
   private final Map<String, Object> m = new ConcurrentHashMap<>();
   static final int aH = ba;
   static final int aK = bb;
   private static long af = Long.reverse(-5953753878417453412L);
   private static long j = Long.reverse(-5953753878417453412L);
   private static int ap = (-1 >>> 191 | -1 << ~191 + 1) & -1;
   private static long ag = Long.reverse(2594073385365405696L);
   private static long t = Long.reverse(-8547827263782859108L);
   private static long aq = Long.reverse(-8547827263782859108L);
   private static int ar = Integer.reverse(-1342177280);

   public boolean a(πβκνλοΛκΠδΦτφλ var1) {
      return this.m.containsKey(var1.aB());
   }

   private static void b() {
      c = 4139735126883960501L;
      long var0 = c ^ -935874324090473881L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(22 + 46),
               (byte)(49 + 20),
               (byte)(59 + 24),
               (byte)(5 + 42),
               (byte)(9 + 58),
               (byte)(24 + 42),
               (byte)(29 + 38),
               (byte)(29 + 18),
               (byte)(72 + 8),
               (byte)(55 + 20),
               67,
               (byte)(75 + 8),
               (byte)(5 + 48),
               (byte)(34 + 46),
               97,
               (byte)(53 + 47),
               (byte)(69 + 31),
               (byte)(45 + 60),
               (byte)(63 + 47),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.C("ԮԒԼԕԪԕԭԽԞӼՄԍԁԁԓԻԸԥԾԋԗԠԅԚԺԺԞԎՓԾՑԷԶ՛ԧԺԻԷՏԖԱԬԿԨ", (byte)89, 67);
               b[1] = ντθΔζβΔζ.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
               b[2] = ιΠοθΩΦξκ.D("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵՌՓՋԜԷԾԽՉՠԔԷԨ", (byte)89, 68);
               b[3] = φδχεθοκψαλΛογλ.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
               b[4] = δΛψπξκσβγςα.B("ţŦŞƨƌƝŭƪƂųƳƩŨƯŶƊƬźƑůƚƲƎƙǀŹƕƞƾƹƿŻƘǇƬǇǏƗƇƲƯƿƝǔǈƨƏƘƧƶƩƪƔǍƤƥ", (byte)89, 66);
               b[5] = ιΠοθΩΦξκ.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
               b[6] = λΣΩσμφγχ.D("ԔԦԥԫԞԨԋԙԭԔԐԾՄԶՇԠԝԀԼԈՂԈՌՃԤՍԧՂԤԴԳԘՋՇԫԎՈԹՓ\u0530ԻԜ՝Ԩ", (byte)89, 68);
               b[7] = ξψθρΣΠΣς.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
               b[8] = οοθδΨιοΦΠβδζ.B("ƃƩƇſƠŧƮŰƆžưƓƤŭƲƙƒƨƗƈƝźƝƉŽƺǄƔơƂƠƛƆƺƽƜƺƮƐǒƜƽƎƴƫƵǈƑƣǈƧƴƿƕǐƜǣưƻǍƟǣǃǆǜƺƼǋǭǚƫǂǰǂǄƿǍǫǈǃƸƲǨǎǘǭǄǅ", (byte)89, 66);
               b[9] = πψυκΠΨμΛΩβΣφμφσ.A("ƓŻŶƙſƁƭƎƞƄƞƆƴƨƗƳƤƺƒƌƯƗƄƅ", (byte)89, 65);
               b[10] = ΨΦνΨΦωυΩνβςμ.C("ԱԷӴԑԔԌԈ\u0530ԡӻԯԯԘԁԧԔԪԽՁԔԖԖԓԔ", (byte)89, 67);
               b[11] = μεςΩΔΣγν.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƭƉƸƷƎƬƃƅŽǂƓ", (byte)89, 65);
               b[12] = χΠξΦιζΨΣωΦσΨζ.F("ռծ֎էէՊՑՌՈժՔշթ։օշՔ՛թ֡֘ջըթ", (byte)89, 70);
               b[13] = ΣφδσΔζιΠρα.A("ƛƄŸƌƚŸžƩưƁūŹ", (byte)89, 65);
               b[14] = ςπυηννναΣ.D("ԈӹԱԪԫԑԧԊՀԲՄԑԾԆԒԳԛՋԤԝԄԼԓԔ", (byte)89, 68);
               b[15] = ΣδτΠνεγοΓορητ.F("Հչփ֎կվ֊նշւ֎՝", (byte)89, 70);
               break;
            case 1:
               b[0] = ντθΔζβΔζ.E("փէ֑ժտժւ֒ճՑ֙բՖՖը\u0590֍պ֓ՠլյ՚կ֏֏ճգ֦֨֓\u058cըըհօ֜ձժ֯֕հ֪ս", (byte)89, 69);
               b[1] = ςΦζσμτΓσ.F("՞\u0590ասթՉՔ֕տ֖դ՝", (byte)89, 70);
               b[2] = βεξΠθρρςΔΦμ.C("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵԬԱՇԺԾԗԿՔաԞՑԨ", (byte)89, 67);
               b[3] = βθκςνθΩθυμςτκχ.C("ԍԸԭԆԪԔԶԘԉԿԋԈ", (byte)89, 67);
               b[4] = βθκςνθΩθυμςτκχ.C("ӲӵӭԷԛԬӼԹԑԂՂԸӷԾԅԙԻԉԠӾԩՁԝԨՏԈԤԭՍՈՎԊԧՖԻՖ՞ԦԖՁԾՎԫԽ\u0530դԷզՖԷԫեԩլԳԴ", (byte)89, 67);
               b[5] = ζοηκορΦνΣθγΩ.B("ŻŨƆƉƩŪƨƃƠƐżŹ", (byte)89, 66);
               b[6] = φΨαξωυθανΣφυκη.A("ƅƗƖƜƏƙżƊƞƅƁƯƵƧƸƑƎűƭŹƳŹƽƴƕƾƘƳƕƥƤƉƩǊơǇƶƙƍƤƐƥƬǉƨƤơƙƴƕƦǈƙǝƤƥ", (byte)89, 65);
               b[7] = ζοηκορΦνΣθγΩ.A("ƣťžƊŻƍƥƎƑƢƞŹ", (byte)89, 65);
               b[8] = ΨΦνΨΦωυΩνβςμ.D(
                  "ԒԸԖԎԯӶԽӿԕԍԿԢԳӼՁԨԡԷԦԗԬԉԬԘԌՉՓԣ\u0530ԑԯԪԕՉՌԫՉԽԟաԫՌԝՃԺՄ\u0557ԠԲ\u0557ԶՃՎԤ՟ԫղԿՊ՜ԮղՒՕիՉՋ՚ռթԺՑտՑՕՐՒՆՇն\u0558՞քցՠռցժօպ֍էբյ֎֎", (byte)89, 68
               );
               b[9] = μζξτΩσσφυδεπλΨ.E("շ՟՚սգե֑ղւըքդյգ֔\u0558֙ՙ\u0590֚\u0590֡ըթ", (byte)89, 69);
               b[10] = λΣΩσμφγχ.F("ֆ\u058cՉզթա՝օնՐքժլշզսո֝\u058c֛֠լ֥ղ֟՝֝֞֗֕֙ր", (byte)89, 70);
               b[11] = οΩνΩρωλΨηΛδωδ.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƻƨƒƎŵƤƝƐƝƑƿ", (byte)89, 65);
               b[12] = δΛψπξκσβγςα.B("ƘƊƪƃƃŦŭŨŤƆűƆžƧƯŹƬƌƦưƎƭƄƅ", (byte)89, 66);
               b[13] = φΨαξωυθανΣφυκη.C("ԍԈԆԲԈԺԸԐԒӿԸԂԲԶԛԇԚԴԖԪԸԼԓԔ", (byte)89, 67);
               b[14] = ΣερμΔσατσκ.C("ԈӹԱԪԫԑԧԊՀԲՄԀԱԐԹԗԶՂԼԄԃԼԓԔ", (byte)89, 67);
               b[15] = ςπυηννναΣ.D("ԳԵԦӶԫԆԎԭԩӾԱԈ", (byte)89, 68);
               break;
            case 2:
               b[0] = πηγμΣΔκκ.E("էչըծՌիվ֍֍֓֏Ր֛՚մջ\u058c֠մսծջըթ", (byte)89, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣδτΠνεγοΓορητ.D("ԺԨԛԝԦԲԩԴԁԯӺԀԼԢԖԘԈՅՉԌԺԖԓԔ", (byte)89, 68);
         }
      }
   }

   public String d() {
      String var1 = this.d(πβκνλοΛκΠδΦτφλ.b);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c<"㺀">(i, j ^ k) + this.e.getName() + c<"㺃">(l, m ^ n));
      }
   }

   static {
      b();
   }

   public πααΔΣνΨγνθυ a() {
      return this.a(πβκνλοΛκΠδΦτφλ.m, var1 -> πααΔΣνΨγνθυ.a(ΨγημιδξΓτοθαζ.c(), this.e, this));
   }

   @Nullable
   public Integer b() {
      Integer var1 = this.d(πβκνλοΛκΠδΦτφλ.z);
      if (var1 != null) {
         int var2 = this.a(πβκνλοΛκΠδΦτφλ.A, ΣλνΨουΩΔοθεβ.E.r());
         return var2 - var1;
      } else {
         return null;
      }
   }

   public void a(πβκνλοΛκΠδΦτφλ var1, Object var2) {
      this.m.put(var1.aB(), var2);
   }

   public void a(οωλθςδυΛβσΨδγπ var1, @Nullable οωλθςδυΛβσΨδγπ var2) {
      synchronized (this.n) {
         if (var2 != null) {
            οωλθςδυΛβσΨδγπ var4 = this.a();
            if (var2 != var4) {
               throw new IllegalStateException(c<"㺀">(ae, af ^ ag) + this.e.getName() + c<"㺃">(ah, ai ^ aj) + var4 + c<"㺆">(ak, al) + var2);
            }
         }

         this.a(πβκνλοΛκΠδΦτφλ.p, var1);
      }
   }

   @Nullable
   public εθσξξτΛακπΣ b() {
      return this.d(πβκνλοΛκΠδΦτφλ.i);
   }

   public ΩψτσψΣριΣ a() {
      ΩψτσψΣριΣ var1 = this.d(πβκνλοΛκΠδΦτφλ.g);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c<"㺀">(u, v ^ w) + this.e.getName() + c<"㺃">(x, y ^ z));
      }
   }

   @Nullable
   public <T> T a(πβκνλοΛκΠδΦτφλ var1) {
      return (T)this.m.remove(var1.aB());
   }

   public εθσξξτΛακπΣ a() {
      εθσξξτΛακπΣ var1 = εδδΠηδξΛΣχ.c();
      return ΣλνΨουΩΔοθεβ.ap.ar() ? this.a(πβκνλοΛκΠδΦτφλ.i, var1) : var1;
   }

   public void aI() {
      if (this.a(πβκνλοΛκΠδΦτφλ.z)) {
         this.a(πβκνλοΛκΠδΦτφλ.z, this.a(πβκνλοΛκΠδΦτφλ.z, ac) + ad);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= -935874324090473881L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(67 + 1),
                     (byte)(27 + 42),
                     (byte)(68 + 15),
                     (byte)(33 + 14),
                     (byte)(39 + 28),
                     (byte)(59 + 7),
                     (byte)(64 + 3),
                     (byte)(24 + 23),
                     (byte)(12 + 68),
                     75,
                     (byte)(39 + 28),
                     (byte)(37 + 46),
                     (byte)(28 + 25),
                     (byte)(72 + 8),
                     (byte)(21 + 76),
                     (byte)(53 + 47),
                     (byte)(85 + 15),
                     105,
                     (byte)(107 + 3),
                     (byte)(80 + 23)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), (byte)(5 + 78)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζοηκορΦνΣθγΩ.B("ĨĵĴ÷ķĳĮķłıþļŀĹļłĄҏҎҗҡҝҎҚҟ҇ҒҔ", (byte)35, 66));
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

   public οωλθςδυΛβσΨδγπ a() {
      return this.a(πβκνλοΛκΠδΦτφλ.p, οωλθςδυΛβσΨδγπ.a);
   }

   public boolean j() {
      εθσξξτΛακπΣ var1 = this.a();
      return (boolean)(var1 != εθσξξτΛακπΣ.c && var1 != εθσξξτΛακπΣ.s ? ab : aa);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ιηοψσγξςΩγδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(μεςΩΔΣγν.C("ѭҏґѱҕҴҬӂҮѽһұҿҹ҂ҧӉӈӀӆӀҕ", (byte)48, 67), ιηοψσγξςΩγδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ΣφδσΔζιΠρα.A("łŏŎđőōňőŜŋĘŖŚœŖŜĞҩҨұһҷҨҴҹҡҬҮĵ", (byte)48, 65) + var1 + πηγμΣΔκκ.E("Ԧ", (byte)48, 69) + var2.toString(), var4);
      }
   }

   public στΩξξχκι a() {
      στΩξξχκι var1 = this.d(πβκνλοΛκΠδΦτφλ.a);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c<"㺀">(b, d ^ e) + this.e.getName() + c<"㺃">(f & g, h));
      }
   }

   public <T> T a(πβκνλοΛκΠδΦτφλ var1, Function<String, T> var2) {
      return (T)this.m.computeIfAbsent(var1.aB(), var2);
   }

   @Generated
   @Override
   public String toString() {
      return c<"㺀">(am, an) + this.m + c<"㺃">(ao & ap, aq) + this.b() + c<"㺆">(ar, as) + this.n + c<"㺉">(at, au) + this.c + c<"㺌">(av, aw);
   }

   @Nullable
   public Object b(πβκνλοΛκΠδΦτφλ var1) {
      return this.m.get(var1.aB());
   }

   public νχιλΣΩμψιτβΔΣδμ a() {
      νχιλΣΩμψιτβΔΣδμ var1 = this.d(πβκνλοΛκΠδΦτφλ.f);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(c<"㺀">(o, p ^ q) + this.e.getName() + c<"㺃">(r & s, t));
      }
   }

   public ιηοψσγξςΩγδ(ΨαχΨχΣλεΠψΦ var1, InetSocketAddress var2) {
      this.n = new Object();
      this.c = new AtomicInteger(a);
      this.e = var1;
      this.a(πβκνλοΛκΠδΦτφλ.d, var2);
   }

   @Generated
   public ΨαχΨχΣλεΠψΦ b() {
      return this.e;
   }
}
