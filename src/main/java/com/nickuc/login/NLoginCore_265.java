/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nullable
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.World
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class NLoginCore_265 {
    private static String[] var_java_lang_String_arr_b;
    private static int var_int_a;
    private static String[] var_java_lang_String_arr_a;
    private static long var_long_c;
    private static int d;
    private static int var_int_c;
    private static long var_long_b;

    static {
        var_int_a = Integer.reverse(0);
        var_long_b = Long.reverse(-7096634573547640957L);
        var_int_c = Integer.reverse(Integer.MIN_VALUE);
        d = Integer.reverse(Integer.MIN_VALUE);
        var_java_lang_String_arr_a = new String[var_int_c];
        var_java_lang_String_arr_b = new String[d];
        NLoginCore_265.b();
    }

    public void a(Location location, DataOutputStream dataOutputStream) {
        World world = location.getWorld();
        if (world == null) {
            throw new IllegalArgumentException((String)NLoginCore_265.c("㺀", (int)var_int_a, (long)var_long_b));
        }
        dataOutputStream.writeUTF(world.getName());
        dataOutputStream.writeDouble(location.getX());
        dataOutputStream.writeDouble(location.getY());
        dataOutputStream.writeDouble(location.getZ());
        dataOutputStream.writeFloat(location.getYaw());
        dataOutputStream.writeFloat(location.getPitch());
    }

    private static void b() {
        int n;
        var_long_c = -4474335652178181757L;
        long l = var_long_c ^ 0xDCDE99F7933B72F1L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(58 + 11), (byte)(42 + 41), (byte)(16 + 31), 67, (byte)(16 + 50), (byte)(3 + 64), (byte)(27 + 20), (byte)(50 + 30), (byte)(9 + 66), (byte)(66 + 1), (byte)(60 + 23), (byte)(3 + 50), (byte)(39 + 41), 97, (byte)(49 + 51), (byte)(50 + 50), (byte)(9 + 96), (byte)(71 + 39), (byte)(61 + 42)}, StandardCharsets.UTF_8));
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
                    NLoginCore_265.var_java_lang_String_arr_b[0] = NLoginCore_559.F("ոբՙ֋ղզձ֠չ֛֓֗ճ֟յ՚֙չժ֧ընճմ", (byte)100, 70);
                    continue block7;
                }
                case 1: {
                    NLoginCore_265.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ԹԣԚՌԳԧԲաԺՔ՝ԯ՗ԾթԼդեՙՙԫիՊԮԫըԫՇՌՔԴՋ", (byte)100, 68);
                    continue block7;
                }
                case 2: {
                    NLoginCore_265.var_java_lang_String_arr_b[0] = NLoginCore_004.E("ղշմ֓՚մռցմր֒֕րգ֏֢֘֗ի֖֝նճմ", (byte)100, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_265.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ƽƌƯƼƑžƴƯƟƝƅƏ", (byte)100, 65);
                }
            }
        }
    }

    @CheckReturnValue
    @Nullable
    public Location a(DataInputStream dataInputStream) {
        String string = dataInputStream.readUTF();
        double d = dataInputStream.readDouble();
        double d2 = dataInputStream.readDouble();
        double d3 = dataInputStream.readDouble();
        float f = dataInputStream.readFloat();
        float f2 = dataInputStream.readFloat();
        World world = Bukkit.getServer().getWorld(string);
        return world != null ? new Location(world, d, d2, d3, f, f2) : null;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_265.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_384.D("Քնո՘ռ֛֓֩֕դ֢֦֘֠թ֎ְ֧֧֭֯ռ", (byte)125, 68), NLoginCore_265.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_384.D("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩իࣦࣶࣼࣼࣷऀँँइր", (byte)125, 68) + string + NLoginCore_223.E("ճ", (byte)125, 69) + methodType.toString(), exception);
        }
    }

    private static String a(int n, long l) {
        l ^= 0x3AL;
        l ^= 0xDCDE99F7933B72F1L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(16 + 52), (byte)(2 + 67), (byte)(46 + 37), (byte)(45 + 2), (byte)(21 + 46), 66, (byte)(66 + 1), 47, (byte)(22 + 58), (byte)(72 + 3), (byte)(65 + 2), (byte)(77 + 6), (byte)(14 + 39), (byte)(48 + 32), (byte)(33 + 64), (byte)(46 + 54), (byte)(33 + 67), (byte)(44 + 61), (byte)(11 + 99), (byte)(71 + 32)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_324.E("ծջպԽսչմսֈշՄւֆտւֈՊࣛࣅࣦࣕࣛࣖࣟ࣠࣠", (byte)79, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_265.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }
}

