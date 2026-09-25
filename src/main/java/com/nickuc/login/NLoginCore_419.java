/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
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

public final class NLoginCore_419
extends Enum<NLoginCore_419> {
    public static final /* enum */ NLoginCore_419 var_com_nickuc_login_NLoginCore_419_b;
    public static final /* enum */ NLoginCore_419 var_com_nickuc_login_NLoginCore_419_c;
    public static final /* enum */ NLoginCore_419 var_com_nickuc_login_NLoginCore_419_d;
    private final String bs;
    private final String bt;
    private final boolean var_boolean_ak;
    private static final /* synthetic */ NLoginCore_419[] var_com_nickuc_login_NLoginCore_419_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static long i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static long o;
    private static long p;
    private static int q;
    private static int r;
    private static int s;
    private static long t;
    private static int u;
    private static int v;
    private static int w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static long ad;
    private static long ae;
    private static int af;
    private static int ag;
    private static long ah;
    private static int ai;
    private static long aj;
    private static int var_int_ak;

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0x7372215ABA4BE1AAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(9 + 60), (byte)(71 + 12), (byte)(23 + 24), (byte)(16 + 51), (byte)(17 + 49), (byte)(16 + 51), (byte)(17 + 30), (byte)(24 + 56), (byte)(58 + 17), 67, (byte)(14 + 69), (byte)(23 + 30), 80, (byte)(82 + 15), (byte)(47 + 53), (byte)(96 + 4), (byte)(89 + 16), (byte)(91 + 19), (byte)(98 + 5)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("թնյԸոմկոփղԿսցպսփՅ࣑࣑࣐࣋࣌ࣤࣟࣥ࣡ࣃ࣓ࣂࣆࣘ", (byte)74, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_419.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public String toString() {
        return this.bs;
    }

    @Generated
    private NLoginCore_419(String string2, String string3, boolean bl) {
        this.bs = string2;
        this.bt = string3;
        this.var_boolean_ak = bl;
    }

    private static /* synthetic */ NLoginCore_419[] a() {
        NLoginCore_419[] NLoginCore_419Array = new NLoginCore_419[var_int_a];
        NLoginCore_419Array[NLoginCore_419.var_int_b] = var_com_nickuc_login_NLoginCore_419_b;
        NLoginCore_419Array[NLoginCore_419.var_int_c] = var_com_nickuc_login_NLoginCore_419_c;
        NLoginCore_419Array[NLoginCore_419.var_int_d] = var_com_nickuc_login_NLoginCore_419_d;
        return NLoginCore_419Array;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_419.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.A("šƃƅťƉƨƠƶƢűƯƥƳƭŶƛƽƼƴƺƴƉ", (byte)93, 65), NLoginCore_419.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("ռ։ֈՋ֋ևւ֋֖օՒ֐֔֍֐֖՘ࣲࣣࣦࣤࣤࣞࣟࣷࣸࣴࣖࣕࣙ࣫ղ", (byte)93, 70) + string + NLoginCore_091.A("ų", (byte)93, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public String getName() {
        return this.bs;
    }

    private static void b() {
        int n;
        var_long_c = 4990849839527156786L;
        long l = var_long_c ^ 0x7372215ABA4BE1AAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(64 + 5), 83, (byte)(45 + 2), (byte)(42 + 25), (byte)(32 + 34), (byte)(64 + 3), (byte)(25 + 22), (byte)(14 + 66), (byte)(53 + 22), (byte)(18 + 49), (byte)(8 + 75), 53, (byte)(15 + 65), (byte)(33 + 64), (byte)(39 + 61), (byte)(75 + 25), (byte)(56 + 49), (byte)(107 + 3), (byte)(11 + 92)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
                    NLoginCore_419.var_java_lang_String_arr_b[0] = NLoginCore_384.E("՞րրտՖձըձ֎ոժգ", (byte)95, 69);
                    NLoginCore_419.var_java_lang_String_arr_b[1] = NLoginCore_223.F("լժ֎֒։Ջ֎֑֘ն֜գ", (byte)95, 70);
                    NLoginCore_419.var_java_lang_String_arr_b[2] = NLoginCore_201.A("ƎƌưƴƫŭưƳƺƘƾƅ", (byte)95, 65);
                    NLoginCore_419.var_java_lang_String_arr_b[3] = NLoginCore_223.D("ԚԾԮԦՊՆՒԺԟԢՋԚ", (byte)95, 68);
                    NLoginCore_419.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ՔցեՠշՔ՚՗֏ճՙ՞֚ննյռյևՙ֛֧ծկ", (byte)95, 69);
                    NLoginCore_419.var_java_lang_String_arr_b[5] = NLoginCore_453.C("ԣԧԊԎԦԏԬԜԱԔԔԚ", (byte)95, 67);
                    NLoginCore_419.var_java_lang_String_arr_b[6] = NLoginCore_110.E("լսև֔֒ն՘իեզհնն֢ա֢֓ՠ֓օը֗ծկ", (byte)95, 69);
                    NLoginCore_419.var_java_lang_String_arr_b[7] = NLoginCore_384.E("օՒ՞տՓֈՓ֋հև֙՛֑ի֣֡օ՝՟չէցծկ", (byte)95, 69);
                    NLoginCore_419.var_java_lang_String_arr_b[8] = NLoginCore_110.D("ԼԉԕԶԊԿԊՂԧԾՐԒՈԢ՚՘ԼԔԖ԰ԞԸԥԦ", (byte)95, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_419.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ԂԦԥԻԗԭԃԪԉԩԦՄՈԒԸ՗ԻԼԲՆՙԸԥԦ", (byte)95, 68);
                    NLoginCore_419.var_java_lang_String_arr_b[1] = NLoginCore_387.F("Պ՝ֈ։֙՗պ֗֝մպ՞֞վ֞֒֐փ֛տչձծկ", (byte)95, 70);
                    NLoginCore_419.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ԋԪԤԣՉԂԡԥՋԩԯԒՉՔՆԬՃԭԖՐՠԸԥԦ", (byte)95, 67);
                    NLoginCore_419.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ƐƠŪƦŷƧŴƲƔŸǀƿƕƃſƷƀǁǉƓƉƣƐƑ", (byte)95, 65);
                    NLoginCore_419.var_java_lang_String_arr_b[4] = NLoginCore_004.D("ԋԸԜԗԮԋԑԎՆԪԒՓԯԧԓԹԸՇՍԮԶ՞ԥԦ", (byte)95, 68);
                    NLoginCore_419.var_java_lang_String_arr_b[5] = NLoginCore_110.A("ƀŷƔŶųƊźƏƾƿƊƳƠƠƣƵƂƣƑǇƢƹƐƑ", (byte)95, 65);
                    NLoginCore_419.var_java_lang_String_arr_b[6] = NLoginCore_027.A("ƎƟƩƶƴƘźƍƇƈƓƕƋƺƷƙƴǆƺƇƼƓƐƑ", (byte)95, 65);
                    NLoginCore_419.var_java_lang_String_arr_b[7] = NLoginCore_223.B("ƧŴƀơŵƪŵƭƒƩƽƴŻƒƘƶƜƑƵƗƚǉƐƑ", (byte)95, 66);
                    NLoginCore_419.var_java_lang_String_arr_b[8] = NLoginCore_384.E("օՒ՞տՓֈՓ֋հև֙՗՘֤֚֒ւխ֡չզ֧ծկ", (byte)95, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_419.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ƫƓŷƒƉưƪƯƽŻƶƅ", (byte)95, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_419.var_java_lang_String_arr_b[0] = NLoginCore_387.F("֏֋էր՘֑֍քֆ֓֐գ", (byte)95, 70);
                }
            }
        }
    }

    static {
        var_int_a = 0x3000000 >>> 152 | 0x3000000 << -152;
        var_int_b = Integer.reverse(0);
        var_int_c = (0x20000000 >>> 29 | 0x20000000 << -29) & 0xFFFFFFFF;
        var_int_d = (16 >>> 227 | 16 << ~227 + 1) & 0xFFFFFFFF;
        e = Integer.reverse(-1879048192);
        f = (0x12000000 >>> 185 | 0x12000000 << -185) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = -1 >>> 110 | -1 << -110;
        i = Long.reverse(-2289189663309512030L);
        j = Integer.reverse(0);
        k = (0x40000000 >>> 190 | 0x40000000 << ~190 + 1) & 0xFFFFFFFF;
        l = Long.reverse(5493030492786705058L);
        m = Long.reverse(-6052837899185946624L);
        n = Integer.reverse(0x40000000);
        o = Long.reverse(5493030492786705058L);
        p = Long.reverse(-6052837899185946624L);
        q = Integer.reverse(0);
        r = 6 >>> 225 | 6 << ~225 + 1;
        s = Integer.reverse(-1);
        t = Long.reverse(-2289189663309512030L);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(0x20000000);
        w = -1 >>> 155 | -1 << ~155 + 1;
        x = Long.reverse(-2289189663309512030L);
        y = (0x280000 >>> 51 | 0x280000 << -51) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        aa = Long.reverse(-2289189663309512030L);
        ab = Integer.MIN_VALUE >>> 95 | Integer.MIN_VALUE << -95;
        ac = 98304 >>> 110 | 98304 << ~110 + 1;
        ad = Long.reverse(5493030492786705058L);
        ae = Long.reverse(-6052837899185946624L);
        af = (0x800000 >>> 22 | 0x800000 << ~22 + 1) & 0xFFFFFFFF;
        ag = Integer.reverse(-536870912);
        ah = Long.reverse(-2289189663309512030L);
        ai = (32 >>> 66 | 32 << -66) & 0xFFFFFFFF;
        aj = Long.reverse(-2289189663309512030L);
        var_int_ak = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_419.b();
        var_com_nickuc_login_NLoginCore_419_b = new NLoginCore_419((String)NLoginCore_419.c("㺃", (int)k, (long)(l ^ m)), (String)NLoginCore_419.c("㺆", (int)n, (long)(o ^ p)), q != 0);
        var_com_nickuc_login_NLoginCore_419_c = new NLoginCore_419((String)NLoginCore_419.c("㺌", (int)(v & w), (long)x), (String)NLoginCore_419.c("㺏", (int)(y & z), (long)aa), ab != 0);
        var_com_nickuc_login_NLoginCore_419_d = new NLoginCore_419((String)NLoginCore_419.c("㺕", (int)ag, (long)ah), (String)NLoginCore_419.c("㺘", (int)ai, (long)aj), var_int_ak != 0);
        var_com_nickuc_login_NLoginCore_419_arr_a = NLoginCore_419.a();
    }

    @Generated
    public boolean L() {
        return this.var_boolean_ak;
    }

    public static NLoginCore_419[] values() {
        return (NLoginCore_419[])var_com_nickuc_login_NLoginCore_419_arr_a.clone();
    }

    @Generated
    public String Z() {
        return this.bt;
    }

    public static NLoginCore_419 valueOf(String string) {
        return Enum.valueOf(NLoginCore_419.class, string);
    }
}

