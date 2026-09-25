/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONException
 *  com.nickuc.login.lib.json.JSONObject
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONException;
import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_204;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_482;
import com.nickuc.login.NLoginCore_123;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_227;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_126;
import com.nickuc.login.NLoginCore_180;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_142 {
    private static long hb;
    private static long fc;
    private static int dg;
    private static int bk;
    private static int fe;
    private static int fs;
    private static int cp;
    private static int l;
    private static long dr;
    private static long dk;
    private static int gv;
    private static int bi;
    private static long v;
    private final HashMap<String, Object> cfr_renamed_16 = new HashMap();
    private static int ff;
    private static int df;
    private static int dy;
    private static int bu;
    private static int bo;
    private static long dt;
    private static int ej;
    private static int fj;
    private static long var_long_b;
    private static long r;
    private static int ar;
    private static long ao;
    private static long db;
    private static int ds;
    private static long ek;
    private static long k;
    private static long gt;
    private static long eo;
    private static int eh;
    private static int gd;
    private boolean V;
    private static int cx;
    private static int af;
    private static int fn;
    private static int fl;
    private static long gw;
    private static int dz;
    private static int gj;
    private static int cs;
    private static long p;
    private static int ak;
    private static int fg;
    private static long hg;
    private static int em;
    private static long cr;
    private static long ax;
    private static long ex;
    private static long gi;
    private static String[] var_java_lang_String_arr_a;
    private static int gl;
    private static int hc;
    private static int gg;
    private static int w;
    private static long dn;
    private static int ci;
    private static long ad;
    private static int es;
    private static long j;
    private static long fd;
    private static long ag;
    private static int e;
    private static int cfr_renamed_1;
    private static long fq;
    private static int cj;
    private static long g;
    private static long er;
    private static long aj;
    private static long he;
    private static int gq;
    private static long ay;
    private static int an;
    private static int hd;
    private static long s;
    private static int ba;
    private static int cm;
    private static int bc;
    private static long d;
    private static int h;
    private static long eg;
    private static int fm;
    private static long dj;
    private static int du;
    private static int cg;
    private static int ft;
    private static int bz;
    private static int fk;
    private byte var_byte_b;
    private static int ec;
    private static int fi;
    private static int i;
    private static long go;
    private static long cl;
    private static long ew;
    private static int gz;
    private static int ct;
    private static int bh;
    private static int bg;
    private static long el;
    private static long ge;
    private static int dd;
    private final NLoginCore_227 var_com_nickuc_login_NLoginCore_227_a;
    private static long gp;
    private static long bn;
    private static long aa;
    private static int cc;
    private static int dv;
    private final NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____c;
    private static long ck;
    private static long be;
    private static int ga;
    private static int dq;
    private static long gc;
    private static long dm;
    private static long fa;
    private static int bv;
    private static int ca;
    private static int et;
    private static long ab;
    private static int gx;
    private static long fw;
    private static long m;
    private static int fb;
    private static int ac;
    private static long fz;
    private static int z;
    private static int aw;
    private static int fh;
    private static int hf;
    private static long am;
    private static long ai;
    private static int bj;
    private static long cz;
    private static int n;
    private static int fr;
    private static long dc;
    private static int hi;
    private static long en;
    private static long gm;
    private static int fp;
    private byte var_byte_a;
    private static int cv;
    private static long de;
    private static int ep;
    private static int da;
    private static int ce;
    private static int cn;
    private static long ed;
    private static long ch;
    private static int bf;
    private static long ea;
    private static long var_long_c;
    private static long cy;
    private static int hh;
    private static long bx;
    private static int gr;
    private static long au;
    private static int ez;
    private static long dh;
    private static long dx;
    private static long dw;
    private static long as;
    private static long av;
    private static int bm;
    private static long by;
    private static long y;
    private static long fo;
    private static int eq;
    private static long eu;
    private static int fx;
    private static int var_int_a;
    private static long cw;
    private static int ah;
    private static long dp;
    private static long bs;
    private static int bt;
    private static int ey;
    private static int ee;
    private static int q;
    private static int bw;
    private static long br;
    private static int gb;
    private static long ef;
    private static int bl;
    private static long o;
    private static int az;
    private static int di;
    private static int cq;
    private static int u;
    private static int co;
    private static int cu;
    private static int gk;
    private static long bd;
    private static int cf;
    private static int ha;
    private static long gh;
    private static int cb;
    private static int fu;
    private static long ei;
    private static long x;
    private static long ae;
    private static int gu;
    private static int f;
    private static int fv;
    private static int bq;
    private static long gf;
    private static int aq;
    private static int bp;
    private static int eb;
    private static long ap;
    private static int fy;
    private static int gn;
    private static int gs;
    private static int t;
    private static int ev;
    private static int dl;
    private static int al;
    private static String[] var_java_lang_String_arr_b;
    private static long bb;
    private static long gy;
    private static int at;
    private static long cd;

    private void ao() {
        int n = this.var_com_nickuc_login_NLoginCore_227_a.com_nickuc_login_NLoginCore_142_a().b((String)NLoginCore_142.c("㺀", (int)bq, (long)(br ^ bs)), bt);
        int n2 = bu / n;
        int n3 = n2 * bv;
        int n4 = this.b((String)NLoginCore_142.c("㺃", (int)bw, (long)(bx ^ by)), n2);
        if (n4 < 0 || n4 > n3) {
            n4 = n2;
        }
        if (this.var_byte_b <= n4 && (this.var_byte_b = (byte)(this.var_byte_b + bz)) >= n4) {
            this.V = ca;
        }
    }

    public NLoginCore_204 com_nickuc_login_NLoginCore_204_b() {
        return NLoginCore_204.a((Integer)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)z, (long)(aa ^ ab)), NLoginCore_204.var_com_nickuc_login_NLoginCore_204_b.ordinal()));
    }

    @Generated
    public NLoginCore_142(NLoginCore_116<?> NLoginInterface_0112, NLoginCore_227 NLoginCore_2272) {
        this.var_com_nickuc_login_NLoginInterface_011____c = NLoginInterface_0112;
        this.var_com_nickuc_login_NLoginCore_227_a = NLoginCore_2272;
    }

    public String L() {
        return this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)i, (long)(j ^ k)), NLoginCore_142.c("㺃", (int)l, (long)m)) + (String)NLoginCore_142.c("㺆", (int)n, (long)(o ^ p)) + this.o();
    }

    public int o() {
        return (Integer)this.var_com_nickuc_login_NLoginInterface_011____c.a(h);
    }

    private static void void_b() {
        int n;
        var_long_c = 5991424697212963223L;
        long l = var_long_c ^ 0xE66D6F21CBBFA620L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(26 + 43), 83, (byte)(18 + 29), (byte)(27 + 40), (byte)(46 + 20), (byte)(33 + 34), (byte)(39 + 8), (byte)(25 + 55), (byte)(5 + 70), (byte)(42 + 25), (byte)(17 + 66), (byte)(29 + 24), (byte)(64 + 16), (byte)(15 + 82), (byte)(2 + 98), (byte)(14 + 86), 105, (byte)(59 + 51), (byte)(3 + 100)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
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
                    NLoginCore_142.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ЪвТгіщцљЭЙѝХлпВянѢђџПѕЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[1] = NLoginCore_324.B("ßĆËÝĐèĒĖôĂČß", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[2] = NLoginCore_076.E("ԸԲԫԡԞӽԅԸԄԸԽԐ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[3] = NLoginCore_076.D("КЋаЍУїёъЌћВхМвмЙпЛМхФпЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[4] = NLoginCore_384.C("ЊЍдУцїАљжВФС", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[5] = NLoginCore_453.D("чЉРЇхЍЊвюШћіжвџьЫэФјсцѓнѫњдѕѨѢѐѥ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ĆëăÞċäĂñîËóēćòďØĖĒïēĐĦåĘĉĝûþú÷éČ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[7] = NLoginCore_110.A("ĆëăÞċäĂñîËõĆúċĖõûßÚëĞþćĈòåøĦĠëģî", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[8] = NLoginCore_138.F("ԷԜԴԏԼԕԳԢԟӼԦԇՈԶԼԚԾԪԪԏԏԒԉ՘ՖԌԨ՛ՖԕՋԱ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[9] = NLoginCore_384.A("ĆëăÞċäĂñîËõĉûêĔĕêØðĜČóĂħąĉĠöąĮĤĂ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[10] = NLoginCore_324.D("НАддугУэЮфњС", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[11] = NLoginCore_201.F("ԷԜԴԏԼԕԳԢԟӼԣՁԞԙԍԜՃԐՉԔՐԣԭՇԷԤՄԪՉԭԖԳ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[12] = NLoginCore_223.F("ՁԕԱԤԑԚӽԔԃՈԗԐ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[13] = NLoginCore_138.C("ЪЪъЇїЮВЬТЩфьїћћпеоьђѢјуръоцѕїЭѡѨѦѓѠбѶѫщжѓѺљѦѳѿѸѐџћ҄ѣҁ҅ьэ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[14] = NLoginCore_559.E("ԞԵԃԴԾԅԥԄԕԡՀԺԨՃՃ԰ԌՅԱԤԫՄԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[15] = NLoginCore_559.A("ĆëăÞċäĂñîËóĊÚĐèĀĊĉčúĠęîĆđĉĕóĄíææĉĎıĝħİğĥĔôùÿ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[16] = NLoginCore_384.D("ђЦтеТЫЎХДљШС", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[17] = NLoginCore_076.A("èèĈÅĕìÐêàçĂĊĕęęýóüĊĐĠĖāþĈüĄēĕëğĦĩĉğñêĮďíĠĖĄĕĨĦįēĹĉĐĠüŃĊċ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[18] = NLoginCore_138.C("ЯцДхяЖжЕЦвёыйєєсНітемѕЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[19] = NLoginCore_004.D("мРѕШжсьеЯЬйхьчиѕтзвйНпЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[20] = NLoginCore_387.F("ԚԑՁԐԟԓԧԈԥՀԋԭԣԭԬԎՅ԰ԾԴՎՄԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[21] = NLoginCore_453.A("ÚČăđÿÑĆÉëđÚéČÜùĜĈēÿüĎýêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[22] = NLoginCore_384.A("èèĈÅĕìÐêàçĂĆùĊÐĘğðĊġėâĜĚùĂÜþĢĢĨďĊĦģčñİöčĊČĖÿ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[23] = NLoginCore_027.A("đéĉÞčĖćĎČîčçąðúÚēĘĕĂĠĖĘĆ÷ĉâÿĦĭĎĭìðĝĂăĖĄĄĥīðĸĎĦČûļĎġěĒĿľģĐĩĀāħĈćĹŁōďĥœĥĔŕŇŕĶĲĔļĝŔŋĘĻĻŗģİŜņŅŚĿĪŃĸŉ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[24] = NLoginCore_453.A("ÉÇïđòèêÉđĄòß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[25] = NLoginCore_076.D("ѓЫыРяјщѐюаяЩчвмМѕњїфѢјњшйыФсѨѯѐѯуьўѤеђѯиѪцѱўѹѹіѴѭнфлҀяохѴѬш҃ҋѥѭ҃ғѦҎьҕѮїғғҘѺі҈ҕѲѳҋҙѵѱѵљҠ҃ҜҫқҟѤѾҀ҃ҐұҝҒұҬҙҩҸѲѲҌҷѺӁҔҐѺҒҗҺҘ҃ӀҔҜҼӈӌӁ҂Ӆҿ҉ҜҨҨҖӇӐҺҮӛҝҲҞқҷҫҞӟӚҼүҬҭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[26] = NLoginCore_453.E("ԸԲԫԡԞӽԅԸԄԸԽԐ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[27] = NLoginCore_138.C("щумвЯЎЖщЕщюС", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[28] = NLoginCore_138.A("àĂûôċďÓĊåĂúăìďúÛýÞÙúěíêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[29] = NLoginCore_201.D("ТфнжэёЕьЧфмхЮёмНпРЛмѝЯЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[30] = NLoginCore_324.D("ТфнжэёЕьЧфнѝќвињѝџжотѐаїйСУѮьЭѭѨ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[31] = NLoginCore_559.B("ÍÊċÏÝÕ÷áÎÓúß", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[32] = NLoginCore_091.A("ÍÊċÏÝÕ÷áÎÓúß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[33] = NLoginCore_324.F("ԫԏՄԗԥ԰ԻԤԞԛԧԋՈԤԧԜԠԿՅՈԳՄԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[34] = NLoginCore_223.B("ßĆËÝĐèĒĖôĂČß", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[35] = NLoginCore_427.B("ßĆËÝĐèĒĖôĂČß", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[36] = NLoginCore_446.F("ԙԙԹӶՆԝԁԛԑԘԳԙԹՇԣԨԢՍԮՒԳՄԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[37] = NLoginCore_324.E("ԐԷӼԎՁԙՃՇԥԳԽԐ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[38] = NLoginCore_384.A("èĄÄãïāĆá×ñæß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[39] = NLoginCore_384.E("ՁԍԓԣӽԚԑԇԦԺԇԾԠԫԹՍՐԌԠԽԒԞԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[40] = NLoginCore_223.E("ԶӸԏӶԴӼӹԡԽԗՊՅԥԡՎԻԚԼԓՇ԰ԵՂԬ՚ՉԣՄ՗ՑԿՔ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[41] = NLoginCore_091.A("ĐÜâòÌéàÖõĉÖčïúĈĜğÛïČáíêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[42] = NLoginCore_110.A("ïèÝñÌéćĊìãâß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[43] = NLoginCore_173.E("ԷԜԴԏԼԕԳԢԟӼԦԣՆԛԸՃԺԌՑԵՊՔԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[44] = NLoginCore_076.D("ЫдСтбтсШЧгЬС", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[45] = NLoginCore_027.E("ԚԣԐԱԠԱ԰ԗԖԢԛԐ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[46] = NLoginCore_559.D("ЪвТгіщцљЭЙѝХлпВянѢђџПѕЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[47] = NLoginCore_427.C("РяьНЭытВЩЕзЧЩбВСѓнеЯОѠђѓєѧиШѣлнљѤѰѝаёчыыѬѧѬьјѳкщѹтѻћютѼѝјњѷќҏџ҄ѩ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[48] = NLoginCore_201.D("ѐцтВїицЏЯлкыНбМїїТќязєѝѨѫжѦѡЦѨюЪкьѭѬгъѳЫѲѲиѩѱѨѕўкѷѻќ҆ѕѸѳ҆ќҋѧѢъҏ҉", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[49] = NLoginCore_453.C("ЋЉбѓдЪЬЋѓцдС", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[50] = NLoginCore_324.F("ԿԵԱԁՆԧԵӾԞԪԩԺԌԠԋՆՆԑՋԾԦԱԫԘԥՊԍԯԳ՚ՒԜԟԾԝԹԤՏ՗ՄԣԥԪԺՁզէԩղՐԩկԵԾյգո՛ՅՑէռԱԲՖՊմսչչՙնբեԽք֋ջՁաւթզժևծ՛՜", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[51] = NLoginCore_453.D("ЋЉбѓдЪЬЋѓцдС", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[52] = NLoginCore_384.B("ĎĄĀÐĕöĄÍíùøĉÛïÚĕĕàĚčõĀúçôęÜþĂĩġëîčìĈóĞĦēòôìûĺõīČĠĀĭľĄĠþĚĠħĿėċŋğŉ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[53] = NLoginCore_223.C("ђшОэѕЕРкаћЧЬђщдЮѝРњѦіѕЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[54] = NLoginCore_091.F("ӺӸԠՂԣԙԛӺՂԵԣԐ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[55] = NLoginCore_384.B("ÌÙĉéìîÿëÎîèđéôďđĜá÷àÞģêë", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[56] = NLoginCore_384.C("КОбгфЖфЙгыИЭэзќьѝаЭужѓщреФщЩюСЧўѪмѨєїѓѰѱЬзыіѹпѽіѭюѲзѧсспҋѺѕљў҂ьѱѥ҂ғҌҖѠѷѦ҇҇Қѡ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[57] = NLoginCore_453.B("úÞĒòôĊčÕìõĎäÙĕÙÚôóĒċĀÛØâĂĪĠěģĄĩĜ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[58] = NLoginCore_027.C("бЍфПЯБЯйхЯяшМѐѠкТѣрюѓѥЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[59] = NLoginCore_451.F("ԲԼԔԡԮԼԁՃՊԷԨՁԊԥՂԮԙԝԡԬԢԧԖԱԧԔԹ՝ՈԚԳՙ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[60] = NLoginCore_110.A("àÞëÜĈĆĈö×òÌóďąĒčíáĖĚíáĐòòùćĊĢīæĨ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[61] = NLoginCore_201.B("àýÿÜËáþßôČćÚìöĞòñēìĜÿóöģÚĂûĠģĄÿù", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[62] = NLoginCore_387.B("ÉÇïđòèêÉđĄòß", (byte)12, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_142.var_java_lang_String_arr_b[0] = NLoginCore_004.C("ЪвТгіщцљЭЙњнщШпЭябјхЦяѐљѝўњЫѦЪѦы", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[1] = NLoginCore_387.F("ԊԚԡԟԄԖԑԢԵՆԻԵԩՂԤՀՍԿԡԱԏՄԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[2] = NLoginCore_138.D("ЪОчёЧЧёЭѓЦђзбіЭпџаМжхѥЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[3] = NLoginCore_451.D("КЋаЍУїёъЌћМєыэщаліѣюѝЯЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[4] = NLoginCore_387.D("ПяСёэхФЗЬёШС", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[5] = NLoginCore_559.B("ąÇÞÅăËÈðČæęĔôðĝĊéċâĖÿýěäòĒąúĭêùĉ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[6] = NLoginCore_092.C("шЭхРэЦфгаЍеѕщдёКјєбѕђУзРФцчѢпўЬсѱЩѧъЯсјѩѺѼфс", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[7] = NLoginCore_201.E("ԷԜԴԏԼԕԳԢԟӼԦԷԫԼՇԦԬԐԋԜՏՃԷՋԷ՚ԫԻ՜ՔԮԳ԰աՏԭբԴ՝՛Ԣԧ՝԰", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[8] = NLoginCore_427.B("ĆëăÞċäĂñîËõÖėąċéčùùÞÞĦģĨùþĉĢüĤčę", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[9] = NLoginCore_110.A("ĆëăÞċäĂñîËõĉûêĔĕêØðĜČùåĠĦēĂĊĄčąê", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[10] = NLoginCore_027.A("ùñÍäüąĎÎÔèûąûćÐûùêÙóîýêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[11] = NLoginCore_387.F("ԷԜԴԏԼԕԳԢԟӼԣՁԞԙԍԜՃԐՉԔՐԣԳՉՕԳԮՊԕԵԛ՗", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[12] = NLoginCore_091.A("áĒÈćāæčăĘąúß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[13] = NLoginCore_091.D("ЪЪъЇїЮВЬТЩфьїћћпеоьђѢјуръоцѕїЭѡѨѦѓѠбѶѫщжѓѺњѝкюѾѷїѽюёѕяч҆҆їш҅р҄ѫъ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ԞԵԃԴԾԅԥԄԕԡԽԧՁԩԷԨԯՐԢԟՌԮԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[15] = NLoginCore_223.A("ĆëăÞċäĂñîËóĊÚĐèĀĊĉčúĠęîĆđĉĕóĄíææĎěĒĉĕĈĥĶĳĉĤÿ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[16] = NLoginCore_027.F("ӷӸԼԏԖӿԸԻԑԅԹԐ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[17] = NLoginCore_559.D("ЪЪъЇїЮВЬТЩфьїћћпеоьђѢјуръоцѕїЭѡѨѫыѡгЬѰёЯѢјфїіѬёѮѝѫ҅ѴѼ҈ѨѲўҌє҅҈ѮѤш", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[18] = NLoginCore_559.B("íĄÒăčÔôÓäðČĔĐđõĘ×ÿÛýĞēêë", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[19] = NLoginCore_201.C("мРѕШжсьеЯЬйщЪмЖПъЯѠајџпѨдлУѣѢйѬљ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[20] = NLoginCore_004.E("ԚԑՁԐԟԓԧԈԥՀԁՋԊԡԊԌԡՒԫԑԡՔԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[21] = NLoginCore_559.D("МюхѓсГшЋЭѓЎхНлџтеЮаяѣѥЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[22] = NLoginCore_201.D("ЪЪъЇїЮВЬТЩфшльВњѡвьѣљФўќлфОрѤѤѪёѢџѣѠяюѦѵѶжюизчѨѹѡѓѺ҂ћџьэ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[23] = NLoginCore_201.D("ѓЫыРяјщѐюаяЩчвмМѕњїфѢјњшйыФсѨѯѐѯЮвџфхјццѧѭвѺѐѨюнѾѐѣѝєҁҀѥђѫтуѩъщѻ҃ҏёѧҕѧіҗ҉җѸѴіѾџҖҍњѽѽҙѧҤ҂ѸҜѶҬҩ҅҃ҟҎҌѦѳҒ҈ѪҚҍ҉Ҕҁ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[24] = NLoginCore_575.F("ՀԂԮԜԀԘӿԓԛԧԓԐ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[25] = NLoginCore_027.E("ՂԚԺԏԾՇԸԿԽԟԾԘԶԡԫԋՄՉՆԳՑՇՉԷԨԺԓ԰՗՞Կ՞ԲԻՍՓԤՁ՞ԧՙԵՠՍըըՅգ՜ԬԳԪկԾԭԴգ՛ԷղպՔ՜ղւՕսԻք՝ՆււևթՅշքաբպֈդՠդՈ֏ղ֋֚֊֎Փխկղտ֠֌ց֛֠ֈ֧֘աաջ֦թְփտթցֆ֩ևղ֯փ֋ְַֻ֫ձִ֮ո֋֗֗օֶֿ֩֝׉ׁ֩֍֋֙֋־׋֛֮֠֯֜", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[26] = NLoginCore_027.A("ĎðÉÓåäċāċøČĔÚėÚÝöĐĠàĀíêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[27] = NLoginCore_027.A("ĆčÍôčÞÞĕćĎâòêØċĝėáĜòàēêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[28] = NLoginCore_110.D("ТфнжэёЕьЧфхГљЫмжкяксёѥЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[29] = NLoginCore_091.C("ТфнжэёЕьЧфхЯЕжеоюгФёМЯЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[30] = NLoginCore_324.C("ТфнжэёЕьЧфнѝќвињѝџжотєѡџѩукѤоъёѨ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[31] = NLoginCore_110.C("ЎтЎстЩБЏзЧќЩМяѠѓПљѢѡѓѕЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[32] = NLoginCore_004.F("ӽԕԕՄԙՇԵԸՅԈՈԪӿԣԣԌԲԑՔԧՎՔԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[33] = NLoginCore_453.A("úÞēæôÿĊóíê÷äíéčïÛĜõâäģêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[34] = NLoginCore_223.C("ЍтРьзЉЖБючгЧѐїкЗДЛОѝоѕЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[35] = NLoginCore_201.D("ёьцЪАЧяЫЌюхђњѓЗэѕѓўѦфЯЬЭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[36] = NLoginCore_427.E("ԙԙԹӶՆԝԁԛԑԘԴԞՃԶԘՋԏԪԮՔԇԮԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[37] = NLoginCore_092.B("ĈçĄČíïÍĕðÙĎĄĝēĉÛĖÓġôăēêë", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[38] = NLoginCore_451.A("ëĉąĂóãóÑøēèûĒąĊûġùěáðýêë", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[39] = NLoginCore_091.F("ՁԍԓԣӽԚԑԇԦԺԈԜԞԮՀՄՀԋԡՁՊՄԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[40] = NLoginCore_451.D("чЉРЇхЍЊвюШћіжвџьЫэФјсцУъохУѪРьЬѭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[41] = NLoginCore_223.A("ĐÜâòÌéàÖõĉ×ĚÎĞĕė÷ČāÙġ÷ïôçĚĄĠĄĎĢù", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[42] = NLoginCore_223.F("ԁӸԑԼԟԆԧԞՅԽԽԙՆՋԊԝՐՎԢԌԒԮԛԜ", (byte)12, 70);
                    NLoginCore_142.var_java_lang_String_arr_b[43] = NLoginCore_324.A("ĆëăÞċäĂñîËõÑéèûČßÛîíāÜùĦþğĦĔÞêćī", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[44] = NLoginCore_076.C("шъшСОждчХюдС", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[45] = NLoginCore_451.C("гптНжЦбаѓхѕЗбЙьоѣяПСзЯЬЭ", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[46] = NLoginCore_223.B("èðàñĔćĄėë×ěãďíĔĈûÚĎĐóĔûïĐğêħøøĄú", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[47] = NLoginCore_559.A("ÞčĊÛëĉĀÐçÓõåçïÐßđûóíÜĞĐđĒĥöæġùûėĢĮěîďąĉĉĪĥĪĊĖıøćķĀĹęČÿŇĵĐľĖĝīŁŇŏļğŌįďĵĦĢħĪĢğ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[48] = NLoginCore_138.D("ѐцтВїицЏЯлкыНбМїїТќязєѝѨѫжѦѡЦѨюЪкьѭѬгъѳЫѲѲиѩѱѨѕўкѷѻќ҆ѕчєђѣџҀҋҍҐѹьҔґѠ҅Ѱї҃ѥ҈Ѭѡ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[49] = NLoginCore_559.C("ьщЭТЎіЪШЕчЛС", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[50] = NLoginCore_324.D("ѐцтВїицЏЯлкыНбМїїТќязтмЩжћОрфѫѣЭаяЮъеѠѨѕджлыђѷѸк҃ѡкҀця҆Ѵ҉ѬіѢѸҍтуѧћ҅ҎҊҊѪ҇ѳѶђљѮѸҀїџҗѽҖқҥѬѭ", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[51] = NLoginCore_027.A("ËÐßÉâÑñČė×Ĉß", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[52] = NLoginCore_138.A("ĎĄĀÐĕöĄÍíùøĉÛïÚĕĕàĚčõĀúçôęÜþĂĩġëîčìĈóĞĦēòôìûĺõīČĠĀĭľĄĲĶďĨĨĦąĚŊĹľĞĺĦĽĩŎœğđęĕğ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[53] = NLoginCore_453.C("ђшОэѕЕРкаћЧъпэнёРѕхЯћмїћєТТрлюЮч", (byte)12, 67);
                    NLoginCore_142.var_java_lang_String_arr_b[54] = NLoginCore_223.B("ûïüĂíčėėĘîîß", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[55] = NLoginCore_092.A("ÌÙĉéìîÿëÎîæĚÓ÷ëČġëÜĚûßĒĥĂĒęĝąĝĘí", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[56] = NLoginCore_138.A("ØÜïñĂÔĂ×ñĉÖëċõĚĊěîëāôđćþóâćçČßåĜĨúĦĒĕđĮįêõĉĔķýĻĔīČİõĥÿÿýŉĸēėĜŀĊįŇĉĲĠĆčŃįĔĭĺğ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[57] = NLoginCore_138.A("úÞĒòôĊčÕìõĎäÙĕÙÚôóĒċĀâôĈęėôýþíāĈĭãĀüċħėĬċĖĤÿ", (byte)12, 65);
                    NLoginCore_142.var_java_lang_String_arr_b[58] = NLoginCore_223.E("ԠӼԳԎԞԀԞԨԴԞՀԛԩԆԩԻՇԭԠԱԿՔԛԜ", (byte)12, 69);
                    NLoginCore_142.var_java_lang_String_arr_b[59] = NLoginCore_559.B("āċãðýċÐĒęĆ÷ĐÙôđýèìðûñûĂďøĂĂĔĄĊĚøúīëċîĪąéĕČĴÿ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[60] = NLoginCore_559.D("ТРЭОъшъиЙдЎеёчєяЯУјќЯХњеЩЫУѭѯѧѠё", (byte)12, 68);
                    NLoginCore_142.var_java_lang_String_arr_b[61] = NLoginCore_004.B("àýÿÜËáþßôČćÚìöĞòñēìĜÿîúģĐãýĆāýćĊ", (byte)12, 66);
                    NLoginCore_142.var_java_lang_String_arr_b[62] = NLoginCore_201.C("ЌгНЌсэєЗељъС", (byte)12, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_142.var_java_lang_String_arr_b[0] = NLoginCore_092.F("ӹԊԞ԰ԿԏԹ԰ԾԂԧԐ", (byte)12, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_142.var_java_lang_String_arr_b[0] = NLoginCore_223.D("рЌяоАФєШВїГС", (byte)12, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_142.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.B("įőœĳŗŶŮƄŰĿŽųƁŻńũƋƊƂƈƂŗ", (byte)68, 66), NLoginCore_142.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_451.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡃࠦࡅࡘ࠹ࡕࡏ࠴࡚࡛Ӗ", (byte)68, 68) + string + NLoginCore_446.C("һ", (byte)68, 67) + methodType.toString(), exception);
        }
    }

    int n() {
        return this.V ? (Integer)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)(bl & bm), (long)bn), bo) : bp;
    }

    public boolean ac() {
        return (Boolean)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)q, (long)(r ^ s)), t != 0);
    }

    public List<String> a(List<String> list) {
        return this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)(e & f), (long)g), list);
    }

    private static String a(int n, long l) {
        l ^= 4L;
        l ^= 0xE66D6F21CBBFA620L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(49 + 20), (byte)(26 + 57), (byte)(18 + 29), (byte)(53 + 14), (byte)(36 + 30), (byte)(48 + 19), (byte)(27 + 20), (byte)(62 + 18), (byte)(13 + 62), (byte)(46 + 21), (byte)(9 + 74), (byte)(13 + 40), (byte)(46 + 34), (byte)(35 + 62), (byte)(45 + 55), 100, (byte)(60 + 45), (byte)(49 + 61), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(23 + 60)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.D("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰࡳࡖࡵ࢈ࡩࢅࡿࡤࢊࢋ", (byte)84, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_142.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public String O() {
        return (String)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)ac, (long)(ad ^ ae)), NLoginCore_142.c("㺃", (int)af, (long)ag));
    }

    @Nullable
    public String M() {
        return (String)this.cfr_renamed_16.get(NLoginCore_142.c("㺀", (int)u, (long)v));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(NLoginCore_123 NLoginCore_1232) {
        if (NLoginCore_1232 == null || !NLoginCore_1232.ag() || NLoginCore_1232.V() == null) {
            try {
                NLoginCore_123 NLoginCore_1233 = NLoginCore_305.a().a((String)NLoginCore_142.c("㺀", (int)(cb & cc), (long)cd));
                if (NLoginCore_1233.ag()) {
                    if (!NLoginCore_525.as()) {
                        byte by = this.var_byte_a;
                        this.var_byte_a = (byte)(by + ce);
                        if (by != cf) return;
                    }
                    NLoginCore_370.d((String)NLoginCore_142.c("㺃", (int)cg, (long)ch) + (NLoginCore_1232 != null ? NLoginCore_1232.p() : ci) + (String)NLoginCore_142.c("㺆", (int)cj, (long)(ck ^ cl)), new Object[cm]);
                    return;
                } else {
                    if (!NLoginCore_525.as()) {
                        byte by = this.var_byte_a;
                        this.var_byte_a = (byte)(by + cn);
                        if (by != co) return;
                    }
                    NLoginCore_370.d((String)NLoginCore_142.c("㺉", (int)(cp & cq), (long)cr), new Object[cs]);
                }
                return;
            }
            finally {
                this.ao();
            }
        }
        int n = ct;
        int n2 = NLoginCore_1232.p();
        try {
            switch (n2) {
                case 200: {
                    String string = NLoginCore_1232.V();
                    JSONObject jSONObject = new JSONObject(string);
                    this.cfr_renamed_16.clear();
                    this.cfr_renamed_16.put((String)NLoginCore_142.c("㺌", (int)(cu & cv), (long)cw), jSONObject.getString((String)NLoginCore_142.c("㺏", (int)cx, (long)(cy ^ cz))));
                    NLoginCore_180 NLoginCore_1802 = this.var_com_nickuc_login_NLoginCore_227_a.com_nickuc_login_NLoginCore_180_a();
                    if (NLoginCore_1802 == null) {
                        throw new IllegalStateException();
                    }
                    byte[] byArray = this.var_com_nickuc_login_NLoginCore_227_a.byte_arr_a();
                    if (!NLoginCore_1802.a(jSONObject, string, byArray)) {
                        return;
                    } else {
                        JSONObject jSONObject2;
                        JSONObject jSONObject3;
                        NLoginCore_482 NLoginCore_4822 = this.var_com_nickuc_login_NLoginInterface_011____c.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a();
                        byte[] byArray2 = NLoginCore_4822.byte_arr_a((String)NLoginCore_142.c("㺒", (int)da, (long)(db ^ dc)));
                        if (byArray2 == null || !Arrays.equals(byArray, byArray2)) {
                            NLoginCore_4822.a((String)NLoginCore_142.c("㺕", (int)dd, (long)de), byArray).a((String)NLoginCore_142.c("㺘", (int)(df & dg), (long)dh), NLoginCore_140.a((NLoginCore_126 NLoginCore_1262) -> NLoginCore_1262.a(System.currentTimeMillis()))).ag();
                        }
                        if (jSONObject.has((String)NLoginCore_142.c("㺛", (int)di, (long)(dj ^ dk)))) {
                            jSONObject3 = jSONObject.getJSONObject((String)NLoginCore_142.c("㺞", (int)dl, (long)(dm ^ dn)));
                            for (String string2 : jSONObject3.keySet()) {
                                this.cfr_renamed_16.put((String)NLoginCore_142.c("㺡", (int)cfr_renamed_1, (long)dp) + string2, jSONObject3.get(string2));
                            }
                            if (this.n() == 0) {
                                this.var_com_nickuc_login_NLoginCore_227_a.ai();
                            }
                        }
                        if (jSONObject.has((String)NLoginCore_142.c("㺤", (int)dq, (long)dr))) {
                            jSONObject3 = jSONObject.getJSONArray((String)NLoginCore_142.c("㺧", (int)ds, (long)dt));
                            jSONObject2 = new String[jSONObject3.length()];
                            for (int i = du; i < jSONObject3.length(); ++i) {
                                jSONObject2[i] = (String)NLoginCore_142.c("㺪", (int)dv, (long)(dw ^ dx)) + jSONObject3.getString(i);
                            }
                            this.cfr_renamed_16.put((String)NLoginCore_142.c("㺭", (int)(dy & dz), (long)ea), NLoginCore_135.a(jSONObject2));
                        }
                        if ((jSONObject3 = jSONObject.getJSONObject((String)NLoginCore_142.c("㺰", (int)(eb & ec), (long)ed))).has((String)NLoginCore_142.c("㺳", (int)ee, (long)(ef ^ eg)))) {
                            this.cfr_renamed_16.put((String)NLoginCore_142.c("㺶", (int)eh, (long)ei), jSONObject3.getBoolean((String)NLoginCore_142.c("㺹", (int)ej, (long)(ek ^ el))));
                        }
                        jSONObject2 = jSONObject3.getJSONObject((String)NLoginCore_142.c("㺼", (int)em, (long)(en ^ eo)));
                        for (Object object : jSONObject2.keySet()) {
                            this.cfr_renamed_16.put((String)NLoginCore_142.c("㺿", (int)(ep & eq), (long)er) + (String)object, jSONObject2.get((String)object));
                        }
                        if (jSONObject3.has((String)NLoginCore_142.c("㻂", (int)(es & et), (long)eu))) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject((String)NLoginCore_142.c("㻅", (int)ev, (long)(ew ^ ex)));
                            for (String string3 : jSONObject4.keySet()) {
                                this.cfr_renamed_16.put((String)NLoginCore_142.c("㻈", (int)(ey & ez), (long)fa) + string3, jSONObject4.get(string3));
                            }
                        }
                        if (this.var_byte_b > 0) {
                            NLoginCore_370.e((String)NLoginCore_142.c("㻋", (int)fb, (long)(fc ^ fd)), new Object[fe]);
                        }
                        this.var_byte_b = (byte)ff;
                        this.var_byte_a = (byte)fg;
                        this.V = fh;
                        n = fi;
                        return;
                    }
                }
                case 401: {
                    this.var_com_nickuc_login_NLoginCore_227_a.ak();
                }
                case 403: {
                    if (!this.var_com_nickuc_login_NLoginCore_227_a.ab()) return;
                    this.var_com_nickuc_login_NLoginCore_227_a.am();
                    n = fj;
                    return;
                }
                case 503: {
                    if (!NLoginCore_525.as()) {
                        byte by = this.var_byte_a;
                        this.var_byte_a = (byte)(by + fk);
                        if (by != fl) return;
                    }
                    NLoginCore_370.c((String)NLoginCore_142.c("㻎", (int)(fm & fn), (long)fo) + n2 + (String)NLoginCore_142.c("㻑", (int)fp, (long)fq), new Object[fr]);
                    return;
                }
                default: {
                    if (!NLoginCore_525.as()) {
                        byte by = this.var_byte_a;
                        this.var_byte_a = (byte)(by + fs);
                        if (by != ft) return;
                    }
                    NLoginCore_370.d((String)NLoginCore_142.c("㻔", (int)(fu & fv), (long)fw) + n2 + (String)NLoginCore_142.c("㻗", (int)(fx & fy), (long)fz), new Object[ga]);
                    return;
                }
            }
        }
        catch (JSONException jSONException) {
            NLoginCore_370.d((String)NLoginCore_142.c("㻚", (int)gb, (long)gc) + n2 + (String)NLoginCore_142.c("㻝", (int)gd, (long)(ge ^ gf)) + jSONException.getLocalizedMessage() + (String)NLoginCore_142.c("㻠", (int)gg, (long)(gh ^ gi)), new Object[gj]);
            return;
        }
        catch (Exception exception) {
            if (exception instanceof IllegalStateException && ((String)NLoginCore_142.c("㻣", (int)(gk & gl), (long)gm)).equals(exception.getMessage())) return;
            NLoginCore_370.c((String)NLoginCore_142.c("㻦", (int)gn, (long)(go ^ gp)), exception, new Object[gq]);
            return;
        }
        finally {
            if (n == 0) {
                this.ao();
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-1616361373086014262L);
        d = Long.reverse(0x2000000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(-1);
        g = Long.reverse(-3922204382299708214L);
        h = 2 >>> 97 | 2 << -97;
        i = 0x2000000 >>> 184 | 0x2000000 << -184;
        j = Long.reverse(-1616361373086014262L);
        k = Long.reverse(0x2000000000000000L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(-3922204382299708214L);
        n = 0x400000 >>> 20 | 0x400000 << -20;
        o = Long.reverse(-1616361373086014262L);
        p = Long.reverse(0x2000000000000000L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(-1616361373086014262L);
        s = Long.reverse(0x2000000000000000L);
        t = (0 >>> 13 | 0 << -13) & 0xFFFFFFFF;
        u = Integer.reverse(0x60000000);
        v = Long.reverse(-3922204382299708214L);
        w = (114688 >>> 110 | 114688 << -110) & 0xFFFFFFFF;
        x = Long.reverse(-1616361373086014262L);
        y = Long.reverse(0x2000000000000000L);
        z = (262144 >>> 79 | 262144 << -79) & 0xFFFFFFFF;
        aa = Long.reverse(-1616361373086014262L);
        ab = Long.reverse(0x2000000000000000L);
        ac = Integer.reverse(-1879048192);
        ad = Long.reverse(-1616361373086014262L);
        ae = Long.reverse(0x2000000000000000L);
        af = Integer.reverse(0x50000000);
        ag = Long.reverse(-3922204382299708214L);
        ah = (2816 >>> 8 | 2816 << -8) & 0xFFFFFFFF;
        ai = Long.reverse(-1616361373086014262L);
        aj = Long.reverse(0x2000000000000000L);
        ak = Integer.reverse(0x30000000);
        al = Integer.reverse(-1);
        am = Long.reverse(-3922204382299708214L);
        an = Integer.reverse(-1342177280);
        ao = Long.reverse(-1616361373086014262L);
        ap = Long.reverse(0x2000000000000000L);
        aq = 0x1C000000 >>> 217 | 0x1C000000 << ~217 + 1;
        ar = Integer.reverse(-1);
        as = Long.reverse(-3922204382299708214L);
        at = Integer.reverse(-268435456);
        au = Long.reverse(-1616361373086014262L);
        av = Long.reverse(0x2000000000000000L);
        aw = Integer.reverse(0x8000000);
        ax = Long.reverse(-1616361373086014262L);
        ay = Long.reverse(0x2000000000000000L);
        az = (0x4400000 >>> 54 | 0x4400000 << -54) & 0xFFFFFFFF;
        ba = Integer.reverse(-1);
        bb = Long.reverse(-3922204382299708214L);
        bc = (18 >>> 32 | 18 << ~32 + 1) & 0xFFFFFFFF;
        bd = Long.reverse(-1616361373086014262L);
        be = Long.reverse(0x2000000000000000L);
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = (131072 >>> 113 | 131072 << ~113 + 1) & 0xFFFFFFFF;
        bh = (0 >>> 218 | 0 << ~218 + 1) & 0xFFFFFFFF;
        bi = 0x180000 >>> 147 | 0x180000 << ~147 + 1;
        bj = (32768 >>> 207 | 32768 << ~207 + 1) & 0xFFFFFFFF;
        bk = 0 >>> 101 | 0 << ~101 + 1;
        bl = Integer.reverse(-939524096);
        bm = Integer.reverse(-1);
        bn = Long.reverse(-3922204382299708214L);
        bo = (256 >>> 168 | 256 << ~168 + 1) & 0xFFFFFFFF;
        bp = Integer.reverse(Integer.MIN_VALUE);
        bq = Integer.reverse(0x28000000);
        br = Long.reverse(-1616361373086014262L);
        bs = Long.reverse(0x2000000000000000L);
        bt = 0x7800000 >>> 20 | 0x7800000 << -20;
        bu = 61440 >>> 166 | 61440 << ~166 + 1;
        bv = Integer.reverse(0x20000000);
        bw = (336 >>> 68 | 336 << -68) & 0xFFFFFFFF;
        bx = Long.reverse(-1616361373086014262L);
        by = Long.reverse(0x2000000000000000L);
        bz = Integer.reverse(Integer.MIN_VALUE);
        ca = (0 >>> 94 | 0 << ~94 + 1) & 0xFFFFFFFF;
        cb = 176 >>> 131 | 176 << -131;
        cc = Integer.reverse(-1);
        cd = Long.reverse(-3922204382299708214L);
        ce = (0x40000000 >>> 222 | 0x40000000 << ~222 + 1) & 0xFFFFFFFF;
        cf = 8192 >>> 109 | 8192 << -109;
        cg = 0x1700000 >>> 148 | 0x1700000 << -148;
        ch = Long.reverse(-3922204382299708214L);
        ci = Integer.reverse(0);
        cj = (3 >>> 221 | 3 << -221) & 0xFFFFFFFF;
        ck = Long.reverse(-1616361373086014262L);
        cl = Long.reverse(0x2000000000000000L);
        cm = Integer.reverse(0);
        cn = Integer.reverse(Integer.MIN_VALUE);
        co = (32 >>> 165 | 32 << ~165 + 1) & 0xFFFFFFFF;
        cp = 0x320000 >>> 81 | 0x320000 << -81;
        cq = (-1 >>> 44 | -1 << ~44 + 1) & 0xFFFFFFFF;
        cr = Long.reverse(-3922204382299708214L);
        cs = Integer.reverse(0);
        ct = Integer.reverse(0);
        cu = Integer.reverse(0x58000000);
        cv = -1 >>> 112 | -1 << -112;
        cw = Long.reverse(-3922204382299708214L);
        cx = Integer.reverse(-671088640);
        cy = Long.reverse(-1616361373086014262L);
        cz = Long.reverse(0x2000000000000000L);
        da = 7168 >>> 200 | 7168 << -200;
        db = Long.reverse(-1616361373086014262L);
        dc = Long.reverse(0x2000000000000000L);
        dd = (7424 >>> 72 | 7424 << -72) & 0xFFFFFFFF;
        de = Long.reverse(-3922204382299708214L);
        df = 0x3C000000 >>> 89 | 0x3C000000 << ~89 + 1;
        dg = -1 >>> 127 | -1 << -127;
        dh = Long.reverse(-3922204382299708214L);
        di = Integer.reverse(-134217728);
        dj = Long.reverse(-1616361373086014262L);
        dk = Long.reverse(0x2000000000000000L);
        dl = (16384 >>> 105 | 16384 << -105) & 0xFFFFFFFF;
        dm = Long.reverse(-1616361373086014262L);
        dn = Long.reverse(0x2000000000000000L);
        cfr_renamed_1 = 16896 >>> 9 | 16896 << -9;
        dp = Long.reverse(-3922204382299708214L);
        dq = (0x22000000 >>> 216 | 0x22000000 << -216) & 0xFFFFFFFF;
        dr = Long.reverse(-3922204382299708214L);
        ds = (1120 >>> 229 | 1120 << -229) & 0xFFFFFFFF;
        dt = Long.reverse(-3922204382299708214L);
        du = Integer.reverse(0);
        dv = (36864 >>> 10 | 36864 << -10) & 0xFFFFFFFF;
        dw = Long.reverse(-1616361373086014262L);
        dx = Long.reverse(0x2000000000000000L);
        dy = 2368 >>> 230 | 2368 << ~230 + 1;
        dz = Integer.reverse(-1);
        ea = Long.reverse(-3922204382299708214L);
        eb = (-1744830464 >>> 218 | -1744830464 << -218) & 0xFFFFFFFF;
        ec = Integer.reverse(-1);
        ed = Long.reverse(-3922204382299708214L);
        ee = 327155712 >>> 215 | 327155712 << ~215 + 1;
        ef = Long.reverse(-1616361373086014262L);
        eg = Long.reverse(0x2000000000000000L);
        eh = (0x50000000 >>> 121 | 0x50000000 << -121) & 0xFFFFFFFF;
        ei = Long.reverse(-3922204382299708214L);
        ej = (0x52000000 >>> 217 | 0x52000000 << -217) & 0xFFFFFFFF;
        ek = Long.reverse(-1616361373086014262L);
        el = Long.reverse(0x2000000000000000L);
        em = Integer.reverse(0x54000000);
        en = Long.reverse(-1616361373086014262L);
        eo = Long.reverse(0x2000000000000000L);
        ep = Integer.reverse(-738197504);
        eq = Integer.reverse(-1);
        er = Long.reverse(-3922204382299708214L);
        es = Integer.reverse(0x34000000);
        et = Integer.reverse(-1);
        eu = Long.reverse(-3922204382299708214L);
        ev = Integer.reverse(-1275068416);
        ew = Long.reverse(-1616361373086014262L);
        ex = Long.reverse(0x2000000000000000L);
        ey = Integer.reverse(0x74000000);
        ez = Integer.reverse(-1);
        fa = Long.reverse(-3922204382299708214L);
        fb = Integer.reverse(-201326592);
        fc = Long.reverse(-1616361373086014262L);
        fd = Long.reverse(0x2000000000000000L);
        fe = 0 >>> 161 | 0 << -161;
        ff = Integer.reverse(0);
        fg = (0 >>> 74 | 0 << -74) & 0xFFFFFFFF;
        fh = (2 >>> 97 | 2 << -97) & 0xFFFFFFFF;
        fi = Integer.reverse(Integer.MIN_VALUE);
        fj = Integer.reverse(Integer.MIN_VALUE);
        fk = Integer.reverse(Integer.MIN_VALUE);
        fl = (2 >>> 1 | 2 << -1) & 0xFFFFFFFF;
        fm = (384 >>> 131 | 384 << -131) & 0xFFFFFFFF;
        fn = -1 >>> 25 | -1 << -25;
        fo = Long.reverse(-3922204382299708214L);
        fp = Integer.reverse(-1946157056);
        fq = Long.reverse(-3922204382299708214L);
        fr = Integer.reverse(0);
        fs = (0x100000 >>> 148 | 0x100000 << -148) & 0xFFFFFFFF;
        ft = 131072 >>> 241 | 131072 << ~241 + 1;
        fu = Integer.reverse(0x4C000000);
        fv = Integer.reverse(-1);
        fw = Long.reverse(-3922204382299708214L);
        fx = 0x330000 >>> 80 | 0x330000 << ~80 + 1;
        fy = Integer.reverse(-1);
        fz = Long.reverse(-3922204382299708214L);
        ga = Integer.reverse(0);
        gb = (208 >>> 66 | 208 << ~66 + 1) & 0xFFFFFFFF;
        gc = Long.reverse(-3922204382299708214L);
        gd = (0x4000000D >>> 222 | 0x4000000D << ~222 + 1) & 0xFFFFFFFF;
        ge = Long.reverse(-1616361373086014262L);
        gf = Long.reverse(0x2000000000000000L);
        gg = (0x360000 >>> 208 | 0x360000 << -208) & 0xFFFFFFFF;
        gh = Long.reverse(-1616361373086014262L);
        gi = Long.reverse(0x2000000000000000L);
        gj = 0 >>> 134 | 0 << ~134 + 1;
        gk = Integer.reverse(-335544320);
        gl = (-1 >>> 36 | -1 << ~36 + 1) & 0xFFFFFFFF;
        gm = Long.reverse(-3922204382299708214L);
        gn = Integer.reverse(0x1C000000);
        go = Long.reverse(-1616361373086014262L);
        gp = Long.reverse(0x2000000000000000L);
        gq = Integer.reverse(0);
        gr = (58368 >>> 170 | 58368 << ~170 + 1) & 0xFFFFFFFF;
        gs = -1 >>> 100 | -1 << ~100 + 1;
        gt = Long.reverse(-3922204382299708214L);
        gu = (0x1D00000 >>> 147 | 0x1D00000 << -147) & 0xFFFFFFFF;
        gv = -1 >>> 126 | -1 << -126;
        gw = Long.reverse(-3922204382299708214L);
        gx = 0x3B0000 >>> 176 | 0x3B0000 << ~176 + 1;
        gy = Long.reverse(-3922204382299708214L);
        gz = Integer.reverse(0x3C000000);
        ha = (-1 >>> 166 | -1 << ~166 + 1) & 0xFFFFFFFF;
        hb = Long.reverse(-3922204382299708214L);
        hc = (-201326592 >>> 26 | -201326592 << -26) & 0xFFFFFFFF;
        hd = -1 >>> 133 | -1 << ~133 + 1;
        he = Long.reverse(-3922204382299708214L);
        hf = (248 >>> 66 | 248 << -66) & 0xFFFFFFFF;
        hg = Long.reverse(-3922204382299708214L);
        hh = (504 >>> 195 | 504 << -195) & 0xFFFFFFFF;
        hi = (2064384 >>> 175 | 2064384 << ~175 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[hh];
        var_java_lang_String_arr_b = new String[hi];
        NLoginCore_142.void_b();
    }

    public boolean ad() {
        if (this.ac()) {
            return bf != 0;
        }
        String string = this.M();
        return (string != null ? (!this.var_com_nickuc_login_NLoginInterface_011____c.s().equals(string) ? bg : bh) : (this.var_byte_a >= bi ? bj : bk)) != 0;
    }

    @Nullable
    public String N() {
        return (String)this.cfr_renamed_16.get(NLoginCore_142.c("㺀", (int)w, (long)(x ^ y)));
    }

    public String P() {
        String string = (String)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)ah, (long)(ai ^ aj)), NLoginCore_142.c("㺃", (int)(ak & al), (long)am));
        if (string != null && !string.isEmpty()) {
            return string;
        }
        NLoginCore_204 NLoginCore_2042 = this.com_nickuc_login_NLoginCore_204_b();
        return (String)NLoginCore_142.c("㺆", (int)an, (long)(ao ^ ap)) + this.var_com_nickuc_login_NLoginInterface_011____c.q() + (String)NLoginCore_142.c("㺉", (int)(aq & ar), (long)as) + NLoginCore_2042.getName();
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_142.c("㺀", (int)(gr & gs), (long)gt) + this.cfr_renamed_16 + (String)NLoginCore_142.c("㺃", (int)(gu & gv), (long)gw) + this.var_com_nickuc_login_NLoginCore_227_a + (String)NLoginCore_142.c("㺆", (int)gx, (long)gy) + this.ae() + (String)NLoginCore_142.c("㺉", (int)(gz & ha), (long)hb) + this.var_byte_a + (String)NLoginCore_142.c("㺌", (int)(hc & hd), (long)he) + this.var_byte_b + (String)NLoginCore_142.c("㺏", (int)hf, (long)hg);
    }

    public String Q() {
        String string = (String)this.cfr_renamed_16.getOrDefault(NLoginCore_142.c("㺀", (int)at, (long)(au ^ av)), NLoginCore_142.c("㺃", (int)aw, (long)(ax ^ ay)));
        if (string != null && !string.isEmpty()) {
            return string;
        }
        NLoginCore_204 NLoginCore_2042 = this.com_nickuc_login_NLoginCore_204_b();
        return (String)NLoginCore_142.c("㺆", (int)(az & ba), (long)bb) + this.var_com_nickuc_login_NLoginInterface_011____c.q() + (String)NLoginCore_142.c("㺉", (int)bc, (long)(bd ^ be)) + NLoginCore_2042.getName();
    }

    public <T> T b(String string, T t) {
        Object object = this.cfr_renamed_16.get((String)NLoginCore_142.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + string);
        return (T)(object != null ? object : t);
    }

    @Generated
    public boolean ae() {
        return this.V;
    }

    @Nullable
    public <T> T g(String string) {
        return this.b(string, null);
    }
}

