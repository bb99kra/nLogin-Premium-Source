package com.nickuc.login;

import com.nickuc.login.lib.jedis.DefaultJedisClientConfig;
import com.nickuc.login.lib.jedis.HostAndPort;
import com.nickuc.login.lib.jedis.JedisClientConfig;
import com.nickuc.login.lib.jedis.JedisCluster;
import com.nickuc.login.lib.jedis.JedisPooled;
import com.nickuc.login.lib.jedis.UnifiedJedis;
import java.io.Closeable;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_319 implements Closeable {
   private static long c;
   private static int n = 128 >>> 38 | 128 << ~38 + 1;
   private final Map<String, NLoginCore_587> i = new HashMap<>();
   private static String[] ZKM_STR_A = new String[NLoginCore_319.r];
   private static long e = Long.reverse(8358680908399640576L);
   private static String[] ZKM_STR_B = new String[NLoginCore_319.s];
   private static int r = 1610612736 >>> 125 | 1610612736 << ~125 + 1;
   private static long p = Long.reverse(8358680908399640576L);
   private static int g = (1073741824 >>> 254 | 1073741824 << -254) & -1;
   private final UnifiedJedis a;
   private static int a = ('切' >>> 'e' | 64000 << ~101 + 1) & -1;
   private boolean ad;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginInterface_011<?> f;
   private static int h = 67108864 >>> 186 | 67108864 << -186;
   private static long l = Long.reverse(8358680908399640576L);
   private static long d = Long.reverse(1193504960482297201L);
   private static int i = (-2147480459 >>> 255 | -2147480459 << -255) & -1;
   private static long o = Long.reverse(1193504960482297201L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long k = Long.reverse(1193504960482297201L);
   private static int s = (1536 >>> 41 | 1536 << ~41 + 1) & -1;
   private static int b = 0 >>> 148 | 0 << -148;
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int f = Integer.reverse(0);

   public static NLoginCore_319 a(NLoginInterface_011<?> var0, String var1, String var2, String var3, boolean var4) {
      return new NLoginCore_319(var0, new JedisPooled(a(var1), a(var2, var3, var4)));
   }

   private static void b() {
      c = -8168565572369118968L;
      long var0 = c ^ 6109697636854521877L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(24 + 45),
               (byte)(50 + 33),
               47,
               (byte)(5 + 62),
               (byte)(56 + 10),
               (byte)(44 + 23),
               (byte)(36 + 11),
               (byte)(77 + 3),
               (byte)(51 + 24),
               (byte)(38 + 29),
               (byte)(16 + 67),
               (byte)(47 + 6),
               (byte)(16 + 64),
               (byte)(48 + 49),
               (byte)(78 + 22),
               (byte)(65 + 35),
               (byte)(8 + 97),
               (byte)(48 + 62),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_471.E("\u0558ՂԷծՌբիՍգՐՓԼ", (byte)56, 69);
               ZKM_STR_B[1] = NLoginCore_397.A("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 65);
               ZKM_STR_B[2] = NLoginCore_183.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.F("ԹՁԼդդՄզԮԾիաԼ", (byte)56, 70);
               ZKM_STR_B[1] = NLoginCore_471.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢżűŉńŊŅƅŜŋűőƓƐŎƌťŠŶƎōƔťŢţ", (byte)56, 66);
               ZKM_STR_B[2] = NLoginCore_232.E("դժՉըԺՠՎթԴԮՕՇԶբ\u0558Ֆ՚ՏիԿԻԻՓՍ\u0557ՀՒՓ՟՛օէ՚\u0557ռադՋ։հիայ֘֊\u0557խ\u0558եֈվ֞։֠էը", (byte)56, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.E("ԬԩՠԽ՝ԬՊՓՈկեԼ", (byte)56, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_201.D("ҖҬӎҦӕӕһӔҰҵҨҥ", (byte)56, 68);
         }
      }
   }

   public static NLoginCore_319 a(NLoginInterface_011<?> var0, List<String> var1, String var2, String var3, boolean var4) {
      Set var5 = var1.stream().map(NLoginCore_319::a).collect(Collectors.toSet());
      return new NLoginCore_319(var0, new JedisCluster(var5, a(var2, var3, var4)));
   }

   static {
      b();
   }

   @Override
   public void close() {
      this.ad = (q != 0);
      synchronized (this.i) {
         this.i.values().forEach(NLoginCore_587::close);
      }

      this.a.close();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_319.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.B("đĳĵĕĹŘŐŦŒġşŕţŝĦŋŭŬŤŪŤĹ", (byte)53, 66), NLoginCore_319.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.A("ŌřŘěśŗŒśŦŕĢŠŤŝŠŦĨҍӀұӁһҚҶҡһҖҺҨŀ", (byte)53, 65) + var1 + NLoginCore_446.D("Ҏ", (byte)53, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   private NLoginCore_319(NLoginInterface_011<?> var1, UnifiedJedis var2) {
      this.f = var1;
      this.a = var2;
   }

   public void a(String var1, Consumer<String> var2) {
      if (this.ad) {
         throw new IllegalStateException(a(j, k ^ l));
      } else {
         synchronized (this.i) {
            NLoginCore_587 var4 = new NLoginCore_587(this, var1, var2, null);
            this.i.put(var1, var4);
            this.f.b((m != 0)).a(var4);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 6109697636854521877L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(63 + 5),
                     69,
                     (byte)(71 + 12),
                     (byte)(42 + 5),
                     (byte)(2 + 65),
                     (byte)(27 + 39),
                     (byte)(54 + 13),
                     (byte)(24 + 23),
                     (byte)(54 + 26),
                     (byte)(71 + 4),
                     (byte)(28 + 39),
                     83,
                     (byte)(41 + 12),
                     (byte)(16 + 64),
                     (byte)(18 + 79),
                     (byte)(98 + 2),
                     (byte)(3 + 97),
                     (byte)(60 + 45),
                     (byte)(11 + 99),
                     (byte)(78 + 25)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(44 + 39)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.F("ԱԾԽԀՀԼԷՀՋԺԇՅՉՂՅՋԍࡲࢥ\u0896ࢦࢠࡿ࢛ࢆࢠࡻ࢟ࢍ", (byte)18, 70));
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

   private static HostAndPort a(String var0) {
      String[] var1 = var0.split(a(b, d ^ e));
      String var2 = var1[f];
      int var3 = var1.length > g ? Integer.parseInt(var1[h]) : i;
      return new HostAndPort(var2, var3);
   }

   public void l(String var1, String var2) {
      this.a.publish(var1, var2);
   }

   private static JedisClientConfig a(String var0, String var1, boolean var2) {
      return DefaultJedisClientConfig.builder().user(var0).password(var1).ssl(var2).timeoutMillis(a).build();
   }

   public void t(String var1) {
      if (this.ad) {
         throw new IllegalStateException(a(n, o ^ p));
      } else {
         synchronized (this.i) {
            NLoginCore_587 var3 = this.i.remove(var1);
            if (var3 != null) {
               var3.close();
            }
         }
      }
   }
}
