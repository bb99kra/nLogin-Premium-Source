/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.md_5.bungee.UserConnection
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.TextComponent
 *  net.md_5.bungee.api.connection.Connection
 *  net.md_5.bungee.api.connection.ProxiedPlayer
 *  net.md_5.bungee.api.event.ChatEvent
 *  net.md_5.bungee.api.event.ServerKickEvent
 *  net.md_5.bungee.api.event.SettingsChangedEvent
 *  net.md_5.bungee.api.event.TabCompleteEvent
 *  net.md_5.bungee.event.EventHandler
 *  net.md_5.bungee.protocol.packet.ClientSettings
 */
package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_055;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_046;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
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
import net.md_5.bungee.UserConnection;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.ServerKickEvent;
import net.md_5.bungee.api.event.SettingsChangedEvent;
import net.md_5.bungee.api.event.TabCompleteEvent;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.protocol.packet.ClientSettings;

public class NLoginCore_078
implements NLoginInterface_046 {
    private static int ao;
    private static long w;
    private static int q;
    private static long bh;
    private static long var_long_c;
    private static long bt;
    private static int bp;
    private static long bx;
    private static int bn;
    private static int bi;
    private static int by;
    private static long f;
    private static long g;
    private static int var_int_a;
    private static int ah;
    private static int cb;
    private static long an;
    private static int h;
    private static int af;
    private static int bq;
    private static int bv;
    private static int bb;
    private static long ax;
    private static long at;
    private static int n;
    private static int am;
    private static long aq;
    private static int x;
    private static int bf;
    private static long ag;
    private static long t;
    private static long k;
    private static int az;
    private static long ba;
    private static int bo;
    private static long as;
    private static long bg;
    private static int y;
    private static int br;
    private static int ar;
    private static long i;
    private static long v;
    private static int be;
    private static String[] var_java_lang_String_arr_a;
    private static int m;
    private static int u;
    private static int bd;
    private static int j;
    private static int ac;
    private static int p;
    private static int bs;
    private static int ai;
    private static int e;
    private static int l;
    private final nLoginBungee var_com_nickuc_login_proxy_bungee_nLoginBungee_c;
    private static int bc;
    private static long al;
    private static int ay;
    private static int z;
    private static long aw;
    private static long bu;
    private static int r;
    private static int bj;
    private static int ca;
    private static long ak;
    private static int au;
    private static long bm;
    private static int bz;
    private static int ap;
    private final NLoginType_008 B;
    private static long ad;
    private static long ab;
    private static int var_int_b;
    private static long s;
    private static long ae;
    private static int av;
    private static int bl;
    private static int bk;
    private static long aa;
    private static int bw;
    private static int d;
    private static int aj;
    private static long o;
    private static int var_int_c;
    private static String[] var_java_lang_String_arr_b;

    @EventHandler(priority=127)
    public void b(ChatEvent chatEvent) {
        if (chatEvent.isCancelled() && this.a(chatEvent.getMessage())) {
            chatEvent.setCancelled(bc != 0);
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_078.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.F("ՇթիՋկ֎ֆ֜ֈ՗֕֋֙֓՜ց֣֢֚֚֠կ", (byte)99, 70), NLoginCore_078.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_091.D("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢳࢶࢺࢦࢪࢷࢩࢾࢿ࢓ࢱࢬࢼԶ", (byte)99, 68) + string + NLoginCore_324.E("ՙ", (byte)99, 69) + methodType.toString(), exception);
        }
    }

    private /* synthetic */ boolean a(boolean bl, NLoginCore_277 NLoginCore_277, String string) {
        if (string.trim().isEmpty()) {
            return bo != 0;
        }
        if (string.charAt(bp) != bq) {
            return br != 0;
        }
        String[] stringArray = string.split((String)NLoginCore_078.c("㺀", (int)bs, (long)(bt ^ bu)));
        String string2 = stringArray[bv].toLowerCase(Locale.ENGLISH);
        if (!bl && string2.equals(NLoginCore_078.c("㺃", (int)bw, (long)bx))) {
            return by != 0;
        }
        if (this.B.com_nickuc_login_NLoginCore_187_a().boolean_b(NLoginCore_277)) {
            return bz != 0;
        }
        return this.B.com_nickuc_login_NLoginCore_276_a().b(string);
    }

    @EventHandler(priority=-64)
    public void a(ChatEvent chatEvent) {
        if (chatEvent.isCancelled()) {
            return;
        }
        Connection connection = chatEvent.getSender();
        if (!(connection instanceof ProxiedPlayer)) {
            return;
        }
        String string = chatEvent.getMessage().trim();
        if (string.isEmpty()) {
            return;
        }
        ProxiedPlayer proxiedPlayer = (ProxiedPlayer)connection;
        try {
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_c.java_lang_Object_b().a(proxiedPlayer);
            if (NLoginCore_277.S()) {
                return;
            }
            if (string.charAt(var_int_a) == var_int_b) {
                String string2 = this.B.com_nickuc_login_NLoginCore_056_b().java_lang_String_a(NLoginCore_277, string);
                if (string2 == null) {
                    chatEvent.setCancelled(var_int_c != 0);
                    return;
                }
                if (!string.equals(string2)) {
                    chatEvent.setMessage(string2);
                }
            } else if (this.B.com_nickuc_login_NLoginCore_056_b().boolean_a(this.var_com_nickuc_login_proxy_bungee_nLoginBungee_c.java_lang_Object_b().a(proxiedPlayer), string)) {
                chatEvent.setCancelled(d != 0);
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_078.c("㺀", (int)e, (long)(f ^ g)) + chatEvent.getClass().getSimpleName() + (String)NLoginCore_078.c("㺃", (int)h, (long)i) + proxiedPlayer.getName() + (String)NLoginCore_078.c("㺆", (int)j, (long)k), throwable, new Object[l]);
            chatEvent.setCancelled(m != 0);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginCore_078.c("㺉", (int)n, (long)o)));
        }
    }

    private static void b() {
        int n;
        var_long_c = -4494152216305150272L;
        long l = var_long_c ^ 0x4128D900748E0A9BL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(4 + 64), (byte)(65 + 4), (byte)(51 + 32), (byte)(45 + 2), (byte)(21 + 46), (byte)(5 + 61), (byte)(41 + 26), 47, (byte)(60 + 20), (byte)(39 + 36), (byte)(31 + 36), (byte)(37 + 46), (byte)(9 + 44), (byte)(69 + 11), (byte)(27 + 70), (byte)(22 + 78), (byte)(14 + 86), (byte)(52 + 53), (byte)(14 + 96), 103}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(34 + 34), (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_078.var_java_lang_String_arr_b[0] = NLoginCore_201.C("ծ՟ՠ֑՝Սծ֑մ՟֋֎ղ֘էլղխ՞թ՝բհց֥՞ո֓պ֟։ջ", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[1] = NLoginCore_138.C("րՖ֐ձ՚՜֍֌֔մ֐՘Ւ֕հՓձ՞՗֞֋ժէը", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[2] = NLoginCore_427.E("֖ւզո֫ժ֦տ֪֦֔չ", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ր՛։֌օՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓֌֐կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ׈ִּם֠חפסֽכׂש֤", (byte)117, 68);
                    NLoginCore_078.var_java_lang_String_arr_b[4] = NLoginCore_173.B("ǟƶǣƣǆưǥƾǈǉǈǡƼǤǋǋǂǴǥǓǅǅǫǦǰǛǒǈǘǕƾǴ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[5] = NLoginCore_559.E("ֆ։ըְ֭֝պպ֢ժ։ֳ֯ղ֥֘֎֤֧־֞֗քօ", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[6] = NLoginCore_559.B("ǃƴƵǦƲƢǃǦǉƴǠǣǇǭƼǁǇǂƳƾƲƷǅǖǺƳǍǨǏǴǞǐ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[7] = NLoginCore_559.B("ǕƫǥǆƯƱǢǡǩǉǥƭƧǪǅƨǆƳƬǳǠƿƼƽ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[8] = NLoginCore_110.B("ǎƺƞưǣƢǞƷǢǞǌƱ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[9] = NLoginCore_451.F("֝ո֦֢֩սջ֞։֐֍֕նֳև֥֤֚֫֕֞֬֕ցַ֮ׄվրַքַָփ׈֮֊׆ְֿ֭֩֌֌חוֵ֢חׇ׎׎֙׉֛֫ם֜וֱַגםס׋כִלּ־ֳׂ֧֤במה֯׶׵׭װאץיב׺ֽ״؁׾ך׸ן؆ׁ", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[10] = NLoginCore_027.C("ծ՟ՠ֑՝Սծ֑մ՟֋֎ղ֘էլղխ՞թ՝բհց֥՞ո֓պ֟։ջ", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[11] = NLoginCore_324.C("րՖ֐ձ՚՜֍֌֔մ֐՘Ւ֕հՓձ՞՗֞֋ժէը", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[12] = NLoginCore_324.A("ǎƺƞưǣƢǞƷǢǞǌƱ", (byte)117, 65);
                    NLoginCore_078.var_java_lang_String_arr_b[13] = NLoginCore_559.C("ր՛։֌օՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓֌֐կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ׈ִּם֠חפסֽכׂש֤", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[14] = NLoginCore_027.F("նգ֘֗֊ռ֍֪֎կֆ֎ְ֖շճ֊֦֋ֲֶ֔֍ճ֕ջց֎֔׆օ֛֦֠֗֗ֆ׈֣א׍ֱֲ֩֬֍אׁט֥֭֩ןַ֤֥", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[15] = NLoginCore_027.A("ƪƢơǦƾǄƷǂǚǁƧƱ", (byte)117, 65);
                    NLoginCore_078.var_java_lang_String_arr_b[16] = NLoginCore_076.D("խ՗ֈէ֌։֒֋Ջ֒կ՜", (byte)117, 68);
                    NLoginCore_078.var_java_lang_String_arr_b[17] = NLoginCore_201.F("ղժթ֮ֆ֌տ֊֢։կչ", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[18] = NLoginCore_223.A("ǂƬǝƼǡǞǧǠƠǧǄƱ", (byte)117, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_078.var_java_lang_String_arr_b[0] = NLoginCore_453.E("֋ռս֮պժ֋֑֮ռ֨֫֏ֵք։֏֊ջֆպչ׀֎֒ջ֚֓־ֲֽ֟", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[1] = NLoginCore_453.F("֝ճ֭֎շչֱ֪֑֭֩ծծ֟ֈ֋ֶ֛յֲֽ֩քօ", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[2] = NLoginCore_223.D("բփՆՂՉՠ֋լբնշ՜", (byte)117, 68);
                    NLoginCore_078.var_java_lang_String_arr_b[3] = NLoginCore_027.A("ǕưǞǡǚƵƳǖǁǈǅǍƮǫƿǝǣǜǍǖǤǍǒƹǯǼǦƶƸǯƼǰǯƻȀǦǂǾǷǨǡǥǄǄȏȍǚǭȏǿȆȆǑȁǓǣȕǔȍǩǯȊȕșȃȓǬȔǴǶǟǺǜǫȉȖȌǧȮȭȥȨȈȝȑȎȫȴȇȕȥǵǹȝǸȺȜȲȖȍȎɀȘɆȸȴȜȑ", (byte)117, 65);
                    NLoginCore_078.var_java_lang_String_arr_b[4] = NLoginCore_384.F("֧վ֫ի֎ո֭ֆ֐֑֐֩ք֬֓֓֊ּ֛֭֍֌֋֚֠֠֍ׁ֝սվջֺ֓օ׈ׇ֜א֏ד׎ִ֙", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[5] = NLoginCore_091.F("ֆ։ըְ֭֝պպ֢ժ֊էְմְְ֦֕ճշոֽքօ", (byte)117, 70);
                    NLoginCore_078.var_java_lang_String_arr_b[6] = NLoginCore_324.C("ծ՟ՠ֑՝Սծ֑մ՟֋֎ղ֘էլղխ՞թ՝՞ր֧֟֔֒գ֥տ֪ի֫֠֊֘պձփ֋֌֯֗ռ", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[7] = NLoginCore_173.C("րՖ֐ձ՚՜֍֌֔մ֍ը՗ւյ֑ֈ֏֛հ֙ժէը", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[8] = NLoginCore_092.B("ǛƚǝǤǘǥǨǒƾǥƧƱ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[9] = NLoginCore_451.D("ր՛։֌օՠ՞ցլճհոՙ֖ժֈ֎ևոց֏ոսդ֧֑֚ագ֚է֛֚զ֑֫խ֢֩֓֌֐կկָֺօֱֱֺ֪֘ռ֬վ֎׀տֵָ֚֔׀֮ׄ־ֿ֗֟֡֊֥ևִַׁ֖֒יטאדֳ׈ֵַּׅ֫מכִׇ֢ץ׍֧׍ן׬בגׄ׊׶֬ױּ", (byte)117, 68);
                    NLoginCore_078.var_java_lang_String_arr_b[10] = NLoginCore_027.A("ǃƴƵǦƲƢǃǦǉƴǠǣǇǭƼǁǇǂƳƾƲƮǪǱƹƲǓǾǒƸǌǾ", (byte)117, 65);
                    NLoginCore_078.var_java_lang_String_arr_b[11] = NLoginCore_453.E("֝ճ֭֎շչֱ֪֑֤֩֬մֹ֧֪֖֒ֈյշ֗քօ", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[12] = NLoginCore_384.C("ՙ։ռևհ֒բկծվշ՜", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[13] = NLoginCore_027.E("֝ո֦֢֩սջ֞։֐֍֕նֳև֥֤֚֫֕֞֬֕ցַ֮ׄվրַքַָփ׈֮֊׆ְֿ֭֩֌֌חוֵ֢חׇ׎׎֙׉֛֫ם֜וֱַגםס׋כִלּ־ֳׂ֧֤במה֯׶׵׭װאץיהּֿ׏׷יי؃ׄכר׷ףתן؃ט؎ך؈ؑלי", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[14] = NLoginCore_027.E("նգ֘֗֊ռ֍֪֎կֆ֎ְ֖շճ֊֦֋ֲֶ֔֍ճ֕ջց֎֔׆օ֛֦֠֗֗ֆ׈֣א׍ְ֩ׄ֔֕֫ך׃֤ג׆֐֧֤֥", (byte)117, 69);
                    NLoginCore_078.var_java_lang_String_arr_b[15] = NLoginCore_427.B("ǛǄǓǑƻƶǜǠƜǛǢƱ", (byte)117, 66);
                    NLoginCore_078.var_java_lang_String_arr_b[16] = NLoginCore_324.D("չ՛ՌՉլբթքխ։֘զ֔ըզև՜֔՟֑պպէը", (byte)117, 68);
                    NLoginCore_078.var_java_lang_String_arr_b[17] = NLoginCore_559.C("բ՞փծՉ֐ՊՔի։֍՜", (byte)117, 67);
                    NLoginCore_078.var_java_lang_String_arr_b[18] = NLoginCore_027.C("՞ւՇՍՈքլ֋տիՕմ֒փե֔պ՞սն։ժէը", (byte)117, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_078.var_java_lang_String_arr_b[0] = NLoginCore_446.E("ջօ֡֫֋֚֝վկֈ֜֏ևֶփձփֺֈ֏պ։ֽ֞׀ָ֠ր֧֛֥ֈ", (byte)117, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_078.var_java_lang_String_arr_b[0] = NLoginCore_427.D("եՀ֊տգաձՒ֕ւՏխհ՗ՙթ֓֎թ֗՝ժէը", (byte)117, 68);
                }
            }
        }
    }

    private boolean a(String string) {
        String[] stringArray;
        if (!string.isEmpty() && string.charAt(bd) == be && (stringArray = string.split((String)NLoginCore_078.c("㺀", (int)bf, (long)(bg ^ bh)))).length > bi) {
            String string2 = stringArray[bj].toLowerCase(Locale.ENGLISH);
            return string2.equals(NLoginCore_078.c("㺃", (int)(bk & bl), (long)bm));
        }
        return bn != 0;
    }

    static {
        var_int_a = (0 >>> 254 | 0 << -254) & 0xFFFFFFFF;
        var_int_b = (12032 >>> 232 | 12032 << -232) & 0xFFFFFFFF;
        var_int_c = (16384 >>> 174 | 16384 << ~174 + 1) & 0xFFFFFFFF;
        d = 0x10000000 >>> 156 | 0x10000000 << -156;
        e = Integer.reverse(0);
        f = Long.reverse(246318313503294851L);
        g = Long.reverse(-5908722711110090752L);
        h = 64 >>> 70 | 64 << -70;
        i = Long.reverse(-5950634773758507645L);
        j = 4096 >>> 75 | 4096 << ~75 + 1;
        k = Long.reverse(-5950634773758507645L);
        l = (0 >>> 111 | 0 << -111) & 0xFFFFFFFF;
        m = Integer.reverse(Integer.MIN_VALUE);
        n = Integer.reverse(-1073741824);
        o = Long.reverse(-5950634773758507645L);
        p = Integer.reverse(0);
        q = (376 >>> 67 | 376 << ~67 + 1) & 0xFFFFFFFF;
        r = Integer.reverse(0x20000000);
        s = Long.reverse(246318313503294851L);
        t = Long.reverse(-5908722711110090752L);
        u = Integer.reverse(-1610612736);
        v = Long.reverse(246318313503294851L);
        w = Long.reverse(-5908722711110090752L);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(0);
        z = (3 >>> 255 | 3 << ~255 + 1) & 0xFFFFFFFF;
        aa = Long.reverse(246318313503294851L);
        ab = Long.reverse(-5908722711110090752L);
        ac = 0x38000000 >>> 123 | 0x38000000 << -123;
        ad = Long.reverse(246318313503294851L);
        ae = Long.reverse(-5908722711110090752L);
        af = Integer.reverse(0x10000000);
        ag = Long.reverse(-5950634773758507645L);
        ah = 0 >>> 217 | 0 << ~217 + 1;
        ai = Integer.reverse(Integer.MIN_VALUE);
        aj = Integer.reverse(-1879048192);
        ak = Long.reverse(246318313503294851L);
        al = Long.reverse(-5908722711110090752L);
        am = (-1610612736 >>> 252 | -1610612736 << -252) & 0xFFFFFFFF;
        an = Long.reverse(-5950634773758507645L);
        ao = Integer.reverse(-805306368);
        ap = Integer.reverse(-1);
        aq = Long.reverse(-5950634773758507645L);
        ar = Integer.reverse(0x30000000);
        as = Long.reverse(246318313503294851L);
        at = Long.reverse(-5908722711110090752L);
        au = 0 >>> 96 | 0 << -96;
        av = (0x3400000 >>> 54 | 0x3400000 << -54) & 0xFFFFFFFF;
        aw = Long.reverse(246318313503294851L);
        ax = Long.reverse(-5908722711110090752L);
        ay = Integer.reverse(0x70000000);
        az = -1 >>> 178 | -1 << ~178 + 1;
        ba = Long.reverse(-5950634773758507645L);
        bb = (0x4000000 >>> 90 | 0x4000000 << -90) & 0xFFFFFFFF;
        bc = Integer.reverse(0);
        bd = Integer.reverse(0);
        be = Integer.reverse(-201326592);
        bf = 480 >>> 101 | 480 << -101;
        bg = Long.reverse(246318313503294851L);
        bh = Long.reverse(-5908722711110090752L);
        bi = (131072 >>> 241 | 131072 << ~241 + 1) & 0xFFFFFFFF;
        bj = 0 >>> 138 | 0 << -138;
        bk = Integer.reverse(0x8000000);
        bl = -1 >>> 78 | -1 << ~78 + 1;
        bm = Long.reverse(-5950634773758507645L);
        bn = Integer.reverse(0);
        bo = 0 >>> 140 | 0 << ~140 + 1;
        bp = Integer.reverse(0);
        bq = (48128 >>> 10 | 48128 << -10) & 0xFFFFFFFF;
        br = (0 >>> 34 | 0 << ~34 + 1) & 0xFFFFFFFF;
        bs = 0x4400000 >>> 150 | 0x4400000 << ~150 + 1;
        bt = Long.reverse(246318313503294851L);
        bu = Long.reverse(-5908722711110090752L);
        bv = Integer.reverse(0);
        bw = Integer.reverse(0x48000000);
        bx = Long.reverse(-5950634773758507645L);
        by = Integer.reverse(Integer.MIN_VALUE);
        bz = Integer.reverse(0);
        ca = (0x130000 >>> 144 | 0x130000 << -144) & 0xFFFFFFFF;
        cb = Integer.reverse(-939524096);
        var_java_lang_String_arr_a = new String[ca];
        var_java_lang_String_arr_b = new String[cb];
        NLoginCore_078.b();
    }

    private static String a(int n, long l) {
        l ^= 0x75L;
        l ^= 0x4128D900748E0A9BL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(58 + 10), (byte)(41 + 28), (byte)(81 + 2), (byte)(35 + 12), (byte)(20 + 47), (byte)(29 + 37), (byte)(53 + 14), (byte)(34 + 13), (byte)(39 + 41), (byte)(25 + 50), 67, (byte)(28 + 55), 53, (byte)(26 + 54), (byte)(5 + 92), (byte)(6 + 94), (byte)(25 + 75), (byte)(21 + 84), (byte)(66 + 44), (byte)(14 + 89)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_027.E("ԣ԰ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿ࢕࢘࢜࢈ࢌ࢙ࢋࢠࢡࡵ࢓ࢎ࢞", (byte)4, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_078.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public NLoginCore_078(nLoginBungee nLoginBungee2, NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_proxy_bungee_nLoginBungee_c = nLoginBungee2;
        this.B = NLoginType_008;
    }

    @EventHandler(priority=-64)
    public void a(TabCompleteEvent tabCompleteEvent) {
        if (tabCompleteEvent.isCancelled()) {
            return;
        }
        Connection connection = tabCompleteEvent.getSender();
        if (!(connection instanceof ProxiedPlayer)) {
            return;
        }
        ProxiedPlayer proxiedPlayer = (ProxiedPlayer)connection;
        try {
            List list = tabCompleteEvent.getSuggestions();
            if (list.isEmpty()) {
                return;
            }
            String string = tabCompleteEvent.getCursor().trim();
            if (!string.isEmpty() && string.charAt(p) != q) {
                return;
            }
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_c.java_lang_Object_b().a(proxiedPlayer);
            if (NLoginCore_277.S()) {
                return;
            }
            int n = NLoginCore_277.i((String)NLoginCore_078.c("㺀", (int)r, (long)(s ^ t))) || NLoginCore_277.i((String)NLoginCore_078.c("㺃", (int)u, (long)(v ^ w))) ? x : y;
            list.removeIf(arg_0 -> this.a(n != 0, NLoginCore_277, arg_0));
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_078.c("㺆", (int)z, (long)(aa ^ ab)) + tabCompleteEvent.getClass().getSimpleName() + (String)NLoginCore_078.c("㺉", (int)ac, (long)(ad ^ ae)) + proxiedPlayer.getName() + (String)NLoginCore_078.c("㺌", (int)af, (long)ag), throwable, new Object[ah]);
            tabCompleteEvent.setCancelled(ai != 0);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginCore_078.c("㺏", (int)aj, (long)(ak ^ al))));
        }
    }

    @EventHandler
    public void a(ServerKickEvent serverKickEvent) {
        if (serverKickEvent.isCancelled()) {
            return;
        }
        String string = BaseComponent.toLegacyText((BaseComponent[])serverKickEvent.getKickReasonComponent());
        if (string.equalsIgnoreCase((String)NLoginCore_078.c("㺀", (int)(ay & az), (long)ba))) {
            serverKickEvent.setCancelled(bb != 0);
        }
    }

    @EventHandler
    public void a(SettingsChangedEvent settingsChangedEvent) {
        ProxiedPlayer proxiedPlayer = settingsChangedEvent.getPlayer();
        if (!(proxiedPlayer instanceof UserConnection)) {
            return;
        }
        try {
            NLoginCore_509 NLoginCore_5092;
            NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_proxy_bungee_nLoginBungee_c.java_lang_Object_b().a(proxiedPlayer);
            if (NLoginCore_277.S()) {
                return;
            }
            ClientSettings clientSettings = ((UserConnection)proxiedPlayer).getSettings();
            NLoginCore_055 NLoginCore_0552 = NLoginCore_055.c(clientSettings.getLocale());
            if (NLoginCore_0552 != null && (NLoginCore_5092 = this.B.com_nickuc_login_NLoginCore_187_a().a(NLoginCore_277)) != null) {
                NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_i, (Object)NLoginCore_0552);
            }
        }
        catch (Throwable throwable) {
            NLoginCore_370.c((String)NLoginCore_078.c("㺀", (int)am, (long)an) + settingsChangedEvent.getClass().getSimpleName() + (String)NLoginCore_078.c("㺃", (int)(ao & ap), (long)aq) + proxiedPlayer.getName() + (String)NLoginCore_078.c("㺆", (int)ar, (long)(as ^ at)), throwable, new Object[au]);
            proxiedPlayer.disconnect(TextComponent.fromLegacyText((String)NLoginCore_078.c("㺉", (int)av, (long)(aw ^ ax))));
        }
    }
}

