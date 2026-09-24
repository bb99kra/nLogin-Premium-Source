package com.nickuc.login;

import com.nickuc.login.loader.platform.BukkitLoader;
import org.bukkit.event.Listener;

public interface ΦοιυξχςΩΦψξΓΣΨ extends μΓμρΨπζνιφφβΩΛΓ, Listener {
   @Override
   default void a(Object var1) {
      μΛΔθΛτναεαΓ var2 = (μΛΔθΛτναεαΓ)var1;
      BukkitLoader var3 = var2.a();
      var3.getServer().getPluginManager().registerEvents(this, var3);
   }
}
