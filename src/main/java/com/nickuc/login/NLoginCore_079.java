/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.ScheduledTask
 *  javax.annotation.Nullable
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class NLoginCore_079
implements NLoginCore_598 {
    private static long d;
    private final boolean O;
    private static int r;
    private static int s;
    private static long i;
    private static String[] var_java_lang_String_arr_a;
    private static long e;
    private static long g;
    private static long q;
    private static int var_int_c;
    private static int k;
    private ScheduledTask var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a;
    private static long l;
    @Nullable
    private final Player var_org_bukkit_entity_Player_c;
    private static int t;
    private static String[] var_java_lang_String_arr_b;
    private final Consumer<ScheduledTask> var_java_util_function_Consumer_io_papermc_paper_threadedregions_scheduler_ScheduledTask__a;
    private boolean M;
    private static long h;
    private static long j;
    private final String ao;
    private static int f;
    private static int var_int_b;
    private static int var_int_a;
    private static long var_long_c;
    private static long n;
    private static long p;
    private static long o;
    private static long m;

    @Override
    public <T> T c() {
        return (T)this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_079.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.B("ŃťŧŇūƊƂƘƄœƑƇƕƏŘŽƟƞƖƜƖū", (byte)78, 66), NLoginCore_079.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.A("žƋƊōƍƉƄƍƘƇŔƒƖƏƒƘŚӳӵӨӭӣӪӦӫӗӽӭű", (byte)78, 65) + string + NLoginCore_091.D("ә", (byte)78, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1DL;
        l ^= 0x7E89A8A1EC987751L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), 69, (byte)(49 + 34), 47, (byte)(59 + 8), (byte)(21 + 45), (byte)(29 + 38), (byte)(14 + 33), (byte)(29 + 51), (byte)(31 + 44), (byte)(66 + 1), (byte)(79 + 4), (byte)(26 + 27), (byte)(63 + 17), (byte)(49 + 48), (byte)(16 + 84), (byte)(26 + 74), (byte)(22 + 83), (byte)(38 + 72), (byte)(69 + 34)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(39 + 30), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.C("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕї߲߰ߥߪߠߧߣߨߔߺߪ", (byte)33, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_079.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_079 a(JavaPlugin javaPlugin, long l, long l2, TimeUnit timeUnit) {
        if (javaPlugin.isEnabled()) {
            if (this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_079.c("㺀", (int)k, (long)(NLoginCore_079.l ^ m)));
            }
            this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a = this.var_org_bukkit_entity_Player_c != null ? this.var_org_bukkit_entity_Player_c.getScheduler().runAtFixedRate((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, () -> this.var_java_lang_String_arr_a.accept(null), timeUnit.toMillis(l) / n, timeUnit.toMillis(l2) / o) : (this.O ? Bukkit.getAsyncScheduler().runAtFixedRate((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, l, l2, timeUnit) : Bukkit.getGlobalRegionScheduler().runAtFixedRate((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, timeUnit.toMillis(l) / p, timeUnit.toMillis(l2) / q));
        }
        return this;
    }

    @Override
    public String t() {
        return this.ao;
    }

    @Override
    public void Z() {
        if (this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a != null) {
            this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a.cancel();
        }
        this.M = r;
    }

    static void void_a(JavaPlugin javaPlugin) {
        Bukkit.getAsyncScheduler().cancelTasks((Plugin)javaPlugin);
        Bukkit.getGlobalRegionScheduler().cancelTasks((Plugin)javaPlugin);
    }

    @Override
    public boolean P() {
        return this.M;
    }

    public NLoginCore_079 com_nickuc_login_NLoginCore_079_a(JavaPlugin javaPlugin) {
        if (javaPlugin.isEnabled()) {
            if (this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_079.c("㺀", (int)var_int_c, (long)(d ^ e)));
            }
            this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a = this.var_org_bukkit_entity_Player_c != null ? this.var_org_bukkit_entity_Player_c.getScheduler().run((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, () -> this.var_java_lang_String_arr_a.accept(null)) : (this.O ? Bukkit.getAsyncScheduler().runNow((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a) : Bukkit.getGlobalRegionScheduler().run((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a));
        }
        return this;
    }

    private static void b() {
        int n;
        var_long_c = -3884199223645152313L;
        long l = var_long_c ^ 0x7E89A8A1EC987751L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(53 + 16), (byte)(55 + 28), (byte)(39 + 8), (byte)(42 + 25), (byte)(4 + 62), 67, (byte)(23 + 24), (byte)(73 + 7), (byte)(32 + 43), (byte)(5 + 62), (byte)(30 + 53), (byte)(2 + 51), (byte)(50 + 30), 97, (byte)(9 + 91), (byte)(21 + 79), (byte)(61 + 44), (byte)(93 + 17), (byte)(73 + 30)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_079.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ՂՅաճԫՅՌՕՓՏԯՇ՗ԹհՌ՘ՐՉՎՀԶզՆՃ՘Ֆդսյդ՝", (byte)58, 69);
                    NLoginCore_079.var_java_lang_String_arr_b[1] = NLoginCore_138.B("ĿłŞŰĨłŉŒŐŌĬńŔĶŭŉŕōņŋĽĳţŃŀŕœšźŲšŚ", (byte)58, 66);
                    NLoginCore_079.var_java_lang_String_arr_b[2] = NLoginCore_387.E("ՂՅաճԫՅՌՕՓՏԯՇ՗ԹհՌ՘ՐՉՎՀԶզՆՃ՘Ֆդսյդ՝", (byte)58, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_079.var_java_lang_String_arr_b[0] = NLoginCore_138.C("үҲӎӠҘҲҹӂӀҼҜҴӄҦӝҹӅҽҶһҭұӆӝӴҳӆӠӴӤӢӶӖӴӴҸӏӯӱӯӭӼӰӋ", (byte)58, 67);
                    NLoginCore_079.var_java_lang_String_arr_b[1] = NLoginCore_110.E("ՂՅաճԫՅՌՕՓՏԯՇ՗ԹհՌ՘ՐՉՎՀԺգւԽքժց՘քսՈծի֋տ՞ծ֍֏֐ՕՔ՞", (byte)58, 69);
                    NLoginCore_079.var_java_lang_String_arr_b[2] = NLoginCore_384.C("үҲӎӠҘҲҹӂӀҼҜҴӄҦӝҹӅҽҶһҭүҼӳҦӪӈҩӣӭӕӭӗӹӧҽӷӠӶһӯҷӰӋ", (byte)58, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_079.var_java_lang_String_arr_b[0] = NLoginCore_138.B("īŅŧřĻŏŞųŵŕıŇņŘŏĶźĶśĵŉŉņŇ", (byte)58, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_079.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ғҲҨӑӠӢӐҕҰқӗӠҧӉҾӋӊҦҧӇҾӯҶҷ", (byte)58, 68);
                }
            }
        }
    }

    NLoginCore_079(@Nullable Player player, boolean bl, NLoginCore_578 NLoginCore_5782, Consumer<NLoginCore_598> consumer) {
        this.ao = new Exception().getStackTrace()[var_int_b].toString();
        this.O = bl;
        this.var_org_bukkit_entity_Player_c = player;
        this.var_java_lang_String_arr_a = scheduledTask -> {
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
        var_int_b = Integer.reverse(0x40000000);
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-2028287012880967597L);
        e = Long.reverse(-5188146770730811392L);
        f = (512 >>> 105 | 512 << -105) & 0xFFFFFFFF;
        g = Long.reverse(-2028287012880967597L);
        h = Long.reverse(-5188146770730811392L);
        i = Long.reverse(0x4C00000000000000L);
        j = Long.reverse(0x4C00000000000000L);
        k = Integer.reverse(0x40000000);
        l = Long.reverse(-2028287012880967597L);
        m = Long.reverse(-5188146770730811392L);
        n = Long.reverse(0x4C00000000000000L);
        o = Long.reverse(0x4C00000000000000L);
        p = Long.reverse(0x4C00000000000000L);
        q = Long.reverse(0x4C00000000000000L);
        r = (4096 >>> 108 | 4096 << -108) & 0xFFFFFFFF;
        s = 24 >>> 99 | 24 << ~99 + 1;
        t = (0x180000 >>> 115 | 0x180000 << ~115 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_079.b();
    }

    NLoginCore_079(@Nullable Player player, boolean bl, NLoginCore_578 NLoginCore_5782, Runnable runnable) {
        this.ao = new Exception().getStackTrace()[var_int_a].toString();
        this.O = bl;
        this.var_org_bukkit_entity_Player_c = player;
        this.var_java_lang_String_arr_a = scheduledTask -> {
            try {
                NLoginCore_5782.b(this);
                runnable.run();
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    public NLoginCore_079 a(JavaPlugin javaPlugin, long l, TimeUnit timeUnit) {
        if (javaPlugin.isEnabled()) {
            if (this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a != null) {
                throw new IllegalStateException((String)NLoginCore_079.c("㺀", (int)f, (long)(g ^ h)));
            }
            this.var_io_papermc_paper_threadedregions_scheduler_ScheduledTask_a = this.var_org_bukkit_entity_Player_c != null ? this.var_org_bukkit_entity_Player_c.getScheduler().runDelayed((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, () -> this.var_java_lang_String_arr_a.accept(null), timeUnit.toMillis(l) / i) : (this.O ? Bukkit.getAsyncScheduler().runDelayed((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, l, timeUnit) : Bukkit.getGlobalRegionScheduler().runDelayed((Plugin)javaPlugin, (Consumer)this.var_java_lang_String_arr_a, timeUnit.toMillis(l) / j));
        }
        return this;
    }
}

