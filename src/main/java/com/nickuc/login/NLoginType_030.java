/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.TwoFactorType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_336;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_451;
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

public abstract class NLoginType_030
implements NLoginCore_395,
NLoginCore_336 {
    private static int f;
    private static int s;
    private static int v;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private final NLoginCore_374 var_com_nickuc_login_NLoginCore_487_a;
    private static int t;
    private static int m;
    private static int e;
    private static int g;
    private static int u;
    private static int i;
    private static int l;
    private static long d;
    private final NLoginCore_248 var_com_nickuc_login_NLoginCore_311_b;
    private static int h;
    private static int r;
    private static int o;
    private static int var_int_a;
    private static int var_int_c;
    private static int n;
    private static long q;
    private static String[] var_java_lang_String_arr_a;
    private final NLoginCore_211 ap;
    private static int j;
    private static int k;
    private static int p;

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return s != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.ap;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_030.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("ӨԊԌӬԐԯԧԽԩӸԶԬԺԴӽԢՄՃԻՁԻԐ", (byte)89, 67), NLoginType_030.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.E("ոօքՇևփվև֒ցՎ֌֐։֌֒Քࣱ࣮ࣥ࣠ࣅࣦ࣮࣫ࣗ࣬ࣸի", (byte)89, 69) + string + NLoginCore_004.D("Ӻ", (byte)89, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        NLoginCore_560 NLoginInterface_0382 = this.var_com_nickuc_login_NLoginCore_311_b.com_nickuc_login_NLoginInterface_038_a(NLoginType_008);
        String string = this.var_com_nickuc_login_NLoginCore_311_b.java_lang_String_b(ForceRegisterConfig2);
        Object[] objectArray = new Object[i];
        objectArray[NLoginType_030.j] = TwoFactorType.convert((Enum)this.var_com_nickuc_login_NLoginCore_311_b);
        objectArray[NLoginType_030.k] = NLoginCore_277;
        objectArray[NLoginType_030.l] = string;
        NLoginType_008.a(EventEnum.TWO_FACTOR_REQUEST, objectArray);
        NLoginCore_5092.a(NLoginCore_567.A, (Object)(NLoginCore_532.E.r() * m));
        NLoginInterface_0382.a(ForceRegisterConfig2, NLoginCore_277);
        String string2 = NLoginCore_150.a(this.var_com_nickuc_login_NLoginCore_487_a, NLoginCore_277, new Object[n]).replace((CharSequence)NLoginType_030.c("㺀", (int)(o & p), (long)q), NLoginCore_277.ac());
        NLoginInterface_0242.a(string2);
        return new GUIButtonContainer[r];
    }

    private static String a(int n, long l) {
        l ^= 0x48L;
        l ^= 0x98590737436E3C0CL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), 69, (byte)(65 + 18), (byte)(3 + 44), (byte)(31 + 36), (byte)(20 + 46), 67, (byte)(12 + 35), (byte)(58 + 22), (byte)(60 + 15), (byte)(11 + 56), (byte)(75 + 8), (byte)(41 + 12), (byte)(48 + 32), (byte)(6 + 91), (byte)(96 + 4), (byte)(33 + 67), (byte)(101 + 4), (byte)(91 + 19), (byte)(20 + 83)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢴࢽࣀࢯ࢔ࢵࢽࢺࢦࢻࣇ", (byte)40, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_030.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public boolean boolean_at() {
        return t != 0;
    }

    static {
        var_int_a = (0 >>> 198 | 0 << ~198 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-269685297102639533L);
        e = 0 >>> 66 | 0 << ~66 + 1;
        f = Integer.reverse(0);
        g = (0x200000 >>> 149 | 0x200000 << -149) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        i = Integer.reverse(-1073741824);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Integer.reverse(0x40000000);
        m = Integer.reverse(-1610612736);
        n = 0 >>> 147 | 0 << ~147 + 1;
        o = 64 >>> 198 | 64 << -198;
        p = -1 >>> 97 | -1 << ~97 + 1;
        q = Long.reverse(-269685297102639533L);
        r = 0 >>> 20 | 0 << ~20 + 1;
        s = 0 >>> 119 | 0 << -119;
        t = (256 >>> 8 | 256 << -8) & 0xFFFFFFFF;
        u = 512 >>> 40 | 512 << ~40 + 1;
        v = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[u];
        var_java_lang_String_arr_b = new String[v];
        NLoginType_030.b();
    }

    @Generated
    NLoginType_030(NLoginCore_211 NLoginCore_211, NLoginCore_248 NLoginCore_3112, NLoginCore_374 NLoginCore_4872) {
        this.ap = NLoginCore_211;
        this.var_com_nickuc_login_NLoginCore_311_b = NLoginCore_3112;
        this.var_com_nickuc_login_NLoginCore_487_a = NLoginCore_4872;
    }

    private static void b() {
        int n;
        var_long_c = -3858264859413609865L;
        long l = var_long_c ^ 0x98590737436E3C0CL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(47 + 22), (byte)(50 + 33), (byte)(24 + 23), (byte)(40 + 27), (byte)(8 + 58), 67, (byte)(19 + 28), (byte)(55 + 25), (byte)(58 + 17), (byte)(34 + 33), (byte)(29 + 54), (byte)(15 + 38), (byte)(16 + 64), (byte)(91 + 6), (byte)(14 + 86), (byte)(94 + 6), (byte)(104 + 1), (byte)(27 + 83), (byte)(51 + 52)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_030.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ºéü¾ÿéÁÂºÎ¸ýüâĀÿûÕàáùÿÖ×", (byte)2, 65);
                    NLoginType_030.var_java_lang_String_arr_b[1] = NLoginCore_004.F("ԊԍԵԑԑ԰ԑӻԱԾԸԮԚԖԛԟԻ԰ԼԉՌՊԑԒ", (byte)2, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_030.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ӵԤԷӹԺԤӼӽӵԉӳԒԼԙԹԹՅԔԻՋԴԔԢԯԍԜԨԊԾԆԽՈ", (byte)2, 69);
                    NLoginType_030.var_java_lang_String_arr_b[1] = NLoginCore_027.C("ЇЊвЎЎЭЎϸЮлеКШЁУϹсвЯмсзЎЏ", (byte)2, 67);
                    continue block7;
                }
                case 2: {
                    NLoginType_030.var_java_lang_String_arr_b[0] = NLoginCore_173.E("ԢԸӶԚԖԋԧӷԾԞӸԆ", (byte)2, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_030.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԯԘԒԄԻԨԩԮԕԊԊԋԙԵԤӸԄԹԪՋՃԔԑԒ", (byte)2, 69);
                }
            }
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        String string;
        if (!this.var_com_nickuc_login_NLoginCore_311_b.d(NLoginType_008)) {
            return var_int_a != 0;
        }
        NLoginCore_560 NLoginInterface_0382 = this.var_com_nickuc_login_NLoginCore_311_b.com_nickuc_login_NLoginInterface_038_a(NLoginType_008);
        if (!NLoginInterface_0382.aF()) {
            return var_int_b != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!NLoginCore_277.i((String)NLoginType_030.c("㺀", (int)var_int_c, (long)d) + this.var_com_nickuc_login_NLoginCore_311_b.getName()) && ((string = ForceRegisterConfig2.k()) == null || string.equals(NLoginCore_277.ac()))) {
            return e != 0;
        }
        if (Boolean.TRUE.equals(NLoginCore_5092.a(NLoginCore_567.D))) {
            return f != 0;
        }
        string = this.var_com_nickuc_login_NLoginCore_311_b.java_lang_String_b(ForceRegisterConfig2);
        return (string != null && this.var_com_nickuc_login_NLoginCore_311_b.e(ForceRegisterConfig2) ? g : h) != 0;
    }

    @Generated
    public NLoginCore_248 com_nickuc_login_NLoginCore_311_a() {
        return this.var_com_nickuc_login_NLoginCore_311_b;
    }
}

