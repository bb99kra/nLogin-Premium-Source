package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.command.CommandExecuteEvent.CommandResult;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.event.player.PlayerSettingsChangedEvent;
import com.velocitypowered.api.event.player.TabCompleteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent.ChatResult;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.player.PlayerSettings;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class μγΦψςηΦξ implements ωΩΩαομοΣψΩ {
   private static int ca = Integer.reverse(-1476395008);
   private static int ac = 1 >>> 221 | 1 << ~221 + 1;
   private static int af = Integer.reverse(-201326592);
   private static long q = Long.reverse(-1441151880758558720L);
   private static long w = Long.reverse(-1166388089380873972L);
   private static long t = Long.reverse(-1166388089380873972L);
   private static int f = (1 >>> 64 | 1 << -64) & -1;
   private static int cj = Integer.reverse(-402653184);
   private static long bu = Long.reverse(-1441151880758558720L);
   private static int bg = Integer.reverse(-2013265920);
   private static int bq = Integer.reverse(Integer.MIN_VALUE);
   private static long bm = Long.reverse(-1441151880758558720L);
   private static int o = 262144 >>> 48 | 262144 << -48;
   private static long ba = Long.reverse(-1441151880758558720L);
   private static int ab = (0 >>> 228 | 0 << -228) & -1;
   private static int ap = Integer.reverse(-1);
   private static long u = Long.reverse(-1441151880758558720L);
   private static int ae = 0 >>> 28 | 0 << -28;
   private static long az = Long.reverse(-1166388089380873972L);
   private static int an = Integer.reverse(0);
   private static int by = -1140850688 >>> 122 | -1140850688 << ~122 + 1;
   private static long cg = Long.reverse(-1441151880758558720L);
   private static int ch = (16384 >>> 110 | 16384 << -110) & -1;
   private static int ar = Integer.reverse(805306368);
   private static int ck = 94208 >>> 236 | 94208 << ~236 + 1;
   private static long av = Long.reverse(-1166388089380873972L);
   private static int bs = (655360 >>> 207 | 655360 << -207) & -1;
   private static long p = Long.reverse(-1166388089380873972L);
   private static int y = (58720256 >>> 215 | 58720256 << ~215 + 1) & -1;
   private static int ah = -1 >>> 8 | -1 << -8;
   private static int bx = Integer.reverse(0);
   private static int n = 0 >>> 99 | 0 << -99;
   private static int bj = Integer.reverse(0);
   private static int ce = Integer.reverse(1744830464);
   private static long cf = Long.reverse(-1166388089380873972L);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static long aq = Long.reverse(274763791377684748L);
   private static long j = Long.reverse(274763791377684748L);
   private static int cd = Integer.reverse(0);
   private static long bi = Long.reverse(-1441151880758558720L);
   private static int bv = Integer.reverse(0);
   private static int bb = Integer.reverse(-268435456);
   private static int v = Integer.reverse(1610612736);
   private static int ag = (-1879048192 >>> 156 | -1879048192 << -156) & -1;
   private static long ak = Long.reverse(-1166388089380873972L);
   private static long ai = Long.reverse(274763791377684748L);
   private static int au = 212992 >>> 46 | 212992 << ~46 + 1;
   private static long z = Long.reverse(-1166388089380873972L);
   private static long cb = Long.reverse(-1166388089380873972L);
   private static long bf = Long.reverse(274763791377684748L);
   private static int r = Integer.reverse(-281018368);
   private static long ad = Long.reverse(274763791377684748L);
   private static int i = Integer.reverse(-1);
   private static int bz = Integer.reverse(0);
   private static int ay = Integer.reverse(1879048192);
   private final nLoginVelocity c;
   private static long d = Long.reverse(-1441151880758558720L);
   private static long aw = Long.reverse(-1441151880758558720L);
   private static long as = Long.reverse(-1166388089380873972L);
   private static int a = Integer.reverse(0);
   private static long c;
   private static int be = Integer.reverse(134217728);
   private static int bw = (0 >>> 231 | 0 << ~231 + 1) & -1;
   private static long bc = Long.reverse(-1166388089380873972L);
   private static long b = Long.reverse(-1166388089380873972L);
   private static long bo = Long.reverse(-1166388089380873972L);
   private static int h = 536870912 >>> 220 | 536870912 << -220;
   private static int aj = 2560 >>> 200 | 2560 << -200;
   private static int s = Integer.reverse(-1610612736);
   private static long at = Long.reverse(-1441151880758558720L);
   private static long bd = Long.reverse(-1441151880758558720L);
   private static long bl = Long.reverse(-1166388089380873972L);
   private static long l = Long.reverse(-1166388089380873972L);
   private static long bp = Long.reverse(-1441151880758558720L);
   private static int br = Integer.reverse(0);
   private static int bn = Integer.reverse(-939524096);
   private static long cc = Long.reverse(-1441151880758558720L);
   private static long al = Long.reverse(-1441151880758558720L);
   private static int bk = 147456 >>> 205 | 147456 << ~205 + 1;
   private static int ax = Integer.reverse(0);
   private static String[] a = new String[cj];
   private static long x = Long.reverse(-1441151880758558720L);
   private static int ci = Integer.reverse(0);
   private static long m = Long.reverse(-1441151880758558720L);
   private static int e = (24870912 >>> 111 | 24870912 << ~111 + 1) & -1;
   private static String[] b = new String[ck];
   private final ΨγημιδξΓτοθαζ E;
   private static long aa = Long.reverse(-1441151880758558720L);
   private static long bt = Long.reverse(-1166388089380873972L);
   private static int ao = (11534336 >>> 116 | 11534336 << ~116 + 1) & -1;
   private static long g = Long.reverse(274763791377684748L);
   private static int k = Integer.reverse(-1073741824);
   private static long bh = Long.reverse(-1166388089380873972L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  μγΦψςηΦξ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζοηκορΦνΣθγΩ.A("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 65), μγΦψςηΦξ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ςπυηννναΣ.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ\u0896ࢎࢂࢥࢠ\u0896ࢆ࢟Ԝ", (byte)92, 68) + var1 + ςπυηννναΣ.E("Ւ", (byte)92, 69) + var2.toString(), var4
         );
      }
   }

   @Subscribe(
      order = PostOrder.LAST
   )
   public void b(CommandExecuteEvent var1) {
      if (!var1.getResult().isAllowed() && this.a(var1.getCommand())) {
         var1.setResult(CommandResult.allowed());
      }
   }

   @Subscribe(
      order = PostOrder.FIRST
   )
   public void a(PlayerChatEvent var1) {
      String var2 = var1.getMessage().trim();
      if (!var2.isEmpty()) {
         Player var3 = var1.getPlayer();

         try {
            ΨαχΨχΣλεΠψΦ var4 = this.c.b().a(var3);
            if (var4.S()) {
               return;
            }

            if (this.E.b().a(var4, var2)) {
               ιηοψσγξςΩγδ var5 = this.E.a().b(var4);
               if (var3.getProtocolVersion().getProtocol() >= r && (var5.a(πβκνλοΛκΠδΦτφλ.I) || var5.d(πβκνλοΛκΠδΦτφλ.c))) {
                  return;
               }

               var1.setResult(ChatResult.denied());
            }
         } catch (Throwable var6) {
            ψΓωτιμωκχψΛΨ.c(c<"㺀">(s, t ^ u) + var1.getClass().getSimpleName() + c<"㺃">(v, w ^ x) + var3.getUsername() + c<"㺆">(y, z ^ aa), var6);
            var3.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(ac, ad)));
         }
      }
   }

   private static void b() {
      c = 3502441953622232055L;
      long var0 = c ^ 5406453350510797281L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               69,
               (byte)(55 + 28),
               (byte)(22 + 25),
               (byte)(3 + 64),
               (byte)(59 + 7),
               (byte)(18 + 49),
               (byte)(41 + 6),
               (byte)(65 + 15),
               (byte)(41 + 34),
               (byte)(8 + 59),
               (byte)(16 + 67),
               (byte)(40 + 13),
               80,
               (byte)(28 + 69),
               (byte)(10 + 90),
               (byte)(71 + 29),
               (byte)(48 + 57),
               (byte)(44 + 66),
               (byte)(68 + 35)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(4 + 64), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ιΠοθΩΦξκ.C("ѯѢѮѨЮѥїефѐѝт", (byte)23, 67);
               b[1] = ζβησεθωυγτ.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՑԲԼ\u0530ՂԾԿ՚՚ԼԽ", (byte)23, 70);
               b[2] = πχσδΦΦνθΔπ.D("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 68);
               b[3] = ζβησεθωυγτ.E("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 69);
               b[4] = ΣφδσΔζιΠρα.F(
                  "ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ\u058b\u0590\u058bՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֎՞֝Ֆ֦վ֕օզ֔։", (byte)23, 70
               );
               b[5] = χΠξΦιζΨΣωΦσΨζ.D("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѸљѣїѩѥѦҁҁѣѤ", (byte)23, 68);
               b[6] = ΠΛΨοδΩσμνΛγΦφβς.A("ĀàĩģğĕåăĥĩðĭĚòĮĀĶĮĔįĲĩĀā", (byte)23, 65);
               b[7] = πψυκΠΨμΛΩβΣφμφσ.D("ѝЯоцчтчѣьгѻт", (byte)23, 68);
               b[8] = φΨαξωυθανΣφυκη.A("ďć÷ĉĉĖìÿĉėþĝòħĩĈĥĐģĩĶĴĺüĞĘĽĒýþĬăŀńđĕŃĥĠĤĢŎċĺŁĉđĵŉĠŏřĮĮĨĥœįŊőŘōļőŕğťŪťĺŋĬķŌũňũŉōĴŏŤŵŏœŨĸŷİƀŘůşŀŮţ", (byte)23, 65);
               b[9] = οΩνΩρωλΨηΛδωδ.F("ԅԡՅԏԋԎԟԊՄԽՂԐԵԺՃԱՋՆՑ՝ԼԽԜՠԺԺԸ՟ԠԿԠԥ", (byte)23, 70);
               b[10] = ΨφιωσρΓδΔθ.F("ՄԠԣՁԺՍԈՑԴԳԩԟԖՅԌՅԩԲԼՠ\u0558՟Ԧԧ", (byte)23, 70);
               b[11] = ξψθρΣΠΣς.C("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѸљѣїѩѥѦҁҁѣѤ", (byte)23, 67);
               b[12] = πηγμΣΔκκ.C("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 67);
               b[13] = ΨΦνΨΦωυΩνβςμ.F("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 70);
               b[14] = βεξΠθρρςΔΦμ.E(
                  "ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ\u058b\u0590\u058bՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֎՞֝Ֆ֦վ֕օզ֔։", (byte)23, 69
               );
               b[15] = πψυκΠΨμΛΩβΣφμφσ.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՑԲԼ\u0530ՂԾԿ՚՚ԼԽ", (byte)23, 70);
               b[16] = πψυκΠΨμΛΩβΣφμφσ.D("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 68);
               b[17] = ΨφιωσρΓδΔθ.E("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 69);
               b[18] = οοθδΨιοΦΠβδζ.A("ďć÷ĉĉĖìÿĉėþĝòħĩĈĥĐģĩĶĴĺüĞĘĽĒýþĬăŀńđĕŃĥĠĤĢŎċĺŁĉđĵŉĠŏřĮĮĨĥœįŊőŘōļőŕğťŪťĺŋĬķŌũňũŉōĴŏŤŵŏœŨĸŷİƀŘůşŀŮţ", (byte)23, 65);
               b[19] = λΣΩσμφγχ.D("уыѡѓшьзъвёѻт", (byte)23, 68);
               b[20] = μεςΩΔΣγν.E("ՌԄԨԎԏԃ\u0530ՇԪՄԮԛ", (byte)23, 69);
               b[21] = ντθΔζβΔζ.C("уыѡѓшьзъвёѻт", (byte)23, 67);
               b[22] = ΣδτΠνεγοΓορητ.D("лѴщѥѷѡъѦізљт", (byte)23, 68);
               break;
            case 1:
               b[0] = χΠξΦιζΨΣωΦσΨζ.B("ĆĤáėÜâĞßúĬĢõ", (byte)23, 66);
               b[1] = πχσδΦΦνθΔπ.E("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՒԺՃԢՠԜ՟բԢՈԶ", (byte)23, 69);
               b[2] = ΨφιωσρΓδΔθ.A("ĀàĩģğĕåăĥĩæúďĆĤāĖĵăĎċăĀā", (byte)23, 65);
               b[3] = μεςΩΔΣγν.D("ХѤѯѯючёѴиѰэт", (byte)23, 68);
               b[4] = λΣΩσμφγχ.D("ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҠҞӉӊӌҪҬҦӇҟҟҌӎұҔҮҮҳӔӃҭҽҢ", (byte)23, 68);
               b[5] = μζξτΩσσφυδεπλΨ.C("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂Ѹрҋ҈ѫэѥѦѨҍф", (byte)23, 67);
               b[6] = βεξΠθρρςΔΦμ.C("эЭѶѰѬѢвѐѲѶгјѽљѝѪёжэѹѰ҆эю", (byte)23, 67);
               b[7] = μζξτΩσσφυδεπλΨ.C("ХЫіоѨшѶфѵьѫт", (byte)23, 67);
               b[8] = ΨφιωσρΓδΔθ.D("ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҧҷҶҧҫӆһңӀӏҊӋӎӁӎҿӊҪҹҩҘҹҢ", (byte)23, 68);
               b[9] = ζοηκορΦνΣθγΩ.A("ßûğéåèùäĞėĜêďĔĝċĥĠīķĖĚćąĹĶĈĺĲĻĴĮĘĶĂĕĀŇþĘĖģŊĕ", (byte)23, 65);
               b[10] = ΠΛΨοδΩσμνΛγΦφβς.B("ĞúýěĔħâīĎčāęîðïĬòĩîĩĬĚČùĮĠŀłĴĽýĤ", (byte)23, 66);
               b[11] = οοθδΨιοΦΠβδζ.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՔՔ՚Ԛԯ՝\u0557Եբ՚ժ", (byte)23, 70);
               b[12] = ςπυηννναΣ.A("ĀàĩģğĕåăĥĩâýĬîĬčăĂĸđĆăĀā", (byte)23, 65);
               b[13] = ντθΔζβΔζ.C("суѨШыѨѴѕюѹит", (byte)23, 67);
               b[14] = βθκςνθΩθυμςτκχ.D(
                  "ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҠҟҸҨҝ҅ҧ҆ҸҿӁҽҮҕӒңҷҹҕҷӆҽҢ", (byte)23, 68
               );
               b[15] = ςπυηννναΣ.D("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѷҀѵљѻцҍы҄ҋѩѤэѐѕѳҏҚѷҔѤѽѢ", (byte)23, 68);
               b[16] = οοθδΨιοΦΠβδζ.C("эЭѶѰѬѢвѐѲѶЯѬѬѽмйеёѐёѡѐэю", (byte)23, 67);
               b[17] = μζξτΩσσφυδεπλΨ.B("ýöÞĊõüĠêĦĭĞõ", (byte)23, 66);
               b[18] = φδχεθοκψαλΛογλ.E(
                  "ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ\u058b\u0590\u058bՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֊֘֟լքյֈ֓֟֔֠֫գո֘ւְֲֲִ֚֔ջ", (byte)23, 69
               );
               b[19] = ζοηκορΦνΣθγΩ.A("ħħĖģûăąīéíČõ", (byte)23, 65);
               b[20] = ΨφιωσρΓδΔθ.F("ԼԛՏԍԋՂԑՎՕՋԑՎ\u0557ԧԱ\u0558ԨՕԴԹՈԹԦԧ", (byte)23, 70);
               b[21] = βθκςνθΩθυμςτκχ.D("нчЮђжѐиѱїѫѷт", (byte)23, 68);
               b[22] = χΠξΦιζΨΣωΦσΨζ.D("хяѲцгѮѰѨѐѕѐѮѮђ҂ѻтрнѥ҆҆эю", (byte)23, 68);
               break;
            case 2:
               b[0] = θεωψξβΛσσ.B("ØĝáÛĤĠâùěěùģäòĉíîăĕĳĭăĀā", (byte)23, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ντθΔζβΔζ.A("æćçăėāĂĭĨĄĭħīñĤĉġÿõęĦĩĀā", (byte)23, 65);
         }
      }
   }

   @Generated
   public μγΦψςηΦξ(nLoginVelocity var1, ΨγημιδξΓτοθαζ var2) {
      this.c = var1;
      this.E = var2;
   }

   static {
      b();
   }

   private boolean a(String var1) {
      if (!var1.trim().isEmpty()) {
         String[] var2 = var1.split(c<"㺀">(bn, bo ^ bp));
         if (var2.length > bq) {
            String var3 = var2[br].toLowerCase(Locale.ENGLISH);
            return var3.equals(c<"㺃">(bs, bt ^ bu));
         }
      }

      return (boolean)bv;
   }

   @Subscribe
   public void a(PlayerSettingsChangedEvent var1) {
      Player var2 = var1.getPlayer();

      try {
         ΨαχΨχΣλεΠψΦ var3 = this.c.b().a(var2);
         if (var3.S()) {
            return;
         }

         PlayerSettings var4 = var1.getPlayerSettings();
         εθσξξτΛακπΣ var5 = εθσξξτΛακπΣ.c(var4.getLocale().toLanguageTag());
         if (var5 != null) {
            ιηοψσγξςΩγδ var6 = this.E.a().b(var3);
            var6.a(πβκνλοΛκΠδΦτφλ.i, var5);
         }
      } catch (Throwable var7) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(bb, bc ^ bd) + var1.getClass().getSimpleName() + c<"㺃">(be, bf) + var2.getUsername() + c<"㺆">(bg, bh ^ bi), var7);
         var2.disconnect(ΩτωνοφχεΠ.a(c<"㺉">(bk, bl ^ bm)));
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 55L;
      var1 ^= 5406453350510797281L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(51 + 18),
                     (byte)(52 + 31),
                     (byte)(37 + 10),
                     (byte)(6 + 61),
                     (byte)(42 + 24),
                     (byte)(29 + 38),
                     (byte)(30 + 17),
                     (byte)(43 + 37),
                     (byte)(66 + 9),
                     (byte)(57 + 10),
                     (byte)(51 + 32),
                     (byte)(52 + 1),
                     80,
                     (byte)(65 + 32),
                     100,
                     (byte)(61 + 39),
                     (byte)(80 + 25),
                     (byte)(105 + 5),
                     (byte)(10 + 93)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣφδσΔζιΠρα.F("ՙզեԨըդ՟ըճբԯխձժխճԵࣃࢻࢯ࣒࣍ࣃࢳ࣌", (byte)58, 70));
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

   @Subscribe
   public void a(TabCompleteEvent var1) {
      List var2 = var1.getSuggestions();
      if (!var2.isEmpty()) {
         String var3 = var1.getPartialMessage().trim();
         if (var3.isEmpty() || var3.charAt(ae) == af) {
            Player var4 = var1.getPlayer();

            try {
               ΨαχΨχΣλεΠψΦ var5 = this.c.b().a(var4);
               if (var5.S()) {
                  return;
               }

               int var6 = !var5.i(c<"㺀">(ag & ah, ai)) && !var5.i(c<"㺃">(aj, ak ^ al)) ? an : am;
               var2.removeIf(var3x -> {
                  if (var3x.trim().isEmpty()) {
                     return (boolean)bw;
                  } else if (var3x.charAt(bx) != by) {
                     return (boolean)bz;
                  } else {
                     String[] var4x = var3x.split(c<"㺀">(ca, cb ^ cc));
                     String var5x = var4x[cd].toLowerCase(Locale.ENGLISH);
                     if (!var6 && c<"㺃">(ce, cf ^ cg).equals(var5x)) {
                        return (boolean)ch;
                     } else {
                        return (boolean)(this.E.a().b(var5) ? ci : this.E.a().b(var3x));
                     }
                  }
               });
            } catch (Throwable var7) {
               ψΓωτιμωκχψΛΨ.c(c<"㺆">(ao & ap, aq) + var1.getClass().getSimpleName() + c<"㺉">(ar, as ^ at) + var4.getUsername() + c<"㺌">(au, av ^ aw), var7);
               var4.disconnect(ΩτωνοφχεΠ.a(c<"㺏">(ay, az ^ ba)));
            }
         }
      }
   }

   @Subscribe
   public void a(CommandExecuteEvent var1) {
      if (var1.getResult().isAllowed()) {
         CommandSource var2 = var1.getCommandSource();
         if (var2 instanceof Player) {
            String var3 = var1.getCommand().trim();
            if (!var3.isEmpty()) {
               Player var4 = (Player)var2;

               try {
                  ΨαχΨχΣλεΠψΦ var5 = this.c.b().a(var4);
                  if (var5.S()) {
                     return;
                  }

                  String var6 = this.E.b().a(var5, c<"㺀">(a, b ^ d) + var3);
                  if (var6 == null) {
                     ιηοψσγξςΩγδ var7 = this.E.a().b(var5);
                     if (var4.getProtocolVersion().getProtocol() >= e && (var7.a(πβκνλοΛκΠδΦτφλ.I) || var7.d(πβκνλοΛκΠδΦτφλ.c))) {
                        var1.setResult(CommandResult.forwardToServer());
                        return;
                     }

                     var1.setResult(CommandResult.denied());
                  }
               } catch (Throwable var8) {
                  ψΓωτιμωκχψΛΨ.c(c<"㺃">(f, g) + var1.getClass().getSimpleName() + c<"㺆">(h & i, j) + var4.getUsername() + c<"㺉">(k, l ^ m), var8);
                  var4.disconnect(ΩτωνοφχεΠ.a(c<"㺌">(o, p ^ q)));
               }
            }
         }
      }
   }
}
