package com.nickuc.login.loader;

import com.nickuc.login.loader.platform.BungeeLoader;

public class nLoginBungeeLoader extends BungeeLoader {
   public nLoginBungeeLoader() {
      super("com.nickuc.login.proxy.bungee.nLoginBungee");
   }

   @Override
   public String getVersion() {
      return BuildData.getVersion();
   }
}
