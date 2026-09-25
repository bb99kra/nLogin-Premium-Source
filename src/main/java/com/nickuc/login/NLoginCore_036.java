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

public enum NLoginCore_036 {
   c(NLoginCore_315.u, a(NLoginCore_036.m, NLoginCore_036.n ^ NLoginCore_036.o), (NLoginCore_036 != 0).p, NLoginCore_036.q),
   d(NLoginCore_315.v, a(NLoginCore_036.u, NLoginCore_036.v ^ NLoginCore_036.w), (NLoginCore_036 != 0).x, NLoginCore_036.y),
   e(NLoginCore_315.w, a(NLoginCore_036.ad, NLoginCore_036.ae), (NLoginCore_036 != 0).af, NLoginCore_036.ag),
   f(NLoginCore_315.A, a(NLoginCore_036.al, NLoginCore_036.am ^ NLoginCore_036.an), (NLoginCore_036 != 0).ao, NLoginCore_036.ap),
   g(NLoginCore_315.y, a(NLoginCore_036.au & NLoginCore_036.av, NLoginCore_036.aw), (NLoginCore_036 != 0).ax, NLoginCore_036.ay);

   private final NLoginCore_315 a;
   private final String at;
   private final boolean S;
   private final int E;
   private static String[] a;
   private static String[] b = new String[NLoginCore_036.h];
   private static long c;
   private static int a = (20971520 >>> 86 | 20971520 << -86) & -1;
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = (67108864 >>> 89 | 67108864 << -89) & -1;
   private static int e = (805306368 >>> 28 | 805306368 << -28) & -1;
   private static int f = (2097152 >>> 211 | 2097152 << ~211 + 1) & -1;
   private static int g = (1280 >>> 199 | 1280 << -199) & -1;
   private static int h = (5242880 >>> 211 | 5242880 << -211) & -1;
   private static int i = Integer.reverse(0);
   private static long j = Long.reverse(6266546287520421823L);
   private static long k = Long.reverse(-6917529027641081856L);
   private static int l = Integer.reverse(0);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long n = Long.reverse(6266546287520421823L);
   private static long o = Long.reverse(-6917529027641081856L);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int q = Integer.reverse(1462763520);
   private static int r = 1048576 >>> 147 | 1048576 << -147;
   private static long s = Long.reverse(-650982740120660033L);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int u = (48 >>> 228 | 48 << -228) & -1;
   private static long v = Long.reverse(6266546287520421823L);
   private static long w = Long.reverse(-6917529027641081856L);
   private static int x = (8388608 >>> 87 | 8388608 << ~87 + 1) & -1;
   private static int y = 1342177383 >>> 59 | 1342177383 << -59;
   private static int z = (16384 >>> 140 | 16384 << -140) & -1;
   private static long aa = Long.reverse(6266546287520421823L);
   private static long ab = Long.reverse(-6917529027641081856L);
   private static int ac = 4 >>> 161 | 4 << ~161 + 1;
   private static int ad = 1073741825 >>> 30 | 1073741825 << ~30 + 1;
   private static long ae = Long.reverse(-650982740120660033L);
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static int ag = (88997888 >>> 110 | 88997888 << ~110 + 1) & -1;
   private static int ah = Integer.reverse(1610612736);
   private static long ai = Long.reverse(6266546287520421823L);
   private static long aj = Long.reverse(-6917529027641081856L);
   private static int ak = 98304 >>> 79 | 98304 << -79;
   private static int al = Integer.reverse(-536870912);
   private static long am = Long.reverse(6266546287520421823L);
   private static long an = Long.reverse(-6917529027641081856L);
   private static int ao = Integer.reverse(0);
   private static int ap = -1 >>> 69 | -1 << -69;
   private static int aq = Integer.reverse(268435456);
   private static long ar = Long.reverse(6266546287520421823L);
   private static long as = Long.reverse(-6917529027641081856L);
   private static int at = Integer.reverse(536870912);
   private static int au = Integer.reverse(-1879048192);
   private static int av = Integer.reverse(-1);
   private static long aw = Long.reverse(-650982740120660033L);
   private static int ax = Integer.reverse(0);
   private static int ay = (-1 >>> 253 | -1 << -253) & -1;

   static {
      a = new String[g];
      b();
   }

   @Generated
   private NLoginCore_036(NLoginCore_315 var3, String var4, boolean var5, int var6) {
      this.a = var3;
      this.at = var4;
      this.S = var5;
      this.E = var6;
   }

   public String v() {
      return this.at;
   }

   public NLoginCore_315 a() {
      return this.a;
   }

   public int i() {
      return this.E;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_036.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.E("ՍկձՑյ֔\u058c֢֎՝֛֑֟֙բև֦֩֨֠֠յ", (byte)105, 69), NLoginCore_036.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.A("ƴǁǀƃǃƿƺǃǎƽƊǈǌǅǈǎƐԣԆԤԥԢԝԠԥԪԨԫԐƨ", (byte)105, 65) + var1 + NLoginCore_232.A("Ƌ", (byte)105, 65) + var2.toString(), var4
         );
      }
   }

   public boolean aa() {
      return this.S;
   }

   private static String a(int var0, long var1) {
      var1 ^= 5L;
      var1 ^= 911073802898403607L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(2 + 66),
                     (byte)(24 + 45),
                     (byte)(62 + 21),
                     (byte)(7 + 40),
                     (byte)(35 + 32),
                     (byte)(28 + 38),
                     (byte)(35 + 32),
                     (byte)(29 + 18),
                     (byte)(78 + 2),
                     (byte)(20 + 55),
                     (byte)(23 + 44),
                     (byte)(28 + 55),
                     (byte)(15 + 38),
                     (byte)(5 + 75),
                     (byte)(78 + 19),
                     100,
                     (byte)(53 + 47),
                     (byte)(99 + 6),
                     (byte)(55 + 55),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(37 + 46)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.B("ǘǥǤƧǧǣǞǧǲǡƮǬǰǩǬǲƴՇԪՈՉՆՁՄՉՎՌՏԴ", (byte)123, 66));
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
      c = -150505302066925718L;
      long var0 = c ^ 911073802898403607L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(12 + 57),
               (byte)(55 + 28),
               (byte)(31 + 16),
               (byte)(47 + 20),
               (byte)(43 + 23),
               67,
               (byte)(44 + 3),
               (byte)(19 + 61),
               (byte)(74 + 1),
               (byte)(22 + 45),
               (byte)(32 + 51),
               (byte)(28 + 25),
               (byte)(5 + 75),
               (byte)(55 + 42),
               (byte)(84 + 16),
               (byte)(25 + 75),
               (byte)(4 + 101),
               110,
               (byte)(80 + 23)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_384.A("ƚƳƚƞƵŻƴƓƝƛƁƋ", (byte)98, 65);
               b[1] = NLoginCore_091.F("քա֏֎֕֍էվ֏\u058cթզ", (byte)98, 70);
               b[2] = NLoginCore_091.F("Օկխջե\u058bն֗֙ջ՜զ", (byte)98, 70);
               b[3] = NLoginCore_173.B("ŹƲƮƶƌƫƑƠƱƹŽƋ", (byte)98, 66);
               b[4] = NLoginCore_232.B("ƥƨƨƟƵƀƢǂƂƭǃƼƲƱƟǃƦƧƹǅƸǏƖƗ", (byte)98, 66);
               b[5] = NLoginCore_384.B("ƔƌƦƵƲƽƢƖƴƚƂƚƢǀǂƶƇƛƫƨƍƿƖƗ", (byte)98, 66);
               b[6] = NLoginCore_446.A("ƝƊŷƈƙơƴơƎƘƸƋ", (byte)98, 65);
               b[7] = NLoginCore_384.F("Օհ֗֒օ֘֗հ։\u058c֓զ", (byte)98, 70);
               b[8] = NLoginCore_138.D("ՇԪԷԪԩԷԱ՛ԒԦԕԣ", (byte)98, 68);
               b[9] = NLoginCore_453.F("֊խպխլպմ֞Օթ\u0558զ", (byte)98, 70);
               break;
            case 1:
               b[0] = NLoginCore_427.F("շե\u058cկֈ֛ջիս֗յՠՠ֝֘ղ֤֚֡֙֩֟ձղ", (byte)98, 70);
               b[1] = NLoginCore_141.C("ԬՑԬԸՍԵԯԹԎՌԻԝ\u0558ՀՀԵԠԝՄՒՄէԮԯ", (byte)98, 67);
               b[2] = NLoginCore_183.C("ԋԿԱԕ\u0557ԐԕԓՍՊԶԣ", (byte)98, 67);
               b[3] = NLoginCore_076.F("Փա֍քքմ֒ջ֚ո՜ջփնգհքբւ֪֚֙ձղ", (byte)98, 70);
               b[4] = NLoginCore_141.D("ԽՀՀԷՍԘԺ՚ԚՅՙՠԵԛԢաՌԢՓաԴՁԮԯ", (byte)98, 68);
               b[5] = NLoginCore_324.C("ԬԤԾՍՊՕԺԮՌԲԚԑ՟Ե՚ԚԳ՚ՅՑթՁԮԯ", (byte)98, 67);
               b[6] = NLoginCore_183.F("և֒ալ\u0558չ\u058b\u058bջ֙֝ն֟ր֣֙\u0590֩և֖֪֪ձղ", (byte)98, 70);
               b[7] = NLoginCore_384.F("ոևո\u0558ֆէ՝\u0590֔րհհ֤֙֙նշսպճռ֪ձղ", (byte)98, 70);
               b[8] = NLoginCore_387.B("ƷƬƶƏƏƲŹƃƴǄƚƋ", (byte)98, 66);
               b[9] = NLoginCore_091.B("ƨƻŰƚƐƼƺƯǁơƒƋ", (byte)98, 66);
               break;
            case 2:
               b[0] = NLoginCore_092.A("ƖŶƾƷŹƓƋƹƻŽưƋ", (byte)98, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_027.E("ն\u058b֖ձ֖խՙ֏որսզ", (byte)98, 69);
         }
      }
   }
}
