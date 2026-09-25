package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.PacketEventsAPI;
import com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessageLegacy;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage_v1_16;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Play.Client;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Play.Server;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.settings.PacketEventsSettings;
import com.nickuc.login.lib.packetevents.api.util.FakeChannelUtil;
import com.nickuc.login.lib.packetevents.api.util.TimeStampMode;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerChatMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerPluginMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerSystemChatMessage;
import com.nickuc.login.lib.packetevents.impl.bungee.factory.BungeePacketEventsBuilder;
import com.nickuc.login.lib.packetevents.impl.factory.spigot.SpigotPacketEventsBuilder;
import com.nickuc.login.lib.packetevents.impl.util.protocolsupport.ProtocolSupportUtil;
import com.nickuc.login.lib.packetevents.impl.util.viaversion.ViaVersionUtil;
import com.nickuc.login.lib.packetevents.impl.velocity.factory.VelocityPacketEventsBuilder;
import com.nickuc.login.loader.platform.VelocityLoader;
import io.netty.channel.Channel;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Filter;
import java.util.logging.Level;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.kyori.adventure.text.Component;
import org.bukkit.plugin.Plugin;

public class NLoginCore_581 {
   private static int dc = 256 >>> 200 | 256 << -200;
   private static int cd = 0 >>> 165 | 0 << ~165 + 1;
   private static long fl = Long.reverse(1801487379071171387L);
   private static int bc = Integer.reverse(1073741824);
   private static long dj = Long.reverse(8935141660703064064L);
   private static long q = Long.reverse(8935141660703064064L);
   private static int var_do = (0 >>> 118 | 0 << -118) & -1;
   private static int d = 0 >>> 205 | 0 << ~205 + 1;
   private static int al = Integer.reverse(536870912);
   private static long gn = Long.reverse(8935141660703064064L);
   private static int fg = 312 >>> 99 | 312 << -99;
   private static long fe = Long.reverse(7277864525953694523L);
   private static long bt = Long.reverse(7277864525953694523L);
   private static int cf = Integer.reverse(Integer.MIN_VALUE);
   private static int as = Integer.reverse(1342177280);
   private static long gk = Long.reverse(8935141660703064064L);
   private static int bf = Integer.reverse(-1342177280);
   private static long eb = Long.reverse(8935141660703064064L);
   private final NLoginCore_349 a;
   private static int fk = Integer.reverse(-1);
   private static int eo = -1 >>> 67 | -1 << ~67 + 1;
   private static int gt = Integer.reverse(Integer.MIN_VALUE);
   private static int ai = Integer.reverse(0);
   private static int fu = Integer.reverse(872415232);
   private static int er = Integer.reverse(-1006632960);
   private static long ay = Long.reverse(1801487379071171387L);
   private static int fj = Integer.reverse(335544320);
   private static int ce = 0 >>> 78 | 0 << ~78 + 1;
   private static long bh = Long.reverse(8935141660703064064L);
   private static int bk = 480 >>> 69 | 480 << ~69 + 1;
   private static int dl = 1610612739 >>> 253 | 1610612739 << -253;
   private static int bw = (4352 >>> 136 | 4352 << ~136 + 1) & -1;
   private static int av = 4096 >>> 108 | 4096 << ~108 + 1;
   private static long fq = Long.reverse(1801487379071171387L);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int dz = (1984 >>> 198 | 1984 << -198) & -1;
   private static int bi = Integer.reverse(1879048192);
   private static long ft = Long.reverse(8935141660703064064L);
   private static int ez = -1 >>> 148 | -1 << -148;
   private static int dp = Integer.reverse(939524096);
   private final NLoginCore_344 a;
   private static String[] ZKM_STR_B = new String[NLoginCore_581.gw];
   private static int o = Integer.reverse(-1073741824);
   private static int bs = Integer.reverse(134217728);
   private static int e = Integer.reverse(0);
   private static long gc = Long.reverse(1801487379071171387L);
   private static int l = (16777216 >>> 247 | 16777216 << ~247 + 1) & -1;
   private static long cz = Long.reverse(7277864525953694523L);
   private static int dy = Integer.reverse(0);
   private static int ax = (-1342177280 >>> 188 | -1342177280 << -188) & -1;
   private static int gh = (0 >>> 80 | 0 << -80) & -1;
   private static int fy = 11796480 >>> 18 | 11796480 << -18;
   private static int ah = 98304 >>> 207 | 98304 << ~207 + 1;
   private static int eh = Integer.reverse(0);
   private static long s = Long.reverse(7277864525953694523L);
   private static int br = 512 >>> 41 | 512 << -41;
   private static long k = Long.reverse(1801487379071171387L);
   private static int ct = Integer.reverse(0);
   private static int db = Integer.reverse(0);
   private static long ar = Long.reverse(1801487379071171387L);
   private static int es = (-1 >>> 241 | -1 << ~241 + 1) & -1;
   private static int bn = 256 >>> 232 | 256 << ~232 + 1;
   private static long p = Long.reverse(7277864525953694523L);
   private static long fs = Long.reverse(7277864525953694523L);
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static int gp = (0 >>> 62 | 0 << ~62 + 1) & -1;
   private static long ek = Long.reverse(8935141660703064064L);
   private static int gb = Integer.reverse(1946157056);
   private static long fw = Long.reverse(8935141660703064064L);
   private final Map<PacketTypeCommon, NLoginInterface_003> k = new HashMap<>();
   private static int dv = (0 >>> 76 | 0 << ~76 + 1) & -1;
   private static int ec = 0 >>> 10 | 0 << ~10 + 1;
   private static long ci = Long.reverse(1801487379071171387L);
   private boolean ay;
   private static int go = Integer.reverse(Integer.MIN_VALUE);
   private static int gr = Integer.reverse(1275068416);
   private static long ap = Long.reverse(8935141660703064064L);
   private static int cq = Integer.reverse(1744830464);
   private static long ff = Long.reverse(8935141660703064064L);
   private static long w = Long.reverse(8935141660703064064L);
   private static int aq = (150994944 >>> 152 | 150994944 << -152) & -1;
   private static long gj = Long.reverse(7277864525953694523L);
   private static int fr = Integer.reverse(-738197504);
   private static int ak = Integer.reverse(536870912);
   private static int r = 128 >>> 5 | 128 << ~5 + 1;
   private static int em = 67108864 >>> 154 | 67108864 << -154;
   private static long ae = Long.reverse(1801487379071171387L);
   private static int gi = Integer.reverse(201326592);
   private static int fd = 805306369 >>> 187 | 805306369 << -187;
   private static long da = Long.reverse(8935141660703064064L);
   private static int g = -1 >>> 207 | -1 << -207;
   private static long fa = Long.reverse(1801487379071171387L);
   private static int bz = (18432 >>> 42 | 18432 << -42) & -1;
   private static int gl = Integer.reverse(-1946157056);
   private static int fm = 41 >>> 224 | 41 << ~224 + 1;
   private static long bb = Long.reverse(8935141660703064064L);
   private static int cu = Integer.reverse(-402653184);
   private static int cj = (0 >>> 53 | 0 << ~53 + 1) & -1;
   private static long cb = Long.reverse(8935141660703064064L);
   private static int b = (0 >>> 56 | 0 << -56) & -1;
   private static int f = Integer.reverse(0);
   private static int x = (4 >>> 161 | 4 << ~161 + 1) & -1;
   private static long gg = Long.reverse(8935141660703064064L);
   private static int fp = Integer.reverse(1409286144);
   private static int dt = 1856 >>> 38 | 1856 << ~38 + 1;
   private static long dx = Long.reverse(1801487379071171387L);
   private static String[] ZKM_STR_A = new String[NLoginCore_581.gv];
   private static long cl = Long.reverse(1801487379071171387L);
   private final NLoginCore_206 a;
   private static int cp = 0 >>> 54 | 0 << ~54 + 1;
   private static long at = Long.reverse(1801487379071171387L);
   private static long fo = Long.reverse(8935141660703064064L);
   private static int be = 5 >>> 160 | 5 << ~160 + 1;
   private static int gu = Integer.reverse(0);
   private static int ck = Integer.reverse(671088640);
   private static long dn = Long.reverse(1801487379071171387L);
   private static int gv = Integer.reverse(-872415232);
   private static int eu = Integer.reverse(0);
   private static int ex = 0 >>> 241 | 0 << -241;
   private static int au = Integer.reverse(0);
   private static int u = 1342177280 >>> 124 | 1342177280 << ~124 + 1;
   private static long ba = Long.reverse(7277864525953694523L);
   private static long bu = Long.reverse(8935141660703064064L);
   private static int an = Integer.reverse(268435456);
   private static int bo = Integer.reverse(Integer.MIN_VALUE);
   private static int dg = Integer.reverse(0);
   private static long h = Long.reverse(1801487379071171387L);
   private static int bp = (1 >>> 32 | 1 << ~32 + 1) & -1;
   private static long cs = Long.reverse(8935141660703064064L);
   private static long fv = Long.reverse(7277864525953694523L);
   private static long ep = Long.reverse(1801487379071171387L);
   private static int el = Integer.reverse(0);
   private static long gs = Long.reverse(1801487379071171387L);
   private static long cn = Long.reverse(7277864525953694523L);
   private static int cx = Integer.reverse(0);
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static int dh = 13631488 >>> 243 | 13631488 << -243;
   private static int dq = Integer.reverse(-1);
   private static long cr = Long.reverse(7277864525953694523L);
   private static long gf = Long.reverse(7277864525953694523L);
   private static long ee = Long.reverse(7277864525953694523L);
   private static int c = (0 >>> 156 | 0 << -156) & -1;
   private static long cv = Long.reverse(1801487379071171387L);
   private static long fh = Long.reverse(7277864525953694523L);
   private static int y = Integer.reverse(0);
   private static int en = Integer.reverse(1140850688);
   private static int eg = 0 >>> 170 | 0 << -170;
   private static long fc = Long.reverse(913667774402789376L);
   private static int ab = Integer.reverse(0);
   private static long dr = Long.reverse(1801487379071171387L);
   private static int eq = 0 >>> 157 | 0 << ~157 + 1;
   private static int ev = (4608 >>> 135 | 4608 << ~135 + 1) & -1;
   private static long n = Long.reverse(8935141660703064064L);
   private static long df = Long.reverse(8935141660703064064L);
   private static int dm = Integer.reverse(-1);
   private static long c;
   private static int ch = Integer.reverse(-939524096);
   private static int dd = Integer.reverse(-1744830464);
   private static long co = Long.reverse(8935141660703064064L);
   private static long ef = Long.reverse(8935141660703064064L);
   private static long ca = Long.reverse(7277864525953694523L);
   private static long de = Long.reverse(7277864525953694523L);
   private static int cm = (21 >>> 128 | 21 << ~128 + 1) & -1;
   private static int dw = Integer.reverse(2013265920);
   private static long ao = Long.reverse(7277864525953694523L);
   private static int cc = Integer.reverse(1073741824);
   private static int gw = Integer.reverse(-872415232);
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int gd = Integer.reverse(0);
   private static long bm = Long.reverse(8935141660703064064L);
   private static long et = Long.reverse(1801487379071171387L);
   private static int ad = (24 >>> 98 | 24 << ~98 + 1) & -1;
   private static long ag = Long.reverse(1801487379071171387L);
   private static int bq = Integer.reverse(0);
   private static int z = 0 >>> 121 | 0 << ~121 + 1;
   private static long gm = Long.reverse(7277864525953694523L);
   private static long by = Long.reverse(1801487379071171387L);
   private static int cg = 0 >>> 225 | 0 << -225;
   private static int ds = Integer.reverse(0);
   private static long ga = Long.reverse(8935141660703064064L);
   private static long bg = Long.reverse(7277864525953694523L);
   private static long ej = Long.reverse(7277864525953694523L);
   private static int bv = 0 >>> 41 | 0 << ~41 + 1;
   private static int gq = 8 >>> 195 | 8 << ~195 + 1;
   private static int ac = Integer.reverse(0);
   private static int a = (32 >>> 101 | 32 << -101) & -1;
   private static long bj = Long.reverse(1801487379071171387L);
   private static long m = Long.reverse(7277864525953694523L);
   private static long fi = Long.reverse(8935141660703064064L);
   private static long ew = Long.reverse(1801487379071171387L);
   private static int ed = Integer.reverse(67108864);
   private final Map<PacketTypeCommon, NLoginInterface_043> l = new HashMap<>();
   private static int cy = (24 >>> 224 | 24 << -224) & -1;
   private static int fb = (0 >>> 244 | 0 << -244) & -1;
   private static long fz = Long.reverse(7277864525953694523L);
   private static int ey = Integer.reverse(-1543503872);
   private static long du = Long.reverse(1801487379071171387L);
   private static int cw = Integer.reverse(0);
   private static long fn = Long.reverse(7277864525953694523L);
   private static int ei = 4224 >>> 231 | 4224 << -231;
   private static int bx = -1 >>> 151 | -1 << -151;
   private static int bd = Integer.reverse(0);
   private static long v = Long.reverse(7277864525953694523L);
   private static int af = (1835008 >>> 82 | 1835008 << ~82 + 1) & -1;
   private static int ge = Integer.reverse(-201326592);
   private static long t = Long.reverse(8935141660703064064L);
   private static int dk = (0 >>> 29 | 0 << ~29 + 1) & -1;
   private static long ea = Long.reverse(7277864525953694523L);
   private static long di = Long.reverse(7277864525953694523L);
   private static int am = Integer.reverse(-1610612736);
   private static int j = Integer.reverse(-1);
   private static int fx = Integer.reverse(0);
   private static int az = 393216 >>> 175 | 393216 << -175;
   private final NLoginType_008 t;
   private static long bl = Long.reverse(7277864525953694523L);

   private static void b() {
      c = -2531226398675959642L;
      long var0 = c ^ -6132434683418174751L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(39 + 29),
               (byte)(29 + 40),
               (byte)(28 + 55),
               (byte)(40 + 7),
               (byte)(14 + 53),
               (byte)(18 + 48),
               (byte)(29 + 38),
               (byte)(38 + 9),
               (byte)(79 + 1),
               75,
               67,
               (byte)(49 + 34),
               (byte)(5 + 48),
               (byte)(61 + 19),
               (byte)(67 + 30),
               (byte)(50 + 50),
               (byte)(25 + 75),
               (byte)(76 + 29),
               (byte)(46 + 64),
               (byte)(8 + 95)
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
               ZKM_STR_B[0] = NLoginCore_530.F("ԾԝԟԞՁԩԤՉԭԬԾԝԯԨԸՖԳԜԺէԞՀԭԮ", (byte)30, 70);
               ZKM_STR_B[1] = NLoginCore_223.C("҈ѨћѤњѺ҅ьѣћњҁѵѫѳѢҏѶҌѴќҍѬҐѵ҉ҔѝҝҎѝҦ", (byte)30, 67);
               ZKM_STR_B[2] = NLoginCore_446.A("ĭĴĈąĨïĲòĳİĬă", (byte)30, 65);
               ZKM_STR_B[3] = NLoginCore_223.C("Ѧ҈џјѩѡ҅ѫѢѬѬѲѥ҇ѩђѡя҄њ҆їҙ҇їғќҗѢѠџѳѠ҇ќѥҊҦҊѿҊ҇ѱѷ", (byte)30, 67);
               ZKM_STR_B[4] = NLoginCore_092.E(
                  "ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ\u0590\u058cՔ֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ\u05cd־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז\u05cbבעעאס֝זג֠ךָךך֫ס\u05ca֯נ",
                  (byte)30,
                  69
               );
               ZKM_STR_B[5] = NLoginCore_559.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŢƊƎƘŭƕƔŧŬƊŦţ", (byte)30, 66);
               ZKM_STR_B[6] = NLoginCore_453.C("ѵ҆҆ѩхњћх҂ѻѩхғҒэҕђѫҊ҃ҋѵѢѣ", (byte)30, 67);
               ZKM_STR_B[7] = NLoginCore_232.C("тѤшѬ҆ўҌѯѼѿҀї", (byte)30, 67);
               ZKM_STR_B[8] = NLoginCore_559.D("ѵ҆҆ѩхњћх҂ѻѧ҂ѤҍҁѯѣҋњѪѬјҘѺҋҊҋѭҀѵҧѡ", (byte)30, 68);
               ZKM_STR_B[9] = NLoginCore_223.C(
                  "ѦрѹсѾјфъѨѬяѽѿѓшҍъыѣѼѴѦҔҙҝїѭҗѱҟјҤѦѡҤѿ҆Ҡ҂ѽѰҚҚ҂Ѽ҄ґҌңҥҹҪѳҚҷҟһҕҷҌҠӀҖҺғқҔӋҤҌӄҸӊӋҩҒҴҥҵңӁҪӇҵӄӗӑҘӔҝҠӀҮӦүӕҶӞӢӬӁөӨһӀӞҺҷ", (byte)30, 67
               );
               ZKM_STR_B[10] = NLoginCore_471.B("ïħĲĶāĔĶĉĺôĻıėŀĞĽĿįĂĆĺķĎď", (byte)30, 66);
               ZKM_STR_B[11] = NLoginCore_241.D("ђлєѸљњќ҈ѭѽѯҁ҃чҌґѰѯњҍ҇ѥѢѣ", (byte)30, 68);
               ZKM_STR_B[12] = NLoginCore_471.A("îĐôĘĲĊĸěĨīĬă", (byte)30, 65);
               ZKM_STR_B[13] = NLoginCore_451.D("ђлєѸљњќ҈ѭѽѰҍѰѵэҒѯљѵѨюҔғҌҌқѳѽҐҥѦҝ", (byte)30, 68);
               ZKM_STR_B[14] = NLoginCore_451.F(
                  "ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ\u0558ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜\u0557ծհքյԾեւժֆՠւ\u0557ի\u058bաօ՞զ՟֖կ\u0557֏փ֖֕մ՝տհրծ\u058cյ֒ր֏֢֜գ֟ըի\u058bչֱպ֠ցַ֭֩\u058cֳִֆ\u058b֩օւ",
                  (byte)30,
                  70
               );
               ZKM_STR_B[15] = NLoginCore_183.B("ïħĲĶāĔĶĉĺôĻıėŀĞĽĿįĂĆĺķĎď", (byte)30, 66);
               ZKM_STR_B[16] = NLoginCore_446.A("ġĲĲĕñĆćñĮħēĶĳĮĒĻþĄĝĽÿėĶĥŋĠŇĸĦĎŏŇŒľĵłŌŔĳŌĜŒŐģ", (byte)30, 65);
               ZKM_STR_B[17] = NLoginCore_127.F("ՀՑՑԴԐԥԦԐՍՆԴԐ՞՝ԘՠԝԶՕՎՖՀԭԮ", (byte)30, 70);
               ZKM_STR_B[18] = NLoginCore_397.D("ђлєѸљњќ҈ѭѽѯҁ҃чҌґѰѯњҍ҇ѥѢѣ", (byte)30, 68);
               ZKM_STR_B[19] = NLoginCore_446.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
               ZKM_STR_B[20] = NLoginCore_451.F("ԣԮՔԎՅԒԡԹԬ՝ԶՌԘՌԳՃԛԵՃԶՂ\u0557ԢԨՉեՄԪծ՛ԣ՝թճԵՠզգՆՍՅմ՝Ղ", (byte)30, 70);
               ZKM_STR_B[21] = NLoginCore_127.F("ԝՑԪԑԳՌՈԥՒԭԫՎՀԠԺԜԕԴՑԞԵՁ՟ԦԵՃԸՂՃԹՃՎ", (byte)30, 70);
               ZKM_STR_B[22] = NLoginCore_530.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
               ZKM_STR_B[23] = NLoginCore_201.C("єѥѾѻьѾѼшҌѯѰѧҍѡєѨҊяѴґѼќҞҚқ҉ѵҁѿѵѢѼҁҩѦҡҜѫҦҬҊҍңҪҡѭҴҏҕѹ҆ѶѻҫҝҊҒҙҕҋҔӂұ҅ҩӀҶҊҤҠҾҨӋґҿӂҿӁҡҎҫҔәӐҲҵҢң", (byte)30, 67);
               ZKM_STR_B[24] = NLoginCore_521.C(
                  "ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋԇӕԏӭԏԏӠԖӿӤԕ",
                  (byte)30,
                  67
               );
               ZKM_STR_B[25] = NLoginCore_530.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŢƊƎƘŭƕƔŧŬƊŦţ", (byte)30, 66);
               ZKM_STR_B[26] = NLoginCore_397.F("ԊՒԪՉԠՒԢԨ\u0558ԸԱԢ", (byte)30, 70);
               ZKM_STR_B[27] = NLoginCore_453.C("҉ѓҁѾ҄ѠѣћѥѪѝѢ҈ѣўіѕѡғѓ҄ѽўѹҝѠњѳќѹѠҙѽѿѼғҭ҂Ҋ҂ѼҧҨѽңҨҩҩҘѲҐѻѸѻҸѺҌұҗҘѶүҵҦҵҸҳҼҩ҄ӂҰӀҡҪҗ", (byte)30, 67);
               ZKM_STR_B[28] = NLoginCore_004.E("ԊՒԪՉԠՒԢԨ\u0558ԸԱԢ", (byte)30, 69);
               ZKM_STR_B[29] = NLoginCore_183.C("п҇џѾѕ҇їѝҍѭѦї", (byte)30, 67);
               ZKM_STR_B[30] = NLoginCore_471.A("ēìĎĊģīĕįĮĶĦĹđĢúĮŅŃėņĶĹėģĕŀĿħĠġĮčĦĦōĢİċĵŅĮİŜĹŐĴŃŋŢŔĥŐŁŗĮį", (byte)30, 65);
               ZKM_STR_B[31] = NLoginCore_183.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
               ZKM_STR_B[32] = NLoginCore_004.E("ՐԾԵԩԓԧՖԔ\u0558ԪՓԳԷԶԷՊԙՅՒԠբԣԱՕԵՊԿՠՄՍՑԫՄՓԭբՁԮՋոՑհՖզՓԼՑ\u0557ցտ՛քՒՔ՝ՕֈքՄշպ՛հզ", (byte)30, 69);
               ZKM_STR_B[33] = NLoginCore_387.F(
                  "ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ\u0590\u058cՔ֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ\u05cd־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז\u05cbבעעאס֝זג֠ךָךך֫ס\u05ca֯נ",
                  (byte)30,
                  70
               );
               ZKM_STR_B[34] = NLoginCore_397.C(
                  "ѦрѹсѾјфъѨѬяѽѿѓшҍъыѣѼѴѦҔҙҝїѭҗѱҟјҤѦѡҤѿ҆Ҡ҂ѽѰҚҚ҂Ѽ҄ґҌңҥҹҪѳҚҷҟһҕҷҌҠӀҖҺғқҔӋҤҌӄҸӊӋҩҒҴҥҵңӁҪӇҵӄӗӑҘӔҝҠӀҮӦүӕҶӞӢӬӁөӨһӀӞҺҷ", (byte)30, 67
               );
               ZKM_STR_B[35] = NLoginCore_232.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
               ZKM_STR_B[36] = NLoginCore_530.C("ѽѨѲѓҍѪѡїѐыћѭё҄ѵѤҏјҘҙҍѪҝѰѵҏќѢќҝѺҁҐғѩѤҫѧҭҋҊҪґҒҨүѳҬҤҷҺѹѸ҇ҹҫҙҒһҡҺҳҤҷ҇ҕҗҟӂҹӎҌ҈ӅһҭҵҥҳӄӂүӉәҗҵҢң", (byte)30, 67);
               ZKM_STR_B[37] = NLoginCore_451.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
               ZKM_STR_B[38] = NLoginCore_027.E("ԛԡՖՋՆԳԸԫՍԔՇԱԘ\u0558ԩգԢԡՕՏՔԱՆԿլՠՊ՜եՋգՁդԬՇՌՏՊԫՈԻղԸվԶն՝բվցվևշԺֈՓ\u058cՕՈւՇ֍Սբ", (byte)30, 69);
               ZKM_STR_B[39] = NLoginCore_091.E("ԤՇ\u0530ՕԴԔԖՑՓՎՅԗԺԮՔՓԫՐԼդ՜ԥԴԣ՞բՈաժԨԧղԬԪՕՓՖշէԵեՙՉՂ", (byte)30, 69);
               ZKM_STR_B[40] = NLoginCore_530.D("ѿѶўќџпю҇ҏњѲї", (byte)30, 68);
               ZKM_STR_B[41] = NLoginCore_110.C("љѼѥҊѩщы҆҈҃ѻћѯѶҁҔѯҔҘ҆ѺҝҊѼѫѹѢѻҚѝѽѲҕғҕ҈ҘҊҍҋ҉ҡѭѷ", (byte)30, 67);
               ZKM_STR_B[42] = NLoginCore_451.B("īĢĊĈċëúĳĻĆĞă", (byte)30, 66);
               ZKM_STR_B[43] = NLoginCore_553.F("ԤՇ\u0530ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞ՋձյՇՋ\u0557ՂԸՔԸՌՙՂ", (byte)30, 70);
               ZKM_STR_B[44] = NLoginCore_433.B("ąċĔğĢĵďĚįįļă", (byte)30, 66);
               ZKM_STR_B[45] = NLoginCore_173.D("љѼѥҊѩщы҆҈҃ѲѾѪѦ҅ѢѓѣѱѹѯѝѧѰҗќҀҟѷҔғҀҦҪѼҀҌѷѭ҉ѭҁҎѷ", (byte)30, 68);
               ZKM_STR_B[46] = NLoginCore_138.F("ԤԪԳԾՁՔԮԹՎՎ՛Ԣ", (byte)30, 70);
               ZKM_STR_B[47] = NLoginCore_092.A("óħðĊĕĮôĜęįěĉļďĠĚěĢķĥŀħĦĢČŊĹńŁćœĜĽœįħīĭīńŊŌŕōŖĳŘŗĲťŃłĽŁħŋĥīŬŐŅĪŅœįţŏŃİőŪŵŏŚĶŘŗŢűĺťżŷŃŻżŗƊŞŗƅŝŋŎŭƌ", (byte)30, 65);
               ZKM_STR_B[48] = NLoginCore_223.B("ĝĖĳķĀčĶģİúįÿīċĿġĴġĥþĈĽĽĵľĤŃĎŁőŊĭĤğŕŗĒįĳńĤŔĺŕŀşšĠģİŤńŞĺşŞŁŧšŝŃŉŜŤ", (byte)30, 66);
               ZKM_STR_B[49] = NLoginCore_091.B("óħðĊĕĮôĜęįĚøĨÿĢĽğĺŅĞŀĚŊğĶĚŀčĦĞģċňŊčĸİĲģěĲŌĻĨĺįŁŘĠšļĞŧũĦġļŕŗśŁĬľĬűŪĲĮŋİĳıŕŇŴŔŊƂĺƀłşſššŃŃĽƄƈźŏſūſō", (byte)30, 66);
               ZKM_STR_B[50] = NLoginCore_324.A("ğċČġĢĶòįīĔĹñľėĢĖığüŅúŃľĠėĨĸğıĭĞİČĐœĪĭďŏōŖŚŔŖŔōŔİŒĥĤĞĺġĵŘŇņŀŊŇŦŀŐŀĮİŬţĸŅųŊįĽľſŌƂľśŶŮŐŇŷŪƂņŋńŦƌŻūū", (byte)30, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_451.A("ğþĀÿĢĊąĪĎčğĲĠĻďĲÿ÷ęĨĂġĎď", (byte)30, 65);
               ZKM_STR_B[1] = NLoginCore_241.F("ՓԳԦԯԥՅՐԗԮԦԥՌՀԶԾԭ՚Ձ\u0557Կԧ՚ՃՄՇզՉ՚ՃՋՏ՚", (byte)30, 70);
               ZKM_STR_B[2] = NLoginCore_201.C("ѱ҇ј҃ѵѻѩќ҂ћҊѬќҀ҆ѫҖҁѺѵѱқѢѣ", (byte)30, 67);
               ZKM_STR_B[3] = NLoginCore_110.C("Ѧ҈џјѩѡ҅ѫѢѬѬѲѥ҇ѩђѡя҄њ҆їҙ҇їғќҗѢѠџѳѣҙѻҟѨѣѫѦҀ҉Ҩѷ", (byte)30, 67);
               ZKM_STR_B[4] = NLoginCore_110.D(
                  "ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋԆӯԖӬԏӵԄԗӸӻӦ",
                  (byte)30,
                  68
               );
               ZKM_STR_B[5] = NLoginCore_173.F(
                  "ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ\u0558ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜\u0557ծհքյԾեւժֆՠւ\u0557ի\u058bաօ՞զ՟֖կ\u0557֏փ֖֕մ՝տհրծ\u058cյ֒ր֏֢֜գ֟ըի\u058bչֱպ֠վ֪֪֠֒֬\u058bշ֏օչ֛֯։ր֕փ֠օփֹ֠֍֎",
                  (byte)30,
                  70
               );
               ZKM_STR_B[6] = NLoginCore_127.E("ՀՑՑԴԐԥԦԐՍՆԴԮԻԟՂՐԱԳՆԴԷ\u0530ԭԮ", (byte)30, 69);
               ZKM_STR_B[7] = NLoginCore_201.F("ԏԞԌԵ\u0557ԱԧԭԯՕԹԢ", (byte)30, 70);
               ZKM_STR_B[8] = NLoginCore_232.E("ՀՑՑԴԐԥԦԐՍՆԲՍԯ\u0558ՌԺԮՖԥԵԷթ՝ԽՃ՛ՋՅՂկդՄ", (byte)30, 69);
               ZKM_STR_B[9] = NLoginCore_324.E(
                  "ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ\u0558ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜\u0557ծհքյԾեւժֆՠւ\u0557ի\u058bաօ՞զ՟֖կ\u0557֏փ֖֕մ՝տհրծ\u058cյ֒ր֏֢֜գ֟ըի\u058bչֱպִֶ֦֪֠֏֦֮֕ֈօնոֶ֖֤֚֭֨րַ׃ֶ֍֎",
                  (byte)30,
                  69
               );
               ZKM_STR_B[10] = NLoginCore_004.B("ïħĲĶāĔĶĉĺôĻöĶĝĭĭĤĐĜıłŇĎď", (byte)30, 66);
               ZKM_STR_B[11] = NLoginCore_091.D("ђлєѸљњќ҈ѭѽѰюь҉ѲѪҔђҔёњҋѢѣ", (byte)30, 68);
               ZKM_STR_B[12] = NLoginCore_223.A("ąċîíġøıĘùķõă", (byte)30, 65);
               ZKM_STR_B[13] = NLoginCore_384.F("ԝԆԟՃԤԥԧՓԸՈԻ\u0558ԻՀԘ՝ԺԤՀԳԙ՝էԧՆ՞ԨխհՉՈՊԽՈԴԨ\u0530ՓՓխպԻճՂ", (byte)30, 70);
               ZKM_STR_B[14] = NLoginCore_387.B(
                  "ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŐŰƇƇŤŬŬŭųųŜƞŸźŠƗůƓƓżżƁŮů", (byte)30, 66
               );
               ZKM_STR_B[15] = NLoginCore_173.B("ïħĲĶāĔĶĉĺôĹċĝďĜęăĎĮėĨķĎď", (byte)30, 66);
               ZKM_STR_B[16] = NLoginCore_232.B("ġĲĲĕñĆćñĮħēĶĳĮĒĻþĄĝĽÿėĶĥŋĠŇĸĦĎŏŇČŒĭŗİĸįļŚĽĲģ", (byte)30, 66);
               ZKM_STR_B[17] = NLoginCore_553.B("ġĲĲĕñĆćñĮħĒĳŀĉľńĐŃĶĂąġĎď", (byte)30, 66);
               ZKM_STR_B[18] = NLoginCore_110.E("ԝԆԟՃԤԥԧՓԸՈԼՌԻՓՖՕԛԳԹԳՀՖԭԮ", (byte)30, 69);
               ZKM_STR_B[19] = NLoginCore_091.D("њѿѿ҄ѣљѶѝњ҆ёї", (byte)30, 68);
               ZKM_STR_B[20] = NLoginCore_241.F("ԣԮՔԎՅԒԡԹԬ՝ԶՌԘՌԳՃԛԵՃԶՂ\u0557ԢԨՉեՄԪծ՛ԣ՝կԴլմՋԪմԴՈճթՕձԼՁբՕպՁՂ\u0557ՠՍՎ", (byte)30, 70);
               ZKM_STR_B[21] = NLoginCore_223.E("ԝՑԪԑԳՌՈԥՒԭԫՎՀԠԺԜԕԴՑԞԵՉԷԧ՝ՍԦզծՑՅԻ", (byte)30, 69);
               ZKM_STR_B[22] = NLoginCore_471.C("Ѣхшѹшх҃љ҅ўҐї", (byte)30, 67);
               ZKM_STR_B[23] = NLoginCore_173.A("ĀđĪħøĪĨôĸěĜēĹčĀĔĶûĠĽĨĈŊņŇĵġĭīġĎĨĭŕĒōňėŒŘĶĹŏŖōęŠĻŁĥĲĢħŗŉĶľŅŁķŀŮŝıŕŬŢĶŐŌŪŔŷĽŪōŋŜźŽŔůŹſŲőŎŏ", (byte)30, 65);
               ZKM_STR_B[24] = NLoginCore_183.C(
                  "ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋӽԗӾԔԐӜӷԅӛԟԁ",
                  (byte)30,
                  67
               );
               ZKM_STR_B[25] = NLoginCore_324.B(
                  "ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁņŝũƏƁƉƘŭƛƞśŴƀŬƘƃŰŤƦƧƝƧŮů", (byte)30, 66
               );
               ZKM_STR_B[26] = NLoginCore_433.C("ќѦѩҋуѶхѯцҐѮї", (byte)30, 67);
               ZKM_STR_B[27] = NLoginCore_232.D("҉ѓҁѾ҄ѠѣћѥѪѝѢ҈ѣўіѕѡғѓ҄ѽўѹҝѠњѳќѹѠҙѽѿѼғҭ҂Ҋ҂ѼҧҨѽңҨҩҩҘѲҐѻѸѻҸѺҌұҗҘѶүҵҦҥ҂҃ӀҶҩҷҼҝӉҼҗ", (byte)30, 68);
               ZKM_STR_B[28] = NLoginCore_451.E("ՎԽՎԶԏՐԒԭ\u0558ԲԱԢ", (byte)30, 69);
               ZKM_STR_B[29] = NLoginCore_027.C("шѣ҃Ѵ҃ҍѶѬѪҊѪї", (byte)30, 67);
               ZKM_STR_B[30] = NLoginCore_092.D("ѧрѢўѷѿѩ҃҂ҊѺҍѥѶю҂ҙҗѫҚҊҍѫѷѩҔғѻѴѵ҂ѡѺѺҡѶ҄џ҉ҙ҂҄ұҮѬҒҀѲѲҵ҄ҏҎҕ҂҃", (byte)30, 68);
               ZKM_STR_B[31] = NLoginCore_427.F("ԞԴԫՍՎԴԕԴ\u0558ԭԔԢ", (byte)30, 70);
               ZKM_STR_B[32] = NLoginCore_138.B("ığĖĊôĈķõĹċĴĔĘėĘīúĦĳāŃĄĒĶĖīĠŁĥĮĲČĥĴĎŃĢďĬřĲőķŇĴĝĲĸŢŠļťĳĲģŬĥśĿĨŰśŇĭĿšĴİœņİťĳŵŎŃ", (byte)30, 66);
               ZKM_STR_B[33] = NLoginCore_387.F(
                  "ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ\u0590\u058cՔ֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ\u05cd־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז\u05cbבעעאס֝זג֢עך\u05cd\u05c9ׂנפשּ",
                  (byte)30,
                  70
               );
               ZKM_STR_B[34] = NLoginCore_201.F(
                  "ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ\u0558ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜\u0557ծհքյԾեւժֆՠւ\u0557ի\u058bաօ՞զ՟֖կ\u0557֏փ֖֕մ՝տհրծ\u058cյ֒ր֏֢֜գ֟ըի\u058bչֱպ֠ծ։֎կ\u058cֶ֣֨։պֳ֑֮։ջչֵׁׂ׆֒׆֍֎",
                  (byte)30,
                  70
               );
               ZKM_STR_B[35] = NLoginCore_427.C("ѺѥѨ҂҇їѺѥҐ҂Ѽї", (byte)30, 67);
               ZKM_STR_B[36] = NLoginCore_004.C("ѽѨѲѓҍѪѡїѐыћѭё҄ѵѤҏјҘҙҍѪҝѰѵҏќѢќҝѺҁҐғѩѤҫѧҭҋҊҪґҒҨүѳҬҤҷҺѹѸ҇ҹҫҙҒһҡҺҳҤҷ҇ҕҗҟӂҹӎҌ҈ӅҺӎҿҕӊҕүүҶӄҧӛҢң", (byte)30, 67);
               ZKM_STR_B[37] = NLoginCore_241.B("ħāĀĵĐøİĤĔĆùă", (byte)30, 66);
               ZKM_STR_B[38] = NLoginCore_446.C("ѐіҋҀѻѨѭѠ҂щѼѦэҍўҘїіҊ҄҉ѦѻѴҡҕѿґҚҀҘѶҙѡѼҁ҄ѿѠѽѰҧѭҳѫҫҒҗҳҶҳҼҬѷҝҫҟҡҠӂѺҏӂ҇", (byte)30, 67);
               ZKM_STR_B[39] = NLoginCore_201.D("љѼѥҊѩщы҆҈҃Ѻьѯѣ҉҈Ѡ҅ѱҙґњѩјғҗѽҖҟѝќҧњћѷѪҪѼҀѻҟ҆Ҋѷ", (byte)30, 68);
               ZKM_STR_B[40] = NLoginCore_387.B("ĀčăĠĭĉĺĹôĸùă", (byte)30, 66);
               ZKM_STR_B[41] = NLoginCore_446.E("ԤՇ\u0530ՕԴԔԖՑՓՎՆԦԺՁՌ՟Ժ՟գՑՅըՕՇԶՄԭՆեԨՈԽՒՁԮմՒՕ\u0558ԹՅթՑՂ", (byte)30, 69);
               ZKM_STR_B[42] = NLoginCore_530.D("шҊҊҁҀҍѾѩюќѲї", (byte)30, 68);
               ZKM_STR_B[43] = NLoginCore_575.F("ԤՇ\u0530ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞ՋմԽծՏԲլՏ\u0557ՆԹլջ՝ՀԳշա՛ղՂընՍՎ", (byte)30, 70);
               ZKM_STR_B[44] = NLoginCore_324.F("ՑՅԠԞԦ\u0530ՉԕՑԚՐՓԱՖԙաԼՒԛԤԷՖԭԮ", (byte)30, 70);
               ZKM_STR_B[45] = NLoginCore_446.F("ԤՇ\u0530ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞Ջ\u0530ԼԯՊՇՆԳԳՙԳՒՐ\u0558՟ԿչդռմչՔՠՍՎ", (byte)30, 70);
               ZKM_STR_B[46] = NLoginCore_092.F("ԽՕՃՔՀՅԙԙԫԷ՝՚ՙ՜ԼԵԴԖԺԟՀՖԭԮ", (byte)30, 70);
               ZKM_STR_B[47] = NLoginCore_223.D(
                  "чѻфўѩ҂шѰѭ҃ѯѝҐѣѴѮѯѶҋѹҔѻѺѶѠҞҍҘҕћҧѰґҧ҃ѻѿҁѿҘҞҠҩҡҪ҇Ҭҫ҆ҹҗҖґҕѻҟѹѿӀҤҙѾҙҧ҃ҷңҗ҄ҥҾӉңҮҊҬҫҶӅҎҹӐӋҗӏӑҧҩӁӂӛҭӂҼҜӇӝӢӆҽӖӆҸӂҢҮӨҷ", (byte)30, 68
               );
               ZKM_STR_B[48] = NLoginCore_427.D("ѱѪ҇ҋєѡҊѷ҄ю҃ѓѿџғѵ҈ѵѹђќґґ҉ҒѸҗѢҕҥҞҁѸѳҩҫѦ҃҇ҘѸҨҎҩҔҳҵѴѷ҄ҸҘҲҍҵҌѶғқғҷҢҶ҇", (byte)30, 68);
               ZKM_STR_B[49] = NLoginCore_387.D(
                  "чѻфўѩ҂шѰѭ҃ѮьѼѓѶґѳҎҙѲҔѮҞѳҊѮҔѡѺѲѷџҜҞѡҌ҄҆ѷѯ҆ҠҏѼҎ҃ҕҬѴҵҐѲһҽѺѵҐҩҫүҕҀҒҀӅҾ҆҂ҟ҄҇҅ҩқӈҨҞӖҎӔҖҳӓҵҵғӚӇҴҹӊӁӡҸӒӈҼӖӢӬӈӕӌӎһӀҭҷ", (byte)30, 68
               );
               ZKM_STR_B[50] = NLoginCore_138.A("ğċČġĢĶòįīĔĹñľėĢĖığüŅúŃľĠėĨĸğıĭĞİČĐœĪĭďŏōŖŚŔŖŔōŔİŒĥĤĞĺġĵŘŇņŀŊŇŦŀŐŀĮİŬţĸŅųŊįĽľſŌƂľśŶŮŐŇƀūƄŪŢƉŌŹƃŨŎŌŤŭŎţƉƅƅƋƐƔţ", (byte)30, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_433.A("ĄĎĦėċĆõćûąûÿčĶĶğĔİĽĵĆęŊėĺīĮļľČĝĒ", (byte)30, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_092.E("ԼԯԏՍԴՐԣԐԛԬԥԪԝ՞՛ԙ՝ԝՔՕՂդՊ՚է՟լԦ\u0558ԸՁ՝", (byte)30, 69);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void aD() {
      this.aE();
      Filter var1 = var0 -> ((!NLoginCore_370.aj() != 0) && (var0.getLevel().intValue() < Level.WARNING.intValue() || a(gr, gs).equals(var0.getMessage()))
         ? gu
         : gt);
      PacketEventsSettings var2 = new PacketEventsSettings()
         .debug((b != 0))
         .checkForUpdates((c != 0))
         .kickOnPacketException((d != 0))
         .reEncodeByDefault((e != 0))
         .timeStampMode(TimeStampMode.MILLIS)
         .logFilter(var1);
      PacketEventsAPI var3;
      switch (NLoginCore_584.K[this.t.b().a().ordinal()]) {
         case 1:
            var3 = SpigotPacketEventsBuilder.build((Plugin)this.t.b(), var2);
            break;
         case 2:
            var3 = BungeePacketEventsBuilder.build((net.md_5.bungee.api.plugin.Plugin)this.t.b(), var2);
            break;
         case 3:
            VelocityLoader var4 = (VelocityLoader)this.t.b();
            var3 = VelocityPacketEventsBuilder.build(var4.getServer(), var4.getPluginContainer(), var4.getLogger(), var4.getDataDirectory().toPath(), var2);
            break;
         default:
            throw new IllegalStateException(a(f & g, h) + this.t.b().a() + a(i & j, k));
      }

      PacketEvents.setAPI(var3);
      PacketEvents.getAPI().load();
      PacketEvents.getAPI().init();
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -6132434683418174751L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(18 + 50),
                     (byte)(16 + 53),
                     (byte)(15 + 68),
                     (byte)(18 + 29),
                     (byte)(40 + 27),
                     (byte)(9 + 57),
                     (byte)(55 + 12),
                     (byte)(28 + 19),
                     80,
                     (byte)(4 + 71),
                     (byte)(38 + 29),
                     (byte)(59 + 24),
                     (byte)(7 + 46),
                     (byte)(11 + 69),
                     97,
                     (byte)(41 + 59),
                     (byte)(47 + 53),
                     (byte)(50 + 55),
                     (byte)(92 + 18),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.F("՞իժԭխթդխոէԴղնկղոԺࢿ࣒࣋ࢸࢫࣘࢵࢦ࣑ࣔࢶࣚࢫ࣌࣠", (byte)63, 70));
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

   public void disable() {
      PacketEvents.getAPI().getEventManager().unregisterListener(this.a);
      PacketEvents.getAPI().terminate();
   }

   public void k(NLoginCore_277 var1) {
      if (this.a == null) {
         throw new IllegalStateException(a(ge, gf ^ gg));
      } else {
         this.a.a(this.a(var1));
      }
   }

   private void aE() {
      if (!a(l, m ^ n).equalsIgnoreCase(System.getenv(a(o, p ^ q)))) {
         String var1 = a(r, s ^ t);
         String var2 = a(u, v ^ w);
         boolean[] var10000 = new boolean[x];
         var10000[y] = (z != 0);
         var10000[aa] = (ab != 0);
         boolean[] var3 = var10000;
         int var4 = ac;
         NLoginCore_081 var5 = this.t.b().a(a(ad, ae));
         if (var5 != null && var5.s() != null) {
            String[] var6 = var5.s().split(a(af, ag), ah);
            int var7 = Integer.parseInt(var6[ai]);
            int var8 = Integer.parseInt(var6[aj]);
            if (var7 < ak || var7 == al && var8 < am) {
               File var9 = NLoginCore_366.a(var5.e().getClass());
               File var10 = new File(this.t.c().getParentFile(), a(an, ao ^ ap));
               NLoginCore_285 var11 = NLoginCore_305.a().a(a(aq, ar), var10);
               if (var11.af()) {
                  File var12 = NLoginCore_366.a(var9, NLoginCore_366.c(var9) + a(as, at));
                  if (var9.exists() && !var9.renameTo(var12) && !var9.delete()) {
                     var9.deleteOnExit();
                  }
               } else {
                  var3[au] = (av != 0);
               }

               var4 = aw;
            }
         }

         NLoginCore_081 var14 = this.t.b().a(a(ax, ay));
         if (var14 != null && var14.s() != null) {
            int var15 = Integer.parseInt(var14.s().split(a(az, ba ^ bb), bc)[bd]);
            if (var15 < be) {
               File var17 = NLoginCore_366.a(var14.e().getClass());
               File var18 = new File(this.t.c().getParentFile(), a(bf, bg ^ bh));
               NLoginCore_285 var19 = NLoginCore_305.a().a(a(bi, bj), var18);
               if (var19.af()) {
                  File var20 = NLoginCore_366.a(var17, NLoginCore_366.c(var17) + a(bk, bl ^ bm));
                  if (var17.exists() && !var17.renameTo(var20) && !var17.delete()) {
                     var17.deleteOnExit();
                  }
               } else {
                  var3[bn] = (bo != 0);
               }

               var4 = bp;
            }
         }

         String var16 = var3[bq] && var3[br] ? a(bs, bt ^ bu) : (var3[bv] ? a(bw & bx, by) : a(bz, ca ^ cb));
         boolean[] var10001 = new boolean[cc];
         var10001[cd] = (ce != 0);
         var10001[cf] = (cg != 0);
         if (!Arrays.equals(var3, var10001)) {
            if (NLoginCore_150.j()) {
               NLoginCore_370.d(a(ch, ci));
               NLoginCore_370.d(a(ck, cl) + var16 + a(cm, cn ^ co));
               NLoginCore_370.d(a(cq, cr ^ cs));
               NLoginCore_370.d(a(cu, cv));
               if (var3[cx]) {
                  NLoginCore_370.d(a(cy, cz ^ da));
               }

               if (var3[dc]) {
                  NLoginCore_370.d(a(dd, de ^ df));
               }

               NLoginCore_370.d(a(dh, di ^ dj));
               NLoginCore_370.d(a(dl & dm, dn));
               NLoginCore_370.d(a(dp & dq, dr));
            } else {
               NLoginCore_370.d(a(dt, du));
               NLoginCore_370.d(var16 + a(dw, dx));
               NLoginCore_370.d(a(dz, ea ^ eb));
               NLoginCore_370.d(a(ed, ee ^ ef));
               if (var3[eh]) {
                  NLoginCore_370.d(a(ei, ej ^ ek));
               }

               if (var3[em]) {
                  NLoginCore_370.d(a(en & eo, ep));
               }

               NLoginCore_370.d(a(er & es, et));
               NLoginCore_370.d(a(ev, ew));
               NLoginCore_370.d(a(ey & ez, fa));
            }

            try {
               Thread.sleep(fc);
            } catch (InterruptedException var13) {
               NLoginCore_370.a(var13);
            }
         }

         if (var4 != 0) {
            this.t.b().c();
            throw new IllegalStateException(a(fd, fe ^ ff) + var16);
         }
      }
   }

   public User a(NLoginCore_277 var1) {
      User var2 = PacketEvents.getAPI().getPlayerManager().getUser(var1.c());
      if (var2 == null) {
         throw new IllegalArgumentException(a(fg, fh ^ fi) + var1.getName() + a(fj & fk, fl) + var1.a());
      } else {
         return var2;
      }
   }

   public NLoginCore_206 a() {
      if (this.a == null) {
         throw new IllegalStateException(a(gi, gj ^ gk));
      } else {
         return this.a;
      }
   }

   public NLoginCore_581(NLoginType_008 var1) {
      this.a = new NLoginCore_344(this);
      this.ay = (a != 0);
      this.t = var1;
      this.aD();
      if (var1.b().a() == NLoginCore_419.b && var1.i()) {
         this.a = null;
      } else {
         NLoginCore_346 var2 = new NLoginCore_346(var1);
         this.l.put(Server.SYSTEM_CHAT_MESSAGE, var2.a);
         this.l.put(Server.CHAT_MESSAGE, var2.a);
         this.k.put(Client.CHAT_COMMAND_UNSIGNED, var2.a);
         this.k.put(Client.CHAT_COMMAND, var2.a);
         this.k.put(Client.CHAT_MESSAGE, var2.a);
         this.k.put(Client.KEEP_ALIVE, new NLoginCore_310(var1));
         this.a = new NLoginCore_206(var1);
         if (var1.b().a().L()) {
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Client.LOGIN_SUCCESS_ACK, this.a.a);
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Client.SELECT_KNOWN_PACKS, this.a.a);
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Client.CONFIGURATION_END_ACK, this.a.a);
            this.l.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Server.CONFIGURATION_END, this.a.a);
         }

         this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Client.CUSTOM_CLICK_ACTION, this.a.a);
         this.k.put(Client.CUSTOM_CLICK_ACTION, this.a.a);
      }

      if (var1.b().a() == NLoginCore_419.b) {
         nLoginBukkit var4 = var1.c();
         this.a = new NLoginCore_349(var1);
         this.l.put(Server.SET_SLOT, this.a.a);
         this.l.put(Server.WINDOW_ITEMS, this.a.a);
         if (var1.i()) {
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Client.LOGIN_START, new NLoginCore_006());
            NLoginCore_502 var3 = new NLoginCore_502(var4);
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Configuration.Client.PLUGIN_MESSAGE, var3.a);
            this.k.put(Client.PLUGIN_MESSAGE, var3.a);
         } else {
            NLoginCore_313 var6 = new NLoginCore_313(var4);
            this.l.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Server.ENCRYPTION_REQUEST, var6.a);
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Client.LOGIN_START, var6.a);
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Client.ENCRYPTION_RESPONSE, var6.a);
            this.k.put(Client.CLIENT_SETTINGS, new NLoginCore_054(var4));
            this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Handshaking.Client.HANDSHAKE, new NLoginCore_041());
         }
      } else {
         this.a = null;
         NLoginCore_458 var5 = new NLoginCore_458(var1);
         this.k.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Client.ENCRYPTION_RESPONSE, var5);
         this.l.put(com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType.Login.Server.ENCRYPTION_REQUEST, var5);
      }

      PacketEvents.getAPI().getEventManager().registerListener(this.a);
   }

   @Nullable
   public Channel a(Object var1, Object var2) {
      try {
         Channel var3 = (Channel)PacketEvents.getAPI().getPlayerManager().getChannel(var2);
         if (var3 == null) {
            NLoginCore_370.d(a(fr, fs ^ ft) + var1.getClass().getCanonicalName() + a(fu, fv ^ fw));
         }

         return var3;
      } catch (Exception var4) {
         NLoginCore_370.c(a(fy, fz ^ ga) + var1.getClass().getCanonicalName() + a(gb, gc), var4);
         return null;
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_581.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.C("ѡ҃҅ѥ҉ҨҠҶҢѱүҥҳҭѶқҽҼҴҺҴ҉", (byte)44, 67), NLoginCore_581.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_241.E("Ջ\u0558\u0557Ԛ՚ՖՑ՚եՔԡ՟գ՜՟եԧࢬࢸࢿࢥ࢘ࣅࢢ\u0893ࣁࢾࢣࣇ࢘ࢹ࣍Ղ", (byte)44, 69) + var1 + NLoginCore_453.C("ѳ", (byte)44, 67) + var2.toString(), var4
         );
      }
   }

   public ClientVersion a(User var1) {
      if (this.t.b().a() == NLoginCore_419.b) {
         if (this.ay) {
            ViaVersionUtil.checkIfViaIsPresent();
            ProtocolSupportUtil.checkIfProtocolSupportIsPresent();
            this.ay = (gh != 0);
         }

         int var2;
         if (ProtocolSupportUtil.isAvailable()) {
            var2 = ProtocolSupportUtil.getProtocolVersion(var1.getAddress());
         } else if (ViaVersionUtil.isAvailable()) {
            var2 = ViaVersionUtil.getProtocolVersion(var1);
         } else {
            var2 = var1.getClientVersion().getProtocolVersion();
         }

         return ClientVersion.getById(var2);
      } else {
         return var1.getClientVersion();
      }
   }

   public Channel a(NLoginCore_277 var1) {
      Object var2 = PacketEvents.getAPI().getPlayerManager().getChannel(var1.c());
      if (var2 == null) {
         throw new IllegalArgumentException(a(fm, fn ^ fo) + var1.getName() + a(fp, fq) + var1.a());
      } else {
         return (Channel)var2;
      }
   }

   public boolean e(Object var1) {
      return FakeChannelUtil.isFakeChannel(var1);
   }

   public boolean a(NLoginCore_277 var1, Component var2) {
      User var3 = PacketEvents.getAPI().getPlayerManager().getUser(var1.c());
      if (var3 != null) {
         ClientVersion var4 = var3.getPacketVersion();
         Object var5;
         if (var4.isNewerThanOrEquals(ClientVersion.V_1_19)) {
            var5 = new WrapperPlayServerSystemChatMessage((gp != 0), var2);
         } else {
            Object var6 = var4.isNewerThanOrEquals(ClientVersion.V_1_16)
               ? new ChatMessage_v1_16(var2, ChatTypes.CHAT, new UUID(0L, 0L))
               : new ChatMessageLegacy(var2, ChatTypes.CHAT);
            var5 = new WrapperPlayServerChatMessage((ChatMessage)var6);
         }

         PacketEvents.getAPI().getProtocolManager().sendPacketSilently(var3.getChannel(), (PacketWrapper)var5);
      }

      return (gq != 0);
   }

   public boolean a(NLoginCore_277 var1, String var2, byte[] var3) {
      if (this.t.L()) {
         throw new IllegalStateException(a(gl, gm ^ gn));
      } else {
         WrapperPlayServerPluginMessage var4 = new WrapperPlayServerPluginMessage(var2, var3);
         PacketEvents.getAPI().getProtocolManager().sendPacket(this.a(var1), var4);
         return (go != 0);
      }
   }
}
