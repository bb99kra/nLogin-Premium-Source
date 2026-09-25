/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginType_002;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_295
extends NLoginType_002 {
    private static int lt;
    private static int kv;
    private static int ei;
    private static int lq;
    private static int lj;
    private static int df;
    private static int km;
    private static int cw;
    private static int bv;
    private static int lu;
    private static int jz;
    private static int lf;
    private static int bk;
    private static final List<String> var_java_util_List_java_lang_String__g;
    private static int gi;
    private static long de;
    private static int lc;
    private static int cc;
    private static int kr;
    private static int ks;
    private static int el;
    private static int fk;
    private static long bu;
    private static long kw;
    private static int kn;
    private static int lm;
    private static int ge;
    private static int du;
    private static int bb;
    private static long gc;
    private static int cy;
    private static int dc;
    private static int lb;
    private static int da;
    private static long ll;
    private static long fm;
    private static int kl;
    private static String[] e;
    private static long ca;
    private static long bi;
    private static int cd;
    private static int lr;
    private static int cg;
    private static int fe;
    private static int kt;
    private static int hm;
    private static int iy;
    private static int jy;
    private static int gz;
    private static int ga;
    private static int lg;
    private static long bl;
    private static long fg;
    private static int kh;
    private static long ls;
    private static int fd;
    private static int fp;
    private static int dz;
    private static int ez;
    private static int gx;
    private static int dq;
    private static int cs;
    private static int dl;
    private static int cfr_renamed_1;
    private static int ko;
    private static long lh;
    private static String[] f;
    private static int lk;
    private static int kx;
    private static long la;
    private static int by;
    private static int ku;
    private static int ld;
    private static int dt;
    private static int cq;
    private static int gf;
    private static int bd;
    private static long gg;
    private static int bg;
    private static int fi;
    private static int cfr_renamed_0;
    private static long bt;
    private static int hp;
    private static int kg;
    private static int li;
    private static int be;
    private static int gj;
    private static long var_long_g;
    private static long kp;
    private static long ff;
    private static int dd;
    private static int ho;
    private static int br;
    private static int ky;
    private static int ln;
    private static int dj;
    private static int dw;
    private static int jk;
    private static long lo;
    private static long lv;
    private static long lp;
    private static int dg;
    private static int kz;
    private static long le;
    private static int bs;
    private static int hl;
    private static int kd;
    private static int fo;
    private static int gn;
    private static long lw;
    private static int kc;
    private static int ee;
    private static int kq;
    private static int hj;
    private static int ek;
    private static int ct;
    private static int di;
    private static int dr;

    @Override
    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_560 NLoginInterface_0382, String string, String[] stringArray) {
        if (stringArray.length != el) {
            Object[] objectArray = new Object[ez];
            objectArray[NLoginCore_295.fd] = (String)NLoginCore_295.c("㺀", (int)fe, (long)(ff ^ fg)) + string.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_295.c("㺃", (int)(fi & fk), (long)fm) + stringArray[fo].toLowerCase(Locale.ENGLISH) + (String)NLoginCore_295.c("㺆", (int)(fp & ga), (long)gc) + this.a.u() + (String)NLoginCore_295.c("㺉", (int)(ge & gf), (long)gg);
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.x, objectArray);
            return;
        }
        String string2 = this.a.java_lang_String_b(ForceRegisterConfig2);
        if (string2 == null) {
            Object[] objectArray = new Object[gi];
            objectArray[NLoginCore_295.gj] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aj, objectArray);
            return;
        }
        String string3 = stringArray[gn];
        if (!string2.equalsIgnoreCase(string3)) {
            Object[] objectArray = new Object[gx];
            objectArray[NLoginCore_295.gz] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.bk, objectArray);
            return;
        }
        if (this.a.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b) && this.a.d(ForceRegisterConfig2)) {
            Object[] objectArray = new Object[hj];
            objectArray[NLoginCore_295.hl] = hm;
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ao, objectArray);
            return;
        }
        NLoginInterface_0382.b(ForceRegisterConfig2, NLoginCore_277);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ax, new Object[ho]);
    }

    private static void b() {
        int n;
        var_long_g = -8001118041022751318L;
        long l = var_long_g ^ 0xA3D2083693C67A30L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(37 + 32), (byte)(60 + 23), (byte)(24 + 23), 67, (byte)(60 + 6), (byte)(44 + 23), (byte)(2 + 45), 80, (byte)(64 + 11), (byte)(19 + 48), (byte)(47 + 36), (byte)(29 + 24), (byte)(58 + 22), (byte)(28 + 69), (byte)(67 + 33), (byte)(21 + 79), (byte)(21 + 84), (byte)(59 + 51), (byte)(65 + 38)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_295.f[0] = NLoginCore_138.D("ӀҕҘҰҘҿҿҕҔҾҼғ", (byte)50, 68);
                    NLoginCore_295.f[1] = NLoginCore_575.F("Ն՗ՄՃՋԽԦՌՀ՟ԨԶ", (byte)50, 70);
                    NLoginCore_295.f[2] = NLoginCore_201.D("ҙҶҒҹѿғ҅Ҹҫҭӈғ", (byte)50, 68);
                    NLoginCore_295.f[3] = NLoginCore_027.B("ĹĹŒįŒİőŚĠķŘī", (byte)50, 66);
                    NLoginCore_295.f[4] = NLoginCore_138.F("գՆՂԣաԾԹլաԮՑԶ", (byte)50, 70);
                    NLoginCore_295.f[5] = NLoginCore_091.A("ŘĭİňİŗŗĭĬŖŔī", (byte)50, 65);
                    NLoginCore_295.f[6] = NLoginCore_110.C("ңҴҡҠҨҚ҃ҩҝҼ҅ғ", (byte)50, 67);
                    NLoginCore_295.f[7] = NLoginCore_559.F("ԼՙԵ՜ԢԶԨ՛ՎՐիԶ", (byte)50, 70);
                    NLoginCore_295.f[8] = NLoginCore_384.C("ҡҡҺҗҺҘҹӂ҈ҟӀғ", (byte)50, 67);
                    NLoginCore_295.f[9] = NLoginCore_027.C("ӀңҟҀҾқҖӉҾҋҮғ", (byte)50, 67);
                    NLoginCore_295.f[10] = NLoginCore_110.F("՗զ՛ԧՉխաՊգՄխԿՊՊՔՖՁՓՋՍՕժՁՂ", (byte)50, 70);
                    NLoginCore_295.f[11] = NLoginCore_091.A("ĦŜĳĞĮĻŠĳŝőŏŞŝőĴŉśğĽŅŝşĶķ", (byte)50, 65);
                    NLoginCore_295.f[12] = NLoginCore_324.C("ҺҲӂӂ҅҇ҁҬӅҩ҄ҥҧҧҺ҉ҭғҵҶҨҡҞҟ", (byte)50, 67);
                    NLoginCore_295.f[13] = NLoginCore_575.E("ՠ՛ՒՇ՜Զը՚ԽհժՎկՈԫԴըԸԱ԰ռպՁՂ", (byte)50, 69);
                    NLoginCore_295.f[14] = NLoginCore_004.D("ҕҡҀӇӃҠҾӄҌӁ҄ҽӊ҈ҿғӓӐӕ҉ҐұҞҟ", (byte)50, 68);
                    NLoginCore_295.f[15] = NLoginCore_110.D("ӂҭҥѾұ҃ӂҦҵҸҙҼҜұқ҅ӐҤҰґұҡҞҟ", (byte)50, 68);
                    NLoginCore_295.f[16] = NLoginCore_091.F("դ՗ԼՖՀԹ՞ՂՁԨգՓԲձՖՆյկթԸհՄՁՂ", (byte)50, 70);
                    NLoginCore_295.f[17] = NLoginCore_173.A("ĭŊĩşĚĞŖĴĤġśĽĽķĲŉţŢŖšōşĶķ", (byte)50, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_295.f[0] = NLoginCore_004.E("ԱԼՂՇԡԞԿՁբ՟գԶ", (byte)50, 69);
                    NLoginCore_295.f[1] = NLoginCore_092.E("ՕգԼ՘ԢԷխՉգԬկԶ", (byte)50, 69);
                    NLoginCore_295.f[2] = NLoginCore_091.A("ĹĩĸĲŕŚŞţĬĞĝī", (byte)50, 65);
                    NLoginCore_295.f[3] = NLoginCore_027.D("ӃҀҎҒ҄ӃӋҚӇҟҞғ", (byte)50, 68);
                    NLoginCore_295.f[4] = NLoginCore_110.E("԰ԶՑԩՌԬՅՙՉՀԨԶ", (byte)50, 69);
                    NLoginCore_295.f[5] = NLoginCore_453.C("ѼғҒҼұҶҠ҃҇ҡҮғ", (byte)50, 67);
                    NLoginCore_295.f[6] = NLoginCore_201.F("ՠԧժդՋՠԵՄՅԩՅԶ", (byte)50, 70);
                    NLoginCore_295.f[7] = NLoginCore_324.D("ҵѾҠҶҰҩҁӉҨҥҦғ", (byte)50, 68);
                    NLoginCore_295.f[8] = NLoginCore_223.C("ҝҎҚҸ҂ҴғҔҠӁҼғ", (byte)50, 67);
                    NLoginCore_295.f[9] = NLoginCore_027.F("ՄԸԸՖԨՅՕբՍԯՁԶ", (byte)50, 70);
                    NLoginCore_295.f[10] = NLoginCore_092.E("՗զ՛ԧՉխաՊգՄիեԫԬՖՀԮՕՐԱԱժՁՂ", (byte)50, 69);
                    NLoginCore_295.f[11] = NLoginCore_138.E("ԱէԾԩԹՆիԾը՜ՑԯԿծՇՠՆԸբԵէԸԶՐԻղոբՙսՒտ", (byte)50, 69);
                    NLoginCore_295.f[12] = NLoginCore_387.D("ҺҲӂӂ҅҇ҁҬӅҩҎ҇ҚҌҲҜҳҐҠңҲӗӂҘҖҹҽҩҘҷӍҹ", (byte)50, 68);
                    NLoginCore_295.f[13] = NLoginCore_223.F("ՠ՛ՒՇ՜Զը՚Խհը՜ըՎյՇԲԷ԰Շ՛ժՁՂ", (byte)50, 70);
                    NLoginCore_295.f[14] = NLoginCore_138.C("ҕҡҀӇӃҠҾӄҌӁҀӎһӄҍҢҭңҒҕӒҡҞҟ", (byte)50, 67);
                    NLoginCore_295.f[15] = NLoginCore_384.C("ӂҭҥѾұ҃ӂҦҵҸҙӁ҂ҚҽӓӋӌґҷӓӇҞҟ", (byte)50, 67);
                    NLoginCore_295.f[16] = NLoginCore_559.D("ӁҴҙҳҝҖһҟҞ҅ӁӃҩҋҠӍҬҋӊҭҳӇҞҟ", (byte)50, 68);
                    NLoginCore_295.f[17] = NLoginCore_559.A("ĭŊĩşĚĞŖĴĤġŚŧţşŕŨĴŚŅśŜůĶķ", (byte)50, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_295.f[0] = NLoginCore_076.E("ՄՒՉՀՉԢթ՛ԫՃՉԶ", (byte)50, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_295.f[0] = NLoginCore_091.E("Եՠ՛՞ԡԾ՞ՆԺՏ՛Զ", (byte)50, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x12L;
        l ^= 0xA3D2083693C67A30L;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(19 + 50), (byte)(53 + 30), 47, (byte)(2 + 65), (byte)(38 + 28), (byte)(10 + 57), (byte)(6 + 41), (byte)(11 + 69), (byte)(58 + 17), (byte)(21 + 46), (byte)(4 + 79), 53, (byte)(37 + 43), (byte)(32 + 65), (byte)(14 + 86), (byte)(10 + 90), (byte)(9 + 96), (byte)(16 + 94), (byte)(29 + 74)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.B("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӴӨӂӧӄӹөӼӸӷ", (byte)78, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_295.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    @Override
    protected List<String> b(NLoginCore_494 NLoginInterface_0422, String string3, String[] stringArray) {
        int n;
        String string4;
        if (stringArray.length == hp && !(string4 = stringArray[cfr_renamed_0]).isEmpty() && (n = string4.lastIndexOf(iy)) != jk) {
            List<String> list = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_s.a(new Object[jy]);
            List<String> list2 = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_t.a(new Object[jz]);
            if (!list.isEmpty()) {
                return list.stream().map(string -> (String)NLoginCore_295.c("㺀", (int)(kn & ko), (long)kp) + string).filter(string2 -> string2.toLowerCase(Locale.ENGLISH).startsWith(string4.substring(n))).filter(string -> (!list2.contains(string) ? kl : km) != 0).map(string2 -> string4.substring(kh, n) + string2).collect(Collectors.toList());
            }
            return var_java_util_List_java_lang_String__g.stream().filter(string2 -> string2.toLowerCase(Locale.ENGLISH).startsWith(string4.substring(n))).filter(string -> (!list2.contains(string) ? kd : kg) != 0).map(string2 -> string4.substring(kc, n) + string2).collect(Collectors.toList());
        }
        return super.b(NLoginInterface_0422, string3, stringArray);
    }

    static {
        bb = Integer.reverse(0x40000000);
        bd = Integer.reverse(Integer.MIN_VALUE);
        be = (0 >>> 178 | 0 << -178) & 0xFFFFFFFF;
        bg = Integer.reverse(0);
        bi = Long.reverse(2141878823347187465L);
        bk = 8192 >>> 13 | 8192 << -13;
        bl = Long.reverse(2141878823347187465L);
        br = Integer.reverse(0);
        bs = 16384 >>> 173 | 16384 << -173;
        bt = Long.reverse(6177104089471151881L);
        bu = Long.reverse(0x4800000000000000L);
        bv = Integer.reverse(-1073741824);
        by = Integer.reverse(-1);
        ca = Long.reverse(2141878823347187465L);
        cc = Integer.reverse(Integer.MIN_VALUE);
        cd = 0x800000 >>> 182 | 0x800000 << -182;
        cg = Integer.reverse(0);
        cq = (2 >>> 65 | 2 << -65) & 0xFFFFFFFF;
        cs = (4096 >>> 76 | 4096 << ~76 + 1) & 0xFFFFFFFF;
        ct = Integer.reverse(0);
        cw = -1073741821 >>> 254 | -1073741821 << -254;
        cy = Integer.reverse(Integer.MIN_VALUE);
        da = 0 >>> 229 | 0 << -229;
        dc = (0x40000000 >>> 92 | 0x40000000 << ~92 + 1) & 0xFFFFFFFF;
        dd = Integer.reverse(-1);
        de = Long.reverse(2141878823347187465L);
        df = 532676608 >>> 85 | 532676608 << ~85 + 1;
        dg = Integer.reverse(0x40000000);
        di = Integer.reverse(0);
        dj = (0 >>> 77 | 0 << -77) & 0xFFFFFFFF;
        dl = 131072 >>> 17 | 131072 << -17;
        cfr_renamed_1 = Integer.reverse(0);
        dq = 0 >>> 83 | 0 << ~83 + 1;
        dr = 4096 >>> 12 | 4096 << ~12 + 1;
        dt = 0 >>> 214 | 0 << -214;
        du = Integer.reverse(0);
        dw = (512 >>> 201 | 512 << ~201 + 1) & 0xFFFFFFFF;
        dz = Integer.reverse(0);
        ee = 8 >>> 34 | 8 << ~34 + 1;
        ei = Integer.reverse(0);
        ek = 0x100000 >>> 244 | 0x100000 << ~244 + 1;
        el = (Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << -94) & 0xFFFFFFFF;
        ez = Integer.reverse(Integer.MIN_VALUE);
        fd = 0 >>> 66 | 0 << -66;
        fe = (0xA00000 >>> 213 | 0xA00000 << -213) & 0xFFFFFFFF;
        ff = Long.reverse(6177104089471151881L);
        fg = Long.reverse(0x4800000000000000L);
        fi = Integer.reverse(0x60000000);
        fk = Integer.reverse(-1);
        fm = Long.reverse(2141878823347187465L);
        fo = 0 >>> 147 | 0 << ~147 + 1;
        fp = 57344 >>> 141 | 57344 << ~141 + 1;
        ga = Integer.reverse(-1);
        gc = Long.reverse(2141878823347187465L);
        ge = Integer.reverse(0x10000000);
        gf = Integer.reverse(-1);
        gg = Long.reverse(2141878823347187465L);
        gi = Integer.reverse(Integer.MIN_VALUE);
        gj = Integer.reverse(0);
        gn = (0x100000 >>> 116 | 0x100000 << ~116 + 1) & 0xFFFFFFFF;
        gx = (0x800000 >>> 151 | 0x800000 << -151) & 0xFFFFFFFF;
        gz = Integer.reverse(0);
        hj = 0x20000000 >>> 157 | 0x20000000 << ~157 + 1;
        hl = Integer.reverse(0);
        hm = -536870911 >>> 157 | -536870911 << -157;
        ho = Integer.reverse(0);
        hp = 16 >>> 35 | 16 << -35;
        cfr_renamed_0 = Integer.reverse(Integer.MIN_VALUE);
        iy = (0x20000000 >>> 55 | 0x20000000 << -55) & 0xFFFFFFFF;
        jk = Integer.reverse(-1);
        jy = Integer.reverse(0);
        jz = (0 >>> 76 | 0 << -76) & 0xFFFFFFFF;
        kc = (0 >>> 240 | 0 << ~240 + 1) & 0xFFFFFFFF;
        kd = 64 >>> 70 | 64 << ~70 + 1;
        kg = Integer.reverse(0);
        kh = Integer.reverse(0);
        kl = 0x200000 >>> 245 | 0x200000 << -245;
        km = Integer.reverse(0);
        kn = (4608 >>> 9 | 4608 << ~9 + 1) & 0xFFFFFFFF;
        ko = (-1 >>> 176 | -1 << -176) & 0xFFFFFFFF;
        kp = Long.reverse(2141878823347187465L);
        kq = Integer.reverse(0x48000000);
        kr = (0x1200000 >>> 212 | 0x1200000 << ~212 + 1) & 0xFFFFFFFF;
        ks = Integer.reverse(0x10000000);
        kt = Integer.reverse(0);
        ku = 40 >>> 130 | 40 << ~130 + 1;
        kv = Integer.reverse(-1);
        kw = Long.reverse(2141878823347187465L);
        kx = Integer.reverse(Integer.MIN_VALUE);
        ky = 0x5800000 >>> 87 | 0x5800000 << -87;
        kz = -1 >>> 40 | -1 << -40;
        la = Long.reverse(2141878823347187465L);
        lb = Integer.reverse(0x40000000);
        lc = Integer.reverse(0x30000000);
        ld = Integer.reverse(-1);
        le = Long.reverse(2141878823347187465L);
        lf = Integer.reverse(-1073741824);
        lg = Integer.reverse(-1342177280);
        lh = Long.reverse(2141878823347187465L);
        li = Integer.reverse(0x20000000);
        lj = (0xE00000 >>> 180 | 0xE00000 << -180) & 0xFFFFFFFF;
        lk = Integer.reverse(-1);
        ll = Long.reverse(2141878823347187465L);
        lm = (320 >>> 166 | 320 << ~166 + 1) & 0xFFFFFFFF;
        ln = Integer.reverse(-268435456);
        lo = Long.reverse(6177104089471151881L);
        lp = Long.reverse(0x4800000000000000L);
        lq = 3 >>> 255 | 3 << ~255 + 1;
        lr = Integer.reverse(0x8000000);
        ls = Long.reverse(2141878823347187465L);
        lt = (112 >>> 4 | 112 << ~4 + 1) & 0xFFFFFFFF;
        lu = (0x44000000 >>> 154 | 0x44000000 << ~154 + 1) & 0xFFFFFFFF;
        lv = Long.reverse(6177104089471151881L);
        lw = Long.reverse(0x4800000000000000L);
        e = new String[kq];
        f = new String[kr];
        NLoginCore_295.b();
        String[] stringArray = new String[ks];
        stringArray[NLoginCore_295.kt] = NLoginCore_295.c("㺀", (int)(ku & kv), (long)kw);
        stringArray[NLoginCore_295.kx] = NLoginCore_295.c("㺃", (int)(ky & kz), (long)la);
        stringArray[NLoginCore_295.lb] = NLoginCore_295.c("㺆", (int)(lc & ld), (long)le);
        stringArray[NLoginCore_295.lf] = NLoginCore_295.c("㺉", (int)lg, (long)lh);
        stringArray[NLoginCore_295.li] = NLoginCore_295.c("㺌", (int)(lj & lk), (long)ll);
        stringArray[NLoginCore_295.lm] = NLoginCore_295.c("㺏", (int)ln, (long)(lo ^ lp));
        stringArray[NLoginCore_295.lq] = NLoginCore_295.c("㺒", (int)lr, (long)ls);
        stringArray[NLoginCore_295.lt] = NLoginCore_295.c("㺕", (int)lu, (long)(lv ^ lw));
        var_java_util_List_java_lang_String__g = Arrays.asList(stringArray);
    }

    @Override
    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_509 NLoginCore_5092, NLoginCore_560 NLoginInterface_0382, String string, String[] stringArray) {
        if (stringArray.length != bb) {
            Object[] objectArray = new Object[bd];
            objectArray[NLoginCore_295.be] = (String)NLoginCore_295.c("㺀", (int)bg, (long)bi) + string.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_295.c("㺃", (int)bk, (long)bl) + stringArray[br].toLowerCase(Locale.ENGLISH) + (String)NLoginCore_295.c("㺆", (int)bs, (long)(bt ^ bu)) + this.a.u() + (String)NLoginCore_295.c("㺉", (int)(bv & by), (long)ca);
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.x, objectArray);
            return;
        }
        String string2 = stringArray[cc].toLowerCase(Locale.ENGLISH);
        String string3 = this.a.java_lang_String_a(ForceRegisterConfig2);
        if (string3 != null && this.a.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_a)) {
            if (string3.equalsIgnoreCase(string2)) {
                Object[] objectArray = new Object[cd];
                objectArray[NLoginCore_295.cg] = this.a.u();
                objectArray[NLoginCore_295.cq] = string3;
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aq, objectArray);
                return;
            }
            if (this.a.d(ForceRegisterConfig2)) {
                Object[] objectArray = new Object[cs];
                objectArray[NLoginCore_295.ct] = cw;
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ao, objectArray);
                return;
            }
        }
        if (ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l() != null) {
            Object[] objectArray = new Object[cy];
            objectArray[NLoginCore_295.da] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ak, objectArray);
            return;
        }
        String[] stringArray2 = string2.split((String)NLoginCore_295.c("㺌", (int)(dc & dd), (long)de));
        if (string2.length() >= df || stringArray2.length != dg) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.bk, new Object[di]);
            return;
        }
        List<String> list = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_s.a(new Object[dj]);
        if (!list.isEmpty() && !list.contains(stringArray2[dl].toLowerCase(Locale.ENGLISH))) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.bl, new Object[cfr_renamed_1]);
            return;
        }
        List<String> list2 = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_t.a(new Object[dq]);
        if (!list2.isEmpty() && list2.contains(stringArray2[dr].toLowerCase(Locale.ENGLISH))) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.bl, new Object[dt]);
            return;
        }
        String string4 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_308_a().com_nickuc_login_NLoginCore_144_a().com_nickuc_login_NLoginCore_153_a().cA;
        if (string4.equalsIgnoreCase(string2)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.bm, new Object[du]);
            return;
        }
        int n = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_q.r();
        if (n > 0 && this.a.a((NLoginType_008)this.a, string2) >= n) {
            Object[] objectArray = new Object[dw];
            objectArray[NLoginCore_295.dz] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.al, objectArray);
            return;
        }
        this.a.void_b(ForceRegisterConfig2);
        this.a.b(ForceRegisterConfig2, string2);
        NLoginInterface_0382.a(ForceRegisterConfig2, NLoginCore_277, string2);
        Object[] objectArray = new Object[ee];
        objectArray[NLoginCore_295.ei] = this.a.u();
        objectArray[NLoginCore_295.ek] = string2;
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aq, objectArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_295.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԅԧԩԉԭՌՄ՚ՆԕՓՉ՗ՑԚԿաՠ՘՞՘ԭ", (byte)33, 69), NLoginCore_295.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.C("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߱ߥ޿ߤ߁߶ߦ߹ߵߴѭ", (byte)33, 67) + string + NLoginCore_173.D("ђ", (byte)33, 68) + methodType.toString(), exception);
        }
    }

    public NLoginCore_295(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662, NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f);
    }
}

