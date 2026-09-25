/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.enums.event.UnregisterSource
 *  com.nickuc.login.api.enums.event.UpdatePasswordSource
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UnregisterSource;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginType_032;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_025
extends NLoginType_032 {
    private static int bu;
    private static long ay;
    private static int cc;
    private static int bf;
    private static int cj;
    private static int ca;
    private static int bh;
    private static int br;
    private static int cg;
    private static int bo;
    private static int bj;
    private static int bp;
    private static int ci;
    private static int cf;
    private static long ce;
    private static int av;
    private static long be;
    private static int ch;
    private static int cl;
    private static int bw;
    private static long bd;
    private static String[] d;
    private static long bb;
    private static long bi;
    private static int bq;
    private static int bt;
    private static int by;
    private static int bl;
    private static int aw;
    private static int bc;
    private static long cb;
    private static long ax;
    private static long bg;
    private static int bm;
    private static int cd;
    private static int bz;
    private static int bn;
    private static int bk;
    private static int cn;
    private static int cm;
    private static int a;
    private static int bv;
    private static int az;
    private static int co;
    private static int bs;
    private static String[] c;
    private static long ba;
    private static int ck;
    private static int cp;
    private static int bx;
    private static long e;

    private static void b() {
        int n;
        e = -5348715874303131987L;
        long l = e ^ 0xC182A458AE19050FL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(34 + 35), (byte)(6 + 77), (byte)(11 + 36), (byte)(47 + 20), (byte)(47 + 19), (byte)(60 + 7), (byte)(25 + 22), (byte)(42 + 38), (byte)(68 + 7), (byte)(26 + 41), (byte)(22 + 61), (byte)(21 + 32), (byte)(73 + 7), 97, 100, (byte)(90 + 10), (byte)(91 + 14), (byte)(98 + 12), (byte)(74 + 29)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_025.d[0] = NLoginCore_451.D("ӎӯӽӚҵӱӑӍӂӖӹӣӑӗԂӴӡәӧԌӟӬӠԏӊԓԔӿԋӵӗӰ", (byte)68, 68);
                    NLoginType_025.d[1] = NLoginCore_453.A("ŔŊŰĿţŦŏţŝŧƀŏ", (byte)68, 65);
                    NLoginType_025.d[2] = NLoginCore_091.B("ŸœśŭŌųŹſƄŘƄŏ", (byte)68, 66);
                    NLoginType_025.d[3] = NLoginCore_453.F("ՍՃթԸ՜՟Ո՜ՖՠչՈ", (byte)68, 70);
                    NLoginType_025.d[4] = NLoginCore_004.E("ժՇՈԻ՞Խ՗ԷԻատբօՀմՑևՃ՞պՖռՓՔ", (byte)68, 69);
                    NLoginType_025.d[5] = NLoginCore_027.B("ƀŪžřŎŷſŀŞƉŪŏ", (byte)68, 66);
                    NLoginType_025.d[6] = NLoginCore_173.F("ՊՇՈՓչ՞սՑի՛մվփՅՄթ՚ռռլե՛շչսք։֓ֆհիհմ֌՛՜։ձ֛֎֒ծ֛խֆշյ՞բգ֩֡֟ջ֢վ֯֜ևճհ֌֩ն", (byte)68, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_025.d[0] = NLoginCore_091.D("ӎӯӽӚҵӱӑӍӂӖӹӣӑӗԂӴӡәӧԌӟӭӢԃӄԂԐӍԊӓӘԈ", (byte)68, 68);
                    NLoginType_025.d[1] = NLoginCore_559.B("ŰĺŘœŰŁžŜŨŗŪŏ", (byte)68, 66);
                    NLoginType_025.d[2] = NLoginCore_451.B("ůĳŹŵŤŃűńœũŒŏ", (byte)68, 66);
                    NLoginType_025.d[3] = NLoginCore_201.D("ұӏӛӸҽӶӬӡӻӀӮӉ", (byte)68, 68);
                    NLoginType_025.d[4] = NLoginCore_387.A("űŎŏłťńŞľłŨƆžšŵƀşůƑůŨƊƃŚś", (byte)68, 65);
                    NLoginType_025.d[5] = NLoginCore_173.A("ĽŬŸĿřźŶŢőŤŇŕƃōńźůŽŲƓƍƃŚś", (byte)68, 65);
                    NLoginType_025.d[6] = NLoginCore_384.A("őŎŏŚƀťƄŘŲŢŻƅƊŌŋŰšƃƃųŬŢžƀƄƋƐƚƍŷŲŷŻƓŢţƐŸƢƕƙŵƢŴƍžżťũŪưƨƦƄƞƲƮƕŬƔƭƱŴƛ", (byte)68, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_025.d[0] = NLoginCore_091.C("ӑӶӏӌөӛӐӹӻӗӺӉ", (byte)68, 67);
                    continue block7;
                }
                case 4: {
                    NLoginType_025.d[0] = NLoginCore_091.F("շՐՅ՗թվտՙ՚տ՛Ո", (byte)68, 70);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        block11: {
            String string2;
            if (!(NLoginInterface_0422 instanceof NLoginCore_277)) {
                Object[] objectArray = new Object[a];
                objectArray[NLoginType_025.av] = (String)NLoginType_025.c("㺀", (int)aw, (long)(ax ^ ay)) + (String)(stringArray.length > 0 ? NLoginType_025.c("㺃", (int)az, (long)(ba ^ bb)) : NLoginType_025.c("㺆", (int)bc, (long)(bd ^ be))) + String.join((CharSequence)NLoginType_025.c("㺉", (int)bf, (long)bg), stringArray);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
                return;
            }
            NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
            if (stringArray.length == 0) {
                Object[] objectArray = new Object[bj];
                objectArray[NLoginType_025.bk] = string;
                objectArray[NLoginType_025.bl] = NLoginCore_150.a(NLoginCore_374.D, NLoginCore_277, new Object[bm]);
                String string3 = String.format((String)NLoginType_025.c("㺌", (int)bh, (long)bi), objectArray);
                Object[] objectArray2 = new Object[bn];
                objectArray2[NLoginType_025.bo] = string3;
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.x, objectArray2);
                return;
            }
            NLoginCore_509 NLoginCore_5092 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
            if (!ForceRegisterConfig2.boolean_h() || ForceRegisterConfig2.t() && !ForceRegisterConfig2.s()) {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.t, new Object[bp]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            NLoginCore_291 NLoginCore_2912 = ((NLoginType_008)this.a).com_nickuc_login_NLoginCore_291_a();
            if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2, string2 = stringArray[bq])) {
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.P, new Object[br]);
                NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                return;
            }
            String string4 = NLoginCore_277.getName();
            UUID uUID = NLoginCore_277.java_util_UUID_a();
            Object[] objectArray = new Object[bs];
            objectArray[NLoginType_025.bt] = NLoginCore_277;
            objectArray[NLoginType_025.bu] = uUID;
            objectArray[NLoginType_025.bv] = string4;
            objectArray[NLoginType_025.bw] = UnregisterSource.BY_PLAYER;
            if (!((NLoginType_008)this.a).a(EventEnum.UNREGISTER, objectArray)) break block11;
            Object object = ForceRegisterConfig2.var_java_lang_Object_c;
            synchronized (object) {
                if (!ForceRegisterConfig2.boolean_h()) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.t, new Object[bx]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                if (!NLoginCore_2912.boolean_a(ForceRegisterConfig2)) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[by]);
                    NLoginCore_150.a(NLoginCore_277, NLoginCore_119.F);
                    return;
                }
                NLoginCore_370.b((String)NLoginType_025.c("㺏", (int)(bz & ca), (long)cb) + string4 + (String)NLoginType_025.c("㺒", (int)(cc & cd), (long)ce) + NLoginCore_277.ac(), new Object[cf]);
                try {
                    Object[] objectArray3 = new Object[cg];
                    objectArray3[NLoginType_025.ch] = NLoginCore_277;
                    objectArray3[NLoginType_025.ci] = uUID;
                    objectArray3[NLoginType_025.cj] = string4;
                    objectArray3[NLoginType_025.ck] = null;
                    objectArray3[NLoginType_025.cl] = UpdatePasswordSource.BY_PLAYER;
                    ((NLoginType_008)this.a).a(EventEnum.PASSWORD_UPDATE_EVENT, objectArray3);
                    NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[cm]));
                }
                catch (Throwable throwable) {
                    NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.q, NLoginCore_277, new Object[cn]));
                    throw throwable;
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x35L;
        l ^= 0xC182A458AE19050FL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(55 + 14), (byte)(3 + 80), (byte)(20 + 27), (byte)(22 + 45), (byte)(50 + 16), (byte)(55 + 12), (byte)(38 + 9), (byte)(56 + 24), (byte)(74 + 1), 67, (byte)(2 + 81), (byte)(12 + 41), (byte)(68 + 12), (byte)(36 + 61), (byte)(19 + 81), (byte)(39 + 61), (byte)(104 + 1), (byte)(34 + 76), (byte)(34 + 69)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(24 + 44), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.F("ԭԺԹӼԼԸԳԼՇԶԃՁՅԾՁՇԉ࡮ࢍࢣ࢖࢚ࡴࡵ࢘ࢤࡸ࢘࢘࢟ࢎ", (byte)14, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_025.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public NLoginType_025(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662);
        this.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_025.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.B("¿áãÃçĆþĔĀÏčăđċÔùěĚĒĘĒç", (byte)12, 66), NLoginType_025.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.A("úćĆÉĉąĀĉĔăÐĎĒċĎĔÖлњѰѣѧстѥѱхѥѥѬћð", (byte)12, 65) + string + NLoginCore_223.A("Ñ", (byte)12, 65) + methodType.toString(), exception);
        }
    }

    static {
        a = Integer.reverse(Integer.MIN_VALUE);
        av = Integer.reverse(0);
        aw = 0 >>> 207 | 0 << ~207 + 1;
        ax = Long.reverse(-5369181626484808787L);
        ay = Long.reverse(-6052837899185946624L);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Long.reverse(-5369181626484808787L);
        bb = Long.reverse(-6052837899185946624L);
        bc = Integer.reverse(0x40000000);
        bd = Long.reverse(-5369181626484808787L);
        be = Long.reverse(-6052837899185946624L);
        bf = 3 >>> 160 | 3 << ~160 + 1;
        bg = Long.reverse(1836577777307984813L);
        bh = (0x8000000 >>> 25 | 0x8000000 << -25) & 0xFFFFFFFF;
        bi = Long.reverse(1836577777307984813L);
        bj = Integer.reverse(0x40000000);
        bk = Integer.reverse(0);
        bl = 0x40000000 >>> 126 | 0x40000000 << -126;
        bm = 0 >>> 50 | 0 << -50;
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = Integer.reverse(0);
        bp = Integer.reverse(0);
        bq = Integer.reverse(0);
        br = 0 >>> 187 | 0 << -187;
        bs = 262144 >>> 16 | 262144 << ~16 + 1;
        bt = Integer.reverse(0);
        bu = (256 >>> 232 | 256 << -232) & 0xFFFFFFFF;
        bv = Integer.reverse(0x40000000);
        bw = 6 >>> 33 | 6 << ~33 + 1;
        bx = 0 >>> 246 | 0 << ~246 + 1;
        by = Integer.reverse(0);
        bz = 0x50000000 >>> 60 | 0x50000000 << -60;
        ca = (-1 >>> 121 | -1 << ~121 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(1836577777307984813L);
        cc = Integer.reverse(0x60000000);
        cd = Integer.reverse(-1);
        ce = Long.reverse(1836577777307984813L);
        cf = (0 >>> 150 | 0 << ~150 + 1) & 0xFFFFFFFF;
        cg = (0xA000000 >>> 217 | 0xA000000 << ~217 + 1) & 0xFFFFFFFF;
        ch = Integer.reverse(0);
        ci = Integer.reverse(Integer.MIN_VALUE);
        cj = 1024 >>> 105 | 1024 << -105;
        ck = 0x300000 >>> 116 | 0x300000 << -116;
        cl = (0x8000000 >>> 217 | 0x8000000 << -217) & 0xFFFFFFFF;
        cm = 0 >>> 240 | 0 << -240;
        cn = Integer.reverse(0);
        co = (896 >>> 231 | 896 << -231) & 0xFFFFFFFF;
        cp = (28672 >>> 12 | 28672 << ~12 + 1) & 0xFFFFFFFF;
        c = new String[co];
        d = new String[cp];
        NLoginType_025.b();
    }
}

