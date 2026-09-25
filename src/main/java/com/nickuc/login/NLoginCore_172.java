/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.util.crypto.SaltSignature
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientEncryptionResponse
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SaltSignature;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientEncryptionResponse;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest;
import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_481;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_313;
import com.nickuc.login.NLoginCore_371;
import com.nickuc.login.NLoginCore_234;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_496;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_522;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_179;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_123;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_259;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_517;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_454;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
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

public class NLoginCore_172
implements NLoginInterface_003,
NLoginInterface_043 {
    private static int k;
    private static int cy;
    private static long dv;
    private static long dj;
    private static int ef;
    private static int bf;
    private static int dn;
    private static int t;
    private static int cq;
    private static long et;
    private static int bu;
    private static long cv;
    private static int cd;
    private static int ae;
    private static long p;
    private static int ad;
    private static int el;
    private static long dp;
    private static long bh;
    private static long j;
    private static int ag;
    private static int ao;
    private static int ar;
    private static int dc;
    private static int w;
    private static int x;
    private static long l;
    private static long ch;
    private static long i;
    private static int di;
    private static long cz;
    private static int cn;
    private static int s;
    private static int dw;
    private static int ex;
    private static int var_int_a;
    private static int var_int_c;
    private static long es;
    private static int az;
    private static long ew;
    private static int d;
    private static int ay;
    private static long as;
    private static int ee;
    private static int br;
    private static int am;
    private static int e;
    private static int q;
    private static int y;
    private static int bn;
    private static int bg;
    private static int dz;
    private static int ei;
    private static int co;
    private static int ey;
    private static int bi;
    private static int aa;
    private static int cu;
    private static int at;
    private static int aq;
    private static int h;
    private static int en;
    private static long cb;
    private static long dg;
    private static long bz;
    private static int cj;
    private static int aj;
    private static int dr;
    private static long aw;
    private static int eh;
    private static int cf;
    private static int cc;
    private static int dq;
    private static long bb;
    private static int cx;
    private static long cg;
    private static long u;
    private static long dx;
    private static long o;
    private static long r;
    private static int by;
    private static long bt;
    private static long dh;
    private static int bm;
    private static int ca;
    private static long dm;
    private static int ai;
    private static int av;
    private static int cp;
    private static int db;
    private static int ck;
    private static String[] var_java_lang_String_arr_a;
    private static int ec;
    private static int f;
    private static long ax;
    private static int er;
    private static long ba;
    private static int dl;
    private static int z;
    private static int df;
    private static long bd;
    private static String[] var_java_lang_String_arr_b;
    private static long bk;
    private static int eg;
    private static long au;
    final /* synthetic */ NLoginCore_313 var_com_nickuc_login_NLoginCore_313_a;
    private static int ac;
    private static int ah;
    private static int bc;
    private static int ed;
    private static long be;
    private static long cw;
    private static long dd;
    private static int al;
    private static int cs;
    private static int ek;
    private static long eq;
    private static long var_long_c;
    private static long du;
    private static int ev;
    private static int da;
    private static int n;
    private static int bp;
    private static int af;
    private static long bq;
    private static long cfr_renamed_1;
    private static long cr;
    private static int eu;
    private static long bs;
    private static long cm;
    private static int dt;
    private static int ea;
    private static int em;
    private static long dy;
    private static long bj;
    private static long g;
    private static int bl;
    private static long cl;
    private static long var_long_b;
    private static long de;
    private static long v;
    private static int ez;
    private static int ds;
    private static int an;
    private static int bx;
    private static int eo;
    private static long ce;
    private static int ep;
    private static int eb;
    private static long bo;
    private static int ej;
    private static int ab;
    private static long m;
    private static long ap;
    private static int bw;
    private static int ak;
    private static long ct;
    private static long bv;
    private static long dk;
    private static int ci;

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        WrapperLoginServerEncryptionRequest wrapperLoginServerEncryptionRequest = new WrapperLoginServerEncryptionRequest(packetSendEvent);
        User user = packetSendEvent.getUser();
        Channel channel = (Channel)packetSendEvent.getChannel();
        NLoginCore_481 NLoginCore_481 = (NLoginCore_481)channel.attr((AttributeKey)NLoginCore_481.var_long_e).get();
        if (NLoginCore_481 == null) {
            NLoginCore_234.i(user, (String)NLoginCore_172.c("㺀", (int)(e & f), (long)g));
            return;
        }
        String string = NLoginCore_481.ax();
        InetAddress inetAddress = user.getAddress().getAddress();
        NLoginCore_280 NLoginCore_280 = NLoginCore_073.com_nickuc_login_NLoginCore_280_a(string, inetAddress);
        NLoginCore_073.a(NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_a), string, inetAddress, NLoginCore_280 == NLoginCore_280.var_com_nickuc_login_NLoginCore_280_b ? NLoginCore_280.var_com_nickuc_login_NLoginCore_280_d : NLoginCore_280.var_com_nickuc_login_NLoginCore_280_e);
        channel.attr((AttributeKey)NLoginCore_481.var_long_e).set((Object)NLoginCore_481.a(wrapperLoginServerEncryptionRequest.getVerifyToken()));
    }

    @Generated
    private NLoginCore_172(NLoginCore_313 NLoginCore_3132) {
        this.var_com_nickuc_login_NLoginCore_313_a = NLoginCore_3132;
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x6251F892500E296FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(28 + 41), 83, (byte)(5 + 42), (byte)(39 + 28), (byte)(48 + 18), (byte)(66 + 1), (byte)(45 + 2), (byte)(69 + 11), (byte)(60 + 15), (byte)(29 + 38), (byte)(32 + 51), (byte)(5 + 48), (byte)(40 + 40), (byte)(40 + 57), (byte)(58 + 42), (byte)(59 + 41), (byte)(102 + 3), (byte)(21 + 89), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, (byte)(67 + 16)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.B("ĪķĶùĹĵİĹńĳĀľłĻľńĆҠ҂ҎҤҥѽѲҜҀҙҢҟҚҪ", (byte)36, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_172.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 9026082913980578655L;
        long l = var_long_c ^ 0x6251F892500E296FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(17 + 52), (byte)(82 + 1), (byte)(18 + 29), (byte)(24 + 43), (byte)(50 + 16), (byte)(24 + 43), (byte)(19 + 28), (byte)(53 + 27), (byte)(16 + 59), (byte)(24 + 43), 83, 53, (byte)(52 + 28), (byte)(95 + 2), (byte)(97 + 3), (byte)(53 + 47), (byte)(37 + 68), (byte)(36 + 74), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(14 + 69)}, StandardCharsets.UTF_8));
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    NLoginCore_172.var_java_lang_String_arr_b[0] = NLoginCore_427.B("đùßčÓĖðĔåòÚęìÔĔēïõüĎÞýêë", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[1] = NLoginCore_138.F("ՂԪԐԾԄՇԡՅԖԣԋՊԝԅՅՄԠԦԭԿԏԮԛԜ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[2] = NLoginCore_559.D("ЋШЎщпФыіеИдС", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[3] = NLoginCore_324.E("ԓԷԴӽՀԘԇԲԿՇՅԐ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[4] = NLoginCore_027.B("ÆÜåĔòèđ×đĔėčøùÛôĠÿâïóďăĢĘĈĢīöčĀĐĮìñĎĭìòñėęĸÿ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[5] = NLoginCore_091.C("ЋсєАъЯіуХёжЪќЛљѡнлбНкУўѓѦѡѕыШфяѱ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[6] = NLoginCore_324.B("áĒĂÐčïčĊÏôđĖćØþûČóėÙíĂåĀęàĂþħ÷ĭħĩĞĈëġĄĵĮČċĕíĒöĮćŀāŃĂĀĮħğĞĸĝŃĜħŉįćņĭŋňĐŕİŀŅĤŎĒŏĮĪĨŁĹıŐĤŢřŅħūŜķŠĥłŅĮşŎŃŶŖŶŋřŨŇŏŌķĺŜŭųŬŚŀņŤƄƇŻłłƄŦƈƐƃŋƊŋőƃƉŪšƔƘřŹŖřơſƏůƟƚƚƁŞƅƛƦŶŷƣźūƅŤƧƒŬƉũƀŶųưƍŴƚƐƾƪƭƕƯƿƠƿƦƒƺƾƦƞƛǄƤǄƧƫǉƝǏƳǄƦƕƟ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼлѴѾќѨљѸѱѲѥ҃џьэ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[8] = NLoginCore_451.C("ХЅндояЮзїЍѕЙќОеѐЯЭрлячРЛТњдъфћЭѐѫЭяЯцдѤѕѥѳѸёѺѹиѹџуѢѤќ҅ьэ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[9] = NLoginCore_387.B("ĎċþÿéăÖéáðě÷ìôĝĎ÷ßďìğĦėóâþéěĕëĆčģČēıĝĔĥĒĊčİÿ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[10] = NLoginCore_004.F("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[11] = NLoginCore_173.A("êąëĈãĄĂĄĐ÷ëĆĆĖĔ×ßüýğ÷ĤďäĤĄĊèĄċćĄģĞĠĪāĦĠİĴĺùĲļĚĦėĶįİģŁĝĊċ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ãÃûòüčìõĕËē×ĚÜóĎíëþùčąÞÙàĘòĈĂęëĎĩëčíĄòĢēģıĶďĸķöķĝāĠĢĚŃĊċ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ЯУсэБАщїТЮёЫѐизѓёѕЛгёфсцѫЫжѠпоѨѢѲєнѳѰїђхѕђшс", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[14] = NLoginCore_091.F("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[15] = NLoginCore_091.A("êąëĈãĄĂĄĐ÷ëĆĆĖĔ×ßüýğ÷ĤďäĤĄĊèĄċćĄģĞĠĪāĦĠİĴĺùĲļĚĦėĶįİģŁĝĊċ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[16] = NLoginCore_384.E("ԔӴԬԣԭԾԝԦՆӼՄԈՋԍԤԿԞԜԯԪԾԶԏԊԑՉԣԹԳՊԜԿ՚ԜԾԞԵԣՓՄՔբէՀթըԧըՎԲՑՓՋմԻԼ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[17] = NLoginCore_223.A("áÇĄãêÑĉ×ÐĕôäďÛûêĘěûñě÷üáâģĉĘĊ÷äĆıČĎĔĭĲĊĆîĺĶöôİİĚĚĢĿĞĒŃĊċ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[18] = NLoginCore_173.E("ӷԮԝԣՁԙԹӺԞԉԂԐ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[19] = NLoginCore_004.F("ԙӹԋԳԿԅԨԗԥԺՂՁԊԈԤՑՀՋԒՈԡԴԏՑՔԺԙՆԙՊԴԗԲԿաԺգՏԟԵԽըՋԞՖ՞ԬԽՌԤիՠ՟դԻԼ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[20] = NLoginCore_092.E("ԺԭԯԛԍԡԨԀԢՇԷԚԦՇԹԫԏԲԧԎԠՄԛԜ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[21] = NLoginCore_091.F("ԚԒԮӶՄԱӹԃԟԸԆԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[22] = NLoginCore_004.C("лэоЮшЦдЫшИыњѝОвяТЮОпзСХхТлѦѬйњнѦѓгчцуѯтѲфѻфс", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[23] = NLoginCore_027.B("đùßčÓĖðĔåòÌ×ćð×Ĕñö÷÷ďúåõûěėġīĞĉĠħĉéĢġĨėČñĴķĲôĬĹĮĪĊĞĒöĝĊċ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ÈÎéðÒďĔÖíÕëăóÙüõêàēĒßēđĀěçģĈêėĜąĂìčĆĲĬĲġĥĲĵĦĶĲĔčøĳÿĎŃďĀĸĦĺīēėġĘĬ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[25] = NLoginCore_201.C("ыорЬОвйБгјшЫзјъмРуиПбѕЬЭ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[26] = NLoginCore_384.B("éáýÅēĀÈÒîćÕß", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[27] = NLoginCore_110.D("лэоЮшЦдЫшИьбьЗЯѝтгэичсўжРоъшџтъѐЬчрешфїшѪцэцѝѽнгђѠѸё҅ѵьэ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[28] = NLoginCore_223.D("ХЅндояЮзїЍѕХкЬМРяРрЗбуѝѡџчУеѣхљйэќѠяѫѬјѮшѭждцшѐюрѾж҆ѯѵьэ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[29] = NLoginCore_173.B("ĉüþêÜð÷ÏñĖĆéõĖĈúÞāöÝïēêë", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[30] = NLoginCore_110.C("ЫУпЇѕтЊДащЗС", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[31] = NLoginCore_324.E("ӳԴԟԾԯԱԠԇԆԫԿԸԃԤՆՏԚԏԜՍԡՍԥԲԱԩԤ՝ԾՕՊԾԜԮՑԻԢ՞Հե՘ԴԝՉեՅաՍՙ՝ՒԴԱՇՠ՘ՁՍՇԸե՛ԹՊմնդլտտՇՑդՇցՐ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[32] = NLoginCore_427.B("ÍČÉÌÓđĈÐčĚďñóöñììáĝēďēêë", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[33] = NLoginCore_575.D("ХЅндояЮзїЍѕХкЬМРяРрЗбуѝѡџчУеѣхљйэќѠяѫѬјѮшѭждцшѐюрѾж҆ѯѵьэ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[34] = NLoginCore_223.A("ãÃûòüčìõĕËēãøêÚÞčÞþÕïþÞĐĉĠāĩĞêģýĩĝāćĪĕïĸĴęøĜİĉĒěėĉĹĜĺĄŇĺŁĵğīěĽČĢĨĩŅœŐŀįŇŏđĺđŝĖĳŖĺĵŊĿĖőĺĢśĵļĤłĪŁŬ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[35] = NLoginCore_091.D("ЉртШЬаъдињДЖгћПбПавѦѓвТоѓзѪэњѢѡџърЬѡѭуѨтѕчѼѲѕњѺѐѹњѥіѻхѠѳѤ҃ѼпѡѺјҒѥ҉ѾчѶѧѢѷ҂ёҙї҆ѝѯѷѬҀҙҕѯѹҚҚѷѼ҃ѬѦҌҍѭѻҤ҇ѽҬҵ҂ҋҚ҇ѺҘҌҳғѽҒҌӀҙѿҟҌҍ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[36] = NLoginCore_091.B("ÎĉñċÞÿßĄÔĔûĔĎĚéöÿėÙÙñĜñðòĞĂČħùĜĚúĐýąĪõþġħùĺĨīıěĶüĮĿļĄĴĐŃĂĦĂŃĂęĨĥĻĎġŃĪďķœŔĢĕğ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[37] = NLoginCore_027.A("þāËíÞĎĄèČçôÔĊÝÚùóğċóïÝāěĢėĆĢĂìêĤĩĝďĒĴëĔČĵďùÿ", (byte)12, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_172.var_java_lang_String_arr_b[0] = NLoginCore_110.B("đùßčÓĖðĔåòÌÖĝúÜĝûëČÚĥþęãâûĊąöĜĈĤ", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[1] = NLoginCore_451.A("đùßčÓĖðĔåòÐØĄĝĒĕÙëúĠâăÞþĐéĕāħçģý", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[2] = NLoginCore_027.F("ԵԾԑՅԴӽԹԶՆՊԗԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[3] = NLoginCore_446.C("хБцОѓтыжГфђС", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[4] = NLoginCore_559.A("ÆÜåĔòèđ×đĔėčøùÛôĠÿâïóďăĢĘĈĢīöčĀĐĢðêēìēăĠĘĸİÿ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[5] = NLoginCore_091.D("ЋсєАъЯіуХёжЪќЛљѡнлбНкСеиѣчщѭяуЮу", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[6] = NLoginCore_076.D("УєфВябяьБжѓјщКрнюељЛЯфЧтћТфрѩйѯѩѫѠъЭѣцѷѰюэїЯєиѰщ҂у҅фтѰѩѡѠѺџ҅ўѩҋѱщ҈ѯҍҊђҗѲ҂҇ѦҐєґѰѬѪ҃ѻѳҒѦҤқ҇ѩҭҞѹҢѧ҄҇ѰҡҐ҅ҸҘҸҍқҪ҉ґҎѹѼҞүҵҮҜ҂҈ҦӆӉҽ҄҄ӆҨӊӒӅҍӌҍғӅӋҬңӖӚқһҘқӣӁӑұӡӜӜӃҠӇӝӨҸҹӥҼҭӇҦөӔҮӋҫӂҸҵӲӏҶӜӒԀӬӯӗӱԁӢԁӨӔӼԀӨӠӝԆӚԆӝӾԓӠԑԅӤӚӰӺԟԗӳӜԂӺԥԁԣԕӬӭ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[7] = NLoginCore_384.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼвинѝѻѼѪэѳ҃҆҂҇҅љцьѬѬҊюч", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ãÃûòüčìõĕËē×ĚÜóĎíëþùčąÞÙàĘòĈĂęëĎĩëčíĄòĢēģıĴĒĖĕĬěĐĜīŀĸŃļęĳĶēĝņČĨŌ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[9] = NLoginCore_201.E("ԿԼԯ԰ԚԴԇԚԒԡՌԨԝԥՎԿԨԐՀԝՐ՗ՈԤԓԯԚՌՆԜԷԾԳԵԾ՛ԻԜՙՈՈԼե԰", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[10] = NLoginCore_173.E("ԙԴԼԍԍԗՅԠԟԖՉԐ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[11] = NLoginCore_223.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼЮшѐщѴѸјѳѾу҅стѸѕҀьѣҏъџѪ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[12] = NLoginCore_427.E("ԔӴԬԣԭԾԝԦՆӼՄԈՋԍԤԿԞԜԯԪԾԶԏԊԑՉԣԹԳՊԜԿ՚ԜԾԞԵԣՓՄՔբէԼՌաԯԾԯԿ԰Տ՟բՎՠադԳ՛Լ՛ՒԿ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[13] = NLoginCore_223.F("ԞԒ԰ԼԀӿԸՆԑԝՀԚԿԧԦՂՀՄԊԢՀԳ԰Ե՚ԚԥՏԮԭ՗ՑԬԫ՟ՀԼՇՀԳԶՆՇ԰", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[14] = NLoginCore_451.F("ԙԠӹӿԾԢԙԡԸԴԗԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[15] = NLoginCore_201.C("ЬчЭъХцфцђйЭшшјіЙСопѡйѦёЦѦцьЪцэщцѥѠѢѬуѨѢѲѶѼЮмёњлѽѷрѤѢсѵотјшѿџѺҊѿѩ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[16] = NLoginCore_324.D("ХЅндояЮзїЍѕЙќОеѐЯЭрлячРЛТњдъфћЭѐѫЭяЯцдѤѕѥѳѶлиѐѰіѝѯѮрѰџьэ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[17] = NLoginCore_453.F("ԒӸԵԔԛԂԺԈԁՆԥԕՀԌԬԛՉՌԬԢՌԨԭԒԓՔԺՉԻԨԕԷբԽԿՅ՞գԻԷԟիէ՜իԩլՁԮՉՐՉխԾԻԼ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[18] = NLoginCore_324.F("ԵԝԐՀԠԜԦԧՂԳԣԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[19] = NLoginCore_324.E("ԙӹԋԳԿԅԨԗԥԺՂՁԊԈԤՑՀՋԒՈԡԴԏՑՔԺԙՆԙՊԴԗԲԿաԺգՏԟԵԽըՓԵԵգէձԬճՊհծդԻԼ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[20] = NLoginCore_110.B("ĉüþêÜð÷ÏñĖĆ×ïùüčďÛúàõēêë", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[21] = NLoginCore_138.B("íÿßóĆďöĂééêß", (byte)12, 66);
                    NLoginCore_172.var_java_lang_String_arr_b[22] = NLoginCore_324.A("ùċüìĆäòéĆÖĉĘěÜðčàìÜýõßãăàùĤĪ÷ĘûĤçãĤĆĦēđôĨıùÿ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[23] = NLoginCore_027.A("đùßčÓĖðĔåòÌ×ćð×Ĕñö÷÷ďúåõûěėġīĞĉĠħĉéĢġĨėČñĴĶĶûĆķČĔŀĕĭĽĝĊċ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[24] = NLoginCore_201.C("ЊАЫвДёіИЯЗЭхеЛозЬТѕєСѕѓтѝЩѥъЬљўчфЮяшѴѮѴѣѧѴѷѨѸѴіякѵсѐ҅ѝѶҊҁљѻҍѺѧчѦ", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[25] = NLoginCore_027.F("ԺԭԯԛԍԡԨԀԢՇԸԨԼԽՈՏԌՏՁԵՏԞԛԜ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[26] = NLoginCore_173.F("԰ӹԻԤԺ԰ԏԶԙԘԓԐ", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[27] = NLoginCore_223.E("ԪԼԭԝԷԕԣԚԷԇԻԠԻԆԞՌԱԢԼԧԶ԰ՍԥԏԭԹԷՎԱԹԿԛԶԯԤԷԳՆԷՙԵԼԨ՞ԤԿ՝՛ԬՔըթՆՆՈՕղՌձՉ՘ԿԲ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[28] = NLoginCore_076.E("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԲՌՐՎԶԒԤՒԴՈԨԼՋՏԾ՚՛Շ՝Է՜ԣդՙՅԦձՅ՟ՄԦծԾԻԼ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[29] = NLoginCore_173.D("ыорЬОвйБгјщњщгевќѐэфоѥЬЭ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[30] = NLoginCore_004.C("щлщфгхйдБѐЬС", (byte)12, 67);
                    NLoginCore_172.var_java_lang_String_arr_b[31] = NLoginCore_138.E("ӳԴԟԾԯԱԠԇԆԫԿԸԃԤՆՏԚԏԜՍԡՍԥԲԱԩԤ՝ԾՕՊԾԜԮՑԻԢ՞Հե՘ԴԝՉեՅաՍՙ՝ՒԴԱՇՠ՘ՁՍՇԸե՛ԹՊւԸՖՠ՚ԿՑ՝ՃՉգֆՍգփՎ֎֌ՑիՒ՞՛՜", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[32] = NLoginCore_223.E("ӾԽӺӽԄՂԹԁԾՋԿԚՌԇԞԐԪՑԞԽԱԮԛԜ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[33] = NLoginCore_223.E("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԲՌՐՎԶԒԤՒԴՈԨԼՋՏԾ՚՛Շ՝Է՜ԥԸԺ՘ՄԨԹժաՌՋլՕԴչՂՕռյժյԽ", (byte)12, 69);
                    NLoginCore_172.var_java_lang_String_arr_b[34] = NLoginCore_027.F("ԔӴԬԣԭԾԝԦՆӼՄԔԩԛԋԏԾԏԯԆԠԯԏՁԺՑԲ՚ՏԛՔԮ՚ՎԲԸ՛ՆԠթեՊԩՍաԺՃՌՈԺժՍիԵոիղզՐ՜ՌծԽՓՙ՚նքցձՠորՂիՂ֎ՇդևիզջհՇցւշ֗եՑ֍նծջի", (byte)12, 70);
                    NLoginCore_172.var_java_lang_String_arr_b[35] = NLoginCore_575.D("ЉртШЬаъдињДЖгћПбПавѦѓвТоѓзѪэњѢѡџърЬѡѭуѨтѕчѼѲѕњѺѐѹњѥіѻхѠѳѤ҃ѼпѡѺјҒѥ҉ѾчѶѧѢѷ҂ёҙї҆ѝѯѷѬҀҙҕѯѹҚҚѷѼ҃ѬѦҌҍѭѻҤ҇ѽҬҵ҂ҋҚ҇ѺҘґѺүҚҼҠӄҲѼҵҌҍ", (byte)12, 68);
                    NLoginCore_172.var_java_lang_String_arr_b[36] = NLoginCore_387.A("ÎĉñċÞÿßĄÔĔûĔĎĚéöÿėÙÙñĜñðòĞĂČħùĜĚúĐýąĪõþġħùĺĨīıěĶüĮĿļĄĴĐŃĂĦĂŃĂęĨĥĆĽĪĭĬģĎĨģķĪğ", (byte)12, 65);
                    NLoginCore_172.var_java_lang_String_arr_b[37] = NLoginCore_027.F("ԯԲӼԞԏԿԵԙԽԘԥԅԻԎԋԪԤՐԼԤԠԎԲՌՓՈԷՓԳԝԛՕբբԡԲՂԡԿԢԟՄՙ԰", (byte)12, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_172.var_java_lang_String_arr_b[0] = NLoginCore_004.B("āÍĊééðþñĎĖĐìÜėĎĐüĠüĘòĞĠÙğýėĕĜĂûü", (byte)12, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_172.var_java_lang_String_arr_b[0] = NLoginCore_091.A("øùĎÝĆäÓđĎėùĜîõûĖĎÓāßĤíêë", (byte)12, 65);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(6836200976096477886L);
        var_int_c = (0x40000000 >>> 62 | 0x40000000 << -62) & 0xFFFFFFFF;
        d = 0x2000000 >>> 153 | 0x2000000 << -153;
        e = (16 >>> 196 | 16 << ~196 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = Long.reverse(6836200976096477886L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-369558427696315714L);
        j = Long.reverse(-6629298651489370112L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-369558427696315714L);
        m = Long.reverse(-6629298651489370112L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(-369558427696315714L);
        p = Long.reverse(-6629298651489370112L);
        q = 320 >>> 70 | 320 << ~70 + 1;
        r = Long.reverse(6836200976096477886L);
        s = Integer.reverse(0);
        t = Integer.reverse(0x60000000);
        u = Long.reverse(-369558427696315714L);
        v = Long.reverse(-6629298651489370112L);
        w = 262144 >>> 208 | 262144 << -208;
        x = Integer.reverse(0);
        y = 0x200000 >>> 21 | 0x200000 << ~21 + 1;
        z = (0x1000000 >>> 151 | 0x1000000 << ~151 + 1) & 0xFFFFFFFF;
        aa = Integer.reverse(-1073741824);
        ab = 2 >>> 1 | 2 << ~1 + 1;
        ac = Integer.reverse(0);
        ad = 0 >>> 46 | 0 << ~46 + 1;
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = Integer.reverse(0);
        ag = 0 >>> 66 | 0 << ~66 + 1;
        ah = Integer.reverse(0);
        ai = (0 >>> 47 | 0 << -47) & 0xFFFFFFFF;
        aj = (0x200000 >>> 213 | 0x200000 << -213) & 0xFFFFFFFF;
        ak = Integer.reverse(0);
        al = Integer.reverse(Integer.MIN_VALUE);
        am = (0 >>> 216 | 0 << -216) & 0xFFFFFFFF;
        an = Integer.reverse(-536870912);
        ao = Integer.reverse(-1);
        ap = Long.reverse(6836200976096477886L);
        aq = Integer.reverse(0x10000000);
        ar = Integer.reverse(-1);
        as = Long.reverse(6836200976096477886L);
        at = 0x24000000 >>> 218 | 0x24000000 << ~218 + 1;
        au = Long.reverse(6836200976096477886L);
        av = Integer.reverse(0x50000000);
        aw = Long.reverse(-369558427696315714L);
        ax = Long.reverse(-6629298651489370112L);
        ay = 0 >>> 206 | 0 << ~206 + 1;
        az = 180224 >>> 78 | 180224 << ~78 + 1;
        ba = Long.reverse(-369558427696315714L);
        bb = Long.reverse(-6629298651489370112L);
        bc = Integer.reverse(0x30000000);
        bd = Long.reverse(-369558427696315714L);
        be = Long.reverse(-6629298651489370112L);
        bf = 851968 >>> 208 | 851968 << ~208 + 1;
        bg = Integer.reverse(-1);
        bh = Long.reverse(6836200976096477886L);
        bi = Integer.reverse(0x70000000);
        bj = Long.reverse(-369558427696315714L);
        bk = Long.reverse(-6629298651489370112L);
        bl = 0 >>> 126 | 0 << ~126 + 1;
        bm = Integer.reverse(-268435456);
        bn = Integer.reverse(-1);
        bo = Long.reverse(6836200976096477886L);
        bp = Integer.reverse(0x8000000);
        bq = Long.reverse(6836200976096477886L);
        br = Integer.reverse(-2013265920);
        bs = Long.reverse(-369558427696315714L);
        bt = Long.reverse(-6629298651489370112L);
        bu = Integer.reverse(0x48000000);
        bv = Long.reverse(6836200976096477886L);
        bw = Integer.reverse(0);
        bx = Integer.reverse(-939524096);
        by = -1 >>> 12 | -1 << ~12 + 1;
        bz = Long.reverse(6836200976096477886L);
        ca = Integer.reverse(0x28000000);
        cb = Long.reverse(6836200976096477886L);
        cc = Integer.reverse(-1476395008);
        cd = Integer.reverse(-1);
        ce = Long.reverse(6836200976096477886L);
        cf = 0x2C00000 >>> 245 | 0x2C00000 << ~245 + 1;
        cg = Long.reverse(-369558427696315714L);
        ch = Long.reverse(-6629298651489370112L);
        ci = 0 >>> 202 | 0 << ~202 + 1;
        cj = Integer.reverse(0);
        ck = 5888 >>> 8 | 5888 << -8;
        cl = Long.reverse(-369558427696315714L);
        cm = Long.reverse(-6629298651489370112L);
        cn = Integer.reverse(0);
        co = (64 >>> 38 | 64 << ~38 + 1) & 0xFFFFFFFF;
        cp = 0x600000 >>> 210 | 0x600000 << ~210 + 1;
        cq = Integer.reverse(-1);
        cr = Long.reverse(6836200976096477886L);
        cs = Integer.reverse(-1744830464);
        ct = Long.reverse(6836200976096477886L);
        cu = Integer.reverse(0x58000000);
        cv = Long.reverse(-369558427696315714L);
        cw = Long.reverse(-6629298651489370112L);
        cx = (0x60000003 >>> 189 | 0x60000003 << -189) & 0xFFFFFFFF;
        cy = (-1 >>> 77 | -1 << ~77 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(6836200976096477886L);
        da = Integer.reverse(0);
        db = Integer.reverse(0);
        dc = (57344 >>> 203 | 57344 << -203) & 0xFFFFFFFF;
        dd = Long.reverse(-369558427696315714L);
        de = Long.reverse(-6629298651489370112L);
        df = Integer.reverse(-1207959552);
        dg = Long.reverse(-369558427696315714L);
        dh = Long.reverse(-6629298651489370112L);
        di = (0x780000 >>> 18 | 0x780000 << ~18 + 1) & 0xFFFFFFFF;
        dj = Long.reverse(-369558427696315714L);
        dk = Long.reverse(-6629298651489370112L);
        dl = Integer.reverse(-134217728);
        dm = Long.reverse(6836200976096477886L);
        dn = Integer.reverse(0x4000000);
        cfr_renamed_1 = Long.reverse(-369558427696315714L);
        dp = Long.reverse(-6629298651489370112L);
        dq = Integer.reverse(0);
        dr = Integer.reverse(0);
        ds = Integer.reverse(Integer.MIN_VALUE);
        dt = (0x420000 >>> 17 | 0x420000 << ~17 + 1) & 0xFFFFFFFF;
        du = Long.reverse(-369558427696315714L);
        dv = Long.reverse(-6629298651489370112L);
        dw = Integer.reverse(0x44000000);
        dx = Long.reverse(-369558427696315714L);
        dy = Long.reverse(-6629298651489370112L);
        dz = Integer.reverse(0);
        ea = 0 >>> 11 | 0 << -11;
        eb = 1024 >>> 169 | 1024 << ~169 + 1;
        ec = (0 >>> 212 | 0 << -212) & 0xFFFFFFFF;
        ed = 0x400000 >>> 53 | 0x400000 << -53;
        ee = Integer.reverse(Integer.MIN_VALUE);
        ef = (64 >>> 165 | 64 << ~165 + 1) & 0xFFFFFFFF;
        eg = Integer.reverse(0);
        eh = Integer.reverse(Integer.MIN_VALUE);
        ei = (1024 >>> 10 | 1024 << -10) & 0xFFFFFFFF;
        ej = (8 >>> 226 | 8 << ~226 + 1) & 0xFFFFFFFF;
        ek = Integer.reverse(0);
        el = Integer.reverse(Integer.MIN_VALUE);
        em = Integer.reverse(Integer.MIN_VALUE);
        en = Integer.reverse(0);
        eo = (17920 >>> 233 | 17920 << ~233 + 1) & 0xFFFFFFFF;
        ep = (-1 >>> 110 | -1 << ~110 + 1) & 0xFFFFFFFF;
        eq = Long.reverse(6836200976096477886L);
        er = Integer.reverse(0x24000000);
        es = Long.reverse(-369558427696315714L);
        et = Long.reverse(-6629298651489370112L);
        eu = 0x4A0000 >>> 81 | 0x4A0000 << ~81 + 1;
        ev = (-1 >>> 4 | -1 << -4) & 0xFFFFFFFF;
        ew = Long.reverse(6836200976096477886L);
        ex = (0 >>> 175 | 0 << -175) & 0xFFFFFFFF;
        ey = 0x130000 >>> 175 | 0x130000 << ~175 + 1;
        ez = (2432 >>> 70 | 2432 << -70) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ey];
        var_java_lang_String_arr_b = new String[ez];
        NLoginCore_172.b();
    }

    private void a(Object object, SecretKey secretKey) {
        if (NLoginCore_313.a() != null) {
            Object[] objectArray = new Object[eb];
            objectArray[NLoginCore_172.ec] = ed;
            objectArray[NLoginCore_172.ee] = secretKey;
            Object object2 = NLoginCore_313.a().invoke(null, objectArray);
            Object[] objectArray2 = new Object[ef];
            objectArray2[NLoginCore_172.eg] = eh;
            objectArray2[NLoginCore_172.ei] = secretKey;
            Object object3 = NLoginCore_313.a().invoke(null, objectArray2);
            Object[] objectArray3 = new Object[ej];
            objectArray3[NLoginCore_172.ek] = object2;
            objectArray3[NLoginCore_172.el] = object3;
            NLoginCore_313.java_lang_reflect_Method_b().invoke(object, objectArray3);
        } else {
            Object[] objectArray = new Object[em];
            objectArray[NLoginCore_172.en] = secretKey;
            NLoginCore_313.java_lang_reflect_Method_b().invoke(object, objectArray);
        }
    }

    protected void a(User user, Channel channel, WrapperLoginClientEncryptionResponse wrapperLoginClientEncryptionResponse, NLoginCore_481 NLoginCore_481, boolean bl) {
        SecretKeySpec secretKeySpec;
        byte[] byArray;
        if (!this.a(user, wrapperLoginClientEncryptionResponse, NLoginCore_481)) {
            return;
        }
        try {
            byArray = NLoginCore_496.a(NLoginCore_313.java_security_KeyPair_a(this.var_com_nickuc_login_NLoginCore_313_a), wrapperLoginClientEncryptionResponse.getEncryptedSharedSecret());
            secretKeySpec = new SecretKeySpec(byArray, (String)NLoginCore_172.c("㺀", (int)h, (long)(i ^ j)));
        }
        catch (GeneralSecurityException generalSecurityException) {
            user.closeConnection();
            return;
        }
        Object object = NLoginCore_481.h();
        if (!bl) {
            this.a(object, secretKeySpec);
        }
        boolean bl2 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_481.com_nickuc_login_ForceRegisterConfig_a();
        String string2 = NLoginCore_481.ax();
        String string3 = NLoginCore_496.a((String)NLoginCore_172.c("㺃", (int)k, (long)(l ^ m)), byArray, NLoginCore_313.java_security_KeyPair_a(this.var_com_nickuc_login_NLoginCore_313_a).getPublic());
        NLoginCore_123 NLoginCore_1232 = NLoginCore_371.a(NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_a), string2, string3, null);
        switch (NLoginCore_1232.p()) {
            case 200: {
                NLoginCore_454[] NLoginCore_454Array;
                String string4;
                NLoginCore_291 NLoginCore_2912;
                ForceRegisterConfig ForceRegisterConfig3;
                boolean bl3;
                NLoginCore_259 NLoginCore_2592 = NLoginCore_371.a(NLoginCore_1232.V());
                String string5 = NLoginCore_2592.getName();
                if (string5 == null) {
                    NLoginCore_234.i(user, (String)NLoginCore_172.c("㺆", (int)n, (long)(o ^ p)) + string5);
                    return;
                }
                UUID uUID = NLoginCore_2592.java_util_UUID_b();
                if (uUID == null) {
                    NLoginCore_234.i(user, (String)NLoginCore_172.c("㺉", (int)q, (long)r) + string5);
                    return;
                }
                int bl32 = s;
                if (ForceRegisterConfig2 != null && ForceRegisterConfig2.getMojangId() != null && !uUID.equals(ForceRegisterConfig2.getMojangId())) {
                    Object[] objectArray = new Object[w];
                    objectArray[NLoginCore_172.x] = ForceRegisterConfig2.getMojangId();
                    objectArray[NLoginCore_172.y] = uUID;
                    objectArray[NLoginCore_172.z] = ForceRegisterConfig2.i();
                    objectArray[NLoginCore_172.aa] = string5;
                    NLoginCore_370.b((String)NLoginCore_172.c("㺌", (int)t, (long)(u ^ v)), objectArray);
                    ForceRegisterConfig2 = null;
                    bl3 = ab;
                }
                if ((ForceRegisterConfig3 = (NLoginCore_2912 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_a).com_nickuc_login_NLoginCore_291_a()).a(string5, uUID, null, ac != 0)) == null) {
                    NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.w, new Object[ad]));
                    return;
                }
                if (ForceRegisterConfig2 == null || ForceRegisterConfig3.r()) {
                    ForceRegisterConfig2 = ForceRegisterConfig3;
                }
                InetAddress inetAddress = user.getAddress().getAddress();
                String string6 = inetAddress.getHostAddress();
                String string7 = string4 = bl2 ? BCryptHashProvider.g(string5, ae != 0) : string5;
                if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_a).com_nickuc_login_NLoginCore_291_a().b(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, string6, NLoginCore_532.I)) {
                    return;
                }
                if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_a).com_nickuc_login_NLoginCore_291_a().a(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, string6, NLoginCore_532.Q)) {
                    return;
                }
                if (!NLoginCore_2912.a(ForceRegisterConfig2, uUID, string5, string6, bl3)) {
                    NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.w, new Object[af]));
                    return;
                }
                NLoginCore_277 NLoginCore_277 = NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_a).java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string4);
                if (NLoginCore_277 != null && NLoginCore_277.R()) {
                    NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.Y, new Object[ag]));
                }
                NLoginCore_454 NLoginCore_4542 = (NLoginCore_454Array = NLoginCore_2592.a()).length > 0 ? NLoginCore_454Array[ah] : null;
                Runnable runnable = NLoginCore_179.a(object, string4, ForceRegisterConfig2.java_util_UUID_a(), NLoginCore_4542);
                BukkitHelper_001 BukkitHelper_001 = new BukkitHelper_001(user, ForceRegisterConfig2, string5, ForceRegisterConfig2.java_util_UUID_a(), ai != 0, runnable, channel, NLoginCore_4542);
                channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).set((Object)BukkitHelper_001);
                BukkitHelper_001.a(string4, NLoginCore_481.ay(), inetAddress, BukkitHelper_001);
                if (bl) {
                    user.receivePacketSilently((PacketWrapper)wrapperLoginClientEncryptionResponse);
                    break;
                }
                NLoginCore_313.b(user, NLoginCore_481.com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a(), string4);
                break;
            }
            case 204: {
                String string8;
                if (bl2 || ForceRegisterConfig2 != null && ForceRegisterConfig2.t()) {
                    Object[] objectArray = new Object[aj];
                    objectArray[NLoginCore_172.ak] = string2;
                    string8 = NLoginCore_150.a(NLoginCore_374.aa, objectArray);
                } else {
                    Object[] objectArray = new Object[al];
                    objectArray[NLoginCore_172.am] = string2;
                    string8 = NLoginCore_150.a(NLoginCore_374.ab, objectArray);
                }
                String string9 = string8;
                NLoginCore_234.i(user, string9);
                break;
            }
            case 429: {
                NLoginCore_234.j(user, (String)NLoginCore_172.c("㺏", (int)(an & ao), (long)ap));
                NLoginCore_370.d((String)NLoginCore_172.c("㺒", (int)(aq & ar), (long)as) + string2 + (String)NLoginCore_172.c("㺕", (int)at, (long)au) + NLoginCore_1232.p() + (String)NLoginCore_172.c("㺘", (int)av, (long)(aw ^ ax)), new Object[ay]);
                break;
            }
            case 0: {
                NLoginCore_234.j(user, (String)NLoginCore_172.c("㺛", (int)az, (long)(ba ^ bb)));
                NLoginCore_370.d((String)NLoginCore_172.c("㺞", (int)bc, (long)(bd ^ be)) + string2 + (String)NLoginCore_172.c("㺡", (int)(bf & bg), (long)bh) + NLoginCore_1232.p() + (String)NLoginCore_172.c("㺤", (int)bi, (long)(bj ^ bk)), new Object[NLoginCore_172.bl]);
                break;
            }
            default: {
                NLoginCore_234.j(user, (String)NLoginCore_172.c("㺧", (int)(bm & bn), (long)bo));
                NLoginCore_370.d((String)NLoginCore_172.c("㺪", (int)bp, (long)bq) + string2 + (String)NLoginCore_172.c("㺭", (int)br, (long)(bs ^ bt)) + NLoginCore_1232.p() + (String)NLoginCore_172.c("㺰", (int)bu, (long)bv), new Object[bw]);
            }
        }
    }

    private boolean a(User user, WrapperLoginClientEncryptionResponse wrapperLoginClientEncryptionResponse, NLoginCore_481 NLoginCore_481) {
        try {
            NLoginCore_517 NLoginCore_5172 = NLoginCore_481.com_nickuc_login_NLoginCore_517_a();
            if (NLoginCore_5172 != null) {
                SaltSignature saltSignature = wrapperLoginClientEncryptionResponse.getSaltSignature().orElse(null);
                if (saltSignature == null) {
                    NLoginCore_234.i(user, (String)NLoginCore_172.c("㺀", (int)(bx & by), (long)bz));
                    NLoginCore_370.b((String)NLoginCore_172.c("㺃", (int)ca, (long)cb) + NLoginCore_481.ax() + (String)NLoginCore_172.c("㺆", (int)(cc & cd), (long)ce) + user.getAddress() + (String)NLoginCore_172.c("㺉", (int)cf, (long)(cg ^ ch)), new Object[ci]);
                    return cj != 0;
                }
                if (!NLoginCore_5172.a(saltSignature.getSignature(), NLoginCore_481.d(), saltSignature.getSalt())) {
                    NLoginCore_234.i(user, (String)NLoginCore_172.c("㺌", (int)ck, (long)(cl ^ cm)));
                    return cn != 0;
                }
                return co != 0;
            }
            byte[] byArray = wrapperLoginClientEncryptionResponse.getEncryptedVerifyToken().orElse(null);
            if (byArray == null) {
                NLoginCore_234.i(user, (String)NLoginCore_172.c("㺏", (int)(cp & cq), (long)cr));
                NLoginCore_370.b((String)NLoginCore_172.c("㺒", (int)cs, (long)ct) + NLoginCore_481.ax() + (String)NLoginCore_172.c("㺕", (int)cu, (long)(cv ^ cw)) + user.getAddress() + (String)NLoginCore_172.c("㺘", (int)(cx & cy), (long)cz), new Object[da]);
                return db != 0;
            }
            byte[] byArray2 = NLoginCore_481.d();
            if (!Arrays.equals(byArray2, NLoginCore_496.a(NLoginCore_313.java_security_KeyPair_a(this.var_com_nickuc_login_NLoginCore_313_a), byArray))) {
                NLoginCore_234.i(user, (String)NLoginCore_172.c("㺛", (int)dc, (long)(dd ^ de)));
                NLoginCore_370.b((String)NLoginCore_172.c("㺞", (int)df, (long)(dg ^ dh)) + NLoginCore_481.ax() + (String)NLoginCore_172.c("㺡", (int)di, (long)(dj ^ dk)) + user.getAddress() + (String)NLoginCore_172.c("㺤", (int)dl, (long)dm) + Arrays.toString(byArray2) + (String)NLoginCore_172.c("㺧", (int)dn, (long)(cfr_renamed_1 ^ dp)) + Arrays.toString(byArray), new Object[dq]);
                return dr != 0;
            }
            return ds != 0;
        }
        catch (Exception exception) {
            NLoginCore_234.i(user, (String)NLoginCore_172.c("㺪", (int)dt, (long)(du ^ dv)));
            if (!(exception instanceof GeneralSecurityException)) {
                NLoginCore_370.d((String)NLoginCore_172.c("㺭", (int)dw, (long)(dx ^ dy)), new Object[dz]);
            }
            return ea != 0;
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_172.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.C("ϦЈЊϪЎЭХлЧ϶дЪивϻРтсйпйЎ", (byte)3, 67), NLoginCore_172.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.F("ԢԯԮӱԱԭԨԱԼԫӸԶԺԳԶԼӾ࢘ࡺࢆ࢜࢝ࡵࡪ࢔ࡸ࢑࢚ࢗ࢒ࢢԘ", (byte)3, 70) + string + NLoginCore_092.B("¿", (byte)3, 66) + methodType.toString(), exception);
        }
    }

    /* synthetic */ NLoginCore_172(NLoginCore_313 NLoginCore_3132, NLoginCore_522 NLoginCore_5222) {
        this(NLoginCore_3132);
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        User user = packetReceiveEvent.getUser();
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        NLoginCore_481 NLoginCore_481 = (NLoginCore_481)channel.attr((AttributeKey)NLoginCore_481.var_long_e).getAndSet(null);
        if (NLoginCore_481 == null) {
            NLoginCore_234.i(user, (String)NLoginCore_172.c("㺀", (int)var_int_a, (long)var_long_b));
            return;
        }
        packetReceiveEvent.setCancelled(var_int_c != 0);
        WrapperLoginClientEncryptionResponse wrapperLoginClientEncryptionResponse = new WrapperLoginClientEncryptionResponse(packetReceiveEvent);
        boolean bl = NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_a).org_bukkit_Server_a().getOnlineMode();
        String string = NLoginCore_481.ax();
        InetAddress inetAddress = user.getAddress().getAddress();
        NLoginCore_280 NLoginCore_280 = NLoginCore_073.com_nickuc_login_NLoginCore_280_a(string, inetAddress);
        switch (NLoginCore_522.P[NLoginCore_280.ordinal()]) {
            case 1: 
            case 2: {
                NLoginCore_073.a(NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_a), string, inetAddress, NLoginCore_280.var_com_nickuc_login_NLoginCore_280_a);
            }
        }
        NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_a).b(d != 0).a(() -> {
            try {
                if (!channel.isOpen() || !channel.isActive()) {
                    return;
                }
                this.a(user, channel, wrapperLoginClientEncryptionResponse, NLoginCore_481, bl);
            }
            catch (Throwable throwable) {
                NLoginCore_234.i(user, (String)NLoginCore_172.c("㺀", (int)(eo & ep), (long)eq));
                NLoginCore_370.c((String)NLoginCore_172.c("㺃", (int)er, (long)(es ^ et)) + NLoginCore_481.ax() + (String)NLoginCore_172.c("㺆", (int)(eu & ev), (long)ew), throwable, new Object[ex]);
            }
        });
    }
}

