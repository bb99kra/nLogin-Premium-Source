/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.TextComponent
 *  net.kyori.adventure.text.event.ClickEvent
 *  net.kyori.adventure.text.event.HoverEvent
 *  net.kyori.adventure.text.event.HoverEventSource
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.GUIButtonContainer;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_581;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_190;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_024;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_065;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.event.HoverEventSource;

public class NLoginCore_541
implements NLoginInterface_024 {
    private static final TextComponent var_net_kyori_adventure_text_TextComponent_a;
    private static long var_long_c;
    private static int u;
    private final NLoginCore_509 var_com_nickuc_login_NLoginCore_509_a;
    private static int s;
    private static int w;
    private static int m;
    private static int q;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_b;
    private static int g;
    private static int t;
    private static int j;
    private static int d;
    private static long l;
    private final NLoginCore_277 var_com_nickuc_login_NLoginCore_277_b;
    private static String[] var_java_lang_String_arr_b;
    private static long z;
    private static long y;
    private static long r;
    private static long n;
    private static int f;
    private final NLoginCore_581 var_com_nickuc_login_NLoginCore_581_a;
    private static int e;
    private static int v;
    private static long h;
    private static long o;
    private static int k;
    private static long i;
    private static int x;
    private static int p;
    private static int var_int_c;

    private TextComponent a(String string, boolean bl) {
        return NLoginCore_529.b(string, bl);
    }

    @Generated
    NLoginCore_541(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, NLoginCore_581 NLoginCore_5812) {
        this.var_com_nickuc_login_NLoginCore_277_b = NLoginCore_277;
        this.var_com_nickuc_login_NLoginCore_509_a = NLoginCore_5092;
        this.var_com_nickuc_login_NLoginCore_581_a = NLoginCore_5812;
    }

    @Override
    public NLoginCore_277 a() {
        return this.var_com_nickuc_login_NLoginCore_277_b;
    }

    static {
        var_int_a = (4 >>> 34 | 4 << ~34 + 1) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = (394264576 >>> 247 | 394264576 << -247) & 0xFFFFFFFF;
        e = Integer.reverse(-201326592);
        f = Integer.reverse(0x40000000);
        g = (0 >>> 231 | 0 << -231) & 0xFFFFFFFF;
        h = Long.reverse(-6982815707956078169L);
        i = Long.reverse(-5188146770730811392L);
        j = (16 >>> 68 | 16 << -68) & 0xFFFFFFFF;
        k = Integer.reverse(-1);
        l = Long.reverse(2817017081202121127L);
        m = Integer.reverse(0x40000000);
        n = Long.reverse(-6982815707956078169L);
        o = Long.reverse(-5188146770730811392L);
        p = Integer.reverse(-1073741824);
        q = -1 >>> 244 | -1 << ~244 + 1;
        r = Long.reverse(2817017081202121127L);
        s = (0 >>> 114 | 0 << -114) & 0xFFFFFFFF;
        t = (0 >>> 215 | 0 << -215) & 0xFFFFFFFF;
        u = Integer.reverse(0);
        v = (655360 >>> 145 | 655360 << -145) & 0xFFFFFFFF;
        w = Integer.reverse(-1610612736);
        x = Integer.reverse(0x20000000);
        y = Long.reverse(-6982815707956078169L);
        z = Long.reverse(-5188146770730811392L);
        var_java_lang_String_arr_a = new String[v];
        var_java_lang_String_arr_b = new String[w];
        NLoginCore_541.b();
        var_net_kyori_adventure_text_TextComponent_a = Component.text((String)NLoginCore_541.c("㺀", (int)x, (long)(y ^ z)));
    }

    @Override
    public void a(String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        TextComponent textComponent = this.a(string, var_int_a != 0);
        if (string2 != null) {
            textComponent = textComponent.hoverEvent((HoverEventSource)HoverEvent.showText((Component)this.a(string2, var_int_b != 0)));
        }
        if (string3 != null) {
            textComponent = textComponent.clickEvent(ClickEvent.suggestCommand((String)NLoginCore_065.m(string3)));
        } else if (string4 != null) {
            if (!(string4 = NLoginCore_065.m(string4)).isEmpty()) {
                char c = string4.charAt(var_int_c);
                if (c != d) {
                    string4 = (char)e + string4;
                }
                textComponent = textComponent.clickEvent(ClickEvent.runCommand((String)string4));
            }
        } else if (string5 != null) {
            textComponent = textComponent.clickEvent(ClickEvent.openUrl((String)NLoginCore_065.m(string5)));
        }
        this.var_com_nickuc_login_NLoginCore_581_a.a(this.var_com_nickuc_login_NLoginCore_277_b, (Component)textComponent);
    }

    private static String a(int n, long l) {
        l ^= 0x1DL;
        l ^= 0xF1948BF09BCA69DEL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(55 + 13), 69, (byte)(27 + 56), (byte)(43 + 4), (byte)(34 + 33), (byte)(36 + 30), (byte)(59 + 8), (byte)(36 + 11), (byte)(12 + 68), (byte)(49 + 26), (byte)(60 + 7), (byte)(51 + 32), (byte)(47 + 6), (byte)(46 + 34), (byte)(32 + 65), 100, (byte)(76 + 24), (byte)(49 + 56), (byte)(36 + 74), (byte)(58 + 45)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࡺࢠ࢖࢏ࢢ࢓࢖࢙", (byte)92, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_541.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Override
    public void a(int n, GUIButtonContainer[] GUIButtonContainerArray) {
        if (GUIButtonContainerArray.length == 0) {
            return;
        }
        if (GUIButtonContainerArray.length > f) {
            throw new IllegalArgumentException((String)NLoginCore_541.c("㺀", (int)g, (long)(h ^ i)) + GUIButtonContainerArray.length);
        }
        TextComponent textComponent = Component.text((String)NLoginCore_541.c("㺃", (int)(j & k), (long)l));
        String string = (String)NLoginCore_541.c("㺆", (int)m, (long)(NLoginCore_541.n ^ o)) + n + (String)NLoginCore_541.c("㺉", (int)(p & q), (long)r);
        for (int i = s; i < GUIButtonContainerArray.length; ++i) {
            if (i > 0) {
                textComponent = (TextComponent)((TextComponent)((TextComponent)textComponent.append((Component)var_net_kyori_adventure_text_TextComponent_a)).append((Component)var_net_kyori_adventure_text_TextComponent_a)).append((Component)var_net_kyori_adventure_text_TextComponent_a);
            }
            GUIButtonContainer GUIButtonContainer2 = GUIButtonContainerArray[i];
            NLoginCore_190 NLoginCore_1902 = GUIButtonContainer2.com_nickuc_login_NLoginCore_190_a();
            Component component = this.a(NLoginCore_1902.ar(), t != 0).clickEvent(ClickEvent.runCommand((String)(string + GUIButtonContainer2.com_nickuc_login_NLoginCore_445_a().v())));
            String string2 = NLoginCore_1902.as();
            if (string2 != null) {
                component = component.hoverEvent((HoverEventSource)HoverEvent.showText((Component)this.a(string2, u != 0)));
            }
            textComponent = (TextComponent)textComponent.append(component);
        }
        try {
            textComponent = (TextComponent)textComponent.appendNewline();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            textComponent = (TextComponent)textComponent.append((Component)Component.newline());
        }
        this.var_com_nickuc_login_NLoginCore_581_a.a(this.var_com_nickuc_login_NLoginCore_277_b, (Component)textComponent);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_541.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_004.D("ҔҶҸҘҼӛӓөӕҤӢӘӦӠҩӎӰӯӧӭӧҼ", (byte)61, 68), NLoginCore_541.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫࠝࡃ࠹࠲ࡅ࠶࠹࠼ҿ", (byte)61, 68) + string + NLoginCore_324.A("ĳ", (byte)61, 65) + methodType.toString(), exception);
        }
    }

    @Override
    public void c(String string, String string2) {
        this.d(string, null, string2);
    }

    private static void b() {
        int n;
        var_long_c = -1902415922699691783L;
        long l = var_long_c ^ 0xF1948BF09BCA69DEL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), (byte)(68 + 1), (byte)(75 + 8), (byte)(41 + 6), (byte)(23 + 44), (byte)(10 + 56), (byte)(9 + 58), (byte)(3 + 44), (byte)(79 + 1), 75, (byte)(36 + 31), (byte)(31 + 52), (byte)(26 + 27), (byte)(27 + 53), (byte)(27 + 70), (byte)(26 + 74), (byte)(90 + 10), (byte)(79 + 26), 110, (byte)(5 + 98)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_541.var_java_lang_String_arr_b[0] = NLoginCore_223.C("ՏԯՐԘ԰ՔԨդԣ՟ՙ՘ՐԮՐկՂմըՃզԸՏԶմԶյԸՇ՗՜Ս", (byte)103, 67);
                    NLoginCore_541.var_java_lang_String_arr_b[1] = NLoginCore_559.D("ՌՎԜԱզՐԛԦԾ՞ՁԲ", (byte)103, 68);
                    NLoginCore_541.var_java_lang_String_arr_b[2] = NLoginCore_091.B("żƳƜƒƾǈǇƹƯǊƩǋƫƍǍƑƷƗǘƮǖƒƯƮƔǒǟǋƱǠƬǢƢƵǁƺƽǌǚǪƬǆǦƵ", (byte)103, 66);
                    NLoginCore_541.var_java_lang_String_arr_b[3] = NLoginCore_575.B("ƹƥƟƹƽƾƻƃƜƩƋƕ", (byte)103, 66);
                    NLoginCore_541.var_java_lang_String_arr_b[4] = NLoginCore_559.A("ƯƱſƔǉƳžƉơǁƤƕ", (byte)103, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_541.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ֈը։Ցթ֍ա֝՜֑֘֒։է։֨ջ֭֡ռ֟լփ֬֏տ֦֗֠ո֩֋", (byte)103, 70);
                    NLoginCore_541.var_java_lang_String_arr_b[1] = NLoginCore_559.C("ՎԳԸ՘ԱէՅՊԳԢՍԲ", (byte)103, 67);
                    NLoginCore_541.var_java_lang_String_arr_b[2] = NLoginCore_384.D("ԙՐԹԯ՛եդՖՌէՆըՈԪժԮՔԴյՋճԯՌՋԱկռըՎսՉտիցճձսվֆճդցՈՒ", (byte)103, 68);
                    NLoginCore_541.var_java_lang_String_arr_b[3] = NLoginCore_091.D("ՐԟԢ՗ԵՠԲԡ՗ԹգԲ", (byte)103, 68);
                    NLoginCore_541.var_java_lang_String_arr_b[4] = NLoginCore_559.D("ԸՅԿԱԴդՊՙԨէՉԲ", (byte)103, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_541.var_java_lang_String_arr_b[0] = NLoginCore_223.E("է֍֕ո֚֞ս֚֗՟֣ափ֥թ֛֫ս֥֢֟կդևհլյ֫֩ց֘֘", (byte)103, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_541.var_java_lang_String_arr_b[0] = NLoginCore_324.C("ՐՎ՘Թ՞Ք՘ԧԩՈգԲ", (byte)103, 67);
                }
            }
        }
    }
}

