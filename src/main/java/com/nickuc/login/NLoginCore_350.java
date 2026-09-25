/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.zip4j.ZipFile
 */
package com.nickuc.login;

import com.nickuc.login.lib.zip4j.ZipFile;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_350 {
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static long var_long_b;
    private static long f;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private static long i;
    private static int e;
    private static int h;
    private static int j;
    private static int g;
    private static int var_int_a;
    private static long d;

    static {
        var_int_a = 0 >>> 7 | 0 << ~7 + 1;
        var_long_b = Long.reverse(-1118616149201015303L);
        d = Long.reverse(0x6C00000000000000L);
        e = 32 >>> 229 | 32 << -229;
        f = Long.reverse(-7171454048386961927L);
        g = (0x8000000 >>> 58 | 0x8000000 << -58) & 0xFFFFFFFF;
        h = -1 >>> 176 | -1 << -176;
        i = Long.reverse(-7171454048386961927L);
        j = (0x1800000 >>> 247 | 0x1800000 << ~247 + 1) & 0xFFFFFFFF;
        k = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_350.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_350.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("ЖикКоѝѕѫїЦѤњѨѢЫѐѲѱѩѯѩо", (byte)19, 67), NLoginCore_350.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѽѶѩѬэўяѵ҆џ҅҈ѕѸѬÿ", (byte)19, 65) + string + NLoginCore_384.B("ß", (byte)19, 66) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = -6938398447392809457L;
        long l = c ^ 0xECCB295756B3FE79L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(5 + 64), (byte)(77 + 6), 47, (byte)(56 + 11), (byte)(12 + 54), (byte)(66 + 1), (byte)(34 + 13), (byte)(8 + 72), (byte)(45 + 30), (byte)(60 + 7), (byte)(17 + 66), (byte)(23 + 30), (byte)(4 + 76), (byte)(21 + 76), (byte)(57 + 43), (byte)(89 + 11), (byte)(88 + 17), (byte)(72 + 38), (byte)(60 + 43)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), (byte)(66 + 17)}, StandardCharsets.UTF_8));
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
                    NLoginCore_350.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ӞӑԈӡԐәԖԘӖӚԖԡԓԐӾӯԢӜԛӡӦԔԦӻԣӦӫԜӬӱԃԫԖԎԘԆԖӲԴԘԔԱԗԠԫԫՂԐՅԻԘՉԺԢԏԐ", (byte)77, 68);
                    NLoginCore_350.var_java_lang_String_arr_b[1] = NLoginCore_076.E("Կ՝վկյչ՘Իռսժ֋ՍծակժՒվ֍Ոն֓դջ՚֍ըճչ֒՝փ֔՛ՠՠ՝՟ֈզֈգձ", (byte)77, 69);
                    NLoginCore_350.var_java_lang_String_arr_b[2] = NLoginCore_027.F("Կ՝վկյչ՘Իռսժն֎փ՝Վ֊լաի֌շզ֑֗դկյ֖֖֡պռ֒ղ֥֘֠օտժջ֦ձ", (byte)77, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_350.var_java_lang_String_arr_b[0] = NLoginCore_092.E("ՋԾյՎսՆփօՃՇփ֎րսի՜֏ՉֈՎՓց֓ը֐Փ՘։ՙ՞հ֘փջօճփ՟֡օց֞քռ֤օցպ֝հղֱֵ֥ռս", (byte)77, 69);
                    NLoginCore_350.var_java_lang_String_arr_b[1] = NLoginCore_110.F("Կ՝վկյչ՘Իռսժ֋ՍծակժՒվ֍Ոն֓դջ՚֍ըճչ֒՝՟֠՟նդա֦֢֟֝֠ըֈևպկ֏֤զ֍ֱֵռս", (byte)77, 70);
                    NLoginCore_350.var_java_lang_String_arr_b[2] = NLoginCore_110.D("ӒӰԑԂԈԌӫӎԏԐӽԉԡԖӰӡԝӿӴӾԟԊӹԪԤӷԂԈԩԩԴԍӭԏԶԬԆԌԺԸԧԔԷӻԳӸԹՃԗԟԣԹՉՈԏԐ", (byte)77, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_350.var_java_lang_String_arr_b[0] = NLoginCore_559.F("Ձ՜ճօ՚՗աեՙսՋՑ", (byte)77, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_350.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ӰԎӗӣԔӷԕӜԔӳԀӼӻӠӠӰԔӴԐԈԤӲӯӰ", (byte)77, 68);
                }
            }
        }
    }

    public static void b(File file, File file2) {
        try (ZipFile zipFile = new ZipFile(file2);){
            if (file.isDirectory()) {
                zipFile.addFolder(file);
            } else {
                zipFile.addFile(file);
            }
        }
    }

    public static void a(List<File> list, File file) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_350.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        }
        try (ZipFile zipFile = new ZipFile(file);){
            for (File file2 : list) {
                if (file2.isDirectory()) {
                    zipFile.addFolder(file2);
                    continue;
                }
                zipFile.addFile(file2);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x36L;
        l ^= 0xECCB295756B3FE79L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(21 + 48), (byte)(56 + 27), (byte)(42 + 5), (byte)(41 + 26), (byte)(34 + 32), (byte)(35 + 32), 47, (byte)(6 + 74), (byte)(3 + 72), (byte)(55 + 12), (byte)(60 + 23), (byte)(16 + 37), (byte)(48 + 32), (byte)(2 + 95), (byte)(27 + 73), (byte)(95 + 5), 105, (byte)(36 + 74), (byte)(84 + 19)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), (byte)(45 + 38)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.A("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎӧӠӓӖҷӈҹӟӰӉӯӲҿӢӖ", (byte)72, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_350.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static byte[] b(byte[] byArray) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);){
                deflaterOutputStream.write(byArray);
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_350.c("㺀", (int)e, (long)f), iOException);
        }
    }

    public static byte[] c(byte[] byArray) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);){
                inflaterOutputStream.write(byArray);
                inflaterOutputStream.flush();
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_350.c("㺀", (int)(g & h), (long)i), iOException);
        }
    }

    public static void a(File file, File file2) {
        try (ZipFile zipFile = new ZipFile(file);){
            zipFile.extractAll(file2.toString());
        }
    }
}

