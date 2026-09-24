package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import org.bukkit.event.Listener;

public interface NLoginInterface_027 extends NLoginInterface_013, Listener {
   @Override
   default void a(Object var1) {
      NLoginCore_089 var2 = (NLoginCore_089)var1;
      BukkitLoader var3 = var2.a();
      var3.getServer().getPluginManager().registerEvents(this, var3);
   }
}
