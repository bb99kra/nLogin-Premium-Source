/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 *  com.nickuc.login.loader.LoaderBootstrap
 *  com.nickuc.login.loader.MemClassLoader
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.MemClassLoader;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_109;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_342;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_142;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_204;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_148;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_593;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_488;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_482;
import com.nickuc.login.NLoginCore_123;
import com.nickuc.login.NLoginCore_111;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_180;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_227 {
    private static long gm;
    private static long hd;
    private static int bq;
    private static long fu;
    private static long dw;
    private static int he;
    private static int y;
    private static int cp;
    private static int var_int_c;
    private static long be;
    private static int di;
    private static long ha;
    private static int gr;
    private static long es;
    private static int db;
    private static long dk;
    private static int dl;
    private static long cj;
    private static int var_int_a;
    private static int ax;
    private static int ht;
    private static long hu;
    private static long g;
    private long var_long_o;
    private static String[] var_java_lang_String_arr_b;
    private static long cm;
    private static int ag;
    private static int ek;
    private static long w;
    private static long eg;
    private final String aV;
    private static int dd;
    private static long bi;
    private static long du;
    private static int hx;
    private static int ap;
    private static int da;
    private static long hk;
    private static int fg;
    private static int ab;
    private static int am;
    private static int aa;
    private static int fw;
    private static long gb;
    private static int gh;
    private static long t;
    private static long al;
    private static long ea;
    private static int var_int_b;
    private static long gp;
    private static String[] var_java_lang_String_arr_a;
    private static long aw;
    private static int bx;
    private static int dq;
    private static long ce;
    private static int gd;
    private static long ei;
    private static int ih;
    private static int fq;
    private static int im;
    private static int bp;
    private static int cl;
    private static int fx;
    private static int ds;
    private static long fo;
    private static long gj;
    private static long var_long_c;
    private static int az;
    private static long gu;
    private static long fv;
    private static int dh;
    private static int ec;
    private static int er;
    private static int cv;
    private static long n;
    private static int ez;
    private static int hp;
    private static int eq;
    private static long ej;
    private static int fy;
    private static int hr;
    private static long ar;
    private static long cq;
    private static long ip;
    private static int gk;
    private static long gt;
    private static long ci;
    private static int co;
    private static long ig;
    private static int io;
    private static int bs;
    private static long ae;
    private static long m;
    private final NLoginCore_148 var_com_nickuc_login_NLoginCore_203_a;
    private static int ai;
    private static int s;
    private static int fc;
    private static long bj;
    private static long d;
    private static int hy;
    private static int ay;
    private static int cs;
    private static long hm;
    private static long fi;
    private static long u;
    private static long ed;
    private static long ao;
    private static int ib;
    private static int gf;
    private static int ff;
    private final NLoginCore_142 var_com_nickuc_login_NLoginCore_142_a;
    private static long cfr_renamed_1;
    private static long aq;
    private static long gg;
    private static int dm;
    private static final List<String> var_java_util_List_java_lang_String__j;
    private static long fs;
    private static long ev;
    private static int eo;
    private static int bl;
    private static int dv;
    private static long ba;
    private static int hi;
    private static int ey;
    private static long ge;
    private static int h;
    private final String aU;
    private static long it;
    private static int cr;
    private static int hb;
    private static int is;
    private static int ew;
    private static long gz;
    private static long hj;
    private static int hs;
    private static int il;
    private static int cy;
    static final int W;
    private static int ch;
    private static long hg;
    private static long dn;
    private static long fa;
    private NLoginCore_204 var_com_nickuc_login_NLoginCore_204_a;
    private static int bv;
    private static int ia;
    private static int bb;
    private static int fe;
    private static int gq;
    private static long an;
    private static long eu;
    private static int bn;
    private static int bm;
    private static int fb;
    private static int ho;
    private static int de;
    private static int dz;
    private static long cw;
    private static int hv;
    private static int as;
    private static int gs;
    private static long gx;
    private static int cc;
    private static long eb;
    private static int bg;
    private static int et;
    private static long k;
    @Nullable
    private NLoginCore_111 var_com_nickuc_login_NLoginCore_151_a;
    private static int br;
    private static int df;
    private static int ah;
    private static long gc;
    private static long bz;
    private static long dg;
    @Nullable
    private NLoginCore_109 var_com_nickuc_login_NLoginCore_109_a;
    private static long iq;
    private static int gl;
    private static long el;
    private static int ic;
    @Nullable
    private NLoginCore_180 var_com_nickuc_login_NLoginCore_180_a;
    @Nullable
    private String aW;
    private static long dc;
    private static long fl;
    private static int var_int_o;
    private static int ie;
    private static int gn;
    private static int q;
    private static int hq;
    private static int cz;
    private static int bw;
    @Nullable
    private byte[] var_byte_arr_b;
    private static long dr;
    private static int cb;
    private static long fn;
    private static int hl;
    private static int hn;
    private static int fh;
    static final int V;
    private static long ct;
    private static long bu;
    private static long hc;
    private static int ij;
    private static int bh;
    private static int fz;
    private static int ck;
    private static int l;
    private static long x;
    private static int ir;
    private static int bk;
    private static int ft;
    private static long bt;
    private static int gv;
    private static int fm;
    private static int ex;
    private static int en;
    private static int dy;
    private static int ak;
    private static int fp;
    private static long aj;
    private static int ef;
    private static long i;
    private static int fj;
    private static long cd;
    private static int dp;
    private static int hf;
    private static int go;
    private static long hh;
    private static int af;
    private static long fd;
    private static long e;
    private static long by;
    private static long fr;
    private static long cfr_renamed_0;
    private static int ik;
    private static int f;
    private static int ga;
    private static int au;
    private static int eh;
    private static int hw;
    private static long fk;
    private static int av;
    private static int at;
    private static int z;
    private static long dt;
    private static long ee;
    private static long cn;
    private static int v;
    private static long r;
    private static int ac;
    private static long cx;
    private static long ad;
    private static int bd;
    private static int cg;
    private static long ep;
    private static int p;
    private static long dx;
    private static int in;
    private static long bo;
    private static int bf;
    private static int ca;
    private static int gy;
    private static int cf;
    private static int var_int_j;
    private static int bc;
    private static long hz;
    private static int ii;
    private static int cu;
    private static int gi;
    private static int dj;
    private static long em;
    private static long gw;
    private static long id;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____b;

    @Nullable
    @Generated
    byte[] byte_arr_a() {
        return this.var_byte_arr_b;
    }

    public synchronized void aj() {
        this.var_com_nickuc_login_NLoginCore_109_a = null;
    }

    private static String a(int n, long l) {
        l ^= 0x27L;
        l ^= 0xA09F17942683F0AAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(39 + 30), (byte)(10 + 73), (byte)(27 + 20), 67, (byte)(36 + 30), (byte)(19 + 48), (byte)(11 + 36), 80, (byte)(34 + 41), (byte)(19 + 48), (byte)(23 + 60), (byte)(48 + 5), (byte)(51 + 29), (byte)(33 + 64), (byte)(88 + 12), (byte)(59 + 41), (byte)(14 + 91), (byte)(54 + 56), (byte)(85 + 18)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.C("ӉӖӕҘӘӔӏӘӣӒҟӝӡӚӝӣҥ࠺ࠋ࠺࠶ࡂ࠽࠘࠱࠳ࠛࠧ࠼ࡊࡂ", (byte)59, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_227.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_148 com_nickuc_login_NLoginCore_203_a() {
        return this.var_com_nickuc_login_NLoginCore_203_a;
    }

    public synchronized void am() {
        this.d(gr != 0);
    }

    @Generated
    String I() {
        return this.aV;
    }

    public NLoginCore_111 a(NLoginCore_305 NLoginCore_3052, String string2, boolean bl, byte[] byArray) {
        return this.a(NLoginCore_3052, string2, bl, (NLoginCore_305, string) -> NLoginCore_305.a(string, byArray));
    }

    @Generated
    public NLoginCore_142 com_nickuc_login_NLoginCore_142_a() {
        return this.var_com_nickuc_login_NLoginCore_142_a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public NLoginCore_227(NLoginCore_116<?> NLoginInterface_0112, MemClassLoader memClassLoader) {
        ClassLoader classLoader = memClassLoader.getParentLoader();
        InputStream inputStream = classLoader.getResourceAsStream(LoaderBootstrap.class.getPackage().getName().replace((char)var_int_a, (char)var_int_b) + (String)NLoginCore_227.c("㺀", (int)var_int_c, (long)(d ^ e)));
        try {
            if (inputStream == null) {
                throw new RuntimeException((String)NLoginCore_227.c("㺃", (int)f, (long)g));
            }
            this.var_java_lang_String_arr_b = NLoginInterface_0112;
            this.aV = NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(inputStream);
            this.aU = NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(NLoginInterface_0112.com_nickuc_login_NLoginCore_224_a().f());
            this.var_com_nickuc_login_NLoginCore_203_a = new NLoginCore_148(NLoginInterface_0112, this);
            this.var_com_nickuc_login_NLoginCore_142_a = new NLoginCore_142(NLoginInterface_0112, this);
            NLoginCore_482 NLoginCore_4822 = NLoginInterface_0112.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a();
            NLoginCore_204 NLoginCore_2042 = NLoginCore_204.a(NLoginCore_4822.a((String)NLoginCore_227.c("㺆", (int)h, (long)i), (Byte)((byte)NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b.ordinal())).byteValue());
            this.var_com_nickuc_login_NLoginCore_204_a = NLoginCore_2042 != null ? NLoginCore_2042 : NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b;
            InputStream inputStream2 = classLoader.getResourceAsStream((String)NLoginCore_227.c("㺉", (int)var_int_j, (long)k));
            try {
                Object object;
                if (inputStream2 != null) {
                    object = new BufferedReader(new InputStreamReader(inputStream2, StandardCharsets.UTF_8));
                    try {
                        this.aW = ((BufferedReader)object).readLine();
                        NLoginCore_4822.a((String)NLoginCore_227.c("㺌", (int)l, (long)(m ^ n)), this.aW).ag();
                    }
                    finally {
                        if (Collections.singletonList(object).get(var_int_o) != null) {
                            ((BufferedReader)object).close();
                        }
                    }
                } else {
                    this.aW = NLoginCore_4822.k((String)NLoginCore_227.c("㺏", (int)q, (long)r));
                }
                object = NLoginCore_4822.k((String)NLoginCore_227.c("㺒", (int)s, (long)(t ^ u)));
                String string = NLoginCore_4822.k((String)NLoginCore_227.c("㺕", (int)v, (long)(w ^ x)));
                if (object != null && string != null) {
                    this.var_com_nickuc_login_NLoginCore_180_a = new NLoginCore_180((String)object, string);
                }
            }
            finally {
                if (Collections.singletonList(inputStream2).get(y) != null) {
                    inputStream2.close();
                }
            }
        }
        finally {
            if (Collections.singletonList(inputStream).get(aa) != null) {
                inputStream.close();
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_227.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.D("ҔҶҸҘҼӛӓөӕҤӢӘӦӠҩӎӰӯӧӭӧҼ", (byte)61, 68), NLoginCore_227.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫࡀࠑࡀ࠼ࡈࡃࠞ࠷࠹ࠡ࠭ࡂࡐࡈӅ", (byte)61, 68) + string + NLoginCore_575.D("Ҧ", (byte)61, 68) + methodType.toString(), exception);
        }
    }

    synchronized void ak() {
        this.var_com_nickuc_login_NLoginCore_180_a = null;
        NLoginCore_482 NLoginCore_4822 = this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a();
        NLoginCore_4822.com_nickuc_login_NLoginCore_482_a((String)NLoginCore_227.c("㺀", (int)ak, (long)al));
        NLoginCore_4822.com_nickuc_login_NLoginCore_482_a((String)NLoginCore_227.c("㺃", (int)am, (long)(an ^ ao)));
        NLoginCore_4822.ag();
    }

    @Generated
    String H() {
        return this.aU;
    }

    public String G() {
        return this.aV.substring(af, ag);
    }

    private NLoginCore_111 a(NLoginCore_305 NLoginCore_305, String string, boolean bl, NLoginCore_593 NLoginInterface_0452) {
        if (bl) {
            if (this.var_com_nickuc_login_NLoginCore_109_a == null) {
                throw new IllegalStateException((String)NLoginCore_227.c("㺀", (int)hf, (long)(hg ^ hh)));
            }
            NLoginCore_305.b((String)NLoginCore_227.c("㺃", (int)hi, (long)(hj ^ hk)), this.var_com_nickuc_login_NLoginCore_109_a.e());
            NLoginCore_305.k((String)NLoginCore_227.c("㺆", (int)hl, (long)hm), this.var_com_nickuc_login_NLoginCore_109_a.U());
        }
        List<String> list = this.var_com_nickuc_login_NLoginCore_142_a.a(var_java_util_List_java_lang_String__j);
        int n = list.size();
        String string2 = !list.equals(var_java_util_List_java_lang_String__j) && n > hn ? list.get((int)(Math.random() * (double)n)) : list.get(ho);
        Object[] objectArray = new Object[hp];
        objectArray[NLoginCore_227.hq] = hr;
        String string3 = String.format(string, objectArray);
        NLoginCore_123 NLoginCore_1232 = NLoginInterface_0452.doRequest(NLoginCore_305, string2 + string3);
        if (NLoginCore_1232.ag()) {
            return new NLoginCore_111(NLoginCore_1232.c(), NLoginCore_1232.p(), string2);
        }
        boolean bl2 = var_java_util_List_java_lang_String__j.contains(string2);
        if (n > hs) {
            for (String string4 : list) {
                if (string4.equals(string2)) continue;
                if (!bl2) {
                    bl2 = var_java_util_List_java_lang_String__j.contains(string4);
                }
                if (!(NLoginCore_1232 = NLoginInterface_0452.doRequest(NLoginCore_305, string4 + string3)).ag()) continue;
                return new NLoginCore_111(NLoginCore_1232.c(), NLoginCore_1232.p(), string4);
            }
        }
        if (!bl2) {
            for (String string4 : var_java_util_List_java_lang_String__j) {
                NLoginCore_1232 = NLoginInterface_0452.doRequest(NLoginCore_305, string4 + string3);
                if (!NLoginCore_1232.ag()) continue;
                return new NLoginCore_111(NLoginCore_1232.c(), NLoginCore_1232.p(), string4);
            }
        }
        return NLoginCore_111.b();
    }

    synchronized boolean ab() {
        block8: {
            this.var_com_nickuc_login_NLoginCore_109_a = null;
            int n = this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_572_a().q();
            Object object = this.aW != null && n != 0 ? this.aW : NLoginCore_227.c("㺀", (int)ap, (long)(aq ^ ar));
            Object object2 = this.aW != null && this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_364_b().a().L() && n == as ? (String)this.var_java_lang_String_arr_b.a(at) : NLoginCore_227.c("㺃", (int)(au & av), (long)aw);
            Object[] objectArray = new Object[ax];
            objectArray[NLoginCore_227.ay] = NLoginCore_227.c("㺆", (int)az, (long)ba);
            objectArray[NLoginCore_227.bb] = this.var_java_lang_String_arr_b.q();
            objectArray[NLoginCore_227.bc] = NLoginCore_227.c("㺉", (int)bd, (long)be);
            objectArray[NLoginCore_227.bf] = this.var_java_lang_String_arr_b.s();
            objectArray[NLoginCore_227.bg] = NLoginCore_227.c("㺌", (int)bh, (long)(bi ^ bj));
            objectArray[NLoginCore_227.bk] = bl;
            objectArray[NLoginCore_227.bm] = NLoginCore_227.c("㺏", (int)bn, (long)bo);
            objectArray[NLoginCore_227.bp] = bq;
            objectArray[NLoginCore_227.br] = NLoginCore_227.c("㺒", (int)bs, (long)(bt ^ bu));
            objectArray[NLoginCore_227.bv] = this.var_com_nickuc_login_NLoginCore_142_a.o();
            objectArray[NLoginCore_227.bw] = NLoginCore_227.c("㺕", (int)bx, (long)(by ^ bz));
            objectArray[NLoginCore_227.ca] = this.aU;
            objectArray[NLoginCore_227.cb] = NLoginCore_227.c("㺘", (int)cc, (long)(cd ^ ce));
            objectArray[NLoginCore_227.cf] = this.aV;
            objectArray[NLoginCore_227.cg] = NLoginCore_227.c("㺛", (int)ch, (long)(ci ^ cj));
            objectArray[NLoginCore_227.ck] = this.var_com_nickuc_login_NLoginCore_180_a != null ? this.var_com_nickuc_login_NLoginCore_180_a.S() : NLoginCore_227.c("㺞", (int)cl, (long)(cm ^ cn));
            objectArray[NLoginCore_227.co] = NLoginCore_227.c("㺡", (int)cp, (long)cq);
            objectArray[NLoginCore_227.cr] = this.var_com_nickuc_login_NLoginCore_180_a != null ? this.var_com_nickuc_login_NLoginCore_180_a.T() : NLoginCore_227.c("㺤", (int)cs, (long)ct);
            objectArray[NLoginCore_227.cu] = NLoginCore_227.c("㺧", (int)cv, (long)(cw ^ cx));
            objectArray[NLoginCore_227.cy] = this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_364_b().a().ordinal();
            objectArray[NLoginCore_227.cz] = NLoginCore_227.c("㺪", (int)(da & db), (long)dc);
            objectArray[NLoginCore_227.dd] = object;
            objectArray[NLoginCore_227.de] = NLoginCore_227.c("㺭", (int)df, (long)dg);
            objectArray[NLoginCore_227.dh] = n;
            objectArray[NLoginCore_227.di] = NLoginCore_227.c("㺰", (int)dj, (long)dk);
            objectArray[NLoginCore_227.dl] = object2;
            Object[] objectArray2 = objectArray;
            NLoginCore_111 NLoginCore_1512 = this.a(NLoginCore_305.a(), (String)NLoginCore_227.c("㺳", (int)dm, (long)(dn ^ cfr_renamed_1)), dp != 0, NLoginCore_488.a(objectArray2));
            int n2 = NLoginCore_1512.p();
            try {
                switch (n2) {
                    case 200: {
                        JSONObject jSONObject = new JSONObject(NLoginCore_1512.V());
                        JSONObject jSONObject2 = jSONObject.getJSONObject((String)NLoginCore_227.c("㺶", (int)dq, (long)dr));
                        long l = jSONObject2.getLong((String)NLoginCore_227.c("㺹", (int)ds, (long)(dt ^ du)));
                        String string = jSONObject2.getString((String)NLoginCore_227.c("㺼", (int)dv, (long)(dw ^ dx)));
                        this.var_com_nickuc_login_NLoginCore_109_a = new NLoginCore_109(l, string);
                        return dy != 0;
                    }
                    case 201: {
                        JSONObject jSONObject = new JSONObject(NLoginCore_1512.V());
                        JSONObject jSONObject3 = jSONObject.getJSONObject((String)NLoginCore_227.c("㺿", (int)dz, (long)(ea ^ eb)));
                        String string = jSONObject3.getString((String)NLoginCore_227.c("㻂", (int)ec, (long)(ed ^ ee)));
                        String string2 = jSONObject3.getString((String)NLoginCore_227.c("㻅", (int)ef, (long)eg));
                        this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().a((String)NLoginCore_227.c("㻈", (int)eh, (long)(ei ^ ej)), string).a((String)NLoginCore_227.c("㻋", (int)ek, (long)(el ^ em)), string2).ag();
                        this.var_com_nickuc_login_NLoginCore_180_a = new NLoginCore_180(string, string2);
                        JSONObject jSONObject4 = jSONObject.getJSONObject((String)NLoginCore_227.c("㻎", (int)(en & eo), (long)ep));
                        long l = jSONObject4.getLong((String)NLoginCore_227.c("㻑", (int)(eq & er), (long)es));
                        String string3 = jSONObject4.getString((String)NLoginCore_227.c("㻔", (int)et, (long)(eu ^ ev)));
                        this.var_com_nickuc_login_NLoginCore_109_a = new NLoginCore_109(l, string3);
                        return ew != 0;
                    }
                    case 0: 
                    case 503: {
                        return ex != 0;
                    }
                }
                NLoginCore_370.d((String)NLoginCore_227.c("㻗", (int)(ey & ez), (long)fa) + n2 + (String)NLoginCore_227.c("㻚", (int)(fb & fc), (long)fd), new Object[fe]);
                return ff != 0;
            }
            catch (JSONException jSONException) {
                NLoginCore_370.d((String)NLoginCore_227.c("㻝", (int)(fg & fh), (long)fi) + n2 + (String)NLoginCore_227.c("㻠", (int)fj, (long)(fk ^ fl)) + jSONException.getLocalizedMessage() + (String)NLoginCore_227.c("㻣", (int)fm, (long)(fn ^ fo)), new Object[fp]);
            }
            catch (Exception exception) {
                if (exception instanceof IllegalStateException && ((String)NLoginCore_227.c("㻦", (int)fq, (long)(fr ^ fs))).equals(exception.getMessage())) break block8;
                NLoginCore_370.c((String)NLoginCore_227.c("㻩", (int)ft, (long)(fu ^ fv)), exception, new Object[fw]);
            }
        }
        return fx != 0;
    }

    public synchronized void al() {
        if (this.var_com_nickuc_login_NLoginCore_109_a == null && !this.ab()) {
            this.var_com_nickuc_login_NLoginCore_151_a = NLoginCore_111.b();
            return;
        }
        byte[] byArray = new byte[fz];
        NLoginCore_354.a().nextBytes(byArray);
        this.var_byte_arr_b = byArray;
        NLoginCore_305 NLoginCore_305 = NLoginCore_305.a();
        NLoginCore_305.k((String)NLoginCore_227.c("㺀", (int)ga, (long)(gb ^ gc)), (String)NLoginCore_227.c("㺃", (int)gd, (long)ge));
        NLoginCore_305.k((String)NLoginCore_227.c("㺆", (int)gf, (long)gg), (String)NLoginCore_227.c("㺉", (int)(gh & gi), (long)gj));
        NLoginCore_305.k((String)NLoginCore_227.c("㺌", (int)(gk & gl), (long)gm), NLoginCore_158.java_lang_String_a(byArray));
        this.var_com_nickuc_login_NLoginCore_151_a = this.a(NLoginCore_305, (String)NLoginCore_227.c("㺏", (int)(gn & go), (long)gp) + this.var_com_nickuc_login_NLoginCore_204_a.ordinal(), gq != 0);
    }

    private static void b() {
        int n;
        var_long_c = 8260978991583447035L;
        long l = var_long_c ^ 0xA09F17942683F0AAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(25 + 44), (byte)(60 + 23), (byte)(34 + 13), (byte)(31 + 36), (byte)(20 + 46), (byte)(40 + 27), (byte)(23 + 24), (byte)(61 + 19), (byte)(61 + 14), 67, (byte)(59 + 24), (byte)(44 + 9), (byte)(64 + 16), 97, (byte)(96 + 4), (byte)(2 + 98), (byte)(25 + 80), (byte)(81 + 29), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(55 + 14), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_227.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ďÚáęîÙèñĘăĞĄĩÿùĦċĄİĕĪÿüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ïõĜĖßĒÿüēīĆĦďĭøċĐăįąĴÿüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ÿýîðĝĞñćĥûĠğÿëêĦīīīĞĂÿüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[3] = NLoginCore_324.E("ԦԟՄԛՂԬԼԹՅԍԲԓԧՂՆՕԯԻԬ՝ԸՖՑԶԫԜԜ՛Բ՜ԨՁ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[4] = NLoginCore_559.B("ĂĚĘĐøæĥĦăĤĜĀćùğıíġĒĥĲĥüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ĂĚĘĐøæĥĦăĤĜĀćùğıíġĒĥĲĥüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[6] = NLoginCore_223.D("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[7] = NLoginCore_559.D("ѪцСаЪѲѮѣѦщдђзѱѮкњѱѬоѳъчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[8] = NLoginCore_453.F("ԧԥԖԘՅՆԙԯՍԣՈՇԧԓԒՎՓՓՓՆԪԧԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[9] = NLoginCore_004.F("ԪՂՀԸԠԎՍՎԫՌՄԨԯԡՇՙԕՉԺՍ՚ՍԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[10] = NLoginCore_004.C("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[11] = NLoginCore_387.D("ѪцСаЪѲѮѣѦщдђзѱѮкњѱѬоѳъчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[12] = NLoginCore_027.F("ԹԾԽՀԞՃԍԎԢԧԠԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[13] = NLoginCore_138.E("ԹԾԽՀԞՃԍԎԢԧԠԙ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[14] = NLoginCore_173.C("ѫзљсфмпсѬюѭм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[15] = NLoginCore_575.F("ՊԁՍԖԼԿԤԬՇՑԋԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[16] = NLoginCore_004.A("đîĀïĎĒàđĩĠþĭĚġĆÿðêîĈĩďüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[17] = NLoginCore_324.A("ğČĢüĂăĨĂĆÿĪèĬĘìĪıñāĎĲĥüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ĔėĀóßĄæçĪëČñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[19] = NLoginCore_384.C("ѭчјяѱЬќЦгѲѕѤзѤѯгъмѻѡѭѰчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[20] = NLoginCore_091.B("ĕÙõ÷óûòóáĤĪĥøÿĭëëòĔĊĄÿüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[21] = NLoginCore_559.E("ԓԘԼԵՄԚԘԎՇԢԧԓՏԶԭՒԦ԰Ԧԗ՛՝Ԥԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[22] = NLoginCore_027.B("đĖĕĘöěåæúÿøñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[23] = NLoginCore_110.F("ՇԣӾԍԇՏՋՀՃԦԑԯԔՎՋԗԷՎՉԛՐԧԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[24] = NLoginCore_559.C("ќѡѠѣсѦабхъум", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[25] = NLoginCore_091.D("ѦћрлѡнхфаЭѐябєїєыѻѠѠїњчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[26] = NLoginCore_223.A("ČĘĖăøäēûĞĝĆĢĀĩħçěìħİĈÿüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[27] = NLoginCore_027.E("ԴՀԾԫԠԌԻԣՆՅԯԿԵԔԘԘՔԱՖԼՎԷԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[28] = NLoginCore_384.B("ČĘĖăøäēûĞĝĄģąĚĆĮĝýīĀħĦĎĖĻăöįĪĖŀľ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[29] = NLoginCore_004.E("ԿՁԚԥԦՂԭՂՎԳՏՎԲԶԩՓԑԶՙԩԵԴՏԼԟԠդբԺԠԱԡ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[30] = NLoginCore_324.C("њѬЦЬаѢѧѬѦоЮм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[31] = NLoginCore_091.E("ԸԂՀԸԻՇՐԝԏՐԓԙ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[32] = NLoginCore_384.D("жѮЫШэњѩмгїѭм", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[33] = NLoginCore_110.B("ðđøĄĜ÷ĖĄīğøñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[34] = NLoginCore_451.D("ћХѣћўѪѳрвѳжм", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[35] = NLoginCore_092.D("іѧСѨѦѲцѯѰѱѱм", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[36] = NLoginCore_201.C("жлџјѧнлбѪхъжѲљѐѵщѓщкѾҀчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[37] = NLoginCore_559.A("ğûÖåßħģĘěþéćìĦģïďĦġóĨÿüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[38] = NLoginCore_384.C("њѬЦЬаѢѧѬѦоЮм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[39] = NLoginCore_223.C("ћХѣћўѪѳрвѳжм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[40] = NLoginCore_027.C("жѮЫШэњѩмгїѭм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[41] = NLoginCore_223.D("ШтЪѥѰшаѧѡфџЪѴѥьѮѶѭнҀѠѱѓѾфњѿѽѨѽѨщ҆ҁѪюѠшѫъѫҌҍђѥѳѣ҇҇ѻўѼҒ҃ҝѬҝѽң҃ѿѾѴ҇҅ѿҚҊҌҩѱҫѱңҁғѶҒҦ҅ҰғҔқѿһѻұһѿӇҽҀҥғҥҌҡӅӍӐӄӏӀҋӎҶҔҙұҮҸҺӇҨӠӋӐҧҨ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[42] = NLoginCore_091.F("ԸԋԼԅԫԫԱՌԩՓԴԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[43] = NLoginCore_559.A("Ý÷ßĚĥýåĜĖùĔßĩĚāģīĢòĵĕĦĈĳùďĴĲĝĲĝþĻĶğăĕýĠÿĠŁłćĚĨĘļļİēıŇĸŒġŒĲŘĸĴĳĩļĺĴŏĿŁŞĦŠĦŘķŜŠŜşśōŲŊŊűŖŒĶŹŕĲŔŌŹŐřĸşžŗşůŞŅŃŷŠő", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[44] = NLoginCore_223.C("УинјѥюЯмгрЩвѱѮѼщѓшѮї҂Ҁчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[45] = NLoginCore_384.E("ԸԋԼԅԫԫԱՌԩՓԴԙ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[46] = NLoginCore_091.E("ԢԊԫԸԅՀՎՆՁՐԎԪԷՊԯՐՒԺՇ՜՞ԷԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[47] = NLoginCore_092.B("ĖüÿĝîğýèĤýĕġüīèïíðĄĳģĢģĩĩĺęïĘ÷ĮĻįÿėįĶĴĜńēěąėŇğĚĭđĢġđĒŊŀłłŘŋĮōĖĸĻľĞĹĽŔĸĽŘŧŗīı", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[48] = NLoginCore_324.B("ĖøĂõĔßĆğĖâĖñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[49] = NLoginCore_453.D("ьзѢкюЮнѧѬѪбѵезѭчмѶѠѮслєкўоѸѸѨѩно", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[50] = NLoginCore_027.B("ðüýĂÝĠçòéüĕäĆúìĀġčĞċĭÿüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[51] = NLoginCore_223.C("ьзѢкюЮнѧѬѪбѵезѭчмѶѠѮслєкўоѸѸѨѩно", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[52] = NLoginCore_076.B("ìċđđĂäęáħûþČĪėđĚýðģĬħďüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[53] = NLoginCore_138.E("ԿՁԚԥԦՂԭՂՎԳՎՅԵԢԶԤԧՅԪՅԨ՛ՁԟԺԷԢԽԺԶԤՙԠըԦՙծժՁթՁՄծԹ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[54] = NLoginCore_223.D("рэюнэѯмѕбЮѨѕиїкюјыѿќрьѝѭ҅ѳѻ҅є҃ѓфџўѿю҄Ѽѝџѳѷҍќ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[55] = NLoginCore_110.A("üăęåÿÙĄĄĝġĀñ", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[56] = NLoginCore_201.F("ՆԔԩՄԫԮԞՆԈԲԤԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[57] = NLoginCore_387.D("ѪсСчќяѫсѓгЮѮѣљѩѱжёѷѯҀѶѻрнїљіџѿѹыуъѣц҉ѫѩѱ҄ҁ҅҂ҚҗѹѥҕњҕѻѫҞ҂ҀѢҠҟѤѻѩѿқѤҎѪҭҥҞҝґ҅ѾґҖѸ҈ҌҐ҅ҶҩѼҘҰ҇҈", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[58] = NLoginCore_446.E("ԅԔԧԙԬԌԪԋԊՂԒԪՄԮՏԬՎԲԤ՚Օՠ՟ԓԻԠԽՎգՐՄԤ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[59] = NLoginCore_223.D("ѧШцѥщпЭЪўѩѡдѤѮѣѪѻаюѳћъчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[60] = NLoginCore_138.D("ѧШцѥщпЭЪўѩѤѬишѫѶлѳћѯьњчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[61] = NLoginCore_201.A("ĚÚĚąâýóĉĉħÞßĞýĐĤĮĬýćāĵüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[62] = NLoginCore_453.F("ԢԊԫԸԅՀՎՆՁՐԎԪԷՊԯՐՒԺՇ՜՞ԷԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[63] = NLoginCore_091.D("ѡчъѨйѪшгѯшѠѬчѶгкиляѾѮѭѮѴѴ҅Ѥкѣтѹ҆ѺъѢѺҁѿѧҏўѦѐѢҒѪѥѸќѭѬќѝҕҋҍҍңҖѹҘѡ҃҆҉ѩ҄҈ҟ҃҈ңҲҢѶѼ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[64] = NLoginCore_110.C("ЦтьЦшЯђцюЭуѸйѥивгнѭѯѯтѺѺѳцѣђѴмҌѫѧѬя҄ѦѝџґѶѬѤ҆ѺҎѹѨҎўѷѾѿѺѧѨ", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[65] = NLoginCore_384.A("Û÷āÛýäćûăâøĭîĚíçèòĢĤĤ÷įįĨûĘćĩñŁĠĂüēĶĜăĜņĆąĠĈĎāŏĢĥħŔĦĮğĜĝ", (byte)21, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_227.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ԷԂԉՁԖԁԐԙՀԫՈԭԏԖԕԤԵԵՌԮԦԷԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ïõĜĖßĒÿüēīĄüĭĘíěİďĒĢñéĦĄĳûòóěďĮĚ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ÿýîðĝĞñćĥûĠõøüüĉíēĄĭģħĆčģĬĄķğĐļā", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[3] = NLoginCore_575.B("þ÷ĜóĚĄĔđĝåĊëÿĚĞĭćēĄĵĐĩïĢĭıĬĆøüŀ÷", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[4] = NLoginCore_559.C("эѥѣћубѰѱюѯѦеѹуѣціѫњўѹҀчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[5] = NLoginCore_004.B("ĂĚĘĐøæĥĦăĤěçíĈâùĞăĪõđĥüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[6] = NLoginCore_004.D("жлџјѧнлбѪхъщѴѱѕЮўоєїїҀчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[7] = NLoginCore_451.E("ՇԣӾԍԇՏՋՀՃԦԏԡՁԐԥ԰ԵՉՇԜՎԧԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[8] = NLoginCore_091.B("ÿýîðĝĞñćĥûġþìċĐëĐěġĂñĀĕıīĚĘĹĹĴĨĘ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ԪՂՀԸԠԎՍՎԫՌՄԡԤԥՖԥ՘ԬՅ՗ՊԧԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[10] = NLoginCore_453.B("ëðĔčĜòðæğúüĜĆįĂûĄĠòýğÿüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[11] = NLoginCore_138.D("ѪцСаЪѲѮѣѦщдЪщѦѩѕђџбѠйҁсѸнѐѠѼљћцҊ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[12] = NLoginCore_110.F("ՇՄԭԈՌԥԝԦԍԭԴԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[13] = NLoginCore_091.B("ċěĎčãěęâÜüĈñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[14] = NLoginCore_324.E("ՆԔԵԽԡԦՃՇԾԞԧԶԯՕԬԖՂԕ԰ՈԖԧԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[15] = NLoginCore_076.B("ĊđĚčæĕĖæīĬĤěĘĝĥïıûċĴăĵüý", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[16] = NLoginCore_138.E("ԹԖԨԗԶԺԈԹՑՈԧԓԒԔՓԏՔԭԧ՗Ռ՝Ԥԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[17] = NLoginCore_384.F("ՇԴՊԤԪԫՐԪԮԧՒՑՕՇՙՉԕԴԽԲՙՍԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[18] = NLoginCore_559.F("ԸՂԚԸԜԛԟԲԎԬԜԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[19] = NLoginCore_110.E("ՊԤԵԬՎԉԹԃԐՏ԰ԾԪՀԏԧՕԍԤԘ԰ՑԮՒԺԿ՚զՑզԧ՚", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[20] = NLoginCore_324.E("ԽԁԝԟԛԣԚԛԉՌՓՊԖԮՇԓԓՉՍԺԲՍԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[21] = NLoginCore_091.F("ԓԘԼԵՄԚԘԎՇԢԤՆՊԒԕՃԷԻՔԼՇ՝Ԥԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[22] = NLoginCore_091.D("ЬщѡёёмџѰпѤчм", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[23] = NLoginCore_223.A("ğûÖåßħģĘěþèëĠĩġĠĤıĆĊöĭėĩĈøûīğĔđł", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[24] = NLoginCore_223.A("ðĂĀĐđěĦĆēĞôñ", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[25] = NLoginCore_092.A("ěĐõðĖòúùåâĆģîĆčĝĉĝČġÿÿüý", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[26] = NLoginCore_384.E("ԴՀԾԫԠԌԻԣՆՅԯԏԯԬԭՏԶԹԘԛԩ՝Ԥԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[27] = NLoginCore_446.D("їѣѡюуЯўцѩѨђфхйхЮљцѳѩѽѷѢѴљѳѲ҄ѢѣѨљ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[28] = NLoginCore_091.C("їѣѡюуЯўцѩѨяѮѐѥёѹѨшѶыѲѺѠѳѕо҃ўѷунф", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[29] = NLoginCore_110.D("ѢѤншщѥѐѥѱіѲѱѕљьѶдљѼьјјьљѭѹўѴѵѓѽы", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[30] = NLoginCore_091.D("ъРЧѐЭбѴќубѣѭѬућќнищёѸҀчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[31] = NLoginCore_110.B("ģăĞĜÜĖĩěÿĉĪñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[32] = NLoginCore_138.D("ѨРѧЮЬњѨрѧёёЯжгѧѓцќўҀыњчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[33] = NLoginCore_384.C("ютњѝўќъЭѴыѤаѶѦЭѴдѯэўрњчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[34] = NLoginCore_427.B("ĔċÛ×ēäĢĤè÷Čñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[35] = NLoginCore_384.F("ՃԦԈՂԯԯԭՆՐՋԋԌՖՏԔ԰԰ԩԫՏԷԧԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[36] = NLoginCore_091.D("жлџјѧнлбѪхъѫѵѱѵзѳѺяўѵњчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[37] = NLoginCore_324.C("ѪцСаЪѲѮѣѦщгаЫзьцзѕѰоѪътѮѭѢфѳ҂҄ћ҈", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[38] = NLoginCore_559.C("сшЭпёвѢЯЬэѐѯѐабёїнѠѹѰњчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[39] = NLoginCore_324.B("ïėġęãòâăáĞĚñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[40] = NLoginCore_027.F("ԸԄՋӿԩՉԸԡԭԓ԰ԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[41] = NLoginCore_384.F("ԅԟԇՂՍԥԍՄԾԡԼԇՑՂԩՋՓՊԚ՝ԽՎ԰՛ԡԷ՜՚Յ՚ՅԦգ՞ՇԫԽԥՈԧՈթժԯՂՐՀդդ՘ԻՙկՠպՉպ՚րՠ՜՛Ցդբ՜շէթֆՎֈՎր՞հՓկփբ֍հձո՜֘՘֎֘՜֤֚՝ւհւթվ֢֪֭֡֬֝ը֫֐յ֥֦֯ոփִ֬֯հ֭քօ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[42] = NLoginCore_027.C("љѥфџЪвЭѲєѨчм", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[43] = NLoginCore_091.B("Ý÷ßĚĥýåĜĖùĔßĩĚāģīĢòĵĕĦĈĳùďĴĲĝĲĝþĻĶğăĕýĠÿĠŁłćĚĨĘļļİēıŇĸŒġŒĲŘĸĴĳĩļĺĴŏĿŁŞĦŠĦŘķŜŠŜşśōŲŊŊűŖŒĶŹŕĲŔŌŹŐřŪŵŽŤżŶœŢņşŋő", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[44] = NLoginCore_076.E("ԀԕԚԵՂԫԌԙԐԝԆՔՏԒԲՆԑՏԹԷԙԧԤԥ", (byte)21, 69);
                    NLoginCore_227.var_java_lang_String_arr_b[45] = NLoginCore_559.F("ԫԛԶԛՀՄՄԺԑԱԓԙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[46] = NLoginCore_027.C("хЭюћШѣѱѩѤѳаЪђіѤїѱіовсѱѓѱнѣҀѡѶ҇Ѵї", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[47] = NLoginCore_027.D("ѡчъѨйѪшгѯшѠѬчѶгкиляѾѮѭѮѴѴ҅Ѥкѣтѹ҆ѺъѢѺҁѿѧҏўѦѐѢҒѪѥѸќѭѬќѝҕҋҍҍңҖѹҘѡ҃҆҉ҘҍҰҦғѯ҅ѾҦѲѼ", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[48] = NLoginCore_138.F("ԣԢԪԇԮԡԘԙԠԽԮԎՓԉԧԹՔՐԤԭԩԷԤԥ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[49] = NLoginCore_427.F("ԩԔԿԗԫԋԚՄՉՇԎՒԒԔՊԤԙՓԽՋԞԕԜԷԮԳԶՐՖ՗գէ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[50] = NLoginCore_092.B("ðüýĂÝĠçòéüčĢĈĝĂĞêĬēĶĵČġĉċĮĚĽĲĐčĝ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[51] = NLoginCore_223.F("ԩԔԿԗԫԋԚՄՉՇԎՒԒԔՊԤԙՓԽՋԞԚՌ՛ԞԱԸԾդԧՇԩ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[52] = NLoginCore_223.C("зіќќэЯѤЬѲцчѤѣѵѴѧѺомѫїъчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[53] = NLoginCore_138.A("ėęòýþĚąĚĦċĦĝčúĎüÿĝĂĝĀĳę÷ĒďúĕĒĎüıĕġĠĒĆĢġÿĞġĠđ", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[54] = NLoginCore_324.B("õĂăòĂĤñĊæãĝĊíČïăčĀĴđõāĒĢĺĨİĺĉĸĈùğńčĔĸđăĸĈĂľčįĽğĭĤċĒġőğĜĝ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[55] = NLoginCore_223.A("ĘûòĖáúĤğĥāĄñ", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[56] = NLoginCore_027.B("ÚčĕÝďĄăćôĠĈñ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[57] = NLoginCore_091.D("ѪсСчќяѫсѓгЮѮѣљѩѱжёѷѯҀѶѻрнїљіџѿѹыуъѣц҉ѫѩѱ҄ҁ҅҂ҚҗѹѥҕњҕѻѫҞ҂ҀѢҠҟѤѻѩѿқѤҎѪҭҥҞҝґ҅ѾҒҰүҥҍҦѳҚһҀҖӀ҇҈", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[58] = NLoginCore_027.D("ШзъмяЯэЮЭѥеэѧёѲяѱѕчѽѸлясфѹѣєѹѝѡц", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[59] = NLoginCore_387.C("ѧШцѥщпЭЪўѩѣцъюЭѺѝнььњњчш", (byte)21, 67);
                    NLoginCore_227.var_java_lang_String_arr_b[60] = NLoginCore_091.A("ĜÝûĚþôâßēĞėĂĈĉÿíĭĆĠëąĮĪĭĕććüįĝŀĺ", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[61] = NLoginCore_223.D("ѥХѥѐЭшоєєѲЭъшдѵѨѽѹѭизњчш", (byte)21, 68);
                    NLoginCore_227.var_java_lang_String_arr_b[62] = NLoginCore_201.A("úâăĐÝĘĦĞęĨããäéąĩûħċēĎēîİĚįĻĐùĴġį", (byte)21, 65);
                    NLoginCore_227.var_java_lang_String_arr_b[63] = NLoginCore_004.F("ԾԤԧՅԖՇԥԐՌԥԽՉԤՓԐԗԕԘԬ՛ՋՊՋՑՑբՁԗՀԟՖգ՗ԧԿ՗՞՜ՄլԻՃԭԿկՇՂՕԹՊՉԹԺղըժժրճՖյԾՠգԼՋքփշզևհ՛փֆՙ", (byte)21, 70);
                    NLoginCore_227.var_java_lang_String_arr_b[64] = NLoginCore_027.B("Û÷āÛýäćûăâøĭîĚíçèòĢĤĤ÷įįĨûĘćĩñŁĠĜġĄĹěĒĔņīġĚŅĊĹěŐňĩČİďŅĜĝ", (byte)21, 66);
                    NLoginCore_227.var_java_lang_String_arr_b[65] = NLoginCore_223.F("ԃԟԩԃԥԌԯԣԫԊԠՕԖՂԕԏԐԚՊՌՌԟ՗՗ՐԣՀԯՑԙթՈԪԤԻ՞ՄԫՄծԮԭՉնԨՋխոԺԭՒԵԵխՄՅ", (byte)21, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_227.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ѫэхЭѪяѫсѯхЯѳбѧѸэйеївѢѷѿлуѺјѽуҊѸѽ", (byte)21, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_227.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ØùĕÝüùöđâĤĜåĜĤĠāĬĝĢĄăĥüý", (byte)21, 65);
                }
            }
        }
    }

    public int n() {
        return this.var_com_nickuc_login_NLoginCore_142_a.n();
    }

    @Generated
    public NLoginCore_204 com_nickuc_login_NLoginCore_204_a() {
        return this.var_com_nickuc_login_NLoginCore_204_a;
    }

    @Nullable
    @Generated
    public NLoginCore_111 com_nickuc_login_NLoginCore_151_a() {
        return this.var_com_nickuc_login_NLoginCore_151_a;
    }

    static {
        var_int_a = Integer.reverse(0x74000000);
        var_int_b = Integer.reverse(-201326592);
        var_int_c = 0 >>> 6 | 0 << -6;
        d = Long.reverse(-2313774559793830578L);
        e = Long.reverse(-2017612633061982208L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(4315524091695539534L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(4315524091695539534L);
        var_int_j = 196608 >>> 112 | 196608 << ~112 + 1;
        k = Long.reverse(4315524091695539534L);
        l = Integer.reverse(0x20000000);
        m = Long.reverse(-2313774559793830578L);
        n = Long.reverse(-2017612633061982208L);
        var_int_o = Integer.reverse(0);
        p = (0 >>> 30 | 0 << ~30 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(-1610612736);
        r = Long.reverse(4315524091695539534L);
        s = Integer.reverse(0x60000000);
        t = Long.reverse(-2313774559793830578L);
        u = Long.reverse(-2017612633061982208L);
        v = Integer.reverse(-536870912);
        w = Long.reverse(-2313774559793830578L);
        x = Long.reverse(-2017612633061982208L);
        y = (0 >>> 4 | 0 << -4) & 0xFFFFFFFF;
        z = (0 >>> 10 | 0 << -10) & 0xFFFFFFFF;
        aa = Integer.reverse(0);
        ab = Integer.reverse(0);
        ac = Integer.reverse(0x10000000);
        ad = Long.reverse(-2313774559793830578L);
        ae = Long.reverse(-2017612633061982208L);
        af = Integer.reverse(0);
        ag = Integer.reverse(0x60000000);
        ah = Integer.reverse(-1879048192);
        ai = (-1 >>> 5 | -1 << ~5 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(4315524091695539534L);
        ak = 20480 >>> 171 | 20480 << -171;
        al = Long.reverse(4315524091695539534L);
        am = Integer.reverse(-805306368);
        an = Long.reverse(-2313774559793830578L);
        ao = Long.reverse(-2017612633061982208L);
        ap = Integer.reverse(0x30000000);
        aq = Long.reverse(-2313774559793830578L);
        ar = Long.reverse(-2017612633061982208L);
        as = (0x2000000 >>> 185 | 0x2000000 << -185) & 0xFFFFFFFF;
        at = Integer.reverse(0);
        au = (208 >>> 132 | 208 << -132) & 0xFFFFFFFF;
        av = Integer.reverse(-1);
        aw = Long.reverse(4315524091695539534L);
        ax = Integer.reverse(0x58000000);
        ay = Integer.reverse(0);
        az = Integer.reverse(0x70000000);
        ba = Long.reverse(4315524091695539534L);
        bb = 0x40000000 >>> 94 | 0x40000000 << -94;
        bc = Integer.reverse(0x40000000);
        bd = (0x1E000000 >>> 25 | 0x1E000000 << -25) & 0xFFFFFFFF;
        be = Long.reverse(4315524091695539534L);
        bf = Integer.reverse(-1073741824);
        bg = 0x2000000 >>> 87 | 0x2000000 << ~87 + 1;
        bh = 1 >>> 220 | 1 << ~220 + 1;
        bi = Long.reverse(-2313774559793830578L);
        bj = Long.reverse(-2017612633061982208L);
        bk = (0xA000000 >>> 25 | 0xA000000 << -25) & 0xFFFFFFFF;
        bl = -2147483647 >>> 94 | -2147483647 << ~94 + 1;
        bm = 786432 >>> 241 | 786432 << -241;
        bn = Integer.reverse(-2013265920);
        bo = Long.reverse(4315524091695539534L);
        bp = (114688 >>> 238 | 114688 << -238) & 0xFFFFFFFF;
        bq = Integer.reverse(0x40000000);
        br = Integer.reverse(0x10000000);
        bs = 4608 >>> 168 | 4608 << -168;
        bt = Long.reverse(-2313774559793830578L);
        bu = Long.reverse(-2017612633061982208L);
        bv = (144 >>> 132 | 144 << ~132 + 1) & 0xFFFFFFFF;
        bw = 40960 >>> 12 | 40960 << ~12 + 1;
        bx = Integer.reverse(-939524096);
        by = Long.reverse(-2313774559793830578L);
        bz = Long.reverse(-2017612633061982208L);
        ca = Integer.reverse(-805306368);
        cb = -1073741824 >>> 92 | -1073741824 << -92;
        cc = Integer.reverse(0x28000000);
        cd = Long.reverse(-2313774559793830578L);
        ce = Long.reverse(-2017612633061982208L);
        cf = Integer.reverse(-1342177280);
        cg = (0x1C00000 >>> 213 | 0x1C00000 << ~213 + 1) & 0xFFFFFFFF;
        ch = 0xA800000 >>> 183 | 0xA800000 << -183;
        ci = Long.reverse(-2313774559793830578L);
        cj = Long.reverse(-2017612633061982208L);
        ck = Integer.reverse(-268435456);
        cl = (0xB00000 >>> 243 | 0xB00000 << ~243 + 1) & 0xFFFFFFFF;
        cm = Long.reverse(-2313774559793830578L);
        cn = Long.reverse(-2017612633061982208L);
        co = Integer.reverse(0x8000000);
        cp = (376832 >>> 206 | 376832 << ~206 + 1) & 0xFFFFFFFF;
        cq = Long.reverse(4315524091695539534L);
        cr = Integer.reverse(-2013265920);
        cs = Integer.reverse(0x18000000);
        ct = Long.reverse(4315524091695539534L);
        cu = (0x480000 >>> 146 | 0x480000 << ~146 + 1) & 0xFFFFFFFF;
        cv = Integer.reverse(-1744830464);
        cw = Long.reverse(-2313774559793830578L);
        cx = Long.reverse(-2017612633061982208L);
        cy = Integer.reverse(-939524096);
        cz = Integer.reverse(0x28000000);
        da = Integer.reverse(0x58000000);
        db = Integer.reverse(-1);
        dc = Long.reverse(4315524091695539534L);
        dd = (0x540000 >>> 242 | 0x540000 << -242) & 0xFFFFFFFF;
        de = Integer.reverse(0x68000000);
        df = Integer.reverse(-671088640);
        dg = Long.reverse(4315524091695539534L);
        dh = (0x2E0000 >>> 241 | 0x2E0000 << -241) & 0xFFFFFFFF;
        di = Integer.reverse(0x18000000);
        dj = Integer.reverse(0x38000000);
        dk = Long.reverse(4315524091695539534L);
        dl = 0x6400000 >>> 246 | 0x6400000 << -246;
        dm = 928 >>> 165 | 928 << ~165 + 1;
        dn = Long.reverse(-2313774559793830578L);
        cfr_renamed_1 = Long.reverse(-2017612633061982208L);
        dp = (0 >>> 183 | 0 << ~183 + 1) & 0xFFFFFFFF;
        dq = (-2147483641 >>> 158 | -2147483641 << -158) & 0xFFFFFFFF;
        dr = Long.reverse(4315524091695539534L);
        ds = Integer.reverse(-134217728);
        dt = Long.reverse(-2313774559793830578L);
        du = Long.reverse(-2017612633061982208L);
        dv = (128 >>> 130 | 128 << ~130 + 1) & 0xFFFFFFFF;
        dw = Long.reverse(-2313774559793830578L);
        dx = Long.reverse(-2017612633061982208L);
        dy = 16384 >>> 78 | 16384 << ~78 + 1;
        dz = Integer.reverse(-2080374784);
        ea = Long.reverse(-2313774559793830578L);
        eb = Long.reverse(-2017612633061982208L);
        ec = Integer.reverse(0x44000000);
        ed = Long.reverse(-2313774559793830578L);
        ee = Long.reverse(-2017612633061982208L);
        ef = Integer.reverse(-1006632960);
        eg = Long.reverse(4315524091695539534L);
        eh = -1879048192 >>> 26 | -1879048192 << ~26 + 1;
        ei = Long.reverse(-2313774559793830578L);
        ej = Long.reverse(-2017612633061982208L);
        ek = 1184 >>> 37 | 1184 << ~37 + 1;
        el = Long.reverse(-2313774559793830578L);
        em = Long.reverse(-2017612633061982208L);
        en = 0x1300000 >>> 211 | 0x1300000 << -211;
        eo = -1 >>> 52 | -1 << -52;
        ep = Long.reverse(4315524091695539534L);
        eq = 624 >>> 228 | 624 << -228;
        er = -1 >>> 215 | -1 << -215;
        es = Long.reverse(4315524091695539534L);
        et = Integer.reverse(0x14000000);
        eu = Long.reverse(-2313774559793830578L);
        ev = Long.reverse(-2017612633061982208L);
        ew = 128 >>> 135 | 128 << ~135 + 1;
        ex = Integer.reverse(0);
        ey = Integer.reverse(-1811939328);
        ez = (-1 >>> 143 | -1 << -143) & 0xFFFFFFFF;
        fa = Long.reverse(4315524091695539534L);
        fb = Integer.reverse(0x54000000);
        fc = Integer.reverse(-1);
        fd = Long.reverse(4315524091695539534L);
        fe = Integer.reverse(0);
        ff = Integer.reverse(0);
        fg = (5504 >>> 7 | 5504 << -7) & 0xFFFFFFFF;
        fh = Integer.reverse(-1);
        fi = Long.reverse(4315524091695539534L);
        fj = 180224 >>> 172 | 180224 << ~172 + 1;
        fk = Long.reverse(-2313774559793830578L);
        fl = Long.reverse(-2017612633061982208L);
        fm = (0x2D00000 >>> 84 | 0x2D00000 << ~84 + 1) & 0xFFFFFFFF;
        fn = Long.reverse(-2313774559793830578L);
        fo = Long.reverse(-2017612633061982208L);
        fp = (0 >>> 118 | 0 << -118) & 0xFFFFFFFF;
        fq = (0x5C0000 >>> 209 | 0x5C0000 << ~209 + 1) & 0xFFFFFFFF;
        fr = Long.reverse(-2313774559793830578L);
        fs = Long.reverse(-2017612633061982208L);
        ft = 0x2F0000 >>> 176 | 0x2F0000 << ~176 + 1;
        fu = Long.reverse(-2313774559793830578L);
        fv = Long.reverse(-2017612633061982208L);
        fw = Integer.reverse(0);
        fx = 0 >>> 88 | 0 << -88;
        fy = 0 >>> 246 | 0 << -246;
        fz = Integer.reverse(0x20000000);
        ga = (48 >>> 224 | 48 << -224) & 0xFFFFFFFF;
        gb = Long.reverse(-2313774559793830578L);
        gc = Long.reverse(-2017612633061982208L);
        gd = Integer.reverse(-1946157056);
        ge = Long.reverse(4315524091695539534L);
        gf = 0x40000006 >>> 29 | 0x40000006 << ~29 + 1;
        gg = Long.reverse(4315524091695539534L);
        gh = 3264 >>> 38 | 3264 << ~38 + 1;
        gi = (-1 >>> 4 | -1 << -4) & 0xFFFFFFFF;
        gj = Long.reverse(4315524091695539534L);
        gk = Integer.reverse(0x2C000000);
        gl = (-1 >>> 173 | -1 << ~173 + 1) & 0xFFFFFFFF;
        gm = Long.reverse(4315524091695539534L);
        gn = Integer.reverse(-1409286144);
        go = Integer.reverse(-1);
        gp = Long.reverse(4315524091695539534L);
        gq = 0x800000 >>> 87 | 0x800000 << ~87 + 1;
        gr = 0x400000 >>> 246 | 0x400000 << ~246 + 1;
        gs = (0x36000000 >>> 24 | 0x36000000 << -24) & 0xFFFFFFFF;
        gt = Long.reverse(-2313774559793830578L);
        gu = Long.reverse(-2017612633061982208L);
        gv = Integer.reverse(-335544320);
        gw = Long.reverse(-2313774559793830578L);
        gx = Long.reverse(-2017612633061982208L);
        gy = (-536870912 >>> 186 | -536870912 << ~186 + 1) & 0xFFFFFFFF;
        gz = Long.reverse(-2313774559793830578L);
        ha = Long.reverse(-2017612633061982208L);
        hb = Integer.reverse(-1677721600);
        hc = Long.reverse(-2313774559793830578L);
        hd = Long.reverse(-2017612633061982208L);
        he = 0 >>> 57 | 0 << -57;
        hf = Integer.reverse(0x5C000000);
        hg = Long.reverse(-2313774559793830578L);
        hh = Long.reverse(-2017612633061982208L);
        hi = Integer.reverse(-603979776);
        hj = Long.reverse(-2313774559793830578L);
        hk = Long.reverse(-2017612633061982208L);
        hl = Integer.reverse(0x3C000000);
        hm = Long.reverse(4315524091695539534L);
        hn = Integer.reverse(Integer.MIN_VALUE);
        ho = (0 >>> 216 | 0 << -216) & 0xFFFFFFFF;
        hp = Integer.reverse(Integer.MIN_VALUE);
        hq = Integer.reverse(0);
        hr = Integer.reverse(0x60000000);
        hs = (0x8000000 >>> 27 | 0x8000000 << ~27 + 1) & 0xFFFFFFFF;
        ht = (-201326592 >>> 250 | -201326592 << -250) & 0xFFFFFFFF;
        hu = Long.reverse(4315524091695539534L);
        hv = 0x7800000 >>> 244 | 0x7800000 << -244;
        hw = (320 >>> 38 | 320 << -38) & 0xFFFFFFFF;
        hx = (0xE100000 >>> 176 | 0xE100000 << -176) & 0xFFFFFFFF;
        hy = 1920 >>> 132 | 1920 << -132;
        hz = Long.reverse(1711367858400788480L);
        ia = Integer.reverse(Integer.MIN_VALUE);
        ib = 1015808 >>> 78 | 1015808 << ~78 + 1;
        ic = -1 >>> 96 | -1 << -96;
        id = Long.reverse(4315524091695539534L);
        ie = Integer.reverse(-67108864);
        cfr_renamed_0 = Long.reverse(-2313774559793830578L);
        ig = Long.reverse(-2017612633061982208L);
        ih = 0 >>> 88 | 0 << ~88 + 1;
        ii = Integer.reverse(0x42000000);
        ij = Integer.reverse(0x42000000);
        ik = 1476395010 >>> 89 | 1476395010 << -89;
        il = Integer.reverse(0x1E000000);
        im = 16384 >>> 13 | 16384 << ~13 + 1;
        in = (0 >>> 39 | 0 << ~39 + 1) & 0xFFFFFFFF;
        io = Integer.reverse(0x2000000);
        ip = Long.reverse(-2313774559793830578L);
        iq = Long.reverse(-2017612633061982208L);
        ir = (32768 >>> 207 | 32768 << ~207 + 1) & 0xFFFFFFFF;
        is = (16640 >>> 200 | 16640 << ~200 + 1) & 0xFFFFFFFF;
        it = Long.reverse(4315524091695539534L);
        var_java_lang_String_arr_a = new String[ii];
        var_java_lang_String_arr_b = new String[ij];
        NLoginCore_227.b();
        W = ik;
        V = il;
        String[] stringArray = new String[im];
        stringArray[NLoginCore_227.in] = NLoginCore_158.u((String)NLoginCore_227.c("㺀", (int)io, (long)(ip ^ iq)));
        stringArray[NLoginCore_227.ir] = NLoginCore_158.u((String)NLoginCore_227.c("㺃", (int)is, (long)it));
        var_java_util_List_java_lang_String__j = Arrays.asList(stringArray);
    }

    private synchronized void d(boolean bl) {
        if (bl) {
            this.al();
        }
        if (this.var_com_nickuc_login_NLoginCore_151_a == null) {
            throw new IllegalStateException((String)NLoginCore_227.c("㺀", (int)gs, (long)(gt ^ gu)));
        }
        this.var_com_nickuc_login_NLoginCore_142_a.a(this.var_com_nickuc_login_NLoginCore_151_a);
        if (this.var_com_nickuc_login_NLoginCore_142_a.ad()) {
            try {
                File file = new File(this.var_java_lang_String_arr_b.e() + File.separator + (String)NLoginCore_227.c("㺃", (int)gv, (long)(gw ^ gx)), this.var_java_lang_String_arr_b.q() + (String)NLoginCore_227.c("㺆", (int)gy, (long)(gz ^ ha)));
                String string = this.var_com_nickuc_login_NLoginCore_142_a.N();
                if (!file.exists() || string != null && !NLoginCore_342.var_com_nickuc_login_NLoginCore_342_d.a(file, string)) {
                    this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_233_a().aq();
                }
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_227.c("㺉", (int)hb, (long)(hc ^ hd)), new Object[he]);
            }
        }
    }

    @Nullable
    @Generated
    public NLoginCore_109 com_nickuc_login_NLoginCore_109_a() {
        return this.var_com_nickuc_login_NLoginCore_109_a;
    }

    public synchronized void ai() {
        this.aW = null;
        this.aj();
        NLoginCore_482 NLoginCore_4822 = this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a();
        NLoginCore_4822.com_nickuc_login_NLoginCore_482_a((String)NLoginCore_227.c("㺀", (int)(ah & ai), (long)aj));
        NLoginCore_4822.ag();
    }

    @Nullable
    @Generated
    String J() {
        return this.aW;
    }

    public NLoginCore_111 a(NLoginCore_305 NLoginCore_305, String string, boolean bl) {
        return this.a(NLoginCore_305, string, bl, NLoginCore_305::a);
    }

    public void a(NLoginCore_589 NLoginInterface_0222) {
        this.var_long_o = System.currentTimeMillis();
        this.d(fy != 0);
        NLoginInterface_0222.a(() -> {
            block4: {
                try {
                    long l;
                    int n = this.var_com_nickuc_login_NLoginCore_142_a.b((String)NLoginCore_227.c("㺀", (int)ht, (long)hu), hv);
                    if (n < hw || n > hx) {
                        n = hy;
                    }
                    if ((l = System.currentTimeMillis()) - this.var_long_o >= (long)n * hz) {
                        this.var_long_o = l;
                        this.d(ia != 0);
                    }
                }
                catch (Throwable throwable) {
                    if (throwable instanceof IllegalStateException && ((String)NLoginCore_227.c("㺃", (int)(ib & ic), (long)id)).equals(throwable.getMessage())) break block4;
                    NLoginCore_370.c((String)NLoginCore_227.c("㺆", (int)ie, (long)(cfr_renamed_0 ^ ig)), throwable, new Object[ih]);
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public void a(NLoginCore_204 NLoginCore_2042) {
        this.var_com_nickuc_login_NLoginCore_204_a = NLoginCore_2042;
        this.var_java_lang_String_arr_b.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().a((String)NLoginCore_227.c("㺀", (int)ac, (long)(ad ^ ae)), (byte)NLoginCore_2042.ordinal()).ag();
    }

    @Nullable
    @Generated
    public NLoginCore_180 com_nickuc_login_NLoginCore_180_a() {
        return this.var_com_nickuc_login_NLoginCore_180_a;
    }
}

