/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_229
extends Enum<NLoginCore_229> {
    public static final /* enum */ NLoginCore_229 var_com_nickuc_login_NLoginCore_229_a;
    public static final /* enum */ NLoginCore_229 var_com_nickuc_login_NLoginCore_229_b;
    public static final /* enum */ NLoginCore_229 var_com_nickuc_login_NLoginCore_229_c;
    public static final /* enum */ NLoginCore_229 var_com_nickuc_login_NLoginCore_229_d;
    private static final /* synthetic */ NLoginCore_229[] var_com_nickuc_login_NLoginCore_229_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static long var_long_b;
    private static long var_long_d;
    private static int e;
    private static long f;
    private static int g;
    private static long h;
    private static long i;
    private static int j;
    private static long k;
    private static int l;
    private static int m;
    private static long n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;
    private static long s;
    private static int t;
    private static long u;
    private static long v;
    private static int w;
    private static long x;
    private static long y;
    private static int z;
    private static long aa;
    private static long ab;
    private static int ac;
    private static long ad;
    private static long ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;
    private static long an;
    private static int ao;
    private static int ap;
    private static long aq;
    private static long ar;
    private static int as;
    private static int at;
    private static int au;
    private static long av;
    private static int aw;
    private static int ax;
    private static long ay;
    private static long az;
    private static int ba;

    private static /* synthetic */ NLoginCore_229[] a() {
        NLoginCore_229[] NLoginCore_229Array = new NLoginCore_229[af];
        NLoginCore_229Array[NLoginCore_229.ag] = var_com_nickuc_login_NLoginCore_229_a;
        NLoginCore_229Array[NLoginCore_229.ah] = var_com_nickuc_login_NLoginCore_229_b;
        NLoginCore_229Array[NLoginCore_229.ai] = var_com_nickuc_login_NLoginCore_229_c;
        NLoginCore_229Array[NLoginCore_229.aj] = var_com_nickuc_login_NLoginCore_229_d;
        return NLoginCore_229Array;
    }

    public String b(boolean bl) {
        return this.a(bl, (string, string2) -> string + string2);
    }

    private static String a(int n, long l) {
        l ^= 0x16L;
        l ^= 0x5E618B92285BE266L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(10 + 59), (byte)(42 + 41), (byte)(18 + 29), 67, (byte)(7 + 59), 67, (byte)(44 + 3), (byte)(54 + 26), (byte)(6 + 69), (byte)(9 + 58), (byte)(32 + 51), (byte)(44 + 9), (byte)(27 + 53), (byte)(91 + 6), (byte)(72 + 28), (byte)(93 + 7), (byte)(18 + 87), (byte)(15 + 95), (byte)(19 + 84)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ԰ԳԹӻ࢐ࡩ࢘ࡤ࢑ࢎࢅ࢓ࢗ", (byte)0, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_229.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-8533289152044351052L);
        var_long_d = Long.reverse(0x6800000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-2192220876706692684L);
        g = 16384 >>> 173 | 16384 << ~173 + 1;
        h = Long.reverse(-8533289152044351052L);
        i = Long.reverse(0x6800000000000000L);
        j = Integer.reverse(-1073741824);
        k = Long.reverse(-2192220876706692684L);
        l = Integer.reverse(0x20000000);
        m = -1 >>> 22 | -1 << ~22 + 1;
        n = Long.reverse(-2192220876706692684L);
        o = Integer.reverse(-1610612736);
        p = Long.reverse(-8533289152044351052L);
        q = Long.reverse(0x6800000000000000L);
        r = (0x18000000 >>> 122 | 0x18000000 << ~122 + 1) & 0xFFFFFFFF;
        s = Long.reverse(-2192220876706692684L);
        t = Integer.reverse(-536870912);
        u = Long.reverse(-8533289152044351052L);
        v = Long.reverse(0x6800000000000000L);
        w = (0x10000000 >>> 153 | 0x10000000 << -153) & 0xFFFFFFFF;
        x = Long.reverse(-8533289152044351052L);
        y = Long.reverse(0x6800000000000000L);
        z = 1152 >>> 199 | 1152 << -199;
        aa = Long.reverse(-8533289152044351052L);
        ab = Long.reverse(0x6800000000000000L);
        ac = (10240 >>> 74 | 10240 << -74) & 0xFFFFFFFF;
        ad = Long.reverse(-8533289152044351052L);
        ae = Long.reverse(0x6800000000000000L);
        af = 64 >>> 36 | 64 << -36;
        ag = Integer.reverse(0);
        ah = 0x8000000 >>> 123 | 0x8000000 << -123;
        ai = (16 >>> 67 | 16 << -67) & 0xFFFFFFFF;
        aj = 0x18000000 >>> 155 | 0x18000000 << -155;
        ak = Integer.reverse(-268435456);
        al = Integer.reverse(-268435456);
        am = 0xB000000 >>> 56 | 0xB000000 << ~56 + 1;
        an = Long.reverse(-2192220876706692684L);
        ao = Integer.reverse(0);
        ap = Integer.reverse(0x30000000);
        aq = Long.reverse(-8533289152044351052L);
        ar = Long.reverse(0x6800000000000000L);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = (0xD00000 >>> 180 | 0xD00000 << ~180 + 1) & 0xFFFFFFFF;
        au = Integer.reverse(-1);
        av = Long.reverse(-2192220876706692684L);
        aw = Integer.reverse(0x40000000);
        ax = -2147483645 >>> 254 | -2147483645 << -254;
        ay = Long.reverse(-8533289152044351052L);
        az = Long.reverse(0x6800000000000000L);
        ba = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[ak];
        var_java_lang_String_arr_b = new String[al];
        NLoginCore_229.b();
        var_com_nickuc_login_NLoginCore_229_a = new NLoginCore_229();
        var_com_nickuc_login_NLoginCore_229_b = new NLoginCore_229();
        var_com_nickuc_login_NLoginCore_229_c = new NLoginCore_229();
        var_com_nickuc_login_NLoginCore_229_d = new NLoginCore_229();
        var_com_nickuc_login_NLoginCore_229_arr_a = NLoginCore_229.a();
    }

    public static NLoginCore_229 valueOf(String string) {
        return Enum.valueOf(NLoginCore_229.class, string);
    }

    public String a(boolean bl, BiFunction<String, String, String> biFunction) {
        switch (this.ordinal()) {
            case 0: {
                return biFunction.apply((String)NLoginCore_229.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)), (String)NLoginCore_229.c("㺃", (int)e, (long)f));
            }
            case 1: {
                return biFunction.apply((String)NLoginCore_229.c("㺆", (int)g, (long)(h ^ i)), (String)NLoginCore_229.c("㺉", (int)j, (long)k));
            }
            case 2: {
                return biFunction.apply((String)NLoginCore_229.c("㺌", (int)(l & m), (long)n), (String)NLoginCore_229.c("㺏", (int)o, (long)(p ^ q)));
            }
            case 3: {
                return biFunction.apply((String)NLoginCore_229.c("㺒", (int)r, (long)s), (String)(bl ? NLoginCore_229.c("㺕", (int)t, (long)(u ^ v)) : NLoginCore_229.c("㺘", (int)w, (long)(x ^ y))));
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_229.c("㺛", (int)z, (long)(aa ^ ab)) + (Object)((Object)this) + (String)NLoginCore_229.c("㺞", (int)ac, (long)(ad ^ ae)));
    }

    private static void b() {
        int n;
        var_long_c = 3279690887681395089L;
        long l = var_long_c ^ 0x5E618B92285BE266L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(2 + 67), (byte)(14 + 69), (byte)(30 + 17), (byte)(65 + 2), (byte)(56 + 10), (byte)(6 + 61), (byte)(16 + 31), (byte)(65 + 15), (byte)(13 + 62), (byte)(42 + 25), (byte)(23 + 60), (byte)(7 + 46), (byte)(66 + 14), (byte)(55 + 42), (byte)(83 + 17), 100, (byte)(96 + 9), 110, (byte)(83 + 20)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(59 + 24)}, StandardCharsets.UTF_8));
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
                    NLoginCore_229.var_java_lang_String_arr_b[0] = NLoginCore_387.E("ճեկ֍ձւՔ֑պմ֒ա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[1] = NLoginCore_076.F("եւխկբ֑֔ցգֈ՛ա", (byte)93, 70);
                    NLoginCore_229.var_java_lang_String_arr_b[2] = NLoginCore_091.F("ւք՟֕Րձճ֍կ֎՛ա", (byte)93, 70);
                    NLoginCore_229.var_java_lang_String_arr_b[3] = NLoginCore_453.E("ՠժէթ֋խշ֘֍քֆա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ճեկ֍ձւՔ֑պմ֒ա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[5] = NLoginCore_092.B("ŰƀưƴŮƨƫƚƢŹŷƁ", (byte)93, 66);
                    NLoginCore_229.var_java_lang_String_arr_b[6] = NLoginCore_559.F("ւք՟֕Րձճ֍կ֎՛ա", (byte)93, 70);
                    NLoginCore_229.var_java_lang_String_arr_b[7] = NLoginCore_575.C("ԶԆՄԂԧԙԝԡՃՋԛԯՌՇՂԞՃՔԗԫ԰ԲԟԠ", (byte)93, 67);
                    NLoginCore_229.var_java_lang_String_arr_b[8] = NLoginCore_004.B("ƨƜŽƁƈųƸƓưƻƙƻƲƈƳưƜŽƝǂǂƟƌƍ", (byte)93, 66);
                    NLoginCore_229.var_java_lang_String_arr_b[9] = NLoginCore_223.A("ƇƃƨƥƟƩƍƘƷƍŷƐŷƍſƬƙƛǀǁƕƶƜǄƆƼƘǌƄƋƊƫ", (byte)93, 65);
                    NLoginCore_229.var_java_lang_String_arr_b[10] = NLoginCore_092.A("ƦŬƇƌƣŭƆƊƚƒƘƁ", (byte)93, 65);
                    NLoginCore_229.var_java_lang_String_arr_b[11] = NLoginCore_076.E("ատՑՏդՓ՗լՙՓ՛ա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[12] = NLoginCore_223.D("ՅՃӽԕԽՁԓԼԧԌՁԔ", (byte)93, 68);
                    NLoginCore_229.var_java_lang_String_arr_b[13] = NLoginCore_559.E("հև֏փՒ֐ՏՏ֋ը֎ա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[14] = NLoginCore_559.A("űųƧŭƂƵƈƶƸƛƅƷƫƎƕƖƸơƹƳƆƟƌƍ", (byte)93, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_229.var_java_lang_String_arr_b[0] = NLoginCore_173.D("ԾԵՇԃՊԜԔӾՈԣԟԔ", (byte)93, 68);
                    NLoginCore_229.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ŰƯƅƧŲųƵŸƕƒƚŶƽƮƭƭƎƑƻžơǅƌƍ", (byte)93, 66);
                    NLoginCore_229.var_java_lang_String_arr_b[2] = NLoginCore_092.E("Վլփփբ֒֎Օէքդա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[3] = NLoginCore_027.B("ƳŰƞƉƈƅŸƳƺźƄƍƔƛžƿƼƯżǂƢƏƌƍ", (byte)93, 66);
                    NLoginCore_229.var_java_lang_String_arr_b[4] = NLoginCore_004.C("ԎԲԠӺԕԼԣՋԇԈԹԔ", (byte)93, 67);
                    NLoginCore_229.var_java_lang_String_arr_b[5] = NLoginCore_092.F("Ւխ֓ծնՎ֓֗Քխզյշոը֖֞՛֛բհկլխ", (byte)93, 70);
                    NLoginCore_229.var_java_lang_String_arr_b[6] = NLoginCore_223.E("գ֐ֆ֔Ք֍կբ՗Ցֆա", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[7] = NLoginCore_004.A("ƣųƱůƔƆƊƎưƸƋƛƙſŸƮƱƋƳƶƟƵƌƍ", (byte)93, 65);
                    NLoginCore_229.var_java_lang_String_arr_b[8] = NLoginCore_091.E("ֈռ՝աըՓ֘ճ֐֛պմ֜մ՟՟֚ի֠ճ՟֪֟֝մցմ֧֪֚֙֘", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[9] = NLoginCore_076.D("ԚԖԻԸԲԼԠԫՊԠԊԣԊԠԒԿԬԮՓՔԨՏՃՈԩԺԹԽՁՠՠԟ", (byte)93, 68);
                    NLoginCore_229.var_java_lang_String_arr_b[10] = NLoginCore_575.A("ƄƜűŽƀƔƦŷƊƃƔƁ", (byte)93, 65);
                    NLoginCore_229.var_java_lang_String_arr_b[11] = NLoginCore_076.A("ƢƯƒƲƈƯųƓƸƱƍƫƬſƿƠƕƐƹżƆƵƌƍ", (byte)93, 65);
                    NLoginCore_229.var_java_lang_String_arr_b[12] = NLoginCore_091.E("թ՜ֈՐ֒ժմ՘֐յմ֌ծֈ֏֊բպոչեկլխ", (byte)93, 69);
                    NLoginCore_229.var_java_lang_String_arr_b[13] = NLoginCore_575.C("ӽԱԓՆԱԶԽԈԝԅՂԤԢԮՆԾԠԈԢՎՙ՘ԟԠ", (byte)93, 67);
                    NLoginCore_229.var_java_lang_String_arr_b[14] = NLoginCore_004.D("ԄԆԺԀԕՈԛՉՋԮԗԯԋԺԭԾԮԶԩԷԮ՘ԲԲ՞ԿՊՎԟԬԛՅ", (byte)93, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_229.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ƣƭƱƬưƆƓƒƥƎưƒƳƫƜƙƠƂƿƃƀƸǃǂƀƊƷƛǌƜǋǌ", (byte)93, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_229.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ՀԛԝԞԵԙԓԆԝԗԎՋԱԡԠԳԣՍԍԵՇԲԟԠ", (byte)93, 68);
                }
            }
        }
    }

    public static NLoginCore_229[] values() {
        return (NLoginCore_229[])var_com_nickuc_login_NLoginCore_229_arr_a.clone();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_229.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.A("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 65), NLoginCore_229.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.F("՞իժԭխթդխոէԴղնկղոԺ࣏ࢨࣗࢣ࣐࣍ࣄ࣒ࣖՏ", (byte)63, 70) + string + NLoginCore_384.E("Ե", (byte)63, 69) + methodType.toString(), exception);
        }
    }
}

