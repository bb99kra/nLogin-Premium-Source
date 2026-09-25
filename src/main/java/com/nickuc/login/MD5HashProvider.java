/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_130;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
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

public final class MD5HashProvider
extends NLoginCore_130 {
    private static int ab;
    private static long t;
    private static long i;
    private static int w;
    private static int s;
    private static int x;
    private static int ac;
    private static int an;
    private static int ai;
    private static long v;
    private static long m;
    private static long ag;
    private static long af;
    private static int am;
    private static String[] var_java_lang_String_arr_d;
    private static int ak;
    private static long y;
    private static long al;
    private static int r;
    private static int u;
    private static int aj;
    private static long n;
    private static int ad;
    private static long z;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_c;
    private static int aa;
    private static int ah;
    private static int k;
    private static int var_int_d;
    private static long f;
    private static int ae;

    static {
        var_int_c = Integer.reverse(0);
        var_int_d = Integer.reverse(-1);
        i = Long.reverse(-3215947522989533679L);
        k = Integer.reverse(Integer.MIN_VALUE);
        m = Long.reverse(6295654890016953873L);
        n = Long.reverse(-8935141660703064064L);
        r = Integer.reverse(0x40000000);
        s = (-1 >>> 198 | -1 << -198) & 0xFFFFFFFF;
        t = Long.reverse(-3215947522989533679L);
        u = Integer.reverse(-1073741824);
        v = Long.reverse(-3215947522989533679L);
        w = (0 >>> 93 | 0 << ~93 + 1) & 0xFFFFFFFF;
        x = Integer.reverse(0x20000000);
        y = Long.reverse(6295654890016953873L);
        z = Long.reverse(-8935141660703064064L);
        aa = Integer.reverse(-1073741824);
        ab = Integer.reverse(0x20000000);
        ac = Integer.reverse(0);
        ad = 64 >>> 166 | 64 << -166;
        ae = 81920 >>> 14 | 81920 << ~14 + 1;
        af = Long.reverse(6295654890016953873L);
        ag = Long.reverse(-8935141660703064064L);
        ah = Integer.reverse(0);
        ai = 2048 >>> 42 | 2048 << -42;
        aj = Integer.reverse(-1073741824);
        ak = (0x60000000 >>> 252 | 0x60000000 << -252) & 0xFFFFFFFF;
        al = Long.reverse(-3215947522989533679L);
        am = (28672 >>> 44 | 28672 << -44) & 0xFFFFFFFF;
        an = Integer.reverse(-536870912);
        var_java_lang_String_arr_c = new String[am];
        var_java_lang_String_arr_d = new String[an];
        MD5HashProvider.b();
    }

    private static String a(int n, long l) {
        l ^= 0x21L;
        l ^= 0x48AB521D51910D63L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), 69, (byte)(46 + 37), (byte)(45 + 2), 67, (byte)(41 + 25), (byte)(24 + 43), (byte)(37 + 10), (byte)(21 + 59), (byte)(3 + 72), (byte)(64 + 3), (byte)(52 + 31), (byte)(22 + 31), (byte)(58 + 22), (byte)(45 + 52), (byte)(60 + 40), (byte)(72 + 28), (byte)(15 + 90), (byte)(44 + 66), (byte)(57 + 46)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("ղտվՁցսոց֌ջՈֆ֊փֆ֌Վࢴࣤࢵࣣࣄࣦ࣏ࣗࣟ࣫ࢾࣲ", (byte)83, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            MD5HashProvider.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    private static void b() {
        int n;
        f = -8616908076951962902L;
        long l = f ^ 0x48AB521D51910D63L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(8 + 61), (byte)(3 + 80), 47, (byte)(55 + 12), (byte)(54 + 12), (byte)(51 + 16), (byte)(14 + 33), (byte)(10 + 70), (byte)(70 + 5), (byte)(7 + 60), (byte)(15 + 68), (byte)(9 + 44), (byte)(3 + 77), (byte)(3 + 94), (byte)(2 + 98), (byte)(65 + 35), 105, (byte)(71 + 39), (byte)(26 + 77)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
                    MD5HashProvider.var_java_lang_String_arr_d[0] = NLoginCore_223.D("ԖԤ՗ԧԬ՗԰ՊԽԗԭԦ", (byte)99, 68);
                    MD5HashProvider.var_java_lang_String_arr_d[1] = NLoginCore_575.D("ԣԏԮ՚ԩ՝ԙԝ԰ՏԱԦ", (byte)99, 68);
                    MD5HashProvider.var_java_lang_String_arr_d[2] = NLoginCore_004.F("֗ւյ֚֜֙ֆշ֠ժ֜է", (byte)99, 70);
                    MD5HashProvider.var_java_lang_String_arr_d[3] = NLoginCore_559.D("ՖՁԴ՛ՙ՘ՅԶ՟ԩ՛Ԧ", (byte)99, 68);
                    MD5HashProvider.var_java_lang_String_arr_d[4] = NLoginCore_223.E("իՏ֕֍թ֊նէրշպէ", (byte)99, 69);
                    MD5HashProvider.var_java_lang_String_arr_d[5] = NLoginCore_559.F("՗ե֘ըխ֘ձ֋վ՘ծէ", (byte)99, 70);
                    MD5HashProvider.var_java_lang_String_arr_d[6] = NLoginCore_201.A("ƱƺƕŸƺƶŶŷǆƏƕǈƫǉǉƽǆƽƛƠƝƏƴǁǆǍǘǅƖƹǊƪƨǍƳƷǖǓǌƶƯǏƱǪǃǜƿǞǞǨǧǩǬǋƸƹ", (byte)99, 65);
                    continue block7;
                }
                case 1: {
                    MD5HashProvider.var_java_lang_String_arr_d[0] = NLoginCore_027.A("ƬƼŸƬŽƟƴƅƵƻƜƍ", (byte)99, 65);
                    MD5HashProvider.var_java_lang_String_arr_d[1] = NLoginCore_201.A("ƫƍƒƶǃƺƒƄǀƜƗƹǇƔƟƚƀǈǏƿǑǁƘƙ", (byte)99, 65);
                    MD5HashProvider.var_java_lang_String_arr_d[2] = NLoginCore_138.E("ոբօջ֕֗յ֍֋֙֜է", (byte)99, 69);
                    MD5HashProvider.var_java_lang_String_arr_d[3] = NLoginCore_076.E("զօ֍Ս՗ղո֓ի֡֠է", (byte)99, 69);
                    MD5HashProvider.var_java_lang_String_arr_d[4] = NLoginCore_092.B("żƶƳǀƟưƐǄƧƐƃƍ", (byte)99, 66);
                    MD5HashProvider.var_java_lang_String_arr_d[5] = NLoginCore_091.B("ƸƯƱƾƾƙƺƎƐƂƇƍ", (byte)99, 66);
                    MD5HashProvider.var_java_lang_String_arr_d[6] = NLoginCore_201.F("֋֔կՒ֔֐ՐՑ֠թկ֢օ֣֣֗֠֗յպշթ֎ֲ֛֧֠֟հ֤֓քւ֧֍ְ֑֦֭֐։֩֌ր֑փֻׁ֢֖֤֓։ֺք֥־גֳ֢֭֓חֲ", (byte)99, 70);
                    continue block7;
                }
                case 2: {
                    MD5HashProvider.var_java_lang_String_arr_d[0] = NLoginCore_201.B("ƼƘƺŻƒǃƾƲƁƤƐƟƂǉƻƨƌǉƞƜǇǁƘƙ", (byte)99, 66);
                    continue block7;
                }
                case 4: {
                    MD5HashProvider.var_java_lang_String_arr_d[0] = NLoginCore_451.B("ŴƳƎƌƟƖƢƁưƼƸŻƓƓƇƾƯƤǊơǐƫƘƙ", (byte)99, 66);
                }
            }
        }
    }

    @Override
    public boolean boolean_i(String string, String string2) {
        String[] stringArray;
        if (string2.contains((CharSequence)MD5HashProvider.c("㺀", (int)(r & s), (long)t))) {
            string2 = string2.split((String)MD5HashProvider.c("㺃", (int)u, (long)v))[w];
        }
        if ((stringArray = string2.split((String)MD5HashProvider.c("㺆", (int)x, (long)(y ^ z)))).length != aa && stringArray.length != ab) {
            return ac != 0;
        }
        String string3 = stringArray[ad];
        if (!string3.equalsIgnoreCase((String)MD5HashProvider.c("㺉", (int)ae, (long)(af ^ ag)))) {
            return ah != 0;
        }
        String string4 = stringArray[ai];
        String string5 = super.java_lang_String_w(string);
        switch (stringArray.length) {
            case 3: {
                return string4.equals(string5);
            }
            case 4: {
                String string6 = stringArray[aj];
                return string4.equals(super.java_lang_String_w(string5 + string6));
            }
        }
        throw new IllegalArgumentException((String)MD5HashProvider.c("㺌", (int)ak, (long)al) + stringArray.length);
    }

    public String C(String string) {
        return super.java_lang_String_w(string);
    }

    public MD5HashProvider() {
        super((String)MD5HashProvider.c("㺀", (int)(var_int_c & var_int_d), (long)i));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(MD5HashProvider.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.D("ԪՌՎԮՒձթտիԺոծռնԿդֆօսփսՒ", (byte)111, 68), MD5HashProvider.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.F("֎֛֚՝֝֙֔֝֨֗դ֢֦֢֟֨ժ࣐ऀ࣑ࣿ࣠ࣳࣻइं࣫ࣚऎւ", (byte)111, 70) + string + NLoginCore_092.F("ե", (byte)111, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public String java_lang_String_w(String string) {
        return (String)MD5HashProvider.c("㺀", (int)k, (long)(m ^ n)) + super.java_lang_String_w(string);
    }
}

