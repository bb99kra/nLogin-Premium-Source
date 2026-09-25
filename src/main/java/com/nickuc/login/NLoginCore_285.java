/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_285 {
    private static long h;
    private final long r;
    private static String[] var_java_lang_String_arr_a;
    private static int i;
    private static long k;
    private final Throwable var_java_lang_Throwable_a;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_c;
    private static long var_long_c;
    private static int o;
    private static long var_long_b;
    private static long d;
    private final int X;
    private static int f;
    private static long g;
    private static int n;
    private static int l;
    private final boolean W;
    private static long m;
    private static int j;
    private static long e;

    @Generated
    public String toString() {
        return (String)NLoginCore_285.c("㺀", (int)var_int_a, (long)var_long_b) + this.af() + (String)NLoginCore_285.c("㺃", (int)var_int_c, (long)(d ^ e)) + this.p() + (String)NLoginCore_285.c("㺆", (int)f, (long)(g ^ h)) + this.f() + (String)NLoginCore_285.c("㺉", (int)(i & j), (long)k) + this.a() + (String)NLoginCore_285.c("㺌", (int)l, (long)m);
    }

    @Generated
    public int p() {
        return this.X;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-4336315595795333368L);
        var_int_c = (0x400000 >>> 118 | 0x400000 << -118) & 0xFFFFFFFF;
        d = Long.reverse(7481129826424848136L);
        e = Long.reverse(-6629298651489370112L);
        f = Integer.reverse(0x40000000);
        g = Long.reverse(7481129826424848136L);
        h = Long.reverse(-6629298651489370112L);
        i = Integer.reverse(-1073741824);
        j = (-1 >>> 168 | -1 << ~168 + 1) & 0xFFFFFFFF;
        k = Long.reverse(-4336315595795333368L);
        l = Integer.reverse(0x20000000);
        m = Long.reverse(-4336315595795333368L);
        n = 655360 >>> 17 | 655360 << ~17 + 1;
        o = Integer.reverse(-1610612736);
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_285.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_285.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.D("нџѡсѥ҄ѼҒѾэҋҁҏ҉ђѷҙҘҐҖҐѥ", (byte)32, 68), NLoginCore_285.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒєߘ߇߬ߩߨ߫߇ߴߥߕߖߌߣѭ", (byte)32, 67) + string + NLoginCore_091.E("Ԗ", (byte)32, 69) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x7E507E8F63966229L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(38 + 31), (byte)(68 + 15), (byte)(37 + 10), (byte)(42 + 25), (byte)(10 + 56), (byte)(41 + 26), (byte)(25 + 22), (byte)(79 + 1), (byte)(7 + 68), (byte)(14 + 53), (byte)(11 + 72), (byte)(8 + 45), (byte)(4 + 76), (byte)(59 + 38), (byte)(36 + 64), (byte)(31 + 69), 105, 110, (byte)(46 + 57)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(2 + 81)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ԯԼԻӾԾԺԵԾՉԸԅՃՇՀՃՉԋ࢏ࡾࢣࢠ࢟ࢢࡾࢫ࢜ࢌࢍࢃ࢚", (byte)93, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_285.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public long f() {
        return this.r;
    }

    private static void b() {
        int n;
        var_long_c = 1224844395853007846L;
        long l = var_long_c ^ 0x7E507E8F63966229L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(44 + 25), (byte)(56 + 27), (byte)(37 + 10), (byte)(60 + 7), (byte)(33 + 33), 67, (byte)(28 + 19), (byte)(8 + 72), (byte)(18 + 57), (byte)(29 + 38), 83, (byte)(19 + 34), (byte)(21 + 59), (byte)(18 + 79), (byte)(39 + 61), (byte)(61 + 39), (byte)(104 + 1), (byte)(57 + 53), (byte)(96 + 7)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
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
                    NLoginCore_285.var_java_lang_String_arr_b[0] = NLoginCore_138.F("ԕԹԫԥՌԲԯԮ՜ՔՒԶԷՕԺՖԱԿՈԣԨԤՂՃ՜ճմԼՏԵՊն", (byte)36, 70);
                    NLoginCore_285.var_java_lang_String_arr_b[1] = NLoginCore_387.D("ҋқѤҏ҆ѽҖѶѴҋѵѡҏҖҙ҃ҫѺҌѽ҂ҭѴѵ", (byte)36, 68);
                    NLoginCore_285.var_java_lang_String_arr_b[2] = NLoginCore_324.D("ѳіѤ҇҆ѿҠҏҙѴҡѿҒҔѥѺҜҝѨҋҧ҂ѬѬғґҳҧҵҏҵҢ", (byte)36, 68);
                    NLoginCore_285.var_java_lang_String_arr_b[3] = NLoginCore_138.B("ĬĒęĜÿüēĔĝĩĹŌĬĘĶĥĪĥĐđĿĭĚě", (byte)36, 66);
                    NLoginCore_285.var_java_lang_String_arr_b[4] = NLoginCore_173.C("҃њҌҕѩ҈ѶѲѽғѴѩ", (byte)36, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_285.var_java_lang_String_arr_b[0] = NLoginCore_223.B("üĠĒČĳęĖĕŃĻĹĝĞļġĽĘĦįĊďċĴŊħĦĒĥņőĞĨĞŊłńŢŠŚŠŒĩĶį", (byte)36, 66);
                    NLoginCore_285.var_java_lang_String_arr_b[1] = NLoginCore_387.E("Պ՚ԣՎՅԼՕԵԳՊԵԠԴԴ՛ԡՒՅ՚՞Կ՚դծհէԲՈբՆՃՌ", (byte)36, 69);
                    NLoginCore_285.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ԲԕԣՆՅԾ՟Վ՘ԳՠԾՑՓԤԹ՛՜ԧՊզԽՋԩզԨթ԰Ԯլմթ", (byte)36, 70);
                    NLoginCore_285.var_java_lang_String_arr_b[3] = NLoginCore_091.E("ՅԫԲԵԘԕԬԭԶՂՔՃԟՐՃ՝ՑիԢԽ՞Խ՝եԿ՛եժԱՋյՒ", (byte)36, 69);
                    NLoginCore_285.var_java_lang_String_arr_b[4] = NLoginCore_453.C("ѐѻѥѦїҊѫҖңҖ҄ѩ", (byte)36, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_285.var_java_lang_String_arr_b[0] = NLoginCore_004.F("՘ԖԪԙՑԺԭԽԓԽԳՍ՞՘՘ՖՇԾԢՀՄՄթՌՎԺ՟ղԫ՞թՠ", (byte)36, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_285.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ĨēĭĖģįĎįăĖĴňĦĹņĦĘęŁŎōĝĚě", (byte)36, 65);
                }
            }
        }
    }

    public NLoginCore_285(boolean bl, int n, long l) {
        this(bl, n, l, null);
    }

    @Generated
    public Throwable a() {
        return this.var_java_lang_Throwable_a;
    }

    @Generated
    public boolean af() {
        return this.W;
    }

    @Generated
    public NLoginCore_285(boolean bl, int n, long l, Throwable throwable) {
        this.W = bl;
        this.X = n;
        this.r = l;
        this.var_java_lang_Throwable_a = throwable;
    }
}

