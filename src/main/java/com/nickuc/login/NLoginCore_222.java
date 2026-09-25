/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.snakeyaml.DumperOptions
 *  com.nickuc.login.lib.snakeyaml.LoaderOptions
 *  com.nickuc.login.lib.snakeyaml.Yaml
 *  com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor
 *  com.nickuc.login.lib.snakeyaml.constructor.Constructor
 *  com.nickuc.login.lib.snakeyaml.nodes.MappingNode
 *  com.nickuc.login.lib.snakeyaml.nodes.Node
 *  com.nickuc.login.lib.snakeyaml.nodes.NodeTuple
 *  com.nickuc.login.lib.snakeyaml.nodes.ScalarNode
 *  com.nickuc.login.lib.snakeyaml.representer.Representer
 */
package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.constructor.BaseConstructor;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import com.nickuc.login.lib.snakeyaml.nodes.MappingNode;
import com.nickuc.login.lib.snakeyaml.nodes.Node;
import com.nickuc.login.lib.snakeyaml.nodes.NodeTuple;
import com.nickuc.login.lib.snakeyaml.nodes.ScalarNode;
import com.nickuc.login.lib.snakeyaml.representer.Representer;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_222 {
    private static int e;
    private static long o;
    private static int q;
    private static long g;
    private static int var_int_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int l;
    private static int r;
    private static long f;
    private static long i;
    private static long j;
    private static String[] var_java_lang_String_arr_a;
    private static int h;
    private static int var_int_c;
    private static int k;
    private static String[] var_java_lang_String_arr_b;
    private static long p;
    private static long m;
    private static long d;
    private static int n;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_222.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.C("ҩӋӍҭӑӰӨӾӪҹӷӭӻӵҾӣԅԄӼԂӼӑ", (byte)68, 67), NLoginCore_222.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.A("ŪŷŶĹŹŵŰŹƄųŀžƂŻžƄņҳӢҭӟӜӕӒәӝӛӚӫӖӥӠš", (byte)68, 65) + string + NLoginCore_091.A("Ł", (byte)68, 65) + methodType.toString(), exception);
        }
    }

    public static MappingNode a(Yaml yaml, File file) {
        Node node;
        try (FileReader fileReader = new FileReader(file);){
            node = yaml.compose((Reader)fileReader);
        }
        if (!(node instanceof MappingNode)) {
            throw new IllegalStateException((String)NLoginCore_222.c("㺀", (int)n, (long)(o ^ p)) + node.getClass().getCanonicalName());
        }
        return (MappingNode)node;
    }

    public static void a(MappingNode mappingNode, String string, BiFunction<String, Node, Node> biFunction) {
        List list = mappingNode.getValue();
        for (int i = var_int_a; i < list.size(); ++i) {
            NodeTuple nodeTuple = (NodeTuple)list.get(i);
            Node node = nodeTuple.getKeyNode();
            if (!(node instanceof ScalarNode)) {
                throw new IllegalStateException((String)NLoginCore_222.c("㺀", (int)(var_int_b & var_int_c), (long)d) + node.getClass().getCanonicalName() + (String)NLoginCore_222.c("㺃", (int)e, (long)(f ^ g)) + node);
            }
            ScalarNode scalarNode = (ScalarNode)node;
            String string2 = string + (String)(string.isEmpty() ? NLoginCore_222.c("㺆", (int)h, (long)(NLoginCore_222.i ^ j)) : NLoginCore_222.c("㺉", (int)(k & l), (long)m)) + scalarNode.getValue();
            Node node2 = nodeTuple.getValueNode();
            if (node2 instanceof MappingNode) {
                NLoginCore_222.a((MappingNode)node2, string2, biFunction);
                continue;
            }
            Node node3 = biFunction.apply(string2, node2);
            if (node3 == null) continue;
            list.set(i, new NodeTuple(node, node3));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x37L;
        l ^= 0xD8E2589D91AA4920L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(17 + 52), (byte)(62 + 21), (byte)(3 + 44), 67, (byte)(26 + 40), 67, (byte)(10 + 37), (byte)(32 + 48), (byte)(72 + 3), (byte)(58 + 9), (byte)(20 + 63), (byte)(24 + 29), (byte)(29 + 51), (byte)(66 + 31), (byte)(55 + 45), (byte)(99 + 1), (byte)(78 + 27), (byte)(81 + 29), (byte)(12 + 91)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.F("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ࡯࢞ࡩ࢛࢘࢑ࢎ࢕࢙ࢗ࢖ࢧ࢒ࢡ࢜", (byte)7, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_222.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 160 | 0 << ~160 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = -1 >>> 82 | -1 << ~82 + 1;
        d = Long.reverse(3561275675041696313L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-2491562224144250311L);
        g = Long.reverse(-1441151880758558720L);
        h = 8192 >>> 44 | 8192 << -44;
        i = Long.reverse(-2491562224144250311L);
        j = Long.reverse(-1441151880758558720L);
        k = Integer.reverse(-1073741824);
        l = Integer.reverse(-1);
        m = Long.reverse(3561275675041696313L);
        n = 0x8000000 >>> 153 | 0x8000000 << -153;
        o = Long.reverse(-2491562224144250311L);
        p = Long.reverse(-1441151880758558720L);
        q = 2560 >>> 73 | 2560 << -73;
        r = 1280 >>> 8 | 1280 << ~8 + 1;
        var_java_lang_String_arr_a = new String[q];
        var_java_lang_String_arr_b = new String[r];
        NLoginCore_222.b();
    }

    public static Yaml a(boolean bl) {
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setProcessComments(bl);
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setProcessComments(bl);
        return new Yaml((BaseConstructor)new Constructor(loaderOptions), new Representer(dumperOptions), dumperOptions, loaderOptions);
    }

    private static void b() {
        int n;
        var_long_c = -7182792367453489477L;
        long l = var_long_c ^ 0xD8E2589D91AA4920L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(12 + 57), (byte)(32 + 51), (byte)(23 + 24), (byte)(16 + 51), (byte)(40 + 26), 67, (byte)(14 + 33), (byte)(40 + 40), (byte)(52 + 23), (byte)(46 + 21), (byte)(74 + 9), (byte)(36 + 17), (byte)(70 + 10), (byte)(12 + 85), (byte)(15 + 85), (byte)(69 + 31), (byte)(79 + 26), 110, (byte)(14 + 89)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(82 + 1)}, StandardCharsets.UTF_8));
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
                    NLoginCore_222.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ƅŘłţŢƐƁſŽƍųőƍŪƅŴŕƅƖŔƉƍƙƟƊŽųƦƄƥŽƀŜſŶŸƩƏũŨƞƦƢŹ", (byte)73, 66);
                    NLoginCore_222.var_java_lang_String_arr_b[1] = NLoginCore_446.A("ŴĽŵŪšŌſƊůŦŠř", (byte)73, 65);
                    NLoginCore_222.var_java_lang_String_arr_b[2] = NLoginCore_076.B("ŉŷŽŶņŠŋňƁżƎř", (byte)73, 66);
                    NLoginCore_222.var_java_lang_String_arr_b[3] = NLoginCore_384.B("ũŚśƂƄƊżřűŢœř", (byte)73, 66);
                    NLoginCore_222.var_java_lang_String_arr_b[4] = NLoginCore_201.A("ƅŘłţŢƐƁſŽƍűƖƈŗƔŹƋƊƚœżƎŗũšŴƜţşųƝƊƅŻŴţƁšƞžƜƃƮŹ", (byte)73, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_222.var_java_lang_String_arr_b[0] = NLoginCore_201.B("ƅŘłţŢƐƁſŽƍųőƍŪƅŴŕƅƖŔƉƍƙƟƊŽųƦƄƥŽƀƖŵƥơťƫżƊơƓƈŹ", (byte)73, 66);
                    NLoginCore_222.var_java_lang_String_arr_b[1] = NLoginCore_324.A("ŗŊŌƅţŉŘŏźŉƆř", (byte)73, 65);
                    NLoginCore_222.var_java_lang_String_arr_b[2] = NLoginCore_201.E("տչտ՟հՑԻՒՔկղՍ", (byte)73, 69);
                    NLoginCore_222.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ӔӢԂөԌԄӻԌӱӜӯӘ", (byte)73, 68);
                    NLoginCore_222.var_java_lang_String_arr_b[4] = NLoginCore_027.D("ԄӗӁӢӡԏԀӾӼԌӰԕԇӖԓӸԊԉԙӒӻԍӖӨӠӳԛӢӞӲԜԉԈөԤԘԌӤӺӧԞԜԝӸ", (byte)73, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_222.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ńťŖŹŦŦŏřŮƒŲšŌƎŒŤŨƒƖƜƌƐŵŶƂſƗŹšŝƈƅ", (byte)73, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_222.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ӖӧӺԌӗӚԌԀӼӲӧԊӏӪӸԕԖԑӼөԞӦӣӤ", (byte)73, 67);
                }
            }
        }
    }
}

