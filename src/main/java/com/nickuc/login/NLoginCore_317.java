/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_098;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
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

public class NLoginCore_317
extends NLoginCore_098 {
    private static long bh;
    private static long bk;
    private static int y;
    private static int al;
    private static int bz;
    private static String[] f;
    private static int cb;
    private static long by;
    private static long p;
    private static int bd;
    private static int m;
    private static int bi;
    private static long br;
    private static long be;
    private static String[] var_java_lang_String_arr_e;
    private static long bm;
    private static long bs;
    private static int bp;
    private static long bo;
    private static int bl;
    private static long o;
    private static int ao;
    private static long ab;
    private static int bu;
    private static long at;
    private static long bv;
    private static int var_int_e;

    public NLoginCore_317(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_f, (String)NLoginCore_317.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_317.c("㺃", (int)y, (long)ab));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_317.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.A("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 65), NLoginCore_317.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࢾࢬࢨࣇࢭࣉࣄ࣋ࢦ࣌ࣈ࣑࣍Պ", (byte)54, 69) + string + NLoginCore_223.E("Ԭ", (byte)54, 69) + methodType.toString(), exception);
        }
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        File file = new File(this.java_io_File_b(), (String)NLoginCore_317.c("㺀", (int)(al & ao), (long)at));
        this.d = NLoginCore_586.a(this.m, file, new Properties());
    }

    private static void void_b() {
        int n;
        o = -6179872685713055750L;
        long l = o ^ 0x11EFF86E0D5A3040L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(63 + 6), (byte)(34 + 49), (byte)(11 + 36), (byte)(21 + 46), (byte)(61 + 5), (byte)(64 + 3), (byte)(4 + 43), (byte)(16 + 64), (byte)(74 + 1), (byte)(48 + 19), (byte)(15 + 68), 53, (byte)(38 + 42), (byte)(7 + 90), (byte)(9 + 91), (byte)(34 + 66), (byte)(51 + 54), (byte)(45 + 65), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_317.f[0] = NLoginCore_092.E("ԏԔԓԱՇԮՍ՚ԜԾՊբԝԾՑԦԤԚԴՈԩԴԱԲ", (byte)34, 69);
                    NLoginCore_317.f[1] = NLoginCore_091.C("ѱў҅҅ғҐѸҙѭҎҎҋҚҡѠҡѡѿҦҤҤҁѮѯ", (byte)34, 67);
                    NLoginCore_317.f[2] = NLoginCore_559.F("ԯԡՂԒՌՋԗԹ԰ԚՓԝԹԜԵԢ՜ԸԳԿԸժԱԲ", (byte)34, 70);
                    NLoginCore_317.f[3] = NLoginCore_575.F("ՄՌՑԻԷՄԝԾՑԪՒԼբ՞զՑ՝՝ԺԤԵՄԱԲ", (byte)34, 70);
                    NLoginCore_317.f[4] = NLoginCore_387.B("ěóĳě÷ĴİĒľłľıģĸġĨėŉėŇĢęĖė", (byte)34, 66);
                    NLoginCore_317.f[5] = NLoginCore_384.C("ҐѧҕѱѦї҅ѩѩҐѲѣ", (byte)34, 67);
                    NLoginCore_317.f[6] = NLoginCore_324.F("ԑԏՆԐ՘ՔԼԞՍԷՊԝԸՙ՜ՠՏԞՙԪլժԱԲ", (byte)34, 70);
                    NLoginCore_317.f[7] = NLoginCore_223.E("ՈԸ՚ՇԷԤԻԝԮԠՋԦ", (byte)34, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_317.f[0] = NLoginCore_091.F("ԏԔԓԱՇԮՍ՚ԜԾՊՍԜաԹ՟ՏԤԸՠԝ՚ԱԲ", (byte)34, 70);
                    NLoginCore_317.f[1] = NLoginCore_201.F("ԴԡՈՈՖՓԻ՜԰ՑՑԘՏԼդՂ՟ԢԼ՜՛ԴԱԲ", (byte)34, 70);
                    NLoginCore_317.f[2] = NLoginCore_223.F("ԯԡՂԒՌՋԗԹ԰ԚՖԝԶ՟ԤԴՇՇԷԨԻԴԱԲ", (byte)34, 70);
                    NLoginCore_317.f[3] = NLoginCore_427.D("ҁ҉ҎѸѴҁњѻҎѧҏѪҕѩјғҍћѸѥ҈ҁѮѯ", (byte)34, 68);
                    NLoginCore_317.f[4] = NLoginCore_004.B("ěóĳě÷ĴİĒľłĽĀľňķěĿŉōŅŁŏĖė", (byte)34, 66);
                    NLoginCore_317.f[5] = NLoginCore_384.A("īĭøĪĞĒĊŁĲĕĀńŇĵĤćğķĤėŊĩĖė", (byte)34, 65);
                    NLoginCore_317.f[6] = NLoginCore_384.A("öôīõĽĹġăĲĜħŇğĸĩŋĻăėŎĢŏĖė", (byte)34, 65);
                    NLoginCore_317.f[7] = NLoginCore_223.E("ԷԒԱՈԚ՘ԸԨՈ԰Ԛԟ՞բ՛Ԟ՚ՑժՕեԴԱԲ", (byte)34, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_317.f[0] = NLoginCore_027.A("óıľĸĔġĔłŃŀĸĒĤňĸĂĽăĨĭŐŒįņģģĳĴİŗĵĩ", (byte)34, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_317.f[0] = NLoginCore_427.E("ԑԑԹԢՃԱԕԕԙԠԾԡԬ՗ԯԶ՚ՅԦՃԵ՚ԱԲ", (byte)34, 69);
                }
            }
        }
    }

    static {
        var_int_e = 0 >>> 10 | 0 << ~10 + 1;
        m = Integer.reverse(-1);
        p = Long.reverse(2015632717855931477L);
        y = 0x10000000 >>> 124 | 0x10000000 << -124;
        ab = Long.reverse(2015632717855931477L);
        al = 4 >>> 33 | 4 << ~33 + 1;
        ao = (-1 >>> 178 | -1 << -178) & 0xFFFFFFFF;
        at = Long.reverse(2015632717855931477L);
        bd = Integer.reverse(-1073741824);
        be = Long.reverse(6915549112435031125L);
        bh = Long.reverse(0x4400000000000000L);
        bi = Integer.reverse(0x20000000);
        bk = Long.reverse(2015632717855931477L);
        bl = -2147483646 >>> 255 | -2147483646 << ~255 + 1;
        bm = Long.reverse(6915549112435031125L);
        bo = Long.reverse(0x4400000000000000L);
        bp = Integer.reverse(0x60000000);
        br = Long.reverse(6915549112435031125L);
        bs = Long.reverse(0x4400000000000000L);
        bu = 0x3800000 >>> 183 | 0x3800000 << ~183 + 1;
        bv = Long.reverse(6915549112435031125L);
        by = Long.reverse(0x4400000000000000L);
        bz = 0x40000000 >>> 219 | 0x40000000 << -219;
        cb = 1 >>> 221 | 1 << -221;
        var_java_lang_String_arr_e = new String[bz];
        f = new String[cb];
        NLoginCore_317.void_b();
    }

    private static String a(int n, long l) {
        l ^= 0x22L;
        l ^= 0x11EFF86E0D5A3040L;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(60 + 9), (byte)(50 + 33), (byte)(3 + 44), (byte)(12 + 55), (byte)(41 + 25), (byte)(18 + 49), (byte)(12 + 35), (byte)(79 + 1), (byte)(43 + 32), (byte)(27 + 40), (byte)(17 + 66), (byte)(30 + 23), (byte)(47 + 33), (byte)(48 + 49), (byte)(77 + 23), 100, (byte)(12 + 93), 110, (byte)(77 + 26)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(69 + 14)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_453.E("ԽՊՉԌՌՈՃՌ՗ՆԓՑՕՎՑ՗ԙࢦ࢔࢐ࢯ࢕ࢱࢬࢳࢎࢴࢰࢹࢵ", (byte)30, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_317.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    public File java_io_File_b() {
        return super.java_io_File_b();
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_317.c("㺀", (int)bd, (long)(be ^ bh)));
        String string = resultSet.getString((String)NLoginCore_317.c("㺃", (int)bi, (long)bk));
        String string2 = resultSet.getString((String)NLoginCore_317.c("㺆", (int)bl, (long)(bm ^ bo)));
        long l = resultSet.getLong((String)NLoginCore_317.c("㺉", (int)bp, (long)(br ^ bs)));
        long l2 = resultSet.getLong((String)NLoginCore_317.c("㺌", (int)bu, (long)(bv ^ by)));
        this.a(this.r, string, string2, null, (ForceRegisterConfig ForceRegisterConfig2) -> ForceRegisterConfig2.a(l2, l));
    }
}

