package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SaltSignature;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientEncryptionResponse;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;

public class NLoginCore_172 implements NLoginInterface_003, NLoginInterface_043 {
   private static int k = Integer.reverse(-1073741824);
   private static int cy = (-1 >>> 77 | -1 << ~77 + 1) & -1;
   private static long dv = Long.reverse(-6629298651489370112L);
   private static long dj = Long.reverse(-369558427696315714L);
   private static int ef = (64 >>> 165 | 64 << ~165 + 1) & -1;
   private static int bf = 851968 >>> 208 | 851968 << ~208 + 1;
   private static int dn = Integer.reverse(67108864);
   private static int t = Integer.reverse(1610612736);
   private static int cq = Integer.reverse(-1);
   private static long et = Long.reverse(-6629298651489370112L);
   private static int bu = Integer.reverse(1207959552);
   private static long cv = Long.reverse(-369558427696315714L);
   private static int cd = Integer.reverse(-1);
   private static int ae = Integer.reverse(Integer.MIN_VALUE);
   private static long p = Long.reverse(-6629298651489370112L);
   private static int ad = 0 >>> 46 | 0 << ~46 + 1;
   private static int el = Integer.reverse(Integer.MIN_VALUE);
   private static long dp = Long.reverse(-6629298651489370112L);
   private static long bh = Long.reverse(6836200976096477886L);
   private static long j = Long.reverse(-6629298651489370112L);
   private static int ag = 0 >>> 66 | 0 << ~66 + 1;
   private static int ao = Integer.reverse(-1);
   private static int ar = Integer.reverse(-1);
   private static int dc = ('\ue000' >>> 203 | 57344 << -203) & -1;
   private static int w = 262144 >>> 208 | 262144 << -208;
   private static int x = Integer.reverse(0);
   private static long l = Long.reverse(-369558427696315714L);
   private static long ch = Long.reverse(-6629298651489370112L);
   private static long i = Long.reverse(-369558427696315714L);
   private static int di = (7864320 >>> 18 | 7864320 << ~18 + 1) & -1;
   private static long cz = Long.reverse(6836200976096477886L);
   private static int cn = Integer.reverse(0);
   private static int s = Integer.reverse(0);
   private static int dw = Integer.reverse(1140850688);
   private static int ex = (0 >>> 175 | 0 << -175) & -1;
   private static int a = Integer.reverse(0);
   private static int c = (1073741824 >>> 62 | 1073741824 << -62) & -1;
   private static long es = Long.reverse(-369558427696315714L);
   private static int az = 180224 >>> 78 | 180224 << ~78 + 1;
   private static long ew = Long.reverse(6836200976096477886L);
   private static int d = 33554432 >>> 153 | 33554432 << -153;
   private static int ay = 0 >>> 206 | 0 << ~206 + 1;
   private static long as = Long.reverse(6836200976096477886L);
   private static int ee = Integer.reverse(Integer.MIN_VALUE);
   private static int br = Integer.reverse(-2013265920);
   private static int am = (0 >>> 216 | 0 << -216) & -1;
   private static int e = (16 >>> 196 | 16 << ~196 + 1) & -1;
   private static int q = 320 >>> 70 | 320 << ~70 + 1;
   private static int y = 2097152 >>> 21 | 2097152 << ~21 + 1;
   private static int bn = Integer.reverse(-1);
   private static int bg = Integer.reverse(-1);
   private static int dz = Integer.reverse(0);
   private static int ei = (1024 >>> 10 | 1024 << -10) & -1;
   private static int co = (64 >>> 38 | 64 << ~38 + 1) & -1;
   private static int ey = 1245184 >>> 175 | 1245184 << ~175 + 1;
   private static int bi = Integer.reverse(1879048192);
   private static int aa = Integer.reverse(-1073741824);
   private static int cu = Integer.reverse(1476395008);
   private static int at = 603979776 >>> 218 | 603979776 << ~218 + 1;
   private static int aq = Integer.reverse(268435456);
   private static int h = Integer.reverse(1073741824);
   private static int en = Integer.reverse(0);
   private static long cb = Long.reverse(6836200976096477886L);
   private static long dg = Long.reverse(-369558427696315714L);
   private static long bz = Long.reverse(6836200976096477886L);
   private static int cj = Integer.reverse(0);
   private static int aj = (2097152 >>> 213 | 2097152 << -213) & -1;
   private static int dr = Integer.reverse(0);
   private static long aw = Long.reverse(-369558427696315714L);
   private static int eh = Integer.reverse(Integer.MIN_VALUE);
   private static int cf = 46137344 >>> 245 | 46137344 << ~245 + 1;
   private static int cc = Integer.reverse(-1476395008);
   private static int dq = Integer.reverse(0);
   private static long bb = Long.reverse(-6629298651489370112L);
   private static int cx = (1610612739 >>> 189 | 1610612739 << -189) & -1;
   private static long cg = Long.reverse(-369558427696315714L);
   private static long u = Long.reverse(-369558427696315714L);
   private static long dx = Long.reverse(-369558427696315714L);
   private static long o = Long.reverse(-369558427696315714L);
   private static long r = Long.reverse(6836200976096477886L);
   private static int by = -1 >>> 12 | -1 << ~12 + 1;
   private static long bt = Long.reverse(-6629298651489370112L);
   private static long dh = Long.reverse(-6629298651489370112L);
   private static int bm = Integer.reverse(-268435456);
   private static int ca = Integer.reverse(671088640);
   private static long dm = Long.reverse(6836200976096477886L);
   private static int ai = (0 >>> 47 | 0 << -47) & -1;
   private static int av = Integer.reverse(1342177280);
   private static int cp = 6291456 >>> 210 | 6291456 << ~210 + 1;
   private static int db = Integer.reverse(0);
   private static int ck = 5888 >>> 8 | 5888 << -8;
   private static String[] ZKM_STR_A = new String[ey];
   private static int ec = (0 >>> 212 | 0 << -212) & -1;
   private static int f = Integer.reverse(-1);
   private static long ax = Long.reverse(-6629298651489370112L);
   private static int er = Integer.reverse(603979776);
   private static long ba = Long.reverse(-369558427696315714L);
   private static int dl = Integer.reverse(-134217728);
   private static int z = (16777216 >>> 151 | 16777216 << ~151 + 1) & -1;
   private static int df = Integer.reverse(-1207959552);
   private static long bd = Long.reverse(-369558427696315714L);
   private static String[] ZKM_STR_B = new String[NLoginCore_172.ez];
   private static long bk = Long.reverse(-6629298651489370112L);
   private static int eg = Integer.reverse(0);
   private static long au = Long.reverse(6836200976096477886L);
   private static int ac = Integer.reverse(0);
   private static int ah = Integer.reverse(0);
   private static int bc = Integer.reverse(805306368);
   private static int ed = 4194304 >>> 53 | 4194304 << -53;
   private static long be = Long.reverse(-6629298651489370112L);
   private static long cw = Long.reverse(-6629298651489370112L);
   private static long dd = Long.reverse(-369558427696315714L);
   private static int al = Integer.reverse(Integer.MIN_VALUE);
   private static int cs = Integer.reverse(-1744830464);
   private static int ek = Integer.reverse(0);
   private static long eq = Long.reverse(6836200976096477886L);
   private static long c;
   private static long du = Long.reverse(-369558427696315714L);
   private static int ev = (-1 >>> 4 | -1 << -4) & -1;
   private static int da = Integer.reverse(0);
   private static int n = Integer.reverse(536870912);
   private static int bp = Integer.reverse(134217728);
   private static int af = Integer.reverse(0);
   private static long bq = Long.reverse(6836200976096477886L);
   private static long var_do = Long.reverse(-369558427696315714L);
   private static long cr = Long.reverse(6836200976096477886L);
   private static int eu = 4849664 >>> 81 | 4849664 << ~81 + 1;
   private static long bs = Long.reverse(-369558427696315714L);
   private static long cm = Long.reverse(-6629298651489370112L);
   private static int dt = (4325376 >>> 17 | 4325376 << ~17 + 1) & -1;
   private static int ea = 0 >>> 11 | 0 << -11;
   private static int em = Integer.reverse(Integer.MIN_VALUE);
   private static long dy = Long.reverse(-6629298651489370112L);
   private static long bj = Long.reverse(-369558427696315714L);
   private static long g = Long.reverse(6836200976096477886L);
   private static int bl = 0 >>> 126 | 0 << ~126 + 1;
   private static long cl = Long.reverse(-369558427696315714L);
   private static long b = Long.reverse(6836200976096477886L);
   private static long de = Long.reverse(-6629298651489370112L);
   private static long v = Long.reverse(-6629298651489370112L);
   private static int ez = (2432 >>> 70 | 2432 << -70) & -1;
   private static int ds = Integer.reverse(Integer.MIN_VALUE);
   private static int an = Integer.reverse(-536870912);
   private static int bx = Integer.reverse(-939524096);
   private static int eo = (17920 >>> 233 | 17920 << ~233 + 1) & -1;
   private static long ce = Long.reverse(6836200976096477886L);
   private static int ep = (-1 >>> 110 | -1 << ~110 + 1) & -1;
   private static int eb = 1024 >>> 169 | 1024 << ~169 + 1;
   private static long bo = Long.reverse(6836200976096477886L);
   private static int ej = (8 >>> 226 | 8 << ~226 + 1) & -1;
   private static int ab = 2 >>> 1 | 2 << ~1 + 1;
   private static long m = Long.reverse(-6629298651489370112L);
   private static long ap = Long.reverse(6836200976096477886L);
   private static int bw = Integer.reverse(0);
   private static int ak = Integer.reverse(0);
   private static long ct = Long.reverse(6836200976096477886L);
   private static long bv = Long.reverse(6836200976096477886L);
   private static long dk = Long.reverse(-6629298651489370112L);
   private static int ci = 0 >>> 202 | 0 << ~202 + 1;

   @Override
   public void a(PacketSendEvent var1) {
      WrapperLoginServerEncryptionRequest var2 = new WrapperLoginServerEncryptionRequest(var1);
      User var3 = var1.getUser();
      Channel var4 = (Channel)var1.getChannel();
      NLoginCore_481 var5 = (NLoginCore_481)var4.attr(NLoginCore_481.e).get();
      if (var5 == null) {
         NLoginCore_234.i(var3, a(e & f, g));
      } else {
         String var6 = var5.ax();
         InetAddress var7 = var3.getAddress().getAddress();
         NLoginCore_280 var8 = NLoginCore_073.a(var6, var7);
         NLoginCore_073.a(NLoginCore_313.a(this.a), var6, var7, var8 == NLoginCore_280.b ? NLoginCore_280.d : NLoginCore_280.e);
         var4.attr(NLoginCore_481.e).set(var5.a(var2.getVerifyToken()));
      }
   }

   @Generated
   private NLoginCore_172(NLoginCore_313 var1) {
      this.a = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 37L;
      var1 ^= 7084716996122519919L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(28 + 41),
                     83,
                     (byte)(5 + 42),
                     (byte)(39 + 28),
                     (byte)(48 + 18),
                     (byte)(66 + 1),
                     (byte)(45 + 2),
                     (byte)(69 + 11),
                     (byte)(60 + 15),
                     (byte)(29 + 38),
                     (byte)(32 + 51),
                     (byte)(5 + 48),
                     (byte)(40 + 40),
                     (byte)(40 + 57),
                     (byte)(58 + 42),
                     (byte)(59 + 41),
                     (byte)(102 + 3),
                     (byte)(21 + 89),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, (byte)(67 + 16)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.B("ĪķĶùĹĵİĹńĳĀľłĻľńĆҠ҂ҎҤҥѽѲҜҀҙҢҟҚҪ", (byte)36, 66));
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

   private static void b() {
      c = 9026082913980578655L;
      long var0 = c ^ 7084716996122519919L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(11 + 57),
               (byte)(17 + 52),
               (byte)(82 + 1),
               (byte)(18 + 29),
               (byte)(24 + 43),
               (byte)(50 + 16),
               (byte)(24 + 43),
               (byte)(19 + 28),
               (byte)(53 + 27),
               (byte)(16 + 59),
               (byte)(24 + 43),
               83,
               53,
               (byte)(52 + 28),
               (byte)(95 + 2),
               (byte)(97 + 3),
               (byte)(53 + 47),
               (byte)(37 + 68),
               (byte)(36 + 74),
               (byte)(87 + 16)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.B("đùßčÓĖðĔåòÚęìÔĔēïõüĎÞýêë", (byte)12, 66);
               ZKM_STR_B[1] = NLoginCore_141.F("ՂԪԐԾԄՇԡՅԖԣԋՊԝԅՅՄԠԦԭԿԏԮԛԜ", (byte)12, 70);
               ZKM_STR_B[2] = NLoginCore_232.D("ЋШЎщпФыіеИдС", (byte)12, 68);
               ZKM_STR_B[3] = NLoginCore_384.E("ԓԷԴӽՀԘԇԲԿՇՅԐ", (byte)12, 69);
               ZKM_STR_B[4] = NLoginCore_241.B("ÆÜåĔòèđ×đĔėčøùÛôĠÿâïóďăĢĘĈĢīöčĀĐĮìñĎĭìòñėęĸÿ", (byte)12, 66);
               ZKM_STR_B[5] = NLoginCore_521.C("ЋсєАъЯіуХёжЪќЛљѡнлбНкУўѓѦѡѕыШфяѱ", (byte)12, 67);
               ZKM_STR_B[6] = NLoginCore_324.B(
                  "áĒĂÐčïčĊÏôđĖćØþûČóėÙíĂåĀęàĂþħ÷ĭħĩĞĈëġĄĵĮČċĕíĒöĮćŀāŃĂĀĮħğĞĸĝŃĜħŉįćņĭŋňĐŕİŀŅĤŎĒŏĮĪĨŁĹıŐĤŢřŅħūŜķŠĥłŅĮşŎŃŶŖŶŋřŨŇŏŌķĺŜŭųŬŚŀņŤƄƇŻłłƄŦƈƐƃŋƊŋőƃƉŪšƔƘřŹŖřơſƏůƟƚƚƁŞƅƛƦŶŷƣźūƅŤƧƒŬƉũƀŶųưƍŴƚƐƾƪƭƕƯƿƠƿƦƒƺƾƦƞƛǄƤǄƧƫǉƝǏƳǄƦƕƟ",
                  (byte)12,
                  66
               );
               ZKM_STR_B[7] = NLoginCore_433.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼлѴѾќѨљѸѱѲѥ҃џьэ", (byte)12, 67);
               ZKM_STR_B[8] = NLoginCore_004.C("ХЅндояЮзїЍѕЙќОеѐЯЭрлячРЛТњдъфћЭѐѫЭяЯцдѤѕѥѳѸёѺѹиѹџуѢѤќ҅ьэ", (byte)12, 67);
               ZKM_STR_B[9] = NLoginCore_387.B("ĎċþÿéăÖéáðě÷ìôĝĎ÷ßďìğĦėóâþéěĕëĆčģČēıĝĔĥĒĊčİÿ", (byte)12, 66);
               ZKM_STR_B[10] = NLoginCore_110.F("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 70);
               ZKM_STR_B[11] = NLoginCore_173.A("êąëĈãĄĂĄĐ÷ëĆĆĖĔ×ßüýğ÷ĤďäĤĄĊèĄċćĄģĞĠĪāĦĠİĴĺùĲļĚĦėĶįİģŁĝĊċ", (byte)12, 65);
               ZKM_STR_B[12] = NLoginCore_091.A("ãÃûòüčìõĕËē×ĚÜóĎíëþùčąÞÙàĘòĈĂęëĎĩëčíĄòĢēģıĶďĸķöķĝāĠĢĚŃĊċ", (byte)12, 65);
               ZKM_STR_B[13] = NLoginCore_127.D("ЯУсэБАщїТЮёЫѐизѓёѕЛгёфсцѫЫжѠпоѨѢѲєнѳѰїђхѕђшс", (byte)12, 68);
               ZKM_STR_B[14] = NLoginCore_127.F("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 70);
               ZKM_STR_B[15] = NLoginCore_127.A("êąëĈãĄĂĄĐ÷ëĆĆĖĔ×ßüýğ÷ĤďäĤĄĊèĄċćĄģĞĠĪāĦĠİĴĺùĲļĚĦėĶįİģŁĝĊċ", (byte)12, 65);
               ZKM_STR_B[16] = NLoginCore_451.E("ԔӴԬԣԭԾԝԦՆӼՄԈՋԍԤԿԞԜԯԪԾԶԏԊԑՉԣԹԳՊԜԿ՚ԜԾԞԵԣՓՄՔբէՀթըԧըՎԲՑՓՋմԻԼ", (byte)12, 69);
               ZKM_STR_B[17] = NLoginCore_223.A("áÇĄãêÑĉ×ÐĕôäďÛûêĘěûñě÷üáâģĉĘĊ÷äĆıČĎĔĭĲĊĆîĺĶöôİİĚĚĢĿĞĒŃĊċ", (byte)12, 65);
               ZKM_STR_B[18] = NLoginCore_173.E("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 69);
               ZKM_STR_B[19] = NLoginCore_110.F("ԙӹԋԳԿԅԨԗԥԺՂՁԊԈԤՑՀՋԒՈԡԴԏՑՔԺԙՆԙՊԴԗԲԿաԺգՏԟԵԽըՋԞՖ՞ԬԽՌԤիՠ՟դԻԼ", (byte)12, 70);
               ZKM_STR_B[20] = NLoginCore_092.E("ԺԭԯԛԍԡԨԀԢՇԷԚԦՇԹԫԏԲԧԎԠՄԛԜ", (byte)12, 69);
               ZKM_STR_B[21] = NLoginCore_127.F("ԚԒԮӶՄԱӹԃԟԸԆԐ", (byte)12, 70);
               ZKM_STR_B[22] = NLoginCore_110.C("лэоЮшЦдЫшИыњѝОвяТЮОпзСХхТлѦѬйњнѦѓгчцуѯтѲфѻфс", (byte)12, 67);
               ZKM_STR_B[23] = NLoginCore_027.B("đùßčÓĖðĔåòÌ×ćð×Ĕñö÷÷ďúåõûěėġīĞĉĠħĉéĢġĨėČñĴķĲôĬĹĮĪĊĞĒöĝĊċ", (byte)12, 66);
               ZKM_STR_B[24] = NLoginCore_521.B("ÈÎéðÒďĔÖíÕëăóÙüõêàēĒßēđĀěçģĈêėĜąĂìčĆĲĬĲġĥĲĵĦĶĲĔčøĳÿĎŃďĀĸĦĺīēėġĘĬ", (byte)12, 66);
               ZKM_STR_B[25] = NLoginCore_559.C("ыорЬОвйБгјшЫзјъмРуиПбѕЬЭ", (byte)12, 67);
               ZKM_STR_B[26] = NLoginCore_471.B("éáýÅēĀÈÒîćÕß", (byte)12, 66);
               ZKM_STR_B[27] = NLoginCore_183.D("лэоЮшЦдЫшИьбьЗЯѝтгэичсўжРоъшџтъѐЬчрешфїшѪцэцѝѽнгђѠѸё҅ѵьэ", (byte)12, 68);
               ZKM_STR_B[28] = NLoginCore_433.D("ХЅндояЮзїЍѕХкЬМРяРрЗбуѝѡџчУеѣхљйэќѠяѫѬјѮшѭждцшѐюрѾж҆ѯѵьэ", (byte)12, 68);
               ZKM_STR_B[29] = NLoginCore_173.B("ĉüþêÜð÷ÏñĖĆéõĖĈúÞāöÝïēêë", (byte)12, 66);
               ZKM_STR_B[30] = NLoginCore_183.C("ЫУпЇѕтЊДащЗС", (byte)12, 67);
               ZKM_STR_B[31] = NLoginCore_324.E("ӳԴԟԾԯԱԠԇԆԫԿԸԃԤՆՏԚԏԜՍԡՍԥԲԱԩԤ՝ԾՕՊԾԜԮՑԻԢ՞Հե\u0558ԴԝՉեՅաՍՙ՝ՒԴԱՇՠ\u0558ՁՍՇԸե՛ԹՊմնդլտտՇՑդՇցՐ", (byte)12, 69);
               ZKM_STR_B[32] = NLoginCore_076.B("ÍČÉÌÓđĈÐčĚďñóöñììáĝēďēêë", (byte)12, 66);
               ZKM_STR_B[33] = NLoginCore_575.D("ХЅндояЮзїЍѕХкЬМРяРрЗбуѝѡџчУеѣхљйэќѠяѫѬјѮшѭждцшѐюрѾж҆ѯѵьэ", (byte)12, 68);
               ZKM_STR_B[34] = NLoginCore_223.A("ãÃûòüčìõĕËēãøêÚÞčÞþÕïþÞĐĉĠāĩĞêģýĩĝāćĪĕïĸĴęøĜİĉĒěėĉĹĜĺĄŇĺŁĵğīěĽČĢĨĩŅœŐŀįŇŏđĺđŝĖĳŖĺĵŊĿĖőĺĢśĵļĤłĪŁŬ", (byte)12, 65);
               ZKM_STR_B[35] = NLoginCore_091.D(
                  "ЉртШЬаъдињДЖгћПбПавѦѓвТоѓзѪэњѢѡџърЬѡѭуѨтѕчѼѲѕњѺѐѹњѥіѻхѠѳѤ҃ѼпѡѺјҒѥ҉ѾчѶѧѢѷ҂ёҙї҆ѝѯѷѬҀҙҕѯѹҚҚѷѼ҃ѬѦҌҍѭѻҤ҇ѽҬҵ҂ҋҚ҇ѺҘҌҳғѽҒҌӀҙѿҟҌҍ", (byte)12, 68
               );
               ZKM_STR_B[36] = NLoginCore_127.B("ÎĉñċÞÿßĄÔĔûĔĎĚéöÿėÙÙñĜñðòĞĂČħùĜĚúĐýąĪõþġħùĺĨīıěĶüĮĿļĄĴĐŃĂĦĂŃĂęĨĥĻĎġŃĪďķœŔĢĕğ", (byte)12, 66);
               ZKM_STR_B[37] = NLoginCore_241.A("þāËíÞĎĄèČçôÔĊÝÚùóğċóïÝāěĢėĆĢĂìêĤĩĝďĒĴëĔČĵďùÿ", (byte)12, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.B("đùßčÓĖðĔåòÌÖĝúÜĝûëČÚĥþęãâûĊąöĜĈĤ", (byte)12, 66);
               ZKM_STR_B[1] = NLoginCore_004.A("đùßčÓĖðĔåòÐØĄĝĒĕÙëúĠâăÞþĐéĕāħçģý", (byte)12, 65);
               ZKM_STR_B[2] = NLoginCore_427.F("ԵԾԑՅԴӽԹԶՆՊԗԐ", (byte)12, 70);
               ZKM_STR_B[3] = NLoginCore_446.C("хБцОѓтыжГфђС", (byte)12, 67);
               ZKM_STR_B[4] = NLoginCore_232.A("ÆÜåĔòèđ×đĔėčøùÛôĠÿâïóďăĢĘĈĢīöčĀĐĢðêēìēăĠĘĸİÿ", (byte)12, 65);
               ZKM_STR_B[5] = NLoginCore_127.D("ЋсєАъЯіуХёжЪќЛљѡнлбНкСеиѣчщѭяуЮу", (byte)12, 68);
               ZKM_STR_B[6] = NLoginCore_553.D(
                  "УєфВябяьБжѓјщКрнюељЛЯфЧтћТфрѩйѯѩѫѠъЭѣцѷѰюэїЯєиѰщ҂у҅фтѰѩѡѠѺџ҅ўѩҋѱщ҈ѯҍҊђҗѲ҂҇ѦҐєґѰѬѪ҃ѻѳҒѦҤқ҇ѩҭҞѹҢѧ҄҇ѰҡҐ҅ҸҘҸҍқҪ҉ґҎѹѼҞүҵҮҜ҂҈ҦӆӉҽ҄҄ӆҨӊӒӅҍӌҍғӅӋҬңӖӚқһҘқӣӁӑұӡӜӜӃҠӇӝӨҸҹӥҼҭӇҦөӔҮӋҫӂҸҵӲӏҶӜӒԀӬӯӗӱԁӢԁӨӔӼԀӨӠӝԆӚԆӝӾԓӠԑԅӤӚӰӺԟԗӳӜԂӺԥԁԣԕӬӭ",
                  (byte)12,
                  68
               );
               ZKM_STR_B[7] = NLoginCore_471.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼвинѝѻѼѪэѳ҃҆҂҇҅љцьѬѬҊюч", (byte)12, 67);
               ZKM_STR_B[8] = NLoginCore_451.A("ãÃûòüčìõĕËē×ĚÜóĎíëþùčąÞÙàĘòĈĂęëĎĩëčíĄòĢēģıĴĒĖĕĬěĐĜīŀĸŃļęĳĶēĝņČĨŌ", (byte)12, 65);
               ZKM_STR_B[9] = NLoginCore_559.E("ԿԼԯ\u0530ԚԴԇԚԒԡՌԨԝԥՎԿԨԐՀԝՐ\u0557ՈԤԓԯԚՌՆԜԷԾԳԵԾ՛ԻԜՙՈՈԼե\u0530", (byte)12, 69);
               ZKM_STR_B[10] = NLoginCore_173.E("ԙԴԼԍԍԗՅԠԟԖՉԐ", (byte)12, 69);
               ZKM_STR_B[11] = NLoginCore_397.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼЮшѐщѴѸјѳѾу҅стѸѕҀьѣҏъџѪ", (byte)12, 67);
               ZKM_STR_B[12] = NLoginCore_076.E("ԔӴԬԣԭԾԝԦՆӼՄԈՋԍԤԿԞԜԯԪԾԶԏԊԑՉԣԹԳՊԜԿ՚ԜԾԞԵԣՓՄՔբէԼՌաԯԾԯԿ\u0530Տ՟բՎՠադԳ՛Լ՛ՒԿ", (byte)12, 69);
               ZKM_STR_B[13] = NLoginCore_433.F("ԞԒ\u0530ԼԀӿԸՆԑԝՀԚԿԧԦՂՀՄԊԢՀԳ\u0530Ե՚ԚԥՏԮԭ\u0557ՑԬԫ՟ՀԼՇՀԳԶՆՇ\u0530", (byte)12, 70);
               ZKM_STR_B[14] = NLoginCore_004.F("ԙԠӹӿԾԢԙԡԸԴԗԐ", (byte)12, 70);
               ZKM_STR_B[15] = NLoginCore_201.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼЮмёњлѽѷрѤѢсѵотјшѿџѺҊѿѩ", (byte)12, 67);
               ZKM_STR_B[16] = NLoginCore_384.D("ХЅндояЮзїЍѕЙќОеѐЯЭрлячРЛТњдъфћЭѐѫЭяЯцдѤѕѥѳѶлиѐѰіѝѯѮрѰџьэ", (byte)12, 68);
               ZKM_STR_B[17] = NLoginCore_453.F("ԒӸԵԔԛԂԺԈԁՆԥԕՀԌԬԛՉՌԬԢՌԨԭԒԓՔԺՉԻԨԕԷբԽԿՅ՞գԻԷԟիէ՜իԩլՁԮՉՐՉխԾԻԼ", (byte)12, 70);
               ZKM_STR_B[18] = NLoginCore_384.F("ԵԝԐՀԠԜԦԧՂԳԣԐ", (byte)12, 70);
               ZKM_STR_B[19] = NLoginCore_384.E("ԙӹԋԳԿԅԨԗԥԺՂՁԊԈԤՑՀՋԒՈԡԴԏՑՔԺԙՆԙՊԴԗԲԿաԺգՏԟԵԽըՓԵԵգէձԬճՊհծդԻԼ", (byte)12, 69);
               ZKM_STR_B[20] = NLoginCore_183.B("ĉüþêÜð÷ÏñĖĆ×ïùüčďÛúàõēêë", (byte)12, 66);
               ZKM_STR_B[21] = NLoginCore_138.B("íÿßóĆďöĂééêß", (byte)12, 66);
               ZKM_STR_B[22] = NLoginCore_324.A("ùċüìĆäòéĆÖĉĘěÜðčàìÜýõßãăàùĤĪ÷ĘûĤçãĤĆĦēđôĨıùÿ", (byte)12, 65);
               ZKM_STR_B[23] = NLoginCore_027.A("đùßčÓĖðĔåòÌ×ćð×Ĕñö÷÷ďúåõûěėġīĞĉĠħĉéĢġĨėČñĴĶĶûĆķČĔŀĕĭĽĝĊċ", (byte)12, 65);
               ZKM_STR_B[24] = NLoginCore_559.C("ЊАЫвДёіИЯЗЭхеЛозЬТѕєСѕѓтѝЩѥъЬљўчфЮяшѴѮѴѣѧѴѷѨѸѴіякѵсѐ҅ѝѶҊҁљѻҍѺѧчѦ", (byte)12, 67);
               ZKM_STR_B[25] = NLoginCore_427.F("ԺԭԯԛԍԡԨԀԢՇԸԨԼԽՈՏԌՏՁԵՏԞԛԜ", (byte)12, 70);
               ZKM_STR_B[26] = NLoginCore_173.F("\u0530ӹԻԤԺ\u0530ԏԶԙԘԓԐ", (byte)12, 70);
               ZKM_STR_B[27] = NLoginCore_223.E("ԪԼԭԝԷԕԣԚԷԇԻԠԻԆԞՌԱԢԼԧԶ\u0530ՍԥԏԭԹԷՎԱԹԿԛԶԯԤԷԳՆԷՙԵԼԨ՞ԤԿ՝՛ԬՔըթՆՆՈՕղՌձՉ\u0558ԿԲ", (byte)12, 69);
               ZKM_STR_B[28] = NLoginCore_553.E("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԲՌՐՎԶԒԤՒԴՈԨԼՋՏԾ՚՛Շ՝Է՜ԣդՙՅԦձՅ՟ՄԦծԾԻԼ", (byte)12, 69);
               ZKM_STR_B[29] = NLoginCore_173.D("ыорЬОвйБгјщњщгевќѐэфоѥЬЭ", (byte)12, 68);
               ZKM_STR_B[30] = NLoginCore_110.C("щлщфгхйдБѐЬС", (byte)12, 67);
               ZKM_STR_B[31] = NLoginCore_141.E("ӳԴԟԾԯԱԠԇԆԫԿԸԃԤՆՏԚԏԜՍԡՍԥԲԱԩԤ՝ԾՕՊԾԜԮՑԻԢ՞Հե\u0558ԴԝՉեՅաՍՙ՝ՒԴԱՇՠ\u0558ՁՍՇԸե՛ԹՊւԸՖՠ՚ԿՑ՝ՃՉգֆՍգփՎ֎\u058cՑիՒ՞՛՜", (byte)12, 69);
               ZKM_STR_B[32] = NLoginCore_397.E("ӾԽӺӽԄՂԹԁԾՋԿԚՌԇԞԐԪՑԞԽԱԮԛԜ", (byte)12, 69);
               ZKM_STR_B[33] = NLoginCore_433.E("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԲՌՐՎԶԒԤՒԴՈԨԼՋՏԾ՚՛Շ՝Է՜ԥԸԺ\u0558ՄԨԹժաՌՋլՕԴչՂՕռյժյԽ", (byte)12, 69);
               ZKM_STR_B[34] = NLoginCore_427.F("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԯԏՁԺՑԲ՚ՏԛՔԮ՚ՎԲԸ՛ՆԠթեՊԩՍաԺՃՌՈԺժՍիԵոիղզՐ՜ՌծԽՓՙ՚նքցձՠորՂիՂ֎ՇդևիզջհՇցւշ֗եՑ֍նծջի", (byte)12, 70);
               ZKM_STR_B[35] = NLoginCore_575.D(
                  "ЉртШЬаъдињДЖгћПбПавѦѓвТоѓзѪэњѢѡџърЬѡѭуѨтѕчѼѲѕњѺѐѹњѥіѻхѠѳѤ҃ѼпѡѺјҒѥ҉ѾчѶѧѢѷ҂ёҙї҆ѝѯѷѬҀҙҕѯѹҚҚѷѼ҃ѬѦҌҍѭѻҤ҇ѽҬҵ҂ҋҚ҇ѺҘґѺүҚҼҠӄҲѼҵҌҍ", (byte)12, 68
               );
               ZKM_STR_B[36] = NLoginCore_387.A("ÎĉñċÞÿßĄÔĔûĔĎĚéöÿėÙÙñĜñðòĞĂČħùĜĚúĐýąĪõþġħùĺĨīıěĶüĮĿļĄĴĐŃĂĦĂŃĂęĨĥĆĽĪĭĬģĎĨģķĪğ", (byte)12, 65);
               ZKM_STR_B[37] = NLoginCore_027.F("ԯԲӼԞԏԿԵԙԽԘԥԅԻԎԋԪԤՐԼԤԠԎԲՌՓՈԷՓԳԝԛՕբբԡԲՂԡԿԢԟՄՙ\u0530", (byte)12, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_110.B("āÍĊééðþñĎĖĐìÜėĎĐüĠüĘòĞĠÙğýėĕĜĂûü", (byte)12, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_091.A("øùĎÝĆäÓđĎėùĜîõûĖĎÓāßĤíêë", (byte)12, 65);
         }
      }
   }

   static {
      b();
   }

   private void a(Object var1, SecretKey var2) {
      if (NLoginCore_313.a() != null) {
         Method var10000 = NLoginCore_313.a();
         Object[] var10002 = new Object[eb];
         var10002[ec] = ed;
         var10002[ee] = var2;
         Object var3 = var10000.invoke(null, var10002);
         var10000 = NLoginCore_313.a();
         var10002 = new Object[ef];
         var10002[eg] = eh;
         var10002[ei] = var2;
         Object var4 = var10000.invoke(null, var10002);
         var10000 = NLoginCore_313.b();
         var10002 = new Object[ej];
         var10002[ek] = var3;
         var10002[el] = var4;
         var10000.invoke(var1, var10002);
      } else {
         Method var7 = NLoginCore_313.b();
         Object[] var10 = new Object[em];
         var10[en] = var2;
         var7.invoke(var1, var10);
      }
   }

   protected void a(User var1, Channel var2, WrapperLoginClientEncryptionResponse var3, NLoginCore_481 var4, boolean var5) {
      if (this.a(var1, var3, var4)) {
         byte[] var6;
         SecretKeySpec var7;
         try {
            var6 = NLoginCore_496.a(NLoginCore_313.a(this.a), var3.getEncryptedSharedSecret());
            var7 = new SecretKeySpec(var6, a(h, i ^ j));
         } catch (GeneralSecurityException var28) {
            var1.closeConnection();
            return;
         }

         Object var8 = var4.h();
         if (!var5) {
            this.a(var8, var7);
         }

         boolean var9 = NLoginCore_329.d.ar();
         ForceRegisterConfig var10 = var4.a();
         String var11 = var4.ax();
         String var12 = NLoginCore_496.a(a(k, l ^ m), var6, NLoginCore_313.a(this.a).getPublic());
         NLoginCore_123 var13 = NLoginCore_371.a(NLoginCore_313.a(this.a), var11, var12, null);
         switch (var13.p()) {
            case 0:
               NLoginCore_234.j(var1, a(az, ba ^ bb));
               NLoginCore_370.d(a(bc, bd ^ be) + var11 + a(bf & bg, bh) + var13.p() + a(bi, bj ^ bk));
               break;
            case 200:
               NLoginCore_259 var29 = NLoginCore_371.a(var13.V());
               String var15 = var29.getName();
               if (var15 == null) {
                  NLoginCore_234.i(var1, a(n, o ^ p) + var15);
                  return;
               }

               UUID var16 = var29.b();
               if (var16 == null) {
                  NLoginCore_234.i(var1, a(q, r) + var15);
                  return;
               }

               int var17 = s;
               if (var10 != null && var10.getMojangId() != null && !var16.equals(var10.getMojangId())) {
                  String var32 = a(t, u ^ v);
                  Object[] var34 = new Object[w];
                  var34[x] = var10.getMojangId();
                  var34[y] = var16;
                  var34[z] = var10.i();
                  var34[aa] = var15;
                  NLoginCore_370.b(var32, var34);
                  var10 = null;
                  var17 = ab;
               }

               NLoginCore_291 var18 = NLoginCore_313.a(this.a).a();
               ForceRegisterConfig var19 = var18.a(var15, var16, null, (ac != 0));
               if (var19 == null) {
                  NLoginCore_234.i(var1, NLoginCore_150.a(NLoginCore_487.w));
                  return;
               }

               if (var10 == null || var19.r()) {
                  var10 = var19;
               }

               InetAddress var20 = var1.getAddress().getAddress();
               String var21 = var20.getHostAddress();
               String var22 = var9 ? BCryptHashProvider.g(var15, (ae != 0)) : var15;
               if (NLoginCore_313.a(this.a).a().b(var1x -> NLoginCore_234.i(var1, var1x), var10, var21, NLoginCore_477.I)) {
                  return;
               }

               if (NLoginCore_313.a(this.a).a().a(var1x -> NLoginCore_234.i(var1, var1x), var10, var21, NLoginCore_477.Q)) {
                  return;
               }

               if (!var18.a(var10, var16, var15, var21, (var17 != 0))) {
                  NLoginCore_234.i(var1, NLoginCore_150.a(NLoginCore_487.w));
                  return;
               }

               NLoginCore_277 var23 = NLoginCore_313.a(this.a).b().a(var22);
               if (var23 != null && var23.R()) {
                  var23.a(NLoginCore_150.a(NLoginCore_487.Y));
               }

               NLoginCore_454[] var24 = var29.a();
               NLoginCore_454 var25 = var24.length > 0 ? var24[ah] : null;
               Runnable var26 = NLoginCore_179.a(var8, var22, var10.a(), var25);
               com.nickuc.login.bukkit.BukkitHelper_001 var27 = new com.nickuc.login.bukkit.BukkitHelper_001(
                  var1, var10, var15, var10.a(), (ai != 0), var26, var2, var25
               );
               var2.attr(com.nickuc.login.bukkit.BukkitHelper_001.a).set(var27);
               com.nickuc.login.bukkit.BukkitHelper_001.a(var22, var4.ay(), var20, var27);
               if (var5) {
                  var1.receivePacketSilently(var3);
               } else {
                  NLoginCore_313.b(var1, var4.a(), var22);
               }
               break;
            case 204:
               String var30;
               if (!var9 && (var10 == null || !var10.t())) {
                  NLoginCore_487 var31 = NLoginCore_487.ab;
                  Object[] var33 = new Object[al];
                  var33[am] = var11;
                  var30 = NLoginCore_150.a(var31, var33);
               } else {
                  NLoginCore_487 var10000 = NLoginCore_487.aa;
                  Object[] var10001 = new Object[aj];
                  var10001[ak] = var11;
                  var30 = NLoginCore_150.a(var10000, var10001);
               }

               String var14 = var30;
               NLoginCore_234.i(var1, var14);
               break;
            case 429:
               NLoginCore_234.j(var1, a(an & ao, ap));
               NLoginCore_370.d(a(aq & ar, as) + var11 + a(at, au) + var13.p() + a(av, aw ^ ax));
               break;
            default:
               NLoginCore_234.j(var1, a(bm & bn, bo));
               NLoginCore_370.d(a(bp, bq) + var11 + a(br, bs ^ bt) + var13.p() + a(bu, bv));
         }
      }
   }

   private boolean a(User var1, WrapperLoginClientEncryptionResponse var2, NLoginCore_481 var3) {
      try {
         NLoginCore_517 var4 = var3.a();
         if (var4 != null) {
            SaltSignature var8 = (SaltSignature)var2.getSaltSignature().orElse(null);
            if (var8 == null) {
               NLoginCore_234.i(var1, a(bx & by, bz));
               NLoginCore_370.b(a(ca, cb) + var3.ax() + a(cc & cd, ce) + var1.getAddress() + a(cf, cg ^ ch));
               return (cj != 0);
            } else if (!var4.a(var8.getSignature(), var3.d(), var8.getSalt())) {
               NLoginCore_234.i(var1, a(ck, cl ^ cm));
               return (cn != 0);
            } else {
               return (co != 0);
            }
         } else {
            byte[] var5 = (byte[])var2.getEncryptedVerifyToken().orElse(null);
            if (var5 == null) {
               NLoginCore_234.i(var1, a(cp & cq, cr));
               NLoginCore_370.b(a(cs, ct) + var3.ax() + a(cu, cv ^ cw) + var1.getAddress() + a(cx & cy, cz));
               return (db != 0);
            } else {
               byte[] var6 = var3.d();
               if (!Arrays.equals(var6, NLoginCore_496.a(NLoginCore_313.a(this.a), var5))) {
                  NLoginCore_234.i(var1, a(dc, dd ^ de));
                  NLoginCore_370.b(
                     a(df, dg ^ dh)
                        + var3.ax()
                        + a(di, dj ^ dk)
                        + var1.getAddress()
                        + a(dl, dm)
                        + Arrays.toString(var6)
                        + a(dn, var_do ^ dp)
                        + Arrays.toString(var5)
                  );
                  return (dr != 0);
               } else {
                  return (ds != 0);
               }
            }
         }
      } catch (Exception var7) {
         NLoginCore_234.i(var1, a(dt, du ^ dv));
         if (!(var7 instanceof GeneralSecurityException)) {
            NLoginCore_370.d(a(dw, dx ^ dy));
         }

         return (ea != 0);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_172.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.C("ϦЈЊϪЎЭХлЧ϶дЪивϻРтсйпйЎ", (byte)3, 67), NLoginCore_172.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾ࢘ࡺࢆ࢜࢝ࡵࡪ\u0894ࡸ\u0891࢚\u0897\u0892ࢢԘ", (byte)3, 70) + var1 + NLoginCore_092.B("¿", (byte)3, 66) + var2.toString(),
            var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(PacketReceiveEvent var1) {
      User var2 = var1.getUser();
      Channel var3 = (Channel)var1.getChannel();
      NLoginCore_481 var4 = (NLoginCore_481)var3.attr(NLoginCore_481.e).getAndSet(null);
      if (var4 == null) {
         NLoginCore_234.i(var2, a(a, b));
      } else {
         var1.setCancelled((c != 0));
         WrapperLoginClientEncryptionResponse var5 = new WrapperLoginClientEncryptionResponse(var1);
         boolean var6 = NLoginCore_313.a(this.a).a().getOnlineMode();
         String var7 = var4.ax();
         InetAddress var8 = var2.getAddress().getAddress();
         NLoginCore_280 var9 = NLoginCore_073.a(var7, var8);
         switch (NLoginCore_522.P[var9.ordinal()]) {
            case 1:
            case 2:
               NLoginCore_073.a(NLoginCore_313.a(this.a), var7, var8, NLoginCore_280.a);
            default:
               NLoginCore_313.a(this.a).b((d != 0)).a(() -> {
                  try {
                     if (!var3.isOpen() || !var3.isActive()) {
                        return;
                     }

                     this.a(var2, var3, var5, var4, var6);
                  } catch (Throwable var7x) {
                     NLoginCore_234.i(var2, a(eo & ep, eq));
                     NLoginCore_370.c(a(er, es ^ et) + var4.ax() + a(eu & ev, ew), var7x);
                  }
               });
         }
      }
   }
}
