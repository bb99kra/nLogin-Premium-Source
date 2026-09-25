/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_564;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
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

public class NLoginCore_352
extends NLoginCore_564 {
    private static int aq;
    private static int ao;
    private static long n;
    private static long bo;
    private static long br;
    private static String[] f;
    private static int bn;
    private static int af;
    private static long ay;
    private static long o;
    private static int ah;
    private static int bc;
    private static long am;
    private static long as;
    private static String[] e;
    private static int z;
    private static int az;
    private static int bw;
    private static long be;
    private static int bu;
    private static int bf;
    private static int aw;
    private static long bk;
    private static long ax;
    private static long bh;
    private static int d;
    private static int bp;
    private static int bl;

    @Override
    protected void a(File file) {
        boolean bl;
        NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(file);
        if (NLoginCore_2192.p((String)NLoginCore_352.c("㺀", (int)(af & ah), (long)am)) && NLoginCore_2192.p((String)NLoginCore_352.c("㺃", (int)(ao & aq), (long)as)) && NLoginCore_2192.p((String)NLoginCore_352.c("㺆", (int)aw, (long)(ax ^ ay))) && (bl = NLoginCore_2192.d(NLoginCore_352.c("㺉", (int)(az & bc), (long)be)))) {
            String string = NLoginCore_2192.java_lang_String_b(NLoginCore_352.c("㺌", (int)bf, (long)(bh ^ bk)));
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_352.c("㺏", (int)(NLoginCore_352.bl & bn), (long)bo));
            this.a(string, (String)NLoginCore_352.c("㺒", (int)bp, (long)br) + string2, null, null);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0x9F4CBB4C3F5B7209L;
        if (e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(67 + 2), (byte)(26 + 57), (byte)(46 + 1), (byte)(22 + 45), (byte)(26 + 40), (byte)(18 + 49), (byte)(7 + 40), (byte)(12 + 68), (byte)(44 + 31), (byte)(63 + 4), (byte)(63 + 20), (byte)(2 + 51), 80, (byte)(84 + 13), (byte)(18 + 82), (byte)(6 + 94), 105, (byte)(17 + 93), (byte)(19 + 84)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, (byte)(80 + 3)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.A("ĶŃłąŅŁļŅŐĿČŊŎŇŊŐĒҫҗѺҍңҌҫҨҏүҠ", (byte)42, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_352.e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return e[n];
    }

    private static void void_b() {
        int n;
        NLoginCore_352.n = -2247808107639039846L;
        long l = NLoginCore_352.n ^ 0x9F4CBB4C3F5B7209L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(59 + 10), (byte)(21 + 62), (byte)(34 + 13), (byte)(27 + 40), (byte)(50 + 16), (byte)(59 + 8), (byte)(33 + 14), (byte)(47 + 33), (byte)(3 + 72), 67, (byte)(4 + 79), (byte)(39 + 14), (byte)(52 + 28), (byte)(25 + 72), (byte)(5 + 95), (byte)(52 + 48), 105, (byte)(42 + 68), (byte)(62 + 41)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(38 + 31), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_352.f[0] = NLoginCore_559.A("ēĹĢþüęĵŃĸĸĭĤċĸńňģĽĿıĎğĜĝ", (byte)37, 65);
                    NLoginCore_352.f[1] = NLoginCore_138.D("ҐҚѵѷѿѮҗѝҘҥѿѬ", (byte)37, 68);
                    NLoginCore_352.f[2] = NLoginCore_027.A("ĒĢĻęĝıŉûĹĆćđ", (byte)37, 65);
                    NLoginCore_352.f[3] = NLoginCore_451.B("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 66);
                    NLoginCore_352.f[4] = NLoginCore_451.A("ĸûČĜĻąķğĕĉĺėĉĹĽĜĪĦĦĢĕįĜĝ", (byte)37, 65);
                    NLoginCore_352.f[5] = NLoginCore_110.A("ĵĿĚĜĤēļĂĽŊĤđ", (byte)37, 65);
                    NLoginCore_352.f[6] = NLoginCore_324.E("ԪԺՓԱԵՉաԓՑԞԟԩ", (byte)37, 69);
                    NLoginCore_352.f[7] = NLoginCore_138.C("҆ҟѝқљѼҔѠќќҙѬ", (byte)37, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_352.f[0] = NLoginCore_092.A("ēĹĢþüęĵŃĸĸĴŋŎĥĻĠĠąĆŕčįĜĝ", (byte)37, 65);
                    NLoginCore_352.f[1] = NLoginCore_092.E("ԭՋԘԮԝԱՔՙԮ՜՚ԩ", (byte)37, 69);
                    NLoginCore_352.f[2] = NLoginCore_091.A("ĿĿŅĥįıŁĕĄīþĊğĩĸņıīİĎĵŕĜĝ", (byte)37, 65);
                    NLoginCore_352.f[3] = NLoginCore_027.A("ĸûČĜĻąķğĕĉĻłňĦĈĨįēĊģĠŕĜĝ", (byte)37, 65);
                    NLoginCore_352.f[4] = NLoginCore_427.D("ғіѧѷҖѠҒѺѰѤҕҕҙҜѣҪѷҙ҉қҬҠѷѸ", (byte)37, 68);
                    NLoginCore_352.f[5] = NLoginCore_091.D("їѳѷџ҉ҎҟѸўѽѷѬ", (byte)37, 68);
                    NLoginCore_352.f[6] = NLoginCore_451.C("ѸѰқҌѮѹѻґѵ҂ңҥҜҪң҆ң҈ѽҰѾҠѷѸ", (byte)37, 67);
                    NLoginCore_352.f[7] = NLoginCore_027.F("ԩՈԶՏՏԴԽԜԴՐԬԩ", (byte)37, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_352.f[0] = NLoginCore_092.F("ԪԴԴՔԕՉՐԻՂԞԠ՜ՃԤԢե՜ՆԻՖԮԹէժԱ՟ՀՠգելԶ", (byte)37, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_352.f[0] = NLoginCore_453.C("ѳѻќҀѝҡѢѝҁґґѬ", (byte)37, 67);
                }
            }
        }
    }

    static {
        d = (0 >>> 45 | 0 << -45) & 0xFFFFFFFF;
        o = Long.reverse(367455956913910535L);
        z = (16 >>> 36 | 16 << -36) & 0xFFFFFFFF;
        af = (128 >>> 199 | 128 << -199) & 0xFFFFFFFF;
        ah = -1 >>> 174 | -1 << -174;
        am = Long.reverse(367455956913910535L);
        ao = (256 >>> 7 | 256 << -7) & 0xFFFFFFFF;
        aq = (-1 >>> 175 | -1 << -175) & 0xFFFFFFFF;
        as = Long.reverse(367455956913910535L);
        aw = (-2147483647 >>> 31 | -2147483647 << -31) & 0xFFFFFFFF;
        ax = Long.reverse(6420293856099857159L);
        ay = Long.reverse(0x5C00000000000000L);
        az = Integer.reverse(0x20000000);
        bc = Integer.reverse(-1);
        be = Long.reverse(367455956913910535L);
        bf = Integer.reverse(-1610612736);
        bh = Long.reverse(6420293856099857159L);
        bk = Long.reverse(0x5C00000000000000L);
        bl = Integer.reverse(0x60000000);
        bn = (-1 >>> 182 | -1 << -182) & 0xFFFFFFFF;
        bo = Long.reverse(367455956913910535L);
        bp = Integer.reverse(-536870912);
        br = Long.reverse(367455956913910535L);
        bu = 256 >>> 5 | 256 << -5;
        bw = (0x1000000 >>> 181 | 0x1000000 << -181) & 0xFFFFFFFF;
        e = new String[bu];
        f = new String[bw];
        NLoginCore_352.void_b();
    }

    public NLoginCore_352(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_x, (String)NLoginCore_352.c("㺀", (int)d, (long)o), z != 0);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_352.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_352.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.C("ҖңҢѥҥҡҜҥҰҟѬҪҮҧҪҰѲࠋ߷ߚ߭ࠃ߬ࠋࠈ߯ࠏࠀ҉", (byte)42, 67) + string + NLoginCore_027.D("ѭ", (byte)42, 68) + methodType.toString(), exception);
        }
    }
}

