/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_103 {
    private static long var_long_b;
    private static int k;
    private static long c;
    private final NLoginCore_103 var_com_nickuc_login_NLoginCore_103_a;
    private static int h;
    private static int p;
    private static int t;
    final Map<String, Object> cfr_renamed_4 = new LinkedHashMap<String, Object>();
    private static int r;
    private static int e;
    private static int u;
    private static int g;
    private static int v;
    private static String[] var_java_lang_String_arr_a;
    private static int j;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static int o;
    private static long var_long_d;
    private static int i;
    private static final char var_char_a;
    private static int m;
    private static int l;
    private static int var_int_a;
    private static int q;
    private static long s;
    private static int n;

    public String k(String string) {
        Object object = this.e(string);
        return this.g(string, (String)(object instanceof String ? (String)object : NLoginCore_103.c("㺀", (int)r, (long)s)));
    }

    public NLoginCore_103 b(String string) {
        Object object = this.e(string);
        return (NLoginCore_103)this.a(string, (T)(object instanceof NLoginCore_103 ? object : new NLoginCore_103(this.var_com_nickuc_login_NLoginCore_103_a == null ? null : this.var_com_nickuc_login_NLoginCore_103_a.b(string))));
    }

    public List<String> k(String string) {
        List<?> list = this.l(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object obj : list) {
            if (!(obj instanceof String)) continue;
            arrayList.add((String)obj);
        }
        return arrayList;
    }

    private String j(String string) {
        int n = string.indexOf(h);
        return n == i ? string : string.substring(n + j);
    }

    public boolean l(String string) {
        return (this.a(string, (T)null) != null ? k : l) != 0;
    }

    public void a(String string, Object object) {
        NLoginCore_103 NLoginCore_1032;
        if (object instanceof Map) {
            object = new NLoginCore_103((Map)object, this.var_com_nickuc_login_NLoginCore_103_a == null ? null : this.var_com_nickuc_login_NLoginCore_103_a.b(string));
        }
        if ((NLoginCore_1032 = this.com_nickuc_login_NLoginCore_103_a(string)) == this) {
            if (object == null) {
                this.cfr_renamed_4.remove(string);
            } else {
                this.cfr_renamed_4.put(string, object);
            }
        } else {
            NLoginCore_1032.a(this.j(string), object);
        }
    }

    public List<Long> f(String string) {
        List<?> list = this.l(string);
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(((Number)obj).longValue());
        }
        return arrayList;
    }

    public byte a(String string, byte by) {
        Byte by2 = this.a(string, (T)by);
        return by2 instanceof Number ? ((Number)by2).byteValue() : by;
    }

    public Collection<String> e() {
        return new LinkedHashSet<String>(this.cfr_renamed_4.keySet());
    }

    NLoginCore_103(Map<?, ?> map, NLoginCore_103 NLoginCore_1032) {
        this.var_com_nickuc_login_NLoginCore_103_a = NLoginCore_1032;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String string;
            String string2 = string = entry.getKey() == null ? NLoginCore_103.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)) : entry.getKey().toString();
            if (entry.getValue() instanceof Map) {
                this.cfr_renamed_4.put(string, new NLoginCore_103((Map)entry.getValue(), NLoginCore_1032 == null ? null : NLoginCore_1032.b(string)));
                continue;
            }
            this.cfr_renamed_4.put(string, entry.getValue());
        }
    }

    public List<Byte> c(String string) {
        List<?> list = this.l(string);
        ArrayList<Byte> arrayList = new ArrayList<Byte>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(((Number)obj).byteValue());
        }
        return arrayList;
    }

    public double double_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).doubleValue() : 0.0);
    }

    private NLoginCore_103 com_nickuc_login_NLoginCore_103_a(String string) {
        int n = string.indexOf(e);
        if (n == f) {
            return this;
        }
        String string2 = string.substring(g, n);
        Object object = this.cfr_renamed_4.get(string2);
        if (object == null) {
            object = new NLoginCore_103(this.var_com_nickuc_login_NLoginCore_103_a == null ? null : this.var_com_nickuc_login_NLoginCore_103_a.b(string2));
            this.cfr_renamed_4.put(string2, object);
        }
        return (NLoginCore_103)object;
    }

    public char a(String string, char c) {
        Character c2 = this.a(string, (T)Character.valueOf(c));
        return c2 instanceof Character ? c2.charValue() : c;
    }

    public float a(String string, float f) {
        Float f2 = this.a(string, (T)Float.valueOf(f));
        return f2 instanceof Number ? ((Number)f2).floatValue() : f;
    }

    static {
        var_int_a = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-1679541903181808983L);
        var_long_d = Long.reverse(0x1C00000000000000L);
        e = Integer.reverse(0x74000000);
        f = Integer.reverse(-1);
        g = 0 >>> 8 | 0 << ~8 + 1;
        h = (11776 >>> 136 | 11776 << ~136 + 1) & 0xFFFFFFFF;
        i = -1 >>> 25 | -1 << -25;
        j = Integer.reverse(Integer.MIN_VALUE);
        k = 2048 >>> 107 | 2048 << ~107 + 1;
        l = 0 >>> 52 | 0 << -52;
        m = Integer.reverse(0);
        n = Integer.reverse(0);
        o = (0 >>> 105 | 0 << ~105 + 1) & 0xFFFFFFFF;
        p = Integer.reverse(0);
        q = Integer.reverse(0);
        r = Integer.reverse(Integer.MIN_VALUE);
        s = Long.reverse(-814850774726673751L);
        t = Integer.reverse(0x40000000);
        u = Integer.reverse(0x40000000);
        v = (0x17000000 >>> 151 | 0x17000000 << ~151 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[t];
        var_java_lang_String_arr_b = new String[u];
        NLoginCore_103.b();
        var_char_a = (char)v;
    }

    public int a(String string, int n) {
        Integer n2 = this.a(string, (T)n);
        return n2 instanceof Number ? ((Number)n2).intValue() : n;
    }

    public long a(String string, long l) {
        Long l2 = this.a(string, (T)l);
        return l2 instanceof Number ? ((Number)l2).longValue() : l;
    }

    public List<Character> j(String string) {
        List<?> list = this.l(string);
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (Object obj : list) {
            if (!(obj instanceof Character)) continue;
            arrayList.add((Character)obj);
        }
        return arrayList;
    }

    public List<Boolean> i(String string) {
        List<?> list = this.l(string);
        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
        for (Object obj : list) {
            if (!(obj instanceof Boolean)) continue;
            arrayList.add((Boolean)obj);
        }
        return arrayList;
    }

    public String g(String string, String string2) {
        String string3 = this.a(string, (T)string2);
        return string3 instanceof String ? string3 : string2;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_103.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.F("ՐղմՔո֗֏֥֑ՠ֢֞֔֜ե֊֣֣֬֫֩ո", (byte)108, 70), NLoginCore_103.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.C("՜թըԫիէբինեԲհմխհնԸࣈࣈࢵ࣎ࢩࣂࣂࣙࣇࣉࣉࣗࢶ࣑Ւ", (byte)108, 67) + string + NLoginCore_027.C("Գ", (byte)108, 67) + methodType.toString(), exception);
        }
    }

    public short short_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).shortValue() : n);
    }

    public float float_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).floatValue() : 0.0f);
    }

    public int int_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).intValue() : o);
    }

    public byte byte_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).byteValue() : m);
    }

    public Object java_lang_Object_a(String string) {
        return this.a(string, (T)this.e(string));
    }

    private static String a(int n, long l) {
        l ^= 0x38L;
        l ^= 0xC1503A70051402E5L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(40 + 28), (byte)(49 + 20), (byte)(35 + 48), (byte)(25 + 22), 67, (byte)(29 + 37), (byte)(17 + 50), (byte)(34 + 13), (byte)(49 + 31), (byte)(26 + 49), (byte)(63 + 4), (byte)(13 + 70), (byte)(48 + 5), (byte)(73 + 7), (byte)(6 + 91), 100, (byte)(34 + 66), (byte)(69 + 36), (byte)(43 + 67), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.E("՜թըԫիէբինեԲհմխհնԸࣈࣈࢵ࣎ࢩࣂࣂࣙࣇࣉࣉࣗࢶ࣑", (byte)61, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_103.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public List<?> a(String string, List<?> list) {
        List<?> list2 = this.a(string, (T)list);
        return list2 instanceof List ? list2 : list;
    }

    public NLoginCore_103(NLoginCore_103 NLoginCore_1032) {
        this(new LinkedHashMap(), NLoginCore_1032);
    }

    public char char_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Character ? ((Character)object).charValue() : q);
    }

    public List<Short> d(String string) {
        List<?> list = this.l(string);
        ArrayList<Short> arrayList = new ArrayList<Short>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(((Number)obj).shortValue());
        }
        return arrayList;
    }

    public Object e(String string) {
        return this.var_com_nickuc_login_NLoginCore_103_a == null ? null : this.var_com_nickuc_login_NLoginCore_103_a.java_lang_Object_a(string);
    }

    public short a(String string, short s) {
        Short s2 = this.a(string, (T)s);
        return s2 instanceof Number ? ((Number)s2).shortValue() : s;
    }

    public long long_a(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Number ? ((Number)object).longValue() : 0L);
    }

    public NLoginCore_103() {
        this(null);
    }

    public double a(String string, double d) {
        Double d2 = this.a(string, (T)d);
        return d2 instanceof Number ? ((Number)d2).doubleValue() : d;
    }

    private static void b() {
        int n;
        c = -7683300644441518825L;
        long l = c ^ 0xC1503A70051402E5L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(31 + 38), (byte)(55 + 28), (byte)(40 + 7), (byte)(37 + 30), (byte)(59 + 7), (byte)(6 + 61), 47, (byte)(44 + 36), (byte)(22 + 53), (byte)(51 + 16), 83, (byte)(13 + 40), (byte)(19 + 61), (byte)(67 + 30), (byte)(94 + 6), (byte)(32 + 68), (byte)(58 + 47), (byte)(95 + 15), (byte)(18 + 85)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_103.var_java_lang_String_arr_b[0] = NLoginCore_387.C("ӆһҪӃӐүӐӳӣӑөӀ", (byte)65, 67);
                    NLoginCore_103.var_java_lang_String_arr_b[1] = NLoginCore_223.A("łŋŻŬľŹƀŵļŞŶŉ", (byte)65, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_103.var_java_lang_String_arr_b[0] = NLoginCore_027.E("դեբՖմգՙզՒԱ՘մսԾյ՗ԽՆֈՄՆգՐՑ", (byte)65, 69);
                    NLoginCore_103.var_java_lang_String_arr_b[1] = NLoginCore_004.E("ԵիէժխՋՐԻՓՑՔՅ", (byte)65, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_103.var_java_lang_String_arr_b[0] = NLoginCore_384.E("զՖՙոՋլԲԶՉԷ՞խՠքհՐֆ՛ՑնեչՐՑ", (byte)65, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_103.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ӐҬӣҪӄҶӦӧӳӪӱӨӭӰӘӴәӠӓӐӽӚӐӘӛӠӅӛӛԀӘԅ", (byte)65, 67);
                }
            }
        }
    }

    public List<?> l(String string) {
        Object object = this.e(string);
        return this.a(string, (T)(object instanceof List ? (List)object : Collections.EMPTY_LIST));
    }

    public List<Integer> e(String string) {
        List<?> list = this.l(string);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(((Number)obj).intValue());
        }
        return arrayList;
    }

    public List<Float> g(String string) {
        List<?> list = this.l(string);
        ArrayList<Float> arrayList = new ArrayList<Float>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(Float.valueOf(((Number)obj).floatValue()));
        }
        return arrayList;
    }

    public <T> T a(String string, T t) {
        NLoginCore_103 NLoginCore_1032 = this.com_nickuc_login_NLoginCore_103_a(string);
        Object object = NLoginCore_1032 == this ? this.cfr_renamed_4.get(string) : NLoginCore_1032.a(this.j(string), t);
        if (object == null && t instanceof NLoginCore_103) {
            this.cfr_renamed_4.put(string, t);
        }
        return (T)(object != null ? object : t);
    }

    public boolean m(String string) {
        Object object = this.e(string);
        return this.a(string, object instanceof Boolean ? (Boolean)object : p);
    }

    public boolean a(String string, boolean bl) {
        Boolean bl2 = this.a(string, (T)bl);
        return bl2 instanceof Boolean ? bl2 : bl;
    }

    public List<Double> h(String string) {
        List<?> list = this.l(string);
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (Object obj : list) {
            if (!(obj instanceof Number)) continue;
            arrayList.add(((Number)obj).doubleValue());
        }
        return arrayList;
    }
}

