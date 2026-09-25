/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.event.CommandType
 *  com.nickuc.login.api.enums.event.EventEnum
 *  com.nickuc.login.api.event.internal.CancellableEvent
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.event.CommandType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.internal.CancellableEvent;
import com.nickuc.login.NLoginType_025;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_437;
import com.nickuc.login.NLoginType_021;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_187;
import com.nickuc.login.NLoginCore_466;
import com.nickuc.login.NLoginCore_494;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_168;
import com.nickuc.login.NLoginCore_077;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_374;
import com.nickuc.login.NLoginType_020;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class NLoginType_032
extends NLoginCore_168<NLoginType_008> {
    private static int ac;
    private static int au;
    private static int h;
    private static int ao;
    private static int as;
    private static int at;
    private static int v;
    private static int ab;
    private static int t;
    private static int ap;
    protected final NLoginCore_466 var_com_nickuc_login_NLoginCore_466_a;
    private static int b;
    private static int s;
    private static int ai;
    private static int ar;
    private static int ah;
    private static int k;
    private static int af;
    private static int ak;
    private static int aq;
    private static int p;
    private static long var_long_a;

    public NLoginType_032(NLoginCore_466 NLoginCore_4662) {
        super(NLoginCore_4662.e());
        this.var_com_nickuc_login_NLoginCore_466_a = NLoginCore_4662;
    }

    static {
        var_long_a = Long.reverse(2562548187973812224L);
        b = (0 >>> 104 | 0 << -104) & 0xFFFFFFFF;
        h = Integer.reverse(0);
        k = Integer.reverse(0);
        p = Integer.reverse(Integer.MIN_VALUE);
        s = Integer.reverse(0x40000000);
        t = Integer.reverse(0x40000000);
        v = Integer.reverse(Integer.MIN_VALUE);
        ab = Integer.reverse(Integer.MIN_VALUE);
        ac = Integer.reverse(0);
        af = Integer.reverse(0);
        ah = (32768 >>> 237 | 32768 << -237) & 0xFFFFFFFF;
        ai = (0 >>> 136 | 0 << ~136 + 1) & 0xFFFFFFFF;
        ak = (0x1000000 >>> 56 | 0x1000000 << ~56 + 1) & 0xFFFFFFFF;
        ao = Integer.reverse(0x40000000);
        ap = Integer.reverse(-1073741824);
        aq = 0x40000000 >>> 62 | 0x40000000 << -62;
        ar = Integer.reverse(0);
        as = Integer.reverse(Integer.MIN_VALUE);
        at = (1 >>> 96 | 1 << ~96 + 1) & 0xFFFFFFFF;
        au = Integer.reverse(0);
    }

    protected abstract void a(NLoginCore_494 var1, String var2, String[] var3);

    @Override
    protected final void b(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        if (NLoginInterface_0422 instanceof NLoginCore_277) {
            int n;
            NLoginCore_077 NLoginCore_0772;
            NLoginCore_277 NLoginCore_277 = (NLoginCore_277)NLoginInterface_0422;
            NLoginCore_187 NLoginCore_1872 = ((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_466_a)).com_nickuc_login_NLoginCore_187_a();
            NLoginCore_509 NLoginCore_5092 = NLoginCore_1872.com_nickuc_login_NLoginCore_509_b(NLoginCore_277);
            Long l = (Long)NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_k);
            if (l == null || System.currentTimeMillis() - l > var_long_a) {
                return;
            }
            String[] stringArray2 = (String[])NLoginCore_5092.a(NLoginCore_567.var_com_nickuc_login_NLoginCore_567_j);
            if (stringArray2 != null) {
                stringArray = stringArray2;
            }
            if ((NLoginCore_0772 = NLoginCore_5092.com_nickuc_login_NLoginCore_077_a()).c(NLoginCore_077.var_com_nickuc_login_NLoginCore_077_c) || (NLoginCore_0772 == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_c || NLoginCore_0772 == NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f) && !this.var_com_nickuc_login_NLoginCore_466_a.m()) {
                return;
            }
            if (!super.a(NLoginInterface_0422, string, stringArray, b != 0)) {
                NLoginCore_150.a(NLoginInterface_0422, NLoginCore_374.y, new Object[h]);
                return;
            }
            CommandType commandType = null;
            int n2 = k;
            if (this instanceof NLoginType_020) {
                commandType = CommandType.LOGIN;
                n2 = p;
            } else if (this instanceof NLoginCore_437) {
                commandType = CommandType.REGISTER;
                n2 = s;
            } else if (this instanceof NLoginType_021) {
                commandType = CommandType.CHANGE_PASSWORD;
                n2 = t;
            } else if (this instanceof NLoginType_025) {
                commandType = CommandType.UNREGISTER;
                n2 = v;
            }
            int n3 = n = NLoginCore_0772 != NLoginCore_077.var_com_nickuc_login_NLoginCore_077_f && !this.var_com_nickuc_login_NLoginCore_466_a.l() && !NLoginCore_1872.boolean_b(NLoginCore_277) ? ab : ac;
            if (commandType != null) {
                String[] stringArray3 = stringArray.length <= n2 ? new String[af] : Arrays.copyOfRange(stringArray, n2, stringArray.length);
                Object[] objectArray = new Object[ah];
                objectArray[NLoginType_032.ai] = NLoginCore_277;
                objectArray[NLoginType_032.ak] = commandType;
                objectArray[NLoginType_032.ao] = string;
                objectArray[NLoginType_032.ap] = stringArray3;
                CancellableEvent cancellableEvent = (CancellableEvent)((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_466_a)).a(EventEnum.PRE_COMMAND_EXECUTE, objectArray);
                cancellableEvent.setCancelled(n != 0);
                int n4 = n = !((NLoginType_008)((Object)this.var_com_nickuc_login_NLoginCore_466_a)).callEvent(cancellableEvent) ? aq : ar;
            }
            if (n != 0) {
                return;
            }
        }
        this.a(NLoginInterface_0422, string.toLowerCase(Locale.ENGLISH), stringArray);
    }

    @Override
    protected final List<String> a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        return this.b(NLoginInterface_0422, string, stringArray);
    }

    @Override
    protected boolean a(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray, boolean bl) {
        return (!bl || super.a(NLoginInterface_0422, string, stringArray, as != 0) ? at : au) != 0;
    }

    protected List<String> b(NLoginCore_494 NLoginInterface_0422, String string, String[] stringArray) {
        return null;
    }
}

