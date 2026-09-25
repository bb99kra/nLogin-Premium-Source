/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_506;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.io.File;
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
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class NLoginCore_510 {
    GameMode var_org_bukkit_GameMode_a;
    private static int k;
    private static long var_long_h;
    float var_float_c;
    int var_int_h;
    private static long var_long_d;
    final File var_java_io_File_b;
    boolean var_boolean_h;
    final Player var_org_bukkit_entity_Player_a;
    Location var_org_bukkit_Location_h;
    private static long var_long_g;
    boolean var_boolean_e;
    float var_float_d;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_e;
    volatile NLoginCore_506 var_com_nickuc_login_NLoginCore_506_a = NLoginCore_506.var_com_nickuc_login_NLoginCore_506_b;
    private static int var_int_f;
    @Nullable
    Location var_org_bukkit_Location_g;
    boolean var_boolean_i;
    private static int var_int_b;
    boolean var_boolean_g;
    private static long var_long_c;
    private static int j;
    boolean var_boolean_d;
    private static String[] var_java_lang_String_arr_b;
    boolean var_boolean_f;
    int var_int_i;
    double var_double_d;
    private static int var_int_a;

    @Generated
    public void a(@Nullable Location location) {
        this.var_org_bukkit_Location_g = location;
    }

    private static String a(int n, long l) {
        l ^= 0x40L;
        l ^= 0xF88E7BCF83116EACL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(44 + 24), (byte)(7 + 62), 83, (byte)(19 + 28), (byte)(48 + 19), (byte)(33 + 33), (byte)(54 + 13), (byte)(20 + 27), (byte)(10 + 70), (byte)(24 + 51), (byte)(25 + 42), (byte)(34 + 49), 53, (byte)(53 + 27), (byte)(31 + 66), (byte)(31 + 69), (byte)(15 + 85), (byte)(60 + 45), (byte)(20 + 90), (byte)(55 + 48)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), (byte)(49 + 34)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_387.F("ոօքՇևփվև֒ցՎ֌֐։֌֒Քࣲ࣏࣯࣭ࣦ࣑࣬࣬࣎", (byte)89, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_510.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public void b(Location location) {
        this.var_org_bukkit_Location_h = location;
    }

    public void h() {
        this.var_boolean_f = var_int_a;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = 0 >>> 167 | 0 << -167;
        var_long_d = Long.reverse(-5835292847125597671L);
        var_long_e = Long.reverse(0x200000000000000L);
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        var_long_g = Long.reverse(-5835292847125597671L);
        var_long_h = Long.reverse(0x200000000000000L);
        j = (Integer.MIN_VALUE >>> 126 | Integer.MIN_VALUE << -126) & 0xFFFFFFFF;
        k = (0x4000000 >>> 249 | 0x4000000 << ~249 + 1) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_510.b();
    }

    private static void b() {
        int n;
        var_long_c = -7471808789503074059L;
        long l = var_long_c ^ 0xF88E7BCF83116EACL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(24 + 44), (byte)(13 + 56), (byte)(50 + 33), (byte)(17 + 30), (byte)(63 + 4), (byte)(63 + 3), (byte)(21 + 46), (byte)(24 + 23), 80, (byte)(22 + 53), (byte)(16 + 51), (byte)(47 + 36), (byte)(5 + 48), 80, (byte)(12 + 85), (byte)(24 + 76), (byte)(59 + 41), (byte)(17 + 88), (byte)(103 + 7), (byte)(46 + 57)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_510.var_java_lang_String_arr_b[0] = NLoginCore_201.E("՘ԴԕԘ՗Բ՞ԟԾԛՑԗԝ՘ՕՊՇԦՠՇգՆԿԩդԿ՟ՆղԶյե", (byte)37, 69);
                    NLoginCore_510.var_java_lang_String_arr_b[1] = NLoginCore_173.F("Չԙ՚ԬԖՎԛԬՒՓՄԩ", (byte)37, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_510.var_java_lang_String_arr_b[0] = NLoginCore_110.A("ŀĜýĀĿĚņćĦăĹÿąŀĽĲįĎňįŋģēİĺřŋĺĚŀŖŞ", (byte)37, 65);
                    NLoginCore_510.var_java_lang_String_arr_b[1] = NLoginCore_201.C("ѭѲҗғҋҍҀѲҀҡґѬ", (byte)37, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_510.var_java_lang_String_arr_b[0] = NLoginCore_076.A("ľĺŅıĦĳĴđľĽġÿČĮĦĨĄŇŋņőŅĜĝ", (byte)37, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_510.var_java_lang_String_arr_b[0] = NLoginCore_451.C("їѬҒѱўҙҖѲқјѤѹҪѹҟѸѪҗ҉ѦѭѤҟ҄ҞҮҮҔѹѬҪҷ", (byte)37, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_510.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԓԵԷԗԻ՚ՒըՔԣա՗ե՟ԨՍկծզլզԻ", (byte)47, 69), NLoginCore_510.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_453.D("ҥҲұѴҴҰҫҴҿҮѻҹҽҶҹҿҁ߼ࠜ࠙࠙ࠟ߻ࠚࠓ߾Җ", (byte)47, 68) + string + NLoginCore_110.A("ė", (byte)47, 65) + methodType.toString(), exception);
        }
    }

    public NLoginCore_510(Player player, File file) {
        this.var_org_bukkit_entity_Player_a = player;
        this.var_java_io_File_b = file;
    }

    @Generated
    public String toString() {
        return (String)NLoginCore_510.c("㺀", (int)var_int_b, (long)(var_long_d ^ var_long_e)) + (Object)((Object)this.var_com_nickuc_login_NLoginCore_506_a) + (String)NLoginCore_510.c("㺃", (int)var_int_f, (long)(var_long_g ^ var_long_h));
    }
}

