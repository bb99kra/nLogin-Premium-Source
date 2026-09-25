/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.geysermc.floodgate.api.FloodgateApi
 *  org.geysermc.floodgate.api.player.FloodgatePlayer
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_118;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_071;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.BedrockFloodgateHook;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public class NLoginCore_418
implements NLoginInterface_031 {
    private static long bc;
    private static int bo;
    private static long n;
    private static int m;
    private static int at;
    private static int al;
    private static long bg;
    private static int h;
    private static int ax;
    private static long co;
    private static long cs;
    private static long cw;
    private static int cc;
    private static long cz;
    private static int cu;
    private static long q;
    private static long ae;
    private static long d;
    private static int bu;
    private static long ap;
    private static int ak;
    @Nullable
    private final NLoginCore_118 var_com_nickuc_login_NLoginCore_118_a;
    private static long u;
    private static long cj;
    private static int ch;
    private static int ba;
    private static int cd;
    private static long aq;
    private static int az;
    private static long cp;
    private static int l;
    private static long c;
    private static int af;
    private static int var_int_a;
    private static int be;
    private static int var_int_e;
    private static int bm;
    private static int ab;
    private static int z;
    private static final Field var_java_lang_reflect_Field_a;
    private static int cy;
    private static long bx;
    private static long y;
    private static int ah;
    private static int ct;
    private static int ad;
    private static int o;
    private static int ag;
    private static int bw;
    private static int bj;
    private static int x;
    private static int j;
    private static int as;
    private static long var_long_b;
    private static long f;
    private static int p;
    private static int an;
    private static int bv;
    private static int bq;
    private static int cv;
    private static long r;
    private static int w;
    private static int bt;
    private static int bh;
    private static int cn;
    private static int bk;
    private static long by;
    private static int aw;
    private static int bi;
    private static int br;
    private static long ay;
    private static long au;
    private static int bb;
    private static int cr;
    private static long k;
    private static int am;
    private static int ai;
    private static int ca;
    private static long bp;
    private static int cm;
    private static int ck;
    private static int bn;
    private static int bz;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long g;
    private static long da;
    private static int aa;
    private static long ci;
    private static final Class<?> var_java_lang_Class____e;
    private static int cl;
    private static int cq;
    private static int bs;
    private static int bl;
    private static int ar;
    private static int t;
    private static int ac;
    private static long ce;
    private static long bf;
    private static int ao;
    private static int v;
    private final AttributeKey<FloodgatePlayer> var_io_netty_util_AttributeKey_org_geysermc_floodgate_api_player_FloodgatePlayer__b;
    private static int cb;
    private static long cx;
    private static long bd;
    private static int i;
    private static int cg;
    private static int s;
    private static int av;
    private static int cf;
    private static long aj;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(4079989545037668093L);
        d = Long.reverse(-7061644215716937728L);
        var_int_e = (0x10000000 >>> 60 | 0x10000000 << -60) & 0xFFFFFFFF;
        f = Long.reverse(4079989545037668093L);
        g = Long.reverse(-7061644215716937728L);
        h = 0 >>> 190 | 0 << -190;
        i = 128 >>> 70 | 128 << ~70 + 1;
        j = (-1 >>> 122 | -1 << -122) & 0xFFFFFFFF;
        k = Long.reverse(-6440419184499810563L);
        l = (0 >>> 228 | 0 << -228) & 0xFFFFFFFF;
        m = Integer.reverse(-1073741824);
        n = Long.reverse(-6440419184499810563L);
        o = 0 >>> 61 | 0 << -61;
        p = Integer.reverse(0x20000000);
        q = Long.reverse(4079989545037668093L);
        r = Long.reverse(-7061644215716937728L);
        s = (0 >>> 46 | 0 << -46) & 0xFFFFFFFF;
        t = (20 >>> 98 | 20 << ~98 + 1) & 0xFFFFFFFF;
        u = Long.reverse(-6440419184499810563L);
        v = 0 >>> 9 | 0 << ~9 + 1;
        w = (96 >>> 100 | 96 << -100) & 0xFFFFFFFF;
        x = (-1 >>> 116 | -1 << -116) & 0xFFFFFFFF;
        y = Long.reverse(-6440419184499810563L);
        z = Integer.reverse(0);
        aa = 0x200000 >>> 53 | 0x200000 << -53;
        ab = Integer.reverse(0);
        ac = (0x380000 >>> 211 | 0x380000 << ~211 + 1) & 0xFFFFFFFF;
        ad = -1 >>> 177 | -1 << -177;
        ae = Long.reverse(-6440419184499810563L);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = 0 >>> 33 | 0 << -33;
        ah = Integer.reverse(0x10000000);
        ai = -1 >>> 67 | -1 << -67;
        aj = Long.reverse(-6440419184499810563L);
        ak = 0 >>> 153 | 0 << -153;
        al = Integer.reverse(0);
        am = (64 >>> 6 | 64 << -6) & 0xFFFFFFFF;
        an = Integer.reverse(0);
        ao = Integer.reverse(-1879048192);
        ap = Long.reverse(4079989545037668093L);
        aq = Long.reverse(-7061644215716937728L);
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = Integer.reverse(0);
        at = (163840 >>> 174 | 163840 << ~174 + 1) & 0xFFFFFFFF;
        au = Long.reverse(-6440419184499810563L);
        av = (0 >>> 253 | 0 << ~253 + 1) & 0xFFFFFFFF;
        aw = Integer.reverse(-805306368);
        ax = Integer.reverse(-1);
        ay = Long.reverse(-6440419184499810563L);
        az = Integer.reverse(0x4000000);
        ba = (-268435451 >>> 188 | -268435451 << -188) & 0xFFFFFFFF;
        bb = Integer.reverse(0x30000000);
        bc = Long.reverse(4079989545037668093L);
        bd = Long.reverse(-7061644215716937728L);
        be = Integer.reverse(-1342177280);
        bf = Long.reverse(4079989545037668093L);
        bg = Long.reverse(-7061644215716937728L);
        bh = (8 >>> 161 | 8 << ~161 + 1) & 0xFFFFFFFF;
        bi = Integer.reverse(0);
        bj = Integer.reverse(Integer.MIN_VALUE);
        bk = Integer.reverse(0x40000000);
        bl = Integer.reverse(-1073741824);
        bm = Integer.reverse(0);
        bn = Integer.reverse(0x70000000);
        bo = -1 >>> 237 | -1 << ~237 + 1;
        bp = Long.reverse(-6440419184499810563L);
        bq = Integer.reverse(0x20000000);
        br = (0 >>> 221 | 0 << -221) & 0xFFFFFFFF;
        bs = Integer.reverse(Integer.MIN_VALUE);
        bt = Integer.reverse(0x40000000);
        bu = Integer.reverse(-1073741824);
        bv = Integer.reverse(0);
        bw = 1920 >>> 103 | 1920 << -103;
        bx = Long.reverse(4079989545037668093L);
        by = Long.reverse(-7061644215716937728L);
        bz = Integer.reverse(0);
        ca = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1) & 0xFFFFFFFF;
        cb = Integer.reverse(0);
        cc = (512 >>> 5 | 512 << -5) & 0xFFFFFFFF;
        cd = Integer.reverse(-1);
        ce = Long.reverse(-6440419184499810563L);
        cf = (Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << ~63 + 1) & 0xFFFFFFFF;
        cg = Integer.reverse(0);
        ch = Integer.reverse(-2013265920);
        ci = Long.reverse(4079989545037668093L);
        cj = Long.reverse(-7061644215716937728L);
        ck = Integer.reverse(0);
        cl = 0x580000 >>> 18 | 0x580000 << ~18 + 1;
        cm = 176 >>> 99 | 176 << -99;
        cn = Integer.reverse(0x48000000);
        co = Long.reverse(4079989545037668093L);
        cp = Long.reverse(-7061644215716937728L);
        cq = 0 >>> 38 | 0 << ~38 + 1;
        cr = Integer.reverse(-939524096);
        cs = Long.reverse(-6440419184499810563L);
        ct = Integer.reverse(Integer.MIN_VALUE);
        cu = Integer.reverse(0);
        cv = (0x140000 >>> 240 | 0x140000 << ~240 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(4079989545037668093L);
        cx = Long.reverse(-7061644215716937728L);
        cy = Integer.reverse(-1476395008);
        cz = Long.reverse(4079989545037668093L);
        da = Long.reverse(-7061644215716937728L);
        var_java_lang_String_arr_a = new String[cl];
        var_java_lang_String_arr_b = new String[cm];
        NLoginCore_418.b();
        var_int_e = (int)NLoginCore_298.a((String)NLoginCore_418.c("㺀", (int)cn, (long)(co ^ cp)), new String[cq]);
        if (var_int_e == null) {
            throw new IllegalArgumentException((String)NLoginCore_418.c("㺃", (int)cr, (long)cs));
        }
        String[] stringArray = new String[ct];
        stringArray[NLoginCore_418.cu] = NLoginCore_418.c("㺆", (int)cv, (long)(cw ^ cx));
        var_java_lang_reflect_Field_a = NLoginCore_546.a(var_int_e, stringArray);
        if (var_java_lang_reflect_Field_a == null) {
            throw new IllegalArgumentException((String)NLoginCore_418.c("㺉", (int)cy, (long)(cz ^ da)));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x79L;
        l ^= 0x26A68E6B701861AL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(37 + 32), 83, (byte)(27 + 20), (byte)(66 + 1), (byte)(26 + 40), (byte)(31 + 36), (byte)(23 + 24), (byte)(60 + 20), (byte)(40 + 35), 67, (byte)(20 + 63), (byte)(46 + 7), (byte)(16 + 64), (byte)(62 + 35), (byte)(3 + 97), (byte)(34 + 66), (byte)(79 + 26), (byte)(102 + 8), (byte)(72 + 31)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.E("խպչԼռոճռևնՃցօվցևՉࣤࢯࢸࣆࢿࣩࣇ࣢࣋࣫࣫ࣘ", (byte)78, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_418.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    @Generated
    public NLoginCore_118 a() {
        return this.var_com_nickuc_login_NLoginCore_118_a;
    }

    private boolean a(InetAddress inetAddress) {
        return (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress() || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_a.b(inetAddress) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_b.b(inetAddress) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_c.b(inetAddress) ? ca : cb) != 0;
    }

    @Override
    public boolean J() {
        return (this.d() != 0 ? am : an) != 0;
    }

    private static void b() {
        int n;
        c = -4649717043383174884L;
        long l = c ^ 0x26A68E6B701861AL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(16 + 53), (byte)(41 + 42), (byte)(23 + 24), (byte)(43 + 24), (byte)(27 + 39), (byte)(38 + 29), (byte)(28 + 19), (byte)(53 + 27), (byte)(74 + 1), 67, (byte)(27 + 56), 53, (byte)(19 + 61), (byte)(2 + 95), (byte)(79 + 21), (byte)(27 + 73), (byte)(51 + 54), (byte)(18 + 92), (byte)(39 + 64)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_418.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ƹƧƥǫƾǏƯƥǝǮǥǕǌǕǈǹǗǷǹǎǨǲǬǣȄǠǀǰǸǳȀȀ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[1] = NLoginCore_138.C("֓թՖմվ֛հ֐չճ֚֜ոոփ֛֦ժ֛ֆխվ֋քիվֵ֦֞֩֬օ֚֬վչֲֵ֭վֱֶֺֹּ֧֭֝֕ֈֶׄֈֿ֦֛֏֤ׄ֟׋׎׉ּכבךְֳִָ֣הלף֣֦֤ר׈ׇֹףץֿל׮ׅׯְֱאֶׅשךֵַצ׵״בחױב׭؀؅׆ֻמק؂׶׼םםؑ׏׍׿קסף؄א׫؛״םך؏׵ؙؕ׻ؕ׳ؗװؠأؤأ׽؍؅،ׯ׭׼،س؇ة؂؀׸׬׵ؼ׳ع؇ءذذفطؓل؋", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[2] = NLoginCore_387.D("ղռշէղ՛խ֔ձ֟և֞֗ջ֜ֈը֎֬ց֬ցղ֜։ֈֲմ֦֐օֲֵֺֈ֌֎ֳ֊֌׀ջׁրָָׅ֛֥֗֜֍ָ֍ֳִ֢֫׎ׂ֣֠י׍ָֹ֪֗֨֯֠עככגז֤הֹ׌֥֩֬טכׯאֳׁ֮ׄ׃׊׈י׃ױ׹׎׮ב׿׎׽א׭צך׾ץ׶ך׈؍ן؆؃׿זח", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[3] = NLoginCore_223.C("ժ֚՗ծղՓ՘֙ծան֠֜ղտ֊֛շո֦֡տ֎ֲֲַ֧֣֦֮֩֔֗մպ։տְջָ֘׃׃֡֝׈ֵֿ։׃׌֬ւאֽ։ׄ֍׋ׂ֤֬׌ַ֓־׏ֲֶׁ֛֩֘֠֜חלךׇ֣ני׌ץררׁלב׬׈׭ְׁזֻ׍׷׋ֱב׶חןןךע׋", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[4] = NLoginCore_138.B("ǟƣǋǈǏǑƼǁƪƧǏǗǯǪǃǍǐǗǹǎǻǚƽǋƾǳƼǀǷȀȇǵȋǭǝȁȌȁȉǬȋǧǩȄȀǑǺǲȗțǝǙțǙȜǲǻșǸǿȔǛȡȢǢțȈǿǫǩȁȯȇǵȪȕȕȷȂșǲȈǽȚȫțȲȭȬɄȺȠȡȝȁȪȄȢȯȯȆȌȿȤȲȋɎȨɀɑȭșȫȽɌɇɉɊɋɌɅɡȲɄȞȿȻɢȣȨɬȩɌȾɛȰɬɨɆȻ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[5] = NLoginCore_559.C("յե֏֐֏ժվ՜փտվՠե։ըբ֦ֆ֌ւցց֋ց֣֔ղ֐ֵַָ֔֬֜ռֱֳָ֒֞֬֘֡׈ֶ֓׀ֽׁ֛֭և׏ֱׅ׌֪׉ֿ֣א׎ָ֖׍׎ְֳ׊ֹט֕לזֳׇׇּ֧םֹצֽ׎ק׭׎הן״רב׬ץ׍ֲ", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[6] = NLoginCore_559.A("ƣƧǏǐƿƿƱǀǪƲǷƮƳǱǺǷǭǘǬƹǿǕȃǮǝȀȄǔȁǪǥǺȇȈǖǅǘǪǺȅȈǥǲȂǩǕȍȅȒȖǱǿȓǾȔȋǢȁǢȇǦȡțȅȍȠȉǿȊǭǻȲȇǭȉȄǲȌȒȘȺȵȘǽȖǷȪɂȿȣȟɂȩȓȘȜȤȫɎȨȋȋȍȎȰɌȿȡȳȣȑɉțȻȬȴȮɁɀɝȲɜəɅɕɒȽɝ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[7] = NLoginCore_110.E("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ׅ֯ב׏נֹ֠םֵּשפֹאנ֯ל֭ׄרדַרַצ׍זא׬׍ֿכ׶؅؄ֹ؅פ׶׉؆׭ט׆؂؉؆ׅא׭׷؈דץמ", (byte)122, 69);
                    NLoginCore_418.var_java_lang_String_arr_b[8] = NLoginCore_384.E("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ֱחךףרע֡׌׃׋׈ץץֽגװ׆ו׮ר׭ְ׎׌׳וא׿׾׭גֿעםל؂װ׹ד׺ם؁ׯׯ׌׮סבל؆ף׏נ׫؈؆؎؎׻טמ؀הؒ׼שת", (byte)122, 69);
                    NLoginCore_418.var_java_lang_String_arr_b[9] = NLoginCore_453.D("ժ։ջը֛ափ֤֑֕ձֈշ֪չվ֟֞֨կպպְլց֏ր։ְմְֶ֋ոְֶ֛֖֝րֱׁոֳ׃֩֙ׄ׈֖քֈֲֹ֜־ּ׍֍֦׊֢֩זבֽ֦׍֜׉ֱ֚ו׀֤ו֤דֺ׃ֽיֺ֬׈ףײױ֦ײבףֶ׳ךֳׅׯ׶׳ֲֽךפ׵׀ג׋", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[10] = NLoginCore_451.C("ժ։ջը֛ափ֤֑֕ձֈշ֪չվ֟֞֨կպպְլց֏ր։ְմְֶ֋ոְֶ֛֖֝րֱׁոֳ׃֩֙ׄ׈֖քֈׇֹ֞ׄאו׏֎ְֵָֹגגֿ֪םֳׂכוךֹֻ֝נֽׂ׬׫ךֿ֬׏׊׉ׯםצ׀ק׊׮ללֹכ׎־׉׳אּ׍ט׵׳׻׻רׅ׋׭ׁ׿שזח", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[11] = NLoginCore_324.B("ƧǙƶǢǙǚǝǪǂǌǆƻ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[12] = NLoginCore_223.D("ՙ֘Ֆէՠ֙֟՟ՠ՛֣ոշ֖֓ր֟ռս֬ջիիլ֣֭ծ֑֗օַ֩֝շ֊֩նպֻ֋ָ֦֣֗պ֒֜քփ׍׃ּֽֽׁׁ֣ׄ֨ה׌֩֫֯ל֪֯בה֯הםֿ׆֟׆ַֿ֢תף֭ךֻנֿ֫׍֫ײקׇ׉ֵצֵצא׻זנָדד׷׾׆ךבק״ׅ׋כ׭מ؃׼׎װ׿؄׫ו׫העג؆ׯؐؗؠ׿ן׶أ؛؅׼נ״׾ث؝تثء،׹؈؆؇؏ׯ؂،ظؒؤعؖ؈ؘ׻ض׸׿إص؞؋", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[13] = NLoginCore_027.C("հիծտվ՛փ֝ապֆի", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[14] = NLoginCore_446.B("ƩǨƦƷưǩǯƯưƫǳǈǇǦǣǐǯǌǍǼǋƻƻƼǽǳƾǧǡǕȇǹǭǇǚǹǆǊȋǛǧȈǶǳǊǢǬǔǓȝȓȌȍȔǳǸȑȍȑȤȜǹǻǿȬǿǺȡȤǿȤȭȏȖǭȰȘȊȉȋȄȶȬȜȡȠȽȳȐȻșșȑȂȃȪȚȧɏȊȨȑȾȉɉɓȕɖɍȯɏȦɌȱɎȺȗȡɖȹɁɜɅȿɛȟȠȺɝɆȸɜɧȮɯɅɁȰɖȲɤȹɣɆɩɮȴɈɒɉɆɇ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[15] = NLoginCore_324.F("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ֳֺ֥׃ֺ֠ע׀׊טֽ", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[16] = NLoginCore_091.F("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ׅ֯ב׏נֹ֠םֵּשפֹאנ֯ל֭ׄרדַרַצ׍זא׬׍ֿכ׶؅؄ֹ؅פ׶׉؆׭ט׆؂؉؆ׅא׭׷؈דץמ", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[17] = NLoginCore_004.F("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ֱחךףרע֡׌׃׋׈ץץֽגװ׆ו׮ר׭ְ׎׌׳וא׿׾׭גֿעםל؂װ׹ד׺ם؁ׯׯ׌׮סבל؆ף׏נ׫؈؆؎؎׻טמ؀הؒ׼שת", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[18] = NLoginCore_110.C("֜Ք՞Ց֑֑փ֕֒բր֙տդզզ֟օ֦փփְ֮֨֨֫նշ֣շ֖֥֪֓ո֫֐րռ֭փ׀֕ևַׇֽ֤֕׈׏ֹּ׎ֱׇׁ֒ׄבֻ֗֩הגֹ֫֝אי׎ֳׄמ֮֫", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[19] = NLoginCore_446.F("փ֜֩ս֔վֲղ֒քյֲֳ֪֧֗֔֟ց֭֋ּ֤ցֲֈ֢֢֮֟֞׊֭׀ִׅׅ֦ׅ֠׉׌֓טׄלהֳ֪׌ֲֳ֪֢֥֙֞׈ק֣֜קמל", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[20] = NLoginCore_384.A("ǚǀǍƮǛƫǍƼǊƯǨƻ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[21] = NLoginCore_427.D("հ։֖ժցի֟՟տձբք֗֔֟ց֠֌ծ֚ո֠փօ֊֩֯֟ֈյֵ֛֕־պ֑֟֘֌ֺւ֡֡ց֘֒ռֽֽׅ֢֥֡֡֎ׅ֢֤֔׌֮֐ֺֻ", (byte)122, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_418.var_java_lang_String_arr_b[0] = NLoginCore_027.D("թ՗Օ֛ծտ՟Օ֍֞֕օռօո֩և֧֩վ֛֘֟֟֔ֆְ֦֭֠֫֜", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[1] = NLoginCore_076.D("֓թՖմվ֛հ֐չճ֚֜ոոփ֛֦ժ֛ֆխվ֋քիվֵ֦֞֩֬օ֚֬վչֲֵ֭վֱֶֺֹּ֧֭֝֕ֈֶׄֈֿ֦֛֏֤ׄ֟׋׎׉ּכבךְֳִָ֣הלף֣֦֤ר׈ׇֹףץֿל׮ׅׯְֱאֶׅשךֵַצ׵״בחױב׭؀؅׆ֻמק؂׶׼םםؑ׏׍׿קסף؄א׫؛״םך؏׵ؙؕ׻ؕ׳ؗװؠأؤأ׽؍؅،ׯ׭׼،س؇ة؂؀׸׬׵؄سؒشب؊؛ج؃آؖ؋", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ղռշէղ՛խ֔ձ֟և֞֗ջ֜ֈը֎֬ց֬ցղ֜։ֈֲմ֦֐օֲֵֺֈ֌֎ֳ֊֌׀ջׁրָָׅ֛֥֗֜֍ָ֍ֳִ֢֫׎ׂ֣֠י׍ָֹ֪֗֨֯֠עככגז֤הֹ׌֥֩֬טכׯאֳׁ֮ׄ׃׊׈י׃ױ׹׎׮ב׿׎׽א׭׮ײח׻י׸מ؉שצ׊שפ؎؊؇׏׬ײ׳יב", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ս֭ժցօզի֬ցմ։ֳ֯օ֮֒֝֊֋ִֶֹֺֹּ֧֪ׅ֒֡׊ׁׅև֍֜֒׃֎׋֫זזְִכ׈ג֜זןֿ֕ףא֜ח֠מוַֿן֦׊בעֳּׅ֮֫׉֯התׯ׭ךֶ׳׬ן׸׻׻הׯפ׿כ؀׃הש׎ׇׯײؐ؇ץפןؓקؗמ", (byte)122, 69);
                    NLoginCore_418.var_java_lang_String_arr_b[4] = NLoginCore_223.D("֏Փջոտցլձ՚՗տև֚֟ճսրև֩վ֫֊խջծ֣լհְַֻ֧֥֝֍ְֱֱִֹֻּ֜֗֙ցׇ֪֢׋֍։׋։׌֢֫׉֨֯ׄ֋בג֒׋ֱָ֛֯֙ןַ֥ךׅׅקֲ׉ָ֢֭׊כ׋עםל״תאב׍ֱךִגןןֶּׯהעֻ׾טװ؁ם׉כ׭׼׷׹׺׻׼׵ؑע״׎ׯ׫ؒ׳צؑוؠל׽׼׾לؠ׫", (byte)122, 68);
                    NLoginCore_418.var_java_lang_String_arr_b[5] = NLoginCore_201.C("յե֏֐֏ժվ՜փտվՠե։ըբ֦ֆ֌ւցց֋ց֣֔ղ֐ֵַָ֔֬֜ռֱֳָ֒֞֬֘֡׈ֶ֓׀ֽׁ֛֭և׏ֱׅ׌֪׉ֿ֣א׎ָ֖׍׎ְֳ׊ֹט֕לזֳׇׇּ֧םֹצֽ׎קסצײ׃א֨׏ח׮׊א", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[6] = NLoginCore_387.F("զժ֒֓ււմփ֭յֺձնְִֺֽ֛֯ռׂ֘׆ֱ֠׃ׇֽ֭֗ׄ֨׊׋֙ֈֽ֛֭׈׋ֵׅ֨֬֘א׈ויִׂזׁח׎֥֥ׄ׊֩פמ׈אף׌ׂ׍ְ־׵׊ְ׌ֵׇ׏וכ׽׸כ׀יֺ׭؅؂צע؅׬זכןק׮ؑ׫׎׎אב׳؏؂פ׶צה،מ׾ׯ׷ױ؎ל׵ף׿؆ףתؘ׵׷", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[7] = NLoginCore_453.C("ժ։ջը֛ափ֤֑֕ձֈշ֪չվ֟֞֨կպպְլց֏ր։ְմְֶ֋ոְֶ֛֖֝րֱׁոֳ׃֩֙ׄ׈֖քֈֲֹ֜־ּ׍֍֦׊֢֩זבֽ֦׍֜׉ֱ֚ו׀֤ו֤דֺ׃ֽיֺ֬׈ףײױ֦ײבףֶ׳ךַׅ׾וֵדֹתס׌ֻ׼׋", (byte)122, 67);
                    NLoginCore_418.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ƺǙǋƸǫƱǓǴǥǡǁǘǇǺǉǎǯǮǸƿǊǊȀƼǑǟǐǙȀǄȆȀǛǈȀǫǦǭȆǐȁȑǈȃȓǹǩȔȘǦǔǘȉǮȔȗȠȥȟǞȉȀȈȅȢȢǺȏȭȃȒȫȥȪǭȋȉȰȒȍȼȻȪȏǼȟȚșȿȭȶȐȷȚȾȬȬȉȫȞȎșɃȠȌȝȨȢɒɌɂȖɘɐȐȼɛɏȦȧ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[9] = NLoginCore_427.B("ƺǙǋƸǫƱǓǴǥǡǁǘǇǺǉǎǯǮǸƿǊǊȀƼǑǟǐǙȀǄȆȀǛǈȀǫǦǭȆǐȁȑǈȃȓǹǩȔȘǦǔǘȉǬȂȎȌȝǝǶȚǲǹȦȡǶȍȝǬșȁǪȥȐǴȥǴȣȊȓȍȩȊǼȘȳɂɁǶɂȡȳȆɃȪȕȇǿȯɂȜɁɏȮȤȑȪț", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[10] = NLoginCore_324.F("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ֱחךףרע֡׌׃׋׈ץץֽגװ׆ו׮ר׭ְ׎׌׳וא׿׾׭גֿעםל؂װ׹ד׺ם؁ׯׯ׌׮סבל؆ף׏נ׫׮׍؜؈׳ؓװןؐװؒשת", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[11] = NLoginCore_092.B("ƼǍƶǥǊǛǅƻǨƭǊƻ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[12] = NLoginCore_138.A("ƩǨƦƷưǩǯƯưƫǳǈǇǦǣǐǯǌǍǼǋƻƻƼǽǳƾǧǡǕȇǹǭǇǚǹǆǊȋǛǧȈǶǳǊǢǬǔǓȝȓȌȍȔǳǸȑȍȑȤȜǹǻǿȬǿǺȡȤǿȤȭȏȖǯȖǲȇȏȺȳǽȪȋȰȏǻȝǻɂȷȗșȅȶȅȶȠɋȦȰȈȣȣɇɎȖȪȡȷɄȕțȫȽȮɓɌȞɀɏɔȻȥȻȤȲȢɖȿɠɧɰɏȯɆɳɫɕɌȰɄɎɻɭɺɻɱɜɉɘɖɗɟȿɒɜʈɢɴɢɉʄɷɹɝɰʈɟʃɭʘɷʈʉɯɗʋɖʕʐʟɦɧ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[13] = NLoginCore_201.E("֗ծչ֧ռւ֝տֱ֗֍վ", (byte)122, 69);
                    NLoginCore_418.var_java_lang_String_arr_b[14] = NLoginCore_138.F("լ֫թպճֲ֬ղճծֶ֋֊ֲ֦֩֓֏֐ֿ֎վվտ׀ֶց֪֤֘׊ְּ֊ּ֝։֍׎֪֞׋ֶֹ֍֥֖֯֗נז׏אחֶֻהאהקןּ־ׂׯֽׂפקׂקװגיְ׳כ׍׌׎ׇ׹ׯןפף؀׶ד׾ללהׅ׆׭םתؒ׍׫ה؁׌،ؖטؙؐײؒש؏״ؑ׽ךפؙ׼؄؟؈؂؞עף׽ؠ؉׻؟تױز؈؄׳ءضؐزؕؔاؾػ؎ؔ،؉؊", (byte)122, 70);
                    NLoginCore_418.var_java_lang_String_arr_b[15] = NLoginCore_387.B("ƺǙǋƸǫƱǓǴǥǡǁǘǇǺǉǎǯǮǸƿǊǊȀƼǑǟǐǙȀǄȆȀǛǈȀǫǦǭȆǐȁȑǈȃȓǹǩȔȘǦǔǘȉǩǠǬǷȄȐǤȗǟȒǦ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[16] = NLoginCore_453.B("ƺǙǋƸǫƱǓǴǥǡǁǘǇǺǉǎǯǮǸƿǊǊȀƼǑǟǐǙȀǄȆȀǛǈȀǫǦǭȆǐȁȑǈȃȓǹǩȔȘǦǔǘȉǬȂȎȌȝǝǶȚǲǹȦȡǶȍȝǬșȁǪȥȐǴȥǴȣȊȓȍȩȊǼȘȳɂɁǶɂȡȳȆɃȪȕȗȿɅȬɐȽȿȬȐȌȞț", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[17] = NLoginCore_091.E("ս֜֎ջ֮մַ֖֤֨ք֛֊ֽ֌ֱֲֻ֑ւ֍֍׃տ֢֔֓֜׃և׉׃֞֋׃ְ֮֩׉֓ׄה֋׆זּ֬חכ֛֩֗׌ֱחךףרע֡׌׃׋׈ץץֽגװ׆ו׮ר׭ְ׎׌׳וא׿׾׭גֿעםל؂װ׹ד׺ם؁ׯׯ׌׮סבל؆ף׏נ׬א׭ץ؉ק؈ן׼؂آآשת", (byte)122, 69);
                    NLoginCore_418.var_java_lang_String_arr_b[18] = NLoginCore_092.A("ǬƤƮơǡǡǓǥǢƲǐǩǏƴƶƶǯǕǶǓǓȀǸǸǻǾǆǇǳǇǦǣǵǺǈǻǠǐǌǽǓȐǥǗȗǴȇǥȍȘȟȌȉȞǢȗȁȔȑȡǧǹȋȤȟȕȯǮǭǿȦǿȤȀȂǻ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[19] = NLoginCore_223.B("ǀǙǦƺǑƻǯƯǏǁƲǔǧǤǯǑǰǜƾǪǈǹǡƾǯǅǜǟǛǟǫȇǪǽȂȂǣǝȂǱȆȉǐȕȁșȑǧǰȉǧǖǯǛǙǜȠȑǝȖȚȣȄȞ", (byte)122, 66);
                    NLoginCore_418.var_java_lang_String_arr_b[20] = NLoginCore_138.A("ƸƧƸǇƨǇƨƿǭǆǰƻ", (byte)122, 65);
                    NLoginCore_418.var_java_lang_String_arr_b[21] = NLoginCore_092.B("ǀǙǦƺǑƻǯƯǏǁƲǔǧǤǯǑǰǜƾǪǈǰǓǕǚǹǿǯǘǅǫǥȅȎǊǯǨǡǜȊǒǱǱǑǨǢǌȕǲȍȍǱǱǬțǵǛǮȒǰǻȒȘǨ", (byte)122, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_418.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ƿǧǆƹǣǆƽƻǜƳǨǟǩǌǘǺǗǖǵƱǿǿǆǇ", (byte)122, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_418.var_java_lang_String_arr_b[0] = NLoginCore_092.E("թռգվ֣։և֤թ֌֭ք֍ְִִּ֧֪֮վ֌։֊", (byte)122, 69);
                }
            }
        }
    }

    public int d() {
        return this.r().length();
    }

    public NLoginCore_418(NLoginType_008 NLoginType_008) {
        this.var_long_b = (long)AttributeKey.valueOf((String)NLoginCore_418.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() != NLoginCore_419.var_com_nickuc_login_NLoginCore_419_c || BedrockFloodgateHook.aF) {
            this.var_com_nickuc_login_NLoginCore_118_a = new NLoginCore_118(NLoginType_008, this);
        } else {
            NLoginCore_370.c((String)NLoginCore_418.c("㺃", (int)var_int_e, (long)(f ^ g)), new Object[h]);
            NLoginCore_370.c((String)NLoginCore_418.c("㺆", (int)(i & j), (long)k), new Object[l]);
            this.var_com_nickuc_login_NLoginCore_118_a = null;
        }
        if (!this.J()) {
            if (NLoginCore_150.j()) {
                NLoginCore_370.c((String)NLoginCore_418.c("㺉", (int)m, (long)n), new Object[o]);
                NLoginCore_370.c((String)NLoginCore_418.c("㺌", (int)p, (long)(q ^ r)), new Object[s]);
            } else {
                NLoginCore_370.c((String)NLoginCore_418.c("㺏", (int)t, (long)u), new Object[v]);
                NLoginCore_370.c((String)NLoginCore_418.c("㺒", (int)(w & x), (long)y), new Object[z]);
            }
        }
    }

    public String r() {
        try {
            org.geysermc.floodgate.api.FloodgateApi api = org.geysermc.floodgate.api.FloodgateApi.getInstance();
            if (api != null) {
                String prefix = api.getPlayerPrefix();
                if (prefix != null) {
                    return prefix;
                }
            }
            return NLoginCore_418.c("㺆", (int)(aw & ax), (long)ay);
        }
        catch (Throwable throwable) {
            return NLoginCore_418.c("㺆", (int)(aw & ax), (long)ay);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_418.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.B("ÝÿāáąĤĜĲĞíīġįĩòėĹĸİĶİą", (byte)27, 66), NLoginCore_418.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.C("ѩѶѵиѸѴѯѸ҃ѲпѽҁѺѽ҃хߠޫ޴߂޻ߥ߃ߞ߇ߧߧߔѝ", (byte)27, 67) + string + NLoginCore_076.B("ï", (byte)27, 66) + methodType.toString(), exception);
        }
    }

    @Nullable
    public FloodgatePlayer a(String string, String string2) {
        try {
            for (FloodgatePlayer floodgatePlayer : FloodgateApi.getInstance().getPlayers()) {
                String string3;
                String string4 = floodgatePlayer.getUsername().replace((char)az, (char)ba);
                String string5 = floodgatePlayer.getCorrectUsername();
                if (!string4.equals(string) && !string5.equals(string)) continue;
                try {
                    string3 = (String)var_java_lang_reflect_Field_a.get(floodgatePlayer);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new RuntimeException(illegalAccessException);
                }
                if (!string3.equals(string2)) {
                    InetAddress inetAddress;
                    try {
                        inetAddress = InetAddress.getByName(string2);
                    }
                    catch (UnknownHostException unknownHostException) {
                        Object[] objectArray = new Object[bh];
                        objectArray[NLoginCore_418.bi] = floodgatePlayer.getUsername();
                        objectArray[NLoginCore_418.bj] = floodgatePlayer.getCorrectUsername();
                        objectArray[NLoginCore_418.bk] = string2;
                        objectArray[NLoginCore_418.bl] = string3;
                        String string6 = String.format((String)NLoginCore_418.c("㺀", (int)bb, (long)(bc ^ bd)) + unknownHostException.getMessage() + (String)NLoginCore_418.c("㺃", (int)be, (long)(bf ^ bg)), objectArray);
                        NLoginCore_370.c(string6, new Object[bm]);
                        break;
                    }
                    if (!this.a(inetAddress)) {
                        Object[] objectArray = new Object[bq];
                        objectArray[NLoginCore_418.br] = floodgatePlayer.getUsername();
                        objectArray[NLoginCore_418.bs] = floodgatePlayer.getCorrectUsername();
                        objectArray[NLoginCore_418.bt] = string3;
                        objectArray[NLoginCore_418.bu] = string2;
                        String string7 = String.format((String)NLoginCore_418.c("㺆", (int)(bn & bo), (long)bp), objectArray);
                        NLoginCore_370.c(string7, new Object[bv]);
                        break;
                    }
                }
                return floodgatePlayer;
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_418.c("㺉", (int)bw, (long)(bx ^ by)), throwable, new Object[bz]);
        }
        return null;
    }

    @Generated
    public AttributeKey<FloodgatePlayer> a() {
        return this.var_long_b;
    }

    @Override
    public boolean boolean_a(UUID uUID) {
        try {
            return (uUID != null && FloodgateApi.getInstance().isFloodgatePlayer(uUID) ? aa : ab) != 0;
        }
        catch (Throwable throwable) {
            if (throwable.getCause() instanceof ClassNotFoundException) {
                Object[] objectArray = new Object[af];
                objectArray[NLoginCore_418.ag] = throwable.getMessage();
                NLoginCore_370.c((String)NLoginCore_418.c("㺀", (int)(ac & ad), (long)ae), objectArray);
            } else {
                NLoginCore_370.b((String)NLoginCore_418.c("㺃", (int)(ah & ai), (long)aj), throwable, new Object[ak]);
            }
            return al != 0;
        }
    }

    @Nullable
    public FloodgatePlayer org_geysermc_floodgate_api_player_FloodgatePlayer_a(UUID uUID) {
        try {
            return uUID != null ? FloodgateApi.getInstance().getPlayer(uUID) : null;
        }
        catch (Throwable throwable) {
            if (throwable.getCause() instanceof ClassNotFoundException) {
                Object[] objectArray = new Object[cf];
                objectArray[NLoginCore_418.cg] = throwable.getMessage();
                NLoginCore_370.c((String)NLoginCore_418.c("㺀", (int)(cc & cd), (long)ce), objectArray);
            } else {
                NLoginCore_370.b((String)NLoginCore_418.c("㺃", (int)ch, (long)(ci ^ cj)), throwable, new Object[ck]);
            }
            return null;
        }
    }
}

