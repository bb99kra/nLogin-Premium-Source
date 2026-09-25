/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_411;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_022
extends NLoginCore_411 {
    private static int ie;
    private static int kh;
    private static int jf;
    private static long ci;
    private static int dz;
    private static int bn;
    private static long ct;
    private static long kn;
    private static int bj;
    private static long gi;
    private static int gv;
    private static int jo;
    private static int ch;
    private static int bi;
    private static long hi;
    private static long ha;
    private final String[] a = new String[ai];
    private static long kq;
    private static long cl;
    private static int cj;
    private static int eq;
    private static int kd;
    private static long gb;
    private static int bq;
    private static String[] f;
    private static int bp;
    private static long ez;
    private static long cf;
    private static long ca;
    private static int gc;
    private static int fe;
    private static long ev;
    private static int ic;
    private static int eu;
    private static long fx;
    private static int ek;
    private static int ao;
    private static int da;
    private static long ee;
    private static long jc;
    private static long cd;
    private static int t;
    private static long dv;
    private static long gf;
    private static int co;
    private static int bz;
    private static int fr;
    private static int in;
    private static long hl;
    private static int fp;
    private static int az;
    private static long il;
    private static int fl;
    private static long gk;
    private static long cx;
    private static long iz;
    private static int ak;
    private static int cr;
    private static int gw;
    private static long ff;
    private static long fc;
    private static long dc;
    private static int bc;
    private static int fv;
    private static int dt;
    private static int ka;
    private static long dm;
    private static long df;
    private static long bm;
    private static long jg;
    private static int bu;
    private static long ga;
    private static int dd;
    private static long fi;
    private static int an;
    private static int iu;
    private static int ce;
    private static int gq;
    private static long kk;
    private static int ii;
    private static int dk;
    private static long by;
    private static long gp;
    private static int kp;
    private static int cv;
    private static int aw;
    private static int er;
    private static int kl;
    private static int it;
    private static int cm;
    private static long kb;
    private static int bd;
    private static long ju;
    private static long fo;
    private static int bl;
    private static long jq;
    private static int iq;
    private static long ik;
    private static int ji;
    private static long kf;
    private static long ig;
    private static long ko;
    private static long ap;
    private static int ar;
    private static int gs;
    private static int jl;
    private static int jp;
    private static int gm;
    private static long bb;
    private static int db;
    private static int fz;
    private static long br;
    private static long ge;
    private static int fw;
    private static int ho;
    private static int im;
    private static int fd;
    private static int fh;
    private static int z;
    private static int cg;
    private static long cz;
    private static long jh;
    private static int var_int_e;
    private static long as;
    private static long kc;
    private static long cw;
    private static int km;
    private static int kj;
    private static long ds;
    private static long dp;
    private static int gy;
    private static int cy;
    private static long ck;
    private static long bh;
    private static int aq;
    private static int jt;
    private static long hm;
    private static long eo;
    private static int gz;
    private static long hp;
    private static long eb;
    private static int ks;
    private static int kr;
    private static String[] var_java_lang_String_arr_e;
    private static long kg;
    private static int gt;
    private static int ke;
    private static long hz;
    private static long at;
    private static int gg;
    private static long ba;
    private static int hy;
    private static int ix;
    private static long ft;
    private static long i;
    private static long am;
    private static int ki;
    private static int ai;
    private static long es;
    private static int bf;
    private static long jr;
    private static int dh;
    private static int ex;
    private static int je;
    private static int hj;
    private static int hh;
    private static int hg;
    private static int dn;
    private static int ir;
    private static long dy;
    private static long go;
    private static int de;
    private static int bw;
    private static long fn;
    private static long el;
    private static long o;

    @Override
    protected void a(ResultSet resultSet) {
        String string = null;
        try {
            string = resultSet.getString(this.a[gw]);
            String string2 = resultSet.getString(this.a[gy]);
            this.i(string, string2);
        }
        catch (Exception exception) {
            NLoginCore_370.b((String)NLoginCore_022.c("㺀", (int)gz, (long)ha) + this.a.getName() + (String)NLoginCore_022.c("㺃", (int)(hg & hh), (long)hi) + (String)(string == null ? NLoginCore_022.c("㺆", (int)hj, (long)(hl ^ hm)) : string + (String)NLoginCore_022.c("㺉", (int)ho, (long)hp)) + (String)NLoginCore_022.c("㺌", (int)hy, (long)hz), exception, new Object[ic]);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x2FL;
        l ^= 0xE072EFAE755268D4L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, 69, (byte)(47 + 36), (byte)(44 + 3), (byte)(49 + 18), (byte)(43 + 23), (byte)(45 + 22), (byte)(32 + 15), (byte)(79 + 1), (byte)(25 + 50), (byte)(36 + 31), (byte)(78 + 5), (byte)(3 + 50), (byte)(7 + 73), (byte)(75 + 22), (byte)(92 + 8), (byte)(67 + 33), (byte)(95 + 10), (byte)(21 + 89), (byte)(15 + 88)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.D("ԚԧԦөԩԥԠԩԴԣӰԮԲԫԮԴӶࢌࢍࢂࢎࢅࢀࢌࢅ࢙ࡹࡸࡧࡼࡸ࢟", (byte)86, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_022.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    private void a(NLoginCore_219 NLoginCore_2192, String string) {
        String string2 = NLoginCore_2192.a((String)NLoginCore_022.c("㺀", (int)(eq & er), (long)es) + string + (String)NLoginCore_022.c("㺃", (int)eu, (long)ev), (String)NLoginCore_022.c("㺆", (int)ex, (long)(ez ^ fc)));
        String string3 = NLoginCore_2192.a((String)NLoginCore_022.c("㺉", (int)(fd & fe), (long)ff) + string + (String)NLoginCore_022.c("㺌", (int)fh, (long)fi), (String)NLoginCore_022.c("㺏", (int)fl, (long)(fn ^ fo)));
        String string4 = NLoginCore_2192.a((String)NLoginCore_022.c("㺒", (int)(fp & fr), (long)ft) + string + (String)NLoginCore_022.c("㺕", (int)(fv & fw), (long)fx), (String)NLoginCore_022.c("㺘", (int)fz, (long)(ga ^ gb)));
        String string5 = NLoginCore_2192.a((String)NLoginCore_022.c("㺛", (int)gc, (long)(ge ^ gf)) + string + (String)NLoginCore_022.c("㺞", (int)gg, (long)(gi ^ gk)), (String)NLoginCore_022.c("㺡", (int)gm, (long)(go ^ gp)));
        this.a[NLoginCore_022.gq] = string2;
        this.a[NLoginCore_022.gs] = string3;
        this.a[NLoginCore_022.gt] = string4;
        this.a[NLoginCore_022.gv] = string5;
    }

    private static void void_b() {
        int n;
        i = 1588454927661203338L;
        long l = i ^ 0xE072EFAE755268D4L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(65 + 4), (byte)(56 + 27), 47, (byte)(44 + 23), (byte)(31 + 35), (byte)(28 + 39), (byte)(22 + 25), (byte)(3 + 77), (byte)(23 + 52), (byte)(51 + 16), (byte)(12 + 71), (byte)(14 + 39), (byte)(71 + 9), (byte)(80 + 17), 100, (byte)(97 + 3), (byte)(43 + 62), (byte)(93 + 17), (byte)(98 + 5)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(28 + 40), 69, (byte)(37 + 46)}, StandardCharsets.UTF_8));
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
                    NLoginCore_022.f[0] = NLoginCore_091.D("ҲҍӆҮӈҧӄӋӎҬҭӓӢҬӘҜҾҸӚҴӚҳҰұ", (byte)56, 68);
                    NLoginCore_022.f[1] = NLoginCore_076.E("թՇԸՠԭՈԩՆՠԴժՉդնՌՈՔ՘ԸՀպձՕՖյր՜ՈԻճ֋ի", (byte)56, 69);
                    NLoginCore_022.f[2] = NLoginCore_324.F("ԣզՆԨՎհԬՓՑ԰ԶԼ", (byte)56, 70);
                    NLoginCore_022.f[3] = NLoginCore_138.C("ҤҰҡӃҫҤӈҏӎҸқҥ", (byte)56, 67);
                    NLoginCore_022.f[4] = NLoginCore_091.C("ҪҴҪӚҭұӏҪүӕҼҥ", (byte)56, 67);
                    NLoginCore_022.f[5] = NLoginCore_559.C("ӎҍӅӖґҴӔҕӗҿҼҥ", (byte)56, 67);
                    NLoginCore_022.f[6] = NLoginCore_446.B("ŚĽŦŢŤşŝĻřŜŎķ", (byte)56, 66);
                    NLoginCore_022.f[7] = NLoginCore_223.E("ԥԫՂՍԧձգդԫ՟ԷԶՓ԰ԵռԼՋ՚տիժքԿրՐՄԿ՘ՔՇՃխխկժՉգՠՊ֖Ո՗շկչզհ֒֕՚թկշղ֛բբն֓՛չվփ֛լթփռց֜սձը֯քչևֳֹ֥֦֙֯֍ָս־ֺ֞տ֥ׄ׋׃ָָׄ׃ְֿ֦֨֟ׄב֦֦׆ֶָֺֽ֛֩֯ב׎ֿ֠עׂׅ׀ֱהץ׭נ׊ט֨֬ש׎בׯ׀ה׍׵ֱׄי׌שמֿ״ֺׁ־׼לוׁ׳ומׂ", (byte)56, 69);
                    NLoginCore_022.f[8] = NLoginCore_027.F("թՇԸՠԭՈԩՆՠԴթՀժՏյսԸԶխտՙՂՏՠ՟ծՔ։պևրՆՕՈՌգ՚ՏտՓճծ՟՜", (byte)56, 70);
                    NLoginCore_022.f[9] = NLoginCore_027.D("ҵҗҫӅӐҴӇҨҾҘӎӊӓӛүӄӗӘҠӔҨҷӜӧӚӆӜӇӲӊөӈӬӯүҵӢӏӸӭӊӇҼӿӐҼӐӁӱԅӟӹӿӣӐӑ", (byte)56, 68);
                    NLoginCore_022.f[10] = NLoginCore_324.A("ŤłĳśĨŃĤŁśįŤĻťŊŰŸĳıŨźŔŽņŒŐŰŎōŎżŚőŇŻńżŉŸƄŚťŨŉŗ", (byte)56, 65);
                    NLoginCore_022.f[11] = NLoginCore_451.B("ŕŞŦĢťŤňŚŭřŐőőĳŃŋĵŋŇśŕŮŎźŵĻŸŗŰńƄŔ", (byte)56, 66);
                    NLoginCore_022.f[12] = NLoginCore_004.A("ŤłĳśĨŃĤŁśįŦŝŪŋİŶŭůŕůŇŰűŭŪŜşŢťŰŠŸŧŀŤƃƇŌŶňƀŞŚŗ", (byte)56, 65);
                    NLoginCore_022.f[13] = NLoginCore_027.A("ŤłĳśĨŃĤŁśįŦŝŪŋİŶŭůŕůŇŰűŭŪŜşŢťŰŠŸŷŲŢżŸũƇũŝŎŉŗ", (byte)56, 65);
                    NLoginCore_022.f[14] = NLoginCore_138.F("թՇԸՠԭՈԩՆՠԴիբկՐԵջղմ՚մՌյնղկադէժյեսը՟տջ։պՍՊ՞ն֓կՙթ֒֊Ֆ՞֍խկժէը", (byte)56, 70);
                    NLoginCore_022.f[15] = NLoginCore_559.A("ıŨŃļņĦřŇŚĹŊķ", (byte)56, 65);
                    NLoginCore_022.f[16] = NLoginCore_559.A("ŤłĳśĨŃĤŁśįŦŝŪŋİŶŭůŕůŇŰűŭŪŜşŢťŰŠŸšŽťŜƄŸńŇŇŮŢŗ", (byte)56, 65);
                    NLoginCore_022.f[17] = NLoginCore_559.D("ҾӑӎӉҙҮӑҴҝґӊҥ", (byte)56, 68);
                    NLoginCore_022.f[18] = NLoginCore_027.C("ӒҰҡӉҖұҒүӉҝӔӋӘҹҞӤӛӝӃӝҵӞӟӛӘӊӍӐӓӞӎӦӬӴӢҲӺҹӶӱӍӎӑӛӜӁӎӣӅӗӢӤԄӓӐӑ", (byte)56, 67);
                    NLoginCore_022.f[19] = NLoginCore_451.F("՛էէեՊ՚դՏՔԳՃԼ", (byte)56, 70);
                    NLoginCore_022.f[20] = NLoginCore_004.B("ŤłĳśĨŃĤŁśįŤŀŒĴŐşĲűŚřĵŶŰŽŭŖŬŢűƅœŰƄŻŻƊŖƌƊŤƅŊƄŗ", (byte)56, 66);
                    NLoginCore_022.f[21] = NLoginCore_173.A("ŕŞŦĢťŤňŚŭřŐőőĳŃŋĵŋŇśŕŮŎźŵĻŸŗŰńƄŔ", (byte)56, 65);
                    NLoginCore_022.f[22] = NLoginCore_027.F("ԣՎհԹԺՒՂՂՈՀՑո԰ԳՋՍվԹէՙԳԼփպԾօձՂօ֋ց՜ԿժաբՑֆ֑֐ևՒՎ՜", (byte)56, 70);
                    NLoginCore_022.f[23] = NLoginCore_559.B("ŤłĳśĨŃĤŁśįŤĲŦŕŅūĶŲİźųūłŃ", (byte)56, 66);
                    NLoginCore_022.f[24] = NLoginCore_384.B("ŝńŢŁśŎŭŎŃśĩķ", (byte)56, 66);
                    NLoginCore_022.f[25] = NLoginCore_427.C("ӖӆӋӄҰӅҹҾҲҖҟҥ", (byte)56, 67);
                    NLoginCore_022.f[26] = NLoginCore_092.F("թՇԸՠԭՈԩՆՠԴթԷի՚ՊհԻշԵտոհՇՈ", (byte)56, 70);
                    NLoginCore_022.f[27] = NLoginCore_004.F("ՍԠԿդէ՜ՈըԳգԱՁբկՑՄԹՊյԸ՝ՊՇՈ", (byte)56, 70);
                    NLoginCore_022.f[28] = NLoginCore_446.C("үҎӄӂҰҪҮҰҖҲӒӚүәӅӎӑӀҶӄӁӃҰұ", (byte)56, 67);
                    NLoginCore_022.f[29] = NLoginCore_451.E("թՇԸՠԭՈԩՆՠԴթԷի՚ՊհԻշԵտոհՇՈ", (byte)56, 69);
                    NLoginCore_022.f[30] = NLoginCore_138.D("ҐҿҮҷӗҷҥӗҮҞҴҥ", (byte)56, 68);
                    NLoginCore_022.f[31] = NLoginCore_384.B("ŒŜĻŦĬĥłśřŒŨķ", (byte)56, 66);
                    NLoginCore_022.f[32] = NLoginCore_324.B("ŤłĳśĨŃĤŁśįŤĲŦŕŅūĶŲİźųūłŃ", (byte)56, 66);
                    NLoginCore_022.f[33] = NLoginCore_427.A("ĨļĜŇŌĭŠŬĩŞĭũĴŧŏĳŪţŵŸňūłŃ", (byte)56, 65);
                    NLoginCore_022.f[34] = NLoginCore_091.C("ӗҒґҶҢғӊҗӈҳӘәӁқӗӏҹҞӑҥӀӃҰұ", (byte)56, 67);
                    NLoginCore_022.f[35] = NLoginCore_173.C("ӔӎүҰҩӋӔӍҨҖҗҥ", (byte)56, 67);
                    NLoginCore_022.f[36] = NLoginCore_559.F("ԥՀՠ՛ԫճՋՀՋկԮԼ", (byte)56, 70);
                    NLoginCore_022.f[37] = NLoginCore_451.B("ĠŅĹŘĪĿĺŠŎŏņķ", (byte)56, 66);
                    NLoginCore_022.f[38] = NLoginCore_027.A("ĠŝĨńūňŞŉņŁņķ", (byte)56, 65);
                    NLoginCore_022.f[39] = NLoginCore_387.D("ҖҭғӕӒҶҜҴҖұҺӛӖӋҶҗҮӝӦҢӈӌӇңӢӀӐӦӠҼӵӀӴҵӧӹӥӏҶӻӏӼӜӅ", (byte)56, 68);
                    NLoginCore_022.f[40] = NLoginCore_559.A("ŤłĳśĨŃĤŁśįŤŒŀŶĶŴŔŋŐőķŕżŸŘĺŮŘőůśŝ", (byte)56, 65);
                    NLoginCore_022.f[41] = NLoginCore_091.B("ťśĦīŤĨŧĬħħįĬĮőĶŋŌĲŃźŵŕłŃ", (byte)56, 66);
                    NLoginCore_022.f[42] = NLoginCore_110.E("՗ՃլՠհեՍԬնթՏԼ", (byte)56, 69);
                    NLoginCore_022.f[43] = NLoginCore_559.D("ӖӆӋӄҰӅҹҾҲҖҟҥ", (byte)56, 68);
                    NLoginCore_022.f[44] = NLoginCore_387.E("իեՆՇՀբիդԿԭԮԼ", (byte)56, 69);
                    NLoginCore_022.f[45] = NLoginCore_201.B("ĠĻśŖĦŮņĻņŪĩķ", (byte)56, 66);
                    NLoginCore_022.f[46] = NLoginCore_004.D("ӎҶҬӊҧҩӅӉӝҼһҟҴӢӡһӀӡҰӒӃӠӢӥҷӢҨӟҪӊҦүӔӷӶӬӱӵһӈҵӯӈӅ", (byte)56, 68);
                    NLoginCore_022.f[47] = NLoginCore_223.D("ғғҕӉҫҨӚқӓҬӚҥ", (byte)56, 68);
                    NLoginCore_022.f[48] = NLoginCore_173.D("ҵҠҒӂӃӇҵҜӟґҸҥ", (byte)56, 68);
                    NLoginCore_022.f[49] = NLoginCore_575.A("śŞŇĿŠĦĭŢĮŊųŊĴşŪŕĴŰĸŶũŕłŃ", (byte)56, 65);
                    NLoginCore_022.f[50] = NLoginCore_384.A("ŞŠħŁŪŊŇŞŭŎŊķ", (byte)56, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_022.f[0] = NLoginCore_091.E("ՉԤ՝Յ՟Ծ՛բեՃՄչշՎՓջծԵժ՟շՊՇՈ", (byte)56, 69);
                    NLoginCore_022.f[1] = NLoginCore_324.C("ӒҰҡӉҖұҒүӉҝӓҲӍӟҵұҽӁҡҩӣӨӉӖӇҦӟӧҮӭҴӫ", (byte)56, 67);
                    NLoginCore_022.f[2] = NLoginCore_092.E("Շ՛ԻՂ՛ՆլՌԽՕՋԼ", (byte)56, 69);
                    NLoginCore_022.f[3] = NLoginCore_092.E("ԻՆգՙ՜԰ՏՁԬհՁՕ՚մՇԵմ՟՝յ՜հՇՈ", (byte)56, 69);
                    NLoginCore_022.f[4] = NLoginCore_110.A("ĞĹţŜūĦţŰĪŭŀŋŐŋťĳœŏŬĺűūłŃ", (byte)56, 65);
                    NLoginCore_022.f[5] = NLoginCore_092.F("ՕԮ՚՝ԨըՏԯԮբՖխճՖճծՉչՍ՜՚ՊՇՈ", (byte)56, 70);
                    NLoginCore_022.f[6] = NLoginCore_027.C("ґҰҖӉҗӃӑҵҘӀӘӉҲӜӔҿӝҳҦҽӚҳҰұ", (byte)56, 67);
                    NLoginCore_022.f[7] = NLoginCore_324.A("ĠĦĽňĢŬŞşĦŚĲıŎīİŷķņŕźŦťſĺŻŋĿĺœŏłľŨŨŪťńŞśŅƑŃŒŲŪŴšūƍƐŕŤŪŲŭƖŝŝűƎŖŴŹžƖŧŤžŷżƗŸŬţƪſŴƂƠƔƪơƮƴƈƳŸƹƙƵźƠƿǆƾƳƳƿƾƣƺƫƚƿơǌơơǁƱƖƳƸƵƤƪǌǉƛƺǝƽǀƻƬǏǠǨǛǅǓƣƧǤǉǌǪƻǏǈǰƿƬǔǇǤǙƺǯƯƼǱǻƽǺǺȀƿǯǶ", (byte)56, 65);
                    NLoginCore_022.f[8] = NLoginCore_173.E("թՇԸՠԭՈԩՆՠԴթՀժՏյսԸԶխտՙՂՏՠ՟ծՔ։պևրՆՙդրփգ֋Յ՞ց֊ղիՑ֗թՕ֏՛֘շ՛֐էը", (byte)56, 69);
                    NLoginCore_022.f[9] = NLoginCore_027.C("ҵҗҫӅӐҴӇҨҾҘӎӊӓӛүӄӗӘҠӔҨҷӜӧӚӆӜӇӲӊөӈӬӯүҵӢӏӸӭӊӇҼәӔӷӾӤԂԅӰӈԅӹӐӑ", (byte)56, 67);
                    NLoginCore_022.f[10] = NLoginCore_004.F("թՇԸՠԭՈԩՆՠԴթՀժՏյսԸԶխտՙւՋ՗ՕյՓՒՓց՟Ֆ։Ջ՝՜ՠՊ֔ռՠդ։՜", (byte)56, 70);
                    NLoginCore_022.f[11] = NLoginCore_559.E("՚գիԧժթՍ՟ղ՞ՕՖՖԸՈՐԺՐՌՠ՚ջՎջԻսձՆտվտ֌", (byte)56, 69);
                    NLoginCore_022.f[12] = NLoginCore_173.C("ӒҰҡӉҖұҒүӉҝӔӋӘҹҞӤӛӝӃӝҵӞӟӛӘӊӍӐӓӞӎӦӍӏӶӃӪӛӲӭӈӓӡӑԁӤӣӀӛәӀӾԀԉӐӑ", (byte)56, 67);
                    NLoginCore_022.f[13] = NLoginCore_110.E("թՇԸՠԭՈԩՆՠԴիբկՐԵջղմ՚մՌյնղկադէժյեստթ֊֋ղւտ֊֏֓Ւր֊Ց֍՜֑֓Ֆ֗խ֐էը", (byte)56, 69);
                    NLoginCore_022.f[14] = NLoginCore_559.C("ӒҰҡӉҖұҒүӉҝӔӋӘҹҞӤӛӝӃӝҵӞӟӛӘӊӍӐӓӞӎӦӑӈӨӤӲӣҶҳӇӟӻӺӯӿӼӱӻԁӴӉӆӹӐӑ", (byte)56, 67);
                    NLoginCore_022.f[15] = NLoginCore_446.D("ҭҪҘӐӊҥӒҸӝӈӍҚҴӢӏҰӦҳӚҢҶөҰұ", (byte)56, 68);
                    NLoginCore_022.f[16] = NLoginCore_091.F("թՇԸՠԭՈԩՆՠԴիբկՐԵջղմ՚մՌյնղկադէժյեսշ֊գլղՉ֍ֆ֖ժւծդՑ֓դֈ֓իծ։պէը", (byte)56, 70);
                    NLoginCore_022.f[17] = NLoginCore_427.E("ՆՍԥաՒԤԼԽԭՊեԼ", (byte)56, 69);
                    NLoginCore_022.f[18] = NLoginCore_559.F("թՇԸՠԭՈԩՆՠԴիբկՐԵջղմ՚մՌյնղկադէժյեսփ֋չՉ֑Ր֍ֈդեէ֌ՙի֙֌շ֛֒ձտպէը", (byte)56, 70);
                    NLoginCore_022.f[19] = NLoginCore_559.F("դՠ՜ՃՎՋէյեՏՇԼ", (byte)56, 70);
                    NLoginCore_022.f[20] = NLoginCore_387.A("ŤłĳśĨŃĤŁśįŤŀŒĴŐşĲűŚřĵŶŰŽŭŖŬŢűƅœŰŲŘŜƇŔŸŇśžţŚŗ", (byte)56, 65);
                    NLoginCore_022.f[21] = NLoginCore_138.D("ӃӌӔҐӓӒҶӈӛӇҾҿҿҡұҹңҹҵӉӃәӬӊҫӁӨңӊөҭұ", (byte)56, 68);
                    NLoginCore_022.f[22] = NLoginCore_201.F("ԣՎհԹԺՒՂՂՈՀՑո԰ԳՋՍվԹէՙԳԼփպԾօձՂօ֋ց՜՜՗։հժ՚ւՍփը֑՜", (byte)56, 70);
                    NLoginCore_022.f[23] = NLoginCore_091.A("ŤłĳśĨŃĤŁśįťųňĭŪŭŊŘĴŋōŕłŃ", (byte)56, 65);
                    NLoginCore_022.f[24] = NLoginCore_201.A("ŘŚœņŘĦūśŀŚļũŁńőōťŴŴŌűŅłŃ", (byte)56, 65);
                    NLoginCore_022.f[25] = NLoginCore_223.E("ՁԨեըԮճխԾԫԲծԯբչՉՌմՒԹխՓրՇՈ", (byte)56, 69);
                    NLoginCore_022.f[26] = NLoginCore_201.B("ŤłĳśĨŃĤŁśįťŊļŦıŵĸšŦĭœŅłŃ", (byte)56, 66);
                    NLoginCore_022.f[27] = NLoginCore_091.D("Ҷ҉ҨӍӐӅұӑҜӌҗӁҮӘҞӃҞӤӄҲҲәҰұ", (byte)56, 68);
                    NLoginCore_022.f[28] = NLoginCore_110.F("Նԥ՛ՙՇՁՅՇԭՉթլՑձ՜ՇՐՙՓժՐՊՇՈ", (byte)56, 70);
                    NLoginCore_022.f[29] = NLoginCore_076.B("ŤłĳśĨŃĤŁśįŧļŢůĿŏŵŢłűŎŅłŃ", (byte)56, 66);
                    NLoginCore_022.f[30] = NLoginCore_453.D("ӅҗҶҋҴӊҩӒҧӓӈӒҜҸӗӛӣӔӑӥҶӃҰұ", (byte)56, 68);
                    NLoginCore_022.f[31] = NLoginCore_559.D("ӂӀґӅҔҍҳәүҧӎҥ", (byte)56, 68);
                    NLoginCore_022.f[32] = NLoginCore_451.B("ŤłĳśĨŃĤŁśįŧśłšŖňŸĵĬňŋŻłŃ", (byte)56, 66);
                    NLoginCore_022.f[33] = NLoginCore_387.C("ҖҪҊҵҺқӎӚҗӌҝһҳұҲӖӚҧәӥӖәҰұ", (byte)56, 67);
                    NLoginCore_022.f[34] = NLoginCore_387.A("ũĤģňĴĥŜĩŚŅŪūūłŲŀŹŋŬŷŷŕłŃ", (byte)56, 65);
                    NLoginCore_022.f[35] = NLoginCore_110.B("ĲŚŖĨņŢŚřŰũŜķ", (byte)56, 66);
                    NLoginCore_022.f[36] = NLoginCore_559.A("ĹĵĠŤĩĵļġĦŤıķ", (byte)56, 65);
                    NLoginCore_022.f[37] = NLoginCore_324.D("ҎӀҸӃҷӒӓӆҧҜӡӊӝҠқҿӟҼӞҠҠөҰұ", (byte)56, 68);
                    NLoginCore_022.f[38] = NLoginCore_559.D("ңӆӘӖӑҴӋҫҵҧҴҥ", (byte)56, 68);
                    NLoginCore_022.f[39] = NLoginCore_091.E("ԭՄԪլթՍԳՋԭՈՑղխբՍԮՅմսԹ՟գ՞Ժչ՗էսշՓ֌՗դՠրՈղֆօ՟լ֎օ՜", (byte)56, 69);
                    NLoginCore_022.f[40] = NLoginCore_223.E("թՇԸՠԭՈԩՆՠԴթ՗ՅջԻչՙՐՕՖԼծ՞ՔՔնսղՄբՃՋՙ՗֎֑ՉջըՓխմէ՜", (byte)56, 69);
                    NLoginCore_022.f[41] = NLoginCore_027.E("ժՠԫ԰թԭլԱԬԬԳՆժՊԻԸռյՠալ՚ՇՈ", (byte)56, 69);
                    NLoginCore_022.f[42] = NLoginCore_091.E("ՅՃԬՃԱՆԿՊձԨձԼ", (byte)56, 69);
                    NLoginCore_022.f[43] = NLoginCore_559.E("ՁծԭԾէհգՁԲԭնՇՑՓը՛թոտխն՚ՇՈ", (byte)56, 69);
                    NLoginCore_022.f[44] = NLoginCore_427.A("ĸĦŪħťĹńĿĻůŠķ", (byte)56, 65);
                    NLoginCore_022.f[45] = NLoginCore_138.A("ŠĹŦşļŤōĭĬĹŰķ", (byte)56, 65);
                    NLoginCore_022.f[46] = NLoginCore_387.C("ӎҶҬӊҧҩӅӉӝҼһҟҴӢӡһӀӡҰӒӃӠӢӥҷӢҨӟҪӊҦүҴӄӃӰӏӓӌӸҸӛӿӠԃӯԁӅӿӚӡӆӗӓӐӑ", (byte)56, 67);
                    NLoginCore_022.f[47] = NLoginCore_092.A("ĞĽŅťħŃĺŬŊŠŜķ", (byte)56, 65);
                    NLoginCore_022.f[48] = NLoginCore_324.D("ҔӎҫӑӊҭҘҙҵӏӊҥ", (byte)56, 68);
                    NLoginCore_022.f[49] = NLoginCore_453.F("ՠգՌՄեԫԲէԳՏոբԯԳՈ՛վխկՌԷ՚ՇՈ", (byte)56, 70);
                    NLoginCore_022.f[50] = NLoginCore_559.D("ӒҦӄҷҗҙӖҰҭҭӎҥ", (byte)56, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_022.f[0] = NLoginCore_076.C("ӅҿҧӌӆұҵҬҜҟұӛӝәҵҶҶӦӃҴҢӃҰұ", (byte)56, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_022.f[0] = NLoginCore_384.A("ĺĸľŔŔřŞŚťŒŤķ", (byte)56, 65);
                }
            }
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(NLoginCore_219 var1_1) {
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
        var_int_e = (0 >>> 112 | 0 << ~112 + 1) & 0xFFFFFFFF;
        o = Long.reverse(-6485342768401297304L);
        t = Integer.reverse(Integer.MIN_VALUE);
        z = (0 >>> 250 | 0 << ~250 + 1) & 0xFFFFFFFF;
        ai = Integer.reverse(0x20000000);
        ak = Integer.reverse(Integer.MIN_VALUE);
        am = Long.reverse(-6485342768401297304L);
        an = Integer.reverse(0x40000000);
        ao = -1 >>> 64 | -1 << ~64 + 1;
        ap = Long.reverse(-6485342768401297304L);
        aq = -1 >>> 43 | -1 << -43;
        ar = Integer.reverse(-1073741824);
        as = Long.reverse(5908563406122307688L);
        at = Long.reverse(-864691128455135232L);
        aw = Integer.reverse(0);
        az = Integer.reverse(0x20000000);
        ba = Long.reverse(5908563406122307688L);
        bb = Long.reverse(-864691128455135232L);
        bc = Integer.reverse(Integer.MIN_VALUE);
        bd = (-2147483646 >>> 191 | -2147483646 << ~191 + 1) & 0xFFFFFFFF;
        bf = -1 >>> 85 | -1 << -85;
        bh = Long.reverse(-6485342768401297304L);
        bi = (0x40000000 >>> 61 | 0x40000000 << ~61 + 1) & 0xFFFFFFFF;
        bj = Integer.reverse(0x60000000);
        bl = -1 >>> 96 | -1 << -96;
        bm = Long.reverse(-6485342768401297304L);
        bn = (6 >>> 161 | 6 << ~161 + 1) & 0xFFFFFFFF;
        bp = 28672 >>> 12 | 28672 << ~12 + 1;
        bq = Integer.reverse(-1);
        br = Long.reverse(-6485342768401297304L);
        bu = Integer.reverse(0x10000000);
        bw = (-1 >>> 132 | -1 << ~132 + 1) & 0xFFFFFFFF;
        by = Long.reverse(-6485342768401297304L);
        bz = Integer.reverse(-1879048192);
        ca = Long.reverse(5908563406122307688L);
        cd = Long.reverse(-864691128455135232L);
        ce = Integer.reverse(0x50000000);
        cf = Long.reverse(-6485342768401297304L);
        cg = (88 >>> 3 | 88 << ~3 + 1) & 0xFFFFFFFF;
        ch = (-1 >>> 21 | -1 << ~21 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-6485342768401297304L);
        cj = 24 >>> 161 | 24 << -161;
        ck = Long.reverse(5908563406122307688L);
        cl = Long.reverse(-864691128455135232L);
        cm = 1073742237 >>> 61 | 1073742237 << -61;
        co = Integer.reverse(-1342177280);
        cr = (-1 >>> 153 | -1 << -153) & 0xFFFFFFFF;
        ct = Long.reverse(-6485342768401297304L);
        cv = Integer.reverse(0x70000000);
        cw = Long.reverse(5908563406122307688L);
        cx = Long.reverse(-864691128455135232L);
        cy = (60 >>> 194 | 60 << -194) & 0xFFFFFFFF;
        cz = Long.reverse(-6485342768401297304L);
        da = 131072 >>> 205 | 131072 << -205;
        db = Integer.reverse(-1);
        dc = Long.reverse(-6485342768401297304L);
        dd = (0x20000002 >>> 157 | 0x20000002 << ~157 + 1) & 0xFFFFFFFF;
        de = (-1 >>> 110 | -1 << ~110 + 1) & 0xFFFFFFFF;
        df = Long.reverse(-6485342768401297304L);
        dh = (36864 >>> 75 | 36864 << ~75 + 1) & 0xFFFFFFFF;
        dk = Integer.reverse(-1);
        dm = Long.reverse(-6485342768401297304L);
        dn = (4864 >>> 200 | 4864 << -200) & 0xFFFFFFFF;
        dp = Long.reverse(5908563406122307688L);
        ds = Long.reverse(-864691128455135232L);
        dt = 0x14000000 >>> 216 | 0x14000000 << -216;
        dv = Long.reverse(5908563406122307688L);
        dy = Long.reverse(-864691128455135232L);
        dz = Integer.reverse(-1476395008);
        eb = Long.reverse(5908563406122307688L);
        ee = Long.reverse(-864691128455135232L);
        ek = (22 >>> 224 | 22 << -224) & 0xFFFFFFFF;
        el = Long.reverse(5908563406122307688L);
        eo = Long.reverse(-864691128455135232L);
        eq = 23552 >>> 74 | 23552 << ~74 + 1;
        er = (-1 >>> 149 | -1 << ~149 + 1) & 0xFFFFFFFF;
        es = Long.reverse(-6485342768401297304L);
        eu = (393216 >>> 142 | 393216 << ~142 + 1) & 0xFFFFFFFF;
        ev = Long.reverse(-6485342768401297304L);
        ex = (400 >>> 228 | 400 << -228) & 0xFFFFFFFF;
        ez = Long.reverse(5908563406122307688L);
        fc = Long.reverse(-864691128455135232L);
        fd = 0x680000 >>> 82 | 0x680000 << ~82 + 1;
        fe = (-1 >>> 183 | -1 << -183) & 0xFFFFFFFF;
        ff = Long.reverse(-6485342768401297304L);
        fh = 0x1B0000 >>> 144 | 0x1B0000 << ~144 + 1;
        fi = Long.reverse(-6485342768401297304L);
        fl = (-2147483645 >>> 29 | -2147483645 << ~29 + 1) & 0xFFFFFFFF;
        fn = Long.reverse(5908563406122307688L);
        fo = Long.reverse(-864691128455135232L);
        fp = Integer.reverse(-1207959552);
        fr = Integer.reverse(-1);
        ft = Long.reverse(-6485342768401297304L);
        fv = Integer.reverse(0x78000000);
        fw = -1 >>> 63 | -1 << -63;
        fx = Long.reverse(-6485342768401297304L);
        fz = Integer.reverse(-134217728);
        ga = Long.reverse(5908563406122307688L);
        gb = Long.reverse(-864691128455135232L);
        gc = 65536 >>> 235 | 65536 << ~235 + 1;
        ge = Long.reverse(5908563406122307688L);
        gf = Long.reverse(-864691128455135232L);
        gg = 0x40000008 >>> 190 | 0x40000008 << -190;
        gi = Long.reverse(5908563406122307688L);
        gk = Long.reverse(-864691128455135232L);
        gm = (139264 >>> 44 | 139264 << -44) & 0xFFFFFFFF;
        go = Long.reverse(5908563406122307688L);
        gp = Long.reverse(-864691128455135232L);
        gq = 0 >>> 201 | 0 << ~201 + 1;
        gs = Integer.reverse(Integer.MIN_VALUE);
        gt = (0x1000000 >>> 23 | 0x1000000 << ~23 + 1) & 0xFFFFFFFF;
        gv = Integer.reverse(-1073741824);
        gw = Integer.reverse(0);
        gy = Integer.reverse(Integer.MIN_VALUE);
        gz = 0x23000000 >>> 56 | 0x23000000 << ~56 + 1;
        ha = Long.reverse(-6485342768401297304L);
        hg = Integer.reverse(0x24000000);
        hh = Integer.reverse(-1);
        hi = Long.reverse(-6485342768401297304L);
        hj = Integer.reverse(-1543503872);
        hl = Long.reverse(5908563406122307688L);
        hm = Long.reverse(-864691128455135232L);
        ho = 0x13000000 >>> 215 | 0x13000000 << ~215 + 1;
        hp = Long.reverse(-6485342768401297304L);
        hy = 4992 >>> 167 | 4992 << -167;
        hz = Long.reverse(-6485342768401297304L);
        ic = 0 >>> 210 | 0 << -210;
        ie = Integer.reverse(0x14000000);
        ig = Long.reverse(-6485342768401297304L);
        ii = Integer.reverse(-1811939328);
        ik = Long.reverse(5908563406122307688L);
        il = Long.reverse(-864691128455135232L);
        im = 0 >>> 106 | 0 << -106;
        in = Integer.reverse(0);
        iq = Integer.reverse(0x40000000);
        ir = 65536 >>> 175 | 65536 << -175;
        it = Integer.reverse(Integer.MIN_VALUE);
        iu = Integer.reverse(0x40000000);
        ix = (0x2A00000 >>> 244 | 0x2A00000 << ~244 + 1) & 0xFFFFFFFF;
        iz = Long.reverse(5908563406122307688L);
        jc = Long.reverse(-864691128455135232L);
        je = Integer.reverse(0x40000000);
        jf = -1073741814 >>> 94 | -1073741814 << ~94 + 1;
        jg = Long.reverse(5908563406122307688L);
        jh = Long.reverse(-864691128455135232L);
        ji = (0 >>> 135 | 0 << ~135 + 1) & 0xFFFFFFFF;
        jl = (0 >>> 68 | 0 << ~68 + 1) & 0xFFFFFFFF;
        jo = 524288 >>> 243 | 524288 << -243;
        jp = 0xB000000 >>> 182 | 0xB000000 << -182;
        jq = Long.reverse(5908563406122307688L);
        jr = Long.reverse(-864691128455135232L);
        jt = Integer.reverse(-1275068416);
        ju = Long.reverse(-6485342768401297304L);
        ka = Integer.reverse(0x74000000);
        kb = Long.reverse(5908563406122307688L);
        kc = Long.reverse(-864691128455135232L);
        kd = Integer.reverse(0);
        ke = 385024 >>> 205 | 385024 << ~205 + 1;
        kf = Long.reverse(5908563406122307688L);
        kg = Long.reverse(-864691128455135232L);
        kh = 1 >>> 158 | 1 << ~158 + 1;
        ki = Integer.reverse(0xC000000);
        kj = Integer.reverse(-1);
        kk = Long.reverse(-6485342768401297304L);
        kl = 4096 >>> 44 | 4096 << -44;
        km = (0x6200000 >>> 213 | 0x6200000 << ~213 + 1) & 0xFFFFFFFF;
        kn = Long.reverse(5908563406122307688L);
        ko = Long.reverse(-864691128455135232L);
        kp = (0x6400000 >>> 117 | 0x6400000 << ~117 + 1) & 0xFFFFFFFF;
        kq = Long.reverse(-6485342768401297304L);
        kr = Integer.reverse(-872415232);
        ks = Integer.reverse(-872415232);
        var_java_lang_String_arr_e = new String[kr];
        f = new String[ks];
        NLoginCore_022.void_b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_022.c("㺀", (int)ie, (long)ig), (String)NLoginCore_022.c("㺃", (int)ii, (long)(ik ^ il)));
        File file = new File(this.java_io_File_b(), string);
        int n = im;
        try (Object object = new BufferedReader(new FileReader(file));){
            while (((BufferedReader)object).readLine() != null) {
                ++n;
            }
        }
        this.j = Math.max(in, n % iq == 0 ? n / ir : (n - it) / iu);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
            while ((object = bufferedReader.readLine()) != null) {
                String[] stringArray;
                if (((String)object).isEmpty() || (stringArray = ((String)object).split((String)NLoginCore_022.c("㺆", (int)ix, (long)(iz ^ jc)))).length < je || ((String)NLoginCore_022.c("㺉", (int)jf, (long)(jg ^ jh))).equalsIgnoreCase(stringArray[ji])) continue;
                String string2 = stringArray[jl];
                try {
                    String string3 = stringArray[jo];
                    this.i(string2, string3);
                }
                catch (Exception exception) {
                    NLoginCore_370.b((String)NLoginCore_022.c("㺌", (int)jp, (long)(jq ^ jr)) + this.a.getName() + (String)NLoginCore_022.c("㺏", (int)jt, (long)ju) + string2 + (String)NLoginCore_022.c("㺒", (int)ka, (long)(kb ^ kc)), exception, new Object[kd]);
                }
                finally {
                    ++this.l;
                }
            }
        }
    }

    private void i(String string, String string2) {
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        Consumer<ForceRegisterConfig> consumer = ForceRegisterConfig2 -> {
            ForceRegisterConfig2.D();
            ForceRegisterConfig2.a(null);
        };
        String[] stringArray = string2.split((String)NLoginCore_022.c("㺀", (int)ke, (long)(kf ^ kg)));
        if (stringArray.length == kh && ((String)NLoginCore_022.c("㺃", (int)(ki & kj), (long)kk)).equals(stringArray[kl])) {
            this.a(string, string2, null, null, consumer);
        } else {
            this.a(string, (String)NLoginCore_022.c("㺆", (int)km, (long)(kn ^ ko)) + string + (String)NLoginCore_022.c("㺉", (int)kp, (long)kq) + string2, null, null, consumer);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_022.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ƋƭƯƏƳǒǊǠǌƛǙǏǝǗƠǅǧǦǞǤǞƳ", (byte)114, 66), NLoginCore_022.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.F("֑֞֝ՠ֚֠֜֗֠֫է֥֢֥֩֫խःऄࣹअࣼࣷःࣼऐࣰ࣯࣯ࣞࣳखֈ", (byte)114, 70) + string + NLoginCore_387.C("Յ", (byte)114, 67) + methodType.toString(), exception);
        }
    }

    public NLoginCore_022(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_u, (String)NLoginCore_022.c("㺀", (int)var_int_e, (long)o), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? t : z) != 0);
    }
}

