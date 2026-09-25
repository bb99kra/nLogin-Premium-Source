/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_204;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_547;
import com.nickuc.login.NLoginCore_453;
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

public class UpdateCommand
implements NLoginCore_249,
NLoginCore_415 {
    private static long q;
    private final NLoginCore_211 T;
    private static long o;
    private static long c;
    private static int i;
    private static int m;
    private static long j;
    private static long r;
    private static int k;
    private static int var_int_a;
    private static int g;
    private static int f;
    private static int s;
    private static int e;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_b;
    private static int l;
    private static int t;
    private static int p;
    private static long d;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static int h;

    @Generated
    public UpdateCommand(NLoginCore_211 NLoginCore_211) {
        this.T = NLoginCore_211;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_547.z[NLoginCore_4452.ordinal()]) {
            case 1: 
            case 2: {
                NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().a((String)UpdateCommand.c("㺀", (int)n, (long)o), (String)UpdateCommand.c("㺃", (int)p, (long)(q ^ r))).ag();
                NLoginType_008.com_nickuc_login_NLoginCore_227_a().a(NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_g ? NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b : NLoginCore_204.var_com_nickuc_login_NLoginCore_204_c);
                NLoginCore_415.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0x27D1FC0554829DFCL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(50 + 18), (byte)(10 + 59), 83, (byte)(42 + 5), (byte)(27 + 40), (byte)(6 + 60), (byte)(12 + 55), (byte)(31 + 16), 80, (byte)(48 + 27), (byte)(11 + 56), (byte)(76 + 7), (byte)(26 + 27), (byte)(39 + 41), (byte)(14 + 83), (byte)(75 + 25), (byte)(19 + 81), (byte)(77 + 28), (byte)(26 + 84), (byte)(92 + 11)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.F("բկծԱձխըձռիԸնպճնռԾࢸࣇ࣒ࣚࣖࣔࣛࢺ", (byte)67, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            UpdateCommand.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 7002458330251981744L;
        long l = c ^ 0x27D1FC0554829DFCL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(35 + 48), (byte)(41 + 6), (byte)(34 + 33), (byte)(18 + 48), (byte)(61 + 6), (byte)(29 + 18), (byte)(61 + 19), (byte)(6 + 69), (byte)(23 + 44), (byte)(53 + 30), (byte)(5 + 48), 80, (byte)(88 + 9), (byte)(49 + 51), (byte)(70 + 30), (byte)(53 + 52), (byte)(104 + 6), (byte)(56 + 47)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), 83}, StandardCharsets.UTF_8));
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
                    UpdateCommand.var_java_lang_String_arr_b[0] = NLoginCore_110.E("Պՙ՜հծՈ֌֍վևքհմՌՍե՜֘՘֟֒֠էը", (byte)88, 69);
                    UpdateCommand.var_java_lang_String_arr_b[1] = NLoginCore_092.B("ŲŷƣūŞŤƏƧźƣżƠƈƑŨƃƎƴƭƇŴƅƂƃ", (byte)88, 66);
                    UpdateCommand.var_java_lang_String_arr_b[2] = NLoginCore_004.D("ӳԂԅԙԗӱԵԶԧ԰ԭԙԝӵӶԎԅՁԁՈԻՉԐԑ", (byte)88, 68);
                    UpdateCommand.var_java_lang_String_arr_b[3] = NLoginCore_453.F("ՍիօՎ֏֌ՓկՠՍՎ՜", (byte)88, 70);
                    continue block7;
                }
                case 1: {
                    UpdateCommand.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ťŴŷƋƉţƧƨƙƢƟƅƊƩƯƟƈƋƮƦƥƫƂƃ", (byte)88, 65);
                    UpdateCommand.var_java_lang_String_arr_b[1] = NLoginCore_076.D("ԀԅԱӹӬӲԝԵԈԱԋԒӿӼӼԏՁՆՄԙԩԘԿԷԎՅԽՈՎԌՂԤ", (byte)88, 68);
                    UpdateCommand.var_java_lang_String_arr_b[2] = NLoginCore_201.F("Պՙ՜հծՈ֌֍վևփդխ֊֚֔չվՕ֠՜պէը", (byte)88, 70);
                    UpdateCommand.var_java_lang_String_arr_b[3] = NLoginCore_027.C("ӮԳԨӲԵӶԵԛԋӵԌԅ", (byte)88, 67);
                    continue block7;
                }
                case 2: {
                    UpdateCommand.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ӵԀԹԡԹӱԭԐԌԳԔԅ", (byte)88, 67);
                    continue block7;
                }
                case 4: {
                    UpdateCommand.var_java_lang_String_arr_b[0] = NLoginCore_173.C("ӲԥԁԆӹԗԳԇԮԛӹԗԫԣӼԠԂՇԹԞԥԓԐԑ", (byte)88, 67);
                }
            }
        }
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.T;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        Object[] objectArray = new Object[g];
        objectArray[UpdateCommand.h] = UpdateCommand.c("㺀", (int)i, (long)j);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_f, objectArray);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[k];
        NLoginCore_445Array[UpdateCommand.l] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_g;
        NLoginCore_445Array[UpdateCommand.m] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_h;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    static {
        var_int_a = 0 >>> 182 | 0 << ~182 + 1;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-2463710287377877882L);
        e = 256 >>> 40 | 256 << -40;
        f = (0 >>> 247 | 0 << ~247 + 1) & 0xFFFFFFFF;
        g = (131072 >>> 113 | 131072 << -113) & 0xFFFFFFFF;
        h = (0 >>> 42 | 0 << ~42 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Long.reverse(-2463710287377877882L);
        k = Integer.reverse(0x40000000);
        l = (0 >>> 196 | 0 << -196) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = 32768 >>> 110 | 32768 << -110;
        o = Long.reverse(-2463710287377877882L);
        p = 0x180000 >>> 243 | 0x180000 << ~243 + 1;
        q = Long.reverse(995054226442663046L);
        r = Long.reverse(-3458764513820540928L);
        s = Integer.reverse(0x20000000);
        t = (Integer.MIN_VALUE >>> 29 | Integer.MIN_VALUE << -29) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        UpdateCommand.b();
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (NLoginType_008.com_nickuc_login_NLoginCore_495_a().p() || !NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().c((String)UpdateCommand.c("㺀", (int)(var_int_a & var_int_b), (long)d)) ? e : f) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(UpdateCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.C("АвдДиїяѥёРўєѢќХъѬѫѣѩѣи", (byte)17, 67), UpdateCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.B("ĄđĐÓēďĊēĞčÚĘĜĕĘĞàњѩѼѸѶѴѽќô", (byte)17, 66) + string + NLoginCore_138.F("ԇ", (byte)17, 70) + methodType.toString(), exception);
        }
    }
}

