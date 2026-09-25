/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.plugin.PluginDescriptionFile
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_409;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_358;
import com.nickuc.login.NLoginCore_120;
import com.nickuc.login.NLoginCore_574;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_507;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_049;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_364;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_530;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_013;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_440;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_165;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_385;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginInterface_001;
import com.nickuc.login.NLoginCore_239;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import com.nickuc.login.NLoginInterface_040;
import com.nickuc.login.NLoginInterface_033;
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
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;

final class NLoginCore_281
implements NLoginCore_493 {
    private static int f;
    private static int j;
    private static int w;
    private static long aa;
    private final NLoginCore_089 var_com_nickuc_login_NLoginCore_089_a;
    private static int ah;
    private static int am;
    private static int i;
    private static int ap;
    private static long o;
    private static int z;
    private static int ae;
    private static long aq;
    private static int e;
    private static int g;
    private static long af;
    private static int ax;
    private static int as;
    private static long p;
    private static long d;
    private static long var_long_b;
    private static long y;
    private static long u;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_b;
    private static int h;
    private static int al;
    private static long ar;
    private static int aw;
    private static String[] var_java_lang_String_arr_a;
    private static int v;
    private static int m;
    private static int t;
    private static long r;
    private static long an;
    private static long at;
    private static int av;
    private static long c;
    private static long ai;
    private static int ad;
    private static int n;
    private static long ag;
    private static int ak;
    private static long s;
    private static int k;
    private static int ac;
    private static long aj;
    private static int q;
    private static long au;
    private static int l;
    private static long ao;
    private static int ay;
    private static long ab;
    private static int x;

    @Override
    public void T() {
        this.var_com_nickuc_login_NLoginCore_089_a.T();
    }

    @Override
    public NLoginCore_364 com_nickuc_login_NLoginCore_364_a() {
        Server server = this.var_com_nickuc_login_NLoginCore_089_a.org_bukkit_Server_a();
        return new NLoginCore_364(server.getName(), server.getVersion(), (String)NLoginCore_281.c("㺀", (int)n, (long)(o ^ p)) + server.getBukkitVersion() + (String)NLoginCore_281.c("㺃", (int)q, (long)(r ^ s)) + server.getVersion(), NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b, NLoginCore_165.com_nickuc_login_NLoginCore_165_a().O());
    }

    @Override
    public void j() {
        this.var_com_nickuc_login_NLoginCore_089_a.j();
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_b() {
        return NLoginCore_409.a().a(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_b) && NLoginCore_298.a((String)NLoginCore_281.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)), new String[e]) ? new NLoginCore_385(this.var_com_nickuc_login_NLoginCore_089_a, this.var_com_nickuc_login_NLoginCore_089_a.org_bukkit_Server_a()) : new NLoginCore_507(this.var_com_nickuc_login_NLoginCore_089_a, this.var_com_nickuc_login_NLoginCore_089_a.org_bukkit_Server_a());
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_281.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_427.D("ӊӬӮӎӲԑԉԟԋӚԘԎԜԖӟԄԦԥԝԣԝӲ", (byte)79, 68), NLoginCore_281.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.C("ԅԒԑӔԔԐԋԔԟԎӛԙԝԖԙԟӡࡳࡈ࡯ࡳࡗ࡭ࡌࡾࢃࡷࡷࡱࡧӺ", (byte)79, 67) + string + NLoginCore_004.D("Ӝ", (byte)79, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public NLoginInterface_013 com_nickuc_login_NLoginInterface_013_a() {
        return new NLoginCore_239(this.var_com_nickuc_login_NLoginCore_089_a);
    }

    @Override
    public void V() {
        try {
            if (NLoginCore_409.a().a(NLoginCore_409.var_com_nickuc_login_NLoginCore_409_s)) {
                NLoginCore_409.a();
                NLoginInterface_033.a();
                NLoginInterface_001.a();
                NLoginCore_165.com_nickuc_login_NLoginCore_165_a();
                NLoginCore_119.values();
                NLoginCore_049.ae();
            }
            NLoginCore_012.a(this.var_com_nickuc_login_NLoginCore_089_a);
        }
        catch (Throwable throwable) {
            throw new RuntimeException((String)NLoginCore_281.c("㺀", (int)t, (long)u), throwable);
        }
    }

    private static void void_b() {
        int n;
        c = -1865740973721843252L;
        long l = c ^ 0x777314B6AB16E914L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(22 + 46), (byte)(59 + 10), (byte)(47 + 36), (byte)(12 + 35), (byte)(32 + 35), (byte)(59 + 7), (byte)(9 + 58), (byte)(18 + 29), (byte)(11 + 69), (byte)(10 + 65), (byte)(4 + 63), (byte)(6 + 77), (byte)(12 + 41), (byte)(25 + 55), (byte)(61 + 36), (byte)(47 + 53), (byte)(16 + 84), 105, 110, (byte)(14 + 89)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
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
                    NLoginCore_281.var_java_lang_String_arr_b[0] = NLoginCore_446.D("ԐԐԯԴԒՂՄԁԣӿԓԦԋԽԞԼԈԚՌ԰ԌԆԱԟԫ՘ՖԨԒՎԪԴ՗ԫ՜ԜաԖԺԶԦԞգԦԪՊԺծգԯծՋՀՋԫյԯՅՙՏՏԸվ՟ԾԺԺՍիվտԸւ՞ժՉ։՜ֈւվ՝՞Տվլՙ՚", (byte)91, 68);
                    NLoginCore_281.var_java_lang_String_arr_b[1] = NLoginCore_384.D("ԲԴӳԣԴԝԂԐՂԀԳԣԼԟԥՇՆՈԭՒՉՂԙԚ", (byte)91, 68);
                    NLoginCore_281.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƟŧƟƭžƉŦŭƢƩŶƕƥƱƽƷƎƴƬƋƏƱƈƉ", (byte)91, 66);
                    NLoginCore_281.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ƦūƃţƌƇƵſƐŶƍƄŰƨƱŵƒƇƺƻƒŹſǃǆƾǁǁǈƦƉƉǍƉǊƍƼƟƳƔǇǖǙǃƪǓǌƏǌƷǉǑƷƫƨƩ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[4] = NLoginCore_223.A("ƦūƃţƌƇƵſƐŶƍơųƋƧŽżƔǀƑƓƶƄơƳƨƖƸƆƴƈƵƾƺƨƉƍǏǒƋǒƳǀǐǆǜǝǑƼƹƱơƛǢƶǓƳƦƢƺǗǣǔƽǎƭƩƩǝǬǧǵǟǑǁǋǵǥǚǧǪǚǿƼǹǱǈǉ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[5] = NLoginCore_324.D("ԹԲԘӽԲԸԅԚԀԈԿԎ", (byte)91, 68);
                    NLoginCore_281.var_java_lang_String_arr_b[6] = NLoginCore_092.A("ƆƜƜžŤƢƁƊƧŰƘŽ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[7] = NLoginCore_138.C("ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՒՅէՂէՃԧՎՙՈՋեէՆԮՖՊծզ՘Ռտճ՗ՏՕւԺՐՂշՂՁՄ֊չծւպոէՏ՞ցդՏհ֑գի֑ժ՘֜", (byte)91, 67);
                    NLoginCore_281.var_java_lang_String_arr_b[8] = NLoginCore_076.E("րքփբՔփժեծՔժչ՛֛Ք֛ը֢֣֝֜՛֣յր֧֓֡վժփք", (byte)91, 69);
                    NLoginCore_281.var_java_lang_String_arr_b[9] = NLoginCore_223.A("ƦūƃţƌƇƵſƐŶƍơųƋƧŽżƔǀƑƓƶƄơƳƨƖƸƆƴƈƵƾƺƨƉƍǏǒƋǒƳǀǆǂǄƶƴǜƛƗƴƯǤǒǑƣǣƼƻƻǥǦǥǀǙǑǑǂǈƮǠưǊưǳǪǇǲǧǬǐǊǐƾǑƼǾǦǕǛǪǽǚǤȎǫǞǙǚǍǌǧǬȅǏǬȘǫǬǸȋǻǻǞǯȘȑǨǩ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[10] = NLoginCore_223.D("ԹԲԘӽԲԸԅԚԀԈԿԎ", (byte)91, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_281.var_java_lang_String_arr_b[0] = NLoginCore_384.F("աարօգ֓֕ՒմՐդշ՜֎կ֍ՙի֝ց՝՗ւհռ֧֩չգ֟ջօ֨ռ֭խֲէ֋ևշկִշջ֛֋ִֿրֿ֑֜֜ռ׆ր֖֪֠֠։׏ְ֏֋֋ּ֞׏א։דֻׅ֦֖֯֔֫׉֮׀ובד֪֫", (byte)91, 70);
                    NLoginCore_281.var_java_lang_String_arr_b[1] = NLoginCore_027.E("փօՄմօծՓա֓Ցֆյ։֗ծ֗֡֠մ՛խխժի", (byte)91, 69);
                    NLoginCore_281.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ƟŧƟƭžƉŦŭƢƩŶŲƇƸƝƉƳƭƯƍƺƋƈƉ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[3] = NLoginCore_384.C("ԷӼԔӴԝԘՆԐԡԇԞԕԁԹՂԆԣԘՋՌԣԊԐՔ՗ՏՒՒՙԷԚԚ՞Ԛ՛ԞՍ԰Մԥ՘էըԳՀ՞ԶԧՆՑբԾժղԹԺ", (byte)91, 67);
                    NLoginCore_281.var_java_lang_String_arr_b[4] = NLoginCore_138.E("ֈՍեՅծթ֗աղ՘կփՕխ։՟՞ն֢ճյ֘զփ֕֊ո֚ը֖ժ֗֠֜֊իկֱִխֲִ֢֕֨־ֳֿ֛֞֓փսֵׄ֘֕ֈքְֶֹׅ֜֟֏֋֋ֿ׎׉חֳׁ֥זל֮֙מ֯׊ן֯׍֪֭֫", (byte)91, 69);
                    NLoginCore_281.var_java_lang_String_arr_b[5] = NLoginCore_004.A("ŧƝƥƆŰƏűƒƱũƀŽ", (byte)91, 65);
                    NLoginCore_281.var_java_lang_String_arr_b[6] = NLoginCore_092.C("ԙԺԡՁԝԱԺԦԦՄԷԘԉՌՉԠԛՑԇԚԪՂԙԚ", (byte)91, 67);
                    NLoginCore_281.var_java_lang_String_arr_b[7] = NLoginCore_027.C("ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՒՅէՂէՃԧՎՙՈՋեէՆԮՖՊծզ՘Ռտճ՗ՏՕւԺՐՂշՂՁՄ֊չծւպոէՏ՞րօ֍տ֑էմկ֛֚֍թ֠՛Քշ֓՟ք֣֔֜ծ", (byte)91, 67);
                    NLoginCore_281.var_java_lang_String_arr_b[8] = NLoginCore_173.F("րքփբՔփժեծՔժչ՛֛Ք֛ը֢֣֦֝֜֠ց֒յ֧֒֬լջքլ֤ըջռ֎֐ն֭ձָտ", (byte)91, 70);
                    NLoginCore_281.var_java_lang_String_arr_b[9] = NLoginCore_559.C("ԷӼԔӴԝԘՆԐԡԇԞԲԄԜԸԎԍԥՑԢԤՇԕԲՄԹԧՉԗՅԙՆՏՋԹԚԞՠգԜգՄՑ՗ՓՕՇՅխԬԨՅՀյգբԴմՍՌՌնշնՑժբբՓՙԿձՁ՛Ձքջ՘փոսա՛աՏբՍ֏շզլջ֎իյ֟ռկժի՞՝ոս֖ՠտջժ֭ռֆր֐ւ֓֩֌չպ", (byte)91, 67);
                    NLoginCore_281.var_java_lang_String_arr_b[10] = NLoginCore_092.F("՘ձՒ֎տ֒ճՕկ֚֘՟", (byte)91, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_281.var_java_lang_String_arr_b[0] = NLoginCore_446.F("Ս֎Չձցրկտշեթպպժէռ֞֝չՕռ֣֥֙եթֆ֌֧ռ֧֗", (byte)91, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_281.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ӷԙԼӼӺԴӾԟӿԣՅԶԣԤԼԷ԰ՇՆԠԎՂԙԚ", (byte)91, 68);
                }
            }
        }
    }

    @Override
    public NLoginInterface_047 com_nickuc_login_NLoginInterface_047_a() {
        return new NLoginCore_120(this.var_com_nickuc_login_NLoginCore_089_a);
    }

    @Override
    public NLoginInterface_040 com_nickuc_login_NLoginInterface_040_a() {
        Server server = this.var_com_nickuc_login_NLoginCore_089_a.org_bukkit_Server_a();
        return new NLoginCore_574(this.var_com_nickuc_login_NLoginCore_089_a, server, NLoginCore_358.a(server, server.getConsoleSender()));
    }

    private static String a(int n, long l) {
        l ^= 0x2CL;
        l ^= 0x777314B6AB16E914L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), 69, (byte)(17 + 66), (byte)(14 + 33), (byte)(53 + 14), (byte)(52 + 14), (byte)(21 + 46), (byte)(12 + 35), (byte)(40 + 40), (byte)(39 + 36), (byte)(47 + 20), (byte)(39 + 44), (byte)(41 + 12), (byte)(77 + 3), (byte)(19 + 78), 100, (byte)(36 + 64), (byte)(23 + 82), (byte)(59 + 51), (byte)(5 + 98)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.C("юћњНѝљєѝѨїФѢѦџѢѨЪ޼ޑ޸޼ޠ޶ޕ߇ߌ߀߀޺ް", (byte)18, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_281.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public NLoginCore_589 a(boolean bl) {
        return NLoginCore_012.V() ? new NLoginCore_530(this.var_com_nickuc_login_NLoginCore_089_a.com_nickuc_login_loader_platform_BukkitLoader_a(), bl) : new NLoginCore_440(this.var_com_nickuc_login_NLoginCore_089_a.com_nickuc_login_loader_platform_BukkitLoader_a(), bl);
    }

    @Generated
    public NLoginCore_281(NLoginCore_089 NLoginCore_0892) {
        this.var_com_nickuc_login_NLoginCore_089_a = NLoginCore_0892;
    }

    @Override
    public NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a() {
        return this.var_com_nickuc_login_NLoginCore_089_a.com_nickuc_login_NLoginInterface_034_arr_a();
    }

    static {
        var_int_a = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        var_long_b = Long.reverse(3715705314997295207L);
        d = Long.reverse(0x3400000000000000L);
        e = Integer.reverse(0);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = Integer.reverse(-1342177280);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = 0 >>> 116 | 0 << ~116 + 1;
        j = (16384 >>> 238 | 16384 << -238) & 0xFFFFFFFF;
        k = (0x880000 >>> 147 | 0x880000 << -147) & 0xFFFFFFFF;
        l = 128 >>> 231 | 128 << ~231 + 1;
        m = Integer.reverse(0);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Long.reverse(3715705314997295207L);
        p = Long.reverse(0x3400000000000000L);
        q = 512 >>> 72 | 512 << ~72 + 1;
        r = Long.reverse(3715705314997295207L);
        s = Long.reverse(0x3400000000000000L);
        t = Integer.reverse(-1073741824);
        u = Long.reverse(545171177328466023L);
        v = Integer.reverse(0);
        w = Integer.reverse(0x20000000);
        x = Integer.reverse(-1);
        y = Long.reverse(545171177328466023L);
        z = Integer.reverse(-1610612736);
        aa = Long.reverse(3715705314997295207L);
        ab = Long.reverse(0x3400000000000000L);
        ac = 0 >>> 223 | 0 << ~223 + 1;
        ad = Integer.reverse(Integer.MIN_VALUE);
        ae = 786432 >>> 81 | 786432 << -81;
        af = Long.reverse(3715705314997295207L);
        ag = Long.reverse(0x3400000000000000L);
        ah = 0x70000000 >>> 220 | 0x70000000 << ~220 + 1;
        ai = Long.reverse(3715705314997295207L);
        aj = Long.reverse(0x3400000000000000L);
        ak = 0 >>> 117 | 0 << ~117 + 1;
        al = 2048 >>> 11 | 2048 << -11;
        am = Integer.reverse(0x10000000);
        an = Long.reverse(3715705314997295207L);
        ao = Long.reverse(0x3400000000000000L);
        ap = Integer.reverse(-1879048192);
        aq = Long.reverse(3715705314997295207L);
        ar = Long.reverse(0x3400000000000000L);
        as = Integer.reverse(0x50000000);
        at = Long.reverse(3715705314997295207L);
        au = Long.reverse(0x3400000000000000L);
        av = Integer.reverse(0);
        aw = 256 >>> 136 | 256 << ~136 + 1;
        ax = (22528 >>> 235 | 22528 << ~235 + 1) & 0xFFFFFFFF;
        ay = (0x580000 >>> 211 | 0x580000 << -211) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[ax];
        var_java_lang_String_arr_b = new String[ay];
        NLoginCore_281.void_b();
    }

    @Override
    public void i() {
        this.var_com_nickuc_login_NLoginCore_089_a.void_i();
    }

    @Override
    public boolean e(String string) {
        int n = v;
        PluginDescriptionFile pluginDescriptionFile = this.var_com_nickuc_login_NLoginCore_089_a.com_nickuc_login_loader_platform_BukkitLoader_a().getDescription();
        if (!pluginDescriptionFile.getName().equals(string)) {
            NLoginCore_370.d((String)NLoginCore_281.c("㺀", (int)(w & x), (long)y) + this.var_com_nickuc_login_NLoginCore_089_a.com_nickuc_login_loader_platform_BukkitLoader_a().getName() + (String)NLoginCore_281.c("㺃", (int)z, (long)(aa ^ ab)), new Object[ac]);
            n = ad;
        }
        if (!pluginDescriptionFile.getAuthors().contains(NLoginCore_281.c("㺆", (int)ae, (long)(af ^ ag)))) {
            NLoginCore_370.d((String)NLoginCore_281.c("㺉", (int)ah, (long)(ai ^ aj)), new Object[ak]);
            n = al;
        }
        if (pluginDescriptionFile.getWebsite() != null && !pluginDescriptionFile.getWebsite().equals(NLoginCore_281.c("㺌", (int)am, (long)(an ^ ao)))) {
            NLoginCore_370.d((String)NLoginCore_281.c("㺏", (int)ap, (long)(aq ^ ar)) + pluginDescriptionFile.getWebsite() + (String)NLoginCore_281.c("㺒", (int)as, (long)(at ^ au)), new Object[av]);
            n = aw;
        }
        return n != 0;
    }

    @Override
    public void U() {
        NLoginCore_409 NLoginCore_409 = NLoginCore_409.a();
        int n = NLoginCore_409.e() == f && NLoginCore_409.f() <= g ? h : i;
        int n2 = NLoginCore_409.e() == j && NLoginCore_409.f() <= k ? l : m;
        NLoginCore_370.a(this.var_com_nickuc_login_NLoginCore_089_a, n != 0, n2 != 0);
    }

    @Override
    public void O() {
        this.var_com_nickuc_login_NLoginCore_089_a.O();
    }
}

