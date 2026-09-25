/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginInterface_002;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_017;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_509
implements NLoginInterface_002<NLoginCore_567> {
    private static String[] var_java_lang_String_arr_b;
    private static long aw;
    private static long var_long_e;
    private static long ai;
    private static int bb;
    private static int l;
    private static int u;
    private static long d;
    private static long as;
    private static int x;
    static final int aJ;
    private static long p;
    final AtomicInteger var_java_util_concurrent_atomic_AtomicInteger_c;
    private static int o;
    private static int s;
    private static int var_int_a;
    private static int ax;
    private static int av;
    private static int r;
    private static int bc;
    private static long k;
    private static long aj;
    private static long var_long_m;
    private static int aa;
    private static int at;
    private static int ak;
    private static int g;
    private static long var_long_n;
    public final Object var_java_lang_Object_n;
    private static int ae;
    private final NLoginCore_277 var_com_nickuc_login_NLoginCore_277_e;
    private static int f;
    static final int aI;
    private static long var_long_c;
    private static int ad;
    private static int ac;
    private static int az;
    private static long au;
    private static int am;
    private static long y;
    private static long z;
    private static int ao;
    private static long w;
    private static long h;
    private static int ab;
    private static long an;
    private static int var_int_b;
    private static int ah;
    private static long v;
    private static String[] var_java_lang_String_arr_a;
    private static long al;
    private static int ay;
    private static int i;
    private static long q;
    private static int ba;
    private final Map<String, Object> cfr_renamed_20;
    static final int aH;
    static final int aK;
    private static long af;
    private static long j;
    private static int ap;
    private static long ag;
    private static long t;
    private static long aq;
    private static int ar;

    public boolean a(NLoginCore_567 NLoginCore_5672) {
        return this.var_long_m.containsKey(NLoginCore_5672.aB());
    }

    private static void void_b() {
        int n;
        var_long_c = 4139735126883960501L;
        long l = var_long_c ^ 0xF3031B42BE2DB267L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(49 + 20), (byte)(59 + 24), (byte)(5 + 42), (byte)(9 + 58), (byte)(24 + 42), (byte)(29 + 38), (byte)(29 + 18), (byte)(72 + 8), (byte)(55 + 20), 67, (byte)(75 + 8), (byte)(5 + 48), (byte)(34 + 46), 97, (byte)(53 + 47), (byte)(69 + 31), (byte)(45 + 60), (byte)(63 + 47), (byte)(42 + 61)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_509.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ԮԒԼԕԪԕԭԽԞӼՄԍԁԁԓԻԸԥԾԋԗԠԅԚԺԺԞԎՓԾՑԷԶ՛ԧԺԻԷՏԖԱԬԿԨ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[1] = NLoginCore_004.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵՌՓՋԜԷԾԽՉՠԔԷԨ", (byte)89, 68);
                    NLoginCore_509.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ԧԓӸԌӺԓԋԛԬԀԱԈ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[4] = NLoginCore_110.B("ţŦŞƨƌƝŭƪƂųƳƩŨƯŶƊƬźƑůƚƲƎƙǀŹƕƞƾƹƿŻƘǇƬǇǏƗƇƲƯƿƝǔǈƨƏƘƧƶƩƪƔǍƤƥ", (byte)89, 66);
                    NLoginCore_509.var_java_lang_String_arr_b[5] = NLoginCore_027.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
                    NLoginCore_509.var_java_lang_String_arr_b[6] = NLoginCore_076.D("ԔԦԥԫԞԨԋԙԭԔԐԾՄԶՇԠԝԀԼԈՂԈՌՃԤՍԧՂԤԴԳԘՋՇԫԎՈԹՓ԰ԻԜ՝Ԩ", (byte)89, 68);
                    NLoginCore_509.var_java_lang_String_arr_b[7] = NLoginCore_138.E("ռըՍաՏըՠհցՕֆ՝", (byte)89, 69);
                    NLoginCore_509.var_java_lang_String_arr_b[8] = NLoginCore_384.B("ƃƩƇſƠŧƮŰƆžưƓƤŭƲƙƒƨƗƈƝźƝƉŽƺǄƔơƂƠƛƆƺƽƜƺƮƐǒƜƽƎƴƫƵǈƑƣǈƧƴƿƕǐƜǣưƻǍƟǣǃǆǜƺƼǋǭǚƫǂǰǂǄƿǍǫǈǃƸƲǨǎǘǭǄǅ", (byte)89, 66);
                    NLoginCore_509.var_java_lang_String_arr_b[9] = NLoginCore_201.A("ƓŻŶƙſƁƭƎƞƄƞƆƴƨƗƳƤƺƒƌƯƗƄƅ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[10] = NLoginCore_091.C("ԱԷӴԑԔԌԈ԰ԡӻԯԯԘԁԧԔԪԽՁԔԖԖԓԔ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[11] = NLoginCore_091.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƭƉƸƷƎƬƃƅŽǂƓ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[12] = NLoginCore_387.F("ռծ֎էէՊՑՌՈժՔշթ։օշՔ՛թ֡֘ջըթ", (byte)89, 70);
                    NLoginCore_509.var_java_lang_String_arr_b[13] = NLoginCore_384.A("ƛƄŸƌƚŸžƩưƁūŹ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[14] = NLoginCore_575.D("ԈӹԱԪԫԑԧԊՀԲՄԑԾԆԒԳԛՋԤԝԄԼԓԔ", (byte)89, 68);
                    NLoginCore_509.var_java_lang_String_arr_b[15] = NLoginCore_427.F("Հչփ֎կվ֊նշւ֎՝", (byte)89, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_509.var_java_lang_String_arr_b[0] = NLoginCore_004.E("փէ֑ժտժւ֒ճՑ֙բՖՖը֐֍պ֓ՠլյ՚կ֏֏ճգ֦֨֓֌ըըհօ֜ձժ֯֕հ֪ս", (byte)89, 69);
                    NLoginCore_509.var_java_lang_String_arr_b[1] = NLoginCore_324.F("՞֐ասթՉՔ֕տ֖դ՝", (byte)89, 70);
                    NLoginCore_509.var_java_lang_String_arr_b[2] = NLoginCore_223.C("ԴԨӳӮԭӺԜӽԮԻԸԘԲԺԶՂԙԆԼԸԠԄՄՃԐԽԤՎՈՋԪԵԬԱՇԺԾԗԿՔաԞՑԨ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[3] = NLoginCore_173.C("ԍԸԭԆԪԔԶԘԉԿԋԈ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[4] = NLoginCore_173.C("ӲӵӭԷԛԬӼԹԑԂՂԸӷԾԅԙԻԉԠӾԩՁԝԨՏԈԤԭՍՈՎԊԧՖԻՖ՞ԦԖՁԾՎԫԽ԰դԷզՖԷԫեԩլԳԴ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[5] = NLoginCore_092.B("ŻŨƆƉƩŪƨƃƠƐżŹ", (byte)89, 66);
                    NLoginCore_509.var_java_lang_String_arr_b[6] = NLoginCore_453.A("ƅƗƖƜƏƙżƊƞƅƁƯƵƧƸƑƎűƭŹƳŹƽƴƕƾƘƳƕƥƤƉƩǊơǇƶƙƍƤƐƥƬǉƨƤơƙƴƕƦǈƙǝƤƥ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[7] = NLoginCore_092.A("ƣťžƊŻƍƥƎƑƢƞŹ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ԒԸԖԎԯӶԽӿԕԍԿԢԳӼՁԨԡԷԦԗԬԉԬԘԌՉՓԣ԰ԑԯԪԕՉՌԫՉԽԟաԫՌԝՃԺՄ՗ԠԲ՗ԶՃՎԤ՟ԫղԿՊ՜ԮղՒՕիՉՋ՚ռթԺՑտՑՕՐՒՆՇն՘՞քցՠռցժօպ֍էբյ֎֎", (byte)89, 68);
                    NLoginCore_509.var_java_lang_String_arr_b[9] = NLoginCore_446.E("շ՟՚սգե֑ղւըքդյգ֔՘֙ՙ֐֚֐֡ըթ", (byte)89, 69);
                    NLoginCore_509.var_java_lang_String_arr_b[10] = NLoginCore_076.F("ֆ֌Չզթա՝օնՐքժլշզսո֝֌֛֠լ֥ղ֟՝֝֞֗֕֙ր", (byte)89, 70);
                    NLoginCore_509.var_java_lang_String_arr_b[11] = NLoginCore_223.A("ƜŷƍƉƨŭƨŹƨŰƑƅƊƀŲƳƲƤƴŵƹƻƨƒƎŵƤƝƐƝƑƿ", (byte)89, 65);
                    NLoginCore_509.var_java_lang_String_arr_b[12] = NLoginCore_110.B("ƘƊƪƃƃŦŭŨŤƆűƆžƧƯŹƬƌƦưƎƭƄƅ", (byte)89, 66);
                    NLoginCore_509.var_java_lang_String_arr_b[13] = NLoginCore_453.C("ԍԈԆԲԈԺԸԐԒӿԸԂԲԶԛԇԚԴԖԪԸԼԓԔ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[14] = NLoginCore_027.C("ԈӹԱԪԫԑԧԊՀԲՄԀԱԐԹԗԶՂԼԄԃԼԓԔ", (byte)89, 67);
                    NLoginCore_509.var_java_lang_String_arr_b[15] = NLoginCore_575.D("ԳԵԦӶԫԆԎԭԩӾԱԈ", (byte)89, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_509.var_java_lang_String_arr_b[0] = NLoginCore_138.E("էչըծՌիվ֍֍֓֏Ր֛՚մջ֌֠մսծջըթ", (byte)89, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_509.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ԺԨԛԝԦԲԩԴԁԯӺԀԼԢԖԘԈՅՉԌԺԖԓԔ", (byte)89, 68);
                }
            }
        }
    }

    public String d() {
        String string = (String)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_b);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException((String)NLoginCore_509.c("㺀", (int)i, (long)(j ^ k)) + this.var_com_nickuc_login_NLoginCore_277_e.getName() + (String)NLoginCore_509.c("㺃", (int)l, (long)(var_long_m ^ var_long_n)));
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 0 >>> 78 | 0 << ~78 + 1;
        d = Long.reverse(-5953753878417453412L);
        var_long_e = Long.reverse(0x2400000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Integer.reverse(-1);
        h = Long.reverse(-8547827263782859108L);
        i = (512 >>> 200 | 512 << ~200 + 1) & 0xFFFFFFFF;
        j = Long.reverse(-5953753878417453412L);
        k = Long.reverse(0x2400000000000000L);
        l = Integer.reverse(-1073741824);
        var_long_m = Long.reverse(-5953753878417453412L);
        var_long_n = Long.reverse(0x2400000000000000L);
        o = (0x800000 >>> 21 | 0x800000 << ~21 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-5953753878417453412L);
        q = Long.reverse(0x2400000000000000L);
        r = Integer.reverse(-1610612736);
        s = Integer.reverse(-1);
        t = Long.reverse(-8547827263782859108L);
        u = Integer.reverse(0x60000000);
        v = Long.reverse(-5953753878417453412L);
        w = Long.reverse(0x2400000000000000L);
        x = Integer.reverse(-536870912);
        y = Long.reverse(-5953753878417453412L);
        z = Long.reverse(0x2400000000000000L);
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = (0 >>> 27 | 0 << ~27 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(-1);
        ad = (16384 >>> 142 | 16384 << ~142 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(0x10000000);
        af = Long.reverse(-5953753878417453412L);
        ag = Long.reverse(0x2400000000000000L);
        ah = Integer.reverse(-1879048192);
        ai = Long.reverse(-5953753878417453412L);
        aj = Long.reverse(0x2400000000000000L);
        ak = Integer.reverse(0x50000000);
        al = Long.reverse(-8547827263782859108L);
        am = Integer.reverse(-805306368);
        an = Long.reverse(-8547827263782859108L);
        ao = (49152 >>> 172 | 49152 << -172) & 0xFFFFFFFF;
        ap = (-1 >>> 191 | -1 << ~191 + 1) & 0xFFFFFFFF;
        aq = Long.reverse(-8547827263782859108L);
        ar = Integer.reverse(-1342177280);
        as = Long.reverse(-8547827263782859108L);
        at = Integer.reverse(0x70000000);
        au = Long.reverse(-8547827263782859108L);
        av = Integer.reverse(-268435456);
        aw = Long.reverse(-8547827263782859108L);
        ax = (0x2000000 >>> 149 | 0x2000000 << ~149 + 1) & 0xFFFFFFFF;
        ay = Integer.reverse(0x8000000);
        az = 0 >>> 202 | 0 << ~202 + 1;
        ba = (-16777217 >>> 88 | -16777217 << -88) & 0xFFFFFFFF;
        bb = Integer.reverse(Integer.MIN_VALUE);
        bc = Integer.reverse(-1);
        var_java_lang_String_arr_a = new String[ax];
        var_java_lang_String_arr_b = new String[ay];
        NLoginCore_509.void_b();
        aJ = az;
        aH = ba;
        aK = bb;
        aI = bc;
    }

    public NLoginInterface_024 com_nickuc_login_NLoginInterface_024_a() {
        return this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_m, (String string) -> NLoginInterface_024.a(NLoginType_008.com_nickuc_login_NLoginType_008_c(), this.var_com_nickuc_login_NLoginCore_277_e, this));
    }

    @Nullable
    public Integer java_lang_Integer_b() {
        Integer n = (Integer)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z);
        if (n != null) {
            int n2 = this.a(NLoginCore_567.A, NLoginCore_532.E.r());
            return n2 - n;
        }
        return null;
    }

    @Override
    public void a(NLoginCore_567 NLoginCore_5672, Object object) {
        this.var_long_m.put(NLoginCore_5672.aB(), object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(NLoginCore_077 NLoginCore_0772, @Nullable NLoginCore_077 NLoginCore_0773) {
        Object object = this.var_java_lang_Object_n;
        synchronized (object) {
            NLoginCore_077 NLoginCore_0774;
            if (NLoginCore_0773 != null && NLoginCore_0773 != (NLoginCore_0774 = this.com_nickuc_login_NLoginCore_077_a())) {
                throw new IllegalStateException((String)NLoginCore_509.c("㺀", (int)ae, (long)(af ^ ag)) + this.var_com_nickuc_login_NLoginCore_277_e.getName() + (String)NLoginCore_509.c("㺃", (int)ah, (long)(ai ^ aj)) + (Object)((Object)NLoginCore_0774) + (String)NLoginCore_509.c("㺆", (int)ak, (long)al) + (Object)((Object)NLoginCore_0773));
            }
            this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_p, (Object)NLoginCore_0772);
        }
    }

    @Nullable
    public NLoginCore_055 com_nickuc_login_NLoginCore_055_b() {
        return (NLoginCore_055)((Object)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i));
    }

    public NLoginCore_510 com_nickuc_login_NLoginCore_510_a() {
        NLoginCore_510 NLoginCore_510 = (NLoginCore_510)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_g);
        if (NLoginCore_510 != null) {
            return NLoginCore_510;
        }
        throw new IllegalStateException((String)NLoginCore_509.c("㺀", (int)u, (long)(v ^ w)) + this.var_com_nickuc_login_NLoginCore_277_e.getName() + (String)NLoginCore_509.c("㺃", (int)x, (long)(y ^ z)));
    }

    @Override
    @Nullable
    public <T> T a(NLoginCore_567 NLoginCore_5672) {
        Object v = this.var_long_m.remove(NLoginCore_5672.aB());
        return (T)v;
    }

    public NLoginCore_055 com_nickuc_login_NLoginCore_055_a() {
        NLoginCore_055 NLoginCore_0552 = NLoginCore_150.c();
        if (NLoginCore_532.ap.ar()) {
            return this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i, NLoginCore_0552);
        }
        return NLoginCore_0552;
    }

    public void aI() {
        if (this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z)) {
            this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z, (Object)(this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_z, ac) + ad));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x24L;
        l ^= 0xF3031B42BE2DB267L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(27 + 42), (byte)(68 + 15), (byte)(33 + 14), (byte)(39 + 28), (byte)(59 + 7), (byte)(64 + 3), (byte)(24 + 23), (byte)(12 + 68), 75, (byte)(39 + 28), (byte)(37 + 46), (byte)(28 + 25), (byte)(72 + 8), (byte)(21 + 76), (byte)(53 + 47), (byte)(85 + 15), 105, (byte)(107 + 3), (byte)(80 + 23)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(4 + 65), (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.B("ĨĵĴ÷ķĳĮķłıþļŀĹļłĄҏҎҗҡҝҎҚҟ҇ҒҔ", (byte)35, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_509.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_077 com_nickuc_login_NLoginCore_077_a() {
        return this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_p, NLoginCore_077.var_com_nickuc_login_NLoginCore_077_a);
    }

    public boolean j() {
        NLoginCore_055 NLoginCore_0552 = this.com_nickuc_login_NLoginCore_055_a();
        return (NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c || NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_s ? aa : ab) != 0;
    }

    @Override
    public /* synthetic */ boolean c(Object object) {
        return this.a((NLoginCore_567)((Object)object));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_509.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ѭҏґѱҕҴҬӂҮѽһұҿҹ҂ҧӉӈӀӆӀҕ", (byte)48, 67), NLoginCore_509.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.A("łŏŎđőōňőŜŋĘŖŚœŖŜĞҩҨұһҷҨҴҹҡҬҮĵ", (byte)48, 65) + string + NLoginCore_138.E("Ԧ", (byte)48, 69) + methodType.toString(), exception);
        }
    }

    @Override
    @Nullable
    public /* synthetic */ Object a(Object object) {
        return this.b((NLoginCore_567)((Object)object));
    }

    public ForceRegisterConfig com_nickuc_login_ForceRegisterConfig_a() {
        ForceRegisterConfig ForceRegisterConfig2 = (ForceRegisterConfig)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_a);
        if (ForceRegisterConfig2 != null) {
            return ForceRegisterConfig2;
        }
        throw new IllegalStateException((String)NLoginCore_509.c("㺀", (int)var_int_b, (long)(d ^ var_long_e)) + this.var_com_nickuc_login_NLoginCore_277_e.getName() + (String)NLoginCore_509.c("㺃", (int)(f & g), (long)h));
    }

    @Override
    public <T> T a(NLoginCore_567 NLoginCore_5672, Function<String, T> function) {
        return this.var_long_m.computeIfAbsent(NLoginCore_5672.aB(), function);
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_509.c("㺀", (int)am, (long)an) + this.var_long_m + (String)NLoginCore_509.c("㺃", (int)(ao & ap), (long)aq) + this.com_nickuc_login_NLoginCore_277_b() + (String)NLoginCore_509.c("㺆", (int)ar, (long)as) + this.var_java_lang_Object_n + (String)NLoginCore_509.c("㺉", (int)at, (long)au) + this.var_java_util_concurrent_atomic_AtomicInteger_c + (String)NLoginCore_509.c("㺌", (int)av, (long)aw);
    }

    @Nullable
    public Object b(NLoginCore_567 NLoginCore_5672) {
        return this.var_long_m.get(NLoginCore_5672.aB());
    }

    public NLoginInterface_017 com_nickuc_login_NLoginInterface_017_a() {
        NLoginInterface_017 NLoginInterface_0172 = (NLoginInterface_017)this.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_f);
        if (NLoginInterface_0172 != null) {
            return NLoginInterface_0172;
        }
        throw new IllegalStateException((String)NLoginCore_509.c("㺀", (int)o, (long)(p ^ q)) + this.var_com_nickuc_login_NLoginCore_277_e.getName() + (String)NLoginCore_509.c("㺃", (int)(r & s), (long)t));
    }

    public NLoginCore_509(NLoginCore_277 NLoginCore_277, InetSocketAddress inetSocketAddress) {
        this.var_long_m = (long)new ConcurrentHashMap();
        this.var_java_lang_Object_n = new Object();
        this.var_java_util_concurrent_atomic_AtomicInteger_c = new AtomicInteger(var_int_a);
        this.var_com_nickuc_login_NLoginCore_277_e = NLoginCore_277;
        this.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_d, inetSocketAddress);
    }

    @Generated
    public NLoginCore_277 com_nickuc_login_NLoginCore_277_b() {
        return this.var_com_nickuc_login_NLoginCore_277_e;
    }
}

