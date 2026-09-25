/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.PBKDF2HashProvider;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_370;
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

public class SHA256HashProvider
extends PBKDF2HashProvider
implements NLoginInterface_037 {
    private static int at;
    private static int ad;
    private static long j;
    private static String[] d;
    private static long af;
    private static int av;
    private static int v;
    private static int az;
    private static long ap;
    private static int n;
    private static int ah;
    private static int an;
    private static long e;
    private static long bd;
    private static int aw;
    private static int bb;
    private static int w;
    private static long ae;
    private static int ag;
    private static int au;
    private static long as;
    private static int ax;
    private static int al;
    private static long aj;
    private static int q;
    private static int f;
    private static long h;
    private static int p;
    private static long be;
    private static long ai;
    private static final String cn;
    private static int ar;
    private static int ay;
    private static int ba;
    private static int am;
    private static long r;
    private static int ak;
    private static String[] c;
    private static long t;
    private static long aq;
    private static int bc;
    private static int k;
    private static int ao;

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray = string2.split((String)SHA256HashProvider.c("㺀", (int)f, (long)(h ^ j)));
        if (stringArray.length != k) {
            return n != 0;
        }
        if (!stringArray[p].equalsIgnoreCase((String)SHA256HashProvider.c("㺃", (int)q, (long)(r ^ t)))) {
            return v != 0;
        }
        Integer n = NLoginCore_449.java_lang_Integer_a(stringArray[w]);
        if (n == null) {
            NLoginCore_370.c((String)SHA256HashProvider.c("㺆", (int)ad, (long)(ae ^ af)) + stringArray[ag] + (String)SHA256HashProvider.c("㺉", (int)ah, (long)(ai ^ aj)), new Object[ak]);
            return al != 0;
        }
        String string3 = stringArray[am];
        byte[] byArray = SHA256HashProvider.d(stringArray[an]);
        byte[] byArray2 = SHA256HashProvider.a((String)SHA256HashProvider.c("㺌", (int)ao, (long)(ap ^ aq)), string.toCharArray(), string3.getBytes(), n, SHA256HashProvider.b((String)SHA256HashProvider.c("㺏", (int)ar, (long)as)));
        return PBKDF2HashProvider.a(byArray, byArray2);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(SHA256HashProvider.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.F("՞րւբֆֳ֥֝֟ծְ֢֪֬ճֱֱַֺֹ֘ֆ", (byte)122, 70), SHA256HashProvider.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("֦֥֙ըֳ֤֢֨֟֨կֱֳ֪֭֭յऀऋࣼँऄऎउࣷःࣰऌऑࣧचࣩ֐", (byte)122, 69) + string + NLoginCore_091.C("՝", (byte)122, 67) + methodType.toString(), exception);
        }
    }

    private static byte[] d(String string) {
        int n = string.length();
        byte[] byArray = new byte[n / at];
        for (int i = au; i < n; i += 2) {
            byArray[i / SHA256HashProvider.av] = (byte)((Character.digit(string.charAt(i), aw) << ax) + Character.digit(string.charAt(i + ay), az));
        }
        return byArray;
    }

    private static String a(int n, long l) {
        l ^= 0x5BL;
        l ^= 0x3DEE4235D0FCB471L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(65 + 4), (byte)(82 + 1), (byte)(20 + 27), (byte)(35 + 32), (byte)(5 + 61), 67, (byte)(37 + 10), 80, (byte)(53 + 22), (byte)(40 + 27), (byte)(45 + 38), (byte)(37 + 16), (byte)(68 + 12), (byte)(76 + 21), (byte)(11 + 89), (byte)(68 + 32), (byte)(99 + 6), (byte)(35 + 75), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.D("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬ߷ࠂ߳߸߻ࠅࠀ߮ߺߧࠃࠈߞࠑߠ", (byte)40, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            SHA256HashProvider.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        e = 4981869415789669410L;
        long l = e ^ 0x3DEE4235D0FCB471L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(56 + 13), (byte)(60 + 23), (byte)(10 + 37), (byte)(36 + 31), (byte)(55 + 11), (byte)(21 + 46), 47, (byte)(62 + 18), (byte)(19 + 56), (byte)(42 + 25), (byte)(72 + 11), (byte)(46 + 7), (byte)(16 + 64), (byte)(85 + 12), (byte)(81 + 19), (byte)(37 + 63), 105, (byte)(106 + 4), (byte)(99 + 4)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
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
                    SHA256HashProvider.d[0] = NLoginCore_027.E("֚֐ս֡֙ֈւ֣իծշմ", (byte)112, 69);
                    SHA256HashProvider.d[1] = NLoginCore_027.A("ƮǓƔƬƲƼǙƪƖǘƔǡƮǛƠƴơǙǩǃǄǅƲƳ", (byte)112, 65);
                    SHA256HashProvider.d[2] = NLoginCore_559.D("ըՈԺՀմ՜քռՆկֆեեըզէւոըկլփլկ֏ՉՑՔ֚փ֍֞֞ֈ֕ձ֣մ֢՟՝֥ր֪֢֥֣շզ֢֋֋֎ִ։֤֌֖֩֬շִַָֻּ֪֮֞ռջֽׁ֥֘֝֠֟׉ׅ׌א֌׋׏ׄגֿ֎֪֗֋֮ז׊ׇ", (byte)112, 68);
                    SHA256HashProvider.d[3] = NLoginCore_324.F("դ֕֞դև֣վ֢֭֠֟մ", (byte)112, 70);
                    SHA256HashProvider.d[4] = NLoginCore_027.A("ƮƫǅƫǉǖǌǛƮǞǜƢƠƟƯǥǃǩǜƣǖƵƲƳ", (byte)112, 65);
                    SHA256HashProvider.d[5] = NLoginCore_446.E("ջո֒ո֖֣֙֨ջ֫֩կխլռֲ֐ֶ֩հ֣ւտր", (byte)112, 69);
                    SHA256HashProvider.d[6] = NLoginCore_427.F("ջո֒ո֖֣֙֨ջ֫֩կխլռֲ֐ֶ֩հ֣ւտր", (byte)112, 70);
                    continue block7;
                }
                case 1: {
                    SHA256HashProvider.d[0] = NLoginCore_004.F("֠զճ֦։թբռսլ֙մ", (byte)112, 70);
                    SHA256HashProvider.d[1] = NLoginCore_324.C("ՔչԺՒ՘բտՐԼվՇ՞ՊնբևՙչւՋօ՛՘ՙ", (byte)112, 67);
                    SHA256HashProvider.d[2] = NLoginCore_559.F("֏կաէ֛փ֣֫խ֖֭֌֌֏֍֎֩֟֏ֶ֖֪֖֓֓հոջִּׁ֪ׅׅ֯֘׊֛׉ֆք׌֧ב׉׌׊֞֍׉ֲֲֵכְ׋ֳאֽד֞מכׅוןףעבֿ֣֢ׄ׌ׇרפ׆װ׬׳׷ֳײ׶׮׋׭׽׷ױ־ׯּ׭׸", (byte)112, 70);
                    SHA256HashProvider.d[3] = NLoginCore_201.F("բ֜ղ֡դ֞գ֣֭իտմ", (byte)112, 70);
                    SHA256HashProvider.d[4] = NLoginCore_004.D("ՔՑիՑկռղցՔքւՄ՝սՂրվև՘փլ՛՘ՙ", (byte)112, 68);
                    SHA256HashProvider.d[5] = NLoginCore_559.A("ƮƫǅƫǉǖǌǛƮǞǞƢǓǥǇƣǕǅǓǜǘƵƲƳ", (byte)112, 65);
                    SHA256HashProvider.d[6] = NLoginCore_384.F("ջո֒ո֖֣֙֨ջ֫֫֙֡ֈխִ֦֩֊նָ֚տր", (byte)112, 70);
                    continue block7;
                }
                case 2: {
                    SHA256HashProvider.d[0] = NLoginCore_091.E("֦֦յ֑֖բ֘֫֊֤պ֜վձև֊ְֱխָո֑֧֭֕֬ն֚֋ְ֘֕", (byte)112, 69);
                    continue block7;
                }
                case 4: {
                    SHA256HashProvider.d[0] = NLoginCore_110.A("ƗƯƖƤǘǔƬǔƠǛƚǡƝƟǧǤǂƻǂƝǌǥǘƫǪǝƬƿƱǣƵǦ", (byte)112, 65);
                }
            }
        }
    }

    static {
        f = (0 >>> 129 | 0 << ~129 + 1) & 0xFFFFFFFF;
        h = Long.reverse(4914942000171893922L);
        j = Long.reverse(-2738188573441261568L);
        k = Integer.reverse(0x20000000);
        n = (0 >>> 170 | 0 << ~170 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Long.reverse(4914942000171893922L);
        t = Long.reverse(-2738188573441261568L);
        v = 0 >>> 72 | 0 << ~72 + 1;
        w = Integer.reverse(Integer.MIN_VALUE);
        ad = Integer.reverse(0x40000000);
        ae = Long.reverse(4914942000171893922L);
        af = Long.reverse(-2738188573441261568L);
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = (96 >>> 197 | 96 << -197) & 0xFFFFFFFF;
        ai = Long.reverse(4914942000171893922L);
        aj = Long.reverse(-2738188573441261568L);
        ak = Integer.reverse(0);
        al = (0 >>> 222 | 0 << ~222 + 1) & 0xFFFFFFFF;
        am = Integer.reverse(0x40000000);
        an = (12288 >>> 172 | 12288 << ~172 + 1) & 0xFFFFFFFF;
        ao = Integer.reverse(0x20000000);
        ap = Long.reverse(4914942000171893922L);
        aq = Long.reverse(-2738188573441261568L);
        ar = Integer.reverse(-1610612736);
        as = Long.reverse(-7046618610124143454L);
        at = Integer.reverse(0x40000000);
        au = Integer.reverse(0);
        av = 65536 >>> 111 | 65536 << ~111 + 1;
        aw = 0x10000000 >>> 56 | 0x10000000 << ~56 + 1;
        ax = Integer.reverse(0x20000000);
        ay = Integer.reverse(Integer.MIN_VALUE);
        az = 0x200000 >>> 241 | 0x200000 << ~241 + 1;
        ba = Integer.reverse(-536870912);
        bb = (57344 >>> 109 | 57344 << -109) & 0xFFFFFFFF;
        bc = Integer.reverse(0x60000000);
        bd = Long.reverse(4914942000171893922L);
        be = Long.reverse(-2738188573441261568L);
        c = new String[ba];
        d = new String[bb];
        SHA256HashProvider.b();
        cn = SHA256HashProvider.c("㺀", (int)bc, (long)(bd ^ be));
    }
}

