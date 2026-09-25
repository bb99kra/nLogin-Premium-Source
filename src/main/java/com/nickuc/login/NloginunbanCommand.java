/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_407;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_291;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginunbanCommand
extends NLoginCore_353 {
    private static long z;
    private static long bc;
    private static long aq;
    private static int ad;
    private static int k;
    private static long ai;
    private static int ax;
    private static long ag;
    private static int o;
    private static int n;
    private static long an;
    private static int var_int_c;
    private static long at;
    private static int d;
    private static long h;
    private static int l;
    private static int m;
    private static long aj;
    private static int x;
    private static int bd;
    private static int ar;
    private static long var_long_c;
    private static int af;
    private static long bb;
    private static int bf;
    private static int r;
    private static long ap;
    private static int u;
    private static String[] a;
    private static long az;
    private static int g;
    private static long q;
    private static long s;
    private static long w;
    private static long aw;
    private static int t;
    private static long ac;
    private static int ah;
    private static int am;
    private static long ay;
    private static int v;
    private static int au;
    private static long av;
    private static int j;
    private static long e;
    private static long y;
    private static int aa;
    private static float al;
    private static int f;
    private static long ab;
    private static int ao;
    private static int ba;
    private static String[] b;
    private static long as;
    private static float ak;
    private static int i;
    private static int be;
    private static long p;
    private static int ae;

    private void a(NLoginCore_494 NLoginInterface_0422, ForceRegisterConfig ForceRegisterConfig2) {
        String string = ForceRegisterConfig2.k();
        NLoginCore_407 NLoginCore_407 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_407_a();
        if (NLoginCore_407.b((String)NloginunbanCommand.c("㺀", (int)v, (long)w) + string) == null) {
            NLoginCore_150.a(NLoginInterface_0422, (String)(this.j() ? NloginunbanCommand.c("㺃", (int)x, (long)(y ^ z)) : NloginunbanCommand.c("㺆", (int)aa, (long)(ab ^ ac))), new Object[ad]);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
            return;
        }
        NLoginCore_407.e((String)NloginunbanCommand.c("㺉", (int)(ae & af), (long)ag) + string);
        NLoginCore_407.e((String)NloginunbanCommand.c("㺌", (int)ah, (long)(ai ^ aj)) + string);
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, ak, al);
        NLoginCore_150.a(NLoginInterface_0422, this.j() ? (String)NloginunbanCommand.c("㺏", (int)am, (long)an) + string + (String)NloginunbanCommand.c("㺒", (int)ao, (long)(ap ^ aq)) + ForceRegisterConfig2.i() + (String)NloginunbanCommand.c("㺕", (int)ar, (long)(as ^ at)) : (String)NloginunbanCommand.c("㺘", (int)au, (long)(av ^ aw)) + string + (String)NloginunbanCommand.c("㺛", (int)ax, (long)(ay ^ az)) + ForceRegisterConfig2.i() + (String)NloginunbanCommand.c("㺞", (int)ba, (long)(bb ^ bc)), new Object[bd]);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NloginunbanCommand.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.C("ӱԓԕӵԙԸ԰ՆԲԁԿԵՃԽԆԫՍՌՄՊՄԙ", (byte)92, 67), NloginunbanCommand.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.C("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢟࢐࢜ࡰ࢒࢑ࡻࡵࢗࢪࢠԟ", (byte)92, 67) + string + NLoginCore_223.E("Ւ", (byte)92, 69) + methodType.toString(), exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (stringArray.length != l) {
            Object[] objectArray = new Object[m];
            objectArray[NloginunbanCommand.n] = (String)NloginunbanCommand.c("㺀", (int)o, (long)(p ^ q)) + this.e().toLowerCase(Locale.ENGLISH) + (String)NloginunbanCommand.c("㺃", (int)r, (long)s);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        String string = stringArray[t];
        NLoginCore_291 NLoginCore_2912 = this.a.com_nickuc_login_NLoginCore_291_a();
        ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_2912.a(NLoginInterface_0422, ((NLoginCore_353)this).l, stringArray, string);
        if (ForceRegisterConfig2 == null) {
            return;
        }
        Object object = ForceRegisterConfig2.var_java_lang_Object_c;
        synchronized (object) {
            if (!ForceRegisterConfig2.boolean_h()) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[u]);
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.F);
                return;
            }
        }
        this.a(NLoginInterface_0422, ForceRegisterConfig2);
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Integer.reverse(-1);
        e = Long.reverse(-4804862252625210716L);
        f = Integer.reverse(Integer.MIN_VALUE);
        g = (-1 >>> 179 | -1 << ~179 + 1) & 0xFFFFFFFF;
        h = Long.reverse(-4804862252625210716L);
        i = (0 >>> 171 | 0 << -171) & 0xFFFFFFFF;
        j = 0 >>> 238 | 0 << ~238 + 1;
        k = 0 >>> 81 | 0 << -81;
        l = Integer.reverse(0x40000000);
        m = (128 >>> 135 | 128 << ~135 + 1) & 0xFFFFFFFF;
        n = Integer.reverse(0);
        o = Integer.reverse(0x40000000);
        p = Long.reverse(-4948977440701066588L);
        q = Long.reverse(0x600000000000000L);
        r = Integer.reverse(-1073741824);
        s = Long.reverse(-4804862252625210716L);
        t = 0x40000000 >>> 62 | 0x40000000 << -62;
        u = 0 >>> 164 | 0 << ~164 + 1;
        v = (65536 >>> 238 | 65536 << -238) & 0xFFFFFFFF;
        w = Long.reverse(-4804862252625210716L);
        x = Integer.reverse(-1610612736);
        y = Long.reverse(-4948977440701066588L);
        z = Long.reverse(0x600000000000000L);
        aa = Integer.reverse(0x60000000);
        ab = Long.reverse(-4948977440701066588L);
        ac = Long.reverse(0x600000000000000L);
        ad = (0 >>> 160 | 0 << ~160 + 1) & 0xFFFFFFFF;
        ae = Integer.reverse(-536870912);
        af = (-1 >>> 218 | -1 << -218) & 0xFFFFFFFF;
        ag = Long.reverse(-4804862252625210716L);
        ah = Integer.reverse(0x10000000);
        ai = Long.reverse(-4948977440701066588L);
        aj = Long.reverse(0x600000000000000L);
        ak = Float.intBitsToFloat(Integer.reverse(3714));
        al = Float.intBitsToFloat(8224 >>> 47 | 8224 << ~47 + 1);
        am = 0x240000 >>> 50 | 0x240000 << -50;
        an = Long.reverse(-4804862252625210716L);
        ao = 0x2800000 >>> 86 | 0x2800000 << -86;
        ap = Long.reverse(-4948977440701066588L);
        aq = Long.reverse(0x600000000000000L);
        ar = 720896 >>> 208 | 720896 << -208;
        as = Long.reverse(-4948977440701066588L);
        at = Long.reverse(0x600000000000000L);
        au = Integer.reverse(0x30000000);
        av = Long.reverse(-4948977440701066588L);
        aw = Long.reverse(0x600000000000000L);
        ax = (6656 >>> 137 | 6656 << ~137 + 1) & 0xFFFFFFFF;
        ay = Long.reverse(-4948977440701066588L);
        az = Long.reverse(0x600000000000000L);
        ba = Integer.reverse(0x70000000);
        bb = Long.reverse(-4948977440701066588L);
        bc = Long.reverse(0x600000000000000L);
        bd = 0 >>> 68 | 0 << -68;
        be = Integer.reverse(-268435456);
        bf = (122880 >>> 13 | 122880 << ~13 + 1) & 0xFFFFFFFF;
        a = new String[be];
        b = new String[bf];
        NloginunbanCommand.void_b();
    }

    public NloginunbanCommand(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NloginunbanCommand.c("㺀", (int)(var_int_c & d), (long)e), (String)NloginunbanCommand.c("㺃", (int)(f & g), (long)h), i != 0, j != 0, new String[k]);
    }

    private static String a(int n, long l) {
        l ^= 0x60L;
        l ^= 0x2A40CFC64E972F88L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(64 + 4), (byte)(3 + 66), (byte)(11 + 72), (byte)(3 + 44), (byte)(47 + 20), (byte)(62 + 4), (byte)(9 + 58), (byte)(16 + 31), (byte)(20 + 60), (byte)(39 + 36), (byte)(39 + 28), (byte)(61 + 22), (byte)(24 + 29), (byte)(25 + 55), (byte)(30 + 67), (byte)(26 + 74), (byte)(29 + 71), 105, (byte)(67 + 43), 103}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(44 + 39)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_575.E("՟լիԮծժեծչըԵճշհճչԻ࣒ࣃ࣏ࢣࣅࣄࢮࢨ࣓࣊ࣝ", (byte)64, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NloginunbanCommand.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private static void void_b() {
        int n;
        var_long_c = 2687217072971025117L;
        long l = var_long_c ^ 0x2A40CFC64E972F88L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(26 + 43), (byte)(25 + 58), (byte)(12 + 35), (byte)(51 + 16), (byte)(22 + 44), (byte)(24 + 43), (byte)(20 + 27), (byte)(28 + 52), (byte)(21 + 54), (byte)(18 + 49), (byte)(58 + 25), (byte)(43 + 10), 80, (byte)(10 + 87), (byte)(65 + 35), (byte)(23 + 77), (byte)(82 + 23), (byte)(81 + 29), (byte)(41 + 62)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
                    NloginunbanCommand.b[0] = NLoginCore_451.B("őŞšĴśťĴŀŚŗŦĵ", (byte)55, 66);
                    NloginunbanCommand.b[1] = NLoginCore_110.E("ՆՠԩԼՅկՁՇՅդԵԵկՄյԭսչ՝ՉՑջտՀ՟ՀէփՃռ՛Մն՘֏ջդիե՝֓իՍ՛", (byte)55, 69);
                    NloginunbanCommand.b[2] = NLoginCore_446.D("ҢґҟҖӇәӖҨґҘӒҵӚҳӋӚәӖҾҠәӀҭҮ", (byte)55, 68);
                    NloginunbanCommand.b[3] = NLoginCore_223.B("ŏĴŒœŋŅĿŋŤĮűōĲűĬŖĲōıŅŲŃŀŁ", (byte)55, 66);
                    NloginunbanCommand.b[4] = NLoginCore_387.A("ĘĴĠňĴĿŬĽĻŐŚĵ", (byte)55, 65);
                    NloginunbanCommand.b[5] = NLoginCore_223.D("ҾҒӒҾҭҠҪҮӅҶӑҘәӋӎҠӘӄҺӛүӉҾҨҺҩӁӅҦӱөӟӯҳӖӋӳӴҷӅӒӹӕҶӍӏӹӳӶӛһӏӀӶӍӎ", (byte)55, 68);
                    NloginunbanCommand.b[6] = NLoginCore_446.B("ĢŢĦŝŨħũņĺŚĻĭşţŐŕľŦņŴōţĻňĹœĶƀŝŵŃŶřƃƉŦżŖšƃŘŁźŕ", (byte)55, 66);
                    NloginunbanCommand.b[7] = NLoginCore_427.B("ĘĴĠňĴĿŬĽĻŐŚĵ", (byte)55, 66);
                    NloginunbanCommand.b[8] = NLoginCore_091.E("ԵՕԸԥՑՒհՂծԱ԰ՏղԶՆՄՈջԵռՠկՆՇ", (byte)55, 69);
                    NloginunbanCommand.b[9] = NLoginCore_138.C("ӁӅҧӎҰҴҹҰӇүӗҫӏӌҿӗӡӓҠӣӑҨҤҼӁӟӞӛҼҽӰһ", (byte)55, 67);
                    NloginunbanCommand.b[10] = NLoginCore_384.C("ӓӁү҈ҷӁҷҚҺӒӗҢ", (byte)55, 67);
                    NloginunbanCommand.b[11] = NLoginCore_384.C("ӑӌҠҡғӍӘҔӄқһӞӉүӖӜӒӎҝҵңҤқҡҵҦҩӌӠөәӓ", (byte)55, 67);
                    NloginunbanCommand.b[12] = NLoginCore_091.E("ԿԭԷըՋՁը԰ԴԬճբՇԵՊնչՅ՚ՕՔՠացսոս՝Ձ՝Ճգ", (byte)55, 69);
                    NloginunbanCommand.b[13] = NLoginCore_387.E("լ՚ՈԡՐ՚ՐԳՓիհԻ", (byte)55, 69);
                    NloginunbanCommand.b[14] = NLoginCore_451.C("ҩҪҐҞӇӑҲҖӛӍҽӑҾҰҵҲӝӤҤӥҢӁұҳҶҫҸӪҫҸҹӓ", (byte)55, 67);
                    continue block7;
                }
                case 1: {
                    NloginunbanCommand.b[0] = NLoginCore_027.D("ҟҜҿҳҲҔӐӗҶҹӛҢ", (byte)55, 68);
                    NloginunbanCommand.b[1] = NLoginCore_453.F("ՆՠԩԼՅկՁՇՅդԵԵկՄյԭսչ՝ՉՑջտՀ՟ՀէփՃռ՛Մոբքէէծւեյ֑ծ՛", (byte)55, 70);
                    NloginunbanCommand.b[2] = NLoginCore_559.A("ĵĤĲĩŚŬũĻĤīţŞĿŌĳšŶĿŴĵŤũŀŁ", (byte)55, 65);
                    NloginunbanCommand.b[3] = NLoginCore_076.A("ŏĴŒœŋŅĿŋŤĮŮŲşňıŏņŴūŲŷŃŀŁ", (byte)55, 65);
                    NloginunbanCommand.b[4] = NLoginCore_092.A("ŝŏőŃŨĩŃśŮŗŤŤĮŪŬŶšųřıŐŃŀŁ", (byte)55, 65);
                    NloginunbanCommand.b[5] = NLoginCore_091.F("՗ԫի՗ՆԹՃՇ՞ՏժԱղդէԹձ՝ՓմՈբ՗ՁՓՂ՚՞Կ֊ւոֈՌկդ֌֍Ր՞ի֒ծեՕծֈթ՜մ՗՜՞թզէ", (byte)55, 70);
                    NloginunbanCommand.b[6] = NLoginCore_201.B("ĢŢĦŝŨħũņĺŚĻĭşţŐŕľŦņŴōţĻňĹœĶƀŝŵŃŶļŇŧſļźŗţƎŏŠŕ", (byte)55, 66);
                    NloginunbanCommand.b[7] = NLoginCore_223.B("ŖĝũŗŊťĥŖŭŨūŁŏşşňůŌŎŌųũŀŁ", (byte)55, 66);
                    NloginunbanCommand.b[8] = NLoginCore_092.F("ԵՕԸԥՑՒհՂծԱԭԭեժՌԶոՓէՍըկՆՇ", (byte)55, 70);
                    NloginunbanCommand.b[9] = NLoginCore_092.B("ŔŘĺšŃŇŌŃŚłŪľŢşŒŪŴŦĳŶŤķĶŌŚŷŻůĻƀŽůŲťŰŶŕłƁƄŻţžŕ", (byte)55, 66);
                    NloginunbanCommand.b[10] = NLoginCore_091.C("ҜҎҭғҍӖҶҖӜҸұҢ", (byte)55, 67);
                    NloginunbanCommand.b[11] = NLoginCore_427.C("ӑӌҠҡғӍӘҔӄқһӞӉүӖӜӒӎҝҵңҟӉҺӠӚңӨӮҭҼӋ", (byte)55, 67);
                    NloginunbanCommand.b[12] = NLoginCore_138.B("ĹħıŢŅĻŢĪĮĦŭŜŁįńŰųĿŔŏŎťĺįŸůŲşŵőŸŵ", (byte)55, 66);
                    NloginunbanCommand.b[13] = NLoginCore_027.F("բՖՂ՘կԪլՄձԾծՐՏյնպ՜ԺՎկԺկՆՇ", (byte)55, 70);
                    NloginunbanCommand.b[14] = NLoginCore_091.F("ՂՃԩԷՠժՋԯմզՖժ՗ՉՎՋնսԽվԻՙՍծկօքևպՀԼ։ՊՖՉգջՍ֓ֆՑֆֈ՛", (byte)55, 70);
                    continue block7;
                }
                case 2: {
                    NloginunbanCommand.b[0] = NLoginCore_451.E("ՋՉՁԧձխՌբմԧՆՕՁխԱՐղՕ՞տըլժ՛՞ՔՒր՗՞շլ", (byte)55, 69);
                    continue block7;
                }
                case 4: {
                    NloginunbanCommand.b[0] = NLoginCore_138.E("ՙԺբ՛ԪՅՉ԰խՌճմէՇՉՈՔՑՕՔտղջԺբջՀՔճսՃը", (byte)55, 69);
                }
            }
        }
    }
}

