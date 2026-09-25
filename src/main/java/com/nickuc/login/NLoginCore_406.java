/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_342;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.io.File;
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

public final class NLoginCore_406
extends Enum<NLoginCore_406> {
    public static final /* enum */ NLoginCore_406 var_com_nickuc_login_NLoginCore_406_a;
    public static final /* enum */ NLoginCore_406 var_com_nickuc_login_NLoginCore_406_b;
    private final String aI;
    private final String aJ;
    private final NLoginCore_342 var_com_nickuc_login_NLoginCore_342_a;
    private static final /* synthetic */ NLoginCore_406[] var_com_nickuc_login_NLoginCore_406_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static int e;
    private static long f;
    private static long g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static long l;
    private static int m;
    private static long n;
    private static long o;
    private static int p;
    private static long q;
    private static long r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static long z;
    private static int aa;
    private static int ab;
    private static long ac;
    private static int ad;
    private static int ae;
    private static long af;
    private static int ag;
    private static long ah;
    private static long ai;
    private static int aj;
    private static int ak;
    private static long al;
    private static long am;
    private static int an;
    private static long ao;

    public boolean a(NLoginCore_363 NLoginInterface_0342, File file) {
        if (file.exists()) {
            return var_int_a != 0;
        }
        String string = this.c(NLoginInterface_0342);
        NLoginCore_305 NLoginCore_305 = NLoginCore_305.a();
        NLoginCore_285 NLoginCore_2852 = NLoginCore_305.a(string, file);
        return (NLoginCore_2852.p() == var_int_b && NLoginCore_2852.af() ? var_int_c : d) != 0;
    }

    @Generated
    public NLoginCore_342 com_nickuc_login_NLoginCore_342_a() {
        return this.var_com_nickuc_login_NLoginCore_342_a;
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0x6D9370D08D00FDD4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(17 + 52), (byte)(15 + 68), (byte)(27 + 20), (byte)(28 + 39), (byte)(40 + 26), (byte)(7 + 60), (byte)(27 + 20), (byte)(15 + 65), (byte)(19 + 56), (byte)(47 + 20), (byte)(77 + 6), (byte)(12 + 41), (byte)(37 + 43), (byte)(52 + 45), (byte)(19 + 81), 100, (byte)(56 + 49), (byte)(77 + 33), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱ࣊ࢽࢹ࢚ࢪࣁࢲࣁ࢞", (byte)54, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_406.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_406.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ЊЬЮЎвёщџыКјюќіПфѦѥѝѣѝв", (byte)15, 68), NLoginCore_406.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.C("хђёДєѐыєџюЛљѝіљџС޺ޭީފޚޱޢޱގж", (byte)15, 67) + string + NLoginCore_446.A("×", (byte)15, 65) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ NLoginCore_406[] com_nickuc_login_NLoginCore_406_arr_a() {
        NLoginCore_406[] NLoginCore_406Array = new NLoginCore_406[t];
        NLoginCore_406Array[NLoginCore_406.u] = var_com_nickuc_login_NLoginCore_406_a;
        NLoginCore_406Array[NLoginCore_406.v] = var_com_nickuc_login_NLoginCore_406_b;
        return NLoginCore_406Array;
    }

    @Nullable
    public String b(NLoginCore_363 NLoginInterface_0342) {
        return this.a(NLoginInterface_0342, this.var_com_nickuc_login_NLoginCore_342_a);
    }

    public static NLoginCore_406 valueOf(String string) {
        return Enum.valueOf(NLoginCore_406.class, string);
    }

    @Nullable
    public String a(NLoginCore_363 NLoginInterface_0342, NLoginCore_342 NLoginCore_342) {
        String string = this.c(NLoginInterface_0342) + (String)NLoginCore_406.c("㺀", (int)e, (long)(f ^ g)) + NLoginCore_342.ag();
        return NLoginCore_305.a().a(string).V();
    }

    public static NLoginCore_406[] values() {
        return (NLoginCore_406[])var_com_nickuc_login_NLoginCore_406_arr_a.clone();
    }

    @Generated
    private NLoginCore_406(String string2, String string3, NLoginCore_342 NLoginCore_342) {
        this.aI = string2;
        this.aJ = string3;
        this.var_com_nickuc_login_NLoginCore_342_a = NLoginCore_342;
    }

    static {
        var_int_a = 0x2000000 >>> 25 | 0x2000000 << -25;
        var_int_b = (0x6400000 >>> 19 | 0x6400000 << ~19 + 1) & 0xFFFFFFFF;
        var_int_c = 8 >>> 131 | 8 << ~131 + 1;
        d = (0 >>> 153 | 0 << ~153 + 1) & 0xFFFFFFFF;
        e = (0 >>> 251 | 0 << -251) & 0xFFFFFFFF;
        f = Long.reverse(5143792255989051168L);
        g = Long.reverse(-3458764513820540928L);
        h = Integer.reverse(0x74000000);
        i = Integer.reverse(-201326592);
        j = (131072 >>> 145 | 131072 << -145) & 0xFFFFFFFF;
        k = Integer.reverse(-1);
        l = Long.reverse(-7538344294686265568L);
        m = Integer.reverse(0x40000000);
        n = Long.reverse(5143792255989051168L);
        o = Long.reverse(-3458764513820540928L);
        p = (24576 >>> 13 | 24576 << -13) & 0xFFFFFFFF;
        q = Long.reverse(5143792255989051168L);
        r = Long.reverse(-3458764513820540928L);
        s = Integer.reverse(0);
        t = Integer.reverse(0x40000000);
        u = Integer.reverse(0);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(0x50000000);
        x = 20 >>> 225 | 20 << ~225 + 1;
        y = 0x4000000 >>> 56 | 0x4000000 << -56;
        z = Long.reverse(-7538344294686265568L);
        aa = 0 >>> 116 | 0 << -116;
        ab = 40 >>> 99 | 40 << ~99 + 1;
        ac = Long.reverse(-7538344294686265568L);
        ad = (0xC000000 >>> 25 | 0xC000000 << -25) & 0xFFFFFFFF;
        ae = Integer.reverse(-1);
        af = Long.reverse(-7538344294686265568L);
        ag = Integer.reverse(-536870912);
        ah = Long.reverse(5143792255989051168L);
        ai = Long.reverse(-3458764513820540928L);
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = (32 >>> 2 | 32 << ~2 + 1) & 0xFFFFFFFF;
        al = Long.reverse(5143792255989051168L);
        am = Long.reverse(-3458764513820540928L);
        an = (18 >>> 225 | 18 << -225) & 0xFFFFFFFF;
        ao = Long.reverse(-7538344294686265568L);
        var_java_lang_String_arr_a = new String[w];
        var_java_lang_String_arr_b = new String[x];
        NLoginCore_406.b();
        var_com_nickuc_login_NLoginCore_406_a = new NLoginCore_406((String)NLoginCore_406.c("㺃", (int)ab, (long)ac), (String)NLoginCore_406.c("㺆", (int)(ad & ae), (long)af), NLoginCore_342.var_com_nickuc_login_NLoginCore_342_c);
        var_com_nickuc_login_NLoginCore_406_b = new NLoginCore_406((String)NLoginCore_406.c("㺌", (int)ak, (long)(al ^ am)), (String)NLoginCore_406.c("㺏", (int)an, (long)ao), NLoginCore_342.var_com_nickuc_login_NLoginCore_342_c);
        var_com_nickuc_login_NLoginCore_406_arr_a = NLoginCore_406.com_nickuc_login_NLoginCore_406_arr_a();
    }

    @Generated
    public String D() {
        return this.aJ;
    }

    private static void b() {
        int n;
        var_long_c = 357901015067281122L;
        long l = var_long_c ^ 0x6D9370D08D00FDD4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(52 + 17), (byte)(74 + 9), (byte)(4 + 43), (byte)(38 + 29), (byte)(34 + 32), (byte)(42 + 25), (byte)(22 + 25), (byte)(3 + 77), (byte)(64 + 11), (byte)(30 + 37), (byte)(36 + 47), 53, 80, (byte)(49 + 48), (byte)(67 + 33), (byte)(99 + 1), (byte)(102 + 3), (byte)(67 + 43), (byte)(37 + 66)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
                    NLoginCore_406.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ƉƎŭƋƄƢŵƅƃťƤů", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ԡԨԂӦԨԅԤӭԨԔӼӹ", (byte)84, 68);
                    NLoginCore_406.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ƗƞŸŜƞŻƚţƞƊŲů", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[3] = NLoginCore_387.B("ƗƞŸŜƞŻƚţƞƊŲů", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[4] = NLoginCore_092.A("ŴƑƖŝƟƙƜŰơƈƥŴƁƠƊơƅũƭƋƳƣźŻ", (byte)84, 65);
                    NLoginCore_406.var_java_lang_String_arr_b[5] = NLoginCore_138.E("աՉչՖ՟֎֌հկՊՓխ֒Ֆօ֊Ւՙ֑ժ՗՘՞֌֜սՕգվպ֦֞", (byte)84, 69);
                    NLoginCore_406.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӵԿԩՂԵԘԑӽӿԐԙԾՉԄՊԎԌՁՏՃԧԝԩԖԖԕՌԩՄՎԾՋՍԤԥ", (byte)84, 68);
                    NLoginCore_406.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ƜƍƛƕžŗƏŤƥƝųƛƨƌơƣƈſƭƪƈƳźŻ", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[8] = NLoginCore_446.A("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮůƊƩƶƒŴƬƹưƌƙ", (byte)84, 65);
                    NLoginCore_406.var_java_lang_String_arr_b[9] = NLoginCore_138.C("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӿԗԶԵՃӶӿԲԣԇԦԒԤՈԨԼԠԽՑՀԊՏԎԵԍԨԱԓՉԕՔՈՍԤԥ", (byte)84, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_406.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ԨԔԌӿԫӪԠԫԉԐԀӹ", (byte)84, 67);
                    NLoginCore_406.var_java_lang_String_arr_b[1] = NLoginCore_324.C("ԠӤԟӤԮԜԀԲԥԜԀӹ", (byte)84, 67);
                    NLoginCore_406.var_java_lang_String_arr_b[2] = NLoginCore_201.D("ӷԢԙԣӪԊԛԧӱӽԢӹ", (byte)84, 68);
                    NLoginCore_406.var_java_lang_String_arr_b[3] = NLoginCore_559.D("ԪԚԣԛԙԥԠӬԃӫԮӹ", (byte)84, 68);
                    NLoginCore_406.var_java_lang_String_arr_b[4] = NLoginCore_091.F("՝պտՆֈւօՙ֊ձ֍վ֋ե֏քև֛֗շ։֚յչ՟ւբ՚խւ֣֗", (byte)84, 70);
                    NLoginCore_406.var_java_lang_String_arr_b[5] = NLoginCore_201.B("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮŵŴƤƌƵƣŲƘƆƗƱƩƟƎŻƴơƼƲźƹƖƏ", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[6] = NLoginCore_453.A("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮūƵƟƸƫƎƇųŵƆƏƴƿźǀƄƂƷǅƹƝƒƷƠǀƗƌƱƈưƮƥƐƧǃǆƥƙǄƳƬǚǇ", (byte)84, 65);
                    NLoginCore_406.var_java_lang_String_arr_b[7] = NLoginCore_076.C("ԦԗԥԟԈӡԙӮԯԧӾԒԈԌԉԐԣԼԩӺԒԒԞԽԺԻԛԟ԰Ӿԥԟ", (byte)84, 67);
                    NLoginCore_406.var_java_lang_String_arr_b[8] = NLoginCore_559.B("ŸŠƐŭŶƥƣƇƆšŪƄƩŭƜơũŰƨƁŮƳŮƕƙơƴƊŴƱżƚƒƠƍƻŽƷƻƚƈƙƉƏ", (byte)84, 66);
                    NLoginCore_406.var_java_lang_String_arr_b[9] = NLoginCore_559.C("ԂӪԚӷԀԯԭԑԐӫӴԎԳӷԦԫӳӺԲԋӸӿԗԶԵՃӶӿԲԣԇԦԒԤՈԨԼԠԽՑՀԊՑՄԮՓԐՔՍԺԕԱԪԺՙԫՙՑ՘ՁԱ՞Ճ՘", (byte)84, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_406.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ŘſƋƟƗơşƗƃƇƆŪŽŭŷŷƥűƏơŮƣźŻ", (byte)84, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_406.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ԘԡӢԙԍԌӹӼӤԞӯԭӳӵӪԶӲԳӲԯԔԇԄԅ", (byte)84, 68);
                }
            }
        }
    }

    public String c(NLoginCore_363 NLoginInterface_0342) {
        return this.aJ + NLoginInterface_0342.java_lang_String_a().replace((char)h, (char)i) + (String)NLoginCore_406.c("㺀", (int)(j & k), (long)l) + NLoginInterface_0342.java_lang_String_b() + (String)NLoginCore_406.c("㺃", (int)m, (long)(n ^ o)) + NLoginInterface_0342.getVersion() + (String)NLoginCore_406.c("㺆", (int)p, (long)(q ^ r)) + NLoginInterface_0342.c(s != 0);
    }

    @Generated
    public String C() {
        return this.aI;
    }
}

