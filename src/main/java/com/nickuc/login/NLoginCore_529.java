/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.TextComponent
 *  net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
 */
package com.nickuc.login;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class NLoginCore_529 {
    private static int var_int_a;
    private static final LegacyComponentSerializer var_net_kyori_adventure_text_serializer_legacy_LegacyComponentSerializer_a;
    private static final LegacyComponentSerializer b;

    public static TextComponent b(String string, boolean bl) {
        if (!string.isEmpty()) {
            LegacyComponentSerializer legacyComponentSerializer = bl ? b : var_net_kyori_adventure_text_serializer_legacy_LegacyComponentSerializer_a;
            return legacyComponentSerializer.deserialize(string);
        }
        return Component.empty();
    }

    public static String a(Component component) {
        return var_net_kyori_adventure_text_serializer_legacy_LegacyComponentSerializer_a.serialize(component);
    }

    public static TextComponent a(String string) {
        return NLoginCore_529.b(string, var_int_a != 0);
    }

    static {
        var_int_a = Integer.reverse(0);
        var_net_kyori_adventure_text_serializer_legacy_LegacyComponentSerializer_a = LegacyComponentSerializer.builder().hexColors().build();
        b = LegacyComponentSerializer.builder().hexColors().extractUrls().build();
    }
}

