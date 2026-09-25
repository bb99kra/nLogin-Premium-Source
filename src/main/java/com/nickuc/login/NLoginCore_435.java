/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.connection.PendingConnection
 *  net.md_5.bungee.api.event.LoginEvent
 *  net.md_5.bungee.connection.InitialHandler
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_298;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.connection.InitialHandler;

public class NLoginCore_435 {
    private static long var_long_p;
    private static int var_int_a;
    private static int x;
    private static long var_long_s;
    private static int af;
    private static long var_long_c;
    private static int ah;
    private static long az;
    private static int bh;
    private static int ao;
    private static int j;
    private static int ag;
    private static int am;
    private static long w;
    private static long bd;
    private static int ar;
    private static int bf;
    private static int var_int_r;
    private static int ax;
    private static String[] var_java_lang_String_arr_b;
    private static int e;
    private static long t;
    private static long bb;
    private static long ay;
    private static long g;
    private static int bi;
    private static long ai;
    private static int ae;
    private static final Field var_java_lang_reflect_Field_s;
    private static int var_int_c;
    private static int bc;
    private static int ad;
    private static String[] var_java_lang_String_arr_a;
    private static long z;
    private static long l;
    private static long aj;
    private static final Field var_java_lang_reflect_Field_r;
    private static long at;
    private static int aq;
    private static int var_int_b;
    private static long be;
    private static final Field var_java_lang_reflect_Field_o;
    private static int i;
    private static int ba;
    private static int al;
    private static final Field var_java_lang_reflect_Field_q;
    private static int y;
    private static final Field var_java_lang_reflect_Field_p;
    private static long k;
    private static long d;
    private static final Class<?> var_java_lang_Class____o;
    private static int var_int_q;
    private static int aw;
    private static int h;
    private static long bg;
    private static int ab;
    private static int m;
    private static long f;
    private static int aa;
    private static long var_long_o;
    private static long ap;
    private static long ac;
    private static long au;
    private static int ak;
    private static int n;
    private static int u;
    private static int as;
    private static int v;
    private static int an;
    private static int av;

    static void a(PendingConnection pendingConnection, String string) {
        if (string == null) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺀", (int)n, (long)(var_long_o ^ var_long_p)));
        }
        if (string.length() > var_int_q) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺃", (int)var_int_r, (long)(var_long_s ^ t)) + string);
        }
        if (!pendingConnection.getName().equals(string)) {
            var_java_lang_reflect_Field_o.set(pendingConnection, string);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6BL;
        l ^= 0xCF81D6156CB0B373L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(15 + 53), 69, 83, (byte)(24 + 23), (byte)(30 + 37), (byte)(56 + 10), (byte)(43 + 24), (byte)(21 + 26), (byte)(73 + 7), (byte)(41 + 34), (byte)(26 + 41), (byte)(10 + 73), (byte)(26 + 27), (byte)(71 + 9), (byte)(59 + 38), (byte)(40 + 60), (byte)(4 + 96), (byte)(41 + 64), (byte)(24 + 86), (byte)(74 + 29)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_559.C("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼࡱࢀࢁࢆ࢐࢑ࢇࢗ", (byte)88, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_435.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (64 >>> 6 | 64 << -6) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(-1);
        d = Long.reverse(4340861630701218378L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-1567861080408872374L);
        g = Long.reverse(-3026418949592973312L);
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(0x40000000);
        k = Long.reverse(-1567861080408872374L);
        l = Long.reverse(-3026418949592973312L);
        m = Integer.reverse(0);
        n = Integer.reverse(-1073741824);
        var_long_o = Long.reverse(-1567861080408872374L);
        var_long_p = Long.reverse(-3026418949592973312L);
        var_int_q = 1 >>> 60 | 1 << ~60 + 1;
        var_int_r = Integer.MIN_VALUE >>> 61 | Integer.MIN_VALUE << -61;
        var_long_s = Long.reverse(-1567861080408872374L);
        t = Long.reverse(-3026418949592973312L);
        u = (0x50000000 >>> 60 | 0x50000000 << -60) & 0xFFFFFFFF;
        v = Integer.reverse(-1);
        w = Long.reverse(4340861630701218378L);
        x = -2147483647 >>> 126 | -2147483647 << ~126 + 1;
        y = -1 >>> 208 | -1 << ~208 + 1;
        z = Long.reverse(4340861630701218378L);
        aa = Integer.reverse(-536870912);
        ab = Integer.reverse(-1);
        ac = Long.reverse(4340861630701218378L);
        ad = (8 >>> 195 | 8 << ~195 + 1) & 0xFFFFFFFF;
        ae = 0 >>> 125 | 0 << ~125 + 1;
        af = (491520 >>> 175 | 491520 << ~175 + 1) & 0xFFFFFFFF;
        ag = Integer.reverse(-268435456);
        ah = 0x200000 >>> 82 | 0x200000 << ~82 + 1;
        ai = Long.reverse(-1567861080408872374L);
        aj = Long.reverse(-3026418949592973312L);
        ak = (0 >>> 59 | 0 << -59) & 0xFFFFFFFF;
        al = Integer.reverse(Integer.MIN_VALUE);
        am = Integer.reverse(0);
        an = Integer.reverse(-1879048192);
        ao = Integer.reverse(-1);
        ap = Long.reverse(4340861630701218378L);
        aq = 4096 >>> 236 | 4096 << ~236 + 1;
        ar = 0 >>> 191 | 0 << -191;
        as = Integer.reverse(0x50000000);
        at = Long.reverse(-1567861080408872374L);
        au = Long.reverse(-3026418949592973312L);
        av = (0x400000 >>> 246 | 0x400000 << -246) & 0xFFFFFFFF;
        aw = Integer.reverse(0);
        ax = 2816 >>> 168 | 2816 << ~168 + 1;
        ay = Long.reverse(-1567861080408872374L);
        az = Long.reverse(-3026418949592973312L);
        ba = Integer.reverse(0x30000000);
        bb = Long.reverse(4340861630701218378L);
        bc = Integer.reverse(-1342177280);
        bd = Long.reverse(-1567861080408872374L);
        be = Long.reverse(-3026418949592973312L);
        bf = (-536870912 >>> 156 | -536870912 << -156) & 0xFFFFFFFF;
        bg = Long.reverse(4340861630701218378L);
        bh = Integer.reverse(0);
        bi = 0 >>> 243 | 0 << ~243 + 1;
        var_java_lang_String_arr_a = new String[af];
        var_java_lang_String_arr_b = new String[ag];
        NLoginCore_435.b();
        var_java_lang_reflect_Field_o = NLoginCore_298.a((String)NLoginCore_435.c("㺀", (int)ah, (long)(ai ^ aj)), new String[ak]);
        String[] stringArray = new String[al];
        stringArray[NLoginCore_435.am] = NLoginCore_435.c("㺃", (int)(an & ao), (long)ap);
        var_java_lang_reflect_Field_o = NLoginCore_546.a(InitialHandler.class, stringArray);
        String[] stringArray2 = new String[aq];
        stringArray2[NLoginCore_435.ar] = NLoginCore_435.c("㺆", (int)as, (long)(at ^ au));
        var_java_lang_reflect_Field_p = NLoginCore_546.a(InitialHandler.class, stringArray2);
        String[] stringArray3 = new String[av];
        stringArray3[NLoginCore_435.aw] = NLoginCore_435.c("㺉", (int)ax, (long)(ay ^ az));
        var_java_lang_reflect_Field_q = NLoginCore_546.a(InitialHandler.class, stringArray3);
        Object object = NLoginCore_435.c("㺌", (int)ba, (long)bb);
        if (var_java_lang_reflect_Field_o == null) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺏", (int)bc, (long)(bd ^ be)));
        }
        if (var_java_lang_reflect_Field_p == null) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺒", (int)bf, (long)bg));
        }
        var_java_lang_reflect_Field_r = var_java_lang_reflect_Field_o != null ? NLoginCore_546.a(InitialHandler.class, var_java_lang_reflect_Field_o, bh) : null;
        var_java_lang_reflect_Field_s = var_java_lang_reflect_Field_r != null ? NLoginCore_546.a(var_java_lang_reflect_Field_o, UUID.class, bi) : null;
    }

    private static void b() {
        int n;
        var_long_c = 5932798437604703319L;
        long l = var_long_c ^ 0xCF81D6156CB0B373L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(30 + 38), (byte)(16 + 53), (byte)(54 + 29), 47, (byte)(35 + 32), (byte)(40 + 26), (byte)(13 + 54), (byte)(14 + 33), (byte)(12 + 68), (byte)(70 + 5), 67, (byte)(67 + 16), (byte)(18 + 35), (byte)(75 + 5), (byte)(76 + 21), (byte)(31 + 69), (byte)(23 + 77), (byte)(86 + 19), (byte)(9 + 101), (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_435.var_java_lang_String_arr_b[0] = NLoginCore_453.B("ĹŗŎľŜŹŜƃƂŃŐŔŀŇŻŹŜŸŎşŊŎőŏƀšŵŠŊţƈŔŰťƛƒƏŴŬŚŝƟŮƞƉƇƦƃƂƦƥƁƭƉŶŷ", (byte)66, 66);
                    NLoginCore_435.var_java_lang_String_arr_b[1] = NLoginCore_387.A("ŉŵŲŗŽŠųŒŐſŰŋ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[2] = NLoginCore_110.C("ӰӯӅӕӂӘҴӦӘӸҵҼӽӴӪӿӸӽӢӿӜӼӖӕԇԄӯӺԁӯӐӱӡԂԐӒԑӹӦӒӤԔӖӰӴԑԂӷԛԕԔӿԧԀԩԥԔӧԋԘԁԄԧԜԟԒԢԥӮԱԑԒӶԚӵԃ", (byte)66, 67);
                    NLoginCore_435.var_java_lang_String_arr_b[3] = NLoginCore_559.D("ҼӎӓӆӉӳӬӣӄӕӲҸԁӵӭӰԄӞҽҾӵӃԄӕӉӠԃӹӉӢԋӌ", (byte)66, 68);
                    NLoginCore_435.var_java_lang_String_arr_b[4] = NLoginCore_027.F("լՄՄՒհՑ՜ՉՉՎբռծՁՂՂՀ՟ՇՊջլՍՅ՜զւկքի֑֎ճՔխ֓թմ֏յ֌հրծ֎ղկ֛կՠ֣֟֘մձղ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[5] = NLoginCore_575.D("ӝӊӖүҶҷҴӰӜӘӺҾҶӲӡӺӰӀԃӧӿӁӾӦӠӍӷԐԆӧӤөԕӡӖӦӓԍӬӪӯԑӾӣ", (byte)66, 68);
                    NLoginCore_435.var_java_lang_String_arr_b[6] = NLoginCore_027.A("ŤŋŗůōşŊźŤŀŽłŝŝœŤƃŷŗŗƏŚŌţőšťŉƄƂŗƖŵŮƟƒŚƢƗšƥŜŸŞŴŵƨũƅƝƁƆƦƞƋƅŰƵƍƁƷƓƶƱƜŴƭƷźƎƳƜƑƭƾƶǁǉƓƳƠǍƚƆƪƙƖƗ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[7] = NLoginCore_173.F("՟ՆՒժՈ՚Յյ՟ԻոձբՌւբ՝ՠտՖֈ՝շ՝ևՋ՟ֆսծՎՓմՖ֋դ֌իճիժ֞՟֘ի֌սղ֒էչ֘֝քձղ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[8] = NLoginCore_384.A("ŭűŦŘſƁŒŘŚşźľśŖřŋƉżŶŪƀţŬŒƎſƖŔƇŔƖƈŚƖƎŷśŠŬƌŝƍűƣƑƆƜƆơƝŨƟƯƨŮƏŦƔƐƨƔŵƺƅ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[9] = NLoginCore_110.A("ŽŦŖŬōřŪŐŸŦŦŋ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[10] = NLoginCore_201.A("źřŪŗžķŴśōŮŀƄƅűşŴƂŝƅŋţřŖŗ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[11] = NLoginCore_138.B("ŘĹŲķŮŠŀŗşţŗŗŢŷƉśŇƆŌƁźƏŖŗ", (byte)66, 66);
                    NLoginCore_435.var_java_lang_String_arr_b[12] = NLoginCore_110.E("ԴՒՉԹ՗մ՗վսԾՋԴտՄավ՚ՄՄևՈևֈդ՚Ր֎ձջխՔ։Տձէ֎շսնՕը֟թզ", (byte)66, 69);
                    NLoginCore_435.var_java_lang_String_arr_b[13] = NLoginCore_559.F("ԴՒՉԹ՗մ՗վսԾՋԴտՄավ՚ՄՄևՈևֈդ՚Ր֎ձջխՔ։։էՋքշղկշ֛֒֠վ֔ա֕աոզ՟֓ե֨ել֘ւ֢֭֭֞֯֓", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[14] = NLoginCore_223.A("ĹŗŎľŜŹŜƃƂŃŐĹƄŉŦƃşŉŉƌōƌƍũşŕƓŶƀŲřƎŚŷŴŰŒŜſƚŲƠƐŝŰƞƉƈƃƛŭŹŢŧƧƨƥƢƏũơƆƚƭƤƾƙƿŷƫŸſƒƓƦƋ", (byte)66, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_435.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԴՒՉԹ՗մ՗վսԾՋՏԻՂնմ՗ճՉ՚ՅՉՌՊջ՜հ՛Յ՞փՏիՠ֖֍֊կէՕ՘֚լյձ֦֙զցճ֘ճջ֚ձղ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[1] = NLoginCore_223.A("ŷŦŨūĹŸŭůłŘŒŋ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[2] = NLoginCore_451.F("ճղՈ՘Յ՛Էթ՛ջԸԿրշխւջրեւ՟տՙ՘֊ևղսքղՓմդօ֓Օ֔ռթՕէ֗ՙճշ֔օպ֞֘֗ւ֪փ֬֨֗ժ֎֛քև֪֟֏֙ֈփְֱ֔֯֓֘ոֆ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[3] = NLoginCore_076.F("ԿՑՖՉՌնկզՇ՘յԻքոհճևաՀՁո֊՘քտ՟Տ՚ծտլշքց֎դքև֙ժև֏թզ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[4] = NLoginCore_575.A("űŉŉŗŵŖšŎŎœŧƁųņŇŇŅŤŌŏƀűŒŊšūƇŴƉŰƖƓŸřŲƘŮŹƔźƑŵƄƘƣƪƙƤơũƝơƠƅƤƝƯƵƐƟƘƊƌų", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[5] = NLoginCore_384.D("ӝӊӖүҶҷҴӰӜӘӺҾҶӲӡӺӰӀԃӧӿӁӾӦӠӍӷԐԆӧӤөӑӯӯӖӎӲӘԘԒӸәӣ", (byte)66, 68);
                    NLoginCore_435.var_java_lang_String_arr_b[6] = NLoginCore_027.F("՟ՆՒժՈ՚Յյ՟ԻոԽ՘՘Վ՟վղՒՒ֊ՕՇ՞Ռ՜ՠՄտսՒ֑հթ֚֍Օ֝֒՜֠՗ճՙկհ֣դր֘ռց֡֙ֆրիְֈռֲ֎ֱ֬֗կֲ֨յ։֮֗֌ַ֨մւ֤֏ִֻֽ֖֠׃׊֑֒", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[7] = NLoginCore_138.F("՟ՆՒժՈ՚Յյ՟ԻոձբՌւբ՝ՠտՖֈ՝շ՝ևՋ՟ֆսծՎՓմՖ֋դ֌իճիժ֞՞՚գչֆհՙրս֜տ֪ձղ", (byte)66, 70);
                    NLoginCore_435.var_java_lang_String_arr_b[8] = NLoginCore_091.A("ŭűŦŘſƁŒŘŚşźľśŖřŋƉżŶŪƀţŬŒƎſƖŔƇŔƖƈŚƖƎŷśŠŬƌŝƍűƣƑƆƜƆơƝŨƟƯƪơƇƏƉűƀŮƫƅƫƧƍƆƪƿǂƟǀƢƻŽƋ", (byte)66, 65);
                    NLoginCore_435.var_java_lang_String_arr_b[9] = NLoginCore_453.B("ĮœŒſŋľżŷŗŦŒŋ", (byte)66, 66);
                    NLoginCore_435.var_java_lang_String_arr_b[10] = NLoginCore_091.C("ӲӑӢӏӶүӬӓӅӦҵӗӲӾӯҽӀҽӑӖӂӑӎӏ", (byte)66, 67);
                    NLoginCore_435.var_java_lang_String_arr_b[11] = NLoginCore_559.B("ŘĹŲķŮŠŀŗşţřţńŧŧťŻŚƊŚŽƏŖŗ", (byte)66, 66);
                    NLoginCore_435.var_java_lang_String_arr_b[12] = NLoginCore_223.C("ұӏӆҶӔӱӔӻӺһӈұӼӁӞӻӗӁӁԄӅԄԅӡӗӍԋӮӸӪӑԆӽөӡӮӹӓӨӍԍӗӪӣ", (byte)66, 67);
                    NLoginCore_435.var_java_lang_String_arr_b[13] = NLoginCore_138.B("ĹŗŎľŜŹŜƃƂŃŐĹƄŉŦƃşŉŉƌōƌƍũşŕƓŶƀŲřƎƎŬŐƉżŷŴżƠƗƥƃƙŦƚŦŽūŤƘŪƦũŬƎűƢŶƄƲƑƒƔŹžƝƏƳƹƞźƑƖƋ", (byte)66, 66);
                    NLoginCore_435.var_java_lang_String_arr_b[14] = NLoginCore_027.F("ԴՒՉԹ՗մ՗վսԾՋԴտՄավ՚ՄՄևՈևֈդ՚Ր֎ձջխՔ։ՕղկիՍ՗պ֕խ֛֋՘ի֙քփվ֖ըմ՝բ֢֣֠֝֊դ֜ց֕֨֫հֶ֑֧֧֕֕֩ն֙ֆ", (byte)66, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_435.var_java_lang_String_arr_b[0] = NLoginCore_453.E("ՋյՖՏն՝ՆԵՓջՓպԵղյԸՑՙմՠ՚֊ՑՒ", (byte)66, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_435.var_java_lang_String_arr_b[0] = NLoginCore_173.D("ҳӢӐӡӬӱӰӺөӆӷӘӍһӡӜӑԂӑӠӚӷӎӏ", (byte)66, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_435.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.E("ӴԖԘӸԜԻԳՉԵԄՂԸՆՀԉԮՐՏՇՍՇԜ", (byte)16, 69), NLoginCore_435.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.C("шѕєЗїѓюїѢёОќѠљќѢФޙިީޮ޸޹ޯ޿и", (byte)16, 67) + string + NLoginCore_223.E("Ԇ", (byte)16, 69) + methodType.toString(), exception);
        }
    }

    @Nullable
    static UUID a(PendingConnection pendingConnection) {
        if (var_java_lang_reflect_Field_r == null || var_java_lang_reflect_Field_s == null) {
            throw new UnsupportedOperationException((String)NLoginCore_435.c("㺀", (int)(x & y), (long)z));
        }
        Object object = var_java_lang_reflect_Field_r.get(pendingConnection);
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺃", (int)(aa & ab), (long)ac));
        }
        return (UUID)var_java_lang_reflect_Field_s.get(object);
    }

    static boolean aC() {
        return (var_java_lang_reflect_Field_o != null ? ad : ae) != 0;
    }

    static boolean a(LoginEvent loginEvent, UUID uUID) {
        PendingConnection pendingConnection = loginEvent.getConnection();
        try {
            NLoginCore_435.a(pendingConnection, uUID);
            return var_int_a != 0;
        }
        catch (IllegalAccessException illegalAccessException) {
            NLoginCore_370.c((String)NLoginCore_435.c("㺀", (int)(var_int_b & var_int_c), (long)d) + pendingConnection.getName() + (String)NLoginCore_435.c("㺃", (int)e, (long)(f ^ g)), illegalAccessException, new Object[h]);
            loginEvent.setCancelled(i != 0);
            loginEvent.setCancelReason(TextComponent.fromLegacyText((String)NLoginCore_435.c("㺆", (int)j, (long)(k ^ l))));
            return m != 0;
        }
    }

    static void a(PendingConnection pendingConnection, UUID uUID) {
        if (uUID == null) {
            throw new IllegalArgumentException((String)NLoginCore_435.c("㺀", (int)(u & v), (long)w));
        }
        var_java_lang_reflect_Field_p.set(pendingConnection, uUID);
        if (var_java_lang_reflect_Field_q != null) {
            var_java_lang_reflect_Field_q.set(pendingConnection, uUID);
        }
    }
}

