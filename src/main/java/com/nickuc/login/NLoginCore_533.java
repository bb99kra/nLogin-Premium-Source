/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_533
extends NLoginCore_098 {
    private static String[] f;
    private static int ce;
    private static long be;
    private static long o;
    private static long br;
    private static int bp;
    private static long au;
    private static int bz;
    private static int al;
    private static long p;
    private static long bs;
    private static long by;
    private static int y;
    private static int bd;
    private static long ab;
    private static long q;
    private static long bk;
    private static int bu;
    private static long at;
    private static int var_int_e;
    private static long bh;
    private static int bj;
    private static long cd;
    private static long bv;
    private static int cb;
    private static long ck;
    private static int cj;
    private static int bi;
    private static int cm;
    private static long bo;
    private static int co;
    private static String[] var_java_lang_String_arr_e;
    private static long bm;
    private static long ci;
    private static int bl;
    private static long cf;
    private static long cl;

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        String string = NLoginCore_2192.a(NLoginCore_533.c("㺀", (int)al, (long)(at ^ au)), (String)NLoginCore_533.c("㺃", (int)bd, (long)(be ^ bh)));
        String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_533.c("㺆", (int)(bi & bj), (long)bk));
        String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_533.c("㺉", (int)bl, (long)(bm ^ bo)));
        String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_533.c("㺌", (int)bp, (long)(br ^ bs)));
        this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, string2, string3, string4, new Properties(), NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.i()));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_533.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.A("ĿšţŃŧƆžƔƀŏƍƃƑƋŔŹƛƚƒƘƒŧ", (byte)76, 65), NLoginCore_533.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.D("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘ࡟ࡣ࡫ࡓࡰࡪࡓࡹࡷࡺࡲӯ", (byte)76, 68) + string + NLoginCore_451.F("Ղ", (byte)76, 70) + methodType.toString(), exception);
        }
    }

    @Override
    protected void b(ResultSet resultSet) {
        JSONObject jSONObject = new JSONObject(resultSet.getString((String)NLoginCore_533.c("㺀", (int)bu, (long)(bv ^ by))));
        this.r = jSONObject.getString((String)NLoginCore_533.c("㺃", (int)(bz & cb), (long)cd));
        String string = jSONObject.getString((String)NLoginCore_533.c("㺆", (int)ce, (long)(cf ^ ci)));
        this.a(this.r, (String)NLoginCore_533.c("㺉", (int)cj, (long)(ck ^ cl)) + string, null, null);
    }

    private static String a(int n, long l) {
        l ^= 0x72L;
        l ^= 0xF25D14E512DB0AFDL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(42 + 27), (byte)(6 + 77), (byte)(6 + 41), (byte)(19 + 48), (byte)(5 + 61), (byte)(38 + 29), (byte)(25 + 22), (byte)(27 + 53), (byte)(16 + 59), (byte)(43 + 24), (byte)(7 + 76), (byte)(11 + 42), 80, (byte)(75 + 22), 100, (byte)(23 + 77), (byte)(48 + 57), (byte)(100 + 10), (byte)(68 + 35)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.A("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎӕәӡӉӦӠӉӯӭӰӨ", (byte)72, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_533.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    static {
        var_int_e = (0 >>> 170 | 0 << -170) & 0xFFFFFFFF;
        p = Long.reverse(-5391377290451550117L);
        q = Long.reverse(0x4E00000000000000L);
        y = Integer.reverse(Integer.MIN_VALUE);
        ab = Long.reverse(-347345707796594597L);
        al = (2048 >>> 74 | 2048 << -74) & 0xFFFFFFFF;
        at = Long.reverse(-5391377290451550117L);
        au = Long.reverse(0x4E00000000000000L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-5391377290451550117L);
        bh = Long.reverse(0x4E00000000000000L);
        bi = (2 >>> 127 | 2 << ~127 + 1) & 0xFFFFFFFF;
        bj = (-1 >>> 164 | -1 << ~164 + 1) & 0xFFFFFFFF;
        bk = Long.reverse(-347345707796594597L);
        bl = (80 >>> 68 | 80 << -68) & 0xFFFFFFFF;
        bm = Long.reverse(-5391377290451550117L);
        bo = Long.reverse(0x4E00000000000000L);
        bp = 0x3000000 >>> 183 | 0x3000000 << ~183 + 1;
        br = Long.reverse(-5391377290451550117L);
        bs = Long.reverse(0x4E00000000000000L);
        bu = 0xE000000 >>> 185 | 0xE000000 << ~185 + 1;
        bv = Long.reverse(-5391377290451550117L);
        by = Long.reverse(0x4E00000000000000L);
        bz = Integer.reverse(0x10000000);
        cb = Integer.reverse(-1);
        cd = Long.reverse(-347345707796594597L);
        ce = (1152 >>> 167 | 1152 << ~167 + 1) & 0xFFFFFFFF;
        cf = Long.reverse(-5391377290451550117L);
        ci = Long.reverse(0x4E00000000000000L);
        cj = Integer.reverse(0x50000000);
        ck = Long.reverse(-5391377290451550117L);
        cl = Long.reverse(0x4E00000000000000L);
        cm = 0x160000 >>> 113 | 0x160000 << ~113 + 1;
        co = Integer.reverse(-805306368);
        var_java_lang_String_arr_e = new String[cm];
        f = new String[co];
        NLoginCore_533.void_b();
    }

    private static void void_b() {
        int n;
        o = -2737941102402227027L;
        long l = o ^ 0xF25D14E512DB0AFDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(67 + 1), (byte)(56 + 13), (byte)(68 + 15), (byte)(15 + 32), (byte)(55 + 12), (byte)(17 + 49), (byte)(2 + 65), (byte)(46 + 1), (byte)(21 + 59), (byte)(13 + 62), (byte)(8 + 59), 83, (byte)(32 + 21), (byte)(73 + 7), (byte)(44 + 53), (byte)(68 + 32), (byte)(74 + 26), 105, (byte)(72 + 38), (byte)(99 + 4)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_533.f[0] = NLoginCore_091.C("ӃҡӫӎӡӛӬӱӀӊӰҷӰӓӍӸӶӏҹӉӋӋӈӉ", (byte)64, 67);
                    NLoginCore_533.f[1] = NLoginCore_575.E("ԽդԴոՑչԳՆզժոԲրնՠփտևւՒՔոՏՐ", (byte)64, 69);
                    NLoginCore_533.f[2] = NLoginCore_173.F("ՂՁՀածՓնղԹԶՐժԽՏխվշդհհթոՏՐ", (byte)64, 70);
                    NLoginCore_533.f[3] = NLoginCore_110.D("ӦӰӀӟӁӃҭӂҴӯӐҸӹӻӨҹӫӔӯӟӷӛӈӉ", (byte)64, 68);
                    NLoginCore_533.f[4] = NLoginCore_453.A("ŉœŒŖķŚŋũŭŴŞŗųŔűśťŁŜƄŋŻŒœ", (byte)64, 65);
                    NLoginCore_533.f[5] = NLoginCore_138.F("գԴծՄՓՆ՚զձէՔցյ՜ՕՄՀԼդղՠՒՏՐ", (byte)64, 70);
                    NLoginCore_533.f[6] = NLoginCore_223.B("ŊŚŃūŉŰűķřķſŌŜĿŝŤťŶƀŤƍŕŒœ", (byte)64, 66);
                    NLoginCore_533.f[7] = NLoginCore_427.D("ӋӟӐұҮӉӊӮӳұӪҽ", (byte)64, 68);
                    NLoginCore_533.f[8] = NLoginCore_446.E("ԧՋԲմԷխռյԯճԺրՊվՂՙօ՜պՖպոՏՐ", (byte)64, 69);
                    NLoginCore_533.f[9] = NLoginCore_091.B("őŭňĶŬŏŶŕŋŏĸőšŞſųŢŚŕśřťŒœ", (byte)64, 66);
                    NLoginCore_533.f[10] = NLoginCore_138.A("ŨĴųŗŚůŦŶŞœŬŇ", (byte)64, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_533.f[0] = NLoginCore_575.B("ōīŵŘūťŶŻŊŔŹŝļžńųŠŻųŵŞƋŒœ", (byte)64, 66);
                    NLoginCore_533.f[1] = NLoginCore_223.E("ԽդԴոՑչԳՆզժյԹՕպԺԾԾոնվՕֈՏՐ", (byte)64, 69);
                    NLoginCore_533.f[2] = NLoginCore_138.D("һҺҹӚӧӌӯӫҲүӉӎӖӎӤҶӜӖӕӷӽӱӈӉ", (byte)64, 68);
                    NLoginCore_533.f[3] = NLoginCore_384.F("խշՇզՈՊԴՉԻնՙ՝՜խ՞շտԿ՗ոզզՙ՘՘֎ֆժՋսփք", (byte)64, 70);
                    NLoginCore_533.f[4] = NLoginCore_446.F("ՆՐՏՓԴ՗Ոզժձ՝ԺկԺՍտԻսհոքֆջ՘ՖՉՍ֎ղՏվ՝", (byte)64, 70);
                    NLoginCore_533.f[5] = NLoginCore_559.C("ӜҭӧҽӌҿӓӟӪӠӏӓӌҲӑӑӞӝӕӡӭәӲҷӝӜԃӽӳӸӘӭ", (byte)64, 67);
                    NLoginCore_533.f[6] = NLoginCore_384.A("ŊŚŃūŉŰűķřķŽŋŃŮŢŦŗŔşœņŻŒœ", (byte)64, 65);
                    NLoginCore_533.f[7] = NLoginCore_324.A("łŰĺťļŇĹŘĹŁŚŇ", (byte)64, 65);
                    NLoginCore_533.f[8] = NLoginCore_223.C("ҠӄҫӭҰӦӵӮҨӬҳӇӶӷӯҳӳӮӡӯӣӛӈӉ", (byte)64, 67);
                    NLoginCore_533.f[9] = NLoginCore_384.C("ӇӣҾҬӢӅӬӋӁӅҮӊӕҺӲӨӳӎӹӠӂԁӈӉ", (byte)64, 67);
                    NLoginCore_533.f[10] = NLoginCore_446.A("ŴŲŻťőŲŕſŚŰŠŻŕŰśžŁƉƆŠŬťŒœ", (byte)64, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_533.f[0] = NLoginCore_387.F("ծեի԰ծեԳՎԷԽըԾՑԼՀաՀ՘ափժ՟Յֈնռբ֍֒֏աՐ", (byte)64, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_533.f[0] = NLoginCore_324.E("ՀՋըԵծՐխՆԻյՙաՋգՁՏճյըՑաֈՏՐ", (byte)64, 69);
                }
            }
        }
    }

    public NLoginCore_533(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_e, (String)NLoginCore_533.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_533.c("㺃", (int)y, (long)ab));
    }
}

