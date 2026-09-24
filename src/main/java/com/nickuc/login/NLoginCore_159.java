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

public class NLoginCore_159 implements NLoginInterface_040 {
   private static int b = Integer.reverse(0);
   private final NLoginCore_383 d;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 2048 >>> 235 | 2048 << -235;
   private static int c = (0 >>> 103 | 0 << -103) & -1;
   private final ProxyServer e;
   private static int e = Integer.reverse(0);
   private final NLoginInterface_006 b;

   @Override
   public NLoginCore_277 a(Object var1) {
      return NLoginCore_230.a(this.d, this.e, var1);
   }

   @Override
   public <T> T c() {
      return (T)this.e;
   }

   @Generated
   @Override
   public NLoginInterface_006 a() {
      return this.b;
   }

   @Override
   public Collection<NLoginCore_277> c() {
      return this.e.getPlayers().stream().map(this::a).collect(Collectors.toList());
   }

   @Override
   public NLoginCore_277 a(UUID var1) {
      ProxiedPlayer var2 = this.e.getPlayer(var1);
      return var2 != null ? this.a(var2) : null;
   }

   @Override
   public NLoginCore_277 a(String var1) {
      return NLoginCore_230.a(this.d, this.e, var1);
   }

   @Override
   public void c() {
      this.e.stop();
   }

   @Override
   public PluginInfoModel[] a() {
      Collection var1 = this.e.getPluginManager().getPlugins();
      PluginInfoModel[] var2 = new PluginInfoModel[var1.size()];
      int var3 = c;

      for (Plugin var5 : var1) {
         PluginDescription var6 = var5.getDescription();
         File var7 = var5.getFile();
         int var10001 = var3++;
         String var10004 = var6.getName();
         String var10005 = var6.getVersion();
         String[] var10006 = new String[d];
         var10006[e] = var6.getAuthor();
         var2[var10001] = new PluginInfoModel(var10004, var10005, NLoginCore_135.a(var10006), var7 != null ? var7.toPath() : null);
      }

      return var2;
   }

   @Generated
   public NLoginCore_159(NLoginCore_383 var1, ProxyServer var2, NLoginInterface_006 var3) {
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
   public NLoginCore_081 a(String var1) {
      Plugin var2 = this.e.getPluginManager().getPlugin(var1);
      if (var2 == null) {
         return null;
      } else {
         PluginDescription var3 = var2.getDescription();
         return var3 == null ? null : new NLoginCore_081(var3.getName(), var3.getVersion(), var2);
      }
   }

   @Override
   public NLoginInterface_021 a(NLoginCore_168<?> var1) {
      return new NLoginCore_348(this.e, var1);
   }
}
