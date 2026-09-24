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

public class ΓυετνΛζΠιΓζΣ implements Closeable {
   private static long c;
   private static int n = 128 >>> 38 | 128 << ~38 + 1;
   private final Map<String, εςζψιΠφΛξβλ> i = new HashMap<>();
   private static String[] a = new String[ΓυετνΛζΠιΓζΣ.r];
   private static long e = Long.reverse(8358680908399640576L);
   private static String[] b = new String[ΓυετνΛζΠιΓζΣ.s];
   private static int r = 1610612736 >>> 125 | 1610612736 << ~125 + 1;
   private static long p = Long.reverse(8358680908399640576L);
   private static int g = (1073741824 >>> 254 | 1073741824 << -254) & -1;
   private final UnifiedJedis a;
   private static int a = ('切' >>> 'e' | 64000 << ~101 + 1) & -1;
   private boolean ad;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private final εηχβγρΦβΦΛκγΦοδ<?> f;
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

   public static ΓυετνΛζΠιΓζΣ a(εηχβγρΦβΦΛκγΦοδ<?> var0, String var1, String var2, String var3, boolean var4) {
      return new ΓυετνΛζΠιΓζΣ(var0, new JedisPooled(a(var1), a(var2, var3, var4)));
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
               b[0] = οοθδΨιοΦΠβδζ.E("\u0558ՂԷծՌբիՍգՐՓԼ", (byte)56, 69);
               b[1] = οΩνΩρωλΨηΛδωδ.A("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 65);
               b[2] = δΛψπξκσβγςα.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 66);
               break;
            case 1:
               b[0] = ΣερμΔσατσκ.F("ԹՁԼդդՄզԮԾիաԼ", (byte)56, 70);
               b[1] = οοθδΨιοΦΠβδζ.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢżűŉńŊŅƅŜŋűőƓƐŎƌťŠŶƎōƔťŢţ", (byte)56, 66);
               b[2] = ΦδφπθΩΩλζξ.E("դժՉըԺՠՎթԴԮՕՇԶբ\u0558Ֆ՚ՏիԿԻԻՓՍ\u0557ՀՒՓ՟՛օէ՚\u0557ռադՋ։հիայ֘֊\u0557խ\u0558եֈվ֞։֠էը", (byte)56, 69);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.E("ԬԩՠԽ՝ԬՊՓՈկեԼ", (byte)56, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.D("ҖҬӎҦӕӕһӔҰҵҨҥ", (byte)56, 68);
         }
      }
   }

   public static ΓυετνΛζΠιΓζΣ a(εηχβγρΦβΦΛκγΦοδ<?> var0, List<String> var1, String var2, String var3, boolean var4) {
      Set var5 = var1.stream().map(ΓυετνΛζΠιΓζΣ::a).collect(Collectors.toSet());
      return new ΓυετνΛζΠιΓζΣ(var0, new JedisCluster(var5, a(var2, var3, var4)));
   }

   static {
      b();
   }

   @Override
   public void close() {
      this.ad = (boolean)q;
      synchronized (this.i) {
         this.i.values().forEach(εςζψιΠφΛξβλ::close);
      }

      this.a.close();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΓυετνΛζΠιΓζΣ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ξψθρΣΠΣς.B("đĳĵĕĹŘŐŦŒġşŕţŝĦŋŭŬŤŪŤĹ", (byte)53, 66), ΓυετνΛζΠιΓζΣ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            θεωψξβΛσσ.A("ŌřŘěśŗŒśŦŕĢŠŤŝŠŦĨҍӀұӁһҚҶҡһҖҺҨŀ", (byte)53, 65) + var1 + μζξτΩσσφυδεπλΨ.D("Ҏ", (byte)53, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   private ΓυετνΛζΠιΓζΣ(εηχβγρΦβΦΛκγΦοδ<?> var1, UnifiedJedis var2) {
      this.f = var1;
      this.a = var2;
   }

   public void a(String var1, Consumer<String> var2) {
      if (this.ad) {
         throw new IllegalStateException(c<"㺀">(j, k ^ l));
      } else {
         synchronized (this.i) {
            εςζψιΠφΛξβλ var4 = new εςζψιΠφΛξβλ(this, var1, var2, null);
            this.i.put(var1, var4);
            this.f.b((boolean)m).a(var4);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= 6109697636854521877L;
      if (a[var0] == null) {
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
            throw new RuntimeException(ςΦζσμτΓσ.F("ԱԾԽԀՀԼԷՀՋԺԇՅՉՂՅՋԍࡲࢥ\u0896ࢦࢠࡿ࢛ࢆࢠࡻ࢟ࢍ", (byte)18, 70));
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

   private static HostAndPort a(String var0) {
      String[] var1 = var0.split(c<"㺀">(b, d ^ e));
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
         throw new IllegalStateException(c<"㺀">(n, o ^ p));
      } else {
         synchronized (this.i) {
            εςζψιΠφΛξβλ var3 = this.i.remove(var1);
            if (var3 != null) {
               var3.close();
            }
         }
      }
   }
}
