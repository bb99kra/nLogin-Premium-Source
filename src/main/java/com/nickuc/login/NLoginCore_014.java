/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_014
extends NLoginType_032 {
    private static long cc;
    private static int be;
    private static int bh;
    private static int bd;
    private static int a;
    private static int cg;
    private static int cj;
    private static int bl;
    private static long bs;
    private static String[] d;
    private static int cq;
    private static int cv;
    private static int by;
    private static int bk;
    private static long ba;
    private static long e;
    private static int cu;
    private static int ca;
    private static int ci;
    private static int cn;
    private static long az;
    private static int bt;
    private static int bw;
    private static long cb;
    private static long bm;
    private static int cm;
    private static int bb;
    private static long bf;
    private static int bi;
    private static long cs;
    private static long cp;
    private static int bq;
    private static long ax;
    private static int cl;
    private static int bz;
    private static long bn;
    private static int ck;
    private static int ay;
    private static int bp;
    private static long br;
    private static long co;
    private static int bv;
    private static int cr;
    private static int bo;
    private static int bx;
    private static long ce;
    private static int cw;
    private static int aw;
    private static int cd;
    private static int bu;
    private static long ct;
    private static long cf;
    private static int bg;
    private static int av;
    private static long bj;
    private static long bc;
    private static String[] c;
    private static int cx;
    private static int ch;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar()) {
            return;
        }
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
            return;
        }
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            Object[] objectArray = new Object[a];
            objectArray[NLoginCore_014.av] = (String)NLoginCore_014.c("㺀", (int)aw, (long)ax) + NLoginCore_466.var_com_nickuc_login_NLoginCore_466_h.a().aa() + (String)(stringArray.length > 0 ? NLoginCore_014.c("㺃", (int)ay, (long)(az ^ ba)) : NLoginCore_014.c("㺆", (int)bb, (long)bc)) + String.join((CharSequence)NLoginCore_014.c("㺉", (int)(bd & be), (long)bf), stringArray);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a();
        if (!NLoginCore_1872.boolean_b(NLoginCore_277)) {
            NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            if (NLoginCore_5012 != null && NLoginCore_5012.com_nickuc_login_NLoginCore_211_a() == NLoginCore_211.var_com_nickuc_login_NLoginCore_211_b) {
                String[] stringArray2 = new String[bg];
                stringArray2[NLoginCore_014.bh] = NLoginCore_014.c("㺌", (int)bi, (long)bj);
                stringArray2[NLoginCore_014.bk] = NLoginCore_014.c("㺏", (int)bl, (long)(bm ^ bn));
                stringArray2[NLoginCore_014.bo] = Integer.toString(NLoginCore_211.var_com_nickuc_login_NLoginCore_211_b.v());
                stringArray2[NLoginCore_014.bp] = Integer.toString(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.v());
                NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b.a(NLoginCore_277, NLoginCore_5092, stringArray2);
            }
            return;
        }
        if (stringArray.length == 0) {
            Object[] objectArray = new Object[bt];
            objectArray[NLoginCore_014.bu] = string;
            objectArray[NLoginCore_014.bv] = NLoginCore_150.a(NLoginCore_374.D, NLoginCore_277, new Object[bw]);
            String string2 = String.format((String)NLoginCore_014.c("㺒", (int)bq, (long)(br ^ bs)), objectArray);
            Object[] objectArray2 = new Object[bx];
            objectArray2[NLoginCore_014.by] = string2;
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray2);
            return;
        }
        NLoginCore_509 NLoginCore_5093 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5093.com_nickuc_login_ForceRegisterConfig_a();
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (!ForceRegisterConfig2.boolean_h()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[bz]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            UUID uUID = ForceRegisterConfig2.getMojangId();
            if (uUID != null) {
                if (uUID.equals(ForceRegisterConfig2.java_util_UUID_a())) {
                    NLoginCore_5093.com_nickuc_login_NLoginInterface_024_a().a((String)(NLoginCore_5093.j() ? NLoginCore_014.c("㺕", (int)ca, (long)(cb ^ cc)) : NLoginCore_014.c("㺘", (int)cd, (long)(ce ^ cf))));
                    NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                    return;
                }
                if (ForceRegisterConfig2.t()) {
                    String string3;
                    NLoginCore_291 NLoginCore_2912 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a();
                    if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2, string3 = stringArray[cg])) {
                        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.P, new Object[ch]);
                        NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                        return;
                    }
                    ForceRegisterConfig2.b(null);
                    if (!((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, new NLoginCore_436[ci])) {
                        ForceRegisterConfig2.b(uUID);
                        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[cj]);
                        NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                        return;
                    }
                    NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.r, NLoginCore_277, new Object[ck]));
                    return;
                }
            }
        }
        String[] stringArray3 = new String[cl];
        stringArray3[NLoginCore_014.cm] = NLoginCore_014.c("㺛", (int)cn, (long)(co ^ cp));
        stringArray3[NLoginCore_014.cq] = NLoginCore_014.c("㺞", (int)cr, (long)(cs ^ ct));
        stringArray3[NLoginCore_014.cu] = Integer.toString(NLoginCore_211.var_com_nickuc_login_NLoginCore_211_b.v());
        stringArray3[NLoginCore_014.cv] = Integer.toString(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c.v());
        NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b.a(NLoginCore_277, NLoginCore_5093, stringArray3);
    }

    private static void b() {
        int n;
        e = -7294582867979874239L;
        long l = e ^ 0x9A05D9B6EA511E26L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(46 + 23), (byte)(36 + 47), (byte)(45 + 2), (byte)(42 + 25), (byte)(33 + 33), (byte)(40 + 27), (byte)(42 + 5), (byte)(19 + 61), (byte)(22 + 53), (byte)(31 + 36), (byte)(3 + 80), (byte)(24 + 29), (byte)(10 + 70), 97, 100, (byte)(54 + 46), (byte)(47 + 58), (byte)(88 + 22), (byte)(7 + 96)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(49 + 34)}, StandardCharsets.UTF_8));
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
                    NLoginCore_014.d[0] = NLoginCore_575.D("ռձշ֙֔սջբ֐ոՠծ", (byte)123, 68);
                    NLoginCore_014.d[1] = NLoginCore_559.A("ǪǚƩǄǁƫǓǡƲǄǶƽ", (byte)123, 65);
                    NLoginCore_014.d[2] = NLoginCore_559.B("ƶǆǘǁǰǢƼǯǆǏǶƽ", (byte)123, 66);
                    NLoginCore_014.d[3] = NLoginCore_223.A("ǪǚƩǄǁƫǓǡƲǄǶƽ", (byte)123, 65);
                    NLoginCore_014.d[4] = NLoginCore_173.A("ǅǡưǊƬǴǣǃǏǤǄƽ", (byte)123, 65);
                    NLoginCore_014.d[5] = NLoginCore_110.E("սպ֧֞խխ֗խցչֵּ֌ֶֹ֩֙֘ո־ֳ֡֊֋", (byte)123, 69);
                    NLoginCore_014.d[6] = NLoginCore_324.F("չ֚խ֢֣֔վֳ֐։ճְ֦֍֟֟ղִ֣֟֡׃֊֋", (byte)123, 70);
                    NLoginCore_014.d[7] = NLoginCore_092.A("ǞǀǦƬǩǠǡǯǦǠǧǌǣǐƮǨǴǠǓǝǿǒƿǚǡǅǁǼǵǦǅǋǎȋǰǤǒǭǢȊǟȐȏǴǑȌȔșȘǙǙǾǺȝǠǺȧȣǞǺǠșȢǶ", (byte)123, 65);
                    NLoginCore_014.d[8] = NLoginCore_027.D("֛Ւճ֊֍նրնպչցք֤և֜֟ոբ֑պև֋֔֟ցծ֐ֶ֨մ֚նִֵֵֹֿ֕֜֬ւօׁ֥׊׀֛֜֙׊ֈ֨֐֏׈׉ֲׁׄחגִֶָ", (byte)123, 68);
                    NLoginCore_014.d[9] = NLoginCore_384.F("և֣ղ֌ծֶ֥օ֑֦ֆտ", (byte)123, 70);
                    NLoginCore_014.d[10] = NLoginCore_559.B("ƻƸǜǥƫƫǕƫƿƷǳǺǊǧǗǴǷǖƶǼǟǱǈǉ", (byte)123, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_014.d[0] = NLoginCore_092.E("ֈհց֌ֵիֱֲ֨֏֒տ", (byte)123, 69);
                    NLoginCore_014.d[1] = NLoginCore_092.A("ƮƷǞǆǁǯǧǃǟƮǀƽ", (byte)123, 65);
                    NLoginCore_014.d[2] = NLoginCore_076.D("տ֗ՠ֣՝՟՞֑֦՞֟ծ", (byte)123, 68);
                    NLoginCore_014.d[3] = NLoginCore_427.F("֏կ֦֮ձօյִ֧֓ւտ", (byte)123, 70);
                    NLoginCore_014.d[4] = NLoginCore_324.E("օ֬կւձլֳ։֗ւֈֳօ֛֮֫֙ռֳִ֮֟֊֋", (byte)123, 69);
                    NLoginCore_014.d[5] = NLoginCore_027.F("սպ֧֞խխ֗խցչִֶַֽ֪֫֗֏֢֋ֳ֗֊֋", (byte)123, 70);
                    NLoginCore_014.d[6] = NLoginCore_453.E("չ֚խ֢֣֔վֳ֐։ղ֜֍ռև֑֐ֳֿ֮֞֝֊֋", (byte)123, 69);
                    NLoginCore_014.d[7] = NLoginCore_451.A("ǞǀǦƬǩǠǡǯǦǠǧǌǣǐƮǨǴǠǓǝǿǒƿǚǡǅǁǼǵǦǅǋǎȋǰǤǒǭǢȊǟȐȏǴǑȌȔșȘǙǙǾǺȕǶǵǥǸǡǧȈȪȚǤ", (byte)123, 65);
                    NLoginCore_014.d[8] = NLoginCore_201.C("֛Ւճ֊֍նրնպչցք֤և֜֟ոբ֑պև֋֔֟ցծ֐ֶ֨մ֚նִֵֵֹֿ֕֜֬ւօׁ֥׊׀֛֜֙׊ֈ֨֐֎ֲ֤֪׉֔כב֭֕ו", (byte)123, 67);
                    NLoginCore_014.d[9] = NLoginCore_027.F("հ֥սօտ֖ֆփ֧չ֏֜մָ֫֋տ֘ջֵ֡֍֊֋", (byte)123, 70);
                    NLoginCore_014.d[10] = NLoginCore_451.E("սպ֧֞խխ֗խցչֲִ֪֝֓յִֵ֑֓վֻտׂ֤֤֡׃օֈֶ֡", (byte)123, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_014.d[0] = NLoginCore_559.A("ǢǩǀǛǠǟǭǯǡǒǳǰǳƭƲǽǾƱǶǯǒǸȂǣǿǐǃǧǔǼǄǤ", (byte)123, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_014.d[0] = NLoginCore_201.A("ƭƿƧǎƭǋǱƿƭǎǲƽ", (byte)123, 65);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x79L;
        l ^= 0x9A05D9B6EA511E26L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(33 + 50), (byte)(14 + 33), (byte)(22 + 45), (byte)(14 + 52), (byte)(59 + 8), (byte)(3 + 44), (byte)(12 + 68), (byte)(21 + 54), (byte)(64 + 3), (byte)(10 + 73), (byte)(4 + 49), (byte)(79 + 1), (byte)(35 + 62), (byte)(80 + 20), (byte)(9 + 91), (byte)(2 + 103), (byte)(89 + 21), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.F("ԭԺԹӼԼԸԳԼՇԶԃՁՅԾՁՇԉ࢜ࡷ࢓ࢆ࢝ࢩ࢘࢟ࢉࢌ", (byte)14, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_014.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_014.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ӰԒԔӴԘԷԯՅԱԀԾԴՂԼԅԪՌՋՃՉՃԘ", (byte)12, 69), NLoginCore_014.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("ԫԸԷӺԺԶԱԺՅԴԁԿՃԼԿՅԇ࢚ࡵ࢑ࢄ࢛ࢧ࢖࢝ࢇࢊԝ", (byte)12, 69) + string + NLoginCore_559.F("Ԃ", (byte)12, 70) + methodType.toString(), exception);
        }
    }

    static {
        a = 1 >>> 96 | 1 << -96;
        av = (0 >>> 6 | 0 << ~6 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(0);
        ax = Long.reverse(2020733690802742105L);
        ay = 0x40000000 >>> 222 | 0x40000000 << -222;
        az = Long.reverse(-9076135791038160039L);
        ba = Long.reverse(-7061644215716937728L);
        bb = (256 >>> 103 | 256 << -103) & 0xFFFFFFFF;
        bc = Long.reverse(2020733690802742105L);
        bd = Integer.reverse(-1073741824);
        be = -1 >>> 150 | -1 << -150;
        bf = Long.reverse(2020733690802742105L);
        bg = Integer.reverse(0x20000000);
        bh = (0 >>> 134 | 0 << ~134 + 1) & 0xFFFFFFFF;
        bi = (64 >>> 196 | 64 << -196) & 0xFFFFFFFF;
        bj = Long.reverse(2020733690802742105L);
        bk = (16384 >>> 174 | 16384 << -174) & 0xFFFFFFFF;
        bl = 0x280000 >>> 243 | 0x280000 << -243;
        bm = Long.reverse(-9076135791038160039L);
        bn = Long.reverse(-7061644215716937728L);
        bo = Integer.reverse(0x40000000);
        bp = Integer.reverse(-1073741824);
        bq = (786432 >>> 177 | 786432 << ~177 + 1) & 0xFFFFFFFF;
        br = Long.reverse(-9076135791038160039L);
        bs = Long.reverse(-7061644215716937728L);
        bt = (16 >>> 195 | 16 << -195) & 0xFFFFFFFF;
        bu = (0 >>> 148 | 0 << -148) & 0xFFFFFFFF;
        bv = 0x200000 >>> 117 | 0x200000 << -117;
        bw = Integer.reverse(0);
        bx = Integer.reverse(Integer.MIN_VALUE);
        by = Integer.reverse(0);
        bz = 0 >>> 16 | 0 << -16;
        ca = Integer.reverse(-536870912);
        cb = Long.reverse(-9076135791038160039L);
        cc = Long.reverse(-7061644215716937728L);
        cd = Integer.reverse(0x10000000);
        ce = Long.reverse(-9076135791038160039L);
        cf = Long.reverse(-7061644215716937728L);
        cg = (0 >>> 159 | 0 << ~159 + 1) & 0xFFFFFFFF;
        ch = 0 >>> 63 | 0 << ~63 + 1;
        ci = Integer.reverse(0);
        cj = 0 >>> 202 | 0 << ~202 + 1;
        ck = (0 >>> 95 | 0 << ~95 + 1) & 0xFFFFFFFF;
        cl = 8 >>> 225 | 8 << -225;
        cm = Integer.reverse(0);
        cn = Integer.reverse(-1879048192);
        co = Long.reverse(-9076135791038160039L);
        cp = Long.reverse(-7061644215716937728L);
        cq = Integer.reverse(Integer.MIN_VALUE);
        cr = 640 >>> 134 | 640 << ~134 + 1;
        cs = Long.reverse(-9076135791038160039L);
        ct = Long.reverse(-7061644215716937728L);
        cu = Integer.reverse(0x40000000);
        cv = Integer.reverse(-1073741824);
        cw = Integer.reverse(-805306368);
        cx = 360448 >>> 111 | 360448 << -111;
        c = new String[cw];
        d = new String[cx];
        NLoginCore_014.b();
    }

    public NLoginCore_014(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
    }
}

