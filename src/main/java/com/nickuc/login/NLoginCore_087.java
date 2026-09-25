/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.citizensnpcs.api.CitizensAPI
 *  org.bukkit.entity.Entity
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
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
import net.citizensnpcs.api.CitizensAPI;
import org.bukkit.entity.Entity;

public class NLoginCore_087 {
    private static int var_int_b;
    private static int l;
    private static int j;
    private boolean G = var_int_a;
    private static int k;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static String[] var_java_lang_String_arr_a;
    private static int g;
    private static int var_int_c;
    private static int f;
    private static int var_int_a;
    private static int e;
    private static long i;
    private static int m;
    private static int h;
    private static long d;

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 93 | 0 << ~93 + 1;
        var_int_c = Integer.reverse(0);
        d = Long.reverse(-2769929339290368018L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (0 >>> 186 | 0 << -186) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Integer.reverse(-1);
        i = Long.reverse(-2769929339290368018L);
        j = Integer.reverse(0);
        k = 0 >>> 27 | 0 << ~27 + 1;
        l = Integer.reverse(0x40000000);
        m = (0x8000000 >>> 186 | 0x8000000 << ~186 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_087.b();
    }

    private static void b() {
        int n;
        var_long_c = 8638560977188352451L;
        long l = var_long_c ^ 0xDC5668536BE1B1D4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(81 + 2), (byte)(26 + 21), (byte)(43 + 24), (byte)(62 + 4), (byte)(32 + 35), (byte)(44 + 3), (byte)(42 + 38), (byte)(37 + 38), 67, (byte)(24 + 59), (byte)(10 + 43), (byte)(46 + 34), (byte)(70 + 27), (byte)(24 + 76), (byte)(41 + 59), (byte)(3 + 102), (byte)(57 + 53), (byte)(19 + 84)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
                    NLoginCore_087.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ҝҟӂ҃ґұҕҚ҄ҢҵҢҌӏҞӂҨӃӇӉҞғӂҊӉґӕҤӊҗӒӈҩӂҢӕӀҿҢӡҧӡҪӞҬҺӉҢӊӠӤӬӞӊӊӁӕӦӜӯӮӻҿӠӬӐԀӷҷӰӥәӲӄӪӤӪԌӆӛԀӲԂӪӧԊԇԄӱԉӴӥԋԛӾԡөӼԑԁӞԚәӾӣԫԡӰ", (byte)49, 68);
                    NLoginCore_087.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ĶĸśĜĪŊĮĳĝĻŎĻĥŨķśŁŜŠŢķĬśģŢĪŮĽţİūšłśĻŮřŘĻźŀźŃŷŅœŢĻţŹŽƅŷťƋŚƑōƀŰŬšƒƏŭƗřƗŷŖŠŚŽƖŷžƂƣƣťƆƛƃźơƪƁƌƍųƥŰƧƈƩƩƣƔưƳƇƹƙƟƘƮǂƕƝƛƵƺƙƆǅǀƠƧƔƕ", (byte)49, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_087.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ҝҟӂ҃ґұҕҚ҄ҢҵҢҌӏҞӂҨӃӇӉҞғӂҊӉґӕҤӊҗӒӈҩӂҢӕӀҿҢӡҧӡҪӞҬҺӉҢӊӠӤӬӞӊӊӁӕӦӜӯӮӻҿӠӬӐԀӷҷӰӥәӲӄӪӤӪԌӆӛԀӲԂӪӧԊԇԄӱԉӴӥԋԛӾԡӚԕӛӭӛӷӞԤӳԈԃӰ", (byte)49, 67);
                    NLoginCore_087.var_java_lang_String_arr_b[1] = NLoginCore_451.E("ՂՄէԨԶՖԺԿԩՇ՚ՇԱմՃէՍըլծՃԸէԯծԶպՉկԼշխՎէՇպեդՇֆՌֆՏփՑ՟ծՇկօ։֑փձ֗զ֝ՙ֌ռոխ֛֞չ֣ե֣փբլզ։֢փ֊֎֯֯ձ֧֒֏ֆֶ֭֍֘֙տֱռֳֵֵֺּֿׅ֥֤֔֯֠֓֫א׎֡֊ׇ׎ֵׇ֣֬֬֫֠֡", (byte)49, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_087.var_java_lang_String_arr_b[0] = NLoginCore_092.F("ԺդԲ՞ՠ՗ԶԦԤ՞ԩԱՄ՞՞ՄՇՋՒեՑՃՀՁ", (byte)49, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_087.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ҁѻҳҌҕґҔґҵӋқҐ", (byte)49, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_087.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.D("҂ҤҦ҆ҪӉӁӗӃҒӐӆӔӎҗҼӞӝӕӛӕҪ", (byte)55, 68), NLoginCore_087.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.E("Ֆգբԥեա՜եհ՟ԬժծէժհԲࢸࢿ࣋ࢹࢮࢲࢻ࣒ࢵࢿՈ", (byte)55, 69) + string + NLoginCore_138.C("Ҕ", (byte)55, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0xDC5668536BE1B1D4L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(16 + 53), (byte)(76 + 7), (byte)(18 + 29), (byte)(43 + 24), (byte)(18 + 48), (byte)(30 + 37), (byte)(38 + 9), (byte)(9 + 71), (byte)(47 + 28), (byte)(20 + 47), 83, (byte)(15 + 38), 80, (byte)(84 + 13), (byte)(90 + 10), (byte)(23 + 77), (byte)(63 + 42), (byte)(51 + 59), (byte)(21 + 82)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("ճրտՂւվչւ֍ռՉև֋քև֍Տ࣏࣯࣒ࣕࣜࣨࣖ࣋ࣘࣜ", (byte)84, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_087.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public boolean b(Entity entity) {
        if (this.G) {
            try {
                return CitizensAPI.getNPCRegistry().isNPC(entity);
            }
            catch (Throwable throwable) {
                this.G = var_int_b;
                if (throwable.getCause() instanceof ClassNotFoundException) {
                    Object[] objectArray = new Object[e];
                    objectArray[NLoginCore_087.f] = throwable.getMessage();
                    NLoginCore_370.c((String)NLoginCore_087.c("㺀", (int)var_int_c, (long)d), objectArray);
                }
                NLoginCore_370.b((String)NLoginCore_087.c("㺃", (int)(g & h), (long)i), throwable, new Object[j]);
            }
        }
        return k != 0;
    }
}

