/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.jedis.DefaultJedisClientConfig
 *  com.nickuc.login.lib.jedis.HostAndPort
 *  com.nickuc.login.lib.jedis.JedisClientConfig
 *  com.nickuc.login.lib.jedis.JedisCluster
 *  com.nickuc.login.lib.jedis.JedisPooled
 *  com.nickuc.login.lib.jedis.UnifiedJedis
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.jedis.DefaultJedisClientConfig;
import com.nickuc.login.lib.jedis.HostAndPort;
import com.nickuc.login.lib.jedis.JedisClientConfig;
import com.nickuc.login.lib.jedis.JedisCluster;
import com.nickuc.login.lib.jedis.JedisPooled;
import com.nickuc.login.lib.jedis.UnifiedJedis;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_587;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_451;
import java.io.Closeable;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_319
implements Closeable {
    private static long c;
    private static int n;
    private final Map<String, NLoginCore_587> cfr_renamed_23 = new HashMap<String, NLoginCore_587>();
    private static String[] var_java_lang_String_arr_a;
    private static long e;
    private static String[] var_java_lang_String_arr_b;
    private static int r;
    private static long p;
    private static int g;
    private final UnifiedJedis var_com_nickuc_login_lib_jedis_UnifiedJedis_a;
    private static int var_int_a;
    private boolean ad;
    private static int j;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____f;
    private static int h;
    private static long l;
    private static long d;
    private static int var_int_i;
    private static long o;
    private static int m;
    private static long k;
    private static int s;
    private static int var_int_b;
    private static int q;
    private static int var_int_f;

    public static NLoginCore_319 a(NLoginCore_116<?> NLoginInterface_0112, String string, String string2, String string3, boolean bl) {
        return new NLoginCore_319(NLoginInterface_0112, (UnifiedJedis)new JedisPooled(NLoginCore_319.a(string), NLoginCore_319.a(string2, string3, bl)));
    }

    private static void b() {
        int n;
        c = -8168565572369118968L;
        long l = c ^ 0x54CA01A151C1E015L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(24 + 45), (byte)(50 + 33), 47, (byte)(5 + 62), (byte)(56 + 10), (byte)(44 + 23), (byte)(36 + 11), (byte)(77 + 3), (byte)(51 + 24), (byte)(38 + 29), (byte)(16 + 67), (byte)(47 + 6), (byte)(16 + 64), (byte)(48 + 49), (byte)(78 + 22), (byte)(65 + 35), (byte)(8 + 97), (byte)(48 + 62), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(57 + 12), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_319.var_java_lang_String_arr_b[0] = NLoginCore_384.E("՘ՂԷծՌբիՍգՐՓԼ", (byte)56, 69);
                    NLoginCore_319.var_java_lang_String_arr_b[1] = NLoginCore_223.A("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 65);
                    NLoginCore_319.var_java_lang_String_arr_b[2] = NLoginCore_110.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢƃŝſĽŹŃŧŚžŝŚŗ", (byte)56, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_319.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ԹՁԼդդՄզԮԾիաԼ", (byte)56, 70);
                    NLoginCore_319.var_java_lang_String_arr_b[1] = NLoginCore_384.B("şťńţĵśŉŤįĩŐłıŝœőŕŊŦĺĶĶŎňŒĻōŎŚŖƀŢżűŉńŊŅƅŜŋűőƓƐŎƌťŠŶƎōƔťŢţ", (byte)56, 66);
                    NLoginCore_319.var_java_lang_String_arr_b[2] = NLoginCore_559.E("դժՉըԺՠՎթԴԮՕՇԶբ՘Ֆ՚ՏիԿԻԻՓՍ՗ՀՒՓ՟՛օէ՚՗ռադՋ։հիայ֘֊՗խ՘եֈվ֞։֠էը", (byte)56, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_319.var_java_lang_String_arr_b[0] = NLoginCore_451.E("ԬԩՠԽ՝ԬՊՓՈկեԼ", (byte)56, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_319.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ҖҬӎҦӕӕһӔҰҵҨҥ", (byte)56, 68);
                }
            }
        }
    }

    public static NLoginCore_319 a(NLoginCore_116<?> NLoginInterface_0112, List<String> list, String string, String string2, boolean bl) {
        Set set = list.stream().map(NLoginCore_319::a).collect(Collectors.toSet());
        return new NLoginCore_319(NLoginInterface_0112, (UnifiedJedis)new JedisCluster(set, NLoginCore_319.a(string, string2, bl)));
    }

    static {
        var_int_a = (64000 >>> 101 | 64000 << ~101 + 1) & 0xFFFFFFFF;
        var_int_b = 0 >>> 148 | 0 << -148;
        d = Long.reverse(1193504960482297201L);
        e = Long.reverse(0x7400000000000000L);
        var_int_f = Integer.reverse(0);
        g = (0x40000000 >>> 254 | 0x40000000 << -254) & 0xFFFFFFFF;
        h = 0x4000000 >>> 186 | 0x4000000 << -186;
        var_int_i = (-2147480459 >>> 255 | -2147480459 << -255) & 0xFFFFFFFF;
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Long.reverse(1193504960482297201L);
        l = Long.reverse(0x7400000000000000L);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = 128 >>> 38 | 128 << ~38 + 1;
        o = Long.reverse(1193504960482297201L);
        p = Long.reverse(0x7400000000000000L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = 0x60000000 >>> 125 | 0x60000000 << ~125 + 1;
        s = (1536 >>> 41 | 1536 << ~41 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[r];
        var_java_lang_String_arr_b = new String[s];
        NLoginCore_319.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        this.ad = q;
        Map<String, NLoginCore_587> map = this.cfr_renamed_23;
        synchronized (map) {
            this.cfr_renamed_23.values().forEach(NLoginCore_587::close);
        }
        this.var_com_nickuc_login_lib_jedis_UnifiedJedis_a.close();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_319.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("đĳĵĕĹŘŐŦŒġşŕţŝĦŋŭŬŤŪŤĹ", (byte)53, 66), NLoginCore_319.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.A("ŌřŘěśŗŒśŦŕĢŠŤŝŠŦĨҍӀұӁһҚҶҡһҖҺҨŀ", (byte)53, 65) + string + NLoginCore_446.D("Ҏ", (byte)53, 68) + methodType.toString(), exception);
        }
    }

    @Generated
    private NLoginCore_319(NLoginCore_116<?> NLoginInterface_0112, UnifiedJedis unifiedJedis) {
        this.var_com_nickuc_login_NLoginInterface_011____f = NLoginInterface_0112;
        this.var_com_nickuc_login_lib_jedis_UnifiedJedis_a = unifiedJedis;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, Consumer<String> consumer) {
        if (this.ad) {
            throw new IllegalStateException((String)NLoginCore_319.c("㺀", (int)j, (long)(k ^ l)));
        }
        Map<String, NLoginCore_587> map = this.cfr_renamed_23;
        synchronized (map) {
            NLoginCore_587 NLoginCore_5872 = new NLoginCore_587(this, string, consumer, null);
            this.cfr_renamed_23.put(string, NLoginCore_5872);
            this.var_com_nickuc_login_NLoginInterface_011____f.b(m != 0).a(NLoginCore_5872);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x54CA01A151C1E015L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), 69, (byte)(71 + 12), (byte)(42 + 5), (byte)(2 + 65), (byte)(27 + 39), (byte)(54 + 13), (byte)(24 + 23), (byte)(54 + 26), (byte)(71 + 4), (byte)(28 + 39), 83, (byte)(41 + 12), (byte)(16 + 64), (byte)(18 + 79), (byte)(98 + 2), (byte)(3 + 97), (byte)(60 + 45), (byte)(11 + 99), (byte)(78 + 25)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(44 + 39)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("ԱԾԽԀՀԼԷՀՋԺԇՅՉՂՅՋԍࡲࢥ࢖ࢦࢠࡿ࢛ࢆࢠࡻ࢟ࢍ", (byte)18, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_319.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static HostAndPort a(String string) {
        String[] stringArray = string.split((String)NLoginCore_319.c("㺀", (int)var_int_b, (long)(d ^ e)));
        String string2 = stringArray[var_int_f];
        int n = stringArray.length > g ? Integer.parseInt(stringArray[h]) : var_int_i;
        return new HostAndPort(string2, n);
    }

    public void l(String string, String string2) {
        this.var_com_nickuc_login_lib_jedis_UnifiedJedis_a.publish(string, string2);
    }

    private static JedisClientConfig a(String string, String string2, boolean bl) {
        return DefaultJedisClientConfig.builder().user(string).password(string2).ssl(bl).timeoutMillis(var_int_a).build();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void t(String string) {
        if (this.ad) {
            throw new IllegalStateException((String)NLoginCore_319.c("㺀", (int)n, (long)(o ^ p)));
        }
        Map<String, NLoginCore_587> map = this.cfr_renamed_23;
        synchronized (map) {
            NLoginCore_587 NLoginCore_5872 = this.cfr_renamed_23.remove(string);
            if (NLoginCore_5872 != null) {
                NLoginCore_5872.close();
            }
        }
    }

    static /* synthetic */ UnifiedJedis a(NLoginCore_319 NLoginCore_319) {
        return NLoginCore_319.var_com_nickuc_login_lib_jedis_UnifiedJedis_a;
    }
}

