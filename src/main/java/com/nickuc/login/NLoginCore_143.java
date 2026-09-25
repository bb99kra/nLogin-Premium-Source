/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_316;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_143
implements NLoginCore_249 {
    private static float w;
    private static long u;
    private static int n;
    private static int var_int_a;
    private static long l;
    private static int aa;
    private final NLoginCore_211 W;
    private static long v;
    private static int z;
    private static int f;
    private static int t;
    private static int q;
    private static int k;
    private static int g;
    private static int e;
    private static long c;
    private static long var_long_b;
    private static long m;
    private static long d;
    private static int o;
    private static int i;
    private static String[] var_java_lang_String_arr_b;
    private static float x;
    private static int s;
    private static String[] var_java_lang_String_arr_a;
    private static int h;
    private static long p;
    private static long j;
    private static int r;
    private static int ab;
    private static int y;
    private static int ac;

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_495_a().p() && !NLoginCore_277.i((String)NLoginCore_143.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))) ? e : f) != 0;
    }

    @Generated
    public NLoginCore_143(NLoginCore_211 NLoginCore_211) {
        this.W = NLoginCore_211;
    }

    private static void b() {
        int n;
        c = -478994485135523982L;
        long l = c ^ 0xF182F343E12F5A9DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(36 + 33), 83, (byte)(37 + 10), 67, (byte)(16 + 50), (byte)(20 + 47), (byte)(39 + 8), (byte)(23 + 57), (byte)(44 + 31), (byte)(19 + 48), (byte)(19 + 64), (byte)(40 + 13), (byte)(16 + 64), (byte)(49 + 48), (byte)(49 + 51), (byte)(79 + 21), (byte)(81 + 24), (byte)(55 + 55), (byte)(78 + 25)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(39 + 30), (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
                    NLoginCore_143.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ŘœŖĽĵŘĸľŰűŦśŏűĬŘŁőłűļŻłŃ", (byte)56, 66);
                    NLoginCore_143.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ŘœŖĽĵŘĸľŰűŦśŏűĬŘŁőłűļŻłŃ", (byte)56, 65);
                    NLoginCore_143.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ĽŃŇĺŘĸŧōōĩıķ", (byte)56, 65);
                    NLoginCore_143.var_java_lang_String_arr_b[3] = NLoginCore_092.A("ŚğĸřŕĹĺŦŨĭĭķ", (byte)56, 65);
                    NLoginCore_143.var_java_lang_String_arr_b[4] = NLoginCore_201.E("՝՘՛ՂԺ՝ԽՃյնիՠՔնԱ՝ՆՖՇնՁրՇՈ", (byte)56, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_143.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ӆӁӄҫңӆҦҬӞӟӔҜӋӔҬҥӧҦӝҢӜҳҰұ", (byte)56, 67);
                    NLoginCore_143.var_java_lang_String_arr_b[1] = NLoginCore_451.A("ŘœŖĽĵŘĸľŰűŤœŊĵŧŧŴūŧĸőŻłŃ", (byte)56, 65);
                    NLoginCore_143.var_java_lang_String_arr_b[2] = NLoginCore_446.E("ԦԠթժՠՌձԴճ԰ՌՌնՑըզյ՝խԹԻհՇՈ", (byte)56, 69);
                    NLoginCore_143.var_java_lang_String_arr_b[3] = NLoginCore_173.A("ĸĥşśĸĥķĮŅĺŰŧőŴŅĳœŔĸŉŉŕłŃ", (byte)56, 65);
                    NLoginCore_143.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ӆӁӄҫңӆҦҬӞӟӓӜӝҜӢҽӚҵұӞӝәҰұ", (byte)56, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_143.var_java_lang_String_arr_b[0] = NLoginCore_138.F("Խ՜ԥԾԹ՟ԯԲղճՂԴԹծթԵ՗Վկռջ՚ՇՈ", (byte)56, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_143.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ŐńġĴĤŀŦŗūōłķ", (byte)56, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x13L;
        l ^= 0xF182F343E12F5A9DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(8 + 75), (byte)(4 + 43), (byte)(38 + 29), (byte)(46 + 20), (byte)(10 + 57), (byte)(39 + 8), (byte)(71 + 9), (byte)(14 + 61), (byte)(41 + 26), (byte)(13 + 70), (byte)(22 + 31), (byte)(9 + 71), (byte)(54 + 43), 100, (byte)(12 + 88), (byte)(18 + 87), (byte)(95 + 15), (byte)(44 + 59)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(59 + 24)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.E("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼࡴࡸࢎࢅ࢙࡮ࡷࢇࡩ࢛ࢉ࢑࢝࢕࢖", (byte)1, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_143.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
    }

    @Override
    public boolean au() {
        return s != 0;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_b();
        if (NLoginCore_0552 == null || NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_d) {
            NLoginCore_0552 = NLoginCore_150.c();
        }
        NLoginCore_150.a(NLoginType_008, NLoginCore_0552);
        NLoginCore_316 NLoginCore_3162 = NLoginCore_150.a(NLoginCore_0552);
        Object[] objectArray = new Object[g];
        objectArray[NLoginCore_143.h] = NLoginCore_143.c("㺀", (int)i, (long)j);
        List<String> list = NLoginCore_3162.a(NLoginCore_397.var_com_nickuc_login_NLoginCore_237_d, objectArray);
        NLoginInterface_0242.a(String.join((CharSequence)NLoginCore_143.c("㺃", (int)k, (long)(l ^ m)), list).replace((CharSequence)NLoginCore_143.c("㺆", (int)(n & o), (long)p), NLoginCore_277.getName()));
        AtomicInteger atomicInteger = new AtomicInteger();
        NLoginType_008.b(q != 0).a((NLoginCore_598 NLoginInterface_0482) -> {
            if (!NLoginCore_277.R() || !this.boolean_a(NLoginCore_5092)) {
                NLoginInterface_0482.Z();
                return;
            }
            NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            if (NLoginCore_5012 == null) {
                NLoginInterface_0482.Z();
                return;
            }
            if (NLoginCore_277.i((String)NLoginCore_143.c("㺀", (int)t, (long)(u ^ v)))) {
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n, NLoginCore_5012.com_nickuc_login_NLoginCore_501_a());
                NLoginInterface_0482.Z();
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_119.C, w, x);
                this.b(NLoginType_008, NLoginCore_277, NLoginCore_5092);
                return;
            }
            if (atomicInteger.incrementAndGet() >= y) {
                atomicInteger.set(z);
                NLoginCore_3162.a(NLoginCore_508.var_com_nickuc_login_NLoginCore_508_m).a(NLoginCore_277, new Object[aa]);
            }
        }, 1L, 1L, TimeUnit.SECONDS);
        return new GUIButtonContainer[r];
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.W;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_143.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.F("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)49, 70), NLoginCore_143.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҘҜҲҩҽҒқҫҍҿҭҵӁҹҺĻ", (byte)49, 65) + string + NLoginCore_076.C("҂", (byte)49, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 190 | 0 << ~190 + 1;
        var_long_b = Long.reverse(5691428554653457055L);
        d = Long.reverse(-4035225266123964416L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (0 >>> 234 | 0 << ~234 + 1) & 0xFFFFFFFF;
        g = 16 >>> 164 | 16 << -164;
        h = 0 >>> 232 | 0 << ~232 + 1;
        i = 16384 >>> 14 | 16384 << -14;
        j = Long.reverse(-8720090252932130145L);
        k = Integer.reverse(0x40000000);
        l = Long.reverse(5691428554653457055L);
        m = Long.reverse(-4035225266123964416L);
        n = Integer.reverse(-1073741824);
        o = (-1 >>> 92 | -1 << -92) & 0xFFFFFFFF;
        p = Long.reverse(-8720090252932130145L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(0);
        s = Integer.reverse(0);
        t = (0x8000000 >>> 57 | 0x8000000 << ~57 + 1) & 0xFFFFFFFF;
        u = Long.reverse(5691428554653457055L);
        v = Long.reverse(-4035225266123964416L);
        w = Float.intBitsToFloat(Integer.reverse(3714));
        x = Float.intBitsToFloat(257 >>> 170 | 257 << ~170 + 1);
        y = Integer.reverse(0x28000000);
        z = Integer.reverse(0);
        aa = Integer.reverse(0);
        ab = Integer.reverse(-1610612736);
        ac = Integer.reverse(-1610612736);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        NLoginCore_143.b();
    }
}

