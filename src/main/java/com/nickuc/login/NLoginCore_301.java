/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_456;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.GameMode;
import org.bukkit.Location;

public class NLoginCore_301 {
    private static String[] var_java_lang_String_arr_a;
    private static int s;
    private static int t;
    private static long l;
    private static int y;
    private static int m;
    private static int ak;
    private static long c;
    private static int au;
    private static int aa;
    private static int al;
    private static int ap;
    private static int ai;
    private static int j;
    private static String[] var_java_lang_String_arr_b;
    private static long var_long_b;
    private static int ad;
    private static int as;
    private static int u;
    private static int at;
    private static long ac;
    private static int v;
    private static int h;
    private static long q;
    private static int aq;
    private static long k;
    private static long var_long_d;
    private static final int g;
    private static final int f;
    private static long ab;
    private static int ae;
    private static final int e;
    private final NLoginCore_456 var_com_nickuc_login_NLoginCore_456_b;
    private static int ag;
    private static int an;
    private static int var_int_a;
    private static long z;
    private static long o;
    private static int i;
    private static final int var_int_d;
    private static int ao;
    private static int av;
    private static int p;
    private static int af;
    private static int r;
    private static int ah;
    private static long n;
    private static int x;
    private static int aj;
    private static int am;
    private static int ar;
    private static int w;

    private int a(NLoginCore_510 NLoginCore_510) {
        int n = an;
        if (NLoginCore_510.var_org_bukkit_GameMode_a != null) {
            n |= ao;
        }
        if (NLoginCore_510.var_org_bukkit_Location_g != null) {
            n |= ap;
        }
        return n;
    }

    private static void b() {
        int n;
        c = -2331721857071992785L;
        long l = c ^ 0xBC16B521D01974CAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(50 + 19), (byte)(12 + 71), (byte)(43 + 4), (byte)(42 + 25), (byte)(19 + 47), (byte)(16 + 51), (byte)(15 + 32), (byte)(43 + 37), (byte)(50 + 25), (byte)(38 + 29), (byte)(74 + 9), (byte)(5 + 48), (byte)(52 + 28), (byte)(28 + 69), (byte)(15 + 85), 100, (byte)(32 + 73), (byte)(27 + 83), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
                    NLoginCore_301.var_java_lang_String_arr_b[0] = NLoginCore_575.F("ԼԾթզՂՅԺկԲՑԿծՏԮՉձԭՒԽսԶ՛ՉղյՍչԼռչ։ՀփֆիՖըջ֊Պմղյծքճկ֒ռՒ՗ՙնոեզ", (byte)54, 70);
                    NLoginCore_301.var_java_lang_String_arr_b[1] = NLoginCore_027.F("ԢաԸՋեՠՊՑըղՀգ՟ՏԸԲթԹ՛խՍվՅՆ", (byte)54, 70);
                    NLoginCore_301.var_java_lang_String_arr_b[2] = NLoginCore_384.B("ĶŅĞŤĠħťĥŠŊťĻţŰłœūūŊűŴŧİŲŮœŹĿŀũţŷńŲşŶƃƄŗŃśƎŧƌŸŬŉŴŒŠƉťŘƍƎŧƏƆžŞŴųŘƚ", (byte)54, 66);
                    NLoginCore_301.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ӂӉҚҏҫңӈӈӔӓҺҟ", (byte)54, 68);
                    NLoginCore_301.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ōşłľğŠĿŧŅŌřĥŭŃţşūŅŀŘŌŧľĿ", (byte)54, 66);
                    NLoginCore_301.var_java_lang_String_arr_b[5] = NLoginCore_138.D("ӉӃӎӃҨҰӇӂӍӉҵҵҼҝҚҾӠӊҳҙҭҤүҟӧҨӛӞӕҷӈӇҼӤһҽӴӑӏӢӔӸӆҿ", (byte)54, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_301.var_java_lang_String_arr_b[0] = NLoginCore_091.E("ԼԾթզՂՅԺկԲՑԿծՏԮՉձԭՒԽսԶ՛ՉղյՍչԼռչ։ՀփֆիՖըջ֊ՊմղյՒ՗չֈհղճխչ֎ըեզ", (byte)54, 69);
                    NLoginCore_301.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ԢաԸՋեՠՊՑըղԽԯկմԷժձխկՑխչպղյԿՠԼոտճև", (byte)54, 69);
                    NLoginCore_301.var_java_lang_String_arr_b[2] = NLoginCore_110.A("ĶŅĞŤĠħťĥŠŊťĻţŰłœūūŊűŴŧİŲŮœŹĿŀũţŷńŲşŶƃƄŗŃśƎŧƌŸŬŉŴŒŠƉťŘƉƑƙƙƇŴūźŭƠţ", (byte)54, 65);
                    NLoginCore_301.var_java_lang_String_arr_b[3] = NLoginCore_451.B("ŎĿŁĿĺŇĩġņŭņĳ", (byte)54, 66);
                    NLoginCore_301.var_java_lang_String_arr_b[4] = NLoginCore_091.C("ҹӋҮҪҋӌҫӓұҸӅҒҖҘӌҰҚҶҜӗӒҭҪҫ", (byte)54, 67);
                    NLoginCore_301.var_java_lang_String_arr_b[5] = NLoginCore_110.A("ŝŗŢŗļńśŖšŝŉŉŐıĮŒŴŞŇĭŁĸŃĳŻļůŲũŋŜśżŞšƄŘſŕłŶƀŮœ", (byte)54, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_301.var_java_lang_String_arr_b[0] = NLoginCore_091.B("ţņĴŕģĺŒĹŉřŃļņŏńŔńŬŨıūŧľĿ", (byte)54, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_301.var_java_lang_String_arr_b[0] = NLoginCore_201.A("şťĹţşġĽŦīĹůĦšŢūŎĿŨŧĶŕűŖĸůŬŔŎŻŐĸŸ", (byte)54, 65);
                }
            }
        }
    }

    static {
        var_int_a = 0 >>> 26 | 0 << -26;
        var_long_b = Long.reverse(-860842507935668741L);
        var_long_d = Long.reverse(-8502796096475496448L);
        h = (0 >>> 52 | 0 << -52) & 0xFFFFFFFF;
        i = Integer.reverse(-1073741824);
        j = (524288 >>> 211 | 524288 << -211) & 0xFFFFFFFF;
        k = Long.reverse(-860842507935668741L);
        l = Long.reverse(-8502796096475496448L);
        m = 16384 >>> 237 | 16384 << ~237 + 1;
        n = Long.reverse(-860842507935668741L);
        o = Long.reverse(-8502796096475496448L);
        p = (-1073741824 >>> 62 | -1073741824 << -62) & 0xFFFFFFFF;
        q = Long.reverse(9083105469298386427L);
        r = 196608 >>> 176 | 196608 << -176;
        s = 0x1000000 >>> 152 | 0x1000000 << ~152 + 1;
        t = 524288 >>> 145 | 524288 << ~145 + 1;
        u = Integer.reverse(0);
        v = Integer.reverse(0x20000000);
        w = (0x40000000 >>> 29 | 0x40000000 << -29) & 0xFFFFFFFF;
        x = Integer.reverse(0x40000000);
        y = Integer.reverse(0x20000000);
        z = Long.reverse(9083105469298386427L);
        aa = Integer.reverse(-1610612736);
        ab = Long.reverse(-860842507935668741L);
        ac = Long.reverse(-8502796096475496448L);
        ad = Integer.reverse(0);
        ae = (0x800000 >>> 85 | 0x800000 << ~85 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(0);
        ag = (0 >>> 115 | 0 << ~115 + 1) & 0xFFFFFFFF;
        ah = Integer.reverse(0);
        ai = 0 >>> 181 | 0 << ~181 + 1;
        aj = (0 >>> 4 | 0 << -4) & 0xFFFFFFFF;
        ak = 0x300000 >>> 52 | 0x300000 << ~52 + 1;
        al = 0 >>> 95 | 0 << -95;
        am = Integer.reverse(0);
        an = 0 >>> 184 | 0 << ~184 + 1;
        ao = 8192 >>> 140 | 8192 << ~140 + 1;
        ap = Integer.reverse(0x20000000);
        aq = 0x600000 >>> 212 | 0x600000 << -212;
        ar = (24576 >>> 76 | 24576 << ~76 + 1) & 0xFFFFFFFF;
        as = Integer.reverse(Integer.MIN_VALUE);
        at = Integer.reverse(0x20000000);
        au = (12288 >>> 140 | 12288 << -140) & 0xFFFFFFFF;
        av = 16 >>> 3 | 16 << -3;
        var_java_lang_String_arr_a = new String[aq];
        var_java_lang_String_arr_b = new String[ar];
        NLoginCore_301.b();
        e = as;
        g = at;
        var_int_d = au;
        f = av;
    }

    @Generated
    public NLoginCore_301(NLoginCore_456 NLoginCore_4562) {
        this.var_com_nickuc_login_NLoginCore_456_b = NLoginCore_4562;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_301.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_110.D("ϠЂЄϤЈЧПеСϰЮФвЬϵКмлгйгЈ", (byte)1, 68), NLoginCore_301.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.F("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ࢑࢘ࢌࢂࡦ࢛࢖ࡩࡶࡷࡸࢋࡺ࢙࢚ԗ", (byte)1, 70) + string + NLoginCore_223.F("ӷ", (byte)1, 70) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x51L;
        l ^= 0xBC16B521D01974CAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(26 + 43), (byte)(65 + 18), 47, (byte)(27 + 40), (byte)(8 + 58), (byte)(56 + 11), (byte)(37 + 10), (byte)(79 + 1), (byte)(2 + 73), (byte)(48 + 19), (byte)(30 + 53), (byte)(41 + 12), (byte)(51 + 29), (byte)(6 + 91), (byte)(20 + 80), (byte)(60 + 40), (byte)(27 + 78), (byte)(26 + 84), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_076.B("ƘƥƤŧƧƣƞƧƲơŮƬưƩƬƲŴԉԐԄӺӞԓԎӡӮӯӰԃӲԑԒ", (byte)91, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_301.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(NLoginCore_510 NLoginCore_510, boolean bl) {
        File file = NLoginCore_510.var_java_io_File_b;
        if (!file.exists()) {
            throw new IllegalStateException((String)NLoginCore_301.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)));
        }
        BufferedInputStream bufferedInputStream = NLoginCore_366.java_io_BufferedInputStream_a(file, new OpenOption[h]);
        try {
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            try {
                int n = dataInputStream.readInt();
                if (n > i) {
                    throw new UnsupportedOperationException((String)NLoginCore_301.c("㺃", (int)j, (long)(k ^ l)) + file + (String)NLoginCore_301.c("㺆", (int)m, (long)(NLoginCore_301.n ^ o)) + n + (String)NLoginCore_301.c("㺉", (int)p, (long)q) + r);
                }
                int n2 = dataInputStream.readInt();
                if ((n2 & s) != 0) {
                    dataInputStream.skipBytes(t);
                    for (int i = u; i < dataInputStream.readInt(); ++i) {
                        dataInputStream.skipBytes(v);
                        dataInputStream.skipBytes(dataInputStream.readInt());
                    }
                }
                NLoginCore_510.var_boolean_g = dataInputStream.readBoolean();
                if (n >= w) {
                    NLoginCore_510.var_boolean_h = dataInputStream.readBoolean();
                    NLoginCore_510.var_boolean_i = dataInputStream.readBoolean();
                }
                if ((n2 & x) != 0) {
                    String string = dataInputStream.readUTF();
                    try {
                        NLoginCore_510.var_org_bukkit_GameMode_a = GameMode.valueOf((String)string);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        NLoginCore_510.var_org_bukkit_GameMode_a = GameMode.SURVIVAL;
                        NLoginCore_370.d((String)NLoginCore_301.c("㺌", (int)y, (long)z) + string + (String)NLoginCore_301.c("㺏", (int)aa, (long)(ab ^ ac)) + NLoginCore_510.var_org_bukkit_GameMode_a, new Object[ad]);
                    }
                }
                NLoginCore_510.var_int_h = dataInputStream.readInt();
                NLoginCore_510.var_int_i = dataInputStream.readInt();
                NLoginCore_510.var_double_d = dataInputStream.readDouble();
                NLoginCore_510.var_float_c = dataInputStream.readFloat();
                NLoginCore_510.var_float_d = dataInputStream.readFloat();
                NLoginCore_510.var_boolean_e = bl;
                if (!bl && (n2 & ae) != 0) {
                    NLoginCore_510.var_org_bukkit_Location_g = NLoginCore_393.a().a(dataInputStream);
                }
            }
            finally {
                if (Collections.singletonList(dataInputStream).get(af) != null) {
                    dataInputStream.close();
                }
            }
        }
        finally {
            if (Collections.singletonList(bufferedInputStream).get(ah) != null) {
                bufferedInputStream.close();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(NLoginCore_510 NLoginCore_510) {
        File file = NLoginCore_510.var_java_io_File_b;
        if (!file.exists()) {
            NLoginCore_366.b(file);
            DataOutputStream dataOutputStream = new DataOutputStream(NLoginCore_366.java_io_BufferedOutputStream_a(file, new OpenOption[aj]));
            try {
                dataOutputStream.writeInt(ak);
                dataOutputStream.writeInt(this.a(NLoginCore_510));
                dataOutputStream.writeBoolean(NLoginCore_510.var_boolean_g);
                dataOutputStream.writeBoolean(NLoginCore_510.var_boolean_h);
                dataOutputStream.writeBoolean(NLoginCore_510.var_boolean_i);
                GameMode gameMode = NLoginCore_510.var_org_bukkit_GameMode_a;
                if (gameMode != null) {
                    dataOutputStream.writeUTF(gameMode.name().toUpperCase(Locale.ENGLISH));
                }
                dataOutputStream.writeInt(NLoginCore_510.var_int_h);
                dataOutputStream.writeInt(NLoginCore_510.var_int_i);
                dataOutputStream.writeDouble(NLoginCore_510.var_double_d);
                dataOutputStream.writeFloat(NLoginCore_510.var_float_c);
                dataOutputStream.writeFloat(NLoginCore_510.var_float_d);
                Location location = NLoginCore_510.var_org_bukkit_Location_g;
                if (location != null) {
                    NLoginCore_393.a().a(location, dataOutputStream);
                }
                dataOutputStream.flush();
            }
            finally {
                if (Collections.singletonList(dataOutputStream).get(al) != null) {
                    dataOutputStream.close();
                }
            }
        }
    }
}

