/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.nbt.NBT
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Configuration$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType$Play$Client
 *  com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.resources.ResourceLocation
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientCustomClickAction
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientCustomClickAction
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.protocol.nbt.NBT;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketType;
import com.nickuc.login.lib.packetevents.api.protocol.packettype.PacketTypeCommon;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.resources.ResourceLocation;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientCustomClickAction;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientCustomClickAction;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_206;
import com.nickuc.login.NLoginCore_234;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_096;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_225
implements NLoginInterface_003 {
    private static int db;
    private static int br;
    private static int r;
    private static int ax;
    private static long cy;
    private static long var_long_c;
    private static int dg;
    private static int cg;
    private static int ad;
    private static int w;
    private static int i;
    private static int s;
    private static int ao;
    private static int cl;
    private static int var_int_a;
    private static long bh;
    private static long aj;
    private static long bc;
    private static long bz;
    private static String[] var_java_lang_String_arr_b;
    final /* synthetic */ NLoginCore_206 var_com_nickuc_login_NLoginCore_206_b;
    private static int cr;
    private static int h;
    private static long az;
    private static int cd;
    private static int cp;
    private static long cb;
    private static long ab;
    private static int al;
    private static long an;
    private static int t;
    private static int bd;
    private static int aa;
    private static int j;
    private static int ac;
    private static long aq;
    private static long bw;
    private static long cc;
    private static String[] var_java_lang_String_arr_a;
    private static int ak;
    private static int bp;
    private static int cv;
    private static int bg;
    private static int be;
    private static int by;
    private static int var_int_c;
    private static long af;
    private static long x;
    private static int bo;
    private static int at;
    private static int bj;
    private static long au;
    private static int as;
    private static long o;
    private static long n;
    private static int ca;
    private static int bn;
    private static long ce;
    private static int bu;
    private static int co;
    private static int dc;
    private static int bx;
    private static int ck;
    private static long g;
    private static long e;
    private static int bq;
    private static int am;
    private static int cs;
    private static int cz;
    private static int bv;
    private static int cn;
    private static int ah;
    private static int de;
    private static long bs;
    private static long l;
    private static int bk;
    private static long bf;
    private static long bt;
    private static long ae;
    private static int df;
    private static int u;
    private static int cj;
    private static int p;
    private static int f;
    private static int bb;
    private static int ag;
    private static int m;
    private static int cw;
    private static long ay;
    private static int z;
    private static long ar;
    private static long av;
    private static long da;
    private static long d;
    private static int aw;
    private static int ai;
    private static int bl;
    private static int cq;
    private static int cm;
    private static long ct;
    private static int ba;
    private static long q;
    private static long y;
    private static int cx;
    private static long bi;
    private static int k;
    private static int ch;
    private static int dd;
    private static int bm;
    private static int ap;
    private static long cf;
    private static long var_long_b;
    private static long cu;
    private static long ci;
    private static long v;

    /*
     * Exception decompiling
     */
    private String a(User var1_1, ResourceLocation var2_2, NBT var3_3, @Nullable Object var4_4, Channel var5_5, boolean var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_225.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.E("ӮԐԒӲԖԵԭՃԯӾԼԲՀԺԃԨՊՉՁՇՁԖ", (byte)10, 69), NLoginCore_225.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.C("жутЅхсмхѐпЌъючъѐВަޣޣޯޟީޣޝЦ", (byte)10, 67) + string + NLoginCore_092.E("Ԁ", (byte)10, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 181 | 0 << ~181 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(2706628125522234899L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(6741853391646199315L);
        e = Long.reverse(0x7800000000000000L);
        f = (0x400000 >>> 213 | 0x400000 << -213) & 0xFFFFFFFF;
        g = Long.reverse(2706628125522234899L);
        h = 512 >>> 9 | 512 << -9;
        i = (0x1000000 >>> 120 | 0x1000000 << -120) & 0xFFFFFFFF;
        j = (0x300000 >>> 180 | 0x300000 << ~180 + 1) & 0xFFFFFFFF;
        k = (-1 >>> 108 | -1 << ~108 + 1) & 0xFFFFFFFF;
        l = Long.reverse(2706628125522234899L);
        m = 32768 >>> 237 | 32768 << -237;
        n = Long.reverse(6741853391646199315L);
        o = Long.reverse(0x7800000000000000L);
        p = Integer.reverse(-1610612736);
        q = Long.reverse(2706628125522234899L);
        r = Integer.reverse(Integer.MIN_VALUE);
        s = (1024 >>> 74 | 1024 << ~74 + 1) & 0xFFFFFFFF;
        t = (393216 >>> 16 | 393216 << ~16 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(-1);
        v = Long.reverse(2706628125522234899L);
        w = (458752 >>> 16 | 458752 << ~16 + 1) & 0xFFFFFFFF;
        x = Long.reverse(6741853391646199315L);
        y = Long.reverse(0x7800000000000000L);
        z = Integer.reverse(0x10000000);
        aa = (-1 >>> 22 | -1 << ~22 + 1) & 0xFFFFFFFF;
        ab = Long.reverse(2706628125522234899L);
        ac = -1 >>> 177 | -1 << ~177 + 1;
        ad = (0x240000 >>> 18 | 0x240000 << -18) & 0xFFFFFFFF;
        ae = Long.reverse(6741853391646199315L);
        af = Long.reverse(0x7800000000000000L);
        ag = Integer.reverse(0);
        ah = (0xA00000 >>> 116 | 0xA00000 << ~116 + 1) & 0xFFFFFFFF;
        ai = (-1 >>> 85 | -1 << ~85 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(2706628125522234899L);
        ak = 8 >>> 131 | 8 << -131;
        al = Integer.reverse(-805306368);
        am = -1 >>> 20 | -1 << -20;
        an = Long.reverse(2706628125522234899L);
        ao = Integer.reverse(0x40000000);
        ap = Integer.reverse(0x30000000);
        aq = Long.reverse(6741853391646199315L);
        ar = Long.reverse(0x7800000000000000L);
        as = Integer.reverse(-1073741824);
        at = (0x68000000 >>> 155 | 0x68000000 << ~155 + 1) & 0xFFFFFFFF;
        au = Long.reverse(6741853391646199315L);
        av = Long.reverse(0x7800000000000000L);
        aw = Integer.reverse(0x20000000);
        ax = Integer.reverse(0x70000000);
        ay = Long.reverse(6741853391646199315L);
        az = Long.reverse(0x7800000000000000L);
        ba = Integer.reverse(Integer.MIN_VALUE);
        bb = (0x3C00000 >>> 214 | 0x3C00000 << ~214 + 1) & 0xFFFFFFFF;
        bc = Long.reverse(2706628125522234899L);
        bd = Integer.reverse(0x8000000);
        be = -1 >>> 211 | -1 << -211;
        bf = Long.reverse(2706628125522234899L);
        bg = Integer.reverse(-2013265920);
        bh = Long.reverse(6741853391646199315L);
        bi = Long.reverse(0x7800000000000000L);
        bj = 0 >>> 76 | 0 << ~76 + 1;
        bk = Integer.reverse(Integer.MIN_VALUE);
        bl = 0 >>> 33 | 0 << -33;
        bm = 0 >>> 35 | 0 << -35;
        bn = (0x2000000 >>> 57 | 0x2000000 << -57) & 0xFFFFFFFF;
        bo = Integer.reverse(0);
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(Integer.MIN_VALUE);
        br = Integer.reverse(0x48000000);
        bs = Long.reverse(6741853391646199315L);
        bt = Long.reverse(0x7800000000000000L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bv = (0x130000 >>> 80 | 0x130000 << ~80 + 1) & 0xFFFFFFFF;
        bw = Long.reverse(2706628125522234899L);
        bx = Integer.reverse(0x28000000);
        by = Integer.reverse(-1);
        bz = Long.reverse(2706628125522234899L);
        ca = 0x50000001 >>> 188 | 0x50000001 << -188;
        cb = Long.reverse(6741853391646199315L);
        cc = Long.reverse(0x7800000000000000L);
        cd = Integer.reverse(0x68000000);
        ce = Long.reverse(6741853391646199315L);
        cf = Long.reverse(0x7800000000000000L);
        cg = Integer.reverse(-402653184);
        ch = Integer.reverse(-1);
        ci = Long.reverse(2706628125522234899L);
        cj = (0 >>> 85 | 0 << -85) & 0xFFFFFFFF;
        ck = Integer.reverse(0);
        cl = Integer.reverse(0);
        cm = 0 >>> 125 | 0 << ~125 + 1;
        cn = (0 >>> 251 | 0 << -251) & 0xFFFFFFFF;
        co = 0 >>> 230 | 0 << ~230 + 1;
        cp = 0 >>> 81 | 0 << -81;
        cq = (2 >>> 193 | 2 << ~193 + 1) & 0xFFFFFFFF;
        cr = (0 >>> 174 | 0 << -174) & 0xFFFFFFFF;
        cs = Integer.reverse(0x18000000);
        ct = Long.reverse(6741853391646199315L);
        cu = Long.reverse(0x7800000000000000L);
        cv = 16 >>> 132 | 16 << -132;
        cw = 0 >>> 17 | 0 << -17;
        cx = Integer.reverse(-1744830464);
        cy = Long.reverse(2706628125522234899L);
        cz = 0x1A0000 >>> 240 | 0x1A0000 << -240;
        da = Long.reverse(2706628125522234899L);
        db = Integer.reverse(0);
        dc = 0 >>> 41 | 0 << -41;
        dd = (0x2000000 >>> 89 | 0x2000000 << ~89 + 1) & 0xFFFFFFFF;
        de = 2 >>> 225 | 2 << -225;
        df = Integer.reverse(-671088640);
        dg = 864 >>> 101 | 864 << ~101 + 1;
        var_java_lang_String_arr_a = new String[df];
        var_java_lang_String_arr_b = new String[dg];
        NLoginCore_225.b();
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        PacketTypeCommon packetTypeCommon = packetReceiveEvent.getPacketType();
        if (packetTypeCommon == PacketType.Play.Client.CUSTOM_CLICK_ACTION) {
            if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d) {
                return;
            }
            WrapperPlayClientCustomClickAction wrapperPlayClientCustomClickAction = new WrapperPlayClientCustomClickAction(packetReceiveEvent);
            ResourceLocation resourceLocation = wrapperPlayClientCustomClickAction.getId();
            if (!((String)NLoginCore_225.c("㺀", (int)var_int_a, (long)var_long_b)).equals(resourceLocation.getNamespace())) {
                return;
            }
            Channel channel = (Channel)packetReceiveEvent.getChannel();
            NLoginCore_096 NLoginCore_0962 = channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c) ? (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get() : null;
            User user = packetReceiveEvent.getUser();
            if (user == null) {
                return;
            }
            if (NLoginCore_0962 == null) {
                NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                NLoginCore_234.i(user, (String)NLoginCore_225.c("㺃", (int)var_int_c, (long)(d ^ e)));
                return;
            }
            Object object = packetReceiveEvent.getPlayer();
            if (object == null) {
                NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                NLoginCore_234.i(user, (String)NLoginCore_225.c("㺆", (int)f, (long)g));
                return;
            }
            packetReceiveEvent.setCancelled(h != 0);
            NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b).b(i != 0).a(() -> {
                if (!channel.isActive()) {
                    return;
                }
                String string = this.a(user, resourceLocation, wrapperPlayClientCustomClickAction.getPayload(), object, (Channel)packetReceiveEvent.getChannel(), de != 0);
                if (string != null) {
                    NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                    NLoginCore_234.i(user, string);
                } else {
                    NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                }
            });
        } else if (packetTypeCommon == PacketType.Configuration.Client.CUSTOM_CLICK_ACTION) {
            NLoginCore_096 NLoginCore_0963;
            if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c) {
                return;
            }
            WrapperConfigClientCustomClickAction wrapperConfigClientCustomClickAction = new WrapperConfigClientCustomClickAction(packetReceiveEvent);
            ResourceLocation resourceLocation = wrapperConfigClientCustomClickAction.getId();
            if (!((String)NLoginCore_225.c("㺉", (int)(j & k), (long)l)).equals(resourceLocation.getNamespace())) {
                return;
            }
            User user = packetReceiveEvent.getUser();
            if (user == null) {
                return;
            }
            Channel channel = (Channel)packetReceiveEvent.getChannel();
            NLoginCore_096 NLoginCore_0964 = NLoginCore_0963 = channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c) ? (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get() : null;
            if (NLoginCore_0963 == null) {
                NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                NLoginCore_234.i(user, (String)NLoginCore_225.c("㺌", (int)m, (long)(n ^ o)));
                return;
            }
            if (NLoginCore_0963.var_com_nickuc_login_NLoginInterface_032_a == null) {
                NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                NLoginCore_234.i(user, (String)NLoginCore_225.c("㺏", (int)p, (long)q));
                return;
            }
            packetReceiveEvent.setCancelled(r != 0);
            NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b).b(s != 0).a(() -> {
                if (!channel.isActive()) {
                    return;
                }
                String string = this.a(user, resourceLocation, wrapperConfigClientCustomClickAction.getPayload(), null, channel, db != 0);
                if (string != null) {
                    NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                    if (!string.isEmpty()) {
                        NLoginCore_234.i(user, string);
                    } else {
                        NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                        user.closeConnection();
                    }
                    NLoginCore_0962.var_com_nickuc_login_NLoginInterface_032_a.resume(dc != 0);
                } else {
                    channel.attr((AttributeKey)NLoginCore_096.var_long_c).set(null);
                    NLoginCore_0962.var_com_nickuc_login_NLoginInterface_032_a.resume(dd != 0);
                    NLoginCore_206.a(this.var_com_nickuc_login_NLoginCore_206_b, user);
                }
            });
        } else {
            throw new IllegalArgumentException((String)NLoginCore_225.c("㺒", (int)(t & u), (long)v) + packetReceiveEvent.getPacketType());
        }
    }

    public NLoginCore_225(NLoginCore_206 NLoginCore_2062) {
        this.var_com_nickuc_login_NLoginCore_206_b = NLoginCore_2062;
    }

    private static String a(int n, long l) {
        l ^= 0x1EL;
        l ^= 0xCB26ECDA7BECAF24L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(40 + 29), (byte)(7 + 76), 47, (byte)(8 + 59), (byte)(53 + 13), (byte)(26 + 41), 47, (byte)(33 + 47), (byte)(23 + 52), (byte)(3 + 64), (byte)(34 + 49), (byte)(19 + 34), (byte)(60 + 20), (byte)(41 + 56), (byte)(34 + 66), (byte)(34 + 66), (byte)(53 + 52), (byte)(32 + 78), (byte)(27 + 76)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.A("ļŉňċŋŇłŋŖŅĒŐŔōŐŖĘҬҩҩҵҥүҩң", (byte)45, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_225.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -4003230469624958534L;
        long l = var_long_c ^ 0xCB26ECDA7BECAF24L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(36 + 33), (byte)(76 + 7), (byte)(28 + 19), (byte)(44 + 23), (byte)(51 + 15), (byte)(28 + 39), (byte)(12 + 35), (byte)(18 + 62), (byte)(25 + 50), (byte)(55 + 12), (byte)(15 + 68), 53, (byte)(56 + 24), 97, (byte)(75 + 25), (byte)(42 + 58), (byte)(6 + 99), (byte)(64 + 46), (byte)(74 + 29)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_225.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ՂԩՒԨՇՎԱԴԚՎՇԢ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[1] = NLoginCore_559.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѯқѷҼһҔҕҙҲҥҲҟӅѼӄӁҍҨ҈ӃҜҐҏӅӔҐҶҢғҶӒӋҥҢң", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[2] = NLoginCore_446.E("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմՂՂ֋թ՟փՈՊիխզՊըֈ։ճ֗ֈդձՎեբ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ѷў҇ѝѼ҃Ѧѩя҃Ѽї", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[4] = NLoginCore_201.E("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԺզՂևֆ՟ՠդսհսժ֐Շ֏֌՘ճՓ֎է՛՚֐֟՛ցխ՞ց֖֝հխծ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[5] = NLoginCore_076.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҖқҗҠҝӀ҇ҭҽҥӅӍҨӂӒӕґұӄӔҫҥҢң", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[6] = NLoginCore_004.E("ՌԝԧՐՐԠԦՏՕԩ԰ԵԸՐՒՂԲԬԥՑգ՞՟ԧՀԩԫ՞հՄՏՑԳդդծաՋՇՋՓդշՂ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[7] = NLoginCore_384.F("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊ճղե֔ՠ՗ՔլզևՔբ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[8] = NLoginCore_138.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕģģŬŊŀŤĩīŌŎŇīŉũŪŔŸũŅŒįņŃ", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[9] = NLoginCore_091.B("ĆĦįīöĺĢùĸīĈđīĀýģğķĳĳĤđĎď", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[10] = NLoginCore_559.B("ĞĨĊķćČđ÷ĻĹīĻėėĽńĤġĺńĥķĎď", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[11] = NLoginCore_559.F("ԧՏԒԎ՗ԪԓԩՊՑԚԙԬԛԡԪՃՐ԰Ի՛զԭԮ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[12] = NLoginCore_138.E("ԡԟԵ՗ԡՈՔՑ՘Ԧ՘ԱԬԫՍԹԕ՛ՆԟԦՄ՟՜ՄԿթՀՃկԫՁ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[13] = NLoginCore_559.C("ієѪҌіѽ҉҆ҍћҍѨҀҏѷ҉җыѱѳѸѵѢѣ", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[14] = NLoginCore_092.D("њѺ҃ѿъҎѶэҌѿќѥѿєёѷѳҋ҇҇ѸѥѢѣ", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[15] = NLoginCore_324.D("҅ѤѩѧѨѽѣѽѽѭѦї", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[16] = NLoginCore_324.C("ѹ҃ѹѿућѦхѺѱҁћѲѶҖҍҌҌѪ҄҆ҋѢѣ", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[17] = NLoginCore_201.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҨҋӏҴҍӄҠҐӈӛғҥҢң", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[18] = NLoginCore_223.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćĥŀĽĥĠŊġĤŐČĢ", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[19] = NLoginCore_076.D("҅ѤѩѧѨѽѣѽѽѭѦї", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[20] = NLoginCore_201.D("ѹ҃ѹѿућѦхѺѱҀъѭѴҖҘҖҎђѨҘқѢѣ", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[21] = NLoginCore_559.F("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմֈցըքՅԿխ֎սխ֍թՒդյժֆ֘ժկքղֈժշ՘֕մքտղռ֖խծ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[22] = NLoginCore_076.F("ՄՎՄՊԎԦԱԐՅԼՋԕՙԫԡԹԠԴԢեբ԰ԭԮ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[23] = NLoginCore_201.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕũŢŉťĦĠŎůŞŎŮŊĳŅŖŋŧŹŋŐťŕıŋŵūŘŘļŐƆšƇŎŏ", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[24] = NLoginCore_223.B("ìĖĆĆĳôīĨĭīùă", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[25] = NLoginCore_223.F("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊֓֌ՏլֈխՔ֒խք՘բ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[26] = NLoginCore_453.A("ĪģĬĘĬąđĚĸôĞă", (byte)30, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_225.var_java_lang_String_arr_b[0] = NLoginCore_575.C("тѤѢљѫҁўѢѥќњѩѳғҊҌѪѤҌѭїѥѢѣ", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[1] = NLoginCore_138.F("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԺզՂևֆ՟ՠդսհսժ֐Շ֏֌՘ճՓ֎է՘թ՛՝արա֚ա֢ջրխծ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[2] = NLoginCore_201.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѷѷӀҞҔҸѽѿҠҢқҠҝҫҥҖҺӏӌҟӈӅҌӂҔӀҠҶҵҬӍҖҥҢң", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[3] = NLoginCore_004.F("ՇԠԵՑԍՓՁՅԓ԰ՌԬՓԾաԛՕԣԯաԦՀԭԮ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[4] = NLoginCore_223.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩѯқѷҼһҔҕҙҲҥҲҟӅѼӄӁҍҨ҈ӃҜҍҦҞҍӔҿґҦҤӍӆҵҢң", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[5] = NLoginCore_223.C("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҖқҗҠҝӀ҇ҭҽҥӅҲӎҌҷҶҏҋҫҺӚӋҢң", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[6] = NLoginCore_138.B("ĭþĈııāćİĶĊđĖęıĳģēčĆĲńĿŀĈġĊČĿőĥİĲĪıĿœīĤĶńĺķĕģ", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[7] = NLoginCore_387.F("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմԾպղաՉջեշքւ֊թՆէ֐֗ճ֊ժոք֋բ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[8] = NLoginCore_138.B("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕģģŬŊŀŤĩīŌŎŇıŧľŦŮŔŴźŲŸŸŎűũłŤŌşŗřŁőŎŏ", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[9] = NLoginCore_027.D("њѺ҃ѿъҎѶэҌѿњѭѮѝџҗєѥ҄ҕҝҋѢѣ", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[10] = NLoginCore_110.F("ԽՇԩՖԦԫ԰Ԗ՚՘ՈԗՉՔԭՍՔ՜԰ՑԞՖԭԮ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[11] = NLoginCore_076.C("ќ҄чуҌџшўѿ҆э҅ѡѥѰғіҌѤѷєҎҕїҕҐҞѸ҄҄Ѥџ", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćģłėĢćĖİĉĿħĿ", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[13] = NLoginCore_446.E("ԡԟԵ՗ԡՈՔՑ՘ԦՙԕԱՒԽԠՌ՚ԱՎաԣՈժԦԢՅԹԨ՛ԱՒ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[14] = NLoginCore_559.D("њѺ҃ѿъҎѶэҌѿњҍѴҀҊҎѐҕѹҌђқѢѣ", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[15] = NLoginCore_027.C("҄њѩћѡ҉҄҄ҊѼѢї", (byte)30, 67);
                    NLoginCore_225.var_java_lang_String_arr_b[16] = NLoginCore_110.B("ĥįĥīïćĒñĦĝįħĝĭċĭěĵĂăćķĎď", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[17] = NLoginCore_324.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҩҩҋҽҰҟҐҪӆҚҮӋҢң", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[18] = NLoginCore_223.A("ĂĀĖĸĂĩĵĲĹćĹĒčČĮĚöļħĀćĵĊŁĖĜĦĮĥěįō", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[19] = NLoginCore_387.B("ĥĨĢėďĕĆĳòđĖă", (byte)30, 66);
                    NLoginCore_225.var_java_lang_String_arr_b[20] = NLoginCore_027.E("ՄՎՄՊԎԦԱԐՅԼՎԔՌՒԛԯՙՌԛՑ՜ՖԭԮ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[21] = NLoginCore_324.D("оіҀ҇ѧѭѹхҊ҃ҁҊҌґѱю҄ѶѺғюѺҍёҎѱџҜҞ҂ҢѣѲҙѧҡҧѺѼҏѦ҇ҠґҮѬҠҕҐѸѴѲҩҽҶҝҹѺѴҢӃҲҢӂҞ҇ҙҪҟһӍҟҤҹҦҮӋӅҎӑӅӈҙғҴҵҢң", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[22] = NLoginCore_173.F("ՄՎՄՊԎԦԱԐՅԼՎՕԬԪՙԼդՏ԰՘Դ԰ԭԮ", (byte)30, 70);
                    NLoginCore_225.var_java_lang_String_arr_b[23] = NLoginCore_004.E("ԉԡՋՒԲԸՄԐՕՎՌՕ՗՜ԼԙՏՁՅ՞ԙՅ՘ԜՙԼԪէթՍխԮԽդԲլղՅՇ՚ԱՒի՜չԷիՠ՛ՃԿԽմֈցըքՅԿխ֎սխ֍թՒդյժֆ֘ժկքմղշՠսնտռ՜ձ֒րխծ", (byte)30, 69);
                    NLoginCore_225.var_java_lang_String_arr_b[24] = NLoginCore_384.D("цпѵфєѭѫяюѧўї", (byte)30, 68);
                    NLoginCore_225.var_java_lang_String_arr_b[25] = NLoginCore_427.A("êĂĬĳēęĥñĶįĭĶĸĽĝúİĢĦĿúĦĹýĺĝċňŊĮŎďĞŅēōœĦĨĻĒĳŌĽŚĘŌŁļĤĠĞŕğśœłĪŜņŘťţūŵũţŤťųŨŕŖŚŸŃ", (byte)30, 65);
                    NLoginCore_225.var_java_lang_String_arr_b[26] = NLoginCore_451.B("ăċħĭąĒďĳĬĳĒă", (byte)30, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_225.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ԦԧԾԾԣԔՔԺՐԼ՗ՐԿԮՠՁԭԱՓա՟԰ԭԮ", (byte)30, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_225.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ĲĠćďīāôĦĔķĻþğİĺĿİńĞăĖġĎď", (byte)30, 66);
                }
            }
        }
    }
}

