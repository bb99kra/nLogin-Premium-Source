/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_129;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_209;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_399;
import com.nickuc.login.NLoginCore_011;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_260;
import com.nickuc.login.NLoginCore_554;
import com.nickuc.login.NLoginCore_373;
import com.nickuc.login.NLoginCore_046;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_341;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_253;
import com.nickuc.login.NLoginCore_025;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_160;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_157;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_417;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_310;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_290;
import com.nickuc.login.NLoginCore_298;
import com.nickuc.login.NLoginCore_448;
import com.nickuc.login.NLoginCore_545;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_478
extends Enum<NLoginCore_478> {
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_a;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_b;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_c;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_d;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_e;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_f;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_g;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_h;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_i;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_j;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_k;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_l;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_m;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_n;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_o;
    public static final /* enum */ NLoginCore_478 var_com_nickuc_login_NLoginCore_478_p;
    private final Class<?> var_java_lang_Class____a;
    private final String var_java_lang_String_l;
    private final boolean var_boolean_m;
    private final Class<?>[] var_java_lang_Class____arr_a;
    private boolean var_boolean_n;
    private static final /* synthetic */ NLoginCore_478[] var_com_nickuc_login_NLoginCore_478_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static long var_long_d;
    private static long var_long_e;
    private static int var_int_f;
    private static int var_int_g;
    private static long var_long_h;
    private static int var_int_i;
    private static int var_int_j;
    private static long var_long_k;
    private static int var_int_l;
    private static long var_long_m;
    private static long var_long_n;
    private static int var_int_o;
    private static int var_int_p;
    private static long q;
    private static int r;
    private static long s;
    private static long t;
    private static int u;
    private static int v;
    private static long w;
    private static int x;
    private static int y;
    private static int z;
    private static int aa;
    private static int ab;
    private static long ac;
    private static long ad;
    private static int ae;
    private static long af;
    private static int ag;
    private static long ah;
    private static long ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static long an;
    private static long ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static int as;
    private static int at;
    private static long au;
    private static long av;
    private static int aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static int ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static int bf;
    private static int bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static long bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static int bt;
    private static int bu;
    private static int bv;
    private static int bw;
    private static int bx;
    private static int by;
    private static int bz;
    private static int ca;
    private static int cb;
    private static int cc;
    private static int cd;
    private static int ce;
    private static int cf;
    private static int cg;
    private static int ch;
    private static int ci;
    private static int cj;
    private static int ck;
    private static int cl;
    private static long cm;
    private static int cn;
    private static int co;
    private static int cp;
    private static int cq;
    private static int cr;
    private static long cs;
    private static long ct;
    private static int cu;
    private static int cv;
    private static int cw;
    private static int cx;
    private static int cy;
    private static long cz;
    private static long da;
    private static int db;
    private static int dc;
    private static int dd;
    private static int de;
    private static int df;
    private static int dg;
    private static int dh;
    private static int di;
    private static int dj;
    private static long dk;
    private static int dl;
    private static int dm;
    private static int dn;
    private static int cfr_renamed_1;
    private static int dp;
    private static long dq;
    private static int dr;
    private static int ds;
    private static int dt;
    private static int du;
    private static int dv;
    private static long dw;
    private static int dx;
    private static int dy;
    private static int dz;
    private static int ea;
    private static int eb;
    private static int ec;
    private static long ed;
    private static int ee;
    private static int ef;
    private static int eg;
    private static int eh;
    private static int ei;
    private static int ej;
    private static int ek;
    private static long el;
    private static long em;
    private static int en;
    private static int eo;
    private static long ep;
    private static int eq;
    private static int er;
    private static int es;
    private static long et;
    private static long eu;
    private static int ev;
    private static int ew;
    private static long ex;
    private static long ey;
    private static int ez;
    private static int fa;
    private static int fb;
    private static long fc;
    private static long fd;
    private static int fe;
    private static int ff;
    private static int fg;
    private static int fh;
    private static int fi;
    private static int fj;
    private static long fk;
    private static long fl;
    private static int fm;
    private static int fn;
    private static int fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private static long fs;
    private static long ft;
    private static int fu;
    private static int fv;
    private static long fw;
    private static long fx;
    private static int fy;
    private static int fz;
    private static int ga;
    private static long gb;
    private static long gc;
    private static int gd;
    private static int ge;
    private static int gf;
    private static long gg;
    private static int gh;
    private static int gi;
    private static int gj;
    private static long gk;
    private static int gl;
    private static int gm;
    private static int gn;
    private static long go;
    private static int gp;
    private static int gq;
    private static int gr;
    private static long gs;
    private static long gt;
    private static int gu;
    private static int gv;
    private static int gw;
    private static int gx;
    private static int gy;
    private static long gz;
    private static long ha;
    private static int hb;
    private static int hc;
    private static int hd;
    private static int he;

    public static void a(nLoginBukkit nLoginBukkit2, boolean bl) {
        NLoginType_008 NLoginType_008 = nLoginBukkit2.com_nickuc_login_NLoginType_008_a();
        NLoginCore_478[] NLoginCore_478Array = NLoginCore_478.values();
        int n = NLoginCore_478Array.length;
        for (int i = z; i < n; ++i) {
            NLoginCore_478 NLoginCore_4782 = NLoginCore_478Array[i];
            if (!NLoginCore_4782.var_boolean_m) continue;
            Object[] objectArray = new Object[((NLoginCore_478)NLoginCore_4782.var_com_nickuc_login_NLoginCore_478_a).length];
            for (int j = aa; j < objectArray.length; ++j) {
                NLoginCore_478 NLoginCore_4783 = NLoginCore_4782.var_com_nickuc_login_NLoginCore_478_a[j];
                if (NLoginCore_187.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = NLoginType_008.com_nickuc_login_NLoginCore_187_a();
                    continue;
                }
                if (NLoginInterface_030.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = NLoginType_008.com_nickuc_login_NLoginInterface_030_b();
                    continue;
                }
                if (NLoginCore_310.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = NLoginType_008.com_nickuc_login_NLoginType_005_b();
                    continue;
                }
                if (NLoginType_008.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = NLoginType_008;
                    continue;
                }
                if (nLoginBukkit.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = nLoginBukkit2;
                    continue;
                }
                if (NLoginCore_209.class.isAssignableFrom((Class<?>)((Object)NLoginCore_4783))) {
                    objectArray[j] = NLoginType_008.com_nickuc_login_NLoginCore_056_b();
                    continue;
                }
                throw new UnsupportedOperationException((String)NLoginCore_478.c("㺀", (int)ab, (long)(ac ^ ad)) + (Object)((Object)NLoginCore_4782) + (String)NLoginCore_478.c("㺃", (int)ae, (long)af) + (Object)((Object)NLoginCore_4783));
            }
            NLoginCore_4782.a(nLoginBukkit2, objectArray);
        }
        Object[] objectArray = new Object[ak];
        objectArray[NLoginCore_478.al] = nLoginBukkit2;
        (NLoginCore_298.a((String)NLoginCore_478.c("㺆", (int)ag, (long)(ah ^ ai)), new String[aj]) ? var_com_nickuc_login_NLoginCore_478_e : var_com_nickuc_login_NLoginCore_478_d).a(nLoginBukkit2, objectArray);
        if (NLoginCore_298.a((String)NLoginCore_478.c("㺉", (int)am, (long)(an ^ ao)), new String[ap])) {
            Object[] objectArray2 = new Object[aq];
            objectArray2[NLoginCore_478.ar] = NLoginType_008;
            objectArray2[NLoginCore_478.as] = NLoginType_008.com_nickuc_login_NLoginType_005_b();
            var_com_nickuc_login_NLoginCore_478_k.a(nLoginBukkit2, objectArray2);
        } else if (NLoginCore_298.a((String)NLoginCore_478.c("㺌", (int)at, (long)(au ^ av)), new String[aw])) {
            Object[] objectArray3 = new Object[ax];
            objectArray3[NLoginCore_478.ay] = nLoginBukkit2;
            objectArray3[NLoginCore_478.az] = NLoginType_008.com_nickuc_login_NLoginType_005_b();
            var_com_nickuc_login_NLoginCore_478_j.a(nLoginBukkit2, objectArray3);
        }
        if (!NLoginCore_157.var_boolean_p) {
            Object[] objectArray4 = new Object[ba];
            objectArray4[NLoginCore_478.bb] = nLoginBukkit2;
            objectArray4[NLoginCore_478.bc] = NLoginType_008.com_nickuc_login_NLoginCore_056_b();
            objectArray4[NLoginCore_478.bd] = bl;
            var_com_nickuc_login_NLoginCore_478_g.a(nLoginBukkit2, objectArray4);
        }
        Object[] objectArray5 = new Object[be];
        objectArray5[NLoginCore_478.bf] = nLoginBukkit2;
        objectArray5[NLoginCore_478.bg] = NLoginType_008.com_nickuc_login_NLoginCore_187_a();
        objectArray5[NLoginCore_478.bh] = NLoginType_008.com_nickuc_login_NLoginCore_056_b();
        objectArray5[NLoginCore_478.bi] = bl;
        var_com_nickuc_login_NLoginCore_478_c.a(nLoginBukkit2, objectArray5);
        if (!bl && NLoginCore_298.a((String)NLoginCore_478.c("㺏", (int)(bj & bk), (long)NLoginCore_478.bl), new String[bm])) {
            Object[] objectArray6 = new Object[bn];
            objectArray6[NLoginCore_478.bo] = nLoginBukkit2.com_nickuc_login_NLoginType_008_a();
            var_com_nickuc_login_NLoginCore_478_f.a(nLoginBukkit2, objectArray6);
        }
        Object[] objectArray7 = new Object[bp];
        objectArray7[NLoginCore_478.bq] = nLoginBukkit2;
        (NLoginCore_290.r ? var_com_nickuc_login_NLoginCore_478_p : var_com_nickuc_login_NLoginCore_478_o).a(nLoginBukkit2, objectArray7);
    }

    public void a(nLoginBukkit nLoginBukkit2, Object ... objectArray) {
        NLoginInterface_013 NLoginInterface_0132 = this.a(objectArray);
        if (NLoginInterface_0132 == null) {
            return;
        }
        nLoginBukkit2.a(NLoginInterface_0132, new NLoginInterface_013[x]);
        this.var_boolean_n = y;
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0xDF5965E6B8ADE41DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(25 + 44), 83, (byte)(36 + 11), (byte)(49 + 18), (byte)(7 + 59), (byte)(65 + 2), (byte)(27 + 20), (byte)(3 + 77), (byte)(25 + 50), 67, (byte)(70 + 13), (byte)(8 + 45), (byte)(36 + 44), (byte)(55 + 42), (byte)(66 + 34), (byte)(14 + 86), (byte)(104 + 1), (byte)(46 + 64), (byte)(63 + 40)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡩ࡝ࡺࡱ࡮ࢃࡱࡰࢇࡨࢇࢊࡼࢇࢂ", (byte)80, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_478.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_478 valueOf(String string) {
        return Enum.valueOf(NLoginCore_478.class, string);
    }

    private static void b() {
        int n;
        var_long_c = -8673718443652665472L;
        long l = var_long_c ^ 0xDF5965E6B8ADE41DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(51 + 18), (byte)(21 + 62), (byte)(22 + 25), (byte)(20 + 47), (byte)(60 + 6), (byte)(4 + 63), (byte)(6 + 41), (byte)(16 + 64), (byte)(24 + 51), 67, (byte)(5 + 78), (byte)(7 + 46), (byte)(58 + 22), (byte)(67 + 30), (byte)(68 + 32), (byte)(99 + 1), (byte)(54 + 51), 110, (byte)(12 + 91)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_478.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ӸԁӟӵԄӵӱԄӷӵӕԂӌӦԏӨӻӃӈӧӠӠԒӭӖөӤԃԆӷԇԗӫӝӛӰӯӭԄӻӺԛԖӿӾԮԞԈԉԁԳӾԃӽӺӻ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[1] = NLoginCore_387.E("ջՎՅՍՈիՔճղտՑՊ", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[2] = NLoginCore_110.D("ӿӬӢӚӟҿӎӀӨӄӚӏ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[3] = NLoginCore_173.E("էԶՔԻ՜ՍհժկոՄպՁ՟տ֊օչփշՏվՕՖ", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[4] = NLoginCore_324.E("եՔէ՘մՕԻԽցլԼհԽջդաց֊ժՙ՗Նփբ։մտ֒բև֊֘֕֓՛֜՛֗մբ֒կ֤՝ռֆ֚ՠռե֭ծք֮յն", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ŎŀŏŴŜƃŊśŜƄŽņţŐŢŽƍŶƒŗŊűƗƉŘƍžƙƒűƣƏƄƠſƆŤŸƘſŨūŸƟƅƊưżŰƆŲƊƶƁžſ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[6] = NLoginCore_446.A("ŌŖŅŐŨųŶťŴśƈœ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[7] = NLoginCore_138.E("յԮՊԷ՜ԾԽցդՑդկ՛ֈըւսոՊեա֑֐թձ֒կւ֔հ՘ՙնՖ֞։֋լ֠֞լր՟֡պէե֫ս֟֋֯ոզկփկխ֞րֈַւ֭", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[8] = NLoginCore_138.C("ԀӓӊӒӍӰәӸӷԄӖӏ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[9] = NLoginCore_201.E("եԹ՚ճՉՌՔվՑճՍնեճ՞վֆՕւռ՝քւ֓֐ՠ֐եՕոՔփզթ֍կ֝հր՚֠հ՝֠ֆ֚֞պտ֟֋չ֋պօ֓֠֯կձ֐ְֳ֤", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[10] = NLoginCore_027.C("ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԉԇԘԕӥԕӪӚӽәԈӫӮԒӴԢӵԅӟԥӵӢԅӬӬӨԄӦԬӨԤԔӧԀԆԖӸӵԸԭԑԭԗԲӼӿԴԡԺԖԱԚԹԠԃՌՌԧՄԮԍՂՑԥՓԚԛ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[11] = NLoginCore_453.B("ŝŭŷƅņşƇŽžƉũŏũƃũŮţƐƃŷƌŸŸŔŎƔƑŕƛŮƟŮśŻŹƓşƢƧƌƦơƅťůƈūƍŮŮƖƵŷƇƙƬŮƭźŽƕƚƝƋſƥưƥǉƹƖƋǁǃƍƓ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[12] = NLoginCore_387.B("ŮłţżŒŕŝƇŚżŖſŮżŧƇƏŞƋƅŦƐƇŹƆƘŔŵƑŹƋůƢƢżƇşŤƣƅƀťƂŬƧƠƉƞƫƍƞŭƹŴƯƬƲƇƴƌƱưƿƖźƎƮƟơƘǆǋǆǈƊƹƪƾƨƴƩǕƐǓǇƪƮǋƫƷƜǘƛƽǞǖǣƭǣǧǉǆǀǌǣǚǨǬǏƼǱǁǓƳǮǑǂǑƾƿ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[13] = NLoginCore_201.B("ŖŁůżŸƇňŇƁŹźŹŢƋŉŨŽƋƗƔŲűŞş", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[14] = NLoginCore_091.B("ƅŹŮƁŁŻŞżţƋŞşŬŃŎƂƅƏşŰƀƐŭƖƎŖƐűƈŠƁų", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[15] = NLoginCore_092.E("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈՎ֐ռտֈՋւ֑֓ժշ", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[16] = NLoginCore_223.C("ӑӗԁԀԅӮӳԀӢӔӅҽӖӵԌԐӫԊӍӪԍԂӠӓԒәӱԊԍԞӸԍ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[17] = NLoginCore_004.D("ӡҽӿӫԀӟҼӦӨӹӪӆӃӦӾӅӯԍӢԇԓӝӫԁӭԏӮӗӬӛӭԑԕӡԓԗԛԝԝԛӧԖӡӯ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[18] = NLoginCore_027.D("ӏӬҿӞӵӳӓӗӚԊҼӝӗԄӞӭԅԎӚԍӾӨӥӭԊӖӴӑӺԈӼԌԙԁԜӠԁӞԤәԗԃԤӯ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[19] = NLoginCore_173.B("żżűŇſƊŒũŦŬżżƆŧŚŅũƋƉţƈŖƐƘŗŜƆŰŜƏƏƐ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[20] = NLoginCore_091.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍԖԊԀӢԒԕԌԚӬӱӬ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[21] = NLoginCore_324.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞŰƛųŲƑƝťųſƗƍƢƯƐũƟƤūűƁƵƫƎƮƆŸŴƱƬƭƌźƲƳŸƒźƳƤƗƧǋƼƓ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[22] = NLoginCore_223.C("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӎӲӰӮԑӵԇӫԇԊӱ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[23] = NLoginCore_027.E("զհՍոՇԻծնն՞տպ՝բՄ՘վդՕ֎ՋՐ֑֒ՌՊօնգնֆՕռհ՗ֈ՘֚՟նգ՚֍֑ր֛֥֨ռ֧֊֬թ֣֍֊֤֞֝տֈյւ֧֒֗յֲ֛֭֓֬֏պֻ֊", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[24] = NLoginCore_138.C("ӽӰӘӘӵӏӮӟӗӺԇӜԁӣӡӹӚӎӨԐԏӤӞӐӨԘӗԐԙԗԈԗӬԠӫԋԒԍӽԠԈԛԘӯ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[25] = NLoginCore_223.F("ոիՓՓհՊթ՚Ւյւ՗ռ՞՜մՕՉգ֋֊առրՓ։՝խ֎ծ֋ի֎֋սթ֛մ՜՜ցկչժ", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[26] = NLoginCore_223.B("żżűŇſƊŒũŦŬžƉŭśżƎƅťţſƑŋŌŔƗŕƏƐŘŘŲŲ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[27] = NLoginCore_138.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔƗƘƃƚŗŰƠūžžƣƃƦſƝƑƈŪūƟżƅŨƙơƨƍƉƦƌƈƈƤųŸųƴƑƶŽǂƲƱ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[28] = NLoginCore_076.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӋӪӕӥӒԈӍӨԐӽԖ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[29] = NLoginCore_091.B("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞźűŴƃſſŦƃƜƋƯŸſƭƂƌŮƳƑƆƑƸŵƕƌƹƹƇƊƹƬſ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[30] = NLoginCore_451.C("ӲӗӗһӍӣәӐӺӡӘԌӖԎӧӗӫӣӧӬӎӕӱԓӏԉӕԄӱӷӘӬӞԠԢӼԔԚӡԧԜӾӾӯ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[31] = NLoginCore_091.D("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕӫԁӒӓӢӒԙӱӳӺԋԏԐәӴӰԟԁԁӨԓԋӢӶԋԮӭԙԝԝԊӿԥӭ԰ԩԖԛԈԚԒԺ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[32] = NLoginCore_091.E("՜Ըպզջ՚Էագմծ՞նրն֋ճխջռ։ծ֒՜վսկ֖էշ֌֎", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[33] = NLoginCore_387.D("ӡҽӿӫԀӟҼӦӨӹӫӜԀӉԋԃӋӻԌԈӦӤӾӉӢӐӻӼӒԝӖӿԝӸԣԂӹԍӦӢԈԝԨӯ", (byte)70, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_478.var_java_lang_String_arr_b[0] = NLoginCore_173.E("ճռ՚հտհլտղհՐսՇա֊գնԾՃբ՛՛֍ըՑդ՟վցղւ֒զ՘Ֆիժըտնյ֖֏աօ֡֙։ճբ֮փ֗ոյն", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ŔšŷƁųŜŔłƌŢƌœ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[2] = NLoginCore_451.A("řľŮřŻŸƇŚŦŻżœ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[3] = NLoginCore_173.B("ŰĿŝńťŖŹųŸƁńŗŭſŢşŽƇųūƉűŞş", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[4] = NLoginCore_173.B("ŮŝŰšŽŞńņƊŵŅŹņƄŭŪƊƓųŢŠŏƌūƒŽƈƛūƐƓơƞƜŤƥŤƠŽūƛŸƭůżƪƂūƃƈƑƅųƨƊƤƖźƈƒǁƵƐƔ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[5] = NLoginCore_575.B("ŎŀŏŴŜƃŊśŜƄŽņţŐŢŽƍŶƒŗŊűƗƉŘƍžƙƒűƣƏƄƠſƆŤŸƘſŨūŸƦưƲƬƜſƒųƑƏƮƔƲżųƸƕƹƋƒƐ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[6] = NLoginCore_076.A("ŸƄŻşżŉŖŽƂŕƀœ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[7] = NLoginCore_223.A("žķœŀťŇņƊŭŚŭŸŤƑűƋƆƁœŮŪƚƙŲźƛŸƋƝŹšŢſşƧƒƔŵƩƧŵƉŨƪƃŰŮƴƆƨƔƸƁűƈźƝƐƎƇŹƕžǀ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[8] = NLoginCore_076.E("՜Ֆո՞ՎժՊշհ՛ՍՊ", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[9] = NLoginCore_387.D("ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԉԇԘԕӥԕӪӚӽәԈӫӮԒӴԢӵԅӟԥӵӢԥԋԣԟӿԄԤԐӾԐԀԢԴԪԪԶԑԨԸӸԮԜԊӺԵԂՀԼӽԾԪՈԏ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[10] = NLoginCore_027.F("եԹ՚ճՉՌՔվՑճՍնեճ՞վֆՕւռ՝քւ֓֐ՠ֐եՕոՔփզթ֍կ֝հր՚֠հ՝րէէգտա֧գ֟֏բջց֑ճհֳ֨֌֭֨֒շպִִֵ֑֥֥֯֜֬֕֜֔փ֥ׄ׈֖֘֬֨֕", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[11] = NLoginCore_387.D("әөӳԁӂӛԃӹӺԅӥӋӥӿӥӪӟԌӿӳԈӴӴӐӊԐԍӑԗӪԛӪӗӷӵԏӛԞԣԈԢԝԁӡӫԄӧԉӪӪԒԱӳԃԕԨӪԩӶӹԑԖԙԇԗԲԡԃԀӽԸӹԳԠԉԏ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[12] = NLoginCore_091.D("ӪҾӟӸӎӑәԃӖӸӒӻӪӸӣԃԋӚԇԁӢԌԃӵԂԔӐӱԍӵԇӫԞԞӸԃӛӠԟԁӼӡӾӨԣԜԅԚԧԉԚөԵӰԫԨԮԃ԰ԈԭԬԻԒӶԊԪԛԝԔՂՇՂՄԆԵԦԺԤ԰ԥՑԌՏՃԦԪՇԧԳԘՔԗԹ՚Ւ՟ԩ՟գՅՂԼՈ՟ՖէԣՇՁդ՝Վ԰ԱՏՒճԺԻ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[13] = NLoginCore_092.A("ŖŁůżŸƇňŇƁŹŸŹũźūœƇŝžŸŧŘũŶƇŏƙƈŭƜƂƞ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[14] = NLoginCore_138.A("ƅŹŮƁŁŻŞżţƋŞşŬŃŎƂƅƏşŰƀƒŶƏƕƑƙŹƚźŝƏ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[15] = NLoginCore_173.C("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӌӴӕԙӲӖӳԊԍӘԈ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[16] = NLoginCore_384.C("ӑӗԁԀԅӮӳԀӢӔӅҽӖӵԌԐӫԊӍӪԍӴԔӭӸԖԘӚӽԇӰӛ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[17] = NLoginCore_453.C("ӡҽӿӫԀӟҼӦӨӹӪӆӃӦӾӅӯԍӢԇԓӝӫԁӭԏӮӗӬӛӭԑԜԁӸӱԀӜӘӻԞԚӥӯ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[18] = NLoginCore_091.F("ՊէԺՙհծՎՒՕօԷ՘Ւտՙըր։ՕֈչգՠըօՑկՌյփշև֕֓ն֙թճի՘հ֙֍֒եֈ֢֋֩֬ևքի֮յն", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[19] = NLoginCore_027.B("żżűŇſƊŒũŦŬżżƆŧŚŅũƋƉţƈŘƓŖƕŲůŝƀœƞŴƥƆŮřšžŽƀƈſƤų", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[20] = NLoginCore_453.F("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈՆչ֊կցևՕրեՑթ", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[21] = NLoginCore_427.A("ůŹŖƁŐńŷſſŧƈƃŦūōšƇŭŞƗŔřƚƛŕœƎſŬſƏŞŰƛųŲƑƝťųſƗƍƢƯƐũƟƤūűƁƵƫƎƮƆŸŴƱƬƭƌźǅƓǆƿƖƒǊƦƥƅƢƓ", (byte)70, 65);
                    NLoginCore_478.var_java_lang_String_arr_b[22] = NLoginCore_223.D("ӸӸӭӃӻԆӎӥӢӨӺԅөӗӸԊԁӡӟӻԍӎԌԏӦӸӧԔӯӲӻӞ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[23] = NLoginCore_076.C("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕԖԗӑӏԊӻӨӻԋӚԁӵӜԍӝԟӤӻӨӟԒԖԅԠԪԭԁԬԏԱӮԨԒԏԣԩԢԄԍӺԇԗӺӺԖӺՁԟՄԿՉԁԅԏ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[24] = NLoginCore_091.C("ӽӰӘӘӵӏӮӟӗӺԇӜԁӣӡӹӚӎӨԐԏӤӞӐӨԘӗԐԙԗԈԗӘԑԚԏӟԞӻԧӵԛԨԜӫӷӹԠԩԯԠӫԔԳӺӻ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[25] = NLoginCore_559.B("ƁŴŜŜŹœŲţśžƋŠƅŧťŽŞŒŬƔƓŪƅƉŜƒŦŶƗŷƔŴźƂƗƓşƢƀŨƫƍŸŽƮƈŰƜŬƩƒƵƯƧžſ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[26] = NLoginCore_091.F("ճճըԾնցՉՠ՝գյրդՒճօռ՜՚նֈ֐ֆ՟ջփրևը֏գխ", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[27] = NLoginCore_091.F("զհՍոՇԻծնն՞տպ՝բՄ՘վդՕ֎Ջ֎֏պ֑Վէ֗բյյ֚պ֝ն֔ֈտաբ֖ճռ՟֐֘֟քր֝փտտֈ֜ջ֊ְ֞֒ւկֺ֚", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[28] = NLoginCore_223.B("żżűŇſƊŒũŦŬžƉŭśżƎƅťţſƑƗƐťűŶƕƍŒŮŵƛ", (byte)70, 66);
                    NLoginCore_478.var_java_lang_String_arr_b[29] = NLoginCore_110.E("զհՍոՇԻծնն՞տպ՝բՄ՘վդՕ֎ՋՐ֑֒ՌՊօնգնֆՕձըիպնն՝պ֓ւ֦կն֤չփե֪ֈսֈծ֮վք֥քօ֦֑֫։ֲִֶ֓ջչ֌ֵ֑֥֕֊", (byte)70, 69);
                    NLoginCore_478.var_java_lang_String_arr_b[30] = NLoginCore_091.F("խՒՒԶՈ՞ՔՋյ՜ՓևՑ։բՒզ՞բէՉՐլ֎ՊքՐտլղՓէմխշ֍՛ճ՗խհսՠժ", (byte)70, 70);
                    NLoginCore_478.var_java_lang_String_arr_b[31] = NLoginCore_223.C("ӫӵӒӽӌӀӳӻӻӣԄӿӢӧӉӝԃөӚԓӐӕӫԁӒӓӢӒԙӱӳӺԋԏԐәӴӰԟԁԁӨԓԋӢӶԋԮӭԙԝԝԊԀԌԄԲԨԧԋԔӼԼԋ", (byte)70, 67);
                    NLoginCore_478.var_java_lang_String_arr_b[32] = NLoginCore_173.D("ӡҽӿӫԀӟҼӦӨӹӳӣӻԅӻԐӸӲԀԁԎӱӲӫӤөԌӪӽӔӺӨӯӚԁԃӻԦԃԒӰԝԜӯ", (byte)70, 68);
                    NLoginCore_478.var_java_lang_String_arr_b[33] = NLoginCore_451.D("ӡҽӿӫԀӟҼӦӨӹӫӜԀӉԋԃӋӻԌԈӦӤӾӉӢӐӻӼӒԝӖӿԜԝӰӴԟԤӸԥԓӵӨӣӪԥԝӥӼԡԜԳԢԣӺӻ", (byte)70, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_478.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ծՖՖլՒվչՋՙՏյջնւվՕՈոթՅՙՋ՜ՠՐճնքֆ՗Ց՘", (byte)70, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_478.var_java_lang_String_arr_b[0] = NLoginCore_110.C("әӿӘӎҺӒӠӅӅӣӟӜӄӮӼӌԃӤӄӢԆԓӚӛ", (byte)70, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_478.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ÙûýÝāĠĘĮĚéħĝīĥîēĵĴĬĲĬā", (byte)25, 66), NLoginCore_478.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߄޸ߕߌ߉ߞߌߋߢ߃ߢߥߗߢߝњ", (byte)25, 68) + string + NLoginCore_324.F("ԏ", (byte)25, 70) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ NLoginCore_478[] a() {
        NLoginCore_478[] NLoginCore_478Array = new NLoginCore_478[br];
        NLoginCore_478Array[NLoginCore_478.bs] = var_com_nickuc_login_NLoginCore_478_a;
        NLoginCore_478Array[NLoginCore_478.bt] = var_com_nickuc_login_NLoginCore_478_b;
        NLoginCore_478Array[NLoginCore_478.bu] = var_com_nickuc_login_NLoginCore_478_c;
        NLoginCore_478Array[NLoginCore_478.bv] = var_com_nickuc_login_NLoginCore_478_d;
        NLoginCore_478Array[NLoginCore_478.bw] = var_com_nickuc_login_NLoginCore_478_e;
        NLoginCore_478Array[NLoginCore_478.bx] = var_com_nickuc_login_NLoginCore_478_f;
        NLoginCore_478Array[NLoginCore_478.by] = var_com_nickuc_login_NLoginCore_478_g;
        NLoginCore_478Array[NLoginCore_478.bz] = var_com_nickuc_login_NLoginCore_478_h;
        NLoginCore_478Array[NLoginCore_478.ca] = var_com_nickuc_login_NLoginCore_478_i;
        NLoginCore_478Array[NLoginCore_478.cb] = var_com_nickuc_login_NLoginCore_478_j;
        NLoginCore_478Array[NLoginCore_478.cc] = var_com_nickuc_login_NLoginCore_478_k;
        NLoginCore_478Array[NLoginCore_478.cd] = var_com_nickuc_login_NLoginCore_478_l;
        NLoginCore_478Array[NLoginCore_478.ce] = var_com_nickuc_login_NLoginCore_478_m;
        NLoginCore_478Array[NLoginCore_478.cf] = var_com_nickuc_login_NLoginCore_478_n;
        NLoginCore_478Array[NLoginCore_478.cg] = var_com_nickuc_login_NLoginCore_478_o;
        NLoginCore_478Array[NLoginCore_478.ch] = var_com_nickuc_login_NLoginCore_478_p;
        return NLoginCore_478Array;
    }

    @Nullable
    private NLoginInterface_013 a(Object ... objectArray) {
        try {
            if (this.var_java_lang_String_l == null || NLoginCore_298.a(this.var_java_lang_String_l, new String[var_int_b])) {
                if (objectArray.length != ((NLoginCore_478)this.var_com_nickuc_login_NLoginCore_478_a).length) {
                    throw new IllegalArgumentException((String)NLoginCore_478.c("㺀", (int)var_int_c, (long)(var_long_d ^ var_long_e)) + (Object)((Object)this) + (String)NLoginCore_478.c("㺃", (int)(var_int_f & var_int_g), (long)var_long_h) + objectArray.length + (String)NLoginCore_478.c("㺆", (int)(var_int_i & var_int_j), (long)var_long_k) + ((NLoginCore_478)this.var_com_nickuc_login_NLoginCore_478_a).length);
                }
                Object t = ((Class)((Object)this.var_com_nickuc_login_NLoginCore_478_a)).getConstructor((Class<?>)((Object)this.var_com_nickuc_login_NLoginCore_478_a)).newInstance(objectArray);
                if (!(t instanceof NLoginInterface_013)) {
                    throw new UnsupportedOperationException((String)NLoginCore_478.c("㺉", (int)var_int_l, (long)(var_long_m ^ var_long_n)) + (Object)((Object)this) + (String)NLoginCore_478.c("㺌", (int)(var_int_o & var_int_p), (long)q));
                }
                return (NLoginInterface_013)t;
            }
            return null;
        }
        catch (Exception exception) {
            throw new RuntimeException((String)NLoginCore_478.c("㺏", (int)r, (long)(s ^ t)) + (Object)((Object)this) + (String)NLoginCore_478.c("㺒", (int)(u & v), (long)w), exception);
        }
    }

    private NLoginCore_478(String string2, Class<?> clazz, Class<?> ... classArray) {
        this.var_java_lang_String_l = string2;
        this.var_boolean_m = var_int_a;
        this.var_com_nickuc_login_NLoginCore_478_a = clazz;
        this.var_com_nickuc_login_NLoginCore_478_a = classArray;
    }

    public static NLoginCore_478[] values() {
        return (NLoginCore_478[])var_com_nickuc_login_NLoginCore_478_arr_a.clone();
    }

    static {
        var_int_a = (0x100000 >>> 84 | 0x100000 << -84) & 0xFFFFFFFF;
        var_int_b = (0 >>> 116 | 0 << -116) & 0xFFFFFFFF;
        var_int_c = (0 >>> 116 | 0 << ~116 + 1) & 0xFFFFFFFF;
        var_long_d = Long.reverse(140783839118296545L);
        var_long_e = Long.reverse(0x1A00000000000000L);
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        var_int_g = (-1 >>> 13 | -1 << -13) & 0xFFFFFFFF;
        var_long_h = Long.reverse(2014281284104422881L);
        var_int_i = 16384 >>> 45 | 16384 << ~45 + 1;
        var_int_j = -1 >>> 113 | -1 << ~113 + 1;
        var_long_k = Long.reverse(2014281284104422881L);
        var_int_l = (1536 >>> 9 | 1536 << -9) & 0xFFFFFFFF;
        var_long_m = Long.reverse(140783839118296545L);
        var_long_n = Long.reverse(0x1A00000000000000L);
        var_int_o = Integer.reverse(0x20000000);
        var_int_p = (-1 >>> 7 | -1 << -7) & 0xFFFFFFFF;
        q = Long.reverse(2014281284104422881L);
        r = Integer.reverse(-1610612736);
        s = Long.reverse(140783839118296545L);
        t = Long.reverse(0x1A00000000000000L);
        u = Integer.reverse(0x60000000);
        v = Integer.reverse(-1);
        w = Long.reverse(2014281284104422881L);
        x = Integer.reverse(0);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(0);
        aa = (0 >>> 54 | 0 << -54) & 0xFFFFFFFF;
        ab = 3584 >>> 137 | 3584 << -137;
        ac = Long.reverse(140783839118296545L);
        ad = Long.reverse(0x1A00000000000000L);
        ae = Integer.reverse(0x10000000);
        af = Long.reverse(2014281284104422881L);
        ag = (288 >>> 165 | 288 << -165) & 0xFFFFFFFF;
        ah = Long.reverse(140783839118296545L);
        ai = Long.reverse(0x1A00000000000000L);
        aj = (0 >>> 157 | 0 << -157) & 0xFFFFFFFF;
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = (0 >>> 218 | 0 << ~218 + 1) & 0xFFFFFFFF;
        am = Integer.reverse(0x50000000);
        an = Long.reverse(140783839118296545L);
        ao = Long.reverse(0x1A00000000000000L);
        ap = Integer.reverse(0);
        aq = (0x100000 >>> 51 | 0x100000 << -51) & 0xFFFFFFFF;
        ar = Integer.reverse(0);
        as = (0x10000000 >>> 252 | 0x10000000 << ~252 + 1) & 0xFFFFFFFF;
        at = (0x580000 >>> 211 | 0x580000 << -211) & 0xFFFFFFFF;
        au = Long.reverse(140783839118296545L);
        av = Long.reverse(0x1A00000000000000L);
        aw = (0 >>> 1 | 0 << -1) & 0xFFFFFFFF;
        ax = Integer.reverse(0x40000000);
        ay = Integer.reverse(0);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Integer.reverse(-1073741824);
        bb = Integer.reverse(0);
        bc = Integer.reverse(Integer.MIN_VALUE);
        bd = Integer.reverse(0x40000000);
        be = Integer.reverse(0x20000000);
        bf = 0 >>> 14 | 0 << ~14 + 1;
        bg = (32768 >>> 47 | 32768 << -47) & 0xFFFFFFFF;
        bh = Integer.reverse(0x40000000);
        bi = 6 >>> 65 | 6 << ~65 + 1;
        bj = Integer.reverse(0x30000000);
        bk = -1 >>> 165 | -1 << -165;
        bl = Long.reverse(2014281284104422881L);
        bm = 0 >>> 163 | 0 << -163;
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = Integer.reverse(0);
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0);
        br = Integer.reverse(0x8000000);
        bs = (0 >>> 68 | 0 << -68) & 0xFFFFFFFF;
        bt = (4 >>> 66 | 4 << ~66 + 1) & 0xFFFFFFFF;
        bu = 32768 >>> 142 | 32768 << ~142 + 1;
        bv = (12 >>> 130 | 12 << ~130 + 1) & 0xFFFFFFFF;
        bw = 128 >>> 37 | 128 << -37;
        bx = Integer.reverse(-1610612736);
        by = 196608 >>> 111 | 196608 << ~111 + 1;
        bz = (-2147483645 >>> 127 | -2147483645 << -127) & 0xFFFFFFFF;
        ca = Integer.reverse(0x10000000);
        cb = Integer.reverse(-1879048192);
        cc = Integer.reverse(0x50000000);
        cd = 2816 >>> 136 | 2816 << -136;
        ce = 0xC00000 >>> 244 | 0xC00000 << ~244 + 1;
        cf = 0x1A000000 >>> 217 | 0x1A000000 << ~217 + 1;
        cg = Integer.reverse(0x70000000);
        ch = Integer.reverse(-268435456);
        ci = (136 >>> 34 | 136 << -34) & 0xFFFFFFFF;
        cj = 68 >>> 65 | 68 << -65;
        ck = 13312 >>> 202 | 13312 << ~202 + 1;
        cl = Integer.reverse(-1);
        cm = Long.reverse(2014281284104422881L);
        cn = (0 >>> 123 | 0 << -123) & 0xFFFFFFFF;
        co = Integer.reverse(Integer.MIN_VALUE);
        cp = (2048 >>> 139 | 2048 << ~139 + 1) & 0xFFFFFFFF;
        cq = (0 >>> 106 | 0 << -106) & 0xFFFFFFFF;
        cr = Integer.reverse(0x70000000);
        cs = Long.reverse(140783839118296545L);
        ct = Long.reverse(0x1A00000000000000L);
        cu = (0x10000000 >>> 60 | 0x10000000 << ~60 + 1) & 0xFFFFFFFF;
        cv = Integer.reverse(Integer.MIN_VALUE);
        cw = Integer.reverse(Integer.MIN_VALUE);
        cx = (0 >>> 192 | 0 << ~192 + 1) & 0xFFFFFFFF;
        cy = 7680 >>> 169 | 7680 << -169;
        cz = Long.reverse(140783839118296545L);
        da = Long.reverse(0x1A00000000000000L);
        db = Integer.reverse(0x40000000);
        dc = (0 >>> 254 | 0 << -254) & 0xFFFFFFFF;
        dd = Integer.reverse(0x20000000);
        de = 0 >>> 65 | 0 << ~65 + 1;
        df = 0x2000000 >>> 121 | 0x2000000 << -121;
        dg = 1024 >>> 169 | 1024 << -169;
        dh = Integer.reverse(-1073741824);
        di = 16 >>> 160 | 16 << ~160 + 1;
        dj = Integer.reverse(-1);
        dk = Long.reverse(2014281284104422881L);
        dl = Integer.reverse(-1073741824);
        dm = (0 >>> 187 | 0 << -187) & 0xFFFFFFFF;
        dn = Integer.reverse(Integer.MIN_VALUE);
        cfr_renamed_1 = Integer.reverse(0);
        dp = Integer.reverse(-2013265920);
        dq = Long.reverse(2014281284104422881L);
        dr = Integer.reverse(0x20000000);
        ds = 0 >>> 213 | 0 << ~213 + 1;
        dt = Integer.reverse(Integer.MIN_VALUE);
        du = Integer.reverse(0);
        dv = Integer.reverse(0x48000000);
        dw = Long.reverse(2014281284104422881L);
        dx = 163840 >>> 207 | 163840 << -207;
        dy = Integer.reverse(0);
        dz = Integer.reverse(Integer.MIN_VALUE);
        ea = Integer.reverse(0);
        eb = Integer.reverse(-939524096);
        ec = Integer.reverse(-1);
        ed = Long.reverse(2014281284104422881L);
        ee = Integer.reverse(0x60000000);
        ef = Integer.reverse(0);
        eg = Integer.reverse(-1073741824);
        eh = (0 >>> 211 | 0 << -211) & 0xFFFFFFFF;
        ei = Integer.reverse(Integer.MIN_VALUE);
        ej = Integer.reverse(0x40000000);
        ek = (10 >>> 159 | 10 << -159) & 0xFFFFFFFF;
        el = Long.reverse(140783839118296545L);
        em = Long.reverse(0x1A00000000000000L);
        en = Integer.reverse(-536870912);
        eo = Integer.reverse(-1476395008);
        ep = Long.reverse(2014281284104422881L);
        eq = Integer.reverse(Integer.MIN_VALUE);
        er = Integer.reverse(0);
        es = Integer.reverse(0x68000000);
        et = Long.reverse(140783839118296545L);
        eu = Long.reverse(0x1A00000000000000L);
        ev = (512 >>> 102 | 512 << -102) & 0xFFFFFFFF;
        ew = Integer.reverse(-402653184);
        ex = Long.reverse(140783839118296545L);
        ey = Long.reverse(0x1A00000000000000L);
        ez = Integer.reverse(Integer.MIN_VALUE);
        fa = Integer.reverse(0);
        fb = Integer.reverse(0x18000000);
        fc = Long.reverse(140783839118296545L);
        fd = Long.reverse(0x1A00000000000000L);
        fe = 2304 >>> 200 | 2304 << ~200 + 1;
        ff = Integer.reverse(0);
        fg = Integer.reverse(0x40000000);
        fh = 0 >>> 55 | 0 << -55;
        fi = 0x400000 >>> 86 | 0x400000 << ~86 + 1;
        fj = 0x19000000 >>> 56 | 0x19000000 << -56;
        fk = Long.reverse(140783839118296545L);
        fl = Long.reverse(0x1A00000000000000L);
        fm = Integer.reverse(0x50000000);
        fn = Integer.reverse(0);
        fo = (65536 >>> 47 | 65536 << ~47 + 1) & 0xFFFFFFFF;
        fp = 0 >>> 133 | 0 << -133;
        fq = Integer.reverse(Integer.MIN_VALUE);
        fr = 0x1A0000 >>> 48 | 0x1A0000 << ~48 + 1;
        fs = Long.reverse(140783839118296545L);
        ft = Long.reverse(0x1A00000000000000L);
        fu = Integer.reverse(-805306368);
        fv = Integer.reverse(-671088640);
        fw = Long.reverse(140783839118296545L);
        fx = Long.reverse(0x1A00000000000000L);
        fy = Integer.reverse(Integer.MIN_VALUE);
        fz = Integer.reverse(0);
        ga = (224 >>> 35 | 224 << -35) & 0xFFFFFFFF;
        gb = Long.reverse(140783839118296545L);
        gc = Long.reverse(0x1A00000000000000L);
        gd = Integer.reverse(0x30000000);
        ge = (0x1D0000 >>> 48 | 0x1D0000 << ~48 + 1) & 0xFFFFFFFF;
        gf = -1 >>> 122 | -1 << -122;
        gg = Long.reverse(2014281284104422881L);
        gh = Integer.reverse(Integer.MIN_VALUE);
        gi = (0 >>> 7 | 0 << ~7 + 1) & 0xFFFFFFFF;
        gj = Integer.reverse(0x78000000);
        gk = Long.reverse(2014281284104422881L);
        gl = Integer.reverse(-1342177280);
        gm = Integer.reverse(-134217728);
        gn = -1 >>> 178 | -1 << -178;
        go = Long.reverse(2014281284104422881L);
        gp = Integer.reverse(Integer.MIN_VALUE);
        gq = Integer.reverse(0);
        gr = Integer.reverse(0x4000000);
        gs = Long.reverse(140783839118296545L);
        gt = Long.reverse(0x1A00000000000000L);
        gu = Integer.reverse(0x70000000);
        gv = Integer.reverse(0);
        gw = 128 >>> 231 | 128 << -231;
        gx = 0 >>> 114 | 0 << -114;
        gy = 0x10000002 >>> 60 | 0x10000002 << ~60 + 1;
        gz = Long.reverse(140783839118296545L);
        ha = Long.reverse(0x1A00000000000000L);
        hb = (0x1E00000 >>> 21 | 0x1E00000 << -21) & 0xFFFFFFFF;
        hc = Integer.reverse(0);
        hd = Integer.reverse(Integer.MIN_VALUE);
        he = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[ci];
        var_java_lang_String_arr_b = new String[cj];
        NLoginCore_478.b();
        Class[] classArray = new Class[cp];
        classArray[NLoginCore_478.cq] = NLoginCore_209.class;
        var_com_nickuc_login_NLoginCore_478_a = new NLoginCore_478(co != 0, NLoginCore_399.class, classArray);
        Class[] classArray2 = new Class[cw];
        classArray2[NLoginCore_478.cx] = NLoginCore_209.class;
        var_com_nickuc_login_NLoginCore_478_b = new NLoginCore_478(cv != 0, NLoginCore_129.class, classArray2);
        Class[] classArray3 = new Class[dd];
        classArray3[NLoginCore_478.de] = nLoginBukkit.class;
        classArray3[NLoginCore_478.df] = NLoginCore_187.class;
        classArray3[NLoginCore_478.dg] = NLoginCore_209.class;
        classArray3[NLoginCore_478.dh] = Boolean.TYPE;
        var_com_nickuc_login_NLoginCore_478_c = new NLoginCore_478(dc != 0, NLoginCore_253.class, classArray3);
        Class[] classArray4 = new Class[dn];
        classArray4[NLoginCore_478.cfr_renamed_1] = nLoginBukkit.class;
        var_com_nickuc_login_NLoginCore_478_d = new NLoginCore_478(dm != 0, NLoginCore_011.class, classArray4);
        Class[] classArray5 = new Class[dt];
        classArray5[NLoginCore_478.du] = nLoginBukkit.class;
        var_com_nickuc_login_NLoginCore_478_e = new NLoginCore_478(ds != 0, NLoginCore_373.class, classArray5);
        Class[] classArray6 = new Class[dz];
        classArray6[NLoginCore_478.ea] = NLoginType_008.class;
        var_com_nickuc_login_NLoginCore_478_f = new NLoginCore_478(dy != 0, NLoginCore_448.class, classArray6);
        Class[] classArray7 = new Class[eg];
        classArray7[NLoginCore_478.eh] = nLoginBukkit.class;
        classArray7[NLoginCore_478.ei] = NLoginCore_209.class;
        classArray7[NLoginCore_478.ej] = Boolean.TYPE;
        var_com_nickuc_login_NLoginCore_478_g = new NLoginCore_478(ef != 0, NLoginCore_157.class, classArray7);
        Class[] classArray8 = new Class[eq];
        classArray8[NLoginCore_478.er] = NLoginCore_209.class;
        var_com_nickuc_login_NLoginCore_478_h = new NLoginCore_478((String)NLoginCore_478.c("㺘", (int)eo, (long)ep), NLoginCore_046.class, classArray8);
        Class[] classArray9 = new Class[ez];
        classArray9[NLoginCore_478.fa] = NLoginCore_209.class;
        var_com_nickuc_login_NLoginCore_478_i = new NLoginCore_478((String)NLoginCore_478.c("㺞", (int)ew, (long)(ex ^ ey)), NLoginCore_545.class, classArray9);
        Class[] classArray10 = new Class[fg];
        classArray10[NLoginCore_478.fh] = nLoginBukkit.class;
        classArray10[NLoginCore_478.fi] = NLoginCore_447.class;
        var_com_nickuc_login_NLoginCore_478_j = new NLoginCore_478(ff != 0, NLoginCore_341.class, classArray10);
        Class[] classArray11 = new Class[fo];
        classArray11[NLoginCore_478.fp] = NLoginType_008.class;
        classArray11[NLoginCore_478.fq] = NLoginCore_447.class;
        var_com_nickuc_login_NLoginCore_478_k = new NLoginCore_478(fn != 0, NLoginCore_417.class, classArray11);
        Class[] classArray12 = new Class[fy];
        classArray12[NLoginCore_478.fz] = NLoginCore_209.class;
        var_com_nickuc_login_NLoginCore_478_l = new NLoginCore_478((String)NLoginCore_478.c("㺪", (int)fv, (long)(fw ^ fx)), NLoginCore_025.class, classArray12);
        Class[] classArray13 = new Class[gh];
        classArray13[NLoginCore_478.gi] = nLoginBukkit.class;
        var_com_nickuc_login_NLoginCore_478_m = new NLoginCore_478((String)NLoginCore_478.c("㺰", (int)(ge & gf), (long)gg), NLoginCore_160.class, classArray13);
        Class[] classArray14 = new Class[gp];
        classArray14[NLoginCore_478.gq] = NLoginType_008.class;
        var_com_nickuc_login_NLoginCore_478_n = new NLoginCore_478((String)NLoginCore_478.c("㺶", (int)(gm & gn), (long)go), NLoginCore_260.class, classArray14);
        Class[] classArray15 = new Class[gw];
        classArray15[NLoginCore_478.gx] = nLoginBukkit.class;
        var_com_nickuc_login_NLoginCore_478_o = new NLoginCore_478(gv != 0, NLoginCore_554.class, classArray15);
        Class[] classArray16 = new Class[hd];
        classArray16[NLoginCore_478.he] = nLoginBukkit.class;
        var_com_nickuc_login_NLoginCore_478_p = new NLoginCore_478(hc != 0, NLoginCore_290.class, classArray16);
        var_com_nickuc_login_NLoginCore_478_arr_a = NLoginCore_478.a();
    }

    public boolean h() {
        return this.var_boolean_n;
    }

    private NLoginCore_478(boolean bl, Class<?> clazz, Class<?> ... classArray) {
        this.var_java_lang_String_l = null;
        this.var_boolean_m = bl;
        this.var_com_nickuc_login_NLoginCore_478_a = clazz;
        this.var_com_nickuc_login_NLoginCore_478_a = classArray;
    }
}

