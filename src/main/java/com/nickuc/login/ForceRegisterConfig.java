/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_407;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_229;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_335;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ForceRegisterConfig {
    private static long iv;
    private static int gd;
    private static int ep;
    private static long ez;
    private static long gu;
    private static int ak;
    private static long ff;
    private static int dg;
    private static long hq;
    private static int ig;
    private static long bd;
    private static long kf;
    private static long fb;
    private static int fj;
    private static long et;
    private static int dr;
    private static long dq;
    private static long bq;
    public final Object var_java_lang_Object_c = new Object();
    String var_java_lang_String_s;
    private static long hy;
    private static int bn;
    private static int ar;
    private static long dz;
    private static long ki;
    private static int bl;
    private static int hf;
    private static int var_int_a;
    String var_java_lang_String_t;
    private static long fe;
    private static int be;
    private static long bf;
    private static int gj;
    private static long hm;
    long var_long_g;
    private static long bc;
    private static long gf;
    private static int var_int_t;
    private static long gq;
    private static int ed;
    private static long dt;
    private static long ea;
    private static long ij;
    private static long ga;
    private static long hn;
    private static int bh;
    private static long gz;
    private static long cb;
    private static long jg;
    private static long ec;
    private static long ju;
    private static int an;
    private static long jl;
    private static long iq;
    private static int br;
    private static long kn;
    UUID var_java_util_UUID_a;
    private static int bo;
    private static int cv;
    private static int ir;
    private static int kp;
    private static long var_long_c;
    private static int fg;
    private static long v;
    private static int jd;
    private static int aa;
    private static int bw;
    private static int hw;
    private static long kl;
    UUID var_java_util_UUID_c;
    private static long ix;
    private static long eq;
    private static long jt;
    final NLoginCore_407 var_com_nickuc_login_NLoginCore_407_a;
    private static int jh;
    private static int var_int_g;
    private static long bj;
    private static long jn;
    private static int eu;
    private static long kr;
    private static int af;
    private static int bi;
    private static int km;
    private static long aw;
    private static long as;
    private static int q;
    private static int by;
    private static long bm;
    private static long gt;
    private static int kb;
    private static int dm;
    private static int ib;
    private static long jb;
    private static int bv;
    private static long ck;
    private static long gc;
    private static long hh;
    private static long el;
    private static int jc;
    private static int bu;
    private static int gg;
    private static int am;
    private static long bz;
    private static int ad;
    private static int i;
    private static int fa;
    UUID var_java_util_UUID_b;
    private static int fp;
    private static int df;
    private static long ee;
    private static int gl;
    private static long gi;
    private static long ik;
    private static long dj;
    private static long gx;
    private static int hu;
    private static int eb;
    private static int bs;
    private static long cg;
    private static int bg;
    private static long cp;
    private static long ip;
    private static int bk;
    private static int kj;
    private static long kq;
    long var_long_f;
    private static int cn;
    private static long da;
    private static int cw;
    private static long dv;
    private static int js;
    private static long l;
    private static int jv;
    private static long ey;
    private static long ax;
    private static long al;
    private static long gh;
    private static long jj;
    private static int aj;
    private static int var_int_s;
    private static int hp;
    private static long fo;
    private static int dh;
    private static int fm;
    private static int dk;
    private static int z;
    private static long jo;
    private static long fc;
    private static long gm;
    private static int jy;
    private static long ih;
    private static int kt;
    private static long ha;
    private static long hd;
    private static long hk;
    private static String[] var_java_lang_String_arr_a;
    private static int co;
    private static int cy;
    private static long ei;
    private static long cm;
    private static int gs;
    private static int dp;
    private static long fn;
    private static int ej;
    private static long fr;
    private static long fu;
    private static long je;
    private static long go;
    private static int dl;
    private static int cz;
    Long var_java_lang_Long_a;
    private static long ia;
    private static int fw;
    private static int io;
    private static int ii;
    private static int bx;
    private static long ft;
    private static int jp;
    private static int cfr_renamed_1;
    private static int ke;
    private static long fl;
    private static long ek;
    private static int du;
    private static int jm;
    private static long ew;
    private static int var_int_b;
    private static int au;
    private static long dd;
    private static long gw;
    private static int hi;
    private static long kh;
    private static int cl;
    private static long ao;
    private static long az;
    private static int cr;
    private static int de;
    private static long dn;
    private static int w;
    private static int dw;
    private static int cf;
    private static int jk;
    private static int var_int_f;
    private static int d;
    private static long gr;
    private static int ex;
    private static int ca;
    private static int ba;
    final NLoginCore_335 var_com_nickuc_login_NLoginCore_335_a;
    private static int ks;
    private static int aq;
    private static long kc;
    private static long hv;
    private static long kk;
    private static int hs;
    private static long cj;
    private static long fz;
    private static int ji;
    private static int j;
    private static int it;
    private static int dy;
    private static int fy;
    private static int cq;
    private static long ef;
    private static int gp;
    private static long ch;
    private static long jq;
    private static long dx;
    private static long fh;
    private static int fd;
    private static long ko;
    private static long ge;
    private static long fi;
    private static int ev;
    private static int y;
    String var_java_lang_String_r;
    private static long ab;
    private static int hz;
    private static int iw;
    private static int n;
    private static long cu;
    private static long cfr_renamed_0;
    private static int ct;
    private static long hg;
    private static int kg;
    private static long iy;
    private static long eo;
    private static int em;
    private static int il;
    private static int ac;
    private static int fv;
    private static long di;
    private static int gb;
    private static long is;
    private static long ie;
    private static int av;
    private static int hb;
    private static long bp;
    private static long hj;
    private static long ah;
    private static int ae;
    private static int he;
    private static int x;
    private static int var_int_r;
    private static long in;
    private static int eg;
    private static int en;
    private static long jw;
    private static int var_int_c;
    private static int bb;
    private static int fs;
    private static long ka;
    private static long k;
    private static int iz;
    private static long fq;
    private static int hl;
    private static long hx;
    private static long jz;
    private static long eh;
    private static long fk;
    private static int hc;
    private static int gv;
    private static long ht;
    private static long iu;
    private static long es;
    private static long fx;
    private static int cd;
    private static long ce;
    private static int db;
    private static int m;
    private static int p;
    private static int im;
    private static int bt;
    private static long gk;
    private static long cx;
    private static long cs;
    private static int ai;
    private static long at;
    private static long ic;
    private static int gn;
    private static int ho;
    private static int hr;
    private static long ap;
    private static String[] var_java_lang_String_arr_b;
    private static int ay;
    private static int ds;
    private static int kd;
    private static int id;
    private static int gy;
    private static long jx;
    private static long dc;
    private static int e;
    private static long cc;
    private static long ja;
    private static int o;
    private static long jr;
    private static int jf;
    private static int u;
    private static int ci;
    private static int er;
    private static long ag;
    private static int h;

    public synchronized void B() {
        this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)be, (long)bf), (Object)(bg != 0));
    }

    @Generated
    public UUID getBedrockId() {
        return this.var_java_util_UUID_b;
    }

    @Generated
    public UUID getMojangId() {
        return this.var_java_util_UUID_a;
    }

    synchronized void a(String string, boolean bl) {
        this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)(cn & co), (long)cp), (Object)(cq != 0));
        this.var_java_lang_String_s = bl ? BCryptHashProvider.com_nickuc_login_NLoginCore_566_b().w(string) : string;
    }

    public synchronized boolean t() {
        return (this.var_java_util_UUID_a != null || this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)j, (long)(k ^ l)), m != 0) != false ? n : o) != 0;
    }

    @Generated
    public NLoginCore_407 com_nickuc_login_NLoginCore_407_a() {
        return this.var_com_nickuc_login_NLoginCore_407_a;
    }

    @Generated
    public NLoginCore_335 com_nickuc_login_NLoginCore_335_a() {
        return this.var_com_nickuc_login_NLoginCore_335_a;
    }

    public synchronized void E() {
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺀", (int)bo, (long)(bp ^ bq)));
    }

    public synchronized boolean boolean_A() {
        if (this.s()) {
            return br != 0;
        }
        switch (this.com_nickuc_login_NLoginCore_229_a().ordinal()) {
            case 0: {
                return (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() || !NLoginCore_370.var_com_nickuc_login_NLoginCore_329_p.ar() ? bs : bt) != 0;
            }
            case 2: {
                return (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_k.ar() || !NLoginCore_370.var_com_nickuc_login_NLoginCore_329_l.ar() ? bu : bv) != 0;
            }
        }
        return bw != 0;
    }

    public synchronized void void_x() {
        this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)ar, (long)(as ^ at)), (Object)(au != 0));
    }

    public synchronized void C() {
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺀", (int)(bh & bi), (long)bj));
    }

    @Generated
    public long long_b() {
        return this.var_long_f;
    }

    public synchronized boolean v() {
        return (!this.boolean_h() || this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)u, (long)v), w != 0) != false ? x : y) != 0;
    }

    public synchronized boolean s() {
        return (this.var_java_lang_String_s != null ? h : i) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(ForceRegisterConfig.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.B("ƍƯƱƑƵǔǌǢǎƝǛǑǟǙƢǇǩǨǠǦǠƵ", (byte)115, 66), ForceRegisterConfig.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծःअ࣫ँंऌऀऀւ", (byte)115, 69) + string + NLoginCore_027.C("Ո", (byte)115, 67) + methodType.toString(), exception);
        }
    }

    public synchronized boolean boolean_x() {
        return this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)af, (long)(ag ^ ah)), ai != 0);
    }

    public synchronized boolean boolean_z() {
        return this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)an, (long)(ao ^ ap)), aq != 0);
    }

    public synchronized NLoginCore_229 com_nickuc_login_NLoginCore_229_a() {
        return this.a(var_int_a != 0);
    }

    public synchronized void a(String string, String string2, @Nullable String string3, String string4, boolean bl) {
        long l;
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException((String)ForceRegisterConfig.c("㺀", (int)cr, (long)cs));
        }
        if (bl && (string2 == null || string2.isEmpty())) {
            throw new IllegalArgumentException((String)ForceRegisterConfig.c("㺃", (int)ct, (long)cu));
        }
        this.var_java_lang_String_r = string;
        if (string4 != null) {
            this.var_java_lang_String_t = string4;
        } else if (this.var_java_lang_String_t == null) {
            this.var_java_lang_String_t = ForceRegisterConfig.c("㺆", (int)(cv & cw), (long)cx);
        }
        if (this.var_java_util_UUID_c == null && !this.u()) {
            this.a(NLoginCore_432.d(string));
        }
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺉", (int)(cy & cz), (long)da));
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺌", (int)db, (long)(dc ^ dd)));
        this.var_long_g = l = System.currentTimeMillis();
        this.var_long_f = l;
        this.a(string3 != null ? string3 : string2, (bl && string3 == null ? de : df) != 0);
    }

    public synchronized String java_lang_String_h() {
        if (this.var_java_lang_String_r == null || !NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            return this.var_java_lang_String_r;
        }
        switch (this.com_nickuc_login_NLoginCore_229_a().ordinal()) {
            case 0: {
                return BCryptHashProvider.g(this.var_java_lang_String_r, var_int_b != 0);
            }
            case 1: 
            case 3: {
                return BCryptHashProvider.g(this.var_java_lang_String_r, var_int_c != 0);
            }
        }
        return this.var_java_lang_String_r;
    }

    @Generated
    public String k() {
        return this.var_java_lang_String_t;
    }

    private static String a(int n, long l) {
        l ^= 0x6EL;
        l ^= 0x9C5A27017F8F8BB7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(2 + 67), (byte)(46 + 37), (byte)(31 + 16), (byte)(10 + 57), 66, (byte)(8 + 59), (byte)(41 + 6), (byte)(34 + 46), (byte)(12 + 63), (byte)(31 + 36), (byte)(9 + 74), (byte)(41 + 12), (byte)(47 + 33), (byte)(72 + 25), (byte)(69 + 31), 100, (byte)(85 + 20), (byte)(80 + 30), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(44 + 39)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.C("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փࣱ࣐ࣦࣨ࣪ࣧࣥࣥ", (byte)117, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            ForceRegisterConfig.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public Long java_lang_Long_a() {
        return this.var_java_lang_Long_a;
    }

    public synchronized NLoginCore_229 a(boolean bl) {
        if (bl ? this.var_java_util_UUID_a != null : this.t()) {
            return NLoginCore_229.var_com_nickuc_login_NLoginCore_229_a;
        }
        if (bl ? this.var_java_util_UUID_b != null : this.u()) {
            return NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c;
        }
        if (this.s()) {
            return NLoginCore_229.var_com_nickuc_login_NLoginCore_229_b;
        }
        return NLoginCore_229.var_com_nickuc_login_NLoginCore_229_d;
    }

    private static void void_b() {
        int n;
        var_long_c = 5082829004332673919L;
        long l = var_long_c ^ 0x9C5A27017F8F8BB7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(67 + 2), (byte)(73 + 10), (byte)(2 + 45), 67, (byte)(22 + 44), (byte)(14 + 53), (byte)(36 + 11), (byte)(30 + 50), (byte)(57 + 18), (byte)(20 + 47), (byte)(73 + 10), (byte)(42 + 11), (byte)(69 + 11), (byte)(12 + 85), 100, (byte)(78 + 22), (byte)(45 + 60), (byte)(47 + 63), (byte)(67 + 36)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(61 + 8), 83}, StandardCharsets.UTF_8));
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
                    ForceRegisterConfig.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ƒƽǌǏƨƞƝǁƿƽƶƵǨƾǣǂƸǚƸǁưǙƫǞǦǍǶƿǭǥǐƷ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[1] = NLoginCore_076.D("՘ռևՁրՑՙսշլ։բ֍և֋մՋՑաէնփըՒ՜Տծծցմկ֙", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[2] = NLoginCore_138.B("ưǔǟƙǘƩƱǕǏǄǣǔƽƹǛǛǣƺǜƦƢǩǩǡǔǥǵǤǣǃǹǱ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[3] = NLoginCore_427.A("ưǐƞǇƝƝƙǜƮǁƶǄǖƣǗǡƬƽƮǢƾǬǚǑǱǥǆǁƴǰƺǧ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[4] = NLoginCore_451.C("ԺեմշՐՆՅթէե՞ռ֋ֈւս՝բցՒց֙՗ֆՒյ֟՝՗կ֊֕֞֍՝֠ճ֊զվբ֠եճ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[5] = NLoginCore_027.A("ǘǜǊǝưǛơƺƠƣƻǐƨƻǇƸƻǣǮƧƩǟƯǆƿǟǲǧǒǇǈƱ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ԺեմշՐՆՅթէե՞ռ֋ֈւս՝բցՒց֙՗ֆՒյ֟՝՗կ֊֕֞֍՝֠ճ֊զվբ֠եճ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[7] = NLoginCore_223.A("ƒƽǌǏƨƞƝǁƿƽƶǔǣǠǚǕƵƺǙƪǙǱƯǞƪǍǷƵƯǇǢǭǶǥƵǸǋǢƾǖƺǸƽǋ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[8] = NLoginCore_223.B("ƒƽǌǏƨƞƝǁƿƽƶƵǨƾǣǂƸǚƸǁưǙƫǞǦǍǶƿǭǥǐƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[9] = NLoginCore_575.E("՝ֈ֚֗ճթը֌֊ֈցրֳ։֮֍փ֥փ֌ջ֤նֱׁ֩֘֊ְָ֛ւ", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[10] = NLoginCore_575.A("ưǐƞǇƝƝƙǜƮǁƶǄǖƣǗǡƬƽƮǢƾǬǚǑǱǥǆǁƴǰƺǧ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[11] = NLoginCore_446.D("՘ոՆկՅՅՁքՖթ՞լվՋտ։ՔեՖ֊զ֔ւչ֙֍ծթ՜֘բ֏", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[12] = NLoginCore_223.A("ǘǜǊǝưǛơƺƠƣƻǐƨƻǇƸƻǣǮƧƩǟƯǆƿǟǲǧǒǇǈƱ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[13] = NLoginCore_091.D("րքղօ՘փՉբՈՋգոՐգկՠգ֋֖ՏՑև՗ծէև֚֏պկհՙ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[14] = NLoginCore_201.C("ՍՎհցմՀՀրշռժ֏՛֏օ՞յփՎֆ՘ժպկճ֖֐ճջր֛֐խ֚֓֏՞֦֢֛֞֔ըփզ֥խ֭քֱָ֪֥֒֫֔֩֫ս֓չֱսׁպ֤֪֖֡֯֒ց׍֛׃ֻ֭֊֏בֱֲֵָּֿׁ֦ׄ֩זמהההֺד֛וֽ֢ׅ֠שפ׊לֳ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[15] = NLoginCore_559.E("սյցջէց֬ժ֤֊֐ի֜֔֕յ֋շկմֺ֯ցւ", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[16] = NLoginCore_324.D("ԻԻզՕտժՙՇեՉՍգգևըՍքլՍենա՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[17] = NLoginCore_091.F("վև֡֊ւժզֱ֟֩֎հծֱ֒֫հ֬֡֎ֳַ֖֛֩֨֋ֹ֣տք׀־ֻ֤֩֨վֆׇ׋׏ֱֲ֞׊ִ֪֬֡א׉׊ּלֱֲָ׋זֵֵֹ֣֞֡֝֠֟׊ר׫׌כן׏׫ׇ׭װהאװפֳַ׈ִ׾׹׿כ׬׽י؄׏׈׳מ׃׸׭׊ؐ؅؏ז", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[18] = NLoginCore_559.A("ƲƪƶưƜƶǡƟǙƿǅƠǑǉǊƪǀƬƤƩǤǯƶƷ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[19] = NLoginCore_324.E("՞՞։ո֢֍ռժֈլհֆֆ֪֋հ֧֏հֈ֙քցւ", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[20] = NLoginCore_092.A("ƕƏƙǕǔƵǟǖǗƾǅǖƿƵƼƩƴƬǛǬǱǂǤƭǧǤǌƵƯǣǵǳ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[21] = NLoginCore_091.B("ǄǚƷƲƱƴƸǌǣǒǢǟƤǛǝǁǔǇǝǰǜƺǱƾƳǮǏǑƸǂǉǪǲǉǏǑǓǢǟǹǐǑǺǄȅǒǺǺȇƿǙǍǪǿǖǗ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[22] = NLoginCore_201.A("ǛƚƷǋǓǓƢƢǔƷƱƢƟǧǒǦƿǣǘƭǜǛǪǏǠǃǯǨǍƫǉƶǎǖǮǨǮǳǏǽǿǓȂǺǔǥǙǇǭǞȍǍȌǙǖǗ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[23] = NLoginCore_446.F("ջնճ֪ջը֖֬ը֚ծ֒֜կ֔֡նւ֪֣֚քցւ", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[24] = NLoginCore_076.B("ưǔǟƙǘƩƱǕǏǄǣǔƽƹǛǛǣƺǜƦƢǩǩǡǔǥǵǤǣǃǹǱ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[25] = NLoginCore_027.E("ջ֪֟դ֣մռ֚֠֏֬օְ֪֮֗ծմք֊֦֙֋յտղּ֑֑֤֗֒", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[26] = NLoginCore_076.D("փՐկկՑՓՄԽմՈ՘֍չիտսփվՒ֘ւձ՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[27] = NLoginCore_201.F("ցփտըդ֦րֈս֯օն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[28] = NLoginCore_004.E("֧ե֝և֌֝֬լ։֫սն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[29] = NLoginCore_091.C("ո՛ՙք՝Ձօպ՟ՉզՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[30] = NLoginCore_324.F("ւա֕ջ֫֕ը֤֡ևըն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[31] = NLoginCore_201.D("Կբղդշ֊օչս֎բՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[32] = NLoginCore_575.A("ƷƖǊưǠǊƝǙǖƼƝƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[33] = NLoginCore_138.B("ƗƺǊƼǏǢǝǑǕǦƺƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[34] = NLoginCore_092.B("ƷƖǊưǠǊƝǙǖƼƝƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[35] = NLoginCore_451.E("բօ֕ևֱ֚֭֨֜֠օն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[36] = NLoginCore_173.E("ւա֕ջ֫֕ը֤֡ևըն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[37] = NLoginCore_451.C("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[38] = NLoginCore_453.E("֑֚֞֕շ֋֧֯ժ֩սն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[39] = NLoginCore_387.D("ւԿՑֆԿճ՗ջլՕժՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[40] = NLoginCore_092.D("՟Ծղ՘ֈղՅցվդՅՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[41] = NLoginCore_575.B("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[42] = NLoginCore_138.E("֑֚֞֕շ֋֧֯ժ֩սն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[43] = NLoginCore_201.E("֥բմ֩բ֖պ֞֏ո֍ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[44] = NLoginCore_384.B("ƷƖǊưǠǊƝǙǖƼƝƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[45] = NLoginCore_076.C("ւԿՑֆԿճ՗ջլՕժՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[46] = NLoginCore_091.B("ƷƖǊưǠǊƝǙǖƼƝƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[47] = NLoginCore_223.E("֥բմ֩բ֖պ֞֏ո֍ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[48] = NLoginCore_027.A("ƷƖǊưǠǊƝǙǖƼƝƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[49] = NLoginCore_173.B("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[50] = NLoginCore_138.F("֑֚֞֕շ֋֧֯ժ֩սն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[51] = NLoginCore_027.A("ǚƗƩǞƗǋƯǓǄƭǂƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[52] = NLoginCore_453.D("՟Ծղ՘ֈղՅցվդՅՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[53] = NLoginCore_446.D("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[54] = NLoginCore_223.A("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[55] = NLoginCore_575.A("ǚƗƩǞƗǋƯǓǄƭǂƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[56] = NLoginCore_091.C("՟Ծղ՘ֈղՅցվդՅՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[57] = NLoginCore_427.D("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[58] = NLoginCore_451.D("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[59] = NLoginCore_575.A("ƪƫǚƮǞƪǐƚǗƛƮǨǙǔǤǬƞƣƬǤǏǟƶƷ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[60] = NLoginCore_446.D("՟Ծղ՘ֈղՅցվդՅՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[61] = NLoginCore_451.C("խՎչ՚աձ֊մ՚ևՇ֐՝՜֏բէնքձւև՞՟", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[62] = NLoginCore_324.A("ƔƪƮǟǜƘƢƱǢǛǔƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[63] = NLoginCore_091.C("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[64] = NLoginCore_427.E("կշշըֆժէ֡ք֛֞ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[65] = NLoginCore_559.F("կշշըֆժէ֡ք֛֞ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[66] = NLoginCore_453.C("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[67] = NLoginCore_384.C("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[68] = NLoginCore_223.C("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[69] = NLoginCore_387.D("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[70] = NLoginCore_201.B("ƤƬƬƝƻƟƜǖƹǓǐƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[71] = NLoginCore_201.D("ՌՔՔՅգՇՄվաջոՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[72] = NLoginCore_091.F("կշշըֆժէ֡ք֛֞ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[73] = NLoginCore_223.B("ǉǗƨǏƝǊƔƣƖƣǦǐƻƽƽƦƬƾƦǡǣǉƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[74] = NLoginCore_027.D("ՂՀփ՚Կշբ։ՇէքՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[75] = NLoginCore_027.E("էդա֘թթ֖֬տ֥֟ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[76] = NLoginCore_092.D("ՄՁԾյՆՆճ։՜ւռՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[77] = NLoginCore_324.E("էդա֘թթ֖֬տ֥֟ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[78] = NLoginCore_384.C("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[79] = NLoginCore_076.D("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[80] = NLoginCore_384.B("ƔǚǉƾǁƙǖǤƚƭƾƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[81] = NLoginCore_173.A("ƴǒƸǔƞǀƝƫǔǤƲƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[82] = NLoginCore_201.C("՜պՠռՆըՅՓռ֌՚Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[83] = NLoginCore_091.D("ՂՀփ՚Կշբ։ՇէքՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[84] = NLoginCore_559.C("ջծշղՔըք֌Շֆ՚Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[85] = NLoginCore_138.A("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[86] = NLoginCore_091.D("ՄՁԾյՆՆճ։՜ւռՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[87] = NLoginCore_201.B("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[88] = NLoginCore_201.B("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[89] = NLoginCore_324.A("ƜƙƖǍƞƞǋǡƴǚǔƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[90] = NLoginCore_446.F("֑֚֞֕շ֋֧֯ժ֩սն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[91] = NLoginCore_324.A("ǓǆǏǊƬǀǜǤƟǞƲƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[92] = NLoginCore_138.E("ո֙֨ո֭֡֔֍֞֫լն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[93] = NLoginCore_446.B("ưƫƨǟưƝǡǋƝǏƣǇǑƤǉǖƫƷǟǏǘƹƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[94] = NLoginCore_201.E("ջնճ֪ջը֖֬ը֚ծ֒֜կ֔֡նւ֪֣֚քցւ", (byte)114, 69);
                    continue block7;
                }
                case 1: {
                    ForceRegisterConfig.var_java_lang_String_arr_b[0] = NLoginCore_223.E("՝ֈ֚֗ճթը֌֊ֈցրֳ։֮֍փ֥փ֌ջֺ֚ռ֭֨ս֬֙ւ֘֞", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[1] = NLoginCore_223.C("՘ռևՁրՑՙսշլ։բ֍և֋մՋՑաէնչձ֏ըՏ֏՘֟ղր֞֎֠֐փ֩չ֋վ՞֠թճ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[2] = NLoginCore_575.C("՘ռևՁրՑՙսշլ֋ռեափփ֋բքՎՊ֖ձմ֋֜ֆխխ֏՝ՠ֡֒՘ճ֝օչփ֖ն֨ճ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[3] = NLoginCore_201.C("՘ոՆկՅՅՁքՖթ՞լվՋտ։ՔեՖ֊զ֖ֆև֗֕Օ֔֋ճչռ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[4] = NLoginCore_223.F("՝ֈ֚֗ճթը֌֊ֈց֥֮֟֫֠րօ֤յּ֤պ֩յׂ֘րպֳָֽ֥֭֒֓ֈ֤׈ֻ֣֖֗ׄ", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[5] = NLoginCore_027.D("րքղօ՘փՉբՈՋգոՐգկՠգ֋֖ՏՑ֎֙Ֆ֖Փ֚֜՞ղ֛ւ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[6] = NLoginCore_091.B("ƒƽǌǏƨƞƝǁƿƽƶǔǣǠǚǕƵƺǙƪǙǱƯǞƪǍǷƵƯǇǢǭƶǜƹǈǛǰǒǫǏǁǁǋ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[7] = NLoginCore_027.D("ԺեմշՐՆՅթէե՞ռ֋ֈւս՝բցՒց֙՗ֆՒյ֟՝՗կ֊֕ո֢՞դև֪֡ց֞֋խճ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[8] = NLoginCore_027.B("ƒƽǌǏƨƞƝǁƿƽƶƵǨƾǣǂƸǚƸǁưǌƬǭǭǕǍǒǌǗưǉ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[9] = NLoginCore_324.F("՝ֈ֚֗ճթը֌֊ֈցրֳ։֮֍փ֥փ֌ջֱֲִ֪֖֢֖֥֚֬֜", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[10] = NLoginCore_384.B("ưǐƞǇƝƝƙǜƮǁƶǄǖƣǗǡƬƽƮǢƾǬƽǀǥǫƯǨǴǈǙǫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[11] = NLoginCore_091.F("ջ֛թ֒ըըդ֧չ֌ց֏֡ծ֢֬շֈչ֭։֪ֆֈտ֛֖֍ַֻ֑׀֡֓րׁ֖׋֋ֽ֬֬׃֖", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[12] = NLoginCore_223.A("ǘǜǊǝưǛơƺƠƣƻǐƨƻǇƸƻǣǮƧƩǬǍǭǨǇƴƶǗǌƺǩ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[13] = NLoginCore_138.A("ǘǜǊǝưǛơƺƠƣƻǐƨƻǇƸƻǣǮƧƩǠǚǅǪǅǟƱǘǖǫǻƴǔǮǞǘȀǞǟǸǖƽǋ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[14] = NLoginCore_201.B("ƥƦǈǙǌƘƘǘǏǔǂǧƳǧǝƶǍǛƦǞưǂǒǇǋǮǨǋǓǘǳǨǅǲǫǧƶǶǾǬǺǳǀǛƾǽǅȅǜȂȉǪȃǬȁȐȃǽǕǫǑȉǕșǒǼǹȇǪȂǮǙȥǳțȅȓǢǧȩȉȊȗȐǾșȜȔȁȍȮȶȬȬȬȒǲȇǼȘǽșȖȳɃȂȻȂȥȳȃȟȢɍɁȇɏșȖȗ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[15] = NLoginCore_027.B("ƲƪƶưƜƶǡƟǙƿǂǢǨǟơƨƣƩƺƻǈǉƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[16] = NLoginCore_091.F("՞՞։ո֢֍ռժֈլգթ֍֡֫ճ֓ոքֺֺ֜ցւ", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[17] = NLoginCore_223.D("՛դվէ՟ՇՃռֆ֎իՍՋ֎կֈՍ։վիճ֔֐ֆոօը֖ր՜ա֛֝ցֆ֘օ՛գ֤֨֬֏֎ջ֧։վ֑ևֹ֦֧֭֙֏֕֎ֳ֨ջվպս֒րռ֖֧ׅ֒׈ָּ֩֬׈֤׊׍ֱ֭׍ׁ֐֥֑֔כזלָ׉ךֶס֟׍בןּיַ֤ף֦֟ׯפּ׃׆ְֽעפװׁ־ֿ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ƲƪƶưƜƶǡƟǙƿǅǖƟƥǩǫǤǭǍǏǣǯƭǝǧǂǕǃǀƳǇǮ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[19] = NLoginCore_138.B("ƓƓƾƭǗǂƱƟƽơƘǙǔƳǙǂǛǛǣƸƦƹƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[20] = NLoginCore_027.D("ԽԷՁսռ՝ևվտզխվէ՝դՑ՜Քփ֔֙բՖկքյէ֋՝վ֕գխ֛֞ֈ՞բ֘ս֍֢ֆճ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[21] = NLoginCore_004.D("լւ՟՚ՙ՜ՠմ֋պ֊ևՌփօթռկօ֘քբ֙զ՛֖շչՠժձ֚֒ձշչջ֊և֡ոչ֠ըսֳ֑֤֬֌֩֔ցַվտ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[22] = NLoginCore_138.D("փՂ՟ճջջՊՊռ՟ՙՊՇ֏պ֎է֋րՕքփ֒շֈի֗֐յՓձ՞նվ֖֐֖֛շ֥֧ջ֩օ֠ս֫ֆֲ֔ձַ֣֕վտ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[23] = NLoginCore_091.C("՘ՓՐև՘Յ։ճՅշՋէգ՜ծտրե֑թհձ՞՟", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[24] = NLoginCore_201.B("ưǔǟƙǘƩƱǕǏǄǣǔƽƹǛǛǣƺǜƦƢǧǫǡǮưƾƵǆǔǶǅǤǲǸǋǱǋƽǓǗƾǸǋ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[25] = NLoginCore_324.A("ưǔǟƙǘƩƱǕǏǄǡƺǥǟǣǌƣƩƹƿǎǜƾǅƴǝǠƭǷǌǫǕƸǪǔǏǹǶǭǣǞǙǞǋ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[26] = NLoginCore_027.A("ǛƨǇǇƩƫƜƕǌƠƯǨƦƥǂǓƴƦƪƧǀǟƶƷ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[27] = NLoginCore_384.D("Սռ՗ֆօ։ն՟ֈեՎչհՐւժխ՝մ֊յև՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[28] = NLoginCore_324.A("ǎǐƛƮƿƙƷƹƶƱǟƯǈƺǫǈǢǟƼƻǁǟƶƷ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[29] = NLoginCore_384.F("֚ք֝ր՝ըքՠ֧ջցն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[30] = NLoginCore_092.C("պգՁդՁՃդֈթՕծՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[31] = NLoginCore_223.A("ƭƫǈǕǖƪƢǚǘǜǔƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[32] = NLoginCore_387.F("ա֓֝֟յժ֞ցէպցն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[33] = NLoginCore_027.D("քՀՒէաօա՛Ջՠտցձ։՟թ՜դհ֌բ֗՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[34] = NLoginCore_091.F("ց֦վ֊թֆպշջ֤։ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[35] = NLoginCore_027.A("ƳǛǊƾƶƿƹƷƼƝƶƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[36] = NLoginCore_384.D("Զփ՘զջմռ։՟թ֌Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[37] = NLoginCore_091.E("֘ճ֘ֆ֚և֙֘ք֙հն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[38] = NLoginCore_453.F("֑ֆշ֊֠չ֥֚ո֢լն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[39] = NLoginCore_451.D("Ժզ՝ՒւՠսյֈՕրՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[40] = NLoginCore_138.A("ǇƚưǊǟƗǊǓƬǂƾƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[41] = NLoginCore_091.D("ԺՅՁդըաՉԽՕ֌րՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[42] = NLoginCore_451.E("տր֕ւ֗յ֩լ֢֛լն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[43] = NLoginCore_384.B("ƺƴƵƬǟǀǂƺǘƹǘƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[44] = NLoginCore_324.E("֨ռօմ֗֊֭չ֧ռ֍ն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[45] = NLoginCore_201.B("ǊƗƙƚƽǡƮƢǡǆǠƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[46] = NLoginCore_451.F("է՟չթ֋֦լքւժօն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[47] = NLoginCore_559.F("֜բ֧ֆյֈֈո֧֐֣ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[48] = NLoginCore_138.B("ƹǜǇƞǛǑƸǁƠƯǔƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[49] = NLoginCore_138.A("ǓǆǛưǒǀƱƺǞǑǜƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[50] = NLoginCore_223.A("ƨƽƯǖƪǝǋǔƤǐƝƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[51] = NLoginCore_575.D("Սՠ՗ջՄՁդօժյֈՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[52] = NLoginCore_427.F("֥֘։֥֥֟լշլևչն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[53] = NLoginCore_076.D("ւզղֆՂԿֆփ֌ՋֈՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[54] = NLoginCore_027.C("՝Րչց՟՜Ք՚Ջ՜֌Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[55] = NLoginCore_076.E("յֈ֝ն֪ն֚֩և֛չն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[56] = NLoginCore_091.B("ǏǛƳǒǏƭǠƜǝǑǔƙǃǟǛƽǡǛǤǙǇƹƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[57] = NLoginCore_559.D("՚՛ւՕֈՄՊՔնըոՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[58] = NLoginCore_387.B("ǊǓƭǞƼǜǃƶǠƳƾƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[59] = NLoginCore_027.B("ƪƫǚƮǞƪǐƚǗƛƱǒƱǑƻǘǙǮǀƭǠǉƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[60] = NLoginCore_201.E("ղցտփռ֪֢֚սֈ֨ր֮֬֋֕ւֳִֵ֑֔ցւ", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[61] = NLoginCore_138.F("֐ձ֜սք֭֔֗ս֪թղր֍իմ֍֒֏լչ֪֧։֝ս֞֎ׂ֙֜փ", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[62] = NLoginCore_451.B("ƘǆƩƹƖƮƘǄƿǎǟǨƦǥǔǓǘǢǥǉǟǟƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[63] = NLoginCore_027.D("՘հղէջՂՓվ֍ի֌֋՛֎ՌՏձվշֈծձ՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[64] = NLoginCore_324.F("ձդֈտ֟բտ֎֋ջսն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[65] = NLoginCore_559.F("՞պ֖֖տ֛֚֨֘֠լն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[66] = NLoginCore_387.B("ƹǈƩƳƲƭƫƻǢǚǥƼƢǞǥǃǢǡƮơǫǉƶƷ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[67] = NLoginCore_138.D("ՖպՐ՛ՇՔՓդՄՇ։եգՑ֓֔֒ժ֓Վ՘֗՞՟", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[68] = NLoginCore_223.A("ƼǉƗƨƯǝƿƳǛƺǐƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[69] = NLoginCore_451.C("օ՚՟՚ՓՒգԽփ֋ՀՇֆ֑ժսՆՕ֑իՊև՞՟", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[70] = NLoginCore_091.C("ՕֆԽՅդՃ՟գսևքՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[71] = NLoginCore_004.F("ջ֢ղժք֣֛֘֨խ։ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[72] = NLoginCore_223.A("ǌǞƫǞƞǟƳƲǌǆƲƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[73] = NLoginCore_027.E("֢֔ճ֚ը֕՟ծածֲ֫ժւֶծ֦֕֫ճֲ֔ցւ", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[74] = NLoginCore_223.A("ǉƹǎƚǀǕơƽƷƳǜƫ", (byte)114, 65);
                    ForceRegisterConfig.var_java_lang_String_arr_b[75] = NLoginCore_384.E("ձ՟֒֡չ֍֢֫լըըն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[76] = NLoginCore_004.B("ǆƯƐǔƗƸǞƱƭƗǐƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[77] = NLoginCore_076.D("՗Ւմ՟Ք։ՆբՕի՚Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[78] = NLoginCore_091.F("յբ֦֗ր֢֝֕֠ծ֫ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[79] = NLoginCore_559.B("ǘǔƐǏƝǂƙƻƮƷǐƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[80] = NLoginCore_427.B("ƒǓǞǝǜƻƬƶƯǚƾƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[81] = NLoginCore_324.F("֟րջ֟բ֢դծ֟ըց֏֞֠֬մքփ֐պֺ֘ցւ", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[82] = NLoginCore_027.E("֝֘՛֓֌։֢֬֊իլն", (byte)114, 69);
                    ForceRegisterConfig.var_java_lang_String_arr_b[83] = NLoginCore_027.D("ււքՁք։էւչն՞Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[84] = NLoginCore_092.D("նռԼդփՔ֊։ցՉբՓ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[85] = NLoginCore_027.C("՘՞ՐօօօթեշՠՖՓ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[86] = NLoginCore_559.B("ƺǏƲƺƳǝǕǟƵƸƥƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[87] = NLoginCore_092.D("Օճ՛չ՞ևԼ՞ժՌ֌Փ", (byte)114, 68);
                    ForceRegisterConfig.var_java_lang_String_arr_b[88] = NLoginCore_092.F("ջ֞֔քր֖ւ֞տր֧ն", (byte)114, 70);
                    ForceRegisterConfig.var_java_lang_String_arr_b[89] = NLoginCore_575.B("ǌƖǜǇƗǡǂǢƤƼƲƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[90] = NLoginCore_091.B("ǘǏưƗƹǚƯǡƸǢƥƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[91] = NLoginCore_091.C("պշով՚Ֆոցմպ՚Փ", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[92] = NLoginCore_091.B("ǎƷǆǙưưƝƱƻǖǤƫ", (byte)114, 66);
                    ForceRegisterConfig.var_java_lang_String_arr_b[93] = NLoginCore_575.C("՘ՓՐև՘Յ։ճՅշՉշչձ֍ՌՐ֐Տ֎֊֗՞՟", (byte)114, 67);
                    ForceRegisterConfig.var_java_lang_String_arr_b[94] = NLoginCore_091.F("ջնճ֪ջը֖֬ը֚խծְ֪֪֖֞֡֯֙֎ֺցւ", (byte)114, 70);
                    continue block7;
                }
                case 2: {
                    ForceRegisterConfig.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ƼƜƗǟǛƽǋǁǢưƞǗǖǓǃƹǜƣƫǜǏǉƶƷ", (byte)114, 66);
                    continue block7;
                }
                case 4: {
                    ForceRegisterConfig.var_java_lang_String_arr_b[0] = NLoginCore_324.E("է֙֕յթ֨լպօս֐ս֌֩֍֕օִ֣֪֪֗ցւ", (byte)114, 69);
                }
            }
        }
    }

    public synchronized void a(UUID uUID) {
        this.var_java_util_UUID_c = uUID;
    }

    @Generated
    public String i() {
        return this.var_java_lang_String_r;
    }

    public synchronized void void_y() {
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺀", (int)av, (long)(aw ^ ax)));
    }

    public static ForceRegisterConfig a(String string) {
        ForceRegisterConfig ForceRegisterConfig2 = new ForceRegisterConfig();
        ForceRegisterConfig2.var_java_lang_String_r = string;
        return ForceRegisterConfig2;
    }

    public synchronized boolean boolean_h() {
        return (this.com_nickuc_login_NLoginCore_229_a() != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_d ? var_int_f : var_int_g) != 0;
    }

    @Generated
    ForceRegisterConfig(Long l, String string, UUID uUID, UUID uUID2, UUID uUID3, String string2, String string3, long l2, long l3) {
        this.var_java_lang_String_t = ForceRegisterConfig.c("㺀", (int)km, (long)(kn ^ ko));
        this.var_com_nickuc_login_NLoginCore_407_a = new NLoginCore_407(this);
        this.var_com_nickuc_login_NLoginCore_335_a = new NLoginCore_335(this);
        this.var_java_lang_Long_a = l;
        this.var_java_lang_String_r = string;
        this.var_java_util_UUID_c = uUID;
        this.var_java_util_UUID_a = uUID2;
        this.var_java_util_UUID_b = uUID3;
        this.var_java_lang_String_s = string2;
        this.var_java_lang_String_t = string3;
        this.var_long_f = l2;
        this.var_long_g = l3;
    }

    public synchronized boolean r() {
        return (this.var_java_lang_Long_a != null ? d : e) != 0;
    }

    void G() {
        this.var_java_lang_String_s = null;
        this.var_java_lang_String_t = null;
        if (!this.t() || this.var_java_util_UUID_c != null && !this.var_java_util_UUID_c.equals(this.var_java_util_UUID_a)) {
            this.var_java_util_UUID_a = null;
        }
        this.var_long_f = 0L;
        this.var_long_g = 0L;
        this.var_com_nickuc_login_NLoginCore_407_a.cfr_renamed_2.clear();
        this.var_com_nickuc_login_NLoginCore_407_a.var_boolean_z = dg;
        this.var_com_nickuc_login_NLoginCore_335_a.H();
    }

    public synchronized boolean w() {
        return (!this.boolean_h() || this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)(z & aa), (long)ab), ac != 0) != false ? ad : ae) != 0;
    }

    public synchronized void c(UUID uUID) {
        if (uUID != null && uUID.version() != 0) {
            throw new IllegalArgumentException((String)ForceRegisterConfig.c("㺀", (int)cf, (long)(cg ^ ch)) + uUID.version() + (String)ForceRegisterConfig.c("㺃", (int)ci, (long)(cj ^ ck)) + this.var_java_lang_String_r + (String)ForceRegisterConfig.c("㺆", (int)cl, (long)cm) + uUID);
        }
        this.var_java_util_UUID_b = uUID;
    }

    public synchronized void void_A() {
        this.var_com_nickuc_login_NLoginCore_407_a.void_d((String)ForceRegisterConfig.c("㺀", (int)bb, (long)(bc ^ bd)));
    }

    public synchronized void b(UUID uUID) {
        if (uUID != null && uUID.version() != bx) {
            throw new IllegalArgumentException((String)ForceRegisterConfig.c("㺀", (int)by, (long)bz) + uUID.version() + (String)ForceRegisterConfig.c("㺃", (int)ca, (long)(cb ^ cc)) + this.var_java_lang_String_r + (String)ForceRegisterConfig.c("㺆", (int)cd, (long)ce) + uUID);
        }
        this.var_java_util_UUID_a = uUID;
    }

    public synchronized void D() {
        this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)(bk & bl), (long)bm), (Object)(bn != 0));
    }

    static {
        var_int_a = 0 >>> 247 | 0 << -247;
        var_int_b = 4 >>> 130 | 4 << ~130 + 1;
        var_int_c = Integer.reverse(0);
        d = 16 >>> 196 | 16 << ~196 + 1;
        e = (0 >>> 131 | 0 << ~131 + 1) & 0xFFFFFFFF;
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        var_int_g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0);
        j = Integer.reverse(0);
        k = Long.reverse(-84246139180969630L);
        l = Long.reverse(0x7600000000000000L);
        m = Integer.reverse(0);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0);
        p = 32 >>> 229 | 32 << -229;
        q = Integer.reverse(0);
        var_int_r = 0 >>> 34 | 0 << ~34 + 1;
        var_int_s = Integer.reverse(Integer.MIN_VALUE);
        var_int_t = (0 >>> 173 | 0 << ~173 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Long.reverse(-8587042235656466078L);
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = 0 >>> 247 | 0 << -247;
        z = Integer.reverse(0x40000000);
        aa = -1 >>> 209 | -1 << -209;
        ab = Long.reverse(-8587042235656466078L);
        ac = Integer.reverse(0);
        ad = 0x100000 >>> 116 | 0x100000 << -116;
        ae = (0 >>> 126 | 0 << -126) & 0xFFFFFFFF;
        af = Integer.reverse(-1073741824);
        ag = Long.reverse(-84246139180969630L);
        ah = Long.reverse(0x7600000000000000L);
        ai = 0 >>> 146 | 0 << -146;
        aj = Integer.reverse(0x20000000);
        ak = Integer.reverse(-1);
        al = Long.reverse(-8587042235656466078L);
        am = Integer.reverse(0);
        an = 327680 >>> 112 | 327680 << -112;
        ao = Long.reverse(-84246139180969630L);
        ap = Long.reverse(0x7600000000000000L);
        aq = Integer.reverse(0);
        ar = 393216 >>> 144 | 393216 << -144;
        as = Long.reverse(-84246139180969630L);
        at = Long.reverse(0x7600000000000000L);
        au = Integer.reverse(Integer.MIN_VALUE);
        av = (0x38000000 >>> 91 | 0x38000000 << ~91 + 1) & 0xFFFFFFFF;
        aw = Long.reverse(-84246139180969630L);
        ax = Long.reverse(0x7600000000000000L);
        ay = Integer.reverse(0x10000000);
        az = Long.reverse(-8587042235656466078L);
        ba = Integer.reverse(Integer.MIN_VALUE);
        bb = 0x120000 >>> 49 | 0x120000 << -49;
        bc = Long.reverse(-84246139180969630L);
        bd = Long.reverse(0x7600000000000000L);
        be = (81920 >>> 13 | 81920 << -13) & 0xFFFFFFFF;
        bf = Long.reverse(-8587042235656466078L);
        bg = Integer.reverse(Integer.MIN_VALUE);
        bh = (0x58000000 >>> 187 | 0x58000000 << -187) & 0xFFFFFFFF;
        bi = (-1 >>> 204 | -1 << -204) & 0xFFFFFFFF;
        bj = Long.reverse(-8587042235656466078L);
        bk = Integer.reverse(0x30000000);
        bl = (-1 >>> 127 | -1 << ~127 + 1) & 0xFFFFFFFF;
        bm = Long.reverse(-8587042235656466078L);
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = -805306368 >>> 156 | -805306368 << -156;
        bp = Long.reverse(-84246139180969630L);
        bq = Long.reverse(0x7600000000000000L);
        br = (0 >>> 26 | 0 << -26) & 0xFFFFFFFF;
        bs = Integer.reverse(Integer.MIN_VALUE);
        bt = Integer.reverse(0);
        bu = 64 >>> 166 | 64 << ~166 + 1;
        bv = (0 >>> 41 | 0 << ~41 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(Integer.MIN_VALUE);
        bx = Integer.reverse(0x20000000);
        by = Integer.reverse(0x70000000);
        bz = Long.reverse(-8587042235656466078L);
        ca = Integer.reverse(-268435456);
        cb = Long.reverse(-84246139180969630L);
        cc = Long.reverse(0x7600000000000000L);
        cd = 0x10000000 >>> 184 | 0x10000000 << ~184 + 1;
        ce = Long.reverse(-8587042235656466078L);
        cf = Integer.reverse(-2013265920);
        cg = Long.reverse(-84246139180969630L);
        ch = Long.reverse(0x7600000000000000L);
        ci = (0x40000002 >>> 125 | 0x40000002 << ~125 + 1) & 0xFFFFFFFF;
        cj = Long.reverse(-84246139180969630L);
        ck = Long.reverse(0x7600000000000000L);
        cl = Integer.reverse(-939524096);
        cm = Long.reverse(-8587042235656466078L);
        cn = Integer.reverse(0x28000000);
        co = -1 >>> 133 | -1 << -133;
        cp = Long.reverse(-8587042235656466078L);
        cq = 0x2000000 >>> 153 | 0x2000000 << ~153 + 1;
        cr = 0x15000000 >>> 120 | 0x15000000 << -120;
        cs = Long.reverse(-8587042235656466078L);
        ct = 11 >>> 31 | 11 << -31;
        cu = Long.reverse(-8587042235656466078L);
        cv = Integer.reverse(-402653184);
        cw = -1 >>> 151 | -1 << ~151 + 1;
        cx = Long.reverse(-8587042235656466078L);
        cy = (0x60000000 >>> 250 | 0x60000000 << -250) & 0xFFFFFFFF;
        cz = Integer.reverse(-1);
        da = Long.reverse(-8587042235656466078L);
        db = Integer.reverse(-1744830464);
        dc = Long.reverse(-84246139180969630L);
        dd = Long.reverse(0x7600000000000000L);
        de = 131072 >>> 177 | 131072 << ~177 + 1;
        df = 0 >>> 82 | 0 << ~82 + 1;
        dg = 32768 >>> 207 | 32768 << ~207 + 1;
        dh = Integer.reverse(0x58000000);
        di = Long.reverse(-84246139180969630L);
        dj = Long.reverse(0x7600000000000000L);
        dk = (0 >>> 138 | 0 << -138) & 0xFFFFFFFF;
        dl = Integer.reverse(-671088640);
        dm = -1 >>> 252 | -1 << -252;
        dn = Long.reverse(-8587042235656466078L);
        cfr_renamed_1 = 14336 >>> 169 | 14336 << ~169 + 1;
        dp = Integer.reverse(-1);
        dq = Long.reverse(-8587042235656466078L);
        dr = Integer.reverse(-1207959552);
        ds = Integer.reverse(-1);
        dt = Long.reverse(-8587042235656466078L);
        du = 122880 >>> 108 | 122880 << -108;
        dv = Long.reverse(-8587042235656466078L);
        dw = 0x7C00000 >>> 22 | 0x7C00000 << ~22 + 1;
        dx = Long.reverse(-8587042235656466078L);
        dy = (1024 >>> 165 | 1024 << ~165 + 1) & 0xFFFFFFFF;
        dz = Long.reverse(-84246139180969630L);
        ea = Long.reverse(0x7600000000000000L);
        eb = 0x210000 >>> 176 | 0x210000 << ~176 + 1;
        ec = Long.reverse(-8587042235656466078L);
        ed = Integer.reverse(0x44000000);
        ee = Long.reverse(-84246139180969630L);
        ef = Long.reverse(0x7600000000000000L);
        eg = (140 >>> 162 | 140 << -162) & 0xFFFFFFFF;
        eh = Long.reverse(-84246139180969630L);
        ei = Long.reverse(0x7600000000000000L);
        ej = (36 >>> 96 | 36 << ~96 + 1) & 0xFFFFFFFF;
        ek = Long.reverse(-84246139180969630L);
        el = Long.reverse(0x7600000000000000L);
        em = -2147483630 >>> 159 | -2147483630 << ~159 + 1;
        en = Integer.reverse(-1);
        eo = Long.reverse(-8587042235656466078L);
        ep = Integer.reverse(0x64000000);
        eq = Long.reverse(-8587042235656466078L);
        er = -2147483629 >>> 255 | -2147483629 << -255;
        es = Long.reverse(-84246139180969630L);
        et = Long.reverse(0x7600000000000000L);
        eu = 320 >>> 131 | 320 << -131;
        ev = Integer.reverse(-1);
        ew = Long.reverse(-8587042235656466078L);
        ex = Integer.reverse(-1811939328);
        ey = Long.reverse(-84246139180969630L);
        ez = Long.reverse(0x7600000000000000L);
        fa = Integer.reverse(0x54000000);
        fb = Long.reverse(-84246139180969630L);
        fc = Long.reverse(0x7600000000000000L);
        fd = (-1342177278 >>> 92 | -1342177278 << -92) & 0xFFFFFFFF;
        fe = Long.reverse(-84246139180969630L);
        ff = Long.reverse(0x7600000000000000L);
        fg = (0x160000 >>> 175 | 0x160000 << -175) & 0xFFFFFFFF;
        fh = Long.reverse(-84246139180969630L);
        fi = Long.reverse(0x7600000000000000L);
        fj = 0xB40000 >>> 210 | 0xB40000 << ~210 + 1;
        fk = Long.reverse(-84246139180969630L);
        fl = Long.reverse(0x7600000000000000L);
        fm = Integer.reverse(0x74000000);
        fn = Long.reverse(-84246139180969630L);
        fo = Long.reverse(0x7600000000000000L);
        fp = Integer.reverse(-201326592);
        fq = Long.reverse(-84246139180969630L);
        fr = Long.reverse(0x7600000000000000L);
        fs = Integer.reverse(0xC000000);
        ft = Long.reverse(-84246139180969630L);
        fu = Long.reverse(0x7600000000000000L);
        fv = Integer.reverse(-1946157056);
        fw = (-1 >>> 222 | -1 << -222) & 0xFFFFFFFF;
        fx = Long.reverse(-8587042235656466078L);
        fy = 0x40000006 >>> 125 | 0x40000006 << ~125 + 1;
        fz = Long.reverse(-84246139180969630L);
        ga = Long.reverse(0x7600000000000000L);
        gb = Integer.reverse(-872415232);
        gc = Long.reverse(-8587042235656466078L);
        gd = Integer.reverse(0x2C000000);
        ge = Long.reverse(-84246139180969630L);
        gf = Long.reverse(0x7600000000000000L);
        gg = (0x6A00000 >>> 117 | 0x6A00000 << ~117 + 1) & 0xFFFFFFFF;
        gh = Long.reverse(-84246139180969630L);
        gi = Long.reverse(0x7600000000000000L);
        gj = (0x60000003 >>> 188 | 0x60000003 << -188) & 0xFFFFFFFF;
        gk = Long.reverse(-8587042235656466078L);
        gl = 0xDC0000 >>> 210 | 0xDC0000 << ~210 + 1;
        gm = Long.reverse(-8587042235656466078L);
        gn = Integer.reverse(0x1C000000);
        go = Long.reverse(-8587042235656466078L);
        gp = 933888 >>> 46 | 933888 << -46;
        gq = Long.reverse(-84246139180969630L);
        gr = Long.reverse(0x7600000000000000L);
        gs = Integer.reverse(0x5C000000);
        gt = Long.reverse(-84246139180969630L);
        gu = Long.reverse(0x7600000000000000L);
        gv = Integer.reverse(-603979776);
        gw = Long.reverse(-84246139180969630L);
        gx = Long.reverse(0x7600000000000000L);
        gy = (122880 >>> 11 | 122880 << ~11 + 1) & 0xFFFFFFFF;
        gz = Long.reverse(-84246139180969630L);
        ha = Long.reverse(0x7600000000000000L);
        hb = 61 >>> 96 | 61 << ~96 + 1;
        hc = -1 >>> 175 | -1 << -175;
        hd = Long.reverse(-8587042235656466078L);
        he = (0 >>> 19 | 0 << ~19 + 1) & 0xFFFFFFFF;
        hf = Integer.reverse(0x7C000000);
        hg = Long.reverse(-84246139180969630L);
        hh = Long.reverse(0x7600000000000000L);
        hi = (0xFC00000 >>> 22 | 0xFC00000 << ~22 + 1) & 0xFFFFFFFF;
        hj = Long.reverse(-84246139180969630L);
        hk = Long.reverse(0x7600000000000000L);
        hl = Integer.reverse(0x2000000);
        hm = Long.reverse(-84246139180969630L);
        hn = Long.reverse(0x7600000000000000L);
        ho = 65 >>> 224 | 65 << -224;
        hp = Integer.reverse(-1);
        hq = Long.reverse(-8587042235656466078L);
        hr = Integer.reverse(0x42000000);
        hs = (-1 >>> 130 | -1 << -130) & 0xFFFFFFFF;
        ht = Long.reverse(-8587042235656466078L);
        hu = Integer.reverse(-1040187392);
        hv = Long.reverse(-8587042235656466078L);
        hw = Integer.reverse(0x22000000);
        hx = Long.reverse(-84246139180969630L);
        hy = Long.reverse(0x7600000000000000L);
        hz = (69 >>> 96 | 69 << ~96 + 1) & 0xFFFFFFFF;
        ia = Long.reverse(-8587042235656466078L);
        ib = Integer.reverse(0x62000000);
        ic = Long.reverse(-8587042235656466078L);
        id = Integer.reverse(-503316480);
        ie = Long.reverse(-84246139180969630L);
        cfr_renamed_0 = Long.reverse(0x7600000000000000L);
        ig = Integer.reverse(0x12000000);
        ih = Long.reverse(-8587042235656466078L);
        ii = Integer.reverse(-1845493760);
        ij = Long.reverse(-84246139180969630L);
        ik = Long.reverse(0x7600000000000000L);
        il = Integer.reverse(0x52000000);
        im = Integer.reverse(-1);
        in = Long.reverse(-8587042235656466078L);
        io = 629145600 >>> 23 | 629145600 << -23;
        ip = Long.reverse(-84246139180969630L);
        iq = Long.reverse(0x7600000000000000L);
        ir = (0x1300000 >>> 210 | 0x1300000 << -210) & 0xFFFFFFFF;
        is = Long.reverse(-8587042235656466078L);
        it = Integer.reverse(-1308622848);
        iu = Long.reverse(-84246139180969630L);
        iv = Long.reverse(0x7600000000000000L);
        iw = Integer.reverse(0x72000000);
        ix = Long.reverse(-84246139180969630L);
        iy = Long.reverse(0x7600000000000000L);
        iz = Integer.reverse(-234881024);
        ja = Long.reverse(-84246139180969630L);
        jb = Long.reverse(0x7600000000000000L);
        jc = (20480 >>> 40 | 20480 << -40) & 0xFFFFFFFF;
        jd = -1 >>> 159 | -1 << ~159 + 1;
        je = Long.reverse(-8587042235656466078L);
        jf = Integer.reverse(-1979711488);
        jg = Long.reverse(-8587042235656466078L);
        jh = 0x2900000 >>> 147 | 0x2900000 << ~147 + 1;
        ji = Integer.reverse(-1);
        jj = Long.reverse(-8587042235656466078L);
        jk = 83 >>> 32 | 83 << ~32 + 1;
        jl = Long.reverse(-8587042235656466078L);
        jm = 10752 >>> 199 | 10752 << ~199 + 1;
        jn = Long.reverse(-84246139180969630L);
        jo = Long.reverse(0x7600000000000000L);
        jp = 0xAA00000 >>> 181 | 0xAA00000 << ~181 + 1;
        jq = Long.reverse(-84246139180969630L);
        jr = Long.reverse(0x7600000000000000L);
        js = Integer.reverse(0x6A000000);
        jt = Long.reverse(-84246139180969630L);
        ju = Long.reverse(0x7600000000000000L);
        jv = 729808896 >>> 183 | 729808896 << -183;
        jw = Long.reverse(-84246139180969630L);
        jx = Long.reverse(0x7600000000000000L);
        jy = Integer.reverse(0x1A000000);
        jz = Long.reverse(-84246139180969630L);
        ka = Long.reverse(0x7600000000000000L);
        kb = Integer.reverse(-1711276032);
        kc = Long.reverse(-8587042235656466078L);
        kd = 180 >>> 129 | 180 << ~129 + 1;
        ke = Integer.reverse(-1);
        kf = Long.reverse(-8587042235656466078L);
        kg = -1342177275 >>> 60 | -1342177275 << -60;
        kh = Long.reverse(-84246139180969630L);
        ki = Long.reverse(0x7600000000000000L);
        kj = Integer.reverse(0x3A000000);
        kk = Long.reverse(-84246139180969630L);
        kl = Long.reverse(0x7600000000000000L);
        km = 186 >>> 129 | 186 << ~129 + 1;
        kn = Long.reverse(-84246139180969630L);
        ko = Long.reverse(0x7600000000000000L);
        kp = Integer.reverse(0x7A000000);
        kq = Long.reverse(-84246139180969630L);
        kr = Long.reverse(0x7600000000000000L);
        ks = (24320 >>> 168 | 24320 << ~168 + 1) & 0xFFFFFFFF;
        kt = (-268435451 >>> 252 | -268435451 << -252) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ks];
        var_java_lang_String_arr_b = new String[kt];
        ForceRegisterConfig.void_b();
    }

    String a(boolean bl, String string) {
        String string2 = bl ? (String)ForceRegisterConfig.c("㺀", (int)dh, (long)(di ^ dj)) + NLoginCore_532.e.a(new Object[dk]) + (String)ForceRegisterConfig.c("㺃", (int)(dl & dm), (long)dn) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)ForceRegisterConfig.c("㺆", (int)(cfr_renamed_1 & dp), (long)dq) + this.var_java_lang_String_r + (String)ForceRegisterConfig.c("㺉", (int)(dr & ds), (long)dt) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName() + (String)ForceRegisterConfig.c("㺌", (int)du, (long)dv) + NLoginCore_432.b(this.var_java_util_UUID_c) + (String)ForceRegisterConfig.c("㺏", (int)dw, (long)dx) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName() + (String)ForceRegisterConfig.c("㺒", (int)dy, (long)(dz ^ ea)) + NLoginCore_432.b(this.var_java_util_UUID_a) + (String)ForceRegisterConfig.c("㺕", (int)eb, (long)ec) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName() + (String)ForceRegisterConfig.c("㺘", (int)ed, (long)(ee ^ ef)) + NLoginCore_432.b(this.var_java_util_UUID_b) + (String)ForceRegisterConfig.c("㺛", (int)eg, (long)(eh ^ ei)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName() + (String)ForceRegisterConfig.c("㺞", (int)ej, (long)(ek ^ el)) + (this.var_java_lang_String_s == null ? null : (String)ForceRegisterConfig.c("㺡", (int)(em & en), (long)eo) + this.var_java_lang_String_s + (String)ForceRegisterConfig.c("㺤", (int)ep, (long)eq)) + (String)ForceRegisterConfig.c("㺧", (int)er, (long)(es ^ et)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)ForceRegisterConfig.c("㺪", (int)(eu & ev), (long)ew) + (this.var_java_lang_String_t == null ? null : (String)ForceRegisterConfig.c("㺭", (int)ex, (long)(ey ^ ez)) + this.var_java_lang_String_t + (String)ForceRegisterConfig.c("㺰", (int)fa, (long)(fb ^ fc))) + (String)ForceRegisterConfig.c("㺳", (int)fd, (long)(fe ^ ff)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName() + (String)ForceRegisterConfig.c("㺶", (int)fg, (long)(fh ^ fi)) + new Timestamp(this.var_long_g) + (String)ForceRegisterConfig.c("㺹", (int)fj, (long)(fk ^ fl)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName() + (String)ForceRegisterConfig.c("㺼", (int)fm, (long)(fn ^ fo)) + new Timestamp(this.var_long_f) + (String)ForceRegisterConfig.c("㺿", (int)fp, (long)(fq ^ fr)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName() + (String)ForceRegisterConfig.c("㻂", (int)fs, (long)(ft ^ fu)) + (this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_u == null ? null : (String)ForceRegisterConfig.c("㻅", (int)(fv & fw), (long)fx) + this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_u + (String)ForceRegisterConfig.c("㻈", (int)fy, (long)(fz ^ ga))) + (String)ForceRegisterConfig.c("㻋", (int)gb, (long)gc) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName() + (String)ForceRegisterConfig.c("㻎", (int)gd, (long)(ge ^ gf)) + (this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_v == null ? null : (String)ForceRegisterConfig.c("㻑", (int)gg, (long)(gh ^ gi)) + this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_v + (String)ForceRegisterConfig.c("㻔", (int)gj, (long)gk)) + (String)ForceRegisterConfig.c("㻗", (int)gl, (long)gm) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName() + (String)ForceRegisterConfig.c("㻚", (int)gn, (long)go) + (string == null ? null : (String)ForceRegisterConfig.c("㻝", (int)gp, (long)(gq ^ gr)) + string + (String)ForceRegisterConfig.c("㻠", (int)gs, (long)(gt ^ gu))) + (String)ForceRegisterConfig.c("㻣", (int)gv, (long)(gw ^ gx)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName() + (String)ForceRegisterConfig.c("㻦", (int)gy, (long)(gz ^ ha)) + this.var_java_lang_Long_a : (String)ForceRegisterConfig.c("㻩", (int)(hb & hc), (long)hd) + NLoginCore_532.e.a(new Object[he]) + (String)ForceRegisterConfig.c("㻬", (int)hf, (long)(hg ^ hh)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName() + (String)ForceRegisterConfig.c("㻯", (int)hi, (long)(hj ^ hk)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName() + (String)ForceRegisterConfig.c("㻲", (int)hl, (long)(hm ^ hn)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName() + (String)ForceRegisterConfig.c("㻵", (int)(ho & hp), (long)hq) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName() + (String)ForceRegisterConfig.c("㻸", (int)(hr & hs), (long)ht) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName() + (String)ForceRegisterConfig.c("㻻", (int)hu, (long)hv) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName() + (String)ForceRegisterConfig.c("㻾", (int)hw, (long)(hx ^ hy)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName() + (String)ForceRegisterConfig.c("㼁", (int)hz, (long)ia) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName() + (String)ForceRegisterConfig.c("㼄", (int)ib, (long)ic) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName() + (String)ForceRegisterConfig.c("㼇", (int)id, (long)(ie ^ cfr_renamed_0)) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName() + (String)ForceRegisterConfig.c("㼊", (int)ig, (long)ih) + NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName() + (String)ForceRegisterConfig.c("㼍", (int)ii, (long)(ij ^ ik)) + this.var_java_lang_String_r + (String)ForceRegisterConfig.c("㼐", (int)(il & im), (long)in) + NLoginCore_432.b(this.var_java_util_UUID_c) + (String)ForceRegisterConfig.c("㼓", (int)io, (long)(ip ^ iq)) + NLoginCore_432.b(this.var_java_util_UUID_a) + (String)ForceRegisterConfig.c("㼖", (int)ir, (long)is) + NLoginCore_432.b(this.var_java_util_UUID_b) + (String)ForceRegisterConfig.c("㼙", (int)it, (long)(iu ^ iv)) + (this.var_java_lang_String_s == null ? null : (String)ForceRegisterConfig.c("㼜", (int)iw, (long)(ix ^ iy)) + this.var_java_lang_String_s + (String)ForceRegisterConfig.c("㼟", (int)iz, (long)(ja ^ jb))) + (String)ForceRegisterConfig.c("㼢", (int)(jc & jd), (long)je) + this.var_java_lang_String_t + (String)ForceRegisterConfig.c("㼥", (int)jf, (long)jg) + new Timestamp(this.var_long_g) + (String)ForceRegisterConfig.c("㼨", (int)(jh & ji), (long)jj) + new Timestamp(this.var_long_f) + (String)ForceRegisterConfig.c("㼫", (int)jk, (long)jl) + (this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_u == null ? null : (String)ForceRegisterConfig.c("㼮", (int)jm, (long)(jn ^ jo)) + this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_u + (String)ForceRegisterConfig.c("㼱", (int)jp, (long)(jq ^ jr))) + (String)ForceRegisterConfig.c("㼴", (int)js, (long)(jt ^ ju)) + (this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_v == null ? null : (String)ForceRegisterConfig.c("㼷", (int)jv, (long)(jw ^ jx)) + this.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_v + (String)ForceRegisterConfig.c("㼺", (int)jy, (long)(jz ^ ka))) + (String)ForceRegisterConfig.c("㼽", (int)kb, (long)kc) + (string == null ? null : (String)ForceRegisterConfig.c("㽀", (int)(kd & ke), (long)kf) + string + (String)ForceRegisterConfig.c("㽃", (int)kg, (long)(kh ^ ki))) + (String)ForceRegisterConfig.c("㽆", (int)kj, (long)(kk ^ kl));
        return string2;
    }

    @Nullable
    public synchronized NLoginCore_566 com_nickuc_login_NLoginCore_566_a() {
        return NLoginCore_566.a(this.var_java_lang_String_s);
    }

    public synchronized void F() {
        this.var_long_f = System.currentTimeMillis();
    }

    @Generated
    ForceRegisterConfig() {
        this.var_java_lang_String_t = ForceRegisterConfig.c("㺀", (int)kp, (long)(kq ^ kr));
        this.var_com_nickuc_login_NLoginCore_407_a = new NLoginCore_407(this);
        this.var_com_nickuc_login_NLoginCore_335_a = new NLoginCore_335(this);
    }

    public synchronized String d(String string) {
        return this.var_java_lang_String_r != null ? this.var_java_lang_String_r : string;
    }

    @Generated
    public UUID java_util_UUID_a() {
        return this.var_java_util_UUID_c;
    }

    public synchronized boolean boolean_y() {
        return this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)(aj & ak), (long)al), am != 0);
    }

    public void a(Long l, Long l2) {
        if (l != null) {
            this.var_long_g = l;
        }
        if (l2 != null) {
            this.var_long_f = l2;
        }
    }

    @Generated
    public long c() {
        return this.var_long_g;
    }

    public synchronized void void_z() {
        this.var_com_nickuc_login_NLoginCore_407_a.a((String)ForceRegisterConfig.c("㺀", (int)ay, (long)az), (Object)(ba != 0));
    }

    @Generated
    public String j() {
        return this.var_java_lang_String_s;
    }

    public synchronized boolean u() {
        if (this.var_java_util_UUID_b != null) {
            return p != 0;
        }
        if (this.var_java_util_UUID_c == null || this.var_java_util_UUID_c.getMostSignificantBits() != 0L) {
            return q != 0;
        }
        NLoginInterface_030 NLoginInterface_030 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginInterface_030_b();
        if (NLoginInterface_030 == null) {
            return var_int_r != 0;
        }
        NLoginInterface_031 NLoginInterface_0312 = NLoginInterface_030.com_nickuc_login_NLoginInterface_031_a();
        return (NLoginInterface_0312 != null && !NLoginInterface_0312.J() ? var_int_s : var_int_t) != 0;
    }
}

