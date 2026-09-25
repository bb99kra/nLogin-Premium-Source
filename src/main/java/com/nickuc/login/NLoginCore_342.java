/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public final class NLoginCore_342
extends Enum<NLoginCore_342> {
    public static final /* enum */ NLoginCore_342 var_com_nickuc_login_NLoginCore_342_b;
    public static final /* enum */ NLoginCore_342 var_com_nickuc_login_NLoginCore_342_c;
    public static final /* enum */ NLoginCore_342 var_com_nickuc_login_NLoginCore_342_d;
    private final String bD;
    private final String bE;
    private static final /* synthetic */ NLoginCore_342[] var_com_nickuc_login_NLoginCore_342_arr_a;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_c;
    private static int var_int_a;
    private static int var_int_b;
    private static long var_long_d;
    private static int e;
    private static int f;
    private static int g;
    private static long h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static long t;
    private static int u;
    private static int v;
    private static int w;
    private static long x;
    private static int y;
    private static long z;
    private static long aa;
    private static int ab;
    private static int ac;
    private static long ad;
    private static int ae;
    private static int af;
    private static long ag;
    private static long ah;
    private static int ai;
    private static long aj;
    private static long ak;
    private static int al;
    private static long am;
    private static long an;
    private static int ao;
    private static int ap;
    private static long aq;
    private static long ar;
    private static int as;
    private static long at;
    private static long au;

    public boolean a(File file, String string) {
        String string2 = this.a(file);
        return string2.equals(string);
    }

    public String a(InputStream inputStream) {
        try {
            return NLoginCore_140.a(inputStream, this.java_security_MessageDigest_a());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    static {
        var_int_a = 0 >>> 225 | 0 << ~225 + 1;
        var_int_b = (-1 >>> 69 | -1 << -69) & 0xFFFFFFFF;
        var_long_d = Long.reverse(-7562755073886666454L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = -1 >>> 252 | -1 << -252;
        h = Long.reverse(-7562755073886666454L);
        i = 0x4000000 >>> 186 | 0x4000000 << ~186 + 1;
        j = Integer.reverse(0);
        k = Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1;
        l = 192 >>> 166 | 192 << ~166 + 1;
        m = Integer.reverse(0);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0x40000000);
        p = 180224 >>> 206 | 180224 << -206;
        q = Integer.reverse(-805306368);
        r = Integer.reverse(0x40000000);
        s = -1 >>> 114 | -1 << ~114 + 1;
        t = Long.reverse(-7562755073886666454L);
        u = 0 >>> 152 | 0 << ~152 + 1;
        v = (0x3000000 >>> 152 | 0x3000000 << ~152 + 1) & 0xFFFFFFFF;
        w = (-1 >>> 58 | -1 << -58) & 0xFFFFFFFF;
        x = Long.reverse(-7562755073886666454L);
        y = Integer.reverse(0x20000000);
        z = Long.reverse(5984072605243785514L);
        aa = Long.reverse(-4323455642275676160L);
        ab = (0x500000 >>> 212 | 0x500000 << ~212 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(-1);
        ad = Long.reverse(-7562755073886666454L);
        ae = Integer.reverse(Integer.MIN_VALUE);
        af = Integer.reverse(0x60000000);
        ag = Long.reverse(5984072605243785514L);
        ah = Long.reverse(-4323455642275676160L);
        ai = (-2147483645 >>> 223 | -2147483645 << ~223 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(5984072605243785514L);
        ak = Long.reverse(-4323455642275676160L);
        al = Integer.reverse(0x10000000);
        am = Long.reverse(5984072605243785514L);
        an = Long.reverse(-4323455642275676160L);
        ao = 65536 >>> 143 | 65536 << ~143 + 1;
        ap = (576 >>> 166 | 576 << -166) & 0xFFFFFFFF;
        aq = Long.reverse(5984072605243785514L);
        ar = Long.reverse(-4323455642275676160L);
        as = (80 >>> 67 | 80 << -67) & 0xFFFFFFFF;
        at = Long.reverse(5984072605243785514L);
        au = Long.reverse(-4323455642275676160L);
        var_java_lang_String_arr_a = new String[p];
        var_java_lang_String_arr_b = new String[q];
        NLoginCore_342.b();
        var_com_nickuc_login_NLoginCore_342_b = new NLoginCore_342((String)NLoginCore_342.c("㺃", (int)(v & w), (long)x), (String)NLoginCore_342.c("㺆", (int)y, (long)(z ^ aa)));
        var_com_nickuc_login_NLoginCore_342_c = new NLoginCore_342((String)NLoginCore_342.c("㺌", (int)af, (long)(ag ^ ah)), (String)NLoginCore_342.c("㺏", (int)ai, (long)(aj ^ ak)));
        var_com_nickuc_login_NLoginCore_342_d = new NLoginCore_342((String)NLoginCore_342.c("㺕", (int)ap, (long)(aq ^ ar)), (String)NLoginCore_342.c("㺘", (int)as, (long)(at ^ au)));
        var_com_nickuc_login_NLoginCore_342_arr_a = NLoginCore_342.com_nickuc_login_NLoginCore_342_arr_a();
    }

    public String a(File file) {
        try {
            return NLoginCore_366.a(file, this.java_security_MessageDigest_a());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Generated
    public String ag() {
        return this.bE;
    }

    private static /* synthetic */ NLoginCore_342[] com_nickuc_login_NLoginCore_342_arr_a() {
        NLoginCore_342[] NLoginCore_342Array = new NLoginCore_342[l];
        NLoginCore_342Array[NLoginCore_342.m] = var_com_nickuc_login_NLoginCore_342_b;
        NLoginCore_342Array[NLoginCore_342.n] = var_com_nickuc_login_NLoginCore_342_c;
        NLoginCore_342Array[NLoginCore_342.o] = var_com_nickuc_login_NLoginCore_342_d;
        return NLoginCore_342Array;
    }

    @Generated
    private NLoginCore_342(String string2, String string3) {
        this.bD = string2;
        this.bE = string3;
    }

    public boolean a(InputStream inputStream, String string) {
        String string2 = this.a(inputStream);
        return string2.equals(string);
    }

    private static void b() {
        int n;
        var_long_c = 6089937183153443018L;
        long l = var_long_c ^ 0xCD044FE2A24A599DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(11 + 58), (byte)(26 + 57), (byte)(8 + 39), (byte)(4 + 63), (byte)(22 + 44), (byte)(37 + 30), (byte)(28 + 19), (byte)(54 + 26), (byte)(47 + 28), (byte)(64 + 3), (byte)(61 + 22), 53, 80, (byte)(92 + 5), (byte)(17 + 83), (byte)(73 + 27), (byte)(62 + 43), (byte)(35 + 75), (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_342.var_java_lang_String_arr_b[0] = NLoginCore_451.D("ӹӘӀӚԁӷԄԌԁԄԂӕ", (byte)72, 68);
                    NLoginCore_342.var_java_lang_String_arr_b[1] = NLoginCore_076.B("ŶŃżŅŪƋŪŹŽƌŪŗ", (byte)72, 66);
                    NLoginCore_342.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ӠӤӜӵөӈԁӅӡԄԎӕ", (byte)72, 67);
                    NLoginCore_342.var_java_lang_String_arr_b[3] = NLoginCore_446.C("ӠӤӜӵөӈԁӅӡԄԎӕ", (byte)72, 67);
                    NLoginCore_342.var_java_lang_String_arr_b[4] = NLoginCore_004.B("ŰŉœźņƅƀŻŬťƌŗ", (byte)72, 66);
                    NLoginCore_342.var_java_lang_String_arr_b[5] = NLoginCore_091.B("ƀŲŷƆŨƇŚŌŻƎŞŗ", (byte)72, 66);
                    NLoginCore_342.var_java_lang_String_arr_b[6] = NLoginCore_446.D("ӯԃԇӾӃӘӬӛӖԐӤӕ", (byte)72, 68);
                    NLoginCore_342.var_java_lang_String_arr_b[7] = NLoginCore_091.E("լԹ՜մ՜ցԺծՁ՜ցՌ", (byte)72, 69);
                    NLoginCore_342.var_java_lang_String_arr_b[8] = NLoginCore_138.E("ՙՖ՜՜վՋՋԶոՐ՗Ռ", (byte)72, 69);
                    NLoginCore_342.var_java_lang_String_arr_b[9] = NLoginCore_387.F("կՈՍՠՏՠԹհխևՓՌ", (byte)72, 70);
                    NLoginCore_342.var_java_lang_String_arr_b[10] = NLoginCore_201.B("ƁĻŁşŉŹşřƃŧōŗ", (byte)72, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_342.var_java_lang_String_arr_b[0] = NLoginCore_092.B("ŽŗƋşŴŮƀſśƄőŗ", (byte)72, 66);
                    NLoginCore_342.var_java_lang_String_arr_b[1] = NLoginCore_223.E("ճտրՠլբՓՌրՕէՌ", (byte)72, 69);
                    NLoginCore_342.var_java_lang_String_arr_b[2] = NLoginCore_110.E("ոձճոա՗Ր՗՚՞էՌ", (byte)72, 69);
                    NLoginCore_342.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ŴŤƆŃřƊŇŠŽŭőŗ", (byte)72, 65);
                    NLoginCore_342.var_java_lang_String_arr_b[4] = NLoginCore_201.A("ŁŠƀŬƅƁƎšŝƆŞŗ", (byte)72, 65);
                    NLoginCore_342.var_java_lang_String_arr_b[5] = NLoginCore_027.A("ŹƈŁƄťƅŜƐƉőŚŗ", (byte)72, 65);
                    NLoginCore_342.var_java_lang_String_arr_b[6] = NLoginCore_575.C("ԂӡӧӜӛӉӛӚԉԃӾӕ", (byte)72, 67);
                    NLoginCore_342.var_java_lang_String_arr_b[7] = NLoginCore_427.F("ԵՍԿՊռԼ՞ե՛ՄցՌ", (byte)72, 70);
                    NLoginCore_342.var_java_lang_String_arr_b[8] = NLoginCore_559.A("ƆƁŷŷƅŜůŋŭŬƊśţŤŭŢƀŰůƏũťŢţ", (byte)72, 65);
                    NLoginCore_342.var_java_lang_String_arr_b[9] = NLoginCore_446.D("ӡԃӜӾԋԃӉӡӄԅӜӞԅӅӍӴӈԋԕӣӪԉӠӡ", (byte)72, 68);
                    NLoginCore_342.var_java_lang_String_arr_b[10] = NLoginCore_027.D("ӀӝԃӿӴӉӈӢӚӛӎԎӡӝӽԂӣԎԐӫӗԙӠӡ", (byte)72, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_342.var_java_lang_String_arr_b[0] = NLoginCore_138.E("՛԰մԻՁՐԾՌվմՂԾէջչՙևկՎ֑՜ր՗՘", (byte)72, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_342.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ԳՖՐՍԺժՠվբքՔՓՒւքՈըցՈտ֍֐՗՘", (byte)72, 69);
                }
            }
        }
    }

    public boolean g(String string, String string2) {
        String string3 = this.w(string);
        return string3.equals(string2);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_342.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.E("ԝԿՁԡՅդ՜ղ՞ԭիակթԲ՗չոհնհՅ", (byte)57, 69), NLoginCore_342.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ӃӐӏҒӒӎӉӒӝӌҙӗӛӔӗӝҟࠗ࠯࠵ࠥࠛ࠙࠳ࠡࠡࠝࠡ࠼࠾Ҹ", (byte)57, 67) + string + NLoginCore_138.C("Қ", (byte)57, 67) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x23L;
        l ^= 0xCD044FE2A24A599DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), (byte)(40 + 29), (byte)(34 + 49), (byte)(20 + 27), 67, 66, (byte)(19 + 48), (byte)(35 + 12), (byte)(52 + 28), (byte)(10 + 65), (byte)(2 + 65), (byte)(13 + 70), (byte)(14 + 39), (byte)(14 + 66), (byte)(37 + 60), (byte)(67 + 33), (byte)(60 + 40), (byte)(86 + 19), (byte)(60 + 50), (byte)(18 + 85)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_451.A("ĊėĖÙęĕĐęĤēàĞĢěĞĤæўѶѼѬѢѠѺѨѨѤѨ҃҅", (byte)20, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_342.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public MessageDigest java_security_MessageDigest_a() {
        try {
            return MessageDigest.getInstance(this.bD);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    public String w(String string) {
        return this.b(string.getBytes());
    }

    public String b(byte[] byArray) {
        MessageDigest messageDigest = this.java_security_MessageDigest_a();
        messageDigest.reset();
        messageDigest.update(byArray);
        byte[] byArray2 = messageDigest.digest();
        Object[] objectArray = new Object[i];
        objectArray[NLoginCore_342.j] = new BigInteger(k, byArray2);
        return String.format((String)NLoginCore_342.c("㺀", (int)(var_int_a & var_int_b), (long)var_long_d) + (byArray2.length << e) + (String)NLoginCore_342.c("㺃", (int)(f & g), (long)h), objectArray);
    }

    public static NLoginCore_342 valueOf(String string) {
        return Enum.valueOf(NLoginCore_342.class, string);
    }

    public static NLoginCore_342[] values() {
        return (NLoginCore_342[])var_com_nickuc_login_NLoginCore_342_arr_a.clone();
    }
}

