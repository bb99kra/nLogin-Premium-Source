/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_158;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_219;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_126;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_482 {
    private static int var_int_f;
    private static int ap;
    private static int ax;
    private static int as;
    private static long ai;
    private static long aj;
    private static long aq;
    private final File var_java_io_File_f;
    private static int ac;
    private static long var_long_b;
    private static int ad;
    private static int bf;
    private static long ar;
    private static int aa;
    private static int am;
    private static int h;
    private static int az;
    private static int av;
    private static int ab;
    private static int bg;
    private static long t;
    private static int bc;
    private static int s;
    private static long ba;
    private static int n;
    private static int p;
    private static int bd;
    private static long u;
    private static int z;
    private static int aw;
    private static int i;
    private static int al;
    private final Map<String, byte[]> cfr_renamed_15 = new HashMap<String, byte[]>();
    private static int bh;
    private static int var_int_e;
    private static long w;
    private static long r;
    private static long bb;
    private static long x;
    private static int l;
    private static int q;
    private static long be;
    private final String var_java_lang_String_au;
    private static int af;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static int ah;
    private static final int F;
    private static long o;
    private static long d;
    private static int y;
    private static int j;
    private static long an;
    private static int k;
    private static int ae;
    private static int ak;
    private static int v;
    private static int var_int_a;
    private static int m;
    private static int at;
    private static int ay;
    private static long ag;
    private static long ao;
    private static int g;
    private static int var_int_au;

    public synchronized Byte a(String string, @Nullable Byte by) {
        byte[] byArray = this.byte_arr_a(string);
        return byArray != null && byArray.length > 0 ? Byte.valueOf(byArray[k]) : by;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_482.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.D("ӜӾԀӠԄԣԛԱԝӬԪԠԮԨӱԖԸԷԯԵԯԄ", (byte)85, 68), NLoginCore_482.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_027.E("մցրՃփտպփ֎սՊֈ֌օֈ֎Րࣞࣛࣞࣗࣆࣲࣦ࣬ࣞ࣋࣌࣠ը", (byte)85, 69) + string + NLoginCore_324.A("ţ", (byte)85, 65) + methodType.toString(), exception);
        }
    }

    public synchronized NLoginCore_482 a(String string, String string2) {
        if (string2 == null) {
            throw new IllegalArgumentException((String)NLoginCore_482.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        }
        return this.a(string, string2.getBytes(StandardCharsets.UTF_8));
    }

    private static String a(int n, long l) {
        l ^= 0x4EL;
        l ^= 0x7B9987D0EA14477EL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(52 + 17), (byte)(42 + 41), (byte)(20 + 27), (byte)(4 + 63), (byte)(45 + 21), (byte)(20 + 47), 47, (byte)(54 + 26), (byte)(66 + 9), (byte)(24 + 43), (byte)(78 + 5), (byte)(50 + 3), 80, (byte)(92 + 5), (byte)(50 + 50), (byte)(67 + 33), (byte)(21 + 84), (byte)(90 + 20), (byte)(78 + 25)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(66 + 3), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.A("ľŋŊčōŉńōŘŇĔŒŖŏŒŘĚҨҥҨҡҐҶҰҼҨҕҖҪ", (byte)46, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_482.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = 0 >>> 165 | 0 << ~165 + 1;
        var_long_b = Long.reverse(-2338933544755048545L);
        d = Long.reverse(0x7200000000000000L);
        var_int_e = 0 >>> 191 | 0 << ~191 + 1;
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        g = (4 >>> 226 | 4 << ~226 + 1) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = 0 >>> 211 | 0 << -211;
        k = 0 >>> 71 | 0 << -71;
        l = (262144 >>> 18 | 262144 << -18) & 0xFFFFFFFF;
        m = 0 >>> 53 | 0 << -53;
        n = (1024 >>> 106 | 1024 << ~106 + 1) & 0xFFFFFFFF;
        o = Long.reverse(-5941813246651445345L);
        p = Integer.reverse(0);
        q = (0x40000000 >>> 253 | 0x40000000 << -253) & 0xFFFFFFFF;
        r = Long.reverse(-5941813246651445345L);
        s = 393216 >>> 241 | 393216 << -241;
        t = Long.reverse(-2338933544755048545L);
        u = Long.reverse(0x7200000000000000L);
        v = Integer.reverse(0x20000000);
        w = Long.reverse(-2338933544755048545L);
        x = Long.reverse(0x7200000000000000L);
        y = 0 >>> 206 | 0 << -206;
        z = Integer.reverse(0);
        aa = 0 >>> 166 | 0 << ~166 + 1;
        ab = Integer.reverse(0);
        ac = (0 >>> 149 | 0 << ~149 + 1) & 0xFFFFFFFF;
        ad = 0 >>> 17 | 0 << ~17 + 1;
        ae = Integer.reverse(-1610612736);
        af = Integer.reverse(-1);
        ag = Long.reverse(-5941813246651445345L);
        ah = Integer.reverse(0x60000000);
        ai = Long.reverse(-2338933544755048545L);
        aj = Long.reverse(0x7200000000000000L);
        ak = Integer.reverse(0x5C000000);
        al = Integer.reverse(0x74000000);
        am = (0x1C0000 >>> 82 | 0x1C0000 << ~82 + 1) & 0xFFFFFFFF;
        an = Long.reverse(-2338933544755048545L);
        ao = Long.reverse(0x7200000000000000L);
        ap = 128 >>> 228 | 128 << -228;
        aq = Long.reverse(-2338933544755048545L);
        ar = Long.reverse(0x7200000000000000L);
        as = (0 >>> 72 | 0 << ~72 + 1) & 0xFFFFFFFF;
        at = (0 >>> 102 | 0 << -102) & 0xFFFFFFFF;
        var_int_au = 0 >>> 82 | 0 << ~82 + 1;
        av = Integer.reverse(0);
        aw = Integer.reverse(0);
        ax = Integer.reverse(0);
        ay = Integer.reverse(0);
        az = Integer.reverse(-1879048192);
        ba = Long.reverse(-2338933544755048545L);
        bb = Long.reverse(0x7200000000000000L);
        bc = Integer.reverse(0x50000000);
        bd = Integer.reverse(-1);
        be = Long.reverse(-5941813246651445345L);
        bf = Integer.reverse(-805306368);
        bg = (0x5800000 >>> 55 | 0x5800000 << ~55 + 1) & 0xFFFFFFFF;
        bh = Integer.reverse(0);
        var_java_lang_String_arr_a = new String[bf];
        var_java_lang_String_arr_b = new String[bg];
        NLoginCore_482.b();
        F = bh;
    }

    public synchronized NLoginCore_482 a(String string, byte[] byArray) {
        if (byArray == null) {
            throw new IllegalArgumentException((String)NLoginCore_482.c("㺀", (int)n, (long)o));
        }
        this.cfr_renamed_15.put(string, byArray);
        return this;
    }

    public synchronized boolean c(String string) {
        return this.cfr_renamed_15.containsKey(string);
    }

    public synchronized NLoginCore_482 a(String string, Consumer<NLoginCore_126> consumer) {
        return this.a(string, NLoginCore_140.a(consumer));
    }

    public synchronized NLoginCore_482 a(String string, byte by) {
        byte[] byArray = new byte[l];
        byArray[NLoginCore_482.m] = by;
        return this.a(string, byArray);
    }

    public synchronized boolean m(String string) {
        return this.boolean_a(string, var_int_e != 0);
    }

    public synchronized NLoginCore_482 com_nickuc_login_NLoginCore_482_a(String string) {
        this.cfr_renamed_15.remove(string);
        return this;
    }

    @Nullable
    public synchronized byte[] byte_arr_a(String string) {
        return this.cfr_renamed_15.get(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void af() {
        block17: {
            try {
                this.cfr_renamed_15.clear();
                if (this.var_java_io_File_f.exists()) {
                    BufferedInputStream bufferedInputStream = NLoginCore_366.java_io_BufferedInputStream_a(this.var_java_io_File_f, new OpenOption[p]);
                    try {
                        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
                        try {
                            int n = dataInputStream.readInt();
                            if (n > 0) {
                                throw new UnsupportedOperationException((String)NLoginCore_482.c("㺀", (int)q, (long)r) + this.var_java_io_File_f + (String)NLoginCore_482.c("㺃", (int)s, (long)(t ^ u)) + n + (String)NLoginCore_482.c("㺆", (int)v, (long)(w ^ x)) + y);
                            }
                            int n2 = dataInputStream.readInt();
                            for (int i = z; i < n2; ++i) {
                                String string = dataInputStream.readUTF();
                                int n3 = dataInputStream.readInt();
                                byte[] byArray = new byte[n3];
                                dataInputStream.readFully(byArray);
                                this.cfr_renamed_15.put(string, byArray);
                            }
                            break block17;
                        }
                        finally {
                            if (Collections.singletonList(dataInputStream).get(aa) != null) {
                                dataInputStream.close();
                            }
                        }
                    }
                    finally {
                        if (Collections.singletonList(bufferedInputStream).get(ac) != null) {
                            bufferedInputStream.close();
                        }
                    }
                }
                File file = new File(this.var_java_io_File_f.getParentFile(), this.var_java_lang_String_au.toLowerCase(Locale.ENGLISH) + (String)NLoginCore_482.c("㺉", (int)(ae & af), (long)ag));
                if (file.exists()) {
                    NLoginCore_219 NLoginCore_2192 = new NLoginCore_219(file);
                    for (String string : NLoginCore_2192.a((String)NLoginCore_482.c("㺌", (int)ah, (long)(ai ^ aj)))) {
                        String string2;
                        if (string == null || string.isEmpty() || (string2 = NLoginCore_2192.java_lang_String_b(string)) == null) continue;
                        if (!string2.isEmpty()) {
                            string2 = NLoginCore_158.u(string2);
                        }
                        this.cfr_renamed_15.put(string.replace((char)ak, (char)al), string2.getBytes(StandardCharsets.UTF_8));
                    }
                    this.ag();
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            }
            catch (IOException iOException) {
                NLoginCore_370.b((String)NLoginCore_482.c("㺏", (int)am, (long)(an ^ ao)) + this.var_java_io_File_f + (String)NLoginCore_482.c("㺒", (int)ap, (long)(aq ^ ar)), iOException, new Object[as]);
            }
        }
    }

    @Nullable
    public synchronized String k(String string) {
        return this.g(string, null);
    }

    @Nullable
    public synchronized String g(String string, String string2) {
        byte[] byArray = this.byte_arr_a(string);
        return byArray != null ? new String(byArray, StandardCharsets.UTF_8) : string2;
    }

    public NLoginCore_482(String string, File file) {
        this.var_java_lang_String_au = string;
        this.var_java_io_File_f = file;
        this.af();
    }

    @Nullable
    public synchronized Byte java_lang_Byte_a(String string) {
        return this.a(string, (Byte)null);
    }

    public synchronized NLoginCore_482 com_nickuc_login_NLoginCore_482_a(String string, boolean bl) {
        return this.a(string, (byte)(bl ? i : j));
    }

    private static void b() {
        int n;
        c = -436138936619871749L;
        long l = c ^ 0x7B9987D0EA14477EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(54 + 14), 69, 83, (byte)(22 + 25), (byte)(36 + 31), (byte)(34 + 32), (byte)(59 + 8), (byte)(29 + 18), (byte)(39 + 41), (byte)(54 + 21), (byte)(32 + 35), (byte)(38 + 45), (byte)(34 + 19), (byte)(10 + 70), (byte)(26 + 71), (byte)(53 + 47), (byte)(26 + 74), (byte)(47 + 58), (byte)(54 + 56), (byte)(76 + 27)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, (byte)(52 + 31)}, StandardCharsets.UTF_8));
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
                    NLoginCore_482.var_java_lang_String_arr_b[0] = NLoginCore_091.E("֒գ֕֡ն֥֠ղ֣ո֧֦֫։ցկ֊֔֔֠հւնֳ֨֨յ֎ֱ֠֩֋", (byte)110, 69);
                    NLoginCore_482.var_java_lang_String_arr_b[1] = NLoginCore_173.F("֒գ֕֡ն֥֠ղ֣ո֧֦֫։ցկ֊֔֔֠հւնֳ֨֨յ֎ֱ֠֩֋", (byte)110, 70);
                    NLoginCore_482.var_java_lang_String_arr_b[2] = NLoginCore_138.D("ԮզՔյոՇԹճՒ՝ԺՠչՠՃգզ՞սե՚ՕՒՓ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[3] = NLoginCore_387.E("՜չ֦֝֙՚թ֝֊֣֮֗զ֋֜֋ֵ֦֥նָ֥֋պ֦֎֊նֵַ֨֜֔֡օֳ֐վָ֘׆׌֡։׆֦֊׎ֽ֯ׄ֍֬וּ֗֗ׄם֑֨׏ֻ֡", (byte)110, 69);
                    NLoginCore_482.var_java_lang_String_arr_b[4] = NLoginCore_092.D("ԷդՈԷըԸՎԱհչՎՇ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[5] = NLoginCore_091.E("յմւ֤֦֟շ֛֠֙ըղ", (byte)110, 69);
                    NLoginCore_482.var_java_lang_String_arr_b[6] = NLoginCore_384.B("ƐƟƧƴǘƨƨƸƖƪƦƣ", (byte)110, 66);
                    NLoginCore_482.var_java_lang_String_arr_b[7] = NLoginCore_091.D("ԮզՔյոՇԹճՒ՝ԻվԺնջՁ՘Ճևւ֍ջՒՓ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[8] = NLoginCore_387.D("ճաՒՕՐԻտԱԾծՊՇ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[9] = NLoginCore_427.F("ՙ֑տ֣֠ղդ֞սֈե֖ակժվ֐տ֍֍։րսվ", (byte)110, 70);
                    NLoginCore_482.var_java_lang_String_arr_b[10] = NLoginCore_076.E("֞֌սրջզ֪՜թ֙յղ", (byte)110, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_482.var_java_lang_String_arr_b[0] = NLoginCore_427.D("էԸժնՋյպՇոՍրռջ՞ՖՄ՟թթյՅ՞աքև֐լ֊յ֐տ։Փֈձ֛֒֘֜Ց֡տժէ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[1] = NLoginCore_091.E("֒գ֕֡ն֥֠ղ֣ո֧֦֫։ցկ֊֔֔֠հ֎ֽ֛֦֯֯֝֋׀չּ", (byte)110, 69);
                    NLoginCore_482.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ՙ֑տ֣֠ղդ֞սֈդՠ֊լ֧լր֪֢ցֵֹ֥ճ֥֬ֆոֽ֙֗֠", (byte)110, 70);
                    NLoginCore_482.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ԱՎղծջԯԾղ՟ոլփԻՠձՠջ֊պՋ֍պՠՏջգ՟Ջսձթ֊ն֌՚ֈեՓխ֍֛֡ն՞֛ջ՟֣ք֒֙բց֪սփպի֎ւ֥֝ցְ֢֒քմִ֪ևְְֹ֚և", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[4] = NLoginCore_223.A("ƠƤǍơƐǓƨƯƦƱƾƣ", (byte)110, 65);
                    NLoginCore_482.var_java_lang_String_arr_b[5] = NLoginCore_387.B("ǈƧǗǐƑƣƔƒƭƻǈƣ", (byte)110, 66);
                    NLoginCore_482.var_java_lang_String_arr_b[6] = NLoginCore_027.C("Ԯ՘ՆեկՊէխԽ՞ոՇ", (byte)110, 67);
                    NLoginCore_482.var_java_lang_String_arr_b[7] = NLoginCore_324.F("ՙ֑տ֣֠ղդ֞սֈդշ֦֥֮֡֘֜֡ր֑ւղձ֛չִ֯նղ֯׀", (byte)110, 70);
                    NLoginCore_482.var_java_lang_String_arr_b[8] = NLoginCore_138.E("պ֘յւպց֞յ֛մեզպ֍ֲֈվ֕իմ֟֐սվ", (byte)110, 69);
                    NLoginCore_482.var_java_lang_String_arr_b[9] = NLoginCore_384.D("ԮզՔյոՇԹճՒ՝ԺՠպԻպզ՛ՕդժյծչՈՇՃխս֎֌Քօ", (byte)110, 68);
                    NLoginCore_482.var_java_lang_String_arr_b[10] = NLoginCore_575.D("դՃՕՈռՍՓՐճՒՊՇ", (byte)110, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_482.var_java_lang_String_arr_b[0] = NLoginCore_223.F("֥֚֜֟՝զֈև֢֛վժֈթիևֲ֒֞խևִַօְֳֽ֮֬֋֑֌", (byte)110, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_482.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ԯՑ՘կդՎոԽիթհՙ՗զ՝Քճՠ՞ֈփեՒՓ", (byte)110, 68);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void ag() {
        try {
            NLoginCore_366.b(this.var_java_io_File_f);
            BufferedOutputStream bufferedOutputStream = NLoginCore_366.java_io_BufferedOutputStream_a(this.var_java_io_File_f, new OpenOption[at]);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    dataOutputStream.writeInt(var_int_au);
                    dataOutputStream.writeInt(this.cfr_renamed_15.size());
                    for (Map.Entry<String, byte[]> entry : this.cfr_renamed_15.entrySet()) {
                        dataOutputStream.writeUTF(entry.getKey());
                        byte[] byArray = entry.getValue();
                        dataOutputStream.writeInt(byArray.length);
                        dataOutputStream.write(byArray);
                    }
                    dataOutputStream.flush();
                }
                finally {
                    if (Collections.singletonList(dataOutputStream).get(av) != null) {
                        dataOutputStream.close();
                    }
                }
            }
            finally {
                if (Collections.singletonList(bufferedOutputStream).get(ax) != null) {
                    bufferedOutputStream.close();
                }
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)NLoginCore_482.c("㺀", (int)az, (long)(ba ^ bb)) + this.var_java_io_File_f + (String)NLoginCore_482.c("㺃", (int)(bc & bd), (long)be), iOException);
        }
    }

    public synchronized boolean boolean_a(String string, boolean n) {
        Byte by = this.java_lang_Byte_a(string);
        return (by != null ? (by == var_int_f ? g : h) : n) != 0;
    }
}

