/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.CommonDialogData
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.Dialog
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.DialogAction
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.MultiActionDialog
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.action.Action
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.action.DynamicCustomAction
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.body.DialogBody
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessage
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessageDialogBody
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.button.ActionButton
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.button.CommonButtonData
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.input.Input
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.input.InputControl
 *  com.nickuc.login.lib.packetevents.api.protocol.dialog.input.TextInputControl
 *  com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion
 *  com.nickuc.login.lib.packetevents.api.protocol.player.User
 *  com.nickuc.login.lib.packetevents.api.resources.ResourceLocation
 *  com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerClearDialog
 *  com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerShowDialog
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerClearDialog
 *  com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerShowDialog
 *  io.netty.channel.Channel
 *  io.netty.util.AttributeKey
 *  javax.annotation.Nullable
 *  lombok.Generated
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.TextComponent
 */
package com.nickuc.login;

import com.nickuc.login.bukkit.BukkitHelper_001;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.CommonDialogData;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.Dialog;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.DialogAction;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.MultiActionDialog;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.action.Action;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.action.DynamicCustomAction;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.DialogBody;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessage;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.body.PlainMessageDialogBody;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.button.ActionButton;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.button.CommonButtonData;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.input.Input;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.input.InputControl;
import com.nickuc.login.lib.packetevents.api.protocol.dialog.input.TextInputControl;
import com.nickuc.login.lib.packetevents.api.protocol.player.ClientVersion;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.resources.ResourceLocation;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerClearDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.server.WrapperConfigServerShowDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerClearDialog;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerShowDialog;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_175;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_529;
import com.nickuc.login.NLoginInterface_031;
import com.nickuc.login.NLoginCore_234;
import com.nickuc.login.NLoginCore_023;
import com.nickuc.login.BCryptHashProvider;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_367;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginInterface_017;
import com.nickuc.login.NLoginCore_492;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_146;
import com.nickuc.login.NLoginCore_357;
import com.nickuc.login.NLoginCore_225;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_244;
import com.nickuc.login.NLoginInterface_032;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import com.nickuc.login.NLoginCore_588;
import com.nickuc.login.NLoginCore_096;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;

public class NLoginCore_206 {
    private static int di;
    private static long ey;
    private static long da;
    private static int s;
    private static int er;
    private static long bs;
    private static int bi;
    private static int bv;
    private static int ct;
    private static int bx;
    private static long fd;
    private static long m;
    private static int bn;
    private static int dv;
    private static int ba;
    private static int bt;
    private static int j;
    private static long q;
    private static int ez;
    private static long cp;
    private static long bf;
    private static int be;
    private static long bc;
    private static int bg;
    private static long bj;
    private static int ce;
    private static int by;
    private static int var_int_b;
    private static int eb;
    private static int dw;
    private static int en;
    private static int fi;
    private static int cy;
    private static int t;
    private static String[] var_java_lang_String_arr_a;
    private static long bm;
    private static int ej;
    private static int e;
    private static long dg;
    private static int dh;
    private static int ak;
    private static int var_int_c;
    private static int es;
    private static long al;
    private static long z;
    private static long cx;
    private static int dl;
    private static int fe;
    private static int var_int_a;
    private static int cq;
    private static int fj;
    private static long n;
    private static int fh;
    private static int dc;
    private static long fc;
    private static int db;
    private static int o;
    private static long eo;
    private static int p;
    public final NLoginCore_146 var_com_nickuc_login_NLoginCore_146_a = new NLoginCore_146(this);
    private final NLoginType_008 var_com_nickuc_login_NLoginType_008_v;
    private static int cm;
    private static int df;
    private static int fv;
    private static int y;
    private static int ci;
    private static int ac;
    public final NLoginCore_225 var_com_nickuc_login_NLoginCore_225_a;
    private static int aj;
    private static int bu;
    private static int cl;
    private static int de;
    private static int et;
    private static long var_long_c;
    private static long w;
    private static int dr;
    private static int ek;
    private static int ag;
    private static int bk;
    private static int cd;
    private static int bb;
    private static int ab;
    private static long cb;
    private static int ea;
    private static int x;
    private static int d;
    private static long fp;
    private static long cs;
    private static int eq;
    private static long ap;
    private static int du;
    private static int l;
    private static int bz;
    private static long co;
    private static long ai;
    private static int bl;
    private static int af;
    private static int g;
    private static int bd;
    private static int eh;
    private static int dm;
    private static int dq;
    private static int az;
    private static int dk;
    private static int ax;
    private static long ei;
    private static int cv;
    private static long dy;
    private static int cu;
    private static int em;
    private static int dt;
    private static int fl;
    private static int el;
    private static long ae;
    private static int cj;
    private static int an;
    private static long cz;
    private static int fq;
    private static int ex;
    private static int ar;
    private static long dp;
    private static int bw;
    private static long ch;
    private static int ca;
    private static long fg;
    private static long bp;
    private static int ef;
    private static long ad;
    private static int bq;
    private static String[] var_java_lang_String_arr_b;
    private static long as;
    private static int dz;
    private static int bo;
    private static int eg;
    private static int ah;
    public final NLoginCore_023 var_com_nickuc_login_NLoginCore_023_a = new NLoginCore_023(this);
    private static int bh;
    private static long var_long_v;
    private static long dj;
    private static long ao;
    private static int fu;
    private static int fx;
    private static int fs;
    private static int cn;
    private static int aq;
    private static int ft;
    private static long cr;
    private static int ep;
    private static int fw;
    private static long ff;
    private static int fr;
    private static int au;
    private static long am;
    private static int fa;
    private static int cw;
    private static int at;
    private static int eu;
    private static int br;
    private static int ec;
    private static long cc;
    private static int aw;
    private static long aa;
    private static int fo;
    private static int h;
    private static int fb;
    private static int fk;
    private static int u;
    private static int k;
    private static long dn;
    private static int dd;
    private static int ee;
    private static long ay;
    private static long ew;
    private static int av;
    private static int ds;
    private static int cfr_renamed_1;
    private static int f;
    private static int fn;
    private static int ck;
    public final NLoginCore_492 var_com_nickuc_login_NLoginCore_492_a = new NLoginCore_492();
    private static int r;
    private static long ed;
    private static int dx;
    private static int cf;
    private static int i;
    private static int cg;
    private static long fm;
    private static long ev;

    public void a(User user, String string, boolean bl, @Nullable NLoginInterface_032 NLoginInterface_0322) {
        NLoginCore_135<ActionButton> NLoginCore_1352;
        TextComponent textComponent = NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bE, string, null, new Object[bt]));
        DialogBody[] dialogBodyArray = new DialogBody[bu];
        dialogBodyArray[NLoginCore_206.bv] = new PlainMessageDialogBody(new PlainMessage((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bF, string, null, new Object[bw])), bx));
        NLoginCore_135<DialogBody> NLoginCore_1353 = NLoginCore_135.a(dialogBodyArray);
        Input[] inputArray = new Input[by];
        inputArray[NLoginCore_206.bz] = new Input((String)NLoginCore_206.c("㺀", (int)ca, (long)(cb ^ cc)), (InputControl)new TextInputControl(cd, (Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bG, string, null, new Object[ce])), cf != 0, (String)NLoginCore_206.c("㺃", (int)cg, (long)ch), ci, null));
        NLoginCore_135<Input> NLoginCore_1354 = NLoginCore_135.a(inputArray);
        if (bl) {
            ActionButton[] actionButtonArray = new ActionButton[cj];
            actionButtonArray[NLoginCore_206.ck] = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bI, string, null, new Object[cl])), null, cm), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺆", (int)cn, (long)(co ^ cp)), (String)NLoginCore_206.c("㺉", (int)cq, (long)(cr ^ cs))), null));
            actionButtonArray[NLoginCore_206.ct] = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bH, string, null, new Object[cu])), null, cv), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺌", (int)cw, (long)cx), (String)NLoginCore_206.c("㺏", (int)cy, (long)(cz ^ da))), null));
            NLoginCore_1352 = NLoginCore_135.a(actionButtonArray);
        } else {
            ActionButton[] actionButtonArray = new ActionButton[db];
            actionButtonArray[NLoginCore_206.dc] = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bH, string, null, new Object[dd])), null, de), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺒", (int)df, (long)dg), (String)NLoginCore_206.c("㺕", (int)(dh & di), (long)dj)), null));
            NLoginCore_1352 = NLoginCore_135.a(actionButtonArray);
        }
        ActionButton actionButton = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bJ, string, null, new Object[dk])), null, dl), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺘", (int)dm, (long)dn), (String)NLoginCore_206.c("㺛", (int)cfr_renamed_1, (long)dp)), null));
        this.a(user, textComponent, NLoginCore_1353, NLoginCore_1354, NLoginCore_1352, actionButton, NLoginInterface_0322);
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_206.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_446.E("ԋԭԯԏԳՒՊՠՌԛՙՏ՝՗ԠՅէզ՞դ՞Գ", (byte)39, 69), NLoginCore_206.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_559.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČҏҚҜ҄ҋҧҬҫҙҝҟҡҨҳĦ", (byte)39, 66) + string + NLoginCore_091.F("ԝ", (byte)39, 70) + methodType.toString(), exception);
        }
    }

    public boolean a(User user, NLoginInterface_032 NLoginInterface_0322) {
        if (BCryptHashProvider.com_nickuc_login_NLoginCore_175_a() != NLoginCore_175.var_com_nickuc_login_NLoginCore_175_c) {
            return var_int_a != 0;
        }
        if (this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginCore_495_a().p()) {
            return var_int_b != 0;
        }
        if (user.getClientVersion().isOlderThan(ClientVersion.V_1_21_6)) {
            return var_int_c != 0;
        }
        if (this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginCore_581_b().a(user).isOlderThan(ClientVersion.V_1_21_6)) {
            return d != 0;
        }
        Channel channel = (Channel)user.getChannel();
        NLoginInterface_017 NLoginInterface_0172 = this.a(user, channel);
        if (NLoginInterface_0172 == null) {
            return e != 0;
        }
        ForceRegisterConfig ForceRegisterConfig2 = NLoginInterface_0172.com_nickuc_login_ForceRegisterConfig_a();
        boolean bl = ForceRegisterConfig2.boolean_A();
        if (!bl) {
            int n;
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_n.ar() && ForceRegisterConfig2.t()) {
                return f != 0;
            }
            if (this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginCore_291_a().com_nickuc_login_NLoginCore_244_a(ForceRegisterConfig2, user.getAddress().getAddress().getHostAddress()) == NLoginCore_244.var_com_nickuc_login_NLoginCore_244_d) {
                return g != 0;
            }
            NLoginInterface_031 NLoginInterface_0312 = this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginInterface_030_b().com_nickuc_login_NLoginInterface_031_a();
            int n2 = n = NLoginInterface_0172.e() || NLoginInterface_0312 != null && NLoginInterface_0312.boolean_a(user.getUUID()) ? h : i;
            if (NLoginCore_370.var_com_nickuc_login_NLoginCore_329_k.ar() && n != 0) {
                return j != 0;
            }
        }
        if (bl) {
            this.a(user, NLoginInterface_0172.java_lang_String_d(), NLoginInterface_0322);
        } else {
            this.a(user, NLoginInterface_0172.java_lang_String_d(), NLoginCore_367.a(this.var_com_nickuc_login_NLoginType_008_v, ForceRegisterConfig2), NLoginInterface_0322);
        }
        channel.eventLoop().schedule(() -> {
            NLoginCore_096 NLoginCore_0962;
            block8: {
                block7: {
                    block6: {
                        try {
                            if (channel.isActive()) break block6;
                            NLoginInterface_0322.resume(fq != 0);
                            return;
                        }
                        catch (Throwable throwable) {
                            NLoginInterface_0322.resume(fv != 0);
                            throw throwable;
                        }
                    }
                    if (channel.hasAttr((AttributeKey)NLoginCore_096.var_long_c)) break block7;
                    NLoginInterface_0322.resume(fr != 0);
                    return;
                }
                NLoginCore_0962 = (NLoginCore_096)channel.attr((AttributeKey)NLoginCore_096.var_long_c).get();
                if (NLoginCore_0962 != null) break block8;
                NLoginInterface_0322.resume(fs != 0);
                return;
            }
            if (NLoginCore_0962.var_com_nickuc_login_NLoginInterface_032_a != null) {
                this.a(user);
                NLoginCore_234.i(user, NLoginCore_150.a(bl ? NLoginCore_374.ad : NLoginCore_374.ac, new Object[ft]));
            }
            NLoginInterface_0322.resume(fu != 0);
        }, (long)NLoginCore_532.E.r(), TimeUnit.SECONDS);
        return k != 0;
    }

    private void a(User user, TextComponent textComponent, List<DialogBody> list, List<Input> list2, List<ActionButton> list3, ActionButton actionButton, @Nullable NLoginInterface_032 NLoginInterface_0322) {
        CommonDialogData commonDialogData = new CommonDialogData((Component)textComponent, null, fh != 0, fi != 0, DialogAction.CLOSE, list, list2);
        MultiActionDialog multiActionDialog = new MultiActionDialog(commonDialogData, list3, actionButton, fj);
        switch (NLoginCore_357.M[user.getEncoderState().ordinal()]) {
            case 1: {
                user.sendPacketSilently((PacketWrapper)new WrapperConfigServerShowDialog((Dialog)multiActionDialog));
                break;
            }
            case 2: {
                user.sendPacketSilently((PacketWrapper)new WrapperPlayServerShowDialog((Dialog)multiActionDialog));
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_206.c("㺀", (int)(fk & fl), (long)fm) + user.getEncoderState());
            }
        }
        Channel channel = (Channel)user.getChannel();
        channel.attr((AttributeKey)NLoginCore_096.var_long_c).set((Object)new NLoginCore_096(NLoginInterface_0322, (byte)fn, null));
    }

    private static void b() {
        int n;
        var_long_c = -3812963298892632114L;
        long l = var_long_c ^ 0x3A7878F345DA4EE2L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(31 + 37), (byte)(41 + 28), (byte)(50 + 33), (byte)(42 + 5), (byte)(47 + 20), (byte)(33 + 33), (byte)(5 + 62), (byte)(44 + 3), (byte)(34 + 46), (byte)(12 + 63), 67, 83, (byte)(52 + 1), (byte)(55 + 25), (byte)(70 + 27), (byte)(67 + 33), (byte)(90 + 10), (byte)(104 + 1), (byte)(63 + 47), (byte)(45 + 58)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), (byte)(2 + 67), 83}, StandardCharsets.UTF_8));
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
                    NLoginCore_206.var_java_lang_String_arr_b[0] = NLoginCore_384.F("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷա՛ձսՆբ֋ՠտգջ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[1] = NLoginCore_384.E("ԬՋՉՕԓԢԲ՗ԬՃՊՐԖԳԚՊՌ՝ՒԵԠՓԶէԳԷըԽՙԷԯգՁզԬմՓԨԲյդ՛ԹՔծՓհ՚ՌսԿՎՕՎՋՌ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[2] = NLoginCore_138.B("ĬăĉČĝÿčéöĐČćęćĩćğĶğþĢĝĊċ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[3] = NLoginCore_387.A("éĠêóĦðĀĄćôĬÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[4] = NLoginCore_387.A("ĝğăĎĮĆđİĘēĤÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[5] = NLoginCore_076.C("лѲмхѸтђіљцѾё", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[6] = NLoginCore_223.E("ՈՇԤԊԣԓԸՙԬԌՏԜ՘ԛԼ՝ԙԙԼ՞ՐԹՂդԷ՜ԹըՕեԭԾՇԿՌՒթգԵԵՆՂոՍՍ՞պՕոԼՙՙւՎՋՌ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[7] = NLoginCore_223.C("ыѮѵҀяѻоѪѾѤќїњьҐҊѣёҍчҁҖѳ҂ѐѕ҇҇ѻѱѸҍўҀ҄ҕѺҡѶғҝѣѾ҂ѼҪҥѻҮҳҀҤѨҒҌҢҮѷғҼґҰҔҬ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[8] = NLoginCore_076.C("ѝѼѺ҆фѓѣ҈ѝѴѻҁчѤыѻѽҎ҃Ѧё҄ѧҘѤѨҙѮҊѨѠҔѲҗѝҥ҄љѣҦҕҌѪ҅ҟ҄ҡҋѽҮѰѿ҆ѿѼѽ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[9] = NLoginCore_453.C("ѾѕћўѯёџлшѢўљѫљѻљѱ҈ѱѐѴѯќѝ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[10] = NLoginCore_451.E("ԊՁԋԔՇԑԡԥԨԕՍԠ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[11] = NLoginCore_223.F("ԾՀԤԯՏԧԲՑԹԴՅԠ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[12] = NLoginCore_201.B("éĠêóĦðĀĄćôĬÿ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[13] = NLoginCore_384.D("ѹѸѕлєфѩҊѝнҀэ҉ьѭҎъъѭҏҁѪѳҕѨҍѪҙ҆ҖўѯѸѰѽ҃ҚҔѦѦѷѳҩѾѾҏҫ҆ҩѭҊҊҳѿѼѽ", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[14] = NLoginCore_559.F("ՌԦՎԥՈԬԎԮԐԪՎԖՅԕՐՌԚՃաաԺԾԫԬ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[15] = NLoginCore_453.A("þĜúİíĲĐĴĠģôúļõįĈüĉĖĝûįėĔĆĖňŇĺňŅģ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[16] = NLoginCore_091.A("ĢèāċĀĕĒĳċïĶĳĊıĚõĖčľĀĝĳĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[17] = NLoginCore_427.A("éĠêóĦðĀĄćôĬÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[18] = NLoginCore_027.B("ĬČĲīĳĉĬôăĵĂÿ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[19] = NLoginCore_091.D("ёоьсѕѷц҇хчџѣѬѿѸѐ҇ѣѦғҊѯќѝ", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[20] = NLoginCore_138.D("Ѿў҄ѽ҅ћѾцѕ҇єё", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[21] = NLoginCore_027.A("ĘĥĈüīíĦĘĥĩħķĊøĽĝĖĚĠėöčĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[22] = NLoginCore_324.E("ՍԭՓՌՔԪՍԕԤՖԣԠ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[23] = NLoginCore_453.B("ĘĥĈüīíĦĘĥĩħķĊøĽĝĖĚĠėöčĊċ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[24] = NLoginCore_223.A("ĬČĲīĳĉĬôăĵĂÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[25] = NLoginCore_223.F("ԍԦՓՎՊՊՊԤԶԙԩԳՉԘՔԷՠՂՒ՞ՅԮԫԬ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[26] = NLoginCore_324.E("ՃԉԢԬԡԶԳՔԬԐ՘ՓՐ՚ՔՁԾ՚ԮեՐդԫԬ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[27] = NLoginCore_138.C("лѲмхѸтђіљцѾё", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[28] = NLoginCore_027.E("ՃԉԢԬԡԶԳՔԬԐՕԻ՛ԭՒՖ՜ԼՌՃՎդԫԬ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[29] = NLoginCore_324.E("ԊՁԋԔՇԑԡԥԨԕՍԠ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[30] = NLoginCore_223.D("Ѿў҄ѽ҅ћѾцѕ҇єё", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[31] = NLoginCore_453.C("л҄ѥэ҃ѐ҇љќ҆ѬурѼьѣҎю҅џѤҐѵђјҗҏѯҞѪҘќ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[32] = NLoginCore_092.F("ՍԭՓՌՔԪՍԕԤՖԣԠ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[33] = NLoginCore_027.B("éĲēûıþĵćĊĴěĭĖĆĲĲķĭĝĀüčĊċ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[34] = NLoginCore_027.A("ģĎĥĨđëõāĕøĳùęľĈĬĖğŁýŃĂıĵğłŁņġăŌŏďħĞĨĴİĨĥĢĳđğ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[35] = NLoginCore_027.D("ѵѠѷѺѣнчѓѧъ҅ыѫҐњѾѨѱғяҕє҃҇ѱҔғҘѳѕҞҡѡѹѰѺ҆҂ѺѷѴ҅ѣѱ", (byte)28, 68);
                    continue block7;
                }
                case 1: {
                    NLoginCore_206.var_java_lang_String_arr_b[0] = NLoginCore_201.F("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷ՞՟՘՟Փմֈք։ՈՋ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[1] = NLoginCore_027.B("ċĪĨĴòāđĶċĢĩįõĒùĩīļıĔÿĲĕņĒĖŇĜĸĖĎłĠŅċœĲćđŔŃĺĕōěĽĔħşĹŌłĺœĪī", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[2] = NLoginCore_451.C("ѾѕћўѯёџлшѢќѹѠѥчѝќ҅ҀѦҌҕќѝ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[3] = NLoginCore_324.B("ĠćĝĀăðĵñĒëĚÿ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[4] = NLoginCore_004.D("ѻѷѐ҆҄ѴўѸ҉҂ыё", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[5] = NLoginCore_091.A("þĨčĳĪòĂĢĎĎĸÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[6] = NLoginCore_559.B("ħĦăéĂòėĸċëĮûķúěļøøěĽįĘġŃĖĻĘŇĴńČĝĦĞīıňłĔĔĥġŗĸœňĩĜĹĵĔĜŌţĪī", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[7] = NLoginCore_201.E("ԚԽՄՏԞՊԍԹՍԳԫԦԩԛ՟ՙԲԠ՜ԖՐեՂՑԟԤՖՖՊՀՇ՜ԭՏՓդՉհՅբլԲՍՑՋչմՊսւՏճԷճՠտ՞Ֆ՝թըրոՇ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[8] = NLoginCore_559.C("ѝѼѺ҆фѓѣ҈ѝѴѻҁчѤыѻѽҎ҃Ѧё҄ѧҘѤѨҙѮҊѨѠҔѲҗѝҥ҄љѣҦҕҌѪқңѸҩѺѻҨҝҊҁҵѼѽ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[9] = NLoginCore_559.C("ѾѕћўѯёџлшѢѝѦѹѰјѬўъѼчѶѯќѝ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[10] = NLoginCore_324.F("ՄՅԼՌԥԠԑՋ՗ՊԚԠ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[11] = NLoginCore_091.A("ïģĭĝĤıĪĨîĖĴÿ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[12] = NLoginCore_559.E("ՃԻԡԍՓԎԯԕԩԘՅԠ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[13] = NLoginCore_324.C("ѹѸѕлєфѩҊѝнҀэ҉ьѭҎъъѭҏҁѪѳҕѨҍѪҙ҆ҖўѯѸѰѽ҃ҚҔѦѦѷѳҧҦҜҍҢѧҪҮҔѯҤҏѼѽ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[14] = NLoginCore_027.E("ՌԦՎԥՈԬԎԮԐԪՎԪ՝ՐԧԳԵՔԮԠ՘դԫԬ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[15] = NLoginCore_201.C("ѐѮь҂п҄Ѣ҆ѲѵцьҎчҁњюћѨѯэѴѶҖѨҒѹѬѶѱѯѸ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[16] = NLoginCore_173.A("ĢèāċĀĕĒĳċïĵĸĨĉĎĲĐğłıęĳĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[17] = NLoginCore_092.D("опѾѝуѤцҁїї҂ё", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[18] = NLoginCore_387.A("ĝĭĨčíĵĒñõčěĈõĮċćēĕēĳĳĝĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[19] = NLoginCore_559.A("ÿìúïăĥôĵóõĊĚĲĪöøĐĎğġĖēąĿĀłňľľĮŎĤ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[20] = NLoginCore_004.A("ĄñčîēĩĭíĩĒąĕĈĹöħĽĢþþĤĳĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[21] = NLoginCore_451.E("ԹՆԩԝՌԎՇԹՆՊՅԯԾԗԸԴԬԭՔԞԞ՗ԢԶՈԳԾՍՍՎՌկ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[22] = NLoginCore_201.B("çĥìĝĔĶħĶĕģđĈóħĭğĘėķþŀĳĊċ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[23] = NLoginCore_027.E("ԹՆԩԝՌԎՇԹՆՊՆԥԲ՞՟ՋԓԘԵ՞ԮԾՑԠԦԠի՝ԽՆզՉ", (byte)28, 69);
                    NLoginCore_206.var_java_lang_String_arr_b[24] = NLoginCore_223.A("îêäČġďčĳģĳöąćĻěļòĎėþėčĊċ", (byte)28, 65);
                    NLoginCore_206.var_java_lang_String_arr_b[25] = NLoginCore_138.D("ої҄ѿѻѻѻѕѧъњѵѠћҋѼѪѓѵ҂ю҅ќѝ", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[26] = NLoginCore_559.B("ĢèāċĀĕĒĳċïķĳĎĮĎĪıĖķĢĒčĊċ", (byte)28, 66);
                    NLoginCore_206.var_java_lang_String_arr_b[27] = NLoginCore_110.F("ՊԍՁՌՆԦՄԶԶՓԚԠ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[28] = NLoginCore_076.D("ѴкѓѝђѧѤ҅ѝс҇ѸчѸьэќ҂҉ѽ҇џќѝ", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[29] = NLoginCore_223.C("ѶџќђѮјѨјѝіѬё", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[30] = NLoginCore_138.F("ՍԯԴԟՑՎԮՄՒՋԣՇՇ՚՗՜ԴԟԞՍԷԾԫԬ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[31] = NLoginCore_201.F("ԊՓԴԜՒԟՖԨԫՕԻԒԏՋԛԲ՝ԝՔԮԳգ՜ԾՇ՝ՓՆՅԷ՗ձ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[32] = NLoginCore_004.D("ҁѤѯѮхѻчѥѷѡєџѥѪѺѼёѰэєѴѯќѝ", (byte)28, 68);
                    NLoginCore_206.var_java_lang_String_arr_b[33] = NLoginCore_110.C("л҄ѥэ҃ѐ҇љќ҆ѵфѧѻќ҆ѩѠђѤѦџќѝ", (byte)28, 67);
                    NLoginCore_206.var_java_lang_String_arr_b[34] = NLoginCore_324.F("ՄԯՆՉԲԌԖԢԶԙՔԚԺ՟ԩՍԷՀբԞդԣՒՖՀգբէՂԤխհԽՏՉՏթՑձժԳՃթՀ", (byte)28, 70);
                    NLoginCore_206.var_java_lang_String_arr_b[35] = NLoginCore_223.B("ģĎĥĨđëõāĕøĳùęľĈĬĖğŁýŃĂıĵğłŁņġăŌŏĎġĞČĴĤőŉĕŖńğ", (byte)28, 66);
                    continue block7;
                }
                case 2: {
                    NLoginCore_206.var_java_lang_String_arr_b[0] = NLoginCore_384.A("ĥíģēĮċĒĖĸĕĊÿ", (byte)28, 65);
                    continue block7;
                }
                case 4: {
                    NLoginCore_206.var_java_lang_String_arr_b[0] = NLoginCore_091.A("ĮûêêČĲÿïĦģĂĸĪĳěĿľċûěĸįŀļńħĂęĉĪňō", (byte)28, 65);
                }
            }
        }
    }

    public void a(User user, String string, @Nullable NLoginInterface_032 NLoginInterface_0322) {
        TextComponent textComponent = NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bK, string, null, new Object[dq]));
        DialogBody[] dialogBodyArray = new DialogBody[dr];
        dialogBodyArray[NLoginCore_206.ds] = new PlainMessageDialogBody(new PlainMessage((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bL, string, null, new Object[dt])), du));
        NLoginCore_135<DialogBody> NLoginCore_1352 = NLoginCore_135.a(dialogBodyArray);
        Input[] inputArray = new Input[dv];
        inputArray[NLoginCore_206.dw] = new Input((String)NLoginCore_206.c("㺀", (int)dx, (long)dy), (InputControl)new TextInputControl(dz, (Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bM, string, null, new Object[ea])), eb != 0, (String)NLoginCore_206.c("㺃", (int)ec, (long)ed), ee, null));
        inputArray[NLoginCore_206.ef] = new Input((String)NLoginCore_206.c("㺆", (int)(eg & eh), (long)ei), (InputControl)new TextInputControl(ej, (Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bN, string, null, new Object[ek])), el != 0, (String)NLoginCore_206.c("㺉", (int)(em & en), (long)eo), ep, null));
        NLoginCore_135<Input> NLoginCore_1353 = NLoginCore_135.a(inputArray);
        ActionButton[] actionButtonArray = new ActionButton[eq];
        actionButtonArray[NLoginCore_206.er] = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bO, string, null, new Object[es])), null, et), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺌", (int)eu, (long)(ev ^ ew)), (String)NLoginCore_206.c("㺏", (int)ex, (long)ey)), null));
        NLoginCore_135<ActionButton> NLoginCore_1354 = NLoginCore_135.a(actionButtonArray);
        ActionButton actionButton = new ActionButton(new CommonButtonData((Component)NLoginCore_529.a(NLoginCore_150.a(NLoginCore_374.bP, string, null, new Object[ez])), null, fa), (Action)new DynamicCustomAction(new ResourceLocation((String)NLoginCore_206.c("㺒", (int)fb, (long)(fc ^ fd)), (String)NLoginCore_206.c("㺕", (int)fe, (long)(ff ^ fg))), null));
        this.a(user, textComponent, NLoginCore_1352, NLoginCore_1353, NLoginCore_1354, actionButton, NLoginInterface_0322);
    }

    static /* synthetic */ void a(NLoginCore_206 NLoginCore_2062, User user) {
        NLoginCore_2062.a(user);
    }

    @Generated
    public NLoginCore_206(NLoginType_008 NLoginType_008) {
        this.var_com_nickuc_login_NLoginCore_225_a = new NLoginCore_225(this);
        this.var_com_nickuc_login_NLoginType_008_v = NLoginType_008;
    }

    private void a(User user) {
        switch (NLoginCore_357.M[user.getEncoderState().ordinal()]) {
            case 1: {
                user.sendPacketSilently((PacketWrapper)new WrapperConfigServerClearDialog());
                break;
            }
            case 2: {
                user.sendPacketSilently((PacketWrapper)new WrapperPlayServerClearDialog());
                break;
            }
            default: {
                throw new IllegalArgumentException((String)NLoginCore_206.c("㺀", (int)fo, (long)fp) + user.getEncoderState());
            }
        }
    }

    static {
        var_int_a = (0 >>> 128 | 0 << -128) & 0xFFFFFFFF;
        var_int_b = Integer.reverse(0);
        var_int_c = Integer.reverse(0);
        d = (0 >>> 235 | 0 << ~235 + 1) & 0xFFFFFFFF;
        e = 0 >>> 10 | 0 << ~10 + 1;
        f = Integer.reverse(0);
        g = Integer.reverse(0);
        h = (0x4000000 >>> 250 | 0x4000000 << ~250 + 1) & 0xFFFFFFFF;
        i = 0 >>> 90 | 0 << ~90 + 1;
        j = 0 >>> 96 | 0 << -96;
        k = Integer.reverse(Integer.MIN_VALUE);
        l = Integer.reverse(0);
        m = Long.reverse(8355558051239274707L);
        n = Long.reverse(-2738188573441261568L);
        o = Integer.reverse(Integer.MIN_VALUE);
        p = Integer.reverse(-1);
        q = Long.reverse(-6200075944422168365L);
        r = Integer.reverse(0);
        s = 0xA00000 >>> 149 | 0xA00000 << ~149 + 1;
        t = Integer.reverse(0);
        u = 0x800000 >>> 182 | 0x800000 << -182;
        var_long_v = Long.reverse(8355558051239274707L);
        w = Long.reverse(-2738188573441261568L);
        x = Integer.reverse(Integer.MIN_VALUE);
        y = 0x18000000 >>> 187 | 0x18000000 << -187;
        z = Long.reverse(8355558051239274707L);
        aa = Long.reverse(-2738188573441261568L);
        ab = Integer.reverse(0x40000000);
        ac = Integer.reverse(0x20000000);
        ad = Long.reverse(8355558051239274707L);
        ae = Long.reverse(-2738188573441261568L);
        af = -2147483647 >>> 127 | -2147483647 << -127;
        ag = (0xA000000 >>> 57 | 0xA000000 << -57) & 0xFFFFFFFF;
        ah = Integer.reverse(-1);
        ai = Long.reverse(-6200075944422168365L);
        aj = Integer.reverse(0x20000000);
        ak = 0x1800000 >>> 22 | 0x1800000 << ~22 + 1;
        al = Long.reverse(8355558051239274707L);
        am = Long.reverse(-2738188573441261568L);
        an = 0x1C0000 >>> 50 | 0x1C0000 << -50;
        ao = Long.reverse(8355558051239274707L);
        ap = Long.reverse(-2738188573441261568L);
        aq = (0x1000000 >>> 53 | 0x1000000 << -53) & 0xFFFFFFFF;
        ar = Integer.reverse(-1);
        as = Long.reverse(-6200075944422168365L);
        at = 0 >>> 13 | 0 << ~13 + 1;
        au = -2147483646 >>> 127 | -2147483646 << -127;
        av = 0 >>> 213 | 0 << -213;
        aw = 18 >>> 1 | 18 << ~1 + 1;
        ax = Integer.reverse(-1);
        ay = Long.reverse(-6200075944422168365L);
        az = Integer.reverse(Integer.MIN_VALUE);
        ba = Integer.reverse(0x50000000);
        bb = -1 >>> 73 | -1 << ~73 + 1;
        bc = Long.reverse(-6200075944422168365L);
        bd = Integer.reverse(0x40000000);
        be = -1342177280 >>> 188 | -1342177280 << ~188 + 1;
        bf = Long.reverse(-6200075944422168365L);
        bg = (3 >>> 64 | 3 << ~64 + 1) & 0xFFFFFFFF;
        bh = Integer.reverse(0x30000000);
        bi = (-1 >>> 9 | -1 << ~9 + 1) & 0xFFFFFFFF;
        bj = Long.reverse(-6200075944422168365L);
        bk = Integer.reverse(0x20000000);
        bl = Integer.reverse(-1342177280);
        bm = Long.reverse(-6200075944422168365L);
        bn = Integer.reverse(0x70000000);
        bo = -1 >>> 178 | -1 << -178;
        bp = Long.reverse(-6200075944422168365L);
        bq = 245760 >>> 46 | 245760 << -46;
        br = (-1 >>> 224 | -1 << -224) & 0xFFFFFFFF;
        bs = Long.reverse(-6200075944422168365L);
        bt = Integer.reverse(0);
        bu = (0x20000000 >>> 189 | 0x20000000 << -189) & 0xFFFFFFFF;
        bv = Integer.reverse(0);
        bw = Integer.reverse(0);
        bx = (600 >>> 1 | 600 << -1) & 0xFFFFFFFF;
        by = 65536 >>> 208 | 65536 << ~208 + 1;
        bz = (0 >>> 205 | 0 << ~205 + 1) & 0xFFFFFFFF;
        ca = (65536 >>> 12 | 65536 << -12) & 0xFFFFFFFF;
        cb = Long.reverse(8355558051239274707L);
        cc = Long.reverse(-2738188573441261568L);
        cd = 4800 >>> 100 | 4800 << -100;
        ce = Integer.reverse(0);
        cf = (256 >>> 72 | 256 << -72) & 0xFFFFFFFF;
        cg = Integer.reverse(-2013265920);
        ch = Long.reverse(-6200075944422168365L);
        ci = Integer.reverse(0x2000000);
        cj = Integer.reverse(0x40000000);
        ck = (0 >>> 151 | 0 << ~151 + 1) & 0xFFFFFFFF;
        cl = Integer.reverse(0);
        cm = (38400 >>> 232 | 38400 << -232) & 0xFFFFFFFF;
        cn = Integer.reverse(0x48000000);
        co = Long.reverse(8355558051239274707L);
        cp = Long.reverse(-2738188573441261568L);
        cq = (77824 >>> 140 | 77824 << ~140 + 1) & 0xFFFFFFFF;
        cr = Long.reverse(8355558051239274707L);
        cs = Long.reverse(-2738188573441261568L);
        ct = (0x4000000 >>> 250 | 0x4000000 << -250) & 0xFFFFFFFF;
        cu = Integer.reverse(0);
        cv = (0x4B000000 >>> 87 | 0x4B000000 << ~87 + 1) & 0xFFFFFFFF;
        cw = 0x14000000 >>> 24 | 0x14000000 << -24;
        cx = Long.reverse(-6200075944422168365L);
        cy = Integer.reverse(-1476395008);
        cz = Long.reverse(8355558051239274707L);
        da = Long.reverse(-2738188573441261568L);
        db = (256 >>> 168 | 256 << -168) & 0xFFFFFFFF;
        dc = Integer.reverse(0);
        dd = (0 >>> 99 | 0 << ~99 + 1) & 0xFFFFFFFF;
        de = (0x40000006 >>> 27 | 0x40000006 << -27) & 0xFFFFFFFF;
        df = (88 >>> 194 | 88 << ~194 + 1) & 0xFFFFFFFF;
        dg = Long.reverse(-6200075944422168365L);
        dh = 23 >>> 128 | 23 << -128;
        di = (-1 >>> 193 | -1 << ~193 + 1) & 0xFFFFFFFF;
        dj = Long.reverse(-6200075944422168365L);
        dk = (0 >>> 14 | 0 << ~14 + 1) & 0xFFFFFFFF;
        dl = (0x960000 >>> 48 | 0x960000 << ~48 + 1) & 0xFFFFFFFF;
        dm = 393216 >>> 46 | 393216 << -46;
        dn = Long.reverse(-6200075944422168365L);
        cfr_renamed_1 = Integer.reverse(-1744830464);
        dp = Long.reverse(-6200075944422168365L);
        dq = (0 >>> 166 | 0 << ~166 + 1) & 0xFFFFFFFF;
        dr = 262144 >>> 114 | 262144 << ~114 + 1;
        ds = (0 >>> 149 | 0 << -149) & 0xFFFFFFFF;
        dt = Integer.reverse(0);
        du = (1228800 >>> 108 | 1228800 << ~108 + 1) & 0xFFFFFFFF;
        dv = Integer.reverse(0x40000000);
        dw = (0 >>> 182 | 0 << ~182 + 1) & 0xFFFFFFFF;
        dx = 53248 >>> 43 | 53248 << ~43 + 1;
        dy = Long.reverse(-6200075944422168365L);
        dz = Integer.reverse(880803840);
        ea = Integer.reverse(0);
        eb = Integer.reverse(Integer.MIN_VALUE);
        ec = (432 >>> 4 | 432 << ~4 + 1) & 0xFFFFFFFF;
        ed = Long.reverse(-6200075944422168365L);
        ee = Integer.reverse(0x2000000);
        ef = Integer.reverse(Integer.MIN_VALUE);
        eg = (448 >>> 100 | 448 << ~100 + 1) & 0xFFFFFFFF;
        eh = -1 >>> 153 | -1 << -153;
        ei = Long.reverse(-6200075944422168365L);
        ej = Integer.reverse(880803840);
        ek = Integer.reverse(0);
        el = (8 >>> 227 | 8 << -227) & 0xFFFFFFFF;
        em = (116 >>> 130 | 116 << ~130 + 1) & 0xFFFFFFFF;
        en = Integer.reverse(-1);
        eo = Long.reverse(-6200075944422168365L);
        ep = (0x100000 >>> 238 | 0x100000 << ~238 + 1) & 0xFFFFFFFF;
        eq = Integer.reverse(Integer.MIN_VALUE);
        er = Integer.reverse(0);
        es = Integer.reverse(0);
        et = (0x40000006 >>> 91 | 0x40000006 << ~91 + 1) & 0xFFFFFFFF;
        eu = (15 >>> 31 | 15 << -31) & 0xFFFFFFFF;
        ev = Long.reverse(8355558051239274707L);
        ew = Long.reverse(-2738188573441261568L);
        ex = (3968 >>> 103 | 3968 << ~103 + 1) & 0xFFFFFFFF;
        ey = Long.reverse(-6200075944422168365L);
        ez = Integer.reverse(0);
        fa = Integer.reverse(0x69000000);
        fb = Integer.reverse(0x4000000);
        fc = Long.reverse(8355558051239274707L);
        fd = Long.reverse(-2738188573441261568L);
        fe = Integer.reverse(-2080374784);
        ff = Long.reverse(8355558051239274707L);
        fg = Long.reverse(-2738188573441261568L);
        fh = Integer.reverse(Integer.MIN_VALUE);
        fi = 0 >>> 80 | 0 << -80;
        fj = Integer.reverse(0x40000000);
        fk = 0x22000000 >>> 56 | 0x22000000 << ~56 + 1;
        fl = -1 >>> 167 | -1 << ~167 + 1;
        fm = Long.reverse(-6200075944422168365L);
        fn = 0x40000000 >>> 62 | 0x40000000 << -62;
        fo = (140 >>> 162 | 140 << ~162 + 1) & 0xFFFFFFFF;
        fp = Long.reverse(-6200075944422168365L);
        fq = Integer.reverse(0);
        fr = (0 >>> 254 | 0 << -254) & 0xFFFFFFFF;
        fs = Integer.reverse(0);
        ft = Integer.reverse(0);
        fu = Integer.reverse(0);
        fv = (0 >>> 176 | 0 << -176) & 0xFFFFFFFF;
        fw = 36864 >>> 10 | 36864 << ~10 + 1;
        fx = Integer.reverse(0x24000000);
        var_java_lang_String_arr_a = new String[fw];
        var_java_lang_String_arr_b = new String[fx];
        NLoginCore_206.b();
    }

    static /* synthetic */ NLoginInterface_017 a(NLoginCore_206 NLoginCore_2062, User user, Channel channel) {
        return NLoginCore_2062.a(user, channel);
    }

    static /* synthetic */ NLoginType_008 a(NLoginCore_206 NLoginCore_2062) {
        return NLoginCore_2062.var_com_nickuc_login_NLoginType_008_v;
    }

    private static String a(int n, long l) {
        l ^= 0x5BL;
        l ^= 0x3A7878F345DA4EE2L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(25 + 43), (byte)(15 + 54), (byte)(77 + 6), (byte)(5 + 42), (byte)(59 + 8), (byte)(3 + 63), (byte)(61 + 6), (byte)(29 + 18), (byte)(71 + 9), (byte)(26 + 49), (byte)(14 + 53), (byte)(41 + 42), (byte)(29 + 24), (byte)(27 + 53), (byte)(24 + 73), (byte)(86 + 14), (byte)(83 + 17), (byte)(99 + 6), 110, (byte)(53 + 50)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_201.E("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࢋ࢖࢘ࢀࢇࢣࢨࢧ࢕࢙࢛࢝ࢤࢯ", (byte)13, 69));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_206.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    @Nullable
    private NLoginInterface_017 a(User user, Channel channel) {
        switch (NLoginCore_357.L[this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginCore_364_b().a().ordinal()]) {
            case 1: {
                BukkitHelper_001 BukkitHelper_001 = (BukkitHelper_001)channel.attr((AttributeKey)BukkitHelper_001.var_com_nickuc_login_NLoginCore_042_a).get();
                if (BukkitHelper_001 == null) {
                    String string = (String)NLoginCore_206.c("㺀", (int)l, (long)(m ^ n)) + user.getName() + (String)NLoginCore_206.c("㺃", (int)(o & p), (long)q);
                    NLoginCore_370.c(string, new Object[r]);
                    this.a(user);
                    String[] stringArray = new String[s];
                    stringArray[NLoginCore_206.t] = NLoginCore_206.c("㺆", (int)u, (long)(var_long_v ^ w));
                    stringArray[NLoginCore_206.x] = NLoginCore_206.c("㺉", (int)y, (long)(z ^ aa));
                    stringArray[NLoginCore_206.ab] = (String)NLoginCore_206.c("㺌", (int)ac, (long)(ad ^ ae)) + string;
                    stringArray[NLoginCore_206.af] = NLoginCore_206.c("㺏", (int)(ag & ah), (long)ai);
                    stringArray[NLoginCore_206.aj] = NLoginCore_206.c("㺒", (int)ak, (long)(al ^ am));
                    NLoginCore_234.a(user, (Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
                    return null;
                }
                return BukkitHelper_001;
            }
            case 2: 
            case 3: {
                NLoginCore_588 NLoginCore_5882 = (NLoginCore_588)channel.attr(NLoginCore_588.var_io_netty_util_AttributeKey_com_nickuc_login_NLoginCore_588__f).get();
                if (NLoginCore_5882 == null) {
                    String string = (String)NLoginCore_206.c("㺕", (int)an, (long)(ao ^ ap)) + user.getName() + (String)NLoginCore_206.c("㺘", (int)(aq & ar), (long)as);
                    NLoginCore_370.c(string, new Object[at]);
                    this.a(user);
                    String[] stringArray = new String[au];
                    stringArray[NLoginCore_206.av] = NLoginCore_206.c("㺛", (int)(aw & ax), (long)ay);
                    stringArray[NLoginCore_206.az] = NLoginCore_206.c("㺞", (int)(ba & bb), (long)bc);
                    stringArray[NLoginCore_206.bd] = (String)NLoginCore_206.c("㺡", (int)be, (long)bf) + string;
                    stringArray[NLoginCore_206.bg] = NLoginCore_206.c("㺤", (int)(bh & bi), (long)bj);
                    stringArray[NLoginCore_206.bk] = NLoginCore_206.c("㺧", (int)bl, (long)bm);
                    NLoginCore_234.a(user, (Component)NLoginCore_529.a(NLoginCore_112.a(stringArray)));
                    return null;
                }
                return NLoginCore_5882;
            }
        }
        throw new IllegalStateException((String)NLoginCore_206.c("㺪", (int)(bn & bo), (long)bp) + (Object)((Object)this.var_com_nickuc_login_NLoginType_008_v.com_nickuc_login_NLoginCore_364_b().a()) + (String)NLoginCore_206.c("㺭", (int)(bq & br), (long)bs));
    }
}

