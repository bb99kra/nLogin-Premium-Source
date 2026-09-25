package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_258 {
   private static long u = Long.reverse(7247673661907566790L);
   private final NLoginCore_429 a;
   private static int s = 24 >>> 226 | 24 << ~226 + 1;
   private final NLoginCore_293[] a;
   private static long p = Long.reverse(7247673661907566790L);
   private static long r = Long.reverse(7247673661907566790L);
   private static long n = Long.reverse(7247673661907566790L);
   private static int q = (20 >>> 162 | 20 << -162) & -1;
   private static int j = Integer.reverse(1073741824);
   private static long k = Long.reverse(7247673661907566790L);
   private static int ag = Integer.reverse(1342177280);
   private static String[] ZKM_STR_A = new String[NLoginCore_258.af];
   private static long x = Long.reverse(7247673661907566790L);
   private static int o = (1048576 >>> 146 | 1048576 << -146) & -1;
   private static int ae = 0 >>> 255 | 0 << ~255 + 1;
   private static int w = Integer.reverse(-1);
   private static long c;
   private static long g = Long.reverse(-1831583186871353146L);
   private static int l = Integer.reverse(0);
   private long t;
   private static int b = 0 >>> 183 | 0 << ~183 + 1;
   private static int a = Integer.reverse(0);
   private static long d = Long.reverse(-1831583186871353146L);
   private static long z = Long.reverse(7247673661907566790L);
   private static int m = Integer.reverse(-1073741824);
   private static long ac = Long.reverse(-9079256848778919936L);
   private static int ad = (65536 >>> 176 | 65536 << -176) & -1;
   private static String[] ZKM_STR_B = new String[ag];
   private static long e = Long.reverse(-9079256848778919936L);
   private static long h = Long.reverse(-9079256848778919936L);
   private Long b;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int af = Integer.reverse(1342177280);
   private static int y = (Integer.MIN_VALUE >>> 156 | Integer.MIN_VALUE << -156) & -1;
   private static int v = Integer.reverse(-536870912);
   private int ab;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long ab = Long.reverse(-1831583186871353146L);
   private static int aa = Integer.reverse(-1879048192);

   public void aB() {
      if (this.b != null) {
         throw new IllegalArgumentException(a(b, d ^ e));
      } else {
         this.b = System.nanoTime();
      }
   }

   public void a(String var1, Runnable var2) {
      try {
         this.aB();
         var2.run();
      } finally {
         this.z(var1);
      }
   }

   public void aA() {
      this.t = System.nanoTime();
      this.ab = a;
      this.b = null;
   }

   @Generated
   public NLoginCore_293[] a() {
      return this.a;
   }

   public void y(String var1) {
      this.z(var1);
      this.b = System.nanoTime();
   }

   public NLoginCore_258(int var1, long var2, NLoginCore_429 var4) {
      this.t = var2;
      this.a = new NLoginCore_293[var1];
      this.a = var4;
   }

   private static String a(int var0, long var1) {
      var1 ^= 65L;
      var1 ^= 6259180158619371246L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(57 + 11),
                     69,
                     83,
                     (byte)(41 + 6),
                     (byte)(50 + 17),
                     (byte)(8 + 58),
                     (byte)(8 + 59),
                     (byte)(31 + 16),
                     (byte)(52 + 28),
                     (byte)(22 + 53),
                     (byte)(53 + 14),
                     (byte)(50 + 33),
                     (byte)(44 + 9),
                     (byte)(56 + 24),
                     (byte)(86 + 11),
                     (byte)(21 + 79),
                     (byte)(62 + 38),
                     (byte)(102 + 3),
                     (byte)(43 + 67),
                     (byte)(30 + 73)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_559.E("լչոԻջշղջֆյՂրքսրֆՈࣣࣗࢷ࣑ࣣࣩࣘࣤࣨࣙ࣬ࣤࣗ࣫", (byte)77, 69));
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

   public NLoginCore_258(int var1) {
      this(var1, System.nanoTime());
   }

   public NLoginCore_258(int var1, long var2) {
      this(var1, var2, NLoginCore_429.b);
   }

   @Override
   public String toString() {
      if (this.a.length == 0) {
         return a(j, k);
      } else {
         StringBuilder var1 = new StringBuilder();
         NLoginCore_270 var2 = NLoginCore_270.a(this.t);

         for (int var3 = l; var3 < this.a.length; var3++) {
            NLoginCore_293 var4 = this.ZKM_STR_A[var3];
            if (var4 == null) {
               break;
            }

            if (var1.length() > 0) {
               var1.append(a(m, n));
            }

            String var5 = NLoginCore_429.a(this.a)
               .replace(a(o, p), Integer.toString(var3))
               .replace(a(q, r), NLoginCore_293.a(var4))
               .replace(a(s, u), var2.a(NLoginCore_429.a(this.a), NLoginCore_293.b(var4), NLoginCore_429.a(this.a)))
               .replace(a(v & w, x), var2.a(NLoginCore_429.a(this.a), NLoginCore_293.a(var4), NLoginCore_429.a(this.a)))
               .replace(a(y, z), NLoginCore_270.a(NLoginCore_293.b(var4)).a(NLoginCore_429.a(this.a), NLoginCore_293.a(var4), NLoginCore_429.a(this.a)));
            var1.append(var5);
         }

         if (NLoginCore_429.b(this.a) != null) {
            var1.append(a(aa, ab ^ ac));
            String var10001 = NLoginCore_429.b(this.a);
            Object[] var10002 = new Object[ad];
            var10002[ae] = var2.a(NLoginCore_429.a(this.a), NLoginCore_429.a(this.a));
            var1.append(String.format(var10001, var10002));
         }

         return var1.toString();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_258.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.F("՟ցփգևִ֦֞֠կֱ֣֭֫մֲֲָֺֻ֙և", (byte)123, 70), NLoginCore_258.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.F("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫նऑअࣥआࣿऒखइऑचऒगअङ\u0590", (byte)123, 70) + var1 + NLoginCore_232.E("ձ", (byte)123, 69) + var2.toString(), var4
         );
      }
   }

   public void z(String var1) {
      if (this.b == null) {
         throw new IllegalArgumentException(a(f, g ^ h));
      } else {
         NLoginCore_293[] var10000 = this.a;
         int var10001 = this.ab;
         this.ab = this.ab + i;
         var10000[var10001] = new NLoginCore_293(var1, this.b, System.nanoTime(), null);
         this.b = null;
      }
   }

   public <T> T a(String var1, Callable<T> var2) {
      Object var3;
      try {
         this.aB();

         try {
            var3 = var2.call();
         } catch (Exception var7) {
            throw new RuntimeException(var7);
         }
      } finally {
         this.z(var1);
      }

      return (T)var3;
   }

   private static void b() {
      c = 7134035570909981031L;
      long var0 = c ^ 6259180158619371246L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(50 + 19),
               (byte)(73 + 10),
               (byte)(8 + 39),
               (byte)(33 + 34),
               (byte)(5 + 61),
               (byte)(39 + 28),
               (byte)(17 + 30),
               (byte)(29 + 51),
               (byte)(37 + 38),
               (byte)(12 + 55),
               (byte)(62 + 21),
               (byte)(20 + 33),
               (byte)(11 + 69),
               (byte)(61 + 36),
               100,
               (byte)(89 + 11),
               105,
               (byte)(102 + 8),
               (byte)(101 + 2)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.F("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ\u0557՛ՖԝԽԙԳա՟ՏՅԺԱՃդ\u0558Կ՝Պ՜ՃՎՀաՆժՐՃԫՂ", (byte)6, 70);
               ZKM_STR_B[1] = NLoginCore_521.F("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺՊ\u0530ԣԛԟԿՉԣՀԤՉԬԙԪՈՓ\u0558ԫՕԻՕգՅԠՐՒԻ՜էՋբծԸԵԶ", (byte)6, 70);
               ZKM_STR_B[2] = NLoginCore_559.E("ӻԚԘԽӹԔԼӽԗԴӼԧԘՂԵԁՄԖԣԩԩՎԕԖ", (byte)6, 69);
               ZKM_STR_B[3] = NLoginCore_559.C("СГИϹЗϼПЛчъЖЏ", (byte)6, 67);
               ZKM_STR_B[4] = NLoginCore_141.A("ðÎĀÖ¿ĆæëìćêÓ", (byte)6, 65);
               ZKM_STR_B[5] = NLoginCore_471.E("ԒԦԪӻԫԡԺԷԎԕԿԊ", (byte)6, 69);
               ZKM_STR_B[6] = NLoginCore_433.D("АЍЙрЕϻмПІЀКЏ", (byte)6, 68);
               ZKM_STR_B[7] = NLoginCore_183.E("ԄԈӶԾԾԈԲԍӿԴԳԊ", (byte)6, 69);
               ZKM_STR_B[8] = NLoginCore_559.C("ϲессЍϾІІЇсВЏ", (byte)6, 67);
               ZKM_STR_B[9] = NLoginCore_427.F("ԓԤԇԽԾԒԠӼӽԲԥԊ", (byte)6, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_110.E("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ\u0557՛ՖԝԽԙԳա՟ՏՅԺԱՃդ\u0558Կ՝Պ\u0558ԪըՑՐՅԲՄդԲէզԲՏ\u0557Է՚լսկՎտՊ", (byte)6, 69);
               ZKM_STR_B[1] = NLoginCore_471.C("ϿЭГПОЄчІРеИЫНУХЧЛцчГпяеШРФфюШхЩюбОЯэјѝањрњѩНзѠѮфѭэьЬчѳкл", (byte)6, 67);
               ZKM_STR_B[2] = NLoginCore_223.B("ÄãáĆÂÝąÆàýÈîĊÐčÌÌæÕĄĉñÞß", (byte)6, 66);
               ZKM_STR_B[3] = NLoginCore_575.F("ԗԓӹԏԞӾ\u0530ԵԎԓԯԊ", (byte)6, 70);
               ZKM_STR_B[4] = NLoginCore_091.F("ӺԭԸԯՀԼԺԵԣԙԺԄӾՆՆԜԗԕԉՀՆԘԕԖ", (byte)6, 70);
               ZKM_STR_B[5] = NLoginCore_241.D("ПϿзϿтМТаЀИОЏ", (byte)6, 68);
               ZKM_STR_B[6] = NLoginCore_027.F("ԑӳԊԌԛԊԑӹԗՂԲԼԱԚԿԶԉԇԖԾ\u0530ԘԕԖ", (byte)6, 70);
               ZKM_STR_B[7] = NLoginCore_324.E("ԋԶ\u0530ԨԐԏԹԯՃԾԎԹՁԾՅՇԟԝӿԇԚԨԕԖ", (byte)6, 69);
               ZKM_STR_B[8] = NLoginCore_471.E("ӻԙӻԵԸԛՀӻԬӼԅԷԜԲԝԞՈՅԥԆ\u0530ԨԕԖ", (byte)6, 69);
               ZKM_STR_B[9] = NLoginCore_004.A("ÚÓüæóöĂĂöËÍÓ", (byte)6, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.A("½ÕÛøąĆéõÊÞçćÙçÄÅíēēßäìĂĚçĈôôĎ×îā", (byte)6, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.C("зйϾЃЎЕчЏИЀфнеФЬКнШмъТЌіСуЭћїеобш", (byte)6, 67);
         }
      }
   }

   static {
      b();
   }
}
