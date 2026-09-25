/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class PluginInfoModel {
    private static int o;
    private static String[] var_java_lang_String_arr_a;
    @Nullable
    private final Path var_java_nio_file_Path_a;
    private final String bz;
    private static int h;
    private static long d;
    private static long i;
    private static long g;
    private static int k;
    private static long n;
    private static int p;
    private final List<String> var_java_util_List_java_lang_String__m;
    private static long var_long_b;
    private static int e;
    private static int var_int_m;
    private static long l;
    private final String bA;
    private static String[] var_java_lang_String_arr_b;
    private static long f;
    private static int j;
    private static long c;
    private static int var_int_a;

    @Generated
    public String getName() {
        return this.bz;
    }

    @Generated
    public String getVersion() {
        return this.bA;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(PluginInfoModel.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.F("ԄԦԨԈԬՋՃՙՅԔՒՈՖՐԙԾՠ՟՗՝՗Ԭ", (byte)32, 70), PluginInfoModel.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.D("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒє߉ߟߎ޼ߦߪ߇߰ߠߡߤѫ", (byte)32, 68) + string + NLoginCore_453.A("ù", (byte)32, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public List<String> f() {
        return this.var_java_util_List_java_lang_String__m;
    }

    private static String a(int n, long l) {
        l ^= 0x7CL;
        l ^= 0xB64482029A0D4E3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(19 + 64), (byte)(10 + 37), (byte)(63 + 4), (byte)(39 + 27), (byte)(51 + 16), (byte)(40 + 7), (byte)(8 + 72), 75, (byte)(16 + 51), (byte)(58 + 25), (byte)(43 + 10), (byte)(58 + 22), (byte)(49 + 48), (byte)(58 + 42), (byte)(99 + 1), (byte)(4 + 101), (byte)(105 + 5), (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(34 + 35), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.B("ƶǃǂƅǅǁƼǅǐƿƌǊǎǇǊǐƒԇԝԌӺԤԨԅԮԞԟԢ", (byte)106, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            PluginInfoModel.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public PluginInfoModel(String string, String string2, List<String> list, @Nullable Path path) {
        this.bz = string;
        this.bA = string2;
        this.var_java_util_List_java_lang_String__m = list;
        this.var_java_nio_file_Path_a = path;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7394542766347454100L);
        d = Long.reverse(0x3E00000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-7394542766347454100L);
        g = Long.reverse(0x3E00000000000000L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-6385736449816462996L);
        j = (-2147483647 >>> 31 | -2147483647 << -31) & 0xFFFFFFFF;
        k = -1 >>> 199 | -1 << ~199 + 1;
        l = Long.reverse(-6385736449816462996L);
        var_int_m = 0x4000000 >>> 216 | 0x4000000 << ~216 + 1;
        n = Long.reverse(-6385736449816462996L);
        o = 0x5000000 >>> 24 | 0x5000000 << ~24 + 1;
        p = 320 >>> 198 | 320 << -198;
        var_java_lang_String_arr_a = new String[o];
        var_java_lang_String_arr_b = new String[p];
        PluginInfoModel.b();
    }

    @Generated
    public String toString() {
        return (String)PluginInfoModel.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + this.getName() + (String)PluginInfoModel.c("㺃", (int)e, (long)(f ^ g)) + this.getVersion() + (String)PluginInfoModel.c("㺆", (int)h, (long)i) + this.f() + (String)PluginInfoModel.c("㺉", (int)(j & k), (long)l) + this.a() + (String)PluginInfoModel.c("㺌", (int)var_int_m, (long)n);
    }

    private static void b() {
        int n;
        c = 3935925021237741209L;
        long l = c ^ 0xB64482029A0D4E3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(45 + 24), (byte)(58 + 25), 47, (byte)(64 + 3), (byte)(62 + 4), (byte)(35 + 32), 47, (byte)(8 + 72), (byte)(5 + 70), (byte)(18 + 49), (byte)(82 + 1), (byte)(37 + 16), (byte)(53 + 27), (byte)(88 + 9), (byte)(29 + 71), (byte)(84 + 16), (byte)(94 + 11), (byte)(71 + 39), (byte)(59 + 44)}, StandardCharsets.UTF_8));
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
                    PluginInfoModel.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ĝĎĻėŃķĲĎąćĩđńęŅĘŅęģďĮŅĲĭĖĲďďđĘŊŊĖğīŋŚŌŃšśŗŦĭ", (byte)35, 65);
                    PluginInfoModel.var_java_lang_String_arr_b[1] = NLoginCore_223.B("þþİĎēùþĸėłĹņěņħĶŎĚľłŒěĘę", (byte)35, 66);
                    PluginInfoModel.var_java_lang_String_arr_b[2] = NLoginCore_384.E("ԦԖԳԨԥԚԪՈԿԸՁՎՐԸՠԽ՜ԥԻԫա՛ԲԳ", (byte)35, 69);
                    PluginInfoModel.var_java_lang_String_arr_b[3] = NLoginCore_173.A("ĈúÿĴûĲŁġĎĕĘč", (byte)35, 65);
                    PluginInfoModel.var_java_lang_String_arr_b[4] = NLoginCore_110.F("ԤՅԬՄԶԜԜԴՋԮՌԧ", (byte)35, 70);
                    continue block7;
                }
                case 1: {
                    PluginInfoModel.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ĝĎĻėŃķĲĎąćĩđńęŅĘŅęģďĮŅĲĭĖĲďďđĘŊŊŝŋřĞıĲĮłŏŔļŀŕŇŠŠĨśşİŅĻĸĹ", (byte)35, 65);
                    PluginInfoModel.var_java_lang_String_arr_b[1] = NLoginCore_324.B("þþİĎēùþĸėłĶŁňļėčĜĿİđĤőĘę", (byte)35, 66);
                    PluginInfoModel.var_java_lang_String_arr_b[2] = NLoginCore_446.C("ѥѕѲѧѤљѩ҇ѾѷѿѳҀћҟҥҚҠ҄ѲҬҚѱѲ", (byte)35, 67);
                    PluginInfoModel.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ĖįþĻĸıĀŀıĴĂķĦĦľěĄŎıŋĜőĘę", (byte)35, 66);
                    PluginInfoModel.var_java_lang_String_arr_b[4] = NLoginCore_076.E("ՅԔԙՐԳՑԗՔԻԺՌԧ", (byte)35, 69);
                    continue block7;
                }
                case 2: {
                    PluginInfoModel.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՕԳՑ՜ԨԷՏԶՁՒԹԜԡՔԸՏՃԳԥԥԦՈ՟ծԢ՞հեՌԯճԳ", (byte)35, 69);
                    continue block7;
                }
                case 4: {
                    PluginInfoModel.var_java_lang_String_arr_b[0] = NLoginCore_110.E("ԒՕՒԔԸՌՒԜԩԡ՚դԚԶՙ԰ԡՀիՠ՟ԬԸԷհ՞ԨԩԦղՠ՗", (byte)35, 69);
                }
            }
        }
    }

    @Nullable
    @Generated
    public Path a() {
        return this.var_java_nio_file_Path_a;
    }
}

