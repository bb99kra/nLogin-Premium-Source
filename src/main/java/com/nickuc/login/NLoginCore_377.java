/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_475;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
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
import lombok.Generated;

public class NLoginCore_377
implements NLoginCore_249,
NLoginCore_415 {
    private static int var_int_a;
    private static long j;
    private static int s;
    private static int q;
    private static long var_long_b;
    private static int g;
    private static long o;
    private static int e;
    private static int f;
    private static int n;
    private static int t;
    private static long p;
    private static long c;
    private static String[] var_java_lang_String_arr_b;
    private static long d;
    private static int k;
    private static int m;
    private static int i;
    private static int r;
    private static int l;
    private final NLoginCore_211 P;
    private static int h;
    private static String[] var_java_lang_String_arr_a;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        Object[] objectArray = new Object[g];
        objectArray[NLoginCore_377.h] = NLoginCore_377.c("㺀", (int)i, (long)j);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_g, objectArray);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[k];
        NLoginCore_445Array[NLoginCore_377.l] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_i;
        NLoginCore_445Array[NLoginCore_377.m] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_j;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    static {
        var_int_a = 0 >>> 11 | 0 << -11;
        var_long_b = Long.reverse(-2101937964693275631L);
        d = Long.reverse(-6341068275337658368L);
        e = 0x200000 >>> 21 | 0x200000 << ~21 + 1;
        f = Integer.reverse(0);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Long.reverse(5392051815251229713L);
        k = (0x1000000 >>> 215 | 0x1000000 << ~215 + 1) & 0xFFFFFFFF;
        l = 0 >>> 79 | 0 << -79;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0x40000000);
        o = Long.reverse(-2101937964693275631L);
        p = Long.reverse(-6341068275337658368L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(0);
        s = (0x6000000 >>> 25 | 0x6000000 << -25) & 0xFFFFFFFF;
        t = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        NLoginCore_377.b();
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.P;
    }

    private static String a(int n, long l) {
        l ^= 0x15L;
        l ^= 0xDC3909926CC83474L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(39 + 29), (byte)(54 + 15), 83, (byte)(22 + 25), (byte)(12 + 55), (byte)(47 + 19), (byte)(30 + 37), (byte)(33 + 14), (byte)(75 + 5), (byte)(25 + 50), (byte)(62 + 5), (byte)(35 + 48), (byte)(40 + 13), (byte)(40 + 40), (byte)(66 + 31), (byte)(84 + 16), (byte)(59 + 41), 105, (byte)(58 + 52), (byte)(7 + 96)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, (byte)(21 + 62)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("՟լիԮծժեծչըԵճշհճչԻࣖ࣎ࣕࢣࣂࣕࣈࢴࣜ", (byte)64, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_377.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_377.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.F("ՌծհՐմ֓֋֡֍՜֚֐֞֘աֆ֧֥֨֟֟մ", (byte)104, 70), NLoginCore_377.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.F("և֔֓Ֆ֖֒֍֖֡֐՝֛֛֟֘֡գࣰࣶࣾࣽ࣋࣪ࣽࣜऄո", (byte)104, 70) + string + NLoginCore_223.E("՞", (byte)104, 69) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_495_a().p() || !NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().c((String)NLoginCore_377.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))) ? e : f) != 0;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_475.v[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().com_nickuc_login_NLoginCore_482_a((String)NLoginCore_377.c("㺀", (int)n, (long)(o ^ p)), (NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_i ? q : r) != 0).ag();
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    @Generated
    public NLoginCore_377(NLoginCore_211 NLoginCore_211) {
        this.P = NLoginCore_211;
    }

    private static void b() {
        int n;
        c = -8629687145237959865L;
        long l = c ^ 0xDC3909926CC83474L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(60 + 9), (byte)(56 + 27), (byte)(3 + 44), (byte)(16 + 51), (byte)(5 + 61), (byte)(65 + 2), (byte)(2 + 45), (byte)(63 + 17), (byte)(28 + 47), 67, (byte)(74 + 9), (byte)(6 + 47), (byte)(69 + 11), (byte)(42 + 55), (byte)(13 + 87), (byte)(95 + 5), (byte)(24 + 81), 110, (byte)(83 + 20)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_377.var_java_lang_String_arr_b[0] = NLoginCore_451.A("ćĕŁăğŅŐĠīŉċĔŃŋŔĦķěŇĥōħĤĥ", (byte)41, 65);
                    NLoginCore_377.var_java_lang_String_arr_b[1] = NLoginCore_076.F("ԳՇ՜Ԝՠԯ՝ՎՆաՙԨԜՃՃՄ՟լխՒ՟ԻԸԹ", (byte)41, 70);
                    NLoginCore_377.var_java_lang_String_arr_b[2] = NLoginCore_559.F("ԛԩՕԗԳՙդԴԿ՝ԟԨ՗՟ըԺՋԯ՛ԹաԻԸԹ", (byte)41, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_377.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ćĕŁăğŅŐĠīŉčĭĮĳńĭĖňħļľķĤĥ", (byte)41, 66);
                    NLoginCore_377.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ѾҒҧѧҫѺҨҙґҬҢѬѲҠѮҁҲҖғѵҍҿҧѽӁҳѾҠӄӆҖҾ", (byte)41, 68);
                    NLoginCore_377.var_java_lang_String_arr_b[2] = NLoginCore_384.F("ԛԩՕԗԳՙդԴԿ՝Ԣԟ՟Լ՞ԾՌԼհԬԿԻԸԹ", (byte)41, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_377.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ńŃŌŁłěĎŐŊčĲħĤńōĸŌņĒĦľķĤĥ", (byte)41, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_377.var_java_lang_String_arr_b[0] = NLoginCore_173.F("ՏԟՉԝ՟ԭԴԡ՟գԷէթՋՔէԶժՊզթՈԪՄՂաՎըԸԻեծ", (byte)41, 70);
                }
            }
        }
    }
}

