/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_102;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_508;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_316;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_150 {
    private static int be;
    private static int q;
    private static int h;
    private static int aw;
    private static float av;
    private static int ao;
    private static int k;
    private static int ah;
    private static long br;
    private static long ai;
    private static int bc;
    private static final EnumMap<NLoginCore_055, NLoginCore_316> cfr_renamed_8;
    private static long r;
    private static int bj;
    private static int bi;
    private static long p;
    private static long o;
    private static int az;
    private static int t;
    private static int u;
    private static int bn;
    private static int bk;
    private static int bg;
    private static String[] var_java_lang_String_arr_a;
    private static int w;
    private static long ar;
    private static long ag;
    private static long g;
    private static int bd;
    private static long i;
    private static long s;
    private static int an;
    private static long bu;
    private static long l;
    private static long ac;
    private static int f;
    private static int e;
    private static long v;
    private static int ab;
    private static int bs;
    private static long ad;
    private static int bp;
    private static int bv;
    private static int d;
    private static long ap;
    private static int var_int_a;
    private static long am;
    private static int y;
    static NLoginCore_055 var_com_nickuc_login_NLoginCore_055_b;
    private static int ae;
    private static int var_int_b;
    private static long z;
    private static long bq;
    private static long m;
    private static int bw;
    private static int ax;
    private static long au;
    private static long ba;
    private static int ay;
    private static int bt;
    private static int bf;
    private static long bm;
    private static long aa;
    private static int at;
    private static long bh;
    private static long al;
    private static int as;
    private static long bb;
    private static int ak;
    private static long x;
    private static long bl;
    private static int aq;
    private static long var_long_c;
    private static int var_int_c;
    private static long j;
    private static String[] var_java_lang_String_arr_b;
    private static int bo;
    private static int n;
    private static int af;
    private static long aj;

    public static NLoginCore_190 a(NLoginCore_102 NLoginCore_102, NLoginCore_277 NLoginCore_277) {
        NLoginCore_509 NLoginCore_5092 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092 != null ? NLoginCore_5092.com_nickuc_login_NLoginCore_055_a() : NLoginCore_150.c();
        return NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_102);
    }

    public static String aC() {
        return NLoginCore_532.var_com_nickuc_login_NLoginCore_477_b.a(new Object[e]);
    }

    private static String a(int n, long l) {
        l ^= 0x23L;
        l ^= 0x5E0B2BEC7A3E19EAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(65 + 4), (byte)(27 + 56), (byte)(7 + 40), (byte)(13 + 54), (byte)(48 + 18), (byte)(41 + 26), (byte)(46 + 1), (byte)(59 + 21), (byte)(45 + 30), (byte)(55 + 12), (byte)(15 + 68), 53, (byte)(42 + 38), (byte)(72 + 25), (byte)(42 + 58), 100, (byte)(4 + 101), (byte)(99 + 11), (byte)(31 + 72)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼࢃࢃࢄࡱࢉࢇ࢒ࡰࡹ࢞", (byte)88, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_150.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = 2048 >>> 11 | 2048 << ~11 + 1;
        var_int_b = 0 >>> 38 | 0 << -38;
        var_int_c = (524288 >>> 51 | 524288 << -51) & 0xFFFFFFFF;
        d = 0 >>> 179 | 0 << -179;
        e = 0 >>> 43 | 0 << ~43 + 1;
        f = 0 >>> 22 | 0 << -22;
        g = Long.reverse(1670429304799955274L);
        h = 0x400000 >>> 54 | 0x400000 << -54;
        i = Long.reverse(-3229487089779144374L);
        j = Long.reverse(-4323455642275676160L);
        k = (256 >>> 135 | 256 << -135) & 0xFFFFFFFF;
        l = Long.reverse(-3229487089779144374L);
        m = Long.reverse(-4323455642275676160L);
        n = 393216 >>> 209 | 393216 << -209;
        o = Long.reverse(-3229487089779144374L);
        p = Long.reverse(-4323455642275676160L);
        q = 256 >>> 166 | 256 << ~166 + 1;
        r = Long.reverse(-3229487089779144374L);
        s = Long.reverse(-4323455642275676160L);
        t = (1280 >>> 168 | 1280 << ~168 + 1) & 0xFFFFFFFF;
        u = (-1 >>> 87 | -1 << -87) & 0xFFFFFFFF;
        v = Long.reverse(1670429304799955274L);
        w = (0x30000000 >>> 59 | 0x30000000 << ~59 + 1) & 0xFFFFFFFF;
        x = Long.reverse(1670429304799955274L);
        y = Integer.reverse(-536870912);
        z = Long.reverse(-3229487089779144374L);
        aa = Long.reverse(-4323455642275676160L);
        ab = 32768 >>> 140 | 32768 << -140;
        ac = Long.reverse(-3229487089779144374L);
        ad = Long.reverse(-4323455642275676160L);
        ae = Integer.reverse(-1879048192);
        af = Integer.reverse(-1);
        ag = Long.reverse(1670429304799955274L);
        ah = Integer.reverse(0x50000000);
        ai = Long.reverse(-3229487089779144374L);
        aj = Long.reverse(-4323455642275676160L);
        ak = 0x5800000 >>> 215 | 0x5800000 << ~215 + 1;
        al = Long.reverse(-3229487089779144374L);
        am = Long.reverse(-4323455642275676160L);
        an = 48 >>> 2 | 48 << -2;
        ao = (-1 >>> 196 | -1 << ~196 + 1) & 0xFFFFFFFF;
        ap = Long.reverse(1670429304799955274L);
        aq = Integer.reverse(-1342177280);
        ar = Long.reverse(1670429304799955274L);
        as = Integer.reverse(0x70000000);
        at = Integer.reverse(-1);
        au = Long.reverse(1670429304799955274L);
        av = Float.intBitsToFloat(Integer.reverse(3714));
        aw = Integer.reverse(0x20000000);
        ax = Integer.reverse(0x10000000);
        ay = (0 >>> 218 | 0 << ~218 + 1) & 0xFFFFFFFF;
        az = (0x78000000 >>> 251 | 0x78000000 << -251) & 0xFFFFFFFF;
        ba = Long.reverse(-3229487089779144374L);
        bb = Long.reverse(-4323455642275676160L);
        bc = 0x100000 >>> 20 | 0x100000 << ~20 + 1;
        bd = (0 >>> 170 | 0 << -170) & 0xFFFFFFFF;
        be = Integer.reverse(0x40000000);
        bf = (2048 >>> 39 | 2048 << -39) & 0xFFFFFFFF;
        bg = Integer.reverse(-1);
        bh = Long.reverse(1670429304799955274L);
        bi = Integer.reverse(-1073741824);
        bj = (0x1000000 >>> 214 | 0x1000000 << -214) & 0xFFFFFFFF;
        bk = Integer.reverse(-2013265920);
        bl = Long.reverse(-3229487089779144374L);
        bm = Long.reverse(-4323455642275676160L);
        bn = -1610612736 >>> 93 | -1610612736 << ~93 + 1;
        bo = Integer.reverse(0x60000000);
        bp = Integer.reverse(0x48000000);
        bq = Long.reverse(-3229487089779144374L);
        br = Long.reverse(-4323455642275676160L);
        bs = Integer.reverse(-536870912);
        bt = (0x1300000 >>> 52 | 0x1300000 << -52) & 0xFFFFFFFF;
        bu = Long.reverse(1670429304799955274L);
        bv = (0x5000000 >>> 54 | 0x5000000 << ~54 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(0x28000000);
        var_java_lang_String_arr_a = new String[bv];
        var_java_lang_String_arr_b = new String[bw];
        NLoginCore_150.b();
        cfr_renamed_8 = new EnumMap(NLoginCore_055.class);
        var_com_nickuc_login_NLoginCore_055_b = NLoginCore_055.var_com_nickuc_login_NLoginCore_055_d;
    }

    public static NLoginCore_316 a(NLoginCore_055 NLoginCore_0552) {
        NLoginCore_316 NLoginCore_3162 = cfr_renamed_8.get((Object)NLoginCore_0552);
        if (NLoginCore_3162 == null) {
            throw new IllegalStateException((Object)((Object)NLoginCore_0552) + (String)NLoginCore_150.c("㺀", (int)f, (long)g));
        }
        return NLoginCore_3162;
    }

    public static List<String> c(NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        return NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b).b(NLoginCore_4872, objectArray);
    }

    public static String a(NLoginCore_055 NLoginCore_0552, NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        return NLoginCore_4872.var_boolean_aJ ? String.join((CharSequence)NLoginCore_150.c("㺀", (int)h, (long)(i ^ j)), NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_4872, objectArray)) + (String)NLoginCore_150.c("㺃", (int)k, (long)(l ^ m)) : NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_4872, objectArray);
    }

    public static String a(NLoginCore_374 NLoginCore_4872, String string, @Nullable NLoginCore_277 NLoginCore_277, Object ... objectArray) {
        NLoginCore_055 NLoginCore_0552;
        NLoginCore_509 NLoginCore_5092 = NLoginCore_277 != null ? NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277) : null;
        NLoginCore_055 NLoginCore_0553 = NLoginCore_0552 = NLoginCore_5092 != null ? NLoginCore_5092.com_nickuc_login_NLoginCore_055_a() : NLoginCore_150.c();
        if (NLoginCore_4872.var_boolean_aJ) {
            List<String> list = NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_4872, objectArray);
            return String.join((CharSequence)NLoginCore_150.c("㺀", (int)n, (long)(o ^ p)), list).replace((CharSequence)NLoginCore_150.c("㺃", (int)q, (long)(r ^ s)), string) + (String)NLoginCore_150.c("㺆", (int)(t & u), (long)v);
        }
        return NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_4872, objectArray).replace((CharSequence)NLoginCore_150.c("㺉", (int)w, (long)x), string);
    }

    public static void a(NLoginCore_277 NLoginCore_277, NLoginCore_508 NLoginCore_5082, Object ... objectArray) {
        NLoginCore_509 NLoginCore_5092 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
        NLoginCore_150.a(NLoginCore_5092.com_nickuc_login_NLoginCore_055_a()).a(NLoginCore_5082).a(NLoginCore_277, objectArray);
    }

    public static String a(NLoginCore_374 NLoginCore_4872, NLoginCore_277 NLoginCore_277, Object ... objectArray) {
        return NLoginCore_150.a(NLoginCore_4872, NLoginCore_277.getName(), NLoginCore_277, objectArray);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_150.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ԫՍՏԯՓղժրլԻչկսշՀեևֆվքվՓ", (byte)71, 70), NLoginCore_150.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_004.E("զճղԵյձլյրկԼպվշպրՂࣉࣉ࣊ࢷ࣏࣍ࣘࢶࢿࣤ՘", (byte)71, 69) + string + NLoginCore_091.A("Ň", (byte)71, 65) + methodType.toString(), exception);
        }
    }

    public static List<String> a(NLoginCore_374 NLoginCore_4872, NLoginCore_277 NLoginCore_277, Object ... objectArray) {
        return NLoginCore_150.a(NLoginCore_4872, NLoginCore_277.getName(), NLoginCore_277, objectArray);
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_4872, null, objectArray);
    }

    public static List<String> a(NLoginCore_374 NLoginCore_4872, String string, @Nullable NLoginCore_277 NLoginCore_277, Object ... objectArray) {
        NLoginCore_509 NLoginCore_5092 = NLoginCore_277 != null ? NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277) : null;
        NLoginCore_055 NLoginCore_0552 = NLoginCore_5092 != null ? NLoginCore_5092.com_nickuc_login_NLoginCore_055_a() : NLoginCore_150.c();
        List<String> list = NLoginCore_150.a(NLoginCore_0552).b(NLoginCore_4872, objectArray);
        list.replaceAll(string2 -> string2.replace((CharSequence)NLoginCore_150.c("㺀", (int)bt, (long)bu), string));
        return list;
    }

    public static boolean aM() {
        return (var_com_nickuc_login_NLoginCore_055_b == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_g ? var_int_c : d) != 0;
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_119 NLoginCore_1942, float f, float f2) {
        if (!(NLoginInterface_0422 instanceof NLoginCore_277) || !NLoginCore_532.am.ar()) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
        if (NLoginType_008.com_nickuc_login_NLoginType_008_c().L()) {
            NLoginType_010 NLoginType_0102 = (NLoginType_010)NLoginType_008.com_nickuc_login_NLoginType_008_c().c();
            Object[] objectArray = new Object[ax];
            objectArray[NLoginCore_150.ay] = NLoginCore_150.c("㺀", (int)az, (long)(ba ^ bb));
            objectArray[NLoginCore_150.bc] = bd;
            objectArray[NLoginCore_150.be] = NLoginCore_150.c("㺃", (int)(bf & bg), (long)bh);
            objectArray[NLoginCore_150.bi] = NLoginCore_1942.name();
            objectArray[NLoginCore_150.bj] = NLoginCore_150.c("㺆", (int)bk, (long)(bl ^ bm));
            objectArray[NLoginCore_150.bn] = Float.valueOf(f);
            objectArray[NLoginCore_150.bo] = NLoginCore_150.c("㺉", (int)bp, (long)(bq ^ br));
            objectArray[NLoginCore_150.bs] = Float.valueOf(f2);
            NLoginType_0102.com_nickuc_login_NLoginCore_199_a().a(NLoginCore_277, aw, objectArray);
        } else {
            Player player = (Player)NLoginCore_277.c();
            NLoginCore_1942.a(sound -> player.playSound(player.getLocation(), sound, f, f2));
        }
    }

    public static String a(NLoginCore_374 NLoginCore_4872, Object ... objectArray) {
        return NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b, NLoginCore_4872, objectArray);
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_119 NLoginCore_1942) {
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_1942, av, 1.0f);
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_397 NLoginCore_2372, Consumer<String> consumer, Object ... objectArray) {
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
            String string = NLoginCore_277.getName();
            NLoginCore_509 NLoginCore_5092 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_a();
            NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
            if (consumer == null) {
                consumer = NLoginInterface_0242::a;
            }
            if (NLoginCore_2372.aI) {
                List<String> list = NLoginCore_150.a(NLoginCore_0552).b(NLoginCore_2372, objectArray);
                for (String string2 : list) {
                    consumer.accept(string2.replace((CharSequence)NLoginCore_150.c("㺀", (int)ak, (long)(al ^ am)), string).replace((CharSequence)NLoginCore_150.c("㺃", (int)(an & ao), (long)ap), NLoginCore_277.ac()));
                }
            } else {
                String string3 = NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_2372, objectArray);
                if (!string3.isEmpty()) {
                    consumer.accept(string3.replace((CharSequence)NLoginCore_150.c("㺆", (int)aq, (long)ar), string).replace((CharSequence)NLoginCore_150.c("㺉", (int)(as & at), (long)au), NLoginCore_277.ac()));
                }
            }
        } else {
            if (consumer == null) {
                consumer = NLoginInterface_0422::k;
            }
            if (NLoginCore_2372.aI) {
                List<String> list = NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b).a(NLoginCore_2372, objectArray);
                for (String string : list) {
                    consumer.accept(string);
                }
            } else {
                String string = NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b).a(NLoginCore_2372, objectArray);
                if (!string.isEmpty()) {
                    consumer.accept(string);
                }
            }
        }
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, String string, Object ... objectArray) {
        if (objectArray.length > 0) {
            string = String.format(string, objectArray);
        }
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginCore_509 NLoginCore_5092 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b((NLoginCore_277)NLoginInterface_0422);
            NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a().a(string, null, null, null, null);
        } else {
            NLoginInterface_0422.k(string);
        }
    }

    public static boolean j() {
        return (var_com_nickuc_login_NLoginCore_055_b == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_c || var_com_nickuc_login_NLoginCore_055_b == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_s ? var_int_a : var_int_b) != 0;
    }

    public static void a(NLoginType_008 NLoginType_008, NLoginCore_055 NLoginCore_0552) {
        NLoginCore_316 NLoginCore_3162 = new NLoginCore_316(NLoginType_008, NLoginCore_0552, NLoginCore_0552 == NLoginCore_055.var_com_nickuc_login_NLoginCore_055_x ? NLoginCore_150.aC() : NLoginCore_0552.cO);
        cfr_renamed_8.put(NLoginCore_0552, NLoginCore_3162);
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_397 NLoginCore_2372, Object ... objectArray) {
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_2372, null, objectArray);
    }

    public static void a(NLoginCore_494 NLoginInterface_0422, NLoginCore_374 NLoginCore_4872, Consumer<String> consumer, Object ... objectArray) {
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
            String string = NLoginCore_277.getName();
            NLoginCore_509 NLoginCore_5092 = NLoginType_008.com_nickuc_login_NLoginType_008_c().com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            NLoginCore_055 NLoginCore_0552 = NLoginCore_5092.com_nickuc_login_NLoginCore_055_a();
            NLoginInterface_024 NLoginInterface_0242 = NLoginCore_5092.com_nickuc_login_NLoginInterface_024_a();
            if (consumer == null) {
                consumer = NLoginInterface_0242::a;
            }
            if (NLoginCore_4872.var_boolean_aJ) {
                List<String> list = NLoginCore_150.a(NLoginCore_0552).b(NLoginCore_4872, objectArray);
                for (String string2 : list) {
                    consumer.accept(string2.replace((CharSequence)NLoginCore_150.c("㺀", (int)y, (long)(z ^ aa)), string).replace((CharSequence)NLoginCore_150.c("㺃", (int)ab, (long)(ac ^ ad)), NLoginCore_277.ac()));
                }
            } else {
                String string3 = NLoginCore_150.a(NLoginCore_0552).a(NLoginCore_4872, objectArray);
                if (!string3.isEmpty()) {
                    consumer.accept(string3.replace((CharSequence)NLoginCore_150.c("㺆", (int)(ae & af), (long)ag), string).replace((CharSequence)NLoginCore_150.c("㺉", (int)ah, (long)(ai ^ aj)), NLoginCore_277.ac()));
                }
            }
        } else {
            if (consumer == null) {
                consumer = NLoginInterface_0422::k;
            }
            if (NLoginCore_4872.var_boolean_aJ) {
                List<String> list = NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b).a(NLoginCore_4872, objectArray);
                for (String string : list) {
                    consumer.accept(string);
                }
            } else {
                String string = NLoginCore_150.a(var_com_nickuc_login_NLoginCore_055_b).a(NLoginCore_4872, objectArray);
                if (!string.isEmpty()) {
                    consumer.accept(string);
                }
            }
        }
    }

    @Generated
    public static NLoginCore_055 c() {
        return var_com_nickuc_login_NLoginCore_055_b;
    }

    private static void b() {
        int n;
        var_long_c = 5949396860357670091L;
        long l = var_long_c ^ 0x5E0B2BEC7A3E19EAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(17 + 52), (byte)(57 + 26), (byte)(40 + 7), (byte)(55 + 12), (byte)(14 + 52), (byte)(3 + 64), (byte)(29 + 18), (byte)(8 + 72), (byte)(50 + 25), (byte)(43 + 24), 83, (byte)(14 + 39), (byte)(57 + 23), (byte)(90 + 7), 100, (byte)(43 + 57), (byte)(83 + 22), (byte)(72 + 38), (byte)(81 + 22)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
                    NLoginCore_150.var_java_lang_String_arr_b[0] = NLoginCore_559.A("ƈƺƌƬƓŸƀƺƱƏƝƓƦƒǋƥǁƝƶƪƬƯƛǅǒǐƢƩƭƫǐƨ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[1] = NLoginCore_138.C("ԐՑՋ՘ԥԲԱԙԤ՚ԕԣ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[2] = NLoginCore_223.A("ƭƴŴƿƳƝƴƮǄǆưƋ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[3] = NLoginCore_110.F("Փ֔֎֛ըյմ՜է֝՘զ", (byte)98, 70);
                    NLoginCore_150.var_java_lang_String_arr_b[4] = NLoginCore_201.C("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[5] = NLoginCore_027.F("ֈ֏Տ֚֎ո֏։֟֡֋զ", (byte)98, 70);
                    NLoginCore_150.var_java_lang_String_arr_b[6] = NLoginCore_446.A("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[7] = NLoginCore_384.F("լչ֋։իղ՜էժՙ՘զ", (byte)98, 70);
                    NLoginCore_150.var_java_lang_String_arr_b[8] = NLoginCore_223.D("ԏԏԪԕՐԗԯԦՌԱԻՖՋՎ՝գՂՎԺ՟ԼէԮԯ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[9] = NLoginCore_559.B("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[10] = NLoginCore_223.B("ŷŷƒŽƸſƗƎƴƙƣƾƳƶǅǋƪƶƢǇƤǏƖƗ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[11] = NLoginCore_138.D("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[12] = NLoginCore_092.E("ՒՒխ՘֓՚ղթ֏մվ֙֎֑֦֠օ֑ս֢տ֪ձղ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[13] = NLoginCore_201.A("ƑƞưƮƐƗƁƌƏžŽƋ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[14] = NLoginCore_201.F("ՒՒխ՘֓՚ղթ֏մվ֙֎֑֦֠օ֑ս֢տ֪ձղ", (byte)98, 70);
                    NLoginCore_150.var_java_lang_String_arr_b[15] = NLoginCore_575.C("ԢԪԲԫԵՐՍ՛ՎԩԦԣ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[16] = NLoginCore_201.B("ƉƋƮŶžŻơǄƾƚƚƋ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[17] = NLoginCore_091.A("ƪƓŶƾƚơƲŵƗƚƅƋ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[18] = NLoginCore_004.B("ƇƯưƖƙƮƞƑƜƃƸƋ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[19] = NLoginCore_223.C("ԩԶՈՆԨԯԙԤԧԖԕԣ", (byte)98, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_150.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ԠՒԤՄԫԐԘՒՉԧԵԫԾԪգԽՙԵՎՂՄՉ՝ՈԦ՚ԩեՐՒՓԬ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[1] = NLoginCore_451.F("լաՑ֔զ՚֌ս֒ցմռ֔ջ֒ե֔հ֧֨ճմձղ", (byte)98, 70);
                    NLoginCore_150.var_java_lang_String_arr_b[2] = NLoginCore_559.E("ի՗ի֏նք֊֋կ֞֗զ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[3] = NLoginCore_453.B("ŻƜƗŸǁưƷƷƻƚŽƖƴƥƪƠƫƅƋƟƮƩƖƗ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[4] = NLoginCore_223.C("ՊԯԤՆՖԡԙՈՕԻԹԽԶԽՁԞԽԽԟԹԻԱԮԯ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[5] = NLoginCore_027.D("ՁԏԿԱՃՈՏՄԧԯԝԣ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ƎźƏƝƎƫƘƳƺƖŸƏƣƢƳƉƿƗƾƷƣƿƖƗ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[7] = NLoginCore_110.B("ƎƫƷźƱƴǁƲƴƅƐƶƢƲƻƋǊſƼƥƼƙƖƗ", (byte)98, 66);
                    NLoginCore_150.var_java_lang_String_arr_b[8] = NLoginCore_387.D("ԏԏԪԕՐԗԯԦՌԱԺԘԴԫ՚դԼ԰ԻԞԷՁԮԯ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[9] = NLoginCore_110.E("֌աըէ֚֙թժ֖֙՟սլ֣֖֜տ֐֘է֠քձղ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[10] = NLoginCore_173.A("ŷŷƒŽƸſƗƎƴƙƥǄƕǀƅƶǍƧǅǎǋƩƖƗ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[11] = NLoginCore_223.E("ՠկշՒչ֓ռծ՛կ՜՝՛ռ֘ռպպյփիքձղ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[12] = NLoginCore_110.E("ՒՒխ՘֓՚ղթ֏մտւ՞֥մ֛՝֗՛ռ֢֪ձղ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[13] = NLoginCore_138.D("ԣԝՂԦՖՂՓԱՍԫԬ՛ԽբԲՋԲՖԺՈԶ՗Ԯԯ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[14] = NLoginCore_173.D("ԏԏԪԕՐԗԯԦՌԱԼԹԩԭԘԷգԟԱ՛ԱէԮԯ", (byte)98, 68);
                    NLoginCore_150.var_java_lang_String_arr_b[15] = NLoginCore_451.A("ŮƮƬƺơƕƚƏƬǅżƸƩƥƺƹƫƹƪƘƿǏƖƗ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[16] = NLoginCore_138.C("ՑԇՇԡԐԮԮԣԥԥԜԽԴԘԜգՒ԰էՖ՛էԮԯ", (byte)98, 67);
                    NLoginCore_150.var_java_lang_String_arr_b[17] = NLoginCore_110.A("ƷƖƟƒžơŻƚƔƤƮƶƇƢƳǋƝƄƅƺƊƿƖƗ", (byte)98, 65);
                    NLoginCore_150.var_java_lang_String_arr_b[18] = NLoginCore_559.E("Տ֏֗յիՕչէ֛֜֒զ", (byte)98, 69);
                    NLoginCore_150.var_java_lang_String_arr_b[19] = NLoginCore_092.B("ƱƶƏƒƷƺǃǃƂƺƳǈǀƽƔƫƩƷǀƦƻƩƖƗ", (byte)98, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_150.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ԾԇՏԬ԰ԵԕՏ՜ԵԬԴԵԸԵՕՁԥԤ՜՟ԣ՞ՂՆդԼԧէը՛ի", (byte)98, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_150.var_java_lang_String_arr_b[0] = NLoginCore_092.D("ԴՐՌԎԐԷՒ԰՛ԵՌԣ", (byte)98, 68);
                }
            }
        }
    }
}

