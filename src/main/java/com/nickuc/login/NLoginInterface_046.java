package com.nickuc.login;

import com.nickuc.login.loader.platform.BungeeLoader;
import net.md_5.bungee.api.plugin.Listener;

public interface NLoginInterface_046 extends NLoginInterface_013, Listener {
   @Override
   default void a(Object var1) {
      NLoginCore_383 var2 = (NLoginCore_383)var1;
      BungeeLoader var3 = var2.a();
      var3.getProxy().getPluginManager().registerListener(var3, this);
   }
}
