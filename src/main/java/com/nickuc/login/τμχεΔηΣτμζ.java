package com.nickuc.login;

import java.util.Collections;
import java.util.List;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.TabExecutor;

public final class τμχεΔηΣτμζ extends Command implements οηΔΦθκορ, TabExecutor {
   private final ιχρΨκεπυξ<?> c;
   private static int a = (0 >>> 183 | 0 << -183) & -1;
   private final ProxyServer a;

   public τμχεΔηΣτμζ(ProxyServer var1, ιχρΨκεπυξ<?> var2) {
      super(var2.aa(), null, var2.c().toArray(new String[a]));
      this.a = var1;
      this.c = var2;
   }

   @Override
   public void W() {
      this.a.getPluginManager().registerCommand((Plugin)this.c.a().b(), this);
   }

   public void execute(CommandSender var1, String[] var2) {
      this.c.a(var1, var1.getName(), var1 instanceof ProxiedPlayer, this.getName(), var2);
   }

   @Override
   public void X() {
      this.a.getPluginManager().unregisterCommand(this);
   }

   public Iterable<String> onTabComplete(CommandSender var1, String[] var2) {
      List var3 = this.c.a(var1, var1.getName(), var1 instanceof ProxiedPlayer, this.getName(), var2);
      return var3 != null ? var3 : Collections.emptyList();
   }
}
