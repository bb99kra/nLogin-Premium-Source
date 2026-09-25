/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.types.Location
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.types.Location;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
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

public class NLoginCore_457
implements Location {
    private static long n;
    private static long q;
    private final double var_double_b;
    private static long p;
    private static int g;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private final double var_double_c;
    private static String[] var_java_lang_String_arr_b;
    private static int m;
    private static long k;
    private static int r;
    private final double var_double_a;
    private static int var_int_b;
    private static long h;
    private final float var_float_b;
    private static long var_long_c;
    private static long i;
    private static int var_int_j;
    private static int e;
    private static long f;
    private static int v;
    private static long d;
    private static int o;
    private static long t;
    private static long s;
    private final float var_float_a;
    private static long l;
    private static int u;
    private final String var_java_lang_String_j;

    @Generated
    public double getX() {
        return this.var_double_a;
    }

    private static String a(int n, long l) {
        l ^= 0x17L;
        l ^= 0xE00B444B2129BBABL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(46 + 23), (byte)(30 + 53), (byte)(7 + 40), (byte)(7 + 60), (byte)(64 + 2), (byte)(19 + 48), (byte)(37 + 10), (byte)(38 + 42), (byte)(37 + 38), 67, 83, (byte)(49 + 4), (byte)(74 + 6), (byte)(31 + 66), (byte)(35 + 65), (byte)(78 + 22), (byte)(98 + 7), (byte)(59 + 51), (byte)(99 + 4)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(53 + 16), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.C("Պ՗ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦࢫࢭࢮ࢖ࢲࢥࣄࢳࢠ࢜", (byte)102, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_457.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_457.c("㺀", (int)(var_int_a & var_int_b), (long)d) + this.getWorldName() + (String)NLoginCore_457.c("㺃", (int)e, (long)f) + this.getX() + (String)NLoginCore_457.c("㺆", (int)g, (long)(h ^ i)) + this.getY() + (String)NLoginCore_457.c("㺉", (int)var_int_j, (long)(k ^ l)) + this.getZ() + (String)NLoginCore_457.c("㺌", (int)m, (long)n) + this.getYaw() + (String)NLoginCore_457.c("㺏", (int)o, (long)(p ^ q)) + this.getPitch() + (String)NLoginCore_457.c("㺒", (int)r, (long)(s ^ t));
    }

    @Generated
    public String getWorldName() {
        return this.var_java_lang_String_j;
    }

    @Generated
    public double getZ() {
        return this.var_double_c;
    }

    private static void b() {
        int n;
        var_long_c = -7023063568385809236L;
        long l = var_long_c ^ 0xE00B444B2129BBABL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(35 + 34), (byte)(17 + 66), (byte)(44 + 3), (byte)(45 + 22), (byte)(54 + 12), (byte)(39 + 28), 47, (byte)(54 + 26), 75, (byte)(3 + 64), (byte)(82 + 1), (byte)(47 + 6), (byte)(8 + 72), (byte)(42 + 55), (byte)(5 + 95), (byte)(35 + 65), (byte)(81 + 24), (byte)(80 + 30), (byte)(66 + 37)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
                    NLoginCore_457.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ӝұңӞҴӡӏӚӑңұӟұӴҶҵӆөӍұӱәӚҵӀӒӲӰԂӱԂӶ", (byte)62, 68);
                    NLoginCore_457.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ӗұҶҨҷӅҩҮҿӄӎҷ", (byte)62, 67);
                    NLoginCore_457.var_java_lang_String_arr_b[2] = NLoginCore_453.F("ԬԦժագՐղէՆժ՝Ղ", (byte)62, 70);
                    NLoginCore_457.var_java_lang_String_arr_b[3] = NLoginCore_384.E("ծՅըբԱՂՋմՆճԸՂ", (byte)62, 69);
                    NLoginCore_457.var_java_lang_String_arr_b[4] = NLoginCore_004.B("ŦľłŕŶŋŪŇœŭŨŃ", (byte)62, 66);
                    NLoginCore_457.var_java_lang_String_arr_b[5] = NLoginCore_138.A("ŴŋšŤŒłŖűźũŕůŀŪļőťłŝůźšŎŏ", (byte)62, 65);
                    NLoginCore_457.var_java_lang_String_arr_b[6] = NLoginCore_027.B("ĮŶŨĩŅœťŰŪĳŖŃ", (byte)62, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_457.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ũĽįŪŀŭśŦŝįĽūĽƀłŁŒŵřĽŽűŝŉŵŪŗŬŬŭőůƇƌŎŒƔœƛŚƎŮƈţ", (byte)62, 66);
                    NLoginCore_457.var_java_lang_String_arr_b[1] = NLoginCore_223.E("ՅԬԱՁհՆէՉՍղՙՂ", (byte)62, 69);
                    NLoginCore_457.var_java_lang_String_arr_b[2] = NLoginCore_076.E("ՂԲՔմԿԯպխՌՊչտ՛Զ՛հծՠցՑֈՠՍՎ", (byte)62, 69);
                    NLoginCore_457.var_java_lang_String_arr_b[3] = NLoginCore_324.D("ӆӨәҵңҶӇҦӘӧӆҷ", (byte)62, 68);
                    NLoginCore_457.var_java_lang_String_arr_b[4] = NLoginCore_427.F("ՈԾՍըՍՔաթՓԮԸՕՇսՑչՐտՄնքֆՍՎ", (byte)62, 70);
                    NLoginCore_457.var_java_lang_String_arr_b[5] = NLoginCore_091.C("ӨҿӕӘӆҶӊӥӮӝӆӊөөӏұӹӌӓӫӗӻӂӃ", (byte)62, 67);
                    NLoginCore_457.var_java_lang_String_arr_b[6] = NLoginCore_091.F("ԯիզլ՗ղՏոհՒշՂ", (byte)62, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_457.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ŅĬŦŃŠŖŬśŎŬżŃ", (byte)62, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_457.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ӅӅҵҽӠӕӨҫҩӉұӨӂӈҮӤӰҸӳҭӷӫӂӃ", (byte)62, 68);
                }
            }
        }
    }

    @Generated
    public double getY() {
        return this.var_double_b;
    }

    static {
        var_int_a = 0 >>> 179 | 0 << ~179 + 1;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-2511312255429602951L);
        e = 32768 >>> 207 | 32768 << -207;
        f = Long.reverse(-2511312255429602951L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(3829756019908055417L);
        i = Long.reverse(-1729382256910270464L);
        var_int_j = (24 >>> 131 | 24 << ~131 + 1) & 0xFFFFFFFF;
        k = Long.reverse(3829756019908055417L);
        l = Long.reverse(-1729382256910270464L);
        m = Integer.reverse(0x20000000);
        n = Long.reverse(-2511312255429602951L);
        o = Integer.reverse(-1610612736);
        p = Long.reverse(3829756019908055417L);
        q = Long.reverse(-1729382256910270464L);
        r = (384 >>> 70 | 384 << ~70 + 1) & 0xFFFFFFFF;
        s = Long.reverse(3829756019908055417L);
        t = Long.reverse(-1729382256910270464L);
        u = Integer.reverse(-536870912);
        v = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[u];
        var_java_lang_String_arr_b = new String[v];
        NLoginCore_457.b();
    }

    @Generated
    public float getPitch() {
        return this.var_float_b;
    }

    @Generated
    public NLoginCore_457(String string, double d, double d2, double d3, float f, float f2) {
        this.var_java_lang_String_j = string;
        this.var_double_a = d;
        this.var_double_b = d2;
        this.var_double_c = d3;
        this.var_float_a = f;
        this.var_float_b = f2;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_457.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.D("ՑճյՕչ֘֐֦֒ա֣֟֕֝զ֋֤֪֤֭֬չ", (byte)124, 68), NLoginCore_457.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.A("ǚǧǦƩǩǥǠǩǴǣưǮǲǫǮǴƶԻԽԾԦՂԵՔՃ԰Ԭǌ", (byte)124, 65) + string + NLoginCore_324.F("ղ", (byte)124, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public float getYaw() {
        return this.var_float_a;
    }
}

