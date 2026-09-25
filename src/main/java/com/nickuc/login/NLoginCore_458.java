/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent
 *  com.nickuc.login.lib.packetevents.api.event.PacketSendEvent
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  io.netty.channel.Channel
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.NLoginCore_408;
import com.nickuc.login.NLoginCore_280;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_234;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_003;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginInterface_043;
import com.nickuc.login.NLoginCore_073;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_588;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_458
implements NLoginInterface_003,
NLoginInterface_043 {
    private static int v;
    private static int al;
    private static long ah;
    private static int w;
    private static int be;
    private static long ad;
    private static long ae;
    private static long an;
    private static int var_int_b;
    private static long x;
    private static long ar;
    private static int at;
    private static int k;
    private static int az;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_z;
    private static int e;
    private static int au;
    private static int ap;
    private static long ag;
    private static int j;
    private static int aa;
    private static int ax;
    private static int r;
    private static int as;
    private static long p;
    private static String[] var_java_lang_String_arr_b;
    private static long g;
    private static int l;
    private static int ac;
    private static long ab;
    private static int y;
    private static long m;
    private static int h;
    private static int var_int_z;
    private static int n;
    private static String[] var_java_lang_String_arr_a;
    private static int ak;
    private static long aq;
    private static long d;
    private static int var_int_a;
    private static int ba;
    private static long c;
    private static long q;
    private static int s;
    private static long ay;
    private static long av;
    private static long u;
    private static int ao;
    private static long f;
    private static long bb;
    private static long t;
    private static int aj;
    private static int bd;
    private static long bc;
    private static int af;
    private static long am;
    private static int aw;
    private static int ai;
    private static int i;
    private static int o;

    private static String a(int n, long l) {
        l ^= 0x18L;
        l ^= 0x13EFF9B2FC529AB5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(57 + 12), 83, (byte)(36 + 11), (byte)(39 + 28), (byte)(16 + 50), (byte)(55 + 12), (byte)(3 + 44), (byte)(68 + 12), (byte)(65 + 10), (byte)(17 + 50), (byte)(2 + 81), (byte)(19 + 34), (byte)(45 + 35), 97, (byte)(92 + 8), (byte)(31 + 69), (byte)(40 + 65), (byte)(89 + 21), (byte)(97 + 6)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(61 + 22)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ԰ԳԹӻ࢈࢔࡯ࡹࢆ࢓ࢍ࢏ࡸ", (byte)0, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_458.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void a(PacketReceiveEvent packetReceiveEvent) {
        User user = packetReceiveEvent.getUser();
        Channel channel = (Channel)packetReceiveEvent.getChannel();
        NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
        if (NLoginCore_5882 == null) {
            String string = (String)NLoginCore_458.c("㺀", (int)(var_int_a & var_int_b), (long)d) + user.getName() + (String)NLoginCore_458.c("㺃", (int)e, (long)(f ^ g));
            NLoginCore_370.c(string, new Object[h]);
            String[] stringArray = new String[i];
            stringArray[NLoginCore_458.j] = NLoginCore_458.c("㺆", (int)(k & l), (long)m);
            stringArray[NLoginCore_458.n] = NLoginCore_458.c("㺉", (int)o, (long)(p ^ q));
            stringArray[NLoginCore_458.r] = (String)NLoginCore_458.c("㺌", (int)s, (long)(t ^ u)) + string;
            stringArray[NLoginCore_458.v] = NLoginCore_458.c("㺏", (int)w, (long)x);
            stringArray[NLoginCore_458.y] = NLoginCore_458.c("㺒", (int)(var_int_z & aa), (long)ab);
            NLoginCore_234.i(user, NLoginCore_112.a(stringArray));
            return;
        }
        String string = NLoginCore_5882.java_lang_String_d();
        InetAddress inetAddress = user.getAddress().getAddress();
        NLoginCore_280 NLoginCore_280 = NLoginCore_073.com_nickuc_login_NLoginCore_280_a(string, inetAddress);
        switch (NLoginCore_408.Q[NLoginCore_280.ordinal()]) {
            case 1: 
            case 2: {
                NLoginCore_073.a(this.var_com_nickuc_login_NLoginType_008_z, string, inetAddress, NLoginCore_280.var_com_nickuc_login_NLoginCore_280_a);
            }
        }
    }

    static {
        var_int_a = 0 >>> 6 | 0 << -6;
        var_int_b = (-1 >>> 147 | -1 << ~147 + 1) & 0xFFFFFFFF;
        d = Long.reverse(-5561543878746664748L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-6138004631050088236L);
        g = Long.reverse(0x1800000000000000L);
        h = (0 >>> 214 | 0 << -214) & 0xFFFFFFFF;
        i = Integer.reverse(-1610612736);
        j = 0 >>> 238 | 0 << ~238 + 1;
        k = Integer.reverse(0x40000000);
        l = Integer.reverse(-1);
        m = Long.reverse(-5561543878746664748L);
        n = 65536 >>> 208 | 65536 << -208;
        o = (24576 >>> 13 | 24576 << ~13 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-6138004631050088236L);
        q = Long.reverse(0x1800000000000000L);
        r = (0x40000000 >>> 221 | 0x40000000 << -221) & 0xFFFFFFFF;
        s = (2 >>> 223 | 2 << ~223 + 1) & 0xFFFFFFFF;
        t = Long.reverse(-6138004631050088236L);
        u = Long.reverse(0x1800000000000000L);
        v = 24 >>> 163 | 24 << ~163 + 1;
        w = 640 >>> 167 | 640 << -167;
        x = Long.reverse(-5561543878746664748L);
        y = Integer.reverse(0x20000000);
        var_int_z = Integer.reverse(0x60000000);
        aa = -1 >>> 85 | -1 << -85;
        ab = Long.reverse(-5561543878746664748L);
        ac = (14 >>> 65 | 14 << ~65 + 1) & 0xFFFFFFFF;
        ad = Long.reverse(-6138004631050088236L);
        ae = Long.reverse(0x1800000000000000L);
        af = Integer.reverse(0x10000000);
        ag = Long.reverse(-6138004631050088236L);
        ah = Long.reverse(0x1800000000000000L);
        ai = Integer.reverse(0);
        aj = 0x280000 >>> 243 | 0x280000 << -243;
        ak = Integer.reverse(0);
        al = 576 >>> 70 | 576 << ~70 + 1;
        am = Long.reverse(-6138004631050088236L);
        an = Long.reverse(0x1800000000000000L);
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = Integer.reverse(0x50000000);
        aq = Long.reverse(-6138004631050088236L);
        ar = Long.reverse(0x1800000000000000L);
        as = Integer.reverse(0x40000000);
        at = Integer.reverse(-805306368);
        au = Integer.reverse(-1);
        av = Long.reverse(-5561543878746664748L);
        aw = (0x6000000 >>> 121 | 0x6000000 << -121) & 0xFFFFFFFF;
        ax = -2147483647 >>> 29 | -2147483647 << -29;
        ay = Long.reverse(-5561543878746664748L);
        az = Integer.reverse(0x20000000);
        ba = Integer.reverse(-1342177280);
        bb = Long.reverse(-6138004631050088236L);
        bc = Long.reverse(0x1800000000000000L);
        bd = Integer.reverse(0x70000000);
        be = Integer.reverse(0x70000000);
        var_java_lang_String_arr_a = new String[bd];
        var_java_lang_String_arr_b = new String[be];
        NLoginCore_458.b();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_458.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.F("Փյշ՗ջ֚֒֨֔գ֥֡֗֟ը֍֦֦֮֯֬ջ", (byte)111, 70), NLoginCore_458.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.D("եղձԴմհիմտծԻչսնչտՁ࣎ࣚࢵࢿ࣓࣌ࣙࣕࢾՖ", (byte)111, 68) + string + NLoginCore_138.F("ե", (byte)111, 70) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        c = 3101134067307285333L;
        long l = c ^ 0x13EFF9B2FC529AB5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(27 + 42), (byte)(51 + 32), (byte)(10 + 37), (byte)(16 + 51), (byte)(62 + 4), (byte)(60 + 7), (byte)(14 + 33), (byte)(20 + 60), (byte)(35 + 40), 67, (byte)(19 + 64), (byte)(14 + 39), (byte)(13 + 67), (byte)(25 + 72), (byte)(40 + 60), (byte)(80 + 20), (byte)(67 + 38), 110, (byte)(20 + 83)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_458.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюгЧрѝџџѨѪяъл", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[1] = NLoginCore_453.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыєѓљѲкѡѐҁуѱѾўыь", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[2] = NLoginCore_384.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
                    NLoginCore_458.var_java_lang_String_arr_b[3] = NLoginCore_091.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[4] = NLoginCore_092.E("ԱԫԤԉԳԈԊԧӶԴӻԅ", (byte)1, 69);
                    NLoginCore_458.var_java_lang_String_arr_b[5] = NLoginCore_387.D("ОЉТЄРЅϳЗϷЕЭЀ", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[6] = NLoginCore_110.D("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[7] = NLoginCore_387.F("ԏԌԴӳԭԑӷԵԴԫԨՂԑӽԢԭԖԅԣԃԀԁՇՁԯԆԨԮԡԏՐԱԣԧԷԣԒԒԯ԰ԭԶԹԴՃԭՎ՗Ԟ՘ՁԛՓԸԬՅբդդխկՔՏՀ", (byte)1, 70);
                    NLoginCore_458.var_java_lang_String_arr_b[8] = NLoginCore_201.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔĝĜĢĻăĪęŊČĺŇħĔĕ", (byte)1, 66);
                    NLoginCore_458.var_java_lang_String_arr_b[9] = NLoginCore_027.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
                    NLoginCore_458.var_java_lang_String_arr_b[10] = NLoginCore_575.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[11] = NLoginCore_138.A("õïèÍ÷ÌÎëºø¿É", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[12] = NLoginCore_223.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[13] = NLoginCore_091.C("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_458.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюжшмхзїдХэѪа", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[1] = NLoginCore_324.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔğğŁĝđĺĹŀĈłģĽĔĕ", (byte)1, 66);
                    NLoginCore_458.var_java_lang_String_arr_b[2] = NLoginCore_451.C("ЯЄаАϳϳЅЈЎКЙийЧЫМЊНЍхоЎЋЌ", (byte)1, 67);
                    NLoginCore_458.var_java_lang_String_arr_b[3] = NLoginCore_575.A("òèÈè´ï·Ì»Ï»É", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[4] = NLoginCore_324.C("ϪНГШбϬТдЎЭйЀ", (byte)1, 67);
                    NLoginCore_458.var_java_lang_String_arr_b[5] = NLoginCore_092.B("Â¹Ì³¸à÷éúóöÉ", (byte)1, 66);
                    NLoginCore_458.var_java_lang_String_arr_b[6] = NLoginCore_091.E("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ԰ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑաԮԔՃԮՏՃԶբՆՊՙ԰Ա", (byte)1, 69);
                    NLoginCore_458.var_java_lang_String_arr_b[7] = NLoginCore_092.C("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюкиСгдеѪѕѦцћ", (byte)1, 67);
                    NLoginCore_458.var_java_lang_String_arr_b[8] = NLoginCore_446.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыѕгеѯѠѶоксжпѴыь", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[9] = NLoginCore_138.E("ԴԉԵԕӸӸԊԍԓԟԜԘԚӹԥՆӸՅ԰ԄԅԹԐԑ", (byte)1, 69);
                    NLoginCore_458.var_java_lang_String_arr_b[10] = NLoginCore_559.A("×ÆÎ·ç¹ÎüþÕúÉ", (byte)1, 65);
                    NLoginCore_458.var_java_lang_String_arr_b[11] = NLoginCore_110.B("ËðÛõÔùéßĂ¹þÉ", (byte)1, 66);
                    NLoginCore_458.var_java_lang_String_arr_b[12] = NLoginCore_223.D("ЈϯЮЄДСЭЙЅЕеЀ", (byte)1, 68);
                    NLoginCore_458.var_java_lang_String_arr_b[13] = NLoginCore_223.F("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ԰ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑՠԿՂ՞ԭԛԼՠ԰ՕՇԳ԰Ա", (byte)1, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_458.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ЯЍϽЌОϰХЬддϺаДлЫнйϼзЯрупвϿХрмуйЅЫ", (byte)1, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_458.var_java_lang_String_arr_b[0] = NLoginCore_027.B("¶ÇÅúï×ÓÉÒäØÉ", (byte)1, 66);
                }
            }
        }
    }

    @Override
    public void a(PacketSendEvent packetSendEvent) {
        InetAddress inetAddress;
        String string;
        User user = packetSendEvent.getUser();
        Channel channel = (Channel)packetSendEvent.getChannel();
        NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
        if (NLoginCore_5882 == null) {
            String string2 = (String)NLoginCore_458.c("㺀", (int)ac, (long)(ad ^ ae)) + user.getName() + (String)NLoginCore_458.c("㺃", (int)af, (long)(ag ^ ah));
            NLoginCore_370.c(string2, new Object[ai]);
            String[] stringArray = new String[aj];
            stringArray[NLoginCore_458.ak] = NLoginCore_458.c("㺆", (int)al, (long)(am ^ an));
            stringArray[NLoginCore_458.ao] = NLoginCore_458.c("㺉", (int)ap, (long)(aq ^ ar));
            stringArray[NLoginCore_458.as] = (String)NLoginCore_458.c("㺌", (int)(at & au), (long)av) + string2;
            stringArray[NLoginCore_458.aw] = NLoginCore_458.c("㺏", (int)ax, (long)ay);
            stringArray[NLoginCore_458.az] = NLoginCore_458.c("㺒", (int)ba, (long)(bb ^ bc));
            NLoginCore_234.i(user, NLoginCore_112.a(stringArray));
            return;
        }
        NLoginCore_280 NLoginCore_280 = NLoginCore_073.com_nickuc_login_NLoginCore_280_a(string = NLoginCore_5882.java_lang_String_d(), inetAddress = user.getAddress().getAddress());
        NLoginCore_073.a(this.var_com_nickuc_login_NLoginType_008_z, string, inetAddress, NLoginCore_280 == NLoginCore_280.var_com_nickuc_login_NLoginCore_280_b ? NLoginCore_280.var_com_nickuc_login_NLoginCore_280_d : NLoginCore_280.var_com_nickuc_login_NLoginCore_280_e);
    }

    @Generated
    public NLoginCore_458(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_z = NLoginType_008;
    }
}

