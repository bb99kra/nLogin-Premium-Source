/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_142;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_204;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_233;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_278;
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

public class NLoginCore_124
implements NLoginCore_415 {
    private static int y;
    private static int h;
    private static long ai;
    private static int q;
    private static long d;
    private static int k;
    private static int e;
    private static int aa;
    private static int var_int_a;
    private static int n;
    private static int v;
    private static int s;
    private static String[] var_java_lang_String_arr_a;
    private static int ag;
    private static int z;
    private static String[] var_java_lang_String_arr_b;
    private static int w;
    private static long ae;
    private static int t;
    private static int ac;
    private static long o;
    private static int f;
    private static long var_long_c;
    private static long ad;
    private static int x;
    private final NLoginCore_211 O;
    private static int ab;
    private static int g;
    private static int r;
    private static int l;
    private static long i;
    private static int u;
    private static int ak;
    private static int aj;
    private static int var_int_c;
    private static long ah;
    private static long p;
    private static int m;
    private static int var_int_b;
    private static int af;
    private static long j;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        GUIButtonContainer[] GUIButtonContainerArray;
        Object object;
        NLoginCore_142 NLoginCore_1422 = NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a();
        String string = NLoginCore_1422.M();
        String string2 = NLoginType_008.s();
        boolean bl = NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().ac();
        if (!string2.equals(string)) {
            Object[] objectArray = new Object[k];
            objectArray[NLoginCore_124.l] = string2;
            objectArray[NLoginCore_124.m] = string;
            object = String.format((String)NLoginCore_124.c("㺀", (int)h, (long)(i ^ j)), objectArray);
        } else {
            object = NLoginCore_124.c("㺃", (int)n, (long)(o ^ p));
        }
        Object object2 = object;
        NLoginCore_204 NLoginCore_2042 = NLoginCore_1422.com_nickuc_login_NLoginCore_204_b();
        if (NLoginCore_2042 == null) {
            NLoginCore_2042 = NLoginCore_204.var_com_nickuc_login_NLoginCore_204_c;
        }
        String string3 = NLoginCore_150.a(NLoginCore_5092.com_nickuc_login_NLoginCore_055_a()).a(NLoginCore_2042 == NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b ? NLoginCore_397.var_com_nickuc_login_NLoginCore_237_a : NLoginCore_397.var_com_nickuc_login_NLoginCore_237_b, new Object[q]);
        NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_q, new Object[r]);
        Object[] objectArray = new Object[s];
        objectArray[NLoginCore_124.t] = object2;
        objectArray[NLoginCore_124.u] = string3;
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, bl ? NLoginCore_397.var_com_nickuc_login_NLoginCore_237_y : NLoginCore_397.var_com_nickuc_login_NLoginCore_237_x, objectArray);
        if (bl) {
            NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[v];
            NLoginCore_445Array[NLoginCore_124.w] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
            GUIButtonContainerArray = GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
        } else {
            NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[x];
            NLoginCore_445Array[NLoginCore_124.y] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
            NLoginCore_445Array[NLoginCore_124.z] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c;
            GUIButtonContainerArray = GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
        }
        return GUIButtonContainerArray;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        NLoginCore_227 NLoginCore_2272 = NLoginType_008.com_nickuc_login_NLoginCore_227_a();
        NLoginCore_142 NLoginCore_1422 = NLoginCore_2272.com_nickuc_login_NLoginCore_142_a();
        String string = NLoginCore_1422.M();
        NLoginCore_233 NLoginCore_2332 = NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_233_a();
        if (string == null) {
            NLoginCore_2332.e(var_int_a != 0);
            return var_int_b != 0;
        }
        return (!NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().boolean_a((String)NLoginCore_124.c("㺀", (int)var_int_c, (long)d), e != 0) && (NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a().ac() || NLoginCore_1422.ad() && !NLoginCore_2332.ah()) ? f : g) != 0;
    }

    static {
        var_int_a = (2 >>> 129 | 2 << -129) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-8609587492184958597L);
        e = (256 >>> 136 | 256 << ~136 + 1) & 0xFFFFFFFF;
        f = 0x2000000 >>> 121 | 0x2000000 << -121;
        g = Integer.reverse(0);
        h = 32 >>> 133 | 32 << -133;
        i = Long.reverse(-395021771861173893L);
        j = Long.reverse(0x7200000000000000L);
        k = Integer.reverse(0x40000000);
        l = Integer.reverse(0);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = 16384 >>> 141 | 16384 << ~141 + 1;
        o = Long.reverse(-395021771861173893L);
        p = Long.reverse(0x7200000000000000L);
        q = (0 >>> 143 | 0 << ~143 + 1) & 0xFFFFFFFF;
        r = Integer.reverse(0);
        s = (512 >>> 232 | 512 << -232) & 0xFFFFFFFF;
        t = Integer.reverse(0);
        u = Integer.reverse(Integer.MIN_VALUE);
        v = (0x20000000 >>> 125 | 0x20000000 << -125) & 0xFFFFFFFF;
        w = (0 >>> 71 | 0 << -71) & 0xFFFFFFFF;
        x = Integer.reverse(0x40000000);
        y = Integer.reverse(0);
        z = (128 >>> 71 | 128 << -71) & 0xFFFFFFFF;
        aa = (128 >>> 134 | 128 << ~134 + 1) & 0xFFFFFFFF;
        ab = Integer.reverse(0);
        ac = (3 >>> 192 | 3 << -192) & 0xFFFFFFFF;
        ad = Long.reverse(-395021771861173893L);
        ae = Long.reverse(0x7200000000000000L);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = 32768 >>> 13 | 32768 << ~13 + 1;
        ah = Long.reverse(-395021771861173893L);
        ai = Long.reverse(0x7200000000000000L);
        aj = 10 >>> 161 | 10 << -161;
        ak = 0x280000 >>> 115 | 0x280000 << -115;
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_124.b();
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.O;
    }

    @Generated
    public NLoginCore_124(NLoginCore_211 NLoginCore_211) {
        this.O = NLoginCore_211;
    }

    private static String a(int n, long l) {
        l ^= 0x4EL;
        l ^= 0xBC145B5FC126E204L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(9 + 60), (byte)(31 + 52), (byte)(43 + 4), (byte)(5 + 62), (byte)(55 + 11), (byte)(63 + 4), (byte)(19 + 28), (byte)(53 + 27), 75, (byte)(11 + 56), (byte)(52 + 31), (byte)(48 + 5), 80, (byte)(94 + 3), (byte)(83 + 17), (byte)(23 + 77), (byte)(27 + 78), (byte)(3 + 107), (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(76 + 7)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.D("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ࢐࢔ࡳࢌ࢔ࡹ࢚࢛", (byte)88, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_124.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -2406376196366851745L;
        long l = var_long_c ^ 0xBC145B5FC126E204L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(65 + 4), (byte)(32 + 51), (byte)(24 + 23), (byte)(14 + 53), (byte)(19 + 47), (byte)(35 + 32), (byte)(39 + 8), (byte)(27 + 53), (byte)(3 + 72), (byte)(10 + 57), 83, (byte)(28 + 25), (byte)(25 + 55), (byte)(6 + 91), (byte)(91 + 9), (byte)(99 + 1), (byte)(14 + 91), (byte)(92 + 18), (byte)(11 + 92)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_124.var_java_lang_String_arr_b[0] = NLoginCore_387.C("҈ѶҠќѿѼѬѽѳҒҏҀѽ҉Ѧ҆Ҧ҈҂үѺҊѷѸ", (byte)37, 67);
                    NLoginCore_124.var_java_lang_String_arr_b[1] = NLoginCore_446.C("ј҈ҐѨњѡҐңѷ҆ҙѴҦѩ҂ҧ҅ѷҭ҃ҜґҊҁҌҏ҉Ҍңҍѵҝ", (byte)37, 67);
                    NLoginCore_124.var_java_lang_String_arr_b[2] = NLoginCore_092.F("ՍԨՅԩԩԽԨԱՂԿԬԩ", (byte)37, 70);
                    NLoginCore_124.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ėłďĻĤÿĿĵģņĤđ", (byte)37, 65);
                    NLoginCore_124.var_java_lang_String_arr_b[4] = NLoginCore_223.C("Ѿ҇ҞѺѠҚҀҝҁѲѷѬ", (byte)37, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_124.var_java_lang_String_arr_b[0] = NLoginCore_138.C("҈ѶҠќѿѼѬѽѳҒ҈ҡѧҊҔѶѦѹѻҥѺҊѷѸ", (byte)37, 67);
                    NLoginCore_124.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ԕՅՍԥԗԞՍՠԴՃՖԱգԦԿդՂԴժՀՙՐԬզղՌՐՒկգէԱպՃձԸ՚ՊՒՓՁջ՜Չ", (byte)37, 70);
                    NLoginCore_124.var_java_lang_String_arr_b[2] = NLoginCore_004.D("ҜѨѪҗѹҡҍҜѡҒҥѬ", (byte)37, 68);
                    NLoginCore_124.var_java_lang_String_arr_b[3] = NLoginCore_451.A("ĠęĚķėĘİĸĆěĿČīĺęĥļŇēŌčŕĜĝ", (byte)37, 65);
                    NLoginCore_124.var_java_lang_String_arr_b[4] = NLoginCore_027.C("ҐѼёѹѿѡѿѬѣҧҙҁ҉ҞѫҗҦҎѡҁ҅ѺѷѸ", (byte)37, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_124.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ՃՔ՘ԧԭԵՉԾՕԞՠԥԘՙԻՀԺՌդ՟ԪՇԴԵ", (byte)37, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_124.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՉԸ՘ՏԨԑԺԲԿԝ՘ՔգՏ՟ՈԳՃՄաԤԷԴԵ", (byte)37, 69);
                }
            }
        }
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_278.u[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                String[] stringArray = new String[aa];
                stringArray[NLoginCore_124.ab] = NLoginCore_124.c("㺀", (int)ac, (long)(ad ^ ae));
                stringArray[NLoginCore_124.af] = NLoginCore_124.c("㺃", (int)ag, (long)(ah ^ ai));
                NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b.a(NLoginCore_277, NLoginCore_5092, stringArray);
            }
            case 3: {
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_124.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.E("ԲՔՖԶ՚չձևճՂրնքվՇլ֎֍օ֋օ՚", (byte)78, 69), NLoginCore_124.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.D("ԂԏԎӑԑԍԈԑԜԋӘԖԚԓԖԜӞࡲࡶࡕ࡮ࡶ࡛ࡼࡽӲ", (byte)78, 68) + string + NLoginCore_446.D("ә", (byte)78, 68) + methodType.toString(), exception);
        }
    }
}

