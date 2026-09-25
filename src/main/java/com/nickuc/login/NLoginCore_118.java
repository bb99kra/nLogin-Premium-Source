/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.geysermc.cumulus.form.CustomForm
 *  org.geysermc.cumulus.form.CustomForm$Builder
 *  org.geysermc.cumulus.response.CustomFormResponse
 *  org.geysermc.floodgate.api.player.FloodgatePlayer
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_418;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.geysermc.cumulus.form.CustomForm;
import org.geysermc.cumulus.response.CustomFormResponse;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_118 {
    private static int am;
    private static int bq;
    private static int var_int_c;
    private static int bp;
    private static int q;
    private static int y;
    private static int z;
    private static int at;
    private static int bm;
    private static int e;
    private static int ai;
    private static long ap;
    private static int f;
    private static int az;
    private static int u;
    private static int ay;
    private static long r;
    private static int w;
    private static int bl;
    private static String[] var_java_lang_String_arr_b;
    private static int ab;
    private static int x;
    private static int ah;
    private static int au;
    private static int bi;
    private static int an;
    private static int aa;
    private static int j;
    private static int var_int_p;
    private static long o;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_p;
    private static int aw;
    private static int af;
    private static int v;
    private static int ad;
    private static int ba;
    private static int bt;
    private static int ak;
    private static long ao;
    private static int bj;
    private static String[] var_java_lang_String_arr_a;
    private static int bc;
    private static int bh;
    private static int av;
    private static int bd;
    private static int be;
    private static int ag;
    private static int bg;
    private static long bo;
    private static int bb;
    private static int ae;
    private static int h;
    private static int var_int_b;
    private static int al;
    private static int ac;
    private static int ax;
    private static int bf;
    private static int n;
    private static int aj;
    private static int bs;
    private static int l;
    private static int d;
    private static int bn;
    private static int m;
    private static long ar;
    private static long as;
    private static int g;
    private static long var_long_a;
    private static int bk;
    private static int s;
    private static int k;
    private final NLoginCore_418 var_com_nickuc_login_NLoginCore_418_a;
    private static int i;
    private static int t;
    private static int aq;
    private static long var_long_c;
    private static long br;

    @Nullable
    private String g(@Nullable String string) {
        if (string == null) {
            return null;
        }
        return !(string = string.trim()).isEmpty() ? string.replace((char)bj, (char)bk) : null;
    }

    private static void b() {
        int n;
        var_long_c = 1547073776247567174L;
        long l = var_long_c ^ 0x875836C2C50AEAD6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(5 + 64), (byte)(77 + 6), (byte)(30 + 17), (byte)(11 + 56), (byte)(29 + 37), (byte)(4 + 63), (byte)(19 + 28), (byte)(6 + 74), (byte)(38 + 37), 67, (byte)(73 + 10), (byte)(4 + 49), (byte)(24 + 56), (byte)(20 + 77), (byte)(31 + 69), (byte)(37 + 63), (byte)(49 + 56), (byte)(98 + 12), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_118.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ϸЖІГБЭдйЍгАЉ", (byte)4, 67);
                    NLoginCore_118.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ϸЖІГБЭдйЍгАЉ", (byte)4, 68);
                    NLoginCore_118.var_java_lang_String_arr_b[2] = NLoginCore_223.B("¾ÜÌÙ×óúÿÓùÖÏ", (byte)4, 66);
                    NLoginCore_118.var_java_lang_String_arr_b[3] = NLoginCore_004.E("ӷԕԅԒԐԬԳԸԌԲԏԈ", (byte)4, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_118.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ØÑÀãØ¾ÓĀÈèÉÏ", (byte)4, 66);
                    NLoginCore_118.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ЌЙКЕамϷϼжЖАЉ", (byte)4, 67);
                    NLoginCore_118.var_java_lang_String_arr_b[2] = NLoginCore_027.C("Ўй϶ЖЏоЗДЯпЮЉ", (byte)4, 67);
                    NLoginCore_118.var_java_lang_String_arr_b[3] = NLoginCore_027.F("ԪԘԦԎԬԾԑӼԹԔԂԈ", (byte)4, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_118.var_java_lang_String_arr_b[0] = NLoginCore_384.A("¶ËìúÿöÀÑÐæĈ½øĈĊàøËíĂāăÚÛ", (byte)4, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_118.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ЌЫкМИЋЕЮЛϵЮЉ", (byte)4, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_118.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.D("ЙлнНсѠјѮњЩѧѝѫѥЮѓѵѴѬѲѬс", (byte)20, 68), NLoginCore_118.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.D("єѡѠУѣџњѣѮѝЪѨѬѥѨѮаޢ߀߅߁߉ޛ߅߁߆ޫޠߖߗߔ߃ы", (byte)20, 68) + string + NLoginCore_223.D("Ы", (byte)20, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_long_a = Long.reverse(-4611686018427387904L);
        var_int_b = (0 >>> 83 | 0 << ~83 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = -1 >>> 109 | -1 << -109;
        e = Integer.reverse(-1);
        f = (0 >>> 81 | 0 << ~81 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(-1610612736);
        h = Integer.reverse(0);
        i = Integer.reverse(-637534208);
        j = 128 >>> 231 | 128 << ~231 + 1;
        k = Integer.reverse(-1174405120);
        l = 0x4000000 >>> 58 | 0x4000000 << ~58 + 1;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0);
        o = Long.reverse(-4120950507375026520L);
        var_int_p = (131072 >>> 241 | 131072 << ~241 + 1) & 0xFFFFFFFF;
        q = -1 >>> 1 | -1 << ~1 + 1;
        r = Long.reverse(-4120950507375026520L);
        s = (16384 >>> 237 | 16384 << -237) & 0xFFFFFFFF;
        t = Integer.reverse(0);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = -1 >>> 114 | -1 << -114;
        w = Integer.reverse(0);
        x = 0 >>> 219 | 0 << -219;
        y = (0 >>> 6 | 0 << ~6 + 1) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        aa = (0x200000 >>> 180 | 0x200000 << -180) & 0xFFFFFFFF;
        ab = (0 >>> 38 | 0 << ~38 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(-1);
        ad = 8192 >>> 77 | 8192 << ~77 + 1;
        ae = Integer.reverse(-1);
        af = 0 >>> 198 | 0 << -198;
        ag = 40 >>> 195 | 40 << -195;
        ah = Integer.reverse(0);
        ai = -2147483603 >>> 95 | -2147483603 << -95;
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = Integer.reverse(-1174405120);
        al = 1024 >>> 74 | 1024 << ~74 + 1;
        am = Integer.reverse(Integer.MIN_VALUE);
        an = Integer.reverse(0x40000000);
        ao = Long.reverse(7120034162541731496L);
        ap = Long.reverse(-6629298651489370112L);
        aq = Integer.reverse(-1073741824);
        ar = Long.reverse(7120034162541731496L);
        as = Long.reverse(-6629298651489370112L);
        at = 0x800000 >>> 118 | 0x800000 << ~118 + 1;
        au = Integer.reverse(0);
        av = Integer.reverse(Integer.MIN_VALUE);
        aw = 0 >>> 129 | 0 << -129;
        ax = Integer.reverse(-1);
        ay = Integer.reverse(0);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Integer.reverse(0);
        bb = (-1 >>> 231 | -1 << -231) & 0xFFFFFFFF;
        bc = Integer.reverse(Integer.MIN_VALUE);
        bd = Integer.reverse(0);
        be = (0 >>> 247 | 0 << ~247 + 1) & 0xFFFFFFFF;
        bf = 128 >>> 7 | 128 << ~7 + 1;
        bg = Integer.reverse(-1);
        bh = (32768 >>> 143 | 32768 << ~143 + 1) & 0xFFFFFFFF;
        bi = Integer.reverse(0);
        bj = 4096 >>> 7 | 4096 << ~7 + 1;
        bk = -134217726 >>> 219 | -134217726 << ~219 + 1;
        bl = Integer.reverse(0x40000000);
        bm = (0 >>> 98 | 0 << ~98 + 1) & 0xFFFFFFFF;
        bn = (131072 >>> 81 | 131072 << -81) & 0xFFFFFFFF;
        bo = Long.reverse(-6917529027641081856L);
        bp = (131072 >>> 241 | 131072 << -241) & 0xFFFFFFFF;
        bq = Integer.reverse(0);
        br = Long.reverse(-6917529027641081856L);
        bs = Integer.reverse(0x20000000);
        bt = (0x800000 >>> 149 | 0x800000 << -149) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[bs];
        var_java_lang_String_arr_b = new String[bt];
        NLoginCore_118.b();
    }

    private /* synthetic */ void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2, boolean bl, CustomFormResponse customFormResponse) {
        String string;
        String string2 = this.g((String)customFormResponse.next());
        if (string2 == null) {
            this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
            return;
        }
        if (bl) {
            string = this.g((String)customFormResponse.next());
            if (string == null) {
                this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
                return;
            }
        } else {
            string = string2;
        }
        String[] stringArray = new String[NLoginCore_118.bl];
        stringArray[NLoginCore_118.bm] = string2;
        stringArray[NLoginCore_118.bn] = string;
        NLoginCore_466.var_com_nickuc_login_NLoginCore_466_j.a(NLoginCore_277, NLoginCore_5092, stringArray);
        NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(() -> {
            if (NLoginCore_277.R() && this.var_com_nickuc_login_NLoginType_008_p.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_NLoginCore_077_a() == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d) {
                this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
            }
        }, bo, TimeUnit.SECONDS);
    }

    public boolean boolean_b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2) {
        int n;
        FloodgatePlayer floodgatePlayer = this.var_com_nickuc_login_NLoginCore_418_a.org_geysermc_floodgate_api_player_FloodgatePlayer_a(NLoginCore_277.java_util_UUID_a());
        if (floodgatePlayer == null) {
            return x != 0;
        }
        CustomForm.Builder builder = (CustomForm.Builder)CustomForm.builder().title(NLoginCore_150.a(NLoginCore_374.bC, NLoginCore_277, new Object[y]));
        int n2 = z;
        int[] nArray = new int[aa];
        nArray[NLoginCore_118.ab] = ac;
        nArray[NLoginCore_118.ad] = ae;
        int[] nArray2 = nArray;
        List<String> list = NLoginCore_150.a(NLoginCore_374.bD, NLoginCore_277, new Object[af]);
        for (String string : list) {
            String[] stringArray;
            String string2;
            ++n2;
            if (string.length() > ag && string.charAt(ah) == ai && string.charAt(string.length() - aj) == ak && (string2 = string.substring(al, string.length() - am)).contains((CharSequence)NLoginCore_118.c("㺀", (int)an, (long)(ao ^ ap))) && (stringArray = string2.split((String)NLoginCore_118.c("㺃", (int)aq, (long)(ar ^ as)))).length == at) {
                builder.input(stringArray[au], stringArray[av]);
                if (nArray2[aw] == ax) {
                    nArray2[NLoginCore_118.ay] = n2;
                    continue;
                }
                nArray2[NLoginCore_118.az] = n2;
                continue;
            }
            builder.label(string);
        }
        int n3 = n = nArray2[ba] != bb ? bc : bd;
        if (n == 0) {
            return be != 0;
        }
        int n4 = nArray2[bf] != bg ? bh : bi;
        builder.closedOrInvalidResultHandler(() -> this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2));
        builder.validResultHandler(arg_0 -> this.a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2, n4 != 0, arg_0));
        return floodgatePlayer.sendForm(builder.build());
    }

    @Generated
    public NLoginCore_118(NLoginType_008 NLoginType_008, NLoginCore_418 NLoginCore_4182) {
        this.var_com_nickuc_login_NLoginType_008_p = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_418_a = NLoginCore_4182;
    }

    public boolean boolean_a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2) {
        FloodgatePlayer floodgatePlayer = this.var_com_nickuc_login_NLoginCore_418_a.org_geysermc_floodgate_api_player_FloodgatePlayer_a(NLoginCore_277.java_util_UUID_a());
        if (floodgatePlayer == null) {
            return var_int_b != 0;
        }
        CustomForm.Builder builder = (CustomForm.Builder)CustomForm.builder().title(NLoginCore_150.a(NLoginCore_374.bA, NLoginCore_277, new Object[var_int_c]));
        int n = d;
        int n2 = e;
        List<String> list = NLoginCore_150.a(NLoginCore_374.bB, NLoginCore_277, new Object[f]);
        for (String string : list) {
            String[] stringArray;
            String string2;
            ++n;
            if (string.length() > g && string.charAt(h) == i && string.charAt(string.length() - j) == k && (string2 = string.substring(l, string.length() - m)).contains((CharSequence)NLoginCore_118.c("㺀", (int)NLoginCore_118.n, (long)o)) && (stringArray = string2.split((String)NLoginCore_118.c("㺃", (int)(var_int_p & q), (long)r))).length == s) {
                builder.input(stringArray[t], stringArray[u]);
                n2 = n;
                continue;
            }
            builder.label(string);
        }
        if (n2 == v) {
            return w != 0;
        }
        builder.closedOrInvalidResultHandler(() -> this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2));
        builder.validResultHandler(customFormResponse -> {
            String string = this.g((String)customFormResponse.next());
            if (string == null) {
                this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
                return;
            }
            String[] stringArray = new String[bp];
            stringArray[NLoginCore_118.bq] = string;
            NLoginCore_466.var_com_nickuc_login_NLoginCore_466_f.a(NLoginCore_277, NLoginCore_5092, stringArray);
            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(() -> {
                if (NLoginCore_277.R() && this.var_com_nickuc_login_NLoginType_008_p.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_NLoginCore_077_a() == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d) {
                    this.void_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
                }
            }, br, TimeUnit.SECONDS);
        });
        return floodgatePlayer.sendForm(builder.build());
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x875836C2C50AEAD6L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(33 + 36), (byte)(68 + 15), (byte)(16 + 31), (byte)(16 + 51), (byte)(50 + 16), (byte)(3 + 64), (byte)(12 + 35), 80, (byte)(66 + 9), 67, (byte)(51 + 32), (byte)(25 + 28), (byte)(20 + 60), (byte)(84 + 13), (byte)(61 + 39), (byte)(25 + 75), (byte)(31 + 74), (byte)(36 + 74), (byte)(27 + 76)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.E("զճղԵյձլյրկԼպվշպրՂࢴ࣒࣓ࣗࣛࢭ࣓ࣗࣘࢽࢲࣩࣦࣨࣕ", (byte)71, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_118.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private void void_a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ForceRegisterConfig ForceRegisterConfig2) {
        if (!NLoginCore_277.R()) {
            return;
        }
        NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(() -> {
            if (this.var_com_nickuc_login_NLoginType_008_p.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277).com_nickuc_login_NLoginCore_077_a() == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_d) {
                if (ForceRegisterConfig2.boolean_A()) {
                    this.boolean_b(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
                } else {
                    this.boolean_a(NLoginCore_277, NLoginCore_5092, ForceRegisterConfig2);
                }
            }
        }, var_long_a, TimeUnit.SECONDS);
    }
}

