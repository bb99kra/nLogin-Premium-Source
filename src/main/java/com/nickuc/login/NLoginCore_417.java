package com.nickuc.login;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import io.netty.channel.Channel;
import io.papermc.paper.connection.PlayerConfigurationConnection;
import io.papermc.paper.event.player.AsyncPlayerSpawnLocationEvent;
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
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class NLoginCore_417 implements NLoginInterface_027 {
   private static long aj = Long.reverse(-6946780542471994382L);
   private static int al = (4194304 >>> 22 | 4194304 << -22) & -1;
   private static int aw = (8388608 >>> 53 | 8388608 << ~53 + 1) & -1;
   private static int t = Integer.reverse(536870912);
   private static int a = 335544320 >>> 26 | 335544320 << -26;
   private static int ba = (0 >>> 56 | 0 << ~56 + 1) & -1;
   private static int m = (12288 >>> 76 | 12288 << -76) & -1;
   private static int ap = (2097152 >>> 116 | 2097152 << -116) & -1;
   private static int am = Integer.reverse(1342177280);
   private static int u = Integer.reverse(-1610612736);
   private static String[] b = new String[NLoginCore_417.bc];
   private static long av = Long.reverse(-8243817235154697230L);
   private static int bb = Integer.reverse(1879048192);
   private static long aa = Long.reverse(-6946780542471994382L);
   private static int ah = Integer.reverse(0);
   private static int j = 8 >>> 34 | 8 << -34;
   private static int r = (-1 >>> 156 | -1 << -156) & -1;
   private static long w = Long.reverse(1297036692682702848L);
   private static int p = Integer.reverse(-1073741824);
   private static int b = Integer.reverse(0);
   private static int ag = (327680 >>> 176 | 327680 << ~176 + 1) & -1;
   private static long y = Long.reverse(-8243817235154697230L);
   private static int au = Integer.reverse(805306368);
   private static long h = Long.reverse(-6946780542471994382L);
   private static int ax = 1664 >>> 135 | 1664 << -135;
   private static int c = (0 >>> 134 | 0 << -134) & -1;
   private static int x = 12582912 >>> 245 | 12582912 << -245;
   private final NLoginType_008 g;
   private static long d = Long.reverse(-6946780542471994382L);
   private static long as = Long.reverse(-8243817235154697230L);
   private static int af = Integer.reverse(0);
   private static int z = Integer.reverse(-536870912);
   private static int ac = 8388608 >>> 180 | 8388608 << ~180 + 1;
   private static int at = 393216 >>> 81 | 393216 << ~81 + 1;
   private static int ai = 9437184 >>> 148 | 9437184 << ~148 + 1;
   private static long s = Long.reverse(-8243817235154697230L);
   private static long o = Long.reverse(-8243817235154697230L);
   private final NLoginCore_447 a;
   private static long v = Long.reverse(-6946780542471994382L);
   private static int bc = (112 >>> 131 | 112 << ~131 + 1) & -1;
   private static long l = Long.reverse(-8243817235154697230L);
   private static int n = -1 >>> 106 | -1 << -106;
   private static String[] a = new String[bb];
   private static int q = Integer.reverse(536870912);
   private static int an = Integer.reverse(-1);
   private static long i = Long.reverse(1297036692682702848L);
   private static int k = (65536 >>> 79 | 65536 << ~79 + 1) & -1;
   private static int ar = Integer.reverse(-1);
   private static int aq = -1073741822 >>> 190 | -1073741822 << -190;
   private static long ak = Long.reverse(1297036692682702848L);
   private static long ay = Long.reverse(-6946780542471994382L);
   private static int g = 2097152 >>> 21 | 2097152 << ~21 + 1;
   private static long ao = Long.reverse(-8243817235154697230L);
   private static long e = Long.reverse(1297036692682702848L);
   private static long ad = Long.reverse(-6946780542471994382L);
   private static int f = (536870912 >>> 125 | 536870912 << -125) & -1;
   private static long ab = Long.reverse(1297036692682702848L);
   private static long ae = Long.reverse(1297036692682702848L);
   private static long c;
   private static long az = Long.reverse(1297036692682702848L);

   private static void b() {
      c = 5746939055816841721L;
      long var0 = c ^ -8451111094727597596L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(42 + 27),
               (byte)(40 + 43),
               (byte)(8 + 39),
               (byte)(62 + 5),
               66,
               (byte)(40 + 27),
               (byte)(4 + 43),
               (byte)(3 + 77),
               (byte)(12 + 63),
               (byte)(55 + 12),
               (byte)(53 + 30),
               (byte)(14 + 39),
               (byte)(50 + 30),
               (byte)(61 + 36),
               (byte)(24 + 76),
               (byte)(47 + 53),
               (byte)(31 + 74),
               110,
               (byte)(64 + 39)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_559.A("ŏōĬĵŞķĲŘŮűŤŎŋōŮĹŘŞŖŚųƅŌō", (byte)61, 65);
               b[1] = NLoginCore_127.B("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 66);
               b[2] = NLoginCore_427.A("ŪŌūŀŃŰŗŢůŎŘŶŸıŠŲŕœƃƀŘŘűŶƁŵƌƂōŤůŞŽƂƉőŷŗƄŭűƘŻŨŖŘžƀƋƎŭŗƧƕŬŭ", (byte)61, 65);
               b[3] = NLoginCore_091.D("ӐҢҸҧҲҶҼӧҼҾӃҴ", (byte)61, 68);
               b[4] = NLoginCore_232.A("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 65);
               b[5] = NLoginCore_092.A("ŅŲŧŃŁıřŁńţŒŵŘŜƁŽŐſŒŖŚƇŐřƅƈƃŽƅƆƆƇŉƑƌŮƁƐűƑŦƄŎŖųŝŭžƏƏƤƞƞƥŬŭ", (byte)61, 65);
               b[6] = NLoginCore_223.C("ӛӡңҾҹҩӗҨӅӛӁҩәӛӲҴӲӕӘұӳӋӕӹӉһӕӈӢҿӚӶҾӢӄӜӗӤӓӜӈӦӚӦԃӋԎԌԃӰӒԁԊӕӺӎӝԖӯԜԛԘӸԓ", (byte)61, 67);
               b[7] = NLoginCore_471.D("ҿҸӒӜҽӧӉҦӚӬәҴ", (byte)61, 68);
               b[8] = NLoginCore_076.D("ҢҲӀҺҢӨӋӣӚӦӟҬӛӢүӔӑӰӂӍҴӯӺӨүәӐӠӖӷӺҺӼӔӄӰӝӚӿӾӽӨӰӈӻԐԓӜӒӨԒӬӋԈӟӠ", (byte)61, 68);
               b[9] = NLoginCore_127.A("ŏōĬĵŞķĲŘŮűŤŎŋōŮĹŘŞŖŚųƅŌō", (byte)61, 65);
               b[10] = NLoginCore_138.E("ղթգլԭՠՅ՚ջՍԻՁ", (byte)61, 69);
               b[11] = NLoginCore_453.D("ҝӖҟӟҦӕҹӬӚӭӝҴ", (byte)61, 68);
               b[12] = NLoginCore_471.A("ŲũţŬĭŠŅŚŻōĻŁ", (byte)61, 65);
               b[13] = NLoginCore_453.C("ҸӥӚҶҴҤӌҴҷӖӅӨӋӏӴӰӃӲӅӉӍӺӃӌӸӻӶӰӸӹӹӺҼԄӿӡӴԃӤԄәӷӁӉӦӐӠӱԂԂԗԑԑԘӟӠ", (byte)61, 67);
               break;
            case 1:
               b[0] = NLoginCore_575.F("ՏՍԬԵ՞ԷԲ\u0558ծձ՜վիՙՍՎՙ\u0557աՐՆՏՌՍ", (byte)61, 70);
               b[1] = NLoginCore_223.B("ĿťńųŒŬůňŵŭŜŁ", (byte)61, 66);
               b[2] = NLoginCore_138.A("ŪŌūŀŃŰŗŢůŎŘŶŸıŠŲŕœƃƀŘŘűŶƁŵƌƂōŤůŞŽƂƉőŷŗƄŭűƘŻŕƖŜƘƌƃƎšűƙƕŬŭ", (byte)61, 65);
               b[3] = NLoginCore_173.C("ңӝӈҵҦҥҪҿӛҸӘөӨӦӅүӔӈӓӌӢӸҿӀ", (byte)61, 67);
               b[4] = NLoginCore_387.F("ՐՁՑհԵԵՈԳկկՄՁ", (byte)61, 70);
               b[5] = NLoginCore_110.F("ՅղէՃՁԱՙՁՄգՒյ\u0558՜ցսՐտՒՖ՚ևՐՙօֈփսօֆֆևՉ֑\u058cծց\u0590ձ֑զք՜֓Օ՚ծնծռ֡֔րտլխ", (byte)61, 70);
               b[6] = NLoginCore_397.F("ըծ\u0530ՋՆԶդԵՒըՎԶզըտՁտբեԾր\u0558բֆՖՈբՕկՌէփՋկՑթդձՠթՕճէճ\u0590\u0558֛֙\u0590ս՟֎֗ա֥րվ֢֦֫ժկք֡", (byte)61, 70);
               b[7] = NLoginCore_141.F("ժՠՕՑՌմՏՐկՍԻՁ", (byte)61, 70);
               b[8] = NLoginCore_232.E("ԯԿՍՇԯյ\u0558հէճլԹըկԼա՞սՏ՚ՁռևյԼզ՝խգքևՇ։աՑսժէ\u058c\u058b֊յռ֝վտ֔֏ր՛տ֤մկ֚թֈե֍ւ։ք֑ր", (byte)61, 69);
               b[9] = NLoginCore_201.B("ŏōĬĵŞķĲŘŮűťŋŝŭŜŢŶŘŞłŚƅŌō", (byte)61, 66);
               b[10] = NLoginCore_141.D("ӓӅҥӆӟӥһҪӊӭӡҴ", (byte)61, 68);
               b[11] = NLoginCore_530.B("ŐűņŎŴŨřţĹŐĳŁ", (byte)61, 66);
               b[12] = NLoginCore_384.F("ՇՉ՜ՂձՎչ\u0557ժԲպՁ", (byte)61, 70);
               b[13] = NLoginCore_173.D("ҸӥӚҶҴҤӌҴҷӖӅӨӋӏӴӰӃӲӅӉӍӺӃӌӸӻӶӰӸӹӹӺҼԄӿӡӴԃӤԄәӷӅԏԉӄӋӑӏԋӶԊӲӲӟӠ", (byte)61, 68);
               break;
            case 2:
               b[0] = NLoginCore_324.E("ըԮՒ\u0530Գը\u0558ՍմԸէոԻՍ՜ԻռիԶԻջՏՌՍ", (byte)61, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_138.F("\u0530ձլՑԭԿանլդ՚ԹնՌլ\u0558ՁծրյՏՃ՚շՄՠվֆցիֆգ", (byte)61, 70);
         }
      }
   }

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(AsyncPlayerSpawnLocationEvent var1) {
      PlayerConfigurationConnection var2 = var1.getConnection();
      PlayerProfile var3 = var2.getProfile();
      if (!var1.isNewPlayer()) {
         NLoginCore_509 var4 = this.g.a().a(var3.getName(), var3.getId(), var2.getClientAddress().getAddress());
         if (var4 != null && var4.a().b(NLoginCore_077.g)) {
            return;
         }
      }

      Channel var8 = (Channel)SpigotReflectionUtil.getChannelFromPaperConnection(var2);
      if (var8 == null) {
         String[] var10 = new String[a];
         var10[b] = a(c, d ^ e);
         var10[f] = a(g, h ^ i);
         var10[j] = a(k, l) + var1.getClass().getSimpleName() + a(m & n, o);
         var10[p] = a(q & r, s);
         var10[t] = a(u, v ^ w);
         var2.disconnect(NLoginCore_529.a(NLoginCore_112.a(var10)));
      } else {
         com.nickuc.login.bukkit.BukkitHelper_001 var5 = (com.nickuc.login.bukkit.BukkitHelper_001)var8.attr(com.nickuc.login.bukkit.BukkitHelper_001.a).get();
         if (var5 == null) {
            String var9 = a(x, y) + var2.getProfile().getName() + a(z, aa ^ ab) + var1.getClass().getSimpleName() + a(ac, ad ^ ae);
            NLoginCore_370.c(var9);
            String[] var10001 = new String[ag];
            var10001[ah] = a(ai, aj ^ ak);
            var10001[al] = a(am & an, ao);
            var10001[ap] = a(aq & ar, as) + var9;
            var10001[at] = a(au, av);
            var10001[aw] = a(ax, ay ^ az);
            var2.disconnect(NLoginCore_529.a(NLoginCore_112.a(var10001)));
         } else {
            Location var6 = var1.getSpawnLocation();
            Location var7 = this.a.a().a(var6, (boolean)ba);
            if (var7 != null) {
               var5.a = var6;
               var1.setSpawnLocation(var7);
            }
         }
      }
   }

   @Generated
   public NLoginCore_417(NLoginType_008 var1, NLoginCore_447 var2) {
      this.g = var1;
      this.a = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 72L;
      var1 ^= -8451111094727597596L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(59 + 10),
                     (byte)(2 + 81),
                     (byte)(8 + 39),
                     (byte)(62 + 5),
                     (byte)(26 + 40),
                     (byte)(12 + 55),
                     (byte)(39 + 8),
                     (byte)(4 + 76),
                     (byte)(67 + 8),
                     (byte)(42 + 25),
                     (byte)(11 + 72),
                     (byte)(34 + 19),
                     (byte)(6 + 74),
                     (byte)(82 + 15),
                     100,
                     (byte)(27 + 73),
                     (byte)(28 + 77),
                     (byte)(91 + 19),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.E("֜֩֨իֶ֧֢֥֫֫ղְְִֶ֭ոऐऊ࣮ࣿ࣡ँࣤऋऒचऋࣻࣿउ", (byte)125, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_417.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.E("ӱԓԕӵԙԸ\u0530ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)13, 69), NLoginCore_417.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_471.C("пьыЎюъхюљшЕѓїѐѓљЛ\u07b3ޭޢބޑޤއޮ\u07b5\u07bdޮޞޢެе", (byte)13, 67) + var1 + NLoginCore_027.F("ԃ", (byte)13, 70) + var2.toString(), var4
         );
      }
   }
}
