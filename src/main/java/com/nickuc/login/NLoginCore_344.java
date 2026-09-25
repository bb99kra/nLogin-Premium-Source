package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketListenerAbstract;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_344 extends PacketListenerAbstract {
   private static long ag = Long.reverse(-8712676874222968007L);
   private static long y = Long.reverse(-8712676874222968007L);
   private static String[] ZKM_STR_B = new String[NLoginCore_344.am];
   private static long o = Long.reverse(-1651032658506030279L);
   private static int f = Integer.reverse(-1);
   private static String[] ZKM_STR_A = new String[NLoginCore_344.al];
   private static int ac = Integer.reverse(-1879048192);
   private static int b = Integer.reverse(0);
   private static int n = 134217728 >>> 89 | 134217728 << ~89 + 1;
   private static long c;
   private static long ai = Long.reverse(-1651032658506030279L);
   private static int k = Integer.reverse(-1073741824);
   private static int z = Integer.reverse(268435456);
   private static long j = Long.reverse(-8712676874222968007L);
   private static long d = Long.reverse(-8712676874222968007L);
   private static long p = Long.reverse(7926335344172072960L);
   private static int am = 201326592 >>> 88 | 201326592 << -88;
   private static int ah = (90112 >>> 205 | 90112 << -205) & -1;
   private static int q = Integer.reverse(-1610612736);
   private static int x = Integer.reverse(-536870912);
   private static int c = (-1 >>> 86 | -1 << ~86 + 1) & -1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long m = Long.reverse(7926335344172072960L);
   private static int ak = 0 >>> 226 | 0 << ~226 + 1;
   private static int u = 16777216 >>> 152 | 16777216 << -152;
   private static long aj = Long.reverse(7926335344172072960L);
   private static long ae = Long.reverse(-8712676874222968007L);
   private static int i = -1 >>> 189 | -1 << -189;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int af = (20 >>> 129 | 20 << ~129 + 1) & -1;
   private static int aa = Integer.reverse(-1);
   private static long s = Long.reverse(7926335344172072960L);
   private static int h = Integer.reverse(1073741824);
   private static int v = Integer.reverse(1610612736);
   private static int ad = -1 >>> 67 | -1 << ~67 + 1;
   private static int al = Integer.reverse(805306368);
   private static long g = Long.reverse(-8712676874222968007L);
   private static long r = Long.reverse(-1651032658506030279L);
   private static int t = Integer.reverse(0);
   private static long ab = Long.reverse(-8712676874222968007L);
   private static long l = Long.reverse(-1651032658506030279L);
   private static long w = Long.reverse(-8712676874222968007L);

   public void onPacketSend(PacketSendEvent var1) {
      if (!var1.isCancelled()) {
         try {
            NLoginInterface_043 var2 = (NLoginInterface_043)NLoginCore_581.b(this.b).get(var1.getPacketType());
            if (var2 != null) {
               var2.a(var1);
            }
         } catch (Throwable var5) {
            var1.setCancelled((u != 0));
            ChannelHelper.close(var1.getChannel());
            User var3 = var1.getUser();
            String var4 = a(v, w) + var1.getServerVersion() + (var3 != null ? a(x, y) + var3.getClientVersion() : a(z & aa, ab));
            NLoginCore_370.c(a(ac & ad, ae) + var1.getPacketType() + a(af, ag) + var4 + a(ah, ai ^ aj), var5);
         }
      }
   }

   private static void b() {
      c = -7149547186137962345L;
      long var0 = c ^ -1914221844697420519L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(67 + 2),
               (byte)(11 + 72),
               (byte)(35 + 12),
               (byte)(66 + 1),
               (byte)(26 + 40),
               (byte)(59 + 8),
               (byte)(37 + 10),
               (byte)(17 + 63),
               (byte)(29 + 46),
               (byte)(53 + 14),
               (byte)(54 + 29),
               53,
               (byte)(41 + 39),
               (byte)(30 + 67),
               (byte)(91 + 9),
               (byte)(33 + 67),
               105,
               (byte)(16 + 94),
               (byte)(5 + 98)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_433.D("яЭжїѥљяѴѲѾѾгѹѠя҆҄ѾѷѼџѹѐё", (byte)24, 68);
               ZKM_STR_B[1] = NLoginCore_453.E("ՅԊԸՌԾՊԛԝԬՆԮԵՏԓ\u0530ԺԏՐ՝ՏԾՠԧԨ", (byte)24, 69);
               ZKM_STR_B[2] = NLoginCore_530.E("ՃԤՍՆԏԋԮԔԞԯԎԜ", (byte)24, 69);
               ZKM_STR_B[3] = NLoginCore_110.E("ՀԬԋԫԙԬ\u0530ՇՄՒԔՈԒԷԭԮՅՆԱՒՀԾԫԼԻԡ\u0530ՀԻԤԳԹԟՙԥՇղզՎՄԾշԱխԸԹՋԲ\u0558ԺէձհհՇՈ", (byte)24, 69);
               ZKM_STR_B[4] = NLoginCore_453.A("æġğĞêĪýùçĐĂ÷", (byte)24, 65);
               ZKM_STR_B[5] = NLoginCore_183.C("жѵѪѶэлѵизѳќх", (byte)24, 67);
               ZKM_STR_B[6] = NLoginCore_521.B("āßèĉėċāĦĤİİåīĒāĸĶİĩĮđīĂă", (byte)24, 66);
               ZKM_STR_B[7] = NLoginCore_384.B("ĠåēħęĥöøćġĉĐĪîċĕêīĸĪęĻĂă", (byte)24, 66);
               ZKM_STR_B[8] = NLoginCore_223.C("ѬэѶѯидїнчјзх", (byte)24, 67);
               ZKM_STR_B[9] = NLoginCore_471.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҐћѶѮѼќѝңѷѶҝҩѰѱ", (byte)24, 68);
               ZKM_STR_B[10] = NLoginCore_110.D("дѯѭѬиѸычеўѐх", (byte)24, 68);
               ZKM_STR_B[11] = NLoginCore_127.F("ԍՌՁՍԤԒՌԏԎՊԳԜ", (byte)24, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.C("яЭжїѥљяѴѲѾѾьёѲѴѴтѳѹїѹ҉ѐё", (byte)24, 67);
               ZKM_STR_B[1] = NLoginCore_092.D("ѮгѡѵѧѳфцѕѯѕѵѓыѼзѹіўлѦ҉ѐё", (byte)24, 68);
               ZKM_STR_B[2] = NLoginCore_433.E("ԨԭԦԸԊՆԽԳԐԮՅԜ", (byte)24, 69);
               ZKM_STR_B[3] = NLoginCore_110.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѧєѥѤъљѩѤэќѢш҂юѰқҏѷѭѧҠљҔҠқѸѺҝѧѰѤ҇ҩѰѱ", (byte)24, 68);
               ZKM_STR_B[4] = NLoginCore_141.E("ԛԇԭԎՎԜԼՎԱԵԫԜ", (byte)24, 69);
               ZKM_STR_B[5] = NLoginCore_530.D("ѱѠѷљѶюѪхѓѪѠх", (byte)24, 68);
               ZKM_STR_B[6] = NLoginCore_530.C("яЭжїѥљяѴѲѾҁҁѱѶѽѴіѧ҃ѱї҉ѐё", (byte)24, 67);
               ZKM_STR_B[7] = NLoginCore_183.F("ՅԊԸՌԾՊԛԝԬՆԮԎԪԤՖՙՙ՝՛՚ՕՐԧԨ", (byte)24, 70);
               ZKM_STR_B[8] = NLoginCore_138.D("ыыжЯѲјєчѱјѾх", (byte)24, 68);
               ZKM_STR_B[9] = NLoginCore_241.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҎѹѼѭѷѠѦѳҡҀѳ҃Ѱѱ", (byte)24, 68);
               ZKM_STR_B[10] = NLoginCore_091.C("ѩѪыЯіщђкћѾьх", (byte)24, 67);
               ZKM_STR_B[11] = NLoginCore_427.A("ĉûþĪĞĈĮĐħíĂ÷", (byte)24, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.F("ԾՎԹՈԮԯՔԏԢՌԏԣԳԸԖ՛ԮԐՀԷԓՠԧԨ", (byte)24, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_173.F("ԕԄԁԊ\u0530ԻԟԯԾՆՅՁԷ՚ԑԲՊ՚՜ՙԓՓՐԲ՝ՁՏԧՒԤԶե", (byte)24, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_344.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.F("ԳՕ\u0557Է՛պղֈմՃցշօտՈխ֏֎ֆ\u058cֆ՛", (byte)79, 70), NLoginCore_344.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_451.A("ƀƍƌŏƏƋƆƏƚƉŖƔƘƑƔƚŜӨӢӹӚӨӱӈӱӨӴӺӹӍӾŶ", (byte)79, 65) + var1 + NLoginCore_530.F("Յ", (byte)79, 70) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_344(NLoginCore_581 var1) {
      this.b = var1;
   }

   public void onPacketReceive(PacketReceiveEvent var1) {
      if (!var1.isCancelled()) {
         try {
            NLoginInterface_003 var2 = (NLoginInterface_003)NLoginCore_581.a(this.b).get(var1.getPacketType());
            if (var2 != null) {
               var2.a(var1);
            }
         } catch (Throwable var5) {
            var1.setCancelled((a != 0));
            ChannelHelper.close(var1.getChannel());
            User var3 = var1.getUser();
            String var4 = a(b & c, d) + var1.getServerVersion() + (var3 != null ? a(e & f, g) + var3.getClientVersion() : a(h & i, j));
            NLoginCore_370.c(a(k, l ^ m) + var1.getPacketType() + a(n, o ^ p) + var4 + a(q, r ^ s), var5);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 118L;
      var1 ^= -1914221844697420519L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(32 + 37),
                     (byte)(26 + 57),
                     (byte)(26 + 21),
                     (byte)(49 + 18),
                     (byte)(32 + 34),
                     (byte)(55 + 12),
                     (byte)(5 + 42),
                     (byte)(27 + 53),
                     (byte)(37 + 38),
                     (byte)(11 + 56),
                     (byte)(42 + 41),
                     53,
                     (byte)(23 + 57),
                     (byte)(47 + 50),
                     (byte)(39 + 61),
                     (byte)(75 + 25),
                     (byte)(69 + 36),
                     (byte)(19 + 91),
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.E("՚էզԩթեՠթմգ\u0530ծղիծմԶࣂࢼ࣓ࢴࣂ࣋ࢢ࣋ࣂ࣓࣎ࣔࢧࣘ", (byte)59, 69));
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
}
