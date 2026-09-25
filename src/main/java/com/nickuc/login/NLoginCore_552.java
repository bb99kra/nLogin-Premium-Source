/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_552
extends NLoginCore_098 {
    private static int cc;
    private static int bu;
    private static int bf;
    private static long ci;
    private static int bi;
    private static int cb;
    private static long ct;
    private static int cy;
    private static String[] var_java_lang_String_arr_e;
    private static int cm;
    private static long q;
    private static int cg;
    private static long bh;
    private static int cv;
    private static long cn;
    private static long by;
    private static long cw;
    private static long at;
    private static int co;
    private static long ca;
    private static int bw;
    private static int bd;
    private static long o;
    private static int y;
    private static int da;
    private static long cd;
    private static long p;
    private static long br;
    private static long cz;
    private static int var_int_e;
    private static long ab;
    private static int al;
    private static int db;
    private static long bk;
    private static int cj;
    private static String[] f;
    private static long bo;
    private static long bm;
    private static int bn;
    private static int ce;
    private static int cr;

    static {
        var_int_e = 0 >>> 178 | 0 << ~178 + 1;
        p = Long.reverse(4597864413868285698L);
        q = Long.reverse(0x4000000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(9209550432295673602L);
        al = Integer.reverse(0x40000000);
        at = Long.reverse(9209550432295673602L);
        bd = (0x3000000 >>> 120 | 0x3000000 << ~120 + 1) & 0xFFFFFFFF;
        bf = -1 >>> 27 | -1 << -27;
        bh = Long.reverse(9209550432295673602L);
        bi = 0x800000 >>> 213 | 0x800000 << -213;
        bk = Long.reverse(4597864413868285698L);
        bm = Long.reverse(0x4000000000000000L);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(4597864413868285698L);
        br = Long.reverse(0x4000000000000000L);
        bu = Integer.reverse(1462763520);
        bw = Integer.reverse(0x60000000);
        by = Long.reverse(4597864413868285698L);
        ca = Long.reverse(0x4000000000000000L);
        cb = Integer.reverse(-536870912);
        cc = (-1 >>> 57 | -1 << -57) & 0xFFFFFFFF;
        cd = Long.reverse(9209550432295673602L);
        ce = 0x10000000 >>> 121 | 0x10000000 << -121;
        cg = Integer.reverse(-1);
        ci = Long.reverse(9209550432295673602L);
        cj = Integer.reverse(-1879048192);
        cm = -1 >>> 10 | -1 << ~10 + 1;
        cn = Long.reverse(9209550432295673602L);
        co = Integer.reverse(0x50000000);
        cr = (-1 >>> 86 | -1 << -86) & 0xFFFFFFFF;
        ct = Long.reverse(9209550432295673602L);
        cv = Integer.reverse(-805306368);
        cw = Long.reverse(9209550432295673602L);
        cy = 6144 >>> 73 | 6144 << -73;
        cz = Long.reverse(9209550432295673602L);
        da = -805306368 >>> 252 | -805306368 << ~252 + 1;
        db = Integer.reverse(-1342177280);
        var_java_lang_String_arr_e = new String[da];
        f = new String[db];
        NLoginCore_552.void_b();
    }

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0xB65DC02EA9127405L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(45 + 24), (byte)(60 + 23), (byte)(14 + 33), (byte)(57 + 10), (byte)(7 + 59), (byte)(44 + 23), (byte)(13 + 34), (byte)(73 + 7), 75, (byte)(60 + 7), (byte)(35 + 48), 53, (byte)(28 + 52), (byte)(32 + 65), (byte)(82 + 18), (byte)(25 + 75), (byte)(80 + 25), (byte)(57 + 53), (byte)(96 + 7)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(43 + 40)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծऀइ࣪ࣾईࣨࣷआࣣआࣝࣟ࣠ऒ", (byte)115, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_552.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    public NLoginCore_552(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_y, (String)NLoginCore_552.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_552.c("㺃", (int)y, (long)ab));
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_552.c("㺀", (int)cv, (long)cw));
        String string = NLoginCore_158.u(resultSet.getString((String)NLoginCore_552.c("㺃", (int)cy, (long)cz)));
        this.a(this.r, string, null, null);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_552.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.F("ՠւքդֈֵ֧֟֡հֲ֤֮֬յֳֳֹֻּ֚ֈ", (byte)124, 70), NLoginCore_552.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.C("֌֙֘՛֛֛֦֗֒֕բ֤֦֠֝֠ըࣺँࣤࣸं࣢ࣱऀࣝऀࣗࣙࣚऌւ", (byte)124, 67) + string + NLoginCore_091.A("Ʊ", (byte)124, 65) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        o = 4682301428124316668L;
        long l = o ^ 0xB65DC02EA9127405L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(47 + 22), (byte)(79 + 4), (byte)(33 + 14), (byte)(9 + 58), (byte)(9 + 57), 67, (byte)(2 + 45), (byte)(24 + 56), (byte)(20 + 55), (byte)(39 + 28), (byte)(32 + 51), (byte)(24 + 29), 80, (byte)(43 + 54), (byte)(35 + 65), (byte)(17 + 83), (byte)(104 + 1), (byte)(62 + 48), (byte)(82 + 21)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(46 + 23), (byte)(69 + 14)}, StandardCharsets.UTF_8));
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
                    NLoginCore_552.f[0] = NLoginCore_076.D("ԅԛӸԹӼԩԉӹԀԱԡԘԮԀԆՂԅԤԡԽԞԦԓԔ", (byte)89, 68);
                    NLoginCore_552.f[1] = NLoginCore_384.F("դդաՙ՛ռևՕւֈ֖՝", (byte)89, 70);
                    NLoginCore_552.f[2] = NLoginCore_076.E("՜ՆՆբ֐ֈձ՟֎՟֌ժժ֌զիՖ֏֕կժջըթ", (byte)89, 69);
                    NLoginCore_552.f[3] = NLoginCore_173.E("ա֌ծ։ճօ՟ճ֖ո֎՝", (byte)89, 69);
                    NLoginCore_552.f[4] = NLoginCore_201.B("ƉƚŬŹŬƫƌƝƅſƔŹ", (byte)89, 66);
                    NLoginCore_552.f[5] = NLoginCore_201.A("ŸŢŢžƬƤƍŻƪŻƧƩůưƠŹŲƐżƥƲƇƄƅ", (byte)89, 65);
                    NLoginCore_552.f[6] = NLoginCore_324.F("՜ՆՆբ֐ֈձ՟֎՟֍խքշյսս֋֚՘ռ֑ըթ", (byte)89, 70);
                    NLoginCore_552.f[7] = NLoginCore_387.A("ŸŢŢžƬƤƍŻƪŻƨƋƱƸƩƒƌƲƓƉƋƫŸƝǁƢƵƏǀƜƞƗ", (byte)89, 65);
                    NLoginCore_552.f[8] = NLoginCore_091.D("ԇӱӱԍԻԳԜԊԹԊԶԳԹӸԝԓԉԹԸԦԩՄԁԨԍԍԬՅԩԲԤ԰", (byte)89, 68);
                    NLoginCore_552.f[9] = NLoginCore_387.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՅԿԘՉԽԻԾԇԦԮԤ", (byte)89, 67);
                    NLoginCore_552.f[10] = NLoginCore_091.A("ƗšƛƈƘƌƭƲŽƮƩƳƬƨƄƆŹƛƭƸƾƇƄƅ", (byte)89, 65);
                    NLoginCore_552.f[11] = NLoginCore_451.F("վռգձֈ֎֓ը֒֐Տ՝", (byte)89, 70);
                    NLoginCore_552.f[12] = NLoginCore_453.E("փստՈՏի֔մվ֏յ֋֐զՔէկչ֚Փպիըթ", (byte)89, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_552.f[0] = NLoginCore_173.D("ԅԛӸԹӼԩԉӹԀԱԟՁ԰ԄԆԂԝԪԶԻԸԖԓԔ", (byte)89, 68);
                    NLoginCore_552.f[1] = NLoginCore_027.B("ƦƅŧƤżťŹƐƄƞƁŲƇƳŶƅƒƒƆƐƺƇƄƅ", (byte)89, 66);
                    NLoginCore_552.f[2] = NLoginCore_324.E("՜ՆՆբ֐ֈձ՟֎՟֊օհձ֑֛֙֌֏ա֛ց՚ա՜վ֖֘֟֨յզ", (byte)89, 69);
                    NLoginCore_552.f[3] = NLoginCore_091.D("ӯԭԌԜӸԆԵԵԷԭӺӺԁ԰ԿԜՊԵԠԦԍՌԓԔ", (byte)89, 68);
                    NLoginCore_552.f[4] = NLoginCore_427.F("գդՏ։ֆ։֍ղ֓֗լ՗Քծը՘֊֔֊ւՠ֑ըթ", (byte)89, 70);
                    NLoginCore_552.f[5] = NLoginCore_223.E("՜ՆՆբ֐ֈձ՟֎՟֊Ցկգ֑֒֊֓֔՞՘֐կվ՟֑տշբ՝֧֙", (byte)89, 69);
                    NLoginCore_552.f[6] = NLoginCore_223.F("՜ՆՆբ֐ֈձ՟֎՟֌ֈջ֊՚չ֑թ֢֓֌֔՝֏ճ֔ղ֜՜բֈի", (byte)89, 70);
                    NLoginCore_552.f[7] = NLoginCore_446.D("ԇӱӱԍԻԳԜԊԹԊԷԚՀՇԸԡԛՁԢԘԚԬՂԿՃԋԓԯԯԍԏՉ", (byte)89, 68);
                    NLoginCore_552.f[8] = NLoginCore_223.F("՜ՆՆբ֐ֈձ՟֎՟֋ֈ֎Սղը՞֎֍ջվ֓պ֓֠վ֩բր֌րք", (byte)89, 70);
                    NLoginCore_552.f[9] = NLoginCore_575.C("ԇӱӱԍԻԳԜԊԹԊԷԳԾԄՃӿԠԔԆԡԞՂՇԪԾՅՉԬՋԔՄՏ", (byte)89, 67);
                    NLoginCore_552.f[10] = NLoginCore_201.A("ƗšƛƈƘƌƭƲŽƮƨƋƆƘŷƓƎƹƏƯŵƗƄƅ", (byte)89, 65);
                    NLoginCore_552.f[11] = NLoginCore_110.B("ŶƦƣƮƦƭžƥƦƪƈŹ", (byte)89, 66);
                    NLoginCore_552.f[12] = NLoginCore_004.E("փստՈՏի֔մվ֏յբիթկիֆ՞՗ճց֡ըթ", (byte)89, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_552.f[0] = NLoginCore_559.F("իռձ՝ՒֆխայնւնՑժ֛֐ջ֠շ֝՚֡ըթ", (byte)89, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_552.f[0] = NLoginCore_027.D("ԊԤԉԻԮԺԙԉԾԍԬӿԱԁԟԜԄՂԅԷԺԸԬՈԧ԰ԮԩԿԞԲՕ", (byte)89, 68);
                }
            }
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        boolean bl = NLoginCore_2192.a(NLoginCore_552.c("㺀", (int)al, (long)at), (String)NLoginCore_552.c("㺃", (int)(bd & bf), (long)bh)).equalsIgnoreCase((String)NLoginCore_552.c("㺆", (int)bi, (long)(bk ^ bm)));
        if (bl) {
            int n = NLoginCore_2192.a(NLoginCore_552.c("㺉", (int)bn, (long)(bo ^ br)), bu);
            String string = NLoginCore_2192.java_lang_String_b(NLoginCore_552.c("㺌", (int)bw, (long)(by ^ ca)));
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_552.c("㺏", (int)(cb & cc), (long)cd));
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_552.c("㺒", (int)(ce & cg), (long)ci));
            String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_552.c("㺕", (int)(cj & cm), (long)cn));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, n, string4, string2, string3, new Properties()));
        } else {
            File file = new File(this.java_io_File_b(), (String)NLoginCore_552.c("㺘", (int)(co & cr), (long)ct));
            this.d = NLoginCore_586.a(this.m, file, new Properties());
        }
    }
}

