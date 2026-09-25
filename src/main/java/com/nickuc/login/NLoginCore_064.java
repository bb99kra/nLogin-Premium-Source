/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_064
implements NLoginInterface_037 {
    private static int w;
    private static long r;
    private static long d;
    private static int az;
    private static int aj;
    private static final char[] var_char_arr_c;
    private static String[] var_java_lang_String_arr_a;
    private static int ar;
    private static long j;
    private static int aw;
    private static int l;
    private static int e;
    private static int au;
    private static int bg;
    private static int bf;
    private static int ay;
    private static int at;
    private static int an;
    private static int bd;
    private static int ab;
    private static int ao;
    private static int al;
    private static int ax;
    private static int ah;
    private static int bk;
    private static long ag;
    private static int ac;
    private static int q;
    private static int ad;
    private static int af;
    private static int am;
    private static int f;
    private static int y;
    private static int av;
    private static int g;
    private static int ba;
    private static long n;
    private static int v;
    private static int as;
    private static int ae;
    private static int o;
    private static int be;
    private static long k;
    private static long m;
    private static int bi;
    private static int i;
    private static long var_long_b;
    private static int z;
    private static int bl;
    private static long p;
    private static int aq;
    private static int bm;
    private static int ak;
    private static int h;
    private static int bc;
    private static int ap;
    private static int bn;
    private static int var_int_a;
    private static int bj;
    private static int t;
    private static int x;
    private static int aa;
    private static int bb;
    private static int u;
    private static long s;
    public static final String cq;
    private static int bh;
    private static long var_long_c;
    private static int ai;
    private static String[] var_java_lang_String_arr_b;

    private static String a(int n, long l) {
        l ^= 0x6DL;
        l ^= 0x97A6216AF9B419B5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(12 + 57), 83, (byte)(2 + 45), (byte)(57 + 10), (byte)(31 + 35), (byte)(46 + 21), (byte)(6 + 41), (byte)(12 + 68), 75, (byte)(7 + 60), (byte)(20 + 63), (byte)(12 + 41), (byte)(61 + 19), (byte)(54 + 43), (byte)(73 + 27), (byte)(12 + 88), (byte)(44 + 61), (byte)(75 + 35), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ĢįĮñıĭĨıļīøĶĺĳĶļþҐҚҍҏѴҘѿҝҒ", (byte)32, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_064.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private String B(String string) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance((String)NLoginCore_064.c("㺀", (int)q, (long)(r ^ s)));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8), t, string.length());
        return NLoginCore_064.e(messageDigest.digest());
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(9221519493257028968L);
        d = Long.reverse(-5332261958806667264L);
        e = (1024 >>> 40 | 1024 << -40) & 0xFFFFFFFF;
        f = 0 >>> 158 | 0 << ~158 + 1;
        g = Integer.reverse(0x40000000);
        h = Integer.reverse(-1073741824);
        i = (0x400000 >>> 86 | 0x400000 << -86) & 0xFFFFFFFF;
        j = Long.reverse(9221519493257028968L);
        k = Long.reverse(-5332261958806667264L);
        l = Integer.reverse(0x40000000);
        m = Long.reverse(9221519493257028968L);
        n = Long.reverse(-5332261958806667264L);
        o = (48 >>> 68 | 48 << ~68 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-3892962621645855384L);
        q = Integer.reverse(0x20000000);
        r = Long.reverse(9221519493257028968L);
        s = Long.reverse(-5332261958806667264L);
        t = Integer.reverse(0);
        u = Integer.reverse(0x40000000);
        v = Integer.reverse(0);
        w = Integer.reverse(0x40000000);
        x = 524288 >>> 177 | 524288 << -177;
        y = Integer.reverse(-268435456);
        z = Integer.reverse(0x40000000);
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(-268435456);
        ac = 6144 >>> 170 | 6144 << ~170 + 1;
        ad = Integer.reverse(0x60000000);
        ae = Integer.reverse(-1610612736);
        af = Integer.reverse(-1);
        ag = Long.reverse(-3892962621645855384L);
        ah = Integer.reverse(0x8000000);
        ai = 0 >>> 107 | 0 << ~107 + 1;
        aj = 0x600000 >>> 17 | 0x600000 << ~17 + 1;
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = 25088 >>> 73 | 25088 << ~73 + 1;
        am = 1 >>> 31 | 1 << ~31 + 1;
        an = 102400 >>> 107 | 102400 << ~107 + 1;
        ao = Integer.reverse(-1073741824);
        ap = Integer.reverse(-872415232);
        aq = (16 >>> 130 | 16 << ~130 + 1) & 0xFFFFFFFF;
        ar = Integer.reverse(0x2C000000);
        as = Integer.reverse(-1610612736);
        at = Integer.reverse(-1409286144);
        au = (3 >>> 223 | 3 << ~223 + 1) & 0xFFFFFFFF;
        av = (0x6C0000 >>> 241 | 0x6C0000 << -241) & 0xFFFFFFFF;
        aw = Integer.reverse(-536870912);
        ax = 220 >>> 130 | 220 << -130;
        ay = Integer.reverse(0x10000000);
        az = 7 >>> 29 | 7 << -29;
        ba = Integer.reverse(-1879048192);
        bb = Integer.reverse(-1677721600);
        bc = Integer.reverse(0x50000000);
        bd = Integer.reverse(-2046820352);
        be = Integer.reverse(-805306368);
        bf = Integer.reverse(0x46000000);
        bg = (0x3000000 >>> 182 | 0x3000000 << ~182 + 1) & 0xFFFFFFFF;
        bh = Integer.reverse(-973078528);
        bi = 53248 >>> 204 | 53248 << ~204 + 1;
        bj = (12800 >>> 103 | 12800 << ~103 + 1) & 0xFFFFFFFF;
        bk = (917504 >>> 48 | 917504 << -48) & 0xFFFFFFFF;
        bl = 25856 >>> 8 | 25856 << ~8 + 1;
        bm = 0xF000000 >>> 184 | 0xF000000 << ~184 + 1;
        bn = (208896 >>> 107 | 208896 << -107) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ac];
        var_java_lang_String_arr_b = new String[ad];
        NLoginCore_064.b();
        cq = NLoginCore_064.c("㺀", (int)(ae & af), (long)ag);
        char[] cArray = new char[ah];
        cArray[NLoginCore_064.ai] = aj;
        cArray[NLoginCore_064.ak] = al;
        cArray[NLoginCore_064.am] = an;
        cArray[NLoginCore_064.ao] = ap;
        cArray[NLoginCore_064.aq] = ar;
        cArray[NLoginCore_064.as] = at;
        cArray[NLoginCore_064.au] = av;
        cArray[NLoginCore_064.aw] = ax;
        cArray[NLoginCore_064.ay] = az;
        cArray[NLoginCore_064.ba] = bb;
        cArray[NLoginCore_064.bc] = bd;
        cArray[NLoginCore_064.be] = bf;
        cArray[NLoginCore_064.bg] = bh;
        cArray[NLoginCore_064.bi] = bj;
        cArray[NLoginCore_064.bk] = bl;
        cArray[NLoginCore_064.bm] = bn;
        var_char_arr_c = cArray;
    }

    private static String e(byte ... byArray) {
        char[] cArray = new char[byArray.length * u];
        for (int i = v; i < byArray.length; ++i) {
            cArray[i * NLoginCore_064.w] = var_char_arr_c[byArray[i] >> x & y];
            cArray[i * NLoginCore_064.z + NLoginCore_064.aa] = var_char_arr_c[byArray[i] & ab];
        }
        return new String(cArray);
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray = string2.split((String)NLoginCore_064.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        if (stringArray.length != e) {
            return f != 0;
        }
        String string3 = stringArray[g];
        String string4 = stringArray[h];
        String string5 = (String)NLoginCore_064.c("㺃", (int)i, (long)(j ^ k)) + string + (String)NLoginCore_064.c("㺆", (int)l, (long)(m ^ n)) + string3 + (String)NLoginCore_064.c("㺉", (int)o, (long)p) + string;
        return string4.equals(this.B(string5));
    }

    private static void b() {
        int n;
        var_long_c = 1632334039058128894L;
        long l = var_long_c ^ 0x97A6216AF9B419B5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(22 + 47), (byte)(13 + 70), (byte)(19 + 28), 67, (byte)(32 + 34), (byte)(54 + 13), (byte)(3 + 44), (byte)(19 + 61), (byte)(32 + 43), (byte)(49 + 18), (byte)(51 + 32), (byte)(15 + 38), (byte)(25 + 55), (byte)(88 + 9), (byte)(22 + 78), (byte)(32 + 68), (byte)(36 + 69), (byte)(31 + 79), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_064.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ԪԪԓԶӭԑԗԤԐӻӴԂ", (byte)87, 67);
                    NLoginCore_064.var_java_lang_String_arr_b[1] = NLoginCore_427.F("Ռօչր֐քցփև֑խ֏Քն֐֙ը֗տո֠թզէ", (byte)87, 70);
                    NLoginCore_064.var_java_lang_String_arr_b[2] = NLoginCore_091.E("վգժՈլֆՄտֆօթՒ֔թզ֓շ՝կ՚թթզէ", (byte)87, 69);
                    NLoginCore_064.var_java_lang_String_arr_b[3] = NLoginCore_453.B("ƢţŠŲŧƣūŭƯƚŰŽŻƱƳƔƃŶƱƥƏƩƀƁ", (byte)87, 66);
                    NLoginCore_064.var_java_lang_String_arr_b[4] = NLoginCore_201.B("ŶŵƆƦƪƋƥƍƯŽƀŵ", (byte)87, 66);
                    NLoginCore_064.var_java_lang_String_arr_b[5] = NLoginCore_201.E("֋ՌՌ։րլեէՓղ֊զՒ՗֖ղ֗֎լ֒ի֏զէ", (byte)87, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_064.var_java_lang_String_arr_b[0] = NLoginCore_387.E("ա֍վ՜վթր՟ՐցՑ՛", (byte)87, 69);
                    NLoginCore_064.var_java_lang_String_arr_b[1] = NLoginCore_559.F("Ռօչր֐քցփև֑ժ֊֓պ֕֕Օ֓հիտ֘֘հՖ֥֎գ֦էդ֢", (byte)87, 70);
                    NLoginCore_064.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ƘŽƄŢƆƠŞƙƠƟƁƪŬơƱƎƯơƓƥƎƃƀƁ", (byte)87, 65);
                    NLoginCore_064.var_java_lang_String_arr_b[3] = NLoginCore_223.D("ԯӰӭӿӴ԰ӸӺԼԧӯԪԓԹ԰ՀԞԲԐԴԆԩՂԡԃԙԝԅՊԇԯԠ", (byte)87, 68);
                    NLoginCore_064.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ԅӳԆӵөԠԉԹ԰ԧԗԦԱӶӼԼԾԮԱ԰ՃԐԍԎ", (byte)87, 67);
                    NLoginCore_064.var_java_lang_String_arr_b[5] = NLoginCore_446.B("ƥŦŦƣƚƆſƁŭƌƥŬƟƒƞƫƖưƭƲƶƃƀƁ", (byte)87, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_064.var_java_lang_String_arr_b[0] = NLoginCore_004.B("ƀżžŢƃƣƂƪƭƩƈźŪųƏƣơŷŮŹƇƃƀƁ", (byte)87, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_064.var_java_lang_String_arr_b[0] = NLoginCore_091.E("֊ՙէթՇտ՟սֈ֊Ս՛", (byte)87, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_064.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.F("ӱԓԕӵԙԸ԰ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)13, 70), NLoginCore_064.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("пьыЎюъхюљшЕѓїѐѓљЛޭ޷ުެޑ޵ޜ޺ޯа", (byte)13, 67) + string + NLoginCore_427.F("ԃ", (byte)13, 70) + methodType.toString(), exception);
        }
    }
}

