/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.limbo.DelayedPlayerLimboClearTask;
import com.nickuc.login.tasks.limbo.PlayerLimboClearTask;
import com.nickuc.login.tasks.limbo.PlayerLimboRestoreTask;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_456;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_310;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;

public class NLoginCore_447
extends NLoginCore_310 {
    private static long bc;
    private final NLoginCore_456 var_com_nickuc_login_NLoginCore_456_a;
    private static int am;
    private static long ah;
    private static int ad;
    private static String[] d;
    private static int bm;
    private static String[] c;
    private static int bg;
    private static long u;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_a;
    private static int aa;
    private static int bl;
    private static int as;
    private static int ar;
    private static long bk;
    private static long af;
    private static long q;
    private static int ax;
    private static int ba;
    private static int av;
    private static int ab;
    private static long ak;
    private static long p;
    private static int ap;
    private static long z;
    private static long e;
    private static int y;
    private static int l;
    private static long ac;
    private static int m;
    private static long v;
    private static int t;
    private static int bh;
    private static int o;
    private static int bj;
    private static long n;
    private static long ay;
    private static int ag;

    public NLoginCore_447(nLoginBukkit nLoginBukkit2) {
        super(nLoginBukkit2.com_nickuc_login_NLoginType_008_a());
        this.var_com_nickuc_login_bukkit_nLoginBukkit_a = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_456_a = new NLoginCore_456(nLoginBukkit2);
    }

    static {
        l = Integer.reverse(0);
        m = Integer.reverse(-1);
        n = Long.reverse(-6336063559446913429L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Long.reverse(-5759602807143489941L);
        q = Long.reverse(0x1800000000000000L);
        t = Integer.reverse(0x40000000);
        u = Long.reverse(-5759602807143489941L);
        v = Long.reverse(0x1800000000000000L);
        y = 6 >>> 97 | 6 << -97;
        z = Long.reverse(-6336063559446913429L);
        aa = Integer.reverse(0);
        ab = Integer.reverse(0x20000000);
        ac = Long.reverse(-6336063559446913429L);
        ad = Integer.reverse(-1610612736);
        af = Long.reverse(-6336063559446913429L);
        ag = Integer.reverse(0x60000000);
        ah = Long.reverse(-5759602807143489941L);
        ak = Long.reverse(0x1800000000000000L);
        am = 0 >>> 187 | 0 << ~187 + 1;
        ap = Integer.reverse(0x4C000000);
        ar = 0 >>> 240 | 0 << -240;
        as = Integer.reverse(0);
        av = Integer.reverse(0);
        ax = (0x38000000 >>> 251 | 0x38000000 << ~251 + 1) & 0xFFFFFFFF;
        ay = Long.reverse(-6336063559446913429L);
        ba = Integer.reverse(0x10000000);
        bc = Long.reverse(-6336063559446913429L);
        bg = Integer.reverse(0);
        bh = Integer.reverse(-1879048192);
        bj = (-1 >>> 82 | -1 << -82) & 0xFFFFFFFF;
        bk = Long.reverse(-6336063559446913429L);
        bl = (0x40000001 >>> 93 | 0x40000001 << -93) & 0xFFFFFFFF;
        bm = Integer.reverse(0x50000000);
        c = new String[bl];
        d = new String[bm];
        NLoginCore_447.b();
    }

    private static String a(int n, long l) {
        l ^= 0x18L;
        l ^= 0xFD59C3F94ADB673L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(18 + 50), (byte)(16 + 53), (byte)(42 + 41), (byte)(19 + 28), (byte)(43 + 24), (byte)(58 + 8), (byte)(49 + 18), 47, (byte)(10 + 70), (byte)(14 + 61), (byte)(58 + 9), (byte)(72 + 11), 53, (byte)(67 + 13), (byte)(70 + 27), (byte)(39 + 61), (byte)(45 + 55), (byte)(101 + 4), (byte)(87 + 23), (byte)(80 + 23)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(25 + 43), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.C("ӭӺӹҼӼӸӳӼԇӶӃԁԅӾԁԇӉࡖ࠯ࡘࡥࡈࡑࡠࡊ࡬࡜ࡩࡥࡩ࠻", (byte)71, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_447.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_447.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 65), NLoginCore_447.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߕޮߗߤ߇ߐߟ߉߫ߛߨߤߨ޺Ѣ", (byte)28, 67) + string + NLoginCore_004.C("у", (byte)28, 67) + methodType.toString(), exception);
        }
    }

    private static void b() {
        int n;
        e = -2992225113935214579L;
        long l = e ^ 0xFD59C3F94ADB673L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(2 + 66), (byte)(46 + 23), (byte)(53 + 30), (byte)(42 + 5), (byte)(5 + 62), (byte)(39 + 27), (byte)(47 + 20), 47, (byte)(58 + 22), (byte)(23 + 52), (byte)(50 + 17), (byte)(26 + 57), (byte)(10 + 43), (byte)(51 + 29), (byte)(50 + 47), (byte)(90 + 10), (byte)(50 + 50), (byte)(85 + 20), 110, (byte)(23 + 80)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_447.d[0] = NLoginCore_027.D("ֈ֍֎՘իջի֚֏֗կ֢ձ֦֠֟֙֡րօ֦պ֌֍֞ր֐֬լծտկֲִ֮ևօքֲ֑շռ֚֐׃֌֛ջְׅ֦֖֚֒׊֦׊ׇ֪փְ֝אׄ", (byte)120, 68);
                    NLoginCore_447.d[1] = NLoginCore_091.B("ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȵȟȧȍȴȖǽȕȯȞș", (byte)120, 66);
                    NLoginCore_447.d[2] = NLoginCore_223.E("֙թսր֐պ֥֞֬լ֖֖֩֔֗ֆ֔պֱֶ֝֔׀ւֻ֒׆ֺ֤׃ׇ֜׊ֿ֧֪֚֜֘׉ֲ֏֧֜", (byte)120, 69);
                    NLoginCore_447.d[3] = NLoginCore_201.D("Տգւ֋֗֔լշ֔ռպ։֚֙֏֤ֆփսոՠզ֚գ֪֊ժֱժ֞և֟", (byte)120, 68);
                    NLoginCore_447.d[4] = NLoginCore_004.A("ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȵȟȧȍȴȖǽȕȯȞș", (byte)120, 65);
                    NLoginCore_447.d[5] = NLoginCore_173.D("՞իզէ՗֗էմ֟ջ֏֖մ֞փ՝֖՝֕ձ֕՝փ֮փ֧ֆֲ֑֛֓֜֯֓ր֣֏խ֌ս֚֬տ։ְֵֺ֕֘տּ֥֘֊֬֋ֶ։א֪֭։֓֏ב׊׃֧֮ח׌׏־׏זּהֹֽ֤כ֧֝וְֱֳ֦", (byte)120, 68);
                    NLoginCore_447.d[6] = NLoginCore_427.A("ƞƹǂƷƪǈƪǠǎǦǂƷ", (byte)120, 65);
                    NLoginCore_447.d[7] = NLoginCore_384.B("ưƽƸƹƩǩƹǆǱǍǡǨǆǰǕƯǨƯǧǃǧƯǕȀǕǹǘǣǥǭǮȁȄǥǒǵǡƿǞǏǬǾǒȍȃǤǴǡȔǋȖșǩǽǕȖǫȟȣǼǲǰǷǝȣǶǦȞǞȂǤǹȣțȊȁȢȳȤȸȲȩȩȆȫȫȂȃ", (byte)120, 66);
                    NLoginCore_447.d[8] = NLoginCore_446.B("ƞƹǂƷƪǈƪǠǎǦǂƷ", (byte)120, 66);
                    NLoginCore_447.d[9] = NLoginCore_201.C("ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩֋֪֌ֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗׉׋׉ֺגז֖֭֚׏ך֤וֻ־ףה֥ף׍וֻעׄ֫׃ם׌ׇ", (byte)120, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_447.d[0] = NLoginCore_223.E("֤֥֟կւ֒ւֱ֦֮ֆֹֈְֵֶַָֽֽ֑֣֤֧֗֜֗׃փօ֖ֆ׋׉ׅ֛֞֜֨׉֎ֱ֧֓ךֲ֣֒֩לֱֶׇֽמפןקּ֢ךֵ׌ת", (byte)120, 69);
                    NLoginCore_447.d[1] = NLoginCore_138.C("ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩֋֪֌ֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗׉׋׉ֺגז֖֭֚׏ך֤וֻ־ףה֥ף׋׆׎טשֺ֯שִ׫װ׉׭װטׄקׇֽױ׶ׅ", (byte)120, 67);
                    NLoginCore_447.d[2] = NLoginCore_092.B("ǔƤƸƻǋƵǙǧǠƧǤǏǒǑǑǁǏƵǘǬǱǏǻƽǶǍȁǟǵǾȂǗǅǀȃǢǺǄǫǤǚȆǉǠǞǦȑǮȉǏǢǕǯǥǢǣ", (byte)120, 66);
                    NLoginCore_447.d[3] = NLoginCore_223.F("զպ֢֮֙֫փ֎ְֱֻ֑֦֚֫֓֠֝֔֏շւֵ־ַ֤֗ևַֹֻ׀", (byte)120, 70);
                    NLoginCore_447.d[4] = NLoginCore_173.D("ՖՑոպձզ֛֕֏Ֆ֜՝ա֘֗֏ց֢ֈ֗֒ա֡ւ֦֞֝լֳ֤֫֏ֳ֩֋֪֌ֈִָ֖֕֜ո֎֤֙րվֳպջ֚֓ևׇ֛֩֩֊ֳגֱִֵׇ֗׉׋׉ֺגז֖֭֚׏ך֤וֻ־ףה֥יזוַ׆׊֧מ׌ִ־גק׬׆׏ק״׺חֻאׅ", (byte)120, 68);
                    NLoginCore_447.d[5] = NLoginCore_223.A("ưƽƸƹƩǩƹǆǱǍǡǨǆǰǕƯǨƯǧǃǧƯǕȀǕǹǘǣǥǭǮȁȄǥǒǵǡƿǞǏǬǾǑǛȇȌȂǧǪǑȎǪǷǜǾǝȈǛȢǿǼǛǥǡȣȜȕȀǹȩȞȡȐȡȫȃȈǳǮȷȮȯȌǱǹȻȂȃ", (byte)120, 65);
                    NLoginCore_447.d[6] = NLoginCore_027.E("գեխէջ֒օց֪ցֵռ", (byte)120, 69);
                    NLoginCore_447.d[7] = NLoginCore_173.F("յւսվծ֮վ֋ֶ֦֭֒֋ֵ֚մ֭մ֬ֈ֬մׅ֚֚־ֲֳ֪֝֨׆׉ֺ֪֦֗քֱ֣֔׃֗ג׈ֹ֦֩י֐כמׂ֚֮כְפרֵַּׁ֢רֻ֫ףׇ֣֩־רנ׏׃ׯ׻ֵחָ׹׭ת׸ף׶؀זׯ׽ׇ׀לׅ׼", (byte)120, 70);
                    NLoginCore_447.d[8] = NLoginCore_138.B("ǤƽǪǜƫǈǇǧƮƻǎƷ", (byte)120, 66);
                    NLoginCore_447.d[9] = NLoginCore_091.B("ƨƣǊǌǃƸǧǭǡƨǮƯƳǪǩǡǓǴǚǩǤƳǳǔǸǰǯƾȅǶǽǡǻȅǝǼǞǚȆǨǧȊǮǊǠǶǫǒǐȅǌǍǥǬǙǻǭșǻǜȅȤȇșȃǩȆțȝțȌȤȨǿǨǬȡȬǶȧȍȐȵȦǷȷȗȍǺȝȎȽȲțȵȀɁȀȇȕȦȌȫɂȎȝȚȗ", (byte)120, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_447.d[0] = NLoginCore_138.F("֬լ֚ծռվֳֶ֥֤֮֯֗քևֈֈֽ֑ղַ֚ևֈ", (byte)120, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_447.d[0] = NLoginCore_451.B("ǩǀǀǞƴǁǤƼƽǎǦƱǣǱǗƶưǎǈƹƺǻǂǃ", (byte)120, 66);
                }
            }
        }
    }

    @Override
    public void a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_y);
        NLoginCore_510 NLoginCore_510 = (NLoginCore_510)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_g);
        if (NLoginCore_510 == null) {
            ((Player)NLoginCore_277.c()).updateInventory();
            return;
        }
        Server server = (Server)this.var_com_nickuc_login_bukkit_nLoginBukkit_a.java_lang_Object_b().c();
        if (server.isPrimaryThread() && !NLoginCore_012.V()) {
            this.var_com_nickuc_login_NLoginCore_456_a.void_a(NLoginCore_5092, NLoginCore_510, ar != 0);
        } else {
            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a(new PlayerLimboRestoreTask(() -> this.var_com_nickuc_login_NLoginCore_456_a.void_a(NLoginCore_5092, NLoginCore_510, as != 0)));
        }
    }

    @Override
    protected boolean a(NLoginCore_509 NLoginCore_5092, String string, boolean bl) {
        if (this.var_com_nickuc_login_bukkit_nLoginBukkit_a.org_bukkit_Server_a().isPrimaryThread()) {
            throw new IllegalStateException(string + (String)NLoginCore_447.c("㺀", (int)(l & m), (long)n));
        }
        return super.a(NLoginCore_5092, string, bl);
    }

    @Override
    public void b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, boolean bl) {
        NLoginCore_510 NLoginCore_510 = (NLoginCore_510)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_g);
        if (NLoginCore_510 == null) {
            NLoginCore_277.a((String)NLoginCore_447.c("㺀", (int)o, (long)(p ^ q)));
            NLoginCore_370.d((String)NLoginCore_447.c("㺃", (int)t, (long)(u ^ v)) + NLoginCore_277.getName() + (String)NLoginCore_447.c("㺆", (int)y, (long)z), new Object[aa]);
            return;
        }
        try {
            this.var_com_nickuc_login_NLoginCore_456_a.boolean_a(NLoginCore_5092, NLoginCore_510, bl);
        }
        catch (Exception exception) {
            NLoginCore_277.a((String)NLoginCore_447.c("㺉", (int)ab, (long)ac));
            NLoginCore_370.c((String)NLoginCore_447.c("㺌", (int)ad, (long)af) + NLoginCore_277.getName() + (String)NLoginCore_447.c("㺏", (int)ag, (long)(ah ^ ak)), exception, new Object[am]);
            return;
        }
        Runnable runnable = () -> {
            int n = av;
            try {
                n = this.var_com_nickuc_login_NLoginCore_456_a.a(NLoginCore_5092, NLoginCore_510) ? 1 : 0;
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_447.c("㺀", (int)ax, (long)ay) + NLoginCore_277.getName() + (String)NLoginCore_447.c("㺃", (int)ba, (long)bc), exception, new Object[bg]);
            }
            if (n == 0) {
                NLoginCore_277.a((String)NLoginCore_447.c("㺆", (int)(bh & bj), (long)bk));
            }
        };
        int n = NLoginCore_532.v.r() * ap;
        if (n <= 0) {
            new PlayerLimboClearTask(runnable).run();
        } else {
            NLoginCore_277.com_nickuc_login_NLoginInterface_022_a().a((Runnable)new DelayedPlayerLimboClearTask(runnable), (long)n, TimeUnit.MILLISECONDS);
        }
    }

    @Generated
    public NLoginCore_456 com_nickuc_login_NLoginCore_456_a() {
        return this.var_com_nickuc_login_NLoginCore_456_a;
    }
}

