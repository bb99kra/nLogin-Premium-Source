/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_474;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_135;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_208;
import com.nickuc.login.NLoginCore_525;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import java.util.ArrayList;
import java.util.List;

public interface NLoginInterface_005 {
    default public double c() {
        return this.double_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public short short_a(NLoginCore_208 NLoginCore_2082) {
        return (Short)this.b(NLoginCore_2082);
    }

    default public short short_a() {
        return this.short_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public Object a(NLoginInterface_005 NLoginInterface_0052, Object object) {
        return object;
    }

    default public List<Integer> i() {
        return this.c(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public long long_a(NLoginCore_208 NLoginCore_2082) {
        return (Long)this.b(NLoginCore_2082);
    }

    default public List<?> b(NLoginCore_208 NLoginCore_2082) {
        return new ArrayList(this.java_lang_Object_a(NLoginCore_2082));
    }

    default public List<Integer> c(NLoginCore_208 NLoginCore_2082) {
        return (List)this.b(NLoginCore_2082);
    }

    default public String a(Object ... objectArray) {
        return this.a(this.com_nickuc_login_NLoginCore_208_a(), objectArray);
    }

    public NLoginCore_474 com_nickuc_login_NLoginCore_474_a();

    public NLoginCore_208 com_nickuc_login_NLoginCore_208_a();

    default public List<Integer> j() {
        return this.d(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public int int_a(NLoginCore_208 NLoginCore_2082) {
        return (Integer)this.b(NLoginCore_2082);
    }

    default public List<String> b(Object ... objectArray) {
        return this.b(this.com_nickuc_login_NLoginCore_208_a(), objectArray);
    }

    default public int r() {
        return this.int_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public List<?> h() {
        return this.b(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public List<String> a(NLoginCore_208 NLoginCore_2082, Object ... objectArray) {
        List list = (List)this.b(NLoginCore_2082);
        if (objectArray != null && objectArray.length > 0) {
            String[] stringArray = list.toArray(new String[0]);
            boolean bl = false;
            for (int i = 0; i < stringArray.length; ++i) {
                String string = stringArray[i];
                String string2 = NLoginCore_112.a(string, objectArray);
                if (!bl && !string.equals(string2)) {
                    bl = true;
                }
                stringArray[i] = string2;
            }
            if (bl) {
                return NLoginCore_135.a(stringArray);
            }
        }
        return list;
    }

    default public long g() {
        return this.long_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public boolean ar() {
        return this.boolean_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public Object f() {
        return this.java_lang_Object_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public List<?> a(NLoginCore_208 NLoginCore_2082) {
        return (List)this.b(NLoginCore_2082);
    }

    default public List<Integer> d(NLoginCore_208 NLoginCore_2082) {
        return new ArrayList<Integer>(this.c(NLoginCore_2082));
    }

    default public double double_a(NLoginCore_208 NLoginCore_2082) {
        return (Double)this.b(NLoginCore_2082);
    }

    public int int_a();

    default public <T> T g() {
        return this.b(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public List<String> b(NLoginCore_208 NLoginCore_2082, Object ... objectArray) {
        return new ArrayList<String>(this.a(NLoginCore_2082, objectArray));
    }

    public Object java_lang_Object_a();

    default public boolean boolean_a(NLoginCore_208 NLoginCore_2082) {
        return (Boolean)this.b(NLoginCore_2082);
    }

    default public List<String> a(Object ... objectArray) {
        return this.a(this.com_nickuc_login_NLoginCore_208_a(), objectArray);
    }

    default public <T> T b(NLoginCore_208 NLoginCore_2082) {
        Object object = NLoginCore_525.a(this, NLoginCore_2082);
        if (object == null && (object = this.java_lang_Object_a()) == null) {
            throw new IllegalArgumentException(NLoginCore_027.D("қҽҿһӐӈӑѾӕӁӍӗӈ҄ӈӇӕӖӘӞҋӎӒҎӝӥӝӞҔ", (byte)54, 68));
        }
        try {
            return (T)object;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(NLoginCore_324.C("ҬӆҺҼӇӁѽӒӎҀӄӃӖӘ҅", (byte)54, 67) + this + NLoginCore_201.E("Ԓէգԕը՜թծ՟ծհբբԟմպղըԥ", (byte)54, 69), throwable);
        }
    }

    default public Object java_lang_Object_a(NLoginCore_208 NLoginCore_2082) {
        return this.b(NLoginCore_2082);
    }

    default public List<?> g() {
        return this.java_lang_Object_a(this.com_nickuc_login_NLoginCore_208_a());
    }

    default public String a(NLoginCore_208 NLoginCore_2082, Object ... objectArray) {
        return NLoginCore_112.a((String)this.b(NLoginCore_2082), objectArray);
    }
}

