/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_389;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_517;
import com.nickuc.login.NLoginCore_454;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_481 {
    private static String[] var_java_lang_String_arr_a;
    private static long d;
    private static long var_long_e;
    private static int var_int_b;
    private final String cc;
    private NLoginCore_454 var_com_nickuc_login_NLoginCore_454_a;
    @Nullable
    private final NLoginCore_517 var_com_nickuc_login_NLoginCore_517_a;
    private static long var_long_c;
    @Nullable
    private final byte[] f;
    private static int var_int_a;
    public static final AttributeKey<NLoginCore_481> var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_481__e;
    @Nullable
    private final ForceRegisterConfig var_com_nickuc_login_ForceRegisterConfig_e;
    private final String cb;
    private final Object i;
    private final WrapperLoginClientLoginStart var_com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_b;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_481.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.E("ՀբդՄըևտ֕ցՐ֎ք֒֌Օպ֛֜֓֙֓ը", (byte)92, 69), NLoginCore_481.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࢂ࡮࢙࢛ࢠ࢖ࢠࢉԜ", (byte)92, 68) + string + NLoginCore_451.A("ű", (byte)92, 65) + methodType.toString(), exception);
        }
    }

    @Generated
    public Object h() {
        return this.i;
    }

    @Generated
    public NLoginCore_481(@Nullable ForceRegisterConfig ForceRegisterConfig2, String string, String string2, Object object, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, @Nullable NLoginCore_517 NLoginCore_5172, @Nullable byte[] byArray) {
        this.var_com_nickuc_login_ForceRegisterConfig_e = ForceRegisterConfig2;
        this.cb = string;
        this.cc = string2;
        this.i = object;
        this.var_com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a = wrapperLoginClientLoginStart;
        this.var_com_nickuc_login_NLoginCore_517_a = NLoginCore_5172;
        this.f = byArray;
    }

    @Nullable
    @Generated
    public ForceRegisterConfig com_nickuc_login_ForceRegisterConfig_a() {
        return this.var_com_nickuc_login_ForceRegisterConfig_e;
    }

    private static String a(int n, long l) {
        l ^= 0x66L;
        l ^= 0x867B1DD61BF94CA3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(34 + 35), (byte)(68 + 15), (byte)(17 + 30), (byte)(18 + 49), (byte)(6 + 60), (byte)(54 + 13), (byte)(23 + 24), (byte)(19 + 61), 75, (byte)(50 + 17), (byte)(53 + 30), (byte)(30 + 23), 80, (byte)(81 + 16), (byte)(63 + 37), (byte)(37 + 63), (byte)(27 + 78), (byte)(77 + 33), (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("ԡԮԭӰ԰Ԭԧ԰ԻԪӷԵԹԲԵԻӽࡷࡣࢎ࢐࢕ࢋ࢕ࡾ", (byte)2, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_481.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -140839720893247154L;
        long l = var_long_c ^ 0x867B1DD61BF94CA3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(35 + 34), (byte)(66 + 17), (byte)(24 + 23), (byte)(22 + 45), (byte)(38 + 28), (byte)(60 + 7), 47, (byte)(72 + 8), (byte)(58 + 17), (byte)(35 + 32), (byte)(40 + 43), (byte)(43 + 10), (byte)(39 + 41), (byte)(16 + 81), 100, (byte)(9 + 91), (byte)(104 + 1), (byte)(46 + 64), (byte)(93 + 10)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(16 + 53), (byte)(54 + 29)}, StandardCharsets.UTF_8));
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
                    NLoginCore_481.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ҰӤӘҵӧӠӼӛӠӟӀӎӰӿӀӇӟӼӭӢӻԊӫӾӈԑӾӬӣӕӘԋ", (byte)68, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_481.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ĶŪŞĻŭŦƂšŦťņŔŶƅņōťƂųŨƁƍŕųŪŏƑųŜƒƎƞ", (byte)68, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_481.var_java_lang_String_arr_b[0] = NLoginCore_004.D("ӌҺҹӵӾәӺӑӟӘԀӴӁԅӷөӦӼԌԄԄӨԌӨӞӛԇӵӎӿӰԘ", (byte)68, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_481.var_java_lang_String_arr_b[0] = NLoginCore_027.E("ՉՌՏէԳձ՟՟ՔլՕւփՒեջ՝Չռփպն՜ռ֑ըՓ֑րի֋֊", (byte)68, 69);
                }
            }
        }
    }

    @Generated
    public String ax() {
        return this.cb;
    }

    @Generated
    public void a(NLoginCore_454 NLoginCore_4542) {
        this.var_com_nickuc_login_NLoginCore_454_a = NLoginCore_4542;
    }

    @Generated
    public WrapperLoginClientLoginStart com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a() {
        return this.var_com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a;
    }

    @Nullable
    @Generated
    public byte[] d() {
        return this.f;
    }

    @Generated
    public String ay() {
        return this.cc;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0x1000000 >>> 216 | 0x1000000 << ~216 + 1;
        var_int_c = (0 >>> 179 | 0 << -179) & 0xFFFFFFFF;
        d = Long.reverse(8253171242719629439L);
        var_long_e = Long.reverse(0x6600000000000000L);
        var_java_lang_String_arr_a = new String[var_int_a];
        var_java_lang_String_arr_b = new String[var_int_b];
        NLoginCore_481.b();
        var_long_e = (long)NLoginCore_389.a((String)NLoginCore_481.c("㺀", (int)var_int_c, (long)(d ^ var_long_e)));
    }

    @Generated
    public NLoginCore_454 com_nickuc_login_NLoginCore_454_a() {
        return this.var_com_nickuc_login_NLoginCore_454_a;
    }

    public NLoginCore_481 a(byte[] byArray) {
        return new NLoginCore_481(this.var_com_nickuc_login_ForceRegisterConfig_e, this.cb, this.cc, this.i, this.var_com_nickuc_login_lib_packetevents_api_wrapper_login_client_WrapperLoginClientLoginStart_a, this.var_com_nickuc_login_NLoginCore_517_a, byArray);
    }

    @Nullable
    @Generated
    public NLoginCore_517 com_nickuc_login_NLoginCore_517_a() {
        return this.var_com_nickuc_login_NLoginCore_517_a;
    }
}

