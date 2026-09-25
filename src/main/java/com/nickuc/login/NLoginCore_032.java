/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginInterface_033;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class NLoginCore_032
implements NLoginInterface_033 {
    private static long var_long_b;
    private final Constructor<?> var_java_lang_reflect_Constructor____b;
    private static int k;
    private static int ad;
    private static String[] var_java_lang_String_arr_a;
    private static int ag;
    private static int aa;
    private static int y;
    private static int p;
    private final Method var_java_lang_reflect_Method_e;
    private static long m;
    private static int j;
    private static int ab;
    private static long ah;
    private static int s;
    private static long af;
    private static int aj;
    private static int i;
    private static int x;
    private static int q;
    private static long r;
    private static int g;
    private static int z;
    private static int ae;
    private static long l;
    private static int v;
    private static int o;
    private static long ai;
    private static int ak;
    private static int n;
    private static int w;
    private static int f;
    private static int ac;
    private static int t;
    private static long u;
    private static int var_int_a;
    private static int var_int_e;
    private static int h;
    private static long c;
    private static long d;
    private static String[] var_java_lang_String_arr_b;

    private static String a(int n, long l) {
        l ^= 0x63L;
        l ^= 0xF71FAF752EDB80AEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(62 + 6), (byte)(19 + 50), (byte)(82 + 1), 47, (byte)(63 + 4), (byte)(60 + 6), (byte)(62 + 5), (byte)(41 + 6), (byte)(7 + 73), (byte)(48 + 27), (byte)(3 + 64), (byte)(14 + 69), (byte)(20 + 33), (byte)(6 + 74), (byte)(71 + 26), (byte)(54 + 46), (byte)(58 + 42), (byte)(18 + 87), 110, (byte)(22 + 81)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(62 + 21)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆљѕќѢтяћѓљѕшѣ", (byte)4, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_032.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_032.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.F("ՂդզՆժ։ց֗փՒ֐ֆ֔֎՗ռ֛֞֝֕֕ժ", (byte)94, 70), NLoginCore_032.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_427.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢡ࢝ࢤࢪࢊࢗࢣ࢛ࢡ࢝࢐ࢫԦ", (byte)94, 67) + string + NLoginCore_201.C("ԉ", (byte)94, 67) + methodType.toString(), exception);
        }
    }

    @Override
    public void a(Player player, String object, String object2, int n, int n2, int n3) {
        if (((String)object).isEmpty() && ((String)object2).isEmpty()) {
            this.a(player);
            return;
        }
        if (((String)object).isEmpty()) {
            object = NLoginCore_032.c("㺀", (int)(p & q), (long)r);
        }
        if (((String)object2).isEmpty()) {
            object2 = NLoginCore_032.c("㺃", (int)(s & t), (long)u);
        }
        try {
            Object[] objectArray = new Object[v];
            objectArray[NLoginCore_032.w] = object;
            objectArray[NLoginCore_032.x] = object2;
            objectArray[NLoginCore_032.y] = n;
            objectArray[NLoginCore_032.z] = n2;
            objectArray[NLoginCore_032.aa] = n3;
            Object t = this.var_long_b.newInstance(objectArray);
            Object[] objectArray2 = new Object[ab];
            objectArray2[NLoginCore_032.ac] = t;
            this.var_java_lang_reflect_Method_e.invoke((Object)player, objectArray2);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException((String)NLoginCore_032.c("㺆", (int)(ad & ae), (long)af) + player.getName() + (String)NLoginCore_032.c("㺉", (int)ag, (long)(ah ^ ai)), reflectiveOperationException);
        }
    }

    public NLoginCore_032() {
        Class<?> clazz = Class.forName((String)NLoginCore_032.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)));
        Class[] classArray = new Class[var_int_e];
        classArray[NLoginCore_032.f] = String.class;
        classArray[NLoginCore_032.g] = String.class;
        classArray[NLoginCore_032.h] = Integer.TYPE;
        classArray[NLoginCore_032.i] = Integer.TYPE;
        classArray[NLoginCore_032.j] = Integer.TYPE;
        this.var_long_b = (long)clazz.getConstructor(classArray);
        Class[] classArray2 = new Class[n];
        classArray2[NLoginCore_032.o] = clazz;
        this.var_java_lang_reflect_Method_e = Player.class.getMethod((String)NLoginCore_032.c("㺃", (int)k, (long)(l ^ m)), classArray2);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-8964563583952790989L);
        d = Long.reverse(-4179340454199820288L);
        var_int_e = (0x500000 >>> 116 | 0x500000 << -116) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (1024 >>> 169 | 1024 << ~169 + 1) & 0xFFFFFFFF;
        i = 786432 >>> 242 | 786432 << -242;
        j = Integer.reverse(0x20000000);
        k = 65536 >>> 16 | 65536 << ~16 + 1;
        l = Long.reverse(-8964563583952790989L);
        m = Long.reverse(-4179340454199820288L);
        n = Integer.reverse(Integer.MIN_VALUE);
        o = Integer.reverse(0);
        p = Integer.reverse(0x40000000);
        q = Integer.reverse(-1);
        r = Long.reverse(5014609659405228595L);
        s = (0x300000 >>> 212 | 0x300000 << -212) & 0xFFFFFFFF;
        t = Integer.reverse(-1);
        u = Long.reverse(5014609659405228595L);
        v = (327680 >>> 176 | 327680 << ~176 + 1) & 0xFFFFFFFF;
        w = (0 >>> 8 | 0 << ~8 + 1) & 0xFFFFFFFF;
        x = 8192 >>> 77 | 8192 << ~77 + 1;
        y = Integer.reverse(0x40000000);
        z = Integer.reverse(-1073741824);
        aa = Integer.reverse(0x20000000);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = 0 >>> 24 | 0 << -24;
        ad = Integer.reverse(0x20000000);
        ae = (-1 >>> 11 | -1 << -11) & 0xFFFFFFFF;
        af = Long.reverse(5014609659405228595L);
        ag = Integer.reverse(-1610612736);
        ah = Long.reverse(-8964563583952790989L);
        ai = Long.reverse(-4179340454199820288L);
        aj = (98304 >>> 142 | 98304 << -142) & 0xFFFFFFFF;
        ak = Integer.reverse(0x60000000);
        var_java_lang_String_arr_a = new String[aj];
        var_java_lang_String_arr_b = new String[ak];
        NLoginCore_032.b();
    }

    private static void b() {
        int n;
        c = -3721406826275739199L;
        long l = c ^ 0xF71FAF752EDB80AEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(28 + 55), (byte)(24 + 23), (byte)(60 + 7), (byte)(41 + 25), (byte)(13 + 54), 47, (byte)(13 + 67), (byte)(39 + 36), (byte)(63 + 4), (byte)(71 + 12), (byte)(44 + 9), (byte)(56 + 24), (byte)(59 + 38), (byte)(99 + 1), (byte)(67 + 33), (byte)(74 + 31), (byte)(26 + 84), (byte)(41 + 62)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
                    NLoginCore_032.var_java_lang_String_arr_b[0] = NLoginCore_027.D("ѮсќЪѬѭѬѦззёѨќѪіѱжѡћѠѻсѴѽѠњ҃ѺѣѸ҃҈ҀюѯѤѴ҄Ғ҆іѥёџ", (byte)22, 68);
                    NLoginCore_032.var_java_lang_String_arr_b[1] = NLoginCore_427.C("ЩѝмѢъэѷѸхѬѦкжнњѺёѮҀѷлѳъы", (byte)22, 67);
                    NLoginCore_032.var_java_lang_String_arr_b[2] = NLoginCore_092.A("÷óàÝĄèĩóĠëĎó", (byte)22, 65);
                    NLoginCore_032.var_java_lang_String_arr_b[3] = NLoginCore_138.A("÷óàÝĄèĩóĠëĎó", (byte)22, 65);
                    NLoginCore_032.var_java_lang_String_arr_b[4] = NLoginCore_091.B("ñùĚçÿāēăġĕĭèĀêīĪğĳėďĳĔøøüĝĜĻùğĵú", (byte)22, 66);
                    NLoginCore_032.var_java_lang_String_arr_b[5] = NLoginCore_201.C("ѦўўёѭѴѬЩѶэѸп", (byte)22, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_032.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ՉԜԷԅՇՈՇՁԒԒԬՃԷՅԱՌԑԼԶԻՖԜՏ՘ԻԵ՞ՕԾՓ՞գզՉՖՌիԻՄՀՒՇՐծկմԳպԶԵ՘՞՜վՅՆ", (byte)22, 69);
                    NLoginCore_032.var_java_lang_String_arr_b[1] = NLoginCore_091.E("ԄԸԗԽԥԨՒՓԠՇՀԎՑ՗ՙՊԤԖ՞՞ԶՎԥԦ", (byte)22, 69);
                    NLoginCore_032.var_java_lang_String_arr_b[2] = NLoginCore_076.F("ӽՄԧԚԣԛԯՂԲԽԐԚ", (byte)22, 70);
                    NLoginCore_032.var_java_lang_String_arr_b[3] = NLoginCore_387.C("ЬЬшєгѰіѤјѹѬп", (byte)22, 67);
                    NLoginCore_032.var_java_lang_String_arr_b[4] = NLoginCore_324.D("нхѦгыэџяѭѡѹдьжѷѶѫѿѣћѿѮхѳ҄҈Ѿѿ҄ѧҌѪ҈ҀѺѱъҌѥяҎѦѮџ", (byte)22, 68);
                    NLoginCore_032.var_java_lang_String_arr_b[5] = NLoginCore_173.B("ÖĖĠúĜĖĘôīçĂó", (byte)22, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_032.var_java_lang_String_arr_b[0] = NLoginCore_223.C("уоѓрѤѰѳѳчЫђп", (byte)22, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_032.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ԹՍԖԿԘԐԊԬՅՇԔԞԱՂԖԒԥԽԺՈԻԸԥԦ", (byte)22, 70);
                }
            }
        }
    }

    @Override
    public void a(Player player) {
        player.resetTitle();
    }
}

