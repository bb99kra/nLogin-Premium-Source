/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.HikariConnectionPool;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_536;
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

public class NLoginCore_562
extends HikariConnectionPool {
    private static long q;
    private static int e;
    private static long h;
    private static int i;
    private static String[] var_java_lang_String_arr_d;
    private static long r;
    private static long f;
    private static int z;
    private static long w;
    private static String[] c;
    private static int o;
    private static int var_int_d;
    private static long n;
    private static long k;
    private static int s;
    private static long t;
    private static int y;

    private static String a(int n, long l) {
        l ^= 0x4EL;
        l ^= 0x785BB19286738034L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(65 + 4), (byte)(11 + 72), (byte)(3 + 44), (byte)(21 + 46), (byte)(44 + 22), 67, (byte)(33 + 14), (byte)(41 + 39), (byte)(8 + 67), (byte)(27 + 40), (byte)(63 + 20), (byte)(3 + 50), (byte)(6 + 74), (byte)(73 + 24), (byte)(3 + 97), (byte)(58 + 42), (byte)(65 + 40), (byte)(109 + 1), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.F("Պ՗ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦ࢛ࢭࢻ࢏ࢲࢴࢼࢽ", (byte)43, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_562.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public static NLoginCore_562 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return NLoginCore_562.a(NLoginInterface_0112, NLoginCore_147, null);
    }

    private static void b() {
        int n;
        f = 5340416691611574494L;
        long l = f ^ 0x785BB19286738034L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(63 + 20), (byte)(9 + 38), (byte)(16 + 51), (byte)(40 + 26), (byte)(65 + 2), 47, (byte)(61 + 19), (byte)(37 + 38), (byte)(19 + 48), (byte)(68 + 15), (byte)(23 + 30), (byte)(27 + 53), (byte)(93 + 4), (byte)(33 + 67), (byte)(14 + 86), (byte)(54 + 51), (byte)(97 + 13), (byte)(4 + 99)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
                    NLoginCore_562.var_java_lang_String_arr_d[0] = NLoginCore_027.A("ƤǂƉǏǑƑǇƢƮǍǆǋǋƚƳǝǝǀǗƹƛƭƴǝǀƶǉǝǣƻǨǚǇƼǨǆǄǄǱǀǖǃǬǓǌǞǯǕǙǾȁǏǛǝǊǋ", (byte)108, 65);
                    NLoginCore_562.var_java_lang_String_arr_d[1] = NLoginCore_384.A("ƘǄǎƴƬƭƿƕƭǐǃǜǄǑƳǗƺǘƭǟƲƽƪƫ", (byte)108, 65);
                    NLoginCore_562.var_java_lang_String_arr_d[2] = NLoginCore_091.B("ƂǃǒǑǅƽǒƷǕƗǐƟ", (byte)108, 66);
                    NLoginCore_562.var_java_lang_String_arr_d[3] = NLoginCore_138.E("֞ատօ֘դռռվգ֥հ", (byte)108, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_562.var_java_lang_String_arr_d[0] = NLoginCore_110.A("ƤǂƉǏǑƑǇƢƮǍǆǋǋƚƳǝǝǀǗƹƛƭƴǝǀƶǉǝǣƻǨǚǇƼǨǆǄǄǱǀǖǃǯǶƳǹƽǰǀǼǗǔǥǍǊǋ", (byte)108, 65);
                    NLoginCore_562.var_java_lang_String_arr_d[1] = NLoginCore_076.B("ƘǄǎƴƬƭƿƕƭǐƻƭƵǓưƿǉƻǂǠƱƴƞǢǛǇƣǋƤǢƪƭ", (byte)108, 66);
                    NLoginCore_562.var_java_lang_String_arr_d[2] = NLoginCore_027.E("֏֕խ֞՛՟ՙյ֨ն֩հ", (byte)108, 69);
                    NLoginCore_562.var_java_lang_String_arr_d[3] = NLoginCore_324.E("ծ֘ս֠֐վ֖֦չն֙հ", (byte)108, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_562.var_java_lang_String_arr_d[0] = NLoginCore_110.D("Ռ՝ՔդլԵճՋՇ՚ղՁ", (byte)108, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_562.var_java_lang_String_arr_d[0] = NLoginCore_092.C("՝ՇզԫՅՊԶ՘յՓլՊՖ՛ՌյՁկրփ՛յՌՍ", (byte)108, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_562.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.A("čįıđĵŔŌŢŎĝśőşřĢŇũŨŠŦŠĵ", (byte)51, 65), NLoginCore_562.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.F("Ւ՟՞ԡա՝՘ալ՛ԨզժգզլԮࢣࢵࣃࢗࢺࢼࣄࣅՂ", (byte)51, 70) + string + NLoginCore_091.D("҈", (byte)51, 68) + methodType.toString(), exception);
        }
    }

    public static NLoginCore_562 b(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147) {
        return new NLoginCore_562(NLoginInterface_0112, NLoginCore_147, null, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_b);
    }

    static {
        var_int_d = Integer.reverse(0);
        e = Integer.reverse(-1);
        h = Long.reverse(649864208520788050L);
        i = 1024 >>> 234 | 1024 << ~234 + 1;
        k = Long.reverse(8864429928844572754L);
        n = Long.reverse(0x7200000000000000L);
        o = Integer.reverse(0x40000000);
        q = Long.reverse(8864429928844572754L);
        r = Long.reverse(0x7200000000000000L);
        s = Integer.reverse(-1073741824);
        t = Long.reverse(8864429928844572754L);
        w = Long.reverse(0x7200000000000000L);
        y = (8192 >>> 107 | 8192 << ~107 + 1) & 0xFFFFFFFF;
        z = Integer.reverse(0x20000000);
        c = new String[y];
        var_java_lang_String_arr_d = new String[z];
        NLoginCore_562.b();
    }

    @Override
    protected String java_lang_String_a(NLoginCore_147 NLoginCore_147) {
        return (String)NLoginCore_562.c("㺀", (int)i, (long)(k ^ n)) + NLoginCore_147.x() + (String)NLoginCore_562.c("㺃", (int)o, (long)(q ^ r)) + NLoginCore_147.int_j() + (String)NLoginCore_562.c("㺆", (int)s, (long)(t ^ w)) + NLoginCore_147.y();
    }

    @Override
    protected String w() {
        return NLoginCore_562.c("㺀", (int)(var_int_d & e), (long)h);
    }

    public static NLoginCore_562 a(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer) {
        return new NLoginCore_562(NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_536.var_com_nickuc_login_NLoginCore_536_a);
    }

    private NLoginCore_562(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, Consumer<HikariConfig> consumer, NLoginCore_536 NLoginCore_5362) {
        super(NLoginCore_036.var_com_nickuc_login_NLoginCore_036_c, NLoginInterface_0112, NLoginCore_147, consumer, NLoginCore_5362);
    }

    @Override
    protected void a(HikariConfig hikariConfig, NLoginCore_147 NLoginCore_147) {
        hikariConfig.setDriverClassName(this.w());
        hikariConfig.setJdbcUrl(this.java_lang_String_a(NLoginCore_147));
        hikariConfig.setUsername(NLoginCore_147.z());
        hikariConfig.setPassword(NLoginCore_147.java_lang_String_j());
    }
}

