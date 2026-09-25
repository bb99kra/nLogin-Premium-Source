/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
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

public final class NLoginCore_175
extends Enum<NLoginCore_175> {
    public static final /* enum */ NLoginCore_175 var_com_nickuc_login_NLoginCore_175_b;
    public static final /* enum */ NLoginCore_175 var_com_nickuc_login_NLoginCore_175_c;
    public static final /* enum */ NLoginCore_175 var_com_nickuc_login_NLoginCore_175_d;
    private static final /* synthetic */ NLoginCore_175[] var_com_nickuc_login_NLoginCore_175_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int var_int_d;
    private static int e;
    private static int f;
    private static int g;
    private static long h;
    private static long i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static int n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_175.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("ĹśŝĽšƀŸƎźŉƇŽƋƅŎųƕƔƌƒƌš", (byte)73, 65), NLoginCore_175.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.E("ըյմԷշճծշւձԾռրչռւՄࢶࣉࣘࣙࢭࣤࢷࣃࣣ࣑ࣉࣝࢶ՝", (byte)73, 69) + string + NLoginCore_076.B("ŋ", (byte)73, 66) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        var_long_c = 7672721467870436906L;
        long l = var_long_c ^ 0x52A4882E8357A204L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(11 + 58), (byte)(30 + 53), (byte)(14 + 33), (byte)(21 + 46), (byte)(54 + 12), 67, (byte)(38 + 9), (byte)(60 + 20), (byte)(16 + 59), (byte)(10 + 57), (byte)(56 + 27), 53, (byte)(9 + 71), (byte)(23 + 74), (byte)(74 + 26), (byte)(57 + 43), (byte)(70 + 35), (byte)(61 + 49), (byte)(29 + 74)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_175.var_java_lang_String_arr_b[0] = NLoginCore_091.F("լմՐԽՠրղՂւֆչՌ", (byte)72, 70);
                    NLoginCore_175.var_java_lang_String_arr_b[1] = NLoginCore_027.C("ҿӡӔӲӺӳԇԂӸӠӠӝԂӮӼԕөӸӵӫӢԙӠӡ", (byte)72, 67);
                    NLoginCore_175.var_java_lang_String_arr_b[2] = NLoginCore_138.C("ӷӾӚԃӟӳԀӞӠԁӯӝӿӪԃӏӲԍӴԇӹԉӠӡ", (byte)72, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_175.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ŅƊƆŽƃŪƇƂŇŤŪŗ", (byte)72, 65);
                    NLoginCore_175.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ŁţŖŴżŵƉƄźŢŤƓƑŦŵƈŦŬƅŲƝƛŢţ", (byte)72, 65);
                    NLoginCore_175.var_java_lang_String_arr_b[2] = NLoginCore_384.E("ծյՑպՖժշՕ՗ոե՚ԿԼՠ՚ջ՗զՊպժ՗՘", (byte)72, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_175.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ԹԸ՛խՖս՘շկՕՏՌ", (byte)72, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_175.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ŹŘƄũƄƂſŗŜŪƀŗ", (byte)72, 66);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(-1073741824);
        var_int_b = 0 >>> 92 | 0 << -92;
        var_int_c = (16 >>> 100 | 16 << ~100 + 1) & 0xFFFFFFFF;
        var_int_d = (1 >>> 31 | 1 << ~31 + 1) & 0xFFFFFFFF;
        e = Integer.reverse(-1073741824);
        f = Integer.reverse(-1073741824);
        g = (0 >>> 131 | 0 << ~131 + 1) & 0xFFFFFFFF;
        h = Long.reverse(6087308755368631894L);
        i = Long.reverse(-5044031582654955520L);
        j = Integer.reverse(0);
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(6087308755368631894L);
        m = Long.reverse(-5044031582654955520L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(6087308755368631894L);
        q = Long.reverse(-5044031582654955520L);
        r = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[e];
        var_java_lang_String_arr_b = new String[f];
        NLoginCore_175.b();
        var_com_nickuc_login_NLoginCore_175_b = new NLoginCore_175();
        var_com_nickuc_login_NLoginCore_175_c = new NLoginCore_175();
        var_com_nickuc_login_NLoginCore_175_d = new NLoginCore_175();
        var_com_nickuc_login_NLoginCore_175_arr_a = NLoginCore_175.a();
    }

    public static NLoginCore_175[] values() {
        return (NLoginCore_175[])var_com_nickuc_login_NLoginCore_175_arr_a.clone();
    }

    private static String a(int n, long l) {
        l ^= 0x5DL;
        l ^= 0x52A4882E8357A204L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(7 + 62), (byte)(23 + 60), (byte)(9 + 38), (byte)(51 + 16), (byte)(49 + 17), (byte)(47 + 20), (byte)(5 + 42), 80, 75, (byte)(42 + 25), (byte)(64 + 19), (byte)(45 + 8), (byte)(5 + 75), (byte)(31 + 66), (byte)(49 + 51), (byte)(96 + 4), (byte)(104 + 1), (byte)(40 + 70), (byte)(13 + 90)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(3 + 66), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧ࡙࡬ࡻࡼࡐࢇ࡚ࡦࢆࡴ࡬ࢀ࡙", (byte)81, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_175.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_175 valueOf(String string) {
        return Enum.valueOf(NLoginCore_175.class, string);
    }

    private static /* synthetic */ NLoginCore_175[] a() {
        NLoginCore_175[] NLoginCore_175Array = new NLoginCore_175[var_int_a];
        NLoginCore_175Array[NLoginCore_175.var_int_b] = var_com_nickuc_login_NLoginCore_175_b;
        NLoginCore_175Array[NLoginCore_175.var_int_c] = var_com_nickuc_login_NLoginCore_175_c;
        NLoginCore_175Array[NLoginCore_175.var_int_d] = var_com_nickuc_login_NLoginCore_175_d;
        return NLoginCore_175Array;
    }
}

