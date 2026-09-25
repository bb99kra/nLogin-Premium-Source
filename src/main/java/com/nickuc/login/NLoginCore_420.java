package com.nickuc.login;

import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;

public class NLoginCore_420 implements NLoginCore_277 {
   private static int bf = Integer.reverse(-1342177280);
   private static String[] ZKM_STR_B = new String[NLoginCore_420.ci];
   private static int bi = Integer.reverse(1073741824);
   private static long bq = Long.reverse(6574064702852149874L);
   private static int bp = (503316480 >>> 89 | 503316480 << ~89 + 1) & -1;
   private static int an = Integer.reverse(268435456);
   private static long i = Long.reverse(7582871019383140978L);
   private static int ce = (2304 >>> 135 | 2304 << -135) & -1;
   private static int ar = Integer.reverse(-1879048192);
   private static long aw = Long.reverse(7582871019383140978L);
   private static int w = Integer.reverse(1610612736);
   private static int bx = Integer.reverse(-2013265920);
   private static int bo = Integer.reverse(-1);
   private static long bn = Long.reverse(3602879701896396800L);
   private static long ao = Long.reverse(6574064702852149874L);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int r = (4 >>> 2 | 4 << -2) & -1;
   private static long az = Long.reverse(7582871019383140978L);
   private static long t = Long.reverse(7582871019383140978L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int s = 4096 >>> 106 | 4096 << -106;
   private static int z = Integer.reverse(1073741824);
   private static int h = 2 >>> 128 | 2 << -128;
   private static int q = 0 >>> 184 | 0 << ~184 + 1;
   private static int u = Integer.reverse(-1610612736);
   private static int af = 2097152 >>> 245 | 2097152 << -245;
   private static int a = (0 >>> 151 | 0 << ~151 + 1) & -1;
   private final UUID f = UUID.randomUUID();
   private static int b = Integer.reverse(-1);
   private NLoginInterface_023 a;
   private static int x = Integer.reverse(-1);
   private static long cg = Long.reverse(7582871019383140978L);
   private static long bh = Long.reverse(7582871019383140978L);
   private static int ay = -1 >>> 93 | -1 << -93;
   private static int n = Integer.reverse(-1);
   private final ProxyServer c;
   private static int bw = 256 >>> 72 | 256 << -72;
   private static int ci = (1275068416 >>> 218 | 1275068416 << ~218 + 1) & -1;
   private static long g = Long.reverse(7582871019383140978L);
   private static long bd = Long.reverse(6574064702852149874L);
   private static int ag = Integer.reverse(0);
   private static int ak = Integer.reverse(-536870912);
   private static int ad = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_A = new String[NLoginCore_420.ch];
   private static int aq = (1073741855 >>> 254 | 1073741855 << ~254 + 1) & -1;
   private static int aa = Integer.reverse(0);
   private static long be = Long.reverse(3602879701896396800L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private final NLoginCore_455 b;
   private static int ca = Integer.reverse(1073741824);
   private static long am = Long.reverse(7582871019383140978L);
   private static int ac = (8192 >>> 173 | 8192 << -173) & -1;
   private static int bt = Integer.reverse(134217728);
   private static int cb = 67108864 >>> 26 | 67108864 << -26;
   private static int au = Integer.reverse(1342177280);
   private static int bl = (469762048 >>> 57 | 469762048 << -57) & -1;
   private static int ax = (2816 >>> 40 | 2816 << ~40 + 1) & -1;
   private static long by = Long.reverse(6574064702852149874L);
   private static int bk = (4 >>> 162 | 4 << ~162 + 1) & -1;
   private static int bu = -1 >>> 7 | -1 << -7;
   private static long as = Long.reverse(6574064702852149874L);
   private static int ah = 33554432 >>> 24 | 33554432 << ~24 + 1;
   private static int bg = -1 >>> 35 | -1 << ~35 + 1;
   private static long d = Long.reverse(7582871019383140978L);
   private static int bj = (0 >>> 111 | 0 << -111) & -1;
   private static int ab = Integer.reverse(-201326592);
   private static long j = Long.reverse(5476377146882523136L);
   private final boolean aq;
   private static int ba = Integer.reverse(-1073741824);
   private static long ap = Long.reverse(3602879701896396800L);
   private static long v = Long.reverse(7582871019383140978L);
   private static int cf = Integer.reverse(-1);
   private static long k = Long.reverse(5476377146882523136L);
   static final Map<Player, NLoginCore_420> j = new ConcurrentHashMap<>();
   private static int aj = (65536 >>> 112 | 65536 << -112) & -1;
   private static int bc = (24 >>> 161 | 24 << -161) & -1;
   private static int ch = Integer.reverse(-939524096);
   private static long br = Long.reverse(3602879701896396800L);
   private static int p = (1024 >>> 137 | 1024 << ~137 + 1) & -1;
   private final Player a;
   private static int cc = (0 >>> 25 | 0 << ~25 + 1) & -1;
   private static int m = (24576 >>> 109 | 24576 << ~109 + 1) & -1;
   private static int ae = (0 >>> 114 | 0 << ~114 + 1) & -1;
   private static int ai = 0 >>> 170 | 0 << -170;
   private static int al = Integer.reverse(-1);
   private static long bm = Long.reverse(6574064702852149874L);
   private static int av = (-1 >>> 181 | -1 << -181) & -1;
   private static long c;
   private static long l = Long.reverse(5476377146882523136L);
   private static int cd = Integer.reverse(0);
   private static long bv = Long.reverse(7582871019383140978L);
   private static long bz = Long.reverse(3602879701896396800L);
   private static long at = Long.reverse(3602879701896396800L);
   private static long y = Long.reverse(7582871019383140978L);
   private static long o = Long.reverse(7582871019383140978L);
   private static int bs = 0 >>> 210 | 0 << -210;

   @Override
   public void l(String var1) {
      if (var1.length() >= z && var1.charAt(aa) == ab) {
         var1 = var1.substring(ac);
      }

      this.c.getCommandManager().executeImmediatelyAsync(this.a, var1);
   }

   @Override
   public CompletableFuture<Void> a(String var1) {
      CompletableFuture var2 = new CompletableFuture();
      this.a.disconnect(NLoginCore_529.a(var1));
      var2.complete(null);
      return var2;
   }

   @Generated
   private NLoginCore_420(NLoginCore_455 var1, Player var2, ProxyServer var3, boolean var4) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
      this.aq = var4;
   }

   @Override
   public UUID a() {
      return this.a.getUniqueId();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_420.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_433.C("ӫԍԏӯԓԲԪՀԬӻԹԯԽԷԀԥՇՆԾՄԾԓ", (byte)90, 67), NLoginCore_420.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.C("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ\u0892\u0894࢜࢟ࢊ\u086dࢎ࢙ࢂ࢝ࢣ\u0893Ԛ", (byte)90, 67) + var1 + NLoginCore_127.B("ŭ", (byte)90, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean i(String var1) {
      return this.a.hasPermission(var1);
   }

   private static String a(int var0, long var1) {
      var1 ^= 76L;
      var1 ^= -5169414587375368864L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     (byte)(24 + 45),
                     (byte)(42 + 41),
                     (byte)(2 + 45),
                     67,
                     (byte)(39 + 27),
                     (byte)(19 + 48),
                     (byte)(44 + 3),
                     (byte)(33 + 47),
                     (byte)(14 + 61),
                     (byte)(30 + 37),
                     (byte)(28 + 55),
                     (byte)(51 + 2),
                     (byte)(15 + 65),
                     97,
                     (byte)(2 + 98),
                     (byte)(30 + 70),
                     (byte)(45 + 60),
                     (byte)(72 + 38),
                     (byte)(81 + 22)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(8 + 75)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.F("ԩԶԵӸԸԴԯԸՃԲӿԽՁԺԽՃԅ\u0895\u0897࢟ࢢࢍࡰ\u0891࢜ࢅࢠࢦ\u0896", (byte)10, 70));
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

   private static NLoginCore_420 a(NLoginCore_455 var0, ProxyServer var1, Player var2) {
      NLoginCore_420 var3 = j.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         if (NLoginCore_370.aj()) {
            StackTraceElement[] var4 = new Exception().getStackTrace();
            String var5 = var4.length > 0 ? var4[Math.min(ba, var4.length - bb)].toString() : a(bc, bd ^ be);
            String var10000 = a(bf & bg, bh);
            Object[] var10001 = new Object[bi];
            var10001[bj] = var2.getUsername();
            var10001[bk] = var5;
            NLoginCore_370.c(var10000, var10001);
         }

         return b(var0, var1, var2);
      }
   }

   @Override
   public Optional<String> a() {
      return Optional.of(this.a.getPlayerSettings().getLocale().toLanguageTag());
   }

   static {
      b();
   }

   @Override
   public void a(String var1, String var2, int var3, int var4, int var5) {
      this.a
         .showTitle(
            Title.title(
               NLoginCore_529.a(var1), NLoginCore_529.a(var2), Times.times(Duration.ofMillis(var3 * j), Duration.ofMillis(var4 * k), Duration.ofMillis(var5 * l))
            )
         );
   }

   @Override
   public int hashCode() {
      Object[] var10000 = new Object[ah];
      var10000[ai] = this.f;
      var10000[aj] = this.a;
      return Objects.hash(var10000);
   }

   @Override
   public boolean R() {
      return this.a.isActive();
   }

   @Override
   public void n(String var1) {
      throw new UnsupportedOperationException(a(a & b, d));
   }

   @Nullable
   @Override
   public InetSocketAddress a() {
      return this.a.getRemoteAddress();
   }

   @Generated
   @Override
   public boolean S() {
      return this.aq;
   }

   private static void b() {
      c = 5642438536056790234L;
      long var0 = c ^ -5169414587375368864L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(49 + 20),
               (byte)(55 + 28),
               (byte)(45 + 2),
               67,
               (byte)(65 + 1),
               (byte)(59 + 8),
               (byte)(23 + 24),
               (byte)(73 + 7),
               75,
               (byte)(12 + 55),
               (byte)(54 + 29),
               (byte)(16 + 37),
               (byte)(34 + 46),
               (byte)(86 + 11),
               (byte)(34 + 66),
               (byte)(83 + 17),
               (byte)(93 + 12),
               (byte)(63 + 47),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_427.A("ûĎðċõýûüġÝðĎñğĤóáęĈġþĭôõ", (byte)17, 65);
               ZKM_STR_B[1] = NLoginCore_004.B("òíÓðóğĒñăÿíĥĐħĢğäġĈĖďďĪģèþđĔĔÿõôįõĤĕčĩŁěįúĺĉ", (byte)17, 66);
               ZKM_STR_B[2] = NLoginCore_223.F("ԃԄԞԪԉԾԥԿԬՐՊԕ", (byte)17, 70);
               ZKM_STR_B[3] = NLoginCore_530.E("ӽԻԧԴԲՉՆԟԤ\u0530Ԭԕ", (byte)17, 69);
               ZKM_STR_B[4] = NLoginCore_471.C("ИгѝбяЮѓѠЩпзфцѭѦхйШхўѐгѤъвљѺѱжемъћыѶѾѸѤѣ҄҅Ѿѫѐ", (byte)17, 67);
               ZKM_STR_B[5] = NLoginCore_387.D("ОПйхФљрњчѫѥа", (byte)17, 68);
               ZKM_STR_B[6] = NLoginCore_446.E("ԞԙӿԜԟՋԾԝԯԫԚԃԺԍԆԬԩԲԡՌԔԳԔՍ\u0530ԘՔԩ՛ՓՁԭ", (byte)17, 69);
               ZKM_STR_B[7] = NLoginCore_575.C("ћѢжхгѧкКФШѓЬПЪзооѯщбѩхѳѫьфшщьѭѷѓѷѐљэѵѴчјѿѻѹѐ", (byte)17, 67);
               ZKM_STR_B[8] = NLoginCore_076.D("ѕѡЫѣЗолџѤмзкќШѬиЬѢчѮпѤлм", (byte)17, 68);
               ZKM_STR_B[9] = NLoginCore_453.F("ԞԙӿԜԟՋԾԝԯԫԚԜՓՍՁԨԡՔԮԓԕԵՅԴԷԞ\u0557Ր՟ԶԢՕԵՔԽԽՃՈՂ՛ՆԬ՚Ե", (byte)17, 70);
               ZKM_STR_B[10] = NLoginCore_223.C("ОПйхФљрњчѫѥа", (byte)17, 67);
               ZKM_STR_B[11] = NLoginCore_223.C("ўефѝбчСѩСУѝа", (byte)17, 67);
               ZKM_STR_B[12] = NLoginCore_575.C("иНїСмчУшбфуа", (byte)17, 67);
               ZKM_STR_B[13] = NLoginCore_092.C("џѢѤєкѦхиПѫцТоЦЦТфоѲђѬѠяѮѺљхѯѧкљѾѫјѝѸо҅ѯоѩѡјќѻѪѸшҐ҈ьѿҒ҄ѱғғ҈ѪґҐҊѼҕѓѲћўѺ҄Қҥ҂ѵѿѣѼѥѻѬҏҥҟҰѭҞѩѲѶѷқҔѯѷҖҴ", (byte)17, 67);
               ZKM_STR_B[14] = NLoginCore_324.D("ѡлѕгћМўношљѭмћйѝѮќЮђѪолм", (byte)17, 68);
               ZKM_STR_B[15] = NLoginCore_433.F("ӿՈԽՀԞԫՉԩԄՇԸԠԽԡԲԯԷՓՌՐՕԳԠԡ", (byte)17, 70);
               ZKM_STR_B[16] = NLoginCore_397.A("ė÷üðæÕğēöÞğĖćÙþòäúČĈććôõ", (byte)17, 65);
               ZKM_STR_B[17] = NLoginCore_530.D("ѐТуѕбУЙѐтСЪШыщЬсхщћыоѴлм", (byte)17, 68);
               ZKM_STR_B[18] = NLoginCore_241.C("ѝтїЬвПѥѝжЪчѕитцѥѢѠрЫѡѤлм", (byte)17, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_241.B("ûĎðċõýûüġÝñöđġßēĝûĥĈĥĊçĭďħĩİĤÿİĦ", (byte)17, 66);
               ZKM_STR_B[1] = NLoginCore_453.D("йдКзкѦљиъцдѬїѮѩѦЫѨяѝііѱѪЯхјћћцмлћю҃рѲсҁј҈ѷ҅ѐ", (byte)17, 68);
               ZKM_STR_B[2] = NLoginCore_232.F("ԆԂԹԆԜԖԨԚԶԣԘԕ", (byte)17, 70);
               ZKM_STR_B[3] = NLoginCore_324.D("ИиЬМјеУнърТа", (byte)17, 68);
               ZKM_STR_B[4] = NLoginCore_575.B("ÑìĖêĈçČęâøðýÿĦğþòáþėĉìĝăëĒĳĪïîõăĶĻĺïĿĊĜþċùĞįĞĦĆħĒŉĨġčōĔĕ", (byte)17, 66);
               ZKM_STR_B[5] = NLoginCore_446.E("ӸԁԽԇՇԴԩՂԹԟԏԕ", (byte)17, 69);
               ZKM_STR_B[6] = NLoginCore_384.A("òíÓðóğĒñăÿî×ĎáÚĀýĆõĠèęěĜēċæĵĶĀė÷ĐčĳýĮĎīČĢĲĐĉ", (byte)17, 65);
               ZKM_STR_B[7] = NLoginCore_427.D("ћѢжхгѧкКФШѓЬПЪзооѯщбѩхѳѫьфшщьѭѷѓпђєуѳѺіѨўѩ҉ѐ", (byte)17, 68);
               ZKM_STR_B[8] = NLoginCore_076.F("ԺՆԐՈӼԣԠՄՉԡԜՒԐՑԼՈԏ\u0530ԲՐ՚ՙԠԡ", (byte)17, 70);
               ZKM_STR_B[9] = NLoginCore_530.E("ԞԙӿԜԟՋԾԝԯԫԚԜՓՍՁԨԡՔԮԓԕԵՅԴԷԞ\u0557Ր՟ԶԢՕԶԥԴՠբ՟Ո՜՟ՙզԵ", (byte)17, 69);
               ZKM_STR_B[10] = NLoginCore_387.A("ï×æêďÿÞðôßĖé", (byte)17, 65);
               ZKM_STR_B[11] = NLoginCore_446.B("Öě×ėíÚøÓêâðé", (byte)17, 66);
               ZKM_STR_B[12] = NLoginCore_092.C("вТрМђѥяаСъјпѪзѝњѫбфџѲолм", (byte)17, 67);
               ZKM_STR_B[13] = NLoginCore_141.D("џѢѤєкѦхиПѫцТоЦЦТфоѲђѬѠяѮѺљхѯѧкљѾѫјѝѸо҅ѯоѩѡјќѻѪѸшҐ҈ьѿҒ҄ѱғғ҈ѪґҐҊѼҕѓѲћўѺ҄Қҥ҂ѵѿѣѼѥѻѬҏҥҟҰѭҢ҉ҴҙѴҴѷҨҐҠҭ", (byte)17, 68);
               ZKM_STR_B[14] = NLoginCore_530.B("ĚôĎìĔÕėö÷āĔðĤüþĢĕĕûĜćĪĂĬăðĐāĄčĒñ", (byte)17, 66);
               ZKM_STR_B[15] = NLoginCore_427.B("ÓĜđĔòÿĝýØěČåøôèöĝõêģĜěĩéĭħīĎēđĮĤ", (byte)17, 66);
               ZKM_STR_B[16] = NLoginCore_433.E("ՃԣԨԜԒԁՋԿԢԊՌԼՓԌՂԩՎԶԎՊԕՙԠԡ", (byte)17, 69);
               ZKM_STR_B[17] = NLoginCore_076.A("ĉÛüĎêÜÒĉûÚãĐę÷ÿēĞĕ÷ĞìĤûĪéěĠĵèĔõĪ", (byte)17, 65);
               ZKM_STR_B[18] = NLoginCore_201.B("ĖûĐåëØĞĖïãāïüåóø÷ĊĞħċĝôõ", (byte)17, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.D("ѠљЮёЯжХђчѓѪзўќтцсшгЮсѤлм", (byte)17, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_092.B("æĊąñùęØ×ûĤġýģāûááÿõęæ÷ôõ", (byte)17, 66);
         }
      }
   }

   @Override
   public String toString() {
      return a(ak & al, am) + this.a + a(an, ao ^ ap) + this.f + aq;
   }

   @Override
   public String u() {
      return this.a.getUsername();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         NLoginCore_420 var2 = (NLoginCore_420)var1;
         return ((Objects.equals(this.f, var2.f) != 0) && Objects.equals(this.a, var2.a) ? af : ag);
      } else {
         return (ae != 0);
      }
   }

   @Override
   public void d(Object var1) {
      if (var1 instanceof String) {
         this.a.sendMessage(NLoginCore_529.b((String)var1, (e != 0)));
      } else {
         if (!(var1 instanceof Component)) {
            throw new IllegalArgumentException(a(f, g) + var1 + a(h, i) + var1.getClass().getCanonicalName());
         }

         this.a.sendMessage((Component)var1);
      }
   }

   @Override
   public void p(String var1) {
      this.a.spoofChatInput(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginInterface_011<?> var1, NLoginCore_337 var2, Object var3, byte[] var4) {
      Object var5;
      if (var3 instanceof String) {
         String var6 = (String)var3;
         String[] var7 = var6.split(a(m & n, o));
         var5 = var7.length == p ? MinecraftChannelIdentifier.create(var7[q], var7[r]) : new LegacyChannelIdentifier(var6);
      } else {
         if (!(var3 instanceof ChannelIdentifier)) {
            throw new IllegalArgumentException(a(s, t) + var3 + a(u, v) + var3.getClass().getCanonicalName());
         }

         var5 = (ChannelIdentifier)var3;
      }

      switch (NLoginCore_465.t[var2.ordinal()]) {
         case 1:
            this.a.sendPluginMessage((ChannelIdentifier)var5, var4);
            break;
         case 2:
            this.a.getCurrentServer().ifPresent(var2x -> {
               if (!var2x.getServer().getPlayersConnected().isEmpty()) {
                  var2x.sendPluginMessage(var5, var4);
               }
            });
            break;
         default:
            throw new IllegalArgumentException(a(w & x, y) + var2);
      }
   }

   public static NLoginCore_420 a(NLoginCore_455 var0, ProxyServer var1, Object var2) {
      if (var2 instanceof String) {
         String var3 = ((String)var2).toLowerCase(Locale.ENGLISH);
         return var1.getPlayer(var3).map(var2x -> a(var0, var1, var2x)).orElse(null);
      } else if (var2 instanceof Player) {
         return a(var0, var1, (Player)var2);
      } else {
         throw new IllegalArgumentException(
            a(ar, as ^ at) + var2 + a(au & av, aw) + (var2 != null ? var2.getClass().getCanonicalName() : a(ax & ay, az))
         );
      }
   }

   static NLoginCore_420 b(NLoginCore_455 var0, ProxyServer var1, Player var2) {
      Channel var4 = NLoginCore_063.a(a(bl, bm ^ bn), var2);
      int var3;
      if (var4 != null) {
         String var5 = var4.getClass().getSimpleName();
         int var6 = bo;
         switch (var5.hashCode()) {
            case -904795186:
               if (var5.equals(a(bt & bu, bv))) {
                  var6 = bw;
               }
               break;
            case -217013511:
               if (var5.equals(a(bp, bq ^ br))) {
                  var6 = bs;
               }
               break;
            case 1894246043:
               if (var5.equals(a(bx, by ^ bz))) {
                  var6 = ca;
               }
         }

         switch (var6) {
            case 0:
            case 1:
            case 2:
               var3 = cb;
               break;
            default:
               var3 = cc;
         }
      } else {
         var3 = cd;
      }

      return new NLoginCore_420(var0, var2, var1, (var3 != 0));
   }

   @Override
   public void ad() {
      this.a.resetTitle();
   }

   @Override
   public NLoginInterface_022 a() {
      return this.b.a((ad != 0));
   }

   @Override
   public <T> T c() {
      return (T)this.a;
   }

   @Override
   public NLoginInterface_023 a() {
      if (this.a == null) {
         this.a = (var0, var1) -> {
            throw new UnsupportedOperationException(a(ce & cf, cg));
         };
      }

      return this.a;
   }

   @Override
   public int h() {
      return (int)this.a.getPing();
   }

   @Override
   public void o(String var1) {
      this.a.sendActionBar(NLoginCore_529.a(var1));
   }

   @Override
   public String getName() {
      return this.a.getUsername();
   }
}
