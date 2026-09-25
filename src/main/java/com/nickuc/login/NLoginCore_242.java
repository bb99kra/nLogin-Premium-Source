/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
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

public class NLoginCore_242
extends NLoginCore_098 {
    private static long bm;
    private static int cv;
    private static int ce;
    private static long cp;
    private static long ct;
    private static long cd;
    private static int bu;
    private static long q;
    private static String[] var_java_lang_String_arr_e;
    private static int bd;
    private static int y;
    private static long ck;
    private static int bw;
    private static int bi;
    private static int bn;
    private static long p;
    private static int ao;
    private static long br;
    private static String[] f;
    private static int bz;
    private static long at;
    private static int cg;
    private static long ci;
    private static int cm;
    private static long bk;
    private static long ab;
    private static long bh;
    private static long ca;
    private static int var_int_e;
    private static long bo;
    private static long be;
    private static int cs;
    private static int cy;
    private static int co;
    private static int al;
    private static int cj;
    private static int cr;
    private static long by;
    private static int z;
    private static long o;

    private static void void_b() {
        int n;
        o = -2894469652052149417L;
        long l = o ^ 0xF1A909E8A7431678L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(50 + 19), (byte)(78 + 5), (byte)(34 + 13), (byte)(57 + 10), (byte)(38 + 28), (byte)(65 + 2), (byte)(10 + 37), (byte)(33 + 47), (byte)(13 + 62), 67, (byte)(70 + 13), (byte)(51 + 2), (byte)(70 + 10), (byte)(83 + 14), 100, (byte)(9 + 91), (byte)(56 + 49), (byte)(19 + 91), (byte)(39 + 64)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
                    NLoginCore_242.f[0] = NLoginCore_027.E("Գ՞ջծՊջԼձգՠէՐքՃ֌եթթփտլ՚՗՘", (byte)72, 69);
                    NLoginCore_242.f[1] = NLoginCore_091.A("żőŵŗŔŮũţƌƎŠŒŧťŏƖƂƎźƖƘƋŢţ", (byte)72, 65);
                    NLoginCore_242.f[2] = NLoginCore_223.D("ҽӹԅԁӳԀӗӈԋӼӌәӎӭԓӨԑԖԐӪӒӳӠӡ", (byte)72, 68);
                    NLoginCore_242.f[3] = NLoginCore_324.D("ҿԇӱӒӥӚӚӷԊӯӈӟӮӦӤӽӿӕӳӑӲԙӠӡ", (byte)72, 68);
                    NLoginCore_242.f[4] = NLoginCore_451.F("ՕՏՔժ՚ՑմտսՙձձՅվռ՗՞Նՙ՝ձ՚՗՘", (byte)72, 70);
                    NLoginCore_242.f[5] = NLoginCore_387.B("ƅƃŲłşŤņŝƅŃŲŎōŒŏŭƋŦŶƍƙƛŢţ", (byte)72, 66);
                    NLoginCore_242.f[6] = NLoginCore_076.B("ŚŽƄŦŋŸŧŚũŢƓŅŴœƎƌŬřŹřŶťŢţ", (byte)72, 66);
                    NLoginCore_242.f[7] = NLoginCore_004.F("ՒՒՈՕռՓՒ՟դՖՇֆ՜ևՕը֌՛ֆչթթՐՋրֆ֖֔ժէ՚֑", (byte)72, 70);
                    NLoginCore_242.f[8] = NLoginCore_559.C("ӞӷӶӉӕӋӆӆӛәӹӊӼӪӰԂӵԏӹӲԏԙӠӡ", (byte)72, 67);
                    NLoginCore_242.f[9] = NLoginCore_324.C("ҿәԃӴӺӻӭӉԅӥԊӻӧӞԕӾԀӲӸӪԕӳӠӡ", (byte)72, 67);
                    NLoginCore_242.f[10] = NLoginCore_201.A("ƇŃŗŞņŷƊƉŬŠůƅƎŠŒŏŭũūƃƊƑũƓŰŞŸƕƂƄƏƘ", (byte)72, 65);
                    NLoginCore_242.f[11] = NLoginCore_223.F("ՇՏծժՎրՠկՎռեե՟ֆյ՜րշՉ՘՚ժ՗՘", (byte)72, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_242.f[0] = NLoginCore_384.C("ҼӧԄӷӓԄӅӺӬөӹӧԁԊӪӱӱԎӢӗӚԚӼԏԐԌԍԋԓӹӜӰ", (byte)72, 67);
                    NLoginCore_242.f[1] = NLoginCore_076.E("ձՆժՌՉգ՞՘ցփՔաՕիցֈքպքէՈ՚՗՘", (byte)72, 69);
                    NLoginCore_242.f[2] = NLoginCore_091.E("ԴհռոժշՎԿւճՃՠևչՖՔբ՚՜գ֑՚՗՘", (byte)72, 69);
                    NLoginCore_242.f[3] = NLoginCore_559.A("ŁƉųŔŧŜŜŹƌűŋŊſƕŤƗƒƆŒŮűƋŢţ", (byte)72, 65);
                    NLoginCore_242.f[4] = NLoginCore_324.D("ӞӘӝӳӣӚӽԈԆӢӼԌӡԓӰӞӵԑԘԁӫӕԓԗӾӨԝӗәԟԟӗ", (byte)72, 68);
                    NLoginCore_242.f[5] = NLoginCore_223.B("ƅƃŲłşŤņŝƅŃźŪŞťŌŨŏƕŚƘƐŮŕƕƜŸūŜűŴŦŸ", (byte)72, 66);
                    NLoginCore_242.f[6] = NLoginCore_387.E("Տղչ՛Հխ՜Տ՞՗ֆչղը՟ՅպՍ՜֋եբՊ՝լէ֋դ՘ձֈս", (byte)72, 69);
                    NLoginCore_242.f[7] = NLoginCore_324.D("ӛӛӑӞԅӜӛӨӭӟӐԏӥԐӞӱԕӤԏԂӲөӒӯӿӶӟӿӵԗӡԗ", (byte)72, 68);
                    NLoginCore_242.f[8] = NLoginCore_223.C("ӞӷӶӉӕӋӆӆӛәӹԏӭԂӍӡӷӟԙԚԆԉӠӡ", (byte)72, 67);
                    NLoginCore_242.f[9] = NLoginCore_092.A("ŁśƅŶżŽůŋƇŧƍŎƄŞƓŴŠŹƐűŕƛŢţ", (byte)72, 65);
                    NLoginCore_242.f[10] = NLoginCore_324.A("ƇŃŗŞņŷƊƉŬŠůƅƎŠŒŏŭũūƃƊƘƐƑŷŭŘŹƎƣŲƕ", (byte)72, 65);
                    NLoginCore_242.f[11] = NLoginCore_091.E("ՇՏծժՎրՠկՎռզռդՆ՘։֋ր֏դա֐՗՘", (byte)72, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_242.f[0] = NLoginCore_559.A("ŹŵŚšŝŅƂƐƅŢżŗ", (byte)72, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_242.f[0] = NLoginCore_453.E("մռՍՉտԴսհՠո՝՝ցՃ՘ՙռ՗֊֎սժ՗՘", (byte)72, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_242.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.D("԰ՒՔԴ՘շկօձՀվմւռՅժ֌֋փ։փ՘", (byte)113, 68), NLoginCore_242.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.E("֐֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լ࣡ࣸअࣧ࣪࣬ंऌ࣮आւ", (byte)113, 69) + string + NLoginCore_223.B("ƛ", (byte)113, 66) + methodType.toString(), exception);
        }
    }

    public NLoginCore_242(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_c, (String)NLoginCore_242.c("㺀", (int)var_int_e, (long)(p ^ q)), (String)NLoginCore_242.c("㺃", (int)(y & z), (long)ab));
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_242.c("㺀", (int)(ce & cg), (long)ci));
        String string = resultSet.getString((String)NLoginCore_242.c("㺃", (int)cj, (long)ck));
        int n = resultSet.getInt((String)NLoginCore_242.c("㺆", (int)(cm & co), (long)cp));
        if (n != cr) {
            this.e(this.r, string, Integer.toString(n));
        }
        String string2 = resultSet.getString((String)NLoginCore_242.c("㺉", (int)cs, (long)ct));
        this.a(this.r, string, string2, null);
    }

    static {
        var_int_e = Integer.reverse(0);
        p = Long.reverse(-1522759798622049301L);
        q = Long.reverse(-1297036692682702848L);
        y = 8 >>> 3 | 8 << -3;
        z = (-1 >>> 106 | -1 << -106) & 0xFFFFFFFF;
        ab = Long.reverse(350737646364077035L);
        al = Integer.reverse(0x40000000);
        ao = -1 >>> 116 | -1 << -116;
        at = Long.reverse(350737646364077035L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(-1522759798622049301L);
        bh = Long.reverse(-1297036692682702848L);
        bi = 0x100000 >>> 50 | 0x100000 << -50;
        bk = Long.reverse(-1522759798622049301L);
        bm = Long.reverse(-1297036692682702848L);
        bn = Integer.reverse(-1610612736);
        bo = Long.reverse(-1522759798622049301L);
        br = Long.reverse(-1297036692682702848L);
        bu = 0xC000000 >>> 89 | 0xC000000 << -89;
        bw = -1 >>> 24 | -1 << -24;
        by = Long.reverse(350737646364077035L);
        bz = Integer.reverse(-536870912);
        ca = Long.reverse(-1522759798622049301L);
        cd = Long.reverse(-1297036692682702848L);
        ce = (0x40000000 >>> 251 | 0x40000000 << -251) & 0xFFFFFFFF;
        cg = (-1 >>> 180 | -1 << -180) & 0xFFFFFFFF;
        ci = Long.reverse(350737646364077035L);
        cj = (0x9000000 >>> 88 | 0x9000000 << -88) & 0xFFFFFFFF;
        ck = Long.reverse(350737646364077035L);
        cm = Integer.reverse(0x50000000);
        co = (-1 >>> 232 | -1 << ~232 + 1) & 0xFFFFFFFF;
        cp = Long.reverse(350737646364077035L);
        cr = Integer.reverse(-536870912);
        cs = Integer.reverse(-805306368);
        ct = Long.reverse(350737646364077035L);
        cv = Integer.reverse(0x30000000);
        cy = (98304 >>> 45 | 98304 << -45) & 0xFFFFFFFF;
        var_java_lang_String_arr_e = new String[cv];
        f = new String[cy];
        NLoginCore_242.void_b();
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        boolean bl = NLoginCore_2192.d(NLoginCore_242.c("㺀", (int)(al & ao), (long)at));
        if (bl) {
            String string = NLoginCore_2192.java_lang_String_b(NLoginCore_242.c("㺃", (int)bd, (long)(be ^ bh)));
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_242.c("㺆", (int)bi, (long)(bk ^ bm)));
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_242.c("㺉", (int)bn, (long)(bo ^ br)));
            String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_242.c("㺌", (int)(bu & bw), (long)by));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, string4, string2, string3, new Properties(), NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.i()));
        } else {
            File file = new File(this.java_io_File_b(), (String)NLoginCore_242.c("㺏", (int)bz, (long)(ca ^ cd)));
            this.d = NLoginCore_586.a(this.m, file, new Properties());
        }
    }

    private static String a(int n, long l) {
        l ^= 0x77L;
        l ^= 0xF1A909E8A7431678L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(50 + 19), (byte)(4 + 79), (byte)(4 + 43), (byte)(62 + 5), (byte)(6 + 60), (byte)(11 + 56), (byte)(32 + 15), (byte)(9 + 71), (byte)(11 + 64), (byte)(6 + 61), (byte)(36 + 47), (byte)(43 + 10), (byte)(13 + 67), (byte)(86 + 11), (byte)(85 + 15), (byte)(54 + 46), 105, (byte)(35 + 75), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(24 + 45), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.E("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫ն࣫ंएࣱࣶࣴऌखࣸऐ", (byte)123, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_242.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }
}

