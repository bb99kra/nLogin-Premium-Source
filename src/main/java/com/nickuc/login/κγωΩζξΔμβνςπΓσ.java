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

public class κγωΩζξΔμβνςπΓσ extends PacketListenerAbstract {
   private static long ag = Long.reverse(-8712676874222968007L);
   private static long y = Long.reverse(-8712676874222968007L);
   private static String[] b = new String[κγωΩζξΔμβνςπΓσ.am];
   private static long o = Long.reverse(-1651032658506030279L);
   private static int f = Integer.reverse(-1);
   private static String[] a = new String[κγωΩζξΔμβνςπΓσ.al];
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
            μθοδηοΠνΦΛνξΛ var2 = (μθοδηοΠνΦΛνξΛ)γξτΩΛχΣΓπμΠσΓγφ.b(this.b).get(var1.getPacketType());
            if (var2 != null) {
               var2.a(var1);
            }
         } catch (Throwable var5) {
            var1.setCancelled((boolean)u);
            ChannelHelper.close(var1.getChannel());
            User var3 = var1.getUser();
            String var4 = c<"㺀">(v, w) + var1.getServerVersion() + (var3 != null ? c<"㺃">(x, y) + var3.getClientVersion() : c<"㺆">(z & aa, ab));
            ψΓωτιμωκχψΛΨ.c(c<"㺉">(ac & ad, ae) + var1.getPacketType() + c<"㺌">(af, ag) + var4 + c<"㺏">(ah, ai ^ aj), var5);
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
               b[0] = φδχεθοκψαλΛογλ.D("яЭжїѥљяѴѲѾѾгѹѠя҆҄ѾѷѼџѹѐё", (byte)24, 68);
               b[1] = φΨαξωυθανΣφυκη.E("ՅԊԸՌԾՊԛԝԬՆԮԵՏԓ\u0530ԺԏՐ՝ՏԾՠԧԨ", (byte)24, 69);
               b[2] = θεωψξβΛσσ.E("ՃԤՍՆԏԋԮԔԞԯԎԜ", (byte)24, 69);
               b[3] = ντθΔζβΔζ.E("ՀԬԋԫԙԬ\u0530ՇՄՒԔՈԒԷԭԮՅՆԱՒՀԾԫԼԻԡ\u0530ՀԻԤԳԹԟՙԥՇղզՎՄԾշԱխԸԹՋԲ\u0558ԺէձհհՇՈ", (byte)24, 69);
               b[4] = φΨαξωυθανΣφυκη.A("æġğĞêĪýùçĐĂ÷", (byte)24, 65);
               b[5] = δΛψπξκσβγςα.C("жѵѪѶэлѵизѳќх", (byte)24, 67);
               b[6] = μεςΩΔΣγν.B("āßèĉėċāĦĤİİåīĒāĸĶİĩĮđīĂă", (byte)24, 66);
               b[7] = πχσδΦΦνθΔπ.B("ĠåēħęĥöøćġĉĐĪîċĕêīĸĪęĻĂă", (byte)24, 66);
               b[8] = βεξΠθρρςΔΦμ.C("ѬэѶѯидїнчјзх", (byte)24, 67);
               b[9] = οοθδΨιοΦΠβδζ.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҐћѶѮѼќѝңѷѶҝҩѰѱ", (byte)24, 68);
               b[10] = ντθΔζβΔζ.D("дѯѭѬиѸычеўѐх", (byte)24, 68);
               b[11] = ΨΦνΨΦωυΩνβςμ.F("ԍՌՁՍԤԒՌԏԎՊԳԜ", (byte)24, 70);
               break;
            case 1:
               b[0] = λΣΩσμφγχ.C("яЭжїѥљяѴѲѾѾьёѲѴѴтѳѹїѹ҉ѐё", (byte)24, 67);
               b[1] = ζοηκορΦνΣθγΩ.D("ѮгѡѵѧѳфцѕѯѕѵѓыѼзѹіўлѦ҉ѐё", (byte)24, 68);
               b[2] = φδχεθοκψαλΛογλ.E("ԨԭԦԸԊՆԽԳԐԮՅԜ", (byte)24, 69);
               b[3] = ντθΔζβΔζ.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѧєѥѤъљѩѤэќѢш҂юѰқҏѷѭѧҠљҔҠқѸѺҝѧѰѤ҇ҩѰѱ", (byte)24, 68);
               b[4] = ξψθρΣΠΣς.E("ԛԇԭԎՎԜԼՎԱԵԫԜ", (byte)24, 69);
               b[5] = θεωψξβΛσσ.D("ѱѠѷљѶюѪхѓѪѠх", (byte)24, 68);
               b[6] = θεωψξβΛσσ.C("яЭжїѥљяѴѲѾҁҁѱѶѽѴіѧ҃ѱї҉ѐё", (byte)24, 67);
               b[7] = δΛψπξκσβγςα.F("ՅԊԸՌԾՊԛԝԬՆԮԎԪԤՖՙՙ՝՛՚ՕՐԧԨ", (byte)24, 70);
               b[8] = πηγμΣΔκκ.D("ыыжЯѲјєчѱјѾх", (byte)24, 68);
               b[9] = ΣερμΔσατσκ.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҎѹѼѭѷѠѦѳҡҀѳ҃Ѱѱ", (byte)24, 68);
               b[10] = ΠΛΨοδΩσμνΛγΦφβς.C("ѩѪыЯіщђкћѾьх", (byte)24, 67);
               b[11] = ιΠοθΩΦξκ.A("ĉûþĪĞĈĮĐħíĂ÷", (byte)24, 65);
               break;
            case 2:
               b[0] = πηγμΣΔκκ.F("ԾՎԹՈԮԯՔԏԢՌԏԣԳԸԖ՛ԮԐՀԷԓՠԧԨ", (byte)24, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = βθκςνθΩθυμςτκχ.F("ԕԄԁԊ\u0530ԻԟԯԾՆՅՁԷ՚ԑԲՊ՚՜ՙԓՓՐԲ՝ՁՏԧՒԤԶե", (byte)24, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κγωΩζξΔμβνςπΓσ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςπυηννναΣ.F("ԳՕ\u0557Է՛պղֈմՃցշօտՈխ֏֎ֆ\u058cֆ՛", (byte)79, 70), κγωΩζξΔμβνςπΓσ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣφδσΔζιΠρα.A("ƀƍƌŏƏƋƆƏƚƉŖƔƘƑƔƚŜӨӢӹӚӨӱӈӱӨӴӺӹӍӾŶ", (byte)79, 65) + var1 + θεωψξβΛσσ.F("Յ", (byte)79, 70) + var2.toString(), var4
         );
      }
   }

   public κγωΩζξΔμβνςπΓσ(γξτΩΛχΣΓπμΠσΓγφ var1) {
      this.b = var1;
   }

   public void onPacketReceive(PacketReceiveEvent var1) {
      if (!var1.isCancelled()) {
         try {
            θβορΛτηατθΨτΠτΦ var2 = (θβορΛτηατθΨτΠτΦ)γξτΩΛχΣΓπμΠσΓγφ.a(this.b).get(var1.getPacketType());
            if (var2 != null) {
               var2.a(var1);
            }
         } catch (Throwable var5) {
            var1.setCancelled((boolean)a);
            ChannelHelper.close(var1.getChannel());
            User var3 = var1.getUser();
            String var4 = c<"㺀">(b & c, d) + var1.getServerVersion() + (var3 != null ? c<"㺃">(e & f, g) + var3.getClientVersion() : c<"㺆">(h & i, j));
            ψΓωτιμωκχψΛΨ.c(c<"㺉">(k, l ^ m) + var1.getPacketType() + c<"㺌">(n, o ^ p) + var4 + c<"㺏">(q, r ^ s), var5);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 118L;
      var1 ^= -1914221844697420519L;
      if (a[var0] == null) {
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
            throw new RuntimeException(ΦδφπθΩΩλζξ.E("՚էզԩթեՠթմգ\u0530ծղիծմԶࣂࢼ࣓ࢴࣂ࣋ࢢ࣋ࣂ࣓࣎ࣔࢧࣘ", (byte)59, 69));
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
}
