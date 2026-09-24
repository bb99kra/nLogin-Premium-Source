package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_187 {
   private static int ad = (3 >>> 127 | 3 << -127) & -1;
   private final Map<Integer, NLoginCore_509> o;
   private static int e = 0 >>> 166 | 0 << ~166 + 1;
   private static int k = Integer.reverse(-1);
   private static long i = Long.reverse(8935141660703064064L);
   private static long f = Long.reverse(-282048351919050356L);
   private final Map<NLoginCore_277, NLoginCore_509> n = new ConcurrentHashMap<>();
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int aw = Integer.reverse(0);
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int ap = (0 >>> 209 | 0 << ~209 + 1) & -1;
   private static int m = (50331648 >>> 248 | 50331648 << ~248 + 1) & -1;
   private static int at = Integer.reverse(0);
   private static int y = 2 >>> 191 | 2 << ~191 + 1;
   private static long ab = Long.reverse(-9217190012622114420L);
   private static int am = Integer.reverse(-1174405120);
   private static int aa = (671088640 >>> 91 | 671088640 << -91) & -1;
   private static long b = Long.reverse(-1152921504606846976L);
   private static int ar = 0 >>> 116 | 0 << -116;
   private static String[] a = new String[NLoginCore_187.bd];
   private static int n = (0 >>> 66 | 0 << ~66 + 1) & -1;
   private static int u = 6144 >>> 139 | 6144 << ~139 + 1;
   private static long h = Long.reverse(-9217190012622114420L);
   private static int an = (0 >>> 242 | 0 << ~242 + 1) & -1;
   private static String[] b = new String[NLoginCore_187.be];
   private static int be = 114688 >>> 14 | 114688 << -14;
   private static int c = (-1 >>> 104 | -1 << ~104 + 1) & -1;
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int r = -1 >>> 123 | -1 << ~123 + 1;
   private static int t = (2 >>> 225 | 2 << -225) & -1;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = Integer.reverse(0);
   private static long z = Long.reverse(-282048351919050356L);
   private static int bb = (32 >>> 229 | 32 << ~229 + 1) & -1;
   private static long l = Long.reverse(-282048351919050356L);
   private final NLoginInterface_048 d;
   private static int al = 268435456 >>> 124 | 268435456 << ~124 + 1;
   private static int au = Integer.reverse(Integer.MAX_VALUE);
   private static int ai = Integer.reverse(Integer.MIN_VALUE);
   private static int v = Integer.reverse(0);
   private static int x = Integer.reverse(1073741824);
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static long ae = Long.reverse(-9217190012622114420L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int av = 134217728 >>> 91 | 134217728 << -91;
   private static long s = Long.reverse(-282048351919050356L);
   private static long ac = Long.reverse(8935141660703064064L);
   private static int ah = Integer.reverse(0);
   private final NLoginType_008 K;
   private static int ba = 2048 >>> 170 | 2048 << ~170 + 1;
   private static int ay = Integer.reverse(0);
   private static int ak = Integer.reverse(-637534208);
   private static int j = Integer.reverse(1073741824);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = Integer.reverse(Integer.MIN_VALUE);
   private static int aj = (0 >>> 235 | 0 << -235) & -1;
   private static int bd = 939524096 >>> 27 | 939524096 << ~27 + 1;
   private static int p = 1024 >>> 169 | 1024 << ~169 + 1;
   private static int ax = Integer.reverse(-1073741824);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int q = Integer.reverse(-1073741824);
   private static long af = Long.reverse(8935141660703064064L);

   @Generated
   public NLoginCore_187(NLoginType_008 var1, NLoginInterface_048 var2) {
      this.o = new ConcurrentHashMap<>();
      this.K = var1;
      this.d = var2;
   }

   @Nullable
   public NLoginCore_509 a(String var1, UUID var2, InetAddress var3) {
      Map var10000 = this.o;
      Object[] var10001 = new Object[u];
      var10001[v] = var1;
      var10001[w] = var2;
      var10001[x] = var3.getHostAddress();
      return (NLoginCore_509)var10000.get(Objects.hash(var10001));
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -6068061249158154082L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(9 + 60),
                     (byte)(51 + 32),
                     (byte)(24 + 23),
                     (byte)(59 + 8),
                     66,
                     (byte)(39 + 28),
                     (byte)(43 + 4),
                     (byte)(36 + 44),
                     75,
                     (byte)(43 + 24),
                     (byte)(62 + 21),
                     (byte)(6 + 47),
                     (byte)(8 + 72),
                     (byte)(29 + 68),
                     (byte)(16 + 84),
                     (byte)(43 + 57),
                     (byte)(24 + 81),
                     (byte)(99 + 11),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.A("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҃ҒҋҒѦҏѨҝҝҌҐҞҗѯ", (byte)31, 65));
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

   public boolean b(String var1, @Nullable UUID var2) {
      int var3 = var1.length();
      return (boolean)((var3 <= ai || var1.charAt(aj) != ak || var1.charAt(var3 - al) != am)
            && !NLoginCore_477.C
               .a(new Object[an])
               .stream()
               .anyMatch(var2x -> (boolean)(!var2x.equalsIgnoreCase(var1) && (var2 == null || !var2x.equalsIgnoreCase(var2.toString())) ? ar : aq))
         ? ap
         : ao);
   }

   private static void b() {
      c = 3570939392181643265L;
      long var0 = c ^ -6068061249158154082L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(54 + 14),
               (byte)(28 + 41),
               (byte)(59 + 24),
               (byte)(5 + 42),
               (byte)(57 + 10),
               (byte)(32 + 34),
               (byte)(61 + 6),
               (byte)(34 + 13),
               (byte)(5 + 75),
               (byte)(11 + 64),
               (byte)(20 + 47),
               (byte)(29 + 54),
               (byte)(9 + 44),
               (byte)(78 + 2),
               (byte)(58 + 39),
               (byte)(70 + 30),
               100,
               105,
               (byte)(30 + 80),
               (byte)(12 + 91)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.F("՟շտազռա։ժ֘ոտ֤֜ֆձֈև։ճֈո֢֘֙ջշյշ֩ցֶ֛օ֝֝\u05c9ֈ׆֖־ֵּ֓", (byte)111, 70);
               b[1] = NLoginCore_446.E("՟շտազռա։ժ֘չզְֱ֛֑ծֶձր֣֍ֹ֧֊֑֧նֶ֑\u0590ր֏׀֯֡փׁׅ֕֊֥֮֓", (byte)111, 69);
               b[2] = NLoginCore_232.D("ԶՎՖԸԽՓԸՠՁկՐԽղևըֈՅ֍Ո\u0557պ\u0558՝ՈքճղքՐՑ֎ՔծմՓլպըչ֓յ֒խժ", (byte)111, 68);
               b[3] = NLoginCore_530.F("մհկս֣֚֟է֝շ֜ճ", (byte)111, 70);
               b[4] = NLoginCore_427.E(
                  "կ՜֑բե՛ֆվ֤խվְզ֧֭ժք։ֲ֮֮֊֦֍֔ս\u058c֍շո֑֘֬׆ֶ֚ցֺ֛֔\u05cdׄ\u058c֤׀ׄ\u05ce׆֔\u05cdִֵֶַַֻ֩֔כׇחֶ\u05caכג֡ךֿוץׅחן\u05c8֥ףפש\u05edײ׀\u05cdנ\u05ec״ׁ־ֿ",
                  (byte)111,
                  69
               );
               b[5] = NLoginCore_433.F("՟շտազռա։ժ֘չ։֑ր֩\u0590ք\u058bճֺ֪֥֭֜\u058cջ\u058c֮֓֔֎ցָ֘׀ֺքֆ\u05c8֖֓֫֫֓", (byte)111, 70);
               b[6] = NLoginCore_387.E("֑֕ՠֈ՞֙֘սվը֤ճ", (byte)111, 69);
               break;
            case 1:
               b[0] = NLoginCore_397.C("ԶՎՖԸԽՓԸՠՁկՏՖջճ՝Ո՟՞ՠՊ՟ՏչկհՒՎՌՎր\u0558֍ռս\u058bհի֊իկպ՞կե֖տ՛֖֔֬ֆֆկֈյն", (byte)111, 67);
               b[1] = NLoginCore_433.F("՟շտազռա։ժ֘չզְֱ֛֑ծֶձր֣֍ֹ֧֊֑֧նֶ֑\u0590ր֏ֹ֠ցֲ֙׀ׇׁ֕։֓", (byte)111, 70);
               b[2] = NLoginCore_427.D("ԶՎՖԸԽՓԸՠՁկՐԽղևըֈՅ֍Ո\u0557պ\u0558՝ՈքճղքՐՑ֎Քշձհճ՟ֈՙփ֕խյժ", (byte)111, 68);
               b[3] = NLoginCore_092.D("խյթկՇռճԸՔց՛զՒզնօպՊդՆխըՕՖ", (byte)111, 68);
               b[4] = NLoginCore_575.D(
                  "ՆԳըԹԼԲ՝ՕջՄՕևԽքվՁ՛ՠօ։օասդիՔգդՎՏըկփ֝֍ձ\u0558֑ղի֤֛գջ֛֥֗֝ի֤րի֎֍֎\u058b\u058cֲ֮֒֞֍ֲ֡֩ոֱֶּ֖֮֬֜֟ս֢֞ׄ\u05c8֖\u05cb֣֘\u05c8֊־֖֕", (byte)111, 68
               );
               b[5] = NLoginCore_451.A("ƑƩƱƓƘƮƓƻƜǊƫƻǃƲǛǂƶƽƥǜǗǟǬǎƾƭƾǅǆǠǀƳǗǸǣƶƶǖƮǻǱǶƻǅ", (byte)111, 65);
               b[6] = NLoginCore_387.C("ՙէՋ\u0558\u0558ծՏՓՋՃՍՊ", (byte)111, 67);
               break;
            case 2:
               b[0] = NLoginCore_451.B("ǇǖƔƬƬƦƭǝǇƖǌơƛƴƬƤǙƼƽƸǩƿƩƨǘƹǙǜǨǍƦǆ", (byte)111, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_091.C("ոՖռոսՐ՟ՊտԺփոհԺմռչ\u058bչ՞֏\u0558ՕՖ", (byte)111, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_187.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 70), NLoginCore_187.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.A("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöѽҌ҅ҌѠ҉Ѣҗҗ҆ҊҘґѩĐ", (byte)28, 65) + var1 + NLoginCore_110.B("ñ", (byte)28, 66) + var2.toString(), var4);
      }
   }

   public void l(NLoginCore_277 var1) {
      NLoginCore_509 var2 = this.a(var1);
      if (var2 != null) {
         var2.c.set(c);
      }
   }

   public void c() {
      this.d.Z();
   }

   public NLoginCore_509 a(NLoginCore_277 var1, @Nullable ForceRegisterConfig var2, String var3, InetSocketAddress var4, boolean var5, boolean var6, NLoginInterface_017 var7) {
      NLoginCore_509 var8 = this.n.computeIfAbsent(var1, var1x -> new NLoginCore_509(var1x, var4));
      int var9 = var8.c.getAndSet(d);
      switch (var9) {
         case -2:
            var8.c.set(var9);
            throw new IllegalStateException(a(j & k, l));
         case -1:
            var8.c.set(var9);
            throw new IllegalStateException(a(g, h ^ i));
         case 0:
         default:
            Map var10000 = this.o;
            Object[] var10001 = new Object[m];
            var10001[n] = var1.getName();
            var10001[o] = var1.a();
            var10001[p] = var8.d(NLoginCore_567.d);
            var10000.put(Objects.hash(var10001), var8);
            if (var2 != null) {
               var8.a(NLoginCore_567.a, var2);
            }

            var8.a(NLoginCore_567.b, var3);
            var8.a(NLoginCore_567.c, var5);
            var8.a(NLoginCore_567.e, var6);
            var8.a(NLoginCore_567.f, var7);
            var8.a(NLoginCore_567.p, NLoginCore_077.a);
            if (this.K.b().a() == NLoginCore_419.b) {
               NLoginCore_447 var10 = (NLoginCore_447)this.K.b();
               String var11 = NLoginCore_432.b(var1.a()) + a(q & r, s);
               File var12 = new File(var10.a().a(), var11);
               NLoginCore_510 var13 = new NLoginCore_510(var1.c(), var12);
               var8.a(NLoginCore_567.g, var13);
            }

            return var8;
         case 1:
            throw new IllegalStateException(a(e, f));
      }
   }

   static {
      b();
   }

   public NLoginCore_509 b(NLoginCore_277 var1) {
      String var2 = var1.getName();
      if (this.b(var2, var1.a())) {
         throw new IllegalStateException(a(y, z) + var2);
      } else {
         NLoginCore_509 var3 = this.a(var1);
         if (var3 == null) {
            throw new IllegalStateException(a(aa, ab ^ ac) + var2 + a(ad, ae ^ af));
         } else {
            return var3;
         }
      }
   }

   @Nullable
   public NLoginCore_509 a(NLoginCore_277 var1) {
      NLoginCore_509 var2 = this.n.get(var1);
      if (var2 == null) {
         InetSocketAddress var3 = var1.a();
         if (var3 != null) {
            var2 = this.a(var1.getName(), var1.a(), var3.getAddress());
            if (var2 != null && var2.c.get() == t) {
               this.n.put(var1, var2);
            }
         }
      }

      return var2;
   }

   public boolean b(NLoginCore_277 var1) {
      if (this.b(var1.getName(), var1.a())) {
         return (boolean)ag;
      } else {
         NLoginCore_509 var2 = this.a(var1);
         return (boolean)(var2 == null ? ah : var2.a().b(NLoginCore_077.g));
      }
   }

   public NLoginCore_187(NLoginType_008 var1) {
      this.o = new ConcurrentHashMap<>();
      this.K = var1;
      this.d = var1.b((boolean)a).a(() -> {
         if (!this.n.isEmpty()) {
            this.n.values().removeIf(var1x -> {
               if (var1x.c.get() == as) {
                  return (boolean)at;
               } else {
                  int var2 = var1x.c.getAndSet(au);
                  switch (var2) {
                     case -2:
                        NLoginCore_277 var3 = var1x.b();
                        Map var10000 = this.o;
                        Object[] var10001 = new Object[ax];
                        var10001[ay] = var3.getName();
                        var10001[az] = var3.a();
                        var10001[ba] = var1x.d(NLoginCore_567.d);
                        var10000.remove(Objects.hash(var10001));
                        return (boolean)bb;
                     case 1:
                        var1x.c.set(av);
                        return (boolean)aw;
                     default:
                        return (boolean)bc;
                  }
               }
            });
         }
      }, 0L, b, TimeUnit.SECONDS);
   }
}
