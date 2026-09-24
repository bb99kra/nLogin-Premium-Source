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

public class ιΩΓΣΠμβλ extends ιΓαΩλςηναΩλγδΓ {
   private static long h = Long.reverse(-5527284108921195505L);
   private static int k = (0 >>> 206 | 0 << -206) & -1;
   private static int l = Integer.reverse(1073741824);
   private static int i = (0 >>> 69 | 0 << ~69 + 1) & -1;
   private static String[] a = new String[l];
   private static long c;
   private static long e = Long.reverse(-720575940379279360L);
   private static String[] b = new String[ιΩΓΣΠμβλ.m];
   private static int j = Integer.reverse(0);
   private static int m = Integer.reverse(1073741824);
   private static int f = 1073741824 >>> 62 | 1073741824 << ~62 + 1;
   private static long d = Long.reverse(4993124620616283151L);
   private static int g = (-1 >>> 92 | -1 << ~92 + 1) & -1;
   private static int c = (0 >>> 152 | 0 << ~152 + 1) & -1;

   @Override
   public void b(θΦγνΩερριδκ var1, String[] var2) {
      ΠΦχΣΨρλζΣ.a(this.a, var1, this.j());
   }

   static {
      b();
   }

   public ιΩΓΣΠμβλ(ΨγημιδξΓτοθαζ var1) {
      super(var1, c<"㺀">(c, d ^ e), c<"㺃">(f & g, h), (boolean)i, (boolean)j);
   }

   private static void b() {
      c = -1140280682385976670L;
      long var0 = c ^ -6284530646657877367L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(25 + 44),
               (byte)(66 + 17),
               (byte)(29 + 18),
               (byte)(20 + 47),
               (byte)(18 + 48),
               67,
               (byte)(10 + 37),
               (byte)(2 + 78),
               (byte)(34 + 41),
               (byte)(50 + 17),
               (byte)(43 + 40),
               (byte)(47 + 6),
               (byte)(7 + 73),
               (byte)(71 + 26),
               (byte)(66 + 34),
               (byte)(46 + 54),
               (byte)(83 + 22),
               (byte)(29 + 81),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(66 + 17)}, StandardCharsets.UTF_8));
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
               b[0] = οΩνΩρωλΨηΛδωδ.F("լբՉԨԻաթՏՒՔՖԻ", (byte)55, 70);
               b[1] = οΩνΩρωλΨηΛδωδ.A("įŒĺśŔłŝťĿĩŋłįĮŎŨľœţŨŨŹŀŁ", (byte)55, 65);
               break;
            case 1:
               b[0] = φδχεθοκψαλΛογλ.F("ՁեԸԿՋեժձՂՒԭՁթմ՛ՖՐռՍժխկՆՇ", (byte)55, 70);
               b[1] = ΣδτΠνεγοΓορητ.D("ҜҿҧӈӁүӊӒҬҖҸӚӑӑҘәӂһӗҜӤӐәӘӄӜҵӂӗӡӅҩ", (byte)55, 68);
               break;
            case 2:
               b[0] = φδχεθοκψαλΛογλ.A("ŚŧĴłĺĽũĶĨŭŬŀŊŋŒĲŢũŤŸĸŃŀŁ", (byte)55, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = οΩνΩρωλΨηΛδωδ.F("ԸԶՉդկԩդՑՅձխէԯԳոՔԻէՒղ\u0558տՆՇ", (byte)55, 70);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 111L;
      var1 ^= -6284530646657877367L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(12 + 57),
                     (byte)(26 + 57),
                     (byte)(8 + 39),
                     (byte)(31 + 36),
                     (byte)(43 + 23),
                     (byte)(45 + 22),
                     (byte)(4 + 43),
                     (byte)(54 + 26),
                     (byte)(51 + 24),
                     67,
                     (byte)(12 + 71),
                     (byte)(33 + 20),
                     (byte)(23 + 57),
                     (byte)(46 + 51),
                     (byte)(55 + 45),
                     (byte)(46 + 54),
                     (byte)(89 + 16),
                     (byte)(39 + 71),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χφπρψπφΦθμπ.A("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҇ѸѣѴѲҏ҆Ґ", (byte)31, 65));
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
                  ιΩΓΣΠμβλ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.B("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 66), ιΩΓΣΠμβλ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΦδφπθΩΩλζξ.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй߄\u07b5ޠޱޯߌ߃ߍэ", (byte)23, 67) + var1 + ντθΔζβΔζ.F("ԍ", (byte)23, 70) + var2.toString(), var4
         );
      }
   }
}
