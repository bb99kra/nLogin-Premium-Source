/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_410
extends NLoginCore_400 {
    private static int t;
    private static long x;
    private static long i;
    private static int an;
    private final String J;
    private static long aj;
    private static long am;
    private static int ah;
    private static int h;
    private final String K;
    private static int ae;
    private static int y;
    private static long ab;
    private static long ag;
    private static int var_int_d;
    private static long aa;
    private static int aq;
    private static long n;
    private static int w;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_c;
    private static long g;
    private static String[] var_java_lang_String_arr_d;
    private static int ao;
    private static long u;
    private static long f;
    private static int s;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_410.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("Ժ՜՞Ծբցչ֏ջՊֈվ֌ֆՏմ֖֕֍֓֍բ", (byte)86, 69), NLoginCore_410.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.B("ƎƛƚŝƝƙƔƝƨƗŤƢƦƟƢƨŪӟӹԀӟӔԆԅӻž", (byte)86, 66) + string + NLoginCore_027.D("ӱ", (byte)86, 68) + methodType.toString(), exception);
        }
    }

    public NLoginCore_410(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, String string2) {
        super(NLoginType_008, NLoginCore_479);
        this.J = string;
        this.K = string2;
    }

    private static String a(int n, long l) {
        l ^= 0x59L;
        l ^= 0xA93E9D92A49FBCE5L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(14 + 69), (byte)(5 + 42), (byte)(3 + 64), (byte)(48 + 18), (byte)(6 + 61), (byte)(46 + 1), (byte)(23 + 57), (byte)(8 + 67), (byte)(13 + 54), 83, (byte)(28 + 25), (byte)(58 + 22), (byte)(49 + 48), (byte)(90 + 10), (byte)(82 + 18), (byte)(81 + 24), (byte)(35 + 75), (byte)(53 + 50)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լ࣡ࣻं࣡ࣖईइࣽ", (byte)113, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_410.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    private static void void_b() {
        int n;
        f = 4029524966893603211L;
        long l = f ^ 0xA93E9D92A49FBCE5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(58 + 11), (byte)(55 + 28), (byte)(15 + 32), (byte)(61 + 6), (byte)(30 + 36), (byte)(2 + 65), 47, (byte)(15 + 65), (byte)(33 + 42), (byte)(51 + 16), (byte)(44 + 39), (byte)(46 + 7), (byte)(25 + 55), (byte)(95 + 2), (byte)(91 + 9), (byte)(38 + 62), 105, (byte)(40 + 70), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_410.var_java_lang_String_arr_d[0] = NLoginCore_027.F("ԚԘԡԙԶԻԘԥՊԼԠԕ", (byte)17, 70);
                    NLoginCore_410.var_java_lang_String_arr_d[1] = NLoginCore_223.A("îìõíĊďìùĞĐôé", (byte)17, 65);
                    NLoginCore_410.var_java_lang_String_arr_d[2] = NLoginCore_091.B("ØôÖæòçÿđòĚĖé", (byte)17, 66);
                    NLoginCore_410.var_java_lang_String_arr_d[3] = NLoginCore_223.D("юкѡЬјхўдгпѡа", (byte)17, 68);
                    NLoginCore_410.var_java_lang_String_arr_d[4] = NLoginCore_384.B("ēĈÕèĉĖĉĂôĔĚé", (byte)17, 66);
                    NLoginCore_410.var_java_lang_String_arr_d[5] = NLoginCore_384.A("ÖêæČċéđóČēüé", (byte)17, 65);
                    NLoginCore_410.var_java_lang_String_arr_d[6] = NLoginCore_027.F("ԒԧԵԁԂԄԴԛԣԥԇՇԱԐԨՑ԰ՕԕՄԢԣԹՑՓԵՍԛԔԸբՕԲբ՞ԹԡՅԵլածԧԵ", (byte)17, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_410.var_java_lang_String_arr_d[0] = NLoginCore_387.A("ČûÓêÞ×ēÚÿĐøé", (byte)17, 65);
                    NLoginCore_410.var_java_lang_String_arr_d[1] = NLoginCore_091.E("ԂՂԦӻԸԫԟԖՍՄԠԕ", (byte)17, 69);
                    NLoginCore_410.var_java_lang_String_arr_d[2] = NLoginCore_027.E("ԖԧՉԻԕԉՂԗԢԎԨԕ", (byte)17, 69);
                    NLoginCore_410.var_java_lang_String_arr_d[3] = NLoginCore_453.F("ՅՇԹԽՈՁՍԫՆԽԤԕ", (byte)17, 70);
                    NLoginCore_410.var_java_lang_String_arr_d[4] = NLoginCore_575.D("яџэтРѐчўнџеѢШѭэЭЭѥюцѰюлм", (byte)17, 68);
                    NLoginCore_410.var_java_lang_String_arr_d[5] = NLoginCore_559.D("ьОоФљѧёљувѝа", (byte)17, 68);
                    NLoginCore_410.var_java_lang_String_arr_d[6] = NLoginCore_387.A("æûĉÕÖØĈï÷ùÛěąäüĥĄĩéĘö÷čĥħĉġïèČĶĩĭķĝİĜĜÿýüĞĲĉ", (byte)17, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_410.var_java_lang_String_arr_d[0] = NLoginCore_324.A("ÌêċđēđöĘðďíþúÝñĝÜĆěõĊĭôõ", (byte)17, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_410.var_java_lang_String_arr_d[0] = NLoginCore_027.D("ЙЫјѡтФХкѠсѕѭѪїыйыбѓцЭэѫѠёѻѵќќѝѷѶ", (byte)17, 68);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(this.J, this.java_io_File_b());
        Set<String> set = NLoginCore_2192.a(this.K);
        this.j = set.size();
        for (String string : set) {
            try {
                String string2 = this.K + (String)NLoginCore_410.c("㺀", (int)(var_int_c & var_int_d), (long)g) + string + (String)NLoginCore_410.c("㺃", (int)h, (long)(i ^ n));
                this.a(NLoginCore_2192, string, string2);
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_410.c("㺆", (int)(s & t), (long)u) + this.a.getName() + (String)NLoginCore_410.c("㺉", (int)w, (long)x) + (String)(string == null ? NLoginCore_410.c("㺌", (int)y, (long)(aa ^ ab)) : string + (String)NLoginCore_410.c("㺏", (int)ae, (long)ag)) + (String)NLoginCore_410.c("㺒", (int)ah, (long)(aj ^ am)), exception, new Object[an]);
            }
            finally {
                ++this.l;
            }
        }
        set.clear();
        this.c(NLoginInterface_0422);
    }

    protected abstract void a(NLoginCore_219 var1, String var2, String var3);

    static {
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(-1);
        g = Long.reverse(5445769585795913708L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(-3345256886831294484L);
        n = Long.reverse(-7349874591868649472L);
        s = Integer.reverse(0x40000000);
        t = -1 >>> 104 | -1 << ~104 + 1;
        u = Long.reverse(5445769585795913708L);
        w = Integer.reverse(-1073741824);
        x = Long.reverse(5445769585795913708L);
        y = (256 >>> 166 | 256 << -166) & 0xFFFFFFFF;
        aa = Long.reverse(-3345256886831294484L);
        ab = Long.reverse(-7349874591868649472L);
        ae = Integer.reverse(-1610612736);
        ag = Long.reverse(5445769585795913708L);
        ah = (0xC00000 >>> 53 | 0xC00000 << ~53 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(-3345256886831294484L);
        am = Long.reverse(-7349874591868649472L);
        an = (0 >>> 87 | 0 << -87) & 0xFFFFFFFF;
        ao = Integer.reverse(-536870912);
        aq = Integer.reverse(-536870912);
        var_java_lang_String_arr_c = new String[ao];
        var_java_lang_String_arr_d = new String[aq];
        NLoginCore_410.void_b();
    }
}

