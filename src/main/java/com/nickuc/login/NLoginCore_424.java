/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.nLoginAPI
 */
package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_045;
import com.nickuc.login.NLoginCore_240;
import com.nickuc.login.NLoginCore_390;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_058;
import com.nickuc.login.NLoginCore_132;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_470;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginType_013;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_266;
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

public class NLoginCore_424
extends NLoginCore_045 {
    private static int var_int_d;
    private static int am;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_a;
    private static long ad;
    private static int q;
    private static int al;
    private static long o;
    private static int t;
    private static int aj;
    private static long r;
    private static long ah;
    private static int ak;
    private static long ab;
    private static int u;
    private static long m;
    private static long ai;
    private static int x;
    private static int var_int_c;
    private static long g;
    private static long e;
    private static long v;
    private static int w;
    private static int an;
    private final NLoginCore_132 var_com_nickuc_login_NLoginCore_132_a;
    private static long y;
    private static String[] var_java_lang_String_arr_c;
    private static long ae;
    private static int ac;
    private static long aa;
    private static int h;
    private static int n;
    private static int ag;
    private static long p;
    private static int l;
    private static int af;
    private static long s;
    private static int z;
    private static String[] var_java_lang_String_arr_d;
    private static int ao;

    @Override
    public NLoginInterface_030 com_nickuc_login_NLoginInterface_030_a() {
        return new NLoginCore_058(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a, this.var_com_nickuc_login_NLoginCore_132_a);
    }

    @Override
    public void b() {
        super.b();
        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_ProxyServer_a().getConfiguration().shouldPreventClientProxyConnections()) {
            String string = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_ProxyServer_a().getVersion().getName();
            Object object = NLoginCore_424.e("㺀", (int)(var_int_c & var_int_d), (long)g);
            if (NLoginCore_150.j()) {
                NLoginCore_370.c((String)NLoginCore_424.e("㺃", (int)(h & l), (long)m) + (String)object + (String)NLoginCore_424.e("㺆", (int)n, (long)(o ^ p)) + string + (String)NLoginCore_424.e("㺉", (int)q, (long)(r ^ s)), new Object[t]);
                NLoginCore_370.c((String)NLoginCore_424.e("㺌", (int)u, (long)v), new Object[w]);
            } else {
                NLoginCore_370.c((String)NLoginCore_424.e("㺏", (int)x, (long)y) + (String)object + (String)NLoginCore_424.e("㺒", (int)z, (long)(aa ^ ab)) + string + (String)NLoginCore_424.e("㺕", (int)ac, (long)(ad ^ ae)), new Object[af]);
                NLoginCore_370.c((String)NLoginCore_424.e("㺘", (int)ag, (long)(ah ^ ai)), new Object[aj]);
            }
        }
    }

    @Override
    public void f() {
        NLoginCore_390 NLoginCore_3902 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginCore_390_a();
        NLoginCore_3902.c(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_messages_ChannelIdentifier_a());
        NLoginCore_3902.c(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_messages_ChannelIdentifier_b());
    }

    @Override
    public void e() {
        NLoginCore_390 NLoginCore_3902 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginCore_390_a();
        NLoginCore_3902.a(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_messages_ChannelIdentifier_a(), this.var_com_nickuc_login_NLoginCore_132_a);
        NLoginCore_3902.a(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_velocitypowered_api_proxy_messages_ChannelIdentifier_b(), this.var_com_nickuc_login_NLoginCore_132_a);
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.a(new NLoginCore_266(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a, this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[ak]);
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.a(new NLoginType_027(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a, this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[al]);
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.a(new NLoginCore_470(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a, this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginType_008_a()), new NLoginInterface_013[am]);
    }

    public NLoginCore_424(nLoginVelocity nLoginVelocity2) {
        super(nLoginVelocity2);
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a = nLoginVelocity2;
        this.var_com_nickuc_login_NLoginCore_132_a = new NLoginCore_132(nLoginVelocity2);
    }

    private static void d() {
        int n;
        e = -3412256736593391830L;
        long l = e ^ 0xDAE9E7AF96CB1142L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(8 + 75), (byte)(12 + 35), (byte)(45 + 22), (byte)(43 + 23), (byte)(15 + 52), (byte)(10 + 37), (byte)(47 + 33), (byte)(31 + 44), (byte)(20 + 47), (byte)(10 + 73), (byte)(38 + 15), (byte)(5 + 75), (byte)(95 + 2), (byte)(39 + 61), (byte)(11 + 89), (byte)(69 + 36), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
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
                    NLoginCore_424.var_java_lang_String_arr_d[0] = NLoginCore_091.D("҇қҾҵҸѼҩҶӂ҂ұҘҽҼҥҢҷ҆ҠүҝҦүӃӂ҆ҎӐҿҤҳұґҽҩҗҙҚҶӠҴҠҲһҠҹӉҾӗӚҫҸӁҸҵҶ", (byte)47, 68);
                    NLoginCore_424.var_java_lang_String_arr_d[1] = NLoginCore_324.D("ҩҸһҨҔҔѾҝғѻҿҰӈҚңӂҕҧӂҥҤӎҕҖ", (byte)47, 68);
                    NLoginCore_424.var_java_lang_String_arr_d[2] = NLoginCore_004.F("ԼՀՏեեաԵիՇՋ՛ԿԫդճհՌաթԮԪբճՄիՓչ՜կՌբփ՛Ց՞ևպժիՈշՖզՓ", (byte)47, 70);
                    NLoginCore_424.var_java_lang_String_arr_d[3] = NLoginCore_138.A("İĸŎĐņŊśĮĕĬěĥ", (byte)47, 65);
                    NLoginCore_424.var_java_lang_String_arr_d[4] = NLoginCore_027.C("ѺҔ҅ҸҸѻѸһґҺ҂ҿҢӀұңӇҬҍӊӉұҾҩӑӒӋҖұҴҖҸҬҰҲҲұҵӠҫҝӍӢӂӗҼӇӝҢҷһӆҼӃӫӞҲӯӑӗӬӪӁӌӧӏӾӇӳҲӒԁҹӕӅӞӀӹӽԋӗӶԋӚӘӯԋӜԇӑӬԅӱӭӖԗәӺӵӬԊԉәӶӺԥӽӵӣԠԔԘԝԭԬӭԙӻӯԟԆԬԋԡөԘӵԚԈԛԗԌӷԛԶԟԤԙԔԿԆԛԃԩԝՄԋՊԭԾՍԝԳՕԏՄՇԳԷՉ", (byte)47, 67);
                    NLoginCore_424.var_java_lang_String_arr_d[5] = NLoginCore_138.A("ŉıĶōĦĖĽřŘđŁŝōěĢļŐğļśŋũİı", (byte)47, 65);
                    NLoginCore_424.var_java_lang_String_arr_d[6] = NLoginCore_324.C("ҷҚҏҟҶҕҎ҂ѵҖҴһұѺңӉҞһӀӆҢүҬӊҤӂ҇ҏҥӃҘҵ", (byte)47, 67);
                    NLoginCore_424.var_java_lang_String_arr_d[7] = NLoginCore_324.D("Һ҅ѻѰ҉ҳқҺҜҕѻңҟ҃Ҷӈ҉ӋҕӎҧӎҕҖ", (byte)47, 68);
                    NLoginCore_424.var_java_lang_String_arr_d[8] = NLoginCore_138.F("ԻՁԹԿԺՒՈԹԤԶԺլձըաԲՉՄՊԿկԸԬՉՕՈԹՑըբլԹգտՂ՞ջև՚փֆխ։֎ջ֑֎ե֏ֆ՟հօՓ։։ձէղՑցշմկվդնղ֤ազճ֋շը֬կ֐թִ֨ֆխշ֣ֆֻ֓֊ּ֟սֶր֮յ֛֭֚֒֟֗֘ֆֺ֞֡օֻ֥גה֪֪׎ֲֶ֮֫ל֬׌טֳ֖֜׏ֽ", (byte)47, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_424.var_java_lang_String_arr_d[0] = NLoginCore_110.A("ĢĶřŐœėńőŝĝŌĳŘŗŀĽŒġĻŊĸŁŊŞŝġĩūŚĿŎŌĬŘńĲĴĵőŻŏĻŌŮŰŵťŎſŚŴŦƃţŐő", (byte)47, 65);
                    NLoginCore_424.var_java_lang_String_arr_d[1] = NLoginCore_110.F("ՒադՑԽԽԧՆԼԤթ՟ԾՈԬՒՕհՇ՘ՐՁԾԿ", (byte)47, 70);
                    NLoginCore_424.var_java_lang_String_arr_d[2] = NLoginCore_110.D("ғҗҦҼҼҸҌӂҞҢҲҖ҂һӊӇңҸӀ҅ҁҹӊқӂҪӐҳӆңҹӚҸӔҗӚґӊҝҲӃҢӕӀҡӥҧҵӄӡӊӁӢӮҵҶ", (byte)47, 68);
                    NLoginCore_424.var_java_lang_String_arr_d[3] = NLoginCore_138.C("҅ҴѽѷѾҠҹҞҌҶҥҊ", (byte)47, 67);
                    NLoginCore_424.var_java_lang_String_arr_d[4] = NLoginCore_027.B("ĕįĠœœĖēŖĬŕĝŚĽśŌľŢŇĨťŤŌřńŬŭŦıŌŏıœŇŋōōŌŐŻņĸŨŽŝŲŗŢŸĽŒŖšŗŞƆŹōƊŬŲƇƅŜŧƂŪƙŢƎōŭƜŔŰŠŹśƔƘƦŲƑƦŵųƊƦŷƢŬƇƠƌƈűƲŴƕƐƇƥƤŴƑƕǀƘƐžƻƯƳƸǈǇƈƴƖƊƺơǇƦƼƄƳƐƵƣƶƲƧƒƶǑƺƿƴƯǚơƶƞǄƸǟƦǥǈǣƩǀǞƨǭƿǏǪǟƴ", (byte)47, 66);
                    NLoginCore_424.var_java_lang_String_arr_d[5] = NLoginCore_575.A("ŉıĶōĦĖĽřŘđňğĘĲğłĞĲŜŖĻŃİı", (byte)47, 65);
                    NLoginCore_424.var_java_lang_String_arr_d[6] = NLoginCore_027.B("ŒĵĪĺőİĩĝĐıŏŖŌĕľŤĹŖśšĽŇņōĶľŭŲŁńŨů", (byte)47, 66);
                    NLoginCore_424.var_java_lang_String_arr_d[7] = NLoginCore_091.B("ŕĠĖċĤŎĶŕķİĖķĞģŘĺņĻņĨĨŘĸũŧŗĨľŚłŤĵ", (byte)47, 66);
                    NLoginCore_424.var_java_lang_String_arr_d[8] = NLoginCore_575.D("ҒҘҐҖґҩҟҐѻҍґӃӈҿҸ҉ҠқҡҖӆҏ҃ҠҬҟҐҨҿҹӃҐҺӖҙҵӒӞұӚӝӄӠӥӒӨӥҼӦӝҶӇӜҪӠӠӈҾӉҨӘӎӋӆӕһӍӉӻҸҽӊӢӎҿԃӆӧӀӿԋӝӄӎӺӝԒӪӡԓӶӔԍӗԅӌԄӱөӶӲӮӯӝӵӸԑӜӼԒԩԫԁԁԥԍԂӺԥԨԧԞԖӨԱԯԥӶԮӼԴԮԕԬӷԷՂӾՃԊ", (byte)47, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_424.var_java_lang_String_arr_d[0] = NLoginCore_201.B("ĩĖŐŇĦŐĮŞĖŚĺĜĲģŢĝĸįĦĠşĽĨťĩŝŞŁľľōŖ", (byte)47, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_424.var_java_lang_String_arr_d[0] = NLoginCore_138.F("Թ՞ՙբաԟթԵՙԥՆԧԯԩԼՋԴԱՆՅԶԱՔղձ՞լՋԼԷմԺ", (byte)47, 70);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x7BL;
        l ^= 0xDAE9E7AF96CB1142L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(9 + 60), (byte)(13 + 70), (byte)(34 + 13), (byte)(36 + 31), 66, (byte)(21 + 46), (byte)(14 + 33), (byte)(43 + 37), (byte)(26 + 49), (byte)(18 + 49), (byte)(4 + 79), (byte)(52 + 1), (byte)(29 + 51), (byte)(64 + 33), (byte)(63 + 37), 100, (byte)(63 + 42), (byte)(94 + 16), (byte)(86 + 17)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.C("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠩࠞࠟࠧࠏ࠶࠷࠷", (byte)54, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_424.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    static {
        var_int_c = 0 >>> 92 | 0 << -92;
        var_int_d = Integer.reverse(-1);
        g = Long.reverse(-8434301822971370229L);
        h = (4 >>> 162 | 4 << ~162 + 1) & 0xFFFFFFFF;
        l = Integer.reverse(-1);
        m = Long.reverse(-8434301822971370229L);
        n = 4096 >>> 107 | 4096 << -107;
        o = Long.reverse(6121332172690072843L);
        p = Long.reverse(-2449958197289549824L);
        q = Integer.reverse(-1073741824);
        r = Long.reverse(6121332172690072843L);
        s = Long.reverse(-2449958197289549824L);
        t = Integer.reverse(0);
        u = (0x20000000 >>> 155 | 0x20000000 << ~155 + 1) & 0xFFFFFFFF;
        v = Long.reverse(-8434301822971370229L);
        w = Integer.reverse(0);
        x = Integer.reverse(-1610612736);
        y = Long.reverse(-8434301822971370229L);
        z = (12 >>> 1 | 12 << ~1 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(6121332172690072843L);
        ab = Long.reverse(-2449958197289549824L);
        ac = Integer.reverse(-536870912);
        ad = Long.reverse(6121332172690072843L);
        ae = Long.reverse(-2449958197289549824L);
        af = Integer.reverse(0);
        ag = Integer.reverse(0x10000000);
        ah = Long.reverse(6121332172690072843L);
        ai = Long.reverse(-2449958197289549824L);
        aj = 0 >>> 199 | 0 << -199;
        ak = Integer.reverse(0);
        al = 0 >>> 58 | 0 << -58;
        am = 0 >>> 91 | 0 << -91;
        an = Integer.reverse(-1879048192);
        ao = Integer.reverse(-1879048192);
        var_java_lang_String_arr_c = new String[an];
        var_java_lang_String_arr_d = new String[ao];
        NLoginCore_424.d();
    }

    private static Object e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_424.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("Ը՚՜Լՠտշ֍չՈֆռ֊քՍղ֔֓֋֑֋ՠ", (byte)84, 69), NLoginCore_424.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.E("ճրտՂւվչւ֍ռՉև֋քև֍Տ࣢ࣗࣘ࣠ࣈࣰࣰ࣯գ", (byte)84, 69) + string + NLoginCore_110.C("ӫ", (byte)84, 67) + methodType.toString(), exception);
        }
    }

    @Override
    public nLoginAPI com_nickuc_login_api_nLoginAPI_a() {
        return new NLoginType_013(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginType_008_a());
    }

    @Override
    public NLoginCore_240 com_nickuc_login_NLoginCore_240_a() {
        return new NLoginCore_240(this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_a.com_nickuc_login_NLoginType_008_a());
    }
}

