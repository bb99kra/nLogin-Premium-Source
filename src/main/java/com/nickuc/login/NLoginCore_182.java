/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_338;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_410;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_182
extends NLoginCore_410 {
    private static int aw;
    private static long as;
    private static long ad;
    private static long o;
    private static final String G;
    private static long ax;
    private static int z;
    private static int var_int_e;
    private static long bm;
    private static long bh;
    private static long bk;
    private static long ay;
    private static final String H;
    private static long q;
    private static long p;
    private static int bc;
    private static String[] f;
    private static int bd;
    private static long ac;
    private static String[] var_java_lang_String_arr_e;
    private static int bi;
    private static int bf;
    private static long ap;
    private static int af;
    private static int az;

    static {
        var_int_e = (0 >>> 116 | 0 << -116) & 0xFFFFFFFF;
        p = Long.reverse(420650961751067539L);
        q = Long.reverse(Long.MIN_VALUE);
        z = (Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << -159) & 0xFFFFFFFF;
        ac = Long.reverse(420650961751067539L);
        ad = Long.reverse(Long.MIN_VALUE);
        af = Integer.reverse(0x40000000);
        ap = Long.reverse(420650961751067539L);
        as = Long.reverse(Long.MIN_VALUE);
        aw = (0x1800000 >>> 23 | 0x1800000 << -23) & 0xFFFFFFFF;
        ax = Long.reverse(420650961751067539L);
        ay = Long.reverse(Long.MIN_VALUE);
        az = Integer.reverse(0x60000000);
        bc = Integer.reverse(0x60000000);
        bd = 256 >>> 166 | 256 << -166;
        bf = Integer.reverse(-1);
        bh = Long.reverse(-8802721075103708269L);
        bi = Integer.reverse(-1610612736);
        bk = Long.reverse(420650961751067539L);
        bm = Long.reverse(Long.MIN_VALUE);
        var_java_lang_String_arr_e = new String[az];
        f = new String[bc];
        NLoginCore_182.void_b();
        H = NLoginCore_182.c("㺀", (int)(bd & bf), (long)bh);
        G = NLoginCore_182.c("㺃", (int)bi, (long)(bk ^ bm));
    }

    @Override
    protected void a(NLoginCore_219 NLoginCore_2192, String string, String string2) {
        String string3 = NLoginCore_2192.java_lang_String_b(string2 + (String)NLoginCore_182.c("㺀", (int)af, (long)(ap ^ as)));
        if (string3 != null) {
            String string4 = NLoginCore_2192.java_lang_String_b(string2 + (String)NLoginCore_182.c("㺃", (int)aw, (long)(ax ^ ay)));
            NLoginCore_338 NLoginCore_338 = NLoginCore_338.valueOf(string3.toUpperCase(Locale.ENGLISH));
            this.a(string, NLoginCore_338.e(string4), null, null);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_182.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.C("ԏԱԳԓԷՖՎդՐԟ՝Փա՛ԤՉիժբըբԷ", (byte)102, 67), NLoginCore_182.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.E("օ֑֒Ք֔֐֋֔֟֎՛֖֙֝֙֟աࣩࣺ࣯ࣧ࣬࣪࣡ࣻࣽն", (byte)102, 69) + string + NLoginCore_559.B("ƅ", (byte)102, 66) + methodType.toString(), exception);
        }
    }

    public NLoginCore_182(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_C, (String)NLoginCore_182.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_182.c("㺃", (int)z, (long)(ac ^ ad)));
    }

    private static String a(int n, long l) {
        l ^= 1L;
        l ^= 0x2A6AE118922C95C4L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(46 + 23), (byte)(23 + 60), (byte)(43 + 4), (byte)(59 + 8), (byte)(28 + 38), (byte)(65 + 2), (byte)(24 + 23), (byte)(71 + 9), (byte)(54 + 21), 67, (byte)(11 + 72), (byte)(45 + 8), (byte)(76 + 4), (byte)(85 + 12), 100, (byte)(63 + 37), (byte)(50 + 55), (byte)(14 + 96), (byte)(79 + 24)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(67 + 16)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("չֆօՈֈքտֈ֓ւՏ֍֑֊֍֓Օࣱ࣮ࣣ࣯ࣛ࣠ࣞࣝࣕ", (byte)90, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_182.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = -3903888927331816544L;
        long l = o ^ 0x2A6AE118922C95C4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), 69, (byte)(70 + 13), (byte)(21 + 26), (byte)(6 + 61), (byte)(50 + 16), (byte)(38 + 29), (byte)(5 + 42), (byte)(7 + 73), (byte)(38 + 37), (byte)(25 + 42), (byte)(38 + 45), (byte)(20 + 33), (byte)(20 + 60), (byte)(63 + 34), (byte)(52 + 48), (byte)(98 + 2), (byte)(40 + 65), 110, (byte)(48 + 55)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(57 + 26)}, StandardCharsets.UTF_8));
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
                    NLoginCore_182.f[0] = NLoginCore_004.C("ӍҤґҕҘҪҥғҳӜҲӡәҮӥӐҴҺҹӪӆәҰұ", (byte)56, 67);
                    NLoginCore_182.f[1] = NLoginCore_092.A("şĶģħĪļķĥŅŮłŨŬĬŅņŠųĶŤśŻłŃ", (byte)56, 65);
                    NLoginCore_182.f[2] = NLoginCore_384.F("՛էԧՁԺՐբ՟թճՏԼ", (byte)56, 70);
                    NLoginCore_182.f[3] = NLoginCore_324.D("ӄҬҶҩӆҫҥҔӒӑӎҥ", (byte)56, 68);
                    NLoginCore_182.f[4] = NLoginCore_138.F("՛էԧՁԺՐբ՟թճՏԼ", (byte)56, 70);
                    NLoginCore_182.f[5] = NLoginCore_027.F("՛ՃՍՀ՝ՂԼԫթըեԼ", (byte)56, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_182.f[0] = NLoginCore_091.F("դԻԨԬԯՁԼԪՊճՊՊՖծՙիեՒԹըՊՊՇՈ", (byte)56, 70);
                    NLoginCore_182.f[1] = NLoginCore_201.C("ӍҤґҕҘҪҥғҳӜҳҙҢҵӘӎҵҾӅӦӁәҰұ", (byte)56, 67);
                    NLoginCore_182.f[2] = NLoginCore_091.F("խԭՋՆԨԫՀաԿՓնՊթՎծԵՍԻԸԹԿՊՇՈ", (byte)56, 70);
                    NLoginCore_182.f[3] = NLoginCore_384.B("ıŨũĽĺŁłĭūņņķ", (byte)56, 66);
                    NLoginCore_182.f[4] = NLoginCore_091.A("őġŘŧĿŁōĨũİłķ", (byte)56, 65);
                    NLoginCore_182.f[5] = NLoginCore_223.F("ԾԽԡ՝ձԼ՞ՐԧՎԶԼ", (byte)56, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_182.f[0] = NLoginCore_076.A("ĿŀŘŌĩīŭġŎŅœşŢũşŔŘŦřņŒŦŻĹŔŋűřŞųļƀ", (byte)56, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_182.f[0] = NLoginCore_092.C("ӕҲҐҏӗҨӚӉҦҴҹҫҿҳӢһңӖӄӨӆҶҞҧӣӅҺӧөҾӎӭ", (byte)56, 67);
                }
            }
        }
    }
}

