/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.plugin.Plugin
 *  net.md_5.bungee.api.scheduler.ScheduledTask
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.scheduler.ScheduledTask;

public class NLoginCore_403
implements NLoginCore_598 {
    private static int m;
    private static long var_long_c;
    private static long h;
    private boolean M;
    private static long e;
    private static int var_int_c;
    private final String ar;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private ScheduledTask var_net_md_5_bungee_api_scheduler_ScheduledTask_a;
    private static long d;
    private static int var_int_a;
    private static int f;
    private final Runnable var_java_lang_Runnable_c;
    private static int l;
    private static long k;
    private static String[] var_java_lang_String_arr_a;
    private static int i;
    private static long j;
    private static long g;
    private static int n;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_403.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ŽƟơƁƥǄƼǒƾƍǋǁǏǉƒƷǙǘǐǖǐƥ", (byte)107, 65), NLoginCore_403.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.B("ƸǅǄƇǇǃƾǇǒǁƎǌǐǉǌǒƔԙԥԠԬԜԫԒԕƨ", (byte)107, 66) + string + NLoginCore_384.A("Ə", (byte)107, 65) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 6577050607956088073L;
        long l = var_long_c ^ 0x389665B72A73F89AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), 69, (byte)(65 + 18), (byte)(2 + 45), (byte)(49 + 18), (byte)(2 + 64), (byte)(53 + 14), (byte)(28 + 19), (byte)(32 + 48), (byte)(8 + 67), (byte)(30 + 37), (byte)(57 + 26), (byte)(12 + 41), (byte)(59 + 21), (byte)(8 + 89), (byte)(32 + 68), (byte)(3 + 97), (byte)(31 + 74), 110, (byte)(4 + 99)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_403.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ԷՉծՌԸԵ՚ՙյ՜ղթւոֈ֍Նրհ֏հհվճօՓզպՖ֚֏֘", (byte)112, 67);
                    NLoginCore_403.var_java_lang_String_arr_b[1] = NLoginCore_575.D("ԷՉծՌԸԵ՚ՙյ՜ղթւոֈ֍Նրհ֏հհվճօՓզպՖ֚֏֘", (byte)112, 68);
                    NLoginCore_403.var_java_lang_String_arr_b[2] = NLoginCore_004.C("ԷՉծՌԸԵ՚ՙյ՜ղթւոֈ֍Նրհ֏հհվճօՓզպՖ֚֏֘", (byte)112, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_403.var_java_lang_String_arr_b[0] = NLoginCore_092.D("ԷՉծՌԸԵ՚ՙյ՜ղթւոֈ֍Նրհ֏հջևի֓խ՗աօՙՓ՘զնՠվ՘ծ֘ճցղ֒խ", (byte)112, 68);
                    NLoginCore_403.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ƑƣǈƦƒƏƴƳǏƶǌǃǜǒǢǧƠǚǊǩǊǘǁƿǃǊƼǰƭǬǕǕǐƳǩǗǒǐƴǝǈǰǼǇ", (byte)112, 66);
                    NLoginCore_403.var_java_lang_String_arr_b[2] = NLoginCore_427.E("՞հ֕ճ՟՜ցր֜փ֙֐ִ֩֟֯խֱֶֽ֧֖֮֗֗֔ն֎ֳּ֪֖֦֗փִփׇׂ׍ַ֤֎֔", (byte)112, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_403.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǀǏǐǙƺƦƴǖƒƾƔǝǁǤƦǅǔǟǅǂƫǗƬǦƮǝǅƽƴƳƾƭ", (byte)112, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_403.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƊǒǙưƧǕƘƱǋƮƾǌƣƱƞƿǐƽƻǖƫǛƲƳ", (byte)112, 65);
                }
            }
        }
    }

    public NLoginCore_403 a(Plugin plugin, long l, long l2, TimeUnit timeUnit) {
        if (this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_403.c("㺀", (int)i, (long)(j ^ k)));
        }
        this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a = plugin.getProxy().getScheduler().schedule(plugin, this.var_java_lang_Runnable_c, l, l2, timeUnit);
        return this;
    }

    NLoginCore_403(NLoginCore_578 NLoginCore_5782, Consumer<NLoginCore_598> consumer) {
        this.ar = new Exception().getStackTrace()[var_int_b].toString();
        this.var_java_lang_Runnable_c = () -> {
            try {
                NLoginCore_5782.b(this);
                consumer.accept(this);
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = (0x400000 >>> 85 | 0x400000 << ~85 + 1) & 0xFFFFFFFF;
        var_int_c = (0 >>> 52 | 0 << -52) & 0xFFFFFFFF;
        d = Long.reverse(-8022389614314102054L);
        e = Long.reverse(0x7A00000000000000L);
        f = (1024 >>> 138 | 1024 << -138) & 0xFFFFFFFF;
        g = Long.reverse(-8022389614314102054L);
        h = Long.reverse(0x7A00000000000000L);
        i = (0x8000000 >>> 218 | 0x8000000 << ~218 + 1) & 0xFFFFFFFF;
        j = Long.reverse(-8022389614314102054L);
        k = Long.reverse(0x7A00000000000000L);
        l = (0x8000000 >>> 59 | 0x8000000 << ~59 + 1) & 0xFFFFFFFF;
        m = (0xC000000 >>> 154 | 0xC000000 << -154) & 0xFFFFFFFF;
        n = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_403.b();
    }

    @Override
    public boolean P() {
        return this.M;
    }

    private static String a(int n, long l) {
        l ^= 0x5EL;
        l ^= 0x389665B72A73F89AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(68 + 1), (byte)(34 + 49), (byte)(40 + 7), (byte)(51 + 16), (byte)(36 + 30), (byte)(60 + 7), (byte)(11 + 36), (byte)(68 + 12), (byte)(34 + 41), (byte)(57 + 10), (byte)(63 + 20), (byte)(51 + 2), (byte)(76 + 4), (byte)(73 + 24), (byte)(23 + 77), 100, (byte)(34 + 71), (byte)(9 + 101), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұ࠶ࡂ࠽ࡉ࠹ࡈ࠯࠲", (byte)63, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_403.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_403 a(Plugin plugin) {
        if (this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_403.c("㺀", (int)var_int_c, (long)(d ^ e)));
        }
        this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a = plugin.getProxy().getScheduler().runAsync(plugin, this.var_java_lang_Runnable_c);
        return this;
    }

    NLoginCore_403(NLoginCore_578 NLoginCore_5782, Runnable runnable) {
        this.ar = new Exception().getStackTrace()[var_int_a].toString();
        this.var_java_lang_Runnable_c = () -> {
            try {
                NLoginCore_5782.b(this);
                runnable.run();
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    @Override
    public <T> T c() {
        return (T)this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a;
    }

    public NLoginCore_403 a(Plugin plugin, long l, TimeUnit timeUnit) {
        if (this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_403.c("㺀", (int)f, (long)(g ^ h)));
        }
        this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a = plugin.getProxy().getScheduler().schedule(plugin, this.var_java_lang_Runnable_c, l, timeUnit);
        return this;
    }

    @Override
    public String t() {
        return this.ar;
    }

    @Override
    public void Z() {
        if (this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a != null) {
            this.var_net_md_5_bungee_api_scheduler_ScheduledTask_a.cancel();
        }
        this.M = l;
    }
}

