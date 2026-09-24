package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_090 implements NLoginInterface_028 {
   private static int w = 3072 >>> 137 | 3072 << ~137 + 1;
   private static String[] b = new String[NLoginCore_090.x];
   private static int t = 131072 >>> 241 | 131072 << -241;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int v = 0 >>> 108 | 0 << ~108 + 1;
   private static int x = Integer.reverse(1610612736);
   private static long o = Long.reverse(7638104968020361216L);
   private static long j = Long.reverse(7638104968020361216L);
   private static long i = Long.reverse(1813094142712088922L);
   private static int p = Integer.reverse(-1610612736);
   private static String[] a = new String[w];
   private static long c;
   private static int h = (33554432 >>> 152 | 33554432 << -152) & -1;
   private static long g = Long.reverse(7638104968020361216L);
   private static int q = -1 >>> 152 | -1 << -152;
   private static int u = 65536 >>> 112 | 65536 << ~112 + 1;
   private static long d = Long.reverse(7638104968020361216L);
   private static int a = (0 >>> 19 | 0 << ~19 + 1) & -1;
   public static final NLoginCore_090 a = new NLoginCore_090();
   private static long n = Long.reverse(1813094142712088922L);
   private static long r = Long.reverse(8298277606125603162L);
   private static long b = Long.reverse(1813094142712088922L);
   private static long l = Long.reverse(8298277606125603162L);
   private static int s = 0 >>> 167 | 0 << ~167 + 1;
   private static long f = Long.reverse(1813094142712088922L);
   private static int m = 1073741824 >>> 124 | 1073741824 << -124;
   private static int k = Integer.reverse(-1073741824);

   private static void b() {
      c = 6525800531613881496L;
      long var0 = c ^ -8601599973002660551L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(32 + 36),
               (byte)(6 + 63),
               (byte)(3 + 80),
               (byte)(38 + 9),
               (byte)(29 + 38),
               66,
               (byte)(15 + 52),
               (byte)(19 + 28),
               (byte)(32 + 48),
               (byte)(73 + 2),
               (byte)(22 + 45),
               (byte)(15 + 68),
               (byte)(36 + 17),
               (byte)(25 + 55),
               (byte)(9 + 88),
               (byte)(11 + 89),
               (byte)(23 + 77),
               (byte)(97 + 8),
               110,
               (byte)(4 + 99)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_127.C("чиќеъцѳѨѠњяѠҁ҄яњшўѠѿѫљ҉ѐэўѭѼѧѲєъ", (byte)25, 67);
               b[1] = NLoginCore_127.E("ԭԊԣԯԛԬԼԭԩԕԣԋԢ՛՝ԾԜԩ՜՞՞ԻԨԩ", (byte)25, 69);
               b[2] = NLoginCore_324.B("ęäĬĭîøĄĭģĒĢēĭđĴķĔĥôĸõħĩčČĬāĤĶĠŇģĪŇĂĞńĿĚľĞąŎę", (byte)25, 66);
               b[3] = NLoginCore_223.E("ՋԨԿԚԐՁՐԐԪՋԓԝ", (byte)25, 69);
               b[4] = NLoginCore_138.E("ԮԏՌԪԭԡԵԾԤԖՉ\u0558ԲՃԴՌ՝\u0558ՁՖՁԹԶՃՇԽԻթՖՁԩԟ", (byte)25, 69);
               b[5] = NLoginCore_091.A("äėûĥĊîúëěĔĥĬðĘĎķďöĥċùĽĄą", (byte)25, 65);
               break;
            case 1:
               b[0] = NLoginCore_575.B("øéčæû÷ĤęđċĀđĲĵĀċùďđİĜĎùŀüĕĶıĶĥĄē", (byte)25, 66);
               b[1] = NLoginCore_173.E("ԭԊԣԯԛԬԼԭԩԕԠ՚ԻԕՅԨԗՐԵՂԬՔՄԿԜՈՠԶթզԾՍ", (byte)25, 69);
               b[2] = NLoginCore_091.E("ԽԈՐՑԒԜԨՑՇԶՆԷՑԵ\u0558՛ԸՉԘ՜ԙՋՍԱ\u0530ՐԥՈ՚ՄիՇզ\u0558ՏՙըՍՍԵ՞ձԳԽ", (byte)25, 69);
               b[3] = NLoginCore_521.B("ôĢČġàĭéĦĩěüù", (byte)25, 66);
               b[4] = NLoginCore_223.D("љкѷѕјьѠѩясѴ҃ѝѮџѷ҈҃ѬҁѬѥҌѯўфѲѽѧҔ҄ѷ", (byte)25, 68);
               b[5] = NLoginCore_223.F("ԈԻԟՉԮԒԞԏԿԸՇՒՋԕ՚ԙԫԟԒԿԭՎԻԴՓԸՔԟԴեէԬ", (byte)25, 70);
               break;
            case 2:
               b[0] = NLoginCore_173.B("æġĬĆČ÷ĮñĬëĴĊðĆĉõĵěİİõėĄą", (byte)25, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_183.C("ањњѽэјѿќѯюяѹѡѕѼіњ҄ѻѸ҆Ҍѓє", (byte)25, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 86L;
      var1 ^= -8601599973002660551L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     69,
                     (byte)(44 + 39),
                     (byte)(29 + 18),
                     (byte)(61 + 6),
                     (byte)(18 + 48),
                     (byte)(9 + 58),
                     (byte)(20 + 27),
                     (byte)(26 + 54),
                     (byte)(62 + 13),
                     (byte)(28 + 39),
                     (byte)(60 + 23),
                     (byte)(44 + 9),
                     80,
                     (byte)(88 + 9),
                     (byte)(32 + 68),
                     (byte)(61 + 39),
                     (byte)(24 + 81),
                     (byte)(28 + 82),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), (byte)(6 + 77)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_397.E("ՇՔՓԖՖՒՍՖաՐԝ՛՟\u0558՛աԣࢭࢉࢭࢲ࢙ࢽࢲ࢟ࣄࢧ\u0892ࣁࢷ\u0895ࢵ", (byte)40, 69));
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

   static {
      b();
   }

   @Override
   public String q() {
      return a(a, b ^ d);
   }

   @Override
   public void c(NLoginType_008 var1) {
      NLoginCore_479 var2 = NLoginCore_479.f;
      NLoginCore_374 var3 = var2.a();
      File var4 = new File(((NLoginCore_317)var3).b(), a(e, f ^ g));
      if (!var4.exists()) {
         NLoginCore_370.e(NLoginCore_150.j() ? a(h, i ^ j) + var2.getName() + a(k, l) : a(m, n ^ o) + var2.getName() + a(p & q, r));
         var3.a(null, (boolean)t);

         try {
            NLoginCore_366.b(var4);
         } catch (IOException var6) {
            throw new RuntimeException(var6);
         }
      }
   }

   @Override
   public boolean a(NLoginType_008 var1) {
      NLoginCore_479 var2 = NLoginCore_479.f;
      NLoginCore_374 var3 = var2.a();
      return (boolean)(var3 != null && var3.isAvailable() ? u : v);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_090.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.C("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 67), NLoginCore_090.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.E("ր֍\u058cՏ֏\u058bֆ֏֚։Ֆ֑֚֔֘֔՜ࣦࣂࣰࣦ࣒ࣶࣺ࣮࣫࣫ࣘࣽ࣠࣋࣎շ", (byte)97, 69) + var1 + NLoginCore_446.D("Ԓ", (byte)97, 68) + var2.toString(), var4
         );
      }
   }
}
