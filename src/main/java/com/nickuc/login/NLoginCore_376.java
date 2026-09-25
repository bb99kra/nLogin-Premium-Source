/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_119;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_376
extends NLoginCore_353 {
    private static int x;
    private static long ar;
    private static long av;
    private static int j;
    private static int i;
    private static String[] b;
    private static int q;
    private static String[] a;
    private static long d;
    private static float ai;
    private static int m;
    private static long w;
    private static int h;
    private static long z;
    private static int ac;
    private static long az;
    private static int l;
    private static int ab;
    private static long p;
    private static int bc;
    private static int ao;
    private static int k;
    private static float aj;
    private static long am;
    private static int f;
    private static int ah;
    private static long as;
    private static int e;
    private static int r;
    private static long s;
    private static int y;
    private static int t;
    private static int ag;
    private static int ak;
    private static int ad;
    private static int ax;
    private static int ae;
    private static long var_long_c;
    private static int an;
    private static int u;
    private static int var_int_c;
    private static int ay;
    private static int at;
    private static int af;
    private static int al;
    private static int bb;
    private static int aa;
    private static long g;
    private static int ap;
    private static long o;
    private static int aq;
    private static int ba;
    private static int v;
    private static int au;
    private static long aw;
    private static int n;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_376.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ՒմնՖպ֑֧֙֓բ֖֤֠֞է֌֥֥֭֮֫պ", (byte)110, 70), NLoginCore_376.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.F("֍֚֙՜֧֖֜֘֓֜գ֥֧֡֞֡թࣵऄࣱࣽࣷࣟऄ࣢ࣵࣘँऄࣹࣧփ", (byte)110, 70) + string + NLoginCore_027.D("Թ", (byte)110, 68) + methodType.toString(), exception);
        }
    }

    static {
        var_int_c = Integer.reverse(0);
        d = Long.reverse(4994581671526523687L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = (-1 >>> 25 | -1 << ~25 + 1) & 0xFFFFFFFF;
        g = Long.reverse(4994581671526523687L);
        h = Integer.reverse(Integer.MIN_VALUE);
        i = Integer.reverse(0);
        j = Integer.reverse(0);
        k = Integer.reverse(0x40000000);
        l = (0x8000000 >>> 59 | 0x8000000 << ~59 + 1) & 0xFFFFFFFF;
        m = (0 >>> 194 | 0 << -194) & 0xFFFFFFFF;
        n = Integer.reverse(0x40000000);
        o = Long.reverse(8453346185347064615L);
        p = Long.reverse(0x3000000000000000L);
        q = Integer.reverse(-1073741824);
        r = Integer.reverse(-1);
        s = Long.reverse(4994581671526523687L);
        t = Integer.reverse(Integer.MIN_VALUE);
        u = Integer.reverse(0x20000000);
        v = (-1 >>> 242 | -1 << ~242 + 1) & 0xFFFFFFFF;
        w = Long.reverse(4994581671526523687L);
        x = 0 >>> 38 | 0 << -38;
        y = (81920 >>> 78 | 81920 << -78) & 0xFFFFFFFF;
        z = Long.reverse(4994581671526523687L);
        aa = Integer.reverse(-1073741824);
        ab = 0 >>> 173 | 0 << -173;
        ac = Integer.reverse(0);
        ad = 0x1000000 >>> 120 | 0x1000000 << ~120 + 1;
        ae = Integer.reverse(0x40000000);
        af = Integer.reverse(Integer.MIN_VALUE);
        ag = Integer.reverse(0);
        ah = Integer.reverse(0);
        ai = Float.intBitsToFloat(4288512 >>> 88 | 4288512 << ~88 + 1);
        aj = Float.intBitsToFloat(Integer.reverse(514));
        ak = (6 >>> 32 | 6 << -32) & 0xFFFFFFFF;
        al = -1 >>> 54 | -1 << ~54 + 1;
        am = Long.reverse(4994581671526523687L);
        an = Integer.reverse(0x40000000);
        ao = Integer.reverse(0);
        ap = Integer.reverse(Integer.MIN_VALUE);
        aq = 0x38000000 >>> 91 | 0x38000000 << -91;
        ar = Long.reverse(8453346185347064615L);
        as = Long.reverse(0x3000000000000000L);
        at = (0 >>> 14 | 0 << ~14 + 1) & 0xFFFFFFFF;
        au = Integer.reverse(0x10000000);
        av = Long.reverse(8453346185347064615L);
        aw = Long.reverse(0x3000000000000000L);
        ax = (524288 >>> 50 | 524288 << -50) & 0xFFFFFFFF;
        ay = Integer.reverse(-1879048192);
        az = Long.reverse(4994581671526523687L);
        ba = Integer.reverse(0);
        bb = (10 >>> 192 | 10 << -192) & 0xFFFFFFFF;
        bc = Integer.reverse(0x50000000);
        a = new String[bb];
        b = new String[bc];
        NLoginCore_376.void_b();
    }

    public NLoginCore_376(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_376.c("㺀", (int)var_int_c, (long)d), (String)NLoginCore_376.c("㺃", (int)(e & f), (long)g), h != 0, i != 0, new String[j]);
    }

    private static void void_b() {
        int n;
        var_long_c = -1961387205292586322L;
        long l = var_long_c ^ 0xE79948154970F07EL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), 69, (byte)(19 + 64), 47, (byte)(35 + 32), (byte)(40 + 26), (byte)(35 + 32), (byte)(36 + 11), (byte)(57 + 23), (byte)(50 + 25), (byte)(23 + 44), (byte)(58 + 25), (byte)(9 + 44), (byte)(53 + 27), (byte)(70 + 27), (byte)(30 + 70), (byte)(81 + 19), (byte)(64 + 41), (byte)(45 + 65), (byte)(100 + 3)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(28 + 41), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_376.b[0] = NLoginCore_201.D("ѱфѫћіџѿяйѽкш", (byte)25, 68);
                    NLoginCore_376.b[1] = NLoginCore_223.C("ѰдѼкѺѱѕёѻѺџ҄ѱѱѐѩёрѬѼэѼѓє", (byte)25, 67);
                    NLoginCore_376.b[2] = NLoginCore_004.A("ĢĢôúĊéĥĦĄĆđòĀĎčĔıİĥúīĽĄą", (byte)25, 65);
                    NLoginCore_376.b[3] = NLoginCore_446.F("ՈՏՉԊԒՍՑԍԏԮԸԝ", (byte)25, 70);
                    NLoginCore_376.b[4] = NLoginCore_091.F("ԙԟԡԟՋՀԤԱԐԒՈԙՆԹԖԴ԰ԮԺբԴՑԨԩ", (byte)25, 70);
                    NLoginCore_376.b[5] = NLoginCore_138.D("ыѲїѽжмѓѫлёҁҀфѥѸ҃ѺѵхѺѾюѠѐ҇ѭѢѩђэғѹѷѯғҚѱћҍѷҁѶқҙҝѯҝѿҨ҈ҬҍѨ҄ѯ҉ҍҠѽ҈ұғү҉ҹұҙҖһҭѽҺҎҺҹ҈", (byte)25, 68);
                    NLoginCore_376.b[6] = NLoginCore_324.B("ģøåãĠĚđĬıĳćġîħøĤĭĎļĶğĚĶŀĂīĔĽĔľİľĕĕăōŀļěčĪĤġĤĥďĪĘńŅĖĚřŜőķŀěřĜĝņĺĤĳũłĹľťŁňŮŪŠĬŇőŧőŻĹŇķŹŽńŅ", (byte)25, 66);
                    NLoginCore_376.b[7] = NLoginCore_004.B("ĕċĈĈĘĤìđĳįĀù", (byte)25, 66);
                    NLoginCore_376.b[8] = NLoginCore_027.C("ѲђуяьчеэјѝыњѵѦцћѴѽ҇ьѶѯњѿѿ҂ѡѲѐҗҘҍҏљёҕҚѾѶѵҔґњѨ", (byte)25, 67);
                    NLoginCore_376.b[9] = NLoginCore_091.B("èēħĝĞþèîðĎóù", (byte)25, 66);
                    continue block7;
                }
                case 1: {
                    NLoginCore_376.b[0] = NLoginCore_201.A("þġĊĂýĬįûúĤëćİİĴĤĭíøĪľĽĄą", (byte)25, 65);
                    NLoginCore_376.b[1] = NLoginCore_453.B("ġåĭëīĢĆĂĬīēĮąĔģòĈĹĊćõĽĄą", (byte)25, 66);
                    NLoginCore_376.b[2] = NLoginCore_110.D("ѱѱущљиѴѵѓѕѡѴѱ҃ѧрђѥєѴфҌѓє", (byte)25, 68);
                    NLoginCore_376.b[3] = NLoginCore_027.C("йуѳэжыюњмєѭҀѽю҆ћѣчѥ҅ҀҌѓє", (byte)25, 67);
                    NLoginCore_376.b[4] = NLoginCore_138.B("õûýûħĜĀčìîĥđĮĎêĔăûĴĐöćĄą", (byte)25, 66);
                    NLoginCore_376.b[5] = NLoginCore_427.C("ыѲїѽжмѓѫлёҁҀфѥѸ҃ѺѵхѺѾюѠѐ҇ѭѢѩђэғѹѷѯғҚѱћҍѷҁѶқҙҝѯҝѿҨ҈ҬҍѨ҄ѯ҉ҍҠѽ҈ұғү҉҉ұѹҖҖһҧҿӂҀғ҈", (byte)25, 67);
                    NLoginCore_376.b[6] = NLoginCore_453.E("ՇԜԉԇՄԾԵՐՕ՗ԫՅԒՋԜՈՑԲՠ՚ՃԾ՚դԦՏԸաԸբՔբԹԹԧձդՠԿԱՎՈՅՈՉԳՎԼըթԺԾսրյ՛դԿսՀՁժ՞Ո՗֍զ՝բ։ել֒֎օշ՗մչը՞ը֋Փսստ֕֘֜ց֞֩ճ֞լ", (byte)25, 69);
                    NLoginCore_376.b[7] = NLoginCore_446.D("ѩуѼѼѕйѬѠіѵѣш", (byte)25, 68);
                    NLoginCore_376.b[8] = NLoginCore_201.E("ՇԧԘԤԡԜԊԢԭԲԠԯՊԻԛ԰ՉՒ՜ԡՋՄԯՔՔ՗ԶՇԥլխբԮԨԢՂՎՈՍլԭիդԳՎճԴՉՏԺԼՖղՋՈՉ", (byte)25, 69);
                    NLoginCore_376.b[9] = NLoginCore_138.C("эшиєѭѕѼѯъѫкѹхҁ҆ѵѦ҅уѭѿіѓє", (byte)25, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_376.b[0] = NLoginCore_575.F("ԪԦԱԨԚԋՈԮՊՎԷՃԯՆԮԹԖ՗ԠՑ՘ԫԨԩ", (byte)25, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_376.b[0] = NLoginCore_201.E("ԿԜՇԫՓԿԍՏՐԱԕԪՔՓՕՕԐԟԜԼՙԫԨԩ", (byte)25, 69);
                }
            }
        }
    }

    private static String a(int n, long l) {
        l ^= 0xCL;
        l ^= 0xE79948154970F07EL;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(17 + 52), (byte)(18 + 65), (byte)(36 + 11), (byte)(19 + 48), (byte)(62 + 4), 67, (byte)(44 + 3), (byte)(57 + 23), (byte)(23 + 52), (byte)(53 + 14), 83, (byte)(46 + 7), (byte)(9 + 71), (byte)(91 + 6), (byte)(10 + 90), (byte)(92 + 8), (byte)(46 + 59), (byte)(45 + 65), (byte)(84 + 19)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԚԩԢԜԄԖԩԇԚӽԦԩԌԞ", (byte)104, 65));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_376.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    @Override
    public void b(NLoginCore_494 NLoginInterface_0422, String[] stringArray) {
        if (stringArray.length != k) {
            Object[] objectArray = new Object[l];
            objectArray[NLoginCore_376.m] = (String)NLoginCore_376.c("㺀", (int)n, (long)(o ^ p)) + this.e().toLowerCase(Locale.ENGLISH) + (String)NLoginCore_376.c("㺃", (int)(q & r), (long)s);
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.x, objectArray);
            return;
        }
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        String string = stringArray[t];
        if (((String)NLoginCore_376.c("㺆", (int)(u & v), (long)w)).equals(string)) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[x]);
            return;
        }
        Object[] objectArray = new Object[aa];
        objectArray[NLoginCore_376.ab] = NLoginCore_532.e.a(new Object[ac]);
        objectArray[NLoginCore_376.ad] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
        objectArray[NLoginCore_376.ae] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
        Object[] objectArray2 = new Object[af];
        objectArray2[NLoginCore_376.ag] = string;
        NLoginCore_218<Integer> NLoginCore_2182 = this.a.com_nickuc_login_NLoginCore_495_a().com_nickuc_login_NLoginCore_459_a().b(String.format((String)NLoginCore_376.c("㺉", (int)y, (long)z), objectArray), objectArray2);
        int n = NLoginCore_2182.d();
        if (n == 0) {
            NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.t, new Object[ah]);
            return;
        }
        NLoginCore_150.a(NLoginInterface_0422, NLoginCore_119.C, ai, aj);
        Object[] objectArray3 = new Object[an];
        objectArray3[NLoginCore_376.ao] = string;
        objectArray3[NLoginCore_376.ap] = n;
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_376.c("㺌", (int)(ak & al), (long)am), objectArray3);
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_376.c("㺏", (int)aq, (long)(ar ^ as)), new Object[at]);
        NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_376.c("㺒", (int)au, (long)(av ^ aw)) + NLoginCore_2702.a(TimeUnit.SECONDS, ax) + (String)NLoginCore_376.c("㺕", (int)ay, (long)az), new Object[ba]);
    }
}

