/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.NLoginInterface_030;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_087;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginInterface_025;
import com.nickuc.login.NLoginCore_033;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.plugin.PluginManager;

public class NLoginCore_252
implements NLoginInterface_030,
NLoginInterface_025 {
    private static int var_int_b;
    private final nLoginBukkit n;
    private static String[] var_java_lang_String_arr_b;
    private static long d;
    private static int e;
    private static int j;
    private static String[] var_java_lang_String_arr_a;
    private static long h;
    private NLoginCore_087 var_com_nickuc_login_NLoginCore_087_a;
    private static int var_int_a;
    private static long f;
    private static int g;
    private static long i;
    private static int k;
    private static long c;

    @Override
    public NLoginInterface_031 com_nickuc_login_NLoginInterface_031_a() {
        throw new UnsupportedOperationException((String)NLoginCore_252.c("㺀", (int)e, (long)f));
    }

    @Generated
    public NLoginCore_252(nLoginBukkit nLoginBukkit2) {
        this.n = nLoginBukkit2;
    }

    @Override
    public NLoginCore_033 com_nickuc_login_NLoginCore_033_a() {
        throw new UnsupportedOperationException((String)NLoginCore_252.c("㺀", (int)g, (long)(h ^ i)));
    }

    static {
        var_int_a = (0 >>> 227 | 0 << -227) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(-1);
        d = Long.reverse(-943954654571020931L);
        e = 65536 >>> 16 | 65536 << ~16 + 1;
        f = Long.reverse(-943954654571020931L);
        g = Integer.reverse(0x40000000);
        h = Long.reverse(-2817452099557147267L);
        i = Long.reverse(0x2A00000000000000L);
        j = 786432 >>> 178 | 786432 << ~178 + 1;
        k = Integer.reverse(-1073741824);
        var_java_lang_String_arr_a = new String[j];
        var_java_lang_String_arr_b = new String[k];
        NLoginCore_252.b();
    }

    @Override
    @Generated
    public NLoginCore_087 com_nickuc_login_NLoginCore_087_a() {
        return this.var_com_nickuc_login_NLoginCore_087_a;
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        this.k();
    }

    private static String a(int n, long l) {
        l ^= 0x54L;
        l ^= 0xACA234AC8CF2FD6DL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(17 + 51), 69, (byte)(82 + 1), (byte)(30 + 17), (byte)(31 + 36), (byte)(15 + 51), (byte)(36 + 31), (byte)(17 + 30), (byte)(45 + 35), (byte)(70 + 5), (byte)(30 + 37), (byte)(23 + 60), (byte)(14 + 39), (byte)(9 + 71), (byte)(51 + 46), (byte)(48 + 52), 100, (byte)(11 + 94), (byte)(99 + 11), (byte)(39 + 64)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(67 + 16)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_092.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠬࠥࠞ࠲ࠏࠨࠠࠕࠪࠢ", (byte)54, 68));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_252.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = -4702342622656174309L;
        long l = c ^ 0xACA234AC8CF2FD6DL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(53 + 16), (byte)(52 + 31), (byte)(12 + 35), (byte)(64 + 3), (byte)(56 + 10), 67, (byte)(27 + 20), (byte)(30 + 50), (byte)(7 + 68), (byte)(5 + 62), (byte)(13 + 70), (byte)(15 + 38), (byte)(15 + 65), (byte)(48 + 49), (byte)(63 + 37), 100, (byte)(15 + 90), (byte)(75 + 35), (byte)(49 + 54)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
                    NLoginCore_252.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ĒĎĸēĻĠĐąŅĺĥĲĊŉĩċģĞĠğĒěĘę", (byte)35, 65);
                    NLoginCore_252.var_java_lang_String_arr_b[1] = NLoginCore_138.E("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ԰ԱկնԮդՈնԻԹՖՉ՚ՌՔ՗՞նքՇյ՚ժ֋՘եՒՓ", (byte)35, 69);
                    NLoginCore_252.var_java_lang_String_arr_b[2] = NLoginCore_004.F("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ԰ԱկնԮդՈնԻԹՖՉ՚ՌՔ՗՞նքՇյ՚ժ֋՘եՒՓ", (byte)35, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_252.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ԬԨՒԭՕԺԪԟ՟ՔԾՠԬԴ՚Բ՝՗ԳՌՁԵԲԳ", (byte)35, 70);
                    NLoginCore_252.var_java_lang_String_arr_b[1] = NLoginCore_027.E("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ԰ԱկնԮդՈնԻԹՖՉ՚ՌՓրքցդբպ՛ՊյֆՕՒՓ", (byte)35, 69);
                    NLoginCore_252.var_java_lang_String_arr_b[2] = NLoginCore_110.D("щѱѸҎҚѱғѬғҞҎҙѵѤҔѼғ҅Ҕ҅҄ҜҙҚҎѿ҉ҮѯѰҮҵѭң҇ҵѺѸҕ҈ҙҋҔҟӀҥ҄҄Ғ҈ӀӀӋӊґҒ", (byte)35, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_252.var_java_lang_String_arr_b[0] = NLoginCore_092.C("ѯѢҎѴѫѰҙқѰј҂ѻѰҚқҀѷ҇ѠѦѵ҃ҊҏҚҩҁҧҔҊҴѲ", (byte)35, 67);
                    continue block7;
                }
                case 4: {
                    NLoginCore_252.var_java_lang_String_arr_b[0] = NLoginCore_004.F("ԢՋԘՍՐԽԲՎԶԱԔԬՍԡԲ՟եՆԻ՛ԞԵԲԳ", (byte)35, 70);
                }
            }
        }
    }

    @Override
    public void l() {
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_252.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_138.B("ŋŭůŏųƒƊƠƌśƙƏƝƗŠƅƧƦƞƤƞų", (byte)82, 66), NLoginCore_252.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_201.D("ԎԛԚӝԝԙԔԝԨԗӤԢԦԟԢԨӪࢀࡹࡲࢆࡣࡼࡴࡩࡾࡶԀ", (byte)82, 68) + string + NLoginCore_091.E("Ո", (byte)82, 69) + methodType.toString(), exception);
        }
    }

    @Override
    public void k() {
        PluginManager pluginManager = this.n.org_bukkit_Server_a().getPluginManager();
        if (pluginManager.getPlugin((String)NLoginCore_252.c("㺀", (int)(var_int_a & var_int_b), (long)d)) != null) {
            this.var_com_nickuc_login_NLoginCore_087_a = new NLoginCore_087();
        }
    }
}

