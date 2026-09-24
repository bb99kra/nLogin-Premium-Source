package com.nickuc.login.proxy.bungee;

import com.nickuc.login.ΔχλΩψδλΛιχ;
import com.nickuc.login.ΠΛΨοδΩσμνΛγΦφβς;
import com.nickuc.login.ΣδτΠνεγοΓορητ;
import com.nickuc.login.ΣερμΔσατσκ;
import com.nickuc.login.ΣφδσΔζιΠρα;
import com.nickuc.login.ΦδφπθΩΩλζξ;
import com.nickuc.login.ΦτχπδσρχΓΨω;
import com.nickuc.login.ΨαχΨχΣλεΠψΦ;
import com.nickuc.login.ΨγημιδξΓτοθαζ;
import com.nickuc.login.ΨφιωσρΓδΔθ;
import com.nickuc.login.ΩψΨρεξοσΠςΛυ;
import com.nickuc.login.βεξΠθρρςΔΦμ;
import com.nickuc.login.βθκςνθΩθυμςτκχ;
import com.nickuc.login.δΛψπξκσβγςα;
import com.nickuc.login.ζβησεθωυγτ;
import com.nickuc.login.ζβκψγαωηκΠΠ;
import com.nickuc.login.ηβΨςλδθσΓξ;
import com.nickuc.login.ιΠοθΩΦξκ;
import com.nickuc.login.καΦζθθυυεφΦγ;
import com.nickuc.login.λΣΩσμφγχ;
import com.nickuc.login.μΦξβετδμγ;
import com.nickuc.login.μζξτΩσσφυδεπλΨ;
import com.nickuc.login.ξψθρΣΠΣς;
import com.nickuc.login.οεΦρΓψωΓξγΔι;
import com.nickuc.login.πργηπνπτΨζξσΓΓ;
import com.nickuc.login.πχσδΦΦνθΔπ;
import com.nickuc.login.πψυκΠΨμΛΩβΣφμφσ;
import com.nickuc.login.ρΣνμχγΨοΔΦ;
import com.nickuc.login.ςπυηννναΣ;
import com.nickuc.login.φΨαξωυθανΣφυκη;
import com.nickuc.login.φδχεθοκψαλΛογλ;
import com.nickuc.login.χΠξΦιζΨΣωΦσΨζ;
import com.nickuc.login.ωΓπκΩβςςδξΔν;
import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.bungee.connection.ServerPreConnectEvent;
import com.nickuc.login.loader.platform.BungeeLoader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerConnectRequest;
import net.md_5.bungee.api.ServerConnectRequest.Builder;
import net.md_5.bungee.api.ServerConnectRequest.Result;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.api.event.ServerConnectEvent.Reason;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

public class nLoginBungee extends πργηπνπτΨζξσΓΓ implements ΔχλΩψδλΛιχ, μΦξβετδμγ {
   private static int ay = Integer.reverse(268435456);
   private static long u = Long.reverse(432345564227567616L);
   private static int bb = Integer.reverse(-1073741824);
   private static int ci = (-1 >>> 169 | -1 << ~169 + 1) & -1;
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static long cg = Long.reverse(432345564227567616L);
   private static long aj = Long.reverse(4266730629119758534L);
   private static int ah = Integer.reverse(-1610612736);
   private static long q = Long.reverse(432345564227567616L);
   private ωΓπκΩβςςδξΔν a;
   private static int an = 393216 >>> 208 | 393216 << ~208 + 1;
   private static String[] c = new String[nLoginBungee.cp];
   private static long ac = Long.reverse(432345564227567616L);
   private static int cq = (24576 >>> 11 | 24576 << -11) & -1;
   private static long am = Long.reverse(432345564227567616L);
   private static int ca = Integer.reverse(0);
   private static int g = Integer.reverse(0);
   private static long h = Long.reverse(4410845817195614406L);
   private static int bq = ('耀' >>> 207 | 32768 << ~207 + 1) & -1;
   private static String[] d = new String[cq];
   private static long ab = Long.reverse(4266730629119758534L);
   private static long n = Long.reverse(4266730629119758534L);
   private static int m = (2097152 >>> 84 | 2097152 << ~84 + 1) & -1;
   private static long k = Long.reverse(4410845817195614406L);
   private static int cd = Integer.reverse(0);
   private static int au = 234881024 >>> 185 | 234881024 << ~185 + 1;
   private static int ch = (2621440 >>> 146 | 2621440 << ~146 + 1) & -1;
   private static long cf = Long.reverse(4266730629119758534L);
   private static long e;
   private static int ck = Integer.reverse(-805306368);
   private static int bn = Integer.reverse(1073741824);
   private static int r = Integer.reverse(-1073741824);
   private static int cb = Integer.reverse(Integer.MIN_VALUE);
   private static int cl = Integer.reverse(-1);
   private static int bc = Integer.reverse(0);
   private static int cp = -1073741824 >>> 156 | -1073741824 << ~156 + 1;
   private static int z = 4194304 >>> 244 | 4194304 << ~244 + 1;
   private static int br = (2 >>> 193 | 2 << -193) & -1;
   private static long av = Long.reverse(4410845817195614406L);
   private static long t = Long.reverse(4266730629119758534L);
   private static int bw = 0 >>> 38 | 0 << ~38 + 1;
   private static int ce = Integer.reverse(-1879048192);
   private static long cj = Long.reverse(4410845817195614406L);
   private static long cm = Long.reverse(4410845817195614406L);
   private static int co = Integer.reverse(0);
   private static int cc = Integer.reverse(Integer.MIN_VALUE);
   private static int bv = Integer.reverse(0);
   private static int ax = Integer.reverse(0);
   private static int bz = Integer.reverse(Integer.MIN_VALUE);
   private static int by = 0 >>> 107 | 0 << -107;
   private static long az = Long.reverse(4410845817195614406L);
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static long ap = Long.reverse(4266730629119758534L);
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static long as = Long.reverse(432345564227567616L);
   private static int cn = Integer.reverse(Integer.MIN_VALUE);

   @Override
   protected ρΣνμχγΨοΔΦ[] a() {
      return ΩψΨρεξοσΠςΛυ.values();
   }

   @Override
   protected void j() {
      this.a = new ωΓπκΩβςςδξΔν(this.a(), c<"㺀">(ay, az));
      super.j();
   }

   public nLoginBungee(BungeeLoader var1) {
      super(
         var1,
         c<"㺀">(g, h),
         new καΦζθθυυεφΦγ(c<"㺃">(j, k), c<"㺆">(m, n ^ q), c<"㺉">(r, t ^ u), c<"㺌">(z, ab ^ ac), c<"㺏">(ah, aj ^ am), c<"㺒">(an, ap ^ as), c<"㺕">(au, av))
      );
      this.a(new ΨγημιδξΓτοθαζ(new ζβκψγαωηκΠΠ(this), this, (boolean)ax));
   }

   @Nullable
   @Override
   public String a(ΨαχΨχΣλεΠψΦ var1) {
      ProxiedPlayer var2 = var1.c();
      Server var3 = var2.getServer();
      return var3 == null ? null : var3.getInfo().getName();
   }

   @Override
   public boolean a(ΨαχΨχΣλεΠψΦ var1) {
      if (!var1.R()) {
         return (boolean)bw;
      } else {
         ProxiedPlayer var2 = var1.c();
         return (boolean)(var2.getServer() != null ? bx : by);
      }
   }

   @Override
   public ηβΨςλδθσΓξ a(ΨαχΨχΣλεΠψΦ var1, String var2, ServerConnectType var3, @Nullable ΦτχπδσρχΓΨω<Boolean> var4) {
      if (!var1.R()) {
         return ηβΨςλδθσΓξ.c;
      } else {
         ServerInfo var5 = this.a().getServerInfo(var2);
         if (var5 == null) {
            return ηβΨςλδθσΓξ.c;
         } else {
            ProxiedPlayer var6 = var1.c();
            ΨγημιδξΓτοθαζ var10000 = this.a();
            EventEnum var10001 = EventEnum.SERVER_PRE_CONNECT;
            Object[] var10002 = new Object[bb];
            var10002[bc] = var1;
            var10002[bm] = var3;
            var10002[bn] = var5;
            ServerPreConnectEvent var7 = var10000.a(var10001, var10002);
            if (!this.a().callEvent(var7)) {
               return ηβΨςλδθσΓξ.b;
            } else {
               var5 = var7.getServer();
               Server var8 = var6.getServer();
               if (var8 != null && var5.equals(var8.getInfo())) {
                  if (var4 != null) {
                     var4.done(Boolean.valueOf((boolean)bq));
                  }

                  return ηβΨςλδθσΓξ.a;
               } else {
                  Builder var9 = ServerConnectRequest.builder().target(var5).reason(Reason.PLUGIN);
                  if (var4 == null) {
                     var9.callback(
                        (var3x, var4x) -> {
                           if (var3x != Result.SUCCESS && var3x != Result.ALREADY_CONNECTED) {
                              String var5x = var6.getGroups().contains(c<"㺀">(ce, cf ^ cg))
                                 ? var4x.getClass().getSimpleName() + c<"㺃">(ch & ci, cj) + var4x.getMessage()
                                 : var4x.getClass().getName();
                              ProxyServer var10001x = this.a();
                              String var10002x = c<"㺆">(ck & cl, cm);
                              Object[] var10003 = new Object[cn];
                              var10003[co] = var5x;
                              var1.a(var10001x.getTranslation(var10002x, var10003));
                           }
                        }
                     );
                  } else {
                     var9.callback(
                        (var1x, var2x) -> var4.done(Boolean.valueOf((boolean)(var1x != Result.SUCCESS && var1x != Result.ALREADY_CONNECTED ? cd : cc)))
                     );
                  }

                  var6.connect(var9.build());
                  return ηβΨςλδθσΓξ.a;
               }
            }
         }
      }
   }

   @Override
   public boolean callEvent(Object var1) {
      this.a().getPluginManager().callEvent((Event)var1);
      return (boolean)(var1 instanceof Cancellable && ((Cancellable)var1).isCancelled() ? ca : bz);
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 96L;
      var1 ^= 7412868065086757135L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(64 + 4),
                     (byte)(19 + 50),
                     (byte)(23 + 60),
                     (byte)(42 + 5),
                     (byte)(52 + 15),
                     (byte)(33 + 33),
                     (byte)(24 + 43),
                     (byte)(9 + 38),
                     (byte)(21 + 59),
                     (byte)(72 + 3),
                     (byte)(25 + 42),
                     (byte)(44 + 39),
                     (byte)(51 + 2),
                     80,
                     (byte)(6 + 91),
                     100,
                     (byte)(80 + 20),
                     (byte)(70 + 35),
                     (byte)(40 + 70),
                     (byte)(33 + 70)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), (byte)(10 + 73)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πχσδΦΦνθΔπ.C("ҙҦҥѨҨҤҟҨҳҢѯҭұҪҭҳѵҷҺҸӂӄѻүӃҽҷҶҷ҂ӂҡӅҾӁӇҜӐӊӄӃӄ", (byte)43, 67));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   @Generated
   @Override
   public ωΓπκΩβςςδξΔν a() {
      return this.a;
   }

   @Override
   public οεΦρΓψωΓξγΔι b() {
      return this.a((boolean)cb);
   }

   @Override
   public ΨγημιδξΓτοθαζ a() {
      return super.b();
   }

   private static void b() {
      e = 7136638834675969244L;
      long var0 = e ^ 7412868065086757135L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(45 + 24),
               (byte)(16 + 67),
               (byte)(23 + 24),
               (byte)(20 + 47),
               (byte)(49 + 17),
               (byte)(11 + 56),
               (byte)(4 + 43),
               (byte)(51 + 29),
               75,
               (byte)(56 + 11),
               (byte)(27 + 56),
               (byte)(35 + 18),
               (byte)(32 + 48),
               97,
               (byte)(38 + 62),
               (byte)(79 + 21),
               (byte)(84 + 21),
               (byte)(80 + 30),
               (byte)(72 + 31)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(67 + 2), (byte)(17 + 66)}, StandardCharsets.UTF_8));
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
               d[0] = βθκςνθΩθυμςτκχ.B("ĺĳĤĬľĺċĴĎĀĐĉ", (byte)33, 66);
               d[1] = ΨφιωσρΓδΔθ.F("ԿԯՐԺԙՖԒԙԸՍԿԭԽԕՕ՚\u0530ՀթՒՖԧդՃԽծՄՊգԥդՏ", (byte)33, 70);
               d[2] = φΨαξωυθανΣφυκη.C("ѱьхҁѐѠѩ҇ѬѨҚ҈ҐєґѵҗѸҔҜѢќѥѦ҄ҤңѷѧҦѮңҰҊѩѽҢҢҎҦѸҧѭѶҋҝҏҮҡҷ҃ҥҳҴһҐҧ҇ӅӉӀҚӃҽҭҰңҜӌңҏӀӄҐәҸӜҲҚҹӉҹӘӟқӆӚҿӄӟӞӁӊҺҨӧ", (byte)33, 67);
               d[3] = ΣδτΠνεγοΓορητ.F(
                  "ԍԤ\u0557\u0558ԧԻԗԧԼԬՠԻԵՠՠՍաեԦԟըՀՁթՀԪ՜Ղ՛կՏԾՅՖՑՓժՌՉՇզվռՠՂՐՠֆԸյթցէզթւժբՉ\u058bդզօևյփՠ\u058bջ֙ևՔֈ֛ծ֖չ՝֛֤ՠփ՟֡ռբ֭֠րռժթֳ֑ժ֠", (byte)33, 70
               );
               d[4] = φΨαξωυθανΣφυκη.E(
                  "Ոԣԭ՚ՐՐ\u0530ԾՊԩ\u0557ԿԺԛԠԮԷՄՙթԣՀժթԦԷՎԹագհԿՎԩԳԶճԺՏվղՉԷԸԹԾ\u0558Ցց՜ճճվյ՟նՉՈպ՟պվթյ֒֓յ\u0590մ֚ձչպի֠՚֚ճ֎\u0557֔շ֑֚֮֨֨֘֜կք֒օ֪֦֩", (byte)33, 69
               );
               d[5] = ΣφδσΔζιΠρα.E(
                  "ՂԐԯԬԑԸԖՇ\u0558ԕԗԟԳԝՃԞդԞ՝Գ՚ԥլՃՃՋծհ՚՞ԯհՆՊԯՈԵղլհզ\u0557նԿՊղՃՔհյ՜վև՛ըՃե՟Րդ՚ըցծ֕֕\u0557յեՙթմճ֟իժ֕ս֏կկ֖֘ն֧֕\u058bօեֈրօժ֤֫ֆ", (byte)33, 69
               );
               d[6] = φΨαξωυθανΣφυκη.B("ıęĲĝĲĿûķĴęĕĔĳđćĢņĆŅīĩŉŌōġħńŐŇŗĠĭęřęŇřįœĠşĝĝĺĽŧĽĵŃŁĵŤŃřŐĬűśŪŔŃŠŃŗŹŤŴūŊřŬŝŷľĶŜőŶšŘżƆŵƌŅŘƇƋƉūŊƌŬƐŵƅ", (byte)33, 66);
               d[7] = δΛψπξκσβγςα.B("ĊįĖĬĺĎüĊĕıđĴĒĿġğłņĪŃŊĻĭľċĭĮĶĞńřħĹŗŎĲĿĘŜľĸĲőĞĠķĚıŖĵļŁřňħőņŧūŅĳţķňĬőūĴŪűşŏŊĿŵŷƀƁŕżŁťŠŠƀśūŬŮƌƍşƓƑŴź", (byte)33, 66);
               d[8] = φδχεθοκψαλΛογλ.D("҆ш҆ҍҒѪѮҎѰѦҌѳѶѼѧѰѽҐѶҤҚѾѫѬ", (byte)33, 68);
               d[9] = ξψθρΣΠΣς.D("ѣѪҍѨғѓѳѭѮҔѻѠ", (byte)33, 68);
               d[10] = πψυκΠΨμΛΩβΣφμφσ.D("ѪѺхҁѲѰѨѧҗѮ҅Ѡ", (byte)33, 68);
               d[11] = ςπυηννναΣ.A("đõĤķĕĐĉķþĹĹŁĿļĴĝģŃĊėĖėĔĕ", (byte)33, 65);
               break;
            case 1:
               d[0] = ΣερμΔσατσκ.D("ѿќѻѤѶѶѱѓғѸҙюѝњњѬҡѫ҄ҔґҔѫѬ", (byte)33, 68);
               d[1] = χΠξΦιζΨΣωΦσΨζ.F("ԿԯՐԺԙՖԒԙԸՍԿԭԽԕՕ՚\u0530ՀթՒՖԣ՞իիՅ\u0530լՃՉդա", (byte)33, 70);
               d[2] = δΛψπξκσβγςα.D("ѱьхҁѐѠѩ҇ѬѨҚ҈ҐєґѵҗѸҔҜѢќѥѦ҄ҤңѷѧҦѮңҰҊѩѽҢҢҎҦѸҧѭѶҋҝҏҮҡҷ҃ҥҳҴһҐҧ҇ӅӉӀҚӃҽҭҰңҜӌңҏӀӄҐәҸӜҲҚҹӉҹӘӟқҾҶӂӉӤӥҧҩҿҼӝ", (byte)33, 68);
               d[3] = ΦδφπθΩΩλζξ.B("ñĈĻļċğûċĠĐńğęńńıŅŉĊăŌĤĥōĤĎŀĦĿœĳĢĩĺĵķŎİĭīŊŢŠńĦĴńŪĜřōťŋŊōŦŎņĭůňŊũūřŧńůşŽūĸŬſŒźŝŁſƈńŧŃƅŠōŢŎŞƏņƖűƅƇŮ", (byte)33, 66);
               d[4] = βθκςνθΩθυμςτκχ.D("҃ўѨҕҋҋѫѹ҅ѤҒѺѵіћѩѲѿҔҤўѻҥҤѡѲ҉ѴҜҞҫѺ҉ѤѮѱҮѵҊҹҭ҄ѲѳѴѹғҌҼҗҮҮҹҰҚұ҄҃ҵҚҵҹҤҰӍӎҰӋүӕҬҴҵҦӛҕӕҮӉҒӏҲӌӣӕӛҤҼӚӜҥҩӪҽҨӉ", (byte)33, 68);
               d[5] = ζβησεθωυγτ.A("ĦôēĐõĜúīļùûăėāħĂňĂŁėľĉŐħħįŒŔľłēŔĪĮēĬęŖŐŔŊĻŚģĮŖħĸŔřŀŢūĿŌħŉŃĴňľŌťŒŹŹĻřŉĽōŘŗƃŏŎŹšųœœźżŚƋŮŝƂźŮŜƅƍƋŹŐ", (byte)33, 65);
               d[6] = πψυκΠΨμΛΩβΣφμφσ.A("ıęĲĝĲĿûķĴęĕĔĳđćĢņĆŅīĩŉŌōġħńŐŇŗĠĭęřęŇřįœĠşĝĝĺĽŧĽĵŃŁĵŤŃřŐĬűśŪŔŃŠŃŗŹŤŴūŊřŬŝŷľĶŜőŶšŘżƆŵƌŅŜŏŢūŐƇƄƉţŊƌ", (byte)33, 65);
               d[7] = βεξΠθρρςΔΦμ.E("ԦՋԲՈՖԪԘԦԱՍԭՐԮ՛ԽԻ՞բՆ՟զ\u0557Չ՚ԧՉՊՒԺՠյՃՕճժՎ՛Դո՚ՔՎխԺԼՓԶՍղՑ\u0558՝յդՃխբփևաՏտՓդՈխևՐֆ֍ջիզ՛֑֓֜֝ձ֘՝ցռռ֜շ֝րծ֞ծտֲ֚մ֊", (byte)33, 69);
               d[8] = ΠΛΨοδΩσμνΛγΦφβς.A("įñįĶĻēėķęďĵŁĹĔĄŅĆĊġĨņėĔĕ", (byte)33, 65);
               d[9] = ιΠοθΩΦξκ.C("ѺѫѩѼѬѳҒєҕѹѥѭѬҟ҈ѵѵҡ҄ѝҀҔѫѬ", (byte)33, 67);
               d[10] = ιΠοθΩΦξκ.A("ćīąćČýıįøāĶĉ", (byte)33, 65);
               d[11] = πψυκΠΨμΛΩβΣφμφσ.E("ԭԑՀՓԱԬԥՓԚՕՕԡԱ՜ՍԷԢզԴՂԧԤՍբՠԡԬ՞ԺՈ\u0530Պ", (byte)33, 69);
               break;
            case 2:
               d[0] = ΦδφπθΩΩλζξ.F("ՋԦՂԭՊՃԕԴՔԞԾԓԷՀԯԝՒՅԚԲԡՙ\u0530Ա", (byte)33, 70);
            case 3:
            default:
               break;
            case 4:
               d[0] = ζβησεθωυγτ.E("ԞԨՈԬԹԮԎ՚ՙՑՎԥ", (byte)33, 69);
         }
      }
   }

   @Override
   public boolean t(String var1) {
      return (boolean)(this.a().getServerInfo(var1) != null ? br : bv);
   }

   @Override
   public Class<?> getPlayerClass() {
      return ProxiedPlayer.class;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  nLoginBungee.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(μζξτΩσσφυδεπλΨ.A("ŏűųœŷƖƎƤƐşƝƓơƛŤƉƫƪƢƨƢŷ", (byte)84, 65), nLoginBungee.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ιΠοθΩΦξκ.C("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰԲԵԳԽԿӶԪԾԸԲԱԲӽԽԜՀԹԼՂԗՋՅԿԾԿԕ", (byte)84, 67) + var1 + λΣΩσμφγχ.D("ӫ", (byte)84, 68) + var2.toString(), var4
         );
      }
   }
}
