/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.hikari.HikariConfig
 *  com.nickuc.login.lib.hikari.HikariDataSource
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import com.nickuc.login.lib.hikari.HikariDataSource;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_269 {
    private static long var_long_b;
    private static long d;
    private static int f;
    private static String[] var_java_lang_String_arr_a;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static int g;
    private final HikariDataSource var_com_nickuc_login_lib_hikari_HikariDataSource_a;
    private static int var_int_c;
    private static long e;
    private static long var_long_c;

    private static void b() {
        int n;
        var_long_c = 3612784874499046585L;
        long l = var_long_c ^ 0x97916CE07DEDFF87L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(6 + 62), (byte)(35 + 34), (byte)(76 + 7), 47, (byte)(65 + 2), (byte)(53 + 13), (byte)(33 + 34), (byte)(13 + 34), (byte)(66 + 14), (byte)(70 + 5), 67, (byte)(17 + 66), (byte)(27 + 26), (byte)(26 + 54), (byte)(41 + 56), (byte)(44 + 56), (byte)(66 + 34), (byte)(97 + 8), (byte)(80 + 30), (byte)(89 + 14)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_269.var_java_lang_String_arr_b[0] = NLoginCore_092.C("рФЪјЩѡсѤёѨѱцбђѦѻмєњѬѱє҂ѱмѷѓ҃ѺффѫѠѧѮэѮҏѮьѬҐіќ", (byte)21, 67);
                    NLoginCore_269.var_java_lang_String_arr_b[1] = NLoginCore_004.D("ѨѨѭЦЫхЯѦдѬѭгѦѐѧјмћѬяйѻрпзѿҀѱ҄ѥф҇ѻіѣ҆ѧғѬѬѴяііѭҔѕѕҐҟѧѻҊѫҖҟѤҀҜҐѣҗҟҢ", (byte)21, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_269.var_java_lang_String_arr_b[0] = NLoginCore_324.B("õÙßčÞĖöęĆĝĦûæćěİñĉďġĦĉķĦñĬĈĸįùùĠĶİĄįŇęĨÿĒĩŊđ", (byte)21, 66);
                    NLoginCore_269.var_java_lang_String_arr_b[1] = NLoginCore_201.B("ĝĝĢÛàúäěéġĢèěąĜčñĐġĄîİõôìĴĵĦĹĚùļİċĘĻĜňġġĩĄċċĢŉĊĊŅŔĜİĿĥđİēīęęňľįĻ", (byte)21, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_269.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ѨпѠЩёўЪѮоѱщЪаѴжвѶѴзѿћну҃ѝсйѺфѣѸ҅", (byte)21, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_269.var_java_lang_String_arr_b[0] = NLoginCore_173.C("учХйѤыЬѮѬѱёѸгёћђўѕѻѸўѰчш", (byte)21, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_269.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("Էՙ՛Ի՟վն֌ոՇօջ։փՌձ֓֒֊֐֊՟", (byte)83, 69), NLoginCore_269.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_138.D("ԑԞԝӠԠԜԗԠԫԚӧԥԩԢԥԫӭࢃࢀ࢈ࢋࢄࢀ࢈ࢀࢃ࡛ࡺࢍԅ", (byte)83, 68) + string + NLoginCore_324.C("Ө", (byte)83, 67) + methodType.toString(), exception);
        }
    }

    public NLoginCore_269(HikariConfig hikariConfig) {
        this.var_com_nickuc_login_lib_hikari_HikariDataSource_a = new HikariDataSource(hikariConfig);
    }

    private static String a(int n, long l) {
        l ^= 0x1AL;
        l ^= 0x97916CE07DEDFF87L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(18 + 51), (byte)(33 + 50), (byte)(44 + 3), (byte)(49 + 18), (byte)(7 + 59), (byte)(62 + 5), (byte)(3 + 44), (byte)(34 + 46), (byte)(58 + 17), (byte)(5 + 62), 83, (byte)(6 + 47), 80, (byte)(84 + 13), (byte)(66 + 34), (byte)(60 + 40), (byte)(75 + 30), (byte)(64 + 46), (byte)(75 + 28)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(23 + 45), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("ւ֏֎Ց֑֍ֈ֑֜֋՘֖֖֚֓֜՞ࣱࣱࣱࣹࣹࣴࣼࣵࣴ࣌࣫ࣾ", (byte)99, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_269.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public HikariDataSource a() {
        return this.var_com_nickuc_login_lib_hikari_HikariDataSource_a;
    }

    public Connection d() {
        try {
            return this.var_com_nickuc_login_lib_hikari_HikariDataSource_a.getConnection();
        }
        catch (Exception exception) {
            throw new SQLException((String)NLoginCore_269.c("㺀", (int)var_int_c, (long)(d ^ e)), exception);
        }
    }

    public void c() {
        if (this.var_com_nickuc_login_lib_hikari_HikariDataSource_a.isClosed()) {
            throw new IllegalStateException((String)NLoginCore_269.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        this.var_com_nickuc_login_lib_hikari_HikariDataSource_a.close();
    }

    static {
        var_int_a = 0 >>> 5 | 0 << -5;
        var_long_b = Long.reverse(-4233710832601742260L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(-7116014594118859700L);
        e = Long.reverse(0x5800000000000000L);
        f = 512 >>> 104 | 512 << -104;
        g = (4 >>> 193 | 4 << -193) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[f];
        var_java_lang_String_arr_b = new String[g];
        NLoginCore_269.b();
    }
}

