/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_001
implements NLoginCore_415 {
    private static int n;
    private static int d;
    private static int k;
    private static int r;
    private static long var_long_c;
    private static int l;
    private static int g;
    private static int q;
    private static int e;
    private static int h;
    private static int var_int_a;
    private static final int ag;
    private static int i;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static long o;
    private static int var_int_b;
    private static String[] var_java_lang_String_arr_b;
    private static int s;
    private static long p;
    private static int j;
    private final NLoginCore_211 L;
    private static int f;
    private static int m;

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.B, string -> {
            String string2 = string.trim();
            if (string2.length() > i && string2.charAt(j) == k && string2.charAt(string.length() - l) == m) {
                NLoginInterface_0242.c((String)string, (String)NLoginCore_001.c("㺀", (int)n, (long)(o ^ p)));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[f]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[g];
        NLoginCore_445Array[NLoginCore_001.h] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return (!NLoginType_008.com_nickuc_login_NLoginCore_495_a().p() && NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() != var_int_a && NLoginCore_354.a().nextInt(var_int_b) <= var_int_c ? d : e) != 0;
    }

    private static void b() {
        int n;
        var_long_c = 2992738403137958922L;
        long l = var_long_c ^ 0xDF657786B60E057BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(32 + 37), (byte)(52 + 31), (byte)(4 + 43), 67, (byte)(51 + 15), (byte)(43 + 24), 47, (byte)(42 + 38), (byte)(51 + 24), (byte)(13 + 54), (byte)(8 + 75), (byte)(33 + 20), (byte)(40 + 40), (byte)(3 + 94), (byte)(94 + 6), (byte)(38 + 62), (byte)(72 + 33), (byte)(35 + 75), (byte)(23 + 80)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
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
                    NLoginCore_001.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ՄՐՉԫՆԻԥՊ՛ԳԹՀԯԖՂԼԴՔԵէԩԞՎԻլխԨԩՂՁ԰ենզ՚ժիՔհՐ՘՝՝ղԼԼհ՛ԹՒՃնլՔՑՒ", (byte)34, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_001.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ՄՐՉԫՆԻԥՊ՛ԳԹՀԯԖՂԼԴՔԵէԩԞՎԻլխԨԩՂՁ԰ենզ՚ժիՔհՐ՘՝ՠՙՁցՏմՓբ՗քջՂ՛֏շՎՊրֈր֌խ", (byte)34, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_001.var_java_lang_String_arr_b[0] = NLoginCore_110.D("ѯѦѧѓҗѯҙҌ҅ҒѧѴғѮҞҁҕҚѴ҃ѾҒңѨҊџѾҀҙҁѾҩ", (byte)34, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_001.var_java_lang_String_arr_b[0] = NLoginCore_324.F("Րԡ՘ԑՄԪԩԹ՝Զ՟Ԧ", (byte)34, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_001.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.B("·ÙÛ»ßþöČøÇąûĉăÌñēĒĊĐĊß", (byte)8, 66), NLoginCore_001.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.A("òÿþÁāýøāČûÈĆĊăĆČÎћщныїѥљтѐѤä", (byte)8, 65) + string + NLoginCore_451.F("Ӿ", (byte)8, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_001(NLoginCore_211 NLoginCore_211) {
        this.L = NLoginCore_211;
    }

    private static String a(int n, long l) {
        l ^= 0x48L;
        l ^= 0xDF657786B60E057BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(20 + 48), (byte)(68 + 1), (byte)(19 + 64), (byte)(45 + 2), (byte)(50 + 17), (byte)(60 + 6), (byte)(30 + 37), (byte)(32 + 15), 80, (byte)(28 + 47), (byte)(52 + 15), (byte)(22 + 61), 53, (byte)(71 + 9), (byte)(43 + 54), (byte)(91 + 9), (byte)(79 + 21), (byte)(93 + 12), (byte)(51 + 59), (byte)(9 + 94)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("՝ժթԬլըգլշզԳձյծձշԹࣆࢴࢨࢶࣂ࣐ࣄࢭࢻ࣏", (byte)62, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_001.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.L;
    }

    static {
        var_int_a = 0x480000 >>> 179 | 0x480000 << -179;
        var_int_b = Integer.reverse(0x26000000);
        var_int_c = (1 >>> 159 | 1 << -159) & 0xFFFFFFFF;
        d = 4096 >>> 236 | 4096 << -236;
        e = Integer.reverse(0);
        f = (0 >>> 9 | 0 << -9) & 0xFFFFFFFF;
        g = 0x1000000 >>> 248 | 0x1000000 << ~248 + 1;
        h = (0 >>> 143 | 0 << ~143 + 1) & 0xFFFFFFFF;
        i = Integer.reverse(0x40000000);
        j = Integer.reverse(0);
        k = Integer.reverse(-637534208);
        l = (131072 >>> 177 | 131072 << -177) & 0xFFFFFFFF;
        m = Integer.reverse(-1174405120);
        n = Integer.reverse(0);
        o = Long.reverse(5777182693857563028L);
        p = Long.reverse(0x1200000000000000L);
        q = 256 >>> 72 | 256 << -72;
        r = Integer.reverse(Integer.MIN_VALUE);
        s = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_001.b();
        ag = s;
    }
}

