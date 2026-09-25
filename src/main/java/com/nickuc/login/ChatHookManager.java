/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_211;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_139;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
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

public class ChatHookManager
extends NLoginCore_139 {
    private static int au;
    private static long e;
    private static int ao;
    private static int aw;
    private static long ad;
    private static String[] c;
    private static int aq;
    private static int af;
    private static String[] d;
    private static int j;
    private static int ap;
    private static long ag;
    private static int q;
    private static int b;
    private static long ai;
    private static int ar;
    private static long l;
    private static int ba;
    private static long av;
    private static long as;
    private static long g;
    private static int az;
    private static long ay;
    private static long i;
    private static int k;
    private static long ax;
    private static int y;
    private static int at;
    private static long o;
    private static int ak;
    private static int ac;

    @Override
    public void b(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginInterface_024 NLoginInterface_0242) {
        NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_397.var_com_nickuc_login_NLoginCore_237_u, string -> {
            if (string.contains((CharSequence)ChatHookManager.c("㺀", (int)(aq & ar), (long)as))) {
                NLoginInterface_0242.d((String)string, (String)ChatHookManager.c("㺃", (int)(at & au), (long)av), (String)ChatHookManager.c("㺆", (int)aw, (long)(ax ^ ay)));
            } else {
                NLoginInterface_0242.a((String)string);
            }
        }, new Object[ap]);
    }

    @Override
    public boolean a(NLoginType_008 NLoginType_008, NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        if (NLoginType_008.com_nickuc_login_NLoginCore_364_b().a() != NLoginCore_419.var_com_nickuc_login_NLoginCore_419_b) {
            return j != 0;
        }
        Object object = NLoginType_008.java_lang_Object_b();
        if (object.j((String)ChatHookManager.c("㺀", (int)k, (long)(l ^ o)))) {
            return q != 0;
        }
        if (!NLoginType_008.com_nickuc_login_NLoginCore_495_a().p()) {
            return y != 0;
        }
        return (NLoginCore_150.j() && (object.j((String)ChatHookManager.c("㺃", (int)ac, (long)ad)) || object.j((String)ChatHookManager.c("㺆", (int)af, (long)(ag ^ ai)))) ? ak : ao) != 0;
    }

    public ChatHookManager(NLoginCore_211 NLoginCore_211) {
        super(NLoginCore_211, (String)ChatHookManager.c("㺀", (int)b, (long)(g ^ i)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(ChatHookManager.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.C("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)103, 67), ChatHookManager.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_110.D("Ս՚ՙԜ՜՘Փ՜էՖԣաե՞աէԩࢤࢷࢮ࢞ࢶࢩࣈ࢖ࢸ࣍ࣇ࢚Ձ", (byte)103, 68) + string + NLoginCore_092.A("Ƈ", (byte)103, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 1L;
        l ^= 0xCC0D5EAD49B34941L;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(35 + 34), (byte)(73 + 10), (byte)(25 + 22), (byte)(50 + 17), (byte)(29 + 37), (byte)(9 + 58), (byte)(14 + 33), (byte)(60 + 20), (byte)(18 + 57), (byte)(52 + 15), (byte)(43 + 40), (byte)(22 + 31), (byte)(38 + 42), 97, (byte)(9 + 91), (byte)(8 + 92), (byte)(11 + 94), (byte)(99 + 11), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_138.D("йцхЈшфпшѓтЏэёъэѓЕސޣޚފޢޕ޴ނޤ޹޳ކ", (byte)11, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            ChatHookManager.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    private static void b() {
        int n;
        e = 3360547535887226450L;
        long l = e ^ 0xCC0D5EAD49B34941L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(18 + 51), (byte)(5 + 78), (byte)(40 + 7), (byte)(31 + 36), (byte)(33 + 33), (byte)(66 + 1), (byte)(8 + 39), (byte)(14 + 66), (byte)(16 + 59), (byte)(48 + 19), (byte)(13 + 70), 53, (byte)(22 + 58), (byte)(3 + 94), (byte)(24 + 76), (byte)(94 + 6), (byte)(69 + 36), 110, (byte)(21 + 82)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
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
                    ChatHookManager.d[0] = NLoginCore_559.F("ԗԓԒӵԪԦԛԉԫԹԬԇ", (byte)3, 70);
                    ChatHookManager.d[1] = NLoginCore_559.C("ЖВБϴЩХКЈЪиЫІ", (byte)3, 67);
                    ChatHookManager.d[2] = NLoginCore_091.E("ԵԚӵԯԫԚԮԚ԰ՀԍԹԕԾԤԸՈԳԒԙӾԥԒԓ", (byte)3, 69);
                    ChatHookManager.d[3] = NLoginCore_451.C("Ͽϳ϶ЇЗзаЋмЫВЛПкКДЯІвЄϽъБВ", (byte)3, 67);
                    ChatHookManager.d[4] = NLoginCore_575.B("Õ¹¶þĀËûÎÁ¿öÍ", (byte)3, 66);
                    ChatHookManager.d[5] = NLoginCore_223.F("Ӳԧ԰ԱԦԒԕԌԐԌӼԾԺԷԙԒԕԩՈԵԹԭԆԗԌԐԊՋԽՒԨԔԪ՗Գԗԩԧ԰ԮԷԞՐԮ՘Դ԰՚ԷՙդԻԸՅԲԳ", (byte)3, 70);
                    ChatHookManager.d[6] = NLoginCore_427.E("ԤӶԥԑԳӽԓԧԞԍԻԝԼԁԎԚԈԁԸԛԕՅԍԨՊԻԏՐՃՔՒԳ՘ՒՊԱԬ՗ԬԫԮ՝Ժԧ", (byte)3, 69);
                    continue block7;
                }
                case 1: {
                    ChatHookManager.d[0] = NLoginCore_559.C("ІйбϰЇжЋЙϼКϽЭЫИуЁОКЩЊОФБВ", (byte)3, 67);
                    ChatHookManager.d[1] = NLoginCore_451.D("ЖФбЬгмϷОРЍϼІ", (byte)3, 68);
                    ChatHookManager.d[2] = NLoginCore_091.D("дЙϴЮЪЙЭЙЯпЋЖЀнϽддЁгкДкБВ", (byte)3, 68);
                    ChatHookManager.d[3] = NLoginCore_427.B("Æº½ÎÞþ÷ÒăòÙÇé÷ĉćăìïăïđØÙ", (byte)3, 66);
                    ChatHookManager.d[4] = NLoginCore_223.B("ÞÞÑËÙÑăÐÖÐÅãêÂäâĊÇæÐĄëØÙ", (byte)3, 66);
                    ChatHookManager.d[5] = NLoginCore_027.E("Ӳԧ԰ԱԦԒԕԌԐԌӼԾԺԷԙԒԕԩՈԵԹԭԆԗԌԐԊՋԽՒԨԔԪ՗Գԗԩԧ԰ԮԷԞՒՔգդԸՒԠԟԸզԽՅԲԳ", (byte)3, 69);
                    ChatHookManager.d[6] = NLoginCore_076.B("ê¼ë×ùÃÙíäÓāãĂÇÔàÎÇþáÛċÓîĐāÕĖĉĚĘùþýāĉõÞġąĔęøĆùęìĜĭþĢĈĊûøù", (byte)3, 66);
                    continue block7;
                }
                case 2: {
                    ChatHookManager.d[0] = NLoginCore_223.C("ЧЀЕЬЭЋгϼБОтЁЃкПаМУмЦЙкБВ", (byte)3, 67);
                    continue block7;
                }
                case 4: {
                    ChatHookManager.d[0] = NLoginCore_575.B("Ô÷ÝÓíüÓÃ½ÖýÄàċöāčÁąÜĒāØÙ", (byte)3, 66);
                }
            }
        }
    }

    static {
        b = 0 >>> 113 | 0 << ~113 + 1;
        g = Long.reverse(5362374230942467444L);
        i = Long.reverse(Long.MIN_VALUE);
        j = Integer.reverse(0);
        k = (Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << ~31 + 1) & 0xFFFFFFFF;
        l = Long.reverse(5362374230942467444L);
        o = Long.reverse(Long.MIN_VALUE);
        q = Integer.reverse(0);
        y = 0 >>> 12 | 0 << -12;
        ac = 0x4000000 >>> 89 | 0x4000000 << ~89 + 1;
        ad = Long.reverse(-3860997805912308364L);
        af = Integer.reverse(-1073741824);
        ag = Long.reverse(5362374230942467444L);
        ai = Long.reverse(Long.MIN_VALUE);
        ak = Integer.reverse(Integer.MIN_VALUE);
        ao = 0 >>> 56 | 0 << ~56 + 1;
        ap = Integer.reverse(0);
        aq = Integer.reverse(0x20000000);
        ar = (-1 >>> 230 | -1 << -230) & 0xFFFFFFFF;
        as = Long.reverse(-3860997805912308364L);
        at = Integer.reverse(-1610612736);
        au = (-1 >>> 228 | -1 << ~228 + 1) & 0xFFFFFFFF;
        av = Long.reverse(-3860997805912308364L);
        aw = (0x600000 >>> 244 | 0x600000 << ~244 + 1) & 0xFFFFFFFF;
        ax = Long.reverse(5362374230942467444L);
        ay = Long.reverse(Long.MIN_VALUE);
        az = Integer.reverse(-536870912);
        ba = (112 >>> 132 | 112 << ~132 + 1) & 0xFFFFFFFF;
        c = new String[az];
        d = new String[ba];
        ChatHookManager.b();
    }
}

