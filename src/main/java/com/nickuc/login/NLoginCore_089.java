package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.BukkitLoader;
import java.io.File;
import org.bukkit.Server;

public abstract class NLoginCore_089 implements LoaderBootstrap, NLoginInterface_015, NLoginInterface_011<BukkitLoader> {
   private final NLoginCore_281 a;
   private static int a = 65536 >>> 48 | 65536 << ~48 + 1;
   private final BukkitLoader a;
   private final NLoginInterface_020 a;
   final NLoginCore_572 a;

   @Override
   public boolean N() {
      return this.a.isEnabled();
   }

   public void disable() {
      this.a.aw();
   }

   @Override
   public String s() {
      return this.a.bo;
   }

   @Override
   public File c() {
      return this.a.getDataFolder();
   }

   protected void j() {
      if (this.a.am()) {
         this.a.<NLoginCore_100>a().j();
      }
   }

   public Server a() {
      return this.a.getServer();
   }

   @Override
   public String q() {
      return this.a.bn;
   }

   @Override
   public void c() {
      if (this.N()) {
         this.a.getServer().getPluginManager().disablePlugin(this.a);
      }
   }

   @Override
   public NLoginInterface_022 b(boolean var1) {
      return this.a.b(var1);
   }

   protected void T() {
      if (this.a.am()) {
         this.a.<NLoginCore_100>a().T();
      }
   }

   protected abstract NLoginInterface_034[] a();

   public void load() {
      this.a.au();
   }

   public NLoginCore_120 a() {
      return (NLoginCore_120)this.a.c();
   }

   @Override
   public NLoginInterface_026 a() {
      return this.a;
   }

   public void enable() {
      this.a.av();
   }

   public BukkitLoader a() {
      return this.a;
   }

   @Override
   public NLoginInterface_020 a() {
      return this.a;
   }

   @Override
   public Object a(int var1) {
      return var1 == a ? this.a().getPort() : null;
   }

   protected void O() {
      if (this.a.am()) {
         this.a.<NLoginCore_100>a().O();
      }
   }

   public NLoginCore_089(BukkitLoader var1, String var2, NLoginCore_422 var3) {
      this.a = var1;
      this.a = new NLoginCore_281(this);
      this.a = new NLoginCore_572(var2, var1.getVersion(), var3, this);
      this.a = new NLoginCore_170(var1.getLogger());
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   protected void i() {
      if (this.a.am()) {
         this.a.<NLoginCore_100>a().i();
      }
   }

   @Override
   public NLoginCore_572 a() {
      return this.a;
   }
}
