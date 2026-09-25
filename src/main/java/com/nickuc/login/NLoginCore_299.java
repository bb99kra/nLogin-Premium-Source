/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_120;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_087;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_542;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_025;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_563;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_185;
import com.nickuc.login.NLoginCore_418;
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
import org.bukkit.plugin.PluginManager;

public class NLoginCore_299
implements NLoginInterface_030,
NLoginInterface_025 {
    private static long e;
    private NLoginInterface_031 var_com_nickuc_login_NLoginInterface_031_a;
    private static long var_long_b;
    private static long o;
    private static String[] var_java_lang_String_arr_b;
    private static int p;
    private static int var_int_c;
    private NLoginCore_033 var_com_nickuc_login_NLoginCore_033_a;
    private static int q;
    private static long h;
    private static long l;
    private NLoginCore_563 var_com_nickuc_login_NLoginCore_563_a;
    private static int n;
    private final nLoginBukkit r;
    private static int i;
    private static int f;
    private static int var_int_a;
    private static long g;
    private static long d;
    private static int m;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static int k;
    private NLoginCore_087 var_com_nickuc_login_NLoginCore_087_a;
    private static long j;

    @Generated
    public NLoginCore_299(nLoginBukkit nLoginBukkit2) {
        this.r = nLoginBukkit2;
    }

    private static void b() {
        int n;
        var_long_c = -1068144133143811198L;
        long l = var_long_c ^ 0x3C306E21E5FACF9FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(53 + 16), (byte)(3 + 80), 47, (byte)(57 + 10), (byte)(43 + 23), (byte)(31 + 36), (byte)(28 + 19), (byte)(16 + 64), (byte)(22 + 53), (byte)(50 + 17), (byte)(39 + 44), 53, (byte)(66 + 14), (byte)(41 + 56), (byte)(42 + 58), (byte)(4 + 96), (byte)(40 + 65), (byte)(44 + 66), (byte)(22 + 81)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_299.var_java_lang_String_arr_b[0] = NLoginCore_324.E("Վ՘ԕԲՉԱՒ՗ԗԲՌԱ՘ՀդըԤ՝գՔզՆԳԴ", (byte)36, 69);
                    NLoginCore_299.var_java_lang_String_arr_b[1] = NLoginCore_559.F("Պԓ՘՝ԕՒԑ՟ՒՀՄԸԻԽՃ՞Փ՜Նդ՞՜ԳԴ", (byte)36, 70);
                    NLoginCore_299.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ѓѓѨѼѪѺѵҟҡҘҗѱѦљқҠ҄ѵҍҟѪ҇Ѵѵ", (byte)36, 67);
                    NLoginCore_299.var_java_lang_String_arr_b[3] = NLoginCore_559.B("òĠāĔēĕďĲăļŀăļġŋķŌįċōŐŃĚě", (byte)36, 66);
                    NLoginCore_299.var_java_lang_String_arr_b[4] = NLoginCore_091.D("ѭҙѧҏҌқѬҊҌҏіѰҐѾѻқҢѤҔҥѪҭѴѵ", (byte)36, 68);
                    NLoginCore_299.var_java_lang_String_arr_b[5] = NLoginCore_004.D("ѭҙѧҏҌқѬҊҌҏіѰҐѾѻқҢѤҔҥѪҭѴѵ", (byte)36, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_299.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ҏҙіѳҊѲғҘјѳ҅Ғ҇ѱ҈ҟѷѢҝѪҌҭѴѵ", (byte)36, 68);
                    NLoginCore_299.var_java_lang_String_arr_b[1] = NLoginCore_092.E("Պԓ՘՝ԕՒԑ՟ՒՀՌ՜ԸՖաԚդԺՅՆԸ՜ԳԴ", (byte)36, 69);
                    NLoginCore_299.var_java_lang_String_arr_b[2] = NLoginCore_076.C("ѓѓѨѼѪѺѵҟҡҘҙңҒҤґѥѻѝҜѷҪѷѴѵ", (byte)36, 67);
                    NLoginCore_299.var_java_lang_String_arr_b[3] = NLoginCore_223.B("òĠāĔēĕďĲăļŃĚōĦĪĨĽīőĿľŐĲĶĤōŔŊņśĵę", (byte)36, 66);
                    NLoginCore_299.var_java_lang_String_arr_b[4] = NLoginCore_453.A("ēĿčĵĲŁĒİĲĵĉķōąĦŉŋōőŀĽœĚě", (byte)36, 65);
                    NLoginCore_299.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ēĿčĵĲŁĒİĲĵĀĴŉĝĀĪĩęĲŇİĭĚě", (byte)36, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_299.var_java_lang_String_arr_b[0] = NLoginCore_451.B("ĚįŁĮńĿĦĚĂģĪĕĖŀĤĮŇğĚŌīœĚě", (byte)36, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_299.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ûāŃĒĺĴĸľąĘĈŁħĕŊāĎňĽċģĝĚě", (byte)36, 65);
                }
            }
        }
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        this.k();
    }

    @Override
    public void l() {
        if (this.var_com_nickuc_login_NLoginCore_033_a != null) {
            NLoginCore_120 NLoginCore_120 = this.r.com_nickuc_login_NLoginCore_120_a();
            NLoginCore_120.c(NLoginCore_299.c("㺀", (int)(m & n), (long)o));
        }
        this.var_com_nickuc_login_NLoginInterface_031_a = null;
    }

    @Override
    @Generated
    public NLoginCore_087 com_nickuc_login_NLoginCore_087_a() {
        return this.var_com_nickuc_login_NLoginCore_087_a;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2726314876657775759L);
        var_int_c = 524288 >>> 211 | 524288 << -211;
        d = Long.reverse(4743927509719757967L);
        e = Long.reverse(0x6400000000000000L);
        f = Integer.reverse(0x40000000);
        g = Long.reverse(4743927509719757967L);
        h = Long.reverse(0x6400000000000000L);
        i = Integer.reverse(-1073741824);
        j = Long.reverse(2726314876657775759L);
        k = 0x40000000 >>> 124 | 0x40000000 << -124;
        l = Long.reverse(2726314876657775759L);
        m = 40960 >>> 45 | 40960 << ~45 + 1;
        n = -1 >>> 57 | -1 << ~57 + 1;
        o = Long.reverse(2726314876657775759L);
        p = 48 >>> 35 | 48 << ~35 + 1;
        q = 24 >>> 162 | 24 << -162;
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_299.b();
    }

    @Override
    public void k() {
        NLoginType_008 NLoginType_008 = this.r.com_nickuc_login_NLoginType_008_a();
        PluginManager pluginManager = this.r.org_bukkit_Server_a().getPluginManager();
        if (pluginManager.getPlugin((String)NLoginCore_299.c("㺀", (int)var_int_a, (long)var_long_b)) != null) {
            this.var_com_nickuc_login_NLoginCore_087_a = new NLoginCore_087();
        }
        if (pluginManager.getPlugin((String)NLoginCore_299.c("㺃", (int)var_int_c, (long)(d ^ e))) != null) {
            this.var_com_nickuc_login_NLoginCore_563_a = new NLoginCore_563();
        }
        this.var_com_nickuc_login_NLoginInterface_031_a = pluginManager.getPlugin((String)NLoginCore_299.c("㺆", (int)f, (long)(g ^ h))) != null ? new NLoginCore_418(NLoginType_008) : (pluginManager.getPlugin((String)NLoginCore_299.c("㺉", (int)i, (long)j)) != null ? new NLoginCore_185() : null);
        if (this.var_com_nickuc_login_NLoginCore_033_a == null) {
            this.var_com_nickuc_login_NLoginCore_033_a = new NLoginCore_033(NLoginType_008);
            NLoginCore_542 NLoginCore_5422 = new NLoginCore_542(this.r, this.var_com_nickuc_login_NLoginCore_033_a);
            NLoginCore_120 NLoginCore_120 = this.r.com_nickuc_login_NLoginCore_120_a();
            NLoginCore_120.a(NLoginCore_299.c("㺌", (int)k, (long)l), NLoginCore_5422);
        }
    }

    @Override
    @Generated
    public NLoginInterface_031 com_nickuc_login_NLoginInterface_031_a() {
        return this.var_com_nickuc_login_NLoginInterface_031_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_299.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ӼԞԠԀԤՃԻՑԽԌՊՀՎՈԑԶ՘՗ՏՕՏԤ", (byte)24, 70), NLoginCore_299.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.B("ĒğĞáġĝĘġĬěèĦĪģĦĬî҆ѤѿѽѶѿҀѼћҋĄ", (byte)24, 66) + string + NLoginCore_201.F("Ԏ", (byte)24, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_563 com_nickuc_login_NLoginCore_563_a() {
        return this.var_com_nickuc_login_NLoginCore_563_a;
    }

    @Override
    @Generated
    public NLoginCore_033 com_nickuc_login_NLoginCore_033_a() {
        return this.var_com_nickuc_login_NLoginCore_033_a;
    }

    private static String a(int n, long l) {
        l ^= 0x26L;
        l ^= 0x3C306E21E5FACF9FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(40 + 29), (byte)(28 + 55), 47, (byte)(30 + 37), (byte)(16 + 50), (byte)(6 + 61), (byte)(42 + 5), (byte)(6 + 74), (byte)(73 + 2), (byte)(8 + 59), (byte)(11 + 72), (byte)(27 + 26), (byte)(49 + 31), (byte)(74 + 23), (byte)(99 + 1), (byte)(5 + 95), (byte)(103 + 2), (byte)(78 + 32), (byte)(96 + 7)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(48 + 21), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ёўѝРѠќїѠѫњЧѥѩѢѥѫЭ߅ޣ޾޼޵޾޿޻ޚߊ", (byte)19, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_299.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

