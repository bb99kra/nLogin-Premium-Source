/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_425;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_274;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginInterface_040;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_332
implements Runnable {
    private static int var_int_q;
    private static int g;
    private static int o;
    private static int ad;
    private static long var_long_c;
    private static int ae;
    private static int f;
    private static int var_int_b;
    private static int x;
    private static long t;
    private static int n;
    private static int k;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_j;
    private static long z;
    private static int al;
    private static int ah;
    private static long var_long_j;
    private static int af;
    private static long w;
    private static long aj;
    private static int aa;
    private static long r;
    private static int i;
    private static long m;
    private static long p;
    private static int s;
    private static int ak;
    private static int var_int_a;
    private static long e;
    private final NLoginCore_277 var_com_nickuc_login_NLoginCore_277_c;
    private final String var_java_lang_String_q;
    private static String[] var_java_lang_String_arr_b;
    private final NLoginCore_598 var_com_nickuc_login_NLoginInterface_048_a;
    private static int ai;
    private static long ab;
    private static int var_int_c;
    private static int v;
    private static long d;
    private static long var_long_y;
    private final NLoginInterface_040 var_com_nickuc_login_NLoginInterface_040_a;
    private static int ag;
    private static long h;
    private final boolean var_boolean_y;
    private static long l;
    private static int u;
    private static String[] var_java_lang_String_arr_a;
    private static int ac;

    public NLoginCore_332(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = var_int_a;
        NLoginCore_425[] NLoginCore_425Array = NLoginCore_425.values();
        int n2 = NLoginCore_425Array.length;
        for (int i = var_int_b; i < n2; ++i) {
            NLoginCore_425 NLoginCore_425 = NLoginCore_425Array[i];
            if (NLoginCore_425.aT()) continue;
            if (n == 0) {
                stringBuilder.append((String)NLoginCore_332.c("㺀", (int)var_int_c, (long)(d ^ e)));
            } else {
                n = f;
            }
            stringBuilder.append((String)NLoginCore_332.c("㺃", (int)g, (long)h)).append(NLoginCore_425.cT).append((String)NLoginCore_332.c("㺆", (int)NLoginCore_332.i, (long)var_long_j));
        }
        this.var_java_lang_String_q = stringBuilder.toString();
        this.var_com_nickuc_login_NLoginType_008_j = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_277_c = NLoginCore_277;
        this.var_boolean_y = bl;
        this.var_com_nickuc_login_NLoginInterface_040_a = NLoginType_008.java_lang_Object_b();
        this.var_com_nickuc_login_NLoginInterface_048_a = NLoginType_008.b(k != 0).a(this, l, m, TimeUnit.MILLISECONDS);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_332.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("ƉƫƭƍƱǐǈǞǊƙǗǍǛǕƞǃǥǤǜǢǜƱ", (byte)113, 65), NLoginCore_332.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.C("իոշԺպնձպօմՁտփռտօՇࣛ࣠ࢮ࣓ࣅࢱ࣓ࢻ࣓࣡ࣛ࣌ࣜՠ", (byte)113, 67) + string + NLoginCore_027.A("ƛ", (byte)113, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public void run() {
        if (!this.var_com_nickuc_login_NLoginType_008_j.N()) {
            this.var_com_nickuc_login_NLoginInterface_048_a.Z();
            return;
        }
        if (!this.var_com_nickuc_login_NLoginCore_277_c.R() || !NLoginCore_274.java_util_Set_b().contains(this.var_com_nickuc_login_NLoginCore_277_c.getName())) {
            NLoginCore_274.java_util_Set_b().remove(this.var_com_nickuc_login_NLoginCore_277_c.getName());
            this.var_com_nickuc_login_NLoginInterface_048_a.Z();
            return;
        }
        int n = LoginMainQueueTask.x();
        if (n > 0) {
            this.var_com_nickuc_login_NLoginCore_277_c.a((String)NLoginCore_332.c("㺀", (int)(NLoginCore_332.n & o), (long)p), (String)NLoginCore_332.c("㺃", (int)var_int_q, (long)r) + n + (String)NLoginCore_332.c("㺆", (int)s, (long)t) + (String)(n == u ? NLoginCore_332.c("㺉", (int)v, (long)w) : NLoginCore_332.c("㺌", (int)x, (long)(var_long_y ^ z))) + (String)NLoginCore_332.c("㺏", (int)aa, (long)ab), ac, ad, ae);
        }
        NLoginCore_425[] NLoginCore_425Array = NLoginCore_425.values();
        Object[] objectArray = new String[NLoginCore_425Array.length];
        for (int i = af; i < NLoginCore_425Array.length; ++i) {
            String string = this.var_boolean_y ? NLoginCore_425Array[i].c(TimeUnit.MILLISECONDS, ag) : NLoginCore_425Array[i].b(TimeUnit.MILLISECONDS, ah);
            objectArray[i] = string + (String)NLoginCore_332.c("㺒", (int)ai, (long)aj);
        }
        this.var_com_nickuc_login_NLoginCore_277_c.o(String.format(this.var_java_lang_String_q, objectArray));
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 100 | 0 << -100;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(7409432419162261175L);
        e = Long.reverse(0x3C00000000000000L);
        f = (0 >>> 58 | 0 << -58) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(6544741290707125943L);
        i = Integer.reverse(0x40000000);
        var_long_j = Long.reverse(6544741290707125943L);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(1711367858400788480L);
        m = Long.reverse(0x4C00000000000000L);
        n = 48 >>> 36 | 48 << ~36 + 1;
        o = Integer.reverse(-1);
        p = Long.reverse(6544741290707125943L);
        var_int_q = Integer.reverse(0x20000000);
        r = Long.reverse(6544741290707125943L);
        s = 655360 >>> 81 | 655360 << -81;
        t = Long.reverse(6544741290707125943L);
        u = (2 >>> 129 | 2 << -129) & 0xFFFFFFFF;
        v = Integer.reverse(0x60000000);
        w = Long.reverse(6544741290707125943L);
        x = 0x38000000 >>> 155 | 0x38000000 << ~155 + 1;
        var_long_y = Long.reverse(7409432419162261175L);
        z = Long.reverse(0x3C00000000000000L);
        aa = Integer.reverse(0x10000000);
        ab = Long.reverse(6544741290707125943L);
        ac = (0 >>> 177 | 0 << -177) & 0xFFFFFFFF;
        ad = (5 >>> 61 | 5 << ~61 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(0x28000000);
        af = 0 >>> 63 | 0 << ~63 + 1;
        ag = 0x200000 >>> 116 | 0x200000 << ~116 + 1;
        ah = 131072 >>> 80 | 131072 << ~80 + 1;
        ai = Integer.reverse(-1879048192);
        aj = Long.reverse(6544741290707125943L);
        ak = (80 >>> 163 | 80 << ~163 + 1) & 0xFFFFFFFF;
        al = Integer.reverse(0x50000000);
        var_java_lang_String_arr_a = new String[ak];
        var_java_lang_String_arr_b = new String[al];
        NLoginCore_332.b();
    }

    private static void b() {
        int n;
        var_long_c = -1341942109570479258L;
        long l = var_long_c ^ 0x727E43CF01D5BC31L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(30 + 39), (byte)(62 + 21), (byte)(14 + 33), (byte)(5 + 62), 66, (byte)(26 + 41), (byte)(34 + 13), (byte)(48 + 32), (byte)(46 + 29), (byte)(26 + 41), (byte)(6 + 77), (byte)(4 + 49), (byte)(19 + 61), (byte)(84 + 13), 100, (byte)(85 + 15), (byte)(102 + 3), (byte)(39 + 71), (byte)(51 + 52)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_332.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ŠŮŔƃŃžŲŦĿſƈŏ", (byte)68, 65);
                    NLoginCore_332.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ŷŖżƃŶŦŦŲņſżŏ", (byte)68, 65);
                    NLoginCore_332.var_java_lang_String_arr_b[2] = NLoginCore_110.F("Ւ՚ՖռՆ՘չճիՍչՈ", (byte)68, 70);
                    NLoginCore_332.var_java_lang_String_arr_b[3] = NLoginCore_091.A("ŮŗşŗŽŽŚőĿųżŏ", (byte)68, 65);
                    NLoginCore_332.var_java_lang_String_arr_b[4] = NLoginCore_427.B("ŰĿŵŹŻŹŽŜŨŞœƃşŨƌũŋſŜƀƃŕťşƐƄƃŮƜŵŽƘƞŶŞůƁƙƘűƔƘƘů", (byte)68, 66);
                    NLoginCore_332.var_java_lang_String_arr_b[5] = NLoginCore_559.D("ҹӫӰҵӵӲӜҹӶӶԂӉ", (byte)68, 68);
                    NLoginCore_332.var_java_lang_String_arr_b[6] = NLoginCore_091.E("ԷՉժՅժըմԻՔԼՓՈ", (byte)68, 69);
                    NLoginCore_332.var_java_lang_String_arr_b[7] = NLoginCore_453.D("ҴҵӫһӻҵӴӲӽӞһӉ", (byte)68, 68);
                    NLoginCore_332.var_java_lang_String_arr_b[8] = NLoginCore_575.E("ԫՙխը՛՝ԷՋափյՈ", (byte)68, 69);
                    NLoginCore_332.var_java_lang_String_arr_b[9] = NLoginCore_110.A("ŹĺŝŋŁƂŷŚňƉŦŏ", (byte)68, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_332.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ӵҹӔӇӑӞӞӳӼҹӘӉ", (byte)68, 67);
                    NLoginCore_332.var_java_lang_String_arr_b[1] = NLoginCore_138.A("ƁſŮųŕƆŴŠňŦŁŏ", (byte)68, 65);
                    NLoginCore_332.var_java_lang_String_arr_b[2] = NLoginCore_173.D("ӉӓӛӾӵҾҼӘӾӯӘӉ", (byte)68, 68);
                    NLoginCore_332.var_java_lang_String_arr_b[3] = NLoginCore_223.E("հոԲկեծրկ՝ւսՈ", (byte)68, 69);
                    NLoginCore_332.var_java_lang_String_arr_b[4] = NLoginCore_223.B("ŰĿŵŹŻŹŽŜŨŞœƃşŨƌũŋſŜƀƃŕťşƐƄƃŮƜŵŽƘƊƖſůƢƀƐŶƅũŹŪƋƁƍŨƎƁŨƎŬƳźŻ", (byte)68, 66);
                    NLoginCore_332.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ĽŎůŮļřŏŝƃŚŪŏ", (byte)68, 66);
                    NLoginCore_332.var_java_lang_String_arr_b[6] = NLoginCore_027.C("ұӊӘӷӞһӼӐӴӗҺӡӯӅӕӞӅӾԍӞԁӗӔӕ", (byte)68, 67);
                    NLoginCore_332.var_java_lang_String_arr_b[7] = NLoginCore_091.F("՘՚թՏՓԵթռ՛րշդ՘Վտ՞Իեպ՚պռՓՔ", (byte)68, 70);
                    NLoginCore_332.var_java_lang_String_arr_b[8] = NLoginCore_559.D("ӫӰӅӺӧӬҸӚӮӜһӉ", (byte)68, 68);
                    NLoginCore_332.var_java_lang_String_arr_b[9] = NLoginCore_427.C("ӧӰӶӜӓӸӸӝӠӽӘӉ", (byte)68, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_332.var_java_lang_String_arr_b[0] = NLoginCore_446.F("ԱՕիճԶՔ՝ՓԼձՍսբրԽթ՛ժՕՉՇՍՋչսռբՔբՑՓ֔", (byte)68, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_332.var_java_lang_String_arr_b[0] = NLoginCore_027.E("՚Ք՘ՍՋ՞խՓկՎՔգՀԸտևւմՓՃրզՓՔ", (byte)68, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x727E43CF01D5BC31L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(27 + 42), (byte)(50 + 33), (byte)(24 + 23), (byte)(50 + 17), (byte)(12 + 54), (byte)(41 + 26), (byte)(14 + 33), (byte)(14 + 66), (byte)(72 + 3), (byte)(55 + 12), (byte)(48 + 35), 53, (byte)(61 + 19), (byte)(21 + 76), (byte)(47 + 53), (byte)(91 + 9), (byte)(26 + 79), (byte)(96 + 14), (byte)(28 + 75)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡔ࡙ࠧࡌ࠾ࠪࡌ࠴࡚ࡌࡔࡅࡕ", (byte)68, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_332.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

