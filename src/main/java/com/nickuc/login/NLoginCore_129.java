/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.Projectile
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 *  org.bukkit.event.entity.EntityDamageEvent
 *  org.bukkit.event.entity.EntityEvent
 *  org.bukkit.event.entity.EntityInteractEvent
 *  org.bukkit.event.entity.EntityRegainHealthEvent
 *  org.bukkit.event.entity.EntityShootBowEvent
 *  org.bukkit.event.entity.EntityTargetEvent
 *  org.bukkit.event.entity.FoodLevelChangeEvent
 *  org.bukkit.event.entity.ProjectileLaunchEvent
 *  org.bukkit.projectiles.ProjectileSource
 */
package com.nickuc.login;

import com.nickuc.login.NLoginInterface_027;
import com.nickuc.login.NLoginCore_209;
import lombok.Generated;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

public class NLoginCore_129
implements NLoginInterface_027 {
    private static int f;
    private static int h;
    private static int g;
    private static int c;
    private static int var_int_b;
    private static int d;
    private static int a;
    private final NLoginCore_209 var_com_nickuc_login_NLoginCore_209_b;
    private static int e;

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a(entityDamageByEntityEvent.getDamager())) {
            entityDamageByEntityEvent.setCancelled(c != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityRegainHealthEvent entityRegainHealthEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a((EntityEvent)entityRegainHealthEvent)) {
            entityRegainHealthEvent.setAmount(0.0);
            entityRegainHealthEvent.setCancelled(e != 0);
        }
    }

    static {
        a = Integer.reverse(0);
        var_int_b = 1 >>> 192 | 1 << -192;
        c = Integer.reverse(Integer.MIN_VALUE);
        d = (1024 >>> 138 | 1024 << ~138 + 1) & 0xFFFFFFFF;
        e = Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191;
        f = (16 >>> 164 | 16 << ~164 + 1) & 0xFFFFFFFF;
        g = Integer.reverse(Integer.MIN_VALUE);
        h = (262144 >>> 146 | 262144 << ~146 + 1) & 0xFFFFFFFF;
    }

    @Generated
    public NLoginCore_129(NLoginCore_209 NLoginCore_2092) {
        this.var_com_nickuc_login_NLoginCore_209_b = NLoginCore_2092;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityInteractEvent entityInteractEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a((EntityEvent)entityInteractEvent)) {
            entityInteractEvent.setCancelled(f != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(FoodLevelChangeEvent foodLevelChangeEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a((EntityEvent)foodLevelChangeEvent)) {
            foodLevelChangeEvent.setCancelled(d != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityTargetEvent entityTargetEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a(entityTargetEvent.getTarget())) {
            entityTargetEvent.setTarget(null);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(EntityDamageEvent entityDamageEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a((EntityEvent)entityDamageEvent)) {
            entityDamageEvent.getEntity().setFireTicks(a);
            entityDamageEvent.setDamage(0.0);
            entityDamageEvent.setCancelled(var_int_b != 0);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void a(ProjectileLaunchEvent projectileLaunchEvent) {
        Projectile projectile = projectileLaunchEvent.getEntity();
        if (projectile.getType() == EntityType.ENDER_PEARL) {
            return;
        }
        ProjectileSource projectileSource = projectile.getShooter();
        if (projectileSource instanceof Player && this.var_com_nickuc_login_NLoginCore_209_b.b((Player)projectileSource)) {
            projectileLaunchEvent.setCancelled(g != 0);
        }
    }

    @EventHandler(ignoreCancelled=true, priority=EventPriority.NORMAL)
    public void a(EntityShootBowEvent entityShootBowEvent) {
        if (this.var_com_nickuc_login_NLoginCore_209_b.a((EntityEvent)entityShootBowEvent)) {
            entityShootBowEvent.setCancelled(h != 0);
        }
    }
}

