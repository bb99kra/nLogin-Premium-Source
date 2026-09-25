/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_066
extends NLoginCore_098 {
    private static long ef;
    private static long be;
    private static long p;
    private static long by;
    private static long ee;
    private static int ec;
    private static long ck;
    private static int m;
    private static long cx;
    private static int fp;
    private static int fh;
    private static int fv;
    private static int dl;
    private static int dq;
    private static long fq;
    private static long gi;
    private static long eo;
    private static long gb;
    private static long cn;
    private static long dm;
    private static long ge;
    private static long fn;
    private static long ci;
    private static long bk;
    private static int eu;
    private static int dd;
    private static int ey;
    private static int bz;
    private static long at;
    private static int bn;
    private static int cm;
    private static int ea;
    private static int eq;
    private static long cp;
    private static int bi;
    private static long dy;
    private static int ek;
    private static int ex;
    private static long bh;
    private static long ga;
    private static long bm;
    private static int em;
    private static long br;
    private static long ds;
    private static int bd;
    private static int bp;
    private static long dg;
    private static int gm;
    private static long di;
    private static long fo;
    private static int cg;
    private static long fx;
    private static int cb;
    private static int cy;
    private static int dz;
    private static int dk;
    private static long et;
    private static String[] f;
    private static long dv;
    private static int fz;
    private static int bj;
    private static long ct;
    private static int bu;
    private static int al;
    private static long df;
    private static int cfr_renamed_1;
    private static int fl;
    private static int dx;
    private static int gj;
    private static long dc;
    private static long ab;
    private static long o;
    private static int bw;
    private static int dn;
    private static long ac;
    private static long fi;
    private static long dj;
    private static int dw;
    private static long dp;
    private static String[] var_java_lang_String_arr_e;
    private static long es;
    private static int ao;
    private static int da;
    private static int fw;
    private static int gc;
    private static long gf;
    private static long cf;
    private static long cw;
    private static int cv;
    private static long eb;
    private static long ft;
    private static int cr;
    private static int gg;
    private static int y;
    private static int bq;
    private static int fa;
    private static long cd;
    private static int fd;
    private static int var_int_e;
    private static long fc;
    private static int dh;
    private static long ff;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_066.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ÛýÿßăĢĚİĜëĩğĭħðĕķĶĮĴĮă", (byte)26, 66), NLoginCore_066.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ѦѳѲеѵѱѬѵҀѯмѺѾѷѺҀт߉޻߉ߙߑ޴ߎߌߏї", (byte)26, 68) + string + NLoginCore_027.D("н", (byte)26, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x73L;
        l ^= 0x52EBA06670BF4A81L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(23 + 46), (byte)(78 + 5), (byte)(39 + 8), (byte)(17 + 50), (byte)(29 + 37), (byte)(12 + 55), (byte)(39 + 8), (byte)(69 + 11), (byte)(31 + 44), (byte)(33 + 34), (byte)(47 + 36), 53, (byte)(19 + 61), (byte)(16 + 81), (byte)(92 + 8), (byte)(23 + 77), 105, (byte)(85 + 25), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մ࣭ࣻࣻऋःࣦऀࣾँ", (byte)121, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_066.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_066(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_t, (String)NLoginCore_066.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_066.c("㺃", (int)y, (long)(ab ^ ac)));
    }

    @Override
    protected void b(ResultSet resultSet) {
        Object object;
        Object object2;
        this.r = resultSet.getString((String)NLoginCore_066.c("㺀", (int)(dk & dl), (long)dm));
        UUID uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_066.c("㺃", (int)(dn & cfr_renamed_1), (long)dp)));
        String string = resultSet.getString((String)NLoginCore_066.c("㺆", (int)dq, (long)(ds ^ dv)));
        String string2 = resultSet.getString((String)NLoginCore_066.c("㺉", (int)(dw & dx), (long)dy));
        String string3 = resultSet.getString((String)NLoginCore_066.c("㺌", (int)(dz & ea), (long)eb));
        boolean bl = ((String)NLoginCore_066.c("㺏", (int)ec, (long)(ee ^ ef))).equals(resultSet.getString((String)NLoginCore_066.c("㺒", (int)(ek & em), (long)eo)));
        if (string != null) {
            object2 = string.split((String)NLoginCore_066.c("㺕", (int)eq, (long)(es ^ et)));
            if (((String[])object2).length == eu) {
                object = object2[ex].toUpperCase(Locale.ENGLISH);
                if (!((String)NLoginCore_066.c("㺘", (int)(ey & fa), (long)fc)).equalsIgnoreCase((String)object)) {
                    this.e(this.r, string, (String)object);
                    return;
                }
            } else {
                object = string2 != null ? (String)NLoginCore_066.c("㺛", (int)fd, (long)ff) + string2 : NLoginCore_066.c("㺞", (int)fh, (long)fi);
                switch (string.length()) {
                    case 32: {
                        string = (String)NLoginCore_066.c("㺡", (int)fl, (long)(fn ^ fo)) + string + (String)object;
                        break;
                    }
                    case 64: {
                        string = (String)NLoginCore_066.c("㺤", (int)fp, (long)(fq ^ ft)) + string + (String)object;
                        break;
                    }
                    case 128: {
                        string = (String)NLoginCore_066.c("㺧", (int)(fv & fw), (long)fx) + string + (String)object;
                    }
                }
            }
        }
        object2 = resultSet.getLong((String)NLoginCore_066.c("㺪", (int)fz, (long)(ga ^ gb)));
        object = resultSet.getLong((String)NLoginCore_066.c("㺭", (int)gc, (long)(ge ^ gf)));
        String string4 = resultSet.getString((String)NLoginCore_066.c("㺰", (int)gg, (long)gi));
        this.a(this.r, string, string3, uUID, arg_0 -> NLoginCore_066.a(string4, bl, (Long)object2, (Long)object, arg_0));
    }

    private static void void_b() {
        int n;
        o = -1406942983381201727L;
        long l = o ^ 0x52EBA06670BF4A81L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), (byte)(60 + 9), (byte)(32 + 51), (byte)(39 + 8), (byte)(4 + 63), 66, (byte)(59 + 8), (byte)(3 + 44), (byte)(19 + 61), (byte)(62 + 13), (byte)(24 + 43), (byte)(15 + 68), (byte)(6 + 47), (byte)(79 + 1), 97, (byte)(55 + 45), (byte)(17 + 83), (byte)(39 + 66), (byte)(23 + 87), (byte)(62 + 41)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(45 + 38)}, StandardCharsets.UTF_8));
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
                    NLoginCore_066.f[0] = NLoginCore_575.B("ČĲĄăęĳ÷İĨöĠĹĕāĥęŇħđĂĂĘīķĽĠİĻħċīĞ", (byte)31, 66);
                    NLoginCore_066.f[1] = NLoginCore_138.E("ԭԭԥԶԠԹՉՉԶԘԛԾՑԷԔԶՕՠ՘ՠԠէԮԯ", (byte)31, 69);
                    NLoginCore_066.f[2] = NLoginCore_091.A("čČĭăĬďĽĦĎĶĮėıĐčŁĚĄĚěăġŅċĽįģĎļŁōő", (byte)31, 65);
                    NLoginCore_066.f[3] = NLoginCore_559.B("èĵĂĕĸóĳĭĶñĔą", (byte)31, 66);
                    NLoginCore_066.f[4] = NLoginCore_027.D("щѣҀѧѹѬ҂ҀҀҔьњ", (byte)31, 68);
                    NLoginCore_066.f[5] = NLoginCore_223.C("҇҃љѼыцѠҋѭёҏњ", (byte)31, 67);
                    NLoginCore_066.f[6] = NLoginCore_027.A("ĩĔČĢĎįēĺĶěČą", (byte)31, 65);
                    NLoginCore_066.f[7] = NLoginCore_004.B("čČĭăĬďĽĦĎĶİČùĻĥĖĶĚńĆėŉĐđ", (byte)31, 66);
                    NLoginCore_066.f[8] = NLoginCore_110.F("ԫԪՋԡՊԭ՛ՄԬՔՎԧՊԼԫԝԽ԰՟ԙՀԧՅԢԶԨՃլզգ՜Ս", (byte)31, 70);
                    NLoginCore_066.f[9] = NLoginCore_324.B("čČĭăĬďĽĦĎĶĮøÿĸĳĠĝňĦĿłŁĖČĦĠİħįğŉĠ", (byte)31, 66);
                    NLoginCore_066.f[10] = NLoginCore_575.E("ԫԪՋԡՊԭ՛ՄԬՔՎՑԼԝԘբԤՎԟԴՂԢՕՈՋՎԭՌԢԱըՄ", (byte)31, 69);
                    NLoginCore_066.f[11] = NLoginCore_446.A("čČĭăĬďĽĦĎĶįĮĘĴÿĘĽÿđąĵĹĐđ", (byte)31, 65);
                    NLoginCore_066.f[12] = NLoginCore_387.E("ՄԦՕ՗ՈՅՖԫՏԶԿԖԪբԡԬԹԤՏԿ՛եՀԤժզՇԭՊԾԲծՅՌՑՍշԷշըՎ՛ղՏաՠԹծդՍվաչռոգ՚ծլՅհՑտ֍ցցՓՉցղ֚քիՖ֒։ժա֒֋ւ֦֠զ՞ևՠ՝֍րշապ֏ը֦֜֕ւյֲֳ֒ն֋օս֚ս֫֝֌֎׃֐׈ַָֻֽ֚֮֞֩֞֌ֳֿ", (byte)31, 69);
                    NLoginCore_066.f[13] = NLoginCore_027.A("ĬĤĎĥĩąćđľēľĪüĐĭĚĜĘġûĀŌĄăįġŃĞĿīĩčŊŋŗħŃśĮŌĔĞŔĮşĴĵĥĘİĚġłŅłĻśĨşŋńĭŢūőŗŏōŚŜůżŎŐĽŘŰŷţŴşűłŚŕŔżŢŉũŬŢƍƐƏŪőƑŷůŷƌŗźŵƐźƍƓŸơƦſƣŵşŴŝƂŬƪƯƝũƨűűƃƗŵƭƸŸƩƊƭƏŷƐƅ", (byte)31, 65);
                    NLoginCore_066.f[14] = NLoginCore_201.D("ѵѠѦыҍщѥёѾъҍѕѷ҄ҎҒҔѲѭѫѪѩѴҔѠҌҁҞҞҦҀҫҡѽҞҠ҆ѬѼҭҰ҆ѴѺ", (byte)31, 68);
                    NLoginCore_066.f[15] = NLoginCore_092.E("ԝԿԣԴՋՂԗՒԸԘ՚ՒԶԛԲգՎԶՀԽ՜ԱԮԯ", (byte)31, 69);
                    NLoginCore_066.f[16] = NLoginCore_384.E("ՄԨԐՈՌՔԩԮԎԔԺԣ", (byte)31, 69);
                    NLoginCore_066.f[17] = NLoginCore_027.C("҈ѫѨ҈ѿњ҃҄҃ҏѫѪ҅ѥҕѫқѹѓ҇ҕҞѥѦ", (byte)31, 67);
                    NLoginCore_066.f[18] = NLoginCore_027.C("фѾѸљҁюѐ҆ѤҎғњ", (byte)31, 67);
                    NLoginCore_066.f[19] = NLoginCore_427.D("Ҍѩ҆ѯҏњущҀґўюҊъѮєѭѭѰѝѵѨѥѦ", (byte)31, 68);
                    NLoginCore_066.f[20] = NLoginCore_201.F("ՕԐԩՒԔՑԵԸԭ՚ԝԣ", (byte)31, 70);
                    NLoginCore_066.f[21] = NLoginCore_559.C("҆ыѼњѮтўҐҐҌғњ", (byte)31, 67);
                    NLoginCore_066.f[22] = NLoginCore_223.A("ģğøċĨĆċęõĘĪą", (byte)31, 65);
                    NLoginCore_066.f[23] = NLoginCore_324.C("нхэ҂Ҁѿѩ҄ўѤѝњ", (byte)31, 67);
                    NLoginCore_066.f[24] = NLoginCore_076.A("ĦďĖăĘģĴďĞīĺą", (byte)31, 65);
                    NLoginCore_066.f[25] = NLoginCore_091.D("нҊїѪҍш҈҂ҋцѩњ", (byte)31, 68);
                    NLoginCore_066.f[26] = NLoginCore_027.D("ѻѧ҇чѸѱѮѾђҍьњ", (byte)31, 68);
                    NLoginCore_066.f[27] = NLoginCore_027.C("ѳѿэѶ҉ѩѹҋҔҀѴѵ҉ъѬѺѪєѸѸҋҞѥѦ", (byte)31, 67);
                    NLoginCore_066.f[28] = NLoginCore_138.E("ԝՍԠԡՆԤԫՅԗՈԔՠ՜ԯԶԟՕԼՑ՘ԸէԮԯ", (byte)31, 69);
                    NLoginCore_066.f[29] = NLoginCore_027.E("ԪՔԾԿԏԦՐՇԷԥԸՀ՗Ԝ԰՗ՀԯԳ՞ԚէԮԯ", (byte)31, 69);
                    NLoginCore_066.f[30] = NLoginCore_575.F("ՕԲՏԸ՘ԣԌԒՉ՚Ԩ՗Ծբԟԕՙ՝՜աբ՗Ԯԯ", (byte)31, 70);
                    NLoginCore_066.f[31] = NLoginCore_575.B("ēéĤĩđòĉċĦĈĺą", (byte)31, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_066.f[0] = NLoginCore_446.D("ѡ҇љјѮ҈ь҅ѽыѵҎѪіѺѮҜѼѦїїѫҀѲҟіѽѢљҔҟѵ", (byte)31, 68);
                    NLoginCore_066.f[1] = NLoginCore_076.A("ďďćĘĂěīīĘúþğĪĵúýŀĄŅĆłēĐđ", (byte)31, 65);
                    NLoginCore_066.f[2] = NLoginCore_559.F("ԫԪՋԡՊԭ՛ՄԬՔՌԵՏԮԫ՟ԸԢԸԹԡԻԨ՜՞աՉԪդղՐԿ", (byte)31, 70);
                    NLoginCore_066.f[3] = NLoginCore_575.D("҃҇Ѡ҃ѸѤьыѤҏ҇њ", (byte)31, 68);
                    NLoginCore_066.f[4] = NLoginCore_324.B("þčČĥďĥĈČīďķłĖġģŁĆĴĥńĳēĐđ", (byte)31, 66);
                    NLoginCore_066.f[5] = NLoginCore_387.F("ԲԏԣԪՃԵԖԣԶ՛Քԣ", (byte)31, 70);
                    NLoginCore_066.f[6] = NLoginCore_223.E("ՑԲՒ՗ԠԤ՗ՄԤ՝՗ՙՌԯՌԟԿզԽԯԹէԮԯ", (byte)31, 69);
                    NLoginCore_066.f[7] = NLoginCore_559.B("čČĭăĬďĽĦĎĶĮČĚďĀĥĥùāćŀĹĐđ", (byte)31, 66);
                    NLoginCore_066.f[8] = NLoginCore_076.B("čČĭăĬďĽĦĎĶİĉĬĞčÿğĒŁûĢćĜĖįĤįăčŉŊĬ", (byte)31, 66);
                    NLoginCore_066.f[9] = NLoginCore_446.B("čČĭăĬďĽĦĎĶĮøÿĸĳĠĝňĦĿłľĢġŃěĎĤĪĜŁĐ", (byte)31, 66);
                    NLoginCore_066.f[10] = NLoginCore_027.D("Ѣѡ҂јҁѤҒѻѣҋ҅҈ѳєяҙћ҅іѫѹќѬѷќ҅ѠҞҔґћ҇", (byte)31, 68);
                    NLoginCore_066.f[11] = NLoginCore_324.D("Ѣѡ҂јҁѤҒѻѣҋ҃ѴѯѹѳѺҍѮғѰѼѸѥѦ", (byte)31, 68);
                    NLoginCore_066.f[12] = NLoginCore_092.B("ĦĈķĹĪħĸčıĘġøČńăĎěĆıġĽŇĢĆŌňĩďĬĠĔŐħĮĳįřęřŊİĽŔıŃłěŐņįŠŃśŞŚŅļŐŎħŒĳšůţţĵīţŔżŦōĸŴūŌŃŴŭŤƈƂňŀũłĿůŢřŃŜűŊžŷƈŤŗƔƕŴŘŭŧşżşƍſŮŰƥŲƪƝƚƋƪŸƦƘƂżƫŰƩƦŲŰƮƌƫƨƜƈưƶƅ", (byte)31, 66);
                    NLoginCore_066.f[13] = NLoginCore_427.D("ҁѹѣѺѾњќѦғѨғѿёѥ҂ѯѱѭѶѐѕҡљј҄ѶҘѳҔҀѾѢҟҠҬѼҘҰ҃ҡѩѳҩ҃Ҵ҉ҊѺѭ҅ѯѶҗҚҗҐҰѽҴҠҙ҂ҷӀҦҬҤҢүұӄӑңҥҒҭӅӌҸӉҴӆҗүҪҩӑҷҞҾӁҷӢӥӤҿҦӦӌӄӌӡҬӏӊӥӏӢӨӍӶӻӔӸӊҴӉҲӗӁӿԄӲҾӽӆӆӘӛәӺԎӺӚӾӳԔӥӡӚ", (byte)31, 68);
                    NLoginCore_066.f[14] = NLoginCore_091.F("ԾԩԯԔՖԒԮԚՇԓՖԞՀՍ՗՛՝ԻԶԴԳԲԽ՝ԩՕՊէէկՉմՍհէ՟ՊզմձթՋՆՃ", (byte)31, 70);
                    NLoginCore_066.f[15] = NLoginCore_091.B("ÿġąĖĭĤùĴĚúĻøċĜĶûÿņĀĀľēĐđ", (byte)31, 66);
                    NLoginCore_066.f[16] = NLoginCore_091.E("ԋՄՔԔՙԡԒԪ԰Թԝԣ", (byte)31, 69);
                    NLoginCore_066.f[17] = NLoginCore_223.F("ՑԴԱՑՈԣՌՍՌ՘ԲՋԠԼ՛ՖԞԝգՄ՝ՁԮԯ", (byte)31, 70);
                    NLoginCore_066.f[18] = NLoginCore_446.D("ѕѷїѽѻў҆ҍѭҐғњ", (byte)31, 68);
                    NLoginCore_066.f[19] = NLoginCore_451.D("Ҍѩ҆ѯҏњущҀґѠҖѡѬ҈Ѳѕѯѹ҆ѿҁўҏљҔѤҔғѼѷѶ", (byte)31, 68);
                    NLoginCore_066.f[20] = NLoginCore_138.E("ՄԫԈԣՇԋԔԕԛՍԝԣ", (byte)31, 69);
                    NLoginCore_066.f[21] = NLoginCore_027.D("јѝ҄ѻѦ҆џѰѨѥѡњ", (byte)31, 68);
                    NLoginCore_066.f[22] = NLoginCore_027.A("ÿÿēïăĴóõøùľą", (byte)31, 65);
                    NLoginCore_066.f[23] = NLoginCore_451.E("ԵԲԱՊԗԙՌԓԔԏԪԣ", (byte)31, 69);
                    NLoginCore_066.f[24] = NLoginCore_201.E("԰ԇԩԿ՘ՑՈՐԱ՜ԕԣ", (byte)31, 69);
                    NLoginCore_066.f[25] = NLoginCore_559.D("ѷѦцэѢҁѨыыѲєњ", (byte)31, 68);
                    NLoginCore_066.f[26] = NLoginCore_451.C("ќтўќчѨѝѫ҃ҎѯѵєѠҍҎѫѸѨҎҟѨѥѦ", (byte)31, 67);
                    NLoginCore_066.f[27] = NLoginCore_027.F("ԼՈԖԿՒԲՂՔ՝ՉԻԬԬ՗ՊԕԖ՟Ի՟Փ՗Ԯԯ", (byte)31, 70);
                    NLoginCore_066.f[28] = NLoginCore_076.A("ÿįĂăĨĆčħùĪöĢķāĳĻĸĔĦąĦēĐđ", (byte)31, 65);
                    NLoginCore_066.f[29] = NLoginCore_451.A("ČĶĠġñĈĲĩęćęęŁŁăľĖĲĐĖĳēĐđ", (byte)31, 65);
                    NLoginCore_066.f[30] = NLoginCore_223.C("Ҍѩ҆ѯҏњущҀґўҊғѳјѫҕѲѻқҊҎѥѦ", (byte)31, 67);
                    NLoginCore_066.f[31] = NLoginCore_091.C("ѵф҇цѭҌ҆ѧћѢѰяҘҗѬҚҘѕѱҘѹѨѥѦ", (byte)31, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_066.f[0] = NLoginCore_076.F("ԆԕԎԪՋՎԒԫՊԵԶԣ", (byte)31, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_066.f[0] = NLoginCore_384.A("ėİòČĤıĲõďħøčŁĘĤġķŀĜĪĢĔĩŊĜĩŎĎŃČĵĨ", (byte)31, 65);
                }
            }
        }
    }

    private static /* synthetic */ void a(String string, boolean bl, Long l, Long l2, ForceRegisterConfig ForceRegisterConfig2) {
        if (string != null) {
            ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().b(string);
        }
        if (bl) {
            ForceRegisterConfig2.void_z();
        }
        ForceRegisterConfig2.a(l, l2);
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void c(NLoginCore_219 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    static {
        var_int_e = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        m = -1 >>> 22 | -1 << ~22 + 1;
        p = Long.reverse(5562976993161616951L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(-8992657002499826121L);
        ac = Long.reverse(-3602879701896396800L);
        al = 0x8000000 >>> 250 | 0x8000000 << -250;
        ao = -1 >>> 75 | -1 << ~75 + 1;
        at = Long.reverse(5562976993161616951L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-8992657002499826121L);
        bh = Long.reverse(-3602879701896396800L);
        bi = (-1 >>> 203 | -1 << ~203 + 1) & 0xFFFFFFFF;
        bj = 16384 >>> 108 | 16384 << -108;
        bk = Long.reverse(-8992657002499826121L);
        bm = Long.reverse(-3602879701896396800L);
        bn = 0 >>> 94 | 0 << -94;
        bp = 81920 >>> 238 | 81920 << -238;
        bq = (-1 >>> 24 | -1 << -24) & 0xFFFFFFFF;
        br = Long.reverse(5562976993161616951L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(5562976993161616951L);
        bz = 64 >>> 69 | 64 << ~69 + 1;
        cb = Integer.reverse(-536870912);
        cd = Long.reverse(-8992657002499826121L);
        cf = Long.reverse(-3602879701896396800L);
        cg = Integer.reverse(0x10000000);
        ci = Long.reverse(-8992657002499826121L);
        ck = Long.reverse(-3602879701896396800L);
        cm = 9216 >>> 202 | 9216 << ~202 + 1;
        cn = Long.reverse(-8992657002499826121L);
        cp = Long.reverse(-3602879701896396800L);
        cr = Integer.reverse(0x50000000);
        ct = Long.reverse(5562976993161616951L);
        cv = (2816 >>> 200 | 2816 << ~200 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(-8992657002499826121L);
        cx = Long.reverse(-3602879701896396800L);
        cy = Integer.reverse(0x30000000);
        da = -1 >>> 234 | -1 << -234;
        dc = Long.reverse(5562976993161616951L);
        dd = (0x6800000 >>> 247 | 0x6800000 << -247) & 0xFFFFFFFF;
        df = Long.reverse(-8992657002499826121L);
        dg = Long.reverse(-3602879701896396800L);
        dh = (28672 >>> 11 | 28672 << ~11 + 1) & 0xFFFFFFFF;
        di = Long.reverse(-8992657002499826121L);
        dj = Long.reverse(-3602879701896396800L);
        dk = (7680 >>> 9 | 7680 << -9) & 0xFFFFFFFF;
        dl = Integer.reverse(-1);
        dm = Long.reverse(5562976993161616951L);
        dn = 131072 >>> 205 | 131072 << -205;
        cfr_renamed_1 = -1 >>> 210 | -1 << ~210 + 1;
        dp = Long.reverse(5562976993161616951L);
        dq = Integer.reverse(-2013265920);
        ds = Long.reverse(-8992657002499826121L);
        dv = Long.reverse(-3602879701896396800L);
        dw = Integer.reverse(0x48000000);
        dx = -1 >>> 198 | -1 << -198;
        dy = Long.reverse(5562976993161616951L);
        dz = Integer.reverse(-939524096);
        ea = (-1 >>> 214 | -1 << -214) & 0xFFFFFFFF;
        eb = Long.reverse(5562976993161616951L);
        ec = Integer.reverse(0x28000000);
        ee = Long.reverse(-8992657002499826121L);
        ef = Long.reverse(-3602879701896396800L);
        ek = Integer.reverse(-1476395008);
        em = Integer.reverse(-1);
        eo = Long.reverse(5562976993161616951L);
        eq = Integer.reverse(0x68000000);
        es = Long.reverse(-8992657002499826121L);
        et = Long.reverse(-3602879701896396800L);
        eu = Integer.reverse(0x20000000);
        ex = Integer.reverse(Integer.MIN_VALUE);
        ey = Integer.reverse(-402653184);
        fa = -1 >>> 3 | -1 << ~3 + 1;
        fc = Long.reverse(5562976993161616951L);
        fd = Integer.reverse(0x18000000);
        ff = Long.reverse(5562976993161616951L);
        fh = (0x64000000 >>> 90 | 0x64000000 << -90) & 0xFFFFFFFF;
        fi = Long.reverse(5562976993161616951L);
        fl = Integer.reverse(0x58000000);
        fn = Long.reverse(-8992657002499826121L);
        fo = Long.reverse(-3602879701896396800L);
        fp = Integer.reverse(-671088640);
        fq = Long.reverse(-8992657002499826121L);
        ft = Long.reverse(-3602879701896396800L);
        fv = Integer.reverse(0x38000000);
        fw = Integer.reverse(-1);
        fx = Long.reverse(5562976993161616951L);
        fz = Integer.reverse(-1207959552);
        ga = Long.reverse(-8992657002499826121L);
        gb = Long.reverse(-3602879701896396800L);
        gc = Integer.reverse(0x78000000);
        ge = Long.reverse(-8992657002499826121L);
        gf = Long.reverse(-3602879701896396800L);
        gg = Integer.reverse(-134217728);
        gi = Long.reverse(5562976993161616951L);
        gj = (0x2000000 >>> 20 | 0x2000000 << -20) & 0xFFFFFFFF;
        gm = Integer.reverse(0x4000000);
        var_java_lang_String_arr_e = new String[gj];
        f = new String[gm];
        NLoginCore_066.void_b();
    }
}

