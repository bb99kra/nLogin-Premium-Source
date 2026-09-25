package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NLoginCore_456 implements NLoginInterface_036 {
   private static int dm = Integer.reverse(-1744830464);
   private static int ds = (851968 >>> 239 | 851968 << -239) & -1;
   private static long de = Long.reverse(2449958197289549824L);
   private static long db = Long.reverse(8220605720396055778L);
   private static long g = Long.reverse(5770647523106505954L);
   private static int dj = 12288 >>> 105 | 12288 << -105;
   private static float bx = Float.intBitsToFloat(Integer.reverse(-1288490052));
   private static int dq = 0 >>> 14 | 0 << -14;
   private static int da = (336 >>> 68 | 336 << ~68 + 1) & -1;
   private static long v = Long.reverse(5770647523106505954L);
   private static int bj = Integer.reverse(671088640);
   private static long al = Long.reverse(5770647523106505954L);
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static int ci = Integer.reverse(-2013265920);
   private static long k = Long.reverse(5770647523106505954L);
   private static long l = Long.reverse(2449958197289549824L);
   private static long n = Long.reverse(5770647523106505954L);
   private static int av = 0 >>> 100 | 0 << -100;
   private static int co = (-2147483639 >>> 191 | -2147483639 << -191) & -1;
   private static float bw = Float.intBitsToFloat(Integer.reverse(-1288490052));
   private static int af = Integer.reverse(0);
   private static float ca = Float.intBitsToFloat((1932735311 >>> 230 | 1932735311 << ~230 + 1) & -1);
   private static int an = Integer.reverse(0);
   private static int dr = Integer.reverse(1476395008);
   private Location f;
   private static long cm = Long.reverse(8220605720396055778L);
   private final File a;
   private static int dp = 0 >>> 244 | 0 << ~244 + 1;
   private static int ce = Integer.reverse(134217728);
   private static long o = Long.reverse(2449958197289549824L);
   private static long at = Long.reverse(5770647523106505954L);
   private static long ad = Long.reverse(5770647523106505954L);
   private static int bl = (319968 >>> 69 | 319968 << ~69 + 1) & -1;
   private static int cu = Integer.reverse(0);
   private static int cr = Integer.reverse(671088640);
   private static long ck = Long.reverse(8220605720396055778L);
   private static long dd = Long.reverse(5770647523106505954L);
   private static int m = 192 >>> 38 | 192 << -38;
   private static long dl = Long.reverse(2449958197289549824L);
   private static int cc = -2147483641 >>> 63 | -2147483641 << -63;
   private static int p = Integer.reverse(0);
   private final nLoginBukkit c;
   private static long au = Long.reverse(2449958197289549824L);
   private static int cl = 301989888 >>> 56 | 301989888 << ~56 + 1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = 14336 >>> 10 | 14336 << ~10 + 1;
   private static int cn = Integer.reverse(0);
   private static long ab = Long.reverse(2449958197289549824L);
   private static int bm = 16646144 >>> 17 | 16646144 << -17;
   private static int cf = Integer.reverse(-1);
   private static long var_do = Long.reverse(2449958197289549824L);
   private static long aq = Long.reverse(5770647523106505954L);
   private static long dk = Long.reverse(5770647523106505954L);
   private static int ch = Integer.reverse(0);
   private static int bg = (131072 >>> 241 | 131072 << -241) & -1;
   private static long b = Long.reverse(5770647523106505954L);
   private static double cv = Double.longBitsToDouble(Long.reverse(2044L));
   private Location b;
   private static String[] ZKM_STR_A = new String[dr];
   private static long cg = Long.reverse(8220605720396055778L);
   private final NLoginCore_301 a;
   private static long ct = Long.reverse(2449958197289549824L);
   private static long c;
   private static int cz = 1024 >>> 138 | 1024 << ~138 + 1;
   private static long h = Long.reverse(2449958197289549824L);
   private static int ag = Integer.reverse(0);
   private static long w = Long.reverse(2449958197289549824L);
   private static float bu = Float.intBitsToFloat((-1629067674 >>> 95 | -1629067674 << ~95 + 1) & -1);
   private static float bz = Float.intBitsToFloat(Integer.reverse(-1288490372));
   private static long cq = Long.reverse(2449958197289549824L);
   private static String[] ZKM_STR_B = new String[ds];
   private static int ay = Integer.reverse(Integer.MIN_VALUE);
   private static float by = Float.intBitsToFloat((860844851 >>> 54 | 860844851 << -54) & -1);
   private Location d;
   private static int cx = 1073741824 >>> 254 | 1073741824 << ~254 + 1;
   private static int dc = 11534336 >>> 115 | 11534336 << ~115 + 1;
   private static int x = (0 >>> 130 | 0 << -130) & -1;
   private static long bq = Long.reverse(8220605720396055778L);
   private static int ba = (-1073741824 >>> 220 | -1073741824 << ~220 + 1) & -1;
   private static int ac = 1792 >>> 72 | 1792 << ~72 + 1;
   private static long ar = Long.reverse(2449958197289549824L);
   private static int bs = 1073741824 >>> 254 | 1073741824 << ~254 + 1;
   private static double cw = Double.longBitsToDouble(Long.reverse(2044L));
   private static long am = Long.reverse(2449958197289549824L);
   private static int r = (32 >>> 99 | 32 << ~99 + 1) & -1;
   private static int di = Integer.reverse(0);
   private static int bd = Integer.reverse(-1342177280);
   private static int y = 0 >>> 87 | 0 << -87;
   private static int dg = Integer.reverse(-1);
   private static long cp = Long.reverse(5770647523106505954L);
   private static int bp = Integer.reverse(-1);
   private static long bf = Long.reverse(2449958197289549824L);
   private static float bv = Float.intBitsToFloat(1717987826 >>> 75 | 1717987826 << ~75 + 1);
   private static int e = Integer.reverse(0);
   private static int s = Integer.reverse(-1);
   private static int cy = Integer.reverse(0);
   private static long dn = Long.reverse(5770647523106505954L);
   private static int df = 376832 >>> 14 | 376832 << -14;
   private static float cb = Float.intBitsToFloat((-1717986693 >>> 201 | -1717986693 << ~201 + 1) & -1);
   private static long bb = Long.reverse(5770647523106505954L);
   private static int az = (524288 >>> 19 | 524288 << -19) & -1;
   private static int q = 0 >>> 52 | 0 << ~52 + 1;
   private static int ax = Integer.reverse(Integer.MIN_VALUE);
   private static int i = 16 >>> 132 | 16 << ~132 + 1;
   private static long aa = Long.reverse(5770647523106505954L);
   private static int a = 0 >>> 74 | 0 << -74;
   private static int bn = Integer.reverse(Integer.MIN_VALUE);
   private static long aj = Long.reverse(2449958197289549824L);
   private Location e;
   private static long t = Long.reverse(8220605720396055778L);
   private static long cs = Long.reverse(5770647523106505954L);
   private static int ao = Integer.reverse(0);
   private static int as = -1342177280 >>> 28 | -1342177280 << ~28 + 1;
   private static long dh = Long.reverse(8220605720396055778L);
   private static int bt = (0 >>> 218 | 0 << ~218 + 1) & -1;
   private static long ai = Long.reverse(5770647523106505954L);
   private static int cj = -1 >>> 12 | -1 << -12;
   private static int bk = Integer.reverse(0);
   private static int ah = Integer.reverse(268435456);
   private static int ap = 640 >>> 102 | 640 << -102;
   private boolean c;
   private static int z = 1610612736 >>> 156 | 1610612736 << -156;
   private static int u = (335544320 >>> 186 | 335544320 << -186) & -1;
   private static long bc = Long.reverse(2449958197289549824L);
   private static int br = 2048 >>> 203 | 2048 << -203;
   private static int bh = 0 >>> 151 | 0 << ~151 + 1;
   private static int ak = (4608 >>> 201 | 4608 << ~201 + 1) & -1;
   private static long cd = Long.reverse(8220605720396055778L);
   private Location c;
   private static long be = Long.reverse(5770647523106505954L);
   private static int j = Integer.reverse(1073741824);
   private static long d = Long.reverse(2449958197289549824L);
   private static long ae = Long.reverse(2449958197289549824L);
   private static int bi = Integer.reverse(0);

   public boolean a(NLoginCore_509 var1, NLoginCore_510 var2) {
      synchronized (var1.n) {
         Player var4 = var2.a;
         if (var2.a != NLoginCore_506.c) {
            return (ax != 0);
         } else {
            int var6;
            try {
               if (!var4.isOnline()) {
                  return (ay != 0);
               }

               NLoginCore_187 var5 = this.c.a().a();
               if (!var5.b(this.c.b().a(var4))) {
                  File var16 = var2.b;
                  if (!var16.exists()) {
                     throw new IllegalStateException(a(ba, bb ^ bc));
                  }

                  if (!this.c.a().isPrimaryThread() && !NLoginCore_012.V()) {
                     throw new IllegalStateException(a(bd, be ^ bf));
                  }

                  if (NLoginCore_477.w.ar()) {
                     var2.d = (bg != 0);
                     var4.removePotionEffect(PotionEffectType.BLINDNESS);
                     var4.setGameMode(GameMode.ADVENTURE);
                     var4.setAllowFlight(NLoginCore_477.z.ar());
                     var4.setFlying((bh != 0));
                     NLoginCore_205.a(var4, (bi != 0));
                     var4.setFoodLevel(bj);
                     var4.setTotalExperience(bk);
                     if (var4.getHealth() > 0.0) {
                        double var7 = var4.getMaxHealth();
                        var4.setHealth(var7);
                     }
                  }

                  if (NLoginCore_477.z.ar()) {
                     var4.setFlySpeed(0.0F);
                     var4.setWalkSpeed(0.0F);
                  }

                  if (NLoginCore_477.y.ar()) {
                     NLoginCore_430.a(this.c, var4);
                  }

                  if (NLoginCore_477.A.ar()) {
                     var4.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, bl, bm));
                  }

                  return (bn != 0);
               }

               var6 = az;
            } finally {
               var2.a = NLoginCore_506.d;
            }

            return (var6 != 0);
         }
      }
   }

   @Generated
   public Location e() {
      return this.f;
   }

   @Generated
   public Location c() {
      return this.d;
   }

   private void a(Player var1, Location var2) {
      if (NLoginCore_012.V()) {
         var1.teleportAsync(var2, TeleportCause.PLUGIN);
      } else {
         var1.teleport(var2, TeleportCause.PLUGIN);
      }
   }

   private void b(NLoginCore_510 var1) {
      Player var2 = var1.a;
      if (var1.e && this.c != null) {
         try {
            this.a(var2, this.c);
         } catch (Exception var5) {
            NLoginCore_370.c(a(cc, cd) + var2.getName() + a(ce & cf, cg), var5);
         }
      } else if (!this.c && this.b != null) {
         try {
            this.a(var2, this.b);
         } catch (Exception var6) {
            NLoginCore_370.c(a(ci & cj, ck) + var2.getName() + a(cl, cm), var6);
         }
      } else {
         if (this.d != null) {
            Location var3 = var1.g != null ? var1.g : (this.c ? var1.h : null);
            if (var3 != null) {
               try {
                  this.a(var2, var3);
               } catch (Exception var7) {
                  NLoginCore_370.c(a(co, cp ^ cq) + var2.getName() + a(cr, cs ^ ct), var7);
               }
            }
         }
      }
   }

   public NLoginCore_456(nLoginBukkit var1) {
      this.c = var1;
      this.a = new NLoginCore_301(this);
      this.a = new File(var1.c(), a(a, b ^ d));
      var1.b((e != 0)).a(new SynchronizeWithServerThreadTask(() -> this.a(var1.a(), (dq != 0))));
      File var2 = new File(var1.c(), a(f, g ^ h));
      if (!this.a.exists() && var2.exists() && var2.isDirectory()) {
         var2.renameTo(this.a);
      }
   }

   @Generated
   public Location b() {
      return this.c;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_456.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_173.F("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ\u0530ՕշնծմծՃ", (byte)55, 70), NLoginCore_456.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_092.B("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҸҵҺҵҨӂӍӄҼӅҜӑӆҞņ", (byte)55, 66) + var1 + NLoginCore_324.E("ԭ", (byte)55, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   public boolean g() {
      return this.c;
   }

   private static void b() {
      c = 5125663004988188682L;
      long var0 = c ^ 6059056529140959947L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               69,
               (byte)(65 + 18),
               (byte)(41 + 6),
               (byte)(35 + 32),
               66,
               (byte)(44 + 23),
               (byte)(27 + 20),
               (byte)(67 + 13),
               (byte)(31 + 44),
               (byte)(33 + 34),
               (byte)(12 + 71),
               (byte)(51 + 2),
               (byte)(14 + 66),
               (byte)(41 + 56),
               (byte)(43 + 57),
               (byte)(38 + 62),
               (byte)(43 + 62),
               (byte)(96 + 14),
               (byte)(18 + 85)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
      byte[] var4 = new byte[8];
      var4[0] = (byte)(var0 >>> 56);

      for (int var5 = 1; var5 < 8; var5++) {
         var4[var5] = (byte)(var0 << var5 * 8 >>> 56);
      }

      var2.init(2, var3.generateSecret(new DESKeySpec(var4)), new IvParameterSpec(new byte[8]));
      byte var7 = 1;

      for (int var6 = 0; var6 < var7; var6++) {
         switch (var6) {
            case 0:
               ZKM_STR_B[0] = NLoginCore_232.C("҅ѯґҒѩѥґѕҗєѫѠ", (byte)33, 67);
               ZKM_STR_B[1] = NLoginCore_324.E("ԦՊԘԔՐՋՅԩԨՐՒԥ", (byte)33, 69);
               ZKM_STR_B[2] = NLoginCore_241.F("ԍԴԹՁ\u0558ՙ՚ԨՊԽ՜՚ԯՔԡՃԡԞՔԢԴ\u0558ԩԵԷ՜ՇձթԪբՇծլնԴպիԳԽ՜լՉբԺմչջՒգմՁջչՐՑ", (byte)33, 70);
               ZKM_STR_B[3] = NLoginCore_027.B("ďĕĮħĞĖĲúıĚĸďĴěĲĵĸĽþĥħľĭĞĿŎĦĴĳōĠĴ", (byte)33, 66);
               ZKM_STR_B[4] = NLoginCore_173.E("ԍԴԹՁ\u0558ՙ՚ԨՊԽ՜՚ԯՔԡՃԡԞՔԢԴ\u0558ԩԵԷ՜ՇձթԪբՇծլնԴպիԳԽ՜լՉբԺմչջՒգմՁջչՐՑ", (byte)33, 69);
               ZKM_STR_B[5] = NLoginCore_092.D("ҀъѣёҊэҗюяѲѯѠ", (byte)33, 68);
               ZKM_STR_B[6] = NLoginCore_110.C("шѯѴѼғҔҕѣ҅ѸҖѭѯҝҠҀҍ҃ѻџҢҘѿ҈ѵѺҩѤ҈ҦҢҘ҄Ңѽҩ҄ѬҳҕҔҮѴҥ҈ҵҗҟґѸӃ҄ѾҞҋҌ", (byte)33, 67);
               ZKM_STR_B[7] = NLoginCore_091.A("ćùĻĳĨļùĎýěĢ÷ĘĝĤħĉýĬŌĶŌĿŏČĜőĽĦĔĬĐĥļőľĞĸĘļĽĚĴĩ", (byte)33, 65);
               ZKM_STR_B[8] = NLoginCore_384.D("шѯѴѼғҔҕѣ҅ѸҖѭѯҝҠҀҍ҃ѻџҢҘѿ҈ѵѺҩѤ҈ҦҢҘ҄Ңѽҩ҄ѬҳҕҔҮѴҥ҈ҵҗҟґѸӃ҄ѾҞҋҌ", (byte)33, 68);
               ZKM_STR_B[9] = NLoginCore_575.A("ĩóČúĳöŀ÷øěĘĉ", (byte)33, 65);
               ZKM_STR_B[10] = NLoginCore_324.A("ĮħóĬěļŀđĐęĞŃĝġŅŇňĺĩěĨŋľŅīĉħŐİĿĵŘŘŅĦŘņĨœĹŒŌğĩ", (byte)33, 65);
               ZKM_STR_B[11] = NLoginCore_223.F("Կԑ\u0558ՅԶՈՎԜԦԼՑՏԝՔԤԼՎբ՝ԾՉԺ՟ՅգհԬ՚՜Քկճ", (byte)33, 70);
               ZKM_STR_B[12] = NLoginCore_141.E("ԾԒԖԙԘԺՅԪՕԿ՞ԻՕՋԬԾբեեԵԹՇԼզԷդՎՂՋկլդՎՅոՊՉՌճ\u0558ՊՠՐՅ", (byte)33, 69);
               ZKM_STR_B[13] = NLoginCore_127.F("ԈԥԴԹՎԻ՜ՐԾՌ՟՚ՙՒԬԵԜդԴՓՋթԤԤէԾԨԬՀԲթՌմՄզՂնԵԵծՆՌխոմպկհՎցՈանֈո\u058bզ֏ՠ՟ք։ռմ", (byte)33, 70);
               ZKM_STR_B[14] = NLoginCore_471.E("ԐՑՅԯԐԻԧԥԧՐԝԩԸՃՍ\u0530ԝԞՈԟԽԶՋԺԸզՋՈՀԫԮճՅՂՌՆՆԵջթնղՑձլՕփփէև՞ք՚Ղ՜\u0558Չկ֏ՇլձՓօ", (byte)33, 69);
               ZKM_STR_B[15] = NLoginCore_324.A("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃŚĪĪįĜĳőĞĬŤŀĩ", (byte)33, 65);
               ZKM_STR_B[16] = NLoginCore_127.E("ԒԯՙԗՅԮԱԪԼՎՠԻԴԠԠԽՂՓՔԤԶ՛բԦ՞՚ՌէՀխՔ՟", (byte)33, 69);
               ZKM_STR_B[17] = NLoginCore_241.E("ԟՍԠԋԸԕԭԕՖԗԬԷԜՒՠԟ\u0557ԤԽԣԩՔժԺ՚ՎէՋԺճՅ՟նՆՆՋԸՏխԺՈր՜Յ", (byte)33, 69);
               ZKM_STR_B[18] = NLoginCore_427.F("ՒՍԊԔՈԯԙԛԲԕԻա՚ԳեԳՆՔեՅԳՃ\u0530Ա", (byte)33, 70);
               ZKM_STR_B[19] = NLoginCore_530.D("њ҈ћцѳѐѨѐґђѧѲїҍқњҒџѸўѤҏҥѵҕ҉Ң҆ѵҮҀҚұҁҁ҆ѳҊҨѵ҃һҗҀ", (byte)33, 68);
               ZKM_STR_B[20] = NLoginCore_451.B("ģĶûĆĻċļŀÿŁķĳĿĴłĨēĖŉĆŎĭċōċĞļĢČĤďĖ", (byte)33, 66);
               ZKM_STR_B[21] = NLoginCore_575.E("ԑԨԮՙՏՖԯՆՙԛՐԓԿՎԬՎԠԣԚբՃԵԼԻժԪթգՍթՂՓՌՌՒպՖՈ՜վսնԷՅ", (byte)33, 69);
               ZKM_STR_B[22] = NLoginCore_127.A("ĸăĹĞõĝĞĽāĝĠĿńùħŊĶąġŌĮĽĔĕ", (byte)33, 65);
               ZKM_STR_B[23] = NLoginCore_173.D("ѥѣѬѠѧҏѿєѵј҃҇ѺѱҒ҉јѰҔњҀҜўҜћҁҙѩҖ҉Ү҆қҦҩҮҝ҈ѯҗҚѵңүұҿҫҍғҖҾҺҹҎҋҌ", (byte)33, 68);
               ZKM_STR_B[24] = NLoginCore_183.C("ҏњҐѵьѴѵҔјѴѷҖқѐѾҡҍќѸң҅ҔѫѬ", (byte)33, 67);
               ZKM_STR_B[25] = NLoginCore_559.E("ԪԨԱԥԬՔՄԙԺԝՁՉՙԬ՛բդՀԡՀՁԫ՜ՎՃ՞ԫՄՒհԽթ", (byte)33, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_451.C("ёѧҎҕҍґёіҖѵіѠ", (byte)33, 67);
               ZKM_STR_B[1] = NLoginCore_387.F("ՍՏՀՒԯԘ\u0530ԧՎԲԸԥ", (byte)33, 70);
               ZKM_STR_B[2] = NLoginCore_575.D("шѯѴѼғҔҕѣ҅ѸҗҕѪҏќѾќљҏѝѯғѤѰѲҗ҂ҬҤѥҝ҂ҩҧұѯҵҦѮѸҗҧ҅җҷҺҗѸѾҷѿҤҙҢҜқҡғ҂ҌҥӏҜҞ", (byte)33, 68);
               ZKM_STR_B[3] = NLoginCore_446.E("ԫԱՊՃԺԲՎԖՍԶՔԫՐԷՎՑՔՙԚՁՃբԧԷԬԡԩՌՠՠՅՋ", (byte)33, 69);
               ZKM_STR_B[4] = NLoginCore_027.A("ñĘĝĥļĽľČĮġŀľēĸąħąĂĸĆĘļčęěŀīŕōĎņīŒŐŚĘŞŏėġŀŐĬİťğħļĵĶĩŖŅŇĴĵ", (byte)33, 65);
               ZKM_STR_B[5] = NLoginCore_092.F("ԬԕԸԸԮՙԲԘԯ՛Ֆԥ", (byte)33, 70);
               ZKM_STR_B[6] = NLoginCore_575.B("ñĘĝĥļĽľČĮġĿĖĘņŉĩĶĬĤĈŋŁĨıĞģŒčıŏŋŁĭŋĦŒĭĕŜľĽŗěŗĮŨŅŧĤĤšĿĠŇĴĵ", (byte)33, 66);
               ZKM_STR_B[7] = NLoginCore_559.C("ўѐҒҊѿғѐѥєѲѹюѯѴѻѾѠє҃ңҍңҖҦѣѳҨҔѽѫ҃ѧҍҏҥѭңҲҷҥҭҌҗҀ", (byte)33, 67);
               ZKM_STR_B[8] = NLoginCore_427.E("ԍԴԹՁ\u0558ՙ՚ԨՊԽ՛ԲԴբեՅՒՈՀԤէ՝ՄՍԺԿծԩՍիէ՝ՉէՂծՉԱո՚ՙճԷՍջիե՚\u0558բՀռզև։ի֍ռՎՑ՜ֈթ\u0590", (byte)33, 69);
               ZKM_STR_B[9] = NLoginCore_559.A("ĚċĕüēĴıĲúėĐĉ", (byte)33, 65);
               ZKM_STR_B[10] = NLoginCore_027.C("҅Ѿъ҃ѲғҗѨѧѰѵҚѴѸҜҞҟґҀѲѿҢҕҜ҂ѠѾҧ҇ҖҌүѩҬѾғ҇ҤҨҕ҉ґҵҀ", (byte)33, 67);
               ZKM_STR_B[11] = NLoginCore_521.C("ѺьғҀѱ҃҉їѡѷҌҊјҏџѷ҉ҝҘѹ҄ѳҜџҊѵѺѪѪҧҢҚ", (byte)33, 67);
               ZKM_STR_B[12] = NLoginCore_141.B("ĢöúýüĞĩĎĹģłğĹįĐĢņŉŉęĝīĠŊěňĲĦįœŐňĕŔŊĮĳŒŔĜīĠěĩ", (byte)33, 66);
               ZKM_STR_B[13] = NLoginCore_092.D("уѠѯѴ҉Ѷҗҋѹ҇ҚҕҔҍѧѰїҟѯҎ҆ҤџџҢѹѣѧѻѭҤ҇үѿҡѽұѰѰҩҁ҇ҨҳүҵҪҫ҉Ҽ҃Ҝұҵҡ҂ҘѼқҴҨӉӏҠ", (byte)33, 68);
               ZKM_STR_B[14] = NLoginCore_397.E("ԐՑՅԯԐԻԧԥԧՐԝԩԸՃՍ\u0530ԝԞՈԟԽԶՋԺԸզՋՈՀԫԮճՅՂՌՆՆԵջթնղՑձլՕփփէև՞ք՚֊ՙևՇՊի֎Տ\u0590ֆ՞֕֘յժջյ\u0590֊Ր\u058b֒ե", (byte)33, 69);
               ZKM_STR_B[15] = NLoginCore_575.B("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃōēřĜőŞėĴıĜŚĩ", (byte)33, 66);
               ZKM_STR_B[16] = NLoginCore_433.C("эѪҔђҀѩѬѥѷ҉қѶѯћћѸѽҎҏџѱҗҟҦҊҡҁ҈ҟүѸү", (byte)33, 67);
               ZKM_STR_B[17] = NLoginCore_183.A("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃęĒĕĳŌħĠŋĝěŚĩ", (byte)33, 65);
               ZKM_STR_B[18] = NLoginCore_201.D("ҍ҈хя҃ѪєіѭѐѵѕҋҒ҇ҖѰҢҗҀѱҖѰѻҀғҔҙ҉ѬҤ҆", (byte)33, 68);
               ZKM_STR_B[19] = NLoginCore_127.B("ăıĄïĜùđùĺûĐěĀĶńăĻĈġćčĸŎĞľĲŋįĞŗĩŃĕĨķĺĬĚĩęŊěŚĩ", (byte)33, 66);
               ZKM_STR_B[20] = NLoginCore_127.C("ѺҍђѝҒѢғҗіҘҎҊҖҋҙѿѪѭҠѝҥґҧқҊҗѵ҇Ѩ҈ѷҋ", (byte)33, 67);
               ZKM_STR_B[21] = NLoginCore_575.F("ԑԨԮՙՏՖԯՆՙԛՐԓԿՎԬՎԠԣԚբՃԵԼԻժԪթգՍթՂՓյհՊՓղՈի՝ոԹնՅ", (byte)33, 70);
               ZKM_STR_B[22] = NLoginCore_427.E("ՔԟՕԺԑԹԺՙԝԹԼ՚ԻԭԯԷՑ՛ՠգզՃ\u0530Ա", (byte)33, 69);
               ZKM_STR_B[23] = NLoginCore_076.B("ĎČĕĉĐĸĨýĞāĬİģĚĻĲāęĽăĩŅćŅĄĪłĒĿĲŗįńŏŒŗņıĘŀŃĞŅĭİŢũŖĨģľŦņŇĴĵ", (byte)33, 66);
               ZKM_STR_B[24] = NLoginCore_324.C("ҏњҐѵьѴѵҔјѴѸҜѷѮёѯјҙҙҡҝҔѫѬ", (byte)33, 67);
               ZKM_STR_B[25] = NLoginCore_127.B("ĎČĕĉĐĸĨýĞāĥĭĽĐĿņňĤąĤĥćňċĬĐĪŀĕńďŘ", (byte)33, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_127.F("ՖԿՎԹԦՇՄԜ՜\u0557ԪԮ\u0557ԛԽ՞ԴՖԺԧիԳ\u0530Ա", (byte)33, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_446.F("ՖԟԖՒԲԩԨ\u0530ԧՍԯբԬՕ\u0557ԝՇ՜ԢԾ՜ՙ\u0530Ա", (byte)33, 70);
         }
      }
   }

   public void a(NLoginCore_509 var1, NLoginCore_510 var2, boolean var3) {
      synchronized (var1.n) {
         try {
            Player var5 = var2.a;
            if (!var5.isOnline()) {
               return;
            }

            if (!this.c.a().isPrimaryThread() && !NLoginCore_012.V()) {
               throw new IllegalStateException(a(bo & bp, bq));
            }

            var5.updateInventory();
            if (var2.a == NLoginCore_506.d) {
               this.a(var2);
               this.b(var2);
               if (NLoginCore_477.y.ar() || var3) {
                  NLoginCore_430.b(this.c, var5);
               }

               if (NLoginCore_477.A.ar()) {
                  var5.removePotionEffect(PotionEffectType.BLINDNESS);
               }

               this.c.b((br != 0)).a(var2.b::delete);
               return;
            }

            if (var2.a != NLoginCore_506.e) {
               this.b(var2);
            }
         } finally {
            var2.a = NLoginCore_506.e;
         }
      }
   }

   @Generated
   public Location a() {
      return this.b;
   }

   private static String a(int var0, long var1) {
      var1 ^= 68L;
      var1 ^= 6059056529140959947L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(51 + 17),
                     (byte)(23 + 46),
                     (byte)(66 + 17),
                     (byte)(27 + 20),
                     (byte)(45 + 22),
                     (byte)(49 + 17),
                     (byte)(45 + 22),
                     (byte)(14 + 33),
                     (byte)(52 + 28),
                     (byte)(53 + 22),
                     (byte)(63 + 4),
                     (byte)(13 + 70),
                     (byte)(36 + 17),
                     (byte)(6 + 74),
                     97,
                     (byte)(60 + 40),
                     100,
                     (byte)(85 + 20),
                     (byte)(42 + 68),
                     (byte)(93 + 10)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.F("ածխ\u0530հլէհջժԷյչղյջԽࣉࣆ࣋ࣆࢹ࣓ࣞࣕ࣍ࣖࢭ\u08e2ࣗࢯ", (byte)66, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   @Generated
   public File a() {
      return this.a;
   }

   private void a(NLoginCore_510 var1) {
      Player var2 = var1.a;
      if (var1.d) {
         GameMode var3 = var1.a;
         var2.setGameMode(var3 != null ? var3 : GameMode.SURVIVAL);
         var2.setAllowFlight(var1.g);
         var2.setFlying(((var1.h && var2.getAllowFlight() != 0) ? bs : bt));
         NLoginCore_205.a(var2, var1.i);
         var2.setFoodLevel(var1.h);
         int var4 = var1.i;
         if (var4 > 0) {
            var2.setTotalExperience(var4);
         }

         double var5 = var1.d;
         if (var5 > 0.0) {
            double var7 = Math.max(var2.getMaxHealth(), 0.0);
            var2.setHealth(Math.min(var5, var7));
         }

         float var11 = var1.c;
         var2.setWalkSpeed(!(Math.abs(var11) > 1.0F) && !(var11 <= bu) ? var11 : bv);
         float var8 = var1.d;
         var2.setFlySpeed(!(Math.abs(var8) > 1.0F) && !(var8 <= bw) ? var8 : bx);
      } else {
         float var9 = var2.getWalkSpeed();
         var2.setWalkSpeed(!(Math.abs(var9) > 1.0F) && !(var9 <= by) ? var9 : bz);
         float var10 = var2.getFlySpeed();
         var2.setFlySpeed(!(Math.abs(var10) > 1.0F) && !(var10 <= ca) ? var10 : cb);
      }
   }

   @Nullable
   private Location a(nLoginBukkit var1, NLoginType_016 var2) {
      if (var2 == NLoginType_016.f) {
         throw new UnsupportedOperationException(a(da, db) + var2);
      } else {
         NLoginCore_482 var3 = this.c.a().a();
         String var4 = var2.aE();

         try {
            Location var5 = NLoginCore_393.a(var3.k(var4));
            if (var5 != null) {
               World var6 = var5.getWorld();
               if (var6 == null || var1.a().getWorld(var6.getName()) == null) {
                  NLoginCore_370.d(a(dc, dd ^ de) + var2 + a(df & dg, dh));
                  var3.a(var4).ag();
                  var5 = null;
               }
            }

            return var5;
         } catch (Exception var7) {
            NLoginCore_370.c(a(dj, dk ^ dl) + var2 + a(dm, dn ^ var_do), var7);
            var3.a(var4).ag();
            return null;
         }
      }
   }

   static {
      b();
   }

   @Nullable
   public Location a(Location var1, boolean var2) {
      if (var2 && this.e != null) {
         return this.e;
      } else if (this.d != null) {
         return this.d;
      } else {
         if (NLoginCore_477.B.ar()) {
            World var3 = var1.getWorld();
            if (var3 != null) {
               return var3.getHighestBlockAt(var1).getLocation().add(cv, 0.0, cw);
            }
         }

         return null;
      }
   }

   public boolean a(NLoginCore_509 var1, NLoginCore_510 var2, boolean var3) {
      synchronized (var1.n) {
         Player var5 = var2.a;
         if (var2.a != NLoginCore_506.b) {
            return (i != 0);
         } else {
            try {
               if (var2.b.exists()) {
                  try {
                     this.a.a(var2, var3);
                  } catch (IOException var20) {
                     NLoginCore_370.c(a(j, k ^ l) + var5.getName() + a(m, n ^ o), var20);
                     return (q != 0);
                  } catch (Exception var21) {
                     NLoginCore_370.c(a(r & s, t) + var5.getName() + a(u, v ^ w) + var2.b, var21);
                     return (y != 0);
                  }
               } else {
                  var2.g = var5.getAllowFlight();
                  var2.h = var5.isFlying();
                  var2.i = NLoginCore_205.a(var5);
                  var2.a = var5.getGameMode();
                  var2.h = var5.getFoodLevel();
                  var2.i = var5.getTotalExperience();
                  var2.d = var5.getHealth();
                  var2.c = var5.getWalkSpeed();
                  var2.d = var5.getFlySpeed();
                  var2.e = var3;
                  if (!var3) {
                     var2.g = !var2.f && var2.h != null ? (this.c ? var2.h : null) : var5.getLocation();
                  }
               }

               try {
                  this.a.c(var2);
               } catch (IOException var18) {
                  NLoginCore_370.c(a(z, aa ^ ab) + var2.a.getName() + a(ac, ad ^ ae), var18);
                  return (ag != 0);
               } catch (Exception var19) {
                  NLoginCore_370.c(a(ah, ai ^ aj) + var2.a.getName() + a(ak, al ^ am) + var2.b, var19);
                  return (ao != 0);
               }

               if (var3 || var2.h != null) {
                  try {
                     Location var6 = this.a(var5.getLocation(), var3);
                     if (var6 != null) {
                        if (NLoginCore_012.V()) {
                           var5.teleportAsync(var6, TeleportCause.PLUGIN);
                        } else {
                           var5.teleport(var6, TeleportCause.PLUGIN);
                        }
                     }
                  } catch (Exception var17) {
                     NLoginCore_370.c(a(ap, aq ^ ar) + var5.getName() + a(as, at ^ au), var17);
                  }
               }

               return (aw != 0);
            } finally {
               var2.a = NLoginCore_506.c;
            }
         }
      }
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      nLoginBukkit var3 = this.c;
      this.b = this.a(var3, NLoginType_016.c);
      this.c = this.a(var3, NLoginType_016.d);
      this.d = this.a(var3, NLoginType_016.a);
      this.e = this.a(var3, NLoginType_016.b);
      this.f = this.a(var3, NLoginType_016.e);
      NLoginCore_482 var4 = var1.a().a();
      String var5 = NLoginType_016.f.aE();
      if (!var4.c(var5)) {
         var4.a(var5, ((this.b == null ? cx : cy) != 0));
      }

      this.c = var4.a(var5, (cz != 0));
   }

   @Generated
   public Location d() {
      return this.e;
   }
}
