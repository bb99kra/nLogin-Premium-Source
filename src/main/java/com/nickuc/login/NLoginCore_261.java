/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.VelocityLoader
 *  com.velocitypowered.api.scheduler.ScheduledTask
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_578;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.velocitypowered.api.scheduler.ScheduledTask;
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
import lombok.Generated;

public class NLoginCore_261
implements NLoginCore_598 {
    private boolean M;
    private final String bT;
    private static int var_int_b;
    private static long var_long_d;
    private static long var_long_c;
    private static int j;
    private static long i;
    private static long g;
    private final Runnable var_java_lang_Runnable_d;
    private static int l;
    private static String[] var_java_lang_String_arr_b;
    private static String[] var_java_lang_String_arr_a;
    private ScheduledTask var_com_velocitypowered_api_scheduler_ScheduledTask_a;
    private static long e;
    private static int var_int_c;
    private static int var_int_a;
    private static int k;
    private static int f;
    private static int h;

    @Override
    public String t() {
        return this.bT;
    }

    @Override
    public <T> T c() {
        return (T)this.var_com_velocitypowered_api_scheduler_ScheduledTask_a;
    }

    @Override
    public boolean P() {
        return this.M;
    }

    @Generated
    NLoginCore_261(Runnable runnable, String string) {
        this.var_java_lang_Runnable_d = runnable;
        this.bT = string;
    }

    public NLoginCore_261 a(VelocityLoader velocityLoader) {
        if (this.var_com_velocitypowered_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_261.c("㺀", (int)var_int_c, (long)(var_long_d ^ e)));
        }
        this.var_com_velocitypowered_api_scheduler_ScheduledTask_a = velocityLoader.getServer().getScheduler().buildTask((Object)velocityLoader, this.var_java_lang_Runnable_d).schedule();
        return this;
    }

    private static String a(int n, long l) {
        l ^= 0x65L;
        l ^= 0xB05AF2E99D58931AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(55 + 14), (byte)(26 + 57), (byte)(25 + 22), (byte)(14 + 53), (byte)(10 + 56), (byte)(32 + 35), (byte)(39 + 8), (byte)(79 + 1), (byte)(30 + 45), (byte)(36 + 31), (byte)(49 + 34), 53, (byte)(44 + 36), (byte)(88 + 9), (byte)(83 + 17), (byte)(78 + 22), (byte)(9 + 96), (byte)(11 + 99), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.F("թնյԸոմկոփղԿսցպսփՅ࣓࣒࣓ࣝࣟࣙࣜࣙࣟࣔ࣪ࣗࣜ࣢", (byte)74, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_261.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0x40000000);
        var_int_b = Integer.reverse(0x40000000);
        var_int_c = 0 >>> 244 | 0 << -244;
        var_long_d = Long.reverse(1515893292477510530L);
        e = Long.reverse(-6485183463413514240L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(-5545750923239427198L);
        h = Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1;
        i = Long.reverse(-5545750923239427198L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (3072 >>> 106 | 3072 << -106) & 0xFFFFFFFF;
        l = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_261.b();
    }

    private static void b() {
        int n;
        var_long_c = 4742046313205567656L;
        long l = var_long_c ^ 0xB05AF2E99D58931AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(54 + 15), (byte)(48 + 35), (byte)(41 + 6), (byte)(30 + 37), (byte)(19 + 47), (byte)(42 + 25), (byte)(7 + 40), (byte)(45 + 35), 75, (byte)(51 + 16), (byte)(5 + 78), (byte)(27 + 26), (byte)(56 + 24), (byte)(95 + 2), (byte)(78 + 22), (byte)(51 + 49), (byte)(46 + 59), (byte)(49 + 61), (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_261.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ՉԫԪՋՃ՗ԴԚԲՁ՘Ԣ՝աաՔԱԶՂԪ՗՞՚՝ԯլԩՇՑՒՑԯ", (byte)99, 67);
                    NLoginCore_261.var_java_lang_String_arr_b[1] = NLoginCore_451.E("֊լի֌ք֘յ՛ճւ֙գ֢֢֞֕ղշփի֛֘֟֞հ֭ժֈ֒֓֒հ", (byte)99, 69);
                    NLoginCore_261.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǅǁǄƖǓƐƮƸƹƸƖ", (byte)99, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_261.var_java_lang_String_arr_b[0] = NLoginCore_451.B("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǁǆƧǌƿƤƏƫƻƧƙƴƽǙƹƞǄƜǅƵǟƟƭ", (byte)99, 66);
                    NLoginCore_261.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǃƲưƍƤƮƴǒǅƧƴǋǚǉƝǜƚƖƶǦǑƣƭ", (byte)99, 65);
                    NLoginCore_261.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ưƒƑƲƪƾƛƁƙƨƿƉǄǈǈƻƘƝƩƑƾǉƊǖƪǕƯƓǃƚǕǒ", (byte)99, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_261.var_java_lang_String_arr_b[0] = NLoginCore_387.A("ŽƮƀƮƣƑżƍƓƛơƝƿǋƪǎƅƗƹƊƩƫƘƙ", (byte)99, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_261.var_java_lang_String_arr_b[0] = NLoginCore_324.F("֖ղձոո֔֎֙՝֒ղ֛֚ջևց֕֓ջ֪֠յղճ", (byte)99, 70);
                }
            }
        }
    }

    public NLoginCore_261 a(VelocityLoader velocityLoader, long l, long l2, TimeUnit timeUnit) {
        if (this.var_com_velocitypowered_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_261.c("㺀", (int)h, (long)i));
        }
        this.var_com_velocitypowered_api_scheduler_ScheduledTask_a = velocityLoader.getServer().getScheduler().buildTask((Object)velocityLoader, this.var_java_lang_Runnable_d).delay(l, timeUnit).repeat(l2, timeUnit).schedule();
        return this;
    }

    @Override
    public void Z() {
        if (this.var_com_velocitypowered_api_scheduler_ScheduledTask_a != null) {
            this.var_com_velocitypowered_api_scheduler_ScheduledTask_a.cancel();
        }
        this.M = j;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_261.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.F("ӪԌԎӮԒԱԩԿԫӺԸԮԼԶӿԤՆՅԽՃԽԒ", (byte)6, 70), NLoginCore_261.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("îûú½ýùôýĈ÷ÄĂĆÿĂĈÊѢјѤўѡўїѤјљѯќѡѧä", (byte)6, 65) + string + NLoginCore_324.E("Ӽ", (byte)6, 69) + methodType.toString(), exception);
        }
    }

    NLoginCore_261(NLoginCore_578 NLoginCore_5782, Consumer<NLoginCore_598> consumer) {
        this.bT = new Exception().getStackTrace()[var_int_b].toString();
        this.var_java_lang_Runnable_d = () -> {
            try {
                NLoginCore_5782.b(this);
                consumer.accept(this);
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    NLoginCore_261(NLoginCore_578 NLoginCore_5782, Runnable runnable) {
        this.bT = new Exception().getStackTrace()[var_int_a].toString();
        this.var_java_lang_Runnable_d = () -> {
            try {
                NLoginCore_5782.b(this);
                runnable.run();
            }
            finally {
                NLoginCore_5782.c(this);
            }
        };
    }

    public NLoginCore_261 a(VelocityLoader velocityLoader, long l, TimeUnit timeUnit) {
        if (this.var_com_velocitypowered_api_scheduler_ScheduledTask_a != null) {
            throw new IllegalStateException((String)NLoginCore_261.c("㺀", (int)f, (long)g));
        }
        this.var_com_velocitypowered_api_scheduler_ScheduledTask_a = velocityLoader.getServer().getScheduler().buildTask((Object)velocityLoader, this.var_java_lang_Runnable_d).delay(l, timeUnit).schedule();
        return this;
    }
}

