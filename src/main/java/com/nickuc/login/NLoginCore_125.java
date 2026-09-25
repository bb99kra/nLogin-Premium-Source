/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.types.AccountData
 *  com.nickuc.login.lib.json.JSONArray
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginType_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginInterface_019;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_125
implements NLoginInterface_019<List<AccountData>> {
    private static int i;
    private static long d;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int var_int_b;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_a;
    public static NLoginCore_125 var_com_nickuc_login_NLoginCore_125_a;
    private static int e;
    private static int var_int_a;
    private static long g;
    private static int j;
    private static int h;

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(-1);
        d = Long.reverse(-1491087312301745955L);
        e = (64 >>> 134 | 64 << -134) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        g = Long.reverse(-1491087312301745955L);
        h = 0 >>> 244 | 0 << ~244 + 1;
        i = Integer.reverse(0x40000000);
        j = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_125.b();
        var_com_nickuc_login_NLoginCore_125_a = new NLoginCore_125();
    }

    private static String a(int n, long l) {
        l ^= 0x73L;
        l ^= 0x1F6C2BED13EF65C5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(50 + 19), (byte)(24 + 59), (byte)(14 + 33), 67, (byte)(52 + 14), (byte)(31 + 36), (byte)(36 + 11), (byte)(20 + 60), (byte)(57 + 18), (byte)(45 + 22), (byte)(30 + 53), (byte)(36 + 17), (byte)(29 + 51), (byte)(19 + 78), 100, (byte)(74 + 26), (byte)(26 + 79), (byte)(57 + 53), (byte)(99 + 4)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("Ց՞՝Ԡՠ՜՗ՠի՚ԧեթբեիԭࢢࣄࢪࢷࢩࢭࢿ࣍ࢪ࣌", (byte)50, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_125.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = -4964773653114162524L;
        long l = var_long_c ^ 0x1F6C2BED13EF65C5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(13 + 56), (byte)(61 + 22), (byte)(46 + 1), (byte)(62 + 5), (byte)(48 + 18), (byte)(50 + 17), (byte)(18 + 29), 80, (byte)(73 + 2), (byte)(45 + 22), (byte)(30 + 53), (byte)(12 + 41), 80, (byte)(36 + 61), (byte)(16 + 84), (byte)(9 + 91), (byte)(28 + 77), (byte)(45 + 65), (byte)(74 + 29)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_125.var_java_lang_String_arr_b[0] = NLoginCore_138.D("շ֡֔մ֙շևֈ֜֞քևִ֚֫֏լִַ֬հ֨տր", (byte)125, 68);
                    NLoginCore_125.var_java_lang_String_arr_b[1] = NLoginCore_453.A("ǄǮǡǁǦǄǔǕǩǫǑǔǧǸȁǜƹǹȄȁƽǵǌǍ", (byte)125, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_125.var_java_lang_String_arr_b[0] = NLoginCore_004.C("շ֡֔մ֙շևֈ֜֞ք֠թդ֤ի֬֗փְָ֑տր", (byte)125, 67);
                    NLoginCore_125.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ǄǮǡǁǦǄǔǕǩǫǓǖưƻȁǠǂǼǢǍǳǟǌǍ", (byte)125, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_125.var_java_lang_String_arr_b[0] = NLoginCore_324.C("չ՝քֆջյգջյև֎֌֠ժռժց֧ձֺ֦֣ֈ֒֔։֊ֹׂ֝֘֠", (byte)125, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_125.var_java_lang_String_arr_b[0] = NLoginCore_027.B("ǧǐƮǖǲǏǳǙǆǮƻǖǩƼǸǭƸǴǯƻȁǸǕǓǗǙǴȅǛȎȑȁ", (byte)125, 66);
                }
            }
        }
    }

    @Override
    public List<AccountData> a(@Nonnull JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray((String)NLoginCore_125.c("㺀", (int)(e & f), (long)g));
        AccountData[] accountDataArray = new AccountData[jSONArray.length()];
        for (int i = h; i < accountDataArray.length; ++i) {
            accountDataArray[i] = NLoginType_003.var_com_nickuc_login_NLoginType_003_a.a(jSONArray.getJSONObject(i));
        }
        return NLoginCore_135.a(accountDataArray);
    }

    @Override
    public Class<?> a() {
        return List.class;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_125.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.A("ĭŏőıŕŴŬƂŮĽŻűſŹłŧƉƈƀƆƀŕ", (byte)67, 65), NLoginCore_125.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("բկծԱձխըձռիԸնպճնռԾࢳࣕࢻࣈࢺࢾ࣐ࣞࢻࣝՔ", (byte)67, 70) + string + NLoginCore_091.B("Ŀ", (byte)67, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public JSONObject a(@Nonnull List<AccountData> list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i = var_int_a; i < list.size(); ++i) {
            jSONArray.put(i, (Object)NLoginType_003.var_com_nickuc_login_NLoginType_003_a.a(list.get(i)));
        }
        jSONObject.put((String)NLoginCore_125.c("㺀", (int)(var_int_b & var_int_c), (long)d), (Object)jSONArray);
        return jSONObject;
    }
}

