/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_445;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_415;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ContactCommand
implements NLoginCore_415 {
    private static long var_long_c;
    private static int i;
    private static int l;
    private static int q;
    private static int n;
    private static int f;
    private static int d;
    private final NLoginCore_211 M;
    private static int var_int_b;
    private static long j;
    private static int s;
    private static String[] var_java_lang_String_arr_b;
    private Boolean var_java_lang_Boolean_c;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_c;
    private static int g;
    private static int var_int_a;
    private static int h;
    private static int m;
    private static int e;
    private static int t;
    private static long k;
    private static int p;
    private static int r;
    private static long o;

    private static String a(int n, long l) {
        l ^= 2L;
        l ^= 0xE4D74F0C682EA9BAL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(59 + 9), (byte)(54 + 15), (byte)(69 + 14), (byte)(36 + 11), (byte)(5 + 62), (byte)(53 + 13), (byte)(9 + 58), (byte)(21 + 26), 80, (byte)(59 + 16), (byte)(63 + 4), (byte)(11 + 72), (byte)(18 + 35), (byte)(76 + 4), (byte)(60 + 37), (byte)(91 + 9), 100, (byte)(47 + 58), (byte)(86 + 24), (byte)(15 + 88)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(30 + 53)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.D("ӿԌԋӎԎԊԅԎԙԈӕԓԗԐԓԙӛࡡ࡮ࡱࡶ࡚ࡱࡷࡷࡷࡖࡱࡹ࡫ࡱࡽ", (byte)77, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            ContactCommand.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << ~191 + 1;
        var_int_b = 18 >>> 97 | 18 << -97;
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(0);
        e = Integer.reverse(-402653184);
        f = (0xC000000 >>> 90 | 0xC000000 << -90) & 0xFFFFFFFF;
        g = Integer.reverse(0);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = (0 >>> 172 | 0 << ~172 + 1) & 0xFFFFFFFF;
        j = Long.reverse(3309416986446876304L);
        k = Long.reverse(0x4000000000000000L);
        l = (64 >>> 69 | 64 << -69) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(-1);
        o = Long.reverse(7921103004874264208L);
        p = Integer.reverse(0);
        q = Integer.reverse(Integer.MIN_VALUE);
        r = Integer.reverse(0);
        s = Integer.reverse(0x40000000);
        t = 0x4000000 >>> 57 | 0x4000000 << -57;
        var_java_lang_String_arr_a = new String[s];
        var_java_lang_String_arr_b = new String[t];
        ContactCommand.b();
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (this.var_java_lang_Boolean_c != null) {
            return this.var_java_lang_Boolean_c;
        }
        int n = NLoginType_008.com_nickuc_login_NLoginCore_227_a().n();
        this.var_java_lang_Boolean_c = (n != var_int_a && n != var_int_b ? var_int_c : d) != 0;
        return this.var_java_lang_Boolean_c;
    }

    @Generated
    public Boolean java_lang_Boolean_a() {
        return this.var_java_lang_Boolean_c;
    }

    @Generated
    public ContactCommand(NLoginCore_211 NLoginCore_211) {
        this.M = NLoginCore_211;
    }

    private static void b() {
        int n;
        var_long_c = 680873988218861492L;
        long l = var_long_c ^ 0xE4D74F0C682EA9BAL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(28 + 41), (byte)(15 + 68), (byte)(41 + 6), (byte)(8 + 59), (byte)(51 + 15), 67, (byte)(25 + 22), (byte)(58 + 22), (byte)(69 + 6), (byte)(58 + 9), (byte)(27 + 56), (byte)(23 + 30), (byte)(59 + 21), (byte)(48 + 49), (byte)(65 + 35), (byte)(7 + 93), (byte)(38 + 67), 110, (byte)(99 + 4)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(44 + 25), 83}, StandardCharsets.UTF_8));
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
                    ContactCommand.var_java_lang_String_arr_b[0] = NLoginCore_223.D("չգֈքՔփէ֐֙հդփծչ՜ըշցջր֒ց֖֠ոֆօմս֧ռ֢֘ըղծտէֵַ֣֞֩֨և֕ջֲչִֻֻ֙֝֊֋", (byte)118, 68);
                    ContactCommand.var_java_lang_String_arr_b[1] = NLoginCore_201.A("ƽƞǃǡƣƛƢǬǊƤǆǌǃǣǇƱǇǭǱǌǫǷƾƿ", (byte)118, 65);
                    continue block7;
                }
                case 1: {
                    ContactCommand.var_java_lang_String_arr_b[0] = NLoginCore_453.F("֔վ֣֟կ֞ւִ֫֋տ֞։֔շփֱֻ֖֛֭֒֜֜֓֡֠֏ֳֽׂ֘֗փ֍։֚ւֹׄג־ג׀ׂ֔׏׋ַ֥֥֦֬֞֯֨", (byte)118, 70);
                    ContactCommand.var_java_lang_String_arr_b[1] = NLoginCore_324.B("ƽƞǃǡƣƛƢǬǊƤǉǋǄưǦǓǋǫƶǨǸǒǇǎƼǽǙƹǾƸǗǖ", (byte)118, 66);
                    continue block7;
                }
                case 2: {
                    ContactCommand.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ǙǒǢǂǛǚƵƢƦǨǦǮǭǅǀǎǇǱǕƱǆǧƾƿ", (byte)118, 65);
                    continue block7;
                }
                case 4: {
                    ContactCommand.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ƭǜǡǙǃǗƷǈǥǝƾơƨǭƺǧǰǀǅǏǣǁƾƿ", (byte)118, 65);
                }
            }
        }
    }

    @Override
    public GUIButtonContainer[] com_nickuc_login_GUIButtonContainer_arr_a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        Object[] objectArray = new Object[f];
        objectArray[ContactCommand.g] = NLoginType_008.s();
        objectArray[ContactCommand.h] = ContactCommand.c("㺀", (int)i, (long)(j ^ k));
        objectArray[ContactCommand.l] = ContactCommand.c("㺃", (int)(m & n), (long)o);
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginType_008.com_nickuc_login_NLoginCore_227_a().n() != e ? NLoginCore_397.var_com_nickuc_login_NLoginCore_237_z : NLoginCore_397.A, objectArray);
        this.var_java_lang_Boolean_c = p != 0;
        NLoginCore_445[] NLoginCore_445Array = new NLoginCore_445[q];
        NLoginCore_445Array[ContactCommand.r] = NLoginCore_445.var_com_nickuc_login_NLoginCore_445_a;
        return GUIButtonContainer.a(NLoginCore_277, NLoginCore_445Array);
    }

    @Override
    @Generated
    public NLoginCore_211 com_nickuc_login_NLoginCore_211_a() {
        return this.M;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(ContactCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.C("ѶҘҚѺҞҽҵӋҷ҆ӄҺӈӂҋҰӒӑӉӏӉҞ", (byte)51, 67), ContactCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍࠓࠠࠣࠨࠌࠣࠩࠩࠩࠈࠣࠫࠝࠣ࠯Ҩ", (byte)51, 67) + string + NLoginCore_091.A("ğ", (byte)51, 65) + methodType.toString(), exception);
        }
    }
}

