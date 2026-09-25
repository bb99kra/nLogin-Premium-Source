/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_490;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
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

public class NLoginCore_565
extends NLoginCore_490 {
    private static long q;
    private static long p;
    private static String[] var_java_lang_String_arr_e;
    private static int var_int_e;
    private static String[] f;
    private static long i;
    private static int z;
    private static int af;

    private static void void_b() {
        int n;
        i = -5975554785143285087L;
        long l = i ^ 0xED5994B0F5C1BF12L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(33 + 36), (byte)(39 + 44), (byte)(45 + 2), (byte)(35 + 32), 66, (byte)(7 + 60), (byte)(37 + 10), (byte)(10 + 70), (byte)(27 + 48), (byte)(26 + 41), (byte)(22 + 61), (byte)(4 + 49), (byte)(66 + 14), (byte)(14 + 83), (byte)(69 + 31), (byte)(11 + 89), (byte)(81 + 24), (byte)(76 + 34), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_565.f[0] = NLoginCore_027.B("ƘŵƝŸƒƋŗŝƠſƥƅťŽŽŠŶƇŶƌƉƇŴŵ", (byte)81, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_565.f[0] = NLoginCore_324.D("ԟӼԤӿԙԒӞӤԧԆԪӷԘөӦԟӯ԰ԁӴԮԴӻӼ", (byte)81, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_565.f[0] = NLoginCore_027.C("ӽӻӸԍԜӟӣԈԝӜԟԁӤԞӨԠӣԋԭԩԟԴӻӼ", (byte)81, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_565.f[0] = NLoginCore_110.F("՘չ՞ՆղտԾյջիոՙժռատժ֍լլխ֜չՖ֘է֏֝֌֡ց֢", (byte)81, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2DL;
        l ^= 0xED5994B0F5C1BF12L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(51 + 32), (byte)(34 + 13), (byte)(44 + 23), (byte)(53 + 13), 67, (byte)(17 + 30), (byte)(6 + 74), (byte)(41 + 34), (byte)(31 + 36), (byte)(80 + 3), (byte)(51 + 2), (byte)(21 + 59), (byte)(84 + 13), (byte)(38 + 62), (byte)(28 + 72), (byte)(35 + 70), (byte)(71 + 39), (byte)(6 + 97)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(54 + 14), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.E("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࡽࢁࢂ࢚ࢗ࢒ࢢࢧ", (byte)13, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_565.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_565.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.D("ГезЗлњђѨєУѡїѥџШэѯѮѦѬѦл", (byte)18, 68), NLoginCore_565.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ĆēĒÕĕđČĕĠďÜĚĞėĚĠâїћќѴѱѬѼҁö", (byte)18, 65) + string + NLoginCore_446.D("Х", (byte)18, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(-8838202167232214859L);
        q = Long.reverse(-5476377146882523136L);
        z = Integer.reverse(Integer.MIN_VALUE);
        af = (128 >>> 103 | 128 << -103) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[z];
        f = new String[af];
        NLoginCore_565.void_b();
    }

    public NLoginCore_565(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.G, (String)NLoginCore_565.c("㺀", (int)var_int_e, (long)(p ^ q)));
    }
}

