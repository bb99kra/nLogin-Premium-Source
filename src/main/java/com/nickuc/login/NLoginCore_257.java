/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_395;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_142;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

public class NLoginCore_257
implements NLoginCore_395,
NLoginCore_415 {
    private static int s;
    private static int h;
    private static int v;
    private static int ax;
    private static long p;
    private static int w;
    private static int ay;
    private static long ar;
    private static int q;
    private static int e;
    private static String[] var_java_lang_String_arr_b;
    private static int z;
    private static long aw;
    private static long c;
    private static long ae;
    private final NLoginCore_211 N;
    private static int as;
    private static long an;
    private static long ad;
    private static int au;
    private static long aq;
    private static int var_int_a;
    private static int am;
    private static int t;
    private static int ac;
    private static long al;
    private static long x;
    private static long ao;
    private static int av;
    private static int k;
    private static int af;
    private static long ah;
    private static long j;
    private static int bb;
    private static int bc;
    private static long f;
    private static long l;
    private static long d;
    private static int ba;
    private static long aa;
    private static long i;
    private static long aj;
    private static int az;
    private static int u;
    private static long y;
    private static long ag;
    private static int ai;
    private static int ap;
    private static int n;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_b;
    private static long g;
    private static long at;
    private static long o;
    private static int ak;
    private static long ab;
    private static int r;
    private static long m;

    private static void b() {
        int n;
        c = -8072066103545582236L;
        long l = c ^ 0x973C6E1B022B10E3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(4 + 65), (byte)(42 + 41), (byte)(30 + 17), (byte)(9 + 58), (byte)(20 + 46), (byte)(64 + 3), (byte)(46 + 1), 80, 75, (byte)(28 + 39), (byte)(52 + 31), (byte)(12 + 41), (byte)(45 + 35), (byte)(51 + 46), (byte)(66 + 34), (byte)(56 + 44), (byte)(64 + 41), (byte)(78 + 32), (byte)(64 + 39)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_257.var_java_lang_String_arr_b[0] = NLoginCore_173.E("֬ձջվց֌ֶ֣ղչֵր", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[1] = NLoginCore_559.C("՝ւ֎֤֏օ֥ֈեը֖ձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[2] = NLoginCore_091.B("ǤǛǨǒǏǯǧǤǥǩǆƿ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[3] = NLoginCore_091.C("֖֍֚քց֖֛֡֙֗ոձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[4] = NLoginCore_201.C("ծ֌֒֗՘ձւ֛գ֌֦ձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[5] = NLoginCore_027.E("֥֜֩֓֐ְ֥֦֪֨ևր", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[6] = NLoginCore_446.F("֬ձջվց֌ֶ֣ղչֵր", (byte)124, 70);
                    NLoginCore_257.var_java_lang_String_arr_b[7] = NLoginCore_076.A("ƫǐǜǲǝǓǳǖƳƶǤƿ", (byte)124, 65);
                    NLoginCore_257.var_java_lang_String_arr_b[8] = NLoginCore_384.C("չՠ֑֦տն֢և֋ժէձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[9] = NLoginCore_091.E("֢֬խ֮֬֓֩ծյլֵր", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[10] = NLoginCore_076.D("պպտջ֥ջտֆ։֖֬ձ", (byte)124, 68);
                    NLoginCore_257.var_java_lang_String_arr_b[11] = NLoginCore_091.E("֥֜֩֓֐ְ֥֦֪֨ևր", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[12] = NLoginCore_427.E("֬ձջվց֌ֶ֣ղչֵր", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[13] = NLoginCore_427.F("լֳִ֑֝֞֔֗մշ֥ր", (byte)124, 70);
                    NLoginCore_257.var_java_lang_String_arr_b[14] = NLoginCore_451.B("ǐǍǰǒƿưǱǈǃǉǰƿ", (byte)124, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_257.var_java_lang_String_arr_b[0] = NLoginCore_138.B("ǚƻǦǳǥǶǋǴǫǸǖƿ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ƽƱǥǌǟǭǗǶǘƯǬƿ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ǇǧǂǍƳƿǌǃǌƯƬǵƷǸǹǲǳƸƻƻǾǍǊǋ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[3] = NLoginCore_451.C("֏֘սբվ֖֑֘ղ֪֢֪֡պօ֣֝֎֑֥֟֏ռս", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[4] = NLoginCore_223.F("֝ջւ֟֌֊ֱ֨մ֊֛֚սմַ֭֭֠֕֓֘ׄ֋֌", (byte)124, 70);
                    NLoginCore_257.var_java_lang_String_arr_b[5] = NLoginCore_027.C("ա֚֒ռ՘պռո֚֔յց֦կֈգ֤֫խֆ֪տռս", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[6] = NLoginCore_223.B("ƸǛƲưǎǎǤƶǱǰƱƿ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[7] = NLoginCore_223.D("֜֜ճր֘կ֖մպ֗ռձ", (byte)124, 68);
                    NLoginCore_257.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ǢǦǰƪǰǏǨǌǣǭƹƿ", (byte)124, 65);
                    NLoginCore_257.var_java_lang_String_arr_b[9] = NLoginCore_027.F("չըֳ֤ր֯֐ժֹֹ֋ր", (byte)124, 70);
                    NLoginCore_257.var_java_lang_String_arr_b[10] = NLoginCore_091.B("ǉǞǞǴǝǓǮǬǘǵǰƿ", (byte)124, 66);
                    NLoginCore_257.var_java_lang_String_arr_b[11] = NLoginCore_138.E("ռְֱ֢֝ր֘ժ֤֚և֑ռ֑֋ְָׂրְֲִ֋֌", (byte)124, 69);
                    NLoginCore_257.var_java_lang_String_arr_b[12] = NLoginCore_091.C("ցա֜՗֝օ֖օ֡չֈձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[13] = NLoginCore_324.C("֖֢֥֕ղեմֈփ֓րձ", (byte)124, 67);
                    NLoginCore_257.var_java_lang_String_arr_b[14] = NLoginCore_446.E("֑ղֳ֌֖֪֕ղ֧֚չմ֐ոֲִׁ֪־ִ֯ׄ֋֌", (byte)124, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_257.var_java_lang_String_arr_b[0] = NLoginCore_387.E("֋ֵ֦֬֠հ֫ւֱ֤֘մն։պֹֽׁ֏ּ֏ׄ֋֌", (byte)124, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_257.var_java_lang_String_arr_b[0] = NLoginCore_223.D("՟չ՝֗հ՟֠ւբյ֌֣ց֯֬֊֐ֲ֎ֵ֢֮ռս", (byte)124, 68);
                }
            }
        }
    }

    @Override
    public boolean boolean_at() {
        return ba != 0;
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.N;
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        NLoginCore_142 NLoginCore_1422 = NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a();
        return this.a(NLoginCore_1422, (String)(NLoginCore_5092.j() ? NLoginCore_257.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) : NLoginCore_257.c("㺃", (int)e, (long)(f ^ g))));
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2789291119303876593L);
        d = Long.reverse(-5476377146882523136L);
        e = 2048 >>> 107 | 2048 << -107;
        f = Long.reverse(2789291119303876593L);
        g = Long.reverse(-5476377146882523136L);
        h = (128 >>> 166 | 128 << -166) & 0xFFFFFFFF;
        i = Long.reverse(2789291119303876593L);
        j = Long.reverse(-5476377146882523136L);
        k = (98304 >>> 47 | 98304 << ~47 + 1) & 0xFFFFFFFF;
        l = Long.reverse(2789291119303876593L);
        m = Long.reverse(-5476377146882523136L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(2789291119303876593L);
        p = Long.reverse(-5476377146882523136L);
        q = -1 >>> 153 | -1 << ~153 + 1;
        r = (-1 >>> 47 | -1 << ~47 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(0x26000000);
        t = 524288 >>> 19 | 524288 << -19;
        u = Integer.reverse(0);
        v = 0 >>> 64 | 0 << ~64 + 1;
        w = -2147483646 >>> 127 | -2147483646 << ~127 + 1;
        x = Long.reverse(2789291119303876593L);
        y = Long.reverse(-5476377146882523136L);
        z = (0x6000000 >>> 120 | 0x6000000 << ~120 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(2789291119303876593L);
        ab = Long.reverse(-5476377146882523136L);
        ac = Integer.reverse(-536870912);
        ad = Long.reverse(2789291119303876593L);
        ae = Long.reverse(-5476377146882523136L);
        af = Integer.reverse(0x10000000);
        ag = Long.reverse(2789291119303876593L);
        ah = Long.reverse(-5476377146882523136L);
        ai = Integer.reverse(-1879048192);
        aj = Long.reverse(-7875232798309457935L);
        ak = Integer.reverse(0x50000000);
        al = Long.reverse(-7875232798309457935L);
        am = 22528 >>> 203 | 22528 << -203;
        an = Long.reverse(2789291119303876593L);
        ao = Long.reverse(-5476377146882523136L);
        ap = Integer.reverse(0x30000000);
        aq = Long.reverse(2789291119303876593L);
        ar = Long.reverse(-5476377146882523136L);
        as = (425984 >>> 143 | 425984 << -143) & 0xFFFFFFFF;
        at = Long.reverse(-7875232798309457935L);
        au = (0x1C0000 >>> 145 | 0x1C0000 << ~145 + 1) & 0xFFFFFFFF;
        av = Integer.reverse(-1);
        aw = Long.reverse(-7875232798309457935L);
        ax = (0x200000 >>> 21 | 0x200000 << -21) & 0xFFFFFFFF;
        ay = Integer.reverse(0);
        az = Integer.reverse(0);
        ba = Integer.reverse(0);
        bb = (-268435456 >>> 252 | -268435456 << -252) & 0xFFFFFFFF;
        bc = Integer.reverse(-268435456);
        var_java_lang_String_arr_a = new String[bb];
        var_java_lang_String_arr_b = new String[bc];
        NLoginCore_257.b();
    }

    private boolean a(NLoginCore_142 NLoginCore_1422, String string) {
        String string2 = (String)NLoginCore_1422.g((String)NLoginCore_257.c("㺀", (int)h, (long)(i ^ j)) + string);
        if (string2 != null && !string2.isEmpty()) {
            int n = NLoginCore_449.a((String)NLoginCore_1422.g((String)NLoginCore_257.c("㺃", (int)k, (long)(l ^ m)) + string + (String)NLoginCore_257.c("㺆", (int)NLoginCore_257.n, (long)(o ^ p))), (Integer)q);
            return (n == r || NLoginCore_354.a().nextInt(s) <= n ? t : u) != 0;
        }
        return v != 0;
    }

    @Override
    public boolean c(NLoginType_008 NLoginType_008) {
        return az != 0;
    }

    private static String a(int n, long l) {
        l ^= 0x2DL;
        l ^= 0x973C6E1B022B10E3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(33 + 36), (byte)(47 + 36), (byte)(5 + 42), (byte)(64 + 3), (byte)(34 + 32), (byte)(36 + 31), (byte)(8 + 39), (byte)(65 + 15), (byte)(68 + 7), (byte)(2 + 65), (byte)(19 + 64), (byte)(43 + 10), (byte)(34 + 46), (byte)(96 + 1), 100, (byte)(10 + 90), (byte)(71 + 34), (byte)(33 + 77), (byte)(17 + 86)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.D("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹ࡟ࢉ࡭ࢅ࢔࢒ࢅࡻ࡮ࢆ࢙ࡼࢗ", (byte)87, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_257.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_257.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_324.C("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)104, 67), NLoginCore_257.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.C("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬ࢒ࢼࢠࢸࣇࣅࢸࢮࢡࢹ࣌ࢯ࣊Յ", (byte)104, 67) + string + NLoginCore_575.C("ԧ", (byte)104, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_257(NLoginCore_211 NLoginCore_211) {
        this.N = NLoginCore_211;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_142 NLoginCore_1422 = NLoginType_008.com_nickuc_login_NLoginCore_227_a().com_nickuc_login_NLoginCore_142_a();
        boolean bl = NLoginCore_5092.j();
        String string = (String)NLoginCore_1422.b((String)NLoginCore_257.c("㺀", (int)w, (long)(x ^ y)) + (String)(bl ? NLoginCore_257.c("㺃", (int)z, (long)(aa ^ ab)) : NLoginCore_257.c("㺆", (int)ac, (long)(ad ^ ae))), NLoginCore_257.c("㺉", (int)af, (long)(ag ^ ah)));
        String string2 = NLoginCore_065.q(NLoginCore_158.u(string).replace((CharSequence)NLoginCore_257.c("㺌", (int)ai, (long)aj), (CharSequence)NLoginCore_257.c("㺏", (int)ak, (long)al)));
        String string3 = (String)NLoginCore_1422.g((String)NLoginCore_257.c("㺒", (int)am, (long)(an ^ ao)) + (String)(bl ? NLoginCore_257.c("㺕", (int)ap, (long)(aq ^ ar)) : NLoginCore_257.c("㺘", (int)as, (long)at)) + (String)NLoginCore_257.c("㺛", (int)(au & av), (long)aw));
        if (string3 != null && !string3.isEmpty()) {
            NLoginInterface_0242.c(string2, NLoginCore_158.u(string3));
        } else {
            NLoginInterface_0242.a(string2);
        }
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[ax];
        NLoginCore_445Array[NLoginCore_257.ay] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }
}

