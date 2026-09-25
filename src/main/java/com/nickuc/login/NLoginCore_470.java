/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.velocitypowered.api.command.CommandSource
 *  com.velocitypowered.api.event.PostOrder
 *  com.velocitypowered.api.event.Subscribe
 *  com.velocitypowered.api.event.command.CommandExecuteEvent
 *  com.velocitypowered.api.event.command.CommandExecuteEvent$CommandResult
 *  com.velocitypowered.api.event.player.PlayerChatEvent
 *  com.velocitypowered.api.event.player.PlayerChatEvent$ChatResult
 *  com.velocitypowered.api.event.player.PlayerSettingsChangedEvent
 *  com.velocitypowered.api.event.player.TabCompleteEvent
 *  com.velocitypowered.api.proxy.Player
 *  com.velocitypowered.api.proxy.player.PlayerSettings
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 */
package com.nickuc.login;

import com.nickuc.login.proxy.velocity.nLoginVelocity;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginInterface_029;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.event.player.PlayerSettingsChangedEvent;
import com.velocitypowered.api.event.player.TabCompleteEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.player.PlayerSettings;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class NLoginCore_470
implements NLoginInterface_029 {
    private static int ca;
    private static int ac;
    private static int af;
    private static long q;
    private static long w;
    private static long t;
    private static int f;
    private static int cj;
    private static long bu;
    private static int bg;
    private static int bq;
    private static long bm;
    private static int o;
    private static long ba;
    private static int ab;
    private static int ap;
    private static long u;
    private static int ae;
    private static long az;
    private static int an;
    private static int by;
    private static long cg;
    private static int ch;
    private static int ar;
    private static int ck;
    private static long av;
    private static int bs;
    private static long p;
    private static int y;
    private static int ah;
    private static int bx;
    private static int n;
    private static int bj;
    private static int ce;
    private static long cf;
    private static int am;
    private static long aq;
    private static long j;
    private static int cd;
    private static long bi;
    private static int bv;
    private static int bb;
    private static int v;
    private static int ag;
    private static long ak;
    private static long ai;
    private static int au;
    private static long z;
    private static long cb;
    private static long bf;
    private static int r;
    private static long ad;
    private static int i;
    private static int bz;
    private static int ay;
    private final nLoginVelocity var_com_nickuc_login_proxy_velocity_nLoginVelocity_c;
    private static long d;
    private static long aw;
    private static long as;
    private static int var_int_a;
    private static long var_long_c;
    private static int be;
    private static int bw;
    private static long bc;
    private static long var_long_b;
    private static long bo;
    private static int h;
    private static int aj;
    private static int s;
    private static long at;
    private static long bd;
    private static long bl;
    private static long l;
    private static long bp;
    private static int br;
    private static int bn;
    private static long cc;
    private static long al;
    private static int bk;
    private static int ax;
    private static String[] var_java_lang_String_arr_a;
    private static long x;
    private static int ci;
    private static long m;
    private static int e;
    private static String[] var_java_lang_String_arr_b;
    private final NLoginType_008 E;
    private static long aa;
    private static long bt;
    private static int ao;
    private static long g;
    private static int k;
    private static long bh;

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_470.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_092.A("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 65), NLoginCore_470.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_575.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈ࢖ࢎࢂࢥࢠ࢖ࢆ࢟Ԝ", (byte)92, 68) + string + NLoginCore_575.E("Ւ", (byte)92, 69) + methodType.toString(), exception);
        }
    }

    @Subscribe(order=PostOrder.LAST)
    public void b(CommandExecuteEvent commandExecuteEvent) {
        if (!commandExecuteEvent.getResult().isAllowed() && this.a(commandExecuteEvent.getCommand())) {
            commandExecuteEvent.setResult(CommandExecuteEvent.CommandResult.allowed());
        }
    }

    private /* synthetic */ boolean a(boolean bl, NLoginCore_277 NLoginCore_277, String string) {
        if (string.trim().isEmpty()) {
            return bw != 0;
        }
        if (string.charAt(bx) != by) {
            return bz != 0;
        }
        String[] stringArray = string.split((String)NLoginCore_470.c("㺀", (int)ca, (long)(cb ^ cc)));
        String string2 = stringArray[cd].toLowerCase(Locale.ENGLISH);
        if (!bl && ((String)NLoginCore_470.c("㺃", (int)ce, (long)(cf ^ cg))).equals(string2)) {
            return ch != 0;
        }
        if (this.E.com_nickuc_login_NLoginCore_187_a().boolean_b(NLoginCore_277)) {
            return ci != 0;
        }
        return this.E.com_nickuc_login_NLoginCore_276_a().b(string);
    }

    @Subscribe(order=PostOrder.FIRST)
    public void a(PlayerChatEvent playerChatEvent) {
        String string = playerChatEvent.getMessage().trim();
        if (string.isEmpty()) {
            return;
        }
        Player player = playerChatEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_c.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            if (this.E.com_nickuc_login_NLoginCore_056_b().boolean_a(NLoginCore_277, string)) {
                NLoginCore_509 NLoginCore_5092 = this.E.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                if (player.getProtocolVersion().getProtocol() >= r && (NLoginCore_5092.a(NLoginCore_567.I) || NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_c))) {
                    return;
                }
                playerChatEvent.setResult(PlayerChatEvent.ChatResult.denied());
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_470.c("㺀", (int)s, (long)(t ^ u)) + playerChatEvent.getClass().getSimpleName() + (String)NLoginCore_470.c("㺃", (int)v, (long)(w ^ x)) + player.getUsername() + (String)NLoginCore_470.c("㺆", (int)y, (long)(z ^ aa)), throwable, new Object[ab]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_470.c("㺉", (int)ac, (long)ad)));
        }
    }

    private static void b() {
        int n;
        var_long_c = 3502441953622232055L;
        long l = var_long_c ^ 0x4B0794AD7BEAA1E1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(55 + 28), (byte)(22 + 25), (byte)(3 + 64), (byte)(59 + 7), (byte)(18 + 49), (byte)(41 + 6), (byte)(65 + 15), (byte)(41 + 34), (byte)(8 + 59), (byte)(16 + 67), (byte)(40 + 13), 80, (byte)(28 + 69), (byte)(10 + 90), (byte)(71 + 29), (byte)(48 + 57), (byte)(44 + 66), (byte)(68 + 35)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(4 + 64), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_470.var_java_lang_String_arr_b[0] = NLoginCore_027.C("ѯѢѮѨЮѥїефѐѝт", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[1] = NLoginCore_027.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՑԲԼ԰ՂԾԿ՚՚ԼԽ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[2] = NLoginCore_324.D("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[3] = NLoginCore_027.E("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[4] = NLoginCore_384.F("ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ֋֐֋ՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֎՞֝Ֆ֦վ֕օզ֔։", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[5] = NLoginCore_387.D("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѸљѣїѩѥѦҁҁѣѤ", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[6] = NLoginCore_091.A("ĀàĩģğĕåăĥĩðĭĚòĮĀĶĮĔįĲĩĀā", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[7] = NLoginCore_201.D("ѝЯоцчтчѣьгѻт", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[8] = NLoginCore_453.A("ďć÷ĉĉĖìÿĉėþĝòħĩĈĥĐģĩĶĴĺüĞĘĽĒýþĬăŀńđĕŃĥĠĤĢŎċĺŁĉđĵŉĠŏřĮĮĨĥœįŊőŘōļőŕğťŪťĺŋĬķŌũňũŉōĴŏŤŵŏœŨĸŷİƀŘůşŀŮţ", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[9] = NLoginCore_223.F("ԅԡՅԏԋԎԟԊՄԽՂԐԵԺՃԱՋՆՑ՝ԼԽԜՠԺԺԸ՟ԠԿԠԥ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[10] = NLoginCore_201.F("ՄԠԣՁԺՍԈՑԴԳԩԟԖՅԌՅԩԲԼՠ՘՟Ԧԧ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[11] = NLoginCore_138.C("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѸљѣїѩѥѦҁҁѣѤ", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[12] = NLoginCore_138.C("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[13] = NLoginCore_091.F("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[14] = NLoginCore_223.E("ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ֋֐֋ՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֎՞֝Ֆ֦վ֕օզ֔։", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[15] = NLoginCore_201.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՑԲԼ԰ՂԾԿ՚՚ԼԽ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[16] = NLoginCore_201.D("эЭѶѰѬѢвѐѲѶнѺѧпѻэ҃ѻѡѼѿѶэю", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[17] = NLoginCore_201.E("ԶԈԗԟԠԛԠԼԥԌՔԛ", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[18] = NLoginCore_384.A("ďć÷ĉĉĖìÿĉėþĝòħĩĈĥĐģĩĶĴĺüĞĘĽĒýþĬăŀńđĕŃĥĠĤĢŎċĺŁĉđĵŉĠŏřĮĮĨĥœįŊőŘōļőŕğťŪťĺŋĬķŌũňũŉōĴŏŤŵŏœŨĸŷİƀŘůşŀŮţ", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[19] = NLoginCore_076.D("уыѡѓшьзъвёѻт", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[20] = NLoginCore_091.E("ՌԄԨԎԏԃ԰ՇԪՄԮԛ", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[21] = NLoginCore_004.C("уыѡѓшьзъвёѻт", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[22] = NLoginCore_427.D("лѴщѥѷѡъѦізљт", (byte)23, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_470.var_java_lang_String_arr_b[0] = NLoginCore_387.B("ĆĤáėÜâĞßúĬĢõ", (byte)23, 66);
                    NLoginCore_470.var_java_lang_String_arr_b[1] = NLoginCore_324.E("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՒԺՃԢՠԜ՟բԢՈԶ", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[2] = NLoginCore_201.A("ĀàĩģğĕåăĥĩæúďĆĤāĖĵăĎċăĀā", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ХѤѯѯючёѴиѰэт", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[4] = NLoginCore_076.D("ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҠҞӉӊӌҪҬҦӇҟҟҌӎұҔҮҮҳӔӃҭҽҢ", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[5] = NLoginCore_446.C("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂Ѹрҋ҈ѫэѥѦѨҍф", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[6] = NLoginCore_223.C("эЭѶѰѬѢвѐѲѶгјѽљѝѪёжэѹѰ҆эю", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[7] = NLoginCore_446.C("ХЫіоѨшѶфѵьѫт", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[8] = NLoginCore_201.D("ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҧҷҶҧҫӆһңӀӏҊӋӎӁӎҿӊҪҹҩҘҹҢ", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[9] = NLoginCore_092.A("ßûğéåèùäĞėĜêďĔĝċĥĠīķĖĚćąĹĶĈĺĲĻĴĮĘĶĂĕĀŇþĘĖģŊĕ", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[10] = NLoginCore_091.B("ĞúýěĔħâīĎčāęîðïĬòĩîĩĬĚČùĮĠŀłĴĽýĤ", (byte)23, 66);
                    NLoginCore_470.var_java_lang_String_arr_b[11] = NLoginCore_384.F("ՂԡՋԏՏԠԳՅԧԓԢԱՖՉԙԸԦՇՓԑ՛ՔՔ՚Ԛԯ՝՗Եբ՚ժ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[12] = NLoginCore_575.A("ĀàĩģğĕåăĥĩâýĬîĬčăĂĸđĆăĀā", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[13] = NLoginCore_004.C("суѨШыѨѴѕюѹит", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[14] = NLoginCore_173.D("ќєфііѣйьіѤыѪпѴѶѕѲѝѰѶ҃ҁ҇щѫѥҊџъыѹѐҍґўѢҐѲѭѱѯқј҇Ҏіў҂ҖѭҜҦѻѻѵѲҠѼҗҞҥҚ҉ҞҢѬҲҷҲ҇Ҙѹ҄ҙҶҕҶҖҚҁҜұӂҜҠҠҟҸҨҝ҅ҧ҆ҸҿӁҽҮҕӒңҷҹҕҷӆҽҢ", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[15] = NLoginCore_575.D("ѩшѲжѶчњѬюкщјѽѰрџэѮѺи҂ѷҀѵљѻцҍы҄ҋѩѤэѐѕѳҏҚѷҔѤѽѢ", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[16] = NLoginCore_384.C("эЭѶѰѬѢвѐѲѶЯѬѬѽмйеёѐёѡѐэю", (byte)23, 67);
                    NLoginCore_470.var_java_lang_String_arr_b[17] = NLoginCore_446.B("ýöÞĊõüĠêĦĭĞõ", (byte)23, 66);
                    NLoginCore_470.var_java_lang_String_arr_b[18] = NLoginCore_223.E("ԵԭԝԯԯԼԒԥԯԽԤՃԘՍՏԮՋԶՉՏ՜՚ՠԢՄԾգԸԣԤՒԩզժԷԻթՋՆՊՈմԱՠէԯԷ՛կՆյտՔՔՎՋչՕհշվճբշջՅ֋֐֋ՠձՒ՝ղ֏ծ֏կճ՚յ֊֛յչ֊֘֟լքյֈ֓֟֔֠֫գո֘ւְֲֲִ֚֔ջ", (byte)23, 69);
                    NLoginCore_470.var_java_lang_String_arr_b[19] = NLoginCore_092.A("ħħĖģûăąīéíČõ", (byte)23, 65);
                    NLoginCore_470.var_java_lang_String_arr_b[20] = NLoginCore_201.F("ԼԛՏԍԋՂԑՎՕՋԑՎ՗ԧԱ՘ԨՕԴԹՈԹԦԧ", (byte)23, 70);
                    NLoginCore_470.var_java_lang_String_arr_b[21] = NLoginCore_173.D("нчЮђжѐиѱїѫѷт", (byte)23, 68);
                    NLoginCore_470.var_java_lang_String_arr_b[22] = NLoginCore_387.D("хяѲцгѮѰѨѐѕѐѮѮђ҂ѻтрнѥ҆҆эю", (byte)23, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_470.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ØĝáÛĤĠâùěěùģäòĉíîăĕĳĭăĀā", (byte)23, 66);
                    continue block7;
                }
                case 4: {
                    NLoginCore_470.var_java_lang_String_arr_b[0] = NLoginCore_004.A("æćçăėāĂĭĨĄĭħīñĤĉġÿõęĦĩĀā", (byte)23, 65);
                }
            }
        }
    }

    @Generated
    public NLoginCore_470(nLoginVelocity nLoginVelocity2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_c = nLoginVelocity2;
        this.E = NLoginType_008;
    }

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-1166388089380873972L);
        d = Long.reverse(-1441151880758558720L);
        e = (24870912 >>> 111 | 24870912 << ~111 + 1) & 0xFFFFFFFF;
        f = (1 >>> 64 | 1 << -64) & 0xFFFFFFFF;
        g = Long.reverse(274763791377684748L);
        h = 0x20000000 >>> 220 | 0x20000000 << -220;
        i = Integer.reverse(-1);
        j = Long.reverse(274763791377684748L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(-1166388089380873972L);
        m = Long.reverse(-1441151880758558720L);
        n = 0 >>> 99 | 0 << -99;
        o = 262144 >>> 48 | 262144 << -48;
        p = Long.reverse(-1166388089380873972L);
        q = Long.reverse(-1441151880758558720L);
        r = Integer.reverse(-281018368);
        s = Integer.reverse(-1610612736);
        t = Long.reverse(-1166388089380873972L);
        u = Long.reverse(-1441151880758558720L);
        v = Integer.reverse(0x60000000);
        w = Long.reverse(-1166388089380873972L);
        x = Long.reverse(-1441151880758558720L);
        y = (0x3800000 >>> 215 | 0x3800000 << ~215 + 1) & 0xFFFFFFFF;
        z = Long.reverse(-1166388089380873972L);
        aa = Long.reverse(-1441151880758558720L);
        ab = (0 >>> 228 | 0 << -228) & 0xFFFFFFFF;
        ac = 1 >>> 221 | 1 << ~221 + 1;
        ad = Long.reverse(274763791377684748L);
        ae = 0 >>> 28 | 0 << -28;
        af = Integer.reverse(-201326592);
        ag = (-1879048192 >>> 156 | -1879048192 << -156) & 0xFFFFFFFF;
        ah = -1 >>> 8 | -1 << -8;
        ai = Long.reverse(274763791377684748L);
        aj = 2560 >>> 200 | 2560 << -200;
        ak = Long.reverse(-1166388089380873972L);
        al = Long.reverse(-1441151880758558720L);
        am = Integer.reverse(Integer.MIN_VALUE);
        an = Integer.reverse(0);
        ao = (0xB00000 >>> 116 | 0xB00000 << ~116 + 1) & 0xFFFFFFFF;
        ap = Integer.reverse(-1);
        aq = Long.reverse(274763791377684748L);
        ar = Integer.reverse(0x30000000);
        as = Long.reverse(-1166388089380873972L);
        at = Long.reverse(-1441151880758558720L);
        au = 212992 >>> 46 | 212992 << ~46 + 1;
        av = Long.reverse(-1166388089380873972L);
        aw = Long.reverse(-1441151880758558720L);
        ax = Integer.reverse(0);
        ay = Integer.reverse(0x70000000);
        az = Long.reverse(-1166388089380873972L);
        ba = Long.reverse(-1441151880758558720L);
        bb = Integer.reverse(-268435456);
        bc = Long.reverse(-1166388089380873972L);
        bd = Long.reverse(-1441151880758558720L);
        be = Integer.reverse(0x8000000);
        bf = Long.reverse(274763791377684748L);
        bg = Integer.reverse(-2013265920);
        bh = Long.reverse(-1166388089380873972L);
        bi = Long.reverse(-1441151880758558720L);
        bj = Integer.reverse(0);
        bk = 147456 >>> 205 | 147456 << ~205 + 1;
        bl = Long.reverse(-1166388089380873972L);
        bm = Long.reverse(-1441151880758558720L);
        bn = Integer.reverse(-939524096);
        bo = Long.reverse(-1166388089380873972L);
        bp = Long.reverse(-1441151880758558720L);
        bq = Integer.reverse(Integer.MIN_VALUE);
        br = Integer.reverse(0);
        bs = (655360 >>> 207 | 655360 << -207) & 0xFFFFFFFF;
        bt = Long.reverse(-1166388089380873972L);
        bu = Long.reverse(-1441151880758558720L);
        bv = Integer.reverse(0);
        bw = (0 >>> 231 | 0 << ~231 + 1) & 0xFFFFFFFF;
        bx = Integer.reverse(0);
        by = -1140850688 >>> 122 | -1140850688 << ~122 + 1;
        bz = Integer.reverse(0);
        ca = Integer.reverse(-1476395008);
        cb = Long.reverse(-1166388089380873972L);
        cc = Long.reverse(-1441151880758558720L);
        cd = Integer.reverse(0);
        ce = Integer.reverse(0x68000000);
        cf = Long.reverse(-1166388089380873972L);
        cg = Long.reverse(-1441151880758558720L);
        ch = (16384 >>> 110 | 16384 << -110) & 0xFFFFFFFF;
        ci = Integer.reverse(0);
        cj = Integer.reverse(-402653184);
        ck = 94208 >>> 236 | 94208 << ~236 + 1;
        var_java_lang_String_arr_a = new String[cj];
        var_java_lang_String_arr_b = new String[ck];
        NLoginCore_470.b();
    }

    private boolean a(String string) {
        String[] stringArray;
        if (!string.trim().isEmpty() && (stringArray = string.split((String)NLoginCore_470.c("㺀", (int)bn, (long)(bo ^ bp)))).length > bq) {
            String string2 = stringArray[br].toLowerCase(Locale.ENGLISH);
            return string2.equals(NLoginCore_470.c("㺃", (int)bs, (long)(bt ^ bu)));
        }
        return bv != 0;
    }

    @Subscribe
    public void a(PlayerSettingsChangedEvent playerSettingsChangedEvent) {
        Player player = playerSettingsChangedEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_c.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            PlayerSettings playerSettings = playerSettingsChangedEvent.getPlayerSettings();
            NLoginCore_055 NLoginCore_0552 = NLoginCore_055.c(playerSettings.getLocale().toLanguageTag());
            if (NLoginCore_0552 != null) {
                NLoginCore_509 NLoginCore_5092 = this.E.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i, (Object)NLoginCore_0552);
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_470.c("㺀", (int)bb, (long)(bc ^ bd)) + playerSettingsChangedEvent.getClass().getSimpleName() + (String)NLoginCore_470.c("㺃", (int)be, (long)bf) + player.getUsername() + (String)NLoginCore_470.c("㺆", (int)bg, (long)(bh ^ bi)), throwable, new Object[bj]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_470.c("㺉", (int)bk, (long)(bl ^ bm))));
        }
    }

    private static String a(int n, long l) {
        l ^= 0x37L;
        l ^= 0x4B0794AD7BEAA1E1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(48 + 20), (byte)(51 + 18), (byte)(52 + 31), (byte)(37 + 10), (byte)(6 + 61), (byte)(42 + 24), (byte)(29 + 38), (byte)(30 + 17), (byte)(43 + 37), (byte)(66 + 9), (byte)(57 + 10), (byte)(51 + 32), (byte)(52 + 1), 80, (byte)(65 + 32), 100, (byte)(61 + 39), (byte)(80 + 25), (byte)(105 + 5), (byte)(10 + 93)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(35 + 33), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.F("ՙզեԨըդ՟ըճբԯխձժխճԵࣃࢻࢯ࣒࣍ࣃࢳ࣌", (byte)58, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_470.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Subscribe
    public void a(TabCompleteEvent tabCompleteEvent) {
        List list = tabCompleteEvent.getSuggestions();
        if (list.isEmpty()) {
            return;
        }
        String string = tabCompleteEvent.getPartialMessage().trim();
        if (!string.isEmpty() && string.charAt(ae) != af) {
            return;
        }
        Player player = tabCompleteEvent.getPlayer();
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_c.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            int n = NLoginCore_277.i((String)NLoginCore_470.c("㺀", (int)(ag & ah), (long)ai)) || NLoginCore_277.i((String)NLoginCore_470.c("㺃", (int)aj, (long)(ak ^ al))) ? am : an;
            list.removeIf(arg_0 -> this.a(n != 0, NLoginCore_277, arg_0));
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_470.c("㺆", (int)(ao & ap), (long)aq) + tabCompleteEvent.getClass().getSimpleName() + (String)NLoginCore_470.c("㺉", (int)ar, (long)(as ^ at)) + player.getUsername() + (String)NLoginCore_470.c("㺌", (int)au, (long)(av ^ aw)), throwable, new Object[ax]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_470.c("㺏", (int)ay, (long)(az ^ ba))));
        }
    }

    @Subscribe
    public void a(CommandExecuteEvent commandExecuteEvent) {
        if (!commandExecuteEvent.getResult().isAllowed()) {
            return;
        }
        CommandSource commandSource = commandExecuteEvent.getCommandSource();
        if (!(commandSource instanceof Player)) {
            return;
        }
        String string = commandExecuteEvent.getCommand().trim();
        if (string.isEmpty()) {
            return;
        }
        Player player = (Player)commandSource;
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_velocity_nLoginVelocity_c.java_lang_Object_b().a(player);
            if (NLoginCore_277.S()) {
                return;
            }
            String string2 = this.E.com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, (String)NLoginCore_470.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)) + string);
            if (string2 == null) {
                NLoginCore_509 NLoginCore_5092 = this.E.com_nickuc_login_NLoginCore_187_a().com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
                if (player.getProtocolVersion().getProtocol() >= e && (NLoginCore_5092.a(NLoginCore_567.I) || NLoginCore_5092.d(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_c))) {
                    commandExecuteEvent.setResult(CommandExecuteEvent.CommandResult.forwardToServer());
                    return;
                }
                commandExecuteEvent.setResult(CommandExecuteEvent.CommandResult.denied());
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_470.c("㺃", (int)f, (long)g) + commandExecuteEvent.getClass().getSimpleName() + (String)NLoginCore_470.c("㺆", (int)(h & i), (long)j) + player.getUsername() + (String)NLoginCore_470.c("㺉", (int)k, (long)(l ^ m)), throwable, new Object[n]);
            player.disconnect((Component)NLoginCore_529.a((String)NLoginCore_470.c("㺌", (int)o, (long)(p ^ q))));
        }
    }
}

