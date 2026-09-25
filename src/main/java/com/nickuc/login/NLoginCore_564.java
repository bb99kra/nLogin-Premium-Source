/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.File;
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

public abstract class NLoginCore_564
extends NLoginCore_400 {
    private static long ag;
    private static long u;
    private static int w;
    private static long aj;
    private static long i;
    private static int al;
    private final String N;
    private static int var_int_c;
    private static int s;
    private static int m;
    private static long f;
    private static long v;
    private static int ae;
    private static long g;
    private static int y;
    private static int t;
    private static String[] d;
    private static int an;
    private static int ak;
    private static long aa;
    private static String[] var_java_lang_String_arr_c;

    static {
        var_int_c = 0 >>> 167 | 0 << ~167 + 1;
        g = Long.reverse(3124544086110385047L);
        i = Long.reverse(-6052837899185946624L);
        m = Integer.reverse(0);
        s = 0 >>> 20 | 0 << ~20 + 1;
        t = (2048 >>> 107 | 2048 << -107) & 0xFFFFFFFF;
        u = Long.reverse(3124544086110385047L);
        v = Long.reverse(-6052837899185946624L);
        w = (0x1000000 >>> 87 | 0x1000000 << -87) & 0xFFFFFFFF;
        y = Integer.reverse(-1);
        aa = Long.reverse(-8692901336109796457L);
        ae = Integer.reverse(-1073741824);
        ag = Long.reverse(3124544086110385047L);
        aj = Long.reverse(-6052837899185946624L);
        ak = Integer.reverse(0);
        al = 0x400000 >>> 116 | 0x400000 << ~116 + 1;
        an = Integer.reverse(0x20000000);
        var_java_lang_String_arr_c = new String[al];
        d = new String[an];
        NLoginCore_564.void_b();
    }

    public NLoginCore_564(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, boolean bl) {
        super(NLoginType_008, NLoginCore_479, bl);
        this.N = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        File file = new File(this.java_io_File_b(), this.N);
        if (!file.isDirectory()) {
            return;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            if (NLoginInterface_0422 != null) {
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_564.c("㺀", (int)var_int_c, (long)(g ^ i)), new Object[m]);
            }
            return;
        }
        this.j = fileArray.length;
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        for (int i = s; i < n; ++i) {
            File file2 = fileArray2[i];
            try {
                this.a(file2);
                continue;
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_564.c("㺃", (int)t, (long)(u ^ v)) + this.a.getName() + (String)NLoginCore_564.c("㺆", (int)(w & y), (long)aa) + file2.getName() + (String)NLoginCore_564.c("㺉", (int)ae, (long)(ag ^ aj)), exception, new Object[ak]);
                continue;
            }
            finally {
                ++this.l;
            }
        }
        this.c(NLoginInterface_0422);
    }

    protected abstract void a(File var1);

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_564.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.C("ՑճյՕչ֘֐֦֒ա֣֟֕֝զ֋֤֪֤֭֬չ", (byte)124, 67), NLoginCore_564.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.E("֛֧֨ժֵ֪֦֪֤֡ձֳֵ֯֬֯շࣤࣾईऀऍࣩअघईऐऄकࣽ֐", (byte)124, 69) + string + NLoginCore_223.A("Ʊ", (byte)124, 65) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        f = -1599880070909314348L;
        long l = f ^ 0xB38823ACFAC4C228L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(4 + 65), (byte)(54 + 29), (byte)(19 + 28), (byte)(6 + 61), (byte)(33 + 33), (byte)(46 + 21), (byte)(7 + 40), (byte)(36 + 44), (byte)(55 + 20), (byte)(45 + 22), (byte)(26 + 57), 53, (byte)(25 + 55), (byte)(8 + 89), (byte)(7 + 93), (byte)(67 + 33), (byte)(90 + 15), (byte)(14 + 96), (byte)(58 + 45)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_564.d[0] = NLoginCore_451.B("ňōƒŮƋƒŗœſŗŻŬƃƚŠƠŸƝƥƜƋƣŵƊƚƛƂŽŤŬƜƭƪŲƥƌŰƼƵƆƌƶƖƶǃƝǂƚƔƑƓƝǅƜƃƚƣƗƩƉƋƥƼƌ", (byte)79, 66);
                    NLoginCore_564.d[1] = NLoginCore_453.F("ՂնՅւցՠՊչիՋ՚Փ", (byte)79, 70);
                    NLoginCore_564.d[2] = NLoginCore_223.D("ӺӜӱԆӶӯӭӽԘӽԁӪ", (byte)79, 68);
                    NLoginCore_564.d[3] = NLoginCore_387.A("žƘƕůŘƌƌŸƆŷƑƒŚŸŖƀƂŦƂŶŴƋƠƁƄƨƥƅơƯƂƟŵƥƈůƴƼƖƉƚƫƶƅ", (byte)79, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_564.d[0] = NLoginCore_387.C("ӍӒԗӳԐԗӜӘԄӜԀӱԈԟӥԥӽԢԪԡԐԨӺԏԟԠԇԂөӱԡԲԯӷԪԑӵՁԺԋԑԻԛԻՈԢՇԟԙԖԘԢՊԥՑԚԴՄՐԱՏՎՈԢ", (byte)79, 67);
                    NLoginCore_564.d[1] = NLoginCore_387.F("վՀ՜փգղՃբո֋՚Փ", (byte)79, 70);
                    NLoginCore_564.d[2] = NLoginCore_384.C("ӴԒԘӾӑӻӿԜԏӣԀӵӹԘԛӸԈӻԞӽԚԮӵӶ", (byte)79, 67);
                    NLoginCore_564.d[3] = NLoginCore_324.B("žƘƕůŘƌƌŸƆŷƑƒŚŸŖƀƂŦƂŶŴƋƠƁƄƨƥƅơƯƂƟųƗƎƬƘƊƮƫƳűƠƅ", (byte)79, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_564.d[0] = NLoginCore_384.F("ՔշշչԿք՛Օէի։րբհի֏՞ղե՗Պ֒չքմի֗՗ս֋֔՛", (byte)79, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_564.d[0] = NLoginCore_559.B("ųŲůƒųųƏŵŰźŨť", (byte)79, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0xB38823ACFAC4C228L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(20 + 49), (byte)(35 + 48), (byte)(16 + 31), (byte)(12 + 55), (byte)(28 + 38), (byte)(8 + 59), 47, 80, (byte)(46 + 29), (byte)(3 + 64), (byte)(30 + 53), (byte)(36 + 17), (byte)(24 + 56), (byte)(93 + 4), (byte)(77 + 23), (byte)(83 + 17), (byte)(101 + 4), (byte)(54 + 56), (byte)(34 + 69)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.D("ыјїКњіёњѥєСџѣќџѥЧޔޮ޸ް޽ޙ޵߈޸߀޴߅ޭ", (byte)17, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_564.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }
}

