package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_307 implements NLoginInterface_016 {
   private static String[] b = new String[NLoginCore_307.n];
   private static int o = Integer.reverse(1073741824);
   private static long e = Long.reverse(-3891110078048108544L);
   private static int n = Integer.reverse(-1073741824);
   private static int k = Integer.reverse(0);
   private static int i = Integer.reverse(-1);
   private static long d = Long.reverse(1309290883186525864L);
   private static long j = Long.reverse(-2870049571013294424L);
   private static int a = (Integer.MIN_VALUE >>> 254 | Integer.MIN_VALUE << -254) & -1;
   private static int m = (12288 >>> 108 | 12288 << -108) & -1;
   private static int f = (96256 >>> 75 | 96256 << ~75 + 1) & -1;
   private static long q = Long.reverse(-3891110078048108544L);
   private static int b = (0 >>> 141 | 0 << -141) & -1;
   private final NLoginCore_276 c;
   private static String[] a = new String[m];
   private static long p = Long.reverse(1309290883186525864L);
   private static long c;
   private static final String cw = a(o, p ^ q);
   private static int l = Integer.reverse(0);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int g = Integer.reverse(Integer.MIN_VALUE);

   private static String a(int var0, long var1) {
      var1 ^= 83L;
      var1 ^= 8699733987026181794L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(5 + 63),
                     (byte)(25 + 44),
                     (byte)(48 + 35),
                     (byte)(44 + 3),
                     (byte)(5 + 62),
                     (byte)(58 + 8),
                     (byte)(63 + 4),
                     (byte)(10 + 37),
                     (byte)(78 + 2),
                     (byte)(26 + 49),
                     67,
                     (byte)(69 + 14),
                     (byte)(46 + 7),
                     (byte)(6 + 74),
                     (byte)(17 + 80),
                     (byte)(89 + 11),
                     (byte)(93 + 7),
                     (byte)(46 + 59),
                     110,
                     (byte)(33 + 70)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.A("ìùø»û÷òûĆõÂĀĄýĀĆÈыћѢџѐвѨчєѝѨрѢ", (byte)5, 65));
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
      c = 1540723589220783176L;
      long var0 = c ^ 8699733987026181794L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(10 + 58),
               (byte)(37 + 32),
               (byte)(25 + 58),
               (byte)(3 + 44),
               (byte)(63 + 4),
               (byte)(60 + 6),
               67,
               (byte)(35 + 12),
               (byte)(35 + 45),
               (byte)(2 + 73),
               (byte)(43 + 24),
               (byte)(28 + 55),
               (byte)(32 + 21),
               (byte)(46 + 34),
               (byte)(60 + 37),
               (byte)(41 + 59),
               (byte)(3 + 97),
               (byte)(11 + 94),
               110,
               (byte)(35 + 68)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_241.D("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪՇ\u0530՜՞\u0558ԿաԺԯԽԿ", (byte)94, 68);
               b[1] = NLoginCore_232.B("ƱƓƨƸƳƐƖƄƚƦƆƃ", (byte)94, 66);
               b[2] = NLoginCore_446.A("ŲƔƋŭŴűƕƶƇƚƸŵƀƾƺźƶƠƀƖƖƳƜǈǊǄƫǍƦƛƩƫ", (byte)94, 65);
               break;
            case 1:
               b[0] = NLoginCore_241.C("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪՉՕԟՎԚ\u0558\u0558՞եզՈ", (byte)94, 67);
               b[1] = NLoginCore_559.A("ƀůƆűƭŴƧƫƸŴƼƃ", (byte)94, 65);
               b[2] = NLoginCore_553.C("ԆԨԟԁԈԅԩՊԛԮՌԉԔՒՎԎՊԴԔԪԪԶԹԹՊԱԔԽԷԺՆՆ", (byte)94, 67);
               break;
            case 2:
               b[0] = NLoginCore_183.D("ԣԅԛԕՁՀԠՊԛ\u0530ԤՉԾԴԍԮՃԶԵԔԧԓՓԸԞՀՕ՟ԭՃԽԙ", (byte)94, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_004.C("ԑӿԓԢԭԜԇԞԪՇԫԭՍՋԎԮ\u0530ԨՇԩԶՋԢԣ", (byte)94, 67);
         }
      }
   }

   @Override
   public boolean filter(String var1, String var2, Object... var3) {
      if (var3.length == a && var2.contains(a(b, d ^ e))) {
         String var4 = f + (String)var3[g];
         String var5 = var4.split(a(h & i, j))[k].toLowerCase(Locale.ENGLISH);
         return this.c.a().stream().anyMatch(var5::equals);
      } else {
         return (boolean)l;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_307.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_307.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.F("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձࣴऄऋईࣹࣛऑࣰࣽआऑࣩऋ֊", (byte)118, 70) + var1 + NLoginCore_433.A("ƥ", (byte)118, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Generated
   private NLoginCore_307(NLoginCore_276 var1) {
      this.c = var1;
   }
}
