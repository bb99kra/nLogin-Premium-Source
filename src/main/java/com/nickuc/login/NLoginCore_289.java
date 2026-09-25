/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_586;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
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
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
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

public class NLoginCore_289
extends NLoginCore_098 {
    private static int cj;
    private static String[] var_java_lang_String_arr_e;
    private static int bn;
    private static int cy;
    private static int ce;
    private static int bg;
    private static int cb;
    private static long cu;
    private static int bi;
    private static int ao;
    private static long bo;
    private static int m;
    private static int cv;
    private static long ab;
    private static int bu;
    private static int bp;
    private static long o;
    private static int cr;
    private static long br;
    private static int al;
    private static String[] f;
    private static long cp;
    private static long bs;
    private static long bk;
    private static int bd;
    private static long by;
    private static long ct;
    private static int cg;
    private static long at;
    private static int bf;
    private static long bv;
    private static long cd;
    private static long ci;
    private static int y;
    private static int var_int_e;
    private static long ck;
    private static long bm;
    private static int bz;
    private static long p;
    private static int co;
    private static int cm;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_289.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.D("ђѴѶіѺҙґҧғѢҠҖҤҞѧҌҮҭҥҫҥѺ", (byte)39, 68), NLoginCore_289.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČѾѺѳ҉ҚҡҚ҅ҏҥҪģ", (byte)39, 66) + string + NLoginCore_223.B("ć", (byte)39, 66) + methodType.toString(), exception);
        }
    }

    private static void void_b() {
        int n;
        o = -8109010485196448957L;
        long l = o ^ 0x9CBB64C6691985AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(35 + 34), (byte)(78 + 5), 47, (byte)(53 + 14), (byte)(46 + 20), (byte)(21 + 46), (byte)(32 + 15), (byte)(37 + 43), (byte)(3 + 72), (byte)(53 + 14), 83, (byte)(35 + 18), (byte)(58 + 22), (byte)(92 + 5), (byte)(55 + 45), (byte)(57 + 43), (byte)(29 + 76), (byte)(23 + 87), (byte)(24 + 79)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_289.f[0] = NLoginCore_110.C("՗զՊծզըբժթՅՠԭԸԯթՉթՒ՟թ՜ՙՆՇ", (byte)106, 67);
                    NLoginCore_289.f[1] = NLoginCore_387.D("ի՟ԹԪլհբԬԯՌ՗ոոՎյՆԺնզի՘ՙՆՇ", (byte)106, 68);
                    NLoginCore_289.f[2] = NLoginCore_559.F("֔ո՗֓ր֥֡՟֥֡սճն֝ն֪օ֠ֆ֭լֲչպ", (byte)106, 70);
                    NLoginCore_289.f[3] = NLoginCore_092.C("աՅԤՠՍծղԬծղՍԯթբ԰ճՔԵԵպԽկՆՇ", (byte)106, 67);
                    NLoginCore_289.f[4] = NLoginCore_223.F("֔ո՗֓ր֥֡՟֥֡րը֖֜ս֬ռջջֲֳ֤֨֓֫և֌֤շ֏յ֧", (byte)106, 70);
                    NLoginCore_289.f[5] = NLoginCore_027.E("֔ո՗֓ր֥֡՟֥֡վ֦֝֝֫եկժխօսռչպ", (byte)106, 69);
                    NLoginCore_289.f[6] = NLoginCore_027.F("֔ո՗֓ր֥֡՟֥֡տդ֭֬֫֌֧֬֜ւճֲչպ", (byte)106, 70);
                    NLoginCore_289.f[7] = NLoginCore_223.D("՛ԷՅիէԧխՂՑԵՎՏԴթՃէպՋՐրըտՆՇ", (byte)106, 68);
                    NLoginCore_289.f[8] = NLoginCore_091.E("֎֔պպաշեմսբչծ", (byte)106, 69);
                    NLoginCore_289.f[9] = NLoginCore_387.B("ƄǉƊƟǏƽƚǀƱǉǔƛ", (byte)106, 66);
                    NLoginCore_289.f[10] = NLoginCore_091.C("ՂՙԾդԾՈ՟եԿաըԻ", (byte)106, 67);
                    NLoginCore_289.f[11] = NLoginCore_076.B("ƬƉƛƋƱƠưƉǌƪƢƛ", (byte)106, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_289.f[0] = NLoginCore_384.C("՗զՊծզըբժթՅբՖՁԯղԻ՚ոկլձՙՆՇ", (byte)106, 67);
                    NLoginCore_289.f[1] = NLoginCore_223.F("֞֒լ՝֣֟֕՟բտ։֔թ֢֪ծ֗֙վ֦֢֨չպ", (byte)106, 70);
                    NLoginCore_289.f[2] = NLoginCore_575.B("ǁƥƄǀƭǎǒƌǎǒƫƓƬƭǇǚƮƼǈǞǡǋƟƢƿǔǀƧƻǢƽǦ", (byte)106, 66);
                    NLoginCore_289.f[3] = NLoginCore_027.A("ǁƥƄǀƭǎǒƌǎǒƫƩǅǂǌǉǄǓƮƼƺǋǌǐǡǜƮǜƞǙƷǀ", (byte)106, 65);
                    NLoginCore_289.f[4] = NLoginCore_559.A("ǁƥƄǀƭǎǒƌǎǒƭƕǃǉƪǙƩƨƨǕǀǖƯǚǞǓƜǑǒǨƜƵ", (byte)106, 65);
                    NLoginCore_289.f[5] = NLoginCore_324.A("ǁƥƄǀƭǎǒƌǎǒƪƦǆǄǎƲǅǆǑƟǏƪƸƾǤưǜƧƷƤǣǡ", (byte)106, 65);
                    NLoginCore_289.f[6] = NLoginCore_110.A("ǁƥƄǀƭǎǒƌǎǒƬǋƥǕǗƺƫƳƶƬƶưǘǚƴǍǑǦƼƾǋƶ", (byte)106, 65);
                    NLoginCore_289.f[7] = NLoginCore_223.F("֎ժո֚֞՚֠յքըւ֩֙ր֍֛֭֮֫֩տֲչպ", (byte)106, 70);
                    NLoginCore_289.f[8] = NLoginCore_575.E("֘պ։ցՕ֚կչ֔՟֘֩ռրֆ֤֡֩խְե֌չպ", (byte)106, 69);
                    NLoginCore_289.f[9] = NLoginCore_027.C("թԶՀՅՁէԾ՝ԪեԾՠԮկժԱ՝ԺԺթՕտՆՇ", (byte)106, 67);
                    NLoginCore_289.f[10] = NLoginCore_559.E("ղ֏յկ֠֔ե՜֔֒ՠծ", (byte)106, 69);
                    NLoginCore_289.f[11] = NLoginCore_324.E("՞յչտմչօպֈ՞գեևն֢փ֯ևժժ֊֌չպ", (byte)106, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_289.f[0] = NLoginCore_004.C("բԶԽԺԧՋԺՒաԲԭշշՑՌԴ՗ՒՏՕՙՕՠջջՍևՠպվքֆ", (byte)106, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_289.f[0] = NLoginCore_384.D("՜ԨԧգիծԫՓԽժՎԻ", (byte)106, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x20L;
        l ^= 0x9CBB64C6691985AL;
        if (var_java_lang_String_arr_e[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(39 + 30), (byte)(59 + 24), (byte)(41 + 6), (byte)(19 + 48), (byte)(47 + 19), (byte)(14 + 53), (byte)(32 + 15), (byte)(45 + 35), (byte)(69 + 6), (byte)(52 + 15), 83, 53, (byte)(78 + 2), (byte)(95 + 2), (byte)(37 + 63), (byte)(20 + 80), (byte)(84 + 21), (byte)(98 + 12), (byte)(63 + 40)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.C("жутЅхсмхѐпЌъючъѐВބހݹޏޠާޠދޕޫް", (byte)10, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_289.var_java_lang_String_arr_e[n] = new String(cipher.doFinal(Base64.getDecoder().decode(f[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_e[n];
    }

    @Override
    protected void c(NLoginCore_219 NLoginCore_2192) {
        int n;
        int n2 = n = NLoginCore_2192.int_a(NLoginCore_289.c("㺀", (int)(al & ao), (long)at)) == bd ? bf : bg;
        if (n != 0) {
            String string = NLoginCore_2192.java_lang_String_b(NLoginCore_289.c("㺃", (int)bi, (long)(bk ^ bm)));
            String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_289.c("㺆", (int)bn, (long)bo));
            String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_289.c("㺉", (int)bp, (long)(br ^ bs)));
            String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_289.c("㺌", (int)bu, (long)(bv ^ by)));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(string, string2, string3, string4, new Properties(), NLoginCore_036.var_com_nickuc_login_NLoginCore_036_d.i()));
        } else {
            File file = new File(this.java_io_File_b(), (String)NLoginCore_289.c("㺏", (int)(bz & cb), (long)cd));
            this.d = NLoginCore_586.a(this.m, file, new Properties());
        }
    }

    public NLoginCore_289(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, NLoginCore_531.var_com_nickuc_login_NLoginCore_479_D, (String)NLoginCore_289.c("㺀", (int)(var_int_e & m), (long)p), (String)NLoginCore_289.c("㺃", (int)y, (long)ab));
    }

    static {
        var_int_e = Integer.reverse(0);
        m = (-1 >>> 93 | -1 << -93) & 0xFFFFFFFF;
        p = Long.reverse(-4118172789611893007L);
        y = 128 >>> 39 | 128 << ~39 + 1;
        ab = Long.reverse(-4118172789611893007L);
        al = Integer.reverse(0x40000000);
        ao = Integer.reverse(-1);
        at = Long.reverse(-4118172789611893007L);
        bd = Integer.reverse(0x40000000);
        bf = Integer.reverse(Integer.MIN_VALUE);
        bg = Integer.reverse(0);
        bi = 0x6000000 >>> 185 | 0x6000000 << -185;
        bk = Long.reverse(-4406403165763604751L);
        bm = Long.reverse(0x400000000000000L);
        bn = 1024 >>> 200 | 1024 << ~200 + 1;
        bo = Long.reverse(-4118172789611893007L);
        bp = (1280 >>> 104 | 1280 << -104) & 0xFFFFFFFF;
        br = Long.reverse(-4406403165763604751L);
        bs = Long.reverse(0x400000000000000L);
        bu = 49152 >>> 237 | 49152 << -237;
        bv = Long.reverse(-4406403165763604751L);
        by = Long.reverse(0x400000000000000L);
        bz = (-536870912 >>> 93 | -536870912 << ~93 + 1) & 0xFFFFFFFF;
        cb = -1 >>> 150 | -1 << -150;
        cd = Long.reverse(-4118172789611893007L);
        ce = 0x40000000 >>> 251 | 0x40000000 << ~251 + 1;
        cg = -1 >>> 58 | -1 << ~58 + 1;
        ci = Long.reverse(-4118172789611893007L);
        cj = 0x20000001 >>> 253 | 0x20000001 << -253;
        ck = Long.reverse(-4118172789611893007L);
        cm = (80 >>> 131 | 80 << ~131 + 1) & 0xFFFFFFFF;
        co = (-1 >>> 92 | -1 << -92) & 0xFFFFFFFF;
        cp = Long.reverse(-4118172789611893007L);
        cr = Integer.reverse(-805306368);
        ct = Long.reverse(-4406403165763604751L);
        cu = Long.reverse(0x400000000000000L);
        cv = Integer.reverse(0x30000000);
        cy = Integer.reverse(0x30000000);
        var_java_lang_String_arr_e = new String[cv];
        f = new String[cy];
        NLoginCore_289.void_b();
    }

    @Override
    protected void b(ResultSet resultSet) {
        this.r = resultSet.getString((String)NLoginCore_289.c("㺀", (int)(ce & cg), (long)ci));
        String string = resultSet.getString((String)NLoginCore_289.c("㺃", (int)cj, (long)ck));
        String string2 = resultSet.getString((String)NLoginCore_289.c("㺆", (int)(cm & co), (long)cp));
        this.a(this.r, (String)NLoginCore_289.c("㺉", (int)cr, (long)(ct ^ cu)) + string, string2, null);
    }
}

