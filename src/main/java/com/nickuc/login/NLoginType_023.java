/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 *  com.nickuc.login.api.nLoginAPI$nLoginInternal
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.api.types.Location
 *  javax.annotation.Nonnull
 *  net.md_5.bungee.api.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_156;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginType_006;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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
import net.md_5.bungee.api.plugin.Plugin;

public class NLoginType_023
extends NLoginType_006 {
    private static int bg;
    private static int aa;
    private static int af;
    private static long bj;
    private final NLoginCore_156 a = new NLoginCore_156(this);
    private static long h;
    private static long s;
    private static int f;
    private static long bi;
    private static long e;
    private static String[] c;
    private static long k;
    private static int g;
    private static int ab;
    private static long j;
    private static long w;
    private static long aj;
    private static int aq;
    private static String[] d;
    private static long ag;
    private static long as;
    private static int bo;
    private static int q;
    private static long v;
    private static long au;
    private static int u;
    private static long ac;
    private static int i;
    private static int bp;

    private static String a(int n, long l) {
        l ^= 0x61L;
        l ^= 0x625CDB68701394C1L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(4 + 65), (byte)(9 + 74), (byte)(39 + 8), (byte)(22 + 45), (byte)(52 + 14), (byte)(41 + 26), (byte)(46 + 1), (byte)(43 + 37), (byte)(64 + 11), (byte)(23 + 44), (byte)(26 + 57), (byte)(26 + 27), (byte)(11 + 69), 97, (byte)(16 + 84), (byte)(91 + 9), (byte)(4 + 101), (byte)(41 + 69), (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(29 + 54)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.A("ĎěĚÝĝęĔĝĨėäĢĦğĢĨêѭѥѺ҆ћѪѢҌѽ҂", (byte)22, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_023.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_023.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.F("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)46, 70), NLoginType_023.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.D("ҢүҮѱұҭҨұҼҫѸҶҺҳҶҼѾࠁ߹ࠎࠚ߯߾߶ࠠࠑࠖҔ", (byte)46, 68) + string + NLoginCore_138.E("Ԥ", (byte)46, 69) + methodType.toString(), exception);
        }
    }

    static {
        f = 0 >>> 34 | 0 << ~34 + 1;
        g = -1 >>> 52 | -1 << ~52 + 1;
        h = Long.reverse(1783136753152097006L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Long.reverse(-7007889719475111186L);
        k = Long.reverse(-8791026472627208192L);
        q = Integer.reverse(0x40000000);
        s = Long.reverse(1783136753152097006L);
        u = (3 >>> 32 | 3 << -32) & 0xFFFFFFFF;
        v = Long.reverse(-7007889719475111186L);
        w = Long.reverse(-8791026472627208192L);
        aa = Integer.reverse(0x20000000);
        ab = Integer.reverse(-1);
        ac = Long.reverse(1783136753152097006L);
        af = 0x14000000 >>> 26 | 0x14000000 << -26;
        ag = Long.reverse(-7007889719475111186L);
        aj = Long.reverse(-8791026472627208192L);
        aq = Integer.reverse(0x60000000);
        as = Long.reverse(-7007889719475111186L);
        au = Long.reverse(-8791026472627208192L);
        bg = 224 >>> 101 | 224 << -101;
        bi = Long.reverse(-7007889719475111186L);
        bj = Long.reverse(-8791026472627208192L);
        bo = 0x1000000 >>> 181 | 0x1000000 << ~181 + 1;
        bp = 4096 >>> 41 | 4096 << ~41 + 1;
        c = new String[bo];
        d = new String[bp];
        NLoginType_023.b();
    }

    @Nonnull
    public nLoginAPI.nLoginInternal internal() {
        return this.a;
    }

    private static void b() {
        int n;
        e = 8601674832332946809L;
        long l = e ^ 0x625CDB68701394C1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(57 + 12), (byte)(4 + 79), (byte)(32 + 15), 67, (byte)(54 + 12), (byte)(53 + 14), (byte)(16 + 31), (byte)(74 + 6), (byte)(52 + 23), (byte)(17 + 50), (byte)(35 + 48), (byte)(26 + 27), (byte)(52 + 28), (byte)(13 + 84), (byte)(17 + 83), (byte)(77 + 23), 105, (byte)(40 + 70), (byte)(100 + 3)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
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
                    NLoginType_023.d[0] = NLoginCore_091.C("ӘӾӵӂӹӜӠӾӻӘԂӪӬԌԍӮԐӏԗԐԙӘӓӬӦԎԌӚӽԔԞԅ", (byte)72, 67);
                    NLoginType_023.d[1] = NLoginCore_446.D("ӲӶӁӲӚԃӞӽӠԄԑӰӼӏԈӾԆӵӫәӚԍӬӷӝәԚӸԣԒӴӗӯԖԓӺԈԞԛӦӶԧԀӵ", (byte)72, 68);
                    NLoginType_023.d[2] = NLoginCore_138.E("թխԸթՑպՕմ՗ջֈշղջՙՉՋևք՚՝ՎռՋնտՠղ֗՘ռ֌", (byte)72, 69);
                    NLoginType_023.d[3] = NLoginCore_559.A("ŲšŸłŗƇƏŽƍżƒŜſƉƋŭƔƌƔōŵƙƚŷžźřŸƙƟšƣƇŢƈųƖƠžƏſżƬŷ", (byte)72, 65);
                    NLoginType_023.d[4] = NLoginCore_201.D("ӞӠӾԁӵӅӜӅӅԅӏӕ", (byte)72, 68);
                    NLoginType_023.d[5] = NLoginCore_091.B("ũŪŽūŴŇžŬŘŲňťűšŦŲŐŷũƏřŨŦŪƓƙƣżŴƤƔƢƈŨƒŷƥƀƍŨŻƀžŷ", (byte)72, 66);
                    NLoginType_023.d[6] = NLoginCore_451.D("ӧӨӻөӲӅӼӪӖӰӐӠӰԆӫӮӭԊԁӒԅԙӧԕԍԞԝӸԛӞӚӛԜӾԠԩԂԕԩԋԂԁӯӵ", (byte)72, 68);
                    NLoginType_023.d[7] = NLoginCore_223.D("ԁӑӞӞԀӚӵӗӖӮӹӲӝԊԐԉӣӓӰӫӪӳӠӡ", (byte)72, 68);
                    continue block7;
                }
                case 1: {
                    NLoginType_023.d[0] = NLoginCore_427.D("ӘӾӵӂӹӜӠӾӻӘԂӪӬԌԍӮԐӏԗԐԙӔӻӥӗԏԜԞԞԒӴԀӯӥӱԢԥӹԣԙԬԇӯӵ", (byte)72, 68);
                    NLoginType_023.d[1] = NLoginCore_091.E("թխԸթՑպՕմ՗ջֈէճՆտյսլբՐՑքգծՔՐ֑կ֚։իՎըտ֛՟ձ֡֒֕ց֓ււ֠ր֢֗և֋֠զխ֊շո", (byte)72, 69);
                    NLoginType_023.d[2] = NLoginCore_223.D("ӲӶӁӲӚԃӞӽӠԄԑԀӻԄӢӒӔԐԍӣӦӒӽӪԎԊԞԛԜӷԂӣԢӵԠӦӼԅԂӺӬԨӯӵ", (byte)72, 68);
                    NLoginType_023.d[3] = NLoginCore_427.E("էՖխԷՌռքղւձևՑմվրբ։ց։Ղժ֎֏լճկՎխ֎֔Ֆ֘լՙ֊֟֠տ՛շփձ֥լ", (byte)72, 69);
                    NLoginType_023.d[4] = NLoginCore_027.A("ŚƃŝœƆƅƂŞżŊŪŗ", (byte)72, 65);
                    NLoginType_023.d[5] = NLoginCore_223.A("ũŪŽūŴŇžŬŘŲňťűšŦŲŐŷũƏřŨŦŪƓƙƣżŴƤƔƢƅƀťƂƔƬƫƗŦŧŭŷ", (byte)72, 65);
                    NLoginType_023.d[6] = NLoginCore_559.B("ũŪŽūŴŇžŬŘŲŒŢŲƈŭŰůƌƃŔƇƛũƗƏƠƟźƝŠŜŝŨŦŴƇƇţżƪƱƝŮƍƩƵƎŲơƲƆƮƕƻƂƃ", (byte)72, 66);
                    NLoginType_023.d[7] = NLoginCore_453.F("ոՈՕՕշՑլՎՍեըՔԻպզրՅՋՈզ֊֐՗՘", (byte)72, 70);
                    continue block7;
                }
                case 2: {
                    NLoginType_023.d[0] = NLoginCore_559.E("լՉԽննԿՠԿոՒՖ։Փՙմթ՜՗ՁՂՉիօծիտփակւֈե", (byte)72, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_023.d[0] = NLoginCore_110.E("ճոնԹՑԻհՂՠ՗շզՒՀՂ՞Պ֍՚Ղըժ՗՘", (byte)72, 69);
                }
            }
        }
    }

    public Optional<Location> getSpawnLocation(@Nonnull SpawnType spawnType) {
        throw new UnsupportedOperationException((String)NLoginType_023.c("㺀", (int)(f & g), (long)h));
    }

    public void requestLogin(Identity identity, Object object) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginType_023.c("㺀", (int)i, (long)(j ^ k)));
        }
        if (!(object instanceof Plugin)) {
            throw new IllegalArgumentException((String)NLoginType_023.c("㺃", (int)q, (long)s) + object + (String)NLoginType_023.c("㺆", (int)u, (long)(v ^ w)) + Plugin.class + (String)NLoginType_023.c("㺉", (int)(aa & ab), (long)ac));
        }
        if (identity == null) {
            throw new IllegalArgumentException((String)NLoginType_023.c("㺌", (int)af, (long)(ag ^ aj)));
        }
        if (!(identity instanceof NLoginCore_473)) {
            throw new IllegalArgumentException((String)NLoginType_023.c("㺏", (int)aq, (long)(as ^ au)) + NLoginCore_473.class.getCanonicalName() + (String)NLoginType_023.c("㺒", (int)bg, (long)(bi ^ bj)) + identity.getClass().getCanonicalName());
        }
        String string = this.b(identity);
        NLoginCore_277 NLoginCore_277 = ((NLoginCore_100)((Object)this.a)).java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 != null) {
            ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().c(NLoginCore_277, ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277));
        }
    }

    public NLoginType_023(NLoginType_008 NLoginType_008) {
        super(NLoginType_008);
    }
}

