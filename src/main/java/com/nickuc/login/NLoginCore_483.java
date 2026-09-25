/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_116;
import com.nickuc.login.NLoginInterface_047;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
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

public abstract class NLoginCore_483<V extends NLoginCore_116<?>>
implements NLoginInterface_047 {
    private static long d;
    private static int f;
    private static long var_long_b;
    protected final V var_V_h;
    private static int var_int_a;
    private static long var_long_h;
    private static long var_long_c;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private static long g;
    private static long e;
    private static int m;
    private static int i;
    private static int var_int_c;
    private static int l;
    private static int j;
    private static String[] var_java_lang_String_arr_b;

    private static void b() {
        int n;
        var_long_c = 3937340539207204817L;
        long l = var_long_c ^ 0x69F4388B135E7BE1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(66 + 2), (byte)(33 + 36), (byte)(54 + 29), (byte)(9 + 38), (byte)(7 + 60), (byte)(42 + 24), (byte)(48 + 19), 47, (byte)(50 + 30), (byte)(5 + 70), (byte)(51 + 16), (byte)(59 + 24), (byte)(4 + 49), 80, (byte)(54 + 43), (byte)(53 + 47), (byte)(68 + 32), (byte)(14 + 91), (byte)(27 + 83), (byte)(58 + 45)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_483.var_java_lang_String_arr_b[0] = NLoginCore_384.B("ƬǅƱưƵƉƇǊƹƨǍƆƨƿƬƍƠǓǎƗƗƩƮƷǘǚǈƵǁǒǓǛ", (byte)102, 66);
                    NLoginCore_483.var_java_lang_String_arr_b[1] = NLoginCore_091.C("ՈաՍՌՑԥԣզՕՄթԢՄ՛ՈԩԼկժԳԳՁղԲեՖպՒՅ՞ՆԸԿՠս՘ԶԼ՚աքֈժՏ", (byte)102, 67);
                    NLoginCore_483.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ֈխլձ֜ՠջ՜շ֕յղտս֑֩ջ֭թ֢լւ֢֮֓֍ֱ֨֔֊ָյַ֐֔ֈָ֖֯չ֭֙ր֊", (byte)102, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_483.var_java_lang_String_arr_b[0] = NLoginCore_384.E("փ֜ֈև֌ՠ՞֡֐տ֤՝տ֖փդշ֪֥ծծր֍֧֠֕֨֍ղկիֶ֖յַׁ֩֞֫֒֜ն֕֊", (byte)102, 69);
                    NLoginCore_483.var_java_lang_String_arr_b[1] = NLoginCore_446.B("ƬǅƱưƵƉƇǊƹƨǍƆƨƿƬƍƠǓǎƗƗƥǖƖǉƺǞƶƩǂƪƜƽǐƵǞƲơǀǉǜǍƶƳ", (byte)102, 66);
                    NLoginCore_483.var_java_lang_String_arr_b[2] = NLoginCore_091.E("ֈխլձ֜ՠջ՜շ֕յղտս֑֩ջ֭թ֢լւ֢֮֓֍ֱ֨֔֊ָյ֍ֲַַֽ֑֪մ֐ւ֍֊", (byte)102, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_483.var_java_lang_String_arr_b[0] = NLoginCore_173.F("Օռկ֖՘՛տպ՛֣վչձ֔եղ֘բռ֍֚֞յն", (byte)102, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_483.var_java_lang_String_arr_b[0] = NLoginCore_076.E("֙Վ։՞֖֜՝խ֋֢ցժ", (byte)102, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0x1BL;
        l ^= 0x69F4388B135E7BE1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(49 + 20), (byte)(8 + 75), (byte)(19 + 28), (byte)(8 + 59), (byte)(25 + 41), (byte)(41 + 26), (byte)(5 + 42), 80, (byte)(55 + 20), (byte)(2 + 65), (byte)(65 + 18), (byte)(13 + 40), (byte)(61 + 19), 97, (byte)(84 + 16), (byte)(25 + 75), (byte)(73 + 32), (byte)(74 + 36), (byte)(102 + 1)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_173.C("ӀӍӌҏӏӋӆӏӚӉҖӔӘӑӔӚҜࠬ࠴࠭࠯ࠤ࠯࠻ࠪ", (byte)56, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_483.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_483.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.B("ŏűųœŷƖƎƤƐşƝƓơƛŤƉƫƪƢƨƢŷ", (byte)84, 66), NLoginCore_483.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_223.D("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰࢀ࢈ࢁࢃࡸࢃ࢏ࡾԄ", (byte)84, 68) + string + NLoginCore_201.F("Պ", (byte)84, 70) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_483(V v) {
        this.var_V_h = v;
    }

    @Override
    public boolean a(NLoginCore_277 NLoginCore_277, NLoginCore_337 NLoginCore_3372, Object object, byte[] byArray) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginCore_483.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        if (object instanceof String && ((String)object).isEmpty()) {
            throw new IllegalArgumentException((String)NLoginCore_483.c("㺃", (int)var_int_c, (long)(d ^ e)));
        }
        if (byArray == null) {
            throw new IllegalArgumentException((String)NLoginCore_483.c("㺆", (int)f, (long)(g ^ var_long_h)));
        }
        if (NLoginCore_277 != null) {
            NLoginCore_277.a((NLoginCore_116<?>)this.var_V_h, NLoginCore_3372, object, byArray);
            return i != 0;
        }
        for (NLoginCore_277 NLoginCore_2772 : this.var_V_h.com_nickuc_login_NLoginInterface_040_b().c()) {
            if (!NLoginCore_2772.R()) continue;
            NLoginCore_2772.a((NLoginCore_116<?>)this.var_V_h, NLoginCore_3372, object, byArray);
            return j != 0;
        }
        return k != 0;
    }

    static {
        var_int_a = 0 >>> 76 | 0 << -76;
        var_long_b = Long.reverse(6052007631449236844L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Long.reverse(-8359511176136350356L);
        e = Long.reverse(-2882303761517117440L);
        f = Integer.reverse(0x40000000);
        g = Long.reverse(-8359511176136350356L);
        var_long_h = Long.reverse(-2882303761517117440L);
        i = Integer.reverse(Integer.MIN_VALUE);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = 0 >>> 217 | 0 << ~217 + 1;
        l = 48 >>> 100 | 48 << ~100 + 1;
        m = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[l];
        var_java_lang_String_arr_b = new String[m];
        NLoginCore_483.b();
    }
}

