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

public class NLoginCore_509 implements NLoginInterface_002<NLoginCore_567> {
   private static String[] ZKM_STR_B = new String[NLoginCore_509.ay];
   private static long aw = Long.reverse(-8547827263782859108L);
   private static long e = Long.reverse(2594073385365405696L);
   private static long ai = Long.reverse(-5953753878417453412L);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int l = Integer.reverse(-1073741824);
   private static int u = Integer.reverse(1610612736);
   private static long d = Long.reverse(-5953753878417453412L);
   private static long as = Long.reverse(-8547827263782859108L);
   private static int x = Integer.reverse(-536870912);
   static final int aJ = NLoginCore_509.az;
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
   private final NLoginCore_277 e;
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
   private static String[] ZKM_STR_A = new String[ax];
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

   public boolean a(NLoginCore_567 var1) {
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
               ZKM_STR_B[0] = NLoginCore_091.C("ԮԒԼԕԪԕԭԽԞӼՄԍԁԁԓԻԸԥԾԋԗԠԅԚԺԺԞԎՓԾՑԷԶ՛ԧԺԻԷՏԖԱԬԿԨ", (byte)89, 67);
               ZKM_STR_B[1] = NLoginCore_110.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
               ZKM_STR_B[2] = NLoginCore_427.D("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵՌՓՋԜԷԾԽՉՠԔԷԨ", (byte)89, 68);
               ZKM_STR_B[3] = NLoginCore_433.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
               ZKM_STR_B[4] = NLoginCore_183.B("ţŦŞƨƌƝŭƪƂųƳƩŨƯŶƊƬźƑůƚƲƎƙǀŹƕƞƾƹƿŻƘǇƬǇǏƗƇƲƯƿƝǔǈƨƏƘƧƶƩƪƔǍƤƥ", (byte)89, 66);
               ZKM_STR_B[5] = NLoginCore_427.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
               ZKM_STR_B[6] = NLoginCore_553.D("ԔԦԥԫԞԨԋԙԭԔԐԾՄԶՇԠԝԀԼԈՂԈՌՃԤՍԧՂԤԴԳԘՋՇԫԎՈԹՓ\u0530ԻԜ՝Ԩ", (byte)89, 68);
               ZKM_STR_B[7] = NLoginCore_141.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
               ZKM_STR_B[8] = NLoginCore_471.B("ƃƩƇſƠŧƮŰƆžưƓƤŭƲƙƒƨƗƈƝźƝƉŽƺǄƔơƂƠƛƆƺƽƜƺƮƐǒƜƽƎƴƫƵǈƑƣǈƧƴƿƕǐƜǣưƻǍƟǣǃǆǜƺƼǋǭǚƫǂǰǂǄƿǍǫǈǃƸƲǨǎǘǭǄǅ", (byte)89, 66);
               ZKM_STR_B[9] = NLoginCore_201.A("ƓŻŶƙſƁƭƎƞƄƞƆƴƨƗƳƤƺƒƌƯƗƄƅ", (byte)89, 65);
               ZKM_STR_B[10] = NLoginCore_127.C("ԱԷӴԑԔԌԈ\u0530ԡӻԯԯԘԁԧԔԪԽՁԔԖԖԓԔ", (byte)89, 67);
               ZKM_STR_B[11] = NLoginCore_521.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƭƉƸƷƎƬƃƅŽǂƓ", (byte)89, 65);
               ZKM_STR_B[12] = NLoginCore_387.F("ռծ֎էէՊՑՌՈժՔշթ։օշՔ՛թ֡֘ջըթ", (byte)89, 70);
               ZKM_STR_B[13] = NLoginCore_451.A("ƛƄŸƌƚŸžƩưƁūŹ", (byte)89, 65);
               ZKM_STR_B[14] = NLoginCore_575.D("ԈӹԱԪԫԑԧԊՀԲՄԑԾԆԒԳԛՋԤԝԄԼԓԔ", (byte)89, 68);
               ZKM_STR_B[15] = NLoginCore_076.F("Հչփ֎կվ֊նշւ֎՝", (byte)89, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.E("փէ֑ժտժւ֒ճՑ֙բՖՖը\u0590֍պ֓ՠլյ՚կ֏֏ճգ֦֨֓\u058cըըհօ֜ձժ֯֕հ֪ս", (byte)89, 69);
               ZKM_STR_B[1] = NLoginCore_324.F("՞\u0590ասթՉՔ֕տ֖դ՝", (byte)89, 70);
               ZKM_STR_B[2] = NLoginCore_223.C("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵԬԱՇԺԾԗԿՔաԞՑԨ", (byte)89, 67);
               ZKM_STR_B[3] = NLoginCore_173.C("ԍԸԭԆԪԔԶԘԉԿԋԈ", (byte)89, 67);
               ZKM_STR_B[4] = NLoginCore_173.C("ӲӵӭԷԛԬӼԹԑԂՂԸӷԾԅԙԻԉԠӾԩՁԝԨՏԈԤԭՍՈՎԊԧՖԻՖ՞ԦԖՁԾՎԫԽ\u0530դԷզՖԷԫեԩլԳԴ", (byte)89, 67);
               ZKM_STR_B[5] = NLoginCore_092.B("ŻŨƆƉƩŪƨƃƠƐżŹ", (byte)89, 66);
               ZKM_STR_B[6] = NLoginCore_453.A("ƅƗƖƜƏƙżƊƞƅƁƯƵƧƸƑƎűƭŹƳŹƽƴƕƾƘƳƕƥƤƉƩǊơǇƶƙƍƤƐƥƬǉƨƤơƙƴƕƦǈƙǝƤƥ", (byte)89, 65);
               ZKM_STR_B[7] = NLoginCore_092.A("ƣťžƊŻƍƥƎƑƢƞŹ", (byte)89, 65);
               ZKM_STR_B[8] = NLoginCore_127.D(
                  "ԒԸԖԎԯӶԽӿԕԍԿԢԳӼՁԨԡԷԦԗԬԉԬԘԌՉՓԣ\u0530ԑԯԪԕՉՌԫՉԽԟաԫՌԝՃԺՄ\u0557ԠԲ\u0557ԶՃՎԤ՟ԫղԿՊ՜ԮղՒՕիՉՋ՚ռթԺՑտՑՕՐՒՆՇն\u0558՞քցՠռցժօպ֍էբյ֎֎", (byte)89, 68
               );
               ZKM_STR_B[9] = NLoginCore_446.E("շ՟՚սգե֑ղւըքդյգ֔\u0558֙ՙ\u0590֚\u0590֡ըթ", (byte)89, 69);
               ZKM_STR_B[10] = NLoginCore_553.F("ֆ\u058cՉզթա՝օնՐքժլշզսո֝\u058c֛֠լ֥ղ֟՝֝֞֗֕֙ր", (byte)89, 70);
               ZKM_STR_B[11] = NLoginCore_397.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƻƨƒƎŵƤƝƐƝƑƿ", (byte)89, 65);
               ZKM_STR_B[12] = NLoginCore_183.B("ƘƊƪƃƃŦŭŨŤƆűƆžƧƯŹƬƌƦưƎƭƄƅ", (byte)89, 66);
               ZKM_STR_B[13] = NLoginCore_453.C("ԍԈԆԲԈԺԸԐԒӿԸԂԲԶԛԇԚԴԖԪԸԼԓԔ", (byte)89, 67);
               ZKM_STR_B[14] = NLoginCore_241.C("ԈӹԱԪԫԑԧԊՀԲՄԀԱԐԹԗԶՂԼԄԃԼԓԔ", (byte)89, 67);
               ZKM_STR_B[15] = NLoginCore_575.D("ԳԵԦӶԫԆԎԭԩӾԱԈ", (byte)89, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.E("էչըծՌիվ֍֍֓֏Ր֛՚մջ\u058c֠մսծջըթ", (byte)89, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_076.D("ԺԨԛԝԦԲԩԴԁԯӺԀԼԢԖԘԈՅՉԌԺԖԓԔ", (byte)89, 68);
         }
      }
   }

   public String d() {
      String var1 = this.d(NLoginCore_567.b);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(a(i, j ^ k) + this.e.getName() + a(l, m ^ n));
      }
   }

   static {
      b();
   }

   public NLoginInterface_024 a() {
      return this.a(NLoginCore_567.m, var1 -> NLoginInterface_024.a(NLoginType_008.c(), this.e, this));
   }

   @Nullable
   public Integer b() {
      Integer var1 = this.d(NLoginCore_567.z);
      if (var1 != null) {
         int var2 = this.a(NLoginCore_567.A, NLoginCore_477.E.r());
         return var2 - var1;
      } else {
         return null;
      }
   }

   public void a(NLoginCore_567 var1, Object var2) {
      this.m.put(var1.aB(), var2);
   }

   public void a(NLoginCore_077 var1, @Nullable NLoginCore_077 var2) {
      synchronized (this.n) {
         if (var2 != null) {
            NLoginCore_077 var4 = this.a();
            if (var2 != var4) {
               throw new IllegalStateException(a(ae, af ^ ag) + this.e.getName() + a(ah, ai ^ aj) + var4 + a(ak, al) + var2);
            }
         }

         this.a(NLoginCore_567.p, var1);
      }
   }

   @Nullable
   public NLoginCore_055 b() {
      return this.d(NLoginCore_567.i);
   }

   public NLoginCore_510 a() {
      NLoginCore_510 var1 = this.d(NLoginCore_567.g);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(a(u, v ^ w) + this.e.getName() + a(x, y ^ z));
      }
   }

   @Nullable
   public <T> T a(NLoginCore_567 var1) {
      return (T)this.m.remove(var1.aB());
   }

   public NLoginCore_055 a() {
      NLoginCore_055 var1 = NLoginCore_150.c();
      return NLoginCore_477.ap.ar() ? this.a(NLoginCore_567.i, var1) : var1;
   }

   public void aI() {
      if (this.a(NLoginCore_567.z)) {
         this.a(NLoginCore_567.z, this.a(NLoginCore_567.z, ac) + ad);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= -935874324090473881L;
      if (ZKM_STR_A[var0] == null) {
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
            throw new RuntimeException(NLoginCore_092.B("ĨĵĴ÷ķĳĮķłıþļŀĹļłĄҏҎҗҡҝҎҚҟ҇ҒҔ", (byte)35, 66));
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

   public NLoginCore_077 a() {
      return this.a(NLoginCore_567.p, NLoginCore_077.a);
   }

   public boolean j() {
      NLoginCore_055 var1 = this.a();
      return ((var1 != NLoginCore_055.c && var1 != NLoginCore_055.s ? ab : aa) != 0);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_509.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.C("ѭҏґѱҕҴҬӂҮѽһұҿҹ҂ҧӉӈӀӆӀҕ", (byte)48, 67), NLoginCore_509.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_451.A("łŏŎđőōňőŜŋĘŖŚœŖŜĞҩҨұһҷҨҴҹҡҬҮĵ", (byte)48, 65) + var1 + NLoginCore_138.E("Ԧ", (byte)48, 69) + var2.toString(), var4);
      }
   }

   public ForceRegisterConfig a() {
      ForceRegisterConfig var1 = this.d(NLoginCore_567.a);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(a(b, d ^ e) + this.e.getName() + a(f & g, h));
      }
   }

   public <T> T a(NLoginCore_567 var1, Function<String, T> var2) {
      return (T)this.m.computeIfAbsent(var1.aB(), var2);
   }

   @Generated
   @Override
   public String toString() {
      return a(am, an) + this.m + a(ao & ap, aq) + this.b() + a(ar, as) + this.n + a(at, au) + this.c + a(av, aw);
   }

   @Nullable
   public Object b(NLoginCore_567 var1) {
      return this.m.get(var1.aB());
   }

   public NLoginInterface_017 a() {
      NLoginInterface_017 var1 = this.d(NLoginCore_567.f);
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException(a(o, p ^ q) + this.e.getName() + a(r & s, t));
      }
   }

   public NLoginCore_509(NLoginCore_277 var1, InetSocketAddress var2) {
      this.n = new Object();
      this.c = new AtomicInteger(a);
      this.e = var1;
      this.a(NLoginCore_567.d, var2);
   }

   @Generated
   public NLoginCore_277 b() {
      return this.e;
   }
}
