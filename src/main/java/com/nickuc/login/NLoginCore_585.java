/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_585
extends NLoginCore_098 {
    private static int bz;
    private static long es;
    private static long by;
    private static long dv;
    private static long eb;
    private static int ce;
    private static int ec;
    private static int bj;
    private static int ed;
    private static long cp;
    private static int ea;
    private static int cj;
    private static long dy;
    private static long ci;
    private static long ee;
    private static int dr;
    private static long dp;
    private static int bp;
    private static String[] f;
    private static long dc;
    private static int cm;
    private static long bk;
    private static long at;
    private static long bh;
    private static long ca;
    private static long ds;
    private static long dm;
    private static long cu;
    private static long cz;
    private static int bl;
    private static int dh;
    private static long ev;
    private static long br;
    private static long di;
    private static long be;
    private static long cd;
    private static long bs;
    private static long df;
    private static int ex;
    private static long cx;
    private static int cr;
    private static int var_int_e;
    private static long cf;
    private static long p;
    private static int bi;
    private static int al;
    private static long bo;
    private static long cw;
    private static long ck;
    private static long dj;
    private static int bd;
    private static int eu;
    private static int dd;
    private static int ek;
    private static String[] var_java_lang_String_arr_e;
    private static int cv;
    private static int eq;
    private static long ct;
    private static long ab;
    private static int em;
    private static int dt;
    private static long et;
    private static long eo;
    private static int dk;
    private static int dz;
    private static long bm;
    private static long el;
    private static int ey;
    private static long ew;
    private static int cy;
    private static int bu;
    private static long o;
    private static int co;
    private static int dq;
    private static long bv;
    private static int y;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_585.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.E("ԉԫԭԍԱՐՈ՞Պԙ՗Ս՛ՕԞՃեդ՜բ՜Ա", (byte)37, 69), NLoginCore_585.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.C("҇ҔғіҖҒҍҖҡҐѝқҟҘқҡѣ߸ߑ߫ߴߡ߬ߞࠅߴߴѹ", (byte)37, 67) + string + NLoginCore_453.F("ԛ", (byte)37, 70) + methodType.toString(), exception);
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        JSONObject jSONObject = new JSONObject(resultSet.getString((String)NLoginCore_585.c("㺀", (int)cv, (long)(cw ^ cx))));
        this.r = jSONObject.getString((String)NLoginCore_585.c("㺃", (int)cy, (long)(cz ^ dc)));
        String string = jSONObject.getString((String)NLoginCore_585.c("㺆", (int)dd, (long)df));
        if (!string.startsWith((String)NLoginCore_585.c("㺉", (int)dh, (long)(di ^ dj))) && !string.startsWith((String)NLoginCore_585.c("㺌", (int)dk, (long)(dm ^ dp)))) {
            int n = string.length();
            switch (n) {
                case 32: {
                    string = (String)NLoginCore_585.c("㺏", (int)(dq & dr), (long)ds) + string;
                    break;
                }
                case 64: {
                    string = (String)NLoginCore_585.c("㺒", (int)dt, (long)(dv ^ dy)) + string;
                    break;
                }
                case 128: {
                    string = (String)NLoginCore_585.c("㺕", (int)(dz & ea), (long)eb) + string;
                    break;
                }
                default: {
                    this.e(this.r, string, null);
                    return;
                }
            }
        }
        String string2 = jSONObject.getString((String)NLoginCore_585.c("㺘", (int)(ec & ed), (long)ee));
        Long l = null;
        Long l2 = null;
        if (jSONObject.has((String)NLoginCore_585.c("㺛", (int)ek, (long)el))) {
            l = jSONObject.getLong((String)NLoginCore_585.c("㺞", (int)em, (long)eo));
        }
        if (jSONObject.has((String)NLoginCore_585.c("㺡", (int)eq, (long)(es ^ et)))) {
            l2 = jSONObject.getLong((String)NLoginCore_585.c("㺤", (int)eu, (long)(ev ^ ew)));
        }
        Long l3 = l;
        Long l4 = l2;
        this.a(this.r, string, string2, null, (ForceRegisterConfig ForceRegisterConfig2) -> {
            if (l3 != null) {
                ForceRegisterConfig2.a(l3, l4);
            }
        });
    }

    public NLoginCore_585(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_w, (String)NLoginCore_585.c("㺀", (int)var_int_e, (long)p), (String)NLoginCore_585.c("㺃", (int)y, (long)ab));
    }

    private static String a(int n, long l) {
        l ^= 0x28L;
        l ^= 0x442CE18CAA28176BL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(65 + 4), 83, (byte)(15 + 32), 67, (byte)(65 + 1), (byte)(28 + 39), (byte)(34 + 13), (byte)(71 + 9), (byte)(20 + 55), (byte)(48 + 19), (byte)(72 + 11), (byte)(16 + 37), (byte)(59 + 21), (byte)(71 + 26), (byte)(29 + 71), (byte)(22 + 78), (byte)(4 + 101), (byte)(51 + 59), (byte)(52 + 51)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(40 + 29), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("՝ժթԬլըգլշզԳձյծձշԹ࣎ࢧࣁ࣊ࢷࣂࢴࣛ࣊࣊", (byte)62, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_585.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = -3462371230522987896L;
        long l = o ^ 0x442CE18CAA28176BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(32 + 37), (byte)(22 + 61), (byte)(14 + 33), (byte)(64 + 3), (byte)(50 + 16), (byte)(27 + 40), (byte)(35 + 12), (byte)(31 + 49), (byte)(61 + 14), (byte)(21 + 46), (byte)(36 + 47), (byte)(23 + 30), (byte)(23 + 57), (byte)(85 + 12), (byte)(88 + 12), (byte)(55 + 45), (byte)(26 + 79), 110, 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(11 + 58), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_585.f[0] = NLoginCore_223.D("ҍѧҘҙѳљҙҍѢҠѲ҈ѲѽѩѥҘѨѸҪҜҰѷѸ", (byte)37, 68);
                    NLoginCore_585.f[1] = NLoginCore_173.B("ĢłĖĘŁħĢĨķĴħķĞĹďďīĐĨĤĲŕĜĝ", (byte)37, 66);
                    NLoginCore_585.f[2] = NLoginCore_091.C("ѝѽѬўѾјѾѯѻјҥѥѦҪҟҡѪқѿҁѱҠѷѸ", (byte)37, 67);
                    NLoginCore_585.f[3] = NLoginCore_451.E("ՐՅ՜ԵՍԫԜԙ՟՗՞ՔԲ՘ԺՁէԴՃ՝ԬՇԴԵ", (byte)37, 69);
                    NLoginCore_585.f[4] = NLoginCore_201.C("ҊўѭѪѴљѮіҝңѹѨѿѷқ҈ҌѸѮ҆ѫҠѷѸ", (byte)37, 67);
                    NLoginCore_585.f[5] = NLoginCore_559.B("ĎīĺđĮĿİłĚĻĨļĶĆĠŏĮĨēņŉğĜĝ", (byte)37, 66);
                    NLoginCore_585.f[6] = NLoginCore_223.A("ċįÿĞĮĘľļŅĕĥľļĿĨęļĊĐĴĪŕĜĝ", (byte)37, 65);
                    NLoginCore_585.f[7] = NLoginCore_451.B("ùĹĄāāŅĞĈĹěĺđ", (byte)37, 66);
                    NLoginCore_585.f[8] = NLoginCore_451.B("ĹċĜńĿĥĠĘŀłĦĪĞċĜőŐąĲĮŗŅĜĝ", (byte)37, 66);
                    NLoginCore_585.f[9] = NLoginCore_201.E("ՕԖ՛՞ԐՒՐԸԴՠՒԩ", (byte)37, 69);
                    NLoginCore_585.f[10] = NLoginCore_076.B("üİĜġþńłģĉĩĽĆŃŁďńįōŒŇĦŅĜĝ", (byte)37, 66);
                    NLoginCore_585.f[11] = NLoginCore_027.A("ùėĥĔėńľĲĉýŊđ", (byte)37, 65);
                    NLoginCore_585.f[12] = NLoginCore_559.D("ҍҔћҐҔѬ҃ѾҐѤѠң҉ѹҝѩѸѹ҈ҢҎҊѷѸ", (byte)37, 68);
                    NLoginCore_585.f[13] = NLoginCore_027.D("҅қѩҖҖѲҌҞ҂ѵѷѬ", (byte)37, 68);
                    NLoginCore_585.f[14] = NLoginCore_559.C("ѺѰёҞҠѢѠѺҟҡѢѬ", (byte)37, 67);
                    NLoginCore_585.f[15] = NLoginCore_173.F("ԧԸԛՙ԰ԚԯԽԞԠՎԩ", (byte)37, 70);
                    NLoginCore_585.f[16] = NLoginCore_027.A("ěıĭĽĥĶġāěňĶđ", (byte)37, 65);
                    NLoginCore_585.f[17] = NLoginCore_004.C("ҏғ҇ғѠҙѲҘѹҠѷѬ", (byte)37, 67);
                    NLoginCore_585.f[18] = NLoginCore_091.A("ĿýĴńİěĩŁĦňăđ", (byte)37, 65);
                    NLoginCore_585.f[19] = NLoginCore_384.F("ԧՙԶԴՖՑԬՋ՛ԙաՙՔՃԷ՜Ջդ՚ԥԾԷԴԵ", (byte)37, 70);
                    NLoginCore_585.f[20] = NLoginCore_453.E("ՒԼԔԪՇՋՀԯՊՀԣ՘ԴՓ՗ԷՈԼլՆզԷԴԵ", (byte)37, 69);
                    NLoginCore_585.f[21] = NLoginCore_446.C("ҞғѻѵҝҞҗҒѠјѷѬ", (byte)37, 67);
                    NLoginCore_585.f[22] = NLoginCore_138.E("ՅԛԚ՛ԚԝՎԵԽԿԣԩ", (byte)37, 69);
                    NLoginCore_585.f[23] = NLoginCore_453.D("҈ўѝҞѝѠґѸҀ҂ѦѬ", (byte)37, 68);
                    NLoginCore_585.f[24] = NLoginCore_427.D("ҔјѧѼҐѹѽҜғѰѼҘћҘѤҔҘҀ҆҉ѯҠѷѸ", (byte)37, 68);
                    NLoginCore_585.f[25] = NLoginCore_092.C("ҔјѧѼҐѹѽҜғѰѼҘћҘѤҔҘҀ҆҉ѯҠѷѸ", (byte)37, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_585.f[0] = NLoginCore_004.D("ҍѧҘҙѳљҙҍѢҠѲњѶќ҉Ҕ҇ѽҮѰѬѺѷѸ", (byte)37, 68);
                    NLoginCore_585.f[1] = NLoginCore_324.C("ѽҝѱѳҜ҂ѽ҃ҒҏѿңңѦҋҝ҈қҀѽҞҠѷѸ", (byte)37, 67);
                    NLoginCore_585.f[2] = NLoginCore_559.B("ĂĢđăģýģĔĠýŊłĦŌņĈĐěŋňĦĴńőēģŊĺŌşśı", (byte)37, 66);
                    NLoginCore_585.f[3] = NLoginCore_004.E("ՐՅ՜ԵՍԫԜԙ՟՗՞Կ՝ԟԟԴԡ՗ԷԵԷԷԴԵ", (byte)37, 69);
                    NLoginCore_585.f[4] = NLoginCore_138.F("ՇԛԪԧԱԖԫԓ՚ՠԶեԸՆԚՂԨեՂՙՆՇԴԵ", (byte)37, 70);
                    NLoginCore_585.f[5] = NLoginCore_559.B("ĎīĺđĮĿİłĚĻĩĥĖĆĚĐňĝŏĞĮŅĜĝ", (byte)37, 66);
                    NLoginCore_585.f[6] = NLoginCore_453.B("ċįÿĞĮĘľļŅĕĥŌŅęŁĐŇŎħďġğĜĝ", (byte)37, 66);
                    NLoginCore_585.f[7] = NLoginCore_201.D("Ҍѿ҉їѻҘџҀғўўѤҕѨҪҠѻѬҥҨѻҠѷѸ", (byte)37, 68);
                    NLoginCore_585.f[8] = NLoginCore_201.D("ҔѦѷҟҚҀѻѳқҝҁѣѻѪ҈ҭҡҎѥ҇ҢҰѷѸ", (byte)37, 68);
                    NLoginCore_585.f[9] = NLoginCore_387.D("ҕҟ҇ѩѶңѵѡѡҁҝѬ", (byte)37, 68);
                    NLoginCore_585.f[10] = NLoginCore_384.C("їҋѷѼљҟҝѾѤ҄ҖҀџҝ҉ңҥ҅ҢҝҡҰѷѸ", (byte)37, 67);
                    NLoginCore_585.f[11] = NLoginCore_027.D("ҔѾҠҌѱҘѫҠҘҢѻѬ", (byte)37, 68);
                    NLoginCore_585.f[12] = NLoginCore_387.B("ĲĹĀĵĹđĨģĵĉąĆěĜĹĉĝĜħĐĐŕĜĝ", (byte)37, 66);
                    NLoginCore_585.f[13] = NLoginCore_027.A("ŀĸĒİĤđĦĤĵĶĘđ", (byte)37, 65);
                    NLoginCore_585.f[14] = NLoginCore_076.F("ՖԯՖԸԨԫԭՁԼԳԲԵԳ՜էԤըԪՄԪԻ՝ԴԵ", (byte)37, 70);
                    NLoginCore_585.f[15] = NLoginCore_004.A("ĿĂüĜĆŇėÿňłīģīġĊăĦŎŏōŅŕĜĝ", (byte)37, 65);
                    NLoginCore_585.f[16] = NLoginCore_138.D("ҌѷҚҌғѠѶѢѰѤ҃Ѭ", (byte)37, 68);
                    NLoginCore_585.f[17] = NLoginCore_091.C("яҖҠѺѹғҌѴҜѹҡѬ", (byte)37, 67);
                    NLoginCore_585.f[18] = NLoginCore_201.E("ԘԺՖԷՋԪՎԝԺՍԻԶ՚ԾԹԢՋԤԾիԮխԴԵ", (byte)37, 69);
                    NLoginCore_585.f[19] = NLoginCore_451.D("ѪҜѹѷҙҔѯҎҞќңѢҨѡҗѥҋѻҝѻҀҰѷѸ", (byte)37, 68);
                    NLoginCore_585.f[20] = NLoginCore_453.F("ՒԼԔԪՇՋՀԯՊՀԤ՞ՙՃ՟ՂՊ՘ՈԼ՟ԷԴԵ", (byte)37, 70);
                    NLoginCore_585.f[21] = NLoginCore_559.B("ĊĀĭĄøĲŉĳĨĦņđ", (byte)37, 66);
                    NLoginCore_585.f[22] = NLoginCore_559.A("čĳĸńýŃĲěľććĝīōŏćĒĞđĪŕğĜĝ", (byte)37, 65);
                    NLoginCore_585.f[23] = NLoginCore_027.A("ĵġĳņüįęēĦĵĄĚĥĺŏČĪłŐŀĕŅĜĝ", (byte)37, 65);
                    NLoginCore_585.f[24] = NLoginCore_201.D("ҔјѧѼҐѹѽҜғѰѻҥ҈҅ѤҀ҃ҧ҉Ҙ҇ҠѷѸ", (byte)37, 68);
                    NLoginCore_585.f[25] = NLoginCore_384.F("ՑԕԤԹՍԶԺՙՐԭԹգԤԢՉզԡգԵՅՏՇԴԵ", (byte)37, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_585.f[0] = NLoginCore_223.E("՚ԶՌԚԘՍԨՠՕաԞԱ՞ՔՕ՞ԨՋԬԪիԬՇՙՠդԲՊՎՍյ՗", (byte)37, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_585.f[0] = NLoginCore_091.E("՚ՑԙՍԝ՜Ջ՞՘ՠ԰՛՚ԙՃԣՕԷ՝ՆծխԴԵ", (byte)37, 69);
                }
            }
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        boolean bl = NLoginCore_2192.d(NLoginCore_585.c("㺀", (int)al, (long)at));
        if (bl) {
            int n = NLoginCore_2192.a(NLoginCore_585.c("㺃", (int)bd, (long)(be ^ bh)), bi);
            String string = NLoginCore_2192.a(NLoginCore_585.c("㺆", (int)bj, (long)bk), (String)NLoginCore_585.c("㺉", (int)NLoginCore_585.bl, (long)(bm ^ bo)));
            String string2 = NLoginCore_2192.a(NLoginCore_585.c("㺌", (int)bp, (long)(br ^ bs)), (String)NLoginCore_585.c("㺏", (int)bu, (long)(bv ^ by)));
            String string3 = NLoginCore_2192.a(NLoginCore_585.c("㺒", (int)bz, (long)(ca ^ cd)), (String)NLoginCore_585.c("㺕", (int)ce, (long)(cf ^ ci)));
            String string4 = NLoginCore_2192.a(NLoginCore_585.c("㺘", (int)cj, (long)ck), (String)NLoginCore_585.c("㺛", (int)(cm & co), (long)cp));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, n, string2, string3, string4, new Properties()));
        } else {
            File file = new File(this.java_io_File_b(), (String)NLoginCore_585.c("㺞", (int)cr, (long)(ct ^ cu)));
            this.d = NLoginCore_586.a(this.m, file, new Properties());
        }
    }

    static {
        var_int_e = 0 >>> 151 | 0 << ~151 + 1;
        p = Long.reverse(384112375742386163L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(384112375742386163L);
        al = Integer.reverse(0x40000000);
        at = Long.reverse(384112375742386163L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(1248803504197521395L);
        bh = Long.reverse(0x1400000000000000L);
        bi = Integer.reverse(1462763520);
        bj = 8192 >>> 107 | 8192 << -107;
        bk = Long.reverse(384112375742386163L);
        bl = Integer.reverse(-1610612736);
        bm = Long.reverse(1248803504197521395L);
        bo = Long.reverse(0x1400000000000000L);
        bp = 49152 >>> 237 | 49152 << ~237 + 1;
        br = Long.reverse(1248803504197521395L);
        bs = Long.reverse(0x1400000000000000L);
        bu = (458752 >>> 208 | 458752 << ~208 + 1) & 0xFFFFFFFF;
        bv = Long.reverse(1248803504197521395L);
        by = Long.reverse(0x1400000000000000L);
        bz = (2 >>> 30 | 2 << ~30 + 1) & 0xFFFFFFFF;
        ca = Long.reverse(1248803504197521395L);
        cd = Long.reverse(0x1400000000000000L);
        ce = Integer.reverse(-1879048192);
        cf = Long.reverse(1248803504197521395L);
        ci = Long.reverse(0x1400000000000000L);
        cj = Integer.reverse(0x50000000);
        ck = Long.reverse(384112375742386163L);
        cm = Integer.reverse(-805306368);
        co = (-1 >>> 53 | -1 << -53) & 0xFFFFFFFF;
        cp = Long.reverse(384112375742386163L);
        cr = Integer.reverse(0x30000000);
        ct = Long.reverse(1248803504197521395L);
        cu = Long.reverse(0x1400000000000000L);
        cv = Integer.reverse(-1342177280);
        cw = Long.reverse(1248803504197521395L);
        cx = Long.reverse(0x1400000000000000L);
        cy = 57344 >>> 236 | 57344 << ~236 + 1;
        cz = Long.reverse(1248803504197521395L);
        dc = Long.reverse(0x1400000000000000L);
        dd = 120 >>> 3 | 120 << -3;
        df = Long.reverse(384112375742386163L);
        dh = 0x200000 >>> 17 | 0x200000 << ~17 + 1;
        di = Long.reverse(1248803504197521395L);
        dj = Long.reverse(0x1400000000000000L);
        dk = (-2147483640 >>> 159 | -2147483640 << -159) & 0xFFFFFFFF;
        dm = Long.reverse(1248803504197521395L);
        dp = Long.reverse(0x1400000000000000L);
        dq = (72 >>> 162 | 72 << ~162 + 1) & 0xFFFFFFFF;
        dr = -1 >>> 24 | -1 << -24;
        ds = Long.reverse(384112375742386163L);
        dt = Integer.reverse(-939524096);
        dv = Long.reverse(1248803504197521395L);
        dy = Long.reverse(0x1400000000000000L);
        dz = (0xA000000 >>> 23 | 0xA000000 << -23) & 0xFFFFFFFF;
        ea = Integer.reverse(-1);
        eb = Long.reverse(384112375742386163L);
        ec = Integer.reverse(-1476395008);
        ed = Integer.reverse(-1);
        ee = Long.reverse(384112375742386163L);
        ek = Integer.reverse(0x68000000);
        el = Long.reverse(384112375742386163L);
        em = Integer.reverse(-402653184);
        eo = Long.reverse(384112375742386163L);
        eq = (1536 >>> 102 | 1536 << ~102 + 1) & 0xFFFFFFFF;
        es = Long.reverse(1248803504197521395L);
        et = Long.reverse(0x1400000000000000L);
        eu = 0x640000 >>> 146 | 0x640000 << -146;
        ev = Long.reverse(1248803504197521395L);
        ew = Long.reverse(0x1400000000000000L);
        ex = (0xD00000 >>> 211 | 0xD00000 << ~211 + 1) & 0xFFFFFFFF;
        ey = Integer.reverse(0x58000000);
        var_java_lang_String_arr_e = new String[ex];
        f = new String[ey];
        NLoginCore_585.void_b();
    }
}

