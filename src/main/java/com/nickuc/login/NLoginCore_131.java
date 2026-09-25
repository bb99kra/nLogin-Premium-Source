/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Server
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_305;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_285;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_353;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_419;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_366;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class NLoginCore_131
extends NLoginCore_353 {
    private static long ad;
    private static long ds;
    private static int fe;
    private static int fo;
    private static int ai;
    private static long av;
    private static int dv;
    private static int cz;
    private static int fl;
    private static long ey;
    private static long dw;
    private static long dp;
    private static long cx;
    private static int fr;
    private static long cw;
    private static int dc;
    private static long au;
    private static long dh;
    private static int l;
    private static long eu;
    private static long cj;
    private static long bz;
    private static int ar;
    private static int bu;
    private static long g;
    private static int dm;
    private static long ax;
    private static String[] a;
    private static long p;
    private static int dy;
    private static int fh;
    private static long bb;
    private static int at;
    private static long v;
    private static int cl;
    private static long bn;
    private static long ef;
    private static long s;
    private static long fm;
    private static int dz;
    private static int fi;
    private static int cf;
    private static long em;
    private static int ew;
    private static int dn;
    private static int df;
    private static int co;
    private static int eh;
    private static long bx;
    private static int m;
    private static int cs;
    private static int eg;
    private static int ap;
    private static int ci;
    private static int i;
    private static int bc;
    private static int by;
    private static long da;
    private static int fk;
    private static long ej;
    private static long ay;
    private static long cq;
    private static long bi;
    private static int dj;
    private static long e;
    private static long ch;
    private static long fj;
    private static int f;
    private static long ee;
    private static int bg;
    private static int aw;
    private static long cd;
    private static int eo;
    private static long cm;
    private static int t;
    private static long as;
    private static long eq;
    private static long db;
    private static int w;
    private static int h;
    private static int fu;
    private static long ft;
    private static long br;
    private static int o;
    private static int bp;
    private static long r;
    private static int cb;
    private static long d;
    private static int ab;
    private static long ag;
    private static long ah;
    private static long fc;
    private static long ex;
    private static int ea;
    private static int bj;
    private static long fq;
    private static int cp;
    private static long ei;
    private static int bd;
    private static int k;
    private static long dt;
    private static long bo;
    private static long eb;
    private static long ce;
    private static long x;
    private static long cn;
    private static long cfr_renamed_1;
    private static long ak;
    private static int aa;
    private static long ck;
    private static long ca;
    private static long ba;
    private static int cy;
    private static int cr;
    private static long u;
    private static int z;
    private static int es;
    private static int aj;
    private static int bs;
    private static int fp;
    private static int bv;
    private static int ae;
    private static long bq;
    private static long var_long_c;
    private static int fb;
    private static int bk;
    private static int var_int_c;
    private static long fg;
    private static long en;
    private static long dl;
    private static int ed;
    private static int ec;
    private static int fd;
    private static int am;
    private static int dd;
    private static int ek;
    private static int dq;
    private static int fv;
    private static long ct;
    private static long y;
    private static long an;
    private static int du;
    private static long al;
    private static long be;
    private static int dk;
    private static int cv;
    private static int ez;
    private static int bw;
    private static int q;
    private static long bl;
    private static int cu;
    private static long dx;
    private static long bh;
    private static int dr;
    private static long bf;
    private static long ao;
    private static int aq;
    private static int ac;
    private static int ev;
    private static long de;
    private static int bt;
    private static int cc;
    private static int fs;
    private static int n;
    private static long et;
    private static long cg;
    private static int bm;
    private static int ep;
    private static long fn;
    private static int fa;
    private static int er;
    private static int el;
    private static String[] b;
    private static int az;
    private static long ff;
    private static int di;
    private static int dg;
    private static int j;
    private static int af;
    private static int fw;

    /*
     * Exception decompiling
     */
    @Override
    public void b(NLoginCore_494 var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private /* synthetic */ void a(NLoginCore_494 NLoginInterface_0422, Boolean bl, String string) {
        if (this.j()) {
            if (bl.booleanValue()) {
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺀", (int)cl, (long)(cm ^ cn)), new Object[co]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺃", (int)cp, (long)cq), new Object[cr]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺆", (int)cs, (long)ct), new Object[cu]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺉", (int)cv, (long)(cw ^ cx)), new Object[cy]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺌", (int)cz, (long)(da ^ db)), new Object[dc]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺏", (int)dd, (long)de), new Object[df]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺒", (int)dg, (long)dh), new Object[di]);
            } else {
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺕", (int)(dj & dk), (long)dl), new Object[dm]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺘", (int)dn, (long)(cfr_renamed_1 ^ dp)), new Object[dq]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺛", (int)dr, (long)(ds ^ dt)), new Object[du]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺞", (int)dv, (long)(dw ^ dx)) + string, new Object[dy]);
                NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺡", (int)(dz & ea), (long)eb), new Object[ec]);
            }
        } else if (bl.booleanValue()) {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺤", (int)ed, (long)(ee ^ ef)), new Object[eg]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺧", (int)eh, (long)(ei ^ ej)), new Object[ek]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺪", (int)el, (long)(em ^ en)), new Object[eo]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺭", (int)ep, (long)eq), new Object[er]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺰", (int)es, (long)(et ^ eu)), new Object[ev]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺳", (int)ew, (long)(ex ^ ey)), new Object[ez]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺶", (int)(fa & fb), (long)fc), new Object[fd]);
        } else {
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺹", (int)fe, (long)(ff ^ fg)), new Object[fh]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺼", (int)fi, (long)fj), new Object[fk]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㺿", (int)fl, (long)(fm ^ fn)), new Object[fo]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㻂", (int)fp, (long)fq) + string, new Object[fr]);
            NLoginCore_150.a(NLoginInterface_0422, (String)NLoginCore_131.c("㻅", (int)fs, (long)ft), new Object[fu]);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x13L;
        l ^= 0xD8047E9A005A1364L;
        if (a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(36 + 32), 69, (byte)(61 + 22), (byte)(11 + 36), (byte)(38 + 29), (byte)(23 + 43), (byte)(13 + 54), (byte)(30 + 17), (byte)(23 + 57), (byte)(17 + 58), (byte)(55 + 12), (byte)(77 + 6), (byte)(32 + 21), (byte)(2 + 78), (byte)(40 + 57), (byte)(44 + 56), (byte)(96 + 4), (byte)(102 + 3), 110, (byte)(76 + 27)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(5 + 63), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.B("ĦĳĲõĵıĬĵŀįüĺľķĺŀĂѧѨґҏҝҌѺғѿ", (byte)34, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_131.a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(b[n])), StandardCharsets.UTF_8);
        }
        return a[n];
    }

    private void a(NLoginCore_494 NLoginInterface_0422, String string, String string2, Consumer<Boolean> consumer) {
        if (!this.a.java_lang_Object_b().j(this.a.com_nickuc_login_NLoginCore_364_b().a() == NLoginCore_419.var_com_nickuc_login_NLoginCore_419_d ? string.toLowerCase(Locale.ENGLISH) : string)) {
            File file = new File(this.a.java_io_File_c().getParentFile(), string + (String)NLoginCore_131.c("㺀", (int)bp, (long)(bq ^ br)));
            NLoginCore_285 NLoginCore_2852 = NLoginCore_305.a().a(string2, file);
            consumer.accept((NLoginCore_2852.p() == bs && NLoginCore_2852.af() ? bt : bu) != 0);
        } else {
            NLoginCore_150.a(NLoginInterface_0422, (String)(this.j() ? NLoginCore_131.c("㺃", (int)(bv & bw), (long)bx) : NLoginCore_131.c("㺆", (int)by, (long)(bz ^ ca))), new Object[cb]);
        }
    }

    private /* synthetic */ void a(BiConsumer biConsumer, String string, Boolean bl) {
        if (bl.booleanValue()) {
            File file;
            Object object;
            PluginManager pluginManager = ((Server)this.a.java_lang_Object_b().c()).getPluginManager();
            Plugin plugin = pluginManager.getPlugin((String)NLoginCore_131.c("㺀", (int)cc, (long)(cd ^ ce)));
            if (plugin != null && !((String)NLoginCore_131.c("㺃", (int)cf, (long)(cg ^ ch))).equals(plugin.getDescription().getVersion()) && !((File)(object = NLoginCore_366.a(plugin.getClass()))).delete()) {
                ((File)object).deleteOnExit();
            }
            if ((object = pluginManager.getPlugin((String)NLoginCore_131.c("㺆", (int)ci, (long)(cj ^ ck)))) != null && !(file = NLoginCore_366.a(object.getClass())).delete()) {
                file.deleteOnExit();
            }
        }
        biConsumer.accept(bl, string);
    }

    private static void void_b() {
        int n;
        var_long_c = -7228547008600060294L;
        long l = var_long_c ^ 0xD8047E9A005A1364L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{68, (byte)(7 + 62), (byte)(63 + 20), (byte)(19 + 28), (byte)(26 + 41), (byte)(5 + 61), (byte)(8 + 59), (byte)(30 + 17), (byte)(21 + 59), (byte)(2 + 73), (byte)(32 + 35), 83, (byte)(19 + 34), (byte)(37 + 43), (byte)(59 + 38), (byte)(52 + 48), (byte)(97 + 3), (byte)(52 + 53), (byte)(95 + 15), (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(42 + 26), (byte)(13 + 56), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_131.b[0] = NLoginCore_453.B("ƫƳƊǄǈƬƽƲǏƚƸƥ", (byte)111, 66);
                    NLoginCore_131.b[1] = NLoginCore_027.B("ƌǄƱƺƳǕƬƮƾǐǊǞƿƯƻƜǏƳǀƩƴǩưƱ", (byte)111, 66);
                    NLoginCore_131.b[2] = NLoginCore_223.D("չԻկմշձ՘սքՠհճԿֈՖՖ՗ջ՘իծ՘ՕՖ", (byte)111, 68);
                    NLoginCore_131.b[3] = NLoginCore_223.F("֥֛կե՞ւ֪ռ֥֖֚֙ֈպռ֭կ֕ծծ֖֑վտ", (byte)111, 70);
                    NLoginCore_131.b[4] = NLoginCore_324.D("Բ՜ՏՉՐԹւՎինեՊ", (byte)111, 68);
                    NLoginCore_131.b[5] = NLoginCore_091.C("ԳԮՔՇԽ՘՝ՋվՏ՝Պ", (byte)111, 67);
                    NLoginCore_131.b[6] = NLoginCore_559.D("ՐխՌվՙլղփյ՘՝քեպՆ֊րևՖցՊըՕՖ", (byte)111, 68);
                    NLoginCore_131.b[7] = NLoginCore_446.D("ՙՔ՜ծծշԹմՀրփՊ", (byte)111, 68);
                    NLoginCore_131.b[8] = NLoginCore_091.A("ƫǔƔƘǌǜƕǑƼǟǕƫƔƸƶǁƯƢƲƢƪǢǔǤǆǰƾƭǎǎǆǏǍǮǵǐǘǣǆǻǴǸȀǕǚǭǾǒǚǙǿǖǟǉǭǽȄǬǘǣȊǐǠǲȔȑǤǋǌǓȅȉȑȟǛǥ", (byte)111, 65);
                    NLoginCore_131.b[9] = NLoginCore_091.A("ǏƯưƔƫƳƳƹǈǀƯƛǁǄƶƼǂǨơǅǁƧǙǛƠƿǠǄǤǧǂǦǳƶƷǏǔǍǶǪǞǳƼǬǼǜǞȅǏȀǝǘǝǢȅǄȀǘǥǢȂǴǳǞǡȐǴǹǖǛǳǓǲȑȞǥ", (byte)111, 65);
                    NLoginCore_131.b[10] = NLoginCore_384.F("֣֟ՠցշ֗֓քե֪քր֨֊֤֝֍֏֣ն֤ֆհ֌ֲֳֹ֛֑֬֨֯քֶփ֤և֡ׄ֔׃ֿ֟֙׏֊ְֲׇ֯֓֜֩֓אזֲֳׇָ֚׉י֠", (byte)111, 70);
                    NLoginCore_131.b[11] = NLoginCore_446.E("֞ՠև֜ձփ՜֛֍։֊ւ֮լջքօֶ֧֘֍֧վտ", (byte)111, 69);
                    NLoginCore_131.b[12] = NLoginCore_324.B("ƬƶǗƺƢưưǓǘǉƞƽǌǡǁơơǤǒǜƢƴǦǟǎǯǭǅǟƳǝǕǭǦǡǁƶǛǆǵƾǾǝǴǺǰǬǦǛǄǥǤǤǹǬǪǉǥǡȈȁǬǿȎȐȍȏǑǩǤǴȜȋǚȈȌǡȖǵȡȂǦȇȊȢǧȚȌȍȐǢǬȇȐȬǿȁȌȂȯȊȴȸȕǰȮȲȅ", (byte)111, 66);
                    NLoginCore_131.b[13] = NLoginCore_173.B("ǊǔƵƵƨƼƽǍƿƶǛǟƻƛǢǓƯǢǦƴǡǗǕƼƼǀǅǇǁǳƬǞƱǉǦǑǅǼƸƳƴǚǾǎǚǔǝǎƾǇȀǡǕǚǪǤǣǉȎǨǐȑǼȖǨȂǫȄȏȇȎǪȜȇǜǠǔǺǬǡǜǾȜȩȦǾȀȈǠȀȧȈȰȉȫȣ", (byte)111, 66);
                    NLoginCore_131.b[14] = NLoginCore_427.B("ƫǔƔƘǌǜƕǑƼǟǕƫƔƸƶǁƯƢƲƢƪǢǔǤǆǰƾƭǎǎǆǏǍǮǵǐǘǣǆǻǴǸǿǘǑǖǏǛǅǐǞǷǉȄȌȇȊǤǍȑǛǦȌǔ", (byte)111, 66);
                    NLoginCore_131.b[15] = NLoginCore_223.E("֝սվբչցցև֖֎սթ֏֒ք֊֐ֶկ֓֏յ֧֩ծ֍ֲֵ֮֒֐ִׁքօָׁ֢֛֝ׄ֬֌ցֽ֟ב׆ּ֋ֶ֧׉ַ֥׉ֱ׈׉ְי֘֠זיׁםׇּׄר֥כָנֳ", (byte)111, 69);
                    NLoginCore_131.b[16] = NLoginCore_575.D("պնԷ՘Վծժ՛Լց՛՗տաջմդզպՍջ՝Շգ֐֊փղտըֆ։՛֍՚ջ՞ո֛ի֚նկջ֑֗֩ց՝զէ֭֫փ։֤֦֟մկ֫մ֣ձ", (byte)111, 68);
                    NLoginCore_131.b[17] = NLoginCore_324.F("փ֣֙գ֨մե֬նտ֎ճ", (byte)111, 70);
                    NLoginCore_131.b[18] = NLoginCore_091.E("պ֛հյ֕֟պբ֚քնճ", (byte)111, 69);
                    NLoginCore_131.b[19] = NLoginCore_110.B("ǆƦǎǐǗƖǆưǞǏƘǒƵǏǟǂǙƸƹơǀǂǩǍǉƯƼǠǛǪǕǩǲǸǙǦǋǊǋǔǵƸǊǼǪǋǂǟǠǞǰȃǗǬǪȁȄǾǛȇǿǫǩǦȏȆȔȗȍǛȇǵǸǾǴǥ", (byte)111, 66);
                    NLoginCore_131.b[20] = NLoginCore_027.C("ՏխԵհՌԶՊսՐատռֈՠ՘ր՜ֆՠ՝֎՛և֏ֆՑփ֒Վժ֋֘֐Ֆյ՘֚֒ճխմ՞֖պր֛ձոգ֢֭րօբֲ֪ձվִքրմ֡ն֮֫ևֳ֛֖֣֚֮֜֫֘֟֘֡֡֋֠֙։֧֖֨֕", (byte)111, 67);
                    NLoginCore_131.b[21] = NLoginCore_092.B("ǑǖǃơǅƭƨƫǜưǁǠǝƭǓǝǀƴǣƼǖǙưƱ", (byte)111, 66);
                    NLoginCore_131.b[22] = NLoginCore_559.E("֌՝֑֟֙չ֚ցպնֆճ", (byte)111, 69);
                    NLoginCore_131.b[23] = NLoginCore_223.E("֢՗շկզ֙ժև֣֮֨֊֢լ֝֞րի֓փքַվտ", (byte)111, 69);
                    NLoginCore_131.b[24] = NLoginCore_427.D("ԳԮՔՇԽ՘՝ՋվՏ՝Պ", (byte)111, 68);
                    NLoginCore_131.b[25] = NLoginCore_575.D("եԼՋմտշձբԺճձ՚շՓպես՘ևորխռՍ՞Փ՞։ո֕ՖՑ։պՖ֝րն֗֕շլհ֏զձչ֫ֆ֩֨իր֦֑֬֯ռְ֢յֲ֕֗", (byte)111, 68);
                    NLoginCore_131.b[26] = NLoginCore_559.F("֘ռ֏֥֜֒վ֔֔տ֤֮֐լձ֋ռ֌֠խ֏ճլֱ֧֚֟֜־ֺֻ֫֓րׁ֤֠ֆ։ׇֻ֫׎ֳֽ֧֦֛֤֙֔זג֩ׄ֍ֱ֨ו׊ֺ׊סטט֜אחׂ֨ם׬זן׮֢֮׊֩׌ש׮ׅאֲק־ֿ", (byte)111, 70);
                    NLoginCore_131.b[27] = NLoginCore_427.E("՜՗սհզցֆմ֧ոֆճ", (byte)111, 69);
                    NLoginCore_131.b[28] = NLoginCore_091.B("ǍƢǍƹƧǕƽƩƶƱƾǁƜǛƷǗƴǣƦǨǙǈǄǉǏơƢǃǒƽƭǃǧǬǸǈǎƴǯǰǆǝǭǶȁǿǣǯǹǤǆȄǃȆǜǜȊǭǜǣȉǐǨȌ", (byte)111, 66);
                    NLoginCore_131.b[29] = NLoginCore_173.E("ՠպղհ֨ա֦ցգը֚ս֋ջ֥֪կ֌հնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖֌֤֛֐֤֮֏֋ֵ֞֓ח֞֟", (byte)111, 69);
                    NLoginCore_131.b[30] = NLoginCore_138.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
                    NLoginCore_131.b[31] = NLoginCore_091.E("՜՗սհզցֆմ֧ոֆճ", (byte)111, 69);
                    NLoginCore_131.b[32] = NLoginCore_091.C("ղնճԸ՛ԾԾՀՀհջշՑպՑ՚լֈ՜նՊբ֒հմ՞ըըկ֓՘գճ֎զլյՖհ֕ՙ֎֦՟֢։ևցօ֝ի֌֜ծ֐օջձֲ֮֠֩֯֋", (byte)111, 67);
                    NLoginCore_131.b[33] = NLoginCore_446.D("ջ՜ըՎլջշԺՎխ՝՛նՓջզսմշս՝խ֍կ֓եծՍրՏՓ֍՗֊եղսթ֕ՙ՟֍աևձ֦֗֊զ֛֪֛֬֬լձ֬֡֟մ֪օկչյքֺ֟ոָֺ֥֜֕֞֊", (byte)111, 68);
                    NLoginCore_131.b[34] = NLoginCore_092.D("ԲՆմյ՛Օկ՞Փ՗փՊ", (byte)111, 68);
                    NLoginCore_131.b[35] = NLoginCore_384.F("՜՗սհզցֆմ֧ոֆճ", (byte)111, 70);
                    NLoginCore_131.b[36] = NLoginCore_110.F("՜՗սհզցֆմ֧ոֆճ", (byte)111, 70);
                    NLoginCore_131.b[37] = NLoginCore_387.E("ծրոչ֓֜ֈնթ֕֍֢֥֨֩տִ֮֮խձ֣֒֍ֆ֏ֲ֓վּ֊ֱ֡տֹ֧׀ֵ֓׈ֈֺֿ֫֜֨֨֌֍ֲֿ֥֩֡֞֟", (byte)111, 69);
                    NLoginCore_131.b[38] = NLoginCore_027.A("ƠƲƪƫǅǎƺƨƛǇƽǔǠǣƵǓǙƱƱǖǜƳǠǇǬǨǆǆǍǅƿǬǣǷǀǺǂǙƺǗǇǈǯƼǞǱȁǑǥǔǀǇǃǧǵǨǖǷȉǋȃǽǐǩǨǯȒȍǖȍǱȎǰǬǮǯȝǭȗǲǦǝȒȆȠǳǰǱ", (byte)111, 65);
                    NLoginCore_131.b[39] = NLoginCore_004.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
                    NLoginCore_131.b[40] = NLoginCore_427.A("ǐǁƫǔƕǚǏƾƿǊƶƛƼƳǁơƷƦǟǅǋǫǍǙƺǟǟƺǊǅƿǵǥǖǹǤǕǬǌƻǳǚǿǡǭǮǻǦǜȈǜȆǳȂǬǺȁǁǪǨǿǐȔȈȀȂȂǱȉǒǩȗǹǜȀǥ", (byte)111, 65);
                    NLoginCore_131.b[41] = NLoginCore_384.C("ԷՑՉՇտԸս՘ԺԿձՔբՒռցՆգՇՍՊր՛աՠցՇ֗իձղՑռ֏՝ձ֚ժ՝՘ախգջղէօջզբյժ֌֮յն", (byte)111, 67);
                    NLoginCore_131.b[42] = NLoginCore_446.B("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 66);
                    NLoginCore_131.b[43] = NLoginCore_027.A("ƎƉƯƢƘƳƸƦǙƪƸƥ", (byte)111, 65);
                    NLoginCore_131.b[44] = NLoginCore_451.C("Րխվծ՟ծրԿՓյաՎ՚ե՟տ՘Ծյՙուց֏Ռյ֐կրժևՐՍ՘֌֚՗֏չմշ֔գ֛յ֤րգ՝ռ֢ի֤֭֩ֆ֨֫է֊֢֣֪֬", (byte)111, 67);
                    NLoginCore_131.b[45] = NLoginCore_223.D("ԶջնսԱցոշՏսշԸոՒՒջավֈ՗ժ֌սեՉըձւյ֌ոՐֈ֊Փյճ՞ս՜֕՚֓֏֏֝֔շ֛֪֗֌և֚֍֨ռ֠փֲ֣֑֗փֻ֪֮־ֻ֪֪֫֟֘ׄ֊", (byte)111, 68);
                    NLoginCore_131.b[46] = NLoginCore_223.F("՛կ֝֞քվ֘ևռր֬ճ", (byte)111, 70);
                    NLoginCore_131.b[47] = NLoginCore_092.E("՜՗սհզցֆմ֧ոֆճ", (byte)111, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_131.b[0] = NLoginCore_223.A("ƱǇǙǙƩƱƒƴǋƬƯƞƴƻƻƯƺǥǃƣǟǩưƱ", (byte)111, 65);
                    NLoginCore_131.b[1] = NLoginCore_384.A("ƌǄƱƺƳǕƬƮƾǐǋǔƼƻǝǔǘƹǈǥǝǫƵǕǬƼǊƮƤƭƾǅ", (byte)111, 65);
                    NLoginCore_131.b[2] = NLoginCore_223.F("֢դ֚֘֝֠ց֦֭։֛֬օւ֤֮֝֡կֆ֑֙վտ", (byte)111, 70);
                    NLoginCore_131.b[3] = NLoginCore_324.C("ռղՆԼԵՙցՓռխղՎտռյէջցՄՌգ֎ՕՖ", (byte)111, 67);
                    NLoginCore_131.b[4] = NLoginCore_387.E("֞֠ծճբ֡֨վ֌֦֤֮֡խըս֌֥փ֣֐ցվտ", (byte)111, 69);
                    NLoginCore_131.b[5] = NLoginCore_091.D("ՃԴղԽԶՠՋժչհկՊ", (byte)111, 68);
                    NLoginCore_131.b[6] = NLoginCore_004.A("ƫǈƧǙƴǇǍǞǐƳƸǛǐƾǖƝƯǀƵƶǖǃưƱ", (byte)111, 65);
                    NLoginCore_131.b[7] = NLoginCore_027.B("ƲƍǘǏƐƹƲƜƦǋƬƥ", (byte)111, 66);
                    NLoginCore_131.b[8] = NLoginCore_110.C("ՐչԹԽձցԺնաքպՐԹ՝՛զՔՇ՗ՇՏևչ։ի֕գՒճճիմղ֚֓յսֈի֥֠֙֝պտ֣֒շտվ֤ջքծ֢֑֒֩սֈ֯յօ֦֦֗֨֏սְ֟׀ֲ֥֮֊", (byte)111, 67);
                    NLoginCore_131.b[9] = NLoginCore_004.C("մՔՕԹՐ՘՘՞խեՔՀզթ՛աէ֍ՆժզՌվրՅդօթ։֌է֋֘՛՜մչղ֛֏փ֘ա֑֡ցփ֪մ֥ւսւև֪թ֥ս֊և֧֙֘փ֎։ռ֟־։ׂվֳֺׂ־֓־ׄ׊սօׄ֯ց֖֨֕", (byte)111, 67);
                    NLoginCore_131.b[10] = NLoginCore_201.E("֣֟ՠցշ֗֓քե֪քր֨֊֤֝֍֏֣ն֤ֆհ֌ֲֳֹ֛֑֬֨֯քֶփ֤և֡ׄ֔׃ֿ֟֙׏֊ְֲ֯֓֜֩֓זַֻּ֖֛֙֘׍֯אכֶ֭וֽנ֜׌יקנֳ", (byte)111, 69);
                    NLoginCore_131.b[11] = NLoginCore_201.A("ǐƒƹǎƣƵƎǍƿƻƿǒƿǕƻǄƴǕǅƟǒǩưƱ", (byte)111, 65);
                    NLoginCore_131.b[12] = NLoginCore_384.B("ƬƶǗƺƢưưǓǘǉƞƽǌǡǁơơǤǒǜƢƴǦǟǎǯǭǅǟƳǝǕǭǦǡǁƶǛǆǵƾǾǝǴǺǰǬǦǛǄǥǤǤǹǬǪǉǥǡȈȁǬǿȎȐȍȏǑǩǤǴȜȋǚȈȌǡȖǵȡȂǦȇȊȢǧȚȌȍȐǢǬȇȐȬǿǶȢȎǹȕȌǳȌȼȏȎȕȎȿȢȘȾȁȹȒȇȣȐȑ", (byte)111, 66);
                    NLoginCore_131.b[13] = NLoginCore_004.B("ǊǔƵƵƨƼƽǍƿƶǛǟƻƛǢǓƯǢǦƴǡǗǕƼƼǀǅǇǁǳƬǞƱǉǦǑǅǼƸƳƴǚǾǎǚǔǝǎƾǇȀǡǕǚǪǤǣǉȎǨǐȑǼȖǨȂǫȄȏȇȎǪȜȇǜǠǔǺǬǡǜǾȜȩȦǹȆȟȡȌȏǨǩȒȬȩ", (byte)111, 66);
                    NLoginCore_131.b[14] = NLoginCore_559.C("ՐչԹԽձցԺնաքպՐԹ՝՛զՔՇ՗ՇՏևչ։ի֕գՒճճիմղ֚֓յսֈի֤֠֙֝սնջմրժյփ֜ծ֥֮լֲ֥֭հְֲָּֽ֡֬֓֊ֵׂ֟֍ւր֊", (byte)111, 67);
                    NLoginCore_131.b[15] = NLoginCore_173.B("ǏƯưƔƫƳƳƹǈǀƯƛǁǄƶƼǂǨơǅǁƧǙǛƠƿǠǄǤǧǂǦǳƶƷǏǔǍǶǪǞǳƾƳǑǯȃǸǮƽǙǨǻǩǗǻǣǺǻǢȋǊǒȈǢǵǶǒǺǔȖǓȍȈȚǥ", (byte)111, 66);
                    NLoginCore_131.b[16] = NLoginCore_076.A("ǕǑƒƳƩǉǅƶƗǜƶƲǚƼǖǏƿǁǕƨǖƸƢƾǫǥǞǍǚǃǡǤƶǨƵǖƹǓǶǆǵǑǊǖǲǬȄǜƸǁǂȆȈǚȈǩǧǎȁǙǻȍǠǐ", (byte)111, 65);
                    NLoginCore_131.b[17] = NLoginCore_173.D("ռԲՌխոյԹկՋխ՗ՔէՔ֊զևա֍բՁ֎ՕՖ", (byte)111, 68);
                    NLoginCore_131.b[18] = NLoginCore_092.E("գ֎֤շռղմ֜֩զ֠ճ", (byte)111, 69);
                    NLoginCore_131.b[19] = NLoginCore_223.E("֔մ֥֜֞դ֔վ֬֝զ֠փ֭֝֐֧ֆևկ֎֐ַ֛֗ս֊ַָ֣֮֩׀׆ִ֧֢֙֘֙׃ֆ֘׊ָ֙֐֭֮֬־בָֺ֥׏ג׌֩ו׍ִִַֹ֭ןֺׁ֥׈ךׁ֦֧װ֬א֪דֳרש׈ׄק־ֿ", (byte)111, 69);
                    NLoginCore_131.b[20] = NLoginCore_091.C("ՏխԵհՌԶՊսՐատռֈՠ՘ր՜ֆՠ՝֎՛և֏ֆՑփ֒Վժ֋֘֐Ֆյ՘֚֒ճխմ՞֖պր֛ձոգ֢֭րօբֲ֪ձվִքրմ֡ն֮֫ևֱֳׇ֛֖֤֥֚֜֫֘֡׀ֺׅ֛֖֫֙֨֕", (byte)111, 67);
                    NLoginCore_131.b[21] = NLoginCore_223.E("֤֑֟կ֓ջնչ֪վ֗օջ֡֍֊ճհր֧֖ցվտ", (byte)111, 69);
                    NLoginCore_131.b[22] = NLoginCore_223.D("ՄսնԹԹՑլց՚ւփՊ", (byte)111, 68);
                    NLoginCore_131.b[23] = NLoginCore_201.D("չԮՎՆԽհՁ՞տպփճԹ՜սՅ՗ց՝ոքըՕՖ", (byte)111, 68);
                    NLoginCore_131.b[24] = NLoginCore_138.A("ǒƵǆƖƱǆƽǜǎǌƴƥ", (byte)111, 65);
                    NLoginCore_131.b[25] = NLoginCore_559.C("եԼՋմտշձբԺճձ՚շՓպես՘ևորխռՍ՞Փ՞։ո֕ՖՑ։պՖ֝րն֗֕շլհ֏զձչ֫ֆ֩֨իր֣֮ձ֥֢֔֨֐֎֗֓֋չָֽ֗֠֝֌ֶ׀֙֊", (byte)111, 67);
                    NLoginCore_131.b[26] = NLoginCore_092.C("կՓզճթռՕիիՖօջէՃՈբՓգշՄզՊՃֈձվնճ֑֕֒ւժ՗ջշ֘՝ՠւ֥֒֞վսհղ֊֔իջ֭֩ր֛դֈտָ֑֬֡֡֯֯ճ֧֮֙տִ׃ֶֹ֭ׄ֝׃ֲ׈֡׀ֻׁ֯և֌ׇּ֪֏ֱ֤חהַ", (byte)111, 67);
                    NLoginCore_131.b[27] = NLoginCore_451.F("ծֆ֎֗գե֜ր֭֗֬ճ", (byte)111, 70);
                    NLoginCore_131.b[28] = NLoginCore_027.E("֛հ֛ևյ֣֋շքտ֌֏ժ֩օ֥ւֱմֶ֧֖֒֗֝կհ֑֠֋ջֵֺ֑׆֖֜ւֽ־ֻ֔֫ׄ׏׍ֱֲׇֽ֔ג֑׉׉ֹֹֹֹֻֻׂ֥֓֡֠םיף֥גץט֪׎ֳ", (byte)111, 69);
                    NLoginCore_131.b[29] = NLoginCore_138.E("ՠպղհ֨ա֦ցգը֚ս֋ջ֥֪կ֌հնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖։֘ֆ׆׃ֵ֞׎ׇ֤֓֫֞֟", (byte)111, 69);
                    NLoginCore_131.b[30] = NLoginCore_138.C("ՙՍճռԵՍտ՜ճոկՊ", (byte)111, 67);
                    NLoginCore_131.b[31] = NLoginCore_223.B("ƶǇǈƦƧƭǋƷƳƘǀƥ", (byte)111, 66);
                    NLoginCore_131.b[32] = NLoginCore_201.F("֛֟֜աքէէթթ֤֙֠պ֣պփֱ֕օ֟ճ֋ֻ֙֝ևּ֑֑֘ց֌ַ֜֏֕֞տ֙־ւַ׏ֈ׋ְֲ֪֮׆ֵׅ֔חה֙ךּ׆א־ְֱֱׁ֙מֵ֣֠פך֥׫ֳ֥", (byte)111, 70);
                    NLoginCore_131.b[33] = NLoginCore_575.B("ǖƷǃƩǇǖǒƕƩǈƸƶǑƮǖǁǘǏǒǘƸǈǨǊǮǀǉƨǛƪƮǨƲǥǀǍǘǄǰƴƺǨƼǢǌǲȁǥǁǶȅȇǶȇǇǌȇǼǺǏȅǠǊǔȕǧȀǨǓȜșșǸȊǴǥ", (byte)111, 66);
                    NLoginCore_131.b[34] = NLoginCore_575.B("ƱǅǘǑƑǜǜƶƭǝƼƩƬǝƱơǑƶƷƻǂǙưƱ", (byte)111, 66);
                    NLoginCore_131.b[35] = NLoginCore_559.C("ձԷ՚հսՓժՐԼրաՊ", (byte)111, 67);
                    NLoginCore_131.b[36] = NLoginCore_453.E("՞֍մ֟֙դջփ֝ռ֘ճ", (byte)111, 69);
                    NLoginCore_131.b[37] = NLoginCore_004.A("ƠƲƪƫǅǎƺƨƛǇƿǚǔǗǛƱǦǠǠƟƣǕǄƿƸǁǅǤưǮƼǓǣƱǫǙǲǅǧǺƺǝǏǕǪǬǙǯǄǡǱȀǶǣǐǑ", (byte)111, 65);
                    NLoginCore_131.b[38] = NLoginCore_091.E("ծրոչ֓֜ֈնթ֕֋ֱ֢֮փ֧֡տտ֤֪ցֶֺ֛֮֕֔֔֓֍ֱֺׅ֎׈֐֧ֈֽ֥֖֕֊ֿ֬׏ֳ֢֟֎ֵ֑֕׃ֶ֤ׅח֙ב׋ֶַֽ֞נכ֤כֿל־ֺֹּ׎ׅ׌רש׉ןקײ׷־ֿ", (byte)111, 69);
                    NLoginCore_131.b[39] = NLoginCore_027.B("ǉƥǔƸǈƤǓƺǈƪƛƥ", (byte)111, 66);
                    NLoginCore_131.b[40] = NLoginCore_451.B("ǐǁƫǔƕǚǏƾƿǊƶƛƼƳǁơƷƦǟǅǋǫǍǙƺǟǟƺǊǅƿǵǥǖǹǤǕǬǌƻǳǚǿǡǭǮǻǦǜȈǜȆǳȂǬǺȁǁǪǨǿǐȔȈǑǥȘȕȒǒǲȘǬǹȒǥ", (byte)111, 66);
                    NLoginCore_131.b[41] = NLoginCore_446.F("ՠպղհ֨ա֦ցգը֚ս֋ջ֥֪կ֌հնճ֩ք֊։֪հ׀֛֚֔պָ֥ֆ֚׃֓ֆց֊֖֊ׇֻׁׂ֬׌ֱֱׅ֓ח֞֟", (byte)111, 70);
                    NLoginCore_131.b[42] = NLoginCore_451.C("ՃՙջՐը՗ՐԻսմՍՊ", (byte)111, 67);
                    NLoginCore_131.b[43] = NLoginCore_223.F("֜սձ֝էսՠմ֧֭֎ճ", (byte)111, 70);
                    NLoginCore_131.b[44] = NLoginCore_138.D("Րխվծ՟ծրԿՓյաՎ՚ե՟տ՘Ծյՙուց֏Ռյ֐կրժևՐՍ՘֌֚՗֏չմշ֔գ֛յ֤րգ՝ռ֢ի֤֭ւր֍ֵ֭֋֌֤օ֍", (byte)111, 68);
                    NLoginCore_131.b[45] = NLoginCore_223.B("ƑǖǑǘƌǜǓǒƪǘǒƓǓƭƭǖƼǙǣƲǅǧǘǀƤǃǌǝǐǧǓƫǣǥƮǐǎƹǘƷǰƵǮǪǪǸǯǒǶǲȅǧǢǵǨȃǗǻǞȍǾǬǲǞǕȀǊȊȅȏǧǥǳȋȀǥ", (byte)111, 66);
                    NLoginCore_131.b[46] = NLoginCore_092.B("ưƶƸǓƦƗƸƗǌǗǊƥ", (byte)111, 66);
                    NLoginCore_131.b[47] = NLoginCore_076.B("ƱƗǑƤǛǃƓǕǝƼǀƥ", (byte)111, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_131.b[0] = NLoginCore_091.E("խե֖բցմ֚֔վևջ֠ո֣խ֧փխ֎քֈ֑վտ", (byte)111, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_131.b[0] = NLoginCore_091.F("՟֝ձ֘֗է֖֛֛֝֟֎ռ֒դժֈ֬֒֋֣֧վտ", (byte)111, 70);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_131.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("ϩЋЍϭБаШоЪϹзЭлеϾУхфмтмБ", (byte)4, 68), NLoginCore_131.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.F("ԣ԰ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿࡤࡥࢎࢌ࢚ࢉࡷ࢐ࡼԔ", (byte)4, 70) + string + NLoginCore_110.D("ϻ", (byte)4, 68) + methodType.toString(), exception);
        }
    }

    public NLoginCore_131(NLoginType_008 NLoginType_008) {
        super(NLoginType_008, (String)NLoginCore_131.c("㺀", (int)var_int_c, (long)(d ^ e)), (String)NLoginCore_131.c("㺃", (int)f, (long)g), h != 0, i != 0, new String[j]);
    }

    private static /* synthetic */ void b(BiConsumer biConsumer, String string, Boolean bl) {
        biConsumer.accept(bl, string);
    }

    static {
        var_int_c = (0 >>> 96 | 0 << ~96 + 1) & 0xFFFFFFFF;
        d = Long.reverse(6805630023430632921L);
        e = Long.reverse(-4035225266123964416L);
        f = (262144 >>> 242 | 262144 << -242) & 0xFFFFFFFF;
        g = Long.reverse(-7605888784154954279L);
        h = 0 >>> 218 | 0 << -218;
        i = Integer.reverse(Integer.MIN_VALUE);
        j = (0 >>> 108 | 0 << ~108 + 1) & 0xFFFFFFFF;
        k = Integer.reverse(0x40000000);
        l = Integer.MIN_VALUE >>> 255 | Integer.MIN_VALUE << -255;
        m = (0 >>> 201 | 0 << ~201 + 1) & 0xFFFFFFFF;
        n = (0x400000 >>> 21 | 0x400000 << -21) & 0xFFFFFFFF;
        o = Integer.reverse(-1);
        p = Long.reverse(-7605888784154954279L);
        q = Integer.reverse(-1073741824);
        r = Long.reverse(6805630023430632921L);
        s = Long.reverse(-4035225266123964416L);
        t = Integer.reverse(0x20000000);
        u = Long.reverse(6805630023430632921L);
        v = Long.reverse(-4035225266123964416L);
        w = (0x50000000 >>> 188 | 0x50000000 << ~188 + 1) & 0xFFFFFFFF;
        x = Long.reverse(6805630023430632921L);
        y = Long.reverse(-4035225266123964416L);
        z = 0x200000 >>> 85 | 0x200000 << -85;
        aa = (-1 >>> 148 | -1 << ~148 + 1) & 0xFFFFFFFF;
        ab = 3 >>> 63 | 3 << ~63 + 1;
        ac = (-1 >>> 90 | -1 << ~90 + 1) & 0xFFFFFFFF;
        ad = Long.reverse(-7605888784154954279L);
        ae = (0 >>> 240 | 0 << ~240 + 1) & 0xFFFFFFFF;
        af = Integer.reverse(-536870912);
        ag = Long.reverse(6805630023430632921L);
        ah = Long.reverse(-4035225266123964416L);
        ai = (32 >>> 197 | 32 << -197) & 0xFFFFFFFF;
        aj = (0x100000 >>> 49 | 0x100000 << ~49 + 1) & 0xFFFFFFFF;
        ak = Long.reverse(6805630023430632921L);
        al = Long.reverse(-4035225266123964416L);
        am = Integer.reverse(-1879048192);
        an = Long.reverse(6805630023430632921L);
        ao = Long.reverse(-4035225266123964416L);
        ap = (0 >>> 171 | 0 << ~171 + 1) & 0xFFFFFFFF;
        aq = Integer.reverse(0x50000000);
        ar = (-1 >>> 152 | -1 << -152) & 0xFFFFFFFF;
        as = Long.reverse(-7605888784154954279L);
        at = Integer.reverse(-805306368);
        au = Long.reverse(6805630023430632921L);
        av = Long.reverse(-4035225266123964416L);
        aw = Integer.reverse(0x30000000);
        ax = Long.reverse(6805630023430632921L);
        ay = Long.reverse(-4035225266123964416L);
        az = (106496 >>> 173 | 106496 << -173) & 0xFFFFFFFF;
        ba = Long.reverse(6805630023430632921L);
        bb = Long.reverse(-4035225266123964416L);
        bc = 0 >>> 195 | 0 << -195;
        bd = (0x380000 >>> 82 | 0x380000 << -82) & 0xFFFFFFFF;
        be = Long.reverse(6805630023430632921L);
        bf = Long.reverse(-4035225266123964416L);
        bg = Integer.reverse(-268435456);
        bh = Long.reverse(6805630023430632921L);
        bi = Long.reverse(-4035225266123964416L);
        bj = (0 >>> 209 | 0 << ~209 + 1) & 0xFFFFFFFF;
        bk = (2 >>> 157 | 2 << -157) & 0xFFFFFFFF;
        bl = Long.reverse(-7605888784154954279L);
        bm = Integer.reverse(-2013265920);
        bn = Long.reverse(6805630023430632921L);
        bo = Long.reverse(-4035225266123964416L);
        bp = Integer.reverse(0x48000000);
        bq = Long.reverse(6805630023430632921L);
        br = Long.reverse(-4035225266123964416L);
        bs = Integer.reverse(0x13000000);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = Integer.reverse(0);
        bv = Integer.reverse(-939524096);
        bw = -1 >>> 55 | -1 << -55;
        bx = Long.reverse(-7605888784154954279L);
        by = Integer.reverse(0x28000000);
        bz = Long.reverse(6805630023430632921L);
        ca = Long.reverse(-4035225266123964416L);
        cb = 0 >>> 23 | 0 << ~23 + 1;
        cc = Integer.reverse(-1476395008);
        cd = Long.reverse(6805630023430632921L);
        ce = Long.reverse(-4035225266123964416L);
        cf = Integer.reverse(0x68000000);
        cg = Long.reverse(6805630023430632921L);
        ch = Long.reverse(-4035225266123964416L);
        ci = Integer.reverse(-402653184);
        cj = Long.reverse(6805630023430632921L);
        ck = Long.reverse(-4035225266123964416L);
        cl = Integer.reverse(0x18000000);
        cm = Long.reverse(6805630023430632921L);
        cn = Long.reverse(-4035225266123964416L);
        co = (0 >>> 224 | 0 << ~224 + 1) & 0xFFFFFFFF;
        cp = Integer.reverse(-1744830464);
        cq = Long.reverse(-7605888784154954279L);
        cr = Integer.reverse(0);
        cs = Integer.reverse(0x58000000);
        ct = Long.reverse(-7605888784154954279L);
        cu = 0 >>> 202 | 0 << ~202 + 1;
        cv = (0x6C000000 >>> 58 | 0x6C000000 << ~58 + 1) & 0xFFFFFFFF;
        cw = Long.reverse(6805630023430632921L);
        cx = Long.reverse(-4035225266123964416L);
        cy = Integer.reverse(0);
        cz = Integer.reverse(0x38000000);
        da = Long.reverse(6805630023430632921L);
        db = Long.reverse(-4035225266123964416L);
        dc = 0 >>> 108 | 0 << -108;
        dd = Integer.reverse(-1207959552);
        de = Long.reverse(-7605888784154954279L);
        df = 0 >>> 146 | 0 << -146;
        dg = (491520 >>> 78 | 491520 << ~78 + 1) & 0xFFFFFFFF;
        dh = Long.reverse(-7605888784154954279L);
        di = Integer.reverse(0);
        dj = Integer.reverse(-134217728);
        dk = (-1 >>> 54 | -1 << ~54 + 1) & 0xFFFFFFFF;
        dl = Long.reverse(-7605888784154954279L);
        dm = 0 >>> 234 | 0 << -234;
        dn = Integer.reverse(0x4000000);
        cfr_renamed_1 = Long.reverse(6805630023430632921L);
        dp = Long.reverse(-4035225266123964416L);
        dq = Integer.reverse(0);
        dr = 0x8000001 >>> 155 | 0x8000001 << -155;
        ds = Long.reverse(6805630023430632921L);
        dt = Long.reverse(-4035225266123964416L);
        du = Integer.reverse(0);
        dv = Integer.reverse(0x44000000);
        dw = Long.reverse(6805630023430632921L);
        dx = Long.reverse(-4035225266123964416L);
        dy = (0 >>> 63 | 0 << -63) & 0xFFFFFFFF;
        dz = Integer.reverse(-1006632960);
        ea = -1 >>> 36 | -1 << ~36 + 1;
        eb = Long.reverse(-7605888784154954279L);
        ec = Integer.reverse(0);
        ed = Integer.reverse(0x24000000);
        ee = Long.reverse(6805630023430632921L);
        ef = Long.reverse(-4035225266123964416L);
        eg = Integer.reverse(0);
        eh = 0x4A0000 >>> 17 | 0x4A0000 << ~17 + 1;
        ei = Long.reverse(6805630023430632921L);
        ej = Long.reverse(-4035225266123964416L);
        ek = (0 >>> 82 | 0 << -82) & 0xFFFFFFFF;
        el = (-1744830464 >>> 218 | -1744830464 << -218) & 0xFFFFFFFF;
        em = Long.reverse(6805630023430632921L);
        en = Long.reverse(-4035225266123964416L);
        eo = Integer.reverse(0);
        ep = -1677721600 >>> 90 | -1677721600 << ~90 + 1;
        eq = Long.reverse(-7605888784154954279L);
        er = (0 >>> 3 | 0 << -3) & 0xFFFFFFFF;
        es = Integer.reverse(0x14000000);
        et = Long.reverse(6805630023430632921L);
        eu = Long.reverse(-4035225266123964416L);
        ev = (0 >>> 194 | 0 << ~194 + 1) & 0xFFFFFFFF;
        ew = Integer.reverse(-1811939328);
        ex = Long.reverse(6805630023430632921L);
        ey = Long.reverse(-4035225266123964416L);
        ez = Integer.reverse(0);
        fa = 86016 >>> 11 | 86016 << ~11 + 1;
        fb = Integer.reverse(-1);
        fc = Long.reverse(-7605888784154954279L);
        fd = Integer.reverse(0);
        fe = Integer.reverse(-738197504);
        ff = Long.reverse(6805630023430632921L);
        fg = Long.reverse(-4035225266123964416L);
        fh = Integer.reverse(0);
        fi = Integer.reverse(0x34000000);
        fj = Long.reverse(-7605888784154954279L);
        fk = Integer.reverse(0);
        fl = Integer.reverse(-1275068416);
        fm = Long.reverse(6805630023430632921L);
        fn = Long.reverse(-4035225266123964416L);
        fo = Integer.reverse(0);
        fp = Integer.reverse(0x74000000);
        fq = Long.reverse(-7605888784154954279L);
        fr = Integer.reverse(0);
        fs = Integer.reverse(-201326592);
        ft = Long.reverse(-7605888784154954279L);
        fu = Integer.reverse(0);
        fv = (96 >>> 193 | 96 << ~193 + 1) & 0xFFFFFFFF;
        fw = Integer.reverse(0xC000000);
        a = new String[fv];
        b = new String[fw];
        NLoginCore_131.void_b();
    }
}

