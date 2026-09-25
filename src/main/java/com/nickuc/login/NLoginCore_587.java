/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.jedis.JedisCluster
 *  com.nickuc.login.lib.jedis.JedisPooled
 *  com.nickuc.login.lib.jedis.JedisPubSub
 *  com.nickuc.login.lib.jedis.UnifiedJedis
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.jedis.JedisCluster;
import com.nickuc.login.lib.jedis.JedisPooled;
import com.nickuc.login.lib.jedis.JedisPubSub;
import com.nickuc.login.lib.jedis.UnifiedJedis;
import com.nickuc.login.NLoginCore_319;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_590;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.io.Closeable;
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
import lombok.Generated;

class NLoginCore_587
extends JedisPubSub
implements Closeable,
Runnable {
    private static long var_long_c;
    private static long d;
    private static long g;
    private static String[] var_java_lang_String_arr_b;
    private static long n;
    private static int t;
    private static int ah;
    private static int k;
    private static long z;
    private final Consumer<String> var_java_util_function_Consumer_java_lang_String__b;
    private static int i;
    private static int aa;
    private static int l;
    private static int ai;
    private static int o;
    private static int j;
    private static long ag;
    private static int m;
    private static long q;
    private boolean var_boolean_ae;
    private static int var_int_b;
    private static int r;
    private static int x;
    private final String bm;
    private static int u;
    private static int var_int_ae;
    private static int var_int_c;
    private static long ac;
    private static long h;
    private static int f;
    private static int v;
    private static long s;
    private static int af;
    private static long ad;
    private static int var_int_a;
    private static int ab;
    private static long e;
    private static int y;
    private static String[] var_java_lang_String_arr_a;
    private static long p;
    private final NLoginCore_319 var_com_nickuc_login_NLoginCore_319_b;
    private static int w;
    private static int aj;

    public void m(String string, String string2) {
        if (!string.equals(this.bm)) {
            return;
        }
        this.var_java_lang_String_arr_b.accept(string2);
    }

    private static void b() {
        int n;
        var_long_c = 6089051318965870433L;
        long l = var_long_c ^ 0x5578E6DA71F80169L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(75 + 8), (byte)(7 + 40), 67, (byte)(21 + 45), (byte)(66 + 1), (byte)(22 + 25), (byte)(3 + 77), (byte)(18 + 57), (byte)(53 + 14), (byte)(58 + 25), (byte)(51 + 2), (byte)(72 + 8), (byte)(86 + 11), (byte)(81 + 19), (byte)(57 + 43), (byte)(104 + 1), (byte)(34 + 76), (byte)(84 + 19)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_587.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ԄՅԨԁԗԇԇԡՈԨԏԕ", (byte)17, 69);
                    NLoginCore_587.var_java_lang_String_arr_b[1] = NLoginCore_201.C("бўяуєѐФгТджѢѕХѠплпабрџэѪЯѕѓѴлкѶэҁѷѵсѠнѾјѼ҂҉ыѝљ҄щѿѰѼҎѫѲҀҌѕѧѦќѬѳҜҍ", (byte)17, 67);
                    NLoginCore_587.var_java_lang_String_arr_b[2] = NLoginCore_427.D("ПѠуМвТТмѣуЪа", (byte)17, 68);
                    NLoginCore_587.var_java_lang_String_arr_b[3] = NLoginCore_223.E("ԖՃԴԨԹԵԉԘԇԙԛՇԺԊՅԤԠԤԕԖԥՄԲՏԔԺԸՙԠԟ՛ԲԼԵՠԷԼԷՇԣ՞ՎՎԽըձՀՕիյՓի՗՛ՏԸշշԷԾԹի՘ֆ՟զ՟գվճ՘րըկՏՠա֒րխլՕքկ֍շՓկէր՛֚֟֞֝ծ", (byte)17, 69);
                    NLoginCore_587.var_java_lang_String_arr_b[4] = NLoginCore_004.E("ԯԕԥԲԼՃԘԤԊԜԩՄ԰ԦՓՁԤԤԱՅՇԗԼԯՍԫԚ՗ԙԹՀՙ", (byte)17, 69);
                    NLoginCore_587.var_java_lang_String_arr_b[5] = NLoginCore_091.B("ØęüÕëÛÛõĜüãé", (byte)17, 66);
                    NLoginCore_587.var_java_lang_String_arr_b[6] = NLoginCore_324.D("бўяуєѐФгТдеѩьХшрѩѱѣЭсѵѸщѲњѻѮѴѫјѝѕыѰѮѢѶѾџчѷ҈ъўѪѹэьэћ҉҉Ѯћќ", (byte)17, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_587.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ċøëýĒęýßòððé", (byte)17, 65);
                    NLoginCore_587.var_java_lang_String_arr_b[1] = NLoginCore_384.D("бўяуєѐФгТджѢѕХѠплпабрџэѪЯѕѓѴлкѶэҁѷѵсѠнѾјѼ҂҉ыѝљ҄щѿѰѼҎѫѳѶєѤҐҌѬѦҎёѸ", (byte)17, 68);
                    NLoginCore_587.var_java_lang_String_arr_b[2] = NLoginCore_138.D("РзЭкѦйгуѪљѕа", (byte)17, 68);
                    NLoginCore_587.var_java_lang_String_arr_b[3] = NLoginCore_092.B("êėĈüčĉÝìÛíïěĎÞęøôøéêùĘĆģèĎČĭôóįĆĐĉĴċĐċě÷ĲĢĢđļŅĔĩĿŉħĿīįģČŋŋċĒčĿĬŚĳĺĳķŒŇĬŔļŃģĴĵŦŔŁŀĩŘŃšŉŤűīńťńŇĳĴŶ", (byte)17, 66);
                    NLoginCore_587.var_java_lang_String_arr_b[4] = NLoginCore_110.F("ԯԕԥԲԼՃԘԤԊԜԩՄ԰ԦՓՁԤԤԱՅՇ՜ԸԜԺԞՊաԔԺԽԺԻԷՖզըԼիադԪզԵ", (byte)17, 70);
                    NLoginCore_587.var_java_lang_String_arr_b[5] = NLoginCore_575.C("жлєјОћгўјјуа", (byte)17, 67);
                    NLoginCore_587.var_java_lang_String_arr_b[6] = NLoginCore_138.A("êėĈüčĉÝìÛíîĢąÞāùĢĪĜæúĮıĂīēĴħĭĤđĖĎĄĩħěįķĘĀİľĦĽĀēŇĉĿþŊŉĽĔĕ", (byte)17, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_587.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ĎÙĎÏÿøďñĎôĠûĢĥúĨĪąěĕăĝôõ", (byte)17, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_587.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ÒÙďĎÞÝÒûìüęàĐ÷ĠăúĘçãčćôõ", (byte)17, 65);
                }
            }
        }
    }

    public /* synthetic */ void b(Object object, Object object2) {
        this.m((String)object, (String)object2);
    }

    private boolean ak() {
        UnifiedJedis unifiedJedis = NLoginCore_319.a(this.var_com_nickuc_login_NLoginCore_319_b);
        if (unifiedJedis instanceof JedisPooled) {
            return (!((JedisPooled)unifiedJedis).getPool().isClosed() ? t : u) != 0;
        }
        if (unifiedJedis instanceof JedisCluster) {
            return (!((JedisCluster)unifiedJedis).getClusterNodes().isEmpty() ? v : w) != 0;
        }
        throw new RuntimeException((String)NLoginCore_587.c("㺀", (int)(x & y), (long)z) + unifiedJedis.getClass().getName());
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_587.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 67), NLoginCore_587.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.C("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯ߶ࠄ߹ࠌ߾ߦࠍߣࠇ߼ࠆ҆", (byte)41, 67) + string + NLoginCore_324.E("ԟ", (byte)41, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_587(NLoginCore_319 NLoginCore_319, String string, Consumer<String> consumer) {
        this.var_com_nickuc_login_NLoginCore_319_b = NLoginCore_319;
        this.bm = string;
        this.var_java_lang_String_arr_b = consumer;
    }

    private static String a(int n, long l) {
        l ^= 0x2DL;
        l ^= 0x5578E6DA71F80169L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(20 + 49), (byte)(72 + 11), (byte)(24 + 23), (byte)(15 + 52), (byte)(10 + 56), (byte)(25 + 42), (byte)(43 + 4), (byte)(17 + 63), (byte)(22 + 53), (byte)(34 + 33), (byte)(24 + 59), 53, 80, (byte)(58 + 39), (byte)(61 + 39), (byte)(84 + 16), (byte)(38 + 67), (byte)(9 + 101), (byte)(22 + 81)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.E("Ւ՟՞ԡա՝՘ալ՛ԨզժգզլԮࢵࣃࢸ࣋ࢽࢥ࣌ࢢࣆࢻࣅ", (byte)51, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_587.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void run() {
        int n = var_int_a;
        while (!this.var_boolean_ae && !Thread.interrupted() && this.ak()) {
            try {
                if (n != 0) {
                    n = var_int_b;
                } else {
                    NLoginCore_370.e((String)NLoginCore_587.c("㺀", (int)var_int_c, (long)(d ^ e)) + this.bm + (String)NLoginCore_587.c("㺃", (int)f, (long)(g ^ h)), new Object[i]);
                }
                String[] stringArray = new String[j];
                stringArray[NLoginCore_587.k] = this.bm;
                NLoginCore_319.a(this.var_com_nickuc_login_NLoginCore_319_b).subscribe((JedisPubSub)this, stringArray);
            }
            catch (Exception exception) {
                if (this.var_boolean_ae) {
                    return;
                }
                NLoginCore_370.b((String)NLoginCore_587.c("㺆", (int)(l & m), (long)NLoginCore_587.n) + this.bm + (String)NLoginCore_587.c("㺉", (int)o, (long)(p ^ q)), exception, new Object[r]);
                try {
                    this.unsubscribe();
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                try {
                    Thread.sleep(s);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static {
        var_int_a = (0x100000 >>> 212 | 0x100000 << -212) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = 0 >>> 199 | 0 << ~199 + 1;
        d = Long.reverse(-8720754023362920150L);
        e = Long.reverse(-5476377146882523136L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-8720754023362920150L);
        h = Long.reverse(-5476377146882523136L);
        i = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        j = (1 >>> 160 | 1 << ~160 + 1) & 0xFFFFFFFF;
        k = 0 >>> 44 | 0 << -44;
        l = 65536 >>> 111 | 65536 << -111;
        m = Integer.reverse(-1);
        n = Long.reverse(3673152151160684842L);
        o = 384 >>> 39 | 384 << ~39 + 1;
        p = Long.reverse(-8720754023362920150L);
        q = Long.reverse(-5476377146882523136L);
        r = Integer.reverse(0);
        s = Long.reverse(1281274093986906112L);
        t = 256 >>> 136 | 256 << -136;
        u = Integer.reverse(0);
        v = 0x40000000 >>> 30 | 0x40000000 << ~30 + 1;
        w = Integer.reverse(0);
        x = 1024 >>> 40 | 1024 << -40;
        y = Integer.reverse(-1);
        z = Long.reverse(3673152151160684842L);
        aa = 0x4000000 >>> 218 | 0x4000000 << ~218 + 1;
        ab = -1610612736 >>> 125 | -1610612736 << -125;
        ac = Long.reverse(-8720754023362920150L);
        ad = Long.reverse(-5476377146882523136L);
        var_int_ae = 6144 >>> 170 | 6144 << ~170 + 1;
        af = (-1 >>> 159 | -1 << -159) & 0xFFFFFFFF;
        ag = Long.reverse(3673152151160684842L);
        ah = Integer.reverse(0);
        ai = (57344 >>> 77 | 57344 << ~77 + 1) & 0xFFFFFFFF;
        aj = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ai];
        var_java_lang_String_arr_b = new String[aj];
        NLoginCore_587.b();
    }

    @Override
    public void close() {
        this.var_boolean_ae = aa;
        try {
            this.unsubscribe();
        }
        catch (Exception exception) {
            NLoginCore_370.b((String)NLoginCore_587.c("㺀", (int)ab, (long)(ac ^ ad)) + this.bm + (String)NLoginCore_587.c("㺃", (int)(var_int_ae & af), (long)ag), exception, new Object[ah]);
        }
    }

    /* synthetic */ NLoginCore_587(NLoginCore_319 NLoginCore_319, String string, Consumer consumer, NLoginCore_590 θΛΣχαυθδτηξελαγ2) {
        this(NLoginCore_319, string, consumer);
    }
}

