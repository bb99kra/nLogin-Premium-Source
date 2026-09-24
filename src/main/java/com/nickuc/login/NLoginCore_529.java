package com.nickuc.login;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class NLoginCore_529 {
   private static int a = Integer.reverse(0);
   private static final LegacyComponentSerializer a = LegacyComponentSerializer.builder().hexColors().build();
   private static final LegacyComponentSerializer b = LegacyComponentSerializer.builder().hexColors().extractUrls().build();

   public static TextComponent b(String var0, boolean var1) {
      if (!var0.isEmpty()) {
         LegacyComponentSerializer var2 = var1 ? b : a;
         return var2.deserialize(var0);
      } else {
         return Component.empty();
      }
   }

   public static String a(Component var0) {
      return a.serialize(var0);
   }

   public static TextComponent a(String var0) {
      return b(var0, (boolean)a);
   }
}
