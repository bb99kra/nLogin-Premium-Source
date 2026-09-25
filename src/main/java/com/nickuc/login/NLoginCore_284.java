/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_345;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_185;
import com.nickuc.login.NLoginCore_418;
import com.nickuc.login.NLoginCore_017;
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

public class NLoginCore_284
implements NLoginInterface_030 {
    private static int j;
    private static int n;
    private static long i;
    private static int m;
    private static long l;
    private static int e;
    private static long g;
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static long var_long_b;
    private static long c;
    private final NLoginCore_017 var_com_nickuc_login_NLoginCore_017_b;
    private NLoginInterface_031 var_com_nickuc_login_NLoginInterface_031_a;
    private static int var_int_a;
    private static long k;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int h;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_b;
    private NLoginCore_033 var_com_nickuc_login_NLoginCore_033_a;

    @Override
    @Generated
    public NLoginCore_033 com_nickuc_login_NLoginCore_033_a() {
        return this.var_com_nickuc_login_NLoginCore_033_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_284.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("Օշչՙս֪֖֜֔ե֣֧֙֡ժ֏ְֱ֮֨֨ս", (byte)113, 70), NLoginCore_284.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.E("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լࣲࣨइऊࣺࣿࣷࣷअऋआࣼք", (byte)113, 69) + string + NLoginCore_453.A("ƛ", (byte)113, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public void l() {
        if (this.var_com_nickuc_login_NLoginCore_033_a != null) {
            NLoginCore_345 NLoginCore_3452 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b.com_nickuc_login_NLoginCore_345_a();
            NLoginCore_3452.c(NLoginCore_284.c("㺀", (int)j, (long)(k ^ l)));
        }
        this.var_com_nickuc_login_NLoginInterface_031_a = null;
    }

    @Override
    @Generated
    public NLoginInterface_031 com_nickuc_login_NLoginInterface_031_a() {
        return this.var_com_nickuc_login_NLoginInterface_031_a;
    }

    @Generated
    public NLoginCore_284(nLoginBungee nLoginBungee2, NLoginCore_017 NLoginCore_0172) {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b = nLoginBungee2;
        this.var_com_nickuc_login_NLoginCore_017_b = NLoginCore_0172;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(557322492668416419L);
        d = Long.reverse(-6917529027641081856L);
        e = (16 >>> 36 | 16 << ~36 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = Long.reverse(-6360206534972665437L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(-6360206534972665437L);
        j = 786432 >>> 82 | 786432 << ~82 + 1;
        k = Long.reverse(557322492668416419L);
        l = Long.reverse(-6917529027641081856L);
        m = 512 >>> 103 | 512 << -103;
        n = 0x800000 >>> 85 | 0x800000 << -85;
        var_java_lang_String_arr_a = new String[m];
        var_java_lang_String_arr_b = new String[n];
        NLoginCore_284.b();
    }

    @Override
    public void k() {
        NLoginType_008 NLoginType_008 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b.com_nickuc_login_NLoginType_008_a();
        this.var_com_nickuc_login_NLoginInterface_031_a = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b.java_lang_Object_b().j((String)NLoginCore_284.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))) ? new NLoginCore_418(NLoginType_008) : (this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b.java_lang_Object_b().j((String)NLoginCore_284.c("㺃", (int)(e & f), (long)g)) ? new NLoginCore_185() : null);
        if (this.var_com_nickuc_login_NLoginCore_033_a == null) {
            NLoginCore_345 NLoginCore_3452 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_b.com_nickuc_login_NLoginCore_345_a();
            NLoginCore_3452.a(NLoginCore_284.c("㺆", (int)h, (long)i), this.var_com_nickuc_login_NLoginCore_017_b);
            this.var_com_nickuc_login_NLoginCore_033_a = new NLoginCore_033(NLoginType_008);
        }
    }

    private static void b() {
        int n;
        c = -4212999746291221024L;
        long l = c ^ 0x591EAB35E32017CDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(48 + 21), (byte)(5 + 78), (byte)(5 + 42), (byte)(21 + 46), 66, (byte)(38 + 29), (byte)(36 + 11), (byte)(61 + 19), 75, (byte)(50 + 17), (byte)(32 + 51), (byte)(5 + 48), (byte)(62 + 18), (byte)(66 + 31), (byte)(25 + 75), (byte)(8 + 92), (byte)(37 + 68), (byte)(27 + 83), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_284.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ƿǉǈƥƚƜƟƩưǋǍƳǛƦƗǌǇǀǙǞǐƻƨƩ", (byte)107, 66);
                    NLoginCore_284.var_java_lang_String_arr_b[1] = NLoginCore_324.E("՜֛խփշ֡ղօ֟չ֦֡շր֨ստ֏ս֨֋ր֭շօ֑փ֥֛֨ֈ֏", (byte)107, 69);
                    NLoginCore_284.var_java_lang_String_arr_b[2] = NLoginCore_223.D("ՏըՇԽթՈթէ՗ԴծՉԵՓվ՚Ֆ՝՞Ռ՜՜ՉՊ", (byte)107, 68);
                    NLoginCore_284.var_java_lang_String_arr_b[3] = NLoginCore_004.B("ƮǇƦƜǈƧǈǆƶƓǍƨƔƲǝƹƵƼƽƫƻƻƨƩ", (byte)107, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_284.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ƿǉǈƥƚƜƟƩưǋǋǒǊǜǘƼƝǒǌƚǝƫƨƩ", (byte)107, 65);
                    NLoginCore_284.var_java_lang_String_arr_b[1] = NLoginCore_201.F("՜֛խփշ֡ղօ֟չ֦֡շր֨ստ֏ս֨֋ևք֨օն֤֕ճּֿ֕", (byte)107, 70);
                    NLoginCore_284.var_java_lang_String_arr_b[2] = NLoginCore_092.D("ՏըՇԽթՈթէ՗ԴծՍՑլռոմձ՘խՋՎյսֆՓըքփվ՗Շ", (byte)107, 68);
                    NLoginCore_284.var_java_lang_String_arr_b[3] = NLoginCore_384.F("ր֙ոծ֚չ֚֘ֈե֝֫վ֌ջ֡պ֊֦֤֠֡խִ֣ճղִֹ֥֝ջ", (byte)107, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_284.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ԽՂաՉԩԭՔՋՠ՘ՍԾ", (byte)107, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_284.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ǌƟƍƠƜƿǔƍƶƟƐƋǆƶƙƔƯƱǐƛǐǟǅǂǅƦǦǈǇǌǖǮ", (byte)107, 66);
                }
            }
        }
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        this.k();
    }

    private static String a(int n, long l) {
        l ^= 5L;
        l ^= 0x591EAB35E32017CDL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), 69, (byte)(60 + 23), (byte)(7 + 40), (byte)(58 + 9), (byte)(27 + 39), (byte)(27 + 40), 47, (byte)(44 + 36), (byte)(55 + 20), (byte)(17 + 50), (byte)(19 + 64), (byte)(9 + 44), (byte)(32 + 48), (byte)(82 + 15), (byte)(89 + 11), (byte)(18 + 82), (byte)(49 + 56), (byte)(22 + 88), (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѰѦ҅҈Ѹѽѵѵ҃҉҄Ѻ", (byte)22, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_284.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

