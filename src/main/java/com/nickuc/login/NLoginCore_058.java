/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_390;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_132;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_058
implements NLoginInterface_030 {
    private static long f;
    private static long g;
    private static int var_int_a;
    private static int var_int_b;
    private static long c;
    private static int i;
    private NLoginInterface_031 var_com_nickuc_login_NLoginInterface_031_a;
    private static String[] var_java_lang_String_arr_b;
    private NLoginCore_033 var_com_nickuc_login_NLoginCore_033_a;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_b;
    private final NLoginCore_132 var_com_nickuc_login_NLoginCore_132_b;
    private static long d;
    private static int e;
    private static int h;
    private static String[] var_java_lang_String_arr_a;

    @Override
    @Generated
    public NLoginCore_033 com_nickuc_login_NLoginCore_033_a() {
        return this.var_com_nickuc_login_NLoginCore_033_a;
    }

    private static void b() {
        int n;
        c = -3874840403891979430L;
        long l = c ^ 0x98B735EDBCA8AB9BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(39 + 30), (byte)(44 + 39), (byte)(40 + 7), (byte)(41 + 26), (byte)(10 + 56), (byte)(23 + 44), (byte)(13 + 34), (byte)(39 + 41), (byte)(42 + 33), (byte)(44 + 23), (byte)(18 + 65), (byte)(19 + 34), 80, (byte)(31 + 66), 100, (byte)(48 + 52), (byte)(55 + 50), (byte)(20 + 90), (byte)(30 + 73)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_058.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǇƠƹƙǍƻƬǏƦƾƢƴơƠƱƓǅƭǅǕǚǋƢƣ", (byte)104, 66);
                    NLoginCore_058.var_java_lang_String_arr_b[1] = NLoginCore_173.C("ԘՙԲՂգՙէԾգԡԫԵ", (byte)104, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_058.var_java_lang_String_arr_b[0] = NLoginCore_453.A("ǇƠƹƙǍƻƬǏƦƾƣƽƨǍƷǊǌǓǗƭǌƥƢƣ", (byte)104, 65);
                    NLoginCore_058.var_java_lang_String_arr_b[1] = NLoginCore_110.D("աԠԻՠ՜ՇԨ՞Ս՝ՄՃԾԲեՁՋոծՑՃթՀՁ", (byte)104, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_058.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ԲԝԱԽՇՂԪԪԧՁՇծԯաՅհԲշըէզչՀՁ", (byte)104, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_058.var_java_lang_String_arr_b[0] = NLoginCore_324.A("ƓƶƘǊƈƻƙǎǍƹƍƗ", (byte)104, 65);
                }
            }
        }
    }

    @Override
    public void l() {
        if (this.var_com_nickuc_login_NLoginCore_033_a != null) {
            NLoginCore_390 NLoginCore_3902 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b.com_nickuc_login_NLoginCore_390_a();
            NLoginCore_3902.c(NLoginCore_132.var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_a);
            NLoginCore_3902.c(NLoginCore_132.var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_b);
        }
        this.var_com_nickuc_login_NLoginInterface_031_a = null;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_058.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.A("ýğġāĥńļŒľčŋŁŏŉĒķřŘŐŖŐĥ", (byte)43, 65), NLoginCore_058.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("ĸŅńćŇŃľŇŒŁĎŌŐŉŌŒĔҚҘҟҫҥҜ҇ҀҬҫҨī", (byte)43, 65) + string + NLoginCore_201.C("Ѱ", (byte)43, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x7CL;
        l ^= 0x98B735EDBCA8AB9BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(60 + 9), (byte)(31 + 52), (byte)(25 + 22), 67, (byte)(49 + 17), (byte)(55 + 12), 47, (byte)(39 + 41), (byte)(41 + 34), (byte)(18 + 49), (byte)(7 + 76), (byte)(28 + 25), (byte)(15 + 65), (byte)(38 + 59), (byte)(59 + 41), (byte)(93 + 7), (byte)(104 + 1), (byte)(37 + 73), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("գհկԲղծթղսլԹշջմշսԿࣅࣃ࣐࣊ࣖࣇࢲࢫ࣓ࣗࣖ", (byte)68, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_058.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void k() {
        NLoginType_008 NLoginType_008 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b.com_nickuc_login_NLoginType_008_a();
        this.var_com_nickuc_login_NLoginInterface_031_a = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b.java_lang_Object_b().j((String)NLoginCore_058.c("㺀", (int)(var_int_a & var_int_b), (long)d)) ? new NLoginCore_418(NLoginType_008) : (this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b.java_lang_Object_b().j((String)NLoginCore_058.c("㺃", (int)e, (long)(f ^ g))) ? new NLoginCore_185() : null);
        if (this.var_com_nickuc_login_NLoginCore_033_a == null) {
            NLoginCore_390 NLoginCore_3902 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b.com_nickuc_login_NLoginCore_390_a();
            NLoginCore_3902.a(NLoginCore_132.var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_a, this.var_com_nickuc_login_NLoginCore_132_b);
            NLoginCore_3902.a(NLoginCore_132.var_com_velocitypowered_api_proxy_messages_ChannelIdentifier_b, this.var_com_nickuc_login_NLoginCore_132_b);
            this.var_com_nickuc_login_NLoginCore_033_a = new NLoginCore_033(NLoginType_008);
        }
    }

    static {
        var_int_a = 0 >>> 107 | 0 << -107;
        var_int_b = -1 >>> 34 | -1 << -34;
        d = Long.reverse(7268797899179531347L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(6548221958800251987L);
        g = Long.reverse(0x3E00000000000000L);
        h = Integer.reverse(0x40000000);
        i = (0x200000 >>> 20 | 0x200000 << -20) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_058.b();
    }

    @Generated
    public NLoginCore_058(nLoginVelocity nLoginVelocity2, NLoginCore_132 NLoginCore_1322) {
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_b = nLoginVelocity2;
        this.var_com_nickuc_login_NLoginCore_132_b = NLoginCore_1322;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        this.k();
    }

    @Override
    @Generated
    public NLoginInterface_031 com_nickuc_login_NLoginInterface_031_a() {
        return this.var_com_nickuc_login_NLoginInterface_031_a;
    }
}

