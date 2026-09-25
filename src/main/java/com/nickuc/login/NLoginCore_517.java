/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_496;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_517 {
    private static long u;
    private final SignatureData var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a;
    private static int f;
    private final UUID var_java_util_UUID_h;
    private static int k;
    private static int var_int_b;
    private static long c;
    private static long e;
    private static long n;
    private static int s;
    private static int t;
    private static String[] var_java_lang_String_arr_a;
    private static long i;
    private static int l;
    private static int p;
    private static int q;
    private static int v;
    private static int w;
    private static int g;
    private static int j;
    private static int o;
    private static int x;
    private static int r;
    private static int var_int_h;
    private static long m;
    private static long d;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;

    static {
        var_int_a = Integer.reverse(0x18000000);
        var_int_b = 0 >>> 150 | 0 << ~150 + 1;
        d = Long.reverse(4273224449002055942L);
        e = Long.reverse(-2305843009213693952L);
        f = 1024 >>> 10 | 1024 << ~10 + 1;
        g = Integer.reverse(0);
        var_int_h = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255;
        i = Long.reverse(-2644304578639025914L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Integer.reverse(0);
        l = (1024 >>> 9 | 1024 << ~9 + 1) & 0xFFFFFFFF;
        m = Long.reverse(4273224449002055942L);
        n = Long.reverse(-2305843009213693952L);
        o = (8192 >>> 140 | 8192 << ~140 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(0);
        s = Integer.reverse(0x10000000);
        t = 458752 >>> 112 | 458752 << ~112 + 1;
        u = Long.reverse(-72057594037927936L);
        v = Integer.reverse(0x10000000);
        w = Integer.reverse(-1073741824);
        x = 6144 >>> 75 | 6144 << ~75 + 1;
        var_java_lang_String_arr_a = new String[w];
        var_java_lang_String_arr_b = new String[x];
        NLoginCore_517.b();
    }

    private byte[] a(long l) {
        byte[] byArray = new byte[s];
        for (int i = t; i >= 0; --i) {
            byArray[i] = (byte)(l & u);
            l >>= v;
        }
        return byArray;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_517.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.C("ӍӯӱӑӵԔԌԢԎӝԛԑԟԙӢԇԩԨԠԦԠӵ", (byte)80, 67), NLoginCore_517.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤࡾࡊࡺࡴࡷ࡞࡜ࡽࡳࡾ࢈ࡴ࡫ࢆࢄӿ", (byte)80, 67) + string + NLoginCore_173.E("Ն", (byte)80, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_517(SignatureData signatureData, UUID uUID) {
        this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a = signatureData;
        this.var_java_util_UUID_h = uUID;
    }

    public boolean aA() {
        return this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getTimestamp().isBefore(Instant.now());
    }

    public boolean a(byte[] byArray, byte[] byArray2, long l) {
        try {
            PublicKey publicKey = this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getPublicKey();
            byte[][] byArrayArray = new byte[o][];
            byArrayArray[NLoginCore_517.p] = byArray2;
            byArrayArray[NLoginCore_517.q] = this.a(l);
            return NLoginCore_496.a((String)NLoginCore_517.c("㺀", (int)NLoginCore_517.l, (long)(m ^ n)), publicKey, byArray, (byte[][])byArrayArray);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return r != 0;
        }
    }

    private static String a(int n, long l) {
        l ^= 7L;
        l ^= 0xC95E973CCFD01B29L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(42 + 27), (byte)(60 + 23), (byte)(39 + 8), 67, (byte)(11 + 55), (byte)(47 + 20), (byte)(5 + 42), (byte)(71 + 9), (byte)(19 + 56), (byte)(43 + 24), (byte)(54 + 29), (byte)(29 + 24), (byte)(52 + 28), (byte)(12 + 85), (byte)(74 + 26), (byte)(41 + 59), 105, (byte)(25 + 85), (byte)(54 + 49)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(30 + 38), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.A("ƠƭƬůƯƫƦƯƺƩŶƴƸƱƴƺżԖӢԒԌԏӶӴԕԋԖԠԌԃԞԜ", (byte)95, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_517.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 6959207181964128988L;
        long l = c ^ 0xC95E973CCFD01B29L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(40 + 29), 83, (byte)(20 + 27), (byte)(26 + 41), 66, (byte)(58 + 9), (byte)(10 + 37), (byte)(23 + 57), (byte)(40 + 35), (byte)(32 + 35), (byte)(61 + 22), (byte)(25 + 28), (byte)(32 + 48), (byte)(91 + 6), (byte)(12 + 88), (byte)(5 + 95), (byte)(69 + 36), (byte)(43 + 67), (byte)(45 + 58)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(37 + 46)}, StandardCharsets.UTF_8));
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
                    NLoginCore_517.var_java_lang_String_arr_b[0] = NLoginCore_173.E("Օ՗աևՉՁՄցՇՇՐօ֏֏֔ըՏզչձ֘։ՠա", (byte)81, 69);
                    NLoginCore_517.var_java_lang_String_arr_b[1] = NLoginCore_324.E("Օ՗աևՉՁՄցՇՇՐօ֏֏֔ըՏզչձ֘։ՠա", (byte)81, 69);
                    NLoginCore_517.var_java_lang_String_arr_b[2] = NLoginCore_004.D("ӮԝӷӾԗԗӧԥԡԥӿԀӧӷԮԞӾ԰ԔԑԲԤӻӼ", (byte)81, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_517.var_java_lang_String_arr_b[0] = NLoginCore_324.F("Օ՗աևՉՁՄցՇՇՂֈփՑՊկքղր՗ևգՠա", (byte)81, 70);
                    NLoginCore_517.var_java_lang_String_arr_b[1] = NLoginCore_427.C("ӰӲӼԢӤӜӟԜӢӢӝөӹԜӪӺԍөԪӿԋԤӻӼ", (byte)81, 67);
                    NLoginCore_517.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ӮԝӷӾԗԗӧԥԡԥӿԆԟԌԪӧԬԭӳԩԥԠԶԂԙԛӱӴӻԒӽԩ", (byte)81, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_517.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ԠӹӽԟԎԧԈԚԡӦԉԅԢԗԘԫԟԐԇԨԖԌԦԄԗԷԩӴԅԷӸԷ", (byte)81, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_517.var_java_lang_String_arr_b[0] = NLoginCore_453.B("ŹųŷŬŶŪŸƛřŰơƑŻŢƚƩťƇƀŨƂƝŴŵ", (byte)81, 66);
                }
            }
        }
    }

    public boolean aB() {
        byte[] byArray = this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getSignature();
        if (this.var_java_util_UUID_h != null) {
            byte[] byArray2 = this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getPublicKey().getEncoded();
            byte[] byArray3 = new byte[byArray2.length + var_int_a];
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray3).order(ByteOrder.BIG_ENDIAN);
            byteBuffer.putLong(this.var_java_util_UUID_h.getMostSignificantBits());
            byteBuffer.putLong(this.var_java_util_UUID_h.getLeastSignificantBits());
            byteBuffer.putLong(this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getTimestamp().toEpochMilli());
            byteBuffer.put(byArray2);
            byte[][] byArrayArray = new byte[f][];
            byArrayArray[NLoginCore_517.g] = byArray3;
            return NLoginCore_496.a((String)NLoginCore_517.c("㺀", (int)var_int_b, (long)(d ^ e)), NLoginCore_496.a(), byArray, (byte[][])byArrayArray);
        }
        byte[] byArray4 = this.var_com_nickuc_login_lib_packetevents_api_util_crypto_SignatureData_a.getSignature();
        byte[][] byArrayArray = new byte[j][];
        byArrayArray[NLoginCore_517.k] = byArray4;
        return NLoginCore_496.a((String)NLoginCore_517.c("㺃", (int)var_int_h, (long)i), NLoginCore_496.a(), byArray, (byte[][])byArrayArray);
    }
}

