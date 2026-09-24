package com.nickuc.login;

import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import io.netty.channel.Channel;
import io.papermc.paper.connection.PlayerConfigurationConnection;
import io.papermc.paper.event.connection.configuration.AsyncPlayerConnectionConfigureEvent;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;

public class ψισΦχλΛνυκΩνε implements ΦοιυξχςΩΦψξΓΣΨ {
   private static String[] b = new String[ψισΦχλΛνυκΩνε.bg];
   private static int ag = (2359296 >>> 210 | 2359296 << -210) & -1;
   private static int au = (2 >>> 127 | 2 << -127) & -1;
   private static int aq = -2147483647 >>> 127 | -2147483647 << -127;
   private static int as = Integer.reverse(-1);
   private static int bc = -1073741821 >>> 94 | -1073741821 << ~94 + 1;
   private static int e = (2048 >>> 235 | 2048 << ~235 + 1) & -1;
   private static long k = Long.reverse(-5248057393573910713L);
   private static int w = (-1 >>> 176 | -1 << ~176 + 1) & -1;
   private static int an = Integer.reverse(-805306368);
   private static int am = Integer.reverse(1073741824);
   private static int ak = (-1 >>> 166 | -1 << -166) & -1;
   private static long bd = Long.reverse(804780505612035911L);
   private static int r = 67108864 >>> 184 | 67108864 << ~184 + 1;
   private static long be = Long.reverse(-4899916394579099648L);
   private static long q = Long.reverse(-5248057393573910713L);
   private static int ai = (16777216 >>> 88 | 16777216 << -88) & -1;
   private static int i = 64 >>> 101 | 64 << -101;
   private static int o = (786432 >>> 242 | 786432 << ~242 + 1) & -1;
   private static int h = Integer.reverse(1073741824);
   private static long ac = Long.reverse(-5248057393573910713L);
   private static String[] a = new String[ψισΦχλΛνυκΩνε.bf];
   private static long m = Long.reverse(804780505612035911L);
   private static long n = Long.reverse(-4899916394579099648L);
   private static long aw = Long.reverse(-5248057393573910713L);
   private static long al = Long.reverse(-5248057393573910713L);
   private static int aj = (20 >>> 225 | 20 << -225) & -1;
   private static long ap = Long.reverse(-4899916394579099648L);
   private static long g = Long.reverse(-5248057393573910713L);
   private final ΨγημιδξΓτοθαζ f;
   private static long at = Long.reverse(-5248057393573910713L);
   private static int bf = Integer.reverse(134217728);
   private static int ad = Integer.reverse(0);
   private static int av = -2147483642 >>> 63 | -2147483642 << -63;
   private static int ay = Integer.reverse(1879048192);
   private static int y = (28 >>> 98 | 28 << -98) & -1;
   private static long x = Long.reverse(-5248057393573910713L);
   private static long u = Long.reverse(-5248057393573910713L);
   private static int af = Integer.reverse(0);
   private static int b = 0 >>> 46 | 0 << -46;
   private static int j = -1 >>> 209 | -1 << ~209 + 1;
   private static long c;
   private static int ar = Integer.reverse(805306368);
   private static int ab = (128 >>> 36 | 128 << ~36 + 1) & -1;
   private static int s = 1342177280 >>> 92 | 1342177280 << ~92 + 1;
   private static int v = 12582912 >>> 85 | 12582912 << ~85 + 1;
   private static int ae = Integer.reverse(-1610612736);
   private static int c = Integer.reverse(0);
   private static int bg = (16777216 >>> 84 | 16777216 << -84) & -1;
   private static long ba = Long.reverse(-4899916394579099648L);
   private static long aa = Long.reverse(-4899916394579099648L);
   private static long ao = Long.reverse(804780505612035911L);
   private static int f = (8388608 >>> 183 | 8388608 << ~183 + 1) & -1;
   private static int ax = 31457280 >>> 180 | 31457280 << -180;
   private static long z = Long.reverse(804780505612035911L);
   private static long ah = Long.reverse(-5248057393573910713L);
   private static long az = Long.reverse(804780505612035911L);
   private static int bb = Integer.reverse(0);
   private static long d = Long.reverse(-5248057393573910713L);
   private static int p = 4194304 >>> 52 | 4194304 << ~52 + 1;
   private static int t = Integer.reverse(-1);
   private static int l = Integer.reverse(-1073741824);
   private static int a = 160 >>> 5 | 160 << ~5 + 1;

   @EventHandler
   public void a(AsyncPlayerConnectionConfigureEvent var1) {
      PlayerConfigurationConnection var2 = var1.getConnection();
      Channel var3 = (Channel)SpigotReflectionUtil.getChannelFromPaperConnection(var1.getConnection());
      if (var3 == null) {
         String[] var10 = new String[a];
         var10[b] = c<"㺀">(c, d);
         var10[e] = c<"㺃">(f, g);
         var10[h] = c<"㺆">(i & j, k) + var1.getClass().getSimpleName() + c<"㺉">(l, m ^ n);
         var10[o] = c<"㺌">(p, q);
         var10[r] = c<"㺏">(s & t, u);
         var2.disconnect(ΩτωνοφχεΠ.a(βιχγΓλχΠσπ.a(var10)));
      } else {
         com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var4 = (com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ)var3.attr(com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a).get();
         if (var4 == null) {
            String var9 = c<"㺒">(v & w, x) + var2.getProfile().getName() + c<"㺕">(y, z ^ aa) + var1.getClass().getSimpleName() + c<"㺘">(ab, ac);
            ψΓωτιμωκχψΛΨ.c(var9);
            String[] var10001 = new String[ae];
            var10001[af] = c<"㺛">(ag, ah);
            var10001[ai] = c<"㺞">(aj & ak, al);
            var10001[am] = c<"㺡">(an, ao ^ ap) + var9;
            var10001[aq] = c<"㺤">(ar & as, at);
            var10001[au] = c<"㺧">(av, aw);
            var2.disconnect(ΩτωνοφχεΠ.a(βιχγΓλχΠσπ.a(var10001)));
         } else {
            CompletableFuture var5 = new CompletableFuture();
            if (this.f.b().a().a(var4.a, var1x -> var5.complete(null))) {
               try {
                  var5.get(ΣλνΨουΩΔοθεβ.E.r() + ax, TimeUnit.SECONDS);
               } catch (ExecutionException | TimeoutException var7) {
                  ψΓωτιμωκχψΛΨ.c(c<"㺪">(ay, az ^ ba), var7);
                  var2.disconnect(Component.text(c<"㺭">(bc, bd ^ be), NamedTextColor.RED));
               } catch (InterruptedException var8) {
               }
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 61L;
      var1 ^= -3846269386441864559L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(56 + 12),
                     (byte)(6 + 63),
                     (byte)(27 + 56),
                     47,
                     (byte)(55 + 12),
                     (byte)(61 + 5),
                     (byte)(30 + 37),
                     (byte)(41 + 6),
                     (byte)(54 + 26),
                     75,
                     (byte)(40 + 27),
                     (byte)(17 + 66),
                     (byte)(2 + 51),
                     (byte)(48 + 32),
                     (byte)(44 + 53),
                     (byte)(75 + 25),
                     (byte)(74 + 26),
                     (byte)(27 + 78),
                     (byte)(14 + 96),
                     (byte)(58 + 45)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.A("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҴҦұҕҷҬҍҰҹүҟҴҭ", (byte)46, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψισΦχλΛνυκΩνε.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζοηκορΦνΣθγΩ.F("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)7, 70), ψισΦχλΛνυκΩνε.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πψυκΠΨμΛΩβΣφμφσ.C("ЭкйϼмигмчжЃсхосчЉޣޕޠބަޛݼޟިޞގޣޜТ", (byte)7, 67) + var1 + ζβησεθωυγτ.A("Ç", (byte)7, 65) + var2.toString(), var4
         );
      }
   }

   @Generated
   public ψισΦχλΛνυκΩνε(ΨγημιδξΓτοθαζ var1) {
      this.f = var1;
   }

   static {
      b();
   }

   private static void b() {
      c = -2097458098663533360L;
      long var0 = c ^ -3846269386441864559L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(36 + 33),
               83,
               (byte)(24 + 23),
               (byte)(43 + 24),
               (byte)(51 + 15),
               (byte)(42 + 25),
               (byte)(9 + 38),
               (byte)(21 + 59),
               (byte)(38 + 37),
               (byte)(56 + 11),
               (byte)(27 + 56),
               (byte)(18 + 35),
               (byte)(8 + 72),
               (byte)(40 + 57),
               100,
               (byte)(11 + 89),
               (byte)(100 + 5),
               (byte)(47 + 63),
               (byte)(45 + 58)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
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
               b[0] = ΣφδσΔζιΠρα.B("ĊĐďĝĪûíĬĀĆġòòİĔóİùĞĠŀċĈĉ", (byte)27, 66);
               b[1] = ζοηκορΦνΣθγΩ.E("Ԉ\u0530ՈԑՀԎ\u0557ԷՋՕԕԟ", (byte)27, 69);
               b[2] = ΠΛΨοδΩσμνΛγΦφβς.C("ьђїѷѸяѤњџѝђсѴуѾџҐѦџҏ҈Ґѣђ҅҄ҚѤқѰќҘҒҔѵѳҝѸң҂ҕѺҟҟѡ҅҇ѭҌѻүҡҠѼѹѺ", (byte)27, 67);
               b[3] = ντθΔζβΔζ.C("ѧѩѸтѶўѳі҇џѡю", (byte)27, 67);
               b[4] = ΠΛΨοδΩσμνΛγΦφβς.F("Ԉ\u0530ՈԑՀԎ\u0557ԷՋՕԕԟ", (byte)27, 70);
               b[5] = ΨΦνΨΦωυΩνβςμ.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ\u0558՟ՐԮ\u0558ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅթդչնյՉՖիԿ՟փՊՋ", (byte)27, 70);
               b[6] = λΣΩσμφγχ.E("ՆԌԪՅԯԑԶՊՐԬՈԩԻԻԖԼԪ՟՞ՎՎԟ՞ՃԲԾՒՂբԪթՎՏՃՈՑՔԽՖմՆծծկՒՍիսսՙԸՒՏսծֆվՉռՕէջքդ", (byte)27, 69);
               b[7] = μεςΩΔΣγν.C("ѫѐѫѷѐћѯѤ҆ѕѕю", (byte)27, 67);
               b[8] = ξψθρΣΠΣς.A("ĉĊüğþĢĤðìĸĹĸĚĸėįúĒĊķĬÿĚĻĎğŉĶĺķĴčŋŏĪģďĿőĞķİġđŃňĵĬōěŉŢěĻĨĩ", (byte)27, 65);
               b[9] = μζξτΩσσφυδεπλΨ.E("ԬԲԱԿՌԝԏՎԢԨՃԔԔՒԶԕՒԛՀՂբԭԪԫ", (byte)27, 69);
               b[10] = βθκςνθΩθυμςτκχ.A("æĎĦïĞìĵĕĩĳóý", (byte)27, 65);
               b[11] = ντθΔζβΔζ.C("іѻѸѰєџѡѦѯќѷю", (byte)27, 67);
               b[12] = μεςΩΔΣγν.C("зџѷрѯн҆ѦѺ҄фю", (byte)27, 67);
               b[13] = δΛψπξκσβγςα.D("ѧѶѮѝлќоѝїѩѡѲ҂ўэ҇Ҏѿѝ҇ѲѥўҒяѡѢѓҎѹѫҐѝҌѫѡѫҤѻҧҀҖѴҘғҨҥҤѸ҅ҚѮҎҲѹѺ", (byte)27, 68);
               b[14] = ζοηκορΦνΣθγΩ.B("êùĮüĎđĵīĐčĈòĢíĉôþęċĉĎĖþİİğěģĔĜĞŌħĘčćĺŃĐĒĶįŃĒĸŒĳŊıľœĚĞĞŃĸĻŚňĻŔŗŃšĥŰŏŋűŠĪťŵŕĳĽ", (byte)27, 66);
               b[15] = οΩνΩρωλΨηΛδωδ.B("êùĮüĎđĵīĐčĈòĢíĉôþęċĉĎĖþİİğěģĔĜĞŌħĘčćĺŃĐĒĶįŃĒĸŒĳŊıľœĚĞĞŃĸĻŚňĻŔŗŃšĥŰŏŋűŠĪťŵŕĳĽ", (byte)27, 66);
               break;
            case 1:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.F("ԬԲԱԿՌԝԏՎԢԨՃ\u0558Ԧ\u0530՟ԟԲԘ՝ԭԣԽԪԫ", (byte)27, 70);
               b[1] = μζξτΩσσφυδεπλΨ.F("ՋՏՃՓԴԤՃԢԠԹՐԟ", (byte)27, 70);
               b[2] = μζξτΩσσφυδεπλΨ.D("ьђїѷѸяѤњџѝђсѴуѾџҐѦџҏ҈Ґѣђ҅҄ҚѤқѰќҘҒҔѵѳҝѸң҂ҕѺҟ҈ҫҕѫҎѷѪѺҒґѼѹѺ", (byte)27, 68);
               b[3] = ΣδτΠνεγοΓορητ.B("ĤîĚĩăĂăĔēįĘùęĚóĕĖĴĠĖÿŁĈĉ", (byte)27, 66);
               b[4] = μζξτΩσσφυδεπλΨ.C("ѾѼѴѾѤћѢѱѽуѳю", (byte)27, 67);
               b[5] = ςπυηννναΣ.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ\u0558՟ՐԮ\u0558ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅյռմՙ՟ՑՠլջՏՍՊՋ", (byte)27, 70);
               b[6] = φΨαξωυθανΣφυκη.A("ĤêĈģčïĔĨĮĊĦćęęôĚĈĽļĬĬýļġĐĜİĠŀĈŇĬĭġĦįĲěĴŒĤŌŌōİīŉśśķĖİĭőĤėŐŖşĥśŜŋĸ", (byte)27, 65);
               b[7] = βεξΠθρρςΔΦμ.E("ՅԿԽՌԿԐՉԕ\u0530ԲԢԟ", (byte)27, 69);
               b[8] = χφπρψπφΦθμπ.F("ԫԬԞՁԠՄՆԒԎ՚՛՚Լ՚ԹՑԜԴԬՙՎԡԼ՝\u0530Ձի\u0558՜ՙՖԯխձՌՅԱաճՀՙՒՅձՏԴՕ\u0557ԹՔձ՝\u0557քււմՓժ՚ԾւՌս", (byte)27, 70);
               b[9] = βθκςνθΩθυμςτκχ.A("ĊĐďĝĪûíĬĀĆęïĻĊîĩĭûİđģıĈĉ", (byte)27, 65);
               b[10] = ΣφδσΔζιΠρα.C("эѰѫрѠж҅џџѥѕю", (byte)27, 67);
               b[11] = ΣδτΠνεγοΓορητ.B("éîČĞñĮĉĄĩòĶý", (byte)27, 66);
               b[12] = φΨαξωυθανΣφυκη.F("ԡՒԐԩՌԦԥՃՐԕԪԟ", (byte)27, 70);
               b[13] = θεωψξβΛσσ.F("ԸՇԿԮԌԭԏԮԨԺԲՃՓԯԞ\u0558՟ՐԮ\u0558ՃԶԯգԠԲԳԤ՟ՊԼաԮ՝ԼԲԼյՌոՑէՅԷըՔՈէՎՑ՜ոԶփՊՋ", (byte)27, 70);
               b[14] = χφπρψπφΦθμπ.E("ԌԛՐԞ\u0530Գ\u0557ՍԲԯԪԔՄԏԫԖԠԻԭԫ\u0530ԸԠՒՒՁԽՅԶԾՀծՉԺԯԩ՜եԲԴ\u0558ՑեԴ՚մՕլՓՠյԼՀՀե՚՝ռժ՝նչեփՠ՞՟Ռ֓սՖիեմծ՟", (byte)27, 69);
               b[15] = φδχεθοκψαλΛογλ.F("ԌԛՐԞ\u0530Գ\u0557ՍԲԯԪԔՄԏԫԖԠԻԭԫ\u0530ԸԠՒՒՁԽՅԶԾՀծՉԺԯԩ՜եԲԴ\u0558ՑեԴ՚մՕլՓՠյԼՀՀե՚՝ռժ՝նչեփՍպ֊ֈռՌՏՉխֈՑ՟", (byte)27, 70);
               break;
            case 2:
               b[0] = ΦδφπθΩΩλζξ.B("ĪøģĄĲĉĔìđĒïý", (byte)27, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = οοθδΨιοΦΠβδζ.F("ՋԐԽԛՇՅԶՔՋԳԱ՜ԎԳԩ՟ԪՒՓ\u0530ՠՓԪԫ", (byte)27, 70);
         }
      }
   }
}
