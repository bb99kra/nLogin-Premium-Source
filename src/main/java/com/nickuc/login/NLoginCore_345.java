/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_483;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_383;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginInterface_046;
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

public class NLoginCore_345
extends NLoginCore_483<NLoginCore_383> {
    private static String[] var_java_lang_String_arr_d;
    private static int var_int_d;
    private static int b;
    private static long i;
    private static int u;
    private static long o;
    private static String[] c;
    private static long p;
    private static int v;
    private static int q;
    private static long f;
    private static long t;
    private static long s;
    private static int n;
    private static int r;

    private static void b() {
        int n;
        f = 804931691933742143L;
        long l = f ^ 0x319658DFA03606F2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(4 + 65), 83, (byte)(19 + 28), (byte)(3 + 64), (byte)(27 + 39), (byte)(8 + 59), (byte)(6 + 41), (byte)(21 + 59), (byte)(23 + 52), (byte)(22 + 45), (byte)(25 + 58), (byte)(4 + 49), (byte)(75 + 5), 97, (byte)(83 + 17), (byte)(44 + 56), (byte)(33 + 72), (byte)(43 + 67), (byte)(22 + 81)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_345.var_java_lang_String_arr_d[0] = NLoginCore_004.A("ŃıÿĘăĪĘĠľīġłĽōďĎģėĶŗĮōńŚŉŖĶěıľŌĠ", (byte)39, 65);
                    NLoginCore_345.var_java_lang_String_arr_d[1] = NLoginCore_138.C("Ҙў҃ҀҨѴҥҪҕѪѿҎҦҎѻѯҴ҅ҪҢҨҹҩңѲҝҩұғѼӀґұҞҍӁ҄ҲҕҲӄҔ҄Ғ", (byte)39, 67);
                    NLoginCore_345.var_java_lang_String_arr_d[2] = NLoginCore_324.B("ĻāĦģŋėňōĸčĢıŉıĞĒŗĨōŅŋŜŌņĕŀŌŔĶğţĴŔŁİŤħŕĸŕŧķħĵ", (byte)39, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_345.var_java_lang_String_arr_d[0] = NLoginCore_384.C("ҠҎќѵѠ҇ѵѽқ҈ѾҟҚҪѬѫҀѴғҴҋҧҖѵҤҔҽұҿҳҾҌ", (byte)39, 67);
                    NLoginCore_345.var_java_lang_String_arr_d[1] = NLoginCore_201.C("Ҙў҃ҀҨѴҥҪҕѪѿҎҦҎѻѯҴ҅ҪҢҨҹҩңѲҝҩұғѼӀґҫҹҙӆӁқӁ҇Ҵҿ҄Ғ", (byte)39, 67);
                    NLoginCore_345.var_java_lang_String_arr_d[2] = NLoginCore_387.A("ĻāĦģŋėňōĸčĢıŉıĞĒŗĨōŅŋŜŌņĕŀŌŔĶğţĴĳşŉěňŕŧŦĪńŦĵ", (byte)39, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_345.var_java_lang_String_arr_d[0] = NLoginCore_446.E("ԽՙԯԮԽԽՌՀԸԡդԫ", (byte)39, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_345.var_java_lang_String_arr_d[0] = NLoginCore_138.C("ѿҐџҟѷҤѴқѧҜѧҘѹѼҌҎҪѽѭҍҎҦѽѾ", (byte)39, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3BL;
        l ^= 0x319658DFA03606F2L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(46 + 23), (byte)(75 + 8), (byte)(32 + 15), (byte)(22 + 45), (byte)(7 + 59), (byte)(55 + 12), (byte)(19 + 28), (byte)(6 + 74), (byte)(6 + 69), (byte)(56 + 11), (byte)(25 + 58), (byte)(9 + 44), 80, (byte)(71 + 26), (byte)(23 + 77), 100, (byte)(63 + 42), (byte)(29 + 81), (byte)(74 + 29)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.A("ƐƝƜşƟƛƖƟƪƙŦƤƨơƤƪŬӯԆӴӧӪԅԊӨԌӪԂ", (byte)87, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_345.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public NLoginCore_345(NLoginCore_383 NLoginCore_3832) {
        super(NLoginCore_3832);
    }

    @Override
    public void a(Object object, Object object2) {
        if (object2 != null && !(object2 instanceof NLoginInterface_046)) {
            throw new IllegalArgumentException((String)NLoginCore_345.c("㺀", (int)(b & var_int_d), (long)i) + object2.getClass().getCanonicalName());
        }
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_345.c("㺃", (int)n, (long)(o ^ p)));
        }
        ((NLoginCore_383)this.h).com_nickuc_login_loader_platform_BungeeLoader_a().getProxy().registerChannel((String)object);
        if (object2 != null) {
            ((NLoginCore_383)this.h).a((NLoginInterface_013)object2, new NLoginInterface_013[q]);
        }
    }

    @Override
    public void b(Object object) {
        this.a(object, null);
    }

    @Override
    public void c(Object object) {
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_345.c("㺀", (int)r, (long)(s ^ t)));
        }
        ((NLoginCore_383)this.h).com_nickuc_login_loader_platform_BungeeLoader_a().getProxy().unregisterChannel((String)object);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_345.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 65), NLoginCore_345.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ĜĩĨëīħĢīĶĥòİĴĭİĶøѻҒҀѳѶґҖѴҘѶҎď", (byte)29, 66) + string + NLoginCore_559.A("ó", (byte)29, 65) + methodType.toString(), exception);
        }
    }

    static {
        b = (0 >>> 18 | 0 << -18) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(-1);
        i = Long.reverse(2318320781899977936L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Long.reverse(-275752603465427760L);
        p = Long.reverse(-2594073385365405696L);
        q = (0 >>> 203 | 0 << -203) & 0xFFFFFFFF;
        r = 128 >>> 6 | 128 << -6;
        s = Long.reverse(-275752603465427760L);
        t = Long.reverse(-2594073385365405696L);
        u = Integer.reverse(-1073741824);
        v = Integer.reverse(-1073741824);
        c = new String[u];
        var_java_lang_String_arr_d = new String[v];
        NLoginCore_345.b();
    }
}

