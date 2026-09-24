package com.nickuc.login;

import java.nio.file.Path;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class ΠρβυουξΣφετχε implements ωΔτζχιαυΔτ {
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   private final μΛΔθΛτναεαΓ d;
   private final Server f;
   private static int c = 0 >>> 196 | 0 << ~196 + 1;
   private final εςοεωζφπωΨ a;

   @Override
   public ΨαχΨχΣλεΠψΦ a(Object var1) {
      return ΨεηηνμγυΩαγ.a(this.d, this.f, var1);
   }

   @Override
   public ΨαχΨχΣλεΠψΦ a(UUID var1) {
      Player var2 = this.f.getPlayer(var1);
      return var2 != null ? this.a(var2) : null;
   }

   @Override
   public Collection<ΨαχΨχΣλεΠψΦ> c() {
      return ΓχυψπωΣςΠκγζΦ.d().stream().map(this::a).collect(Collectors.toList());
   }

   @Generated
   public ΠρβυουξΣφετχε(μΛΔθΛτναεαΓ var1, Server var2, εςοεωζφπωΨ var3) {
      this.d = var1;
      this.f = var2;
      this.a = var3;
   }

   @Override
   public void c() {
      this.f.shutdown();
   }

   @Override
   public boolean j(String var1) {
      return (boolean)(this.f.getPluginManager().getPlugin(var1) != null ? a : b);
   }

   @Override
   public ΨαχΨχΣλεΠψΦ a(String var1) {
      return ΨεηηνμγυΩαγ.a(this.d, this.f, var1);
   }

   @Generated
   @Override
   public εςοεωζφπωΨ a() {
      return this.a;
   }

   @Override
   public <T> T c() {
      return (T)this.f;
   }

   @Nullable
   @Override
   public ωΛσΦΔτβωυυτθθΓυ a(String var1) {
      Plugin var2 = this.f.getPluginManager().getPlugin(var1);
      if (var2 == null) {
         return null;
      } else {
         PluginDescriptionFile var3 = var2.getDescription();
         return new ωΛσΦΔτβωυυτθθΓυ(var2.getName(), var3 != null ? var3.getVersion() : null, var2);
      }
   }

   @Override
   public ΣθΦΓμοΛσββδ[] a() {
      Plugin[] var1 = this.f.getPluginManager().getPlugins();
      ΣθΦΓμοΛσββδ[] var2 = new ΣθΦΓμοΛσββδ[var1.length];
      int var3 = c;
      Plugin[] var4 = var1;
      int var5 = var1.length;

      for (int var6 = d; var6 < var5; var6++) {
         Plugin var7 = var4[var6];
         PluginDescriptionFile var8 = var7.getDescription();

         Path var9;
         try {
            var9 = πησοιΣζΩθΛδλζσ.a(var7.getClass()).toPath();
         } catch (Exception var11) {
            var9 = null;
         }

         var2[var3++] = new ΣθΦΓμοΛσββδ(var7.getName(), var8.getVersion(), var8.getAuthors(), var9);
      }

      return var2;
   }

   @Override
   public οηΔΦθκορ a(ιχρΨκεπυξ<?> var1) {
      return new γπευΦΛιιηθς(this.f, var1);
   }
}
