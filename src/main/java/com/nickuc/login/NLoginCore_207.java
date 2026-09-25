/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
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

public class NLoginCore_207
extends NLoginCore_353 {
    private static int t;
    private static int f;
    private static long var_long_c;
    private static int r;
    private static long m;
    private static int var_int_c;
    private static long d;
    private static int q;
    private static long p;
    private static int h;
    private static long e;
    private static int o;
    private static int u;
    private static String[] a;
    private static int l;
    private static int i;
    private static String[] b;
    private static int n;
    private static int s;
    private static int k;
    private static int g;
    private static int j;
    private static int v;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.z, new Object[i]);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_509 NLoginCore_5092 = this.a.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        if (NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e)) {
            return;
        }
        NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
        if (stringArray.length < j) {
            NLoginInterface_0242.a((String)NLoginCore_207.c("㺀", (int)(k & l), (long)m));
            return;
        }
        String string = stringArray[n];
        if (string.equals(NLoginCore_207.c("㺃", (int)o, (long)p))) {
            int n = NLoginCore_449.a(stringArray[q], (Integer)r);
            int n2 = NLoginCore_449.a(stringArray[s], (Integer)t);
            Object object = NLoginCore_5092.var_java_lang_Object_n;
            synchronized (object) {
                NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
                if (NLoginCore_5012 == null) {
                    return;
                }
                NLoginCore_445 NLoginCore_4452 = NLoginCore_445.a(n2);
                if (NLoginCore_4452 == null) {
                    return;
                }
                NLoginCore_154 NLoginInterface_0122 = NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b();
                if (NLoginInterface_0122.com_nickuc_login_NLoginCore_211_a().v() != n) {
                    return;
                }
                NLoginInterface_0122.a((NLoginType_008)this.a, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    public NLoginCore_207(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_207.c("㺀", (int)var_int_c, (long)(d ^ e)), null, f != 0, g != 0, new String[h]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_207.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.A("ŏűųœŷƖƎƤƐşƝƓơƛŤƉƫƪƢƨƢŷ", (byte)84, 65), NLoginCore_207.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.C("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰࡾ࡫ࡽ࢈ࡾࢄࡼࡲࢋࡱࡾࢀ࢒ԉ", (byte)84, 67) + string + NLoginCore_384.C("ӫ", (byte)84, 67) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        var_long_c = -2267680980486889833L;
        long l = var_long_c ^ 0x3A2169CB1C77149FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(24 + 45), (byte)(20 + 63), (byte)(21 + 26), (byte)(7 + 60), 66, (byte)(28 + 39), (byte)(34 + 13), (byte)(64 + 16), (byte)(21 + 54), (byte)(29 + 38), (byte)(66 + 17), (byte)(3 + 50), (byte)(22 + 58), (byte)(79 + 18), (byte)(79 + 21), (byte)(67 + 33), 105, (byte)(72 + 38), (byte)(99 + 4)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_207.b[0] = NLoginCore_004.C("ոդ՟բՉփե։գ֍ջՖ", (byte)115, 67);
                    NLoginCore_207.b[1] = NLoginCore_027.D("եֈփՄբԾքևըՐխՋթ֊ՔղՕ֘մդժ֚՗ժ֒՝֍՛սռբցճ֤֛֞չ֪֡֏զևռք֞տֆַօ֭֯չջ֪շնֳּ֡֞֏֖׃վַ֠֗֕։׈ֶ׉׌ׅ׃ְ֎ֳ֥׈ֳׅ֒֨ד֤֢֡", (byte)115, 68);
                    NLoginCore_207.b[2] = NLoginCore_384.A("ƶƹƫǠƯǟǜƷǔƣƥƱǪǡƶǮǍǙƮǍƨǱƸƹ", (byte)115, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_207.b[0] = NLoginCore_446.E("գոյ֧֛֘֗֟֩֞֩։֤֭֫֩ֈֻ֫շֻ֭ւփ", (byte)115, 69);
                    NLoginCore_207.b[1] = NLoginCore_092.D("եֈփՄբԾքևըՐխՋթ֊ՔղՕ֘մդժ֚՗ժ֒՝֍՛սռբցճ֤֛֞չ֪֡֏զևռք֞տֆַօ֭֯չջ֪շնֳּ֡֞֏֖׃վַ֠֗֕։׈ֶ׉׌ׅ׆׎ּ֬֎ה֑֓׍ז֪זֱ֔֙֗אׂ׎מץ׀", (byte)115, 68);
                    NLoginCore_207.b[2] = NLoginCore_091.E("րփյ֪չ֦֩ց֞խկֲտ֐֮օָ֣֊֯ք֥֟նְ֑֮֮֩֎րֆ", (byte)115, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_207.b[0] = NLoginCore_387.A("ƙƹƵƚƙƱǗƲǧǓǈƩƢǔǜƭƺǃƩǣƽǒǞǡǤǒǲǯǆǋǑƽ", (byte)115, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_207.b[0] = NLoginCore_201.D("ձ՚եդմ՚ՠֆՌրջՖ", (byte)115, 68);
                }
            }
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-1622751148611346169L);
        e = Long.reverse(0x1A00000000000000L);
        f = Integer.reverse(0);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0);
        i = Integer.reverse(0);
        j = (4 >>> 224 | 4 << ~224 + 1) & 0xFFFFFFFF;
        k = (0x2000000 >>> 185 | 0x2000000 << ~185 + 1) & 0xFFFFFFFF;
        l = -1 >>> 151 | -1 << ~151 + 1;
        m = Long.reverse(-902175208232066809L);
        n = (256 >>> 232 | 256 << ~232 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(0x40000000);
        p = Long.reverse(-902175208232066809L);
        q = Integer.reverse(0x40000000);
        r = -1 >>> 52 | -1 << ~52 + 1;
        s = 0xC00000 >>> 214 | 0xC00000 << -214;
        t = -1 >>> 247 | -1 << ~247 + 1;
        u = Integer.reverse(-1073741824);
        v = 196608 >>> 144 | 196608 << -144;
        a = new String[u];
        b = new String[v];
        NLoginCore_207.void_b();
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0x3A2169CB1C77149FL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(32 + 37), (byte)(22 + 61), (byte)(39 + 8), (byte)(34 + 33), (byte)(55 + 11), (byte)(51 + 16), (byte)(21 + 26), 80, (byte)(46 + 29), (byte)(14 + 53), 83, (byte)(48 + 5), (byte)(59 + 21), (byte)(10 + 87), (byte)(25 + 75), (byte)(4 + 96), (byte)(35 + 70), (byte)(74 + 36), (byte)(52 + 51)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(36 + 33), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ĐĝĜßğěĖğĪęæĤĨġĤĪìѺѧѹ҄ѺҀѸѮ҇ѭѺѼҎ", (byte)23, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_207.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }
}

