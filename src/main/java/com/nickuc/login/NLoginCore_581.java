/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.PacketEvents
 *  com.nickuc.login.lib.packetevents.api.PacketEventsAPI
 *  com.nickuc.login.lib.packetevents.api.event.PacketListenerCommon
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessageLegacy
 *  com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage_v1_16
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Configuration$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Configuration$Server
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Handshaking$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Login$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Login$Server
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Play$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Play$Server
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon
 *  com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.settings.PacketEventsSettings
 *  com.nickuc.login.lib.packetevents.api.util.FakeChannelUtil
 *  com.nickuc.login.lib.packetevents.api.util.TimeStampMode
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerChatMessage
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerPluginMessage
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerSystemChatMessage
 *  com.nickuc.login.lib.packetevents.impl.bungee.factory.BungeePacketEventsBuilder
 *  com.nickuc.login.lib.packetevents.impl.factory.spigot.SpigotPacketEventsBuilder
 *  com.nickuc.login.lib.packetevents.impl.util.protocolsupport.ProtocolSupportUtil
 *  com.nickuc.login.lib.packetevents.impl.util.viaversion.ViaVersionUtil
 *  com.nickuc.login.lib.packetevents.impl.velocity.factory.VelocityPacketEventsBuilder
 *  com.nickuc.login.loader.platform.VelocityLoader
 *  com.velocitypowered.api.plugin.PluginContainer
 *  com.velocitypowered.api.proxy.ProxyServer
 *  io.netty.channel.Channel
 *  javax.annotation.Nullable
 *  net.kyori.adventure.text.Component
 *  net.md_5.bungee.api.plugin.Plugin
 *  org.bukkit.plugin.Plugin
 *  org.slf4j.Logger
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.PacketEventsAPI;
import com.nickuc.login.lib.packetevents.api.event.PacketListenerCommon;
import com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessageLegacy;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage_v1_16;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon;
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
import com.nickuc.login.NLoginCore_538;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_349;
import com.nickuc.login.NLoginCore_054;
import com.nickuc.login.NLoginCore_594;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_041;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_313;
import com.nickuc.login.NLoginCore_206;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_344;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_458;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_433;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_584;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_081;
import com.nickuc.login.NLoginCore_006;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.proxy.ProxyServer;
import io.netty.channel.Channel;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Key;
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
import net.md_5.bungee.api.plugin.Plugin;
import org.slf4j.Logger;

public class NLoginCore_581 {
    private static int dc;
    private static int cd;
    private static long fl;
    private static int bc;
    private static long dj;
    private static long q;
    private static int cfr_renamed_1;
    private static int d;
    private static int al;
    private static long gn;
    private static int fg;
    private static long fe;
    private static long bt;
    private static int cf;
    private static int as;
    private static long gk;
    private static int bf;
    private static long eb;
    private final NLoginCore_349 var_com_nickuc_login_NLoginCore_349_a;
    private static int fk;
    private static int eo;
    private static int gt;
    private static int ai;
    private static int fu;
    private static int er;
    private static long var_long_ay;
    private static int fj;
    private static int ce;
    private static long bh;
    private static int bk;
    private static int dl;
    private static int bw;
    private static int av;
    private static long fq;
    private static int i;
    private static int dz;
    private static int bi;
    private static long ft;
    private static int ez;
    private static int dp;
    private final NLoginCore_344 var_com_nickuc_login_NLoginCore_344_a;
    private static String[] var_java_lang_String_arr_b;
    private static int o;
    private static int bs;
    private static int e;
    private static long gc;
    private static int var_int_l;
    private static long cz;
    private static int dy;
    private static int ax;
    private static int gh;
    private static int fy;
    private static int ah;
    private static int eh;
    private static long s;
    private static int br;
    private static long var_long_k;
    private static int ct;
    private static int db;
    private static long ar;
    private static int es;
    private static int bn;
    private static long p;
    private static long fs;
    private static int aj;
    private static int gp;
    private static long ek;
    private static int gb;
    private static long fw;
    private final Map<PacketTypeCommon, NLoginInterface_003> cfr_renamed_33;
    private static int dv;
    private static int ec;
    private static long ci;
    private boolean var_boolean_ay;
    private static int go;
    private static int gr;
    private static long ap;
    private static int cq;
    private static long ff;
    private static long w;
    private static int aq;
    private static long gj;
    private static int fr;
    private static int ak;
    private static int r;
    private static int em;
    private static long ae;
    private static int gi;
    private static int fd;
    private static long da;
    private static int g;
    private static long fa;
    private static int bz;
    private static int gl;
    private static int fm;
    private static long bb;
    private static int cu;
    private static int cj;
    private static long cb;
    private static int var_int_b;
    private static int f;
    private static int x;
    private static long gg;
    private static int fp;
    private static int dt;
    private static long dx;
    private static String[] var_java_lang_String_arr_a;
    private static long cl;
    private final NLoginCore_206 var_com_nickuc_login_NLoginCore_206_a;
    private static int cp;
    private static long at;
    private static long fo;
    private static int be;
    private static int gu;
    private static int ck;
    private static long dn;
    private static int gv;
    private static int eu;
    private static int ex;
    private static int au;
    private static int u;
    private static long ba;
    private static long bu;
    private static int an;
    private static int bo;
    private static int dg;
    private static long h;
    private static int bp;
    private static long cs;
    private static long fv;
    private static long ep;
    private static int el;
    private static long gs;
    private static long cn;
    private static int cx;
    private static int aw;
    private static int dh;
    private static int dq;
    private static long cr;
    private static long gf;
    private static long ee;
    private static int var_int_c;
    private static long cv;
    private static long fh;
    private static int y;
    private static int en;
    private static int eg;
    private static long fc;
    private static int ab;
    private static long dr;
    private static int eq;
    private static int ev;
    private static long n;
    private static long df;
    private static int dm;
    private static long var_long_c;
    private static int ch;
    private static int dd;
    private static long co;
    private static long ef;
    private static long ca;
    private static long de;
    private static int cm;
    private static int dw;
    private static long ao;
    private static int cc;
    private static int gw;
    private static int aa;
    private static int gd;
    private static long bm;
    private static long et;
    private static int ad;
    private static long ag;
    private static int bq;
    private static int z;
    private static long gm;
    private static long by;
    private static int cg;
    private static int ds;
    private static long ga;
    private static long bg;
    private static long ej;
    private static int bv;
    private static int gq;
    private static int ac;
    private static int var_int_a;
    private static long bj;
    private static long m;
    private static long fi;
    private static long ew;
    private static int ed;
    private final Map<PacketTypeCommon, NLoginInterface_043> cfr_renamed_34;
    private static int cy;
    private static int fb;
    private static long fz;
    private static int ey;
    private static long du;
    private static int cw;
    private static long fn;
    private static int ei;
    private static int bx;
    private static int bd;
    private static long v;
    private static int af;
    private static int ge;
    private static long var_long_t;
    private static int dk;
    private static long ea;
    private static long di;
    private static int am;
    private static int j;
    private static int fx;
    private static int az;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_t;
    private static long bl;

    private static void b() {
        int n;
        var_long_c = -2531226398675959642L;
        long l = var_long_c ^ 0xAAE537257E931AE1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(29 + 40), (byte)(28 + 55), (byte)(40 + 7), (byte)(14 + 53), (byte)(18 + 48), (byte)(29 + 38), (byte)(38 + 9), (byte)(79 + 1), 75, 67, (byte)(49 + 34), (byte)(5 + 48), (byte)(61 + 19), (byte)(67 + 30), (byte)(50 + 50), (byte)(25 + 75), (byte)(76 + 29), (byte)(46 + 64), (byte)(8 + 95)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_581.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ԾԝԟԞՁԩԤՉԭԬԾԝԯԨԸՖԳԜԺէԞՀԭԮ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[1] = NLoginCore_223.C("҈ѨћѤњѺ҅ьѣћњҁѵѫѳѢҏѶҌѴќҍѬҐѵ҉ҔѝҝҎѝҦ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[2] = NLoginCore_446.A("ĭĴĈąĨïĲòĳİĬă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[3] = NLoginCore_223.C("Ѧ҈џјѩѡ҅ѫѢѬѬѲѥ҇ѩђѡя҄њ҆їҙ҇їғќҗѢѠџѳѠ҇ќѥҊҦҊѿҊ҇ѱѷ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[4] = NLoginCore_092.E("ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ֐֌Ք֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ׍־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז׋בעעאס֝זג֠ךָךך֫ס׊֯נ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[5] = NLoginCore_201.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŢƊƎƘŭƕƔŧŬƊŦţ", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[6] = NLoginCore_453.C("ѵ҆҆ѩхњћх҂ѻѩхғҒэҕђѫҊ҃ҋѵѢѣ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[7] = NLoginCore_559.C("тѤшѬ҆ўҌѯѼѿҀї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[8] = NLoginCore_201.D("ѵ҆҆ѩхњћх҂ѻѧ҂ѤҍҁѯѣҋњѪѬјҘѺҋҊҋѭҀѵҧѡ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[9] = NLoginCore_223.C("ѦрѹсѾјфъѨѬяѽѿѓшҍъыѣѼѴѦҔҙҝїѭҗѱҟјҤѦѡҤѿ҆Ҡ҂ѽѰҚҚ҂Ѽ҄ґҌңҥҹҪѳҚҷҟһҕҷҌҠӀҖҺғқҔӋҤҌӄҸӊӋҩҒҴҥҵңӁҪӇҵӄӗӑҘӔҝҠӀҮӦүӕҶӞӢӬӁөӨһӀӞҺҷ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[10] = NLoginCore_384.B("ïħĲĶāĔĶĉĺôĻıėŀĞĽĿįĂĆĺķĎď", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[11] = NLoginCore_027.D("ђлєѸљњќ҈ѭѽѯҁ҃чҌґѰѯњҍ҇ѥѢѣ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[12] = NLoginCore_384.A("îĐôĘĲĊĸěĨīĬă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[13] = NLoginCore_384.D("ђлєѸљњќ҈ѭѽѰҍѰѵэҒѯљѵѨюҔғҌҌқѳѽҐҥѦҝ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[14] = NLoginCore_384.F("ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ՘ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜՗ծհքյԾեւժֆՠւ՗ի֋աօ՞զ՟֖կ՗֏փ֖֕մ՝տհրծ֌յ֒ր֏֢֜գ֟ըի֋չֱպ֠ցַ֭֩֌ֳִֆ֋֩օւ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[15] = NLoginCore_110.B("ïħĲĶāĔĶĉĺôĻıėŀĞĽĿįĂĆĺķĎď", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[16] = NLoginCore_446.A("ġĲĲĕñĆćñĮħēĶĳĮĒĻþĄĝĽÿėĶĥŋĠŇĸĦĎŏŇŒľĵłŌŔĳŌĜŒŐģ", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[17] = NLoginCore_091.F("ՀՑՑԴԐԥԦԐՍՆԴԐ՞՝ԘՠԝԶՕՎՖՀԭԮ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[18] = NLoginCore_223.D("ђлєѸљњќ҈ѭѽѯҁ҃чҌґѰѯњҍ҇ѥѢѣ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[19] = NLoginCore_446.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[20] = NLoginCore_384.F("ԣԮՔԎՅԒԡԹԬ՝ԶՌԘՌԳՃԛԵՃԶՂ՗ԢԨՉեՄԪծ՛ԣ՝թճԵՠզգՆՍՅմ՝Ղ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[21] = NLoginCore_091.F("ԝՑԪԑԳՌՈԥՒԭԫՎՀԠԺԜԕԴՑԞԵՁ՟ԦԵՃԸՂՃԹՃՎ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[22] = NLoginCore_559.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[23] = NLoginCore_201.C("єѥѾѻьѾѼшҌѯѰѧҍѡєѨҊяѴґѼќҞҚқ҉ѵҁѿѵѢѼҁҩѦҡҜѫҦҬҊҍңҪҡѭҴҏҕѹ҆ѶѻҫҝҊҒҙҕҋҔӂұ҅ҩӀҶҊҤҠҾҨӋґҿӂҿӁҡҎҫҔәӐҲҵҢң", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋԇӕԏӭԏԏӠԖӿӤԕ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[25] = NLoginCore_559.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŢƊƎƘŭƕƔŧŬƊŦţ", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[26] = NLoginCore_223.F("ԊՒԪՉԠՒԢԨ՘ԸԱԢ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[27] = NLoginCore_453.C("҉ѓҁѾ҄ѠѣћѥѪѝѢ҈ѣўіѕѡғѓ҄ѽўѹҝѠњѳќѹѠҙѽѿѼғҭ҂Ҋ҂ѼҧҨѽңҨҩҩҘѲҐѻѸѻҸѺҌұҗҘѶүҵҦҵҸҳҼҩ҄ӂҰӀҡҪҗ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[28] = NLoginCore_451.E("ԊՒԪՉԠՒԢԨ՘ԸԱԢ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[29] = NLoginCore_110.C("п҇џѾѕ҇їѝҍѭѦї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[30] = NLoginCore_384.A("ēìĎĊģīĕįĮĶĦĹđĢúĮŅŃėņĶĹėģĕŀĿħĠġĮčĦĦōĢİċĵŅĮİŜĹŐĴŃŋŢŔĥŐŁŗĮį", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[31] = NLoginCore_110.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[32] = NLoginCore_451.E("ՐԾԵԩԓԧՖԔ՘ԪՓԳԷԶԷՊԙՅՒԠբԣԱՕԵՊԿՠՄՍՑԫՄՓԭբՁԮՋոՑհՖզՓԼՑ՗ցտ՛քՒՔ՝ՕֈքՄշպ՛հզ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[33] = NLoginCore_387.F("ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ֐֌Ք֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ׍־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז׋בעעאס֝זג֠ךָךך֫ס׊֯נ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[34] = NLoginCore_223.C("ѦрѹсѾјфъѨѬяѽѿѓшҍъыѣѼѴѦҔҙҝїѭҗѱҟјҤѦѡҤѿ҆Ҡ҂ѽѰҚҚ҂Ѽ҄ґҌңҥҹҪѳҚҷҟһҕҷҌҠӀҖҺғқҔӋҤҌӄҸӊӋҩҒҴҥҵңӁҪӇҵӄӗӑҘӔҝҠӀҮӦүӕҶӞӢӬӁөӨһӀӞҺҷ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[35] = NLoginCore_559.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[36] = NLoginCore_559.C("ѽѨѲѓҍѪѡїѐыћѭё҄ѵѤҏјҘҙҍѪҝѰѵҏќѢќҝѺҁҐғѩѤҫѧҭҋҊҪґҒҨүѳҬҤҷҺѹѸ҇ҹҫҙҒһҡҺҳҤҷ҇ҕҗҟӂҹӎҌ҈ӅһҭҵҥҳӄӂүӉәҗҵҢң", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[37] = NLoginCore_384.A("ëĳċĪāĳăĉĹęĒă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[38] = NLoginCore_027.E("ԛԡՖՋՆԳԸԫՍԔՇԱԘ՘ԩգԢԡՕՏՔԱՆԿլՠՊ՜եՋգՁդԬՇՌՏՊԫՈԻղԸվԶն՝բվցվևշԺֈՓ֌ՕՈւՇ֍Սբ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[39] = NLoginCore_091.E("ԤՇ԰ՕԴԔԖՑՓՎՅԗԺԮՔՓԫՐԼդ՜ԥԴԣ՞բՈաժԨԧղԬԪՕՓՖշէԵեՙՉՂ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[40] = NLoginCore_559.D("ѿѶўќџпю҇ҏњѲї", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[41] = NLoginCore_004.C("љѼѥҊѩщы҆҈҃ѻћѯѶҁҔѯҔҘ҆ѺҝҊѼѫѹѢѻҚѝѽѲҕғҕ҈ҘҊҍҋ҉ҡѭѷ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[42] = NLoginCore_384.B("īĢĊĈċëúĳĻĆĞă", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[43] = NLoginCore_076.F("ԤՇ԰ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞ՋձյՇՋ՗ՂԸՔԸՌՙՂ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[44] = NLoginCore_223.B("ąċĔğĢĵďĚįįļă", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[45] = NLoginCore_173.D("љѼѥҊѩщы҆҈҃ѲѾѪѦ҅ѢѓѣѱѹѯѝѧѰҗќҀҟѷҔғҀҦҪѼҀҌѷѭ҉ѭҁҎѷ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[46] = NLoginCore_138.F("ԤԪԳԾՁՔԮԹՎՎ՛Ԣ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[47] = NLoginCore_092.A("óħðĊĕĮôĜęįěĉļďĠĚěĢķĥŀħĦĢČŊĹńŁćœĜĽœįħīĭīńŊŌŕōŖĳŘŗĲťŃłĽŁħŋĥīŬŐŅĪŅœįţŏŃİőŪŵŏŚĶŘŗŢűĺťżŷŃŻżŗƊŞŗƅŝŋŎŭƌ", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[48] = NLoginCore_223.B("ĝĖĳķĀčĶģİúįÿīċĿġĴġĥþĈĽĽĵľĤŃĎŁőŊĭĤğŕŗĒįĳńĤŔĺŕŀşšĠģİŤńŞĺşŞŁŧšŝŃŉŜŤ", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[49] = NLoginCore_091.B("óħðĊĕĮôĜęįĚøĨÿĢĽğĺŅĞŀĚŊğĶĚŀčĦĞģċňŊčĸİĲģěĲŌĻĨĺįŁŘĠšļĞŧũĦġļŕŗśŁĬľĬűŪĲĮŋİĳıŕŇŴŔŊƂĺƀłşſššŃŃĽƄƈźŏſūſō", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[50] = NLoginCore_324.A("ğċČġĢĶòįīĔĹñľėĢĖığüŅúŃľĠėĨĸğıĭĞİČĐœĪĭďŏōŖŚŔŖŔōŔİŒĥĤĞĺġĵŘŇņŀŊŇŦŀŐŀĮİŬţĸŅųŊįĽľſŌƂľśŶŮŐŇŷŪƂņŋńŦƌŻūū", (byte)30, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_581.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ğþĀÿĢĊąĪĎčğĲĠĻďĲÿ÷ęĨĂġĎď", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[1] = NLoginCore_027.F("ՓԳԦԯԥՅՐԗԮԦԥՌՀԶԾԭ՚Ձ՗Կԧ՚ՃՄՇզՉ՚ՃՋՏ՚", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[2] = NLoginCore_201.C("ѱ҇ј҃ѵѻѩќ҂ћҊѬќҀ҆ѫҖҁѺѵѱқѢѣ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[3] = NLoginCore_004.C("Ѧ҈џјѩѡ҅ѫѢѬѬѲѥ҇ѩђѡя҄њ҆їҙ҇їғќҗѢѠџѳѣҙѻҟѨѣѫѦҀ҉Ҩѷ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[4] = NLoginCore_004.D("ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋԆӯԖӬԏӵԄԗӸӻӦ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[5] = NLoginCore_173.F("ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ՘ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜՗ծհքյԾեւժֆՠւ՗ի֋աօ՞զ՟֖կ՗֏փ֖֕մ՝տհրծ֌յ֒ր֏֢֜գ֟ըի֋չֱպ֠վ֪֪֠֒֬֋շ֏օչ֛֯։ր֕փ֠օփֹ֠֍֎", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[6] = NLoginCore_091.E("ՀՑՑԴԐԥԦԐՍՆԴԮԻԟՂՐԱԳՆԴԷ԰ԭԮ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[7] = NLoginCore_201.F("ԏԞԌԵ՗ԱԧԭԯՕԹԢ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[8] = NLoginCore_559.E("ՀՑՑԴԐԥԦԐՍՆԲՍԯ՘ՌԺԮՖԥԵԷթ՝ԽՃ՛ՋՅՂկդՄ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[9] = NLoginCore_324.E("ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ՘ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜՗ծհքյԾեւժֆՠւ՗ի֋աօ՞զ՟֖կ՗֏փ֖֕մ՝տհրծ֌յ֒ր֏֢֜գ֟ըի֋չֱպִֶ֦֪֠֏֦֮֕ֈօնոֶ֖֤֚֭֨րַ׃ֶ֍֎", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[10] = NLoginCore_451.B("ïħĲĶāĔĶĉĺôĻöĶĝĭĭĤĐĜıłŇĎď", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[11] = NLoginCore_091.D("ђлєѸљњќ҈ѭѽѰюь҉ѲѪҔђҔёњҋѢѣ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[12] = NLoginCore_223.A("ąċîíġøıĘùķõă", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[13] = NLoginCore_324.F("ԝԆԟՃԤԥԧՓԸՈԻ՘ԻՀԘ՝ԺԤՀԳԙ՝էԧՆ՞ԨխհՉՈՊԽՈԴԨ԰ՓՓխպԻճՂ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[14] = NLoginCore_387.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁŐŰƇƇŤŬŬŭųųŜƞŸźŠƗůƓƓżżƁŮů", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[15] = NLoginCore_173.B("ïħĲĶāĔĶĉĺôĹċĝďĜęăĎĮėĨķĎď", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[16] = NLoginCore_559.B("ġĲĲĕñĆćñĮħēĶĳĮĒĻþĄĝĽÿėĶĥŋĠŇĸĦĎŏŇČŒĭŗİĸįļŚĽĲģ", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[17] = NLoginCore_076.B("ġĲĲĕñĆćñĮħĒĳŀĉľńĐŃĶĂąġĎď", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[18] = NLoginCore_004.E("ԝԆԟՃԤԥԧՓԸՈԼՌԻՓՖՕԛԳԹԳՀՖԭԮ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[19] = NLoginCore_091.D("њѿѿ҄ѣљѶѝњ҆ёї", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[20] = NLoginCore_027.F("ԣԮՔԎՅԒԡԹԬ՝ԶՌԘՌԳՃԛԵՃԶՂ՗ԢԨՉեՄԪծ՛ԣ՝կԴլմՋԪմԴՈճթՕձԼՁբՕպՁՂ՗ՠՍՎ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[21] = NLoginCore_223.E("ԝՑԪԑԳՌՈԥՒԭԫՎՀԠԺԜԕԴՑԞԵՉԷԧ՝ՍԦզծՑՅԻ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[22] = NLoginCore_384.C("Ѣхшѹшх҃љ҅ўҐї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[23] = NLoginCore_173.A("ĀđĪħøĪĨôĸěĜēĹčĀĔĶûĠĽĨĈŊņŇĵġĭīġĎĨĭŕĒōňėŒŘĶĹŏŖōęŠĻŁĥĲĢħŗŉĶľŅŁķŀŮŝıŕŬŢĶŐŌŪŔŷĽŪōŋŜźŽŔůŹſŲőŎŏ", (byte)30, 65);
                    NLoginCore_581.var_java_lang_String_arr_b[24] = NLoginCore_110.C("ѦрѹсѾјфъѨѬяюъыѱҖѶјѳҊѯѫѝѪѽѿѫҚ҂ѻѢ҈қ҄ҀҜѶҦҖѡѧҧүҬ҉҈Үҟ҇ҎѲҰҒ҈ѾҞҎҀүҝңү҄ҰѺӂҧӉҞҸӅӁ҉ӎҨҤҤҵҫӒҒҺҐҸҗғҼӍҿҽҼӐқӣүӠҾӣҤӊҧҾҪӌҽҰӱҥҮӨӇӈҪӪӋӘӗӍӛҽӭһԂӳӞӭӤҹӃӇөӥӄӤӠӥӻӤӄӓԋԀԆԗԗԅԖӒԋӽԗӾԔԐӜӷԅӛԟԁ", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[25] = NLoginCore_324.B("ĒìĥíĪĄðöĔĘûĩīÿôĹö÷ďĨĠĒŀŅŉăęŃĝŋĄŐĒčŐīĲŌĮĩĜņņĮĨİĽĸŏőťŖğņţŋŧŁţĸŌŬłŦĿŇŀŷŐĸŰŤŶŷŕľŠőšŏŭŖųšŰƃŽńƀŉŌŬŚƒśƁņŝũƏƁƉƘŭƛƞśŴƀŬƘƃŰŤƦƧƝƧŮů", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[26] = NLoginCore_223.C("ќѦѩҋуѶхѯцҐѮї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[27] = NLoginCore_559.D("҉ѓҁѾ҄ѠѣћѥѪѝѢ҈ѣўіѕѡғѓ҄ѽўѹҝѠњѳќѹѠҙѽѿѼғҭ҂Ҋ҂ѼҧҨѽңҨҩҩҘѲҐѻѸѻҸѺҌұҗҘѶүҵҦҥ҂҃ӀҶҩҷҼҝӉҼҗ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[28] = NLoginCore_384.E("ՎԽՎԶԏՐԒԭ՘ԲԱԢ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[29] = NLoginCore_027.C("шѣ҃Ѵ҃ҍѶѬѪҊѪї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[30] = NLoginCore_092.D("ѧрѢўѷѿѩ҃҂ҊѺҍѥѶю҂ҙҗѫҚҊҍѫѷѩҔғѻѴѵ҂ѡѺѺҡѶ҄џ҉ҙ҂҄ұҮѬҒҀѲѲҵ҄ҏҎҕ҂҃", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[31] = NLoginCore_027.F("ԞԴԫՍՎԴԕԴ՘ԭԔԢ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[32] = NLoginCore_138.B("ığĖĊôĈķõĹċĴĔĘėĘīúĦĳāŃĄĒĶĖīĠŁĥĮĲČĥĴĎŃĢďĬřĲőķŇĴĝĲĸŢŠļťĳĲģŬĥśĿĨŰśŇĭĿšĴİœņİťĳŵŎŃ", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[33] = NLoginCore_387.F("ԱԋՄԌՉԣԏԕԳԷԚԙԕԖԼաՁԣԾՕԺԶԨԵՈՊԶեՍՆԭՓզՏՋէՁձաԬԲղպշՔՓչժՒՙԽջ՝ՓՉթՙՋպըծպՏջՅ֍ղ֔թփ֐֌Ք֙ճկկրն֝՝օ՛փբ՞և֘֊ֈև֛զ֮պ֫։֮կ֕ղ։յ֗ֈջּհչֳ֒֓յֵ֖֣֢֦֘ֈָֆ׍־ָ֩֯ք֎ְִ֒֏ְ֯֫׆֯֏֞ז׋בעעאס֝זג֢עך׍׉ׂנפשּ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[34] = NLoginCore_201.F("ԱԋՄԌՉԣԏԕԳԷԚՈՊԞԓ՘ԕԖԮՇԿԱ՟դըԢԸբԼժԣկԱԬկՊՑիՍՈԻեեՍՇՏ՜՗ծհքյԾեւժֆՠւ՗ի֋աօ՞զ՟֖կ՗֏փ֖֕մ՝տհրծ֌յ֒ր֏֢֜գ֟ըի֋չֱպ֠ծ։֎կ֌ֶ֣֨։պֳ֑֮։ջչֵׁׂ׆֒׆֍֎", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[35] = NLoginCore_027.C("ѺѥѨ҂҇їѺѥҐ҂Ѽї", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[36] = NLoginCore_451.C("ѽѨѲѓҍѪѡїѐыћѭё҄ѵѤҏјҘҙҍѪҝѰѵҏќѢќҝѺҁҐғѩѤҫѧҭҋҊҪґҒҨүѳҬҤҷҺѹѸ҇ҹҫҙҒһҡҺҳҤҷ҇ҕҗҟӂҹӎҌ҈ӅҺӎҿҕӊҕүүҶӄҧӛҢң", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[37] = NLoginCore_027.B("ħāĀĵĐøİĤĔĆùă", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[38] = NLoginCore_446.C("ѐіҋҀѻѨѭѠ҂щѼѦэҍўҘїіҊ҄҉ѦѻѴҡҕѿґҚҀҘѶҙѡѼҁ҄ѿѠѽѰҧѭҳѫҫҒҗҳҶҳҼҬѷҝҫҟҡҠӂѺҏӂ҇", (byte)30, 67);
                    NLoginCore_581.var_java_lang_String_arr_b[39] = NLoginCore_201.D("љѼѥҊѩщы҆҈҃Ѻьѯѣ҉҈Ѡ҅ѱҙґњѩјғҗѽҖҟѝќҧњћѷѪҪѼҀѻҟ҆Ҋѷ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[40] = NLoginCore_387.B("ĀčăĠĭĉĺĹôĸùă", (byte)30, 66);
                    NLoginCore_581.var_java_lang_String_arr_b[41] = NLoginCore_446.E("ԤՇ԰ՕԴԔԖՑՓՎՆԦԺՁՌ՟Ժ՟գՑՅըՕՇԶՄԭՆեԨՈԽՒՁԮմՒՕ՘ԹՅթՑՂ", (byte)30, 69);
                    NLoginCore_581.var_java_lang_String_arr_b[42] = NLoginCore_559.D("шҊҊҁҀҍѾѩюќѲї", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[43] = NLoginCore_575.F("ԤՇ԰ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞ՋմԽծՏԲլՏ՗ՆԹլջ՝ՀԳշա՛ղՂընՍՎ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[44] = NLoginCore_324.F("ՑՅԠԞԦ԰ՉԕՑԚՐՓԱՖԙաԼՒԛԤԷՖԭԮ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[45] = NLoginCore_446.F("ԤՇ԰ՕԴԔԖՑՓՎԽՉԵԱՐԭԞԮԼՄԺԨԲԻբԧՋժՂ՟՞Ջ԰ԼԯՊՇՆԳԳՙԳՒՐ՘՟ԿչդռմչՔՠՍՎ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[46] = NLoginCore_092.F("ԽՕՃՔՀՅԙԙԫԷ՝՚ՙ՜ԼԵԴԖԺԟՀՖԭԮ", (byte)30, 70);
                    NLoginCore_581.var_java_lang_String_arr_b[47] = NLoginCore_223.D("чѻфўѩ҂шѰѭ҃ѯѝҐѣѴѮѯѶҋѹҔѻѺѶѠҞҍҘҕћҧѰґҧ҃ѻѿҁѿҘҞҠҩҡҪ҇Ҭҫ҆ҹҗҖґҕѻҟѹѿӀҤҙѾҙҧ҃ҷңҗ҄ҥҾӉңҮҊҬҫҶӅҎҹӐӋҗӏӑҧҩӁӂӛҭӂҼҜӇӝӢӆҽӖӆҸӂҢҮӨҷ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[48] = NLoginCore_027.D("ѱѪ҇ҋєѡҊѷ҄ю҃ѓѿџғѵ҈ѵѹђќґґ҉ҒѸҗѢҕҥҞҁѸѳҩҫѦ҃҇ҘѸҨҎҩҔҳҵѴѷ҄ҸҘҲҍҵҌѶғқғҷҢҶ҇", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[49] = NLoginCore_387.D("чѻфўѩ҂шѰѭ҃ѮьѼѓѶґѳҎҙѲҔѮҞѳҊѮҔѡѺѲѷџҜҞѡҌ҄҆ѷѯ҆ҠҏѼҎ҃ҕҬѴҵҐѲһҽѺѵҐҩҫүҕҀҒҀӅҾ҆҂ҟ҄҇҅ҩқӈҨҞӖҎӔҖҳӓҵҵғӚӇҴҹӊӁӡҸӒӈҼӖӢӬӈӕӌӎһӀҭҷ", (byte)30, 68);
                    NLoginCore_581.var_java_lang_String_arr_b[50] = NLoginCore_138.A("ğċČġĢĶòįīĔĹñľėĢĖığüŅúŃľĠėĨĸğıĭĞİČĐœĪĭďŏōŖŚŔŖŔōŔİŒĥĤĞĺġĵŘŇņŀŊŇŦŀŐŀĮİŬţĸŅųŊįĽľſŌƂľśŶŮŐŇƀūƄŪŢƉŌŹƃŨŎŌŤŭŎţƉƅƅƋƐƔţ", (byte)30, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_581.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ĄĎĦėċĆõćûąûÿčĶĶğĔİĽĵĆęŊėĺīĮļľČĝĒ", (byte)30, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_581.var_java_lang_String_arr_b[0] = NLoginCore_092.E("ԼԯԏՍԴՐԣԐԛԬԥԪԝ՞՛ԙ՝ԝՔՕՂդՊ՚է՟լԦ՘ԸՁ՝", (byte)30, 69);
                }
            }
        }
    }

    private void aD() {
        PacketEventsAPI packetEventsAPI;
        this.aE();
        Filter filter = logRecord -> (NLoginCore_370.aj() || logRecord.getLevel().intValue() >= Level.WARNING.intValue() && !((String)NLoginCore_581.c("㺀", (int)gr, (long)gs)).equals(logRecord.getMessage()) ? gt : gu) != 0;
        PacketEventsSettings packetEventsSettings = new PacketEventsSettings().debug(var_int_b != 0).checkForUpdates(var_int_c != 0).kickOnPacketException(d != 0).reEncodeByDefault(e != 0).timeStampMode(TimeStampMode.MILLIS).logFilter(filter);
        switch (NLoginCore_584.K[this.var_com_nickuc_login_NLoginType_008_t.com_nickuc_login_NLoginCore_364_b().a().ordinal()]) {
            case 1: {
                packetEventsAPI = SpigotPacketEventsBuilder.build((org.bukkit.plugin.Plugin)((org.bukkit.plugin.Plugin)this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b()), (PacketEventsSettings)packetEventsSettings);
                break;
            }
            case 2: {
                packetEventsAPI = BungeePacketEventsBuilder.build((Plugin)((Plugin)this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b()), (PacketEventsSettings)packetEventsSettings);
                break;
            }
            case 3: {
                VelocityLoader velocityLoader = (VelocityLoader)this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b();
                packetEventsAPI = VelocityPacketEventsBuilder.build((ProxyServer)velocityLoader.getServer(), (PluginContainer)velocityLoader.getPluginContainer(), (Logger)velocityLoader.getLogger(), (Path)velocityLoader.getDataDirectory().toPath(), (PacketEventsSettings)packetEventsSettings);
                break;
            }
            default: {
                throw new IllegalStateException((String)NLoginCore_581.c("㺀", (int)(f & g), (long)h) + (Object)((Object)this.var_com_nickuc_login_NLoginType_008_t.com_nickuc_login_NLoginCore_364_b().a()) + (String)NLoginCore_581.c("㺃", (int)(i & j), (long)var_long_k));
            }
        }
        PacketEvents.setAPI((PacketEventsAPI)packetEventsAPI);
        PacketEvents.getAPI().load();
        PacketEvents.getAPI().init();
    }

    private static String a(int n, long l) {
        l ^= 0x3EL;
        l ^= 0xAAE537257E931AE1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(16 + 53), (byte)(15 + 68), (byte)(18 + 29), (byte)(40 + 27), (byte)(9 + 57), (byte)(55 + 12), (byte)(28 + 19), 80, (byte)(4 + 71), (byte)(38 + 29), (byte)(59 + 24), (byte)(7 + 46), (byte)(11 + 69), 97, (byte)(41 + 59), (byte)(47 + 53), (byte)(50 + 55), (byte)(92 + 18), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("՞իժԭխթդխոէԴղնկղոԺࢿ࣒࣋ࢸࢫࣘࢵࢦ࣑ࣔࢶࣚࢫ࣌࣠", (byte)63, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_581.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void disable() {
        PacketEvents.getAPI().getEventManager().unregisterListener((PacketListenerCommon)this.var_com_nickuc_login_NLoginCore_344_a);
        PacketEvents.getAPI().terminate();
    }

    public void k(NLoginCore_277 NLoginCore_277) {
        if (this.var_com_nickuc_login_NLoginCore_349_a == null) {
            throw new IllegalStateException((String)NLoginCore_581.c("㺀", (int)ge, (long)(gf ^ gg)));
        }
        this.var_com_nickuc_login_NLoginCore_349_a.a(this.io_netty_channel_Channel_a(NLoginCore_277));
    }

    private void aE() {
        Object object;
        Object object2;
        File file;
        int n;
        String[] stringArray;
        if (((String)NLoginCore_581.c("㺀", (int)var_int_l, (long)(m ^ NLoginCore_581.n))).equalsIgnoreCase(System.getenv((String)NLoginCore_581.c("㺃", (int)o, (long)(p ^ q))))) {
            return;
        }
        Object object3 = NLoginCore_581.c("㺆", (int)r, (long)(s ^ var_long_t));
        Object object4 = NLoginCore_581.c("㺉", (int)u, (long)(v ^ w));
        boolean[] blArray = new boolean[x];
        blArray[NLoginCore_581.y] = z;
        blArray[NLoginCore_581.aa] = ab;
        boolean[] blArray2 = blArray;
        int n2 = ac;
        NLoginCore_081 NLoginCore_0812 = this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b().com_nickuc_login_NLoginCore_081_a((String)NLoginCore_581.c("㺌", (int)ad, (long)ae));
        if (NLoginCore_0812 != null && NLoginCore_0812.s() != null) {
            stringArray = NLoginCore_0812.s().split((String)NLoginCore_581.c("㺏", (int)af, (long)ag), ah);
            n = Integer.parseInt(stringArray[ai]);
            int n3 = Integer.parseInt(stringArray[aj]);
            if (n < ak || n == al && n3 < am) {
                file = NLoginCore_366.a(NLoginCore_0812.e().getClass());
                object2 = new File(this.var_com_nickuc_login_NLoginType_008_t.java_io_File_c().getParentFile(), (String)NLoginCore_581.c("㺒", (int)an, (long)(ao ^ ap)));
                object = NLoginCore_305.a().a((String)NLoginCore_581.c("㺕", (int)aq, (long)ar), (File)object2);
                if (((NLoginCore_285)object).af()) {
                    File file2 = NLoginCore_366.a(file, NLoginCore_366.c(file) + (String)NLoginCore_581.c("㺘", (int)as, (long)at));
                    if (file.exists() && !file.renameTo(file2) && !file.delete()) {
                        file.deleteOnExit();
                    }
                } else {
                    blArray2[NLoginCore_581.au] = av;
                }
                n2 = aw;
            }
        }
        if ((stringArray = this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b().com_nickuc_login_NLoginCore_081_a((String)NLoginCore_581.c("㺛", (int)ax, (long)var_long_ay))) != null && stringArray.s() != null && (n = Integer.parseInt(stringArray.s().split((String)NLoginCore_581.c("㺞", (int)az, (long)(ba ^ bb)), bc)[bd])) < be) {
            File file3 = NLoginCore_366.a(stringArray.e().getClass());
            file = new File(this.var_com_nickuc_login_NLoginType_008_t.java_io_File_c().getParentFile(), (String)NLoginCore_581.c("㺡", (int)bf, (long)(bg ^ bh)));
            object2 = NLoginCore_305.a().a((String)NLoginCore_581.c("㺤", (int)bi, (long)bj), file);
            if (((NLoginCore_285)object2).af()) {
                object = NLoginCore_366.a(file3, NLoginCore_366.c(file3) + (String)NLoginCore_581.c("㺧", (int)bk, (long)(bl ^ bm)));
                if (file3.exists() && !file3.renameTo((File)object) && !file3.delete()) {
                    file3.deleteOnExit();
                }
            } else {
                blArray2[NLoginCore_581.bn] = bo;
            }
            n2 = bp;
        }
        Object object5 = blArray2[bq] && blArray2[br] ? NLoginCore_581.c("㺪", (int)bs, (long)(bt ^ bu)) : (blArray2[bv] ? NLoginCore_581.c("㺭", (int)(bw & bx), (long)by) : NLoginCore_581.c("㺰", (int)bz, (long)(ca ^ cb)));
        boolean[] blArray3 = new boolean[cc];
        blArray3[NLoginCore_581.cd] = ce;
        blArray3[NLoginCore_581.cf] = cg;
        if (!Arrays.equals(blArray2, blArray3)) {
            if (NLoginCore_150.j()) {
                NLoginCore_370.d((String)NLoginCore_581.c("㺳", (int)ch, (long)ci), new Object[cj]);
                NLoginCore_370.d((String)NLoginCore_581.c("㺶", (int)ck, (long)cl) + (String)object5 + (String)NLoginCore_581.c("㺹", (int)cm, (long)(cn ^ co)), new Object[cp]);
                NLoginCore_370.d((String)NLoginCore_581.c("㺼", (int)cq, (long)(cr ^ cs)), new Object[ct]);
                NLoginCore_370.d((String)NLoginCore_581.c("㺿", (int)cu, (long)cv), new Object[cw]);
                if (blArray2[cx]) {
                    NLoginCore_370.d((String)NLoginCore_581.c("㻂", (int)cy, (long)(cz ^ da)), new Object[db]);
                }
                if (blArray2[dc]) {
                    NLoginCore_370.d((String)NLoginCore_581.c("㻅", (int)dd, (long)(de ^ df)), new Object[dg]);
                }
                NLoginCore_370.d((String)NLoginCore_581.c("㻈", (int)dh, (long)(di ^ dj)), new Object[dk]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻋", (int)(dl & dm), (long)dn), new Object[cfr_renamed_1]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻎", (int)(dp & dq), (long)dr), new Object[ds]);
            } else {
                NLoginCore_370.d((String)NLoginCore_581.c("㻑", (int)dt, (long)du), new Object[dv]);
                NLoginCore_370.d((String)object5 + (String)NLoginCore_581.c("㻔", (int)dw, (long)dx), new Object[dy]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻗", (int)dz, (long)(ea ^ eb)), new Object[ec]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻚", (int)ed, (long)(ee ^ ef)), new Object[eg]);
                if (blArray2[eh]) {
                    NLoginCore_370.d((String)NLoginCore_581.c("㻝", (int)ei, (long)(ej ^ ek)), new Object[el]);
                }
                if (blArray2[em]) {
                    NLoginCore_370.d((String)NLoginCore_581.c("㻠", (int)(en & eo), (long)ep), new Object[eq]);
                }
                NLoginCore_370.d((String)NLoginCore_581.c("㻣", (int)(er & es), (long)et), new Object[eu]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻦", (int)ev, (long)ew), new Object[ex]);
                NLoginCore_370.d((String)NLoginCore_581.c("㻩", (int)(ey & ez), (long)fa), new Object[fb]);
            }
            try {
                Thread.sleep(fc);
            }
            catch (InterruptedException interruptedException) {
                NLoginCore_370.a(interruptedException);
            }
        }
        if (n2 != 0) {
            this.var_com_nickuc_login_NLoginType_008_t.java_lang_Object_b().c();
            throw new IllegalStateException((String)NLoginCore_581.c("㻬", (int)fd, (long)(fe ^ ff)) + (String)object5);
        }
    }

    public User com_nickuc_login_lib_packetevents_api_protocol_player_User_a(NLoginCore_277 NLoginCore_277) {
        User user = PacketEvents.getAPI().getPlayerManager().getUser(NLoginCore_277.c());
        if (user == null) {
            throw new IllegalArgumentException((String)NLoginCore_581.c("㺀", (int)fg, (long)(fh ^ fi)) + NLoginCore_277.getName() + (String)NLoginCore_581.c("㺃", (int)(fj & fk), (long)fl) + NLoginCore_277.java_util_UUID_a());
        }
        return user;
    }

    public NLoginCore_206 a() {
        if (this.var_com_nickuc_login_NLoginCore_206_a == null) {
            throw new IllegalStateException((String)NLoginCore_581.c("㺀", (int)gi, (long)(gj ^ gk)));
        }
        return this.var_com_nickuc_login_NLoginCore_206_a;
    }

    public NLoginCore_581(NLoginType_008 NLoginType_008) {
        Object object;
        this.var_long_k = (long)new HashMap();
        this.var_int_l = (int)new HashMap();
        this.var_com_nickuc_login_NLoginCore_344_a = new NLoginCore_344(this);
        this.var_boolean_ay = var_int_a;
        this.var_com_nickuc_login_NLoginType_008_t = NLoginType_008;
        this.aD();
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() != NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b || !NLoginType_008.boolean_i()) {
            object = new NLoginCore_538(NLoginType_008);
            this.var_int_l.put(PacketType.Play.Server.SYSTEM_CHAT_MESSAGE, ((NLoginCore_538)object).var_com_nickuc_login_NLoginCore_312_a);
            this.var_int_l.put(PacketType.Play.Server.CHAT_MESSAGE, ((NLoginCore_538)object).var_com_nickuc_login_NLoginCore_543_a);
            this.var_long_k.put(PacketType.Play.Client.CHAT_COMMAND_UNSIGNED, ((NLoginCore_538)object).var_com_nickuc_login_NLoginCore_099_a);
            this.var_long_k.put(PacketType.Play.Client.CHAT_COMMAND, ((NLoginCore_538)object).var_com_nickuc_login_NLoginCore_361_a);
            this.var_long_k.put(PacketType.Play.Client.CHAT_MESSAGE, ((NLoginCore_538)object).var_com_nickuc_login_NLoginCore_543_a);
            this.var_long_k.put(PacketType.Play.Client.KEEP_ALIVE, new NLoginCore_594(NLoginType_008));
            this.var_com_nickuc_login_NLoginCore_206_a = new NLoginCore_206(NLoginType_008);
            if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a().L()) {
                this.var_long_k.put(PacketType.Login.Client.LOGIN_SUCCESS_ACK, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_146_a);
                this.var_long_k.put(PacketType.Configuration.Client.SELECT_KNOWN_PACKS, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_023_a);
                this.var_long_k.put(PacketType.Configuration.Client.CONFIGURATION_END_ACK, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_492_a);
                this.var_int_l.put(PacketType.Configuration.Server.CONFIGURATION_END, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_492_a);
            }
            this.var_long_k.put(PacketType.Configuration.Client.CUSTOM_CLICK_ACTION, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_225_a);
            this.var_long_k.put(PacketType.Play.Client.CUSTOM_CLICK_ACTION, this.var_com_nickuc_login_NLoginCore_206_a.var_com_nickuc_login_NLoginCore_225_a);
        } else {
            this.var_com_nickuc_login_NLoginCore_206_a = null;
        }
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
            object = (nLoginBukkit)NLoginType_008.c();
            this.var_com_nickuc_login_NLoginCore_349_a = new NLoginCore_349(NLoginType_008);
            this.var_int_l.put(PacketType.Play.Server.SET_SLOT, this.var_com_nickuc_login_NLoginCore_349_a.var_com_nickuc_login_NLoginCore_405_a);
            this.var_int_l.put(PacketType.Play.Server.WINDOW_ITEMS, this.var_com_nickuc_login_NLoginCore_349_a.var_com_nickuc_login_NLoginCore_309_a);
            if (NLoginType_008.boolean_i()) {
                this.var_long_k.put(PacketType.Login.Client.LOGIN_START, new NLoginCore_006());
                NLoginCore_433 NLoginCore_5022 = new NLoginCore_433((nLoginBukkit)object);
                this.var_long_k.put(PacketType.Configuration.Client.PLUGIN_MESSAGE, NLoginCore_5022.var_com_nickuc_login_NLoginCore_297_a);
                this.var_long_k.put(PacketType.Play.Client.PLUGIN_MESSAGE, NLoginCore_5022.var_com_nickuc_login_NLoginCore_359_a);
            } else {
                NLoginCore_313 NLoginCore_3132 = new NLoginCore_313((nLoginBukkit)object);
                this.var_int_l.put(PacketType.Login.Server.ENCRYPTION_REQUEST, NLoginCore_3132.var_com_nickuc_login_NLoginCore_172_a);
                this.var_long_k.put(PacketType.Login.Client.LOGIN_START, NLoginCore_3132.var_com_nickuc_login_NLoginCore_010_a);
                this.var_long_k.put(PacketType.Login.Client.ENCRYPTION_RESPONSE, NLoginCore_3132.var_com_nickuc_login_NLoginCore_172_a);
                this.var_long_k.put(PacketType.Play.Client.CLIENT_SETTINGS, new NLoginCore_054((nLoginBukkit)object));
                this.var_long_k.put(PacketType.Handshaking.Client.HANDSHAKE, new NLoginCore_041());
            }
        } else {
            this.var_com_nickuc_login_NLoginCore_349_a = null;
            object = new NLoginCore_458(NLoginType_008);
            this.var_long_k.put(PacketType.Login.Client.ENCRYPTION_RESPONSE, object);
            this.var_int_l.put(PacketType.Login.Server.ENCRYPTION_REQUEST, object);
        }
        PacketEvents.getAPI().getEventManager().registerListener((PacketListenerCommon)this.var_com_nickuc_login_NLoginCore_344_a);
    }

    static /* synthetic */ Map b(NLoginCore_581 NLoginCore_5812) {
        return NLoginCore_5812.var_int_l;
    }

    @Nullable
    public Channel a(Object object, Object object2) {
        try {
            Channel channel = (Channel)PacketEvents.getAPI().getPlayerManager().getChannel(object2);
            if (channel == null) {
                NLoginCore_370.d((String)NLoginCore_581.c("㺀", (int)fr, (long)(fs ^ ft)) + object.getClass().getCanonicalName() + (String)NLoginCore_581.c("㺃", (int)fu, (long)(fv ^ fw)), new Object[fx]);
            }
            return channel;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_581.c("㺆", (int)fy, (long)(fz ^ ga)) + object.getClass().getCanonicalName() + (String)NLoginCore_581.c("㺉", (int)gb, (long)gc), exception, new Object[gd]);
            return null;
        }
    }

    static {
        var_int_a = (32 >>> 101 | 32 << -101) & 0xFFFFFFFF;
        var_int_b = (0 >>> 56 | 0 << -56) & 0xFFFFFFFF;
        var_int_c = (0 >>> 156 | 0 << -156) & 0xFFFFFFFF;
        d = 0 >>> 205 | 0 << ~205 + 1;
        e = Integer.reverse(0);
        f = Integer.reverse(0);
        g = -1 >>> 207 | -1 << -207;
        h = Long.reverse(1801487379071171387L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(-1);
        var_long_k = Long.reverse(1801487379071171387L);
        var_int_l = (0x1000000 >>> 247 | 0x1000000 << ~247 + 1) & 0xFFFFFFFF;
        m = Long.reverse(7277864525953694523L);
        n = Long.reverse(0x7C00000000000000L);
        o = Integer.reverse(-1073741824);
        p = Long.reverse(7277864525953694523L);
        q = Long.reverse(0x7C00000000000000L);
        r = 128 >>> 5 | 128 << ~5 + 1;
        s = Long.reverse(7277864525953694523L);
        var_long_t = Long.reverse(0x7C00000000000000L);
        u = 0x50000000 >>> 124 | 0x50000000 << ~124 + 1;
        v = Long.reverse(7277864525953694523L);
        w = Long.reverse(0x7C00000000000000L);
        x = (4 >>> 161 | 4 << ~161 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(0);
        z = 0 >>> 121 | 0 << ~121 + 1;
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(0);
        ac = Integer.reverse(0);
        ad = (24 >>> 98 | 24 << ~98 + 1) & 0xFFFFFFFF;
        ae = Long.reverse(1801487379071171387L);
        af = (0x1C0000 >>> 82 | 0x1C0000 << ~82 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(1801487379071171387L);
        ah = 98304 >>> 207 | 98304 << ~207 + 1;
        ai = Integer.reverse(0);
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = Integer.reverse(0x20000000);
        al = Integer.reverse(0x20000000);
        am = Integer.reverse(-1610612736);
        an = Integer.reverse(0x10000000);
        ao = Long.reverse(7277864525953694523L);
        ap = Long.reverse(0x7C00000000000000L);
        aq = (0x9000000 >>> 152 | 0x9000000 << -152) & 0xFFFFFFFF;
        ar = Long.reverse(1801487379071171387L);
        as = Integer.reverse(0x50000000);
        at = Long.reverse(1801487379071171387L);
        au = Integer.reverse(0);
        av = 4096 >>> 108 | 4096 << ~108 + 1;
        aw = Integer.reverse(Integer.MIN_VALUE);
        ax = (-1342177280 >>> 188 | -1342177280 << -188) & 0xFFFFFFFF;
        var_long_ay = Long.reverse(1801487379071171387L);
        az = 393216 >>> 175 | 393216 << -175;
        ba = Long.reverse(7277864525953694523L);
        bb = Long.reverse(0x7C00000000000000L);
        bc = Integer.reverse(0x40000000);
        bd = Integer.reverse(0);
        be = 5 >>> 160 | 5 << ~160 + 1;
        bf = Integer.reverse(-1342177280);
        bg = Long.reverse(7277864525953694523L);
        bh = Long.reverse(0x7C00000000000000L);
        bi = Integer.reverse(0x70000000);
        bj = Long.reverse(1801487379071171387L);
        bk = 480 >>> 69 | 480 << ~69 + 1;
        bl = Long.reverse(7277864525953694523L);
        bm = Long.reverse(0x7C00000000000000L);
        bn = 256 >>> 232 | 256 << ~232 + 1;
        bo = Integer.reverse(Integer.MIN_VALUE);
        bp = (1 >>> 32 | 1 << ~32 + 1) & 0xFFFFFFFF;
        bq = Integer.reverse(0);
        br = 512 >>> 41 | 512 << -41;
        bs = Integer.reverse(0x8000000);
        bt = Long.reverse(7277864525953694523L);
        bu = Long.reverse(0x7C00000000000000L);
        bv = 0 >>> 41 | 0 << ~41 + 1;
        bw = (4352 >>> 136 | 4352 << ~136 + 1) & 0xFFFFFFFF;
        bx = -1 >>> 151 | -1 << -151;
        by = Long.reverse(1801487379071171387L);
        bz = (18432 >>> 42 | 18432 << -42) & 0xFFFFFFFF;
        ca = Long.reverse(7277864525953694523L);
        cb = Long.reverse(0x7C00000000000000L);
        cc = Integer.reverse(0x40000000);
        cd = 0 >>> 165 | 0 << ~165 + 1;
        ce = 0 >>> 78 | 0 << ~78 + 1;
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = 0 >>> 225 | 0 << -225;
        ch = Integer.reverse(-939524096);
        ci = Long.reverse(1801487379071171387L);
        cj = (0 >>> 53 | 0 << ~53 + 1) & 0xFFFFFFFF;
        ck = Integer.reverse(0x28000000);
        cl = Long.reverse(1801487379071171387L);
        cm = (21 >>> 128 | 21 << ~128 + 1) & 0xFFFFFFFF;
        cn = Long.reverse(7277864525953694523L);
        co = Long.reverse(0x7C00000000000000L);
        cp = 0 >>> 54 | 0 << ~54 + 1;
        cq = Integer.reverse(0x68000000);
        cr = Long.reverse(7277864525953694523L);
        cs = Long.reverse(0x7C00000000000000L);
        ct = Integer.reverse(0);
        cu = Integer.reverse(-402653184);
        cv = Long.reverse(1801487379071171387L);
        cw = Integer.reverse(0);
        cx = Integer.reverse(0);
        cy = (24 >>> 224 | 24 << -224) & 0xFFFFFFFF;
        cz = Long.reverse(7277864525953694523L);
        da = Long.reverse(0x7C00000000000000L);
        db = Integer.reverse(0);
        dc = 256 >>> 200 | 256 << -200;
        dd = Integer.reverse(-1744830464);
        de = Long.reverse(7277864525953694523L);
        df = Long.reverse(0x7C00000000000000L);
        dg = Integer.reverse(0);
        dh = 0xD00000 >>> 243 | 0xD00000 << -243;
        di = Long.reverse(7277864525953694523L);
        dj = Long.reverse(0x7C00000000000000L);
        dk = (0 >>> 29 | 0 << ~29 + 1) & 0xFFFFFFFF;
        dl = 0x60000003 >>> 253 | 0x60000003 << -253;
        dm = Integer.reverse(-1);
        dn = Long.reverse(1801487379071171387L);
        cfr_renamed_1 = (0 >>> 118 | 0 << -118) & 0xFFFFFFFF;
        dp = Integer.reverse(0x38000000);
        dq = Integer.reverse(-1);
        dr = Long.reverse(1801487379071171387L);
        ds = Integer.reverse(0);
        dt = 1856 >>> 38 | 1856 << ~38 + 1;
        du = Long.reverse(1801487379071171387L);
        dv = (0 >>> 76 | 0 << ~76 + 1) & 0xFFFFFFFF;
        dw = Integer.reverse(0x78000000);
        dx = Long.reverse(1801487379071171387L);
        dy = Integer.reverse(0);
        dz = (1984 >>> 198 | 1984 << -198) & 0xFFFFFFFF;
        ea = Long.reverse(7277864525953694523L);
        eb = Long.reverse(0x7C00000000000000L);
        ec = 0 >>> 10 | 0 << ~10 + 1;
        ed = Integer.reverse(0x4000000);
        ee = Long.reverse(7277864525953694523L);
        ef = Long.reverse(0x7C00000000000000L);
        eg = 0 >>> 170 | 0 << -170;
        eh = Integer.reverse(0);
        ei = 4224 >>> 231 | 4224 << -231;
        ej = Long.reverse(7277864525953694523L);
        ek = Long.reverse(0x7C00000000000000L);
        el = Integer.reverse(0);
        em = 0x4000000 >>> 154 | 0x4000000 << -154;
        en = Integer.reverse(0x44000000);
        eo = -1 >>> 67 | -1 << ~67 + 1;
        ep = Long.reverse(1801487379071171387L);
        eq = 0 >>> 157 | 0 << ~157 + 1;
        er = Integer.reverse(-1006632960);
        es = (-1 >>> 241 | -1 << ~241 + 1) & 0xFFFFFFFF;
        et = Long.reverse(1801487379071171387L);
        eu = Integer.reverse(0);
        ev = (4608 >>> 135 | 4608 << ~135 + 1) & 0xFFFFFFFF;
        ew = Long.reverse(1801487379071171387L);
        ex = 0 >>> 241 | 0 << -241;
        ey = Integer.reverse(-1543503872);
        ez = -1 >>> 148 | -1 << -148;
        fa = Long.reverse(1801487379071171387L);
        fb = (0 >>> 244 | 0 << -244) & 0xFFFFFFFF;
        fc = Long.reverse(913667774402789376L);
        fd = 0x30000001 >>> 187 | 0x30000001 << -187;
        fe = Long.reverse(7277864525953694523L);
        ff = Long.reverse(0x7C00000000000000L);
        fg = 312 >>> 99 | 312 << -99;
        fh = Long.reverse(7277864525953694523L);
        fi = Long.reverse(0x7C00000000000000L);
        fj = Integer.reverse(0x14000000);
        fk = Integer.reverse(-1);
        fl = Long.reverse(1801487379071171387L);
        fm = 41 >>> 224 | 41 << ~224 + 1;
        fn = Long.reverse(7277864525953694523L);
        fo = Long.reverse(0x7C00000000000000L);
        fp = Integer.reverse(0x54000000);
        fq = Long.reverse(1801487379071171387L);
        fr = Integer.reverse(-738197504);
        fs = Long.reverse(7277864525953694523L);
        ft = Long.reverse(0x7C00000000000000L);
        fu = Integer.reverse(0x34000000);
        fv = Long.reverse(7277864525953694523L);
        fw = Long.reverse(0x7C00000000000000L);
        fx = Integer.reverse(0);
        fy = 0xB40000 >>> 18 | 0xB40000 << -18;
        fz = Long.reverse(7277864525953694523L);
        ga = Long.reverse(0x7C00000000000000L);
        gb = Integer.reverse(0x74000000);
        gc = Long.reverse(1801487379071171387L);
        gd = Integer.reverse(0);
        ge = Integer.reverse(-201326592);
        gf = Long.reverse(7277864525953694523L);
        gg = Long.reverse(0x7C00000000000000L);
        gh = (0 >>> 80 | 0 << -80) & 0xFFFFFFFF;
        gi = Integer.reverse(0xC000000);
        gj = Long.reverse(7277864525953694523L);
        gk = Long.reverse(0x7C00000000000000L);
        gl = Integer.reverse(-1946157056);
        gm = Long.reverse(7277864525953694523L);
        gn = Long.reverse(0x7C00000000000000L);
        go = Integer.reverse(Integer.MIN_VALUE);
        gp = (0 >>> 62 | 0 << ~62 + 1) & 0xFFFFFFFF;
        gq = 8 >>> 195 | 8 << ~195 + 1;
        gr = Integer.reverse(0x4C000000);
        gs = Long.reverse(1801487379071171387L);
        gt = Integer.reverse(Integer.MIN_VALUE);
        gu = Integer.reverse(0);
        gv = Integer.reverse(-872415232);
        gw = Integer.reverse(-872415232);
        var_java_lang_String_arr_a = new String[gv];
        var_java_lang_String_arr_b = new String[gw];
        NLoginCore_581.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_581.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("ѡ҃҅ѥ҉ҨҠҶҢѱүҥҳҭѶқҽҼҴҺҴ҉", (byte)44, 67), NLoginCore_581.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("Ջ՘՗Ԛ՚ՖՑ՚եՔԡ՟գ՜՟եԧࢬࢸࢿࢥ࢘ࣅࢢ࢓ࣁࢾࢣࣇ࢘ࢹ࣍Ղ", (byte)44, 69) + string + NLoginCore_453.C("ѳ", (byte)44, 67) + methodType.toString(), exception);
        }
    }

    public ClientVersion a(User user) {
        if (this.var_com_nickuc_login_NLoginType_008_t.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
            if (this.var_boolean_ay) {
                ViaVersionUtil.checkIfViaIsPresent();
                ProtocolSupportUtil.checkIfProtocolSupportIsPresent();
                this.var_boolean_ay = gh;
            }
            int n = ProtocolSupportUtil.isAvailable() ? ProtocolSupportUtil.getProtocolVersion((SocketAddress)user.getAddress()) : (ViaVersionUtil.isAvailable() ? ViaVersionUtil.getProtocolVersion((User)user) : user.getClientVersion().getProtocolVersion());
            return ClientVersion.getById((int)n);
        }
        return user.getClientVersion();
    }

    public Channel io_netty_channel_Channel_a(NLoginCore_277 NLoginCore_277) {
        Object object = PacketEvents.getAPI().getPlayerManager().getChannel(NLoginCore_277.c());
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_581.c("㺀", (int)fm, (long)(fn ^ fo)) + NLoginCore_277.getName() + (String)NLoginCore_581.c("㺃", (int)fp, (long)fq) + NLoginCore_277.java_util_UUID_a());
        }
        return (Channel)object;
    }

    public boolean e(Object object) {
        return FakeChannelUtil.isFakeChannel((Object)object);
    }

    public boolean a(NLoginCore_277 NLoginCore_277, Component component) {
        User user = PacketEvents.getAPI().getPlayerManager().getUser(NLoginCore_277.c());
        if (user != null) {
            WrapperPlayServerSystemChatMessage wrapperPlayServerSystemChatMessage;
            ClientVersion clientVersion = user.getPacketVersion();
            if (clientVersion.isNewerThanOrEquals(ClientVersion.V_1_19)) {
                wrapperPlayServerSystemChatMessage = new WrapperPlayServerSystemChatMessage(gp != 0, component);
            } else {
                ChatMessage_v1_16 chatMessage_v1_16 = clientVersion.isNewerThanOrEquals(ClientVersion.V_1_16) ? new ChatMessage_v1_16(component, ChatTypes.CHAT, new UUID(0L, 0L)) : new ChatMessageLegacy(component, ChatTypes.CHAT);
                wrapperPlayServerSystemChatMessage = new WrapperPlayServerChatMessage((ChatMessage)chatMessage_v1_16);
            }
            PacketEvents.getAPI().getProtocolManager().sendPacketSilently(user.getChannel(), (PacketWrapper)wrapperPlayServerSystemChatMessage);
        }
        return gq != 0;
    }

    static /* synthetic */ Map a(NLoginCore_581 NLoginCore_5812) {
        return NLoginCore_5812.var_long_k;
    }

    public boolean a(NLoginCore_277 NLoginCore_277, String string, byte[] byArray) {
        if (this.var_com_nickuc_login_NLoginType_008_t.L()) {
            throw new IllegalStateException((String)NLoginCore_581.c("㺀", (int)gl, (long)(gm ^ gn)));
        }
        WrapperPlayServerPluginMessage wrapperPlayServerPluginMessage = new WrapperPlayServerPluginMessage(string, byArray);
        PacketEvents.getAPI().getProtocolManager().sendPacket((Object)this.io_netty_channel_Channel_a(NLoginCore_277), (PacketWrapper)wrapperPlayServerPluginMessage);
        return go != 0;
    }
}

