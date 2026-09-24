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

public class ΨζψσπνυΣ implements ιΨφαρελΣζΠΔΩ, κΓΦνκχβδ {
   private static long q = Long.reverse(995054226442663046L);
   private final ΩγΛξιχγτ T;
   private static long o = Long.reverse(-2463710287377877882L);
   private static long c;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(-2463710287377877882L);
   private static long r = Long.reverse(-3458764513820540928L);
   private static int k = Integer.reverse(1073741824);
   private static int a = 0 >>> 182 | 0 << ~182 + 1;
   private static int g = (131072 >>> 113 | 131072 << -113) & -1;
   private static int f = (0 >>> 247 | 0 << ~247 + 1) & -1;
   private static int s = Integer.reverse(536870912);
   private static int e = 256 >>> 40 | 256 << -40;
   private static String[] a = new String[s];
   private static int b = Integer.reverse(-1);
   private static int l = (0 >>> 196 | 0 << -196) & -1;
   private static int t = (Integer.MIN_VALUE >>> 29 | Integer.MIN_VALUE << -29) & -1;
   private static int p = 1572864 >>> 243 | 1572864 << ~243 + 1;
   private static long d = Long.reverse(-2463710287377877882L);
   private static int n = '耀' >>> 'n' | 32768 << -110;
   private static String[] b = new String[t];
   private static int h = (0 >>> 42 | 0 << ~42 + 1) & -1;

   @Generated
   public ΨζψσπνυΣ(ΩγΛξιχγτ var1) {
      this.T = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4, γοηλιμεπη var5) {
      switch (τεβΨουρπ.z[var5.ordinal()]) {
         case 1:
         case 2:
            var1.a().a().a(c<"㺀">(n, o), c<"㺃">(p, q ^ r)).ag();
            var1.a().a(var5 == γοηλιμεπη.g ? γβηΛζλοδΛχβω.b : γβηΛζλοδΛχβω.c);
            κΓΦνκχβδ.super.a(var1, var2, var3, var4, var5);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 2869351537434598908L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(10 + 59),
                     83,
                     (byte)(42 + 5),
                     (byte)(27 + 40),
                     (byte)(6 + 60),
                     (byte)(12 + 55),
                     (byte)(31 + 16),
                     80,
                     (byte)(48 + 27),
                     (byte)(11 + 56),
                     (byte)(76 + 7),
                     (byte)(26 + 27),
                     (byte)(39 + 41),
                     (byte)(14 + 83),
                     (byte)(75 + 25),
                     (byte)(19 + 81),
                     (byte)(77 + 28),
                     (byte)(26 + 84),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨφιωσρΓδΔθ.F("բկծԱձխըձռիԸնպճնռԾࢸࣇ࣒ࣚࣖࣔࣛࢺ", (byte)67, 70));
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

   private static void b() {
      c = 7002458330251981744L;
      long var0 = c ^ 2869351537434598908L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               69,
               (byte)(35 + 48),
               (byte)(41 + 6),
               (byte)(34 + 33),
               (byte)(18 + 48),
               (byte)(61 + 6),
               (byte)(29 + 18),
               (byte)(61 + 19),
               (byte)(6 + 69),
               (byte)(23 + 44),
               (byte)(53 + 30),
               (byte)(5 + 48),
               80,
               (byte)(88 + 9),
               (byte)(49 + 51),
               (byte)(70 + 30),
               (byte)(53 + 52),
               (byte)(104 + 6),
               (byte)(56 + 47)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), 83}, StandardCharsets.UTF_8));
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
               b[0] = δΛψπξκσβγςα.E("Պՙ՜հծՈ\u058c֍վևքհմՌՍե՜֘\u0558֟֒֠էը", (byte)88, 69);
               b[1] = ζοηκορΦνΣθγΩ.B("ŲŷƣūŞŤƏƧźƣżƠƈƑŨƃƎƴƭƇŴƅƂƃ", (byte)88, 66);
               b[2] = ντθΔζβΔζ.D("ӳԂԅԙԗӱԵԶԧ\u0530ԭԙԝӵӶԎԅՁԁՈԻՉԐԑ", (byte)88, 68);
               b[3] = φΨαξωυθανΣφυκη.F("ՍիօՎ֏\u058cՓկՠՍՎ՜", (byte)88, 70);
               break;
            case 1:
               b[0] = ζοηκορΦνΣθγΩ.A("ťŴŷƋƉţƧƨƙƢƟƅƊƩƯƟƈƋƮƦƥƫƂƃ", (byte)88, 65);
               b[1] = λΣΩσμφγχ.D("ԀԅԱӹӬӲԝԵԈԱԋԒӿӼӼԏՁՆՄԙԩԘԿԷԎՅԽՈՎԌՂԤ", (byte)88, 68);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.F("Պՙ՜հծՈ\u058c֍վևփդխ֊֚֔չվՕ֠՜պէը", (byte)88, 70);
               b[3] = ιΠοθΩΦξκ.C("ӮԳԨӲԵӶԵԛԋӵԌԅ", (byte)88, 67);
               break;
            case 2:
               b[0] = ζοηκορΦνΣθγΩ.C("ӵԀԹԡԹӱԭԐԌԳԔԅ", (byte)88, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = βθκςνθΩθυμςτκχ.C("ӲԥԁԆӹԗԳԇԮԛӹԗԫԣӼԠԂՇԹԞԥԓԐԑ", (byte)88, 67);
         }
      }
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
      return this.T;
   }

   @Override
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      ευτβπαψω var10001 = ευτβπαψω.f;
      Object[] var10002 = new Object[g];
      var10002[h] = c<"㺀">(i, j);
      εδδΠηδξΛΣχ.a(var2, var10001, var10002);
      γοηλιμεπη[] var5 = new γοηλιμεπη[k];
      var5[l] = γοηλιμεπη.g;
      var5[m] = γοηλιμεπη.h;
      return αΠαβσΠτΦ.a(var2, var5);
   }

   static {
      b();
   }

   @Override
   public boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      return (boolean)(!var1.a().p() && var1.a().a().c(c<"㺀">(a & b, d)) ? f : e);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΨζψσπνυΣ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ντθΔζβΔζ.C("АвдДиїяѥёРўєѢќХъѬѫѣѩѣи", (byte)17, 67), ΨζψσπνυΣ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ςΦζσμτΓσ.B("ĄđĐÓēďĊēĞčÚĘĜĕĘĞàњѩѼѸѶѴѽќô", (byte)17, 66) + var1 + πηγμΣΔκκ.F("ԇ", (byte)17, 70) + var2.toString(), var4);
      }
   }
}
