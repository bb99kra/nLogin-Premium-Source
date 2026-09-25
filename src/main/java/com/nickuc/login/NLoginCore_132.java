package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.PluginMessageEvent;
import com.velocitypowered.api.event.connection.PluginMessageEvent.ForwardResult;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.ChannelMessageSource;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
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

public class NLoginCore_132 implements NLoginInterface_029 {
   private static long j = Long.reverse(8757523747099293617L);
   private static int h = Integer.reverse(0);
   private static int y = (224 >>> 37 | 224 << -37) & -1;
   private static int v = Integer.reverse(1610612736);
   private static int e = 16777216 >>> 56 | 16777216 << ~56 + 1;
   private static long l = Long.reverse(8757523747099293617L);
   private static long c;
   private static long ac = Long.reverse(8757523747099293617L);
   private static long g = Long.reverse(8757523747099293617L);
   private static int q = Integer.reverse(-1610612736);
   private static long s = Long.reverse(8757523747099293617L);
   private static String[] ZKM_STR_A = new String[NLoginCore_132.t];
   private static int f = -1 >>> 100 | -1 << ~100 + 1;
   private static int m = Integer.reverse(536870912);
   private static long d = Long.reverse(3170534137668829184L);
   private static int ab = (134217728 >>> 248 | 134217728 << ~248 + 1) & -1;
   public static final ChannelIdentifier b = MinecraftChannelIdentifier.create(a(y & NLoginCore_132.z, NLoginCore_132.aa), a(ab, ac));
   private static int i = Integer.reverse(1073741824);
   private static long aa = Long.reverse(8757523747099293617L);
   private static long w = Long.reverse(6163450361733887921L);
   private static int z = -1 >>> 78 | -1 << ~78 + 1;
   private static int r = Integer.reverse(-1);
   private static int p = 0 >>> 15 | 0 << -15;
   private final nLoginVelocity d;
   private static long b = Long.reverse(6163450361733887921L);
   private static int t = (576 >>> 198 | 576 << ~198 + 1) & -1;
   public static final ChannelIdentifier a = new LegacyChannelIdentifier(a(v, w ^ NLoginCore_132.x));
   private static int a = Integer.reverse(0);
   private static int k = Integer.reverse(-1073741824);
   private static long o = Long.reverse(3170534137668829184L);
   private static long n = Long.reverse(6163450361733887921L);
   private static String[] ZKM_STR_B = new String[NLoginCore_132.u];
   private static long x = Long.reverse(3170534137668829184L);
   private static int u = Integer.reverse(-1879048192);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_132.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.B("Õ÷ùÙýĜĔĪĖåģęħġêďıİĨĮĨý", (byte)23, 66), NLoginCore_132.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.C("ѝѪѩЬѬѨѣѬѷѦгѱѵѮѱѷй\u07bfߎߐߓߓߓߗߛߕߏߛޱ\u07b7ߗߔє", (byte)23, 67) + var1 + NLoginCore_173.A("ç", (byte)23, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_132(nLoginVelocity var1) {
      this.d = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 52L;
      var1 ^= 3886801087303851852L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(54 + 15),
                     (byte)(42 + 41),
                     (byte)(7 + 40),
                     (byte)(35 + 32),
                     66,
                     (byte)(57 + 10),
                     (byte)(4 + 43),
                     (byte)(45 + 35),
                     (byte)(60 + 15),
                     67,
                     (byte)(46 + 37),
                     (byte)(48 + 5),
                     (byte)(68 + 12),
                     (byte)(87 + 10),
                     (byte)(25 + 75),
                     (byte)(80 + 20),
                     (byte)(50 + 55),
                     (byte)(51 + 59),
                     (byte)(88 + 15)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(51 + 32)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.D("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߅ߔߖߙߙߙߝߡߛߕߡ\u07b7\u07bdߝߚ", (byte)25, 68));
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

   static {
      b();
   }

   @Subscribe
   public void a(PluginMessageEvent var1) {
      if (var1.getResult().isAllowed()) {
         ChannelMessageSource var2 = var1.getSource();

         try {
            ChannelIdentifier var3 = var1.getIdentifier();
            if (var3.equals(this.d.b()) || var3.equals(this.d.a())) {
               var1.setResult(ForwardResult.handled());
               if (!(var2 instanceof ServerConnection)) {
                  if (var2 instanceof Player) {
                     Player var9 = (Player)var2;
                     var9.disconnect(NLoginCore_529.a(a(a, b ^ d)));
                     NLoginCore_370.c(var9.getUsername() + a(e & f, g));
                  }

                  return;
               }

               NLoginCore_277 var8 = this.d.b().a(var1.getTarget());
               String var5 = ((ServerConnection)var2).getServer().getServerInfo().getName();
               byte[] var6 = var1.getData();
               this.d.a().a(var8, var5, var6);
            } else if (var3.equals(b) || var3.equals(a)) {
               NLoginCore_033 var4 = this.d.a().b().a();
               if (var4 == null) {
                  return;
               }

               if (!(var2 instanceof Player)) {
                  return;
               }

               if (var4.a().a(this.d.b().a(var2), var1.getData())) {
                  var1.setResult(ForwardResult.handled());
               }
            }
         } catch (Throwable var7) {
            NLoginCore_370.c(a(i, j) + var1.getClass().getSimpleName() + a(k, l) + var2 + a(m, n ^ o), var7);
            var1.setResult(ForwardResult.handled());
            if (var2 instanceof Player) {
               ((Player)var2).disconnect(NLoginCore_529.a(a(q & r, s)));
            }
         }
      }
   }

   private static void b() {
      c = -8219799828144647766L;
      long var0 = c ^ 3886801087303851852L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               (byte)(16 + 53),
               (byte)(8 + 75),
               (byte)(30 + 17),
               (byte)(14 + 53),
               (byte)(28 + 38),
               (byte)(28 + 39),
               (byte)(15 + 32),
               (byte)(2 + 78),
               (byte)(29 + 46),
               (byte)(36 + 31),
               (byte)(34 + 49),
               (byte)(10 + 43),
               (byte)(46 + 34),
               (byte)(93 + 4),
               (byte)(52 + 48),
               100,
               105,
               (byte)(96 + 14),
               (byte)(75 + 28)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.A("ŴŊŎŋţůƅŮžƖƔŴƂƐƏŚŕŵűřųŮƗƓżƥšƔƉźƀƓƖƀūƜơƲƎƦŮƈƣƁƇƓƆƣƜƏƞƪƔƿƞƫƝƍưƣƑƆƄƣƔƃƼƍǐƺƒƨƳǉƟƫƩǑǍƹǜƔǗƽǗƩƦƧ", (byte)74, 65);
               ZKM_STR_B[1] = NLoginCore_575.E("Վ՝նլԼՐւճՇբ՚ջյՌ֎՞ՏբրգՋմՔՓֈք֘ջՖֆ֒զղչ՟ս՚օպ֏֖ը։֦են֚֎ւ֏ջձ\u058c֊ֲֺ֢֪֡։\u058cնֹ֚֮֎ָׂ֛֭֜֎ֽպ֚֝֠\u05cdտ֞\u05cd֤֜׆֚ׄ֜֙", (byte)74, 69);
               ZKM_STR_B[2] = NLoginCore_027.F("ՎթոՙաՑճԽպ՛մՁւշՌռ՛՚ի\u058bջ\u0590ղշ\u0557֗ոպլՔթ\u058b", (byte)74, 70);
               ZKM_STR_B[3] = NLoginCore_446.E("Սշ՟տմՀ\u0557ջյՔ՟Ֆօի՜֏\u0558֍ՙ՞ճւՙ՚", (byte)74, 69);
               ZKM_STR_B[4] = NLoginCore_232.F("շաՐձԺ՚բծՓէՈՎ", (byte)74, 70);
               ZKM_STR_B[5] = NLoginCore_397.A("ňŢōŗƐƎşťŊŢƓƋŦƎŻŵƐƇŝŜƑƊŪŵŶŭŘƕŦƤžƈŬźƇơƎƀƉžưƓơƐƉūƏŶƙŸƍƝǁƪƛƽǃƳƣǃǃƦƕƙƢǍǅǄǎƃƱǉƊƓƭǋǌǆǏƪƧǏƩƺƜƗƔƯǑǓǆǓǞǓƠǨ", (byte)74, 65);
               ZKM_STR_B[6] = NLoginCore_530.E("\u0558ջչկ՜ՄՓոՁցԻեՂբրժՁՈւ՞փ֒ՙ՚", (byte)74, 69);
               ZKM_STR_B[7] = NLoginCore_575.E("ոծԿ՚Հ՛ԼՒբ՛ճՎ", (byte)74, 69);
               ZKM_STR_B[8] = NLoginCore_091.D("ӇԇӨӌԄӬӳӲӮӽӪӛ", (byte)74, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_092.A("ŴŊŎŋţůƅŮžƖƔŴƂƐƏŚŕŵűřųŮƗƓżƥšƔƉźƀƓƖƀūƜơƲƎƦŮƈƣƁƇƓƆƣƜƏƞƪƔƿƞƫƝƍưƣƑƆƄƣƔƃƼƍǐƺƒƨƳǉơǘǊƖưƱǈǎƭƝƝƗƻƛƬƜƳƻƶǂǃǥ", (byte)74, 65);
               ZKM_STR_B[1] = NLoginCore_446.E(
                  "Վ՝նլԼՐւճՇբ՚ջյՌ֎՞ՏբրգՋմՔՓֈք֘ջՖֆ֒զղչ՟ս՚օպ֏֖ը։֦են֚֎ւ֏ջձ\u058c֊ֲֺ֢֪֡։\u058cնֹ֚֮֎ָׂ֛֭֜֎ֽպ֛֡\u05c9ׇָֺ֪֗֜\u05cbְ֚֜֙", (byte)74, 69
               );
               ZKM_STR_B[2] = NLoginCore_397.E("ՎթոՙաՑճԽպ՛մՁւշՌռ՛՚ի\u058bջևցկդֈֆ֔֘՚՝֞", (byte)74, 69);
               ZKM_STR_B[3] = NLoginCore_173.B("ŚƄŬƌƁōŤƈƂšŪőƏŦũŧŸũśƓŭƟŦŧ", (byte)74, 66);
               ZKM_STR_B[4] = NLoginCore_232.A("ŻŗŹŎŇƒũƋņƎŕś", (byte)74, 65);
               ZKM_STR_B[5] = NLoginCore_232.E(
                  "ԻՕՀՊփցՒ\u0558ԽՕֆվՙցծըփպՐՏքս՝ըթՠՋֈՙ֗ձջ՟խպ֔ցճռձ֣ֆ֔փռ՞ւթ\u058cիր\u0590ִ֝֎ְֶֶֶ֦֖֙ֈ\u058c֕׀ַָׁնּ֤սֆ֠־ֹֿׂׂ֚֭֝֜֏ֆֱ֢\u0590\u05c8ִ֖\u05cdֵֽׅחמֽ֚מִךוֱ֮֡֠",
                  (byte)74,
                  69
               );
               ZKM_STR_B[6] = NLoginCore_575.B("ťƈƆżũőŠƅŎƎŕƃŘűŬƅŷśŹŰŠƏŦŧ", (byte)74, 66);
               ZKM_STR_B[7] = NLoginCore_446.E("ըխց՞գջշ\u0558վևօէտէ\u0557ծտՊ֍ֈփւՙ՚", (byte)74, 69);
               ZKM_STR_B[8] = NLoginCore_553.A("ŨŗŜţƑŞŦŅƉŎƄś", (byte)74, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.F("ջԿՎջՒփՠչփհՉ։Խ\u0557թդ՟՟֑ևփ՜ՙ՚", (byte)74, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_471.D("ӕӟӯӣӡӌӣԈԉӰӲԕԅӯԑԘԌӻӪԚӛӹӦӧ", (byte)74, 68);
         }
      }
   }
}
