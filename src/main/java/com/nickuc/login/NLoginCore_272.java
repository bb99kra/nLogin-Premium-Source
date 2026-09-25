/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_272 {
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int e;
    private static long g;
    private static long d;
    private static int t;
    private static long o;
    private static int q;
    private static long s;
    private static int n;
    private static long p;
    private static int m;
    private static long r;
    private static int x;
    private static int var_int_a;
    private static long j;
    private static int w;
    private static long aa;
    private static int k;
    private static long i;
    private static int z;
    private static String[] var_java_lang_String_arr_a;
    private static int ad;
    private static long var_long_b;
    private static long c;
    private static long f;
    private static long l;
    private static int ae;
    private static long v;
    private static int y;
    private static long ac;
    private static int u;
    private static int ab;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_272.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("՟ցփգևִ֦֞֠կֱ֣֭֫մֲֲָֺֻ֙և", (byte)123, 70), NLoginCore_272.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫նࣰࣾऍअऎऔ࣮घःऔ֌", (byte)123, 70) + string + NLoginCore_324.A("Ư", (byte)123, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 127 | 0 << -127) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-3577314232617466458L);
        d = Long.reverse(-7638104968020361216L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-3577314232617466458L);
        g = Long.reverse(-7638104968020361216L);
        h = (16384 >>> 173 | 16384 << -173) & 0xFFFFFFFF;
        i = Long.reverse(-3577314232617466458L);
        j = Long.reverse(-7638104968020361216L);
        k = (0x3000000 >>> 88 | 0x3000000 << -88) & 0xFFFFFFFF;
        l = Long.reverse(6366633744616588710L);
        m = (0 >>> 53 | 0 << ~53 + 1) & 0xFFFFFFFF;
        n = (512 >>> 135 | 512 << ~135 + 1) & 0xFFFFFFFF;
        o = Long.reverse(-3577314232617466458L);
        p = Long.reverse(-7638104968020361216L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(-3577314232617466458L);
        s = Long.reverse(-7638104968020361216L);
        t = (0xC000000 >>> 217 | 0xC000000 << ~217 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(-1);
        v = Long.reverse(6366633744616588710L);
        w = (1024 >>> 202 | 1024 << ~202 + 1) & 0xFFFFFFFF;
        x = 0 >>> 31 | 0 << -31;
        y = Integer.reverse(-536870912);
        z = Integer.reverse(-1);
        aa = Long.reverse(6366633744616588710L);
        ab = Integer.reverse(0x10000000);
        ac = Long.reverse(6366633744616588710L);
        ad = Integer.reverse(-1879048192);
        ae = Integer.reverse(-1879048192);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_272.b();
    }

    public static NLoginCore_219 a(String string, boolean bl) {
        Path path;
        if (bl) {
            string = (String)NLoginCore_272.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + string;
        }
        try {
            path = Files.createTempFile(string.replace((CharSequence)NLoginCore_272.c("㺃", (int)e, (long)(f ^ g)), (CharSequence)NLoginCore_272.c("㺆", (int)h, (long)(i ^ j))), (String)NLoginCore_272.c("㺉", (int)k, (long)l), new FileAttribute[m]);
            if (path == null) {
                throw new IllegalStateException((String)NLoginCore_272.c("㺌", (int)n, (long)(o ^ p)) + string);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException((String)NLoginCore_272.c("㺏", (int)q, (long)(r ^ s)) + string, iOException);
        }
        File file = path.toFile();
        try {
            Object[] objectArray = new Object[w];
            objectArray[NLoginCore_272.x] = string;
            NLoginCore_366.a(String.format((String)NLoginCore_272.c("㺒", (int)(t & u), (long)v), objectArray), file);
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_272.c("㺕", (int)(y & z), (long)aa) + string + (String)NLoginCore_272.c("㺘", (int)ab, (long)ac), iOException);
        }
        NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(file);
        file.deleteOnExit();
        return NLoginCore_2192;
    }

    private static void b() {
        int n;
        c = 7323072162356222579L;
        long l = c ^ 0xA119AEB693A50225L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), 69, (byte)(4 + 79), (byte)(33 + 14), (byte)(27 + 40), (byte)(8 + 58), (byte)(41 + 26), (byte)(29 + 18), (byte)(47 + 33), (byte)(12 + 63), (byte)(64 + 3), (byte)(73 + 10), (byte)(22 + 31), (byte)(78 + 2), 97, (byte)(62 + 38), (byte)(23 + 77), (byte)(103 + 2), (byte)(16 + 94), (byte)(84 + 19)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_272.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ьзѯќокќєцшѐѤѡяѫѻждзљпъчш", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[1] = NLoginCore_446.E("ԥՀԉՌՊԮՐԝԍԠԬԙ", (byte)21, 69);
                    NLoginCore_272.var_java_lang_String_arr_b[2] = NLoginCore_387.C("Пиыѐхћвѭджѓм", (byte)21, 67);
                    NLoginCore_272.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ѕіяяйќєвѶЬѱм", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[4] = NLoginCore_138.B("ďû÷ĢôÞñĔęĤėĥĢçīêèĩĪÿþõķĪčĸĴüĳċĈīāĻĶēěĔńāĜĩņđ", (byte)21, 66);
                    NLoginCore_272.var_java_lang_String_arr_b[5] = NLoginCore_223.D("њцтѭпЩмџѤѯѢѰѭвѶегѴѵъщр҂ѵј҃ѿчѾіѓѶь҆ҁўѦџҏьѧѴґќ", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[6] = NLoginCore_559.D("щХѝѫѠпЭоѣьбыѓѣгвѵяѮѐѝюѳю҃ѷфѠџѣѓѢѝѪ҃Ѿѐы҈ыѡѰѩҔѣьѓѪѯққҐљҠѧѨ", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[7] = NLoginCore_559.E("ԷԣԟՊԜԆԙԼՁՌՁՏՄՀՂՇԷԺԵԹԼՑԝՙԢբԺԟզԣԺՀԸԹԥլի՘լԼ՞ղժԮՒՁՃՖԸԲՍ՝Լ՗ՄՅ", (byte)21, 69);
                    NLoginCore_272.var_java_lang_String_arr_b[8] = NLoginCore_201.E("ՀԸՀԇԾՊՆՄԾԓԌ԰ՔԑԫՒԣՊԭՕՙԜՙԾաԹԠբԾԝՈգ", (byte)21, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_272.var_java_lang_String_arr_b[0] = NLoginCore_427.F("ԩԔՌԹԛԗԹԱԣԥԬԠԍ՗ԓՙ՗ԣԬ՚ԺԧԤԥ", (byte)21, 70);
                    NLoginCore_272.var_java_lang_String_arr_b[1] = NLoginCore_110.D("сиљпѬсчѝгѰжм", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[2] = NLoginCore_091.C("нщтюЮѧпѧаапм", (byte)21, 67);
                    NLoginCore_272.var_java_lang_String_arr_b[3] = NLoginCore_446.D("Ѩюѣпсѫѫттьям", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[4] = NLoginCore_559.F("ԷԣԟՊԜԆԙԼՁՌԿՍՊԏՓԒԐՑՒԧԦԝ՟ՒԵՠ՜Ԥ՛Գ԰ՓԦՉթ՜ՇժՏդբԽԭՍՕՐ԰աԹՃՌՌկ՗ՄՅ", (byte)21, 70);
                    NLoginCore_272.var_java_lang_String_arr_b[5] = NLoginCore_451.D("њцтѭпЩмџѤѯѢѰѭвѶегѴѵъщр҂ѵј҃ѿчѾіѓѶҁѦцѩҒѪҒэҐҔҁѢѢѵљ҉ҊґқѬҐҐѧѨ", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[6] = NLoginCore_027.B("þÚĒĠĕôâóĘāæĀĈĘèçĪĄģąĒăĨăĸĬùĕĔĘĈėĒğĸĳąĀĽĀĖĥğŋŃŁĆěŊĿŕŐńŅĜĝ", (byte)21, 66);
                    NLoginCore_272.var_java_lang_String_arr_b[7] = NLoginCore_027.D("њцтѭпЩмџѤѯѤѲѧѣѥѪњѝјќџѴрѼх҅ѝт҉цѝѣћќшҏҎѻҏџҁҕҐҀїҐѼҚ҉ѦѬҟѴѪѧѨ", (byte)21, 68);
                    NLoginCore_272.var_java_lang_String_arr_b[8] = NLoginCore_092.A("ĘĐĘßĖĢĞĜĖëäĈĬéăĪûĢąĭıóęëĉĆēČěöŀİ", (byte)21, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_272.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԡԣԣԿՉԛԹԹՒԑԮԧԯԭԐԱԱ՘ՇԶԭ՝Ԥԥ", (byte)21, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_272.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ԾՆԟԢԍՇԂՈՃԲԾԠԌՎԣԖՓԺԓ՜ԝԷԤԥ", (byte)21, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x69L;
        l ^= 0xA119AEB693A50225L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(20 + 49), (byte)(4 + 79), (byte)(13 + 34), (byte)(18 + 49), (byte)(7 + 59), (byte)(10 + 57), (byte)(39 + 8), (byte)(45 + 35), (byte)(54 + 21), (byte)(45 + 22), (byte)(16 + 67), 53, (byte)(68 + 12), (byte)(28 + 69), (byte)(90 + 10), (byte)(66 + 34), 105, (byte)(76 + 34), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.F("զճղԵյձլյրկԼպվշպրՂࢼ࣑࣊ࣙࣚ࣠ࢺ࣏ࣤ࣠", (byte)71, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_272.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    NLoginCore_272() {
    }
}

