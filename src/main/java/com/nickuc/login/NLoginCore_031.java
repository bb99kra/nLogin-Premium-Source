/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_398;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_363;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_031
implements NLoginCore_363 {
    private static int af;
    private static int t;
    private static int var_int_a;
    private static int ak;
    private static int am;
    private static int ap;
    private static int i;
    private static int u;
    private static int f;
    private static int ab;
    private static int ag;
    private static int y;
    private static int ad;
    private static int var_int_c;
    private static long d;
    private static int aj;
    private static int ao;
    private static long j;
    private static int ac;
    private final String aF;
    private static long var_long_h;
    private static int aa;
    private final boolean U;
    private static int s;
    private final String aD;
    private static int ai;
    private static int v;
    private static int aq;
    private static int p;
    private static long var_long_c;
    private static int x;
    private static int al;
    private static long m;
    private static int var_int_b;
    private static int w;
    private static int l;
    private static String[] var_java_lang_String_arr_a;
    private final String aE;
    private static long e;
    private static int ah;
    private static int q;
    private static int an;
    @Nullable
    private final String aG;
    private static int n;
    private static long k;
    private static int ar;
    private static int z;
    private static long g;
    private static int ae;
    private static int r;
    private final boolean T;
    private final List<NLoginCore_398> var_java_util_List_com_nickuc_login_NLoginCore_398__h;
    private static int o;
    private static String[] var_java_lang_String_arr_b;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_031.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.A("çĉċëďĮĦļĨ÷ĵīĹĳüġŃłĺŀĺď", (byte)32, 65), NLoginCore_031.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.C("Ѹ҅҄ч҇҃Ѿ҇ҒҁюҌҐ҉ҌҒєߗߨ߈ߏ߅ߠߧ߯ߗ߷ߦѫ", (byte)32, 67) + string + NLoginCore_223.F("Ԗ", (byte)32, 70) + methodType.toString(), exception);
        }
    }

    @Override
    @Generated
    public boolean boolean_c() {
        return this.U;
    }

    @Generated
    public int hashCode() {
        int n = y;
        int n2 = z;
        n2 = n2 * aa + (this.boolean_b() ? ab : ac);
        n2 = n2 * ad + (this.boolean_c() ? ae : af);
        String string = this.java_lang_String_a();
        n2 = n2 * ag + (string == null ? ah : string.hashCode());
        String string2 = this.java_lang_String_b();
        n2 = n2 * ai + (string2 == null ? aj : string2.hashCode());
        String string3 = this.getVersion();
        n2 = n2 * ak + (string3 == null ? al : string3.hashCode());
        String string4 = this.java_lang_String_c();
        n2 = n2 * am + (string4 == null ? an : string4.hashCode());
        List<NLoginCore_398> list = this.a();
        n2 = n2 * ao + (list == null ? ap : ((Object)list).hashCode());
        return n2;
    }

    private static String a(int n, long l) {
        l ^= 0x4DL;
        l ^= 0xDDBE8BE374507D02L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), 69, (byte)(40 + 43), (byte)(44 + 3), (byte)(46 + 21), (byte)(4 + 62), (byte)(24 + 43), (byte)(5 + 42), (byte)(50 + 30), (byte)(50 + 25), (byte)(12 + 55), (byte)(38 + 45), (byte)(36 + 17), 80, (byte)(14 + 83), (byte)(87 + 13), (byte)(87 + 13), (byte)(41 + 64), (byte)(18 + 92), (byte)(59 + 44)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("ĖģĢåĥġĜĥİğìĪĮħĪİòѵ҆ѦѭѣѾ҅ҍѵҕ҄", (byte)26, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_031.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return n != 0;
        }
        if (!(object instanceof NLoginCore_031)) {
            return o != 0;
        }
        NLoginCore_031 NLoginCore_0312 = (NLoginCore_031)object;
        if (!NLoginCore_0312.b(this)) {
            return p != 0;
        }
        if (this.boolean_b() != NLoginCore_0312.boolean_b()) {
            return q != 0;
        }
        if (this.boolean_c() != NLoginCore_0312.boolean_c()) {
            return r != 0;
        }
        String string = this.java_lang_String_a();
        String string2 = NLoginCore_0312.java_lang_String_a();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return s != 0;
        }
        String string3 = this.java_lang_String_b();
        String string4 = NLoginCore_0312.java_lang_String_b();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return t != 0;
        }
        String string5 = this.getVersion();
        String string6 = NLoginCore_0312.getVersion();
        if (string5 == null ? string6 != null : !string5.equals(string6)) {
            return u != 0;
        }
        String string7 = this.java_lang_String_c();
        String string8 = NLoginCore_0312.java_lang_String_c();
        if (string7 == null ? string8 != null : !string7.equals(string8)) {
            return v != 0;
        }
        List<NLoginCore_398> list = this.a();
        List<NLoginCore_398> list2 = NLoginCore_0312.a();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return w != 0;
        }
        return x != 0;
    }

    public NLoginCore_031(String string, String string2, String string3, @Nullable String string4, NLoginCore_398 ... NLoginCore_398Array) {
        this(string, string2, string3, string4, var_int_a != 0, var_int_b != 0, NLoginCore_398Array);
    }

    public NLoginCore_031(String string, String string2, String string3, @Nullable String string4, boolean bl, boolean bl2, NLoginCore_398 ... NLoginCore_398Array) {
        this.aD = string.replace((CharSequence)NLoginCore_031.c("㺀", (int)var_int_c, (long)(d ^ e)), (CharSequence)NLoginCore_031.c("㺃", (int)f, (long)(g ^ var_long_h)));
        this.aE = string2.replace((CharSequence)NLoginCore_031.c("㺆", (int)i, (long)(j ^ k)), (CharSequence)NLoginCore_031.c("㺉", (int)l, (long)m));
        this.aF = string3;
        this.aG = string4;
        this.T = bl;
        this.U = bl2;
        this.var_long_h = (long)Arrays.asList(NLoginCore_398Array);
    }

    @Override
    @Nullable
    @Generated
    public String java_lang_String_c() {
        return this.aG;
    }

    @Override
    @Generated
    public String getVersion() {
        return this.aF;
    }

    @Generated
    protected boolean b(Object object) {
        return object instanceof NLoginCore_031;
    }

    static {
        var_int_a = (0x400000 >>> 150 | 0x400000 << -150) & 0xFFFFFFFF;
        var_int_b = 4 >>> 66 | 4 << -66;
        var_int_c = 0 >>> 20 | 0 << ~20 + 1;
        d = Long.reverse(-5700010101555140080L);
        e = Long.reverse(-5620492334958379008L);
        f = (8192 >>> 109 | 8192 << ~109 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-5700010101555140080L);
        var_long_h = Long.reverse(-5620492334958379008L);
        i = 0x2000000 >>> 248 | 0x2000000 << -248;
        j = Long.reverse(-5700010101555140080L);
        k = Long.reverse(-5620492334958379008L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(208712609554950672L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = 0 >>> 109 | 0 << ~109 + 1;
        p = Integer.reverse(0);
        q = 0 >>> 98 | 0 << -98;
        r = Integer.reverse(0);
        s = Integer.reverse(0);
        t = (0 >>> 67 | 0 << -67) & 0xFFFFFFFF;
        u = 0 >>> 46 | 0 << -46;
        v = Integer.reverse(0);
        w = 0 >>> 33 | 0 << -33;
        x = 262144 >>> 210 | 262144 << ~210 + 1;
        y = 30932992 >>> 83 | 30932992 << ~83 + 1;
        z = (32 >>> 229 | 32 << ~229 + 1) & 0xFFFFFFFF;
        aa = (944 >>> 164 | 944 << -164) & 0xFFFFFFFF;
        ab = Integer.reverse(-234881024);
        ac = Integer.reverse(-2046820352);
        ad = (1933312 >>> 143 | 1933312 << ~143 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(-234881024);
        af = (1552 >>> 100 | 1552 << ~100 + 1) & 0xFFFFFFFF;
        ag = (-2147483619 >>> 191 | -2147483619 << ~191 + 1) & 0xFFFFFFFF;
        ah = 88064 >>> 75 | 88064 << -75;
        ai = (15104 >>> 168 | 15104 << -168) & 0xFFFFFFFF;
        aj = 0x2B00000 >>> 20 | 0x2B00000 << ~20 + 1;
        ak = (-671088639 >>> 187 | -671088639 << ~187 + 1) & 0xFFFFFFFF;
        al = Integer.reverse(-738197504);
        am = Integer.reverse(-603979776);
        an = Integer.reverse(-738197504);
        ao = (0xEC00000 >>> 86 | 0xEC00000 << -86) & 0xFFFFFFFF;
        ap = (22544384 >>> 83 | 22544384 << ~83 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(0x20000000);
        ar = (32768 >>> 173 | 32768 << -173) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[aq];
        var_java_lang_String_arr_b = new String[ar];
        NLoginCore_031.void_b();
    }

    @Override
    @Generated
    public List<NLoginCore_398> a() {
        return this.var_long_h;
    }

    @Override
    @Generated
    public String java_lang_String_b() {
        return this.aE;
    }

    private static void void_b() {
        int n;
        var_long_c = 601042657262610189L;
        long l = var_long_c ^ 0xDDBE8BE374507D02L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(10 + 59), (byte)(13 + 70), (byte)(36 + 11), (byte)(15 + 52), (byte)(65 + 1), (byte)(18 + 49), (byte)(2 + 45), (byte)(27 + 53), (byte)(2 + 73), (byte)(8 + 59), (byte)(3 + 80), (byte)(24 + 29), (byte)(64 + 16), (byte)(14 + 83), 100, (byte)(62 + 38), 105, (byte)(83 + 27), (byte)(43 + 60)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_031.var_java_lang_String_arr_b[0] = NLoginCore_076.B("ƈƪƚūƩƬƪƭƲűƨŻ", (byte)90, 66);
                    NLoginCore_031.var_java_lang_String_arr_b[1] = NLoginCore_173.D("ԄԫԛԙӻԏԠӽԄԥԅԋ", (byte)90, 68);
                    NLoginCore_031.var_java_lang_String_arr_b[2] = NLoginCore_223.D("ԘԺԪӻԹԼԺԽՂԁԸԋ", (byte)90, 68);
                    NLoginCore_031.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ԄԫԛԙӻԏԠӽԄԥԅԋ", (byte)90, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_031.var_java_lang_String_arr_b[0] = NLoginCore_092.D("ԐӳԒԵԩԿԖԸԄ԰ԁԋ", (byte)90, 68);
                    NLoginCore_031.var_java_lang_String_arr_b[1] = NLoginCore_384.B("ƨƎƖƬƫƝơŽƐƈƖŻ", (byte)90, 66);
                    NLoginCore_031.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ԴӷԞԗӶԘԍԏՄԘԦԋ", (byte)90, 68);
                    NLoginCore_031.var_java_lang_String_arr_b[3] = NLoginCore_201.E("ֆպեՎՉձ֍֌մմՔ՞", (byte)90, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_031.var_java_lang_String_arr_b[0] = NLoginCore_091.D("ӺԼԝԔԭԀՂՁԝԠӽԿԕԃԖՄԚԗՍԢՐԩԖԗ", (byte)90, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_031.var_java_lang_String_arr_b[0] = NLoginCore_223.D("ԒԹԛԊԙԑԺԔՅԤԎԛՃՁԻԘԼՉԟԻԪԿԖԗ", (byte)90, 68);
                }
            }
        }
    }

    @Override
    @Generated
    public String java_lang_String_a() {
        return this.aD;
    }

    @Override
    @Generated
    public boolean boolean_b() {
        return this.T;
    }
}

