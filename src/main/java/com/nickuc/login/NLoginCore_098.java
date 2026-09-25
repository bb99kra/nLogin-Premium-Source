/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_400;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.ResultSet;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_098
extends NLoginCore_400 {
    private static int ae;
    private static long v;
    private static long aa;
    protected String O;
    private static long am;
    private static String[] var_java_lang_String_arr_c;
    private static int h;
    private static int bc;
    private static int an;
    private static long g;
    private static int ak;
    private static int var_int_d;
    private static int ai;
    private static int aq;
    private static long x;
    protected String P;
    private static long as;
    private static int w;
    private static int ah;
    private static long aj;
    private static long u;
    protected String r;
    private static long ag;
    private static String[] var_java_lang_String_arr_d;
    private static int aw;
    private static long f;
    private static long n;
    private static int af;
    private static int az;
    private static int var_int_c;
    private static int t;
    private static long ap;
    private static long i;
    private static int s;

    public NLoginCore_098(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, @Nullable String string2) {
        this(NLoginType_008, NLoginCore_479, string, string2, var_int_c != 0);
    }

    private static void void_b() {
        int n;
        f = -2481062280859643196L;
        long l = f ^ 0xD9A0EB018AB86164L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(41 + 28), (byte)(25 + 58), (byte)(43 + 4), (byte)(19 + 48), (byte)(24 + 42), (byte)(5 + 62), (byte)(5 + 42), (byte)(51 + 29), (byte)(72 + 3), (byte)(41 + 26), (byte)(46 + 37), (byte)(33 + 20), (byte)(69 + 11), (byte)(28 + 69), (byte)(43 + 57), (byte)(95 + 5), (byte)(73 + 32), 110, (byte)(82 + 21)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(51 + 18), (byte)(2 + 81)}, StandardCharsets.UTF_8));
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
                    NLoginCore_098.var_java_lang_String_arr_d[0] = NLoginCore_223.B("ÜþĉûāûÞêýÑêêąòóñĐØďûċďæç", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[1] = NLoginCore_453.F("ԟӸԎԵԚ԰ԁԦԒԽՇԎ", (byte)10, 70);
                    NLoginCore_098.var_java_lang_String_arr_d[2] = NLoginCore_324.D("зРЦЎшябГаѕЪсГющИгЛјЖктоуєРХѕѓѥъѓщЬѣѰољѝЮуЧђл", (byte)10, 68);
                    NLoginCore_098.var_java_lang_String_arr_d[3] = NLoginCore_110.B("÷àæÎĈďñÓðĕêāÓĎĉØóÛĘÖúùáĒđîďđğĚģãåąĘÿìāäïñĢĖû", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[4] = NLoginCore_201.B("ÿćÖÌĉçíćðëÑÛ", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[5] = NLoginCore_201.B("êąÊäêćóûàóĈÛ", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[6] = NLoginCore_091.D("чнЇнНОЊлъаТЛ", (byte)10, 68);
                    NLoginCore_098.var_java_lang_String_arr_d[7] = NLoginCore_091.D("ЈэЬЙяафЎнЪвЛ", (byte)10, 68);
                    NLoginCore_098.var_java_lang_String_arr_d[8] = NLoginCore_173.F("ԏӺӾԿԢԖՀԹԙՁԸՁԂՌӿԖԯԐԯԏԮՀԾՅՉՎՏՆԭԗՉՉԳԝԴՁՌԮ՟ՙԯԶՓԮ", (byte)10, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_098.var_java_lang_String_arr_d[0] = NLoginCore_223.D("МощлслОЪнБЫѐјеѓьѕэћўжёТѠљѓУѤѤѓњн", (byte)10, 68);
                    NLoginCore_098.var_java_lang_String_arr_d[1] = NLoginCore_091.B("ÜČàÞÂËćĐÔČĔÛ", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[2] = NLoginCore_027.F("ԪԓԙԁԻՂԤԆԣՈԝԴԆՁԼԋԦԎՋԉԭԵԱԶՇԓԘՈՆ՘ԽՆԚԫԿԷԛ՘աԾԦԞգԮ", (byte)10, 70);
                    NLoginCore_098.var_java_lang_String_arr_d[3] = NLoginCore_324.C("зРЦЎшябГаѕЪсГющИгЛјЖкйСђёЮяёџњѣУѨјњѢщмщѐџѱѴл", (byte)10, 67);
                    NLoginCore_098.var_java_lang_String_arr_d[4] = NLoginCore_201.C("эЬмтфчуЉЪэфЛ", (byte)10, 67);
                    NLoginCore_098.var_java_lang_String_arr_d[5] = NLoginCore_384.C("ЧЫЧшЬХютяъЦЛ", (byte)10, 67);
                    NLoginCore_098.var_java_lang_String_arr_d[6] = NLoginCore_223.C("ИЭФЈЋЩХєШѕОтїЪјШЯўцЗўЩЦЧ", (byte)10, 67);
                    NLoginCore_098.var_java_lang_String_arr_d[7] = NLoginCore_110.B("êÃÖÅĆåúáĔÞÞÛ", (byte)10, 66);
                    NLoginCore_098.var_java_lang_String_arr_d[8] = NLoginCore_027.B("ÜÇËČïãčĆæĎąĎÏęÌãüÝüÜûčċĒĖěĜēúäĖĖĂğúåćěĉüĒĶİĕāĳ÷öĸĜĈĞöĉĆć", (byte)10, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_098.var_java_lang_String_arr_d[0] = NLoginCore_004.D("ЂУОнкЛявуфвЛ", (byte)10, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_098.var_java_lang_String_arr_d[0] = NLoginCore_201.D("ЗтЮфЩщъпАЮдСѕјУяицєќєџЦЧ", (byte)10, 68);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_098.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.C("ӁӣӥӅөԈԀԖԂӑԏԅԓԍӖӻԝԜԔԚԔө", (byte)76, 67), NLoginCore_098.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.F("իոշԺպնձպօմՁտփռտօՇࣗࢺࣟࢿ࣑࣐ࣣ࣡ࣨࣘ࣫ࢷࣅ࣪ࣥբ", (byte)76, 70) + string + NLoginCore_446.F("Ղ", (byte)76, 70) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N() {
        if (this.P == null) {
            throw new IllegalArgumentException((String)NLoginCore_098.c("㺀", (int)t, (long)(u ^ v)));
        }
        if (this.P.isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_098.c("㺃", (int)w, (long)(x ^ aa)));
        }
        this.void_f(this.P);
        try (NLoginCore_171 NLoginCore_171 = this.a((NLoginCore_459)this.var_int_d);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            while (resultSet.next() && this.m.N()) {
                try {
                    this.b(resultSet);
                }
                catch (Exception exception) {
                    NLoginCore_370.b((String)NLoginCore_098.c("㺆", (int)(ae & af), (long)ag) + this.a.getName() + (String)NLoginCore_098.c("㺉", (int)(ah & ai), (long)aj) + (String)(this.r == null ? NLoginCore_098.c("㺌", (int)ak, (long)am) : this.r + (String)NLoginCore_098.c("㺏", (int)an, (long)ap)) + (String)NLoginCore_098.c("㺒", (int)aq, (long)as), exception, new Object[aw]);
                }
                finally {
                    ++this.l;
                }
            }
        }
    }

    protected abstract void c(NLoginCore_219 var1);

    protected NLoginCore_219 com_nickuc_login_NLoginCore_219_a(String string) {
        return new NLoginCore_219(string, this.java_io_File_b());
    }

    private static String a(int n, long l) {
        l ^= 0x7BL;
        l ^= 0xD9A0EB018AB86164L;
        if (var_java_lang_String_arr_c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(24 + 45), (byte)(58 + 25), (byte)(3 + 44), (byte)(9 + 58), (byte)(57 + 9), 67, (byte)(30 + 17), (byte)(77 + 3), (byte)(27 + 48), (byte)(25 + 42), (byte)(11 + 72), (byte)(10 + 43), (byte)(75 + 5), (byte)(40 + 57), (byte)(80 + 20), 100, (byte)(6 + 99), (byte)(70 + 40), (byte)(64 + 39)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, (byte)(49 + 34)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("ԫԸԷӺԺԶԱԺՅԴԁԿՃԼԿՅԇࢗࡺ࢟ࡿࢡ࢑࢐ࢨ࢘ࢣࢫࡷࢅࢪࢥ", (byte)12, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_098.var_java_lang_String_arr_c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_d[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_c[n];
    }

    public NLoginCore_098(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string, @Nullable String string2, boolean bl) {
        super(NLoginType_008, NLoginCore_479, bl);
        this.O = string;
        this.P = string2;
    }

    static {
        var_int_c = (2048 >>> 203 | 2048 << ~203 + 1) & 0xFFFFFFFF;
        var_int_d = (0 >>> 63 | 0 << -63) & 0xFFFFFFFF;
        g = Long.reverse(-195416424926246469L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Long.reverse(2542772148515015099L);
        n = Long.reverse(-2449958197289549824L);
        s = 0 >>> 60 | 0 << ~60 + 1;
        t = (0x100000 >>> 243 | 0x100000 << ~243 + 1) & 0xFFFFFFFF;
        u = Long.reverse(2542772148515015099L);
        v = Long.reverse(-2449958197289549824L);
        w = (0x1800000 >>> 87 | 0x1800000 << ~87 + 1) & 0xFFFFFFFF;
        x = Long.reverse(2542772148515015099L);
        aa = Long.reverse(-2449958197289549824L);
        ae = (64 >>> 36 | 64 << -36) & 0xFFFFFFFF;
        af = -1 >>> 29 | -1 << ~29 + 1;
        ag = Long.reverse(-195416424926246469L);
        ah = 81920 >>> 206 | 81920 << -206;
        ai = (-1 >>> 26 | -1 << -26) & 0xFFFFFFFF;
        aj = Long.reverse(-195416424926246469L);
        ak = Integer.reverse(0x60000000);
        am = Long.reverse(-195416424926246469L);
        an = Integer.reverse(-536870912);
        ap = Long.reverse(-195416424926246469L);
        aq = Integer.reverse(0x10000000);
        as = Long.reverse(-195416424926246469L);
        aw = 0 >>> 123 | 0 << ~123 + 1;
        az = Integer.reverse(-1879048192);
        bc = 0x240000 >>> 178 | 0x240000 << ~178 + 1;
        var_java_lang_String_arr_c = new String[az];
        var_java_lang_String_arr_d = new String[bc];
        NLoginCore_098.void_b();
    }

    @Override
    protected void b(NLoginCore_494 NLoginInterface_0422) {
        NLoginCore_219 NLoginCore_2192 = this.com_nickuc_login_NLoginCore_219_a(this.O);
        this.c(NLoginCore_2192);
        this.N();
        this.c(NLoginInterface_0422);
    }

    protected abstract void b(ResultSet var1);

    public NLoginCore_098(NLoginType_008 NLoginType_008, NLoginCore_531 NLoginCore_479, String string) {
        this(NLoginType_008, NLoginCore_479, string, null);
    }

    protected NLoginCore_171 a(NLoginCore_459 NLoginCore_459) {
        return NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_098.c("㺀", (int)var_int_d, (long)g) + this.P + (String)NLoginCore_098.c("㺃", (int)h, (long)(i ^ n)), new Object[s]);
    }
}

