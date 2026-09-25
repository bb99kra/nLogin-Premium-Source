package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_323 {
   private static long z = Long.reverse(144115188075855872L);
   private static int a = (0 >>> 103 | 0 << ~103 + 1) & -1;
   private static int b = Integer.reverse(-1);
   private static int i = Integer.reverse(-1073741824);
   private static int u = Integer.reverse(-536870912);
   private static int ai = 0 >>> 162 | 0 << ~162 + 1;
   private static long h = Long.reverse(-5038186473842150478L);
   private static int v = Integer.reverse(-1);
   private static int o = Integer.reverse(-1610612736);
   private static int g = Integer.reverse(1073741824);
   private static String[] ZKM_STR_B = new String[NLoginCore_323.ak];
   private static int r = Integer.reverse(1610612736);
   private static long ab = Long.reverse(-5182301661918006350L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static long s = Long.reverse(-5182301661918006350L);
   private static int p = Integer.reverse(-1);
   private static int x = 268435456 >>> 185 | 268435456 << -185;
   private static long ac = Long.reverse(144115188075855872L);
   private static int ah = 256 >>> 136 | 256 << ~136 + 1;
   private static int af = (0 >>> 68 | 0 << ~68 + 1) & -1;
   private static long w = Long.reverse(-5038186473842150478L);
   private static long t = Long.reverse(144115188075855872L);
   private static long q = Long.reverse(-5038186473842150478L);
   private static long j = Long.reverse(-5182301661918006350L);
   private static int m = (-1 >>> 119 | -1 << -119) & -1;
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static int aa = Integer.reverse(-1879048192);
   private static int ak = Integer.reverse(1342177280);
   private static int ad = Integer.reverse(-1073741824);
   private static long d = Long.reverse(-5038186473842150478L);
   private static long k = Long.reverse(144115188075855872L);
   private static long c;
   private static int aj = (5242880 >>> 179 | 5242880 << -179) & -1;
   private static long n = Long.reverse(-5038186473842150478L);
   private static int l = Integer.reverse(536870912);
   private static long y = Long.reverse(-5182301661918006350L);
   private static String[] ZKM_STR_A = new String[aj];
   private static long f = Long.reverse(-5038186473842150478L);

   private static void b() {
      c = 5606891711535196189L;
      long var0 = c ^ -2495368878372547545L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(24 + 44),
               (byte)(31 + 38),
               (byte)(75 + 8),
               (byte)(34 + 13),
               (byte)(48 + 19),
               (byte)(18 + 48),
               67,
               (byte)(27 + 20),
               (byte)(7 + 73),
               (byte)(54 + 21),
               (byte)(46 + 21),
               (byte)(21 + 62),
               (byte)(15 + 38),
               (byte)(51 + 29),
               (byte)(68 + 29),
               100,
               (byte)(99 + 1),
               (byte)(22 + 83),
               (byte)(105 + 5),
               (byte)(42 + 61)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.C("ԣՌԏԒԱԈԫԪԴՓԷԼԔԜԝԮ\u0530ԽՕբԜՔԫԬ", (byte)97, 67);
               ZKM_STR_B[1] = NLoginCore_521.B("ƧƪƆŹźƬƚƪźŵŽưƑƢƁƽƿƅǇǁƛǍƔƕ", (byte)97, 66);
               ZKM_STR_B[2] = NLoginCore_387.A("ƓƉƋƕƍƖǁƯƠƾƷƮƥƠƀƴƳƳƊſƋǏƥǒƭƠƴǌƐǉǒǓǇǜƪǗǛǋƝǜƟƣǎƩ", (byte)97, 65);
               ZKM_STR_B[3] = NLoginCore_521.D("ԿԜԥԒԞ\u0530\u0557ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԻԥԽՙՊԣբԷզ՜ԽհՑծՅՅՀոԪՂչխՀ", (byte)97, 68);
               ZKM_STR_B[4] = NLoginCore_427.D("ԿԜԥԒԞ\u0530\u0557ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽԸՄՓՖՊԵթՋԻխԽգէկՀճՌյ\u0557ՑԶՀ", (byte)97, 68);
               ZKM_STR_B[5] = NLoginCore_027.D("ԿԜԥԒԞ\u0530\u0557ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԴԺ՛՜՝ՈՉԼ\u0558Ծ\u0530զՍԿԽՀ\u0530ձդՋ\u0530չՀ", (byte)97, 68);
               ZKM_STR_B[6] = NLoginCore_324.A("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƝƭƋƱǓƬǑǋƣǃƬǌƑǋƧƧǍƽƛǒǘƸƩ", (byte)97, 65);
               ZKM_STR_B[7] = NLoginCore_183.B("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƦǏƙǊǇƦǎƦƶƴƶƗƹƘƳǎǞǎƸƢǏǞƩ", (byte)97, 66);
               ZKM_STR_B[8] = NLoginCore_092.D("ԿԜԥԒԞ\u0530\u0557ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽզ\u0530ա՞ԽեԽՍՋՍհՌԲԳ՝կՆՑգԴձՀ", (byte)97, 68);
               ZKM_STR_B[9] = NLoginCore_451.D("ԩՑԌԊԨԡԷԫԘՂԫԠ", (byte)97, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_127.D("ԣՌԏԒԱԈԫԪԴՓԸՍԬԫԬՌԺՂԭԵԥԮԫԬ", (byte)97, 68);
               ZKM_STR_B[1] = NLoginCore_183.A("ƧƪƆŹźƬƚƪźŵŽǅƆƾƱƨƽƋƩǇƉƣǍǍƍƑƽƑƨƬƨƋ", (byte)97, 65);
               ZKM_STR_B[2] = NLoginCore_241.D("ԪԠԢԬԤԭ\u0558ՆԷՕՎՅԼԷԗՋՊՊԡԖԢզԼթՄԷՋգԧՠթժեՇՁԦԭնկՖՁՆՓՀ", (byte)97, 68);
               ZKM_STR_B[3] = NLoginCore_384.B("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƤƎƦǂƳƌǋƠǏǅƦǅƳƎƾƫƷƱǝƛǑǞƩ", (byte)97, 66);
               ZKM_STR_B[4] = NLoginCore_471.F("քաժ\u0557գյ֜֊֔\u058b\u058bչ֍պՠ֢՜ո֩֊վւս։֛֘֏պ֮\u0590րֲ֡կ֊ֱֲ֑֭֓֘֓֠օ", (byte)97, 70);
               ZKM_STR_B[5] = NLoginCore_575.A("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƝƣǄǅǆƱƲƥǁƧƙƲǛƪƹƦǘǙƛǀƴǎƩ", (byte)97, 65);
               ZKM_STR_B[6] = NLoginCore_183.E("քաժ\u0557գյ֜֊֔\u058b\u058bչ֍պՠ֢՜ո֩֊վչ։է֍֯ֈ֧֭տ֟ֈ֑֔րֶ֖֖֚կևֿշօ", (byte)97, 69);
               ZKM_STR_B[7] = NLoginCore_384.F("քաժ\u0557գյ֜֊֔\u058b\u058bչ֍պՠ֢՜ո֩֊վւ֫յ֦֣ւ֪ւ֒\u0590ֳ֒հցֱ֥֩֨ֆպ։տօ", (byte)97, 70);
               ZKM_STR_B[8] = NLoginCore_127.D("ԿԜԥԒԞ\u0530\u0557ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽզ\u0530ա՞ԽեԽՍՋՍԻՌլկնեիլԲՎ\u0557Հ", (byte)97, 68);
               ZKM_STR_B[9] = NLoginCore_173.B("ƖƯƐƱƺƐƹƘƊƖƔƉ", (byte)97, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.F("ՎշՕէլ֛և֍Օս՛ղ՜֎ր֗ս֖ւֆ֪֩հձ", (byte)97, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_141.C("ԲԤԓԓԝԢԓԏԨԕՒԲՓՙԘԹՉՃ՞ԿԳդԫԬ", (byte)97, 67);
         }
      }
   }

   public static boolean a(NLoginCore_459 var0, String var1, String var2) {
      Connection var3 = var0.a();

      boolean var5;
      try {
         ResultSet var4 = var3.getMetaData().getColumns(var3.getCatalog(), null, var1, var2);

         try {
            var5 = var4.next();
         } catch (Throwable var12) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var4 != null) {
            var4.close();
         }
      } finally {
         var0.a(var3);
      }

      return var5;
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -2495368878372547545L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(60 + 9),
                     (byte)(31 + 52),
                     (byte)(39 + 8),
                     (byte)(4 + 63),
                     (byte)(7 + 59),
                     (byte)(41 + 26),
                     (byte)(46 + 1),
                     (byte)(67 + 13),
                     (byte)(51 + 24),
                     (byte)(25 + 42),
                     (byte)(72 + 11),
                     (byte)(10 + 43),
                     (byte)(57 + 23),
                     (byte)(61 + 36),
                     100,
                     (byte)(75 + 25),
                     (byte)(57 + 48),
                     (byte)(58 + 52),
                     (byte)(55 + 48)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(77 + 6)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.B("ƾǋǊƍǍǉǄǍǘǇƔǒǖǏǒǘƚԣԀԷԴԵԩԆԸԮԵ", (byte)110, 66));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   public static NLoginCore_147 a(NLoginCore_219 var0, NLoginCore_036 var1) {
      Properties var2 = new Properties();
      String var3 = var0.b(a(i, j ^ k));
      String var4 = var0.b(a(l & m, n));
      String var5 = var0.b(a(o & p, q));
      String var6 = var0.b(a(r, s ^ t));

      for (String var8 : var0.a(a(u & v, w))) {
         String var9 = var0.b(a(x, y ^ z) + var8);
         var2.setProperty(var8, var9);
      }

      return NLoginCore_147.a(var3, var4, var5, var6, var2, var1.i());
   }

   public static boolean a(NLoginCore_459 var0, String var1) {
      Connection var2 = var0.a();

      try {
         ResultSet var3 = var2.getMetaData().getTables(var2.getCatalog(), null, a(aa, ab ^ ac), null);

         int var4;
         label108: {
            try {
               while (var3.next()) {
                  if (var3.getString(ad).equalsIgnoreCase(var1)) {
                     var4 = ae;
                     break label108;
                  }
               }

               var4 = af;
            } catch (Throwable var11) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }
               }

               throw var11;
            }

            if (var3 != null) {
               var3.close();
            }

            return (var4 != 0);
         }

         if (var3 != null) {
            var3.close();
         }

         return (var4 != 0);
      } finally {
         var0.a(var2);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_323.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.B("ƇƩƫƋƯǎǆǜǈƗǕǋǙǓƜǁǣǢǚǠǚƯ", (byte)112, 66), NLoginCore_323.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.A("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԧԄԻԸԹԭԊԼԲԹƴ", (byte)112, 65) + var1 + NLoginCore_173.D("Կ", (byte)112, 68) + var2.toString(), var4
         );
      }
   }

   public static boolean a(ResultSet var0, String var1) {
      ResultSetMetaData var2 = var0.getMetaData();
      int var3 = var2.getColumnCount();

      for (int var4 = ag; var4 <= var3; var4++) {
         if (var1.equals(var2.getColumnName(var4))) {
            return (ah != 0);
         }
      }

      return (ai != 0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static HikariConnectionPool a(NLoginType_008 var0, NLoginCore_036 var1, NLoginCore_147 var2, @Nullable Consumer<HikariConfig> var3) {
      if (!var1.aa()) {
         throw new IllegalArgumentException(a(a & b, d) + var1 + a(e, f));
      } else {
         switch (NLoginCore_213.h[var1.ordinal()]) {
            case 1:
               return NLoginCore_562.a(var0, var2, var3);
            case 2:
               return NLoginCore_034.a(var0, var2, var3);
            default:
               throw new IllegalArgumentException(a(g, h) + var1);
         }
      }
   }
}
