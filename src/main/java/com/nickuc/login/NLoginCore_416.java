/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_407;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_548;
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
import com.nickuc.login.ForceRegisterConfig;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_416 {
    private static long ii;
    private static int gr;
    private static long jc;
    private static long dd;
    private static int bm;
    private static long ez;
    private static int gw;
    private static int hs;
    private static long dj;
    private static int ev;
    private static int ix;
    private static long fa;
    private static long ed;
    private static long cr;
    private static long iq;
    private static long hf;
    private static int iy;
    private static long ct;
    private static int bx;
    private static int dz;
    private static int fj;
    private static long gn;
    private static int au;
    private static int jn;
    private static long el;
    private static int bc;
    private static int hp;
    private static int av;
    private static int s;
    private static long ep;
    private static int ih;
    private static int fp;
    private static int gq;
    private static long fv;
    private static long eo;
    private static int dc;
    private static long jb;
    private static int bz;
    private static long ic;
    private static int dv;
    private static long dw;
    private static int ap;
    private static long im;
    private static int bn;
    private static int es;
    private static int iv;
    private static int aq;
    private static int gt;
    private static int gi;
    private static int ht;
    private static long gg;
    private static int ax;
    private static int q;
    private static long co;
    private static int ec;
    private static int fq;
    private static int ao;
    private static int dy;
    private static int jh;
    private static int t;
    private static long hw;
    private static int eh;
    private static long he;
    private static long eu;
    private static int aw;
    private static int fb;
    private static int cz;
    private static long ha;
    private static int cp;
    private static int fm;
    private static int iz;
    private static int ck;
    private static int cd;
    private static long da;
    private static int cv;
    private static int gl;
    private static int al;
    private static int var_int_a;
    private static int iu;
    private static int dk;
    private static long aj;
    private static long db;
    private static long de;
    private static int dp;
    private static int i;
    private static int az;
    private static int bd;
    private static long ji;
    private static long cn;
    private static long ft;
    private static int fc;
    private static int hx;
    private static int dt;
    private static long jo;
    private static int gs;
    private static int hu;
    private static long gh;
    private static int ac;
    private static int w;
    private static long hc;
    private static long bq;
    private static int cfr_renamed_0;
    private static long ca;
    private static long ei;
    private static int ad;
    private static int jk;
    private static long jg;
    private static int dl;
    private static long hq;
    private static long dr;
    private static int u;
    private static long ea;
    private static long cx;
    private static int gy;
    private static long du;
    private static long dm;
    private static int gd;
    private static long fo;
    private static String[] var_java_lang_String_arr_b;
    private static int ga;
    private static int bh;
    private static int af;
    private static int ef;
    private static int df;
    private static long fw;
    private static int fg;
    private static long hr;
    private static long ib;
    private static int hb;
    private static int cw;
    private static long dx;
    private static long fy;
    private static int jm;
    private static int n;
    private static long jj;
    private static int gp;
    private static int fx;
    private static long jf;
    private static int bi;
    private static int is;
    private static int ie;
    private static int as;
    private static long cy;
    private static long fz;
    private static int be;
    private static int ch;
    private static int ik;
    private static int hj;
    private static String[] var_java_lang_String_arr_a;
    private static long br;
    private static int di;
    private static int cs;
    private static int ee;
    private static int hm;
    private static int ai;
    private static int em;
    private static int fi;
    private static long dg;
    private static int fk;
    private static int hv;
    private static long ff;
    private static int d;
    private static int jq;
    private static long hl;
    private static int j;
    private static long et;
    private static int ar;
    private static int ds;
    private static int bb;
    private static int fs;
    private static int bu;
    private static int p;
    private static long ah;
    private static int an;
    private static int gv;
    private static int z;
    private static int il;
    private static int y;
    private static long hz;
    private static long fn;
    private static long ak;
    private static long ci;
    private static int cm;
    private static int gu;
    private static int ir;
    private static int ej;
    private static int fe;
    private static long e;
    private static long cl;
    private static long var_long_b;
    private static int x;
    private static int jp;
    private static long eg;
    private static int ag;
    private static int f;
    private static int g;
    private static int cc;
    private static int gm;
    private static int bl;
    private static int fu;
    private static long ho;
    private static long cu;
    private static int ab;
    private static long hi;
    private static int ia;
    private static int bw;
    private static int id;
    private static int ay;
    private static long bt;
    private static int hk;
    private static long bv;
    private static int dn;
    private static int o;
    private static int gf;
    private static int bf;
    private static int hd;
    private static int fd;
    private static int am;
    private static int ba;
    private static int bk;
    private static int eq;
    private static long eb;
    private static int m;
    private static int bp;
    private static int at;
    private static int gb;
    private static int gx;
    private static int cj;
    private static long by;
    private static int hh;
    private static int hg;
    private static long ex;
    private static long gk;
    private static int je;
    private static int l;
    private static int iw;
    private static long ig;
    private static long er;
    private static int aa;
    private static long cb;
    private static int k;
    private static long jl;
    private static int ce;
    private static long cf;
    private static int go;
    private static long cq;
    private static int bj;
    private static long ew;
    private static int bo;
    private static long ge;
    private static long dq;
    private static int cg;
    private static long var_long_c;
    private static int h;
    private static int en;
    private static int gc;
    private static int it;
    private static int io;
    private static int ip;
    private static int ae;
    private static long dh;
    private static int ja;
    private static long ij;
    private static long fr;
    private static int ek;
    private static int r;
    private static int hy;
    private static int bs;
    private static int ey;
    private static int fh;
    private static long in;
    private static int hn;
    private static int bg;
    private static int var_int_c;
    private static int v;
    private static long gj;
    private static long cfr_renamed_1;
    private static int fl;
    private static int jd;
    private static long gz;

    private Timestamp a(long l) {
        return new Timestamp(l <= 0L ? System.currentTimeMillis() : l);
    }

    private String a(String string, boolean bl) {
        return string != null && !string.isEmpty() && (!bl || !string.equalsIgnoreCase((String)NLoginCore_416.c("㺀", (int)ja, (long)(jb ^ jc)))) ? string : null;
    }

    ForceRegisterConfig a(ResultSet resultSet) {
        String string = null;
        try {
            String string2;
            long l = resultSet.getLong(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName());
            string = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName()), gp != 0);
            String string3 = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName()), gq != 0);
            String string4 = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName()), gr != 0);
            UUID uUID = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName()));
            UUID uUID2 = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName()));
            UUID uUID3 = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName()));
            int n = gs;
            if (uUID2 != null && uUID2.version() != gt) {
                uUID2 = null;
                n = gu;
            }
            long l2 = this.a(resultSet.getObject(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName()));
            long l3 = this.a(resultSet.getObject(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName()));
            ForceRegisterConfig ForceRegisterConfig2 = new ForceRegisterConfig(l, string, uUID, uUID2, uUID3, string3, string4, l3, l2);
            ForceRegisterConfig2.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_u = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName()), gv != 0);
            ForceRegisterConfig2.var_com_nickuc_login_NLoginCore_335_a.var_java_lang_String_v = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName()), gw != 0);
            ForceRegisterConfig2.var_com_nickuc_login_NLoginCore_407_a.var_java_lang_String_w = string2 = this.a(resultSet.getString(NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName()), gx != 0);
            if (string2 != null) {
                this.a(ForceRegisterConfig2, string2);
            }
            if (n != 0) {
                ForceRegisterConfig2.void_z();
            }
            return ForceRegisterConfig2;
        }
        catch (SQLException sQLException) {
            NLoginCore_370.c((String)NLoginCore_416.c("㺀", (int)gy, (long)(gz ^ ha)) + (String)(string != null ? (String)NLoginCore_416.c("㺃", (int)hb, (long)hc) + string + (String)NLoginCore_416.c("㺆", (int)hd, (long)(he ^ hf)) : NLoginCore_416.c("㺉", (int)(hg & hh), (long)hi)) + (String)NLoginCore_416.c("㺌", (int)(hj & hk), (long)hl), sQLException, new Object[hm]);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_416.c("㺏", (int)hn, (long)ho) + string + (String)NLoginCore_416.c("㺒", (int)hp, (long)(hq ^ hr)), exception, new Object[hs]);
        }
        return null;
    }

    private Object[] a(Object[] objectArray, NLoginCore_436 ... NLoginCore_436Array) {
        if (objectArray.length % fd != 0) {
            throw new IllegalArgumentException((String)NLoginCore_416.c("㺀", (int)fe, (long)ff));
        }
        int n = fg;
        int n2 = NLoginCore_436Array.length > 0 ? fh : fi;
        HashSet<NLoginCore_436> hashSet = n2 != 0 ? new HashSet<NLoginCore_436>(Arrays.asList(NLoginCore_436Array)) : null;
        Object[] objectArray2 = n2 != 0 ? new Object[(hashSet.size() + fj) * fk] : (Object[])objectArray.clone();
        for (int i = fl; i < objectArray.length; i += 2) {
            Object object = objectArray[i];
            if (!(object instanceof NLoginCore_436)) {
                throw new IllegalArgumentException((String)NLoginCore_416.c("㺃", (int)fm, (long)(fn ^ fo)));
            }
            NLoginCore_436 NLoginCore_4362 = (NLoginCore_436)((Object)object);
            if (n2 != 0 && !hashSet.contains((Object)NLoginCore_4362) && NLoginCore_4362 != NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a) continue;
            objectArray2[n++] = NLoginCore_4362.getName();
            objectArray2[n++] = objectArray[i + fp];
        }
        return objectArray2;
    }

    private void a(ForceRegisterConfig ForceRegisterConfig2, String string) {
        int n = ht;
        if (!string.isEmpty()) {
            if (string.length() >= hu && !this.d(string)) {
                try {
                    string = new String(Base64.getDecoder().decode(string));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (this.d(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginCore_416.c("㺀", (int)hv, (long)hw));
                    NLoginCore_407 NLoginCore_407 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a();
                    for (int i = hx; i < jSONArray.length(); ++i) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string2 = jSONObject2.getString((String)NLoginCore_416.c("㺃", (int)hy, (long)hz));
                        Object object = jSONObject2.get((String)NLoginCore_416.c("㺆", (int)ia, (long)(ib ^ ic)));
                        NLoginCore_407.cfr_renamed_2.put(string2, object);
                    }
                    n = id;
                }
                catch (JSONException jSONException) {
                    NLoginCore_370.c((String)NLoginCore_416.c("㺉", (int)(ie & cfr_renamed_0), (long)ig) + ForceRegisterConfig2.i() + (String)NLoginCore_416.c("㺌", (int)ih, (long)(ii ^ ij)), new Object[ik]);
                }
                catch (Exception exception) {
                    NLoginCore_370.c((String)NLoginCore_416.c("㺏", (int)il, (long)(im ^ in)) + ForceRegisterConfig2.i() + (String)NLoginCore_416.c("㺒", (int)(io & ip), (long)iq), exception, new Object[ir]);
                }
            }
        }
        if (n == 0) {
            ForceRegisterConfig2.var_com_nickuc_login_NLoginCore_407_a.var_boolean_z = is;
        } else {
            ForceRegisterConfig2.var_com_nickuc_login_NLoginCore_407_a.I();
        }
    }

    private UUID a(String string) {
        return (string = this.a(string, jd != 0)) != null && !string.equals(NLoginCore_416.c("㺀", (int)je, (long)(jf ^ jg))) ? NLoginCore_432.c(string.replace((CharSequence)NLoginCore_416.c("㺃", (int)jh, (long)(ji ^ jj)), (CharSequence)NLoginCore_416.c("㺆", (int)jk, (long)jl))) : null;
    }

    /*
     * Exception decompiling
     */
    boolean a(NLoginCore_459 var1_1, ForceRegisterConfig var2_2, NLoginCore_436 ... var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CATCHBLOCK]], but top level block is 4[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void b() {
        int n;
        var_long_c = 7569233160499325401L;
        long l = var_long_c ^ 0x1D2695394BEF2355L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(52 + 17), (byte)(57 + 26), (byte)(5 + 42), (byte)(31 + 36), 66, (byte)(35 + 32), (byte)(3 + 44), (byte)(9 + 71), (byte)(11 + 64), (byte)(46 + 21), (byte)(81 + 2), (byte)(25 + 28), (byte)(72 + 8), 97, (byte)(77 + 23), (byte)(31 + 69), (byte)(37 + 68), (byte)(43 + 67), (byte)(44 + 59)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_416.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ŎŅŘŰūŊŨŞŬŕŠŲźſşŠŨņżşŨŭƉŎōňŧƔƀŲňƗŦƕťŷƚŪŖƍƌƞƋƑŶƎƚřťƄƢƉŹƉƧƭƊƭƣŽƱŧƴƘƒƫƩźƜƬŻƪƵƜƟƐƟŻƷƾơƦǆƻƶƥƒƓ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[1] = NLoginCore_004.D("ӅҩӘӛӪӂҦӲӀӎӀӒӇӶӦӽӇӌӮӖӘӿӔӚӸԃӖӦԀӆӛӥԁӏӝӈӟӴӴӿӿӢӐәԎӺӳԏԋԔӶԛӛӚӼӿӤԐӴӧԆӻԂԭԘӦӧӿԳԊԎԊԟԒԮӽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[2] = NLoginCore_324.B("łŌŵŌųįśĶźŘĹŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[3] = NLoginCore_027.C("ӜөӎӍӬӤӄӝҮӡӈҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[4] = NLoginCore_451.E("խԨձԶաժնՕՕ՘ԾՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[5] = NLoginCore_324.C("ҨӡӊӒӅҲҫӍӞӖӍӹҲҳӼӍӮәӋӪӿӛӈӉ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[6] = NLoginCore_138.E("ԿշՐդԱլԭխժՋվ՝իպՍԻմՓբՁՆֈՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[7] = NLoginCore_004.A("ōŎŰŕŕŒŞŒŲƁŁŇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[8] = NLoginCore_027.C("һӤӛӮӓӲҮӨӉҮӸӆӭһӅӸӭӜӟӘӘӱӈӉ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[9] = NLoginCore_092.C("ҹӢҸӞүӮҭӄӕӬӓӑӰҳӐӑӏӰӰҷӹӋӈӉ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[10] = NLoginCore_110.E("ՕՠԲգԫՔիՙՏՔԺՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[11] = NLoginCore_138.F("ԱմՓԳԳՙյԷզո՟Մ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[12] = NLoginCore_004.D("ӗӄӬҬӟӔӋӎӶӶӄҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[13] = NLoginCore_324.B("ŲšōŉŊťŶŵőŌŌŰĽƄŁųŅŶŊśŭŕŒœ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ԯշԲՖհԵՙչԺՖՍյՎկխփՓշԿսՁֆՕեՖզ֊ջ֏ֆՒքզՕ՗֙ճՙ֕նծտ֝դ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[15] = NLoginCore_384.D("ӦҡӪүӚӣӯӎӎӑҷҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[16] = NLoginCore_110.F("ԯըՑՙՌԹԲՔե՝ՔրԹԺփՔյՠՒձֆբՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[17] = NLoginCore_201.A("łźœŧĴůİŰŭŎƁŠŮŽŐľŷŖťńŉƋŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[18] = NLoginCore_324.A("ōŎŰŕŕŒŞŒŲƁŁŇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[19] = NLoginCore_201.D("һӤӛӮӓӲҮӨӉҮӸӆӭһӅӸӭӜӟӘӘӱӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[20] = NLoginCore_223.B("ŃŬłŨĹŸķŎşŶŝśźĽŚśřźźŁƃŕŒœ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[21] = NLoginCore_324.D("ӎәҫӜҤӍӤӒӈӍҳҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[22] = NLoginCore_092.A("ĴŷŖĶĶŜŸĺũŻŢŇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[23] = NLoginCore_453.D("ӗӄӬҬӟӔӋӎӶӶӄҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ŲšōŉŊťŶŵőŌŋŐŏőŀłŷŞƋŬŻţūŊƇŽŽƍƒƃŵƎƇŦƋŤŔŵƒƝƑƠŶŧ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[25] = NLoginCore_201.B("ŰīŴĹŤŭŹŘŘśŁŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[26] = NLoginCore_223.D("ҨӡӊӒӅҲҫӍӞӖӍӹҲҳӼӍӮәӋӪӿӛӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[27] = NLoginCore_027.C("ҸӰӉӝҪӥҦӦӣӄӷӖӤӳӆҴӭӌӛҺҿԁӈӉ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[28] = NLoginCore_004.C("ӃӄӦӋӋӈӔӈӨӷҷҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[29] = NLoginCore_387.A("ŅŮťŸŝżĸŲœĸƂŐŷŅŏƂŷŦũŢŢŻŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[30] = NLoginCore_110.C("ӦҡӪүӚӣӯӎӎӑҷҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[31] = NLoginCore_027.E("ԯըՑՙՌԹԲՔե՝ՔրԹԺփՔյՠՒձֆբՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[32] = NLoginCore_027.A("łźœŧĴůİŰŭŎƁŠŮŽŐľŷŖťńŉƋŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[33] = NLoginCore_110.C("ӃӄӦӋӋӈӔӈӨӷҷҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[34] = NLoginCore_138.E("Ղիբյ՚չԵկՐԵտՍմՂՌտմգզ՟՟ոՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[35] = NLoginCore_201.A("šŃŖŔĮĻŉĸųŉšŞŠşŔşšŹŶūŞƇƍŋšŤƅŲœƄŷūťƔőŭŶœŧżŚŻŚŹŚƤťŲƜųƦƌƝƕŤſƟſƐƬƏƪŮŶ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[36] = NLoginCore_223.F("լժՆըՖդշԹհ՗ՈսԿՊոԾ՗պԾքզոշթժ֎Ձւ՛ադզ֎՞ժ֘աֈոմթ֙կդ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[37] = NLoginCore_559.F("՝ԾժնյԲյԻՕկՕտՎՎՎճՍչպ՝ձՕթցՕՖՇՌժՈօըձֈևգ֖Ւ֔ճն։֠տսծ՝քք֣ռորւկհ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[38] = NLoginCore_138.C("ӥҮӮӮӎӞӒӒӒӐӧӺӮӚӶӍӴӗӴӀӟӫҺӡӹӱӔӄӚӁӨӬ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[39] = NLoginCore_575.A("ŏĳŢťŴŌİżŊŘŊŜőƀŰƇőŖŸŠŢƉŞŤƂƍŠŰƊŐťůƋřŧŒũžžƉƉŬřƃƄŝŹƐŸŢƇŹƕŵƅżƫƩƨƝųūŲƋƙƔƔƈƉƛƲƯưǀƸƇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[40] = NLoginCore_076.D("ӨӃӝӟҩӀҦӢӂҳҲӴӧӛӼӳӦӐҹӰӎӚӚҷӘӹӶԊӡӊӶԂ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[41] = NLoginCore_223.F("՞ՋճԳզ՛ՒՕսսՋՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[42] = NLoginCore_076.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔաՁԽ՘՜խկՍՉժճեբըօբիճդոՕ֗֟ՙ֡ցձ֍կ֝ՠ֩և֘կհ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[43] = NLoginCore_138.D("ӤҪӐҧӦӮөӐӨөҪӱӬӫӆӇөҽӪӡӞӱӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[44] = NLoginCore_387.F("Ք԰ՃՃ՚Գ՜ոԽպԺՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[45] = NLoginCore_559.B("ũŭńĹŸœľŒŽŀŰŞŶſŵƂŷőƆŗŤŃƌſţŨŲŠőƐƄŗ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[46] = NLoginCore_559.F("ՎգյյոՈ՚ԲԹ՟թՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[47] = NLoginCore_092.F("ՃԳյՑՅԬշՐԶպՇՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[48] = NLoginCore_384.E("գհՕՔճիՋդԵըՏՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[49] = NLoginCore_453.E("աՃՇՔՎչ՗ԴԴՙյՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[50] = NLoginCore_027.C("ӟӣҺүӮӉҴӈӳҶӦӔӬӵӫӸӭӇӼӍӚҽӘӲӰӗӐӃӀӟԅԋ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[51] = NLoginCore_201.F("ճՐԮլՐոյԻժշ՘՟ւՀբսՒզՠռա՘էլչՉ֍՘՜֌ՠմյգե֔ՒՖիՎը֑֒դ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[52] = NLoginCore_223.A("ŎũŰŉśĵŷļŵŋŻŏşŭŔŏŧŻũŞňŻŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[53] = NLoginCore_446.C("ӟӯҧӐӑүӬӔӬҴӲҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[54] = NLoginCore_575.C("ӎҬӜңӲӌҮӎӵӀӈҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[55] = NLoginCore_223.D("ӟӣҺүӮӉҴӈӳҶӧӉөӌҷӳӏӉӼӛӋӭӂӣӻԀӝӽӫӷӪӆӛөԋӢӐӼԈԄӶԊӭәӻԛԕӕԜӝӳԖӯԑӨө", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[56] = NLoginCore_324.B("ųłŶķķűşźřŝĻĿŮƂŵŞżŕſƁťŵŮŮŐŉőőƐŰƓƑ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[57] = NLoginCore_384.A("ũŭńĹŸœľŒŽŀűœųŖŁŽřœƆťŕŷŌŭƅƊŧƇŵƁŴŐťųƕŬŚƆƒƎƀƔŷţƅƥƟşƦŧŽƠŹƛŲų", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[58] = NLoginCore_110.F("ՎՂյՍմձհԼԼըՏՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[59] = NLoginCore_091.C("ӌӟӮңӧӏӫӯӉӗӐҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[60] = NLoginCore_092.A("ŬŗłķŐŝşŻŰŶĽŇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[61] = NLoginCore_027.B("ĸńŮůņŗųĹľķĹŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[62] = NLoginCore_324.F("գհՕՔճիՋդԵըՏՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[63] = NLoginCore_092.A("ŖũŸĭűřŵŹœšŚŇ", (byte)64, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_416.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŎŅŘŰūŊŨŞŬŕŠŲźſşŠŨņżşŨŭƉŎōňŧƔƀŲňƗŦƕťŷƚŪŖƍƌƞƋƑŶƎƚřťƄƢƉŹƉƧƭƊƭƣŽƱŧƴƘƒƫƩźƜƬŻƪƵƜƠƺƝǀǅƝƾƵƓƓƉǋƒƓ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[1] = NLoginCore_559.F("Ռ԰՟բձՉԭչՇՕՇՙՎսխքՎՓյ՝՟ֆ՛ատ֊՝խևՍբլֈՖդՏզջջֆֆթ՗ՠ֕ցպ֖֛֒ս֢բափֆի֗ջծ֍ւ։ִօֱֲ֣ևյ֎ֆֳս֐։֙տְֵַׇ֤֓֗׈֏֐", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[2] = NLoginCore_324.F("ԿզՖՒՎԷԴՆԶ՞ՒնծՍքխմձ՟սՄՒՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ՅըթԶՋՎՇմՈԵԾՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[4] = NLoginCore_427.D("ӀӯӈҨӏӧӄӣӋӅӢҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[5] = NLoginCore_110.B("ĲūŔŜŏļĵŗŨŠřĺĿŤŽŘœųŞƀŅūƇžŊŜŚƊŊŢžű", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[6] = NLoginCore_091.E("ԿշՐդԱլԭխժՋտրԳիչցՅէո՝ՆՆՊԾՈբվ՜֎տս֌", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[7] = NLoginCore_451.C("ҫӟөӒӃӊӥҮӃҷүҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[8] = NLoginCore_201.F("Ղիբյ՚չԵկՐԵտՎՁճծՓփւկՕՈՒՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[9] = NLoginCore_027.E("ՀթԿեԶյԴՋ՜ճՙՏՌցԹՒսբՏԺ֊բՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[10] = NLoginCore_559.F("ԱՕգծՆՈշՋե՘ՕՙւՀմՂԾ՜րյֈոՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[11] = NLoginCore_076.E("ՃԲՏՉՒԷՓ՛թձՑն՟գկԼֆջկձՂոՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[12] = NLoginCore_387.F("ԳՁՂըո԰ՋԼհԵսՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[13] = NLoginCore_427.E("կ՞ՊՆՇբճղՎՉՊ՚չՐԻ՘պ՝Թ՗֊ՒՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[14] = NLoginCore_559.E("ԯշԲՖհԵՙչԺՖՍյՎկխփՓշԿսՁֆՕեՖզ֊ջ֏ֆՒքֆզւՔո՘հ֛֓՚֎֙֍֗֌֍ծճռ֛յղկհ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[15] = NLoginCore_223.F("դծեիլԳթ՘Ց԰յՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[16] = NLoginCore_384.D("ҨӡӊӒӅҲҫӍӞӖӏҳӵҹӨӔӖӑӟӐҺӖԅӄӽԂӲӞԋӛԄӻ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[17] = NLoginCore_384.F("ԿշՐդԱլԭխժՋտըողՏխւհ՛՛ՅբՄգֈ՘՜Վվ֎ռև", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[18] = NLoginCore_575.F("բդՔԵՄշ՜ՒԴՖխՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[19] = NLoginCore_110.D("һӤӛӮӓӲҮӨӉҮӸӄӐӷӨӆӿӠӱӿӲӋӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[20] = NLoginCore_091.A("ŃŬłŨĹŸķŎşŶśŞĻĿŗůŤŲũņŸƋŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[21] = NLoginCore_091.C("ҺҾӌӎӒӏӧӋӮҶӊӴӘӬӺӒәӞӨӲӝӱӈӉ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[22] = NLoginCore_201.E("ղԵԭդՙմկԲն՞ՠՎ՞ծՑվհ՜ՅՠևֈՏՐ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[23] = NLoginCore_387.B("ūŎūĹĶĵİŹŲŗŒŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ŲšōŉŊťŶŵőŌŋŐŏőŀłŷŞƋŬŻţūŊƇŽŽƍƒƃŵƎűŧŚƑŎūũžŘƗšŧ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[25] = NLoginCore_559.B("œřŌňĳŸĴŮŵŵƀŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[26] = NLoginCore_091.B("ĲūŔŜŏļĵŗŨŠŖĺŭŹżœƆŦƈƂńƁŜſŠƅũžŞŏŖƀ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[27] = NLoginCore_559.D("ҸӰӉӝҪӥҦӦӣӄӷӮұӅӻӈӾӠӘӟӂӛӟӕӝԅӑӑӲԋӨӧ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[28] = NLoginCore_223.E("ԭՍյճԱ՚ԵՖինԾՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[29] = NLoginCore_324.F("Ղիբյ՚չԵկՐԵվմՕՏՋՐձչ՗՛՗ոՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[30] = NLoginCore_223.E("ՠճԿԳմ՗իՕՓՊՏՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[31] = NLoginCore_027.B("ĲūŔŜŏļĵŗŨŠřţŭŅŜŚŷŴŝŨŊťśƍſŇŚŮŢŒƐƄ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[32] = NLoginCore_223.E("ԿշՐդԱլԭխժՋսհծԴՏ՗ՓՔպ։Ձ՚Ֆիՠժ՘ս֏Վւ՞", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[33] = NLoginCore_324.E("ՈիյյԫԬԷԶՕՕչՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[34] = NLoginCore_384.B("ŅŮťŸŝżĸŲœĸƃĹŞŻšŐŦŅťƉŷŕŒœ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[35] = NLoginCore_076.A("šŃŖŔĮĻŉĸųŉšŞŠşŔşšŹŶūŞƇƍŋšŤƅŲœƄŷūťƔőŭŶœŧżŚŻŚŹŚƤťŲƜųƦƌƝƍūſŢƭƌƫƋƊƃƎƩƺƕƘƙƒŴƸƓƌƁƇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[36] = NLoginCore_027.C("ӥӣҿӡӏӝӰҲөӐӁӶҸӃӱҷӐӳҷӽӟӱӰӢӣԇҺӻӔӚӝӟӥӮӰӞӳӋӞӥӑԗԂӝ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[37] = NLoginCore_384.C("ӖҷӣӯӮҫӮҴӎӨӎӸӇӇӇӬӆӲӳӖӪӎӢӺӎӏӀӅӣӁӾӡӪԁԀӜԏӋԍӬӯԂԘԌԘԜӛӴԔԏӚӶԃԑӨө", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[38] = NLoginCore_384.E("լԵյյՕեՙՙՙ՗ծցյասՔջ՞ջՇզշՕտֈջւլց֑էՑՇց֊֎ոչդՓ֖յջդ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[39] = NLoginCore_091.A("ŏĳŢťŴŌİżŊŘŊŜőƀŰƇőŖŸŠŢƉŞŤƂƍŠŰƊŐťůƋřŧŒũžžƉƉŬřƃƄŝŹƐŸŢƇŹƕŵƅżƫƩƨƝųūŲƋƍƭƨƐżƺƻƿƎƸƁƇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[40] = NLoginCore_427.C("ӨӃӝӟҩӀҦӢӂҳҲӴӧӛӼӳӦӐҹӰӎӓӵӻӤӻԀӼӼӉӚҿ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[41] = NLoginCore_223.C("ҠӆҼҰӱӮӄҬҲӑӮҽ", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[42] = NLoginCore_004.C("ӟӣҺүӮӉҴӈӳҶӦӔӬӵӫӸӭӇӼӍӚҺҶӑӕӦӨӆӂӣӬӞӛӡӾӛӤӬӝӱӎԐԙӸӻӬӷԆӧԕӴӰԣԡӨө", (byte)64, 67);
                    NLoginCore_416.var_java_lang_String_arr_b[43] = NLoginCore_223.D("ӤҪӐҧӦӮөӐӨөҮӊҷҶӘӇӞҵҹҿӢӗӹӘӧӔӤӴӛӞӺӊ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[44] = NLoginCore_004.E("հՃՅՇ՘պհՋ՞շ՟Մ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[45] = NLoginCore_110.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔա։ոիՅՇդձ։ՐռՑ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[46] = NLoginCore_091.D("ӃҪӜӇӎҭӔӇӲӊҮӣӶӜҮӾӱӏӵӻӯӱӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[47] = NLoginCore_223.B("ŭİŪŉźŉķŠŋşŒŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[48] = NLoginCore_138.E("զՐ՟ԶժՂնթԷ՞թՄ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[49] = NLoginCore_027.D("ҾӏҺӞӦҭӲӉӦӭӕӃӳӶӝӺӷӌӹӴӁӱӈӉ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[50] = NLoginCore_201.E("զժՁԶյՐԻՏպԽխ՛ճռղտմՎփՔաՀ՚ֆիՇ՘Պ֋Սխժ։վ֐միղ֒Վվ֚ջդ", (byte)64, 69);
                    NLoginCore_416.var_java_lang_String_arr_b[51] = NLoginCore_091.F("ճՐԮլՐոյԻժշ՘՟ւՀբսՒզՠռա՘էլչՉ֍՘՜֌ՠմֈխււի֍ֆ֖֘֞կդ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[52] = NLoginCore_387.F("ՋզխՆ՘ԲմԹղՈշՓ՜գգհճքդՈօբՏՐ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[53] = NLoginCore_223.B("ũŘŷťūŮŕĻšŰŖŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[54] = NLoginCore_223.A("ķŔźœķŶŖűœŔŸĺťŘŞŀŹłźŖŜŻŒœ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[55] = NLoginCore_223.F("զժՁԶյՐԻՏպԽծՐհՓԾպՖՐփբՒմՉժւևդքղվձՍբհ֒թ՗փ֏֋ս֑յրլր֔չաճղռձ֨կհ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[56] = NLoginCore_091.A("ųłŶķķűşźřŝĻĿŮƂŵŞżŕſƁťźƇťźŋƁƉŪƆƖť", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[57] = NLoginCore_575.D("ӟӣҺүӮӉҴӈӳҶӧӉөӌҷӳӏӉӼӛӋӭӂӣӻԀӝӽӫӷӪӆӛөԋӢӐӼԈԄӶԊӭӵԇԏӲӬӶӫԔԟԀԡӨө", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[58] = NLoginCore_076.F("կմՊՠՅ՛մկԽ՚ՇՄ", (byte)64, 70);
                    NLoginCore_416.var_java_lang_String_arr_b[59] = NLoginCore_201.B("ŪŋŏŅŗŗŋŔŠőĹŇ", (byte)64, 66);
                    NLoginCore_416.var_java_lang_String_arr_b[60] = NLoginCore_110.D("ӠҿӯӝӌҭӜӪӡҳүҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[61] = NLoginCore_559.D("ӍӃҽӡӬӝӄҧӆӣӀҽ", (byte)64, 68);
                    NLoginCore_416.var_java_lang_String_arr_b[62] = NLoginCore_173.A("įźŇĲŷŽźŞůşĽŇ", (byte)64, 65);
                    NLoginCore_416.var_java_lang_String_arr_b[63] = NLoginCore_453.A("ĴķŕňőŭĻūĻŻŞŐŏŹŐņƆŲŔŊřťŒœ", (byte)64, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_416.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ӞӆҹҭӳұӔұӇӫӓҲӪӜӎӸӍӳӫӮӳԁӈӉ", (byte)64, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_416.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ӞӥӇӁӠӃӤӡӱӠӑӅӷҷӤӔӚәӵӵӶӛӈӉ", (byte)64, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_416.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("Ե՗ՙԹ՝ռմ֊նՅփչևցՊկ֑֐ֈ֎ֈ՝", (byte)81, 70), NLoginCore_416.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.A("ƄƑƐœƓƏƊƓƞƍŚƘƜƕƘƞŠӺӴӰӴӼӼӵӺӺӎӼԀԇŹ", (byte)81, 65) + string + NLoginCore_223.A("ś", (byte)81, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7379476068332547946L);
        var_int_c = 0x2000000 >>> 57 | 0x2000000 << -57;
        d = Integer.reverse(-1);
        e = Long.reverse(-7379476068332547946L);
        f = 0 >>> 167 | 0 << -167;
        g = (24576 >>> 138 | 24576 << -138) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        i = 0x4000000 >>> 186 | 0x4000000 << ~186 + 1;
        j = (0x2000000 >>> 248 | 0x2000000 << -248) & 0xFFFFFFFF;
        k = Integer.reverse(-1073741824);
        l = (0x20000000 >>> 123 | 0x20000000 << ~123 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(-1610612736);
        n = Integer.reverse(0x60000000);
        o = Integer.reverse(-536870912);
        p = Integer.reverse(0x10000000);
        q = Integer.reverse(-1879048192);
        r = Integer.reverse(0x50000000);
        s = Integer.reverse(-805306368);
        t = 3072 >>> 40 | 3072 << ~40 + 1;
        u = (0xD000000 >>> 120 | 0xD000000 << ~120 + 1) & 0xFFFFFFFF;
        v = Integer.reverse(0x70000000);
        w = (480 >>> 197 | 480 << -197) & 0xFFFFFFFF;
        x = 16 >>> 192 | 16 << -192;
        y = (0x110000 >>> 240 | 0x110000 << ~240 + 1) & 0xFFFFFFFF;
        z = 147456 >>> 45 | 147456 << ~45 + 1;
        aa = 0x60000002 >>> 221 | 0x60000002 << ~221 + 1;
        ab = 20480 >>> 42 | 20480 << ~42 + 1;
        ac = Integer.reverse(-1476395008);
        ad = Integer.reverse(0x68000000);
        ae = 92 >>> 130 | 92 << -130;
        af = (0x10000000 >>> 219 | 0x10000000 << ~219 + 1) & 0xFFFFFFFF;
        ag = Integer.reverse(-1);
        ah = Long.reverse(-7379476068332547946L);
        ai = Integer.reverse(-1073741824);
        aj = Long.reverse(-7235360880256692074L);
        ak = Long.reverse(0x200000000000000L);
        al = Integer.reverse(0);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = Integer.reverse(0x68000000);
        ao = 0 >>> 0 | 0 << ~0 + 1;
        ap = (0x40000000 >>> 94 | 0x40000000 << ~94 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(0x40000000);
        ar = 12 >>> 2 | 12 << ~2 + 1;
        as = Integer.reverse(0x20000000);
        at = Integer.reverse(-1610612736);
        au = (0x3000000 >>> 23 | 0x3000000 << -23) & 0xFFFFFFFF;
        av = (112 >>> 132 | 112 << ~132 + 1) & 0xFFFFFFFF;
        aw = 131072 >>> 142 | 131072 << ~142 + 1;
        ax = (294912 >>> 111 | 294912 << -111) & 0xFFFFFFFF;
        ay = 0x14000000 >>> 89 | 0x14000000 << ~89 + 1;
        az = (0x2C0000 >>> 210 | 0x2C0000 << ~210 + 1) & 0xFFFFFFFF;
        ba = (0x600000 >>> 243 | 0x600000 << -243) & 0xFFFFFFFF;
        bb = 212992 >>> 174 | 212992 << ~174 + 1;
        bc = Integer.reverse(0x70000000);
        bd = -268435456 >>> 188 | -268435456 << ~188 + 1;
        be = Integer.reverse(0x8000000);
        bf = Integer.reverse(-2013265920);
        bg = 0x48000000 >>> 218 | 0x48000000 << -218;
        bh = Integer.reverse(-939524096);
        bi = 0x50000000 >>> 26 | 0x50000000 << ~26 + 1;
        bj = Integer.reverse(-1476395008);
        bk = Integer.reverse(0);
        bl = 0x40000000 >>> 30 | 0x40000000 << -30;
        bm = 0 >>> 94 | 0 << ~94 + 1;
        bn = Integer.reverse(0);
        bo = Integer.reverse(Integer.MIN_VALUE);
        bp = (4 >>> 96 | 4 << -96) & 0xFFFFFFFF;
        bq = Long.reverse(-7235360880256692074L);
        br = Long.reverse(0x200000000000000L);
        bs = (0xA000000 >>> 121 | 0xA000000 << ~121 + 1) & 0xFFFFFFFF;
        bt = Long.reverse(-7379476068332547946L);
        bu = Integer.reverse(0x60000000);
        bv = Long.reverse(-7379476068332547946L);
        bw = (57344 >>> 141 | 57344 << ~141 + 1) & 0xFFFFFFFF;
        bx = (-1 >>> 138 | -1 << -138) & 0xFFFFFFFF;
        by = Long.reverse(-7379476068332547946L);
        bz = Integer.reverse(0x10000000);
        ca = Long.reverse(-7235360880256692074L);
        cb = Long.reverse(0x200000000000000L);
        cc = Integer.reverse(0);
        cd = 0x120000 >>> 145 | 0x120000 << ~145 + 1;
        ce = -1 >>> 48 | -1 << -48;
        cf = Long.reverse(-7379476068332547946L);
        cg = Integer.reverse(0x50000000);
        ch = Integer.reverse(-1);
        ci = Long.reverse(-7379476068332547946L);
        cj = Integer.reverse(-805306368);
        ck = (-1 >>> 165 | -1 << -165) & 0xFFFFFFFF;
        cl = Long.reverse(-7379476068332547946L);
        cm = Integer.reverse(0x30000000);
        cn = Long.reverse(-7235360880256692074L);
        co = Long.reverse(0x200000000000000L);
        cp = 104 >>> 3 | 104 << ~3 + 1;
        cq = Long.reverse(-7235360880256692074L);
        cr = Long.reverse(0x200000000000000L);
        cs = -1073741823 >>> 253 | -1073741823 << -253;
        ct = Long.reverse(-7235360880256692074L);
        cu = Long.reverse(0x200000000000000L);
        cv = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        cw = (7680 >>> 233 | 7680 << -233) & 0xFFFFFFFF;
        cx = Long.reverse(-7235360880256692074L);
        cy = Long.reverse(0x200000000000000L);
        cz = Integer.reverse(0x8000000);
        da = Long.reverse(-7235360880256692074L);
        db = Long.reverse(0x200000000000000L);
        dc = Integer.reverse(-2013265920);
        dd = Long.reverse(-7235360880256692074L);
        de = Long.reverse(0x200000000000000L);
        df = Integer.reverse(0x48000000);
        dg = Long.reverse(-7235360880256692074L);
        dh = Long.reverse(0x200000000000000L);
        di = 0x60000002 >>> 189 | 0x60000002 << -189;
        dj = Long.reverse(-7379476068332547946L);
        dk = Integer.reverse(0);
        dl = 10240 >>> 9 | 10240 << ~9 + 1;
        dm = Long.reverse(-7379476068332547946L);
        dn = 0x15000000 >>> 184 | 0x15000000 << -184;
        cfr_renamed_1 = Long.reverse(-7379476068332547946L);
        dp = 0x580000 >>> 50 | 0x580000 << -50;
        dq = Long.reverse(-7235360880256692074L);
        dr = Long.reverse(0x200000000000000L);
        ds = 94208 >>> 44 | 94208 << ~44 + 1;
        dt = (-1 >>> 64 | -1 << -64) & 0xFFFFFFFF;
        du = Long.reverse(-7379476068332547946L);
        dv = (3072 >>> 167 | 3072 << -167) & 0xFFFFFFFF;
        dw = Long.reverse(-7235360880256692074L);
        dx = Long.reverse(0x200000000000000L);
        dy = 0 >>> 211 | 0 << -211;
        dz = Integer.reverse(-1744830464);
        ea = Long.reverse(-7235360880256692074L);
        eb = Long.reverse(0x200000000000000L);
        ec = (0x3400000 >>> 213 | 0x3400000 << -213) & 0xFFFFFFFF;
        ed = Long.reverse(-7379476068332547946L);
        ee = Integer.reverse(-671088640);
        ef = (-1 >>> 194 | -1 << -194) & 0xFFFFFFFF;
        eg = Long.reverse(-7379476068332547946L);
        eh = Integer.reverse(0x38000000);
        ei = Long.reverse(-7379476068332547946L);
        ej = 0x3A000000 >>> 185 | 0x3A000000 << ~185 + 1;
        ek = Integer.reverse(-1);
        el = Long.reverse(-7379476068332547946L);
        em = Integer.reverse(0);
        en = Integer.reverse(0x78000000);
        eo = Long.reverse(-7235360880256692074L);
        ep = Long.reverse(0x200000000000000L);
        eq = (31 >>> 160 | 31 << -160) & 0xFFFFFFFF;
        er = Long.reverse(-7379476068332547946L);
        es = (524288 >>> 110 | 524288 << -110) & 0xFFFFFFFF;
        et = Long.reverse(-7235360880256692074L);
        eu = Long.reverse(0x200000000000000L);
        ev = Integer.reverse(-2080374784);
        ew = Long.reverse(-7235360880256692074L);
        ex = Long.reverse(0x200000000000000L);
        ey = (557056 >>> 206 | 557056 << -206) & 0xFFFFFFFF;
        ez = Long.reverse(-7235360880256692074L);
        fa = Long.reverse(0x200000000000000L);
        fb = 0 >>> 12 | 0 << ~12 + 1;
        fc = Integer.reverse(0);
        fd = Integer.reverse(0x40000000);
        fe = (573440 >>> 14 | 573440 << -14) & 0xFFFFFFFF;
        ff = Long.reverse(-7379476068332547946L);
        fg = Integer.reverse(0);
        fh = Integer.reverse(Integer.MIN_VALUE);
        fi = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        fj = 0x8000000 >>> 59 | 0x8000000 << ~59 + 1;
        fk = (128 >>> 102 | 128 << ~102 + 1) & 0xFFFFFFFF;
        fl = Integer.reverse(0);
        fm = Integer.reverse(0x24000000);
        fn = Long.reverse(-7235360880256692074L);
        fo = Long.reverse(0x200000000000000L);
        fp = Integer.reverse(Integer.MIN_VALUE);
        fq = Integer.reverse(-1543503872);
        fr = Long.reverse(-7379476068332547946L);
        fs = 622592 >>> 14 | 622592 << -14;
        ft = Long.reverse(-7379476068332547946L);
        fu = (78 >>> 161 | 78 << ~161 + 1) & 0xFFFFFFFF;
        fv = Long.reverse(-7235360880256692074L);
        fw = Long.reverse(0x200000000000000L);
        fx = Integer.reverse(0x14000000);
        fy = Long.reverse(-7235360880256692074L);
        fz = Long.reverse(0x200000000000000L);
        ga = (262144 >>> 178 | 262144 << -178) & 0xFFFFFFFF;
        gb = (0 >>> 235 | 0 << ~235 + 1) & 0xFFFFFFFF;
        gc = 0 >>> 56 | 0 << -56;
        gd = Integer.reverse(-1811939328);
        ge = Long.reverse(-7379476068332547946L);
        gf = Integer.reverse(0x54000000);
        gg = Long.reverse(-7235360880256692074L);
        gh = Long.reverse(0x200000000000000L);
        gi = Integer.reverse(-738197504);
        gj = Long.reverse(-7235360880256692074L);
        gk = Long.reverse(0x200000000000000L);
        gl = 0x5800000 >>> 85 | 0x5800000 << ~85 + 1;
        gm = Integer.reverse(-1);
        gn = Long.reverse(-7379476068332547946L);
        go = (0 >>> 115 | 0 << -115) & 0xFFFFFFFF;
        gp = Integer.reverse(0);
        gq = (0x800000 >>> 151 | 0x800000 << -151) & 0xFFFFFFFF;
        gr = 0x10000000 >>> 60 | 0x10000000 << ~60 + 1;
        gs = (0 >>> 251 | 0 << -251) & 0xFFFFFFFF;
        gt = Integer.reverse(0x20000000);
        gu = 1024 >>> 138 | 1024 << ~138 + 1;
        gv = 0x2000000 >>> 57 | 0x2000000 << ~57 + 1;
        gw = Integer.reverse(Integer.MIN_VALUE);
        gx = Integer.reverse(Integer.MIN_VALUE);
        gy = (0x5A0000 >>> 209 | 0x5A0000 << ~209 + 1) & 0xFFFFFFFF;
        gz = Long.reverse(-7235360880256692074L);
        ha = Long.reverse(0x200000000000000L);
        hb = Integer.reverse(0x74000000);
        hc = Long.reverse(-7379476068332547946L);
        hd = Integer.reverse(-201326592);
        he = Long.reverse(-7235360880256692074L);
        hf = Long.reverse(0x200000000000000L);
        hg = Integer.reverse(0xC000000);
        hh = (-1 >>> 195 | -1 << ~195 + 1) & 0xFFFFFFFF;
        hi = Long.reverse(-7379476068332547946L);
        hj = 12544 >>> 136 | 12544 << ~136 + 1;
        hk = Integer.reverse(-1);
        hl = Long.reverse(-7379476068332547946L);
        hm = Integer.reverse(0);
        hn = (204800 >>> 76 | 204800 << ~76 + 1) & 0xFFFFFFFF;
        ho = Long.reverse(-7379476068332547946L);
        hp = Integer.reverse(-872415232);
        hq = Long.reverse(-7235360880256692074L);
        hr = Long.reverse(0x200000000000000L);
        hs = 0 >>> 180 | 0 << -180;
        ht = Integer.reverse(0);
        hu = Integer.reverse(0x40000000);
        hv = Integer.reverse(0x2C000000);
        hw = Long.reverse(-7379476068332547946L);
        hx = Integer.reverse(0);
        hy = 0x350000 >>> 112 | 0x350000 << -112;
        hz = Long.reverse(-7379476068332547946L);
        ia = (0x36000000 >>> 184 | 0x36000000 << -184) & 0xFFFFFFFF;
        ib = Long.reverse(-7235360880256692074L);
        ic = Long.reverse(0x200000000000000L);
        id = Integer.reverse(Integer.MIN_VALUE);
        ie = Integer.reverse(-335544320);
        cfr_renamed_0 = (-1 >>> 154 | -1 << -154) & 0xFFFFFFFF;
        ig = Long.reverse(-7379476068332547946L);
        ih = 0x700000 >>> 17 | 0x700000 << ~17 + 1;
        ii = Long.reverse(-7235360880256692074L);
        ij = Long.reverse(0x200000000000000L);
        ik = Integer.reverse(0);
        il = 14592 >>> 40 | 14592 << ~40 + 1;
        im = Long.reverse(-7235360880256692074L);
        in = Long.reverse(0x200000000000000L);
        io = Integer.reverse(0x5C000000);
        ip = Integer.reverse(-1);
        iq = Long.reverse(-7379476068332547946L);
        ir = 0 >>> 60 | 0 << -60;
        is = Integer.reverse(Integer.MIN_VALUE);
        it = Integer.reverse(0x40000000);
        iu = Integer.reverse(0);
        iv = 62976 >>> 201 | 62976 << ~201 + 1;
        iw = Integer.reverse(Integer.MIN_VALUE);
        ix = Integer.reverse(-1107296256);
        iy = (0x400000 >>> 54 | 0x400000 << ~54 + 1) & 0xFFFFFFFF;
        iz = 0 >>> 159 | 0 << -159;
        ja = Integer.reverse(-603979776);
        jb = Long.reverse(-7235360880256692074L);
        jc = Long.reverse(0x200000000000000L);
        jd = Integer.reverse(Integer.MIN_VALUE);
        je = Integer.reverse(0x3C000000);
        jf = Long.reverse(-7235360880256692074L);
        jg = Long.reverse(0x200000000000000L);
        jh = Integer.reverse(-1140850688);
        ji = Long.reverse(-7235360880256692074L);
        jj = Long.reverse(0x200000000000000L);
        jk = Integer.reverse(0x7C000000);
        jl = Long.reverse(-7379476068332547946L);
        jm = Integer.reverse(-67108864);
        jn = -1 >>> 37 | -1 << -37;
        jo = Long.reverse(-7379476068332547946L);
        jp = Integer.reverse(0x2000000);
        jq = Integer.reverse(0x2000000);
        var_java_lang_String_arr_a = new String[jp];
        var_java_lang_String_arr_b = new String[jq];
        NLoginCore_416.b();
    }

    private long a(Object object) {
        if (object instanceof String) {
            String string = (String)object;
            if (string.isEmpty() || ((String)NLoginCore_416.c("㺀", (int)(jm & jn), (long)jo)).equalsIgnoreCase(string)) {
                return System.currentTimeMillis();
            }
            try {
                return Long.parseLong(string);
            }
            catch (NumberFormatException numberFormatException) {
                return System.currentTimeMillis();
            }
        }
        if (object instanceof Number) {
            return ((Number)object).longValue();
        }
        if (object instanceof Timestamp) {
            return ((Timestamp)object).getTime();
        }
        return System.currentTimeMillis();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    NLoginCore_171 a(NLoginCore_459 NLoginCore_459, String string, Object ... objectArray) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_416.c("㺀", (int)fq, (long)fr));
        }
        if (objectArray.length == 0) {
            throw new IllegalArgumentException((String)NLoginCore_416.c("㺃", (int)fs, (long)ft));
        }
        if (NLoginCore_459 == null) {
            throw new IllegalStateException((String)NLoginCore_416.c("㺆", (int)fu, (long)(fv ^ fw)));
        }
        long l = System.nanoTime();
        try {
            Object[] objectArray2 = new Object[ga];
            objectArray2[NLoginCore_416.gb] = NLoginCore_532.e.a(new Object[gc]);
            String string2 = String.format((String)NLoginCore_416.c("㺉", (int)fx, (long)(fy ^ fz)), objectArray2) + (String)NLoginCore_416.c("㺌", (int)gd, (long)ge) + string;
            NLoginCore_171 NLoginCore_171 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a(string2, objectArray);
            return NLoginCore_171;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_416.c("㺏", (int)gf, (long)(gg ^ gh)) + string + (String)NLoginCore_416.c("㺒", (int)gi, (long)(gj ^ gk)) + Arrays.toString(objectArray) + (String)NLoginCore_416.c("㺕", (int)(gl & gm), (long)gn), exception, new Object[go]);
        }
        finally {
            NLoginCore_548.a(NLoginCore_425.var_com_nickuc_login_NLoginCore_425_i, l);
        }
        return null;
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0x1D2695394BEF2355L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(42 + 27), (byte)(55 + 28), (byte)(8 + 39), (byte)(20 + 47), (byte)(11 + 55), (byte)(39 + 28), (byte)(10 + 37), (byte)(37 + 43), (byte)(57 + 18), (byte)(33 + 34), (byte)(53 + 30), (byte)(8 + 45), (byte)(73 + 7), (byte)(20 + 77), (byte)(62 + 38), (byte)(85 + 15), 105, (byte)(12 + 98), (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.D("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߨߢߞߢߪߪߣߨߨ޼ߪ߮ߵ", (byte)30, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_416.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    NLoginCore_416() {
    }

    private boolean d(@Nonnull String string) {
        return (string.length() >= it && string.charAt(iu) == iv && string.charAt(string.length() - iw) == ix ? iy : iz) != 0;
    }
}

