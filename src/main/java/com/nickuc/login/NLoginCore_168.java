/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_040;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class NLoginCore_168<T extends NLoginCore_116<?>> {
    private List<String> var_java_util_List_java_lang_String__k;
    private static int l;
    private String Z;
    private static int j;
    private boolean var_boolean_am;
    private static long p;
    private static int d;
    private static int q;
    private static final Set<String> var_java_util_Set_java_lang_String__o;
    private static int n;
    private static int aa;
    private static long ac;
    private boolean var_boolean_al;
    private static int var_int_e;
    private static int x;
    private static int an;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static long s;
    private static int u;
    private static long var_long_k;
    private static double var_double_a;
    private static int y;
    private static int aj;
    private static double var_double_b;
    private static int m;
    private static long v;
    private static long h;
    private static int z;
    private static int i;
    private static int ae;
    protected T var_T_a;
    private static long af;
    private static String[] var_java_lang_String_arr_b;
    private static int w;
    private static final Cache<String, Long> cfr_renamed_12;
    private static int var_int_c;
    private double var_double_e = var_double_a;
    private String bw;
    private static int ad;
    private NLoginInterface_040 var_com_nickuc_login_NLoginInterface_040_a;
    private static long ab;
    private static int var_int_o;
    private double var_double_f = var_double_b;
    private static long ah;
    private static int var_int_al;
    private static long t;
    private static long ai;
    private static long ak;
    private static int var_int_f;
    private static int g;
    private static int r;
    private List<String> var_java_util_List_java_lang_String__b;
    private static int ag;
    private static int var_int_am;
    private static long ao;

    @Generated
    public NLoginCore_168<T> a(boolean bl) {
        this.var_boolean_al = bl;
        return this;
    }

    @Generated
    public NLoginCore_168<T> b(String string) {
        this.bw = string;
        return this;
    }

    @Generated
    public NLoginCore_168<T> a(String string) {
        this.Z = string;
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public final List<String> a(Object object, String string, boolean bl, String string2, String[] stringArray) {
        Object object2;
        String string3 = (String)NLoginCore_168.c("㺀", (int)(n & var_int_o), (long)p) + string.toLowerCase(Locale.ENGLISH);
        if (bl) {
            object2 = (Long)cfr_renamed_12.getIfPresent((Object)string3);
            long l = System.currentTimeMillis();
            if (object2 != null && (double)(l - (Long)object2) <= this.var_double_e) {
                return null;
            }
            cfr_renamed_12.put((Object)string3, (Object)l);
        }
        if (this.var_boolean_al && !var_java_util_Set_java_lang_String__o.add(string3)) {
            return null;
        }
        try {
            object2 = bl ? this.var_com_nickuc_login_NLoginInterface_040_a.a(object) : this.var_com_nickuc_login_NLoginInterface_040_a.com_nickuc_login_NLoginInterface_006_a();
            List<String> list = this.d((NLoginCore_494)object2, string2, stringArray);
            return list;
        }
        finally {
            var_java_util_Set_java_lang_String__o.remove(string3);
        }
    }

    public void s() {
    }

    @Generated
    public T a() {
        return (T)this.var_java_lang_String_arr_a;
    }

    protected List<String> a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        return null;
    }

    public final void d(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!this.a(NLoginInterface_0422, string, stringArray, l != 0)) {
            return;
        }
        Runnable runnable = () -> {
            if (NLoginInterface_0422 instanceof NLoginCore_277 && !((NLoginCore_277)NLoginInterface_0422).R()) {
                return;
            }
            try {
                this.b(NLoginInterface_0422, string, stringArray);
            }
            catch (Exception exception) {
                NLoginInterface_0422.k((String)NLoginCore_168.c("㺀", (int)aa, (long)(ab ^ ac)));
                NLoginCore_370.c((String)NLoginCore_168.c("㺃", (int)(ad & ae), (long)af) + string.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_168.c("㺆", (int)ag, (long)(ah ^ ai)) + NLoginInterface_0422.getName() + (String)NLoginCore_168.c("㺉", (int)aj, (long)ak) + this.var_boolean_am, exception, new Object[var_int_al]);
            }
        };
        if (this.var_boolean_am) {
            this.var_java_lang_String_arr_a.b(m != 0).a(runnable);
        } else {
            runnable.run();
        }
    }

    public NLoginCore_168(String string) {
        this.var_boolean_al = var_int_c;
        this.Z = string;
        this.var_double_b = (double)new ArrayList();
        this.var_java_util_List_java_lang_String__k = new ArrayList<String>();
    }

    public NLoginCore_168<T> b() {
        this.var_boolean_am = var_int_e;
        return this;
    }

    @Generated
    public NLoginCore_168<T> a(double d) {
        this.var_double_e = d;
        return this;
    }

    @Generated
    public List<String> d() {
        return this.var_java_util_List_java_lang_String__k;
    }

    @Generated
    public NLoginCore_168<T> a(List<String> list) {
        this.var_double_b = (double)list;
        return this;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_168.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("ӬԎԐӰԔԳԫՁԭӼԺ԰ԾԸԁԦՈՇԿՅԿԔ", (byte)8, 70), NLoginCore_168.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("ԧԴԳӶԶԲԭԶՁ԰ӽԻԿԸԻՁԃࢎ࢝࢘ࢀ࢓࢏࢛ࢡ࢛Ԙ", (byte)8, 70) + string + NLoginCore_384.E("Ӿ", (byte)8, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public double double_b() {
        return this.var_double_f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(Object object, String string, boolean bl, String string2, String[] stringArray) {
        Object object2;
        String string3 = (String)NLoginCore_168.c("㺀", (int)(var_int_f & g), (long)h) + string.toLowerCase(Locale.ENGLISH);
        if (bl) {
            object2 = (Long)cfr_renamed_12.getIfPresent((Object)string3);
            long l = System.currentTimeMillis();
            if (object2 != null && (double)(l - (Long)object2) <= this.var_double_e) {
                return;
            }
            cfr_renamed_12.put((Object)string3, (Object)l);
        }
        if (this.var_boolean_al && !var_java_util_Set_java_lang_String__o.add(string3)) {
            return;
        }
        try {
            object2 = bl ? this.var_com_nickuc_login_NLoginInterface_040_a.a(object) : this.var_com_nickuc_login_NLoginInterface_040_a.com_nickuc_login_NLoginInterface_006_a();
            this.d((NLoginCore_494)object2, string2, stringArray);
        }
        finally {
            var_java_util_Set_java_lang_String__o.remove(string3);
        }
    }

    @Generated
    public double a() {
        return this.var_double_e;
    }

    protected boolean a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray, boolean bl) {
        if (this.var_java_util_List_java_lang_String__k.isEmpty()) {
            return x != 0;
        }
        for (String string2 : this.var_java_util_List_java_lang_String__k) {
            if (!NLoginInterface_0422.i(string2)) continue;
            return y != 0;
        }
        return z != 0;
    }

    @Generated
    public boolean aq() {
        return this.var_boolean_am;
    }

    private List<String> d(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (!this.a(NLoginInterface_0422, string, stringArray, q != 0)) {
            return null;
        }
        try {
            return this.a(NLoginInterface_0422, string, stringArray);
        }
        catch (Exception exception) {
            NLoginInterface_0422.k((String)NLoginCore_168.c("㺀", (int)r, (long)(s ^ t)));
            NLoginCore_370.c((String)NLoginCore_168.c("㺃", (int)u, (long)v) + string.toLowerCase(Locale.ENGLISH), exception, new Object[w]);
            return null;
        }
    }

    private static String a(int n, long l) {
        l ^= 0x56L;
        l ^= 0x861BFCC921CA9220L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(57 + 12), (byte)(24 + 59), (byte)(6 + 41), (byte)(23 + 44), (byte)(36 + 30), (byte)(4 + 63), (byte)(29 + 18), (byte)(9 + 71), (byte)(63 + 12), (byte)(20 + 47), (byte)(37 + 46), (byte)(19 + 34), 80, (byte)(32 + 65), (byte)(99 + 1), 100, (byte)(41 + 64), (byte)(104 + 6), (byte)(58 + 45)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.B("öăĂÅąāüąĐÿÌĊĎćĊĐÒѝѬѧяѢўѪѰѪ", (byte)10, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_168.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public NLoginInterface_021 a(NLoginCore_116<?> NLoginInterface_0112) {
        this.var_java_lang_String_arr_a = NLoginInterface_0112;
        this.var_com_nickuc_login_NLoginInterface_040_a = this.var_java_lang_String_arr_a.com_nickuc_login_NLoginInterface_040_b();
        NLoginInterface_021 NLoginInterface_0212 = this.var_com_nickuc_login_NLoginInterface_040_a.a(this);
        NLoginInterface_0212.W();
        this.s();
        return NLoginInterface_0212;
    }

    protected abstract void b(NLoginCore_494 var1, String var2, String[] var3);

    @Generated
    public String aa() {
        return this.Z;
    }

    public void a(String ... stringArray) {
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = d; i < n; ++i) {
            String string = stringArray2[i];
            this.var_double_b.add(string.toLowerCase(Locale.ENGLISH));
        }
    }

    @Generated
    public String ab() {
        return this.bw;
    }

    @Generated
    public NLoginCore_168<T> b(List<String> list) {
        this.var_java_util_List_java_lang_String__k = list;
        return this;
    }

    private static void void_b() {
        int n;
        var_long_c = -1692458702756247716L;
        long l = var_long_c ^ 0x861BFCC921CA9220L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(2 + 67), (byte)(40 + 43), (byte)(7 + 40), (byte)(53 + 14), 66, (byte)(62 + 5), (byte)(15 + 32), (byte)(39 + 41), (byte)(71 + 4), 67, (byte)(19 + 64), (byte)(20 + 33), (byte)(9 + 71), (byte)(72 + 25), (byte)(18 + 82), (byte)(55 + 45), (byte)(35 + 70), (byte)(22 + 88), (byte)(102 + 1)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
                    NLoginCore_168.var_java_lang_String_arr_b[0] = NLoginCore_384.E("ԴեՉճխԺպոնՍշՆ", (byte)66, 69);
                    NLoginCore_168.var_java_lang_String_arr_b[1] = NLoginCore_027.B("ĹŪŎŸŲĿſŽŻŒżŋ", (byte)66, 66);
                    NLoginCore_168.var_java_lang_String_arr_b[2] = NLoginCore_092.E("՟Տա԰հղ՗ջոշաՆ", (byte)66, 69);
                    NLoginCore_168.var_java_lang_String_arr_b[3] = NLoginCore_004.D("ҬӉөҴҷӎӘҴӎӘӝӒӻӷӓәӹӘӽԅӦӨӥԇԌӦӦӽӻӟӰӪԃӎԏӐӨԑԎӮԖӻԈӚәӷӭӮԕӯԧӹӹӴӴԡӹԝԤӬԠӱԭԀԆԤԋԴԆӴԃԺԈԔԹԝԍԏӽԷԛԅԒԙԷԈԦԸԝԆՃՄԂԐԺԞԋԠՃԏԳԩԭԶՍԳ՞ԹԖ՞ՙԝՂԾ՚ՔԧԦԢԡբԺԼ՝ՉՒՠՀ", (byte)66, 68);
                    NLoginCore_168.var_java_lang_String_arr_b[4] = NLoginCore_324.A("ŔŋűŜůƀľŹťŕŚżƆŜŔŚśƅŞƇōƎŭŦƂƋŷŠŪƃŭƈƌŻŘŗŭŲƚšŻŽƤū", (byte)66, 65);
                    NLoginCore_168.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐƆƩƘƫƕƥƢŻƄƍſƥƍůƋƱŶƸƸƃƩƍƩƗƵƀƸƟƼƵƃƜƕƗƱƚǀƵƽƅƣǋǍƉƮƱƦƒǉǏǈƺǏƹǔƐǇǀƛơǖƽǡǒǃƣǨƳƼǫǈƪƽǛǂƿǜƴǉǬǉǐǮƸǚ", (byte)66, 66);
                    NLoginCore_168.var_java_lang_String_arr_b[6] = NLoginCore_110.A("ŔŋűŜůƀľŹťŕśŕűƈŜŉŋŊſŉƅƊƁōŝŐŔŬŏƃūƅ", (byte)66, 65);
                    NLoginCore_168.var_java_lang_String_arr_b[7] = NLoginCore_451.E("ԵԶՙԲյջչհ՟ԺթՔփՕՁՁ՗՞գես֊ՑՒ", (byte)66, 69);
                    NLoginCore_168.var_java_lang_String_arr_b[8] = NLoginCore_384.C("ӡӱҾӃӄӔөӌәӍӓӪӜӝӼӔӄӓӝӏәӷӎӏ", (byte)66, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_168.var_java_lang_String_arr_b[0] = NLoginCore_173.F("գ՘ՈԲնԮ՜՝ՌՠտՆ", (byte)66, 70);
                    NLoginCore_168.var_java_lang_String_arr_b[1] = NLoginCore_223.D("ӭӫӀӟӣӇӧҶӻӜӴӃ", (byte)66, 68);
                    NLoginCore_168.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ԮԳՋդիՖԵպ՜ՖՉՆ", (byte)66, 69);
                    NLoginCore_168.var_java_lang_String_arr_b[3] = NLoginCore_223.A("ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐŢšſŵŶƝŷƯƁƁżżƩƁƥƬŴƨŹƵƈƎƬƓƼƎżƋǂƐƜǁƥƕƗƅƿƣƍƚơƿƐƮǀƥƎǋǌƊƘǂƦƓƨǋƗƻƱƵƾǕƻǦǁƞǦǡƥǊǆǢǜƯƧƩƮƦǉǲǓǩǅǱǅ", (byte)66, 65);
                    NLoginCore_168.var_java_lang_String_arr_b[4] = NLoginCore_324.C("ӌӃөӔӧӸҶӱӝӍӒӴӾӔӌӒӓӽӖӿӅԆӥӞӺԃӯӘӢӻӥԀԑӝӎӔӤӳԖԔԛӺӨӟԟӠӿӿӬӢԕԓԀԗӮӯ", (byte)66, 67);
                    NLoginCore_168.var_java_lang_String_arr_b[5] = NLoginCore_324.B("ĴőűļĿŖŠļŖŠťŚƃſśšƁŠƅƍŮŰŭƏƔŮŮƅƃŧŸŲƋŖƗŘŰƙƖŶƞƃƐƆƩƘƫƕƥƢŻƄƍſƥƍůƋƱŶƸƸƃƩƍƩƗƵƀƸƟƼƵƃƜƕƗƱƚǀƵƽƅƣǋǍƉƮƱƦƒǉǏǈƺǏƹǔƐǇǀƛơǖƽǡǒǃƣǨƳƼǫǈƪƽǛƺǣǊǀƽƱǔǆǬǆǰǫƴǇǞƸǶǐǟǍǑȀǋ", (byte)66, 66);
                    NLoginCore_168.var_java_lang_String_arr_b[6] = NLoginCore_427.C("ӌӃөӔӧӸҶӱӝӍӓӍөԀӔӁӃӂӷӁӽӿԃԉӥӠӬӾӐӮӥԊӠԋӳӣԌӷӥӦԘԎӮӣ", (byte)66, 67);
                    NLoginCore_168.var_java_lang_String_arr_b[7] = NLoginCore_384.E("ԵԶՙԲյջչհ՟Ժթհյս՘դւՇՑևգՔՑՒ", (byte)66, 69);
                    NLoginCore_168.var_java_lang_String_arr_b[8] = NLoginCore_201.D("ӡӱҾӃӄӔөӌәӍӕӝҼӭӏӤһӥӣәӾӷӎӏ", (byte)66, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_168.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ĲĳųŴŋƂžżĺŚņţŖŕśżńŚŪŉżƋƇŮőƁŔūƘŖŭŵ", (byte)66, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_168.var_java_lang_String_arr_b[0] = NLoginCore_027.E("խՓՄՆզԸվծիԼլԺ՛աՁմՒքճ՘ջ֊ՑՒ", (byte)66, 69);
                }
            }
        }
    }

    @Generated
    public NLoginCore_168<T> b(double d) {
        this.var_double_f = d;
        return this;
    }

    @Generated
    public List<String> c() {
        return this.var_double_b;
    }

    @Generated
    public boolean ap() {
        return this.var_boolean_al;
    }

    @Generated
    public NLoginInterface_040 com_nickuc_login_NLoginInterface_040_b() {
        return this.var_com_nickuc_login_NLoginInterface_040_a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void c(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        String string2 = (String)NLoginCore_168.c("㺀", (int)(i & j), (long)var_long_k) + NLoginInterface_0422.getName().toLowerCase(Locale.ENGLISH);
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            Long l = (Long)cfr_renamed_12.getIfPresent((Object)string2);
            long l2 = System.currentTimeMillis();
            if (l != null && (double)(l2 - l) <= this.var_double_e) {
                return;
            }
            cfr_renamed_12.put((Object)string2, (Object)l2);
        }
        if (this.var_boolean_al && !var_java_util_Set_java_lang_String__o.add(string2)) {
            return;
        }
        try {
            this.d(NLoginInterface_0422, string, stringArray);
        }
        finally {
            var_java_util_Set_java_lang_String__o.remove(string2);
        }
    }

    static {
        var_double_a = Double.longBitsToDouble(Long.reverse(2044L));
        var_double_b = Double.longBitsToDouble(Long.reverse(6456360425798341628L));
        var_int_c = 2048 >>> 75 | 2048 << -75;
        d = (0 >>> 29 | 0 << -29) & 0xFFFFFFFF;
        var_int_e = Integer.reverse(Integer.MIN_VALUE);
        var_int_f = 0 >>> 211 | 0 << ~211 + 1;
        g = Integer.reverse(-1);
        h = Long.reverse(5827742062194508055L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (-1 >>> 167 | -1 << -167) & 0xFFFFFFFF;
        var_long_k = Long.reverse(5827742062194508055L);
        l = Integer.reverse(0);
        m = 0x40000000 >>> 62 | 0x40000000 << -62;
        n = (65536 >>> 143 | 65536 << -143) & 0xFFFFFFFF;
        var_int_o = -1 >>> 31 | -1 << ~31 + 1;
        p = Long.reverse(5827742062194508055L);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(-1073741824);
        s = Long.reverse(4242474993360093463L);
        t = Long.reverse(0x6A00000000000000L);
        u = 4096 >>> 42 | 4096 << -42;
        v = Long.reverse(5827742062194508055L);
        w = 0 >>> 55 | 0 << ~55 + 1;
        x = (128 >>> 167 | 128 << ~167 + 1) & 0xFFFFFFFF;
        y = Integer.reverse(Integer.MIN_VALUE);
        z = Integer.reverse(0);
        aa = (5120 >>> 74 | 5120 << -74) & 0xFFFFFFFF;
        ab = Long.reverse(4242474993360093463L);
        ac = Long.reverse(0x6A00000000000000L);
        ad = Integer.reverse(0x60000000);
        ae = -1 >>> 126 | -1 << -126;
        af = Long.reverse(5827742062194508055L);
        ag = Integer.reverse(-536870912);
        ah = Long.reverse(4242474993360093463L);
        ai = Long.reverse(0x6A00000000000000L);
        aj = 32768 >>> 140 | 32768 << ~140 + 1;
        ak = Long.reverse(5827742062194508055L);
        var_int_al = (0 >>> 240 | 0 << -240) & 0xFFFFFFFF;
        var_int_am = (2304 >>> 136 | 2304 << ~136 + 1) & 0xFFFFFFFF;
        an = 589824 >>> 208 | 589824 << ~208 + 1;
        ao = Long.reverse(-6917529027641081856L);
        var_java_lang_String_arr_a = new String[var_int_am];
        var_java_lang_String_arr_b = new String[an];
        NLoginCore_168.void_b();
        var_java_util_Set_java_lang_String__o = ConcurrentHashMap.newKeySet();
        cfr_renamed_12 = Caffeine.newBuilder().expireAfterWrite(ao, TimeUnit.SECONDS).build();
    }

    public void u(String string) {
        this.var_java_util_List_java_lang_String__k.add(string.toLowerCase(Locale.ENGLISH));
    }
}

