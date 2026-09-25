/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.AccountType
 *  com.nickuc.login.api.nLoginAPI$nLoginInternal
 *  com.nickuc.login.api.types.Identity
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_539;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginType_004;
import com.nickuc.login.NLoginCore_174;
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

public abstract class NLoginType_011
implements nLoginAPI.nLoginInternal {
    private static long aj;
    private static long aa;
    private static int u;
    private static long r;
    private static long m;
    private static long n;
    private static int h;
    private static int q;
    private static int t;
    private static String[] var_java_lang_String_arr_a;
    private static long y;
    private static int l;
    private static long ae;
    private static long ah;
    private static long d;
    private static long ag;
    private static long c;
    private static int var_int_a;
    private static long ak;
    private static int ac;
    private static long v;
    private static int am;
    private static long x;
    private static int var_int_b;
    private static int i;
    private static long g;
    private static String[] var_java_lang_String_arr_b;
    private static int k;
    private static int f;
    private static int o;
    private static int ai;
    private static long j;
    private static int z;
    private static int e;
    private static int w;
    private static long s;
    private static int ad;
    private static int al;
    private static int af;
    private static long ab;
    private static long p;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_011.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("҂ҤҦ҆ҪӉӁӗӃҒӐӆӔӎҗҼӞӝӕӛӕҪ", (byte)55, 68), NLoginType_011.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҦҸҲҺӊҽӍҘҹŁ", (byte)55, 65) + string + NLoginCore_427.F("ԭ", (byte)55, 70) + methodType.toString(), exception);
        }
    }

    public Identity createIdentity(String string, UUID uUID, UUID uUID2, AccountType accountType) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginType_011.c("㺀", (int)(var_int_a & var_int_b), (long)d));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginType_011.c("㺃", (int)(e & f), (long)g));
        }
        switch (NLoginType_004.var_int_arr_a[accountType.ordinal()]) {
            case 1: {
                if (uUID == null) {
                    throw new IllegalArgumentException((String)NLoginType_011.c("㺆", (int)(h & i), (long)j));
                }
                if (uUID.version() == k) break;
                throw new IllegalArgumentException((String)NLoginType_011.c("㺉", (int)l, (long)(m ^ n)) + uUID.version() + (String)NLoginType_011.c("㺌", (int)o, (long)p) + string + (String)NLoginType_011.c("㺏", (int)q, (long)(r ^ s)) + uUID);
            }
            case 2: {
                if (uUID2 == null) {
                    throw new IllegalArgumentException((String)NLoginType_011.c("㺒", (int)(t & u), (long)v));
                }
                if (uUID2.version() == 0) break;
                throw new IllegalArgumentException((String)NLoginType_011.c("㺕", (int)w, (long)(x ^ y)) + uUID2.version() + (String)NLoginType_011.c("㺘", (int)z, (long)(aa ^ ab)) + string + (String)NLoginType_011.c("㺛", (int)(ac & ad), (long)ae) + uUID2);
            }
        }
        return new NLoginCore_539(string, uUID, uUID2);
    }

    static {
        var_int_a = 0 >>> 95 | 0 << -95;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(5205484918561256819L);
        e = 131072 >>> 241 | 131072 << ~241 + 1;
        f = (-1 >>> 104 | -1 << -104) & 0xFFFFFFFF;
        g = Long.reverse(5205484918561256819L);
        h = Integer.reverse(0x40000000);
        i = Integer.reverse(-1);
        j = Long.reverse(5205484918561256819L);
        k = Integer.reverse(0x20000000);
        l = (48 >>> 68 | 48 << -68) & 0xFFFFFFFF;
        m = Long.reverse(7943673492002518387L);
        n = Long.reverse(0x2600000000000000L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(5205484918561256819L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(7943673492002518387L);
        s = Long.reverse(0x2600000000000000L);
        t = Integer.reverse(0x60000000);
        u = (-1 >>> 186 | -1 << -186) & 0xFFFFFFFF;
        v = Long.reverse(5205484918561256819L);
        w = 0x3800000 >>> 55 | 0x3800000 << -55;
        x = Long.reverse(7943673492002518387L);
        y = Long.reverse(0x2600000000000000L);
        z = Integer.reverse(0x10000000);
        aa = Long.reverse(7943673492002518387L);
        ab = Long.reverse(0x2600000000000000L);
        ac = (0x4800000 >>> 247 | 0x4800000 << ~247 + 1) & 0xFFFFFFFF;
        ad = -1 >>> 136 | -1 << -136;
        ae = Long.reverse(5205484918561256819L);
        af = Integer.reverse(0x50000000);
        ag = Long.reverse(7943673492002518387L);
        ah = Long.reverse(0x2600000000000000L);
        ai = 2816 >>> 72 | 2816 << -72;
        aj = Long.reverse(7943673492002518387L);
        ak = Long.reverse(0x2600000000000000L);
        al = (0x3000000 >>> 246 | 0x3000000 << ~246 + 1) & 0xFFFFFFFF;
        am = (384 >>> 165 | 384 << ~165 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[al];
        var_java_lang_String_arr_b = new String[am];
        NLoginType_011.b();
    }

    private static String a(int n, long l) {
        l ^= 0x64L;
        l ^= 0x863EAB69E70EE16DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(58 + 11), (byte)(21 + 62), (byte)(2 + 45), (byte)(52 + 15), (byte)(61 + 5), (byte)(3 + 64), (byte)(23 + 24), (byte)(24 + 56), (byte)(67 + 8), 67, (byte)(74 + 9), (byte)(17 + 36), (byte)(12 + 68), 97, (byte)(45 + 55), (byte)(49 + 51), (byte)(85 + 20), (byte)(83 + 27), (byte)(93 + 10)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_110.E("ԷՄՃԆՆՂԽՆՑՀԍՋՏՈՋՑԓࢍ࢙࢟ࢡࢱࢤࢴࡿࢠ", (byte)24, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_011.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public Identity createIdentityFromKnownName(String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginType_011.c("㺀", (int)af, (long)(ag ^ ah)));
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginType_011.c("㺃", (int)ai, (long)(aj ^ ak)));
        }
        return new NLoginCore_174(string);
    }

    private static void b() {
        int n;
        c = -3554186213762417546L;
        long l = c ^ 0x863EAB69E70EE16DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), (byte)(57 + 12), (byte)(45 + 38), (byte)(33 + 14), 67, (byte)(3 + 63), (byte)(40 + 27), (byte)(14 + 33), (byte)(72 + 8), (byte)(67 + 8), (byte)(64 + 3), (byte)(73 + 10), (byte)(22 + 31), (byte)(42 + 38), (byte)(44 + 53), (byte)(74 + 26), 100, (byte)(84 + 21), (byte)(22 + 88), (byte)(39 + 64)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
                    NLoginType_011.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ЭЯПсйџфЗЯчёњъъъшЫюѤўѩчоѨѦтљйвзѧћещыѲѓќэѣљѶѠэ", (byte)16, 68);
                    NLoginType_011.var_java_lang_String_arr_b[1] = NLoginCore_559.A("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩĥăčöĬįĶĬĖļİć", (byte)16, 65);
                    NLoginType_011.var_java_lang_String_arr_b[2] = NLoginCore_453.A("ÎĒÓĎąçòîĊúÝýČăěñùáĖĨôýįĉíģāğĔĠĉĤĆĬùõĶûęĞĞċļć", (byte)16, 65);
                    NLoginType_011.var_java_lang_String_arr_b[3] = NLoginCore_384.C("зђюѠапѕѦОдљѦѫьуѨяѥѝѲрѩѤѳьѲѡиѳѼѺљѺѲѫѵєуїћтњѵщѨўѵѣхѪюѿѰџѲўіѬѩҋјҚҏ҅ѰѧқќҁѰҏҡ҄ҀҧҟҁѸ҄ҝѶҘѹҙ҄ѫѦҧҖ҆ҋѱ҅Ҽғѽҳѷқҩҵҳҷ҅ҟ҄Ҿҍ", (byte)16, 67);
                    NLoginType_011.var_java_lang_String_arr_b[4] = NLoginCore_223.F("ԞԼԢԖՇԈԔԟԤԞՋԐԏԨՍԝԍՄԐԫԐՈԟԠ", (byte)16, 70);
                    NLoginType_011.var_java_lang_String_arr_b[5] = NLoginCore_091.F("Ԕԏ԰ԷԓԳՈԷԸԡԈԥԻԝԊԧԯԑՃԶԤՈԟԠ", (byte)16, 70);
                    NLoginType_011.var_java_lang_String_arr_b[6] = NLoginCore_173.E("ԀԼԨԳՃՃՇԟՊԘՌՀԠԥՋԆՎ԰ՖԣՎԶՙԴԲԽԚՑ՝ՂՎՍԼեըՉՇզՕը՘ՅԪԴ", (byte)16, 69);
                    NLoginType_011.var_java_lang_String_arr_b[7] = NLoginCore_453.E("ԼԖԂԴԗԴԴՇԚՄԫՀԾՌԧԩԩՁԭԕԨԯԨՆՌ՘ՔԺԸԟԭԣՐԾ՞՘ՀԴիԧԵդԼԨՒդզմՑՕ՘կյՃՋ՜ՙՆԻտՖՀդքզՒրֈրՇՃֈՊլփեՙժգեց՟֑֘֎֗֎նՏ֝Օկ֢֚֞լքշզ֙թ֖֤֜ֆևծմ", (byte)16, 69);
                    NLoginType_011.var_java_lang_String_arr_b[8] = NLoginCore_138.C("зѕлЯѠСЭинзѤЩШсѦжЦѝЩфЩѡий", (byte)16, 67);
                    NLoginType_011.var_java_lang_String_arr_b[9] = NLoginCore_223.A("çâăĊæĆěĊċôÛøĎðÝúĂäĖĉ÷ěòó", (byte)16, 65);
                    NLoginType_011.var_java_lang_String_arr_b[10] = NLoginCore_138.C("ЭЯПсйџфЗЯчёњъъъшЫюѤўѩчоѨѦтљйвзѧћещыѲѓќэѣљѶѠэ", (byte)16, 67);
                    NLoginType_011.var_java_lang_String_arr_b[11] = NLoginCore_384.F("ԔԖԆԨԠՆԫӾԖԮԸՁԱԱԱԯԒԵՋՅՐԭՍՉՑԹ՜Խ՟ՙդՖՒ԰Ժԣՙ՜գՙՃթ՝Դ", (byte)16, 70);
                    continue block7;
                }
                case 1: {
                    NLoginType_011.var_java_lang_String_arr_b[0] = NLoginCore_324.B("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģāøĢĠüēóìñġĕđģĤļďķļċĔĠĊć", (byte)16, 66);
                    NLoginType_011.var_java_lang_String_arr_b[1] = NLoginCore_324.A("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩĐķĕĴĉĜĬċĪĚĞć", (byte)16, 65);
                    NLoginType_011.var_java_lang_String_arr_b[2] = NLoginCore_575.D("ДјЙєыЭидѐрУуђщѡзпЧќѮкуѵягѩчѥњѦяѪіѮрѰѢэѠѹҀѶќэ", (byte)16, 68);
                    NLoginType_011.var_java_lang_String_arr_b[3] = NLoginCore_427.E("ԞԹԵՇԗԦԼՍԅԛՀՍՒԳԪՏԶՌՄՙԧՐՋ՚ԳՙՈԟ՚գաՀաՙՒ՜ԻԪԾՂԩՁ՜԰ՏՅ՜ՊԬՑԵզ՗ՆՙՅԽՓՐղԿցնլ՗ՎւՃը՗նֈիէ֎ֆը՟իք՝տՠրիՒՍ֎սխղ՘լ֣պդ֦֤֛֣֗՜յե֘պջ֬գհ֜ղ֊փְ֖ղ֒տր", (byte)16, 69);
                    NLoginType_011.var_java_lang_String_arr_b[4] = NLoginCore_384.B("ñďõéĚÛçò÷ñĞĠþîîėħôøīĕúĞæøāğíĆĐĢĸ", (byte)16, 66);
                    NLoginType_011.var_java_lang_String_arr_b[5] = NLoginCore_027.E("Ԕԏ԰ԷԓԳՈԷԸԡԈՃ԰ՏԲՆԤԡԠԶԱԢԟԠ", (byte)16, 69);
                    NLoginType_011.var_java_lang_String_arr_b[6] = NLoginCore_223.F("ԀԼԨԳՃՃՇԟՊԘՌՀԠԥՋԆՎ԰ՖԣՎԶՙԴԲԽԚՑ՝ՂՎՍՐաԙԨԷԩՉ՜ՋզԦԴ", (byte)16, 70);
                    NLoginType_011.var_java_lang_String_arr_b[7] = NLoginCore_027.A("ďéÕćêććĚíėþēđğúüüĔĀèûĂûęğīħčċòĀöģđıīēćľúĈķďûĥķĹŇĤĨīłňĖĞįĬęĎŒĩēķŗĹĥœśœĚĖśĝĿŖĸĬĽĶĸŔĲūŤšŪšŉĢŰĨłűŭŵĿĳŦŊųĵżōŇšžŶŃĽůžŰŔŦŊƌłťŒœ", (byte)16, 65);
                    NLoginType_011.var_java_lang_String_arr_b[8] = NLoginCore_201.F("ԞԼԢԖՇԈԔԟԤԞՊԧԠԳԉՊԲԟԫՒՈԐ԰ԺԘ՚ԸՐՀԙՍ՚", (byte)16, 70);
                    NLoginType_011.var_java_lang_String_arr_b[9] = NLoginCore_091.B("çâăĊæĆěĊċôÜčęčïĈēóúâäěòó", (byte)16, 66);
                    NLoginType_011.var_java_lang_String_arr_b[10] = NLoginCore_027.E("ԔԖԆԨԠՆԫӾԖԮԸՁԱԱԱԯԒԵՋՅՐԮԥՏՍԩՀԠԙԞՎՂԴ՛ՓՄՁՄժ՘ժԷՙԴ", (byte)16, 69);
                    NLoginType_011.var_java_lang_String_arr_b[11] = NLoginCore_559.B("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩąİöúôčĶõùĭİć", (byte)16, 66);
                    continue block7;
                }
                case 2: {
                    NLoginType_011.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ԚՆӹԟԀՂԥԆԮԤԏԨԲՍԱԜԧՂՁԕԱԢԟԠ", (byte)16, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_011.var_java_lang_String_arr_b[0] = NLoginCore_110.F("ԔՃԕԝԣԘՉՁԃԀԺԆԏԼԼՉԤՁԡԣՕԢԟԠ", (byte)16, 70);
                }
            }
        }
    }
}

