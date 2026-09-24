package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import io.papermc.paper.event.player.AsyncChatEvent;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public class ητςςχημΔχΦ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private final nLoginBukkit e;

   @Generated
   public ητςςχημΔχΦ(nLoginBukkit var1) {
      this.e = var1;
   }

   @EventHandler(
      priority = EventPriority.HIGH
   )
   public void a(AsyncChatEvent var1) {
      ΨαχΨχΣλεΠψΦ var2 = this.e.b().a(var1.getPlayer());
      Component var3 = var1.message();
      String var4 = var3 instanceof TextComponent ? ((TextComponent)var3).content() : null;
      if (this.e.a().b().a(var2, var4)) {
         var1.setCancelled((boolean)a);
      }
   }
}
