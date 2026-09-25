/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
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
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_413
extends NLoginCore_098 {
    private static long fi;
    private static long by;
    private static long ff;
    private static int dn;
    private static String[] var_java_lang_String_arr_e;
    private static int dd;
    private static long df;
    private static int hg;
    private static long ct;
    private static int gm;
    private static int ao;
    private static long cw;
    private static int y;
    private static int dw;
    private static int hh;
    private static int bi;
    private static int ed;
    private static int in;
    private static int hy;
    private static long fj;
    private static long dc;
    private static int var_int_e;
    private static long fn;
    private static long cp;
    private static int hm;
    private static int co;
    private static long fc;
    private static long di;
    private static int ir;
    private static long cd;
    private static long go;
    private static long ee;
    private static long dv;
    private static int eu;
    private static int fr;
    private static long fo;
    private static long p;
    private static long gu;
    private static long gf;
    private static int cc;
    private static int dh;
    private static int fh;
    private static long bh;
    private static long ga;
    private static long cq;
    private static long iv;
    private static int al;
    private static long dj;
    private static int ec;
    private static int ek;
    private static long ci;
    private static long iw;
    private static int cm;
    private static int ho;
    private static int gh;
    private static long ds;
    private static int fl;
    private static long ef;
    private static int fa;
    private static long cz;
    private static String[] f;
    private static long ig;
    private static long cx;
    private static int dl;
    private static long ha;
    private static long dm;
    private static long gb;
    private static long eo;
    private static long ab;
    private static long hi;
    private static long id;
    private static int eq;
    private static long cn;
    private static long be;
    private static int gq;
    private static int dt;
    private static int gs;
    private static int cr;
    private static long ez;
    private static long bk;
    private static int db;
    private static int gw;
    private static long br;
    private static int bj;
    private static int iq;
    private static int ic;
    private static int cj;
    private static long o;
    private static int dx;
    private static int bu;
    private static int cg;
    private static long ft;
    private static int ix;
    private static int ch;
    private static int bd;
    private static int bw;
    private static int dz;
    private static int gy;
    private static long fx;
    private static long es;
    private static int gc;
    private static long at;
    private static int gj;
    private static int fp;
    private static int gg;
    private static int fv;
    private static int gt;
    private static long hz;
    private static int cb;
    private static int ex;
    private static int er;
    private static int bp;
    private static int fz;
    private static long ep;
    private static int iy;
    private static int ij;
    private static long dp;
    private static int z;
    private static long cf;
    private static int da;
    private static int cy;
    private static long cu;
    private static long gp;
    private static long gx;
    private static int im;
    private static int dk;
    private static int ii;
    private static int bn;
    private static long ca;
    private static long hl;
    private static int it;
    private static long fy;
    private static int cv;
    private static long bm;
    private static long ge;
    private static int gz;
    private static long et;
    private static int em;
    private static long eb;
    private static int gv;
    private static int du;

    private static String a(int n, long l) {
        l ^= 0x6DL;
        l ^= 0xD292B611C03F55ACL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(30 + 39), (byte)(53 + 30), (byte)(17 + 30), (byte)(49 + 18), (byte)(15 + 51), (byte)(42 + 25), (byte)(27 + 20), (byte)(30 + 50), (byte)(38 + 37), (byte)(14 + 53), (byte)(72 + 11), (byte)(4 + 49), (byte)(13 + 67), 97, (byte)(52 + 48), (byte)(76 + 24), (byte)(8 + 97), 110, (byte)(54 + 49)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.B("ŶƃƂŅƅƁżƅƐſŌƊƎƇƊƐŒӧӡӪӛӝӢҾӰӝӤ", (byte)74, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_413.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_413(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_p, (String)NLoginCore_413.c("㺀", (int)var_int_e, (long)p), (String)NLoginCore_413.c("㺃", (int)(y & z), (long)ab));
    }

    private static void void_b() {
        int n;
        o = -7096140962263115578L;
        long l = o ^ 0xD292B611C03F55ACL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(65 + 3), (byte)(29 + 40), (byte)(30 + 53), (byte)(14 + 33), 67, 66, (byte)(61 + 6), (byte)(34 + 13), (byte)(68 + 12), (byte)(13 + 62), (byte)(31 + 36), (byte)(55 + 28), (byte)(47 + 6), (byte)(14 + 66), (byte)(17 + 80), (byte)(63 + 37), (byte)(38 + 62), (byte)(27 + 78), (byte)(56 + 54), (byte)(2 + 101)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_413.f[0] = NLoginCore_427.D("ҒҮґӇӐӐӕҽӇҧҮҶҞҽәӢҹҶҾӊӥҳҰұ", (byte)56, 68);
                    NLoginCore_413.f[1] = NLoginCore_110.F("ՉՀՁԨ՟ԪԪՁՑԵՈ԰ՃՃԲՄՅՔՔըւհՇՈ", (byte)56, 70);
                    NLoginCore_413.f[2] = NLoginCore_427.A("ĹńŕŘĻŁĥņŢŏŀšĮĵŰŒĶŊůŧŇŻłŃ", (byte)56, 65);
                    NLoginCore_413.f[3] = NLoginCore_027.F("՛ԸՆգԻՓժԳՌԾԲԼ", (byte)56, 70);
                    NLoginCore_413.f[4] = NLoginCore_027.E("՛ԸՆգԻՓժԳՌԾԲԼ", (byte)56, 69);
                    NLoginCore_413.f[5] = NLoginCore_004.A("ĥĹĳĥšŞļĬőũŤķ", (byte)56, 65);
                    NLoginCore_413.f[6] = NLoginCore_091.F("ՈիԩԿՒծՍՓգյՓԼ", (byte)56, 70);
                    NLoginCore_413.f[7] = NLoginCore_446.A("ĚģŝŤŕĥĥĬŁįŎķ", (byte)56, 65);
                    NLoginCore_413.f[8] = NLoginCore_091.D("ӓӒӓҲҘҪҥӕҖүӈӜҚӓӕҵӄӡӧҿӧәҰұ", (byte)56, 68);
                    NLoginCore_413.f[9] = NLoginCore_575.D("ҟӖҪҺӒҮҪӕҦӐӞҥ", (byte)56, 68);
                    NLoginCore_413.f[10] = NLoginCore_091.A("ğĸĜŢŁĥĩřļŰŜķ", (byte)56, 65);
                    NLoginCore_413.f[11] = NLoginCore_110.A("ĸĢŤĺŦĨĭĪňŬıķ", (byte)56, 65);
                    NLoginCore_413.f[12] = NLoginCore_453.E("ԾՉ՚՝ՀՆԪՋէՔՅկԶծՌԵպջր՘որՇՈ", (byte)56, 69);
                    NLoginCore_413.f[13] = NLoginCore_384.B("ņĢĩľŊńńŚŃůşĭŉĲŬŲĳŐŵŲŽŕłŃ", (byte)56, 66);
                    NLoginCore_413.f[14] = NLoginCore_384.B("ĹńŕŘĻŁĥņŢŏĿŃĪŴŀĭŴŎŐıŇŻłŃ", (byte)56, 66);
                    NLoginCore_413.f[15] = NLoginCore_324.F("ԧԠծԺլխՓԯՏՀխԼ", (byte)56, 70);
                    NLoginCore_413.f[16] = NLoginCore_201.D("ҧҲӃӆҩүғҴӐҽҮӁӃҮӅӓӗҿӛӥӈӌӋҼҤҹӇӠӭҼұӁ", (byte)56, 68);
                    NLoginCore_413.f[17] = NLoginCore_004.B("ĞŇŃĢūķŎšŧŠŬķ", (byte)56, 66);
                    NLoginCore_413.f[18] = NLoginCore_223.F("ԾՉ՚՝ՀՆԪՋէՔՅՎհղՏ՝վԾԻլնժր՚մտՔԺպեֆց", (byte)56, 70);
                    NLoginCore_413.f[19] = NLoginCore_173.D("ҧҲӃӆҩүғҴӐҽҭӘӢӐҬӟӒҾӦӅӂөҰұ", (byte)56, 68);
                    NLoginCore_413.f[20] = NLoginCore_138.C("ҏӓҹҐҘҒӊӖӈһҸҥ", (byte)56, 67);
                    NLoginCore_413.f[21] = NLoginCore_201.F("ՈիԩԿՒծՍՓգյՓԼ", (byte)56, 70);
                    NLoginCore_413.f[22] = NLoginCore_138.B("ĚģŝŤŕĥĥĬŁįŎķ", (byte)56, 66);
                    NLoginCore_413.f[23] = NLoginCore_091.A("ťŤťńĪļķŧĨŁŚŮĬťŧŇŖųŹőŹūłŃ", (byte)56, 65);
                    NLoginCore_413.f[24] = NLoginCore_138.B("ŐŪĨłńĺŚŁļŏļĳĴĮŅįŌŒĸŰřŖŌŹĸřŘŎŷźŮŒƈŚƋřƂŦƊŽƄšōŗ", (byte)56, 66);
                    NLoginCore_413.f[25] = NLoginCore_324.B("ŉŔŇĝşňŞŪŏŲįĬŐŧłĿŴũńŕŧŕłŃ", (byte)56, 66);
                    NLoginCore_413.f[26] = NLoginCore_384.E("ԥԫԯԻգհեիբգՊբԹձկՎծՐՍՒՍհՇՈ", (byte)56, 69);
                    NLoginCore_413.f[27] = NLoginCore_076.C("ҡҡҭӘҶҮҪҲҙҚӒҥ", (byte)56, 67);
                    NLoginCore_413.f[28] = NLoginCore_004.E("խՄԼծխԼեՎէդՕծԴԬը՛ԳծձԻՠ՚ՇՈ", (byte)56, 69);
                    NLoginCore_413.f[29] = NLoginCore_076.C("ҐҫҕңӛҷӅӑӎҙӞҥ", (byte)56, 67);
                    NLoginCore_413.f[30] = NLoginCore_223.D("ӌҴҫӅңӜҥҮҽӔҗҥ", (byte)56, 68);
                    NLoginCore_413.f[31] = NLoginCore_223.C("ҔӎӏҷӆӋӍҺҕҙҴҥ", (byte)56, 67);
                    NLoginCore_413.f[32] = NLoginCore_091.B("łĥĽŜĬĽŃŧįĹıķ", (byte)56, 66);
                    NLoginCore_413.f[33] = NLoginCore_387.B("ķŖŞŠŪŢřŪĩŝŜķ", (byte)56, 66);
                    NLoginCore_413.f[34] = NLoginCore_173.D("ҨұәҗӛҕҶүӔӞҟҥ", (byte)56, 68);
                    NLoginCore_413.f[35] = NLoginCore_446.C("Ӆ҉ӇӖҸҍқҗҞӠүӚҜҭӀӘӄӁұӃҼӃҰұ", (byte)56, 67);
                    NLoginCore_413.f[36] = NLoginCore_091.F("ՁԹ՜՞Մ՞բՃղիեԼ", (byte)56, 70);
                    NLoginCore_413.f[37] = NLoginCore_446.F("ՕկԭՇՉԿ՟ՆՁՔՀդ՚ՌՓՈծծԱճիՋՒյՠչռյ՛ՙ՞ցծա֌՜ՠջ՟Ս֑ձՍՐևջչպձշ֛ռչ՞աս֗կ՞՚ՠց֚֓", (byte)56, 70);
                    NLoginCore_413.f[38] = NLoginCore_384.F("ԽԫԷԧՍԭՋգԵԵԱՌաՎՎՄՖԶՠԸձՊՇՈ", (byte)56, 70);
                    NLoginCore_413.f[39] = NLoginCore_027.E("ԽԫԷԧՍԭՋգԵԵԮԮԹՊՉս՜տՋՕՀրՇՈ", (byte)56, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_413.f[0] = NLoginCore_575.A("ĤŀģřŢŢŧŏřĹĿļŲįŐŰūŘĸĳĵŅłŃ", (byte)56, 65);
                    NLoginCore_413.f[1] = NLoginCore_324.E("ՉՀՁԨ՟ԪԪՁՑԵՈՀըըթ՝ԹթձկՕՊՇՈ", (byte)56, 69);
                    NLoginCore_413.f[2] = NLoginCore_324.D("ҧҲӃӆҩүғҴӐҽҬӉӖҫҖҥӧҵҾӀӀӝӔӮҹӬӍӢӝҼөӶ", (byte)56, 68);
                    NLoginCore_413.f[3] = NLoginCore_027.C("үҬӂҮӐҭӐҩҾҩҴҥ", (byte)56, 67);
                    NLoginCore_413.f[4] = NLoginCore_384.F("Ԫխ՚լ԰Ծա՟դՎյԼ", (byte)56, 70);
                    NLoginCore_413.f[5] = NLoginCore_027.A("łĵŘĤĢśŦĸİħőŊįĭųņŗņźŻœūłŃ", (byte)56, 65);
                    NLoginCore_413.f[6] = NLoginCore_138.B("ŠŪĪŀŇŜĥŋŦŜŊŁŰŞŠşŸŵŬņűŕłŃ", (byte)56, 66);
                    NLoginCore_413.f[7] = NLoginCore_004.E("ԟԩեժզԽՉՃդըղզբԶՍ՘՗ձլՠ՟հՇՈ", (byte)56, 69);
                    NLoginCore_413.f[8] = NLoginCore_091.F("ժթժՉԯՁԼլԭՆ՗ՅկՌպոծխ՚ԽՙՊՇՈ", (byte)56, 70);
                    NLoginCore_413.f[9] = NLoginCore_201.B("ĵňĢśĸĿŘūįĭĨīļĲŎŗĵŦĲŚŶŕłŃ", (byte)56, 66);
                    NLoginCore_413.f[10] = NLoginCore_092.C("ҡҖҥҘӕәӑӓҙӔӖҥ", (byte)56, 67);
                    NLoginCore_413.f[11] = NLoginCore_138.B("ŇĠŕŗŊŉńĪőŬĭĩŇŨŐńőİŭŌŇŅłŃ", (byte)56, 66);
                    NLoginCore_413.f[12] = NLoginCore_138.E("ԾՉ՚՝ՀՆԪՋէՔՃՌՋՖծԴԶԹՊՊ՟Ք՝ծծվջֈֈմթվ", (byte)56, 69);
                    NLoginCore_413.f[13] = NLoginCore_453.D("ҴҐҗҬҸҲҲӈұӝӍүҔүҡӒәӢӖқһәҰұ", (byte)56, 68);
                    NLoginCore_413.f[14] = NLoginCore_324.C("ҧҲӃӆҩүғҴӐҽҬҴӗҫӜӃҮӆһӓӖҳҰұ", (byte)56, 67);
                    NLoginCore_413.f[15] = NLoginCore_027.D("ҒӅҹҡҥӎӆҕӜҘӟҬӛӏӂӢӔҦҰҳӢәҰұ", (byte)56, 68);
                    NLoginCore_413.f[16] = NLoginCore_004.C("ҧҲӃӆҩүғҴӐҽҮӁӃҮӅӓӗҿӛӥӈӇӠӚӋҺҾӮӁҾӐӅ", (byte)56, 67);
                    NLoginCore_413.f[17] = NLoginCore_138.A("ŖĻŕŘŞĦšħļŁŨķ", (byte)56, 65);
                    NLoginCore_413.f[18] = NLoginCore_091.A("ĹńŕŘĻŁĥņŢŏŀŉūŭŊŘŹĹĶŧűŦňŲŖűĻŠžŤńſ", (byte)56, 65);
                    NLoginCore_413.f[19] = NLoginCore_384.E("ԾՉ՚՝ՀՆԪՋէՔՄՙԵՃՆԲ՜ՈղՑշ՚ՇՈ", (byte)56, 69);
                    NLoginCore_413.f[20] = NLoginCore_446.F("Չ՚ԬՋՋԻհՃՌՎձԼ", (byte)56, 70);
                    NLoginCore_413.f[21] = NLoginCore_384.F("լԤՉեՂէԽԿՔՑեԶՆՄծՕ՜ՎԼՓյՊՇՈ", (byte)56, 70);
                    NLoginCore_413.f[22] = NLoginCore_427.C("ӊӄҢҴһҴҫүӝҳӛҲҿӘңӁҿүӨӚҪҳҰұ", (byte)56, 67);
                    NLoginCore_413.f[23] = NLoginCore_201.A("ťŤťńĪļķŧĨŁśŊļħĿĳŇķŅŋĲŕłŃ", (byte)56, 65);
                    NLoginCore_413.f[24] = NLoginCore_384.B("ŐŪĨłńĺŚŁļŏļĳĴĮŅįŌŒĸŰřŖŌŹĸřŘŎŷźŮŒũņūšũňŊƏŨŮŢŗ", (byte)56, 66);
                    NLoginCore_413.f[25] = NLoginCore_223.F("ՎՙՌԢդՍգկՔշԲԱժձՇՊմխ՗ԿորՇՈ", (byte)56, 70);
                    NLoginCore_413.f[26] = NLoginCore_559.E("ԥԫԯԻգհեիբգՈ՘ՐՆռսՔզԷՐՔրՇՈ", (byte)56, 69);
                    NLoginCore_413.f[27] = NLoginCore_453.D("ӌҢҸӆӛҪӐҽҜӝҮӏӓӡӍҠҦӠҷҵҪөҰұ", (byte)56, 68);
                    NLoginCore_413.f[28] = NLoginCore_092.F("խՄԼծխԼեՎէդՕՇայՍՄՒՕՌՊՒ՚ՇՈ", (byte)56, 70);
                    NLoginCore_413.f[29] = NLoginCore_076.B("ĹňĢŝŦŧřůŢŌŉľŭĿŀŭįįŻĭŗŕłŃ", (byte)56, 66);
                    NLoginCore_413.f[30] = NLoginCore_223.B("ĺŕŚŖŧŠŁŀśĨŜŉŤŰıŧũĸŵĻĶŻłŃ", (byte)56, 66);
                    NLoginCore_413.f[31] = NLoginCore_427.B("ģũľĸŬŋŌĹűĺĭķ", (byte)56, 66);
                    NLoginCore_413.f[32] = NLoginCore_387.C("ҮүҨҰӋұӍӘқӏҸҥ", (byte)56, 67);
                    NLoginCore_413.f[33] = NLoginCore_201.F("ԻծՀիՠ՟ղՏԿԶՅ՘ԶՇՓԸռՍխղՌրՇՈ", (byte)56, 70);
                    NLoginCore_413.f[34] = NLoginCore_223.C("ҳҤӌӓҮңӖӈӌӋҾӟҪӗӣӝңӣңөөәҰұ", (byte)56, 67);
                    NLoginCore_413.f[35] = NLoginCore_387.F("՜Ԡ՞խՏԤԲԮԵշՅԳ՗մՐծԼթժպՖ՚ՇՈ", (byte)56, 70);
                    NLoginCore_413.f[36] = NLoginCore_027.D("ҕӀҤҲҺӉҶӛҳӚҨҥ", (byte)56, 68);
                    NLoginCore_413.f[37] = NLoginCore_453.B("ŐŪĨłńĺŚŁļŏĻşŕŇŎŃũũĬŮŦņōŰśŴŷŰŖŔřżũŜƇŗśŶŚňƌŬňŋƂŶŴŵŬŲƖŷŴŚƇŻżŭƓŰƒƗťš", (byte)56, 66);
                    NLoginCore_413.f[38] = NLoginCore_223.D("ҦҔҠҐҶҖҴӌҞҞҗӑҡӐӥӜҳӆҠҴӠӃҰұ", (byte)56, 68);
                    NLoginCore_413.f[39] = NLoginCore_201.C("ҦҔҠҐҶҖҴӌҞҞҙҬҠқҖӐӖҼӚӆҲөҰұ", (byte)56, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_413.f[0] = NLoginCore_092.B("ĥļŧňŕňľĦŜŨīŒŴŌĶşŤŃĵœŪŵŇŹŉĻűœŹžľſ", (byte)56, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_413.f[0] = NLoginCore_384.C("ҒҭӖӈұӘӐҫӍӘӐӔӒӓҽңӗӅҲӀҷөҰұ", (byte)56, 67);
                }
            }
        }
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
        var_int_e = 0 >>> 244 | 0 << -244;
        p = Long.reverse(-3090968862841200199L);
        y = Integer.reverse(Integer.MIN_VALUE);
        z = -1 >>> 13 | -1 << -13;
        ab = Long.reverse(-3090968862841200199L);
        al = 32 >>> 4 | 32 << -4;
        ao = (-1 >>> 62 | -1 << ~62 + 1) & 0xFFFFFFFF;
        at = Long.reverse(-3090968862841200199L);
        bd = (6 >>> 97 | 6 << ~97 + 1) & 0xFFFFFFFF;
        be = Long.reverse(7141209490544566713L);
        bh = Long.reverse(-5332261958806667264L);
        bi = Integer.reverse(-1);
        bj = 64 >>> 228 | 64 << -228;
        bk = Long.reverse(7141209490544566713L);
        bm = Long.reverse(-5332261958806667264L);
        bn = (0 >>> 73 | 0 << ~73 + 1) & 0xFFFFFFFF;
        bp = Integer.reverse(-1610612736);
        br = Long.reverse(-3090968862841200199L);
        bu = 0x10000000 >>> 220 | 0x10000000 << -220;
        bw = 192 >>> 5 | 192 << -5;
        by = Long.reverse(7141209490544566713L);
        ca = Long.reverse(-5332261958806667264L);
        cb = Integer.reverse(0x40000000);
        cc = 0x1C000000 >>> 58 | 0x1C000000 << ~58 + 1;
        cd = Long.reverse(7141209490544566713L);
        cf = Long.reverse(-5332261958806667264L);
        cg = 0x30000000 >>> 188 | 0x30000000 << ~188 + 1;
        ch = (2 >>> 222 | 2 << -222) & 0xFFFFFFFF;
        ci = Long.reverse(-3090968862841200199L);
        cj = 512 >>> 135 | 512 << ~135 + 1;
        cm = Integer.reverse(-1879048192);
        cn = Long.reverse(-3090968862841200199L);
        co = Integer.reverse(0x50000000);
        cp = Long.reverse(7141209490544566713L);
        cq = Long.reverse(-5332261958806667264L);
        cr = (0x16000000 >>> 153 | 0x16000000 << ~153 + 1) & 0xFFFFFFFF;
        ct = Long.reverse(7141209490544566713L);
        cu = Long.reverse(-5332261958806667264L);
        cv = (96 >>> 99 | 96 << ~99 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(7141209490544566713L);
        cx = Long.reverse(-5332261958806667264L);
        cy = Integer.reverse(-1342177280);
        cz = Long.reverse(-3090968862841200199L);
        da = Integer.reverse(0x70000000);
        db = Integer.reverse(-1);
        dc = Long.reverse(-3090968862841200199L);
        dd = Integer.reverse(-268435456);
        df = Long.reverse(-3090968862841200199L);
        dh = 0x200000 >>> 177 | 0x200000 << ~177 + 1;
        di = Long.reverse(7141209490544566713L);
        dj = Long.reverse(-5332261958806667264L);
        dk = 17 >>> 64 | 17 << ~64 + 1;
        dl = (-1 >>> 219 | -1 << ~219 + 1) & 0xFFFFFFFF;
        dm = Long.reverse(-3090968862841200199L);
        dn = Integer.reverse(0x48000000);
        dp = Long.reverse(7141209490544566713L);
        ds = Long.reverse(-5332261958806667264L);
        dt = 311296 >>> 174 | 311296 << ~174 + 1;
        du = Integer.reverse(-1);
        dv = Long.reverse(-3090968862841200199L);
        dw = (0xFFFF000 >>> 236 | 0xFFFF000 << -236) & 0xFFFFFFFF;
        dx = (20 >>> 0 | 20 << ~0 + 1) & 0xFFFFFFFF;
        dz = Integer.reverse(-1);
        eb = Long.reverse(-3090968862841200199L);
        ec = (-1 >>> 155 | -1 << ~155 + 1) & 0xFFFFFFFF;
        ed = Integer.reverse(-1476395008);
        ee = Long.reverse(7141209490544566713L);
        ef = Long.reverse(-5332261958806667264L);
        ek = 0 >>> 63 | 0 << ~63 + 1;
        em = 0xB000000 >>> 87 | 0xB000000 << -87;
        eo = Long.reverse(7141209490544566713L);
        ep = Long.reverse(-5332261958806667264L);
        eq = 16 >>> 100 | 16 << ~100 + 1;
        er = 0x17000000 >>> 216 | 0x17000000 << ~216 + 1;
        es = Long.reverse(7141209490544566713L);
        et = Long.reverse(-5332261958806667264L);
        eu = Integer.reverse(0x40000000);
        ex = (-2147483647 >>> 188 | -2147483647 << -188) & 0xFFFFFFFF;
        ez = Long.reverse(-3090968862841200199L);
        fa = Integer.reverse(-1744830464);
        fc = Long.reverse(7141209490544566713L);
        ff = Long.reverse(-5332261958806667264L);
        fh = Integer.reverse(0x58000000);
        fi = Long.reverse(7141209490544566713L);
        fj = Long.reverse(-5332261958806667264L);
        fl = 0x1B000000 >>> 248 | 0x1B000000 << ~248 + 1;
        fn = Long.reverse(7141209490544566713L);
        fo = Long.reverse(-5332261958806667264L);
        fp = (57344 >>> 139 | 57344 << ~139 + 1) & 0xFFFFFFFF;
        fr = Integer.reverse(-1);
        ft = Long.reverse(-3090968862841200199L);
        fv = (59392 >>> 75 | 59392 << ~75 + 1) & 0xFFFFFFFF;
        fx = Long.reverse(7141209490544566713L);
        fy = Long.reverse(-5332261958806667264L);
        fz = Integer.reverse(0x78000000);
        ga = Long.reverse(7141209490544566713L);
        gb = Long.reverse(-5332261958806667264L);
        gc = (15872 >>> 137 | 15872 << -137) & 0xFFFFFFFF;
        ge = Long.reverse(7141209490544566713L);
        gf = Long.reverse(-5332261958806667264L);
        gg = (131072 >>> 17 | 131072 << ~17 + 1) & 0xFFFFFFFF;
        gh = Integer.reverse(Integer.MIN_VALUE);
        gj = Integer.reverse(-1);
        gm = 256 >>> 131 | 256 << ~131 + 1;
        go = Long.reverse(7141209490544566713L);
        gp = Long.reverse(-5332261958806667264L);
        gq = (0 >>> 45 | 0 << -45) & 0xFFFFFFFF;
        gs = 0x40000008 >>> 94 | 0x40000008 << -94;
        gt = Integer.reverse(-1);
        gu = Long.reverse(-3090968862841200199L);
        gv = Integer.reverse(Integer.MIN_VALUE);
        gw = (1088 >>> 5 | 1088 << ~5 + 1) & 0xFFFFFFFF;
        gx = Long.reverse(-3090968862841200199L);
        gy = 32768 >>> 78 | 32768 << -78;
        gz = (143360 >>> 140 | 143360 << ~140 + 1) & 0xFFFFFFFF;
        ha = Long.reverse(-3090968862841200199L);
        hg = Integer.reverse(-1073741824);
        hh = Integer.reverse(0x24000000);
        hi = Long.reverse(7141209490544566713L);
        hl = Long.reverse(-5332261958806667264L);
        hm = Integer.reverse(0x20000000);
        ho = (32 >>> 131 | 32 << ~131 + 1) & 0xFFFFFFFF;
        hy = Integer.reverse(-1543503872);
        hz = Long.reverse(-3090968862841200199L);
        ic = (152 >>> 2 | 152 << -2) & 0xFFFFFFFF;
        id = Long.reverse(7141209490544566713L);
        ig = Long.reverse(-5332261958806667264L);
        ii = 256 >>> 103 | 256 << ~103 + 1;
        ij = Integer.reverse(0);
        im = Integer.reverse(-1073741824);
        in = 1 >>> 224 | 1 << ~224 + 1;
        iq = Integer.reverse(0x40000000);
        ir = 64 >>> 128 | 64 << ~128 + 1;
        it = Integer.reverse(-469762048);
        iv = Long.reverse(7141209490544566713L);
        iw = Long.reverse(-5332261958806667264L);
        ix = Integer.reverse(0x14000000);
        iy = Integer.reverse(0x14000000);
        var_java_lang_String_arr_e = new String[ix];
        f = new String[iy];
        NLoginCore_413.void_b();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void b(ResultSet var1_1) {
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

    private static /* synthetic */ void a(long l, long l2, ForceRegisterConfig ForceRegisterConfig2) {
        ForceRegisterConfig2.a(l, l2);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_413.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.C("рѢѤфѨ҇ѿҕҁѐҎ҄ҒҌѕѺҜқғҙғѨ", (byte)33, 67), NLoginCore_413.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.B("ĤıİóĳįĪĳľĭúĸļĵĸľĀҕҏҘ҉ҋҐѬҞҋҒĖ", (byte)33, 66) + string + NLoginCore_384.E("ԗ", (byte)33, 69) + methodType.toString(), exception);
        }
    }
}

