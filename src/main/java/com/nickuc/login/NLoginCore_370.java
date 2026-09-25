/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_189;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginInterface_016;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_294;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_439;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_145;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_370 {
    private static int bg;
    private static long bh;
    private static int ah;
    private static long ax;
    private static int ca;
    private static int ac;
    private static int t;
    private static long c;
    private static int o;
    private static int g;
    private static int i;
    private static int bn;
    private static long var_long_m;
    private static int s;
    private static int e;
    private static long aq;
    private static int bw;
    private static long bi;
    private static int h;
    private static int am;
    private static long be;
    private static long bl;
    private static int r;
    private static int bj;
    private static int v;
    private static long ay;
    private static long ai;
    private static int at;
    private static long an;
    private static long bm;
    private static int n;
    private static long bs;
    private static int aj;
    private static long ae;
    private static int x;
    private static long bc;
    private static int var_int_a;
    private static int au;
    private static int q;
    private static int l;
    private static int bx;
    private static int br;
    private static int y;
    private static String D;
    private static long cb;
    private static int az;
    private static int by;
    private static long d;
    private static long bb;
    private static int bd;
    private static long as;
    private static long al;
    private static int var_int_b;
    private static long af;
    private static NLoginCore_116<?> var_com_nickuc_login_NLoginInterface_011____a;
    private static boolean Z;
    private static long j;
    private static long ak;
    private static int w;
    private static int z;
    private static long av;
    private static int bv;
    private static int u;
    private static int bz;
    private static boolean var_boolean_aa;
    private static int cd;
    private static long bo;
    private static long p;
    private static int ar;
    private static long bf;
    private static int var_int_ab;
    private static int ao;
    private static int cc;
    private static int var_int_aa;
    private static int aw;
    private static int f;
    private static long ap;
    private static final Set<NLoginInterface_016> var_java_util_Set_com_nickuc_login_NLoginInterface_016__m;
    private static long bu;
    private static int ba;
    private static PrintWriter var_java_io_PrintWriter_a;
    private static int k;
    private static int bk;
    private static int ad;
    private static String[] var_java_lang_String_arr_a;
    private static int bp;
    private static int bt;
    private static int ag;
    private static boolean var_boolean_ab;
    private static int bq;
    private static String[] var_java_lang_String_arr_b;

    public static void c(String string, Object ... objectArray) {
        NLoginCore_370.b(string, null, objectArray);
        if (string != null && string.contains("By:") && string.contains("nickuc.com")) {
            NLoginCore_370.c("  Thanks for using Black-Minecraft.com", new Object[0]);
        }
    }

    public static void a(Throwable throwable) {
        throwable.printStackTrace();
        if (var_java_io_PrintWriter_a != null) {
            throwable.printStackTrace(var_java_io_PrintWriter_a);
            var_java_io_PrintWriter_a.flush();
        }
    }

    public static void e(String string, Object ... objectArray) {
        NLoginCore_370.d(string, null, objectArray);
        if (string != null && string.contains("By:") && string.contains("nickuc.com")) {
            NLoginCore_370.e("  Thanks for using Black-Minecraft.com", new Object[0]);
        }
    }

    private static /* synthetic */ boolean a(boolean bl, String string, String string2, String string3, Object[] objectArray) {
        String string4 = string3.toLowerCase(Locale.ENGLISH);
        if (bl && string.equals(string2) && string4.contains((CharSequence)NLoginCore_370.c("㺀", (int)bk, (long)(NLoginCore_370.bl ^ bm))) && string4.contains((CharSequence)NLoginCore_370.c("㺃", (int)bn, (long)bo))) {
            return bp != 0;
        }
        return (string4.contains((CharSequence)NLoginCore_370.c("㺆", (int)(bq & br), (long)bs)) && string4.contains((CharSequence)NLoginCore_370.c("㺉", (int)bt, (long)bu)) ? bv : bw) != 0;
    }

    public static void close() {
        if (var_java_io_PrintWriter_a != null) {
            var_java_io_PrintWriter_a.flush();
            var_java_io_PrintWriter_a.close();
            var_java_io_PrintWriter_a = null;
        }
    }

    public static void a(String string, String ... stringArray) {
        var_long_m.stream().filter(NLoginInterface_016 -> NLoginInterface_016 instanceof NLoginCore_439).findFirst().ifPresent(NLoginInterface_016 -> ((NLoginCore_439)NLoginInterface_016).a(string, stringArray));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(NLoginCore_145 NLoginCore_1452, String string, @Nullable Throwable throwable, boolean bl) {
        if (var_java_io_PrintWriter_a == null) {
            return;
        }
        try {
            if (throwable != null) {
                throwable.printStackTrace(var_java_io_PrintWriter_a);
            }
            NLoginCore_189 NLoginCore_189 = new NLoginCore_189();
            String string2 = (String)NLoginCore_370.c("㺀", (int)ad, (long)(ae ^ af)) + NLoginCore_189.an() + (String)NLoginCore_370.c("㺃", (int)(ag & ah), (long)ai) + NLoginCore_189.am() + (String)NLoginCore_370.c("㺆", (int)aj, (long)(ak ^ al)) + NLoginCore_189.al() + (String)NLoginCore_370.c("㺉", (int)am, (long)an) + NLoginCore_189.ak() + (String)NLoginCore_370.c("㺌", (int)ao, (long)(ap ^ aq)) + NLoginCore_189.aj() + (String)NLoginCore_370.c("㺏", (int)ar, (long)as) + NLoginCore_189.ai() + (String)NLoginCore_370.c("㺒", (int)(at & au), (long)av) + NLoginCore_1452.toString() + (String)NLoginCore_370.c("㺕", (int)aw, (long)(ax ^ ay)) + (bl ? NLoginCore_065.c(string, az != 0) : string);
            var_java_io_PrintWriter_a.println(string2);
        }
        finally {
            var_java_io_PrintWriter_a.flush();
        }
    }

    public static void c(String string, @Nullable Throwable throwable, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (Z) {
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_d, string, throwable, new Object[u]);
        } else {
            if (!var_boolean_aa) {
                string = NLoginCore_065.c(string, v != 0);
            }
            var_int_a.com_nickuc_login_NLoginInterface_020_a().b(string, throwable);
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_d, string, throwable, var_boolean_aa);
        }
    }

    public static void a(NLoginInterface_016 NLoginInterface_016, NLoginInterface_016 ... NLoginInterface_016Array) {
        var_long_m.add(NLoginInterface_016);
        var_long_m.addAll(Arrays.asList(NLoginInterface_016Array));
    }

    private static String a(int n, long l) {
        l ^= 0x54L;
        l ^= 0x6D5E71D8ABBACA46L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(52 + 17), (byte)(3 + 80), (byte)(12 + 35), (byte)(39 + 28), (byte)(21 + 45), (byte)(14 + 53), (byte)(18 + 29), (byte)(6 + 74), (byte)(58 + 17), (byte)(39 + 28), (byte)(36 + 47), (byte)(22 + 31), (byte)(12 + 68), 97, (byte)(25 + 75), (byte)(29 + 71), 105, (byte)(99 + 11), (byte)(3 + 100)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(5 + 64), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_223.F("ւ֏֎Ց֑֍ֈ֑֜֋՘֖֖֚֓֜՞ࣸࣄࣱࣱ࣭ࣻࣷࣿࣿँࣣࣕ", (byte)99, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_370.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static void b(String string, @Nullable Throwable throwable, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (Z) {
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_c, string, throwable, new Object[s]);
        } else {
            if (!var_boolean_aa) {
                string = NLoginCore_065.c(string, t != 0);
            }
            var_int_a.com_nickuc_login_NLoginInterface_020_a().a(string, throwable);
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_c, string, throwable, var_boolean_aa);
        }
    }

    public static void a(NLoginCore_145 NLoginCore_1452, String string, @Nullable Throwable throwable, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (throwable != null) {
            throwable.printStackTrace();
        }
        if (var_int_a == null) {
            String string2 = NLoginCore_065.c(string, y != 0);
            System.out.println(NLoginCore_1452.b(string2, z != 0));
            NLoginCore_370.a(NLoginCore_1452, string2, throwable, var_int_aa != 0);
        } else {
            var_int_a.com_nickuc_login_NLoginInterface_040_b().com_nickuc_login_NLoginInterface_006_a().k(NLoginCore_1452.b(string, var_int_ab != 0));
            NLoginCore_370.a(NLoginCore_1452, string, throwable, ac != 0);
        }
    }

    @Generated
    public static boolean aj() {
        return var_boolean_ab;
    }

    public static void d(String string, Object ... objectArray) {
        NLoginCore_370.c(string, null, objectArray);
        if (string != null && string.contains("By:") && string.contains("nickuc.com")) {
            NLoginCore_370.d("  Thanks for using Black-Minecraft.com", new Object[0]);
        }
    }

    public static void d(String string, @Nullable Throwable throwable, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (Z) {
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_a, string, throwable, new Object[w]);
        } else {
            if (!var_boolean_aa) {
                string = NLoginCore_065.c(string, x != 0);
            }
            var_int_a.com_nickuc_login_NLoginInterface_020_a().q(string);
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_a, string, throwable, var_boolean_aa);
        }
    }

    public static void f(String string, Object ... objectArray) {
        NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_a, string, null, objectArray);
        if (string != null && string.contains("By:") && string.contains("nickuc.com")) {
            NLoginCore_370.f("  Thanks for using Black-Minecraft.com", new Object[0]);
        }
    }

    public static void a(String string, @Nullable Throwable throwable, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (var_boolean_ab) {
            NLoginCore_370.d(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_b.bl + NLoginCore_145.var_com_nickuc_login_NLoginCore_145_b.bk + string, throwable, new Object[q]);
        } else {
            NLoginCore_370.a(NLoginCore_145.var_com_nickuc_login_NLoginCore_145_b, string, throwable, r != 0);
        }
    }

    public static void b(String string, Object ... objectArray) {
        NLoginCore_370.a(string, null, objectArray);
        if (string != null && string.contains("By:") && string.contains("nickuc.com")) {
            NLoginCore_370.b("  Thanks for using Black-Minecraft.com", new Object[0]);
        }
    }

    @Generated
    public static void f(boolean bl) {
        var_boolean_ab = bl;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_370.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.E("ԙԻԽԝՁՠ՘ծ՚ԩէ՝իեԮՓյմլղլՁ", (byte)53, 69), NLoginCore_370.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.D("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғ࠭߹࠰ࠬࠢࠦ࠴ࠦ࠴࠶ࠊ࠘ҫ", (byte)53, 68) + string + NLoginCore_451.C("Ҏ", (byte)53, 67) + methodType.toString(), exception);
        }
    }

    public static Set<NLoginInterface_016> d() {
        return var_long_m;
    }

    static /* synthetic */ String X() {
        return D;
    }

    public static void a(NLoginCore_116<?> NLoginInterface_0112, boolean bl, boolean bl2) {
        if (var_int_a != null) {
            throw new IllegalStateException((String)NLoginCore_370.c("㺀", (int)(var_int_a & var_int_b), (long)d));
        }
        int n = NLoginInterface_0112.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b ? e : f;
        String string = NLoginInterface_0112.q();
        var_long_m.add((arg_0, arg_1, arg_2) -> NLoginCore_370.a(n != 0, string, arg_0, arg_1, arg_2));
        String[] stringArray = new String[g];
        stringArray[NLoginCore_370.h] = NLoginCore_370.c("㺃", (int)i, (long)j);
        var_long_m.add(new NLoginCore_439(ConcurrentHashMap.newKeySet(), stringArray));
        var_int_a = (int)NLoginInterface_0112;
        D = (String)NLoginCore_370.c("㺆", (int)(k & l), (long)var_long_m) + string + (String)NLoginCore_370.c("㺉", (int)(NLoginCore_370.n & o), (long)p);
        Z = bl;
        var_boolean_aa = bl2;
    }

    private static void b() {
        int n;
        c = -3441602323112399930L;
        long l = c ^ 0x6D5E71D8ABBACA46L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(45 + 23), (byte)(40 + 29), (byte)(77 + 6), (byte)(36 + 11), (byte)(51 + 16), (byte)(15 + 51), 67, (byte)(26 + 21), 80, (byte)(20 + 55), (byte)(54 + 13), (byte)(26 + 57), (byte)(47 + 6), (byte)(39 + 41), (byte)(81 + 16), (byte)(61 + 39), (byte)(7 + 93), (byte)(46 + 59), (byte)(31 + 79), (byte)(69 + 34)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(38 + 31), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_370.var_java_lang_String_arr_b[0] = NLoginCore_384.E("ֈՅէ՛Ճծզիծ՜՛ՒֈՐՏաՙ֋֏՚լ֛շՠ֎յ֢փպշաս", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[1] = NLoginCore_201.F("ՠդպվո՞֋ձք֏ճ՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[2] = NLoginCore_110.E("ԻՁ՝վբլ՟ռծՊՊ՘", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[3] = NLoginCore_223.D("ԢԁԗԌԩԂԨԨӤԪԐӹ", (byte)84, 68);
                    NLoginCore_370.var_java_lang_String_arr_b[4] = NLoginCore_027.F("ԻՁ՝վբլ՟ռծՊՊ՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[5] = NLoginCore_223.A("ŜŸƙŞųůųŠƅťƨů", (byte)84, 65);
                    NLoginCore_370.var_java_lang_String_arr_b[6] = NLoginCore_138.F("ՅաւՇ՜՘՜ՉծՎ֑՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ԖԩӺԆӬԤԁӺԐԳӼӹ", (byte)84, 67);
                    NLoginCore_370.var_java_lang_String_arr_b[8] = NLoginCore_027.C("ӺԇԫԙԇԞӭӺԟԛԀӹ", (byte)84, 67);
                    NLoginCore_370.var_java_lang_String_arr_b[9] = NLoginCore_004.E("ՙզ֊ոզսՌՙվպ՟՘", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[10] = NLoginCore_201.A("ƌƟŰżŢƚŷŰƆƩŲů", (byte)84, 65);
                    NLoginCore_370.var_java_lang_String_arr_b[11] = NLoginCore_575.E("ն՞փՌՄպ՜՞գ֒գ՘", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[12] = NLoginCore_201.C("ԩӦԈӼӤԏԇԌԏӽӿԩԞԨԌԬ԰ӴԹԛ԰ԜԳԜԋԂԎՆԳԜԿԽԦՅՃՄԍՉՏՄՄԉՊԙ", (byte)84, 67);
                    NLoginCore_370.var_java_lang_String_arr_b[13] = NLoginCore_201.E("քՄՂդ֌֊ո։՝՚ՍՎ֕շՉևք֛ն֌ս֎՘Ւ֍ա֢այբ֤֚", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[14] = NLoginCore_091.B("ŶƑƚšůŶţůŲƖƊů", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[15] = NLoginCore_384.F("՝օփՖթՍ՞աՇզՊ֒֔֎ւՑփ֐ֈխէ֜գդ", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[16] = NLoginCore_223.D("ԒӥӶԇԯԥӼԀԦԢԎӱԳԫԵԨԋԘӮԯӼԍԾӺԳԁԲՁԀԐԢԪՄԻԖԝՆԿԇՌԑՉՊՇԠԏԗԣԹՓԽ՝ԞԾՙԯԭԸԮ԰՝՘ՐԤգԡՈ՚ՍԷՊ՜հՌԳԹ", (byte)84, 68);
                    NLoginCore_370.var_java_lang_String_arr_b[17] = NLoginCore_138.B("ƑƢŻƝžƣƁƣƀƥƘů", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[18] = NLoginCore_324.A("ŞƂơřűƃƢűƦƦŧƬƍžƫƜŭƣơƊƫƣźŻ", (byte)84, 65);
                    NLoginCore_370.var_java_lang_String_arr_b[19] = NLoginCore_004.B("ƠůŜƖżťŢƖƘƨŶů", (byte)84, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_370.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƟŜžŲŚƅŽƂƅųŲũƟŧŦŸŰƢƦűƃƣƐƣŴƂƊƤƮƻƊƝ", (byte)84, 65);
                    NLoginCore_370.var_java_lang_String_arr_b[1] = NLoginCore_384.B("ƜƕŸŵžƥƇƛƢƜƆƞƙŻƮƚƌƑűƴƀƍźŻ", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ӧԇԩӼԊԗԨԫԐԌԞӹ", (byte)84, 68);
                    NLoginCore_370.var_java_lang_String_arr_b[3] = NLoginCore_091.F("ՀՈԽՖոՅՋՊևօՊ՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[4] = NLoginCore_453.E("Ւթֆջ՚ՠզտպևօ՘", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[5] = NLoginCore_387.D("ӥӨԬԜԇӹӻԤӪԛԢӹ", (byte)84, 68);
                    NLoginCore_370.var_java_lang_String_arr_b[6] = NLoginCore_201.B("ŲơƜŮƙţƃƏųƙťů", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[7] = NLoginCore_223.B("ƞƍżřųƂűŰŚƅƂů", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[8] = NLoginCore_451.A("ŻžƜƚųƐŠŴƟƨƨů", (byte)84, 65);
                    NLoginCore_370.var_java_lang_String_arr_b[9] = NLoginCore_004.D("ӠԤԡԁӨӺԥԒӯԓԔӹ", (byte)84, 68);
                    NLoginCore_370.var_java_lang_String_arr_b[10] = NLoginCore_201.B("ƉƚƗŞƃƎƞƚżƢƨů", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[11] = NLoginCore_027.F("ջդ֋ՔպՖժ՝կց֑՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[12] = NLoginCore_451.E("ֈՅէ՛Ճծզիծ՜՞ֈսևի֋֏Փ֘պ֏ջ֒ջժախ֥֒ջ֞֜չեի֢֭֞զ֟ֈ֟֓ո", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[13] = NLoginCore_110.F("քՄՂդ֌֊ո։՝՚ՍՎ֕շՉևք֛ն֌ս֐֔՘՟֖֕լ֔՞դ֑", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[14] = NLoginCore_223.F("֊ռ՘իՊ՗ծ՛թֆՉՊՠՓդՊխփձ֖ն֌գդ", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[15] = NLoginCore_076.C("ӾԦԤӷԊӮӿԂӨԇӬԳӳԓԪԂԫԶԲԺ԰ՀԪԵԑՀӿԞԢՈԩԹ", (byte)84, 67);
                    NLoginCore_370.var_java_lang_String_arr_b[16] = NLoginCore_387.B("ƈśŬŽƥƛŲŶƜƘƄŧƩơƫƞƁƎŤƥŲƃƴŰƩŷƨƷŶƆƘƠƺƱƌƓƼƵŽǂƇƿǀƽƖƅƍƙƯǉƳǓƔƴǏƥƣƮƤƦǓǎǆƚƟƷƝǁǍǛƯƥơǧǔƯ", (byte)84, 66);
                    NLoginCore_370.var_java_lang_String_arr_b[17] = NLoginCore_091.F("ՄՒ։էե֊֏֏՝Չ֍՘", (byte)84, 70);
                    NLoginCore_370.var_java_lang_String_arr_b[18] = NLoginCore_387.E("Շի֊Ղ՚լ֋՚֏֏ՐՋ֕֒֍֒֙Ռօնչ֜գդ", (byte)84, 69);
                    NLoginCore_370.var_java_lang_String_arr_b[19] = NLoginCore_201.B("ƗšŘŜųƘƇơŰƦƠů", (byte)84, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_370.var_java_lang_String_arr_b[0] = NLoginCore_027.F("ժճՕ՛ՕխֆտՎ֊վխզ֊֓աը֚կյձզգդ", (byte)84, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_370.var_java_lang_String_arr_b[0] = NLoginCore_387.E("՞ը։ՈՕքխպջՐռՠժ֏ֈՠֆՒշ՜֋ո֏֘֌֋֐֐աղ֕մ", (byte)84, 69);
                }
            }
        }
    }

    public static void d(File file) {
        if (var_java_io_PrintWriter_a != null) {
            throw new IllegalStateException((String)NLoginCore_370.c("㺀", (int)ba, (long)(bb ^ bc)));
        }
        if (!NLoginCore_366.b(file)) {
            throw new IOException((String)NLoginCore_370.c("㺃", (int)bd, (long)(be ^ bf)) + file.getPath() + (String)NLoginCore_370.c("㺆", (int)bg, (long)(bh ^ bi)));
        }
        var_java_io_PrintWriter_a = NLoginCore_294.a(file, StandardCharsets.UTF_8, bj != 0);
    }

    static {
        var_int_a = 0 >>> 173 | 0 << ~173 + 1;
        var_int_b = (-1 >>> 214 | -1 << -214) & 0xFFFFFFFF;
        d = Long.reverse(5320894210480487435L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (0 >>> 35 | 0 << -35) & 0xFFFFFFFF;
        g = 2048 >>> 107 | 2048 << ~107 + 1;
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Long.reverse(5320894210480487435L);
        k = (256 >>> 103 | 256 << -103) & 0xFFFFFFFF;
        l = Integer.reverse(-1);
        var_long_m = Long.reverse(5320894210480487435L);
        n = (393216 >>> 177 | 393216 << -177) & 0xFFFFFFFF;
        o = -1 >>> 223 | -1 << ~223 + 1;
        p = Long.reverse(5320894210480487435L);
        q = (0 >>> 67 | 0 << -67) & 0xFFFFFFFF;
        r = (256 >>> 8 | 256 << -8) & 0xFFFFFFFF;
        s = 0 >>> 31 | 0 << -31;
        t = (0x20000000 >>> 29 | 0x20000000 << -29) & 0xFFFFFFFF;
        u = Integer.reverse(0);
        v = (0x20000000 >>> 221 | 0x20000000 << -221) & 0xFFFFFFFF;
        w = Integer.reverse(0);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = 0x8000000 >>> 219 | 0x8000000 << -219;
        z = (0 >>> 24 | 0 << ~24 + 1) & 0xFFFFFFFF;
        var_int_aa = 0 >>> 102 | 0 << -102;
        var_int_ab = (0x2000000 >>> 153 | 0x2000000 << ~153 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(Integer.MIN_VALUE);
        ad = (0x100000 >>> 242 | 0x100000 << -242) & 0xFFFFFFFF;
        ae = Long.reverse(7194391655466613771L);
        af = Long.reverse(0x2A00000000000000L);
        ag = (0x280000 >>> 19 | 0x280000 << -19) & 0xFFFFFFFF;
        ah = -1 >>> 225 | -1 << ~225 + 1;
        ai = Long.reverse(5320894210480487435L);
        aj = Integer.reverse(0x60000000);
        ak = Long.reverse(7194391655466613771L);
        al = Long.reverse(0x2A00000000000000L);
        am = (0x3800000 >>> 215 | 0x3800000 << ~215 + 1) & 0xFFFFFFFF;
        an = Long.reverse(5320894210480487435L);
        ao = Integer.reverse(0x10000000);
        ap = Long.reverse(7194391655466613771L);
        aq = Long.reverse(0x2A00000000000000L);
        ar = 0x240000 >>> 242 | 0x240000 << -242;
        as = Long.reverse(5320894210480487435L);
        at = (0xA00000 >>> 244 | 0xA00000 << ~244 + 1) & 0xFFFFFFFF;
        au = (-1 >>> 29 | -1 << -29) & 0xFFFFFFFF;
        av = Long.reverse(5320894210480487435L);
        aw = Integer.reverse(-805306368);
        ax = Long.reverse(7194391655466613771L);
        ay = Long.reverse(0x2A00000000000000L);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = (12 >>> 192 | 12 << -192) & 0xFFFFFFFF;
        bb = Long.reverse(7194391655466613771L);
        bc = Long.reverse(0x2A00000000000000L);
        bd = 832 >>> 134 | 832 << -134;
        be = Long.reverse(7194391655466613771L);
        bf = Long.reverse(0x2A00000000000000L);
        bg = Integer.reverse(0x70000000);
        bh = Long.reverse(7194391655466613771L);
        bi = Long.reverse(0x2A00000000000000L);
        bj = (0 >>> 120 | 0 << ~120 + 1) & 0xFFFFFFFF;
        bk = Integer.reverse(-268435456);
        bl = Long.reverse(7194391655466613771L);
        bm = Long.reverse(0x2A00000000000000L);
        bn = Integer.reverse(0x8000000);
        bo = Long.reverse(5320894210480487435L);
        bp = (32 >>> 165 | 32 << ~165 + 1) & 0xFFFFFFFF;
        bq = Integer.reverse(-2013265920);
        br = -1 >>> 47 | -1 << -47;
        bs = Long.reverse(5320894210480487435L);
        bt = 0x40000002 >>> 29 | 0x40000002 << -29;
        bu = Long.reverse(5320894210480487435L);
        bv = Integer.reverse(Integer.MIN_VALUE);
        bw = Integer.reverse(0);
        bx = Integer.reverse(0x28000000);
        by = Integer.reverse(0x28000000);
        bz = (0x26000000 >>> 153 | 0x26000000 << -153) & 0xFFFFFFFF;
        ca = (-1 >>> 106 | -1 << ~106 + 1) & 0xFFFFFFFF;
        cb = Long.reverse(5320894210480487435L);
        cc = (524288 >>> 147 | 524288 << ~147 + 1) & 0xFFFFFFFF;
        cd = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[bx];
        var_java_lang_String_arr_b = new String[by];
        NLoginCore_370.b();
        var_long_m = (long)ConcurrentHashMap.newKeySet();
        D = NLoginCore_370.c("㺀", (int)(bz & ca), (long)cb);
        Z = cc;
        var_boolean_aa = cd;
    }
}

