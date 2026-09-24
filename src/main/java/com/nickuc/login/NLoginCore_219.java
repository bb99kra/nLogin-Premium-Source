package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.DumperOptions.FlowStyle;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_219 implements NLoginInterface_002<String>, NLoginInterface_004 {
   private static File d;
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = 768 >>> 38 | 768 << -38;
   private static long g = Long.reverse(-1218533645814986497L);
   private static int w = 0 >>> 191 | 0 << -191;
   private static int an = (0 >>> 79 | 0 << -79) & -1;
   private static long h = Long.reverse(8070450532247928832L);
   private static int k = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1;
   private static int ae = Integer.reverse(1610612736);
   private static int bn = Integer.reverse(1879048192);
   private static int d = Integer.reverse(0);
   private static int ao = 0 >>> 139 | 0 << -139;
   private static long ad = Long.reverse(8070450532247928832L);
   private static int l = 536870912 >>> 252 | 536870912 << ~252 + 1;
   private static long be = Long.reverse(-1218533645814986497L);
   private static int r = (0 >>> 47 | 0 << -47) & -1;
   private static int o = 48 >>> 228 | 48 << -228;
   private static int f = 1073741824 >>> 126 | 1073741824 << -126;
   private static long z = Long.reverse(-1218533645814986497L);
   private static long bi = Long.reverse(8070450532247928832L);
   private static String[] b = new String[NLoginCore_219.bo];
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int ah = 14 >>> 65 | 14 << ~65 + 1;
   private static int aq = (288 >>> 5 | 288 << -5) & -1;
   private static long ac = Long.reverse(-1218533645814986497L);
   private static int ba = 0 >>> 160 | 0 << ~160 + 1;
   private static int bk = 1703936 >>> 17 | 1703936 << ~17 + 1;
   private static int ap = Integer.reverse(0);
   private static int b = 16777216 >>> 152 | 16777216 << -152;
   private static int bj = Integer.reverse(-1107296256);
   private static int v = Integer.reverse(0);
   private static long m = Long.reverse(-1218533645814986497L);
   private static int j = 0 >>> 23 | 0 << -23;
   private static int bd = (44 >>> 2 | 44 << -2) & -1;
   private static String[] a = new String[bn];
   private static int y = 8388608 >>> 53 | 8388608 << -53;
   private static long as = Long.reverse(8070450532247928832L);
   private static long av = Long.reverse(-6983141168849221377L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static long ar = Long.reverse(-1218533645814986497L);
   private static long aa = Long.reverse(8070450532247928832L);
   private final ThreadLocal<Yaml> a = ThreadLocal.withInitial(() -> {
      DumperOptions var1x = new DumperOptions();
      var1x.setDefaultFlowStyle(FlowStyle.BLOCK);
      NLoginCore_051 var2x = new NLoginCore_051(this, var1x);
      return new Yaml(new Constructor(new LoaderOptions()), var2x, var1x);
   });
   private static long n = Long.reverse(8070450532247928832L);
   private static long p = Long.reverse(-6983141168849221377L);
   private static int ak = Integer.reverse(268435456);
   private static long bl = Long.reverse(-1218533645814986497L);
   private static int t = 4194304 >>> 54 | 4194304 << -54;
   private static long ai = Long.reverse(-1218533645814986497L);
   private NLoginCore_103 b;
   private static int ax = Integer.reverse(0);
   private static int bc = Integer.reverse(0);
   private static int au = (-1 >>> 45 | -1 << -45) & -1;
   private static long bh = Long.reverse(-1218533645814986497L);
   private static long e = Long.reverse(-6983141168849221377L);
   private static int q = 0 >>> 49 | 0 << ~49 + 1;
   private static int c = (134217728 >>> 91 | 134217728 << ~91 + 1) & -1;
   private static long al = Long.reverse(-1218533645814986497L);
   private static long aj = Long.reverse(8070450532247928832L);
   private final File e;
   private static long af = Long.reverse(-6983141168849221377L);
   private static long bf = Long.reverse(8070450532247928832L);
   private static int ay = (131072 >>> 49 | 131072 << ~49 + 1) & -1;
   private static int a = (536870912 >>> 221 | 536870912 << ~221 + 1) & -1;
   private static int aw = Integer.reverse(0);
   private static int at = Integer.reverse(1342177280);
   private static int s = Integer.reverse(0);
   private static long bm = Long.reverse(8070450532247928832L);
   private static int ag = (2097152 >>> 181 | 2097152 << ~181 + 1) & -1;
   private static long c;
   private static int ab = (5 >>> 160 | 5 << ~160 + 1) & -1;
   private static int bb = 524288 >>> 179 | 524288 << ~179 + 1;
   private static int x = 0 >>> 47 | 0 << ~47 + 1;
   private static long am = Long.reverse(8070450532247928832L);
   private static int bo = 7 >>> 255 | 7 << -255;

   private static void b() {
      c = -67436933593732873L;
      long var0 = c ^ 7753440328580353715L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(29 + 39),
               (byte)(42 + 27),
               (byte)(79 + 4),
               (byte)(32 + 15),
               (byte)(51 + 16),
               (byte)(58 + 8),
               (byte)(21 + 46),
               (byte)(10 + 37),
               (byte)(56 + 24),
               (byte)(45 + 30),
               67,
               (byte)(58 + 25),
               (byte)(38 + 15),
               (byte)(56 + 24),
               (byte)(34 + 63),
               (byte)(4 + 96),
               (byte)(8 + 92),
               (byte)(74 + 31),
               (byte)(85 + 25),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_141.E("խՒո֑ձծհչէ֎֙֝ջ֚\u0590բդքդռ֤֪ջ֩՟չպզ֢\u058bօֵָ֦֢֓֟֒\u0590չֳֻշ׀֛տտִֵ֗֗׃ָ֥֏\u0590", (byte)96, 69);
               b[1] = NLoginCore_530.A("ƹŷŹƐŻƖŻƴơƊưƇ", (byte)96, 65);
               b[2] = NLoginCore_427.E("Ջեժ֖֙ըհ\u058c՚\u058cՕ\u0558Փ֕ց՚֍֤ՠւըգ֪֧֚ր\u058cժգր֑ր\u058b֕֕շ֧քֈ֥։ֹ֛ք", (byte)96, 69);
               b[3] = NLoginCore_521.F("֖ՔՖխ\u0558ճ\u0558֑վէ֍դ", (byte)96, 70);
               b[4] = NLoginCore_575.A("ƫƃƳƶƌƈƴŷƭŻƎƇ", (byte)96, 65);
               b[5] = NLoginCore_232.A("ƄŹƳưƦƻŵƴƨƮƜƴƔƢǇƇǆƞƗƧƭǋƒƓ", (byte)96, 65);
               b[6] = NLoginCore_110.D("ԶԩԾՇԲԧԭՐԓՒՖԝ", (byte)96, 68);
               b[7] = NLoginCore_076.B("ƏƊƸƖƎƒƚƿƨƮƽƝſƓžƺƛǂƣƘǊǋƒƓ", (byte)96, 66);
               b[8] = NLoginCore_471.D("ՁՏՋԩՂԐԢՏԪՑՏՃԵՇ\u0557\u0558ԺՍԽԵԚՋՅԴԺԴՅ՛իՅՖԻՅիեԩԲԭՋժէիՌԽ", (byte)96, 68);
               b[9] = NLoginCore_173.C("ՈԫԽՍԊՐԤՉԐՊՊԕՒԒ՝\u0557՚ԮՊԮԯաԨԩ", (byte)96, 67);
               b[10] = NLoginCore_451.A("ƫƹƵƓƬźƌƹƔƻƺƲǄƏƀƐǈƠƺƟƭǋƒƓ", (byte)96, 65);
               b[11] = NLoginCore_575.E("ս\u0590\u0557փ֚դՕքէ֕չր֛֞֔վ֣֎֔\u0590սը֓ջվխ֧ը֟֜ֈ֝", (byte)96, 69);
               b[12] = NLoginCore_201.A("ƤųƕƯƊƳŰƛŹƘǁƒƖƶƟƆƕǆƹƻǇƥƒƓ", (byte)96, 65);
               b[13] = NLoginCore_453.F("դ֍հ֊ճբչֈմ֔Ֆդ", (byte)96, 70);
               break;
            case 1:
               b[0] = NLoginCore_092.C("ԦԋԱՊԪԧԩԲԠՇՒՖԴՓՉԛԝԽԝԵ՝գԴբԘԲԳԟ՛ՄԾ՟ծՌ\u0558ձ՛ՋՉԲլմԯղՑՄդ՜ՉԹկՎ՟ձՈՉ", (byte)96, 67);
               b[1] = NLoginCore_471.E("նաէ֓շժփքճնճդ", (byte)96, 69);
               b[2] = NLoginCore_173.F("Ջեժ֖֙ըհ\u058c՚\u058cՕ\u0558Փ֕ց՚֍֤ՠւըգ֪֧֚ր\u058cժգր֑րղ֤օ֏ֳ֨ֆֵֻֽ֓ք", (byte)96, 70);
               b[3] = NLoginCore_553.F("եբտ֔Ցչն՛֓ջշդ", (byte)96, 70);
               b[4] = NLoginCore_004.F("վթ֒\u058cՋՕժքօ֔֝դ", (byte)96, 70);
               b[5] = NLoginCore_232.D("ԚԏՉՆԼՑԋՊԾՄԲՃԒՄՌՉՋ՟՟ԪԴաԨԩ", (byte)96, 68);
               b[6] = NLoginCore_446.C("ՍԚԸԎԡԊԥԢՓՈԸԝ", (byte)96, 67);
               b[7] = NLoginCore_384.F("լէ֕ճիկշ֜օ\u058b֙ժչՠռյ֤֝ն֜ո֘կհ", (byte)96, 70);
               b[8] = NLoginCore_091.F("ֈ֖֒հ։\u0557թ֖ձ֖֘֊ռ֎֞֟ց֔քռա֒\u058cջցջ\u058cֲ֢\u058c֝ւ֥֣օևմ֤֒։ֆ։\u058bք", (byte)96, 70);
               b[9] = NLoginCore_004.F("֏ղք֔Ց֗ի\u0590\u0557֑֒տ֑֟֙՝ձ՟֡շւ֨ճլպ֎֮ւ֭ֈձռ", (byte)96, 70);
               b[10] = NLoginCore_110.C("ՁՏՋԩՂԐԢՏԪՑՐՆՕԮՋԻԯԑԸՔ\u0557ՑԨԩ", (byte)96, 67);
               b[11] = NLoginCore_223.B("ƠƳźƦƽƇŸƧƊƸƜƣƾǁƷơǆƱƷƳƠſƪƢƜƐƞƼƟƩƎƏ", (byte)96, 66);
               b[12] = NLoginCore_092.C("ԺԉԫՅԠՉԆԱԏԮՖԴՌԔԤԜԩՠԬԳՊՑԨԩ", (byte)96, 67);
               b[13] = NLoginCore_241.B("ƤůŰŷŶƏƸƛơƷƎƙƤƥƓƅƈƀǅƃƉǋƒƓ", (byte)96, 66);
               break;
            case 2:
               b[0] = NLoginCore_530.F("ֆ\u058bՏ֙լչ֓֎֔֞\u058c֝ս\u0590պ֤ա֔ՠշե֪րցդ֊տ֊թժ֝ղ", (byte)96, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_451.E("֓ա֍֊֓֘\u0557ք֏կէտ֠֎խ\u058c՛ն֏՟բ֘կհ", (byte)96, 69);
         }
      }
   }

   public NLoginCore_219(String var1) {
      this(var1, (boolean)a);
   }

   public synchronized boolean W() {
      try {
         if (this.b == null) {
            if (!NLoginCore_366.b(this.e)) {
               throw new IOException(a(d, e) + this.e + a(f, g ^ h));
            } else {
               this.X();
               return (boolean)i;
            }
         } else {
            OutputStreamWriter var1 = new OutputStreamWriter(Files.newOutputStream(this.e.toPath()), StandardCharsets.UTF_8);

            try {
               this.a.get().dump(this.b.d, var1);
            } catch (Throwable var5) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }

               throw var5;
            }

            var1.close();
            return (boolean)k;
         }
      } catch (IOException var6) {
         NLoginCore_370.c(a(l, m ^ n) + this.e + a(o, p), var6);
         return (boolean)r;
      }
   }

   public synchronized boolean a(boolean var1) {
      if (!this.e.exists()) {
         return (boolean)x;
      } else {
         try {
            BufferedReader var2 = Files.newBufferedReader(this.e.toPath());

            int var7;
            try {
               StringBuilder var3 = new StringBuilder();

               String var4;
               while ((var4 = var2.readLine()) != null) {
                  if (var3.length() > 0) {
                     var3.append(a(y, z ^ aa));
                  }

                  var3.append(var4);
               }

               String var5 = var3.toString();
               if (var1) {
                  var5 = var5.replaceAll(a(ab, ac ^ ad), a(ae, af));
               }

               Object var6 = (Map)this.a.get().loadAs(var5, LinkedHashMap.class);
               if (var6 == null) {
                  var6 = new LinkedHashMap();
               }

               this.b = new NLoginCore_103((Map<?, ?>)var6, null);
               var7 = ag;
            } catch (Throwable var9) {
               if (var2 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }
               }

               throw var9;
            }

            if (var2 != null) {
               var2.close();
            }

            return (boolean)var7;
         } catch (Exception var10) {
            NLoginCore_370.c(a(ah, ai ^ aj) + this.e + a(ak, al ^ am), var10);
            return (boolean)ao;
         }
      }
   }

   @Nonnull
   public List<?> l(String var1) {
      return this.a(var1, NLoginCore_135.n);
   }

   static {
      b();
   }

   public NLoginCore_219(File var1, boolean var2) {
      this.e = var1;
      if (var2) {
         this.X();
      }
   }

   public synchronized boolean X() {
      return this.a((boolean)w);
   }

   public boolean Z() {
      return (boolean)(this.b != null ? az : ba);
   }

   public boolean q(@Nonnull String var1) {
      return this.p(var1);
   }

   private static String a(int var0, long var1) {
      var1 ^= 14L;
      var1 ^= 7753440328580353715L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(50 + 19),
                     (byte)(6 + 77),
                     (byte)(36 + 11),
                     (byte)(55 + 12),
                     (byte)(55 + 11),
                     67,
                     (byte)(6 + 41),
                     (byte)(16 + 64),
                     (byte)(9 + 66),
                     (byte)(13 + 54),
                     (byte)(33 + 50),
                     (byte)(17 + 36),
                     (byte)(44 + 36),
                     97,
                     (byte)(42 + 58),
                     (byte)(68 + 32),
                     (byte)(32 + 73),
                     (byte)(90 + 20),
                     (byte)(35 + 68)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.F("կռջԾվպյվ։ոՅփևրփ։Ջ࣡ࣤࣗࣧࢵ࣓ࣆࣩࣩࣗ࣬", (byte)80, 70));
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

   public NLoginCore_219(String var1, boolean var2) {
      this(new File(d, var1), var2);
   }

   public NLoginCore_219(File var1) {
      this(var1, (boolean)c);
   }

   @Override
   public <T> T c() {
      return (T)(this.Z() ? this.b : null);
   }

   public NLoginCore_219(String var1, File var2) {
      this(var1, var2, (boolean)b);
   }

   @Override
   public String toString() {
      return a(bd, be ^ bf) + this.e + a(bg, bh ^ bi) + this.b + bj;
   }

   public boolean p(String var1) {
      return (boolean)(this.Z() && this.b.a(var1) != null ? bb : bc);
   }

   public Set<String> a(String var1) {
      if (!this.Z()) {
         return NLoginCore_114.q;
      } else {
         Collection var2 = var1.isEmpty() ? this.b.e() : this.b.b(var1).e();
         var2.removeIf(String::isEmpty);
         return new LinkedHashSet<>(var2);
      }
   }

   public Object f(@Nonnull String var1) {
      return this.Z() ? this.b.a(var1) : null;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_219.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_553.B("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 66), NLoginCore_219.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.A("ĜĩĨëīħĢīĶĥòİĴĭİĶøҎґ҄ҔѢҀѳ҄ҖҙҖď", (byte)29, 65) + var1 + NLoginCore_076.D("ц", (byte)29, 68) + var2.toString(), var4
         );
      }
   }

   public static void b(File var0) {
      d = var0;
   }

   @Nonnull
   public List<String> k(String var1) {
      return this.b(var1, NLoginCore_135.o);
   }

   public NLoginCore_219(String var1, File var2, boolean var3) {
      this(new File(var2, var1), var3);
   }

   private synchronized boolean b(String var1, boolean var2) {
      boolean var3 = this.e.exists();
      if (!var3) {
         this.Y();

         try {
            NLoginCore_366.a(var1, this.e);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }
      }

      if (var2) {
         this.X();
      }

      return (boolean)(!var3 ? u : v);
   }

   @Nullable
   public List<?> a(String var1, @Nullable List<?> var2) {
      if (this.Z()) {
         List var3 = this.b.a(var1, var2);
         return var3 == null ? var2 : var3;
      } else {
         return var2;
      }
   }

   @Generated
   public File d() {
      return this.e;
   }

   public synchronized boolean n(String var1) {
      return this.b(var1, (boolean)s);
   }

   public synchronized boolean o(String var1) {
      return this.b(var1, (boolean)t);
   }

   public void a(String var1, Object var2) {
      if (!this.Z()) {
         this.W();
      }

      if (this.Z()) {
         this.b.a(var1, var2);
      }
   }

   @Nullable
   public List<String> b(String var1, @Nullable List<String> var2) {
      if (!this.Z()) {
         return var2;
      } else {
         List var3 = this.b.a(var1, null);
         return var3 == null ? var2 : var3.stream().map(var0 -> var0 != null ? var0.toString() : a(bk, bl ^ bm)).collect(Collectors.toList());
      }
   }

   public synchronized boolean r() {
      return this.e.exists();
   }

   public synchronized boolean Y() {
      if (!this.e.exists()) {
         return (boolean)ap;
      } else if (!this.e.delete()) {
         NLoginCore_370.d(a(aq, ar ^ as) + this.e + a(at & au, av));
         return (boolean)ax;
      } else {
         this.b = null;
         return (boolean)ay;
      }
   }
}
