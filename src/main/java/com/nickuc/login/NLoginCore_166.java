/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_130;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

abstract class NLoginCore_166
extends NLoginCore_130 {
    private static String[] d;
    private static int t;
    private static int an;
    private static int z;
    private static int u;
    private static int ar;
    private static long af;
    private static int aq;
    private static long ap;
    private static int aw;
    private static long ao;
    private static int v;
    private static int ag;
    private static int s;
    private static long i;
    private static long as;
    private static long am;
    private static int ak;
    private static int au;
    private static long ai;
    private static int aa;
    private static long f;
    private final String cu;
    private static int ae;
    private static long x;
    private static int y;
    private static long ay;
    private static int ba;
    private static int aj;
    private static int ad;
    private static int at;
    private static int l;
    private static long ah;
    private static int ax;
    private static int k;
    private static int w;
    private static long j;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_c;
    private static int ac;
    private static long av;
    private static long ab;
    private static int az;
    private static long al;
    private static int r;

    public String j(String string, String string2) {
        return (String)NLoginCore_166.c("㺀", (int)ar, (long)as) + this.cu + (String)NLoginCore_166.c("㺃", (int)(at & au), (long)av) + this.E(this.E(string) + string2) + (String)NLoginCore_166.c("㺆", (int)(aw & ax), (long)ay) + string2;
    }

    static {
        var_int_c = Integer.reverse(0);
        i = Long.reverse(-1934752878777573680L);
        j = Long.reverse(0xA00000000000000L);
        k = Integer.reverse(-1073741824);
        l = (0x10000000 >>> 250 | 0x10000000 << ~250 + 1) & 0xFFFFFFFF;
        r = Integer.reverse(0);
        s = Integer.reverse(Integer.MIN_VALUE);
        t = Integer.reverse(0);
        u = (16384 >>> 141 | 16384 << -141) & 0xFFFFFFFF;
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(-1);
        x = Long.reverse(-1214176938398294320L);
        y = (0x1000000 >>> 247 | 0x1000000 << -247) & 0xFFFFFFFF;
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = (Integer.MIN_VALUE >>> 190 | Integer.MIN_VALUE << -190) & 0xFFFFFFFF;
        ab = Long.reverse(-1214176938398294320L);
        ac = Integer.reverse(0);
        ad = 0x180000 >>> 179 | 0x180000 << ~179 + 1;
        ae = -1 >>> 164 | -1 << ~164 + 1;
        af = Long.reverse(-1214176938398294320L);
        ag = Integer.reverse(0x20000000);
        ah = Long.reverse(-1934752878777573680L);
        ai = Long.reverse(0xA00000000000000L);
        aj = (49152 >>> 238 | 49152 << ~238 + 1) & 0xFFFFFFFF;
        ak = Integer.reverse(-1610612736);
        al = Long.reverse(-1934752878777573680L);
        am = Long.reverse(0xA00000000000000L);
        an = (768 >>> 103 | 768 << ~103 + 1) & 0xFFFFFFFF;
        ao = Long.reverse(-1934752878777573680L);
        ap = Long.reverse(0xA00000000000000L);
        aq = Integer.reverse(0x18000000);
        ar = 1792 >>> 232 | 1792 << ~232 + 1;
        as = Long.reverse(-1214176938398294320L);
        at = (0x200000 >>> 50 | 0x200000 << -50) & 0xFFFFFFFF;
        au = (-1 >>> 172 | -1 << ~172 + 1) & 0xFFFFFFFF;
        av = Long.reverse(-1214176938398294320L);
        aw = Integer.reverse(-1879048192);
        ax = Integer.reverse(-1);
        ay = Long.reverse(-1214176938398294320L);
        az = Integer.reverse(0x50000000);
        ba = -2147483646 >>> 222 | -2147483646 << -222;
        var_java_lang_String_arr_c = new String[az];
        d = new String[ba];
        NLoginCore_166.b();
    }

    @Override
    public String java_lang_String_w(String string) {
        return this.D(string);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_166.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ПсуУчѦўѴѠЯѭѣѱѫдљѻѺѲѸѲч", (byte)22, 68), NLoginCore_166.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.F("ԵՂՁԄՄՀԻՄՏԾԋՉՍՆՉՏԑ࢘ࢍࢬࢪ࢛࢙ࢦ࢐ࢲࢨ࢕ࢡࢩࢹࢳԬ", (byte)22, 70) + string + NLoginCore_138.E("Ԍ", (byte)22, 69) + methodType.toString(), exception);
        }
    }

    public String E(String string) {
        return super.java_lang_String_w(string);
    }

    private static void b() {
        int n;
        f = 827028695545177255L;
        long l = f ^ 0xED03CF22C4CD7800L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(48 + 35), (byte)(21 + 26), (byte)(3 + 64), 66, (byte)(58 + 9), (byte)(41 + 6), (byte)(9 + 71), (byte)(44 + 31), (byte)(57 + 10), (byte)(45 + 38), (byte)(50 + 3), (byte)(34 + 46), (byte)(61 + 36), (byte)(72 + 28), (byte)(83 + 17), (byte)(26 + 79), (byte)(59 + 51), (byte)(42 + 61)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(7 + 62), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_166.d[0] = NLoginCore_223.B("ƽǀƹǂǉǆƝƈƑưƋƙ", (byte)105, 66);
                    NLoginCore_166.d[1] = NLoginCore_092.F("հ֠ՙ֐֠֙՝ձշա֢խ", (byte)105, 70);
                    NLoginCore_166.d[2] = NLoginCore_575.D("ԻիԤ՛իդԨԼՂԬխԸ", (byte)105, 68);
                    NLoginCore_166.d[3] = NLoginCore_223.A("ƵƔƻǃƚƞƭƺƿƦƤƙ", (byte)105, 65);
                    NLoginCore_166.d[4] = NLoginCore_223.D("ՔԳ՚բԹԽՌՙ՞ՅՃԸ", (byte)105, 68);
                    NLoginCore_166.d[5] = NLoginCore_138.D("ԟ՜՛ԿԤՎԽՅՑՀգԬՊհՏԱ՗ԳռժՑ՜՚վՁհյեբճ՘րՈ֋օ֊ջՠ՛դսՐՓսեվևեհճ֘դ֐֌գդ", (byte)105, 68);
                    NLoginCore_166.d[6] = NLoginCore_027.D("ԛժէՊԾբբՙՃձԿԸ", (byte)105, 68);
                    NLoginCore_166.d[7] = NLoginCore_201.B("ƵƔƻǃƚƞƭƺƿƦƤƙ", (byte)105, 66);
                    NLoginCore_166.d[8] = NLoginCore_076.E("։ը֏֗ծղց֎֓պոխ", (byte)105, 69);
                    NLoginCore_166.d[9] = NLoginCore_451.F("։ը֏֗ծղց֎֓պոխ", (byte)105, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_166.d[0] = NLoginCore_091.D("՟ԹԷՌ՜ԩՂՌՌՂՓԸ", (byte)105, 68);
                    NLoginCore_166.d[1] = NLoginCore_027.F("֌֑֝՚֖֎֞չՠ֝քխ", (byte)105, 70);
                    NLoginCore_166.d[2] = NLoginCore_446.D("՛գՕ՞ԾԾՎՊխԾ՝Ը", (byte)105, 68);
                    NLoginCore_166.d[3] = NLoginCore_384.E("յ֞֍ՙ֌֤֠֜շև֖խ", (byte)105, 69);
                    NLoginCore_166.d[4] = NLoginCore_091.E("֎֗ր֐֟ցւ՗֡֏֚խ", (byte)105, 69);
                    NLoginCore_166.d[5] = NLoginCore_223.B("ƀƽƼƠƅƯƞƦƲơǄƍƫǑưƒƸƔǝǋƲƽƻǟƢǑǖǆǃǔƹǡƩǬǦǫǜǁƼǅǞƱƴǭǶǈǪǬǐǵǥǆǈǇǄǅ", (byte)105, 66);
                    NLoginCore_166.d[6] = NLoginCore_387.C("ՓԴՇԹՠԿԸ՜ԽՊԮԸ", (byte)105, 67);
                    NLoginCore_166.d[7] = NLoginCore_575.F("լյ֐րփ՚ա՟֏ք֞խ", (byte)105, 70);
                    NLoginCore_166.d[8] = NLoginCore_201.F("ժ֍հռ֝յվձպֆ֦խ", (byte)105, 70);
                    NLoginCore_166.d[9] = NLoginCore_453.C("՗Չ՘ԥծԶ՗կՍՍԮԸ", (byte)105, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_166.d[0] = NLoginCore_223.F("՗ր֠֕ն֏փպ֏֛ձփա֟չֆվ֢֜ի֞օ֢֊֕նֱ֤֕ն֪֒", (byte)105, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_166.d[0] = NLoginCore_091.E("՘Ցհ֕յ֍՞֛ևչզ֠֊֖տխծְչֳ֯ղ֧կֱ֨քֳֵֹּշ", (byte)105, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x50L;
        l ^= 0xED03CF22C4CD7800L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(6 + 63), 83, (byte)(11 + 36), (byte)(14 + 53), (byte)(23 + 43), (byte)(41 + 26), 47, (byte)(34 + 46), (byte)(37 + 38), (byte)(24 + 43), (byte)(82 + 1), (byte)(14 + 39), (byte)(18 + 62), (byte)(36 + 61), (byte)(75 + 25), (byte)(59 + 41), (byte)(68 + 37), (byte)(73 + 37), (byte)(55 + 48)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(5 + 78)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("ր֍֌Տ֏֋ֆ֏֚։Ֆ֑֚֔֘֔՜ࣱࣣࣦࣘࣷࣵࣤࣛࣽࣳ࣠࣬ࣴऄࣾ", (byte)120, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_166.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray = string2.split((String)NLoginCore_166.c("㺀", (int)var_int_c, (long)(i ^ j)));
        if (stringArray.length != k && stringArray.length != l) {
            return r != 0;
        }
        String string3 = stringArray[s];
        if (!string3.equalsIgnoreCase(this.cu)) {
            return t != 0;
        }
        String string4 = this.E(string);
        String string5 = stringArray[u];
        switch (stringArray.length) {
            case 3: {
                String[] stringArray2 = string2.split((String)NLoginCore_166.c("㺃", (int)(v & w), (long)x));
                if (stringArray2.length == y) {
                    String string6 = stringArray2[z];
                    return string5.equals(this.E(string4 + string6) + (String)NLoginCore_166.c("㺆", (int)aa, (long)ab) + string6);
                }
                if (stringArray2.length > 0) {
                    return stringArray2[ac].equals((String)NLoginCore_166.c("㺉", (int)(ad & ae), (long)af) + string3 + (String)NLoginCore_166.c("㺌", (int)ag, (long)(ah ^ ai)) + string4);
                }
                return string5.equals(string4);
            }
            case 4: {
                String string7 = stringArray[aj];
                return string5.equals(this.E(string4 + string7));
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_166.c("㺏", (int)ak, (long)(al ^ am)) + this.cm + (String)NLoginCore_166.c("㺒", (int)an, (long)(ao ^ ap)) + stringArray.length);
    }

    public String D(String string) {
        String string2 = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_c, aq);
        return this.j(string, string2);
    }

    protected NLoginCore_166(String string, String string2) {
        super(string);
        this.cu = string2;
    }
}

