package com.nickuc.login;

import com.nickuc.login.lib.guava.common.collect.Multimap;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Handler;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class NLoginCore_074 {
   private static int r = 0 >>> 129 | 0 << ~129 + 1;
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int n = 4096 >>> 44 | 4096 << -44;
   private static long t = Long.reverse(1459943283944703265L);
   private static long y = Long.reverse(7512781183130649889L);
   private static long l = Long.reverse(1459943283944703265L);
   private static int ag = Integer.reverse(0);
   private static int ae = Integer.reverse(-536870912);
   private static int ak = 0 >>> 228 | 0 << ~228 + 1;
   private static int aa = Integer.reverse(1610612736);
   private static int w = (80 >>> 4 | 80 << -4) & -1;
   private static long i = Long.reverse(8935141660703064064L);
   private static String[] ZKM_STR_A = new String[NLoginCore_074.al];
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int o = 201326592 >>> 186 | 201326592 << ~186 + 1;
   private static long d = Long.reverse(7512781183130649889L);
   private static int k = (4 >>> 225 | 4 << -225) & -1;
   private static int am = Integer.reverse(-1879048192);
   private static int ad = (1 >>> 64 | 1 << ~64 + 1) & -1;
   private static int a = Integer.reverse(0);
   private static int j = Integer.reverse(0);
   private static long q = Long.reverse(8935141660703064064L);
   private static long aj = Long.reverse(8935141660703064064L);
   private static int s = (64 >>> 228 | 64 << ~228 + 1) & -1;
   private static long ai = Long.reverse(1459943283944703265L);
   private static String[] ZKM_STR_B = new String[am];
   private static long h = Long.reverse(1459943283944703265L);
   private static int al = Integer.reverse(-1879048192);
   private static long u = Long.reverse(8935141660703064064L);
   private static long p = Long.reverse(1459943283944703265L);
   private static long f = Long.reverse(855683929200394240L);
   private static long m = Long.reverse(8935141660703064064L);
   private static long ac = Long.reverse(7512781183130649889L);
   private static int x = Integer.reverse(-1);
   private static int ab = (-1 >>> 174 | -1 << ~174 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static int v = 33554432 >>> 25 | 33554432 << -25;
   private static long c;
   private static int e = (0 >>> 2 | 0 << -2) & -1;
   private static int ah = 2 >>> 222 | 2 << -222;
   private static long af = Long.reverse(7512781183130649889L);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -8666849080078826921L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(49 + 20),
                     83,
                     (byte)(18 + 29),
                     (byte)(20 + 47),
                     (byte)(29 + 37),
                     (byte)(50 + 17),
                     (byte)(14 + 33),
                     (byte)(20 + 60),
                     (byte)(3 + 72),
                     (byte)(16 + 51),
                     (byte)(58 + 25),
                     (byte)(18 + 35),
                     80,
                     (byte)(83 + 14),
                     (byte)(59 + 41),
                     (byte)(46 + 54),
                     (byte)(17 + 88),
                     (byte)(82 + 28),
                     (byte)(18 + 85)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.A("ŜũŨīūŧŢūŶťĲŰŴŭŰŶĸҞӊҬҠӉӗӃӃӔӒҺ", (byte)61, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_074.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.B("ďıĳēķŖŎŤŐğŝœšśĤŉūŪŢŨŢķ", (byte)52, 66), NLoginCore_074.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.A("ŊŗŖęřŕŐřŤœĠŞŢśŞŤĦҌҸҚҎҷӅұұӂӀҨĽ", (byte)52, 65) + var1 + NLoginCore_559.C("ҋ", (byte)52, 67) + var2.toString(), var4
         );
      }
   }

   public static void a(Plugin var0) {
      PluginManager var1 = ProxyServer.getInstance().getPluginManager();
      ClassLoader var2 = var0.getClass().getClassLoader();

      try {
         var0.onDisable();
         Handler[] var3 = var0.getLogger().getHandlers();
         int var4 = var3.length;

         for (int var5 = a; var5 < var4; var5++) {
            Handler var6 = var3[var5];
            var6.close();
         }
      } catch (Throwable var13) {
         NLoginCore_370.c(a(b, d) + var0.getDescription().getName(), var13);
      }

      var1.unregisterListeners(var0);
      var1.unregisterCommands(var0);
      ProxyServer.getInstance().getScheduler().cancel(var0);
      var0.getExecutorService().shutdownNow();

      for (Thread var17 : Thread.getAllStackTraces().keySet()) {
         if (var17.getClass().getClassLoader() == var2) {
            try {
               var17.interrupt();
               var17.join(f);
               if (var17.isAlive()) {
                  var17.interrupt();
               }
            } catch (Throwable var11) {
               NLoginCore_370.c(a(g, h ^ i) + var0.getDescription().getName(), var11);
            }
         }
      }

      try {
         Field var15 = PluginManager.class.getDeclaredField(a(k, l ^ m));
         var15.setAccessible((n != 0));
         Map var18 = (Map)var15.get(var1);
         Iterator var20 = var18.entrySet().iterator();

         while (var20.hasNext()) {
            Entry var22 = (Entry)var20.next();
            if (((Command)var22.getValue()).getClass().getClassLoader() == var2) {
               var20.remove();
            }
         }
      } catch (Throwable var12) {
         NLoginCore_370.c(a(o, p ^ q) + var0.getDescription().getName(), var12);
      }

      try {
         Field var16 = PluginManager.class.getDeclaredField(a(s, t ^ u));
         var16.setAccessible((v != 0));
         Map var19 = (Map)var16.get(var1);
         var19.values().remove(var0);
         Field var21 = PluginManager.class.getDeclaredField(a(w & x, y));
         var21.setAccessible((z != 0));
         Multimap var23 = (Multimap)var21.get(var1);
         var23.removeAll(var0);
         Field var7 = PluginManager.class.getDeclaredField(a(aa & ab, ac));
         var7.setAccessible((ad != 0));
         Multimap var8 = (Multimap)var7.get(var1);
         var8.removeAll(var0);
      } catch (Throwable var10) {
         NLoginCore_370.c(a(ae, af) + var0.getDescription().getName(), var10);
      }

      if (var2 instanceof URLClassLoader) {
         try {
            ((URLClassLoader)var2).close();
         } catch (Throwable var9) {
            NLoginCore_370.c(a(ah, ai ^ aj) + var0.getDescription().getName(), var9);
         }
      }
   }

   private static void b() {
      c = -8889052338912542168L;
      long var0 = c ^ -8666849080078826921L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(5 + 63),
               (byte)(14 + 55),
               (byte)(66 + 17),
               (byte)(5 + 42),
               (byte)(39 + 28),
               (byte)(27 + 39),
               (byte)(9 + 58),
               (byte)(43 + 4),
               (byte)(74 + 6),
               (byte)(18 + 57),
               67,
               (byte)(12 + 71),
               53,
               (byte)(5 + 75),
               (byte)(56 + 41),
               (byte)(23 + 77),
               (byte)(41 + 59),
               (byte)(45 + 60),
               (byte)(8 + 102),
               (byte)(39 + 64)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.E("Քֈսն֊Կբ՜աձ\u058cցՋէֆՕ֏ցդֈՎֆէ\u058c։սր֟֝֞֏֓֝֡֫ջ֬պջ֤֑ֆ֠շ", (byte)83, 69);
               ZKM_STR_B[1] = NLoginCore_575.D("ԢӻԊӾԦԉԣԀӥԠԙԐԧԌӭԡԅԙԋԸԱԱӵԩԽԯԔԯԁԕԿԑԨԧԓԦԆԡՃՃԆԏՉԻՃՎԏԥԯԡՇՎԑԹԼԿ՞ԠԓՏԲՄՍՂ", (byte)83, 68);
               ZKM_STR_B[2] = NLoginCore_575.C("ԨӡӼԥԉӸԠӷӻӭӼӯӻԞԊԁ\u0530ԣԆԛԮԺԁԂ", (byte)83, 67);
               ZKM_STR_B[3] = NLoginCore_387.F("փ՜ի՟ևժքաՆցճսՏհևծշՓ֊ճօ֔֓ճշՙ՝֏ւ֛֘֗ո֙ե֗ի֬ք֚տս֜շ", (byte)83, 70);
               ZKM_STR_B[4] = NLoginCore_471.C("ԆԣөӡԃԁԂӬԀԅԧӶ", (byte)83, 67);
               ZKM_STR_B[5] = NLoginCore_553.A("ƛŜūƝƟƚƙűƤŦŽƠƣƝƚƍƩƣƩŨưƠƄſƉƢƍƃųƛƌƮ", (byte)83, 65);
               ZKM_STR_B[6] = NLoginCore_446.E("չևժւթ֊\u058bհ\u058bօթլփՒվֆշ֘մՒ֜Տՙ՛֚֎֜֓ցպշն", (byte)83, 69);
               ZKM_STR_B[7] = NLoginCore_397.C("ԢӻԊӾԦԉԣԀӥԠԒԜӮԏԦԍԖӲԩԒԤԱԱԸԸԹԝԛӼӻԕԆԳԓԲԢՉԖӿԀՄՉ\u0530ՅԭԬՄԑՁՅԏՃԫԕԔԴԭԭԚԯԣԺՂԤզ՞Է՞ԶԾՇԮՇՊ\u0530ԽԽ՝ծՅԲ\u0530ՇՅՐժՁՂ", (byte)83, 67);
               ZKM_STR_B[8] = NLoginCore_127.B("ƙŲƁŵƝƀƚŷŜƗƈţźƞŵƞƄƭŰƢưƍƇžůƬƇƺƶƶƑƦƉƸƘƚơǃƷƢƘǃǆƦǁƤƴǇǊƟǁƽƢƞƤƩƓǉǈƴƭǈǖƬ", (byte)83, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_559.A("ŪƞƓƌƠŕŸŲŷƇƢƗšŽƜūƥƗźƞŤƜŽƢƟƓƖƵƳƴƥƩƖƐƐƱƓǃƑƭƔǇƾƍ", (byte)83, 65);
               ZKM_STR_B[1] = NLoginCore_433.B("ƙŲƁŵƝƀƚŷŜƗƐƇƞƃŤƘżƐƂƯƨƨŬƠƴƦƋƦŸƌƶƈƟƞƊƝŽƘƺƺŽƆǀƲƺǅƆƜƦƘƾǅƈǀǐǃǂƶƢǙǗƩǉƏ", (byte)83, 66);
               ZKM_STR_B[2] = NLoginCore_384.F("։Ղ՝ֆժՙց\u0558՜Վ՛լ՜՞փ\u058cոՙօ֏մյբգ", (byte)83, 70);
               ZKM_STR_B[3] = NLoginCore_471.B("ƙŲƁŵƝƀƚŷŜƗƉƓťƆƝƄƍũƠƉƛƪƩƉƍůųƥƘƱƮƭƲƯƕƘƱƶƖƳƾƛǂƤǅƗƽǂƝƭƱǑƩǁƘƙ", (byte)83, 66);
               ZKM_STR_B[4] = NLoginCore_387.C("ӲԧԦӺԬԫԄӥԜԍԂԋԪԜԝԁԃԔԤӰԚԺԁԂ", (byte)83, 67);
               ZKM_STR_B[5] = NLoginCore_183.E("օՆՕև։քփ՛֎Րէ֊֍ևքշ֓֍֓Ւ֚ո՛ծ\u058b՟֡֗ց֑ան", (byte)83, 69);
               ZKM_STR_B[6] = NLoginCore_027.C("ԘԦԉԡԈԩԪԏԪԤԈԋԢӱԝԥԖԷԓӱԻӸӹԹԗԨԲԎԶԿԄԦ", (byte)83, 67);
               ZKM_STR_B[7] = NLoginCore_201.E(
                  "փ՜ի՟ևժքաՆցճսՏհևծշՓ֊ճօ֚֒֒֙֙վռ՝՜նէ֔մ֓փ֪շՠա֥֪֑֦֎֍֥ղ֢֦հ֤\u058cնյ֕֎֎ջ\u0590ք֛֣օׇֿֿ֘֗֟֨֏֨֫ք\u05cb֧\u058cֶ֦\u05cc\u05c8\u05c8יֲכ֢֣", (byte)83, 69
               );
               ZKM_STR_B[8] = NLoginCore_138.C("ԢӻԊӾԦԉԣԀӥԠԑӬԃԧӾԧԍԶӹԫԹԖԐԇӸԵԐՃԿԿԚԯԒՁԡԣԪՌՀԫԡՌՏԯՊԭԽՐՓԨՊՆԫԫՍ\u0557ԟԼ\u0530Ԕ\u0557\u0558՟բ", (byte)83, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.C("ԆԦԦӥԇԬԜӭӷӧӺԑԠԔԦӭԆӰӲԫԸԔԁԂ", (byte)83, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_076.D("ӴӳԁԝԇөԮԎӼԢԝԉԅԴԁӳӱӮԪԐӭԪԁԂ", (byte)83, 68);
         }
      }
   }
}
