/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
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

public class NLoginCore_364 {
    private static long c;
    private static long o;
    private static int r;
    private static long var_long_b;
    private static long d;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int s;
    private static long f;
    private final String br;
    private final boolean aj;
    private static long g;
    private static long i;
    private final String bp;
    private static long n;
    private static int k;
    private static long q;
    private final NLoginCore_419 var_com_nickuc_login_NLoginCore_419_a;
    private static int p;
    private final String bq;
    private static String[] var_java_lang_String_arr_a;
    private static int e;
    private static long l;
    private static int m;
    private static int j;
    private static int h;

    static {
        var_int_a = (0 >>> 83 | 0 << ~83 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-4038004580557324366L);
        d = Long.reverse(-432345564227567616L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-4038004580557324366L);
        g = Long.reverse(-432345564227567616L);
        h = 0x8000000 >>> 218 | 0x8000000 << ~218 + 1;
        i = Long.reverse(4464791515918172082L);
        j = 786432 >>> 82 | 786432 << ~82 + 1;
        k = Integer.reverse(-1);
        l = Long.reverse(4464791515918172082L);
        m = 16384 >>> 108 | 16384 << -108;
        n = Long.reverse(-4038004580557324366L);
        o = Long.reverse(-432345564227567616L);
        p = (20480 >>> 172 | 20480 << -172) & 0xFFFFFFFF;
        q = Long.reverse(4464791515918172082L);
        r = Integer.reverse(0x60000000);
        s = 49152 >>> 173 | 49152 << -173;
        var_java_lang_String_arr_a = new String[r];
        var_java_lang_String_arr_b = new String[s];
        NLoginCore_364.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_364.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.E("՞րւբֆֳ֥֝֟ծְ֢֪֬ճֱֱַֺֹ֘ֆ", (byte)122, 69), NLoginCore_364.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԼԭԡՅՌԩՇԞՑՆՆՑՓǋ", (byte)122, 66) + string + NLoginCore_076.A("ƭ", (byte)122, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public String Y() {
        return this.br;
    }

    private static String a(int n, long l) {
        l ^= 0x5FL;
        l ^= 0x80D6A0C37557D44FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(54 + 15), (byte)(28 + 55), (byte)(31 + 16), 67, (byte)(48 + 18), (byte)(58 + 9), (byte)(38 + 9), (byte)(79 + 1), (byte)(17 + 58), (byte)(8 + 59), (byte)(53 + 30), (byte)(31 + 22), (byte)(74 + 6), (byte)(66 + 31), 100, (byte)(30 + 70), (byte)(101 + 4), (byte)(2 + 108), (byte)(91 + 12)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣲࣣࣗࣻंࣟࣽࣔइࣼࣼइउ", (byte)109, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_364.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_364(String string, String string2, String string3, NLoginCore_419 NLoginCore_4192, boolean bl) {
        this.bp = string;
        this.bq = string2;
        this.br = string3;
        this.var_com_nickuc_login_NLoginCore_419_a = NLoginCore_4192;
        this.aj = bl;
    }

    private static void b() {
        int n;
        c = 5620314722424614883L;
        long l = c ^ 0x80D6A0C37557D44FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(62 + 7), (byte)(17 + 66), (byte)(28 + 19), (byte)(22 + 45), (byte)(51 + 15), (byte)(66 + 1), (byte)(45 + 2), 80, (byte)(46 + 29), (byte)(41 + 26), (byte)(31 + 52), (byte)(52 + 1), (byte)(8 + 72), (byte)(8 + 89), (byte)(26 + 74), (byte)(72 + 28), (byte)(82 + 23), (byte)(69 + 41), (byte)(59 + 44)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(23 + 46), (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_364.var_java_lang_String_arr_b[0] = NLoginCore_446.B("ĭĩŋĺęĵĻĬŐĬĸĕģğğĥšŢĺśţŭłĸŝĿŝŦœŮŴŤ", (byte)48, 66);
                    NLoginCore_364.var_java_lang_String_arr_b[1] = NLoginCore_324.E("ԜՎՑԦԤեԦ՜՘խԿ԰ձԤզՏԫՉԯ՗ՕՒԿՀ", (byte)48, 69);
                    NLoginCore_364.var_java_lang_String_arr_b[2] = NLoginCore_173.B("ĲŊŚŒŌŚĵĴįĺĞřĮńġņİŝŀŨŨūĲĳ", (byte)48, 66);
                    NLoginCore_364.var_java_lang_String_arr_b[3] = NLoginCore_201.C("ҳѽҹҐӂӀѾҳҏғҤҍ", (byte)48, 67);
                    NLoginCore_364.var_java_lang_String_arr_b[4] = NLoginCore_427.C("ѵһҕҒҔҕҡғӂ҃ҒҺӁӀ҂ҶҾҟҺҪҊӁҘҙ", (byte)48, 67);
                    NLoginCore_364.var_java_lang_String_arr_b[5] = NLoginCore_324.E("ԡԞԿՑԢՅԣեԿՋԿԴ", (byte)48, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_364.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ԺԶ՘ՇԦՂՈԹ՝ԹՅԢ԰ԬԬԲծկՇըհոՆՊպՓԺՒՉյխղպՏղ։ջ։Քև՚Շ՛Ք", (byte)48, 70);
                    NLoginCore_364.var_java_lang_String_arr_b[1] = NLoginCore_027.D("ѵҧҪѿѽҾѿҵұӆҙ҆ӀҽҨ҇҄҅ӑҡҾқҘҙ", (byte)48, 68);
                    NLoginCore_364.var_java_lang_String_arr_b[2] = NLoginCore_384.B("ĲŊŚŒŌŚĵĴįĺĞŤıŏţœŜŉĳĶĤŎńņĪŐŤĲūŤńİ", (byte)48, 66);
                    NLoginCore_364.var_java_lang_String_arr_b[3] = NLoginCore_110.D("ѹҩҪѺұӄҥһҜҙ҇ҤҕӅҧӋӄһҋӄҾӁҘҙ", (byte)48, 68);
                    NLoginCore_364.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ďŕįĬĮįĻĭŜĝīİĺœťĴłńĩřŃśĲĳ", (byte)48, 66);
                    NLoginCore_364.var_java_lang_String_arr_b[5] = NLoginCore_004.D("ҳҙҐҴҁҔґҸҥӁҶҍ", (byte)48, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_364.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ĨĔģĶŝďĳķŕœġħ", (byte)48, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_364.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ŌŏőĤŚœęśŀŁıńĿŒıņĞŘķŠŧśĲĳ", (byte)48, 66);
                }
            }
        }
    }

    @Generated
    public boolean ao() {
        return this.aj;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_364.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + this.q() + (String)NLoginCore_364.c("㺃", (int)e, (long)(f ^ g)) + this.s() + (String)NLoginCore_364.c("㺆", (int)h, (long)i) + this.Y() + (String)NLoginCore_364.c("㺉", (int)(j & k), (long)l) + (Object)((Object)this.a()) + (String)NLoginCore_364.c("㺌", (int)m, (long)(n ^ o)) + this.ao() + (String)NLoginCore_364.c("㺏", (int)p, (long)q);
    }

    @Generated
    public NLoginCore_419 a() {
        return this.var_com_nickuc_login_NLoginCore_419_a;
    }

    @Generated
    public String q() {
        return this.bp;
    }

    @Generated
    public String s() {
        return this.bq;
    }
}

