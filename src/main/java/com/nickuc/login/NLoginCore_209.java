package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class NLoginCore_209 extends NLoginCore_056 {
   private static int bo = (0 >>> 25 | 0 << -25) & -1;
   private static int ei = (-1 >>> 143 | -1 << ~143 + 1) & -1;
   private static long fl = Long.reverse(1411318372589986873L);
   private static long ea = Long.reverse(-5650325843126950855L);
   private static int dz = Integer.reverse(-939524096);
   private static long p = Long.reverse(-5650325843126950855L);
   private static long dx = Long.reverse(-6773413839565225984L);
   private static long gf = Long.reverse(-6773413839565225984L);
   private static int z = (134217728 >>> 154 | 134217728 << -154) & -1;
   private static long ge = Long.reverse(-5650325843126950855L);
   private static int eq = 1441792 >>> 144 | 1441792 << ~144 + 1;
   private static long f;
   private static long io = Long.reverse(-6773413839565225984L);
   private static int ag = (50331648 >>> 88 | 50331648 << -88) & -1;
   private static int ci = Integer.reverse(0);
   private static long ht = Long.reverse(-5650325843126950855L);
   private static int hw = Integer.reverse(-1);
   private static int hn = Integer.reverse(-134217728);
   private static int bu = Integer.reverse(-1879048192);
   private static int fo = Integer.reverse(-1744830464);
   private static long ey = Long.reverse(1411318372589986873L);
   private static long hi = Long.reverse(-5650325843126950855L);
   private static long aq = Long.reverse(1411318372589986873L);
   private static long gi = Long.reverse(1411318372589986873L);
   private static long hp = Long.reverse(1411318372589986873L);
   private static int hr = Integer.reverse(67108864);
   private static long ic = Long.reverse(-6773413839565225984L);
   private static int dg = Integer.reverse(134217728);
   private static long cg = Long.reverse(1411318372589986873L);
   private static long ad = Long.reverse(-6773413839565225984L);
   private static int cz = Integer.reverse(-268435456);
   private static long hj = Long.reverse(-6773413839565225984L);
   private static int ip = (151552 >>> 204 | 151552 << ~204 + 1) & -1;
   private static long dd = Long.reverse(1411318372589986873L);
   private static long du = Long.reverse(-5650325843126950855L);
   private static long ej = Long.reverse(1411318372589986873L);
   private static int aw = Integer.reverse(-1610612736);
   private static int cp = 448 >>> 229 | 448 << -229;
   private static int bc = (-1 >>> 245 | -1 << ~245 + 1) & -1;
   private static int ie = (0 >>> 189 | 0 << -189) & -1;
   private static int ew = (736 >>> 165 | 736 << ~165 + 1) & -1;
   private static int cm = Integer.reverse(-1342177280);
   private static int ij = 402653185 >>> 123 | 402653185 << -123;
   private static long ax = Long.reverse(1411318372589986873L);
   private static long hu = Long.reverse(-6773413839565225984L);
   private static int k = (1024 >>> 234 | 1024 << -234) & -1;
   private static int ep = (128 >>> 133 | 128 << ~133 + 1) & -1;
   private static long is = Long.reverse(-6773413839565225984L);
   private static long bl = Long.reverse(1411318372589986873L);
   private static int e = 0 >>> 16 | 0 << ~16 + 1;
   private static int be = 234881024 >>> 153 | 234881024 << ~153 + 1;
   private static int jd = 637534208 >>> 88 | 637534208 << ~88 + 1;
   private static int el = Integer.reverse(-1073741824);
   private static int cd = (100663296 >>> 23 | 100663296 << ~23 + 1) & -1;
   private static int bx = Integer.reverse(1342177280);
   private static int gw = 0 >>> 208 | 0 << ~208 + 1;
   private static long co = Long.reverse(1411318372589986873L);
   private static int fn = Integer.reverse(0);
   private static int ba = (6144 >>> 234 | 6144 << ~234 + 1) & -1;
   private static int ee = Integer.reverse(1073741824);
   private static long eb = Long.reverse(-6773413839565225984L);
   private static int gs = 0 >>> 131 | 0 << -131;
   private static int dk = ('蠀' >>> 11 | 34816 << ~11 + 1) & -1;
   private static int dn = Integer.reverse(0);
   private static long bv = Long.reverse(1411318372589986873L);
   private static int hg = (475136 >>> 110 | 475136 << -110) & -1;
   private static long bz = Long.reverse(-6773413839565225984L);
   private static long ir = Long.reverse(-5650325843126950855L);
   private static long dh = Long.reverse(-5650325843126950855L);
   private static int gz = 2048 >>> 43 | 2048 << ~43 + 1;
   private static int it = Integer.reverse(Integer.MIN_VALUE);
   private static long ib = Long.reverse(-5650325843126950855L);
   private static int dy = Integer.reverse(Integer.MIN_VALUE);
   private static int jc = 1610612738 >>> 60 | 1610612738 << -60;
   private static int ds = (0 >>> 215 | 0 << -215) & -1;
   private static long hl = Long.reverse(1411318372589986873L);
   private static long q = Long.reverse(-6773413839565225984L);
   private static int cj = Integer.reverse(Integer.MIN_VALUE);
   private static int ex = Integer.reverse(-1);
   private static int im = Integer.reverse(603979776);
   private static long ev = Long.reverse(1411318372589986873L);
   private static int cf = (-1 >>> 59 | -1 << -59) & -1;
   private static int fj = (-1 >>> 177 | -1 << ~177 + 1) & -1;
   private static int iz = (0 >>> 243 | 0 << ~243 + 1) & -1;
   private static int eh = (640 >>> 133 | 640 << -133) & -1;
   private static int gg = 1769472 >>> 240 | 1769472 << -240;
   private static long ai = Long.reverse(-6773413839565225984L);
   private static int hd = Integer.reverse(0);
   private static long ik = Long.reverse(1411318372589986873L);
   private static long ah = Long.reverse(-5650325843126950855L);
   private static long bf = Long.reverse(-5650325843126950855L);
   private static int et = Integer.reverse(-1);
   private static long by = Long.reverse(-5650325843126950855L);
   private static long bi = Long.reverse(-6773413839565225984L);
   private static long en = Long.reverse(1411318372589986873L);
   private static int ct = 0 >>> 204 | 0 << ~204 + 1;
   private static long gq = Long.reverse(1411318372589986873L);
   private static int at = Integer.reverse(536870912);
   private static int gk = Integer.reverse(0);
   private static int em = Integer.reverse(-1476395008);
   private static int dc = Integer.reverse(-1);
   private static String[] ZKM_STR_B = new String[jd];
   private static int bj = Integer.reverse(268435456);
   private static int gl = (117440512 >>> 54 | 117440512 << -54) & -1;
   private static long dl = Long.reverse(1411318372589986873L);
   private static int hk = Integer.reverse(2013265920);
   private static long fq = Long.reverse(-6773413839565225984L);
   private final nLoginBukkit d;
   private static int dt = Integer.reverse(1207959552);
   private static int fu = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[jc];
   private static int hz = Integer.reverse(1140850688);
   private static int g = Integer.reverse(0);
   private static long i = Long.reverse(-5650325843126950855L);
   private static long j = Long.reverse(-6773413839565225984L);
   private static int gt = (4096 >>> 140 | 4096 << -140) & -1;
   private static int gh = (-1 >>> 196 | -1 << -196) & -1;
   private static long hx = Long.reverse(1411318372589986873L);
   private static long cc = Long.reverse(1411318372589986873L);
   private static int am = 262144 >>> 112 | 262144 << ~112 + 1;
   private static int iw = Integer.reverse(Integer.MIN_VALUE);
   private static int n = (8388608 >>> 55 | 8388608 << ~55 + 1) & -1;
   private static int gc = Integer.reverse(1476395008);
   private static int fr = 0 >>> 229 | 0 << ~229 + 1;
   private static int fz = Integer.reverse(0);
   private static int ho = Integer.reverse(-1);
   private static int aa = 64 >>> 69 | 64 << -69;
   private static int cn = Integer.reverse(-1);
   private final boolean l;
   private static int hv = 536870916 >>> 125 | 536870916 << ~125 + 1;
   private static int b = (20 >>> 2 | 20 << -2) & -1;
   private static int fg = Integer.reverse(402653184);
   private static long ab = Long.reverse(-5650325843126950855L);
   private static int al = Integer.reverse(-1073741824);
   private static long bd = Long.reverse(1411318372589986873L);
   private static int go = -1 >>> 140 | -1 << -140;
   private static long di = Long.reverse(-6773413839565225984L);
   private static long cr = Long.reverse(1411318372589986873L);
   private static int ca = Integer.reverse(-805306368);
   private static int ap = (-1 >>> 21 | -1 << -21) & -1;
   private static long fp = Long.reverse(-5650325843126950855L);
   private static long in = Long.reverse(-5650325843126950855L);
   private static int dq = (163840 >>> 47 | 163840 << -47) & -1;
   private static int fv = 1048576 >>> 244 | 1048576 << ~244 + 1;

   public boolean b(Player var1) {
      if (var1 == null) {
         return (gt != 0);
      } else if (this.c(var1)) {
         return (gw != 0);
      } else {
         return ((!this.e.a() != 0).b(this.e.b().a(var1)) ? gz : hd);
      }
   }

   public void a(PlayerJoinEvent var1) {
      Player var2 = var1.getPlayer();
      if (!this.c(var2)) {
         NLoginCore_277 var3 = this.e.b().a(var2);
         Channel var4 = this.e.b().a(var1, var2);
         if (var4 == null) {
            String[] var10001 = new String[b];
            var10001[e] = a(g, i ^ j);
            var10001[k] = a(n, p ^ q);
            var10001[z] = a(aa, ab ^ ad) + var1.getClass().getSimpleName() + a(ag, ah ^ ai);
            var10001[al] = a(am & ap, aq);
            var10001[at] = a(aw, ax);
            var3.a(NLoginCore_112.a(var10001));
         }

         if (!this.e.b().e(var4)) {
            if (NLoginCore_157.p) {
               String var5 = this.a(var3, var4, var1);
               if (var5 != null) {
                  var3.a(var5);
                  return;
               }
            }

            long var14 = System.nanoTime();

            try {
               if (!this.e.a().b(var2.getName(), var2.getUniqueId())) {
                  if (NLoginCore_477.ao.ar()) {
                     String var7 = var1.getJoinMessage();
                     if (var7 != null && var7.toLowerCase(Locale.ENGLISH).contains(a(ba & bc, bd))) {
                        var1.setJoinMessage(null);
                     }
                  }

                  NLoginCore_509 var15 = this.e.a().b(var3);
                  Runnable var8 = () -> {
                     if (var2.getHealth() <= 0.0 || var2.isDead()) {
                        var2.spigot().respawn();
                        var15.a().h();
                     }

                     if (this.l) {
                        this.d.a().f(var3);
                     } else {
                        super.d(var3, var15);
                     }
                  };
                  if (NLoginCore_012.V()) {
                     var3.a().a(var8);
                  } else {
                     var8.run();
                  }

                  return;
               }
            } catch (Throwable var12) {
               NLoginCore_370.c(a(be, bf ^ bi) + var3.getName() + a(bj, bl), var12);
               var3.a(a(bu, bv));
               return;
            } finally {
               NLoginCore_548.a(NLoginCore_425.d, var14);
            }
         }
      }
   }

   private String a(NLoginCore_277 var1, Channel var2, Object var3) {
      String var4 = var1.getName();

      try {
         com.nickuc.login.bukkit.BukkitHelper_001 var5 = (com.nickuc.login.bukkit.BukkitHelper_001)var2.attr(com.nickuc.login.bukkit.BukkitHelper_001.a).get();
         if (var5 == null) {
            String var6 = a(cz & dc, dd) + var1.getName() + a(dg, dh ^ di) + var3.getClass().getSimpleName() + a(dk, dl);
            NLoginCore_370.c(var6);
            String[] var10000 = new String[dq];
            var10000[ds] = a(dt, du ^ dx);
            var10000[dy] = a(dz, ea ^ eb);
            var10000[ee] = a(eh & ei, ej) + var6;
            var10000[el] = a(em, en);
            var10000[ep] = a(eq & et, ev);
            return NLoginCore_112.a(var10000);
         } else {
            return this.a(var1, var5);
         }
      } catch (Throwable var7) {
         NLoginCore_370.c(a(ew & ex, ey) + var4 + a(fg & fj, fl), var7);
         return a(fo, fp ^ fq);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_209.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.E("ӾԠԢԂԦՅԽՓԿԎՌՂՐՊԓԸ՚ՙՑ\u0557ՑԦ", (byte)26, 69), NLoginCore_209.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_471.B("ĖģĢåĥġĜĥİğìĪĮħĪİòѵ҄ѡҊҎґѰҀĆ", (byte)26, 66) + var1 + NLoginCore_141.D("н", (byte)26, 68) + var2.toString(), var4);
      }
   }

   public boolean a(EntityEvent var1) {
      Entity var2 = var1.getEntity();
      return this.a(var2);
   }

   public String a(NLoginCore_277 var1, com.nickuc.login.bukkit.BukkitHelper_001 var2) {
      long var3 = System.nanoTime();
      String var5 = var1.getName();

      Object var8;
      try {
         if (!this.l) {
            NLoginInterface_031 var14 = this.e.b().a();
            String var16 = super.a(
               var1,
               var2.a,
               var2.k,
               Optional.ofNullable(var1.a()).orElse((InetSocketAddress)var2.a.remoteAddress()),
               var2.d(),
               ((!var2.a && (var14 == null || !var14.a(var1.a() != 0))) ? fz : fv),
               var2
            );
            if (var16 == null && var2.a != null) {
               this.e.a().b(var1).a().b(var2.a);
            }

            return var16;
         }

         InetSocketAddress var6 = Optional.ofNullable(var1.a()).orElse((InetSocketAddress)var2.a.remoteAddress());
         NLoginCore_509 var15 = this.e.a().a(var1, null, var1.getName(), var6, (fr != 0), (fu != 0), var2);
         if (var2.a != null) {
            var15.a().b(var2.a);
         }

         var8 = null;
      } catch (Throwable var12) {
         NLoginCore_370.c(a(gc, ge ^ gf) + var5 + a(gg & gh, gi), var12);
         return a(gl & go, gq);
      } finally {
         NLoginCore_548.a(NLoginCore_425.c, var3);
      }

      return (String)var8;
   }

   public NLoginCore_209(NLoginType_008 var1, nLoginBukkit var2, boolean var3) {
      super(var1);
      this.d = var2;
      this.l = var3;
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 69L;
      var1 ^= -8699181400465746124L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(17 + 51),
                     (byte)(68 + 1),
                     83,
                     (byte)(27 + 20),
                     (byte)(59 + 8),
                     (byte)(16 + 50),
                     (byte)(30 + 37),
                     (byte)(3 + 44),
                     (byte)(16 + 64),
                     (byte)(58 + 17),
                     (byte)(52 + 15),
                     (byte)(16 + 67),
                     53,
                     (byte)(5 + 75),
                     (byte)(14 + 83),
                     (byte)(21 + 79),
                     (byte)(53 + 47),
                     (byte)(35 + 70),
                     (byte)(107 + 3),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_471.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡃࡒ\u082fࡘ\u085c\u085f࠾ࡎ", (byte)68, 68));
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

   public boolean a(PlayerEvent var1) {
      Player var2 = var1.getPlayer();
      return this.b(var2);
   }

   public boolean a(Entity var1) {
      if (var1 instanceof Player) {
         Player var2 = (Player)var1;
         return this.b(var2);
      } else {
         return (gs != 0);
      }
   }

   private static void b() {
      f = -7194873239405827699L;
      long var0 = f ^ -8699181400465746124L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               (byte)(43 + 26),
               (byte)(53 + 30),
               (byte)(25 + 22),
               (byte)(7 + 60),
               (byte)(35 + 31),
               (byte)(52 + 15),
               (byte)(11 + 36),
               (byte)(19 + 61),
               (byte)(52 + 23),
               (byte)(43 + 24),
               (byte)(35 + 48),
               (byte)(33 + 20),
               (byte)(61 + 19),
               (byte)(32 + 65),
               (byte)(82 + 18),
               100,
               (byte)(103 + 2),
               110,
               (byte)(80 + 23)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), 69, (byte)(43 + 40)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.B("ŌŒŞıŊŋĶŒŇŲŰŊŻŰĻŷŢŹŰŰŰšŎŏ", (byte)62, 66);
               ZKM_STR_B[1] = NLoginCore_433.E("ՠԾխնիմՑԲըիՍՂ", (byte)62, 69);
               ZKM_STR_B[2] = NLoginCore_110.A("ũħŪœİųĬťŚŶŏŧŷƂƀőűŮłŏńŠņƄŔƉũŬţƐŮƆŝƌşŕƒƕŬƍŗŰƔŶƍŴźơŭƒŽƜŦƧŮů", (byte)62, 65);
               ZKM_STR_B[3] = NLoginCore_521.C("ӢӕҹӥәӄҭҬӜӅӨҷ", (byte)62, 67);
               ZKM_STR_B[4] = NLoginCore_027.F("ՠԾխնիմՑԲըիՍՂ", (byte)62, 70);
               ZKM_STR_B[5] = NLoginCore_427.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֗ըև֎֒\u0590֑գկՠՠ֦խծ", (byte)62, 70);
               ZKM_STR_B[6] = NLoginCore_183.D("ҡӆҶӂҦӟӘӆӀӐӟӑҾӇӏӫӵӲӎӧӶӻӂӃ", (byte)62, 68);
               ZKM_STR_B[7] = NLoginCore_173.F("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍ՈէէՐփՔ֓բհ\u0558ըՓ\u0558՚\u058cո֢ղգռ֝֗օ֓րչ֥ֆխ֠֩ֈ֚ւִ֞յևօփ֑֒֎ָ֧ւ", (byte)62, 70);
               ZKM_STR_B[8] = NLoginCore_559.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
               ZKM_STR_B[9] = NLoginCore_397.F(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆",
                  (byte)62,
                  70
               );
               ZKM_STR_B[10] = NLoginCore_453.F("ձբԿԱԯՎլյՒլԸՖըթթՐք՛խԸփՠՍՎ", (byte)62, 70);
               ZKM_STR_B[11] = NLoginCore_092.C("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӿӀӖӈԅӺӆԈӐԑԈӗ", (byte)62, 67);
               ZKM_STR_B[12] = NLoginCore_384.C("ҧӧҸӀӡҧӘӋҰӮӚӍӈӤӷӠӫҳҰӈӰӫӂӃ", (byte)62, 67);
               ZKM_STR_B[13] = NLoginCore_138.F("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեպւղՆթՉջևվօ֎զվր֕ՕՒՋ\u058cՒպզ֏Ֆ՝֛֓\u0590օ՟֠ՠրխծ", (byte)62, 70);
               ZKM_STR_B[14] = NLoginCore_575.C("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 67);
               ZKM_STR_B[15] = NLoginCore_553.B("ŤőŤņŐŋŴŎũŝİœŐűłŏŢűƀųŝőżŅżŠſţśŭƍƌƐŲƓŶƏƃŷŪƈŴŗƓƚŭƁţűƠŻřşƓųƊžƂƦƜƅƪſƢ", (byte)62, 66);
               ZKM_STR_B[16] = NLoginCore_453.B("ŦŎĭĴŏűőŏņũŚŃ", (byte)62, 66);
               ZKM_STR_B[17] = NLoginCore_451.F("Ւ՜ԽէՎըԫԲՈճզոՎնՌԾԻքտՖքՈթֆաօ֎խչե՝աժսծղՔե\u0590ՕՖ֏թ֞՝֗֕ոք֔դոյ֦խծ", (byte)62, 70);
               ZKM_STR_B[18] = NLoginCore_091.F("ՋՑ՝\u0530ՉՊԵՑՆձկՉպկԺնաոկկկՠՍՎ", (byte)62, 70);
               ZKM_STR_B[19] = NLoginCore_427.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
               ZKM_STR_B[20] = NLoginCore_004.C("ҽӗҦҺҼӝӜӀӫӈӒҷ", (byte)62, 67);
               ZKM_STR_B[21] = NLoginCore_451.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
               ZKM_STR_B[22] = NLoginCore_092.B("ļĽũŗĲōţŷűĳĽŜŎŰųŚŃĽŹŞőƊũŤŽŮŇƃƆţšŌƃŞŞűƀŮƓŲŹŏƘũƈƏƓƑƒŤŰššƧŮů", (byte)62, 66);
               ZKM_STR_B[23] = NLoginCore_387.C("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺӜӬӭӮԄӧԉӪԊӪԛӢӣ", (byte)62, 67);
               ZKM_STR_B[24] = NLoginCore_397.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
               ZKM_STR_B[25] = NLoginCore_004.C("ӀӆӒҥҾҿҪӆһӦӥӌӡҲӕӟӬӂәӏӋӓҶҼӎӒԂӍӻӻӱӸӘԈӝԌӡӉӡԏӌӿӌӢӳӇԂӏӰԚӕԚӶԇԝәԠӠӿӸԒԘԢԀӡԛӨԠԥԨԎӧӦԃԧԄӰԍӾԫԭԣӳӷԕԺԙӽԪԷԖԝԷԯԺԻ", (byte)62, 67);
               ZKM_STR_B[26] = NLoginCore_451.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦźŗŻŷƉũŊťƎŉŨťūũƘŠƐťŰƔůƆŨŸŹźƐųƕŶƖŶƧŮů", (byte)62, 65);
               ZKM_STR_B[27] = NLoginCore_092.E("ծՌՄիԿՙ\u0558ՕպԺՕՂ", (byte)62, 69);
               ZKM_STR_B[28] = NLoginCore_027.E(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆",
                  (byte)62,
                  69
               );
               ZKM_STR_B[29] = NLoginCore_141.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӱӕӅԌӊӣԃӗӜӿӪӗ", (byte)62, 67);
               ZKM_STR_B[30] = NLoginCore_397.D("ҡӢӄӠӟӦҶӛӀӚӫӋӵҾӣӟҴөӫҵӒӅӂӃ", (byte)62, 68);
               ZKM_STR_B[31] = NLoginCore_223.E("ԲԲնլէթԫՂԺԸՍՂ", (byte)62, 69);
               ZKM_STR_B[32] = NLoginCore_451.E("մՎՎՋ\u0558\u0558էչՖ\u0558Տ\u0558ՖցՁլվհծշևնՍՎ", (byte)62, 69);
               ZKM_STR_B[33] = NLoginCore_138.D("әӉӦҤҤӘӘӊҼӋӫӛӆӊӒӟҪҸӏӶӰӻӂӃ", (byte)62, 68);
               ZKM_STR_B[34] = NLoginCore_521.F("ձՊՒԱԿգնԹՋըՖԼ՜ԹմնԹՠգ՞ԿնՍՎ", (byte)62, 70);
               ZKM_STR_B[35] = NLoginCore_110.C("ӒӁӫӊҦӮӜӂҧӲұҷ", (byte)62, 67);
               ZKM_STR_B[36] = NLoginCore_446.B("ņħŇĿŔŅĸĺŸžņŃ", (byte)62, 66);
               ZKM_STR_B[37] = NLoginCore_427.A("ŜŎŕŰŮĸŶĵŎŹİĺľŶūőſŻşłŜőŎŏ", (byte)62, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_201.B("ŌŒŞıŊŋĶŒŇŲűŋŏřŕŘŕŐŧŝŻőŎŏ", (byte)62, 66);
               ZKM_STR_B[1] = NLoginCore_471.A("ŮşıţŇŨŐŏŖżżŃ", (byte)62, 65);
               ZKM_STR_B[2] = NLoginCore_127.D("ӝқӞӇҤӧҠәӎӪӃӛӫӶӴӅӥӢҶӃҸӔҺӸӈӽӝӠӗԄӢӺӑԀӓӉԆԉӠԁӋӤԋӻԉԐӫԔԅӬԈӣӔӥӢӣ", (byte)62, 68);
               ZKM_STR_B[3] = NLoginCore_173.E("ԬՀՈԨբձը՚չԴՕնԵշՔ՚վռՖցՁնՍՎ", (byte)62, 69);
               ZKM_STR_B[4] = NLoginCore_530.C("ҹӖӧӪӕӁӯӯҭһӨҷ", (byte)62, 67);
               ZKM_STR_B[5] = NLoginCore_559.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֘֏ծթ֠֎֘հքմ֢֖խծ", (byte)62, 70);
               ZKM_STR_B[6] = NLoginCore_453.D("ҡӆҶӂҦӟӘӆӀӐӜӟӤҬҳӣҳӆӬӤӓӇӏӮҽөӿӲӔӮԄӹ", (byte)62, 68);
               ZKM_STR_B[7] = NLoginCore_433.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜӜӅӸӉԈӗӥӍӝӈӍӏԁӭԗӧӘӱԒԌӺԈӵӮԚӻӢԕԞӽԏӷԉӤԛӼӤӤԡԤԞӺӭӷ", (byte)62, 68);
               ZKM_STR_B[8] = NLoginCore_004.D("ӁӂӓӦӂӤӪҿӧӪҺҷ", (byte)62, 68);
               ZKM_STR_B[9] = NLoginCore_232.B("ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƽƂǂƢƤǀǆǇǍǐƦƵǀǕƠƦƦǏǏƺƚǌƣ", (byte)62, 66);
               ZKM_STR_B[10] = NLoginCore_241.C("ӦӗҴҦҤӃӡӪӇӡҭӜӦӑӎӆӆӖӳҴӜӳӞӻӫӏӯӢӾӢӰӟ", (byte)62, 67);
               ZKM_STR_B[11] = NLoginCore_433.D("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӲӜӊԊӸӥԌӯӱԁӎԒӼӡӳӬӢӦӓԍӺԋӢӣ", (byte)62, 68);
               ZKM_STR_B[12] = NLoginCore_110.C("ҧӧҸӀӡҧӘӋҰӮӓӂӋҾӄӗӈҰӍҸҸӻӂӃ", (byte)62, 67);
               ZKM_STR_B[13] = NLoginCore_223.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦŻƃųŇŪŊżƈſƆƏŧſƁƖŖœŌƍœŻũŝŽśŘŲƥŲŷżŽűŮů", (byte)62, 65);
               ZKM_STR_B[14] = NLoginCore_183.E("ԮԽՍՑՈգԹհդզՙՂ", (byte)62, 69);
               ZKM_STR_B[15] = NLoginCore_076.D("ӘӅӘҺӄҿӨӂӝӑҤӇӄӥҶӃӖӥӴӧӑӅӰҹӰӔӳӗӏӡԁԀԄӦԇӪԃӷӫӞӼӨӋԇԎӡӵӗӥԔӯӍӓԉԝӑӼәԌӜӰӮԂӶ", (byte)62, 68);
               ZKM_STR_B[16] = NLoginCore_471.C("ӕӛӠҴӈӫөҪӥӆҪӈӁӲӭӤҮӲӎӤӝӫӂӃ", (byte)62, 67);
               ZKM_STR_B[17] = NLoginCore_387.A("œŝľŨŏũĬĳŉŴŧŹŏŷōĿļƅƀŗƅŉŪƇŢƆƏŮźŦŞŢūžůųŕŦƑŖŗƐŪůŞųŘƣžťŻƈƔŨţŢƂƗƀžƩƟŽƆ", (byte)62, 65);
               ZKM_STR_B[18] = NLoginCore_427.D("ӀӆӒҥҾҿҪӆһӦӥҿӋӶӮӔӋӖӦҳҸӻӂӃ", (byte)62, 68);
               ZKM_STR_B[19] = NLoginCore_324.F("՛ՠԮգՃղպՕՔմՑՂ", (byte)62, 70);
               ZKM_STR_B[20] = NLoginCore_027.B("ŠĭůųĴųŧŰŊŝŖŃ", (byte)62, 66);
               ZKM_STR_B[21] = NLoginCore_173.F("զ\u0530մձԷԱՁՃշԵՙՂ", (byte)62, 70);
               ZKM_STR_B[22] = NLoginCore_201.D("ҰұӝӋҦӁӗӫӥҧұӐӂӤӧӎҷұӭӒӅӾӝӘӱӢһӷӺӗӕӀӷӒӒӥӴӢԇӦӭӃԎӉӨөԖԌӥԗӷԓӶӥӢӣ", (byte)62, 68);
               ZKM_STR_B[23] = NLoginCore_559.E("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍Ոէդժը֗՟֏դկ֓ծօ֔\u0590ֈ\u0557֚֝ց֝ե֏֦խծ", (byte)62, 69);
               ZKM_STR_B[24] = NLoginCore_004.C("ӇӒҩҪҺӫӈӨӑӋҭҷ", (byte)62, 67);
               ZKM_STR_B[25] = NLoginCore_453.F(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւַ֠ֆ־ք֡\u05cc֊ֿ֚֝\u05cfׄ\u05cc֧֡דַ֫֙֫֒ד֢",
                  (byte)62,
                  70
               );
               ZKM_STR_B[26] = NLoginCore_223.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺԆӢԐӓӲӭԚԌӣӱԋӢӣ", (byte)62, 68);
               ZKM_STR_B[27] = NLoginCore_004.D("ӘҢҲҺӘӪҥӤүӠӂҷ", (byte)62, 68);
               ZKM_STR_B[28] = NLoginCore_183.B(
                  "ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƼƽƕǌƿƬǀƊǑƿƢǀǆƶƕǑƓƥƪƷƝǐƣ", (byte)62, 66
               );
               ZKM_STR_B[29] = NLoginCore_521.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӖԈӣӔәԊӻԈӐӉӢӗ", (byte)62, 67);
               ZKM_STR_B[30] = NLoginCore_223.E("ԬխՏիժձՁզՋեյոյՍՓիվդօՎբֆՍՎ", (byte)62, 69);
               ZKM_STR_B[31] = NLoginCore_553.B("ůŵŭňŵĴźůũŜŊŃ", (byte)62, 66);
               ZKM_STR_B[32] = NLoginCore_397.A("ŵŏŏŌřřŨźŗřŏōřŝŢĻĺĽŅŀžƇŎŏ", (byte)62, 65);
               ZKM_STR_B[33] = NLoginCore_553.C("әӉӦҤҤӘӘӊҼӋӨӓӥҮӐҶҷӘҺҳӪӕӂӃ", (byte)62, 67);
               ZKM_STR_B[34] = NLoginCore_004.C("ӦҿӇҦҴӘӫҮӀӝӋӍӌӢӗӵӆӂӤӆӳӅӂӃ", (byte)62, 67);
               ZKM_STR_B[35] = NLoginCore_110.D("ҵөӜӝӘҶӆӧӦӃұҷ", (byte)62, 68);
               ZKM_STR_B[36] = NLoginCore_559.F("ՒԿԵՒժՌճՆԹՒ՝Ղ", (byte)62, 70);
               ZKM_STR_B[37] = NLoginCore_138.D("ӐӂӉӤӢҬӪҩӂӭұӪӬҽҳӕӥәөӭӎӻӂӃ", (byte)62, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_387.A("ūŞŊŵůũĵŶūŖſžūőŔŤĿƄƄĽŕŸŞŽƂŌŉŞŌŐšű", (byte)62, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_397.D("ҞҡӕӇӍӀҠӈӅӈӭӅӵүҲӔӸӐҹӱӅӫӂӃ", (byte)62, 68);
         }
      }
   }

   public void a(PlayerQuitEvent var1) {
      Player var2 = var1.getPlayer();
      NLoginCore_277 var3 = this.e.b().a(var2);
      long var4 = System.nanoTime();
      NLoginCore_187 var6 = this.e.a();

      try {
         try {
            if (NLoginCore_477.ao.ar()) {
               String var7 = var1.getQuitMessage();
               if (var7 != null && var7.toLowerCase(Locale.ENGLISH).contains(a(bx, by ^ bz))) {
                  var1.setQuitMessage(null);
               }
            }

            if (this.c(var2)) {
               return;
            }

            Channel var16 = this.e.b().a(var1, var2);
            if (var16 != null) {
               if (this.e.b().e(var16)) {
                  return;
               }
            } else {
               NLoginCore_370.c(a(ca, cc) + var1.getClass().getSimpleName() + a(cd & cf, cg) + var3.getName());
            }

            NLoginCore_509 var8 = var6.a(var3);
            if (var8 != null) {
               NLoginCore_510 var9 = var8.d(NLoginCore_567.g);
               if (var9 != null) {
                  NLoginCore_447 var10 = (NLoginCore_447)this.e.b();
                  var10.a().a(var8, var9, (cj != 0));
               }
            }

            if (NLoginCore_477.x.ar()) {
               this.e.b().k(var3);
            }

            if (!this.l) {
               super.d(var3);
               return;
            }
         } catch (Throwable var14) {
            NLoginCore_370.c(a(cm & cn, co) + var3.getName() + a(cp, cr), var14);
         }
      } finally {
         var6.l(var3);
         NLoginCore_548.a(NLoginCore_425.e, var4);
      }
   }

   public boolean c(Player var1) {
      if (BedrockFloodgateHook.aE) {
         NLoginCore_370.e(
            a(hg, hi ^ hj)
               + var1.getName()
               + a(hk, hl)
               + var1.getUniqueId()
               + a(hn & ho, hp)
               + var1
               + a(hr, ht ^ hu)
               + var1.hashCode()
               + a(hv & hw, hx)
               + var1.getClass().getCanonicalName()
               + a(hz, ib ^ ic)
         );
      }

      if (!var1.hasMetadata(a(ij, ik)) && !var1.hasMetadata(a(im, in ^ io)) && !var1.hasMetadata(a(ip, ir ^ is))) {
         NLoginCore_087 var2 = ((NLoginInterface_025)this.e.b()).a();
         return ((var2 != null && var2.b(var1) != 0) ? iw : iz);
      } else {
         return (it != 0);
      }
   }
}
