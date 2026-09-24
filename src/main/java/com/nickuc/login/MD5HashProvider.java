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

public final class MD5HashProvider extends NLoginCore_130 {
   private static int ab = Integer.reverse(536870912);
   private static long t = Long.reverse(-3215947522989533679L);
   private static long i = Long.reverse(-3215947522989533679L);
   private static int w = (0 >>> 93 | 0 << ~93 + 1) & -1;
   private static int s = (-1 >>> 198 | -1 << -198) & -1;
   private static int x = Integer.reverse(536870912);
   private static int ac = Integer.reverse(0);
   private static int an = Integer.reverse(-536870912);
   private static int ai = 2048 >>> 42 | 2048 << -42;
   private static long v = Long.reverse(-3215947522989533679L);
   private static long m = Long.reverse(6295654890016953873L);
   private static long ag = Long.reverse(-8935141660703064064L);
   private static long af = Long.reverse(6295654890016953873L);
   private static int am = (28672 >>> 44 | 28672 << -44) & -1;
   private static String[] d = new String[an];
   private static int ak = (1610612736 >>> 252 | 1610612736 << -252) & -1;
   private static long y = Long.reverse(6295654890016953873L);
   private static long al = Long.reverse(-3215947522989533679L);
   private static int r = Integer.reverse(1073741824);
   private static int u = Integer.reverse(-1073741824);
   private static int aj = Integer.reverse(-1073741824);
   private static long n = Long.reverse(-8935141660703064064L);
   private static int ad = 64 >>> 166 | 64 << -166;
   private static long z = Long.reverse(-8935141660703064064L);
   private static int c = Integer.reverse(0);
   private static String[] c = new String[am];
   private static int aa = Integer.reverse(-1073741824);
   private static int ah = Integer.reverse(0);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(-1);
   private static long f;
   private static int ae = 81920 >>> 14 | 81920 << ~14 + 1;

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 33L;
      var1 ^= 5236369277624323427L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(21 + 47),
                     69,
                     (byte)(46 + 37),
                     (byte)(45 + 2),
                     67,
                     (byte)(41 + 25),
                     (byte)(24 + 43),
                     (byte)(37 + 10),
                     (byte)(21 + 59),
                     (byte)(3 + 72),
                     (byte)(64 + 3),
                     (byte)(52 + 31),
                     (byte)(22 + 31),
                     (byte)(58 + 22),
                     (byte)(45 + 52),
                     (byte)(60 + 40),
                     (byte)(72 + 28),
                     (byte)(15 + 90),
                     (byte)(44 + 66),
                     (byte)(57 + 46)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.E("ղտվՁցսոց\u058cջՈֆ֊փֆ\u058cՎࢴࣤࢵࣣࣄࣦ࣏ࣗࣟ࣫ࢾࣲ", (byte)83, 69));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static void b() {
      f = -8616908076951962902L;
      long var0 = f ^ 5236369277624323427L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(16 + 52),
               (byte)(8 + 61),
               (byte)(3 + 80),
               47,
               (byte)(55 + 12),
               (byte)(54 + 12),
               (byte)(51 + 16),
               (byte)(14 + 33),
               (byte)(10 + 70),
               (byte)(70 + 5),
               (byte)(7 + 60),
               (byte)(15 + 68),
               (byte)(9 + 44),
               (byte)(3 + 77),
               (byte)(3 + 94),
               (byte)(2 + 98),
               (byte)(65 + 35),
               105,
               (byte)(71 + 39),
               (byte)(26 + 77)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_397.D("ԖԤ\u0557ԧԬ\u0557\u0530ՊԽԗԭԦ", (byte)99, 68);
               d[1] = NLoginCore_575.D("ԣԏԮ՚ԩ՝ԙԝ\u0530ՏԱԦ", (byte)99, 68);
               d[2] = NLoginCore_110.F("֗ւյ֚֜֙ֆշ֠ժ֜է", (byte)99, 70);
               d[3] = NLoginCore_530.D("ՖՁԴ՛ՙ\u0558ՅԶ՟ԩ՛Ԧ", (byte)99, 68);
               d[4] = NLoginCore_433.E("իՏ֕֍թ֊նէրշպէ", (byte)99, 69);
               d[5] = NLoginCore_232.F("\u0557ե֘ըխ֘ձ\u058bվ\u0558ծէ", (byte)99, 70);
               d[6] = NLoginCore_559.A("ƱƺƕŸƺƶŶŷǆƏƕǈƫǉǉƽǆƽƛƠƝƏƴǁǆǍǘǅƖƹǊƪƨǍƳƷǖǓǌƶƯǏƱǪǃǜƿǞǞǨǧǩǬǋƸƹ", (byte)99, 65);
               break;
            case 1:
               d[0] = NLoginCore_427.A("ƬƼŸƬŽƟƴƅƵƻƜƍ", (byte)99, 65);
               d[1] = NLoginCore_201.A("ƫƍƒƶǃƺƒƄǀƜƗƹǇƔƟƚƀǈǏƿǑǁƘƙ", (byte)99, 65);
               d[2] = NLoginCore_138.E("ոբօջ֕֗յ֍\u058b֙֜է", (byte)99, 69);
               d[3] = NLoginCore_553.E("զօ֍Ս\u0557ղո֓ի֡֠է", (byte)99, 69);
               d[4] = NLoginCore_092.B("żƶƳǀƟưƐǄƧƐƃƍ", (byte)99, 66);
               d[5] = NLoginCore_521.B("ƸƯƱƾƾƙƺƎƐƂƇƍ", (byte)99, 66);
               d[6] = NLoginCore_201.F("\u058b֔կՒ֔\u0590ՐՑ֠թկ֢օ֣֣֗֠֗յպշթ֎ֲ֛֧֠֟հ֤֓քւ֧֍ְ֑֦֭\u0590։֩\u058cր֑փֻׁ֢֖֤֓։ֺք֥־גֳ֢֭֓חֲ", (byte)99, 70);
               break;
            case 2:
               d[0] = NLoginCore_559.B("ƼƘƺŻƒǃƾƲƁƤƐƟƂǉƻƨƌǉƞƜǇǁƘƙ", (byte)99, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_004.B("ŴƳƎƌƟƖƢƁưƼƸŻƓƓƇƾƯƤǊơǐƫƘƙ", (byte)99, 66);
         }
      }
   }

   @Override
   public boolean i(String var1, String var2) {
      if (var2.contains(a(r & s, t))) {
         var2 = var2.split(a(u, v))[w];
      }

      String[] var3 = var2.split(a(x, y ^ z));
      if (var3.length != aa && var3.length != ab) {
         return (boolean)ac;
      } else {
         String var4 = var3[ad];
         if (!var4.equalsIgnoreCase(a(ae, af ^ ag))) {
            return (boolean)ah;
         } else {
            String var5 = var3[ai];
            String var6 = super.w(var1);
            switch (var3.length) {
               case 3:
                  return var5.equals(var6);
               case 4:
                  String var7 = var3[aj];
                  return var5.equals(super.w(var6 + var7));
               default:
                  throw new IllegalArgumentException(a(ak, al) + var3.length);
            }
         }
      }
   }

   public String C(String var1) {
      return super.w(var1);
   }

   public MD5HashProvider() {
      super(a(c & d, i));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  MD5HashProvider.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.D("ԪՌՎԮՒձթտիԺոծռնԿդֆօսփսՒ", (byte)111, 68), MD5HashProvider.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.F("֎֛֚՝֝֙֔֝֨֗դ֢֦֢֟֨ժ࣐ऀ࣑ࣿ࣠ࣳࣻइं࣫ࣚऎւ", (byte)111, 70) + var1 + NLoginCore_092.F("ե", (byte)111, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public String w(String var1) {
      return a(k, m ^ n) + super.w(var1);
   }
}
