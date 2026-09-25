/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import io.netty.util.AttributeKey;
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

public class NLoginCore_389 {
    private static int d;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_b;
    private static long j;
    private static int h;
    private static int var_int_c;
    private static int var_int_a;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static int k;
    private static int l;
    private static long i;
    private static long var_long_c;

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0x934CA83E2126DCE4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(7 + 62), (byte)(72 + 11), (byte)(17 + 30), (byte)(23 + 44), (byte)(42 + 24), (byte)(30 + 37), (byte)(30 + 17), (byte)(23 + 57), (byte)(69 + 6), (byte)(15 + 52), (byte)(53 + 30), (byte)(15 + 38), (byte)(4 + 76), (byte)(51 + 46), (byte)(59 + 41), (byte)(68 + 32), 105, (byte)(25 + 85), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("ԥԲԱӴԴ԰ԫԴԿԮӻԹԽԶԹԿԁ࢖ࢍࢇࢋ࢏࢒࢒࢚࡮࢙ࢀࡲ࢞ࢥࢢ", (byte)6, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_389.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0);
        e = Integer.reverse(0);
        f = (-1 >>> 252 | -1 << -252) & 0xFFFFFFFF;
        g = Long.reverse(-2694110638480533507L);
        h = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1) & 0xFFFFFFFF;
        i = Long.reverse(-8746948537666480131L);
        j = Long.reverse(0x5C00000000000000L);
        k = 131072 >>> 112 | 131072 << -112;
        l = 1 >>> 127 | 1 << ~127 + 1;
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_389.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_389.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.F("ԯՑՓԳ՗նծքհԿսճցջՄթ֋֊ւֈւ՗", (byte)75, 70), NLoginCore_389.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.E("ժշնԹչյհչքճՀվւջվքՆ࣒࣐ࣛ࣌ࣔࣗࣗࣟࢳࣞࣅࢷࣣ࣪ࣧա", (byte)75, 69) + string + NLoginCore_091.F("Ձ", (byte)75, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = -4617838955740972703L;
        long l = var_long_c ^ 0x934CA83E2126DCE4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(62 + 7), (byte)(35 + 48), (byte)(14 + 33), (byte)(3 + 64), (byte)(55 + 11), (byte)(36 + 31), (byte)(46 + 1), (byte)(58 + 22), (byte)(53 + 22), (byte)(49 + 18), (byte)(4 + 79), (byte)(10 + 43), 80, (byte)(91 + 6), (byte)(96 + 4), (byte)(78 + 22), (byte)(48 + 57), 110, (byte)(22 + 81)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_389.var_java_lang_String_arr_b[0] = NLoginCore_384.E("Ճ՞ԹռբևրՅժ֊սփըըկհձժտՑբնմզ֝֞տս֌ւվջ՗դգհպ֨թ֞֙֨ռհ֭֋֊ս֖ձֲ֧֎֨տր", (byte)80, 69);
                    NLoginCore_389.var_java_lang_String_arr_b[1] = NLoginCore_384.A("ŎƏţƔŦƆŪŪƊŷƜŧ", (byte)80, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_389.var_java_lang_String_arr_b[0] = NLoginCore_138.E("Ճ՞ԹռբևրՅժ֊սփըըկհձժտՑբնմզ֝֞տս֌ւվջ՗դգհպ֨թ֞֙֨ռ֌չ֡ձ֑֠֫֒֊ֈշֵ֘ճմִָ֛֙֕֔", (byte)80, 69);
                    NLoginCore_389.var_java_lang_String_arr_b[1] = NLoginCore_451.B("ŎƆŨŧƗžŞőŜŹƔŧ", (byte)80, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_389.var_java_lang_String_arr_b[0] = NLoginCore_446.F("՜ՓՅտգ֊Նիպկ֎ՠըպՠ֐Ցհի֌ցպպ֔֏ֆ՗֑֍֌խօ", (byte)80, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_389.var_java_lang_String_arr_b[0] = NLoginCore_387.D("ԑӝԍӓӭӾӡԘӠӿԅӻӿԃԉӻӸԭԭԤԚԋӸӹ", (byte)80, 68);
                }
            }
        }
    }

    public static <T> AttributeKey<T> a(String string) {
        try {
            return AttributeKey.valueOf((String)string);
        }
        catch (NoSuchMethodError noSuchMethodError) {
            try {
                Class[] classArray = new Class[var_int_a];
                classArray[NLoginCore_389.var_int_b] = String.class;
                Object[] objectArray = new Object[var_int_c];
                objectArray[NLoginCore_389.d] = string;
                return (AttributeKey)AttributeKey.class.getConstructor(classArray).newInstance(objectArray);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw new RuntimeException((String)NLoginCore_389.c("㺀", (int)(e & f), (long)g) + string + (String)NLoginCore_389.c("㺃", (int)h, (long)(i ^ j)), reflectiveOperationException);
            }
        }
    }
}

