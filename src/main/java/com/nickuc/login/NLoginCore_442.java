/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.Server
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandMap
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.command.SimpleCommandMap
 *  org.bukkit.command.TabCompleter
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_546;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginInterface_021;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public final class NLoginCore_442
implements NLoginInterface_021,
CommandExecutor,
TabCompleter {
    private static int af;
    private static long g;
    private static long ag;
    private static int am;
    private static int x;
    private static long w;
    private static long k;
    private static long v;
    private static int z;
    private static long aj;
    private static long p;
    private static String[] var_java_lang_String_arr_b;
    private static int ai;
    private static int al;
    private static int ad;
    private final NLoginCore_168<?> var_com_nickuc_login_NLoginCore_168____b;
    private PluginCommand var_org_bukkit_command_PluginCommand_a;
    private static int l;
    private static long q;
    private static int var_int_b;
    private static int ab;
    private static int ac;
    private static int aa;
    private static int var_int_a;
    private final Server var_org_bukkit_Server_a;
    private static long d;
    private static long c;
    private static int u;
    private static int ak;
    private static long t;
    private static int ae;
    private static long s;
    private static int ah;
    private static int r;
    private static int h;
    private static int i;
    private static int y;
    private static long j;
    private static int f;
    private static long m;
    private static int o;
    private static long n;
    private static String[] var_java_lang_String_arr_a;
    private static long e;

    @Override
    public void W() {
        this.var_org_bukkit_command_PluginCommand_a = this.a();
        if (this.var_org_bukkit_command_PluginCommand_a == null) {
            return;
        }
        try {
            PluginManager pluginManager = this.var_org_bukkit_Server_a.getPluginManager();
            Field field = NLoginCore_546.a(pluginManager.getClass(), (String)NLoginCore_442.c("㺀", (int)var_int_b, (long)(d ^ e)));
            Object object = field.get(pluginManager);
            if (object instanceof CommandMap) {
                CommandMap commandMap = (CommandMap)object;
                commandMap.register(this.var_java_lang_String_arr_b.a().q().toLowerCase(Locale.ENGLISH), (Command)this.var_org_bukkit_command_PluginCommand_a);
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_442.c("㺃", (int)f, (long)g) + exception.getLocalizedMessage(), exception, new Object[h]);
        }
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        this.var_java_lang_String_arr_b.a(commandSender, commandSender.getName(), commandSender instanceof Player, string, stringArray);
        return var_int_a != 0;
    }

    static {
        var_int_a = Integer.reverse(Integer.MIN_VALUE);
        var_int_b = Integer.reverse(0);
        d = Long.reverse(-6816404267480757652L);
        e = Long.reverse(-1008806316530991104L);
        f = 4096 >>> 204 | 4096 << -204;
        g = Long.reverse(6009847471270414956L);
        h = (0 >>> 6 | 0 << ~6 + 1) & 0xFFFFFFFF;
        i = Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1;
        j = Long.reverse(-6816404267480757652L);
        k = Long.reverse(-1008806316530991104L);
        l = Integer.reverse(-1073741824);
        m = Long.reverse(-6816404267480757652L);
        n = Long.reverse(-1008806316530991104L);
        o = Integer.reverse(0x20000000);
        p = Long.reverse(-6816404267480757652L);
        q = Long.reverse(-1008806316530991104L);
        r = (10 >>> 1 | 10 << ~1 + 1) & 0xFFFFFFFF;
        s = Long.reverse(-6816404267480757652L);
        t = Long.reverse(-1008806316530991104L);
        u = Integer.reverse(0x60000000);
        v = Long.reverse(-6816404267480757652L);
        w = Long.reverse(-1008806316530991104L);
        x = (0 >>> 34 | 0 << -34) & 0xFFFFFFFF;
        y = (0x40000000 >>> 93 | 0x40000000 << ~93 + 1) & 0xFFFFFFFF;
        z = (0 >>> 117 | 0 << -117) & 0xFFFFFFFF;
        aa = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(0x40000000);
        ac = Integer.reverse(0);
        ad = (8192 >>> 109 | 8192 << ~109 + 1) & 0xFFFFFFFF;
        ae = -1073741823 >>> 94 | -1073741823 << -94;
        af = (-1 >>> 212 | -1 << ~212 + 1) & 0xFFFFFFFF;
        ag = Long.reverse(6009847471270414956L);
        ah = (1 >>> 93 | 1 << ~93 + 1) & 0xFFFFFFFF;
        ai = Integer.reverse(-1);
        aj = Long.reverse(6009847471270414956L);
        ak = 0 >>> 154 | 0 << ~154 + 1;
        al = Integer.reverse(-1879048192);
        am = Integer.reverse(-1879048192);
        var_java_lang_String_arr_a = new String[al];
        var_java_lang_String_arr_b = new String[am];
        NLoginCore_442.b();
    }

    private PluginCommand a() {
        try {
            Class[] classArray = new Class[y];
            classArray[NLoginCore_442.z] = String.class;
            classArray[NLoginCore_442.aa] = Plugin.class;
            Constructor constructor = NLoginCore_546.b(PluginCommand.class, classArray);
            Object[] objectArray = new Object[ab];
            objectArray[NLoginCore_442.ac] = this.var_java_lang_String_arr_b.aa();
            objectArray[NLoginCore_442.ad] = this.var_java_lang_String_arr_b.a().b();
            PluginCommand pluginCommand = (PluginCommand)constructor.newInstance(objectArray);
            pluginCommand.setAliases(this.var_java_lang_String_arr_b.c());
            String string = this.var_java_lang_String_arr_b.ab();
            pluginCommand.setDescription((String)(string == null ? NLoginCore_442.c("㺀", (int)(ae & af), (long)ag) : string));
            pluginCommand.setExecutor((CommandExecutor)this);
            pluginCommand.setTabCompleter((TabCompleter)this);
            return pluginCommand;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_442.c("㺃", (int)(ah & ai), (long)aj) + exception.getLocalizedMessage(), exception, new Object[ak]);
            return null;
        }
    }

    private static String a(int n, long l) {
        l ^= 0x4FL;
        l ^= 0x93D1B54CC4620110L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(33 + 35), 69, (byte)(65 + 18), (byte)(6 + 41), (byte)(45 + 22), (byte)(19 + 47), (byte)(58 + 9), (byte)(27 + 20), (byte)(60 + 20), (byte)(53 + 22), (byte)(54 + 13), (byte)(21 + 62), 53, (byte)(64 + 16), (byte)(28 + 69), (byte)(4 + 96), (byte)(17 + 83), (byte)(17 + 88), (byte)(61 + 49), (byte)(37 + 66)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_427.E("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢙ࢧ࢝ࢮ࢐ࢆࢥࢦࢥࢧࢲ", (byte)25, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_442.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static void b() {
        int n;
        c = 3914291079383541381L;
        long l = c ^ 0x93D1B54CC4620110L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(27 + 41), (byte)(16 + 53), (byte)(58 + 25), (byte)(4 + 43), (byte)(5 + 62), (byte)(63 + 3), (byte)(8 + 59), (byte)(3 + 44), (byte)(47 + 33), (byte)(14 + 61), (byte)(7 + 60), (byte)(46 + 37), (byte)(28 + 25), 80, 97, (byte)(43 + 57), (byte)(10 + 90), (byte)(97 + 8), (byte)(64 + 46), (byte)(3 + 100)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
                    NLoginCore_442.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ƘƞǁƘƠƟƠƞƣƎǋƅƵǆƒǒƬƲƲƹǑǛƢƣ", (byte)104, 65);
                    NLoginCore_442.var_java_lang_String_arr_b[1] = NLoginCore_027.C("ԽԯԟէԡՔՍԭՁԬՂԱԫ՟ՠԿԾԯՈՙհմռԼնՠկԸլբԿնՐՇրևՅթսնէՙլՕ", (byte)104, 67);
                    NLoginCore_442.var_java_lang_String_arr_b[2] = NLoginCore_027.C("ԶԼ՟ԶԾԽԾԼՁԬթԣՓդ԰հՊՐՐ՗կչՀՁ", (byte)104, 67);
                    NLoginCore_442.var_java_lang_String_arr_b[3] = NLoginCore_092.A("ưƶƹƶƼƿƪƽƛƼƥƼƓƞǖƥƑƫƥǄǅǋƢƣ", (byte)104, 65);
                    NLoginCore_442.var_java_lang_String_arr_b[4] = NLoginCore_451.F("զ՛֒ս֗֕պաջ֟֝լ", (byte)104, 70);
                    NLoginCore_442.var_java_lang_String_arr_b[5] = NLoginCore_138.B("ƑƆƽƨǂǀƥƌƦǊǈƗ", (byte)104, 66);
                    NLoginCore_442.var_java_lang_String_arr_b[6] = NLoginCore_004.E("մզՖ֞՘֋քդոգշա֛֥՝սվվ֡պցտց֎ք֎֯կղփֻ֦֪հ֛րַ֬֙֫փ׃ֆ֌", (byte)104, 69);
                    NLoginCore_442.var_java_lang_String_arr_b[7] = NLoginCore_173.E("֛֓֏ծ֚֚ռ֢֟֟ս֑աղց՞֩֘ի֋չ֪ց֡ք֑֊֏ָն֥։ֵհ׀֩։ֿ֕քրֆֵ֟ք֓քּ֦֨ׄ׃׏ֽ־֡֫׉ׄ֓֩׌ל֕", (byte)104, 69);
                    NLoginCore_442.var_java_lang_String_arr_b[8] = NLoginCore_446.C("ԽԯԟէԡՔՍԭՁԬՁՀԽԮՊզՕՇՙեժԳՈեսՐձՙխփձԻվֈ՗շտբյ֌Ն֎֊Օ", (byte)104, 67);
                    continue block7;
                }
                case 1: {
                    NLoginCore_442.var_java_lang_String_arr_b[0] = NLoginCore_575.A("ƘƞǁƘƠƟƠƞƣƎǈƿǏƕƞƒǁƭƓǌƷƥƢƣ", (byte)104, 65);
                    NLoginCore_442.var_java_lang_String_arr_b[1] = NLoginCore_091.E("մզՖ֞՘֋քդոգչըբ֖֗նյզտ֐ֳ֧֫ճ֦֭֗կ֣֙ն֭֋ֲֽ֟չֽ֢֑֥ւֹ֌", (byte)104, 69);
                    NLoginCore_442.var_java_lang_String_arr_b[2] = NLoginCore_427.C("ԶԼ՟ԶԾԽԾԼՁԬզ՟՚իՠԳՏՊյհգՃՀՁ", (byte)104, 67);
                    NLoginCore_442.var_java_lang_String_arr_b[3] = NLoginCore_223.B("ưƶƹƶƼƿƪƽƛƼƤƢǐƽƴƓƏƩƬƓƛǛƢƣ", (byte)104, 66);
                    NLoginCore_442.var_java_lang_String_arr_b[4] = NLoginCore_027.A("ƆǄƛƫǌƦƋƧƠǌǌƗ", (byte)104, 65);
                    NLoginCore_442.var_java_lang_String_arr_b[5] = NLoginCore_559.C("ԟըԼՈՃՂՌԸԠՠԯԵ", (byte)104, 67);
                    NLoginCore_442.var_java_lang_String_arr_b[6] = NLoginCore_110.A("ƟƑƁǉƃƶƯƏƣƎƢƌǆǐƈƨƩƩǌƥƬƪƬƹƯƹǚƚƝƮǑǦƨƧǙǜƴƟƼƺǣƨǇǞǣǈǟƮƴǢǛǌǥǕǂǃ", (byte)104, 65);
                    NLoginCore_442.var_java_lang_String_arr_b[7] = NLoginCore_223.C("՜դ՘ԷգգՅըիըՆ՚ԪԻՊԧղաԴՔՂճՊժՍ՚Փ՘ցԿծՒվԹ։ղՒֈ՞ՍՉՏվըՍ՜Սօկձ֍֌֘օ֎թ֕ժ՘՚֝֋հֆ", (byte)104, 67);
                    NLoginCore_442.var_java_lang_String_arr_b[8] = NLoginCore_223.C("ԽԯԟէԡՔՍԭՁԬՁՀԽԮՊզՕՇՙեժԳՈեսՐձՙխփձԻէզյՑ։ՅսռՠՆդՕ", (byte)104, 67);
                    continue block7;
                }
                case 2: {
                    NLoginCore_442.var_java_lang_String_arr_b[0] = NLoginCore_201.A("ǇſǀƸƛƥƺƥƭƠƧƮƍƓƣƳƢƳǌưǍƴƾƝƞƽƾƶǀǕơǜ", (byte)104, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_442.var_java_lang_String_arr_b[0] = NLoginCore_453.C("ՐԵՇՃՅԩԪԭՙբՏԻՊլ՟ՇըղիաջԹԲՓՖպմվլհՐւ", (byte)104, 67);
                }
            }
        }
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_442.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_201.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), NLoginCore_442.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_387.E("֪֝֩լַ֣֦֬֨֬ճֱֱֵַ֮չࣾऌंओࣵ࣫ऊऋऊऌग֐", (byte)126, 69) + string + NLoginCore_427.F("մ", (byte)126, 70) + methodType.toString(), exception);
        }
    }

    @Override
    public synchronized void X() {
        if (this.var_org_bukkit_command_PluginCommand_a == null) {
            return;
        }
        try {
            PluginManager pluginManager = this.var_org_bukkit_Server_a.getPluginManager();
            Field field = NLoginCore_546.a(pluginManager.getClass(), (String)NLoginCore_442.c("㺀", (int)i, (long)(j ^ k)));
            Object object = field.get(pluginManager);
            if (object instanceof CommandMap) {
                CommandMap commandMap = (CommandMap)object;
                List list = this.var_org_bukkit_command_PluginCommand_a.getAliases();
                this.var_org_bukkit_command_PluginCommand_a.setAliases(Collections.emptyList());
                this.var_org_bukkit_command_PluginCommand_a.unregister(commandMap);
                if (commandMap instanceof SimpleCommandMap) {
                    Field field2 = NLoginCore_546.a(SimpleCommandMap.class, (String)NLoginCore_442.c("㺃", (int)l, (long)(m ^ n)));
                    Map map = (Map)field2.get(commandMap);
                    String string = this.var_java_lang_String_arr_b.a().q().toLowerCase(Locale.ENGLISH);
                    String string2 = this.var_org_bukkit_command_PluginCommand_a.getName();
                    map.remove(string + (String)NLoginCore_442.c("㺆", (int)o, (long)(p ^ q)) + string2);
                    map.remove(string2);
                    for (String string3 : list) {
                        map.remove(string + (String)NLoginCore_442.c("㺉", (int)r, (long)(s ^ t)) + string3);
                        map.remove(string3);
                    }
                }
            }
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_442.c("㺌", (int)u, (long)(v ^ w)) + exception.getLocalizedMessage(), exception, new Object[x]);
        }
    }

    public List<String> onTabComplete(CommandSender commandSender, Command command, String string, String[] stringArray) {
        return this.var_java_lang_String_arr_b.a(commandSender, commandSender.getName(), commandSender instanceof Player, string, stringArray);
    }

    @Generated
    public NLoginCore_442(Server server, NLoginCore_168<?> NLoginCore_1682) {
        this.var_org_bukkit_Server_a = server;
        this.var_java_lang_String_arr_b = NLoginCore_1682;
    }
}

