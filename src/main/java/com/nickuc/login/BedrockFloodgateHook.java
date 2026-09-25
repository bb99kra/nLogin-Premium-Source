/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
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

public class BedrockFloodgateHook {
    private static int ax;
    private static long au;
    private static int r;
    private static int ab;
    private static int n;
    private static int l;
    private static int av;
    private static int az;
    private static int af;
    private static int x;
    private static long t;
    public static final String cH;
    private static int v;
    private static long ba;
    private static int as;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static int an;
    private static int ad;
    private static int h;
    public static final boolean aG;
    private static int am;
    private static long aq;
    private static long al;
    private static int ae;
    private static long y;
    private static int ao;
    private static long at;
    private static long d;
    private static int j;
    private static int i;
    public static boolean aE;
    private static long ah;
    private static long p;
    private static long q;
    private static int var_int_b;
    private static long u;
    private static int ap;
    private static long g;
    public static final boolean aF;
    private static long ak;
    private static int z;
    private static int k;
    private static int ai;
    private static long ac;
    private static int s;
    private static long ag;
    public static final String cI;
    private static String[] var_java_lang_String_arr_a;
    private static long c;
    private static long aw;
    private static int var_int_a;
    private static int w;
    private static int m;
    private static int ar;
    private static int ay;
    private static int aa;
    private static int e;
    private static int o;
    private static int aj;

    private static void b() {
        int n;
        c = 4620841697213823096L;
        long l = c ^ 0x48A8849ED250F5C3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(39 + 30), (byte)(29 + 54), (byte)(33 + 14), (byte)(21 + 46), (byte)(50 + 16), (byte)(55 + 12), (byte)(14 + 33), (byte)(28 + 52), (byte)(38 + 37), (byte)(18 + 49), (byte)(67 + 16), 53, (byte)(20 + 60), (byte)(5 + 92), (byte)(74 + 26), (byte)(81 + 19), (byte)(33 + 72), (byte)(88 + 22), (byte)(6 + 97)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
                    BedrockFloodgateHook.var_java_lang_String_arr_b[0] = NLoginCore_427.A("âùùèģĉħĦĎČĂû", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[1] = NLoginCore_384.D("Ѷнѧејѳээџѓўы", (byte)26, 68);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[2] = NLoginCore_138.C("ѹеѯѮмѽппѮѸуѠѠёѶѼъ҉ыѦ҄ўѠѓђџѦғѦѷѭѤ҄ѳѺѝѹѝєѶҠѾѾѫ", (byte)26, 67);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[3] = NLoginCore_384.F("ԸՉԬԫՑՌԨԬԓՄԡԻԖԲԙԔ՚ԛՙԙՄ՟ԛ՞԰ՙՂԿՔ՘ԨդԬԨԻեՔէՍՃդԮՍԾ", (byte)26, 70);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[4] = NLoginCore_201.A("çíįĪâĠăăĀĔğċĊāęĐõĆôĉĕľþĳŃüĄįăĄĊĉĠŊėĹĝľńĿŒĽŐě", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[5] = NLoginCore_091.A("øĚùĢīãéĪįĦċġĬčöĴĚēĖùĠĠĊġúġŇąļęĺĈōĽĘĠĻĪłċĦĦĪě", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[6] = NLoginCore_223.B("ĕõęćâĐþğĄýČįĕõęĜıēįĴĻûĲĮĄāĻĄĆŉĸłĉċćĤŊņĈĻŏĞĞě", (byte)26, 66);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[7] = NLoginCore_559.F("ԨԬՐՂՃՊԣԷԪՍՌԪԳԥԺՍՕԮՖԝԶԖ՞Կԟ՟դ՛բԺծԩ", (byte)26, 70);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[8] = NLoginCore_201.F("ԝՈԥԽԽՄԱԶՁԗԤՖՋԔԩԕ՚ՀՙԸԾԛԡՄԢԟԠԜՠՇդԶ", (byte)26, 70);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[9] = NLoginCore_559.B("ĬĠĪęþêĢěĐĒĨĸČĲĕĳĎĭĬĉĝįĆć", (byte)26, 66);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[10] = NLoginCore_091.E("ԟԠՒԤԫՄՋՓԳԓԱՄ՚Զ՚՜ՔՐԝՒՎՓ՘ՃԷՓՃՒԶԾզՆԬ԰դԤՅԮԬխՏՏՔԴՍ՜ռԾՉճհԼ՞՜ՉՊ", (byte)26, 69);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[11] = NLoginCore_091.D("ѸѯѵѶљїџѰіѶѓёѨѽ҇фќѻѽ҅ѰҏѨ҉ҊѢҍэ҆ҒѯіҍѹѐїѱҞѠѭќ҂Ѷѫ", (byte)26, 68);
                    continue block7;
                }
                case 1: {
                    BedrockFloodgateHook.var_java_lang_String_arr_b[0] = NLoginCore_173.D("дчыёљњюѤѹнњы", (byte)26, 68);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[1] = NLoginCore_453.D("кіщплєѶѤфђѼѥ҂щфѩѶїҀ҉ѧѩії", (byte)26, 68);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[2] = NLoginCore_559.D("ѹеѯѮмѽппѮѸуѠѠёѶѼъ҉ыѦ҄ўѠѓђџѦғѦѷѭѤѱ҅ѲѪѶѹћҒѳѽҁѡҕѿѠѹ҉ѿҏҡѭ҉Ѷѷ", (byte)26, 68);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[3] = NLoginCore_201.F("ԸՉԬԫՑՌԨԬԓՄԡԻԖԲԙԔ՚ԛՙԙՄ՟ԛ՞԰ՙՂԿՔ՘ԨդԬՋՍՇՔԱզէՖդՅԾ", (byte)26, 70);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[4] = NLoginCore_173.C("знѿѺвѰѓѓѐѤѯћњёѩѠхіфљѥҎю҃ғьєѿѓєњљҒљґѕҘљѲҁҙѭѾѫ", (byte)26, 67);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[5] = NLoginCore_091.A("øĚùĢīãéĪįĦċġĬčöĴĚēĖùĠĠĊġúġŇąļęĺĈċľŊŀľĮĮŀŇğńě", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[6] = NLoginCore_324.E("ԸԘԼԪԅԳԡՂԧԠԯՒԸԘԼԿՔԶՒ՗՞ԞՕՑԧԤ՞ԧԩլ՛եԽՅ՟ճ԰ընհՓՙՅԾ", (byte)26, 69);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[7] = NLoginCore_173.A("ąĉĭğĠħĀĔćĪĩćĐĂėĪĲċĳúēāİÿĖĴēĤĿŅĊć", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[8] = NLoginCore_451.F("ԝՈԥԽԽՄԱԶՁԗԤՖՋԔԩԕ՚ՀՙԸԾԛԡ՜՛ՅԿԸ՗ՂժՈ", (byte)26, 70);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[9] = NLoginCore_027.E("ՏՃՍԼԡԍՅԾԳԵՍԪ՚ՇԪ՟ԝԬՋՙԙՌԹՅԥԿՃեԢ՞իԺ", (byte)26, 69);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[10] = NLoginCore_384.A("üýįāĈġĨİĐðĎġķēķĹıĭúįīİĵĠĔİĠįēěŃģĉčŁāĢċĉŊĬĬıĩđŉĻėřĻĺŉěĩĦħ", (byte)26, 65);
                    BedrockFloodgateHook.var_java_lang_String_arr_b[11] = NLoginCore_027.E("ՋՂՈՉԬԪԲՃԩՉԦԤԻՐ՚ԗԯՎՐ՘ՃբԻ՜՝ԵՠԠՙեՂԩՉՈՠԼ՝բծԮՓԸճԾ", (byte)26, 69);
                    continue block7;
                }
                case 2: {
                    BedrockFloodgateHook.var_java_lang_String_arr_b[0] = NLoginCore_384.C("эћкеылѿеѵзоѝѓњѤѼуѬѢѢјёѿѩҎҊѦ҅Ѩѫ҂ђ", (byte)26, 67);
                    continue block7;
                }
                case 4: {
                    BedrockFloodgateHook.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ԺՐԩ԰ԩՐԍՑ԰ՀՊ՚՛ԓՓՙՊԚՒԠ՛ՂԗԘԻԽՄԼժ՝ՍԬ", (byte)26, 70);
                }
            }
        }
    }

    private static String a(String string, String ... stringArray) {
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = j; i < n; ++i) {
            String string2 = stringArray2[i];
            String string3 = System.getProperty(string2);
            if (string3 == null) continue;
            return string3;
        }
        return string;
    }

    private static String a(int n, long l) {
        l ^= 0xAL;
        l ^= 0x48A8849ED250F5C3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(17 + 52), (byte)(46 + 37), 47, (byte)(55 + 12), (byte)(36 + 30), (byte)(29 + 38), (byte)(40 + 7), (byte)(70 + 10), (byte)(39 + 36), (byte)(61 + 6), (byte)(68 + 15), (byte)(52 + 1), 80, (byte)(81 + 16), (byte)(71 + 29), (byte)(24 + 76), (byte)(42 + 63), (byte)(105 + 5), (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.E("մցրՃփտպփ֎սՊֈ֌օֈ֎Ր࣡ࣤࣇ࣭࣬ࣨࢼࣰࣦࣚࣟࣟࣴࣴ", (byte)85, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            BedrockFloodgateHook.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static boolean a(String ... stringArray) {
        String string = BedrockFloodgateHook.a(null, stringArray);
        return (((String)BedrockFloodgateHook.c("㺀", (int)(var_int_a & var_int_b), (long)d)).equals(string) || ((String)BedrockFloodgateHook.c("㺃", (int)(e & f), (long)g)).equalsIgnoreCase(string) ? h : i) != 0;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(BedrockFloodgateHook.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ՌծհՐմ֓֋֡֍՜֚֐֞֘աֆ֧֥֨֟֟մ", (byte)104, 69), BedrockFloodgateHook.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.B("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԟԢԅԫԪԦӺԘԝԝԲԮԤԲƨ", (byte)104, 66) + string + NLoginCore_559.D("ԧ", (byte)104, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = (0 >>> 169 | 0 << ~169 + 1) & 0xFFFFFFFF;
        var_int_b = (-1 >>> 54 | -1 << -54) & 0xFFFFFFFF;
        d = Long.reverse(5628511800466146306L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (-1 >>> 155 | -1 << -155) & 0xFFFFFFFF;
        g = Long.reverse(5628511800466146306L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0);
        j = (0 >>> 243 | 0 << ~243 + 1) & 0xFFFFFFFF;
        k = Integer.reverse(0x30000000);
        l = (6144 >>> 137 | 6144 << -137) & 0xFFFFFFFF;
        m = 8 >>> 130 | 8 << ~130 + 1;
        n = Integer.reverse(0);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(2169747286645605378L);
        q = Long.reverse(0x5000000000000000L);
        r = 1 >>> 64 | 1 << -64;
        s = (384 >>> 167 | 384 << ~167 + 1) & 0xFFFFFFFF;
        t = Long.reverse(2169747286645605378L);
        u = Long.reverse(0x5000000000000000L);
        v = Integer.reverse(0x40000000);
        w = 0 >>> 201 | 0 << ~201 + 1;
        x = (0x100000 >>> 242 | 0x100000 << -242) & 0xFFFFFFFF;
        y = Long.reverse(5628511800466146306L);
        z = 0x100000 >>> 116 | 0x100000 << -116;
        aa = Integer.reverse(-1610612736);
        ab = -1 >>> 24 | -1 << ~24 + 1;
        ac = Long.reverse(5628511800466146306L);
        ad = Integer.reverse(0x40000000);
        ae = Integer.reverse(0);
        af = 768 >>> 71 | 768 << ~71 + 1;
        ag = Long.reverse(2169747286645605378L);
        ah = Long.reverse(0x5000000000000000L);
        ai = Integer.reverse(Integer.MIN_VALUE);
        aj = Integer.reverse(-536870912);
        ak = Long.reverse(2169747286645605378L);
        al = Long.reverse(0x5000000000000000L);
        am = Integer.reverse(0x40000000);
        an = Integer.reverse(0);
        ao = Integer.reverse(0x10000000);
        ap = Integer.reverse(-1);
        aq = Long.reverse(5628511800466146306L);
        ar = (32768 >>> 111 | 32768 << -111) & 0xFFFFFFFF;
        as = Integer.reverse(-1879048192);
        at = Long.reverse(2169747286645605378L);
        au = Long.reverse(0x5000000000000000L);
        av = Integer.reverse(0x50000000);
        aw = Long.reverse(5628511800466146306L);
        ax = 1 >>> 64 | 1 << ~64 + 1;
        ay = Integer.reverse(0);
        az = Integer.reverse(-805306368);
        ba = Long.reverse(5628511800466146306L);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        BedrockFloodgateHook.b();
        String[] stringArray = new String[m];
        stringArray[BedrockFloodgateHook.n] = BedrockFloodgateHook.c("㺀", (int)o, (long)(p ^ q));
        stringArray[BedrockFloodgateHook.r] = BedrockFloodgateHook.c("㺃", (int)s, (long)(t ^ u));
        aE = BedrockFloodgateHook.a(stringArray);
        String[] stringArray2 = new String[v];
        stringArray2[BedrockFloodgateHook.w] = BedrockFloodgateHook.c("㺆", (int)x, (long)y);
        stringArray2[BedrockFloodgateHook.z] = BedrockFloodgateHook.c("㺉", (int)(aa & ab), (long)ac);
        aF = BedrockFloodgateHook.a(stringArray2);
        String[] stringArray3 = new String[ad];
        stringArray3[BedrockFloodgateHook.ae] = BedrockFloodgateHook.c("㺌", (int)af, (long)(ag ^ ah));
        stringArray3[BedrockFloodgateHook.ai] = BedrockFloodgateHook.c("㺏", (int)aj, (long)(ak ^ al));
        aG = BedrockFloodgateHook.a(stringArray3);
        String[] stringArray4 = new String[am];
        stringArray4[BedrockFloodgateHook.an] = BedrockFloodgateHook.c("㺒", (int)(ao & ap), (long)aq);
        stringArray4[BedrockFloodgateHook.ar] = BedrockFloodgateHook.c("㺕", (int)as, (long)(at ^ au));
        cH = BedrockFloodgateHook.a(null, stringArray4);
        String[] stringArray5 = new String[ax];
        stringArray5[BedrockFloodgateHook.ay] = BedrockFloodgateHook.c("㺛", (int)az, (long)ba);
        cI = BedrockFloodgateHook.a((String)BedrockFloodgateHook.c("㺘", (int)av, (long)aw), stringArray5);
    }
}

