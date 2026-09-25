/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  lombok.Generated
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.connection.PendingConnection
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.LoginEvent
 *  net.md_5.bungee.api.event.PlayerDisconnectEvent
 *  net.md_5.bungee.api.event.PostLoginEvent
 *  net.md_5.bungee.api.event.PreLoginEvent
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.event.EventHandler
 *  org.geysermc.floodgate.api.player.FloodgatePlayer
 */
package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_435;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_404;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_031;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_110;
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
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_254;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_271;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_339;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_047;
import com.nickuc.login.NLoginCore_184;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginInterface_046;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_418;
import com.nickuc.login.NLoginCore_588;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_247
implements NLoginInterface_046 {
    private static int bv;
    private static long hq;
    private static int eq;
    private static long gi;
    private static int hl;
    private static int dj;
    private static long eu;
    private static int dn;
    private static int iv;
    private static int ep;
    private static long bu;
    private static long ap;
    private static long hb;
    private static int ip;
    private static long hp;
    private static long fy;
    private static int w;
    private static int fc;
    private static long as;
    private static long fa;
    private static int ji;
    private final NLoginType_008 D;
    private static int hz;
    private static long bx;
    private static long h;
    private static long ac;
    private static int cv;
    private static int dx;
    private static long gn;
    private static int ey;
    private static int z;
    private static int jg;
    private static long io;
    private static int fn;
    private static long ca;
    private static long db;
    private static long bd;
    private static int eo;
    private static int di;
    private static int fs;
    private static long aw;
    private static int hk;
    private static long ij;
    private static long gs;
    private static long aq;
    private static long l;
    private static int bo;
    private static int ix;
    private static int ab;
    private static int df;
    private static long fk;
    private static int bm;
    private static int jb;
    private static int cb;
    private static long az;
    private static int var_int_c;
    private static int ht;
    private static int fw;
    private static int ce;
    private static long dv;
    private static int fq;
    private static long hf;
    private static int fx;
    private static int gd;
    private static int dt;
    private static long ah;
    private static long ik;
    private static int cf;
    private static int iu;
    private static long dw;
    private static int bf;
    private static int hx;
    private static int dq;
    private static int ao;
    private static int iz;
    private static int il;
    private static long in;
    private static long he;
    private static long bc;
    private static long dd;
    private static int go;
    private static int hs;
    private static int ii;
    private static long em;
    private static int ag;
    private static int bk;
    private static long gy;
    private static long gl;
    private static long bj;
    private static long hm;
    private static int bh;
    private static int hd;
    private static int q;
    private static long bw;
    private static long m;
    private static int gk;
    private static int dc;
    private static int cj;
    private static int ic;
    private static int iy;
    private static int ar;
    private static int jd;
    private static int jh;
    private static int ck;
    private static long ed;
    private static int gw;
    private static int bp;
    private static String[] var_java_lang_String_arr_a;
    private static int gt;
    private static int gj;
    private static int gb;
    private static int cw;
    private static int gf;
    private static long dz;
    private static long bi;
    private static int bs;
    private static int fm;
    private static int fb;
    private static int cl;
    private static int jm;
    private static long e;
    private static int gv;
    private static int jj;
    private static int ak;
    private static long ds;
    private static int cn;
    private static long var_long_c;
    private static long r;
    private static int iw;
    private static long fo;
    private static int es;
    private static int hh;
    private static long bg;
    private static int by;
    private static int ct;
    private static int cp;
    private static long bn;
    private static long fl;
    private static int fr;
    private static int ft;
    private static int var_int_f;
    private static int g;
    private static int var_int_a;
    private static long dp;
    private static int al;
    private static long aa;
    private static int i;
    private static int fg;
    private static long cc;
    private static int ir;
    private static int x;
    private static int dk;
    private static int fd;
    private static int gx;
    private static int ia;
    private static int dy;
    private static int je;
    private static int cr;
    private static int u;
    private static int jc;
    private static long ex;
    private static int t;
    private static int ad;
    private static int de;
    private static int cfr_renamed_0;
    private static int hy;
    private static long ge;
    private static int bq;
    private static int ef;
    private static int be;
    private static int jn;
    private static long var_long_b;
    private static long o;
    private static int dg;
    private static long ae;
    private static int fj;
    private static long eh;
    private static int gz;
    private static int j;
    private static int gu;
    private static long dr;
    private static long ai;
    private static int hr;
    private static long ba;
    private static int ib;
    private static int gc;
    private static long cg;
    private static int im;
    private static long fh;
    private static int gm;
    private static int dm;
    private static int ek;
    private static long hn;
    private static int jf;
    private static int fu;
    private static long fp;
    private static int hw;
    private static int ch;
    private static long p;
    private static int hc;
    private static int ay;
    private static long ig;
    private static long ih;
    private static int hg;
    private static long am;
    private static long an;
    private static int ej;
    private static int iq;
    private static int y;
    private static int ev;
    private static int co;
    private static long bt;
    private static int ec;
    private static long af;
    private static int fi;
    private static long ee;
    private static int cs;
    private static long hu;
    private static long ga;
    private static int ew;
    private static long fe;
    private static long v;
    private static long gr;
    private static long gp;
    private static int ja;
    private static int et;
    private static int ez;
    private static int br;
    private static int hv;
    private static long jl;
    private static int av;
    private static int bl;
    private static int ff;
    private static int cu;
    private static String[] var_java_lang_String_arr_b;
    private static int cy;
    private static int is;
    private static long it;
    private static long hj;
    private static int cx;
    private static int eb;
    private static int gq;
    private static int cz;
    private static long dh;
    private static int cm;
    private static int fz;
    private static int en;
    private static long s;
    private static int bz;
    private static int aj;
    private static long hi;
    private static int k;
    private static long ea;
    private static int gh;
    private static int fv;
    private static int id;
    private static int bb;
    private static int dl;
    private static long el;
    private static int ax;
    private static int gg;
    private static long er;
    private static int n;
    private static int ha;
    private static long cfr_renamed_1;
    private static int cq;
    private static int ho;
    private static int eg;
    private static long d;
    private static int ie;
    private static long cd;
    private static int au;
    private static int du;
    private static int ci;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_f;
    private static int da;
    private static long jk;
    private static long ei;
    private static long at;

    private void b(LoginEvent loginEvent) {
        Object object;
        boolean bl;
        PendingConnection pendingConnection = loginEvent.getConnection();
        String string2 = pendingConnection.getName();
        UUID uUID = pendingConnection.isOnlineMode() ? pendingConnection.getUniqueId() : null;
        Consumer<String> consumer = string -> {
            loginEvent.setCancelled(ja != 0);
            loginEvent.setCancelReason(TextComponent.fromLegacyText((String)string));
        };
        Channel channel = NLoginCore_339.a(loginEvent, pendingConnection);
        if (channel == null) {
            consumer.accept((String)NLoginCore_247.c("㺀", (int)(gg & gh), (long)gi) + loginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)(gj & gk), (long)gl));
            return;
        }
        if (this.D.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
        if (NLoginCore_5882 == null) {
            String string3 = (String)NLoginCore_247.c("㺆", (int)gm, (long)gn) + string2 + (String)NLoginCore_247.c("㺉", (int)go, (long)gp) + loginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺌", (int)gq, (long)(gr ^ gs));
            NLoginCore_370.c(string3, new Object[gt]);
            String[] stringArray = new String[gu];
            stringArray[NLoginCore_247.gv] = NLoginCore_247.c("㺏", (int)(gw & gx), (long)gy);
            stringArray[NLoginCore_247.gz] = NLoginCore_247.c("㺒", (int)ha, (long)hb);
            stringArray[NLoginCore_247.hc] = (String)NLoginCore_247.c("㺕", (int)hd, (long)(he ^ hf)) + string3;
            stringArray[NLoginCore_247.hg] = NLoginCore_247.c("㺘", (int)hh, (long)(hi ^ hj));
            stringArray[NLoginCore_247.hk] = NLoginCore_247.c("㺛", (int)hl, (long)(hm ^ hn));
            consumer.accept(NLoginCore_112.a(stringArray));
            return;
        }
        if (uUID != null && NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null) {
            throw new IllegalStateException((String)NLoginCore_247.c("㺞", (int)ho, (long)(hp ^ hq)));
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5882.var_com_nickuc_login_ForceRegisterConfig_f;
        int bl2 = hr;
        NLoginCore_291 NLoginCore_2912 = this.D.com_nickuc_login_NLoginCore_291_a();
        if (uUID != null) {
            if (ForceRegisterConfig2 != null && ForceRegisterConfig2.getMojangId() != null && !uUID.equals(ForceRegisterConfig2.getMojangId())) {
                Object[] objectArray = new Object[hv];
                objectArray[NLoginCore_247.hw] = ForceRegisterConfig2.getMojangId();
                objectArray[NLoginCore_247.hx] = uUID;
                objectArray[NLoginCore_247.hy] = ForceRegisterConfig2.i();
                objectArray[NLoginCore_247.hz] = string2;
                NLoginCore_370.b((String)NLoginCore_247.c("㺡", (int)(hs & ht), (long)hu), objectArray);
                ForceRegisterConfig2 = null;
                bl = ia;
            }
            if ((object = NLoginCore_2912.a(NLoginCore_5882.ci, uUID, null, ib != 0)) == null) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[ic]));
                return;
            }
            if (ForceRegisterConfig2 == null || ((ForceRegisterConfig)object).r()) {
                ForceRegisterConfig2 = object;
            }
        }
        NLoginCore_5882 = NLoginCore_5882.a(ForceRegisterConfig2, uUID != null || NLoginCore_5882.ci == null ? string2 : NLoginCore_5882.ci);
        channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)NLoginCore_5882);
        object = pendingConnection.getUniqueId();
        String string3 = ((InetSocketAddress)pendingConnection.getSocketAddress()).getAddress().getHostAddress();
        String string4 = string2;
        if (NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a != null) {
            if (this.D.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, NLoginCore_532.J)) {
                return;
            }
            if (this.D.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, NLoginCore_532.R)) {
                return;
            }
            if (!NLoginCore_2912.a(ForceRegisterConfig2, NLoginCore_5882.var_com_nickuc_login_NLoginCore_271_a.a.getJavaUniqueId(), string4, string3)) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[id]));
                return;
            }
            UUID illegalAccessException = ForceRegisterConfig2.java_util_UUID_a();
            if (illegalAccessException != null && !illegalAccessException.equals(object) && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_m.ar()) {
                NLoginCore_435.a(loginEvent, illegalAccessException);
            }
        } else if (uUID != null) {
            if (this.D.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, NLoginCore_532.I)) {
                return;
            }
            if (this.D.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, NLoginCore_532.Q)) {
                return;
            }
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                string4 = BCryptHashProvider.g(string2, ie != 0);
                try {
                    NLoginCore_435.a(pendingConnection, string4);
                }
                catch (IllegalAccessException uUID3) {
                    NLoginCore_370.c((String)NLoginCore_247.c("㺤", (int)cfr_renamed_0, (long)(ig ^ ih)) + string2 + (String)NLoginCore_247.c("㺧", (int)ii, (long)(ij ^ ik)), uUID3, new Object[il]);
                    consumer.accept((String)NLoginCore_247.c("㺪", (int)im, (long)(in ^ io)));
                    return;
                }
            }
            if (!NLoginCore_2912.a(ForceRegisterConfig2, uUID, string2, string3, bl)) {
                consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[ip]));
                return;
            }
            NLoginCore_435.a(loginEvent, ForceRegisterConfig2.java_util_UUID_a());
        } else {
            if (this.D.com_nickuc_login_NLoginCore_291_a().b(consumer, ForceRegisterConfig2, string3, null)) {
                return;
            }
            if (this.D.com_nickuc_login_NLoginCore_291_a().a(consumer, ForceRegisterConfig2, string3, null)) {
                return;
            }
            UUID uUID2 = ForceRegisterConfig2.java_util_UUID_a();
            if (uUID2 == null && (ForceRegisterConfig2.boolean_h() || BCryptHashProvider.com_nickuc_login_NLoginCore_254_a() == NLoginCore_254.var_com_nickuc_login_NLoginCore_254_b)) {
                uUID2 = NLoginCore_432.a(string4, (UUID)object);
                ForceRegisterConfig2.a(uUID2);
                if (!NLoginCore_2912.a(ForceRegisterConfig2, new NLoginCore_436[iq])) {
                    consumer.accept(NLoginCore_150.a(NLoginCore_374.w, new Object[ir]));
                    return;
                }
            }
            if (uUID2 != null && !uUID2.equals(object)) {
                NLoginCore_435.a(loginEvent, ForceRegisterConfig2.java_util_UUID_a());
            }
        }
    }

    @EventHandler(priority=127)
    public void b(PreLoginEvent preLoginEvent) {
        if (preLoginEvent.isCancelled()) {
            return;
        }
        try {
            this.d(preLoginEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_247.c("㺀", (int)n, (long)(o ^ p)) + preLoginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)q, (long)(r ^ s)) + preLoginEvent.getConnection().getName() + (String)NLoginCore_247.c("㺆", (int)(t & u), (long)v), throwable, new Object[w]);
            preLoginEvent.setCancelled(x != 0);
            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺉", (int)(y & z), (long)aa)));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void a(PreLoginEvent preLoginEvent, ForceRegisterConfig ForceRegisterConfig2, String string, InetAddress inetAddress, NLoginCore_047 NLoginCore_0472, PendingConnection pendingConnection, Plugin plugin) {
        try {
            if (preLoginEvent.isCancelled()) {
                return;
            }
            NLoginCore_009 NLoginCore_0092 = this.D.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, string, inetAddress, NLoginCore_0472);
            switch (NLoginCore_404.V[NLoginCore_0092.ordinal()]) {
                case 1: {
                    preLoginEvent.setCancelled(jb != 0);
                    Object[] objectArray = new Object[jc];
                    objectArray[NLoginCore_247.jd] = string;
                    preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_150.a(NLoginCore_374.aa, objectArray)));
                    return;
                }
                case 2: {
                    preLoginEvent.setCancelled(je != 0);
                    Object[] objectArray = new Object[jf];
                    objectArray[NLoginCore_247.jg] = string;
                    preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_150.a(NLoginCore_374.ab, objectArray)));
                    return;
                }
                case 3: {
                    this.a(preLoginEvent, string, jh != 0, ForceRegisterConfig2);
                    return;
                }
                case 4: {
                    pendingConnection.setOnlineMode(ji != 0);
                    return;
                }
                default: {
                    throw new UnsupportedOperationException((String)NLoginCore_247.c("㺀", (int)jj, (long)(jk ^ jl)) + (Object)((Object)NLoginCore_0092));
                }
            }
        }
        finally {
            preLoginEvent.completeIntent(plugin);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1AL;
        l ^= 0x48FA9C54FAE9FA04L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(7 + 62), (byte)(46 + 37), (byte)(5 + 42), (byte)(58 + 9), (byte)(7 + 59), (byte)(6 + 61), 47, (byte)(62 + 18), 75, (byte)(58 + 9), (byte)(5 + 78), (byte)(50 + 3), (byte)(73 + 7), (byte)(73 + 24), (byte)(56 + 44), (byte)(52 + 48), (byte)(17 + 88), (byte)(94 + 16), (byte)(57 + 46)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(24 + 45), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.C("ҴӁӀ҃ӃҿҺӃӎҽҊӈӌӅӈӎҐࠩࠜࠇ࠮࠘ࠪࠥࠤࠞࠔࠞࠫࠁࠣ", (byte)52, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_247.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void c(PreLoginEvent preLoginEvent) {
        PendingConnection pendingConnection = preLoginEvent.getConnection();
        String string = pendingConnection.getName();
        InetAddress inetAddress = ((InetSocketAddress)pendingConnection.getSocketAddress()).getAddress();
        NLoginInterface_031 NLoginInterface_0312 = this.D.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
        int n = NLoginInterface_0312 != null && NLoginInterface_0312.boolean_a(pendingConnection.getUniqueId()) ? bo : bp;
        String string2 = this.D.com_nickuc_login_NLoginCore_056_b().a(string, inetAddress, n != 0);
        if (string2 != null) {
            preLoginEvent.setCancelled(bq != 0);
            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string2));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_247.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԠՂՄԤՈէ՟յա԰ծդղլԵ՚ռջճչճՈ", (byte)60, 69), NLoginCore_247.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.C("ӌәӘқӛӗӒӛӦӕҢӠӤӝӠӦҨࡁ࠴ࠟࡆ࠰ࡂ࠽࠼࠶ࠬ࠶ࡃ࠙࠻ӂ", (byte)60, 67) + string + NLoginCore_384.A("ı", (byte)60, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -6761110932529226655L;
        long l = var_long_c ^ 0x48FA9C54FAE9FA04L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(5 + 64), (byte)(48 + 35), (byte)(24 + 23), (byte)(39 + 28), (byte)(46 + 20), (byte)(42 + 25), 47, (byte)(29 + 51), (byte)(69 + 6), (byte)(34 + 33), (byte)(40 + 43), (byte)(33 + 20), (byte)(62 + 18), (byte)(73 + 24), (byte)(60 + 40), (byte)(50 + 50), (byte)(77 + 28), (byte)(5 + 105), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
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
                    NLoginCore_247.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[1] = NLoginCore_004.D("ԈԘԚԏԼԖԜԕԓӺՂԤԐՀԂԢԔԾԷԖԟԦԓԔ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[2] = NLoginCore_092.C("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[3] = NLoginCore_201.F("֎֐իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ֐֠ց֐ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג׎ֻ֧׆ֳֵֽ֪֙לד׎ֶֺֿ֛֞֞ף", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[4] = NLoginCore_173.A("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[5] = NLoginCore_173.F("՝խկդ֑իձժըՏ֗չե֕՗շթ֓֌իմջըթ", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[6] = NLoginCore_384.D("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[7] = NLoginCore_091.A("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[8] = NLoginCore_451.D("ԮԧԃӻԏԉԈӷԖԹӾԭԜԞӾԝԛԹӽԗԬԷԿԾԯԤՄՂԌԠՂԤ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ŹƉƋƀƭƇƍƆƄūƳƕƁƱųƓƅƯƨƇƐƗƄƅ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[10] = NLoginCore_173.A("ƝżƕƝƞƗƟŨƊƨƢŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[11] = NLoginCore_138.A("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[12] = NLoginCore_387.E("փռ՘Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց֌֔֓քչ֙֗այ֗չ", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[13] = NLoginCore_076.E("՝խկդ֑իձժըՏ֗չե֕՗շթ֓֌իմջըթ", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[14] = NLoginCore_027.D("ԬԋԤԬԭԦԮӷԙԷԱԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[15] = NLoginCore_453.D("ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠըևվչՉեՆժաՉ֎", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[16] = NLoginCore_324.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƨưƯƠƕƵƳŽƑƳƕ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[17] = NLoginCore_091.D("ԈԘԚԏԼԖԜԕԓӺՂԤԐՀԂԢԔԾԷԖԟԦԓԔ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[18] = NLoginCore_138.A("ƝżƕƝƞƗƟŨƊƨƢŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[19] = NLoginCore_451.B("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǙǸǯǪƺǖƷǛǒƺǿ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[20] = NLoginCore_173.E("զվ֐ՠՎ֏֋խծժ֙բ֗Ւ֏ջմՑ֕լր՚ռ֘֐֥բ֠֝֜ֆ֟դ֜ց֪֞֟֏ֱָ֧֪ս", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[21] = NLoginCore_575.F("՚ժսիՋՑվ՟մնո՝", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[22] = NLoginCore_138.C("ԐԯԺԥԸԸԴԋԒӴӵԘԱՂԞՀՀԕԩՇԢԗ԰ՁԽՌԉԴՑԧԒԶԓԑԶԒԸԮԗՉԡգՀ՟՚ՆաԳՆԻՁԞԩՎՊբ՞աճդԱլՇԱ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[23] = NLoginCore_092.B("ťƆƣŬƂơƝƞŻƁƄŹ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ԤԘԳԫӻԙԶԡԒԀԁԼՂՂԜԓՇԪԖՀՆՉԻՉԦԐՁԧԿՇՖԩՂԱԼՎ԰ԭԙԸԓՙաԨ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[25] = NLoginCore_091.F("զվ֐ՠՎ֏֋խծժ֖մթո֋՚ոկՖՙշ֕յմՠչշփըը֝խլ֫տփ֐տ֎վւձ֋ճնո֥֝հֱָֹ֛֦֜֙քֵ֛֚֒֠֨֟", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[26] = NLoginCore_559.D("ԘӱԙԭԴӺӵԏԪՃԓԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[27] = NLoginCore_384.B("ŻƙƠƋŽůũźūƭƯƎŰƖƌŸƪƱźƾŰƯƵƗǀƌƌǀƾƠƴƤǆƂƕƅƜǈƘƫƚǒƟƫƠƕƠƵǓƱƤǕǜǇǞƷƜƟǃǢƳǇǛƷǒƻƣƦǪƬǥǀǎǱǳǈǱǨǆǴǛƵǽǯƷǗǄǅ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[28] = NLoginCore_076.E("֎֐իւբ՞֏֒ֆՐֈը֌խ՗ֈևի՗ՠ՛֣՛՟֢֛֖մ֖֖֡ն֘֐֬֏֮վսվ֕֔֊մօּ֥֑֪֔֍֛֭֮ֈ։", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[29] = NLoginCore_138.B("źƟŹŷƪƊŽƣƆƢŮūƆƌƕƉƨƯƚƹƊŽźơſƣƷǆƻƏƅƺżƩƇǈƧƺƸǂƒǐǂƱǊƍǂƲǚƣǆǌǊǀƒƸƫǟưƴƜǨƿƽǧƴǗǆƬǧǃƯƮǪǫưǕǭǌǧǔǨǙǺǹǖǮǉǳǚƽǦǞǓƾǞ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[30] = NLoginCore_092.A("ƆūťſżźƪźƥűůŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[31] = NLoginCore_110.A("ƠƠƥƉƨƐŢũŭƯƏƫƒƌƯƪƻƕưƩƐƍƾƺŴƂƷưǅǅƚǊǀƝƖƉƥƞǋǊǄǏƟƲƪƦǒƔƒǋǘƥƬƨǙǓƵǚƜǑƸƙƧƾƥǉǂƿƪǗƬƪǓǂǒƲǪǗƵǯǭƵǝǽǆǞǌǲǭǑǗȁǮǇȈǄǡǠȌǄǘǉȅǱǪǎȆǙ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[32] = NLoginCore_324.B("ƆūťſżźƪźƥűůŹ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[33] = NLoginCore_223.D("ӳԙԴԵԩԎԷԼӽԣԤԓԘԲԶԁԡԼԶԧԦԚՐՃԫՋԳԴՆԷ՗ՌԴՕԵ՘Է԰ԙԽԭ՞բԖԢԦԧՅԳՕԧխԦբԪՠՆզԲՅնըՒՊ՗ՓճՓՍՏՒԷկսծՒՁէդՀէբժՂքՇէսՏ֍օՓՇՏ֊֗", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[34] = NLoginCore_223.A("ƠƖƗƝƋƮŰƊƆżƴƟƇƖƸƋƅƲƹƧŵƮƼƽƙƷƃƐƲơƽƈƦƂƬƞƦƈƏǉƾơƱƝƳƦƠǒǛƣƥƦƼƹƟƬǗƯƚƗǢǃǀƲǛƦǆǖǦǧǈǁƮǓǄƹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[35] = NLoginCore_201.D("ԹԻԖԭԍԉԺԽԱӻԱԼԯԮԨԡԹԾԙԴԞԫԤՍԨՊԯԿՋՊՃԨԷԩԹԵՆԫՔՏԡԸՌԻԯՔ՜զԸԡՉդդԹդգԺեՊյիՉյԲ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[36] = NLoginCore_091.E("՛ոատՏդծխՔՕոնև֖֜ը֜ղռ֑լ֐֣֧֚֔զ֙֡՝տռ֦ըֱպ֌֔րհַցֵָֹ֨֡պ֛յվցֻֿռְֶսִָָֹ֛ֈֽ׍֋׋ֶ֪֑֭֒։֏ֳ֚֯ו֭֨׀ג֯םס֨֩", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[37] = NLoginCore_004.E("ժՏՉգՠ՞֎՞։ՕՓ՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[38] = NLoginCore_091.A("ƣƀƭƂƢũžƟƣťŬƞưƮƱŵƇƧŵƊźƳƍƁƐǂƣǅƱŹǇƖƔƕǈǊƍƎƪǌƮǇƣƔƶƑǌǌƚǋƬǋƵǑǞơƬƟǒǡƲǧƨǓƽǥǬǥǫǊǁǀǜƪƿǰǇǴǋǎǕǶǺǹǝǷǟǓǫǠǁǤǺǔȁȀ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[39] = NLoginCore_201.E("ժՏՉգՠ՞֎՞։ՕՓ՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[40] = NLoginCore_559.E("գ֊սթ֐ք֐՝֌ՔՖՏկո։ծ֚՚֟տ֎ւ֛աճ֨զ֚֨բ֢֖֖տ֎֋֝֟վ֮֐֥։ִչ֣֮ռ֊֑֘֓մֲֵ֗ւ֤֨րֺւָׂ֚׏ֺ׎׍֧֭ג׆ֵג׎ֲֿ֑֖֔וחך֢׎ךְֵ׃יַמ׈׫ּ", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[41] = NLoginCore_324.D("ԯԥԦԬԚԽӿԙԕԋՃԮԖԥՇԚԔՁՈԶԄԽՋՌԨՆԒԟՁ԰ՌԗԵԑԻԭԵԗԞ՘Ս԰ՀԬՂԵԯաժԲԴԵՋՈԮԻզԾԩԦձՒՏՁժԵՕեյն՗ՐԽբՓՈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[42] = NLoginCore_076.B("ƤŴŦƉƜƙƀſƳŪƴƵƩƥŷƆƮƌƮƅƞƽƄƅ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[43] = NLoginCore_092.E("զվ֐ՠՎ֏֋խծժ֖մթո֋՚ոկՖՙշ֕յմՠչշփըը֝խ֢֨֨֏֣վֈ֎֭֭ղւ֑չ֏ֶ։ֳ֨֞չׁֈ։", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[44] = NLoginCore_138.F("խՆծւ։ՏՊդտ֘ը՝", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[45] = NLoginCore_223.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫׃֝։֣֠׀א֯֕ה֏֝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[46] = NLoginCore_138.C("ԑԩԻԋӹԺԶԘԙԕՄԍՂӽԺԦԟӼՀԗԫԅԧՃԻՐԍՋՈՇԱՊԏՇԬՕՉՊԺՒ՜գՕԨ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[47] = NLoginCore_575.E("՚ժսիՋՑվ՟մնո՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[48] = NLoginCore_091.E("զվ֐ՠՎ֏֋խծժ֙խՌ֕֌֏Ֆոֈւծմքռ֧֣յպ։տր՟վփ֤֌հ֧֡ծֱտ։֍ָ֕֝պֱռֱ֖׃պִստֵֶֻ։ׂքֿ", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[49] = NLoginCore_004.B("ŪƣƘŹƛưƚƢƯƭƮŹ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[50] = NLoginCore_223.D("ԈԘԚԏԼԖԜԕԓӺՁԙԥՇՃԨԨԒԜԿՆԈԯԛԞԫԓԝԿԈԱԧԤՑ՘ՅԜԜԱԲԸՂ՝դԵ՗ԤԺՄդՈԩ՟ՆԳԴ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[51] = NLoginCore_223.B("ƪƬƇƞžźƫƮƢŬƢƴƕƗƴƓƻƊƪƔƿƗƄƅ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[52] = NLoginCore_559.C("ԕӺӴԎԋԉԹԉԴԀӾԈ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[53] = NLoginCore_559.E("֏րֈ֌Տառփ֌փւ՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[54] = NLoginCore_004.D("ԕӺӴԎԋԉԹԉԴԀӾԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[55] = NLoginCore_004.C("ԦԶԛԙԏԘԉՁՁԛԔԗԯӼԁԂԤԼԺԝԼՁԘՄՃԦՇՐ԰ԥ՗ՐՊԖՉԬՎ՝ԙ՛ԜԵՒՅԯԺԲՖԡիԤԸԥՆԳԴ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[56] = NLoginCore_201.C("ԐԂԳԑӵԦՀӽԚԟԞԁԿՁԅԩԡԘԳԹՊԿԛԝԠԟԭԮԱԕՍԕՃԘԸՉՖՕԳՕՓԾՙԭՆԲՁ՘բԼՖՄծՎ՛ՐԽՀԱ՜ՇՇկԸշԴՇՇվՑյԲԹղԻՄծֆտհՈՖջէՕզՓՔ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[57] = NLoginCore_004.D("ԹԆԃԵԇԬԺԏԘԠӵԳӷԚԡԁԚԥՊԘՈԊԣԠԧԚԓՒԧՏԖԐՋԻԪՉԺԹՠԖԙՊԭ՝ԥ՝ԙ՘՟ԪԾԧգԦ՝ՅՍԭ԰ԪՈՃՂԱՖՃ՛ԹԺԻՔչծաճՐդցֈշեմ՘ոի՝ւոց՚ծվ֏է֖Փե֍խխ՚֋Ցց՜ծաօս֘վոպ֖ևգո֌ա֪գִ֤֨֔ց֬֋֪ն֤ճֈַ֪֞֘վֳ֟֒־րֻջփׇׇֿ׆֯ׄ֯։֮֓֕֌׍׃֥֛֮֯֯֔֬֜֡ב֛׍א׎ופש׉־׉מ׏׭צ׎׌ֿ֬׬עספַדַׇ׬ד׳׊׷׬׋׈", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[58] = NLoginCore_324.D("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘՍՓՓԺՎԩԳԹ՘՘ԝԭԼԤԺաԴ՞ՓՉԤլԳԴ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[59] = NLoginCore_223.B("ƉŢƊƞƥūŦƀƛƴƄŹ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[60] = NLoginCore_091.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫׃֝։֣֠׀א֯֕ה֏֝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[61] = NLoginCore_173.F("օ՟֋֎֎փ՞՝թՖ֒Ք֐։զջև֟֐՚տս՝ղև֖֐֢֡ջ֪։֝֟թէ֐֢֩֡ձծ֘ս", (byte)89, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_247.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƝƶżƠƚƕſƵƑƷƆ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[1] = NLoginCore_223.C("ԈԘԚԏԼԖԜԕԓӺՂԿ԰ԖԨՇՆԜՌՃԍԼԓԔ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ŴƅƨƞƝƐƤůƞƅƪŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[3] = NLoginCore_110.F("֎֐իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ֐֠ց֐ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג׎ֻ֧׆ֳֵ֪֙׃ׅ׎֣֦םׁת֢֬שֶֺֺׁׄ֬׎ץׂׅײֽ", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[4] = NLoginCore_004.E("փռ՘Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց֋հծ֚՝֙֝֟ֆ֣֩", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[5] = NLoginCore_384.A("ŹƉƋƀƭƇƍƆƄūƳƓƳƩƶƚƘƲƝƶƐƗƄƅ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[6] = NLoginCore_027.F("կՏւՍբծ֔Ս֎֔ը՝", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[7] = NLoginCore_453.C("ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠչ֐֐ժ՞փՏՎի֐զՐկղջոսըճ֋ձ՚ը", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[8] = NLoginCore_173.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƛƉƹƾƫƑǅƗƯǃŻ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[9] = NLoginCore_453.D("ԈԘԚԏԼԖԜԕԓӺՃԞԁԔԾԿՀԫՅՊԺՌԓԔ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[10] = NLoginCore_173.A("ƀƫƧƉŸƊƫƪƫžƪŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[11] = NLoginCore_559.D("ԹԻԖԭԍԉԺԽԱӻԴԒԞԯԦԽՁԜՅԉՋԞՉԎԣՍՃԐԐԯՎՔԡԭԖՖՓԳՋԖԬԭ՟ԸՀԼԯէբԻՋԬԻկԩըՋլՃժՂՏԮՔՉՉռԹլձԱ՛սԼԾՂսչՒզձՕՄ՞ՠզՉ֋ձ֐իա֐տֈթւ՗թշչ֝վ֐յչ՞ը", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[12] = NLoginCore_173.F("փռ՘Րդ՞՝Ռի֎ՓւձճՓղհ֎Ւլց֐֣դ֦֛֦֡֓֌փչ", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[13] = NLoginCore_092.C("ԈԘԚԏԼԖԜԕԓӺՁԬԓԤՀԽԠԥԓԸՃՌԓԔ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[14] = NLoginCore_091.A("ƉƗťŭƩơŧƥſƓƲŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[15] = NLoginCore_324.F("֎֐իւբ՞֏֒ֆՐ։էճքջ֖֒ձ֚՞֠ճ֞գո֢֘եեք֣֩նւի֫֨ֈ֠իցւִ֍֑֕քַּ֐֠ց֐ׄվֽֿׁ֤֠֘֗փ֩֞֞ב֎ׁ׆ֆְג֑֓֗ג׎ֻ֧׆ֳֵ֪֙׀ךֲסֿׁׂ֦וֶׅ֪֡ףתקױׂ׉ד׳טֽ", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[16] = NLoginCore_223.B("ƟƘŴŬƀźŹŨƇƪůƞƍƏůƎƌƪŮƈƝƩƫƶźǄƙƮƯơƙƔƻǋǉƧƿƮƧƊƮƼǊƙ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[17] = NLoginCore_027.A("ŹƉƋƀƭƇƍƆƄūƴƍƋƬƶŴŷƜƼůƟƗƄƅ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[18] = NLoginCore_076.D("ԏԅԻԦԱԘӿӷԕԸӾԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[19] = NLoginCore_138.B("ƪƬƇƞžźƫƮƢŬƥƃƏƠƗƮƲƍƶźƼƏƺſƔƾƴƁƁƠƿǅƒƞƇǇǄƤƼƇƝƞǐƩƱƭƠǘǓƬƼƝƬǠƚǙƼǝƴǛƳǀƟǅƺƺǭƪǝǢƢǌǮƭƯƳǮǪǃǗǢǆƵǏǑǚƽǠǔȂƽȀǰǡȀǳȉȁǼǠȁǋǍǰȎǡǰǙ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[20] = NLoginCore_453.A("ƂƚƬżŪƫƧƉƊƆƵžƳŮƫƗƐŭƱƈƜŶƘƴƬǁžƼƹƸƢƻǆƣƌƵƸƷƚǋƦƍǈƓǒƪǍƵǓƧǒƚǆǝƤƥ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[21] = NLoginCore_092.E("ՖտֆՙգթՔ֋ֆ֎ւ֖֕օսչծ֟Ւց֞իըթ", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[22] = NLoginCore_027.F("եք֏պ֍֍։ՠէՉՊխֆ֗ճ֕֕ժվ֜շլօ֖֒֡՞։֦ռէ֋ըզ֋է֍փլ֞նִֶָ֛֕֯ֈ֛֐֖ճվ֫׃ցׇ֤֧֖֚֩։֌", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[23] = NLoginCore_223.F("թծՠ֎ևց֊րժ֑ը՝", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[24] = NLoginCore_110.C("ԤԘԳԫӻԙԶԡԒԀԁԼՂՂԜԓՇԪԖՀՆՉԻՉԦԐՁԧԿՇՖԩՂԢՐՖՑԬՐՐԿ՟ԠՙՑՠԠԷԷՆ՗ՍՃ՜ԳԴ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[25] = NLoginCore_173.C("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘԗՖԪԮԻԪԹԩԭԜԶԞԡԣՈՐԛգ՜ՇՄՠդթԪՐՂՐխզՂՄ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[26] = NLoginCore_004.B("ƒƃƉƣƌŸſƋƮƦƮŹ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[27] = NLoginCore_223.F("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֶֿ֛֗֫֟և֊׎֐׉ֲ֤וי׃׊ֲט֏֧׍דעְב֨֩", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[28] = NLoginCore_201.C("ԹԻԖԭԍԉԺԽԱӻԳԓԷԘԂԳԲԖԂԋԆՎԆԊՍՆՁԟՌՁՁԡՃԻ՗ԺՙԩԨԩՀԿԴԛ՞ԺՂՠՔՆ՝՘դՊիբՙԻգՑաՋՒն", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[29] = NLoginCore_384.F("՞փ՝՛֎ծաևժֆՒՏժհչխ֌֓վ֝ծա՞օգև֛֪֟ճթ֞ՠ֍ի֬֋֦֞֜նִ֦֮֕ձ֦֖־ևְ֪֤֮ն֜֏׃֔֘ր׌֣֡׋ֻ֪֘֐׋֧֓֒׎׏ֹ֔בְ׋ָ׌ֽמםֶ֯ז֞ןֿ֧ימ׉ס", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[30] = NLoginCore_173.D("ԡԌԒӶԸԆԍԩԗ԰ԭԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[31] = NLoginCore_091.B("ƠƠƥƉƨƐŢũŭƯƏƫƒƌƯƪƻƕưƩƐƍƾƺŴƂƷưǅǅƚǊǀƝƖƉƥƞǋǊǄǏƟƲƪƦǒƔƒǋǘƥƬƨǙǓƵǚƜǑƸƙƧƾƥǉǂƿƪǗƬƪǓǂǒƲǪǗƵǯǭƵǝǽǆǞǌǲǭǑǗȁǮǇȈǄǠǾǹǽǀǬǐǨȋȀǨǢǨǑȕǶǣȕȌǯǰǷǤǥ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[32] = NLoginCore_387.E("Ջիռծ֓ՠՆգՔձը՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[33] = NLoginCore_559.A("ŤƊƥƦƚſƨƭŮƔƕƄƉƣƧŲƒƭƧƘƗƋǁƴƜƼƤƥƷƨǈƽƥǆƦǉƨơƊƮƞǏǓƇƓƗƘƶƤǆƘǞƗǓƛǑƷǗƣƶǧǙǃƻǈǄǤǄƾǀǃƨǠǮǟǃƲǘǕƱǘǓǛƳǵƻǱǞǱǘǜǅǺǤǰǦ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[34] = NLoginCore_575.A("ƠƖƗƝƋƮŰƊƆżƴƟƇƖƸƋƅƲƹƧŵƮƼƽƙƷƃƐƲơƽƈƦƂƬƞƦƈƏǉƾơƱƝƳƦƠǒǛƣƥƦƼƹƟƬǗƯƚƗǢǃǀƲǡǜǌǫǡƸǎǟǱǒǈƹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[35] = NLoginCore_446.E("֎֐իւբ՞֏֒ֆՐֆ֑քփսն֎֓ծ։ճրչ֢ս֟ք֔֠֟֘ս֌վ֎֊֛ր֤֩ն֍֡֐քֱֻ֩֍նֹֹ֞֗֯֒ռּ֢֝׀ֿ֬֨", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[36] = NLoginCore_138.D("ԆԣԌԪӺԏԙԘӿԀԣԡԲՁՇԓՇԝԧԼԗԻԿՎՅՒԑՄՌԈԪԧՑԓ՜ԥԷԿԫԛբԬՓՌՠգդԥՆԠԩԬզժԧա՛ԨՆգ՟գդԳըոԶնԽ՘ՕաԼԴԽբշՓՃղֆթֆէէզՠթօօՏՊ֖վք֌", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[37] = NLoginCore_575.E("ՎՠՆՑ՛Րևմ֔ֆ՗՝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[38] = NLoginCore_427.B("ƣƀƭƂƢũžƟƣťŬƞưƮƱŵƇƧŵƊźƳƍƁƐǂƣǅƱŹǇƖƔƕǈǊƍƎƪǌƮǇƣƔƶƑǌǌƚǋƬǋƵǑǞơƬƟǒǡƲǧƨǓƽǥǬǥǫǊǁǀǜƪƿǰǇǴǋǎǕǶǺǹǝǶǶƳǞǫǣǛǁǯǒǈȀǂȍǞǛǼǨǏȈǾǤǙ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[39] = NLoginCore_201.C("ԹԣӸӶԙԒՀӲӺԏԗԈ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[40] = NLoginCore_559.F("գ֊սթ֐ք֐՝֌ՔՖՏկո։ծ֚՚֟տ֎ւ֛աճ֨զ֚֨բ֢֖֖տ֎֋֝֟վ֮֐֥։ִչ֣֮ռ֊֑֘֓մֲֵ֗ւ֤֨րֺւָׂ֚׏ֺ׎׍֧֭ג׆ֵג׎ֲֿ֑֖֔וחךּ֢׌ֳק֝ר֛׃֨נט", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[41] = NLoginCore_324.D("ԯԥԦԬԚԽӿԙԕԋՃԮԖԥՇԚԔՁՈԶԄԽՋՌԨՆԒԟՁ԰ՌԗԵԑԻԭԵԗԞ՘Ս԰ՀԬՂԵԯաժԲԴԵՋՈԮԻզԾԩԦձՒՏՁձմդ՛ջՕ՛Չց՗ՂՈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[42] = NLoginCore_173.C("ԳԃӵԘԫԨԏԎՂӹՃԲԛӽՀԻԂՇԧԿԿԢՁԭ԰ՉԬԒՎԬՓՀ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[43] = NLoginCore_384.F("զվ֐ՠՎ֏֋խծժ֖մթո֋՚ոկՖՙշ֕յմՠչշփըը֝խ֢֨֨֏֣վֈ֎֭֭ձկ֤֧֒֘֏ֿ֭֞֬֋ֈ։", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[44] = NLoginCore_427.D("ԒӶԩԆӯԓՀԡԌԪՁԈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[45] = NLoginCore_223.E("՟սքկաՓՍ՞Տ֑֓ղՔպհ՜֎֕՞֢Ք֓֙ջ֤հհ֤֢ք֘ֈ֪զչթր֬ռ֏վֶփ֏քչքַ֙֕ֈֹ׀ׂ֛֫րփ֧׆ֿ֛֗֫׉ׁ֛֧֨׏֦בוִ֢֝", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[46] = NLoginCore_091.B("ƂƚƬżŪƫƧƉƊƆƵžƳŮƫƗƐŭƱƈƜŶƘƴƬǁžƼƹƸƢƻƙǄƠƹƶƣƏǂƈƓƣƟƮƤƷƳǂƑƦǊƩǍƤƥ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[47] = NLoginCore_575.C("ԨԑӹӼԲԭӽԲԓԵԿԯԀԾԥԠԗԷՂՅՄՌԓԔ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[48] = NLoginCore_091.D("ԑԩԻԋӹԺԶԘԙԕՄԘӷՀԷԺԁԣԳԭԙԟԯԧՒՎԠԥԴԪԫԊԩԮՏԷԛՒՌԙ՜ԪԴԸգՀՈԥ՜ԧ՜ՁծԥՄեԻղհ԰բկԳԮ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[49] = NLoginCore_223.B("ƃſƜƛŪƞƭƚƂŻƠƀƠƑŶƊƫƧƫƹƦƇƄƅ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[50] = NLoginCore_027.B("ŹƉƋƀƭƇƍƆƄūƲƊƖƸƴƙƙƃƍưƷŹƠƌƏƜƄƎưŹƢƘƕǂǉƶƍƍƢƣƩƳǑƩǃǋǊǉǛƕƔǇǐǊƯǕƲƻƳưǦǙǦƧ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[51] = NLoginCore_027.F("֎֐իւբ՞֏֒ֆՐֈի֌զ՚յ֌՝թ֙՚ջըթ", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[52] = NLoginCore_453.C("ԑԋԑԴԅԯԒԓԮԱԭԈ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[53] = NLoginCore_076.F("֌֏խՐճցրՍ֑֑֎՝", (byte)89, 70);
                    NLoginCore_247.var_java_lang_String_arr_b[54] = NLoginCore_027.C("ӴԘԌԼԇԝԼӼӹӾӺԈ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[55] = NLoginCore_201.D("ԦԶԛԙԏԘԉՁՁԛԔԗԯӼԁԂԤԼԺԝԼՁԘՄՃԦՇՐ԰ԥ՗ՐՊԖՉԬՎ՝ԙ՛ԜԵՔ՞՘ՄԸ՜ՁԠԪԬԟ՜ԳԴ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[56] = NLoginCore_451.B("ƁųƤƂŦƗƱŮƋƐƏŲưƲŶƚƒƉƤƪƻưƌƎƑƐƞƟƢƆƾƆƴƉƩƺǇǆƤǆǄƯǊƞƷƣƲǉǓƭǇƵǟƿǌǁƮƱƢǍƸƸǠƩǨƥƸƸǯǂǦƣƪǣƮǯƮƷǱưǯǕǱǹǔǽǄǅ", (byte)89, 66);
                    NLoginCore_247.var_java_lang_String_arr_b[57] = NLoginCore_092.E("֎՛՘֊՜ց֏դխյՊֈՌկնՖկպ֟խ֝՟ոյռկը֧ռ֤իե֠֐տ֞֏֎ֵիծ֟ւֲպֲծִ֭տ֓ռָջֲ֢֚ւօտ֝֘֗ֆְ֫֘֎֏֐֩׎׃ֶ׈ֹ֥זם׌ֺ׉֭׍׀ֲח׍ז֯׃דפּ׫ֺ֨עׂׂ֯נ֦זֱ׃ֶךג׭ד׍׏׫לָ׍סֶ׿ָ׹׽؉שז؁נ׿׋׹׈ם׿׳،׭ד״؈קؓוؐאט؜ؔ؜؛؄ؙ؄מר؃תסآؘ׺؃؄װ؄ש؁ױ׶ئװآإأتعؾ؞ؓ؞سؤقػأءؔ؁فطضعظؤ؏هَؓقٌٕؕجمضٜؔؾٞزِٖضػبة", (byte)89, 69);
                    NLoginCore_247.var_java_lang_String_arr_b[58] = NLoginCore_324.C("ԑԩԻԋӹԺԶԘԙԕՁԟԔԣԶԅԣԚԁԄԢՀԠԟԋԤԢԮԓԓՈԘՍՓՓԺՎԩԳԹ՘՘ԚՑԗԶ՛ԲԶԠՔԿԶԶԳԴ", (byte)89, 67);
                    NLoginCore_247.var_java_lang_String_arr_b[59] = NLoginCore_201.A("ŧƟŨƆťŽƍƛƬƲƞŹ", (byte)89, 65);
                    NLoginCore_247.var_java_lang_String_arr_b[60] = NLoginCore_076.D("ԊԨԯԚԌӾӸԉӺԼԾԝӿԥԛԇԹՀԉՍӿԾՄԦՏԛԛՏՍԯՃԳՕԑԤԔԫ՗ԧԺԩաԮԺԯԤԯՄբՀԳդիՖխՆԫԮՒձՂՖժՆղՊՑՕծ՘ՔսժճյՈ", (byte)89, 68);
                    NLoginCore_247.var_java_lang_String_arr_b[61] = NLoginCore_427.D("԰ԊԶԹԹԮԉԈԔԁԽӿԻԴԑԦԲՊԻԅԪԨԈԝԲՁԻՍՌԦՕԴԯԕԧԤԹԝՍԯԩ԰՚ՕԣԽեԠԺգԡԶ՜ԶԳԴ", (byte)89, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_247.var_java_lang_String_arr_b[0] = NLoginCore_076.A("žƩƋŹƮƠƃŬƑƲƵƤŮſƇƣŸŲŻƻƉŽƐƍƘƝżƙƘǀǀǄ", (byte)89, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_247.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ӫԌԺԚԖӷԜԀԼԫԽԈ", (byte)89, 68);
                }
            }
        }
    }

    @EventHandler(priority=-63)
    public void a(PreLoginEvent preLoginEvent) {
        if (preLoginEvent.isCancelled()) {
            return;
        }
        try {
            this.c(preLoginEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_247.c("㺀", (int)var_int_a, (long)var_long_b) + preLoginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)var_int_c, (long)(d ^ e)) + preLoginEvent.getConnection().getName() + (String)NLoginCore_247.c("㺆", (int)(var_int_f & g), (long)h), throwable, new Object[i]);
            preLoginEvent.setCancelled(j != 0);
            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺉", (int)k, (long)(l ^ m))));
        }
    }

    @EventHandler(priority=-128)
    public void a(LoginEvent loginEvent) {
        try {
            this.b(loginEvent);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_247.c("㺀", (int)ab, (long)ac) + loginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)ad, (long)(ae ^ af)) + loginEvent.getConnection().getName() + (String)NLoginCore_247.c("㺆", (int)ag, (long)(ah ^ ai)), throwable, new Object[aj]);
            loginEvent.setCancelled(ak != 0);
            loginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺉", (int)al, (long)(am ^ an))));
        }
    }

    private boolean a(PreLoginEvent preLoginEvent, String string, boolean bl, ForceRegisterConfig ForceRegisterConfig2) {
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 == null || !NLoginCore_277.R()) {
            return is != 0;
        }
        NLoginCore_509 NLoginCore_5092 = this.D.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        int n = NLoginCore_5092 != null && System.currentTimeMillis() - NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_h, Long.valueOf(0L)) > it ? iu : iv;
        InetAddress inetAddress = ((InetSocketAddress)preLoginEvent.getConnection().getSocketAddress()).getAddress();
        String string2 = inetAddress.getHostAddress();
        String string3 = NLoginCore_150.a(NLoginCore_374.Y, new Object[iw]);
        if (n != 0 && (bl || NLoginCore_532.L.ar() && (inetAddress.equals(NLoginCore_277.java_net_InetSocketAddress_b().getAddress()) || string2.equals(ForceRegisterConfig2.k())))) {
            NLoginCore_277.a(string3);
            return ix != 0;
        }
        preLoginEvent.setCancelled(iy != 0);
        preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string3));
        return iz != 0;
    }

    @EventHandler
    public void b(PlayerDisconnectEvent playerDisconnectEvent) {
        ProxiedPlayer proxiedPlayer = playerDisconnectEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f.java_lang_Object_b().a(proxiedPlayer);
            ((NLoginType_031)this.D.com_nickuc_login_NLoginCore_056_b()).d(NLoginCore_277);
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_247.c("㺀", (int)bb, (long)(bc ^ bd)) + playerDisconnectEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)(be & bf), (long)bg) + proxiedPlayer.getName() + (String)NLoginCore_247.c("㺆", (int)bh, (long)(bi ^ bj)), throwable, new Object[bk]);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺉", (int)(bl & bm), (long)bn)));
        }
    }

    @Generated
    public NLoginCore_247(nLoginBungee nLoginBungee2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f = nLoginBungee2;
        this.D = NLoginType_008;
    }

    private void d(PreLoginEvent preLoginEvent) {
        boolean bl;
        Object object;
        Object object2;
        FloodgatePlayer floodgatePlayer;
        PendingConnection pendingConnection = preLoginEvent.getConnection();
        String string = pendingConnection.getName();
        InetAddress inetAddress = ((InetSocketAddress)pendingConnection.getSocketAddress()).getAddress();
        Channel channel = NLoginCore_339.a(preLoginEvent, pendingConnection);
        if (channel == null) {
            preLoginEvent.setCancelled(br != 0);
            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)((String)NLoginCore_247.c("㺀", (int)bs, (long)(bt ^ bu)) + preLoginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)bv, (long)(bw ^ bx)))));
            return;
        }
        if (this.D.com_nickuc_login_NLoginCore_581_b().e(channel)) {
            return;
        }
        NLoginInterface_031 NLoginInterface_0312 = this.D.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
        NLoginCore_271 NLoginCore_2712 = null;
        UUID uUID = null;
        if (NLoginInterface_0312 instanceof NLoginCore_418 && (floodgatePlayer = ((NLoginCore_418)(object2 = (NLoginCore_418)NLoginInterface_0312)).org_geysermc_floodgate_api_player_FloodgatePlayer_a(pendingConnection.getUniqueId())) != null) {
            object = floodgatePlayer.getCorrectUsername();
            if (!string.equals(object)) {
                throw new IllegalStateException((String)NLoginCore_247.c("㺆", (int)(by & bz), (long)ca) + string + (String)NLoginCore_247.c("㺉", (int)cb, (long)(cc ^ cd)) + (String)object);
            }
            NLoginCore_2712 = new NLoginCore_271(floodgatePlayer);
            uUID = floodgatePlayer.getJavaUniqueId();
        }
        object2 = null;
        if (BCryptHashProvider.c() != NLoginCore_555.var_com_nickuc_login_NLoginCore_555_f && NLoginCore_435.aC() && pendingConnection.getVersion() >= ce) {
            try {
                object2 = new NLoginCore_047(NLoginCore_435.a(pendingConnection));
            }
            catch (IllegalAccessException illegalAccessException) {
                NLoginCore_370.d((String)NLoginCore_247.c("㺌", (int)cf, (long)cg) + illegalAccessException.getMessage(), new Object[ch]);
            }
        }
        if (bl = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            NLoginCore_460 NLoginCore_4602;
            String string2;
            Object object3 = null;
            if (NLoginCore_2712 != null) {
                object = string;
                string2 = object;
                object3 = this.D.com_nickuc_login_NLoginCore_291_a().a((String)object, null, uUID, ci != 0);
                if (object3 == null) {
                    String string3 = NLoginCore_150.a(NLoginCore_374.w, new Object[cj]);
                    preLoginEvent.setCancelled(ck != 0);
                    preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string3));
                    return;
                }
                if (!this.D.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a().J() && !((ForceRegisterConfig)object3).u()) {
                    if (!this.D.com_nickuc_login_NLoginCore_291_a().b((ForceRegisterConfig)object3, string)) {
                        String string4 = NLoginCore_150.a(NLoginCore_374.w, new Object[cl]);
                        preLoginEvent.setCancelled(cm != 0);
                        preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string4));
                        return;
                    }
                    string2 = BCryptHashProvider.g(((ForceRegisterConfig)object3).d((String)object), ((ForceRegisterConfig)object3).t());
                }
                NLoginCore_4602 = null;
            } else {
                Object object4;
                String string5 = pendingConnection.getVirtualHost().getHostName();
                NLoginCore_4602 = NLoginCore_460.a(string5);
                if (!NLoginCore_4602.aQ() && object2 != null) {
                    NLoginCore_460 NLoginCore_4603 = NLoginCore_4602 = ((NLoginCore_047)object2).java_util_UUID_b() != null && ((NLoginCore_047)object2).a(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f) ? NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b : NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                    if (NLoginCore_4602 == NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b) {
                        object4 = this.D.com_nickuc_login_NLoginCore_291_a().a(string, ((NLoginCore_047)object2).java_util_UUID_b(), cn != 0);
                        if (object4 == null) {
                            String string6 = NLoginCore_150.a(NLoginCore_374.w, new Object[co]);
                            preLoginEvent.setCancelled(cp != 0);
                            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string6));
                            return;
                        }
                        String string7 = ((ForceRegisterConfig)object4).d(string);
                        NLoginCore_184 NLoginCore_1842 = NLoginCore_073.com_nickuc_login_NLoginCore_184_a(string7, inetAddress);
                        if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_c && ((ForceRegisterConfig)object4).r() && !((ForceRegisterConfig)object4).t()) {
                            NLoginCore_073.a(this.D, string7, inetAddress, NLoginCore_184.var_com_nickuc_login_NLoginCore_184_b);
                            object3 = object4;
                            if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_e) {
                                NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                            }
                        }
                    }
                }
                if (!NLoginCore_4602.aQ() && this.D.com_nickuc_login_NLoginCore_495_a().p()) {
                    NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                }
                switch (NLoginCore_404.U[NLoginCore_4602.ordinal()]) {
                    case 1: {
                        pendingConnection.setOnlineMode(cq != 0);
                        object = string;
                        string2 = BCryptHashProvider.g((String)object, cr != 0);
                        break;
                    }
                    case 2: {
                        if (object3 == null && (object3 = this.D.com_nickuc_login_NLoginCore_291_a().a(string, null, null, cs != 0)) == null) {
                            object4 = NLoginCore_150.a(NLoginCore_374.w, new Object[ct]);
                            preLoginEvent.setCancelled(cu != 0);
                            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)object4));
                            return;
                        }
                        if (!this.D.com_nickuc_login_NLoginCore_291_a().b((ForceRegisterConfig)object3, string)) {
                            object4 = NLoginCore_150.a(NLoginCore_374.w, new Object[cv]);
                            preLoginEvent.setCancelled(cw != 0);
                            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)object4));
                            return;
                        }
                        object = ((ForceRegisterConfig)object3).d(string);
                        string2 = BCryptHashProvider.g((String)object, cx != 0);
                        object4 = NLoginCore_432.d((String)object);
                        if (pendingConnection.isOnlineMode()) {
                            pendingConnection.setOnlineMode(cy != 0);
                        }
                        try {
                            NLoginCore_435.a(pendingConnection, string2);
                            NLoginCore_435.a(pendingConnection, (UUID)object4);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            NLoginCore_370.c((String)NLoginCore_247.c("㺏", (int)(cz & da), (long)db) + (String)object + (String)NLoginCore_247.c("㺒", (int)dc, (long)dd), illegalAccessException, new Object[de]);
                            preLoginEvent.setCancelled(df != 0);
                            preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺕", (int)dg, (long)dh)));
                        }
                        break;
                    }
                    case 3: {
                        Object[] objectArray = new Object[di];
                        objectArray[NLoginCore_247.dj] = string5;
                        object4 = NLoginCore_150.a(NLoginCore_374.Z, objectArray);
                        preLoginEvent.setCancelled(dk != 0);
                        preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)object4));
                        return;
                    }
                    case 4: {
                        if (NLoginCore_150.j()) {
                            String[] stringArray = new String[dl];
                            stringArray[NLoginCore_247.dm] = (String)NLoginCore_247.c("㺘", (int)dn, (long)(cfr_renamed_1 ^ dp)) + string5 + (String)NLoginCore_247.c("㺛", (int)dq, (long)(dr ^ ds));
                            stringArray[NLoginCore_247.dt] = NLoginCore_247.c("㺞", (int)du, (long)(dv ^ dw));
                            stringArray[NLoginCore_247.dx] = NLoginCore_247.c("㺡", (int)dy, (long)(dz ^ ea));
                            stringArray[NLoginCore_247.eb] = NLoginCore_247.c("㺤", (int)ec, (long)(ed ^ ee));
                            stringArray[NLoginCore_247.ef] = NLoginCore_247.c("㺧", (int)eg, (long)(eh ^ ei));
                            stringArray[NLoginCore_247.ej] = NLoginCore_247.c("㺪", (int)ek, (long)(el ^ em));
                            object4 = NLoginCore_112.a(stringArray);
                        } else {
                            String[] stringArray = new String[en];
                            stringArray[NLoginCore_247.eo] = (String)NLoginCore_247.c("㺭", (int)(ep & eq), (long)er) + string5 + (String)NLoginCore_247.c("㺰", (int)(es & et), (long)eu);
                            stringArray[NLoginCore_247.ev] = NLoginCore_247.c("㺳", (int)ew, (long)ex);
                            stringArray[NLoginCore_247.ey] = NLoginCore_247.c("㺶", (int)ez, (long)fa);
                            stringArray[NLoginCore_247.fb] = NLoginCore_247.c("㺹", (int)(fc & fd), (long)fe);
                            stringArray[NLoginCore_247.ff] = NLoginCore_247.c("㺼", (int)fg, (long)fh);
                            stringArray[NLoginCore_247.fi] = NLoginCore_247.c("㺿", (int)fj, (long)(fk ^ fl));
                            object4 = NLoginCore_112.a(stringArray);
                        }
                        preLoginEvent.setCancelled(fm != 0);
                        preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)object4));
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException((String)NLoginCore_247.c("㻂", (int)fn, (long)(fo ^ fp)) + (Object)((Object)NLoginCore_4602));
                    }
                }
            }
            if (this.a(preLoginEvent, string2, (NLoginCore_2712 != null && ((ForceRegisterConfig)object3).u() ? fq : fr) != 0, (ForceRegisterConfig)object3)) {
                return;
            }
            channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)new NLoginCore_588((ForceRegisterConfig)object3, (String)object, NLoginCore_2712, NLoginCore_4602));
        } else {
            String string8;
            object = this.D.com_nickuc_login_NLoginCore_291_a().a(string, null, uUID, fs != 0);
            if (object == null) {
                String string9 = NLoginCore_150.a(NLoginCore_374.w, new Object[ft]);
                preLoginEvent.setCancelled(fu != 0);
                preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string9));
                return;
            }
            String string10 = string;
            if (NLoginCore_2712 == null || !this.D.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a().J() && !((ForceRegisterConfig)object).u()) {
                if (!this.D.com_nickuc_login_NLoginCore_291_a().b((ForceRegisterConfig)object, string)) {
                    String string11 = NLoginCore_150.a(NLoginCore_374.w, new Object[fv]);
                    preLoginEvent.setCancelled(fw != 0);
                    preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)string11));
                    return;
                }
                string8 = ((ForceRegisterConfig)object).d(string10);
                if (!string10.equals(string8)) {
                    try {
                        NLoginCore_435.a(pendingConnection, string8);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        NLoginCore_370.c((String)NLoginCore_247.c("㻅", (int)fx, (long)fy) + string10 + (String)NLoginCore_247.c("㻈", (int)fz, (long)ga), illegalAccessException, new Object[gb]);
                        preLoginEvent.setCancelled(gc != 0);
                        preLoginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_247.c("㻋", (int)gd, (long)ge)));
                    }
                    string10 = string8;
                }
            }
            channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).set((Object)new NLoginCore_588((ForceRegisterConfig)object, string10, NLoginCore_2712, null));
            if (NLoginCore_2712 == null) {
                string8 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f.com_nickuc_login_loader_platform_BungeeLoader_a();
                preLoginEvent.registerIntent((Plugin)string8);
                String string12 = string10;
                Object object5 = object2;
                this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f.a(gf != 0).a(() -> this.a(preLoginEvent, (ForceRegisterConfig)object, string12, inetAddress, (NLoginCore_047)object5, pendingConnection, (Plugin)string8));
            } else {
                this.a(preLoginEvent, string10, ((ForceRegisterConfig)object).u(), (ForceRegisterConfig)object);
            }
        }
    }

    @EventHandler(priority=-64)
    public void b(PostLoginEvent postLoginEvent) {
        ProxiedPlayer proxiedPlayer = postLoginEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_f.java_lang_Object_b().a(proxiedPlayer);
            if (NLoginCore_277.S()) {
                return;
            }
            PendingConnection pendingConnection = proxiedPlayer.getPendingConnection();
            Channel channel = NLoginCore_339.a(postLoginEvent, pendingConnection);
            String string = ((NLoginType_031)this.D.com_nickuc_login_NLoginCore_056_b()).a(NLoginCore_277, postLoginEvent, channel, pendingConnection.isOnlineMode());
            if (string != null) {
                proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)string));
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_247.c("㺀", (int)ao, (long)(ap ^ aq)) + postLoginEvent.getClass().getSimpleName() + (String)NLoginCore_247.c("㺃", (int)ar, (long)(as ^ at)) + proxiedPlayer.getName() + (String)NLoginCore_247.c("㺆", (int)(au & av), (long)aw), throwable, new Object[ax]);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginCore_247.c("㺉", (int)ay, (long)(az ^ ba))));
        }
    }

    static {
        var_int_a = 0 >>> 165 | 0 << ~165 + 1;
        var_long_b = Long.reverse(-2433164515615058875L);
        var_int_c = (0x10000000 >>> 220 | 0x10000000 << ~220 + 1) & 0xFFFFFFFF;
        d = Long.reverse(-8774232790952717243L);
        e = Long.reverse(0x5800000000000000L);
        var_int_f = Integer.reverse(0x40000000);
        g = Integer.reverse(-1);
        h = Long.reverse(-2433164515615058875L);
        i = (0 >>> 253 | 0 << ~253 + 1) & 0xFFFFFFFF;
        j = 0x2000000 >>> 25 | 0x2000000 << ~25 + 1;
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-8774232790952717243L);
        m = Long.reverse(0x5800000000000000L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(-8774232790952717243L);
        p = Long.reverse(0x5800000000000000L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(-8774232790952717243L);
        s = Long.reverse(0x5800000000000000L);
        t = Integer.reverse(0x60000000);
        u = Integer.reverse(-1);
        v = Long.reverse(-2433164515615058875L);
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(-536870912);
        z = Integer.reverse(-1);
        aa = Long.reverse(-2433164515615058875L);
        ab = 16 >>> 1 | 16 << -1;
        ac = Long.reverse(-2433164515615058875L);
        ad = 0x9000000 >>> 24 | 0x9000000 << -24;
        ae = Long.reverse(-8774232790952717243L);
        af = Long.reverse(0x5800000000000000L);
        ag = 0x50000000 >>> 219 | 0x50000000 << ~219 + 1;
        ah = Long.reverse(-8774232790952717243L);
        ai = Long.reverse(0x5800000000000000L);
        aj = Integer.reverse(0);
        ak = (0x1000000 >>> 216 | 0x1000000 << -216) & 0xFFFFFFFF;
        al = Integer.reverse(-805306368);
        am = Long.reverse(-8774232790952717243L);
        an = Long.reverse(0x5800000000000000L);
        ao = -2147483647 >>> 125 | -2147483647 << ~125 + 1;
        ap = Long.reverse(-8774232790952717243L);
        aq = Long.reverse(0x5800000000000000L);
        ar = Integer.reverse(-1342177280);
        as = Long.reverse(-8774232790952717243L);
        at = Long.reverse(0x5800000000000000L);
        au = 1792 >>> 135 | 1792 << ~135 + 1;
        av = (-1 >>> 58 | -1 << ~58 + 1) & 0xFFFFFFFF;
        aw = Long.reverse(-2433164515615058875L);
        ax = (0 >>> 20 | 0 << -20) & 0xFFFFFFFF;
        ay = (-1073741821 >>> 254 | -1073741821 << -254) & 0xFFFFFFFF;
        az = Long.reverse(-8774232790952717243L);
        ba = Long.reverse(0x5800000000000000L);
        bb = (8192 >>> 9 | 8192 << -9) & 0xFFFFFFFF;
        bc = Long.reverse(-8774232790952717243L);
        bd = Long.reverse(0x5800000000000000L);
        be = (34816 >>> 171 | 34816 << ~171 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(-1);
        bg = Long.reverse(-2433164515615058875L);
        bh = 9 >>> 255 | 9 << ~255 + 1;
        bi = Long.reverse(-8774232790952717243L);
        bj = Long.reverse(0x5800000000000000L);
        bk = 0 >>> 26 | 0 << -26;
        bl = Integer.reverse(-939524096);
        bm = (-1 >>> 223 | -1 << ~223 + 1) & 0xFFFFFFFF;
        bn = Long.reverse(-2433164515615058875L);
        bo = 2048 >>> 43 | 2048 << ~43 + 1;
        bp = Integer.reverse(0);
        bq = Integer.reverse(Integer.MIN_VALUE);
        br = (0x800000 >>> 151 | 0x800000 << -151) & 0xFFFFFFFF;
        bs = (5 >>> 158 | 5 << -158) & 0xFFFFFFFF;
        bt = Long.reverse(-8774232790952717243L);
        bu = Long.reverse(0x5800000000000000L);
        bv = -1610612734 >>> 61 | -1610612734 << ~61 + 1;
        bw = Long.reverse(-8774232790952717243L);
        bx = Long.reverse(0x5800000000000000L);
        by = Integer.reverse(0x68000000);
        bz = (-1 >>> 89 | -1 << ~89 + 1) & 0xFFFFFFFF;
        ca = Long.reverse(-2433164515615058875L);
        cb = (0x5C00000 >>> 86 | 0x5C00000 << -86) & 0xFFFFFFFF;
        cc = Long.reverse(-8774232790952717243L);
        cd = Long.reverse(0x5800000000000000L);
        ce = (24320 >>> 5 | 24320 << ~5 + 1) & 0xFFFFFFFF;
        cf = (786432 >>> 239 | 786432 << -239) & 0xFFFFFFFF;
        cg = Long.reverse(-2433164515615058875L);
        ch = (0 >>> 76 | 0 << ~76 + 1) & 0xFFFFFFFF;
        ci = 0 >>> 21 | 0 << ~21 + 1;
        cj = Integer.reverse(0);
        ck = Integer.reverse(Integer.MIN_VALUE);
        cl = Integer.reverse(0);
        cm = 4096 >>> 76 | 4096 << -76;
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = Integer.reverse(0);
        cp = (0x400000 >>> 150 | 0x400000 << -150) & 0xFFFFFFFF;
        cq = (262144 >>> 210 | 262144 << -210) & 0xFFFFFFFF;
        cr = (1024 >>> 170 | 1024 << -170) & 0xFFFFFFFF;
        cs = Integer.reverse(0);
        ct = Integer.reverse(0);
        cu = (0x2000000 >>> 121 | 0x2000000 << -121) & 0xFFFFFFFF;
        cv = Integer.reverse(0);
        cw = Integer.reverse(Integer.MIN_VALUE);
        cx = (0 >>> 83 | 0 << ~83 + 1) & 0xFFFFFFFF;
        cy = 0 >>> 205 | 0 << -205;
        cz = 0x3200000 >>> 245 | 0x3200000 << ~245 + 1;
        da = (-1 >>> 150 | -1 << ~150 + 1) & 0xFFFFFFFF;
        db = Long.reverse(-2433164515615058875L);
        dc = (3328 >>> 167 | 3328 << ~167 + 1) & 0xFFFFFFFF;
        dd = Long.reverse(-2433164515615058875L);
        de = 0 >>> 49 | 0 << -49;
        df = Integer.reverse(Integer.MIN_VALUE);
        dg = Integer.reverse(-671088640);
        dh = Long.reverse(-2433164515615058875L);
        di = Integer.reverse(Integer.MIN_VALUE);
        dj = 0 >>> 132 | 0 << -132;
        dk = Integer.reverse(Integer.MIN_VALUE);
        dl = 48 >>> 131 | 48 << ~131 + 1;
        dm = Integer.reverse(0);
        dn = (-2147483645 >>> 189 | -2147483645 << -189) & 0xFFFFFFFF;
        cfr_renamed_1 = Long.reverse(-8774232790952717243L);
        dp = Long.reverse(0x5800000000000000L);
        dq = (58 >>> 225 | 58 << ~225 + 1) & 0xFFFFFFFF;
        dr = Long.reverse(-8774232790952717243L);
        ds = Long.reverse(0x5800000000000000L);
        dt = Integer.reverse(Integer.MIN_VALUE);
        du = Integer.reverse(0x78000000);
        dv = Long.reverse(-8774232790952717243L);
        dw = Long.reverse(0x5800000000000000L);
        dx = Integer.reverse(0x40000000);
        dy = Integer.reverse(-134217728);
        dz = Long.reverse(-8774232790952717243L);
        ea = Long.reverse(0x5800000000000000L);
        eb = (1536 >>> 9 | 1536 << -9) & 0xFFFFFFFF;
        ec = Integer.reverse(0x4000000);
        ed = Long.reverse(-8774232790952717243L);
        ee = Long.reverse(0x5800000000000000L);
        ef = (32768 >>> 109 | 32768 << ~109 + 1) & 0xFFFFFFFF;
        eg = Integer.reverse(-2080374784);
        eh = Long.reverse(-8774232790952717243L);
        ei = Long.reverse(0x5800000000000000L);
        ej = 640 >>> 231 | 640 << ~231 + 1;
        ek = 0x880000 >>> 18 | 0x880000 << ~18 + 1;
        el = Long.reverse(-8774232790952717243L);
        em = Long.reverse(0x5800000000000000L);
        en = Integer.reverse(0x60000000);
        eo = (0 >>> 224 | 0 << -224) & 0xFFFFFFFF;
        ep = Integer.reverse(-1006632960);
        eq = -1 >>> 156 | -1 << ~156 + 1;
        er = Long.reverse(-2433164515615058875L);
        es = Integer.reverse(0x24000000);
        et = Integer.reverse(-1);
        eu = Long.reverse(-2433164515615058875L);
        ev = 16384 >>> 46 | 16384 << -46;
        ew = Integer.reverse(-1543503872);
        ex = Long.reverse(-2433164515615058875L);
        ey = Integer.reverse(0x40000000);
        ez = Integer.reverse(0x64000000);
        fa = Long.reverse(-2433164515615058875L);
        fb = (-2147483647 >>> 63 | -2147483647 << ~63 + 1) & 0xFFFFFFFF;
        fc = (4992 >>> 135 | 4992 << ~135 + 1) & 0xFFFFFFFF;
        fd = Integer.reverse(-1);
        fe = Long.reverse(-2433164515615058875L);
        ff = Integer.reverse(0x20000000);
        fg = 0xA000000 >>> 246 | 0xA000000 << -246;
        fh = Long.reverse(-2433164515615058875L);
        fi = Integer.reverse(-1610612736);
        fj = (343932928 >>> 183 | 343932928 << -183) & 0xFFFFFFFF;
        fk = Long.reverse(-8774232790952717243L);
        fl = Long.reverse(0x5800000000000000L);
        fm = Integer.reverse(Integer.MIN_VALUE);
        fn = Integer.reverse(0x54000000);
        fo = Long.reverse(-8774232790952717243L);
        fp = Long.reverse(0x5800000000000000L);
        fq = Integer.reverse(Integer.MIN_VALUE);
        fr = (0 >>> 166 | 0 << ~166 + 1) & 0xFFFFFFFF;
        fs = 1024 >>> 106 | 1024 << ~106 + 1;
        ft = Integer.reverse(0);
        fu = 8192 >>> 45 | 8192 << -45;
        fv = Integer.reverse(0);
        fw = 2048 >>> 43 | 2048 << ~43 + 1;
        fx = Integer.reverse(-738197504);
        fy = Long.reverse(-2433164515615058875L);
        fz = Integer.reverse(0x34000000);
        ga = Long.reverse(-2433164515615058875L);
        gb = Integer.reverse(0);
        gc = Integer.reverse(Integer.MIN_VALUE);
        gd = -1610612731 >>> 61 | -1610612731 << -61;
        ge = Long.reverse(-2433164515615058875L);
        gf = Integer.reverse(Integer.MIN_VALUE);
        gg = (0x5C000000 >>> 153 | 0x5C000000 << -153) & 0xFFFFFFFF;
        gh = Integer.reverse(-1);
        gi = Long.reverse(-2433164515615058875L);
        gj = (188 >>> 98 | 188 << ~98 + 1) & 0xFFFFFFFF;
        gk = -1 >>> 229 | -1 << ~229 + 1;
        gl = Long.reverse(-2433164515615058875L);
        gm = 12 >>> 30 | 12 << -30;
        gn = Long.reverse(-2433164515615058875L);
        go = (3136 >>> 38 | 3136 << -38) & 0xFFFFFFFF;
        gp = Long.reverse(-2433164515615058875L);
        gq = Integer.reverse(0x4C000000);
        gr = Long.reverse(-8774232790952717243L);
        gs = Long.reverse(0x5800000000000000L);
        gt = (0 >>> 94 | 0 << ~94 + 1) & 0xFFFFFFFF;
        gu = Integer.reverse(-1610612736);
        gv = (0 >>> 40 | 0 << -40) & 0xFFFFFFFF;
        gw = 3264 >>> 198 | 3264 << -198;
        gx = Integer.reverse(-1);
        gy = Long.reverse(-2433164515615058875L);
        gz = Integer.reverse(Integer.MIN_VALUE);
        ha = (0x3400000 >>> 20 | 0x3400000 << ~20 + 1) & 0xFFFFFFFF;
        hb = Long.reverse(-2433164515615058875L);
        hc = Integer.MIN_VALUE >>> 30 | Integer.MIN_VALUE << -30;
        hd = (1736704 >>> 79 | 1736704 << ~79 + 1) & 0xFFFFFFFF;
        he = Long.reverse(-8774232790952717243L);
        hf = Long.reverse(0x5800000000000000L);
        hg = Integer.reverse(-1073741824);
        hh = (110592 >>> 107 | 110592 << ~107 + 1) & 0xFFFFFFFF;
        hi = Long.reverse(-8774232790952717243L);
        hj = Long.reverse(0x5800000000000000L);
        hk = (262144 >>> 16 | 262144 << ~16 + 1) & 0xFFFFFFFF;
        hl = 225280 >>> 204 | 225280 << ~204 + 1;
        hm = Long.reverse(-8774232790952717243L);
        hn = Long.reverse(0x5800000000000000L);
        ho = Integer.reverse(0x1C000000);
        hp = Long.reverse(-8774232790952717243L);
        hq = Long.reverse(0x5800000000000000L);
        hr = 0 >>> 10 | 0 << ~10 + 1;
        hs = Integer.reverse(-1677721600);
        ht = (-1 >>> 131 | -1 << -131) & 0xFFFFFFFF;
        hu = Long.reverse(-2433164515615058875L);
        hv = (16384 >>> 204 | 16384 << ~204 + 1) & 0xFFFFFFFF;
        hw = 0 >>> 128 | 0 << ~128 + 1;
        hx = Integer.reverse(Integer.MIN_VALUE);
        hy = Integer.reverse(0x40000000);
        hz = Integer.reverse(-1073741824);
        ia = 0x2000000 >>> 185 | 0x2000000 << -185;
        ib = (0 >>> 29 | 0 << -29) & 0xFFFFFFFF;
        ic = (0 >>> 20 | 0 << ~20 + 1) & 0xFFFFFFFF;
        id = 0 >>> 126 | 0 << -126;
        ie = Integer.reverse(Integer.MIN_VALUE);
        cfr_renamed_0 = 58 >>> 0 | 58 << -0;
        ig = Long.reverse(-8774232790952717243L);
        ih = Long.reverse(0x5800000000000000L);
        ii = 7552 >>> 103 | 7552 << ~103 + 1;
        ij = Long.reverse(-8774232790952717243L);
        ik = Long.reverse(0x5800000000000000L);
        il = Integer.reverse(0);
        im = Integer.reverse(0x3C000000);
        in = Long.reverse(-8774232790952717243L);
        io = Long.reverse(0x5800000000000000L);
        ip = Integer.reverse(0);
        iq = (0 >>> 179 | 0 << -179) & 0xFFFFFFFF;
        ir = (0 >>> 93 | 0 << ~93 + 1) & 0xFFFFFFFF;
        is = Integer.reverse(0);
        it = Long.reverse(1934296039955628032L);
        iu = Integer.reverse(Integer.MIN_VALUE);
        iv = (0 >>> 51 | 0 << ~51 + 1) & 0xFFFFFFFF;
        iw = Integer.reverse(0);
        ix = Integer.reverse(0);
        iy = (65536 >>> 80 | 65536 << ~80 + 1) & 0xFFFFFFFF;
        iz = Integer.reverse(Integer.MIN_VALUE);
        ja = Integer.reverse(Integer.MIN_VALUE);
        jb = Integer.reverse(Integer.MIN_VALUE);
        jc = Integer.reverse(Integer.MIN_VALUE);
        jd = (0 >>> 69 | 0 << ~69 + 1) & 0xFFFFFFFF;
        je = Integer.reverse(Integer.MIN_VALUE);
        jf = Integer.reverse(Integer.MIN_VALUE);
        jg = Integer.reverse(0);
        jh = 0 >>> 80 | 0 << -80;
        ji = 0x400000 >>> 118 | 0x400000 << -118;
        jj = Integer.reverse(-1140850688);
        jk = Long.reverse(-8774232790952717243L);
        jl = Long.reverse(0x5800000000000000L);
        jm = Integer.reverse(0x7C000000);
        jn = Integer.reverse(0x7C000000);
        var_java_lang_String_arr_a = new String[jm];
        var_java_lang_String_arr_b = new String[jn];
        NLoginCore_247.b();
    }
}

