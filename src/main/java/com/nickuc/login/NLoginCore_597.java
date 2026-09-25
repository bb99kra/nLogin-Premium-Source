/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_562;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_392;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.H2DatabaseProvider;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_282;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_597
extends NLoginCore_098 {
    private static int y;
    private static long gi;
    private static long df;
    private static int hj;
    private static long p;
    private static int iu;
    private static int fl;
    private static int em;
    private static long fx;
    private static long hl;
    private static int dz;
    private static long ik;
    private static long dy;
    private static int cv;
    private static int gc;
    private static long ig;
    private static int dx;
    private static int ek;
    private static long gp;
    private static int z;
    private static int cr;
    private static int in;
    private static long eo;
    private static int iq;
    private static long by;
    private static String[] var_java_lang_String_arr_e;
    private static int hy;
    private static int it;
    private static int cs;
    private static int ix;
    private static long fc;
    private static int fa;
    private static long hi;
    private static long bk;
    private static int gm;
    private static int m;
    private static long fq;
    private static int cg;
    private static int bn;
    private static int ja;
    private static int bw;
    private static long gr;
    private static int hh;
    private static int jb;
    private static int fz;
    private static int iy;
    private static int eq;
    private static int ao;
    private static long gx;
    private static int cm;
    private static long ez;
    private static int gj;
    private static long gk;
    private static int bp;
    private static int hm;
    private static int hg;
    private static int co;
    private static long dv;
    private static long et;
    private static long fi;
    private static long hp;
    private static long o;
    private static long br;
    private static long ab;
    private static int gg;
    private static long ha;
    private static int ie;
    private static long cd;
    private static int fv;
    private static long go;
    private static int im;
    private static int dn;
    private static long ff;
    private static long dg;
    private static long ca;
    private static long dm;
    private static int fw;
    private static long dc;
    private static long iv;
    private static int fp;
    private static int var_int_e;
    private static int al;
    private static long cp;
    private static int dw;
    private static long ct;
    private static long cw;
    private static int dh;
    private static long eb;
    private static int dt;
    private static String[] f;
    private static int bd;
    private static long ds;
    private static int bi;
    private static long be;
    private static int da;
    private static long ci;
    private static long ck;
    private static long is;
    private static long es;
    private static long hz;
    private static int gv;
    private static long il;
    private static long fn;
    private static long at;
    private boolean F;
    private static long cf;
    private static long gu;
    private static int dd;
    private static int cb;
    private static int ho;
    private static int cy;
    private static int ic;
    private static long ee;
    private static int gd;
    private static int fh;
    private static long bm;
    private static long bh;
    private static int fm;
    private static int eu;
    private static int cj;
    private static int gq;
    private static int ex;
    private static long ft;
    private static int dk;
    private static long dp;
    private static int ii;
    private static int cfr_renamed_0;
    private static int bu;
    private static int cfr_renamed_1;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_597.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.F("ԾՠբՂզօս֓տՎ֌ւ֐֊Փո֑֑֚֙֗զ", (byte)90, 70), NLoginCore_597.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.C("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂࢉࢇ࢝ࢗ࡬࢟࢔࢒࢘ԗ", (byte)90, 67) + string + NLoginCore_110.A("ŭ", (byte)90, 65) + methodType.toString(), exception);
        }
    }

    private File java_io_File_a(String string) {
        String string2 = string.replace((CharSequence)NLoginCore_597.c("㺀", (int)fp, (long)(fq ^ ft)), (CharSequence)NLoginCore_597.c("㺃", (int)(fv & fw), (long)fx));
        if (string2.length() < fz) {
            throw new IllegalArgumentException((String)NLoginCore_597.c("㺆", (int)(gd & gg), (long)gi) + string);
        }
        string2 = string2.substring(gc);
        return new File(this.java_io_File_b(), string2);
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x8B05721D0FC02FEEL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(43 + 26), (byte)(59 + 24), (byte)(26 + 21), (byte)(20 + 47), (byte)(35 + 31), (byte)(50 + 17), (byte)(9 + 38), (byte)(26 + 54), (byte)(56 + 19), 67, (byte)(11 + 72), (byte)(7 + 46), 80, (byte)(27 + 70), (byte)(37 + 63), (byte)(62 + 38), (byte)(2 + 103), (byte)(45 + 65), (byte)(6 + 97)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ĐĝĜßğěĖğĪęæĤĨġĤĪìѳѱ҇ҁі҉ѾѼ҂", (byte)23, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_597.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private static void void_b() {
        int n;
        o = -7020667771944379310L;
        long l = o ^ 0x8B05721D0FC02FEEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(22 + 47), (byte)(64 + 19), 47, (byte)(34 + 33), (byte)(48 + 18), (byte)(66 + 1), (byte)(3 + 44), (byte)(62 + 18), (byte)(31 + 44), (byte)(44 + 23), (byte)(6 + 77), (byte)(31 + 22), (byte)(35 + 45), (byte)(91 + 6), (byte)(78 + 22), (byte)(94 + 6), (byte)(76 + 29), (byte)(82 + 28), (byte)(66 + 37)}, StandardCharsets.UTF_8));
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
                    NLoginCore_597.f[0] = NLoginCore_451.C("қѽџљҤҁѡҟғѵѠѽҥҊҝѾҪҲ҈ҒҐҳѺѻ", (byte)38, 67);
                    NLoginCore_597.f[1] = NLoginCore_223.E("ԓԷԷԚԸՓՒգ՞՞ԤԪ", (byte)38, 69);
                    NLoginCore_597.f[2] = NLoginCore_575.B("ýĮĺĵĿĆģĪĈĦŇķĎĞČĉńēĵŘĶıĞğ", (byte)38, 66);
                    NLoginCore_597.f[3] = NLoginCore_384.A("ĚĲĖýĕĞĪīĜńŌē", (byte)38, 65);
                    NLoginCore_597.f[4] = NLoginCore_559.A("ĜľĤĥėûĕĉĥĝŇĞŉŅċĊĐńŖİĔŕőŘŎōĮĲĭŗŗĻţĿğĥŀĦũĶŔŘņĳ", (byte)38, 65);
                    NLoginCore_597.f[5] = NLoginCore_427.A("ĸıĦýęĄėŌĨěĘďęĺĮĊĦŒĳŉŉŗĞğ", (byte)38, 65);
                    NLoginCore_597.f[6] = NLoginCore_384.E("԰ՔԧՕԧՉ՜ՓԙԞԤԪ", (byte)38, 69);
                    NLoginCore_597.f[7] = NLoginCore_201.F("ԶԤԯ՛Ֆ՗՜Ԟԯ԰ԵԪ", (byte)38, 70);
                    NLoginCore_597.f[8] = NLoginCore_223.D("Ѷҗ҂ңҎѼңѲҤ҅҂ѯ", (byte)38, 68);
                    NLoginCore_597.f[9] = NLoginCore_027.F("ԣ՜Ե՘ՎՑԹԿԙ՗գԪ", (byte)38, 70);
                    NLoginCore_597.f[10] = NLoginCore_451.F("ՕՑԱՍԾԘԫԲԛԬՅԪ", (byte)38, 70);
                    NLoginCore_597.f[11] = NLoginCore_004.A("ĤĞĀňĥĞŃĴķĞĢĤĦŊŎĠŀĭŉĐħıĞğ", (byte)38, 65);
                    NLoginCore_597.f[12] = NLoginCore_138.C("ѶҎѲљѱѺ҆҇ѸҠҨѯ", (byte)38, 67);
                    NLoginCore_597.f[13] = NLoginCore_384.C("қѱњҞѽҖѵҗњқғѥѫ҉ѻѩѧҐѻҰ҆ҳѺѻ", (byte)38, 67);
                    NLoginCore_597.f[14] = NLoginCore_384.C("ҚѱѵѭѷѾҖ҅ѱѻ҂ѯ", (byte)38, 67);
                    NLoginCore_597.f[15] = NLoginCore_575.A("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġńĨņėīľŕŘŝĠř", (byte)38, 65);
                    NLoginCore_597.f[16] = NLoginCore_091.E("ՏՖԻԵ԰ԒԩԟԣգԥԘԵԾԠԲՇՀՅ՞զԾՌբՋՒՍթՉԴՑլ", (byte)38, 69);
                    NLoginCore_597.f[17] = NLoginCore_027.D("ҏҙғўҌғҞѷѾҊѲѯ", (byte)38, 68);
                    NLoginCore_597.f[18] = NLoginCore_559.D("ҊѼҜҐѰѶҔѤўћҩѽҔѾңѥҏѺѫҐҍҍѺѻ", (byte)38, 68);
                    NLoginCore_597.f[19] = NLoginCore_559.A("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġńĨņėīľŕŘŝĠř", (byte)38, 65);
                    NLoginCore_597.f[20] = NLoginCore_324.D("њїҎҘҙҤҝ҇ҘѹѻѪҜҘҬѨ҂ҨѫҜҭѲҰѴѶѷұѷҙѽѸѼ", (byte)38, 68);
                    NLoginCore_597.f[21] = NLoginCore_138.A("ĳĽķĂİķłěĢĮĖē", (byte)38, 65);
                    NLoginCore_597.f[22] = NLoginCore_076.C("ҌҚҗҍҙїѿѼҩҜҤѯ", (byte)38, 67);
                    NLoginCore_597.f[23] = NLoginCore_027.A("ĠăĠĒņĢĹĨċķĞē", (byte)38, 65);
                    NLoginCore_597.f[24] = NLoginCore_324.A("įįĺľĦĜłŃĴĺňē", (byte)38, 65);
                    NLoginCore_597.f[25] = NLoginCore_387.F("ԱՋ԰Ց՗ԼՎՙԴՓԶ՗ԯԡԽԪէԶժԭԨՉձըգՌՎՂՊԴԵղՃԼծՓԷԷՀոտ՞շՒէճ՟Ք՝ջՆըՅ֎ՕՖ", (byte)38, 70);
                    NLoginCore_597.f[26] = NLoginCore_387.D("ҌҍҕѯқѳѵѺўҁѽѷѹѥҁѪѫ҈ѱҧҁѽѺѻ", (byte)38, 68);
                    NLoginCore_597.f[27] = NLoginCore_138.F("ԱՉԭԔԬԵՁՂԳ՛գԪ", (byte)38, 70);
                    NLoginCore_597.f[28] = NLoginCore_223.D("ўѡѶљћҡҟҔѧѹѤҞѽҌ҃ҀҞѾҢҁѰѵҐҲҰҰҧҔҥѴҿҸѸҲҊѵҾҦ҃җҕҚҖҏ", (byte)38, 68);
                    NLoginCore_597.f[29] = NLoginCore_559.A("ĤĂĄŅŉđĶħŃłŌē", (byte)38, 65);
                    NLoginCore_597.f[30] = NLoginCore_201.A("đġĶĀĆĆĤĤĺĵĮē", (byte)38, 65);
                    NLoginCore_597.f[31] = NLoginCore_091.C("ѮѻҏѠѭқѯѠҦѲѥѯ", (byte)38, 67);
                    NLoginCore_597.f[32] = NLoginCore_027.D("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍҔҡѵҢѷѸҎ҇҅ҕѱҴҖҲҜңҹұӆҐңҖҏ", (byte)38, 68);
                    NLoginCore_597.f[33] = NLoginCore_453.C("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍґҶҶҴңүҊҤұґҒҐѽӂқҠҲқ҆ҼҗҒҏ", (byte)38, 67);
                    NLoginCore_597.f[34] = NLoginCore_004.E("ԻՊԗ՜ԧՋԪՠՄԭԼզՁԺԟՇՓԴՊԤՀԮՄՁՆՅՈԿյգճբ՜ՖլԶ՟մԷՖԵԽՄՊ", (byte)38, 69);
                    NLoginCore_597.f[35] = NLoginCore_559.F("ԻՊԗ՜ԧՋԪՠՄԭԹՓԙԥՁՙԿէդբՆՈը՟ըգՊԾաՙմ՛ՆՕո՚ԾՖլղփչեՊ", (byte)38, 70);
                    NLoginCore_597.f[36] = NLoginCore_027.C("ҠџѿѬҗќјҥѼҠҪ҇ҡѸҡѹ҆Ҝҩ҃ѦҳѺѻ", (byte)38, 67);
                    NLoginCore_597.f[37] = NLoginCore_223.B("čĮŁġĸńŀĳĄġĚŅĊĢŁġďŇĎŁĲďĵŏŋĔĜĚĳŝŃĳ", (byte)38, 66);
                    NLoginCore_597.f[38] = NLoginCore_201.C("ѰѯҏњҡѤҧѦҦҟҘҝҝҫ҆Ҍҏ҃Ңғ҈ҍѺѻ", (byte)38, 67);
                    NLoginCore_597.f[39] = NLoginCore_201.C("ѩҊҝѽҔҠҜҏѠѽѶҡѦѾҝѽѫңѪҝҎѫґҫҧѰѸѶҏҹҟҏ", (byte)38, 67);
                    NLoginCore_597.f[40] = NLoginCore_027.F("ԫԪՊԕ՜ԟբԡա՚Փ՘՘զՁՇՊԾ՝ՎՃՈԵԶ", (byte)38, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_597.f[0] = NLoginCore_092.D("қѽџљҤҁѡҟғѵѠҙ҉҈ҚҰҠҠ҃ґҡҍѺѻ", (byte)38, 68);
                    NLoginCore_597.f[1] = NLoginCore_223.B("ĤĝļĢĈğĥĆōķŊĿŉņŉģœġĿőōŇĞğ", (byte)38, 66);
                    NLoginCore_597.f[2] = NLoginCore_575.F("ԔՅՑՌՖԝԺՁԟԽ՝՜ՆՐՁԷՇՠՉԻԿ՞ԵԶ", (byte)38, 70);
                    NLoginCore_597.f[3] = NLoginCore_223.D("ҟҚѸҙҍҘ҄ѧҡ҅Ҡѯ", (byte)38, 68);
                    NLoginCore_597.f[4] = NLoginCore_092.F("ԳՕԻԼԮԒԬԠԼԴ՞Եՠ՜Ԣԡԧ՛խՇԫլըկեդՅՉՄծծՒթզՖ՟չրսձՙՍԼՊ", (byte)38, 70);
                    NLoginCore_597.f[5] = NLoginCore_076.E("ՏՈԽԔ԰ԛԮգԿԲԮՅԹՐԡՅԦԴԹաՙԸԵԶ", (byte)38, 69);
                    NLoginCore_597.f[6] = NLoginCore_027.B("ĜĮąęþěĠĝĊĕĹĚĸņŎģĭŋģĪġŗĞğ", (byte)38, 66);
                    NLoginCore_597.f[7] = NLoginCore_223.B("łęįĄĝĸņĚþŉĽąĸĚċıœņņĒĴŇĞğ", (byte)38, 66);
                    NLoginCore_597.f[8] = NLoginCore_427.F("ԵՕԶԭՋԭԼբԮՍԱԪ", (byte)38, 70);
                    NLoginCore_597.f[9] = NLoginCore_324.B("ĴĖĸńĢĶĺŇĄŇļē", (byte)38, 66);
                    NLoginCore_597.f[10] = NLoginCore_223.B("ĄĜĘĘŃĀĥŇĺĉĮē", (byte)38, 66);
                    NLoginCore_597.f[11] = NLoginCore_091.F("ԻԵԗ՟ԼԵ՚ՋՎԵԺ՘ՃՓԢՊՔ՚ՂՖՎծԵԶ", (byte)38, 70);
                    NLoginCore_597.f[12] = NLoginCore_027.F("ՏՎ՝ԫԺ԰ԿՙգԷԠԪ", (byte)38, 70);
                    NLoginCore_597.f[13] = NLoginCore_223.D("қѱњҞѽҖѵҗњқғѹѤҪҀҭѩѫҦ҈ѲңѺѻ", (byte)38, 68);
                    NLoginCore_597.f[14] = NLoginCore_138.F("ՙԓԝՓ՞ՀՂՂԱՅԥԦԯԳՖէ՛Ԥխգ՜ԸԵԶ", (byte)38, 70);
                    NLoginCore_597.f[15] = NLoginCore_575.D("ҡҏѼѸҝѯѶҚҀҥѿѤҚҫѺѡѽѫҌѮѽҠҕ҂Ѱҷ҆ҹҽҘ҈ҌҷҙѹҴҾҭҽӃҔӉҦҏ", (byte)38, 68);
                    NLoginCore_597.f[16] = NLoginCore_173.A("ĸĿĤĞęûĒĈČŌĎāĞħĉěİĩĮŇŏĢňĶōĹĬŞŁĩĬŏįĽńśťŝļŗĶŘņĳ", (byte)38, 65);
                    NLoginCore_597.f[17] = NLoginCore_427.B("üēĎĲđĕĨĩŃĘłĿİŀŐĲġĢĮđĭıĞğ", (byte)38, 66);
                    NLoginCore_597.f[18] = NLoginCore_027.A("ĮĠŀĴĔĚĸĈĂÿōĘĨĦņđĤğĎńĔġĞğ", (byte)38, 65);
                    NLoginCore_597.f[19] = NLoginCore_091.B("ŅĳĠĜŁēĚľĤŉģĈľŏĞąġďİĒġĳŃńįĹőįŏŐŃŌŖŗĥŗĥŜħĩŜľĩĳ", (byte)38, 66);
                    NLoginCore_597.f[20] = NLoginCore_076.A("þûĲļĽňŁīļĝğĎŀļŐČĦŌďŀőĐįĻŉĸĸķŌĬŌŎŚĸŁŖŠţŇŊŅŝŨĳ", (byte)38, 65);
                    NLoginCore_597.f[21] = NLoginCore_446.F("ԗԕ՗ՔԕԮԹՒգա՝՛ԵՔԵԴթՙԫԩՐՈԵԶ", (byte)38, 70);
                    NLoginCore_597.f[22] = NLoginCore_384.B("ŀďøĘĖĝŇļĞŀĞĨħĞłļĞġŗĔŋŇĞğ", (byte)38, 66);
                    NLoginCore_597.f[23] = NLoginCore_138.C("ѿѴѸң҃ѶѾғѾҞѲѯ", (byte)38, 67);
                    NLoginCore_597.f[24] = NLoginCore_092.B("ė÷ęńĝĠĒĬĝąĊĆġļŁļŌŉŖŘĭŗĞğ", (byte)38, 66);
                    NLoginCore_597.f[25] = NLoginCore_559.B("ĚĴęĺŀĥķłĝļğŀĘĊĦēŐğœĖđĲŚőŌĵķīĳĝĞśĬĥŗļĠĠĩšŨŇţĻűĻŏŊũőŒňţĹİŤŰŶŚŷųŜĴŋ", (byte)38, 66);
                    NLoginCore_597.f[26] = NLoginCore_223.D("ҌҍҕѯқѳѵѺўҁѽңҔѿ҄Ѫ҈҈ҥѼѾңѺѻ", (byte)38, 68);
                    NLoginCore_597.f[27] = NLoginCore_110.F("Ա՝԰ԵԘԭԘԻՐԿԹԪ", (byte)38, 70);
                    NLoginCore_597.f[28] = NLoginCore_004.F("ԙԜԱԔԖ՜՚ՏԢԴԟՙԸՇԾԻՙԹ՝Լԫ԰ՋխիիբՏՠԯպճՐսշչէցչԹՙջՓ՛ք՗շըդՕփ֋ժվՕՖ", (byte)38, 70);
                    NLoginCore_597.f[29] = NLoginCore_027.C("ҟѼҍѷҞҝҘҤң҂҆ѯ", (byte)38, 67);
                    NLoginCore_597.f[30] = NLoginCore_324.A("ĕĕŁŃėĶĉĥĖĄĥĬĎŊŒčĦŐĩŒĠıĞğ", (byte)38, 65);
                    NLoginCore_597.f[31] = NLoginCore_027.A("ĳİĝćŃāňŊČŉĸē", (byte)38, 65);
                    NLoginCore_597.f[32] = NLoginCore_138.D("ѷѭѫѴѰҥ҄ҧґҔѧѴѻқѮѯ҄ѣұҳҍҔҡѵҢѷѸҎ҇҅ҕѱҟҴҶҫҏ҅ҞҥҰҒҸҏ", (byte)38, 68);
                    NLoginCore_597.f[33] = NLoginCore_076.A("ěđďĘĔŉĨŋĵĸċĘğĿĒēĨćŕŗıĵŚŚŘŇœĮňŕĵĶšşŇŞĨļŉũŋŬŘĳ", (byte)38, 65);
                    NLoginCore_597.f[34] = NLoginCore_453.B("ĤĳĀŅĐĴēŉĭĖĥŏĪģĈİļĝĳčĩėĭĪįĮıĨŞŌŜŋģěĻšşŜľńśĥņĳ", (byte)38, 66);
                    NLoginCore_597.f[35] = NLoginCore_324.C("ҀҏќҡѬҐѯҥ҉ѲѾҘўѪ҆Ҟ҄ҬҩҧҋҍҭҤҭҨҏ҃ҦҞҹҠҽѹҘӃҭҚ҅ҿҚ҅҅ҏ", (byte)38, 67);
                    NLoginCore_597.f[36] = NLoginCore_173.D("ҠџѿѬҗќјҥѼҠҫѽҗ҉҇҉ѻ҈ѻҥ҈ңѺѻ", (byte)38, 68);
                    NLoginCore_597.f[37] = NLoginCore_201.F("ԤՅ՘ԸՏ՛՗ՊԛԸԱ՜ԡԹ՘ԸԦ՞ԥ՘ՉԨՌԾՓՈԾթհհՈՏ", (byte)38, 70);
                    NLoginCore_597.f[38] = NLoginCore_076.E("ԫԪՊԕ՜ԟբԡա՚ՕԝաԦՙԲԩԥՃՃԹՈԵԶ", (byte)38, 69);
                    NLoginCore_597.f[39] = NLoginCore_091.C("ѩҊҝѽҔҠҜҏѠѽѶҡѦѾҝѽѫңѪҝҎѲҖҘҀҕҤѸҧҶҮҕ", (byte)38, 67);
                    NLoginCore_597.f[40] = NLoginCore_324.F("ԫԪՊԕ՜ԟբԡա՚ՕՀՑՓՄըԶգՋէՉԸԵԶ", (byte)38, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_597.f[0] = NLoginCore_004.D("ҕҔѠѳѼҁҔҀғҠѡѹҤҎѾѾҠѩ҃ѯ҇ѽѺѻ", (byte)38, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_597.f[0] = NLoginCore_092.D("ѩѽҔҙѱѰ҄ѵҁѸ҉ѽѸ҄҈ѼұҢҪұҴҍѺѻ", (byte)38, 68);
                }
            }
        }
    }

    private void a(String string, UUID uUID) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_597.c("㺀", (int)gv, (long)(gx ^ ha)));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_597.c("㺃", (int)(hg & hh), (long)hi));
        }
        if (uUID == null) {
            throw new IllegalArgumentException((String)NLoginCore_597.c("㺆", (int)hj, (long)hl));
        }
        if (uUID.version() != hm) {
            throw new IllegalStateException((String)NLoginCore_597.c("㺉", (int)ho, (long)hp) + string + (String)NLoginCore_597.c("㺌", (int)hy, (long)hz) + NLoginCore_432.b(uUID));
        }
        NLoginCore_291 NLoginCore_2912 = this.m.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(string, uUID, null, ic != 0);
        if (ForceRegisterConfig2 == null) {
            throw new RuntimeException((String)NLoginCore_597.c("㺏", (int)(ie & cfr_renamed_0), (long)ig) + string + (String)NLoginCore_597.c("㺒", (int)ii, (long)(ik ^ il)));
        }
        if (!ForceRegisterConfig2.boolean_h() && (ForceRegisterConfig2 = NLoginCore_2912.a(string, null, null, im != 0)) == null) {
            throw new RuntimeException((String)NLoginCore_597.c("㺕", (int)(in & iq), (long)is) + string + (String)NLoginCore_597.c("㺘", (int)(it & iu), (long)iv));
        }
        ForceRegisterConfig2.b(uUID);
        UUID uUID2 = ForceRegisterConfig2.java_util_UUID_a();
        if (uUID2 == null) {
            uUID2 = this.F ? uUID : NLoginCore_432.d(string);
        } else if (uUID2.version() == ix && this.F) {
            uUID2 = uUID;
        }
        ForceRegisterConfig2.a(uUID2);
        if (NLoginCore_2912.a((NLoginCore_459)this.a, ForceRegisterConfig2, new NLoginCore_436[iy])) {
            ++this.k;
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_597.c("㺀", (int)(al & ao), (long)at), (String)NLoginCore_597.c("㺃", (int)bd, (long)(be ^ bh)));
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_597.c("㺆", (int)bi, (long)(bk ^ bm)));
        }
        this.F = NLoginCore_2192.a(NLoginCore_597.c("㺉", (int)(bn & bp), (long)br), bu != 0);
        String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_597.c("㺌", (int)bw, (long)(by ^ ca))).trim().toLowerCase(Locale.ENGLISH);
        if (string2.contains((CharSequence)NLoginCore_597.c("㺏", (int)cb, (long)(cd ^ cf)))) {
            this.d = NLoginCore_586.a(this.m, this.java_io_File_a(string), new Properties());
        } else if (string2.contains((CharSequence)NLoginCore_597.c("㺒", (int)cg, (long)ci))) {
            this.d = H2DatabaseProvider.a(this.m, NLoginCore_282.var_com_nickuc_login_NLoginCore_282_c, this.java_io_File_a(string), new Properties());
        } else {
            int n = NLoginCore_2192.a(NLoginCore_597.c("㺕", (int)cj, (long)ck), cm);
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_597.c("㺘", (int)co, (long)cp));
            String string4 = NLoginCore_2192.a(NLoginCore_597.c("㺛", (int)(cr & cs), (long)ct), (String)NLoginCore_597.c("㺞", (int)cv, (long)cw));
            String string5 = NLoginCore_2192.java_lang_String_b(NLoginCore_597.c("㺡", (int)(cy & da), (long)dc));
            boolean bl = NLoginCore_2192.a(NLoginCore_597.c("㺤", (int)dd, (long)(df ^ dg)), dh != 0);
            Properties properties = new Properties();
            if (bl) {
                boolean bl2 = NLoginCore_2192.a(NLoginCore_597.c("㺧", (int)dk, (long)dm), dn != 0);
                String string6 = NLoginCore_2192.java_lang_String_b(NLoginCore_597.c("㺪", (int)cfr_renamed_1, (long)(dp ^ ds)));
                String string7 = NLoginCore_2192.a(NLoginCore_597.c("㺭", (int)dt, (long)dv), (String)NLoginCore_597.c("㺰", (int)(dw & dx), (long)dy));
                properties.put(NLoginCore_597.c("㺳", (int)dz, (long)(eb ^ ee)), (Object)bl2);
                properties.put(NLoginCore_597.c("㺶", (int)(ek & em), (long)eo), string6);
                properties.put(NLoginCore_597.c("㺹", (int)eq, (long)(es ^ et)), string7);
            }
            if (string2.contains((CharSequence)NLoginCore_597.c("㺼", (int)(eu & ex), (long)ez))) {
                this.d = NLoginCore_562.b(this.m, NLoginCore_147.a(string3, n, string, string4, string5, properties));
            } else if (string2.contains((CharSequence)NLoginCore_597.c("㺿", (int)fa, (long)(fc ^ ff)))) {
                this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string3, n, string, string4, string5, properties));
            } else if (string2.contains((CharSequence)NLoginCore_597.c("㻂", (int)fh, (long)fi))) {
                this.d = NLoginCore_392.b(this.m, NLoginCore_147.a(string3, n, string, string4, string5, properties));
            } else {
                throw new UnsupportedOperationException((String)NLoginCore_597.c("㻅", (int)(fl & fm), (long)fn) + string2);
            }
        }
    }

    public NLoginCore_597(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.O, (String)NLoginCore_597.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_597.c("㺃", (int)(y & z), (long)ab));
    }

    @Override
    protected void b(ResultSet resultSet) {
        UUID uUID;
        this.r = resultSet.getString((String)NLoginCore_597.c("㺀", (int)gj, (long)gk));
        boolean bl = resultSet.getBoolean((String)NLoginCore_597.c("㺃", (int)gm, (long)(go ^ gp)));
        if (bl && (uUID = NLoginCore_432.c(resultSet.getString((String)NLoginCore_597.c("㺆", (int)gq, (long)(gr ^ gu))))) != null) {
            this.a(this.r, uUID);
        }
    }

    static {
        var_int_e = (0 >>> 62 | 0 << -62) & 0xFFFFFFFF;
        m = -1 >>> 223 | -1 << ~223 + 1;
        p = Long.reverse(8519434885071997305L);
        y = (2048 >>> 11 | 2048 << -11) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        ab = Long.reverse(8519434885071997305L);
        al = Integer.reverse(0x40000000);
        ao = (-1 >>> 96 | -1 << ~96 + 1) & 0xFFFFFFFF;
        at = Long.reverse(8519434885071997305L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(5348900747403168121L);
        bh = Long.reverse(0x3C00000000000000L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(5348900747403168121L);
        bm = Long.reverse(0x3C00000000000000L);
        bn = Integer.reverse(-1610612736);
        bp = (-1 >>> 106 | -1 << ~106 + 1) & 0xFFFFFFFF;
        br = Long.reverse(8519434885071997305L);
        bu = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(5348900747403168121L);
        ca = Long.reverse(0x3C00000000000000L);
        cb = Integer.reverse(-536870912);
        cd = Long.reverse(5348900747403168121L);
        cf = Long.reverse(0x3C00000000000000L);
        cg = Integer.reverse(0x10000000);
        ci = Long.reverse(8519434885071997305L);
        cj = (576 >>> 230 | 576 << ~230 + 1) & 0xFFFFFFFF;
        ck = Long.reverse(8519434885071997305L);
        cm = Integer.reverse(1462763520);
        co = (0x500000 >>> 211 | 0x500000 << ~211 + 1) & 0xFFFFFFFF;
        cp = Long.reverse(8519434885071997305L);
        cr = 0xB00000 >>> 116 | 0xB00000 << ~116 + 1;
        cs = (-1 >>> 109 | -1 << ~109 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(8519434885071997305L);
        cv = Integer.reverse(0x30000000);
        cw = Long.reverse(8519434885071997305L);
        cy = Integer.reverse(-1342177280);
        da = -1 >>> 25 | -1 << -25;
        dc = Long.reverse(8519434885071997305L);
        dd = Integer.reverse(0x70000000);
        df = Long.reverse(5348900747403168121L);
        dg = Long.reverse(0x3C00000000000000L);
        dh = Integer.reverse(0);
        dk = Integer.reverse(-268435456);
        dm = Long.reverse(8519434885071997305L);
        dn = (0 >>> 50 | 0 << -50) & 0xFFFFFFFF;
        cfr_renamed_1 = (2 >>> 157 | 2 << -157) & 0xFFFFFFFF;
        dp = Long.reverse(5348900747403168121L);
        ds = Long.reverse(0x3C00000000000000L);
        dt = 2176 >>> 199 | 2176 << -199;
        dv = Long.reverse(8519434885071997305L);
        dw = (0x4800000 >>> 150 | 0x4800000 << ~150 + 1) & 0xFFFFFFFF;
        dx = (-1 >>> 75 | -1 << -75) & 0xFFFFFFFF;
        dy = Long.reverse(8519434885071997305L);
        dz = Integer.reverse(-939524096);
        eb = Long.reverse(5348900747403168121L);
        ee = Long.reverse(0x3C00000000000000L);
        ek = Integer.reverse(0x28000000);
        em = (-1 >>> 13 | -1 << ~13 + 1) & 0xFFFFFFFF;
        eo = Long.reverse(8519434885071997305L);
        eq = (344064 >>> 78 | 344064 << ~78 + 1) & 0xFFFFFFFF;
        es = Long.reverse(5348900747403168121L);
        et = Long.reverse(0x3C00000000000000L);
        eu = Integer.reverse(0x68000000);
        ex = Integer.reverse(-1);
        ez = Long.reverse(8519434885071997305L);
        fa = (0x17000000 >>> 88 | 0x17000000 << ~88 + 1) & 0xFFFFFFFF;
        fc = Long.reverse(5348900747403168121L);
        ff = Long.reverse(0x3C00000000000000L);
        fh = Integer.reverse(0x18000000);
        fi = Long.reverse(8519434885071997305L);
        fl = Integer.reverse(-1744830464);
        fm = -1 >>> 34 | -1 << ~34 + 1;
        fn = Long.reverse(8519434885071997305L);
        fp = (53248 >>> 75 | 53248 << -75) & 0xFFFFFFFF;
        fq = Long.reverse(5348900747403168121L);
        ft = Long.reverse(0x3C00000000000000L);
        fv = Integer.reverse(-671088640);
        fw = -1 >>> 31 | -1 << ~31 + 1;
        fx = Long.reverse(8519434885071997305L);
        fz = (2048 >>> 42 | 2048 << ~42 + 1) & 0xFFFFFFFF;
        gc = Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << ~159 + 1;
        gd = (28672 >>> 106 | 28672 << -106) & 0xFFFFFFFF;
        gg = Integer.reverse(-1);
        gi = Long.reverse(8519434885071997305L);
        gj = Integer.reverse(-1207959552);
        gk = Long.reverse(8519434885071997305L);
        gm = (240 >>> 99 | 240 << -99) & 0xFFFFFFFF;
        go = Long.reverse(5348900747403168121L);
        gp = Long.reverse(0x3C00000000000000L);
        gq = Integer.reverse(-134217728);
        gr = Long.reverse(5348900747403168121L);
        gu = Long.reverse(0x3C00000000000000L);
        gv = Integer.reverse(0x4000000);
        gx = Long.reverse(5348900747403168121L);
        ha = Long.reverse(0x3C00000000000000L);
        hg = Integer.reverse(-2080374784);
        hh = -1 >>> 213 | -1 << ~213 + 1;
        hi = Long.reverse(8519434885071997305L);
        hj = Integer.reverse(0x44000000);
        hl = Long.reverse(8519434885071997305L);
        hm = Integer.reverse(0x20000000);
        ho = Integer.reverse(-1006632960);
        hp = Long.reverse(8519434885071997305L);
        hy = (-1879048192 >>> 122 | -1879048192 << -122) & 0xFFFFFFFF;
        hz = Long.reverse(8519434885071997305L);
        ic = 0 >>> 25 | 0 << ~25 + 1;
        ie = Integer.reverse(-1543503872);
        cfr_renamed_0 = Integer.reverse(-1);
        ig = Long.reverse(8519434885071997305L);
        ii = (0x2600000 >>> 244 | 0x2600000 << ~244 + 1) & 0xFFFFFFFF;
        ik = Long.reverse(5348900747403168121L);
        il = Long.reverse(0x3C00000000000000L);
        im = 0 >>> 173 | 0 << ~173 + 1;
        in = (-536870908 >>> 221 | -536870908 << ~221 + 1) & 0xFFFFFFFF;
        iq = Integer.reverse(-1);
        is = Long.reverse(8519434885071997305L);
        it = Integer.reverse(0x14000000);
        iu = Integer.reverse(-1);
        iv = Long.reverse(8519434885071997305L);
        ix = 49152 >>> 238 | 49152 << ~238 + 1;
        iy = 0 >>> 98 | 0 << ~98 + 1;
        ja = Integer.reverse(-1811939328);
        jb = Integer.reverse(-1811939328);
        var_java_lang_String_arr_e = new String[ja];
        f = new String[jb];
        NLoginCore_597.void_b();
    }
}

