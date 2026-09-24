package com.nickuc.login;

import lombok.Generated;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

public class ΨνλζρχβγΛ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static int f = (16 >>> 164 | 16 << ~164 + 1) & -1;
   private static int h = (262144 >>> 146 | 262144 << ~146 + 1) & -1;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int b = 1 >>> 192 | 1 << -192;
   private static int d = (1024 >>> 138 | 1024 << ~138 + 1) & -1;
   private static int a = Integer.reverse(0);
   private final αοΛσφψΦε b;
   private static int e = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191;

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityDamageByEntityEvent var1) {
      if (this.b.a(var1.getDamager())) {
         var1.setCancelled((boolean)c);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityRegainHealthEvent var1) {
      if (this.b.a(var1)) {
         var1.setAmount(0.0);
         var1.setCancelled((boolean)e);
      }
   }

   @Generated
   public ΨνλζρχβγΛ(αοΛσφψΦε var1) {
      this.b = var1;
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityInteractEvent var1) {
      if (this.b.a(var1)) {
         var1.setCancelled((boolean)f);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(FoodLevelChangeEvent var1) {
      if (this.b.a(var1)) {
         var1.setCancelled((boolean)d);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityTargetEvent var1) {
      if (this.b.a(var1.getTarget())) {
         var1.setTarget(null);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(EntityDamageEvent var1) {
      if (this.b.a(var1)) {
         var1.getEntity().setFireTicks(a);
         var1.setDamage(0.0);
         var1.setCancelled((boolean)b);
      }
   }

   @EventHandler(
      priority = EventPriority.LOWEST,
      ignoreCancelled = true
   )
   public void a(ProjectileLaunchEvent var1) {
      Projectile var2 = var1.getEntity();
      if (var2.getType() != EntityType.ENDER_PEARL) {
         ProjectileSource var3 = var2.getShooter();
         if (var3 instanceof Player && this.b.b((Player)var3)) {
            var1.setCancelled((boolean)g);
         }
      }
   }

   @EventHandler(
      ignoreCancelled = true,
      priority = EventPriority.NORMAL
   )
   public void a(EntityShootBowEvent var1) {
      if (this.b.a(var1)) {
         var1.setCancelled((boolean)h);
      }
   }
}
