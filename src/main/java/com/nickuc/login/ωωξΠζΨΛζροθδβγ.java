package com.nickuc.login;

import java.io.File;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import lombok.Generated;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginDescription;

public class ωωξΠζΨΛζροθδβγ implements ωΔτζχιαυΔτ {
   private static int b = Integer.reverse(0);
   private final πργηπνπτΨζξσΓΓ d;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 2048 >>> 235 | 2048 << -235;
   private static int c = (0 >>> 103 | 0 << -103) & -1;
   private final ProxyServer e;
   private static int e = Integer.reverse(0);
   private final εςοεωζφπωΨ b;

   @Override
   public ΨαχΨχΣλεΠψΦ a(Object var1) {
      return ΓκυξρχλγθρςΦ.a(this.d, this.e, var1);
   }

   @Override
   public <T> T c() {
      return (T)this.e;
   }

   @Generated
   @Override
   public εςοεωζφπωΨ a() {
      return this.b;
   }

   @Override
   public Collection<ΨαχΨχΣλεΠψΦ> c() {
      return this.e.getPlayers().stream().map(this::a).collect(Collectors.toList());
   }

   @Override
   public ΨαχΨχΣλεΠψΦ a(UUID var1) {
      ProxiedPlayer var2 = this.e.getPlayer(var1);
      return var2 != null ? this.a(var2) : null;
   }

   @Override
   public ΨαχΨχΣλεΠψΦ a(String var1) {
      return ΓκυξρχλγθρςΦ.a(this.d, this.e, var1);
   }

   @Override
   public void c() {
      this.e.stop();
   }

   @Override
   public ΣθΦΓμοΛσββδ[] a() {
      Collection var1 = this.e.getPluginManager().getPlugins();
      ΣθΦΓμοΛσββδ[] var2 = new ΣθΦΓμοΛσββδ[var1.size()];
      int var3 = c;

      for (Plugin var5 : var1) {
         PluginDescription var6 = var5.getDescription();
         File var7 = var5.getFile();
         int var10001 = var3++;
         String var10004 = var6.getName();
         String var10005 = var6.getVersion();
         String[] var10006 = new String[d];
         var10006[e] = var6.getAuthor();
         var2[var10001] = new ΣθΦΓμοΛσββδ(var10004, var10005, ηζησΠΠωΓργπ.a(var10006), var7 != null ? var7.toPath() : null);
      }

      return var2;
   }

   @Generated
   public ωωξΠζΨΛζροθδβγ(πργηπνπτΨζξσΓΓ var1, ProxyServer var2, εςοεωζφπωΨ var3) {
      this.d = var1;
      this.e = var2;
      this.b = var3;
   }

   @Override
   public boolean j(String var1) {
      return (boolean)(this.e.getPluginManager().getPlugin(var1) != null ? a : b);
   }

   @Nullable
   @Override
   public ωΛσΦΔτβωυυτθθΓυ a(String var1) {
      Plugin var2 = this.e.getPluginManager().getPlugin(var1);
      if (var2 == null) {
         return null;
      } else {
         PluginDescription var3 = var2.getDescription();
         return var3 == null ? null : new ωΛσΦΔτβωυυτθθΓυ(var3.getName(), var3.getVersion(), var2);
      }
   }

   @Override
   public οηΔΦθκορ a(ιχρΨκεπυξ<?> var1) {
      return new τμχεΔηΣτμζ(this.e, var1);
   }
}
