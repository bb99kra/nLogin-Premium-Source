/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.jda.api.EmbedBuilder
 *  com.nickuc.login.lib.jda.api.JDA
 *  com.nickuc.login.lib.jda.api.JDABuilder
 *  com.nickuc.login.lib.jda.api.OnlineStatus
 *  com.nickuc.login.lib.jda.api.components.MessageTopLevelComponent
 *  com.nickuc.login.lib.jda.api.components.actionrow.ActionRow
 *  com.nickuc.login.lib.jda.api.components.actionrow.ActionRowChildComponent
 *  com.nickuc.login.lib.jda.api.components.buttons.Button
 *  com.nickuc.login.lib.jda.api.entities.Activity
 *  com.nickuc.login.lib.jda.api.entities.Message
 *  com.nickuc.login.lib.jda.api.entities.MessageEmbed
 *  com.nickuc.login.lib.jda.api.interactions.commands.OptionType
 *  com.nickuc.login.lib.jda.api.interactions.commands.build.CommandData
 *  com.nickuc.login.lib.jda.api.interactions.commands.build.Commands
 *  com.nickuc.login.lib.jda.api.managers.Presence
 *  com.nickuc.login.lib.jda.api.utils.messages.MessageCreateBuilder
 *  com.nickuc.login.lib.jda.api.utils.messages.MessageCreateData
 *  com.nickuc.login.lib.jda.internal.utils.IOUtil
 *  com.nickuc.login.lib.jda.lib.okhttp3.Credentials
 *  com.nickuc.login.lib.jda.lib.okhttp3.OkHttpClient$Builder
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.jda.api.EmbedBuilder;
import com.nickuc.login.lib.jda.api.JDA;
import com.nickuc.login.lib.jda.api.JDABuilder;
import com.nickuc.login.lib.jda.api.OnlineStatus;
import com.nickuc.login.lib.jda.api.components.MessageTopLevelComponent;
import com.nickuc.login.lib.jda.api.components.actionrow.ActionRow;
import com.nickuc.login.lib.jda.api.components.actionrow.ActionRowChildComponent;
import com.nickuc.login.lib.jda.api.components.buttons.Button;
import com.nickuc.login.lib.jda.api.entities.Activity;
import com.nickuc.login.lib.jda.api.entities.Message;
import com.nickuc.login.lib.jda.api.entities.MessageEmbed;
import com.nickuc.login.lib.jda.api.interactions.commands.OptionType;
import com.nickuc.login.lib.jda.api.interactions.commands.build.CommandData;
import com.nickuc.login.lib.jda.api.interactions.commands.build.Commands;
import com.nickuc.login.lib.jda.api.managers.Presence;
import com.nickuc.login.lib.jda.api.utils.messages.MessageCreateBuilder;
import com.nickuc.login.lib.jda.api.utils.messages.MessageCreateData;
import com.nickuc.login.lib.jda.internal.utils.IOUtil;
import com.nickuc.login.lib.jda.lib.okhttp3.Credentials;
import com.nickuc.login.lib.jda.lib.okhttp3.OkHttpClient;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_019;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_308;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_057
implements NLoginCore_560 {
    private static long d;
    private static long as;
    private static int by;
    private static long dt;
    private static int dk;
    private static int q;
    private static long ev;
    private static long cd;
    private static int ek;
    private static long eu;
    private static long w;
    private static int y;
    private static int di;
    private static int ca;
    private final NLoginCore_308 var_com_nickuc_login_NLoginCore_308_b;
    private static int at;
    private static long r;
    private static long ax;
    private static int ao;
    private static int du;
    private static int s;
    private static int v;
    private static long ad;
    private static int cl;
    private static int dl;
    private static int db;
    private static int cw;
    private static long bo;
    private static long ds;
    private static long z;
    private static int ec;
    private static long n;
    private static int dj;
    private static long ag;
    private static int aw;
    private static int eh;
    private static int af;
    private static long au;
    private static int ah;
    private static long bb;
    private static long cm;
    private static long ab;
    private static long br;
    private JDA var_com_nickuc_login_lib_jda_api_JDA_a;
    private static long bh;
    private static int am;
    private static int da;
    private static long ae;
    private static String[] var_java_lang_String_arr_b;
    private static int dr;
    private static long em;
    private static long bv;
    private static long ei;
    private static long ai;
    private static int bz;
    private static long k;
    private static long t;
    private static long dm;
    private static long bs;
    private static int cz;
    private static long cb;
    private static int eb;
    private static int cy;
    private static long dy;
    private static int bg;
    private static int dp;
    private boolean aC;
    private static int j;
    private static int dz;
    private static int bw;
    private static int p;
    private static String[] var_java_lang_String_arr_a;
    private final NLoginType_008 H;
    private static int cv;
    private static int cs;
    private static long ed;
    private static int aa;
    private static int l;
    private static int h;
    private static long es;
    private static int bq;
    private static int et;
    private static int dw;
    private static long e;
    private static int m;
    private static long cn;
    private static int eq;
    private static int dx;
    private static int var_int_a;
    private static int bt;
    private static int var_int_c;
    private static int cu;
    private static int bj;
    private static int bl;
    private static int ci;
    private static int bf;
    private static int az;
    private static long i;
    private static int f;
    private static long bk;
    private static long var_long_b;
    private static long bu;
    private static int ex;
    private static long bd;
    private static long en;
    private static int cr;
    private static int cp;
    private static int u;
    private static int dq;
    private static int dv;
    private static long bx;
    private static long ej;
    private static int bp;
    private static long be;
    private static int ar;
    private static int dc;
    private static int o;
    private static int ct;
    private static long ep;
    private static int eg;
    private static int ba;
    private static int de;
    private static int ef;
    private static int cx;
    private static int ea;
    private static int ee;
    private static int dn;
    private static int df;
    private static int cc;
    private static int el;
    private static long ay;
    private static int cj;
    private static int ch;
    private static long er;
    private static int cf;
    private static int bc;
    private static long aq;
    private static int co;
    private static long av;
    private static int al;
    private static int bm;
    private static int aj;
    private static int ew;
    private static int bn;
    private static int dh;
    private static int bi;
    private static int dd;
    private static long ce;
    private static int ck;
    private static int x;
    private static int cfr_renamed_1;
    private static int an;
    private static int ac;
    private static long g;
    private static int dg;
    private static int ak;
    private static int eo;
    private static int cg;
    private static long var_long_c;
    private static int cq;
    private static long ap;

    @Override
    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m();
        Object[] objectArray = new Object[cu];
        objectArray[NLoginCore_057.cv] = string;
        String string3 = NLoginCore_150.a(NLoginCore_374.bd, NLoginCore_277, objectArray);
        Object[] objectArray2 = new Object[cw];
        objectArray2[NLoginCore_057.cx] = string;
        String string4 = NLoginCore_150.a(NLoginCore_374.bc, NLoginCore_277, objectArray2);
        Object[] objectArray3 = new Object[cy];
        objectArray3[NLoginCore_057.cz] = string;
        String string5 = NLoginCore_150.a(NLoginCore_374.be, NLoginCore_277, objectArray3);
        Object[] objectArray4 = new Object[da];
        objectArray4[NLoginCore_057.db] = string;
        String string6 = NLoginCore_150.a(NLoginCore_374.bf, NLoginCore_277, objectArray4);
        this.a(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b, string2, string4, string3, string5, string6, null, null);
    }

    public void a(String string, MessageCreateData messageCreateData, @Nullable Consumer<Message> consumer) {
        this.var_com_nickuc_login_lib_jda_api_JDA_a.retrieveUserById(string).queue(user -> {
            if (user != null) {
                user.openPrivateChannel().queue(privateChannel -> privateChannel.sendMessage(messageCreateData).queue(consumer));
            }
        });
    }

    @Override
    public void c(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m();
        Object[] objectArray = new Object[dc];
        objectArray[NLoginCore_057.dd] = string;
        String string3 = NLoginCore_150.a(NLoginCore_374.bh, NLoginCore_277, objectArray);
        Object[] objectArray2 = new Object[de];
        objectArray2[NLoginCore_057.df] = string;
        String string4 = NLoginCore_150.a(NLoginCore_374.bg, NLoginCore_277, objectArray2);
        Object[] objectArray3 = new Object[dg];
        objectArray3[NLoginCore_057.dh] = string;
        String string5 = NLoginCore_150.a(NLoginCore_374.bi, NLoginCore_277, objectArray3);
        Object[] objectArray4 = new Object[di];
        objectArray4[NLoginCore_057.dj] = string;
        String string6 = NLoginCore_150.a(NLoginCore_374.bj, NLoginCore_277, objectArray4);
        this.a(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b, string2, string4, string3, string5, string6, null, null);
    }

    @Generated
    public JDA com_nickuc_login_lib_jda_api_JDA_a() {
        return this.var_com_nickuc_login_lib_jda_api_JDA_a;
    }

    private EmbedBuilder com_nickuc_login_lib_jda_api_EmbedBuilder_a(String string, String string2, String string3, String string4) {
        Color color;
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle(string);
        embedBuilder.setDescription((CharSequence)string2);
        if (!string3.isEmpty()) {
            embedBuilder.setThumbnail(string3);
        }
        if (string4.length() == dk) {
            string4 = (String)NLoginCore_057.c("㺀", (int)dl, (long)dm) + string4;
        }
        try {
            color = Color.decode(string4);
        }
        catch (NumberFormatException numberFormatException) {
            color = Color.GRAY;
        }
        embedBuilder.setColor(color);
        return embedBuilder;
    }

    @Generated
    public NLoginCore_057(NLoginType_008 NLoginType_008, NLoginCore_308 NLoginCore_3082) {
        this.H = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_308_b = NLoginCore_3082;
    }

    @Override
    @Generated
    public boolean aF() {
        return this.aC;
    }

    @Generated
    public NLoginType_008 com_nickuc_login_NLoginType_008_b() {
        return this.H;
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        throw new UnsupportedOperationException((String)NLoginCore_057.c("㺀", (int)ca, (long)cb));
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277) {
        String string = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m();
        if (!NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c)) {
            NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.a(ForceRegisterConfig2, (String)NLoginCore_057.c("㺀", (int)cc, (long)(cd ^ ce)), NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c);
            String string2 = NLoginCore_150.a(NLoginCore_374.aR, NLoginCore_277, new Object[cf]);
            String string3 = NLoginCore_150.a(NLoginCore_374.aQ, NLoginCore_277, new Object[cg]);
            String string4 = NLoginCore_150.a(NLoginCore_374.aS, NLoginCore_277, new Object[ch]);
            String string5 = NLoginCore_150.a(NLoginCore_374.aT, NLoginCore_277, new Object[ci]);
            String string6 = NLoginCore_150.a(NLoginCore_374.aU, NLoginCore_277, new Object[cj]);
            String string7 = NLoginCore_150.a(NLoginCore_374.aV, NLoginCore_277, new Object[ck]);
            this.a(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c, string, string3, string2, string4, string5, string6, string7);
        }
        NLoginType_019.cfr_renamed_5.put((Object)string, (Object)NLoginCore_277.getName());
    }

    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_137 NLoginCore_1372, String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.a(string, this.a(string2, string3, string4, string5, string6, string7).build(), (Message message) -> NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.a(ForceRegisterConfig2, message.getId(), NLoginCore_1372));
    }

    public MessageCreateBuilder com_nickuc_login_lib_jda_api_utils_messages_MessageCreateBuilder_a(String string, String string2, String string3, String string4) {
        return this.a(string, string2, string3, string4, null, null);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_057.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("՗չջ՛տ֖֞֬֘է֥֛֣֩լְֲֳ֑֪֪տ", (byte)115, 69), NLoginCore_057.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.A("ǈǕǔƗǗǓǎǗǢǑƞǜǠǙǜǢƤԷԸԛ԰ԴԺՅԯƸ", (byte)115, 65) + string + NLoginCore_451.F("թ", (byte)115, 70) + methodType.toString(), exception);
        }
    }

    public MessageCreateBuilder a(String string, String string2, String string3, String string4, String string5, String string6) {
        MessageCreateBuilder messageCreateBuilder = new MessageCreateBuilder();
        EmbedBuilder embedBuilder = this.com_nickuc_login_lib_jda_api_EmbedBuilder_a(string, string2, string3, string4);
        MessageEmbed[] messageEmbedArray = new MessageEmbed[dn];
        messageEmbedArray[NLoginCore_057.cfr_renamed_1] = embedBuilder.build();
        messageCreateBuilder.setEmbeds(messageEmbedArray);
        if (string5 != null && string6 != null) {
            MessageTopLevelComponent[] messageTopLevelComponentArray = new MessageTopLevelComponent[dp];
            ActionRowChildComponent[] actionRowChildComponentArray = new ActionRowChildComponent[du];
            actionRowChildComponentArray[NLoginCore_057.dv] = Button.secondary((String)NLoginCore_057.c("㺃", (int)(dw & dx), (long)dy), (String)string6);
            messageTopLevelComponentArray[NLoginCore_057.dq] = ActionRow.of((ActionRowChildComponent)Button.primary((String)NLoginCore_057.c("㺀", (int)dr, (long)(ds ^ dt)), (String)string5), (ActionRowChildComponent[])actionRowChildComponentArray);
            messageCreateBuilder.setComponents(messageTopLevelComponentArray);
        } else if (string5 != null) {
            MessageTopLevelComponent[] messageTopLevelComponentArray = new MessageTopLevelComponent[dz];
            messageTopLevelComponentArray[NLoginCore_057.ea] = ActionRow.of((ActionRowChildComponent)Button.primary((String)NLoginCore_057.c("㺆", (int)(eb & ec), (long)ed), (String)string5), (ActionRowChildComponent[])new ActionRowChildComponent[ee]);
            messageCreateBuilder.setComponents(messageTopLevelComponentArray);
        } else if (string6 != null) {
            MessageTopLevelComponent[] messageTopLevelComponentArray = new MessageTopLevelComponent[ef];
            messageTopLevelComponentArray[NLoginCore_057.eg] = ActionRow.of((ActionRowChildComponent)Button.secondary((String)NLoginCore_057.c("㺉", (int)eh, (long)(ei ^ ej)), (String)string6), (ActionRowChildComponent[])new ActionRowChildComponent[ek]);
            messageCreateBuilder.setComponents(messageTopLevelComponentArray);
        }
        return messageCreateBuilder;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-238243312278675624L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(49987063873036120L);
        e = Long.reverse(-288230376151711744L);
        f = Integer.reverse(0x40000000);
        g = Long.reverse(-238243312278675624L);
        h = (384 >>> 231 | 384 << -231) & 0xFFFFFFFF;
        i = Long.reverse(-238243312278675624L);
        j = Integer.reverse(0x20000000);
        k = Long.reverse(-238243312278675624L);
        l = Integer.reverse(-1610612736);
        m = Integer.reverse(-1);
        n = Long.reverse(-238243312278675624L);
        o = Integer.reverse(0);
        p = (6144 >>> 138 | 6144 << -138) & 0xFFFFFFFF;
        q = Integer.reverse(-1);
        r = Long.reverse(-238243312278675624L);
        s = Integer.reverse(-536870912);
        t = Long.reverse(-238243312278675624L);
        u = Integer.reverse(0x10000000);
        v = Integer.reverse(-1);
        w = Long.reverse(-238243312278675624L);
        x = Integer.reverse(-1879048192);
        y = Integer.reverse(-1);
        z = Long.reverse(-238243312278675624L);
        aa = Integer.reverse(0x50000000);
        ab = Long.reverse(-238243312278675624L);
        ac = 704 >>> 198 | 704 << ~198 + 1;
        ad = Long.reverse(49987063873036120L);
        ae = Long.reverse(-288230376151711744L);
        af = (6 >>> 223 | 6 << ~223 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(-238243312278675624L);
        ah = Integer.reverse(-1342177280);
        ai = Long.reverse(-238243312278675624L);
        aj = 524288 >>> 147 | 524288 << ~147 + 1;
        ak = 16 >>> 228 | 16 << ~228 + 1;
        al = (0 >>> 110 | 0 << -110) & 0xFFFFFFFF;
        am = Integer.reverse(Integer.MIN_VALUE);
        an = 0 >>> 240 | 0 << -240;
        ao = (224 >>> 228 | 224 << ~228 + 1) & 0xFFFFFFFF;
        ap = Long.reverse(49987063873036120L);
        aq = Long.reverse(-288230376151711744L);
        ar = 983040 >>> 48 | 983040 << ~48 + 1;
        as = Long.reverse(-238243312278675624L);
        at = 16384 >>> 138 | 16384 << -138;
        au = Long.reverse(49987063873036120L);
        av = Long.reverse(-288230376151711744L);
        aw = Integer.reverse(-2013265920);
        ax = Long.reverse(49987063873036120L);
        ay = Long.reverse(-288230376151711744L);
        az = Integer.reverse(0x48000000);
        ba = Integer.reverse(-1);
        bb = Long.reverse(-238243312278675624L);
        bc = (-1073741820 >>> 62 | -1073741820 << ~62 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(49987063873036120L);
        be = Long.reverse(-288230376151711744L);
        bf = 655360 >>> 143 | 655360 << -143;
        bg = Integer.reverse(-1);
        bh = Long.reverse(-238243312278675624L);
        bi = Integer.reverse(-1476395008);
        bj = Integer.reverse(-1);
        bk = Long.reverse(-238243312278675624L);
        bl = (0 >>> 129 | 0 << -129) & 0xFFFFFFFF;
        bm = 0x100000 >>> 116 | 0x100000 << -116;
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = Long.reverse(-6917529027641081856L);
        bp = Integer.reverse(0);
        bq = (45056 >>> 235 | 45056 << -235) & 0xFFFFFFFF;
        br = Long.reverse(49987063873036120L);
        bs = Long.reverse(-288230376151711744L);
        bt = Integer.reverse(-402653184);
        bu = Long.reverse(49987063873036120L);
        bv = Long.reverse(-288230376151711744L);
        bw = Integer.reverse(0);
        bx = Long.reverse(-4611686018427387904L);
        by = 0 >>> 192 | 0 << -192;
        bz = 0x200000 >>> 245 | 0x200000 << -245;
        ca = (24 >>> 160 | 24 << ~160 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(-238243312278675624L);
        cc = Integer.reverse(-1744830464);
        cd = Long.reverse(49987063873036120L);
        ce = Long.reverse(-288230376151711744L);
        cf = Integer.reverse(0);
        cg = Integer.reverse(0);
        ch = (0 >>> 14 | 0 << -14) & 0xFFFFFFFF;
        ci = Integer.reverse(0);
        cj = Integer.reverse(0);
        ck = (0 >>> 107 | 0 << ~107 + 1) & 0xFFFFFFFF;
        cl = 0x34000000 >>> 217 | 0x34000000 << -217;
        cm = Long.reverse(49987063873036120L);
        cn = Long.reverse(-288230376151711744L);
        co = Integer.reverse(0);
        cp = Integer.reverse(0);
        cq = 0 >>> 244 | 0 << ~244 + 1;
        cr = 0 >>> 211 | 0 << ~211 + 1;
        cs = Integer.reverse(0);
        ct = (0 >>> 193 | 0 << ~193 + 1) & 0xFFFFFFFF;
        cu = Integer.reverse(Integer.MIN_VALUE);
        cv = 0 >>> 65 | 0 << ~65 + 1;
        cw = Integer.reverse(Integer.MIN_VALUE);
        cx = Integer.reverse(0);
        cy = (65536 >>> 48 | 65536 << -48) & 0xFFFFFFFF;
        cz = 0 >>> 150 | 0 << ~150 + 1;
        da = (8192 >>> 141 | 8192 << -141) & 0xFFFFFFFF;
        db = (0 >>> 227 | 0 << -227) & 0xFFFFFFFF;
        dc = (1 >>> 32 | 1 << ~32 + 1) & 0xFFFFFFFF;
        dd = Integer.reverse(0);
        de = 16384 >>> 14 | 16384 << ~14 + 1;
        df = Integer.reverse(0);
        dg = (64 >>> 230 | 64 << -230) & 0xFFFFFFFF;
        dh = Integer.reverse(0);
        di = Integer.reverse(Integer.MIN_VALUE);
        dj = Integer.reverse(0);
        dk = Integer.reverse(0x60000000);
        dl = Integer.reverse(-671088640);
        dm = Long.reverse(-238243312278675624L);
        dn = (0x800000 >>> 215 | 0x800000 << -215) & 0xFFFFFFFF;
        cfr_renamed_1 = (0 >>> 172 | 0 << -172) & 0xFFFFFFFF;
        dp = Integer.reverse(Integer.MIN_VALUE);
        dq = (0 >>> 80 | 0 << ~80 + 1) & 0xFFFFFFFF;
        dr = 0x70000000 >>> 218 | 0x70000000 << -218;
        ds = Long.reverse(49987063873036120L);
        dt = Long.reverse(-288230376151711744L);
        du = Integer.reverse(Integer.MIN_VALUE);
        dv = (0 >>> 44 | 0 << ~44 + 1) & 0xFFFFFFFF;
        dw = Integer.reverse(-1207959552);
        dx = -1 >>> 163 | -1 << ~163 + 1;
        dy = Long.reverse(-238243312278675624L);
        dz = 8 >>> 99 | 8 << -99;
        ea = 0 >>> 91 | 0 << ~91 + 1;
        eb = Integer.reverse(0x78000000);
        ec = Integer.reverse(-1);
        ed = Long.reverse(-238243312278675624L);
        ee = 0 >>> 20 | 0 << ~20 + 1;
        ef = (128 >>> 231 | 128 << -231) & 0xFFFFFFFF;
        eg = Integer.reverse(0);
        eh = (31744 >>> 74 | 31744 << ~74 + 1) & 0xFFFFFFFF;
        ei = Long.reverse(49987063873036120L);
        ej = Long.reverse(-288230376151711744L);
        ek = Integer.reverse(0);
        el = 1 >>> 155 | 1 << -155;
        em = Long.reverse(49987063873036120L);
        en = Long.reverse(-288230376151711744L);
        eo = 0x4200000 >>> 85 | 0x4200000 << ~85 + 1;
        ep = Long.reverse(-238243312278675624L);
        eq = Integer.reverse(0x44000000);
        er = Long.reverse(49987063873036120L);
        es = Long.reverse(-288230376151711744L);
        et = Integer.reverse(-1006632960);
        eu = Long.reverse(49987063873036120L);
        ev = Long.reverse(-288230376151711744L);
        ew = (-1879048192 >>> 186 | -1879048192 << -186) & 0xFFFFFFFF;
        ex = Integer.reverse(0x24000000);
        var_java_lang_String_arr_a = new String[ew];
        var_java_lang_String_arr_b = new String[ex];
        NLoginCore_057.void_b();
    }

    @Override
    public boolean aE() {
        if (this.var_com_nickuc_login_lib_jda_api_JDA_a != null) {
            this.var_com_nickuc_login_lib_jda_api_JDA_a.shutdown();
            if (!this.var_com_nickuc_login_lib_jda_api_JDA_a.awaitShutdown(bx, TimeUnit.SECONDS)) {
                this.var_com_nickuc_login_lib_jda_api_JDA_a.shutdownNow();
                this.var_com_nickuc_login_lib_jda_api_JDA_a.awaitShutdown();
            }
        }
        this.var_com_nickuc_login_lib_jda_api_JDA_a = null;
        this.aC = by;
        return bz != 0;
    }

    @Override
    public void aH() {
        NLoginCore_219 NLoginCore_2192 = this.var_com_nickuc_login_NLoginCore_308_b.com_nickuc_login_NLoginCore_219_b();
        if (NLoginCore_2192 == null) {
            throw new IllegalStateException(this + (String)NLoginCore_057.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        String string = NLoginCore_2192.a(NLoginCore_057.c("㺃", (int)var_int_c, (long)(d ^ e)), NLoginCore_2192.a(NLoginCore_057.c("㺆", (int)f, (long)g), (String)NLoginCore_057.c("㺉", (int)h, (long)i)));
        boolean bl = NLoginCore_150.j();
        if (string.isEmpty()) {
            NLoginCore_370.c((String)(bl ? NLoginCore_057.c("㺌", (int)j, (long)k) : NLoginCore_057.c("㺏", (int)(l & m), (long)n)), new Object[o]);
            return;
        }
        OkHttpClient.Builder builder = IOUtil.newHttpClientBuilder();
        if (NLoginCore_2192.d(NLoginCore_057.c("㺒", (int)(p & q), (long)r))) {
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_057.c("㺕", (int)s, (long)t));
            int n = NLoginCore_2192.int_a(NLoginCore_057.c("㺘", (int)(u & v), (long)w));
            if (string2 != null && !string2.isEmpty() && !((String)NLoginCore_057.c("㺛", (int)(x & y), (long)z)).equals(string2)) {
                System.setProperty((String)NLoginCore_057.c("㺞", (int)aa, (long)ab), (String)NLoginCore_057.c("㺡", (int)ac, (long)(ad ^ ae)));
                builder.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(string2, n)));
                String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_057.c("㺤", (int)af, (long)ag));
                String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_057.c("㺧", (int)ah, (long)ai));
                if (string3 != null && string4 != null) {
                    builder.proxyAuthenticator((route, response) -> response.request().newBuilder().header((String)NLoginCore_057.c("㺀", (int)et, (long)(eu ^ ev)), Credentials.basic((String)string3, (String)string4)).build());
                }
            }
        }
        try {
            Object[] objectArray = new Object[ak];
            objectArray[NLoginCore_057.al] = new NLoginType_019(this.H, this);
            this.var_com_nickuc_login_lib_jda_api_JDA_a = JDABuilder.createDefault((String)string).setAutoReconnect(aj != 0).setStatus(OnlineStatus.ONLINE).setHttpClientBuilder(builder).addEventListeners(objectArray).build().awaitReady();
            CommandData[] commandDataArray = new CommandData[am];
            commandDataArray[NLoginCore_057.an] = Commands.slash((String)NLoginCore_057.c("㺪", (int)ao, (long)(ap ^ aq)), (String)(bl ? NLoginCore_057.c("㺭", (int)ar, (long)as) : NLoginCore_057.c("㺰", (int)at, (long)(au ^ av)))).addOption(OptionType.STRING, (String)NLoginCore_057.c("㺳", (int)aw, (long)(ax ^ ay)), (String)(bl ? NLoginCore_057.c("㺶", (int)(az & ba), (long)bb) : NLoginCore_057.c("㺹", (int)bc, (long)(bd ^ be))));
            this.var_com_nickuc_login_lib_jda_api_JDA_a.updateCommands().addCommands(commandDataArray).queue();
            NLoginCore_370.e((String)(bl ? NLoginCore_057.c("㺼", (int)(bf & bg), (long)bh) : NLoginCore_057.c("㺿", (int)(bi & bj), (long)bk)), new Object[NLoginCore_057.bl]);
            this.aC = bm;
            this.H.b(bn != 0).a((NLoginCore_598 NLoginInterface_0482) -> {
                if (this.var_com_nickuc_login_lib_jda_api_JDA_a == null) {
                    NLoginInterface_0482.Z();
                    return;
                }
                Presence presence = this.var_com_nickuc_login_lib_jda_api_JDA_a.getPresence();
                String string = NLoginCore_2192.a(NLoginCore_057.c("㺀", (int)el, (long)(em ^ en)), NLoginCore_2192.a(NLoginCore_057.c("㺃", (int)eo, (long)ep), (String)NLoginCore_057.c("㺆", (int)eq, (long)(er ^ es))));
                if (!string.isEmpty()) {
                    presence.setActivity(Activity.playing((String)string));
                }
                presence.setStatus(OnlineStatus.ONLINE);
            }, 0L, bo, TimeUnit.SECONDS);
        }
        catch (IllegalArgumentException | IllegalStateException | InterruptedException exception) {
            this.aC = bp;
            NLoginCore_370.c((String)(bl ? NLoginCore_057.c("㻂", (int)bq, (long)(br ^ bs)) : NLoginCore_057.c("㻅", (int)bt, (long)(bu ^ bv))), exception, new Object[bw]);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3FL;
        l ^= 0x551A9C555A6F6548L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(6 + 63), (byte)(37 + 46), (byte)(15 + 32), (byte)(18 + 49), 66, (byte)(39 + 28), 47, (byte)(62 + 18), (byte)(45 + 30), (byte)(2 + 65), (byte)(62 + 21), (byte)(5 + 48), (byte)(7 + 73), (byte)(59 + 38), (byte)(77 + 23), (byte)(69 + 31), (byte)(4 + 101), (byte)(61 + 49), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.B("ŎśŚĝŝřŔŝŨŗĤŢŦşŢŨĪҽҾҡҶҺӀӋҵ", (byte)54, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_057.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277) {
        String string = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m();
        if (!NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b)) {
            NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.a(ForceRegisterConfig2, (String)NLoginCore_057.c("㺀", (int)cl, (long)(cm ^ cn)), NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b);
            String string2 = NLoginCore_150.a(NLoginCore_374.aX, NLoginCore_277, new Object[co]);
            String string3 = NLoginCore_150.a(NLoginCore_374.aW, NLoginCore_277, new Object[cp]);
            String string4 = NLoginCore_150.a(NLoginCore_374.aY, NLoginCore_277, new Object[cq]);
            String string5 = NLoginCore_150.a(NLoginCore_374.aZ, NLoginCore_277, new Object[cr]);
            String string6 = NLoginCore_150.a(NLoginCore_374.ba, NLoginCore_277, new Object[cs]);
            String string7 = NLoginCore_150.a(NLoginCore_374.bb, NLoginCore_277, new Object[ct]);
            this.a(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b, string, string3, string2, string4, string5, string6, string7);
        }
        NLoginType_019.cfr_renamed_5.put((Object)string, (Object)NLoginCore_277.getName());
    }

    @Generated
    public NLoginCore_308 com_nickuc_login_NLoginCore_308_a() {
        return this.var_com_nickuc_login_NLoginCore_308_b;
    }

    private static void void_b() {
        int n;
        var_long_c = 1943903031920266496L;
        long l = var_long_c ^ 0x551A9C555A6F6548L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(54 + 15), (byte)(10 + 73), (byte)(4 + 43), 67, (byte)(58 + 8), (byte)(8 + 59), (byte)(7 + 40), (byte)(42 + 38), (byte)(45 + 30), (byte)(62 + 5), 83, (byte)(2 + 51), (byte)(56 + 24), (byte)(33 + 64), (byte)(2 + 98), (byte)(10 + 90), (byte)(102 + 3), (byte)(42 + 68), (byte)(73 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginCore_057.var_java_lang_String_arr_b[0] = NLoginCore_092.B("ŸŜżĹłŹĿťŕŦųņŊŮŻťƃƁňŒţƇƖƐŪůŲŴśƒŴƟ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[1] = NLoginCore_138.A("ŵőłƀŽźŲŃŶŉşŃŃŖƏŦŚƅťōŵŮƌƉƌƐŴƐƉŻŪƗ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[2] = NLoginCore_076.A("żƀƃŎŘšƀŠŃźŁųƍƉŢŞţŰŚƂŦƆƒƇŐŖŹŔťžƝƀ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[3] = NLoginCore_559.E("ՎծչղՕ՝հՑ՚Ի՗Ո", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ӏӜӛӔӿԀӫӵӗԂҺӗҽӾӒԆӜӟӔӭӗӷӇӢӽӥӿӢӶӟԑӢӮӦԒӰԑӿԍӵӶԑԃԠԏԔӚԖԪԃөԙԈԚԁӮԜӰԈӮԷԎԶԯԄԨԘԪԧԾԫԮԓԶԜԿԜԀԗԖԈՊԛԈԋԈԸՏԠՀԡՎԑԢԢԭ՗ՐԫԗՒՕ՝ՔԭԞբ՜ՁԽՙԧԷԳժԪՊԾԺծըՏՍԳՆՍՙծՅմլԻէՎՋՋվո՞Ղբ՗յ։պ֊օ՘գ՞՜էՈթգՌշ։խթֆըքօձհ֍տո՚֕չ֏ռ֢ՠվդ֚֗ո֟փ֑ֈ։ִ֑և֑րֱ֢֓մմ֦׀ֱֱ֫֘֘։", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ŕŢšŚƅƆűŻŝƈŀƁƉšŗżŜōžƔšűƌŦŐŷŴťƗƝŖſşůƗƓƠśƖƨƢƊƟƣżŭŶƊƎƉūťƆƢƁƠƮƇƑƩƱųŹƱƸƑſƋƳưǇƜƑƣƢƺǄƸǂƷǍƛƪǐƠƝǈǔǅƔǘƙǔǓǆǟƚƾưƟƹƛƶƤǓƠƹǠǬǉƥǬƩƯǐǨǲǂƳǔƱƳǘǘǥǝǇƶǼƷǘǌǟǱǺǶȆǘȃǩǡȊǪȇǽǪǪȀǦȀȑȒǳǦǻǘȜȊȆȖǯǪȏǕȜǾȜǽǽǤǡǝțȕțȍȩȀȦȂǲȍǺǻ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[6] = NLoginCore_138.A("ŵőłƀŽźŲŃŶŉŞťŗƂƉţŭŤƈőŏœƁŶƀŰŕŨƓƔƛƝƞśƐŠŮƄƀŷƆŨŲů", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[7] = NLoginCore_173.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӍӪӞԒԁӳӎԃӎӡӦӹԋӵӾԊӱӫӬӸԁӟө", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[8] = NLoginCore_201.E("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈՀտ՚՜աՑդըֈ֋՗֏դևկ՜֖֗ՙին֝ը", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[9] = NLoginCore_004.A("ŐŵĿŽŖŔļŴŨŅŔƇŶƍƍżƁŉƀŴƊƌŶƄŦŷţƅűŪűŨ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[10] = NLoginCore_092.B("ŰŰŢōŀĿŖżŧƀŉŨņŧşƆŦƐƃŋŠűƃŤŊƘƚƍƜƔũųƝŶƒůƚƀŲƑƐƑƕŪŪƤŦƧŨƎƓŽƋƳźŻ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[11] = NLoginCore_027.D("ӏӯӺӳӖӞӱӒӛҼӘӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[12] = NLoginCore_559.E("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈՍբ՟ժՋ֌ճ՝քթ֋֓նղՓ֌֚֙շ֣֡իը", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[13] = NLoginCore_559.F("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈ֏սՐջիՒՔՒճդձբբ֊ֈ֌ոպղհա֙ը", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[14] = NLoginCore_223.D("ӪӤӊӸӾӭӏӼӰӳӔӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[15] = NLoginCore_559.C("ӏӈҺӐӎӘӖӻӰӴӯӱӧӾӰӽӹԂԄӪӅӉӐӞӮӍӮӔԐӍԍӸԇԕԛӝӝӶӶԗӡԄӽӶӥԥԈӴԔԈӺԬӼԘԦӨӱӥԍӬԁԬԠԊ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[16] = NLoginCore_223.A("śŲŐľƁŀƆůŝşŠňŵŭŗƆƃźŬƋżŽƕŠŦŨƛƋƚŽƞƀƁůƍƘźƆƁƏŢơŴųƔƤƢƗƀƌŪƜƃůƶưƢŹƧƋƮƽƎƿ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[17] = NLoginCore_091.C("ӔӛӇөӔӉӗӿӠӿӶӉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[18] = NLoginCore_201.E("մՅԴՅ՚զկծԹփձՖ՗սՐրՖըֆաՅնշբՎջծ։դՑՠ֕֒ն֐մհ՜՗֞կբճ֐հ֏է֧ֈղ֪֟ը֙ռի֫֊ְְ֮֕ղֶֺ֦֢֦֮֬ն֎ֳֿ֗ֈ", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[19] = NLoginCore_427.D("ӪӼҷәӷӰӎӸӎӻӱӂӟӾԄӞӇӿӡԋӣԊӎԉӲӟӝӥԈԅԋԏԕӛӽӰӼӵԔәԍԣԔԦԙԨӞөԥӷԍԤӺԭӴӵ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[20] = NLoginCore_091.E("ԫշէՍկՋԾղյՖլմՄցզ՛նսչժջՍֆիաիՠ։՟դ֓Պ֔֊մ֔֍֕՜խչ֡֗բ֛զկ֙մ֓մզְ֛֭ցպ֑֒֩խտքկֺ֍ֲֺ־ָ֖֍ֿ֛֩֙ռ֛׆֧֦ֈׂ֝׀ּ֓֔", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[21] = NLoginCore_138.C("ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼԐԋӠԒӾӮӒӡӉԄԃөԔӽԎԙӗԐԉӵԕӚӳӵԥӸӟԀӿӧӶӿӪӢԁԃӰԡԔԎԮԶԆԑԨԤԳӴӽԳԳԮԑԟԷԗԂՂԤԖԪԈԜԻԟԾԃՎ԰԰ԞՂՒԕԮ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[22] = NLoginCore_091.E("Վ՛՚ՓվտժմՖցԵչՂէ՛չՔ՟լՕբևէՏ֑Մֈ֏ՓհկՒհօ՚՗Օհս՛լ֑֗֗օ՝մ֝բ֜ւ֘ր֣֦֛օְֱխ֍ֶձ֐ֱ֧֋ֱ֛ֈָղ֍֏׀ֹֻ֦֝օׁ֊ֺ֟֗׌֓֔", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[23] = NLoginCore_138.A("ŕŢšŚƅƆűŻŝƈļŹƈŗřƂŘŮŧœŒƆŞŮœƏŸŔƑƞƋŜŪŷƃƀƘƘŻƢŦŲƟƌƞŪƋơžƧƍŬƑƬƆƵƏŹŹƗƮƫƝƜ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[24] = NLoginCore_446.F("բՏՇԺՑԵՖՋ՘ԹնջՒտՂչռգ՗֋ՙգփզռ֓խաք֑ՓՊ֒֎֘ռմ֊֚֕֞֕ջը", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[25] = NLoginCore_091.E("ճԬըեէ՛Պ՛ՕլջՖճւՓ՚թթ՟վց֌ՓՔ", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[26] = NLoginCore_453.D("ӴҭөӦӨӜӋӜӖӭӼӗӴԃӔӛӪӪӠӿԂԍӔӕ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[27] = NLoginCore_575.F("ՁՈ՜էՊՓՏջՑՌսՈ", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[28] = NLoginCore_384.D("ҴӄӖӷӼӨӽӯӽӢӮӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[29] = NLoginCore_138.B("ŎŝŵŽřŞŹœżŁŒŏ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[30] = NLoginCore_138.D("ҴӄӖӷӼӨӽӯӽӢӮӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[31] = NLoginCore_384.B("ŎŝŵŽřŞŹœżŁŒŏ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[32] = NLoginCore_027.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉԏӭӣӎԑԏӎӈӪӰӳ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[33] = NLoginCore_091.A("ŪŵƀŋŬŤŤŶũŅŜņƉŽƀƌōšŊŉŐŎōşƃŸŲŪūŖƖŗ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[34] = NLoginCore_559.E("ՎծչղՕ՝հՑ՚Ի՗Ո", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[35] = NLoginCore_201.B("ůŠŎśƅĻſőŖźŚƌŜŻśŏŪƒťŮžŏƒƒƇŒƊƏƚűƔŨ", (byte)68, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_057.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŸŜżĹłŹĿťŕŦųņŊŮŻťƃƁňŒţƈŧƇŖƕƛŭŵƌŐŪşŘųƏŭƘŤŹƠŨƘů", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[1] = NLoginCore_027.E("ծՊԻչնճիԼկՂ՘ԼԼՏֈ՟Փվ՞Նծծ՝ՊիՒ՛՝֏ղօյն֊ծՔնՕծչ֗րտը", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[2] = NLoginCore_387.F("յչռՇՑ՚չՙԼճԺլֆւ՛՗՜թՓջ՟ևՙֆրՋ՛֑և֌֘Պ", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ӱӗӌӇҽӯӗӶӍӂӜӉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[4] = NLoginCore_223.B("ŕŢšŚƅƆűŻŝƈŀŝŃƄŘƌŢťŚųŝŽōŨƃūƅŨżťƗŨŴŬƘŶƗƅƓŻżƗƉƦƕƚŠƜưƉůƟƎƠƇŴƢŶƎŴƽƔƼƵƊƮƞưƭǄƱƴƙƼƢǅƢƆƝƜƎǐơƎƑƎƾǕƦǆƧǔƗƨƨƳǝǖƱƝǘǛǣǚƳƤǨǢǇǃǟƭƽƹǰưǐǄǀǴǮǕǓƹǌǓǟǴǋǺǲǁǭǔǑǑȄǾǤǈǨǝǻȏȀȐȋǞǩǤǢǭǎǯǩǒǽȏǳǯȌǮȊȋǷǶȓȅǾǠțǿȕȂȨǦȄǪȝȠǾȥȉȗȎȏȗȺȍȗȆȨǸȚǸǹǿȏȰȨȕɁɋȶȉȩȜȍȺȤȳɐȣɓȚț", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[5] = NLoginCore_027.C("ӏӜӛӔӿԀӫӵӗԂҺӻԃӛӑӶӖӇӸԎӛӫԆӠӊӱӮӟԑԗӐӹәөԑԍԚӕԐԢԜԄԙԝӶӧӰԄԈԃӥӟԀԜӻԚԨԁԋԣԫӭӳԫԲԋӹԅԭԪՁԖԋԝԜԴԾԲԼԱՇԕԤՊԚԗՂՎԿԎՒԓՎՍՀՙԔԸԪԙԳԕ԰ԞՍԚԳ՚զՃԟզԣԩՊբլԼԭՎԫԭՒՒ՟՗Ձ԰նԱՒՆՙիմհրՒսգ՛քդցշդդպՠպ֋֌խՠյՒ֖քր֐թդ։Տ֖ո֖շշ՞՜տ֑֒՚՛բ֜ց֫ծ֝մյ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[6] = NLoginCore_324.F("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈՌպկչթՎա֌֍֖֔֐Ռ֎ի֔պլը՘ՠ՚ը", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[7] = NLoginCore_004.F("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈՌթ՝֑րղՍւՍՠե֕՘Ս֜՗֞՗յ֡֒֙ը", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[8] = NLoginCore_324.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӁԀӛӝӢӒӥөԉԌӘԐӻӹӜӻӗӞԏԡӮӼө", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[9] = NLoginCore_451.A("ŐŵĿŽŖŔļŴŨŅŔƇŶƍƍżƁŉƀŴƊƃƑƏŤƏƎƎƐŵżũ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[10] = NLoginCore_324.F("թթ՛ՆԹԸՏյՠչՂաԿՠ՘տ՟։ռՄՙժռ՝Ճ֑֓ֆ֕֍բլ֖կ֋ը֓չի֊։֊֐՞ռջ֝ա֜օ֙ի֍ո֪֤֭֙ևև֔֫հ֪", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[11] = NLoginCore_384.D("ӆӑӺӈӑӐӼӛӵӟӔӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[12] = NLoginCore_110.C("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉӎӣӠӫӌԍӴӞԅӪԌԊӕӼӳԒӚԀԟӳԁӰԒԝӴԖԥԈӫԩԋӮӷӴӵ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[13] = NLoginCore_324.D("ӯӋҼӺӷӴӬҽӰӃӘӟӑӼԃӝӧӞԂӋӉԐӾӑӼӬӓӕӓӴӥӲӢӲԙӬӕӵӸӿӲԁӜԐԥӣԇԧӻӷԪԨӺԇӴӵ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[14] = NLoginCore_223.B("œŏūŽŏŸƂŢťŵŕŢřńžōŹƒőůœƃŚś", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[15] = NLoginCore_387.C("ӏӈҺӐӎӘӖӻӰӴӯӱӧӾӰӽӹԂԄӪӅӉӐӞӮӍӮӔԐӍԍӸԇԕԛӝӝӶӶԗӡԄӽӶӥԥԈӴԔԈӺԬӼԏԩӱԎӯԥԌԗӭӮԹԣԼԘԥԊԇԿԔԓԷԾԉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[16] = NLoginCore_324.B("śŲŐľƁŀƆůŝşŠňŵŭŗƆƃźŬƋżŽƕŠŦŨƛƋƚŽƞƀƁůƍƘźƆƁƏŢơŴųƔƤƢƗƀƌŪƜƃŵƵƃƠƏŹƱƄƅƆƚ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[17] = NLoginCore_223.C("ӍҺҵӋӪӗӐӻӞӞӶӉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[18] = NLoginCore_559.E("մՅԴՅ՚զկծԹփձՖ՗սՐրՖըֆաՅնշբՎջծ։դՑՠ֕֒ն֐մհ՜՗֞կբճ֐հ֏է֧ֈղ֪֟ը֙ռի֫֊ְְ֮֕ղ֦֑֌խֶ֥֭׀րջֵ֭ֈ", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[19] = NLoginCore_201.D("ӪӼҷәӷӰӎӸӎӻӱӂӟӾԄӞӇӿӡԋӣԊӎԉӲӟӝӥԈԅԋԏԕӛӽӰӼӵԔәԍԣԔԞԠԃԠԄԥԕӿӧӪԗԨԬԚӫԈԁԪԃԤԕ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[20] = NLoginCore_110.C("ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼӎԇӬӢӬӡԊӠӥԔӋԕԋӵԕԎԖӝӮӺԢԘӣԜӧӰԚӵԔӵӧԮԜԱԂӻԒԓԪӮԀԅӰԻԎԳԻԿԹԗԎԪՀԜԃ԰Ӿ԰ԺԛՋԚԷԭԏ԰ԎԥԧԜԯԡՍԨ԰", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[21] = NLoginCore_223.D("ҬӸӨӎӰӌҿӳӶӗӭӵӅԂӧӜӷӾӺӫӼԐԋӠԒӾӮӒӡӉԄԃөԔӽԎԙӗԐԉӵԕӚӳӵԥӸӟԀӿӧӶӿӪӢԁԃӰԡԔԎԮԶԆԑԨԤԳӴӽԳԳԮԑԟԷԗԂՂԤԖԪԈԜԻԢԙԐՃԡ԰ԴՕՀՄՓԸՍԕԵՊ՞ԻԠՐԝԛԩ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[22] = NLoginCore_091.A("ŕŢšŚƅƆűŻŝƈļƀŉŮŢƀśŦųŜũƎŮŖƘŋƏƖŚŷŶřŷƌšŞŜŷƄŢųƘƞƞƌŤŻƤũƣƉƟƇƪƭƢƌƷƸŴƔƽŸƗƸƮƒƢƸƏƿŹƔƖǇƣƖƋƫƗǎƠƛƬƨƝƚƛ", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[23] = NLoginCore_004.F("Վ՛՚ՓվտժմՖցԵղցՐՒջՑէՠՌՋտ՗էՌֈձՍ֊֗քՕգհռչ֑֑մ֛՟ի֘օ֗գք֚շ֠ֆե֊֞ի֋֍֜֍ֶָ֣֟յ֧֋֏֊ֽ֎֐ְ֭ովֈ", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[24] = NLoginCore_223.D("ӣӐӈһӒҶӗӌәҺӷӼӓԀӃӺӽӤӘԌӚӤԄӧӽԔӮӢԅԒӔӋӦӛԓӰӯԌөӪӾԔӬө", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[25] = NLoginCore_223.A("źĳůŬŮŢőŢŜųƁŇƄƎŇƉƆőŊƀŌŝŚś", (byte)68, 65);
                    NLoginCore_057.var_java_lang_String_arr_b[26] = NLoginCore_201.C("ӴҭөӦӨӜӋӜӖӭӺӗԂӸөӟӈӘӹҿԀӽӔӕ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[27] = NLoginCore_091.C("өҳӻӮҹӛӖҾӒӏӜӉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[28] = NLoginCore_138.F("խհդԼե՚ըԽԾՂնգցչտՂ՜ՇՔ՘ՖզՓՔ", (byte)68, 70);
                    NLoginCore_057.var_java_lang_String_arr_b[29] = NLoginCore_091.C("ӚҶҺӱӴӪӵӓӬӹӌӉ", (byte)68, 67);
                    NLoginCore_057.var_java_lang_String_arr_b[30] = NLoginCore_092.D("ӗӱӷӨӾӒӶӏӾӋӾӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[31] = NLoginCore_559.B("ŠĺūļĽōĿŰƃŻŁŏ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[32] = NLoginCore_027.E("ծՊԻչնճիԼկՂ՗՞Րջւ՜զ՝ցՊՈՇորՊՠ։֕֕եի֒լ՘շռճֆից՛֜բը", (byte)68, 69);
                    NLoginCore_057.var_java_lang_String_arr_b[33] = NLoginCore_076.B("ŪŵƀŋŬŤŤŶũŅŜņƉŽƀƌōšŊŉŐƕƔŴŷƚŴƇƗŸūƟ", (byte)68, 66);
                    NLoginCore_057.var_java_lang_String_arr_b[34] = NLoginCore_223.D("ӋҭӭӻӌӬӼӑӢӋһӉ", (byte)68, 68);
                    NLoginCore_057.var_java_lang_String_arr_b[35] = NLoginCore_091.F("ըՙՇՔվԴոՊՏճՓօՕմՔՈգ֋՞էշՍ֊Րսռա֔ղ֓Ց֎", (byte)68, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_057.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ӕӑӒӘӞӪӶӱӘӫӜӉ", (byte)68, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_057.var_java_lang_String_arr_b[0] = NLoginCore_384.F("պմԲՉԳՏյղ՜Ձչ՞ՠեըՅճատ՗իզՓՔ", (byte)68, 70);
                }
            }
        }
    }
}

