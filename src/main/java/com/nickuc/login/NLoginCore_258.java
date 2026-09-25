/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_429;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_293;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_258 {
    private static long u;
    private final NLoginCore_429 var_com_nickuc_login_NLoginCore_429_a;
    private static int s;
    private final NLoginCore_293[] var_com_nickuc_login_NLoginCore_293_arr_a;
    private static long p;
    private static long r;
    private static long n;
    private static int q;
    private static int j;
    private static long k;
    private static int ag;
    private static String[] var_java_lang_String_arr_a;
    private static long x;
    private static int o;
    private static int ae;
    private static int w;
    private static long c;
    private static long g;
    private static int l;
    private long t;
    private static int var_int_b;
    private static int var_int_a;
    private static long d;
    private static long z;
    private static int m;
    private static long ac;
    private static int ad;
    private static String[] var_java_lang_String_arr_b;
    private static long e;
    private static long h;
    private Long var_java_lang_Long_b;
    private static int f;
    private static int af;
    private static int y;
    private static int v;
    private int var_int_ab;
    private static int i;
    private static long var_long_ab;
    private static int aa;

    public void aB() {
        if (this.var_java_lang_Long_b != null) {
            throw new IllegalArgumentException((String)NLoginCore_258.c("㺀", (int)var_int_b, (long)(d ^ e)));
        }
        this.var_java_lang_Long_b = System.nanoTime();
    }

    public void a(String string, Runnable runnable) {
        try {
            this.aB();
            runnable.run();
        }
        finally {
            this.z(string);
        }
    }

    public void aA() {
        this.t = System.nanoTime();
        this.var_int_ab = var_int_a;
        this.var_java_lang_Long_b = null;
    }

    @Generated
    public NLoginCore_293[] a() {
        return this.var_com_nickuc_login_NLoginCore_293_arr_a;
    }

    public void y(String string) {
        this.z(string);
        this.var_java_lang_Long_b = System.nanoTime();
    }

    public NLoginCore_258(int n, long l, NLoginCore_429 NLoginCore_4292) {
        this.t = l;
        this.var_com_nickuc_login_NLoginCore_293_arr_a = new NLoginCore_293[n];
        this.var_com_nickuc_login_NLoginCore_429_a = NLoginCore_4292;
    }

    private static String a(int n, long l) {
        l ^= 0x41L;
        l ^= 0x56DD133113AE46EEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(57 + 11), 69, 83, (byte)(41 + 6), (byte)(50 + 17), (byte)(8 + 58), (byte)(8 + 59), (byte)(31 + 16), (byte)(52 + 28), (byte)(22 + 53), (byte)(53 + 14), (byte)(50 + 33), (byte)(44 + 9), (byte)(56 + 24), (byte)(86 + 11), (byte)(21 + 79), (byte)(62 + 38), (byte)(102 + 3), (byte)(43 + 67), (byte)(30 + 73)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.E("լչոԻջշղջֆյՂրքսրֆՈࣣࣗࢷ࣑ࣣࣩࣘࣤࣨࣙ࣬ࣤࣗ࣫", (byte)77, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_258.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_258(int n) {
        this(n, System.nanoTime());
    }

    public NLoginCore_258(int n, long l) {
        this(n, l, NLoginCore_429.var_com_nickuc_login_NLoginCore_429_b);
    }

    public String toString() {
        NLoginCore_293 NLoginCore_2932;
        if (this.var_com_nickuc_login_NLoginCore_293_arr_a.length == 0) {
            return NLoginCore_258.c("㺀", (int)j, (long)k);
        }
        StringBuilder stringBuilder = new StringBuilder();
        NLoginCore_270 NLoginCore_2702 = NLoginCore_270.a(this.t);
        for (int i = l; i < this.var_com_nickuc_login_NLoginCore_293_arr_a.length && (NLoginCore_2932 = this.var_com_nickuc_login_NLoginCore_293_arr_a[i]) != null; ++i) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append((String)NLoginCore_258.c("㺃", (int)m, (long)n));
            }
            String string = NLoginCore_429.java_lang_String_a(this.var_com_nickuc_login_NLoginCore_429_a).replace((CharSequence)NLoginCore_258.c("㺆", (int)o, (long)p), Integer.toString(i)).replace((CharSequence)NLoginCore_258.c("㺉", (int)q, (long)r), NLoginCore_293.java_lang_String_a(NLoginCore_2932)).replace((CharSequence)NLoginCore_258.c("㺌", (int)s, (long)u), NLoginCore_2702.a(NLoginCore_429.java_util_concurrent_TimeUnit_a(this.var_com_nickuc_login_NLoginCore_429_a), NLoginCore_293.b(NLoginCore_2932), NLoginCore_429.int_a(this.var_com_nickuc_login_NLoginCore_429_a))).replace((CharSequence)NLoginCore_258.c("㺏", (int)(v & w), (long)x), NLoginCore_2702.a(NLoginCore_429.java_util_concurrent_TimeUnit_a(this.var_com_nickuc_login_NLoginCore_429_a), NLoginCore_293.long_a(NLoginCore_2932), NLoginCore_429.int_a(this.var_com_nickuc_login_NLoginCore_429_a))).replace((CharSequence)NLoginCore_258.c("㺒", (int)y, (long)z), NLoginCore_270.a(NLoginCore_293.b(NLoginCore_2932)).a(NLoginCore_429.java_util_concurrent_TimeUnit_a(this.var_com_nickuc_login_NLoginCore_429_a), NLoginCore_293.long_a(NLoginCore_2932), NLoginCore_429.int_a(this.var_com_nickuc_login_NLoginCore_429_a)));
            stringBuilder.append(string);
        }
        if (NLoginCore_429.b(this.var_com_nickuc_login_NLoginCore_429_a) != null) {
            stringBuilder.append((String)NLoginCore_258.c("㺕", (int)aa, (long)(var_long_ab ^ ac)));
            Object[] objectArray = new Object[ad];
            objectArray[NLoginCore_258.ae] = NLoginCore_2702.a(NLoginCore_429.java_util_concurrent_TimeUnit_a(this.var_com_nickuc_login_NLoginCore_429_a), NLoginCore_429.int_a(this.var_com_nickuc_login_NLoginCore_429_a));
            stringBuilder.append(String.format(NLoginCore_429.b(this.var_com_nickuc_login_NLoginCore_429_a), objectArray));
        }
        return stringBuilder.toString();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_258.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.F("՟ցփգևִ֦֞֠կֱ֣֭֫մֲֲָֺֻ֙և", (byte)123, 70), NLoginCore_258.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫նऑअࣥआࣿऒखइऑचऒगअङ֐", (byte)123, 70) + string + NLoginCore_559.E("ձ", (byte)123, 69) + methodType.toString(), exception);
        }
    }

    public void z(String string) {
        if (this.var_java_lang_Long_b == null) {
            throw new IllegalArgumentException((String)NLoginCore_258.c("㺀", (int)f, (long)(g ^ h)));
        }
        int n = this.var_int_ab;
        this.var_int_ab = n + i;
        this.var_com_nickuc_login_NLoginCore_293_arr_a[n] = new NLoginCore_293(string, this.var_java_lang_Long_b, System.nanoTime(), null);
        this.var_java_lang_Long_b = null;
    }

    public <T> T a(String string, Callable<T> callable) {
        try {
            T t;
            this.aB();
            try {
                t = callable.call();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
            return t;
        }
        finally {
            this.z(string);
        }
    }

    private static void b() {
        int n;
        c = 7134035570909981031L;
        long l = c ^ 0x56DD133113AE46EEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(50 + 19), (byte)(73 + 10), (byte)(8 + 39), (byte)(33 + 34), (byte)(5 + 61), (byte)(39 + 28), (byte)(17 + 30), (byte)(29 + 51), (byte)(37 + 38), (byte)(12 + 55), (byte)(62 + 21), (byte)(20 + 33), (byte)(11 + 69), (byte)(61 + 36), 100, (byte)(89 + 11), 105, (byte)(102 + 8), (byte)(101 + 2)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
                    NLoginCore_258.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ӺԨԎԚԙӿՂԁԛ԰ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ՗՛ՖԝԽԙԳա՟ՏՅԺԱՃդ՘Կ՝Պ՜ՃՎՀաՆժՐՃԫՂ", (byte)6, 70);
                    NLoginCore_258.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ӺԨԎԚԙӿՂԁԛ԰ԓԦԘԞԠԢԖՁՂԎԺՊ԰ԣԛԟԿՉԣՀԤՉԬԙԪՈՓ՘ԫՕԻՕգՅԠՐՒԻ՜էՋբծԸԵԶ", (byte)6, 70);
                    NLoginCore_258.var_java_lang_String_arr_b[2] = NLoginCore_201.E("ӻԚԘԽӹԔԼӽԗԴӼԧԘՂԵԁՄԖԣԩԩՎԕԖ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[3] = NLoginCore_201.C("СГИϹЗϼПЛчъЖЏ", (byte)6, 67);
                    NLoginCore_258.var_java_lang_String_arr_b[4] = NLoginCore_138.A("ðÎĀÖ¿ĆæëìćêÓ", (byte)6, 65);
                    NLoginCore_258.var_java_lang_String_arr_b[5] = NLoginCore_384.E("ԒԦԪӻԫԡԺԷԎԕԿԊ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[6] = NLoginCore_223.D("АЍЙрЕϻмПІЀКЏ", (byte)6, 68);
                    NLoginCore_258.var_java_lang_String_arr_b[7] = NLoginCore_110.E("ԄԈӶԾԾԈԲԍӿԴԳԊ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[8] = NLoginCore_201.C("ϲессЍϾІІЇсВЏ", (byte)6, 67);
                    NLoginCore_258.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ԓԤԇԽԾԒԠӼӽԲԥԊ", (byte)6, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_258.var_java_lang_String_arr_b[0] = NLoginCore_004.E("ӺԨԎԚԙӿՂԁԛ԰ԓԦԘԞԠԢԖՁՂԎԺԾՃԈԝԪԲՉՄՓՍՋԑԬ՗՛ՖԝԽԙԳա՟ՏՅԺԱՃդ՘Կ՝Պ՘ԪըՑՐՅԲՄդԲէզԲՏ՗Է՚լսկՎտՊ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[1] = NLoginCore_384.C("ϿЭГПОЄчІРеИЫНУХЧЛцчГпяеШРФфюШхЩюбОЯэјѝањрњѩНзѠѮфѭэьЬчѳкл", (byte)6, 67);
                    NLoginCore_258.var_java_lang_String_arr_b[2] = NLoginCore_223.B("ÄãáĆÂÝąÆàýÈîĊÐčÌÌæÕĄĉñÞß", (byte)6, 66);
                    NLoginCore_258.var_java_lang_String_arr_b[3] = NLoginCore_575.F("ԗԓӹԏԞӾ԰ԵԎԓԯԊ", (byte)6, 70);
                    NLoginCore_258.var_java_lang_String_arr_b[4] = NLoginCore_091.F("ӺԭԸԯՀԼԺԵԣԙԺԄӾՆՆԜԗԕԉՀՆԘԕԖ", (byte)6, 70);
                    NLoginCore_258.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ПϿзϿтМТаЀИОЏ", (byte)6, 68);
                    NLoginCore_258.var_java_lang_String_arr_b[6] = NLoginCore_027.F("ԑӳԊԌԛԊԑӹԗՂԲԼԱԚԿԶԉԇԖԾ԰ԘԕԖ", (byte)6, 70);
                    NLoginCore_258.var_java_lang_String_arr_b[7] = NLoginCore_324.E("ԋԶ԰ԨԐԏԹԯՃԾԎԹՁԾՅՇԟԝӿԇԚԨԕԖ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[8] = NLoginCore_384.E("ӻԙӻԵԸԛՀӻԬӼԅԷԜԲԝԞՈՅԥԆ԰ԨԕԖ", (byte)6, 69);
                    NLoginCore_258.var_java_lang_String_arr_b[9] = NLoginCore_451.A("ÚÓüæóöĂĂöËÍÓ", (byte)6, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_258.var_java_lang_String_arr_b[0] = NLoginCore_575.A("½ÕÛøąĆéõÊÞçćÙçÄÅíēēßäìĂĚçĈôôĎ×îā", (byte)6, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_258.var_java_lang_String_arr_b[0] = NLoginCore_223.C("зйϾЃЎЕчЏИЀфнеФЬКнШмъТЌіСуЭћїеобш", (byte)6, 67);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 0 >>> 183 | 0 << ~183 + 1;
        d = Long.reverse(-1831583186871353146L);
        e = Long.reverse(-9079256848778919936L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-1831583186871353146L);
        h = Long.reverse(-9079256848778919936L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(0x40000000);
        k = Long.reverse(7247673661907566790L);
        l = Integer.reverse(0);
        m = Integer.reverse(-1073741824);
        n = Long.reverse(7247673661907566790L);
        o = (0x100000 >>> 146 | 0x100000 << -146) & 0xFFFFFFFF;
        p = Long.reverse(7247673661907566790L);
        q = (20 >>> 162 | 20 << -162) & 0xFFFFFFFF;
        r = Long.reverse(7247673661907566790L);
        s = 24 >>> 226 | 24 << ~226 + 1;
        u = Long.reverse(7247673661907566790L);
        v = Integer.reverse(-536870912);
        w = Integer.reverse(-1);
        x = Long.reverse(7247673661907566790L);
        y = (Integer.MIN_VALUE >>> 156 | Integer.MIN_VALUE << -156) & 0xFFFFFFFF;
        z = Long.reverse(7247673661907566790L);
        aa = Integer.reverse(-1879048192);
        var_long_ab = Long.reverse(-1831583186871353146L);
        ac = Long.reverse(-9079256848778919936L);
        ad = (65536 >>> 176 | 65536 << -176) & 0xFFFFFFFF;
        ae = 0 >>> 255 | 0 << ~255 + 1;
        af = Integer.reverse(0x50000000);
        ag = Integer.reverse(0x50000000);
        var_java_lang_String_arr_a = new String[af];
        var_java_lang_String_arr_b = new String[ag];
        NLoginCore_258.b();
    }
}

