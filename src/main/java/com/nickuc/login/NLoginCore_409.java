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
import lombok.Generated;
import org.bukkit.Bukkit;

public class NLoginCore_409 {
   private static int ah = Integer.reverse(-603979776);
   private static int bv = Integer.reverse(Integer.MIN_VALUE);
   private static int bi = Integer.reverse(0);
   private static int as = Integer.reverse(671088640);
   private static long u = Long.reverse(4302828165633161840L);
   private static int bm = 16 >>> 68 | 16 << ~68 + 1;
   public static final NLoginCore_409 l = a(NLoginCore_409.bs, NLoginCore_409.bt, NLoginCore_409.bu);
   public static final NLoginCore_409 c = a(NLoginCore_409.ar, as, NLoginCore_409.at);
   private static int bx = (0 >>> 244 | 0 << ~244 + 1) & -1;
   private static int ce = Integer.reverse(Integer.MIN_VALUE);
   private static int g = 32 >>> 37 | 32 << -37;
   private static int var_do = 268435456 >>> 156 | 268435456 << -156;
   public static final NLoginCore_409 j = a(bm, NLoginCore_409.bn, NLoginCore_409.bo);
   public static final NLoginCore_409 g = a(NLoginCore_409.bd, NLoginCore_409.be, NLoginCore_409.bf);
   public static final NLoginCore_409 s = a(NLoginCore_409.cn, NLoginCore_409.co, NLoginCore_409.cp);
   private static int bj = Integer.reverse(Integer.MIN_VALUE);
   private static int bz = Integer.reverse(-1342177280);
   private static int cl = Integer.reverse(-1879048192);
   private static int co = Integer.reverse(268435456);
   private static int q = (0 >>> 23 | 0 << ~23 + 1) & -1;
   private static int l = Integer.reverse(0);
   private static int cp = 0 >>> 191 | 0 << ~191 + 1;
   private static int ap = Integer.reverse(-1476395008);
   private static int aj = Integer.reverse(1342177280);
   private static int bs = Integer.reverse(Integer.MIN_VALUE);
   private static int bc = Integer.MIN_VALUE >>> 93 | Integer.MIN_VALUE << -93;
   private static int ab = 0 >>> 225 | 0 << ~225 + 1;
   private static long dm = Long.reverse(4735173729860729456L);
   private static int cf = (44 >>> 130 | 44 << -130) & -1;
   private static int cz = Integer.reverse(-1610612736);
   private static int ao = (1 >>> 32 | 1 << ~32 + 1) & -1;
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static int cd = 0 >>> 30 | 0 << -30;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   public static final NLoginCore_409 i = a(bj, NLoginCore_409.bk, NLoginCore_409.bl);
   private static int ax = 256 >>> 8 | 256 << -8;
   private static int ae = 7552 >>> 7 | 7552 << ~7 + 1;
   private static int dr = (0 >>> 28 | 0 << ~28 + 1) & -1;
   private static long r = Long.reverse(4302828165633161840L);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int de = Integer.reverse(1610612736);
   private static int ag = 1979711488 >>> 249 | 1979711488 << ~249 + 1;
   private static int dq = Integer.reverse(1073741824);
   private static int aq = ('\ue000' >>> 'M' | 57344 << ~77 + 1) & -1;
   public static final NLoginCore_409 n = a(NLoginCore_409.by, bz, NLoginCore_409.ca);
   private static int cu = Integer.reverse(-1073741824);
   private final int B;
   private static int ca = Integer.reverse(0);
   private static int af = 128 >>> 71 | 128 << -71;
   private static int ai = Integer.reverse(-603979776);
   public static final NLoginCore_409 b = a(ao, ap, aq);
   private static int b = Integer.reverse(0);
   private static int bf = Integer.reverse(-1073741824);
   private static int dd = Integer.reverse(0);
   public static final NLoginCore_409 o = a(NLoginCore_409.cb, NLoginCore_409.cc, cd);
   private static long s = Long.reverse(8791026472627208192L);
   public static final NLoginCore_409 k = a(NLoginCore_409.bp, NLoginCore_409.bq, NLoginCore_409.br);
   private static int y = Integer.reverse(0);
   private static int ac = Integer.reverse(0);
   private static int x = (0 >>> 129 | 0 << ~129 + 1) & -1;
   private static long cv = Long.reverse(4735173729860729456L);
   private static int bo = (0 >>> 90 | 0 << ~90 + 1) & -1;
   private static int ar = 32 >>> 5 | 32 << ~5 + 1;
   private static int j = Integer.reverse(0);
   private static int a = 2 >>> 65 | 2 << -65;
   public static final NLoginCore_409 p = a(ce, cf, NLoginCore_409.cg);
   private static int am = Integer.reverse(0);
   private static int cj = 0 >>> 197 | 0 << ~197 + 1;
   private static long cr = Long.reverse(4302828165633161840L);
   private static String[] ZKM_STR_A = new String[aj];
   private static int dl = Integer.reverse(-1);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = 81920 >>> 77 | 81920 << -77;
   private static int ct = Integer.reverse(-1);
   private static int aw = ('耀' >>> 174 | 32768 << -174) & -1;
   public static final NLoginCore_409 r = a(NLoginCore_409.ck, cl, NLoginCore_409.cm);
   private static int be = 304 >>> 36 | 304 << ~36 + 1;
   private static int m = (131072 >>> 241 | 131072 << ~241 + 1) & -1;
   private static int ci = (2621440 >>> 50 | 2621440 << -50) & -1;
   private static long du = Long.reverse(8791026472627208192L);
   private static long dt = Long.reverse(4302828165633161840L);
   private static String[] ZKM_STR_B = new String[ak];
   private static int bb = Integer.reverse(-939524096);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);
   private static int bk = -2147483644 >>> 190 | -2147483644 << -190;
   private static int cw = Integer.reverse(536870912);
   private static int dn = 0 >>> 162 | 0 << ~162 + 1;
   private static int aa = Integer.reverse(0);
   private static long db = Long.reverse(8791026472627208192L);
   private static int bt = Integer.reverse(-268435456);
   public static final NLoginCore_409 e = a(ax, NLoginCore_409.ay, NLoginCore_409.az);
   private static int dk = Integer.reverse(268435456);
   private static int bq = 8 >>> 223 | 8 << ~223 + 1;
   private static long cs = Long.reverse(8791026472627208192L);
   private static int az = Integer.reverse(0);
   private static int au = Integer.reverse(Integer.MIN_VALUE);
   private static int ch = Integer.reverse(Integer.MIN_VALUE);
   private static int bn = (557056 >>> 207 | 557056 << ~207 + 1) & -1;
   private final int A;
   private static int e = 16777216 >>> 88 | 16777216 << -88;
   private static int dc = Integer.reverse(Integer.MIN_VALUE);
   private static long dj = Long.reverse(8791026472627208192L);
   public static final NLoginCore_409 h = a(NLoginCore_409.bg, NLoginCore_409.bh, bi);
   private static int bd = ('耀' >>> 207 | 32768 << ~207 + 1) & -1;
   private static long c;
   private static int at = Integer.reverse(1610612736);
   private static int ad = 134217728 >>> 155 | 134217728 << -155;
   private static int n = (0 >>> 178 | 0 << ~178 + 1) & -1;
   private static int bg = Integer.reverse(Integer.MIN_VALUE);
   private static int cm = (0 >>> 44 | 0 << ~44 + 1) & -1;
   private static int cg = 0 >>> 4 | 0 << ~4 + 1;
   private final int z;
   private static int k = 268435456 >>> 28 | 268435456 << -28;
   private static int bw = Integer.reverse(1879048192);
   private static int d = 0 >>> 44 | 0 << -44;
   private static int an = 0 >>> 81 | 0 << -81;
   private static int cc = (12 >>> 32 | 12 << -32) & -1;
   private static int cy = -1 >>> 125 | -1 << ~125 + 1;
   public static final NLoginCore_409 f = a(NLoginCore_409.ba, bb, bc);
   public static final NLoginCore_409 m = a(bv, bw, bx);
   private static int dp = 12 >>> 130 | 12 << ~130 + 1;
   private static int p = 0 >>> 204 | 0 << ~204 + 1;
   public static final NLoginCore_409 a = a(NLoginCore_409.al, am, an);
   private static long df = Long.reverse(4735173729860729456L);
   private static long cx = Long.reverse(4735173729860729456L);
   private static int ba = (134217728 >>> 91 | 134217728 << ~91 + 1) & -1;
   private static int f = 0 >>> 255 | 0 << -255;
   private static int by = (16384 >>> 110 | 16384 << -110) & -1;
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int av = Integer.reverse(671088640);
   private static int cq = Integer.reverse(1073741824);
   public static final NLoginCore_409 q = a(ch, ci, cj);
   private static long di = Long.reverse(4302828165633161840L);
   private static int ds = -1879048192 >>> 156 | -1879048192 << -156;
   private static int bu = (0 >>> 217 | 0 << ~217 + 1) & -1;
   private static int o = (256 >>> 104 | 256 << -104) & -1;
   private static int ay = Integer.reverse(671088640);
   private static long da = Long.reverse(4302828165633161840L);
   private static final NLoginCore_409 t;
   public static final NLoginCore_409 d = a(au, av, aw);
   private static int al = Integer.reverse(1476395008);
   private static int ck = Integer.reverse(Integer.MIN_VALUE);
   private static int bh = -2147483639 >>> 255 | -2147483639 << -255;
   private static int cb = Integer.reverse(Integer.MIN_VALUE);
   private static int bl = (0 >>> 141 | 0 << -141) & -1;
   private static long v = Long.reverse(8791026472627208192L);
   private static int br = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static int dh = (469762048 >>> 26 | 469762048 << -26) & -1;
   private static int dg = Integer.reverse(1073741824);

   public static NLoginCore_409 a() {
      return t;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_409.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.B("ŽƟơƁƥǄƼǒƾƍǋǁǏǉƒƷǙǘǐǖǐƥ", (byte)107, 66), NLoginCore_409.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.B("ƸǅǄƇǇǃƾǇǒǁƎǌǐǉǌǒƔӹӻԨԤԞԞԥԓԤԂԋԥԯƭ", (byte)107, 66) + var1 + NLoginCore_141.D("\u0530", (byte)107, 68) + var2.toString(), var4
         );
      }
   }

   @Override
   public String toString() {
      return this.z + a(q, r ^ s) + this.A + a(t, u ^ v) + this.B;
   }

   private static NLoginCore_409 a(int var0, int var1, int var2) {
      return new NLoginCore_409(var0, var1, var2);
   }

   public boolean b(NLoginCore_409 var1) {
      if (this.z > var1.z) {
         return (c != 0);
      } else if (this.z < var1.z) {
         return (d != 0);
      } else if (this.A > var1.A) {
         return (e != 0);
      } else if (this.A < var1.A) {
         return (f != 0);
      } else {
         return ((this.B > var1.B ? g : h) != 0);
      }
   }

   @Generated
   protected boolean b(Object var1) {
      return var1 instanceof NLoginCore_409;
   }

   public boolean c(NLoginCore_409 var1) {
      return ((!this.b(var1) != 0) ? i : j);
   }

   private static String a(int var0, long var1) {
      var1 ^= 94L;
      var1 ^= 5290796461318668923L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(10 + 58),
                     (byte)(33 + 36),
                     (byte)(24 + 59),
                     (byte)(43 + 4),
                     (byte)(54 + 13),
                     66,
                     (byte)(46 + 21),
                     (byte)(9 + 38),
                     (byte)(10 + 70),
                     (byte)(39 + 36),
                     (byte)(4 + 63),
                     (byte)(76 + 7),
                     (byte)(47 + 6),
                     (byte)(78 + 2),
                     (byte)(36 + 61),
                     (byte)(20 + 80),
                     100,
                     (byte)(28 + 77),
                     (byte)(42 + 68),
                     (byte)(92 + 11)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(48 + 35)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.B("öăĂÅąāüąĐÿÌĊĎćĊĐÒзйѦѢќќѣёѢрщѣѭ", (byte)10, 66));
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
   public int e() {
      return this.z;
   }

   private static void b() {
      c = 1034764045911944668L;
      long var0 = c ^ 5290796461318668923L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(16 + 52),
               (byte)(8 + 61),
               (byte)(22 + 61),
               (byte)(5 + 42),
               (byte)(4 + 63),
               (byte)(13 + 53),
               67,
               (byte)(44 + 3),
               (byte)(72 + 8),
               (byte)(39 + 36),
               (byte)(35 + 32),
               (byte)(56 + 27),
               (byte)(42 + 11),
               (byte)(63 + 17),
               97,
               (byte)(92 + 8),
               (byte)(89 + 11),
               (byte)(84 + 21),
               (byte)(107 + 3),
               (byte)(60 + 43)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), (byte)(80 + 3)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.A("ļƇŶŶŽňƃƐŨœŠř", (byte)73, 65);
               ZKM_STR_B[1] = NLoginCore_575.B("ļƇŶŶŽňƃƐŨœŠř", (byte)73, 66);
               ZKM_STR_B[2] = NLoginCore_092.C("ӽӆӋӥӆӦԐӤӊӝӽӘ", (byte)73, 67);
               ZKM_STR_B[3] = NLoginCore_324.A("łŅƌšŨƆŉŻŰūőƑƇŨŢŴƈƌŜƎŭſƚſƘƄŴƙŲƃƥŹƧƦƢƉƦơƜƮƎƪƐŹ", (byte)73, 65);
               ZKM_STR_B[4] = NLoginCore_559.D("ӻӈӞҾӅԂӋӋӟӒԉӘ", (byte)73, 68);
               ZKM_STR_B[5] = NLoginCore_004.C("ӒӈԆӆӜӨԇԇӫӢӫӘ", (byte)73, 67);
               ZKM_STR_B[6] = NLoginCore_201.B("ŽƅūƁŝƀƃżōŽŨř", (byte)73, 66);
               ZKM_STR_B[7] = NLoginCore_521.D("ӁӄԋӠӧԅӈӺӯӪӐԐԆӧӡӳԇԋӛԍӬӾԙӾԗԃӳԘӱԂԤӸԦԥԡԈԥԠԛԭԍԩԏӸ", (byte)73, 68);
               ZKM_STR_B[8] = NLoginCore_232.F("ՇԽջԻՑ՝ռռՠ\u0557ՠՍ", (byte)73, 70);
               ZKM_STR_B[9] = NLoginCore_004.B("řƊƅŸŝŁšŦŤŢųƌƏũťŒœƚŴŨƏƌŲŞŢŭƛƛƓŠžƨƨƠũƕƆƯŧƯƑƧƌƱƵƴűƍƬŻƔƈƊƨƉƊƣƤŶƙơƿƗơƔǋǋǊƨƊưƻǋƑƞưƓƕƱǄǋƪǐǊǚƷƤƥ", (byte)73, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.B("ƈŶƍşŅƍżőŉŤŠř", (byte)73, 66);
               ZKM_STR_B[1] = NLoginCore_138.D("ӨӖӇӝӬӥӁӹӍӫԑӘ", (byte)73, 68);
               ZKM_STR_B[2] = NLoginCore_575.A("ňŇŪŵšōŞƑũőŏř", (byte)73, 65);
               ZKM_STR_B[3] = NLoginCore_384.D("ӁӄԋӠӧԅӈӺӯӪӐԐԆӧӡӳԇԋӛԍӬӾԙӾԗԃӳԘӱԂԤӸӺӸӾԇԢԊԘӽԜԢԔӫԔԭԯԆԙӲӸԛԱԼԃԄ", (byte)73, 68);
               ZKM_STR_B[4] = NLoginCore_427.C("ӽӀӕԈӌӀӜӈӨӲӫӘ", (byte)73, 67);
               ZKM_STR_B[5] = NLoginCore_201.F("թՕՋՊՊԾ\u0558Փգ՟ՐՍ", (byte)73, 70);
               ZKM_STR_B[6] = NLoginCore_451.A("ţŤŶƁŘůŦƁƌŊŨř", (byte)73, 65);
               ZKM_STR_B[7] = NLoginCore_453.E("ԶԹրՕ՜պԽկդ՟Յօջ՜ՖըռրՐւաճ֎ճ\u058cոը֍զշ֙խտ֒լ֚ռփ֦֒ւն֘֓օ֨ն\u058bֈսֆֈֱ֨ոչ", (byte)73, 69);
               ZKM_STR_B[8] = NLoginCore_471.A("ŧŷŗƁżřŨƁŮſŠř", (byte)73, 65);
               ZKM_STR_B[9] = NLoginCore_110.C("ӘԉԄӷӜӀӠӥӣӡӲԋԎӨӤӑӒԙӳӧԎԋӱӝӡӬԚԚԒӟӽԧԧԟӨԔԅԮӦԮԐԦԋ\u0530ԴԳӰԌԫӺԓԇԉԧԈԉԢԣӵԘԠԾԖԠԓՊՊՉԧԉԯԺՊԐԞԭԞՅՆԓԔՋԙԗԮՌԣԤ", (byte)73, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_004.E("ջՉծՖԹՋԻյոպՃևճՂ֊ժպօ՛փՎֆլ֊տց\u0590յ֖խ֙Ք", (byte)73, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.C("ӞӺԇԈӽӤӥӾӨԇӧӘ", (byte)73, 67);
         }
      }
   }

   @Generated
   private NLoginCore_409(int var1, int var2, int var3) {
      this.z = var1;
      this.A = var2;
      this.B = var3;
   }

   @Generated
   public int g() {
      return this.B;
   }

   static {
      b();
      String var0 = Bukkit.getVersion();
      String var1 = a(cq, cr ^ cs);
      int var2 = var0.indexOf(var1);
      if (var2 == ct) {
         throw new IllegalArgumentException(a(cu, cv) + var0);
      } else {
         String var3 = var0.substring(var2);
         int var4 = var3.indexOf(a(cw, cx));
         if (var4 != cy) {
            var3 = var3.substring(var1.length(), var4);
            String[] var5 = var3.split(a(cz, da ^ db));
            if (var5.length > dc) {
               var3 = var5[dd];
            }
         }

         String[] var11 = var3.split(a(de, df));
         if (var11.length < dg) {
            throw new IllegalArgumentException(a(dh, di ^ dj) + var0 + a(dk & dl, dm) + var11.length);
         } else {
            int var6;
            int var7;
            int var8;
            try {
               var6 = Integer.parseInt(var11[dn]);
               var7 = Integer.parseInt(var11[var_do]);
               var8 = var11.length >= dp ? Integer.parseInt(var11[dq]) : dr;
            } catch (NumberFormatException var10) {
               throw new RuntimeException(a(ds, dt ^ du) + var0);
            }

            t = new NLoginCore_409(var6, var7, var8);
         }
      }
   }

   @Generated
   @Override
   public int hashCode() {
      int var1 = ae;
      int var2 = af;
      var2 = var2 * ag + this.e();
      var2 = var2 * ah + this.f();
      return var2 * ai + this.g();
   }

   public boolean a(NLoginCore_409 var1) {
      return ((!this.d(var1) != 0) ? a : b);
   }

   public boolean d(NLoginCore_409 var1) {
      if (this.z < var1.z) {
         return (k != 0);
      } else if (this.z > var1.z) {
         return (l != 0);
      } else if (this.A < var1.A) {
         return (m != 0);
      } else if (this.A > var1.A) {
         return (n != 0);
      } else {
         return ((this.B < var1.B ? o : p) != 0);
      }
   }

   @Generated
   public int f() {
      return this.A;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return (w != 0);
      } else if (!(var1 instanceof NLoginCore_409)) {
         return (x != 0);
      } else {
         NLoginCore_409 var2 = (NLoginCore_409)var1;
         if (!var2.b((Object)this)) {
            return (y != 0);
         } else if (this.e() != var2.e()) {
            return (aa != 0);
         } else if (this.f() != var2.f()) {
            return (ab != 0);
         } else {
            return ((this.g() != 0) != var2.g() ? ac : ad);
         }
      }
   }
}
