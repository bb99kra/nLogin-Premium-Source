/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nickuc.login.lib.json.JSONObject
 */
package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginCore_337;
import com.nickuc.login.NLoginCore_140;
import com.nickuc.login.NLoginCore_350;
import java.nio.charset.StandardCharsets;

public interface NLoginInterface_047 {
    public static byte[] a(JSONObject jSONObject, boolean bl) {
        byte[] byArray = NLoginCore_140.a(NLoginCore_1262 -> NLoginCore_1262.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        return NLoginInterface_047.a(byArray, bl);
    }

    public boolean a(NLoginCore_277 var1, NLoginCore_337 var2, Object var3, byte[] var4);

    public void b(Object var1);

    default public boolean a(NLoginCore_337 NLoginCore_3372, Object object, byte[] byArray) {
        return this.a(null, NLoginCore_3372, object, byArray);
    }

    public static byte[] byte_arr_a(byte[] byArray) {
        boolean bl = byArray[0] == 1;
        byte[] byArray2 = new byte[byArray.length - 1];
        System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
        if (bl) {
            byArray2 = NLoginCore_350.c(byArray2);
        }
        return byArray2;
    }

    public static byte[] a(byte[] byArray, boolean bl) {
        byte[] byArray2;
        if (bl) {
            byte[] byArray3 = NLoginCore_350.b(byArray);
            byArray2 = new byte[1 + byArray3.length];
            byArray2[0] = 1;
            System.arraycopy(byArray3, 0, byArray2, 1, byArray3.length);
        } else {
            byArray2 = new byte[1 + byArray.length];
            byArray2[0] = 0;
            System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        }
        return byArray2;
    }

    public void c(Object var1);

    public static JSONObject com_nickuc_login_lib_json_JSONObject_a(byte[] byArray) {
        byte[] byArray2 = NLoginInterface_047.byte_arr_a(byArray);
        String string = new String(byArray2, StandardCharsets.UTF_8);
        return new JSONObject(string);
    }

    public void a(Object var1, Object var2);
}

