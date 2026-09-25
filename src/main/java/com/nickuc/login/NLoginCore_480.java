/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_018;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.TimerTask;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_480
extends TimerTask {
    private static long g;
    private static int var_int_c;
    private static long d;
    private static int i;
    private static long e;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_b;
    final /* synthetic */ NLoginType_018 var_com_nickuc_login_NLoginType_018_b;
    private static int var_int_b;
    final /* synthetic */ NLoginCore_277 var_com_nickuc_login_NLoginCore_277_a;
    private static int h;
    private static int f;

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = (0 >>> 60 | 0 << -60) & 0xFFFFFFFF;
        var_int_c = 0 >>> 244 | 0 << ~244 + 1;
        d = Long.reverse(7829866777571045355L);
        e = Long.reverse(-6485183463413514240L);
        f = (4 >>> 162 | 4 << ~162 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-3843463456573280277L);
        h = Integer.reverse(0x40000000);
        i = (1 >>> 31 | 1 << -31) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[h];
        var_java_lang_String_arr_b = new String[i];
        NLoginCore_480.b();
    }

    private static String a(int n, long l) {
        l ^= 0x65L;
        l ^= 0xF1698C0E3284BA26L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(63 + 6), (byte)(4 + 79), (byte)(19 + 28), (byte)(17 + 50), (byte)(6 + 60), (byte)(4 + 63), (byte)(28 + 19), 80, 75, (byte)(52 + 15), (byte)(11 + 72), (byte)(29 + 24), (byte)(2 + 78), (byte)(24 + 73), (byte)(55 + 45), (byte)(64 + 36), (byte)(74 + 31), (byte)(13 + 97), (byte)(60 + 43)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ёўѝРѠќїѠѫњЧѥѩѢѥѫЭ޷߃ުߊޖ߀޿߆޼߅ߑ޳", (byte)19, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_480.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    NLoginCore_480(NLoginType_018 NLoginType_018, NLoginCore_277 NLoginCore_277) {
        this.var_com_nickuc_login_NLoginType_018_b = NLoginType_018;
        this.var_com_nickuc_login_NLoginCore_277_a = NLoginCore_277;
    }

    private static void b() {
        int n;
        var_long_c = -2885536524976089802L;
        long l = var_long_c ^ 0xF1698C0E3284BA26L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(47 + 22), 83, (byte)(6 + 41), (byte)(42 + 25), (byte)(43 + 23), (byte)(35 + 32), (byte)(6 + 41), (byte)(31 + 49), (byte)(63 + 12), 67, (byte)(52 + 31), (byte)(47 + 6), (byte)(13 + 67), (byte)(61 + 36), (byte)(89 + 11), (byte)(12 + 88), (byte)(24 + 81), (byte)(109 + 1), (byte)(83 + 20)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(47 + 36)}, StandardCharsets.UTF_8));
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
                    NLoginCore_480.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՐՔԤԿԖԲՒԲԻԷԛԞԵՎԗԬԭՌեեզՅեՉՂդգբՅեՈԫՀՎկժճԯՊդԱխիհյշԷ՘ՌՎԷջՔճֆճշօգփըե՛ւբՌ֍օ֎ֆչգ՗՜Տՙոՙւ֊ջձղ֤֤֪֗֒֌իռ֥֢֩֞ղ֝֟յֱցձշ֎ֳִֺֻֿ֚֮֔֜սֱ֐չ׀׊֪֢֞֨օֽ֘׊֚֌ֶ֦׏֬֗֘׉הֺֻֽ֖֚֮֨ןִָּ֜וסֿ׫ׇ׃ׂ׆יֽרלת׌זֵׁׯׇֺ׶םג׻׻؀׽ךגװ؅ׄ׆ךׂקתש؏׌עכא׻װ؈ؖבט׮ؑףד׹ؐ؀טؙםؑؔ׶ץ׺׾ןئ؂؈ثءؤخ،ء؃؋ءرؖ؉اػؑ؛ثؕػطؙجثؔنؗ׹ؤ؍", (byte)9, 70);
                    NLoginCore_480.var_java_lang_String_arr_b[1] = NLoginCore_387.E("ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՋՇՒԯՒԕԴՑԧԽԾՔԗԶՍՑԣ՘ԗՀ՛ԥԵգԷԺԺխԨ՝Աէՠ՝դբՇըձՎշխԸծլսԹմՓկշԽ՜՝բՙ՟թՙթՊքՎ֏֏֒դղլժ֌֚գդ՘֓լ֜֍֘շ֝մ֣֛֨֞ղշ֧֙֘կ֣֭օհռ֍ֳ֡֨֔մ֙֘֝֊որչց֛֖֟׃֔օ׆ָֹւ׀ֆ֥׎֤׈֭ה֢׃ז֪ד׆בא׏֦֗׍֜יףֻאֱסטׅ׉ךיפ׈װפׁ׊הפֱ׌֮וה׻׫ֳם׿נמ׽לנװ־׳ֽוס׀׋׻׻ן؆׭׍؍סؑץ׈׿ט؁׷؈׷םקؐןם؍׾׮ؕ؂ؚ׵׸؃׵؟؁ؠ׾ذج؈׻׸׹", (byte)9, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_480.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ԧԌӽӻԐԛԂӼԤԻԸԁԓԬԙՀՆԉԣԡԎՐՔԤԿԖԲՒԲԻԷԛԞԵՎԗԬԭՌեեզՅեՉՂդգբՅեՈԫՀՎկժճԯՊդԱխիհյշԷ՘ՌՎԷջՔճֆճշօգփըե՛ւբՌ֍օ֎ֆչգ՗՜Տՙոՙւ֊ջձղ֤֤֪֗֒֌իռ֥֢֩֞ղ֝֟յֱցձշ֎ֳִֺֻֿ֚֮֔֜սֱ֐չ׀׊֪֢֞֨օֽ֘׊֚֌ֶ֦׏֬֗֘׉הֺֻֽ֖֚֮֨ןִָּ֜וסֿ׫ׇ׃ׂ׆יֽרלת׌זֵׁׯׇֺ׶םג׻׻؀׽ךגװ؅ׄ׆ךׂקתש؏׌עכא׻װ؈ؖבט׮ؑףד׹ؐ؀טؙםؑؔ׶ץ׺׾ןئ؂؈ثءؤخ،ء؃؋ءرؖ؉اػؑ؛ثس؜׻دتحرؑ؏ؼؠؼإ؆ؠطكغّ؊آثؘؙ", (byte)9, 70);
                    NLoginCore_480.var_java_lang_String_arr_b[1] = NLoginCore_223.B("óØÉÇÜçÎÈðćĄÍßøåČĒÕïíÚėēĞûĞáĀĝóĉĊĠãĂęĝïĤãČħñāįăĆĆĹôĩýĳĬĩİĮēĴĽĚŃĹĄĺĸŉąŀğĻŃĉĨĩĮĥīĵĥĵĖŐĚśśŞİľĸĶŘŦįİĤşĸŨřŤŃũŀůŴŧŪľŃťųŤĻůŹőļňřſŭŴŠŀťŤũŖńŌŅōŧŢūƏŠőƒƅƄŎƌŒűƚŰƔŹƠŮƏƢŶƟƒƝƜƛŲţƙŨƥƯƇƜŽƭƤƑƕƦƥưƔƼưƍƖƠưŽƘźơƠǇƷſƩǋƬƪǉƨƬƼƊƿƉơƭƌƗǇǇƫǒƹƙǙƭǝƱƔǋƤǍǃǔǃƩƳǜƫƩǙǊƺǡǎǦǁǃƨǤǏǧǗǄǨǹǯǇǄǅ", (byte)9, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_480.var_java_lang_String_arr_b[0] = NLoginCore_173.E("ԦԠԔԝԍԷԕՅӽԀԔԍ", (byte)9, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_480.var_java_lang_String_arr_b[0] = NLoginCore_076.C("ЃрыЗьцнЩУфёИ", (byte)9, 67);
                }
            }
        }
    }

    @Override
    public void run() {
        NLoginCore_277 NLoginCore_277;
        int n;
        int n2 = n = NLoginType_018.com_nickuc_login_lib_caffeine_cache_Cache_a(this.var_com_nickuc_login_NLoginType_018_b).asMap().remove(this.var_com_nickuc_login_NLoginCore_277_a) != null ? var_int_a : var_int_b;
        if (n == 0 && this.var_com_nickuc_login_NLoginCore_277_a.equals(NLoginCore_277 = NLoginType_018.com_nickuc_login_bukkit_nLoginBukkit_a(this.var_com_nickuc_login_NLoginType_018_b).java_lang_Object_b().a(this.var_com_nickuc_login_NLoginCore_277_a.java_util_UUID_a()))) {
            this.var_com_nickuc_login_NLoginCore_277_a.a((String)(NLoginCore_150.j() ? NLoginCore_480.c("㺀", (int)var_int_c, (long)(d ^ e)) : NLoginCore_480.c("㺃", (int)f, (long)g)));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_480.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.D("ҠӂӄҤӈӧӟӵӡҰӮӤӲӬҵӚӼӻӳӹӳӈ", (byte)65, 68), NLoginCore_480.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ŤűŰĳųůŪųžŭĺŸżŵŸžŀӊӖҽӝҩӓӒәӏӘӤӆŘ", (byte)65, 65) + string + NLoginCore_027.E("Է", (byte)65, 69) + methodType.toString(), exception);
        }
    }
}

