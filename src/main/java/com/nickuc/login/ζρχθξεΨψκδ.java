package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ζρχθξεΨψκδ extends ιΓαΩλςηναΩλγδΓ {
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(0);
   private static int k = Integer.reverse(0);
   private static int v = 2097152 >>> 211 | 2097152 << ~211 + 1;
   private static int y = (5120 >>> 234 | 5120 << -234) & -1;
   private static long e = Long.reverse(1729382256910270464L);
   private static int c = Integer.reverse(0);
   private static int q = Integer.reverse(-1073741824);
   private static long m = Long.reverse(965078037728332113L);
   private static int n = Integer.reverse(0);
   private static long w = Long.reverse(965078037728332113L);
   private static int u = Integer.reverse(0);
   private static String[] b = new String[y];
   private static long s = Long.reverse(1729382256910270464L);
   private static int i = (67108864 >>> 26 | 67108864 << ~26 + 1) & -1;
   private static final Set<String> d = new HashSet<>();
   private static int h = Integer.reverse(0);
   private static int o = (268435456 >>> 92 | 268435456 << ~92 + 1) & -1;
   private static int x = Integer.reverse(-1610612736);
   private static long c;
   private static String[] a = new String[x];
   private static int t = (1 >>> 192 | 1 << ~192 + 1) & -1;
   private static long r = Long.reverse(1541538790031755601L);
   private static long g = Long.reverse(965078037728332113L);
   private static int l = Integer.reverse(1073741824);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(1541538790031755601L);

   public ζρχθξεΨψκδ(ΨγημιδξΓτοθαζ var1) {
      super(var1, c<"㺀">(c, d ^ e), c<"㺃">(f, g), (boolean)h, (boolean)i);
   }

   private static String a(int var0, long var1) {
      var1 ^= 24L;
      var1 ^= 5256249295194542490L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     69,
                     (byte)(81 + 2),
                     (byte)(9 + 38),
                     (byte)(64 + 3),
                     (byte)(50 + 16),
                     (byte)(13 + 54),
                     (byte)(10 + 37),
                     80,
                     (byte)(37 + 38),
                     (byte)(62 + 5),
                     (byte)(47 + 36),
                     (byte)(29 + 24),
                     (byte)(35 + 45),
                     (byte)(62 + 35),
                     (byte)(19 + 81),
                     (byte)(36 + 64),
                     (byte)(49 + 56),
                     (byte)(39 + 71),
                     (byte)(70 + 33)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(φΨαξωυθανΣφυκη.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҴӀӇҹӀҸҬӍӀһ", (byte)55, 65));
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

   @Override
   public void b(θΦγνΩερριδκ var1, String[] var2) {
      if (!(var1 instanceof ΨαχΨχΣλεΠψΦ)) {
         εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.z);
      } else {
         ΨαχΨχΣλεΠψΦ var3 = (ΨαχΨχΣλεΠψΦ)var1;
         if (d.remove(var3.getName())) {
            εδδΠηδξΛΣχ.a(var1, c<"㺀">(l, m));
         } else {
            d.add(var3.getName());
            new ςφΓηΨΓδΛπαθΨη(this.a, var3, (boolean)(var2.length > o && var2[p].equalsIgnoreCase(c<"㺃">(q, r ^ s)) ? t : u));
            var3.o(c<"㺆">(v, w));
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ζρχθξεΨψκδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ξψθρΣΠΣς.B("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 66), ζρχθξεΨψκδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πψυκΠΨμΛΩβΣφμφσ.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߐߜߣߕߜߔ߈ߩߜߗў", (byte)28, 67) + var1 + ΣφδσΔζιΠρα.F("Ԓ", (byte)28, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -8462216638888597848L;
      long var0 = c ^ 5256249295194542490L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(26 + 42),
               (byte)(26 + 43),
               83,
               (byte)(3 + 44),
               (byte)(61 + 6),
               (byte)(28 + 38),
               (byte)(61 + 6),
               47,
               (byte)(70 + 10),
               (byte)(28 + 47),
               (byte)(8 + 59),
               (byte)(30 + 53),
               (byte)(35 + 18),
               (byte)(11 + 69),
               (byte)(53 + 44),
               (byte)(73 + 27),
               (byte)(51 + 49),
               (byte)(39 + 66),
               (byte)(37 + 73),
               (byte)(28 + 75)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               b[0] = πχσδΦΦνθΔπ.A("ţŒŤŽŒźŭŞžŠŔŉ", (byte)65, 65);
               b[1] = ζβησεθωυγτ.C("ӢҭҮӜӮӆӸӑӴӹәӏӊӔӌҿӫӸҾҺӯӎӋӌ", (byte)65, 67);
               b[2] = ΣδτΠνεγοΓορητ.E("ԨէՆՃձԱ՚կխոԼղսՂցՄՄդԺյՄ\u058c՛Չ֏սֆՃ֑մգ֑ց\u058bփՒ֗ջ֑֑ռծհե", (byte)65, 69);
               b[3] = χφπρψπφΦθμπ.A("ŧŕżŘŶıŪŐūļĻŉ", (byte)65, 65);
               b[4] = ςπυηννναΣ.A("ŖŲŉŝŝļżŌŲŖļƃţŻŕŚŧŘƇťƁŤƋšŒůſōōƉŕŏŮŴżƔƑŷƙƚŲųƀũ", (byte)65, 65);
               break;
            case 1:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.B("ŒĸŎŋžœŒĸŋŹŭœŏƄŵŒŅżƅśŦŧŔŕ", (byte)65, 66);
               b[1] = χΠξΦιζΨΣωΦσΨζ.A("ūĶķťŷŏƁŚŽƂšŃŞŐŵŸŷŢŅŠƍūţŌũŪŲũŶŪƔŐ", (byte)65, 65);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.F("ԨէՆՃձԱ՚կխոԼղսՂցՄՄդԺյՄ\u058c՛Չ֏սֆՃ֑մգ֑հՒ\u0590կհ֑լմ֎ֈջկռա֏֜ռհ։ըջճհձ", (byte)65, 70);
               b[3] = χφπρψπφΦθμπ.F("Շ\u0558ՂգՌՇդՍՇԼՌձՎՐփ՞ծՔՓպՂ։ՐՑ", (byte)65, 70);
               b[4] = ςπυηννναΣ.D("ӍөӀӔӔҳӳӃөӍҳӺӚӲӌӑӞӏӾӜӸӛԂӘӉӦӶӄӄԀӌӆӚӨӧӳӑԌԖԈӨӢԙӓӭԚӹӸԚӴӜԓӻӮӫӬ", (byte)65, 68);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.A("ŰőĹŋŔŵŠŬƀśŚťĸŗŚŦŲŚƂžŶŧŔŕ", (byte)65, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = οΩνΩρωλΨηΛδωδ.C("ӌӅӁӎӴӨӨҶӴӒӥӫӲәҼӰӜӸәӟӠԄӋӌ", (byte)65, 67);
         }
      }
   }

   static {
      b();
   }
}
