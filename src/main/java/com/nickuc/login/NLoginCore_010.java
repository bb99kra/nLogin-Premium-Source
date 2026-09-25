/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.geysermc.floodgate.api.player.FloodgatePlayer
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.lib.packetevents.api.wrapper.login.server.WrapperLoginServerEncryptionRequest;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_306;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_481;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_313;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_234;
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
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_009;
import com.nickuc.login.NLoginCore_522;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_179;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_254;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_271;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_047;
import com.nickuc.login.NLoginCore_184;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_517;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_418;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_010
implements NLoginInterface_003 {
    private static int cr;
    private static int dt;
    private static long bu;
    private static int bi;
    private static String[] var_java_lang_String_arr_a;
    private static int bm;
    private static int u;
    private static long bk;
    private static int am;
    private static int bo;
    private static int cd;
    private static int dp;
    private static int bv;
    private static int cc;
    private static long ct;
    private static long by;
    private static int r;
    private static long dv;
    private static int ad;
    private static int o;
    private static long ao;
    private static int db;
    private static int v;
    private static int cp;
    private static int ch;
    private static int dh;
    private static int dy;
    private static int var_int_a;
    private static int i;
    private static int cv;
    private static int n;
    private static int dk;
    private static int p;
    private static long cx;
    private static int ar;
    private static long ds;
    private static long cs;
    private static long ap;
    private static int x;
    private static int ag;
    private static int dn;
    private static int cy;
    private static String[] var_java_lang_String_arr_b;
    private static int cl;
    private static long af;
    private static int cj;
    private static int ca;
    private static long cb;
    private static int ay;
    private static int w;
    private static long cm;
    private static int bf;
    private static int co;
    private static long f;
    private static long cq;
    private static long as;
    private static int at;
    private static int ce;
    private static int dg;
    private static int ae;
    private static long az;
    private static int ck;
    private static long bg;
    private static int ab;
    private static long av;
    private static int q;
    private static int cf;
    private static int dr;
    private static long br;
    private static int dm;
    private static int t;
    private static int dw;
    private static long dq;
    private static int e;
    private static int m;
    private static int cfr_renamed_1;
    private static int aq;
    private static long bq;
    private static int ak;
    private static int ax;
    private static int k;
    private static int an;
    private static int y;
    private static long var_long_c;
    private static int aj;
    private static int dj;
    private static int ac;
    private static int bc;
    private static int bd;
    private static long aw;
    private static int cz;
    private static int bb;
    private static int da;
    private static int bp;
    private static long cw;
    private static int dx;
    private static int dc;
    private static int cg;
    private static long bn;
    private static int dd;
    private static int dl;
    private static long var_long_b;
    final /* synthetic */ NLoginCore_313 var_com_nickuc_login_NLoginCore_313_b;
    private static int df;
    private static long l;
    private static int aa;
    private static long di;
    private static int bt;
    private static int h;
    private static int de;
    private static long ai;
    private static int du;
    private static long ah;
    private final SecureRandom var_java_security_SecureRandom_c = new SecureRandom();
    private static int bs;
    private static int bw;
    private static int au;
    private static int bz;
    private static int bl;
    private static int ba;
    private static long al;
    private static long j;
    private static int s;
    private static int cu;
    private static long be;
    private static long bj;
    private static int cn;
    private static long g;
    private static int ci;
    private static int bh;
    private static int z;
    private static long d;
    private static long bx;

    static {
        var_int_a = (0 >>> 59 | 0 << ~59 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(1425072070374790578L);
        d = Long.reverse(0x6800000000000000L);
        e = 16384 >>> 110 | 16384 << -110;
        f = Long.reverse(1425072070374790578L);
        g = Long.reverse(0x6800000000000000L);
        h = (0x1000000 >>> 55 | 0x1000000 << ~55 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(-1);
        j = Long.reverse(8919061850319295922L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(8919061850319295922L);
        m = 16384 >>> 110 | 16384 << ~110 + 1;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = (2 >>> 1 | 2 << ~1 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = (0 >>> 38 | 0 << ~38 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(Integer.MIN_VALUE);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(0);
        v = 0 >>> 209 | 0 << ~209 + 1;
        w = (0 >>> 130 | 0 << -130) & 0xFFFFFFFF;
        x = 0 >>> 144 | 0 << ~144 + 1;
        y = 0 >>> 202 | 0 << ~202 + 1;
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(0);
        ab = Integer.reverse(0x60000000);
        ac = Integer.reverse(0);
        ad = 256 >>> 198 | 256 << ~198 + 1;
        ae = Integer.reverse(-1);
        af = Long.reverse(8919061850319295922L);
        ag = Integer.reverse(-1610612736);
        ah = Long.reverse(1425072070374790578L);
        ai = Long.reverse(0x6800000000000000L);
        aj = (16384 >>> 14 | 16384 << -14) & 0xFFFFFFFF;
        ak = Integer.reverse(0x60000000);
        al = Long.reverse(8919061850319295922L);
        am = Integer.reverse(0x40000000);
        an = (0x3800000 >>> 247 | 0x3800000 << -247) & 0xFFFFFFFF;
        ao = Long.reverse(1425072070374790578L);
        ap = Long.reverse(0x6800000000000000L);
        aq = 6 >>> 97 | 6 << -97;
        ar = Integer.reverse(0x10000000);
        as = Long.reverse(8919061850319295922L);
        at = (131072 >>> 207 | 131072 << -207) & 0xFFFFFFFF;
        au = (288 >>> 133 | 288 << ~133 + 1) & 0xFFFFFFFF;
        av = Long.reverse(1425072070374790578L);
        aw = Long.reverse(0x6800000000000000L);
        ax = Integer.reverse(-1610612736);
        ay = Integer.reverse(0x50000000);
        az = Long.reverse(8919061850319295922L);
        ba = 768 >>> 135 | 768 << ~135 + 1;
        bb = Integer.reverse(0);
        bc = 360448 >>> 175 | 360448 << ~175 + 1;
        bd = (-1 >>> 50 | -1 << ~50 + 1) & 0xFFFFFFFF;
        be = Long.reverse(8919061850319295922L);
        bf = Integer.reverse(0x30000000);
        bg = Long.reverse(8919061850319295922L);
        bh = Integer.reverse(Integer.MIN_VALUE);
        bi = 851968 >>> 16 | 851968 << -16;
        bj = Long.reverse(1425072070374790578L);
        bk = Long.reverse(0x6800000000000000L);
        bl = (1024 >>> 9 | 1024 << -9) & 0xFFFFFFFF;
        bm = Integer.reverse(0x70000000);
        bn = Long.reverse(8919061850319295922L);
        bo = 12 >>> 194 | 12 << ~194 + 1;
        bp = -2147483641 >>> 95 | -2147483641 << -95;
        bq = Long.reverse(1425072070374790578L);
        br = Long.reverse(0x6800000000000000L);
        bs = 128 >>> 37 | 128 << -37;
        bt = Integer.reverse(0x8000000);
        bu = Long.reverse(8919061850319295922L);
        bv = Integer.reverse(-1610612736);
        bw = Integer.reverse(-2013265920);
        bx = Long.reverse(1425072070374790578L);
        by = Long.reverse(0x6800000000000000L);
        bz = Integer.reverse(0x48000000);
        ca = Integer.reverse(-1);
        cb = Long.reverse(8919061850319295922L);
        cc = 512 >>> 73 | 512 << ~73 + 1;
        cd = (0 >>> 6 | 0 << -6) & 0xFFFFFFFF;
        ce = (0 >>> 43 | 0 << -43) & 0xFFFFFFFF;
        cf = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << -223) & 0xFFFFFFFF;
        cg = Integer.reverse(0);
        ch = Integer.reverse(Integer.MIN_VALUE);
        ci = 0 >>> 171 | 0 << ~171 + 1;
        cj = (0x20000000 >>> 253 | 0x20000000 << -253) & 0xFFFFFFFF;
        ck = Integer.reverse(0);
        cl = Integer.reverse(-939524096);
        cm = Long.reverse(8919061850319295922L);
        cn = 32 >>> 37 | 32 << ~37 + 1;
        co = 320 >>> 36 | 320 << -36;
        cp = (-1 >>> 1 | -1 << -1) & 0xFFFFFFFF;
        cq = Long.reverse(8919061850319295922L);
        cr = (10752 >>> 73 | 10752 << -73) & 0xFFFFFFFF;
        cs = Long.reverse(1425072070374790578L);
        ct = Long.reverse(0x6800000000000000L);
        cu = 0x2000000 >>> 247 | 0x2000000 << -247;
        cv = (11264 >>> 73 | 11264 << ~73 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(1425072070374790578L);
        cx = Long.reverse(0x6800000000000000L);
        cy = Integer.reverse(0);
        cz = Integer.reverse(0);
        da = Integer.reverse(0);
        db = 0 >>> 94 | 0 << ~94 + 1;
        dc = Integer.reverse(0);
        dd = Integer.reverse(0);
        de = (0 >>> 2 | 0 << ~2 + 1) & 0xFFFFFFFF;
        df = Integer.reverse(0);
        dg = 0x400000 >>> 150 | 0x400000 << -150;
        dh = Integer.reverse(0);
        di = Long.reverse(1934296039955628032L);
        dj = Integer.reverse(Integer.MIN_VALUE);
        dk = Integer.reverse(0);
        dl = Integer.reverse(0);
        dm = 0 >>> 0 | 0 << -0;
        dn = Integer.reverse(Integer.MIN_VALUE);
        cfr_renamed_1 = 94208 >>> 236 | 94208 << ~236 + 1;
        dp = -1 >>> 198 | -1 << -198;
        dq = Long.reverse(8919061850319295922L);
        dr = (48 >>> 129 | 48 << ~129 + 1) & 0xFFFFFFFF;
        ds = Long.reverse(8919061850319295922L);
        dt = (0x640000 >>> 146 | 0x640000 << -146) & 0xFFFFFFFF;
        du = -1 >>> 54 | -1 << ~54 + 1;
        dv = Long.reverse(8919061850319295922L);
        dw = Integer.reverse(0);
        dx = Integer.reverse(0x58000000);
        dy = Integer.reverse(0x58000000);
        var_java_lang_String_arr_a = new String[dx];
        var_java_lang_String_arr_b = new String[dy];
        NLoginCore_010.b();
    }

    /* synthetic */ NLoginCore_010(NLoginCore_313 NLoginCore_3132, NLoginCore_522 NLoginCore_5222) {
        this(NLoginCore_3132);
    }

    private void a(User user, Channel channel, NLoginCore_306 NLoginCore_306, NLoginCore_271 NLoginCore_2712, WrapperLoginClientLoginStart wrapperLoginClientLoginStart) {
        int n;
        String string;
        String string2;
        Object object;
        String string3 = wrapperLoginClientLoginStart.getUsername();
        NLoginCore_047 NLoginCore_0472 = BCryptHashProvider.c() != NLoginCore_555.var_com_nickuc_login_NLoginCore_555_f && user.getPacketVersion().isNewerThanOrEquals(ClientVersion.V_1_19_1) ? new NLoginCore_047(wrapperLoginClientLoginStart.getPlayerUUID().orElse(null)) : null;
        InetAddress inetAddress = user.getAddress().getAddress();
        String string4 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_056_b().a(string3, inetAddress, (NLoginCore_2712 != null ? o : p) != 0);
        if (string4 != null) {
            NLoginCore_234.i(user, string4);
            return;
        }
        Object object2 = NLoginCore_306.h();
        if (NLoginCore_2712 != null) {
            this.a(user, wrapperLoginClientLoginStart, channel, object2, NLoginCore_2712, string3, inetAddress);
            return;
        }
        boolean bl = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar();
        Object object3 = null;
        if (bl) {
            Object object4;
            object = NLoginCore_306.aw();
            NLoginCore_460 NLoginCore_4602 = NLoginCore_460.a((String)object);
            if (!NLoginCore_4602.aQ() && NLoginCore_0472 != null) {
                NLoginCore_460 NLoginCore_4603 = NLoginCore_4602 = NLoginCore_0472.java_util_UUID_b() != null && NLoginCore_0472.a(NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_b)) ? NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b : NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                if (NLoginCore_4602 == NLoginCore_460.var_com_nickuc_login_NLoginCore_460_b) {
                    object4 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string3, NLoginCore_0472.java_util_UUID_b(), q != 0);
                    if (object4 == null) {
                        String string5 = NLoginCore_150.a(NLoginCore_374.w, new Object[r]);
                        NLoginCore_234.i(user, string5);
                        return;
                    }
                    String string6 = ((ForceRegisterConfig)object4).d(string3);
                    NLoginCore_184 NLoginCore_1842 = NLoginCore_073.com_nickuc_login_NLoginCore_184_a(string6, inetAddress);
                    if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_c && ((ForceRegisterConfig)object4).r() && !((ForceRegisterConfig)object4).t()) {
                        NLoginCore_073.a(NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b), string6, inetAddress, NLoginCore_184.var_com_nickuc_login_NLoginCore_184_b);
                        object3 = object4;
                        if (NLoginCore_1842 != NLoginCore_184.var_com_nickuc_login_NLoginCore_184_e) {
                            NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
                        }
                    }
                }
            }
            if (!NLoginCore_4602.aQ() && NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_495_a().p()) {
                NLoginCore_4602 = NLoginCore_460.var_com_nickuc_login_NLoginCore_460_c;
            }
            switch (NLoginCore_522.N[NLoginCore_4602.ordinal()]) {
                case 1: {
                    string2 = string3;
                    string = BCryptHashProvider.g(string2, s != 0);
                    n = t;
                    break;
                }
                case 2: {
                    if (object3 == null && (object3 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string3, null, null, u != 0)) == null) {
                        object4 = NLoginCore_150.a(NLoginCore_374.w, new Object[v]);
                        NLoginCore_234.i(user, (String)object4);
                        return;
                    }
                    if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b((ForceRegisterConfig)object3, string3)) {
                        object4 = NLoginCore_150.a(NLoginCore_374.w, new Object[w]);
                        NLoginCore_234.i(user, (String)object4);
                        return;
                    }
                    string2 = ((ForceRegisterConfig)object3).d(string3);
                    string = BCryptHashProvider.g(string2, x != 0);
                    n = y;
                    break;
                }
                case 3: {
                    Object[] objectArray = new Object[z];
                    objectArray[NLoginCore_010.aa] = object;
                    object4 = NLoginCore_150.a(NLoginCore_374.Z, objectArray);
                    NLoginCore_234.i(user, (String)object4);
                    return;
                }
                case 4: {
                    String string7;
                    if (NLoginCore_150.j()) {
                        String[] stringArray = new String[ab];
                        stringArray[NLoginCore_010.ac] = (String)NLoginCore_010.c("㺀", (int)(ad & ae), (long)af) + (String)object + (String)NLoginCore_010.c("㺃", (int)ag, (long)(ah ^ ai));
                        stringArray[NLoginCore_010.aj] = NLoginCore_010.c("㺆", (int)ak, (long)al);
                        stringArray[NLoginCore_010.am] = NLoginCore_010.c("㺉", (int)an, (long)(ao ^ ap));
                        stringArray[NLoginCore_010.aq] = NLoginCore_010.c("㺌", (int)ar, (long)as);
                        stringArray[NLoginCore_010.at] = NLoginCore_010.c("㺏", (int)au, (long)(av ^ aw));
                        stringArray[NLoginCore_010.ax] = NLoginCore_010.c("㺒", (int)ay, (long)az);
                        string7 = NLoginCore_112.a(stringArray);
                    } else {
                        String[] stringArray = new String[ba];
                        stringArray[NLoginCore_010.bb] = (String)NLoginCore_010.c("㺕", (int)(bc & bd), (long)be) + (String)object + (String)NLoginCore_010.c("㺘", (int)bf, (long)bg);
                        stringArray[NLoginCore_010.bh] = NLoginCore_010.c("㺛", (int)bi, (long)(bj ^ bk));
                        stringArray[NLoginCore_010.bl] = NLoginCore_010.c("㺞", (int)bm, (long)bn);
                        stringArray[NLoginCore_010.bo] = NLoginCore_010.c("㺡", (int)bp, (long)(bq ^ br));
                        stringArray[NLoginCore_010.bs] = NLoginCore_010.c("㺤", (int)bt, (long)bu);
                        stringArray[NLoginCore_010.bv] = NLoginCore_010.c("㺧", (int)bw, (long)(bx ^ by));
                        string7 = NLoginCore_112.a(stringArray);
                    }
                    object4 = string7;
                    NLoginCore_234.i(user, (String)object4);
                    return;
                }
                default: {
                    throw new IllegalArgumentException((String)NLoginCore_010.c("㺪", (int)(bz & ca), (long)cb) + (Object)((Object)NLoginCore_4602));
                }
            }
        } else {
            object3 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string3, null, null, cc != 0);
            if (object3 == null) {
                String string8 = NLoginCore_150.a(NLoginCore_374.w, new Object[cd]);
                NLoginCore_234.i(user, string8);
                return;
            }
            if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b((ForceRegisterConfig)object3, string3)) {
                String string9 = NLoginCore_150.a(NLoginCore_374.w, new Object[ce]);
                NLoginCore_234.i(user, string9);
                return;
            }
            string = string2 = ((ForceRegisterConfig)object3).d(string3);
            object = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a((ForceRegisterConfig)object3, string2, inetAddress, NLoginCore_0472);
            switch (NLoginCore_522.O[((Enum)object).ordinal()]) {
                case 1: {
                    Object[] objectArray = new Object[cf];
                    objectArray[NLoginCore_010.cg] = string2;
                    NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.aa, objectArray));
                    return;
                }
                case 2: {
                    Object[] objectArray = new Object[ch];
                    objectArray[NLoginCore_010.ci] = string2;
                    NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.ab, objectArray));
                    return;
                }
                case 3: 
                case 4: {
                    n = object == NLoginCore_009.var_com_nickuc_login_NLoginCore_009_d ? cj : ck;
                    break;
                }
                default: {
                    throw new UnsupportedOperationException((String)NLoginCore_010.c("㺭", (int)cl, (long)cm) + object);
                }
            }
        }
        boolean bl2 = NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_b).org_bukkit_Server_a().getOnlineMode();
        if (bl2) {
            n = cn;
        }
        if (n != 0) {
            this.a(user, wrapperLoginClientLoginStart, channel, object2, (ForceRegisterConfig)object3, string2, NLoginCore_0472, string3, inetAddress, bl2);
        } else {
            this.a(user, wrapperLoginClientLoginStart, channel, object2, (ForceRegisterConfig)object3, string2, string, string3, inetAddress);
        }
    }

    private void a(User user, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, Channel channel, Object object, NLoginCore_271 NLoginCore_2712, String string2, InetAddress inetAddress) {
        Object object2;
        Object object3 = NLoginCore_2712.a.getCorrectUsername();
        UUID uUID = NLoginCore_2712.a.getJavaUniqueId();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a((String)object3, null, uUID, dc != 0);
        if (ForceRegisterConfig2 == null) {
            String string3 = NLoginCore_150.a(NLoginCore_374.w, new Object[dd]);
            NLoginCore_234.i(user, string3);
            return;
        }
        if (this.a(user, (String)object3, inetAddress, ForceRegisterConfig2.u(), ForceRegisterConfig2)) {
            return;
        }
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), NLoginCore_532.J)) {
            return;
        }
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), NLoginCore_532.R)) {
            return;
        }
        if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, uUID, (String)object3, inetAddress.getHostAddress())) {
            NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.w, new Object[de]));
            return;
        }
        if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a().J() && !ForceRegisterConfig2.u()) {
            if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b(ForceRegisterConfig2, string2)) {
                String string4 = NLoginCore_150.a(NLoginCore_374.w, new Object[df]);
                NLoginCore_234.i(user, string4);
                return;
            }
            object2 = ForceRegisterConfig2.i();
            Object object4 = object3 = object2 != null ? object2 : string2;
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                object3 = BCryptHashProvider.g((String)object3, ForceRegisterConfig2.t());
            }
        }
        UUID uUID2 = (object2 = ForceRegisterConfig2.java_util_UUID_a()) != null && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_m.ar() ? object2 : NLoginCore_2712.a.getCorrectUniqueId();
        Runnable runnable = NLoginCore_179.a(object, (String)object3, uUID2, null);
        BukkitHelper_001 BukkitHelper_001 = new BukkitHelper_001(user, ForceRegisterConfig2, (String)object3, uUID2, dg != 0, runnable, channel, null);
        channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).set((Object)BukkitHelper_001);
        BukkitHelper_001.a((String)object3, string2, inetAddress, BukkitHelper_001);
        wrapperLoginClientLoginStart.setPlayerUUID(uUID2);
        wrapperLoginClientLoginStart.setUsername((String)object3);
        NLoginCore_313.b(user, wrapperLoginClientLoginStart, (String)object3);
    }

    private void a(User user, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, Channel channel, Object object, @Nullable ForceRegisterConfig ForceRegisterConfig2, String string2, @Nullable NLoginCore_047 NLoginCore_0472, String string3, InetAddress inetAddress, boolean bl) {
        byte[] byArray;
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), NLoginCore_532.I)) {
            return;
        }
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), NLoginCore_532.Q)) {
            return;
        }
        NLoginCore_517 NLoginCore_5172 = null;
        SignatureData signatureData = wrapperLoginClientLoginStart.getSignatureData().orElse(null);
        if (signatureData != null) {
            NLoginCore_5172 = new NLoginCore_517(signatureData, NLoginCore_0472 != null ? NLoginCore_0472.java_util_UUID_b() : null);
            if (NLoginCore_5172.aA()) {
                NLoginCore_234.j(user, (String)NLoginCore_010.c("㺀", (int)(co & cp), (long)cq));
                return;
            }
            if (!NLoginCore_5172.aB()) {
                NLoginCore_234.j(user, (String)NLoginCore_010.c("㺃", (int)cr, (long)(cs ^ ct)));
                return;
            }
        }
        if (bl) {
            byArray = null;
        } else {
            byArray = new byte[cu];
            this.var_java_security_SecureRandom_c.nextBytes(byArray);
            user.sendPacketSilently((PacketWrapper)new WrapperLoginServerEncryptionRequest((String)NLoginCore_010.c("㺆", (int)cv, (long)(cw ^ cx)), NLoginCore_313.java_security_KeyPair_a(this.var_com_nickuc_login_NLoginCore_313_b).getPublic(), byArray));
        }
        channel.attr((AttributeKey)NLoginCore_481.var_long_e).set((Object)new NLoginCore_481(ForceRegisterConfig2, string2, string3, object, wrapperLoginClientLoginStart, NLoginCore_5172, byArray));
        if (bl) {
            user.receivePacketSilently((PacketWrapper)wrapperLoginClientLoginStart);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_010.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.A("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 65), NLoginCore_010.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.F("ԼՉՈԋՋՇՂՋՖՅԒՐՔՍՐՖԘࢠࢪࢧࢴࢁࢮࢶࢴࢱࢭࢳࢱࢶԱ", (byte)29, 70) + string + NLoginCore_453.A("ó", (byte)29, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_010(NLoginCore_313 NLoginCore_3132) {
        this.var_com_nickuc_login_NLoginCore_313_b = NLoginCore_3132;
    }

    private boolean a(User user, String string, InetAddress inetAddress, boolean bl, ForceRegisterConfig ForceRegisterConfig2) {
        NLoginCore_277 NLoginCore_277 = NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_b).java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 == null) {
            return dh != 0;
        }
        NLoginCore_509 NLoginCore_5092 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277);
        int n = NLoginCore_5092 != null && System.currentTimeMillis() - NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_h, Long.valueOf(0L)) > di ? dj : dk;
        String string2 = inetAddress.getHostAddress();
        String string3 = NLoginCore_150.a(NLoginCore_374.Y, new Object[dl]);
        if (n != 0 && (bl || NLoginCore_532.L.ar() && (inetAddress.equals(NLoginCore_277.java_net_InetSocketAddress_b().getAddress()) || string2.equals(ForceRegisterConfig2.k())))) {
            NLoginCore_277.a(string3);
            return dm != 0;
        }
        NLoginCore_234.i(user, string3);
        return dn != 0;
    }

    private static void b() {
        int n;
        var_long_c = 5595898901232837576L;
        long l = var_long_c ^ 0x21D527B5E3B6ED72L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(32 + 51), (byte)(16 + 31), (byte)(51 + 16), (byte)(65 + 1), (byte)(17 + 50), (byte)(44 + 3), (byte)(44 + 36), (byte)(58 + 17), (byte)(8 + 59), (byte)(34 + 49), 53, (byte)(48 + 32), (byte)(27 + 70), (byte)(55 + 45), (byte)(95 + 5), (byte)(66 + 39), (byte)(16 + 94), (byte)(81 + 22)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_010.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ХрКЋЩЧЩујвіевхЙЧбэльКНллеѐќоѬфйѤѭйќмѓъсѢѵѤѣфвиѵѰыѯѬџєѲніуоѨѼтѾѾ҅", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[1] = NLoginCore_092.D("ЇШбЪгДшБтеДО", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ԐӳՁԢӼԲԘӽԙԑՆԥԾՅՅՀԹԾԤՄԧԮՃԓԫՃԩՇԙԶԝԵ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[3] = NLoginCore_223.D("шяёЍОргДРХйбШцгКЮкЪџряПмхћвѦыйѬѦѩѥѭѭѭѤчэѷѷѬѩњѪѰѓчѡѕъуѠѮцћѾѝҁҋѶ҇Ѻ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[4] = NLoginCore_027.B("ĆêßÐÄëïæÞÿùåČĒĔîěčēĒċñïġĄçĝĜėĪÿĦìåĐëčěüĦĪĐôıĔòěûõúĭĴûċĈĉ", (byte)11, 66);
                    NLoginCore_010.var_java_lang_String_arr_b[5] = NLoginCore_091.E("ԸԲӻӵӶԸՄԹԀԈՁԂԽԫՍԹԺԫԍՌԾԒՀԤԐՎՃ՚Ԝ՞ԿՌԖԓԔԯՁԹԺ՝ՐԨՈԢՠՋ՜ԥեՀՌՇԱԾէճհժէՑԲկՒԸմՒ՛ցձեՏՁՙՆթ՞Ն֍՘հեՃջձռ֌֖Ցե֋մև֍ը֓՞", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[6] = NLoginCore_201.F("ԬԋԎՀԠՃԆՅՆԺԅԏ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[7] = NLoginCore_453.C("лЈКсВЬБЍабЭЌхгаЗћВОРїзУсзєУкгЧсјѧхѱѡѐѳыѷѡєѴуѫќяемкѓѝѼѸѶрѼцшхј҈ѧѣсҊѮѳ҃҇ѝѓ҇ї҅Ґ҄ѱѭ҆ҠҔҕңҋѰңѾ҆қѷ҇ҁҞқңҨѢҤҨѱѲѲҔѵҶҕѾ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[8] = NLoginCore_387.C("лКНяЯђЕєѕщДО", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[9] = NLoginCore_453.A("ăËÙýąÎêýßéíóéöïÖĚčîÝėĖñåĠÙĠû÷ęĞĥĝĩĥüĬĤĊĈòôĎķăúėĎĮĕüýĢŃģĒįćģňğĻăČĞĪęĹŊŃŒŋĒĿĹıłħĳħĘīŘĝĮģŃĤŖĠšŘŁŦŠŋ", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[10] = NLoginCore_092.F("ӹԔӺԘԽԛԔՀԵԦՈԜԴԧԈԹԜԾԒԮԒԋՇՅԵԬՔԸԦՓԗՕՑՖՌԕՌԟՎԵԠըԡԺ՛ՆԪԩ՜ԾՃՔըբշլՉմոԭԲժ՜պՉՖճյոՠփբհժֈՏ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[11] = NLoginCore_027.E("ԸԜԑԂӶԝԡԘԐԱԳԖԜԌՇԜԪՐՉ԰ՕԮԖՑԐՐ՘Դ՚԰ՆՋԴԲԔԴՅ՗ԟա՜ԧԺՇ՘ԬՇԡԭՊԮլՁճԲեՃըխՎՐ՝մէ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[12] = NLoginCore_387.D("яявХЌшТвЧёеВИЩНќлМўзљфдлПѧкфѪѨѥѬѨџрамѴѲѳѦєѳѪхфѳљзњѡѸѰюѓфѤѲѴѝќҁѧѿ҆ѽў҇ѿҁҋѠҏѢѨѶҘѨ҇ҙѿ҉ҖѽѝҢѩѪ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[13] = NLoginCore_092.D("лКНяЯђЕєѕщДО", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[14] = NLoginCore_559.D("оИПЮоѐЩДЩУбьѐЭёЧйЙїькѡХдѝнщЪоѬчяЩъѩЩѦѩѕѭѦѲЫдлкєћюѩѱѯќљѥуѶѲѶшѻѾѕэҐѻь҅Ѯ҆чѤѬѧғ҅э҄҉ѾѵѶҎџѣҏїѠҨ҉ҖҤ҅҇ҋѸ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[15] = NLoginCore_092.D("лКНяЯђЕєѕщДО", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[16] = NLoginCore_427.F("ԡԏӾԸԡԟԛԗԈԣԢԡԜԚՌԈՁԮՊԽՒԧԬԫԕՋՌՔԷԘՍԿՕԳբԝ՘ՀԴՕԞԠՊԣՁաԦծԫձ՛մՀմԶՀժԳոԻոԵԾ՛ԼՓվՋՍՐպղջզվՁլՅռՁ֊֎ՐզՍֈկՍ֖Ր֌֐՘֒ղՙ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ÇâÈæċéâĎăôĖêĂõÖćêČàüàÙĕēăúĢĆôġåģğĤĚãĚíĜăîĶïĈĩĔø÷ĪČđĢĶİŅĺėłņûĀĸĪňėĤŁŃņĮőİľĸŖĝ", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[18] = NLoginCore_384.D("шяёЍОргДРХкѕИдЏплйљРрЬЩЪ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[19] = NLoginCore_324.A("âøăúòÍÏðÔÐÕõÌøÎěúÙğòíóÝğğóĖóĜģâģĦĞéĤğčēĴīĘĈý", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[20] = NLoginCore_110.F("ԾԒӼԻԗԒԾԒԆԧԄԸԨԛԜ԰ԐՍՑԼԎԎՂՃՊԶԙԮՏԾՎԾԵՙԳԝՓԭՂԤեԻժ՜ՂՆՋէխՏղԾՈՕթթՒԷ՘ՈԷ՞ժՇսԳՐտԾսՔտ։չՁՏ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[21] = NLoginCore_091.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѭ҅҃ѾѧуѺѹѬ҈҆", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[22] = NLoginCore_091.E("ԬԋԎՀԠՃԆՅՆԺԅԏ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[23] = NLoginCore_559.D("ЇЯФбпшоЧЖАЬЙЩЖьђѕсНЛбьѕѣтѢўтѢѠкуЧяѰѠчѩЯюрщїьєлешѽнџѷѼђўќѵѽѻ҆ньѺ҄Ѽ҃ҊѢҐ҉Ѡ҃ѱѰ҇ҏјҘ҇ѾѼљҍ҂ҝѳѝјҟѢ҅҃ҀѿѼѾҪѽ҃ҭҁҎѮҏҢ҃҅Ѿ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[24] = NLoginCore_446.F("ԵӻԕԽՄԔԡԶԷԥՆՌԸԵԼԉՌԉԡԱՇՕՎՌԵԓՖՍԛԪԾԗԼՌՌՄԳՎԞԥԿ՘ԩ՞ՊԿՃՁզՐժէձըԱԷբՅԱկՔՕՏԸ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[25] = NLoginCore_091.E("Էԁ԰ԛՁԔԄԶԃӿԼԝԤԭԧՐԈԥՄԞԓԣ՗ՑՍ՚Ոԥԧԕ԰ԪՋԾ԰ԣՙՅ՞ԙՠ՛՜ԯ", (byte)11, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_010.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ХрКЋЩЧЩујвіевхЙЧбэльКНллеѐќоѬфйѤѭйќмѓъсѢѵѤѣфвиѵѰыѯѬџєѼѯџ҄ѦѧѣҀуѬѢ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[1] = NLoginCore_201.D("ЋщЋЯЦцРЪеїДО", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ПЂѐбЋсЧЌШРѕдэєєяшэгѓжхиюХњчМпФўѫфяЯЭшфѪаЯасо", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[3] = NLoginCore_324.A("ćĎĐÌÝÿòÓßäøðçąòÙíùéĞÿĎÞûĄĚñĥĊøīĥĨĤĬĬĬģĆČĶĶīĨęĩįĒĆĠĔĉĂĬěŀĢĔŉğĉŌĶĚ", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[4] = NLoginCore_223.D("чЫРБЅЬаЧПркЦэѓѕЯќюєѓьваѢхШўѝјѫрѧЭЦёЬюќнѧѫёзцшѮѸяъљјѭ҄я҅ѷњ҈ѤѠ҉ъцњ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[5] = NLoginCore_173.F("ԸԲӻӵӶԸՄԹԀԈՁԂԽԫՍԹԺԫԍՌԾԒՀԤԐՎՃ՚Ԝ՞ԿՌԖԓԔԯՁԹԺ՝ՐԨՈԢՠՋ՜ԥեՀՌՇԱԾէճհժէՑԲկՒԸմՒ՛ցձեՏՁՙՆթ՞Ն֍՘հեՃջձռ֊Ր֖Րբ՗՗դշխ֖", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[6] = NLoginCore_559.D("юфКФТрсШиЦеО", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[7] = NLoginCore_173.C("лЈКсВЬБЍабЭЌхгаЗћВОРїзУсзєУкгЧсјѧхѱѡѐѳыѷѡєѴуѫќяемкѓѝѼѸѶрѼцшхј҈ѧѣсҊѮѳ҃҇ѝѓ҇ї҅Ґ҄ѱѭ҆ҠҔҕңҋѰңѾ҆қѷ҇ҁҞқңҚѩҢѤґҥҖѳѵҹҘҰҗҍ҆ҐѽҾӀҀѹӂ҉Ҋ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[8] = NLoginCore_027.E("ԷՂԱԞԥԏ԰ԄԷԃԁԏ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[9] = NLoginCore_384.C("фЌКоцЏЫоРЪЮдЪзаЗћюЯОјївЦѡКѡмињџѦўѪѦнѭѥыщгеяѸфлјяѯіноѣ҄ѤѓѰшѤ҉ѠѼфэџѫњѺҋ҄ғҌѓҀѺѲ҃ѨѴѨљѬҙўѯћҥҢў҈ћѤѺѦҙҗ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[10] = NLoginCore_446.D("ЈУЉЧьЪУяфеїЫужЗшЫэСнСКієфлѣчеѢЦѤѠѥћФћЮѝфЯѷащѪѕйиѫэђѣѷѱ҆ѻј҃҇мсѹѫ҉ѽѐѨҒџюѰѢ҅Ґѭў", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[11] = NLoginCore_201.C("чЫРБЅЬаЧПртХЫЛіЫйџјпѤнХѠПџѧуѩпѕњусУуєѦЮѰѫжщіѧліамљнѻѐтѾј҃҂ѥѪҌјҍѥ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[12] = NLoginCore_138.E("ՀՀԣԖӽԹԓԣԘՂԦԃԉԚԎՍԬԍՏԨՊԵԥԬԐ՘ԫԵ՛ՙՖ՝ՙՐԱԡԭեգդ՗Յդ՛ԶԵդՊԨՋՒթաԿՄԵՕգեՎՍղ՘հշծՏոհղռՑրՓ՘Չվ՟զրծևժՍ՜֒ֆդ՗Րիև֐օ֒վ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[13] = NLoginCore_091.E("ԛԾӹԽԔӾԟԆՄԃԸԏ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[14] = NLoginCore_384.C("оИПЮоѐЩДЩУбьѐЭёЧйЙїькѡХдѝнщЪоѬчяЩъѩЩѦѩѕѭѦѲЫдлкєћюѩѱѯќљѥуѶѲѶшѻѾѕэҐѻь҅Ѯ҆чѤѬѧғ҅э҄҉ѾѵѶҎџѣҏҜҡ҃ҡ҆ѳҤѦѦѮҰѭҲ҄ңұҴѨҌҦҙѾ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[15] = NLoginCore_138.B("ÉëÇëĐČÜÓĀăĎÝ", (byte)11, 66);
                    NLoginCore_010.var_java_lang_String_arr_b[16] = NLoginCore_110.D("аОЍчаЮЪЦЗвбаЫЩћЗѐнљьѡжлкФњћѣцЧќюѤтѱЬѧяуѤЭЯљвѐѰеѽкҀѪ҃я҃хяѹт҇ъ҇фэѪыѢҍњќџ҉ҁҊѵҍѐѻєҋѐҙҝџѵќҝѭѳ҄ѨѵҘҖ҆҂Ҋ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[17] = NLoginCore_446.A("ÇâÈæċéâĎăôĖêĂõÖćêČàüàÙĕēăúĢĆôġåģğĤĚãĚíĜăîĶïĈĩĔø÷ĪČđĢĶİŅĺėłņûĀĸĪňĨŉďļĨďĿŊĐġĤĝ", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[18] = NLoginCore_201.E("ԹՀՂӾԏԱԤԅԑԖԪՄԇԋԛԞՈՉԎԦԜԋԓԢՒՔԢԤՔԬԱԿ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[19] = NLoginCore_384.A("âøăúòÍÏðÔÐÕõÌøÎěúÙğòíóÝğğóĖóĜģâģĜęāċëĤĒĢĎđñ÷ĆĎįĮĚĝøīĴěĈĉ", (byte)11, 65);
                    NLoginCore_010.var_java_lang_String_arr_b[20] = NLoginCore_559.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѤѸѸѡцѧїцѭѹіѯҎҊѨ҈ќҀѰҋҊҗў", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[21] = NLoginCore_138.C("эСЋъЦСэСЕжГчзЪЫпПќѠыННёђљхШнўэѝэфѨтЬѢмёгѴъѹѫёѕњѶѼўҁэїѱрѠоѺѤђ҈҅ћѪ", (byte)11, 67);
                    NLoginCore_010.var_java_lang_String_arr_b[22] = NLoginCore_559.F("ԖԚԸԟԻԿԵՁԐՁՀԏ", (byte)11, 70);
                    NLoginCore_010.var_java_lang_String_arr_b[23] = NLoginCore_201.D("ЇЯФбпшоЧЖАЬЙЩЖьђѕсНЛбьѕѣтѢўтѢѠкуЧяѰѠчѩЯюрщїьєлешѽнџѷѼђўќѵѽѻ҆ньѺ҄Ѽ҃ҊѢҐ҉Ѡ҃ѱѰ҇ҏјҘ҇ѾѼљҍ҂ҝѳѝјҟѢ҅҃ҀѿѼѾ҃҂ҫҞѥҵ҉ҕ҄҄ҎҳѻҏҪҲҟҟҏҡҗҌ҉Ҋ", (byte)11, 68);
                    NLoginCore_010.var_java_lang_String_arr_b[24] = NLoginCore_223.E("ԵӻԕԽՄԔԡԶԷԥՆՌԸԵԼԉՌԉԡԱՇՕՎՌԵԓՖՍԛԪԾԗԼՌՌՄԳՎԞԥԿ՘ԩ՞ՊԿՃՁզՐժէձծԶՆՙՈ԰ռմ՚ԴրՎ՟ՖՎԻվւ՗ռՠ՞Տ", (byte)11, 69);
                    NLoginCore_010.var_java_lang_String_arr_b[25] = NLoginCore_138.B("ąÏþéďâÒĄÑÍĊëòûõĞÖóĒìáñĥğěĨĖóõãþøĊĮïĩĎįįðĩķ÷ý", (byte)11, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_010.var_java_lang_String_arr_b[0] = NLoginCore_004.A("üÈÉÇûàììĎäâÖØõèþþđì×ēëèé", (byte)11, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_010.var_java_lang_String_arr_b[0] = NLoginCore_451.B("ØÇéÜáĊĉçÒàċČôÙĘĜöíĘýėđèé", (byte)11, 66);
                }
            }
        }
    }

    private void a(User user, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, Channel channel, Object object, ForceRegisterConfig ForceRegisterConfig2, String string2, String string3, String string4, InetAddress inetAddress) {
        if (this.a(user, string3, inetAddress, cy != 0, ForceRegisterConfig2)) {
            return;
        }
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().b(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), null)) {
            return;
        }
        if (NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(string -> NLoginCore_234.i(user, string), ForceRegisterConfig2, inetAddress.getHostAddress(), null)) {
            return;
        }
        UUID uUID = ForceRegisterConfig2.java_util_UUID_a();
        if (uUID == null && (ForceRegisterConfig2.boolean_h() || BCryptHashProvider.com_nickuc_login_NLoginCore_254_a() == NLoginCore_254.var_com_nickuc_login_NLoginCore_254_b)) {
            uUID = NLoginCore_432.a(string2, null);
            ForceRegisterConfig2.a(uUID);
            if (!NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, new NLoginCore_436[cz])) {
                NLoginCore_234.i(user, NLoginCore_150.a(NLoginCore_374.w, new Object[da]));
                return;
            }
        }
        Runnable runnable = uUID != null ? NLoginCore_179.a(object, string3, uUID, null) : null;
        BukkitHelper_001 BukkitHelper_001 = new BukkitHelper_001(user, ForceRegisterConfig2, string2, uUID, db != 0, runnable, channel, null);
        channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).set((Object)BukkitHelper_001);
        BukkitHelper_001.a(string3, string4, inetAddress, BukkitHelper_001);
        NLoginCore_313.b(user, wrapperLoginClientLoginStart, string3);
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        NLoginCore_271 NLoginCore_2712;
        WrapperLoginClientLoginStart wrapperLoginClientLoginStart = new WrapperLoginClientLoginStart(packetReceiveEvent);
        User user = packetReceiveEvent.getUser();
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        String string = wrapperLoginClientLoginStart.getUsername();
        NLoginCore_306 NLoginCore_306 = (NLoginCore_306)channel.attr(NLoginCore_306.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_306__d).getAndSet(null);
        if (NLoginCore_306 == null) {
            throw new IllegalStateException((String)NLoginCore_010.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + string + (String)NLoginCore_010.c("㺃", (int)e, (long)(f ^ g)));
        }
        NLoginInterface_031 NLoginInterface_0312 = NLoginCore_313.com_nickuc_login_NLoginType_008_a(this.var_com_nickuc_login_NLoginCore_313_b).com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
        if (NLoginInterface_0312 instanceof NLoginCore_418) {
            FloodgatePlayer floodgatePlayer = (FloodgatePlayer)channel.attr(((NLoginCore_418)NLoginInterface_0312).a()).get();
            if (floodgatePlayer == null && channel.pipeline().get((String)NLoginCore_010.c("㺆", (int)(h & i), (long)j)) != null) {
                NLoginCore_234.i(user, (String)NLoginCore_010.c("㺉", (int)k, (long)l));
                return;
            }
            NLoginCore_2712 = floodgatePlayer != null ? new NLoginCore_271(floodgatePlayer) : null;
        } else {
            NLoginCore_2712 = null;
        }
        packetReceiveEvent.setCancelled(m != 0);
        NLoginCore_313.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginCore_313_b).b(n != 0).a(() -> {
            try {
                if (!channel.isOpen() || !channel.isActive()) {
                    return;
                }
                this.a(user, channel, NLoginCore_306, NLoginCore_2712, wrapperLoginClientLoginStart);
            }
            catch (Throwable throwable) {
                NLoginCore_234.i(user, (String)NLoginCore_010.c("㺀", (int)(cfr_renamed_1 & dp), (long)dq));
                NLoginCore_370.c((String)NLoginCore_010.c("㺃", (int)dr, (long)ds) + string + (String)NLoginCore_010.c("㺆", (int)(dt & du), (long)dv), throwable, new Object[dw]);
            }
        });
    }

    private static String a(int n, long l) {
        l ^= 0x16L;
        l ^= 0x21D527B5E3B6ED72L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(23 + 46), (byte)(29 + 54), (byte)(7 + 40), (byte)(6 + 61), (byte)(35 + 31), (byte)(49 + 18), (byte)(20 + 27), (byte)(40 + 40), (byte)(34 + 41), (byte)(24 + 43), 83, (byte)(8 + 45), (byte)(6 + 74), (byte)(69 + 28), (byte)(55 + 45), (byte)(13 + 87), (byte)(18 + 87), (byte)(63 + 47), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(21 + 48), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.A("ĨĵĴ÷ķĳĮķłıþļŀĹļłĄҌҖғҠѭҚҢҠҝҙҟҝҢ", (byte)35, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_010.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

