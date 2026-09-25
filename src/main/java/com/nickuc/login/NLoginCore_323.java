/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.NLoginCore_147;
import com.nickuc.login.NLoginCore_562;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_213;
import com.nickuc.login.HikariConnectionPool;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_036;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_034;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_323 {
    private static long z;
    private static int var_int_a;
    private static int var_int_b;
    private static int i;
    private static int u;
    private static int ai;
    private static long h;
    private static int v;
    private static int o;
    private static int g;
    private static String[] var_java_lang_String_arr_b;
    private static int r;
    private static long ab;
    private static int e;
    private static int ag;
    private static long s;
    private static int p;
    private static int x;
    private static long ac;
    private static int ah;
    private static int af;
    private static long w;
    private static long t;
    private static long q;
    private static long j;
    private static int m;
    private static int ae;
    private static int aa;
    private static int ak;
    private static int ad;
    private static long d;
    private static long k;
    private static long c;
    private static int aj;
    private static long n;
    private static int l;
    private static long y;
    private static String[] var_java_lang_String_arr_a;
    private static long f;

    private static void b() {
        int n;
        c = 5606891711535196189L;
        long l = c ^ 0xDD5EAB39E50A1427L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(31 + 38), (byte)(75 + 8), (byte)(34 + 13), (byte)(48 + 19), (byte)(18 + 48), 67, (byte)(27 + 20), (byte)(7 + 73), (byte)(54 + 21), (byte)(46 + 21), (byte)(21 + 62), (byte)(15 + 38), (byte)(51 + 29), (byte)(68 + 29), 100, (byte)(99 + 1), (byte)(22 + 83), (byte)(105 + 5), (byte)(42 + 61)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_323.var_java_lang_String_arr_b[0] = NLoginCore_446.C("ԣՌԏԒԱԈԫԪԴՓԷԼԔԜԝԮ԰ԽՕբԜՔԫԬ", (byte)97, 67);
                    NLoginCore_323.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ƧƪƆŹźƬƚƪźŵŽưƑƢƁƽƿƅǇǁƛǍƔƕ", (byte)97, 66);
                    NLoginCore_323.var_java_lang_String_arr_b[2] = NLoginCore_387.A("ƓƉƋƕƍƖǁƯƠƾƷƮƥƠƀƴƳƳƊſƋǏƥǒƭƠƴǌƐǉǒǓǇǜƪǗǛǋƝǜƟƣǎƩ", (byte)97, 65);
                    NLoginCore_323.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ԿԜԥԒԞ԰՗ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԻԥԽՙՊԣբԷզ՜ԽհՑծՅՅՀոԪՂչխՀ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[4] = NLoginCore_027.D("ԿԜԥԒԞ԰՗ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽԸՄՓՖՊԵթՋԻխԽգէկՀճՌյ՗ՑԶՀ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ԿԜԥԒԞ԰՗ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԴԺ՛՜՝ՈՉԼ՘Ծ԰զՍԿԽՀ԰ձդՋ԰չՀ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[6] = NLoginCore_324.A("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƝƭƋƱǓƬǑǋƣǃƬǌƑǋƧƧǍƽƛǒǘƸƩ", (byte)97, 65);
                    NLoginCore_323.var_java_lang_String_arr_b[7] = NLoginCore_110.B("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƦǏƙǊǇƦǎƦƶƴƶƗƹƘƳǎǞǎƸƢǏǞƩ", (byte)97, 66);
                    NLoginCore_323.var_java_lang_String_arr_b[8] = NLoginCore_092.D("ԿԜԥԒԞ԰՗ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽզ԰ա՞ԽեԽՍՋՍհՌԲԳ՝կՆՑգԴձՀ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[9] = NLoginCore_384.D("ԩՑԌԊԨԡԷԫԘՂԫԠ", (byte)97, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_323.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ԣՌԏԒԱԈԫԪԴՓԸՍԬԫԬՌԺՂԭԵԥԮԫԬ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[1] = NLoginCore_110.A("ƧƪƆŹźƬƚƪźŵŽǅƆƾƱƨƽƋƩǇƉƣǍǍƍƑƽƑƨƬƨƋ", (byte)97, 65);
                    NLoginCore_323.var_java_lang_String_arr_b[2] = NLoginCore_027.D("ԪԠԢԬԤԭ՘ՆԷՕՎՅԼԷԗՋՊՊԡԖԢզԼթՄԷՋգԧՠթժեՇՁԦԭնկՖՁՆՓՀ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƤƎƦǂƳƌǋƠǏǅƦǅƳƎƾƫƷƱǝƛǑǞƩ", (byte)97, 66);
                    NLoginCore_323.var_java_lang_String_arr_b[4] = NLoginCore_384.F("քաժ՗գյ֜֊֔֋֋չ֍պՠ֢՜ո֩֊վւս։֛֘֏պ֮֐րֲ֡կ֊ֱֲ֑֭֓֘֓֠օ", (byte)97, 70);
                    NLoginCore_323.var_java_lang_String_arr_b[5] = NLoginCore_575.A("ƨƅƎŻƇƙǀƮƸƯƯƝƱƞƄǆƀƜǍƮƢƝƣǄǅǆƱƲƥǁƧƙƲǛƪƹƦǘǙƛǀƴǎƩ", (byte)97, 65);
                    NLoginCore_323.var_java_lang_String_arr_b[6] = NLoginCore_110.E("քաժ՗գյ֜֊֔֋֋չ֍պՠ֢՜ո֩֊վչ։է֍֯ֈ֧֭տ֟ֈ֑֔րֶ֖֖֚կևֿշօ", (byte)97, 69);
                    NLoginCore_323.var_java_lang_String_arr_b[7] = NLoginCore_324.F("քաժ՗գյ֜֊֔֋֋չ֍պՠ֢՜ո֩֊վւ֫յ֦֣ւ֪ւ֒֐ֳ֒հցֱ֥֩֨ֆպ։տօ", (byte)97, 70);
                    NLoginCore_323.var_java_lang_String_arr_b[8] = NLoginCore_091.D("ԿԜԥԒԞ԰՗ՅՏՆՆԴՈԵԛ՝ԗԳդՅԹԽզ԰ա՞ԽեԽՍՋՍԻՌլկնեիլԲՎ՗Հ", (byte)97, 68);
                    NLoginCore_323.var_java_lang_String_arr_b[9] = NLoginCore_173.B("ƖƯƐƱƺƐƹƘƊƖƔƉ", (byte)97, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_323.var_java_lang_String_arr_b[0] = NLoginCore_387.F("ՎշՕէլ֛և֍Օս՛ղ՜֎ր֗ս֖ւֆ֪֩հձ", (byte)97, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_323.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ԲԤԓԓԝԢԓԏԨԕՒԲՓՙԘԹՉՃ՞ԿԳդԫԬ", (byte)97, 67);
                }
            }
        }
    }

    public static boolean a(NLoginCore_459 NLoginCore_459, String string, String string2) {
        Connection connection = NLoginCore_459.java_sql_Connection_a();
        try {
            boolean bl;
            block9: {
                ResultSet resultSet = connection.getMetaData().getColumns(connection.getCatalog(), null, string, string2);
                try {
                    bl = resultSet.next();
                    if (resultSet == null) break block9;
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                resultSet.close();
            }
            return bl;
        }
        finally {
            NLoginCore_459.a(connection);
        }
    }

    static {
        var_int_a = (0 >>> 103 | 0 << ~103 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-5038186473842150478L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-5038186473842150478L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(-5038186473842150478L);
        i = Integer.reverse(-1073741824);
        j = Long.reverse(-5182301661918006350L);
        k = Long.reverse(0x200000000000000L);
        l = Integer.reverse(0x20000000);
        m = (-1 >>> 119 | -1 << -119) & 0xFFFFFFFF;
        n = Long.reverse(-5038186473842150478L);
        o = Integer.reverse(-1610612736);
        p = Integer.reverse(-1);
        q = Long.reverse(-5038186473842150478L);
        r = Integer.reverse(0x60000000);
        s = Long.reverse(-5182301661918006350L);
        t = Long.reverse(0x200000000000000L);
        u = Integer.reverse(-536870912);
        v = Integer.reverse(-1);
        w = Long.reverse(-5038186473842150478L);
        x = 0x10000000 >>> 185 | 0x10000000 << -185;
        y = Long.reverse(-5182301661918006350L);
        z = Long.reverse(0x200000000000000L);
        aa = Integer.reverse(-1879048192);
        ab = Long.reverse(-5182301661918006350L);
        ac = Long.reverse(0x200000000000000L);
        ad = Integer.reverse(-1073741824);
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = (0 >>> 68 | 0 << ~68 + 1) & 0xFFFFFFFF;
        ag = Integer.reverse(Integer.MIN_VALUE);
        ah = 256 >>> 136 | 256 << ~136 + 1;
        ai = 0 >>> 162 | 0 << ~162 + 1;
        aj = (0x500000 >>> 179 | 0x500000 << -179) & 0xFFFFFFFF;
        ak = Integer.reverse(0x50000000);
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_323.b();
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0xDD5EAB39E50A1427L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(60 + 9), (byte)(31 + 52), (byte)(39 + 8), (byte)(4 + 63), (byte)(7 + 59), (byte)(41 + 26), (byte)(46 + 1), (byte)(67 + 13), (byte)(51 + 24), (byte)(25 + 42), (byte)(72 + 11), (byte)(10 + 43), (byte)(57 + 23), (byte)(61 + 36), 100, (byte)(75 + 25), (byte)(57 + 48), (byte)(58 + 52), (byte)(55 + 48)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(77 + 6)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_004.B("ƾǋǊƍǍǉǄǍǘǇƔǒǖǏǒǘƚԣԀԷԴԵԩԆԸԮԵ", (byte)110, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_323.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static NLoginCore_147 a(NLoginCore_219 NLoginCore_2192, NLoginCore_036 NLoginCore_0362) {
        Properties properties = new Properties();
        String string = NLoginCore_2192.java_lang_String_b(NLoginCore_323.c("㺀", (int)i, (long)(j ^ k)));
        String string2 = NLoginCore_2192.java_lang_String_b(NLoginCore_323.c("㺃", (int)(l & m), (long)n));
        String string3 = NLoginCore_2192.java_lang_String_b(NLoginCore_323.c("㺆", (int)(o & p), (long)q));
        String string4 = NLoginCore_2192.java_lang_String_b(NLoginCore_323.c("㺉", (int)r, (long)(s ^ t)));
        for (String string5 : NLoginCore_2192.a((String)NLoginCore_323.c("㺌", (int)(u & v), (long)w))) {
            String string6 = NLoginCore_2192.java_lang_String_b((String)NLoginCore_323.c("㺏", (int)x, (long)(y ^ z)) + string5);
            properties.setProperty(string5, string6);
        }
        return NLoginCore_147.a(string, string2, string3, string4, properties, NLoginCore_0362.i());
    }

    public static boolean a(NLoginCore_459 NLoginCore_459, String string) {
        Connection connection = NLoginCore_459.java_sql_Connection_a();
        try {
            boolean bl;
            block13: {
                boolean bl2;
                ResultSet resultSet = connection.getMetaData().getTables(connection.getCatalog(), null, (String)NLoginCore_323.c("㺀", (int)aa, (long)(ab ^ ac)), null);
                try {
                    while (resultSet.next()) {
                        if (!resultSet.getString(ad).equalsIgnoreCase(string)) continue;
                        bl2 = ae;
                        if (resultSet == null) break block12;
                    }
                }
                catch (Throwable throwable) {
                    if (resultSet != null) {
                        try {
                            resultSet.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                {
                    block12: {
                        resultSet.close();
                    }
                    return bl2;
                }
                bl = af;
                if (resultSet == null) break block13;
                resultSet.close();
            }
            return bl;
        }
        finally {
            NLoginCore_459.a(connection);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_323.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.B("ƇƩƫƋƯǎǆǜǈƗǕǋǙǓƜǁǣǢǚǠǚƯ", (byte)112, 66), NLoginCore_323.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԧԄԻԸԹԭԊԼԲԹƴ", (byte)112, 65) + string + NLoginCore_173.D("Կ", (byte)112, 68) + methodType.toString(), exception);
        }
    }

    public static boolean a(ResultSet resultSet, String string) {
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int n = resultSetMetaData.getColumnCount();
        for (int i = ag; i <= n; ++i) {
            if (!string.equals(resultSetMetaData.getColumnName(i))) continue;
            return ah != 0;
        }
        return ai != 0;
    }

    public static HikariConnectionPool a(NLoginType_008 NLoginType_008, NLoginCore_036 NLoginCore_0362, NLoginCore_147 NLoginCore_147, @Nullable Consumer<HikariConfig> consumer) {
        if (!NLoginCore_0362.aa()) {
            throw new IllegalArgumentException((String)NLoginCore_323.c("㺀", (int)(var_int_a & var_int_b), (long)d) + (Object)((Object)NLoginCore_0362) + (String)NLoginCore_323.c("㺃", (int)e, (long)f));
        }
        switch (NLoginCore_213.h[NLoginCore_0362.ordinal()]) {
            case 1: {
                return NLoginCore_562.a(NLoginType_008, NLoginCore_147, consumer);
            }
            case 2: {
                return NLoginCore_034.a(NLoginType_008, NLoginCore_147, consumer);
            }
        }
        throw new IllegalArgumentException((String)NLoginCore_323.c("㺆", (int)g, (long)h) + (Object)((Object)NLoginCore_0362));
    }
}

