package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.BungeeLoader;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;

public abstract class NLoginCore_383 implements LoaderBootstrap, NLoginInterface_015, NLoginInterface_011<BungeeLoader> {
   private static int bt = Integer.reverse(-268435456);
   private static long br = Long.reverse(-5188146770730811392L);
   private static int bd = (16 >>> 4 | 16 << -4) & -1;
   private static String[] b = new String[NLoginCore_383.bk];
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int ap = Integer.reverse(-1879048192);
   private static int d = Integer.reverse(0);
   private static long j = Long.reverse(2772264471709243957L);
   private final NLoginInterface_020 b;
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int bu = Integer.reverse(-1);
   private static int ba = Integer.reverse(805306368);
   private static long o = Long.reverse(-7027568317448955339L);
   private static int e = Integer.reverse(0);
   private static long ax = Long.reverse(-7027568317448955339L);
   private static long bv = Long.reverse(2772264471709243957L);
   private static int bs = 0 >>> 70 | 0 << -70;
   private static long s = Long.reverse(-5188146770730811392L);
   private static int b = (128 >>> 167 | 128 << ~167 + 1) & -1;
   private static int h = 16777216 >>> 152 | 16777216 << ~152 + 1;
   private static int l = Integer.reverse(-1);
   private static long ao = Long.reverse(-5188146770730811392L);
   private static int t = (0 >>> 82 | 0 << ~82 + 1) & -1;
   private static long m = Long.reverse(2772264471709243957L);
   private static int w = Integer.reverse(0);
   private static int aj = Integer.reverse(-536870912);
   private static int c = Integer.reverse(0);
   private static long bq = Long.reverse(-7027568317448955339L);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(2772264471709243957L);
   private static int aw = Integer.reverse(-805306368);
   private static int a = 134217728 >>> 155 | 134217728 << ~155 + 1;
   private static long an = Long.reverse(-7027568317448955339L);
   private static int as = Integer.reverse(1342177280);
   private static int bf = Integer.reverse(0);
   private static long bb = Long.reverse(-7027568317448955339L);
   private static long bn = Long.reverse(-5188146770730811392L);
   private static long ah = Long.reverse(-7027568317448955339L);
   private static int bo = (0 >>> 171 | 0 << -171) & -1;
   private static int ag = (12582912 >>> 181 | 12582912 << ~181 + 1) & -1;
   private static long bc = Long.reverse(-5188146770730811392L);
   private static int y = Integer.reverse(-1610612736);
   private static long ak = Long.reverse(-7027568317448955339L);
   private static int bp = (1879048192 >>> 187 | 1879048192 << -187) & -1;
   private static long au = Long.reverse(2772264471709243957L);
   private static int be = (134217728 >>> 91 | 134217728 << ~91 + 1) & -1;
   private static int af = (536870912 >>> 157 | 536870912 << ~157 + 1) & -1;
   private static int bj = Integer.reverse(134217728);
   private static long c;
   private final BungeeLoader a;
   private static int bi = (0 >>> 179 | 0 << -179) & -1;
   private static String[] a = new String[bj];
   private static int ad = (0 >>> 106 | 0 << ~106 + 1) & -1;
   private static long p = Long.reverse(-5188146770730811392L);
   private static long aa = Long.reverse(-5188146770730811392L);
   private static int bg = 0 >>> 161 | 0 << -161;
   private static int ac = Integer.reverse(0);
   private static long ar = Long.reverse(-5188146770730811392L);
   private boolean Q = (boolean)a;
   final NLoginCore_572 b;
   private static int n = 100663296 >>> 217 | 100663296 << ~217 + 1;
   private static Method l = NLoginCore_546.a(ProxyServer.class, a(NLoginCore_383.bl, NLoginCore_383.bm ^ bn));
   private final NLoginCore_178 a;
   private static int k = 1024 >>> 233 | 1024 << ~233 + 1;
   private static int az = Integer.reverse(0);
   private static long r = Long.reverse(-7027568317448955339L);
   private static int x = 0 >>> 96 | 0 << -96;
   private static long aq = Long.reverse(-7027568317448955339L);
   private static long bm = Long.reverse(-7027568317448955339L);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int q = (1 >>> 126 | 1 << ~126 + 1) & -1;
   private static long ay = Long.reverse(-5188146770730811392L);
   private static int av = 0 >>> 239 | 0 << ~239 + 1;
   private static int bl = Integer.reverse(-1342177280);
   private static int bk = Integer.reverse(134217728);
   private static int at = (-1 >>> 157 | -1 << -157) & -1;
   private static int am = Integer.reverse(268435456);
   private static long z = Long.reverse(-7027568317448955339L);
   private static long al = Long.reverse(-5188146770730811392L);
   private static long ai = Long.reverse(-5188146770730811392L);
   private static int f = (-1 >>> 28 | -1 << -28) & -1;
   private static int bh = 0 >>> 115 | 0 << -115;
   private static int i = (-1 >>> 108 | -1 << ~108 + 1) & -1;

   protected void j() {
      if (this.b.am()) {
         this.b.<NLoginCore_100>a().j();
      }
   }

   @Override
   public NLoginInterface_026 a() {
      return this.a;
   }

   private static String a(int var0, long var1) {
      var1 ^= 29L;
      var1 ^= 1306354521147889324L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(31 + 37),
                     (byte)(20 + 49),
                     (byte)(74 + 9),
                     (byte)(8 + 39),
                     (byte)(65 + 2),
                     (byte)(10 + 56),
                     (byte)(55 + 12),
                     47,
                     (byte)(16 + 64),
                     (byte)(51 + 24),
                     (byte)(11 + 56),
                     (byte)(57 + 26),
                     (byte)(26 + 27),
                     (byte)(64 + 16),
                     (byte)(85 + 12),
                     (byte)(90 + 10),
                     (byte)(94 + 6),
                     105,
                     (byte)(9 + 101),
                     (byte)(70 + 33)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.C("ԂԏԎӑԑԍԈԑԜԋӘԖԚԓԖԜӞࡰࡲࡥࡪࡴࡲࡶࡻࡠ\u086fࡸࡾࡏࡐ", (byte)78, 67));
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
   public void c() {
      this.Q = (boolean)d;
      NLoginCore_074.a(this.a);
   }

   public NLoginCore_383(BungeeLoader var1, String var2, NLoginCore_422 var3) {
      this.a = var1;
      this.a = new NLoginCore_178(this);
      this.b = new NLoginCore_572(var2, var1.getVersion(), var3, this);
      this.b = new NLoginCore_170(var1.getLogger());
   }

   protected void O() {
      if (this.b.am()) {
         this.b.<NLoginCore_100>a().O();
      }
   }

   @Override
   public NLoginCore_572 a() {
      return this.b;
   }

   @Override
   public String q() {
      return this.b.bn;
   }

   private static void b() {
      c = -6027410822593995143L;
      long var0 = c ^ 1306354521147889324L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(56 + 12),
               (byte)(42 + 27),
               (byte)(14 + 69),
               (byte)(18 + 29),
               (byte)(56 + 11),
               (byte)(49 + 17),
               67,
               (byte)(32 + 15),
               (byte)(18 + 62),
               (byte)(9 + 66),
               (byte)(54 + 13),
               (byte)(46 + 37),
               (byte)(12 + 41),
               (byte)(77 + 3),
               97,
               (byte)(11 + 89),
               (byte)(11 + 89),
               (byte)(41 + 64),
               (byte)(70 + 40),
               (byte)(79 + 24)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_091.F("֏ր֑՞ֈ֗ձհհ֓ժոզ\u0557֍՜֛ժ֜դֆծիլ", (byte)92, 70);
               b[1] = NLoginCore_091.D("ԌԯԁՄԝӿՀՁԖԕԋԑ", (byte)92, 68);
               b[2] = NLoginCore_433.C("ԓԙԵԼԎԔԹԆԳԝԌԸԩԬՂԎԠՔԤՆԕԯԜԝ", (byte)92, 67);
               b[3] = NLoginCore_530.A("ƤƈƇƭƲƁŮƀŲƌƛƗƥźƾƨŸƽƠǂſƍƊƋ", (byte)92, 65);
               b[4] = NLoginCore_387.F("սՐր֑ՑդզՒեքէՠ", (byte)92, 70);
               b[5] = NLoginCore_553.A("ƀƙŭŽƃųƨƅƃƉƸſ", (byte)92, 65);
               b[6] = NLoginCore_397.A("ƛƈƅƱſſƉƖƕŹƸſ", (byte)92, 65);
               b[7] = NLoginCore_397.C("ԶԸԾӾԿԤԽԙԦԬԾԑ", (byte)92, 67);
               b[8] = NLoginCore_530.F("ՃՎբթխհյֆՋՖ֑ՠ", (byte)92, 70);
               b[9] = NLoginCore_223.E("֏ր֑՞ֈ֗ձհհ֓ժոզ\u0557֍՜֛ժ֜դֆծիլ", (byte)92, 69);
               b[10] = NLoginCore_530.B("ƃƂƮƛŬůƫƘƧƥƧƬƊůƆƯŲƚƌưƽƳƊƋ", (byte)92, 66);
               b[11] = NLoginCore_324.D("ԿԮԎԓԡԦԣՆԶԺՊԑ", (byte)92, 68);
               b[12] = NLoginCore_453.B("ƜůƟưŰƃƅűƄƣƆſ", (byte)92, 66);
               b[13] = NLoginCore_223.E("ՍՋճ՝֏՟ՏիճՔլ֓պՕ֕֓\u058bբփ֓՞֔իլ", (byte)92, 69);
               b[14] = NLoginCore_559.A("ŬŪƒżƮžŮƊƒųƌŹƙƙƓƩƟƞƠưƤƝƊƋ", (byte)92, 65);
               b[15] = NLoginCore_138.E(
                  "չ՝\u0590ցմՈփՎձ֑֓յձՔյր֚հ\u0590՛֠ո֖֓տ֛։ո֠ռփժ֥֬֬փտֳֶյ֊֭ֈռֽ֛\u058bնּ֮պւֺֆַׂ֒ֆֺֹֽ֣֛ׄ֫\u05ce֡\u058b֑\u058cַׅ֚֔\u05ccגׇ\u05cb֬זׁףֲ֣֕ןֱכֶ֜\u05eb\u05c8ֵ֧װ\u05ec",
                  (byte)92,
                  69
               );
               break;
            case 1:
               b[0] = NLoginCore_127.A("ƮƟưŽƧƶƐƏƏƲƆűƖƺƼƧƽƢſƜƘǃƊƋ", (byte)92, 65);
               b[1] = NLoginCore_141.F("՞օևՐ֑֒ՒծխղփզխՕ֏՛ի֡ի֖֞վիլ", (byte)92, 70);
               b[2] = NLoginCore_324.E("բըք\u058b՝գֈՕւլՍՕհ֓ՙֈւ՜ձա՞վիլ", (byte)92, 69);
               b[3] = NLoginCore_201.D("ԶԚԙԿՄԓԀԒԄԞԴԮԢԟԎՅԭԊՐԋԴԟԜԝ", (byte)92, 68);
               b[4] = NLoginCore_433.C("ԠԺԄՁՁԢԤԝԁԘԠԑ", (byte)92, 67);
               b[5] = NLoginCore_027.D("ԻԿԡԗԀӽՈԺԖԹԜԑ", (byte)92, 68);
               b[6] = NLoginCore_173.E("՞\u058c֏հվց֏ՐՐեշՠ", (byte)92, 69);
               b[7] = NLoginCore_138.A("ƥƩũƋƍƋƊƮƉƈƚƻƆưƟƪžźƼƱƟƍƊƋ", (byte)92, 65);
               b[8] = NLoginCore_453.D("ӸԾӼԐԹӾԹӻՈՈԾԑ", (byte)92, 68);
               b[9] = NLoginCore_397.A("ƮƟưŽƧƶƐƏƏƲƆƛƝƕƊƬƚźưƴƮƍƊƋ", (byte)92, 65);
               b[10] = NLoginCore_451.E("դգ֏ռՍՐ\u058cչֈֆօք֏Րֈ՛֗փ֤֑նվիլ", (byte)92, 69);
               b[11] = NLoginCore_241.C("ԘӼԬԂԜԽԝԻՈՋԠԑ", (byte)92, 67);
               b[12] = NLoginCore_127.B("ƤƊƜƝƞƠƭŷűŲƴſ", (byte)92, 66);
               b[13] = NLoginCore_446.B("ŬŪƒżƮžŮƊƒųƌƦƳƗƆƘǁŸƔƠƁƎƝƺƘƞǅǊƊƝǆƪ", (byte)92, 66);
               b[14] = NLoginCore_384.B("ŬŪƒżƮžŮƊƒųƊƏŶƊƾƑƎžƯƸƲƍƊƋ", (byte)92, 66);
               b[15] = NLoginCore_433.E(
                  "չ՝\u0590ցմՈփՎձ֑֓յձՔյր֚հ\u0590՛֠ո֖֓տ֛։ո֠ռփժ֥֬֬փտֳֶյ֊֭ֈռֽ֛\u058bնּ֮պւֺֆַׂ֒ֆֺֹֽ֣֛ׄ֫\u05ce֡\u058b֑\u058cַׅ֚֔\u05ccגׇ\u05cb֬זׁףֲ֣֕נזׂ֡\u05ebץמן\u05ca֥־׀ֿ׀\u05cbױדשׇ\u05caׯכ׀",
                  (byte)92,
                  69
               );
               break;
            case 2:
               b[0] = NLoginCore_397.A("ŦżƌƋŲƵƍƅơƸƍŵƶƇƼƵƙƻƷƕưƍƊƋ", (byte)92, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_384.F("՝՜՟էյ֖ծքՒ֑֛֔վջ՝֍\u0557֒՚֥սվիլ", (byte)92, 70);
         }
      }
   }

   public BungeeLoader a() {
      return this.a;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_383.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.F("ԝԿՁԡՅդ՜ղ՞ԭիակթԲ\u0557չոհնհՅ", (byte)57, 70), NLoginCore_383.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӂӄҷҼӆӄӈӍҲӁӊӐҡҢŊ", (byte)57, 66) + var1 + NLoginCore_397.A("ī", (byte)57, 65) + var2.toString(), var4
         );
      }
   }

   public void enable() {
      this.b.av();
   }

   public void disable() {
      this.b.aw();
      this.Q = (boolean)c;
   }

   @Override
   public boolean N() {
      return this.Q;
   }

   public void load() {
      this.Q = (boolean)b;
      this.b.au();
   }

   public NLoginCore_061 a(boolean var1) {
      return (NLoginCore_061)this.b.b(var1);
   }

   public NLoginCore_345 a() {
      return (NLoginCore_345)this.b.c();
   }

   protected abstract NLoginInterface_034[] a();

   public ProxyServer a() {
      return this.a.getProxy();
   }

   @Nullable
   public Map<String, ServerInfo> a() {
      return NLoginCore_546.a(l, this.a());
   }

   @Override
   public File c() {
      return this.a.getDataFolder();
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   @Override
   public NLoginInterface_020 a() {
      return this.b;
   }

   static {
      b();
      if (l == null) {
         l = NLoginCore_546.a(ProxyServer.class, a(bp, bq ^ br));
      }

      if (l == null) {
         throw new IllegalArgumentException(a(bt & bu, bv));
      }
   }

   @Override
   public String s() {
      return this.b.bo;
   }

   @Override
   public Object a(int var1) {
      switch (var1) {
         case 0:
            HashMap var13 = new HashMap();

            try {
               NLoginCore_219 var14 = new NLoginCore_219(new File(this.c().getParentFile().getParentFile(), a(e & f, g)));

               for (String var18 : var14.a(a(h & i, j))) {
                  String var6 = var14.b(a(k & l, m) + var18 + a(n, o ^ p));
                  if (var6 != null && !var6.isEmpty()) {
                     String[] var7 = var6.split(a(q, r ^ s));
                     String var8 = var7[t];
                     int var9 = var7.length > u ? NLoginCore_449.a(var7[v], w) : x;
                     var13.put(var18, new InetSocketAddress(var8, var9));
                  }
               }
            } catch (Throwable var12) {
               return a(y, z ^ aa);
            }

            StringBuilder var15 = new StringBuilder();

            for (InetSocketAddress var19 : var13.values()) {
               String var20;
               int var21;
               if (!var19.isUnresolved()) {
                  InetAddress var22 = var19.getAddress();
                  var21 = !var22.isLoopbackAddress() && !var22.isAnyLocalAddress() && !NLoginCore_071.a.b(var22) && !NLoginCore_071.b.b(var22) && !NLoginCore_071.c.b(var22)
                     ? ac
                     : ab;
                  var20 = var22.getHostAddress();
               } else {
                  var21 = ad;
                  var20 = var19.getHostName();
                  if (var20 == null) {
                     var21 = ae;
                  } else {
                     try {
                        var20 = InetAddress.getByName(var20).getHostAddress();
                     } catch (UnknownHostException var11) {
                        var21 = af;
                     }
                  }
               }

               if (var15.length() > 0) {
                  var15.append(a(ag, ah ^ ai));
               }

               if (var21 != 0) {
                  var15.append(a(aj, ak ^ al));
               } else {
                  var15.append(var20);
               }

               var15.append(a(am, an ^ ao));
               var15.append(var19.getPort());
            }

            return var15.toString();
         case 1:
            try {
               NLoginCore_219 var2 = new NLoginCore_219(new File(this.c().getParentFile().getParentFile(), a(ap, aq ^ ar)));
               Collection var3 = var2.d(a(as & at, au));
               if (var3 != null && !var3.isEmpty()) {
                  String var4 = (String)((Map)var3.iterator().next()).get(a(aw, ax ^ ay));
                  if (var4 != null && !var4.isEmpty()) {
                     String[] var5 = var4.split(a(ba, bb ^ bc));
                     return var5.length > bd ? NLoginCore_449.a(var5[be], bf) : bg;
                  }

                  return az;
               }

               return av;
            } catch (Throwable var10) {
               return bh;
            }
         default:
            return null;
      }
   }

   protected void i() {
      if (this.b.am()) {
         this.b.<NLoginCore_100>a().i();
      }
   }

   protected void T() {
      if (this.b.am()) {
         this.b.<NLoginCore_100>a().T();
      }
   }
}
