/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.EventEnum
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.NLoginCore_189;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

public class NLoginType_020
extends NLoginType_032 {
    private static String[] d;
    private static long ci;
    private static long bc;
    private static int da;
    private static int cp;
    private static int cw;
    private static int bh;
    private static int bk;
    private static long e;
    private static int bg;
    private static int ca;
    private static String[] c;
    private static int bx;
    private static long cr;
    private static int cv;
    private static int cm;
    private static int bm;
    private static int cs;
    private static long co;
    private static int cx;
    private static long cu;
    private static int bn;
    private static int br;
    private static int aw;
    private static int cb;
    private static long bs;
    private static int cc;
    private static int bi;
    private static long be;
    private static int ce;
    private static int ay;
    private static long cn;
    private static long cy;
    private static int bl;
    private static int cz;
    private static long by;
    private static long bt;
    private static int cd;
    private static long bw;
    private static int bv;
    private static int bu;
    private static long az;
    private static int bb;
    private static int a;
    private static int av;
    private static long ct;
    private static int cl;
    private static int cq;
    private static int ch;
    private static long ck;
    private static int bq;
    private static int bj;
    private static long ax;
    private static int ba;
    private static int bf;
    private static int bo;
    private static int bz;
    private static int bp;
    private static long cf;
    private static int cg;
    private static int bd;
    private static int cj;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_020.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.D("ԏԱԳԓԷՖՎդՐԟ՝Փա՛ԤՉիժբըբԷ", (byte)102, 68), NLoginType_020.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.C("Պ՗ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦࢺࢴࢯࢸࣂࢲࢦ࢚ࢽࢴࢷࢩࢪࣄՀ", (byte)102, 67) + string + NLoginCore_446.A("ƅ", (byte)102, 65) + methodType.toString(), exception);
        }
    }

    public NLoginType_020(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }

    private static String a(int n, long l) {
        l ^= 0x3EL;
        l ^= 0xAD4A73E09B275681L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(20 + 49), (byte)(77 + 6), (byte)(5 + 42), (byte)(49 + 18), (byte)(3 + 63), (byte)(38 + 29), 47, (byte)(38 + 42), (byte)(68 + 7), (byte)(13 + 54), (byte)(38 + 45), (byte)(30 + 23), (byte)(57 + 23), (byte)(93 + 4), (byte)(62 + 38), (byte)(19 + 81), (byte)(3 + 102), (byte)(12 + 98), (byte)(90 + 13)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴжߊ߄޿߈ߒ߂޶ުߍ߄߇޹޺ߔ", (byte)22, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_020.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    @Override
    public void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
            Object[] objectArray = new Object[a];
            objectArray[NLoginType_020.av] = (String)NLoginType_020.c("㺀", (int)aw, (long)ax) + (String)(stringArray.length > 0 ? NLoginType_020.c("㺃", (int)ay, (long)az) : NLoginType_020.c("㺆", (int)(ba & bb), (long)bc)) + String.join((CharSequence)NLoginType_020.c("㺉", (int)bd, (long)be), stringArray);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        NLoginCore_509 NLoginCore_5092 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        if (NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_e)) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.F, new Object[bf]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_f, new Object[bg]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (stringArray.length == 0) {
            NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.d, string2 -> NLoginInterface_0242.e((String)string2, string.toLowerCase(Locale.ENGLISH) + (String)NLoginType_020.c("㺀", (int)(cw & cx), (long)cy)), new Object[bh]);
            return;
        }
        NLoginCore_291 NLoginCore_2912 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
        if (!ForceRegisterConfig2.s()) {
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.t, new Object[bi]);
            NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
            return;
        }
        if (ForceRegisterConfig2.t() && NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar()) {
            return;
        }
        String string3 = stringArray[bj];
        if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2, string3)) {
            this.a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, string3);
            return;
        }
        ((NLoginType_008)this.a).com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, NLoginCore_5092, string3, bk != 0, bl != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, String string) {
        String string2;
        String string3;
        block6: {
            block5: {
                Object[] objectArray = new Object[bm];
                objectArray[NLoginType_020.bn] = NLoginCore_277;
                if (!((NLoginType_008)this.a).a(EventEnum.WRONG_PASSWORD_EVENT, objectArray)) {
                    return;
                }
                string3 = NLoginCore_277.getName();
                string2 = NLoginCore_277.ac();
                int n = NLoginCore_5092.int_a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t) + bo;
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_t, (Object)n);
                try {
                    if (n >= NLoginCore_532.Y.r()) break block5;
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.P, new Object[bp]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_508.var_com_nickuc_login_NLoginCore_508_e, new Object[bq]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                }
                catch (Throwable throwable) {
                    NLoginCore_370.b((String)NLoginType_020.c("㺒", (int)cm, (long)(cn ^ co)) + string3 + (String)NLoginType_020.c("㺕", (int)(cp & cq), (long)cr) + string2 + (String)NLoginType_020.c("㺘", (int)cs, (long)(ct ^ cu)), new Object[cv]);
                    throw throwable;
                }
                NLoginCore_370.b((String)NLoginType_020.c("㺀", (int)br, (long)(bs ^ bt)) + string3 + (String)NLoginType_020.c("㺃", (int)(bu & bv), (long)bw) + string2 + (String)NLoginType_020.c("㺆", (int)bx, (long)by), new Object[bz]);
                return;
            }
            Long l = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a().java_lang_Long_a(ForceRegisterConfig2, string3, string2);
            if (l != null) {
                Object[] objectArray = new Object[ca];
                objectArray[NLoginType_020.cb] = NLoginCore_189.b(l);
                NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.S, NLoginCore_277, objectArray));
                break block6;
            }
            NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.Q, NLoginCore_277, new Object[cc]));
        }
        NLoginCore_370.b((String)NLoginType_020.c("㺉", (int)(cd & ce), (long)cf) + string3 + (String)NLoginType_020.c("㺌", (int)(cg & ch), (long)ci) + string2 + (String)NLoginType_020.c("㺏", (int)cj, (long)ck), new Object[cl]);
    }

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        av = 0 >>> 113 | 0 << -113;
        aw = (0 >>> 223 | 0 << -223) & 0xFFFFFFFF;
        ax = Long.reverse(-2693999973159044433L);
        ay = (32 >>> 229 | 32 << -229) & 0xFFFFFFFF;
        az = Long.reverse(-2693999973159044433L);
        ba = (0x1000000 >>> 151 | 0x1000000 << ~151 + 1) & 0xFFFFFFFF;
        bb = -1 >>> 239 | -1 << -239;
        bc = Long.reverse(-2693999973159044433L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-2693999973159044433L);
        bf = Integer.reverse(0);
        bg = Integer.reverse(0);
        bh = Integer.reverse(0);
        bi = (0 >>> 47 | 0 << -47) & 0xFFFFFFFF;
        bj = (0 >>> 62 | 0 << -62) & 0xFFFFFFFF;
        bk = Integer.reverse(Integer.MIN_VALUE);
        bl = 0x100000 >>> 212 | 0x100000 << ~212 + 1;
        bm = Integer.reverse(Integer.MIN_VALUE);
        bn = (0 >>> 46 | 0 << ~46 + 1) & 0xFFFFFFFF;
        bo = (16 >>> 228 | 16 << -228) & 0xFFFFFFFF;
        bp = (0 >>> 74 | 0 << ~74 + 1) & 0xFFFFFFFF;
        bq = Integer.reverse(0);
        br = Integer.reverse(0x20000000);
        bs = Long.reverse(-6440994863131297105L);
        bt = Long.reverse(0x7C00000000000000L);
        bu = 40 >>> 3 | 40 << -3;
        bv = Integer.reverse(-1);
        bw = Long.reverse(-2693999973159044433L);
        bx = (96 >>> 36 | 96 << -36) & 0xFFFFFFFF;
        by = Long.reverse(-2693999973159044433L);
        bz = Integer.reverse(0);
        ca = Integer.reverse(Integer.MIN_VALUE);
        cb = Integer.reverse(0);
        cc = Integer.reverse(0);
        cd = (3584 >>> 137 | 3584 << ~137 + 1) & 0xFFFFFFFF;
        ce = Integer.reverse(-1);
        cf = Long.reverse(-2693999973159044433L);
        cg = (1 >>> 125 | 1 << -125) & 0xFFFFFFFF;
        ch = (-1 >>> 123 | -1 << -123) & 0xFFFFFFFF;
        ci = Long.reverse(-2693999973159044433L);
        cj = Integer.reverse(-1879048192);
        ck = Long.reverse(-2693999973159044433L);
        cl = Integer.reverse(0);
        cm = -1610612736 >>> 156 | -1610612736 << -156;
        cn = Long.reverse(-6440994863131297105L);
        co = Long.reverse(0x7C00000000000000L);
        cp = -1342177280 >>> 188 | -1342177280 << -188;
        cq = Integer.reverse(-1);
        cr = Long.reverse(-2693999973159044433L);
        cs = Integer.reverse(0x30000000);
        ct = Long.reverse(-6440994863131297105L);
        cu = Long.reverse(0x7C00000000000000L);
        cv = Integer.reverse(0);
        cw = Integer.reverse(-1342177280);
        cx = Integer.reverse(-1);
        cy = Long.reverse(-2693999973159044433L);
        cz = 112 >>> 35 | 112 << ~35 + 1;
        da = -2147483645 >>> 158 | -2147483645 << -158;
        c = new String[cz];
        d = new String[da];
        NLoginType_020.b();
    }

    private static void b() {
        int n;
        e = -766017123016296091L;
        long l = e ^ 0xAD4A73E09B275681L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(24 + 45), (byte)(6 + 77), (byte)(27 + 20), (byte)(57 + 10), (byte)(36 + 30), (byte)(14 + 53), 47, (byte)(44 + 36), 75, (byte)(8 + 59), (byte)(74 + 9), (byte)(2 + 51), (byte)(79 + 1), (byte)(64 + 33), (byte)(67 + 33), (byte)(97 + 3), (byte)(73 + 32), (byte)(32 + 78), (byte)(14 + 89)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(57 + 26)}, StandardCharsets.UTF_8));
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
                    NLoginType_020.d[0] = NLoginCore_092.F("Պավ֐զձմծՖէզո֖֛՜խճ֣ֆզֆ֓֜ք֥ե֞տէ֯խ֟", (byte)95, 70);
                    NLoginType_020.d[1] = NLoginCore_201.D("ԫԄԶԶՅԊԾԲԋԝՃԚ", (byte)95, 68);
                    NLoginType_020.d[2] = NLoginCore_091.A("ƳƮƑƂźƯƔŽƒƸƾƅ", (byte)95, 65);
                    NLoginType_020.d[3] = NLoginCore_091.F("մՍտտ֎ՓևջՔզ֌գ", (byte)95, 70);
                    NLoginType_020.d[4] = NLoginCore_384.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
                    NLoginType_020.d[5] = NLoginCore_324.F("ՒՑխե֘ք֘գ֙ծծգ", (byte)95, 70);
                    NLoginType_020.d[6] = NLoginCore_324.E("֕եէւ֌Ց֑՚՗ջ֗ս֟։֌֘վ֐֒֟ղց֡ճոց֬զ֝֫լֳ֦֟֞ևֹ֤֥շ֔և֐ִֻ֓֌֙־ֶսׇ֣֗֎֏", (byte)95, 69);
                    NLoginType_020.d[7] = NLoginCore_004.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
                    NLoginType_020.d[8] = NLoginCore_091.C("ԉԈԤԜՏԻՏԚՐԥԥԚ", (byte)95, 67);
                    NLoginType_020.d[9] = NLoginCore_453.E("֕եէւ֌Ց֑՚՗ջ֗ս֟։֌֘վ֐֒֟ղց֡ճոց֬զ֝֫լֳ֦֟֞ևֹ֤֥շ֔և֐ִֻ֓֌֙־ֶսׇ֣֗֎֏", (byte)95, 69);
                    NLoginType_020.d[10] = NLoginCore_387.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
                    NLoginType_020.d[11] = NLoginCore_004.D("ԉԈԤԜՏԻՏԚՐԥԥԚ", (byte)95, 68);
                    NLoginType_020.d[12] = NLoginCore_027.B("ƷƇƉƤƮųƳżŹƝƹƟǁƫƮƺƠƲƴǁƔƣǃƕƚƣǎƈƿǍƎǁǀǈǕƩǆǇǛƙƶƩƲǖƵǝƮƻǠǘƟǅƹǩưƱ", (byte)95, 66);
                    NLoginType_020.d[13] = NLoginCore_092.B("ƖůơơưŵƩƝŶƈƮƅ", (byte)95, 66);
                    continue block7;
                }
                case 1: {
                    NLoginType_020.d[0] = NLoginCore_092.E("Պավ֐զձմծՖէզո֖֛՜խճ֣ֆզֆցվքգ֙ի֦֘քִ֝", (byte)95, 69);
                    NLoginType_020.d[1] = NLoginCore_027.A("ƯƖƏƌŵƨƗƥƷƏƐƅ", (byte)95, 65);
                    NLoginType_020.d[2] = NLoginCore_453.D("ՆՄԼԷԥԻԱԼՀԦԵԚ", (byte)95, 68);
                    NLoginType_020.d[3] = NLoginCore_004.A("ƖſƏƱƃƹƷƕŵƸƺƅ", (byte)95, 65);
                    NLoginType_020.d[4] = NLoginCore_559.A("ƴŶƶƳűƊŲƼƴźſƅ", (byte)95, 65);
                    NLoginType_020.d[5] = NLoginCore_324.E("։֋լը՗հհ֖֔֒֔գ", (byte)95, 69);
                    NLoginType_020.d[6] = NLoginCore_384.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ՘ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՅԬԿԵՔԴխՑձըԹըԺԺ՜ՙՖՄՃպսՈ", (byte)95, 68);
                    NLoginType_020.d[7] = NLoginCore_223.D("ԩՂՋԿԫՊԟԣՒԼԡԚ", (byte)95, 68);
                    NLoginType_020.d[8] = NLoginCore_138.F("։ւթ֒կիթզօ֖ծգ", (byte)95, 70);
                    NLoginType_020.d[9] = NLoginCore_223.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ՘ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՇԱԱգՁՍԷշչՏխՕի՗ցւրճ՜ջչԼ", (byte)95, 68);
                    NLoginType_020.d[10] = NLoginCore_138.A("ƨƓƘųƓƩŲƳƘſƔƅ", (byte)95, 65);
                    NLoginType_020.d[11] = NLoginCore_223.D("ԷՀԭԝԟԈՎՉԣԼԡԚ", (byte)95, 68);
                    NLoginType_020.d[12] = NLoginCore_201.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ՘ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՇեեԯԯՎզԲԵՇչԶչԽցԺՙՔցտՖՉ", (byte)95, 68);
                    NLoginType_020.d[13] = NLoginCore_091.D("ԿՅԼՅՈԻԈԦԤՇԔԚ", (byte)95, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_020.d[0] = NLoginCore_427.A("ƉƕůƯƨƊƚŸƺƧƋƒƒƿƤǁǇƯǈƆƢƓƐƑ", (byte)95, 65);
                    continue block7;
                }
                case 4: {
                    NLoginType_020.d[0] = NLoginCore_004.A("ưƖűƯƶƋƴƫƉƔŹƟƁƹƐƣưƥƢƥƲǉƐƑ", (byte)95, 65);
                }
            }
        }
    }
}

