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

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_276;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
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

public class NLoginCore_260
implements NLoginInterface_027 {
    private static int var_int_h;
    private static long r;
    private static int k;
    private static int g;
    private static int y;
    private static String[] var_java_lang_String_arr_b;
    private static long c;
    private static int aa;
    private static int j;
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_h;
    private static String[] var_java_lang_String_arr_a;
    private static int var_int_a;
    private static int e;
    private static long i;
    private static int s;
    private static int n;
    private static int w;
    private static long var_long_b;
    private static long u;
    private static long f;
    private static int t;
    private static long q;
    private static int x;
    private static int p;
    private static int l;
    private static int v;
    private static int m;
    private static int z;
    private static long d;
    private static int o;

    private static void b() {
        int n;
        c = -7383138746318239229L;
        long l = c ^ 0x6D708476028AFDAFL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(22 + 47), (byte)(24 + 59), (byte)(6 + 41), (byte)(58 + 9), (byte)(30 + 36), 67, (byte)(15 + 32), (byte)(17 + 63), (byte)(62 + 13), (byte)(60 + 7), (byte)(12 + 71), (byte)(39 + 14), (byte)(10 + 70), (byte)(96 + 1), (byte)(80 + 20), (byte)(51 + 49), (byte)(54 + 51), 110, (byte)(66 + 37)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
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
                    NLoginCore_260.var_java_lang_String_arr_b[0] = NLoginCore_201.D("юцРѐрсігњЖњС", (byte)12, 68);
                    NLoginCore_260.var_java_lang_String_arr_b[1] = NLoginCore_201.D("МоРЯЪЕбЧИХЕЙѕкяьјѓџёнжйџѥЦэѡфѭѢѩ", (byte)12, 68);
                    NLoginCore_260.var_java_lang_String_arr_b[2] = NLoginCore_201.C("ЌЧФПюЧщдєшябэеМбПѠйѕфЯЬЭ", (byte)12, 67);
                    NLoginCore_260.var_java_lang_String_arr_b[3] = NLoginCore_384.D("ХФШЧѕщщуеШЛС", (byte)12, 68);
                    NLoginCore_260.var_java_lang_String_arr_b[4] = NLoginCore_092.C("ФтшТОХЩххУаС", (byte)12, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_260.var_java_lang_String_arr_b[0] = NLoginCore_223.A("êÚâÐæāáëÒãĈß", (byte)12, 65);
                    NLoginCore_260.var_java_lang_String_arr_b[1] = NLoginCore_173.C("МоРЯЪЕбЧИХЕЙѕкяьјѓџёнлеўѨзФйЮяѝн", (byte)12, 67);
                    NLoginCore_260.var_java_lang_String_arr_b[2] = NLoginCore_091.D("ЌЧФПюЧщдєшюЦЖњЮёэвўцХузмптьЩўзТѣ", (byte)12, 68);
                    NLoginCore_260.var_java_lang_String_arr_b[3] = NLoginCore_453.F("ԍԵԞԱԲԄԲԝԉԺԽԐ", (byte)12, 70);
                    NLoginCore_260.var_java_lang_String_arr_b[4] = NLoginCore_324.D("вЋвозбсежЗЬЯЯбјЩкѝямгѥЬЭ", (byte)12, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_260.var_java_lang_String_arr_b[0] = NLoginCore_451.C("уђмѕѐФЩЬЯјЯЕбМшМТєРѠгѥЬЭ", (byte)12, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_260.var_java_lang_String_arr_b[0] = NLoginCore_223.F("ԟӾӼԗԹԡԧԔԘԃԴԊՇՌԎՊԾԝՇԒԴԞԛԜ", (byte)12, 70);
                }
            }
        }
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
        if (!tabCompleteEvent.getBuffer().startsWith((String)NLoginCore_260.c("㺀", (int)var_int_a, (long)(var_long_b ^ d)))) {
            return;
        }
        NLoginCore_277 NLoginCore_277 = this.var_com_nickuc_login_NLoginType_008_h.java_lang_Object_b().a(commandSender);
        int n = NLoginCore_277.i((String)NLoginCore_260.c("㺃", (int)e, (long)f)) || NLoginCore_277.i((String)NLoginCore_260.c("㺆", (int)(g & var_int_h), (long)i)) ? j : k;
        ArrayList<String> arrayList = new ArrayList<String>(tabCompleteEvent.getCompletions());
        arrayList.removeIf(arg_0 -> this.a(n != 0, NLoginCore_277, arg_0));
        tabCompleteEvent.setCompletions(arrayList);
    }

    static {
        var_int_a = (0 >>> 12 | 0 << ~12 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(-4588356298477956711L);
        d = Long.reverse(-2017612633061982208L);
        e = 128 >>> 39 | 128 << -39;
        f = Long.reverse(2617403105314836889L);
        g = Integer.reverse(0x40000000);
        var_int_h = -1 >>> 156 | -1 << ~156 + 1;
        i = Long.reverse(2617403105314836889L);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = (0 >>> 50 | 0 << ~50 + 1) & 0xFFFFFFFF;
        l = Integer.reverse(0);
        m = 0 >>> 164 | 0 << ~164 + 1;
        n = (0x2F000000 >>> 216 | 0x2F000000 << ~216 + 1) & 0xFFFFFFFF;
        o = (0 >>> 37 | 0 << -37) & 0xFFFFFFFF;
        p = Integer.reverse(-1073741824);
        q = Long.reverse(-4588356298477956711L);
        r = Long.reverse(-2017612633061982208L);
        s = (0 >>> 222 | 0 << -222) & 0xFFFFFFFF;
        t = Integer.reverse(0x20000000);
        u = Long.reverse(2617403105314836889L);
        v = Integer.reverse(Integer.MIN_VALUE);
        w = (0 >>> 44 | 0 << ~44 + 1) & 0xFFFFFFFF;
        x = Integer.reverse(Integer.MIN_VALUE);
        y = Integer.reverse(0);
        z = (320 >>> 70 | 320 << -70) & 0xFFFFFFFF;
        aa = Integer.reverse(-1610612736);
        var_java_lang_String_arr_a = new String[z];
        var_java_lang_String_arr_b = new String[aa];
        NLoginCore_260.b();
    }

    private static String a(int n, long l) {
        l ^= 0x27L;
        l ^= 0x6D708476028AFDAFL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(63 + 5), (byte)(24 + 45), (byte)(62 + 21), (byte)(16 + 31), (byte)(49 + 18), 66, (byte)(11 + 56), (byte)(26 + 21), (byte)(64 + 16), (byte)(36 + 39), (byte)(5 + 62), (byte)(22 + 61), (byte)(13 + 40), (byte)(43 + 37), (byte)(26 + 71), (byte)(25 + 75), (byte)(91 + 9), 105, (byte)(21 + 89), (byte)(10 + 93)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(67 + 16)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.C("ԈԕԔӗԗԓԎԗԢԑӞԜԠԙԜԢӤ࡬ࡺࡩ࡟ࡶࡱࢂࡥࡺࡽࡱࢀ", (byte)80, 67));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_260.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_260.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_076.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝՗ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_260.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČҔҢґ҇ҞҙҪҍҢҥҙҨĤ", (byte)39, 66) + string + NLoginCore_091.E("ԝ", (byte)39, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public NLoginCore_260(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginType_008_h = NLoginType_008;
    }

    private /* synthetic */ boolean a(boolean bl, NLoginCore_277 NLoginCore_277, String string) {
        if (string.trim().isEmpty()) {
            return l != 0;
        }
        if (string.charAt(m) != n) {
            return o != 0;
        }
        String[] stringArray = string.split((String)NLoginCore_260.c("㺀", (int)p, (long)(q ^ r)));
        String string2 = stringArray[s].toLowerCase(Locale.ENGLISH);
        if (!bl && string2.equals(NLoginCore_260.c("㺃", (int)t, (long)u))) {
            return v != 0;
        }
        if (this.var_com_nickuc_login_NLoginType_008_h.com_nickuc_login_NLoginCore_187_a().boolean_b(NLoginCore_277)) {
            return w != 0;
        }
        NLoginCore_276 NLoginCore_2762 = this.var_com_nickuc_login_NLoginType_008_h.com_nickuc_login_NLoginCore_276_a();
        return (NLoginCore_2762 == null || NLoginCore_2762.b(string2) ? x : y) != 0;
    }
}

