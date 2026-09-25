/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.api.enums.ServerConnectType
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginInterface_041;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginType_033;
import com.nickuc.login.NLoginCore_592;
import com.nickuc.login.NLoginCore_443;
import com.nickuc.login.NLoginCore_509;
import com.nickuc.login.NLoginCore_354;
import com.nickuc.login.NLoginCore_589;
import com.nickuc.login.NLoginCore_567;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.ForceRegisterConfig;
import com.nickuc.login.NLoginCore_199;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public interface NLoginType_010 {
    public NLoginCore_589 com_nickuc_login_NLoginInterface_022_b();

    default public boolean b(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        return this.a(NLoginCore_5092, this.java_lang_String_a(NLoginCore_277));
    }

    public NLoginCore_199 com_nickuc_login_NLoginCore_199_a();

    @Nullable
    default public ServerConnectType a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092) {
        for (ServerConnectType serverConnectType : ServerConnectType.values()) {
            NLoginCore_443 NLoginCore_4432 = this.com_nickuc_login_NLoginCore_443_a(NLoginCore_277, NLoginCore_5092, serverConnectType);
            if (!NLoginCore_443.a(NLoginCore_4432)) continue;
            return serverConnectType;
        }
        return null;
    }

    @Nullable
    public String java_lang_String_a(NLoginCore_277 var1);

    default public boolean a(NLoginCore_509 NLoginCore_5092, String string) {
        if (string == null) {
            return false;
        }
        if (string.equals(NLoginCore_5092.d(NLoginCore_567.F))) {
            return true;
        }
        return NLoginCore_592.var_com_nickuc_login_NLoginCore_532_a.a(new Object[0]).stream().anyMatch(string2 -> string2.equalsIgnoreCase(string));
    }

    public NLoginCore_443 a(NLoginCore_277 var1, String var2, ServerConnectType var3, @Nullable NLoginInterface_041<Boolean> var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    default public NLoginCore_443 com_nickuc_login_NLoginCore_443_a(NLoginCore_277 NLoginCore_277, NLoginCore_509 NLoginCore_5092, ServerConnectType serverConnectType) {
        switch (NLoginType_033.T[serverConnectType.ordinal()]) {
            case 1: {
                ForceRegisterConfig ForceRegisterConfig2;
                String string;
                if (!NLoginCore_592.var_com_nickuc_login_NLoginCore_532_g.ar() || (string = (String)(ForceRegisterConfig2 = NLoginCore_5092.com_nickuc_login_ForceRegisterConfig_a()).com_nickuc_login_NLoginCore_407_a().a(NLoginCore_027.B("ǋǁǔǖƐǗǊǘǝǍǛ", (byte)112, 66))) == null || this.a(NLoginCore_5092, string) || !this.t(string) || NLoginCore_592.var_com_nickuc_login_NLoginCore_532_h.a(new Object[0]).contains(string)) break;
                int n = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_f.r();
                NLoginInterface_041<Boolean> NLoginInterface_041 = n <= 0 ? null : bl -> {
                    if (!bl.booleanValue()) {
                        this.com_nickuc_login_NLoginInterface_022_b().a(() -> this.com_nickuc_login_NLoginCore_443_a(NLoginCore_277, NLoginCore_5092, serverConnectType), (long)n);
                    } else {
                        this.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_001_a().a(NLoginCore_277, NLoginCore_5092, false);
                    }
                };
                return this.a(NLoginCore_277, string, ServerConnectType.WITH_LAST_SERVER, NLoginInterface_041);
            }
            case 2: {
                String string;
                if (!NLoginCore_592.var_com_nickuc_login_NLoginCore_532_d.ar() || (string = (String)NLoginCore_5092.d(NLoginCore_567.L)) == null || this.a(NLoginCore_5092, string) || !this.t(string)) break;
                int n = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_f.r();
                NLoginInterface_041<Boolean> NLoginInterface_041 = n <= 0 ? null : bl -> {
                    if (!bl.booleanValue()) {
                        this.com_nickuc_login_NLoginInterface_022_b().a(() -> this.com_nickuc_login_NLoginCore_443_a(NLoginCore_277, NLoginCore_5092, serverConnectType), (long)n);
                    } else {
                        this.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_001_a().a(NLoginCore_277, NLoginCore_5092, false);
                    }
                };
                return this.a(NLoginCore_277, string, ServerConnectType.WITH_PLATFORM_SERVER, NLoginInterface_041);
            }
            case 3: {
                int n;
                Object object;
                Set set;
                Object object2;
                Set set2;
                List<String> list;
                if (!NLoginCore_592.var_com_nickuc_login_NLoginCore_532_i.ar() || (list = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_j.a(new Object[0])).isEmpty()) break;
                String string = this.java_lang_String_a(NLoginCore_277);
                if (string != null) {
                    if (list.stream().anyMatch(string::equalsIgnoreCase)) break;
                }
                if ((set2 = (Set)NLoginCore_5092.d(NLoginCore_567.K)) != null) {
                    object2 = new ArrayList<String>(list);
                    set = set2;
                    synchronized (set) {
                        object2.removeIf(set2::contains);
                    }
                    if (object2.isEmpty()) {
                        object = list;
                        NLoginCore_5092.a(NLoginCore_567.K);
                        set2 = null;
                    } else {
                        object = object2;
                    }
                } else {
                    object = list;
                }
                object2 = object.get(NLoginCore_354.a().nextInt(object.size()));
                if (set2 != null) {
                    set = set2;
                    synchronized (set) {
                        set2.add(object2);
                    }
                }
                NLoginInterface_041<Boolean> NLoginInterface_041 = (n = NLoginCore_592.var_com_nickuc_login_NLoginCore_532_f.r()) <= 0 ? null : arg_0 -> this.a(list, NLoginCore_5092, (String)object2, NLoginCore_277, serverConnectType, n, arg_0);
                return this.a(NLoginCore_277, (String)object2, ServerConnectType.WITH_CONFIGURED_SERVER, NLoginInterface_041);
            }
            default: {
                throw new IllegalArgumentException(NLoginCore_324.B("ƴǎǔǗǓǔǔǘǛǍǍƊǞǑǟǤǔǢƑǕǢǢǣǛǚǬƙǮǴǬǢƟƟ", (byte)112, 66) + serverConnectType);
            }
        }
        return NLoginCore_443.var_com_nickuc_login_NLoginCore_443_d;
    }

    public boolean t(String var1);

    public NLoginType_008 com_nickuc_login_NLoginType_008_a();

    public boolean boolean_a(NLoginCore_277 var1);

    private /* synthetic */ void a(List list, NLoginCore_509 NLoginCore_5092, String string, NLoginCore_277 NLoginCore_277, ServerConnectType serverConnectType, int n, Boolean bl) {
        if (!bl.booleanValue()) {
            this.com_nickuc_login_NLoginInterface_022_b().a(() -> {
                if (list.size() > 1 && !NLoginCore_5092.a(NLoginCore_567.K)) {
                    HashSet<String> hashSet = new HashSet<String>();
                    hashSet.add(string);
                    NLoginCore_5092.a(NLoginCore_567.K, hashSet);
                }
                this.com_nickuc_login_NLoginCore_443_a(NLoginCore_277, NLoginCore_5092, serverConnectType);
            }, (long)n);
        } else {
            this.com_nickuc_login_NLoginType_008_a().com_nickuc_login_NLoginType_005_b().com_nickuc_login_NLoginType_001_a().a(NLoginCore_277, NLoginCore_5092, false);
        }
    }
}

