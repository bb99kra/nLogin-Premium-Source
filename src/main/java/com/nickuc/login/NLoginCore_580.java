/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_519;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_102;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_249;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_360;
import com.nickuc.login.NLoginCore_316;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_580
implements NLoginCore_249,
NLoginCore_415 {
    private static long as;
    private static long r;
    private static int ad;
    private static int ai;
    private static long l;
    private static int var_int_c;
    private static int j;
    private static long aq;
    private static long var_long_c;
    private static long n;
    private static int w;
    private static int av;
    private static int ac;
    private static int ab;
    private static int e;
    private static long ap;
    private static long aa;
    private static int var_int_a;
    private final NLoginCore_211 Y;
    private static int am;
    private static long ae;
    private static int var_int_b;
    private static int v;
    private static long f;
    private static int at;
    private static int x;
    private static int m;
    private static int ao;
    private static int s;
    private static int i;
    private static int y;
    private static int ar;
    private static long ag;
    private static long z;
    private static String[] var_java_lang_String_arr_b;
    private static int t;
    private static int au;
    private static int p;
    private static long g;
    private static long ah;
    private static long aj;
    private static int u;
    private static long an;
    private static int d;
    private static int aw;
    private static int h;
    private static long q;
    private static int af;
    private static long ak;
    private static long o;
    private static int al;
    private static String[] var_java_lang_String_arr_a;
    private static long k;

    @Override
    public void a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242, NLoginCore_445 NLoginCore_4452) {
        switch (NLoginCore_360.B[NLoginCore_4452.ordinal()]) {
            case 1: {
                this.d(NLoginType_008, NLoginCore_277, NLoginCore_5092);
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.p, new Object[v]);
                NLoginCore_249.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
                break;
            }
            case 2: {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.p, new Object[w]);
                NLoginCore_249.super.a(NLoginType_008, NLoginCore_277, NLoginCore_5092, NLoginInterface_0242, NLoginCore_4452);
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x70L;
        l ^= 0x6D5527CC59D79AC1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(63 + 6), (byte)(35 + 48), (byte)(26 + 21), (byte)(11 + 56), (byte)(25 + 41), (byte)(11 + 56), (byte)(40 + 7), (byte)(23 + 57), (byte)(61 + 14), (byte)(64 + 3), (byte)(80 + 3), (byte)(8 + 45), (byte)(35 + 45), (byte)(77 + 20), (byte)(57 + 43), (byte)(77 + 23), (byte)(79 + 26), 110, 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(66 + 3), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.A("ƂƏƎőƑƍƈƑƜƋŘƖƚƓƖƜŞӐӤӰӫӱӝӖӝӼӽӝӼ", (byte)80, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_580.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 8101064159325726923L;
        long l = var_long_c ^ 0x6D5527CC59D79AC1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(35 + 34), (byte)(67 + 16), (byte)(9 + 38), (byte)(22 + 45), (byte)(8 + 58), (byte)(23 + 44), (byte)(43 + 4), (byte)(77 + 3), (byte)(13 + 62), 67, (byte)(48 + 35), (byte)(33 + 20), (byte)(18 + 62), (byte)(3 + 94), (byte)(93 + 7), (byte)(26 + 74), (byte)(80 + 25), (byte)(109 + 1), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
                    NLoginCore_580.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ԢԝՖՋՖԦԯՓ՝ԴԫԱՒԫՍդԮդ՘ըԲՇ՚ԩ՛ՈԺթբ՞Մ՞ՑԭՈոՃ՚ՖԻՇԹխԽՀՖՌԻՏշՆձմ՚՘օՌվ֎ժժ՝ըզ֋֎֌խֈ֌Ռժռ֕֞Ցռ֢՝֣֢֞չո֛ֈ֋֞֝֎֗֬֊֯ըե֦ղ֏֏֤֬֫ճշַ֑֮֔֕ջ֠ցֶ֚׀և֡֎֏", (byte)98, 67);
                    NLoginCore_580.var_java_lang_String_arr_b[1] = NLoginCore_427.F("ձեժջ֊֗Տձ֝֎յզ", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ղֈ֑ջֈթՔհֈճ֓զ", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[3] = NLoginCore_453.F("եՠ֙֎֙թղ֖֠շծմ֕ծ֐֧ձ֧֛֫յ֊֝լ֞֋ս֥֬֡և֡֔հ֋ֻֆ֝֙վ֊ռְրփ֙֏վֺ֒։ִַ֛֝׈֏ׁב֭֭֠֫֩׎ב׏ְ׋׏֏ֿ֭טן֬דגֱֵ֮֞טשו׫׃ׁׅ֮׍ץׄדׂ־׌גׯֳו׮׫ֽׯ׫ּ׆", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ƄƶƐƋƈƗƕǃƒǄƼƋ", (byte)98, 66);
                    NLoginCore_580.var_java_lang_String_arr_b[5] = NLoginCore_027.F("եզւ֑֙֕ստխ֚ծջ֑՞աւ՝֨վև֪֕ձղ", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[6] = NLoginCore_076.F("ՉՑ֛֒՘֛։զև֔՜զ", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ԦՎԧՃՂՍՊՈԫԵ԰ՙԱԴՏ՗՚ԞՓՐԣԱԮԯ", (byte)98, 67);
                    NLoginCore_580.var_java_lang_String_arr_b[8] = NLoginCore_453.C("ՄՇՒՕՕՆ՚ԦՏՒՌՎ՜ՂԚԜԡԱաՏՆ՗Ԯԯ", (byte)98, 67);
                    NLoginCore_580.var_java_lang_String_arr_b[9] = NLoginCore_223.A("ŮŽŸƷƨƮƜŽưƥơƁǇƂƈƕƫƹƪƾƜƩƖƗ", (byte)98, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_580.var_java_lang_String_arr_b[0] = NLoginCore_451.F("եՠ֙֎֙թղ֖֠շծմ֕ծ֐֧ձ֧֛֫յ֊֝լ֞֋ս֥֬֡և֡֔հ֋ֻֆ֝֙վ֊ռְրփ֙֏վֺ֒։ִַ֛֝׈֏ׁב֭֭֠֫֩׎ב׏ְ׋׏֏ֿ֭טסֿ֔ץ֠סצץֻּמ׋׎סנבךׯ׍ײ֫֨שֵגגקׯ׮ֶֺהז؃׼׽עע؃ץ׹ׁׅ׺בג", (byte)98, 70);
                    NLoginCore_580.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ԫՒԎՁՈՊՃԥՄՊԗՒՖԱՎԷ՘՛ՑԥԿ՗Ԯԯ", (byte)98, 67);
                    NLoginCore_580.var_java_lang_String_arr_b[2] = NLoginCore_427.A("ƍŸƪűƋơƑƺƶƻƷƿƽƩƒƧƖǊǆƩǃƿƖƗ", (byte)98, 65);
                    NLoginCore_580.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ƊƅƾƳƾƎƗƻǅƜƓƙƺƓƵǌƖǌǀǐƚƯǂƑǃưƢǑǊǆƬǆƹƕưǠƫǂƾƣƯơǕƥƨƾƴƣƷǟƮǙǜǂǀǭƴǦǶǒǒǅǐǎǳǶǴǕǰǴƴǒǤǽȄǑǸǷǖǓǃǚǽȎǺȐǨǓǪǦǲȊǩǸǧǣȉǺȕǑǨǝȜǹȥȢǵǠȜȂȉȁǶǩǧșǹȉǶǷ", (byte)98, 65);
                    NLoginCore_580.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ƧƞƫƯƸŸŸŵƟƂƔƨǉŻƛƓƘƻƈƭǇƩƖƗ", (byte)98, 66);
                    NLoginCore_580.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ƊƋƧƾƶƺƢƤƒƿƕƖƂƠƅƵơǇƪƉƟǏƖƗ", (byte)98, 65);
                    NLoginCore_580.var_java_lang_String_arr_b[6] = NLoginCore_091.E("փ֎ՙըջե՘֜ծ֔֟զ", (byte)98, 69);
                    NLoginCore_580.var_java_lang_String_arr_b[7] = NLoginCore_384.A("ƎƶƏƫƪƵƲưƓƝƘƓƳǀƾƬǇƋƥǈǈƙƖƗ", (byte)98, 65);
                    NLoginCore_580.var_java_lang_String_arr_b[8] = NLoginCore_091.C("ՄՇՒՕՕՆ՚ԦՏՒՎՋ՜աԱ՜ՃՖՙԡՠ՗Ԯԯ", (byte)98, 67);
                    NLoginCore_580.var_java_lang_String_arr_b[9] = NLoginCore_091.E("Չ՘Փ֒փ։շ՘֋րպր֐֥֚֞ձ։֥֥փք֪֚֍խ։֍լ֧֭֓", (byte)98, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_580.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ՅՍԕԦՎԯՇԦԴԨԭԑ՚ՁՓՏԳԣԶԳթ՗Ԯԯ", (byte)98, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_580.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ưưŶƿƿưžƻƙƵƠƻƄƽƻƩƠǁǁƿƍǏƖƗ", (byte)98, 65);
                }
            }
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (!NLoginType_008.com_nickuc_login_NLoginCore_495_a().q()) {
            return var_int_a != 0;
        }
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_b();
        if (NLoginCore_0552 == NLoginCore_150.c()) {
            return var_int_b != 0;
        }
        return (NLoginCore_0552 != null && NLoginCore_0552 != NLoginCore_055.var_com_nickuc_login_NLoginCore_055_x ? var_int_c : d) != 0;
    }

    static {
        var_int_a = 0 >>> 88 | 0 << -88;
        var_int_b = 0 >>> 14 | 0 << -14;
        var_int_c = 0x4000000 >>> 186 | 0x4000000 << ~186 + 1;
        d = Integer.reverse(0);
        e = 0 >>> 8 | 0 << ~8 + 1;
        f = Long.reverse(-3236888571482524146L);
        g = Long.reverse(0xE00000000000000L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (0 >>> 66 | 0 << ~66 + 1) & 0xFFFFFFFF;
        j = (Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255) & 0xFFFFFFFF;
        k = Long.reverse(-3236888571482524146L);
        l = Long.reverse(0xE00000000000000L);
        m = 4096 >>> 235 | 4096 << -235;
        n = Long.reverse(-3236888571482524146L);
        o = Long.reverse(0xE00000000000000L);
        p = (262144 >>> 210 | 262144 << ~210 + 1) & 0xFFFFFFFF;
        q = Long.reverse(0x2800000000000000L);
        r = Long.reverse(0x2800000000000000L);
        s = 4 >>> 65 | 4 << ~65 + 1;
        t = 0 >>> 239 | 0 << -239;
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(0);
        w = 0 >>> 251 | 0 << ~251 + 1;
        x = Integer.reverse(0);
        y = (-1073741824 >>> 254 | -1073741824 << -254) & 0xFFFFFFFF;
        z = Long.reverse(-3236888571482524146L);
        aa = Long.reverse(0xE00000000000000L);
        ab = Integer.reverse(0);
        ac = (2 >>> 31 | 2 << -31) & 0xFFFFFFFF;
        ad = Integer.reverse(-1);
        ae = Long.reverse(-2516312631103244786L);
        af = (0x5000000 >>> 56 | 0x5000000 << ~56 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(-3236888571482524146L);
        ah = Long.reverse(0xE00000000000000L);
        ai = (3 >>> 63 | 3 << ~63 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(-3236888571482524146L);
        ak = Long.reverse(0xE00000000000000L);
        al = 896 >>> 231 | 896 << ~231 + 1;
        am = -1 >>> 230 | -1 << -230;
        an = Long.reverse(-2516312631103244786L);
        ao = Integer.reverse(0x10000000);
        ap = Long.reverse(-3236888571482524146L);
        aq = Long.reverse(0xE00000000000000L);
        ar = 147456 >>> 174 | 147456 << -174;
        as = Long.reverse(-2516312631103244786L);
        at = Integer.reverse(0);
        au = Integer.reverse(0);
        av = (160 >>> 164 | 160 << ~164 + 1) & 0xFFFFFFFF;
        aw = 20 >>> 97 | 20 << -97;
        var_java_lang_String_arr_a = new String[av];
        var_java_lang_String_arr_b = new String[aw];
        NLoginCore_580.b();
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.Y;
    }

    private void d(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_b();
        if (NLoginCore_0552 == null) {
            throw new IllegalStateException((String)NLoginCore_580.c("㺀", (int)y, (long)(z ^ aa)));
        }
        if (NLoginCore_150.c() == NLoginCore_0552) {
            return;
        }
        if (!NLoginType_008.com_nickuc_login_NLoginCore_495_a().p()) {
            NLoginCore_519.a(NLoginType_008, null, ab != 0);
        }
        NLoginType_008.com_nickuc_login_NLoginCore_219_a().Y();
        File file = new File(NLoginType_008.java_io_File_c(), (String)NLoginCore_580.c("㺃", (int)(ac & ad), (long)ae));
        new File(file, (String)NLoginCore_580.c("㺆", (int)af, (long)(ag ^ ah))).delete();
        File file2 = new File(file, (String)NLoginCore_580.c("㺉", (int)ai, (long)(aj ^ ak)));
        new File(file2, (String)NLoginCore_580.c("㺌", (int)(al & am), (long)an)).delete();
        new File(file2, (String)NLoginCore_580.c("㺏", (int)ao, (long)(ap ^ aq))).delete();
        NLoginCore_195.a(NLoginType_008, NLoginType_008.com_nickuc_login_NLoginCore_219_a(), (String)NLoginCore_580.c("㺒", (int)ar, (long)as), NLoginCore_0552, at != 0);
        BCryptHashProvider.a(NLoginType_008);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_580.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.A("őųŵŕŹƘƐƦƒšƟƕƣƝŦƋƭƬƤƪƤŹ", (byte)85, 65), NLoginCore_580.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_173.D("ԗԤԣӦԦԢԝԦԱԠӭԫԯԨԫԱӳࡥࡹࢅࢀࢆࡲ࡫ࡲ࢑࢒ࡲ࢑ԋ", (byte)85, 68) + string + NLoginCore_173.E("Ջ", (byte)85, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_580(NLoginCore_211 NLoginCore_211) {
        this.Y = NLoginCore_211;
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_b();
        if (NLoginCore_0552 == null) {
            throw new IllegalStateException((String)NLoginCore_580.c("㺀", (int)e, (long)(f ^ g)));
        }
        NLoginCore_150.a(NLoginType_008, NLoginCore_0552);
        NLoginCore_316 NLoginCore_3162 = NLoginCore_150.a(NLoginCore_0552);
        Object[] objectArray = new Object[h];
        objectArray[NLoginCore_580.i] = NLoginCore_112.y(NLoginCore_0552.u());
        List<String> list = NLoginCore_3162.a(NLoginCore_397.var_com_nickuc_login_NLoginCore_237_c, objectArray);
        NLoginInterface_0242.a(String.join((CharSequence)NLoginCore_580.c("㺃", (int)j, (long)(k ^ l)), list).replace((CharSequence)NLoginCore_580.c("㺆", (int)m, (long)(n ^ o)), NLoginCore_277.getName()));
        NLoginCore_190 NLoginCore_1902 = NLoginCore_3162.a(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_c);
        NLoginCore_190 NLoginCore_1903 = NLoginCore_3162.a(NLoginCore_102.var_com_nickuc_login_NLoginCore_102_d);
        NLoginType_008.b(p != 0).a((NLoginCore_598 NLoginInterface_0482) -> {
            if (!NLoginCore_277.R() || !this.boolean_a(NLoginCore_5092)) {
                NLoginInterface_0482.Z();
                return;
            }
            NLoginCore_3162.a(NLoginCore_508.var_com_nickuc_login_NLoginCore_508_m).a(NLoginCore_277, new Object[au]);
        }, q, r, TimeUnit.SECONDS);
        GUIButtonContainer[] GUIButtonContainerArray = new GUIButtonContainer[s];
        GUIButtonContainerArray[NLoginCore_580.t] = new GUIButtonContainer(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_b, new NLoginCore_190(NLoginCore_1902.ar(), NLoginCore_1902.as()));
        GUIButtonContainerArray[NLoginCore_580.u] = new GUIButtonContainer(NLoginCore_445.var_com_nickuc_login_NLoginCore_445_c, new NLoginCore_190(NLoginCore_1903.ar(), NLoginCore_1903.as()));
        return GUIButtonContainerArray;
    }

    @Override
    public boolean au() {
        return x != 0;
    }
}

