/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.loader.LoaderBootstrap
 *  com.nickuc.login.loader.platform.BungeeLoader
 *  javax.annotation.Nullable
 *  net.md_5.bungee.api.ProxyServer
 *  net.md_5.bungee.api.config.ServerInfo
 *  net.md_5.bungee.api.plugin.Plugin
 */
package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.BungeeLoader;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_170;
import com.nickuc.login.NLoginCore_074;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_020;
import com.nickuc.login.NLoginCore_095;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_292;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_493;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_345;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_071;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_449;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_422;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_572;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_178;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;

public abstract class NLoginCore_383
implements LoaderBootstrap,
NLoginCore_292,
NLoginCore_116<BungeeLoader> {
    private static int bt;
    private static long br;
    private static int bd;
    private static String[] var_java_lang_String_arr_b;
    private static int u;
    private static int ap;
    private static int d;
    private static long j;
    private final NLoginInterface_020 var_com_nickuc_login_NLoginInterface_020_b;
    private static int v;
    private static int bu;
    private static int ba;
    private static long o;
    private static int e;
    private static long ax;
    private static long bv;
    private static int bs;
    private static long s;
    private static int var_int_b;
    private static int h;
    private static int var_int_l;
    private static long ao;
    private static int t;
    private static long m;
    private static int w;
    private static int aj;
    private static int var_int_c;
    private static long bq;
    private static int ae;
    private static long g;
    private static int aw;
    private static int var_int_a;
    private static long an;
    private static int as;
    private static int bf;
    private static long bb;
    private static long bn;
    private static long ah;
    private static int bo;
    private static int ag;
    private static long bc;
    private static int y;
    private static long ak;
    private static int bp;
    private static long au;
    private static int be;
    private static int af;
    private static int bj;
    private static long var_long_c;
    private final BungeeLoader var_com_nickuc_login_loader_platform_BungeeLoader_a;
    private static int bi;
    private static String[] var_java_lang_String_arr_a;
    private static int ad;
    private static long p;
    private static long aa;
    private static int bg;
    private static int ac;
    private static long ar;
    private boolean Q = var_int_a;
    final NLoginCore_572 var_com_nickuc_login_NLoginCore_572_b;
    private static int n;
    private static Method var_java_lang_reflect_Method_l;
    private final NLoginCore_178 var_com_nickuc_login_NLoginCore_178_a;
    private static int k;
    private static int az;
    private static long r;
    private static int x;
    private static long aq;
    private static long bm;
    private static int ab;
    private static int q;
    private static long ay;
    private static int av;
    private static int bl;
    private static int bk;
    private static int at;
    private static int am;
    private static long z;
    private static long al;
    private static long ai;
    private static int f;
    private static int bh;
    private static int i;

    protected void j() {
        if (this.var_com_nickuc_login_NLoginCore_572_b.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_b.a()).j();
        }
    }

    @Override
    public NLoginCore_493 com_nickuc_login_NLoginInterface_026_a() {
        return this.var_com_nickuc_login_NLoginCore_178_a;
    }

    private static String a(int n, long l) {
        l ^= 0x1DL;
        l ^= 0x12211A83FFBED6ACL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(20 + 49), (byte)(74 + 9), (byte)(8 + 39), (byte)(65 + 2), (byte)(10 + 56), (byte)(55 + 12), 47, (byte)(16 + 64), (byte)(51 + 24), (byte)(11 + 56), (byte)(57 + 26), (byte)(26 + 27), (byte)(64 + 16), (byte)(85 + 12), (byte)(90 + 10), (byte)(94 + 6), 105, (byte)(9 + 101), (byte)(70 + 33)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.C("ԂԏԎӑԑԍԈԑԜԋӘԖԚԓԖԜӞࡰࡲࡥࡪࡴࡲࡶࡻࡠ࡯ࡸࡾࡏࡐ", (byte)78, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_383.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void void_c() {
        this.Q = d;
        NLoginCore_074.a((Plugin)this.var_com_nickuc_login_loader_platform_BungeeLoader_a);
    }

    public NLoginCore_383(BungeeLoader bungeeLoader, String string, NLoginCore_422 NLoginCore_4222) {
        this.var_com_nickuc_login_loader_platform_BungeeLoader_a = bungeeLoader;
        this.var_com_nickuc_login_NLoginCore_178_a = new NLoginCore_178(this);
        this.var_com_nickuc_login_NLoginCore_572_b = new NLoginCore_572(string, bungeeLoader.getVersion(), NLoginCore_4222, this);
        this.var_com_nickuc_login_NLoginInterface_020_b = new NLoginCore_170(bungeeLoader.getLogger());
    }

    protected void O() {
        if (this.var_com_nickuc_login_NLoginCore_572_b.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_b.a()).O();
        }
    }

    @Override
    public NLoginCore_572 com_nickuc_login_NLoginCore_572_a() {
        return this.var_com_nickuc_login_NLoginCore_572_b;
    }

    @Override
    public /* synthetic */ NLoginCore_589 b(boolean bl) {
        return this.a(bl);
    }

    @Override
    public String q() {
        return this.var_com_nickuc_login_NLoginCore_572_b.var_java_lang_String_bn;
    }

    private static void void_b() {
        int n;
        var_long_c = -6027410822593995143L;
        long l = var_long_c ^ 0x12211A83FFBED6ACL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(56 + 12), (byte)(42 + 27), (byte)(14 + 69), (byte)(18 + 29), (byte)(56 + 11), (byte)(49 + 17), 67, (byte)(32 + 15), (byte)(18 + 62), (byte)(9 + 66), (byte)(54 + 13), (byte)(46 + 37), (byte)(12 + 41), (byte)(77 + 3), 97, (byte)(11 + 89), (byte)(11 + 89), (byte)(41 + 64), (byte)(70 + 40), (byte)(79 + 24)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_383.var_java_lang_String_arr_b[0] = NLoginCore_091.F("֏ր֑՞ֈ֗ձհհ֓ժոզ՗֍՜֛ժ֜դֆծիլ", (byte)92, 70);
                    NLoginCore_383.var_java_lang_String_arr_b[1] = NLoginCore_091.D("ԌԯԁՄԝӿՀՁԖԕԋԑ", (byte)92, 68);
                    NLoginCore_383.var_java_lang_String_arr_b[2] = NLoginCore_223.C("ԓԙԵԼԎԔԹԆԳԝԌԸԩԬՂԎԠՔԤՆԕԯԜԝ", (byte)92, 67);
                    NLoginCore_383.var_java_lang_String_arr_b[3] = NLoginCore_559.A("ƤƈƇƭƲƁŮƀŲƌƛƗƥźƾƨŸƽƠǂſƍƊƋ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[4] = NLoginCore_387.F("սՐր֑ՑդզՒեքէՠ", (byte)92, 70);
                    NLoginCore_383.var_java_lang_String_arr_b[5] = NLoginCore_076.A("ƀƙŭŽƃųƨƅƃƉƸſ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[6] = NLoginCore_223.A("ƛƈƅƱſſƉƖƕŹƸſ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ԶԸԾӾԿԤԽԙԦԬԾԑ", (byte)92, 67);
                    NLoginCore_383.var_java_lang_String_arr_b[8] = NLoginCore_559.F("ՃՎբթխհյֆՋՖ֑ՠ", (byte)92, 70);
                    NLoginCore_383.var_java_lang_String_arr_b[9] = NLoginCore_223.E("֏ր֑՞ֈ֗ձհհ֓ժոզ՗֍՜֛ժ֜դֆծիլ", (byte)92, 69);
                    NLoginCore_383.var_java_lang_String_arr_b[10] = NLoginCore_559.B("ƃƂƮƛŬůƫƘƧƥƧƬƊůƆƯŲƚƌưƽƳƊƋ", (byte)92, 66);
                    NLoginCore_383.var_java_lang_String_arr_b[11] = NLoginCore_324.D("ԿԮԎԓԡԦԣՆԶԺՊԑ", (byte)92, 68);
                    NLoginCore_383.var_java_lang_String_arr_b[12] = NLoginCore_453.B("ƜůƟưŰƃƅűƄƣƆſ", (byte)92, 66);
                    NLoginCore_383.var_java_lang_String_arr_b[13] = NLoginCore_223.E("ՍՋճ՝֏՟ՏիճՔլ֓պՕ֕֓֋բփ֓՞֔իլ", (byte)92, 69);
                    NLoginCore_383.var_java_lang_String_arr_b[14] = NLoginCore_201.A("ŬŪƒżƮžŮƊƒųƌŹƙƙƓƩƟƞƠưƤƝƊƋ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[15] = NLoginCore_138.E("չ՝֐ցմՈփՎձ֑֓յձՔյր֚հ֐՛֠ո֖֓տ֛։ո֠ռփժ֥֬֬փտֳֶյ֊֭ֈռֽ֛֋նּ֮պւֺֆַׂ֒ֆֺֹֽ֣֛ׄ֫׎֡֋֑֌ַׅ֚֔׌גׇ׋֬זׁףֲ֣֕ןֱכֶ֜׫׈ֵ֧װ׬", (byte)92, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_383.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƮƟưŽƧƶƐƏƏƲƆűƖƺƼƧƽƢſƜƘǃƊƋ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[1] = NLoginCore_138.F("՞օևՐ֑֒ՒծխղփզխՕ֏՛ի֡ի֖֞վիլ", (byte)92, 70);
                    NLoginCore_383.var_java_lang_String_arr_b[2] = NLoginCore_324.E("բըք֋՝գֈՕւլՍՕհ֓ՙֈւ՜ձա՞վիլ", (byte)92, 69);
                    NLoginCore_383.var_java_lang_String_arr_b[3] = NLoginCore_201.D("ԶԚԙԿՄԓԀԒԄԞԴԮԢԟԎՅԭԊՐԋԴԟԜԝ", (byte)92, 68);
                    NLoginCore_383.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ԠԺԄՁՁԢԤԝԁԘԠԑ", (byte)92, 67);
                    NLoginCore_383.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ԻԿԡԗԀӽՈԺԖԹԜԑ", (byte)92, 68);
                    NLoginCore_383.var_java_lang_String_arr_b[6] = NLoginCore_173.E("՞֌֏հվց֏ՐՐեշՠ", (byte)92, 69);
                    NLoginCore_383.var_java_lang_String_arr_b[7] = NLoginCore_138.A("ƥƩũƋƍƋƊƮƉƈƚƻƆưƟƪžźƼƱƟƍƊƋ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[8] = NLoginCore_453.D("ӸԾӼԐԹӾԹӻՈՈԾԑ", (byte)92, 68);
                    NLoginCore_383.var_java_lang_String_arr_b[9] = NLoginCore_223.A("ƮƟưŽƧƶƐƏƏƲƆƛƝƕƊƬƚźưƴƮƍƊƋ", (byte)92, 65);
                    NLoginCore_383.var_java_lang_String_arr_b[10] = NLoginCore_384.E("դգ֏ռՍՐ֌չֈֆօք֏Րֈ՛֗փ֤֑նվիլ", (byte)92, 69);
                    NLoginCore_383.var_java_lang_String_arr_b[11] = NLoginCore_027.C("ԘӼԬԂԜԽԝԻՈՋԠԑ", (byte)92, 67);
                    NLoginCore_383.var_java_lang_String_arr_b[12] = NLoginCore_091.B("ƤƊƜƝƞƠƭŷűŲƴſ", (byte)92, 66);
                    NLoginCore_383.var_java_lang_String_arr_b[13] = NLoginCore_446.B("ŬŪƒżƮžŮƊƒųƌƦƳƗƆƘǁŸƔƠƁƎƝƺƘƞǅǊƊƝǆƪ", (byte)92, 66);
                    NLoginCore_383.var_java_lang_String_arr_b[14] = NLoginCore_324.B("ŬŪƒżƮžŮƊƒųƊƏŶƊƾƑƎžƯƸƲƍƊƋ", (byte)92, 66);
                    NLoginCore_383.var_java_lang_String_arr_b[15] = NLoginCore_223.E("չ՝֐ցմՈփՎձ֑֓յձՔյր֚հ֐՛֠ո֖֓տ֛։ո֠ռփժ֥֬֬փտֳֶյ֊֭ֈռֽ֛֋նּ֮պւֺֆַׂ֒ֆֺֹֽ֣֛ׄ֫׎֡֋֑֌ַׅ֚֔׌גׇ׋֬זׁףֲ֣֕נזׂ֡׫ץמן׊֥־׀ֿ׀׋ױדשׇ׊ׯכ׀", (byte)92, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_383.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŦżƌƋŲƵƍƅơƸƍŵƶƇƼƵƙƻƷƕưƍƊƋ", (byte)92, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_383.var_java_lang_String_arr_b[0] = NLoginCore_324.F("՝՜՟էյ֖ծքՒ֑֛֔վջ՝֍՗֒՚֥սվիլ", (byte)92, 70);
                }
            }
        }
    }

    public BungeeLoader com_nickuc_login_loader_platform_BungeeLoader_a() {
        return this.var_com_nickuc_login_loader_platform_BungeeLoader_a;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_383.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_559.F("ԝԿՁԡՅդ՜ղ՞ԭիակթԲ՗չոհնհՅ", (byte)57, 70), NLoginCore_383.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӂӄҷҼӆӄӈӍҲӁӊӐҡҢŊ", (byte)57, 66) + string + NLoginCore_223.A("ī", (byte)57, 65) + methodType.toString(), exception);
        }
    }

    public void enable() {
        this.var_com_nickuc_login_NLoginCore_572_b.av();
    }

    @Override
    public /* synthetic */ Object java_lang_Object_b() {
        return this.com_nickuc_login_loader_platform_BungeeLoader_a();
    }

    public void disable() {
        this.var_com_nickuc_login_NLoginCore_572_b.aw();
        this.Q = var_int_c;
    }

    @Override
    public /* synthetic */ NLoginInterface_047 com_nickuc_login_NLoginInterface_047_b() {
        return this.com_nickuc_login_NLoginCore_345_a();
    }

    @Override
    public boolean N() {
        return this.Q;
    }

    public void load() {
        this.Q = var_int_b;
        this.var_com_nickuc_login_NLoginCore_572_b.au();
    }

    public NLoginCore_095 a(boolean bl) {
        return (NLoginCore_095)this.var_com_nickuc_login_NLoginCore_572_b.b(bl);
    }

    public NLoginCore_345 com_nickuc_login_NLoginCore_345_a() {
        return (NLoginCore_345)this.var_com_nickuc_login_NLoginCore_572_b.c();
    }

    protected abstract NLoginCore_363[] com_nickuc_login_NLoginInterface_034_arr_a();

    public ProxyServer net_md_5_bungee_api_ProxyServer_a() {
        return this.var_com_nickuc_login_loader_platform_BungeeLoader_a.getProxy();
    }

    @Nullable
    public Map<String, ServerInfo> a() {
        return (Map)NLoginCore_546.a(var_java_lang_reflect_Method_l, (Object)this.net_md_5_bungee_api_ProxyServer_a(), new Object[bi]);
    }

    @Override
    public File java_io_File_c() {
        return this.var_com_nickuc_login_loader_platform_BungeeLoader_a.getDataFolder();
    }

    public String toString() {
        return this.var_com_nickuc_login_NLoginCore_572_b.toString();
    }

    @Override
    public NLoginInterface_020 com_nickuc_login_NLoginInterface_020_a() {
        return this.var_com_nickuc_login_NLoginInterface_020_b;
    }

    static {
        var_int_a = 0x8000000 >>> 155 | 0x8000000 << ~155 + 1;
        var_int_b = (128 >>> 167 | 128 << ~167 + 1) & 0xFFFFFFFF;
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(0);
        e = Integer.reverse(0);
        f = (-1 >>> 28 | -1 << -28) & 0xFFFFFFFF;
        g = Long.reverse(2772264471709243957L);
        h = 0x1000000 >>> 152 | 0x1000000 << ~152 + 1;
        i = (-1 >>> 108 | -1 << ~108 + 1) & 0xFFFFFFFF;
        j = Long.reverse(2772264471709243957L);
        k = 1024 >>> 233 | 1024 << ~233 + 1;
        var_int_l = Integer.reverse(-1);
        m = Long.reverse(2772264471709243957L);
        n = 0x6000000 >>> 217 | 0x6000000 << ~217 + 1;
        o = Long.reverse(-7027568317448955339L);
        p = Long.reverse(-5188146770730811392L);
        q = (1 >>> 126 | 1 << ~126 + 1) & 0xFFFFFFFF;
        r = Long.reverse(-7027568317448955339L);
        s = Long.reverse(-5188146770730811392L);
        t = (0 >>> 82 | 0 << ~82 + 1) & 0xFFFFFFFF;
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = Integer.reverse(0);
        x = 0 >>> 96 | 0 << -96;
        y = Integer.reverse(-1610612736);
        z = Long.reverse(-7027568317448955339L);
        aa = Long.reverse(-5188146770730811392L);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = Integer.reverse(0);
        ad = (0 >>> 106 | 0 << ~106 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = (0x20000000 >>> 157 | 0x20000000 << ~157 + 1) & 0xFFFFFFFF;
        ag = (0xC00000 >>> 181 | 0xC00000 << ~181 + 1) & 0xFFFFFFFF;
        ah = Long.reverse(-7027568317448955339L);
        ai = Long.reverse(-5188146770730811392L);
        aj = Integer.reverse(-536870912);
        ak = Long.reverse(-7027568317448955339L);
        al = Long.reverse(-5188146770730811392L);
        am = Integer.reverse(0x10000000);
        an = Long.reverse(-7027568317448955339L);
        ao = Long.reverse(-5188146770730811392L);
        ap = Integer.reverse(-1879048192);
        aq = Long.reverse(-7027568317448955339L);
        ar = Long.reverse(-5188146770730811392L);
        as = Integer.reverse(0x50000000);
        at = (-1 >>> 157 | -1 << -157) & 0xFFFFFFFF;
        au = Long.reverse(2772264471709243957L);
        av = 0 >>> 239 | 0 << ~239 + 1;
        aw = Integer.reverse(-805306368);
        ax = Long.reverse(-7027568317448955339L);
        ay = Long.reverse(-5188146770730811392L);
        az = Integer.reverse(0);
        ba = Integer.reverse(0x30000000);
        bb = Long.reverse(-7027568317448955339L);
        bc = Long.reverse(-5188146770730811392L);
        bd = (16 >>> 4 | 16 << -4) & 0xFFFFFFFF;
        be = (0x8000000 >>> 91 | 0x8000000 << ~91 + 1) & 0xFFFFFFFF;
        bf = Integer.reverse(0);
        bg = 0 >>> 161 | 0 << -161;
        bh = 0 >>> 115 | 0 << -115;
        bi = (0 >>> 179 | 0 << -179) & 0xFFFFFFFF;
        bj = Integer.reverse(0x8000000);
        bk = Integer.reverse(0x8000000);
        bl = Integer.reverse(-1342177280);
        bm = Long.reverse(-7027568317448955339L);
        bn = Long.reverse(-5188146770730811392L);
        bo = (0 >>> 171 | 0 << -171) & 0xFFFFFFFF;
        bp = (0x70000000 >>> 187 | 0x70000000 << -187) & 0xFFFFFFFF;
        bq = Long.reverse(-7027568317448955339L);
        br = Long.reverse(-5188146770730811392L);
        bs = 0 >>> 70 | 0 << -70;
        bt = Integer.reverse(-268435456);
        bu = Integer.reverse(-1);
        bv = Long.reverse(2772264471709243957L);
        var_java_lang_String_arr_a = new String[bj];
        var_java_lang_String_arr_b = new String[bk];
        NLoginCore_383.void_b();
        var_java_lang_reflect_Method_l = NLoginCore_546.a(ProxyServer.class, (String)NLoginCore_383.c("㺀", (int)bl, (long)(bm ^ bn)), new Class[bo]);
        if (var_java_lang_reflect_Method_l == null) {
            var_java_lang_reflect_Method_l = NLoginCore_546.a(ProxyServer.class, (String)NLoginCore_383.c("㺃", (int)bp, (long)(bq ^ br)), new Class[bs]);
        }
        if (var_java_lang_reflect_Method_l == null) {
            throw new IllegalArgumentException((String)NLoginCore_383.c("㺆", (int)(bt & bu), (long)bv));
        }
    }

    @Override
    public String s() {
        return this.var_com_nickuc_login_NLoginCore_572_b.var_java_lang_String_bo;
    }

    @Override
    public Object a(int n) {
        switch (n) {
            case 0: {
                Object object;
                String string;
                Object object2;
                HashMap<String, InetSocketAddress> hashMap = new HashMap<String, InetSocketAddress>();
                try {
                    object2 = new NLoginCore_219(new File(this.java_io_File_c().getParentFile().getParentFile(), (String)NLoginCore_383.c("㺀", (int)(e & f), (long)g)));
                    for (String object3 : ((NLoginCore_219)object2).a((String)NLoginCore_383.c("㺃", (int)(h & i), (long)j))) {
                        string = object2.java_lang_String_b((String)NLoginCore_383.c("㺆", (int)(k & var_int_l), (long)m) + object3 + (String)NLoginCore_383.c("㺉", (int)NLoginCore_383.n, (long)(o ^ p)));
                        if (string == null || string.isEmpty()) continue;
                        String[] stringArray = string.split((String)NLoginCore_383.c("㺌", (int)q, (long)(r ^ s)));
                        object = stringArray[t];
                        int n2 = stringArray.length > u ? NLoginCore_449.a(stringArray[v], (Integer)w) : x;
                        hashMap.put(object3, new InetSocketAddress((String)object, n2));
                    }
                }
                catch (Throwable throwable) {
                    return NLoginCore_383.c("㺏", (int)y, (long)(z ^ aa));
                }
                object2 = new StringBuilder();
                for (InetSocketAddress inetSocketAddress : hashMap.values()) {
                    int n3;
                    if (!inetSocketAddress.isUnresolved()) {
                        object = inetSocketAddress.getAddress();
                        n3 = ((InetAddress)object).isLoopbackAddress() || ((InetAddress)object).isAnyLocalAddress() || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_a.b((InetAddress)object) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_b.b((InetAddress)object) || NLoginCore_071.var_com_nickuc_login_NLoginCore_071_c.b((InetAddress)object) ? ab : ac;
                        string = ((InetAddress)object).getHostAddress();
                    } else {
                        n3 = ad;
                        string = inetSocketAddress.getHostName();
                        if (string == null) {
                            n3 = ae;
                        } else {
                            try {
                                string = InetAddress.getByName(string).getHostAddress();
                            }
                            catch (UnknownHostException unknownHostException) {
                                n3 = af;
                            }
                        }
                    }
                    if (((StringBuilder)object2).length() > 0) {
                        ((StringBuilder)object2).append((String)NLoginCore_383.c("㺒", (int)ag, (long)(ah ^ ai)));
                    }
                    if (n3 != 0) {
                        ((StringBuilder)object2).append((String)NLoginCore_383.c("㺕", (int)aj, (long)(ak ^ al)));
                    } else {
                        ((StringBuilder)object2).append(string);
                    }
                    ((StringBuilder)object2).append((String)NLoginCore_383.c("㺘", (int)am, (long)(an ^ ao)));
                    ((StringBuilder)object2).append(inetSocketAddress.getPort());
                }
                return ((StringBuilder)object2).toString();
            }
            case 1: {
                try {
                    NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(new File(this.java_io_File_c().getParentFile().getParentFile(), (String)NLoginCore_383.c("㺛", (int)ap, (long)(aq ^ ar))));
                    Collection collection = (Collection)NLoginCore_2192.d(NLoginCore_383.c("㺞", (int)(as & at), (long)au));
                    if (collection == null || collection.isEmpty()) {
                        return av;
                    }
                    String string = (String)((Map)collection.iterator().next()).get(NLoginCore_383.c("㺡", (int)aw, (long)(ax ^ ay)));
                    if (string == null || string.isEmpty()) {
                        return az;
                    }
                    String[] stringArray = string.split((String)NLoginCore_383.c("㺤", (int)ba, (long)(bb ^ bc)));
                    return stringArray.length > bd ? NLoginCore_449.a(stringArray[be], (Integer)bf) : bg;
                }
                catch (Throwable throwable) {
                    return bh;
                }
            }
        }
        return null;
    }

    protected void i() {
        if (this.var_com_nickuc_login_NLoginCore_572_b.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_b.a()).void_i();
        }
    }

    protected void T() {
        if (this.var_com_nickuc_login_NLoginCore_572_b.am()) {
            ((NLoginCore_100)this.var_com_nickuc_login_NLoginCore_572_b.a()).T();
        }
    }
}

