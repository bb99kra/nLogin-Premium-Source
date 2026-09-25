/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_428;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_490
extends NLoginCore_400 {
    private static int bf;
    private static long g;
    private final String I;
    private static int bz;
    private static int az;
    private static long n;
    private static int m;
    private static long ay;
    private static int ae;
    private static int bq;
    private static long o;
    private static int bd;
    private static int w;
    private static int bp;
    private static int t;
    private static int aw;
    private static long f;
    private static int cb;
    private static int bg;
    private static int var_int_d;
    private static long aa;
    private static int bu;
    private static int h;
    private static int bl;
    private static String[] var_java_lang_String_arr_c;
    private static long ax;
    private static String[] var_java_lang_String_arr_d;
    private static int bw;
    private static int bc;
    private static int an;
    private static long ap;
    private static long ag;
    private static int var_int_c;
    private static long as;
    private static int s;
    private static long am;
    private static int bn;
    private static int bj;
    private static long aj;
    private static int bi;
    private static int bx;
    private static int y;
    private static long ab;
    private static int ak;

    public NLoginCore_490(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479) {
        this(NLoginType_008, NLoginCore_479, (String)NLoginCore_490.c("㺀", (int)(var_int_c & var_int_d), (long)g));
    }

    private static void void_b() {
        int n;
        f = -4090117337933222495L;
        long l = f ^ 0xB122D3CF6F087A1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(59 + 10), (byte)(72 + 11), (byte)(7 + 40), (byte)(28 + 39), (byte)(48 + 18), (byte)(26 + 41), (byte)(10 + 37), 80, (byte)(24 + 51), (byte)(36 + 31), (byte)(23 + 60), (byte)(25 + 28), (byte)(55 + 25), (byte)(47 + 50), (byte)(64 + 36), 100, (byte)(13 + 92), (byte)(38 + 72), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_490.var_java_lang_String_arr_d[0] = NLoginCore_453.D("ЫѧфхнццѢёиљйѽѸѯошєѸуўѝъы", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[1] = NLoginCore_110.D("мѲѯвѯѝЮцчѕбп", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[2] = NLoginCore_384.D("шљѣѭѣѡѳѡхѰеп", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[3] = NLoginCore_027.D("чѢѝЯєуўчдеѰп", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[4] = NLoginCore_027.C("оѮвёѮёухѕиѴп", (byte)22, 67);
                    NLoginCore_490.var_java_lang_String_arr_d[5] = NLoginCore_223.A("àēúĝåúçûêĢåó", (byte)22, 65);
                    NLoginCore_490.var_java_lang_String_arr_d[6] = NLoginCore_451.B("ßûÜĢĥæöýĜĂĆĀĩćĲČēĶġČĈëĴęěöðĎüþĝČĘłĲēĥĸćĨĢĜļē", (byte)22, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_490.var_java_lang_String_arr_d[0] = NLoginCore_201.E("ԆՂԟԠԘԡԡԽԬԓԱԟՆԖՊՔՏՔԹ՜ԧԸԥԦ", (byte)22, 69);
                    NLoginCore_490.var_java_lang_String_arr_d[1] = NLoginCore_559.D("ытоѩђѮЯццѐтп", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[2] = NLoginCore_027.C("ѭпњпсѕѧѱѪтеп", (byte)22, 67);
                    NLoginCore_490.var_java_lang_String_arr_d[3] = NLoginCore_027.E("ԳԦՎՂՁԧԪԽԢԢԔԚ", (byte)22, 69);
                    NLoginCore_490.var_java_lang_String_arr_d[4] = NLoginCore_173.E("ԫՇԇԀԍԇՏԱԨՏՔԐՕԹՈՈ՚՚ԹԿՏԨԥԦ", (byte)22, 69);
                    NLoginCore_490.var_java_lang_String_arr_d[5] = NLoginCore_387.D("пЭщрѝаѢёэдѰп", (byte)22, 68);
                    NLoginCore_490.var_java_lang_String_arr_d[6] = NLoginCore_027.E("ԆԢԃՉՌԍԝԤՃԩԭԧՐԮՙԳԺ՝ՈԳԯԒ՛ՀՂԝԗԵԣԥՄԳ՝ՄԤՠՌՆձՇԯՐՉԺ", (byte)22, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_490.var_java_lang_String_arr_d[0] = NLoginCore_384.B("üåïóēĨąÝęĈýĤĄïþĪĩĐĂĊďķþÿ", (byte)22, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_490.var_java_lang_String_arr_d[0] = NLoginCore_223.F("ԺՍԶՅԁԘԉՂԅԝԞՂԬԏՖԚԯԱԱՇԞ՞ԥԦ", (byte)22, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_490.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ÙûýÝāĠĘĮĚéħĝīĥîēĵĴĬĲĬā", (byte)25, 65), NLoginCore_490.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.F("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢞ࢤࢠ࢏ࢠࢴ࢕ࢱࢤࢣࢸ࢑Ԭ", (byte)25, 70) + string + NLoginCore_173.C("к", (byte)25, 67) + methodType.toString(), exception);
        }
    }

    static {
        var_int_c = 0 >>> 26 | 0 << ~26 + 1;
        var_int_d = -1 >>> 20 | -1 << -20;
        g = Long.reverse(267765620682996963L);
        h = (0x8000000 >>> 91 | 0x8000000 << -91) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Long.reverse(-8811491228095922973L);
        o = Long.reverse(-8791026472627208192L);
        s = Integer.reverse(0x40000000);
        t = Integer.reverse(0);
        w = Integer.reverse(Integer.MIN_VALUE);
        y = 0x20000000 >>> 252 | 0x20000000 << -252;
        aa = Long.reverse(-8811491228095922973L);
        ab = Long.reverse(-8791026472627208192L);
        ae = Integer.reverse(-1073741824);
        ag = Long.reverse(-8811491228095922973L);
        aj = Long.reverse(-8791026472627208192L);
        ak = 65536 >>> 14 | 65536 << ~14 + 1;
        am = Long.reverse(267765620682996963L);
        an = 0x500000 >>> 212 | 0x500000 << ~212 + 1;
        ap = Long.reverse(-8811491228095922973L);
        as = Long.reverse(-8791026472627208192L);
        aw = Integer.reverse(0x60000000);
        ax = Long.reverse(-8811491228095922973L);
        ay = Long.reverse(-8791026472627208192L);
        az = 0 >>> 12 | 0 << -12;
        bc = Integer.reverse(0x40000000);
        bd = (0 >>> 4 | 0 << -4) & 0xFFFFFFFF;
        bf = Integer.reverse(0x4000000);
        bg = 8 >>> 131 | 8 << ~131 + 1;
        bi = 0 >>> 228 | 0 << ~228 + 1;
        bj = Integer.reverse(Integer.MIN_VALUE);
        bl = (0xC000000 >>> 186 | 0xC000000 << ~186 + 1) & 0xFFFFFFFF;
        bn = (312 >>> 3 | 312 << ~3 + 1) & 0xFFFFFFFF;
        bp = 0x9C0000 >>> 210 | 0x9C0000 << -210;
        bq = 69632 >>> 107 | 69632 << -107;
        bu = Integer.reverse(0x44000000);
        bw = 0x2000000 >>> 217 | 0x2000000 << ~217 + 1;
        bx = Integer.reverse(Integer.MIN_VALUE);
        bz = Integer.reverse(-536870912);
        cb = Integer.reverse(-536870912);
        var_java_lang_String_arr_c = new String[bz];
        var_java_lang_String_arr_d = new String[cb];
        NLoginCore_490.void_b();
    }

    public NLoginCore_490(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string) {
        this(NLoginType_008, NLoginCore_479, string, h != 0);
    }

    private String java_lang_String_f(String string) {
        if ((string = string.trim()).length() >= bc && string.charAt(bd) == bf) {
            string = string.substring(bg);
        }
        char c = string.charAt(bi);
        char c2 = string.charAt(string.length() - bj);
        if (string.length() >= bl && (c == bn && c2 == bp || c == bq && c2 == bu)) {
            string = string.substring(bw, string.length() - bx);
        }
        return string;
    }

    private static String a(int n, long l) {
        l ^= 0x61L;
        l ^= 0xB122D3CF6F087A1L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(19 + 50), (byte)(13 + 70), (byte)(31 + 16), (byte)(27 + 40), (byte)(3 + 63), (byte)(8 + 59), (byte)(19 + 28), (byte)(14 + 66), (byte)(56 + 19), (byte)(52 + 15), (byte)(35 + 48), (byte)(30 + 23), (byte)(78 + 2), (byte)(89 + 8), (byte)(64 + 36), (byte)(73 + 27), 105, 110, (byte)(28 + 75)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(41 + 42)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.D("ФбаϳгЯЪгоЭϺимеиоЀފސތݻތޠށޝސޏޤݽ", (byte)4, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_490.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    protected void h(String string, String string2) {
        this.a(string, string2, null, null);
    }

    public NLoginCore_490(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, boolean bl) {
        super(NLoginType_008, NLoginCore_479, bl);
        this.I = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        File file = new File(this.java_io_File_b(), this.I);
        List<String> list = NLoginCore_428.a(file);
        this.j = list.size();
        for (String string : list) {
            String string2 = null;
            try {
                String[] stringArray = string.split((String)NLoginCore_490.c("㺀", (int)m, (long)(n ^ o)));
                if (stringArray.length < s) continue;
                this.h(stringArray[t], this.java_lang_String_f(stringArray[w]));
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_490.c("㺃", (int)y, (long)(aa ^ ab)) + this.a.getName() + (String)NLoginCore_490.c("㺆", (int)ae, (long)(ag ^ aj)) + (String)(string2 == null ? NLoginCore_490.c("㺉", (int)ak, (long)am) : string2 + (String)NLoginCore_490.c("㺌", (int)an, (long)(ap ^ as))) + (String)NLoginCore_490.c("㺏", (int)aw, (long)(ax ^ ay)), exception, new Object[az]);
            }
            finally {
                ++this.l;
            }
        }
        list.clear();
        this.c(NLoginInterface_0422);
    }
}

