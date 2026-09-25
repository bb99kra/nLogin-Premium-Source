/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.PBKDF2HashProvider;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginInterface_009;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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

public class NLoginCore_375
extends PBKDF2HashProvider
implements NLoginInterface_009 {
    private static int w;
    private static int ad;
    private static long ai;
    private static int k;
    private static int ae;
    private static long e;
    private static int p;
    private static String[] d;
    private static int q;
    private static int aj;
    private static int n;
    private static long h;
    private static int f;
    private static int ah;
    private static long ag;
    private static long j;
    private static int s;
    private static String[] c;
    private static int v;
    private static int ak;
    private static int af;

    private static void b() {
        int n;
        e = -4428119974517737802L;
        long l = e ^ 0xF5537E57A0F0C00DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(41 + 28), (byte)(66 + 17), (byte)(31 + 16), (byte)(42 + 25), 66, (byte)(34 + 33), 47, (byte)(32 + 48), (byte)(60 + 15), (byte)(37 + 30), (byte)(69 + 14), (byte)(23 + 30), (byte)(6 + 74), (byte)(75 + 22), (byte)(27 + 73), (byte)(60 + 40), (byte)(50 + 55), (byte)(37 + 73), (byte)(61 + 42)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(31 + 37), 69, (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_375.d[0] = NLoginCore_138.E("Կ՟ձՒՍ՚ՄԴծԴ՛Մ", (byte)64, 69);
                    NLoginCore_375.d[1] = NLoginCore_559.C("ӣӘӛӛӈӇӎӔӄӪӑӃӺөӷҸәӯһӓҸӱӈӉ", (byte)64, 67);
                    NLoginCore_375.d[2] = NLoginCore_384.E("ՇԶյՙլԵ՘զՅՑ՟Մ", (byte)64, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_375.d[0] = NLoginCore_446.E("գզԭՌՏԺՕձ՘յԶՄ", (byte)64, 69);
                    NLoginCore_375.d[1] = NLoginCore_138.A("ŭŢťťŒőŘŞŎŴŝŰŃĿřńƁƁłŘƊƋŒœ", (byte)64, 65);
                    NLoginCore_375.d[2] = NLoginCore_324.E("էԳՈՊՋԳՌՇԹ՜ՋՄ", (byte)64, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_375.d[0] = NLoginCore_092.B("ŃŃŷŃżűķŌŎŐœĻŔşřŸŝƃŖŋťŻŒœ", (byte)64, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_375.d[0] = NLoginCore_201.A("ŔūūıĹŎİĿŨĿżĿŭťžžũśŲųţŉŇŁƏŋŜţŌſŬŲ", (byte)64, 65);
                }
            }
        }
    }

    @Override
    public String java_lang_String_w(String string) {
        String string2 = NLoginCore_532.ae.a(new Object[ad]);
        int n = NLoginCore_532.ad.r();
        return (String)NLoginCore_375.c("㺀", (int)(ae & af), (long)ag) + string2 + (String)NLoginCore_375.c("㺃", (int)ah, (long)ai) + NLoginCore_375.c(string2, n, string);
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray = string2.split((String)NLoginCore_375.c("㺀", (int)f, (long)(h ^ j)));
        if (stringArray.length != k) {
            return n != 0;
        }
        String string3 = stringArray[p];
        int n = Integer.parseInt(stringArray[q]);
        int n2 = NLoginCore_375.b(string3);
        byte[] byArray = Base64.getUrlDecoder().decode(stringArray[s]);
        byte[] byArray2 = Base64.getUrlDecoder().decode(stringArray[v]);
        byte[] byArray3 = NLoginCore_375.a(string3, string.toCharArray(), byArray, n, n2);
        return NLoginCore_375.a(byArray2, byArray3);
    }

    private static String a(int n, long l) {
        l ^= 0xFL;
        l ^= 0xF5537E57A0F0C00DL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(56 + 13), (byte)(36 + 47), (byte)(26 + 21), (byte)(11 + 56), (byte)(4 + 62), 67, (byte)(25 + 22), (byte)(40 + 40), 75, (byte)(36 + 31), (byte)(30 + 53), (byte)(10 + 43), (byte)(54 + 26), (byte)(24 + 73), (byte)(65 + 35), (byte)(83 + 17), (byte)(48 + 57), (byte)(51 + 59), (byte)(79 + 24)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣻࣸࣤऀࣿःआउࣷऄ࣭आࣙईࣰ", (byte)109, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_375.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    @Override
    public boolean v(String string) {
        return w != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_375.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.B("ƓƵƷƗƻǚǒǨǔƣǡǗǥǟƨǍǯǮǦǬǦƻ", (byte)118, 66), NLoginCore_375.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.A("ǎǛǚƝǝǙǔǝǨǗƤǢǦǟǢǨƪԽԺԦՂՁՅՈՋԹՆԯՈԛՊԲǅ", (byte)118, 65) + string + NLoginCore_173.D("Ց", (byte)118, 68) + methodType.toString(), exception);
        }
    }

    static {
        f = Integer.reverse(0);
        h = Long.reverse(7885644704188215619L);
        j = Long.reverse(-1152921504606846976L);
        k = 0x6000000 >>> 88 | 0x6000000 << -88;
        n = 0 >>> 142 | 0 << -142;
        p = 0x40000000 >>> 93 | 0x40000000 << ~93 + 1;
        q = 0x1800000 >>> 151 | 0x1800000 << ~151 + 1;
        s = Integer.reverse(0x20000000);
        v = 20 >>> 66 | 20 << -66;
        w = (0 >>> 27 | 0 << ~27 + 1) & 0xFFFFFFFF;
        ad = (0 >>> 29 | 0 << -29) & 0xFFFFFFFF;
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = -1 >>> 29 | -1 << ~29 + 1;
        ag = Long.reverse(-7102334855700795069L);
        ah = 2048 >>> 170 | 2048 << -170;
        ai = Long.reverse(-7102334855700795069L);
        aj = 192 >>> 198 | 192 << -198;
        ak = Integer.reverse(-1073741824);
        c = new String[aj];
        d = new String[ak];
        NLoginCore_375.b();
    }
}

