package com.nickuc.login.loader.platform;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.MemClassLoader;
import org.bukkit.plugin.java.JavaPlugin;
import patcher.NLoginDependencyBootstrap;

public abstract class BukkitLoader extends JavaPlugin {
   private final LoaderBootstrap plugin;

   public BukkitLoader(String var1) {
      MemClassLoader var2 = new MemClassLoader(this.getClass().getClassLoader());
      var2 = (MemClassLoader)NLoginDependencyBootstrap.prepareLoader(this, var2);
      this.plugin = var2.createLoader(var1, BukkitLoader.class, this);
   }

   public void onLoad() {
      NLoginDependencyBootstrap.install(this);
      this.plugin.load();
   }

   public void onEnable() {
      this.plugin.enable();
   }

   public void onDisable() {
      this.plugin.disable();
   }

   public abstract String getVersion();
}
