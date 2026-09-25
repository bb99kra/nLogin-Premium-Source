/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_487;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_276
implements NLoginCore_487 {
    private static int aj;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_i;
    private static long ah;
    private static long var_long_c;
    private static long w;
    private static int bf;
    private static int bb;
    private static long v;
    private static String[] var_java_lang_String_arr_b;
    private static int ab;
    private static long ad;
    private static long h;
    private static int f;
    private static long g;
    private static int aq;
    private static long z;
    private static int at;
    private static long p;
    private static long n;
    private static long am;
    private static int ak;
    private static long ae;
    private static long ax;
    private final EnumMap<NLoginCore_466, NLoginInterface_021> cfr_renamed_17 = new ConcurrentHashMap();
    private static long var_long_b;
    private static int bl;
    private final Set<String> var_java_util_Set_java_lang_String__b;
    private static int bc;
    private static int bo;
    private static int ao;
    private static int e;
    private static int ag;
    private static int k;
    private static int bd;
    private static int bn;
    private static int l;
    private static long s;
    private static int o;
    private static int af;
    private final Map<String, NLoginCore_466> cfr_renamed_18;
    private static long aw;
    private static long d;
    private static int var_int_i;
    private static long az;
    private static long j;
    private static int u;
    private static int bh;
    private static long aa;
    private static long q;
    private static int var_int_a;
    private static int au;
    private static int bj;
    private static long ai;
    private static int bp;
    private static int ay;
    private static int be;
    private static int x;
    private static int an;
    private static int ac;
    private static long ap;
    private static long bk;
    private static long al;
    private static int as;
    private final Set<String> var_java_util_Set_java_lang_String__c;
    private static int y;
    private static int bq;
    private static int ar;
    private static long m;
    private static int bi;
    private static int ba;
    private static long t;
    private static String[] var_java_lang_String_arr_a;
    private static int r;
    private static int bm;
    private static int av;
    private static int bg;

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0xEB5982C3B1110EAEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(40 + 29), (byte)(30 + 53), (byte)(39 + 8), (byte)(31 + 36), (byte)(18 + 48), 67, (byte)(41 + 6), (byte)(52 + 28), (byte)(25 + 50), (byte)(9 + 58), (byte)(79 + 4), (byte)(20 + 33), (byte)(51 + 29), (byte)(56 + 41), (byte)(33 + 67), (byte)(64 + 36), (byte)(37 + 68), 110, (byte)(50 + 53)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(68 + 1), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࢻࢽࣄ࣊࣎ࣈ࣌ࢰࢴ", (byte)54, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_276.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public Set<String> a() {
        return this.var_java_lang_String_arr_b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(NLoginCore_466 var1_1) {
        block24: {
            block23: {
                var2_2 = this.var_com_nickuc_login_NLoginType_008_i.com_nickuc_login_NLoginCore_219_a();
                var3_3 = var1_1.e();
                var4_4 = var1_1.a();
                var5_5 = var1_1.l();
                var6_6 = (String)NLoginCore_276.c("㺀", (int)NLoginCore_276.var_int_a, (long)(NLoginCore_276.var_long_b ^ NLoginCore_276.d)) + var3_3;
                var7_7 = NLoginCore_276.e;
                var9_8 = null;
                if (var1_1 == NLoginCore_466.var_com_nickuc_login_NLoginCore_466_b) break block23;
                var7_7 = (int)var2_2.a(var6_6 + (String)NLoginCore_276.c("㺃", (int)NLoginCore_276.f, (long)(NLoginCore_276.g ^ NLoginCore_276.h)), var2_2.a(var6_6 + (String)NLoginCore_276.c("㺆", (int)NLoginCore_276.var_int_i, (long)NLoginCore_276.j), (boolean)NLoginCore_276.k));
                var8_9 = var2_2.k(var6_6 + (String)NLoginCore_276.c("㺉", (int)NLoginCore_276.l, (long)(NLoginCore_276.m ^ NLoginCore_276.n)));
                var9_8 = var2_2.java_lang_String_b(var6_6 + (String)NLoginCore_276.c("㺌", (int)NLoginCore_276.o, (long)(NLoginCore_276.p ^ NLoginCore_276.q)));
                var10_10 = var2_2.a(var6_6 + (String)NLoginCore_276.c("㺏", (int)NLoginCore_276.r, (long)(NLoginCore_276.s ^ NLoginCore_276.t)), (String)NLoginCore_276.c("㺒", (int)NLoginCore_276.u, (long)(NLoginCore_276.v ^ NLoginCore_276.w)));
                if (var7_7 == 0) break block24;
                var11_11 = var3_3;
                var12_12 = NLoginCore_276.x;
                switch (var11_11.hashCode()) {
                    case 1671380268: {
                        if (!var11_11.equals(NLoginCore_276.c("㺕", (int)NLoginCore_276.y, (long)(NLoginCore_276.z ^ NLoginCore_276.aa)))) break;
                        var12_12 = NLoginCore_276.ab;
                        break;
                    }
                    case 96619420: {
                        if (!var11_11.equals(NLoginCore_276.c("㺘", (int)NLoginCore_276.ac, (long)(NLoginCore_276.ad ^ NLoginCore_276.ae)))) break;
                        var12_12 = NLoginCore_276.af;
                        break;
                    }
                    case -1548612125: {
                        if (!var11_11.equals(NLoginCore_276.c("㺛", (int)NLoginCore_276.ag, (long)(NLoginCore_276.ah ^ NLoginCore_276.ai)))) break;
                        var12_12 = NLoginCore_276.aj;
                        break;
                    }
                    case -318452137: {
                        if (!var11_11.equals(NLoginCore_276.c("㺞", (int)NLoginCore_276.ak, (long)(NLoginCore_276.al ^ NLoginCore_276.am)))) break;
                        var12_12 = NLoginCore_276.an;
                        break;
                    }
                    case 1082600804: {
                        if (!var11_11.equals(NLoginCore_276.c("㺡", (int)NLoginCore_276.ao, (long)NLoginCore_276.ap))) break;
                        var12_12 = NLoginCore_276.aq;
                        break;
                    }
                }
                switch (var12_12) {
                    case 0: {
                        if (!NLoginCore_596.var_com_nickuc_login_NLoginCore_363_a.ar()) {
                            var7_7 = NLoginCore_276.ar;
                            break;
                        }
                        break block24;
                    }
                    case 1: {
                        if (!NLoginCore_596.var_com_nickuc_login_NLoginCore_363_k.ar()) {
                            var7_7 = NLoginCore_276.as;
                            break;
                        }
                        break block24;
                    }
                    case 2: 
                    case 3: {
                        if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_d.ar()) {
                            var7_7 = NLoginCore_276.at;
                        }
                    }
                    case 4: {
                        if (!NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar()) {
                            var7_7 = NLoginCore_276.au;
                            break;
                        }
                        break block24;
                    }
                }

                break block24;
            }
            var8_9 = Collections.singletonList(NLoginCore_276.c("㺤", (int)NLoginCore_276.av, (long)(NLoginCore_276.aw ^ NLoginCore_276.ax)));
            var10_10 = NLoginCore_276.c("㺧", (int)NLoginCore_276.ay, (long)NLoginCore_276.az);
        }
        if (var7_7 == 0) return;
        if (var8_9.isEmpty()) {
            var8_9 = Collections.singletonList(var3_3);
        } else if (var8_9.size() > NLoginCore_276.ba) {
            var4_4.a(new ArrayList<Object>(var8_9).subList(NLoginCore_276.bb, var8_9.size()));
        }
        if (var9_8 != null) {
            var4_4.u(var9_8);
        }
        var4_4.b((String)var10_10);
        var4_4.a((String)var8_9.get(NLoginCore_276.bc));
        var11_11 = (char)NLoginCore_276.bd + this.var_com_nickuc_login_NLoginType_008_i.q().toLowerCase(Locale.ENGLISH) + (char)NLoginCore_276.be;
        this.var_java_lang_String_arr_b.add(var11_11);
        var8_9.stream().map(s -> java_lang_String_a(s)).forEach(s -> this.a(var5_5, var11_11, var1_1, s));
        var12_13 = this.cfr_renamed_17;
        synchronized (var12_13) {
            this.cfr_renamed_17.put(var1_1, var4_4.a(this.var_com_nickuc_login_NLoginType_008_i));
            return;
        }
    }

    private /* synthetic */ void a(boolean bl, String string, NLoginCore_466 NLoginCore_4662, String string2) {
        if (bl) {
            this.var_long_c.add((char)bn + string2);
            this.var_long_c.add(string + string2);
        }
        this.var_java_lang_String_arr_b.add((char)bo + string2);
        this.cfr_renamed_17.put((NLoginCore_466)((Object)string2), (NLoginInterface_021)((Object)NLoginCore_4662));
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() != NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
            this.r();
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_276.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.D("ШъьЬѐѯѧѽѩиѶѬѺѴнѢ҄҃ѻҁѻѐ", (byte)25, 68), NLoginCore_276.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.C("ѣѰѯвѲѮѩѲѽѬйѷѻѴѷѽп߉ߋߒߘߜߖߚ޾߂є", (byte)25, 67) + string + NLoginCore_091.E("ԏ", (byte)25, 69) + methodType.toString(), exception);
        }
    }

    private static /* synthetic */ String java_lang_String_a(String string) {
        return string.toLowerCase(Locale.ENGLISH);
    }

    @Nullable
    public NLoginCore_466 com_nickuc_login_NLoginCore_466_a(String string) {
        return (NLoginCore_466)((Object)this.cfr_renamed_17.get(string));
    }

    private static void b() {
        int n;
        var_long_c = 8121156253313519252L;
        long l = var_long_c ^ 0xEB5982C3B1110EAEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(22 + 47), (byte)(43 + 40), (byte)(46 + 1), (byte)(58 + 9), (byte)(50 + 16), (byte)(35 + 32), (byte)(29 + 18), (byte)(49 + 31), (byte)(60 + 15), (byte)(8 + 59), (byte)(6 + 77), (byte)(3 + 50), (byte)(18 + 62), (byte)(34 + 63), (byte)(14 + 86), (byte)(48 + 52), 105, (byte)(40 + 70), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_276.var_java_lang_String_arr_b[0] = NLoginCore_223.E("ԺՎՎճԽԿՔՁՖծՔՀՆ՘բՖ՚Ո՜խչ՗ՔՕ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ӻӞӞӻӔӽӁҽӒӃӣӌ", (byte)69, 67);
                    NLoginCore_276.var_java_lang_String_arr_b[2] = NLoginCore_138.B("őśƂƁŐŤũƉƅšŅŘşŽſźŜŽŌœƔƅŜŝ", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[3] = NLoginCore_451.B("ŭŞŻķţƆƉƁūŧƅũţŁźŢŪƑūžžşŜŝ", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[4] = NLoginCore_384.C("ӼӐӕҷҽҸӱӺӲӔӒӸӝӨӴӼӋӗԄӨӻԐӗӘ", (byte)69, 67);
                    NLoginCore_276.var_java_lang_String_arr_b[5] = NLoginCore_027.F("դՙԸձհԿՈռլԾշ՟՛ՑպՃՔՈվիֆ֍ՔՕ", (byte)69, 70);
                    NLoginCore_276.var_java_lang_String_arr_b[6] = NLoginCore_027.E("ԸմԶշԵՌր՟իփգԿ՚ԽֆՑՠ՞֊տա֏՝թհ֏զդփշՑ֚՘ղ՗֝տվճծճբ֝դձ֤փս։ցև֗օ֭մյ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[7] = NLoginCore_092.B("ĴŜŔƆŔœžŽŇŧŇő", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[8] = NLoginCore_223.A("ŽŸŤżŸńŗŴŜŖŇő", (byte)69, 65);
                    NLoginCore_276.var_java_lang_String_arr_b[9] = NLoginCore_223.D("ӛҾӗӟӪӕӢӴԅԀԅӌ", (byte)69, 68);
                    NLoginCore_276.var_java_lang_String_arr_b[10] = NLoginCore_027.D("ҹӚӭӺҿӂӓӌӐӟӏӌ", (byte)69, 68);
                    NLoginCore_276.var_java_lang_String_arr_b[11] = NLoginCore_223.E("ՖզղԳծձԿՊտՠ՜Չ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[12] = NLoginCore_446.F("Ա՚նհՈծՎՠԸ՗պՉ", (byte)69, 70);
                    NLoginCore_276.var_java_lang_String_arr_b[13] = NLoginCore_027.C("ӐӨӒҲӉӏԀҽӲӅӐӹԁӷӋԅӨӧӟӜӰӟӟӠԅӓԘԗԕӵӯӫ", (byte)69, 67);
                    NLoginCore_276.var_java_lang_String_arr_b[14] = NLoginCore_004.D("ҺӽҶӨҳӻӰӏԅӕӱӌ", (byte)69, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_276.var_java_lang_String_arr_b[0] = NLoginCore_384.E("ԺՎՎճԽԿՔՁՖծՖԷԼ՗ք֊ՃՇթդզ֍ՔՕ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ŖŬŲľĽżŘŪŒţƇśŊōŋťƀƈŜƑƖƕŜŝ", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[2] = NLoginCore_324.D("ӌӖӽӼӋӟӤԄԀӜӀӨԊӺӧӾԁӇӎԐԑӪӗӘ", (byte)69, 68);
                    NLoginCore_276.var_java_lang_String_arr_b[3] = NLoginCore_004.E("եՖճԯ՛վցչգ՟սՍսվՙ՘Ձէեդ՜֍ՔՕ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[4] = NLoginCore_173.D("ӼӐӕҷҽҸӱӺӲӔӑӠӒӴӊԃԂԇӋӰӦԐӗӘ", (byte)69, 68);
                    NLoginCore_276.var_java_lang_String_arr_b[5] = NLoginCore_091.C("ӧӜһӴӳӂӋӿӯӁӼӝԈӤӛӻӕԅӤӫӃӻӽԄԋӶӫԗӏԏӚӵ", (byte)69, 67);
                    NLoginCore_276.var_java_lang_String_arr_b[6] = NLoginCore_201.A("ŀżľſĽŔƈŧųƋūŇŢŅƎřŨŦƒƇũƗťűŸƗŮŬƋſřƢŠźşƥƇƆŻŶŻŪƥżƄưƞƝƎƬƆƞƗƭƪƔƗƑưƭƽƞƵƾ", (byte)69, 65);
                    NLoginCore_276.var_java_lang_String_arr_b[7] = NLoginCore_076.B("ŠœŎŽŦžšŲƄſżżňźżŮŒţƒſňůŜŝ", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[8] = NLoginCore_201.A("ŞŒŗŴƆŗŐĻţńŪţƈţŜŐŬŴƉƆƒşŜŝ", (byte)69, 65);
                    NLoginCore_276.var_java_lang_String_arr_b[9] = NLoginCore_223.C("ҼӒӠӳӼӲԂӶӹҾӐԇԀԊӦӺӪӢԅԑӇӚӗӘ", (byte)69, 67);
                    NLoginCore_276.var_java_lang_String_arr_b[10] = NLoginCore_559.E("՛ՆհՙՇ՞ձՏ՟վշՍ՚սֈՀՊՁՋԿժէՔՕ", (byte)69, 69);
                    NLoginCore_276.var_java_lang_String_arr_b[11] = NLoginCore_575.F("դՉմՍ՛հՑյժգ՗՘չՏ՜ըՊ՛ջ֎՗֍ՔՕ", (byte)69, 70);
                    NLoginCore_276.var_java_lang_String_arr_b[12] = NLoginCore_387.A("ľŭſŭŁŗţŚƄƋƆŚŜƇŜŨũŻƒŢŕůŜŝ", (byte)69, 65);
                    NLoginCore_276.var_java_lang_String_arr_b[13] = NLoginCore_201.B("ŕŭŗķŎŔƅłŷŊŕžƆżŐƊŭŬŤšŵũŵƄƃƛūƈŚŻūŘśūűŭơŧŸťƦƁƪű", (byte)69, 66);
                    NLoginCore_276.var_java_lang_String_arr_b[14] = NLoginCore_092.A("şŔžůůŽƈŒŇţŬő", (byte)69, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_276.var_java_lang_String_arr_b[0] = NLoginCore_559.C("ҶӳҷӗӍԀӘӠӟҿԅӡӲӖӬӣԆԊӹӪԁӚӗӘ", (byte)69, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_276.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ӯӶӉӱӡӚӁӽӝӳӹӐӿӄӶӘԀӚԇӌԊӚӗӘ", (byte)69, 68);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void q() {
        this.var_java_lang_String_arr_b.clear();
        this.var_long_c.clear();
        EnumMap<NLoginCore_466, NLoginInterface_021> enumMap = this.cfr_renamed_17;
        synchronized (enumMap) {
            this.cfr_renamed_17.forEach((NLoginCore_4662, NLoginInterface_0212) -> NLoginInterface_0212.X());
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(2986885139975646478L);
        d = Long.reverse(0x200000000000000L);
        e = (0x20000000 >>> 93 | 0x20000000 << -93) & 0xFFFFFFFF;
        f = 0x400000 >>> 118 | 0x400000 << -118;
        g = Long.reverse(2986885139975646478L);
        h = Long.reverse(0x200000000000000L);
        var_int_i = Integer.MIN_VALUE >>> 158 | Integer.MIN_VALUE << ~158 + 1;
        j = Long.reverse(3131000328051502350L);
        k = (0x100000 >>> 212 | 0x100000 << -212) & 0xFFFFFFFF;
        l = Integer.reverse(-1073741824);
        m = Long.reverse(2986885139975646478L);
        n = Long.reverse(0x200000000000000L);
        o = 512 >>> 39 | 512 << -39;
        p = Long.reverse(2986885139975646478L);
        q = Long.reverse(0x200000000000000L);
        r = (0x14000000 >>> 90 | 0x14000000 << ~90 + 1) & 0xFFFFFFFF;
        s = Long.reverse(2986885139975646478L);
        t = Long.reverse(0x200000000000000L);
        u = 49152 >>> 109 | 49152 << ~109 + 1;
        v = Long.reverse(2986885139975646478L);
        w = Long.reverse(0x200000000000000L);
        x = (-1 >>> 195 | -1 << ~195 + 1) & 0xFFFFFFFF;
        y = 0xE00000 >>> 245 | 0xE00000 << ~245 + 1;
        z = Long.reverse(2986885139975646478L);
        aa = Long.reverse(0x200000000000000L);
        ab = 0 >>> 32 | 0 << -32;
        ac = 0x1000000 >>> 149 | 0x1000000 << ~149 + 1;
        ad = Long.reverse(2986885139975646478L);
        ae = Long.reverse(0x200000000000000L);
        af = 0x800000 >>> 215 | 0x800000 << -215;
        ag = (72 >>> 227 | 72 << ~227 + 1) & 0xFFFFFFFF;
        ah = Long.reverse(2986885139975646478L);
        ai = Long.reverse(0x200000000000000L);
        aj = Integer.reverse(0x40000000);
        ak = 0x2800000 >>> 246 | 0x2800000 << ~246 + 1;
        al = Long.reverse(2986885139975646478L);
        am = Long.reverse(0x200000000000000L);
        an = 3072 >>> 170 | 3072 << ~170 + 1;
        ao = 360448 >>> 15 | 360448 << -15;
        ap = Long.reverse(3131000328051502350L);
        aq = Integer.reverse(0x20000000);
        ar = (0 >>> 217 | 0 << ~217 + 1) & 0xFFFFFFFF;
        as = (0 >>> 140 | 0 << ~140 + 1) & 0xFFFFFFFF;
        at = (0 >>> 0 | 0 << -0) & 0xFFFFFFFF;
        au = Integer.reverse(0);
        av = 3072 >>> 40 | 3072 << -40;
        aw = Long.reverse(2986885139975646478L);
        ax = Long.reverse(0x200000000000000L);
        ay = 0x34000000 >>> 250 | 0x34000000 << ~250 + 1;
        az = Long.reverse(3131000328051502350L);
        ba = (0x400000 >>> 182 | 0x400000 << ~182 + 1) & 0xFFFFFFFF;
        bb = (0x4000000 >>> 26 | 0x4000000 << -26) & 0xFFFFFFFF;
        bc = (0 >>> 189 | 0 << -189) & 0xFFFFFFFF;
        bd = (-536870907 >>> 253 | -536870907 << ~253 + 1) & 0xFFFFFFFF;
        be = Integer.reverse(0x5C000000);
        bf = (0 >>> 209 | 0 << ~209 + 1) & 0xFFFFFFFF;
        bg = Integer.reverse(0);
        bh = Integer.reverse(0);
        bi = Integer.reverse(0x70000000);
        bj = (-1 >>> 254 | -1 << -254) & 0xFFFFFFFF;
        bk = Long.reverse(3131000328051502350L);
        bl = 4 >>> 194 | 4 << -194;
        bm = Integer.reverse(0);
        bn = Integer.reverse(-201326592);
        bo = 0x5E00000 >>> 149 | 0x5E00000 << -149;
        bp = 0xF00000 >>> 116 | 0xF00000 << -116;
        bq = Integer.reverse(-268435456);
        var_java_lang_String_arr_a = new String[bp];
        var_java_lang_String_arr_b = new String[bq];
        NLoginCore_276.b();
    }

    public void r() {
        this.q();
        NLoginCore_466[] NLoginCore_466Array = NLoginCore_466.values();
        int n = NLoginCore_466Array.length;
        for (int i = bh; i < n; ++i) {
            NLoginCore_466 NLoginCore_4662 = NLoginCore_466Array[i];
            this.a(NLoginCore_4662);
        }
    }

    public boolean b(String string) {
        if (this.var_long_c.stream().anyMatch(string::equals)) {
            return bf != 0;
        }
        List<String> list = NLoginCore_532.as.a(new Object[bg]);
        return list.stream().noneMatch(string2 -> (!string2.isEmpty() && (string2.equals(NLoginCore_276.c("㺀", (int)(bi & bj), (long)bk)) || string.equals(string2)) ? bl : bm) != 0);
    }

    @Generated
    public NLoginCore_276(NLoginType_008 NLoginType_008) {
        this.var_java_lang_String_arr_b = ConcurrentHashMap.newKeySet();
        this.var_long_c = (long)ConcurrentHashMap.newKeySet();
        this.var_com_nickuc_login_NLoginType_008_i = NLoginType_008;
    }
}

