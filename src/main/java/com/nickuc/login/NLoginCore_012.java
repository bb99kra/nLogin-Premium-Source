/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.bukkit.Bukkit
 *  org.bukkit.Server
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_598;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_089;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_114;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class NLoginCore_012 {
    private static long x;
    private static long an;
    private static int r;
    private static int al;
    private static long var_long_j;
    private static int bd;
    private static final Method var_java_lang_reflect_Method_j;
    private static int d;
    private static int as;
    private static NLoginCore_089 var_com_nickuc_login_NLoginCore_089_a;
    private static int ay;
    private static long aq;
    private static int var_int_b;
    private static long ah;
    private static int ba;
    private static int ap;
    private static long ar;
    private static long s;
    private static long ax;
    private static long bf;
    private static long ag;
    private static int ai;
    private static int e;
    private static int ac;
    private static int var_int_i;
    private static long o;
    private static int ae;
    private static int var_int_f;
    private static int av;
    private static int v;
    private static long var_long_c;
    private static long g;
    private static int u;
    private static int m;
    private static long at;
    private static final boolean P;
    private static int ad;
    private static int var_int_c;
    private static int be;
    private static long bi;
    private static int y;
    private static long am;
    private static long h;
    private static int ab;
    private static int n;
    private static long bb;
    private static final Method var_java_lang_reflect_Method_i;
    private static int q;
    private static long var_long_k;
    private static final Field var_java_lang_reflect_Field_f;
    private static int az;
    private static long aw;
    private static int af;
    private static int ak;
    private static final Method var_java_lang_reflect_Method_k;
    private static int ao;
    private static int p;
    private static long t;
    private static String[] var_java_lang_String_arr_b;
    private static int aj;
    private static long aa;
    private static long z;
    private static int bg;
    private static long bh;
    private static int var_int_a;
    private static int bc;
    private static int l;
    private static long w;
    private static String[] var_java_lang_String_arr_a;
    private static long au;

    public static Collection<? extends Player> d() {
        if (var_java_lang_reflect_Method_i == null) {
            return Bukkit.getServer().getOnlinePlayers();
        }
        try {
            return NLoginCore_114.a((Player[])var_java_lang_reflect_Method_i.invoke((Object)Bukkit.getServer(), new Object[e]));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_012.c("㺀", (int)var_int_f, (long)(g ^ h)), reflectiveOperationException);
        }
    }

    public static boolean V() {
        return P;
    }

    public static void c(Consumer<NLoginCore_598> consumer) {
        var_com_nickuc_login_NLoginCore_089_a.b(var_int_c != 0).a(consumer);
    }

    public static boolean T() {
        try {
            return (var_java_lang_reflect_Field_f != null && var_java_lang_reflect_Field_f.getBoolean(null) ? p : q) != 0;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_012.c("㺀", (int)r, (long)(s ^ t)), reflectiveOperationException);
        }
    }

    public static void b(Consumer<NLoginCore_598> consumer) {
        var_com_nickuc_login_NLoginCore_089_a.b(var_int_a != 0).a(consumer);
    }

    public static void b(Runnable runnable) {
        var_com_nickuc_login_NLoginCore_089_a.b(d != 0).a(runnable);
    }

    public static CompletableFuture<Void> a(Player player, String string) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (!player.isOnline()) {
            completableFuture.complete(null);
        } else if (Bukkit.getServer().isPrimaryThread()) {
            player.kickPlayer(string);
            completableFuture.complete(null);
        } else {
            NLoginCore_012.a(() -> {
                player.kickPlayer(string);
                completableFuture.complete(null);
            });
        }
        return completableFuture;
    }

    private static String a(int n, long l) {
        l ^= 0xBL;
        l ^= 0xDDEB33A81097AF0L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(29 + 40), (byte)(44 + 39), (byte)(14 + 33), (byte)(22 + 45), (byte)(46 + 20), 67, (byte)(36 + 11), (byte)(34 + 46), (byte)(50 + 25), (byte)(57 + 10), 83, (byte)(50 + 3), (byte)(47 + 33), (byte)(32 + 65), (byte)(81 + 19), (byte)(32 + 68), (byte)(5 + 100), (byte)(103 + 7), (byte)(25 + 78)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.E("ՕբաԤդՠ՛դկ՞ԫթխզթկԱ࢖࣋࣊࣎ࣇ࣑ࢬ࣌ࢫࣆࣀࣄࢵ", (byte)54, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_012.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static void a(NLoginCore_089 NLoginCore_0892) {
        var_com_nickuc_login_NLoginCore_089_a = NLoginCore_0892;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_012.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.D("җҹһқҿӞӖӬӘҧӥӛөӣҬӑӳӲӪӰӪҿ", (byte)62, 68), NLoginCore_012.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.A("ŞūŪĭŭũŤŭŸŧĴŲŶůŲŸĺҟӔӓӗӐӚҵӕҴӏӉӍҾœ", (byte)62, 65) + string + NLoginCore_027.E("Դ", (byte)62, 69) + methodType.toString(), exception);
        }
    }

    static {
        AnnotatedElement annotatedElement;
        var_int_a = (0 >>> 150 | 0 << ~150 + 1) & 0xFFFFFFFF;
        var_int_b = (0 >>> 241 | 0 << ~241 + 1) & 0xFFFFFFFF;
        var_int_c = (2 >>> 1 | 2 << ~1 + 1) & 0xFFFFFFFF;
        d = 512 >>> 41 | 512 << -41;
        e = (0 >>> 158 | 0 << -158) & 0xFFFFFFFF;
        var_int_f = 0 >>> 114 | 0 << ~114 + 1;
        g = Long.reverse(5712255138328590897L);
        h = Long.reverse(-3458764513820540928L);
        var_int_i = 128 >>> 71 | 128 << -71;
        var_long_j = Long.reverse(5712255138328590897L);
        var_long_k = Long.reverse(-3458764513820540928L);
        l = 0 >>> 122 | 0 << ~122 + 1;
        m = Integer.reverse(0);
        n = (128 >>> 166 | 128 << ~166 + 1) & 0xFFFFFFFF;
        o = Long.reverse(-6969881412346725839L);
        p = Integer.reverse(Integer.MIN_VALUE);
        q = Integer.reverse(0);
        r = Integer.reverse(-1073741824);
        s = Long.reverse(5712255138328590897L);
        t = Long.reverse(-3458764513820540928L);
        u = Integer.reverse(0);
        v = (4096 >>> 42 | 4096 << ~42 + 1) & 0xFFFFFFFF;
        w = Long.reverse(5712255138328590897L);
        x = Long.reverse(-3458764513820540928L);
        y = Integer.reverse(-1610612736);
        z = Long.reverse(5712255138328590897L);
        aa = Long.reverse(-3458764513820540928L);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = Integer.reverse(0);
        ad = 458752 >>> 111 | 458752 << -111;
        ae = 0x38000000 >>> 186 | 0x38000000 << ~186 + 1;
        af = Integer.reverse(0x60000000);
        ag = Long.reverse(5712255138328590897L);
        ah = Long.reverse(-3458764513820540928L);
        ai = Integer.reverse(0);
        aj = (4 >>> 226 | 4 << ~226 + 1) & 0xFFFFFFFF;
        ak = Integer.reverse(0);
        al = Integer.reverse(-536870912);
        am = Long.reverse(5712255138328590897L);
        an = Long.reverse(-3458764513820540928L);
        ao = Integer.reverse(0);
        ap = (512 >>> 166 | 512 << ~166 + 1) & 0xFFFFFFFF;
        aq = Long.reverse(5712255138328590897L);
        ar = Long.reverse(-3458764513820540928L);
        as = 1152 >>> 167 | 1152 << ~167 + 1;
        at = Long.reverse(5712255138328590897L);
        au = Long.reverse(-3458764513820540928L);
        av = Integer.reverse(0x50000000);
        aw = Long.reverse(5712255138328590897L);
        ax = Long.reverse(-3458764513820540928L);
        ay = 0 >>> 222 | 0 << -222;
        az = 0x160000 >>> 81 | 0x160000 << -81;
        ba = -1 >>> 182 | -1 << -182;
        bb = Long.reverse(-6969881412346725839L);
        bc = Integer.reverse(0);
        bd = 3 >>> 190 | 3 << -190;
        be = Integer.reverse(-1);
        bf = Long.reverse(-6969881412346725839L);
        bg = (0x1A0000 >>> 209 | 0x1A0000 << -209) & 0xFFFFFFFF;
        bh = Long.reverse(5712255138328590897L);
        bi = Long.reverse(-3458764513820540928L);
        var_java_lang_String_arr_a = new String[ad];
        var_java_lang_String_arr_b = new String[ae];
        NLoginCore_012.b();
        P = NLoginCore_546.a(Bukkit.class, (String)NLoginCore_012.c("㺀", (int)af, (long)(ag ^ ah)), new Class[ai]) != null ? aj : ak;
        Method method = null;
        try {
            Bukkit.getServer().getOnlinePlayers();
        }
        catch (Throwable throwable) {
            try {
                method = Server.class.getMethod((String)NLoginCore_012.c("㺃", (int)al, (long)(am ^ an)), new Class[ao]);
            }
            catch (Throwable throwable2) {
                throw new UnsupportedOperationException((String)NLoginCore_012.c("㺆", (int)ap, (long)(aq ^ ar)), throwable2);
            }
        }
        var_java_lang_reflect_Method_i = method;
        Method method2 = null;
        Method method3 = null;
        try {
            annotatedElement = Class.forName((String)NLoginCore_012.c("㺉", (int)as, (long)(at ^ au)));
            method3 = Server.class.getMethod((String)NLoginCore_012.c("㺌", (int)av, (long)(aw ^ ax)), new Class[ay]);
            method2 = annotatedElement.getMethod((String)NLoginCore_012.c("㺏", (int)(az & ba), (long)bb), new Class[bc]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        var_java_lang_reflect_Method_k = method3;
        var_java_lang_reflect_Method_j = method2;
        try {
            Class<?> clazz = Class.forName((String)NLoginCore_012.c("㺒", (int)(bd & be), (long)bf));
            annotatedElement = clazz.getField((String)NLoginCore_012.c("㺕", (int)bg, (long)(bh ^ bi)));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            annotatedElement = null;
        }
        var_java_lang_reflect_Field_f = annotatedElement;
    }

    public static UUID b(String string) {
        return UUID.nameUUIDFromBytes(((String)NLoginCore_012.c("㺀", (int)var_int_i, (long)(var_long_j ^ var_long_k)) + string).getBytes(StandardCharsets.UTF_8));
    }

    public static void a(Runnable runnable) {
        var_com_nickuc_login_NLoginCore_089_a.b(var_int_b != 0).a(runnable);
    }

    @Nullable
    public static YamlConfiguration a() {
        if (var_java_lang_reflect_Method_k == null || var_java_lang_reflect_Method_j == null) {
            return null;
        }
        try {
            Object object = var_java_lang_reflect_Method_k.invoke((Object)Bukkit.getServer(), new Object[l]);
            return (YamlConfiguration)var_java_lang_reflect_Method_j.invoke(object, new Object[m]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            if (reflectiveOperationException.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new RuntimeException((String)NLoginCore_012.c("㺀", (int)n, (long)o), reflectiveOperationException);
        }
    }

    private static void b() {
        int n;
        var_long_c = -8332329698868567310L;
        long l = var_long_c ^ 0xDDEB33A81097AF0L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(4 + 65), 83, (byte)(38 + 9), (byte)(46 + 21), 66, (byte)(41 + 26), (byte)(11 + 36), (byte)(62 + 18), (byte)(33 + 42), (byte)(61 + 6), (byte)(61 + 22), (byte)(8 + 45), (byte)(32 + 48), (byte)(37 + 60), (byte)(92 + 8), (byte)(92 + 8), (byte)(83 + 22), (byte)(32 + 78), (byte)(17 + 86)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(32 + 37), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_012.var_java_lang_String_arr_b[0] = NLoginCore_076.D("ՓՏյՋձ՛լԹՅ԰լՐաՐքչցֆԾառ՜՟գտնծհ֎ծռթէ֓ՕըՕ֊֍֊՚֝֝լցլւջբ֢ավ֪ւկհ", (byte)109, 68);
                    NLoginCore_012.var_java_lang_String_arr_b[1] = NLoginCore_384.D("ծ԰ԲՇլՋ՘ՙԻհՇՊՖցռԻղՅւզՆբՏՐ", (byte)109, 68);
                    NLoginCore_012.var_java_lang_String_arr_b[2] = NLoginCore_201.E("֋ս֕կ֓ե֛֖֡֗տշ֝ե֮֡լևֲ֣ըկր֙֎չջֻֻ֚֚֨֔֫֜֐֯ց֢֧֠֠ք׊֞ցֱ֮דֽ֠ב֪֟֜֝", (byte)109, 69);
                    NLoginCore_012.var_java_lang_String_arr_b[3] = NLoginCore_575.C("՞ՐըՂզԸծմժթՐՈՌ՘՘՝գՃ՝ւգքնւՊ՝քժ՝Ցծ֑֊խտ֒շ֐ՙՙՏըկդ", (byte)109, 67);
                    NLoginCore_012.var_java_lang_String_arr_b[4] = NLoginCore_453.A("ƤǄƫƦƕǑƨǙƹƵƕƼƿǠǍǖƭǡƻƳǂǥƧǙƽǕǪǌƫƷǁƱǓƽƯǥƲǟǧǉƬǍǘƷƵƶǚǩǁǌǠǤǶǵǌǍ", (byte)109, 65);
                    NLoginCore_012.var_java_lang_String_arr_b[5] = NLoginCore_091.A("ƈǁƞƑǂǏǂƫǐǅǕƖǆǘǎƫǜƫƢƢǧǕǄƣƧƫǘǠǏǃǩǦǞǋǟƬǧǰƸǅƵǨǦǁ", (byte)109, 65);
                    NLoginCore_012.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ՋՔՇԶյՇոյվ՘՗լչհԵ՜ՖսկսյՒՈ՟֊ժւՊ֌ՋՋՊվղՉբչօռՔ֚թտդ", (byte)109, 68);
                    NLoginCore_012.var_java_lang_String_arr_b[7] = NLoginCore_173.B("ƩƧǏǅǍƭƲƮǚǈǈƩƬǕƨǏǗƼưǆƽƯƦƩǠǂǪǥƿǩǑƱ", (byte)109, 66);
                    NLoginCore_012.var_java_lang_String_arr_b[8] = NLoginCore_076.F("չշ֟֕֝սւվ֪֘֘չռ֥ո֧֟֌ր֖֍֍֌֙ֈջ֌կվ֩չ֏֫֍ְ֢֕֓׃ּ֜֡֋֑", (byte)109, 70);
                    NLoginCore_012.var_java_lang_String_arr_b[9] = NLoginCore_223.E("բ֋լ֐ծ֟֝շ֥֙֕֩֕պզ֎֦կֲֵ֮֒ո֯փָ֍ֵֹչִַָյִֿׂ֛֟֓׉ֶ֑֬", (byte)109, 69);
                    NLoginCore_012.var_java_lang_String_arr_b[10] = NLoginCore_027.C("ԬբԱյյկԻՐկԾձՄ", (byte)109, 67);
                    NLoginCore_012.var_java_lang_String_arr_b[11] = NLoginCore_559.B("ƜǐǑƭƫǘƑƸƣƓǆƫƩǞƲƼǛǎǘƶǗƿƬƭ", (byte)109, 66);
                    NLoginCore_012.var_java_lang_String_arr_b[12] = NLoginCore_223.E("ղճ՝՟գ֜ն֝գբ֤֜իպ֏֟֓։ւֳ֦֢֔ք֤֎ַ֙֜ֈ־֭֝ւְֻֻ֖ֈքֻւ֤֑", (byte)109, 69);
                    NLoginCore_012.var_java_lang_String_arr_b[13] = NLoginCore_027.A("ǈǌƏƱƾƶơƳǛǈƬơ", (byte)109, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_012.var_java_lang_String_arr_b[0] = NLoginCore_138.F("րռ֢ո֞ֈ֙զղ՝֙ս֎սֱֳ֦֮ի֎֩։֌֐ֻ֣֛֛֖֬֝֩֔׀ւ֕ւַַֺև׊׋ׂ֖֥֢֭֬֏׍֋֡֟֜֝", (byte)109, 70);
                    NLoginCore_012.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ծ԰ԲՇլՋ՘ՙԻհՈ՝Ձՠջմքհ՜նՄճըՂՊՄ՝ՠդ֐ս։", (byte)109, 67);
                    NLoginCore_012.var_java_lang_String_arr_b[2] = NLoginCore_201.B("ƻƭǅƟǃƕǋǑǇǆƯƧǍƕǑǞƜƷǢǓƘƟưǉƾƩƫǫǊǘǄǛǌǊǫǀǟƱǒǐǗǐƶǧƷǗǀǮǰǓǘǡǧȅǌǍ", (byte)109, 66);
                    NLoginCore_012.var_java_lang_String_arr_b[3] = NLoginCore_138.F("֋ս֕կ֓ե֛֖֡֗սյչօօ֊֐հ֊֯֐ֱ֣֯շ֊ֱ֗֊վ֛־ֺ֌֏ׂ׃ֶ֞֕׆֔׃׀ևև׈֏ׁ֡֠׏ׅ֒֜֝", (byte)109, 70);
                    NLoginCore_012.var_java_lang_String_arr_b[4] = NLoginCore_110.F("մ֔ջնե֡ո֩։օե֌֏ְ֦֝սֱ֋փֵ֒շ֩֍ֺ֥֜ջև֑ց֣֍տֵւַ֯֙ռׁ֛֭֝֨֞׉ֲ׋׃ג֡ו֜֝", (byte)109, 70);
                    NLoginCore_012.var_java_lang_String_arr_b[5] = NLoginCore_453.E("՘֑ծա֒֟֒ջ֥֠֕զ֖֨֞ջ֬ջղղַ֥֔ճշջְֶֹ֨֟֓֐ְ֮տְքրց׊ֳ֑֘", (byte)109, 69);
                    NLoginCore_012.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ƨƱƤƓǒƤǕǒǛƵƴǉǖǍƒƹƳǚǌǚǒƯƥƼǧǇǟƧǩƨƨƧƺǰǓǪǤǢǁǫǫƲǔǁ", (byte)109, 65);
                    NLoginCore_012.var_java_lang_String_arr_b[7] = NLoginCore_138.F("չշ֟֕֝սւվ֪֘֘չռ֥ո֧֟֌ր֖֍֊ִո֊ք֕֍ֲ֦֝֕", (byte)109, 70);
                    NLoginCore_012.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ƩƧǏǅǍƭƲƮǚǈǈƩƬǕƨǏǗƼưǆƽƽƼǉƸƫƼƟƮǙƩƿǜǈǊǍƱǫǦǦǔǜǝǋǉƼǒǺǙǐǶǖƾǏǌǍ", (byte)109, 65);
                    NLoginCore_012.var_java_lang_String_arr_b[9] = NLoginCore_076.D("Ե՞ԿգՁղհՊլըռըոՍԹաչՂեօցֈՋւՖ֋ՠ֌ֈՌ֋֊֊դ֘բմֆ՗դջխիդ", (byte)109, 68);
                    NLoginCore_012.var_java_lang_String_arr_b[10] = NLoginCore_324.E("հ՟֢֥֖֚֡ֆ֒բպզ֩֩րְ֤հֲտ֦֏ռս", (byte)109, 69);
                    NLoginCore_012.var_java_lang_String_arr_b[11] = NLoginCore_324.D("ԿճմՐՎջԴ՛ՆԶլՀԾՕԿՄխղբՄՖՄՁցՆՠհ֌֍Ս՝՟", (byte)109, 68);
                    NLoginCore_012.var_java_lang_String_arr_b[12] = NLoginCore_453.A("ƢƣƍƏƓǌƦǍƓƒǌǔƛƪƿǏǃƹƲǖǣǄǒƴǔƾǉǧǌƸǮǝǲǮǂǦǦƭƶǆǇǜƷǁ", (byte)109, 65);
                    NLoginCore_012.var_java_lang_String_arr_b[13] = NLoginCore_027.C("ՉՆՒՕՉջծՏհ՟ՇՀԽՏՑդֆմՆտևոՏՐ", (byte)109, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_012.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ղՅաՃծիՖՒնթճՑ՚Խկբ՝կսղփպի֌օՠՙՍզխ֔բ", (byte)109, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_012.var_java_lang_String_arr_b[0] = NLoginCore_446.C("կՐՅյՒՇԳՒթճ՗Օ՗ՖտՄպՀմՇՆրսնֆ՞եզՎՐհՎ", (byte)109, 67);
                }
            }
        }
    }

    public static boolean U() {
        YamlConfiguration yamlConfiguration = NLoginCore_012.a();
        if (yamlConfiguration == null) {
            return u != 0;
        }
        return (yamlConfiguration.getBoolean((String)NLoginCore_012.c("㺀", (int)v, (long)(w ^ x))) || yamlConfiguration.getBoolean((String)NLoginCore_012.c("㺃", (int)y, (long)(z ^ aa))) ? ab : ac) != 0;
    }
}

