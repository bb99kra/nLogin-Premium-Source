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

public class ωμΛλγυψθρωπτατ {
   private static long u = Long.reverse(7247673661907566790L);
   private final βψυδΓγςΦπτ a;
   private static int s = 24 >>> 226 | 24 << ~226 + 1;
   private final τςχΠδΔΓπιλΛκργ[] a;
   private static long p = Long.reverse(7247673661907566790L);
   private static long r = Long.reverse(7247673661907566790L);
   private static long n = Long.reverse(7247673661907566790L);
   private static int q = (20 >>> 162 | 20 << -162) & -1;
   private static int j = Integer.reverse(1073741824);
   private static long k = Long.reverse(7247673661907566790L);
   private static int ag = Integer.reverse(1342177280);
   private static String[] a = new String[ωμΛλγυψθρωπτατ.af];
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
   private static String[] b = new String[ag];
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
         throw new IllegalArgumentException(c<"㺀">(b, d ^ e));
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
   public τςχΠδΔΓπιλΛκργ[] a() {
      return this.a;
   }

   public void y(String var1) {
      this.z(var1);
      this.b = System.nanoTime();
   }

   public ωμΛλγυψθρωπτατ(int var1, long var2, βψυδΓγςΦπτ var4) {
      this.t = var2;
      this.a = new τςχΠδΔΓπιλΛκργ[var1];
      this.a = var4;
   }

   private static String a(int var0, long var1) {
      var1 ^= 65L;
      var1 ^= 6259180158619371246L;
      if (a[var0] == null) {
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
            throw new RuntimeException(ΨφιωσρΓδΔθ.E("լչոԻջշղջֆյՂրքսրֆՈࣣࣗࢷ࣑ࣣࣩࣘࣤࣨࣙ࣬ࣤࣗ࣫", (byte)77, 69));
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

   public ωμΛλγυψθρωπτατ(int var1) {
      this(var1, System.nanoTime());
   }

   public ωμΛλγυψθρωπτατ(int var1, long var2) {
      this(var1, var2, βψυδΓγςΦπτ.b);
   }

   @Override
   public String toString() {
      if (this.a.length == 0) {
         return c<"㺀">(j, k);
      } else {
         StringBuilder var1 = new StringBuilder();
         θρδΣβΔωΣΛ var2 = θρδΣβΔωΣΛ.a(this.t);

         for (int var3 = l; var3 < this.a.length; var3++) {
            τςχΠδΔΓπιλΛκργ var4 = this.a[var3];
            if (var4 == null) {
               break;
            }

            if (var1.length() > 0) {
               var1.append(c<"㺃">(m, n));
            }

            String var5 = βψυδΓγςΦπτ.a(this.a)
               .replace(c<"㺆">(o, p), Integer.toString(var3))
               .replace(c<"㺉">(q, r), τςχΠδΔΓπιλΛκργ.a(var4))
               .replace(c<"㺌">(s, u), var2.a(βψυδΓγςΦπτ.a(this.a), τςχΠδΔΓπιλΛκργ.b(var4), βψυδΓγςΦπτ.a(this.a)))
               .replace(c<"㺏">(v & w, x), var2.a(βψυδΓγςΦπτ.a(this.a), τςχΠδΔΓπιλΛκργ.a(var4), βψυδΓγςΦπτ.a(this.a)))
               .replace(c<"㺒">(y, z), θρδΣβΔωΣΛ.a(τςχΠδΔΓπιλΛκργ.b(var4)).a(βψυδΓγςΦπτ.a(this.a), τςχΠδΔΓπιλΛκργ.a(var4), βψυδΓγςΦπτ.a(this.a)));
            var1.append(var5);
         }

         if (βψυδΓγςΦπτ.b(this.a) != null) {
            var1.append(c<"㺕">(aa, ab ^ ac));
            String var10001 = βψυδΓγςΦπτ.b(this.a);
            Object[] var10002 = new Object[ad];
            var10002[ae] = var2.a(βψυδΓγςΦπτ.a(this.a), βψυδΓγςΦπτ.a(this.a));
            var1.append(String.format(var10001, var10002));
         }

         return var1.toString();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωμΛλγυψθρωπτατ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζοηκορΦνΣθγΩ.F("՟ցփգևִ֦֞֠կֱ֣֭֫մֲֲָֺֻ֙և", (byte)123, 70), ωμΛλγυψθρωπτατ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣερμΔσατσκ.F("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫նऑअࣥआࣿऒखइऑचऒगअङ\u0590", (byte)123, 70) + var1 + ΦδφπθΩΩλζξ.E("ձ", (byte)123, 69) + var2.toString(), var4
         );
      }
   }

   public void z(String var1) {
      if (this.b == null) {
         throw new IllegalArgumentException(c<"㺀">(f, g ^ h));
      } else {
         τςχΠδΔΓπιλΛκργ[] var10000 = this.a;
         int var10001 = this.ab;
         this.ab = this.ab + i;
         var10000[var10001] = new τςχΠδΔΓπιλΛκργ(var1, this.b, System.nanoTime(), null);
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
               b[0] = θεωψξβΛσσ.F("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ\u0557՛ՖԝԽԙԳա՟ՏՅԺԱՃդ\u0558Կ՝Պ՜ՃՎՀաՆժՐՃԫՂ", (byte)6, 70);
               b[1] = μεςΩΔΣγν.F("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺՊ\u0530ԣԛԟԿՉԣՀԤՉԬԙԪՈՓ\u0558ԫՕԻՕգՅԠՐՒԻ՜էՋբծԸԵԶ", (byte)6, 70);
               b[2] = ΨφιωσρΓδΔθ.E("ӻԚԘԽӹԔԼӽԗԴӼԧԘՂԵԁՄԖԣԩԩՎԕԖ", (byte)6, 69);
               b[3] = ΨφιωσρΓδΔθ.C("СГИϹЗϼПЛчъЖЏ", (byte)6, 67);
               b[4] = ξψθρΣΠΣς.A("ðÎĀÖ¿ĆæëìćêÓ", (byte)6, 65);
               b[5] = οοθδΨιοΦΠβδζ.E("ԒԦԪӻԫԡԺԷԎԕԿԊ", (byte)6, 69);
               b[6] = φδχεθοκψαλΛογλ.D("АЍЙрЕϻмПІЀКЏ", (byte)6, 68);
               b[7] = δΛψπξκσβγςα.E("ԄԈӶԾԾԈԲԍӿԴԳԊ", (byte)6, 69);
               b[8] = ΨφιωσρΓδΔθ.C("ϲессЍϾІІЇсВЏ", (byte)6, 67);
               b[9] = ιΠοθΩΦξκ.F("ԓԤԇԽԾԒԠӼӽԲԥԊ", (byte)6, 70);
               break;
            case 1:
               b[0] = ντθΔζβΔζ.E("ӺԨԎԚԙӿՂԁԛ\u0530ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ\u0557՛ՖԝԽԙԳա՟ՏՅԺԱՃդ\u0558Կ՝Պ\u0558ԪըՑՐՅԲՄդԲէզԲՏ\u0557Է՚լսկՎտՊ", (byte)6, 69);
               b[1] = οοθδΨιοΦΠβδζ.C("ϿЭГПОЄчІРеИЫНУХЧЛцчГпяеШРФфюШхЩюбОЯэјѝањрњѩНзѠѮфѭэьЬчѳкл", (byte)6, 67);
               b[2] = βεξΠθρρςΔΦμ.B("ÄãáĆÂÝąÆàýÈîĊÐčÌÌæÕĄĉñÞß", (byte)6, 66);
               b[3] = ςπυηννναΣ.F("ԗԓӹԏԞӾ\u0530ԵԎԓԯԊ", (byte)6, 70);
               b[4] = ΠΛΨοδΩσμνΛγΦφβς.F("ӺԭԸԯՀԼԺԵԣԙԺԄӾՆՆԜԗԕԉՀՆԘԕԖ", (byte)6, 70);
               b[5] = ΣερμΔσατσκ.D("ПϿзϿтМТаЀИОЏ", (byte)6, 68);
               b[6] = ζβησεθωυγτ.F("ԑӳԊԌԛԊԑӹԗՂԲԼԱԚԿԶԉԇԖԾ\u0530ԘԕԖ", (byte)6, 70);
               b[7] = ςΦζσμτΓσ.E("ԋԶ\u0530ԨԐԏԹԯՃԾԎԹՁԾՅՇԟԝӿԇԚԨԕԖ", (byte)6, 69);
               b[8] = οοθδΨιοΦΠβδζ.E("ӻԙӻԵԸԛՀӻԬӼԅԷԜԲԝԞՈՅԥԆ\u0530ԨԕԖ", (byte)6, 69);
               b[9] = χφπρψπφΦθμπ.A("ÚÓüæóöĂĂöËÍÓ", (byte)6, 65);
               break;
            case 2:
               b[0] = ςπυηννναΣ.A("½ÕÛøąĆéõÊÞçćÙçÄÅíēēßäìĂĚçĈôôĎ×îā", (byte)6, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = φδχεθοκψαλΛογλ.C("зйϾЃЎЕчЏИЀфнеФЬКнШмъТЌіСуЭћїеобш", (byte)6, 67);
         }
      }
   }

   static {
      b();
   }
}
