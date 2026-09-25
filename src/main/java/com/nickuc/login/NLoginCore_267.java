/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_016;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_060;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_267
implements NLoginInterface_016 {
    private static int j;
    private static int p;
    private static String[] var_java_lang_String_arr_b;
    private static int o;
    private static int n;
    private static long var_long_b;
    private static int q;
    private static int var_int_a;
    private static long h;
    private static int r;
    private static long k;
    private static int e;
    private static long s;
    private static int f;
    private static long l;
    private static long d;
    private static int m;
    private static final String cv;
    private static long c;
    private static String[] var_java_lang_String_arr_a;
    private final NLoginCore_276 var_com_nickuc_login_NLoginCore_276_b;
    private static long g;
    private static int i;

    /* synthetic */ NLoginCore_267(NLoginCore_276 NLoginCore_2762, NLoginCore_060 NLoginCore_0602) {
        this(NLoginCore_2762);
    }

    static {
        var_int_a = 0 >>> 212 | 0 << -212;
        var_long_b = Long.reverse(8745282070864782262L);
        d = Long.reverse(-5620492334958379008L);
        e = Integer.reverse(-1);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(8745282070864782262L);
        h = Long.reverse(-5620492334958379008L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = 262144 >>> 81 | 262144 << -81;
        k = Long.reverse(8745282070864782262L);
        l = Long.reverse(-5620492334958379008L);
        m = 0x8000000 >>> 155 | 0x8000000 << ~155 + 1;
        n = Integer.reverse(0);
        o = Integer.reverse(0);
        p = (0x40000000 >>> 220 | 0x40000000 << ~220 + 1) & 0xFFFFFFFF;
        q = 4 >>> 96 | 4 << ~96 + 1;
        r = Integer.reverse(-1073741824);
        s = Long.reverse(-3792739291734678602L);
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_267.b();
        cv = NLoginCore_267.c("㺀", (int)r, (long)s);
    }

    private static String a(int n, long l) {
        l ^= 0x4DL;
        l ^= 0xF057451CB9419978L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(33 + 36), (byte)(59 + 24), (byte)(34 + 13), (byte)(25 + 42), (byte)(23 + 43), (byte)(18 + 49), (byte)(7 + 40), (byte)(28 + 52), (byte)(23 + 52), (byte)(12 + 55), 83, 53, (byte)(78 + 2), (byte)(96 + 1), (byte)(49 + 51), (byte)(70 + 30), (byte)(21 + 84), (byte)(89 + 21), (byte)(87 + 16)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.B("âïî±ñíèñüë¸öúóöü¾јзєљћђчџѠ", (byte)0, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_267.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public boolean filter(String string, String string2, Object ... objectArray) {
        String[] stringArray;
        int n = string2.indexOf((String)NLoginCore_267.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        if (n > e && string2.length() - (n += ((String)NLoginCore_267.c("㺃", (int)f, (long)(g ^ h))).length()) > i && (stringArray = string2.substring(n).split((String)NLoginCore_267.c("㺆", (int)j, (long)(k ^ l)))).length > m) {
            String string3 = stringArray[NLoginCore_267.n].toLowerCase(Locale.ENGLISH);
            return this.var_com_nickuc_login_NLoginCore_276_b.a().stream().anyMatch(string3::equals);
        }
        return o != 0;
    }

    @Generated
    private NLoginCore_267(NLoginCore_276 NLoginCore_2762) {
        this.var_com_nickuc_login_NLoginCore_276_b = NLoginCore_2762;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_267.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.F("ӦԈԊӪԎԭԥԻԧӶԴԪԸԲӻԠՂՁԹԿԹԎ", (byte)2, 70), NLoginCore_267.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.C("ОЫЪϭЭЩФЭиЧϴвжЯвиϺޔݳސޕޗގރޛޜЏ", (byte)2, 67) + string + NLoginCore_091.E("Ӹ", (byte)2, 69) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 7910359984303422110L;
        long l = c ^ 0xF057451CB9419978L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(52 + 17), (byte)(67 + 16), 47, (byte)(31 + 36), (byte)(61 + 5), (byte)(2 + 65), (byte)(37 + 10), (byte)(68 + 12), (byte)(9 + 66), (byte)(3 + 64), (byte)(79 + 4), (byte)(35 + 18), (byte)(29 + 51), 97, (byte)(10 + 90), (byte)(63 + 37), (byte)(79 + 26), (byte)(58 + 52), (byte)(47 + 56)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
                    NLoginCore_267.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ֱ֭֭֜ֆռ֋ִ֎ְְֵլַֻ֕ռ֮֝֘֯ռְ֬֞֟׃ջ׊ֽ֪֨", (byte)121, 70);
                    NLoginCore_267.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ֱ֭֭֜ֆռ֋ִ֎ְְֵլַֻ֕ռ֮֝֘֯ռְ֬֞֟׃ջ׊ֽ֪֨", (byte)121, 69);
                    NLoginCore_267.var_java_lang_String_arr_b[2] = NLoginCore_091.A("ƶǔǉǀƿǙǫǩǋǠǐƹ", (byte)121, 65);
                    NLoginCore_267.var_java_lang_String_arr_b[3] = NLoginCore_091.C("֘և֜֘ձէն֟չ֛֛֠՗֢֦րէֈ֙փ֚է֛֗։֊֮զֵ֓֨֕", (byte)121, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_267.var_java_lang_String_arr_b[0] = NLoginCore_076.E("ֱ֭֭֜ֆռ֋ִ֎ְְֵլַֻ֕ռָ֣֤֮֝֘֯ׄ֟׉֖׈֢׋ׅ֣֣֍אֱִֿׅ֑֯׊֝", (byte)121, 69);
                    NLoginCore_267.var_java_lang_String_arr_b[1] = NLoginCore_027.F("ֱ֭֭֜ֆռ֋ִ֎ְְֵլַֻ֕ռ֮֝֘֯׃ջւָׁ֤֖׃փօ֌֫֝ֆ֎ְֳ֢֝֬֓ז֝", (byte)121, 70);
                    NLoginCore_267.var_java_lang_String_arr_b[2] = NLoginCore_138.F("ցծֳ֮֟֒֠իև֩ճս", (byte)121, 70);
                    NLoginCore_267.var_java_lang_String_arr_b[3] = NLoginCore_324.D("֘և֜֘ձէն֟չ֛֛֠՗֢֦րէֈ֙փ֚զխ֏֑֑֜֟֜ւճր֘֍օֲֳ֝֝֔֋֙֗ֈ", (byte)121, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_267.var_java_lang_String_arr_b[0] = NLoginCore_575.B("ǘǀƺǦǂǈƮǊƾǮǥǔǮǥƵƵǻƳƳǐƼǵƿǝǞȄǱǄǿǅǣǇ", (byte)121, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_267.var_java_lang_String_arr_b[0] = NLoginCore_453.C("֒։֓֔֐՞լՖ֋ՙ֍ը", (byte)121, 67);
                }
            }
        }
    }
}

