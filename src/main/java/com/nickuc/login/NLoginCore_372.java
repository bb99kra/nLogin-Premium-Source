package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_372 {
   private static int j = Integer.reverse(-1);
   private static long u = Long.reverse(338991931664541991L);
   private static int y = Integer.reverse(1610612736);
   private static long c;
   private static long b = Long.reverse(8409442463912470823L);
   private static int l = (0 >>> 52 | 0 << ~52 + 1) & -1;
   private static long x = Long.reverse(8070450532247928832L);
   private static int p = 24576 >>> 13 | 24576 << ~13 + 1;
   private static int k = (0 >>> 3 | 0 << -3) & -1;
   private static int ae = 939524096 >>> 187 | 939524096 << -187;
   private static int ab = 0 >>> 26 | 0 << ~26 + 1;
   private static int e = (8388608 >>> 214 | 8388608 << ~214 + 1) & -1;
   private static long o = Long.reverse(8070450532247928832L);
   private static long w = Long.reverse(8409442463912470823L);
   private static int a = (0 >>> 254 | 0 << ~254 + 1) & -1;
   private static int s = 16777216 >>> 182 | 16777216 << -182;
   private static String[] ZKM_STR_A = new String[ae];
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(8070450532247928832L);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(-1);
   private static long r = Long.reverse(8070450532247928832L);
   private static int af = Integer.reverse(-536870912);
   private static long i = Long.reverse(8070450532247928832L);
   private static int v = Integer.reverse(-1610612736);
   private static int f = Integer.reverse(-1073741824);
   private static int m = Integer.reverse(1073741824);
   private static int ad = 0 >>> 190 | 0 << ~190 + 1;
   private static long h = Long.reverse(8409442463912470823L);
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static long n = Long.reverse(8409442463912470823L);
   private static String[] ZKM_STR_B = new String[af];
   private static long q = Long.reverse(8409442463912470823L);
   private static long z = Long.reverse(338991931664541991L);

   private static String a(int var0, long var1) {
      var1 ^= 14L;
      var1 ^= -5614831594392132048L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(25 + 44),
                     83,
                     (byte)(25 + 22),
                     (byte)(60 + 7),
                     (byte)(11 + 55),
                     (byte)(3 + 64),
                     (byte)(9 + 38),
                     (byte)(69 + 11),
                     (byte)(36 + 39),
                     (byte)(27 + 40),
                     (byte)(19 + 64),
                     (byte)(42 + 11),
                     (byte)(79 + 1),
                     (byte)(34 + 63),
                     (byte)(45 + 55),
                     (byte)(65 + 35),
                     (byte)(51 + 54),
                     110,
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟࢮࢲࢯࢤ࢈ࢼࢾࢶࢫ࢜ࢸ\u088fࣅ", (byte)35, 69));
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

   public static String ae() {
      return System.getProperty(a(p, q ^ r));
   }

   public static OperatingSystemMXBean a() {
      return ManagementFactory.getOperatingSystemMXBean();
   }

   public static void c(int var0) {
      try {
         String var10001 = a(s & t, u).concat(a(v, w ^ x)).concat(a(y, z));
         Class[] var10002 = new Class[aa];
         var10002[ab] = int.class;
         Method var10000 = NLoginCore_546.a(System.class, var10001, var10002);
         Object[] var3 = new Object[ac];
         var3[ad] = var0;
         var10000.invoke(null, var3);
      } catch (InvocationTargetException | IllegalAccessException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_372.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.F("ԚԼԾԞՂաՙկ՛Ԫը՞լզԯՔնյխճխՂ", (byte)54, 70), NLoginCore_372.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.C("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠦࠪࠧࠜࠀ࠴࠶\u082eࠣࠔ࠰ࠇ࠽ү", (byte)54, 67) + var1 + NLoginCore_453.D("ґ", (byte)54, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public static int u() {
      String var0 = ae();
      if (var0.startsWith(a(a, b ^ d))) {
         var0 = var0.substring(e, f);
      } else {
         int var1 = var0.indexOf(a(g, h ^ i));
         if (var1 != j) {
            var0 = var0.substring(k, var1);
         }
      }

      StringBuilder var4 = new StringBuilder();

      for (int var2 = l; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (!NLoginCore_449.a(var3)) {
            break;
         }

         var4.append(var3);
      }

      if (var4.length() == 0) {
         throw new RuntimeException(a(m, n ^ o) + ae());
      } else {
         return Integer.parseInt(var4.toString());
      }
   }

   private static void b() {
      c = -1975557250761478866L;
      long var0 = c ^ -5614831594392132048L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(15 + 54),
               (byte)(50 + 33),
               (byte)(22 + 25),
               (byte)(38 + 29),
               (byte)(17 + 49),
               (byte)(7 + 60),
               (byte)(15 + 32),
               (byte)(73 + 7),
               (byte)(5 + 70),
               (byte)(20 + 47),
               (byte)(30 + 53),
               (byte)(23 + 30),
               (byte)(62 + 18),
               (byte)(10 + 87),
               (byte)(88 + 12),
               100,
               (byte)(46 + 59),
               (byte)(9 + 101),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.C("ё҄йїѕс҉ъ҅ѿ҅є", (byte)29, 67);
               ZKM_STR_B[1] = NLoginCore_138.F("ԍՏԎԢԐԮԳԧՙՑՊԡ", (byte)29, 70);
               ZKM_STR_B[2] = NLoginCore_141.D("јѯѿѻѵ҄ѴфѬ҈ъ҆ыяҀѴѵѥєїҊђѱљҌғѰҔҍҕѻѾҥјѥҀқҗҔқ҆Үң҆҈ҤҮѯұҏ҆ҶҶҒѿҀ", (byte)29, 68);
               ZKM_STR_B[3] = NLoginCore_138.F("ԐԠԐԾԦՌՐԶԶՕՋՓՓ՝ՏՒԭԵԾԿԺՕԬԭ", (byte)29, 70);
               ZKM_STR_B[4] = NLoginCore_453.C("ѢњѨффѓѨљѮѭює", (byte)29, 67);
               ZKM_STR_B[5] = NLoginCore_183.A("ĳćďģģóıĴĒôĔā", (byte)29, 65);
               ZKM_STR_B[6] = NLoginCore_138.D("ѓфф҆҄҈҆тїѶѧє", (byte)29, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_127.F("ԌԬԍԮԌԳՂԧԲԚՆԡ", (byte)29, 70);
               ZKM_STR_B[1] = NLoginCore_173.A("òćþìČēðĢĘęČā", (byte)29, 65);
               ZKM_STR_B[2] = NLoginCore_223.E("ԥԼՌՈՂՑՁԑԹՕԗՓԘԜՍՁՂԲԡԤ\u0557ԟԾԦՙՠԽա՚բՈՋղԥԲՍըդաըՓջձՇՔ\u0558խոՠՏԿծ՛ՐփաՁֆփիֈՁ\u0558Չ", (byte)29, 69);
               ZKM_STR_B[3] = NLoginCore_004.A("ðĀðĞĆĬİĖĖĵĭĎđķĞĘďĕěĄłĵČč", (byte)29, 65);
               ZKM_STR_B[4] = NLoginCore_183.B("īĳāĂğðćĊĮĐĶā", (byte)29, 66);
               ZKM_STR_B[5] = NLoginCore_384.E("ԛԬՑՂԦՁԷՊԨ՚Լԡ", (byte)29, 69);
               ZKM_STR_B[6] = NLoginCore_091.B("êĳāđčĔĩĆñĬĐā", (byte)29, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_324.B("ģÿĮĶāïĤĊõĺĩöĮĐĎđĂďÿąļĵČč", (byte)29, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_575.F("ԲՃԽՇԕԑԥԯՐԕ\u0530\u0530ԙՑԙԟԛ\u0557ԬԾզԵԷՙԡըԤլՈԻՊՀ", (byte)29, 70);
         }
      }
   }
}
