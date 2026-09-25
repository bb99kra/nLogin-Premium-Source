/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.entity.EntityEvent
 *  org.bukkit.event.player.PlayerEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.NLoginCore_056;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_087;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_548;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_025;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.BedrockFloodgateHook;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_157;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_209
extends NLoginCore_056 {
    private static int bo;
    private static int ei;
    private static long fl;
    private static long ea;
    private static int dz;
    private static long p;
    private static long dx;
    private static long gf;
    private static int z;
    private static long ge;
    private static int eq;
    private static long f;
    private static long io;
    private static int ag;
    private static int ci;
    private static long ht;
    private static int hw;
    private static int hn;
    private static int bu;
    private static int fo;
    private static long ey;
    private static long hi;
    private static long aq;
    private static long gi;
    private static long hp;
    private static int hr;
    private static long ic;
    private static int dg;
    private static long cg;
    private static long ad;
    private static int cz;
    private static long hj;
    private static int ip;
    private static long dd;
    private static long du;
    private static long ej;
    private static int aw;
    private static int cp;
    private static int bc;
    private static int ie;
    private static int ew;
    private static int cm;
    private static int ij;
    private static long ax;
    private static long hu;
    private static int k;
    private static int ep;
    private static long is;
    private static long bl;
    private static int e;
    private static int be;
    private static int jd;
    private static int el;
    private static int cd;
    private static int bx;
    private static int gw;
    private static long co;
    private static int fn;
    private static int ba;
    private static int ee;
    private static long eb;
    private static int gs;
    private static int dk;
    private static int dn;
    private static long bv;
    private static int hg;
    private static long bz;
    private static long ir;
    private static long dh;
    private static int gz;
    private static int it;
    private static long ib;
    private static int dy;
    private static int jc;
    private static int ds;
    private static long hl;
    private static long q;
    private static int cj;
    private static int ex;
    private static int im;
    private static long ev;
    private static int cf;
    private static int fj;
    private static int iz;
    private static int eh;
    private static int gg;
    private static long ai;
    private static int hd;
    private static long ik;
    private static long ah;
    private static long bf;
    private static int et;
    private static long by;
    private static long bi;
    private static long en;
    private static int ct;
    private static long gq;
    private static int at;
    private static int gk;
    private static int em;
    private static int dc;
    private static String[] var_java_lang_String_arr_d;
    private static int bj;
    private static int gl;
    private static long dl;
    private static int hk;
    private static long fq;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_d;
    private static int dt;
    private static int fu;
    private static String[] c;
    private static int hz;
    private static int g;
    private static long i;
    private static long j;
    private static int gt;
    private static int gh;
    private static long hx;
    private static long cc;
    private static int am;
    private static int iw;
    private static int n;
    private static int gc;
    private static int fr;
    private static int fz;
    private static int ho;
    private static int aa;
    private static int cn;
    private final boolean l;
    private static int hv;
    private static int b;
    private static int fg;
    private static long ab;
    private static int al;
    private static long bd;
    private static int go;
    private static long di;
    private static long cr;
    private static int ca;
    private static int ap;
    private static long fp;
    private static long in;
    private static int dq;
    private static int fv;

    public boolean b(Player player) {
        if (player == null) {
            return gt != 0;
        }
        if (this.c(player)) {
            return gw != 0;
        }
        return (!this.e.com_nickuc_login_NLoginCore_187_a().boolean_b(this.e.java_lang_Object_b().a(player)) ? gz : hd) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(PlayerJoinEvent playerJoinEvent) {
        String string;
        Player player = playerJoinEvent.getPlayer();
        if (this.c(player)) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.e.java_lang_Object_b().a(player);
        Channel channel = this.e.com_nickuc_login_NLoginCore_581_b().a(playerJoinEvent, player);
        if (channel == null) {
            String[] stringArray = new String[b];
            stringArray[NLoginCore_209.e] = NLoginCore_209.c("㺀", (int)g, (long)(i ^ j));
            stringArray[NLoginCore_209.k] = NLoginCore_209.c("㺃", (int)n, (long)(p ^ q));
            stringArray[NLoginCore_209.z] = (String)NLoginCore_209.c("㺆", (int)aa, (long)(ab ^ ad)) + playerJoinEvent.getClass().getSimpleName() + (String)NLoginCore_209.c("㺉", (int)ag, (long)(ah ^ ai));
            stringArray[NLoginCore_209.al] = NLoginCore_209.c("㺌", (int)(am & ap), (long)aq);
            stringArray[NLoginCore_209.at] = NLoginCore_209.c("㺏", (int)aw, (long)ax);
            NLoginCore_277.a(NLoginCore_112.a(stringArray));
        }
        if (this.e.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        if (NLoginCore_157.var_boolean_p && (string = this.a(NLoginCore_277, channel, playerJoinEvent)) != null) {
            NLoginCore_277.a(string);
            return;
        }
        long l = System.nanoTime();
        try {
            Object object;
            if (this.e.com_nickuc_login_NLoginCore_187_a().b(player.getName(), player.getUniqueId())) {
                return;
            }
            if (NLoginCore_532.ao.ar() && (object = playerJoinEvent.getJoinMessage()) != null && ((String)object).toLowerCase(Locale.ENGLISH).contains((CharSequence)NLoginCore_209.c("㺒", (int)(ba & bc), (long)bd))) {
                playerJoinEvent.setJoinMessage(null);
            }
            object = this.e.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            Runnable runnable = () -> this.a(player, (NLoginCore_509)object, NLoginCore_277);
            if (NLoginCore_012.V()) {
                NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(runnable);
            } else {
                runnable.run();
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_209.c("㺕", (int)be, (long)(bf ^ bi)) + NLoginCore_277.getName() + (String)NLoginCore_209.c("㺘", (int)bj, (long)bl), throwable, new Object[bo]);
            NLoginCore_277.a((String)NLoginCore_209.c("㺛", (int)bu, (long)bv));
        }
        finally {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_d, l);
        }
    }

    private String a(NLoginCore_277 NLoginCore_277, Channel channel, Object object) {
        String string = NLoginCore_277.getName();
        try {
            BukkitHelper_001 BukkitHelper_001 = (BukkitHelper_001)channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).get();
            if (BukkitHelper_001 == null) {
                String string2 = (String)NLoginCore_209.c("㺀", (int)(cz & dc), (long)dd) + NLoginCore_277.getName() + (String)NLoginCore_209.c("㺃", (int)dg, (long)(dh ^ di)) + object.getClass().getSimpleName() + (String)NLoginCore_209.c("㺆", (int)dk, (long)dl);
                NLoginCore_370.c(string2, new Object[dn]);
                String[] stringArray = new String[dq];
                stringArray[NLoginCore_209.ds] = NLoginCore_209.c("㺉", (int)dt, (long)(du ^ dx));
                stringArray[NLoginCore_209.dy] = NLoginCore_209.c("㺌", (int)dz, (long)(ea ^ eb));
                stringArray[NLoginCore_209.ee] = (String)NLoginCore_209.c("㺏", (int)(eh & ei), (long)ej) + string2;
                stringArray[NLoginCore_209.el] = NLoginCore_209.c("㺒", (int)em, (long)en);
                stringArray[NLoginCore_209.ep] = NLoginCore_209.c("㺕", (int)(eq & et), (long)ev);
                return NLoginCore_112.a(stringArray);
            }
            return this.a(NLoginCore_277, BukkitHelper_001);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_209.c("㺘", (int)(ew & ex), (long)ey) + string + (String)NLoginCore_209.c("㺛", (int)(fg & fj), (long)fl), throwable, new Object[fn]);
            return NLoginCore_209.c("㺞", (int)fo, (long)(fp ^ fq));
        }
    }

    private /* synthetic */ void a(Player player, NLoginCore_509 NLoginCore_5092, NLoginCore_277 NLoginCore_277) {
        if (player.getHealth() <= 0.0 || player.isDead()) {
            player.spigot().respawn();
            NLoginCore_5092.com_nickuc_login_NLoginCore_510_a().h();
        }
        if (this.l) {
            this.var_com_nickuc_login_bukkit_nLoginBukkit_d.com_nickuc_login_NLoginType_018_a().f(NLoginCore_277);
        } else {
            super.d(NLoginCore_277, NLoginCore_5092);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_209.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.E("ӾԠԢԂԦՅԽՓԿԎՌՂՐՊԓԸ՚ՙՑ՗ՑԦ", (byte)26, 69), NLoginCore_209.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.B("ĖģĢåĥġĜĥİğìĪĮħĪİòѵ҄ѡҊҎґѰҀĆ", (byte)26, 66) + string + NLoginCore_138.D("н", (byte)26, 68) + methodType.toString(), exception);
        }
    }

    public boolean a(EntityEvent entityEvent) {
        Entity entity = entityEvent.getEntity();
        return this.a(entity);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(NLoginCore_277 NLoginCore_277, BukkitHelper_001 BukkitHelper_001) {
        long l = System.nanoTime();
        String string = NLoginCore_277.getName();
        try {
            if (this.l) {
                InetSocketAddress inetSocketAddress = Optional.ofNullable(NLoginCore_277.java_net_InetSocketAddress_a()).orElse((InetSocketAddress)BukkitHelper_001.var_io_netty_channel_Channel_a.remoteAddress());
                NLoginCore_509 NLoginCore_5092 = this.e.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277, null, NLoginCore_277.getName(), inetSocketAddress, fr != 0, fu != 0, BukkitHelper_001);
                if (BukkitHelper_001.var_org_bukkit_Location_a != null) {
                    NLoginCore_5092.com_nickuc_login_NLoginCore_510_a().b(BukkitHelper_001.var_org_bukkit_Location_a);
                }
                String string2 = null;
                return string2;
            }
            NLoginInterface_031 NLoginInterface_0312 = this.e.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
            String string3 = super.a(NLoginCore_277, BukkitHelper_001.var_com_nickuc_login_ForceRegisterConfig_a, BukkitHelper_001.var_java_lang_String_k, Optional.ofNullable(NLoginCore_277.java_net_InetSocketAddress_a()).orElse((InetSocketAddress)BukkitHelper_001.var_io_netty_channel_Channel_a.remoteAddress()), BukkitHelper_001.boolean_d(), (BukkitHelper_001.var_boolean_a || NLoginInterface_0312 != null && NLoginInterface_0312.boolean_a(NLoginCore_277.java_util_UUID_a()) ? fv : fz) != 0, BukkitHelper_001);
            if (string3 == null && BukkitHelper_001.var_org_bukkit_Location_a != null) {
                this.e.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_NLoginCore_510_a().b(BukkitHelper_001.var_org_bukkit_Location_a);
            }
            String string4 = string3;
            return string4;
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_209.c("㺀", (int)gc, (long)(ge ^ gf)) + string + (String)NLoginCore_209.c("㺃", (int)(gg & gh), (long)gi), throwable, new Object[gk]);
            Object object = NLoginCore_209.c("㺆", (int)(gl & go), (long)gq);
            return object;
        }
        finally {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_c, l);
        }
    }

    public NLoginCore_209(NLoginType_008 NLoginType_008, nLoginBukkit nLoginBukkit2, boolean bl) {
        super(NLoginType_008);
        this.var_com_nickuc_login_bukkit_nLoginBukkit_d = nLoginBukkit2;
        this.l = bl;
    }

    static {
        b = (20 >>> 2 | 20 << -2) & 0xFFFFFFFF;
        e = 0 >>> 16 | 0 << ~16 + 1;
        g = Integer.reverse(0);
        i = Long.reverse(-5650325843126950855L);
        j = Long.reverse(-6773413839565225984L);
        k = (1024 >>> 234 | 1024 << -234) & 0xFFFFFFFF;
        n = (0x800000 >>> 55 | 0x800000 << ~55 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-5650325843126950855L);
        q = Long.reverse(-6773413839565225984L);
        z = (0x8000000 >>> 154 | 0x8000000 << -154) & 0xFFFFFFFF;
        aa = 64 >>> 69 | 64 << -69;
        ab = Long.reverse(-5650325843126950855L);
        ad = Long.reverse(-6773413839565225984L);
        ag = (0x3000000 >>> 88 | 0x3000000 << -88) & 0xFFFFFFFF;
        ah = Long.reverse(-5650325843126950855L);
        ai = Long.reverse(-6773413839565225984L);
        al = Integer.reverse(-1073741824);
        am = 262144 >>> 112 | 262144 << ~112 + 1;
        ap = (-1 >>> 21 | -1 << -21) & 0xFFFFFFFF;
        aq = Long.reverse(1411318372589986873L);
        at = Integer.reverse(0x20000000);
        aw = Integer.reverse(-1610612736);
        ax = Long.reverse(1411318372589986873L);
        ba = (6144 >>> 234 | 6144 << ~234 + 1) & 0xFFFFFFFF;
        bc = (-1 >>> 245 | -1 << ~245 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(1411318372589986873L);
        be = 0xE000000 >>> 153 | 0xE000000 << ~153 + 1;
        bf = Long.reverse(-5650325843126950855L);
        bi = Long.reverse(-6773413839565225984L);
        bj = Integer.reverse(0x10000000);
        bl = Long.reverse(1411318372589986873L);
        bo = (0 >>> 25 | 0 << -25) & 0xFFFFFFFF;
        bu = Integer.reverse(-1879048192);
        bv = Long.reverse(1411318372589986873L);
        bx = Integer.reverse(0x50000000);
        by = Long.reverse(-5650325843126950855L);
        bz = Long.reverse(-6773413839565225984L);
        ca = Integer.reverse(-805306368);
        cc = Long.reverse(1411318372589986873L);
        cd = (0x6000000 >>> 23 | 0x6000000 << ~23 + 1) & 0xFFFFFFFF;
        cf = (-1 >>> 59 | -1 << -59) & 0xFFFFFFFF;
        cg = Long.reverse(1411318372589986873L);
        ci = Integer.reverse(0);
        cj = Integer.reverse(Integer.MIN_VALUE);
        cm = Integer.reverse(-1342177280);
        cn = Integer.reverse(-1);
        co = Long.reverse(1411318372589986873L);
        cp = 448 >>> 229 | 448 << -229;
        cr = Long.reverse(1411318372589986873L);
        ct = 0 >>> 204 | 0 << ~204 + 1;
        cz = Integer.reverse(-268435456);
        dc = Integer.reverse(-1);
        dd = Long.reverse(1411318372589986873L);
        dg = Integer.reverse(0x8000000);
        dh = Long.reverse(-5650325843126950855L);
        di = Long.reverse(-6773413839565225984L);
        dk = (34816 >>> 11 | 34816 << ~11 + 1) & 0xFFFFFFFF;
        dl = Long.reverse(1411318372589986873L);
        dn = Integer.reverse(0);
        dq = (163840 >>> 47 | 163840 << -47) & 0xFFFFFFFF;
        ds = (0 >>> 215 | 0 << -215) & 0xFFFFFFFF;
        dt = Integer.reverse(0x48000000);
        du = Long.reverse(-5650325843126950855L);
        dx = Long.reverse(-6773413839565225984L);
        dy = Integer.reverse(Integer.MIN_VALUE);
        dz = Integer.reverse(-939524096);
        ea = Long.reverse(-5650325843126950855L);
        eb = Long.reverse(-6773413839565225984L);
        ee = Integer.reverse(0x40000000);
        eh = (640 >>> 133 | 640 << -133) & 0xFFFFFFFF;
        ei = (-1 >>> 143 | -1 << ~143 + 1) & 0xFFFFFFFF;
        ej = Long.reverse(1411318372589986873L);
        el = Integer.reverse(-1073741824);
        em = Integer.reverse(-1476395008);
        en = Long.reverse(1411318372589986873L);
        ep = (128 >>> 133 | 128 << ~133 + 1) & 0xFFFFFFFF;
        eq = 0x160000 >>> 144 | 0x160000 << ~144 + 1;
        et = Integer.reverse(-1);
        ev = Long.reverse(1411318372589986873L);
        ew = (736 >>> 165 | 736 << ~165 + 1) & 0xFFFFFFFF;
        ex = Integer.reverse(-1);
        ey = Long.reverse(1411318372589986873L);
        fg = Integer.reverse(0x18000000);
        fj = (-1 >>> 177 | -1 << ~177 + 1) & 0xFFFFFFFF;
        fl = Long.reverse(1411318372589986873L);
        fn = Integer.reverse(0);
        fo = Integer.reverse(-1744830464);
        fp = Long.reverse(-5650325843126950855L);
        fq = Long.reverse(-6773413839565225984L);
        fr = 0 >>> 229 | 0 << ~229 + 1;
        fu = Integer.reverse(0);
        fv = 0x100000 >>> 244 | 0x100000 << ~244 + 1;
        fz = Integer.reverse(0);
        gc = Integer.reverse(0x58000000);
        ge = Long.reverse(-5650325843126950855L);
        gf = Long.reverse(-6773413839565225984L);
        gg = 0x1B0000 >>> 240 | 0x1B0000 << -240;
        gh = (-1 >>> 196 | -1 << -196) & 0xFFFFFFFF;
        gi = Long.reverse(1411318372589986873L);
        gk = Integer.reverse(0);
        gl = (0x7000000 >>> 54 | 0x7000000 << -54) & 0xFFFFFFFF;
        go = -1 >>> 140 | -1 << -140;
        gq = Long.reverse(1411318372589986873L);
        gs = 0 >>> 131 | 0 << -131;
        gt = (4096 >>> 140 | 4096 << -140) & 0xFFFFFFFF;
        gw = 0 >>> 208 | 0 << ~208 + 1;
        gz = 2048 >>> 43 | 2048 << ~43 + 1;
        hd = Integer.reverse(0);
        hg = (475136 >>> 110 | 475136 << -110) & 0xFFFFFFFF;
        hi = Long.reverse(-5650325843126950855L);
        hj = Long.reverse(-6773413839565225984L);
        hk = Integer.reverse(0x78000000);
        hl = Long.reverse(1411318372589986873L);
        hn = Integer.reverse(-134217728);
        ho = Integer.reverse(-1);
        hp = Long.reverse(1411318372589986873L);
        hr = Integer.reverse(0x4000000);
        ht = Long.reverse(-5650325843126950855L);
        hu = Long.reverse(-6773413839565225984L);
        hv = 0x20000004 >>> 125 | 0x20000004 << ~125 + 1;
        hw = Integer.reverse(-1);
        hx = Long.reverse(1411318372589986873L);
        hz = Integer.reverse(0x44000000);
        ib = Long.reverse(-5650325843126950855L);
        ic = Long.reverse(-6773413839565225984L);
        ie = (0 >>> 189 | 0 << -189) & 0xFFFFFFFF;
        ij = 0x18000001 >>> 123 | 0x18000001 << -123;
        ik = Long.reverse(1411318372589986873L);
        im = Integer.reverse(0x24000000);
        in = Long.reverse(-5650325843126950855L);
        io = Long.reverse(-6773413839565225984L);
        ip = (151552 >>> 204 | 151552 << ~204 + 1) & 0xFFFFFFFF;
        ir = Long.reverse(-5650325843126950855L);
        is = Long.reverse(-6773413839565225984L);
        it = Integer.reverse(Integer.MIN_VALUE);
        iw = Integer.reverse(Integer.MIN_VALUE);
        iz = (0 >>> 243 | 0 << ~243 + 1) & 0xFFFFFFFF;
        jc = 0x60000002 >>> 60 | 0x60000002 << -60;
        jd = 0x26000000 >>> 88 | 0x26000000 << ~88 + 1;
        c = new String[jc];
        var_java_lang_String_arr_d = new String[jd];
        NLoginCore_209.b();
    }

    private static String a(int n, long l) {
        l ^= 0x45L;
        l ^= 0x87464C9B448DD734L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(68 + 1), 83, (byte)(27 + 20), (byte)(59 + 8), (byte)(16 + 50), (byte)(30 + 37), (byte)(3 + 44), (byte)(16 + 64), (byte)(58 + 17), (byte)(52 + 15), (byte)(16 + 67), 53, (byte)(5 + 75), (byte)(14 + 83), (byte)(21 + 79), (byte)(53 + 47), (byte)(35 + 70), (byte)(107 + 3), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡃࡒ࠯ࡘ࡜࡟࠾ࡎ", (byte)68, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_209.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public boolean a(PlayerEvent playerEvent) {
        Player player = playerEvent.getPlayer();
        return this.b(player);
    }

    public boolean a(Entity entity) {
        if (entity instanceof Player) {
            Player player = (Player)entity;
            return this.b(player);
        }
        return gs != 0;
    }

    private static void b() {
        int n;
        f = -7194873239405827699L;
        long l = f ^ 0x87464C9B448DD734L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(43 + 26), (byte)(53 + 30), (byte)(25 + 22), (byte)(7 + 60), (byte)(35 + 31), (byte)(52 + 15), (byte)(11 + 36), (byte)(19 + 61), (byte)(52 + 23), (byte)(43 + 24), (byte)(35 + 48), (byte)(33 + 20), (byte)(61 + 19), (byte)(32 + 65), (byte)(82 + 18), 100, (byte)(103 + 2), 110, (byte)(80 + 23)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
                    NLoginCore_209.var_java_lang_String_arr_d[0] = NLoginCore_076.B("ŌŒŞıŊŋĶŒŇŲŰŊŻŰĻŷŢŹŰŰŰšŎŏ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[1] = NLoginCore_223.E("ՠԾխնիմՑԲըիՍՂ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[2] = NLoginCore_004.A("ũħŪœİųĬťŚŶŏŧŷƂƀőűŮłŏńŠņƄŔƉũŬţƐŮƆŝƌşŕƒƕŬƍŗŰƔŶƍŴźơŭƒŽƜŦƧŮů", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[3] = NLoginCore_091.C("ӢӕҹӥәӄҭҬӜӅӨҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[4] = NLoginCore_027.F("ՠԾխնիմՑԲըիՍՂ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[5] = NLoginCore_027.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֗ըև֎֒֐֑գկՠՠ֦խծ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[6] = NLoginCore_110.D("ҡӆҶӂҦӟӘӆӀӐӟӑҾӇӏӫӵӲӎӧӶӻӂӃ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[7] = NLoginCore_173.F("ԭԼծզՌը԰ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍ՈէէՐփՔ֓բհ՘ըՓ՘՚֌ո֢ղգռ֝֗օ֓րչ֥ֆխ֠֩ֈ֚ւִ֞յևօփ֑֒֎ָ֧ւ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[8] = NLoginCore_201.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[9] = NLoginCore_223.F("ՋՑ՝԰ՉՊԵՑՆձհ՗լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍՘ֆֆռփգ֓ը֗լՔլ֚՗֊՗խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝֋լ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[10] = NLoginCore_453.F("ձբԿԱԯՎլյՒլԸՖըթթՐք՛խԸփՠՍՎ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[11] = NLoginCore_092.C("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӿӀӖӈԅӺӆԈӐԑԈӗ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[12] = NLoginCore_324.C("ҧӧҸӀӡҧӘӋҰӮӚӍӈӤӷӠӫҳҰӈӰӫӂӃ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[13] = NLoginCore_138.F("ԭԼծզՌը԰ծՉՈ՝ԻՌԹպխյտպգեպւղՆթՉջևվօ֎զվր֕ՕՒՋ֌Ւպզ֏Ֆ՝֛֓֐օ՟֠ՠրխծ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[14] = NLoginCore_575.C("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[15] = NLoginCore_076.B("ŤőŤņŐŋŴŎũŝİœŐűłŏŢűƀųŝőżŅżŠſţśŭƍƌƐŲƓŶƏƃŷŪƈŴŗƓƚŭƁţűƠŻřşƓųƊžƂƦƜƅƪſƢ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[16] = NLoginCore_453.B("ŦŎĭĴŏűőŏņũŚŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[17] = NLoginCore_384.F("Ւ՜ԽէՎըԫԲՈճզոՎնՌԾԻքտՖքՈթֆաօ֎խչե՝աժսծղՔե֐ՕՖ֏թ֞՝֗֕ոք֔դոյ֦խծ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[18] = NLoginCore_091.F("ՋՑ՝԰ՉՊԵՑՆձկՉպկԺնաոկկկՠՍՎ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[19] = NLoginCore_027.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[20] = NLoginCore_451.C("ҽӗҦҺҼӝӜӀӫӈӒҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[21] = NLoginCore_384.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[22] = NLoginCore_092.B("ļĽũŗĲōţŷűĳĽŜŎŰųŚŃĽŹŞőƊũŤŽŮŇƃƆţšŌƃŞŞűƀŮƓŲŹŏƘũƈƏƓƑƒŤŰššƧŮů", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[23] = NLoginCore_387.C("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺӜӬӭӮԄӧԉӪԊӪԛӢӣ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[24] = NLoginCore_223.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[25] = NLoginCore_451.C("ӀӆӒҥҾҿҪӆһӦӥӌӡҲӕӟӬӂәӏӋӓҶҼӎӒԂӍӻӻӱӸӘԈӝԌӡӉӡԏӌӿӌӢӳӇԂӏӰԚӕԚӶԇԝәԠӠӿӸԒԘԢԀӡԛӨԠԥԨԎӧӦԃԧԄӰԍӾԫԭԣӳӷԕԺԙӽԪԷԖԝԷԯԺԻ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[26] = NLoginCore_384.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦźŗŻŷƉũŊťƎŉŨťūũƘŠƐťŰƔůƆŨŸŹźƐųƕŶƖŶƧŮů", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[27] = NLoginCore_092.E("ծՌՄիԿՙ՘ՕպԺՕՂ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[28] = NLoginCore_027.E("ՋՑ՝԰ՉՊԵՑՆձհ՗լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍՘ֆֆռփգ֓ը֗լՔլ֚՗֊՗խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝֋լ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[29] = NLoginCore_138.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӱӕӅԌӊӣԃӗӜӿӪӗ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[30] = NLoginCore_223.D("ҡӢӄӠӟӦҶӛӀӚӫӋӵҾӣӟҴөӫҵӒӅӂӃ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[31] = NLoginCore_223.E("ԲԲնլէթԫՂԺԸՍՂ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[32] = NLoginCore_384.E("մՎՎՋ՘՘էչՖ՘Տ՘ՖցՁլվհծշևնՍՎ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[33] = NLoginCore_138.D("әӉӦҤҤӘӘӊҼӋӫӛӆӊӒӟҪҸӏӶӰӻӂӃ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[34] = NLoginCore_091.F("ձՊՒԱԿգնԹՋըՖԼ՜ԹմնԹՠգ՞ԿնՍՎ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[35] = NLoginCore_004.C("ӒӁӫӊҦӮӜӂҧӲұҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[36] = NLoginCore_446.B("ņħŇĿŔŅĸĺŸžņŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[37] = NLoginCore_027.A("ŜŎŕŰŮĸŶĵŎŹİĺľŶūőſŻşłŜőŎŏ", (byte)62, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_209.var_java_lang_String_arr_d[0] = NLoginCore_201.B("ŌŒŞıŊŋĶŒŇŲűŋŏřŕŘŕŐŧŝŻőŎŏ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[1] = NLoginCore_384.A("ŮşıţŇŨŐŏŖżżŃ", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[2] = NLoginCore_091.D("ӝқӞӇҤӧҠәӎӪӃӛӫӶӴӅӥӢҶӃҸӔҺӸӈӽӝӠӗԄӢӺӑԀӓӉԆԉӠԁӋӤԋӻԉԐӫԔԅӬԈӣӔӥӢӣ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[3] = NLoginCore_173.E("ԬՀՈԨբձը՚չԴՕնԵշՔ՚վռՖցՁնՍՎ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[4] = NLoginCore_559.C("ҹӖӧӪӕӁӯӯҭһӨҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[5] = NLoginCore_201.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֘֏ծթ֠֎֘հքմ֢֖խծ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[6] = NLoginCore_453.D("ҡӆҶӂҦӟӘӆӀӐӜӟӤҬҳӣҳӆӬӤӓӇӏӮҽөӿӲӔӮԄӹ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[7] = NLoginCore_223.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜӜӅӸӉԈӗӥӍӝӈӍӏԁӭԗӧӘӱԒԌӺԈӵӮԚӻӢԕԞӽԏӷԉӤԛӼӤӤԡԤԞӺӭӷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[8] = NLoginCore_451.D("ӁӂӓӦӂӤӪҿӧӪҺҷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[9] = NLoginCore_559.B("ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƽƂǂƢƤǀǆǇǍǐƦƵǀǕƠƦƦǏǏƺƚǌƣ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[10] = NLoginCore_027.C("ӦӗҴҦҤӃӡӪӇӡҭӜӦӑӎӆӆӖӳҴӜӳӞӻӫӏӯӢӾӢӰӟ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[11] = NLoginCore_223.D("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӲӜӊԊӸӥԌӯӱԁӎԒӼӡӳӬӢӦӓԍӺԋӢӣ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[12] = NLoginCore_004.C("ҧӧҸӀӡҧӘӋҰӮӓӂӋҾӄӗӈҰӍҸҸӻӂӃ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[13] = NLoginCore_223.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦŻƃųŇŪŊżƈſƆƏŧſƁƖŖœŌƍœŻũŝŽśŘŲƥŲŷżŽűŮů", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[14] = NLoginCore_110.E("ԮԽՍՑՈգԹհդզՙՂ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[15] = NLoginCore_427.D("ӘӅӘҺӄҿӨӂӝӑҤӇӄӥҶӃӖӥӴӧӑӅӰҹӰӔӳӗӏӡԁԀԄӦԇӪԃӷӫӞӼӨӋԇԎӡӵӗӥԔӯӍӓԉԝӑӼәԌӜӰӮԂӶ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[16] = NLoginCore_384.C("ӕӛӠҴӈӫөҪӥӆҪӈӁӲӭӤҮӲӎӤӝӫӂӃ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[17] = NLoginCore_387.A("œŝľŨŏũĬĳŉŴŧŹŏŷōĿļƅƀŗƅŉŪƇŢƆƏŮźŦŞŢūžůųŕŦƑŖŗƐŪůŞųŘƣžťŻƈƔŨţŢƂƗƀžƩƟŽƆ", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[18] = NLoginCore_027.D("ӀӆӒҥҾҿҪӆһӦӥҿӋӶӮӔӋӖӦҳҸӻӂӃ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[19] = NLoginCore_324.F("՛ՠԮգՃղպՕՔմՑՂ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[20] = NLoginCore_027.B("ŠĭůųĴųŧŰŊŝŖŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[21] = NLoginCore_173.F("զ԰մձԷԱՁՃշԵՙՂ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[22] = NLoginCore_201.D("ҰұӝӋҦӁӗӫӥҧұӐӂӤӧӎҷұӭӒӅӾӝӘӱӢһӷӺӗӕӀӷӒӒӥӴӢԇӦӭӃԎӉӨөԖԌӥԗӷԓӶӥӢӣ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[23] = NLoginCore_201.E("ԭԼծզՌը԰ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍Ոէդժը֗՟֏դկ֓ծօ֔֐ֈ՗֚֝ց֝ե֏֦խծ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[24] = NLoginCore_451.C("ӇӒҩҪҺӫӈӨӑӋҭҷ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[25] = NLoginCore_453.F("ՋՑ՝԰ՉՊԵՑՆձհ՗լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍՘ֆֆռփգ֓ը֗լՔլ֚՗֊՗խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝֋լ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւַ֠ֆ־ք֡׌֊ֿ֚֝׏ׄ׌֧֡דַ֫֙֫֒ד֢", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[26] = NLoginCore_223.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺԆӢԐӓӲӭԚԌӣӱԋӢӣ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[27] = NLoginCore_451.D("ӘҢҲҺӘӪҥӤүӠӂҷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[28] = NLoginCore_110.B("ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƼƽƕǌƿƬǀƊǑƿƢǀǆƶƕǑƓƥƪƷƝǐƣ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[29] = NLoginCore_091.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӖԈӣӔәԊӻԈӐӉӢӗ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[30] = NLoginCore_223.E("ԬխՏիժձՁզՋեյոյՍՓիվդօՎբֆՍՎ", (byte)62, 69);
                    NLoginCore_209.var_java_lang_String_arr_d[31] = NLoginCore_076.B("ůŵŭňŵĴźůũŜŊŃ", (byte)62, 66);
                    NLoginCore_209.var_java_lang_String_arr_d[32] = NLoginCore_223.A("ŵŏŏŌřřŨźŗřŏōřŝŢĻĺĽŅŀžƇŎŏ", (byte)62, 65);
                    NLoginCore_209.var_java_lang_String_arr_d[33] = NLoginCore_076.C("әӉӦҤҤӘӘӊҼӋӨӓӥҮӐҶҷӘҺҳӪӕӂӃ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[34] = NLoginCore_451.C("ӦҿӇҦҴӘӫҮӀӝӋӍӌӢӗӵӆӂӤӆӳӅӂӃ", (byte)62, 67);
                    NLoginCore_209.var_java_lang_String_arr_d[35] = NLoginCore_004.D("ҵөӜӝӘҶӆӧӦӃұҷ", (byte)62, 68);
                    NLoginCore_209.var_java_lang_String_arr_d[36] = NLoginCore_201.F("ՒԿԵՒժՌճՆԹՒ՝Ղ", (byte)62, 70);
                    NLoginCore_209.var_java_lang_String_arr_d[37] = NLoginCore_138.D("ӐӂӉӤӢҬӪҩӂӭұӪӬҽҳӕӥәөӭӎӻӂӃ", (byte)62, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_209.var_java_lang_String_arr_d[0] = NLoginCore_387.A("ūŞŊŵůũĵŶūŖſžūőŔŤĿƄƄĽŕŸŞŽƂŌŉŞŌŐšű", (byte)62, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_209.var_java_lang_String_arr_d[0] = NLoginCore_223.D("ҞҡӕӇӍӀҠӈӅӈӭӅӵүҲӔӸӐҹӱӅӫӂӃ", (byte)62, 68);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(PlayerQuitEvent playerQuitEvent) {
        Player player = playerQuitEvent.getPlayer();
        NLoginCore_277 NLoginCore_277 = this.e.java_lang_Object_b().a(player);
        long l = System.nanoTime();
        NLoginCore_187 NLoginCore_1872 = this.e.com_nickuc_login_NLoginCore_187_a();
        try {
            NLoginCore_510 NLoginCore_510;
            NLoginCore_509 NLoginCore_5092;
            String string;
            if (NLoginCore_532.ao.ar() && (string = playerQuitEvent.getQuitMessage()) != null && string.toLowerCase(Locale.ENGLISH).contains((CharSequence)NLoginCore_209.c("㺀", (int)bx, (long)(by ^ bz)))) {
                playerQuitEvent.setQuitMessage(null);
            }
            if (this.c(player)) {
                return;
            }
            string = this.e.com_nickuc_login_NLoginCore_581_b().a(playerQuitEvent, player);
            if (string != null) {
                if (this.e.com_nickuc_login_NLoginCore_581_b().e(string)) {
                    return;
                }
            } else {
                NLoginCore_370.c((String)NLoginCore_209.c("㺃", (int)ca, (long)cc) + playerQuitEvent.getClass().getSimpleName() + (String)NLoginCore_209.c("㺆", (int)(cd & cf), (long)cg) + NLoginCore_277.getName(), new Object[ci]);
            }
            if ((NLoginCore_5092 = NLoginCore_1872.a(NLoginCore_277)) != null && (NLoginCore_510 = (NLoginCore_510)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_g)) != null) {
                NLoginCore_447 NLoginCore_4472 = (NLoginCore_447)this.e.com_nickuc_login_NLoginType_005_b();
                NLoginCore_4472.com_nickuc_login_NLoginCore_456_a().void_a(NLoginCore_5092, NLoginCore_510, cj != 0);
            }
            if (NLoginCore_532.x.ar()) {
                this.e.com_nickuc_login_NLoginCore_581_b().k(NLoginCore_277);
            }
            if (!this.l) {
                super.d(NLoginCore_277);
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_209.c("㺉", (int)(cm & cn), (long)co) + NLoginCore_277.getName() + (String)NLoginCore_209.c("㺌", (int)cp, (long)cr), throwable, new Object[ct]);
        }
        finally {
            NLoginCore_1872.l(NLoginCore_277);
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_e, l);
        }
    }

    public boolean c(Player player) {
        if (BedrockFloodgateHook.aE) {
            NLoginCore_370.e((String)NLoginCore_209.c("㺀", (int)hg, (long)(hi ^ hj)) + player.getName() + (String)NLoginCore_209.c("㺃", (int)hk, (long)hl) + player.getUniqueId() + (String)NLoginCore_209.c("㺆", (int)(hn & ho), (long)hp) + player + (String)NLoginCore_209.c("㺉", (int)hr, (long)(ht ^ hu)) + player.hashCode() + (String)NLoginCore_209.c("㺌", (int)(hv & hw), (long)hx) + player.getClass().getCanonicalName() + (String)NLoginCore_209.c("㺏", (int)hz, (long)(ib ^ ic)), new Object[ie]);
        }
        if (player.hasMetadata((String)NLoginCore_209.c("㺒", (int)ij, (long)ik)) || player.hasMetadata((String)NLoginCore_209.c("㺕", (int)im, (long)(in ^ io))) || player.hasMetadata((String)NLoginCore_209.c("㺘", (int)ip, (long)(ir ^ is)))) {
            return it != 0;
        }
        NLoginCore_087 NLoginCore_0872 = ((NLoginInterface_025)((Object)this.e.com_nickuc_login_NLoginInterface_030_b())).com_nickuc_login_NLoginCore_087_a();
        return (NLoginCore_0872 != null && NLoginCore_0872.b((Entity)player) ? iw : iz) != 0;
    }
}

