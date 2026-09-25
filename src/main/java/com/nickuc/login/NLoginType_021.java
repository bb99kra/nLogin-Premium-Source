/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.ChangePasswordSource
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.enums.event.UpdatePasswordSource
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.ChangePasswordSource;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_308;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginType_021
extends NLoginType_032 {
    private static long e;
    private static int ct;
    private static int cf;
    private static int cp;
    private static float cv;
    private static int bb;
    private static int by;
    private static String[] d;
    private static int bh;
    private static int ch;
    private static int cx;
    private static int bv;
    private static long bg;
    private static long bd;
    private static int bs;
    private static int cg;
    private static int br;
    private static long ay;
    private static int av;
    private static String[] c;
    private static int bw;
    private static long bj;
    private static int bz;
    private static int cc;
    private static int az;
    private static int be;
    private static int bo;
    private static int a;
    private static int cn;
    private static int cr;
    private static long bf;
    private static int cs;
    private static float cu;
    private static int bi;
    private static long cm;
    private static int bu;
    private static int cq;
    private static int co;
    private static int cl;
    private static long ax;
    private static int ci;
    private static long ck;
    private static int ce;
    private static int bl;
    private static int cw;
    private static int bm;
    private static long bk;
    private static int cy;
    private static int bq;
    private static long ba;
    private static int aw;
    private static int bp;
    private static int bn;
    private static int bt;
    private static int cb;
    private static int ca;
    private static long bc;
    private static int cj;
    private static int bx;
    private static int cd;

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        av = 0 >>> 22 | 0 << -22;
        aw = Integer.reverse(0);
        ax = Long.reverse(-6328213011801433167L);
        ay = Long.reverse(0x400000000000000L);
        az = (0x100000 >>> 52 | 0x100000 << ~52 + 1) & 0xFFFFFFFF;
        ba = Long.reverse(-6039982635649721423L);
        bb = (2 >>> 224 | 2 << -224) & 0xFFFFFFFF;
        bc = Long.reverse(-6328213011801433167L);
        bd = Long.reverse(0x400000000000000L);
        be = Integer.reverse(-1073741824);
        bf = Long.reverse(-6328213011801433167L);
        bg = Long.reverse(0x400000000000000L);
        bh = (131072 >>> 144 | 131072 << ~144 + 1) & 0xFFFFFFFF;
        bi = (512 >>> 135 | 512 << -135) & 0xFFFFFFFF;
        bj = Long.reverse(-6328213011801433167L);
        bk = Long.reverse(0x400000000000000L);
        bl = Integer.reverse(-1073741824);
        bm = Integer.reverse(0);
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = 0 >>> 16 | 0 << ~16 + 1;
        bp = Integer.reverse(0x40000000);
        bq = (0 >>> 42 | 0 << ~42 + 1) & 0xFFFFFFFF;
        br = Integer.reverse(Integer.MIN_VALUE);
        bs = Integer.reverse(0);
        bt = 0 >>> 213 | 0 << ~213 + 1;
        bu = Integer.reverse(0);
        bv = (64 >>> 70 | 64 << -70) & 0xFFFFFFFF;
        bw = Integer.reverse(0);
        bx = 0 >>> 105 | 0 << ~105 + 1;
        by = (0 >>> 2 | 0 << ~2 + 1) & 0xFFFFFFFF;
        bz = 0 >>> 177 | 0 << -177;
        ca = (0 >>> 10 | 0 << ~10 + 1) & 0xFFFFFFFF;
        cb = (Integer.MIN_VALUE >>> 61 | Integer.MIN_VALUE << ~61 + 1) & 0xFFFFFFFF;
        cc = 0 >>> 250 | 0 << -250;
        cd = (0x100000 >>> 244 | 0x100000 << -244) & 0xFFFFFFFF;
        ce = 0x800000 >>> 214 | 0x800000 << ~214 + 1;
        cf = Integer.reverse(-1073741824);
        cg = Integer.reverse(0);
        ch = 0 >>> 154 | 0 << -154;
        ci = 0xA000000 >>> 153 | 0xA000000 << ~153 + 1;
        cj = Integer.reverse(-1);
        ck = Long.reverse(-6039982635649721423L);
        cl = (384 >>> 6 | 384 << ~6 + 1) & 0xFFFFFFFF;
        cm = Long.reverse(-6039982635649721423L);
        cn = Integer.reverse(0);
        co = 0x28000000 >>> 155 | 0x28000000 << -155;
        cp = Integer.reverse(0);
        cq = Integer.reverse(Integer.MIN_VALUE);
        cr = 0x40000000 >>> 253 | 0x40000000 << -253;
        cs = (0x3000000 >>> 248 | 0x3000000 << -248) & 0xFFFFFFFF;
        ct = (0x4000000 >>> 56 | 0x4000000 << ~56 + 1) & 0xFFFFFFFF;
        cu = Float.intBitsToFloat(Integer.reverse(3714));
        cv = Float.intBitsToFloat((-2139095040 >>> 129 | -2139095040 << -129) & 0xFFFFFFFF);
        cw = Integer.reverse(0);
        cx = Integer.reverse(-536870912);
        cy = Integer.reverse(-536870912);
        c = new String[cx];
        d = new String[cy];
        NLoginType_021.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_021.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("½ßáÁåĄüĒþÍċāďĉÒ÷ęĘĐĖĐå", (byte)11, 65), NLoginType_021.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.D("йцхЈшфпшѓтЏэёъэѓЕޜޛ޲ުޓެޢޭޭސ޶Ь", (byte)11, 68) + string + NLoginCore_451.A("Ï", (byte)11, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x20L;
        l ^= 0x23A8D0EEA9BE035BL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(61 + 8), (byte)(66 + 17), (byte)(25 + 22), (byte)(3 + 64), 66, (byte)(47 + 20), (byte)(29 + 18), 80, (byte)(28 + 47), (byte)(20 + 47), (byte)(61 + 22), (byte)(24 + 29), (byte)(59 + 21), (byte)(33 + 64), (byte)(98 + 2), (byte)(41 + 59), (byte)(48 + 57), (byte)(109 + 1), (byte)(48 + 55)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ĜĩĨëīħĢīĶĥòİĴĭİĶøѿѾҕҍѶҏ҅ҐҐѳҙ", (byte)29, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_021.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        e = -8225744374179974123L;
        long l = e ^ 0x23A8D0EEA9BE035BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(33 + 36), (byte)(47 + 36), (byte)(19 + 28), 67, (byte)(63 + 3), (byte)(59 + 8), (byte)(3 + 44), (byte)(16 + 64), (byte)(17 + 58), (byte)(9 + 58), (byte)(73 + 10), (byte)(14 + 39), (byte)(31 + 49), (byte)(11 + 86), (byte)(45 + 55), (byte)(96 + 4), (byte)(63 + 42), (byte)(104 + 6), (byte)(24 + 79)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_021.d[0] = NLoginCore_575.F("ՙբեՕՏ՞Ծԩ՞ՊէգԶՄե՚ՃՄԾ՞ԯճՑ՘՛ԳԺծճ՞ռԽ", (byte)45, 70);
                    NLoginType_021.d[1] = NLoginCore_138.C("ѲѳҧҭҴҸҳѷҞҟѶ҄", (byte)45, 67);
                    NLoginType_021.d[2] = NLoginCore_173.B("ĊğńŒĴŘŎįēħėġ", (byte)45, 66);
                    NLoginType_021.d[3] = NLoginCore_575.B("ďĐńŊőŕŐĔĻļēġ", (byte)45, 66);
                    NLoginType_021.d[4] = NLoginCore_575.E("ԛՒԯՒԝ԰ՇԣԹգՙԩ՚Ձ՞ԻԤԮՊբաՏԼԽ", (byte)45, 69);
                    NLoginType_021.d[5] = NLoginCore_446.E("ՂԣԷՆԼ՛ԡԠդՔբԱ", (byte)45, 69);
                    NLoginType_021.d[6] = NLoginCore_446.E("ԵԷՔՃԠՆ՞ժԲ՜դխ՛ԯՆԹէԻծՂՃդ՗ժգՋկիկՠ՜ոԹ՚ջձա՚դՆ։լ՜վՆՈֆՃ֐հՎձ։օ՜՝", (byte)45, 69);
                    continue block7;
                }
                case 1: {
                    NLoginType_021.d[0] = NLoginCore_201.A("ŉŒŕŅĿŎĮęŎĺŗœĦĴŕŊĳĴĮŎğŗĴŜĦūŌļŜŪŀŌĩŤűŵţŲũŎŖŅŘŁ", (byte)45, 65);
                    NLoginType_021.d[1] = NLoginCore_387.F("ՁԹՅԤԴԸ՝ՖԩՀզԱ", (byte)45, 70);
                    NLoginType_021.d[2] = NLoginCore_324.A("ıŃĪŔĬŕłĖŘĪŒġ", (byte)45, 65);
                    NLoginType_021.d[3] = NLoginCore_223.B("ĿŌĲŏŊőģĳĸŊĴġ", (byte)45, 66);
                    NLoginType_021.d[4] = NLoginCore_138.E("ԛՒԯՒԝ԰ՇԣԹգ՗՞ԨՎգձԯդՆիԬ՗զԴմխՆղ՝ՙխռ", (byte)45, 69);
                    NLoginType_021.d[5] = NLoginCore_027.B("ŏďĝĮđĩĒĸĳŚŚġ", (byte)45, 66);
                    NLoginType_021.d[6] = NLoginCore_091.D("҈ҊҧҖѳҙұҽ҅үҷӀҮ҂ҙҌҺҎӁҕҖҷҪҽҶҞӂҾӂҳүӋҌҭӎӄҴҭҷҙӜҿҰӏӌӂӖҡӂһӣҡӊҾӅӌӦҧӝӠӢӤӆӁ", (byte)45, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_021.d[0] = NLoginCore_324.A("ŒŔġĝĔġġŏŚĕŗēŚļşķŊĠŘĹłĠŢŕśġŧţĪġľŚ", (byte)45, 65);
                    continue block7;
                }
                case 4: {
                    NLoginType_021.d[0] = NLoginCore_138.D("ңҁѯѸҌҬѺґҫҗҍҀҴӁҐґҖҽҨҟѿҒҏҐ", (byte)45, 68);
                }
            }
        }
    }

    public NLoginType_021(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            Object[] objectArray = new Object[a];
            objectArray[NLoginType_021.av] = (String)NLoginType_021.c("㺀", (int)aw, (long)(ax ^ ay)) + (String)(stringArray.length > 0 ? NLoginType_021.c("㺃", (int)az, (long)ba) : NLoginType_021.c("㺆", (int)bb, (long)(bc ^ bd))) + String.join((CharSequence)NLoginType_021.c("㺉", (int)be, (long)(bf ^ bg)), stringArray);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_509 NLoginCore_5092 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
        NLoginCore_077 NLoginCore_0772 = NLoginCore_5092.com_nickuc_login_NLoginCore_077_a();
        if (NLoginCore_0772.c(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f) || !NLoginCore_0772.b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g) && NLoginCore_5012 != null && NLoginCore_5012.com_nickuc_login_NLoginCore_211_a() != NLoginCore_211.var_com_nickuc_login_NLoginCore_211_i) {
            return;
        }
        if (stringArray.length != bh) {
            Object[] objectArray = new Object[bl];
            objectArray[NLoginType_021.bm] = string;
            objectArray[NLoginType_021.bn] = NLoginCore_150.a(NLoginCore_374.D, NLoginCore_277, new Object[bo]);
            objectArray[NLoginType_021.bp] = NLoginCore_150.a(NLoginCore_374.E, NLoginCore_277, new Object[bq]);
            String string2 = String.format((String)NLoginType_021.c("㺌", (int)bi, (long)(bj ^ bk)), objectArray);
            Object[] objectArray2 = new Object[br];
            objectArray2[NLoginType_021.bs] = string2;
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.x, objectArray2);
            return;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!ForceRegisterConfig2.s()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.t, new Object[bt]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        String string3 = stringArray[bu];
        String string4 = stringArray[bv];
        int n = string4.length();
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
        if (NLoginCore_532.V.ar() && !BCryptHashProvider.java_util_regex_Pattern_b().matcher(string4).matches()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.M, new Object[by]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (string3.equals(string4)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.J, new Object[bz]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        NLoginCore_291 NLoginCore_2912 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a();
        if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2, string3)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.P, new Object[ca]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        UUID uUID = NLoginCore_277.java_util_UUID_a();
        String string5 = NLoginCore_277.getName();
        Object[] objectArray = new Object[cb];
        objectArray[NLoginType_021.cc] = NLoginCore_277;
        objectArray[NLoginType_021.cd] = uUID;
        objectArray[NLoginType_021.ce] = string5;
        objectArray[NLoginType_021.cf] = ChangePasswordSource.BY_PLAYER;
        if (((NLoginType_008)this.a).a(EventEnum.CHANGE_PASSWORD, objectArray)) {
            Object object = ForceRegisterConfig2.var_java_lang_Object_c;
            synchronized (object) {
                if (!ForceRegisterConfig2.s()) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.t, new Object[cg]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                if (ForceRegisterConfig2.boolean_x()) {
                    ForceRegisterConfig2.C();
                }
                if (!NLoginCore_2912.c(ForceRegisterConfig2, string4)) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[ch]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                NLoginCore_370.b((String)NLoginType_021.c("㺏", (int)(ci & cj), (long)ck) + string5 + (String)NLoginType_021.c("㺒", (int)cl, (long)cm) + NLoginCore_277.ac(), new Object[cn]);
                if (NLoginCore_5012 != null && NLoginCore_5012.com_nickuc_login_NLoginCore_211_a() == NLoginCore_211.var_com_nickuc_login_NLoginCore_211_i) {
                    NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b().b((NLoginType_008)this.a, NLoginCore_277, NLoginCore_5092);
                }
                Object[] objectArray3 = new Object[co];
                objectArray3[NLoginType_021.cp] = NLoginCore_277;
                objectArray3[NLoginType_021.cq] = uUID;
                objectArray3[NLoginType_021.cr] = string5;
                objectArray3[NLoginType_021.cs] = string4;
                objectArray3[NLoginType_021.ct] = UpdatePasswordSource.BY_PLAYER;
                ((NLoginType_008)this.a).a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray3);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, cu, cv);
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.var_com_nickuc_login_NLoginCore_487_o, new Object[cw]);
                NLoginCore_308 NLoginCore_3082 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_308_a();
                if (NLoginCore_3082.com_nickuc_login_NLoginCore_057_a() != null && ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m() != null) {
                    NLoginCore_3082.com_nickuc_login_NLoginCore_057_a().c(ForceRegisterConfig2, NLoginCore_277, string4);
                }
                if (NLoginCore_3082.com_nickuc_login_NLoginCore_144_a() != null && ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l() != null) {
                    NLoginCore_3082.com_nickuc_login_NLoginCore_144_a().c(ForceRegisterConfig2, NLoginCore_277, string4);
                }
            }
        }
    }
}

