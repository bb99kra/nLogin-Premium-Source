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

public class ωπφΓασεΠχ implements ιΨφαρελΣζΠΔΩ, κΓΦνκχβδ {
   private static int a = 0 >>> 11 | 0 << -11;
   private static long j = Long.reverse(5392051815251229713L);
   private static int s = (100663296 >>> 25 | 100663296 << -25) & -1;
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static long b = Long.reverse(-2101937964693275631L);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(-2101937964693275631L);
   private static int e = 2097152 >>> 21 | 2097152 << ~21 + 1;
   private static int f = Integer.reverse(0);
   private static int n = Integer.reverse(1073741824);
   private static int t = Integer.reverse(-1073741824);
   private static long p = Long.reverse(-6341068275337658368L);
   private static long c;
   private static String[] b = new String[t];
   private static long d = Long.reverse(-6341068275337658368L);
   private static int k = (16777216 >>> 215 | 16777216 << ~215 + 1) & -1;
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(0);
   private static int l = 0 >>> 79 | 0 << -79;
   private final ΩγΛξιχγτ P;
   private static int h = Integer.reverse(0);
   private static String[] a = new String[s];

   @Override
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      ευτβπαψω var10001 = ευτβπαψω.g;
      Object[] var10002 = new Object[g];
      var10002[h] = c<"㺀">(i, j);
      εδδΠηδξΛΣχ.a(var2, var10001, var10002);
      γοηλιμεπη[] var5 = new γοηλιμεπη[k];
      var5[l] = γοηλιμεπη.i;
      var5[m] = γοηλιμεπη.j;
      return αΠαβσΠτΦ.a(var2, var5);
   }

   static {
      b();
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
      return this.P;
   }

   private static String a(int var0, long var1) {
      var1 ^= 21L;
      var1 ^= -2578018787197963148L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(39 + 29),
                     (byte)(54 + 15),
                     83,
                     (byte)(22 + 25),
                     (byte)(12 + 55),
                     (byte)(47 + 19),
                     (byte)(30 + 37),
                     (byte)(33 + 14),
                     (byte)(75 + 5),
                     (byte)(25 + 50),
                     (byte)(62 + 5),
                     (byte)(35 + 48),
                     (byte)(40 + 13),
                     (byte)(40 + 40),
                     (byte)(66 + 31),
                     (byte)(84 + 16),
                     (byte)(59 + 41),
                     105,
                     (byte)(58 + 52),
                     (byte)(7 + 96)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΦδφπθΩΩλζξ.F("՟լիԮծժեծչըԵճշհճչԻࣖ࣎ࣕࢣࣂࣕࣈࢴࣜ", (byte)64, 70));
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
                  ωπφΓασεΠχ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.F("ՌծհՐմ֓\u058b֡֍՜֚\u0590֞֘աֆ֧֥֨֟֟մ", (byte)104, 70), ωπφΓασεΠχ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣφδσΔζιΠρα.F("և֔֓Ֆ֖֒֍֖֡\u0590՝֛֛֟֘֡գࣰࣶࣾࣽ࣋࣪ࣽࣜऄո", (byte)104, 70) + var1 + φδχεθοκψαλΛογλ.E("՞", (byte)104, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      return (boolean)(!var1.a().p() && var1.a().a().c(c<"㺀">(a, b ^ d)) ? f : e);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4, γοηλιμεπη var5) {
      switch (ξλΩΠλζυυ.v[var5.ordinal()]) {
         case 1:
         case 2:
            var1.a().a().a(c<"㺀">(n, o ^ p), (boolean)(var5 == γοηλιμεπη.i ? q : r)).ag();
            κΓΦνκχβδ.super.a(var1, var2, var3, var4, var5);
      }
   }

   @Generated
   public ωπφΓασεΠχ(ΩγΛξιχγτ var1) {
      this.P = var1;
   }

   private static void b() {
      c = -8629687145237959865L;
      long var0 = c ^ -2578018787197963148L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(60 + 9),
               (byte)(56 + 27),
               (byte)(3 + 44),
               (byte)(16 + 51),
               (byte)(5 + 61),
               (byte)(65 + 2),
               (byte)(2 + 45),
               (byte)(63 + 17),
               (byte)(28 + 47),
               67,
               (byte)(74 + 9),
               (byte)(6 + 47),
               (byte)(69 + 11),
               (byte)(42 + 55),
               (byte)(13 + 87),
               (byte)(95 + 5),
               (byte)(24 + 81),
               110,
               (byte)(83 + 20)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
               b[0] = χφπρψπφΦθμπ.A("ćĕŁăğŅŐĠīŉċĔŃŋŔĦķěŇĥōħĤĥ", (byte)41, 65);
               b[1] = λΣΩσμφγχ.F("ԳՇ՜Ԝՠԯ՝ՎՆաՙԨԜՃՃՄ՟լխՒ՟ԻԸԹ", (byte)41, 70);
               b[2] = ΦδφπθΩΩλζξ.F("ԛԩՕԗԳՙդԴԿ՝ԟԨ\u0557՟ըԺՋԯ՛ԹաԻԸԹ", (byte)41, 70);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.B("ćĕŁăğŅŐĠīŉčĭĮĳńĭĖňħļľķĤĥ", (byte)41, 66);
               b[1] = βεξΠθρρςΔΦμ.D("ѾҒҧѧҫѺҨҙґҬҢѬѲҠѮҁҲҖғѵҍҿҧѽӁҳѾҠӄӆҖҾ", (byte)41, 68);
               b[2] = οοθδΨιοΦΠβδζ.F("ԛԩՕԗԳՙդԴԿ՝Ԣԟ՟Լ՞ԾՌԼհԬԿԻԸԹ", (byte)41, 70);
               break;
            case 2:
               b[0] = μεςΩΔΣγν.B("ńŃŌŁłěĎŐŊčĲħĤńōĸŌņĒĦľķĤĥ", (byte)41, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = βθκςνθΩθυμςτκχ.F("ՏԟՉԝ՟ԭԴԡ՟գԷէթՋՔէԶժՊզթՈԪՄՂաՎըԸԻեծ", (byte)41, 70);
         }
      }
   }
}
