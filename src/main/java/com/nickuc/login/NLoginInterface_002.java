/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface NLoginInterface_002<K> {
    @Nullable
    default public List<?> b(K k) {
        return (List)this.d(k);
    }

    default public long a(K k, long l) {
        Object object = this.b(k, l);
        if (object instanceof Long) {
            return (Long)object;
        }
        return Long.parseLong(object.toString());
    }

    default public int int_a(K k) {
        Object object = this.e(k);
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (object != null) {
            return Integer.parseInt(object.toString());
        }
        return 0;
    }

    default public long long_b(K k) {
        Object object = this.e(k);
        if (object instanceof Long) {
            return (Long)object;
        }
        if (object != null) {
            return Long.parseLong(object.toString());
        }
        return 0L;
    }

    @Nullable
    default public <T> T d(K k) {
        Object object = this.e(k);
        try {
            return (T)object;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(NLoginCore_201.B("ĒļĲŅņôĸķŊŌùĿœĿłŎœŉŐŐďĄŐŋŠĈ", (byte)40, 66) + k + (object != null ? NLoginCore_223.F("Ԑԅ՜ՈՔ՞ՏԋՏՙՏբգԑ", (byte)40, 70) + object.getClass().getCanonicalName() : ""), throwable);
        }
    }

    @Nonnull
    default public List<Integer> c(K k, List<Integer> list) {
        return this.a(k, (Object)list);
    }

    @Nullable
    public Object java_lang_Object_a(K var1);

    @Nonnull
    default public <T> T a(K k, T t) {
        Object object = this.b(k, t);
        try {
            return (T)object;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(NLoginCore_324.E("ԙՃԹՌՍӻԿԾՑՓԀՆ՚ՆՉՕ՚Ր՗՗Ԗԋ՗Ւէԏ", (byte)26, 69) + k + (object != null ? NLoginCore_027.C("ЯФѻѧѳѽѮЪѮѸѮҁ҂а", (byte)26, 67) + object.getClass().getCanonicalName() : ""), throwable);
        }
    }

    @Nullable
    default public List<String> a(K k) {
        return (List)this.d(k);
    }

    default public int a(K k, int n) {
        Object object = this.b(k, n);
        if (object instanceof Integer) {
            return (Integer)object;
        }
        return Integer.parseInt(object.toString());
    }

    default public boolean a(K k, boolean bl) {
        Object object = this.b(k, bl);
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return Boolean.parseBoolean(object.toString());
    }

    @Nonnull
    default public Object b(K k, Object object) {
        if (object == null) {
            throw new IllegalArgumentException(NLoginCore_453.A("ķřśŗŬŤŭĚűŝũųŤĠŤţűŲŴźħŪŮĪŹƁŹźİ", (byte)58, 65));
        }
        Object object2 = this.e(k);
        return object2 != null ? object2 : object;
    }

    @Nonnull
    default public List<?> b(K k, List<?> list) {
        return this.a(k, (Object)list);
    }

    @Nullable
    default public Object e(K k) {
        if (k == null) {
            throw new IllegalArgumentException(NLoginCore_387.E("ԭՈ՝ԅՉՈՖ՗ՙ՟ԌՏՓԏ՞զ՞՟ԕ", (byte)38, 69));
        }
        return this.c(k) ? this.java_lang_Object_a(k) : null;
    }

    default public short a(K k, short s) {
        Object object = this.b(k, s);
        if (object instanceof Short) {
            return (Short)object;
        }
        return Short.parseShort(object.toString());
    }

    default public boolean d(K k) {
        Object object = this.e(k);
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return object != null && Boolean.parseBoolean(object.toString());
    }

    default public String java_lang_String_b(K k) {
        Object object = this.e(k);
        return object != null ? object.toString() : null;
    }

    @Nonnull
    default public <T> T c(K k) {
        Object object = this.e(k);
        if (object == null) {
            throw new IllegalStateException(NLoginCore_451.D("ҙҴӉѱ", (byte)51, 68) + k + NLoginCore_027.E("ԏ՞ՠզԓ՚դիե՜Ԛ", (byte)51, 69));
        }
        try {
            return (T)object;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(NLoginCore_138.E("Բ՜ՒեզԔ՘՗ժլԙ՟ճ՟բծճթհհԯԤհիրԨ", (byte)51, 69) + k + (object != null ? NLoginCore_027.A("đĆŝŉŕşŐČŐŚŐţŤĒ", (byte)51, 65) + object.getClass().getCanonicalName() : ""), throwable);
        }
    }

    @Nullable
    default public List<Integer> c(K k) {
        return (List)this.d(k);
    }

    public boolean c(K var1);

    default public double double_a(K k) {
        Object object = this.e(k);
        if (object instanceof Double) {
            return (Double)object;
        }
        if (object != null) {
            return Double.parseDouble(object.toString());
        }
        return 0.0;
    }

    @Nonnull
    default public List<String> a(K k, List<String> list) {
        return this.a(k, (Object)list);
    }

    default public double a(K k, double d) {
        Object object = this.b(k, d);
        if (object instanceof Double) {
            return (Double)object;
        }
        return Double.parseDouble(object.toString());
    }

    default public short short_a(K k) {
        Object object = this.e(k);
        if (object instanceof Short) {
            return (Short)object;
        }
        if (object != null) {
            return Short.parseShort(object.toString());
        }
        return 0;
    }

    @Nonnull
    default public String a(K k, String string) {
        Object object = this.b(k, string);
        return object.toString();
    }
}

