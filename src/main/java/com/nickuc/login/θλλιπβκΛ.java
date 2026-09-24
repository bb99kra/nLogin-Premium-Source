package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.jda.api.JDA;
import com.nickuc.login.lib.jda.api.entities.User;
import com.nickuc.login.lib.jda.api.entities.channel.ChannelType;
import com.nickuc.login.lib.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import com.nickuc.login.lib.jda.api.events.interaction.component.ButtonInteractionEvent;
import com.nickuc.login.lib.jda.api.events.session.ReadyEvent;
import com.nickuc.login.lib.jda.api.hooks.ListenerAdapter;
import com.nickuc.login.lib.jda.api.interactions.commands.OptionMapping;
import com.nickuc.login.lib.jda.api.interactions.commands.SlashCommandInteraction;
import com.nickuc.login.lib.jda.api.interactions.commands.Command.Type;
import com.nickuc.login.lib.jda.api.interactions.components.buttons.ButtonInteraction;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class θλλιπβκΛ extends ListenerAdapter {
   private static int cd = Integer.reverse(1073741824);
   private static int dr = Integer.reverse(Integer.MIN_VALUE);
   private static long be = Long.reverse(-215581303436904394L);
   private static int ag = Integer.reverse(268435456);
   private static int dz = Integer.reverse(402653184);
   private static int z = Integer.reverse(1610612736);
   private static long av = Long.reverse(1369685765397510198L);
   private static int co = (3 >>> 159 | 3 << ~159 + 1) & -1;
   private static long ct = Long.reverse(-215581303436904394L);
   private static long s = Long.reverse(1369685765397510198L);
   private static int dp = (-1073741824 >>> 190 | -1073741824 << -190) & -1;
   private static long t = Long.reverse(-1297036692682702848L);
   private static int da = 2 >>> 65 | 2 << -65;
   private static int by = (0 >>> 197 | 0 << -197) & -1;
   private static long ah = Long.reverse(-215581303436904394L);
   private static long dx = Long.reverse(1369685765397510198L);
   private static int bn = Integer.reverse(0);
   private static long eg = Long.reverse(-1152921504606846976L);
   private static int bp = Integer.reverse(0);
   private static int q = Integer.reverse(0);
   private static int bc = (0 >>> 186 | 0 << -186) & -1;
   private static long f = Long.reverse(1369685765397510198L);
   private static int ds = Integer.reverse(1073741824);
   private static long i = Long.reverse(1369685765397510198L);
   private static int ec = Integer.reverse(Integer.MIN_VALUE);
   private static int y = 1073741824 >>> 254 | 1073741824 << -254;
   private static long am = Long.reverse(1369685765397510198L);
   private static int k = Integer.reverse(0);
   private static int ax = Integer.reverse(0);
   private static int ad = Integer.reverse(0);
   private static long as = Long.reverse(1369685765397510198L);
   private static int bs = Integer.reverse(0);
   private static int u = (4194304 >>> 246 | 4194304 << ~246 + 1) & -1;
   private static long bb = Long.reverse(-215581303436904394L);
   private static int cz = Integer.reverse(0);
   private static String[] b = new String[θλλιπβκΛ.ef];
   private static int n = ('쀀' >>> 174 | 49152 << ~174 + 1) & -1;
   private static int v = (5 >>> 160 | 5 << ~160 + 1) & -1;
   private static int dn = Integer.reverse(-1);
   private static int cf = Integer.reverse(536870912);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private final ρρΣηκοωβ b;
   private static int bd = Integer.reverse(-268435456);
   private static int ao = 5632 >>> 137 | 5632 << ~137 + 1;
   private static String[] a = new String[θλλιπβκΛ.ee];
   private static int ck = Integer.reverse(0);
   private static int cu = Integer.reverse(-939524096);
   private static int cq = 0 >>> 72 | 0 << ~72 + 1;
   private static long cw = Long.reverse(-215581303436904394L);
   private static long dl = Long.reverse(-215581303436904394L);
   private static int bv = (128 >>> 135 | 128 << ~135 + 1) & -1;
   private static long d = Long.reverse(-1297036692682702848L);
   private static int ed = (0 >>> 34 | 0 << ~34 + 1) & -1;
   private static int bm = Integer.reverse(0);
   private static int dj = (10485760 >>> 211 | 10485760 << ~211 + 1) & -1;
   private static long af = Long.reverse(-215581303436904394L);
   private static int ce = 192 >>> 198 | 192 << -198;
   private static int ba = -1 >>> 111 | -1 << ~111 + 1;
   private static int az = 7168 >>> 201 | 7168 << ~201 + 1;
   private static int dg = Integer.reverse(Integer.MIN_VALUE);
   private static long bh = Long.reverse(-215581303436904394L);
   private static int cn = (0 >>> 126 | 0 << ~126 + 1) & -1;
   private static long aa = Long.reverse(-215581303436904394L);
   private static int ci = (1140850688 >>> 90 | 1140850688 << -90) & -1;
   private static int a = (0 >>> 28 | 0 << -28) & -1;
   private static long du = Long.reverse(1369685765397510198L);
   private static int bo = (0 >>> 112 | 0 << -112) & -1;
   private static int al = Integer.reverse(1342177280);
   private static int bu = Integer.reverse(0);
   private static int bj = Integer.reverse(0);
   private static long ab = Long.reverse(456833887201394688L);
   private static int bi = Integer.reverse(0);
   private static int dm = (88080384 >>> 182 | 88080384 << -182) & -1;
   private static int cc = 134217728 >>> 251 | 134217728 << ~251 + 1;
   private static int ch = 0 >>> 227 | 0 << -227;
   private static long ea = Long.reverse(-215581303436904394L);
   private static long ak = Long.reverse(-1297036692682702848L);
   private static int cr = Integer.reverse(1207959552);
   private static long aj = Long.reverse(1369685765397510198L);
   private static int cp = Integer.reverse(0);
   private static int cb = Integer.reverse(0);
   private static int dd = 0 >>> 94 | 0 << ~94 + 1;
   private static int dh = (0 >>> 132 | 0 << ~132 + 1) & -1;
   private static int bg = Integer.reverse(-1);
   private static long an = Long.reverse(-1297036692682702848L);
   private static int br = Integer.reverse(Integer.MIN_VALUE);
   private static int m = Integer.reverse(-1);
   private static int cl = (0 >>> 190 | 0 << -190) & -1;
   private static int bx = (16384 >>> 205 | 16384 << -205) & -1;
   private static long c;
   private static int bl = Integer.reverse(0);
   private static int bk = Integer.reverse(0);
   private static int ai = Integer.reverse(-1879048192);
   private static int bz = (1 >>> 224 | 1 << -224) & -1;
   private static int db = Integer.reverse(0);
   private static int au = (104 >>> 35 | 104 << ~35 + 1) & -1;
   private static int ap = (-1 >>> 182 | -1 << ~182 + 1) & -1;
   private static int bq = Integer.reverse(0);
   private static long cj = Long.reverse(-215581303436904394L);
   private static int eb = Integer.reverse(0);
   private static long do = Long.reverse(-215581303436904394L);
   private static long w = Long.reverse(1369685765397510198L);
   private static int bw = Integer.reverse(0);
   private static int ef = Integer.reverse(-1744830464);
   private static int ar = Integer.reverse(805306368);
   private static int cv = Integer.reverse(-1);
   private static long b = Long.reverse(1369685765397510198L);
   private static int cx = Integer.reverse(0);
   private static long dy = Long.reverse(-1297036692682702848L);
   private static int ac = 4 >>> 34 | 4 << -34;
   private static int r = 268435456 >>> 90 | 268435456 << ~90 + 1;
   private static int bf = 4194304 >>> 146 | 4194304 << -146;
   private static int di = Integer.reverse(0);
   private static long x = Long.reverse(-1297036692682702848L);
   private static long aq = Long.reverse(-215581303436904394L);
   private static int df = (0 >>> 63 | 0 << -63) & -1;
   public static Cache<String, String> l = Caffeine.newBuilder().expireAfterWrite(eg, TimeUnit.MINUTES).build();
   private static int dc = 1048576 >>> 20 | 1048576 << ~20 + 1;
   private static long o = Long.reverse(1369685765397510198L);
   private static int h = 128 >>> 38 | 128 << ~38 + 1;
   private static int cm = 0 >>> 4 | 0 << ~4 + 1;
   private static int cy = Integer.reverse(Integer.MIN_VALUE);
   private static int ay = 536870912 >>> 189 | 536870912 << ~189 + 1;
   private static int dt = Integer.reverse(1744830464);
   private static int dk = (-1 >>> 119 | -1 << ~119 + 1) & -1;
   private static int ee = 200 >>> 3 | 200 << -3;
   private static long g = Long.reverse(-1297036692682702848L);
   private static int dq = 0 >>> 72 | 0 << ~72 + 1;
   private static int cs = Integer.reverse(-1);
   private static int dw = Integer.reverse(-402653184);
   private static int ca = 1342177280 >>> 92 | 1342177280 << ~92 + 1;
   private static long dv = Long.reverse(-1297036692682702848L);
   private static long j = Long.reverse(-1297036692682702848L);
   private final ΨγημιδξΓτοθαζ I;
   private static long at = Long.reverse(-1297036692682702848L);
   private static int cg = Integer.reverse(Integer.MIN_VALUE);
   private static int l = Integer.reverse(0);
   private static int ae = (229376 >>> 79 | 229376 << -79) & -1;
   private static long p = Long.reverse(-1297036692682702848L);
   private static int de = (134217728 >>> 219 | 134217728 << ~219 + 1) & -1;
   private static long aw = Long.reverse(-1297036692682702848L);
   private static int bt = Integer.reverse(Integer.MIN_VALUE);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  θλλιπβκΛ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.A("ãąćçċĪĢĸĤóıħĵįøĝĿľĶļĶċ", (byte)30, 65), θλλιπβκΛ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ςπυηννναΣ.C("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߘߜߝߜߤߗߠ߂Ѣ", (byte)30, 67) + var1 + ζβησεθωυγτ.A("õ", (byte)30, 65) + var2.toString(), var4);
      }
   }

   public void onReady(ReadyEvent var1) {
      JDA var2 = var1.getJDA();
      ψΓωτιμωκχψΛΨ.b(c<"㺀">(a, b ^ d) + var2.getSelfUser().getAsTag() + c<"㺃">(e, f ^ g) + var1.getGuildTotalCount() + c<"㺆">(h, i ^ j));
      var2.getGuilds()
         .stream()
         .filter(var1x -> (boolean)(!var2.isUnavailable(var1x.getIdLong()) ? ec : ed))
         .forEach(var0 -> ψΓωτιμωκχψΛΨ.b(c<"㺀">(dt, du ^ dv) + var0.getName() + c<"㺃">(dw, dx ^ dy) + var0.getId() + c<"㺆">(dz, ea)));
   }

   private static void b() {
      c = 7790864766957273288L;
      long var0 = c ^ -8208265634546011299L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(53 + 16),
               (byte)(2 + 81),
               (byte)(41 + 6),
               (byte)(22 + 45),
               (byte)(53 + 13),
               (byte)(65 + 2),
               (byte)(39 + 8),
               (byte)(61 + 19),
               75,
               (byte)(27 + 40),
               83,
               (byte)(23 + 30),
               (byte)(23 + 57),
               (byte)(76 + 21),
               (byte)(65 + 35),
               (byte)(14 + 86),
               (byte)(29 + 76),
               (byte)(83 + 27),
               (byte)(88 + 15)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = μζξτΩσσφυδεπλΨ.F("ժԽժԽդեՐՁՕՉճՔՈԳՙչՓճՋԷմ՚փ՟խ՜\u0558ՙՀճՒ՞\u0557Յռծ՜ՠհ֍բ֖֔՛", (byte)55, 70);
               b[1] = μεςΩΔΣγν.A("ĞřŠŇĻĽīōśĻļĵ", (byte)55, 65);
               b[2] = ζοηκορΦνΣθγΩ.E("ԬԿԷԭԧՉՃ՞լիԱԻ", (byte)55, 69);
               b[3] = πψυκΠΨμΛΩβΣφμφσ.A("ıŔţĴĢŜĢťŮŎħĵ", (byte)55, 65);
               b[4] = χΠξΦιζΨΣωΦσΨζ.D("ҋҴӑҭҡҲүҤӍӝӏҢ", (byte)55, 68);
               b[5] = ζοηκορΦνΣθγΩ.B("ŏŇőĦŖřĻĦŧīļĵ", (byte)55, 66);
               b[6] = ςΦζσμτΓσ.E("Ժ՜ԪԺԯ՚ՐՈճՀՊԻ", (byte)55, 69);
               b[7] = δΛψπξκσβγςα.E("թՋԮդՂՀՈ՛աՎԭԻ", (byte)55, 69);
               b[8] = ζοηκορΦνΣθγΩ.A("ŗŒĳŤţŖĤłĹŋĽŌĩĽţŬūŐŕŢŰŃŀŁ", (byte)55, 65);
               b[9] = ιΠοθΩΦξκ.D("ҋӆӍҴҨҪҘҺӈҨҩҢ", (byte)55, 68);
               b[10] = ΣφδσΔζιΠρα.A(
                  "ŔĲĶŔŨĹťĹŃŪĪŋļĿŌńŗūŃŶĹŃŎřķķŬſŝŰŸśƂŏņŦłŴŭƈŶŚłƆƅƐŽŶſƂƀŷƉŵƘŲŹśŒŚŭůŴƆƥŽƈƚŻƓƁƌƧŹƊƩƌƂżūƃƮƂƳƙźƶƾƈƖƮƌƝƛƃŻƯƗƑƄǉƦơƌƻƊǊƕ", (byte)55, 65
               );
               b[11] = πηγμΣΔκκ.E("ԥդԺԥաՑԲԫՊԲՆԻ", (byte)55, 69);
               b[12] = ιΠοθΩΦξκ.E("ե՚ԤդՙՄ՛ԼԲԾՍբՄլԺԱՓՑոՔՀՉՆՇ", (byte)55, 69);
               b[13] = μεςΩΔΣγν.F(
                  "ՖՉՍՎԻ՚\u0530ՑՏեխէԵդզզՊձչթ\u0557պԴԵջջԿֈչ։քբ՜ՅօֈՎկճզվսճճ֑ճքժ֕\u058bռջ֑ՙ֒՝֠պվ֤՚վ֥ւ֧թ֩վ֡֝ֈ\u0590կձօ֔հֆւֶֶ֓֊ִ֞չ׃֚ջ֮ׄրք֤֔ւ", (byte)55, 70
               );
               b[14] = πηγμΣΔκκ.E("ՋբէՈՏլաԪթԽՎԻ", (byte)55, 69);
               b[15] = μεςΩΔΣγν.D("ҊҵҵҬҖҐӖҙӌҭҥҢ", (byte)55, 68);
               b[16] = ΨΦνΨΦωυΩνβςμ.A("šĞŦěŖņŗţŇĺħĵ", (byte)55, 65);
               b[17] = βθκςνθΩθυμςτκχ.B("şĿőĢļœťģńķįĵ", (byte)55, 66);
               b[18] = ςπυηννναΣ.E("ԫԫՍԦՀՆՒՑԳԬՁԿԸէՅ՛զՍղԵ\u0558խ\u0558՚ծՄզՖեՒէռ", (byte)55, 69);
               b[19] = ζβησεθωυγτ.E("՜ՎԷԬեխթգՍղՃզԯՉԹԲԻՎձՕցջՊջդ՟զՏՐաըւՇ՜\u0558գպրգղՊՔֈծի֎քն\u058c֖\u058cնճթզէ", (byte)55, 69);
               b[20] = φδχεθοκψαλΛογλ.C("ҤӂҬҲӋҭӃҶӇӚҮӍӎҷҹҟҡҼӘӓһӣӧӡҵӢҟӊҼҰӃҿ", (byte)55, 67);
               b[21] = ΣερμΔσατσκ.F("խԦեՎԯՙլՁՍձդՍշՆՄՕմ՜մրճԷկԵռբ՜ճ՞Իֆ՚", (byte)55, 70);
               b[22] = φΨαξωυθανΣφυκη.C("ҜӒҧҿҧҶҦҐҫӅӋҢ", (byte)55, 67);
               b[23] = ΣφδσΔζιΠρα.D("ӌҾӃҌҍҹӉҕҕӆҹҢ", (byte)55, 68);
               b[24] = οοθδΨιοΦΠβδζ.A("ĦĹıħġŃĽŘŦťīĵ", (byte)55, 65);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.C("ӑҤӑҤӋӌҷҨҼҰӚһүҚӀӠҺӚҲҞӛӁӪӆӔӃҿӀҧӚҹӅӀӄҭӯүӊӺӋӹҷӻӱҷӡҾԂӏӓӘӠӼӶӍӎ", (byte)55, 67);
               b[1] = ςΦζσμτΓσ.F("Ձԟբ՜Յ՚ՎհթէհԻ", (byte)55, 70);
               b[2] = οοθδΨιοΦΠβδζ.E("՟ՠգՃԧլԻըԼիԭԻ", (byte)55, 69);
               b[3] = χΠξΦιζΨΣωΦσΨζ.B("ĹœŨġŃĳŃšŎŤňĵ", (byte)55, 66);
               b[4] = ζβησεθωυγτ.F("ՕգՎԮԽղ՛ԲՈզէաՆՌՙ\u0557ովմթցՉՆՇ", (byte)55, 70);
               b[5] = πχσδΦΦνθΔπ.D("Ґҡӎ҈ҩҠҘӃҮӈҹҢ", (byte)55, 68);
               b[6] = ΣδτΠνεγοΓορητ.E("ԻԥՌ՟կ՞ՈՆՄԫկդՏՌԹԶզսՓժՀկՆՇ", (byte)55, 69);
               b[7] = λΣΩσμφγχ.D("ҫӓ҇ҦҿӋҮүҰҒӗҢ", (byte)55, 68);
               b[8] = φδχεθοκψαλΛογλ.D("ӄҿҠӑӐӃґүҦҸҬҕҙҿҲӕҢӍүҰҤӀҭҮ", (byte)55, 68);
               b[9] = μζξτΩσσφυδεπλΨ.E("՚Չ՞\u0557ԹըԪՃըԽլԻ", (byte)55, 69);
               b[10] = χφπρψπφΦθμπ.C(
                  "ӁҟңӁӕҦӒҦҰӗҗҸҩҬҹұӄӘҰӣҦҰһӆҤҤәӬӊӝӥӈӯҼҳӓүӡӚӵӣӇүӳӲӽӪӣӬӯӭӤӶӢԅӟӦӈҿӇӚӜӡӳԒӪӵԇӨԀӮӹԔӦӷԖӹӯөӘӰԛӯԠԆӧԣԫӵԃԛӹԊԈӰӨԧԁӵԪԈԠԇԋԲԆԫԂ", (byte)55, 67
               );
               b[11] = ιΠοθΩΦξκ.D("ҎҴҫӆӕҰӌґҪҷҘҢ", (byte)55, 68);
               b[12] = ΣδτΠνεγοΓορητ.E("ե՚ԤդՙՄ՛ԼԲԾՊԭեՇշշզթլժկՉՆՇ", (byte)55, 69);
               b[13] = ΨΦνΨΦωυΩνβςμ.E(
                  "ՖՉՍՎԻ՚\u0530ՑՏեխէԵդզզՊձչթ\u0557պԴԵջջԿֈչ։քբ՜ՅօֈՎկճզվսճճ֑ճքժ֕\u058bռջ֑ՙ֒՝֠պվ֤՚վ֥ւ֧թ֩վ֡֝ֈ\u0590կձօ֔հֆւֶֶ֓֊ִ֞որׄ֎֎֒֓֔׆ֹ֓", (byte)55, 69
               );
               b[14] = πψυκΠΨμΛΩβΣφμφσ.E("ՁՆՇԫԾթբՐխհԱԻ", (byte)55, 69);
               b[15] = οΩνΩρωλΨηΛδωδ.D("ҭӎӍҩҤҐҡҢҪӍҘҢ", (byte)55, 68);
               b[16] = πψυκΠΨμΛΩβΣφμφσ.B("ĤśŠĶœŗŞŧŭŘĩŃŮųťŰšłńŐŐũŀŁ", (byte)55, 66);
               b[17] = δΛψπξκσβγςα.B("řĵŔŒşţśōŝŤįĵ", (byte)55, 66);
               b[18] = ΣφδσΔζιΠρα.C("ҒҒҴҍҧҭҹҸҚғҨҦҟӎҬӂӍҴәҜҿӐҢҡҷһҭӭҨөұӥ", (byte)55, 67);
               b[19] = φΨαξωυθανΣφυκη.D("ӃҵҞғӌӔӐӊҴәҪӍҖҰҠҙҢҵӘҼӨӢұӢӋӆӍҶҷӈӏөҮӃҿӊӡӧӊәұһӰҷӏӻӐӊӀҽһӺӦӶӍӎ", (byte)55, 68);
               b[20] = ζοηκορΦνΣθγΩ.A("ķŕĿŅŞŀŖŉŚŭŁŠšŊŌĲĴŏūŦŎŵųŚŘŋőŴōĹŔź", (byte)55, 65);
               b[21] = ΣερμΔσατσκ.C("ӔҍӌҵҖӀӓҨҴӘӋҴӞҭҫҼӛӃӛӧӚӦӅӊӂӍӘӝӂҹӍӯ", (byte)55, 67);
               b[22] = φΨαξωυθανΣφυκη.E("ՉիկՠԿՍՠՓգա՞ՖԲծղՙԵՆէջխՙՆՇ", (byte)55, 69);
               b[23] = ξψθρΣΠΣς.B("ŝľĦĥĸŪŠţřŦńĵ", (byte)55, 66);
               b[24] = φΨαξωυθανΣφυκη.D("ҥҋҩӏӘҩәӅӉӜҹҢ", (byte)55, 68);
               break;
            case 2:
               b[0] = ζβησεθωυγτ.C("ӓӈӊҔҤұүӏұҗҜӈҽӍӑӣҴҰӠӔӓӦҭҮ", (byte)55, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = οοθδΨιοΦΠβδζ.C("ӎӕҌӋӎӃҵҲҕӖҘҦӠӛӑҠӤҚӅӡӔҸӘҸӀӝӡӭӄӟӰӓ", (byte)55, 67);
         }
      }
   }

   @Generated
   public θλλιπβκΛ(ΨγημιδξΓτοθαζ var1, ρρΣηκοωβ var2) {
      this.I = var1;
      this.b = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 119L;
      var1 ^= -8208265634546011299L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(47 + 22),
                     (byte)(62 + 21),
                     (byte)(4 + 43),
                     (byte)(5 + 62),
                     (byte)(9 + 57),
                     (byte)(65 + 2),
                     (byte)(32 + 15),
                     (byte)(31 + 49),
                     (byte)(17 + 58),
                     (byte)(66 + 1),
                     83,
                     (byte)(26 + 27),
                     (byte)(45 + 35),
                     (byte)(63 + 34),
                     (byte)(56 + 44),
                     (byte)(24 + 76),
                     (byte)(99 + 6),
                     (byte)(69 + 41),
                     (byte)(61 + 42)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(24 + 45), (byte)(81 + 2)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μεςΩΔΣγν.C("ҽӊӉҌӌӈӃӌӗӆғӑӕӎӑӗҙࠣࠧࠨࠧ\u082fࠢࠫࠍ", (byte)55, 67));
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

   public void onSlashCommandInteraction(SlashCommandInteractionEvent var1) {
      SlashCommandInteraction var2 = var1.getInteraction();
      if (var2.getCommandType() == Type.SLASH) {
         if (var2.getFullCommandName().split(c<"㺀">(az & ba, bb))[bc].equals(c<"㺃">(bd, be))) {
            User var3 = var1.getUser();
            String var4 = var3.getId();
            OptionMapping var5 = var2.getOption(c<"㺆">(bf & bg, bh));
            String var6 = var5 != null ? var5.getAsString() : null;
            String var7;
            if (var6 == null || (var7 = (String)l.getIfPresent(var6)) == null) {
               String var21 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aI);
               String var23 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aJ);
               String var10 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aK);
               String var25 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aL);
               var1.reply(this.b.a(var21, var23, var10, var25).build()).queue();
               return;
            }

            ΨαχΨχΣλεΠψΦ var8 = this.I.b().a(var7);
            if (var8 == null) {
               String var22 = ςβικδπφδΣκ.m(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.u));
               var1.reply(var22).queue();
               return;
            }

            long var9 = βφμυζκζξβΛγΛζΩΠ.i.r();
            if (var3.getTimeCreated().isAfter(OffsetDateTime.now().minusSeconds(var9))) {
               String var24 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aE);
               String var27 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aF);
               String var28 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aG);
               String var29 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aH);
               var1.reply(this.b.a(var24, var27, var28, var29).build()).queue();
               return;
            }

            int var11 = βφμυζκζξβΛγΛζΩΠ.h.r();
            if (var11 > 0 && ιιιττκγβγβτωπ.e.a(this.I, var4) >= var11) {
               πωιψγηξΓρφυ var33 = πωιψγηξΓρφυ.al;
               Object[] var36 = new Object[br];
               var36[bs] = ιιιττκγβγβτωπ.e.u();
               εδδΠηδξΛΣχ.a(var8, var33, var36);
               πωιψγηξΓρφυ var31 = πωιψγηξΓρφυ.al;
               var36 = new Object[bt];
               var36[bu] = ιιιττκγβγβτωπ.e.u();
               String var26 = ςβικδπφδΣκ.m(εδδΠηδξΛΣχ.a(var31, var8, var36));
               var1.reply(var26).queue();
               return;
            }

            l.invalidate(var6);
            ιηοψσγξςΩγδ var12 = this.I.a().b(var8);
            στΩξξχκι var13 = var12.a();
            ψτχψηΛςαψΨγ var14 = var13.a();
            var14.c(var4);
            var14.c((boolean)(!var13.t() && !var13.u() ? bv : bw));
            ςθΓωΩπγΩΩΔβΨω var10000 = this.I.a();
            ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[bx];
            var10002[by] = ξξοηλξνΨ.k;
            var10002[bz] = ξξοηλξνΨ.l;
            var10000.a(var13, var10002);
            ΨγημιδξΓτοθαζ var30 = this.I;
            EventEnum var10001 = EventEnum.TWO_FACTOR_ADD;
            Object[] var34 = new Object[ca];
            var34[cb] = TwoFactorType.convert(ιιιττκγβγβτωπ.e);
            var34[cc] = var8;
            var34[cd] = var8.a();
            var34[ce] = var7;
            var34[cf] = var4;
            var30.a(var10001, var34);
            πωιψγηξΓρφυ var32 = πωιψγηξΓρφυ.az;
            Object[] var35 = new Object[cg];
            var35[ch] = c<"㺉">(ci, cj) + var3.getName();
            εδδΠηδξΛΣχ.a(var8, var32, var35);
            String var15 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aM, var8);
            String var16 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aN, var8);
            String var17 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aO, var8);
            String var18 = εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.aP, var8);
            var1.reply(this.b.a(var15, var16, var17, var18).build()).queue();
            κμΨχΩρεφπβ var19 = var12.d(πβκνλοΛκΠδΦτφλ.n);
            if (var19 != null) {
               εβοςοηΦςψμνςωξΛ var20 = var19.b();
               if (var20 instanceof ΩψωλΣνΩΛφυμ && ((ΩψωλΣνΩΛφυμ)var20).a() == ιιιττκγβγβτωπ.e) {
                  var20.b(this.I, var8, var12);
               }
            }
         }
      }
   }

   public void onButtonInteraction(@Nonnull ButtonInteractionEvent var1) {
      ButtonInteraction var2 = var1.getInteraction();
      if (var2.getChannelType() == ChannelType.PRIVATE) {
         String var3 = var2.getButton().getCustomId();
         if (var3 != null) {
            User var4 = var1.getUser();
            String var5 = var4.getId();
            String var6 = (String)l.getIfPresent(var5);
            if (var6 != null) {
               l.invalidate(var5);
               ΨαχΨχΣλεΠψΦ var7 = this.I.b().a(var6);
               if (var7 == null) {
                  String var15 = ςβικδπφδΣκ.m(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.u));
                  var1.reply(var15).queue();
               } else {
                  στΩξξχκι var8 = this.I.a().b(var7).a();
                  String var9 = ιιιττκγβγβτωπ.e.a(var8, null);
                  θνΛωΔπβψμαυΛυεχ var10 = ιιιττκγβγβτωπ.e.a(var8);
                  ιιιττκγβγβτωπ.e.a(var8, null, null);
                  if (var10 != null) {
                     if (var1.getMessage().getId().equals(var9)) {
                        int var12 = m;
                        switch (var3.hashCode()) {
                           case 3079692:
                              if (var3.equals(c<"㺀">(n, o ^ p))) {
                                 var12 = q;
                              }
                              break;
                           case 92906313:
                              if (var3.equals(c<"㺃">(r, s ^ t))) {
                                 var12 = u;
                              }
                        }

                        switch (var12) {
                           case 0:
                              var1.reply(c<"㺆">(v, w ^ x)).setEphemeral((boolean)y).queue();
                              String var16 = var7.ac();
                              int var14 = ΣλνΨουΩΔοθεβ.aa.r();
                              var8.a().a(c<"㺉">(z, aa) + var16, System.currentTimeMillis() + var14 * ab, var14, TimeUnit.MINUTES);
                              πωιψγηξΓρφυ var10001 = πωιψγηξΓρφυ.S;
                              Object[] var10002 = new Object[ac];
                              var10002[ad] = var14 + c<"㺌">(ae, af);
                              var7.a(εδδΠηδξΛΣχ.a(var10001, var10002));
                              ψΓωτιμωκχψΛΨ.e(
                                 εδδΠηδξΛΣχ.j()
                                    ? c<"㺏">(ag, ah) + var6 + c<"㺒">(ai, aj ^ ak) + var16 + c<"㺕">(al, am ^ an)
                                    : c<"㺘">(ao & ap, aq) + var6 + c<"㺛">(ar, as ^ at) + var16 + c<"㺞">(au, av ^ aw)
                              );
                              break;
                           case 1:
                              ιηοψσγξςΩγδ var13 = this.I.a().b(var7);
                              this.I.b((boolean)ay).a(() -> {
                                 switch (μησββνΣνν.ae[var10.ordinal()]) {
                                    case 1:
                                       if (ιιιττκγβγβτωπ.e.aH()) {
                                          var8.B();
                                       }

                                       String var8x = ιχωυζπψημωΔτΦθ.a(βλυςΓυφγζπΩΣΠΨτ.d, co);
                                       if (!this.I.a().c(var8, var8x)) {
                                          εδδΠηδξΛΣχ.a(var7, πωιψγηξΓρφυ.w);
                                          var1.reply(ςβικδπφδΣκ.m(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.w, var7))).queue();
                                          return;
                                       }

                                       ψΓωτιμωκχψΛΨ.b(c<"㺀">(cr & cs, ct) + var8.i() + c<"㺃">(cu & cv, cw));
                                       var13.a(πβκνλοΛκΠδΦτφλ.G, var8x);
                                       this.I.b().a(var8, var7, (boolean)cy, (boolean)cz);
                                       ρρΣηκοωβ var10001x = this.b;
                                       πωιψγηξΓρφυ var10002x = πωιψγηξΓρφυ.bc;
                                       Object[] var10004 = new Object[da];
                                       var10004[db] = var8x;
                                       String var10x = εδδΠηδξΛΣχ.a(var10002x, var7, var10004);
                                       πωιψγηξΓρφυ var10003 = πωιψγηξΓρφυ.bd;
                                       Object[] var10005 = new Object[dc];
                                       var10005[dd] = var8x;
                                       String var12x = εδδΠηδξΛΣχ.a(var10003, var7, var10005);
                                       πωιψγηξΓρφυ var13x = πωιψγηξΓρφυ.be;
                                       Object[] var10006 = new Object[de];
                                       var10006[df] = var8x;
                                       String var14x = εδδΠηδξΛΣχ.a(var13x, var7, var10006);
                                       πωιψγηξΓρφυ var15x = πωιψγηξΓρφυ.bf;
                                       Object[] var10007 = new Object[dg];
                                       var10007[dh] = var8x;
                                       var1.reply(var10001x.a(var10x, var12x, var14x, εδδΠηδξΛΣχ.a(var15x, var7, var10007)).build()).queue();
                                       break;
                                    case 2:
                                       κμΨχΩρεφπβ var6x = var13.d(πβκνλοΛκΠδΦτφλ.n);
                                       if (var6x != null) {
                                          εβοςοηΦςψμνςωξΛ var7x = var6x.b();
                                          if (var7x instanceof οχωηΛλςξΩνψ && ((οχωηΛλςξΩνψ)var7x).a() == ιιιττκγβγβτωπ.e) {
                                             var7x.b(this.I, var7, var13);
                                          }
                                       }

                                       var1.reply(ςβικδπφδΣκ.m(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.j, var7))).queue();
                                       break;
                                    default:
                                       throw new IllegalArgumentException(c<"㺆">(dj & dk, dl) + var10 + c<"㺉">(dm & dn, do));
                                 }

                                 ΨγημιδξΓτοθαζ var10000 = this.I;
                                 EventEnum var9x = EventEnum.TWO_FACTOR_AUTH;
                                 Object[] var11 = new Object[dp];
                                 var11[dq] = TwoFactorType.DISCORD;
                                 var11[dr] = var7;
                                 var11[ds] = var8.a().m();
                                 var10000.a(var9x, var11);
                              });
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
