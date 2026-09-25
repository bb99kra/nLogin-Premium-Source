/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.types.AccountData
 *  com.nickuc.login.api.types.AccountDataImpl
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.AccountDataImpl;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginType_024;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_288;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_236
implements Iterator<AccountData> {
    private static int aa;
    private static int q;
    private static int ab;
    private static int v;
    private static int m;
    private static int ad;
    private static long ac;
    private final NLoginCore_291 var_com_nickuc_login_NLoginCore_291_a;
    private static int y;
    private static int var_int_c;
    private static long af;
    private static String[] var_java_lang_String_arr_b;
    private static int u;
    private static int h;
    private static int k;
    private static int j;
    private static int var_int_a;
    private static int t;
    private static int g;
    private static int ah;
    private static long n;
    private static String[] var_java_lang_String_arr_a;
    private static int d;
    private static int f;
    private static int w;
    private static int l;
    private static long r;
    private final long var_long_a;
    private static int i;
    private static int ag;
    private static long p;
    private static int ae;
    private static int z;
    private static int o;
    private static int x;
    private long var_long_b;
    private static long s;
    private static long e;
    private static int var_int_b;
    private final NLoginCore_459 var_com_nickuc_login_NLoginCore_459_a;
    private static long var_long_c;

    @Override
    public void remove() {
        ++this.var_long_b;
    }

    private static void b() {
        int n;
        var_long_c = -3936023310701874064L;
        long l = var_long_c ^ 0x3313EC6F56845B92L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(26 + 43), (byte)(3 + 80), 47, (byte)(55 + 12), (byte)(46 + 20), (byte)(5 + 62), (byte)(38 + 9), (byte)(59 + 21), (byte)(35 + 40), (byte)(35 + 32), (byte)(8 + 75), (byte)(14 + 39), (byte)(40 + 40), (byte)(56 + 41), (byte)(21 + 79), (byte)(3 + 97), (byte)(68 + 37), (byte)(12 + 98), (byte)(59 + 44)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(64 + 4), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NLoginCore_236.var_java_lang_String_arr_b[0] = NLoginCore_427.D("Ѩях҆ѓҔѡѯ҈ѥ҇ѸѳѾҒҖ҂ҞѰѬѳѾѲѥҚѿҪ҃ѬҖҍҬҁ҅Ҟң҃҄ѲҹҗѳҖҌҬҫҺ҈ғҪҾҬҵҜҨӅ҆҄ҙӀҟҙҎ҉", (byte)33, 68);
                    NLoginCore_236.var_java_lang_String_arr_b[1] = NLoginCore_387.E("ՌԔՌԩԩԺԬՓՕԪՈԞԱ՛԰ՄաՐ՗ՙՓիԨԨ՗ԿՌ՜եկիՔ", (byte)33, 69);
                    NLoginCore_236.var_java_lang_String_arr_b[2] = NLoginCore_384.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįİđĭĜľŋĬĚŒōńĩ", (byte)33, 66);
                    NLoginCore_236.var_java_lang_String_arr_b[3] = NLoginCore_387.C("Ѩях҆ѓҔѡѯ҈ѥ҇ѸѳѾҒҖ҂ҞѰѬѳѾѲѥҚѿҪ҃ѬҖҍҬҝҞ҆ѮҝѳҤѳ҆ҰғѸѵҝҒҡҸғҴҷҭҞҋҌ", (byte)33, 67);
                    NLoginCore_236.var_java_lang_String_arr_b[4] = NLoginCore_027.D("҇я҇ѤѤѵѧҎҐѥ҃љѬҖѫѿҜҋҒҔҎҦѣѣҒѺ҇җҠҪҦҏ", (byte)33, 68);
                    NLoginCore_236.var_java_lang_String_arr_b[5] = NLoginCore_223.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįİđĭĜľŋĬĚŒōńĩ", (byte)33, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_236.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ԭԔԊՋԘՙԦԴՍԪՌԽԸՃ՗՛ՇգԵԱԸՃԷԪ՟ՄկՈԱ՛ՒձՆՊգըՈՉԷվ՜Ը՛ՑձհտՍ՘կփձպ՗իՇտ֏՚ՏտՎ֍Շ", (byte)33, 70);
                    NLoginCore_236.var_java_lang_String_arr_b[1] = NLoginCore_091.F("ՌԔՌԩԩԺԬՓՕԪՈԞԱ՛԰ՄաՐ՗ՙՓԨաՆԼբԭԭդԿԿԮԶՖոըգճՑՏԾհղՅ", (byte)33, 70);
                    NLoginCore_236.var_java_lang_String_arr_b[2] = NLoginCore_091.A("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįēħĦŐřĖœęĿŖŕŃĴŖņśŝŗřŝĦķĴĵ", (byte)33, 65);
                    NLoginCore_236.var_java_lang_String_arr_b[3] = NLoginCore_324.A("đøîįüĽĊĘıĎİġĜħĻĿīŇęĕĜħěĎŃĨœĬĕĿĶŕņŇįėņĜōĜįřĿĲłŞŇĩŃĤţŊĬŝĴĵ", (byte)33, 65);
                    NLoginCore_236.var_java_lang_String_arr_b[4] = NLoginCore_223.C("҇я҇ѤѤѵѧҎҐѥ҃љѬҖѫѿҜҋҒҔҎѤѝѤ҅ҕѴѸѼҥ҉қ", (byte)33, 67);
                    NLoginCore_236.var_java_lang_String_arr_b[5] = NLoginCore_091.B("ñģĥûēħþīĪēöĘĳŁİĴĦŊĚŋĥĺĈĐőěīĤĔīŇįŚŚœďĩĘĮŒĿİţřĞğĠĻŧĵŪňŬŝĴĵ", (byte)33, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_236.var_java_lang_String_arr_b[0] = NLoginCore_092.F("ԪՅՍՄԐԘԘԴԻԵԶ՗ԛՄՕԞՠ԰ԲԥՕԳ԰Ա", (byte)33, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_236.var_java_lang_String_arr_b[0] = NLoginCore_076.D("҃ьѫѭѵѤёїҌҖѳѠ", (byte)33, 68);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x70L;
        l ^= 0x3313EC6F56845B92L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(7 + 61), (byte)(51 + 18), (byte)(76 + 7), (byte)(2 + 45), (byte)(36 + 31), 66, (byte)(21 + 46), (byte)(35 + 12), (byte)(3 + 77), (byte)(8 + 67), (byte)(62 + 5), (byte)(74 + 9), (byte)(33 + 20), (byte)(71 + 9), 97, (byte)(66 + 34), (byte)(94 + 6), (byte)(42 + 63), (byte)(104 + 6), (byte)(33 + 70)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(19 + 50), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.F("֋֘֗՚֖֑֥֚֚֔ա֣֥֟֜֟էࣰःࣵःࣷंࣲࣚࣧࣿऊँइआऍ", (byte)108, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_236.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AccountData next() {
        ++this.var_long_b;
        try {
            Object[] objectArray = new Object[f];
            objectArray[NLoginCore_236.g] = NLoginCore_532.e.a(new Object[h]);
            objectArray[NLoginCore_236.i] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
            Object[] objectArray2 = new Object[j];
            objectArray2[NLoginCore_236.k] = this.var_long_b;
            try (NLoginCore_171 NLoginCore_171 = this.var_com_nickuc_login_NLoginCore_459_a.com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginCore_236.c("㺀", (int)(var_int_c & d), (long)e), objectArray), objectArray2);){
                ResultSet resultSet = (ResultSet)NLoginCore_171.d();
                if (!resultSet.next()) return null;
                ForceRegisterConfig ForceRegisterConfig2 = this.var_com_nickuc_login_NLoginCore_291_a.a(resultSet);
                if (ForceRegisterConfig2 == null) throw new RuntimeException((String)NLoginCore_236.c("㺃", (int)(l & m), (long)n));
                AccountDataImpl accountDataImpl = NLoginType_024.from(ForceRegisterConfig2);
                return accountDataImpl;
            }
        }
        catch (SQLException sQLException) {
            throw new RuntimeException(sQLException);
        }
        catch (Exception exception) {
            throw new RuntimeException((String)NLoginCore_236.c("㺆", (int)o, (long)p), exception);
        }
    }

    static {
        var_int_a = (512 >>> 137 | 512 << -137) & 0xFFFFFFFF;
        var_int_b = (0 >>> 76 | 0 << -76) & 0xFFFFFFFF;
        var_int_c = (0 >>> 183 | 0 << -183) & 0xFFFFFFFF;
        d = Integer.reverse(-1);
        e = Long.reverse(12577884303918739L);
        f = Integer.reverse(0x40000000);
        g = Integer.reverse(0);
        h = Integer.reverse(0);
        i = (2048 >>> 139 | 2048 << -139) & 0xFFFFFFFF;
        j = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & 0xFFFFFFFF;
        k = 0 >>> 72 | 0 << ~72 + 1;
        l = Integer.reverse(Integer.MIN_VALUE);
        m = Integer.reverse(-1);
        n = Long.reverse(12577884303918739L);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(12577884303918739L);
        q = Integer.reverse(-1073741824);
        r = Long.reverse(1021384200834909843L);
        s = Long.reverse(0xE00000000000000L);
        t = (128 >>> 134 | 128 << -134) & 0xFFFFFFFF;
        u = Integer.reverse(0);
        v = 0 >>> 16 | 0 << ~16 + 1;
        w = Integer.reverse(Integer.MIN_VALUE);
        x = (0x2000000 >>> 217 | 0x2000000 << ~217 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(0);
        z = Integer.reverse(0x800000);
        aa = Integer.reverse(0x20000000);
        ab = Integer.reverse(-1);
        ac = Long.reverse(12577884303918739L);
        ad = Integer.reverse(-1610612736);
        ae = Integer.reverse(-1);
        af = Long.reverse(12577884303918739L);
        ag = Integer.reverse(0x60000000);
        ah = 12 >>> 161 | 12 << ~161 + 1;
        var_java_lang_String_arr_a = new String[ag];
        var_java_lang_String_arr_b = new String[ah];
        NLoginCore_236.b();
    }

    @Override
    public void forEachRemaining(Consumer<? super AccountData> consumer) {
        try {
            Object[] objectArray = new Object[t];
            objectArray[NLoginCore_236.u] = NLoginCore_532.e.a(new Object[v]);
            objectArray[NLoginCore_236.w] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
            Object[] objectArray2 = new Object[x];
            objectArray2[NLoginCore_236.y] = this.var_long_b;
            try (NLoginCore_288 NLoginCore_2882 = this.var_com_nickuc_login_NLoginCore_459_a.com_nickuc_login_NLoginCore_288_a(String.format((String)NLoginCore_236.c("㺀", (int)q, (long)(r ^ s)), objectArray), objectArray2);){
                PreparedStatement preparedStatement = (PreparedStatement)NLoginCore_2882.d();
                preparedStatement.setFetchSize(z);
                try (ResultSet resultSet = preparedStatement.executeQuery();){
                    while (resultSet.next()) {
                        ForceRegisterConfig ForceRegisterConfig2 = this.var_com_nickuc_login_NLoginCore_291_a.a(resultSet);
                        if (ForceRegisterConfig2 != null) {
                            consumer.accept((AccountData)NLoginType_024.from(ForceRegisterConfig2));
                            continue;
                        }
                        throw new RuntimeException((String)NLoginCore_236.c("㺃", (int)(aa & ab), (long)ac));
                    }
                }
            }
        }
        catch (SQLException sQLException) {
            throw new RuntimeException(sQLException);
        }
        catch (Exception exception) {
            throw new RuntimeException((String)NLoginCore_236.c("㺆", (int)(ad & ae), (long)af), exception);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_236.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("×ùûÛÿĞĖĬĘçĥěĩģìđĳĲĪİĪÿ", (byte)24, 65), NLoginCore_236.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.D("ѠѭѬЯѯѫѦѯѺѩжѴѸѱѴѺм߅ߘߊߘߌߗޯ߇޼ߔߟߖߜߛߢї", (byte)24, 68) + string + NLoginCore_575.F("Ԏ", (byte)24, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_236(NLoginCore_291 NLoginCore_2912, NLoginCore_459 NLoginCore_459, long l) {
        this.var_com_nickuc_login_NLoginCore_291_a = NLoginCore_2912;
        this.var_com_nickuc_login_NLoginCore_459_a = NLoginCore_459;
        this.var_long_a = l;
    }

    @Override
    public boolean hasNext() {
        return (this.var_long_b <= this.var_long_a ? var_int_a : var_int_b) != 0;
    }
}

