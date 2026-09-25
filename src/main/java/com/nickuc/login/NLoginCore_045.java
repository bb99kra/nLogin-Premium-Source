/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.tasks.LoginMainQueueTask;
import com.nickuc.login.NLoginCore_056;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_212;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_535;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_031;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_148;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_199;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_045
implements NLoginCore_212 {
    private static int var_int_a;
    private static int var_int_b;
    private static long d;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____a;
    private static int e;
    private static int i;
    private static long f;
    private static String[] var_java_lang_String_arr_b;
    private static int k;
    private static long h;
    private static long c;
    private static int g;
    private static int j;
    private static String[] var_java_lang_String_arr_a;

    public abstract void f();

    public abstract void e();

    @Override
    public boolean boolean_a() {
        NLoginType_008 NLoginType_008 = (NLoginType_008)this.var_int_a.b();
        return NLoginCore_195.e(NLoginType_008);
    }

    static {
        var_int_a = 0 >>> 69 | 0 << -69;
        var_int_b = -1 >>> 18 | -1 << -18;
        d = Long.reverse(-5633535642304351213L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-5633535642304351213L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(-5633535642304351213L);
        i = Integer.reverse(0);
        j = (0x18000000 >>> 187 | 0x18000000 << -187) & 0xFFFFFFFF;
        k = 0x600000 >>> 213 | 0x600000 << ~213 + 1;
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_045.d();
    }

    private static void d() {
        int n;
        c = -4022190167273665611L;
        long l = c ^ 0x441CD187BCCB765BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(14 + 55), (byte)(25 + 58), (byte)(44 + 3), (byte)(22 + 45), (byte)(15 + 51), (byte)(66 + 1), (byte)(3 + 44), (byte)(62 + 18), (byte)(39 + 36), 67, (byte)(38 + 45), (byte)(33 + 20), (byte)(6 + 74), 97, (byte)(76 + 24), (byte)(65 + 35), (byte)(52 + 53), (byte)(4 + 106), (byte)(87 + 16)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_045.var_java_lang_String_arr_b[0] = NLoginCore_427.A("ƸƤǈƗƿƽǈƛǐǂƲƎơǓƕƔƶƩƜƟǟǏƦƧ", (byte)106, 65);
                    NLoginCore_045.var_java_lang_String_arr_b[1] = NLoginCore_076.A("ƺƉƺƊƌƩƞǀǆƬƮƶǕƑǄƭǑƩƿǍƬƹƦƧ", (byte)106, 65);
                    NLoginCore_045.var_java_lang_String_arr_b[2] = NLoginCore_453.F("՞ճ֍՞լկ֓ղ֡ռց֣֋֔֊֎֎֍թ֎լֲչպ", (byte)106, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_045.var_java_lang_String_arr_b[0] = NLoginCore_092.F("֋շ֛ժ֒֐֛ծ֣֕ևշֆգ֧֫լ֊օ֭ռְ֔կր֠հ֫խ֘կ֭", (byte)106, 70);
                    NLoginCore_045.var_java_lang_String_arr_b[1] = NLoginCore_027.A("ƺƉƺƊƌƩƞǀǆƬưƳƔƓƧǃƴƏƞƿƲƽǜƹǣǚǀǓƟƢǦƧ", (byte)106, 65);
                    NLoginCore_045.var_java_lang_String_arr_b[2] = NLoginCore_027.E("՞ճ֍՞լկ֓ղ֡ռփ֜ջ֧շ֚֍վէֱֲ֒չպ", (byte)106, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_045.var_java_lang_String_arr_b[0] = NLoginCore_027.D("՛ԵՖԦ՝ՅԼՔՆմՕՀՙըԲդթ՝ՑէցՉՆՇ", (byte)106, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_045.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ƪƤƶƷǆƍƝƭƵǇƮƛ", (byte)106, 66);
                }
            }
        }
    }

    @Override
    public void b() {
        NLoginType_008 NLoginType_008 = (NLoginType_008)this.var_int_a.b();
        this.e();
        NLoginCore_276 NLoginCore_2762 = NLoginType_008.com_nickuc_login_NLoginCore_276_a();
        NLoginCore_2762.r();
        NLoginCore_535.a(this.var_int_a.com_nickuc_login_NLoginCore_364_b().a(), NLoginCore_2762);
        LoginMainQueueTask.p(NLoginType_008);
        NLoginCore_187 NLoginCore_1872 = NLoginType_008.com_nickuc_login_NLoginCore_187_a();
        NLoginType_008.java_lang_Object_b().c().forEach(NLoginCore_277 -> {
            if (NLoginCore_277.S()) {
                return;
            }
            NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.a((NLoginCore_277)NLoginCore_277);
            if (NLoginCore_5092 != null) {
                NLoginType_008.com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().c((NLoginCore_277)NLoginCore_277, NLoginCore_1872.com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginCore_277));
            } else {
                NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.R, new Object[i]));
            }
        });
        NLoginCore_400.b(NLoginType_008);
        NLoginCore_148 NLoginCore_2032 = NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_203_a();
        NLoginCore_2032.a((String)NLoginCore_045.e("㺀", (int)(var_int_a & var_int_b), (long)d), NLoginType_008.com_nickuc_login_NLoginCore_495_a().long_a());
        NLoginCore_2032.a((String)NLoginCore_045.e("㺃", (int)e, (long)f), NLoginCore_150.aC());
        NLoginCore_2032.a((String)NLoginCore_045.e("㺆", (int)g, (long)h), BCryptHashProvider.com_nickuc_login_NLoginCore_036_b().name().toLowerCase(Locale.ENGLISH));
    }

    private static Object e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_045.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.B("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 66), NLoginCore_045.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.F("ՙզեԨըդ՟ըճբԯխձժխճԵࢰࢼ࣑࣒ࣆ࣑࣋ࣗࢷࢳ࣑࣎ࣉࢽࢵՐ", (byte)58, 70) + string + NLoginCore_027.B("ĭ", (byte)58, 66) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x38L;
        l ^= 0x441CD187BCCB765BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(23 + 46), (byte)(74 + 9), (byte)(14 + 33), (byte)(24 + 43), (byte)(44 + 22), (byte)(28 + 39), (byte)(12 + 35), 80, (byte)(44 + 31), (byte)(43 + 24), (byte)(66 + 17), (byte)(38 + 15), (byte)(3 + 77), (byte)(2 + 95), (byte)(14 + 86), (byte)(25 + 75), (byte)(72 + 33), (byte)(66 + 44), (byte)(73 + 30)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.B("ƌƙƘśƛƗƒƛƦƕŢƠƤƝƠƦŨӣӯԄԅӹӾԄԊӪӦԄԁӼӰӨ", (byte)85, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_045.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_045(NLoginCore_116<?> NLoginInterface_0112) {
        this.var_int_a = (int)NLoginInterface_0112;
    }

    @Override
    public NLoginCore_056 com_nickuc_login_NLoginCore_056_a() {
        return new NLoginType_031((NLoginType_008)this.var_int_a.b(), (NLoginType_010)((NLoginCore_100)this.var_int_a.b()).c());
    }

    @Override
    public void c() {
        this.f();
        NLoginType_010 NLoginType_0102 = (NLoginType_010)this.var_int_a;
        NLoginCore_199 NLoginCore_1992 = NLoginType_0102.com_nickuc_login_NLoginCore_199_a();
        if (NLoginCore_1992 != null) {
            NLoginCore_1992.c();
        }
    }
}

