/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_310;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_240
extends NLoginCore_310 {
    private static int aa;
    private static int t;
    private static int ab;
    private static int ai;
    private static long e;
    private static int aj;
    private static long au;
    private final NLoginType_010 a;
    private static int ba;
    private static int bb;
    private static long at;
    private static int m;
    private static int ar;
    private static String[] c;
    private static int ap;
    private static long ah;
    private static int am;
    private static int o;
    private static String[] d;
    private static int ad;
    private static long u;
    private static int l;
    private static int y;
    private static int av;
    private static long af;
    private static int ax;

    private static String a(int n, long l) {
        l ^= 0x3BL;
        l ^= 0xC5175FAA6E4CACFAL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(66 + 3), (byte)(79 + 4), (byte)(37 + 10), (byte)(60 + 7), (byte)(19 + 47), (byte)(65 + 2), (byte)(8 + 39), (byte)(5 + 75), (byte)(62 + 13), (byte)(30 + 37), (byte)(44 + 39), (byte)(27 + 26), (byte)(35 + 45), (byte)(45 + 52), (byte)(64 + 36), (byte)(99 + 1), (byte)(40 + 65), 110, 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.C("բկծԱձխըձռիԸնպճնռԾࢹࣉࢦࣙࣛࣉ࣑ࣗࣛࣔࢭ", (byte)110, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_240.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    static {
        l = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1) & 0xFFFFFFFF;
        m = Integer.reverse(0x20000000);
        o = Integer.reverse(0);
        t = Integer.reverse(0);
        u = Long.reverse(7858667403910915871L);
        y = (0x10000000 >>> 92 | 0x10000000 << -92) & 0xFFFFFFFF;
        aa = Integer.reverse(0);
        ab = Integer.reverse(0x40000000);
        ad = 0x4000000 >>> 58 | 0x4000000 << -58;
        af = Long.reverse(-5688160275219536097L);
        ah = Long.reverse(-2594073385365405696L);
        ai = 0x300000 >>> 52 | 0x300000 << ~52 + 1;
        aj = 0x40000000 >>> 126 | 0x40000000 << ~126 + 1;
        am = Integer.reverse(0x40000000);
        ap = 0 >>> 194 | 0 << ~194 + 1;
        ar = 524288 >>> 146 | 524288 << -146;
        at = Long.reverse(-5688160275219536097L);
        au = Long.reverse(-2594073385365405696L);
        av = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & 0xFFFFFFFF;
        ax = (0x8000000 >>> 155 | 0x8000000 << ~155 + 1) & 0xFFFFFFFF;
        ba = Integer.reverse(-1073741824);
        bb = (96 >>> 69 | 96 << ~69 + 1) & 0xFFFFFFFF;
        c = new String[ba];
        d = new String[bb];
        NLoginCore_240.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_240.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.E("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 69), NLoginCore_240.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.F("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗ࢒ࢢࡿࢲࢴࢢࢰࢪࢴࢭࢆԮ", (byte)28, 70) + string + NLoginCore_451.F("Ԓ", (byte)28, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        Object[] objectArray = new Object[am];
        objectArray[NLoginCore_240.ap] = NLoginCore_240.c("㺀", (int)ar, (long)(at ^ au));
        objectArray[NLoginCore_240.av] = ax;
        this.a.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, aj, objectArray);
    }

    public NLoginCore_240(NLoginType_008 NLoginType_008) {
        super(NLoginType_008);
        this.a = (NLoginType_010)NLoginType_008.c();
    }

    @Override
    public void b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        Object[] objectArray = new Object[m];
        objectArray[NLoginCore_240.o] = NLoginCore_240.c("㺀", (int)t, (long)u);
        objectArray[NLoginCore_240.y] = aa;
        objectArray[NLoginCore_240.ab] = NLoginCore_240.c("㺃", (int)ad, (long)(af ^ ah));
        objectArray[NLoginCore_240.ai] = bl;
        this.a.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, l, objectArray);
    }

    private static void b() {
        int n;
        e = -512090566782488435L;
        long l = e ^ 0xC5175FAA6E4CACFAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(30 + 39), (byte)(69 + 14), (byte)(27 + 20), (byte)(35 + 32), (byte)(30 + 36), (byte)(31 + 36), (byte)(20 + 27), (byte)(66 + 14), (byte)(49 + 26), (byte)(31 + 36), (byte)(31 + 52), (byte)(28 + 25), (byte)(58 + 22), (byte)(48 + 49), 100, 100, (byte)(62 + 43), (byte)(36 + 74), (byte)(69 + 34)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_240.d[0] = NLoginCore_201.E("֬֊էեֈֱ֢֋֜֕֎ջ", (byte)119, 69);
                    NLoginCore_240.d[1] = NLoginCore_201.A("ǞƤƿǙǅƹƿǂǄƮƨƺǨǅǊǩǫǡǀǹǻƵǘǒǈǪǾȀǹƽǬǎ", (byte)119, 65);
                    NLoginCore_240.d[2] = NLoginCore_004.C("֓ձՎՌկ֘։ղփռյբ", (byte)119, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_240.d[0] = NLoginCore_092.A("ǓƷǆǙǄǦǭǉǫƷǂưƼǇǓǅǦǇƴǇǔǓǀǁ", (byte)119, 65);
                    NLoginCore_240.d[1] = NLoginCore_076.A("ǞƤƿǙǅƹƿǂǄƮƨƺǨǅǊǩǫǡǀǹǻƷǌǗǫǉǽǟǍȃǽȀ", (byte)119, 65);
                    NLoginCore_240.d[2] = NLoginCore_223.C("կՔ֐֊֊ՎճՖ՛յկ֊ջի֢շսղմ֥տրխծ", (byte)119, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_240.d[0] = NLoginCore_004.A("ǧǔƸǄǔǌƦǧƿǁǑƱǂǯƭǭǦƷƮǘǭǓǀǁ", (byte)119, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_240.d[0] = NLoginCore_138.C("ձմ֓ՌշՓ՘֋ո֘֘Ֆհ֌֕֝՜֖վղկ֢֟֡֗֗շ֛֝֯֨֨", (byte)119, 67);
                }
            }
        }
    }
}

