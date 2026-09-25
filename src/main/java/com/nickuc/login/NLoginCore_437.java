/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_576;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_216;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_229;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_437
extends NLoginType_032 {
    private static int bz;
    private static int az;
    private static int cd;
    private static int bo;
    private static String[] c;
    private static int bj;
    private static int bw;
    private static int bc;
    private static long ay;
    private static int ce;
    private static int bf;
    private static String[] d;
    private static long ax;
    private static int bl;
    private static int cc;
    private static int bi;
    private static int cb;
    private static int a;
    private static int aw;
    private static int ca;
    private static long bb;
    private static int bk;
    private static long ba;
    private static int bt;
    private static int av;
    private static int br;
    private static int bv;
    private static int bq;
    private static int by;
    private static int bd;
    private static long be;
    private static int bp;
    private static long cg;
    private static int ch;
    private static int bn;
    private static long e;
    private static long bs;
    private static int bm;
    private static int bu;
    private static long bg;
    private static int bx;
    private static long cf;
    private static int ci;
    private static int bh;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_437.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.E("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 69), NLoginCore_437.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.E("շքփՆֆւսֆ֑րՍ֋֏ֈ֋֑Փ࣮࣎ࣟ࣠ࢽࣱࣲࣜէ", (byte)88, 69) + string + NLoginCore_138.E("Վ", (byte)88, 69) + methodType.toString(), exception);
        }
    }

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        av = (0 >>> 11 | 0 << -11) & 0xFFFFFFFF;
        aw = (0 >>> 46 | 0 << ~46 + 1) & 0xFFFFFFFF;
        ax = Long.reverse(-2718840801652279408L);
        ay = Long.reverse(-6341068275337658368L);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Long.reverse(-2718840801652279408L);
        bb = Long.reverse(-6341068275337658368L);
        bc = 32768 >>> 206 | 32768 << -206;
        bd = Integer.reverse(-1);
        be = Long.reverse(8233913492112766864L);
        bf = 0x600000 >>> 213 | 0x600000 << ~213 + 1;
        bg = Long.reverse(8233913492112766864L);
        bh = 0 >>> 122 | 0 << ~122 + 1;
        bi = Integer.reverse(0);
        bj = (0 >>> 232 | 0 << -232) & 0xFFFFFFFF;
        bk = Integer.reverse(0);
        bl = (0 >>> 104 | 0 << ~104 + 1) & 0xFFFFFFFF;
        bm = 0 >>> 66 | 0 << ~66 + 1;
        bn = Integer.reverse(0);
        bo = 0 >>> 96 | 0 << -96;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0);
        br = 8 >>> 1 | 8 << ~1 + 1;
        bs = Long.reverse(8233913492112766864L);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = 0 >>> 84 | 0 << -84;
        bv = Integer.reverse(0);
        bw = Integer.reverse(0);
        bx = 0 >>> 3 | 0 << ~3 + 1;
        by = Integer.reverse(0);
        bz = Integer.reverse(Integer.MIN_VALUE);
        ca = (0 >>> 150 | 0 << ~150 + 1) & 0xFFFFFFFF;
        cb = 0 >>> 118 | 0 << ~118 + 1;
        cc = 262144 >>> 242 | 262144 << ~242 + 1;
        cd = Integer.reverse(Integer.MIN_VALUE);
        ce = Integer.reverse(-1610612736);
        cf = Long.reverse(-2718840801652279408L);
        cg = Long.reverse(-6341068275337658368L);
        ch = 48 >>> 3 | 48 << -3;
        ci = 24576 >>> 236 | 24576 << -236;
        c = new String[ch];
        d = new String[ci];
        NLoginCore_437.b();
    }

    @Override
    public void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        String string3;
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            Object[] objectArray = new Object[a];
            objectArray[NLoginCore_437.av] = (String)NLoginCore_437.c("㺀", (int)aw, (long)(ax ^ ay)) + (String)(stringArray.length > 0 ? NLoginCore_437.c("㺃", (int)az, (long)(ba ^ bb)) : NLoginCore_437.c("㺆", (int)(bc & bd), (long)be)) + String.join((CharSequence)NLoginCore_437.c("㺉", (int)bf, (long)bg), stringArray);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_509 NLoginCore_5092 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (ForceRegisterConfig2 == null) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[bh]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (ForceRegisterConfig2.s()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.H, new Object[bi]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_g, new Object[bj]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.F, new Object[bk]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_f, new Object[bl]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (stringArray.length == 0) {
            NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.e, string2 -> NLoginInterface_0242.e((String)string2, string.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_437.c("㺀", (int)ce, (long)(cf ^ cg))), new Object[bm]);
            return;
        }
        NLoginCore_229 NLoginCore_2292 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_229_a();
        if (NLoginCore_2292 != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_a && NLoginCore_2292 != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c) {
            string3 = NLoginCore_277.ac();
            if (NLoginCore_532.M.ar() && !NLoginCore_532.S.a(new Object[bn]).contains(string3)) {
                NLoginCore_576 NLoginCore_576 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().a(string3);
                if (NLoginCore_576 == null) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[bo]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                if (NLoginCore_576.a(NLoginCore_532.N.r())) {
                    Object[] objectArray = new Object[bp];
                    objectArray[NLoginCore_437.bq] = NLoginCore_576.a().stream().map(NLoginCore_216::getName).collect(Collectors.joining((CharSequence)NLoginCore_437.c("㺌", (int)br, (long)bs)));
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.v, objectArray);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
            }
        }
        if (stringArray.length == bt) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.O, new Object[bu]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        string3 = stringArray[bv];
        int n = string3.length();
        if (n <= NLoginCore_532.T.r()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.L, new Object[bw]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (n >= NLoginCore_532.U.r()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.K, new Object[bx]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (NLoginCore_532.V.ar() && !BCryptHashProvider.java_util_regex_Pattern_b().matcher(string3).matches()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.M, new Object[by]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (!string3.equals(stringArray[bz])) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.N, new Object[ca]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_h, new Object[cb]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        ((NLoginType_008)this.a).com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, string3, null, cc != 0, cd != 0);
    }

    public NLoginCore_437(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }

    private static String a(int n, long l) {
        l ^= 0x15L;
        l ^= 0xB1E838882A6F7348L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(6 + 63), (byte)(22 + 61), (byte)(4 + 43), 67, (byte)(29 + 37), (byte)(15 + 52), (byte)(42 + 5), (byte)(61 + 19), (byte)(59 + 16), (byte)(42 + 25), (byte)(20 + 63), (byte)(14 + 39), (byte)(51 + 29), 97, (byte)(15 + 85), (byte)(63 + 37), (byte)(102 + 3), (byte)(41 + 69), (byte)(84 + 19)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(49 + 20), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.E("հսռԿտջնտ֊չՆքֈցք֊Ռࣇࣘࣙࣧࢶࣕ࣫࣪", (byte)81, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_437.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        e = 715708489598313051L;
        long l = e ^ 0xB1E838882A6F7348L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(17 + 52), (byte)(51 + 32), (byte)(42 + 5), (byte)(39 + 28), (byte)(24 + 42), (byte)(55 + 12), (byte)(23 + 24), (byte)(3 + 77), (byte)(36 + 39), (byte)(2 + 65), (byte)(32 + 51), (byte)(28 + 25), (byte)(31 + 49), 97, 100, (byte)(22 + 78), (byte)(11 + 94), (byte)(89 + 21), (byte)(10 + 93)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_437.d[0] = NLoginCore_173.F("԰ԌԨԍӰӱԔԮԾԜӼԟԅԹԩԻԤԆԴԈԼԻԮԑՇԮՄԔԱԬՒՃ", (byte)5, 70);
                    NLoginCore_437.d[1] = NLoginCore_223.E("ԄԓԩԬԚӼԊԱԍԓԘԉ", (byte)5, 69);
                    NLoginCore_437.d[2] = NLoginCore_201.A("¿ÁüÝÑÃûßÖçØÑ", (byte)5, 65);
                    NLoginCore_437.d[3] = NLoginCore_027.D("ЇЖЬЯНϿЍдАЖЛЌ", (byte)5, 68);
                    NLoginCore_437.d[4] = NLoginCore_446.A("ðìäæû¾ÐâØÔöÑ", (byte)5, 65);
                    NLoginCore_437.d[5] = NLoginCore_223.E("ԄԓԩԬԚӼԊԱԍԓԘԉ", (byte)5, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_437.d[0] = NLoginCore_324.C("гЏЫАϳϴЗбсПϿТЈмЬоЧЉзЋпЬЭПЍУяЩСчЧи", (byte)5, 67);
                    NLoginCore_437.d[1] = NLoginCore_453.D("гВБКЙйЕбрЙЗЌ", (byte)5, 68);
                    NLoginCore_437.d[2] = NLoginCore_384.C("ЋМдМпЍДБЎϼЂЌ", (byte)5, 67);
                    NLoginCore_437.d[3] = NLoginCore_091.E("ԇԊӻԑԈԏԖԲԙԐԾԉ", (byte)5, 69);
                    NLoginCore_437.d[4] = NLoginCore_027.B("÷½ÌòãúþăÚÃöÑ", (byte)5, 66);
                    NLoginCore_437.d[5] = NLoginCore_138.B("úäĀðÖ¹ôĈóÁĊÑ", (byte)5, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_437.d[0] = NLoginCore_324.D("огЯЪЩЖврцрЕБххЩЈчЦЙИШЪЗИ", (byte)5, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_437.d[0] = NLoginCore_138.E("ԊԲԻӹԷԔԘӺԯԗԡՁԆԟԾԪՊԟԫԞՆԽԔԕ", (byte)5, 69);
                }
            }
        }
    }
}

