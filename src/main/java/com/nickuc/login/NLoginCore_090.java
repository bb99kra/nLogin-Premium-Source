/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_317;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_502;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
import java.io.IOException;
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

public class NLoginCore_090
implements NLoginCore_502 {
    private static int w;
    private static String[] var_java_lang_String_arr_b;
    private static int t;
    private static int e;
    private static int v;
    private static int x;
    private static long o;
    private static long j;
    private static long i;
    private static int p;
    private static String[] var_java_lang_String_arr_a;
    private static long c;
    private static int h;
    private static long g;
    private static int q;
    private static int u;
    private static long d;
    private static int var_int_a;
    public static final NLoginCore_090 var_com_nickuc_login_NLoginCore_090_a;
    private static long n;
    private static long r;
    private static long var_long_b;
    private static long l;
    private static int s;
    private static long f;
    private static int m;
    private static int k;

    private static void b() {
        int n;
        c = 6525800531613881496L;
        long l = c ^ 0x88A0FA65D52AB539L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(6 + 63), (byte)(3 + 80), (byte)(38 + 9), (byte)(29 + 38), 66, (byte)(15 + 52), (byte)(19 + 28), (byte)(32 + 48), (byte)(73 + 2), (byte)(22 + 45), (byte)(15 + 68), (byte)(36 + 17), (byte)(25 + 55), (byte)(9 + 88), (byte)(11 + 89), (byte)(23 + 77), (byte)(97 + 8), 110, (byte)(4 + 99)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_090.var_java_lang_String_arr_b[0] = NLoginCore_091.C("чиќеъцѳѨѠњяѠҁ҄яњшўѠѿѫљ҉ѐэўѭѼѧѲєъ", (byte)25, 67);
                    NLoginCore_090.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ԭԊԣԯԛԬԼԭԩԕԣԋԢ՛՝ԾԜԩ՜՞՞ԻԨԩ", (byte)25, 69);
                    NLoginCore_090.var_java_lang_String_arr_b[2] = NLoginCore_324.B("ęäĬĭîøĄĭģĒĢēĭđĴķĔĥôĸõħĩčČĬāĤĶĠŇģĪŇĂĞńĿĚľĞąŎę", (byte)25, 66);
                    NLoginCore_090.var_java_lang_String_arr_b[3] = NLoginCore_223.E("ՋԨԿԚԐՁՐԐԪՋԓԝ", (byte)25, 69);
                    NLoginCore_090.var_java_lang_String_arr_b[4] = NLoginCore_138.E("ԮԏՌԪԭԡԵԾԤԖՉ՘ԲՃԴՌ՝՘ՁՖՁԹԶՃՇԽԻթՖՁԩԟ", (byte)25, 69);
                    NLoginCore_090.var_java_lang_String_arr_b[5] = NLoginCore_091.A("äėûĥĊîúëěĔĥĬðĘĎķďöĥċùĽĄą", (byte)25, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_090.var_java_lang_String_arr_b[0] = NLoginCore_575.B("øéčæû÷ĤęđċĀđĲĵĀċùďđİĜĎùŀüĕĶıĶĥĄē", (byte)25, 66);
                    NLoginCore_090.var_java_lang_String_arr_b[1] = NLoginCore_173.E("ԭԊԣԯԛԬԼԭԩԕԠ՚ԻԕՅԨԗՐԵՂԬՔՄԿԜՈՠԶթզԾՍ", (byte)25, 69);
                    NLoginCore_090.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ԽԈՐՑԒԜԨՑՇԶՆԷՑԵ՘՛ԸՉԘ՜ԙՋՍԱ԰ՐԥՈ՚ՄիՇզ՘ՏՙըՍՍԵ՞ձԳԽ", (byte)25, 69);
                    NLoginCore_090.var_java_lang_String_arr_b[3] = NLoginCore_091.B("ôĢČġàĭéĦĩěüù", (byte)25, 66);
                    NLoginCore_090.var_java_lang_String_arr_b[4] = NLoginCore_223.D("љкѷѕјьѠѩясѴ҃ѝѮџѷ҈҃ѬҁѬѥҌѯўфѲѽѧҔ҄ѷ", (byte)25, 68);
                    NLoginCore_090.var_java_lang_String_arr_b[5] = NLoginCore_223.F("ԈԻԟՉԮԒԞԏԿԸՇՒՋԕ՚ԙԫԟԒԿԭՎԻԴՓԸՔԟԴեէԬ", (byte)25, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_090.var_java_lang_String_arr_b[0] = NLoginCore_173.B("æġĬĆČ÷ĮñĬëĴĊðĆĉõĵěİİõėĄą", (byte)25, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_090.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ањњѽэјѿќѯюяѹѡѕѼіњ҄ѻѸ҆Ҍѓє", (byte)25, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x56L;
        l ^= 0x88A0FA65D52AB539L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), 69, (byte)(44 + 39), (byte)(29 + 18), (byte)(61 + 6), (byte)(18 + 48), (byte)(9 + 58), (byte)(20 + 27), (byte)(26 + 54), (byte)(62 + 13), (byte)(28 + 39), (byte)(60 + 23), (byte)(44 + 9), 80, (byte)(88 + 9), (byte)(32 + 68), (byte)(61 + 39), (byte)(24 + 81), (byte)(28 + 82), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), (byte)(6 + 77)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("ՇՔՓԖՖՒՍՖաՐԝ՛՟՘՛աԣࢭࢉࢭࢲ࢙ࢽࢲ࢟ࣄࢧ࢒ࣁࢷ࢕ࢵ", (byte)40, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_090.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 19 | 0 << ~19 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(1813094142712088922L);
        d = Long.reverse(0x6A00000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(1813094142712088922L);
        g = Long.reverse(0x6A00000000000000L);
        h = (0x2000000 >>> 152 | 0x2000000 << -152) & 0xFFFFFFFF;
        i = Long.reverse(1813094142712088922L);
        j = Long.reverse(0x6A00000000000000L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(8298277606125603162L);
        m = 0x40000000 >>> 124 | 0x40000000 << -124;
        n = Long.reverse(1813094142712088922L);
        o = Long.reverse(0x6A00000000000000L);
        p = Integer.reverse(-1610612736);
        q = -1 >>> 152 | -1 << -152;
        r = Long.reverse(8298277606125603162L);
        s = 0 >>> 167 | 0 << ~167 + 1;
        t = 131072 >>> 241 | 131072 << -241;
        u = 65536 >>> 112 | 65536 << ~112 + 1;
        v = 0 >>> 108 | 0 << ~108 + 1;
        w = 3072 >>> 137 | 3072 << ~137 + 1;
        x = Integer.reverse(0x60000000);
        var_java_lang_String_arr_a = new String[w];
        var_java_lang_String_arr_b = new String[x];
        NLoginCore_090.b();
        var_com_nickuc_login_NLoginCore_090_a = new NLoginCore_090();
    }

    @Override
    public String q() {
        return NLoginCore_090.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
    }

    @Override
    public void c(NLoginType_008 NLoginType_008) {
        NLoginCore_531 NLoginCore_479 = NLoginCore_531.var_com_nickuc_login_NLoginCore_479_f;
        NLoginCore_400 NLoginCore_374 = NLoginCore_479.com_nickuc_login_NLoginCore_374_a();
        File file = new File(((NLoginCore_317)NLoginCore_374).java_io_File_b(), (String)NLoginCore_090.c("㺀", (int)e, (long)(f ^ g)));
        if (file.exists()) {
            return;
        }
        NLoginCore_370.e(NLoginCore_150.j() ? (String)NLoginCore_090.c("㺃", (int)h, (long)(i ^ j)) + NLoginCore_479.getName() + (String)NLoginCore_090.c("㺆", (int)k, (long)l) : (String)NLoginCore_090.c("㺉", (int)m, (long)(n ^ o)) + NLoginCore_479.getName() + (String)NLoginCore_090.c("㺌", (int)(p & q), (long)r), new Object[s]);
        NLoginCore_374.a(null, t != 0);
        try {
            NLoginCore_366.b(file);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008) {
        NLoginCore_531 NLoginCore_479 = NLoginCore_531.var_com_nickuc_login_NLoginCore_479_f;
        NLoginCore_400 NLoginCore_374 = NLoginCore_479.com_nickuc_login_NLoginCore_374_a();
        return (NLoginCore_374 != null && NLoginCore_374.isAvailable() ? u : v) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_090.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.C("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 67), NLoginCore_090.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.E("ր֍֌Տ֏֋ֆ֏֚։Ֆ֑֚֔֘֔՜ࣦࣂࣰࣦ࣒ࣶࣺ࣮࣫࣫ࣘࣽ࣠࣋࣎շ", (byte)97, 69) + string + NLoginCore_446.D("Ԓ", (byte)97, 68) + methodType.toString(), exception);
        }
    }
}

