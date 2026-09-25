package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.DumperOptions.ScalarStyle;
import com.nickuc.login.lib.snakeyaml.nodes.MappingNode;
import com.nickuc.login.lib.snakeyaml.nodes.ScalarNode;
import java.io.File;
import java.io.FileWriter;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_283 {
   private static int t = (192 >>> 5 | 192 << -5) & -1;
   private static int af = 671088640 >>> 122 | 671088640 << -122;
   private boolean au;
   private boolean aw;
   private static int u = Integer.reverse(-1);
   private static long ag = Long.reverse(-5168340042069811288L);
   private static long ah = Long.reverse(-3170534137668829184L);
   private static int z = Integer.reverse(268435456);
   private static int a = Integer.reverse(0);
   private boolean ax;
   private static String[] ZKM_STR_B = new String[NLoginCore_283.ao];
   private static long f = Long.reverse(7802026884757217192L);
   private static int am = (0 >>> 153 | 0 << ~153 + 1) & -1;
   private NLoginCore_175 a;
   private static long v = Long.reverse(7802026884757217192L);
   private static long p = Long.reverse(-5168340042069811288L);
   private static long y = Long.reverse(-3170534137668829184L);
   private static long n = Long.reverse(-3170534137668829184L);
   private static int ao = Integer.reverse(-805306368);
   private static long m = Long.reverse(-5168340042069811288L);
   private static int h = 2048 >>> 202 | 2048 << -202;
   private static int ac = (18432 >>> 43 | 18432 << ~43 + 1) & -1;
   private static int ad = Integer.reverse(-1);
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(-3170534137668829184L);
   private boolean av;
   private static int an = Integer.reverse(-805306368);
   private static int b = Integer.reverse(-1);
   private static long d = Long.reverse(7802026884757217192L);
   private static long i = Long.reverse(-5168340042069811288L);
   private static long aa = Long.reverse(-5168340042069811288L);
   private static String[] ZKM_STR_A = new String[an];
   private static long s = Long.reverse(7802026884757217192L);
   private static long q = Long.reverse(-3170534137668829184L);
   private NLoginCore_555 a;
   private static int o = Integer.reverse(536870912);
   private static int g = (2048 >>> 235 | 2048 << ~235 + 1) & -1;
   private static int ai = (32 >>> 197 | 32 << -197) & -1;
   private static int w = (229376 >>> 79 | 229376 << -79) & -1;
   private static int r = (20 >>> 162 | 20 << -162) & -1;
   private static long ab = Long.reverse(-3170534137668829184L);
   private static long x = Long.reverse(-5168340042069811288L);
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private NLoginCore_566 a = NLoginCore_566.d;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int k = Integer.reverse(0);
   private static long ae = Long.reverse(7802026884757217192L);
   private static long c;
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static int l = (196608 >>> 80 | 196608 << -80) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_283.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.B("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 66), NLoginCore_283.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.A("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӊӇҾҿҼҺӂӍҪҿӎӔӎӖŊ", (byte)57, 65) + var1 + NLoginCore_324.C("Қ", (byte)57, 67) + var2.toString(), var4
         );
      }
   }

   @Generated
   public void j(boolean var1) {
      this.av = var1;
   }

   public static NLoginCore_283 a() {
      return new NLoginCore_283();
   }

   @Generated
   public void a(NLoginCore_555 var1) {
      this.a = var1;
   }

   @Generated
   public boolean ax() {
      return this.aw;
   }

   @Generated
   public NLoginCore_555 a() {
      return this.a;
   }

   @Generated
   public NLoginCore_566 b() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 43L;
      var1 ^= -7240300856158902220L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(19 + 49),
                     (byte)(10 + 59),
                     (byte)(64 + 19),
                     (byte)(30 + 17),
                     (byte)(29 + 38),
                     (byte)(8 + 58),
                     (byte)(4 + 63),
                     (byte)(15 + 32),
                     (byte)(6 + 74),
                     (byte)(49 + 26),
                     (byte)(49 + 18),
                     (byte)(39 + 44),
                     (byte)(27 + 26),
                     (byte)(36 + 44),
                     (byte)(28 + 69),
                     (byte)(39 + 61),
                     (byte)(51 + 49),
                     (byte)(35 + 70),
                     110,
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.C("Փՠ՟Ԣբ՞ՙբխ՜ԩէիդէխԯࣉࣆࢽࢾࢻࢹࣁ࣌ࢩࢾ࣓࣍࣍ࣕ", (byte)105, 67));
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

   @Generated
   public void i(boolean var1) {
      this.au = var1;
   }

   @Generated
   @Override
   public String toString() {
      return a(l, m ^ n)
         + this.b()
         + a(o, p ^ q)
         + this.a()
         + a(r, s)
         + this.av()
         + a(t & u, v)
         + this.a()
         + a(w, x ^ y)
         + this.aw()
         + a(z, aa ^ ab)
         + this.ax()
         + a(ac & ad, ae)
         + this.ay()
         + a(af, ag ^ ah);
   }

   @Generated
   public NLoginCore_175 a() {
      return this.a;
   }

   @Generated
   private NLoginCore_283() {
      this.a = NLoginCore_175.d;
      this.au = (ai != 0);
      this.a = NLoginCore_555.d;
      this.av = (aj != 0);
      this.aw = (ak != 0);
      this.ax = (al != 0);
   }

   @Generated
   public boolean aw() {
      return this.av;
   }

   private void a(Map<String, String> var1, NLoginInterface_005 var2, String var3) {
      String[] var4 = var2.a().a();
      int var5 = var4.length;

      for (int var6 = k; var6 < var5; var6++) {
         String var7 = var4[var6];
         var1.put(var7, var3);
      }
   }

   static {
      b();
   }

   @Generated
   public void l(boolean var1) {
      this.ax = var1;
   }

   @Generated
   public void a(NLoginCore_566 var1) {
      this.a = var1;
   }

   private static void b() {
      c = 1583578522716889629L;
      long var0 = c ^ -7240300856158902220L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(5 + 64),
               (byte)(62 + 21),
               (byte)(33 + 14),
               (byte)(29 + 38),
               (byte)(17 + 49),
               (byte)(41 + 26),
               47,
               (byte)(38 + 42),
               (byte)(59 + 16),
               (byte)(21 + 46),
               (byte)(51 + 32),
               (byte)(46 + 7),
               (byte)(41 + 39),
               (byte)(17 + 80),
               (byte)(24 + 76),
               (byte)(23 + 77),
               (byte)(13 + 92),
               (byte)(32 + 78),
               (byte)(61 + 42)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.A("ŴƛƖźŶƖƟůƥƙƔū", (byte)82, 65);
               ZKM_STR_B[1] = NLoginCore_521.A("ŜśŷŸŠƘřſźŝƗƙŶſƨƩƊţƌŹƄƯŶŷ", (byte)82, 65);
               ZKM_STR_B[2] = NLoginCore_384.A("ƉƅŽŨƍŠƗţƣƣźū", (byte)82, 65);
               ZKM_STR_B[3] = NLoginCore_453.E("ՆՀըՆգՖշՎՉ\u0590՝թօռՌՔմ֑֏ևլկ֒և֍ղ֠խք֙ե֢֜֝։ռ֙֗յէպըչն", (byte)82, 69);
               ZKM_STR_B[4] = NLoginCore_127.B("ŸŨŗŪŻƉſƌźŮƚƂƓŸƦƕžƬŶƘƨƉŶŷ", (byte)82, 66);
               ZKM_STR_B[5] = NLoginCore_027.E("մֈ՛ՊաՇւիՇ՞չՒփօֈՍ֍֑եջըձ֝\u0557ձջ֝֙խ֡ա֒ււ։֩ֆ֔՟սե֙֫ն", (byte)82, 69);
               ZKM_STR_B[6] = NLoginCore_387.D("ԐԚӸԁԙԝӼӿӶӾԬԠӾөԎԂԀԨԣӭԮԵԶԑԫ\u0530ԗӾԑԔԍӿ", (byte)82, 68);
               ZKM_STR_B[7] = NLoginCore_433.F("մֈ՛ՊաՇւիՇ՞ղհհՋ՝իգՒ֍շ֑\u058b֖֜հրտՔ֣֎դւէ֡ըէզքֈլ֤֝ցն", (byte)82, 70);
               ZKM_STR_B[8] = NLoginCore_384.F("ֆ\u0557եֆմւ֎Պ՟Վչև֏ևօօ֕ևֆ֗\u0590Փֆշ֛ղ\u058bձլ\u058cյ՝", (byte)82, 70);
               ZKM_STR_B[9] = NLoginCore_451.B("ŤŪŪŨƋơƢƜŞƥŘƛŚƅũƫŴŪŨƗŭƥŤůƴŵŨƣƂƁƙƺ", (byte)82, 66);
               ZKM_STR_B[10] = NLoginCore_387.A("ƉŴŸžƌƎƝųƒƀŲū", (byte)82, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_433.C("ӸӾӸԆԩԀԃӧԡԮԬөԋԭԍԱԉԕӴӭӰԷӾӿ", (byte)82, 67);
               ZKM_STR_B[1] = NLoginCore_433.C("ӤӣӿԀӨԠӡԇԂӥԟԬԛӧԉԮԄԇԲԔԑԑӾӿ", (byte)82, 67);
               ZKM_STR_B[2] = NLoginCore_427.A("ƐƐƏƈŽƠřƔƠƏƠū", (byte)82, 65);
               ZKM_STR_B[3] = NLoginCore_575.F("ՆՀըՆգՖշՎՉ\u0590՝թօռՌՔմ֑֏ևլկ֒և֍ղ֠խք֙ե֢֝\u0590֥֚֚ս֍֢ա֊ִ֦֣֪֑յְց֒֗ոքցւ", (byte)82, 70);
               ZKM_STR_B[4] = NLoginCore_324.D("ԀӰӟӲԃԑԇԔԂӶԢӸԞӰӭԒԱԊӰӱԙԎԏԲԑԩԪԞӽԒӺԌ", (byte)82, 68);
               ZKM_STR_B[5] = NLoginCore_384.C("ԑԥӸӧӾӤԟԈӤӻԖӯԠԢԥӪԪԮԂԘԅԎԺӴԎԘԺԶԊԾӾԯԴԝԴԻԨԒՊՋԸԕՈԓ", (byte)82, 67);
               ZKM_STR_B[6] = NLoginCore_141.B("ƈƒŰŹƑƕŴŷŮŶƤƘŶšƆźŸƠƛťƦƫŨƂƈŬŴƷƣƎƚư", (byte)82, 66);
               ZKM_STR_B[7] = NLoginCore_004.D("ԑԥӸӧӾӤԟԈӤӻԏԍԍӨӺԈԀӯԪԔԮԨԳԹԍԝԜӱՀԫԁԟԲԹԜԓԦՃՄԜԤԾՈԓ", (byte)82, 68);
               ZKM_STR_B[8] = NLoginCore_076.C("ԣӴԂԣԑԟԫӧӼӫԖԤԬԤԢԢԲԤԣԴԭӯԅԪӺԺӹԇԉԗԼՃՄԦԯԺԾԅՄԁԅԕԪԓ", (byte)82, 67);
               ZKM_STR_B[9] = NLoginCore_451.D("ӬӲӲӰԓԩԪԤӦԭӠԣӢԍӱԳӼӲӰԟӵԪԫӱӵԜӷԸԈӸԬӾԎԱԅԚԩԢԥԠӾԫԅԓ", (byte)82, 68);
               ZKM_STR_B[10] = NLoginCore_397.C("ԐԅԝԏӼԝӶӵԄԌӥӳ", (byte)82, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_521.E("ՠՙմս՝ֆտ՟֏ծՏժւփէթ֊յի\u0558օ֚աբ", (byte)82, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_004.C("ԌӲԃԟӺԇӠӹԨԭӺӬԐԜӭԒӲԨӬԡӷԑӾӿ", (byte)82, 67);
         }
      }
   }

   @Generated
   public boolean ay() {
      return this.ax;
   }

   private void a(File var1, Map<String, String> var2) {
      Yaml var3 = NLoginCore_222.a((g != 0));
      MappingNode var4 = NLoginCore_222.a(var3, var1);
      NLoginCore_222.a(var4, a(h, i ^ j), (var1x, var2x) -> {
         String var3x = (String)var2.get(var1x);
         return var3x == null ? null : new ScalarNode(var2x.getTag(), var3x, var2x.getStartMark(), var2x.getEndMark(), ScalarStyle.PLAIN);
      });
      FileWriter var5 = new FileWriter(var1);

      try {
         var3.serialize(var4, var5);
      } catch (Throwable var9) {
         try {
            var5.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var5.close();
   }

   @Generated
   public boolean av() {
      return this.au;
   }

   @Generated
   public void a(NLoginCore_175 var1) {
      this.a = var1;
   }

   @Generated
   public void k(boolean var1) {
      this.aw = var1;
   }

   public void f(NLoginType_008 var1) {
      File var2 = var1.a().d();
      File var3 = new File(var1.c() + File.separator + a(a & b, d), a(e, f));
      HashMap var4 = new HashMap();
      this.a(var4, NLoginCore_477.ab, this.a.name().toUpperCase());
      this.a(var4, NLoginCore_477.al, this.a.name().toUpperCase());
      HashMap var5 = new HashMap();
      this.a(var5, NLoginCore_329.d, Boolean.toString(this.au));
      this.a(var5, NLoginCore_329.a, this.a.name().toUpperCase());
      this.a(var5, NLoginCore_329.c, Boolean.toString(this.av));
      this.a(var5, NLoginCore_329.p, Boolean.toString(this.aw));
      this.a(var5, NLoginCore_329.l, Boolean.toString(this.ax));
      this.a(var2, var4);
      if (var3.exists()) {
         this.a(var3, var5);
      }

      BCryptHashProvider.a(var1);
      var1.b().c().forEach(var0 -> var0.a(NLoginCore_150.a(NLoginCore_487.p, var0)));
      var1.a().u();
      var1.a().t();
   }
}
