package com.nickuc.login;

import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;

public class NLoginCore_230 implements NLoginCore_277 {
   private static long bg = Long.reverse(-2161727821137838080L);
   private static String[] a = new String[NLoginCore_230.bt];
   private static int v = (16384 >>> 174 | 16384 << ~174 + 1) & -1;
   private static long c;
   private static long d = Long.reverse(6429092310230726542L);
   private static int bq = 262144 >>> 146 | 262144 << -146;
   private static int br = Integer.reverse(0);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int bj = Integer.reverse(-1);
   private static long ap = Long.reverse(-2161727821137838080L);
   private static int ad = Integer.reverse(-1610612736);
   private static int an = 8192 >>> 10 | 8192 << -10;
   private final ProxiedPlayer a;
   private static int m = Integer.reverse(-1073741824);
   private final UUID e = UUID.randomUUID();
   private static int bu = Integer.reverse(-268435456);
   private static long k = Long.reverse(6429092310230726542L);
   private static int r = 524288 >>> 243 | 524288 << ~243 + 1;
   private static int ax = Integer.reverse(1073741824);
   private static int av = Integer.reverse(1342177280);
   private static long bb = Long.reverse(6429092310230726542L);
   private static long at = Long.reverse(6429092310230726542L);
   private static int q = 1504 >>> 101 | 1504 << -101;
   private static int az = 16777216 >>> 120 | 16777216 << ~120 + 1;
   private static int ag = (128000 >>> 202 | 128000 << ~202 + 1) & -1;
   private static long aw = Long.reverse(-4956007547761887346L);
   private static int bl = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int bs = (0 >>> 41 | 0 << ~41 + 1) & -1;
   private static long ao = Long.reverse(6429092310230726542L);
   private final boolean R;
   private static long ae = Long.reverse(6429092310230726542L);
   private static long aj = Long.reverse(-2161727821137838080L);
   private static int aq = Integer.reverse(-1073741824);
   private static int bh = Integer.reverse(0);
   private static int u = Integer.reverse(0);
   private static int bp = Integer.reverse(1073741824);
   private static int j = (67108864 >>> 57 | 67108864 << ~57 + 1) & -1;
   private static int ba = Integer.reverse(-805306368);
   private static int bt = Integer.reverse(-268435456);
   private static int bi = Integer.reverse(-1342177280);
   private static long bn = Long.reverse(6429092310230726542L);
   private static int b = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int p = Integer.reverse(0);
   static final Map<ProxiedPlayer, NLoginCore_230> c = new ConcurrentHashMap<>();
   private static int ar = 262144 >>> 50 | 262144 << -50;
   private static int bm = -536870912 >>> 156 | -536870912 << ~156 + 1;
   private final NLoginCore_383 b;
   private final ProxyServer c;
   private static long ai = Long.reverse(6429092310230726542L);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long bf = Long.reverse(6429092310230726542L);
   private static long bc = Long.reverse(-2161727821137838080L);
   private static int bd = Integer.reverse(-1);
   private static int w = 0 >>> 122 | 0 << -122;
   private static long af = Long.reverse(-2161727821137838080L);
   private static long bk = Long.reverse(-4956007547761887346L);
   private static long bo = Long.reverse(-2161727821137838080L);
   private static long n = Long.reverse(-4956007547761887346L);
   private static long ac = Long.reverse(-4956007547761887346L);
   private static int ah = (100663296 >>> 88 | 100663296 << -88) & -1;
   private static long l = Long.reverse(-2161727821137838080L);
   private static long al = Long.reverse(6429092310230726542L);
   private static int o = 1024 >>> 41 | 1024 << ~41 + 1;
   private static int ay = (0 >>> 79 | 0 << ~79 + 1) & -1;
   private static long e = Long.reverse(-2161727821137838080L);
   private static int ab = Integer.reverse(-1);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static String[] b = new String[bu];
   private static int as = (1073741826 >>> 62 | 1073741826 << -62) & -1;
   private static long g = Long.reverse(-4956007547761887346L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int s = 268435456 >>> 188 | 268435456 << -188;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = (469762048 >>> 154 | 469762048 << -154) & -1;
   private static long au = Long.reverse(-2161727821137838080L);
   private static int y = (0 >>> 53 | 0 << ~53 + 1) & -1;
   private static int aa = Integer.reverse(536870912);
   private static int be = (25165824 >>> 85 | 25165824 << -85) & -1;
   private NLoginInterface_023 a;
   private static long am = Long.reverse(-2161727821137838080L);
   private static int x = Integer.reverse(1073741824);

   @Override
   public void n(String var1) {
      this.a.setDisplayName(var1);
   }

   @Override
   public void l(String var1) {
      if (var1.length() >= o && var1.charAt(p) == q) {
         var1 = var1.substring(r);
      }

      this.c.getPluginManager().dispatchCommand(this.a, var1);
   }

   public static NLoginCore_230 a(NLoginCore_383 var0, ProxyServer var1, Object var2) {
      if (var2 instanceof String) {
         String var3 = ((String)var2).toLowerCase(Locale.ENGLISH);
         ProxiedPlayer var4 = var1.getPlayer(var3);
         return var4 == null ? null : a(var0, var1, var4);
      } else if (var2 instanceof ProxiedPlayer) {
         return a(var0, var1, (ProxiedPlayer)var2);
      } else {
         throw new IllegalArgumentException(
            a(ah, ai ^ aj) + var2 + a(ak, al ^ am) + (var2 != null ? var2.getClass().getCanonicalName() : a(an, ao ^ ap))
         );
      }
   }

   @Override
   public void ad() {
      this.a.sendTitle(this.c.createTitle().reset());
   }

   @Override
   public void o(String var1) {
      this.a.sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(NLoginCore_065.f(var1, (boolean)h)));
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         NLoginCore_230 var2 = (NLoginCore_230)var1;
         return (boolean)(Objects.equals(this.e, var2.e) && Objects.equals(this.a, var2.a) ? v : w);
      } else {
         return (boolean)u;
      }
   }

   @Override
   public NLoginInterface_023 a() {
      if (this.a == null) {
         this.a = new NLoginCore_571(this);
      }

      return this.a;
   }

   @Override
   public UUID a() {
      return this.a.getUniqueId();
   }

   private static NLoginCore_230 a(NLoginCore_383 var0, ProxyServer var1, ProxiedPlayer var2) {
      NLoginCore_230 var3 = c.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         if (NLoginCore_370.aj()) {
            StackTraceElement[] var4 = new Exception().getStackTrace();
            String var5 = var4.length > 0 ? var4[Math.min(aq, var4.length - ar)].toString() : a(as, at ^ au);
            String var10000 = a(av, aw);
            Object[] var10001 = new Object[ax];
            var10001[ay] = var2.getName();
            var10001[az] = var5;
            NLoginCore_370.c(var10000, var10001);
         }

         return b(var0, var1, var2);
      }
   }

   private static void b() {
      c = 8209779327812574362L;
      long var0 = c ^ -5485751540715143110L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(49 + 19),
               (byte)(40 + 29),
               (byte)(21 + 62),
               (byte)(30 + 17),
               (byte)(58 + 9),
               (byte)(9 + 57),
               (byte)(42 + 25),
               (byte)(25 + 22),
               (byte)(14 + 66),
               (byte)(64 + 11),
               (byte)(31 + 36),
               (byte)(17 + 66),
               (byte)(5 + 48),
               (byte)(4 + 76),
               (byte)(16 + 81),
               100,
               (byte)(50 + 50),
               (byte)(72 + 33),
               (byte)(52 + 58),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_575.F("ԷӾԼԉԍԛՀԬԍԯԔԤՆՏԥԬՃ\u0557ԚՉԺՐ՜ԜԱեՕ՜՚ԻՓՖթ՜ի՞ՄՀԼ\u0530՛ԽգԺ", (byte)22, 70);
               b[1] = NLoginCore_387.F("ՁԸԜՀԋՈԡՑՏՌԿԚ", (byte)22, 70);
               b[2] = NLoginCore_232.A("ÿĞÿġĩĄòÝĉěċĜĚĚįĐĨþĶĈĬĔķķĚöþīĵĊĂĬģēĜļńĸĀĜĚĚňē", (byte)22, 65);
               b[3] = NLoginCore_027.E("ԷӾԼԉԍԛՀԬԍԯԇԎԏԤԏ\u0530ԻԗԚԿ՞ա\u0557ԼՍՌ՞ԴԵգ\u0557Ք", (byte)22, 69);
               b[4] = NLoginCore_092.C("ѫѠсѱвѐщѕжЫьюиѾѸѼлєђтѢѻїѰљѝѕчо҈ѺѮѝѹѫѢҏѱґҌєѓѦџ", (byte)22, 67);
               b[5] = NLoginCore_521.B("ĞâãÞûĉúĬĝĄįĊĮĚĮĐëĐĲĠĩāþÿ", (byte)22, 66);
               b[6] = NLoginCore_091.A("Đ×ĕâæôęąæĈäíĉîûĔĆîÿččĦñĦùĵĐùĳøþýŀİĢĽŉĆĆĥĤņĚē", (byte)22, 65);
               b[7] = NLoginCore_232.B("ĚđõęäġúĪĨĥĘó", (byte)22, 66);
               b[8] = NLoginCore_559.F("ԄԩՋՈԩԩՂԄԬԳԌԚ", (byte)22, 70);
               b[9] = NLoginCore_223.E("ԪԇԷԶՉԐՍՅՈԞՃԚ", (byte)22, 69);
               b[10] = NLoginCore_223.B("øßĐÝèĖĩæĠčĠáĞĄĊñďįôĴîīìČĚĻĹÿįĩģěŀĢĤĂıĴŀńČėČĸłŃŌĊŊŀğēġĐŐħŒŚşřŝķŌĢķŀŅňĚĶśšĺĹĮŅįřŤıųĲĬŰŪńŤŘĵķŒŷŪůŜŔ", (byte)22, 66);
               b[11] = NLoginCore_201.B("ďĒĘçđĚÿēĕģďþĞĝăċīĪĖĒĕāþÿ", (byte)22, 66);
               b[12] = NLoginCore_141.B("ÚÿåğĀĆàûāĕćøĠÿèēĉıčîĀķþÿ", (byte)22, 66);
               b[13] = NLoginCore_384.C("ъѭѰфџыѵѧѳѐдѣѻќўѠкѡѪѳѴѳъы", (byte)22, 67);
               b[14] = NLoginCore_138.D("ЯЫьсѝрЭєчђѦњмѩјѶєѡоііѳъы", (byte)22, 68);
               break;
            case 1:
               b[0] = NLoginCore_433.B("Đ×ĕâæôęąæĈíýğĨþąĜİóĢēĩĵõĊľĮĵĳĔĬįöěıāĸŅńĕĪŌĖē", (byte)22, 66);
               b[1] = NLoginCore_027.C("иѐпбгѭъьёѩтп", (byte)22, 67);
               b[2] = NLoginCore_183.C("ыѪыѭѵѐоЩѕѧїѨѦѦѻќѴъ҂єѸѠ҃҃ѦтъѷҁіюѸыѝъғѢҏҕҖ҈їљџ", (byte)22, 67);
               b[3] = NLoginCore_173.B("Đ×ĕâæôęąæĈàçèýèĉĔðóĘķķĬôįęĶĚĜĖđùÿĵĵŇłĉėėþīŀē", (byte)22, 66);
               b[4] = NLoginCore_553.A("ğĔõĥæĄýĉêßĀĂìĲĬİïĈĆöĖįċĤčđĉûòļĮĢĬĦĎŀąĠľĬĿąąē", (byte)22, 65);
               b[5] = NLoginCore_223.E("ՅԉԊԅԢ\u0530ԡՓՄԫՔՒԭՒԧԤԗԙԜԩՇԨԥԦ", (byte)22, 69);
               b[6] = NLoginCore_384.A("Đ×ĕâæôęąæĈäíĉîûĔĆîÿččĦñĦùĵĐùĳøþýúēĤĹěĚĚġĵċĢē", (byte)22, 65);
               b[7] = NLoginCore_141.F("ԊԣՄԦԝԦԭԊԏԳԵԚ", (byte)22, 70);
               b[8] = NLoginCore_127.D("ЪкѝѝѐьяѢѸѮђп", (byte)22, 68);
               b[9] = NLoginCore_183.F("ՅԕՋԈՎԞՌԦՉՆՆԭՒՔԶՒԸ՜ԯԙՓԸԥԦ", (byte)22, 70);
               b[10] = NLoginCore_384.C(
                  "фЫќЩдѢѵвѬљѬЭѪѐінћѻрҀкѷијѦ҇҅ыѻѵѯѧҌѮѰюѽҀҌҐјѣј҄ҎҏҘіҖҌѫџѭќҜѳҞҦҫҥҩ҃ҘѮ҃ҌґҔѦ҂ҧҭ҆҅ѺґѻҥҰѽҿѾѸҼҶҘӀҴӁҜҒҞҙҍҎ҇ҞҝҬүҭӅҡӗӁҹҪҟ", (byte)22, 67
               );
               b[11] = NLoginCore_076.A("ďĒĘçđĚÿēĕģĖĨíīĎþíćĨćĐćđøęĒįĈòķĢī", (byte)22, 65);
               b[12] = NLoginCore_521.F("ԁԦԌՆԧԭԇԢԨԼԯՖՔՕՇ\u0557ՃՉԷԛ՝Բ՚՜ԣՐԼ՞\u0530ԹԽե", (byte)22, 70);
               b[13] = NLoginCore_575.A("þġĤøēÿĩěħĄåĢđĈĪćĮçĀĔāāþÿ", (byte)22, 65);
               b[14] = NLoginCore_241.F("ԊԆԧԜԸԛԈԯԢԭՂԣԫՊՁԪՅԒՇԾԻԟՖԝԫԿՄզՈՃԹԦ", (byte)22, 70);
               break;
            case 2:
               b[0] = NLoginCore_232.D("рыѳщсѧрзхѐггијњѽрўѫмњѻѣѷјруѹѩѧѻҊ", (byte)22, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_433.A("ãÝäÞĘĢĀĤĢĤĠ÷ĬëïÿģĞĳĥĠĳúĊĜĹľĩĝĴĵġ", (byte)22, 65);
         }
      }
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[x];
      var10000[y] = this.e;
      var10000[z] = this.a;
      return Objects.hash(var10000);
   }

   @Override
   public void p(String var1) {
      this.a.chat(var1);
   }

   @Override
   public boolean R() {
      return this.a.isConnected();
   }

   @Override
   public Optional<String> a() {
      return Optional.ofNullable(this.a.getLocale()).map(Locale::toLanguageTag);
   }

   @Override
   public void d(Object var1) {
      if (var1 instanceof String) {
         this.a.sendMessage(TextComponent.fromLegacyText(NLoginCore_065.f((String)var1, (boolean)b)));
      } else {
         if (!(var1 instanceof TextComponent)) {
            throw new IllegalArgumentException(a(c, d ^ e) + var1 + a(f, g) + var1.getClass().getCanonicalName());
         }

         this.a.sendMessage((TextComponent)var1);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginInterface_011<?> var1, NLoginCore_337 var2, Object var3, byte[] var4) {
      if (!(var3 instanceof String)) {
         throw new IllegalArgumentException(a(j, k ^ l));
      } else if (this.a.isConnected()) {
         switch (NLoginCore_569.q[var2.ordinal()]) {
            case 1:
               this.a.sendData((String)var3, var4);
               break;
            case 2:
               Server var5 = this.a.getServer();
               if (var5 != null) {
                  var5.sendData((String)var3, var4);
               }
               break;
            default:
               throw new IllegalArgumentException(a(m, n) + var2);
         }
      }
   }

   @Override
   public NLoginInterface_022 a() {
      return this.b.a((boolean)a);
   }

   private static String a(int var0, long var1) {
      var1 ^= 71L;
      var1 ^= -5485751540715143110L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(43 + 25),
                     (byte)(56 + 13),
                     (byte)(72 + 11),
                     (byte)(34 + 13),
                     (byte)(64 + 3),
                     66,
                     67,
                     (byte)(35 + 12),
                     (byte)(65 + 15),
                     (byte)(23 + 52),
                     (byte)(42 + 25),
                     (byte)(62 + 21),
                     (byte)(50 + 3),
                     (byte)(58 + 22),
                     (byte)(8 + 89),
                     (byte)(82 + 18),
                     (byte)(72 + 28),
                     (byte)(92 + 13),
                     (byte)(109 + 1),
                     (byte)(100 + 3)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_553.B("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżӡԉԕԏԓԚԏԈԎԘԚӿ", (byte)95, 66));
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
                  NLoginCore_230.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.E("ӻԝԟӿԣՂԺՐԼԋՉԿՍՇԐԵ\u0557ՖՎՔՎԣ", (byte)23, 69), NLoginCore_230.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìёѹ҅ѿ҃ҊѿѸѾ҈ҊѯĄ", (byte)23, 65) + var1 + NLoginCore_453.C("д", (byte)23, 67) + var2.toString(), var4
         );
      }
   }

   static NLoginCore_230 b(NLoginCore_383 var0, ProxyServer var1, ProxiedPlayer var2) {
      Channel var4 = NLoginCore_339.a(a(ba, bb ^ bc), var2.getPendingConnection());
      int var3;
      if (var4 != null) {
         String var5 = var4.getClass().getSimpleName();
         int var6 = bd;
         switch (var5.hashCode()) {
            case -904795186:
               if (var5.equals(a(bi & bj, bk))) {
                  var6 = bl;
               }
               break;
            case -217013511:
               if (var5.equals(a(be, bf ^ bg))) {
                  var6 = bh;
               }
               break;
            case 1894246043:
               if (var5.equals(a(bm, bn ^ bo))) {
                  var6 = bp;
               }
         }

         switch (var6) {
            case 0:
            case 1:
            case 2:
               var3 = bq;
               break;
            default:
               var3 = br;
         }
      } else {
         var3 = bs;
      }

      return new NLoginCore_230(var0, var2, var1, (boolean)var3);
   }

   @Generated
   @Override
   public boolean S() {
      return this.R;
   }

   @Override
   public boolean i(String var1) {
      return this.a.hasPermission(var1);
   }

   @Override
   public CompletableFuture<Void> a(String var1) {
      CompletableFuture var2 = new CompletableFuture();
      this.a.disconnect(TextComponent.fromLegacyText(NLoginCore_065.f(var1, (boolean)i)));
      var2.complete(null);
      return var2;
   }

   @Override
   public String u() {
      return this.a.getDisplayName();
   }

   @Override
   public String toString() {
      return a(aa & ab, ac) + this.e + a(ad, ae ^ af) + this.a + ag;
   }

   @Override
   public int h() {
      return this.a.getPing();
   }

   @Override
   public InetSocketAddress a() {
      try {
         return (InetSocketAddress)this.a.getSocketAddress();
      } catch (NoSuchMethodError var2) {
         return this.a.getAddress();
      }
   }

   @Override
   public String getName() {
      return this.a.getName();
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   static {
      b();
   }

   @Override
   public void a(String var1, String var2, int var3, int var4, int var5) {
      this.a
         .sendTitle(
            this.c
               .createTitle()
               .title(TextComponent.fromLegacyText(NLoginCore_065.f(var1, (boolean)s)))
               .subTitle(TextComponent.fromLegacyText(NLoginCore_065.f(var2, (boolean)t)))
               .fadeIn(var3)
               .fadeOut(var5)
               .stay(var4)
         );
   }

   @Generated
   private NLoginCore_230(NLoginCore_383 var1, ProxiedPlayer var2, ProxyServer var3, boolean var4) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
      this.R = var4;
   }
}
