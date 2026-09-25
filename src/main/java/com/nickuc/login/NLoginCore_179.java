/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_290;
import com.nickuc.login.NLoginCore_454;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_179 {
    private static int ak;
    private static long var_long_c;
    private static int g;
    private static int aa;
    private static int w;
    private static String[] var_java_lang_String_arr_a;
    private static long f;
    private static long ai;
    private static boolean az;
    private static int var_int_m;
    private static long ah;
    private static long ac;
    private static long ab;
    private static Field var_java_lang_reflect_Field_m;
    private static long ae;
    private static int v;
    private static long k;
    private static int ag;
    private static long af;
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int q;
    private static int p;
    private static int j;
    private static long s;
    private static int ad;
    private static int y;
    private static int z;
    private static long i;
    private static int o;
    private static long l;
    private static int t;
    private static int r;
    private static int var_int_b;
    private static int x;
    private static int var_int_c;
    private static int var_int_a;
    private static int e;
    private static int u;
    private static long d;
    private static int var_int_n;
    private static int aj;
    private static Field var_java_lang_reflect_Field_n;

    private static void b() {
        int n;
        var_long_c = -9099093833387161466L;
        long l = var_long_c ^ 0x1B9110805AB74B6EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(34 + 35), (byte)(46 + 37), 47, (byte)(63 + 4), (byte)(19 + 47), (byte)(57 + 10), (byte)(30 + 17), (byte)(6 + 74), (byte)(33 + 42), 67, (byte)(63 + 20), (byte)(20 + 33), (byte)(29 + 51), (byte)(10 + 87), (byte)(86 + 14), (byte)(64 + 36), (byte)(91 + 14), (byte)(29 + 81), (byte)(98 + 5)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_179.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ѶюьњялѣхѶѡѦѫћҋҎҊѻчюќѲҔҏўѳѷѢє҈ѩҝҌѰҔѱѭѹҏҎҕ҂ѽқѮ", (byte)27, 68);
                    NLoginCore_179.var_java_lang_String_arr_b[1] = NLoginCore_092.B("þİĢùčĨĐóėîĔý", (byte)27, 66);
                    NLoginCore_179.var_java_lang_String_arr_b[2] = NLoginCore_027.E("ԊԺՌՉՁԝՀՁԐՔԢԟ", (byte)27, 69);
                    NLoginCore_179.var_java_lang_String_arr_b[3] = NLoginCore_446.E("ԦԚԚԅԽՃԵՑԔԖՋՏԸԓՎԿԭԘ՘ԷդԱԯՏԚգՀՉբլԼՋԨՀՀղԽխծ՘աՄՎԿ", (byte)27, 69);
                    NLoginCore_179.var_java_lang_String_arr_b[4] = NLoginCore_027.B("ĪĩëĒĂĤÿăèı÷ý", (byte)27, 66);
                    NLoginCore_179.var_java_lang_String_arr_b[5] = NLoginCore_575.C("ђѺьѡљђїѳҀѤѤ҄ѠьѠјъѫҒғѮѬљњ", (byte)27, 67);
                    NLoginCore_179.var_java_lang_String_arr_b[6] = NLoginCore_223.C("ђѺьѡљђїѳҀѤѤ҄ѠьѠјъѫҒғѮѬљњ", (byte)27, 67);
                    NLoginCore_179.var_java_lang_String_arr_b[7] = NLoginCore_201.F("ՇԟԝԫԠԌԴԖՇԲԸՓԨԛԺԯԷՖԿ՝ՅԱաՀԴԹՠթՌԪԭՙԺՎթԲժղՀկհեՉՇեսՑԵՀպփձՎտվՠեՇդժՠ֊՘Ռ՘՛Տ֏֎բ֊Ւըֈ֚Փ֓իըՑՠՠ՞՞֓սժի", (byte)27, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_179.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ՇԟԝԫԠԌԴԖՇԲԷԼԬ՜՟՛ՌԘԟԭՃեՠԯՄՈԳԥՙԺծ՝խըԲՎՋԫՀ՗ԮաՂԿ", (byte)27, 69);
                    NLoginCore_179.var_java_lang_String_arr_b[1] = NLoginCore_004.D("ѬнљѴѣяѲѱѿкѷю", (byte)27, 68);
                    NLoginCore_179.var_java_lang_String_arr_b[2] = NLoginCore_324.F("ԝՆԜՀԵՉԫԔԬԓՐԟ", (byte)27, 70);
                    NLoginCore_179.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ѕщщдѬѲѤҀухѺѾѧтѽѮќч҇ѦғѠўѾщҒѯѸґқѫѺѮѸҘғңҔѠѾҗѷґҧҀҍѽѭүү҅ұҥҢѹѺ", (byte)27, 68);
                    NLoginCore_179.var_java_lang_String_arr_b[4] = NLoginCore_201.F("ԣՌՂՇՎԬԷԮՒԦԪԟ", (byte)27, 70);
                    NLoginCore_179.var_java_lang_String_arr_b[5] = NLoginCore_027.E("ԣՋԝԲԪԣԨՄՑԵԳԯԷԓԿ՗ԘԽ՜բբԽԪԫ", (byte)27, 69);
                    NLoginCore_179.var_java_lang_String_arr_b[6] = NLoginCore_201.E("ԣՋԝԲԪԣԨՄՑԵԵԴԎ՗ԿՌԿՀբԝԠԽԪԫ", (byte)27, 69);
                    NLoginCore_179.var_java_lang_String_arr_b[7] = NLoginCore_201.F("ՇԟԝԫԠԌԴԖՇԲԸՓԨԛԺԯԷՖԿ՝ՅԱաՀԴԹՠթՌԪԭՙԺՎթԲժղՀկհեՉՇեսՑԵՀպփձՎտվՠեՇդժՠ֊՘Ռ՘՛Տ֏֎բ֊Ւըֈ֛օ֝ծպկ֚ն֍չ֔֓ժի", (byte)27, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_179.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԪԪԠԡԡՍՁԳԨՐԲԟ", (byte)27, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_179.var_java_lang_String_arr_b[0] = NLoginCore_575.E("ՑԟԻԜԟՉԳ՗ՀՈ՘ԟ", (byte)27, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_179.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 66), NLoginCore_179.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.E("ՙզեԨըդ՟ըճբԯխձժխճԵࣃ࣑࣓࢜ࢫ࣓ࢨ࣌ࣄ࣊ࣆՌ", (byte)58, 69) + string + NLoginCore_575.A("ĭ", (byte)58, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1EL;
        l ^= 0x1B9110805AB74B6EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(6 + 63), (byte)(23 + 60), (byte)(17 + 30), (byte)(33 + 34), (byte)(31 + 35), (byte)(56 + 11), 47, (byte)(75 + 5), (byte)(55 + 20), (byte)(14 + 53), (byte)(79 + 4), (byte)(5 + 48), (byte)(28 + 52), 97, (byte)(35 + 65), (byte)(48 + 52), (byte)(57 + 48), (byte)(56 + 54), (byte)(28 + 75)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.F("ջֈևՊ֊ֆց֊֕քՑ֏֓֌֏֕՗ࣥࢾ࣮ࣦࣳࣵ࣍ࣵ࣊࣬ࣨ", (byte)92, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_179.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private NLoginCore_179() {
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(-1);
        d = Long.reverse(1806859174016032129L);
        e = (256 >>> 104 | 256 << -104) & 0xFFFFFFFF;
        f = Long.reverse(1806859174016032129L);
        g = (0x1000000 >>> 151 | 0x1000000 << -151) & 0xFFFFFFFF;
        h = -1 >>> 94 | -1 << ~94 + 1;
        i = Long.reverse(1806859174016032129L);
        j = 3072 >>> 74 | 3072 << ~74 + 1;
        k = Long.reverse(6995005944746843521L);
        l = Long.reverse(0x7800000000000000L);
        var_int_m = Integer.reverse(0);
        var_int_n = 2048 >>> 75 | 2048 << ~75 + 1;
        o = Integer.reverse(0);
        p = (0 >>> 199 | 0 << ~199 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(0x20000000);
        r = Integer.reverse(-1);
        s = Long.reverse(1806859174016032129L);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = 0 >>> 196 | 0 << ~196 + 1;
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = 0 >>> 115 | 0 << ~115 + 1;
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(Integer.MIN_VALUE);
        aa = Integer.reverse(-1610612736);
        ab = Long.reverse(6995005944746843521L);
        ac = Long.reverse(0x7800000000000000L);
        ad = Integer.reverse(0x60000000);
        ae = Long.reverse(6995005944746843521L);
        af = Long.reverse(0x7800000000000000L);
        ag = Integer.reverse(-536870912);
        ah = Long.reverse(6995005944746843521L);
        ai = Long.reverse(0x7800000000000000L);
        aj = Integer.reverse(0x10000000);
        ak = Integer.reverse(0x10000000);
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_179.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean f(Object object) {
        if (az) {
            int n;
            if (var_java_lang_reflect_Field_m != null && var_java_lang_reflect_Field_n != null) {
                n = var_int_n;
                return n != 0;
            }
            n = o;
            return n != 0;
        }
        try {
            Field[] fieldArray = object.getClass().getDeclaredFields();
            int n = fieldArray.length;
            for (int i = p; i < n; ++i) {
                Field field;
                Field field2 = fieldArray[i];
                Class<?> clazz = field2.getType();
                if (clazz.isPrimitive() || clazz.getPackage() == null || clazz.getPackage().getName().startsWith((String)NLoginCore_179.c("㺀", (int)(q & r), (long)s))) continue;
                try {
                    field2.setAccessible(t != 0);
                }
                catch (Throwable throwable) {
                    continue;
                }
                Object object2 = field2.get(object);
                if (object2 == null || (field = NLoginCore_546.a(object2.getClass(), SpigotReflectionUtil.GAME_PROFILE_CLASS, u)) == null) continue;
                var_java_lang_reflect_Field_m = field2;
                var_java_lang_reflect_Field_n = field;
                boolean bl = v;
                az = w;
                return bl;
            }
            boolean bl = x;
            az = y;
            return bl;
        }
        catch (Throwable throwable) {
            az = z;
            throw throwable;
        }
    }

    @Nullable
    public static Runnable a(Object object, String string, UUID uUID, @Nullable NLoginCore_454 NLoginCore_4542) {
        try {
            Field field = NLoginCore_546.a(object.getClass(), UUID.class, var_int_a);
            if (field != null) {
                field.set(object, uUID);
            }
            if (!NLoginCore_290.r) {
                if (!NLoginCore_179.f(object) && field == null) {
                    throw new RuntimeException((String)NLoginCore_179.c("㺀", (int)(var_int_b & var_int_c), (long)d) + uUID + (String)NLoginCore_179.c("㺃", (int)e, (long)f) + string + (String)NLoginCore_179.c("㺆", (int)(g & h), (long)i));
                }
                if (az && var_java_lang_reflect_Field_m != null && var_java_lang_reflect_Field_n != null) {
                    return () -> {
                        try {
                            Object object2 = var_java_lang_reflect_Field_m.get(object);
                            GameProfile gameProfile = new GameProfile(uUID, string);
                            if (NLoginCore_4542 != null) {
                                gameProfile.getProperties().put(NLoginCore_179.c("㺀", (int)aa, (long)(ab ^ ac)), (Object)new Property((String)NLoginCore_179.c("㺃", (int)ad, (long)(ae ^ af)), NLoginCore_4542.ce, NLoginCore_4542.cf));
                            }
                            var_java_lang_reflect_Field_n.set(object2, gameProfile);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            throw new RuntimeException((String)NLoginCore_179.c("㺆", (int)ag, (long)(ah ^ ai)), illegalAccessException);
                        }
                    };
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_179.c("㺉", (int)j, (long)(k ^ l)) + string, exception, new Object[var_int_m]);
        }
        return null;
    }
}

