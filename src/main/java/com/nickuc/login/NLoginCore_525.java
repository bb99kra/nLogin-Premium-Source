/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginInterface_014;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginInterface_005;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_053;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_525 {
    private static boolean var_boolean_ao;
    private static long ab;
    private static int u;
    private static long c;
    private static int an;
    private static int ax;
    private static int ay;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static long ae;
    private static int aq;
    private static int at;
    private static int t;
    private static int as;
    private static int h;
    private static int ad;
    private static int j;
    private static long ac;
    private static int x;
    private static int i;
    private static long o;
    private static int v;
    private static long au;
    private static int var_int_b;
    private static long d;
    private static int ah;
    private static int ar;
    private static int aa;
    private static int var_int_ao;
    private static int k;
    private static int am;
    private static int w;
    private static int s;
    private static long af;
    private static int ba;
    private static int ag;
    private static long q;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int p;
    private static long y;
    private static int r;
    private static int ak;
    private static int al;
    private static long l;
    private static int aj;
    private static long e;
    private static long z;
    private static int g;
    private static int az;
    private static int m;
    private static long n;
    private static int aw;
    private static int ai;
    private static int ap;
    static NLoginCore_053[][] var_com_nickuc_login_NLoginCore_044_arr_arr_a;
    private static long av;

    public static void g(boolean bl) {
        NLoginCore_370.f(bl);
        var_boolean_ao = bl;
    }

    public static JSONObject a(boolean bl) {
        JSONObject jSONObject = new JSONObject();
        if (var_com_nickuc_login_NLoginCore_044_arr_arr_a == null) {
            return jSONObject;
        }
        HashMap<String, JSONObject> hashMap = new HashMap<String, JSONObject>();
        NLoginCore_053[][] NLoginCore_044Array = var_com_nickuc_login_NLoginCore_044_arr_arr_a;
        int n = NLoginCore_044Array.length;
        block0: for (int i = aq; i < n; ++i) {
            NLoginCore_053[] NLoginCore_044Array2;
            NLoginCore_053[] NLoginCore_044Array3 = NLoginCore_044Array2 = NLoginCore_044Array[i];
            int n2 = NLoginCore_044Array3.length;
            for (int j = ar; j < n2; ++j) {
                NLoginCore_053 NLoginCore_0442 = NLoginCore_044Array3[j];
                if (NLoginCore_0442 == null) continue;
                NLoginInterface_005 NLoginInterface_0052 = NLoginCore_053.com_nickuc_login_NLoginInterface_005_a(NLoginCore_0442);
                if (bl && NLoginInterface_0052 instanceof NLoginInterface_014) continue block0;
                String string3 = NLoginCore_053.com_nickuc_login_NLoginCore_208_a((NLoginCore_053)NLoginCore_0442).bB;
                JSONObject jSONObject2 = hashMap.computeIfAbsent(string3, string2 -> {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put(string3, (Object)jSONObject2);
                    return jSONObject2;
                });
                String string4 = NLoginInterface_0052.com_nickuc_login_NLoginCore_474_a().a()[as];
                String[] stringArray = string4.split((String)NLoginCore_525.c("㺀", (int)at, (long)(au ^ av)));
                JSONObject jSONObject3 = jSONObject2;
                for (int k = aw; k < stringArray.length - ax; ++k) {
                    JSONObject jSONObject4 = jSONObject3;
                    int n3 = k;
                    jSONObject3 = hashMap.computeIfAbsent(k + stringArray[k], string -> {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject4.put(stringArray[n3], (Object)jSONObject2);
                        return jSONObject2;
                    });
                }
                jSONObject3.put(stringArray[stringArray.length - ay], NLoginCore_053.java_lang_Object_a(NLoginCore_0442) != null ? NLoginCore_053.java_lang_Object_a(NLoginCore_0442) : JSONObject.NULL);
            }
        }
        return jSONObject;
    }

    public static void a(NLoginInterface_005 NLoginInterface_0052, NLoginCore_208 NLoginCore_2082, Object object2, boolean bl) {
        Object object3;
        if (NLoginCore_2082.ab == j) {
            NLoginCore_525.a(NLoginCore_2082);
        }
        if (object2 == null) {
            throw new IllegalArgumentException((String)NLoginCore_525.c("㺀", (int)k, (long)l));
        }
        NLoginCore_135 NLoginCore_1352 = NLoginInterface_0052.a(NLoginInterface_0052, object2);
        if (NLoginCore_1352 == null) {
            throw new IllegalArgumentException((String)NLoginCore_525.c("㺃", (int)m, (long)(n ^ o)));
        }
        if (bl) {
            if (NLoginCore_1352 instanceof String) {
                NLoginCore_1352 = NLoginCore_065.q((String)((Object)NLoginCore_1352));
            } else if (NLoginCore_1352 instanceof List) {
                object3 = new ArrayList(NLoginCore_1352);
                if (!object3.isEmpty()) {
                    object3.replaceAll(object -> {
                        if (object instanceof String) {
                            object = NLoginCore_065.q((String)object);
                        }
                        return object;
                    });
                }
                NLoginCore_1352 = NLoginCore_135.a(object3);
            }
        }
        object3 = var_com_nickuc_login_NLoginCore_044_arr_arr_a[NLoginCore_2082.ab];
        int n = NLoginInterface_0052.int_a();
        if (n < ((NLoginCore_053[])object3).length) {
            object3[n] = new NLoginCore_053(NLoginInterface_0052, NLoginCore_2082, NLoginCore_1352, null);
            return;
        }
        Object[] objectArray = new Object[r];
        objectArray[NLoginCore_525.s] = NLoginInterface_0052;
        objectArray[NLoginCore_525.t] = n;
        objectArray[NLoginCore_525.u] = ((Object)object3).length;
        throw new ArrayIndexOutOfBoundsException(String.format((String)NLoginCore_525.c("㺆", (int)p, (long)q), objectArray));
    }

    public static void a(NLoginInterface_005[] NLoginInterface_005Array, NLoginCore_208 NLoginCore_2082, NLoginCore_219 NLoginCore_2192) {
        NLoginInterface_005[] NLoginInterface_005Array2 = NLoginInterface_005Array;
        int n = NLoginInterface_005Array2.length;
        for (int i = ah; i < n; ++i) {
            NLoginInterface_005 NLoginInterface_0052 = NLoginInterface_005Array2[i];
            NLoginCore_525.a(NLoginInterface_0052, NLoginCore_2082, NLoginCore_2192, ai != 0);
        }
    }

    public static void a(NLoginInterface_005 NLoginInterface_0052, NLoginCore_208 NLoginCore_2082, Object object) {
        NLoginCore_525.a(NLoginInterface_0052, NLoginCore_2082, object, v != 0);
    }

    private static synchronized void a(NLoginCore_208 NLoginCore_2082) {
        if (var_com_nickuc_login_NLoginCore_044_arr_arr_a != null) {
            int n;
            NLoginCore_053[][] NLoginCore_044Array = var_com_nickuc_login_NLoginCore_044_arr_arr_a;
            NLoginCore_053[][] NLoginCore_044ArrayArray = new NLoginCore_053[NLoginCore_044Array.length + aj][];
            System.arraycopy(NLoginCore_044Array, ak, NLoginCore_044ArrayArray, al, NLoginCore_044Array.length);
            NLoginCore_2082.ab = n = NLoginCore_044ArrayArray.length - am;
            NLoginCore_044ArrayArray[n] = new NLoginCore_053[NLoginCore_2082.aa];
            var_com_nickuc_login_NLoginCore_044_arr_arr_a = NLoginCore_044ArrayArray;
        } else {
            NLoginCore_2082.ab = an;
            NLoginCore_053[][] NLoginCore_044ArrayArray = new NLoginCore_053[var_int_ao][];
            NLoginCore_044ArrayArray[NLoginCore_525.ap] = new NLoginCore_053[NLoginCore_2082.aa];
            var_com_nickuc_login_NLoginCore_044_arr_arr_a = NLoginCore_044ArrayArray;
        }
    }

    private static String a(int n, long l) {
        l ^= 0x70L;
        l ^= 0xFA64DC87681C7E64L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(23 + 46), (byte)(82 + 1), (byte)(5 + 42), (byte)(27 + 40), 66, (byte)(25 + 42), (byte)(27 + 20), (byte)(32 + 48), (byte)(55 + 20), (byte)(35 + 32), (byte)(19 + 64), (byte)(11 + 42), 80, (byte)(52 + 45), (byte)(43 + 57), (byte)(83 + 17), (byte)(35 + 70), (byte)(50 + 60), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(69 + 14)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("ՉՖՕԘ՘ՔՏ՘գՒԟ՝ա՚՝գԥࢶ࢛ࢶࢮ࢛ࢺ࢐ࣀࢶࢻ", (byte)42, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_525.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (-1 >>> 187 | -1 << ~187 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        d = Long.reverse(-4255371103741205332L);
        e = Long.reverse(0xE00000000000000L);
        f = 3 >>> 32 | 3 << -32;
        g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = 0x10000000 >>> 123 | 0x10000000 << -123;
        j = -1 >>> 70 | -1 << ~70 + 1;
        k = (64 >>> 198 | 64 << -198) & 0xFFFFFFFF;
        l = Long.reverse(-3823025539513637716L);
        m = (524288 >>> 18 | 524288 << -18) & 0xFFFFFFFF;
        n = Long.reverse(-4255371103741205332L);
        o = Long.reverse(0xE00000000000000L);
        p = 1536 >>> 169 | 1536 << ~169 + 1;
        q = Long.reverse(-3823025539513637716L);
        r = (3 >>> 160 | 3 << ~160 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(0);
        t = 256 >>> 232 | 256 << ~232 + 1;
        u = Integer.reverse(0x40000000);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = 0x8000000 >>> 155 | 0x8000000 << -155;
        x = 128 >>> 101 | 128 << ~101 + 1;
        y = Long.reverse(-4255371103741205332L);
        z = Long.reverse(0xE00000000000000L);
        aa = (0xA00000 >>> 181 | 0xA00000 << ~181 + 1) & 0xFFFFFFFF;
        ab = Long.reverse(-4255371103741205332L);
        ac = Long.reverse(0xE00000000000000L);
        ad = Integer.reverse(0x60000000);
        ae = Long.reverse(-4255371103741205332L);
        af = Long.reverse(0xE00000000000000L);
        ag = Integer.reverse(0);
        ah = (0 >>> 169 | 0 << -169) & 0xFFFFFFFF;
        ai = 524288 >>> 179 | 524288 << -179;
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = Integer.reverse(0);
        al = Integer.reverse(0);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = Integer.reverse(0);
        var_int_ao = (0x40000000 >>> 254 | 0x40000000 << -254) & 0xFFFFFFFF;
        ap = 0 >>> 215 | 0 << ~215 + 1;
        aq = (0 >>> 71 | 0 << -71) & 0xFFFFFFFF;
        ar = (0 >>> 25 | 0 << ~25 + 1) & 0xFFFFFFFF;
        as = (0 >>> 87 | 0 << -87) & 0xFFFFFFFF;
        at = 0x700000 >>> 180 | 0x700000 << -180;
        au = Long.reverse(-4255371103741205332L);
        av = Long.reverse(0xE00000000000000L);
        aw = Integer.reverse(0);
        ax = 256 >>> 168 | 256 << -168;
        ay = Integer.reverse(Integer.MIN_VALUE);
        az = (0x100000 >>> 177 | 0x100000 << ~177 + 1) & 0xFFFFFFFF;
        ba = (0x200000 >>> 18 | 0x200000 << -18) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[az];
        var_java_lang_String_arr_b = new String[ba];
        NLoginCore_525.b();
    }

    public static void a(NLoginInterface_005 NLoginInterface_0052, NLoginCore_208 NLoginCore_2082, NLoginCore_219 NLoginCore_2192, boolean bl) {
        String[] stringArray = NLoginInterface_0052.com_nickuc_login_NLoginCore_474_a().a();
        if (stringArray == null) {
            throw new IllegalArgumentException((String)NLoginCore_525.c("㺀", (int)x, (long)(y ^ z)));
        }
        if (stringArray.length == 0) {
            throw new IllegalArgumentException((String)NLoginCore_525.c("㺃", (int)aa, (long)(ab ^ ac)));
        }
        Object object = NLoginInterface_0052.java_lang_Object_a();
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_525.c("㺆", (int)ad, (long)(ae ^ af)) + NLoginInterface_0052);
        }
        Object object2 = NLoginCore_525.a(stringArray, object, NLoginCore_2192, ag);
        NLoginCore_525.a(NLoginInterface_0052, NLoginCore_2082, object2, bl);
    }

    @Nullable
    public static Object a(NLoginInterface_005 NLoginInterface_0052, NLoginCore_208 NLoginCore_2082) {
        int n = NLoginCore_2082.ab;
        if (n == var_int_a) {
            return null;
        }
        NLoginCore_053[] NLoginCore_044Array = var_com_nickuc_login_NLoginCore_044_arr_arr_a[n];
        int n2 = NLoginInterface_0052.int_a();
        if (n2 < NLoginCore_044Array.length) {
            NLoginCore_053 NLoginCore_0442 = NLoginCore_044Array[n2];
            return NLoginCore_0442 != null ? NLoginCore_053.java_lang_Object_a(NLoginCore_0442) : null;
        }
        Object[] objectArray = new Object[f];
        objectArray[NLoginCore_525.g] = NLoginInterface_0052;
        objectArray[NLoginCore_525.h] = n2;
        objectArray[NLoginCore_525.i] = NLoginCore_044Array.length;
        throw new ArrayIndexOutOfBoundsException(String.format((String)NLoginCore_525.c("㺀", (int)var_int_b, (long)(d ^ e)), objectArray));
    }

    @Generated
    public static boolean as() {
        return var_boolean_ao;
    }

    private static void b() {
        int n;
        c = 3829414794323529507L;
        long l = c ^ 0xFA64DC87681C7E64L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(14 + 55), (byte)(50 + 33), 47, (byte)(35 + 32), (byte)(11 + 55), (byte)(47 + 20), (byte)(29 + 18), (byte)(41 + 39), (byte)(15 + 60), (byte)(2 + 65), (byte)(22 + 61), (byte)(13 + 40), (byte)(18 + 62), (byte)(64 + 33), (byte)(75 + 25), (byte)(2 + 98), 105, (byte)(81 + 29), (byte)(15 + 88)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(62 + 21)}, StandardCharsets.UTF_8));
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
                    NLoginCore_525.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ëēğĞĥîģãĦĈĠçħùģğċĀčĴĲēħĮĩċðĈİćĞĽùĹÿğĳŁġĄŅĸĴľĸĺŉĎŁŋıĝŐĭĚě", (byte)20, 66);
                    NLoginCore_525.var_java_lang_String_arr_b[1] = NLoginCore_138.A("×úěĤĒĘĂàĥħīĂěğöĩĆıĬĭĎíĬĖïðĆĒĩąďĵ", (byte)20, 65);
                    NLoginCore_525.var_java_lang_String_arr_b[2] = NLoginCore_201.E("ԶՁԬԌՄՍԋԩԡԚՉԽՕԫԪՅԓԘԔԹԼՙՕ՛ԱԽՀբԱբԲԧԷ՛Դ՛ՃԶՏԹԮՋԳՐԧՋՍՈԶճ՜ԮՉՈԵիճՋց՚ՠ՝բդ", (byte)20, 69);
                    NLoginCore_525.var_java_lang_String_arr_b[3] = NLoginCore_027.C("еѝѩѨѯиѭЭѰђѪбѱуѭѩѕъїѾѼѝѱѸѳѕкђѺёѨ҇у҃щѩѽҋѫюҏ҂Ѿ҈҂҄ғјҋҕѻѧҚѷѤѥ", (byte)20, 67);
                    NLoginCore_525.var_java_lang_String_arr_b[4] = NLoginCore_091.B("číđģíĢĕãđĤĦĚąČčìĩĄĨĩýðċĤćęħĹĥùĖď", (byte)20, 66);
                    NLoginCore_525.var_java_lang_String_arr_b[5] = NLoginCore_384.D("їзћѭзѬџЭћѮѮѰѬтѳјѲізѓяѴҁрѷѐм҄Ѻђѷ҈", (byte)20, 68);
                    NLoginCore_525.var_java_lang_String_arr_b[6] = NLoginCore_201.A("þĂûăôĢÜĔãĔĪÝăĄĦþħêĉĄĕĵćģĦĐĴĤēøýĳļēĭĳĳĶĘıĔıļď", (byte)20, 65);
                    NLoginCore_525.var_java_lang_String_arr_b[7] = NLoginCore_427.B("ÜõġĐ÷ÞĞħĞćĘï", (byte)20, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_525.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ëēğĞĥîģãĦĈĠçħùģğċĀčĴĲēħĮĩċðĈİćĞĽùĹÿğĳŁġĄŅĸĴľĕăĭĮĐĐĞČđĭĚě", (byte)20, 65);
                    NLoginCore_525.var_java_lang_String_arr_b[1] = NLoginCore_091.C("СфѥѮќѢьЪѯѱѵьѥѩрѳѐѻѶѷјбҁѬѮѤоѭѻѯљл", (byte)20, 67);
                    NLoginCore_525.var_java_lang_String_arr_b[2] = NLoginCore_324.E("ԶՁԬԌՄՍԋԩԡԚՉԽՕԫԪՅԓԘԔԹԼՙՕ՛ԱԽՀբԱբԲԧԷ՛Դ՛ՃԶՏԹԮՋԳՐԧՋՍՈԶճ՜ԮՉՋնսՙտսլռՠԾՐ", (byte)20, 69);
                    NLoginCore_525.var_java_lang_String_arr_b[3] = NLoginCore_384.C("еѝѩѨѯиѭЭѰђѪбѱуѭѩѕъїѾѼѝѱѸѳѕкђѺёѨ҇у҃щѩѽҋѫюҏ҂ҀѤ҉ѫѴы҈ѯїѫҊѧѤѥ", (byte)20, 67);
                    NLoginCore_525.var_java_lang_String_arr_b[4] = NLoginCore_384.D("їзћѭзѬџЭћѮѰѤяіїжѳюѲѳчѿѭўѸрья҃Ѣё҈", (byte)20, 68);
                    NLoginCore_525.var_java_lang_String_arr_b[5] = NLoginCore_387.E("ԶԖԺՌԖՋԾԌԺՍՍՏՋԡՒԷՑԵԖԲԮՑՋԜՉԡՔԺբէԺԱ՞Ւ՛՛Չ՝ԻխՄ՟ԪԸ", (byte)20, 69);
                    NLoginCore_525.var_java_lang_String_arr_b[6] = NLoginCore_387.E("ԧԫԤԬԝՋԅԽԌԽՓԆԬԭՏԧՐԓԲԭԾ՞԰ՌՏԹ՝ՍԼԡԦ՜Ղ՜զիԟըա՝աԻՔՋըՑԷԯՃձՖԳ՚ՖՃՄ", (byte)20, 69);
                    NLoginCore_525.var_java_lang_String_arr_b[7] = NLoginCore_091.D("длѡХљЫйЫЭѥфй", (byte)20, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_525.var_java_lang_String_arr_b[0] = NLoginCore_559.C("РфиѧјЩсшЯЮѝвішѱзйїѼмщъѮѕўђўмѵѥт҇", (byte)20, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_525.var_java_lang_String_arr_b[0] = NLoginCore_138.F("ԞԈԽԸԬԻՊԱԑՀԤԿ԰ԞՓԓՊԓԹԱ԰ՔԽԳԽԽԡՀՕԷՖՁ", (byte)20, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_525.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.E("Փյշ՗ջ֚֒֨֔գ֥֡֗֟ը֍֦֦֮֯֬ջ", (byte)111, 69), NLoginCore_525.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.A("ǀǍǌƏǏǋǆǏǚǉƖǔǘǑǔǚƜԭԒԭԥԒԱԇԷԭԲƲ", (byte)111, 65) + string + NLoginCore_446.E("ե", (byte)111, 69) + methodType.toString(), exception);
        }
    }

    private static Object a(String[] stringArray, Object object, NLoginCore_219 NLoginCore_2192, int n) {
        Object object2;
        if (n >= stringArray.length) {
            return object;
        }
        return (object2 = NLoginCore_2192.e(stringArray[n++])) == null || object != null && !(object instanceof Iterable) && !object.getClass().isAssignableFrom(object2.getClass()) ? NLoginCore_525.a(stringArray, object, NLoginCore_2192, n) : object2;
    }

    public static void a(NLoginInterface_005 NLoginInterface_0052, Object object) {
        NLoginCore_525.a(NLoginInterface_0052, NLoginInterface_0052.com_nickuc_login_NLoginCore_208_a(), object, w != 0);
    }
}

