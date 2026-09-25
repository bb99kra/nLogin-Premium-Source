/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.server.TabCompleteEvent
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_387;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.server.TabCompleteEvent;

public class NLoginCore_476
implements NLoginInterface_027 {
    private final Set<String> var_java_util_Set_java_lang_String__i;
    private static int var_int_b;
    private static int m;
    private static String[] var_java_lang_String_arr_a;
    private static int o;
    private static int e;
    private static int var_int_i;
    private static long f;
    private static int l;
    private static int k;
    private static int j;
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static long c;
    private final String af;
    private static long d;
    private static long g;
    private static int n;
    private static int h;

    @Generated
    NLoginCore_476(String string, Set<String> set) {
        this.af = string;
        this.var_java_util_Set_java_lang_String__i = set;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_476.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.A("ŉūŭōűƐƈƞƊřƗƍƛƕŞƃƥƤƜƢƜű", (byte)81, 65), NLoginCore_476.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.C("ԋԘԗӚԚԖԑԚԥԔӡԟԣԜԟԥӧࡼࡣࡣࡤࡦࢇࡲࡨࡺࢆࢂࡻ࡮Ԁ", (byte)81, 67) + string + NLoginCore_092.A("ś", (byte)81, 65) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3CL;
        l ^= 0x3903F7D19119C466L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(52 + 16), (byte)(41 + 28), (byte)(61 + 22), (byte)(28 + 19), (byte)(39 + 28), (byte)(15 + 51), (byte)(30 + 37), (byte)(16 + 31), 80, (byte)(31 + 44), (byte)(32 + 35), (byte)(16 + 67), (byte)(7 + 46), (byte)(58 + 22), 97, (byte)(77 + 23), (byte)(31 + 69), (byte)(75 + 30), (byte)(55 + 55), (byte)(11 + 92)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_091.C("ҽӊӉҌӌӈӃӌӗӆғӑӕӎӑӗҙ࠮ࠕࠕࠖ࠘࠹ࠤࠚࠬ࠸࠴࠭ࠠ", (byte)55, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_476.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    static {
        var_int_a = Integer.reverse(0);
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-1650007546989819113L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(-3091159427748377833L);
        g = Long.reverse(0x3C00000000000000L);
        h = Integer.reverse(0);
        var_int_i = 0 >>> 209 | 0 << -209;
        j = Integer.reverse(-201326592);
        k = Integer.reverse(0x5C000000);
        l = 1 >>> 0 | 1 << -0;
        m = (0 >>> 195 | 0 << ~195 + 1) & 0xFFFFFFFF;
        n = (131072 >>> 240 | 131072 << ~240 + 1) & 0xFFFFFFFF;
        o = Integer.reverse(0x40000000);
        var_java_lang_String_arr_a = new String[n];
        var_java_lang_String_arr_b = new String[o];
        NLoginCore_476.b();
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public void a(TabCompleteEvent tabCompleteEvent) {
        CommandSender commandSender = tabCompleteEvent.getSender();
        if (!(commandSender instanceof Player)) {
            return;
        }
        if (tabCompleteEvent.getCompletions().isEmpty()) {
            return;
        }
        if (!tabCompleteEvent.getBuffer().startsWith((String)NLoginCore_476.c("㺀", (int)(var_int_a & var_int_b), (long)d))) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(tabCompleteEvent.getCompletions());
        arrayList.removeIf(string -> {
            String[] stringArray = string.split((String)NLoginCore_476.c("㺀", (int)e, (long)(f ^ g)));
            if (stringArray.length == 0) {
                return h != 0;
            }
            String string2 = stringArray[var_int_i].toLowerCase(Locale.ENGLISH);
            return (string2.startsWith((char)j + this.af + (char)k) || this.var_java_util_Set_java_lang_String__i.contains(string2) ? l : m) != 0;
        });
        tabCompleteEvent.setCompletions(arrayList);
    }

    private static void b() {
        int n;
        c = -1670079878097037141L;
        long l = c ^ 0x3903F7D19119C466L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(28 + 41), (byte)(59 + 24), (byte)(2 + 45), (byte)(6 + 61), (byte)(36 + 30), (byte)(58 + 9), (byte)(32 + 15), (byte)(6 + 74), (byte)(14 + 61), (byte)(3 + 64), (byte)(38 + 45), (byte)(15 + 38), (byte)(25 + 55), (byte)(72 + 25), 100, 100, (byte)(66 + 39), (byte)(106 + 4), (byte)(11 + 92)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_476.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ůųŪĺſķļƃŜŞƀŋ", (byte)66, 66);
                    NLoginCore_476.var_java_lang_String_arr_b[1] = NLoginCore_173.A("ũŅŊŻůŮŎŐŶſŞŋ", (byte)66, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_476.var_java_lang_String_arr_b[0] = NLoginCore_092.A("ĴœŴŒžżſŜŴśŁŋ", (byte)66, 65);
                    NLoginCore_476.var_java_lang_String_arr_b[1] = NLoginCore_387.F("խձՃձճկռՇ՟խիՆ", (byte)66, 70);
                    continue block7;
                }
                case 2: {
                    NLoginCore_476.var_java_lang_String_arr_b[0] = NLoginCore_138.D("ҳҰӢҳӨҴӐӄӏҽӻӸҷӫӎӑӰӀҽӱӲԉӢӤӹөӚӥӼԌӼӐ", (byte)66, 68);
                    continue block7;
                }
                case 4: {
                    NLoginCore_476.var_java_lang_String_arr_b[0] = NLoginCore_138.C("ӐӊӀӑӸӬӗӎӹӊӽӫӹӰӗӬӝԃӮӐӁӳӣӂҾӹӶӋӦӎӼӓ", (byte)66, 67);
                }
            }
        }
    }
}

