/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.SpawnType
 *  com.nickuc.login.api.nLoginAPI$nLoginInternal
 *  com.nickuc.login.api.types.Identity
 *  com.nickuc.login.api.types.Location
 *  javax.annotation.Nonnull
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.NLoginCore_100;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_473;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginType_006;
import com.nickuc.login.NLoginCore_085;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_013
extends NLoginType_006 {
    private static long h;
    private static int q;
    private static String[] d;
    private static long v;
    private static int ar;
    private static long t;
    private static long s;
    private static int af;
    private static int aq;
    private static int aa;
    private static long j;
    private static long aj;
    private static int u;
    private static String[] c;
    private static long ac;
    private static long ad;
    private static long e;
    private static int f;
    private static long ag;
    private static long w;
    private final NLoginCore_085 a = new NLoginCore_085(this);

    static {
        f = 0 >>> 110 | 0 << ~110 + 1;
        h = Long.reverse(-5423946641750332377L);
        j = Long.reverse(-8358680908399640576L);
        q = Integer.reverse(Integer.MIN_VALUE);
        s = Long.reverse(-5423946641750332377L);
        t = Long.reverse(-8358680908399640576L);
        u = Integer.reverse(0x40000000);
        v = Long.reverse(-5423946641750332377L);
        w = Long.reverse(-8358680908399640576L);
        aa = (384 >>> 71 | 384 << ~71 + 1) & 0xFFFFFFFF;
        ac = Long.reverse(-5423946641750332377L);
        ad = Long.reverse(-8358680908399640576L);
        af = Integer.reverse(0x20000000);
        ag = Long.reverse(-5423946641750332377L);
        aj = Long.reverse(-8358680908399640576L);
        aq = Integer.reverse(-1610612736);
        ar = 320 >>> 102 | 320 << ~102 + 1;
        c = new String[aq];
        d = new String[ar];
        NLoginType_013.b();
    }

    private static void b() {
        int n;
        e = -2002356350299775699L;
        long l = e ^ 0x50313AE6C99815BDL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(11 + 58), (byte)(74 + 9), (byte)(43 + 4), (byte)(62 + 5), (byte)(54 + 12), (byte)(39 + 28), (byte)(41 + 6), (byte)(64 + 16), (byte)(51 + 24), (byte)(40 + 27), 83, (byte)(44 + 9), (byte)(53 + 27), 97, (byte)(63 + 37), (byte)(55 + 45), (byte)(91 + 14), (byte)(87 + 23), (byte)(96 + 7)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
                    NLoginType_013.d[0] = NLoginCore_091.D("֋՜ՔռկՈձ՜կՍ֒ֈտՑնՙ֊֜՚ղմը֒֔պ՛կխւՠօփ", (byte)116, 68);
                    NLoginType_013.d[1] = NLoginCore_223.E("֗֡֗ս֋֍ւ֤գծ֎֣֨կֲֵ֣֚֮֕֔ն֎֛ց֐׃ֵֵַׁ֦֟֩֕ւ֛֝׊ֿ֑֯׉֘", (byte)116, 69);
                    NLoginType_013.d[2] = NLoginCore_446.D("չոևոՇ֍֎աբմՔ֒օհւևկկէս֖էՒ֑շՠՖհւզ֨ՠչւ֞պ֖֐֍֤֞֜ռչ", (byte)116, 68);
                    NLoginType_013.d[3] = NLoginCore_559.E("֦֘֗֗զ֭֬րց֓եվ֟լ֦րֆְֱֳ֥֜֔պַ֑րַֿׁׅ֦֯֝֒փֱּׁׂ֭֮֫֘", (byte)116, 69);
                    NLoginType_013.d[4] = NLoginCore_324.A("ƷǍƚƞǖƜƱǡǜƶǗƸǭǋƥǘǪƿǋǍǑǍƺƻ", (byte)116, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_013.d[0] = NLoginCore_138.C("֋՜ՔռկՈձ՜կՍ֒ֈտՑնՙ֊֜՚ղմժռտ֕՞ծ֧֚֝֔թ֣֓֩ֈջ֤֍֣֜վ֪չ", (byte)116, 67);
                    NLoginType_013.d[1] = NLoginCore_384.E("֗֡֗ս֋֍ւ֤գծ֎֣֨կֲֵ֣֚֮֕֔ն֎֛ց֐׃ֵֵֹ֦֟֩׈ֶ֚֨֕׈֨׀א֛֘", (byte)116, 69);
                    NLoginType_013.d[2] = NLoginCore_446.F("֦֘֗֗զ֭֬րց֓ճֱ֤֏֦֡֎֎ֆֵ֜ֆձְ֖տյ֏֡օׇտ֔։ַָ֌֦֮׋׆׊ׁ֘", (byte)116, 70);
                    NLoginType_013.d[3] = NLoginCore_091.B("ǏǎǝǎƝǣǤƷƸǊƜƵǖƣǝƷƽǪǓǜǨǋǧƱǮǈƷǦǔǮǼǉǜǿǴǴȀǣǎǀǤǽǪǤǙǪǜǆǈǬȍȈȎȃǚǛ", (byte)116, 66);
                    NLoginType_013.d[4] = NLoginCore_004.A("ƷǍƚƞǖƜƱǡǜƶǗǄǊǚƤƹǙǚƭƮǑƽƺƻ", (byte)116, 65);
                    continue block7;
                }
                case 2: {
                    NLoginType_013.d[0] = NLoginCore_110.E("պ֘ըվ֭ցր֦֜ւ֝ո", (byte)116, 69);
                    continue block7;
                }
                case 4: {
                    NLoginType_013.d[0] = NLoginCore_559.F("֛ճ֤֖շ֖֐֊պ֚և֎էֳֶ֦֕ւ֛֖֚֩փք", (byte)116, 70);
                }
            }
        }
    }

    public void requestLogin(@Nonnull Identity identity, @Nonnull Object object) {
        if (object == null) {
            throw new IllegalArgumentException((String)NLoginType_013.c("㺀", (int)q, (long)(s ^ t)));
        }
        if (identity == null) {
            throw new IllegalArgumentException((String)NLoginType_013.c("㺃", (int)u, (long)(v ^ w)));
        }
        if (!(identity instanceof NLoginCore_473)) {
            throw new IllegalArgumentException((String)NLoginType_013.c("㺆", (int)aa, (long)(ac ^ ad)) + NLoginCore_473.class.getCanonicalName() + (String)NLoginType_013.c("㺉", (int)af, (long)(ag ^ aj)) + identity.getClass().getCanonicalName());
        }
        String string = this.b(identity);
        NLoginCore_277 NLoginCore_277 = ((NLoginCore_100)((Object)this.a)).java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
        if (NLoginCore_277 != null) {
            ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_015_a().c(NLoginCore_277, ((NLoginType_008)((Object)this.a)).com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x31L;
        l ^= 0x50313AE6C99815BDL;
        if (c[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(34 + 35), (byte)(44 + 39), (byte)(32 + 15), (byte)(56 + 11), (byte)(25 + 41), (byte)(53 + 14), (byte)(44 + 3), (byte)(61 + 19), (byte)(33 + 42), (byte)(23 + 44), (byte)(38 + 45), (byte)(9 + 44), 80, (byte)(27 + 70), (byte)(50 + 50), 100, (byte)(25 + 80), (byte)(96 + 14), (byte)(60 + 43)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.D("жутЅхсмхѐпЌъючъѐВޢާޙނޱީޟދ޵ޠޮ޶", (byte)10, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_013.c[n] = new String(cipher.doFinal(Base64.getDecoder().decode(d[n])), StandardCharsets.UTF_8);
        }
        return c[n];
    }

    public Optional<Location> getSpawnLocation(@Nonnull SpawnType spawnType) {
        throw new UnsupportedOperationException((String)NLoginType_013.c("㺀", (int)f, (long)(h ^ j)));
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_013.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.F("ՉիխՍձ֐ֈ֞֊ՙ֗֍֛֕՞փ֥֤֢֜֜ձ", (byte)101, 70), NLoginType_013.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.B("ƬƹƸŻƻƷƲƻǆƵƂǀǄƽǀǆƈԘԝԏӸԧԟԕԁԫԖԤԬƠ", (byte)101, 66) + string + NLoginCore_575.A("ƃ", (byte)101, 65) + methodType.toString(), exception);
        }
    }

    public NLoginType_013(NLoginType_008 NLoginType_008) {
        super(NLoginType_008);
    }

    @Nonnull
    public nLoginAPI.nLoginInternal internal() {
        return this.a;
    }
}

