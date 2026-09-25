/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.proxy.messages.ChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier
 *  com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_483;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
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

public class NLoginCore_390
extends NLoginCore_483<NLoginCore_455> {
    private static long x;
    private static int o;
    private static String[] c;
    private static int u;
    private static long j;
    private static long am;
    private static long f;
    private static String[] d;
    private static int ae;
    private static int s;
    private static long y;
    private static int ak;
    private static int aa;
    private static int an;
    private static long i;
    private static int n;
    private static int b;
    private static int ag;
    private static int ah;
    private static long p;
    private static int ab;
    private static int ap;
    private static long aj;
    private static int w;
    private static int aq;
    private static long al;
    private static int ac;
    private static long ad;
    private static int af;
    private static int q;
    private static int r;
    private static int t;
    private static int z;
    private static long ai;
    private static int ao;
    private static long v;

    public NLoginCore_390(NLoginCore_455 NLoginCore_4552) {
        super(NLoginCore_4552);
    }

    @Override
    public void b(Object object) {
        this.a(object, null);
    }

    @Override
    public void c(Object object) {
        ChannelIdentifier channelIdentifier;
        if (object instanceof String) {
            String string = (String)object;
            String[] stringArray = string.split((String)NLoginCore_390.c("㺀", (int)ac, (long)ad));
            channelIdentifier = stringArray.length == ae ? MinecraftChannelIdentifier.create((String)stringArray[af], (String)stringArray[ag]) : new LegacyChannelIdentifier(string);
        } else if (object instanceof ChannelIdentifier) {
            channelIdentifier = (ChannelIdentifier)object;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_390.c("㺃", (int)ah, (long)(ai ^ aj)) + object + (String)NLoginCore_390.c("㺆", (int)ak, (long)(al ^ am)) + object.getClass().getCanonicalName());
        }
        ChannelIdentifier[] channelIdentifierArray = new ChannelIdentifier[an];
        channelIdentifierArray[NLoginCore_390.ao] = channelIdentifier;
        ((NLoginCore_455)this.h).com_velocitypowered_api_proxy_ProxyServer_a().getChannelRegistrar().unregister(channelIdentifierArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_390.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.D("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)97, 68), NLoginCore_390.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.A("ƤƱưųƳƯƪƳƾƭźƸƼƵƸƾƀԃԚӨԒԈԑԒԍԏӯƖ", (byte)97, 65) + string + NLoginCore_446.D("Ԓ", (byte)97, 68) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        f = -8138422193124246403L;
        long l = f ^ 0x20CB3C2ED5C02C74L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(56 + 13), (byte)(81 + 2), (byte)(29 + 18), (byte)(65 + 2), (byte)(57 + 9), (byte)(21 + 46), (byte)(3 + 44), 80, (byte)(74 + 1), (byte)(25 + 42), (byte)(48 + 35), (byte)(51 + 2), (byte)(45 + 35), (byte)(44 + 53), 100, (byte)(33 + 67), (byte)(56 + 49), (byte)(32 + 78), (byte)(12 + 91)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_390.d[0] = NLoginCore_223.C("ҊҞҶҒӌӖӑӕҰӕӊҸҜӞҜӎһҠӠҞҡӛӗҶӌӠӋӛӨӄӋӂ", (byte)55, 67);
                    NLoginCore_390.d[1] = NLoginCore_387.B("ŘőĵĸţĥŖĶĩūŚĵ", (byte)55, 66);
                    NLoginCore_390.d[2] = NLoginCore_384.B("ĝıŉĥşũŤŨŃŨŚıŲŤűőłũŕŨŴūŏŜřŻŐŵĺƁŰĽŏŞźłƊŦŤťŉſŋŕ", (byte)55, 66);
                    NLoginCore_390.d[3] = NLoginCore_027.F("ԫըՏեՈ՟լհԽծԭԻ", (byte)55, 70);
                    NLoginCore_390.d[4] = NLoginCore_384.D("ӅҾҢҥӐҒӃңҖӘӇҢ", (byte)55, 68);
                    NLoginCore_390.d[5] = NLoginCore_559.C("ҊҞҶҒӌӖӑӕҰӕӇҞӟӑӞҾүӖӂӕӡӘҼӉӆӨҽӢҧӮӝҪҼӋӧүӷӓӑӒҶӬҸӂ", (byte)55, 67);
                    NLoginCore_390.d[6] = NLoginCore_324.F("ԫըՏեՈ՟լհԽծԭԻ", (byte)55, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_390.d[0] = NLoginCore_091.A("ĝıŉĥşũŤŨŃŨŝŋįűįšŎĳųıĴűŇĹŧŐŞŀļŏŶł", (byte)55, 65);
                    NLoginCore_390.d[1] = NLoginCore_451.C("ӍҏҠӔғҤҺһүҰұҢ", (byte)55, 67);
                    NLoginCore_390.d[2] = NLoginCore_091.B("ĝıŉĥşũŤŨŃŨŚıŲŤűőłũŕŨŴūŏŜřŻŐŵĺƁŰĽŞƅŠŖƂŸŖŌƁŧōƂůŉŭŨųŒŒŶƖţŠš", (byte)55, 66);
                    NLoginCore_390.d[3] = NLoginCore_091.E("Քգա՞՚ըՂ՟ԽիՎԻ", (byte)55, 69);
                    NLoginCore_390.d[4] = NLoginCore_559.D("ҠӔҪӅҗәҤҚҰӚҹҢ", (byte)55, 68);
                    NLoginCore_390.d[5] = NLoginCore_559.C("ҊҞҶҒӌӖӑӕҰӕӇҞӟӑӞҾүӖӂӕӡӘҼӉӆӨҽӢҧӮӝҪҮүӝҾӠӂӎӯӣҵҸӉҾӖԀӼәӯӣӚӘԆӍӎ", (byte)55, 67);
                    NLoginCore_390.d[6] = NLoginCore_091.C("ӈӊҒҡҤҷӈҷӘӉҭҢ", (byte)55, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_390.d[0] = NLoginCore_559.A("įŦšĽĩŇĤŦĬĻňőłĲŌōūŴŷŉŚĸŉŜŧũŴŮŁŶŜœ", (byte)55, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_390.d[0] = NLoginCore_201.B("ĞĴĽŅłĳĺĽĪŰŮŨŎņŁŁšŦťťŢŕĴűŔŉĿŹŋĿŖť", (byte)55, 66);
                }
            }
        }
    }

    @Override
    public void a(Object object, Object object2) {
        ChannelIdentifier channelIdentifier;
        if (object2 != null && !(object2 instanceof NLoginInterface_029)) {
            throw new IllegalArgumentException((String)NLoginCore_390.c("㺀", (int)b, (long)(i ^ j)) + object2.getClass().getCanonicalName());
        }
        if (object instanceof String) {
            String string = (String)object;
            String[] stringArray = string.split((String)NLoginCore_390.c("㺃", (int)(n & o), (long)p));
            channelIdentifier = stringArray.length == q ? MinecraftChannelIdentifier.create((String)stringArray[r], (String)stringArray[s]) : new LegacyChannelIdentifier(string);
        } else if (object instanceof ChannelIdentifier) {
            channelIdentifier = (ChannelIdentifier)object;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_390.c("㺆", (int)(t & u), (long)v) + object + (String)NLoginCore_390.c("㺉", (int)w, (long)(x ^ y)) + object.getClass().getCanonicalName());
        }
        ChannelIdentifier[] channelIdentifierArray = new ChannelIdentifier[z];
        channelIdentifierArray[NLoginCore_390.aa] = channelIdentifier;
        ((NLoginCore_455)this.h).com_velocitypowered_api_proxy_ProxyServer_a().getChannelRegistrar().register(channelIdentifierArray);
        if (object2 != null) {
            ((NLoginCore_455)this.h).a((NLoginInterface_013)object2, new NLoginInterface_013[ab]);
        }
    }

    static {
        b = 0 >>> 145 | 0 << ~145 + 1;
        i = Long.reverse(-4738291147680419599L);
        j = Long.reverse(0x4000000000000000L);
        n = 4 >>> 2 | 4 << ~2 + 1;
        o = Integer.reverse(-1);
        p = Long.reverse(-126605129253031695L);
        q = (4096 >>> 43 | 4096 << -43) & 0xFFFFFFFF;
        r = 0 >>> 27 | 0 << ~27 + 1;
        s = Integer.reverse(Integer.MIN_VALUE);
        t = 0x100000 >>> 19 | 0x100000 << -19;
        u = -1 >>> 151 | -1 << ~151 + 1;
        v = Long.reverse(-126605129253031695L);
        w = 768 >>> 168 | 768 << ~168 + 1;
        x = Long.reverse(-4738291147680419599L);
        y = Long.reverse(0x4000000000000000L);
        z = 0x8000000 >>> 59 | 0x8000000 << ~59 + 1;
        aa = 0 >>> 15 | 0 << ~15 + 1;
        ab = (0 >>> 25 | 0 << ~25 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(0x20000000);
        ad = Long.reverse(-126605129253031695L);
        ae = Integer.reverse(0x40000000);
        af = Integer.reverse(0);
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = -1610612736 >>> 253 | -1610612736 << ~253 + 1;
        ai = Long.reverse(-4738291147680419599L);
        aj = Long.reverse(0x4000000000000000L);
        ak = Integer.reverse(0x60000000);
        al = Long.reverse(-4738291147680419599L);
        am = Long.reverse(0x4000000000000000L);
        an = Integer.reverse(Integer.MIN_VALUE);
        ao = Integer.reverse(0);
        ap = Integer.reverse(-536870912);
        aq = Integer.reverse(-536870912);
        c = new String[ap];
        d = new String[aq];
        NLoginCore_390.b();
    }

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0x20CB3C2ED5C02C74L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(44 + 25), (byte)(12 + 71), (byte)(31 + 16), 67, (byte)(24 + 42), (byte)(18 + 49), (byte)(16 + 31), (byte)(7 + 73), (byte)(53 + 22), (byte)(65 + 2), (byte)(30 + 53), 53, (byte)(59 + 21), (byte)(20 + 77), (byte)(78 + 22), (byte)(24 + 76), (byte)(71 + 34), (byte)(84 + 26), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ĮĻĺýĽĹĴĽňķĄłņĿłňĊҍҤѲҜҒқҜҗҙѹ", (byte)38, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_390.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }
}

