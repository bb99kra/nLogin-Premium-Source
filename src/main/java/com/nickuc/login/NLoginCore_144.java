/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.mail.Authenticator
 *  lombok.Generated
 *  org.apache.commons.mail.DefaultAuthenticator
 *  org.apache.commons.mail.EmailException
 *  org.apache.commons.mail.HtmlEmail
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_560;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_308;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_164;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_153;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.mail.Authenticator;
import lombok.Generated;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class NLoginCore_144
implements NLoginCore_560 {
    private static int be;
    private static final String var_java_lang_String_cz;
    private static int ej;
    private static int cx;
    private static long ci;
    private static long ah;
    private static long cr;
    private static int ac;
    private static long ao;
    private static long dr;
    private static long dz;
    private static long n;
    private static int ef;
    private static int ds;
    private static int da;
    private static int bo;
    private static int cj;
    private static int bf;
    private static int w;
    private static int dp;
    private static int by;
    private static long var_long_c;
    private static int dx;
    private static long u;
    private static int bl;
    private static long v;
    private static int eb;
    private static int q;
    private static int z;
    private static int ax;
    private static int m;
    private static long dn;
    private static int ay;
    private static long cc;
    private static int t;
    private static int ec;
    private static long r;
    private static int dy;
    private static long bq;
    private static final String var_java_lang_String_cy;
    private static long cfr_renamed_1;
    private static int cg;
    private static int f;
    private static int bh;
    private static long ek;
    private static String[] var_java_lang_String_arr_b;
    private static long aa;
    private static int av;
    private static long ab;
    private static long ae;
    private static long cv;
    private static long ba;
    private static long dk;
    private static int cq;
    private static int h;
    private static long o;
    private static long g;
    private static long s;
    private static int bc;
    private static int br;
    private static int dv;
    private static long ck;
    private static int cw;
    private static long ap;
    private static long ea;
    private static int var_int_cz;
    private static long ca;
    private static int e;
    private static int bb;
    private static long i;
    private static int ai;
    private static long l;
    private NLoginCore_153 var_com_nickuc_login_NLoginCore_153_a;
    private static int bn;
    private static long bg;
    private static int dm;
    private static long bj;
    private static int bs;
    private static int al;
    private static long cl;
    private static int dh;
    private static int x;
    private static int eg;
    private static int an;
    private static long dq;
    private static int var_int_cy;
    private static long bm;
    private static long bu;
    private static int ch;
    private static long bd;
    private static int cn;
    private static long dt;
    private static int ct;
    private static long bp;
    private static long ei;
    private static long var_long_b;
    private static long am;
    private static long cs;
    private static long ar;
    private static long dc;
    private static int dg;
    private static long eh;
    private static int co;
    private static int aq;
    private static int at;
    private static long y;
    private static long au;
    private static int cu;
    private static long cp;
    private static int ee;
    private static int bw;
    private static int di;
    private static int af;
    private static long aj;
    private boolean aC;
    private static int dd;
    private static long bx;
    private static long ag;
    private static long as;
    private static long k;
    private static int bz;
    private static int dw;
    private static int de;
    private static int cd;
    private static int cm;
    private static int var_int_a;
    private static int j;
    private static int dj;
    private static int cb;
    private static int bv;
    private static int db;
    private static long cf;
    private final NLoginCore_308 var_com_nickuc_login_NLoginCore_308_c;
    private static int df;
    private static int aw;
    private static long az;
    private static int ce;
    private static int ed;
    private static long ak;
    private static int p;
    private static int ad;
    private static int bi;
    private static long bt;
    private static long bk;
    private static long du;
    private final NLoginType_008 J;
    private static String[] var_java_lang_String_arr_a;
    private static int dl;
    private static long d;

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        String string2 = NLoginCore_277.getName();
        String string3 = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, ax);
        NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, string3, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_a);
        String string4 = String.join((CharSequence)NLoginCore_144.c("㺀", (int)ay, (long)(az ^ ba)), NLoginCore_150.c(NLoginCore_374.br, new Object[bb])).replace((CharSequence)NLoginCore_144.c("㺃", (int)bc, (long)bd), string2).replace((CharSequence)NLoginCore_144.c("㺆", (int)(be & bf), (long)bg), string3);
        String string5 = NLoginCore_150.a(NLoginCore_374.bq, new Object[bh]).replace((CharSequence)NLoginCore_144.c("㺉", (int)bi, (long)(bj ^ bk)), string2).replace((CharSequence)NLoginCore_144.c("㺌", (int)NLoginCore_144.bl, (long)bm), string3);
        this.a(string, string5, string4, bl -> {
            if (!bl.booleanValue()) {
                NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, (String)null, (NLoginCore_137)null);
            }
        });
    }

    private boolean a(String string, String string2, String string3) {
        if (!this.aC) {
            return dh != 0;
        }
        if (this.var_com_nickuc_login_NLoginCore_153_a == null) {
            return di != 0;
        }
        if (string.split((String)NLoginCore_144.c("㺀", (int)dj, (long)dk)).length != dl) {
            throw new IllegalArgumentException((String)NLoginCore_144.c("㺃", (int)dm, (long)(dn ^ cfr_renamed_1)) + string);
        }
        if (string2 == null || string2.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_144.c("㺆", (int)dp, (long)(dq ^ dr)));
        }
        if (string3 == null || string3.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_144.c("㺉", (int)ds, (long)(dt ^ du)));
        }
        HtmlEmail htmlEmail = new HtmlEmail();
        htmlEmail.setHostName(this.var_com_nickuc_login_NLoginCore_153_a.cG);
        htmlEmail.setAuthenticator((Authenticator)new DefaultAuthenticator(this.var_com_nickuc_login_NLoginCore_153_a.cC, this.var_com_nickuc_login_NLoginCore_153_a.cD));
        htmlEmail.setSmtpPort(this.var_com_nickuc_login_NLoginCore_153_a.aF);
        htmlEmail.setCharset(this.var_com_nickuc_login_NLoginCore_153_a.cE);
        htmlEmail.setDebug(this.var_com_nickuc_login_NLoginCore_153_a.aD);
        switch (this.var_com_nickuc_login_NLoginCore_153_a.a.ordinal()) {
            case 2: {
                htmlEmail.setSSLOnConnect(dv != 0);
                htmlEmail.setSslSmtpPort(Integer.toString(this.var_com_nickuc_login_NLoginCore_153_a.aF));
                break;
            }
            case 1: {
                htmlEmail.setStartTLSEnabled(dw != 0);
            }
        }
        try {
            htmlEmail.setFrom(this.var_com_nickuc_login_NLoginCore_153_a.cA, this.var_com_nickuc_login_NLoginCore_153_a.cB);
            htmlEmail.addTo(string);
            htmlEmail.setSubject(string2);
            htmlEmail.setContent((Object)string3, this.var_com_nickuc_login_NLoginCore_153_a.cF);
            htmlEmail.send();
            return dx != 0;
        }
        catch (EmailException emailException) {
            NLoginCore_370.c((String)NLoginCore_144.c("㺌", (int)dy, (long)(dz ^ ea)), emailException, new Object[eb]);
            return ec != 0;
        }
    }

    private static void void_b() {
        int n;
        var_long_c = -3873368724689689544L;
        long l = var_long_c ^ 0x558C020D3CF56E6FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(35 + 34), 83, (byte)(31 + 16), (byte)(43 + 24), (byte)(11 + 55), (byte)(9 + 58), (byte)(2 + 45), (byte)(47 + 33), (byte)(63 + 12), (byte)(50 + 17), (byte)(54 + 29), (byte)(18 + 35), (byte)(52 + 28), (byte)(67 + 30), (byte)(85 + 15), (byte)(92 + 8), (byte)(79 + 26), 110, (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(24 + 59)}, StandardCharsets.UTF_8));
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
                    NLoginCore_144.var_java_lang_String_arr_b[0] = NLoginCore_453.D("ϰϺгДОЇемϿМхϼЯϾвнСМϾзЇЁыѐѓЩцХѕщЖђ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ӱԩԮԋ԰ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷԾՊՅՄՏՀՍԧԏԔԥ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[2] = NLoginCore_223.C("ϲЪЯЌбкЯДРивϼЖслЩМОЪЈЇЌиХНсдВшТїъ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[4] = NLoginCore_027.A("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôēćåðĕěĉüüĞØ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[5] = NLoginCore_201.E("ӱԩԮԋ԰ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՉՇՆԞԣԯՀԎԤԢՐԕՎՒԻԸՔ՞ԝՁԵԿԨ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[6] = NLoginCore_387.A("ÒëºüåßÔÆ÷ćâÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[7] = NLoginCore_091.F("ӱԩԮԋ԰ԹԮԓԟԷԳԱԚՀԣԑԇԩԉՈՂՂՄԿՇԪԒՏԩԱԧՇ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[8] = NLoginCore_201.B("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôÕöĈĉÔ×ďúúĐČ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[9] = NLoginCore_027.F("ӱԩԮԋ԰ԹԮԓԟԷԴ԰ԛՆԔԶԷԽԪՇՀԧՊՂՁԽԪՐԒՑԪՕ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[10] = NLoginCore_453.B("Ê³ÝÚĄñ¼äúĉÞÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[11] = NLoginCore_201.B("¸ðõÒ÷ĀõÚæþùăØÄøïÜĀċēæÍĔċĕ÷đĕĉÖûČ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[12] = NLoginCore_027.C("ϬдДЫЗϼЉАЬКЖбхцЩшЄЉцкжЗДЕ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[13] = NLoginCore_110.D("ϲЪЯЌбкЯДРигОЏТЖедЊЬсщьЩЦФврЍшфюя", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[14] = NLoginCore_091.B("¿ÏõăþðÿÕéÉÓćĊÌĆÉìäčćÊíÚÛ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[15] = NLoginCore_559.D("ϲЪЯЌбкЯДРиеможϿЩжЧОжННсЦЛбЋтЫчсЮ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[16] = NLoginCore_324.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[17] = NLoginCore_451.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[18] = NLoginCore_453.E("ԉԴӱԅԧԇӵӲԋԂԂԈ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[19] = NLoginCore_201.E("ԈԫԨ԰ԍӶԱԶԫԐԱԈ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[20] = NLoginCore_027.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[21] = NLoginCore_223.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[22] = NLoginCore_324.C("ЉЬЩбЎϷвзЬБвЉ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[23] = NLoginCore_004.F("ԉԴӱԅԧԇӵӲԋԂԂԈ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[24] = NLoginCore_076.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[25] = NLoginCore_092.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[26] = NLoginCore_173.F("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[27] = NLoginCore_223.D("ЉЬЩбЎϷвзЬБвЉ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[28] = NLoginCore_223.A("Ðû¸ÌîÎ¼¹ÒÉÉÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[29] = NLoginCore_138.B("Ïòï÷Ô½øýò×øÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[30] = NLoginCore_324.C("ЊеϲІШЈ϶ϳЌЃЃЉ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[31] = NLoginCore_076.E("ԓԵӶԹԱӾՀԠԲӹԂԈ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[32] = NLoginCore_223.B("Úü½ĀøÅćçùÀÉÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[33] = NLoginCore_223.C("ϰкЏϷгрЀСмϾДЉ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[34] = NLoginCore_091.A("Ì¾ôĂĀÅçöÙÄÄĀĆäÿçØĂáĀæÝÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[35] = NLoginCore_004.F("ԳӺԼԛԻԗԴԟԙӴԘԡԻԒԤӾԶՃՌԔԝՃԽԉՀՍԑՌՖՏԲՃԋՅՆԒԾ՞ՙՍԻԴԭԞՔԽՈԲԲժՙԷէՆԳԴ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[36] = NLoginCore_201.C("ЭЇкЇЛЍϲЕЀЀжГНВшЀтиІЦТШЇцыТЪщФиЧѕТёэчѐзмєќжЛСѤеОЦлхшиЦяѭѭнѠгшеѰѶѷ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[37] = NLoginCore_384.E("ӳԏԖԱԞԗӱӶԞԻԃԏԅӸԑӺԄӼԠՆԽԬԉԇՃԞԐԲԫԐՓԬՑԸՈԭՓՎԴԖԙՒԳԼԲՇԡԠՔԵՕիՈԹ՜՝էԮԱյդելեմՔպՅնռտմԾժձեմՓոջբՀթոՍՆսաօֆ֐՟՟֏ղղցօյք֝֌֎լ֑շ֎խ֖պ֙։նժիիք֜ճմ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[38] = NLoginCore_027.D("ϲЪЯЌбкЯДРидЍрлдЦЃпжНПЧДЕ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[39] = NLoginCore_027.B("àĀÏõôä¼ÃôÙāúÇÅāÊÌïêýçíÚÛ", (byte)4, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_144.var_java_lang_String_arr_b[0] = NLoginCore_559.B("¶ÀùÚäÍûĂÅâċÂõÄøăçâÄýÍÐìĄÐĚøĕćðìô", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[1] = NLoginCore_384.E("ӱԩԮԋ԰ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՇԯԜԼՅԮՀԬԔԷԕԫԬԭԪ՗ՐԪՑՔ԰ԿԨ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[2] = NLoginCore_138.C("ϲЪЯЌбкЯДРивϼЖслЩМОЪЈЇюКФчпђЋЪзВГ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[3] = NLoginCore_004.A("ÈÕÔþòÓâçþÖÖÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[4] = NLoginCore_076.A("¸ðõÒ÷ĀõÚæþùČÖÍÞÙýäñÅôÕĈðÖÔíÖĖĔúø", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[5] = NLoginCore_223.F("ӱԩԮԋ԰ԹԮԓԟԷԳԿՆԏԸԁԙԶԖԙԷՉՇՆԞԣԯՀԎԤԢՐԣԙՅԖ՚ԾՍԝՏ՝ՑԨ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[6] = NLoginCore_092.A("õÒĂîÓăÖüĀýąćÖÇäçĆèßÉĒÝÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[7] = NLoginCore_384.D("ϲЪЯЌбкЯДРидвЛсФВЈЪЊщуфМкёЋпваюХж", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[8] = NLoginCore_384.C("ϲЪЯЌбкЯДРигцАЇИГзОЫϿЮЁьЭХвнАохуЯчДлѕеўЗѐЮѠПЩ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[9] = NLoginCore_384.B("¸ðõÒ÷ĀõÚæþû÷âčÛýþĄñĎćôĀĉôñĄõĔùĜĕĐò÷ĖîåĜĀġĥĤï", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[10] = NLoginCore_076.B("ËÕ÷íÍÍÎçÒć÷ßËăÙãìĄĂąðíÚÛ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[11] = NLoginCore_091.E("ӱԩԮԋ԰ԹԮԓԟԷԲԼԑӽԱԨԕԹՄՌԟԄԼԉԲԜԣԝԵՆԯԶՍԯԫՓԘԕԟ՛՝աԚԨ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[12] = NLoginCore_324.C("ϬдДЫЗϼЉАЬКЕЗцДжЗПІриЫэДЕ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[13] = NLoginCore_027.B("¸ðõÒ÷ĀõÚæþùäÕèÜûúÐòćďĎąāđċëÕñðĕû", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[14] = NLoginCore_091.E("ӸԈԮԼԷԩԸԎԢԂԍԣՅԡԲԾӻՄԈՍԘԽՆԏԻԐԛԤԝԡՖԊ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[15] = NLoginCore_091.C("ϲЪЯЌбкЯДРиеможϿЩжЧОжНХПТуывШѐягБЯШіДНъеѕЯѓѢЩ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[16] = NLoginCore_092.B("ÿ»êãðĆ¸ÙôóÒÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[17] = NLoginCore_092.A("ñ¸ÓÁ¾¾áć×ÒĈúâ÷ßËđčÌêĔíÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[18] = NLoginCore_138.B("¾òÛÚāÄåïÅòÞÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[19] = NLoginCore_201.D("ЛЧМЛоϻЛϿЫАрбзПзУрКЫмхЧДЕ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[20] = NLoginCore_110.D("϶ФАϼбдИϸбФМЉ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[21] = NLoginCore_446.D("ЊижЯбШЪлОсМЉ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[22] = NLoginCore_223.B("½Ê´ÃĄÔîÙôÜÖÄ÷öËÊåÃäïåÝÚÛ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[23] = NLoginCore_453.A("ðÓîĀăÖÝÙÂāĉ½ĊćĉêðÜÍððēÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[24] = NLoginCore_138.E("ԄԭԹӵӽӰԍԖԋԯԚԮԀӽԣԀԱԫՌԔԅԦԓԔ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[25] = NLoginCore_324.D("ЩϻгХзЯЈДТпуоМчйϻГПепТЧДЕ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[26] = NLoginCore_201.A("É×ùÛûÝÒÜÃçÞÏ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[27] = NLoginCore_451.B("ý·óµÃØößÂùĈÃÌìĂÍéèďÊĒēÚÛ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[28] = NLoginCore_138.D("ФЊϹЪМЕвЊЏЌрЅвϾРлукСЍЈЗДЕ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[29] = NLoginCore_446.A("áíâáĄÁáÅñÖąóčüĄþÆāíäĐăÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[30] = NLoginCore_324.A("ÐúÿĀüÃÐãáĄĊÈÊÜØøñïĂÒæíÚÛ", (byte)4, 65);
                    NLoginCore_144.var_java_lang_String_arr_b[31] = NLoginCore_223.C("ЅкжХЭиИϿЛоЮЉ", (byte)4, 67);
                    NLoginCore_144.var_java_lang_String_arr_b[32] = NLoginCore_138.B("ÊþÂÞÓąÏăüèĄÏ", (byte)4, 66);
                    NLoginCore_144.var_java_lang_String_arr_b[33] = NLoginCore_138.E("ԪԬӷԍӶԊӻԈԲԖԭԈ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[34] = NLoginCore_027.F("ԅӷԭԻԹӾԠԯԒӽӽԗԹԔԏՆԛՋՊԥԋՎՉԍՑԤՎՁԓՓՀԖ", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[35] = NLoginCore_223.F("ԳӺԼԛԻԗԴԟԙӴԘԡԻԒԤӾԶՃՌԔԝՃԽԉՀՍԑՌՖՏԲՃԋՅՆԒԾ՞ՙՍԻԴԮԱԟ՘Ց՗ԠՆԼժ՘Շբդ՜԰ՁՅԳՂԵը", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[36] = NLoginCore_027.E("ԬԆԹԆԚԌӱԔӿӿԵԒԜԑՇӿՁԷԅԥԡԧԆՅՊԡԩՈԣԷԦՔԡՐՌՆՏԶԻՓ՛ԵԚԠգԴԝԥԺՄՇԷԥՈԨթՆգԽըըՖՈՇ", (byte)4, 69);
                    NLoginCore_144.var_java_lang_String_arr_b[37] = NLoginCore_138.F("ӳԏԖԱԞԗӱӶԞԻԃԏԅӸԑӺԄӼԠՆԽԬԉԇՃԞԐԲԫԐՓԬՑԸՈԭՓՎԴԖԙՒԳԼԲՇԡԠՔԵՕիՈԹ՜՝էԮԱյդելեմՔպՅնռտմԾժձեմՓոջբՀթոՍՆսաօֆ֐՟՟֏ղղցօյք֝֌֎լ֑շ֍գ֐֥կ֣֠փթ֗֜ցֆց֩֩ր֌փֶխ֫", (byte)4, 70);
                    NLoginCore_144.var_java_lang_String_arr_b[38] = NLoginCore_076.D("ϲЪЯЌбкЯДРигЗЙнйІсХЛХЭрЋкЋЎьрЕчЫѕ", (byte)4, 68);
                    NLoginCore_144.var_java_lang_String_arr_b[39] = NLoginCore_451.C("КкЉЯЮО϶ϽЮГнЛзЧсЇцИКзНйфкЫШбВАраГ", (byte)4, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_144.var_java_lang_String_arr_b[0] = NLoginCore_138.A("öÉÔĀÓÍç÷þćÅÏ", (byte)4, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_144.var_java_lang_String_arr_b[0] = NLoginCore_575.E("ԩԈԨԤԹӷԼӲԯӻԖԂԄԣԸԾԶԄԿԝՎԦԓԔ", (byte)4, 69);
                }
            }
        }
    }

    @Generated
    public NLoginCore_153 com_nickuc_login_NLoginCore_153_a() {
        return this.var_com_nickuc_login_NLoginCore_153_a;
    }

    @Generated
    public NLoginCore_144(NLoginType_008 NLoginType_008, NLoginCore_308 NLoginCore_3082) {
        this.J = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_308_c = NLoginCore_3082;
    }

    @Override
    public void c(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l();
        Object[] objectArray = new Object[dd];
        objectArray[NLoginCore_144.de] = string;
        String string3 = String.join((CharSequence)NLoginCore_144.c("㺀", (int)(da & db), (long)dc), NLoginCore_150.a(NLoginCore_374.bz, NLoginCore_277, objectArray));
        Object[] objectArray2 = new Object[df];
        objectArray2[NLoginCore_144.dg] = string;
        String string4 = NLoginCore_150.a(NLoginCore_374.by, NLoginCore_277, objectArray2);
        this.a(string2, string4, string3, null);
    }

    public void a(String string, String string2, String string3, @Nullable Consumer<Boolean> consumer) {
        this.J.b(ed != 0).a(() -> {
            boolean bl = this.a(string, string2, string3);
            if (consumer != null) {
                consumer.accept(bl);
            }
        });
    }

    @Generated
    public NLoginCore_308 com_nickuc_login_NLoginCore_308_a() {
        return this.var_com_nickuc_login_NLoginCore_308_c;
    }

    @Generated
    public NLoginType_008 com_nickuc_login_NLoginType_008_b() {
        return this.J;
    }

    @Override
    public void aH() {
        NLoginCore_219 NLoginCore_2192 = this.var_com_nickuc_login_NLoginCore_308_c.c();
        if (NLoginCore_2192 == null) {
            throw new IllegalStateException(this + (String)NLoginCore_144.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        }
        String string = NLoginCore_2192.java_lang_String_b(NLoginCore_144.c("㺃", (int)(e & f), (long)g));
        if (string == null) {
            return;
        }
        String string2 = NLoginCore_2192.a(NLoginCore_144.c("㺆", (int)h, (long)i), (String)NLoginCore_144.c("㺉", (int)j, (long)(k ^ l)));
        if (string2.isEmpty()) {
            string2 = string;
        }
        int n = NLoginCore_2192.a(NLoginCore_144.c("㺌", (int)m, (long)(NLoginCore_144.n ^ o)), p);
        NLoginCore_164 NLoginCore_1642 = NLoginCore_164.b(NLoginCore_2192.a(NLoginCore_144.c("㺏", (int)q, (long)(r ^ s)), (String)NLoginCore_144.c("㺒", (int)t, (long)(u ^ v))), n);
        this.var_com_nickuc_login_NLoginCore_153_a = new NLoginCore_153(string, NLoginCore_2192.java_lang_String_b(NLoginCore_144.c("㺕", (int)(w & x), (long)y)), string2, NLoginCore_2192.java_lang_String_b(NLoginCore_144.c("㺘", (int)z, (long)(aa ^ ab))), NLoginCore_2192.a(NLoginCore_144.c("㺛", (int)(ac & ad), (long)ae), (String)NLoginCore_144.c("㺞", (int)af, (long)(ag ^ ah))), NLoginCore_2192.a(NLoginCore_144.c("㺡", (int)ai, (long)(aj ^ ak)), (String)NLoginCore_144.c("㺤", (int)al, (long)am)), NLoginCore_2192.a(NLoginCore_144.c("㺧", (int)an, (long)(ao ^ ap)), (String)NLoginCore_144.c("㺪", (int)aq, (long)(ar ^ as))), n, NLoginCore_1642, NLoginCore_2192.a(NLoginCore_144.c("㺭", (int)at, (long)au), av != 0));
        this.aC = aw;
    }

    @Override
    @Generated
    public boolean aF() {
        return this.aC;
    }

    @Override
    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277) {
        String string = NLoginCore_277.getName();
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l();
        if (!NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b)) {
            String string3 = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, cd);
            NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, string3, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_b);
            String string4 = String.join((CharSequence)NLoginCore_144.c("㺀", (int)ce, (long)cf), NLoginCore_150.c(NLoginCore_374.bv, new Object[cg])).replace((CharSequence)NLoginCore_144.c("㺃", (int)ch, (long)ci), string).replace((CharSequence)NLoginCore_144.c("㺆", (int)cj, (long)(ck ^ cl)), string3);
            String string5 = NLoginCore_150.a(NLoginCore_374.bu, new Object[cm]).replace((CharSequence)NLoginCore_144.c("㺉", (int)(cn & co), (long)cp), string).replace((CharSequence)NLoginCore_144.c("㺌", (int)cq, (long)(cr ^ cs)), string3);
            this.a(string2, string5, string4, bl -> {
                if (!bl.booleanValue()) {
                    NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, (String)null, (NLoginCore_137)null);
                }
            });
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2028523212939263059L);
        d = Long.reverse(0x2400000000000000L);
        e = 4 >>> 98 | 4 << -98;
        f = Integer.reverse(-1);
        g = Long.reverse(4046135846001245267L);
        h = Integer.reverse(0x40000000);
        i = Long.reverse(4046135846001245267L);
        j = 0x1800000 >>> 23 | 0x1800000 << -23;
        k = Long.reverse(2028523212939263059L);
        l = Long.reverse(0x2400000000000000L);
        m = 8192 >>> 11 | 8192 << -11;
        n = Long.reverse(2028523212939263059L);
        o = Long.reverse(0x2400000000000000L);
        p = 629145601 >>> 183 | 629145601 << -183;
        q = (0x5000000 >>> 216 | 0x5000000 << ~216 + 1) & 0xFFFFFFFF;
        r = Long.reverse(2028523212939263059L);
        s = Long.reverse(0x2400000000000000L);
        t = 6144 >>> 106 | 6144 << ~106 + 1;
        u = Long.reverse(2028523212939263059L);
        v = Long.reverse(0x2400000000000000L);
        w = Integer.reverse(-536870912);
        x = Integer.reverse(-1);
        y = Long.reverse(4046135846001245267L);
        z = Integer.reverse(0x10000000);
        aa = Long.reverse(2028523212939263059L);
        ab = Long.reverse(0x2400000000000000L);
        ac = Integer.reverse(-1879048192);
        ad = Integer.reverse(-1);
        ae = Long.reverse(4046135846001245267L);
        af = Integer.reverse(0x50000000);
        ag = Long.reverse(2028523212939263059L);
        ah = Long.reverse(0x2400000000000000L);
        ai = Integer.reverse(-805306368);
        aj = Long.reverse(2028523212939263059L);
        ak = Long.reverse(0x2400000000000000L);
        al = Integer.reverse(0x30000000);
        am = Long.reverse(4046135846001245267L);
        an = 425984 >>> 15 | 425984 << ~15 + 1;
        ao = Long.reverse(2028523212939263059L);
        ap = Long.reverse(0x2400000000000000L);
        aq = (0x1C0000 >>> 241 | 0x1C0000 << -241) & 0xFFFFFFFF;
        ar = Long.reverse(2028523212939263059L);
        as = Long.reverse(0x2400000000000000L);
        at = Integer.reverse(-268435456);
        au = Long.reverse(4046135846001245267L);
        av = (0 >>> 40 | 0 << -40) & 0xFFFFFFFF;
        aw = 65536 >>> 80 | 65536 << ~80 + 1;
        ax = Integer.reverse(0x60000000);
        ay = Integer.reverse(0x8000000);
        az = Long.reverse(2028523212939263059L);
        ba = Long.reverse(0x2400000000000000L);
        bb = Integer.reverse(0);
        bc = Integer.reverse(-2013265920);
        bd = Long.reverse(4046135846001245267L);
        be = (144 >>> 67 | 144 << ~67 + 1) & 0xFFFFFFFF;
        bf = (-1 >>> 96 | -1 << -96) & 0xFFFFFFFF;
        bg = Long.reverse(4046135846001245267L);
        bh = Integer.reverse(0);
        bi = Integer.reverse(-939524096);
        bj = Long.reverse(2028523212939263059L);
        bk = Long.reverse(0x2400000000000000L);
        bl = Integer.reverse(0x28000000);
        bm = Long.reverse(4046135846001245267L);
        bn = Integer.reverse(0x60000000);
        bo = Integer.reverse(-1476395008);
        bp = Long.reverse(2028523212939263059L);
        bq = Long.reverse(0x2400000000000000L);
        br = Integer.reverse(0);
        bs = (720896 >>> 111 | 720896 << -111) & 0xFFFFFFFF;
        bt = Long.reverse(2028523212939263059L);
        bu = Long.reverse(0x2400000000000000L);
        bv = (0x1700000 >>> 244 | 0x1700000 << -244) & 0xFFFFFFFF;
        bw = Integer.reverse(-1);
        bx = Long.reverse(4046135846001245267L);
        by = Integer.reverse(0);
        bz = Integer.reverse(0x18000000);
        ca = Long.reverse(4046135846001245267L);
        cb = (204800 >>> 141 | 204800 << ~141 + 1) & 0xFFFFFFFF;
        cc = Long.reverse(4046135846001245267L);
        cd = (0x180000 >>> 242 | 0x180000 << ~242 + 1) & 0xFFFFFFFF;
        ce = 0x40000003 >>> 157 | 0x40000003 << ~157 + 1;
        cf = Long.reverse(4046135846001245267L);
        cg = Integer.reverse(0);
        ch = Integer.reverse(-671088640);
        ci = Long.reverse(4046135846001245267L);
        cj = 0x38000000 >>> 153 | 0x38000000 << ~153 + 1;
        ck = Long.reverse(2028523212939263059L);
        cl = Long.reverse(0x2400000000000000L);
        cm = Integer.reverse(0);
        cn = (0x3A000000 >>> 249 | 0x3A000000 << -249) & 0xFFFFFFFF;
        co = Integer.reverse(-1);
        cp = Long.reverse(4046135846001245267L);
        cq = Integer.reverse(0x78000000);
        cr = Long.reverse(2028523212939263059L);
        cs = Long.reverse(0x2400000000000000L);
        ct = Integer.reverse(-134217728);
        cu = (-1 >>> 169 | -1 << -169) & 0xFFFFFFFF;
        cv = Long.reverse(4046135846001245267L);
        cw = 65536 >>> 16 | 65536 << -16;
        cx = (0 >>> 133 | 0 << ~133 + 1) & 0xFFFFFFFF;
        var_int_cy = 4 >>> 98 | 4 << ~98 + 1;
        var_int_cz = 0 >>> 13 | 0 << ~13 + 1;
        da = (524288 >>> 14 | 524288 << -14) & 0xFFFFFFFF;
        db = -1 >>> 223 | -1 << ~223 + 1;
        dc = Long.reverse(4046135846001245267L);
        dd = Integer.reverse(Integer.MIN_VALUE);
        de = 0 >>> 192 | 0 << -192;
        df = Integer.reverse(Integer.MIN_VALUE);
        dg = (0 >>> 79 | 0 << ~79 + 1) & 0xFFFFFFFF;
        dh = Integer.reverse(0);
        di = 0 >>> 104 | 0 << ~104 + 1;
        dj = (0x10800000 >>> 247 | 0x10800000 << ~247 + 1) & 0xFFFFFFFF;
        dk = Long.reverse(4046135846001245267L);
        dl = Integer.reverse(0x40000000);
        dm = Integer.reverse(0x44000000);
        dn = Long.reverse(2028523212939263059L);
        cfr_renamed_1 = Long.reverse(0x2400000000000000L);
        dp = 1120 >>> 165 | 1120 << ~165 + 1;
        dq = Long.reverse(2028523212939263059L);
        dr = Long.reverse(0x2400000000000000L);
        ds = Integer.reverse(0x24000000);
        dt = Long.reverse(2028523212939263059L);
        du = Long.reverse(0x2400000000000000L);
        dv = 0x200000 >>> 117 | 0x200000 << -117;
        dw = Integer.reverse(Integer.MIN_VALUE);
        dx = (0x1000000 >>> 88 | 0x1000000 << -88) & 0xFFFFFFFF;
        dy = Integer.reverse(-1543503872);
        dz = Long.reverse(2028523212939263059L);
        ea = Long.reverse(0x2400000000000000L);
        eb = Integer.reverse(0);
        ec = (0 >>> 49 | 0 << -49) & 0xFFFFFFFF;
        ed = (65536 >>> 240 | 65536 << -240) & 0xFFFFFFFF;
        ee = (0xA000000 >>> 86 | 0xA000000 << -86) & 0xFFFFFFFF;
        ef = (20480 >>> 137 | 20480 << ~137 + 1) & 0xFFFFFFFF;
        eg = 152 >>> 34 | 152 << ~34 + 1;
        eh = Long.reverse(2028523212939263059L);
        ei = Long.reverse(0x2400000000000000L);
        ej = 0x9C00000 >>> 22 | 0x9C00000 << -22;
        ek = Long.reverse(4046135846001245267L);
        var_java_lang_String_arr_a = new String[ee];
        var_java_lang_String_arr_b = new String[ef];
        NLoginCore_144.void_b();
        var_java_lang_String_cy = NLoginCore_144.c("㺀", (int)eg, (long)(eh ^ ei));
        var_java_lang_String_cz = NLoginCore_144.c("㺃", (int)ej, (long)ek);
    }

    @Override
    public void b(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, String string) {
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l();
        Object[] objectArray = new Object[cw];
        objectArray[NLoginCore_144.cx] = string;
        String string3 = String.join((CharSequence)NLoginCore_144.c("㺀", (int)(ct & cu), (long)cv), NLoginCore_150.a(NLoginCore_374.bx, NLoginCore_277, objectArray));
        Object[] objectArray2 = new Object[var_int_cy];
        objectArray2[NLoginCore_144.var_int_cz] = string;
        String string4 = NLoginCore_150.a(NLoginCore_374.bw, NLoginCore_277, objectArray2);
        this.a(string2, string4, string3, null);
    }

    @Override
    public void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277) {
        String string = NLoginCore_277.getName();
        String string2 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().l();
        if (!NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.b(ForceRegisterConfig2, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c)) {
            String string3 = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, bn);
            NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, string3, NLoginCore_137.var_com_nickuc_login_NLoginCore_137_c);
            String string4 = String.join((CharSequence)NLoginCore_144.c("㺀", (int)bo, (long)(bp ^ bq)), NLoginCore_150.c(NLoginCore_374.bt, new Object[br])).replace((CharSequence)NLoginCore_144.c("㺃", (int)bs, (long)(bt ^ bu)), string).replace((CharSequence)NLoginCore_144.c("㺆", (int)(bv & bw), (long)bx), string3);
            String string5 = NLoginCore_150.a(NLoginCore_374.bs, new Object[by]).replace((CharSequence)NLoginCore_144.c("㺉", (int)bz, (long)ca), string).replace((CharSequence)NLoginCore_144.c("㺌", (int)cb, (long)cc), string3);
            this.a(string2, string5, string4, bl -> {
                if (!bl.booleanValue()) {
                    NLoginCore_248.var_com_nickuc_login_NLoginCore_311_f.a(ForceRegisterConfig2, (String)null, (NLoginCore_137)null);
                }
            });
        }
    }

    private static String a(int n, long l) {
        l ^= 0x24L;
        l ^= 0x558C020D3CF56E6FL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(17 + 52), (byte)(50 + 33), (byte)(11 + 36), (byte)(52 + 15), (byte)(30 + 36), (byte)(32 + 35), (byte)(19 + 28), 80, (byte)(13 + 62), (byte)(62 + 5), (byte)(60 + 23), (byte)(4 + 49), (byte)(3 + 77), (byte)(42 + 55), (byte)(48 + 52), (byte)(23 + 77), 105, (byte)(2 + 108), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), (byte)(76 + 7)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.D("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴ࠸ࡇࠛࡄࡒ࠴ࡉࡒࡃࡔࡅࡓ", (byte)64, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_144.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_144.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("³Õ×·ÛúòĈôÃā÷ąÿÈíďĎĆČĆÛ", (byte)6, 66), NLoginCore_144.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.D("ЪзжϹйеайфгЀотлофІފޙݭޖޤކޛޤޕަޗޥО", (byte)6, 68) + string + NLoginCore_092.D("Ё", (byte)6, 68) + methodType.toString(), exception);
        }
    }
}

