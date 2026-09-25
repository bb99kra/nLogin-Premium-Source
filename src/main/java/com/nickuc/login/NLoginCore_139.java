/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_043;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_139
implements NLoginCore_249,
NLoginCore_415 {
    private final NLoginCore_211 var_com_nickuc_login_NLoginCore_211_aa;
    private static int o;
    private static int t;
    private static int ad;
    private static int ag;
    private static int aj;
    private static int w;
    private static long d;
    private static int p;
    private static long af;
    private static int v;
    private static long h;
    private static long k;
    private static String[] var_java_lang_String_arr_a;
    private static long q;
    private static long var_long_b;
    private static int ab;
    private static int var_int_a;
    private static long y;
    private static int x;
    private static long ac;
    private static int i;
    private static String[] var_java_lang_String_arr_b;
    private static long ah;
    private static int al;
    private static int r;
    private static int ae;
    private static int am;
    private static long c;
    private static int ai;
    private static long j;
    private static long f;
    private final String bW;
    private static int g;
    private static int s;
    private static int l;
    private static int var_int_aa;
    private static int an;
    private static long n;
    private static int e;
    private static int z;
    private static long ak;
    private static int u;
    private static long m;

    @Generated
    public NLoginCore_139(NLoginCore_211 NLoginCore_211, String string) {
        this.var_com_nickuc_login_NLoginCore_211_aa = NLoginCore_211;
        this.bW = string;
    }

    private static String a(int n, long l) {
        l ^= 0x52L;
        l ^= 0x2C2ADF896D551D97L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(35 + 33), (byte)(38 + 31), (byte)(36 + 47), (byte)(33 + 14), (byte)(12 + 55), (byte)(50 + 16), (byte)(57 + 10), (byte)(32 + 15), (byte)(43 + 37), 75, (byte)(4 + 63), (byte)(51 + 32), (byte)(34 + 19), (byte)(5 + 75), (byte)(95 + 2), (byte)(12 + 88), (byte)(34 + 66), (byte)(104 + 1), (byte)(66 + 44), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("լչոԻջշղջֆյՂրքսրֆՈ࣐ࣤࢼࣩࣜࣘࣜࣜࣨࢶࣩࣤࣘࣛࣨ", (byte)77, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_139.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        Object object;
        Object object2;
        Object object3;
        if (NLoginCore_5092.j()) {
            object3 = NLoginCore_139.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
            object2 = NLoginCore_139.c("㺃", (int)e, (long)f);
            object = NLoginCore_139.c("㺆", (int)g, (long)h);
        } else {
            object3 = NLoginCore_139.c("㺉", (int)i, (long)(j ^ k));
            object2 = NLoginCore_139.c("㺌", (int)l, (long)(m ^ n));
            object = NLoginCore_139.c("㺏", (int)(o & p), (long)q);
        }
        this.b(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242);
        GUIButtonContainer[] GUIButtonContainerArray = new GUIButtonContainer[r];
        GUIButtonContainerArray[NLoginCore_139.s] = new GUIButtonContainer(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_o, new NLoginCore_190((String)object3, (String)object));
        GUIButtonContainerArray[NLoginCore_139.t] = new GUIButtonContainer(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c, new NLoginCore_190((String)object2, null));
        return GUIButtonContainerArray;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2912031429722332773L);
        d = Long.reverse(0x4A00000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(7091371883922153061L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(7091371883922153061L);
        i = (0x180000 >>> 211 | 0x180000 << ~211 + 1) & 0xFFFFFFFF;
        j = Long.reverse(2912031429722332773L);
        k = Long.reverse(0x4A00000000000000L);
        l = Integer.reverse(0x20000000);
        m = Long.reverse(2912031429722332773L);
        n = Long.reverse(0x4A00000000000000L);
        o = 40960 >>> 237 | 40960 << -237;
        p = Integer.reverse(-1);
        q = Long.reverse(7091371883922153061L);
        r = 2048 >>> 42 | 2048 << ~42 + 1;
        s = (0 >>> 166 | 0 << ~166 + 1) & 0xFFFFFFFF;
        t = Integer.reverse(Integer.MIN_VALUE);
        u = 16384 >>> 237 | 16384 << -237;
        v = Integer.reverse(0);
        w = (24 >>> 226 | 24 << -226) & 0xFFFFFFFF;
        x = -1 >>> 51 | -1 << -51;
        y = Long.reverse(7091371883922153061L);
        z = 1024 >>> 138 | 1024 << ~138 + 1;
        var_int_aa = (-1073741823 >>> 30 | -1073741823 << -30) & 0xFFFFFFFF;
        ab = Integer.reverse(-1);
        ac = Long.reverse(7091371883922153061L);
        ad = (2048 >>> 40 | 2048 << -40) & 0xFFFFFFFF;
        ae = (-1 >>> 239 | -1 << -239) & 0xFFFFFFFF;
        af = Long.reverse(7091371883922153061L);
        ag = (0x12000000 >>> 89 | 0x12000000 << -89) & 0xFFFFFFFF;
        ah = Long.reverse(7091371883922153061L);
        ai = Integer.reverse(0x50000000);
        aj = (-1 >>> 134 | -1 << -134) & 0xFFFFFFFF;
        ak = Long.reverse(7091371883922153061L);
        al = Integer.reverse(0);
        am = 0x60000001 >>> 61 | 0x60000001 << ~61 + 1;
        an = Integer.reverse(-805306368);
        var_java_lang_String_arr_a = new String[am];
        var_java_lang_String_arr_b = new String[an];
        NLoginCore_139.b();
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.var_com_nickuc_login_NLoginCore_211_aa;
    }

    @Generated
    public String java_lang_String_at() {
        return this.bW;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_139.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ëčďïēĲĪŀĬûĹįĽķĀĥŇņľńľē", (byte)34, 65), NLoginCore_139.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.F("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢥࢹ࢑ࢱࢭࢱࢱࢾࢽࢋࢾࢹࢭࢰࢽԸ", (byte)34, 70) + string + NLoginCore_384.D("ѕ", (byte)34, 68) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = -6450567572848273900L;
        long l = c ^ 0x2C2ADF896D551D97L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(66 + 3), (byte)(58 + 25), (byte)(19 + 28), (byte)(50 + 17), (byte)(43 + 23), (byte)(65 + 2), (byte)(29 + 18), (byte)(36 + 44), (byte)(32 + 43), (byte)(60 + 7), (byte)(53 + 30), (byte)(20 + 33), (byte)(26 + 54), (byte)(32 + 65), (byte)(70 + 30), (byte)(60 + 40), 105, (byte)(97 + 13), (byte)(48 + 55)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
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
                    NLoginCore_139.var_java_lang_String_arr_b[0] = NLoginCore_173.B("ÑýĎĆėàĎîóĄúúĎĖĈïðÛ÷ýòáôğäĆĝĥýëûĉ", (byte)13, 66);
                    NLoginCore_139.var_java_lang_String_arr_b[1] = NLoginCore_559.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâßĈĂĖćĦèāĪĐñ", (byte)13, 65);
                    NLoginCore_139.var_java_lang_String_arr_b[2] = NLoginCore_027.E("ԴՀԤ԰԰ԆԾԥՈԋԋԹՂՌԣԌԾՊՈԳԷԎԤԮԤԒԖԭԚԗ՟ՐԾաԸեՑբ՘ՃԩԦՉեԼԾՏիՀՐԴգճՃգԲԺծն՚ըշվղիպճՃգԿԾեՂ֌լՑ", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐÚĄĈĩīĢīĘĝĦ", (byte)13, 65);
                    NLoginCore_139.var_java_lang_String_arr_b[4] = NLoginCore_223.E("ԽԲԣԸՄԕԆԓԂԣՀԶԼՏԤԞԧԳԋԫԫՕԜԝ", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[5] = NLoginCore_173.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ԰ԮՉՋծբլբՁՊբԹձԻՆԻՖՍրՒմգսևցրֆլըՑ", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[6] = NLoginCore_201.C("ГзыжиЌЫгЫїОФ", (byte)13, 67);
                    NLoginCore_139.var_java_lang_String_arr_b[7] = NLoginCore_324.E("ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ԰԰ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ԰ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ֋շզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփ֢֤֨֓׀ևׁׅ֚֩֞־ׇ֐ֱ֯֜֝", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[8] = NLoginCore_092.B("àĎßôĉîąãÔăóďïíþĠđßğĖÝĈðèĨĠĊĄĀĘĎĐ", (byte)13, 66);
                    NLoginCore_139.var_java_lang_String_arr_b[9] = NLoginCore_076.C("пЈъйгуіКѝлЫоЙўЮгђИдРчвЯа", (byte)13, 67);
                    NLoginCore_139.var_java_lang_String_arr_b[10] = NLoginCore_201.D("ГчЦЭЧчиљєгчѓЗжСодљѨѐетедѤцЩйѢѬсѤъѤгљѹзѤѷъїѱф", (byte)13, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_139.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ДрёщњУёбжчннёљывгОкреѩѬѭѢўћѩѩѤќѦ", (byte)13, 67);
                    NLoginCore_139.var_java_lang_String_arr_b[1] = NLoginCore_559.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâÝüĔğù÷ĭĮĦęĥ", (byte)13, 65);
                    NLoginCore_139.var_java_lang_String_arr_b[2] = NLoginCore_076.C("чѓзууЙёићООьѕџжПёѝћцъСзсзХЩрЭЪѲѣёѴыѸѤѵѫімйќѸяёѢѾѓѣчѶ҆іѶхэҁ҉ѭѻҊґ҅ҒшҔѢѰҊѩҍҏҋҏѳҍҔљҌѥѝҜѣҝ҂ѯѰ", (byte)13, 67);
                    NLoginCore_139.var_java_lang_String_arr_b[3] = NLoginCore_223.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐúėėýģãĉîāć", (byte)13, 65);
                    NLoginCore_139.var_java_lang_String_arr_b[4] = NLoginCore_201.C("ѐхжыїШЙЦЕжёНЪЪУгўОџцѓеЧоыюѬѯЮЬюо", (byte)13, 67);
                    NLoginCore_139.var_java_lang_String_arr_b[5] = NLoginCore_324.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ԰ԮՉՋծբլբՁՊբԹձԻՆԻՖՍփՓՠՏէդՕՆՁէ՜Ց", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[6] = NLoginCore_138.E("ԝԛԻԤՀԇԞԇՉԜԟՈԼԛԜԎՊԑՑԬՇԯԜԝ", (byte)13, 69);
                    NLoginCore_139.var_java_lang_String_arr_b[7] = NLoginCore_091.F("ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ԰԰ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ԰ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ֋շզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփׁ֢֤֨֓־֡ցׂ֣֞֠ׄ׃֔֟֜֝", (byte)13, 70);
                    NLoginCore_139.var_java_lang_String_arr_b[8] = NLoginCore_004.F("ԐԾԏԤԹԞԵԓԄԳԣԿԟԝԮՐՁԏՏՆԍՀՌԸՉԱԸԹՋԜՑՙԸՐԹդԝզԷՁԷԷԣԱ", (byte)13, 70);
                    NLoginCore_139.var_java_lang_String_arr_b[9] = NLoginCore_076.B("üÅćöðĀē×ĚøêÝďĝĕĀâãĎðĞÿìí", (byte)13, 66);
                    NLoginCore_139.var_java_lang_String_arr_b[10] = NLoginCore_201.B("ÐĄãêäĄõĖđðĄĐÔóÞûñĖĥčòÿòñġăæöğĩþġĠþĩąôĊðĦěúęóĪļĠĔŃþĵŁĤğČč", (byte)13, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_139.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ԾԖՂԤԿԜԥԧԤԻԣԼԇԛԜԝՏԧԮԑՃԯԜԝ", (byte)13, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_139.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ԿԙԟԢԝӾԑӿԢՆԔԑ", (byte)13, 69);
                }
            }
        }
    }

    public abstract void b(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4);

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        if (NLoginCore_4452 == NLoginCore_445.var_com_nickuc_login_NLoginCore_445_o) {
            NLoginCore_043 NLoginCore_0432 = (NLoginCore_043)NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b.a();
            try {
                String[] stringArray = new String[u];
                stringArray[NLoginCore_139.v] = NLoginCore_139.c("㺀", (int)(w & x), (long)y);
                stringArray[NLoginCore_139.z] = this.bW;
                NLoginCore_0432.a(NLoginCore_277, NLoginCore_0432.aa(), stringArray);
            }
            catch (Exception exception) {
                NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a().a((String)NLoginCore_139.c("㺃", (int)(var_int_aa & ab), (long)ac));
                NLoginCore_370.c((String)NLoginCore_139.c("㺆", (int)(ad & ae), (long)af) + NLoginCore_0432.aa().toLowerCase(Locale.ENGLISH) + (String)NLoginCore_139.c("㺉", (int)ag, (long)ah) + NLoginCore_277.getName() + (String)NLoginCore_139.c("㺌", (int)(ai & aj), (long)ak), exception, new Object[al]);
            }
        }
        NLoginCore_249.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
    }
}

