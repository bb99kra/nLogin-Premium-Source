package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_276 implements NLoginInterface_036 {
   private static int aj = Integer.reverse(1073741824);
   private final NLoginType_008 i;
   private static long ah = Long.reverse(2986885139975646478L);
   private static long c;
   private static long w = Long.reverse(144115188075855872L);
   private static int bf = (0 >>> 209 | 0 << ~209 + 1) & -1;
   private static int bb = (67108864 >>> 26 | 67108864 << -26) & -1;
   private static long v = Long.reverse(2986885139975646478L);
   private static String[] ZKM_STR_B = new String[NLoginCore_276.bq];
   private static int ab = 0 >>> 32 | 0 << -32;
   private static long ad = Long.reverse(2986885139975646478L);
   private static long h = Long.reverse(144115188075855872L);
   private static int f = 4194304 >>> 118 | 4194304 << -118;
   private static long g = Long.reverse(2986885139975646478L);
   private static int aq = Integer.reverse(536870912);
   private static long z = Long.reverse(2986885139975646478L);
   private static int at = (0 >>> 0 | 0 << -0) & -1;
   private static long p = Long.reverse(2986885139975646478L);
   private static long n = Long.reverse(144115188075855872L);
   private static long am = Long.reverse(144115188075855872L);
   private static int ak = 41943040 >>> 246 | 41943040 << ~246 + 1;
   private static long ae = Long.reverse(144115188075855872L);
   private static long ax = Long.reverse(144115188075855872L);
   private final EnumMap<NLoginCore_466, NLoginInterface_021> a = new EnumMap<>(NLoginCore_466.class);
   private static long b = Long.reverse(2986885139975646478L);
   private static int bl = 4 >>> 194 | 4 << -194;
   private final Set<String> b;
   private static int bc = (0 >>> 189 | 0 << -189) & -1;
   private static int bo = 98566144 >>> 149 | 98566144 << -149;
   private static int ao = 360448 >>> 15 | 360448 << -15;
   private static int e = (536870912 >>> 93 | 536870912 << -93) & -1;
   private static int ag = (72 >>> 227 | 72 << ~227 + 1) & -1;
   private static int k = (1048576 >>> 212 | 1048576 << -212) & -1;
   private static int bd = (-536870907 >>> 253 | -536870907 << ~253 + 1) & -1;
   private static int bn = Integer.reverse(-201326592);
   private static int l = Integer.reverse(-1073741824);
   private static long s = Long.reverse(2986885139975646478L);
   private static int o = 512 >>> 39 | 512 << -39;
   private static int af = 8388608 >>> 215 | 8388608 << -215;
   private final Map<String, NLoginCore_466> a = new ConcurrentHashMap<>();
   private static long aw = Long.reverse(2986885139975646478L);
   private static long d = Long.reverse(144115188075855872L);
   private static int i = Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << ~158 + 1;
   private static long az = Long.reverse(3131000328051502350L);
   private static long j = Long.reverse(3131000328051502350L);
   private static int u = '쀀' >>> 'm' | 49152 << ~109 + 1;
   private static int bh = Integer.reverse(0);
   private static long aa = Long.reverse(144115188075855872L);
   private static long q = Long.reverse(144115188075855872L);
   private static int a = Integer.reverse(0);
   private static int au = Integer.reverse(0);
   private static int bj = (-1 >>> 254 | -1 << -254) & -1;
   private static long ai = Long.reverse(144115188075855872L);
   private static int bp = 15728640 >>> 116 | 15728640 << -116;
   private static int ay = 872415232 >>> 250 | 872415232 << ~250 + 1;
   private static int be = Integer.reverse(1543503872);
   private static int x = (-1 >>> 195 | -1 << ~195 + 1) & -1;
   private static int an = 3072 >>> 170 | 3072 << ~170 + 1;
   private static int ac = 16777216 >>> 149 | 16777216 << ~149 + 1;
   private static long ap = Long.reverse(3131000328051502350L);
   private static long bk = Long.reverse(3131000328051502350L);
   private static long al = Long.reverse(2986885139975646478L);
   private static int as = (0 >>> 140 | 0 << ~140 + 1) & -1;
   private final Set<String> c;
   private static int y = 14680064 >>> 245 | 14680064 << ~245 + 1;
   private static int bq = Integer.reverse(-268435456);
   private static int ar = (0 >>> 217 | 0 << ~217 + 1) & -1;
   private static long m = Long.reverse(2986885139975646478L);
   private static int bi = Integer.reverse(1879048192);
   private static int ba = (4194304 >>> 182 | 4194304 << ~182 + 1) & -1;
   private static long t = Long.reverse(144115188075855872L);
   private static String[] ZKM_STR_A = new String[bp];
   private static int r = (335544320 >>> 90 | 335544320 << ~90 + 1) & -1;
   private static int bm = Integer.reverse(0);
   private static int av = 3072 >>> 40 | 3072 << -40;
   private static int bg = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -1488014424868319570L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(40 + 29),
                     (byte)(30 + 53),
                     (byte)(39 + 8),
                     (byte)(31 + 36),
                     (byte)(18 + 48),
                     67,
                     (byte)(41 + 6),
                     (byte)(52 + 28),
                     (byte)(25 + 50),
                     (byte)(9 + 58),
                     (byte)(79 + 4),
                     (byte)(20 + 33),
                     (byte)(51 + 29),
                     (byte)(56 + 41),
                     (byte)(33 + 67),
                     (byte)(64 + 36),
                     (byte)(37 + 68),
                     110,
                     (byte)(50 + 53)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.F("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࢻࢽࣄ࣊࣎ࣈ࣌ࢰࢴ", (byte)54, 70));
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

   public Set<String> a() {
      return this.b;
   }

   private void a(NLoginCore_466 var1) {
      NLoginCore_219 var2 = this.i.a();
      String var3 = var1.e();
      NLoginCore_168 var4 = var1.a();
      boolean var5 = var1.l();
      String var6 = a(a, b ^ d) + var3;
      int var7 = e;
      String var9 = null;
      List var8;
      String var10;
      if (var1 != NLoginCore_466.b) {
         var7 = var2.a(var6 + a(f, g ^ h), var2.a(var6 + a(i, j), (k != 0)));
         var8 = var2.k(var6 + a(l, m ^ n));
         var9 = var2.b(var6 + a(o, p ^ q));
         var10 = var2.a(var6 + a(r, s ^ t), a(u, v ^ w));
         if (var7 != 0) {
            int var12 = x;
            switch (var3.hashCode()) {
               case -1548612125:
                  if (var3.equals(a(ag, ah ^ ai))) {
                     var12 = aj;
                  }
                  break;
               case -318452137:
                  if (var3.equals(a(ak, al ^ am))) {
                     var12 = an;
                  }
                  break;
               case 96619420:
                  if (var3.equals(a(ac, ad ^ ae))) {
                     var12 = af;
                  }
                  break;
               case 1082600804:
                  if (var3.equals(a(ao, ap))) {
                     var12 = aq;
                  }
                  break;
               case 1671380268:
                  if (var3.equals(a(y, z ^ aa))) {
                     var12 = ab;
                  }
            }

            switch (var12) {
               case 0:
                  if (!NLoginCore_363.a.ar()) {
                     var7 = ar;
                  }
                  break;
               case 1:
                  if (!NLoginCore_363.k.ar()) {
                     var7 = as;
                  }
                  break;
               case 2:
               case 3:
                  if (NLoginCore_329.d.ar()) {
                     var7 = at;
                  }
               case 4:
                  if (!NLoginCore_329.n.ar()) {
                     var7 = au;
                  }
            }
         }
      } else {
         var8 = Collections.singletonList(a(av, aw ^ ax));
         var10 = a(ay, az);
      }

      if (var7 != 0) {
         if (var8.isEmpty()) {
            var8 = Collections.singletonList(var3);
         } else if (var8.size() > ba) {
            var4.a(new ArrayList<>(var8).subList(bb, var8.size()));
         }

         if (var9 != null) {
            var4.u(var9);
         }

         var4.b(var10);
         var4.a((String)var8.get(bc));
         String var11 = bd + this.i.q().toLowerCase(Locale.ENGLISH) + be;
         this.b.add(var11);
         var8.stream().map(var0 -> var0.toLowerCase(Locale.ENGLISH)).forEach(var4x -> {
            if (var5) {
               this.c.add(bn + var4x);
               this.c.add(var11 + var4x);
            }

            this.b.add(bo + var4x);
            this.a.put(var4x, var1);
         });
         synchronized (this.a) {
            this.a.put(var1, var4.a(this.i));
         }
      }
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      if (var1.b().a() != NLoginCore_419.b) {
         this.r();
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_276.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.D("ШъьЬѐѯѧѽѩиѶѬѺѴнѢ҄҃ѻҁѻѐ", (byte)25, 68), NLoginCore_276.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_138.C("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߉ߋߒߘߜߖߚ\u07be߂є", (byte)25, 67) + var1 + NLoginCore_091.E("ԏ", (byte)25, 69) + var2.toString(), var4
         );
      }
   }

   @Nullable
   public NLoginCore_466 a(String var1) {
      return this.a.get(var1);
   }

   private static void b() {
      c = 8121156253313519252L;
      long var0 = c ^ -1488014424868319570L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(34 + 34),
               (byte)(22 + 47),
               (byte)(43 + 40),
               (byte)(46 + 1),
               (byte)(58 + 9),
               (byte)(50 + 16),
               (byte)(35 + 32),
               (byte)(29 + 18),
               (byte)(49 + 31),
               (byte)(60 + 15),
               (byte)(8 + 59),
               (byte)(6 + 77),
               (byte)(3 + 50),
               (byte)(18 + 62),
               (byte)(34 + 63),
               (byte)(14 + 86),
               (byte)(48 + 52),
               105,
               (byte)(40 + 70),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.E("ԺՎՎճԽԿՔՁՖծՔՀՆ\u0558բՖ՚Ո՜խչ\u0557ՔՕ", (byte)69, 69);
               ZKM_STR_B[1] = NLoginCore_521.C("ӻӞӞӻӔӽӁҽӒӃӣӌ", (byte)69, 67);
               ZKM_STR_B[2] = NLoginCore_141.B("őśƂƁŐŤũƉƅšŅŘşŽſźŜŽŌœƔƅŜŝ", (byte)69, 66);
               ZKM_STR_B[3] = NLoginCore_004.B("ŭŞŻķţƆƉƁūŧƅũţŁźŢŪƑūžžşŜŝ", (byte)69, 66);
               ZKM_STR_B[4] = NLoginCore_451.C("ӼӐӕҷҽҸӱӺӲӔӒӸӝӨӴӼӋӗԄӨӻԐӗӘ", (byte)69, 67);
               ZKM_STR_B[5] = NLoginCore_241.F("դՙԸձհԿՈռլԾշ՟՛ՑպՃՔՈվիֆ֍ՔՕ", (byte)69, 70);
               ZKM_STR_B[6] = NLoginCore_241.E("ԸմԶշԵՌր՟իփգԿ՚ԽֆՑՠ՞֊տա֏՝թհ֏զդփշՑ֚\u0558ղ\u0557֝տվճծճբ֝դձ֤փս։ցև֗օ֭մյ", (byte)69, 69);
               ZKM_STR_B[7] = NLoginCore_092.B("ĴŜŔƆŔœžŽŇŧŇő", (byte)69, 66);
               ZKM_STR_B[8] = NLoginCore_433.A("ŽŸŤżŸńŗŴŜŖŇő", (byte)69, 65);
               ZKM_STR_B[9] = NLoginCore_433.D("ӛҾӗӟӪӕӢӴԅԀԅӌ", (byte)69, 68);
               ZKM_STR_B[10] = NLoginCore_427.D("ҹӚӭӺҿӂӓӌӐӟӏӌ", (byte)69, 68);
               ZKM_STR_B[11] = NLoginCore_397.E("ՖզղԳծձԿՊտՠ՜Չ", (byte)69, 69);
               ZKM_STR_B[12] = NLoginCore_446.F("Ա՚նհՈծՎՠԸ\u0557պՉ", (byte)69, 70);
               ZKM_STR_B[13] = NLoginCore_241.C("ӐӨӒҲӉӏԀҽӲӅӐӹԁӷӋԅӨӧӟӜӰӟӟӠԅӓԘԗԕӵӯӫ", (byte)69, 67);
               ZKM_STR_B[14] = NLoginCore_110.D("ҺӽҶӨҳӻӰӏԅӕӱӌ", (byte)69, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_471.E("ԺՎՎճԽԿՔՁՖծՖԷԼ\u0557ք֊ՃՇթդզ֍ՔՕ", (byte)69, 69);
               ZKM_STR_B[1] = NLoginCore_127.B("ŖŬŲľĽżŘŪŒţƇśŊōŋťƀƈŜƑƖƕŜŝ", (byte)69, 66);
               ZKM_STR_B[2] = NLoginCore_324.D("ӌӖӽӼӋӟӤԄԀӜӀӨԊӺӧӾԁӇӎԐԑӪӗӘ", (byte)69, 68);
               ZKM_STR_B[3] = NLoginCore_110.E("եՖճԯ՛վցչգ՟սՍսվՙ\u0558Ձէեդ՜֍ՔՕ", (byte)69, 69);
               ZKM_STR_B[4] = NLoginCore_173.D("ӼӐӕҷҽҸӱӺӲӔӑӠӒӴӊԃԂԇӋӰӦԐӗӘ", (byte)69, 68);
               ZKM_STR_B[5] = NLoginCore_091.C("ӧӜһӴӳӂӋӿӯӁӼӝԈӤӛӻӕԅӤӫӃӻӽԄԋӶӫԗӏԏӚӵ", (byte)69, 67);
               ZKM_STR_B[6] = NLoginCore_201.A("ŀżľſĽŔƈŧųƋūŇŢŅƎřŨŦƒƇũƗťűŸƗŮŬƋſřƢŠźşƥƇƆŻŶŻŪƥżƄưƞƝƎƬƆƞƗƭƪƔƗƑưƭƽƞƵƾ", (byte)69, 65);
               ZKM_STR_B[7] = NLoginCore_553.B("ŠœŎŽŦžšŲƄſżżňźżŮŒţƒſňůŜŝ", (byte)69, 66);
               ZKM_STR_B[8] = NLoginCore_559.A("ŞŒŗŴƆŗŐĻţńŪţƈţŜŐŬŴƉƆƒşŜŝ", (byte)69, 65);
               ZKM_STR_B[9] = NLoginCore_397.C("ҼӒӠӳӼӲԂӶӹҾӐԇԀԊӦӺӪӢԅԑӇӚӗӘ", (byte)69, 67);
               ZKM_STR_B[10] = NLoginCore_530.E("՛ՆհՙՇ՞ձՏ՟վշՍ՚սֈՀՊՁՋԿժէՔՕ", (byte)69, 69);
               ZKM_STR_B[11] = NLoginCore_575.F("դՉմՍ՛հՑյժգ\u0557\u0558չՏ՜ըՊ՛ջ֎\u0557֍ՔՕ", (byte)69, 70);
               ZKM_STR_B[12] = NLoginCore_387.A("ľŭſŭŁŗţŚƄƋƆŚŜƇŜŨũŻƒŢŕůŜŝ", (byte)69, 65);
               ZKM_STR_B[13] = NLoginCore_559.B("ŕŭŗķŎŔƅłŷŊŕžƆżŐƊŭŬŤšŵũŵƄƃƛūƈŚŻūŘśūűŭơŧŸťƦƁƪű", (byte)69, 66);
               ZKM_STR_B[14] = NLoginCore_092.A("şŔžůůŽƈŒŇţŬő", (byte)69, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.C("ҶӳҷӗӍԀӘӠӟҿԅӡӲӖӬӣԆԊӹӪԁӚӗӘ", (byte)69, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_076.D("ӯӶӉӱӡӚӁӽӝӳӹӐӿӄӶӘԀӚԇӌԊӚӗӘ", (byte)69, 68);
         }
      }
   }

   public void q() {
      this.b.clear();
      this.c.clear();
      synchronized (this.a) {
         this.a.forEach((var0, var1) -> var1.X());
      }
   }

   static {
      b();
   }

   public void r() {
      this.q();
      NLoginCore_466[] var1 = NLoginCore_466.values();
      int var2 = var1.length;

      for (int var3 = bh; var3 < var2; var3++) {
         NLoginCore_466 var4 = var1[var3];
         this.a(var4);
      }
   }

   public boolean b(String var1) {
      if (this.c.stream().anyMatch(var1::equals)) {
         return (bf != 0);
      } else {
         List var2 = NLoginCore_477.as.a(new Object[bg]);
         return var2.stream().noneMatch(var1x -> ((var1x.isEmpty() != 0) || !var1x.equals(a(bi & bj, bk)) && !var1.equals(var1x) ? bm : bl));
      }
   }

   @Generated
   public NLoginCore_276(NLoginType_008 var1) {
      this.b = ConcurrentHashMap.newKeySet();
      this.c = ConcurrentHashMap.newKeySet();
      this.i = var1;
   }
}
