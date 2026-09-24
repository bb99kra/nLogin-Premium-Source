package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.BukkitLoader;
import java.io.File;
import org.bukkit.Server;

public abstract class μΛΔθΛτναεαΓ implements LoaderBootstrap, ΦΦδΓθΣηεΦποχθ, εηχβγρΦβΦΛκγΦοδ<BukkitLoader> {
   private final πΔκνΠεΓτψλκγΨ a;
   private static int a = 65536 >>> 48 | 65536 << ~48 + 1;
   private final BukkitLoader a;
   private final ΠζΣΨαΩψοηιηΓΓ a;
   final πηλΣρηΛρλΨβχλ a;

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
         this.a.<ΓδψΩκαδδμηβφυδ>a().j();
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
   public οεΦρΓψωΓξγΔι b(boolean var1) {
      return this.a.b(var1);
   }

   protected void T() {
      if (this.a.am()) {
         this.a.<ΓδψΩκαδδμηβφυδ>a().T();
      }
   }

   protected abstract ρΣνμχγΨοΔΦ[] a();

   public void load() {
      this.a.au();
   }

   public ΠλΛουξπΦΨχ a() {
      return (ΠλΛουξπΦΨχ)this.a.c();
   }

   @Override
   public ΨΩΔξδκΛψψκφδ a() {
      return this.a;
   }

   public void enable() {
      this.a.av();
   }

   public BukkitLoader a() {
      return this.a;
   }

   @Override
   public ΠζΣΨαΩψοηιηΓΓ a() {
      return this.a;
   }

   @Override
   public Object a(int var1) {
      return var1 == a ? this.a().getPort() : null;
   }

   protected void O() {
      if (this.a.am()) {
         this.a.<ΓδψΩκαδδμηβφυδ>a().O();
      }
   }

   public μΛΔθΛτναεαΓ(BukkitLoader var1, String var2, καΦζθθυυεφΦγ var3) {
      this.a = var1;
      this.a = new πΔκνΠεΓτψλκγΨ(this);
      this.a = new πηλΣρηΛρλΨβχλ(var2, var1.getVersion(), var3, this);
      this.a = new ΔασςΦψΨΩσσξκκμω(var1.getLogger());
   }

   @Override
   public String toString() {
      return this.a.toString();
   }

   protected void i() {
      if (this.a.am()) {
         this.a.<ΓδψΩκαδδμηβφυδ>a().i();
      }
   }

   @Override
   public πηλΣρηΛρλΨβχλ a() {
      return this.a;
   }
}
