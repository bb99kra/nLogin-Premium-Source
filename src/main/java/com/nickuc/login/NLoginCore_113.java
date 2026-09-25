/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.bcrypt.BCrypt
 *  com.nickuc.login.lib.bcrypt.BCrypt$Result
 *  com.nickuc.login.lib.bcrypt.BCrypt$Version
 */
package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.NLoginCore_531;
import com.nickuc.login.MD5HashProvider;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_566;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_369;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginInterface_037;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_526;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_115;
import com.nickuc.login.NLoginCore_250;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_113
implements NLoginInterface_037 {
    private static int cz;
    private static long cq;
    private static long h;
    private static long bx;
    private static long ax;
    private static int cu;
    private static long ar;
    private static int cr;
    private static long y;
    private static int ai;
    private static long c;
    private static long bf;
    private static int av;
    private static long al;
    private static int bh;
    private static long ct;
    private static long z;
    private static long cj;
    private static int e;
    private static int dc;
    private static int t;
    private static int cm;
    private static int v;
    private static long ao;
    private static long m;
    private static int bc;
    private static int ce;
    private static long var_long_b;
    private static int as;
    private static long af;
    private static int cb;
    private static long bd;
    private static int ch;
    private static int k;
    private static long dd;
    private static long cf;
    private static int ac;
    private static int ah;
    private static long bm;
    private static long bg;
    public static final String var_java_lang_String_co;
    private static long aw;
    private static long df;
    private static int var_int_a;
    private static long d;
    private static int q;
    private static long l;
    private static long cs;
    private static int be;
    private static String[] var_java_lang_String_arr_a;
    private static long bv;
    private static long az;
    private static int p;
    private static int ae;
    private static int r;
    private static long cl;
    private static int bt;
    private static int g;
    private static int dv;
    private static int by;
    private static int dh;
    private static int ay;
    private static int u;
    private static long i;
    private static int bk;
    private static long dg;
    private static int dq;
    private static int cc;
    private static int bw;
    private static long bp;
    private static int bb;
    private static int ck;
    private static long var_long_co;
    private static long cg;
    private static int cx;
    private static long bs;
    private static long at;
    private static int x;
    private static long cfr_renamed_1;
    private static int ap;
    private static long ba;
    private static int dk;
    private static int du;
    private static long bj;
    private static long cd;
    private static int j;
    private static int de;
    private static int bl;
    private static int bq;
    private static int aj;
    private static long bu;
    private static long cn;
    private static long au;
    private static long da;
    private static int cv;
    private static int aa;
    private static long dl;
    private static int am;
    private static long dj;
    private static int aq;
    private static int n;
    private static int dt;
    private static int ds;
    private static int db;
    private static int ab;
    private static int ak;
    private static long bi;
    private static int s;
    private static long o;
    private static int dr;
    private static long an;
    private static int cp;
    private static int ci;
    private static long ca;
    private static int dn;
    private static int bn;
    public static final NLoginCore_531 S;
    private static long ad;
    private static long dp;
    private static long bz;
    private static long cw;
    private static String[] var_java_lang_String_arr_b;
    private static int f;
    private static long cy;
    private static long dw;
    private static long br;
    private static long ag;
    private static long bo;
    private static long di;
    private static int dm;
    private static long w;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_113.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.D("҅ҧҩ҉ҭӌӄӚӆҕӓӉӗӑҚҿӡӠӘӞӘҭ", (byte)56, 68), NLoginCore_113.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.A("ŒşŞġšŝŘšŬśĨŦŪţŦŬĮҺӀҳҗӅҫӆҚҼӏӎӓӒŇ", (byte)56, 65) + string + NLoginCore_223.D("җ", (byte)56, 68) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x58L;
        l ^= 0xA5F60970A91B6470L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(5 + 63), (byte)(54 + 15), (byte)(7 + 76), (byte)(31 + 16), (byte)(22 + 45), 66, (byte)(43 + 24), (byte)(12 + 35), (byte)(33 + 47), 75, (byte)(4 + 63), (byte)(23 + 60), (byte)(30 + 23), (byte)(44 + 36), (byte)(26 + 71), (byte)(29 + 71), (byte)(47 + 53), (byte)(28 + 77), (byte)(76 + 34), (byte)(16 + 87)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(42 + 41)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.F("֖֣֢եְ֥֥֡֜֟լְ֪֧֪֮ղࣾऄࣷࣛउ࣯ऊࣞऀओऒगख", (byte)119, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_113.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean boolean_i(String string, String string2) {
        if (string2.length() < ((String)NLoginCore_113.c("㺀", (int)var_int_a, (long)(var_long_b ^ d))).length() + e) {
            return f != 0;
        }
        try {
            byte[] byArray = Base64.getDecoder().decode(string2.substring(((String)NLoginCore_113.c("㺃", (int)g, (long)(h ^ i))).length() + j).getBytes(StandardCharsets.UTF_8));
            try (DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));){
                int n = Math.toIntExact(dataInputStream.readLong());
                NLoginCore_115 NLoginCore_1152 = NLoginCore_115.a(n);
                if (NLoginCore_1152 == null) {
                    NLoginCore_370.c((String)NLoginCore_113.c("㺆", (int)k, (long)(l ^ m)) + S.getName() + (String)NLoginCore_113.c("㺉", (int)NLoginCore_113.n, (long)o) + n, new Object[p]);
                    boolean bl = q;
                    return bl;
                }
                switch (NLoginCore_1152.ordinal()) {
                    case 6: {
                        String string3 = dataInputStream.readUTF();
                        String string4 = dataInputStream.readUTF();
                        int n2 = dataInputStream.readInt();
                        String string5 = string;
                        int n3 = r;
                        while (true) {
                            if (n3 >= n2) {
                                n3 = string4.equals(string5) ? 1 : 0;
                                return n3 != 0;
                            }
                            int n4 = dataInputStream.readInt();
                            string5 = NLoginCore_113.a(n4, string5, string3);
                            ++n3;
                        }
                    }
                    case 9: {
                        int n5 = dataInputStream.read();
                        byte[] byArray2 = NLoginCore_526.a(dataInputStream, s);
                        byte[] byArray3 = NLoginCore_526.a(dataInputStream, t);
                        BCrypt.Result result = BCrypt.verifyer((BCrypt.Version)BCrypt.Version.VERSION_BC).verify(NLoginCore_113.e(string), n5, byArray2, byArray3);
                        boolean bl = result.verified;
                        return bl;
                    }
                }
                NLoginCore_370.c((String)NLoginCore_113.c("㺌", (int)(u & v), (long)w) + S.getName() + (String)NLoginCore_113.c("㺏", (int)x, (long)(y ^ z)) + (Object)((Object)NLoginCore_1152), new Object[aa]);
                boolean bl = ab;
                return bl;
            }
        }
        catch (Exception exception) {
            NLoginCore_370.b((String)NLoginCore_113.c("㺒", (int)ac, (long)ad) + S.getName() + (String)NLoginCore_113.c("㺕", (int)ae, (long)(af ^ ag)), exception, new Object[ah]);
            return ai != 0;
        }
    }

    private static void b() {
        int n;
        c = -6817761056102140335L;
        long l = c ^ 0xA5F60970A91B6470L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(3 + 65), (byte)(48 + 21), (byte)(66 + 17), (byte)(34 + 13), (byte)(59 + 8), (byte)(39 + 27), (byte)(17 + 50), (byte)(15 + 32), (byte)(67 + 13), (byte)(7 + 68), (byte)(29 + 38), (byte)(71 + 12), (byte)(46 + 7), 80, (byte)(84 + 13), (byte)(12 + 88), 100, (byte)(11 + 94), (byte)(83 + 27), (byte)(57 + 46)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
                    NLoginCore_113.var_java_lang_String_arr_b[0] = NLoginCore_138.A("ćğĕöíĞÿôúĒģĀĝåĜĬģįčıİıøù", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[1] = NLoginCore_223.F("ԱՉԿԠԗՈԩԞԤԼՍԪՇԏՆՖՍՙԷ՛՚՛Ԣԣ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[2] = NLoginCore_427.A("ðĘĀíģĕÞßðăĦí", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[3] = NLoginCore_173.F("ՄԾԪՈՊԮԊԼՊԬԐԑԣՐԥՌՊՔՎԣՄԻԪԧ՘ՕաՏԱբԮՖՂՉդԵՀԤ՚ՁԪԣՆԱէԧգԶԴԫպԺծլկՓշՌպՔՙկդց", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[4] = NLoginCore_110.E("ԚՂԪԗՍԿԈԉԚԭՐԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[5] = NLoginCore_027.F("ՄԾԪՈՊԮԊԼՊԬԐԑԣՐԥՌՊՔՎԣՄԻԪԧ՘ՕաՏԱբԮՖՂՉդԵՀԤ՚ՁԪԣՈԯՔՑՖՃԳՑՌՋՅնՏԸՀտԽՑրղՖտ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[6] = NLoginCore_387.B("ðĘĀíģĕÞßðăĦí", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ПѠхѦѢТзоѧѡџшфхѭыбѥњгѳхлѨѮҀгмѝѾѤҀ҇куѹшїьѮѣѣѼҀҎѠґѷѯѧґѮѺѴѡѢ", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[8] = NLoginCore_559.B("ĊõøþöĝñøúĂĥĊćâĩíćĢçíĈıøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[9] = NLoginCore_575.A("ØÚÿĜğÞĞĆĄĄĒí", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[10] = NLoginCore_138.E("ԳԀԅԳԬԉԶԇՏՎՈԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[11] = NLoginCore_575.D("зѝйъѫѡѬщйЫйж", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[12] = NLoginCore_091.B("÷čĘþòóĥęăĨĀí", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[13] = NLoginCore_453.D("СсЩџѣЦыѝыыйж", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[14] = NLoginCore_004.E("ԁԱՋԔԂԥՇԚԈԎԢԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[15] = NLoginCore_384.E("ԇԴՋԗԔԠՆԈԚԨԏՅԾԏԡՒԡԳԪԫՆՋԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[16] = NLoginCore_173.D("оѦъѩлѧійѭмыѬџуьѭђѐѸѢюфст", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[17] = NLoginCore_324.C("есљШѡѢџѦяыЬЪлхщчтцѵкфѪст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[18] = NLoginCore_092.C("хЧљќифѧоЦрЫЬнхѪШѪѹѐѦуѪст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[19] = NLoginCore_201.E("ԃՀԿԉԞӿԤԗԽՃԲԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[20] = NLoginCore_076.F("ԨՁԞԾԽԘԈԫԢԏԮԗ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[21] = NLoginCore_427.E("ԘԺԸԆԭԌԽԨՋԊԏԯԋԟՐԢՓԘԯԒՅԵԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[22] = NLoginCore_027.E("ԒԔՈӽԨՄԘԯԘԟԏԑԋԨԒՏՒԩՉԗՉ՛Ԣԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[23] = NLoginCore_110.A("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļľİýĪŁĎĹŀğĲńĦĸĔļŌŅŃĉĚĻěĘę", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[24] = NLoginCore_110.A("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļĭÿĚĳĹđĚĿĞŅąĂĔěĦĠģĘČďĞŁĘę", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[25] = NLoginCore_027.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅уѤпѲ҄҂ѹўѠѮяѩҁѦѠѣѩѦѵѶѰѤѡѢ", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[26] = NLoginCore_223.F("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵՉՖԟԻ՜ԿԾԾԭԲզԺԴՀՃԽբ՛ՍզՋԺԥմՈեղ԰ՇԵՎ՗ջՂՃ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[27] = NLoginCore_453.C("ћХйлсфџЪЯЭкѭмѳрѓвтѪкјѪст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[28] = NLoginCore_201.A("ĒÜðòøûĖáæäñąĖêħäĊûıČăġøù", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[29] = NLoginCore_559.F("ԼԆԚԜԢԥՀԋԐԎԚԤՁՂԭԎԘԓՔԚՈՋԢԣ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[30] = NLoginCore_387.E("ԹՈԝԙՄՃՉԯԤ԰ԑԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[31] = NLoginCore_223.F("ԱԘԤԅԘԚԩՐԈԤԑԗ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[32] = NLoginCore_446.F("ӺՂԿԼԵՀԎԬԢԺԪԗ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[33] = NLoginCore_324.E("ԈԈԀԖԄԾԶԋԭԡԍԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[34] = NLoginCore_027.E("ԔԧԪӽԟԭՊՅԮԥԢԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[35] = NLoginCore_138.E("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵՆԼՊաԠԾԮդԻՒԟ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[36] = NLoginCore_324.F("ԵԃԙՉԇՍԯԯԹԧԪԗ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[37] = NLoginCore_201.D("ѥѦѧѕѬжчѩйуѧж", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[38] = NLoginCore_446.D("ѐѨўпжѧшнућѬщѦЮѥѵѬѸіѺѹѺст", (byte)19, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_113.var_java_lang_String_arr_b[0] = NLoginCore_027.A("ćğĕöíĞÿôúĒĥþĔċèĬćîĩČĦıøù", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ѐѨўпжѧшнућѬЮѰѫѨтуѪяушфст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[2] = NLoginCore_223.A("üĈÞïàôĢâòĜøí", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[3] = NLoginCore_138.A("ĚĔĀĞĠĄàĒĠĂæçùĦûĢĠĪĤùĚđĀýĮīķĥćĸĄĬĘğĺċĖúİėĀùĜćĽýĹČĊāŐĐńŋĥďœŘĤőœŇĒœ", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[4] = NLoginCore_559.E("ԐԤՅԤՈԼՎՐԩԮԲԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[5] = NLoginCore_110.D("ѣѝщѧѩэЩћѩыЯатѯфѫѩѳѭтѣњщцѷѴҀѮѐҁэѵѡѨ҃єџуѹѠщтѧюѳѰѵѢђѰѫѪѤҙҕҌҙѨҙҝҏҟңќ", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ĔüĉĕġĝđÝēėøí", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[7] = NLoginCore_384.B("ÖėüĝęÙîõĞĘĖÿûüĤĂèĜđêĪüòğĥķêóĔĵěķľñúİÿĎăĥĚĚĳłŃĕąĬĭĠĞĩİīĘę", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[8] = NLoginCore_092.B("ĊõøþöĝñøúĂĥúéĕāĝêĢĎĲİıøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[9] = NLoginCore_384.E("ԑԂԕԞԾԄԄԘԱՁԪԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[10] = NLoginCore_223.E("ԗԳԠԫԝԅԬՉԨԇԞԗ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[11] = NLoginCore_427.E("ԄԶԶԹԃԷԼԽԚՎՁԜՍԬՅԡԶԲ՚ՋՙԥԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[12] = NLoginCore_201.A("èÿĐúÜĄĞĥïģĈí", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[13] = NLoginCore_027.E("ԤԀԴԹՉԍԪԏԏԺԼԬԏՇՌՖԷԲԑՔՔՋԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ԑԖԇԞՅՎԜՉԽԇԊՐԥԯԣԲԶԢԻՇԪԵԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[15] = NLoginCore_027.C("ЦѓѪжгпѥЧйчЮѠЯгѣѨтѓсѩфѺст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[16] = NLoginCore_027.E("ԟՇԫՊԜՈԷԚՎԝԫԐ԰ՖԔՃԓԨԳԘԎԵԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[17] = NLoginCore_091.C("есљШѡѢџѦяыЬѢѢрѰѕпѦѶтѹєст", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[18] = NLoginCore_027.B("üÞĐēïûĞõÝ÷ßĩąĉĚģíøĮİāıøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[19] = NLoginCore_091.B("ÝęĝÜßėġěĐėýøæãĬĈĖÿčçěûøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[20] = NLoginCore_324.A("ěĚèĕčÙáĞĢďąæēĪěõďĈĢþĦċøù", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[21] = NLoginCore_324.E("ԘԺԸԆԭԌԽԨՋԊԏՐԜԳԈԕԷՑԤ՚ԩԵԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[22] = NLoginCore_091.F("ԒԔՈӽԨՄԘԯԘԟԐՁՉՓԟԟՂԭԴԑԼՋԢԣ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[23] = NLoginCore_091.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅҇ѹцѳҊї҂҉ѨѻҋѲћєҕ҃ѰѬѸ҂ҏҚѡѢ", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[24] = NLoginCore_384.C("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅ѶшѣѼ҂њѣ҈ѧҎяҌ҄Ѱѽ҉ҁѫѱҋѼѴѡѢ", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[25] = NLoginCore_223.B("ĜğüĔÛâČĤĝãûĤàğğþèĝīãċğĬõđĲĕĔĔăĈļúěöĩĻĹİĕėĥĆĠņĻņčĈĠĐĽĈīĘę", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[26] = NLoginCore_427.D("ѥѨхѝФЫѕѭѦЬфѭЩѨѨчбѦѴЬєѨѵоњѻўѝѝьё҅љѓџѢќҁѺѬ҅ѪћѨѫѽҌѩэѩѳ҇ѤѤѡѢ", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[27] = NLoginCore_076.B("ĒÜðòøûĖáæäóģėĂĈĘċùġęĜċøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[28] = NLoginCore_201.A("ĒÜðòøûĖáæäó÷ģÝĀûěćĎĉĊıøù", (byte)19, 65);
                    NLoginCore_113.var_java_lang_String_arr_b[29] = NLoginCore_387.F("ԼԆԚԜԢԥՀԋԐԎԛԭԴԽԟԤՈԢՒ՗ԎԵԢԣ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[30] = NLoginCore_027.E("ՂԛԃՆՀԦԇԅ԰ԙԱՈՄՆԢԫԡՅՂՖՔԥԢԣ", (byte)19, 69);
                    NLoginCore_113.var_java_lang_String_arr_b[31] = NLoginCore_091.B("ğėööõôÖĥħïâĝħĕğéĝýúċðûøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[32] = NLoginCore_451.B("ĖÑđĠÞĤôÞæĈâĂÜĘģĢċĢĆĠĞıøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[33] = NLoginCore_201.B("ÜßðõìãÖĂïĐùħğĥĄČĩîêąĎûøù", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[34] = NLoginCore_091.D("уѨЛХЦѧѥЩЮѮЩџрќѦђѶѣѱэїєст", (byte)19, 68);
                    NLoginCore_113.var_java_lang_String_arr_b[35] = NLoginCore_575.F("ՆՉԦԾԅԌԶՎՇԍԥՎԊՉՉԨԒՇՕԍԵԻԾԩՊ՗ԱԷ՟գՄԻՅ՗ՠգԾԩԠԬ԰ՠՠԷ", (byte)19, 70);
                    NLoginCore_113.var_java_lang_String_arr_b[36] = NLoginCore_324.C("ЧѥХмѥлуцљѣэж", (byte)19, 67);
                    NLoginCore_113.var_java_lang_String_arr_b[37] = NLoginCore_138.B("ĔëĎÿăĚăùġĜüí", (byte)19, 66);
                    NLoginCore_113.var_java_lang_String_arr_b[38] = NLoginCore_027.A("ćğĕöíĞÿôúĒģĄàĢâąĜěîĝăıøù", (byte)19, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_113.var_java_lang_String_arr_b[0] = NLoginCore_110.D("РѡкѧутіѥшьѡЪХђѝѴѶѕбѥэѪст", (byte)19, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_113.var_java_lang_String_arr_b[0] = NLoginCore_384.C("хлѪзУтппцЫѩаѐџаѣчфитѵѺст", (byte)19, 67);
                }
            }
        }
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-8472306774088726907L);
        d = Long.reverse(0x1A00000000000000L);
        e = (8192 >>> 45 | 8192 << -45) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = (0x200000 >>> 85 | 0x200000 << -85) & 0xFFFFFFFF;
        h = Long.reverse(-8472306774088726907L);
        i = Long.reverse(0x1A00000000000000L);
        j = 512 >>> 104 | 512 << -104;
        k = (0x10000000 >>> 27 | 0x10000000 << ~27 + 1) & 0xFFFFFFFF;
        l = Long.reverse(-8472306774088726907L);
        m = Long.reverse(0x1A00000000000000L);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(-8039961209861159291L);
        p = 0 >>> 224 | 0 << -224;
        q = Integer.reverse(0);
        r = 0 >>> 113 | 0 << -113;
        s = Integer.reverse(0x8000000);
        t = Integer.reverse(0x18000000);
        u = Integer.reverse(0x20000000);
        v = (-1 >>> 135 | -1 << ~135 + 1) & 0xFFFFFFFF;
        w = Long.reverse(-8039961209861159291L);
        x = Integer.reverse(-1610612736);
        y = Long.reverse(-8472306774088726907L);
        z = Long.reverse(0x1A00000000000000L);
        aa = Integer.reverse(0);
        ab = (0 >>> 79 | 0 << ~79 + 1) & 0xFFFFFFFF;
        ac = Integer.reverse(0x60000000);
        ad = Long.reverse(-8039961209861159291L);
        ae = 0xE000000 >>> 121 | 0xE000000 << -121;
        af = Long.reverse(-8472306774088726907L);
        ag = Long.reverse(0x1A00000000000000L);
        ah = 0 >>> 81 | 0 << -81;
        ai = 0 >>> 240 | 0 << ~240 + 1;
        aj = Integer.reverse(0x12000000);
        ak = (128 >>> 132 | 128 << ~132 + 1) & 0xFFFFFFFF;
        al = Long.reverse(-8039961209861159291L);
        am = Integer.reverse(-1879048192);
        an = Long.reverse(-8472306774088726907L);
        ao = Long.reverse(0x1A00000000000000L);
        ap = Integer.reverse(0x50000000);
        aq = Integer.reverse(-1);
        ar = Long.reverse(-8039961209861159291L);
        as = -1342177280 >>> 124 | -1342177280 << -124;
        at = Long.reverse(-8472306774088726907L);
        au = Long.reverse(0x1A00000000000000L);
        av = (192 >>> 68 | 192 << -68) & 0xFFFFFFFF;
        aw = Long.reverse(-8472306774088726907L);
        ax = Long.reverse(0x1A00000000000000L);
        ay = Integer.reverse(-1342177280);
        az = Long.reverse(-8472306774088726907L);
        ba = Long.reverse(0x1A00000000000000L);
        bb = 458752 >>> 15 | 458752 << ~15 + 1;
        bc = -1 >>> 30 | -1 << ~30 + 1;
        bd = Long.reverse(-8039961209861159291L);
        be = Integer.reverse(-268435456);
        bf = Long.reverse(-8472306774088726907L);
        bg = Long.reverse(0x1A00000000000000L);
        bh = Integer.reverse(0x8000000);
        bi = Long.reverse(-8472306774088726907L);
        bj = Long.reverse(0x1A00000000000000L);
        bk = Integer.reverse(-2013265920);
        bl = (-1 >>> 214 | -1 << ~214 + 1) & 0xFFFFFFFF;
        bm = Long.reverse(-8039961209861159291L);
        bn = (0x40000002 >>> 189 | 0x40000002 << -189) & 0xFFFFFFFF;
        bo = Long.reverse(-8472306774088726907L);
        bp = Long.reverse(0x1A00000000000000L);
        bq = Integer.reverse(-939524096);
        br = Long.reverse(-8472306774088726907L);
        bs = Long.reverse(0x1A00000000000000L);
        bt = (327680 >>> 238 | 327680 << -238) & 0xFFFFFFFF;
        bu = Long.reverse(-8472306774088726907L);
        bv = Long.reverse(0x1A00000000000000L);
        bw = (0x54000000 >>> 218 | 0x54000000 << ~218 + 1) & 0xFFFFFFFF;
        bx = Long.reverse(-8039961209861159291L);
        by = Integer.reverse(0x68000000);
        bz = Long.reverse(-8472306774088726907L);
        ca = Long.reverse(0x1A00000000000000L);
        cb = Integer.reverse(-402653184);
        cc = (-1 >>> 184 | -1 << -184) & 0xFFFFFFFF;
        cd = Long.reverse(-8039961209861159291L);
        ce = Integer.reverse(0x18000000);
        cf = Long.reverse(-8472306774088726907L);
        cg = Long.reverse(0x1A00000000000000L);
        ch = Integer.reverse(-1744830464);
        ci = Integer.reverse(-1);
        cj = Long.reverse(-8039961209861159291L);
        ck = Integer.reverse(0x58000000);
        cl = Long.reverse(-8039961209861159291L);
        cm = (1728 >>> 102 | 1728 << -102) & 0xFFFFFFFF;
        cn = Long.reverse(-8472306774088726907L);
        var_long_co = Long.reverse(0x1A00000000000000L);
        cp = (458752 >>> 14 | 458752 << -14) & 0xFFFFFFFF;
        cq = Long.reverse(-8039961209861159291L);
        cr = Integer.reverse(-1207959552);
        cs = Long.reverse(-8472306774088726907L);
        ct = Long.reverse(0x1A00000000000000L);
        cu = 245760 >>> 77 | 245760 << -77;
        cv = (-1 >>> 68 | -1 << ~68 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(-8039961209861159291L);
        cx = 0x3E00000 >>> 181 | 0x3E00000 << -181;
        cy = Long.reverse(-8039961209861159291L);
        cz = Integer.reverse(0x4000000);
        da = Long.reverse(-8039961209861159291L);
        db = -2147483632 >>> 63 | -2147483632 << ~63 + 1;
        dc = -1 >>> 175 | -1 << -175;
        dd = Long.reverse(-8039961209861159291L);
        de = 0x8800000 >>> 150 | 0x8800000 << ~150 + 1;
        df = Long.reverse(-8472306774088726907L);
        dg = Long.reverse(0x1A00000000000000L);
        dh = -2147483631 >>> 223 | -2147483631 << -223;
        di = Long.reverse(-8472306774088726907L);
        dj = Long.reverse(0x1A00000000000000L);
        dk = Integer.reverse(0x24000000);
        dl = Long.reverse(-8039961209861159291L);
        dm = (32768 >>> 175 | 32768 << ~175 + 1) & 0xFFFFFFFF;
        dn = 671088641 >>> 187 | 671088641 << ~187 + 1;
        cfr_renamed_1 = Long.reverse(-8472306774088726907L);
        dp = Long.reverse(0x1A00000000000000L);
        dq = Integer.reverse(Integer.MIN_VALUE);
        dr = Integer.reverse(0);
        ds = Integer.reverse(Integer.MIN_VALUE);
        dt = 2496 >>> 166 | 2496 << ~166 + 1;
        du = (-2147483629 >>> 223 | -2147483629 << -223) & 0xFFFFFFFF;
        dv = 19456 >>> 201 | 19456 << -201;
        dw = Long.reverse(-8039961209861159291L);
        var_java_lang_String_arr_a = new String[dt];
        var_java_lang_String_arr_b = new String[du];
        NLoginCore_113.b();
        var_java_lang_String_co = NLoginCore_113.c("㺀", (int)dv, (long)dw);
        S = NLoginCore_531.var_com_nickuc_login_NLoginCore_479_h;
    }

    private static byte[] e(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        if (byArray.length > aj) {
            byArray = MessageDigest.getInstance((String)NLoginCore_113.c("㺀", (int)ak, (long)al)).digest(byArray);
        }
        return byArray;
    }

    private static String a(int n, String string, String string2) {
        switch (n) {
            case 1: {
                return string;
            }
            case 2: {
                return string + string2;
            }
            case 3: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺀", (int)am, (long)(an ^ ao)));
            }
            case 4: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺃", (int)(ap & aq), (long)ar));
            }
            case 5: {
                return ((MD5HashProvider)NLoginCore_566.var_com_nickuc_login_NLoginCore_566_j.com_nickuc_login_NLoginInterface_009_a()).C(string);
            }
            case 6: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺆", (int)as, (long)(at ^ au)));
            }
            case 7: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺉", (int)av, (long)(aw ^ ax)));
            }
            case 8: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺌", (int)ay, (long)(az ^ ba)));
            }
            case 9: {
                return ((NLoginCore_369)NLoginCore_566.var_com_nickuc_login_NLoginCore_566_i.com_nickuc_login_NLoginInterface_009_a()).E(string);
            }
            case 10: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺏", (int)(bb & bc), (long)bd));
            }
            case 11: {
                return ((NLoginCore_250)NLoginCore_566.var_com_nickuc_login_NLoginCore_566_h.com_nickuc_login_NLoginInterface_009_a()).E(string);
            }
            case 12: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺒", (int)be, (long)(bf ^ bg)));
            }
            case 13: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺕", (int)bh, (long)(bi ^ bj)));
            }
            case 14: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺘", (int)(bk & bl), (long)bm));
            }
            case 15: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺛", (int)bn, (long)(bo ^ bp)));
            }
            case 16: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺞", (int)bq, (long)(br ^ bs)));
            }
            case 17: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺡", (int)bt, (long)(bu ^ bv)));
            }
            case 18: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺤", (int)bw, (long)bx));
            }
            case 19: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺧", (int)by, (long)(bz ^ ca)));
            }
            case 20: {
                throw new UnsupportedOperationException((String)NLoginCore_113.c("㺪", (int)(cb & cc), (long)cd));
            }
            case 21: {
                throw new UnsupportedOperationException((String)NLoginCore_113.c("㺭", (int)ce, (long)(cf ^ cg)));
            }
            case 22: {
                throw new UnsupportedOperationException((String)NLoginCore_113.c("㺰", (int)(ch & ci), (long)cj));
            }
            case 23: {
                throw new UnsupportedOperationException((String)NLoginCore_113.c("㺳", (int)ck, (long)cl));
            }
            case 24: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺶", (int)cm, (long)(cn ^ var_long_co)));
            }
            case 25: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺹", (int)cp, (long)cq));
            }
            case 26: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺼", (int)cr, (long)(cs ^ ct)));
            }
            case 27: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㺿", (int)(cu & cv), (long)cw));
            }
            case 28: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㻂", (int)cx, (long)cy));
            }
            case 29: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㻅", (int)cz, (long)da));
            }
            case 30: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㻈", (int)(db & dc), (long)dd));
            }
            case 31: {
                return NLoginCore_113.java_lang_String_i(string, (String)NLoginCore_113.c("㻋", (int)de, (long)(df ^ dg)));
            }
        }
        throw new UnsupportedOperationException((String)NLoginCore_113.c("㻎", (int)dh, (long)(di ^ dj)) + n);
    }

    private static String java_lang_String_i(String string, String string2) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(string2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        messageDigest.reset();
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
        byte[] byArray = messageDigest.digest();
        Object[] objectArray = new Object[dq];
        objectArray[NLoginCore_113.dr] = new BigInteger(ds, byArray);
        return String.format((String)NLoginCore_113.c("㺀", (int)dk, (long)dl) + (byArray.length << dm) + (String)NLoginCore_113.c("㺃", (int)dn, (long)(cfr_renamed_1 ^ dp)), objectArray);
    }
}

