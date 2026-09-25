/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_139;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_451;
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

public class NLoginCore_579
extends NLoginCore_139 {
    private static long ap;
    private static int af;
    private static long p;
    private static long e;
    private static String[] d;
    private static int q;
    private static long al;
    private static int y;
    private static int ak;
    private static int ao;
    private static int m;
    private static long l;
    private static int ar;
    private static long i;
    private static int b;
    private static int ac;
    private static int j;
    private static int ah;
    private static String[] c;
    private static long aq;
    private static long g;
    private static long o;
    private static long ag;
    private static int as;

    private static String a(int n, long l) {
        l ^= 0x25L;
        l ^= 0x5DB183E323566582L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), 69, 83, (byte)(29 + 18), (byte)(17 + 50), (byte)(50 + 16), (byte)(4 + 63), (byte)(21 + 26), (byte)(2 + 78), (byte)(51 + 24), (byte)(23 + 44), (byte)(7 + 76), (byte)(9 + 44), (byte)(41 + 39), (byte)(95 + 2), (byte)(7 + 93), (byte)(97 + 3), (byte)(89 + 16), (byte)(62 + 48), (byte)(55 + 48)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(40 + 29), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.A("ŎśŚĝŝřŔŝŨŗĤŢŦşŢŨĪүҐҞӂқҿӀҼҼҿ", (byte)54, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_579.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    @Override
    public void b(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_t, string -> {
            if (string.contains((CharSequence)NLoginCore_579.c("㺀", (int)(ac & af), (long)ag))) {
                NLoginInterface_0242.d((String)string, (String)NLoginCore_579.c("㺃", (int)(ah & ak), (long)al), (String)NLoginCore_579.c("㺆", (int)ao, (long)(ap ^ aq)));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[y]);
    }

    public NLoginCore_579(NLoginCore_211 NLoginCore_211) {
        super(NLoginCore_211, (String)NLoginCore_579.c("㺀", (int)b, (long)(g ^ i)));
    }

    static {
        b = Integer.reverse(0);
        g = Long.reverse(5385987348604284138L);
        i = Long.reverse(-6629298651489370112L);
        j = Integer.reverse(Integer.MIN_VALUE);
        l = Long.reverse(-1243311302885085974L);
        m = Integer.reverse(0x40000000);
        o = Long.reverse(5385987348604284138L);
        p = Long.reverse(-6629298651489370112L);
        q = (0 >>> 91 | 0 << ~91 + 1) & 0xFFFFFFFF;
        y = 0 >>> 249 | 0 << ~249 + 1;
        ac = Integer.reverse(-1073741824);
        af = Integer.reverse(-1);
        ag = Long.reverse(-1243311302885085974L);
        ah = Integer.reverse(0x20000000);
        ak = -1 >>> 194 | -1 << ~194 + 1;
        al = Long.reverse(-1243311302885085974L);
        ao = (10240 >>> 171 | 10240 << -171) & 0xFFFFFFFF;
        ap = Long.reverse(5385987348604284138L);
        aq = Long.reverse(-6629298651489370112L);
        ar = 0x600000 >>> 84 | 0x600000 << ~84 + 1;
        as = Integer.reverse(0x60000000);
        c = new String[ar];
        d = new String[as];
        NLoginCore_579.b();
    }

    private static void b() {
        int n;
        e = 6284336123988376914L;
        long l = e ^ 0x5DB183E323566582L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(40 + 29), (byte)(65 + 18), (byte)(24 + 23), (byte)(14 + 53), (byte)(46 + 20), (byte)(11 + 56), (byte)(39 + 8), (byte)(47 + 33), (byte)(26 + 49), (byte)(66 + 1), (byte)(71 + 12), (byte)(50 + 3), (byte)(22 + 58), 97, (byte)(89 + 11), (byte)(48 + 52), 105, (byte)(62 + 48), (byte)(37 + 66)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(14 + 54), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_579.d[0] = NLoginCore_446.C("еЅЈйПиЗзЮкЃйИекнъмУоЇЧДЕ", (byte)4, 67);
                    NLoginCore_579.d[1] = NLoginCore_223.A("ÍÀÿØ¼ïÏåþûÉāĂĂäÏÞăñĐóÝÚÛ", (byte)4, 65);
                    NLoginCore_579.d[2] = NLoginCore_201.B("ûËÎÿåþÝýôĀÉÿÞûĀăĐĂéĄÍíÚÛ", (byte)4, 66);
                    NLoginCore_579.d[3] = NLoginCore_451.A("òÿýðùĂÙÄçĀâÏ", (byte)4, 65);
                    NLoginCore_579.d[4] = NLoginCore_324.D("ЃЪвЎЈивϾЌЌϾЮлрЩЀлЙэьэНѐюшХГЋФЪТъХкИмѕШиеНРхќђћСШљчѥЪжзде", (byte)4, 68);
                    NLoginCore_579.d[5] = NLoginCore_201.A("éîàâüÂåĀÑ÷ÀâÙùöíäāáýíëë×ėĔëëćÔÛĘîđßûõĎõğěğĨĉåêħīăĄħđĀĳúû", (byte)4, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_579.d[0] = NLoginCore_324.F("ԴԄԇԸԞԷԖԶԭԹԂԂ԰ԣԠԀԚՉԼԪԄՌԓԔ", (byte)4, 70);
                    NLoginCore_579.d[1] = NLoginCore_138.C("ЇϺйВ϶ЩЉПиеЃбБЖнуПЄзЄШЗДЕ", (byte)4, 67);
                    NLoginCore_579.d[2] = NLoginCore_004.C("еЅЈйПиЗзЮкЄϿлтЀбЂЦхрснДЕ", (byte)4, 67);
                    NLoginCore_579.d[3] = NLoginCore_559.C("ШЇаИЇдМрУгпдЅТЅДЊЈИУЦэДЕ", (byte)4, 67);
                    NLoginCore_579.d[4] = NLoginCore_092.D("ЃЪвЎЈивϾЌЌϾЮлрЩЀлЙэьэНѐюшХГЋФЪТъХкИмѕШиеНРэЗѠмйрУтОыѝЧхѫьцѥпаёѷд", (byte)4, 68);
                    NLoginCore_579.d[5] = NLoginCore_427.E("ԢԧԙԛԵӻԞԹԊ԰ӹԛԒԲԯԦԝԺԚԶԦԤԤԐՐՍԤԤՀԍԔՑԧՊԘԴԮՇԮ՘Ք՘դԞզՑԝգե՝ԶԿԺ՜ԳԴ", (byte)4, 69);
                    continue block7;
                }
                case 2: {
                    NLoginCore_579.d[0] = NLoginCore_451.B("ÎÑûãìàüÞ×ÓÓøèĊÜØËĄñĆüÝÚÛ", (byte)4, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_579.d[0] = NLoginCore_201.F("ԎԫԪԽԫӹՀԩԱԔԴԚԗՀԘԽԹԡԘՂԣԖԓԔ", (byte)4, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_579.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.A("ŧƉƋūƏƮƦƼƨŷƵƫƹƳżơǃǂƺǀƺƏ", (byte)96, 65), NLoginCore_579.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.F("տ֌֋Վ֎֊օ֎֙ֈՕ֓֗֐֓֙՛࣠ࣁࣰࣰࣱ࣏࣭࣭ࣳ࣌ձ", (byte)96, 70) + string + NLoginCore_201.B("Ź", (byte)96, 66) + methodType.toString(), exception);
        }
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        Object object;
        Object object2 = object = NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d ? NLoginCore_579.c("㺀", (int)j, (long)l) : NLoginCore_579.c("㺃", (int)m, (long)(o ^ p));
        if (NLoginType_008.java_lang_Object_b().j((String)object)) {
            return q != 0;
        }
        return NLoginType_008.com_nickuc_login_NLoginCore_495_a().p();
    }
}

