package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class NLoginCore_012 {
   private static long x = Long.reverse(-3458764513820540928L);
   private static long an = Long.reverse(-3458764513820540928L);
   private static int r = Integer.reverse(-1073741824);
   private static int al = Integer.reverse(-536870912);
   private static long j = Long.reverse(5712255138328590897L);
   private static int bd = 3 >>> 190 | 3 << -190;
   private static final Method j;
   private static int d = 512 >>> 41 | 512 << -41;
   private static int as = 1152 >>> 167 | 1152 << ~167 + 1;
   private static NLoginCore_089 a;
   private static int ay = 0 >>> 222 | 0 << -222;
   private static long aq = Long.reverse(5712255138328590897L);
   private static int b = (0 >>> 241 | 0 << ~241 + 1) & -1;
   private static long ah = Long.reverse(-3458764513820540928L);
   private static int ba = -1 >>> 182 | -1 << -182;
   private static int ap = (512 >>> 166 | 512 << ~166 + 1) & -1;
   private static long ar = Long.reverse(-3458764513820540928L);
   private static long s = Long.reverse(5712255138328590897L);
   private static long ax = Long.reverse(-3458764513820540928L);
   private static long bf = Long.reverse(-6969881412346725839L);
   private static long ag = Long.reverse(5712255138328590897L);
   private static int ai = Integer.reverse(0);
   private static int e = (0 >>> 158 | 0 << -158) & -1;
   private static int ac = Integer.reverse(0);
   private static int i = 128 >>> 71 | 128 << -71;
   private static long o = Long.reverse(-6969881412346725839L);
   private static int ae = 939524096 >>> 186 | 939524096 << ~186 + 1;
   private static int f = 0 >>> 114 | 0 << ~114 + 1;
   private static int av = Integer.reverse(1342177280);
   private static int v = (4096 >>> 42 | 4096 << ~42 + 1) & -1;
   private static long c;
   private static long g = Long.reverse(5712255138328590897L);
   private static int u = Integer.reverse(0);
   private static int m = Integer.reverse(0);
   private static long at = Long.reverse(5712255138328590897L);
   private static final boolean P = ((NLoginCore_546.a(Bukkit.class, a(NLoginCore_012.af, ag ^ ah) != 0)) != null ? NLoginCore_012.aj : NLoginCore_012.ak);
   private static int ad = 458752 >>> 111 | 458752 << -111;
   private static int c = (2 >>> 1 | 2 << ~1 + 1) & -1;
   private static int be = Integer.reverse(-1);
   private static long bi = Long.reverse(-3458764513820540928L);
   private static int y = Integer.reverse(-1610612736);
   private static long am = Long.reverse(5712255138328590897L);
   private static long h = Long.reverse(-3458764513820540928L);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int n = (128 >>> 166 | 128 << ~166 + 1) & -1;
   private static long bb = Long.reverse(-6969881412346725839L);
   private static final Method i;
   private static int q = Integer.reverse(0);
   private static long k = Long.reverse(-3458764513820540928L);
   private static final Field f;
   private static int az = 1441792 >>> 81 | 1441792 << -81;
   private static long aw = Long.reverse(5712255138328590897L);
   private static int af = Integer.reverse(1610612736);
   private static int ak = Integer.reverse(0);
   private static final Method k;
   private static int ao = Integer.reverse(0);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static long t = Long.reverse(-3458764513820540928L);
   private static String[] ZKM_STR_B = new String[ae];
   private static int aj = (4 >>> 226 | 4 << ~226 + 1) & -1;
   private static long aa = Long.reverse(-3458764513820540928L);
   private static long z = Long.reverse(5712255138328590897L);
   private static int bg = (1703936 >>> 209 | 1703936 << -209) & -1;
   private static long bh = Long.reverse(5712255138328590897L);
   private static int a = (0 >>> 150 | 0 << ~150 + 1) & -1;
   private static int bc = Integer.reverse(0);
   private static int l = 0 >>> 122 | 0 << ~122 + 1;
   private static long w = Long.reverse(5712255138328590897L);
   private static String[] ZKM_STR_A = new String[ad];
   private static long au = Long.reverse(-3458764513820540928L);

   public static Collection<? extends Player> d() {
      if (i == null) {
         return Bukkit.getServer().getOnlinePlayers();
      } else {
         try {
            return NLoginCore_114.a((Player[])i.invoke(Bukkit.getServer()));
         } catch (ReflectiveOperationException var1) {
            throw new RuntimeException(a(f, g ^ h), var1);
         }
      }
   }

   public static boolean V() {
      return P;
   }

   public static void c(Consumer<NLoginInterface_048> var0) {
      a.b((c != 0)).a(var0);
   }

   public static boolean T() {
      try {
         return ((f != null && f.getBoolean(null) != 0) ? p : q);
      } catch (ReflectiveOperationException var1) {
         throw new RuntimeException(a(r, s ^ t), var1);
      }
   }

   public static void b(Consumer<NLoginInterface_048> var0) {
      a.b((a != 0)).a(var0);
   }

   public static void b(Runnable var0) {
      a.b((d != 0)).a(var0);
   }

   public static CompletableFuture<Void> a(Player var0, String var1) {
      CompletableFuture var2 = new CompletableFuture();
      if (!var0.isOnline()) {
         var2.complete(null);
      } else if (Bukkit.getServer().isPrimaryThread()) {
         var0.kickPlayer(var1);
         var2.complete(null);
      } else {
         a(() -> {
            var0.kickPlayer(var1);
            var2.complete(null);
         });
      }

      return var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= 999433231177186032L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(29 + 40),
                     (byte)(44 + 39),
                     (byte)(14 + 33),
                     (byte)(22 + 45),
                     (byte)(46 + 20),
                     67,
                     (byte)(36 + 11),
                     (byte)(34 + 46),
                     (byte)(50 + 25),
                     (byte)(57 + 10),
                     83,
                     (byte)(50 + 3),
                     (byte)(47 + 33),
                     (byte)(32 + 65),
                     (byte)(81 + 19),
                     (byte)(32 + 68),
                     (byte)(5 + 100),
                     (byte)(103 + 7),
                     (byte)(25 + 78)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱ\u0896࣋࣊࣎ࣇ࣑ࢬ࣌ࢫࣆࣀࣄࢵ", (byte)54, 69));
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

   public static void a(NLoginCore_089 var0) {
      a = var0;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_012.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.D("җҹһқҿӞӖӬӘҧӥӛөӣҬӑӳӲӪӰӪҿ", (byte)62, 68), NLoginCore_012.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.A("ŞūŪĭŭũŤŭŸŧĴŲŶůŲŸĺҟӔӓӗӐӚҵӕҴӏӉӍҾœ", (byte)62, 65) + var1 + NLoginCore_241.E("Դ", (byte)62, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      Method var0 = null;

      try {
         Bukkit.getServer().getOnlinePlayers();
      } catch (Throwable var8) {
         try {
            var0 = Server.class.getMethod(a(al, am ^ an));
         } catch (Throwable var7) {
            throw new UnsupportedOperationException(a(ap, aq ^ ar), var7);
         }
      }

      i = var0;
      Method var1 = null;
      Method var2 = null;

      try {
         Class var3 = Class.forName(a(as, at ^ au));
         var2 = Server.class.getMethod(a(av, aw ^ ax));
         var1 = var3.getMethod(a(az & ba, bb));
      } catch (ReflectiveOperationException var6) {
      }

      k = var2;
      j = var1;

      Field var9;
      try {
         Class var4 = Class.forName(a(bd & be, bf));
         var9 = var4.getField(a(bg, bh ^ bi));
      } catch (ReflectiveOperationException var5) {
         var9 = null;
      }

      f = var9;
   }

   public static UUID b(String var0) {
      return UUID.nameUUIDFromBytes((a(i, j ^ k) + var0).getBytes(StandardCharsets.UTF_8));
   }

   public static void a(Runnable var0) {
      a.b((b != 0)).a(var0);
   }

   @Nullable
   public static YamlConfiguration a() {
      if (k != null && j != null) {
         try {
            Object var0 = k.invoke(Bukkit.getServer());
            return (YamlConfiguration)j.invoke(var0);
         } catch (ReflectiveOperationException var1) {
            if (var1.getCause() instanceof UnsupportedOperationException) {
               return null;
            } else {
               throw new RuntimeException(a(n, o), var1);
            }
         }
      } else {
         return null;
      }
   }

   private static void b() {
      c = -8332329698868567310L;
      long var0 = c ^ 999433231177186032L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(4 + 65),
               83,
               (byte)(38 + 9),
               (byte)(46 + 21),
               66,
               (byte)(41 + 26),
               (byte)(11 + 36),
               (byte)(62 + 18),
               (byte)(33 + 42),
               (byte)(61 + 6),
               (byte)(61 + 22),
               (byte)(8 + 45),
               (byte)(32 + 48),
               (byte)(37 + 60),
               (byte)(92 + 8),
               (byte)(92 + 8),
               (byte)(83 + 22),
               (byte)(32 + 78),
               (byte)(17 + 86)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.D("ՓՏյՋձ՛լԹՅ\u0530լՐաՐքչցֆԾառ՜՟գտնծհ֎ծռթէ֓ՕըՕ֊֍֊՚֝֝լցլւջբ֢ավ֪ւկհ", (byte)109, 68);
               ZKM_STR_B[1] = NLoginCore_471.D("ծ\u0530ԲՇլՋ\u0558ՙԻհՇՊՖցռԻղՅւզՆբՏՐ", (byte)109, 68);
               ZKM_STR_B[2] = NLoginCore_559.E("\u058bս֕կ֓ե֛֖֡֗տշ֝ե֮֡լևֲ֣ըկր֙֎չջֻֻ֚֚֨֔֫֜\u0590֯ց֢֧֠֠ք\u05ca֞ցֱ֮דֽ֠ב֪֟֜֝", (byte)109, 69);
               ZKM_STR_B[3] = NLoginCore_575.C("՞ՐըՂզԸծմժթՐՈՌ\u0558\u0558՝գՃ՝ւգքնւՊ՝քժ՝Ցծ֑֊խտ֒շ\u0590ՙՙՏըկդ", (byte)109, 67);
               ZKM_STR_B[4] = NLoginCore_453.A("ƤǄƫƦƕǑƨǙƹƵƕƼƿǠǍǖƭǡƻƳǂǥƧǙƽǕǪǌƫƷǁƱǓƽƯǥƲǟǧǉƬǍǘƷƵƶǚǩǁǌǠǤǶǵǌǍ", (byte)109, 65);
               ZKM_STR_B[5] = NLoginCore_127.A("ƈǁƞƑǂǏǂƫǐǅǕƖǆǘǎƫǜƫƢƢǧǕǄƣƧƫǘǠǏǃǩǦǞǋǟƬǧǰƸǅƵǨǦǁ", (byte)109, 65);
               ZKM_STR_B[6] = NLoginCore_397.D("ՋՔՇԶյՇոյվ\u0558\u0557լչհԵ՜ՖսկսյՒՈ՟֊ժւՊ\u058cՋՋՊվղՉբչօռՔ֚թտդ", (byte)109, 68);
               ZKM_STR_B[7] = NLoginCore_173.B("ƩƧǏǅǍƭƲƮǚǈǈƩƬǕƨǏǗƼưǆƽƯƦƩǠǂǪǥƿǩǑƱ", (byte)109, 66);
               ZKM_STR_B[8] = NLoginCore_553.F("չշ֟֕֝սւվ֪֘֘չռ֥ո֧֟\u058cր֖֍֍\u058c֙ֈջ\u058cկվ֩չ֏֫֍ְ֢֕֓׃ּ֜֡\u058b֑", (byte)109, 70);
               ZKM_STR_B[9] = NLoginCore_223.E("բ\u058bլ\u0590ծ֟֝շ֥֙֕֩֕պզ֎֦կֲֵ֮֒ո֯փָ֍ֵֹչִַָյִֿׂ֛֟֓\u05c9ֶ֑֬", (byte)109, 69);
               ZKM_STR_B[10] = NLoginCore_241.C("ԬբԱյյկԻՐկԾձՄ", (byte)109, 67);
               ZKM_STR_B[11] = NLoginCore_232.B("ƜǐǑƭƫǘƑƸƣƓǆƫƩǞƲƼǛǎǘƶǗƿƬƭ", (byte)109, 66);
               ZKM_STR_B[12] = NLoginCore_433.E("ղճ՝՟գ֜ն֝գբ֤֜իպ֏֟֓։ւֳ֦֢֔ք֤֎ַ֙֜ֈ־֭֝ւְֻֻ֖ֈքֻւ֤֑", (byte)109, 69);
               ZKM_STR_B[13] = NLoginCore_027.A("ǈǌƏƱƾƶơƳǛǈƬơ", (byte)109, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.F("րռ֢ո֞ֈ֙զղ՝֙ս֎սֱֳ֦֮ի֎֩։\u058c\u0590ֻ֣֛֛֖֬֝֩֔׀ւ֕ւַַֺև\u05ca\u05cbׂ֖֥֢֭֬֏\u05cd\u058b֡֟֜֝", (byte)109, 70);
               ZKM_STR_B[1] = NLoginCore_127.C("ծ\u0530ԲՇլՋ\u0558ՙԻհՈ՝Ձՠջմքհ՜նՄճըՂՊՄ՝ՠդ\u0590ս։", (byte)109, 67);
               ZKM_STR_B[2] = NLoginCore_201.B("ƻƭǅƟǃƕǋǑǇǆƯƧǍƕǑǞƜƷǢǓƘƟưǉƾƩƫǫǊǘǄǛǌǊǫǀǟƱǒǐǗǐƶǧƷǗǀǮǰǓǘǡǧȅǌǍ", (byte)109, 66);
               ZKM_STR_B[3] = NLoginCore_138.F("\u058bս֕կ֓ե֛֖֡֗սյչօօ֊\u0590հ֊֯\u0590ֱ֣֯շ֊ֱ֗֊վ֛־ֺ\u058c֏ׂ׃ֶ֞֕׆֔׃׀ևև\u05c8֏ׁ֡֠\u05cfׅ֒֜֝", (byte)109, 70);
               ZKM_STR_B[4] = NLoginCore_183.F("մ֔ջնե֡ո֩։օե\u058c֏ְ֦֝սֱ\u058bփֵ֒շ֩֍ֺ֥֜ջև֑ց֣֍տֵւַ֯֙ռׁ֛֭֝֨֞\u05c9ֲ\u05cb׃ג֡ו֜֝", (byte)109, 70);
               ZKM_STR_B[5] = NLoginCore_453.E("\u0558֑ծա֒֟֒ջ֥֠֕զ֖֨֞ջ֬ջղղַ֥֔ճշջְֶֹ֨֟֓\u0590ְ֮տְքրց\u05caֳ֑֘", (byte)109, 69);
               ZKM_STR_B[6] = NLoginCore_127.A("ƨƱƤƓǒƤǕǒǛƵƴǉǖǍƒƹƳǚǌǚǒƯƥƼǧǇǟƧǩƨƨƧƺǰǓǪǤǢǁǫǫƲǔǁ", (byte)109, 65);
               ZKM_STR_B[7] = NLoginCore_138.F("չշ֟֕֝սւվ֪֘֘չռ֥ո֧֟\u058cր֖֍֊ִո֊ք֕֍ֲ֦֝֕", (byte)109, 70);
               ZKM_STR_B[8] = NLoginCore_091.A("ƩƧǏǅǍƭƲƮǚǈǈƩƬǕƨǏǗƼưǆƽƽƼǉƸƫƼƟƮǙƩƿǜǈǊǍƱǫǦǦǔǜǝǋǉƼǒǺǙǐǶǖƾǏǌǍ", (byte)109, 65);
               ZKM_STR_B[9] = NLoginCore_553.D("Ե՞ԿգՁղհՊլըռըոՍԹաչՂեօցֈՋւՖ\u058bՠ\u058cֈՌ\u058b֊֊դ֘բմֆ\u0557դջխիդ", (byte)109, 68);
               ZKM_STR_B[10] = NLoginCore_324.E("հ՟֢֥֖֚֡ֆ֒բպզ֩֩րְ֤հֲտ֦֏ռս", (byte)109, 69);
               ZKM_STR_B[11] = NLoginCore_324.D("ԿճմՐՎջԴ՛ՆԶլՀԾՕԿՄխղբՄՖՄՁցՆՠհ\u058c֍Ս՝՟", (byte)109, 68);
               ZKM_STR_B[12] = NLoginCore_453.A("ƢƣƍƏƓǌƦǍƓƒǌǔƛƪƿǏǃƹƲǖǣǄǒƴǔƾǉǧǌƸǮǝǲǮǂǦǦƭƶǆǇǜƷǁ", (byte)109, 65);
               ZKM_STR_B[13] = NLoginCore_027.C("ՉՆՒՕՉջծՏհ՟ՇՀԽՏՑդֆմՆտևոՏՐ", (byte)109, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.C("ղՅաՃծիՖՒնթճՑ՚Խկբ՝կսղփպի\u058cօՠՙՍզխ֔բ", (byte)109, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.C("կՐՅյՒՇԳՒթճ\u0557Օ\u0557ՖտՄպՀմՇՆրսնֆ՞եզՎՐհՎ", (byte)109, 67);
         }
      }
   }

   public static boolean U() {
      YamlConfiguration var0 = a();
      if (var0 == null) {
         return (u != 0);
      } else {
         return ((!var0.getBoolean(a(v, w ^ x) != 0)) && !var0.getBoolean(a(y, z ^ aa)) ? ac : ab);
      }
   }
}
