/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_447;
import com.nickuc.login.NLoginCore_432;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_017;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_187 {
    private static int ad;
    private final Map<Integer, NLoginCore_509> cfr_renamed_13;
    private static int e;
    private static int k;
    private static long i;
    private static long f;
    private final Map<NLoginCore_277, NLoginCore_509> cfr_renamed_14 = new ConcurrentHashMap<NLoginCore_277, NLoginCore_509>();
    private static int w;
    private static int aw;
    private static int var_int_o;
    private static int ap;
    private static int m;
    private static int at;
    private static int y;
    private static long ab;
    private static int am;
    private static int aa;
    private static long var_long_b;
    private static int ar;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_n;
    private static int u;
    private static long h;
    private static int an;
    private static String[] var_java_lang_String_arr_b;
    private static int be;
    private static int var_int_c;
    private static int az;
    private static int r;
    private static int t;
    private static int var_int_d;
    private static int bc;
    private static long z;
    private static int bb;
    private static long l;
    private final NLoginCore_598 var_com_nickuc_login_NLoginInterface_048_d;
    private static int al;
    private static int au;
    private static int ai;
    private static int v;
    private static int x;
    private static int ao;
    private static long ae;
    private static int var_int_a;
    private static int av;
    private static long s;
    private static long ac;
    private static int ah;
    private final NLoginType_008 K;
    private static int ba;
    private static int ay;
    private static int ak;
    private static int j;
    private static int as;
    private static long var_long_c;
    private static int ag;
    private static int aq;
    private static int aj;
    private static int bd;
    private static int p;
    private static int ax;
    private static int g;
    private static int q;
    private static long af;

    @Generated
    public NLoginCore_187(NLoginType_008 NLoginType_008, NLoginCore_598 NLoginInterface_0482) {
        this.cfr_renamed_13 = new ConcurrentHashMap<Integer, NLoginCore_509>();
        this.K = NLoginType_008;
        this.var_com_nickuc_login_NLoginInterface_048_d = NLoginInterface_0482;
    }

    @Nullable
    public NLoginCore_509 a(String string, UUID uUID, InetAddress inetAddress) {
        Object[] objectArray = new Object[u];
        objectArray[NLoginCore_187.v] = string;
        objectArray[NLoginCore_187.w] = uUID;
        objectArray[NLoginCore_187.x] = inetAddress.getHostAddress();
        return this.cfr_renamed_13.get(Objects.hash(objectArray));
    }

    private static String a(int n, long l) {
        l ^= 0x3EL;
        l ^= 0xABC9EA71A09D789EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(9 + 60), (byte)(51 + 32), (byte)(24 + 23), (byte)(59 + 8), 66, (byte)(39 + 28), (byte)(43 + 4), (byte)(36 + 44), 75, (byte)(43 + 24), (byte)(62 + 21), (byte)(6 + 47), (byte)(8 + 72), (byte)(29 + 68), (byte)(16 + 84), (byte)(43 + 57), (byte)(24 + 81), (byte)(99 + 11), (byte)(62 + 41)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.A("ĠĭĬïįīĦįĺĩöĴĸıĴĺü҃ҒҋҒѦҏѨҝҝҌҐҞҗѯ", (byte)31, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_187.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public boolean b(String string, @Nullable UUID uUID) {
        int n = string.length();
        return (n > ai && string.charAt(aj) == ak && string.charAt(n - al) == am || NLoginCore_532.C.a(new Object[an]).stream().anyMatch(string2 -> (string2.equalsIgnoreCase(string) || uUID != null && string2.equalsIgnoreCase(uUID.toString()) ? aq : ar) != 0) ? ao : ap) != 0;
    }

    private static void b() {
        int n;
        var_long_c = 3570939392181643265L;
        long l = var_long_c ^ 0xABC9EA71A09D789EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), (byte)(28 + 41), (byte)(59 + 24), (byte)(5 + 42), (byte)(57 + 10), (byte)(32 + 34), (byte)(61 + 6), (byte)(34 + 13), (byte)(5 + 75), (byte)(11 + 64), (byte)(20 + 47), (byte)(29 + 54), (byte)(9 + 44), (byte)(78 + 2), (byte)(58 + 39), (byte)(70 + 30), 100, 105, (byte)(30 + 80), (byte)(12 + 91)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_187.var_java_lang_String_arr_b[0] = NLoginCore_559.F("՟շտազռա։ժ֘ոտ֤֜ֆձֈև։ճֈո֢֘֙ջշյշ֩ցֶ֛օ֝֝׉ֈ׆֖־ֵּ֓", (byte)111, 70);
                    NLoginCore_187.var_java_lang_String_arr_b[1] = NLoginCore_446.E("՟շտազռա։ժ֘չզְֱ֛֑ծֶձր֣֍ֹ֧֊֑֧նֶ֑֐ր֏׀֯֡փׁׅ֕֊֥֮֓", (byte)111, 69);
                    NLoginCore_187.var_java_lang_String_arr_b[2] = NLoginCore_559.D("ԶՎՖԸԽՓԸՠՁկՐԽղևըֈՅ֍Ո՗պ՘՝ՈքճղքՐՑ֎ՔծմՓլպըչ֓յ֒խժ", (byte)111, 68);
                    NLoginCore_187.var_java_lang_String_arr_b[3] = NLoginCore_559.F("մհկս֣֚֟է֝շ֜ճ", (byte)111, 70);
                    NLoginCore_187.var_java_lang_String_arr_b[4] = NLoginCore_027.E("կ՜֑բե՛ֆվ֤խվְզ֧֭ժք։ֲ֮֮֊֦֍֔ս֌֍շո֑֘֬׆ֶ֚ցֺ֛֔׍ׄ֌֤׀ׄ׎׆֔׍ִֵֶַַֻ֩֔כׇחֶ׊כג֡ךֿוץׅחן׈֥ףפש׭ײ׀׍נ׬״ׁ־ֿ", (byte)111, 69);
                    NLoginCore_187.var_java_lang_String_arr_b[5] = NLoginCore_223.F("՟շտազռա։ժ֘չ։֑ր֩֐ք֋ճֺ֪֥֭֜֌ջ֌֮֓֔֎ցָ֘׀ֺքֆ׈֖֓֫֫֓", (byte)111, 70);
                    NLoginCore_187.var_java_lang_String_arr_b[6] = NLoginCore_387.E("֑֕ՠֈ՞֙֘սվը֤ճ", (byte)111, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_187.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ԶՎՖԸԽՓԸՠՁկՏՖջճ՝Ո՟՞ՠՊ՟ՏչկհՒՎՌՎր՘֍ռս֋հի֊իկպ՞կե֖տ՛֖֔֬ֆֆկֈյն", (byte)111, 67);
                    NLoginCore_187.var_java_lang_String_arr_b[1] = NLoginCore_223.F("՟շտազռա։ժ֘չզְֱ֛֑ծֶձր֣֍ֹ֧֊֑֧նֶ֑֐ր֏ֹ֠ցֲ֙׀ׇׁ֕։֓", (byte)111, 70);
                    NLoginCore_187.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ԶՎՖԸԽՓԸՠՁկՐԽղևըֈՅ֍Ո՗պ՘՝ՈքճղքՐՑ֎Քշձհճ՟ֈՙփ֕խյժ", (byte)111, 68);
                    NLoginCore_187.var_java_lang_String_arr_b[3] = NLoginCore_092.D("խյթկՇռճԸՔց՛զՒզնօպՊդՆխըՕՖ", (byte)111, 68);
                    NLoginCore_187.var_java_lang_String_arr_b[4] = NLoginCore_575.D("ՆԳըԹԼԲ՝ՕջՄՕևԽքվՁ՛ՠօ։օասդիՔգդՎՏըկփ֝֍ձ՘֑ղի֤֛գջ֛֥֗֝ի֤րի֎֍֎֋֌ֲ֮֒֞֍ֲ֡֩ոֱֶּ֖֮֬֜֟ս֢֞ׄ׈֖׋֣֘׈֊־֖֕", (byte)111, 68);
                    NLoginCore_187.var_java_lang_String_arr_b[5] = NLoginCore_384.A("ƑƩƱƓƘƮƓƻƜǊƫƻǃƲǛǂƶƽƥǜǗǟǬǎƾƭƾǅǆǠǀƳǗǸǣƶƶǖƮǻǱǶƻǅ", (byte)111, 65);
                    NLoginCore_187.var_java_lang_String_arr_b[6] = NLoginCore_387.C("ՙէՋ՘՘ծՏՓՋՃՍՊ", (byte)111, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_187.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ǇǖƔƬƬƦƭǝǇƖǌơƛƴƬƤǙƼƽƸǩƿƩƨǘƹǙǜǨǍƦǆ", (byte)111, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_187.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ոՖռոսՐ՟ՊտԺփոհԺմռչ֋չ՞֏՘ՕՖ", (byte)111, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_187.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 70), NLoginCore_187.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.A("ĚħĦéĩĥĠĩĴģðĮĲīĮĴöѽҌ҅ҌѠ҉Ѣҗҗ҆ҊҘґѩĐ", (byte)28, 65) + string + NLoginCore_004.B("ñ", (byte)28, 66) + methodType.toString(), exception);
        }
    }

    public void l(NLoginCore_277 NLoginCore_277) {
        NLoginCore_509 NLoginCore_5092 = this.a(NLoginCore_277);
        if (NLoginCore_5092 != null) {
            NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.set(var_int_c);
        }
    }

    public void c() {
        this.var_com_nickuc_login_NLoginInterface_048_d.Z();
    }

    public NLoginCore_509 a(NLoginCore_277 NLoginCore_2772, @Nullable ForceRegisterConfig ForceRegisterConfig2, String string, InetSocketAddress inetSocketAddress, boolean bl, boolean bl2, NLoginInterface_017 NLoginInterface_0172) {
        NLoginCore_509 NLoginCore_5092 = this.cfr_renamed_14.computeIfAbsent(NLoginCore_2772, NLoginCore_277 -> new NLoginCore_509((NLoginCore_277)NLoginCore_277, inetSocketAddress));
        int n = NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.getAndSet(var_int_d);
        switch (n) {
            case 1: {
                throw new IllegalStateException((String)NLoginCore_187.c("㺀", (int)e, (long)f));
            }
            case -1: {
                NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.set(n);
                throw new IllegalStateException((String)NLoginCore_187.c("㺃", (int)g, (long)(h ^ i)));
            }
            case -2: {
                NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.set(n);
                throw new IllegalStateException((String)NLoginCore_187.c("㺆", (int)(j & k), (long)l));
            }
        }
        Object[] objectArray = new Object[m];
        objectArray[NLoginCore_187.var_int_n] = NLoginCore_2772.getName();
        objectArray[NLoginCore_187.var_int_o] = NLoginCore_2772.java_util_UUID_a();
        objectArray[NLoginCore_187.p] = NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_d);
        this.cfr_renamed_13.put(Objects.hash(objectArray), NLoginCore_5092);
        if (ForceRegisterConfig2 != null) {
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_a, ForceRegisterConfig2);
        }
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_b, (Object)string);
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_c, (Object)bl);
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_e, (Object)bl2);
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_f, NLoginInterface_0172);
        NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_p, (Object)NLoginCore_077.var_com_nickuc_login_NLoginCore_077_a);
        if (this.K.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
            NLoginCore_447 NLoginCore_4472 = (NLoginCore_447)this.K.com_nickuc_login_NLoginType_005_b();
            String string2 = NLoginCore_432.b(NLoginCore_2772.java_util_UUID_a()) + (String)NLoginCore_187.c("㺉", (int)(q & r), (long)s);
            File file = new File(NLoginCore_4472.com_nickuc_login_NLoginCore_456_a().java_io_File_a(), string2);
            NLoginCore_510 NLoginCore_510 = new NLoginCore_510((Player)NLoginCore_2772.c(), file);
            NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_g, NLoginCore_510);
        }
        return NLoginCore_5092;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_long_b = Long.reverse(-1152921504606846976L);
        var_int_c = (-1 >>> 104 | -1 << ~104 + 1) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(Integer.MIN_VALUE);
        e = 0 >>> 166 | 0 << ~166 + 1;
        f = Long.reverse(-282048351919050356L);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = Long.reverse(-9217190012622114420L);
        i = Long.reverse(0x7C00000000000000L);
        j = Integer.reverse(0x40000000);
        k = Integer.reverse(-1);
        l = Long.reverse(-282048351919050356L);
        m = (0x3000000 >>> 248 | 0x3000000 << ~248 + 1) & 0xFFFFFFFF;
        var_int_n = (0 >>> 66 | 0 << ~66 + 1) & 0xFFFFFFFF;
        var_int_o = Integer.reverse(Integer.MIN_VALUE);
        p = 1024 >>> 169 | 1024 << ~169 + 1;
        q = Integer.reverse(-1073741824);
        r = -1 >>> 123 | -1 << ~123 + 1;
        s = Long.reverse(-282048351919050356L);
        t = (2 >>> 225 | 2 << -225) & 0xFFFFFFFF;
        u = 6144 >>> 139 | 6144 << ~139 + 1;
        v = Integer.reverse(0);
        w = Integer.reverse(Integer.MIN_VALUE);
        x = Integer.reverse(0x40000000);
        y = 2 >>> 191 | 2 << ~191 + 1;
        z = Long.reverse(-282048351919050356L);
        aa = (0x28000000 >>> 91 | 0x28000000 << -91) & 0xFFFFFFFF;
        ab = Long.reverse(-9217190012622114420L);
        ac = Long.reverse(0x7C00000000000000L);
        ad = (3 >>> 127 | 3 << -127) & 0xFFFFFFFF;
        ae = Long.reverse(-9217190012622114420L);
        af = Long.reverse(0x7C00000000000000L);
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = Integer.reverse(0);
        ai = Integer.reverse(Integer.MIN_VALUE);
        aj = (0 >>> 235 | 0 << -235) & 0xFFFFFFFF;
        ak = Integer.reverse(-637534208);
        al = 0x10000000 >>> 124 | 0x10000000 << ~124 + 1;
        am = Integer.reverse(-1174405120);
        an = (0 >>> 242 | 0 << ~242 + 1) & 0xFFFFFFFF;
        ao = Integer.reverse(Integer.MIN_VALUE);
        ap = (0 >>> 209 | 0 << ~209 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(Integer.MIN_VALUE);
        ar = 0 >>> 116 | 0 << -116;
        as = Integer.reverse(Integer.MIN_VALUE);
        at = Integer.reverse(0);
        au = Integer.reverse(Integer.MAX_VALUE);
        av = 0x8000000 >>> 91 | 0x8000000 << -91;
        aw = Integer.reverse(0);
        ax = Integer.reverse(-1073741824);
        ay = Integer.reverse(0);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = 2048 >>> 170 | 2048 << ~170 + 1;
        bb = (32 >>> 229 | 32 << ~229 + 1) & 0xFFFFFFFF;
        bc = Integer.reverse(0);
        bd = 0x38000000 >>> 27 | 0x38000000 << ~27 + 1;
        be = 114688 >>> 14 | 114688 << -14;
        var_java_lang_String_arr_a = new String[bd];
        var_java_lang_String_arr_b = new String[be];
        NLoginCore_187.b();
    }

    public NLoginCore_509 com_nickuc_login_NLoginCore_509_b(NLoginCore_277 NLoginCore_277) {
        String string = NLoginCore_277.getName();
        if (this.b(string, NLoginCore_277.java_util_UUID_a())) {
            throw new IllegalStateException((String)NLoginCore_187.c("㺀", (int)y, (long)z) + string);
        }
        NLoginCore_509 NLoginCore_5092 = this.a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            throw new IllegalStateException((String)NLoginCore_187.c("㺃", (int)aa, (long)(ab ^ ac)) + string + (String)NLoginCore_187.c("㺆", (int)ad, (long)(ae ^ af)));
        }
        return NLoginCore_5092;
    }

    @Nullable
    public NLoginCore_509 a(NLoginCore_277 NLoginCore_277) {
        InetSocketAddress inetSocketAddress;
        NLoginCore_509 NLoginCore_5092 = this.cfr_renamed_14.get(NLoginCore_277);
        if (NLoginCore_5092 == null && (inetSocketAddress = NLoginCore_277.java_net_InetSocketAddress_a()) != null && (NLoginCore_5092 = this.a(NLoginCore_277.getName(), NLoginCore_277.java_util_UUID_a(), inetSocketAddress.getAddress())) != null && NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.get() == t) {
            this.cfr_renamed_14.put(NLoginCore_277, NLoginCore_5092);
        }
        return NLoginCore_5092;
    }

    public boolean boolean_b(NLoginCore_277 NLoginCore_277) {
        if (this.b(NLoginCore_277.getName(), NLoginCore_277.java_util_UUID_a())) {
            return ag != 0;
        }
        NLoginCore_509 NLoginCore_5092 = this.a(NLoginCore_277);
        if (NLoginCore_5092 == null) {
            return ah != 0;
        }
        return NLoginCore_5092.com_nickuc_login_NLoginCore_077_a().b(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_g);
    }

    public NLoginCore_187(NLoginType_008 NLoginType_008) {
        this.cfr_renamed_13 = new ConcurrentHashMap<Integer, NLoginCore_509>();
        this.K = NLoginType_008;
        this.var_com_nickuc_login_NLoginInterface_048_d = NLoginType_008.b(var_int_a != 0).a(() -> {
            if (this.cfr_renamed_14.isEmpty()) {
                return;
            }
            this.cfr_renamed_14.values().removeIf(NLoginCore_5092 -> {
                if (NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.get() == as) {
                    return at != 0;
                }
                int n = NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.getAndSet(au);
                switch (n) {
                    case 1: {
                        NLoginCore_5092.var_java_util_concurrent_atomic_AtomicInteger_c.set(av);
                        return aw != 0;
                    }
                    case -2: {
                        NLoginCore_277 NLoginCore_277 = NLoginCore_5092.com_nickuc_login_NLoginCore_277_b();
                        Object[] objectArray = new Object[ax];
                        objectArray[NLoginCore_187.ay] = NLoginCore_277.getName();
                        objectArray[NLoginCore_187.az] = NLoginCore_277.java_util_UUID_a();
                        objectArray[NLoginCore_187.ba] = NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_d);
                        this.cfr_renamed_13.remove(Objects.hash(objectArray));
                        return bb != 0;
                    }
                }
                return bc != 0;
            });
        }, 0L, var_long_b, TimeUnit.SECONDS);
    }
}

