package com.nickuc.login.loader;

import com.google.inject.Inject;
import com.nickuc.login.loader.platform.VelocityLoader;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import java.nio.file.Path;
import org.slf4j.Logger;

@Plugin(
   id = "nlogin",
   name = "nLogin",
   version = "2.0.19",
   description = "A practical, secure and friendly authentication plugin",
   url = "https://www.nickuc.com",
   authors = {"NickUC"}
)
public class nLoginVelocityLoader extends VelocityLoader {
   @Inject
   public nLoginVelocityLoader(ProxyServer server, Logger logger, PluginContainer pluginContainer, @DataDirectory Path dataDirectory) {
      super("com.nickuc.login.proxy.velocity.nLoginVelocity", server, logger, pluginContainer, dataDirectory);
   }

   @Override
   public String getVersion() {
      return "2.0.19";
   }
}
