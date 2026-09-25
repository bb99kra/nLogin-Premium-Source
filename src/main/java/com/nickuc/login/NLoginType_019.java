/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.TwoFactorType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.lib.caffeine.cache.Cache
 *  com.nickuc.login.lib.caffeine.cache.Caffeine
 *  com.nickuc.login.lib.jda.api.JDA
 *  com.nickuc.login.lib.jda.api.entities.User
 *  com.nickuc.login.lib.jda.api.events.interaction.command.SlashCommandInteractionEvent
 *  com.nickuc.login.lib.jda.api.events.interaction.component.ButtonInteractionEvent
 *  com.nickuc.login.lib.jda.api.events.session.ReadyEvent
 *  com.nickuc.login.lib.jda.api.hooks.ListenerAdapter
 *  com.nickuc.login.lib.jda.api.interactions.commands.Command$Type
 *  com.nickuc.login.lib.jda.api.interactions.commands.OptionMapping
 *  com.nickuc.login.lib.jda.api.interactions.commands.SlashCommandInteraction
 *  javax.annotation.Nonnull
 *  lombok.Generated
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.lib.caffeine.cache.Cache;
import com.nickuc.login.lib.caffeine.cache.Caffeine;
import com.nickuc.login.lib.jda.api.JDA;
import com.nickuc.login.lib.jda.api.entities.User;
import com.nickuc.login.lib.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import com.nickuc.login.lib.jda.api.events.interaction.component.ButtonInteractionEvent;
import com.nickuc.login.lib.jda.api.events.session.ReadyEvent;
import com.nickuc.login.lib.jda.api.hooks.ListenerAdapter;
import com.nickuc.login.lib.jda.api.interactions.commands.Command;
import com.nickuc.login.lib.jda.api.interactions.commands.OptionMapping;
import com.nickuc.login.lib.jda.api.interactions.commands.SlashCommandInteraction;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_438;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_198;
import com.nickuc.login.NLoginCore_596;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_154;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_137;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_248;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_501;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_169;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginType_030;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_057;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_335;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginType_019
extends ListenerAdapter {
    private static int cd;
    private static int dr;
    private static long be;
    private static int ag;
    private static int dz;
    private static int z;
    private static long av;
    private static int co;
    private static long ct;
    private static long s;
    private static int dp;
    private static long t;
    private static int da;
    private static int by;
    private static long ah;
    private static long dx;
    private static int bn;
    private static long eg;
    private static int bp;
    private static int q;
    private static int bc;
    private static long f;
    private static int ds;
    private static long i;
    private static int ec;
    private static int y;
    private static long am;
    private static int k;
    private static int ax;
    private static int ad;
    private static long as;
    private static int bs;
    private static int u;
    private static long bb;
    private static int cz;
    private static String[] var_java_lang_String_arr_b;
    private static int n;
    private static int v;
    private static int dn;
    private static int cf;
    private static int e;
    private final NLoginCore_057 var_com_nickuc_login_NLoginCore_057_b;
    private static int bd;
    private static int ao;
    private static String[] var_java_lang_String_arr_a;
    private static int ck;
    private static int cu;
    private static int cq;
    private static long cw;
    private static long dl;
    private static int bv;
    private static long d;
    private static int ed;
    private static int bm;
    private static int dj;
    private static long af;
    private static int ce;
    private static int ba;
    private static int az;
    private static int dg;
    private static long bh;
    private static int cn;
    private static long aa;
    private static int ci;
    private static int var_int_a;
    private static long du;
    private static int bo;
    private static int al;
    private static int bu;
    private static int bj;
    private static long ab;
    private static int bi;
    private static int dm;
    private static int cc;
    private static int ch;
    private static long ea;
    private static long ak;
    private static int cr;
    private static long aj;
    private static int cp;
    private static int cb;
    private static int dd;
    private static int dh;
    private static int bg;
    private static long an;
    private static int br;
    private static int m;
    private static int cl;
    private static int bx;
    private static long c;
    private static int bl;
    private static int bk;
    private static int ai;
    private static int bz;
    private static int db;
    private static int au;
    private static int ap;
    private static int bq;
    private static long cj;
    private static int eb;
    private static long cfr_renamed_1;
    private static long w;
    private static int bw;
    private static int ef;
    private static int ar;
    private static int cv;
    private static long var_long_b;
    private static int cx;
    private static long dy;
    private static int ac;
    private static int r;
    private static int bf;
    private static int di;
    private static long x;
    private static long aq;
    private static int df;
    public static Cache<String, String> cfr_renamed_5;
    private static int dc;
    private static long o;
    private static int h;
    private static int cm;
    private static int cy;
    private static int ay;
    private static int dt;
    private static int dk;
    private static int ee;
    private static long g;
    private static int dq;
    private static int cs;
    private static int dw;
    private static int ca;
    private static long dv;
    private static long j;
    private final NLoginType_008 I;
    private static long at;
    private static int cg;
    private static int var_int_l;
    private static int ae;
    private static long p;
    private static int de;
    private static long aw;
    private static int bt;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginType_019.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_223.A("ãąćçċĪĢĸĤóıħĵįøĝĿľĶļĶċ", (byte)30, 65), NLoginType_019.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.C("ѲѿѾсҁѽѸҁҌѻш҆Ҋ҃҆Ҍюߘߜߝߜߤߗߠ߂Ѣ", (byte)30, 67) + string + NLoginCore_027.A("õ", (byte)30, 65) + methodType.toString(), exception);
        }
    }

    public void onReady(ReadyEvent readyEvent) {
        JDA jDA = readyEvent.getJDA();
        NLoginCore_370.b((String)NLoginType_019.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + jDA.getSelfUser().getAsTag() + (String)NLoginType_019.c("㺃", (int)e, (long)(f ^ g)) + readyEvent.getGuildTotalCount() + (String)NLoginType_019.c("㺆", (int)h, (long)(i ^ j)), new Object[k]);
        jDA.getGuilds().stream().filter(guild -> (!jDA.isUnavailable(guild.getIdLong()) ? ec : ed) != 0).forEach(guild -> NLoginCore_370.b((String)NLoginType_019.c("㺀", (int)dt, (long)(du ^ dv)) + guild.getName() + (String)NLoginType_019.c("㺃", (int)dw, (long)(dx ^ dy)) + guild.getId() + (String)NLoginType_019.c("㺆", (int)dz, (long)ea), new Object[eb]));
    }

    private static void b() {
        int n;
        c = 7790864766957273288L;
        long l = c ^ 0x8E1661E506D6B35DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(46 + 22), (byte)(53 + 16), (byte)(2 + 81), (byte)(41 + 6), (byte)(22 + 45), (byte)(53 + 13), (byte)(65 + 2), (byte)(39 + 8), (byte)(61 + 19), 75, (byte)(27 + 40), 83, (byte)(23 + 30), (byte)(23 + 57), (byte)(76 + 21), (byte)(65 + 35), (byte)(14 + 86), (byte)(29 + 76), (byte)(83 + 27), (byte)(88 + 15)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginType_019.var_java_lang_String_arr_b[0] = NLoginCore_446.F("ժԽժԽդեՐՁՕՉճՔՈԳՙչՓճՋԷմ՚փ՟խ՜՘ՙՀճՒ՞՗Յռծ՜ՠհ֍բ֖֔՛", (byte)55, 70);
                    NLoginType_019.var_java_lang_String_arr_b[1] = NLoginCore_091.A("ĞřŠŇĻĽīōśĻļĵ", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[2] = NLoginCore_092.E("ԬԿԷԭԧՉՃ՞լիԱԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[3] = NLoginCore_201.A("ıŔţĴĢŜĢťŮŎħĵ", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[4] = NLoginCore_387.D("ҋҴӑҭҡҲүҤӍӝӏҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[5] = NLoginCore_092.B("ŏŇőĦŖřĻĦŧīļĵ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[6] = NLoginCore_324.E("Ժ՜ԪԺԯ՚ՐՈճՀՊԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[7] = NLoginCore_110.E("թՋԮդՂՀՈ՛աՎԭԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[8] = NLoginCore_092.A("ŗŒĳŤţŖĤłĹŋĽŌĩĽţŬūŐŕŢŰŃŀŁ", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[9] = NLoginCore_027.D("ҋӆӍҴҨҪҘҺӈҨҩҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[10] = NLoginCore_384.A("ŔĲĶŔŨĹťĹŃŪĪŋļĿŌńŗūŃŶĹŃŎřķķŬſŝŰŸśƂŏņŦłŴŭƈŶŚłƆƅƐŽŶſƂƀŷƉŵƘŲŹśŒŚŭůŴƆƥŽƈƚŻƓƁƌƧŹƊƩƌƂżūƃƮƂƳƙźƶƾƈƖƮƌƝƛƃŻƯƗƑƄǉƦơƌƻƊǊƕ", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[11] = NLoginCore_138.E("ԥդԺԥաՑԲԫՊԲՆԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[12] = NLoginCore_027.E("ե՚ԤդՙՄ՛ԼԲԾՍբՄլԺԱՓՑոՔՀՉՆՇ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[13] = NLoginCore_091.F("ՖՉՍՎԻ՚԰ՑՏեխէԵդզզՊձչթ՗պԴԵջջԿֈչ։քբ՜ՅօֈՎկճզվսճճ֑ճքժ֕֋ռջ֑ՙ֒՝֠պվ֤՚վ֥ւ֧թ֩վ֡֝ֈ֐կձօ֔հֆւֶֶ֓֊ִ֞չ׃֚ջ֮ׄրք֤֔ւ", (byte)55, 70);
                    NLoginType_019.var_java_lang_String_arr_b[14] = NLoginCore_138.E("ՋբէՈՏլաԪթԽՎԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[15] = NLoginCore_091.D("ҊҵҵҬҖҐӖҙӌҭҥҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[16] = NLoginCore_091.A("šĞŦěŖņŗţŇĺħĵ", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[17] = NLoginCore_173.B("şĿőĢļœťģńķįĵ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[18] = NLoginCore_575.E("ԫԫՍԦՀՆՒՑԳԬՁԿԸէՅ՛զՍղԵ՘խ՘՚ծՄզՖեՒէռ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[19] = NLoginCore_027.E("՜ՎԷԬեխթգՍղՃզԯՉԹԲԻՎձՕցջՊջդ՟զՏՐաըւՇ՜՘գպրգղՊՔֈծի֎քն֌֖֌նճթզէ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[20] = NLoginCore_223.C("ҤӂҬҲӋҭӃҶӇӚҮӍӎҷҹҟҡҼӘӓһӣӧӡҵӢҟӊҼҰӃҿ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[21] = NLoginCore_027.F("խԦեՎԯՙլՁՍձդՍշՆՄՕմ՜մրճԷկԵռբ՜ճ՞Իֆ՚", (byte)55, 70);
                    NLoginType_019.var_java_lang_String_arr_b[22] = NLoginCore_453.C("ҜӒҧҿҧҶҦҐҫӅӋҢ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[23] = NLoginCore_384.D("ӌҾӃҌҍҹӉҕҕӆҹҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[24] = NLoginCore_384.A("ĦĹıħġŃĽŘŦťīĵ", (byte)55, 65);
                    continue block7;
                }
                case 1: {
                    NLoginType_019.var_java_lang_String_arr_b[0] = NLoginCore_091.C("ӑҤӑҤӋӌҷҨҼҰӚһүҚӀӠҺӚҲҞӛӁӪӆӔӃҿӀҧӚҹӅӀӄҭӯүӊӺӋӹҷӻӱҷӡҾԂӏӓӘӠӼӶӍӎ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[1] = NLoginCore_324.F("Ձԟբ՜Յ՚ՎհթէհԻ", (byte)55, 70);
                    NLoginType_019.var_java_lang_String_arr_b[2] = NLoginCore_384.E("՟ՠգՃԧլԻըԼիԭԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[3] = NLoginCore_387.B("ĹœŨġŃĳŃšŎŤňĵ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[4] = NLoginCore_027.F("ՕգՎԮԽղ՛ԲՈզէաՆՌՙ՗ովմթցՉՆՇ", (byte)55, 70);
                    NLoginType_019.var_java_lang_String_arr_b[5] = NLoginCore_324.D("Ґҡӎ҈ҩҠҘӃҮӈҹҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[6] = NLoginCore_427.E("ԻԥՌ՟կ՞ՈՆՄԫկդՏՌԹԶզսՓժՀկՆՇ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[7] = NLoginCore_076.D("ҫӓ҇ҦҿӋҮүҰҒӗҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[8] = NLoginCore_223.D("ӄҿҠӑӐӃґүҦҸҬҕҙҿҲӕҢӍүҰҤӀҭҮ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[9] = NLoginCore_446.E("՚Չ՞՗ԹըԪՃըԽլԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[10] = NLoginCore_451.C("ӁҟңӁӕҦӒҦҰӗҗҸҩҬҹұӄӘҰӣҦҰһӆҤҤәӬӊӝӥӈӯҼҳӓүӡӚӵӣӇүӳӲӽӪӣӬӯӭӤӶӢԅӟӦӈҿӇӚӜӡӳԒӪӵԇӨԀӮӹԔӦӷԖӹӯөӘӰԛӯԠԆӧԣԫӵԃԛӹԊԈӰӨԧԁӵԪԈԠԇԋԲԆԫԂ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[11] = NLoginCore_027.D("ҎҴҫӆӕҰӌґҪҷҘҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[12] = NLoginCore_427.E("ե՚ԤդՙՄ՛ԼԲԾՊԭեՇշշզթլժկՉՆՇ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[13] = NLoginCore_091.E("ՖՉՍՎԻ՚԰ՑՏեխէԵդզզՊձչթ՗պԴԵջջԿֈչ։քբ՜ՅօֈՎկճզվսճճ֑ճքժ֕֋ռջ֑ՙ֒՝֠պվ֤՚վ֥ւ֧թ֩վ֡֝ֈ֐կձօ֔հֆւֶֶ֓֊ִ֞որׄ֎֎֒֓֔׆ֹ֓", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[14] = NLoginCore_201.E("ՁՆՇԫԾթբՐխհԱԻ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[15] = NLoginCore_223.D("ҭӎӍҩҤҐҡҢҪӍҘҢ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[16] = NLoginCore_201.B("ĤśŠĶœŗŞŧŭŘĩŃŮųťŰšłńŐŐũŀŁ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[17] = NLoginCore_110.B("řĵŔŒşţśōŝŤįĵ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[18] = NLoginCore_384.C("ҒҒҴҍҧҭҹҸҚғҨҦҟӎҬӂӍҴәҜҿӐҢҡҷһҭӭҨөұӥ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[19] = NLoginCore_453.D("ӃҵҞғӌӔӐӊҴәҪӍҖҰҠҙҢҵӘҼӨӢұӢӋӆӍҶҷӈӏөҮӃҿӊӡӧӊәұһӰҷӏӻӐӊӀҽһӺӦӶӍӎ", (byte)55, 68);
                    NLoginType_019.var_java_lang_String_arr_b[20] = NLoginCore_092.A("ķŕĿŅŞŀŖŉŚŭŁŠšŊŌĲĴŏūŦŎŵųŚŘŋőŴōĹŔź", (byte)55, 65);
                    NLoginType_019.var_java_lang_String_arr_b[21] = NLoginCore_027.C("ӔҍӌҵҖӀӓҨҴӘӋҴӞҭҫҼӛӃӛӧӚӦӅӊӂӍӘӝӂҹӍӯ", (byte)55, 67);
                    NLoginType_019.var_java_lang_String_arr_b[22] = NLoginCore_453.E("ՉիկՠԿՍՠՓգա՞ՖԲծղՙԵՆէջխՙՆՇ", (byte)55, 69);
                    NLoginType_019.var_java_lang_String_arr_b[23] = NLoginCore_138.B("ŝľĦĥĸŪŠţřŦńĵ", (byte)55, 66);
                    NLoginType_019.var_java_lang_String_arr_b[24] = NLoginCore_453.D("ҥҋҩӏӘҩәӅӉӜҹҢ", (byte)55, 68);
                    continue block7;
                }
                case 2: {
                    NLoginType_019.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ӓӈӊҔҤұүӏұҗҜӈҽӍӑӣҴҰӠӔӓӦҭҮ", (byte)55, 67);
                    continue block7;
                }
                case 4: {
                    NLoginType_019.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ӎӕҌӋӎӃҵҲҕӖҘҦӠӛӑҠӤҚӅӡӔҸӘҸӀӝӡӭӄӟӰӓ", (byte)55, 67);
                }
            }
        }
    }

    @Generated
    public NLoginType_019(NLoginType_008 NLoginType_008, NLoginCore_057 NLoginCore_0572) {
        this.I = NLoginType_008;
        this.var_com_nickuc_login_NLoginCore_057_b = NLoginCore_0572;
    }

    private static String a(int n, long l) {
        l ^= 0x77L;
        l ^= 0x8E1661E506D6B35DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(12 + 56), (byte)(47 + 22), (byte)(62 + 21), (byte)(4 + 43), (byte)(5 + 62), (byte)(9 + 57), (byte)(65 + 2), (byte)(32 + 15), (byte)(31 + 49), (byte)(17 + 58), (byte)(66 + 1), 83, (byte)(26 + 27), (byte)(45 + 35), (byte)(63 + 34), (byte)(56 + 44), (byte)(24 + 76), (byte)(99 + 6), (byte)(69 + 41), (byte)(61 + 42)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(24 + 45), (byte)(81 + 2)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ҽӊӉҌӌӈӃӌӗӆғӑӕӎӑӗҙࠣࠧࠨࠧ࠯ࠢࠫࠍ", (byte)55, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginType_019.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = (0 >>> 28 | 0 << -28) & 0xFFFFFFFF;
        var_long_b = Long.reverse(1369685765397510198L);
        d = Long.reverse(-1297036692682702848L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(1369685765397510198L);
        g = Long.reverse(-1297036692682702848L);
        h = 128 >>> 38 | 128 << ~38 + 1;
        i = Long.reverse(1369685765397510198L);
        j = Long.reverse(-1297036692682702848L);
        k = Integer.reverse(0);
        var_int_l = Integer.reverse(0);
        m = Integer.reverse(-1);
        n = (49152 >>> 174 | 49152 << ~174 + 1) & 0xFFFFFFFF;
        o = Long.reverse(1369685765397510198L);
        p = Long.reverse(-1297036692682702848L);
        q = Integer.reverse(0);
        r = 0x10000000 >>> 90 | 0x10000000 << ~90 + 1;
        s = Long.reverse(1369685765397510198L);
        t = Long.reverse(-1297036692682702848L);
        u = (0x400000 >>> 246 | 0x400000 << ~246 + 1) & 0xFFFFFFFF;
        v = (5 >>> 160 | 5 << ~160 + 1) & 0xFFFFFFFF;
        w = Long.reverse(1369685765397510198L);
        x = Long.reverse(-1297036692682702848L);
        y = 0x40000000 >>> 254 | 0x40000000 << -254;
        z = Integer.reverse(0x60000000);
        aa = Long.reverse(-215581303436904394L);
        ab = Long.reverse(456833887201394688L);
        ac = 4 >>> 34 | 4 << -34;
        ad = Integer.reverse(0);
        ae = (229376 >>> 79 | 229376 << -79) & 0xFFFFFFFF;
        af = Long.reverse(-215581303436904394L);
        ag = Integer.reverse(0x10000000);
        ah = Long.reverse(-215581303436904394L);
        ai = Integer.reverse(-1879048192);
        aj = Long.reverse(1369685765397510198L);
        ak = Long.reverse(-1297036692682702848L);
        al = Integer.reverse(0x50000000);
        am = Long.reverse(1369685765397510198L);
        an = Long.reverse(-1297036692682702848L);
        ao = 5632 >>> 137 | 5632 << ~137 + 1;
        ap = (-1 >>> 182 | -1 << ~182 + 1) & 0xFFFFFFFF;
        aq = Long.reverse(-215581303436904394L);
        ar = Integer.reverse(0x30000000);
        as = Long.reverse(1369685765397510198L);
        at = Long.reverse(-1297036692682702848L);
        au = (104 >>> 35 | 104 << ~35 + 1) & 0xFFFFFFFF;
        av = Long.reverse(1369685765397510198L);
        aw = Long.reverse(-1297036692682702848L);
        ax = Integer.reverse(0);
        ay = 0x20000000 >>> 189 | 0x20000000 << ~189 + 1;
        az = 7168 >>> 201 | 7168 << ~201 + 1;
        ba = -1 >>> 111 | -1 << ~111 + 1;
        bb = Long.reverse(-215581303436904394L);
        bc = (0 >>> 186 | 0 << -186) & 0xFFFFFFFF;
        bd = Integer.reverse(-268435456);
        be = Long.reverse(-215581303436904394L);
        bf = 0x400000 >>> 146 | 0x400000 << -146;
        bg = Integer.reverse(-1);
        bh = Long.reverse(-215581303436904394L);
        bi = Integer.reverse(0);
        bj = Integer.reverse(0);
        bk = Integer.reverse(0);
        bl = Integer.reverse(0);
        bm = Integer.reverse(0);
        bn = Integer.reverse(0);
        bo = (0 >>> 112 | 0 << -112) & 0xFFFFFFFF;
        bp = Integer.reverse(0);
        bq = Integer.reverse(0);
        br = Integer.reverse(Integer.MIN_VALUE);
        bs = Integer.reverse(0);
        bt = Integer.reverse(Integer.MIN_VALUE);
        bu = Integer.reverse(0);
        bv = (128 >>> 135 | 128 << ~135 + 1) & 0xFFFFFFFF;
        bw = Integer.reverse(0);
        bx = (16384 >>> 205 | 16384 << -205) & 0xFFFFFFFF;
        by = (0 >>> 197 | 0 << -197) & 0xFFFFFFFF;
        bz = (1 >>> 224 | 1 << -224) & 0xFFFFFFFF;
        ca = 0x50000000 >>> 92 | 0x50000000 << ~92 + 1;
        cb = Integer.reverse(0);
        cc = 0x8000000 >>> 251 | 0x8000000 << ~251 + 1;
        cd = Integer.reverse(0x40000000);
        ce = 192 >>> 198 | 192 << -198;
        cf = Integer.reverse(0x20000000);
        cg = Integer.reverse(Integer.MIN_VALUE);
        ch = 0 >>> 227 | 0 << -227;
        ci = (0x44000000 >>> 90 | 0x44000000 << -90) & 0xFFFFFFFF;
        cj = Long.reverse(-215581303436904394L);
        ck = Integer.reverse(0);
        cl = (0 >>> 190 | 0 << -190) & 0xFFFFFFFF;
        cm = 0 >>> 4 | 0 << ~4 + 1;
        cn = (0 >>> 126 | 0 << ~126 + 1) & 0xFFFFFFFF;
        co = (3 >>> 159 | 3 << ~159 + 1) & 0xFFFFFFFF;
        cp = Integer.reverse(0);
        cq = 0 >>> 72 | 0 << ~72 + 1;
        cr = Integer.reverse(0x48000000);
        cs = Integer.reverse(-1);
        ct = Long.reverse(-215581303436904394L);
        cu = Integer.reverse(-939524096);
        cv = Integer.reverse(-1);
        cw = Long.reverse(-215581303436904394L);
        cx = Integer.reverse(0);
        cy = Integer.reverse(Integer.MIN_VALUE);
        cz = Integer.reverse(0);
        da = 2 >>> 65 | 2 << -65;
        db = Integer.reverse(0);
        dc = 0x100000 >>> 20 | 0x100000 << ~20 + 1;
        dd = 0 >>> 94 | 0 << ~94 + 1;
        de = (0x8000000 >>> 219 | 0x8000000 << ~219 + 1) & 0xFFFFFFFF;
        df = (0 >>> 63 | 0 << -63) & 0xFFFFFFFF;
        dg = Integer.reverse(Integer.MIN_VALUE);
        dh = (0 >>> 132 | 0 << ~132 + 1) & 0xFFFFFFFF;
        di = Integer.reverse(0);
        dj = (0xA00000 >>> 211 | 0xA00000 << ~211 + 1) & 0xFFFFFFFF;
        dk = (-1 >>> 119 | -1 << ~119 + 1) & 0xFFFFFFFF;
        dl = Long.reverse(-215581303436904394L);
        dm = (0x5400000 >>> 182 | 0x5400000 << -182) & 0xFFFFFFFF;
        dn = Integer.reverse(-1);
        cfr_renamed_1 = Long.reverse(-215581303436904394L);
        dp = (-1073741824 >>> 190 | -1073741824 << -190) & 0xFFFFFFFF;
        dq = 0 >>> 72 | 0 << ~72 + 1;
        dr = Integer.reverse(Integer.MIN_VALUE);
        ds = Integer.reverse(0x40000000);
        dt = Integer.reverse(0x68000000);
        du = Long.reverse(1369685765397510198L);
        dv = Long.reverse(-1297036692682702848L);
        dw = Integer.reverse(-402653184);
        dx = Long.reverse(1369685765397510198L);
        dy = Long.reverse(-1297036692682702848L);
        dz = Integer.reverse(0x18000000);
        ea = Long.reverse(-215581303436904394L);
        eb = Integer.reverse(0);
        ec = Integer.reverse(Integer.MIN_VALUE);
        ed = (0 >>> 34 | 0 << ~34 + 1) & 0xFFFFFFFF;
        ee = 200 >>> 3 | 200 << -3;
        ef = Integer.reverse(-1744830464);
        eg = Long.reverse(-1152921504606846976L);
        var_java_lang_String_arr_a = new String[ee];
        var_java_lang_String_arr_b = new String[ef];
        NLoginType_019.b();
        cfr_renamed_5 = Caffeine.newBuilder().expireAfterWrite(eg, TimeUnit.MINUTES).build();
    }

    private /* synthetic */ void a(NLoginCore_137 NLoginCore_1372, ForceRegisterConfig ForceRegisterConfig2, NLoginCore_277 NLoginCore_277, ButtonInteractionEvent buttonInteractionEvent, NLoginCore_509 NLoginCore_5092) {
        switch (NLoginCore_169.ae[NLoginCore_1372.ordinal()]) {
            case 1: {
                if (NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.aH()) {
                    ForceRegisterConfig2.B();
                }
                String string = NLoginCore_354.a(NLoginCore_198.var_com_nickuc_login_NLoginCore_198_d, co);
                if (!this.I.com_nickuc_login_NLoginCore_291_a().c(ForceRegisterConfig2, string)) {
                    NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.w, new Object[cp]);
                    buttonInteractionEvent.reply(NLoginCore_065.m(NLoginCore_150.a(NLoginCore_374.w, NLoginCore_277, new Object[cq]))).queue();
                    return;
                }
                NLoginCore_370.b((String)NLoginType_019.c("㺀", (int)(cr & cs), (long)ct) + ForceRegisterConfig2.i() + (String)NLoginType_019.c("㺃", (int)(cu & cv), (long)cw), new Object[cx]);
                NLoginCore_5092.a(NLoginCore_567.G, (Object)string);
                this.I.com_nickuc_login_NLoginType_005_b().a(ForceRegisterConfig2, NLoginCore_277, cy != 0, cz != 0);
                Object[] objectArray = new Object[da];
                objectArray[NLoginType_019.db] = string;
                Object[] objectArray2 = new Object[dc];
                objectArray2[NLoginType_019.dd] = string;
                Object[] objectArray3 = new Object[de];
                objectArray3[NLoginType_019.df] = string;
                Object[] objectArray4 = new Object[dg];
                objectArray4[NLoginType_019.dh] = string;
                buttonInteractionEvent.reply(this.var_com_nickuc_login_NLoginCore_057_b.com_nickuc_login_lib_jda_api_utils_messages_MessageCreateBuilder_a(NLoginCore_150.a(NLoginCore_374.bc, NLoginCore_277, objectArray), NLoginCore_150.a(NLoginCore_374.bd, NLoginCore_277, objectArray2), NLoginCore_150.a(NLoginCore_374.be, NLoginCore_277, objectArray3), NLoginCore_150.a(NLoginCore_374.bf, NLoginCore_277, objectArray4)).build()).queue();
                break;
            }
            case 2: {
                NLoginCore_154 NLoginInterface_0122;
                NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
                if (NLoginCore_5012 != null && (NLoginInterface_0122 = NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b()) instanceof NLoginType_030 && ((NLoginType_030)NLoginInterface_0122).com_nickuc_login_NLoginCore_311_a() == NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e) {
                    NLoginInterface_0122.b(this.I, NLoginCore_277, NLoginCore_5092);
                }
                buttonInteractionEvent.reply(NLoginCore_065.m(NLoginCore_150.a(NLoginCore_374.j, NLoginCore_277, new Object[di]))).queue();
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginType_019.c("㺆", (int)(dj & dk), (long)dl) + (Object)((Object)NLoginCore_1372) + (String)NLoginType_019.c("㺉", (int)(dm & dn), (long)cfr_renamed_1));
            }
        }
        Object[] objectArray = new Object[dp];
        objectArray[NLoginType_019.dq] = TwoFactorType.DISCORD;
        objectArray[NLoginType_019.dr] = NLoginCore_277;
        objectArray[NLoginType_019.ds] = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a().m();
        this.I.a(EventEnum.TWO_FACTOR_AUTH, objectArray);
    }

    public void onSlashCommandInteraction(SlashCommandInteractionEvent slashCommandInteractionEvent) {
        SlashCommandInteraction slashCommandInteraction = slashCommandInteractionEvent.getInteraction();
        if (slashCommandInteraction.getCommandType() != Command.Type.SLASH) {
            return;
        }
        if (slashCommandInteraction.getFullCommandName().split((String)NLoginType_019.c("㺀", (int)(az & ba), (long)bb))[bc].equals(NLoginType_019.c("㺃", (int)bd, (long)be))) {
            NLoginCore_154 NLoginInterface_0122;
            String string;
            String string2;
            User user = slashCommandInteractionEvent.getUser();
            String string3 = user.getId();
            OptionMapping optionMapping = slashCommandInteraction.getOption((String)NLoginType_019.c("㺆", (int)(bf & bg), (long)bh));
            String string4 = string2 = optionMapping != null ? optionMapping.getAsString() : null;
            if (string2 == null || (string = (String)cfr_renamed_5.getIfPresent((Object)string2)) == null) {
                String string5 = NLoginCore_150.a(NLoginCore_374.aI, new Object[bi]);
                String string6 = NLoginCore_150.a(NLoginCore_374.var_com_nickuc_login_NLoginCore_487_aJ, new Object[bj]);
                String string7 = NLoginCore_150.a(NLoginCore_374.aK, new Object[bk]);
                String string8 = NLoginCore_150.a(NLoginCore_374.aL, new Object[bl]);
                slashCommandInteractionEvent.reply(this.var_com_nickuc_login_NLoginCore_057_b.com_nickuc_login_lib_jda_api_utils_messages_MessageCreateBuilder_a(string5, string6, string7, string8).build()).queue();
                return;
            }
            NLoginCore_277 NLoginCore_277 = this.I.java_lang_Object_b().com_nickuc_login_NLoginCore_277_a(string);
            if (NLoginCore_277 == null) {
                String string9 = NLoginCore_065.m(NLoginCore_150.a(NLoginCore_374.u, new Object[bm]));
                slashCommandInteractionEvent.reply(string9).queue();
                return;
            }
            long l = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_i.r();
            if (user.getTimeCreated().isAfter(OffsetDateTime.now().minusSeconds(l))) {
                String string10 = NLoginCore_150.a(NLoginCore_374.aE, new Object[bn]);
                String string11 = NLoginCore_150.a(NLoginCore_374.aF, new Object[bo]);
                String string12 = NLoginCore_150.a(NLoginCore_374.aG, new Object[bp]);
                String string13 = NLoginCore_150.a(NLoginCore_374.aH, new Object[bq]);
                slashCommandInteractionEvent.reply(this.var_com_nickuc_login_NLoginCore_057_b.com_nickuc_login_lib_jda_api_utils_messages_MessageCreateBuilder_a(string10, string11, string12, string13).build()).queue();
                return;
            }
            int n = NLoginCore_596.var_com_nickuc_login_NLoginCore_363_h.r();
            if (n > 0 && NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.a(this.I, string3) >= n) {
                Object[] objectArray = new Object[br];
                objectArray[NLoginType_019.bs] = NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.u();
                NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.al, objectArray);
                Object[] objectArray2 = new Object[bt];
                objectArray2[NLoginType_019.bu] = NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e.u();
                String string14 = NLoginCore_065.m(NLoginCore_150.a(NLoginCore_374.al, NLoginCore_277, objectArray2));
                slashCommandInteractionEvent.reply(string14).queue();
                return;
            }
            cfr_renamed_5.invalidate((Object)string2);
            NLoginCore_509 NLoginCore_5092 = this.I.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            ForceRegisterConfig ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a();
            NLoginCore_335 NLoginCore_3352 = ForceRegisterConfig2.com_nickuc_login_NLoginCore_335_a();
            NLoginCore_3352.c(string3);
            NLoginCore_3352.c((!ForceRegisterConfig2.t() && !ForceRegisterConfig2.u() ? bv : bw) != 0);
            NLoginCore_436[] NLoginCore_436Array = new NLoginCore_436[bx];
            NLoginCore_436Array[NLoginType_019.by] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k;
            NLoginCore_436Array[NLoginType_019.bz] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l;
            this.I.com_nickuc_login_NLoginCore_291_a().a(ForceRegisterConfig2, NLoginCore_436Array);
            Object[] objectArray = new Object[ca];
            objectArray[NLoginType_019.cb] = TwoFactorType.convert((Enum)NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e);
            objectArray[NLoginType_019.cc] = NLoginCore_277;
            objectArray[NLoginType_019.cd] = NLoginCore_277.java_util_UUID_a();
            objectArray[NLoginType_019.ce] = string;
            objectArray[NLoginType_019.cf] = string3;
            this.I.a(EventEnum.TWO_FACTOR_ADD, objectArray);
            Object[] objectArray3 = new Object[cg];
            objectArray3[NLoginType_019.ch] = (String)NLoginType_019.c("㺉", (int)ci, (long)cj) + user.getName();
            NLoginCore_150.a((NLoginCore_494)NLoginCore_277, NLoginCore_374.az, objectArray3);
            String string15 = NLoginCore_150.a(NLoginCore_374.aM, NLoginCore_277, new Object[ck]);
            String string16 = NLoginCore_150.a(NLoginCore_374.aN, NLoginCore_277, new Object[cl]);
            String string17 = NLoginCore_150.a(NLoginCore_374.aO, NLoginCore_277, new Object[cm]);
            String string18 = NLoginCore_150.a(NLoginCore_374.aP, NLoginCore_277, new Object[cn]);
            slashCommandInteractionEvent.reply(this.var_com_nickuc_login_NLoginCore_057_b.com_nickuc_login_lib_jda_api_utils_messages_MessageCreateBuilder_a(string15, string16, string17, string18).build()).queue();
            NLoginCore_501 NLoginCore_5012 = (NLoginCore_501)NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_n);
            if (NLoginCore_5012 != null && (NLoginInterface_0122 = NLoginCore_5012.com_nickuc_login_NLoginInterface_012_b()) instanceof NLoginCore_438 && ((NLoginCore_438)NLoginInterface_0122).com_nickuc_login_NLoginCore_311_a() == NLoginCore_248.var_com_nickuc_login_NLoginCore_311_e) {
                NLoginInterface_0122.b(this.I, NLoginCore_277, NLoginCore_5092);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void onButtonInteraction(@Nonnull ButtonInteractionEvent var1_1) {
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
}

