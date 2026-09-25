/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_414;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_496 {
    private static String[] var_java_lang_String_arr_b;
    public static final GeneralSecurityException var_java_security_GeneralSecurityException_b;
    private static int aa;
    private static int k;
    private static int al;
    private static long u;
    private static int ca;
    private static int ao;
    private static int var_int_c;
    private static long bc;
    private static long cc;
    public static final byte[] var_byte_arr_g;
    private static int bd;
    private static long h;
    private static int y;
    private static int j;
    private static int bm;
    private static int au;
    private static long e;
    private static int o;
    private static int ay;
    private static int cb;
    private static int ag;
    private static long bw;
    private static long ce;
    private static long w;
    private static long bt;
    private static int cf;
    private static long var_long_cg;
    private static long bh;
    private static int d;
    private static long bb;
    private static long var_long_b;
    public static final NLoginCore_414<String, String> cfr_renamed_25;
    public static final GeneralSecurityException var_java_security_GeneralSecurityException_a;
    private static int bj;
    private static long af;
    private static long an;
    private static final KeyFactory var_java_security_KeyFactory_a;
    private static long bl;
    private static int cd;
    private static long ap;
    public static final String var_java_lang_String_ch;
    private static int ba;
    private static int aw;
    private static int m;
    private static long l;
    private static long ac;
    private static int bs;
    private static long bk;
    private static final PublicKey var_java_security_PublicKey_a;
    private static long ak;
    private static int s;
    private static int av;
    public static final String var_java_lang_String_cg;
    private static long var_long_ch;
    private static long i;
    private static long bn;
    private static int bp;
    private static int t;
    private static int by;
    private static long x;
    private static long am;
    private static int v;
    private static long bi;
    private static long p;
    private static int ai;
    private static int var_int_a;
    private static long f;
    private static long ah;
    private static String[] var_java_lang_String_arr_a;
    private static long bu;
    private static long be;
    private static int r;
    private static long z;
    private static long bf;
    private static int az;
    private static int ar;
    private static final Base64.Encoder var_java_util_Base64$Encoder_a;
    private static int bg;
    private static long ab;
    private static long br;
    private static long ax;
    private static long ae;
    public static final NLoginCore_414<String, String> cfr_renamed_26;
    private static int ad;
    private static int n;
    private static long var_long_c;
    private static long aj;
    private static int bz;
    private static long q;
    private static int bv;
    private static int var_int_g;
    private static long bo;
    private static long bq;
    private static int as;
    private static long at;
    private static long bx;
    private static long aq;

    public static byte[] a(KeyPair keyPair, byte[] byArray) {
        Cipher cipher = Cipher.getInstance((String)NLoginCore_496.c("㺀", (int)as, (long)at));
        cipher.init(au, keyPair.getPrivate());
        return cipher.doFinal(byArray);
    }

    public static String a(Key key) {
        String[] stringArray;
        if (key == null) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺀", (int)v, (long)(w ^ x)));
        }
        if (key instanceof PublicKey) {
            stringArray = var_java_security_GeneralSecurityException_a;
        } else if (key instanceof PrivateKey) {
            stringArray = var_java_lang_String_arr_b;
        } else {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺃", (int)y, (long)z));
        }
        return (String)stringArray.i() + (String)NLoginCore_496.c("㺆", (int)aa, (long)(ab ^ ac)) + NLoginCore_496.c(key.getEncoded()) + (String)NLoginCore_496.c("㺉", (int)ad, (long)(ae ^ af)) + (String)stringArray.j() + (String)NLoginCore_496.c("㺌", (int)ag, (long)ah);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_496.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_496.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.B("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԻԥՊԧԱԝԽԱՍՁՏǉ", (byte)122, 66) + string + NLoginCore_201.A("ƭ", (byte)122, 65) + methodType.toString(), exception);
        }
    }

    public static byte[] a(String string, NLoginCore_414<String, String> NLoginCore_414) {
        int n = string.indexOf(NLoginCore_414.i());
        if (n < 0) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺀", (int)o, (long)(p ^ q)));
        }
        int n2 = NLoginCore_414.i().length();
        int n3 = string.indexOf(NLoginCore_414.j(), n2 + n) + r;
        if (n3 <= 0) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺃", (int)(s & t), (long)u));
        }
        return NLoginCore_496.b(string.substring(n + n2, n3));
    }

    public static KeyPair a(int n) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance((String)NLoginCore_496.c("㺀", (int)al, (long)(am ^ an)));
            keyPairGenerator.initialize(n);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((String)NLoginCore_496.c("㺃", (int)ao, (long)(ap ^ aq)), noSuchAlgorithmException);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x14L;
        l ^= 0x9E97E04B4B770480L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(19 + 50), (byte)(70 + 13), (byte)(18 + 29), 67, (byte)(8 + 58), (byte)(18 + 49), (byte)(22 + 25), (byte)(71 + 9), (byte)(15 + 60), (byte)(15 + 52), (byte)(5 + 78), (byte)(10 + 43), (byte)(67 + 13), (byte)(79 + 18), (byte)(13 + 87), (byte)(12 + 88), (byte)(44 + 61), (byte)(46 + 64), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("֔֡֠գ֣֣֚֮֟֝ժ֥֮֨֬֨հࣹࣣई࣯࣯ࣥࣛࣻऋࣿऍ", (byte)117, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_496.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    public static PublicKey b(byte[] byArray) {
        try {
            return var_java_security_KeyFactory_a.generatePublic(new X509EncodedKeySpec(byArray));
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺀", (int)ai, (long)(aj ^ ak)));
        }
    }

    public static PublicKey a() {
        return var_java_security_PublicKey_a;
    }

    public static String c(byte[] byArray) {
        return var_java_util_Base64$Encoder_a.encodeToString(byArray);
    }

    static {
        var_int_a = 0 >>> 11 | 0 << ~11 + 1;
        var_long_b = Long.reverse(-5327812542977482321L);
        var_int_c = Integer.reverse(0);
        d = (0x200000 >>> 213 | 0x200000 << -213) & 0xFFFFFFFF;
        e = Long.reverse(-7057194799887752785L);
        f = Long.reverse(0x2800000000000000L);
        var_int_g = 512 >>> 200 | 512 << -200;
        h = Long.reverse(-7057194799887752785L);
        i = Long.reverse(0x2800000000000000L);
        j = 0 >>> 18 | 0 << ~18 + 1;
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-5327812542977482321L);
        m = Integer.reverse(0x10000000);
        n = 0 >>> 189 | 0 << ~189 + 1;
        o = (8 >>> 193 | 8 << ~193 + 1) & 0xFFFFFFFF;
        p = Long.reverse(-7057194799887752785L);
        q = Long.reverse(0x2800000000000000L);
        r = (64 >>> 70 | 64 << -70) & 0xFFFFFFFF;
        s = (5120 >>> 234 | 5120 << -234) & 0xFFFFFFFF;
        t = Integer.reverse(-1);
        u = Long.reverse(-5327812542977482321L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-7057194799887752785L);
        x = Long.reverse(0x2800000000000000L);
        y = Integer.reverse(-536870912);
        z = Long.reverse(-5327812542977482321L);
        aa = 32 >>> 130 | 32 << -130;
        ab = Long.reverse(-7057194799887752785L);
        ac = Long.reverse(0x2800000000000000L);
        ad = 0x240000 >>> 18 | 0x240000 << -18;
        ae = Long.reverse(-7057194799887752785L);
        af = Long.reverse(0x2800000000000000L);
        ag = Integer.reverse(0x50000000);
        ah = Long.reverse(-5327812542977482321L);
        ai = (0x580000 >>> 211 | 0x580000 << ~211 + 1) & 0xFFFFFFFF;
        aj = Long.reverse(-7057194799887752785L);
        ak = Long.reverse(0x2800000000000000L);
        al = Integer.reverse(0x30000000);
        am = Long.reverse(-7057194799887752785L);
        an = Long.reverse(0x2800000000000000L);
        ao = Integer.reverse(-1342177280);
        ap = Long.reverse(-7057194799887752785L);
        aq = Long.reverse(0x2800000000000000L);
        ar = Integer.reverse(0x8000000);
        as = 3584 >>> 232 | 3584 << -232;
        at = Long.reverse(-5327812542977482321L);
        au = Integer.reverse(0x40000000);
        av = -2147483641 >>> 223 | -2147483641 << ~223 + 1;
        aw = Integer.reverse(-1);
        ax = Long.reverse(-5327812542977482321L);
        ay = 27648 >>> 106 | 27648 << -106;
        az = Integer.reverse(-671088640);
        ba = 64 >>> 226 | 64 << -226;
        bb = Long.reverse(-7057194799887752785L);
        bc = Long.reverse(0x2800000000000000L);
        bd = 278528 >>> 46 | 278528 << -46;
        be = Long.reverse(-7057194799887752785L);
        bf = Long.reverse(0x2800000000000000L);
        bg = 72 >>> 130 | 72 << ~130 + 1;
        bh = Long.reverse(-7057194799887752785L);
        bi = Long.reverse(0x2800000000000000L);
        bj = Integer.reverse(-939524096);
        bk = Long.reverse(-7057194799887752785L);
        bl = Long.reverse(0x2800000000000000L);
        bm = Integer.reverse(0x28000000);
        bn = Long.reverse(-7057194799887752785L);
        bo = Long.reverse(0x2800000000000000L);
        bp = 0x15000000 >>> 56 | 0x15000000 << -56;
        bq = Long.reverse(-7057194799887752785L);
        br = Long.reverse(0x2800000000000000L);
        bs = (180224 >>> 109 | 180224 << ~109 + 1) & 0xFFFFFFFF;
        bt = Long.reverse(-7057194799887752785L);
        bu = Long.reverse(0x2800000000000000L);
        bv = (376832 >>> 14 | 376832 << -14) & 0xFFFFFFFF;
        bw = Long.reverse(-7057194799887752785L);
        bx = Long.reverse(0x2800000000000000L);
        by = (0 >>> 199 | 0 << -199) & 0xFFFFFFFF;
        bz = Integer.reverse(0x32000000);
        ca = 0x300000 >>> 17 | 0x300000 << ~17 + 1;
        cb = Integer.reverse(-1);
        cc = Long.reverse(-5327812542977482321L);
        cd = Integer.reverse(-1744830464);
        ce = Long.reverse(-5327812542977482321L);
        cf = (13 >>> 255 | 13 << -255) & 0xFFFFFFFF;
        var_long_cg = Long.reverse(-7057194799887752785L);
        var_long_ch = Long.reverse(0x2800000000000000L);
        var_java_lang_String_arr_a = new String[ay];
        var_java_lang_String_arr_b = new String[az];
        NLoginCore_496.b();
        var_java_lang_String_cg = NLoginCore_496.c("㺀", (int)ba, (long)(bb ^ bc));
        var_java_lang_String_ch = NLoginCore_496.c("㺃", (int)bd, (long)(be ^ bf));
        var_java_security_GeneralSecurityException_a = NLoginCore_414.a(NLoginCore_496.c("㺆", (int)bg, (long)(bh ^ bi)), NLoginCore_496.c("㺉", (int)bj, (long)(bk ^ bl)));
        var_java_lang_String_arr_b = NLoginCore_414.a(NLoginCore_496.c("㺌", (int)bm, (long)(bn ^ bo)), NLoginCore_496.c("㺏", (int)bp, (long)(bq ^ br)));
        var_java_security_GeneralSecurityException_a = new GeneralSecurityException((String)NLoginCore_496.c("㺒", (int)bs, (long)(bt ^ bu)));
        var_java_security_GeneralSecurityException_b = new GeneralSecurityException((String)NLoginCore_496.c("㺕", (int)bv, (long)(bw ^ bx)));
        var_byte_arr_g = new byte[by];
        var_java_util_Base64$Encoder_a = Base64.getMimeEncoder(bz, ((String)NLoginCore_496.c("㺘", (int)(ca & cb), (long)cc)).getBytes(StandardCharsets.UTF_8));
        try {
            var_java_security_KeyFactory_a = KeyFactory.getInstance((String)NLoginCore_496.c("㺛", (int)cd, (long)ce));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        try {
            byte[] byArray = NLoginCore_140.a(NLoginCore_140.java_io_InputStream_a((String)NLoginCore_496.c("㺞", (int)cf, (long)(var_long_cg ^ var_long_ch))));
            var_java_security_PublicKey_a = NLoginCore_496.b(byArray);
        }
        catch (IOException | NullPointerException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static byte[] a(long ... lArray) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(m * lArray.length).order(ByteOrder.BIG_ENDIAN);
        long[] lArray2 = lArray;
        int n = lArray2.length;
        for (int i = NLoginCore_496.n; i < n; ++i) {
            long l = lArray2[i];
            byteBuffer.putLong(l);
        }
        return byteBuffer.array();
    }

    public static byte[] b(String string) {
        return Base64.getMimeDecoder().decode(string);
    }

    private static void b() {
        int n;
        var_long_c = -754582073595662215L;
        long l = var_long_c ^ 0x9E97E04B4B770480L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(43 + 26), 83, (byte)(30 + 17), (byte)(54 + 13), (byte)(10 + 56), (byte)(38 + 29), (byte)(4 + 43), 80, (byte)(55 + 20), (byte)(18 + 49), (byte)(80 + 3), (byte)(30 + 23), (byte)(13 + 67), (byte)(5 + 92), (byte)(72 + 28), (byte)(28 + 72), (byte)(44 + 61), (byte)(57 + 53), (byte)(42 + 61)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
                    NLoginCore_496.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ŝƒũœůƆŧƍƓśƊƠƟŸƑŝƘſźźƢŤƈųƚƁƢƦŭŪƛŭƀűſƥƥƩƄƺƜƾƴƃ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[1] = NLoginCore_559.E("ւվՔՃԹցմգ֊՛ՠոգՎՎժղՋՇ֋օ֙փ֑֓՜լտ֠֊՟֔բ֐ֆև՟֙֨֠թ֞֍ղ", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[2] = NLoginCore_173.B("ŝƄƆųƁŔƋƏŔŜŽƟŮşƚŝŰśƔƏƈźƋƃƉƥŷƌơŨƩų", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[3] = NLoginCore_223.F("ւվՔՃԹցմգ֊՛ՠոգՎՎժղՋՇ֋օ֙փ֑֓՜լտ֠֊՟֔բ֐ֆև՟֙֨֠թ֞֍ղ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[4] = NLoginCore_076.C("ԔӰӤԐԍӚӻӹӯӸӞӣӶԡԜԄӢԢӦӡӷӿԃԡԜԢԧԌԉӫԡӲӸԃԅԻӵԫԲԹԑӸՀԇ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[5] = NLoginCore_384.A("ƌţŴƆƆőźŧŜŲƏƞƁƢŷřƔŤŦƢƨšƥƦſƪƨŧƀŻƏƏƍƖƵƥƑƎƶƪƩƻƊƃ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[6] = NLoginCore_453.D("ӰԆԑԖԘԕӶӵӬӚӔӺӡӥԂӦԒԤԫӤԤӫԀԯԭԬԌԝӭӿӬԖ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[7] = NLoginCore_384.B("ƓƏťŔŊƒƅŴƛŬűžƕƔŴƀƂơƕſƈƦƚƈżţũŽƤŰƂž", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[8] = NLoginCore_138.E("՚՘ջէԿՑՆռջռաՒ", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[9] = NLoginCore_201.F("՚՘ջէԿՑՆռջռաՒ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[10] = NLoginCore_110.C("ӯӭԐӼӔӦӛԑԐԑӶӧ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[11] = NLoginCore_575.B("ƓƏťŔŊƒƅŴƛŬŰŶƕƗžƗŵţƓŢƤƆƫƬƔƮƅƚŦűƂƞ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[12] = NLoginCore_451.B("ƅžŧŴƔƁųůŗƏŮţ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[13] = NLoginCore_384.A("ƊŐƖŮŊƔƅũūŪųŮƛųŵŹźơƓƝŽŴžƢƔžƇƞƱƨƇƫƃƎƱƉŷƵƤƚƈƪưƃ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[14] = NLoginCore_027.E("մխՖգփհբ՞Նվ՝Ւ", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[15] = NLoginCore_076.C("ԁӐӥԎԒԘԕӗӪԟԘӧ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[16] = NLoginCore_076.E("՛ՀՓՂ՛՜ՉՔփզՅթշՈՉռվՠֈբյՠ՝՞", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[17] = NLoginCore_092.B("ƌūƋŒƌũƍŰŸƋųƏƘƐŲƖơŞůƓţƗŮů", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[18] = NLoginCore_027.C("ӕӵӒӣӛԒӪԒԀӮԕԝԄԎԇӠӚӾԝӦԔԤԤԣԫԙԝԆԢӮԮԇԹԷԒԜӴԉԇԞԡԔ԰ԇ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[19] = NLoginCore_027.F("ԺցՔկԽմֆ՟նՈՅլտբՎ՜ՏգփՌըՔբգկըռխչ՗իո֔ց֝վֈ֚֙ժել֗ղ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[20] = NLoginCore_387.E("ՀՠԽՎՆսՕսիՙրֈկչղՋՅթֈՑտ֚֓ըզՙ֚֚թ՟ց֌ողա֗ֈ։֜բ֝օչղ", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[21] = NLoginCore_027.B("ŋƒťƀŎƅƗŰƇřŖŨųƌƀƓƅƓŷƐƠƟƤƜƪƎƆšƬƊƋƱƕƐƮƓơƳƛƙŴƸŽƃ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[22] = NLoginCore_559.F("բՁՐՒՠյսԼրԾւՋ՝լլֈՑբՕ֖֐Ւ֑հժք՝֋՘֒չ֖ի֡յճւ֒՟յմս֗ղ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[23] = NLoginCore_559.F("մԻագբՑՈևոՅ֊Նգ՞օ՜՞եժըզփէ֔չպ֐ռ֑Ֆ՜֣֡ցչ֧֝ՠմե֣֊֥ւռֈ֟֏֠լ֦֧֕֕ք֨օִ֫ֈտ֐վ֪", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[24] = NLoginCore_324.A("ūũƌŸŐŢŗƍƌƍŲţ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[25] = NLoginCore_575.A("ƅžŧŴƔƁųůŗƏŮţ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[26] = NLoginCore_092.F("ւծՁՠաֈ՚դըՃ֋էփգ֑դՑյՒյքձ֏՘յ՘ձ֊֠ռ՜շ֋֢֦֓րչգ֙ռ֪֣ղ", (byte)78, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_496.var_java_lang_String_arr_b[0] = NLoginCore_091.E("Ռց՘Ղ՞յՖռւՊչ֏֎էրՌևծթթ֑Փշբ։հ֑֕՜ՙ֊՜ղդ֥֞֜֩և֗ֆ֪։ղ", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[1] = NLoginCore_446.C("ԗԓөӘӎԖԉӸԟӰӵԍӸӣӣӿԇӠӜԠԚԮԘԨԦӱԁԔԵԟӴԩԙԎԣԏԧԔԘԻԘԠԞԇ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[2] = NLoginCore_076.A("ŝƄƆųƁŔƋƏŔŜŽƟŮşƚŝŰśƔƏƈŹƧƤƛźƁŨŬƪſƫƐŽƨƆƅƍƵƹƉƦưƃ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[3] = NLoginCore_110.D("ԗԓөӘӎԖԉӸԟӰӵԍӸӣӣӿԇӠӜԠԚԮԘԨԦӱԁԔԵԟӴԩӱӹԧԱԊԅԹԷԷՁӹԇ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[4] = NLoginCore_201.A("ƐŬŠƌƉŖŷŵūŴŚşŲƝƘƀŞƞŢŝųŻſƝƘƞƣƈƅŧƝŮƤƇƟƄƬƒƕưŲƥƒƓơźžƮƠŻƺŹǇƑƎƏ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[5] = NLoginCore_324.C("ԐӧӸԊԊӕӾӫӠӶԓԢԅԦӻӝԘӨӪԦԬӥԩԪԃԮԬӫԄӿԓԓӪӴԘԔӹԅӰԹԫԒԬԇ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[6] = NLoginCore_091.F("՛ձռցփրաՠ՗ՅԿեՌՐխՑս֏֖Տ֏֗ղ֊ղխ֖֋ջ֚տ֒", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[7] = NLoginCore_575.C("ԗԓөӘӎԖԉӸԟӰӵԂԙԘӸԄԆԥԙԃԌԢԏԧԃԀԝԎԂԇԀԠ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[8] = NLoginCore_387.F("սեՕզ՚յյք՝րՌՒ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[9] = NLoginCore_027.B("šŽŏƊŬŤŲųŽƅƌţ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[10] = NLoginCore_451.D("ӵӲӔӑԏԞԒӲԔӚԘӧ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[11] = NLoginCore_091.E("ւվՔՃԹցմգ֊՛՟եքֆխֆդՒւՑ֓քՐզ՘չո֜֝֎֌՜", (byte)78, 69);
                    NLoginCore_496.var_java_lang_String_arr_b[12] = NLoginCore_027.B("ƂœŮŴœƂŢŤŴŨŮţ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[13] = NLoginCore_027.F("չԿօ՝Թփմ՘՚ՙբ՝֊բդըթ֐ւ֌լգխ֑փխն֍֠֗ն֚չ֛֙֘ֈոօվըֈ֩շ֘հ֬պְ֒֠հւֶսվ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[14] = NLoginCore_201.D("ԎӏөӵӱӭӝӾӴԔԔӧ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[15] = NLoginCore_559.F("ւՎ՟ԼՔււՇֈշչՉփքձսթս֋մ֑ֆ՝՞", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[16] = NLoginCore_091.C("ӰӕӨӗӰӱӞөԘӻӚԙӿӱӶӿԥӽӻԚԙӵӲӳ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[17] = NLoginCore_092.B("ƌūƋŒƌũƍŰŸƋŵŴźŭŹŵųůƖŵƄƁŶŢŶƪūƎƢŮƣƦ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[18] = NLoginCore_027.C("ӕӵӒӣӛԒӪԒԀӮԕԝԄԎԇӠӚӾԝӦԔԤԤԣԫԙԝԆԢӮԮԇӱԸԪԱԋӽ԰ԽԙӼԐՀԞԝԼ԰ԕԻԤՊԝԕԒԓ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[19] = NLoginCore_091.D("ӏԖөԄӒԉԛӴԋӝӚԁԔӷӣӱӤӸԘӡӽөӷӸԄӽԑԂԎӬԀԍԘԁԻԵӸԚԦԾԛӹԸԇ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[20] = NLoginCore_575.F("ՀՠԽՎՆսՕսիՙրֈկչղՋՅթֈՑտ֚֓ըզՙ֚֚թ՟ց֌ր֔֠֒֘֐բ֛֩֫֋ցսէ֧֮տցէմֶ֩սվ", (byte)78, 70);
                    NLoginCore_496.var_java_lang_String_arr_b[21] = NLoginCore_223.B("ŋƒťƀŎƅƗŰƇřŖŨųƌƀƓƅƓŷƐƠƟƤƜƪƎƆšƬƊƋƱŮƋƆŶưƢƵŵŴųźƇƹƟƬƗƙƚǀƹƃơƎƏ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[22] = NLoginCore_324.C("ӷӖӥӧӵԊԒӑԕӓԗӠӲԁԁԝӦӷӪԫԥӧԦԅӿԙӲԠӭԧԎԫԱԮԣԳԒԓԭԐԸӼӺԔԍՆԺՂՂԃԥԵԵԕԒԓ", (byte)78, 67);
                    NLoginCore_496.var_java_lang_String_arr_b[23] = NLoginCore_451.A("ƅŌŲŴųŢřƘƉŖƛŗŴůƖŭůŶŻŹŷƔŸƥƊƋơƍƢŧŭƴƲƒƊƸƮűƅŶƴƛƶƓƍƙưƠƱŽƦƷƸơƼƴƂƛǂƪǌƾƿǌƊƏƩƳǒǎǙƕƯǕǐƣ", (byte)78, 65);
                    NLoginCore_496.var_java_lang_String_arr_b[24] = NLoginCore_091.B("ŲţƌŴƀũƔƖƈŗƘţ", (byte)78, 66);
                    NLoginCore_496.var_java_lang_String_arr_b[25] = NLoginCore_027.D("ԖӘԕԄӳԋԌӝԚӵӮӧ", (byte)78, 68);
                    NLoginCore_496.var_java_lang_String_arr_b[26] = NLoginCore_384.C("ԗԃӖӵӶԝӯӹӽӘԠӼԘӸԦӹӦԊӧԊԙԆԤӭԊӭԆԟԵԑӱԌԫԎԢԩԧԘӴԚԊӹԶԯԽӼԡ԰ԆԇԠԫԈԻԒԓ", (byte)78, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_496.var_java_lang_String_arr_b[0] = NLoginCore_427.D("ԋӳԏԅөӏӫӚԛӝӿӸӲԔӸԔӣԆӪԟӹԅӲӳ", (byte)78, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_496.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ťšŌƇŴƋŶŬŕƚŭřƈƊƐƞţŹžƈţƣƕƝŧƭƛƣźƩƱƃ", (byte)78, 66);
                }
            }
        }
    }

    public static byte[] a(String string, PrivateKey privateKey, byte[] ... byArray) {
        if (byArray.length == 0) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺀", (int)var_int_g, (long)(h ^ i)));
        }
        try {
            Signature signature = Signature.getInstance(string);
            signature.initSign(privateKey);
            byte[][] byArray2 = byArray;
            int n = byArray2.length;
            for (int i = j; i < n; ++i) {
                byte[] byArray3 = byArray2[i];
                signature.update(byArray3);
            }
            return signature.sign();
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺃", (int)k, (long)l));
        }
    }

    public static String d(byte[] byArray) {
        return new BigInteger(byArray).toString(ar);
    }

    public static boolean a(String string, PublicKey publicKey, byte[] byArray, byte[] ... byArray2) {
        if (byArray2.length == 0) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        try {
            Signature signature = Signature.getInstance(string);
            signature.initVerify(publicKey);
            byte[][] byArray3 = byArray2;
            int n = byArray3.length;
            for (int i = var_int_c; i < n; ++i) {
                byte[] byArray4 = byArray3[i];
                signature.update(byArray4);
            }
            return signature.verify(byArray);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new IllegalArgumentException((String)NLoginCore_496.c("㺃", (int)d, (long)(e ^ f)));
        }
    }

    public static String a(String string, byte[] byArray, PublicKey publicKey) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance((String)NLoginCore_496.c("㺀", (int)(av & aw), (long)ax));
            messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
            messageDigest.update(byArray);
            messageDigest.update(publicKey.getEncoded());
            return NLoginCore_496.d(messageDigest.digest());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError((Object)noSuchAlgorithmException);
        }
    }
}

