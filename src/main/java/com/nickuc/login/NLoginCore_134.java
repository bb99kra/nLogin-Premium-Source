/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_303;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_005;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_556;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_134
extends Enum<NLoginCore_134>
implements NLoginInterface_005 {
    public static final /* enum */ NLoginCore_134 var_com_nickuc_login_NLoginCore_134_a;
    public static final int j;
    private static final NLoginCore_208 var_com_nickuc_login_NLoginCore_208_a;
    private final NLoginCore_474 var_com_nickuc_login_NLoginCore_474_a;
    private final Object var_java_lang_Object_b;
    private static final /* synthetic */ NLoginCore_134[] var_com_nickuc_login_NLoginCore_134_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static int var_int_c;
    private static int d;
    private static long e;
    private static int f;
    private static int g;
    private static long h;
    private static long i;
    private static int k;
    private static int l;
    private static int m;
    private static long n;
    private static int o;
    private static long p;
    private static long q;
    private static int r;
    private static int s;
    private static int t;
    private static long u;
    private static int v;
    private static int w;
    private static long x;
    private static int y;
    private static int z;
    private static long aa;
    private static int ab;
    private static long ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static long aj;
    private static long ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static long ax;
    private static int ay;
    private static int az;
    private static long ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static long be;

    @Override
    public NLoginCore_208 com_nickuc_login_NLoginCore_208_a() {
        return var_com_nickuc_login_NLoginCore_208_a;
    }

    public static boolean a(nLoginBukkit nLoginBukkit2, boolean bl) {
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        NLoginCore_219 NLoginCore_2192 = nLoginBukkit2.a();
        if (!NLoginCore_2192.r()) {
            NLoginCore_2192.o((String)NLoginCore_134.c("㺀", (int)g, (long)(h ^ i)));
        } else if (!bl && !NLoginCore_2192.X()) {
            return k != 0;
        }
        if (!NLoginCore_2192.Z()) {
            return l != 0;
        }
        NLoginCore_525.a(NLoginCore_134.values(), var_com_nickuc_login_NLoginCore_208_a, NLoginCore_2192);
        NLoginCore_134.a(nLoginBukkit2.com_nickuc_login_NLoginType_008_a());
        NLoginCore_370.b((String)NLoginCore_134.c("㺃", (int)m, (long)n) + NLoginCore_2702.h() + (String)NLoginCore_134.c("㺆", (int)o, (long)(p ^ q)), new Object[r]);
        return s != 0;
    }

    private static void b() {
        int n;
        var_long_c = -8973099588963559189L;
        long l = var_long_c ^ 0x5A26C9D7FDB72FD3L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), 69, (byte)(29 + 54), (byte)(38 + 9), (byte)(33 + 34), (byte)(38 + 28), (byte)(3 + 64), (byte)(3 + 44), (byte)(2 + 78), (byte)(47 + 28), (byte)(11 + 56), (byte)(47 + 36), (byte)(26 + 27), (byte)(68 + 12), (byte)(9 + 88), (byte)(12 + 88), (byte)(86 + 14), (byte)(4 + 101), (byte)(69 + 41), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_134.var_java_lang_String_arr_b[0] = NLoginCore_223.C("јѿѶшѤѼѓѿѪчѧтѹѳҍѵѥғѦѭѩ҈џѠ", (byte)29, 67);
                    NLoginCore_134.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ՎԨԩՖՈՆՅԋՆՑԔԷՆՇ՚ՁՂԺԱԣՆէՔԿթԼՇծԦԹՅծժՉՠՆԮԿչՌՙԳԺԼժկմրԿՔծ՗սգՈՀ՞շՉ՚ՠ֋գ֎", (byte)29, 70);
                    NLoginCore_134.var_java_lang_String_arr_b[2] = NLoginCore_324.C("ѹѯѴѰѧѳѾц҉ҏѽѦэѡҐҊҒѢѯя҂ѢѤҗ҉ѕҊҙҠҒҗҏќџңѷ҆҂ѻҍѷҚѿѴ", (byte)29, 67);
                    NLoginCore_134.var_java_lang_String_arr_b[3] = NLoginCore_384.C("пѿ҈ѻҀҊхѷҊѸює", (byte)29, 67);
                    NLoginCore_134.var_java_lang_String_arr_b[4] = NLoginCore_559.B("ĝĤîēıďôĳĻďđ÷ĕŀě÷ęęĬĮķğČč", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[5] = NLoginCore_324.F("ԩԫՂՅԴՖԵԐԩԮՒԡ", (byte)29, 70);
                    NLoginCore_134.var_java_lang_String_arr_b[6] = NLoginCore_110.A("ąĬģõđĩĀĬėôĔýćĴŁĎġĀļģĢŅČč", (byte)29, 65);
                    NLoginCore_134.var_java_lang_String_arr_b[7] = NLoginCore_201.D("хѼцѦѣћѴфѣ҇ҁє", (byte)29, 68);
                    NLoginCore_134.var_java_lang_String_arr_b[8] = NLoginCore_173.B("ĢĩïĒħíøĳĈĔċĘıöĎŁĽĖĵĳĘĒŉāĖŌŌćĠĞĭČŋōĿľČĶıĪŐŏēĮĚĸŝĸŜĸļĸĹņľĶĢŗīĻĮįŢŢŭŭŭųőŢŦšōŬŜŴŧŽŗŭžŚĶžŗŏŌō", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[9] = NLoginCore_559.B("ĈĠĐďĭĖċĶčíĪýĜĎČĻěĔĎĸĎĹŃļńąĨŊħĎłĪ", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[10] = NLoginCore_092.B("ħđñĎñĩĹĴĥĐıığİĐĳĸńĥĻęĲĕēĿĂĶĉģęōĜ", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[11] = NLoginCore_201.E("ՇԐԨԩՎՐԑԡԮՈՈՇԙ՞՚՞ԮԵԬդԹԯԬԭ", (byte)29, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_134.var_java_lang_String_arr_b[0] = NLoginCore_110.D("јѿѶшѤѼѓѿѪчѨѦёўҋѾўѐѥѵјқҒѯҞҐҝћҎћҋѰ", (byte)29, 68);
                    NLoginCore_134.var_java_lang_String_arr_b[1] = NLoginCore_427.B("ĮĈĉĶĨĦĥëĦıôėĦħĺġĢĚđăĦŇĴğŉĜħŎĆęĥŎŊĩŀĦĎğřĬĹēĚĜŊŏŔŠğĴŎķŝňłśŔīĺŠŘŏŎĮ", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[2] = NLoginCore_027.B("ĦĜġĝĔĠīóĶļĪēúĎĽķĿďĜüįďđńĶĂķņōĿńļĊłğŔŅġŅőķĦŖġ", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[3] = NLoginCore_223.E("ԻԱԑԎԿԖԔԒՌՅԸԡ", (byte)29, 69);
                    NLoginCore_134.var_java_lang_String_arr_b[4] = NLoginCore_076.E("ԽՄԎԳՑԯԔՓ՛ԯԲԙԭՇՐ՞Ւ՚ԢԗԤԯԬԭ", (byte)29, 69);
                    NLoginCore_134.var_java_lang_String_arr_b[5] = NLoginCore_324.C("яюѐѨлѳѨѼҎѻѫє", (byte)29, 67);
                    NLoginCore_134.var_java_lang_String_arr_b[6] = NLoginCore_004.B("ąĬģõđĩĀĬėôĖĺĆēĕķĲĀĞķľğČč", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[7] = NLoginCore_201.B("ĎéĪĝìċôăĶĎİķĔĭĜĹĲčıĂĖďČč", (byte)29, 66);
                    NLoginCore_134.var_java_lang_String_arr_b[8] = NLoginCore_451.A("ĢĩïĒħíøĳĈĔċĘıöĎŁĽĖĵĳĘĒŉāĖŌŌćĠĞĭČŋōĿľČĶıĪŐŏēĮĚĸŝĸŜĸļĸĹņľĶĢŗīĻĮįŢŢŭŭŭųőŢŦšōŬťĽŊŊĽŁŲŎŖţŮśƉũŕŹƊńřŁŨž", (byte)29, 65);
                    NLoginCore_134.var_java_lang_String_arr_b[9] = NLoginCore_384.C("ћѳѣѢҀѩў҉ѠрѽѐѯѡџҎѮѧѡҋѡ҈ѤѶҞѽҙҁҘҘңѻ", (byte)29, 67);
                    NLoginCore_134.var_java_lang_String_arr_b[10] = NLoginCore_138.A("ħđñĎñĩĹĴĥĐıığİĐĳĸńĥĻęĤıĕĘŋĨĸŋĝĘĐ", (byte)29, 65);
                    NLoginCore_134.var_java_lang_String_arr_b[11] = NLoginCore_387.B("ħðĈĉĮİñāĎĨħĚýĭûľĀĝĶğĂĵČč", (byte)29, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_134.var_java_lang_String_arr_b[0] = NLoginCore_173.A("ĳåĮıČĪóİĔĳćĜĔĎĕčđþČĔÿĵČč", (byte)29, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_134.var_java_lang_String_arr_b[0] = NLoginCore_559.C("҅фі҅Ѥј҄ѽ҆ћҐѽҒҁўѱҕь҃ѠҐїѳѱҌѬѬҌ҉ҕѲѡ", (byte)29, 67);
                }
            }
        }
    }

    @Override
    public Object java_lang_Object_a() {
        return this.var_java_lang_Object_b;
    }

    private static String a(int n, long l) {
        l ^= 0x46L;
        l ^= 0x5A26C9D7FDB72FD3L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), 69, (byte)(36 + 47), (byte)(12 + 35), (byte)(52 + 15), (byte)(13 + 53), (byte)(62 + 5), (byte)(16 + 31), (byte)(73 + 7), 75, (byte)(64 + 3), (byte)(33 + 50), (byte)(24 + 29), (byte)(71 + 9), (byte)(66 + 31), (byte)(13 + 87), (byte)(98 + 2), (byte)(42 + 63), (byte)(109 + 1), (byte)(88 + 15)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ŔšŠģţşŚţŮŝĪŨŬťŨŮİҶӋӊҭӉӏҽӄҝ", (byte)57, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_134.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_134.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.F("ԐԲԴԔԸ՗ՏեՑԠ՞Քբ՜ԥՊլիգթգԸ", (byte)44, 70), NLoginCore_134.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_076.C("ҜҩҨѫҫҧҢҫҶҥѲҰҴҭҰҶѸ߾ࠓࠒߵࠑࠗࠅࠌߥҍ", (byte)44, 67) + string + NLoginCore_453.D("ѳ", (byte)44, 68) + methodType.toString(), exception);
        }
    }

    @Override
    public int int_a() {
        return this.ordinal();
    }

    private NLoginCore_134(String string2, Object object) {
        String[] stringArray = new String[var_int_a];
        stringArray[NLoginCore_134.var_int_b] = string2;
        this.var_com_nickuc_login_NLoginCore_474_a = NLoginCore_474.a(stringArray);
        this.var_java_lang_Object_b = object;
    }

    public static NLoginCore_134 valueOf(String string) {
        return Enum.valueOf(NLoginCore_134.class, string);
    }

    private static /* synthetic */ NLoginCore_134[] com_nickuc_login_NLoginCore_134_arr_a() {
        NLoginCore_134[] NLoginCore_134Array = new NLoginCore_134[ar];
        NLoginCore_134Array[NLoginCore_134.as] = var_com_nickuc_login_NLoginCore_134_a;
        return NLoginCore_134Array;
    }

    public static NLoginCore_134[] values() {
        return (NLoginCore_134[])var_com_nickuc_login_NLoginCore_134_arr_a.clone();
    }

    @Override
    public NLoginCore_474 com_nickuc_login_NLoginCore_474_a() {
        return this.var_com_nickuc_login_NLoginCore_474_a;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(-1);
        e = Long.reverse(-5397008329092063551L);
        f = Integer.reverse(0);
        g = 16 >>> 132 | 16 << -132;
        h = Long.reverse(-2947050131802513727L);
        i = Long.reverse(0x6200000000000000L);
        k = Integer.reverse(0);
        l = (0 >>> 20 | 0 << -20) & 0xFFFFFFFF;
        m = 131072 >>> 144 | 131072 << -144;
        n = Long.reverse(-5397008329092063551L);
        o = Integer.reverse(-1073741824);
        p = Long.reverse(-2947050131802513727L);
        q = Long.reverse(0x6200000000000000L);
        r = (0 >>> 103 | 0 << -103) & 0xFFFFFFFF;
        s = Integer.reverse(Integer.MIN_VALUE);
        t = Integer.reverse(0x20000000);
        u = Long.reverse(-5397008329092063551L);
        v = (163840 >>> 47 | 163840 << ~47 + 1) & 0xFFFFFFFF;
        w = -1 >>> 106 | -1 << -106;
        x = Long.reverse(-5397008329092063551L);
        y = (196608 >>> 143 | 196608 << -143) & 0xFFFFFFFF;
        z = Integer.reverse(-1);
        aa = Long.reverse(-5397008329092063551L);
        ab = (0x1C0000 >>> 242 | 0x1C0000 << -242) & 0xFFFFFFFF;
        ac = Long.reverse(-2947050131802513727L);
        ad = Long.reverse(0x6200000000000000L);
        ae = Integer.reverse(0);
        af = 8192 >>> 235 | 8192 << ~235 + 1;
        ag = Integer.reverse(0);
        ah = Integer.reverse(0);
        ai = (65536 >>> 205 | 65536 << -205) & 0xFFFFFFFF;
        aj = Long.reverse(-2947050131802513727L);
        ak = Long.reverse(0x6200000000000000L);
        al = Integer.reverse(Integer.MIN_VALUE);
        am = (0 >>> 162 | 0 << ~162 + 1) & 0xFFFFFFFF;
        an = Integer.reverse(0x20000000);
        ao = (8 >>> 99 | 8 << ~99 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(Integer.MIN_VALUE);
        aq = (0 >>> 45 | 0 << -45) & 0xFFFFFFFF;
        ar = (0x4000000 >>> 218 | 0x4000000 << -218) & 0xFFFFFFFF;
        as = Integer.reverse(0);
        at = 6144 >>> 73 | 6144 << -73;
        au = Integer.reverse(0x30000000);
        av = 8192 >>> 139 | 8192 << ~139 + 1;
        aw = Integer.reverse(-1879048192);
        ax = Long.reverse(-5397008329092063551L);
        ay = (0 >>> 170 | 0 << -170) & 0xFFFFFFFF;
        az = 2560 >>> 104 | 2560 << -104;
        ba = Long.reverse(-5397008329092063551L);
        bb = 262144 >>> 242 | 262144 << ~242 + 1;
        bc = (11264 >>> 10 | 11264 << -10) & 0xFFFFFFFF;
        bd = (-1 >>> 226 | -1 << -226) & 0xFFFFFFFF;
        be = Long.reverse(-5397008329092063551L);
        var_java_lang_String_arr_a = new String[at];
        var_java_lang_String_arr_b = new String[au];
        NLoginCore_134.b();
        j = av;
        var_com_nickuc_login_NLoginCore_134_a = new NLoginCore_134((String)NLoginCore_134.c("㺃", (int)az, (long)ba), bb != 0);
        var_com_nickuc_login_NLoginCore_134_arr_a = NLoginCore_134.com_nickuc_login_NLoginCore_134_arr_a();
        var_com_nickuc_login_NLoginCore_208_a = new NLoginCore_208((String)NLoginCore_134.c("㺆", (int)(bc & bd), (long)be), NLoginCore_134.values().length);
    }

    public static boolean j() {
        return ((String)NLoginCore_134.c("㺀", (int)(var_int_c & d), (long)e)).equals(NLoginCore_532.var_com_nickuc_login_NLoginCore_477_b.a(new Object[f]));
    }

    private static void a(NLoginType_008 NLoginType_008) {
        File file = new File(NLoginType_008.java_io_File_c(), (String)NLoginCore_134.c("㺀", (int)t, (long)u));
        if (!file.exists()) {
            NLoginCore_556 NLoginCore_5562 = NLoginCore_303.a();
            if (NLoginCore_5562 != null) {
                Object object = NLoginCore_5562.af();
                if (NLoginCore_5562 == NLoginCore_556.var_com_nickuc_login_NLoginCore_556_d) {
                    object = NLoginCore_134.c("㺃", (int)(v & w), (long)x);
                }
                BCryptHashProvider.a(NLoginCore_532.var_com_nickuc_login_NLoginCore_477_b, (Object)((String)NLoginCore_134.c("㺆", (int)(y & z), (long)aa) + (String)object + (String)NLoginCore_134.c("㺉", (int)ab, (long)(ac ^ ad))));
            }
        } else {
            try (InputStream inputStream = Files.newInputStream(file.toPath(), new OpenOption[ae]);){
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                if (dataInputStream.readUnsignedShort() != af) {
                    return;
                }
                int n = dataInputStream.readUnsignedShort();
                block14: for (int i = ag; i < n; ++i) {
                    String string = dataInputStream.readUTF();
                    NLoginCore_532 NLoginCore_4772 = Arrays.stream(NLoginCore_532.values()).filter(NLoginCore_477 -> string.equals(NLoginCore_477.var_com_nickuc_login_NLoginCore_474_h.a()[aq])).findFirst().orElse(null);
                    if (NLoginCore_4772 == null) continue;
                    switch (dataInputStream.readByte()) {
                        case 0: {
                            NLoginCore_525.a(NLoginCore_4772, NLoginCore_532.var_com_nickuc_login_NLoginCore_208_h, (Object)dataInputStream.readUTF());
                            continue block14;
                        }
                        case 1: {
                            NLoginCore_525.a(NLoginCore_4772, NLoginCore_532.var_com_nickuc_login_NLoginCore_208_h, dataInputStream.readBoolean());
                            continue block14;
                        }
                        case 2: {
                            NLoginCore_525.a(NLoginCore_4772, NLoginCore_532.var_com_nickuc_login_NLoginCore_208_h, dataInputStream.readInt());
                            continue block14;
                        }
                        case 3: {
                            int n2 = dataInputStream.readInt();
                            String[] stringArray = new String[n2];
                            for (int j = ah; j < n2; ++j) {
                                stringArray[j] = dataInputStream.readUTF();
                            }
                            NLoginCore_135<String> NLoginCore_1352 = NLoginCore_135.a(stringArray);
                            NLoginCore_525.a(NLoginCore_4772, NLoginCore_532.var_com_nickuc_login_NLoginCore_208_h, NLoginCore_1352);
                        }
                    }
                }
            }
            catch (IOException iOException) {
                Object[] objectArray = new Object[al];
                objectArray[NLoginCore_134.am] = an;
                NLoginCore_370.c((String)NLoginCore_134.c("㺌", (int)ai, (long)(aj ^ ak)), iOException, objectArray);
            }
        }
        BCryptHashProvider.c(NLoginType_008, ao != 0);
        BCryptHashProvider.e(NLoginType_008, ap != 0);
    }
}

