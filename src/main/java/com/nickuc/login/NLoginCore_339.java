/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  javax.annotation.Nullable
 *  net.md_5.bungee.api.connection.PendingConnection
 *  net.md_5.bungee.connection.InitialHandler
 *  net.md_5.bungee.netty.ChannelWrapper
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_370;
import io.netty.channel.Channel;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.connection.InitialHandler;
import net.md_5.bungee.netty.ChannelWrapper;

public class NLoginCore_339 {
    private static String[] var_java_lang_String_arr_b;
    private static int l;
    private static int var_int_h;
    private static final Field var_java_lang_reflect_Field_h;
    private static int var_int_b;
    private static long c;
    private static long var_long_g;
    private static int e;
    private static int k;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static int i;
    private static final Field var_java_lang_reflect_Field_g;
    private static int f;
    private static int j;
    private static long d;

    static {
        var_int_a = 0 >>> 187 | 0 << ~187 + 1;
        var_int_b = -1 >>> 189 | -1 << ~189 + 1;
        d = Long.reverse(1100844421645380329L);
        e = (0x4000000 >>> 250 | 0x4000000 << -250) & 0xFFFFFFFF;
        f = Integer.reverse(-1);
        var_long_g = Long.reverse(1100844421645380329L);
        var_int_h = Integer.reverse(0);
        i = Integer.reverse(0x40000000);
        j = (Integer.MIN_VALUE >>> 30 | Integer.MIN_VALUE << -30) & 0xFFFFFFFF;
        k = (0 >>> 166 | 0 << -166) & 0xFFFFFFFF;
        l = (0 >>> 191 | 0 << -191) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[i];
        var_java_lang_String_arr_b = new String[j];
        NLoginCore_339.b();
        var_java_lang_reflect_Field_g = NLoginCore_546.a(InitialHandler.class, ChannelWrapper.class, k);
        var_java_lang_reflect_Field_h = NLoginCore_546.a(ChannelWrapper.class, Channel.class, l);
    }

    @Nullable
    public static Channel a(Object object, PendingConnection pendingConnection) {
        try {
            InitialHandler initialHandler = (InitialHandler)pendingConnection;
            ChannelWrapper channelWrapper = (ChannelWrapper)var_java_lang_reflect_Field_g.get(initialHandler);
            return (Channel)var_java_lang_reflect_Field_h.get(channelWrapper);
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_339.c("㺀", (int)(var_int_a & var_int_b), (long)d) + object.getClass().getCanonicalName() + (String)NLoginCore_339.c("㺃", (int)(e & f), (long)var_long_g), exception, new Object[var_int_h]);
            return null;
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_339.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_091.A("¯ÑÓ³×öîĄð¿ýóāûÄéċĊĂĈĂ×", (byte)4, 65), NLoginCore_339.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_446.E("ԣ԰ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿ࢐ࢇ࢓࡯ࡾ࢟࢕࢜ࢊࢢࢣࢥ࢏ࢠԙ", (byte)4, 69) + string + NLoginCore_091.E("Ӻ", (byte)4, 69) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x6EL;
        l ^= 0x264F8DB5D37055BCL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(8 + 60), (byte)(61 + 8), (byte)(7 + 76), (byte)(34 + 13), (byte)(60 + 7), (byte)(24 + 42), (byte)(60 + 7), (byte)(19 + 28), 80, (byte)(74 + 1), (byte)(59 + 8), (byte)(2 + 81), (byte)(52 + 1), (byte)(21 + 59), (byte)(24 + 73), (byte)(75 + 25), 100, (byte)(3 + 102), (byte)(11 + 99), (byte)(41 + 62)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.D("юћњНѝљєѝѨїФѢѦџѢѨЪ޻޲޾ޚީߊ߀߇޵ߍߎߐ޺ߋ", (byte)18, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_339.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = -7542081856636755298L;
        long l = c ^ 0x264F8DB5D37055BCL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(2 + 67), (byte)(57 + 26), (byte)(17 + 30), (byte)(18 + 49), (byte)(28 + 38), (byte)(55 + 12), (byte)(43 + 4), (byte)(49 + 31), (byte)(6 + 69), (byte)(59 + 8), (byte)(72 + 11), (byte)(47 + 6), (byte)(26 + 54), 97, (byte)(51 + 49), (byte)(73 + 27), (byte)(10 + 95), 110, (byte)(53 + 50)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_339.var_java_lang_String_arr_b[0] = NLoginCore_324.F("֕չպ֣֗օվ֝ևոլդց֚ւ֣ծետ֟տձֳ֫և֌ֹּ֫֎֍ְ֏׃֎ֵׁ֛֒֓֙ֆ֑֔", (byte)109, 70);
                    NLoginCore_339.var_java_lang_String_arr_b[1] = NLoginCore_201.F("վ֡֙ոձւչ֒֙յիձ", (byte)109, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_339.var_java_lang_String_arr_b[0] = NLoginCore_110.C("ըՌՍժն՘Ցհ՚ՋԿԷՔխՕնՁԸՒղՒՄֆվ՚՟֏֌վաՠփՑր֔ժ֙բիջսվհյ֡ՙձփ՜֓զքյ֘կհ", (byte)109, 67);
                    NLoginCore_339.var_java_lang_String_arr_b[1] = NLoginCore_384.C("ծյէԷժԶԹՌլջՠՐվՋՑջհյՂՙփՒՏՐ", (byte)109, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_339.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ՋթԷՠԶչՋճի՘վտՁ՘պԽ՗ցւշՉբՏՐ", (byte)109, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_339.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ǁƟƫƩƯƵƩƣƚƨƻƘǍǚǠƘƳƽƚƛǝǕƬƭ", (byte)109, 65);
                }
            }
        }
    }
}

