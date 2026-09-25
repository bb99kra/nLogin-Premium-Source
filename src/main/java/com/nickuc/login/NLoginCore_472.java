/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.Server
 *  org.bukkit.configuration.file.FileConfiguration
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_411;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;

public class NLoginCore_472
extends NLoginCore_411 {
    private static long dv;
    private static int ea;
    private static long cn;
    private static int ai;
    private static int cm;
    private static long ci;
    private static long dy;
    private static long be;
    private static int du;
    private static long ee;
    private static String[] var_java_lang_String_arr_e;
    private static int bw;
    private static int cb;
    private static int z;
    private static long p;
    private static int cfr_renamed_1;
    private static int bn;
    private static long as;
    private static int bf;
    private static int de;
    private static long ay;
    private static long ap;
    private static int da;
    private static long bh;
    private static long bo;
    private static int dh;
    private static long dc;
    private static int dk;
    private static int bz;
    private static int cs;
    private static long ct;
    private static int var_int_e;
    private static long cf;
    private static int az;
    private static int cg;
    private static int ed;
    private static int dd;
    private static long cp;
    private static long cd;
    private static final Pattern a;
    private static long ax;
    private static long bk;
    private static long cz;
    private static int dn;
    private static int ec;
    private static long ds;
    private static int aw;
    private static int cv;
    private static int bc;
    private static int dt;
    private static int t;
    private static int ak;
    private static int dz;
    private static long br;
    private static int dq;
    private static int cy;
    private static long o;
    private static int cr;
    private static int bl;
    private static int db;
    private static long by;
    private static int ce;
    private static String[] f;
    private static long am;
    private static long dm;
    private static long di;
    private static long i;
    private static long dp;
    private static long aj;
    private static int dw;
    private static int aq;
    private static long ck;
    private static int bu;
    private static long at;

    private static void void_b() {
        int n;
        i = -1888417748851346329L;
        long l = i ^ 0x6C9AC8F5E3F45850L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(39 + 30), (byte)(58 + 25), (byte)(25 + 22), (byte)(16 + 51), (byte)(36 + 30), (byte)(42 + 25), (byte)(22 + 25), 80, (byte)(56 + 19), (byte)(39 + 28), (byte)(7 + 76), (byte)(39 + 14), 80, (byte)(5 + 92), (byte)(34 + 66), (byte)(59 + 41), (byte)(10 + 95), (byte)(27 + 83), (byte)(16 + 87)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_472.f[0] = NLoginCore_004.D("գ՜Չ՚՝՛ՐԻՃՙՃզՇՈցսՉՂօքխըՕՖ", (byte)111, 68);
                    NLoginCore_472.f[1] = NLoginCore_223.B("ƪưǃƒǂǆǅƬƗǠǑƱǊƱƤơƶơǛƥƧǙưƱ", (byte)111, 66);
                    NLoginCore_472.f[2] = NLoginCore_138.E("֚ղմ֗ձ֞էվչժ֢֚֠֎ջւ֨ծվհ֦ցվտ", (byte)111, 69);
                    NLoginCore_472.f[3] = NLoginCore_384.A("ǋƱƓǃǒǗƘǜƩƾǛǘǏǜƼǎƶǃƿǈǃǩưƱ", (byte)111, 65);
                    NLoginCore_472.f[4] = NLoginCore_384.F("ով֑ՠ֐֔֓պե֮֟սռ֞ռ֑֫֒ղֱָ֧վտ", (byte)111, 70);
                    NLoginCore_472.f[5] = NLoginCore_092.B("ǂƴǕƦƐƻƖƯƪƟƷưƫƿǐƸǤǒƧƥƩƳưƱ", (byte)111, 66);
                    NLoginCore_472.f[6] = NLoginCore_387.C("ՈՖծԼՊըՖՙբՙՄԾքՐՈնՋաչՎՙըՕՖ", (byte)111, 67);
                    NLoginCore_472.f[7] = NLoginCore_076.F("֑֦֛֮֗֔֔֒֕֔֠ճ", (byte)111, 70);
                    NLoginCore_472.f[8] = NLoginCore_384.D("նոշ՜ծսՀՑիօՍՊ", (byte)111, 68);
                    NLoginCore_472.f[9] = NLoginCore_559.B("ƶǒƫƋǍǇǘƶƦǀǊƥ", (byte)111, 66);
                    NLoginCore_472.f[10] = NLoginCore_324.D("մ՗ջ԰սԲԾ՝ս՝ՕՊ", (byte)111, 68);
                    NLoginCore_472.f[11] = NLoginCore_324.C("՛ծՇՑՍտԻ՘՟վճՊ", (byte)111, 67);
                    NLoginCore_472.f[12] = NLoginCore_110.B("ƠƐƐǄƘǅƤƴƬǠƟƥ", (byte)111, 66);
                    NLoginCore_472.f[13] = NLoginCore_384.E("ՠ֒պէ֖֥յմ֘՟֦֧ջ֌֤֞֟֓ևֱֵָ֔֓֏ֲյ֌ֹֿ֞ջ֑֒րֲִօֵׇփօּ֞ׄ׍֍֐֢׆א׎֕ח֞֟", (byte)111, 69);
                    NLoginCore_472.f[14] = NLoginCore_559.F("լս֖֒զ֊֫փևքւճ", (byte)111, 70);
                    NLoginCore_472.f[15] = NLoginCore_223.B("ơǅǆǁƯƗƦƩƔƟǏƶƬǗǡǗǟǑǢƸǉǩưƱ", (byte)111, 66);
                    NLoginCore_472.f[16] = NLoginCore_138.C("՛շՐ԰ղլս՛ՋեկՊ", (byte)111, 67);
                    NLoginCore_472.f[17] = NLoginCore_091.E("֝ր֤ՙ֦՛էֆ֦ֆվճ", (byte)111, 69);
                    NLoginCore_472.f[18] = NLoginCore_427.A("ƶǉƢƬƨǚƖƳƺǙǎƥ", (byte)111, 65);
                    NLoginCore_472.f[19] = NLoginCore_027.A("ƠƐƐǄƘǅƤƴƬǠƟƥ", (byte)111, 65);
                    NLoginCore_472.f[20] = NLoginCore_091.B("ƒǄƬƙǈǗƧƦǊƑǘǙƭƾǐǑǖǅƹǆǧǪǣǅǁǤƧƾǫǐǱƭǄǃƲǤǦƷǧǹƵƷǮǐǶǿƿǂǔǸȂȀǇȉǐǑ", (byte)111, 66);
                    NLoginCore_472.f[21] = NLoginCore_387.C("ՃՔթխԽաւ՚՞՛ՙՊ", (byte)111, 67);
                    NLoginCore_472.f[22] = NLoginCore_076.F("պցծ֨հՠ֗է֨֬֏եְ֪֞֝քֵ֞և֯ցְֲִ֭֚֓֞֩֯րֳֳֶֿ֚֠׀ׄ֬ׄ֌֢֠׆ֻּ֪׋׃׍֢׊ׄ׃ֱ֛זִ֛֮דמְםֱַֽ׃יׇרס׬׮ם׬ל׮ן׋קץֶץַפ׭׺׭׻׬ׯ؀׋ג׷׀כ؂ב׆זו׿׼ד", (byte)111, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_472.f[0] = NLoginCore_223.F("֌օղփֆքչդլւլթցհ։֐ժ֊֑֩֐ցվտ", (byte)111, 70);
                    NLoginCore_472.f[1] = NLoginCore_324.D("ՏՕըԷէիժՑԼօյբՅ՚՜զքՕբ՚՚ՈՋվ֍֎քևՔ֋զզ", (byte)111, 68);
                    NLoginCore_472.f[2] = NLoginCore_384.A("ǌƤƦǉƣǐƙưƫƜǓƘǎƼƳǗǦƢƱƥƜǙưƱ", (byte)111, 65);
                    NLoginCore_472.f[3] = NLoginCore_027.E("֙տա֑֥֠զ֪շ֌֩֟֡և֐֫֔կֆ֖֐ַֿ֭֕֬֔֩֍ֿ֮֗", (byte)111, 69);
                    NLoginCore_472.f[4] = NLoginCore_446.D("ՏՕըԷէիժՑԼօնկոյՙփՂսՅՇ֎ը՟ՐրօՑզցո։Ֆ", (byte)111, 68);
                    NLoginCore_472.f[5] = NLoginCore_451.F("֐ւ֣մ՞։դսոխփ֣֏ի֍֨֊ְְֱֻ֢֬֒֬֙֗֜րֲ֮֜", (byte)111, 70);
                    NLoginCore_472.f[6] = NLoginCore_027.B("ƣƱǉƗƥǃƱƴƽƴƟǋǗǠǠǞƶǧǇƽǄǙưƱ", (byte)111, 66);
                    NLoginCore_472.f[7] = NLoginCore_076.A("ǐƩƤƥƸǋƶƔƬƖǏƮǙǙǐƿƿƸƟǚǣǙưƱ", (byte)111, 65);
                    NLoginCore_472.f[8] = NLoginCore_173.D("ՌղՓԶ՗լկրԵղճՊ", (byte)111, 68);
                    NLoginCore_472.f[9] = NLoginCore_223.D("ԹնԴ՞իվտգց՜ճՊ", (byte)111, 68);
                    NLoginCore_472.f[10] = NLoginCore_384.A("ƨƵƏƔƕƧƩƾƳǙƗƥ", (byte)111, 65);
                    NLoginCore_472.f[11] = NLoginCore_027.C("յ՚Վ՚՗ՐՑմՋՌ՟էՆ՞ՠյփնՕ՜ՈվՕՖ", (byte)111, 67);
                    NLoginCore_472.f[12] = NLoginCore_091.C("նԻՅՏՠՏՕ՗ԺՃճՊ", (byte)111, 67);
                    NLoginCore_472.f[13] = NLoginCore_324.F("ՠ֒պէ֖֥յմ֘՟֦֧ջ֌֤֞֟֓ևֱֵָ֔֓֏ֲյ֌ֹֿ֞ջ֑֒րֲִօֵׇփօֿ׏֞ׄ֩֫֋ָׁ֒חֲ׆הכ׋ָֹֻׁ֗֬", (byte)111, 70);
                    NLoginCore_472.f[14] = NLoginCore_201.B("ƬƷƤƪƦǇǇƏƮƝǚƥ", (byte)111, 66);
                    NLoginCore_472.f[15] = NLoginCore_324.F("կ֓֔֏սեմշբխ֣֞օ֋ֲվ֪ծճ֏ց֑վտ", (byte)111, 70);
                    NLoginCore_472.f[16] = NLoginCore_027.E("լ֔՞է֛֘֊մջևխճ", (byte)111, 69);
                    NLoginCore_472.f[17] = NLoginCore_223.F("֑֙գտօ֪֖֥՞֡նճ", (byte)111, 70);
                    NLoginCore_472.f[18] = NLoginCore_223.E("֖֝ձոաե֥֡։֢ե֦֪֧֦֡֝ծ֤֮֯ցվտ", (byte)111, 69);
                    NLoginCore_472.f[19] = NLoginCore_004.E("՝֤֗֔ջ֨ժ֧֕֋֤ճ", (byte)111, 69);
                    NLoginCore_472.f[20] = NLoginCore_324.E("ՠ֒պէ֖֥յմ֘՟֦֧ջ֌֤֞֟֓ևֱֵָ֔֓֏ֲյ֌ֹֿ֞ջ֑֒րֲִօֵׇփօַֿ׍ֿ֝օֱ׆׎ָׄח֞֟", (byte)111, 69);
                    NLoginCore_472.f[21] = NLoginCore_076.E("վնս֔ր֞մգդ֡֬ճ", (byte)111, 69);
                    NLoginCore_472.f[22] = NLoginCore_027.F("պցծ֨հՠ֗է֨֬֏եְ֪֞֝քֵ֞և֯ցְֲִ֭֚֓֞֩֯րֳֳֶֿ֚֠׀ׄ֬ׄ֌֢֠׆ֻּ֪׋׃׍֢׊ׄ׃ֱ֛זִ֛֮דמְםֱַֽ׃יׇרס׬׮ם׬ל׮ן׋קץֶץַפ׭׺׭׻׬ׯ؀׋ץ؃דׂע؊פ׷׶׺؀؍ؑ؊ؑؔ׋׶׈ؐؖסמן", (byte)111, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_472.f[0] = NLoginCore_451.B("ǌƲƒƪƩƤǍƜǚƶƠǙƹǠƴǝǚƽƿǝǡǙưƱ", (byte)111, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_472.f[0] = NLoginCore_201.C("ՃՖ՘՛տՋաՍԿՁշ՚Փւ՜վՊն֊ռգ՘ՕՖ", (byte)111, 67);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x39L;
        l ^= 0x6C9AC8F5E3F45850L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(47 + 22), (byte)(79 + 4), (byte)(39 + 8), (byte)(21 + 46), (byte)(14 + 52), (byte)(57 + 10), (byte)(31 + 16), (byte)(51 + 29), (byte)(24 + 51), (byte)(60 + 7), (byte)(19 + 64), 53, (byte)(36 + 44), (byte)(36 + 61), (byte)(52 + 48), (byte)(71 + 29), (byte)(39 + 66), (byte)(78 + 32), (byte)(44 + 59)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(12 + 71)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.C("եղձԴմհիմտծԻչսնչտՁࢶ࣏ࣔ࣍ࣟࣚࢿࣃ", (byte)111, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_472.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    static {
        var_int_e = 0 >>> 10 | 0 << ~10 + 1;
        o = Long.reverse(-1861055165105220697L);
        p = Long.reverse(-7205759403792793600L);
        t = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(0);
        ai = (16384 >>> 110 | 16384 << -110) & 0xFFFFFFFF;
        aj = Long.reverse(8803468752508113831L);
        ak = (524288 >>> 178 | 524288 << -178) & 0xFFFFFFFF;
        am = Long.reverse(-1861055165105220697L);
        ap = Long.reverse(-7205759403792793600L);
        aq = Integer.reverse(-1073741824);
        as = Long.reverse(-1861055165105220697L);
        at = Long.reverse(-7205759403792793600L);
        aw = (8192 >>> 203 | 8192 << -203) & 0xFFFFFFFF;
        ax = Long.reverse(-1861055165105220697L);
        ay = Long.reverse(-7205759403792793600L);
        az = Integer.reverse(-1610612736);
        bc = Integer.reverse(-1);
        be = Long.reverse(8803468752508113831L);
        bf = Integer.reverse(0x60000000);
        bh = Long.reverse(-1861055165105220697L);
        bk = Long.reverse(-7205759403792793600L);
        bl = 0 >>> 32 | 0 << -32;
        bn = Integer.reverse(-536870912);
        bo = Long.reverse(-1861055165105220697L);
        br = Long.reverse(-7205759403792793600L);
        bu = 0x100000 >>> 209 | 0x100000 << ~209 + 1;
        bw = Integer.reverse(-1);
        by = Long.reverse(8803468752508113831L);
        bz = Integer.reverse(-1879048192);
        cb = Integer.reverse(-1);
        cd = Long.reverse(8803468752508113831L);
        ce = (1280 >>> 103 | 1280 << ~103 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(8803468752508113831L);
        cg = (22 >>> 193 | 22 << ~193 + 1) & 0xFFFFFFFF;
        ci = Long.reverse(-1861055165105220697L);
        ck = Long.reverse(-7205759403792793600L);
        cm = (192 >>> 132 | 192 << -132) & 0xFFFFFFFF;
        cn = Long.reverse(-1861055165105220697L);
        cp = Long.reverse(-7205759403792793600L);
        cr = (0x6800000 >>> 183 | 0x6800000 << -183) & 0xFFFFFFFF;
        cs = -1 >>> 49 | -1 << ~49 + 1;
        ct = Long.reverse(8803468752508113831L);
        cv = (896 >>> 198 | 896 << -198) & 0xFFFFFFFF;
        cy = Integer.reverse(-1);
        cz = Long.reverse(8803468752508113831L);
        da = 0 >>> 33 | 0 << ~33 + 1;
        db = Integer.reverse(-268435456);
        dc = Long.reverse(8803468752508113831L);
        dd = 0 >>> 8 | 0 << -8;
        de = Integer.reverse(0x8000000);
        dh = -1 >>> 211 | -1 << ~211 + 1;
        di = Long.reverse(8803468752508113831L);
        dk = Integer.reverse(-2013265920);
        dm = Long.reverse(8803468752508113831L);
        dn = Integer.reverse(0x48000000);
        cfr_renamed_1 = -1 >>> 71 | -1 << ~71 + 1;
        dp = Long.reverse(8803468752508113831L);
        dq = Integer.reverse(-939524096);
        ds = Long.reverse(8803468752508113831L);
        dt = Integer.reverse(0x28000000);
        du = Integer.reverse(-1);
        dv = Long.reverse(8803468752508113831L);
        dw = Integer.reverse(-1476395008);
        dy = Long.reverse(8803468752508113831L);
        dz = Integer.reverse(0);
        ea = (188416 >>> 77 | 188416 << ~77 + 1) & 0xFFFFFFFF;
        ec = 0x2E000000 >>> 57 | 0x2E000000 << ~57 + 1;
        ed = Integer.reverse(0x68000000);
        ee = Long.reverse(8803468752508113831L);
        var_java_lang_String_arr_e = new String[ea];
        f = new String[ec];
        NLoginCore_472.void_b();
        a = Pattern.compile((String)NLoginCore_472.c("㺀", (int)ed, (long)ee));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_472.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ӜӾԀӠԄԣԛԱԝӬԪԠԮԨӱԖԸԷԯԵԯԄ", (byte)85, 67), NLoginCore_472.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.E("մցրՃփտպփ֎սՊֈ֌օֈ֎Րࣅࣣ࣮ࣩ࣒ࣜࣞ࣎դ", (byte)85, 69) + string + NLoginCore_223.A("ţ", (byte)85, 65) + methodType.toString(), exception);
        }
    }

    @Override
    protected void a(ResultSet resultSet) {
        String string = null;
        boolean bl = NLoginCore_472.bl;
        try {
            string = resultSet.getString((String)NLoginCore_472.c("㺀", (int)bn, (long)(bo ^ br)));
            boolean bl2 = a.matcher(string).matches();
            String exception = resultSet.getString((String)NLoginCore_472.c("㺃", (int)(bu & bw), (long)by));
            this.a(string, exception, bl2);
        }
        catch (Exception exception) {
            NLoginCore_370.b((String)NLoginCore_472.c("㺆", (int)(bz & cb), (long)cd) + ((NLoginCore_531)((Object)this.a)).getName() + (String)NLoginCore_472.c("㺉", (int)ce, (long)cf) + (String)(string == null ? NLoginCore_472.c("㺌", (int)cg, (long)(ci ^ ck)) : string + (String)NLoginCore_472.c("㺏", (int)cm, (long)(cn ^ cp))) + (String)NLoginCore_472.c("㺒", (int)(cr & cs), (long)ct) + bl + (String)NLoginCore_472.c("㺕", (int)(cv & cy), (long)cz), exception, new Object[da]);
        }
    }

    private void a(String string, String string2, boolean bl) {
        if (string != null && string2 != null) {
            String string3;
            UUID uUID = null;
            if (bl) {
                uUID = UUID.fromString(string);
                OfflinePlayer offlinePlayer = ((Server)this.m.java_lang_Object_b().c()).getOfflinePlayer(uUID);
                string3 = offlinePlayer.getName();
            } else {
                string3 = string;
            }
            if (string3 != null) {
                this.a(string3, string2, null, uUID);
            }
        }
    }

    @Override
    protected void a(NLoginCore_219 NLoginCore_2192) {
        boolean bl = NLoginCore_2192.d(NLoginCore_472.c("㺀", (int)ai, (long)aj));
        if (bl) {
            String string = NLoginCore_2192.java_lang_String_b(NLoginCore_472.c("㺃", (int)ak, (long)(am ^ ap)));
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_472.c("㺆", (int)aq, (long)(as ^ at)));
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_472.c("㺉", (int)aw, (long)(ax ^ ay)));
            String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_472.c("㺌", (int)(az & bc), (long)be));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, string2, string3, string4, new Properties(), NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.i()));
            this.P = NLoginCore_472.c("㺏", (int)bf, (long)(bh ^ bk));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(NLoginCore_219 NLoginCore_2192) {
        NLoginCore_219 NLoginCore_2193 = new NLoginCore_219((String)NLoginCore_472.c("㺀", (int)db, (long)dc), this.java_io_File_b());
        Set set = ((FileConfiguration)NLoginCore_2193.c()).getKeys(dd != 0);
        for (String string : set) {
            boolean bl = a.matcher(string).matches();
            try {
                String string2 = NLoginCore_2193.java_lang_String_b(string);
                this.a(string, string2, bl);
            }
            catch (Exception exception) {
                NLoginCore_370.b((String)NLoginCore_472.c("㺃", (int)(de & dh), (long)di) + ((NLoginCore_531)((Object)this.a)).getName() + (String)NLoginCore_472.c("㺆", (int)dk, (long)dm) + (String)(string == null ? NLoginCore_472.c("㺉", (int)(dn & cfr_renamed_1), (long)dp) : string + (String)NLoginCore_472.c("㺌", (int)dq, (long)ds)) + (String)NLoginCore_472.c("㺏", (int)(dt & du), (long)dv) + bl + (String)NLoginCore_472.c("㺒", (int)dw, (long)dy), exception, new Object[dz]);
            }
            finally {
                ++this.l;
            }
        }
    }

    public NLoginCore_472(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.A, (String)NLoginCore_472.c("㺀", (int)var_int_e, (long)(o ^ p)), (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? t : z) != 0);
    }
}

