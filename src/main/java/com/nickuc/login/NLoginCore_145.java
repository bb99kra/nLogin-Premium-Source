/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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
import lombok.Generated;

public final class NLoginCore_145
extends Enum<NLoginCore_145> {
    public static final /* enum */ NLoginCore_145 var_com_nickuc_login_NLoginCore_145_a;
    public static final /* enum */ NLoginCore_145 var_com_nickuc_login_NLoginCore_145_b;
    public static final /* enum */ NLoginCore_145 var_com_nickuc_login_NLoginCore_145_c;
    public static final /* enum */ NLoginCore_145 var_com_nickuc_login_NLoginCore_145_d;
    public final String bk;
    public final String bl;
    private static final /* synthetic */ NLoginCore_145[] var_com_nickuc_login_NLoginCore_145_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static long var_long_b;
    private static int var_int_c;
    private static int var_int_d;
    private static long e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static long n;
    private static long o;
    private static int p;
    private static int q;
    private static long r;
    private static long s;
    private static int t;
    private static long u;
    private static int v;
    private static long w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static int ab;
    private static long ac;
    private static long ad;
    private static int ae;
    private static long af;
    private static int ag;
    private static int ah;
    private static long ai;
    private static int aj;
    private static long ak;
    private static long al;
    private static int am;
    private static long an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static long ar;
    private static int as;
    private static long at;
    private static long au;

    public static NLoginCore_145 valueOf(String string) {
        return Enum.valueOf(NLoginCore_145.class, string);
    }

    private static void b() {
        int n;
        var_long_c = 6855186686704615711L;
        long l = var_long_c ^ 0x44B92C70D22DCBA3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(53 + 16), (byte)(19 + 64), 47, (byte)(36 + 31), (byte)(38 + 28), (byte)(47 + 20), (byte)(40 + 7), (byte)(10 + 70), (byte)(66 + 9), (byte)(11 + 56), (byte)(16 + 67), (byte)(16 + 37), 80, (byte)(25 + 72), (byte)(59 + 41), (byte)(57 + 43), (byte)(6 + 99), (byte)(106 + 4), (byte)(37 + 66)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
                    NLoginCore_145.var_java_lang_String_arr_b[0] = NLoginCore_110.E("կքգք֥֦֞֝նֆ֚ձ", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[1] = NLoginCore_427.E("փ֑՝֗֟ամթ֧՝ֈձ", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[2] = NLoginCore_427.A("ƳǍƽƭƬǃƕǂƖƱǒơ", (byte)109, 65);
                    NLoginCore_145.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ƳǁƍǇǏƑƤƙǗƍƸơ", (byte)109, 66);
                    NLoginCore_145.var_java_lang_String_arr_b[4] = NLoginCore_427.D("Ֆդ԰ժղԴՇԼպ԰՛Մ", (byte)109, 68);
                    NLoginCore_145.var_java_lang_String_arr_b[5] = NLoginCore_173.C("ԾՔՖԵՁձռՊՒԶ՗Մ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[6] = NLoginCore_092.E("֙ծ֓ք֛ֆռձ֒ե֤֞։֮֫ֆ֠ղ֎ֳֵ֫ռս", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[7] = NLoginCore_027.F("֣֝ռ֤֜֘տփ֚շռձ", (byte)109, 70);
                    NLoginCore_145.var_java_lang_String_arr_b[8] = NLoginCore_427.C("զՐխՎխՎՖԳկթՋՄ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[9] = NLoginCore_446.E("վՙրռվ֡՚ղ՜սրձ", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[10] = NLoginCore_027.D("ԾխձԮԵՔղեռ՘ձՄ", (byte)109, 68);
                    NLoginCore_145.var_java_lang_String_arr_b[11] = NLoginCore_027.C("ՎՅՆգՈԳՉձՖԴԾՄ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[12] = NLoginCore_201.E("հբտկրջհպ֖֢֨։ի֡տ֥֩֒րի֩տռս", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[13] = NLoginCore_091.D("գհՈՁիՐԸԷծՈՏՄ", (byte)109, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_145.var_java_lang_String_arr_b[0] = NLoginCore_446.D("դՉՈՃթՔՐձռԵՋՄ", (byte)109, 68);
                    NLoginCore_145.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ƌǃǈƞƱƥƭƓǏǍƬơ", (byte)109, 66);
                    NLoginCore_145.var_java_lang_String_arr_b[2] = NLoginCore_387.C("Նլ԰ԷխոՆՌՏԶԺՄ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[3] = NLoginCore_559.D("իՂհՅՇՈոիՅԹ՛Մ", (byte)109, 68);
                    NLoginCore_145.var_java_lang_String_arr_b[4] = NLoginCore_201.E("՞շղ֚սյվվ֪֝ռձ", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[5] = NLoginCore_027.C("՞լբՃ՘՛Օ՜՘յչՌյ՟՚՞Րև՟շժՒՏՐ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[6] = NLoginCore_223.A("ǉƞǃƴǋƶƬơǂƕǓƜƖƶǡǂǠƫƬƹǏƯƬƭ", (byte)109, 65);
                    NLoginCore_145.var_java_lang_String_arr_b[7] = NLoginCore_004.E("֊֠ոռ֟ՠէ֓֙֌֞ձ", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[8] = NLoginCore_004.A("ƺƱƒƬƵƮǆƓǏǎƓơ", (byte)109, 65);
                    NLoginCore_145.var_java_lang_String_arr_b[9] = NLoginCore_091.A("ƾƻƪƝƧƴƓǏƒǕƬǅƭǈƗƘǊǘǀǅǠǥƬƭ", (byte)109, 65);
                    NLoginCore_145.var_java_lang_String_arr_b[10] = NLoginCore_324.C("ն՗ՀՖթիխՈ՜վսՄ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[11] = NLoginCore_027.C("գյՂէՃոչ՝ՓճՌԾծՊՏՍԾ՜և՟ԿՒՏՐ", (byte)109, 67);
                    NLoginCore_145.var_java_lang_String_arr_b[12] = NLoginCore_091.E("հբտկրջհպ֖֢֧ֈք֡֊ռս֌֌֤֗տռս", (byte)109, 69);
                    NLoginCore_145.var_java_lang_String_arr_b[13] = NLoginCore_384.A("ǂƅƽƲƣƍǈơǘǕǆơ", (byte)109, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_145.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ƌƴƬƣƫǘǑƑƲƕƱƛƮƧƿƭǚǜǟƸƿƽǖǠǝƷƺǘƤǞƸǫ", (byte)109, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_145.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ǋƅƨƴǆǈǙƖǃǋǚơ", (byte)109, 65);
                }
            }
        }
    }

    static {
        var_int_a = 0 >>> 156 | 0 << -156;
        var_long_b = Long.reverse(8250629998600340730L);
        var_int_c = (8192 >>> 205 | 8192 << -205) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(-1);
        e = Long.reverse(8250629998600340730L);
        f = Integer.reverse(0x20000000);
        g = Integer.reverse(0);
        h = (0x400000 >>> 54 | 0x400000 << -54) & 0xFFFFFFFF;
        i = 512 >>> 40 | 512 << -40;
        j = Integer.reverse(-1073741824);
        k = Integer.reverse(0x70000000);
        l = (448 >>> 5 | 448 << -5) & 0xFFFFFFFF;
        m = Integer.reverse(0x40000000);
        n = Long.reverse(-540396474026867462L);
        o = Long.reverse(-8502796096475496448L);
        p = 0 >>> 108 | 0 << ~108 + 1;
        q = Integer.reverse(-1073741824);
        r = Long.reverse(-540396474026867462L);
        s = Long.reverse(-8502796096475496448L);
        t = (131072 >>> 143 | 131072 << -143) & 0xFFFFFFFF;
        u = Long.reverse(8250629998600340730L);
        v = 40 >>> 35 | 40 << ~35 + 1;
        w = Long.reverse(-540396474026867462L);
        x = Long.reverse(-8502796096475496448L);
        y = 256 >>> 72 | 256 << -72;
        z = Integer.reverse(0x60000000);
        aa = Long.reverse(8250629998600340730L);
        ab = Integer.reverse(-536870912);
        ac = Long.reverse(-540396474026867462L);
        ad = Long.reverse(-8502796096475496448L);
        ae = (32768 >>> 76 | 32768 << ~76 + 1) & 0xFFFFFFFF;
        af = Long.reverse(8250629998600340730L);
        ag = (0x400000 >>> 149 | 0x400000 << ~149 + 1) & 0xFFFFFFFF;
        ah = Integer.reverse(-1879048192);
        ai = Long.reverse(8250629998600340730L);
        aj = Integer.reverse(0x50000000);
        ak = Long.reverse(-540396474026867462L);
        al = Long.reverse(-8502796096475496448L);
        am = Integer.reverse(-805306368);
        an = Long.reverse(8250629998600340730L);
        ao = 98304 >>> 143 | 98304 << -143;
        ap = Integer.reverse(0x30000000);
        aq = (-1 >>> 225 | -1 << -225) & 0xFFFFFFFF;
        ar = Long.reverse(8250629998600340730L);
        as = Integer.reverse(-1342177280);
        at = Long.reverse(-540396474026867462L);
        au = Long.reverse(-8502796096475496448L);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_145.b();
        var_com_nickuc_login_NLoginCore_145_a = new NLoginCore_145((String)NLoginCore_145.c("㺃", (int)q, (long)(r ^ s)), (String)NLoginCore_145.c("㺆", (int)t, (long)u));
        var_com_nickuc_login_NLoginCore_145_b = new NLoginCore_145((String)NLoginCore_145.c("㺌", (int)z, (long)aa), (String)NLoginCore_145.c("㺏", (int)ab, (long)(ac ^ ad)));
        var_com_nickuc_login_NLoginCore_145_c = new NLoginCore_145((String)NLoginCore_145.c("㺕", (int)ah, (long)ai), (String)NLoginCore_145.c("㺘", (int)aj, (long)(ak ^ al)));
        var_com_nickuc_login_NLoginCore_145_d = new NLoginCore_145((String)NLoginCore_145.c("㺞", (int)(ap & aq), (long)ar), (String)NLoginCore_145.c("㺡", (int)as, (long)(at ^ au)));
        var_com_nickuc_login_NLoginCore_145_arr_a = NLoginCore_145.a();
    }

    public static NLoginCore_145[] values() {
        return (NLoginCore_145[])var_com_nickuc_login_NLoginCore_145_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x51L;
        l ^= 0x44B92C70D22DCBA3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(33 + 36), (byte)(35 + 48), (byte)(40 + 7), (byte)(56 + 11), (byte)(38 + 28), (byte)(47 + 20), (byte)(15 + 32), (byte)(55 + 25), 75, (byte)(31 + 36), (byte)(65 + 18), (byte)(41 + 12), (byte)(9 + 71), (byte)(78 + 19), (byte)(91 + 9), (byte)(87 + 13), (byte)(11 + 94), (byte)(53 + 57), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘ࡭ࡨࡴࡰࡑࡃࡦࡶࡦ", (byte)76, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_145.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static /* synthetic */ NLoginCore_145[] a() {
        NLoginCore_145[] NLoginCore_145Array = new NLoginCore_145[f];
        NLoginCore_145Array[NLoginCore_145.g] = var_com_nickuc_login_NLoginCore_145_a;
        NLoginCore_145Array[NLoginCore_145.h] = var_com_nickuc_login_NLoginCore_145_b;
        NLoginCore_145Array[NLoginCore_145.i] = var_com_nickuc_login_NLoginCore_145_c;
        NLoginCore_145Array[NLoginCore_145.j] = var_com_nickuc_login_NLoginCore_145_d;
        return NLoginCore_145Array;
    }

    @Generated
    private NLoginCore_145(String string2, String string3) {
        this.bk = string2;
        this.bl = string3;
    }

    public String b(String string, boolean bl) {
        return bl ? this.bl + NLoginCore_370.X() + this.bk + (String)(this == var_com_nickuc_login_NLoginCore_145_d ? NLoginCore_145.c("㺀", (int)var_int_a, (long)var_long_b) : NLoginCore_145.c("㺃", (int)(var_int_c & var_int_d), (long)e)) + string : NLoginCore_370.X() + this.bk + string;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_145.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.D("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)104, 68), NLoginCore_145.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.E("և֔֓Ֆ֖֒֍֖֡֐՝֛֛֟֘֡գࣱࣸࣳࣿࣻࣜ࣎ँࣱո", (byte)104, 69) + string + NLoginCore_384.A("Ɖ", (byte)104, 65) + methodType.toString(), exception);
        }
    }
}

