/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_229;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_216 {
    private static long m;
    private static String[] var_java_lang_String_arr_b;
    private final NLoginCore_229 var_com_nickuc_login_NLoginCore_229_e;
    private static int o;
    private static int n;
    private static int var_int_c;
    private static int var_int_a;
    private static long var_long_e;
    private static long d;
    private static int var_int_b;
    private static long var_long_c;
    private static int var_int_i;
    private static long g;
    private static int k;
    private final long var_long_i;
    private static int h;
    private final String A;
    private static int f;
    private static String[] var_java_lang_String_arr_a;
    private static long l;
    private static long j;

    @Generated
    public String java_lang_String_d() {
        return this.A;
    }

    static {
        var_int_a = 32768 >>> 239 | 32768 << -239;
        var_int_b = Integer.reverse(0);
        var_int_c = (0 >>> 59 | 0 << ~59 + 1) & 0xFFFFFFFF;
        d = Long.reverse(-5867497551766925360L);
        var_long_e = Long.reverse(-3602879701896396800L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(6958754186984247248L);
        h = Integer.reverse(0x40000000);
        var_int_i = (-1 >>> 243 | -1 << -243) & 0xFFFFFFFF;
        j = Long.reverse(6958754186984247248L);
        k = 0x18000000 >>> 59 | 0x18000000 << -59;
        l = Long.reverse(-5867497551766925360L);
        m = Long.reverse(-3602879701896396800L);
        n = 0x4000000 >>> 24 | 0x4000000 << ~24 + 1;
        o = (0x2000000 >>> 23 | 0x2000000 << ~23 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_216.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_216.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ӥԇԉөԍԬԤԺԦӵԳԩԷԱӺԟՁՀԸԾԸԍ", (byte)1, 70), NLoginCore_216.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("äñð³óïêóþíºøüõøþÀюічјыѕоёљѣѤ×", (byte)1, 65) + string + NLoginCore_201.B("»", (byte)1, 66) + methodType.toString(), exception);
        }
    }

    @Generated
    public long long_d() {
        return this.var_long_i;
    }

    static /* synthetic */ long a(NLoginCore_216 NLoginCore_2162) {
        return NLoginCore_2162.var_long_i;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_216.c("㺀", (int)var_int_c, (long)(d ^ var_long_e)) + this.long_d() + (String)NLoginCore_216.c("㺃", (int)f, (long)g) + this.java_lang_String_d() + (String)NLoginCore_216.c("㺆", (int)(h & var_int_i), (long)j) + (Object)((Object)this.a()) + (String)NLoginCore_216.c("㺉", (int)k, (long)(l ^ m));
    }

    @Generated
    public NLoginCore_216(long l, String string, NLoginCore_229 NLoginCore_2292) {
        this.var_long_i = l;
        this.A = string;
        this.var_com_nickuc_login_NLoginCore_229_e = NLoginCore_2292;
    }

    private static void b() {
        int n;
        var_long_c = 860942094593575285L;
        long l = var_long_c ^ 0x64A241AF577EA056L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(22 + 47), (byte)(4 + 79), (byte)(26 + 21), (byte)(47 + 20), (byte)(18 + 48), (byte)(33 + 34), (byte)(42 + 5), 80, (byte)(52 + 23), (byte)(24 + 43), (byte)(77 + 6), (byte)(18 + 35), (byte)(47 + 33), (byte)(28 + 69), (byte)(99 + 1), (byte)(31 + 69), (byte)(34 + 71), 110, (byte)(6 + 97)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(21 + 48), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_216.var_java_lang_String_arr_b[0] = NLoginCore_091.D("֎գպմժ՚֟կ֑ի֡ռքպ֖գ֧փ֖ո֊֎էբ֮֡իֱ֧֖ձճ", (byte)121, 68);
                    NLoginCore_216.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ƩƳǉǁǥǀǮǃƻǋưǧǱǍǓƯǉǤǄǇƼǭǄǅ", (byte)121, 66);
                    NLoginCore_216.var_java_lang_String_arr_b[2] = NLoginCore_427.F("ժ֮֏֭։֏վֳַ֢րս", (byte)121, 70);
                    NLoginCore_216.var_java_lang_String_arr_b[3] = NLoginCore_451.C("Ֆ֔֍էռ֚՞ըս֛բը", (byte)121, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_216.var_java_lang_String_arr_b[0] = NLoginCore_004.C("֎գպմժ՚֟կ֑ի֡ռքպ֖գ֧փ֖ո֊֚ւխ֍ռְֱֶ֠֋֒", (byte)121, 67);
                    NLoginCore_216.var_java_lang_String_arr_b[1] = NLoginCore_138.A("ƩƳǉǁǥǀǮǃƻǋưǡǠǅǵǐǒǯǜǍǗǗǄǅ", (byte)121, 65);
                    NLoginCore_216.var_java_lang_String_arr_b[2] = NLoginCore_559.B("ǒƫƣǬƽǞǏǇǯǌǠǓǳƮǕǧƹƱǳǥǘǗǄǅ", (byte)121, 66);
                    NLoginCore_216.var_java_lang_String_arr_b[3] = NLoginCore_027.F("֣օ֥֌֏վ֌֥֫ք֢ս", (byte)121, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_216.var_java_lang_String_arr_b[0] = NLoginCore_076.D("֗֓ոխղ֎֛֖՝֓լ՜ք֚ճշմւ֛֠֊ְ֢֫փֱ֢֒֯ֆ֭ւ", (byte)121, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_216.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ծ֋քֱֳ֛֔իֱ֌ֱցֈ֖֖֐ֵ֑֑֛֘֔ֈ։", (byte)121, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x73L;
        l ^= 0x64A241AF577EA056L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(29 + 40), (byte)(75 + 8), (byte)(39 + 8), (byte)(36 + 31), (byte)(7 + 59), (byte)(23 + 44), (byte)(34 + 13), (byte)(7 + 73), (byte)(51 + 24), (byte)(28 + 39), 83, (byte)(38 + 15), (byte)(42 + 38), (byte)(81 + 16), (byte)(49 + 51), (byte)(33 + 67), (byte)(78 + 27), 110, (byte)(32 + 71)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(18 + 65)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ӌәӘқӛӗӒӛӦӕҢӠӤӝӠӦҨ࠶࠾࠯ࡀ࠳࠽ࠦ࠹ࡁࡋࡌ", (byte)60, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_216.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_229 a() {
        return this.var_com_nickuc_login_NLoginCore_229_e;
    }

    public String getName() {
        return this.var_com_nickuc_login_NLoginCore_229_e != NLoginCore_229.var_com_nickuc_login_NLoginCore_229_c && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar() ? BCryptHashProvider.g(this.A, (this.var_com_nickuc_login_NLoginCore_229_e == NLoginCore_229.var_com_nickuc_login_NLoginCore_229_a ? var_int_a : var_int_b) != 0) : this.A;
    }
}

