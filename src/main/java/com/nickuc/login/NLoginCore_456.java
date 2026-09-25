/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import com.nickuc.login.NLoginCore_012;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_510;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_205;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_487;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_430;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_482;
import com.nickuc.login.NLoginCore_506;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_393;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginType_016;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_301;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_370;
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
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NLoginCore_456
implements NLoginCore_487 {
    private static int dm;
    private static int ds;
    private static long de;
    private static long db;
    private static long g;
    private static int dj;
    private static float bx;
    private static int dq;
    private static int da;
    private static long v;
    private static int bj;
    private static long al;
    private static int aw;
    private static int ci;
    private static long k;
    private static long l;
    private static long n;
    private static int av;
    private static int co;
    private static float bw;
    private static int af;
    private static float ca;
    private static int an;
    private static int dr;
    private Location var_org_bukkit_Location_f;
    private static long cm;
    private final File var_java_io_File_a;
    private static int dp;
    private static int ce;
    private static long o;
    private static long at;
    private static long ad;
    private static int bl;
    private static int cu;
    private static int cr;
    private static long ck;
    private static long dd;
    private static int m;
    private static long dl;
    private static int cc;
    private static int p;
    private final nLoginBukkit var_com_nickuc_login_bukkit_nLoginBukkit_c;
    private static long au;
    private static int cl;
    private static int var_int_f;
    private static int bo;
    private static int cn;
    private static long ab;
    private static int bm;
    private static int cf;
    private static long cfr_renamed_1;
    private static long aq;
    private static long dk;
    private static int ch;
    private static int bg;
    private static long var_long_b;
    private static double cv;
    private Location var_org_bukkit_Location_b;
    private static String[] var_java_lang_String_arr_a;
    private static long cg;
    private final NLoginCore_301 var_com_nickuc_login_NLoginCore_301_a;
    private static long ct;
    private static long var_long_c;
    private static int cz;
    private static long h;
    private static int ag;
    private static long w;
    private static float bu;
    private static float bz;
    private static long cq;
    private static String[] var_java_lang_String_arr_b;
    private static int ay;
    private static float by;
    private Location var_org_bukkit_Location_d;
    private static int cx;
    private static int dc;
    private static int x;
    private static long bq;
    private static int ba;
    private static int ac;
    private static long ar;
    private static int bs;
    private static double cw;
    private static long am;
    private static int r;
    private static int di;
    private static int bd;
    private static int y;
    private static int dg;
    private static long cp;
    private static int bp;
    private static long bf;
    private static float bv;
    private static int var_int_e;
    private static int s;
    private static int cy;
    private static long dn;
    private static int df;
    private static float cb;
    private static long bb;
    private static int az;
    private static int q;
    private static int ax;
    private static int i;
    private static long aa;
    private static int var_int_a;
    private static int bn;
    private static long aj;
    private Location var_org_bukkit_Location_e;
    private static long t;
    private static long cs;
    private static int ao;
    private static int as;
    private static long dh;
    private static int bt;
    private static long ai;
    private static int cj;
    private static int bk;
    private static int ah;
    private static int ap;
    private boolean var_boolean_c;
    private static int z;
    private static int u;
    private static long bc;
    private static int br;
    private static int bh;
    private static int ak;
    private static long cd;
    private Location var_org_bukkit_Location_c;
    private static long be;
    private static int j;
    private static long var_long_d;
    private static long ae;
    private static int bi;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(NLoginCore_509 NLoginCore_5092, NLoginCore_510 NLoginCore_510) {
        Object object = NLoginCore_5092.var_java_lang_Object_n;
        synchronized (object) {
            Player player = NLoginCore_510.var_org_bukkit_entity_Player_a;
            if (NLoginCore_510.var_com_nickuc_login_NLoginCore_506_a != NLoginCore_506.var_com_nickuc_login_NLoginCore_506_c) {
                return ax != 0;
            }
            try {
                if (!player.isOnline()) {
                    boolean bl = ay;
                    return bl;
                }
                NLoginCore_187 NLoginCore_1872 = this.var_com_nickuc_login_bukkit_nLoginBukkit_c.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginCore_187_a();
                if (NLoginCore_1872.boolean_b(this.var_com_nickuc_login_bukkit_nLoginBukkit_c.java_lang_Object_b().a(player))) {
                    boolean bl = az;
                    return bl;
                }
                File file = NLoginCore_510.var_java_io_File_b;
                if (!file.exists()) {
                    throw new IllegalStateException((String)NLoginCore_456.c("㺀", (int)ba, (long)(bb ^ bc)));
                }
                if (!this.var_com_nickuc_login_bukkit_nLoginBukkit_c.org_bukkit_Server_a().isPrimaryThread() && !NLoginCore_012.V()) {
                    throw new IllegalStateException((String)NLoginCore_456.c("㺃", (int)bd, (long)(be ^ bf)));
                }
                if (NLoginCore_532.w.ar()) {
                    NLoginCore_510.var_boolean_d = bg;
                    player.removePotionEffect(PotionEffectType.BLINDNESS);
                    player.setGameMode(GameMode.ADVENTURE);
                    player.setAllowFlight(NLoginCore_532.z.ar());
                    player.setFlying(bh != 0);
                    NLoginCore_205.a(player, bi != 0);
                    player.setFoodLevel(bj);
                    player.setTotalExperience(bk);
                    if (player.getHealth() > 0.0) {
                        double d = player.getMaxHealth();
                        player.setHealth(d);
                    }
                }
                if (NLoginCore_532.z.ar()) {
                    player.setFlySpeed(0.0f);
                    player.setWalkSpeed(0.0f);
                }
                if (NLoginCore_532.y.ar()) {
                    NLoginCore_430.a(this.var_com_nickuc_login_bukkit_nLoginBukkit_c, player);
                }
                if (NLoginCore_532.A.ar()) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, bl, bm));
                }
                boolean bl = bn;
                return bl;
            }
            finally {
                NLoginCore_510.var_com_nickuc_login_NLoginCore_506_a = NLoginCore_506.var_com_nickuc_login_NLoginCore_506_d;
            }
        }
    }

    @Generated
    public Location e() {
        return this.var_org_bukkit_Location_f;
    }

    @Generated
    public Location c() {
        return this.var_org_bukkit_Location_d;
    }

    private void a(Player player, Location location) {
        if (NLoginCore_012.V()) {
            player.teleportAsync(location, PlayerTeleportEvent.TeleportCause.PLUGIN);
        } else {
            player.teleport(location, PlayerTeleportEvent.TeleportCause.PLUGIN);
        }
    }

    private void b(NLoginCore_510 NLoginCore_510) {
        Player player = NLoginCore_510.var_org_bukkit_entity_Player_a;
        if (NLoginCore_510.var_boolean_e && this.var_org_bukkit_Location_c != null) {
            try {
                this.a(player, this.var_org_bukkit_Location_c);
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_456.c("㺀", (int)cc, (long)cd) + player.getName() + (String)NLoginCore_456.c("㺃", (int)(ce & cf), (long)cg), exception, new Object[ch]);
            }
            return;
        }
        if (!this.var_boolean_c && this.var_org_bukkit_Location_b != null) {
            try {
                this.a(player, this.var_org_bukkit_Location_b);
            }
            catch (Exception exception) {
                NLoginCore_370.c((String)NLoginCore_456.c("㺆", (int)(ci & cj), (long)ck) + player.getName() + (String)NLoginCore_456.c("㺉", (int)cl, (long)cm), exception, new Object[cn]);
            }
            return;
        }
        if (this.var_org_bukkit_Location_d != null) {
            Location location;
            Object object = NLoginCore_510.var_org_bukkit_Location_g != null ? NLoginCore_510.var_org_bukkit_Location_g : (location = this.var_boolean_c ? NLoginCore_510.var_org_bukkit_Location_h : null);
            if (location != null) {
                try {
                    this.a(player, location);
                }
                catch (Exception exception) {
                    NLoginCore_370.c((String)NLoginCore_456.c("㺌", (int)co, (long)(cp ^ cq)) + player.getName() + (String)NLoginCore_456.c("㺏", (int)cr, (long)(cs ^ ct)), exception, new Object[cu]);
                }
            }
        }
    }

    public NLoginCore_456(nLoginBukkit nLoginBukkit2) {
        this.var_com_nickuc_login_bukkit_nLoginBukkit_c = nLoginBukkit2;
        this.var_com_nickuc_login_NLoginCore_301_a = new NLoginCore_301(this);
        this.var_java_io_File_a = new File(nLoginBukkit2.java_io_File_c(), (String)NLoginCore_456.c("㺀", (int)var_int_a, (long)(var_long_b ^ var_long_d)));
        nLoginBukkit2.b(var_int_e != 0).a(new SynchronizeWithServerThreadTask(() -> this.a(nLoginBukkit2.com_nickuc_login_NLoginType_008_a(), dq != 0)));
        File file = new File(nLoginBukkit2.java_io_File_c(), (String)NLoginCore_456.c("㺃", (int)var_int_f, (long)(g ^ h)));
        if (!this.var_java_io_File_a.exists() && file.exists() && file.isDirectory()) {
            file.renameTo(this.var_java_io_File_a);
        }
    }

    @Generated
    public Location org_bukkit_Location_b() {
        return this.var_org_bukkit_Location_c;
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_456.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ԰ՕշնծմծՃ", (byte)55, 70), NLoginCore_456.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_092.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҸҵҺҵҨӂӍӄҼӅҜӑӆҞņ", (byte)55, 66) + string + NLoginCore_324.E("ԭ", (byte)55, 69) + methodType.toString(), exception);
        }
    }

    @Generated
    public boolean g() {
        return this.var_boolean_c;
    }

    private static void void_b() {
        int n;
        var_long_c = 5125663004988188682L;
        long l = var_long_c ^ 0x541617CF9D754ACBL;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(47 + 21), 69, (byte)(65 + 18), (byte)(41 + 6), (byte)(35 + 32), 66, (byte)(44 + 23), (byte)(27 + 20), (byte)(67 + 13), (byte)(31 + 44), (byte)(33 + 34), (byte)(12 + 71), (byte)(51 + 2), (byte)(14 + 66), (byte)(41 + 56), (byte)(43 + 57), (byte)(38 + 62), (byte)(43 + 62), (byte)(96 + 14), (byte)(18 + 85)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
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
                    NLoginCore_456.var_java_lang_String_arr_b[0] = NLoginCore_559.C("҅ѯґҒѩѥґѕҗєѫѠ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[1] = NLoginCore_324.E("ԦՊԘԔՐՋՅԩԨՐՒԥ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[2] = NLoginCore_027.F("ԍԴԹՁ՘ՙ՚ԨՊԽ՜՚ԯՔԡՃԡԞՔԢԴ՘ԩԵԷ՜ՇձթԪբՇծլնԴպիԳԽ՜լՉբԺմչջՒգմՁջչՐՑ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[3] = NLoginCore_027.B("ďĕĮħĞĖĲúıĚĸďĴěĲĵĸĽþĥħľĭĞĿŎĦĴĳōĠĴ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[4] = NLoginCore_173.E("ԍԴԹՁ՘ՙ՚ԨՊԽ՜՚ԯՔԡՃԡԞՔԢԴ՘ԩԵԷ՜ՇձթԪբՇծլնԴպիԳԽ՜լՉբԺմչջՒգմՁջչՐՑ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[5] = NLoginCore_092.D("ҀъѣёҊэҗюяѲѯѠ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[6] = NLoginCore_004.C("шѯѴѼғҔҕѣ҅ѸҖѭѯҝҠҀҍ҃ѻџҢҘѿ҈ѵѺҩѤ҈ҦҢҘ҄Ңѽҩ҄ѬҳҕҔҮѴҥ҈ҵҗҟґѸӃ҄ѾҞҋҌ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[7] = NLoginCore_091.A("ćùĻĳĨļùĎýěĢ÷ĘĝĤħĉýĬŌĶŌĿŏČĜőĽĦĔĬĐĥļőľĞĸĘļĽĚĴĩ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[8] = NLoginCore_324.D("шѯѴѼғҔҕѣ҅ѸҖѭѯҝҠҀҍ҃ѻџҢҘѿ҈ѵѺҩѤ҈ҦҢҘ҄Ңѽҩ҄ѬҳҕҔҮѴҥ҈ҵҗҟґѸӃ҄ѾҞҋҌ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[9] = NLoginCore_575.A("ĩóČúĳöŀ÷øěĘĉ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[10] = NLoginCore_324.A("ĮħóĬěļŀđĐęĞŃĝġŅŇňĺĩěĨŋľŅīĉħŐİĿĵŘŘŅĦŘņĨœĹŒŌğĩ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[11] = NLoginCore_223.F("Կԑ՘ՅԶՈՎԜԦԼՑՏԝՔԤԼՎբ՝ԾՉԺ՟ՅգհԬ՚՜Քկճ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[12] = NLoginCore_138.E("ԾԒԖԙԘԺՅԪՕԿ՞ԻՕՋԬԾբեեԵԹՇԼզԷդՎՂՋկլդՎՅոՊՉՌճ՘ՊՠՐՅ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[13] = NLoginCore_091.F("ԈԥԴԹՎԻ՜ՐԾՌ՟՚ՙՒԬԵԜդԴՓՋթԤԤէԾԨԬՀԲթՌմՄզՂնԵԵծՆՌխոմպկհՎցՈանֈո֋զ֏ՠ՟ք։ռմ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[14] = NLoginCore_384.E("ԐՑՅԯԐԻԧԥԧՐԝԩԸՃՍ԰ԝԞՈԟԽԶՋԺԸզՋՈՀԫԮճՅՂՌՆՆԵջթնղՑձլՕփփէև՞ք՚Ղ՜՘Չկ֏ՇլձՓօ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[15] = NLoginCore_324.A("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃŚĪĪįĜĳőĞĬŤŀĩ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[16] = NLoginCore_091.E("ԒԯՙԗՅԮԱԪԼՎՠԻԴԠԠԽՂՓՔԤԶ՛բԦ՞՚ՌէՀխՔ՟", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[17] = NLoginCore_027.E("ԟՍԠԋԸԕԭԕՖԗԬԷԜՒՠԟ՗ԤԽԣԩՔժԺ՚ՎէՋԺճՅ՟նՆՆՋԸՏխԺՈր՜Յ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[18] = NLoginCore_027.F("ՒՍԊԔՈԯԙԛԲԕԻա՚ԳեԳՆՔեՅԳՃ԰Ա", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[19] = NLoginCore_559.D("њ҈ћцѳѐѨѐґђѧѲїҍқњҒџѸўѤҏҥѵҕ҉Ң҆ѵҮҀҚұҁҁ҆ѳҊҨѵ҃һҗҀ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[20] = NLoginCore_384.B("ģĶûĆĻċļŀÿŁķĳĿĴłĨēĖŉĆŎĭċōċĞļĢČĤďĖ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[21] = NLoginCore_575.E("ԑԨԮՙՏՖԯՆՙԛՐԓԿՎԬՎԠԣԚբՃԵԼԻժԪթգՍթՂՓՌՌՒպՖՈ՜վսնԷՅ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[22] = NLoginCore_091.A("ĸăĹĞõĝĞĽāĝĠĿńùħŊĶąġŌĮĽĔĕ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[23] = NLoginCore_173.D("ѥѣѬѠѧҏѿєѵј҃҇ѺѱҒ҉јѰҔњҀҜўҜћҁҙѩҖ҉Ү҆қҦҩҮҝ҈ѯҗҚѵңүұҿҫҍғҖҾҺҹҎҋҌ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[24] = NLoginCore_110.C("ҏњҐѵьѴѵҔјѴѷҖқѐѾҡҍќѸң҅ҔѫѬ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[25] = NLoginCore_201.E("ԪԨԱԥԬՔՄԙԺԝՁՉՙԬ՛բդՀԡՀՁԫ՜ՎՃ՞ԫՄՒհԽթ", (byte)33, 69);
                    continue block7;
                }
                case 1: {
                    NLoginCore_456.var_java_lang_String_arr_b[0] = NLoginCore_384.C("ёѧҎҕҍґёіҖѵіѠ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[1] = NLoginCore_387.F("ՍՏՀՒԯԘ԰ԧՎԲԸԥ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[2] = NLoginCore_575.D("шѯѴѼғҔҕѣ҅ѸҗҕѪҏќѾќљҏѝѯғѤѰѲҗ҂ҬҤѥҝ҂ҩҧұѯҵҦѮѸҗҧ҅җҷҺҗѸѾҷѿҤҙҢҜқҡғ҂ҌҥӏҜҞ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[3] = NLoginCore_446.E("ԫԱՊՃԺԲՎԖՍԶՔԫՐԷՎՑՔՙԚՁՃբԧԷԬԡԩՌՠՠՅՋ", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[4] = NLoginCore_027.A("ñĘĝĥļĽľČĮġŀľēĸąħąĂĸĆĘļčęěŀīŕōĎņīŒŐŚĘŞŏėġŀŐĬİťğħļĵĶĩŖŅŇĴĵ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[5] = NLoginCore_092.F("ԬԕԸԸԮՙԲԘԯ՛Ֆԥ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[6] = NLoginCore_575.B("ñĘĝĥļĽľČĮġĿĖĘņŉĩĶĬĤĈŋŁĨıĞģŒčıŏŋŁĭŋĦŒĭĕŜľĽŗěŗĮŨŅŧĤĤšĿĠŇĴĵ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[7] = NLoginCore_201.C("ўѐҒҊѿғѐѥєѲѹюѯѴѻѾѠє҃ңҍңҖҦѣѳҨҔѽѫ҃ѧҍҏҥѭңҲҷҥҭҌҗҀ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[8] = NLoginCore_027.E("ԍԴԹՁ՘ՙ՚ԨՊԽ՛ԲԴբեՅՒՈՀԤէ՝ՄՍԺԿծԩՍիէ՝ՉէՂծՉԱո՚ՙճԷՍջիե՚՘բՀռզև։ի֍ռՎՑ՜ֈթ֐", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[9] = NLoginCore_201.A("ĚċĕüēĴıĲúėĐĉ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[10] = NLoginCore_027.C("҅Ѿъ҃ѲғҗѨѧѰѵҚѴѸҜҞҟґҀѲѿҢҕҜ҂ѠѾҧ҇ҖҌүѩҬѾғ҇ҤҨҕ҉ґҵҀ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[11] = NLoginCore_091.C("ѺьғҀѱ҃҉їѡѷҌҊјҏџѷ҉ҝҘѹ҄ѳҜџҊѵѺѪѪҧҢҚ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[12] = NLoginCore_138.B("ĢöúýüĞĩĎĹģłğĹįĐĢņŉŉęĝīĠŊěňĲĦįœŐňĕŔŊĮĳŒŔĜīĠěĩ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[13] = NLoginCore_092.D("уѠѯѴ҉Ѷҗҋѹ҇ҚҕҔҍѧѰїҟѯҎ҆ҤџџҢѹѣѧѻѭҤ҇үѿҡѽұѰѰҩҁ҇ҨҳүҵҪҫ҉Ҽ҃Ҝұҵҡ҂ҘѼқҴҨӉӏҠ", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[14] = NLoginCore_223.E("ԐՑՅԯԐԻԧԥԧՐԝԩԸՃՍ԰ԝԞՈԟԽԶՋԺԸզՋՈՀԫԮճՅՂՌՆՆԵջթնղՑձլՕփփէև՞ք՚֊ՙևՇՊի֎Տ֐ֆ՞֕֘յժջյ֐֊Ր֋֒ե", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[15] = NLoginCore_575.B("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃōēřĜőŞėĴıĜŚĩ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[16] = NLoginCore_223.C("эѪҔђҀѩѬѥѷ҉қѶѯћћѸѽҎҏџѱҗҟҦҊҡҁ҈ҟүѸү", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[17] = NLoginCore_110.A("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃęĒĕĳŌħĠŋĝěŚĩ", (byte)33, 65);
                    NLoginCore_456.var_java_lang_String_arr_b[18] = NLoginCore_201.D("ҍ҈хя҃ѪєіѭѐѵѕҋҒ҇ҖѰҢҗҀѱҖѰѻҀғҔҙ҉ѬҤ҆", (byte)33, 68);
                    NLoginCore_456.var_java_lang_String_arr_b[19] = NLoginCore_091.B("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃĕĨķĺĬĚĩęŊěŚĩ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[20] = NLoginCore_091.C("ѺҍђѝҒѢғҗіҘҎҊҖҋҙѿѪѭҠѝҥґҧқҊҗѵ҇Ѩ҈ѷҋ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[21] = NLoginCore_575.F("ԑԨԮՙՏՖԯՆՙԛՐԓԿՎԬՎԠԣԚբՃԵԼԻժԪթգՍթՂՓյհՊՓղՈի՝ոԹնՅ", (byte)33, 70);
                    NLoginCore_456.var_java_lang_String_arr_b[22] = NLoginCore_027.E("ՔԟՕԺԑԹԺՙԝԹԼ՚ԻԭԯԷՑ՛ՠգզՃ԰Ա", (byte)33, 69);
                    NLoginCore_456.var_java_lang_String_arr_b[23] = NLoginCore_427.B("ĎČĕĉĐĸĨýĞāĬİģĚĻĲāęĽăĩŅćŅĄĪłĒĿĲŗįńŏŒŗņıĘŀŃĞŅĭİŢũŖĨģľŦņŇĴĵ", (byte)33, 66);
                    NLoginCore_456.var_java_lang_String_arr_b[24] = NLoginCore_324.C("ҏњҐѵьѴѵҔјѴѸҜѷѮёѯјҙҙҡҝҔѫѬ", (byte)33, 67);
                    NLoginCore_456.var_java_lang_String_arr_b[25] = NLoginCore_091.B("ĎČĕĉĐĸĨýĞāĥĭĽĐĿņňĤąĤĥćňċĬĐĪŀĕńďŘ", (byte)33, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_456.var_java_lang_String_arr_b[0] = NLoginCore_091.F("ՖԿՎԹԦՇՄԜ՜՗ԪԮ՗ԛԽ՞ԴՖԺԧիԳ԰Ա", (byte)33, 70);
                    continue block7;
                }
                case 4: {
                    NLoginCore_456.var_java_lang_String_arr_b[0] = NLoginCore_446.F("ՖԟԖՒԲԩԨ԰ԧՍԯբԬՕ՗ԝՇ՜ԢԾ՜ՙ԰Ա", (byte)33, 70);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void void_a(NLoginCore_509 NLoginCore_5092, NLoginCore_510 NLoginCore_510, boolean bl) {
        Object object = NLoginCore_5092.var_java_lang_Object_n;
        synchronized (object) {
            try {
                Player player = NLoginCore_510.var_org_bukkit_entity_Player_a;
                if (!player.isOnline()) {
                    return;
                }
                if (!this.var_com_nickuc_login_bukkit_nLoginBukkit_c.org_bukkit_Server_a().isPrimaryThread() && !NLoginCore_012.V()) {
                    throw new IllegalStateException((String)NLoginCore_456.c("㺀", (int)(bo & bp), (long)bq));
                }
                player.updateInventory();
                if (NLoginCore_510.var_com_nickuc_login_NLoginCore_506_a != NLoginCore_506.var_com_nickuc_login_NLoginCore_506_d) {
                    if (NLoginCore_510.var_com_nickuc_login_NLoginCore_506_a == NLoginCore_506.var_com_nickuc_login_NLoginCore_506_e) return;
                    this.b(NLoginCore_510);
                    return;
                }
                this.a(NLoginCore_510);
                this.b(NLoginCore_510);
                if (NLoginCore_532.y.ar() || bl) {
                    NLoginCore_430.b(this.var_com_nickuc_login_bukkit_nLoginBukkit_c, player);
                }
                if (NLoginCore_532.A.ar()) {
                    player.removePotionEffect(PotionEffectType.BLINDNESS);
                }
                this.var_com_nickuc_login_bukkit_nLoginBukkit_c.b(br != 0).a(NLoginCore_510.var_java_io_File_b::delete);
            }
            finally {
                NLoginCore_510.var_com_nickuc_login_NLoginCore_506_a = NLoginCore_506.var_com_nickuc_login_NLoginCore_506_e;
            }
            return;
        }
    }

    @Generated
    public Location org_bukkit_Location_a() {
        return this.var_org_bukkit_Location_b;
    }

    private static String a(int n, long l) {
        l ^= 0x44L;
        l ^= 0x541617CF9D754ACBL;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(51 + 17), (byte)(23 + 46), (byte)(66 + 17), (byte)(27 + 20), (byte)(45 + 22), (byte)(49 + 17), (byte)(45 + 22), (byte)(14 + 33), (byte)(52 + 28), (byte)(53 + 22), (byte)(63 + 4), (byte)(13 + 70), (byte)(36 + 17), (byte)(6 + 74), 97, (byte)(60 + 40), 100, (byte)(85 + 20), (byte)(42 + 68), (byte)(93 + 10)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_446.F("ածխ԰հլէհջժԷյչղյջԽࣉࣆ࣋ࣆࢹ࣓ࣞࣕ࣍ࣖࢭ࣢ࣗࢯ", (byte)66, 70));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_456.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Generated
    public File java_io_File_a() {
        return this.var_java_io_File_a;
    }

    private void a(NLoginCore_510 NLoginCore_510) {
        Player player = NLoginCore_510.var_org_bukkit_entity_Player_a;
        if (NLoginCore_510.var_boolean_d) {
            float f;
            double d;
            GameMode gameMode = NLoginCore_510.var_org_bukkit_GameMode_a;
            player.setGameMode(gameMode != null ? gameMode : GameMode.SURVIVAL);
            player.setAllowFlight(NLoginCore_510.var_boolean_g);
            player.setFlying((NLoginCore_510.var_boolean_h && player.getAllowFlight() ? bs : bt) != 0);
            NLoginCore_205.a(player, NLoginCore_510.var_boolean_i);
            player.setFoodLevel(NLoginCore_510.var_int_h);
            int n = NLoginCore_510.var_int_i;
            if (n > 0) {
                player.setTotalExperience(n);
            }
            if ((d = NLoginCore_510.var_double_d) > 0.0) {
                double d2 = Math.max(player.getMaxHealth(), 0.0);
                player.setHealth(Math.min(d, d2));
            }
            player.setWalkSpeed(Math.abs(f = NLoginCore_510.var_float_c) > 1.0f || f <= bu ? bv : f);
            float f2 = NLoginCore_510.var_float_d;
            player.setFlySpeed(Math.abs(f2) > 1.0f || f2 <= bw ? bx : f2);
        } else {
            float f = player.getWalkSpeed();
            player.setWalkSpeed(Math.abs(f) > 1.0f || f <= by ? bz : f);
            float f3 = player.getFlySpeed();
            player.setFlySpeed(Math.abs(f3) > 1.0f || f3 <= ca ? cb : f3);
        }
    }

    @Nullable
    private Location a(nLoginBukkit nLoginBukkit2, NLoginType_016 NLoginType_0162) {
        if (NLoginType_0162 == NLoginType_016.var_com_nickuc_login_NLoginType_016_f) {
            throw new UnsupportedOperationException((String)NLoginCore_456.c("㺀", (int)da, (long)db) + (Object)((Object)NLoginType_0162));
        }
        NLoginCore_482 NLoginCore_4822 = this.var_com_nickuc_login_bukkit_nLoginBukkit_c.a().com_nickuc_login_NLoginCore_482_a();
        String string = NLoginType_0162.aE();
        try {
            World world;
            Location location = NLoginCore_393.a(NLoginCore_4822.k(string));
            if (location != null && ((world = location.getWorld()) == null || nLoginBukkit2.org_bukkit_Server_a().getWorld(world.getName()) == null)) {
                NLoginCore_370.d((String)NLoginCore_456.c("㺃", (int)dc, (long)(dd ^ de)) + (Object)((Object)NLoginType_0162) + (String)NLoginCore_456.c("㺆", (int)(df & dg), (long)dh), new Object[di]);
                NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(string).ag();
                location = null;
            }
            return location;
        }
        catch (Exception exception) {
            NLoginCore_370.c((String)NLoginCore_456.c("㺉", (int)dj, (long)(dk ^ dl)) + (Object)((Object)NLoginType_0162) + (String)NLoginCore_456.c("㺌", (int)dm, (long)(dn ^ cfr_renamed_1)), exception, new Object[dp]);
            NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(string).ag();
            return null;
        }
    }

    static {
        var_int_a = 0 >>> 74 | 0 << -74;
        var_long_b = Long.reverse(5770647523106505954L);
        var_long_d = Long.reverse(0x2200000000000000L);
        var_int_e = Integer.reverse(0);
        var_int_f = Integer.reverse(Integer.MIN_VALUE);
        g = Long.reverse(5770647523106505954L);
        h = Long.reverse(0x2200000000000000L);
        i = 16 >>> 132 | 16 << ~132 + 1;
        j = Integer.reverse(0x40000000);
        k = Long.reverse(5770647523106505954L);
        l = Long.reverse(0x2200000000000000L);
        m = 192 >>> 38 | 192 << -38;
        n = Long.reverse(5770647523106505954L);
        o = Long.reverse(0x2200000000000000L);
        p = Integer.reverse(0);
        q = 0 >>> 52 | 0 << ~52 + 1;
        r = (32 >>> 99 | 32 << ~99 + 1) & 0xFFFFFFFF;
        s = Integer.reverse(-1);
        t = Long.reverse(8220605720396055778L);
        u = (0x14000000 >>> 186 | 0x14000000 << -186) & 0xFFFFFFFF;
        v = Long.reverse(5770647523106505954L);
        w = Long.reverse(0x2200000000000000L);
        x = (0 >>> 130 | 0 << -130) & 0xFFFFFFFF;
        y = 0 >>> 87 | 0 << -87;
        z = 0x60000000 >>> 156 | 0x60000000 << -156;
        aa = Long.reverse(5770647523106505954L);
        ab = Long.reverse(0x2200000000000000L);
        ac = 1792 >>> 72 | 1792 << ~72 + 1;
        ad = Long.reverse(5770647523106505954L);
        ae = Long.reverse(0x2200000000000000L);
        af = Integer.reverse(0);
        ag = Integer.reverse(0);
        ah = Integer.reverse(0x10000000);
        ai = Long.reverse(5770647523106505954L);
        aj = Long.reverse(0x2200000000000000L);
        ak = (4608 >>> 201 | 4608 << ~201 + 1) & 0xFFFFFFFF;
        al = Long.reverse(5770647523106505954L);
        am = Long.reverse(0x2200000000000000L);
        an = Integer.reverse(0);
        ao = Integer.reverse(0);
        ap = 640 >>> 102 | 640 << -102;
        aq = Long.reverse(5770647523106505954L);
        ar = Long.reverse(0x2200000000000000L);
        as = -1342177280 >>> 28 | -1342177280 << ~28 + 1;
        at = Long.reverse(5770647523106505954L);
        au = Long.reverse(0x2200000000000000L);
        av = 0 >>> 100 | 0 << -100;
        aw = Integer.reverse(Integer.MIN_VALUE);
        ax = Integer.reverse(Integer.MIN_VALUE);
        ay = Integer.reverse(Integer.MIN_VALUE);
        az = (524288 >>> 19 | 524288 << -19) & 0xFFFFFFFF;
        ba = (-1073741824 >>> 220 | -1073741824 << ~220 + 1) & 0xFFFFFFFF;
        bb = Long.reverse(5770647523106505954L);
        bc = Long.reverse(0x2200000000000000L);
        bd = Integer.reverse(-1342177280);
        be = Long.reverse(5770647523106505954L);
        bf = Long.reverse(0x2200000000000000L);
        bg = (131072 >>> 241 | 131072 << -241) & 0xFFFFFFFF;
        bh = 0 >>> 151 | 0 << ~151 + 1;
        bi = Integer.reverse(0);
        bj = Integer.reverse(0x28000000);
        bk = Integer.reverse(0);
        bl = (319968 >>> 69 | 319968 << ~69 + 1) & 0xFFFFFFFF;
        bm = 0xFE0000 >>> 17 | 0xFE0000 << -17;
        bn = Integer.reverse(Integer.MIN_VALUE);
        bo = 14336 >>> 10 | 14336 << ~10 + 1;
        bp = Integer.reverse(-1);
        bq = Long.reverse(8220605720396055778L);
        br = 2048 >>> 203 | 2048 << -203;
        bs = 0x40000000 >>> 254 | 0x40000000 << ~254 + 1;
        bt = (0 >>> 218 | 0 << ~218 + 1) & 0xFFFFFFFF;
        bu = Float.intBitsToFloat((-1629067674 >>> 95 | -1629067674 << ~95 + 1) & 0xFFFFFFFF);
        bv = Float.intBitsToFloat(1717987826 >>> 75 | 1717987826 << ~75 + 1);
        bw = Float.intBitsToFloat(Integer.reverse(-1288490052));
        bx = Float.intBitsToFloat(Integer.reverse(-1288490052));
        by = Float.intBitsToFloat((860844851 >>> 54 | 860844851 << -54) & 0xFFFFFFFF);
        bz = Float.intBitsToFloat(Integer.reverse(-1288490372));
        ca = Float.intBitsToFloat((1932735311 >>> 230 | 1932735311 << ~230 + 1) & 0xFFFFFFFF);
        cb = Float.intBitsToFloat((-1717986693 >>> 201 | -1717986693 << ~201 + 1) & 0xFFFFFFFF);
        cc = -2147483641 >>> 63 | -2147483641 << -63;
        cd = Long.reverse(8220605720396055778L);
        ce = Integer.reverse(0x8000000);
        cf = Integer.reverse(-1);
        cg = Long.reverse(8220605720396055778L);
        ch = Integer.reverse(0);
        ci = Integer.reverse(-2013265920);
        cj = -1 >>> 12 | -1 << -12;
        ck = Long.reverse(8220605720396055778L);
        cl = 0x12000000 >>> 56 | 0x12000000 << ~56 + 1;
        cm = Long.reverse(8220605720396055778L);
        cn = Integer.reverse(0);
        co = (-2147483639 >>> 191 | -2147483639 << -191) & 0xFFFFFFFF;
        cp = Long.reverse(5770647523106505954L);
        cq = Long.reverse(0x2200000000000000L);
        cr = Integer.reverse(0x28000000);
        cs = Long.reverse(5770647523106505954L);
        ct = Long.reverse(0x2200000000000000L);
        cu = Integer.reverse(0);
        cv = Double.longBitsToDouble(Long.reverse(2044L));
        cw = Double.longBitsToDouble(Long.reverse(2044L));
        cx = 0x40000000 >>> 254 | 0x40000000 << ~254 + 1;
        cy = Integer.reverse(0);
        cz = 1024 >>> 138 | 1024 << ~138 + 1;
        da = (336 >>> 68 | 336 << ~68 + 1) & 0xFFFFFFFF;
        db = Long.reverse(8220605720396055778L);
        dc = 0xB00000 >>> 115 | 0xB00000 << ~115 + 1;
        dd = Long.reverse(5770647523106505954L);
        de = Long.reverse(0x2200000000000000L);
        df = 376832 >>> 14 | 376832 << -14;
        dg = Integer.reverse(-1);
        dh = Long.reverse(8220605720396055778L);
        di = Integer.reverse(0);
        dj = 12288 >>> 105 | 12288 << -105;
        dk = Long.reverse(5770647523106505954L);
        dl = Long.reverse(0x2200000000000000L);
        dm = Integer.reverse(-1744830464);
        dn = Long.reverse(5770647523106505954L);
        cfr_renamed_1 = Long.reverse(0x2200000000000000L);
        dp = 0 >>> 244 | 0 << ~244 + 1;
        dq = 0 >>> 14 | 0 << -14;
        dr = Integer.reverse(0x58000000);
        ds = (851968 >>> 239 | 851968 << -239) & 0xFFFFFFFF;
        var_java_lang_String_arr_a = new String[dr];
        var_java_lang_String_arr_b = new String[ds];
        NLoginCore_456.void_b();
    }

    @Nullable
    public Location a(Location location, boolean bl) {
        World world;
        if (bl && this.var_org_bukkit_Location_e != null) {
            return this.var_org_bukkit_Location_e;
        }
        if (this.var_org_bukkit_Location_d != null) {
            return this.var_org_bukkit_Location_d;
        }
        if (NLoginCore_532.B.ar() && (world = location.getWorld()) != null) {
            return world.getHighestBlockAt(location).getLocation().add(cv, 0.0, cw);
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public boolean boolean_a(NLoginCore_509 var1_1, NLoginCore_510 var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (var_if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 8 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void a(NLoginType_008 NLoginType_008, boolean bl) {
        String string;
        nLoginBukkit nLoginBukkit2 = this.var_com_nickuc_login_bukkit_nLoginBukkit_c;
        this.var_org_bukkit_Location_b = this.a(nLoginBukkit2, NLoginType_016.var_com_nickuc_login_NLoginType_016_c);
        this.var_org_bukkit_Location_c = this.a(nLoginBukkit2, NLoginType_016.var_com_nickuc_login_NLoginType_016_d);
        this.var_org_bukkit_Location_d = this.a(nLoginBukkit2, NLoginType_016.var_com_nickuc_login_NLoginType_016_a);
        this.var_org_bukkit_Location_e = this.a(nLoginBukkit2, NLoginType_016.var_com_nickuc_login_NLoginType_016_b);
        this.var_org_bukkit_Location_f = this.a(nLoginBukkit2, NLoginType_016.var_com_nickuc_login_NLoginType_016_e);
        NLoginCore_482 NLoginCore_4822 = NLoginType_008.com_nickuc_login_NLoginCore_224_a().com_nickuc_login_NLoginCore_482_a();
        if (!NLoginCore_4822.c(string = NLoginType_016.var_com_nickuc_login_NLoginType_016_f.aE())) {
            NLoginCore_4822.com_nickuc_login_NLoginCore_482_a(string, (this.var_org_bukkit_Location_b == null ? cx : cy) != 0);
        }
        this.var_boolean_c = NLoginCore_4822.boolean_a(string, cz != 0);
    }

    @Generated
    public Location d() {
        return this.var_org_bukkit_Location_e;
    }
}

