/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_189;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_109;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.PluginInfoModel;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_142;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_488;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_111;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_388;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_180;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_148 {
    private static int bi;
    private static long eh;
    private static long av;
    private static long gi;
    private static int ap;
    private static long m;
    private static long ex;
    private static int v;
    private static int gj;
    private static int eg;
    private static long ef;
    private static int ey;
    private static int bo;
    private static int bh;
    private static int ad;
    private static int k;
    private static long ck;
    private static int as;
    private static long dn;
    private static int fp;
    private static long al;
    private static int dp;
    private static long fq;
    private static long dm;
    private static long cm;
    private static long ff;
    private static int gv;
    private static int be;
    private static int h;
    private static long var_long_d;
    private static int dr;
    private static int bw;
    private static long ar;
    private static int du;
    private static int bc;
    private static int var_int_p;
    private long var_long_p;
    private static int er;
    private static int z;
    private static long cz;
    private static long ac;
    private static long ch;
    private static long cn;
    private static long cw;
    private static int gh;
    private static long at;
    private static int s;
    private static int aj;
    private static int fz;
    private static int cfr_renamed_1;
    private static int fk;
    private static int fs;
    private static long ax;
    private static int cx;
    private static long fa;
    private static long cs;
    private static long bv;
    private static long ga;
    private static int di;
    private static long ba;
    private static long c;
    private static long gk;
    private static long an;
    private static int bz;
    private static int df;
    private static String[] var_java_lang_String_arr_a;
    private static int gt;
    private static long bj;
    private static long eq;
    private static long bu;
    private static long fu;
    private static long bs;
    private static long ei;
    private static long dh;
    private static int ds;
    private static int ec;
    private static long q;
    private static long ft;
    private static long bp;
    private static long dz;
    private static long bm;
    private static int cu;
    private static long by;
    private static int az;
    private static long gl;
    private static int cl;
    private static int cf;
    private static long cb;
    private static int cc;
    private static String[] var_java_lang_String_arr_b;
    private static long bl;
    private static int gu;
    private final JSONObject var_com_nickuc_login_lib_json_JSONObject_a = new JSONObject();
    private static long ct;
    private static long gs;
    private static int cr;
    private static long cy;
    private static int ee;
    private static long w;
    private static long gd;
    private static int dl;
    private static long cq;
    private static long fc;
    private static int cd;
    private static long fr;
    private static long dv;
    private static long cj;
    private static int var_int_a;
    private static int bk;
    private static long fj;
    private static long ea;
    private static long bf;
    private static int am;
    private static int fn;
    private static long fx;
    private static int dg;
    private static long aa;
    private static int j;
    private static int da;
    private static long fo;
    private static long dq;
    private static long ak;
    private static int gg;
    private static long el;
    private static long aq;
    private static long r;
    private static long bd;
    private static int o;
    private static int gm;
    private static long fg;
    private static int fv;
    private static int fw;
    private static long ek;
    private static int fb;
    private static int ev;
    private static int e;
    private static int en;
    private static int dj;
    private static int gf;
    private static int gq;
    private static long t;
    private static long ce;
    private static long dk;
    private static int ge;
    private static long ay;
    private static long i;
    private static long x;
    private static long go;
    private static long g;
    private static int fy;
    private static int dw;
    private static long u;
    private static long bg;
    private static int bq;
    private static int br;
    private static int em;
    private static long cp;
    private static int bx;
    private static int dy;
    private static long ed;
    private static int bt;
    private static long af;
    private static long ae;
    private final NLoginCore_227 var_com_nickuc_login_NLoginCore_227_b;
    private static int ab;
    private static long ao;
    private static long f;
    private static int ep;
    private static long cv;
    private static int ag;
    private static long ah;
    private static int fl;
    private static int y;
    private static int gb;
    private static int gc;
    private static long dx;
    private static int gn;
    private static long fd;
    private static long gp;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____d;
    private static long db;
    private static long dc;
    private static int co;
    private static int fe;
    private static long ai;
    private static int aw;
    private static long fi;
    private static int fm;
    private static int ej;
    private static int ew;
    private static long bb;
    private static long l;
    private static long dd;
    private static long eo;
    private static int gr;
    private static int ez;
    private static int de;
    private static int et;
    private static int ci;
    private static long es;
    private static int eb;
    private static int n;
    private static int var_int_b;
    private static int fh;
    private static int au;
    private static int bn;
    private static long dt;
    private static int ca;
    private static int eu;
    private static long cg;

    public void ap() {
        this.var_long_d.b(j != 0).a(() -> {
            block6: {
                try {
                    long l;
                    if (this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_109_a() == null) {
                        return;
                    }
                    int n = this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_142_a().b((String)NLoginCore_148.c("㺀", (int)fh, (long)(fi ^ fj)), fk);
                    if (n < fl || n > fm) {
                        n = fn;
                    }
                    if ((l = System.currentTimeMillis()) - this.var_long_p < (long)n * fo) {
                        return;
                    }
                    this.var_long_p = l;
                    NLoginCore_305 NLoginCore_305 = NLoginCore_305.a();
                    NLoginCore_305.k((String)NLoginCore_148.c("㺃", (int)fp, (long)(fq ^ fr)), (String)NLoginCore_148.c("㺆", (int)fs, (long)(ft ^ fu)));
                    NLoginCore_305.k((String)NLoginCore_148.c("㺉", (int)(fv & fw), (long)fx), (String)NLoginCore_148.c("㺌", (int)(fy & fz), (long)ga));
                    byte[] byArray = NLoginCore_488.a(NLoginCore_305, this.byte_arr_b());
                    NLoginCore_111 NLoginCore_1512 = this.var_com_nickuc_login_NLoginCore_227_b.a(NLoginCore_305, (String)NLoginCore_148.c("㺏", (int)(gb & gc), (long)gd), ge != 0, byArray);
                    int n2 = NLoginCore_1512.p();
                    if (n2 != gf && NLoginCore_525.as()) {
                        NLoginCore_370.d((String)NLoginCore_148.c("㺒", (int)(gg & gh), (long)gi) + n2 + (String)NLoginCore_148.c("㺕", (int)gj, (long)(gk ^ gl)), new Object[gm]);
                    }
                }
                catch (Throwable throwable) {
                    if (throwable instanceof IllegalStateException && ((String)NLoginCore_148.c("㺘", (int)gn, (long)(go ^ gp))).equals(throwable.getMessage())) break block6;
                    NLoginCore_370.c((String)NLoginCore_148.c("㺛", (int)(gq & gr), (long)gs), throwable, new Object[gt]);
                }
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0x86E3C5373624F1F4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(18 + 51), (byte)(50 + 33), (byte)(16 + 31), (byte)(16 + 51), 66, (byte)(19 + 48), (byte)(5 + 42), 80, (byte)(41 + 34), (byte)(2 + 65), (byte)(71 + 12), (byte)(19 + 34), (byte)(64 + 16), (byte)(54 + 43), (byte)(21 + 79), (byte)(47 + 53), (byte)(30 + 75), (byte)(48 + 62), (byte)(73 + 30)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(24 + 45), (byte)(26 + 57)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҳҨӄҴҖӇҬҿҽҺӈҬӈӃҧ", (byte)55, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_148.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private String R() {
        try {
            String string2;
            Path path = Paths.get((String)NLoginCore_148.c("㺀", (int)ej, (long)(ek ^ el)), new String[em]);
            if (!path.toFile().exists()) {
                return NLoginCore_148.c("㺃", (int)en, (long)eo);
            }
            try (Stream<String> stream = Files.lines(path);){
                string2 = stream.filter(string -> string.startsWith((String)NLoginCore_148.c("㺀", (int)fe, (long)(ff ^ fg)))).map(string -> string.replaceAll((String)NLoginCore_148.c("㺀", (int)(ey & ez), (long)fa), (String)NLoginCore_148.c("㺃", (int)fb, (long)(fc ^ fd)))).findFirst().orElse((String)NLoginCore_148.c("㺆", (int)ep, (long)eq));
            }
            catch (Throwable throwable) {
                string2 = (String)NLoginCore_148.c("㺉", (int)er, (long)es) + throwable.getMessage();
            }
            return string2.length() > et ? string2.substring(eu, ev) : string2;
        }
        catch (Throwable throwable) {
            return (String)NLoginCore_148.c("㺌", (int)ew, (long)ex) + throwable.getMessage();
        }
    }

    public void a(JSONObject jSONObject) {
        NLoginCore_142 NLoginCore_1422 = this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_142_a();
        NLoginCore_180 NLoginCore_1802 = this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_180_a();
        NLoginCore_109 NLoginCore_109 = this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_109_a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((String)NLoginCore_148.c("㺀", (int)var_int_p, (long)(q ^ r)), NLoginCore_109 != null ? Long.valueOf(NLoginCore_109.e()) : NLoginCore_148.c("㺃", (int)s, (long)(t ^ u)));
        jSONObject2.put((String)NLoginCore_148.c("㺆", (int)v, (long)(w ^ x)), NLoginCore_1802 != null ? NLoginCore_1802.S() : NLoginCore_148.c("㺉", (int)(y & z), (long)aa));
        jSONObject2.put((String)NLoginCore_148.c("㺌", (int)ab, (long)ac), (Object)NLoginCore_1422.L());
        jSONObject2.put((String)NLoginCore_148.c("㺏", (int)ad, (long)(ae ^ af)), (Object)this.var_long_d.toString());
        jSONObject2.put((String)NLoginCore_148.c("㺒", (int)ag, (long)(ah ^ ai)), (Object)this.var_long_d.s());
        jSONObject2.put((String)NLoginCore_148.c("㺕", (int)aj, (long)(ak ^ al)), (Object)this.var_com_nickuc_login_NLoginCore_227_b.com_nickuc_login_NLoginCore_204_a().getName());
        jSONObject2.put((String)NLoginCore_148.c("㺘", (int)am, (long)(an ^ ao)), this.var_long_d.com_nickuc_login_NLoginCore_422_a().ai() ? (String)NLoginCore_148.c("㺛", (int)ap, (long)(aq ^ ar)) + this.var_long_d.com_nickuc_login_NLoginCore_422_a().W() : NLoginCore_148.c("㺞", (int)as, (long)at));
        jSONObject2.put((String)NLoginCore_148.c("㺡", (int)au, (long)av), (Object)this.var_com_nickuc_login_NLoginCore_227_b.I());
        jSONObject2.put((String)NLoginCore_148.c("㺤", (int)aw, (long)(ax ^ ay)), (Object)(this.var_com_nickuc_login_NLoginCore_227_b.H() + (String)NLoginCore_148.c("㺧", (int)az, (long)(ba ^ bb)) + this.var_long_d.com_nickuc_login_NLoginCore_224_a().f().getAbsolutePath()));
        jSONObject2.put((String)NLoginCore_148.c("㺪", (int)bc, (long)bd), (Object)NLoginCore_189.a(System.currentTimeMillis(), NLoginCore_388.n));
        int n = this.var_com_nickuc_login_NLoginCore_227_b.n();
        String string = this.var_com_nickuc_login_NLoginCore_227_b.J();
        if (string != null) {
            jSONObject2.put((String)NLoginCore_148.c("㺭", (int)be, (long)(bf ^ bg)), (Object)string);
        }
        if (n != bh) {
            jSONObject2.put((String)NLoginCore_148.c("㺰", (int)bi, (long)bj), this.var_com_nickuc_login_NLoginCore_227_b.n());
        }
        long l = Runtime.getRuntime().maxMemory();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((String)NLoginCore_148.c("㺳", (int)bk, (long)(bl ^ bm)), (Object)System.getProperty((String)NLoginCore_148.c("㺶", (int)(bn & bo), (long)bp), (String)NLoginCore_148.c("㺹", (int)(bq & br), (long)bs)));
        jSONObject3.put((String)NLoginCore_148.c("㺼", (int)bt, (long)(bu ^ bv)), (Object)System.getProperty((String)NLoginCore_148.c("㺿", (int)(bw & bx), (long)by), (String)NLoginCore_148.c("㻂", (int)(bz & ca), (long)cb)));
        jSONObject3.put((String)NLoginCore_148.c("㻅", (int)(cc & cd), (long)ce), (Object)System.getProperty((String)NLoginCore_148.c("㻈", (int)cf, (long)(cg ^ ch)), (String)NLoginCore_148.c("㻋", (int)ci, (long)(cj ^ ck))));
        jSONObject3.put((String)NLoginCore_148.c("㻎", (int)cl, (long)(cm ^ cn)), (Object)System.getProperty((String)NLoginCore_148.c("㻑", (int)co, (long)(cp ^ cq)), (String)NLoginCore_148.c("㻔", (int)cr, (long)(cs ^ ct))));
        jSONObject3.put((String)NLoginCore_148.c("㻗", (int)cu, (long)(cv ^ cw)), Runtime.getRuntime().availableProcessors());
        jSONObject3.put((String)NLoginCore_148.c("㻚", (int)cx, (long)(cy ^ cz)), (Object)this.R());
        jSONObject3.put((String)NLoginCore_148.c("㻝", (int)da, (long)(db ^ dc)), l == dd ? Integer.valueOf(de) : NLoginCore_449.c(l));
        jSONObject3.put((String)NLoginCore_148.c("㻠", (int)(df & dg), (long)dh), (Object)NLoginCore_449.c(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((String)NLoginCore_148.c("㻣", (int)(di & dj), (long)dk), (Object)this.var_long_d.com_nickuc_login_NLoginCore_364_b().toString());
        PluginInfoModel[] PluginInfoModelArray = this.var_long_d.com_nickuc_login_NLoginInterface_040_b().com_nickuc_login_PluginInfoModel_arr_a();
        jSONObject4.put((String)NLoginCore_148.c("㻦", (int)dl, (long)(dm ^ dn)), PluginInfoModelArray.length);
        JSONArray jSONArray = new JSONArray(PluginInfoModelArray.length);
        for (int i = cfr_renamed_1; i < PluginInfoModelArray.length; ++i) {
            PluginInfoModel PluginInfoModel = PluginInfoModelArray[i];
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put((String)NLoginCore_148.c("㻩", (int)dp, (long)dq), (Object)PluginInfoModel.getName());
            jSONObject5.put((String)NLoginCore_148.c("㻬", (int)(dr & ds), (long)dt), (Object)PluginInfoModel.getVersion());
            jSONObject5.put((String)NLoginCore_148.c("㻯", (int)du, (long)dv), PluginInfoModel.f());
            Path path = PluginInfoModel.a();
            if (path != null) {
                jSONObject5.put((String)NLoginCore_148.c("㻲", (int)dw, (long)dx), (Object)path.toString());
            }
            jSONArray.put(i, (Object)jSONObject5);
        }
        jSONObject4.put((String)NLoginCore_148.c("㻵", (int)dy, (long)(dz ^ ea)), (Object)jSONArray);
        jSONObject.put((String)NLoginCore_148.c("㻸", (int)(eb & ec), (long)ed), (Object)jSONObject2);
        jSONObject.put((String)NLoginCore_148.c("㻻", (int)ee, (long)ef), (Object)jSONObject3);
        jSONObject.put((String)NLoginCore_148.c("㻾", (int)eg, (long)(eh ^ ei)), (Object)jSONObject4);
    }

    @Generated
    public NLoginCore_148(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_227 NLoginCore_2272) {
        this.var_long_d = (long)NLoginInterface_0112;
        this.var_com_nickuc_login_NLoginCore_227_b = NLoginCore_2272;
    }

    public NLoginCore_148 a(String string, Object object) {
        JSONObject jSONObject;
        if (!this.var_com_nickuc_login_lib_json_JSONObject_a.has((String)NLoginCore_148.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d))) {
            jSONObject = new JSONObject();
            this.var_com_nickuc_login_lib_json_JSONObject_a.put((String)NLoginCore_148.c("㺃", (int)e, (long)(f ^ g)), (Object)jSONObject);
        } else {
            jSONObject = this.var_com_nickuc_login_lib_json_JSONObject_a.getJSONObject((String)NLoginCore_148.c("㺆", (int)h, (long)i));
        }
        jSONObject.put(string, object);
        return this;
    }

    public NLoginCore_148 a(String string, String string2) {
        return this.a(string, (Object)string2);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_148.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.B("ÉëíÍñĐĈĞĊÙėčěĕÞăĥĤĜĢĜñ", (byte)17, 66), NLoginCore_148.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("ыјїКњіёњѥєСџѣќџѥЧޮޣ޿ޯޑ߂ާ޺޸޵߃ާ߃޾ޢт", (byte)17, 67) + string + NLoginCore_092.F("ԇ", (byte)17, 70) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = -1 >>> 251 | -1 << -251;
        var_long_d = Long.reverse(-2374303306156976947L);
        e = (0x20000000 >>> 253 | 0x20000000 << -253) & 0xFFFFFFFF;
        f = Long.reverse(-3815455186915535667L);
        g = Long.reverse(0x1400000000000000L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-2374303306156976947L);
        j = (64 >>> 198 | 64 << -198) & 0xFFFFFFFF;
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-3815455186915535667L);
        m = Long.reverse(0x1400000000000000L);
        n = (4 >>> 98 | 4 << ~98 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(0);
        var_int_p = (0x200000 >>> 243 | 0x200000 << ~243 + 1) & 0xFFFFFFFF;
        q = Long.reverse(-3815455186915535667L);
        r = Long.reverse(0x1400000000000000L);
        s = -1610612736 >>> 61 | -1610612736 << -61;
        t = Long.reverse(-3815455186915535667L);
        u = Long.reverse(0x1400000000000000L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-3815455186915535667L);
        x = Long.reverse(0x1400000000000000L);
        y = (-1073741823 >>> 94 | -1073741823 << ~94 + 1) & 0xFFFFFFFF;
        z = (-1 >>> 216 | -1 << ~216 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(-2374303306156976947L);
        ab = Integer.reverse(0x10000000);
        ac = Long.reverse(-2374303306156976947L);
        ad = 4608 >>> 73 | 4608 << ~73 + 1;
        ae = Long.reverse(-3815455186915535667L);
        af = Long.reverse(0x1400000000000000L);
        ag = 0x280000 >>> 178 | 0x280000 << -178;
        ah = Long.reverse(-3815455186915535667L);
        ai = Long.reverse(0x1400000000000000L);
        aj = (-1073741822 >>> 190 | -1073741822 << -190) & 0xFFFFFFFF;
        ak = Long.reverse(-3815455186915535667L);
        al = Long.reverse(0x1400000000000000L);
        am = Integer.reverse(0x30000000);
        an = Long.reverse(-3815455186915535667L);
        ao = Long.reverse(0x1400000000000000L);
        ap = 832 >>> 230 | 832 << -230;
        aq = Long.reverse(-3815455186915535667L);
        ar = Long.reverse(0x1400000000000000L);
        as = (0x1C00000 >>> 149 | 0x1C00000 << ~149 + 1) & 0xFFFFFFFF;
        at = Long.reverse(-2374303306156976947L);
        au = (0x780000 >>> 19 | 0x780000 << -19) & 0xFFFFFFFF;
        av = Long.reverse(-2374303306156976947L);
        aw = Integer.reverse(0x8000000);
        ax = Long.reverse(-3815455186915535667L);
        ay = Long.reverse(0x1400000000000000L);
        az = Integer.reverse(-2013265920);
        ba = Long.reverse(-3815455186915535667L);
        bb = Long.reverse(0x1400000000000000L);
        bc = Integer.reverse(0x48000000);
        bd = Long.reverse(-2374303306156976947L);
        be = Integer.reverse(-939524096);
        bf = Long.reverse(-3815455186915535667L);
        bg = Long.reverse(0x1400000000000000L);
        bh = Integer.reverse(Integer.MIN_VALUE);
        bi = Integer.reverse(0x28000000);
        bj = Long.reverse(-2374303306156976947L);
        bk = Integer.reverse(-1476395008);
        bl = Long.reverse(-3815455186915535667L);
        bm = Long.reverse(0x1400000000000000L);
        bn = (-2147483643 >>> 222 | -2147483643 << ~222 + 1) & 0xFFFFFFFF;
        bo = -1 >>> 120 | -1 << -120;
        bp = Long.reverse(-2374303306156976947L);
        bq = Integer.reverse(-402653184);
        br = Integer.reverse(-1);
        bs = Long.reverse(-2374303306156976947L);
        bt = Integer.reverse(0x18000000);
        bu = Long.reverse(-3815455186915535667L);
        bv = Long.reverse(0x1400000000000000L);
        bw = Integer.reverse(-1744830464);
        bx = (-1 >>> 132 | -1 << ~132 + 1) & 0xFFFFFFFF;
        by = Long.reverse(-2374303306156976947L);
        bz = 212992 >>> 77 | 212992 << ~77 + 1;
        ca = Integer.reverse(-1);
        cb = Long.reverse(-2374303306156976947L);
        cc = (108 >>> 162 | 108 << ~162 + 1) & 0xFFFFFFFF;
        cd = (-1 >>> 157 | -1 << -157) & 0xFFFFFFFF;
        ce = Long.reverse(-2374303306156976947L);
        cf = (14 >>> 127 | 14 << -127) & 0xFFFFFFFF;
        cg = Long.reverse(-3815455186915535667L);
        ch = Long.reverse(0x1400000000000000L);
        ci = Integer.reverse(-1207959552);
        cj = Long.reverse(-3815455186915535667L);
        ck = Long.reverse(0x1400000000000000L);
        cl = (-536870911 >>> 60 | -536870911 << ~60 + 1) & 0xFFFFFFFF;
        cm = Long.reverse(-3815455186915535667L);
        cn = Long.reverse(0x1400000000000000L);
        co = Integer.reverse(-134217728);
        cp = Long.reverse(-3815455186915535667L);
        cq = Long.reverse(0x1400000000000000L);
        cr = Integer.reverse(0x4000000);
        cs = Long.reverse(-3815455186915535667L);
        ct = Long.reverse(0x1400000000000000L);
        cu = (132 >>> 2 | 132 << ~2 + 1) & 0xFFFFFFFF;
        cv = Long.reverse(-3815455186915535667L);
        cw = Long.reverse(0x1400000000000000L);
        cx = Integer.reverse(0x44000000);
        cy = Long.reverse(-3815455186915535667L);
        cz = Long.reverse(0x1400000000000000L);
        da = Integer.reverse(-1006632960);
        db = Long.reverse(-3815455186915535667L);
        dc = Long.reverse(0x1400000000000000L);
        dd = Long.reverse(-2L);
        de = (-1 >>> 170 | -1 << ~170 + 1) & 0xFFFFFFFF;
        df = (0x2400000 >>> 244 | 0x2400000 << ~244 + 1) & 0xFFFFFFFF;
        dg = (-1 >>> 94 | -1 << -94) & 0xFFFFFFFF;
        dh = Long.reverse(-2374303306156976947L);
        di = Integer.reverse(-1543503872);
        dj = Integer.reverse(-1);
        dk = Long.reverse(-2374303306156976947L);
        dl = (9728 >>> 168 | 9728 << -168) & 0xFFFFFFFF;
        dm = Long.reverse(-3815455186915535667L);
        dn = Long.reverse(0x1400000000000000L);
        cfr_renamed_1 = Integer.reverse(0);
        dp = Integer.reverse(-469762048);
        dq = Long.reverse(-2374303306156976947L);
        dr = Integer.reverse(0x14000000);
        ds = (-1 >>> 78 | -1 << ~78 + 1) & 0xFFFFFFFF;
        dt = Long.reverse(-2374303306156976947L);
        du = 0x20000005 >>> 125 | 0x20000005 << -125;
        dv = Long.reverse(-2374303306156976947L);
        dw = Integer.reverse(0x54000000);
        dx = Long.reverse(-2374303306156976947L);
        dy = (1476395009 >>> 91 | 1476395009 << ~91 + 1) & 0xFFFFFFFF;
        dz = Long.reverse(-3815455186915535667L);
        ea = Long.reverse(0x1400000000000000L);
        eb = -2147483643 >>> 253 | -2147483643 << ~253 + 1;
        ec = Integer.reverse(-1);
        ed = Long.reverse(-2374303306156976947L);
        ee = Integer.reverse(-1275068416);
        ef = Long.reverse(-2374303306156976947L);
        eg = 0x170000 >>> 143 | 0x170000 << ~143 + 1;
        eh = Long.reverse(-3815455186915535667L);
        ei = Long.reverse(0x1400000000000000L);
        ej = Integer.reverse(-201326592);
        ek = Long.reverse(-3815455186915535667L);
        el = Long.reverse(0x1400000000000000L);
        em = Integer.reverse(0);
        en = Integer.reverse(0xC000000);
        eo = Long.reverse(-2374303306156976947L);
        ep = Integer.reverse(-1946157056);
        eq = Long.reverse(-2374303306156976947L);
        er = 0x6400000 >>> 117 | 0x6400000 << ~117 + 1;
        es = Long.reverse(-2374303306156976947L);
        et = (1024 >>> 31 | 1024 << -31) & 0xFFFFFFFF;
        eu = Integer.reverse(0);
        ev = Integer.reverse(0x100000);
        ew = 0x3300000 >>> 52 | 0x3300000 << ~52 + 1;
        ex = Long.reverse(-2374303306156976947L);
        ey = 26624 >>> 73 | 26624 << -73;
        ez = (-1 >>> 134 | -1 << -134) & 0xFFFFFFFF;
        fa = Long.reverse(-2374303306156976947L);
        fb = 3392 >>> 70 | 3392 << -70;
        fc = Long.reverse(-3815455186915535667L);
        fd = Long.reverse(0x1400000000000000L);
        fe = (442368 >>> 77 | 442368 << -77) & 0xFFFFFFFF;
        ff = Long.reverse(-3815455186915535667L);
        fg = Long.reverse(0x1400000000000000L);
        fh = Integer.reverse(-335544320);
        fi = Long.reverse(-3815455186915535667L);
        fj = Long.reverse(0x1400000000000000L);
        fk = Integer.reverse(880803840);
        fl = Integer.reverse(-1610612736);
        fm = Integer.reverse(0x8700000);
        fn = (314572800 >>> 84 | 314572800 << ~84 + 1) & 0xFFFFFFFF;
        fo = Long.reverse(1711367858400788480L);
        fp = 0x1C0000 >>> 175 | 0x1C0000 << ~175 + 1;
        fq = Long.reverse(-3815455186915535667L);
        fr = Long.reverse(0x1400000000000000L);
        fs = 0x720000 >>> 81 | 0x720000 << -81;
        ft = Long.reverse(-3815455186915535667L);
        fu = Long.reverse(0x1400000000000000L);
        fv = Integer.reverse(0x5C000000);
        fw = Integer.reverse(-1);
        fx = Long.reverse(-2374303306156976947L);
        fy = 59 >>> 0 | 59 << -0;
        fz = Integer.reverse(-1);
        ga = Long.reverse(-2374303306156976947L);
        gb = Integer.reverse(0x3C000000);
        gc = Integer.reverse(-1);
        gd = Long.reverse(-2374303306156976947L);
        ge = (524288 >>> 147 | 524288 << -147) & 0xFFFFFFFF;
        gf = (6400 >>> 229 | 6400 << -229) & 0xFFFFFFFF;
        gg = Integer.reverse(-1140850688);
        gh = Integer.reverse(-1);
        gi = Long.reverse(-2374303306156976947L);
        gj = 0x7C0000 >>> 17 | 0x7C0000 << ~17 + 1;
        gk = Long.reverse(-3815455186915535667L);
        gl = Long.reverse(0x1400000000000000L);
        gm = Integer.reverse(0);
        gn = (1032192 >>> 206 | 1032192 << -206) & 0xFFFFFFFF;
        go = Long.reverse(-3815455186915535667L);
        gp = Long.reverse(0x1400000000000000L);
        gq = 8 >>> 29 | 8 << -29;
        gr = Integer.reverse(-1);
        gs = Long.reverse(-2374303306156976947L);
        gt = 0 >>> 87 | 0 << -87;
        gu = Integer.reverse(-2113929216);
        gv = Integer.reverse(-2113929216);
        var_java_lang_String_arr_a = new String[gu];
        var_java_lang_String_arr_b = new String[gv];
        NLoginCore_148.void_b();
    }

    private static void void_b() {
        int n;
        c = -5536508342087503661L;
        long l = c ^ 0x86E3C5373624F1F4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(68 + 1), (byte)(33 + 50), (byte)(40 + 7), (byte)(52 + 15), (byte)(36 + 30), (byte)(18 + 49), (byte)(5 + 42), (byte)(7 + 73), (byte)(6 + 69), 67, 83, (byte)(52 + 1), (byte)(19 + 61), (byte)(28 + 69), (byte)(37 + 63), (byte)(53 + 47), (byte)(20 + 85), (byte)(30 + 80), (byte)(67 + 36)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_148.var_java_lang_String_arr_b[0] = NLoginCore_004.A("ǈǏƔǌƘǟƟƾƜǞǚƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ǈǏƔǌƘǟƟƾƜǞǚƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[2] = NLoginCore_138.E("֛֔ՠ֘դ֫ի֊ը֪֦յ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[3] = NLoginCore_384.C("ւՌՖՏտեշԾբռ՚դՙվ֍թ֒Ւաէ֒ք՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[4] = NLoginCore_427.B("ƩƱǝǈƙǇƴǞǡƕǞƴƳǕƶǚǞǄǩǮƷǇƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[5] = NLoginCore_223.C("յիչՕ՜Հ՗՞ՙցՓՐ", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[6] = NLoginCore_110.C("չԿԼչջ՚ձյգիՔբըիՊխէ՞ձՊՒ՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[7] = NLoginCore_559.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[8] = NLoginCore_091.F("չֆ֙֜գ֟։֣ս֧֗֙հցճօֱրյչյ֩րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[9] = NLoginCore_027.E("ն֡է։շ֚ռ֧֭֟իյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[10] = NLoginCore_559.F("֓փյ֑֥֩տ֥֊֮֝յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[11] = NLoginCore_004.D("ր՘՜շշ՝ւդ՜վզՅևա֊րՈտՍ֕ժ֔՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[12] = NLoginCore_453.D("Հ՜ՐՒ՟փշգՒցլոՆ֊Ոժիա֊ՍՎք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[13] = NLoginCore_027.B("ƵǒǛǖǑƺƭǋƫǖǀƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[14] = NLoginCore_223.F("ցօէպ֞ժռօ֢֙քյ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[15] = NLoginCore_575.F("գբ։֥ցպֈ֥֗֫պ֡֋սխհ֑֤֠֡֯֩րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[16] = NLoginCore_027.E("֗֡ջյե֞և֭֝ռքյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[17] = NLoginCore_387.B("ǓƔƜƓƪƧƵǐǚǕǖƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[18] = NLoginCore_387.F("ձ֠։ղ֗ֈ֊֧֪֠֩յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[19] = NLoginCore_575.D("ԳՙԾՕ՘դկ։ՈՖվվաՌք֎֐ցզօ֊՞՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[20] = NLoginCore_091.D("յՀց՞եԸրբղՆՖդխ֌գՙ֊բջսէծ՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[21] = NLoginCore_027.F("֞֏ճ֧ը֜֍֘ծ֢ոկվ֡վւֳծִ֋ֵ֓րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[22] = NLoginCore_387.F("ռր֐֪֊քփլ֛շ֮֠ձռ։փ֦֯֬֩֕֩րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[23] = NLoginCore_201.E("֚֐֞պցեռփվ֦ոյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[24] = NLoginCore_384.C("ՊՍխբջՎմՀՅօչՐ", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[25] = NLoginCore_091.E("աճ֥֧֡֟ցվվ֣֢յ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[26] = NLoginCore_387.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[27] = NLoginCore_110.A("ƺƕǊǎǙƙǟǡƛƽƼƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[28] = NLoginCore_451.A("ƧƵǎƽƹǑǠƚƼƚǄƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[29] = NLoginCore_446.A("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[30] = NLoginCore_110.D("վՒԼՐֆՖֆ՗տՕաօքՈսՏժէ֏վևք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[31] = NLoginCore_138.E("֞֔՟օ֜տ֖֥֩։ի֣֞֜֊֤֓թֶ֮ֆֹրց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[32] = NLoginCore_138.B("ǎǄǒƮƵƙưƷƲǚƬƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[33] = NLoginCore_004.E("֣ւ֣֤ռ֌֍չ։֢պֱ֧֓լ֣֪ծֹ֛֨֨րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[34] = NLoginCore_453.A("ǘƶǈƾǘƨǟǌƵƴǒƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[35] = NLoginCore_201.B("ƤǕǎǕǆƯƞǑơƷǢƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[36] = NLoginCore_138.F("ց՟ղֆ։դ։վտվ֮յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[37] = NLoginCore_223.B("ƘǊǖǑƝǌǚǢǂƚƺƻǥǑƹǣƵƤƤǆƧǭƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[38] = NLoginCore_004.C("ԸՂՒՀաՙՏվՔ՘ի֍Ո՟ֈկ֑ևլւ֏ք՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[39] = NLoginCore_076.D("՝ԼՙՏճհՔվ՛օյՐ", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[40] = NLoginCore_324.D("ծ՞Րլրք՚րեո։Ր", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[41] = NLoginCore_223.A("ƴƳǜǖƛǎǍƿǝơǞƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[42] = NLoginCore_201.B("ƒǙƩƨƚƬƹƞǑƚǖƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[43] = NLoginCore_004.D("տհԾ՚ՒՒմ՜նՒՊ֊փՖ֐ոՐ֏֏՝Ս֔՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[44] = NLoginCore_004.D("ՑռՂդՒյ՗պւֈՆՐ", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[45] = NLoginCore_453.B("ƤƤǚƪƹǑƚǗǠǑǒƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[46] = NLoginCore_387.D("՜Ձ՝դՖճւբՙՖ՗Ր", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[47] = NLoginCore_138.E("֜շյ֛մ֖֙ֈ֘ցք֤֨ձծ֥֮։ֶ֪֧փրց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[48] = NLoginCore_427.E("֓հէձ֓֗֬խ֙֫չ֑ժրսլ֊ֈծ֚ֈ֩րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[49] = NLoginCore_201.B("ǛǍǄƮƯƞƼǔƵǛǄƩ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[50] = NLoginCore_091.C("պՕՋրծ՞պՖ՞ՇիՐ", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[51] = NLoginCore_223.C("պՕՋրծ՞պՖ՞ՇիՐ", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[52] = NLoginCore_027.A("ǔưƺƫǛƬǟǗǏƽƟƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[53] = NLoginCore_324.F("չՙ֘ֆֆս֋վ֚֏֦յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[54] = NLoginCore_138.F("ջ֓֕֕՜֞ց֤֭քպ֤վ֎֦֩֕շշֹ֯֫րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[55] = NLoginCore_324.E("ֆպ֐֨պ֠ոլզկ֡քփ֍ֳ֧֭֬֨։֢֓րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[56] = NLoginCore_201.E("օ֤ք֛ֈ՝լֈ֬է֐յ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[57] = NLoginCore_110.E("վ֧ՠղւ֨֗գ֙վְ֤֒֞վղ֊ղ֊֙֊ּյ֩֐տִֿ֓տֱֳ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[58] = NLoginCore_091.F("֓ք֟ը֢֟բպ֏֏֟կ֮֌ֱ֒ճօժ֘֩փրց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[59] = NLoginCore_004.A("ƲǛƔƦƶǜǋƗǍƲǤǆǘǒƲƦƾƦƾǍƾǰƩǝǄƳǳǇǨƳǥǧ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[60] = NLoginCore_453.A("ƌǖƪƪƾƴƖƲǐƲǡƟƿƯƨǛƤǌƽǪǀƽƻǨƤǛǪǏǔƵƴǅ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[61] = NLoginCore_451.B("ǆƑƩƴƛǖƛǍǖƕƸǂǕƙǂǚƸǈǗǬǌǐƫƭǐƯǅǈǏƳƵǩǔǰǋǞƷǎǺǌǬǐǜǤǖȁǗȀǝƽȄǟǾȍǔǕ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[62] = NLoginCore_091.E("եբ֕֗֫շէք֡֩ֈյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[63] = NLoginCore_384.E("֒օշ՟տ֞֘թիօծսֈ֞֯ի֑֧ևփֵֹրց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[64] = NLoginCore_138.B("ƑƕƮǏƺƧǍǒƛǙƜǒǠƸǂƳƜƷǜǤǞǘǐǇƤǃƾǑƿǟƸǨǇǬƴƯǎǈǻƺȀǁǝǻǳǦǖȊǢȄǜȄǟǞȌȑǟǓȕǿȉǨǰȐȍǥǒȚȏǾȏǚǭȂǣǩ", (byte)113, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_148.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ֆքչպդփֈְ֧֞ժռ֢ֆվֶ֎կօյִ֩րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[1] = NLoginCore_092.C("ՔնՓԽբնՁչտօիբՃլդՇծ֍մՠժ՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[2] = NLoginCore_076.D("ռփՁԶչՒՁՇղՓֈլԿ՟ֆ֌Շղ՝֊֊ք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[3] = NLoginCore_138.C("ւՌՖՏտեշԾբռ՗ՙ֋ց՘ւ֌Մխդվ֔՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[4] = NLoginCore_223.B("ƩƱǝǈƙǇƴǞǡƕǞơƽƾǐƦǔƫǞǃǫƷƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[5] = NLoginCore_453.E("՝քքբ֦֢֩ջ֢ի֞յ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[6] = NLoginCore_076.A("ǒƘƕǒǔƳǊǎƼǄƮƻƷƽƺƴǨǞǛƾǭƷƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[7] = NLoginCore_324.F("֡բ֦֭֠֞֔֍ջ֪֞յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[8] = NLoginCore_110.F("չֆ֙֜գ֟։֣ս֦֣֣֗ֈմ֧֑ր֡֎֣֩րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[9] = NLoginCore_223.D("ՖՙչջՙշՀջՕՄս֌ՕՎտտ֊֎ւ֊֕ծ՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[10] = NLoginCore_027.F("ձմ֢֚ճ֥ե֩֩֬իտ֍խսֶ֦օհֈևֹրց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[11] = NLoginCore_559.B("ǙƱƵǐǐƶǛƽƵǗƽƭƠƳǂƾǩǄƴƩƬǬǇǃǍƪǆǯǪƩƱƷ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[12] = NLoginCore_091.A("ƙƵƩƫƸǜǐƼƫǚǄǘƯƴƦƠǤƩǡƣǯǭƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[13] = NLoginCore_091.C("՞ԸլՃճէձղօոա֌՘ջՌՌաեՑմՑ՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[14] = NLoginCore_201.E("պ֐եթւս֍տվվքյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[15] = NLoginCore_575.A("ƗƖƽǙƵƮƼǋǟǙƮƾǧƱƠǪǪƝǢǨǂǭƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[16] = NLoginCore_575.A("ǏƘǙƓƝƬǡƼƱƚǒƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[17] = NLoginCore_559.E("ձՠջ՛֞֠թւի֜րյ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[18] = NLoginCore_223.F("մ֒՞պտ֥վթ֋֙քըִ֣֣֤տ֎֍ְ֒փրց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[19] = NLoginCore_076.A("ƌƲƗƮƱƽǈǢơƯǘǕǜǡǚǓǘǓǛǜǝǇƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[20] = NLoginCore_451.B("ǎƙǚƷƾƑǙƻǋƟƯƮǧǏưƶƣƸƹƾǘǉƧǢǑǊǁǐǍǷǸǁ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[21] = NLoginCore_027.C("չժՎւՃշըճՉսՕՈՃվ՘հծ՜ր՞֋՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[22] = NLoginCore_223.E("ռր֐֪֊քփլ֛շ֑֭֠ջ֜խ֖հֲֈ֫֩րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[23] = NLoginCore_387.E("֜սհեթ֗իշ֢֚֟յ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[24] = NLoginCore_223.E("֚֐ն֕֞֩֠յ֍ֱ֮֗֠֡֜ղ֫հְձ֬֩րց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[25] = NLoginCore_201.F("՘ց֞֡֊֚թ֕ֈ֎ըְ֩֞ֆծծֹ֖֫֙֓րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[26] = NLoginCore_110.A("ƚǜƩƛǌƳǕǠǃƹǞƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[27] = NLoginCore_027.F("֕ւ֟նռգփ֗ծօծִ֪֤֢֨֨֍ն֨չ֩րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[28] = NLoginCore_091.D("ՕԽԼռԼՎՏԾՀւըեՃ֌իֈդվՑՆիծ՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[29] = NLoginCore_110.F("֣փ֥֨շյր֌ժս֐յ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[30] = NLoginCore_427.C("վՒԼՐֆՖֆ՗տՕ՟Ծշածՠ՝֐՟հֆ՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[31] = NLoginCore_110.D("չկԺՠշ՚քձրդՇեՇռՇ֋՜Ց֑֓ըք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[32] = NLoginCore_138.D("չվպ՗ՑՠջՐբգյՐ", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[33] = NLoginCore_453.B("ǗƶǗǘưǀǁƭƽǖƮƵƾǡǣƵƸǜǞǬǯƷƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[34] = NLoginCore_201.C("իՁՋդՓ՚ՑՃոՠփՂ՗չռզՐճձժա՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[35] = NLoginCore_453.D("ՐյնԶՁպօաձՈ՝ըգզՉբլե֐դխ՞՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[36] = NLoginCore_201.B("ƚƘƽǋǎǕƝƭǚǙƵǕǟǏƞƸƠǈǫǩǃǝƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[37] = NLoginCore_324.E("դ֖֢֝թ֦֮֘֎զֆ֙֡խ֐֏ճַ֓իַ֥֥պևնֿׂ֚֗֙֞", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[38] = NLoginCore_387.C("ԸՂՒՀաՙՏվՔ՘մըէցկզՍ֌֑տքք՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[39] = NLoginCore_324.D("ճ՗խՕփն՗ՖըժՓՐ", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[40] = NLoginCore_387.D("տիԹցրեեցՒշշՄ՘ն՟ռդՐևքփք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[41] = NLoginCore_201.C("ԺԿլւ՜Ցՙըսռոտոք՘օ֌ՒձՆյ՞՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[42] = NLoginCore_223.A("ƵƚƚƳƮǍǉƮƴǓƛƩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[43] = NLoginCore_559.D("տհԾ՚ՒՒմ՜նՒՁ՚՚ւխՆֆգձդմք՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[44] = NLoginCore_427.D("կգԻՖցղհ՞չՔիռն։։լՌ֋փգ֐՞՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[45] = NLoginCore_223.C("ն՝ԻԼաևֆֈՙՁՔթի֊բՏՊՊօւՍք՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[46] = NLoginCore_004.A("ƵƫǓƹƹƿǋǊƝƹǍƢƞƱǒƾƤǚǉǪƮǇƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[47] = NLoginCore_076.A("ǐƫƩǏƨǊǍƼǌƵƹǢƞǙƶƤǈǙǇƬƶǯǑƺǒưǠǊǠƩǊǩ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[48] = NLoginCore_027.D("ծՋՂՌծղևՈմֆՔսյՀ՛բդՍմ՞հծ՛՜", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[49] = NLoginCore_451.C("ԾՖձլֆԽֈվ՞յցո՟Մտ՛֐ժխՐժծ՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[50] = NLoginCore_027.C("ցչբճ՛ՖձՔք՟ՉՃաՅ՜ՠփ֍փՓժ֔՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[51] = NLoginCore_387.A("ǌƖǏƬǑƚƬƓƺƽǥƤǚƻǜƠƪƵƦƭƻǝƴƵ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[52] = NLoginCore_027.D("ԷԺվՔՖււե֊Ւ՗Ր", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[53] = NLoginCore_451.F("սֆ֟֝ր֠պ֖֫֏իյ", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[54] = NLoginCore_092.B("ƯǇǉǉƐǒƵǘǡƸƯƲǀǄƱǚƠǚƽƭƾƷƴƵ", (byte)113, 66);
                    NLoginCore_148.var_java_lang_String_arr_b[55] = NLoginCore_453.C("աՕիփՕջՓՇՁՊռջցՈ֐լ֏ՒՉգՓք՛՜", (byte)113, 67);
                    NLoginCore_148.var_java_lang_String_arr_b[56] = NLoginCore_223.F("գՙ֥ճ֛դ֤֙֡֍֯տ֦֭֫փ֍ցձւ֤֓րց", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[57] = NLoginCore_559.E("վ֧ՠղւ֨֗գ֙վְ֤֒֞վղ֊ղ֊֙֊ֶָֺ֩պ֢֬պֶַֽ", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[58] = NLoginCore_138.E("֓ք֟ը֢֟բպ֏֏֟կ֭տմև֤օ֐֣ոփրց", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[59] = NLoginCore_027.A("ƲǛƔƦƶǜǋƗǍƲǤǆǘǒƲƦƾƦƾǍƾǮǁǙǢǡǒǧǣƳǣƷ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[60] = NLoginCore_324.A("ƌǖƪƪƾƴƖƲǐƲǡƟƿƯƨǛƤǌƽǪǀƸǘǀƬǋǁǢǥǨǙǤ", (byte)113, 65);
                    NLoginCore_148.var_java_lang_String_arr_b[61] = NLoginCore_223.F("֒՝յրէ֢է֢֙աք֎֡ե֎֦քָ֣֔֘֜շչ֜ջ֑֛֔տցֵּ֪֠֗փ֚׆ָׇ֘֜֨׋ּׁ֞֯֡֓הזי֠֡", (byte)113, 70);
                    NLoginCore_148.var_java_lang_String_arr_b[62] = NLoginCore_027.D("Րվճւ՞վս՛եբգՐ", (byte)113, 68);
                    NLoginCore_148.var_java_lang_String_arr_b[63] = NLoginCore_223.E("֒օշ՟տ֞֘թիօիլֳ֟֊ծ֮֘ֈօֵֹֽ֑֚֚֩֗֔֜տ֤", (byte)113, 69);
                    NLoginCore_148.var_java_lang_String_arr_b[64] = NLoginCore_110.F("՝ապ֛ֆճ֙֞է֥ը֞֬ք֎տըփְ֪֤֨֜֓հ֏֊֝֋֫քִָ֓րջׇ֚֔ֆ׌֍ֲׇֿ֢֩ז֮א֨א֪֫טם֫֟ס׋וִּלָׇאֱשֻֿ֞חץֵ֫", (byte)113, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_148.var_java_lang_String_arr_b[0] = NLoginCore_004.F("֕ց֣֧֠֠ֈ֡֯սզֳ֦֟֓վճծ֠ևֻ֨և֫֝֩֟շ׃ָ׀֟", (byte)113, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_148.var_java_lang_String_arr_b[0] = NLoginCore_324.D("բռԵՐձԸչ՜բո֋ՄՆե՞ցօռլօ֎֔՛՜", (byte)113, 68);
                }
            }
        }
    }

    private byte[] byte_arr_b() {
        this.a(this.var_com_nickuc_login_lib_json_JSONObject_a);
        this.a((String)NLoginCore_148.c("㺀", (int)k, (long)(l ^ m)), NLoginCore_525.a(n != 0));
        return this.var_com_nickuc_login_lib_json_JSONObject_a.toString(o).getBytes(StandardCharsets.UTF_8);
    }
}

