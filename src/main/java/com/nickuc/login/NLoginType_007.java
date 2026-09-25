/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 *  com.nickuc.login.api.nLoginAPI$nLoginInternal
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.api.types.Location
 *  javax.annotation.Nonnull
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_457;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_155;
import com.nickuc.login.NLoginType_016;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginType_006;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class NLoginType_007
extends NLoginType_006 {
    private static int bp;
    private static long au;
    private static int af;
    private static String[] c;
    private static long e;
    private final NLoginCore_155 a = new NLoginCore_155(this);
    private static int aa;
    private static long j;
    private static long w;
    private static int u;
    private static String[] d;
    private static long bi;
    private static long av;
    private static long v;
    private static int f;
    private static long t;
    private static long aj;
    private static int bo;
    private static long s;
    private static int aq;
    private static long as;
    private static long ac;
    private static long h;
    private static int at;
    private static long ag;
    private static int q;
    private static long bj;
    private static int bg;

    public void requestLogin(@Nonnull Identity identity, @Nonnull Object object) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginType_007.c("㺀", (int)q, (long)(s ^ t)));
        }
        if (!(object instanceof Plugin)) {
            throw new IllegalArgumentException((String)NLoginType_007.c("㺃", (int)u, (long)(v ^ w)) + object + (String)NLoginType_007.c("㺆", (int)aa, (long)ac) + Plugin.class + (String)NLoginType_007.c("㺉", (int)af, (long)(ag ^ aj)));
        }
        if (identity == null) {
            throw new IllegalArgumentException((String)NLoginType_007.c("㺌", (int)aq, (long)as));
        }
        if (!(identity instanceof NLoginCore_473)) {
            throw new IllegalArgumentException((String)NLoginType_007.c("㺏", (int)at, (long)(au ^ av)) + NLoginCore_473.class.getCanonicalName() + (String)NLoginType_007.c("㺒", (int)bg, (long)(bi ^ bj)) + identity.getClass().getCanonicalName());
        }
        String string = this.b(identity);
        NLoginCore_277 NLoginCore_277 = ((NLoginCore_100)((Object)this.a)).java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 == null) {
            return;
        }
        Runnable runnable = () -> ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().c(NLoginCore_277, ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277));
        if (Bukkit.getServer().isPrimaryThread() && !NLoginCore_012.V()) {
            runnable.run();
        } else {
            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new SynchronizeWithServerThreadTask(runnable));
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_007.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.F("՝տցաօֲ֤֜֞խ֫֡֯֩ղְְֶָֹ֗օ", (byte)121, 70), NLoginType_007.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऍऎअऊऒࣟऎ࣠ࣴक࣫ࣥ֌", (byte)121, 69) + string + NLoginCore_575.A("ƫ", (byte)121, 65) + methodType.toString(), exception);
        }
    }

    @Nonnull
    public nLoginAPI.nLoginInternal internal() {
        return this.a;
    }

    private static void b() {
        int n;
        e = -967036418472375976L;
        long l = e ^ 0x5245AEAB56A88ACFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(18 + 51), (byte)(17 + 66), (byte)(15 + 32), 67, (byte)(31 + 35), (byte)(6 + 61), (byte)(16 + 31), (byte)(44 + 36), (byte)(29 + 46), (byte)(23 + 44), (byte)(18 + 65), (byte)(51 + 2), (byte)(12 + 68), (byte)(62 + 35), (byte)(66 + 34), (byte)(96 + 4), (byte)(38 + 67), (byte)(39 + 71), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_007.d[0] = NLoginCore_387.C("ԥՂԛՂԈԥԅՉԺՏԭԒԾԧԷԖՈԷՑԖԖՎ՞Շ՛Ջ՛ԱԺԠԤՈ՚ԣԽաՄԵԨգՊՏ՜Է", (byte)94, 67);
                    NLoginType_007.d[1] = NLoginCore_091.A("ƦƧƩƋƎŴŹƋƔƑƹƛƹưƯƑƺƣƜƶưƼƇƳƆƝƘƁƫƎǌƊƟƳǒǈǓƺƗƘƳƭƮƣ", (byte)94, 65);
                    NLoginType_007.d[2] = NLoginCore_091.A("ƦƧƩƋƎŴŹƋƔƑƸǀƜƹŸžƷơƠƱƶƖƕƴƽƋǂǋƦƌǊƅ", (byte)94, 65);
                    NLoginType_007.d[3] = NLoginCore_387.B("ƌƃƯƑƔƋŹƒŮƊƫƹƟƌƊƢƵƃƻƓƾƵƪƃƢƼƄƷǄƥưǋƳƵƷƤƯǒƱƔǓǌƪƣ", (byte)94, 66);
                    NLoginType_007.d[4] = NLoginCore_223.F("֓ձ֑հ֖զՓՐ։զթբ", (byte)94, 70);
                    NLoginType_007.d[5] = NLoginCore_201.D("ԘԴԫԖԩԤՏԙՏՉԤՍՕԾՆԑՓԫՌՐԲԼՕ՜ԶԼԛԚՃԴՏՄՔԛԧ՚ԩախթՑՆհԷ", (byte)94, 68);
                    NLoginType_007.d[6] = NLoginCore_223.D("ԘԴԫԖԩԤՏԙՏՉԣ԰ԋԎՊՏՇԥԔԑԗԝԯ՝ԘԪԯ՚ՍՁ՜ՅզԵ՘ՊԻէաԭ՞ԽՂԷ", (byte)94, 68);
                    NLoginType_007.d[7] = NLoginCore_223.D("ԁԜՄՇԆՊԖՁԱԊՀԣ԰ԲԖԴՙՃՆՐՇՋԢԣ", (byte)94, 68);
                    continue block7;
                }
                case 1: {
                    NLoginType_007.d[0] = NLoginCore_324.E("հ֍զ֍ՓհՐ֔օ֚ո՝։ղւա֓ւ֜աա֦֖֦֙֩֒ռօիկ֓ի֝֊֡֯քֲֲղ֪մւ", (byte)94, 69);
                    NLoginType_007.d[1] = NLoginCore_091.E("օֆֈժխՓ՘ժճհ֘պ֘֏֎հ֙ւջ֕֏֛զ֒եռշՠ֊խ֫թֈֲ֪֫֯֒չֺ֮ճ֙ֈֺׁ֞ս֓պִ֛֖֐֍֎", (byte)94, 69);
                    NLoginType_007.d[2] = NLoginCore_559.C("ԺԻԽԟԢԈԍԟԨԥՌՔ԰ՍԌԒՋԵԴՅՊԯԩԸԭ՗ՔՋԮ԰ՂէԽԟՋ՛բ՟ՀԼխԨԱԷ", (byte)94, 67);
                    NLoginType_007.d[3] = NLoginCore_201.F("իբ֎հճժ՘ձՍթ֊֘վիթց֔բ֚ղ֝֔։բց֛գ֖֣ք֏֪֯օրևղ֢֐֚֯ո֕ւ", (byte)94, 70);
                    NLoginType_007.d[4] = NLoginCore_427.A("ƁƦƑƣƍƶƈƬŸƉƖƃ", (byte)94, 65);
                    NLoginType_007.d[5] = NLoginCore_387.D("ԘԴԫԖԩԤՏԙՏՉԤՍՕԾՆԑՓԫՌՐԲԼՕ՜ԶԼԛԚՃԴՏՄ՟ՆՊ՘ԨԺՃՠՉԣհԷ", (byte)94, 68);
                    NLoginType_007.d[6] = NLoginCore_384.F("գտնամկ֚դ֚֔ծջՖՙ֚֕֒հ՟՜բըպ֨գյպ֥֘֌֧֐տ֌ձ֍֨ճֆַճ֍ִ֝֊ִ֫־ցֶַׁ֛֤֍֎", (byte)94, 70);
                    NLoginType_007.d[7] = NLoginCore_138.B("ŭƈưƳŲƶƂƭƝŶƯƏƱƠżƵƳƃžƗƐơƎƏ", (byte)94, 66);
                    continue block7;
                }
                case 2: {
                    NLoginType_007.d[0] = NLoginCore_173.B("ƂƁƵƎƸƒƔŵƍƩƗŵǁƲƙƱƬƎƂƙƱǇƎƏ", (byte)94, 66);
                    continue block7;
                }
                case 4: {
                    NLoginType_007.d[0] = NLoginCore_559.C("ԓԩԾԗԌՁԞՍԇԦԡԦԭԢԈ՘ԔԖՂԨՄԥԢԣ", (byte)94, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0x5245AEAB56A88ACFL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(36 + 33), (byte)(80 + 3), (byte)(36 + 11), (byte)(39 + 28), (byte)(34 + 32), (byte)(14 + 53), (byte)(29 + 18), (byte)(76 + 4), (byte)(39 + 36), (byte)(10 + 57), (byte)(49 + 34), (byte)(46 + 7), 80, (byte)(18 + 79), (byte)(79 + 21), (byte)(79 + 21), (byte)(11 + 94), 110, (byte)(68 + 35)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.C("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࡊࡋࡂࡇࡏࠜࡋࠝ࠱ࡒࠨࠢ", (byte)63, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_007.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public NLoginType_007(NLoginType_008 NLoginType_008) {
        super(NLoginType_008);
    }

    static {
        f = Integer.reverse(0);
        h = Long.reverse(1914425674436061519L);
        j = Long.reverse(0x1A00000000000000L);
        q = (0x4000000 >>> 90 | 0x4000000 << ~90 + 1) & 0xFFFFFFFF;
        s = Long.reverse(1914425674436061519L);
        t = Long.reverse(0x1A00000000000000L);
        u = 32768 >>> 110 | 32768 << ~110 + 1;
        v = Long.reverse(1914425674436061519L);
        w = Long.reverse(0x1A00000000000000L);
        aa = 0x300000 >>> 52 | 0x300000 << -52;
        ac = Long.reverse(40928229449935183L);
        af = Integer.reverse(0x20000000);
        ag = Long.reverse(1914425674436061519L);
        aj = Long.reverse(0x1A00000000000000L);
        aq = Integer.reverse(-1610612736);
        as = Long.reverse(40928229449935183L);
        at = 49152 >>> 77 | 49152 << -77;
        au = Long.reverse(1914425674436061519L);
        av = Long.reverse(0x1A00000000000000L);
        bg = (1792 >>> 104 | 1792 << -104) & 0xFFFFFFFF;
        bi = Long.reverse(1914425674436061519L);
        bj = Long.reverse(0x1A00000000000000L);
        bo = Integer.reverse(0x10000000);
        bp = Integer.reverse(0x10000000);
        c = new String[bo];
        d = new String[bp];
        NLoginType_007.b();
    }

    public Optional<Location> getSpawnLocation(@Nonnull SpawnType spawnType) {
        if (spawnType == null) {
            throw new IllegalArgumentException((String)NLoginType_007.c("㺀", (int)f, (long)(h ^ j)));
        }
        NLoginType_016 NLoginType_0162 = NLoginType_016.a(spawnType);
        org.bukkit.Location location = NLoginCore_393.a(this.a.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a().k(NLoginType_0162.aE()));
        if (location == null) {
            return Optional.empty();
        }
        NLoginCore_457 NLoginCore_4572 = new NLoginCore_457(location.getWorld().getName(), location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
        return Optional.of(NLoginCore_4572);
    }
}

