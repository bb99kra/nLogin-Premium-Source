package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NLoginCore_313 {
   private static long au = Long.reverse(-2594073385365405696L);
   private static long d = Long.reverse(-9093312923355274133L);
   private static int y = Integer.reverse(536870912);
   private final KeyPair b;
   private static long ah = Long.reverse(6759357764988871787L);
   private static int ap = (2048 >>> 106 | 2048 << ~106 + 1) & -1;
   private static final Method n;
   private final NLoginType_008 y;
   private static int ai = (12582912 >>> 118 | 12582912 << -118) & -1;
   private static long e = Long.reverse(-2594073385365405696L);
   private static int ak = -1 >>> 235 | -1 << ~235 + 1;
   private static int f = Integer.reverse(2097152);
   private static String[] b = new String[NLoginCore_313.l];
   private static long at = Long.reverse(-9093312923355274133L);
   private static int m = Integer.reverse(1073741824);
   private static int as = Integer.reverse(-1879048192);
   private static int ad = Integer.reverse(-1);
   private static String[] a = new String[NLoginCore_313.k];
   private static final Method o;
   public final NLoginCore_010 a = new NLoginCore_010(this, null);
   private static int u = (-1 >>> 198 | -1 << ~198 + 1) & -1;
   private static int aj = Integer.reverse(-536870912);
   private static int k = 20971520 >>> 53 | 20971520 << ~53 + 1;
   private static int h = (524288 >>> 51 | 524288 << -51) & -1;
   private static int b = 0 >>> 245 | 0 << -245;
   private static long j = Long.reverse(6759357764988871787L);
   private static int l = 5120 >>> 169 | 5120 << ~169 + 1;
   private static int r = Integer.reverse(0);
   private static int g = (64 >>> 130 | 64 << -130) & -1;
   private static int ab = (33554432 >>> 153 | 33554432 << ~153 + 1) & -1;
   private static int an = Integer.reverse(-1);
   private static int q = Integer.reverse(1073741824);
   private static long n = Long.reverse(6759357764988871787L);
   private static long c;
   private static int w = Integer.reverse(536870912);
   private static int ac = Integer.reverse(-1610612736);
   private static int i = (-1 >>> 232 | -1 << -232) & -1;
   private static int a = Integer.reverse(0);
   private static int t = (6144 >>> 11 | 6144 << -11) & -1;
   private static long al = Long.reverse(6759357764988871787L);
   private static long aa = Long.reverse(-2594073385365405696L);
   private final nLoginBukkit t;
   private static long v = Long.reverse(6759357764988871787L);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int ar = (65536 >>> 240 | 65536 << ~240 + 1) & -1;
   private static int ag = Integer.reverse(1610612736);
   @Generated
   private static final Logger c = LoggerFactory.getLogger(NLoginCore_313.class);
   private static int aq = (0 >>> 166 | 0 << -166) & -1;
   private static int o = (1073741824 >>> 94 | 1073741824 << -94) & -1;
   private static int p = (0 >>> 227 | 0 << ~227 + 1) & -1;
   private static int af = Integer.reverse(1073741824);
   private static long ae = Long.reverse(6759357764988871787L);
   private static int am = Integer.reverse(268435456);
   private static long z = Long.reverse(-9093312923355274133L);
   private static final String bX = a(m, n);
   public final NLoginCore_172 a = new NLoginCore_172(this, null);
   private static long ao = Long.reverse(6759357764988871787L);
   private static int x = Integer.reverse(0);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_313.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.A("»Ýß¿ãĂúĐüËĉÿčćÐõėĖĎĔĎã", (byte)10, 65), NLoginCore_313.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.D("жутЅхсмхѐпЌъючъѐВޕޙޥޙެތޭދިީ\u07b5ޮޘЫ", (byte)10, 68) + var1 + NLoginCore_092.A("Í", (byte)10, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      Method var1 = null;
      Class var10000 = SpigotReflectionUtil.NETWORK_MANAGER_CLASS;
      Class[] var10003 = new Class[o];
      var10003[p] = SecretKey.class;
      Method var0;
      if ((var0 = NLoginCore_546.a(var10000, null, null, var10003)) == null) {
         var10000 = SpigotReflectionUtil.NETWORK_MANAGER_CLASS;
         var10003 = new Class[q];
         var10003[r] = Cipher.class;
         var10003[s] = Cipher.class;
         var0 = NLoginCore_546.a(var10000, null, null, var10003);
         if (var0 == null) {
            throw new IllegalArgumentException(a(t & u, v));
         }

         String[] var4 = new String[w];
         var4[x] = a(y, z ^ aa);
         var4[ab] = a(ac & ad, ae);
         var4[af] = a(ag, ah);
         var4[ai] = a(aj & ak, al);
         Class var2 = NLoginCore_049.a(var4);
         if (var2 == null) {
            throw new IllegalArgumentException(a(am & an, ao));
         }

         var10003 = new Class[ap];
         var10003[aq] = int.class;
         var10003[ar] = Key.class;
         var1 = NLoginCore_546.a(var2, null, null, var10003);
         if (var1 == null) {
            throw new IllegalArgumentException(a(as, at ^ au));
         }
      }

      n = var0;
      o = var1;
   }

   public NLoginCore_313(nLoginBukkit var1) {
      this(var1, var1.a(), a(var1.a()));
   }

   private static void a(User var0, WrapperLoginClientLoginStart var1, String var2) {
      if (var2.length() > g) {
         throw new IllegalArgumentException(a(h & i, j) + var2);
      } else {
         var0.receivePacketSilently(
            new WrapperLoginClientLoginStart(
               var1.getClientVersion(), var1.getUsername(), (SignatureData)var1.getSignatureData().orElse(null), (UUID)var1.getPlayerUUID().orElse(null)
            )
         );
      }
   }

   @Generated
   private NLoginCore_313(nLoginBukkit var1, NLoginType_008 var2, KeyPair var3) {
      this.t = var1;
      this.y = var2;
      this.b = var3;
   }

   private static void b() {
      c = -3015986951711329407L;
      long var0 = c ^ 6220809453999484365L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(30 + 38),
               (byte)(31 + 38),
               (byte)(11 + 72),
               (byte)(6 + 41),
               (byte)(2 + 65),
               (byte)(45 + 21),
               (byte)(48 + 19),
               (byte)(32 + 15),
               80,
               (byte)(10 + 65),
               (byte)(8 + 59),
               83,
               (byte)(19 + 34),
               (byte)(65 + 15),
               (byte)(43 + 54),
               (byte)(68 + 32),
               (byte)(19 + 81),
               (byte)(21 + 84),
               (byte)(101 + 9),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_384.D("ԺԀԦԳԕԡԣՈԭԤԤԑՅԋՀԦՖԳՄՑԜՑԨՏԠԺԘԣԾՖԵՑՖԡԿԵԷ՜ՌԦՊՂլԷ", (byte)94, 68);
               b[1] = NLoginCore_384.C("ԟԗԥԫԋԵՄԽՄԱԻԫԑՊՖԭՈԺԒԣՉԔԝԱԜԽՔԣդԡԸԟԱԥԼԿՠԫԤՙԯԹԪզ՞ՁԾԴԴդճՎԴիՂՃ", (byte)94, 67);
               b[2] = NLoginCore_530.A("ƥƓƦũƍŴƭƄƓƏƖƃ", (byte)94, 65);
               b[3] = NLoginCore_201.E("֓Ջժի֏֚֘իէխՏլև։֙փիռ֓կ֧էէշատ֘֞ջևւ֭ճֲ֣֬֟ճֵ֦յֳ֛֦֒֘\u058c֚֚ջ֡վֺּֿ֦֧֛֝֝֫֙֊ֽ", (byte)94, 69);
               b[4] = NLoginCore_575.B("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽƾƂƈƶƊƼƠưǁǆǄƌƽǕƩǃƬǆǉƜǐǇƯƝƹƘǐǅƹƷƠƾǗƮƯ", (byte)94, 66);
               b[5] = NLoginCore_076.C("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ\u0557ԔԝԾՊԞաՀԲՕեթԣէբՁԧ\u0557ԼԼ՟հԷ", (byte)94, 67);
               b[6] = NLoginCore_559.A("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽǃƀƉƪƶƊǍƬƞǁǑǏƫƍƳƐƫƭƍƬƯǐƣ", (byte)94, 65);
               b[7] = NLoginCore_223.D("ԞԑԧԁԟԿԌԌԚԮՒԣՑՇՈԩԔԕԬԚ՜ԜՖ՝ՐՕ\u0558բԞՅՑԣզՅԺ՟ՊժՋԽՍղՂԷ", (byte)94, 68);
               b[8] = NLoginCore_232.E("֓Ջժի֏֚֘իէխ՜։ո՛֕ջհ֢֞֒֞ջ֘ղթֈ֭շ֧֑֠֨֡\u058b֏կ֖ց֔քַ֧մָ֕֏ֱׅ֯֔֙֡֯֠֍֎", (byte)94, 69);
               b[9] = NLoginCore_553.C("ՈԀԟԠՄՍՏԠԜԢԒՂԥԲԑԷ\u0530ԶՂՍԙՕՉԟՕՀԟդՄԯԻԡՇԱՄզԧեաԺ՟\u0530՚՝Գ՞՟ՖՊՎԬՑչիժԾԾ՛\u0557Ք՝ՖաեմևՕ՚եՉժ\u0590ժջ։ւըըվիշ֕եՙ֛֝բգ", (byte)94, 67);
               break;
            case 1:
               b[0] = NLoginCore_397.E("օՋձվՠլծ֓ոկկ՜\u0590Ֆ\u058bձ֡վ֏֜է֜ճ֚իօգծ։֡ր֜րֵ֤֕\u058b֙֍ոպ\u0590֏֯\u058bֱֵ֖֚֜րֺ֥\u0590֍֎", (byte)94, 69);
               b[1] = NLoginCore_076.C("ԟԗԥԫԋԵՄԽՄԱԻԫԑՊՖԭՈԺԒԣՉԔԝԱԜԽՔԣդԡԸԟԱԥԼԿՠԫԤՙԯԹԩՌղթՍհլպ՚ՙ\u0557ջՂՃ", (byte)94, 67);
               b[2] = NLoginCore_127.F("վՓվմնթշքռի\u0558բ", (byte)94, 70);
               b[3] = NLoginCore_232.B("ƴŬƋƌưƹƻƌƈƎŰƍƨƪƺƤƌƝƴƐǈƈƈƘƂƠƹƿƜƨƣǎƔǓǍǀǄƔǖǇƖƳƼǇǔƹƭƻƻƜǂƟǇǆǉǘǊǊƶƪǨǰƱǱ", (byte)94, 66);
               b[4] = NLoginCore_387.B("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽƾƂƈƶƊƼƠưǁǆǄƌƽǕƩǃƬǆǉƜǐǆƳǠƭƝǝƺǞǎǥǦƻǉǨǂƽǆǦƻƨǯƱ", (byte)94, 66);
               b[5] = NLoginCore_110.C("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ\u0557ԔԝԾՊԞաՀԲՕե\u0530ԾՠՠԩԬԪԾկԫլԷ", (byte)94, 67);
               b[6] = NLoginCore_387.D("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ\u0557ԔԝԾՊԞաՀԲՕե՟ՒեԹՍ՜ՅհԮկթծճՔԮԴՆՖԬԻՆՅՂՃ", (byte)94, 68);
               b[7] = NLoginCore_201.A("ƊŽƓŭƋƫŸŸƆƚƾƏƽƳƴƕƀƁƘƆǈƈǂǉƼǁǄǎƊƱƽƏƎƨǂǔƕƙǄƶƼƮǐƣ", (byte)94, 65);
               b[8] = NLoginCore_127.D("ՈԀԟԠՄՍՏԠԜԢԑԾԭԐՊ\u0530ԥՓ\u0557ՇՓ\u0530ՍԧԞԽբԬ՜ՆՕ՝ՖՀՄԤՋԶՉԹլ՜ԩՅՅՂժՑՑԲ\u0530ՈՔժթՐՐսգՂՐխՙՑ", (byte)94, 68);
               b[9] = NLoginCore_092.F("֓Ջժի֏֚֘իէխ՝֍հս՜ւջց֍֘դ֠֔ժ֠\u058bժ֯֏պֆլ֒ռ֏ֱղְ֬օ֪ջ֥֨վ֪֩֡֕֙շֵֶ֜ׄ։։ְֿ֦֢֟֨֡֬גְֵ֥֠֔כֵ׆ד֪֕לֽןםֶׇ֭֮׀֭֮", (byte)94, 70);
               break;
            case 2:
               b[0] = NLoginCore_141.E("ՓՏՒՈՖշօ֘փ\u0558֝հլ֕֟փ\u058cդ֢՜֖֑֠֝֟֜խ֢֚֡֠դ", (byte)94, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.B("ŲƮƊƑƂŵƤŴƑưƬŵźƟƣƽƣƳƕƞƕƑƎƏ", (byte)94, 66);
         }
      }
   }

   private static KeyPair a(Server var0) {
      KeyPair var1 = null;
      Object var2 = SpigotReflectionUtil.getMinecraftServerInstance(var0);
      if (var2 != null) {
         Field var3 = NLoginCore_546.a(SpigotReflectionUtil.MINECRAFT_SERVER_CLASS, KeyPair.class, a);
         if (var3 != null) {
            try {
               var1 = (KeyPair)var3.get(var2);
            } catch (ReflectiveOperationException var5) {
               throw new RuntimeException(a(b, d ^ e), var5);
            }
         }
      }

      if (var1 == null) {
         var1 = NLoginCore_496.a(f);
      }

      return var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 59L;
      var1 ^= 6220809453999484365L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(44 + 25),
                     (byte)(58 + 25),
                     47,
                     (byte)(19 + 48),
                     (byte)(26 + 40),
                     (byte)(56 + 11),
                     (byte)(29 + 18),
                     (byte)(45 + 35),
                     (byte)(24 + 51),
                     (byte)(24 + 43),
                     (byte)(56 + 27),
                     (byte)(52 + 1),
                     (byte)(29 + 51),
                     (byte)(28 + 69),
                     (byte)(23 + 77),
                     (byte)(30 + 70),
                     (byte)(70 + 35),
                     110,
                     (byte)(47 + 56)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.E("Ւ՟՞ԡա՝\u0558ալ՛ԨզժգզլԮࢱࢵࣁࢵࣈࢨࣉࢧࣄࣅ࣑࣊ࢴ", (byte)51, 69));
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
