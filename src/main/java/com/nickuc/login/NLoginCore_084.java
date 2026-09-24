package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_084 {
   private static int t = (16 >>> 99 | 16 << ~99 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int ab = 16777216 >>> 24 | 16777216 << -24;
   private static long k = Long.reverse(5942478315216813742L);
   private static int am = Integer.reverse(-536870912);
   private static int e = 25165824 >>> 87 | 25165824 << -87;
   private static int ag = 320 >>> 6 | 320 << ~6 + 1;
   private static int f = 0 >>> 235 | 0 << -235;
   private static int ap = Integer.reverse(-1073741824);
   private static int m = 67108864 >>> 26 | 67108864 << ~26 + 1;
   private static int a = (0 >>> 108 | 0 << ~108 + 1) & -1;
   public static final String aQ = a(am, NLoginCore_084.an ^ NLoginCore_084.ao);
   private static int aa = 0 >>> 136 | 0 << -136;
   private static int u = Integer.reverse(0);
   private static int b = -1 >>> 197 | -1 << -197;
   private final Method m;
   private static long an = Long.reverse(7960090948278795950L);
   private static long ak = Long.reverse(7960090948278795950L);
   private static final String aS = a(NLoginCore_084.aj, ak ^ NLoginCore_084.al);
   private final NLoginCore_583 a;
   private static int l = Integer.reverse(0);
   private static long ai = Long.reverse(4323455642275676160L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(7960090948278795950L);
   private static int ac = 2097152 >>> 148 | 2097152 << ~148 + 1;
   public static final NLoginInterface_034[] a;
   private static long d = Long.reverse(5942478315216813742L);
   private static final String aR = a(ag, ah ^ ai);
   private static int af = Integer.reverse(268435456);
   private static long al = Long.reverse(4323455642275676160L);
   private static String[] b = new String[af];
   private static long ao = Long.reverse(4323455642275676160L);
   private static long c;
   private static int h = Integer.reverse(1073741824);
   private static int ar = Integer.reverse(Integer.MIN_VALUE);
   private static int n = (2097152 >>> 84 | 2097152 << -84) & -1;
   private static long o = Long.reverse(7960090948278795950L);
   private static long y = Long.reverse(4323455642275676160L);
   private static String[] a = new String[NLoginCore_084.ae];
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static long s = Long.reverse(4323455642275676160L);
   private static int w = Integer.reverse(536870912);
   private static int q = (805306368 >>> 156 | 805306368 << ~156 + 1) & -1;
   private static int aq = Integer.reverse(0);
   private static int as = Integer.reverse(1073741824);
   private static int ad = 0 >>> 111 | 0 << -111;
   private static int aj = 201326592 >>> 121 | 201326592 << ~121 + 1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long r = Long.reverse(7960090948278795950L);
   private static long x = Long.reverse(7960090948278795950L);
   private static int z = Integer.reverse(-1073741824);
   private static int ae = (1 >>> 29 | 1 << ~29 + 1) & -1;
   private static long p = Long.reverse(4323455642275676160L);
   private final Constructor<?> e;

   private static void b() {
      c = 8466116254644039286L;
      long var0 = c ^ -7579323902027909630L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(51 + 17),
               (byte)(36 + 33),
               (byte)(54 + 29),
               (byte)(9 + 38),
               (byte)(10 + 57),
               (byte)(21 + 45),
               67,
               (byte)(26 + 21),
               (byte)(79 + 1),
               75,
               (byte)(26 + 41),
               (byte)(64 + 19),
               (byte)(45 + 8),
               (byte)(75 + 5),
               (byte)(40 + 57),
               (byte)(66 + 34),
               (byte)(80 + 20),
               (byte)(28 + 77),
               (byte)(35 + 75),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.D("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖИрѝјїоСѣћѠїЮЯ", (byte)2, 68);
               b[1] = NLoginCore_427.C("УААϲШУЎжгГмЃ", (byte)2, 67);
               b[2] = NLoginCore_433.A("Ä»îÊāÿÙô÷Ö½Ë", (byte)2, 65);
               b[3] = NLoginCore_092.F("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖӾԦՋԩԡԺՏԯԎՓԯ", (byte)2, 70);
               b[4] = NLoginCore_138.B("Ä»îÊāÿÙô÷Ö½Ë", (byte)2, 66);
               b[5] = NLoginCore_241.D("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖИрѝјїоСѣћѠїЮЯ", (byte)2, 68);
               b[6] = NLoginCore_138.D("УААϲШУЎжгГмЃ", (byte)2, 68);
               b[7] = NLoginCore_521.E("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖӾԦՋԩԡԺՏԯԎՓԯ", (byte)2, 69);
               break;
            case 1:
               b[0] = NLoginCore_397.B("î÷ËçÿÍÿÏÂâăĂáØÒãÛÜčāäçÎēĕþăčĄÔĔĒÒĐþ÷ĎêëĀĔÜÝßĂ÷âĘüČĖīĂğö÷", (byte)2, 66);
               b[1] = NLoginCore_324.F("ԧԍԋԯӶԵԔӹԝԴԕԆ", (byte)2, 70);
               b[2] = NLoginCore_092.D("ЌОЮϿФЄаϹЮбІЃ", (byte)2, 68);
               b[3] = NLoginCore_138.A("®Ý×ÍÈºÐ÷×ÙÏÏÖÓØóìÚÀúÛÈãďĎÓďÐăõÚÙ", (byte)2, 65);
               b[4] = NLoginCore_433.D("ДϴгРЀДІϻкЙдЃ", (byte)2, 68);
               b[5] = NLoginCore_138.C("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖжўйэПьЮвђђїЮЯ", (byte)2, 67);
               b[6] = NLoginCore_324.A("ÖúÎ¶à¸ÞÃñíÖË", (byte)2, 65);
               b[7] = NLoginCore_201.F("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖԊՅԹՎԙԑԨԉԓԑԲՖԎԋԗԴԔ՛ԐԬԼ\u0557Ԧ", (byte)2, 70);
               break;
            case 2:
               b[0] = NLoginCore_092.B("³Ò¸íÿÙúÜĄÜðË", (byte)2, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.C("ДϴЉЕЌЁЯЮϴЭАϻЋϽИМЏпбМϿХЅлеЉшЁшОФЯ", (byte)2, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_084.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.A("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 65), NLoginCore_084.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.D("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࡋࡋࡎࡋࠛ\u083fࡀࡊࡅࠟࡎ\u083fࡁ࡙Ӌ", (byte)63, 68) + var1 + NLoginCore_201.C("Ҭ", (byte)63, 67) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 60L;
      var1 ^= -7579323902027909630L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(67 + 2),
                     (byte)(79 + 4),
                     (byte)(36 + 11),
                     (byte)(11 + 56),
                     (byte)(58 + 8),
                     (byte)(37 + 30),
                     (byte)(28 + 19),
                     80,
                     (byte)(19 + 56),
                     (byte)(18 + 49),
                     (byte)(73 + 10),
                     (byte)(3 + 50),
                     (byte)(50 + 30),
                     (byte)(66 + 31),
                     100,
                     (byte)(51 + 49),
                     (byte)(101 + 4),
                     (byte)(84 + 26),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.D("шѕєЗїѓюїѢёОќѠљќѢФ\u07be\u07be߁\u07beގ\u07b2\u07b3\u07bd\u07b8ޒ߁\u07b2\u07b4ߌ", (byte)16, 68));
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

   public void a(File var1, File var2, NLoginInterface_034 var3) {
      HashMap var4 = new HashMap();

      for (NLoginCore_398 var6 : var3.a()) {
         String var7 = var6.F();
         String var8 = var6.E() + a(n, o ^ p);
         String var10000 = a(q, r ^ s);
         Object[] var10001 = new Object[t];
         var10001[u] = this.a.B();
         var10001[v] = var7;
         String var9 = String.format(var10000, var10001);
         if (!var7.isEmpty()) {
            var9 = var9 + a(w, x ^ y);
         }

         var4.put(var8, var9);
      }

      Constructor var11 = this.e;
      Object[] var12 = new Object[z];
      var12[aa] = var1;
      var12[ab] = var2;
      var12[ac] = var4;
      Object var10 = var11.newInstance(var12);
      this.m.invoke(var10);
   }

   public NLoginCore_084(NLoginCore_583 var1) {
      try {
         this.a = var1;
         var1.a(a);
         NLoginCore_200 var2 = var1.a(a);
         Class var3 = var2.loadClass(a(a & b, d));
         Class[] var10002 = new Class[e];
         var10002[f] = File.class;
         var10002[g] = File.class;
         var10002[h] = Map.class;
         this.e = var3.getDeclaredConstructor(var10002);
         this.e.setAccessible((boolean)i);
         this.m = var3.getDeclaredMethod(a(j, k));
         this.m.setAccessible((boolean)m);
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   static {
      b();
      NLoginInterface_034[] var10000 = new NLoginInterface_034[ap];
      var10000[aq] = NLoginCore_315.b;
      var10000[ar] = NLoginCore_315.c;
      var10000[as] = NLoginCore_315.d;
      a = var10000;
   }
}
