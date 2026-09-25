/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.snakeyaml.DumperOptions
 *  com.nickuc.login.lib.snakeyaml.DumperOptions$FlowStyle
 *  com.nickuc.login.lib.snakeyaml.LoaderOptions
 *  com.nickuc.login.lib.snakeyaml.Yaml
 *  com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor
 *  com.nickuc.login.lib.snakeyaml.constructor.Constructor
 *  com.nickuc.login.lib.snakeyaml.representer.Representer
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import com.nickuc.login.lib.snakeyaml.representer.Representer;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_070;
import com.nickuc.login.NLoginInterface_002;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_103;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_114;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_051;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_219
implements NLoginInterface_002<String>,
NLoginCore_051 {
    private static File var_java_io_File_d;
    private static int az;
    private static int bg;
    private static long g;
    private static int w;
    private static int an;
    private static long h;
    private static int k;
    private static int ae;
    private static int bn;
    private static int var_int_d;
    private static int ao;
    private static long ad;
    private static int l;
    private static long be;
    private static int r;
    private static int o;
    private static int f;
    private static long z;
    private static long bi;
    private static String[] var_java_lang_String_arr_b;
    private static int i;
    private static int ah;
    private static int aq;
    private static long ac;
    private static int ba;
    private static int bk;
    private static int ap;
    private static int var_int_b;
    private static int bj;
    private static int v;
    private static long m;
    private static int j;
    private static int bd;
    private static String[] var_java_lang_String_arr_a;
    private static int y;
    private static long as;
    private static long av;
    private static int u;
    private static long ar;
    private static long aa;
    private final ThreadLocal<Yaml> var_java_lang_ThreadLocal_com_nickuc_login_lib_snakeyaml_Yaml__a;
    private static long n;
    private static long p;
    private static int ak;
    private static long bl;
    private static int t;
    private static long ai;
    private NLoginCore_103 var_com_nickuc_login_NLoginCore_103_b;
    private static int ax;
    private static int bc;
    private static int au;
    private static long bh;
    private static long var_long_e;
    private static int q;
    private static int var_int_c;
    private static long al;
    private static long aj;
    private final File var_java_io_File_e;
    private static long af;
    private static long bf;
    private static int ay;
    private static int var_int_a;
    private static int aw;
    private static int at;
    private static int s;
    private static long bm;
    private static int ag;
    private static long var_long_c;
    private static int ab;
    private static int bb;
    private static int x;
    private static long am;
    private static int bo;

    private static void b() {
        int n;
        var_long_c = -67436933593732873L;
        long l = var_long_c ^ 0x6B99C0E63C384EB3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(42 + 27), (byte)(79 + 4), (byte)(32 + 15), (byte)(51 + 16), (byte)(58 + 8), (byte)(21 + 46), (byte)(10 + 37), (byte)(56 + 24), (byte)(45 + 30), 67, (byte)(58 + 25), (byte)(38 + 15), (byte)(56 + 24), (byte)(34 + 63), (byte)(4 + 96), (byte)(8 + 92), (byte)(74 + 31), (byte)(85 + 25), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_219.var_java_lang_String_arr_b[0] = NLoginCore_138.E("խՒո֑ձծհչէ֎֙֝ջ֚֐բդքդռ֤֪ջ֩՟չպզ֢֋օֵָ֦֢֓֟֒֐չֳֻշ׀֛տտִֵ֗֗׃ָ֥֏֐", (byte)96, 69);
                    NLoginCore_219.var_java_lang_String_arr_b[1] = NLoginCore_559.A("ƹŷŹƐŻƖŻƴơƊưƇ", (byte)96, 65);
                    NLoginCore_219.var_java_lang_String_arr_b[2] = NLoginCore_027.E("Ջեժ֖֙ըհ֌՚֌Օ՘Փ֕ց՚֍֤ՠւըգ֪֧֚ր֌ժգր֑ր֋֕֕շ֧քֈ֥։ֹ֛ք", (byte)96, 69);
                    NLoginCore_219.var_java_lang_String_arr_b[3] = NLoginCore_091.F("֖ՔՖխ՘ճ՘֑վէ֍դ", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[4] = NLoginCore_575.A("ƫƃƳƶƌƈƴŷƭŻƎƇ", (byte)96, 65);
                    NLoginCore_219.var_java_lang_String_arr_b[5] = NLoginCore_559.A("ƄŹƳưƦƻŵƴƨƮƜƴƔƢǇƇǆƞƗƧƭǋƒƓ", (byte)96, 65);
                    NLoginCore_219.var_java_lang_String_arr_b[6] = NLoginCore_004.D("ԶԩԾՇԲԧԭՐԓՒՖԝ", (byte)96, 68);
                    NLoginCore_219.var_java_lang_String_arr_b[7] = NLoginCore_427.B("ƏƊƸƖƎƒƚƿƨƮƽƝſƓžƺƛǂƣƘǊǋƒƓ", (byte)96, 66);
                    NLoginCore_219.var_java_lang_String_arr_b[8] = NLoginCore_384.D("ՁՏՋԩՂԐԢՏԪՑՏՃԵՇ՗՘ԺՍԽԵԚՋՅԴԺԴՅ՛իՅՖԻՅիեԩԲԭՋժէիՌԽ", (byte)96, 68);
                    NLoginCore_219.var_java_lang_String_arr_b[9] = NLoginCore_173.C("ՈԫԽՍԊՐԤՉԐՊՊԕՒԒ՝՗՚ԮՊԮԯաԨԩ", (byte)96, 67);
                    NLoginCore_219.var_java_lang_String_arr_b[10] = NLoginCore_384.A("ƫƹƵƓƬźƌƹƔƻƺƲǄƏƀƐǈƠƺƟƭǋƒƓ", (byte)96, 65);
                    NLoginCore_219.var_java_lang_String_arr_b[11] = NLoginCore_575.E("ս֐՗փ֚դՕքէ֕չր֛֞֔վ֣֎֔֐սը֓ջվխ֧ը֟֜ֈ֝", (byte)96, 69);
                    NLoginCore_219.var_java_lang_String_arr_b[12] = NLoginCore_201.A("ƤųƕƯƊƳŰƛŹƘǁƒƖƶƟƆƕǆƹƻǇƥƒƓ", (byte)96, 65);
                    NLoginCore_219.var_java_lang_String_arr_b[13] = NLoginCore_453.F("դ֍հ֊ճբչֈմ֔Ֆդ", (byte)96, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_219.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ԦԋԱՊԪԧԩԲԠՇՒՖԴՓՉԛԝԽԝԵ՝գԴբԘԲԳԟ՛ՄԾ՟ծՌ՘ձ՛ՋՉԲլմԯղՑՄդ՜ՉԹկՎ՟ձՈՉ", (byte)96, 67);
                    NLoginCore_219.var_java_lang_String_arr_b[1] = NLoginCore_384.E("նաէ֓շժփքճնճդ", (byte)96, 69);
                    NLoginCore_219.var_java_lang_String_arr_b[2] = NLoginCore_173.F("Ջեժ֖֙ըհ֌՚֌Օ՘Փ֕ց՚֍֤ՠւըգ֪֧֚ր֌ժգր֑րղ֤օ֏ֳ֨ֆֵֻֽ֓ք", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[3] = NLoginCore_076.F("եբտ֔Ցչն՛֓ջշդ", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[4] = NLoginCore_451.F("վթ֒֌ՋՕժքօ֔֝դ", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[5] = NLoginCore_559.D("ԚԏՉՆԼՑԋՊԾՄԲՃԒՄՌՉՋ՟՟ԪԴաԨԩ", (byte)96, 68);
                    NLoginCore_219.var_java_lang_String_arr_b[6] = NLoginCore_446.C("ՍԚԸԎԡԊԥԢՓՈԸԝ", (byte)96, 67);
                    NLoginCore_219.var_java_lang_String_arr_b[7] = NLoginCore_324.F("լէ֕ճիկշ֜օ֋֙ժչՠռյ֤֝ն֜ո֘կհ", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[8] = NLoginCore_091.F("ֈ֖֒հ։՗թ֖ձ֖֘֊ռ֎֞֟ց֔քռա֒֌ջցջ֌ֲ֢֌֝ւ֥֣օևմ֤֒։ֆ։֋ք", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[9] = NLoginCore_451.F("֏ղք֔Ց֗ի֐՗֑֒տ֑֟֙՝ձ՟֡շւ֨ճլպ֎֮ւ֭ֈձռ", (byte)96, 70);
                    NLoginCore_219.var_java_lang_String_arr_b[10] = NLoginCore_004.C("ՁՏՋԩՂԐԢՏԪՑՐՆՕԮՋԻԯԑԸՔ՗ՑԨԩ", (byte)96, 67);
                    NLoginCore_219.var_java_lang_String_arr_b[11] = NLoginCore_223.B("ƠƳźƦƽƇŸƧƊƸƜƣƾǁƷơǆƱƷƳƠſƪƢƜƐƞƼƟƩƎƏ", (byte)96, 66);
                    NLoginCore_219.var_java_lang_String_arr_b[12] = NLoginCore_092.C("ԺԉԫՅԠՉԆԱԏԮՖԴՌԔԤԜԩՠԬԳՊՑԨԩ", (byte)96, 67);
                    NLoginCore_219.var_java_lang_String_arr_b[13] = NLoginCore_027.B("ƤůŰŷŶƏƸƛơƷƎƙƤƥƓƅƈƀǅƃƉǋƒƓ", (byte)96, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_219.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ֆ֋Տ֙լչ֓֎֔֞֌֝ս֐պ֤ա֔ՠշե֪րցդ֊տ֊թժ֝ղ", (byte)96, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_219.var_java_lang_String_arr_b[0] = NLoginCore_384.E("֓ա֍֊֓֘՗ք֏կէտ֠֎խ֌՛ն֏՟բ֘կհ", (byte)96, 69);
                }
            }
        }
    }

    public NLoginCore_219(String string) {
        this(string, var_int_a != 0);
    }

    public synchronized boolean W() {
        try {
            if (this.var_com_nickuc_login_NLoginCore_103_b == null) {
                if (!NLoginCore_366.b(this.var_java_io_File_e)) {
                    throw new IOException((String)NLoginCore_219.c("㺀", (int)var_int_d, (long)var_long_e) + this.var_java_io_File_e + (String)NLoginCore_219.c("㺃", (int)f, (long)(g ^ h)));
                }
                this.X();
                return i != 0;
            }
            try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(this.var_java_io_File_e.toPath(), new OpenOption[j]), StandardCharsets.UTF_8);){
                ((Yaml)this.var_java_lang_String_arr_a.get()).dump(this.var_com_nickuc_login_NLoginCore_103_b.cfr_renamed_4, (Writer)outputStreamWriter);
            }
            return k != 0;
        }
        catch (IOException iOException) {
            NLoginCore_370.c((String)NLoginCore_219.c("㺆", (int)l, (long)(m ^ n)) + this.var_java_io_File_e + (String)NLoginCore_219.c("㺉", (int)o, (long)p), iOException, new Object[q]);
            return r != 0;
        }
    }

    @Override
    public /* synthetic */ boolean c(@Nonnull Object object) {
        return this.q((String)object);
    }

    @Override
    @Nullable
    public /* synthetic */ List a(Object object, @Nullable List list) {
        return this.b((String)object, (List<String>)list);
    }

    public synchronized boolean a(boolean bl) {
        boolean bl2;
        block13: {
            if (!this.var_java_io_File_e.exists()) {
                return x != 0;
            }
            BufferedReader bufferedReader = Files.newBufferedReader(this.var_java_io_File_e.toPath());
            try {
                LinkedHashMap linkedHashMap;
                String string;
                StringBuilder stringBuilder = new StringBuilder();
                while ((string = bufferedReader.readLine()) != null) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append((String)NLoginCore_219.c("㺀", (int)y, (long)(z ^ aa)));
                    }
                    stringBuilder.append(string);
                }
                String string2 = stringBuilder.toString();
                if (bl) {
                    string2 = string2.replaceAll((String)NLoginCore_219.c("㺃", (int)ab, (long)(ac ^ ad)), (String)NLoginCore_219.c("㺆", (int)ae, (long)af));
                }
                if ((linkedHashMap = (LinkedHashMap)((Yaml)this.var_java_lang_String_arr_a.get()).loadAs(string2, LinkedHashMap.class)) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.var_com_nickuc_login_NLoginCore_103_b = new NLoginCore_103(linkedHashMap, null);
                bl2 = ag;
                if (bufferedReader == null) break block13;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    NLoginCore_370.c((String)NLoginCore_219.c("㺉", (int)ah, (long)(ai ^ aj)) + this.var_java_io_File_e + (String)NLoginCore_219.c("㺌", (int)ak, (long)(al ^ am)), exception, new Object[an]);
                    return ao != 0;
                }
            }
            bufferedReader.close();
        }
        return bl2;
    }

    @Nonnull
    public List<?> l(String string) {
        return this.a(string, NLoginCore_135.n);
    }

    static {
        var_int_a = (0x20000000 >>> 221 | 0x20000000 << ~221 + 1) & 0xFFFFFFFF;
        var_int_b = 0x1000000 >>> 152 | 0x1000000 << -152;
        var_int_c = (0x8000000 >>> 91 | 0x8000000 << ~91 + 1) & 0xFFFFFFFF;
        var_int_d = Integer.reverse(0);
        var_long_e = Long.reverse(-6983141168849221377L);
        f = 0x40000000 >>> 126 | 0x40000000 << -126;
        g = Long.reverse(-1218533645814986497L);
        h = Long.reverse(0x7000000000000000L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = 0 >>> 23 | 0 << -23;
        k = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << ~255 + 1;
        l = 0x20000000 >>> 252 | 0x20000000 << ~252 + 1;
        m = Long.reverse(-1218533645814986497L);
        n = Long.reverse(0x7000000000000000L);
        o = 48 >>> 228 | 48 << -228;
        p = Long.reverse(-6983141168849221377L);
        q = 0 >>> 49 | 0 << ~49 + 1;
        r = (0 >>> 47 | 0 << -47) & 0xFFFFFFFF;
        s = Integer.reverse(0);
        t = 0x400000 >>> 54 | 0x400000 << -54;
        u = Integer.reverse(Integer.MIN_VALUE);
        v = Integer.reverse(0);
        w = 0 >>> 191 | 0 << -191;
        x = 0 >>> 47 | 0 << ~47 + 1;
        y = 0x800000 >>> 53 | 0x800000 << -53;
        z = Long.reverse(-1218533645814986497L);
        aa = Long.reverse(0x7000000000000000L);
        ab = (5 >>> 160 | 5 << ~160 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(-1218533645814986497L);
        ad = Long.reverse(0x7000000000000000L);
        ae = Integer.reverse(0x60000000);
        af = Long.reverse(-6983141168849221377L);
        ag = (0x200000 >>> 181 | 0x200000 << ~181 + 1) & 0xFFFFFFFF;
        ah = 14 >>> 65 | 14 << ~65 + 1;
        ai = Long.reverse(-1218533645814986497L);
        aj = Long.reverse(0x7000000000000000L);
        ak = Integer.reverse(0x10000000);
        al = Long.reverse(-1218533645814986497L);
        am = Long.reverse(0x7000000000000000L);
        an = (0 >>> 79 | 0 << -79) & 0xFFFFFFFF;
        ao = 0 >>> 139 | 0 << -139;
        ap = Integer.reverse(0);
        aq = (288 >>> 5 | 288 << -5) & 0xFFFFFFFF;
        ar = Long.reverse(-1218533645814986497L);
        as = Long.reverse(0x7000000000000000L);
        at = Integer.reverse(0x50000000);
        au = (-1 >>> 45 | -1 << -45) & 0xFFFFFFFF;
        av = Long.reverse(-6983141168849221377L);
        aw = Integer.reverse(0);
        ax = Integer.reverse(0);
        ay = (131072 >>> 49 | 131072 << ~49 + 1) & 0xFFFFFFFF;
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = 0 >>> 160 | 0 << ~160 + 1;
        bb = 524288 >>> 179 | 524288 << ~179 + 1;
        bc = Integer.reverse(0);
        bd = (44 >>> 2 | 44 << -2) & 0xFFFFFFFF;
        be = Long.reverse(-1218533645814986497L);
        bf = Long.reverse(0x7000000000000000L);
        bg = 768 >>> 38 | 768 << -38;
        bh = Long.reverse(-1218533645814986497L);
        bi = Long.reverse(0x7000000000000000L);
        bj = Integer.reverse(-1107296256);
        bk = 0x1A0000 >>> 17 | 0x1A0000 << ~17 + 1;
        bl = Long.reverse(-1218533645814986497L);
        bm = Long.reverse(0x7000000000000000L);
        bn = Integer.reverse(0x70000000);
        bo = 7 >>> 255 | 7 << -255;
        var_java_lang_String_arr_a = new String[bn];
        var_java_lang_String_arr_b = new String[bo];
        NLoginCore_219.b();
    }

    public NLoginCore_219(File file, boolean bl) {
        this.var_java_lang_String_arr_a = ThreadLocal.withInitial(() -> {
            DumperOptions dumperOptions = new DumperOptions();
            dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            NLoginCore_070 NLoginCore_051 = new NLoginCore_070(this, dumperOptions);
            return new Yaml((BaseConstructor)new Constructor(new LoaderOptions()), (Representer)NLoginCore_051, dumperOptions);
        });
        this.var_java_io_File_e = file;
        if (bl) {
            this.X();
        }
    }

    public synchronized boolean X() {
        return this.a(w != 0);
    }

    public boolean Z() {
        return (this.var_com_nickuc_login_NLoginCore_103_b != null ? az : ba) != 0;
    }

    public boolean q(@Nonnull String string) {
        return this.p(string);
    }

    private static /* synthetic */ String java_lang_String_a(Object object) {
        return object != null ? object.toString() : NLoginCore_219.c("㺀", (int)bk, (long)(bl ^ bm));
    }

    private static String a(int n, long l) {
        l ^= 0xEL;
        l ^= 0x6B99C0E63C384EB3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(50 + 19), (byte)(6 + 77), (byte)(36 + 11), (byte)(55 + 12), (byte)(55 + 11), 67, (byte)(6 + 41), (byte)(16 + 64), (byte)(9 + 66), (byte)(13 + 54), (byte)(33 + 50), (byte)(17 + 36), (byte)(44 + 36), 97, (byte)(42 + 58), (byte)(68 + 32), (byte)(32 + 73), (byte)(90 + 20), (byte)(35 + 68)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("կռջԾվպյվ։ոՅփևրփ։Ջ࣡ࣤࣗࣧࢵ࣓ࣆࣩࣩࣗ࣬", (byte)80, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_219.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginCore_219(String string, boolean bl) {
        this(new File(var_java_io_File_d, string), bl);
    }

    public NLoginCore_219(File file) {
        this(file, var_int_c != 0);
    }

    @Override
    public <T> T c() {
        return (T)(this.Z() ? this.var_com_nickuc_login_NLoginCore_103_b : null);
    }

    public NLoginCore_219(String string, File file) {
        this(string, file, var_int_b != 0);
    }

    public String toString() {
        return (String)NLoginCore_219.c("㺀", (int)bd, (long)(be ^ bf)) + this.var_java_io_File_e + (String)NLoginCore_219.c("㺃", (int)bg, (long)(bh ^ bi)) + this.var_com_nickuc_login_NLoginCore_103_b + (char)bj;
    }

    public boolean p(String string) {
        return (this.Z() && this.var_com_nickuc_login_NLoginCore_103_b.java_lang_Object_a(string) != null ? bb : bc) != 0;
    }

    public Set<String> a(String string) {
        if (!this.Z()) {
            return NLoginCore_114.q;
        }
        Collection<String> collection = string.isEmpty() ? this.var_com_nickuc_login_NLoginCore_103_b.e() : this.var_com_nickuc_login_NLoginCore_103_b.b(string).e();
        collection.removeIf(String::isEmpty);
        return new LinkedHashSet<String>(collection);
    }

    public Object f(@Nonnull String string) {
        return this.Z() ? this.var_com_nickuc_login_NLoginCore_103_b.java_lang_Object_a(string) : null;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_219.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.B("áăąåĉĨĠĶĢñįĥĳĭöěĽļĴĺĴĉ", (byte)29, 66), NLoginCore_219.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.A("ĜĩĨëīħĢīĶĥòİĴĭİĶøҎґ҄ҔѢҀѳ҄ҖҙҖď", (byte)29, 65) + string + NLoginCore_427.D("ц", (byte)29, 68) + methodType.toString(), exception);
        }
    }

    public static void b(File file) {
        var_java_io_File_d = file;
    }

    @Nonnull
    public List<String> k(String string) {
        return this.b(string, NLoginCore_135.o);
    }

    public NLoginCore_219(String string, File file, boolean bl) {
        this(new File(file, string), bl);
    }

    @Override
    @Nonnull
    public /* synthetic */ List java_util_List_a(Object object) {
        return this.k((String)object);
    }

    private synchronized boolean b(String string, boolean bl) {
        boolean bl2 = this.var_java_io_File_e.exists();
        if (!bl2) {
            this.Y();
            try {
                NLoginCore_366.a(string, this.var_java_io_File_e);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        if (bl) {
            this.X();
        }
        return (!bl2 ? u : v) != 0;
    }

    @Override
    @Nonnull
    public /* synthetic */ List b(Object object) {
        return this.l((String)object);
    }

    @Override
    @Nullable
    public List<?> a(String string, @Nullable List<?> list) {
        if (this.Z()) {
            List<?> list2 = this.var_com_nickuc_login_NLoginCore_103_b.a(string, list);
            return list2 == null ? list : list2;
        }
        return list;
    }

    @Generated
    public File d() {
        return this.var_java_io_File_e;
    }

    public synchronized boolean n(String string) {
        return this.b(string, s != 0);
    }

    public synchronized boolean o(String string) {
        return this.b(string, t != 0);
    }

    @Override
    public void a(String string, Object object) {
        if (!this.Z()) {
            this.W();
        }
        if (this.Z()) {
            this.var_com_nickuc_login_NLoginCore_103_b.a(string, object);
        }
    }

    @Override
    @Nullable
    public /* synthetic */ List b(Object object, @Nullable List list) {
        return this.a((String)object, list);
    }

    @Override
    @Nullable
    public List<String> b(String string, @Nullable List<String> list) {
        if (!this.Z()) {
            return list;
        }
        Collection collection = this.var_com_nickuc_login_NLoginCore_103_b.a(string, null);
        if (collection == null) {
            return list;
        }
        return collection.stream().map(object -> this.f((String)object)).collect(Collectors.toList());
    }

    public synchronized boolean r() {
        return this.var_java_io_File_e.exists();
    }

    public synchronized boolean Y() {
        if (!this.var_java_io_File_e.exists()) {
            return ap != 0;
        }
        if (!this.var_java_io_File_e.delete()) {
            NLoginCore_370.d((String)NLoginCore_219.c("㺀", (int)aq, (long)(ar ^ as)) + this.var_java_io_File_e + (String)NLoginCore_219.c("㺃", (int)(at & au), (long)av), new Object[aw]);
            return ax != 0;
        }
        this.var_com_nickuc_login_NLoginCore_103_b = null;
        return ay != 0;
    }
}

