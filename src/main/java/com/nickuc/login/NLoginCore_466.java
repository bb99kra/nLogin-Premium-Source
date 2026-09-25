/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginType_025;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_333;
import com.nickuc.login.NLoginCore_437;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_367;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginType_021;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_014;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginType_020;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_462;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_043;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_295;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_466
extends Enum<NLoginCore_466> {
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_b;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_c;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_d;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_e;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_f;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_g;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_h;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_i;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_j;
    public static final /* enum */ NLoginCore_466 var_com_nickuc_login_NLoginCore_466_k;
    private final String var_java_lang_String_n;
    private final NLoginCore_168<NLoginType_008> var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a;
    private final boolean var_boolean_u;
    private final boolean var_boolean_v;
    private static final /* synthetic */ NLoginCore_466[] var_com_nickuc_login_NLoginCore_466_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static long var_long_f;
    private static int var_int_g;
    private static int var_int_h;
    private static long var_long_i;
    private static int var_int_j;
    private static int var_int_k;
    private static long l;
    private static long m;
    private static int var_int_n;
    private static int o;
    private static long p;
    private static int q;
    private static long r;
    private static long s;
    private static int t;
    private static int var_int_u;
    private static long var_long_v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int aa;
    private static int ab;
    private static int ac;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static long al;
    private static int am;
    private static int an;
    private static long ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static long as;
    private static long at;
    private static int au;
    private static int av;
    private static long aw;
    private static int ax;
    private static int ay;
    private static int az;
    private static int ba;
    private static long bb;
    private static int bc;
    private static int bd;
    private static long be;
    private static int bf;
    private static int bg;
    private static int bh;
    private static long bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static long bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static long bq;
    private static long br;
    private static int bs;
    private static int bt;
    private static long bu;
    private static long bv;
    private static int bw;
    private static int bx;
    private static int by;
    private static int bz;
    private static long ca;
    private static int cb;
    private static int cc;
    private static long cd;
    private static int ce;
    private static int cf;
    private static int cg;
    private static long ch;
    private static long ci;
    private static int cj;
    private static int ck;
    private static int cl;
    private static long cm;
    private static int cn;
    private static int co;
    private static int cp;
    private static long cq;
    private static int cr;
    private static int cs;
    private static long ct;
    private static int cu;
    private static int cv;
    private static int cw;
    private static long cx;
    private static long cy;
    private static int cz;
    private static int da;
    private static long db;
    private static long dc;
    private static int dd;
    private static int de;
    private static int df;
    private static long dg;
    private static int dh;
    private static int di;
    private static long dj;
    private static int dk;
    private static int dl;

    private static String a(int n, long l) {
        l ^= 0x5AL;
        l ^= 0xEA4715A1E2C87956L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(56 + 13), (byte)(26 + 57), (byte)(2 + 45), (byte)(66 + 1), (byte)(39 + 27), (byte)(21 + 46), (byte)(30 + 17), (byte)(4 + 76), 75, (byte)(23 + 44), (byte)(4 + 79), 53, (byte)(37 + 43), (byte)(80 + 17), (byte)(22 + 78), (byte)(91 + 9), (byte)(45 + 60), (byte)(26 + 84), (byte)(9 + 94)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.C("Ս՚ՙԜ՜՘Փ՜էՖԣաե՞աէԩࢲࢵࣀࢼࢿࢱࢡࣉࢬ", (byte)103, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_466.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String e() {
        return this.var_java_lang_String_n;
    }

    @Generated
    public boolean l() {
        return this.var_boolean_u;
    }

    @Generated
    public NLoginCore_168<NLoginType_008> a() {
        return this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a;
    }

    public static NLoginCore_466[] values() {
        return (NLoginCore_466[])var_com_nickuc_login_NLoginCore_466_arr_a.clone();
    }

    private static /* synthetic */ NLoginCore_466[] a() {
        NLoginCore_466[] NLoginCore_466Array = new NLoginCore_466[w];
        NLoginCore_466Array[NLoginCore_466.x] = var_com_nickuc_login_NLoginCore_466_b;
        NLoginCore_466Array[NLoginCore_466.y] = var_com_nickuc_login_NLoginCore_466_c;
        NLoginCore_466Array[NLoginCore_466.z] = var_com_nickuc_login_NLoginCore_466_d;
        NLoginCore_466Array[NLoginCore_466.aa] = var_com_nickuc_login_NLoginCore_466_e;
        NLoginCore_466Array[NLoginCore_466.ab] = var_com_nickuc_login_NLoginCore_466_f;
        NLoginCore_466Array[NLoginCore_466.ac] = var_com_nickuc_login_NLoginCore_466_g;
        NLoginCore_466Array[NLoginCore_466.ad] = var_com_nickuc_login_NLoginCore_466_h;
        NLoginCore_466Array[NLoginCore_466.ae] = var_com_nickuc_login_NLoginCore_466_i;
        NLoginCore_466Array[NLoginCore_466.af] = var_com_nickuc_login_NLoginCore_466_j;
        NLoginCore_466Array[NLoginCore_466.ag] = var_com_nickuc_login_NLoginCore_466_k;
        return NLoginCore_466Array;
    }

    static {
        var_int_a = 512 >>> 169 | 512 << ~169 + 1;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        var_int_d = (0 >>> 243 | 0 << -243) & 0xFFFFFFFF;
        var_int_e = (0 >>> 107 | 0 << ~107 + 1) & 0xFFFFFFFF;
        var_long_f = Long.reverse(-6688020125545717271L);
        var_int_g = (256 >>> 40 | 256 << ~40 + 1) & 0xFFFFFFFF;
        var_int_h = Integer.reverse(-1);
        var_long_i = Long.reverse(-6688020125545717271L);
        var_int_j = Integer.reverse(0);
        var_int_k = Integer.reverse(0x40000000);
        l = Long.reverse(-491067038283914775L);
        m = Long.reverse(0x5A00000000000000L);
        var_int_n = Integer.reverse(-1073741824);
        o = (-1 >>> 39 | -1 << ~39 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-6688020125545717271L);
        q = (0x1000000 >>> 54 | 0x1000000 << -54) & 0xFFFFFFFF;
        r = Long.reverse(-491067038283914775L);
        s = Long.reverse(0x5A00000000000000L);
        t = (0x1400000 >>> 54 | 0x1400000 << -54) & 0xFFFFFFFF;
        var_int_u = Integer.reverse(-1);
        var_long_v = Long.reverse(-6688020125545717271L);
        w = 10 >>> 32 | 10 << ~32 + 1;
        x = Integer.reverse(0);
        y = 16384 >>> 46 | 16384 << -46;
        z = Integer.reverse(0x40000000);
        aa = Integer.reverse(-1073741824);
        ab = Integer.reverse(0x20000000);
        ac = (10 >>> 97 | 10 << ~97 + 1) & 0xFFFFFFFF;
        ad = Integer.reverse(0x60000000);
        ae = Integer.reverse(-536870912);
        af = 8 >>> 160 | 8 << ~160 + 1;
        ag = (73728 >>> 173 | 73728 << ~173 + 1) & 0xFFFFFFFF;
        ah = (104 >>> 162 | 104 << -162) & 0xFFFFFFFF;
        ai = Integer.reverse(0x58000000);
        aj = (-1073741824 >>> 29 | -1073741824 << ~29 + 1) & 0xFFFFFFFF;
        ak = (-1 >>> 164 | -1 << ~164 + 1) & 0xFFFFFFFF;
        al = Long.reverse(-6688020125545717271L);
        am = 0 >>> 204 | 0 << ~204 + 1;
        an = (7168 >>> 234 | 7168 << -234) & 0xFFFFFFFF;
        ao = Long.reverse(-6688020125545717271L);
        ap = (256 >>> 72 | 256 << ~72 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(Integer.MIN_VALUE);
        ar = Integer.reverse(0x10000000);
        as = Long.reverse(-491067038283914775L);
        at = Long.reverse(0x5A00000000000000L);
        au = Integer.reverse(Integer.MIN_VALUE);
        av = Integer.reverse(-1879048192);
        aw = Long.reverse(-6688020125545717271L);
        ax = Integer.reverse(Integer.MIN_VALUE);
        ay = (0x1000000 >>> 88 | 0x1000000 << ~88 + 1) & 0xFFFFFFFF;
        az = (0x500000 >>> 179 | 0x500000 << ~179 + 1) & 0xFFFFFFFF;
        ba = Integer.reverse(-1);
        bb = Long.reverse(-6688020125545717271L);
        bc = 32768 >>> 46 | 32768 << ~46 + 1;
        bd = Integer.reverse(-805306368);
        be = Long.reverse(-6688020125545717271L);
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = Integer.reverse(Integer.MIN_VALUE);
        bh = Integer.reverse(0x30000000);
        bi = Long.reverse(-6688020125545717271L);
        bj = 393216 >>> 49 | 393216 << -49;
        bk = Integer.reverse(-1342177280);
        bl = Integer.reverse(-1);
        bm = Long.reverse(-6688020125545717271L);
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = Integer.reverse(Integer.MIN_VALUE);
        bp = Integer.reverse(0x70000000);
        bq = Long.reverse(-491067038283914775L);
        br = Long.reverse(0x5A00000000000000L);
        bs = 262144 >>> 240 | 262144 << -240;
        bt = Integer.reverse(-268435456);
        bu = Long.reverse(-491067038283914775L);
        bv = Long.reverse(0x5A00000000000000L);
        bw = 16 >>> 68 | 16 << -68;
        bx = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        by = (32768 >>> 107 | 32768 << -107) & 0xFFFFFFFF;
        bz = Integer.reverse(-1);
        ca = Long.reverse(-6688020125545717271L);
        cb = 81920 >>> 206 | 81920 << ~206 + 1;
        cc = (0x20000002 >>> 221 | 0x20000002 << ~221 + 1) & 0xFFFFFFFF;
        cd = Long.reverse(-6688020125545717271L);
        ce = Integer.reverse(Integer.MIN_VALUE);
        cf = Integer.reverse(Integer.MIN_VALUE);
        cg = Integer.reverse(0x48000000);
        ch = Long.reverse(-491067038283914775L);
        ci = Long.reverse(0x5A00000000000000L);
        cj = Integer.reverse(0x60000000);
        ck = (0x4C0000 >>> 178 | 0x4C0000 << ~178 + 1) & 0xFFFFFFFF;
        cl = Integer.reverse(-1);
        cm = Long.reverse(-6688020125545717271L);
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = 0x800000 >>> 247 | 0x800000 << ~247 + 1;
        cp = (40960 >>> 171 | 40960 << -171) & 0xFFFFFFFF;
        cq = Long.reverse(-6688020125545717271L);
        cr = Integer.reverse(-536870912);
        cs = (0x50000001 >>> 188 | 0x50000001 << ~188 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(-6688020125545717271L);
        cu = (131072 >>> 49 | 131072 << ~49 + 1) & 0xFFFFFFFF;
        cv = Integer.reverse(0);
        cw = (720896 >>> 79 | 720896 << -79) & 0xFFFFFFFF;
        cx = Long.reverse(-491067038283914775L);
        cy = Long.reverse(0x5A00000000000000L);
        cz = Integer.reverse(0x10000000);
        da = Integer.reverse(-402653184);
        db = Long.reverse(-491067038283914775L);
        dc = Long.reverse(0x5A00000000000000L);
        dd = Integer.reverse(Integer.MIN_VALUE);
        de = Integer.reverse(0);
        df = Integer.reverse(0x18000000);
        dg = Long.reverse(-6688020125545717271L);
        dh = 18 >>> 33 | 18 << ~33 + 1;
        di = Integer.reverse(-1744830464);
        dj = Long.reverse(-6688020125545717271L);
        dk = 0 >>> 69 | 0 << -69;
        dl = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[ah];
        var_java_lang_String_arr_b = new String[ai];
        NLoginCore_466.b();
        var_com_nickuc_login_NLoginCore_466_b = new NLoginCore_466((String)NLoginCore_466.c("㺃", (int)an, (long)ao), NLoginCore_043.class, ap != 0, aq != 0);
        var_com_nickuc_login_NLoginCore_466_c = new NLoginCore_466((String)NLoginCore_466.c("㺉", (int)av, (long)aw), NLoginType_021.class, ax != 0, ay != 0);
        var_com_nickuc_login_NLoginCore_466_d = new NLoginCore_466((String)NLoginCore_466.c("㺏", (int)bd, (long)be), NLoginCore_333.class, bf != 0, bg != 0);
        var_com_nickuc_login_NLoginCore_466_e = new NLoginCore_466((String)NLoginCore_466.c("㺕", (int)(bk & bl), (long)bm), NLoginCore_295.class, bn != 0, bo != 0);
        var_com_nickuc_login_NLoginCore_466_f = new NLoginCore_466((String)NLoginCore_466.c("㺛", (int)bt, (long)(bu ^ bv)), NLoginType_020.class, bw != 0, bx != 0);
        var_com_nickuc_login_NLoginCore_466_g = new NLoginCore_466((String)NLoginCore_466.c("㺡", (int)cc, (long)cd), NLoginCore_014.class, ce != 0, cf != 0);
        var_com_nickuc_login_NLoginCore_466_h = new NLoginCore_466((String)NLoginCore_466.c("㺧", (int)(ck & cl), (long)cm), NLoginCore_462.class, cn != 0, co != 0);
        var_com_nickuc_login_NLoginCore_466_i = new NLoginCore_466((String)NLoginCore_466.c("㺭", (int)cs, (long)ct), NLoginCore_367.class, cu != 0, cv != 0);
        var_com_nickuc_login_NLoginCore_466_j = new NLoginCore_466((String)NLoginCore_466.c("㺳", (int)da, (long)(db ^ dc)), NLoginCore_437.class, dd != 0, de != 0);
        var_com_nickuc_login_NLoginCore_466_k = new NLoginCore_466((String)NLoginCore_466.c("㺹", (int)di, (long)dj), NLoginType_025.class, dk != 0, dl != 0);
        var_com_nickuc_login_NLoginCore_466_arr_a = NLoginCore_466.a();
    }

    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String ... stringArray) {
        if (!(this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a instanceof NLoginType_032)) {
            throw new IllegalStateException((String)NLoginCore_466.c("㺀", (int)var_int_k, (long)(l ^ m)) + (Object)((Object)this) + (String)NLoginCore_466.c("㺃", (int)(var_int_n & o), (long)p));
        }
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_k, (Object)System.currentTimeMillis());
        NLoginType_032 NLoginType_0322 = (NLoginType_032)this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a;
        NLoginType_0322.d(NLoginCore_277, NLoginType_0322.aa(), stringArray);
    }

    private static void b() {
        int n;
        var_long_c = -7528623955909348193L;
        long l = var_long_c ^ 0xEA4715A1E2C87956L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(52 + 17), (byte)(72 + 11), (byte)(6 + 41), (byte)(62 + 5), (byte)(16 + 50), (byte)(57 + 10), (byte)(22 + 25), 80, (byte)(27 + 48), (byte)(2 + 65), (byte)(53 + 30), (byte)(3 + 50), (byte)(24 + 56), 97, (byte)(71 + 29), (byte)(96 + 4), (byte)(4 + 101), (byte)(67 + 43), (byte)(97 + 6)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(46 + 22), 69, (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
                    NLoginCore_466.var_java_lang_String_arr_b[0] = NLoginCore_076.F("֋֏ֱ֢֧֨ք֦֬մֺճ֐ջ֪֨տ֋ֿ֌֥֘֓ׄ֞ֆ֣֔֡־֛ֈ־֎֫׌֦ו׎֗׆׃׈֟", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[1] = NLoginCore_446.F("ց֧։ծ֕քտ֒յ֚֩տ", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[2] = NLoginCore_201.A("ǂƭǏǝǉǓǋǲǒƴǨǌǂǸƵƴǖǒǏƽǝǱǈǉ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[3] = NLoginCore_091.C("ս֖֔նճչո֒ֆ֝ե֤ց֥փս֏֊֢֨֠֒֊֏֥֤֥֭֠ճִ֧", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[4] = NLoginCore_092.C("ճ՞ր֎պքռ֣փե֙սճ֩զեևփրծ֎֢չպ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[5] = NLoginCore_201.F("֎֧֥ևք֊։֣֮֗նֵֶ֒֔֎ֱֱֳֵֶֹ֛֣֛֠֠־ֶքָׅ", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[6] = NLoginCore_027.C("ի֋֎ս֣տշմ֛հՠծ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[7] = NLoginCore_427.A("ƾƷǅƬưƩƴǍǣǬǄƽ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[8] = NLoginCore_223.B("ǛǗǑƧǑƽǱƱƳǟƱǉǱǋǯƸƸƷǖǑǺȁǈǉ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[9] = NLoginCore_575.C("՚ճՓՙՕ֜քֆբօ֑֪֮֞֝վ֋լև֥֟֌չպ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[10] = NLoginCore_091.A("ƥǠƯǛǝǬƭǡƭƳǔƽ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[11] = NLoginCore_004.E("։և֦֏լְֳ֯֐֑֎տ", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[12] = NLoginCore_173.A("ƤƨǚƻƤƻǔǦǵǓǀƽ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[13] = NLoginCore_201.F("ֱտ֡֊փիְփֶ֤֬տ", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[14] = NLoginCore_092.A("ǙǄǎǬƱǥǴƽǓǤƳƽ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[15] = NLoginCore_173.E("ըգ֌ֲ֣֎֭֬֒ն֚տ", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[16] = NLoginCore_559.C("֘լւ֌֙՞՗ղդշ֣ծ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[17] = NLoginCore_324.B("ǗǆǩǋƻǋǞǢǴǥǀƽ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[18] = NLoginCore_324.E("֥֍֥ւ֎ք֪ևֵ֦ւտ", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[19] = NLoginCore_559.F("խէֲ֭֬֯ֈօ֩հ֤տ", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[20] = NLoginCore_324.C("՘ՙ֝՟հգ֘եու֛ծ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[21] = NLoginCore_559.A("ƿǝǠƨǚǜǫƫƴǰǌƽ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[22] = NLoginCore_091.B("ǄǧǁƽǦǅǴǯǖǐǷǧǕǙǵǗǞǘƹǟǘǱǈǉ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[23] = NLoginCore_223.E("չ։֨֎մ֩ֈ֪֏ֻ֣֨֎־ֳտֳ֖֠֕֗֜֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[24] = NLoginCore_223.E("֣֠րղ֣ղծ֊֗ֈւևֲ֛֙֫ղֺ֗ցնֳ֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[25] = NLoginCore_451.F("֋֌թ֢ղ֭։ַ֦֮֕ֆչպչև׀֏ոׂ֌֝֊֋", (byte)123, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_466.var_java_lang_String_arr_b[0] = NLoginCore_076.C("պվ֑֖֠֗ճ֛֕գ֩բտժ֗֙ծպ֮ջևւֳ֍֔յփ֐֭֒֊շ׀֞֐֣֠ջ֍ִִտր֎", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[1] = NLoginCore_110.C("֎ՠ֕֙քր֚֒ոսցծ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ǂƭǏǝǉǓǋǲǒƴǨƯǺǬǴƹǋǷǮǘǀǋǈǉ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[3] = NLoginCore_138.E("֎֧֥ևք֊։֣֮֗նֵֶ֒֔֎ֱֳֶֶֹׁׂ֛֦֠֯֜֝ׄ׏־", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ճ՞ր֎պքռ֣փե֦֚֘թ֨ն֌֚րվִռչպ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[5] = NLoginCore_384.B("ǌǥǣǅǂǈǇǡǕǬƴǳǐǴǒǌǞǙǷǯǱǬǥǓƼǻȃǾǴǋǸȇ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[6] = NLoginCore_027.A("ƻƹǋǧǫǩǮǣǉǅǇǚǫǓƳǏƹǬƼǛǚȁǈǉ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[7] = NLoginCore_446.A("ƽǫǞǊǫǲǢǭƲǧǯǵƲǓǈǶǔǚǷǑǶȁǈǉ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[8] = NLoginCore_384.F("֝֙֓թ֓տֳճյ֡ձ֥֥֦֩ս֖֟֩֝֕֍֊֋", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[9] = NLoginCore_387.D("՚ճՓՙՕ֜քֆբօ։֘դցչ֋֗֌ւի֏֌չպ", (byte)123, 68);
                    NLoginCore_466.var_java_lang_String_arr_b[10] = NLoginCore_201.E("֘ը֜րևֱֈ֗յչִֺ֚֫֨֔սׁ׀ֲ֡׃֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[11] = NLoginCore_223.F("լְ֣֢֬֊ְַ֢֪֖֬֔֊ְ֫֏֗֫֋ֳַ֊֋", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[12] = NLoginCore_076.F("խ֙սֳ֥֟փյոհ֖տ", (byte)123, 70);
                    NLoginCore_466.var_java_lang_String_arr_b[13] = NLoginCore_091.E("ըպ֟եղ֎֥տ֢֘֫ք֨֬մְ֞ճֲֹ֒֝֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[14] = NLoginCore_091.B("ǄǫǬƣǍǒǡƯǯǐǘƽ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[15] = NLoginCore_173.E("ց֨֜ծքֳխ֏ժղհճ֏ֵ֗֍֬ս֌ִ׀֝֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[16] = NLoginCore_004.D("շծ֕յղլ֗֠ագտտւ֍֌֪֜օֆձֲ֡չպ", (byte)123, 68);
                    NLoginCore_466.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ǪǛǀƿǝƭǃƳǅǠǧǅƹǧǨƺǰǔǭƹǍǱǈǉ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[18] = NLoginCore_223.B("ǃǝǂǡǪǤǭƿƱǪǡǈǉǄǎǦƹǪǘǛǡǋǈǉ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[19] = NLoginCore_201.D("֌չճմ֘՝֝֓֟բ֝ևտ֛֟օօքլ֐լֲչպ", (byte)123, 68);
                    NLoginCore_466.var_java_lang_String_arr_b[20] = NLoginCore_201.A("ƬƻǪǰƬǅǯǕǓǘǖǴǳǴǩǉǈǶǐǶǁǱǈǉ", (byte)123, 65);
                    NLoginCore_466.var_java_lang_String_arr_b[21] = NLoginCore_446.E("֎֎ֱջִִֆ֣֙ֆքֹ֥֔յջվ־֒֙ն֍֊֋", (byte)123, 69);
                    NLoginCore_466.var_java_lang_String_arr_b[22] = NLoginCore_324.D("յ֘ղծ֗ն֥֠ևց֩տ֗֨ժ֍փզ֩։փ֌չպ", (byte)123, 68);
                    NLoginCore_466.var_java_lang_String_arr_b[23] = NLoginCore_076.C("ըո֗սգ֘շ֙վ֪֗յ֌ոտ֫֍ս֩դփ֌չպ", (byte)123, 67);
                    NLoginCore_466.var_java_lang_String_arr_b[24] = NLoginCore_384.B("ǞǡƾưǡưƬǈǕǆǂǴǄǖǶǚưǲǚǭǓǋǈǉ", (byte)123, 66);
                    NLoginCore_466.var_java_lang_String_arr_b[25] = NLoginCore_223.E("֋֌թ֢ղ֭։ַ֦֕֬֬ռ֙־ְ֧֎֋֔ր׃֊֋", (byte)123, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_466.var_java_lang_String_arr_b[0] = NLoginCore_091.C("֛֔֞ռփց֣֕֐հչզշօևզտ֪֢֫լֲչպ", (byte)123, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_466.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǉǐǤǝǁǦǰǉǟǀǍǮǨǈǛǎǦǪǽǯǋȁǈǉ", (byte)123, 66);
                }
            }
        }
    }

    public static NLoginCore_466 valueOf(String string) {
        return Enum.valueOf(NLoginCore_466.class, string);
    }

    @Generated
    public boolean m() {
        return this.var_boolean_v;
    }

    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, String ... stringArray) {
        if (!(this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a instanceof NLoginType_032)) {
            throw new IllegalStateException((String)NLoginCore_466.c("㺀", (int)q, (long)(r ^ s)) + (Object)((Object)this) + (String)NLoginCore_466.c("㺃", (int)(t & var_int_u), (long)var_long_v));
        }
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_k, (Object)System.currentTimeMillis());
        NLoginType_032 NLoginType_0322 = (NLoginType_032)this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a;
        NLoginType_0322.c(NLoginCore_277, string, stringArray);
    }

    private NLoginCore_466(String string2, Class<? extends NLoginCore_168<NLoginType_008>> clazz, boolean bl, boolean bl2) {
        NLoginCore_168<NLoginType_008> NLoginCore_1682;
        this.var_java_lang_String_n = string2;
        this.var_boolean_u = bl;
        this.var_boolean_v = bl2;
        try {
            Class[] classArray = new Class[var_int_a];
            classArray[NLoginCore_466.var_int_b] = NLoginCore_466.class;
            Object[] objectArray = new Object[var_int_c];
            objectArray[NLoginCore_466.var_int_d] = this;
            NLoginCore_1682 = clazz.getConstructor(classArray).newInstance(objectArray);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            NLoginCore_370.c((String)NLoginCore_466.c("㺀", (int)var_int_e, (long)var_long_f) + this.name() + (String)NLoginCore_466.c("㺃", (int)(var_int_g & var_int_h), (long)var_long_i), reflectiveOperationException, new Object[var_int_j]);
            NLoginCore_1682 = null;
        }
        this.var_com_nickuc_login_NLoginCore_168_com_nickuc_login_NLoginType_008__a = NLoginCore_1682;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_466.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 68), NLoginCore_466.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.B("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒқҞҩҥҨҚҊҲҕħ", (byte)42, 66) + string + NLoginCore_559.B("č", (byte)42, 66) + methodType.toString(), exception);
        }
    }
}

