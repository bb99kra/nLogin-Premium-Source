/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_197;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_484;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_269;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_536;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class HikariConnectionPool
implements NLoginCore_459 {
    private static long j;
    private static int bi;
    private static long var_long_c;
    private static int bd;
    private static long am;
    private static int t;
    private static int az;
    private static int al;
    private static int var_int_c;
    private static int f;
    private static long d;
    private static int aj;
    private static long ac;
    private static int bf;
    private static int ao;
    private static long v;
    private static int h;
    private static int aw;
    private static long ad;
    private static int q;
    private static long e;
    private static int k;
    private static int aa;
    private static int aq;
    private static long m;
    private static long z;
    private static long an;
    private static long bj;
    private static int x;
    private static long ax;
    private static String[] var_java_lang_String_arr_a;
    private static long af;
    private static long bb;
    private static long ba;
    private static int be;
    private static int ae;
    private static long y;
    private static long ak;
    private static long as;
    private static long o;
    private static long p;
    private static int var_int_a;
    private static int ar;
    private static int ab;
    private static long s;
    private static long i;
    private static int var_int_b;
    private static long bh;
    private final NLoginCore_459 var_com_nickuc_login_NLoginCore_459_g;
    private static long u;
    private static long au;
    private static int n;
    private static long ai;
    private static long ap;
    private static long bc;
    private static int w;
    private static int at;
    private static long av;
    private static long bk;
    private static int ag;
    private static String[] var_java_lang_String_arr_b;
    private static int ah;
    private static long bg;
    private static long l;
    private static int r;
    private static long var_long_g;
    private static long ay;

    protected abstract String w();

    static {
        var_int_a = (262144 >>> 18 | 262144 << -18) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = (0 >>> 191 | 0 << -191) & 0xFFFFFFFF;
        d = Long.reverse(-7611824465769637790L);
        e = Long.reverse(0x2A00000000000000L);
        f = Integer.reverse(Integer.MIN_VALUE);
        var_long_g = Long.reverse(-4873635892328376222L);
        h = (1024 >>> 233 | 1024 << -233) & 0xFFFFFFFF;
        i = Long.reverse(-7611824465769637790L);
        j = Long.reverse(0x2A00000000000000L);
        k = 0xC000000 >>> 154 | 0xC000000 << -154;
        l = Long.reverse(-7611824465769637790L);
        m = Long.reverse(0x2A00000000000000L);
        n = Integer.reverse(0x20000000);
        o = Long.reverse(-7611824465769637790L);
        p = Long.reverse(0x2A00000000000000L);
        q = (80 >>> 196 | 80 << ~196 + 1) & 0xFFFFFFFF;
        r = -1 >>> 229 | -1 << ~229 + 1;
        s = Long.reverse(-4873635892328376222L);
        t = 24 >>> 162 | 24 << -162;
        u = Long.reverse(-7611824465769637790L);
        v = Long.reverse(0x2A00000000000000L);
        w = Integer.reverse(0x50000000);
        x = 5120 >>> 137 | 5120 << -137;
        y = Long.reverse(0x7800000000000000L);
        z = Long.reverse(-6917529027641081856L);
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = 1792 >>> 8 | 1792 << -8;
        ac = Long.reverse(-7611824465769637790L);
        ad = Long.reverse(0x2A00000000000000L);
        ae = Integer.reverse(0x10000000);
        af = Long.reverse(-4873635892328376222L);
        ag = Integer.reverse(-1879048192);
        ah = Integer.reverse(-1);
        ai = Long.reverse(-4873635892328376222L);
        aj = 0x50000000 >>> 59 | 0x50000000 << ~59 + 1;
        ak = Long.reverse(-4873635892328376222L);
        al = Integer.reverse(-805306368);
        am = Long.reverse(-7611824465769637790L);
        an = Long.reverse(0x2A00000000000000L);
        ao = (48 >>> 98 | 48 << -98) & 0xFFFFFFFF;
        ap = Long.reverse(-4873635892328376222L);
        aq = 0 >>> 101 | 0 << -101;
        ar = Integer.reverse(-1342177280);
        as = Long.reverse(-4873635892328376222L);
        at = Integer.reverse(0x70000000);
        au = Long.reverse(-7611824465769637790L);
        av = Long.reverse(0x2A00000000000000L);
        aw = Integer.reverse(-268435456);
        ax = Long.reverse(-7611824465769637790L);
        ay = Long.reverse(0x2A00000000000000L);
        az = Integer.reverse(0x8000000);
        ba = Long.reverse(-7611824465769637790L);
        bb = Long.reverse(0x2A00000000000000L);
        bc = Long.reverse(0x7800000000000000L);
        bd = Integer.reverse(-939524096);
        be = 38 >>> 1 | 38 << ~1 + 1;
        bf = 2176 >>> 71 | 2176 << ~71 + 1;
        bg = Long.reverse(-7611824465769637790L);
        bh = Long.reverse(0x2A00000000000000L);
        bi = Integer.reverse(0x48000000);
        bj = Long.reverse(-7611824465769637790L);
        bk = Long.reverse(0x2A00000000000000L);
        var_java_lang_String_arr_a = new String[bd];
        var_java_lang_String_arr_b = new String[be];
        HikariConnectionPool.b();
        try {
            Class.forName((String)HikariConnectionPool.c("㺀", (int)bf, (long)(bg ^ bh)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException((String)HikariConnectionPool.c("㺃", (int)bi, (long)(bj ^ bk)), classNotFoundException);
        }
    }

    protected abstract String java_lang_String_a(NLoginCore_147 var1);

    private static String a(int n, long l) {
        l ^= 0x54L;
        l ^= 0x3A2570BD5405F176L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(42 + 27), (byte)(31 + 52), (byte)(12 + 35), (byte)(42 + 25), (byte)(28 + 38), (byte)(16 + 51), (byte)(37 + 10), (byte)(15 + 65), (byte)(73 + 2), (byte)(42 + 25), (byte)(7 + 76), (byte)(10 + 43), (byte)(78 + 2), (byte)(58 + 39), (byte)(30 + 70), (byte)(74 + 26), 105, 110, (byte)(64 + 39)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѶѩѓѿѢѡ҂ѱѯѓѷҁ҉҅", (byte)19, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            HikariConnectionPool.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        var_long_c = 5051407666605898345L;
        long l = var_long_c ^ 0x3A2570BD5405F176L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(24 + 45), (byte)(56 + 27), (byte)(3 + 44), (byte)(6 + 61), 66, (byte)(64 + 3), (byte)(9 + 38), (byte)(22 + 58), (byte)(34 + 41), (byte)(57 + 10), (byte)(34 + 49), (byte)(5 + 48), (byte)(14 + 66), (byte)(78 + 19), (byte)(49 + 51), (byte)(49 + 51), (byte)(29 + 76), (byte)(44 + 66), (byte)(70 + 33)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
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
                    HikariConnectionPool.var_java_lang_String_arr_b[0] = NLoginCore_110.B("ÞìÅþçæÚÒĊÿĉéĈĐúÒčĕõÞÞéæç", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[1] = NLoginCore_110.C("ЌНЛЉЪЮЍПАФепётјЦэјъчЛџЪанЛдЧѕеѨь", (byte)10, 67);
                    HikariConnectionPool.var_java_lang_String_arr_b[2] = NLoginCore_559.F("ԎԐԛԬԲԭԖՆՇՁԢԔՅԄԬԶՁՎԈԄԤԬԙԚ", (byte)10, 70);
                    HikariConnectionPool.var_java_lang_String_arr_b[3] = NLoginCore_091.F("ԋԹԶԍԒԟӽӿԑԚԈԎ", (byte)10, 70);
                    HikariConnectionPool.var_java_lang_String_arr_b[4] = NLoginCore_559.D("зРХчэкПЭгѕшбуювгГШЬКрЬбглмОвујѨй", (byte)10, 68);
                    HikariConnectionPool.var_java_lang_String_arr_b[5] = NLoginCore_110.B("çþďÅČåèíïáÍÛ", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[6] = NLoginCore_324.D("ЉКьШРЇЫлбэгррюДзЕъоЬдяЦЧ", (byte)10, 68);
                    HikariConnectionPool.var_java_lang_String_arr_b[7] = NLoginCore_027.C("РЌУУццЩоОШТпВЭюЗеЪЖћлйЦЧ", (byte)10, 67);
                    HikariConnectionPool.var_java_lang_String_arr_b[8] = NLoginCore_201.C("еЧрИийбНІєѐєШФйИєэЖѠЙЯПзѠеИїѤџзыоѨѨЩѧтрѥѕєѕђЪѹѨвяѷжязщцч", (byte)10, 67);
                    HikariConnectionPool.var_java_lang_String_arr_b[9] = NLoginCore_446.B("àÌããĆĆéþÞèâÿÒíĎ×õêÖěûùæç", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[10] = NLoginCore_173.A("÷ÄéÞĊĐÚþëĄÕÍčåÌÛĝĒýñ×ÙģÿĞþĤ÷ĤĕõĥýĘęĈïĭıĠôÿĠû", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[11] = NLoginCore_092.A("÷êËýĉÙïĉēâöÛ", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[12] = NLoginCore_201.B("öâêèÛäüĆÊĔĎóÐęĊîÚ÷êþėùæç", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[13] = NLoginCore_076.D("чОкШИЙкШЍАщВБъзфЎШЮіКмпрюяѕфсХъш", (byte)10, 68);
                    HikariConnectionPool.var_java_lang_String_arr_b[14] = NLoginCore_384.B("ÞìÅþçæÚÒĊÿĉéĈĐúÒčĕõÞÞéæç", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[15] = NLoginCore_138.F("ӷԶԒԬԑԵՃԳԧԄԒԀԝԸԽԋԸԩԻԐՉԜԙԚ", (byte)10, 70);
                    HikariConnectionPool.var_java_lang_String_arr_b[16] = NLoginCore_076.A("ĆÿýþÊÊâóòÏĕÔćâøôüÙìċàďæç", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[17] = NLoginCore_453.A("ÞÜÚëăčđĆÞï÷ďáĊëÚÖĈċÛĈÿčáďáðĖèþĔĥ", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[18] = NLoginCore_559.E("ӾԕԱԎԬӺԃԥԱԡԪՂԇՀԍԄԦԼԋՓՌԾՕՀՏԣՌՏԻԤ՘Չ՛ԙՎԲՍԟՎ՟բ՟՜ԼԳ՗էՉԽԻՙԱ՝ղԹԺ", (byte)10, 69);
                    continue block7;
                }
                case 1: {
                    HikariConnectionPool.var_java_lang_String_arr_b[0] = NLoginCore_110.F("ԑԟӸԱԚԙԍԅԽԲԾԘԃՋԘՈԹՍԾՊԮՌՕՌԬԑ԰՛ԓԖԚԼ", (byte)10, 70);
                    HikariConnectionPool.var_java_lang_String_arr_b[1] = NLoginCore_451.E("ӿԐԎӼԝԡԀԒԃԗԨԲՄԵՋԙՀՋԽԺԎԊՀՊՈԔՑՅՆԹԕՇ", (byte)10, 69);
                    HikariConnectionPool.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ÛÝèùÿúãēĔĎîÿõĈěêÛĊćÖïéæç", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[3] = NLoginCore_453.A("øìÚĂìÚßàñÓĈÛ", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[4] = NLoginCore_092.C("зРХчэкПЭгѕшбуювгГШЬКрдЮНікнѦЦўыѝ", (byte)10, 67);
                    HikariConnectionPool.var_java_lang_String_arr_b[5] = NLoginCore_138.A("õêÍĐØÌÑáæČâÛ", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[6] = NLoginCore_446.E("ӼԍԿԛԓӺԞԮԤՀԧԫՈԵԾԋԫՋՉԞՀՒԙԚ", (byte)10, 69);
                    HikariConnectionPool.var_java_lang_String_arr_b[7] = NLoginCore_091.A("àÌããĆĆéþÞèåāāąûĉæĕĒČĀěðãßĒĘģĥæåá", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[8] = NLoginCore_446.C("еЧрИийбНІєѐєШФйИєэЖѠЙЯПзѠеИїѤџзыоѨѨЩѧтрѥѕєєцѹгзѴчѫњбѵљцч", (byte)10, 67);
                    HikariConnectionPool.var_java_lang_String_arr_b[9] = NLoginCore_384.A("àÌããĆĆéþÞèäĕÔúûĄä÷ýúïúĘăĤöĦĝáãåë", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[10] = NLoginCore_453.B("÷ÄéÞĊĐÚþëĄÕÍčåÌÛĝĒýñ×ÙģÿĞþĤ÷ĤĕõĥèĊāĭĨİđĈĒįĒû", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[11] = NLoginCore_173.B("íîÜÊđëÝéĔðêÛ", (byte)10, 66);
                    HikariConnectionPool.var_java_lang_String_arr_b[12] = NLoginCore_091.E("ԩԕԝԛԎԗԯԹӽՇԿԽԙԧՂԠՄՈԚԭԌԬԙԚ", (byte)10, 69);
                    HikariConnectionPool.var_java_lang_String_arr_b[13] = NLoginCore_223.A("ćÞúèØÙúèÍÐĉÒÑĊ÷ĄÎèîĖÚýóîĖôēûĢĈúī", (byte)10, 65);
                    HikariConnectionPool.var_java_lang_String_arr_b[14] = NLoginCore_559.E("ԑԟӸԱԚԙԍԅԽԲԽԊԡԃՉԄԻՇՅԣՉԐՑԾԉԲՄՑԻԼՖԺ", (byte)10, 69);
                    HikariConnectionPool.var_java_lang_String_arr_b[15] = NLoginCore_201.F("ӷԶԒԬԑԵՃԳԧԄԔԫԛӾԷՍՍՄՊԭԢԬԙԚ", (byte)10, 70);
                    HikariConnectionPool.var_java_lang_String_arr_b[16] = NLoginCore_092.D("цпноЊЊТгвЏєЯиюкуКюипЪЛТёѣХхѨкцои", (byte)10, 68);
                    HikariConnectionPool.var_java_lang_String_arr_b[17] = NLoginCore_559.D("ОМКЫуэёцОЯзяСъЫКЖшыЛшпњићСѠѧѧўѝѧ", (byte)10, 68);
                    HikariConnectionPool.var_java_lang_String_arr_b[18] = NLoginCore_092.D("ЋТоЛйЇАвоЮзяДэКБгщИѠљыѢэќаљќшбѥіѨЦћпњЬћѬѯѬѨьѳѕаейѝнкиљцч", (byte)10, 68);
                    continue block7;
                }
                case 2: {
                    HikariConnectionPool.var_java_lang_String_arr_b[0] = NLoginCore_091.B("çÞÞÝĆûČĎĔÿíð×ô÷÷ýėėėĒďæç", (byte)10, 66);
                    continue block7;
                }
                case 4: {
                    HikariConnectionPool.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ӺԿԀԖԳԂՂԑԇԧԟԀԴԥԸԈԙԢԞՐ԰ԜԙԚ", (byte)10, 69);
                }
            }
        }
    }

    protected abstract void a(HikariConfig var1, NLoginCore_147 var2);

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(HikariConnectionPool.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ÃåçÇëĊĂĘĄÓđćĕďØýğĞĖĜĖë", (byte)14, 65), HikariConnectionPool.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѬџщѵјїѸѧѥщѭѷѿѻô", (byte)14, 65) + string + NLoginCore_027.F("Ԅ", (byte)14, 70) + methodType.toString(), exception);
        }
    }

    protected HikariConnectionPool(NLoginCore_036 NLoginCore_0362, NLoginCore_116<?> NLoginInterface_0112, NLoginCore_147 NLoginCore_147, @Nullable Consumer<HikariConfig> consumer, NLoginCore_536 NLoginCore_5362) {
        NLoginCore_363[] NLoginInterface_034Array = new NLoginCore_363[var_int_a];
        NLoginInterface_034Array[HikariConnectionPool.var_int_b] = NLoginCore_0362.com_nickuc_login_NLoginCore_315_a();
        if (!NLoginInterface_0112.com_nickuc_login_NLoginCore_583_a().boolean_a(NLoginInterface_034Array)) {
            throw new RuntimeException((String)HikariConnectionPool.c("㺀", (int)var_int_c, (long)(d ^ e)) + NLoginCore_0362.v() + (String)HikariConnectionPool.c("㺃", (int)f, (long)var_long_g));
        }
        Properties properties = NLoginCore_147.a();
        properties.putIfAbsent(HikariConnectionPool.c("㺆", (int)h, (long)(i ^ j)), HikariConnectionPool.c("㺉", (int)k, (long)(l ^ m)));
        properties.putIfAbsent(HikariConnectionPool.c("㺌", (int)n, (long)(o ^ p)), HikariConnectionPool.c("㺏", (int)(q & r), (long)s));
        switch (NLoginCore_5362.ordinal()) {
            case 0: {
                HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setPoolName(NLoginInterface_0112.q().toLowerCase(Locale.ENGLISH) + (String)HikariConnectionPool.c("㺒", (int)t, (long)(u ^ v)));
                this.a(hikariConfig, NLoginCore_147);
                hikariConfig.setMaximumPoolSize(w);
                hikariConfig.setMinimumIdle(x);
                hikariConfig.setMaxLifetime(TimeUnit.MINUTES.toMillis(y));
                hikariConfig.setConnectionTimeout(TimeUnit.SECONDS.toMillis(z));
                this.a(properties, aa != 0);
                hikariConfig.setDataSourceProperties(properties);
                if (consumer != null) {
                    consumer.accept(hikariConfig);
                }
                NLoginCore_269 NLoginCore_2692 = new NLoginCore_269(hikariConfig);
                this.var_com_nickuc_login_NLoginCore_459_g = new NLoginCore_484(NLoginCore_0362, NLoginCore_2692, null);
                break;
            }
            case 1: {
                Driver driver;
                ClassLoader classLoader = this.getClass().getClassLoader();
                try {
                    driver = (Driver)classLoader.loadClass(this.w()).newInstance();
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new RuntimeException((String)HikariConnectionPool.c("㺕", (int)ab, (long)(ac ^ ad)) + this.w() + (String)HikariConnectionPool.c("㺘", (int)ae, (long)af) + classLoader.getClass().getCanonicalName());
                }
                catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
                    throw new RuntimeException((String)HikariConnectionPool.c("㺛", (int)(ag & ah), (long)ai) + this.w() + (String)HikariConnectionPool.c("㺞", (int)aj, (long)ak), reflectiveOperationException);
                }
                properties.putIfAbsent(HikariConnectionPool.c("㺡", (int)al, (long)(am ^ an)), NLoginCore_147.z());
                properties.putIfAbsent(HikariConnectionPool.c("㺤", (int)ao, (long)ap), NLoginCore_147.java_lang_String_j());
                this.a(properties, aq != 0);
                this.void_a(NLoginCore_147);
                String string = this.java_lang_String_a(NLoginCore_147);
                this.var_com_nickuc_login_NLoginCore_459_g = new NLoginCore_197(NLoginCore_0362, driver, string, properties, null);
                break;
            }
            default: {
                throw new UnsupportedOperationException((String)HikariConnectionPool.c("㺧", (int)ar, (long)as) + (Object)((Object)NLoginCore_5362));
            }
        }
        this.ah();
    }

    protected void ah() {
        Enumeration<Driver> enumeration = DriverManager.getDrivers();
        while (enumeration.hasMoreElements()) {
            Driver driver = enumeration.nextElement();
            if (!driver.getClass().getName().equals(this.w())) continue;
            try {
                DriverManager.deregisterDriver(driver);
            }
            catch (SQLException sQLException) {}
        }
    }

    @Override
    public Connection java_sql_Connection_a() {
        return this.var_com_nickuc_login_NLoginCore_459_g.java_sql_Connection_a();
    }

    protected void a(Properties properties, boolean bl) {
        if (bl) {
            properties.putIfAbsent(HikariConnectionPool.c("㺀", (int)az, (long)(ba ^ bb)), String.valueOf(TimeUnit.SECONDS.toMillis(bc)));
        }
    }

    @Override
    public NLoginCore_036 com_nickuc_login_NLoginCore_036_a() {
        return this.var_com_nickuc_login_NLoginCore_459_g.com_nickuc_login_NLoginCore_036_a();
    }

    @Override
    public void a(Connection connection) {
        this.var_com_nickuc_login_NLoginCore_459_g.a(connection);
    }

    protected void void_a(NLoginCore_147 NLoginCore_147) {
        try {
            Class.forName(this.w());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException((String)HikariConnectionPool.c("㺀", (int)at, (long)(au ^ av)) + this.com_nickuc_login_NLoginCore_036_a().v() + (String)HikariConnectionPool.c("㺃", (int)aw, (long)(ax ^ ay)), classNotFoundException);
        }
    }

    @Override
    public void void_c() {
        this.var_com_nickuc_login_NLoginCore_459_g.void_c();
    }
}

