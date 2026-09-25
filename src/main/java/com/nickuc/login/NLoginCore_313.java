/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart
 *  com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.util.crypto.SignatureData;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_049;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_010;
import com.nickuc.login.NLoginCore_496;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_172;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyPair;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NLoginCore_313 {
    private static long au;
    private static long d;
    private static int var_int_y;
    private final KeyPair var_java_security_KeyPair_b;
    private static long ah;
    private static int ap;
    private static final Method var_java_lang_reflect_Method_n;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_y;
    private static int ai;
    private static long e;
    private static int ak;
    private static int f;
    private static String[] var_java_lang_String_arr_b;
    private static long at;
    private static int m;
    private static int as;
    private static int ad;
    private static String[] var_java_lang_String_arr_a;
    private static final Method var_java_lang_reflect_Method_o;
    public final NLoginCore_010 var_com_nickuc_login_NLoginCore_010_a = new NLoginCore_010(this, null);
    private static int u;
    private static int aj;
    private static int k;
    private static int h;
    private static int var_int_b;
    private static long j;
    private static int l;
    private static int r;
    private static int g;
    private static int ab;
    private static int an;
    private static int q;
    private static long var_long_n;
    private static long var_long_c;
    private static int w;
    private static int ac;
    private static int i;
    private static int var_int_a;
    private static int var_int_t;
    private static long al;
    private static long aa;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_t;
    private static long v;
    private static int s;
    private static int ar;
    private static int ag;
    @Generated
    private static final Logger var_org_slf4j_Logger_c;
    private static int aq;
    private static int var_int_o;
    private static int p;
    private static int af;
    private static long ae;
    private static int am;
    private static long z;
    private static final String bX;
    public final NLoginCore_172 var_com_nickuc_login_NLoginCore_172_a = new NLoginCore_172(this, null);
    private static long ao;
    private static int x;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_313.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_451.A("»Ýß¿ãĂúĐüËĉÿčćÐõėĖĎĔĎã", (byte)10, 65), NLoginCore_313.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.D("жутЅхсмхѐпЌъючъѐВޕޙޥޙެތޭދިީ޵ޮޘЫ", (byte)10, 68) + string + NLoginCore_092.A("Í", (byte)10, 65) + methodType.toString(), exception);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = 0 >>> 245 | 0 << -245;
        d = Long.reverse(-9093312923355274133L);
        e = Long.reverse(-2594073385365405696L);
        f = Integer.reverse(0x200000);
        g = (64 >>> 130 | 64 << -130) & 0xFFFFFFFF;
        h = (524288 >>> 51 | 524288 << -51) & 0xFFFFFFFF;
        i = (-1 >>> 232 | -1 << -232) & 0xFFFFFFFF;
        j = Long.reverse(6759357764988871787L);
        k = 0x1400000 >>> 53 | 0x1400000 << ~53 + 1;
        l = 5120 >>> 169 | 5120 << ~169 + 1;
        m = Integer.reverse(0x40000000);
        var_long_n = Long.reverse(6759357764988871787L);
        var_int_o = (0x40000000 >>> 94 | 0x40000000 << -94) & 0xFFFFFFFF;
        p = (0 >>> 227 | 0 << ~227 + 1) & 0xFFFFFFFF;
        q = Integer.reverse(0x40000000);
        r = Integer.reverse(0);
        s = Integer.reverse(Integer.MIN_VALUE);
        var_int_t = (6144 >>> 11 | 6144 << -11) & 0xFFFFFFFF;
        u = (-1 >>> 198 | -1 << ~198 + 1) & 0xFFFFFFFF;
        v = Long.reverse(6759357764988871787L);
        w = Integer.reverse(0x20000000);
        x = Integer.reverse(0);
        var_int_y = Integer.reverse(0x20000000);
        z = Long.reverse(-9093312923355274133L);
        aa = Long.reverse(-2594073385365405696L);
        ab = (0x2000000 >>> 153 | 0x2000000 << ~153 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(-1610612736);
        ad = Integer.reverse(-1);
        ae = Long.reverse(6759357764988871787L);
        af = Integer.reverse(0x40000000);
        ag = Integer.reverse(0x60000000);
        ah = Long.reverse(6759357764988871787L);
        ai = (0xC00000 >>> 118 | 0xC00000 << -118) & 0xFFFFFFFF;
        aj = Integer.reverse(-536870912);
        ak = -1 >>> 235 | -1 << ~235 + 1;
        al = Long.reverse(6759357764988871787L);
        am = Integer.reverse(0x10000000);
        an = Integer.reverse(-1);
        ao = Long.reverse(6759357764988871787L);
        ap = (2048 >>> 106 | 2048 << ~106 + 1) & 0xFFFFFFFF;
        aq = (0 >>> 166 | 0 << -166) & 0xFFFFFFFF;
        ar = (65536 >>> 240 | 65536 << ~240 + 1) & 0xFFFFFFFF;
        as = Integer.reverse(-1879048192);
        at = Long.reverse(-9093312923355274133L);
        au = Long.reverse(-2594073385365405696L);
        var_java_lang_String_arr_a = new String[k];
        var_java_lang_String_arr_b = new String[l];
        NLoginCore_313.void_b();
        bX = NLoginCore_313.c("㺀", (int)m, (long)var_long_n);
        var_org_slf4j_Logger_c = LoggerFactory.getLogger(NLoginCore_313.class);
        Method method = null;
        Class[] classArray = new Class[var_int_o];
        classArray[NLoginCore_313.p] = SecretKey.class;
        Method method2 = NLoginCore_546.a(SpigotReflectionUtil.NETWORK_MANAGER_CLASS, null, null, classArray);
        if (method2 == null) {
            Class[] classArray2 = new Class[q];
            classArray2[NLoginCore_313.r] = Cipher.class;
            classArray2[NLoginCore_313.s] = Cipher.class;
            method2 = NLoginCore_546.a(SpigotReflectionUtil.NETWORK_MANAGER_CLASS, null, null, classArray2);
            if (method2 == null) {
                throw new IllegalArgumentException((String)NLoginCore_313.c("㺃", (int)(var_int_t & u), (long)v));
            }
            String[] stringArray = new String[w];
            stringArray[NLoginCore_313.x] = NLoginCore_313.c("㺆", (int)var_int_y, (long)(z ^ aa));
            stringArray[NLoginCore_313.ab] = NLoginCore_313.c("㺉", (int)(ac & ad), (long)ae);
            stringArray[NLoginCore_313.af] = NLoginCore_313.c("㺌", (int)ag, (long)ah);
            stringArray[NLoginCore_313.ai] = NLoginCore_313.c("㺏", (int)(aj & ak), (long)al);
            Class<?> clazz = NLoginCore_049.a(stringArray);
            if (clazz == null) {
                throw new IllegalArgumentException((String)NLoginCore_313.c("㺒", (int)(am & an), (long)ao));
            }
            Class[] classArray3 = new Class[ap];
            classArray3[NLoginCore_313.aq] = Integer.TYPE;
            classArray3[NLoginCore_313.ar] = Key.class;
            method = NLoginCore_546.a(clazz, null, null, classArray3);
            if (method == null) {
                throw new IllegalArgumentException((String)NLoginCore_313.c("㺕", (int)as, (long)(at ^ au)));
            }
        }
        var_java_lang_reflect_Method_n = method2;
        var_java_lang_reflect_Method_o = method;
    }

    static /* synthetic */ KeyPair java_security_KeyPair_a(NLoginCore_313 NLoginCore_3132) {
        return NLoginCore_3132.var_java_security_KeyPair_b;
    }

    static /* synthetic */ nLoginBukkit com_nickuc_login_bukkit_nLoginBukkit_a(NLoginCore_313 NLoginCore_3132) {
        return NLoginCore_3132.var_com_nickuc_login_bukkit_nLoginBukkit_t;
    }

    static /* synthetic */ Method java_lang_reflect_Method_b() {
        return var_java_lang_reflect_Method_n;
    }

    public NLoginCore_313(nLoginBukkit nLoginBukkit2) {
        this(nLoginBukkit2, nLoginBukkit2.com_nickuc_login_NLoginType_008_a(), NLoginCore_313.a(nLoginBukkit2.org_bukkit_Server_a()));
    }

    private static void a(User user, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, String string) {
        if (string.length() > g) {
            throw new IllegalArgumentException((String)NLoginCore_313.c("㺀", (int)(h & i), (long)j) + string);
        }
        user.receivePacketSilently((PacketWrapper)new WrapperLoginClientLoginStart(wrapperLoginClientLoginStart.getClientVersion(), wrapperLoginClientLoginStart.getUsername(), (SignatureData)wrapperLoginClientLoginStart.getSignatureData().orElse(null), (UUID)wrapperLoginClientLoginStart.getPlayerUUID().orElse(null)));
    }

    @Generated
    private NLoginCore_313(nLoginBukkit nLoginBukkit2, NLoginType_008 NLoginType_008, KeyPair keyPair) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_t = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginType_008_y = NLoginType_008;
        this.var_java_security_KeyPair_b = keyPair;
    }

    static /* synthetic */ void b(User user, WrapperLoginClientLoginStart wrapperLoginClientLoginStart, String string) {
        NLoginCore_313.a(user, wrapperLoginClientLoginStart, string);
    }

    private static void void_b() {
        int n;
        var_long_c = -3015986951711329407L;
        long l = var_long_c ^ 0x5654C13D3907EDCDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(31 + 38), (byte)(11 + 72), (byte)(6 + 41), (byte)(2 + 65), (byte)(45 + 21), (byte)(48 + 19), (byte)(32 + 15), 80, (byte)(10 + 65), (byte)(8 + 59), 83, (byte)(19 + 34), (byte)(65 + 15), (byte)(43 + 54), (byte)(68 + 32), (byte)(19 + 81), (byte)(21 + 84), (byte)(101 + 9), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(43 + 25), (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_313.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ԺԀԦԳԕԡԣՈԭԤԤԑՅԋՀԦՖԳՄՑԜՑԨՏԠԺԘԣԾՖԵՑՖԡԿԵԷ՜ՌԦՊՂլԷ", (byte)94, 68);
                    NLoginCore_313.var_java_lang_String_arr_b[1] = NLoginCore_324.C("ԟԗԥԫԋԵՄԽՄԱԻԫԑՊՖԭՈԺԒԣՉԔԝԱԜԽՔԣդԡԸԟԱԥԼԿՠԫԤՙԯԹԪզ՞ՁԾԴԴդճՎԴիՂՃ", (byte)94, 67);
                    NLoginCore_313.var_java_lang_String_arr_b[2] = NLoginCore_559.A("ƥƓƦũƍŴƭƄƓƏƖƃ", (byte)94, 65);
                    NLoginCore_313.var_java_lang_String_arr_b[3] = NLoginCore_201.E("֓Ջժի֏֚֘իէխՏլև։֙փիռ֓կ֧էէշատ֘֞ջևւ֭ճֲ֣֬֟ճֵ֦յֳ֛֦֒֘֌֚֚ջ֡վֺּֿ֦֧֛֝֝֫֙֊ֽ", (byte)94, 69);
                    NLoginCore_313.var_java_lang_String_arr_b[4] = NLoginCore_575.B("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽƾƂƈƶƊƼƠưǁǆǄƌƽǕƩǃƬǆǉƜǐǇƯƝƹƘǐǅƹƷƠƾǗƮƯ", (byte)94, 66);
                    NLoginCore_313.var_java_lang_String_arr_b[5] = NLoginCore_427.C("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ՗ԔԝԾՊԞաՀԲՕեթԣէբՁԧ՗ԼԼ՟հԷ", (byte)94, 67);
                    NLoginCore_313.var_java_lang_String_arr_b[6] = NLoginCore_201.A("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽǃƀƉƪƶƊǍƬƞǁǑǏƫƍƳƐƫƭƍƬƯǐƣ", (byte)94, 65);
                    NLoginCore_313.var_java_lang_String_arr_b[7] = NLoginCore_223.D("ԞԑԧԁԟԿԌԌԚԮՒԣՑՇՈԩԔԕԬԚ՜ԜՖ՝ՐՕ՘բԞՅՑԣզՅԺ՟ՊժՋԽՍղՂԷ", (byte)94, 68);
                    NLoginCore_313.var_java_lang_String_arr_b[8] = NLoginCore_559.E("֓Ջժի֏֚֘իէխ՜։ո՛֕ջհ֢֞֒֞ջ֘ղթֈ֭շ֧֑֠֨֡֋֏կ֖ց֔քַ֧մָ֕֏ֱׅ֯֔֙֡֯֠֍֎", (byte)94, 69);
                    NLoginCore_313.var_java_lang_String_arr_b[9] = NLoginCore_076.C("ՈԀԟԠՄՍՏԠԜԢԒՂԥԲԑԷ԰ԶՂՍԙՕՉԟՕՀԟդՄԯԻԡՇԱՄզԧեաԺ՟԰՚՝Գ՞՟ՖՊՎԬՑչիժԾԾ՛՗Ք՝ՖաեմևՕ՚եՉժ֐ժջ։ւըըվիշ֕եՙ֛֝բգ", (byte)94, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_313.var_java_lang_String_arr_b[0] = NLoginCore_223.E("օՋձվՠլծ֓ոկկ՜֐Ֆ֋ձ֡վ֏֜է֜ճ֚իօգծ։֡ր֜րֵ֤֕֋֙֍ոպ֐֏֯֋ֱֵ֖֚֜րֺ֥֐֍֎", (byte)94, 69);
                    NLoginCore_313.var_java_lang_String_arr_b[1] = NLoginCore_427.C("ԟԗԥԫԋԵՄԽՄԱԻԫԑՊՖԭՈԺԒԣՉԔԝԱԜԽՔԣդԡԸԟԱԥԼԿՠԫԤՙԯԹԩՌղթՍհլպ՚ՙ՗ջՂՃ", (byte)94, 67);
                    NLoginCore_313.var_java_lang_String_arr_b[2] = NLoginCore_091.F("վՓվմնթշքռի՘բ", (byte)94, 70);
                    NLoginCore_313.var_java_lang_String_arr_b[3] = NLoginCore_559.B("ƴŬƋƌưƹƻƌƈƎŰƍƨƪƺƤƌƝƴƐǈƈƈƘƂƠƹƿƜƨƣǎƔǓǍǀǄƔǖǇƖƳƼǇǔƹƭƻƻƜǂƟǇǆǉǘǊǊƶƪǨǰƱǱ", (byte)94, 66);
                    NLoginCore_313.var_java_lang_String_arr_b[4] = NLoginCore_387.B("ƝƀơƪųūƱƃƬƕżƙžƁŸƁƷƮƟƶƽƾƂƈƶƊƼƠưǁǆǄƌƽǕƩǃƬǆǉƜǐǆƳǠƭƝǝƺǞǎǥǦƻǉǨǂƽǆǦƻƨǯƱ", (byte)94, 66);
                    NLoginCore_313.var_java_lang_String_arr_b[5] = NLoginCore_004.C("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ՗ԔԝԾՊԞաՀԲՕե԰ԾՠՠԩԬԪԾկԫլԷ", (byte)94, 67);
                    NLoginCore_313.var_java_lang_String_arr_b[6] = NLoginCore_387.D("ԱԔԵԾԇӿՅԗՀԩԐԭԒԕԌԕՋՂԳՊՑ՗ԔԝԾՊԞաՀԲՕե՟ՒեԹՍ՜ՅհԮկթծճՔԮԴՆՖԬԻՆՅՂՃ", (byte)94, 68);
                    NLoginCore_313.var_java_lang_String_arr_b[7] = NLoginCore_201.A("ƊŽƓŭƋƫŸŸƆƚƾƏƽƳƴƕƀƁƘƆǈƈǂǉƼǁǄǎƊƱƽƏƎƨǂǔƕƙǄƶƼƮǐƣ", (byte)94, 65);
                    NLoginCore_313.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ՈԀԟԠՄՍՏԠԜԢԑԾԭԐՊ԰ԥՓ՗ՇՓ԰ՍԧԞԽբԬ՜ՆՕ՝ՖՀՄԤՋԶՉԹլ՜ԩՅՅՂժՑՑԲ԰ՈՔժթՐՐսգՂՐխՙՑ", (byte)94, 68);
                    NLoginCore_313.var_java_lang_String_arr_b[9] = NLoginCore_092.F("֓Ջժի֏֚֘իէխ՝֍հս՜ւջց֍֘դ֠֔ժ֠֋ժ֯֏պֆլ֒ռ֏ֱղְ֬օ֪ջ֥֨վ֪֩֡֕֙շֵֶ֜ׄ։։ְֿ֦֢֟֨֡֬גְֵ֥֠֔כֵ׆ד֪֕לֽןםֶׇ֭֮׀֭֮", (byte)94, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_313.var_java_lang_String_arr_b[0] = NLoginCore_138.E("ՓՏՒՈՖշօ֘փ՘֝հլ֕֟փ֌դ֢՜֖֑֠֝֟֜խ֢֚֡֠դ", (byte)94, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_313.var_java_lang_String_arr_b[0] = NLoginCore_004.B("ŲƮƊƑƂŵƤŴƑưƬŵźƟƣƽƣƳƕƞƕƑƎƏ", (byte)94, 66);
                }
            }
        }
    }

    static /* synthetic */ NLoginType_008 com_nickuc_login_NLoginType_008_a(NLoginCore_313 NLoginCore_3132) {
        return NLoginCore_3132.var_com_nickuc_login_NLoginType_008_y;
    }

    private static KeyPair a(Server server) {
        Field field;
        KeyPair keyPair = null;
        Object object = SpigotReflectionUtil.getMinecraftServerInstance((Server)server);
        if (object != null && (field = NLoginCore_546.a(SpigotReflectionUtil.MINECRAFT_SERVER_CLASS, KeyPair.class, var_int_a)) != null) {
            try {
                keyPair = (KeyPair)field.get(object);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw new RuntimeException((String)NLoginCore_313.c("㺀", (int)var_int_b, (long)(d ^ e)), reflectiveOperationException);
            }
        }
        if (keyPair == null) {
            keyPair = NLoginCore_496.a(f);
        }
        return keyPair;
    }

    private static String a(int n, long l) {
        l ^= 0x3BL;
        l ^= 0x5654C13D3907EDCDL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(44 + 25), (byte)(58 + 25), 47, (byte)(19 + 48), (byte)(26 + 40), (byte)(56 + 11), (byte)(29 + 18), (byte)(45 + 35), (byte)(24 + 51), (byte)(24 + 43), (byte)(56 + 27), (byte)(52 + 1), (byte)(29 + 51), (byte)(28 + 69), (byte)(23 + 77), (byte)(30 + 70), (byte)(70 + 35), 110, (byte)(47 + 56)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.E("Ւ՟՞ԡա՝՘ալ՛ԨզժգզլԮࢱࢵࣁࢵࣈࢨࣉࢧࣄࣅ࣑࣊ࢴ", (byte)51, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_313.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static /* synthetic */ Method a() {
        return var_java_lang_reflect_Method_o;
    }
}

