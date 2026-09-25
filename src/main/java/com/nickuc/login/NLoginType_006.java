/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.DatabaseType
 *  com.nickuc.login.api.enums.ImplementationType
 *  com.nickuc.login.api.enums.event.ChangePasswordSource
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.enums.event.UnregisterSource
 *  com.nickuc.login.api.enums.event.UpdatePasswordSource
 *  com.nickuc.login.api.exception.nLoginNotReadyException
 *  com.nickuc.login.api.nLoginAPI
 *  com.nickuc.login.api.types.AccountData
 *  com.nickuc.login.api.types.AccountDataImpl
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.api.enums.ImplementationType;
import com.nickuc.login.api.enums.event.ChangePasswordSource;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UnregisterSource;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.api.exception.nLoginNotReadyException;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginType_024;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_539;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_236;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_174;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginType_006
implements nLoginAPI {
    private static long ek;
    private static int bk;
    private static int az;
    private static int eo;
    private static int ch;
    private static long dp;
    private static int n;
    private static int bu;
    private static long dn;
    private static int var_int_b;
    private static long eu;
    private static int ay;
    private static int o;
    private static int cj;
    private static int ak;
    private static int t;
    private static int s;
    private static int bj;
    private static int cx;
    private static int ag;
    private static int bf;
    private static long dw;
    private static int bc;
    private static long co;
    private static long ah;
    private static int bz;
    private static long f;
    private static int bd;
    private static int dr;
    private static int cq;
    private static int cz;
    private static int dl;
    private static long br;
    private static int de;
    private static long i;
    private static int al;
    private static int as;
    private static long ep;
    private static int cn;
    private static int en;
    private static long bg;
    private static int x;
    private static int by;
    private static int cy;
    private static int ev;
    private static int z;
    private static int cw;
    private static int l;
    private static int aj;
    private static long er;
    private static int be;
    private static int w;
    private static int du;
    private static int d;
    private static int bt;
    private static int dh;
    private static int ck;
    private static int ej;
    private static long dd;
    private static long aa;
    private static int eg;
    private static int da;
    private static int ea;
    private static int bv;
    private static long ct;
    private static long el;
    protected final NLoginType_008 var_com_nickuc_login_NLoginType_008_a = Caffeine.newBuilder().expireAfterWrite(el, TimeUnit.SECONDS).build();
    private static long ei;
    private static int an;
    private static int dg;
    public static final int var_int_a;
    private static int bi;
    private static int bx;
    private static int ew;
    private static String[] var_java_lang_String_arr_b;
    private static int ca;
    private static long bp;
    private static int ao;
    private static int ez;
    private static long g;
    private static int cfr_renamed_1;
    private static long q;
    private static long var_long_c;
    private static int y;
    private static int var_int_c;
    private static int ac;
    private static int ed;
    private static int am;
    private static int v;
    private static int cd;
    private static int e;
    private static long dk;
    private static int au;
    private static int cs;
    private static int bl;
    private static long dz;
    private static int ey;
    private static long ee;
    private static int av;
    private static int cu;
    private static long es;
    private static int bm;
    private static int cl;
    private static int cg;
    private static long bh;
    private static long dv;
    private static int ae;
    private static long eh;
    private static long ai;
    private static int cp;
    private static int h;
    private static long ef;
    private static String[] var_java_lang_String_arr_a;
    private static int db;
    private static long dq;
    private static int p;
    private static long dj;
    private static int di;
    private static int dx;
    private static long u;
    private static int eq;
    private static long cf;
    private final Cache<String, ForceRegisterConfig> cfr_renamed_11;
    private static int ad;
    private static int ci;
    private static int bb;
    private static long ar;
    private static int cc;
    private static int cb;
    private static long af;
    private static int dm;
    private static long bo;
    private static long ab;
    private static int bq;
    private static int ex;
    private static int m;
    private static long dc;
    private static long at;
    private static int ap;
    private static long cr;
    private static long aq;
    private static int k;
    private static int bn;
    private static int aw;
    private static int et;
    private static long r;
    private static long dt;
    private static int df;
    private static int em;
    private static long ce;
    private static int bw;
    private static int ax;
    private static int ba;
    private static long ec;
    private static int cv;
    private static int eb;
    private static long dy;
    private static int j;
    private static long ds;
    private static long bs;
    private static int cm;

    public boolean comparePassword(AccountData accountData, String string) {
        this.void_a(string, (String)NLoginType_006.c("㺀", (int)z, (long)(aa ^ ab)));
        this.a();
        AccountDataImpl accountDataImpl = this.a(accountData);
        return accountDataImpl.getHashedPassword().map(string2 -> {
            NLoginCore_566 NLoginCore_5662 = NLoginCore_566.a(string2);
            return (NLoginCore_5662 != null && NLoginCore_5662.com_nickuc_login_NLoginInterface_009_a().boolean_i(string, (String)string2) ? ev : ew) != 0;
        }).orElse(ac != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean performUnregister(@Nonnull Identity identity) {
        block7: {
            this.a();
            ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
            if (!ForceRegisterConfig2.boolean_h()) break block7;
            String string = this.b(identity);
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
            UUID uUID = NLoginCore_277 != null ? NLoginCore_277.java_util_UUID_a() : ForceRegisterConfig2.java_util_UUID_a();
            Object[] objectArray = new Object[ak];
            objectArray[NLoginType_006.al] = null;
            objectArray[NLoginType_006.am] = uUID;
            objectArray[NLoginType_006.an] = ForceRegisterConfig2.i();
            objectArray[NLoginType_006.ao] = UnregisterSource.BY_API;
            if (!this.var_com_nickuc_login_NLoginType_008_a.a(EventEnum.UNREGISTER, objectArray)) break block7;
            Object object = ForceRegisterConfig2.var_java_lang_Object_c;
            synchronized (object) {
                block6: {
                    if (!this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().boolean_a(ForceRegisterConfig2)) break block7;
                    NLoginCore_370.b((String)NLoginType_006.c("㺀", (int)ap, (long)(aq ^ ar)) + ForceRegisterConfig2.i() + (String)NLoginType_006.c("㺃", (int)as, (long)at), new Object[au]);
                    try {
                        Object[] objectArray2 = new Object[av];
                        objectArray2[NLoginType_006.aw] = NLoginCore_277;
                        objectArray2[NLoginType_006.ax] = uUID;
                        objectArray2[NLoginType_006.ay] = string;
                        objectArray2[NLoginType_006.az] = null;
                        objectArray2[NLoginType_006.ba] = UpdatePasswordSource.BY_API;
                        this.var_com_nickuc_login_NLoginType_008_a.a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray2);
                        if (NLoginCore_277 == null) break block6;
                        NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[bb]));
                    }
                    catch (Throwable throwable) {
                        if (NLoginCore_277 != null) {
                            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[bc]));
                        }
                        throw throwable;
                    }
                }
                return bd != 0;
            }
        }
        return be != 0;
    }

    protected void void_a(Identity identity) {
        if (identity == null) {
            throw new IllegalArgumentException((String)NLoginType_006.c("㺀", (int)du, (long)(dv ^ dw)));
        }
        if (!(identity instanceof NLoginCore_473)) {
            throw new IllegalArgumentException((String)NLoginType_006.c("㺃", (int)dx, (long)(dy ^ dz)) + NLoginCore_473.class.getCanonicalName() + (String)NLoginType_006.c("㺆", (int)(ea & eb), (long)ec) + identity.getClass().getCanonicalName());
        }
    }

    protected String b(Identity identity) {
        if (identity instanceof NLoginCore_174) {
            NLoginCore_174 NLoginCore_1742 = (NLoginCore_174)identity;
            return NLoginCore_1742.getKnownName();
        }
        if (identity instanceof NLoginCore_539) {
            NLoginCore_539 NLoginCore_539 = (NLoginCore_539)identity;
            String string = NLoginCore_539.getName();
            int n = NLoginCore_539.getMojangId() != null ? dg : dh;
            String string2 = NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar() && !BCryptHashProvider.c(string, n != 0) ? BCryptHashProvider.g(string, n != 0) : string;
            return string2;
        }
        throw new IllegalArgumentException((String)NLoginType_006.c("㺀", (int)di, (long)(dj ^ dk)) + identity.getClass().getCanonicalName());
    }

    public boolean forceLogin(@Nonnull Identity identity, boolean bl) {
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        if (ForceRegisterConfig2.boolean_h()) {
            String string = this.b(identity);
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
            if (NLoginCore_277 != null) {
                this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, bl, cy != 0);
                return cz != 0;
            }
        }
        return da != 0;
    }

    @CheckReturnValue
    protected ForceRegisterConfig com_nickuc_login_ForceRegisterConfig_a(Identity identity) {
        String string = this.b(identity);
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 != null) {
            return this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_ForceRegisterConfig_a();
        }
        return (ForceRegisterConfig)this.var_com_nickuc_login_NLoginType_008_a.get(string, string2 -> {
            ForceRegisterConfig ForceRegisterConfig2;
            NLoginCore_291 NLoginCore_2912 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a();
            if (identity instanceof NLoginCore_174) {
                NLoginCore_174 NLoginCore_1742 = (NLoginCore_174)identity;
                ForceRegisterConfig2 = NLoginCore_2912.c(NLoginCore_1742.getKnownName());
            } else if (identity instanceof NLoginCore_539) {
                NLoginCore_539 NLoginCore_539 = (NLoginCore_539)identity;
                ForceRegisterConfig2 = NLoginCore_2912.a(NLoginCore_539.getName(), NLoginCore_539.getMojangId(), NLoginCore_539.getBedrockId(), em != 0);
            } else {
                throw new IllegalArgumentException((String)NLoginType_006.c("㺀", (int)(en & eo), (long)ep) + identity.getClass().getCanonicalName());
            }
            if (ForceRegisterConfig2 == null) {
                throw new RuntimeException((String)NLoginType_006.c("㺃", (int)eq, (long)(er ^ es)) + string + (String)NLoginType_006.c("㺆", (int)et, (long)eu));
            }
            return ForceRegisterConfig2;
        });
    }

    public boolean isAvailable() {
        return (!this.var_com_nickuc_login_NLoginType_008_a.M() ? var_int_b : var_int_c) != 0;
    }

    public long getAccountCount() {
        this.a();
        NLoginCore_523 NLoginCore_4952 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_495_a();
        return NLoginCore_4952.long_a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean setLanguage(@Nonnull Identity identity, @Nullable String string) {
        int n;
        this.a();
        if (string != null) {
            if (string.isEmpty()) throw new IllegalStateException((String)NLoginType_006.c("㺀", (int)cn, (long)co));
            if (string.length() > cm) {
                throw new IllegalStateException((String)NLoginType_006.c("㺀", (int)cn, (long)co));
            }
        }
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        // MONITORENTER : object
        if (string != null) {
            ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().a((String)NLoginType_006.c("㺃", (int)(cp & cq), (long)cr), string);
        } else {
            ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().void_d((String)NLoginType_006.c("㺆", (int)cs, (long)ct));
        }
        String string2 = this.b(identity);
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string2);
        if (NLoginCore_277 != null) {
            NLoginCore_509 NLoginCore_5092 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginCore_055 NLoginCore_0552 = NLoginCore_055.c(string);
            if (NLoginCore_0552 != null) {
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i, (Object)NLoginCore_0552);
            }
        }
        if (ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a().E()) {
            NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[cu];
            NLoginCore_436Array[NLoginType_006.cv] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
            if (!this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array)) {
                n = cx;
                // MONITOREXIT : object
                return n != 0;
            }
        }
        n = cw;
        return n != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean performRegister(@Nonnull Identity identity, @Nonnull String string, @Nullable String string2) {
        this.void_a(string, (String)NLoginType_006.c("㺀", (int)(ad & ae), (long)af));
        if (string2 != null) {
            this.void_a(string2, (String)NLoginType_006.c("㺃", (int)ag, (long)(ah ^ ai)));
        }
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (!ForceRegisterConfig2.boolean_h()) {
                return this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, this.java_lang_String_a(identity), string, null, string2);
            }
            return aj != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean setDiscord(@Nonnull Identity identity, long l) {
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (ForceRegisterConfig2.boolean_h()) {
                ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().c(l > 0L ? Long.toString(l) : null);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[cj];
                NLoginCore_436Array[NLoginType_006.ck] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
                return this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
            }
            return cl != 0;
        }
    }

    public boolean isAuthenticated(@Nonnull String string) {
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        return (NLoginCore_277 != null && this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_187_a().boolean_b(NLoginCore_277) ? w : x) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean changePassword(@Nonnull Identity identity, @Nonnull String string) {
        this.void_a(string, (String)NLoginType_006.c("㺀", (int)bf, (long)(bg ^ bh)));
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        if (ForceRegisterConfig2.boolean_h()) {
            String string2 = this.b(identity);
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string2);
            UUID uUID = NLoginCore_277 != null ? NLoginCore_277.java_util_UUID_a() : ForceRegisterConfig2.java_util_UUID_a();
            Object[] objectArray = new Object[bi];
            objectArray[NLoginType_006.bj] = NLoginCore_277;
            objectArray[NLoginType_006.bk] = uUID;
            objectArray[NLoginType_006.bl] = string2;
            objectArray[NLoginType_006.bm] = ChangePasswordSource.BY_API;
            if (this.var_com_nickuc_login_NLoginType_008_a.a(EventEnum.CHANGE_PASSWORD, objectArray)) {
                Object object = ForceRegisterConfig2.var_java_lang_Object_c;
                synchronized (object) {
                    if (this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().c(ForceRegisterConfig2, string)) {
                        NLoginCore_370.b((String)NLoginType_006.c("㺃", (int)bn, (long)(bo ^ bp)) + ForceRegisterConfig2.i() + (String)NLoginType_006.c("㺆", (int)bq, (long)(br ^ bs)), new Object[bt]);
                        Object[] objectArray2 = new Object[bu];
                        objectArray2[NLoginType_006.bv] = NLoginCore_277;
                        objectArray2[NLoginType_006.bw] = uUID;
                        objectArray2[NLoginType_006.bx] = string2;
                        objectArray2[NLoginType_006.by] = string;
                        objectArray2[NLoginType_006.bz] = UpdatePasswordSource.BY_API;
                        this.var_com_nickuc_login_NLoginType_008_a.a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray2);
                        if (NLoginCore_277 != null) {
                            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.var_com_nickuc_login_NLoginCore_487_o, new Object[ca]);
                        }
                        return cb != 0;
                    }
                }
            }
        }
        return cc != 0;
    }

    protected AccountDataImpl a(AccountData accountData) {
        if (accountData == null) {
            throw new IllegalArgumentException((String)NLoginType_006.c("㺀", (int)(dl & dm), (long)dn));
        }
        if (!(accountData instanceof AccountDataImpl)) {
            throw new IllegalArgumentException((String)NLoginType_006.c("㺃", (int)cfr_renamed_1, (long)(dp ^ dq)) + AccountDataImpl.class.getCanonicalName() + (String)NLoginType_006.c("㺆", (int)dr, (long)(ds ^ dt)) + accountData.getClass().getCanonicalName());
        }
        return (AccountDataImpl)accountData;
    }

    public boolean isAuthenticated(@Nonnull Identity identity) {
        this.void_a(identity);
        this.a();
        String string = this.b(identity);
        return this.isAuthenticated(string);
    }

    protected void void_a(String string, String string2) {
        if (string == null) {
            throw new IllegalArgumentException(string2 + (String)NLoginType_006.c("㺀", (int)ed, (long)(ee ^ ef)));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException(string2 + (String)NLoginType_006.c("㺃", (int)eg, (long)(eh ^ ei)));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_006.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginType_006.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.F("֢֕֡դ֤֛֤֠֯֞ի֦֭֩֩֯ձआࣻࣼऀऋःऊऑऔࣾ࣠इऍ֊", (byte)118, 70) + string + NLoginCore_223.C("Ց", (byte)118, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x14L;
        l ^= 0xC798A700006F8DBAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(37 + 32), 83, (byte)(20 + 27), (byte)(65 + 2), (byte)(12 + 54), (byte)(52 + 15), (byte)(26 + 21), (byte)(73 + 7), (byte)(30 + 45), (byte)(29 + 38), (byte)(54 + 29), (byte)(12 + 41), (byte)(71 + 9), (byte)(52 + 45), (byte)(44 + 56), (byte)(57 + 43), (byte)(21 + 84), (byte)(43 + 67), (byte)(35 + 68)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.A("źƇƆŉƉƅƀƉƔƃŐƎƒƋƎƔŖӫӠӡӥӰӨӯӶӹӣӅӬӲ", (byte)76, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_006.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    protected String java_lang_String_a(Identity identity) {
        String string;
        Object object;
        if (identity instanceof NLoginCore_174) {
            object = (NLoginCore_174)identity;
            string = ((NLoginCore_174)object).getKnownName();
        } else if (identity instanceof NLoginCore_539) {
            object = (NLoginCore_539)identity;
            string = ((NLoginCore_539)object).getName();
        } else {
            throw new IllegalArgumentException((String)NLoginType_006.c("㺀", (int)db, (long)(dc ^ dd)) + identity.getClass().getCanonicalName());
        }
        object = BCryptHashProvider.h(string, de != 0);
        if (object != null) {
            return object;
        }
        object = BCryptHashProvider.h(string, df != 0);
        if (object != null) {
            return object;
        }
        return string;
    }

    @Nonnull
    public ImplementationType getImplementationType() {
        return ImplementationType.NATIVE;
    }

    public DatabaseType getDatabaseType() {
        this.a();
        return DatabaseType.valueOf((String)this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a().com_nickuc_login_NLoginCore_036_a().name());
    }

    public int getRemainingSeconds(@Nonnull Identity identity) {
        NLoginCore_509 NLoginCore_5092;
        Integer n;
        this.void_a(identity);
        this.a();
        String string = this.b(identity);
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_a.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 != null && (n = (NLoginCore_5092 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277)).java_lang_Integer_b()) != null) {
            return n;
        }
        return y;
    }

    @Nonnull
    public List<AccountData> getAccountsByIp(@Nonnull String string) {
        this.void_a(string, (String)NLoginType_006.c("㺀", (int)e, (long)(f ^ g)));
        this.a();
        ArrayList<AccountDataImpl> arrayList = new ArrayList<AccountDataImpl>();
        try {
            Object[] objectArray = new Object[j];
            objectArray[NLoginType_006.k] = NLoginCore_532.e.a(new Object[l]);
            objectArray[NLoginType_006.m] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
            Object[] objectArray2 = new Object[n];
            objectArray2[NLoginType_006.o] = string;
            try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a().com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginType_006.c("㺃", (int)h, (long)i), objectArray), objectArray2);){
                ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                while (resultSet.next()) {
                    ForceRegisterConfig ForceRegisterConfig2 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().a(resultSet);
                    if (ForceRegisterConfig2 != null) {
                        arrayList.add(NLoginType_024.from(ForceRegisterConfig2));
                        continue;
                    }
                    throw new RuntimeException((String)NLoginType_006.c("㺆", (int)p, (long)(q ^ r)));
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginType_006.c("㺉", (int)(s & t), (long)u) + string, exception, new Object[v]);
        }
        return NLoginCore_135.a(arrayList);
    }

    @Nonnull
    public String getVersion() {
        return this.var_com_nickuc_login_NLoginType_008_a.s();
    }

    @Generated
    public NLoginType_006(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_a = NLoginType_008;
    }

    protected void a() {
        if (!this.isAvailable()) {
            throw new nLoginNotReadyException((String)NLoginType_006.c("㺀", (int)ej, (long)ek));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean setEmail(@Nonnull Identity identity, @Nullable String string) {
        if (string != null) {
            this.void_a(string, (String)NLoginType_006.c("㺀", (int)cd, (long)(ce ^ cf)));
        }
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (ForceRegisterConfig2.boolean_h()) {
                ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().b(string);
                NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[cg];
                NLoginCore_436Array[NLoginType_006.ch] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j;
                return this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
            }
            return ci != 0;
        }
    }

    private static void b() {
        int n;
        var_long_c = -3029676331660063163L;
        long l = var_long_c ^ 0xC798A700006F8DBAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(61 + 8), (byte)(18 + 65), (byte)(35 + 12), 67, (byte)(58 + 8), (byte)(30 + 37), (byte)(16 + 31), (byte)(7 + 73), (byte)(16 + 59), (byte)(38 + 29), (byte)(52 + 31), 53, (byte)(76 + 4), (byte)(95 + 2), (byte)(68 + 32), (byte)(61 + 39), (byte)(20 + 85), (byte)(38 + 72), (byte)(36 + 67)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_006.var_java_lang_String_arr_b[0] = NLoginCore_173.F("խՌճԶՋ԰շԸձՇԸՂ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[1] = NLoginCore_110.C("өӪөҼӀӠҠӪӍӌӐҽӎӖӞҲӖӕөӺӦӈӻӻӳӽӺҹӁӵԁӺӵӣӸӕҾӟӞӈӯӛӍӎԃӥӱԑԍӹӥԕԎԛӢӣ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[2] = NLoginCore_091.E("իԬՐմՎՎմջննՖԺպմնՠ՞Ցզ՛նձՒ՛նՄգկջե֌՝", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ձՂՒ՗գԲժԳխԮՆ՚ԾթԾԺՙղ՟՗՟ճձճՋսյ՞՚ժտրռՔև֕՟լւՙ֗էՔբ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[4] = NLoginCore_384.D("ӈҷҶӣӀӨӃҿӞӞұӴӑҬҾӲӷӯөӺӊӫӂӃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[5] = NLoginCore_384.C("ӘӥҧӪӛӛҹӂӰӮӁӜӑӃӪӸӉӗҵӍӜӕӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[6] = NLoginCore_004.E("ՀյԾբ՗մչՉԺչ՚ղՓԷձՐռ՝Փ՗ենՍՎ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[7] = NLoginCore_453.F("հՂԿալձՋճ՛զՍհ՛մբպոբՙոևՠՍՎ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[8] = NLoginCore_559.A("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśūſƛŵƞŲŻŵƎŻŸƁŮů", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[9] = NLoginCore_173.C("ӤҲӀҪӫҾӥӫӐҹӝӟҪӐӧӕӗҫӱӉөӕӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[10] = NLoginCore_092.C("ӝӆҦҝӧӚҭӥӟӄӋӆӱұҾӐҴӫӨӪӐӱӚһҾӫӷӜӘӯӂӳ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[11] = NLoginCore_091.C("ҞӥӆҥһҪӍҫӨӭӱӌӮҵҨӧӮӅӭҭӷӵӛӒӝӁӞӽӎӷӅӀӺӇӴӺԁӉӠԃӡӰӚӗ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[12] = NLoginCore_004.E("կճՉՔշէծԶԭՖՉՂ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[13] = NLoginCore_027.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒԴӪԉԎԀԫӹԦԼԝԕԂԃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[14] = NLoginCore_223.D("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[15] = NLoginCore_201.C("ӧҴҿӗӃҶӡҸҢҾӇӢӯҭӱӨӢӃҷӍәӻӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[16] = NLoginCore_384.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՒ֑քՎ՗֋։֗։ծթբ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[17] = NLoginCore_110.A("ŌŲŮĮłũŧŅķūĹŚŸƁƀŲśŞųŃƇńƂťŻŤŝŧŹŹŊſœƒƅŏŘƌƊƘƊůŪţ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[18] = NLoginCore_446.A("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƌŬžųŵƆŒƜƘƛƘţ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[19] = NLoginCore_201.A("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƑŝŒſŪƌŠƜƐŞŢƁŮů", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[20] = NLoginCore_223.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[21] = NLoginCore_559.F("ԿՋթԱղՌծՇՊՇ՝ՉՑԺց՚՝ՀՁհԽՔղ՟ֆՖ֌֋եթֈ֏ղՋ֖զՏ֋մյ֛֕ձբ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[22] = NLoginCore_076.B("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƃŝőƘŔŘŹŻŜƑŮţ", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[23] = NLoginCore_027.D("ҤӪӅӥӢҬӎӄҪӤҼӀүӂӓӔӁӢӪӐӕӕӂӃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[24] = NLoginCore_076.C("ӢҳҠҤӟҿәӚӑҮӤӞӨӫӴӎҲӆӸӨӈӦӏӚҽӶӂӖӼӱӚӝ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[25] = NLoginCore_004.B("ŮĿĬİūŋťŦŝĺűŷźŘĸŸƀƀŚŻřƉşŴŴśƃƈƈŊŊŪ", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[26] = NLoginCore_027.E("ԩՂՕՂըհ՗ԹՒՖջ՝վ՚ՠՁ՗ՍփԾՙզՆՉՠ։֎ՇՉոֆֆ՜լփՈՍդ֚ֈՔ՛ֆ֋շ֘֞ռջձ֘՝ճքզ֕գչխ֙ֈո֩րְ֒֠֌ճ֫ոֳ֤֖֩ւ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[27] = NLoginCore_387.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳӇԆӹӃӌԀӾԌӾӣӞӗ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[28] = NLoginCore_201.E("ձՂՒ՗գԲժԳխԮՆ՚ԾթԾԺՙղ՟՗՟գֈԼռօվ՟ագեՈսդ֎գ։ֈ֕Փ՚֕֝ն՟֜՜֌֑֖֤֚֞հխծ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[29] = NLoginCore_324.A("ĳŭŌİņŷŃŇũūŬŃ", (byte)62, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_006.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ŝōœŬūŉŃŧŨŮźŷŰŬŚŝōľśœŇƇŎŏ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[1] = NLoginCore_559.E("մյմՇՋիԫյ՘՗՛ՈՙաթԽաՠմօձՓֆֆվֈօՄՌր֌օրծփՠՉժթՓպզ՛թձվ֣֕֓Ֆրշարխծ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[2] = NLoginCore_387.D("ӠҡӅөӃӃөӰӫӫӋүӯөӫӕӓӆӛӐӫӗӐӘӑӫӋԁӕӠӮӒ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[3] = NLoginCore_559.F("ձՂՒ՗գԲժԳխԮՆ՚ԾթԾԺՙղ՟՗՟ճձճՋսյ՞՚ժտրՉ՜յՔ֎ՔՋ֕լլ֒զ՟ՙո՝կ֏ս֛դհխծ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[4] = NLoginCore_223.E("ՓՂՁծՋճՎՊթթԳլՙղտիմծՂւջՔՂզԽդե՟֌էրբ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[5] = NLoginCore_559.E("գհԲյզզՄՍջչՊզնրՁջՙեՒհքնՍՎ", (byte)62, 69);
                    NLoginType_006.var_java_lang_String_arr_b[6] = NLoginCore_384.C("ҵӪҳӗӌөӮҾүӮӐҽӳӆӮӟӒӑәӉӨӫӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[7] = NLoginCore_384.C("ӥҷҴӖӡӦӀӨӐӛӄӞӑҭӣҳӊӺӈӔҶӦҼӷӵӳӔӠҽәӠҾ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[8] = NLoginCore_027.B("ĪűŒıŇĶřķŴŹżŐŒŵŻƄŲőſœűŉƆŉţƀżżūůźŉŪƂƎŠŷŕųƆŚśŬŲŨƙŻƘŸƣŘŷƧƁŮů", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ŰľŌĶŷŊűŷŜŅūŋřſŏŔŷŢšŦŝŃƀũŅŦƀžŢŮŬũ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[10] = NLoginCore_324.A("ũŒĲĩųŦĹűūŐŗŒŽĽŊŜŀŷŴŶŜƀŷƃŸƂŦŇƂŜƏŦ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[11] = NLoginCore_091.A("ĪűŒıŇĶřķŴŹŽŘźŁĴųźőŹĹƃƁŧŞũōŪƉŚƃőŌŎŵŮŷŭŴźŭœƐźţ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[12] = NLoginCore_091.F("ԥԾՖ԰ԯ՘դ՚ՅԳՐ՜թԶԽՓԽջԻՃփնՍՎ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[13] = NLoginCore_384.D("ҴәӘӡӋӦҶӗӰӍұӬҫӆӎӦӦӦӥӬӵӻҶӚӫҹӂӐӖӶӦӑөӤӄӨәӦԅӷӚԋӒӉӮԄӵԓԖӒӢӓԈԗԗԙԖӿӷԏӚӶԤԦӱӿӷԖԛԕԢԚӽԋԒӫԣӰԦԉԄӹԛԳԑԅԂԃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[14] = NLoginCore_324.C("ӧҴҿӗӃҶӡҸҢҾӈӱӨҮӭӧӦӲҴӪӖӅӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[15] = NLoginCore_091.C("ӧҴҿӗӃҶӡҸҢҾӆӒӴҳҬҶӉӊӯӭәӕӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[16] = NLoginCore_173.C("ӀӦӢҢҶӝӛҹҫӟҭӎӬӵӴӦӏӒӧҷӻҸӶәӯӘӑӛӭӭҾӳԁӿӔԁԊӵӉӼӢӞԐӗ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[17] = NLoginCore_324.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվ֍֋֔հը֌ց՚֋կչբ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[18] = NLoginCore_091.B("īŦłŕŅŵŧŇĹŏĺŇĺūōŵŌŝļŶƆƇżƄźŬŽƋżƎƅŨƊŒŤũŹƓƐżƉžřţ", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[19] = NLoginCore_076.B("īŦłŕŅŵŧŇĹŏĺķŎŌśĵžųőƄĿņŵūŋŶƏƉƐżźŜšŕƎŐƁƗƉƍŲųƐƌŬƓŠƓƂűŶƂŤƗŮů", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[20] = NLoginCore_027.C("ҤӪӅӥӢҬӎӄҪӤһҪӆҽӎӥӒӸҹӊӷӫӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[21] = NLoginCore_324.B("ŀŌŪĲųōůňŋňŞŊŒĻƂśŞŁłűľŕųŠƇŗƍƌŦŪƉƐŲƋšŬƓƖŦƌŪŴŲţ", (byte)62, 66);
                    NLoginType_006.var_java_lang_String_arr_b[22] = NLoginCore_384.A("ŀŌŪĲųōůňŋňŧřŜųŀźŲŢŗŘŇŴťƆſŹūŮŋŬƃŐƏƕžŦţƕŤŭŒƘŧŹƍŷšƐƓŢųƣŲűŮů", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[23] = NLoginCore_004.C("ҤӪӅӥӢҬӎӄҪӤҼҪӀӅӦҵӨӦӬӊӯӫӂӃ", (byte)62, 67);
                    NLoginType_006.var_java_lang_String_arr_b[24] = NLoginCore_138.A("ŮĿĬİūŋťŦŝĺŰŪŴŷƀŚľŒƄŴŔšŃƀŋŞũŠŚōŚŏ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[25] = NLoginCore_324.F("խԾԫԯժՊդե՜Թհնչ՗Էշտտՙպ՘և՘չ՞ի֌ՠ՘գ֑ե", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[26] = NLoginCore_138.D("ҞҷӊҷӝӥӌҮӇӋӰӒӳӏӕҶӌӂӸҳӎӛһҾӕӾԃҼҾӭӻӻӑӡӸҽӂәԏӽӉӐӻԀӬԍԓӱӰӦԍӒӨӹӛԊӘӮӢԎӽӭԞӵӲӠԡӪԨԅԁԛӸӱӫӳԐԬӾԃԋӲԇԎԼԅԂԃ", (byte)62, 68);
                    NLoginType_006.var_java_lang_String_arr_b[27] = NLoginCore_173.F("ՋձխԭՁըզՄԶժԸՙշրտձ՚՝ղՂֆՃցդպգ՜զոոՉվՊ֌՝֐ՎիՐճկլ՜բ", (byte)62, 70);
                    NLoginType_006.var_java_lang_String_arr_b[28] = NLoginCore_027.A("ŲŃœŘŤĳūĴŮįŇśĿŪĿĻŚųŠŘŠŤƉĽŽƆſŠŢŤŦŉžťƏŤƊƉƖŔśƖƞŖŶƌźƋƟűƢƆżƕƚƇƔƜżƝƋƞůƟ", (byte)62, 65);
                    NLoginType_006.var_java_lang_String_arr_b[29] = NLoginCore_451.E("ՃըԫմաՇՉՐկ՝ՅՂ", (byte)62, 69);
                    continue block7;
                }
                case 2: {
                    NLoginType_006.var_java_lang_String_arr_b[0] = NLoginCore_201.A("őĬťĶńĳņŲŮŔŉŐŚŢŪźſųťŔŚŸļņŧŨƋƋƏžƋŽ", (byte)62, 65);
                    continue block7;
                }
                case 4: {
                    NLoginType_006.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ōŞĴůŃŅŬŉĺŎūŌſƁŲūŮƃţĽņŔţłŢũŎŻŉƂƈų", (byte)62, 65);
                }
            }
        }
    }

    @Nonnull
    public Iterator<AccountData> getAccounts() {
        this.a();
        NLoginCore_523 NLoginCore_4952 = this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_495_a();
        return new NLoginCore_236(this.var_com_nickuc_login_NLoginType_008_a.com_nickuc_login_NLoginCore_291_a(), NLoginCore_4952.com_nickuc_login_NLoginCore_459_a(), NLoginCore_4952.long_a());
    }

    static {
        var_int_b = (4 >>> 66 | 4 << ~66 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = (176 >>> 164 | 176 << ~164 + 1) & 0xFFFFFFFF;
        e = Integer.reverse(0);
        f = Long.reverse(-6741185754825347157L);
        g = Long.reverse(0x2800000000000000L);
        h = 2 >>> 1 | 2 << ~1 + 1;
        i = Long.reverse(-8470568011735617621L);
        j = Integer.reverse(0x40000000);
        k = 0 >>> 92 | 0 << ~92 + 1;
        l = (0 >>> 249 | 0 << ~249 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 0 >>> 147 | 0 << -147;
        p = 0x20000000 >>> 220 | 0x20000000 << ~220 + 1;
        q = Long.reverse(-6741185754825347157L);
        r = Long.reverse(0x2800000000000000L);
        s = 0x180000 >>> 147 | 0x180000 << -147;
        t = Integer.reverse(-1);
        u = Long.reverse(-8470568011735617621L);
        v = Integer.reverse(0);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = 0 >>> 0 | 0 << -0;
        y = (-1 >>> 210 | -1 << ~210 + 1) & 0xFFFFFFFF;
        z = 64 >>> 228 | 64 << -228;
        aa = Long.reverse(-6741185754825347157L);
        ab = Long.reverse(0x2800000000000000L);
        ac = 0 >>> 253 | 0 << ~253 + 1;
        ad = 5 >>> 0 | 5 << ~0 + 1;
        ae = -1 >>> 138 | -1 << ~138 + 1;
        af = Long.reverse(-8470568011735617621L);
        ag = 384 >>> 198 | 384 << ~198 + 1;
        ah = Long.reverse(-6741185754825347157L);
        ai = Long.reverse(0x2800000000000000L);
        aj = 0 >>> 53 | 0 << ~53 + 1;
        ak = Integer.reverse(0x20000000);
        al = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        am = Integer.reverse(Integer.MIN_VALUE);
        an = 0x2000000 >>> 216 | 0x2000000 << -216;
        ao = 0x18000000 >>> 251 | 0x18000000 << ~251 + 1;
        ap = Integer.reverse(-536870912);
        aq = Long.reverse(-6741185754825347157L);
        ar = Long.reverse(0x2800000000000000L);
        as = Integer.reverse(0x10000000);
        at = Long.reverse(-8470568011735617621L);
        au = (0 >>> 172 | 0 << ~172 + 1) & 0xFFFFFFFF;
        av = Integer.reverse(-1610612736);
        aw = Integer.reverse(0);
        ax = (0x40000000 >>> 94 | 0x40000000 << ~94 + 1) & 0xFFFFFFFF;
        ay = (4096 >>> 107 | 4096 << -107) & 0xFFFFFFFF;
        az = Integer.reverse(-1073741824);
        ba = 512 >>> 39 | 512 << -39;
        bb = (0 >>> 127 | 0 << ~127 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0);
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = (0 >>> 180 | 0 << ~180 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(-1879048192);
        bg = Long.reverse(-6741185754825347157L);
        bh = Long.reverse(0x2800000000000000L);
        bi = Integer.reverse(0x20000000);
        bj = 0 >>> 106 | 0 << ~106 + 1;
        bk = Integer.reverse(Integer.MIN_VALUE);
        bl = 524288 >>> 146 | 524288 << -146;
        bm = 96 >>> 5 | 96 << ~5 + 1;
        bn = (20480 >>> 43 | 20480 << -43) & 0xFFFFFFFF;
        bo = Long.reverse(-6741185754825347157L);
        bp = Long.reverse(0x2800000000000000L);
        bq = Integer.reverse(-805306368);
        br = Long.reverse(-6741185754825347157L);
        bs = Long.reverse(0x2800000000000000L);
        bt = (0 >>> 157 | 0 << -157) & 0xFFFFFFFF;
        bu = 655360 >>> 241 | 655360 << -241;
        bv = 0 >>> 174 | 0 << ~174 + 1;
        bw = (2048 >>> 11 | 2048 << -11) & 0xFFFFFFFF;
        bx = Integer.reverse(0x40000000);
        by = 0x60000000 >>> 61 | 0x60000000 << -61;
        bz = Integer.reverse(0x20000000);
        ca = (0 >>> 134 | 0 << -134) & 0xFFFFFFFF;
        cb = 256 >>> 40 | 256 << -40;
        cc = 0 >>> 142 | 0 << ~142 + 1;
        cd = (0x6000000 >>> 23 | 0x6000000 << ~23 + 1) & 0xFFFFFFFF;
        ce = Long.reverse(-6741185754825347157L);
        cf = Long.reverse(0x2800000000000000L);
        cg = Integer.reverse(Integer.MIN_VALUE);
        ch = (0 >>> 29 | 0 << ~29 + 1) & 0xFFFFFFFF;
        ci = Integer.reverse(0);
        cj = 64 >>> 102 | 64 << -102;
        ck = Integer.reverse(0);
        cl = Integer.reverse(0);
        cm = (20480 >>> 12 | 20480 << ~12 + 1) & 0xFFFFFFFF;
        cn = (-2147483642 >>> 31 | -2147483642 << -31) & 0xFFFFFFFF;
        co = Long.reverse(-8470568011735617621L);
        cp = Integer.reverse(0x70000000);
        cq = -1 >>> 38 | -1 << -38;
        cr = Long.reverse(-8470568011735617621L);
        cs = (480 >>> 133 | 480 << -133) & 0xFFFFFFFF;
        ct = Long.reverse(-8470568011735617621L);
        cu = (0x1000000 >>> 216 | 0x1000000 << -216) & 0xFFFFFFFF;
        cv = 0 >>> 84 | 0 << ~84 + 1;
        cw = 0x10000000 >>> 252 | 0x10000000 << ~252 + 1;
        cx = (0 >>> 223 | 0 << -223) & 0xFFFFFFFF;
        cy = Integer.reverse(Integer.MIN_VALUE);
        cz = Integer.reverse(Integer.MIN_VALUE);
        da = (0 >>> 196 | 0 << -196) & 0xFFFFFFFF;
        db = 64 >>> 2 | 64 << -2;
        dc = Long.reverse(-6741185754825347157L);
        dd = Long.reverse(0x2800000000000000L);
        de = (0x8000000 >>> 187 | 0x8000000 << ~187 + 1) & 0xFFFFFFFF;
        df = 0 >>> 193 | 0 << ~193 + 1;
        dg = Integer.reverse(Integer.MIN_VALUE);
        dh = Integer.reverse(0);
        di = (2176 >>> 71 | 2176 << ~71 + 1) & 0xFFFFFFFF;
        dj = Long.reverse(-6741185754825347157L);
        dk = Long.reverse(0x2800000000000000L);
        dl = 147456 >>> 141 | 147456 << -141;
        dm = -1 >>> 109 | -1 << ~109 + 1;
        dn = Long.reverse(-8470568011735617621L);
        cfr_renamed_1 = (0x26000000 >>> 121 | 0x26000000 << -121) & 0xFFFFFFFF;
        dp = Long.reverse(-6741185754825347157L);
        dq = Long.reverse(0x2800000000000000L);
        dr = Integer.reverse(0x28000000);
        ds = Long.reverse(-6741185754825347157L);
        dt = Long.reverse(0x2800000000000000L);
        du = 0x150000 >>> 80 | 0x150000 << -80;
        dv = Long.reverse(-6741185754825347157L);
        dw = Long.reverse(0x2800000000000000L);
        dx = Integer.reverse(0x68000000);
        dy = Long.reverse(-6741185754825347157L);
        dz = Long.reverse(0x2800000000000000L);
        ea = 0x5C0000 >>> 242 | 0x5C0000 << -242;
        eb = -1 >>> 3 | -1 << ~3 + 1;
        ec = Long.reverse(-8470568011735617621L);
        ed = Integer.reverse(0x18000000);
        ee = Long.reverse(-6741185754825347157L);
        ef = Long.reverse(0x2800000000000000L);
        eg = Integer.reverse(-1744830464);
        eh = Long.reverse(-6741185754825347157L);
        ei = Long.reverse(0x2800000000000000L);
        ej = Integer.reverse(0x58000000);
        ek = Long.reverse(-8470568011735617621L);
        el = Long.reverse(-4611686018427387904L);
        em = (262144 >>> 114 | 262144 << ~114 + 1) & 0xFFFFFFFF;
        en = (0x1B00000 >>> 212 | 0x1B00000 << ~212 + 1) & 0xFFFFFFFF;
        eo = Integer.reverse(-1);
        ep = Long.reverse(-8470568011735617621L);
        eq = (112 >>> 66 | 112 << -66) & 0xFFFFFFFF;
        er = Long.reverse(-6741185754825347157L);
        es = Long.reverse(0x2800000000000000L);
        et = (0x3A00000 >>> 245 | 0x3A00000 << -245) & 0xFFFFFFFF;
        eu = Long.reverse(-8470568011735617621L);
        ev = Integer.reverse(Integer.MIN_VALUE);
        ew = 0 >>> 2 | 0 << -2;
        ex = Integer.reverse(0x78000000);
        ey = (0x7800000 >>> 54 | 0x7800000 << -54) & 0xFFFFFFFF;
        ez = Integer.reverse(-805306368);
        var_java_lang_String_arr_a = new String[ex];
        var_java_lang_String_arr_b = new String[ey];
        NLoginType_006.b();
        var_int_a = ez;
    }

    public int getApiVersion() {
        return d;
    }

    public Optional<AccountData> getAccount(@Nonnull Identity identity) {
        this.void_a(identity);
        this.a();
        ForceRegisterConfig ForceRegisterConfig2 = this.com_nickuc_login_ForceRegisterConfig_a(identity);
        return ForceRegisterConfig2.boolean_h() ? Optional.of(NLoginType_024.from(ForceRegisterConfig2)) : Optional.empty();
    }
}

