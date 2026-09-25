/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_398;
import com.nickuc.login.NLoginCore_200;
import com.nickuc.login.NLoginCore_583;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_311;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_084 {
    private static int t;
    private static int g;
    private static int ab;
    private static long k;
    private static int am;
    private static int var_int_e;
    private static int ag;
    private static int f;
    private static int ap;
    private static int var_int_m;
    private static int var_int_a;
    public static final String aQ;
    private static int aa;
    private static int u;
    private static int var_int_b;
    private final Method var_java_lang_reflect_Method_m;
    private static long an;
    private static long ak;
    private static final String aS;
    private final NLoginCore_583 var_com_nickuc_login_NLoginCore_583_a;
    private static int l;
    private static long ai;
    private static int j;
    private static long ah;
    private static int ac;
    public static final NLoginCore_363[] var_com_nickuc_login_NLoginInterface_034_arr_a;
    private static long d;
    private static final String aR;
    private static int af;
    private static long al;
    private static String[] var_java_lang_String_arr_b;
    private static long ao;
    private static long c;
    private static int h;
    private static int ar;
    private static int n;
    private static long o;
    private static long y;
    private static String[] var_java_lang_String_arr_a;
    private static int v;
    private static long s;
    private static int w;
    private static int q;
    private static int aq;
    private static int as;
    private static int ad;
    private static int aj;
    private static int i;
    private static long r;
    private static long x;
    private static int z;
    private static int ae;
    private static long p;
    private final Constructor<?> var_java_lang_reflect_Constructor____e;

    private static void b() {
        int n;
        c = 8466116254644039286L;
        long l = c ^ 0x96D0D5116DFFB602L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(36 + 33), (byte)(54 + 29), (byte)(9 + 38), (byte)(10 + 57), (byte)(21 + 45), 67, (byte)(26 + 21), (byte)(79 + 1), 75, (byte)(26 + 41), (byte)(64 + 19), (byte)(45 + 8), (byte)(75 + 5), (byte)(40 + 57), (byte)(66 + 34), (byte)(80 + 20), (byte)(28 + 77), (byte)(35 + 75), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_084.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖИрѝјїоСѣћѠїЮЯ", (byte)2, 68);
                    NLoginCore_084.var_java_lang_String_arr_b[1] = NLoginCore_027.C("УААϲШУЎжгГмЃ", (byte)2, 67);
                    NLoginCore_084.var_java_lang_String_arr_b[2] = NLoginCore_223.A("Ä»îÊāÿÙô÷Ö½Ë", (byte)2, 65);
                    NLoginCore_084.var_java_lang_String_arr_b[3] = NLoginCore_092.F("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖӾԦՋԩԡԺՏԯԎՓԯ", (byte)2, 70);
                    NLoginCore_084.var_java_lang_String_arr_b[4] = NLoginCore_138.B("Ä»îÊāÿÙô÷Ö½Ë", (byte)2, 66);
                    NLoginCore_084.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖИрѝјїоСѣћѠїЮЯ", (byte)2, 68);
                    NLoginCore_084.var_java_lang_String_arr_b[6] = NLoginCore_138.D("УААϲШУЎжгГмЃ", (byte)2, 68);
                    NLoginCore_084.var_java_lang_String_arr_b[7] = NLoginCore_091.E("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖӾԦՋԩԡԺՏԯԎՓԯ", (byte)2, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_084.var_java_lang_String_arr_b[0] = NLoginCore_223.B("î÷ËçÿÍÿÏÂâăĂáØÒãÛÜčāäçÎēĕþăčĄÔĔĒÒĐþ÷ĎêëĀĔÜÝßĂ÷âĘüČĖīĂğö÷", (byte)2, 66);
                    NLoginCore_084.var_java_lang_String_arr_b[1] = NLoginCore_324.F("ԧԍԋԯӶԵԔӹԝԴԕԆ", (byte)2, 70);
                    NLoginCore_084.var_java_lang_String_arr_b[2] = NLoginCore_092.D("ЌОЮϿФЄаϹЮбІЃ", (byte)2, 68);
                    NLoginCore_084.var_java_lang_String_arr_b[3] = NLoginCore_138.A("®Ý×ÍÈºÐ÷×ÙÏÏÖÓØóìÚÀúÛÈãďĎÓďÐăõÚÙ", (byte)2, 65);
                    NLoginCore_084.var_java_lang_String_arr_b[4] = NLoginCore_223.D("ДϴгРЀДІϻкЙдЃ", (byte)2, 68);
                    NLoginCore_084.var_java_lang_String_arr_b[5] = NLoginCore_138.C("ЦЯЃПзЅзЇϺКлкЙАЊЛГДхйМПІыэжлхмЌьъЊшжЯцТУиьДЖжўйэПьЮвђђїЮЯ", (byte)2, 67);
                    NLoginCore_084.var_java_lang_String_arr_b[6] = NLoginCore_324.A("ÖúÎ¶à¸ÞÃñíÖË", (byte)2, 65);
                    NLoginCore_084.var_java_lang_String_arr_b[7] = NLoginCore_201.F("өԘԒԈԃӵԋԲԒԔԊԊԑԎԓԮԧԕӻԵԖԊՅԹՎԙԑԨԉԓԑԲՖԎԋԗԴԔ՛ԐԬԼ՗Ԧ", (byte)2, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_084.var_java_lang_String_arr_b[0] = NLoginCore_092.B("³Ò¸íÿÙúÜĄÜðË", (byte)2, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_084.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ДϴЉЕЌЁЯЮϴЭАϻЋϽИМЏпбМϿХЅлеЉшЁшОФЯ", (byte)2, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_084.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ĥŇŉĩōŬŤźŦĵųũŷűĺşƁƀŸžŸō", (byte)63, 65), NLoginCore_084.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.D("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࡋࡋࡎࡋࠛ࠿ࡀࡊࡅࠟࡎ࠿ࡁ࡙Ӌ", (byte)63, 68) + string + NLoginCore_201.C("Ҭ", (byte)63, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x96D0D5116DFFB602L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(67 + 2), (byte)(79 + 4), (byte)(36 + 11), (byte)(11 + 56), (byte)(58 + 8), (byte)(37 + 30), (byte)(28 + 19), 80, (byte)(19 + 56), (byte)(18 + 49), (byte)(73 + 10), (byte)(3 + 50), (byte)(50 + 30), (byte)(66 + 31), 100, (byte)(51 + 49), (byte)(101 + 4), (byte)(84 + 26), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("шѕєЗїѓюїѢёОќѠљќѢФ޾޾߁޾ގ޲޳޽޸ޒ߁޲޴ߌ", (byte)16, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_084.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public void a(File file, File file2, NLoginCore_363 NLoginInterface_0342) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (NLoginCore_398 NLoginCore_398 : NLoginInterface_0342.a()) {
            String string = NLoginCore_398.F();
            String string2 = NLoginCore_398.E() + (String)NLoginCore_084.c("㺀", (int)n, (long)(o ^ p));
            Object[] objectArray = new Object[t];
            objectArray[NLoginCore_084.u] = this.var_com_nickuc_login_NLoginCore_583_a.B();
            objectArray[NLoginCore_084.v] = string;
            String string3 = String.format((String)NLoginCore_084.c("㺃", (int)q, (long)(r ^ s)), objectArray);
            if (!string.isEmpty()) {
                string3 = string3 + (String)NLoginCore_084.c("㺆", (int)w, (long)(x ^ y));
            }
            hashMap.put(string2, string3);
        }
        Object[] objectArray = new Object[z];
        objectArray[NLoginCore_084.aa] = file;
        objectArray[NLoginCore_084.ab] = file2;
        objectArray[NLoginCore_084.ac] = hashMap;
        Iterator<NLoginCore_398> iterator = this.var_int_e.newInstance(objectArray);
        this.var_java_lang_reflect_Method_m.invoke(iterator, new Object[ad]);
    }

    public NLoginCore_084(NLoginCore_583 NLoginCore_583) {
        try {
            this.var_com_nickuc_login_NLoginCore_583_a = NLoginCore_583;
            NLoginCore_583.boolean_a(var_com_nickuc_login_NLoginInterface_034_arr_a);
            NLoginCore_200 NLoginCore_200 = NLoginCore_583.com_nickuc_login_NLoginCore_200_a(var_com_nickuc_login_NLoginInterface_034_arr_a);
            Class<?> clazz = NLoginCore_200.loadClass((String)NLoginCore_084.c("㺀", (int)(var_int_a & var_int_b), (long)d));
            Class[] classArray = new Class[var_int_e];
            classArray[NLoginCore_084.f] = File.class;
            classArray[NLoginCore_084.g] = File.class;
            classArray[NLoginCore_084.h] = Map.class;
            this.var_int_e = (int)clazz.getDeclaredConstructor(classArray);
            this.var_int_e.setAccessible(i != 0);
            this.var_java_lang_reflect_Method_m = clazz.getDeclaredMethod((String)NLoginCore_084.c("㺃", (int)j, (long)k), new Class[l]);
            this.var_java_lang_reflect_Method_m.setAccessible(var_int_m != 0);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    static {
        var_int_a = (0 >>> 108 | 0 << ~108 + 1) & 0xFFFFFFFF;
        var_int_b = -1 >>> 197 | -1 << -197;
        d = Long.reverse(5942478315216813742L);
        var_int_e = 0x1800000 >>> 87 | 0x1800000 << -87;
        f = 0 >>> 235 | 0 << -235;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0x40000000);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Long.reverse(5942478315216813742L);
        l = Integer.reverse(0);
        var_int_m = 0x4000000 >>> 26 | 0x4000000 << ~26 + 1;
        n = (0x200000 >>> 84 | 0x200000 << -84) & 0xFFFFFFFF;
        o = Long.reverse(7960090948278795950L);
        p = Long.reverse(0x3C00000000000000L);
        q = (0x30000000 >>> 156 | 0x30000000 << ~156 + 1) & 0xFFFFFFFF;
        r = Long.reverse(7960090948278795950L);
        s = Long.reverse(0x3C00000000000000L);
        t = (16 >>> 99 | 16 << ~99 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(0);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(0x20000000);
        x = Long.reverse(7960090948278795950L);
        y = Long.reverse(0x3C00000000000000L);
        z = Integer.reverse(-1073741824);
        aa = 0 >>> 136 | 0 << -136;
        ab = 0x1000000 >>> 24 | 0x1000000 << -24;
        ac = 0x200000 >>> 148 | 0x200000 << ~148 + 1;
        ad = 0 >>> 111 | 0 << -111;
        ae = (1 >>> 29 | 1 << ~29 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(0x10000000);
        ag = 320 >>> 6 | 320 << ~6 + 1;
        ah = Long.reverse(7960090948278795950L);
        ai = Long.reverse(0x3C00000000000000L);
        aj = 0xC000000 >>> 121 | 0xC000000 << ~121 + 1;
        ak = Long.reverse(7960090948278795950L);
        al = Long.reverse(0x3C00000000000000L);
        am = Integer.reverse(-536870912);
        an = Long.reverse(7960090948278795950L);
        ao = Long.reverse(0x3C00000000000000L);
        ap = Integer.reverse(-1073741824);
        aq = Integer.reverse(0);
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[ae];
        var_java_lang_String_arr_b = new String[af];
        NLoginCore_084.b();
        aR = NLoginCore_084.c("㺀", (int)ag, (long)(ah ^ ai));
        aS = NLoginCore_084.c("㺃", (int)aj, (long)(ak ^ al));
        aQ = NLoginCore_084.c("㺆", (int)am, (long)(an ^ ao));
        NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[ap];
        NLoginInterface_034Array[NLoginCore_084.aq] = NLoginCore_311.var_com_nickuc_login_NLoginCore_315_b;
        NLoginInterface_034Array[NLoginCore_084.ar] = NLoginCore_311.var_com_nickuc_login_NLoginCore_315_c;
        NLoginInterface_034Array[NLoginCore_084.as] = NLoginCore_311.var_com_nickuc_login_NLoginCore_315_d;
        var_com_nickuc_login_NLoginInterface_034_arr_a = NLoginInterface_034Array;
    }
}

