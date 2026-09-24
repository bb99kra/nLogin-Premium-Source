package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum βθσπψλΓωυΨλω {
   b,
   c,
   d;

   private static String[] a = new String[βθσπψλΓωυΨλω.ad];
   private static String[] b = new String[βθσπψλΓωυΨλω.ae];
   private static long c;
   private static int a = -1 >>> 14 | -1 << ~14 + 1;
   private static int b = Integer.reverse(0);
   private static long d = Long.reverse(-4832793292562618256L);
   private static int e = 0 >>> 78 | 0 << ~78 + 1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(5111154684671436912L);
   private static long h = Long.reverse(-432345564227567616L);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int j = (2048 >>> 10 | 2048 << -10) & -1;
   private static long k = Long.reverse(5111154684671436912L);
   private static long l = Long.reverse(-432345564227567616L);
   private static int m = 134217728 >>> 154 | 134217728 << -154;
   private static int n = Integer.reverse(-1);
   private static int o = Integer.reverse(-1073741824);
   private static long p = Long.reverse(5111154684671436912L);
   private static long q = Long.reverse(-432345564227567616L);
   private static int r = (0 >>> 105 | 0 << -105) & -1;
   private static int s = Integer.reverse(536870912);
   private static int t = Integer.reverse(-1);
   private static long u = Long.reverse(-4832793292562618256L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int w = Integer.reverse(-1610612736);
   private static long x = Long.reverse(-4832793292562618256L);
   private static int y = Integer.reverse(1073741824);
   private static int z = Integer.reverse(-1073741824);
   private static int aa = Integer.reverse(0);
   private static int ab = (16777216 >>> 56 | 16777216 << -56) & -1;
   private static int ac = Integer.MIN_VALUE >>> 62 | Integer.MIN_VALUE << ~62 + 1;
   private static int ad = Integer.reverse(-1879048192);
   private static int ae = (144 >>> 36 | 144 << -36) & -1;
   private static int af = Integer.reverse(1610612736);
   private static int ag = -1 >>> 199 | -1 << -199;
   private static long ah = Long.reverse(-4832793292562618256L);
   private static int ai = 0 >>> 94 | 0 << ~94 + 1;
   private static int aj = Integer.reverse(-536870912);
   private static long ak = Long.reverse(5111154684671436912L);
   private static long al = Long.reverse(-432345564227567616L);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int an = 4 >>> 63 | 4 << ~63 + 1;
   private static long ao = Long.reverse(-4832793292562618256L);
   private static int ap = Integer.reverse(1073741824);

   private static String a(int var0, long var1) {
      var1 ^= 95L;
      var1 ^= -4979213448393804753L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(6 + 63),
                     (byte)(35 + 48),
                     (byte)(22 + 25),
                     (byte)(30 + 37),
                     (byte)(57 + 9),
                     (byte)(23 + 44),
                     (byte)(45 + 2),
                     (byte)(38 + 42),
                     (byte)(55 + 20),
                     (byte)(51 + 16),
                     (byte)(59 + 24),
                     (byte)(41 + 12),
                     (byte)(40 + 40),
                     (byte)(81 + 16),
                     100,
                     (byte)(13 + 87),
                     (byte)(65 + 40),
                     110,
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζοηκορΦνΣθγΩ.B("ìùø»û÷òûĆõÂĀĄýĀĆÈьѓџѝѦњгѪѧыџѮ", (byte)5, 66));
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
                  βθσπψλΓωυΨλω.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΣφδσΔζιΠρα.B("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 66), βθσπψλΓωυΨλω.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ιΠοθΩΦξκ.A("ŠŭŬįůūŦůźũĶŴŸűŴźļӀӇӓӑӚӎҧӞӛҿӓӢŔ", (byte)63, 65) + var1 + ΣδτΠνεγοΓορητ.C("Ҭ", (byte)63, 67) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 1014532370555893602L;
      long var0 = c ^ -4979213448393804753L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(22 + 47),
               83,
               (byte)(41 + 6),
               (byte)(6 + 61),
               (byte)(5 + 61),
               67,
               (byte)(6 + 41),
               (byte)(55 + 25),
               (byte)(27 + 48),
               (byte)(61 + 6),
               (byte)(58 + 25),
               (byte)(2 + 51),
               (byte)(61 + 19),
               (byte)(21 + 76),
               (byte)(20 + 80),
               (byte)(25 + 75),
               (byte)(97 + 8),
               (byte)(61 + 49),
               (byte)(5 + 98)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
               b[0] = βθκςνθΩθυμςτκχ.C("ՑԞՆԸԽԡՊիԷՔՂ՟ԪՀՋՋՑԽԳՖշհՂԺՈձ\u0557ձԸյ\u0558՜", (byte)103, 67);
               b[1] = θεωψξβΛσσ.C("ՑԞՆԸԽԡՊիԷՔՄԪԮՊ՟ԮԻէՒխթաՅյՐջպթըԷվյ", (byte)103, 67);
               b[2] = ΣφδσΔζιΠρα.F("֊\u0557տձն՚փ֤հ֍պ֧֒ք֥ջ\u058b֝֏֩վ֥֢֟ւլ֠ծַ֧֦փ", (byte)103, 70);
               b[3] = βθκςνθΩθυμςτκχ.A("ǃƳƽƥǁƹƺƃƿǂǊƕ", (byte)103, 65);
               b[4] = χΠξΦιζΨΣωΦσΨζ.C("՜՜ԹգԢԷԨթդզժժեԨ՞ՐԲ\u0530գհՔզԽԾ", (byte)103, 67);
               b[5] = ςπυηννναΣ.D("ԸՁզՒ\u0558բեՋԳԾՉ՞ԹԸՈՐԥծժՠգզԽԾ", (byte)103, 68);
               b[6] = φδχεθοκψαλΛογλ.F("պՏֆջ֎֛֚֗պծեի", (byte)103, 70);
               b[7] = οοθδΨιοΦΠβδζ.C("ՍԶ\u0557ՙԤաԩԧԦՙՅԶՃ՜Ոկբ՟Սզ\u0530նԽԾ", (byte)103, 67);
               b[8] = μζξτΩσσφυδεπλΨ.C("ՏԣԥՂգ\u0557ԣզԥՕԤԲ", (byte)103, 67);
               break;
            case 1:
               b[0] = ΦδφπθΩΩλζξ.D("ՑԞՆԸԽԡՊիԷՔՂ՟ԪՀՋՋՑԽԳՖշզհՋձՔծճմ՛՚Լ", (byte)103, 68);
               b[1] = χΠξΦιζΨΣωΦσΨζ.E("֊\u0557տձն՚փ֤հ֍սգէփ֘էմ֠\u058b֦֢\u0590֫ֆ֪լմ֪փյյֹ֪պչ׀֪֫\u0590֯֍֒׀\u058b", (byte)103, 69);
               b[2] = ΨΦνΨΦωυΩνβςμ.C("ՑԞՆԸԽԡՊիԷՔՁՙծՋլՂՒդՖհՅէՋՖՇՑշժՉՀպպ", (byte)103, 67);
               b[3] = μζξτΩσσφυδεπλΨ.C("ԫԳԽՎՙԠԾՁՓՠՁՏԧՍիըթԼՖՑՂնԽԾ", (byte)103, 67);
               b[4] = ζβησεθωυγτ.A("ƿƿƜǆƅƚƋǌǇǉǋǑƥƳƽƪƮƮǋƓǇǉƠơ", (byte)103, 65);
               b[5] = ΦδφπθΩΩλζξ.C("ԸՁզՒ\u0558բեՋԳԾՋ՜ՁՇժՍըԼԭգՁզԽԾ", (byte)103, 67);
               b[6] = ΣερμΔσατσκ.E("֝ֈ֊֒֝\u0590֛֠հքնի", (byte)103, 69);
               b[7] = ΨΦνΨΦωυΩνβςμ.C("ՍԶ\u0557ՙԤաԩԧԦՙՆՠհԻՂբՃլձԴԶնԽԾ", (byte)103, 67);
               b[8] = ντθΔζβΔζ.A("ƅƓƜƛƩƛƟǃǏƉưǒƭǑƏƎƷǘƘǖƩǉƠơ", (byte)103, 65);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.D("ԵՖՄՄ՛ԧԛԣԢԪԾբԮՆԽխկՊղէ\u0558ՐԽԾ", (byte)103, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ξψθρΣΠΣς.E("սՏ֖֑֘Փճ֏֍փՠա՞֨ռւզ֧ն֣ը։նշ", (byte)103, 69);
         }
      }
   }

   static {
      b();
   }

   @Nullable
   public static βθσπψλΓωυΨλω a(String var0) {
      String var1 = var0.toLowerCase(Locale.ENGLISH);
      int var2 = a;
      switch (var1.hashCode()) {
         case -939109690:
            if (var1.equals(c<"㺀">(b, d))) {
               var2 = e;
            }
            break;
         case 969739184:
            if (var1.equals(c<"㺃">(f, g ^ h))) {
               var2 = i;
            }
            break;
         case 1116541544:
            if (var1.equals(c<"㺆">(j, k ^ l))) {
               var2 = m;
            }
      }

      switch (var2) {
         case 0:
            return b;
         case 1:
            return c;
         case 2:
            return d;
         default:
            return null;
      }
   }

   @Nullable
   public static βθσπψλΓωυΨλω b(String var0) {
      int var2 = n;
      switch (var0.hashCode()) {
         case -1039101593:
            if (var0.equals(c<"㺆">(w, x))) {
               var2 = y;
            }
            break;
         case -438016337:
            if (var0.equals(c<"㺃">(s & t, u))) {
               var2 = v;
            }
            break;
         case 1527456893:
            if (var0.equals(c<"㺀">(o, p ^ q))) {
               var2 = r;
            }
      }

      switch (var2) {
         case 0:
            return b;
         case 1:
            return c;
         case 2:
            return d;
         default:
            return null;
      }
   }
}
