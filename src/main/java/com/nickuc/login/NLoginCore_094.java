/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 *  org.bukkit.scheduler.BukkitTask
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
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
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class NLoginCore_094
implements NLoginCore_598 {
    private static int g;
    private static int s;
    private static long n;
    private static int var_int_c;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static long i;
    private static long o;
    private final Runnable var_java_lang_Runnable_b;
    private static int r;
    private static long l;
    private static int f;
    private static String[] var_java_lang_String_arr_a;
    private static long m;
    private static long h;
    private final boolean L;
    private static long var_long_c;
    private static long q;
    private boolean M;
    private BukkitTask var_org_bukkit_scheduler_BukkitTask_a;
    private static long p;
    private final String an;
    private static int var_int_b;
    private static long j;
    private static int k;
    private static long e;
    private static long d;
    private static int t;

    public NLoginCore_094 a(JavaPlugin javaPlugin, long l, TimeUnit timeUnit) {
        if (javaPlugin.isEnabled()) {
            if (this.var_org_bukkit_scheduler_BukkitTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_094.c("㺀", (int)(f & g), (long)h));
            }
            this.var_org_bukkit_scheduler_BukkitTask_a = this.L ? javaPlugin.getServer().getScheduler().runTaskLaterAsynchronously((Plugin)javaPlugin, this.var_java_lang_Runnable_b, timeUnit.toMillis(l) / i) : javaPlugin.getServer().getScheduler().runTaskLater((Plugin)javaPlugin, this.var_java_lang_Runnable_b, timeUnit.toMillis(l) / j);
        }
        return this;
    }

    public NLoginCore_094 com_nickuc_login_NLoginCore_094_a(JavaPlugin javaPlugin) {
        if (javaPlugin.isEnabled()) {
            if (this.var_org_bukkit_scheduler_BukkitTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_094.c("㺀", (int)var_int_c, (long)(d ^ e)));
            }
            this.var_org_bukkit_scheduler_BukkitTask_a = this.L ? javaPlugin.getServer().getScheduler().runTaskAsynchronously((Plugin)javaPlugin, this.var_java_lang_Runnable_b) : javaPlugin.getServer().getScheduler().runTask((Plugin)javaPlugin, this.var_java_lang_Runnable_b);
        }
        return this;
    }

    private static String a(int n, long l) {
        l ^= 0x2AL;
        l ^= 0x57867455A5052BB7L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(44 + 25), (byte)(73 + 10), (byte)(32 + 15), (byte)(7 + 60), (byte)(63 + 3), (byte)(55 + 12), (byte)(28 + 19), (byte)(76 + 4), 75, (byte)(13 + 54), (byte)(73 + 10), (byte)(11 + 42), (byte)(60 + 20), (byte)(35 + 62), (byte)(80 + 20), (byte)(26 + 74), (byte)(40 + 65), (byte)(16 + 94), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ѵ҂ҁф҄Ҁѻ҄ҏѾы҉ҍ҆҉ҏёߡߢ߭ߙߥߨߢ߳", (byte)31, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_094.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public boolean P() {
        return this.M;
    }

    @Override
    public <T> T c() {
        return (T)this.var_org_bukkit_scheduler_BukkitTask_a;
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0x40000000);
        var_int_c = 0 >>> 100 | 0 << -100;
        d = Long.reverse(-3009994268975215361L);
        e = Long.reverse(0x5400000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = (-1 >>> 203 | -1 << ~203 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-9062832168161161985L);
        i = Long.reverse(0x4C00000000000000L);
        j = Long.reverse(0x4C00000000000000L);
        k = Integer.reverse(0x40000000);
        l = Long.reverse(-3009994268975215361L);
        m = Long.reverse(0x5400000000000000L);
        n = Long.reverse(0x4C00000000000000L);
        o = Long.reverse(0x4C00000000000000L);
        p = Long.reverse(0x4C00000000000000L);
        q = Long.reverse(0x4C00000000000000L);
        r = Integer.reverse(Integer.MIN_VALUE);
        s = (-1073741824 >>> 62 | -1073741824 << -62) & 0xFFFFFFFF;
        t = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_094.b();
    }

    NLoginCore_094(boolean bl, NLoginCore_578 NLoginCore_5782, Consumer<NLoginCore_598> consumer) {
        this.an = new Exception().getStackTrace()[var_int_b].toString();
        this.L = bl;
        this.var_java_lang_Runnable_b = () -> {
            try {
                NLoginCore_5782.b(this);
                consumer.accept(this);
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    public NLoginCore_094 a(JavaPlugin javaPlugin, long l, long l2, TimeUnit timeUnit) {
        if (javaPlugin.isEnabled()) {
            if (this.var_org_bukkit_scheduler_BukkitTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_094.c("㺀", (int)k, (long)(NLoginCore_094.l ^ m)));
            }
            this.var_org_bukkit_scheduler_BukkitTask_a = this.L ? javaPlugin.getServer().getScheduler().runTaskTimerAsynchronously((Plugin)javaPlugin, this.var_java_lang_Runnable_b, timeUnit.toMillis(l) / n, timeUnit.toMillis(l2) / o) : javaPlugin.getServer().getScheduler().runTaskTimer((Plugin)javaPlugin, this.var_java_lang_Runnable_b, timeUnit.toMillis(l) / p, timeUnit.toMillis(l2) / q);
        }
        return this;
    }

    static void void_a(JavaPlugin javaPlugin) {
        javaPlugin.getServer().getScheduler().cancelTasks((Plugin)javaPlugin);
    }

    @Override
    public void Z() {
        if (this.var_org_bukkit_scheduler_BukkitTask_a != null) {
            this.var_org_bukkit_scheduler_BukkitTask_a.cancel();
        }
        this.M = r;
    }

    private static void b() {
        int n;
        var_long_c = -57803872846324629L;
        long l = var_long_c ^ 0x57867455A5052BB7L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(34 + 35), (byte)(2 + 81), (byte)(42 + 5), 67, (byte)(6 + 60), (byte)(18 + 49), 47, (byte)(26 + 54), (byte)(66 + 9), (byte)(3 + 64), (byte)(48 + 35), (byte)(13 + 40), (byte)(5 + 75), (byte)(80 + 17), (byte)(65 + 35), (byte)(40 + 60), (byte)(13 + 92), (byte)(4 + 106), (byte)(37 + 66)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(25 + 58)}, StandardCharsets.UTF_8));
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
                    NLoginCore_094.var_java_lang_String_arr_b[0] = NLoginCore_138.A("÷ĤĉėúĎüĘĘĒĎēāġıāĄĿĦĺČĦŋĤİıĞĠĩŅĲŊ", (byte)33, 65);
                    NLoginCore_094.var_java_lang_String_arr_b[1] = NLoginCore_223.E("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨՂէՀՌՍԺԼՅաՎզ", (byte)33, 69);
                    NLoginCore_094.var_java_lang_String_arr_b[2] = NLoginCore_091.B("÷ĤĉėúĎüĘĘĒĎēāġıāĄĿĦĺČĦŋĤİıĞĠĩŅĲŊ", (byte)33, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_094.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨԽ՚ԸՖԽԮ՛աձկՇԾԷԳՎՖՆՌՏԼղվՅ", (byte)33, 70);
                    NLoginCore_094.var_java_lang_String_arr_b[1] = NLoginCore_453.F("ԓՀԥԳԖԪԘԴԴԮԪԯԝԽՍԝԠ՛ՂՖԨԴ՗ԶՁԪհՃԮՓԿաՓՒնղԬՈինՐԵծՅ", (byte)33, 70);
                    NLoginCore_094.var_java_lang_String_arr_b[2] = NLoginCore_076.D("юѻѠѮёѥѓѯѯѩѥѪјѸ҈јћҖѽґѣѵѾҨҥѡҫ҃ѹҢҊқҌҢѭѿѳѲҗѮ҂҈ѲҀ", (byte)33, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_094.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ѽҍѫѠҏэѶђѬҚҍѠ", (byte)33, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_094.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ðąĮúüĈĈŁĖľĔĉ", (byte)33, 66);
                }
            }
        }
    }

    NLoginCore_094(boolean bl, NLoginCore_578 NLoginCore_5782, Runnable runnable) {
        this.an = new Exception().getStackTrace()[var_int_a].toString();
        this.L = bl;
        this.var_java_lang_Runnable_b = () -> {
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
    public String t() {
        return this.an;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_094.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.A("ŅŧũŉŭƌƄƚƆŕƓƉƗƑŚſơƠƘƞƘŭ", (byte)79, 65), NLoginCore_094.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.D("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡱࡲࡽࡩࡵࡸࡲࢃӵ", (byte)79, 68) + string + NLoginCore_559.A("ŗ", (byte)79, 65) + methodType.toString(), exception);
        }
    }
}

