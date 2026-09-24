package com.nickuc.login;

import com.nickuc.login.loader.platform.BungeeLoader;
import net.md_5.bungee.api.plugin.Listener;

public interface χιςζΓθωφρο extends μΓμρΨπζνιφφβΩΛΓ, Listener {
   @Override
   default void a(Object var1) {
      πργηπνπτΨζξσΓΓ var2 = (πργηπνπτΨζξσΓΓ)var1;
      BungeeLoader var3 = var2.a();
      var3.getProxy().getPluginManager().registerListener(var3, this);
   }
}
