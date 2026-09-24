package com.nickuc.login;

import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_236 implements Iterator<AccountData> {
   private static int aa = Integer.reverse(536870912);
   private static int q = Integer.reverse(-1073741824);
   private static int ab = Integer.reverse(-1);
   private static int v = 0 >>> 16 | 0 << ~16 + 1;
   private static int m = Integer.reverse(-1);
   private static int ad = Integer.reverse(-1610612736);
   private static long ac = Long.reverse(12577884303918739L);
   private final NLoginCore_291 a;
   private static int y = Integer.reverse(0);
   private static int c = (0 >>> 183 | 0 << -183) & -1;
   private static long af = Long.reverse(12577884303918739L);
   private static String[] b = new String[NLoginCore_236.ah];
   private static int u = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static int k = 0 >>> 72 | 0 << ~72 + 1;
   private static int j = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & -1;
   private static int a = (512 >>> 137 | 512 << -137) & -1;
   private static int t = (128 >>> 134 | 128 << -134) & -1;
   private static int g = Integer.reverse(0);
   private static int ah = 12 >>> 161 | 12 << ~161 + 1;
   private static long n = Long.reverse(12577884303918739L);
   private static String[] a = new String[NLoginCore_236.ag];
   private static int d = Integer.reverse(-1);
   private static int f = Integer.reverse(1073741824);
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(1021384200834909843L);
   private final long a;
   private static int i = (2048 >>> 139 | 2048 << -139) & -1;
   private static int ag = Integer.reverse(1610612736);
   private static long p = Long.reverse(12577884303918739L);
   private static int ae = Integer.reverse(-1);
   private static int z = Integer.reverse(8388608);
   private static int o = Integer.reverse(1073741824);
   private static int x = (33554432 >>> 217 | 33554432 << ~217 + 1) & -1;
   private long b;
   private static long s = Long.reverse(1008806316530991104L);
   private static long e = Long.reverse(12577884303918739L);
   private static int b = (0 >>> 76 | 0 << -76) & -1;
   private final NLoginCore_459 a;
   private static long c;

   @Override
   public void remove() {
      this.b++;
   }

   private static void b() {
      c = -3936023310701874064L;
      long var0 = c ^ 3680545283428866962L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(10 + 58),
               (byte)(26 + 43),
               (byte)(3 + 80),
               47,
               (byte)(55 + 12),
               (byte)(46 + 20),
               (byte)(5 + 62),
               (byte)(38 + 9),
               (byte)(59 + 21),
               (byte)(35 + 40),
               (byte)(35 + 32),
               (byte)(8 + 75),
               (byte)(14 + 39),
               (byte)(40 + 40),
               (byte)(56 + 41),
               (byte)(21 + 79),
               (byte)(3 + 97),
               (byte)(68 + 37),
               (byte)(12 + 98),
               (byte)(59 + 44)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_076.D("Ѩях҆ѓҔѡѯ҈ѥ҇ѸѳѾҒҖ҂ҞѰѬѳѾѲѥҚѿҪ҃ѬҖҍҬҁ҅Ҟң҃҄ѲҹҗѳҖҌҬҫҺ҈ғҪҾҬҵҜҨӅ҆҄ҙӀҟҙҎ҉", (byte)33, 68);
               b[1] = NLoginCore_387.E("ՌԔՌԩԩԺԬՓՕԪՈԞԱ՛\u0530ՄաՐ\u0557ՙՓիԨԨ\u0557ԿՌ՜եկիՔ", (byte)33, 69);
               b[2] = NLoginCore_451.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįİđĭĜľŋĬĚŒōńĩ", (byte)33, 66);
               b[3] = NLoginCore_387.C("Ѩях҆ѓҔѡѯ҈ѥ҇ѸѳѾҒҖ҂ҞѰѬѳѾѲѥҚѿҪ҃ѬҖҍҬҝҞ҆ѮҝѳҤѳ҆ҰғѸѵҝҒҡҸғҴҷҭҞҋҌ", (byte)33, 67);
               b[4] = NLoginCore_427.D("҇я҇ѤѤѵѧҎҐѥ҃љѬҖѫѿҜҋҒҔҎҦѣѣҒѺ҇җҠҪҦҏ", (byte)33, 68);
               b[5] = NLoginCore_397.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįİđĭĜľŋĬĚŒōńĩ", (byte)33, 66);
               break;
            case 1:
               b[0] = NLoginCore_201.F("ԭԔԊՋԘՙԦԴՍԪՌԽԸՃ\u0557՛ՇգԵԱԸՃԷԪ՟ՄկՈԱ՛ՒձՆՊգըՈՉԷվ՜Ը՛ՑձհտՍ\u0558կփձպ\u0557իՇտ֏՚ՏտՎ֍Շ", (byte)33, 70);
               b[1] = NLoginCore_521.F("ՌԔՌԩԩԺԬՓՕԪՈԞԱ՛\u0530ՄաՐ\u0557ՙՓԨաՆԼբԭԭդԿԿԮԶՖոըգճՑՏԾհղՅ", (byte)33, 70);
               b[2] = NLoginCore_091.A("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįēħĦŐřĖœęĿŖŕŃĴŖņśŝŗřŝĦķĴĵ", (byte)33, 65);
               b[3] = NLoginCore_324.A("đøîįüĽĊĘıĎİġĜħĻĿīŇęĕĜħěĎŃĨœĬĕĿĶŕņŇįėņĜōĜįřĿĲłŞŇĩŃĤţŊĬŝĴĵ", (byte)33, 65);
               b[4] = NLoginCore_223.C("҇я҇ѤѤѵѧҎҐѥ҃љѬҖѫѿҜҋҒҔҎѤѝѤ҅ҕѴѸѼҥ҉қ", (byte)33, 67);
               b[5] = NLoginCore_127.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįŚŚœďĩĘĮŒĿİţřĞğĠĻŧĵŪňŬŝĴĵ", (byte)33, 66);
               break;
            case 2:
               b[0] = NLoginCore_092.F("ԪՅՍՄԐԘԘԴԻԵԶ\u0557ԛՄՕԞՠ\u0530ԲԥՕԳ\u0530Ա", (byte)33, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.D("҃ьѫѭѵѤёїҌҖѳѠ", (byte)33, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 112L;
      var1 ^= 3680545283428866962L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(7 + 61),
                     (byte)(51 + 18),
                     (byte)(76 + 7),
                     (byte)(2 + 45),
                     (byte)(36 + 31),
                     66,
                     (byte)(21 + 46),
                     (byte)(35 + 12),
                     (byte)(3 + 77),
                     (byte)(8 + 67),
                     (byte)(62 + 5),
                     (byte)(74 + 9),
                     (byte)(33 + 20),
                     (byte)(71 + 9),
                     97,
                     (byte)(66 + 34),
                     (byte)(94 + 6),
                     (byte)(42 + 63),
                     (byte)(104 + 6),
                     (byte)(33 + 70)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.F("\u058b֘֗՚֖֑֥֚֚֔ա֣֥֟֜֟էࣰःࣵःࣷंࣲࣚࣧࣿऊँइआऍ", (byte)108, 70));
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

   public AccountData next() {
      this.b++;

      try {
         NLoginCore_459 var10000 = this.a;
         String var10001 = a(c & d, e);
         Object[] var10002 = new Object[f];
         var10002[g] = NLoginCore_477.e.a(new Object[h]);
         var10002[i] = NLoginCore_436.a.getName();
         var10001 = String.format(var10001, var10002);
         var10002 = new Object[j];
         var10002[k] = this.b;
         NLoginCore_171 var1 = var10000.a(var10001, var10002);

         AccountDataImpl var4;
         label56: {
            try {
               ResultSet var2 = var1.d();
               if (var2.next()) {
                  ForceRegisterConfig var3 = this.a.a(var2);
                  if (var3 != null) {
                     var4 = NLoginType_024.from(var3);
                     break label56;
                  }

                  throw new RuntimeException(a(l & m, n));
               }
            } catch (Throwable var6) {
               if (var1 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }
               }

               throw var6;
            }

            if (var1 != null) {
               var1.close();
            }

            return null;
         }

         if (var1 != null) {
            var1.close();
         }

         return var4;
      } catch (SQLException var7) {
         throw new RuntimeException(var7);
      } catch (Exception var8) {
         throw new RuntimeException(a(o, p), var8);
      }
   }

   static {
      b();
   }

   @Override
   public void forEachRemaining(Consumer<? super AccountData> var1) {
      try {
         NLoginCore_459 var10000 = this.a;
         String var10001 = a(q, r ^ s);
         Object[] var10002 = new Object[t];
         var10002[u] = NLoginCore_477.e.a(new Object[v]);
         var10002[w] = NLoginCore_436.a.getName();
         var10001 = String.format(var10001, var10002);
         var10002 = new Object[x];
         var10002[y] = this.b;
         NLoginCore_288 var2 = var10000.a(var10001, var10002);

         try {
            PreparedStatement var3 = var2.d();
            var3.setFetchSize(z);
            ResultSet var4 = var3.executeQuery();

            try {
               while (var4.next()) {
                  ForceRegisterConfig var5 = this.a.a(var4);
                  if (var5 == null) {
                     throw new RuntimeException(a(aa & ab, ac));
                  }

                  var1.accept(NLoginType_024.from(var5));
               }
            } catch (Throwable var9) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }
               }

               throw var9;
            }

            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var10) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var7) {
                  var10.addSuppressed(var7);
               }
            }

            throw var10;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (SQLException var11) {
         throw new RuntimeException(var11);
      } catch (Exception var12) {
         throw new RuntimeException(a(ad & ae, af), var12);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_236.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.A("×ùûÛÿĞĖĬĘçĥěĩģìđĳĲĪİĪÿ", (byte)24, 65), NLoginCore_236.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.D("ѠѭѬЯѯѫѦѯѺѩжѴѸѱѴѺм߅ߘߊߘߌߗޯ߇\u07bcߔߟߖߜߛߢї", (byte)24, 68) + var1 + NLoginCore_575.F("Ԏ", (byte)24, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_236(NLoginCore_291 var1, NLoginCore_459 var2, long var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   @Override
   public boolean hasNext() {
      return (boolean)(this.b <= this.a ? a : b);
   }
}
