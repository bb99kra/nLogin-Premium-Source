package com.nickuc.login;

import com.nickuc.login.lib.jedis.JedisCluster;
import com.nickuc.login.lib.jedis.JedisPooled;
import com.nickuc.login.lib.jedis.JedisPubSub;
import com.nickuc.login.lib.jedis.UnifiedJedis;
import java.io.Closeable;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

class NLoginCore_587 extends JedisPubSub implements Closeable, Runnable {
   private static long c;
   private static long d = Long.reverse(-8720754023362920150L);
   private static long g = Long.reverse(-8720754023362920150L);
   private static String[] b = new String[NLoginCore_587.aj];
   private static long n = Long.reverse(3673152151160684842L);
   private static int t = 256 >>> 136 | 256 << -136;
   private static int ah = Integer.reverse(0);
   private static int k = 0 >>> 44 | 0 << -44;
   private static long z = Long.reverse(3673152151160684842L);
   private final Consumer<String> b;
   private static int i = (0 >>> 37 | 0 << -37) & -1;
   private static int aa = 67108864 >>> 218 | 67108864 << ~218 + 1;
   private static int l = 65536 >>> 111 | 65536 << -111;
   private static int ai = ('\ue000' >>> 'M' | 57344 << ~77 + 1) & -1;
   private static int o = 384 >>> 39 | 384 << ~39 + 1;
   private static int j = (1 >>> 160 | 1 << ~160 + 1) & -1;
   private static long ag = Long.reverse(3673152151160684842L);
   private static int m = Integer.reverse(-1);
   private static long q = Long.reverse(-5476377146882523136L);
   private boolean ae;
   private static int b = Integer.reverse(0);
   private static int r = Integer.reverse(0);
   private static int x = 1024 >>> 40 | 1024 << -40;
   private final String bm;
   private static int u = Integer.reverse(0);
   private static int ae = 6144 >>> 170 | 6144 << ~170 + 1;
   private static int c = 0 >>> 199 | 0 << ~199 + 1;
   private static long ac = Long.reverse(-8720754023362920150L);
   private static long h = Long.reverse(-5476377146882523136L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int v = 1073741824 >>> 30 | 1073741824 << ~30 + 1;
   private static long s = Long.reverse(1281274093986906112L);
   private static int af = (-1 >>> 159 | -1 << -159) & -1;
   private static long ad = Long.reverse(-5476377146882523136L);
   private static int a = (1048576 >>> 212 | 1048576 << -212) & -1;
   private static int ab = -1610612736 >>> 125 | -1610612736 << -125;
   private static long e = Long.reverse(-5476377146882523136L);
   private static int y = Integer.reverse(-1);
   private static String[] a = new String[ai];
   private static long p = Long.reverse(-8720754023362920150L);
   private final NLoginCore_319 b;
   private static int w = Integer.reverse(0);
   private static int aj = Integer.reverse(-536870912);

   public void m(String var1, String var2) {
      if (var1.equals(this.bm)) {
         this.b.accept(var2);
      }
   }

   private static void b() {
      c = 6089051318965870433L;
      long var0 = c ^ 6158926316318490985L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               69,
               (byte)(75 + 8),
               (byte)(7 + 40),
               67,
               (byte)(21 + 45),
               (byte)(66 + 1),
               (byte)(22 + 25),
               (byte)(3 + 77),
               (byte)(18 + 57),
               (byte)(53 + 14),
               (byte)(58 + 25),
               (byte)(51 + 2),
               (byte)(72 + 8),
               (byte)(86 + 11),
               (byte)(81 + 19),
               (byte)(57 + 43),
               (byte)(104 + 1),
               (byte)(34 + 76),
               (byte)(84 + 19)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_324.E("ԄՅԨԁԗԇԇԡՈԨԏԕ", (byte)17, 69);
               b[1] = NLoginCore_201.C("бўяуєѐФгТджѢѕХѠплпабрџэѪЯѕѓѴлкѶэҁѷѵсѠнѾјѼ҂҉ыѝљ҄щѿѰѼҎѫѲҀҌѕѧѦќѬѳҜҍ", (byte)17, 67);
               b[2] = NLoginCore_076.D("ПѠуМвТТмѣуЪа", (byte)17, 68);
               b[3] = NLoginCore_223.E(
                  "ԖՃԴԨԹԵԉԘԇԙԛՇԺԊՅԤԠԤԕԖԥՄԲՏԔԺԸՙԠԟ՛ԲԼԵՠԷԼԷՇԣ՞ՎՎԽըձՀՕիյՓի\u0557՛ՏԸշշԷԾԹի\u0558ֆ՟զ՟գվճ\u0558րըկՏՠա֒րխլՕքկ֍շՓկէր՛֚֟֞֝ծ", (byte)17, 69
               );
               b[4] = NLoginCore_110.E("ԯԕԥԲԼՃԘԤԊԜԩՄ\u0530ԦՓՁԤԤԱՅՇԗԼԯՍԫԚ\u0557ԙԹՀՙ", (byte)17, 69);
               b[5] = NLoginCore_091.B("ØęüÕëÛÛõĜüãé", (byte)17, 66);
               b[6] = NLoginCore_324.D("бўяуєѐФгТдеѩьХшрѩѱѣЭсѵѸщѲњѻѮѴѫјѝѕыѰѮѢѶѾџчѷ҈ъўѪѹэьэћ҉҉Ѯћќ", (byte)17, 68);
               break;
            case 1:
               b[0] = NLoginCore_138.A("ċøëýĒęýßòððé", (byte)17, 65);
               b[1] = NLoginCore_451.D("бўяуєѐФгТджѢѕХѠплпабрџэѪЯѕѓѴлкѶэҁѷѵсѠнѾјѼ҂҉ыѝљ҄щѿѰѼҎѫѳѶєѤҐҌѬѦҎёѸ", (byte)17, 68);
               b[2] = NLoginCore_138.D("РзЭкѦйгуѪљѕа", (byte)17, 68);
               b[3] = NLoginCore_092.B("êėĈüčĉÝìÛíïěĎÞęøôøéêùĘĆģèĎČĭôóįĆĐĉĴċĐċě÷ĲĢĢđļŅĔĩĿŉħĿīįģČŋŋċĒčĿĬŚĳĺĳķŒŇĬŔļŃģĴĵŦŔŁŀĩŘŃšŉŤűīńťńŇĳĴŶ", (byte)17, 66);
               b[4] = NLoginCore_183.F("ԯԕԥԲԼՃԘԤԊԜԩՄ\u0530ԦՓՁԤԤԱՅՇ՜ԸԜԺԞՊաԔԺԽԺԻԷՖզըԼիադԪզԵ", (byte)17, 70);
               b[5] = NLoginCore_575.C("жлєјОћгўјјуа", (byte)17, 67);
               b[6] = NLoginCore_138.A("êėĈüčĉÝìÛíîĢąÞāùĢĪĜæúĮıĂīēĴħĭĤđĖĎĄĩħěįķĘĀİľĦĽĀēŇĉĿþŊŉĽĔĕ", (byte)17, 65);
               break;
            case 2:
               b[0] = NLoginCore_201.B("ĎÙĎÏÿøďñĎôĠûĢĥúĨĪąěĕăĝôõ", (byte)17, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_453.A("ÒÙďĎÞÝÒûìüęàĐ÷ĠăúĘçãčćôõ", (byte)17, 65);
         }
      }
   }

   private boolean ak() {
      UnifiedJedis var1 = NLoginCore_319.a(this.b);
      if (var1 instanceof JedisPooled) {
         return (boolean)(!((JedisPooled)var1).getPool().isClosed() ? t : u);
      } else if (var1 instanceof JedisCluster) {
         return (boolean)(!((JedisCluster)var1).getClusterNodes().isEmpty() ? v : w);
      } else {
         throw new RuntimeException(a(x & y, z) + var1.getClass().getName());
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_587.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.C("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 67), NLoginCore_587.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.C("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯ߶ࠄ߹ࠌ߾ߦࠍߣࠇ\u07fcࠆ҆", (byte)41, 67) + var1 + NLoginCore_324.E("ԟ", (byte)41, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   private NLoginCore_587(NLoginCore_319 var1, String var2, Consumer<String> var3) {
      this.b = var1;
      this.bm = var2;
      this.b = var3;
   }

   private static String a(int var0, long var1) {
      var1 ^= 45L;
      var1 ^= 6158926316318490985L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(23 + 45),
                     (byte)(20 + 49),
                     (byte)(72 + 11),
                     (byte)(24 + 23),
                     (byte)(15 + 52),
                     (byte)(10 + 56),
                     (byte)(25 + 42),
                     (byte)(43 + 4),
                     (byte)(17 + 63),
                     (byte)(22 + 53),
                     (byte)(34 + 33),
                     (byte)(24 + 59),
                     53,
                     80,
                     (byte)(58 + 39),
                     (byte)(61 + 39),
                     (byte)(84 + 16),
                     (byte)(38 + 67),
                     (byte)(9 + 101),
                     (byte)(22 + 81)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.E("Ւ՟՞ԡա՝\u0558ալ՛ԨզժգզլԮࢵࣃࢸ࣋ࢽࢥ࣌ࢢࣆࢻࣅ", (byte)51, 69));
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
   public void run() {
      int var1 = a;

      while (!this.ae && !Thread.interrupted() && this.ak()) {
         try {
            if (var1 != 0) {
               var1 = b;
            } else {
               NLoginCore_370.e(a(c, d ^ e) + this.bm + a(f, g ^ h));
            }

            UnifiedJedis var10000 = NLoginCore_319.a(this.b);
            String[] var10002 = new String[j];
            var10002[k] = this.bm;
            var10000.subscribe(this, var10002);
         } catch (Exception var6) {
            if (this.ae) {
               return;
            }

            NLoginCore_370.b(a(l & m, n) + this.bm + a(o, p ^ q), var6);

            try {
               this.unsubscribe();
            } catch (Exception var5) {
            }

            try {
               Thread.sleep(s);
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
            }
         }
      }
   }

   static {
      b();
   }

   @Override
   public void close() {
      this.ae = (boolean)aa;

      try {
         this.unsubscribe();
      } catch (Exception var2) {
         NLoginCore_370.b(a(ab, ac ^ ad) + this.bm + a(ae & af, ag), var2);
      }
   }
}
