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
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_036;
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
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_514
extends NLoginCore_098 {
    private static int eu;
    private static long cw;
    private static int dd;
    private static int dl;
    private static int em;
    private static int ex;
    private static long ca;
    private static int dz;
    private static long br;
    private static int dk;
    private static int cg;
    private static int cy;
    private static long cn;
    private static long es;
    private static long ci;
    private static long bk;
    private static int cr;
    private static long bh;
    private static int y;
    private static int dh;
    private static int ce;
    private static long at;
    private static int er;
    private static long dc;
    private static String[] var_java_lang_String_arr_e;
    private static int eq;
    private static int bn;
    private static int bd;
    private static int dt;
    private static long dy;
    private static long au;
    private static long dv;
    private static long ds;
    private static long di;
    private static long p;
    private static long cl;
    private static int dw;
    private static int dn;
    private static int dx;
    private static long cx;
    private static int ek;
    private static String[] f;
    private static int cm;
    private static long bo;
    private static long bv;
    private static int cj;
    private static long dm;
    private static long eb;
    private static long cd;
    private static int bi;
    private static long ac;
    private static long ab;
    private static int var_int_e;
    private static long ct;
    private static long dj;
    private static int bz;
    private static long bm;
    private static long cz;
    private static long cp;
    private static long ee;
    private static long df;
    private static long ck;
    private static long o;
    private static long eo;
    private static int bf;
    private static int cv;
    private static int al;
    private static long dp;
    private static long el;
    private static long by;
    private static int bu;

    private static void void_b() {
        int n;
        o = 6990374854969151101L;
        long l = o ^ 0x4F9E7ACE18B7AA6AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(59 + 10), (byte)(76 + 7), (byte)(35 + 12), (byte)(54 + 13), (byte)(9 + 57), (byte)(53 + 14), 47, (byte)(31 + 49), 75, (byte)(43 + 24), (byte)(71 + 12), (byte)(31 + 22), (byte)(15 + 65), (byte)(58 + 39), (byte)(79 + 21), (byte)(28 + 72), (byte)(67 + 38), (byte)(84 + 26), (byte)(97 + 6)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_514.f[0] = NLoginCore_027.B("ĤĤĈïñĈćĺĸďĺđĶöĳğēğĘĻłďČč", (byte)29, 66);
                    NLoginCore_514.f[1] = NLoginCore_451.C("҂ёчєѹхѻѺыѦьѡѺѱѨґ҇ѭѳѹѯҘџѠ", (byte)29, 67);
                    NLoginCore_514.f[2] = NLoginCore_092.D("єјйѨҊщѩщѷ҅ѝѨѨѻѠцяѫѦҏҘҘџѠ", (byte)29, 68);
                    NLoginCore_514.f[3] = NLoginCore_453.F("ԢԐԜԝԐԏԑ՗ԖԕՒԡ", (byte)29, 70);
                    NLoginCore_514.f[4] = NLoginCore_173.D("ёѵнїфѶѥѝѩѩћє", (byte)29, 68);
                    NLoginCore_514.f[5] = NLoginCore_091.C("пѯѽђ҄҆тѪшфѫҋѥѻ҄ѾьѥѰѹықѦҌҗѱѿҗѷғљҔҡҚ҂Ѵ҇ѥѝѹҠҗҐѽґѬҪѪѮүҫҊҙүҦѵһҜ҈ҹҷҲҹӁӆҺӃҺҝҢӅѾҩҎӆҹҤҜғӆӓҷҧӆҵӓҙӒӏӘҺҵӒҘҮҝӅҞӈӕӥӛӤӡҶӝӐҿӀӀҪӠӔҾӶӎӇӳӭӉӰҾәӳҳӀӀӎӠԆӴҾӅӾӽԁԀӉԋӾԎӨӾԋӨӥӠӨӪԈӟӠ", (byte)29, 67);
                    NLoginCore_514.f[6] = NLoginCore_027.A("ĂðüýðïñķöõĲā", (byte)29, 65);
                    NLoginCore_514.f[7] = NLoginCore_453.C("рнч҅ѝъҁѽуіҁјёѽ҂ѴѦі҆Ґ҃ѢџѠ", (byte)29, 67);
                    NLoginCore_514.f[8] = NLoginCore_384.E("ԡԥԆԵ՗ԖԶԖՄՒԨԶՈԜԠՊաԙաՕէՕԬԭ", (byte)29, 69);
                    NLoginCore_514.f[9] = NLoginCore_091.D("ѤѺ҅ѐѢњѻ҃ѤїѽѦчҁҐѦ҅Ѥѣ҆ѨѢџѠ", (byte)29, 68);
                    NLoginCore_514.f[10] = NLoginCore_384.E("ԡԥԆԵ՗ԖԶԖՄՒԫԩԜՉԪԷԸԫԛ՚ՀԯԬԭ", (byte)29, 69);
                    NLoginCore_514.f[11] = NLoginCore_027.F("ԡԥԆԵ՗ԖԶԖՄՒԩ՝ԚԬԫՒԮՂԼՔգեԬԭ", (byte)29, 70);
                    NLoginCore_514.f[12] = NLoginCore_387.D("єјйѨҊщѩщѷ҅ќѨҏ҉ѱ҇яђѢѷ҂ѲџѠ", (byte)29, 68);
                    NLoginCore_514.f[13] = NLoginCore_076.E("ԛՑՏՕԾԶՄԸԹՆԴԡ", (byte)29, 69);
                    NLoginCore_514.f[14] = NLoginCore_427.A("ĊĉĠĨïÿęĦĵíĎĨĉĵøığīďĝġĵČč", (byte)29, 65);
                    NLoginCore_514.f[15] = NLoginCore_138.B("úĞĦēĪĤïĬĊôĤĎĈęĸĢĢùēďĻŅČč", (byte)29, 66);
                    NLoginCore_514.f[16] = NLoginCore_138.D("фѐоѸ҄щѶѕҊрџҍѦюѪѥҖѦҏҏєѲџѠ", (byte)29, 68);
                    NLoginCore_514.f[17] = NLoginCore_173.C("фѐоѸ҄щѶѕҊрџҍѦюѪѥҖѦҏҏєѲџѠ", (byte)29, 67);
                    NLoginCore_514.f[18] = NLoginCore_427.C("пѱ҃ҁҀўѹѶўҁѢщћя҅ѪҀѐҍђ҇҈џѠ", (byte)29, 67);
                    NLoginCore_514.f[19] = NLoginCore_324.E("ԤԡՂԧԷԴԢԧՋԧ՚ԡ", (byte)29, 69);
                    NLoginCore_514.f[20] = NLoginCore_091.D("їєѵњѪѧѕњѾњҍє", (byte)29, 68);
                    NLoginCore_514.f[21] = NLoginCore_223.F("ԌԋԑԨԢԥԔԒԷԺԸՋԗ՟աԸԭ՝ԟՖԼԯԬԭ", (byte)29, 70);
                    NLoginCore_514.f[22] = NLoginCore_027.B("ìëñĈĂąôòėĚĘī÷ĿŁĘčĽÿĶĜďČč", (byte)29, 66);
                    NLoginCore_514.f[23] = NLoginCore_559.F("ՃԴԧՉՉԉՏՕՎԲ՛ՏԔԱԷԲԠԳԴԢ՟ԿԬԭ", (byte)29, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_514.f[0] = NLoginCore_091.E("ՄՄԨԏԑԨԧ՚՘ԯ՛ԏԜԪՎԶՏՌԲՂՁՕԬԭ", (byte)29, 69);
                    NLoginCore_514.f[1] = NLoginCore_324.E("ՏԞԔԡՆԒՈՇԘԳԗԭՉԿԚբ՗ԴՠՑբեԬԭ", (byte)29, 69);
                    NLoginCore_514.f[2] = NLoginCore_004.C("єјйѨҊщѩщѷ҅ћѱѬѭяцѰѬѳҋҊѢџѠ", (byte)29, 67);
                    NLoginCore_514.f[3] = NLoginCore_076.B("ĜăìòĤĬòĺðöĈĸĹñÿŀĎńķüęğČč", (byte)29, 66);
                    NLoginCore_514.f[4] = NLoginCore_110.E("ԧԴԤԒՀ՘ԵԔԓԳԵԯՏՓԸԝԙԬՙԣԴեԬԭ", (byte)29, 69);
                    NLoginCore_514.f[5] = NLoginCore_138.F("ԌԼՊԟՑՓԏԷԕԑԸ՘ԲՈՑՋԙԲԽՆԘըԳՙդԾՌդՄՠԦածէՏՁՔԲԪՆխդ՝Պ՞ԹշԷԻռո՗զռճՂֈթՕֆքտֆ֎֓և֐ևժկ֒Ջն՛֓ֆձթՠ֓֠քմ֓ւ֠զ֥֟֜ևւ֟եջժ֒իֱֲ֢֮֕֨փ֪֝֌֍֍շ֭֡֋׃֛֔׀ֺֽ֖֋֦׀ր֍֍֛֭דׁ֋֒׋׊׎׍֖חֻ֚֜ןֶ֫גךבןץ֭֬", (byte)29, 70);
                    NLoginCore_514.f[6] = NLoginCore_223.D("ѝюѯѤѡѧҀѷѢэыѥѭѠѼѝѱҐ҈ѪѥҘџѠ", (byte)29, 68);
                    NLoginCore_514.f[7] = NLoginCore_027.A("íêôĲĊ÷ĮĪðăıĪďĒĘĢĀĹüĶĢğČč", (byte)29, 65);
                    NLoginCore_514.f[8] = NLoginCore_223.F("ԡԥԆԵ՗ԖԶԖՄՒԨԱԞԞաՖԞՐՅԸԽՕԬԭ", (byte)29, 70);
                    NLoginCore_514.f[9] = NLoginCore_091.F("ԱՇՒԝԯԧՈՐԱԤՋԱՌԸԬՔ՝ՐԴ՜ԺԣԸԨ՝զԨ՘ՀկըՊ", (byte)29, 70);
                    NLoginCore_514.f[10] = NLoginCore_384.C("єјйѨҊщѩщѷ҅ќњыѝҋҋ҆ѿєѤҏѲџѠ", (byte)29, 67);
                    NLoginCore_514.f[11] = NLoginCore_027.D("єјйѨҊщѩщѷ҅ѝѫѝѦѾѳҕѯѲѮѹѲџѠ", (byte)29, 68);
                    NLoginCore_514.f[12] = NLoginCore_223.B("āąæĕķöĖöĤĲċĻđėĠīğýĘąĺğČč", (byte)29, 66);
                    NLoginCore_514.f[13] = NLoginCore_384.A("ĳąćčİõïùħċĮā", (byte)29, 65);
                    NLoginCore_514.f[14] = NLoginCore_138.B("ĊĉĠĨïÿęĦĵíČĞľĭŁþļĤĵĎěĵČč", (byte)29, 66);
                    NLoginCore_514.f[15] = NLoginCore_027.A("úĞĦēĪĤïĬĊôĤĞûĖĶĵāďĬĺĠŅČč", (byte)29, 65);
                    NLoginCore_514.f[16] = NLoginCore_110.B("ñýëĥıöģĂķíČĩĭŀĈĖķýğĥĳğČč", (byte)29, 66);
                    NLoginCore_514.f[17] = NLoginCore_201.E("ԑԝԋՅՑԖՃԢ՗ԍԭՋՐԗԚԻ՞ԱՑԹ՝եԬԭ", (byte)29, 69);
                    NLoginCore_514.f[18] = NLoginCore_387.F("ԌԾՐՎՍԫՆՃԫՎԯՇԩՒաԪԸՍԮեՆՈՖԣՂՔԫաժՃձՇ", (byte)29, 70);
                    NLoginCore_514.f[19] = NLoginCore_384.E("԰ԒԲԶԒԯԓԥԓՔ԰ԡ", (byte)29, 69);
                    NLoginCore_514.f[20] = NLoginCore_004.D("ѐљўѰєіѾ҇Ҍҏѣє", (byte)29, 68);
                    NLoginCore_514.f[21] = NLoginCore_138.E("ԌԋԑԨԢԥԔԒԷԺԻԜԷՏՀ՚ԝՓԻԠՆԿԬԭ", (byte)29, 69);
                    NLoginCore_514.f[22] = NLoginCore_223.E("ԌԋԑԨԢԥԔԒԷԺԻԧԚԮԶՕՀԶ՞Ԣ՛ԿԬԭ", (byte)29, 69);
                    NLoginCore_514.f[23] = NLoginCore_076.C("ѶѧњѼѼм҂҈ҁѥҍѢ҄ѩѝ҆ғєѯѨѷѢџѠ", (byte)29, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_514.f[0] = NLoginCore_387.F("ԎԪԆՌՌԉԕԕԧՐԎՅԴԘԴԴՔՠԬԢԢԯԬԭ", (byte)29, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_514.f[0] = NLoginCore_201.C("сѓѱѰ҃Ҁѳѽъчѿтҋў҃ѽѾяѩѱѷѢџѠ", (byte)29, 67);
                }
            }
        }
    }

    static {
        var_int_e = (0 >>> 79 | 0 << ~79 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-6885367508712079226L);
        y = 0x20000000 >>> 61 | 0x20000000 << -61;
        ab = Long.reverse(-4723639687574241146L);
        ac = Long.reverse(0x1E00000000000000L);
        al = (32768 >>> 206 | 32768 << ~206 + 1) & 0xFFFFFFFF;
        at = Long.reverse(-4723639687574241146L);
        au = Long.reverse(0x1E00000000000000L);
        bd = Integer.reverse(-1073741824);
        bf = -1 >>> 44 | -1 << -44;
        bh = Long.reverse(-6885367508712079226L);
        bi = 0x10000000 >>> 218 | 0x10000000 << ~218 + 1;
        bk = Long.reverse(-4723639687574241146L);
        bm = Long.reverse(0x1E00000000000000L);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(-4723639687574241146L);
        br = Long.reverse(0x1E00000000000000L);
        bu = (0x60000000 >>> 60 | 0x60000000 << ~60 + 1) & 0xFFFFFFFF;
        bv = Long.reverse(-4723639687574241146L);
        by = Long.reverse(0x1E00000000000000L);
        bz = (3584 >>> 201 | 3584 << -201) & 0xFFFFFFFF;
        ca = Long.reverse(-4723639687574241146L);
        cd = Long.reverse(0x1E00000000000000L);
        ce = Integer.reverse(0x10000000);
        cg = (-1 >>> 223 | -1 << ~223 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-6885367508712079226L);
        cj = 144 >>> 68 | 144 << -68;
        ck = Long.reverse(-4723639687574241146L);
        cl = Long.reverse(0x1E00000000000000L);
        cm = (0x140000 >>> 145 | 0x140000 << -145) & 0xFFFFFFFF;
        cn = Long.reverse(-4723639687574241146L);
        cp = Long.reverse(0x1E00000000000000L);
        cr = (0x16000000 >>> 121 | 0x16000000 << ~121 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(-6885367508712079226L);
        cv = Integer.reverse(0x30000000);
        cw = Long.reverse(-4723639687574241146L);
        cx = Long.reverse(0x1E00000000000000L);
        cy = Integer.reverse(-1342177280);
        cz = Long.reverse(-4723639687574241146L);
        dc = Long.reverse(0x1E00000000000000L);
        dd = Integer.reverse(0x70000000);
        df = Long.reverse(-6885367508712079226L);
        dh = (30 >>> 97 | 30 << -97) & 0xFFFFFFFF;
        di = Long.reverse(-4723639687574241146L);
        dj = Long.reverse(0x1E00000000000000L);
        dk = Integer.reverse(0x8000000);
        dl = (-1 >>> 185 | -1 << -185) & 0xFFFFFFFF;
        dm = Long.reverse(-6885367508712079226L);
        dn = (272 >>> 100 | 272 << ~100 + 1) & 0xFFFFFFFF;
        dp = Long.reverse(-4723639687574241146L);
        ds = Long.reverse(0x1E00000000000000L);
        dt = Integer.reverse(0x48000000);
        dv = Long.reverse(-6885367508712079226L);
        dw = 0x980000 >>> 51 | 0x980000 << -51;
        dx = Integer.reverse(-1);
        dy = Long.reverse(-6885367508712079226L);
        dz = 655360 >>> 47 | 655360 << ~47 + 1;
        eb = Long.reverse(-4723639687574241146L);
        ee = Long.reverse(0x1E00000000000000L);
        ek = Integer.reverse(-1476395008);
        el = Long.reverse(-6885367508712079226L);
        em = 0x2C00000 >>> 117 | 0x2C00000 << -117;
        eo = Long.reverse(-6885367508712079226L);
        eq = (94208 >>> 172 | 94208 << ~172 + 1) & 0xFFFFFFFF;
        er = Integer.reverse(-1);
        es = Long.reverse(-6885367508712079226L);
        eu = Integer.reverse(0x18000000);
        ex = 0x600000 >>> 242 | 0x600000 << ~242 + 1;
        var_java_lang_String_arr_e = new String[eu];
        f = new String[ex];
        NLoginCore_514.void_b();
    }

    @Override
    protected void b(ResultSet resultSet) {
        JSONObject jSONObject = new JSONObject(resultSet.getString((String)NLoginCore_514.c("㺀", (int)cy, (long)(cz ^ dc))));
        this.r = jSONObject.getString((String)NLoginCore_514.c("㺃", (int)dd, (long)df));
        long l = jSONObject.getLong((String)NLoginCore_514.c("㺆", (int)dh, (long)(di ^ dj)));
        long l2 = jSONObject.has((String)NLoginCore_514.c("㺉", (int)(dk & dl), (long)dm)) ? jSONObject.getLong((String)NLoginCore_514.c("㺌", (int)dn, (long)(dp ^ ds))) : System.currentTimeMillis();
        boolean bl = jSONObject.getBoolean((String)NLoginCore_514.c("㺏", (int)dt, (long)dv));
        String string = jSONObject.has((String)NLoginCore_514.c("㺒", (int)(dw & dx), (long)dy)) ? jSONObject.getString((String)NLoginCore_514.c("㺕", (int)dz, (long)(eb ^ ee))) : null;
        String string2 = jSONObject.has((String)NLoginCore_514.c("㺘", (int)ek, (long)el)) ? jSONObject.getString((String)NLoginCore_514.c("㺛", (int)em, (long)eo)) : null;
        String string3 = (String)NLoginCore_514.c("㺞", (int)(eq & er), (long)es) + string2;
        Consumer<ForceRegisterConfig> consumer = ForceRegisterConfig2 -> ForceRegisterConfig2.a(l, l2);
        if (bl) {
            this.a(this.r, string3, string, null, null, consumer);
        } else {
            this.a(this.r, string3, string, null, consumer);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x78L;
        l ^= 0x4F9E7ACE18B7AA6AL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(63 + 6), (byte)(73 + 10), (byte)(7 + 40), (byte)(47 + 20), (byte)(42 + 24), (byte)(5 + 62), (byte)(23 + 24), (byte)(48 + 32), (byte)(18 + 57), (byte)(2 + 65), (byte)(60 + 23), (byte)(2 + 51), (byte)(55 + 25), (byte)(83 + 14), (byte)(48 + 52), (byte)(48 + 52), (byte)(68 + 37), 110, (byte)(94 + 9)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.C("ҟҬҫѮҮҪҥҮҹҨѵҳҷҰҳҹѻࠍࠊࠐ߳ߺࠛࠓࠉࠜࠞࠞࠀࠔࠌࠤ", (byte)45, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_514.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_514(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_d, (String)NLoginCore_514.c("㺀", (int)var_int_e, (long)p), (String)NLoginCore_514.c("㺃", (int)y, (long)(ab ^ ac)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_514.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_387.B("ōůűőŵƔƌƢƎŝƛƑƟƙŢƇƩƨƠƦƠŵ", (byte)83, 66), NLoginCore_514.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.A("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӶӳӹӜӣԄӼӲԅԇԇөӽӵԍſ", (byte)83, 65) + string + NLoginCore_027.A("ş", (byte)83, 65) + methodType.toString(), exception);
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_514.c("㺀", (int)al, (long)(at ^ au)), (String)NLoginCore_514.c("㺃", (int)(bd & bf), (long)bh));
        if (((String)NLoginCore_514.c("㺆", (int)bi, (long)(bk ^ bm))).equals(string)) {
            throw new UnsupportedOperationException((String)NLoginCore_514.c("㺉", (int)bn, (long)(bo ^ br)));
        }
        boolean bl = ((String)NLoginCore_514.c("㺌", (int)bu, (long)(bv ^ by))).equals(string);
        if (bl) {
            File file = new File(this.java_io_File_b(), (String)NLoginCore_514.c("㺏", (int)bz, (long)(ca ^ cd)));
            this.d = NLoginCore_586.a(this.m, file, new Properties());
        } else {
            String string2 = NLoginCore_2192.a(NLoginCore_514.c("㺒", (int)(ce & cg), (long)ci), (String)NLoginCore_514.c("㺕", (int)cj, (long)(ck ^ cl)));
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_514.c("㺘", (int)cm, (long)(cn ^ cp)));
            String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_514.c("㺛", (int)cr, (long)ct));
            String string5 = NLoginCore_2192.java_lang_String_b(NLoginCore_514.c("㺞", (int)cv, (long)(cw ^ cx)));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string2, string3, string4, string5, new Properties(), NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.i()));
        }
    }
}

