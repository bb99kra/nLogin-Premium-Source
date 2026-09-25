/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.geysermc.floodgate.api.FloodgateApi
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_549;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_294;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_195;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_151;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_428;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.geysermc.floodgate.api.FloodgateApi;

public class NLoginCore_286
implements NLoginCore_151 {
    private static long af;
    private static int ak;
    private static long an;
    private static long var_long_b;
    private static long ai;
    private static int e;
    private static long al;
    private static long p;
    private static int ao;
    private static final int var_int_s;
    private static int n;
    private static long g;
    private static long q;
    private static long ac;
    private static int w;
    private static int am;
    private static long d;
    private static int f;
    private static long y;
    private static long ad;
    private static int aq;
    private static int t;
    private static long ag;
    private static int h;
    private static String[] var_java_lang_String_arr_a;
    private static long u;
    private static long j;
    private static int ap;
    private static long var_long_s;
    private static int aj;
    private static int aa;
    public static NLoginCore_286 var_com_nickuc_login_NLoginCore_286_a;
    private static long c;
    private static int z;
    private static int var_int_a;
    private static int l;
    private static int ab;
    private static long x;
    private static long v;
    private static int ae;
    private static int i;
    private static int k;
    private static int ah;
    private static int o;
    private static int m;
    private static int r;
    private static String[] var_java_lang_String_arr_b;

    private static void b() {
        int n;
        c = -4189308158399447606L;
        long l = c ^ 0x3A5D713983DE8A9EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(61 + 8), (byte)(46 + 37), (byte)(37 + 10), 67, (byte)(50 + 16), (byte)(49 + 18), 47, (byte)(54 + 26), (byte)(62 + 13), (byte)(54 + 13), (byte)(30 + 53), (byte)(9 + 44), (byte)(8 + 72), (byte)(19 + 78), (byte)(58 + 42), (byte)(69 + 31), (byte)(78 + 27), (byte)(51 + 59), (byte)(93 + 10)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_286.var_java_lang_String_arr_b[0] = NLoginCore_384.B("×çûĔčĒĆĒĎĢĖĎüęþãąèòċèäĪìðĐĆûĂıðĥıģĖĤĴĜėĳŀøĢć", (byte)16, 66);
                    NLoginCore_286.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ĎïėĊÒÕìóĐĝûëĀòðþĨĔóåĈõòó", (byte)16, 65);
                    NLoginCore_286.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ЮЛзКеёљѠкЯѢѣзѧЬџшпѰёѲѲьѝЮцѴѩѦяѶх", (byte)16, 67);
                    NLoginCore_286.var_java_lang_String_arr_b[3] = NLoginCore_004.B("ðćĕæèêċùØāöç", (byte)16, 66);
                    NLoginCore_286.var_java_lang_String_arr_b[4] = NLoginCore_110.A("äČìĘïûÖčĞàíÿėùôĒĩÛòħĖċĮĉćıûĂēĬóā", (byte)16, 65);
                    NLoginCore_286.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ЪђвўесМѓѤЦгхѝпкјѯСиѭќўуъѡызѭебззќўѷѡѱѱѭѦпнјэ", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[6] = NLoginCore_387.A("äČìĘïûÖčĞàíÿėùôĒĩÛòħĖĖĎćæāıêýïė÷", (byte)16, 65);
                    NLoginCore_286.var_java_lang_String_arr_b[7] = NLoginCore_451.D("бьяЪэЙуйчсбѩнжчџќШЩыѨыий", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[8] = NLoginCore_092.C("ЧЧѓЩнђЭТсѨфЭ", (byte)16, 67);
                    NLoginCore_286.var_java_lang_String_arr_b[9] = NLoginCore_559.F("ԝԴՂԓԕԗԸԦԅԮԣԔ", (byte)16, 70);
                    NLoginCore_286.var_java_lang_String_arr_b[10] = NLoginCore_559.E("ԘԳԶԑԴԀԪԠԮԨԙԹՊԱԪՒԥԷՕԤՌԸԣՇԹԷԖաԾԱԺԛ", (byte)16, 69);
                    NLoginCore_286.var_java_lang_String_arr_b[11] = NLoginCore_173.B("ááčã÷ČçÜûĢþç", (byte)16, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_286.var_java_lang_String_arr_b[0] = NLoginCore_223.A("×çûĔčĒĆĒĎĢĖĎüęþãąèòċèäĪìðĐĆûĂıðĥħĊąĨùĴĘñĹļŀć", (byte)16, 65);
                    NLoginCore_286.var_java_lang_String_arr_b[1] = NLoginCore_092.B("ĎïėĊÒÕìóĐĝüĔĚďĚąøûĈþĭīòó", (byte)16, 66);
                    NLoginCore_286.var_java_lang_String_arr_b[2] = NLoginCore_076.D("ЮЛзКеёљѠкЯѢѣзѧЬџшпѰёѲѲмѴѨбвэѸкњжйѴѪѝрѾѬѳќѥ҆э", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[3] = NLoginCore_138.D("ўёѝЯЬееўУлПЭ", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[4] = NLoginCore_004.D("ЪђвўесМѓѤЦгхѝпкјѯСиѭќќсѐдѥЮѱфвѯѴ", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[5] = NLoginCore_427.F("ԑԹԙՅԜԨԃԺՋԍԚԬՄԦԡԿՖԈԟՔՃՅԪԱՈԲԞՔԜԘԞԞԯՒդաԿԼԣ՟բիաԴ", (byte)16, 70);
                    NLoginCore_286.var_java_lang_String_arr_b[6] = NLoginCore_559.E("ԑԹԙՅԜԨԃԺՋԍԚԬՄԦԡԿՖԈԟՔՃԳԤԩ՞ԼՊԪԺԟՠԽԳգՃԾ՟ԾէգժԸՋԴ", (byte)16, 69);
                    NLoginCore_286.var_java_lang_String_arr_b[7] = NLoginCore_110.F("ԘԳԶԑԴԀԪԠԮԨԘՇՀԯՇԫՄԳՉՈՇԌՇԬՋՌԧԻԬՑՁԟ", (byte)16, 70);
                    NLoginCore_286.var_java_lang_String_arr_b[8] = NLoginCore_559.D("ћИЫЩПѢюѣѕПѤѕїѦрћѣчцўњыий", (byte)16, 68);
                    NLoginCore_286.var_java_lang_String_arr_b[9] = NLoginCore_091.B("÷ĂõěèēùğĊÚÝç", (byte)16, 66);
                    NLoginCore_286.var_java_lang_String_arr_b[10] = NLoginCore_004.F("ԘԳԶԑԴԀԪԠԮԨԙԹՊԱԪՒԥԷՕԤՌԻԧ՜ԝԛԸԟԛՁ՛՜", (byte)16, 70);
                    NLoginCore_286.var_java_lang_String_arr_b[11] = NLoginCore_384.D("жжвзѠѕѓдучцдірщшячЫйЯыий", (byte)16, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_286.var_java_lang_String_arr_b[0] = NLoginCore_223.D("іЧјГрўхСЮяѥфќФщонъѧѲссоѯіѨсѺфѧэъ", (byte)16, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_286.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ՁԼԃӿԃԡՂԅԩՀՋԬՉՉԒԲԒՀԤԩՊՆԧՖԻՊՉԷԷԔՂ՛", (byte)16, 70);
                }
            }
        }
    }

    static {
        var_int_a = (0 >>> 228 | 0 << ~228 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(6034313055463619491L);
        d = Long.reverse(-8070450532247928832L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (-1 >>> 148 | -1 << ~148 + 1) & 0xFFFFFFFF;
        g = Long.reverse(-4341980485998003293L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (2 >>> 160 | 2 << ~160 + 1) & 0xFFFFFFFF;
        j = Long.reverse(-4341980485998003293L);
        k = (0 >>> 247 | 0 << -247) & 0xFFFFFFFF;
        l = Integer.reverse(Integer.MIN_VALUE);
        m = 0 >>> 132 | 0 << ~132 + 1;
        n = (0 >>> 104 | 0 << ~104 + 1) & 0xFFFFFFFF;
        o = 3 >>> 32 | 3 << ~32 + 1;
        p = Long.reverse(6034313055463619491L);
        q = Long.reverse(-8070450532247928832L);
        r = Integer.reverse(0x20000000);
        var_long_s = Long.reverse(-4341980485998003293L);
        t = 20480 >>> 236 | 20480 << ~236 + 1;
        u = Long.reverse(6034313055463619491L);
        v = Long.reverse(-8070450532247928832L);
        w = Integer.reverse(0x60000000);
        x = Long.reverse(6034313055463619491L);
        y = Long.reverse(-8070450532247928832L);
        z = Integer.reverse(0);
        aa = Integer.reverse(0);
        ab = Integer.reverse(-536870912);
        ac = Long.reverse(6034313055463619491L);
        ad = Long.reverse(-8070450532247928832L);
        ae = 0x400000 >>> 115 | 0x400000 << -115;
        af = Long.reverse(6034313055463619491L);
        ag = Long.reverse(-8070450532247928832L);
        ah = (18432 >>> 171 | 18432 << ~171 + 1) & 0xFFFFFFFF;
        ai = Long.reverse(-4341980485998003293L);
        aj = 655360 >>> 48 | 655360 << -48;
        ak = (-1 >>> 121 | -1 << -121) & 0xFFFFFFFF;
        al = Long.reverse(-4341980485998003293L);
        am = 44 >>> 66 | 44 << -66;
        an = Long.reverse(-4341980485998003293L);
        ao = Integer.reverse(0x30000000);
        ap = Integer.reverse(0x30000000);
        aq = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[ao];
        var_java_lang_String_arr_b = new String[ap];
        NLoginCore_286.b();
        var_int_s = aq;
        var_com_nickuc_login_NLoginCore_286_a = new NLoginCore_286();
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_286.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_286.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.A("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԿԾՋՇՋԼՏՆǆ", (byte)122, 65) + string + NLoginCore_173.F("հ", (byte)122, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean boolean_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        return (NLoginCore_4952.java_lang_Integer_a() == null ? l : m) != 0;
    }

    private static String a(int n, long l) {
        l ^= 9L;
        l ^= 0x3A5D713983DE8A9EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(6 + 63), (byte)(18 + 65), (byte)(38 + 9), (byte)(23 + 44), (byte)(21 + 45), (byte)(25 + 42), (byte)(42 + 5), (byte)(4 + 76), (byte)(71 + 4), (byte)(23 + 44), (byte)(72 + 11), 53, (byte)(8 + 72), (byte)(84 + 13), (byte)(16 + 84), (byte)(10 + 90), (byte)(8 + 97), (byte)(13 + 97), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.F("ց֎֍Ր֐֌և֐֛֊՗֛֕֙֒֕՝ࣱࣲࣩࣶࣶࣺ࣪ࣧ", (byte)98, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_286.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void void_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        String string;
        org.geysermc.floodgate.api.FloodgateApi api = org.geysermc.floodgate.api.FloodgateApi.getInstance();
        if (NLoginType_008.java_lang_Object_b().j((String)NLoginCore_286.c("㺀", (int)(e & f), (long)g)) && api != null && (string = api.getPlayerPrefix()) != null && string.isEmpty()) {
            NLoginCore_286.d(NLoginType_008);
        }
        NLoginCore_4952.a(h);
        NLoginCore_370.c((String)NLoginCore_286.c("㺃", (int)i, (long)j) + this.q(), new Object[k]);
    }

    @Override
    public boolean I() {
        return n != 0;
    }

    @Override
    public String q() {
        return NLoginCore_286.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void d(NLoginType_008 NLoginType_008) {
        File file = NLoginType_008.com_nickuc_login_NLoginCore_219_a().d();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            NLoginCore_549 NLoginCore_549 = NLoginCore_428.a(file);
            try {
                String string;
                while ((string = NLoginCore_549.ah()) != null) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append((String)NLoginCore_286.c("㺀", (int)o, (long)(p ^ q)));
                    }
                    if (string.trim().startsWith((String)NLoginCore_286.c("㺃", (int)r, (long)var_long_s))) {
                        stringBuilder.append(string.replace((CharSequence)NLoginCore_286.c("㺆", (int)t, (long)(u ^ v)), (CharSequence)NLoginCore_286.c("㺉", (int)w, (long)(x ^ y))));
                        continue;
                    }
                    stringBuilder.append(string);
                }
            }
            finally {
                if (Collections.singletonList(NLoginCore_549).get(z) != null) {
                    NLoginCore_549.close();
                }
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_286.c("㺌", (int)ab, (long)(ac ^ ad)) + file + (String)NLoginCore_286.c("㺏", (int)ae, (long)(af ^ ag)), iOException);
        }
        try {
            if (file.delete()) {
                NLoginCore_294.a(file, stringBuilder.toString().split((String)NLoginCore_286.c("㺒", (int)ah, (long)ai)));
                NLoginType_008.com_nickuc_login_NLoginCore_219_a().X();
                NLoginCore_195.e(NLoginType_008);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_286.c("㺕", (int)(aj & ak), (long)al) + file + (String)NLoginCore_286.c("㺘", (int)am, (long)an), iOException);
        }
    }
}

