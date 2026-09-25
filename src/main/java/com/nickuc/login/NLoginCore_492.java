/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_096;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
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

public class NLoginCore_492
implements NLoginInterface_003,
NLoginInterface_043 {
    private static int aa;
    private static long y;
    private static int ac;
    private static int z;
    private static int w;
    private static long v;
    private static long x;
    private static long l;
    private static long e;
    private static int i;
    private static int t;
    private static long d;
    private static long h;
    private static long p;
    private static int m;
    private static long k;
    private static int s;
    private static int q;
    private static int j;
    private static int var_int_b;
    private static long g;
    private static long u;
    private static long r;
    private static int f;
    private static long c;
    private static int n;
    private static int ab;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static int o;
    private static int var_int_a;

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0x22761D942215D3CFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(50 + 19), (byte)(46 + 37), 47, (byte)(5 + 62), 66, (byte)(65 + 2), (byte)(18 + 29), (byte)(53 + 27), (byte)(50 + 25), (byte)(61 + 6), (byte)(31 + 52), (byte)(34 + 19), (byte)(72 + 8), (byte)(51 + 46), (byte)(76 + 24), (byte)(95 + 5), (byte)(3 + 102), (byte)(30 + 80), (byte)(84 + 19)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.B("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐҠҤҌҪҬҜҠҞҜҨҰҪҟҒҵ", (byte)41, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_492.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_492.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("íďđñĕĴĬłĮýĻıĿĹĂħŉňŀņŀĕ", (byte)35, 65), NLoginCore_492.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟࢮࢲ࢚ࢸࢺࢪࢮࢬࢪࢶࢾࢸࢭࢠࣃԹ", (byte)35, 69) + string + NLoginCore_027.E("ԙ", (byte)35, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (4 >>> 193 | 4 << -193) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        d = Long.reverse(5678119429909366178L);
        e = Long.reverse(0x1400000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(5678119429909366178L);
        h = Long.reverse(0x1400000000000000L);
        i = 0 >>> 150 | 0 << ~150 + 1;
        j = 16384 >>> 173 | 16384 << ~173 + 1;
        k = Long.reverse(5678119429909366178L);
        l = Long.reverse(0x1400000000000000L);
        m = Integer.reverse(0);
        n = 6 >>> 225 | 6 << ~225 + 1;
        o = Integer.reverse(-1);
        p = Long.reverse(6542810558364501410L);
        q = (0x100000 >>> 242 | 0x100000 << ~242 + 1) & 0xFFFFFFFF;
        r = Long.reverse(6542810558364501410L);
        s = Integer.reverse(0);
        t = Integer.reverse(-1610612736);
        u = Long.reverse(5678119429909366178L);
        v = Long.reverse(0x1400000000000000L);
        w = (768 >>> 39 | 768 << ~39 + 1) & 0xFFFFFFFF;
        x = Long.reverse(5678119429909366178L);
        y = Long.reverse(0x1400000000000000L);
        z = Integer.reverse(0);
        aa = Integer.reverse(0x40000000);
        ab = Integer.reverse(-536870912);
        ac = Integer.reverse(-536870912);
        var_java_lang_String_arr_a = new String[ab];
        var_java_lang_String_arr_b = new String[ac];
        NLoginCore_492.b();
    }

    private static void b() {
        int n;
        c = 5018065350996865906L;
        long l = c ^ 0x22761D942215D3CFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(37 + 32), (byte)(58 + 25), (byte)(37 + 10), (byte)(26 + 41), (byte)(62 + 4), (byte)(49 + 18), (byte)(14 + 33), (byte)(24 + 56), 75, (byte)(52 + 15), 83, (byte)(18 + 35), (byte)(77 + 3), (byte)(93 + 4), (byte)(2 + 98), (byte)(97 + 3), (byte)(25 + 80), (byte)(19 + 91), (byte)(27 + 76)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_492.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ӳӞӊӵӠӖԁӖԆԋԏԋԍӱөӽӡԁӳӠӰԜԆԡԘӺԈԬԜԙԍԣԳӰӦӱӶӱԃԶӷӷԇӳԌԱԲԒԪԎӽӽԜԓԞԩԇԘՈԮԩԯԸԝ", (byte)76, 68);
                    NLoginCore_492.var_java_lang_String_arr_b[1] = NLoginCore_027.B("ŦƏũŲƋƔŢƃƙřƉŖūƝŷŞŗƢơƐŵŠƙƇŨűƈŤƦƉƙƩƙƒƜƤŽƤƃũƠƆƅƃƻƙŸŸƔƳƭžƌƯƘƤƳƟƓƶƿƽƣƋ", (byte)76, 66);
                    NLoginCore_492.var_java_lang_String_arr_b[2] = NLoginCore_559.E("բՍԹդՏՅհՅյպվգխքջ՜կ։վ֕֎ՍՖֈդֆ՛ֆոկՙ֟ց֓տՖ֜ռ֐ճե֗րդ֪֚֏֏պִ֪֐֎֑֕֐֙֔մֵ֛մ֑֣֢֦֘֒֞֝տ֖֣֪֩֞ֆֈ֎ֿׅ֪֭֮־ֶ֡א׉֧֔ם֙֘לְֲָֹפנלדֵׇֹ֤ז׬ַׅ׍֬ׄנֽ׳׫גֱ׌׻ח׭יוװ־׵׏ּײפֽ׆בץ״׿םן׿׈׋ץ؇׫؁׌׮כל", (byte)76, 69);
                    NLoginCore_492.var_java_lang_String_arr_b[3] = NLoginCore_138.A("ƊůƀŌŨůőšƋƅőş", (byte)76, 65);
                    NLoginCore_492.var_java_lang_String_arr_b[4] = NLoginCore_110.D("ӚӱӟԏӧԖӭӱԂӫӰӡ", (byte)76, 68);
                    NLoginCore_492.var_java_lang_String_arr_b[5] = NLoginCore_223.F("բՍԹդՏՅհՅյպվեշՌխչՠֆՎ՝յըշֈձ։֍֚՛՚֠ձ՘ր֢՝դտֆ֧֚վժհ", (byte)76, 70);
                    NLoginCore_492.var_java_lang_String_arr_b[6] = NLoginCore_091.F("բԺՏՐՔՒրՐղՁՁ֋յէփՐՑՌ֒։ճծ՛՜", (byte)76, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_492.var_java_lang_String_arr_b[0] = NLoginCore_091.B("űŜňųŞŔſŔƄƉƍƉƋůŧŻşſűŞŮƚƄƟƖŸƆƪƚƗƋơƱŮŤůŴůƁƴŵŵƅűƊƯưƐƨƌŻŻƚƒƒƽƿǀƷƗƛƾǎƨǌƪƐƪǒǒƓǀơǁƙƟ", (byte)76, 66);
                    NLoginCore_492.var_java_lang_String_arr_b[1] = NLoginCore_384.B("ŦƏũŲƋƔŢƃƙřƉŖūƝŷŞŗƢơƐŵŠƙƇŨűƈŤƦƉƙƩƙƒƜƤŽƤƃũƠƆƅƃƻƙŸŸƔƳƭžƌƱƃƾźƴƳǂƇƷƛƿ", (byte)76, 66);
                    NLoginCore_492.var_java_lang_String_arr_b[2] = NLoginCore_110.B("űŜňųŞŔſŔƄƉƍŲżƓƊūžƘƍƤƝŜťƗųƕŪƕƇžŨƮƐƢƎťƫƋƟƂŴƦƏųƹƩƞƞƉƹǃƟƝƠƤƟƨƣƃǄƪƃƠƧơƲƭƱƬƵƎƥƲƹƸƭƕƗƝƽǔǎƼƹǍưǅǟǘƣƶǬƨƧǫǈǁƿǇǳǯǫǢǈƳǄǖǥǻǔǆǜƻǓǯǌȂǺǡǀǛȊǦǼǨǤǿǍȄǞǋȁǳǌǕǠǴȃȍǷǖȐǗǱǶȁǱǫǮȄǯǼǻȊǢǦȀȡǦȠ", (byte)76, 66);
                    NLoginCore_492.var_java_lang_String_arr_b[3] = NLoginCore_110.A("ňŇƒŭōƕũƇŹƒŪş", (byte)76, 65);
                    NLoginCore_492.var_java_lang_String_arr_b[4] = NLoginCore_201.F("աՕդԿԼՀշՒ՜՟օՐ", (byte)76, 70);
                    NLoginCore_492.var_java_lang_String_arr_b[5] = NLoginCore_324.D("ӳӞӊӵӠӖԁӖԆԋԏӶԈӝӾԊӱԗӟӮԆӹԈԙԂԚԞԫӬӫԱԂӪӱԨԍӬԀӶԋԈԨԗԊԫԨԑՀԂԿԠӽԽՅԌԍ", (byte)76, 68);
                    NLoginCore_492.var_java_lang_String_arr_b[6] = NLoginCore_201.A("űŉŞşţšƏşƁŐŐũŽƒśŖƝźƌƑƚŭŪū", (byte)76, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_492.var_java_lang_String_arr_b[0] = NLoginCore_027.B("šşƋŤŽŤňƕŲźŕş", (byte)76, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_492.var_java_lang_String_arr_b[0] = NLoginCore_387.F("աՀդւՄմվփՖՂՉզտՋզՙՠբ՟է֔֔՛՜", (byte)76, 70);
                }
            }
        }
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c) {
            return;
        }
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        if (!channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c)) {
            return;
        }
        NLoginCore_096 NLoginCore_0962 = (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get();
        if (NLoginCore_0962 == null) {
            return;
        }
        if (NLoginCore_0962.var_byte_f == var_int_a) {
            channel.attr((AttributeKey)NLoginCore_096.var_long_c).set(null);
            BCryptHashProvider.a(NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d);
            NLoginCore_370.c((String)NLoginCore_492.c("㺀", (int)var_int_b, (long)(d ^ e)) + (Object)((Object)BCryptHashProvider.com_nickuc_login_NLoginCore_175_a()) + (String)NLoginCore_492.c("㺃", (int)f, (long)(g ^ h)), new Object[i]);
            NLoginCore_370.c((String)NLoginCore_492.c("㺆", (int)j, (long)(k ^ l)) + ((NLoginCore_474)NLoginCore_532.al.java_lang_Object_a()).a()[m] + (String)NLoginCore_492.c("㺉", (int)(n & o), (long)p) + (Object)((Object)NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d) + (String)NLoginCore_492.c("㺌", (int)q, (long)r), new Object[s]);
            NLoginCore_370.c((String)NLoginCore_492.c("㺏", (int)t, (long)(u ^ v)) + (Object)((Object)NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d) + (String)NLoginCore_492.c("㺒", (int)w, (long)(x ^ y)), new Object[z]);
        }
    }

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c) {
            return;
        }
        Channel channel = (Channel)packetSendEvent.getChannel();
        if (!channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c)) {
            return;
        }
        NLoginCore_096 NLoginCore_0962 = (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get();
        if (NLoginCore_0962 == null) {
            return;
        }
        NLoginCore_0962.var_byte_f = (byte)aa;
    }
}

