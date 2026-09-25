/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.event.Continuation
 *  com.velocitypowered.api.event.PostOrder
 *  com.velocitypowered.api.event.ResultedEvent$ComponentResult
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.connection.DisconnectEvent
 *  com.velocitypowered.api.event.connection.LoginEvent
 *  com.velocitypowered.api.event.connection.PreLoginEvent
 *  com.velocitypowered.api.event.connection.PreLoginEvent$PreLoginComponentResult
 *  com.velocitypowered.api.event.player.GameProfileRequestEvent
 *  com.velocitypowered.api.network.ProtocolVersion
 *  com.velocitypowered.api.proxy.InboundConnection
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.util.GameProfile
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  org.geysermc.floodgate.api.player.FloodgatePlayer
 */
package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_031;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_273;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_460;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_009;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_486;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_254;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_271;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_389;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_047;
import com.nickuc.login.NLoginCore_063;
import com.nickuc.login.NLoginCore_184;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_418;
import com.nickuc.login.NLoginCore_588;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.event.Continuation;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;
import com.velocitypowered.api.event.connection.LoginEvent;
import com.velocitypowered.api.event.connection.PreLoginEvent;
import com.velocitypowered.api.event.player.GameProfileRequestEvent;
import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.InboundConnection;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.util.GameProfile;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_266
implements NLoginInterface_029 {
    private static int gz;
    private static long z;
    private static long fc;
    private static int iz;
    private static long ah;
    private static long cv;
    private static long hm;
    private static long al;
    private static int fx;
    private static int is;
    private static int jf;
    private static int jn;
    private static long cg;
    private static long dg;
    private static int hg;
    private static long in;
    private static int cp;
    private static int ie;
    private static int el;
    private static int ge;
    private static long eq;
    private static long bp;
    private static long e;
    private static int by;
    private static long jp;
    private static int go;
    private static long ey;
    private static int ak;
    private static long cq;
    private static int jd;
    private static long ax;
    private static long h;
    private static int y;
    private static int bf;
    private static int fe;
    private static int var_int_a;
    private static long ij;
    private static int aa;
    private static int at;
    private static long ii;
    private static int bn;
    private static int ay;
    private static int ci;
    private static int dt;
    private static int ga;
    private static long cfr_renamed_0;
    private static int ai;
    private static long hb;
    private static int o;
    private static int fb;
    private static long en;
    private static long n;
    private static int ew;
    private static int cw;
    private static long aw;
    private static long ce;
    private static int bc;
    private static long hi;
    private static int dy;
    private static long jt;
    private static int hy;
    private static int hv;
    private static int jb;
    private static long ds;
    private static int l;
    private static long dz;
    private static long gi;
    private static long hl;
    private static int ho;
    private static int co;
    private static int ev;
    private static int er;
    private static int bb;
    private static int jc;
    private static long t;
    private static int fr;
    private static long hx;
    private static int du;
    private static int gq;
    private static long fn;
    private static long ek;
    private static int jm;
    private static int ja;
    private static int eu;
    private static int gp;
    private static long jh;
    private static int ec;
    private static int bi;
    private static long hf;
    private static int ap;
    private static long ib;
    private static int ed;
    private static int dx;
    private static int hd;
    private static int af;
    private static int ep;
    private static int gy;
    private static long q;
    private static long au;
    private static int jq;
    private static int fw;
    private static int hr;
    private static int ht;
    private static long var_long_g;
    private static int av;
    private static int bj;
    private static long bd;
    private static int gh;
    private static long gt;
    private static int cm;
    private static int fa;
    private static long dw;
    private static int fl;
    private static int da;
    private static int var_int_f;
    private static int u;
    private static int ik;
    private static int jr;
    private static int ac;
    private static int aq;
    private static long cr;
    private static long ez;
    private static int gd;
    private static long es;
    private static int fy;
    private static int iv;
    private static long dh;
    private static long ei;
    private static int ef;
    private static int gf;
    private static int var_int_c;
    private static int bz;
    private static long hw;
    private static int bq;
    private static int gr;
    private static long dk;
    private static int jk;
    private static long bh;
    private static int dj;
    private static int gl;
    private static long var_long_c;
    private static long cfr_renamed_1;
    private static String[] var_java_lang_String_arr_a;
    private static int bw;
    private static long bg;
    private static int cs;
    private static long bk;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_f;
    private static int ee;
    private static long x;
    private static int iy;
    private static long w;
    private static int bo;
    private static int gb;
    private static String[] var_java_lang_String_arr_b;
    private static long he;
    private static long gx;
    private static long ft;
    private static long fj;
    private static long as;
    private static long be;
    private static int ia;
    private static int id;
    private static int ct;
    private static int fi;
    private static int an;
    private static int jj;
    private static int ig;
    private static int ea;
    private static long ar;
    private static int hk;
    private static int df;
    private static int eh;
    private static int ip;
    private static int ic;
    private static int ex;
    private static long p;
    private static int io;
    private static int hs;
    private static long jo;
    private static int gm;
    private static int eg;
    private static int cb;
    private static int fd;
    private static int gw;
    private static int cy;
    private static long dl;
    private static int dm;
    private static long bs;
    private static int bt;
    private static long gk;
    private static int dr;
    private static long dp;
    private static int il;
    private static long k;
    private static long fg;
    private final NLoginType_008 G;
    private static long hu;
    private static long fq;
    private static int ag;
    private static int cc;
    private static int bx;
    private static int gg;
    private static long ch;
    private static int dc;
    private static int j;
    private static int hc;
    private static long cd;
    private static long s;
    private static long fu;
    private static int cf;
    private static int fv;
    private static long az;
    private static long cn;
    private static long bu;
    private static int cx;
    private static long ao;
    private static int r;
    private static int gc;
    private static int fs;
    private static long dv;
    private static int hj;
    private static int fm;
    private static int v;
    private static int eo;
    private static int i;
    private static int ih;
    private static int fp;
    private static long ae;
    private static int cl;
    private static int bl;
    private static long ji;
    private static int hn;
    private static int hh;
    private static long ad;
    private static long iu;
    private static long ha;
    private static long iq;
    private static long iw;
    private static int em;
    private static int ix;
    private static long ff;
    private static long bv;
    private static int hz;
    private static int db;
    private static long dd;
    private static long eb;
    private static int dn;
    private static long cz;
    private static long hq;
    private static long et;
    private static long ba;
    private static long ck;
    private static int bm;
    private static long it;
    private static long cu;
    private static int gn;
    private static int br;
    private static int ca;
    private static int fh;
    private static long fo;
    private static int gv;
    public static final AttributeKey<FloodgatePlayer> var_io_netty_util_AttributeKey_org_geysermc_floodgate_api_player_FloodgatePlayer__g;
    private static long gu;
    private static long aj;
    private static int im;
    private static int gj;
    private static int fz;
    private static long hp;
    private static long am;
    private static long ab;
    private static long m;
    private static long var_long_b;
    private static int gs;
    private static long ir;
    private static int js;
    private static int jg;
    private static long d;
    private static int di;
    private static int ej;
    private static int dq;
    private static int je;
    private static long de;
    private static int jl;
    private static long fk;
    private static int cj;

    static {
        var_int_a = 0 >>> 108 | 0 << ~108 + 1;
        var_long_b = Long.reverse(-8193380304166494787L);
        var_int_c = (0x2000000 >>> 89 | 0x2000000 << -89) & 0xFFFFFFFF;
        d = Long.reverse(-8337495492242350659L);
        e = Long.reverse(0x200000000000000L);
        var_int_f = Integer.reverse(0x40000000);
        var_long_g = Long.reverse(-8337495492242350659L);
        h = Long.reverse(0x200000000000000L);
        i = Integer.reverse(0);
        j = Integer.reverse(-1073741824);
        k = Long.reverse(-8193380304166494787L);
        l = Integer.reverse(0x20000000);
        m = Long.reverse(-8337495492242350659L);
        n = Long.reverse(0x200000000000000L);
        o = Integer.reverse(-1610612736);
        p = Long.reverse(-8337495492242350659L);
        q = Long.reverse(0x200000000000000L);
        r = 0x3000000 >>> 183 | 0x3000000 << -183;
        s = Long.reverse(-8337495492242350659L);
        t = Long.reverse(0x200000000000000L);
        u = (0 >>> 240 | 0 << ~240 + 1) & 0xFFFFFFFF;
        v = (0x7000000 >>> 24 | 0x7000000 << ~24 + 1) & 0xFFFFFFFF;
        w = Long.reverse(-8337495492242350659L);
        x = Long.reverse(0x200000000000000L);
        y = (2 >>> 190 | 2 << -190) & 0xFFFFFFFF;
        z = Long.reverse(-8193380304166494787L);
        aa = Integer.reverse(-1879048192);
        ab = Long.reverse(-8193380304166494787L);
        ac = Integer.reverse(0x50000000);
        ad = Long.reverse(-8337495492242350659L);
        ae = Long.reverse(0x200000000000000L);
        af = Integer.reverse(0);
        ag = 0x2C0000 >>> 82 | 0x2C0000 << ~82 + 1;
        ah = Long.reverse(-8193380304166494787L);
        ai = Integer.reverse(0x30000000);
        aj = Long.reverse(-8193380304166494787L);
        ak = Integer.reverse(-1342177280);
        al = Long.reverse(-8337495492242350659L);
        am = Long.reverse(0x200000000000000L);
        an = Integer.reverse(0x70000000);
        ao = Long.reverse(-8193380304166494787L);
        ap = (0 >>> 223 | 0 << -223) & 0xFFFFFFFF;
        aq = Integer.reverse(-268435456);
        ar = Long.reverse(-8337495492242350659L);
        as = Long.reverse(0x200000000000000L);
        at = (1024 >>> 102 | 1024 << ~102 + 1) & 0xFFFFFFFF;
        au = Long.reverse(-8193380304166494787L);
        av = Integer.reverse(-2013265920);
        aw = Long.reverse(-8337495492242350659L);
        ax = Long.reverse(0x200000000000000L);
        ay = Integer.reverse(0x48000000);
        az = Long.reverse(-8337495492242350659L);
        ba = Long.reverse(0x200000000000000L);
        bb = (0 >>> 41 | 0 << -41) & 0xFFFFFFFF;
        bc = Integer.reverse(-939524096);
        bd = Long.reverse(-8337495492242350659L);
        be = Long.reverse(0x200000000000000L);
        bf = Integer.reverse(0x28000000);
        bg = Long.reverse(-8337495492242350659L);
        bh = Long.reverse(0x200000000000000L);
        bi = Integer.reverse(-1476395008);
        bj = Integer.reverse(-1);
        bk = Long.reverse(-8193380304166494787L);
        bl = 0 >>> 244 | 0 << -244;
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = (22528 >>> 10 | 22528 << ~10 + 1) & 0xFFFFFFFF;
        bo = (-1 >>> 236 | -1 << ~236 + 1) & 0xFFFFFFFF;
        bp = Long.reverse(-8193380304166494787L);
        bq = Integer.reverse(-402653184);
        br = Integer.reverse(-1);
        bs = Long.reverse(-8193380304166494787L);
        bt = Integer.reverse(0x18000000);
        bu = Long.reverse(-8337495492242350659L);
        bv = Long.reverse(0x200000000000000L);
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = 0 >>> 45 | 0 << -45;
        by = 2048 >>> 75 | 2048 << -75;
        bz = (0 >>> 207 | 0 << -207) & 0xFFFFFFFF;
        ca = Integer.reverse(0x60000000);
        cb = (0 >>> 45 | 0 << -45) & 0xFFFFFFFF;
        cc = (0x320000 >>> 113 | 0x320000 << -113) & 0xFFFFFFFF;
        cd = Long.reverse(-8337495492242350659L);
        ce = Long.reverse(0x200000000000000L);
        cf = (0x68000000 >>> 186 | 0x68000000 << -186) & 0xFFFFFFFF;
        cg = Long.reverse(-8337495492242350659L);
        ch = Long.reverse(0x200000000000000L);
        ci = Integer.reverse(Integer.MIN_VALUE);
        cj = 0x1B00000 >>> 212 | 0x1B00000 << ~212 + 1;
        ck = Long.reverse(-8193380304166494787L);
        cl = Integer.reverse(0x40000000);
        cm = Integer.reverse(0x38000000);
        cn = Long.reverse(-8193380304166494787L);
        co = (0x60000000 >>> 157 | 0x60000000 << -157) & 0xFFFFFFFF;
        cp = Integer.reverse(-1207959552);
        cq = Long.reverse(-8337495492242350659L);
        cr = Long.reverse(0x200000000000000L);
        cs = 0x40000000 >>> 28 | 0x40000000 << -28;
        ct = (3840 >>> 71 | 3840 << ~71 + 1) & 0xFFFFFFFF;
        cu = Long.reverse(-8337495492242350659L);
        cv = Long.reverse(0x200000000000000L);
        cw = Integer.reverse(-1610612736);
        cx = (31744 >>> 234 | 31744 << ~234 + 1) & 0xFFFFFFFF;
        cy = (-1 >>> 224 | -1 << ~224 + 1) & 0xFFFFFFFF;
        cz = Long.reverse(-8193380304166494787L);
        da = Integer.reverse(0x60000000);
        db = 0 >>> 203 | 0 << ~203 + 1;
        dc = 8 >>> 222 | 8 << -222;
        dd = Long.reverse(-8337495492242350659L);
        de = Long.reverse(0x200000000000000L);
        df = Integer.reverse(-2080374784);
        dg = Long.reverse(-8337495492242350659L);
        dh = Long.reverse(0x200000000000000L);
        di = (16 >>> 100 | 16 << -100) & 0xFFFFFFFF;
        dj = (278528 >>> 173 | 278528 << ~173 + 1) & 0xFFFFFFFF;
        dk = Long.reverse(-8337495492242350659L);
        dl = Long.reverse(0x200000000000000L);
        dm = Integer.reverse(0x40000000);
        dn = Integer.reverse(-1006632960);
        cfr_renamed_1 = Long.reverse(-8337495492242350659L);
        dp = Long.reverse(0x200000000000000L);
        dq = Integer.reverse(-1073741824);
        dr = (0x480000 >>> 49 | 0x480000 << ~49 + 1) & 0xFFFFFFFF;
        ds = Long.reverse(-8193380304166494787L);
        dt = Integer.reverse(0x20000000);
        du = (0x940000 >>> 146 | 0x940000 << ~146 + 1) & 0xFFFFFFFF;
        dv = Long.reverse(-8337495492242350659L);
        dw = Long.reverse(0x200000000000000L);
        dx = 0x50000000 >>> 188 | 0x50000000 << ~188 + 1;
        dy = Integer.reverse(0x64000000);
        dz = Long.reverse(-8193380304166494787L);
        ea = Integer.reverse(-469762048);
        eb = Long.reverse(-8193380304166494787L);
        ec = Integer.reverse(Integer.MIN_VALUE);
        ed = Integer.reverse(0);
        ee = Integer.reverse(0);
        ef = Integer.reverse(Integer.MIN_VALUE);
        eg = (640 >>> 228 | 640 << ~228 + 1) & 0xFFFFFFFF;
        eh = Integer.reverse(-1);
        ei = Long.reverse(-8193380304166494787L);
        ej = Integer.reverse(-1811939328);
        ek = Long.reverse(-8193380304166494787L);
        el = Integer.reverse(0x54000000);
        em = Integer.reverse(-1);
        en = Long.reverse(-8193380304166494787L);
        eo = (0xAC0000 >>> 146 | 0xAC0000 << -146) & 0xFFFFFFFF;
        ep = Integer.reverse(-1);
        eq = Long.reverse(-8193380304166494787L);
        er = Integer.reverse(0x34000000);
        es = Long.reverse(-8337495492242350659L);
        et = Long.reverse(0x200000000000000L);
        eu = (0 >>> 91 | 0 << ~91 + 1) & 0xFFFFFFFF;
        ev = 10 >>> 33 | 10 << -33;
        ew = Integer.reverse(0);
        ex = (1744830465 >>> 123 | 1744830465 << -123) & 0xFFFFFFFF;
        ey = Long.reverse(-8337495492242350659L);
        ez = Long.reverse(0x200000000000000L);
        fa = 0x20000000 >>> 221 | 0x20000000 << ~221 + 1;
        fb = Integer.reverse(0x74000000);
        fc = Long.reverse(-8193380304166494787L);
        fd = (2 >>> 96 | 2 << -96) & 0xFFFFFFFF;
        fe = (385024 >>> 205 | 385024 << -205) & 0xFFFFFFFF;
        ff = Long.reverse(-8337495492242350659L);
        fg = Long.reverse(0x200000000000000L);
        fh = 0x30000000 >>> 188 | 0x30000000 << ~188 + 1;
        fi = Integer.reverse(0xC000000);
        fj = Long.reverse(-8337495492242350659L);
        fk = Long.reverse(0x200000000000000L);
        fl = Integer.reverse(0x20000000);
        fm = 0x62000000 >>> 121 | 0x62000000 << -121;
        fn = Long.reverse(-8337495492242350659L);
        fo = Long.reverse(0x200000000000000L);
        fp = Integer.reverse(0x4C000000);
        fq = Long.reverse(-8193380304166494787L);
        fr = (0 >>> 52 | 0 << ~52 + 1) & 0xFFFFFFFF;
        fs = (208896 >>> 140 | 208896 << -140) & 0xFFFFFFFF;
        ft = Long.reverse(-8337495492242350659L);
        fu = Long.reverse(0x200000000000000L);
        fv = (0x2000000 >>> 87 | 0x2000000 << -87) & 0xFFFFFFFF;
        fw = Integer.reverse(0);
        fx = Integer.reverse(Integer.MIN_VALUE);
        fy = 0x800000 >>> 118 | 0x800000 << -118;
        fz = Integer.reverse(-1073741824);
        ga = (65536 >>> 80 | 65536 << -80) & 0xFFFFFFFF;
        gb = Integer.reverse(0);
        gc = 0 >>> 185 | 0 << ~185 + 1;
        gd = Integer.reverse(0);
        ge = 0 >>> 232 | 0 << ~232 + 1;
        gf = 2 >>> 161 | 2 << -161;
        gg = 0 >>> 11 | 0 << ~11 + 1;
        gh = (416 >>> 35 | 416 << ~35 + 1) & 0xFFFFFFFF;
        gi = Long.reverse(-8193380304166494787L);
        gj = Integer.reverse(-1409286144);
        gk = Long.reverse(-8193380304166494787L);
        gl = (64 >>> 166 | 64 << ~166 + 1) & 0xFFFFFFFF;
        gm = Integer.reverse(0);
        gn = (0 >>> 83 | 0 << -83) & 0xFFFFFFFF;
        go = (1 >>> 128 | 1 << ~128 + 1) & 0xFFFFFFFF;
        gp = Integer.reverse(0);
        gq = Integer.reverse(0x60000000);
        gr = Integer.reverse(0);
        gs = Integer.reverse(0x6C000000);
        gt = Long.reverse(-8337495492242350659L);
        gu = Long.reverse(0x200000000000000L);
        gv = Integer.reverse(-335544320);
        gw = Integer.reverse(-1);
        gx = Long.reverse(-8193380304166494787L);
        gy = Integer.reverse(Integer.MIN_VALUE);
        gz = 224 >>> 98 | 224 << -98;
        ha = Long.reverse(-8337495492242350659L);
        hb = Long.reverse(0x200000000000000L);
        hc = (65536 >>> 207 | 65536 << ~207 + 1) & 0xFFFFFFFF;
        hd = 933888 >>> 238 | 933888 << ~238 + 1;
        he = Long.reverse(-8337495492242350659L);
        hf = Long.reverse(0x200000000000000L);
        hg = Integer.reverse(-1073741824);
        hh = (475136 >>> 173 | 475136 << -173) & 0xFFFFFFFF;
        hi = Long.reverse(-8193380304166494787L);
        hj = Integer.reverse(0x20000000);
        hk = Integer.reverse(-603979776);
        hl = Long.reverse(-8337495492242350659L);
        hm = Long.reverse(0x200000000000000L);
        hn = Integer.reverse(-1610612736);
        ho = Integer.reverse(0x3C000000);
        hp = Long.reverse(-8337495492242350659L);
        hq = Long.reverse(0x200000000000000L);
        hr = Integer.reverse(0x60000000);
        hs = Integer.reverse(0);
        ht = -402653183 >>> 219 | -402653183 << ~219 + 1;
        hu = Long.reverse(-8193380304166494787L);
        hv = Integer.reverse(0x7C000000);
        hw = Long.reverse(-8337495492242350659L);
        hx = Long.reverse(0x200000000000000L);
        hy = 262144 >>> 18 | 262144 << ~18 + 1;
        hz = Integer.reverse(-67108864);
        ia = (-1 >>> 198 | -1 << -198) & 0xFFFFFFFF;
        ib = Long.reverse(-8193380304166494787L);
        ic = (0x8000000 >>> 154 | 0x8000000 << ~154 + 1) & 0xFFFFFFFF;
        id = (0x400000 >>> 240 | 0x400000 << -240) & 0xFFFFFFFF;
        ie = -1 >>> 61 | -1 << -61;
        cfr_renamed_0 = Long.reverse(-8193380304166494787L);
        ig = Integer.reverse(-1073741824);
        ih = Integer.reverse(-2113929216);
        ii = Long.reverse(-8337495492242350659L);
        ij = Long.reverse(0x200000000000000L);
        ik = Integer.reverse(0x20000000);
        il = Integer.reverse(0x42000000);
        im = Integer.reverse(-1);
        in = Long.reverse(-8193380304166494787L);
        io = (0x40000001 >>> 62 | 0x40000001 << ~62 + 1) & 0xFFFFFFFF;
        ip = 1072 >>> 132 | 1072 << -132;
        iq = Long.reverse(-8337495492242350659L);
        ir = Long.reverse(0x200000000000000L);
        is = Integer.reverse(0x22000000);
        it = Long.reverse(-8337495492242350659L);
        iu = Long.reverse(0x200000000000000L);
        iv = Integer.reverse(0);
        iw = Long.reverse(1934296039955628032L);
        ix = Integer.reverse(Integer.MIN_VALUE);
        iy = 0 >>> 101 | 0 << -101;
        iz = Integer.reverse(0);
        ja = 0 >>> 183 | 0 << ~183 + 1;
        jb = (0 >>> 31 | 0 << -31) & 0xFFFFFFFF;
        jc = 0 >>> 254 | 0 << -254;
        jd = Integer.reverse(0);
        je = Integer.reverse(0);
        jf = (524288 >>> 47 | 524288 << -47) & 0xFFFFFFFF;
        jg = 0x14000001 >>> 218 | 0x14000001 << -218;
        jh = Long.reverse(-8337495492242350659L);
        ji = Long.reverse(0x200000000000000L);
        jj = (524288 >>> 243 | 524288 << ~243 + 1) & 0xFFFFFFFF;
        jk = (0 >>> 111 | 0 << ~111 + 1) & 0xFFFFFFFF;
        jl = Integer.reverse(Integer.MIN_VALUE);
        jm = Integer.reverse(0);
        jn = 0x8C0000 >>> 17 | 0x8C0000 << -17;
        jo = Long.reverse(-8337495492242350659L);
        jp = Long.reverse(0x200000000000000L);
        jq = 18432 >>> 40 | 18432 << ~40 + 1;
        jr = 9 >>> 93 | 9 << -93;
        js = (-1073741807 >>> 62 | -1073741807 << -62) & 0xFFFFFFFF;
        jt = Long.reverse(-8193380304166494787L);
        var_java_lang_String_arr_a = new String[jq];
        var_java_lang_String_arr_b = new String[jr];
        NLoginCore_266.b();
        var_long_g = (long)NLoginCore_389.a((String)NLoginCore_266.c("㺀", (int)js, (long)jt));
    }

    @Generated
    public NLoginCore_266(nLoginVelocity nLoginVelocity2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f = nLoginVelocity2;
        this.G = NLoginType_008;
    }

    @Subscribe
    public void a(LoginEvent loginEvent) {
        if (!loginEvent.getResult().isAllowed()) {
            return;
        }
        Player player = loginEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            Channel channel = this.G.com_nickuc_login_NLoginCore_581_b().a(loginEvent, player);
            String string = ((NLoginType_031)this.G.com_nickuc_login_NLoginCore_056_b()).a(NLoginCore_277, loginEvent, channel, player.isOnlineMode());
            if (string != null) {
                loginEvent.setResult(ResultedEvent.ComponentResult.denied((Component)NLoginCore_529.a(string)));
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_266.c("㺀", (int)ai, (long)aj) + loginEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺃", (int)ak, (long)(al ^ am)) + player.getUsername() + (String)NLoginCore_266.c("㺆", (int)an, (long)ao), throwable, new Object[ap]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_266.c("㺉", (int)aq, (long)(ar ^ as))));
        }
    }

    @Subscribe(order=PostOrder.LAST)
    public void a(GameProfileRequestEvent gameProfileRequestEvent) {
        Consumer<String> consumer = string -> NLoginCore_273.a(gameProfileRequestEvent.getConnection(), (Component)NLoginCore_529.a(string));
        try {
            this.a(gameProfileRequestEvent, consumer);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_266.c("㺀", (int)y, (long)z) + gameProfileRequestEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺃", (int)aa, (long)ab) + gameProfileRequestEvent.getUsername() + (String)NLoginCore_266.c("㺆", (int)ac, (long)(ad ^ ae)), throwable, new Object[af]);
            consumer.accept((String)NLoginCore_266.c("㺉", (int)ag, (long)ah));
        }
    }

    @Subscribe(order=PostOrder.LATE)
    public void a(PreLoginEvent preLoginEvent, Continuation continuation) {
        if (!preLoginEvent.getResult().isAllowed()) {
            continuation.resume();
            return;
        }
        try {
            this.b(preLoginEvent, continuation);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_266.c("㺀", (int)l, (long)(m ^ n)) + preLoginEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺃", (int)o, (long)(p ^ q)) + preLoginEvent.getUsername() + (String)NLoginCore_266.c("㺆", (int)r, (long)(s ^ t)), throwable, new Object[u]);
            preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a((String)NLoginCore_266.c("㺉", (int)v, (long)(w ^ x)))));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0xF88566F3C18328E2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), 69, (byte)(43 + 40), (byte)(36 + 11), 67, (byte)(44 + 22), (byte)(65 + 2), (byte)(18 + 29), (byte)(69 + 11), (byte)(21 + 54), (byte)(28 + 39), (byte)(71 + 12), (byte)(50 + 3), (byte)(30 + 50), (byte)(12 + 85), (byte)(68 + 32), (byte)(45 + 55), (byte)(47 + 58), (byte)(73 + 37), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣩࢺ࣢ࣦ࣎ࣛࣜࣵ", (byte)117, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_266.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Subscribe
    public void b(DisconnectEvent disconnectEvent) {
        Player player = disconnectEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f.java_lang_Object_b().a(player);
            ((NLoginType_031)this.G.com_nickuc_login_NLoginCore_056_b()).d(NLoginCore_277);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_266.c("㺀", (int)at, (long)au) + disconnectEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺃", (int)av, (long)(aw ^ ax)) + player.getUsername() + (String)NLoginCore_266.c("㺆", (int)ay, (long)(az ^ ba)), throwable, new Object[bb]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_266.c("㺉", (int)bc, (long)(bd ^ be))));
        }
    }

    @Subscribe(order=PostOrder.EARLY)
    public void a(PreLoginEvent preLoginEvent) {
        if (!preLoginEvent.getResult().isAllowed()) {
            return;
        }
        try {
            this.b(preLoginEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_266.c("㺀", (int)var_int_a, (long)var_long_b) + preLoginEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺃", (int)var_int_c, (long)(d ^ e)) + preLoginEvent.getUsername() + (String)NLoginCore_266.c("㺆", (int)var_int_f, (long)(var_long_g ^ h)), throwable, new Object[i]);
            preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a((String)NLoginCore_266.c("㺉", (int)j, (long)k))));
        }
    }

    private void b(PreLoginEvent preLoginEvent, Continuation continuation) {
        String string;
        InboundConnection inboundConnection = preLoginEvent.getConnection();
        Channel channel = NLoginCore_063.a(preLoginEvent, inboundConnection);
        if (channel == null) {
            preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)Component.text((String)((String)NLoginCore_266.c("㺀", (int)(bn & bo), (long)bp) + preLoginEvent.getClass().getCanonicalName() + (String)NLoginCore_266.c("㺃", (int)(bq & br), (long)bs)))));
            continuation.resume();
            return;
        }
        if (this.G.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        NLoginCore_271 NLoginCore_2712 = null;
        String string2 = null;
        UUID uUID = null;
        if (this.G.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a() instanceof NLoginCore_418 && channel.hasAttr((AttributeKey)var_long_g) && (string = (FloodgatePlayer)channel.attr((AttributeKey)var_long_g).get()) != null) {
            string2 = string.getCorrectUsername();
            uUID = string.getJavaUniqueId();
            NLoginCore_2712 = new NLoginCore_271((FloodgatePlayer)string);
        }
        string = string2 != null ? string2 : preLoginEvent.getUsername();
        InetAddress inetAddress = inboundConnection.getRemoteAddress().getAddress();
        NLoginCore_047 NLoginCore_0472 = BCryptHashProvider.c() != NLoginCore_555.var_com_nickuc_login_NLoginCore_555_f && inboundConnection.getProtocolVersion().compareTo((Enum)ProtocolVersion.MINECRAFT_1_19_1) >= 0 ? new NLoginCore_047(preLoginEvent.getUniqueId()) : null;
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            Object object;
            if (NLoginCore_2712 != null) {
                channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)new NLoginCore_588(null, null, NLoginCore_2712, NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b));
                continuation.resume();
                return;
            }
            Optional optional = inboundConnection.getVirtualHost();
            if (!optional.isPresent()) {
                continuation.resumeWithException((Throwable)new IllegalStateException((String)NLoginCore_266.c("㺆", (int)bt, (long)(bu ^ bv)) + string));
                return;
            }
            String string3 = ((InetSocketAddress)optional.get()).getHostName();
            NLoginCore_460 NLoginCore_4602 = NLoginCore_460.a(string3);
            if (!NLoginCore_4602.aQ() && NLoginCore_0472 != null) {
                NLoginCore_460 NLoginCore_4603 = NLoginCore_4602 = NLoginCore_0472.java_util_UUID_b() != null && NLoginCore_0472.a(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f) ? NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b : NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                if (NLoginCore_4602 == NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b) {
                    object = this.G.com_nickuc_login_NLoginCore_291_a().a(string, NLoginCore_0472.java_util_UUID_b(), bw != 0);
                    if (object == null) {
                        String string4 = NLoginCore_150.a(NLoginCore_374.w, new Object[bx]);
                        preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string4)));
                        continuation.resume();
                        return;
                    }
                    String string5 = ((ForceRegisterConfig)object).d(string);
                    NLoginCore_184 NLoginCore_1842 = NLoginCore_073.com_nickuc_login_NLoginCore_184_a(string5, inetAddress);
                    if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_c && ((ForceRegisterConfig)object).r() && !((ForceRegisterConfig)object).t()) {
                        NLoginCore_073.a(this.G, string5, inetAddress, NLoginCore_184.var_com_nickuc_login_NLoginCore_184_b);
                        if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_e) {
                            NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                        }
                    }
                }
            }
            if (!NLoginCore_4602.aQ() && this.G.com_nickuc_login_NLoginCore_495_a().p()) {
                NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
            }
            channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)new NLoginCore_588(null, null, null, NLoginCore_4602));
            switch (NLoginCore_486.W[NLoginCore_4602.ordinal()]) {
                case 1: {
                    preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.forceOnlineMode());
                    break;
                }
                case 2: {
                    preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.forceOfflineMode());
                    break;
                }
                case 3: {
                    Object[] objectArray = new Object[by];
                    objectArray[NLoginCore_266.bz] = string3;
                    object = NLoginCore_150.a(NLoginCore_374.Z, objectArray);
                    preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a((String)object)));
                    continuation.resume();
                    return;
                }
                case 4: {
                    if (NLoginCore_150.j()) {
                        String[] stringArray = new String[ca];
                        stringArray[NLoginCore_266.cb] = (String)NLoginCore_266.c("㺉", (int)cc, (long)(cd ^ ce)) + string3 + (String)NLoginCore_266.c("㺌", (int)cf, (long)(cg ^ ch));
                        stringArray[NLoginCore_266.ci] = NLoginCore_266.c("㺏", (int)cj, (long)ck);
                        stringArray[NLoginCore_266.cl] = NLoginCore_266.c("㺒", (int)cm, (long)cn);
                        stringArray[NLoginCore_266.co] = NLoginCore_266.c("㺕", (int)cp, (long)(cq ^ cr));
                        stringArray[NLoginCore_266.cs] = NLoginCore_266.c("㺘", (int)ct, (long)(cu ^ cv));
                        stringArray[NLoginCore_266.cw] = NLoginCore_266.c("㺛", (int)(cx & cy), (long)cz);
                        object = NLoginCore_112.a(stringArray);
                    } else {
                        String[] stringArray = new String[da];
                        stringArray[NLoginCore_266.db] = (String)NLoginCore_266.c("㺞", (int)dc, (long)(dd ^ de)) + string3 + (String)NLoginCore_266.c("㺡", (int)df, (long)(dg ^ dh));
                        stringArray[NLoginCore_266.di] = NLoginCore_266.c("㺤", (int)dj, (long)(dk ^ dl));
                        stringArray[NLoginCore_266.dm] = NLoginCore_266.c("㺧", (int)dn, (long)(cfr_renamed_1 ^ dp));
                        stringArray[NLoginCore_266.dq] = NLoginCore_266.c("㺪", (int)dr, (long)ds);
                        stringArray[NLoginCore_266.dt] = NLoginCore_266.c("㺭", (int)du, (long)(dv ^ dw));
                        stringArray[NLoginCore_266.dx] = NLoginCore_266.c("㺰", (int)dy, (long)dz);
                        object = NLoginCore_112.a(stringArray);
                    }
                    preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a((String)object)));
                    continuation.resume();
                    return;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_266.c("㺳", (int)ea, (long)eb) + (Object)((Object)NLoginCore_4602));
                }
            }
            continuation.resume();
        } else {
            ForceRegisterConfig ForceRegisterConfig2 = this.G.com_nickuc_login_NLoginCore_291_a().a(string, null, uUID, ec != 0);
            if (ForceRegisterConfig2 == null) {
                String string6 = NLoginCore_150.a(NLoginCore_374.w, new Object[ed]);
                preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string6)));
                continuation.resume();
                return;
            }
            if (!this.G.com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig2, string)) {
                String string7 = NLoginCore_150.a(NLoginCore_374.w, new Object[ee]);
                preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string7)));
                continuation.resume();
                return;
            }
            String string8 = ForceRegisterConfig2.d(string);
            channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)new NLoginCore_588(ForceRegisterConfig2, string8, NLoginCore_2712, null));
            if (NLoginCore_2712 == null) {
                this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f.a(ef != 0).a(() -> {
                    try {
                        NLoginCore_009 NLoginCore_0092 = this.G.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, string8, inetAddress, NLoginCore_0472);
                        switch (NLoginCore_486.X[NLoginCore_0092.ordinal()]) {
                            case 1: {
                                Object[] objectArray = new Object[jj];
                                objectArray[NLoginCore_266.jk] = string8;
                                String string2 = NLoginCore_150.a(NLoginCore_374.aa, objectArray);
                                preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string2)));
                                break;
                            }
                            case 2: {
                                Object[] objectArray = new Object[jl];
                                objectArray[NLoginCore_266.jm] = string8;
                                String string3 = NLoginCore_150.a(NLoginCore_374.ab, objectArray);
                                preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string3)));
                                break;
                            }
                            case 3: {
                                preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.forceOnlineMode());
                                break;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                throw new UnsupportedOperationException((String)NLoginCore_266.c("㺀", (int)jn, (long)(jo ^ jp)) + (Object)((Object)NLoginCore_0092));
                            }
                        }
                        continuation.resume();
                    }
                    catch (Throwable throwable) {
                        continuation.resumeWithException(throwable);
                    }
                });
            } else {
                continuation.resume();
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_266.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.A("ŗŹŻśſƞƖƬƘŧƥƛƩƣŬƑƳƲƪưƪſ", (byte)88, 65), NLoginCore_266.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣩࢺ࣢ࣦ࣎ࣛࣜࣵէ", (byte)88, 69) + string + NLoginCore_110.A("ũ", (byte)88, 65) + methodType.toString(), exception);
        }
    }

    private void a(GameProfileRequestEvent gameProfileRequestEvent, Consumer<String> consumer) {
        Object object;
        NLoginCore_509 NLoginCore_5092;
        String string;
        String string2;
        String string3;
        Object string10;
        Object n;
        boolean bl;
        InboundConnection inboundConnection = gameProfileRequestEvent.getConnection();
        InetSocketAddress inetSocketAddress = inboundConnection.getRemoteAddress();
        Channel channel = NLoginCore_063.a(gameProfileRequestEvent, inboundConnection);
        if (channel == null) {
            consumer.accept((String)NLoginCore_266.c("㺀", (int)(eg & eh), (long)ei) + gameProfileRequestEvent.getClass().getCanonicalName() + (String)NLoginCore_266.c("㺃", (int)ej, (long)ek));
            return;
        }
        if (this.G.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
        if (NLoginCore_5882 == null) {
            String string4 = (String)NLoginCore_266.c("㺆", (int)(el & em), (long)en) + gameProfileRequestEvent.getUsername() + (String)NLoginCore_266.c("㺉", (int)(eo & ep), (long)eq) + gameProfileRequestEvent.getClass().getSimpleName() + (String)NLoginCore_266.c("㺌", (int)er, (long)(es ^ et));
            NLoginCore_370.c(string4, new Object[eu]);
            String[] stringArray = new String[ev];
            stringArray[NLoginCore_266.ew] = NLoginCore_266.c("㺏", (int)ex, (long)(ey ^ ez));
            stringArray[NLoginCore_266.fa] = NLoginCore_266.c("㺒", (int)fb, (long)fc);
            stringArray[NLoginCore_266.fd] = (String)NLoginCore_266.c("㺕", (int)fe, (long)(ff ^ fg)) + string4;
            stringArray[NLoginCore_266.fh] = NLoginCore_266.c("㺘", (int)fi, (long)(fj ^ fk));
            stringArray[NLoginCore_266.fl] = NLoginCore_266.c("㺛", (int)fm, (long)(fn ^ fo));
            consumer.accept(NLoginCore_112.a(stringArray));
            return;
        }
        GameProfile gameProfile = gameProfileRequestEvent.getGameProfile();
        GameProfile gameProfile2 = gameProfileRequestEvent.getOriginalProfile();
        String string5 = gameProfile.getName();
        UUID uUID = gameProfileRequestEvent.isOnlineMode() ? gameProfile2.getId() : null;
        UUID uUID2 = NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null ? NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a.a.getJavaUniqueId() : null;
        String string6 = gameProfile2.getName();
        if (uUID != null && NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null) {
            throw new IllegalStateException((String)NLoginCore_266.c("㺞", (int)fp, (long)fq));
        }
        NLoginCore_291 NLoginCore_2912 = this.G.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5882.var_com_nickuc_login_ForceRegisterConfig_f;
        int bl2 = fr;
        if (uUID != null) {
            if (ForceRegisterConfig2 != null && ForceRegisterConfig2.getMojangId() != null && !uUID.equals(ForceRegisterConfig2.getMojangId())) {
                Object[] objectArray = new Object[fv];
                objectArray[NLoginCore_266.fw] = ForceRegisterConfig2.getMojangId();
                objectArray[NLoginCore_266.fx] = uUID;
                objectArray[NLoginCore_266.fy] = ForceRegisterConfig2.i();
                objectArray[NLoginCore_266.fz] = string6;
                NLoginCore_370.b((String)NLoginCore_266.c("㺡", (int)fs, (long)(ft ^ fu)), objectArray);
                ForceRegisterConfig2 = null;
                bl = ga;
            }
            if ((n = NLoginCore_2912.a(string6, uUID, null, gb != 0)) == null) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[gc]));
                return;
            }
            if (ForceRegisterConfig2 == null || ((ForceRegisterConfig)n).r()) {
                ForceRegisterConfig2 = n;
            }
        }
        if ((ForceRegisterConfig2 == null || NLoginCore_5882.ci == null) && (ForceRegisterConfig2 = NLoginCore_2912.a(string5, uUID, uUID2, gd != 0)) == null) {
            n = NLoginCore_150.a(NLoginCore_374.w, new Object[ge]);
            consumer.accept((String)n);
            return;
        }
        int n2 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar();
        if (n2 == (NLoginCore_5882.var_com_nickuc_login_NLoginCore_460_a == null ? gf : gg)) {
            Object string22 = NLoginCore_266.c("㺤", (int)gh, (long)gi);
            consumer.accept((String)string22);
            return;
        }
        if (NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a == null && n2 != 0) {
            string10 = inboundConnection.getVirtualHost();
            if (!((Optional)string10).isPresent()) {
                throw new IllegalStateException((String)NLoginCore_266.c("㺧", (int)gj, (long)gk) + string5);
            }
            string3 = ((InetSocketAddress)((Optional)string10).get()).getHostName();
            switch (NLoginCore_486.W[NLoginCore_5882.var_com_nickuc_login_NLoginCore_460_a.ordinal()]) {
                case 1: {
                    string2 = string5;
                    string = BCryptHashProvider.g(string2, gl != 0);
                    break;
                }
                case 2: {
                    if (!this.G.com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig2, string5)) {
                        String string8 = NLoginCore_150.a(NLoginCore_374.w, new Object[gm]);
                        consumer.accept(string8);
                        return;
                    }
                    string2 = ForceRegisterConfig2.d(string5);
                    string = BCryptHashProvider.g(string2, gn != 0);
                    break;
                }
                case 3: {
                    Object[] objectArray = new Object[go];
                    objectArray[NLoginCore_266.gp] = string3;
                    String string9 = NLoginCore_150.a(NLoginCore_374.Z, objectArray);
                    consumer.accept(string9);
                    return;
                }
                case 4: {
                    String NLoginCore_277;
                    if (NLoginCore_150.j()) {
                        String[] stringArray = new String[gq];
                        stringArray[NLoginCore_266.gr] = (String)NLoginCore_266.c("㺪", (int)gs, (long)(gt ^ gu)) + string3 + (String)NLoginCore_266.c("㺭", (int)(gv & gw), (long)gx);
                        stringArray[NLoginCore_266.gy] = NLoginCore_266.c("㺰", (int)gz, (long)(ha ^ hb));
                        stringArray[NLoginCore_266.hc] = NLoginCore_266.c("㺳", (int)hd, (long)(he ^ hf));
                        stringArray[NLoginCore_266.hg] = NLoginCore_266.c("㺶", (int)hh, (long)hi);
                        stringArray[NLoginCore_266.hj] = NLoginCore_266.c("㺹", (int)hk, (long)(hl ^ hm));
                        stringArray[NLoginCore_266.hn] = NLoginCore_266.c("㺼", (int)ho, (long)(hp ^ hq));
                        NLoginCore_277 = NLoginCore_112.a(stringArray);
                    } else {
                        String[] stringArray = new String[hr];
                        stringArray[NLoginCore_266.hs] = (String)NLoginCore_266.c("㺿", (int)ht, (long)hu) + string3 + (String)NLoginCore_266.c("㻂", (int)hv, (long)(hw ^ hx));
                        stringArray[NLoginCore_266.hy] = NLoginCore_266.c("㻅", (int)(hz & ia), (long)ib);
                        stringArray[NLoginCore_266.ic] = NLoginCore_266.c("㻈", (int)(id & ie), (long)cfr_renamed_0);
                        stringArray[NLoginCore_266.ig] = NLoginCore_266.c("㻋", (int)ih, (long)(ii ^ ij));
                        stringArray[NLoginCore_266.ik] = NLoginCore_266.c("㻎", (int)(il & im), (long)in);
                        stringArray[NLoginCore_266.io] = NLoginCore_266.c("㻑", (int)ip, (long)(iq ^ ir));
                        NLoginCore_277 = NLoginCore_112.a(stringArray);
                    }
                    consumer.accept(NLoginCore_277);
                    return;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_266.c("㻔", (int)is, (long)(it ^ iu)) + (Object)((Object)NLoginCore_5882.var_com_nickuc_login_NLoginCore_460_a));
                }
            }
        } else if (uUID != null || NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null) {
            string2 = string = string5;
        } else {
            if (!this.G.com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig2, string5)) {
                String string4 = NLoginCore_150.a(NLoginCore_374.w, new Object[iv]);
                consumer.accept(string4);
                return;
            }
            string2 = string = ForceRegisterConfig2.d(string5);
        }
        channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)NLoginCore_5882.a(ForceRegisterConfig2, string2));
        string10 = inetSocketAddress.getAddress();
        string3 = ((InetAddress)string10).getHostAddress();
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_f.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 != null && NLoginCore_277.R()) {
            NLoginCore_5092 = this.G.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
            int string11 = NLoginCore_5092 != null && System.currentTimeMillis() - NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_h, Long.valueOf(0L)) > iw ? ix : iy;
            object = NLoginCore_150.a(NLoginCore_374.Y, new Object[iz]);
            if (string11 != 0 && (NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null || NLoginCore_532.L.ar() && (((InetAddress)string10).equals(NLoginCore_277.java_net_InetSocketAddress_b().getAddress()) || string3.equals(ForceRegisterConfig2.k())))) {
                NLoginCore_277.a((String)object);
            } else {
                consumer.accept((String)object);
                return;
            }
        }
        if (NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null) {
            UUID uUID4;
            if (this.G.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, NLoginCore_532.J)) {
                return;
            }
            if (this.G.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, NLoginCore_532.R)) {
                return;
            }
            if (!NLoginCore_2912.a(ForceRegisterConfig2, NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a.a.getJavaUniqueId(), string2, string3)) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[ja]));
                return;
            }
            if (!this.G.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a().J() && !ForceRegisterConfig2.u()) {
                if (!this.G.com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig2, string2)) {
                    String uUID3 = NLoginCore_150.a(NLoginCore_374.w, new Object[jb]);
                    consumer.accept(uUID3);
                    return;
                }
                string = ForceRegisterConfig2.d(string2);
                if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                    string = BCryptHashProvider.g(string, ForceRegisterConfig2.t());
                }
            }
            NLoginCore_5092 = new GameProfile((uUID4 = ForceRegisterConfig2.java_util_UUID_a()) != null && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_m.ar() ? uUID4 : gameProfile.getId(), string, gameProfile.getProperties());
        } else if (uUID != null) {
            if (this.G.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, NLoginCore_532.I)) {
                return;
            }
            if (this.G.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, NLoginCore_532.Q)) {
                return;
            }
            if (!NLoginCore_2912.a(ForceRegisterConfig2, uUID, string2, string3, bl)) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[jc]));
                return;
            }
            NLoginCore_5092 = new GameProfile(ForceRegisterConfig2.java_util_UUID_a(), string, gameProfile.getProperties());
        } else {
            if (this.G.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, null)) {
                return;
            }
            if (this.G.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, null)) {
                return;
            }
            UUID uUID3 = NLoginCore_432.d(string2);
            object = ForceRegisterConfig2.java_util_UUID_a();
            if (object == null && (ForceRegisterConfig2.boolean_h() || BCryptHashProvider.com_nickuc_login_NLoginCore_254_a() == NLoginCore_254.var_com_nickuc_login_NLoginCore_254_b)) {
                object = NLoginCore_432.a(string2, uUID3);
                ForceRegisterConfig2.a((UUID)object);
                if (!NLoginCore_2912.a(ForceRegisterConfig2, new NLoginCore_436[jd])) {
                    consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[je]));
                    return;
                }
            }
            NLoginCore_5092 = new GameProfile((UUID)(object != null ? object : uUID3), string, gameProfile.getProperties());
        }
        if (NLoginCore_5092.getName().length() > jf) {
            throw new IllegalArgumentException((String)NLoginCore_266.c("㻗", (int)jg, (long)(jh ^ ji)) + NLoginCore_5092.getName());
        }
        gameProfileRequestEvent.setGameProfile((GameProfile)NLoginCore_5092);
    }

    private static void b() {
        int n;
        var_long_c = -4775330558624214479L;
        long l = var_long_c ^ 0xF88566F3C18328E2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(24 + 45), (byte)(44 + 39), (byte)(30 + 17), 67, (byte)(44 + 22), (byte)(48 + 19), (byte)(10 + 37), (byte)(4 + 76), (byte)(14 + 61), (byte)(43 + 24), 83, (byte)(50 + 3), (byte)(17 + 63), (byte)(74 + 23), (byte)(36 + 64), (byte)(85 + 15), (byte)(5 + 100), (byte)(33 + 77), (byte)(54 + 49)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_266.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[4] = NLoginCore_110.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[5] = NLoginCore_324.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[6] = NLoginCore_451.C("ѰѠіѠѥяѴїѡѦ҆ё", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[8] = NLoginCore_559.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[9] = NLoginCore_138.B("ěÿäćāĒĉĶĂčöĮĭļðćĕĻĠŀĿŃĊċ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[10] = NLoginCore_004.A("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[11] = NLoginCore_384.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҐӋӅҳӌҤҚӉұӁӠ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[12] = NLoginCore_324.B("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĝĵĺĴġħļĔĖĉā", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[13] = NLoginCore_559.C("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[14] = NLoginCore_446.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[15] = NLoginCore_091.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[16] = NLoginCore_173.D("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѯ҇Ҍ҆ѳѹҎѦѨћѓ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[17] = NLoginCore_110.D("ѭёжљѓѤћ҈єџшҀѿҎтљѧҍѲҒґҕќѝ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[18] = NLoginCore_076.B("ĞĎĄĎēýĢąďĔĴÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[19] = NLoginCore_427.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢľŹųšźŒňŷşůƎ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[20] = NLoginCore_575.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦԿեՊծԵԳԶկԵԷՓՀ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[21] = NLoginCore_092.F("ՌԣՃԪԧԷՈԩՂԙԯԠ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[22] = NLoginCore_384.D("ёѴѓѥѰнњѧѨѤҌҁрҋѭщўё҃ѵҗѵ҄Ґ҃эѲҎҘіҎїѰҖѻҟѦѤѧҠѦѨ҄ѱ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[23] = NLoginCore_384.A("īĂĢĉĆĖħĈġøĎÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[24] = NLoginCore_559.A("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[25] = NLoginCore_427.B("ùīñąîĩėčąġĪĳėĐčĵĽĺčďġĖĿĆĿĻğėňĻŉğĢěđįĆŀĐĥŅĖŅńĺŏĹĶķŝĻīğĽĪī", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[26] = NLoginCore_384.C("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫҟұӍҲҹҫҹҧӀӒӗ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[27] = NLoginCore_223.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[28] = NLoginCore_091.E("ԡՑԞԔԽՈԪԣԕՑ՘ՌԗՏՈՠԙԜՀբԵԠՠ՘ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚՗յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ֐զժհ֘՚՜֒՞ղպ֋խջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊֋֬և֦֭֮֕֏ր", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[29] = NLoginCore_173.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[30] = NLoginCore_223.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŲļŕƁœŗŤžƈńũ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[31] = NLoginCore_076.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[32] = NLoginCore_575.B("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįŔĤňţŜķĨŬŚŠĸ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[33] = NLoginCore_027.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[34] = NLoginCore_387.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[35] = NLoginCore_223.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[36] = NLoginCore_451.E("ԣԑԉՔՁԌՏՅՈԶԧԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[37] = NLoginCore_324.C("јѯіуѻєтѱс҈ѪѼѼ҇҉чѱѯѵҊѥѰѱѨѷѷѵќњѰѸѲѡҖґҀҟўѴѵҪѪҬҨѫҍҚѯѱ҄ҮҭҨѰҥғҫҌѼҕҒѻҮҘҚӂҶҺҸѹҞҹҘҤҽҭҸӍҰҹҮҴҡӀҎҨґӆӉҫӈҶӞұҹғ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[38] = NLoginCore_223.E("ՁՊԐԮՅՄՋԬՂՈ՗ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ֐՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[39] = NLoginCore_324.F("ՒՈՋԞԪՈԯՔՎ՚Թ՚ՇԧԛԶԿՊ՟՝ՅԾԫԬ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[40] = NLoginCore_427.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĞńĩōĔĒĕŎĔĖĲğ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[41] = NLoginCore_559.D("ѽєѴћјѨѹњѳъѠё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[42] = NLoginCore_173.E("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ՘՚ԧգՅ՚ՏՀՃԮկ԰ՠնԯիԴնյվչոց՞ԿՂՕզճցոՙժՙ։ւգ֑", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[43] = NLoginCore_387.A("ĎąČđæīįĲĆďõÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[44] = NLoginCore_173.C("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҞҘѦҏҬҡғѫҰѲѶҥѼѽ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[45] = NLoginCore_027.A("ùīñąîĩėčąġīĭĹĜčõòĪĮıľŃĊċ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[46] = NLoginCore_027.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[47] = NLoginCore_384.C("й҃јѿѿѶ҃ѵѹѾ҆ё", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[48] = NLoginCore_091.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[49] = NLoginCore_575.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ՘ԩՑխՐՑէղՏլգՓմԷԷզ՝էԶծՕՏԻՎ՞ՋՌ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[50] = NLoginCore_076.A("ĂāĢýĕîĲĬñħİûċĦĎñĐĿÿġāþŀĖĘńŉĽĝĺńĽıĤĜōňįĵĿėŖđĪĨņĺĭŠŀłĺŗĻŔįŕŦĦĿĪŪŉĸĨšĮšŀĭůůĴŚŃŦųŲķžňŹŰŖŒōŊŋ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[51] = NLoginCore_091.D("йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԲԲԂӻԷԼԼԟԠՉՂԑ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[52] = NLoginCore_223.B("ıħĪýĉħĎĳĭĹėćùĪĮùįÿģĹęĠĤĺćĜňĈĵŁĺĮĂŇŃňŅŀĈńĩĔĦİŜĚŗīĜĠŚŠĺŗģęņĢĺœŦĶŠŁŬģĭňŦŭĿłŏũŎĿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[53] = NLoginCore_223.B("ċçĠįĲĊĊĉīĩĸùõĘĳĸĖĹďĬĿęÿğēıĜĵńĬĥĜňŊŎİľćōĕħőĲğ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[54] = NLoginCore_223.F("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ԰ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզե՛հ՚՗՘վ՜ՌՀ՞ՋՌ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[55] = NLoginCore_091.A("ìīĠĉčĕįāĴģĩíĪĽĮęĵĺĝĲĜĺąþłąĨąŉŊĿŊŋĺŎŇĪēŔĨŌŐĸļŌŜĔėĝİŁęĜŔĠİŢŠšŕļŪŘŏŪŋņŇšŅŦŠŕĹœŬŔŐĴŕůūūłřōşŻŠŧřŧŕŮƀƅ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[56] = NLoginCore_324.A("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[57] = NLoginCore_138.E("ԡՑԞԔԽՈԪԣԕՑ՘ՌԗՏՈՠԙԜՀբԵԠՠ՘ԦԧՊԦբիժթթՁեԦՋխԴթԵզՃռԵըՌ՚՗յսԺկոՂ՞աֆՖ՚ՙֆփ՛՝ճ՜ՋՑբ֐զժհ֘՚՜֒՞ղպ֋խջՠ֚ն֦ցֆռ֕փ֛փ֑֍֩֊֋֬և֦֭֮֕֏ր", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[58] = NLoginCore_427.C("єтк҅ѲнҀѶѹѧјё", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[59] = NLoginCore_091.F("ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ՗ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ՗ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛֌ըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓՝ն֢մոօ֟֩ե֊", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[60] = NLoginCore_559.F("ՁՊԐԮՅՄՋԬՂՈ՗ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզձ֐՛՝ֆ֖ըց։Օ֑ՠ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[61] = NLoginCore_324.C("ыѽуїрѻѩџїѳѻфѪѬҁљ҂Ҁ҆Ѯэ҆ҋ҉ѓѷѺҊѬғјҀҗңҝҔѵҔ҃҂ѵҌѬѼҚҋѬҨ҃ҳѾҦҁҦѶҚҵҮ҉ѺҾҬҲҊ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[62] = NLoginCore_575.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵŔŨŹŎľųŮůŐŢŚŝŊŋ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[63] = NLoginCore_446.B("ĂðèĳĠëĮĤħĕĆÿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[64] = NLoginCore_027.A("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁŤżƀľŒŧƀłŽŌŸ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[65] = NLoginCore_173.D("єтк҅ѲнҀѶѹѧјё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[66] = NLoginCore_138.A("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŖĿŴŷřŶŤƌşŧŁ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[67] = NLoginCore_027.B("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŐůĺļťŵŇŠŨĴŰĿ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[68] = NLoginCore_384.D("҃ѹѼяћѹѠ҅ѿҋѪҋѸјьѧѰѻҐҎѶѯќѝ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[69] = NLoginCore_384.B("ýĪÿĜĤĝĲĆĐćČõĴöĲľĺĉĳĬĞĂŁăŁĆĹģŌĮČņĦłĬĜńłŖŐĸĥđėĹŔĘĬŊęīĴĴĭĪī", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[70] = NLoginCore_027.A("ġĈĲąĮíĈħôģđįĚċććĭġĻŁČęıħĄĕĖĦğģĉĿĞĻĽĨŒĕŇĉĢĒęğ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[71] = NLoginCore_223.E("ԐԑՂԎԭԍԧԤԋԪՋՉԗՕԽԼԚՐԠՐԯՅԥթԴԿԣգծՎԻԢ", (byte)28, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_266.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԤԠԒԆ԰ԑՊՉԮՆՊՙԼԖ՗ՁԼԽՋԽԥՑԯՕԧԷՉըԟԬկԬՀխգՓէՄկթԹՆ՛Հ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[1] = NLoginCore_575.F("ԼԠԅԨԢԳԪ՗ԣԮԗԶԲԔՈԗ՘ՒԣԢ՞ԾԫԬ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[2] = NLoginCore_201.E("ԟԪԬՇՉՇԤՖՓԯԫԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ԚՌԒԦԏՊԸԮԦՂՌԸԼԚՒ԰Պ՚ԹԡԯԷՁՕԱԳզԪԨԺա՞Ԫ՟զզ՟ԮՆ՗էհՒՇծԹԷհԷրՂ՛գՂՐվէ֊՟ՖՕբխզց֋բբ֕Ք֕ոՓդ֜՗մ֎՗՟֤֜֕֘փա֖֔֠ֈ֚րս֣ա֮ր֏֏ի֞֋ֆ֋֍֙֏ր", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[4] = NLoginCore_110.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĲĲĀĚĂĶŉĜĖČĩ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[5] = NLoginCore_559.C("ѭёжљѓѤћ҈єџчҊрѭъѹѪѫээ҃ҕќѝ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[6] = NLoginCore_223.E("ՇԑԿԆԡԖՔԱԣՏԯԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҔҵҢҺҼҬҕӝәҨҜҡӡӃҗӀҤҦӕҸӫӢұ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[8] = NLoginCore_027.C("ѕёузѡтѻѺџѷѻҊѭч҈ѲѭѮѼѮіѸђј҅҆ҘѼ҇ѽѰҒҋѾѽѭҖѷҞѺҫѻҀѱ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[9] = NLoginCore_223.A("ěÿäćāĒĉĶĂčøĊĸĥĊĊčĚüīęĳĊċ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[10] = NLoginCore_201.E("ՊԚՆՀԎԞԷՇԣՅԣԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[11] = NLoginCore_091.D("ыѽуїрѻѩџїѳѽѩѭы҃ѡѻҋѪђѠѨѲ҆ѢѤҗћљѫҒҏћҐҗҗҐџѷ҈Ҙҡ҃ѸҟѪѨҡѨұѳҌҔѳҁүҘһҐ҇҆ғҞҗҲҼғғӆ҅ӆҩ҄ҕӍ҈ҥҿ҈ҐӍӆӕӉҴҍҷҳӚӌҕҺҙҰӎұҡҠҮҢӟӝӨҢӖҺңұ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[12] = NLoginCore_201.A("ăÿñåďðĩĨčĥĩĸěõĶĠěĜĪĜĄĦēńĳĲĄĄŊķĠļōĬļŀħēĴĭēēĲğ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[13] = NLoginCore_575.E("ԼԠԅԨԢԳԪ՗ԣԮԙ՛ԵԼՒԘԮՌՁՃԮԮԫԬ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[14] = NLoginCore_004.A("ąñāđĜĔĨēĦčùÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[15] = NLoginCore_223.B("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢŀŁšřŤşŵňŖƏŪŋŤŦŌŵƅƊƗƆŬŶş", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[16] = NLoginCore_223.E("ԤԠԒԆ԰ԑՊՉԮՆՊՙԼԖ՗ՁԼԽՋԽԥՓ՞ՈեԨԫՀԨԩՐԧը՛ՑԾդ՟ՠիլեեՀ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[17] = NLoginCore_201.B("ěÿäćāĒĉĶĂčøČĄôõþò÷ĮĴĝŃĊċ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[18] = NLoginCore_027.F("ԍԨԤԞՔ԰՗԰ԭՔԷԠ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[19] = NLoginCore_384.A("ùīñąîĩėčąġīėěùıďĩĹĘĀĎĖĠĴĐĒŅĉćęŀĽĉľŅŅľčĥĶņŏıĦōĘĖŏĖşġĺłġįŝņũľĵĴŁŌŅŠŪŁŁŴĳŴŗĲŃŻĶœŭĶľŻŴƃŷŢļƀƂżŉŊžŵƅťƅźŢŻŠƌƄœƎŤœƄş", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[20] = NLoginCore_223.B("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąĆăįČĎŇŌĮėĲĦŉńŞĦřŎőİŏĴœĪī", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[21] = NLoginCore_559.A("ıãýíĥĵĕđĦðčđûħýĝĻġĲĂėčĊċ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[22] = NLoginCore_453.F("ԠՃԢԴԿԌԩԶԷԳ՛Րԏ՚ԼԘԭԠՒՄզՄՓ՟ՒԜՁ՝էԥ՝ԦաՓՃզԽկլՄկՎյՒՐ՚լՠԽՊղՠտքՋՌ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[23] = NLoginCore_092.E("ԑԛԩՀՒԓԉԎԲՙԒ՛ԗԼՠԵԬԢԿԜՏդԫԬ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮҠҖ҄ѭҜҧҚҝѠѢ҅ѵѭҝҋѱҥѼҎѯҭѿѼѽ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[25] = NLoginCore_138.E("ԚՌԒԦԏՊԸԮԦՂՋՔԸԱԮՖ՞՛Ԯ԰ՂԷՠԧՠ՜ՀԸթ՜ժՀՃԼԲՐԧաԱՆզԷզԵոզԻՏՙշյփ՚ՆԹՄէՀՄվՕ֍վզ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[26] = NLoginCore_138.F("ԍՌՁԪԮԶՐԢՕՄՊԎՋ՞ՏԺՖ՛ԾՓԽ՛ԦԟգԦՉԦժիՠիլ՛կըՋԴյՉխձՙ՝խսԵԸԾՑբԺԽյՁՑփցւն՝֋չհ֋լէըւզևցն՚մ֍յձՕն֐֌֌գպմն֞ձճմ։դ֪֡֠", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[27] = NLoginCore_173.E("ԼՋՔՇՈԒՌՔԪԮԻԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[28] = NLoginCore_091.A("ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰƈŮŉůƊőŲŏƅšŴƎŶƘƛŮŚŷơŭŚƣŪū", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[29] = NLoginCore_559.A("ĊĆıîăĶĂĘ÷ıĖÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[30] = NLoginCore_091.E("ՀՃԍՌԐԿԪՀԖԻԷԫԨԛ՗ՕԵ՜աՀԠԯԻդ՛ըԽԼ՟ՎՏՎգըՏզՍՊթԶգՓՉ՝հ՗ղԽկՕԿԻսՔձՅոֆՃ՝քտ՛՚Րֈ՛֌ըՐքՓՋպ֛Օռ՜լրՓաո՟֣֓զ֢դ֩թչ֦֬վ֡", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[31] = NLoginCore_387.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŀőĮŢųŢűŔŸŸŰĿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[32] = NLoginCore_453.A("ùīñąîĩėčąġĩòĘĚįćİĮĴĜûĴĹķāĥĨĸĚŁĆĮŅőŋłģłıİģĺĚĪňĹĚŖıšĬŔįśŜŜňĻŧŔŦŇĻš", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[33] = NLoginCore_027.C("ѕ҃ҁѢфѕпѸѨчъіф҂ѮўѦғ҃ѮѤѭѬѴ҅Җѫҏѭ҈ѰқҏѡѾҏҥ҄қ҉҆ѴҝѭѥѩҧҦҳѮҴ҉ҢѿҦҸҕҨҥҖѵҨҒѹҍҡҜҸҡҁ҆Ҡ҂҇ҦҾӈ҅ӀӋӒҲҊҎҏҵҫӆӔӌӗҵҹӌҲӖ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[34] = NLoginCore_384.F("ՇԚՌԧՑԨՔՈԥ԰ՉԠ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[35] = NLoginCore_027.B("ĠċĞēąĵþď÷ïĳúčĖýĕļŁęĒĹĎłĜĜĝĄĄĠĥĶŊŊČŊńĊĽĤĳŕİńıĭŋœļľĜĔĮĴŃŦŧġŉŝŢŖŘňĩŜŒļňĴŵŞŠĳųŖŵōŅĽžřķŎŽŁťĸŘŅŸƉłŌƀŦŜŘƐńŧŵƆşƕŢŦŪş", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[36] = NLoginCore_559.D("ѰѿєяпѤр҆ћчѶё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[37] = NLoginCore_223.B("ĆĝĄñĩĂðğïĶĘĪĪĵķõğĝģĸēĞğĖĥĥģĊĈĞĦĠďńĿĮōČĢģŘĘŚŖęĻňĝğĲŜśŖĞœŁřĺĪŃŀĩŜņňŰŤŨŦħŌŧņŒūśŦŻŞŧŜŢŏŮļŐŹĽţŻƂŃŠŽŪť", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[38] = NLoginCore_387.A("ĠĩïčĤģĪċġħĶĚĸĨĖĸĝŀĬĽŁĭĺĲĐĉēŌğĘōąęŒğąŒŌŔĢŀĮĺěĴŘřŌňśļŘĮĢğŒŁŚĽĽŦōĤŅŤŠŊĳœŦşůĸŁņĿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[39] = NLoginCore_223.C("҃ѹѼяћѹѠ҅ѿҋѪѮ҂ѹѠьыѯэѳѷҔя҄ҘѣѫѰҒҟњҚ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[40] = NLoginCore_076.A("ÿĢāēĞëĈĕĖĒĺįîĹě÷ČÿıģŅģĲľıûĠļņĄļąŁħĤġĤĨĮĿłİČĸİŋĳŚŋōĽıĖĽĪī", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[41] = NLoginCore_559.A("ĥĲîíëĴòċČėĉĥîýĭľĔĝđėįĝĊċ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[42] = NLoginCore_223.F("ԠՃԢԴԿԌԩԶԷԳ՚ՙԥԫԶԒ՝ՕՂՎՎ՝ՔԳգԩ՘՚ԧգՅ՚ՏՀՃԮկ԰ՠնԯիԴնյվչոց՞ԿՂՕղբՄ՞Մփմդ՚֏֊", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[43] = NLoginCore_138.C("҂ѸкѠљхєјѽѽ҃ќ҉ј҃ҒѣѝќчѬџќѝ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[44] = NLoginCore_324.D("ѭёжљѓѤћ҈єџщфр҉Ѡ҈ќѿѝѲ҇ѫѬҒѻҔґѕҒѧѴѷѶѬќќҟѾҕѺҤѥҟҥүѿңҰѤѭ҆҅ҮҮҀҤҮҮҊҵҧҺґҹ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[45] = NLoginCore_091.A("ùīñąîĩėčąġĨĲøıļľĞĝøùıĳĊċ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[46] = NLoginCore_223.F("ՑՏԳԽ԰ԕԑՀՐԲՅԠ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[47] = NLoginCore_451.D("ѢѾљяїцтхѻҌјё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[48] = NLoginCore_446.A("ĤĦĦĉĤóďĆĉķĤÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[49] = NLoginCore_110.F("ԏԯՅԼԭՈՖՔԨԖՙՅՇՉԟԨԽՊՙԿ՞գՏՈՒՕԤ՛Խ՘ԩՑխՐՑէղՏլգՓմԹԲԷ՘ՒՕ՜ծՑՁ՝քՋՌ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[50] = NLoginCore_384.F("ԣԢՃԞԶԏՓՍԒՈՑԜԬՇԯԒԱՠԠՂԢԟաԷԹեժ՞Ծ՛ե՞ՒՅԽծթՐՖՠԸշԲՋՉէ՛Վցագ՛ո՜յՐնևՇՠՋ֋ժՙՉւՏւաՎ֐֐Օջգջկջ՟՘֊֡ջ՚ց֔իլ", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[51] = NLoginCore_138.D("йїоџѕїѹѶҀѺ҆҂҈јҌҐҁѰѧҒѐҔҘҚѹҏҒјґ҇ѹѶѫѶ҄҂џҁўҩѹ҂ҀѭѻҐѬҲѯҭҏҊ҅҄ѱҶ҇Ҏҍ҆ҊҿҬӂҘүѺҼҿҿҾҟҘҷҸҤӊҁҩҠҋӋҾӆҦҨӇӔҳӐҲӗҜҽҪғӢҜҼәүҵӀӔҶӛҨӟӜӜӀөӈӂӬүӒҴӨӇӆӻӼӓӹӯӉӊӣӼӑӛӄӯӇӲԊԈӔԆөӌԂԀӺӬӽԖӟөөԔӔӸӵԋӗӮӻӓӲӛԀԟԓԛӸԠԉԈԨӽԫԄԯԱԢԭԣԍԴӭӲԚԣԪԗԖԱӶԖՁԀԒԔӻԒԽՃԳԠՀԇԍՃՋԢԜԐԥԫՔՔԯԜԝ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[52] = NLoginCore_324.E("ՒՈՋԞԪՈԯՔՎ՚ԸԨԚՋՏԚՐԠՄ՚ԺՁՅ՛ԨԽթԩՖբ՛ՏԣըդթզաԩեՊԵՇՑսԻոՌԽՁջց՛ոՄԺէՃ՛մև՗ցբՃֆ՞֏փծ֌ձիճիՠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[53] = NLoginCore_091.C("ѝйѲҁ҄ќќћѽѻҊычѪ҅ҊѨҋѡѾґѫёѱѥ҃Ѯ҇ҖѾѷѮ҃ғҗѱѳғѨҚ҆҂ѻҥ҄ѡ҃ҥѱҞҵҦҗҥѼѽ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[54] = NLoginCore_027.C("ыѽуїрѻѩџїѳѼ҅ѩѢџ҇ҏҌџѡѳѨґјґҍѱѩҚҍқѱѴѭѣҁјҒѢѷҗѨҙңҜѾѻѧҜѳҵҔҪѲҩҨҏҋҸҲҏѱҏү", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[55] = NLoginCore_223.D("оѽѲћџѧҁѓ҆ѵѻпѼҏҀѫ҇Ҍѯ҄ѮҌїѐҔїѺїқҜґҜҝҌҠҙѼѥҦѺҞҢҊҎҞҮѦѩѯ҂ғѫѮҦѲ҂ҴҲҳҧҎҼҪҡҼҝҘҙҳҗҸҲҧҋҥҾҦҢ҆ҧӁҽҽҔҫңҢҏҪӉҧҳҔҨҲҿ", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[56] = NLoginCore_091.C("ъѢжіуєпѢѴѧуё", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[57] = NLoginCore_091.B("ĀİýóĜħĉĂôİķīöĮħĿøûğŁĔÿĿķąĆĩąŁŊŉňňĠńąĪŌēňĔŅĢśĔŇīĹĶŔŜęŎŗġĽŀťĵĹĸťŢĺļŒĻĪİŁůŅŉŏŷĹĻűĽőřŪŌŚĿŹŕƅŠťśŴŢźŢŰŸƅşƒůŪƗƄƋƌőƒƚżŪƗŗƂŶƝƓŭŪū", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[58] = NLoginCore_091.A("ČúêìģìēđĄĵĸÿ", (byte)28, 65);
                    NLoginCore_266.var_java_lang_String_arr_b[59] = NLoginCore_027.B("ğĢìīïĞĉğõĚĖĊćúĶĴĔĻŀğÿĎĚŃĺŇĜěľĭĮĭłŇĮŅĬĩňĕłĲĨļŏĶőĜŎĴĞĚŜĳŐĤŗťĢļţŞĺĹįŧĺūŇįţĲĪřźĴśĻŋşĲŀŗľƂŭƄŦŽƆūƂŇŞŚš", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[60] = NLoginCore_201.C("ѲѻсџѶѵѼѝѳѹ҈ѬҊѺѨҊѯҒѾҏғѿҌ҄ѢћѥҞѱѪҟїѫҤѱїҤҞҦѴҒҀҌѭ҆ҪҫҞҚҭҎҪҀѴѱҤғҬҏҏҸҟѶҗҋҙҖҵӀӄұҴғҡҾґ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[61] = NLoginCore_027.E("ԚՌԒԦԏՊԸԮԦՂՊԓԹԻՐԨՑՏՕԽԜՕ՚՘ԢՆՉՙԻբԧՏզղլգՄգՒՑՄ՛ԻՋթ՚ԻշՒւՍյՐմբՕ՜ՄքՔխխ՘֎", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[62] = NLoginCore_384.B("ăıįĐòăíĦĖõøĄòİĜČĔŁıĜĒěĚĢĳńęĽěĶĞŉĽďĬĽœĲŉķĴĢŋěēėŕŔšĜŢķŐĭŔŦŃŖœńģŖŀħĻŏŊŦŏįĴŎİĵœŕŸűŧĽŝŹŞŰƃŰƂŤŝżśňńŖŮƅ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[63] = NLoginCore_027.E("ՋՉԑՍԏՀՒԬԵՇԚԠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[64] = NLoginCore_091.F("ՁԬԿԴԦՖԟ԰ԘԐՔԛԮԷԞԶ՝բԺԳ՚ԯգԽԽԾԥԥՁՆ՗իիԭիեԫ՞ՅՔնՑեՒՎլմ՝՟ԽԵՏՕդևֈՂժվփշչթՊսճ՝թՕ֖տցՔ֔շ֖ծզ՞֟պ՘կ֞բքֈ֦֞րշ֗օ֣֫ռձ֍֒խձ֟ծ֨չ֫֩ր", (byte)28, 70);
                    NLoginCore_266.var_java_lang_String_arr_b[65] = NLoginCore_384.D("Ѭёѳѱѐ҆тҁрхыё", (byte)28, 68);
                    NLoginCore_266.var_java_lang_String_arr_b[66] = NLoginCore_173.E("ԧԾԥԒՊԣԑՀԐ՗ԹՋՋՖ՘ԖՀԾՄՙԴԿՀԷՆՆՄԫԩԿՇՁ԰եՠՏծԭՃՄչԹջշԺ՜թԾՀՓսռշԿմբպ՛ՋդաՊսէթ֑օ։ևՈխֈէճ֌ռև֜տֈսփհ֏՝յ֓՟ր֫֘ջխցք֌", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[67] = NLoginCore_201.E("ՁՊԐԮՅՄՋԬՂՈ՗ԻՙՉԷՙԾաՍ՞բՎ՛ՓԱԪԴխՀԹծԦԺճՀԦճխյՃաՏ՛ԼՕչպխթռ՝չՏՃՀճբջ՞՞ևծՅզ֑օթ֎մՌ֑՘լ֌էՠ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[68] = NLoginCore_324.B("ıħĪýĉħĎĳĭĹęıĐļĭĺÿĳÿþŀÿēąłĄĉĿĺĭĥľ", (byte)28, 66);
                    NLoginCore_266.var_java_lang_String_arr_b[69] = NLoginCore_027.C("яѼёѮѶѯ҄јѢљўч҆ш҄ҐҌћ҅ѾѰєғѕғјҋѵҞҀўҘѸҔѾѮҖҔҨҢҊѷѣҙҝҎ҂ҮҚҬҋ҄ҷҏѼѽ", (byte)28, 67);
                    NLoginCore_266.var_java_lang_String_arr_b[70] = NLoginCore_138.E("ՂԩՓԦՏԎԩՈԕՄԲՐԻԬԨԨՎՂ՜բԭԺՒՈԥԶԷՇՀՄԪՠԿհՍԳղըԿմՔՆԲՀ", (byte)28, 69);
                    NLoginCore_266.var_java_lang_String_arr_b[71] = NLoginCore_387.B("ïðġíČìĆăêĉĪĨöĴĜěùįÿįĎİĴĚķŇĄāňğņĝ", (byte)28, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_266.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ѷєѶѕѧѿјтѳѡќҌѺьѫуш҃ёѡѢѯќѝ", (byte)28, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_266.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ĆĭĈıčĆĩĕĖāĭęĺĴēõěĢďĎĳčĊċ", (byte)28, 66);
                }
            }
        }
    }

    private void b(PreLoginEvent preLoginEvent) {
        String string;
        InboundConnection inboundConnection = preLoginEvent.getConnection();
        String string2 = preLoginEvent.getUsername();
        InetAddress inetAddress = inboundConnection.getRemoteAddress().getAddress();
        Channel channel = NLoginCore_063.a(preLoginEvent, inboundConnection);
        if (channel == null) {
            preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)Component.text((String)((String)NLoginCore_266.c("㺀", (int)bf, (long)(bg ^ bh)) + preLoginEvent.getClass().getCanonicalName() + (String)NLoginCore_266.c("㺃", (int)(bi & bj), (long)bk)))));
            return;
        }
        if (this.G.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        int n = bl;
        if (this.G.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a() instanceof NLoginCore_418 && channel.hasAttr((AttributeKey)var_long_g) && (string = (FloodgatePlayer)channel.attr((AttributeKey)var_long_g).get()) != null) {
            string2 = string.getCorrectUsername();
            n = bm;
        }
        if ((string = this.G.com_nickuc_login_NLoginCore_056_b().a(string2, inetAddress, n != 0)) != null) {
            preLoginEvent.setResult(PreLoginEvent.PreLoginComponentResult.denied((Component)NLoginCore_529.a(string)));
        }
    }
}

