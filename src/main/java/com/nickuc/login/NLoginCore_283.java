/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.snakeyaml.DumperOptions$ScalarStyle
 *  com.nickuc.login.lib.snakeyaml.Yaml
 *  com.nickuc.login.lib.snakeyaml.nodes.MappingNode
 *  com.nickuc.login.lib.snakeyaml.nodes.Node
 *  com.nickuc.login.lib.snakeyaml.nodes.ScalarNode
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.nodes.MappingNode;
import com.nickuc.login.lib.snakeyaml.nodes.Node;
import com.nickuc.login.lib.snakeyaml.nodes.ScalarNode;
import com.nickuc.login.NLoginCore_222;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_555;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_005;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_283 {
    private static int t;
    private static int af;
    private boolean au;
    private boolean aw;
    private static int u;
    private static long ag;
    private static long ah;
    private static int z;
    private static int var_int_a;
    private boolean ax;
    private static String[] var_java_lang_String_arr_b;
    private static long f;
    private static int am;
    private NLoginCore_175 var_com_nickuc_login_NLoginCore_175_a;
    private static long v;
    private static long p;
    private static long y;
    private static long n;
    private static int ao;
    private static long m;
    private static int h;
    private static int ac;
    private static int ad;
    private static int al;
    private static long j;
    private boolean av;
    private static int an;
    private static int var_int_b;
    private static long d;
    private static long i;
    private static long aa;
    private static String[] var_java_lang_String_arr_a;
    private static long s;
    private static long q;
    private NLoginCore_555 var_com_nickuc_login_NLoginCore_555_a;
    private static int o;
    private static int g;
    private static int ai;
    private static int w;
    private static int r;
    private static long ab;
    private static long x;
    private static int ak;
    private NLoginCore_566 var_com_nickuc_login_NLoginCore_566_a = NLoginCore_566.var_com_nickuc_login_NLoginCore_566_d;
    private static int e;
    private static int k;
    private static long ae;
    private static long c;
    private static int aj;
    private static int l;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_283.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_453.B("ęĻĽĝŁŠŘŮŚĩŧŝūťĮœŵŴŬŲŬŁ", (byte)57, 66), NLoginCore_283.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ŔšŠģţşŚţŮŝĪŨŬťŨŮİӊӇҾҿҼҺӂӍҪҿӎӔӎӖŊ", (byte)57, 65) + string + NLoginCore_324.C("Қ", (byte)57, 67) + methodType.toString(), exception);
        }
    }

    @Generated
    public void j(boolean bl) {
        this.av = bl;
    }

    public static NLoginCore_283 com_nickuc_login_NLoginCore_283_a() {
        return new NLoginCore_283();
    }

    @Generated
    public void a(NLoginCore_555 NLoginCore_5552) {
        this.var_com_nickuc_login_NLoginCore_555_a = NLoginCore_5552;
    }

    @Generated
    public boolean ax() {
        return this.aw;
    }

    @Generated
    public NLoginCore_555 com_nickuc_login_NLoginCore_555_a() {
        return this.var_com_nickuc_login_NLoginCore_555_a;
    }

    @Generated
    public NLoginCore_566 com_nickuc_login_NLoginCore_566_b() {
        return this.var_com_nickuc_login_NLoginCore_566_a;
    }

    private static String a(int n, long l) {
        l ^= 0x2BL;
        l ^= 0x9B8548BB69B12834L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(10 + 59), (byte)(64 + 19), (byte)(30 + 17), (byte)(29 + 38), (byte)(8 + 58), (byte)(4 + 63), (byte)(15 + 32), (byte)(6 + 74), (byte)(49 + 26), (byte)(49 + 18), (byte)(39 + 44), (byte)(27 + 26), (byte)(36 + 44), (byte)(28 + 69), (byte)(39 + 61), (byte)(51 + 49), (byte)(35 + 70), 110, 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(33 + 35), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.C("Փՠ՟Ԣբ՞ՙբխ՜ԩէիդէխԯࣉࣆࢽࢾࢻࢹࣁ࣌ࢩࢾ࣓࣍࣍ࣕ", (byte)105, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_283.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public void i(boolean bl) {
        this.au = bl;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_283.c("㺀", (int)l, (long)(m ^ n)) + (Object)((Object)this.com_nickuc_login_NLoginCore_566_b()) + (String)NLoginCore_283.c("㺃", (int)o, (long)(p ^ q)) + (Object)((Object)this.com_nickuc_login_NLoginCore_175_a()) + (String)NLoginCore_283.c("㺆", (int)r, (long)s) + this.av() + (String)NLoginCore_283.c("㺉", (int)(t & u), (long)v) + (Object)((Object)this.com_nickuc_login_NLoginCore_555_a()) + (String)NLoginCore_283.c("㺌", (int)w, (long)(x ^ y)) + this.aw() + (String)NLoginCore_283.c("㺏", (int)z, (long)(aa ^ ab)) + this.ax() + (String)NLoginCore_283.c("㺒", (int)(ac & ad), (long)ae) + this.ay() + (String)NLoginCore_283.c("㺕", (int)af, (long)(ag ^ ah));
    }

    @Generated
    public NLoginCore_175 com_nickuc_login_NLoginCore_175_a() {
        return this.var_com_nickuc_login_NLoginCore_175_a;
    }

    @Generated
    private NLoginCore_283() {
        this.var_com_nickuc_login_NLoginCore_175_a = NLoginCore_175.var_com_nickuc_login_NLoginCore_175_d;
        this.au = ai;
        this.var_com_nickuc_login_NLoginCore_555_a = NLoginCore_555.var_com_nickuc_login_NLoginCore_555_d;
        this.av = aj;
        this.aw = ak;
        this.ax = al;
    }

    @Generated
    public boolean aw() {
        return this.av;
    }

    private void a(Map<String, String> map, NLoginInterface_005 NLoginInterface_0052, String string) {
        String[] stringArray = NLoginInterface_0052.com_nickuc_login_NLoginCore_474_a().a();
        int n = stringArray.length;
        for (int i = k; i < n; ++i) {
            String string2 = stringArray[i];
            map.put(string2, string);
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(7802026884757217192L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(7802026884757217192L);
        g = (2048 >>> 235 | 2048 << ~235 + 1) & 0xFFFFFFFF;
        h = 2048 >>> 202 | 2048 << -202;
        i = Long.reverse(-5168340042069811288L);
        j = Long.reverse(-3170534137668829184L);
        k = Integer.reverse(0);
        l = (196608 >>> 80 | 196608 << -80) & 0xFFFFFFFF;
        m = Long.reverse(-5168340042069811288L);
        n = Long.reverse(-3170534137668829184L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(-5168340042069811288L);
        q = Long.reverse(-3170534137668829184L);
        r = (20 >>> 162 | 20 << -162) & 0xFFFFFFFF;
        s = Long.reverse(7802026884757217192L);
        t = (192 >>> 5 | 192 << -5) & 0xFFFFFFFF;
        u = Integer.reverse(-1);
        v = Long.reverse(7802026884757217192L);
        w = (229376 >>> 79 | 229376 << -79) & 0xFFFFFFFF;
        x = Long.reverse(-5168340042069811288L);
        y = Long.reverse(-3170534137668829184L);
        z = Integer.reverse(0x10000000);
        aa = Long.reverse(-5168340042069811288L);
        ab = Long.reverse(-3170534137668829184L);
        ac = (18432 >>> 43 | 18432 << ~43 + 1) & 0xFFFFFFFF;
        ad = Integer.reverse(-1);
        ae = Long.reverse(7802026884757217192L);
        af = 0x28000000 >>> 122 | 0x28000000 << -122;
        ag = Long.reverse(-5168340042069811288L);
        ah = Long.reverse(-3170534137668829184L);
        ai = (32 >>> 197 | 32 << -197) & 0xFFFFFFFF;
        aj = Integer.reverse(Integer.MIN_VALUE);
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = Integer.reverse(Integer.MIN_VALUE);
        am = (0 >>> 153 | 0 << ~153 + 1) & 0xFFFFFFFF;
        an = Integer.reverse(-805306368);
        ao = Integer.reverse(-805306368);
        var_java_lang_String_arr_a = new String[an];
        var_java_lang_String_arr_b = new String[ao];
        NLoginCore_283.void_b();
    }

    @Generated
    public void l(boolean bl) {
        this.ax = bl;
    }

    @Generated
    public void a(NLoginCore_566 NLoginCore_5662) {
        this.var_com_nickuc_login_NLoginCore_566_a = NLoginCore_5662;
    }

    private static void void_b() {
        int n;
        c = 1583578522716889629L;
        long l = c ^ 0x9B8548BB69B12834L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(5 + 64), (byte)(62 + 21), (byte)(33 + 14), (byte)(29 + 38), (byte)(17 + 49), (byte)(41 + 26), 47, (byte)(38 + 42), (byte)(59 + 16), (byte)(21 + 46), (byte)(51 + 32), (byte)(46 + 7), (byte)(41 + 39), (byte)(17 + 80), (byte)(24 + 76), (byte)(23 + 77), (byte)(13 + 92), (byte)(32 + 78), (byte)(61 + 42)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(48 + 20), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_283.var_java_lang_String_arr_b[0] = NLoginCore_223.A("ŴƛƖźŶƖƟůƥƙƔū", (byte)82, 65);
                    NLoginCore_283.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ŜśŷŸŠƘřſźŝƗƙŶſƨƩƊţƌŹƄƯŶŷ", (byte)82, 65);
                    NLoginCore_283.var_java_lang_String_arr_b[2] = NLoginCore_324.A("ƉƅŽŨƍŠƗţƣƣźū", (byte)82, 65);
                    NLoginCore_283.var_java_lang_String_arr_b[3] = NLoginCore_453.E("ՆՀըՆգՖշՎՉ֐՝թօռՌՔմ֑֏ևլկ֒և֍ղ֠խք֙ե֢֜֝։ռ֙֗յէպըչն", (byte)82, 69);
                    NLoginCore_283.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ŸŨŗŪŻƉſƌźŮƚƂƓŸƦƕžƬŶƘƨƉŶŷ", (byte)82, 66);
                    NLoginCore_283.var_java_lang_String_arr_b[5] = NLoginCore_027.E("մֈ՛ՊաՇւիՇ՞չՒփօֈՍ֍֑եջըձ֝՗ձջ֝֙խ֡ա֒ււ։֩ֆ֔՟սե֙֫ն", (byte)82, 69);
                    NLoginCore_283.var_java_lang_String_arr_b[6] = NLoginCore_387.D("ԐԚӸԁԙԝӼӿӶӾԬԠӾөԎԂԀԨԣӭԮԵԶԑԫ԰ԗӾԑԔԍӿ", (byte)82, 68);
                    NLoginCore_283.var_java_lang_String_arr_b[7] = NLoginCore_223.F("մֈ՛ՊաՇւիՇ՞ղհհՋ՝իգՒ֍շ֑֋֖֜հրտՔ֣֎դւէ֡ըէզքֈլ֤֝ցն", (byte)82, 70);
                    NLoginCore_283.var_java_lang_String_arr_b[8] = NLoginCore_324.F("ֆ՗եֆմւ֎Պ՟Վչև֏ևօօ֕ևֆ֗֐Փֆշ֛ղ֋ձլ֌յ՝", (byte)82, 70);
                    NLoginCore_283.var_java_lang_String_arr_b[9] = NLoginCore_384.B("ŤŪŪŨƋơƢƜŞƥŘƛŚƅũƫŴŪŨƗŭƥŤůƴŵŨƣƂƁƙƺ", (byte)82, 66);
                    NLoginCore_283.var_java_lang_String_arr_b[10] = NLoginCore_387.A("ƉŴŸžƌƎƝųƒƀŲū", (byte)82, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_283.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ӸӾӸԆԩԀԃӧԡԮԬөԋԭԍԱԉԕӴӭӰԷӾӿ", (byte)82, 67);
                    NLoginCore_283.var_java_lang_String_arr_b[1] = NLoginCore_223.C("ӤӣӿԀӨԠӡԇԂӥԟԬԛӧԉԮԄԇԲԔԑԑӾӿ", (byte)82, 67);
                    NLoginCore_283.var_java_lang_String_arr_b[2] = NLoginCore_027.A("ƐƐƏƈŽƠřƔƠƏƠū", (byte)82, 65);
                    NLoginCore_283.var_java_lang_String_arr_b[3] = NLoginCore_575.F("ՆՀըՆգՖշՎՉ֐՝թօռՌՔմ֑֏ևլկ֒և֍ղ֠խք֙ե֢֝֐֥֚֚ս֍֢ա֊ִ֦֣֪֑յְց֒֗ոքցւ", (byte)82, 70);
                    NLoginCore_283.var_java_lang_String_arr_b[4] = NLoginCore_324.D("ԀӰӟӲԃԑԇԔԂӶԢӸԞӰӭԒԱԊӰӱԙԎԏԲԑԩԪԞӽԒӺԌ", (byte)82, 68);
                    NLoginCore_283.var_java_lang_String_arr_b[5] = NLoginCore_324.C("ԑԥӸӧӾӤԟԈӤӻԖӯԠԢԥӪԪԮԂԘԅԎԺӴԎԘԺԶԊԾӾԯԴԝԴԻԨԒՊՋԸԕՈԓ", (byte)82, 67);
                    NLoginCore_283.var_java_lang_String_arr_b[6] = NLoginCore_138.B("ƈƒŰŹƑƕŴŷŮŶƤƘŶšƆźŸƠƛťƦƫŨƂƈŬŴƷƣƎƚư", (byte)82, 66);
                    NLoginCore_283.var_java_lang_String_arr_b[7] = NLoginCore_451.D("ԑԥӸӧӾӤԟԈӤӻԏԍԍӨӺԈԀӯԪԔԮԨԳԹԍԝԜӱՀԫԁԟԲԹԜԓԦՃՄԜԤԾՈԓ", (byte)82, 68);
                    NLoginCore_283.var_java_lang_String_arr_b[8] = NLoginCore_427.C("ԣӴԂԣԑԟԫӧӼӫԖԤԬԤԢԢԲԤԣԴԭӯԅԪӺԺӹԇԉԗԼՃՄԦԯԺԾԅՄԁԅԕԪԓ", (byte)82, 67);
                    NLoginCore_283.var_java_lang_String_arr_b[9] = NLoginCore_384.D("ӬӲӲӰԓԩԪԤӦԭӠԣӢԍӱԳӼӲӰԟӵԪԫӱӵԜӷԸԈӸԬӾԎԱԅԚԩԢԥԠӾԫԅԓ", (byte)82, 68);
                    NLoginCore_283.var_java_lang_String_arr_b[10] = NLoginCore_223.C("ԐԅԝԏӼԝӶӵԄԌӥӳ", (byte)82, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_283.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ՠՙմս՝ֆտ՟֏ծՏժւփէթ֊յի՘օ֚աբ", (byte)82, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_283.var_java_lang_String_arr_b[0] = NLoginCore_451.C("ԌӲԃԟӺԇӠӹԨԭӺӬԐԜӭԒӲԨӬԡӷԑӾӿ", (byte)82, 67);
                }
            }
        }
    }

    @Generated
    public boolean ay() {
        return this.ax;
    }

    private void a(File file, Map<String, String> map) {
        Yaml yaml = NLoginCore_222.a(g != 0);
        MappingNode mappingNode = NLoginCore_222.a(yaml, file);
        NLoginCore_222.a(mappingNode, (String)NLoginCore_283.c("㺀", (int)h, (long)(i ^ j)), (String string, Node node) -> {
            String string2 = (String)map.get(string);
            if (string2 == null) {
                return null;
            }
            return new ScalarNode(node.getTag(), string2, node.getStartMark(), node.getEndMark(), DumperOptions.ScalarStyle.PLAIN);
        });
        try (FileWriter fileWriter = new FileWriter(file);){
            yaml.serialize((Node)mappingNode, (Writer)fileWriter);
        }
    }

    @Generated
    public boolean av() {
        return this.au;
    }

    @Generated
    public void a(NLoginCore_175 NLoginCore_175) {
        this.var_com_nickuc_login_NLoginCore_175_a = NLoginCore_175;
    }

    @Generated
    public void k(boolean bl) {
        this.aw = bl;
    }

    public void f(NLoginType_008 NLoginType_008) {
        File file = NLoginType_008.com_nickuc_login_NLoginCore_219_a().d();
        File file2 = new File(NLoginType_008.java_io_File_c() + File.separator + (String)NLoginCore_283.c("㺀", (int)(var_int_a & var_int_b), (long)d), (String)NLoginCore_283.c("㺃", (int)e, (long)f));
        HashMap<String, String> hashMap = new HashMap<String, String>();
        this.a(hashMap, NLoginCore_532.ab, this.var_com_nickuc_login_NLoginCore_566_a.name().toUpperCase());
        this.a(hashMap, NLoginCore_532.al, this.var_com_nickuc_login_NLoginCore_175_a.name().toUpperCase());
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        this.a(hashMap2, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d, Boolean.toString(this.au));
        this.a(hashMap2, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_a, this.var_com_nickuc_login_NLoginCore_555_a.name().toUpperCase());
        this.a(hashMap2, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_c, Boolean.toString(this.av));
        this.a(hashMap2, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_p, Boolean.toString(this.aw));
        this.a(hashMap2, NLoginCore_370.var_com_nickuc_login_NLoginCore_329_l, Boolean.toString(this.ax));
        this.a(file, hashMap);
        if (file2.exists()) {
            this.a(file2, hashMap2);
        }
        BCryptHashProvider.a(NLoginType_008);
        NLoginType_008.java_lang_Object_b().c().forEach(NLoginCore_277 -> NLoginCore_277.a(NLoginCore_150.a(NLoginCore_374.p, NLoginCore_277, new Object[am])));
        NLoginType_008.com_nickuc_login_NLoginCore_495_a().u();
        NLoginType_008.com_nickuc_login_NLoginCore_495_a().t();
    }
}

