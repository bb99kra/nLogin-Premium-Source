/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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

public class NLoginCore_256
implements NLoginCore_249,
NLoginCore_415 {
    private static int g;
    private static long i;
    private final NLoginCore_211 V;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_a;
    private static int d;
    private static int var_int_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int e;
    private static int l;
    private static long f;
    private static int k;
    private static int h;
    private static int j;

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.V;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_w, new Object[var_int_a]);
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[var_int_b];
        NLoginCore_445Array[NLoginCore_256.var_int_c] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    private static void b() {
        int n;
        var_long_c = -9167870775353203210L;
        long l = var_long_c ^ 0xA6DE4156C7FDAF44L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(61 + 7), (byte)(16 + 53), (byte)(6 + 77), (byte)(29 + 18), (byte)(58 + 9), (byte)(22 + 44), 67, (byte)(45 + 2), (byte)(10 + 70), 75, (byte)(18 + 49), (byte)(29 + 54), (byte)(49 + 4), (byte)(76 + 4), (byte)(59 + 38), (byte)(6 + 94), (byte)(20 + 80), (byte)(29 + 76), (byte)(34 + 76), (byte)(23 + 80)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(4 + 64), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_256.var_java_lang_String_arr_b[0] = NLoginCore_446.A("ŴƟƍŜƤƅŶƇŚśƈƛƖŽƉƄƐƀƣƈƤƊŶƶƑŲŰŶƏƍƚƇƈƵưƿƣƄǅƏƑǆƞƏ", (byte)84, 65);
                    NLoginCore_256.var_java_lang_String_arr_b[1] = NLoginCore_004.A("ƚƉƒƗŭƦƜſƈƑſŷŦƨŭƦŮƥƄƦƮŴƦŵƹƕųƪƕŽƻƬƳƜƒƑƻƮƮƄƒƅƕƚƨƻƦƻƾƦƑǀǏǒǇǏƩǏƵƘǘƙƹǐƟǛƚƸǎǚǟǣƱǜǟƵǇǍƠƪǝǆǪǜǌǡƬǆǒǑǄƺǗǍǛǓǷǍǌǸǀȄǠǥǖȆǖǏ", (byte)84, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_256.var_java_lang_String_arr_b[0] = NLoginCore_201.E("՝ֈնՅ֍ծ՟հՃՄձքտզղխչթ֌ձ֍ճ՟֟պ՛ՙ՟ոնփհ֊ն։յ֖֙֝ւ֢֦֢֩լ֋յֺ֣֭ճּּ֝փք", (byte)84, 69);
                    NLoginCore_256.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ԤԓԜԡӷ԰ԦԉԒԛԉԁӰԲӷ԰ӸԯԎ԰ԸӾ԰ӿՃԟӽԴԟԇՅԶԽԦԜԛՅԸԸԎԜԏԟԤԲՅ԰ՅՈ԰ԛՊՙ՜ՑՙԳՙԿԢբԣՃ՚ԩեԤՂ՘դթխԻզթԿՑ՗ԪԴէՐմզՖիԶՐ՜՛ՎՄա՗ե՝Ֆմՠդ֊ո֏֏քՓՏք֕եքխ։մպ֔Ք֝դե", (byte)84, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_256.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ӹӷԈӿԅԏӧӣԫԑԥԴӲԷԣԳԫӳԧӺԾԗԄԅ", (byte)84, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_256.var_java_lang_String_arr_b[0] = NLoginCore_004.F("՛Օ՝յ՜ֈ֎ՙ֐֒ՓՑֈ֋ծօդչփ֖մմո՟՜֟աՠ֑֙շվ", (byte)84, 70);
                }
            }
        }
    }

    @Generated
    public NLoginCore_256(NLoginCore_211 NLoginCore_211) {
        this.V = NLoginCore_211;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 0x100000 >>> 116 | 0x100000 << ~116 + 1;
        var_int_c = Integer.reverse(0);
        d = 0 >>> 34 | 0 << ~34 + 1;
        e = Integer.reverse(-1);
        f = Long.reverse(5162468837789311745L);
        g = (0 >>> 212 | 0 << ~212 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(5162468837789311745L);
        j = Integer.reverse(0);
        k = Integer.reverse(0x40000000);
        l = (4 >>> 161 | 4 << -161) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_256.b();
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().q();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_256.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԉԫԭԍԱՐՈ՞Պԙ՗Ս՛ՕԞՃեդ՜բ՜Ա", (byte)37, 70), NLoginCore_256.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.B("ĬĹĸûĻķĲĻņĵĂŀńĽŀņĈқѮѰҗҟѿҘҥҝҪҗҋѹġ", (byte)37, 66) + string + NLoginCore_384.B("ă", (byte)37, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        if (NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b) {
            try {
                this.com_nickuc_login_NLoginCore_283_a(NLoginCore_5092).f(NLoginType_008);
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_256.c("㺀", (int)(d & e), (long)f), exception, new Object[g]);
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, (String)NLoginCore_256.c("㺃", (int)h, (long)i), new Object[j]);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x14L;
        l ^= 0xA6DE4156C7FDAF44L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(29 + 40), (byte)(39 + 44), (byte)(40 + 7), (byte)(4 + 63), 66, 67, (byte)(28 + 19), (byte)(72 + 8), (byte)(61 + 14), (byte)(16 + 51), (byte)(82 + 1), (byte)(16 + 37), (byte)(41 + 39), (byte)(77 + 20), (byte)(51 + 49), (byte)(83 + 17), (byte)(17 + 88), (byte)(103 + 7), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("ռ։ֈՋ֋ևւ֋֖օՒ֐֔֍֐֖՘࣫ࢾࣀ࣯࣏࣭ࣺࣧࣨࣵࣧࣛࣉ", (byte)93, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_256.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

