/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
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
import lombok.Generated;

public final class NLoginCore_436
extends Enum<NLoginCore_436> {
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_a;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_b;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_c;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_d;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_e;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_f;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_g;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_h;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_i;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_j;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_k;
    public static final /* enum */ NLoginCore_436 var_com_nickuc_login_NLoginCore_436_l;
    private final NLoginCore_532 var_com_nickuc_login_NLoginCore_477_a;
    private static final /* synthetic */ NLoginCore_436[] var_com_nickuc_login_NLoginCore_436_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static long var_long_e;
    private static int var_int_f;
    private static int var_int_g;
    private static int var_int_h;
    private static int var_int_i;
    private static int var_int_j;
    private static int var_int_k;
    private static int var_int_l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static long w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static long ab;
    private static int ac;
    private static int ad;
    private static long ae;
    private static int af;
    private static int ag;
    private static long ah;
    private static long ai;
    private static int aj;
    private static int ak;
    private static long al;
    private static long am;
    private static int an;
    private static int ao;
    private static long ap;
    private static long aq;
    private static int ar;
    private static int as;
    private static long at;
    private static long au;
    private static int av;
    private static int aw;
    private static long ax;
    private static long ay;
    private static int az;
    private static int ba;
    private static int bb;
    private static long bc;
    private static int bd;
    private static int be;
    private static int bf;
    private static long bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static long bk;
    private static int bl;
    private static int bm;
    private static long bn;
    private static long bo;
    private static int bp;

    public static NLoginCore_436 valueOf(String string) {
        return Enum.valueOf(NLoginCore_436.class, string);
    }

    public static NLoginCore_436[] values() {
        return (NLoginCore_436[])var_com_nickuc_login_NLoginCore_436_arr_a.clone();
    }

    public static String a(String string, NLoginCore_436 ... NLoginCore_436Array) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_436.c("㺀", (int)var_int_b, (long)(var_long_d ^ var_long_e)));
        }
        Object[] objectArray = new String[NLoginCore_436Array.length];
        for (int i = var_int_f; i < objectArray.length; ++i) {
            objectArray[i] = NLoginCore_436Array[i].getName();
        }
        return String.format(string, objectArray);
    }

    @Generated
    private NLoginCore_436(NLoginCore_532 NLoginCore_477) {
        this.var_com_nickuc_login_NLoginCore_477_a = NLoginCore_477;
    }

    public String getName() {
        return this.var_com_nickuc_login_NLoginCore_477_a.a(new Object[var_int_a]);
    }

    private static /* synthetic */ NLoginCore_436[] a() {
        NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[var_int_g];
        NLoginCore_436Array[NLoginCore_436.var_int_h] = var_com_nickuc_login_NLoginCore_436_a;
        NLoginCore_436Array[NLoginCore_436.var_int_i] = var_com_nickuc_login_NLoginCore_436_b;
        NLoginCore_436Array[NLoginCore_436.var_int_j] = var_com_nickuc_login_NLoginCore_436_c;
        NLoginCore_436Array[NLoginCore_436.var_int_k] = var_com_nickuc_login_NLoginCore_436_d;
        NLoginCore_436Array[NLoginCore_436.var_int_l] = var_com_nickuc_login_NLoginCore_436_e;
        NLoginCore_436Array[NLoginCore_436.m] = var_com_nickuc_login_NLoginCore_436_f;
        NLoginCore_436Array[NLoginCore_436.n] = var_com_nickuc_login_NLoginCore_436_g;
        NLoginCore_436Array[NLoginCore_436.o] = var_com_nickuc_login_NLoginCore_436_h;
        NLoginCore_436Array[NLoginCore_436.p] = var_com_nickuc_login_NLoginCore_436_i;
        NLoginCore_436Array[NLoginCore_436.q] = var_com_nickuc_login_NLoginCore_436_j;
        NLoginCore_436Array[NLoginCore_436.r] = var_com_nickuc_login_NLoginCore_436_k;
        NLoginCore_436Array[NLoginCore_436.s] = var_com_nickuc_login_NLoginCore_436_l;
        return NLoginCore_436Array;
    }

    private static void b() {
        int n;
        var_long_c = -8503174288958573925L;
        long l = var_long_c ^ 0x45881BCB341155F6L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(44 + 25), (byte)(51 + 32), 47, 67, (byte)(64 + 2), (byte)(31 + 36), (byte)(18 + 29), (byte)(51 + 29), (byte)(35 + 40), (byte)(51 + 16), (byte)(65 + 18), (byte)(36 + 17), (byte)(51 + 29), (byte)(10 + 87), (byte)(65 + 35), (byte)(48 + 52), (byte)(8 + 97), (byte)(72 + 38), (byte)(101 + 2)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_436.var_java_lang_String_arr_b[0] = NLoginCore_451.D("цбЈчфЏШсДиЏЧёЛнМчЭыОРбѦцРпђћѕѝћѮ", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[1] = NLoginCore_027.D("УЋЫЋЊЏЦхђРйО", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[2] = NLoginCore_027.A("éâÝĒĂëĊďĊñĉíÒåĆõØïēáóđèé", (byte)11, 65);
                    NLoginCore_436.var_java_lang_String_arr_b[3] = NLoginCore_091.C("СФНБЯѐЌЩЎхЙтЭѝјћпъЪјнмЩЪ", (byte)11, 67);
                    NLoginCore_436.var_java_lang_String_arr_b[4] = NLoginCore_559.D("ѐмЪаЅБяѐЉСУЪБЭДйЕєСбРђЩЪ", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[5] = NLoginCore_173.B("Ĉ÷ÂĄÎïćĒċéîè×ĕĊëòĞÚġĂđèé", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[6] = NLoginCore_324.F("ԗԹԎԼӽԄԠԳԴՇԨՅԿԟԆԯՌԋԧԴԎԝԚԛ", (byte)11, 70);
                    NLoginCore_436.var_java_lang_String_arr_b[7] = NLoginCore_451.E("԰ԛԽӽԄՄԓӹԴԅԖԏ", (byte)11, 69);
                    NLoginCore_436.var_java_lang_String_arr_b[8] = NLoginCore_027.E("ԍԼԮԹԹԟԁԻԕԛՈԢԚՂԠԠՎԽԢՆՔՓԚԛ", (byte)11, 69);
                    NLoginCore_436.var_java_lang_String_arr_b[9] = NLoginCore_201.A("ăĈÏëêçîĂàĀØúĎěĆØ÷ćÜđěđèé", (byte)11, 65);
                    NLoginCore_436.var_java_lang_String_arr_b[10] = NLoginCore_201.D("шЌЉЧѓбРВивХО", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[11] = NLoginCore_027.B("ĆëüáìËĂÍĊäèÝ", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[12] = NLoginCore_223.D("кЉшѐъЫЏѕѓЏфщШЗЯЕнѕзэьђЩЪ", (byte)11, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_436.var_java_lang_String_arr_b[0] = NLoginCore_223.D("цбЈчфЏШсДиЏЧёЛнМчЭыОРбнњкѦѓсѓіѩЫчЧџаѫѰѥцѡтѫо", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[1] = NLoginCore_092.D("КтЛщЛдѓЍТЭбО", (byte)11, 68);
                    NLoginCore_436.var_java_lang_String_arr_b[2] = NLoginCore_451.E("ԛԔԏՄԴԝԼՁԼԣԸԬԽԞԎՐԍՆՒՒԼՓԚԛ", (byte)11, 69);
                    NLoginCore_436.var_java_lang_String_arr_b[3] = NLoginCore_110.E("ԒԕԎԂԠՁӽԚӿԶԀՋԛԹՃԯԻՆԨԋԊԝԚԛ", (byte)11, 69);
                    NLoginCore_436.var_java_lang_String_arr_b[4] = NLoginCore_559.B("ďûéïÄÐĎďÈàâąēè÷Ûďï÷þĊġèé", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[5] = NLoginCore_076.B("Ĉ÷ÂĄÎïćĒċéïďĚõõÜĔė÷đġġèé", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[6] = NLoginCore_427.B("åćÜĊËÒîāĂĕôĉèðĖċíĊĝëāûèé", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ЭШЋКЯШцЭпіцЩЍКцЮШўмыкѢЩЪ", (byte)11, 67);
                    NLoginCore_436.var_java_lang_String_arr_b[8] = NLoginCore_076.A("ÛĊüććíÏĉãéĖĄúĕĎĕĒċõáßđèé", (byte)11, 65);
                    NLoginCore_436.var_java_lang_String_arr_b[9] = NLoginCore_091.B("ăĈÏëêçîĂàĀÎăÐùÚåûéßßĚĒÞòõđĘāĦĥĨĠ", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[10] = NLoginCore_173.B("îúçĎãëąóČÓ÷øøíĕĕĒòøĊĚġèé", (byte)11, 66);
                    NLoginCore_436.var_java_lang_String_arr_b[11] = NLoginCore_076.C("ЫФЧнЏдЏХЪЖкхЗбЗКјылрїђЩЪ", (byte)11, 67);
                    NLoginCore_436.var_java_lang_String_arr_b[12] = NLoginCore_091.D("кЉшѐъЫЏѕѓЏхЌвЬыўљїёўйЬЩЪ", (byte)11, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_436.var_java_lang_String_arr_b[0] = NLoginCore_324.B("ßĎíûÐþāÿĈąĘĊÒúďÙÿĖÿďüøøğāöþéóĆăĢ", (byte)11, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_436.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ÄøêÍßäüþç×ÒñĘčċîĔØÒÝØ÷ìñõĨüēÜæĜċ", (byte)11, 66);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2EL;
        l ^= 0x45881BCB341155F6L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(13 + 55), (byte)(59 + 10), (byte)(78 + 5), (byte)(31 + 16), (byte)(49 + 18), (byte)(60 + 6), (byte)(48 + 19), 47, (byte)(49 + 31), (byte)(22 + 53), (byte)(49 + 18), (byte)(42 + 41), (byte)(16 + 37), (byte)(56 + 24), (byte)(29 + 68), 100, (byte)(90 + 10), (byte)(23 + 82), (byte)(39 + 71), (byte)(19 + 84)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.D("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠝࠞࠠ࠙ࠞࠢࠢࠎ", (byte)51, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_436.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_436.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("ХчщЩэѬѤѺѦеѳѩѷѱкџҁҀѸѾѸэ", (byte)24, 67), NLoginCore_436.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ĒğĞáġĝĘġĬěèĦĪģĦĬîѾѿҁѺѿ҃҃ѯĂ", (byte)24, 65) + string + NLoginCore_559.E("Ԏ", (byte)24, 69) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = 0 >>> 105 | 0 << ~105 + 1;
        var_int_b = 0 >>> 203 | 0 << ~203 + 1;
        var_long_d = Long.reverse(-2788354012379512943L);
        var_long_e = Long.reverse(0x7400000000000000L);
        var_int_f = Integer.reverse(0);
        var_int_g = 6144 >>> 9 | 6144 << -9;
        var_int_h = 0 >>> 46 | 0 << ~46 + 1;
        var_int_i = Integer.reverse(Integer.MIN_VALUE);
        var_int_j = 256 >>> 135 | 256 << -135;
        var_int_k = Integer.reverse(-1073741824);
        var_int_l = (16 >>> 34 | 16 << -34) & 0xFFFFFFFF;
        m = Integer.reverse(-1610612736);
        n = (3072 >>> 137 | 3072 << ~137 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(-536870912);
        p = Integer.reverse(0x10000000);
        q = (36 >>> 66 | 36 << ~66 + 1) & 0xFFFFFFFF;
        r = Integer.reverse(0x50000000);
        s = 2816 >>> 200 | 2816 << ~200 + 1;
        t = 3328 >>> 8 | 3328 << -8;
        u = Integer.reverse(-1342177280);
        v = 16 >>> 4 | 16 << ~4 + 1;
        w = Long.reverse(-2788354012379512943L);
        x = Long.reverse(0x7400000000000000L);
        y = Integer.reverse(0);
        z = 0x10000000 >>> 219 | 0x10000000 << ~219 + 1;
        aa = Long.reverse(-2788354012379512943L);
        ab = Long.reverse(0x7400000000000000L);
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = 24576 >>> 77 | 24576 << -77;
        ae = Long.reverse(-5958888150048342127L);
        af = Integer.reverse(0x40000000);
        ag = 8 >>> 97 | 8 << ~97 + 1;
        ah = Long.reverse(-2788354012379512943L);
        ai = Long.reverse(0x7400000000000000L);
        aj = 6144 >>> 139 | 6144 << -139;
        ak = 5 >>> 0 | 5 << -0;
        al = Long.reverse(-2788354012379512943L);
        am = Long.reverse(0x7400000000000000L);
        an = 1 >>> 62 | 1 << ~62 + 1;
        ao = Integer.reverse(0x60000000);
        ap = Long.reverse(-2788354012379512943L);
        aq = Long.reverse(0x7400000000000000L);
        ar = Integer.reverse(-1610612736);
        as = 7 >>> 96 | 7 << -96;
        at = Long.reverse(-2788354012379512943L);
        au = Long.reverse(0x7400000000000000L);
        av = 0x6000000 >>> 88 | 0x6000000 << ~88 + 1;
        aw = Integer.reverse(0x10000000);
        ax = Long.reverse(-2788354012379512943L);
        ay = Long.reverse(0x7400000000000000L);
        az = Integer.reverse(-536870912);
        ba = 0x48000000 >>> 59 | 0x48000000 << -59;
        bb = Integer.reverse(-1);
        bc = Long.reverse(-5958888150048342127L);
        bd = Integer.reverse(0x10000000);
        be = (10 >>> 0 | 10 << -0) & 0xFFFFFFFF;
        bf = Integer.reverse(-1);
        bg = Long.reverse(-5958888150048342127L);
        bh = 18 >>> 193 | 18 << ~193 + 1;
        bi = Integer.reverse(-805306368);
        bj = -1 >>> 169 | -1 << -169;
        bk = Long.reverse(-5958888150048342127L);
        bl = 1280 >>> 135 | 1280 << -135;
        bm = Integer.reverse(0x30000000);
        bn = Long.reverse(-2788354012379512943L);
        bo = Long.reverse(0x7400000000000000L);
        bp = Integer.reverse(-805306368);
        var_java_lang_String_arr_a = new String[t];
        var_java_lang_String_arr_b = new String[u];
        NLoginCore_436.b();
        var_com_nickuc_login_NLoginCore_436_a = new NLoginCore_436(NLoginCore_532.f);
        var_com_nickuc_login_NLoginCore_436_b = new NLoginCore_436(NLoginCore_532.g);
        var_com_nickuc_login_NLoginCore_436_c = new NLoginCore_436(NLoginCore_532.var_com_nickuc_login_NLoginCore_477_h);
        var_com_nickuc_login_NLoginCore_436_d = new NLoginCore_436(NLoginCore_532.i);
        var_com_nickuc_login_NLoginCore_436_e = new NLoginCore_436(NLoginCore_532.j);
        var_com_nickuc_login_NLoginCore_436_f = new NLoginCore_436(NLoginCore_532.k);
        var_com_nickuc_login_NLoginCore_436_g = new NLoginCore_436(NLoginCore_532.l);
        var_com_nickuc_login_NLoginCore_436_h = new NLoginCore_436(NLoginCore_532.m);
        var_com_nickuc_login_NLoginCore_436_i = new NLoginCore_436(NLoginCore_532.n);
        var_com_nickuc_login_NLoginCore_436_j = new NLoginCore_436(NLoginCore_532.o);
        var_com_nickuc_login_NLoginCore_436_k = new NLoginCore_436(NLoginCore_532.var_com_nickuc_login_NLoginCore_477_p);
        var_com_nickuc_login_NLoginCore_436_l = new NLoginCore_436(NLoginCore_532.q);
        var_com_nickuc_login_NLoginCore_436_arr_a = NLoginCore_436.a();
    }
}

