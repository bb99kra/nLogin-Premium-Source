/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_019;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginType_002;
import com.nickuc.login.NLoginCore_177;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_335;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_333
extends NLoginType_002 {
    private static int dq;
    private static long db;
    private static long dk;
    private static int be;
    private static int dc;
    private static int cq;
    private static int cd;
    private static int df;
    private static int bg;
    private static int bv;
    private static int ct;
    private static int dg;
    private static int cs;
    private static int dr;
    private static long dm;
    private static int da;
    private static int cc;
    private static int cg;
    private static int bh;
    private static long bt;
    private static int bb;
    private static int cfr_renamed_1;
    private static String[] f;
    private static String[] e;
    private static int by;
    private static int dd;
    private static long g;
    private static int di;
    private static long dh;
    private static long bu;
    private static int cy;
    private static int bk;
    private static int bd;
    private static int bz;
    private static int cw;
    private static int br;

    static {
        bb = Integer.reverse(Integer.MIN_VALUE);
        bd = (0 >>> 40 | 0 << ~40 + 1) & 0xFFFFFFFF;
        be = Integer.reverse(0);
        bg = Integer.reverse(Integer.MIN_VALUE);
        bh = (0 >>> 15 | 0 << -15) & 0xFFFFFFFF;
        bk = 0 >>> 192 | 0 << -192;
        br = 0 >>> 78 | 0 << -78;
        bt = Long.reverse(1542055424055693706L);
        bu = Long.reverse(0x7400000000000000L);
        bv = Integer.reverse(0x40000000);
        by = 0 >>> 118 | 0 << -118;
        bz = Integer.reverse(Integer.MIN_VALUE);
        cc = Integer.reverse(-1073741824);
        cd = Integer.reverse(0);
        cg = 0x6000000B >>> 221 | 0x6000000B << ~221 + 1;
        cq = (0x800000 >>> 215 | 0x800000 << ~215 + 1) & 0xFFFFFFFF;
        cs = Integer.reverse(-1174405120);
        ct = Integer.reverse(0);
        cw = Integer.reverse(0);
        cy = Integer.reverse(0x4000000);
        da = Integer.reverse(Integer.MIN_VALUE);
        db = Long.reverse(7018432570938216842L);
        dc = Integer.reverse(Integer.MIN_VALUE);
        dd = Integer.reverse(Integer.MIN_VALUE);
        df = Integer.reverse(0x40000000);
        dg = Integer.reverse(-1);
        dh = Long.reverse(7018432570938216842L);
        di = -1073741824 >>> 254 | -1073741824 << -254;
        dk = Long.reverse(1542055424055693706L);
        dm = Long.reverse(0x7400000000000000L);
        cfr_renamed_1 = 6144 >>> 234 | 6144 << ~234 + 1;
        dq = Integer.reverse(0x20000000);
        dr = 0x4000000 >>> 88 | 0x4000000 << ~88 + 1;
        e = new String[dq];
        f = new String[dr];
        NLoginCore_333.b();
    }

    @Override
    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_509 NLoginCore_5092, String string, String[] stringArray) {
        this.a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, string);
    }

    public NLoginCore_333(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662, NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e);
    }

    private static void b() {
        int n;
        g = 5875987463538632360L;
        long l = g ^ 0xA6579FA6BA9E15B6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(59 + 10), (byte)(37 + 46), 47, (byte)(63 + 4), (byte)(50 + 16), (byte)(18 + 49), (byte)(39 + 8), (byte)(53 + 27), (byte)(43 + 32), (byte)(24 + 43), (byte)(17 + 66), (byte)(38 + 15), (byte)(2 + 78), (byte)(60 + 37), (byte)(21 + 79), (byte)(16 + 84), (byte)(36 + 69), (byte)(8 + 102), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(15 + 54), (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
                    NLoginCore_333.f[0] = NLoginCore_091.B("ǙƢǙǆǀƨǛƫƦǈưǊǈƱƲǤǯưǗǏǹǩǀǁ", (byte)119, 66);
                    NLoginCore_333.f[1] = NLoginCore_092.B("ƵǗǣƢƩǅƽǈǨǌǮƵ", (byte)119, 66);
                    NLoginCore_333.f[2] = NLoginCore_384.C("զվէ֌էիՓ֛ծՙՓ՛։ՠո֌ա֝ոտՠ֦խծ", (byte)119, 67);
                    NLoginCore_333.f[3] = NLoginCore_027.A("ƹǑƺǟƺƾƦǮǁƬƦƮǜƳǋǟƴǰǋǒƳǹǀǁ", (byte)119, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_333.f[0] = NLoginCore_201.D("ֆՏֆճխՕֈ՘Փյ՝Ֆ֑՞՟֊֌՟ֆնտ֦խծ", (byte)119, 68);
                    NLoginCore_333.f[1] = NLoginCore_223.B("ƵƢǨǝǀƥǭƸƪǉǢƵ", (byte)119, 66);
                    NLoginCore_333.f[2] = NLoginCore_091.A("ƹǑƺǟƺƾƦǮǁƬƯƱǡǯǮǎǟƭƴǢǴǩǀǁ", (byte)119, 65);
                    NLoginCore_333.f[3] = NLoginCore_223.E("տ֗ր֥րքլִևղլ֯֏ִ֐ִ֒֔֨־ֿ֙ֆև", (byte)119, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_333.f[0] = NLoginCore_138.C("ձքրզ֒ւՖշհ՗պխ֊֋րւ֏վյ֖քրխծ", (byte)119, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_333.f[0] = NLoginCore_453.F("֡ժ֍աֲ֣֡ի֡էյջ", (byte)119, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_333.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.B("±ÓÕµÙøðĆòÁÿõăýÆëčČĄĊĄÙ", (byte)5, 66), NLoginCore_333.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.E("ԤԱ԰ӳԳԯԪԳԾԭӺԸԼԵԸԾԀࡺ࢜ࡴࢇ࢕࢐ࢗࢎ࢘࢘ࢠࢀԘ", (byte)5, 69) + string + NLoginCore_559.C("Ͼ", (byte)5, 67) + methodType.toString(), exception);
        }
    }

    @Override
    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_560 NLoginInterface_0382, String string, String[] stringArray) {
        if (this.a.java_lang_String_b(ForceRegisterConfig2) == null) {
            Object[] objectArray = new Object[bg];
            objectArray[NLoginCore_333.bh] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aj, objectArray);
            return;
        }
        NLoginInterface_0382.b(ForceRegisterConfig2, NLoginCore_277);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ax, new Object[bk]);
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0xA6579FA6BA9E15B6L;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(6 + 63), (byte)(50 + 33), (byte)(35 + 12), (byte)(38 + 29), (byte)(54 + 12), (byte)(62 + 5), (byte)(11 + 36), 80, (byte)(10 + 65), (byte)(54 + 13), (byte)(21 + 62), (byte)(5 + 48), (byte)(37 + 43), (byte)(45 + 52), (byte)(68 + 32), (byte)(16 + 84), (byte)(7 + 98), (byte)(68 + 42), (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.B("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҐҲҊҝҫҦҭҤҮҮҶҖ", (byte)44, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_333.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    private void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string, String string3) {
        String string4 = (String)NLoginCore_333.c("㺀", (int)br, (long)(bt ^ bu)) + string3;
        NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
        Consumer<String> consumer = string2 -> {
            String string3 = string2.trim();
            if (string3.length() > cc && string3.charAt(cd) == cg && string3.charAt(string3.length() - cq) == cs) {
                char c;
                int n = ct;
                Object object = string2.toCharArray();
                int n2 = ((char[])object).length;
                for (int i = cw; i < n2 && (c = object[i]) == cy; ++i) {
                    ++n;
                }
                object = NLoginCore_112.b((String)NLoginCore_333.c("㺀", (int)da, (long)db), n) + string3.substring(dc, string3.length() - dd).replace((CharSequence)NLoginCore_333.c("㺃", (int)(df & dg), (long)dh), string4);
                NLoginInterface_0242.f((String)object, string4);
                return;
            }
            NLoginInterface_0242.a(string2.replace((CharSequence)NLoginCore_333.c("㺆", (int)di, (long)(dk ^ dm)), string4));
        };
        Object[] objectArray = new Object[bv];
        objectArray[NLoginCore_333.by] = string;
        objectArray[NLoginCore_333.bz] = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_308_a().com_nickuc_login_NLoginCore_057_a().com_nickuc_login_lib_jda_api_JDA_a().getSelfUser().getAsTag();
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.aA, consumer, objectArray);
    }

    @Override
    protected void a(NLoginCore_277 NLoginCore_277, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_509 NLoginCore_5092, NLoginCore_560 NLoginInterface_0382, String string, String[] stringArray) {
        NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
        if (NLoginCore_3352.m() != null) {
            Object[] objectArray = new Object[bb];
            objectArray[NLoginCore_333.bd] = this.a.u();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.ak, objectArray);
            return;
        }
        String string2 = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_b.a(new Object[be]);
        String string3 = (String)NLoginCore_5092.d(NLoginCore_567.O);
        if (string3 == null) {
            string3 = NLoginCore_177.a(NLoginType_019.cfr_renamed_5.asMap(), () -> NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, cfr_renamed_1));
            NLoginCore_5092.a(NLoginCore_567.O, (Object)string3);
            NLoginType_019.cfr_renamed_5.put((Object)string3, (Object)NLoginCore_277.getName());
        }
        this.a(NLoginCore_277, NLoginCore_5092, string2, string3);
    }
}

