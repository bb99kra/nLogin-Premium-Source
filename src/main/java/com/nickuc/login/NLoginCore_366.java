/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import javax.annotation.CheckReturnValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_366 {
    private static long k;
    private static int x;
    private static int aw;
    private static int as;
    private static int an;
    private static String[] var_java_lang_String_arr_b;
    private static int o;
    private static int s;
    private static int var_int_b;
    private static int ae;
    private static int ar;
    private static long ah;
    private static int ab;
    private static int q;
    private static int u;
    private static int ak;
    private static int av;
    private static long c;
    private static int ac;
    private static int at;
    private static int ai;
    private static int aj;
    private static long ag;
    private static int ap;
    private static int l;
    private static String[] var_java_lang_String_arr_a;
    private static int p;
    private static int t;
    private static int aa;
    private static long d;
    private static int r;
    private static int z;
    private static int am;
    private static int au;
    private static int ax;
    private static long j;
    private static int n;
    private static int y;
    private static int af;
    private static int i;
    private static long g;
    private static int m;
    private static int var_int_a;
    private static int e;
    private static int ao;
    private static int al;
    private static int aq;
    private static int h;
    private static long f;
    private static int v;
    private static int ad;
    private static int w;

    @CheckReturnValue
    public static BufferedOutputStream java_io_BufferedOutputStream_a(File file, int n, OpenOption ... openOptionArray) {
        return new BufferedOutputStream(Files.newOutputStream(file.toPath(), openOptionArray), n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(String string, File file) {
        InputStream inputStream = NLoginCore_140.java_io_InputStream_a(string);
        try {
            if (inputStream == null) {
                throw new IOException((String)NLoginCore_366.c("㺀", (int)af, (long)(ag ^ ah)) + string);
            }
            if (!NLoginCore_366.b(file)) {
                boolean bl = ai;
                return bl;
            }
            NLoginCore_366.a(inputStream, file);
            boolean bl = ak;
            return bl;
        }
        finally {
            if (Collections.singletonList(inputStream).get(aj) != null) {
                inputStream.close();
            }
        }
    }

    public static boolean a(File file) {
        File[] fileArray;
        if (file.isDirectory() && (fileArray = file.listFiles()) != null) {
            File[] fileArray2 = fileArray;
            int n = fileArray2.length;
            for (int i = q; i < n; ++i) {
                File file2 = fileArray2[i];
                NLoginCore_366.a(file2);
            }
        }
        return file.delete();
    }

    public static File a(File file, String string) {
        Object[] objectArray;
        File file2;
        int n = NLoginCore_366.n;
        File file3 = file.getParentFile();
        do {
            objectArray = new Object[o];
            objectArray[NLoginCore_366.p] = n++;
        } while ((file2 = new File(file3, String.format(string, objectArray))).exists());
        return file2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean c(File file, File file2) {
        if (NLoginCore_366.b(file2)) {
            BufferedInputStream bufferedInputStream = NLoginCore_366.java_io_BufferedInputStream_a(file, new OpenOption[x]);
            try {
                boolean bl;
                block9: {
                    BufferedOutputStream bufferedOutputStream = NLoginCore_366.java_io_BufferedOutputStream_a(file2, new OpenOption[y]);
                    try {
                        NLoginCore_140.a((InputStream)bufferedInputStream, bufferedOutputStream);
                        bl = z;
                        if (Collections.singletonList(bufferedOutputStream).get(aa) == null) break block9;
                    }
                    catch (Throwable throwable) {
                        if (Collections.singletonList(bufferedOutputStream).get(ac) != null) {
                            ((OutputStream)bufferedOutputStream).close();
                        }
                        throw throwable;
                    }
                    ((OutputStream)bufferedOutputStream).close();
                }
                return bl;
            }
            finally {
                if (Collections.singletonList(bufferedInputStream).get(ab) != null) {
                    ((InputStream)bufferedInputStream).close();
                }
            }
        }
        return ae != 0;
    }

    private static void b() {
        int n;
        c = -4473737293995525654L;
        long l = c ^ 0xA2BF699ACFA7CB21L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(16 + 53), (byte)(70 + 13), 47, (byte)(66 + 1), (byte)(63 + 3), (byte)(32 + 35), (byte)(13 + 34), (byte)(34 + 46), (byte)(48 + 27), (byte)(66 + 1), (byte)(38 + 45), (byte)(50 + 3), (byte)(52 + 28), (byte)(8 + 89), (byte)(80 + 20), (byte)(44 + 56), (byte)(71 + 34), 110, (byte)(21 + 82)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
                    NLoginCore_366.var_java_lang_String_arr_b[0] = NLoginCore_384.F("չք֘ֈքս֌ծ։իւջ", (byte)119, 70);
                    NLoginCore_366.var_java_lang_String_arr_b[1] = NLoginCore_027.E("ֆ֧֪֠֯վվխֆճ֒ջ", (byte)119, 69);
                    NLoginCore_366.var_java_lang_String_arr_b[2] = NLoginCore_110.A("ƿƹƸƣǧǚǢǃǭǆǦƵ", (byte)119, 65);
                    NLoginCore_366.var_java_lang_String_arr_b[3] = NLoginCore_091.F("ցլ֗ց֢ր֎֭փְ֪֯ֈ֕ոօ֒պְֿ֣֒֝ׄվֵֹֻ׈ֿֿ֧֥֚֓֘֕֟֟א֏֋ֳׇֹׁׁ֟ה֓׌׏֚֟֘֞ףסםפּ֞זַ", (byte)119, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_366.var_java_lang_String_arr_b[0] = NLoginCore_201.D("ՋյքՕՉյ֐Ռղ։֜֙՝֗սծ֕պֆքՙ֦խծ", (byte)119, 68);
                    NLoginCore_366.var_java_lang_String_arr_b[1] = NLoginCore_091.B("ǝǨǩƛƳƹǈǢǈǙƯƵ", (byte)119, 66);
                    NLoginCore_366.var_java_lang_String_arr_b[2] = NLoginCore_559.D("մ՝ՐկժՠՖփՖճ֏բ", (byte)119, 68);
                    NLoginCore_366.var_java_lang_String_arr_b[3] = NLoginCore_092.E("ցլ֗ց֢ր֎֭փְ֪֯ֈ֕ոօ֒պְֿ֣֒֝ׄվֵֹֻ׈ֿֿ֧֥֚֓֘֕֟֟א֏֋ֳׇֹׁׁ֟ה֓׌׏֚סֶֹֺדֳָ׉צחתו֦ׄ׉שףּׁ֩סנֻ", (byte)119, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_366.var_java_lang_String_arr_b[0] = NLoginCore_324.E("ի֧֟ժօ֚իծռ֒խջ", (byte)119, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_366.var_java_lang_String_arr_b[0] = NLoginCore_559.E("ըք֨֬֫վ֥֫փֆֲ֤֭հ֘չ֕ևָջֳ֯ֆև", (byte)119, 69);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_366.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.A("ŕŷŹřŽƜƔƪƖťƣƙƧơŪƏƱưƨƮƨŽ", (byte)87, 65), NLoginCore_366.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ԝԪԩӬԬԨԣԬԷԦӳԱԵԮԱԷӹࢋࢃ࢐ࢍ࢈ࡳࢇࡻࢋ࡯ࢉ࢑ࢍ࢛ԓ", (byte)87, 68) + string + NLoginCore_324.E("Ս", (byte)87, 69) + methodType.toString(), exception);
        }
    }

    public static boolean a(File file, boolean bl) {
        if (!bl && file.exists()) {
            return ar != 0;
        }
        File file2 = file.getParentFile();
        if (file2 != null && !file2.exists() && !file2.mkdirs()) {
            return as != 0;
        }
        return file.createNewFile();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = NLoginCore_366.java_io_BufferedInputStream_a(file, new OpenOption[u]);
        try {
            String string = NLoginCore_140.a((InputStream)bufferedInputStream, messageDigest);
            return string;
        }
        finally {
            if (Collections.singletonList(bufferedInputStream).get(v) != null) {
                bufferedInputStream.close();
            }
        }
    }

    public static File a(Class<?> clazz) {
        try {
            String string = clazz.getProtectionDomain().getCodeSource().getLocation().getPath();
            String string2 = URLDecoder.decode(string, (String)NLoginCore_366.c("㺀", (int)(var_int_a & var_int_b), (long)d));
            return new File(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1CL;
        l ^= 0xA2BF699ACFA7CB21L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(26 + 42), (byte)(63 + 6), (byte)(49 + 34), (byte)(5 + 42), (byte)(18 + 49), (byte)(48 + 18), (byte)(21 + 46), (byte)(39 + 8), (byte)(62 + 18), (byte)(56 + 19), (byte)(48 + 19), (byte)(51 + 32), (byte)(19 + 34), (byte)(39 + 41), 97, (byte)(89 + 11), (byte)(49 + 51), 105, (byte)(18 + 92), (byte)(47 + 56)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.E("֒֟֞ա֛֡֝֘֡֬ը֦֪֣֦֬ծऀࣸअंࣰࣽࣨࣼऀࣤࣾआंऐ", (byte)115, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_366.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @CheckReturnValue
    public static BufferedOutputStream java_io_BufferedOutputStream_a(File file, OpenOption ... openOptionArray) {
        return new BufferedOutputStream(Files.newOutputStream(file.toPath(), openOptionArray));
    }

    @CheckReturnValue
    public static BufferedInputStream java_io_BufferedInputStream_a(File file, OpenOption ... openOptionArray) {
        return new BufferedInputStream(Files.newInputStream(file.toPath(), openOptionArray));
    }

    public static boolean b(File file) {
        return NLoginCore_366.a(file, aq != 0);
    }

    public static String c(File file) {
        String string = file.getName();
        String[] stringArray = string.split((String)NLoginCore_366.c("㺀", (int)e, (long)(f ^ g)));
        if (stringArray.length == h) {
            return string;
        }
        return String.join((CharSequence)NLoginCore_366.c("㺃", (int)i, (long)(j ^ k)), Arrays.copyOfRange(stringArray, l, stringArray.length - m));
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(8042689179079432067L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(6313306922169161603L);
        g = Long.reverse(0x3800000000000000L);
        h = (0x8000000 >>> 251 | 0x8000000 << -251) & 0xFFFFFFFF;
        i = 4096 >>> 203 | 4096 << ~203 + 1;
        j = Long.reverse(6313306922169161603L);
        k = Long.reverse(0x3800000000000000L);
        l = Integer.reverse(0);
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(0);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Integer.reverse(0);
        q = Integer.reverse(0);
        r = 0 >>> 127 | 0 << -127;
        s = Integer.reverse(0);
        t = Integer.reverse(0);
        u = Integer.reverse(0);
        v = (0 >>> 157 | 0 << -157) & 0xFFFFFFFF;
        w = 0 >>> 140 | 0 << -140;
        x = 0 >>> 40 | 0 << ~40 + 1;
        y = Integer.reverse(0);
        z = (2 >>> 129 | 2 << -129) & 0xFFFFFFFF;
        aa = (0 >>> 147 | 0 << -147) & 0xFFFFFFFF;
        ab = 0 >>> 65 | 0 << ~65 + 1;
        ac = Integer.reverse(0);
        ad = (0 >>> 209 | 0 << ~209 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(0);
        af = 3072 >>> 42 | 3072 << ~42 + 1;
        ag = Long.reverse(6313306922169161603L);
        ah = Long.reverse(0x3800000000000000L);
        ai = Integer.reverse(0);
        aj = 0 >>> 12 | 0 << -12;
        ak = Integer.reverse(Integer.MIN_VALUE);
        al = Integer.reverse(0);
        am = (0 >>> 254 | 0 << ~254 + 1) & 0xFFFFFFFF;
        an = Integer.reverse(0);
        ao = Integer.reverse(0);
        ap = Integer.reverse(0);
        aq = (0 >>> 145 | 0 << -145) & 0xFFFFFFFF;
        ar = Integer.reverse(Integer.MIN_VALUE);
        as = (0 >>> 119 | 0 << -119) & 0xFFFFFFFF;
        at = 0 >>> 186 | 0 << -186;
        au = 64 >>> 198 | 64 << -198;
        av = Integer.reverse(0);
        aw = Integer.reverse(0x20000000);
        ax = (512 >>> 135 | 512 << ~135 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[aw];
        var_java_lang_String_arr_b = new String[ax];
        NLoginCore_366.b();
    }

    public static boolean a(File file, long l) {
        BasicFileAttributes basicFileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[at]);
        long l2 = basicFileAttributes.creationTime().toMillis();
        return (System.currentTimeMillis() - l2 >= l ? au : av) != 0;
    }

    public static void a(InputStream inputStream, File file) {
        BufferedOutputStream bufferedOutputStream = NLoginCore_366.java_io_BufferedOutputStream_a(file, new OpenOption[an]);
        try {
            NLoginCore_140.a(inputStream, bufferedOutputStream);
        }
        finally {
            if (Collections.singletonList(bufferedOutputStream).get(ao) != null) {
                bufferedOutputStream.close();
            }
        }
    }

    @CheckReturnValue
    public static BufferedInputStream java_io_BufferedInputStream_a(File file, int n, OpenOption ... openOptionArray) {
        return new BufferedInputStream(Files.newInputStream(file.toPath(), openOptionArray), n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String d(File file) {
        BufferedInputStream bufferedInputStream = NLoginCore_366.java_io_BufferedInputStream_a(file, new OpenOption[r]);
        try {
            byte[] byArray = NLoginCore_140.a(bufferedInputStream);
            String string = new String(Base64.getEncoder().encode(byArray));
            return string;
        }
        finally {
            if (Collections.singletonList(bufferedInputStream).get(s) != null) {
                ((InputStream)bufferedInputStream).close();
            }
        }
    }
}

