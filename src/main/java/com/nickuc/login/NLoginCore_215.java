package com.nickuc.login;

import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

class NLoginCore_215 implements Consumer<String> {
   private static long f = Long.reverse(3495969375016642814L);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long g = Long.reverse(2594073385365405696L);
   private static long i = Long.reverse(3495969375016642814L);
   private static long ai = Long.reverse(1478356741954660606L);
   private static long j = Long.reverse(2594073385365405696L);
   private static int e = Integer.reverse(0);
   private static long ae = Long.reverse(3495969375016642814L);
   private static int ah = (-1 >>> 132 | -1 << ~132 + 1) & -1;
   private static long c;
   private static int t = 0 >>> 255 | 0 << ~255 + 1;
   private static int p = Integer.reverse(-1073741824);
   private static long z = Long.reverse(2594073385365405696L);
   private static int q = (-1 >>> 119 | -1 << -119) & -1;
   private static String[] b = new String[NLoginCore_215.an];
   private static int b = (1031798784 >>> 183 | 1031798784 << -183) & -1;
   private static int aa = Integer.reverse(1610612736);
   private static int d = -2147483586 >>> 223 | -2147483586 << -223;
   private static long ab = Long.reverse(3495969375016642814L);
   private static int k = Integer.reverse(1073741824);
   private static int ad = Integer.reverse(-536870912);
   private static long v = Long.reverse(3495969375016642814L);
   private static long af = Long.reverse(2594073385365405696L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int a = 0 >>> 180 | 0 << ~180 + 1;
   private static int ak = Integer.reverse(-1);
   private static int aj = (18432 >>> 107 | 18432 << -107) & -1;
   private static int x = Integer.reverse(-1610612736);
   private static long l = Long.reverse(3495969375016642814L);
   private static int o = (0 >>> 25 | 0 << ~25 + 1) & -1;
   private final NLoginType_008 n;
   private static long y = Long.reverse(3495969375016642814L);
   private static long r = Long.reverse(1478356741954660606L);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int u = Integer.reverse(536870912);
   private static String[] a = new String[NLoginCore_215.am];
   private static int an = (10240 >>> 138 | 10240 << -138) & -1;
   private static int ag = Integer.reverse(268435456);
   private static long m = Long.reverse(2594073385365405696L);
   private static long ac = Long.reverse(2594073385365405696L);
   private static long w = Long.reverse(2594073385365405696L);
   private static int am = Integer.reverse(1342177280);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long al = Long.reverse(1478356741954660606L);

   @Generated
   private NLoginCore_215(NLoginType_008 var1) {
      this.n = var1;
   }

   private void a(int var1, JSONObject var2) {
      switch (var1) {
         case 0:
            String var6 = var2.getString(a(u, v ^ w));
            String var7 = var2.getString(a(x, y ^ z));
            NLoginCore_280 var8 = (NLoginCore_280)var2.getEnum(NLoginCore_280.class, a(aa, ab ^ ac));
            NLoginCore_073.a(var6, var7, var8);
            break;
         case 1:
            String var3 = var2.getString(a(ad, ae ^ af));
            String var4 = var2.getString(a(ag & ah, ai));
            NLoginCore_184 var5 = (NLoginCore_184)var2.getEnum(NLoginCore_184.class, a(aj & ak, al));
            NLoginCore_073.a(var3, var4, var5);
      }
   }

   static {
      b();
   }

   private static void b() {
      c = 9157860814683906316L;
      long var0 = c ^ 7096591748076223580L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(6 + 63),
               (byte)(60 + 23),
               (byte)(7 + 40),
               (byte)(15 + 52),
               (byte)(24 + 42),
               (byte)(51 + 16),
               (byte)(7 + 40),
               (byte)(34 + 46),
               (byte)(68 + 7),
               (byte)(36 + 31),
               83,
               (byte)(4 + 49),
               (byte)(60 + 20),
               (byte)(30 + 67),
               (byte)(62 + 38),
               (byte)(73 + 27),
               (byte)(62 + 43),
               110,
               (byte)(41 + 62)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_384.C("ҷӯҺӉөӫӏӥӴӦӔҽ", (byte)64, 67);
               b[1] = NLoginCore_453.A("ŴŦŘĵĶŬļœŕŠŚŇ", (byte)64, 65);
               b[2] = NLoginCore_173.D("ҹӄӛҼӝӯӍӶӵӴӐӱӣӅӶӥҽӒӗӑӮӒӱӟӡӓӣӝӀӻӽӕӅԐӹӮӧӒӆӬԆԀӭӶӨӖӛԅԗԏӼԀӼԟӚӛӜәԝӠԉԤӶԮ", (byte)64, 68);
               b[3] = NLoginCore_223.A("ŃŎťņŧŹŗƀſžŚŻŭŏƀůŇŜšśŸŜŻũūŝŭŧŊƅƇşŏƚƃŸűŜŐŶƐƊŷƀŲŠťƏơƙƆƊƆƩŤťŦţƧŪƓƮƀƸ", (byte)64, 65);
               b[4] = NLoginCore_453.A("ŪźŚŊŊŋľŬŕŪŚŇ", (byte)64, 65);
               b[5] = NLoginCore_138.E("ՍՕՒԲ\u0557լԲԸԼը\u0557Մ", (byte)64, 69);
               b[6] = NLoginCore_141.A("ŰįĬĵŷįŏŋŚľŞŇ", (byte)64, 65);
               b[7] = NLoginCore_575.C("ӠӰӐӀӀӁҴӢӋӠӐҽ", (byte)64, 67);
               b[8] = NLoginCore_451.B("ŐŘŕĵŚůĵĻĿūŚŇ", (byte)64, 66);
               b[9] = NLoginCore_453.C("ӦҥҢҫӭҥӅӁӐҴӔҽ", (byte)64, 67);
               break;
            case 1:
               b[0] = NLoginCore_110.F("ճիԲնթյկՆխհՋՄ", (byte)64, 70);
               b[1] = NLoginCore_241.D("ӉӃӃӜҤӔҰҭӥӕӶҽ", (byte)64, 68);
               b[2] = NLoginCore_076.B("ŃŎťņŧŹŗƀſžŚŻŭŏƀůŇŜšśŸŜŻũūŝŭŧŊƅƇşŏƚƃŸűŜŐŶƐƊŷƀŲŠťƏơƙƆƊƆƪƞūŹƯŨųƦűƤƓ", (byte)64, 66);
               b[3] = NLoginCore_201.E("ՀՋբՃդնՔսռջ\u0557ոժՌսլՄՙ՞\u0558յՙոզը՚ժդՇւք՜Ռ֗րյծՙՍճ֍ևմսկ՝բ\u058c֖֞փևփ֟փ֝փ֟֩ըսֳ֦ծ", (byte)64, 69);
               b[4] = NLoginCore_324.D("ӃӆӱңӁүӧҰӕӶӠұӬӔҮӬҷӿӽӍӽԁӈӉ", (byte)64, 68);
               b[5] = NLoginCore_223.C("ӏӣӄӊӡӲӟӳҮӗӲҽ", (byte)64, 67);
               b[6] = NLoginCore_521.A("ŲŬŔŰŝżŴŞļŒĽŇ", (byte)64, 65);
               b[7] = NLoginCore_451.A("ŹĳĶŉŒŨűŵōŶƂŠŹŭŚŤśŹŔŷņƋŒœ", (byte)64, 65);
               b[8] = NLoginCore_530.A("ŔņńĺŘŝŸŸōĽŖŇ", (byte)64, 65);
               b[9] = NLoginCore_141.A("ĪĴŧŦŤŏŗūŜķĽŇ", (byte)64, 65);
               break;
            case 2:
               b[0] = NLoginCore_521.F("ՕՉԶգչՏջոՆպՏԻԹՖ՟չաՕրԺսբՏՐ", (byte)64, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_127.B("ŭųřŦŋŗœŋŨſŵŜŭƂŢŴŧŶřŻƅŕŒœ", (byte)64, 66);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_215.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.A("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 65), NLoginCore_215.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.E("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձࣷऀअऎअ࣫ऍࣾ࣫ࣵऌओःऎ\u058b", (byte)118, 69) + var1 + NLoginCore_232.C("Ց", (byte)118, 67) + var2.toString(), var4
         );
      }
   }

   public void i(String var1) {
      try {
         if (var1.charAt(a) == b && var1.charAt(var1.length() - c) == d) {
            JSONObject var2 = new JSONObject(var1);
            this.a(var2.getInt(a(e, f ^ g)), var2.getJSONObject(a(h, i ^ j)));
            return;
         }

         String var4 = a(k, l ^ m);
         Object[] var10001 = new Object[n];
         var10001[o] = var1;
         NLoginCore_370.d(var4, var10001);
      } catch (JSONException var3) {
         String var10000 = a(p & q, r);
         Object[] var10002 = new Object[s];
         var10002[t] = var1;
         NLoginCore_370.c(var10000, var3, var10002);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 36L;
      var1 ^= 7096591748076223580L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     (byte)(29 + 40),
                     (byte)(11 + 72),
                     (byte)(19 + 28),
                     (byte)(54 + 13),
                     (byte)(7 + 59),
                     (byte)(18 + 49),
                     (byte)(29 + 18),
                     (byte)(13 + 67),
                     75,
                     (byte)(10 + 57),
                     (byte)(6 + 77),
                     (byte)(46 + 7),
                     (byte)(15 + 65),
                     97,
                     (byte)(94 + 6),
                     (byte)(36 + 64),
                     (byte)(68 + 37),
                     (byte)(53 + 57),
                     (byte)(53 + 50)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.E("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ࢈\u0891\u0896࢟\u0896ࡼ࢞\u088fࡼࢆ࢝ࢤ\u0894࢟", (byte)7, 69));
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
}
