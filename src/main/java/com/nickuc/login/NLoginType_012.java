/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.DatabaseType
 *  com.nickuc.login.api.enums.ImplementationType
 *  com.nickuc.login.api.enums.SpawnType
 *  com.nickuc.login.api.exception.nLoginRequestUnavailableException
 *  com.nickuc.login.api.exception.nLoginRequestUnsupportedException
 *  com.nickuc.login.api.nLoginAPI
 *  com.nickuc.login.api.nLoginAPI$nLoginInternal
 *  com.nickuc.login.api.types.AccountData
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.api.types.Location
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.Location
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.api.enums.ImplementationType;
import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.exception.nLoginRequestUnavailableException;
import com.nickuc.login.api.exception.nLoginRequestUnsupportedException;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_245;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_457;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_121;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_028;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginType_016;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_012
implements nLoginAPI {
    private static long ah;
    private static int m;
    private static int cm;
    private static int cv;
    private static int ca;
    private static int ch;
    private static int bb;
    private static long bq;
    private static long ae;
    private static int cz;
    private static int au;
    private static int cr;
    private static int cy;
    private static int bd;
    private static int cs;
    private static long bi;
    private static long bh;
    private static String[] var_java_lang_String_arr_a;
    private static int ax;
    private static int ai;
    private static int aa;
    private static int cd;
    private static long e;
    private static int cj;
    private static int r;
    private static final int var_int_l;
    private static int an;
    private static int var_int_p;
    private static int bv;
    private static int k;
    private static int z;
    private static int af;
    private static long ar;
    private static int bu;
    private static int cn;
    private static int am;
    private static int ce;
    private static int by;
    private static int at;
    private static int ad;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_p;
    private static int ck;
    private static int bx;
    private static long aw;
    private static long o;
    private static long w;
    private static int bm;
    private static int bo;
    private static int cq;
    private static long i;
    private final Set<String> var_java_util_Set_java_lang_String__a;
    private static int cp;
    private static long y;
    private static int br;
    private static int dc;
    private static int ci;
    private static int cx;
    private static long be;
    private static long var_long_b;
    private static long aq;
    private static int v;
    private static long bs;
    private static long h;
    private static int bp;
    private static int var_int_c;
    private static long az;
    private final NLoginCore_245 var_com_nickuc_login_NLoginCore_245_a = new NLoginCore_245(this);
    private static int cl;
    private static long ac;
    private static long ag;
    private static int cg;
    private static int db;
    private static int al;
    private static int var_int_a;
    private static int cu;
    private static long d;
    private static int ao;
    private static int u;
    private static long bf;
    private static int ay;
    private static int as;
    private static int bc;
    private static String[] var_java_lang_String_arr_b;
    private static int x;
    private static long cc;
    private static int j;
    private static long ak;
    private static long var_long_l;
    private static long bl;
    private static int ap;
    private static int da;
    private static int cb;
    private static long bt;
    private static int cw;
    private static long t;
    private static int bz;
    private static long bk;
    private static int bn;
    private static long var_long_c;
    private static int n;
    private static int s;
    private static long cf;
    private static int co;
    private static int f;
    private static long ab;
    private static int g;
    private static int av;
    private static int ba;
    private static int dd;
    private static int bg;
    private static long aj;
    private static int bj;
    private static int ct;
    private static long q;
    private static int bw;

    @Nonnull
    public Iterator<AccountData> getAccounts() {
        throw new nLoginRequestUnsupportedException((String)NLoginType_012.c("㺀", (int)(au & av), (long)aw) + this.getImplementationType() + (String)NLoginType_012.c("㺃", (int)(ax & ay), (long)az));
    }

    public boolean setEmail(@Nonnull Identity identity, @Nullable String string) {
        Object[] objectArray = new Object[cp];
        objectArray[NLoginType_012.cq] = identity;
        objectArray[NLoginType_012.cr] = string;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_k, objectArray);
    }

    public boolean isAuthenticated(Identity identity) {
        if (identity == null) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺀", (int)bd, (long)(be ^ bf)));
        }
        if (!(identity instanceof NLoginCore_473)) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺃", (int)bg, (long)(bh ^ bi)) + NLoginCore_473.class.getCanonicalName() + (String)NLoginType_012.c("㺆", (int)bj, (long)(bk ^ bl)) + identity.getClass().getCanonicalName());
        }
        Object[] objectArray = new Object[bm];
        objectArray[NLoginType_012.bn] = identity;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_e, objectArray);
    }

    public boolean changePassword(@Nonnull Identity identity, @Nonnull String string) {
        Object[] objectArray = new Object[cm];
        objectArray[NLoginType_012.cn] = identity;
        objectArray[NLoginType_012.co] = string;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_j, objectArray);
    }

    public long getAccountCount() {
        return (Long)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_d, new Object[ba]);
    }

    @Nonnull
    public nLoginAPI.nLoginInternal internal() {
        return this.var_com_nickuc_login_NLoginCore_245_a;
    }

    static {
        var_int_a = (0 >>> 237 | 0 << -237) & 0xFFFFFFFF;
        var_long_b = Long.reverse(4827996979049345835L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(-5115950998184709333L);
        e = Long.reverse(-432345564227567616L);
        f = (0 >>> 249 | 0 << -249) & 0xFFFFFFFF;
        g = 131072 >>> 240 | 131072 << -240;
        h = Long.reverse(-5115950998184709333L);
        i = Long.reverse(-432345564227567616L);
        j = (393216 >>> 49 | 393216 << ~49 + 1) & 0xFFFFFFFF;
        k = -1 >>> 18 | -1 << ~18 + 1;
        var_long_l = Long.reverse(4827996979049345835L);
        m = Integer.reverse(0x20000000);
        n = -1 >>> 172 | -1 << ~172 + 1;
        o = Long.reverse(4827996979049345835L);
        var_int_p = 0x1400000 >>> 214 | 0x1400000 << ~214 + 1;
        q = Long.reverse(4827996979049345835L);
        r = (0x18000000 >>> 91 | 0x18000000 << ~91 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(0x60000000);
        t = Long.reverse(4827996979049345835L);
        u = Integer.reverse(-536870912);
        v = Integer.reverse(-1);
        w = Long.reverse(4827996979049345835L);
        x = Integer.reverse(0x10000000);
        y = Long.reverse(4827996979049345835L);
        z = 0 >>> 109 | 0 << -109;
        aa = (0x900000 >>> 212 | 0x900000 << ~212 + 1) & 0xFFFFFFFF;
        ab = Long.reverse(4827996979049345835L);
        ac = Long.reverse(5386305154335113216L);
        ad = 2560 >>> 168 | 2560 << -168;
        ae = Long.reverse(4827996979049345835L);
        af = (0x5800000 >>> 247 | 0x5800000 << ~247 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(-5115950998184709333L);
        ah = Long.reverse(-432345564227567616L);
        ai = 0x6000000 >>> 215 | 0x6000000 << ~215 + 1;
        aj = Long.reverse(-5115950998184709333L);
        ak = Long.reverse(-432345564227567616L);
        al = Integer.reverse(Integer.MIN_VALUE);
        am = 0 >>> 97 | 0 << ~97 + 1;
        an = Integer.reverse(-805306368);
        ao = Integer.reverse(0);
        ap = Integer.reverse(-1342177280);
        aq = Long.reverse(-5115950998184709333L);
        ar = Long.reverse(-432345564227567616L);
        as = 2 >>> 65 | 2 << -65;
        at = (0 >>> 131 | 0 << -131) & 0xFFFFFFFF;
        au = 0x380000 >>> 18 | 0x380000 << ~18 + 1;
        av = Integer.reverse(-1);
        aw = Long.reverse(4827996979049345835L);
        ax = Integer.reverse(-268435456);
        ay = Integer.reverse(-1);
        az = Long.reverse(4827996979049345835L);
        ba = (0 >>> 43 | 0 << -43) & 0xFFFFFFFF;
        bb = Integer.reverse(Integer.MIN_VALUE);
        bc = Integer.reverse(0);
        bd = Integer.reverse(0x8000000);
        be = Long.reverse(-5115950998184709333L);
        bf = Long.reverse(-432345564227567616L);
        bg = (544 >>> 37 | 544 << -37) & 0xFFFFFFFF;
        bh = Long.reverse(-5115950998184709333L);
        bi = Long.reverse(-432345564227567616L);
        bj = 0x48000000 >>> 186 | 0x48000000 << ~186 + 1;
        bk = Long.reverse(-5115950998184709333L);
        bl = Long.reverse(-432345564227567616L);
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = Integer.reverse(0);
        bo = Integer.reverse(-939524096);
        bp = Integer.reverse(-1);
        bq = Long.reverse(4827996979049345835L);
        br = 0x2800000 >>> 117 | 0x2800000 << ~117 + 1;
        bs = Long.reverse(-5115950998184709333L);
        bt = Long.reverse(-432345564227567616L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bv = (0 >>> 164 | 0 << -164) & 0xFFFFFFFF;
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = (0 >>> 76 | 0 << ~76 + 1) & 0xFFFFFFFF;
        by = (524288 >>> 82 | 524288 << -82) & 0xFFFFFFFF;
        bz = Integer.reverse(0);
        ca = Integer.reverse(Integer.MIN_VALUE);
        cb = Integer.reverse(-1476395008);
        cc = Long.reverse(4827996979049345835L);
        cd = 704 >>> 37 | 704 << -37;
        ce = Integer.reverse(-1);
        cf = Long.reverse(4827996979049345835L);
        cg = Integer.reverse(-1073741824);
        ch = Integer.reverse(0);
        ci = Integer.reverse(Integer.MIN_VALUE);
        cj = Integer.reverse(0x40000000);
        ck = (1024 >>> 106 | 1024 << -106) & 0xFFFFFFFF;
        cl = (0 >>> 108 | 0 << -108) & 0xFFFFFFFF;
        cm = Integer.reverse(0x40000000);
        cn = 0 >>> 52 | 0 << ~52 + 1;
        co = 16 >>> 100 | 16 << -100;
        cp = (262144 >>> 49 | 262144 << ~49 + 1) & 0xFFFFFFFF;
        cq = 0 >>> 152 | 0 << -152;
        cr = Integer.reverse(Integer.MIN_VALUE);
        cs = (0x200000 >>> 212 | 0x200000 << ~212 + 1) & 0xFFFFFFFF;
        ct = Integer.reverse(0);
        cu = Integer.reverse(Integer.MIN_VALUE);
        cv = Integer.reverse(0x40000000);
        cw = (0 >>> 148 | 0 << ~148 + 1) & 0xFFFFFFFF;
        cx = 0x800000 >>> 55 | 0x800000 << ~55 + 1;
        cy = (512 >>> 168 | 512 << ~168 + 1) & 0xFFFFFFFF;
        cz = Integer.reverse(0);
        da = Integer.reverse(Integer.MIN_VALUE);
        db = 0xB800000 >>> 23 | 0xB800000 << ~23 + 1;
        dc = -1073741819 >>> 222 | -1073741819 << ~222 + 1;
        dd = (1375731715 >>> 24 | 1375731715 << ~24 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[db];
        var_java_lang_String_arr_b = new String[dc];
        NLoginType_012.b();
        var_int_l = dd;
    }

    public boolean isAvailable() {
        return (!this.var_com_nickuc_login_bukkit_nLoginBukkit_p.com_nickuc_login_NLoginType_008_a().M() && !NLoginCore_012.d().isEmpty() ? al : am) != 0;
    }

    public boolean performRegister(@Nonnull Identity identity, @Nonnull String string, @Nullable String string2) {
        Object[] objectArray = new Object[cg];
        objectArray[NLoginType_012.ch] = identity;
        objectArray[NLoginType_012.ci] = string;
        objectArray[NLoginType_012.cj] = string2;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_h, objectArray);
    }

    private static String a(int n, long l) {
        l ^= 0x5FL;
        l ^= 0x860E8141FF125B83L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(39 + 30), (byte)(28 + 55), (byte)(13 + 34), (byte)(35 + 32), (byte)(21 + 45), (byte)(37 + 30), (byte)(23 + 24), (byte)(63 + 17), (byte)(15 + 60), (byte)(34 + 33), (byte)(70 + 13), (byte)(46 + 7), (byte)(36 + 44), (byte)(73 + 24), (byte)(58 + 42), (byte)(53 + 47), 105, (byte)(17 + 93), (byte)(10 + 93)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(25 + 44), (byte)(31 + 52)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.E("Փՠ՟Ԣբ՞ՙբխ՜ԩէիդէխԯ࣊ࢶࣃࢻࣃࢿ࢚ࢫ࣏ࢲ࢟࣍ࢠࢡ", (byte)52, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_012.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public boolean comparePassword(AccountData accountData, String string) {
        Object[] objectArray = new Object[by];
        objectArray[NLoginType_012.bz] = accountData;
        objectArray[NLoginType_012.ca] = string;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_g, objectArray);
    }

    public int getRemainingSeconds(@Nonnull Identity identity) {
        Object[] objectArray = new Object[bw];
        objectArray[NLoginType_012.bx] = identity;
        return (Integer)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_f, objectArray);
    }

    public boolean setLanguage(@Nonnull Identity identity, @Nullable String string) {
        Object[] objectArray = new Object[cv];
        objectArray[NLoginType_012.cw] = identity;
        objectArray[NLoginType_012.cx] = string;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_m, objectArray);
    }

    public int getApiVersion() {
        return an;
    }

    private <T> T a(NLoginCore_121 NLoginCore_1212, Object ... objectArray) {
        String string;
        Object object;
        Class<Object> clazz;
        Iterator<NLoginCore_277> iterator;
        NLoginInterface_019<Object>[] NLoginInterface_019Array = NLoginCore_1212.com_nickuc_login_NLoginInterface_019_java_lang_Object__arr_a();
        if (NLoginInterface_019Array.length != objectArray.length) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺀", (int)var_int_a, (long)var_long_b) + NLoginInterface_019Array.length + (String)NLoginType_012.c("㺃", (int)var_int_c, (long)(d ^ e)) + objectArray.length);
        }
        for (int i = f; i < NLoginInterface_019Array.length; ++i) {
            Class<?> clazz2;
            iterator = objectArray[i];
            if (iterator == null || (clazz = (object = NLoginInterface_019Array[i]) instanceof NLoginCore_028 ? ((NLoginCore_028)object).b() : object.a()).isAssignableFrom(clazz2 = iterator.getClass())) continue;
            throw new IllegalArgumentException((String)NLoginType_012.c("㺆", (int)g, (long)(h ^ NLoginType_012.i)) + clazz + (String)NLoginType_012.c("㺉", (int)(j & k), (long)var_long_l) + i + (String)NLoginType_012.c("㺌", (int)(m & n), (long)o) + clazz2 + (String)NLoginType_012.c("㺏", (int)var_int_p, (long)q));
        }
        if (this.var_com_nickuc_login_bukkit_nLoginBukkit_p.org_bukkit_Server_a().isPrimaryThread() && this.var_java_lang_String_arr_a.add(string = Thread.currentThread().getStackTrace()[r].toString())) {
            NLoginCore_370.c((String)NLoginType_012.c("㺒", (int)s, (long)t) + string + (String)NLoginType_012.c("㺕", (int)(u & v), (long)w) + (Object)((Object)NLoginCore_1212) + (String)NLoginType_012.c("㺘", (int)x, (long)y), new Object[z]);
        }
        Object object2 = null;
        iterator = this.var_com_nickuc_login_bukkit_nLoginBukkit_p.java_lang_Object_b().c().iterator();
        if (iterator.hasNext()) {
            object2 = object = iterator.next();
        }
        if (object2 == null) {
            throw new nLoginRequestUnavailableException((String)NLoginType_012.c("㺛", (int)aa, (long)ab));
        }
        iterator = this.var_com_nickuc_login_bukkit_nLoginBukkit_p.com_nickuc_login_NLoginType_018_a().a((NLoginCore_277)object2, NLoginCore_1212, objectArray);
        try {
            object = (JSONObject)((CompletableFuture)((Object)iterator)).get(ac, TimeUnit.MILLISECONDS);
            clazz = object != null ? NLoginCore_1212.a().a((JSONObject)object) : null;
            return (T)(NLoginCore_1212.k() ? Optional.ofNullable(clazz) : clazz);
        }
        catch (InterruptedException interruptedException) {
            throw new nLoginRequestUnavailableException((String)NLoginType_012.c("㺞", (int)ad, (long)ae), (Throwable)interruptedException);
        }
        catch (ExecutionException executionException) {
            throw new nLoginRequestUnavailableException((String)NLoginType_012.c("㺡", (int)af, (long)(ag ^ ah)), (Throwable)executionException);
        }
        catch (TimeoutException timeoutException) {
            throw new nLoginRequestUnavailableException((String)NLoginType_012.c("㺤", (int)ai, (long)(aj ^ ak)));
        }
        catch (ClassCastException classCastException) {
            throw new RuntimeException(classCastException);
        }
    }

    public boolean forceLogin(@Nonnull Identity identity, boolean bl) {
        Object[] objectArray = new Object[cy];
        objectArray[NLoginType_012.cz] = identity;
        objectArray[NLoginType_012.da] = bl;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_n, objectArray);
    }

    public Optional<AccountData> getAccount(@Nonnull Identity identity) {
        Object[] objectArray = new Object[as];
        objectArray[NLoginType_012.at] = identity;
        return (Optional)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_b, objectArray);
    }

    @Generated
    public NLoginType_012(nLoginBukkit nLoginBukkit2) {
        this.var_java_lang_String_arr_a = new HashSet();
        this.var_com_nickuc_login_bukkit_nLoginBukkit_p = nLoginBukkit2;
    }

    @Nonnull
    public List<AccountData> getAccountsByIp(@Nonnull String string) {
        Object[] objectArray = new Object[bb];
        objectArray[NLoginType_012.bc] = string;
        return (List)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_c, objectArray);
    }

    public boolean performUnregister(@Nonnull Identity identity) {
        Object[] objectArray = new Object[ck];
        objectArray[NLoginType_012.cl] = identity;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_i, objectArray);
    }

    static /* synthetic */ nLoginBukkit a(NLoginType_012 NLoginType_0122) {
        return NLoginType_0122.var_com_nickuc_login_bukkit_nLoginBukkit_p;
    }

    public boolean setDiscord(@Nonnull Identity identity, long l) {
        Object[] objectArray = new Object[cs];
        objectArray[NLoginType_012.ct] = identity;
        objectArray[NLoginType_012.cu] = l;
        return (Boolean)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_l, objectArray);
    }

    public DatabaseType getDatabaseType() {
        return (DatabaseType)this.a(NLoginCore_121.var_com_nickuc_login_NLoginCore_121_a, new Object[ao]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_012.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.C("ЁУХЅЩшрітБяхѓэЖлѝќєњєЩ", (byte)12, 67), NLoginType_012.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.B("úćĆÉĉąĀĉĔăÐĎĒċĎĔÖѱѝѪѢѪѦсђѶљцѴчшð", (byte)12, 66) + string + NLoginCore_384.B("Ñ", (byte)12, 66) + methodType.toString(), exception);
        }
    }

    public void requestLogin(@Nonnull Identity identity, @Nonnull Object object) {
        throw new nLoginRequestUnsupportedException((String)NLoginType_012.c("㺀", (int)cb, (long)cc) + this.getImplementationType() + (String)NLoginType_012.c("㺃", (int)(cd & ce), (long)cf));
    }

    @Nonnull
    public String getVersion() {
        return this.var_com_nickuc_login_bukkit_nLoginBukkit_p.s();
    }

    public boolean isAuthenticated(String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺀", (int)(bo & bp), (long)bq));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺃", (int)br, (long)(bs ^ bt)));
        }
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_bukkit_nLoginBukkit_p.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        return (NLoginCore_277 != null && this.var_com_nickuc_login_bukkit_nLoginBukkit_p.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a().boolean_b(NLoginCore_277) ? bu : bv) != 0;
    }

    @Nonnull
    public ImplementationType getImplementationType() {
        return ImplementationType.PROXY;
    }

    public Optional<Location> getSpawnLocation(SpawnType spawnType) {
        if (spawnType == null) {
            throw new IllegalArgumentException((String)NLoginType_012.c("㺀", (int)ap, (long)(aq ^ ar)));
        }
        NLoginType_016 NLoginType_0162 = NLoginType_016.a(spawnType);
        String string = this.var_com_nickuc_login_bukkit_nLoginBukkit_p.a().com_nickuc_login_NLoginCore_482_a().k(NLoginType_0162.aE());
        if (string == null) {
            return Optional.empty();
        }
        org.bukkit.Location location = NLoginCore_393.a(string);
        NLoginCore_457 NLoginCore_4572 = new NLoginCore_457(location.getWorld().getName(), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
        return Optional.of(NLoginCore_4572);
    }

    private static void b() {
        int n;
        var_long_c = -3112929571536764771L;
        long l = var_long_c ^ 0x860E8141FF125B83L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(57 + 12), (byte)(55 + 28), (byte)(3 + 44), 67, (byte)(32 + 34), 67, (byte)(31 + 16), (byte)(13 + 67), (byte)(64 + 11), (byte)(56 + 11), (byte)(50 + 33), (byte)(49 + 4), (byte)(20 + 60), (byte)(32 + 65), (byte)(76 + 24), (byte)(39 + 61), (byte)(56 + 49), (byte)(92 + 18), (byte)(92 + 11)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_012.var_java_lang_String_arr_b[0] = NLoginCore_110.E("հգբկՎկԾմշդ՜դ՗րՋ֐ՠ֌ժռՠնկր֑֔֏֍՚էևյժ֐֡ոս՟ա֤է֣ժ֛ն֪֤֍֋լֵ֭֠֬ձֱֻ֦֗֯֕ջֳַ֮ոյ֦֭ոչ֣ׄׄւׅ׋֍׊׈׍ֽ׈׌֧֏֖֥ההָ֪֛ם׀׍", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[1] = NLoginCore_451.A("ůŝƄƊŞſƓŤŷŷőş", (byte)76, 65);
                    NLoginType_012.var_java_lang_String_arr_b[2] = NLoginCore_387.C("ӍԔԌԈӷӑӲԌӚӑԎӔӞӑԜӱӹԋӭӺԝԤӵԙԄԣԫӨԁӼԚԤ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[3] = NLoginCore_173.D("ӬӜԍӴԂԋӱӑԍӼԊӡ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ӐӦӐӪԎӥԙӔӓӣӷԅӞԚөԞԝӰӰӷԧԏӢԢԅӦӽԚӬԮԅԲԱԅӪԮԄӭӰԮԏԍԶԁ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[5] = NLoginCore_223.C("ӚӬԀӋԓӔӎӘӕӷԎӡ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[6] = NLoginCore_201.A("şőƏŧŨųūŴƏŰţƜƘƊƒƇŪƑŜƖŸƣŪū", (byte)76, 65);
                    NLoginType_012.var_java_lang_String_arr_b[7] = NLoginCore_201.E("ռՊՠ՛ՐՆրՃՉոՊիՠևՎևեՑձթֈք՛՜", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[8] = NLoginCore_201.B("ŐƈƂŬƌœŵƖŨƚƇŶŘżŮƀśŻŔŠƜƆƘƞšžŸŻƃƩƂƙžƦŤƀƣƶƠŰƑƩƤƫƝƓƽƵƐƾưƗžƼƟƸǈƣƨƈƶǌƥƻƼǊǈƠǃƯƓǗƱƹǇƭƳƏǉƛǞƠƙǎƵǢƣƷƴǊƽƹƴƣǧƻǰǯǥǀǃƭǌǐǌǶǷǴǩǇǚǇƺǎǙȂǍǀǖǹǇǷǵǻǧǄȌȂ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[9] = NLoginCore_091.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽӽԁԩԒԡԴԟԺԜՐԢՃԣՒԞՆԎՎՆԣԗԯԮԫԭԖՔ՟ԫՂԳԯ՚՚ԡԜՂ՛ԨըՊԿըՋՓՋթԭհլաՂ՘՗ՈլՋ՞Քբ՞ՕՓչ՚դՂճօՙ։էջՙՠ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[10] = NLoginCore_091.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԩՀՐԨԮՄԔՔՔԬԴԹ՚՘ԲԳԸՎԹՆԥԦըԛՠԝԦԼԾՏգ՛", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[11] = NLoginCore_427.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԮՀՎՂՓԫԵԔԓԬԎԛՊԱՀԟ՜Գ՗ԮԵԙՖԿՔՆԾգԾխՙղ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[12] = NLoginCore_223.B("ſƎƋŋůžŤōƕūƑŲŧƜŖƏƔŻūƁŭŮƃťżƂŴšƁƪŬƯůƆƚŭƱƕƋƧƭƋƚƔŵƛƉŽƪƘƽŵŻŻſƧƐƟƲƝƸƚǎƠǉơƺƨƒǑǖƑƕǆǓƸƷƫƫƱǡƝǎǖǔƗƸƿƣơǅǖǌǮǈǗƼǆǲǴǐǔƿǌƶƹǖǐǥǒǨǖǒƸǣǖƻȅǡǑǣǡǥǽǖǺǤȐǂǐǧǰǯȇǵȎǕǔǵǸȉȕșǽȝǲȞǷȅǽǪǫ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[13] = NLoginCore_138.B("ƇƑũŋŢŕƏŢƑŷŕŚŭŻƎŸƈƊƙƟƣşƎŢŢşſƥţƌťŻưƠƄżƇƅơƢűƃƂſ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[14] = NLoginCore_076.E("՞՚ձՠՑՔֈֈՒՃևոգնՠը՟֐վխ֐֌֊֓կզեՙկ֖֘֙֌ց֔Ֆղ֘֏շ՛ևէր֠֍֌֬֎ְ֧֢֓֟ճցֺֆַյְִֿׁ֥֭֕֡֕ոֶֽ֟׆ֿ֔֔׎ּ֛֚׀֭֋֍֛֮֜", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[15] = NLoginCore_092.B("ŚňńŉŲŞŕƒƅŐŮş", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[16] = NLoginCore_076.B("ſŞŜŠƔōƋƁŹŧƌŮťƍŕřŻƢƠŜƜŤżƖƑŵƤŪƨƕƭƉƝƟůƫƕƄƤƔƎƊŹſ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[17] = NLoginCore_387.C("ԁӠӞӢԖӏԍԃӻөԏӘӖԛӠԀԜԎӤԂԓԑԤԉԅԧԫԟӫԆӯԪԈԟӯԝԬԁӷԧԉӹԄԁ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[18] = NLoginCore_223.D("ӿӧӵԃӤԂӪԈԘӚԏӸӘӿԀӪӰӠӢԣӡӯӬӭ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[19] = NLoginCore_223.D("ԏӦӥԕӯԒӫӷөԓӒԖӸԜӠӷӰӰӴӾӜԣӟԛԦԫӻԩԥӮԤԋӬӿԈԂԢԏԐԏԱԦԔԁ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[20] = NLoginCore_223.F("վՕՔք՞ց՚զ՘ւՁօէ֋Տզ՟՟գխՋ֊ըյչՒջ֐զՕջջ։կ֣֕֗օևմ֖֜ջհ", (byte)76, 70);
                    NLoginType_012.var_java_lang_String_arr_b[21] = NLoginCore_201.F("՞՚ձՠՑՔֈֈՒՃևոգնՠը՟֐վխ֐֌֊֓կզեՙկ֖֘֙֌ց֔Ֆղ֘֏շ՛ևէր֠֍֌֬֎ְ֧֢֓֟ճցֺֆַյְִֿׁ֥֭֕֡֕ոֶֽ֟׆ֿ֔֔׎ּ֛֚׀֭֋֍֛֮֜", (byte)76, 70);
                    NLoginType_012.var_java_lang_String_arr_b[22] = NLoginCore_427.C("ӜӊӆӋӴӠӗԔԇӒӰӡ", (byte)76, 67);
                    continue block7;
                }
                case 1: {
                    NLoginType_012.var_java_lang_String_arr_b[0] = NLoginCore_324.E("հգբկՎկԾմշդ՜դ՗րՋ֐ՠ֌ժռՠնկր֑֔֏֍՚էևյժ֐֡ոս՟ա֤է֣ժ֛ն֪֤֍֋լֵ֭֠֬ձֱֻ֦֗֯֕ջֳַ֮ոյ֦֭ոչ֣ׄׄւׅ׋֍׊׈׍ֽ׈׌֧֌ָֿ׊֥׃וֵ֚֗֬", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[1] = NLoginCore_453.C("ӐӼԀԒӳӧӶӵԂӧӤӡ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[2] = NLoginCore_138.C("ӍԔԌԈӷӑӲԌӚӑԎӔӞӑԜӱӹԋӭӺԝԢԐԥԁԁԗԭԆԐԤԤ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[3] = NLoginCore_110.E("Ի՚ՒվՖՓՠՖՒՁ՛Ր", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[4] = NLoginCore_092.D("ӐӦӐӪԎӥԙӔӓӣӷԅӞԚөԞԝӰӰӷԧԏӢԢԅӦӽԚӬԮԅԲӾӫԜԌԥԟԭӷӱԺԐԁ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[5] = NLoginCore_004.B("ƐƄƊşƂūƎŪŖšŲş", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[6] = NLoginCore_453.A("şőƏŧŨųūŴƏŰťƑƓƇƑŸŵřƌƓƓŭŪū", (byte)76, 65);
                    NLoginType_012.var_java_lang_String_arr_b[7] = NLoginCore_384.C("ԍӛӱӬӡӗԑӔӚԉӎӾӴӹӽәԛӛӝԣԒԖԇԛԣԝӫԩԢԉԮӰ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[8] = NLoginCore_451.B("ŐƈƂŬƌœŵƖŨƚƇŶŘżŮƀśŻŔŠƜƆƘƞšžŸŻƃƩƂƙžƦŤƀƣƶƠŰƑƩƤƫƝƓƽƵƐƾưƗžƼƟƸǈƣƨƈƶǌƥƻƼǊǈƠǃƯƓǗƱƹǇƭƳƏǉƛǞƠƙǎƵǢƣƷƴǊƽƹƴƣǧƻǰǯǥǀǃƭǌǐǌǶǷǴǩǇǚǇƺǎǙȂǍƻǣǖǅƻǆǟǨǽǻǊ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[9] = NLoginCore_451.F("հտռԼՠկՕԾֆ՜ւգ՘֍Շրօլ՜ղ՞՟մՖխճեՒղ֛՝֠ՠշ֋՞֢ֆռ֘֞ռ֋օզ֌պծ֛։֮զլլհ֘ց֐֣֎֩֋ֲֿׁ֑֒֍ֵսֵֽ֒ֆ֚֞֝֜օ׃׎ֱ֢֚֞׉׉֐֋ֱ׊֗חֹ֮חֺֺׂט֜ןכאֱׇ׆ַכֺ׍׃ב׍ׂׄר׋ײוף׶׏׹הטנד", (byte)76, 70);
                    NLoginType_012.var_java_lang_String_arr_b[10] = NLoginCore_559.D("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԩՀՐԨԮՄԔՔՔԬԴԹ՚՘ԲԳԸՎԹՆԥԢՀթՙԼԪՍՏԡԺՀ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[11] = NLoginCore_427.C("ԁԐԍӍӱԀӦӏԗӭԓӴөԞӘԑԖӽӭԃӯӰԅӧӾԄӶӣԃԬӮԱӱԈԜӯԳԗԍԩԯԍԜԖӷԝԋӿԬԚԿӷӽՈԦԽԒԹԤԢԠԉԮԏԮՀՎՂՓԫԵԔԓԬԎԛՊԱՀԟ՜Գ՗ԮԵէեՊՕԤԼՃԿԨԽ՛", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[12] = NLoginCore_091.E("հտռԼՠկՕԾֆ՜ւգ՘֍Շրօլ՜ղ՞՟մՖխճեՒղ֛՝֠ՠշ֋՞֢ֆռ֘֞ռ֋օզ֌պծ֛։֮զլլհ֘ց֐֣֎֩֋ֺֿ֑֒֫֙փׇׂւֆַ֢ׄ֩֨֜֜ג֎ׇֿׅֈְֶׇֽ֩֔֒ןֹ׈ַ֭ףץְׇֽׁׁׅ֧֪ז׃יׇ׃֩הׇ֬׶גׂהגז׮ׇ׫ו؁ֳׁטסנ׸צ׿׆ׅצ׹׷؍ש׫؍ׄ،בקؔכל", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[13] = NLoginCore_173.F("ու՚ԼՓՆրՓւըՆՋ՞լտթչջ֊֐֔ՐտՓՓՐհ֖ՔսՖլյձ֖ճ֙ռօ֘բփշհ", (byte)76, 70);
                    NLoginType_012.var_java_lang_String_arr_b[14] = NLoginCore_384.A("ŭũƀůŠţƗƗšŒƖƇŲƅůŷŮƟƍżƟƛƙƢžŵŴŨžƧƥƨƛƐƣťƁƧƞƆŪƖŶƏƯƜƛƻƝƿƢƶƱƮƂƐǉƕǆƄƴǃƼƤưƤǐƿǎƇǌƮǅǕƥƓǜǆưƫƫƿǃǡǚƽƪƫ", (byte)76, 65);
                    NLoginType_012.var_java_lang_String_arr_b[15] = NLoginCore_559.E("ՒԽՔՐչյբյԻ՗՗Ր", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[16] = NLoginCore_027.D("ԁӠӞӢԖӏԍԃӻөԎӰӧԏӗӛӽԤԢӞԞӦӾԘԓӷԦӬԪԗԯԋԤԦԮԝӭӿӴԦԓԧԔԁ", (byte)76, 68);
                    NLoginType_012.var_java_lang_String_arr_b[17] = NLoginCore_092.B("ſŞŜŠƔōƋƁŹŧƍŖŔƙŞžƚƌŢƀƑƏƢƇƃƥƩƝũƄŭƨŦơƫƢƥƉƪưƦƧƭƗƐƎŶƽơŽƳǄƑƝƊƋ", (byte)76, 66);
                    NLoginType_012.var_java_lang_String_arr_b[18] = NLoginCore_559.E("ծՖդղՓձՙշևՉտՈքծՎւխէեՠՕ֔՛՜", (byte)76, 69);
                    NLoginType_012.var_java_lang_String_arr_b[19] = NLoginCore_201.C("ԏӦӥԕӯԒӫӷөԓӒԖӸԜӠӷӰӰӴӾӜԣӟԛԦԫӻԩԥӮԤԋԊӾӾԭӭԈԗԪӺԳӻԁ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[20] = NLoginCore_453.F("վՕՔք՞ց՚զ՘ւՁօէ֋Տզ՟՟գխՋ֊ըյչՒջ֐զՕջջ֛լ֍կե֜դ֖ՠ֫ֆ֩յ֜֨սևֱհև֤֭ջռ", (byte)76, 70);
                    NLoginType_012.var_java_lang_String_arr_b[21] = NLoginCore_110.C("ӯӫԂӱӢӥԙԙӣӔԘԉӴԇӱӹӰԡԏӾԡԝԛԤԀӷӶӪԀԩԧԪԝԒԥӧԃԩԠԈӬԘӸԑԱԞԝԽԟՁԤԸԳ԰ԄԒՋԗՈԆԶՅԾԦԲԦՒՁՐԉՎ԰Շ՗ԧՎԘԬՋՍ԰ՋԚՒԝԿԬԭ", (byte)76, 67);
                    NLoginType_012.var_java_lang_String_arr_b[22] = NLoginCore_223.C("ӭӪԔӴԖԄԐӬӤԏԊӡ", (byte)76, 67);
                    continue block7;
                }
                case 2: {
                    NLoginType_012.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ƎƉŻƈƕŎťŒţŔœƑŬƓƓƖũŬƀƒŢŽŪū", (byte)76, 66);
                    continue block7;
                }
                case 4: {
                    NLoginType_012.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ӎԋԋӽԍӎӳӢԂӯԄԅԖӻӛԐӾӾӰӺӱӿӬӭ", (byte)76, 67);
                }
            }
        }
    }
}

