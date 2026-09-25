/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.platform.BukkitLoader
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.messaging.Messenger
 *  org.bukkit.plugin.messaging.PluginMessageListener
 */
package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_483;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class NLoginCore_120
extends NLoginCore_483<NLoginCore_089> {
    private static String[] c;
    private static long p;
    private static long s;
    private static int q;
    private static int o;
    private static String[] d;
    private static long v;
    private static int t;
    private static int n;
    private static long r;
    private static long j;
    private static long f;
    private static int x;
    private static long u;
    private static int b;
    private static int w;
    private static long i;

    @Override
    public void b(Object object) {
        throw new UnsupportedOperationException();
    }

    private static String a(int n, long l) {
        l ^= 0x67L;
        l ^= 0x3E5DAE4B2E0CEE7BL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(63 + 6), (byte)(81 + 2), (byte)(23 + 24), (byte)(11 + 56), (byte)(64 + 2), (byte)(3 + 64), (byte)(18 + 29), (byte)(5 + 75), (byte)(51 + 24), (byte)(39 + 28), (byte)(2 + 81), 53, (byte)(30 + 50), (byte)(42 + 55), (byte)(52 + 48), 100, (byte)(70 + 35), (byte)(29 + 81), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(33 + 36), (byte)(59 + 24)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.F("ԾՋՊԍՍՉՄՍ՘ՇԔՒՖՏՒ՘Ԛࢌࢨࢉࢮࢵࢯࢲ࢙࢜ࢼ", (byte)31, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_120.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        f = -1451096638930101927L;
        long l = f ^ 0x3E5DAE4B2E0CEE7BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(41 + 28), 83, (byte)(20 + 27), (byte)(62 + 5), (byte)(29 + 37), (byte)(58 + 9), (byte)(30 + 17), (byte)(12 + 68), (byte)(19 + 56), (byte)(25 + 42), (byte)(80 + 3), (byte)(25 + 28), (byte)(60 + 20), 97, (byte)(26 + 74), (byte)(77 + 23), (byte)(15 + 90), (byte)(24 + 86), (byte)(74 + 29)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, (byte)(44 + 39)}, StandardCharsets.UTF_8));
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
                    NLoginCore_120.d[0] = NLoginCore_091.E("ԲՇԙՇԖԝՉԺԈԎԊՊԫՎՍՌԓՏՊՓԡԨԫԷԚ՞ՙԙՒՀՌՂԭ՞ՈԶՕԢդդԵ՝աԴ", (byte)16, 69);
                    NLoginCore_120.d[1] = NLoginCore_223.B("åĖČęĉĈĝÖčíÿĐĘáöçßāħêĢġīĈĀĎġĆĳđąĪ", (byte)16, 66);
                    NLoginCore_120.d[2] = NLoginCore_324.B("äĆÕïç×ČØĐāâēēûģñĖþóĕþěÿĂĢĚðĪĢóïĶðćıĵďėúčĵúùć", (byte)16, 66);
                    NLoginCore_120.d[3] = NLoginCore_201.B("äĆÕïç×ČØĐāâēēûģñĖþóĕþěÿĂĢĚðĪĢóïĶðćıĵďėúčĵúùć", (byte)16, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_120.d[0] = NLoginCore_110.D("ыѠвѠЯжѢѓСЧУѣфѧѦѥЬѨѣѬксфѐгѷѲвѫљѥћѸїмҁѣѠѼѤ҅Ѳчэ", (byte)16, 68);
                    NLoginCore_120.d[1] = NLoginCore_384.C("ЫќђџяюѣМѓгхіўЧмЭХчѭаѨѦЭіЬщяјѕѼѽѬ", (byte)16, 67);
                    NLoginCore_120.d[2] = NLoginCore_004.E("ԑԳԂԜԔԄԹԅԽԮԏՀՀԨՐԞՃԫԠՂԫՈԬԯՏՇԝ՗ՏԠԜգ՛եՒՄՕԻՖՆՆՅաԴ", (byte)16, 69);
                    NLoginCore_120.d[3] = NLoginCore_223.D("ЪьЛеЭНђОічШљљсѩзќфйћфѡхшѨѠжѰѨйеѼѰѱѯѼѽк҅ѽѹѰѲэ", (byte)16, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_120.d[0] = NLoginCore_575.D("ЪбљЮгђжхћйіЭ", (byte)16, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_120.d[0] = NLoginCore_384.A("ēçĈðøÜæďòÙČęÛÝýæĤĕûéĊīòó", (byte)16, 65);
                }
            }
        }
    }

    static {
        b = Integer.reverse(0);
        i = Long.reverse(-7306118762894902313L);
        j = Long.reverse(-1873497444986126336L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = (-1 >>> 138 | -1 << ~138 + 1) & 0xFFFFFFFF;
        p = Long.reverse(8978897489676811223L);
        q = (0x4000000 >>> 25 | 0x4000000 << -25) & 0xFFFFFFFF;
        r = Long.reverse(-7306118762894902313L);
        s = Long.reverse(-1873497444986126336L);
        t = (384 >>> 71 | 384 << -71) & 0xFFFFFFFF;
        u = Long.reverse(-7306118762894902313L);
        v = Long.reverse(-1873497444986126336L);
        w = 4 >>> 192 | 4 << -192;
        x = Integer.reverse(0x20000000);
        c = new String[w];
        d = new String[x];
        NLoginCore_120.b();
    }

    @Override
    public void c(Object object) {
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_120.c("㺀", (int)t, (long)(u ^ v)));
        }
        String string = (String)object;
        BukkitLoader bukkitLoader = ((NLoginCore_089)this.h).com_nickuc_login_loader_platform_BukkitLoader_a();
        Messenger messenger = bukkitLoader.getServer().getMessenger();
        messenger.unregisterIncomingPluginChannel((Plugin)bukkitLoader, string);
        messenger.unregisterOutgoingPluginChannel((Plugin)bukkitLoader, string);
    }

    @Override
    public void a(Object object, Object object2) {
        if (object2 == null) {
            throw new IllegalArgumentException((String)NLoginCore_120.c("㺀", (int)b, (long)(i ^ j)));
        }
        if (!(object2 instanceof PluginMessageListener)) {
            throw new IllegalArgumentException((String)NLoginCore_120.c("㺃", (int)(n & o), (long)p) + object2.getClass().getCanonicalName());
        }
        if (!(object instanceof String)) {
            throw new IllegalArgumentException((String)NLoginCore_120.c("㺆", (int)q, (long)(r ^ s)));
        }
        String string = (String)object;
        BukkitLoader bukkitLoader = ((NLoginCore_089)this.h).com_nickuc_login_loader_platform_BukkitLoader_a();
        Messenger messenger = bukkitLoader.getServer().getMessenger();
        if (!messenger.isOutgoingChannelRegistered((Plugin)bukkitLoader, string)) {
            messenger.registerOutgoingPluginChannel((Plugin)bukkitLoader, string);
        }
        if (!messenger.isIncomingChannelRegistered((Plugin)bukkitLoader, string)) {
            messenger.registerIncomingPluginChannel((Plugin)bukkitLoader, string, (PluginMessageListener)object2);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_120.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.F("ӾԠԢԂԦՅԽՓԿԎՌՂՐՊԓԸ՚ՙՑ՗ՑԦ", (byte)26, 70), NLoginCore_120.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.F("ԹՆՅԈՈՄԿՈՓՂԏՍՑՊՍՓԕࢇࢣࢄࢩࢰࢪࢭ࢔ࢗࢷԫ", (byte)26, 70) + string + NLoginCore_324.A("í", (byte)26, 65) + methodType.toString(), exception);
        }
    }

    public NLoginCore_120(NLoginCore_089 NLoginCore_0892) {
        super(NLoginCore_0892);
    }
}

