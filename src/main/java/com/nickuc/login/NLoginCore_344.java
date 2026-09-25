/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketListenerAbstract
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketListenerAbstract;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_581;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_344
extends PacketListenerAbstract {
    private static long ag;
    private static long y;
    private static String[] var_java_lang_String_arr_b;
    private static long o;
    private static int f;
    private static String[] var_java_lang_String_arr_a;
    private static int ac;
    private static int var_int_b;
    private static int n;
    private static long var_long_c;
    private static long ai;
    private static int k;
    private static int z;
    private static long j;
    private static long d;
    private static long p;
    private static int am;
    private static int ah;
    private static int q;
    private static int x;
    private static int var_int_c;
    private static int var_int_a;
    private static long m;
    private static int ak;
    private static int u;
    final /* synthetic */ NLoginCore_581 var_com_nickuc_login_NLoginCore_581_b;
    private static long aj;
    private static long ae;
    private static int i;
    private static int e;
    private static int af;
    private static int aa;
    private static long s;
    private static int h;
    private static int v;
    private static int ad;
    private static int al;
    private static long g;
    private static long r;
    private static int t;
    private static long ab;
    private static long l;
    private static long w;

    public void onPacketSend(PacketSendEvent packetSendEvent) {
        if (packetSendEvent.isCancelled()) {
            return;
        }
        try {
            NLoginInterface_043 NLoginInterface_0432 = (NLoginInterface_043)NLoginCore_581.b(this.var_com_nickuc_login_NLoginCore_581_b).get(packetSendEvent.getPacketType());
            if (NLoginInterface_0432 != null) {
                NLoginInterface_0432.a(packetSendEvent);
            }
        }
        catch (Throwable throwable) {
            packetSendEvent.setCancelled(u != 0);
            ChannelHelper.close((Object)packetSendEvent.getChannel());
            User user = packetSendEvent.getUser();
            String string = (String)NLoginCore_344.c("㺀", (int)v, (long)w) + packetSendEvent.getServerVersion() + (String)(user != null ? (String)NLoginCore_344.c("㺃", (int)x, (long)y) + user.getClientVersion() : NLoginCore_344.c("㺆", (int)(z & aa), (long)ab));
            NLoginCore_370.c((String)NLoginCore_344.c("㺉", (int)(ac & ad), (long)ae) + packetSendEvent.getPacketType() + (String)NLoginCore_344.c("㺌", (int)af, (long)ag) + string + (String)NLoginCore_344.c("㺏", (int)ah, (long)(ai ^ aj)), throwable, new Object[ak]);
        }
    }

    private static void b() {
        int n;
        var_long_c = -7149547186137962345L;
        long l = var_long_c ^ 0xE56F515FCD846D19L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(67 + 2), (byte)(11 + 72), (byte)(35 + 12), (byte)(66 + 1), (byte)(26 + 40), (byte)(59 + 8), (byte)(37 + 10), (byte)(17 + 63), (byte)(29 + 46), (byte)(53 + 14), (byte)(54 + 29), 53, (byte)(41 + 39), (byte)(30 + 67), (byte)(91 + 9), (byte)(33 + 67), 105, (byte)(16 + 94), (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), (byte)(23 + 60)}, StandardCharsets.UTF_8));
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
                    NLoginCore_344.var_java_lang_String_arr_b[0] = NLoginCore_223.D("яЭжїѥљяѴѲѾѾгѹѠя҆҄ѾѷѼџѹѐё", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[1] = NLoginCore_453.E("ՅԊԸՌԾՊԛԝԬՆԮԵՏԓ԰ԺԏՐ՝ՏԾՠԧԨ", (byte)24, 69);
                    NLoginCore_344.var_java_lang_String_arr_b[2] = NLoginCore_559.E("ՃԤՍՆԏԋԮԔԞԯԎԜ", (byte)24, 69);
                    NLoginCore_344.var_java_lang_String_arr_b[3] = NLoginCore_004.E("ՀԬԋԫԙԬ԰ՇՄՒԔՈԒԷԭԮՅՆԱՒՀԾԫԼԻԡ԰ՀԻԤԳԹԟՙԥՇղզՎՄԾշԱխԸԹՋԲ՘ԺէձհհՇՈ", (byte)24, 69);
                    NLoginCore_344.var_java_lang_String_arr_b[4] = NLoginCore_453.A("æġğĞêĪýùçĐĂ÷", (byte)24, 65);
                    NLoginCore_344.var_java_lang_String_arr_b[5] = NLoginCore_110.C("жѵѪѶэлѵизѳќх", (byte)24, 67);
                    NLoginCore_344.var_java_lang_String_arr_b[6] = NLoginCore_091.B("āßèĉėċāĦĤİİåīĒāĸĶİĩĮđīĂă", (byte)24, 66);
                    NLoginCore_344.var_java_lang_String_arr_b[7] = NLoginCore_324.B("ĠåēħęĥöøćġĉĐĪîċĕêīĸĪęĻĂă", (byte)24, 66);
                    NLoginCore_344.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ѬэѶѯидїнчјзх", (byte)24, 67);
                    NLoginCore_344.var_java_lang_String_arr_b[9] = NLoginCore_384.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҐћѶѮѼќѝңѷѶҝҩѰѱ", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[10] = NLoginCore_004.D("дѯѭѬиѸычеўѐх", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[11] = NLoginCore_091.F("ԍՌՁՍԤԒՌԏԎՊԳԜ", (byte)24, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_344.var_java_lang_String_arr_b[0] = NLoginCore_076.C("яЭжїѥљяѴѲѾѾьёѲѴѴтѳѹїѹ҉ѐё", (byte)24, 67);
                    NLoginCore_344.var_java_lang_String_arr_b[1] = NLoginCore_092.D("ѮгѡѵѧѳфцѕѯѕѵѓыѼзѹіўлѦ҉ѐё", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[2] = NLoginCore_223.E("ԨԭԦԸԊՆԽԳԐԮՅԜ", (byte)24, 69);
                    NLoginCore_344.var_java_lang_String_arr_b[3] = NLoginCore_004.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѧєѥѤъљѩѤэќѢш҂юѰқҏѷѭѧҠљҔҠқѸѺҝѧѰѤ҇ҩѰѱ", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[4] = NLoginCore_138.E("ԛԇԭԎՎԜԼՎԱԵԫԜ", (byte)24, 69);
                    NLoginCore_344.var_java_lang_String_arr_b[5] = NLoginCore_559.D("ѱѠѷљѶюѪхѓѪѠх", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[6] = NLoginCore_559.C("яЭжїѥљяѴѲѾҁҁѱѶѽѴіѧ҃ѱї҉ѐё", (byte)24, 67);
                    NLoginCore_344.var_java_lang_String_arr_b[7] = NLoginCore_110.F("ՅԊԸՌԾՊԛԝԬՆԮԎԪԤՖՙՙ՝՛՚ՕՐԧԨ", (byte)24, 70);
                    NLoginCore_344.var_java_lang_String_arr_b[8] = NLoginCore_138.D("ыыжЯѲјєчѱјѾх", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[9] = NLoginCore_027.D("ѩѕдєтѕљѰѭѻнѱлѠіїѮѯњѻѩѴьѝѺѽѻѾѨъѴѦғѿъ҄қѧєҒѺҞҎѹѼѭѷѠѦѳҡҀѳ҃Ѱѱ", (byte)24, 68);
                    NLoginCore_344.var_java_lang_String_arr_b[10] = NLoginCore_091.C("ѩѪыЯіщђкћѾьх", (byte)24, 67);
                    NLoginCore_344.var_java_lang_String_arr_b[11] = NLoginCore_027.A("ĉûþĪĞĈĮĐħíĂ÷", (byte)24, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_344.var_java_lang_String_arr_b[0] = NLoginCore_138.F("ԾՎԹՈԮԯՔԏԢՌԏԣԳԸԖ՛ԮԐՀԷԓՠԧԨ", (byte)24, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_344.var_java_lang_String_arr_b[0] = NLoginCore_173.F("ԕԄԁԊ԰ԻԟԯԾՆՅՁԷ՚ԑԲՊ՚՜ՙԓՓՐԲ՝ՁՏԧՒԤԶե", (byte)24, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_344.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.F("ԳՕ՗Է՛պղֈմՃցշօտՈխ֏֎ֆ֌ֆ՛", (byte)79, 70), NLoginCore_344.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.A("ƀƍƌŏƏƋƆƏƚƉŖƔƘƑƔƚŜӨӢӹӚӨӱӈӱӨӴӺӹӍӾŶ", (byte)79, 65) + string + NLoginCore_559.F("Յ", (byte)79, 70) + methodType.toString(), exception);
        }
    }

    public NLoginCore_344(NLoginCore_581 NLoginCore_5812) {
        this.var_com_nickuc_login_NLoginCore_581_b = NLoginCore_5812;
    }

    public void onPacketReceive(PacketReceiveEvent packetReceiveEvent) {
        if (packetReceiveEvent.isCancelled()) {
            return;
        }
        try {
            NLoginInterface_003 NLoginInterface_0032 = (NLoginInterface_003)NLoginCore_581.a(this.var_com_nickuc_login_NLoginCore_581_b).get(packetReceiveEvent.getPacketType());
            if (NLoginInterface_0032 != null) {
                NLoginInterface_0032.a(packetReceiveEvent);
            }
        }
        catch (Throwable throwable) {
            packetReceiveEvent.setCancelled(var_int_a != 0);
            ChannelHelper.close((Object)packetReceiveEvent.getChannel());
            User user = packetReceiveEvent.getUser();
            String string = (String)NLoginCore_344.c("㺀", (int)(var_int_b & var_int_c), (long)d) + packetReceiveEvent.getServerVersion() + (String)(user != null ? (String)NLoginCore_344.c("㺃", (int)(e & f), (long)g) + user.getClientVersion() : NLoginCore_344.c("㺆", (int)(h & i), (long)j));
            NLoginCore_370.c((String)NLoginCore_344.c("㺉", (int)k, (long)(l ^ m)) + packetReceiveEvent.getPacketType() + (String)NLoginCore_344.c("㺌", (int)n, (long)(o ^ p)) + string + (String)NLoginCore_344.c("㺏", (int)q, (long)(r ^ s)), throwable, new Object[t]);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x76L;
        l ^= 0xE56F515FCD846D19L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(26 + 57), (byte)(26 + 21), (byte)(49 + 18), (byte)(32 + 34), (byte)(55 + 12), (byte)(5 + 42), (byte)(27 + 53), (byte)(37 + 38), (byte)(11 + 56), (byte)(42 + 41), 53, (byte)(23 + 57), (byte)(47 + 50), (byte)(39 + 61), (byte)(75 + 25), (byte)(69 + 36), (byte)(19 + 91), (byte)(4 + 99)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.E("՚էզԩթեՠթմգ԰ծղիծմԶࣂࢼ࣓ࢴࣂ࣋ࢢ࣋ࣂ࣓࣎ࣔࢧࣘ", (byte)59, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_344.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = (-1 >>> 86 | -1 << ~86 + 1) & 0xFFFFFFFF;
        d = Long.reverse(-8712676874222968007L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(-1);
        g = Long.reverse(-8712676874222968007L);
        h = Integer.reverse(0x40000000);
        i = -1 >>> 189 | -1 << -189;
        j = Long.reverse(-8712676874222968007L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-1651032658506030279L);
        m = Long.reverse(0x6E00000000000000L);
        n = 0x8000000 >>> 89 | 0x8000000 << ~89 + 1;
        o = Long.reverse(-1651032658506030279L);
        p = Long.reverse(0x6E00000000000000L);
        q = Integer.reverse(-1610612736);
        r = Long.reverse(-1651032658506030279L);
        s = Long.reverse(0x6E00000000000000L);
        t = Integer.reverse(0);
        u = 0x1000000 >>> 152 | 0x1000000 << -152;
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-8712676874222968007L);
        x = Integer.reverse(-536870912);
        y = Long.reverse(-8712676874222968007L);
        z = Integer.reverse(0x10000000);
        aa = Integer.reverse(-1);
        ab = Long.reverse(-8712676874222968007L);
        ac = Integer.reverse(-1879048192);
        ad = -1 >>> 67 | -1 << ~67 + 1;
        ae = Long.reverse(-8712676874222968007L);
        af = (20 >>> 129 | 20 << ~129 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(-8712676874222968007L);
        ah = (90112 >>> 205 | 90112 << -205) & 0xFFFFFFFF;
        ai = Long.reverse(-1651032658506030279L);
        aj = Long.reverse(0x6E00000000000000L);
        ak = 0 >>> 226 | 0 << ~226 + 1;
        al = Integer.reverse(0x30000000);
        am = 0xC000000 >>> 88 | 0xC000000 << -88;
        var_java_lang_String_arr_a = new String[al];
        var_java_lang_String_arr_b = new String[am];
        NLoginCore_344.b();
    }
}

