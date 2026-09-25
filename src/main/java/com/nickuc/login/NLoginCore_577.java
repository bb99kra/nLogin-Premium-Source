/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.md_5.bungee.api.chat.BaseComponent
 *  org.bukkit.Server
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_049;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_530;
import com.nickuc.login.NLoginInterface_023;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginInterface_001;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import com.nickuc.login.NLoginInterface_033;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class NLoginCore_577
implements NLoginCore_277 {
    private final Player var_org_bukkit_entity_Player_d;
    private static long ao;
    private static int au;
    private static int ay;
    private static int dj;
    private static long dc;
    private static int cn;
    private static int aa;
    private static long dg;
    private static final Class<?> var_java_lang_Class____f;
    private static int ai;
    private static int ag;
    private static int v;
    private static long al;
    private static int ah;
    private static int ax;
    private static int cs;
    private static int av;
    private static int bx;
    private static int bf;
    private static int r;
    private static long cr;
    private static int dl;
    private static int cf;
    private static int be;
    private static String[] var_java_lang_String_arr_b;
    private final NLoginCore_589 var_com_nickuc_login_NLoginInterface_022_a;
    private static long dx;
    private static int ch;
    private static long ck;
    private static long cw;
    private static int ar;
    private static int ap;
    private static long an;
    private static final Class<?> var_java_lang_Class____g;
    private static int ce;
    private static long var_long_f;
    private static long bq;
    private static int aq;
    private static int ba;
    private static int q;
    private NLoginInterface_023 var_com_nickuc_login_NLoginInterface_023_a;
    private static int bv;
    private static int i;
    private static int cl;
    private static int bp;
    private final Server var_org_bukkit_Server_c;
    private static int bb;
    private static int as;
    private static int var_int_c;
    private static long dk;
    private static long bk;
    private static long dw;
    private static long ad;
    private static int cd;
    private final UUID var_java_util_UUID_d = UUID.randomUUID();
    private static int db;
    private static int cm;
    private static long by;
    private static int p;
    private static int n;
    private static long dp;
    private static int dm;
    private static long cc;
    private static int ac;
    private static int m;
    private static int dv;
    private static int aj;
    private static int var_int_d;
    private static int aw;
    private static long dt;
    private static long dd;
    private static int var_int_b;
    private static int az;
    private static int cj;
    private static int bm;
    private static int du;
    private static int ci;
    private static long h;
    private static int bw;
    private static long ab;
    private static int co;
    private static int dr;
    private static long ds;
    private static int cv;
    private static int ca;
    private static Method var_java_lang_reflect_Method_d;
    private static long at;
    private static int dn;
    private static long br;
    private static int de;
    private static int u;
    private static int t;
    private static int dq;
    static final Map<Player, NLoginCore_577> cfr_renamed_32;
    private static int da;
    private static int w;
    private static int var_int_g;
    private static long bu;
    private static long bo;
    private static int cp;
    private static long cy;
    private static long ae;
    private static int dh;
    private static long j;
    private static int dz;
    private static String[] var_java_lang_String_arr_a;
    private static int bg;
    private static int di;
    private static Method var_java_lang_reflect_Method_c;
    private static int bd;
    private static long ak;
    private static int bs;
    private static int e;
    private static int var_int_a;
    private static int bc;
    private static int o;
    private static int cg;
    private static int ct;
    private static long cq;
    private static long cz;
    private static int l;
    private static Method var_java_lang_reflect_Method_b;
    private static int cx;
    private static long var_long_c;
    private static int dy;
    private static long cb;
    private static int bi;
    private static long k;
    private static int cfr_renamed_1;
    private static long bh;
    private static long bz;
    private static int bl;
    private static final Field var_java_lang_reflect_Field_c;
    private static int af;
    private static long y;
    private static int am;
    private static int z;
    private static int cu;
    private static int df;
    private static long x;
    private static int bj;
    private static long bt;
    private static long bn;
    private static int s;
    private static final Field var_java_lang_reflect_Field_b;

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0xB561CBAD75608AC5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(57 + 12), (byte)(10 + 73), (byte)(25 + 22), (byte)(54 + 13), (byte)(26 + 40), (byte)(13 + 54), (byte)(39 + 8), 80, (byte)(42 + 33), 67, (byte)(49 + 34), (byte)(7 + 46), (byte)(49 + 31), (byte)(58 + 39), (byte)(25 + 75), (byte)(74 + 26), (byte)(50 + 55), (byte)(35 + 75), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("ՠխլԯկիզկպթԶմոձմպԼࢶࣄࣇࣈ࣏࣏ࣇࣚࢿࣈ࣋", (byte)65, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_577.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_577 a(NLoginCore_089 NLoginCore_0892, Server server, Object object) {
        if (object instanceof String) {
            String string = ((String)object).toLowerCase(Locale.ENGLISH);
            Player player = server.getPlayerExact(string);
            if (player == null) {
                return null;
            }
            return NLoginCore_577.a(NLoginCore_0892, server, player);
        }
        if (object instanceof Player) {
            return NLoginCore_577.a(NLoginCore_0892, server, (Player)object);
        }
        throw new IllegalArgumentException((String)NLoginCore_577.c("㺀", (int)bm, (long)(bn ^ bo)) + object + (String)NLoginCore_577.c("㺃", (int)bp, (long)(bq ^ br)) + (String)(object != null ? object.getClass().getCanonicalName() : NLoginCore_577.c("㺆", (int)bs, (long)(bt ^ bu))));
    }

    @Override
    public String getName() {
        return this.var_org_bukkit_entity_Player_d.getName();
    }

    @Override
    public void d(Object object) {
        if (object instanceof String) {
            if (var_java_lang_reflect_Method_d != null) {
                Object[] objectArray = new Object[n];
                objectArray[NLoginCore_577.o] = NLoginCore_529.b((String)object, p != 0);
                NLoginCore_546.a(var_java_lang_reflect_Method_d, (Object)this.var_org_bukkit_entity_Player_d, objectArray);
            } else {
                this.var_org_bukkit_entity_Player_d.sendMessage(NLoginCore_065.f((String)object, q != 0));
            }
        } else if (var_java_lang_reflect_Method_d != null && object instanceof Component) {
            Object[] objectArray = new Object[r];
            objectArray[NLoginCore_577.s] = object;
            NLoginCore_546.a(var_java_lang_reflect_Method_d, (Object)this.var_org_bukkit_entity_Player_d, objectArray);
        } else if (var_java_lang_Class____f != null && var_java_lang_reflect_Method_b != null && var_java_lang_reflect_Method_c != null && object instanceof BaseComponent) {
            try {
                Object object2 = var_java_lang_reflect_Method_b.invoke((Object)this.var_org_bukkit_entity_Player_d, new Object[t]);
                Object[] objectArray = new Object[u];
                objectArray[NLoginCore_577.v] = object;
                var_java_lang_reflect_Method_c.invoke(object2, objectArray);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw new RuntimeException((String)NLoginCore_577.c("㺀", (int)w, (long)(x ^ y)) + this.getName(), reflectiveOperationException);
            }
        } else {
            throw new IllegalArgumentException((String)NLoginCore_577.c("㺃", (int)(z & aa), (long)ab) + object + (String)NLoginCore_577.c("㺆", (int)ac, (long)(ad ^ ae)) + object.getClass().getCanonicalName());
        }
    }

    @Override
    public String u() {
        return this.var_org_bukkit_entity_Player_d.getDisplayName();
    }

    static {
        Class<Player> clazz;
        Field field;
        Field field2;
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0 >>> 37 | 0 << ~37 + 1) & 0xFFFFFFFF;
        var_int_c = 2048 >>> 11 | 2048 << ~11 + 1;
        var_int_d = Integer.reverse(0);
        e = Integer.reverse(0);
        var_long_f = Long.reverse(-1234424570225756682L);
        var_int_g = 2 >>> 193 | 2 << ~193 + 1;
        h = Long.reverse(-1234424570225756682L);
        i = Integer.reverse(0x40000000);
        j = Long.reverse(-2387346074832603658L);
        k = Long.reverse(0x3000000000000000L);
        l = 0x200000 >>> 117 | 0x200000 << ~117 + 1;
        m = 0 >>> 42 | 0 << ~42 + 1;
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 0 >>> 152 | 0 << ~152 + 1;
        p = Integer.reverse(Integer.MIN_VALUE);
        q = (131072 >>> 209 | 131072 << -209) & 0xFFFFFFFF;
        r = Integer.reverse(Integer.MIN_VALUE);
        s = 0 >>> 7 | 0 << ~7 + 1;
        t = Integer.reverse(0);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(0);
        w = 6 >>> 161 | 6 << ~161 + 1;
        x = Long.reverse(-2387346074832603658L);
        y = Long.reverse(0x3000000000000000L);
        z = 0x4000000 >>> 152 | 0x4000000 << -152;
        aa = Integer.reverse(-1);
        ab = Long.reverse(-1234424570225756682L);
        ac = Integer.reverse(-1610612736);
        ad = Long.reverse(-2387346074832603658L);
        ae = Long.reverse(0x3000000000000000L);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = 64 >>> 6 | 64 << -6;
        ah = Integer.reverse(0);
        ai = 0 >>> 49 | 0 << ~49 + 1;
        aj = (0x30000000 >>> 251 | 0x30000000 << ~251 + 1) & 0xFFFFFFFF;
        ak = Long.reverse(-2387346074832603658L);
        al = Long.reverse(0x3000000000000000L);
        am = 0x380000 >>> 243 | 0x380000 << ~243 + 1;
        an = Long.reverse(-2387346074832603658L);
        ao = Long.reverse(0x3000000000000000L);
        ap = Integer.reverse(0);
        aq = Integer.reverse(0);
        ar = Integer.reverse(0x10000000);
        as = (-1 >>> 249 | -1 << -249) & 0xFFFFFFFF;
        at = Long.reverse(-1234424570225756682L);
        au = 32 >>> 36 | 32 << -36;
        av = Integer.reverse(0);
        aw = (3008 >>> 102 | 3008 << -102) & 0xFFFFFFFF;
        ax = Integer.reverse(Integer.MIN_VALUE);
        ay = 16384 >>> 238 | 16384 << ~238 + 1;
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = 0 >>> 50 | 0 << ~50 + 1;
        bb = Integer.reverse(Integer.MIN_VALUE);
        bc = Integer.reverse(0);
        bd = Integer.reverse(0x40000000);
        be = (0 >>> 27 | 0 << ~27 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = Integer.reverse(-1879048192);
        bh = Long.reverse(-1234424570225756682L);
        bi = Integer.reverse(0x50000000);
        bj = Integer.reverse(-1);
        bk = Long.reverse(-1234424570225756682L);
        bl = 128000 >>> 234 | 128000 << -234;
        bm = (-2147483643 >>> 159 | -2147483643 << ~159 + 1) & 0xFFFFFFFF;
        bn = Long.reverse(-2387346074832603658L);
        bo = Long.reverse(0x3000000000000000L);
        bp = Integer.reverse(0x30000000);
        bq = Long.reverse(-2387346074832603658L);
        br = Long.reverse(0x3000000000000000L);
        bs = Integer.reverse(-1342177280);
        bt = Long.reverse(-2387346074832603658L);
        bu = Long.reverse(0x3000000000000000L);
        bv = 0xC000000 >>> 186 | 0xC000000 << ~186 + 1;
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = Integer.reverse(0x70000000);
        by = Long.reverse(-2387346074832603658L);
        bz = Long.reverse(0x3000000000000000L);
        ca = Integer.reverse(-268435456);
        cb = Long.reverse(-2387346074832603658L);
        cc = Long.reverse(0x3000000000000000L);
        cd = (32768 >>> 110 | 32768 << -110) & 0xFFFFFFFF;
        ce = Integer.reverse(0);
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = (0 >>> 136 | 0 << ~136 + 1) & 0xFFFFFFFF;
        ch = Integer.reverse(0);
        ci = Integer.reverse(0x8000000);
        cj = -1 >>> 26 | -1 << ~26 + 1;
        ck = Long.reverse(-1234424570225756682L);
        cl = Integer.reverse(0x58000000);
        cm = Integer.reverse(0x58000000);
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = (0 >>> 244 | 0 << -244) & 0xFFFFFFFF;
        cp = Integer.reverse(-2013265920);
        cq = Long.reverse(-2387346074832603658L);
        cr = Long.reverse(0x3000000000000000L);
        cs = (64 >>> 102 | 64 << ~102 + 1) & 0xFFFFFFFF;
        ct = Integer.reverse(0);
        cu = (0x20000001 >>> 156 | 0x20000001 << -156) & 0xFFFFFFFF;
        cv = Integer.reverse(-1);
        cw = Long.reverse(-1234424570225756682L);
        cx = Integer.reverse(-939524096);
        cy = Long.reverse(-2387346074832603658L);
        cz = Long.reverse(0x3000000000000000L);
        da = 0 >>> 12 | 0 << -12;
        db = Integer.reverse(0x28000000);
        dc = Long.reverse(-2387346074832603658L);
        dd = Long.reverse(0x3000000000000000L);
        de = Integer.reverse(0);
        df = Integer.reverse(-1476395008);
        dg = Long.reverse(-1234424570225756682L);
        dh = Integer.reverse(0);
        di = (-2147483643 >>> 158 | -2147483643 << -158) & 0xFFFFFFFF;
        dj = Integer.reverse(-1);
        dk = Long.reverse(-1234424570225756682L);
        dl = Integer.reverse(Integer.MIN_VALUE);
        dm = (0 >>> 149 | 0 << ~149 + 1) & 0xFFFFFFFF;
        dn = 94208 >>> 108 | 94208 << -108;
        cfr_renamed_1 = (-1 >>> 12 | -1 << -12) & 0xFFFFFFFF;
        dp = Long.reverse(-1234424570225756682L);
        dq = Integer.reverse(0);
        dr = Integer.reverse(0x18000000);
        ds = Long.reverse(-2387346074832603658L);
        dt = Long.reverse(0x3000000000000000L);
        du = 0 >>> 245 | 0 << ~245 + 1;
        dv = (50 >>> 161 | 50 << -161) & 0xFFFFFFFF;
        dw = Long.reverse(-2387346074832603658L);
        dx = Long.reverse(0x3000000000000000L);
        dy = 0x20000000 >>> 125 | 0x20000000 << ~125 + 1;
        dz = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[cl];
        var_java_lang_String_arr_b = new String[cm];
        NLoginCore_577.void_b();
        if (NLoginCore_049.var_long_k != null) {
            String[] stringArray = new String[cn];
            stringArray[NLoginCore_577.co] = NLoginCore_577.c("㺀", (int)cp, (long)(cq ^ cr));
            field2 = NLoginCore_546.a(NLoginCore_049.var_long_k, stringArray);
        } else {
            field2 = var_java_lang_reflect_Field_b = null;
        }
        if (NLoginCore_049.var_long_k != null) {
            String[] stringArray = new String[cs];
            stringArray[NLoginCore_577.ct] = NLoginCore_577.c("㺃", (int)(cu & cv), (long)cw);
            field = NLoginCore_546.a(NLoginCore_049.var_long_k, stringArray);
        } else {
            field = null;
        }
        var_java_lang_reflect_Field_c = field;
        var_java_lang_Class____f = NLoginCore_298.a((String)NLoginCore_577.c("㺆", (int)cx, (long)(cy ^ cz)), new String[da]);
        if (var_java_lang_Class____f != null) {
            var_java_lang_reflect_Method_b = NLoginCore_546.a(Player.class, (String)NLoginCore_577.c("㺉", (int)db, (long)(dc ^ dd)), new Class[de]);
            clazz = NLoginCore_298.a((String)NLoginCore_577.c("㺌", (int)df, (long)dg), new String[dh]);
            if (clazz != null) {
                Class[] classArray = new Class[dl];
                classArray[NLoginCore_577.dm] = clazz;
                var_java_lang_reflect_Method_c = NLoginCore_546.a(var_java_lang_Class____f, (String)NLoginCore_577.c("㺏", (int)(di & dj), (long)dk), classArray);
            }
        }
        var_java_lang_Class____g = NLoginCore_298.a((String)NLoginCore_577.c("㺒", (int)(dn & cfr_renamed_1), (long)dp), new String[dq]);
        clazz = NLoginCore_298.a((String)NLoginCore_577.c("㺕", (int)dr, (long)(ds ^ dt)), new String[du]);
        if (var_java_lang_Class____g != null && clazz != null && clazz.isAssignableFrom(Player.class)) {
            Class[] classArray = new Class[dy];
            classArray[NLoginCore_577.dz] = var_java_lang_Class____g;
            var_java_lang_reflect_Method_d = NLoginCore_546.a(clazz, (String)NLoginCore_577.c("㺘", (int)dv, (long)(dw ^ dx)), classArray);
        }
        var_java_lang_String_arr_b = new ConcurrentHashMap();
    }

    @Override
    public void a(String string, String string2, int n, int n2, int n3) {
        NLoginInterface_033.a().a(this.var_org_bukkit_entity_Player_d, NLoginCore_065.f(string, ay != 0), NLoginCore_065.f(string2, az != 0), n, n2, n3);
    }

    public String toString() {
        return (String)NLoginCore_577.c("㺀", (int)bg, (long)bh) + this.var_java_util_UUID_d + (String)NLoginCore_577.c("㺃", (int)(bi & bj), (long)bk) + this.var_org_bukkit_entity_Player_d + (char)bl;
    }

    @Override
    public NLoginInterface_023 com_nickuc_login_NLoginInterface_023_a() {
        if (this.var_com_nickuc_login_NLoginInterface_023_a == null) {
            this.var_com_nickuc_login_NLoginInterface_023_a = (object, objectArray) -> {
                if (!this.var_org_bukkit_entity_Player_d.isOnline()) {
                    return;
                }
                try {
                    NLoginCore_049.a(this.var_org_bukkit_entity_Player_d, object);
                    Object[] objectArray2 = objectArray;
                    int n = objectArray2.length;
                    for (int i = ch; i < n; ++i) {
                        Object object2 = objectArray2[i];
                        NLoginCore_049.a(this.var_org_bukkit_entity_Player_d, object2);
                    }
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    throw new RuntimeException((String)NLoginCore_577.c("㺀", (int)(ci & cj), (long)ck) + this.getName(), reflectiveOperationException);
                }
            };
        }
        return this.var_com_nickuc_login_NLoginInterface_023_a;
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return ba != 0;
        }
        NLoginCore_577 NLoginCore_577 = (NLoginCore_577)object;
        return (Objects.equals(this.var_java_util_UUID_d, NLoginCore_577.var_java_util_UUID_d) && Objects.equals(this.var_org_bukkit_entity_Player_d, NLoginCore_577.var_org_bukkit_entity_Player_d) ? bb : bc) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_577.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.C("ՂդզՆժ։ց֗փՒ֐ֆ֔֎՗ռ֛֞֝֕֕ժ", (byte)119, 67), NLoginCore_577.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣺ࣬ࣽࣾअअࣽऐࣵࣾँ։", (byte)119, 70) + string + NLoginCore_027.D("Ք", (byte)119, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public void ad() {
        NLoginInterface_033.a().a(this.var_org_bukkit_entity_Player_d);
    }

    @Override
    public boolean R() {
        Player player = this.var_org_bukkit_Server_c.getPlayerExact(this.var_org_bukkit_entity_Player_d.getName());
        return (player != null && player.equals((Object)this.var_org_bukkit_entity_Player_d) ? var_int_c : var_int_d) != 0;
    }

    @Override
    public void a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_337 NLoginCore_3372, Object object, byte[] byArray) {
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_577.c("㺀", (int)(ar & as), (long)at));
        }
        this.var_org_bukkit_entity_Player_d.sendPluginMessage((Plugin)NLoginInterface_0112.b(), (String)object, byArray);
    }

    @Override
    public void n(String string) {
        this.var_org_bukkit_entity_Player_d.setDisplayName(string);
    }

    @Override
    public Optional<String> a() {
        try {
            return Optional.of(this.var_org_bukkit_entity_Player_d.getLocale());
        }
        catch (NoSuchMethodError noSuchMethodError) {
            if (var_java_lang_reflect_Field_c == null) {
                return Optional.empty();
            }
            Object object = NLoginCore_049.a(this.var_org_bukkit_entity_Player_d);
            if (object == null) {
                return Optional.empty();
            }
            try {
                return Optional.ofNullable((String)var_java_lang_reflect_Field_c.get(object));
            }
            catch (Exception exception) {
                return Optional.empty();
            }
        }
    }

    @Override
    public boolean i(String string) {
        return this.var_org_bukkit_entity_Player_d.hasPermission(string);
    }

    @Generated
    private NLoginCore_577(Player player, Server server, NLoginCore_589 NLoginInterface_0222) {
        this.var_org_bukkit_entity_Player_d = player;
        this.var_org_bukkit_Server_c = server;
        this.var_com_nickuc_login_NLoginInterface_022_a = NLoginInterface_0222;
    }

    @Override
    public CompletableFuture<Void> a(String string) {
        return NLoginCore_012.a(this.var_org_bukkit_entity_Player_d, NLoginCore_065.f(string, ag != 0));
    }

    private static void void_b() {
        int n;
        var_long_c = 8047850771465534331L;
        long l = var_long_c ^ 0xB561CBAD75608AC5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(53 + 16), (byte)(82 + 1), 47, (byte)(17 + 50), (byte)(51 + 15), (byte)(66 + 1), (byte)(8 + 39), (byte)(70 + 10), (byte)(69 + 6), 67, (byte)(25 + 58), (byte)(46 + 7), (byte)(74 + 6), (byte)(34 + 63), (byte)(90 + 10), (byte)(16 + 84), (byte)(5 + 100), (byte)(25 + 85), (byte)(71 + 32)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
                    NLoginCore_577.var_java_lang_String_arr_b[0] = NLoginCore_092.B("ƴƩƸƷǓƜƲǛƻƽǜƫ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[1] = NLoginCore_387.C("Ց՟ԿՒֈցՅՇՊ՜ֈՓ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[2] = NLoginCore_387.E("չ֠ըտե֕քֈ֢֗կը֑կիֳ֩յ֖֘ֆ֔ցւ", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[3] = NLoginCore_076.E("֦֑ւ֝պ֤֩սեժ֋ֲ֫հ֖֏։֏ֲֲִֵֶַֺֺׂ֛֚֔֕֙֗տ֑֖׆ֻֻׁ֥֢֖֟", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ձ֨՟ո֬ի֦ր֨֨կ֎ծլ֓հր֙֋ֱִ֮֕֯ֈ֬֎ִֹֺ֝րվּքׇּּ֖֚֡֕֙֜", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[5] = NLoginCore_324.B("ǜǇǞǈƺƱǙǌưǁơƫ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[6] = NLoginCore_223.E("֑ֈրռքևզ֖ս֌֍֠֋֑֨վն֦֋ִձּն֒֩׀։ֵ֠ւ֯ׄ", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[7] = NLoginCore_446.B("ǇƺƷƭƲƷƴƢƠƠǘƫ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[8] = NLoginCore_027.F("աագ֠ջ։ս֪֢֭֨ջ֤֮֊֖խփ֨֐ּ֚֝ֈ֫սְ֜֓֜֕֞տֺ֒֡׆֊ֻּּ֥֖֡", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[9] = NLoginCore_223.E("կ֒ո֒շբդ֗֊֢ռ֦֦֬իְַ֡֎ո֖ղֱֺ֮ջտֽ֟֬֔֎֛֢֛֓փ֦׉ֽ֧֘ֈ֖", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[10] = NLoginCore_092.B("ǘǙƛƘƴǎǓƮƟǏǜǒƣǉƢǗǂǨƽƺǁǉƶƷ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[11] = NLoginCore_223.A("ƦǝƔƭǡƠǛƵǝǝƤǠǓǓƥƤƶǌǙǟǞǐƩǟƭǣƮǉǓǁǢǚǦƺƽǓƸǵǊǐǟǝǦǋ", (byte)114, 65);
                    NLoginCore_577.var_java_lang_String_arr_b[12] = NLoginCore_324.C("քկֆհբՙցմ՘թՉՓ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[13] = NLoginCore_201.E("ֈ֕չ֘֬փ֥ծփր֯ն", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[14] = NLoginCore_027.E("չմգ֔են֤ևֈք֛ն", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[15] = NLoginCore_559.C("ոՓպՏ՗զՀՓէ՜ջՅսէաջրՔ֍Տև֕֊գըվֆռՖ֝֗֍ւ֎֞քշ֜՜֛պխ֡եէք֓ցխհյְֱָ֭փպռֵָֺ֖֯֔֝փց֐ׅ֪׉փ֌׊׈ׄ֌ֲּ֩ֆֲ׏׈֏֬ך׆ְֱ֧֛֭֩׋כ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[16] = NLoginCore_223.F("ֈ֞֠֡տ։֪֮֩֯հսրփ֡լև֍ְ֭֯֓ջ֦յ֗֌ְׂׄցֲ", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[17] = NLoginCore_173.F("֑՚֊օճվգֆե֍հն", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[18] = NLoginCore_091.C("շՏՙՖճշՄՈօ։՚Փ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[19] = NLoginCore_027.D("ՎԾօջքՓոօ՞բՄկէ֐ժը֏ճյֆճո՚֜ոՔմռվ֖֝խճ֣շկ՚շազ֧֟֜ճ", (byte)114, 68);
                    NLoginCore_577.var_java_lang_String_arr_b[20] = NLoginCore_201.A("ƺǏƔǇƴƬǏƕƷƸǤƫ", (byte)114, 65);
                    NLoginCore_577.var_java_lang_String_arr_b[21] = NLoginCore_446.E("տ֕֔եյ֌խ֝ք֪֠հ֥զղ֡֔կְֱֵ֯֊֮֓֞։ֱյֶֽ֣֠׃֦֟փֵֽ֛֮׏ֱֈ׃ֆֲ֧׈ו֢֡׉ך֢֡", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[22] = NLoginCore_092.F("֛սչչ֝֜ն֧֗ո֏դֆղյխ֎֙ճֻ֪֬ցւ", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[23] = NLoginCore_384.B("ƥǇǜƗƴǊǛƺƼƥƝƤǘǩǙƢǛƤǗƷǟǱƻǇǡƾǣƲǠǴǵƻǙǸǋǠǒƿǑǵǚǃǎȂȉǕǟǦȁǟȅǢȐǙǖǗ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[24] = NLoginCore_173.B("ƥǇǜƗƴǊǛƺƼƥƝƤǘǩǙƢǛƤǗƷǟƫƼǟǢǈǧǪǵǵƺƷǈǙƷǺǐƼǻȃǟǃǑǃǾǴǖǨǹȃǷǾǇǿǖǗ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[25] = NLoginCore_384.D("ո՚ՖՖպչՓմքՕլՁգՏՒՊինՐ֘։և՞՟", (byte)114, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_577.var_java_lang_String_arr_b[0] = NLoginCore_110.E("ւ֚ննտօ֘պ֊էհն", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ƘǒǔƿƶƗǢǢƢƟǐƫ", (byte)114, 65);
                    NLoginCore_577.var_java_lang_String_arr_b[2] = NLoginCore_076.D("ՖսՅ՜ՂղաեմտՋօզըՌև՟օ֐թի֗՞՟", (byte)114, 68);
                    NLoginCore_577.var_java_lang_String_arr_b[3] = NLoginCore_138.F("֦֑ւ֝պ֤֩սեժ֋ֲ֫հ֖֏։֏ֲֲִֵֶֺֺׂ֛֚֔֕֙֗ւ֔׃։ַֻׁ֬־׉֖֭", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[4] = NLoginCore_223.E("ձ֨՟ո֬ի֦ր֨֨կ֎ծլ֓հր֙֋ֱִ֮֕֯ֈ֬֎ִֹֺ֝ր֚֟֓֡և֖֢֣֖֭֙֩", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[5] = NLoginCore_004.D("փվբՠ՟գևշդխռՓ", (byte)114, 68);
                    NLoginCore_577.var_java_lang_String_arr_b[6] = NLoginCore_092.D("ծե՝ՙադՃճ՚թժսըծօ՛Փփը֑ՎՔէՑշ֚՛յց։՟֚մփ՝մճ՟ֈք֖֌֨ճ", (byte)114, 68);
                    NLoginCore_577.var_java_lang_String_arr_b[7] = NLoginCore_138.C("ԻՕ՜ՏՈՕֆՙՙցՅՓ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[8] = NLoginCore_384.F("աագ֠ջ։ս֪֢֭֨ջ֤֮֊֖խփ֨֐ּ֚֝ֈ֫սְ֜֓֜֕֞׃ֳ֟֕֬վփֽ׍׎֐֖", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[9] = NLoginCore_324.F("կ֒ո֒շբդ֗֊֢ռ֦֦֬իְַ֡֎ո֖ղֱֺ֮ջտֽ֟֬֔֎ֽ֛֪֟֟֊։ָ֨ב֌֐׍ׂ֑֢אהִ֢֘֘֬֡", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[10] = NLoginCore_223.C("րցՃՀ՜նջՖՇշև՚Ղլղ֏֔֔տցև֗՞՟", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[11] = NLoginCore_027.F("ձ֨՟ո֬ի֦ր֨֨կ֫֞֞հկց֤֪֛֗֩մ֪ո֮չ֔֞֌֥֭֜ց֧֧֩֌ָֻ֖֖֝֡", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[12] = NLoginCore_027.B("ǉƥǗƺƼƱƴǁƺǆǘƫ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[13] = NLoginCore_324.B("ƽƼƛǓǓƯƪƵǡǢǐƫ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[14] = NLoginCore_575.F("ս֦ու֥֛գ֛ւծ֐ւլ֐ִַֺ֑֭֯֠֘ցւ", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[15] = NLoginCore_427.C("ոՓպՏ՗զՀՓէ՜ջՅսէաջրՔ֍Տև֕֊գըվֆռՖ֝֗֍ւ֎֞քշ֜՜֛պխ֡եէք֓ցխհյְֱָ֭փպռֵָֺ֖֯֔֝փց֐ׅ֪׉փ֌׊׈ׄ֌ֲּ֩ֆֲ׏׈֏֧֓׌׊ֳֵָֹֹֻֿ֤֦֛֚֞֞גֵי׉רֳ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[16] = NLoginCore_453.C("եջսվ՜զև֋ֆ֌Ս՚՝ՠվՉդժ֌հ֊և֊֎ժՕ֋։֖֑ո֥֧֝֠֗֙մը֙ր֧֎ճ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[17] = NLoginCore_451.E("կչռ֤֕֋֥ջ֝֏։֌֓ր֖ֈթ֗֐ֆ֎քցւ", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[18] = NLoginCore_201.F("֖֓ով֞ըցդժհչդ֥ճֲ֍ָ֥ֆ֗մքցւ", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[19] = NLoginCore_201.A("ƦƖǝǓǜƫǐǝƶƺƜǇƿǨǂǀǧǋǍǞǋǐƲǴǐƬǌǔǖǮǵǅǚǥǹǉǎǙǰǗǟǢƽǂǷǆǁǢǅǨȅȇȉǩǖǗ", (byte)114, 65);
                    NLoginCore_577.var_java_lang_String_arr_b[20] = NLoginCore_446.C("Տջ՘ճ՞Յփ֋ջե՜Չտբխփֈի֋Օլև՞՟", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[21] = NLoginCore_027.F("տ֕֔եյ֌խ֝ք֪֠հ֥զղ֡֔կְֱֵ֯֊֮֓֞։ֱյֶֽ֣֠׃֦֟փֵֽ֛֮׏ֺ֏א׌֐ֶטׇׂ֪גחחל֨׏בף׌אֺף", (byte)114, 70);
                    NLoginCore_577.var_java_lang_String_arr_b[22] = NLoginCore_453.B("ǐƲƮƮǒǑƫǌǜƭǄƽǠǟƽǣǬƥǋǎǫǯƶƷ", (byte)114, 66);
                    NLoginCore_577.var_java_lang_String_arr_b[23] = NLoginCore_201.C("ՍկքԿ՜ղփբդՍՅՌր֑ցՊփՌտ՟և֙գկ։զ֋՚ֈ֜֝գց֠ճֈպէչ֝ւիո֥֪֢֨֨ց֪֞֘ր֑վտ", (byte)114, 67);
                    NLoginCore_577.var_java_lang_String_arr_b[24] = NLoginCore_427.E("հ֧֒բտ֦֕օևհըկִ֣֤խ֦կ֢ւ֪նևֲֵ֪֭֓׀׀օւ֤֓ւׅ֛և׆׎֪֎֥֙֩׈ֲֹׂ֖֤֒֕֩חֻ׎ב֩׃ֻמ׍צ", (byte)114, 69);
                    NLoginCore_577.var_java_lang_String_arr_b[25] = NLoginCore_559.B("ǐƲƮƮǒǑƫǌǜƭǂǘǖƿƧƨƶǇǇǩƮǯƶƷ", (byte)114, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_577.var_java_lang_String_arr_b[0] = NLoginCore_387.C("՚ՂՠչաճոՉՈ՛֍՘՜Շ֍աՍՠև֘ֈձ՞՟", (byte)114, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_577.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ƽǍǗǀǠƙƯǠƣƱǘǣǀǝǜǔǟǗǢƬƮǯǩǰǧǩǡǏǵǘǓǙ", (byte)114, 66);
                }
            }
        }
    }

    @Override
    @Nullable
    public InetSocketAddress java_net_InetSocketAddress_a() {
        try {
            return this.var_org_bukkit_entity_Player_d.getAddress();
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    @Override
    public <T> T c() {
        return (T)this.var_org_bukkit_entity_Player_d;
    }

    @Override
    public void p(String string) {
        this.var_org_bukkit_entity_Player_d.chat(string);
    }

    public int hashCode() {
        Object[] objectArray = new Object[bd];
        objectArray[NLoginCore_577.be] = this.var_java_util_UUID_d;
        objectArray[NLoginCore_577.bf] = this.var_org_bukkit_entity_Player_d;
        return Objects.hash(objectArray);
    }

    private static NLoginCore_577 a(NLoginCore_089 NLoginCore_0892, Server server, Player player) {
        NLoginCore_577 NLoginCore_577 = (NLoginCore_577)var_java_lang_String_arr_b.get(player);
        if (NLoginCore_577 != null) {
            return NLoginCore_577;
        }
        if (NLoginCore_370.aj()) {
            StackTraceElement[] stackTraceElementArray = new Exception().getStackTrace();
            Object object = stackTraceElementArray.length > 0 ? stackTraceElementArray[Math.min(bv, stackTraceElementArray.length - bw)].toString() : NLoginCore_577.c("㺀", (int)bx, (long)(by ^ bz));
            Object[] objectArray = new Object[cd];
            objectArray[NLoginCore_577.ce] = player.getName();
            objectArray[NLoginCore_577.cf] = object;
            NLoginCore_370.c((String)NLoginCore_577.c("㺃", (int)ca, (long)(cb ^ cc)), objectArray);
        }
        return NLoginCore_577.b(NLoginCore_0892, server, player);
    }

    public static boolean Q() {
        return (var_java_lang_reflect_Method_d != null ? var_int_a : var_int_b) != 0;
    }

    @Override
    public NLoginCore_589 com_nickuc_login_NLoginInterface_022_a() {
        return this.var_com_nickuc_login_NLoginInterface_022_a;
    }

    static NLoginCore_577 b(NLoginCore_089 NLoginCore_0892, Server server, Player player) {
        NLoginCore_589 NLoginInterface_0222 = NLoginCore_012.V() ? new NLoginCore_530(NLoginCore_0892.com_nickuc_login_loader_platform_BukkitLoader_a(), player) : NLoginCore_0892.b(cg != 0);
        return new NLoginCore_577(player, server, NLoginInterface_0222);
    }

    @Override
    public void o(String string) {
        NLoginInterface_001.a().send(this.var_org_bukkit_entity_Player_d, NLoginCore_065.f(string, af != 0));
    }

    @Override
    public UUID java_util_UUID_a() {
        return this.var_org_bukkit_entity_Player_d.getUniqueId();
    }

    @Override
    public int h() {
        if (var_java_lang_reflect_Field_b == null) {
            return ah;
        }
        Object object = NLoginCore_049.a(this.var_org_bukkit_entity_Player_d);
        if (object == null) {
            return ai;
        }
        try {
            return (Integer)var_java_lang_reflect_Field_b.get(object);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_577.c("㺀", (int)aj, (long)(ak ^ al)) + this + (String)NLoginCore_577.c("㺃", (int)am, (long)(an ^ ao)), exception, new Object[ap]);
            return aq;
        }
    }

    @Override
    public void l(String string) {
        if (string.length() >= au && string.charAt(av) == aw) {
            string = string.substring(ax);
        }
        this.var_org_bukkit_Server_c.dispatchCommand((CommandSender)this.var_org_bukkit_entity_Player_d, string);
    }

    @Override
    public boolean S() {
        return (this.var_org_bukkit_entity_Player_d.hasMetadata((String)NLoginCore_577.c("㺀", (int)e, (long)var_long_f)) || this.var_org_bukkit_entity_Player_d.hasMetadata((String)NLoginCore_577.c("㺃", (int)var_int_g, (long)h)) || this.var_org_bukkit_entity_Player_d.hasMetadata((String)NLoginCore_577.c("㺆", (int)i, (long)(j ^ k))) ? l : m) != 0;
    }
}

