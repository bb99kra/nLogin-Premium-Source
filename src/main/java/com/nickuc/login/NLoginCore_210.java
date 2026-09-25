/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_365;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_210 {
    private static long e;
    private static int h;
    private static long d;
    private static int j;
    private static int f;
    private static int var_int_a;
    private final Object[] var_java_lang_Object_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static int i;
    private final String Z;
    private static int var_int_b;
    private static long c;
    private static long g;
    private static String[] var_java_lang_String_arr_b;

    public long long_a(NLoginCore_459 NLoginCore_459) {
        try (NLoginCore_365 NLoginCore_3652 = NLoginCore_459.com_nickuc_login_NLoginCore_365_a();){
            long l;
            block14: {
                PreparedStatement preparedStatement = NLoginCore_3652.b().prepareStatement(this.Z, var_int_a);
                try {
                    NLoginCore_459.a(preparedStatement, this.var_java_lang_Object_arr_a);
                    int n = preparedStatement.executeUpdate();
                    if (n == 0) {
                        throw new RuntimeException((String)NLoginCore_210.c("㺀", (int)var_int_b, (long)(d ^ e)) + n);
                    }
                    ResultSet resultSet = preparedStatement.getGeneratedKeys();
                    if (!resultSet.next()) {
                        throw new SQLException((String)NLoginCore_210.c("㺃", (int)f, (long)g));
                    }
                    l = resultSet.getLong(h);
                    if (preparedStatement == null) break block14;
                }
                catch (Throwable throwable) {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                preparedStatement.close();
            }
            return l;
        }
    }

    static {
        var_int_a = (0x2000000 >>> 153 | 0x2000000 << ~153 + 1) & 0xFFFFFFFF;
        var_int_b = (0 >>> 102 | 0 << -102) & 0xFFFFFFFF;
        d = Long.reverse(-3573723020870811392L);
        e = Long.reverse(-6052837899185946624L);
        f = 0x1000000 >>> 24 | 0x1000000 << -24;
        g = Long.reverse(7090800896742523136L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0x40000000);
        j = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_210.b();
    }

    @CheckReturnValue
    public NLoginCore_218<ResultSet> a(NLoginCore_459 NLoginCore_459) {
        return NLoginCore_459.com_nickuc_login_NLoginCore_171_a(this.Z, this.var_java_lang_Object_arr_a);
    }

    private static void b() {
        int n;
        c = 36093612834547315L;
        long l = c ^ 0x637736465007EFD2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(27 + 42), 83, (byte)(36 + 11), (byte)(37 + 30), (byte)(5 + 61), (byte)(16 + 51), 47, (byte)(63 + 17), (byte)(8 + 67), (byte)(39 + 28), (byte)(47 + 36), (byte)(35 + 18), (byte)(3 + 77), (byte)(18 + 79), (byte)(58 + 42), (byte)(97 + 3), (byte)(39 + 66), (byte)(84 + 26), (byte)(31 + 72)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(50 + 33)}, StandardCharsets.UTF_8));
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
                    NLoginCore_210.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ԧԼՋԾ՛աՒըԾԪՄՊթՈՒՃոՊժչՌԷՙղիտՠՆգՓց՜ֈգ՜Շ։ց՞հւՎթղբժշնՖըեֈսՠ՗֐մծ՗ջ֝ր֪ֈ", (byte)54, 70);
                    NLoginCore_210.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ĠĵńķŔŚŋšķģĻōūŏĻĥŔľňĴŃŹśœũĻŻŐĹŎƃŋŃŘƄŔŶŲŁƂřŹƅūŢőŧŒŒŐƄſšƗŞş", (byte)54, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_210.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ĠĵńķŔŚŋšķģĽŃŢŁŋļűŃţŲŅİŒūŤŸřĿŜŌźŕƁŜŕŀƂźŗũŻŇŢūśţŰůŏšŞƁŶŒƈŻŕƌƇŴƜơŴƙ", (byte)54, 66);
                    NLoginCore_210.var_java_lang_String_arr_b[1] = NLoginCore_324.F("ԧԼՋԾ՛աՒըԾԪՂՔղՖՂԬ՛ՅՏԻՊրբ՚հՂւ՗ՀՕ֊ՒՊ՟֋՛սչՈ։ՠր֍Տլ֌ծխղ֜Տ֔֋ըեզ", (byte)54, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_210.var_java_lang_String_arr_b[0] = NLoginCore_223.B("ōĺĞšļĶŁīŬĺĶŊİĬūŝŮŢŭŠřŭŏŲŽžŕŠƁŒĴŻ", (byte)54, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_210.var_java_lang_String_arr_b[0] = NLoginCore_446.E("ԡԤՙԾ՚ՋձԯՃմզէՆէաԸՎչԹէ՞վՅՆ", (byte)54, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0x637736465007EFD2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(46 + 37), (byte)(18 + 29), 67, (byte)(37 + 29), (byte)(42 + 25), (byte)(6 + 41), (byte)(47 + 33), (byte)(35 + 40), (byte)(45 + 22), (byte)(70 + 13), (byte)(24 + 29), (byte)(13 + 67), (byte)(81 + 16), (byte)(33 + 67), (byte)(31 + 69), (byte)(78 + 27), (byte)(25 + 85), (byte)(44 + 59)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(55 + 28)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.B("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӳӆӇӱӣӦӋӔӴӭӧӐӞӝ", (byte)77, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_210.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_210.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.E("ӷԙԛӻԟԾԶՌԸԇՅԻՉՃԌԱՓՒՊՐՊԟ", (byte)19, 69), NLoginCore_210.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.E("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢩࡼࡽࢧ࢙࢜ࢁࢊࢪࢣ࢝ࢆ࢔࢓Ԩ", (byte)19, 69) + string + NLoginCore_427.B("ß", (byte)19, 66) + methodType.toString(), exception);
        }
    }

    public boolean boolean_a(NLoginCore_459 NLoginCore_459) {
        return NLoginCore_459.a(this.Z, this.var_java_lang_Object_arr_a).d();
    }

    public int int_a(NLoginCore_459 NLoginCore_459) {
        return NLoginCore_459.b(this.Z, this.var_java_lang_Object_arr_a).d();
    }

    @Generated
    public NLoginCore_210(String string, Object[] objectArray) {
        this.Z = string;
        this.var_java_lang_Object_arr_a = objectArray;
    }
}

