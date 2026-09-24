package com.nickuc.login.loader;

import com.nickuc.login.loader.platform.BukkitLoader;

public class nLoginBukkitLoader extends BukkitLoader {
   public nLoginBukkitLoader() {
      super("com.nickuc.login.bukkit.nLoginBukkit");
   }

   @Override
   public String getVersion() {
      return BuildData.getVersion();
   }
}
