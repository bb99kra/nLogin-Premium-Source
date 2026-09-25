/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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
import lombok.Generated;

public final class NLoginCore_556
extends Enum<NLoginCore_556> {
    public static final /* enum */ NLoginCore_556 var_com_nickuc_login_NLoginCore_556_a;
    public static final /* enum */ NLoginCore_556 var_com_nickuc_login_NLoginCore_556_b;
    public static final /* enum */ NLoginCore_556 var_com_nickuc_login_NLoginCore_556_c;
    public static final /* enum */ NLoginCore_556 var_com_nickuc_login_NLoginCore_556_d;
    public static final /* enum */ NLoginCore_556 var_com_nickuc_login_NLoginCore_556_e;
    private final String bC;
    private static final /* synthetic */ NLoginCore_556[] var_com_nickuc_login_NLoginCore_556_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int var_int_e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static long k;
    private static long l;
    private static int m;
    private static int n;
    private static long o;
    private static int p;
    private static long q;
    private static long r;
    private static int s;
    private static int t;
    private static int u;
    private static long v;
    private static int w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static long ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static int af;
    private static int ag;
    private static long ah;
    private static int ai;
    private static long aj;
    private static int ak;
    private static int al;
    private static long am;
    private static long an;

    public static NLoginCore_556[] values() {
        return (NLoginCore_556[])var_com_nickuc_login_NLoginCore_556_arr_a.clone();
    }

    @Generated
    private NLoginCore_556(String string2) {
        this.bC = string2;
    }

    @Nullable
    public static NLoginCore_556 a(String string) {
        NLoginCore_556[] NLoginCore_556Array = NLoginCore_556.values();
        int n = NLoginCore_556Array.length;
        for (int i = var_int_a; i < n; ++i) {
            NLoginCore_556 NLoginCore_5562 = NLoginCore_556Array[i];
            if (!NLoginCore_5562.bC.equals(string)) continue;
            return NLoginCore_5562;
        }
        return null;
    }

    public static NLoginCore_556 valueOf(String string) {
        return Enum.valueOf(NLoginCore_556.class, string);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_556.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.A("ųƕƗŷƛƺƲǈƴƃǁƷǅƿƈƭǏǎǆǌǆƛ", (byte)102, 65), NLoginCore_556.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("օ֑֒Ք֔֐֋֔֟֎՛֖֙֝֙֟ա࣭ࣷࣵࣻࣝ࣬࣢࣭ࣷն", (byte)102, 70) + string + NLoginCore_223.C("ԡ", (byte)102, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    public String af() {
        return this.bC;
    }

    private static /* synthetic */ NLoginCore_556[] a() {
        NLoginCore_556[] NLoginCore_556Array = new NLoginCore_556[var_int_b];
        NLoginCore_556Array[NLoginCore_556.var_int_c] = var_com_nickuc_login_NLoginCore_556_a;
        NLoginCore_556Array[NLoginCore_556.var_int_d] = var_com_nickuc_login_NLoginCore_556_b;
        NLoginCore_556Array[NLoginCore_556.var_int_e] = var_com_nickuc_login_NLoginCore_556_c;
        NLoginCore_556Array[NLoginCore_556.f] = var_com_nickuc_login_NLoginCore_556_d;
        NLoginCore_556Array[NLoginCore_556.g] = var_com_nickuc_login_NLoginCore_556_e;
        return NLoginCore_556Array;
    }

    static {
        var_int_a = (0 >>> 144 | 0 << ~144 + 1) & 0xFFFFFFFF;
        var_int_b = (0x40000001 >>> 222 | 0x40000001 << -222) & 0xFFFFFFFF;
        var_int_c = (0 >>> 139 | 0 << ~139 + 1) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(Integer.MIN_VALUE);
        var_int_e = 0x40000000 >>> 253 | 0x40000000 << ~253 + 1;
        f = Integer.reverse(-1073741824);
        g = 0x20000000 >>> 123 | 0x20000000 << ~123 + 1;
        h = 327680 >>> 239 | 327680 << -239;
        i = (40 >>> 194 | 40 << -194) & 0xFFFFFFFF;
        j = (0 >>> 222 | 0 << ~222 + 1) & 0xFFFFFFFF;
        k = Long.reverse(7138119635336514272L);
        l = Long.reverse(-5620492334958379008L);
        m = Integer.reverse(0);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Long.reverse(-3382289094200964384L);
        p = Integer.reverse(0x40000000);
        q = Long.reverse(7138119635336514272L);
        r = Long.reverse(-5620492334958379008L);
        s = (2048 >>> 11 | 2048 << -11) & 0xFFFFFFFF;
        t = Integer.reverse(-1073741824);
        u = Integer.reverse(-1);
        v = Long.reverse(-3382289094200964384L);
        w = Integer.reverse(0x20000000);
        x = Long.reverse(-3382289094200964384L);
        y = Integer.reverse(0x40000000);
        z = Integer.reverse(-1610612736);
        aa = Long.reverse(7138119635336514272L);
        ab = Long.reverse(-5620492334958379008L);
        ac = Integer.reverse(0x60000000);
        ad = Integer.reverse(-1);
        ae = Long.reverse(-3382289094200964384L);
        af = Integer.reverse(-1073741824);
        ag = 0x700000 >>> 84 | 0x700000 << -84;
        ah = Long.reverse(-3382289094200964384L);
        ai = 8192 >>> 170 | 8192 << ~170 + 1;
        aj = Long.reverse(-3382289094200964384L);
        ak = 1024 >>> 232 | 1024 << ~232 + 1;
        al = 18432 >>> 203 | 18432 << -203;
        am = Long.reverse(7138119635336514272L);
        an = Long.reverse(-5620492334958379008L);
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_556.b();
        var_com_nickuc_login_NLoginCore_556_a = new NLoginCore_556((String)NLoginCore_556.c("㺃", (int)n, (long)o));
        var_com_nickuc_login_NLoginCore_556_b = new NLoginCore_556((String)NLoginCore_556.c("㺉", (int)(t & u), (long)v));
        var_com_nickuc_login_NLoginCore_556_c = new NLoginCore_556((String)NLoginCore_556.c("㺏", (int)z, (long)(aa ^ ab)));
        var_com_nickuc_login_NLoginCore_556_d = new NLoginCore_556((String)NLoginCore_556.c("㺕", (int)ag, (long)ah));
        var_com_nickuc_login_NLoginCore_556_e = new NLoginCore_556((String)NLoginCore_556.c("㺛", (int)al, (long)(am ^ an)));
        var_com_nickuc_login_NLoginCore_556_arr_a = NLoginCore_556.a();
    }

    private static String a(int n, long l) {
        l ^= 0x4DL;
        l ^= 0x3824F9596D599F44L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(64 + 5), (byte)(15 + 68), (byte)(40 + 7), (byte)(6 + 61), (byte)(46 + 20), 67, (byte)(37 + 10), (byte)(18 + 62), (byte)(38 + 37), 67, (byte)(75 + 8), (byte)(16 + 37), (byte)(30 + 50), (byte)(3 + 94), (byte)(53 + 47), (byte)(9 + 91), (byte)(9 + 96), (byte)(72 + 38), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.C("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢞࢔࢜ࢢࢄ࢓ࢉ࢞࢔", (byte)92, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_556.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 527658055745007814L;
        long l = var_long_c ^ 0x3824F9596D599F44L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(33 + 36), (byte)(17 + 66), (byte)(17 + 30), (byte)(43 + 24), (byte)(23 + 43), (byte)(27 + 40), (byte)(35 + 12), (byte)(10 + 70), (byte)(44 + 31), (byte)(17 + 50), 83, (byte)(32 + 21), (byte)(75 + 5), 97, (byte)(28 + 72), (byte)(56 + 44), (byte)(97 + 8), (byte)(76 + 34), (byte)(74 + 29)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_556.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŤĿŔşĹŇŋĺłĵĺĳ", (byte)54, 65);
                    NLoginCore_556.var_java_lang_String_arr_b[1] = NLoginCore_446.A("ĜŒŒĶŤĹŘńňĿľĳ", (byte)54, 65);
                    NLoginCore_556.var_java_lang_String_arr_b[2] = NLoginCore_027.E("գէԼԬէԹԯՒ՟ՇճԺ", (byte)54, 69);
                    NLoginCore_556.var_java_lang_String_arr_b[3] = NLoginCore_559.D("ӐҟӑқҡӑҤҰӅҦҺҟ", (byte)54, 68);
                    NLoginCore_556.var_java_lang_String_arr_b[4] = NLoginCore_387.E("ՠԾբՙԦձՆԲՂԼԴԺ", (byte)54, 69);
                    NLoginCore_556.var_java_lang_String_arr_b[5] = NLoginCore_004.F("ԹԵլՃԭծ԰՟ՇՌիԺ", (byte)54, 70);
                    NLoginCore_556.var_java_lang_String_arr_b[6] = NLoginCore_559.E("Ը՚՞ԠգՇաՅԯՊԭՒժխ՚եՐ՛չպՍվՅՆ", (byte)54, 69);
                    NLoginCore_556.var_java_lang_String_arr_b[7] = NLoginCore_027.B("ķşŦŐĳţũĿĬŁŠĳ", (byte)54, 66);
                    NLoginCore_556.var_java_lang_String_arr_b[8] = NLoginCore_446.C("ҨҊӈӑӈҦңҧӁҒӘҟ", (byte)54, 67);
                    NLoginCore_556.var_java_lang_String_arr_b[9] = NLoginCore_201.C("ӑҠҽүӇҐҒҍҰҕӈҟ", (byte)54, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_556.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ҮұҮҌҏҎӗҷӂӒӕӕҽӇӈҕҵұӓӡәӣҪҫ", (byte)54, 67);
                    NLoginCore_556.var_java_lang_String_arr_b[1] = NLoginCore_110.C("ҽҼҏҿӌҋҦ҉ӊҒҙҟ", (byte)54, 67);
                    NLoginCore_556.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ĿĹšŢĵŊŞŃĬĵĬŇīİŝİŇŵŭŌĸŁľĿ", (byte)54, 66);
                    NLoginCore_556.var_java_lang_String_arr_b[3] = NLoginCore_027.F("՘ԨԩՠՆՈԣՉԻՠԽԺ", (byte)54, 70);
                    NLoginCore_556.var_java_lang_String_arr_b[4] = NLoginCore_173.B("ŞĸŁőŨšŠĵĵĦĽĸŅŰĩŤŧĴņŴňŧľĿ", (byte)54, 66);
                    NLoginCore_556.var_java_lang_String_arr_b[5] = NLoginCore_004.A("ŠĝĻŗŘŧşŔĞĽņĳ", (byte)54, 65);
                    NLoginCore_556.var_java_lang_String_arr_b[6] = NLoginCore_446.F("Ը՚՞ԠգՇաՅԯՊԯԳՐ԰ԵԶՙԺԽ՛պծՅՆ", (byte)54, 70);
                    NLoginCore_556.var_java_lang_String_arr_b[7] = NLoginCore_201.C("ҸҝҢӄҢҟҟӏҰҩӈҟ", (byte)54, 67);
                    NLoginCore_556.var_java_lang_String_arr_b[8] = NLoginCore_223.A("ŗġģĞŃřŪŃŦŜĽřļŀĺİŨĮňŎŹŁľĿ", (byte)54, 65);
                    NLoginCore_556.var_java_lang_String_arr_b[9] = NLoginCore_201.D("ӁҡҝӅҧүҶҏҒҨӄҟ", (byte)54, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_556.var_java_lang_String_arr_b[0] = NLoginCore_427.F("ՠԤժզ՚ԻՙԮՁըՍԺ", (byte)54, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_556.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ĻŤŃĶğĳģşŇřļĥĨŒŎőŝũĲŕŤŧľĿ", (byte)54, 65);
                }
            }
        }
    }
}

