/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_071 {
    private static int y;
    private static int m;
    private static int u;
    private static int n;
    private static int e;
    private static int f;
    private final int ad;
    private static int var_int_a;
    private static long ag;
    private final InetAddress var_java_net_InetAddress_a;
    private static int ab;
    private final boolean ap;
    private static String[] var_java_lang_String_arr_b;
    private static int aa;
    private static int j;
    private final int ae;
    private static long ah;
    private static int r;
    private static int x;
    private static int g;
    private static long q;
    private static int l;
    private static int s;
    private static int al;
    private static int h;
    private static long am;
    private static int var_int_c;
    public static final NLoginCore_071 var_com_nickuc_login_NLoginCore_071_b;
    private static String[] var_java_lang_String_arr_a;
    private static int w;
    private static int t;
    private static int ac;
    private static long aj;
    public static final NLoginCore_071 var_com_nickuc_login_NLoginCore_071_c;
    private static long var_long_c;
    private static int af;
    private static int ai;
    private static int i;
    private static int o;
    private static int z;
    private static long var_long_b;
    private static int k;
    private static int d;
    public static final NLoginCore_071 var_com_nickuc_login_NLoginCore_071_a;
    private static int v;
    private static long p;
    private static int ak;

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0xDC355731EBAA11B5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(27 + 42), (byte)(73 + 10), (byte)(3 + 44), 67, (byte)(46 + 20), (byte)(25 + 42), (byte)(30 + 17), (byte)(12 + 68), (byte)(7 + 68), (byte)(62 + 5), (byte)(72 + 11), 53, (byte)(70 + 10), (byte)(76 + 21), (byte)(67 + 33), (byte)(15 + 85), (byte)(86 + 19), (byte)(57 + 53), (byte)(49 + 54)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("ֆ֓֒Օ֑֕֌֕֠֏՜֚֚֞֗֠բࣲࣺࣧऀࣹ࣡ࣴ࣬ࣵ", (byte)103, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_071.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_071(String string) {
        String string2;
        String[] stringArray = string.split((String)NLoginCore_071.c("㺀", (int)var_int_a, (long)var_long_b));
        if (stringArray.length == var_int_c) {
            string2 = stringArray[d];
            this.ad = Integer.parseInt(stringArray[e]);
        } else {
            string2 = string;
            this.ad = f;
        }
        this.var_java_net_InetAddress_a = InetAddress.getByName(string2);
        if (this.var_java_net_InetAddress_a instanceof Inet4Address) {
            this.ap = stringArray.length != g || this.ad == h ? i : j;
        } else if (this.var_java_net_InetAddress_a instanceof Inet6Address) {
            this.ap = stringArray.length != k || this.ad == l ? m : n;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_071.c("㺃", (int)o, (long)(p ^ q)) + this.var_java_net_InetAddress_a.getClass().getCanonicalName());
        }
        this.ae = this.ap ? r : this.ad / s;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_071.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ϸКМϼРпзэйЈцмъфЍвєѓыёыР", (byte)9, 68), NLoginCore_071.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.C("грпЂтойтэмЉчыфчэЏޔޟާޭގޡޙޢަФ", (byte)9, 67) + string + NLoginCore_091.A("Ë", (byte)9, 65) + methodType.toString(), exception);
        }
    }

    public boolean b(InetAddress inetAddress) {
        if (!this.var_java_net_InetAddress_a.getClass().equals(inetAddress.getClass())) {
            return t != 0;
        }
        if (this.ap) {
            return inetAddress.equals(this.var_java_net_InetAddress_a);
        }
        byte[] byArray = inetAddress.getAddress();
        byte[] byArray2 = this.var_java_net_InetAddress_a.getAddress();
        byte by = (byte)(u >> (this.ad & v));
        for (int i = w; i < this.ae; ++i) {
            if (byArray.length >= i && byArray2.length >= i && byArray[i] == byArray2[i]) continue;
            return x != 0;
        }
        if (by != 0) {
            return ((byArray[this.ae] & by) == (byArray2[this.ae] & by) ? y : z) != 0;
        }
        return aa != 0;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-2997156123206520749L);
        var_int_c = Integer.reverse(0x40000000);
        d = Integer.reverse(0);
        e = (4 >>> 2 | 4 << ~2 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = (0x400000 >>> 117 | 0x400000 << ~117 + 1) & 0xFFFFFFFF;
        h = 32768 >>> 106 | 32768 << -106;
        i = 4096 >>> 172 | 4096 << -172;
        j = (0 >>> 92 | 0 << ~92 + 1) & 0xFFFFFFFF;
        k = 0x100000 >>> 19 | 0x100000 << -19;
        l = 65536 >>> 169 | 65536 << -169;
        m = 4 >>> 98 | 4 << -98;
        n = Integer.reverse(0);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Long.reverse(-7608842141633908653L);
        q = Long.reverse(0x4000000000000000L);
        r = -1 >>> 139 | -1 << -139;
        s = Integer.reverse(0x10000000);
        t = Integer.reverse(0);
        u = 130560 >>> 129 | 130560 << ~129 + 1;
        v = Integer.reverse(-536870912);
        w = Integer.reverse(0);
        x = Integer.reverse(0);
        y = (65536 >>> 176 | 65536 << -176) & 0xFFFFFFFF;
        z = (0 >>> 232 | 0 << ~232 + 1) & 0xFFFFFFFF;
        aa = 32 >>> 101 | 32 << ~101 + 1;
        ab = 1280 >>> 136 | 1280 << ~136 + 1;
        ac = Integer.reverse(-1610612736);
        af = Integer.reverse(0x40000000);
        ag = Long.reverse(-7608842141633908653L);
        ah = Long.reverse(0x4000000000000000L);
        ai = (-2147483647 >>> 159 | -2147483647 << ~159 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(-2997156123206520749L);
        ak = Integer.reverse(0x20000000);
        al = Integer.reverse(-1);
        am = Long.reverse(-2997156123206520749L);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        NLoginCore_071.b();
        try {
            var_com_nickuc_login_NLoginCore_071_a = new NLoginCore_071((String)NLoginCore_071.c("㺀", (int)af, (long)(ag ^ ah)));
            var_com_nickuc_login_NLoginCore_071_b = new NLoginCore_071((String)NLoginCore_071.c("㺃", (int)ai, (long)aj));
            var_com_nickuc_login_NLoginCore_071_c = new NLoginCore_071((String)NLoginCore_071.c("㺆", (int)(ak & al), (long)am));
        }
        catch (UnknownHostException unknownHostException) {
            throw new RuntimeException(unknownHostException);
        }
    }

    private static void b() {
        int n;
        var_long_c = -3886949743910197655L;
        long l = var_long_c ^ 0xDC355731EBAA11B5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(63 + 6), (byte)(14 + 69), 47, (byte)(21 + 46), (byte)(54 + 12), (byte)(60 + 7), (byte)(43 + 4), 80, (byte)(47 + 28), (byte)(44 + 23), (byte)(39 + 44), (byte)(39 + 14), (byte)(54 + 26), (byte)(53 + 44), (byte)(46 + 54), (byte)(5 + 95), (byte)(90 + 15), (byte)(13 + 97), (byte)(34 + 69)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(13 + 56), (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
                    NLoginCore_071.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ƿƠǁƽƞƜƔƸƼƝƶƑ", (byte)101, 65);
                    NLoginCore_071.var_java_lang_String_arr_b[1] = NLoginCore_138.E("֎գֆֆը֛֒՟րչդ֙ա֒։օե֋֟թռ֑֧֘կլֲ֝֬֒֫֐ְօօ֘֌֋֢֤֜֘־։", (byte)101, 69);
                    NLoginCore_071.var_java_lang_String_arr_b[2] = NLoginCore_201.D("ՈՊԪԟԞԽԳԞԛԲԻԢԵԲՇէՌԮ՟ՍՇՊԷԸ", (byte)101, 68);
                    NLoginCore_071.var_java_lang_String_arr_b[3] = NLoginCore_575.B("ƂǄƱǀƮŽƻƗƺƧƛǀǈƬƪƜǐƑǁƬƕǅƜƝ", (byte)101, 66);
                    NLoginCore_071.var_java_lang_String_arr_b[4] = NLoginCore_110.F("օռծՖչՑ֝֠կՠ֥֝հ֒֞տ֗֝֡զւ֝մյ", (byte)101, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_071.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƍžǂƞƟƥƶƈƶƝƶƑ", (byte)101, 65);
                    NLoginCore_071.var_java_lang_String_arr_b[1] = NLoginCore_076.A("ƶƋƮƮƐƺǃƇƨơƌǁƉƺƱƭƍƳǇƑƤǀƹǏƗƔǅǔƺǓǚƸƵǤƿƿƱǏǧƟǔƢǚƱ", (byte)101, 65);
                    NLoginCore_071.var_java_lang_String_arr_b[2] = NLoginCore_138.E("օևէ՜՛պհ՛՘կջ֓֗֝ֆռ֢պգ֧և֭մյ", (byte)101, 69);
                    NLoginCore_071.var_java_lang_String_arr_b[3] = NLoginCore_173.D("ԝ՟Ռ՛ՉԘՖԲՕՂԳՀՑԡԹԢԹԹՀՂխխՋՋ԰ՐՏծՍՖէթ", (byte)101, 68);
                    NLoginCore_071.var_java_lang_String_arr_b[4] = NLoginCore_027.E("օռծՖչՑ֝֠կՠ֚փֆ֦֜֩ր֔ֆ֢֎֟ի֢հ֝֜իֈֹ֓շ", (byte)101, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_071.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƙƏƐƮƞǃǄƛƸƢƻƪƘƣƯǉǏǇƬƾǕƎǈƧƧƫǓƜƨƱƠƵ", (byte)101, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_071.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ՒԜՠՋԙԮԴՐԻԿԽՀժԤԷ՚ԼՄԸբԺհԷԸ", (byte)101, 68);
                }
            }
        }
    }
}

