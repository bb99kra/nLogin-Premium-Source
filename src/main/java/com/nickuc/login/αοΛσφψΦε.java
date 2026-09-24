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

public class αοΛσφψΦε extends ΓΠεψςμδςΦυορΓρπ {
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
   private static String[] d = new String[jd];
   private static int bj = Integer.reverse(268435456);
   private static int gl = (117440512 >>> 54 | 117440512 << -54) & -1;
   private static long dl = Long.reverse(1411318372589986873L);
   private static int hk = Integer.reverse(2013265920);
   private static long fq = Long.reverse(-6773413839565225984L);
   private final nLoginBukkit d;
   private static int dt = Integer.reverse(1207959552);
   private static int fu = Integer.reverse(0);
   private static String[] c = new String[jc];
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
         return (boolean)gt;
      } else if (this.c(var1)) {
         return (boolean)gw;
      } else {
         return (boolean)(!this.e.a().b(this.e.b().a(var1)) ? gz : hd);
      }
   }

   public void a(PlayerJoinEvent var1) {
      Player var2 = var1.getPlayer();
      if (!this.c(var2)) {
         ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
         Channel var4 = this.e.b().a(var1, var2);
         if (var4 == null) {
            String[] var10001 = new String[b];
            var10001[e] = c<"㺀">(g, i ^ j);
            var10001[k] = c<"㺃">(n, p ^ q);
            var10001[z] = c<"㺆">(aa, ab ^ ad) + var1.getClass().getSimpleName() + c<"㺉">(ag, ah ^ ai);
            var10001[al] = c<"㺌">(am & ap, aq);
            var10001[at] = c<"㺏">(aw, ax);
            var3.a(βιχγΓλχΠσπ.a(var10001));
         }

         if (!this.e.b().e(var4)) {
            if (ρζΨνψξφφεΨδσψ.p) {
               String var5 = this.a(var3, var4, var1);
               if (var5 != null) {
                  var3.a(var5);
                  return;
               }
            }

            long var14 = System.nanoTime();

            try {
               if (!this.e.a().b(var2.getName(), var2.getUniqueId())) {
                  if (ΣλνΨουΩΔοθεβ.ao.ar()) {
                     String var7 = var1.getJoinMessage();
                     if (var7 != null && var7.toLowerCase(Locale.ENGLISH).contains(c<"㺒">(ba & bc, bd))) {
                        var1.setJoinMessage(null);
                     }
                  }

                  ιηοψσγξςΩγδ var15 = this.e.a().b(var3);
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
                  if (ΓχυψπωΣςΠκγζΦ.V()) {
                     var3.a().a(var8);
                  } else {
                     var8.run();
                  }

                  return;
               }
            } catch (Throwable var12) {
               ψΓωτιμωκχψΛΨ.c(c<"㺕">(be, bf ^ bi) + var3.getName() + c<"㺘">(bj, bl), var12);
               var3.a(c<"㺛">(bu, bv));
               return;
            } finally {
               κδξτΦΠωφ.a(ΨΛυνγφυνδΨδγΣ.d, var14);
            }
         }
      }
   }

   private String a(ΨαχΨχΣλεΠψΦ var1, Channel var2, Object var3) {
      String var4 = var1.getName();

      try {
         com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var5 = (com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ)var2.attr(com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ.a).get();
         if (var5 == null) {
            String var6 = c<"㺀">(cz & dc, dd) + var1.getName() + c<"㺃">(dg, dh ^ di) + var3.getClass().getSimpleName() + c<"㺆">(dk, dl);
            ψΓωτιμωκχψΛΨ.c(var6);
            String[] var10000 = new String[dq];
            var10000[ds] = c<"㺉">(dt, du ^ dx);
            var10000[dy] = c<"㺌">(dz, ea ^ eb);
            var10000[ee] = c<"㺏">(eh & ei, ej) + var6;
            var10000[el] = c<"㺒">(em, en);
            var10000[ep] = c<"㺕">(eq & et, ev);
            return βιχγΓλχΠσπ.a(var10000);
         } else {
            return this.a(var1, var5);
         }
      } catch (Throwable var7) {
         ψΓωτιμωκχψΛΨ.c(c<"㺘">(ew & ex, ey) + var4 + c<"㺛">(fg & fj, fl), var7);
         return c<"㺞">(fo, fp ^ fq);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  αοΛσφψΦε.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.E("ӾԠԢԂԦՅԽՓԿԎՌՂՐՊԓԸ՚ՙՑ\u0557ՑԦ", (byte)26, 69), αοΛσφψΦε.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(οοθδΨιοΦΠβδζ.B("ĖģĢåĥġĜĥİğìĪĮħĪİòѵ҄ѡҊҎґѰҀĆ", (byte)26, 66) + var1 + ξψθρΣΠΣς.D("н", (byte)26, 68) + var2.toString(), var4);
      }
   }

   public boolean a(EntityEvent var1) {
      Entity var2 = var1.getEntity();
      return this.a(var2);
   }

   public String a(ΨαχΨχΣλεΠψΦ var1, com.nickuc.login.bukkit.ΠιζζοΨκψΠΔπ var2) {
      long var3 = System.nanoTime();
      String var5 = var1.getName();

      Object var8;
      try {
         if (!this.l) {
            αεθζδβΨξςρπΩζθδ var14 = this.e.b().a();
            String var16 = super.a(
               var1,
               var2.a,
               var2.k,
               Optional.ofNullable(var1.a()).orElse((InetSocketAddress)var2.a.remoteAddress()),
               var2.d(),
               (boolean)(!var2.a && (var14 == null || !var14.a(var1.a())) ? fz : fv),
               var2
            );
            if (var16 == null && var2.a != null) {
               this.e.a().b(var1).a().b(var2.a);
            }

            return var16;
         }

         InetSocketAddress var6 = Optional.ofNullable(var1.a()).orElse((InetSocketAddress)var2.a.remoteAddress());
         ιηοψσγξςΩγδ var15 = this.e.a().a(var1, null, var1.getName(), var6, (boolean)fr, (boolean)fu, var2);
         if (var2.a != null) {
            var15.a().b(var2.a);
         }

         var8 = null;
      } catch (Throwable var12) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(gc, ge ^ gf) + var5 + c<"㺃">(gg & gh, gi), var12);
         return c<"㺆">(gl & go, gq);
      } finally {
         κδξτΦΠωφ.a(ΨΛυνγφυνδΨδγΣ.c, var3);
      }

      return (String)var8;
   }

   public αοΛσφψΦε(ΨγημιδξΓτοθαζ var1, nLoginBukkit var2, boolean var3) {
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
      if (c[var0] == null) {
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
            throw new RuntimeException(οοθδΨιοΦΠβδζ.D("ӤӱӰҳӳӯӪӳӾӭҺӸӼӵӸӾӀࡃࡒ\u082fࡘ\u085c\u085f࠾ࡎ", (byte)68, 68));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
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
         return (boolean)gs;
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
               d[0] = λΣΩσμφγχ.B("ŌŒŞıŊŋĶŒŇŲŰŊŻŰĻŷŢŹŰŰŰšŎŏ", (byte)62, 66);
               d[1] = φδχεθοκψαλΛογλ.E("ՠԾխնիմՑԲըիՍՂ", (byte)62, 69);
               d[2] = ντθΔζβΔζ.A("ũħŪœİųĬťŚŶŏŧŷƂƀőűŮłŏńŠņƄŔƉũŬţƐŮƆŝƌşŕƒƕŬƍŗŰƔŶƍŴźơŭƒŽƜŦƧŮů", (byte)62, 65);
               d[3] = μεςΩΔΣγν.C("ӢӕҹӥәӄҭҬӜӅӨҷ", (byte)62, 67);
               d[4] = ζβησεθωυγτ.F("ՠԾխնիմՑԲըիՍՂ", (byte)62, 70);
               d[5] = ιΠοθΩΦξκ.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֗ըև֎֒\u0590֑գկՠՠ֦խծ", (byte)62, 70);
               d[6] = δΛψπξκσβγςα.D("ҡӆҶӂҦӟӘӆӀӐӟӑҾӇӏӫӵӲӎӧӶӻӂӃ", (byte)62, 68);
               d[7] = βθκςνθΩθυμςτκχ.F("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍ՈէէՐփՔ֓բհ\u0558ըՓ\u0558՚\u058cո֢ղգռ֝֗օ֓րչ֥ֆխ֠֩ֈ֚ւִ֞յևօփ֑֒֎ָ֧ւ", (byte)62, 70);
               d[8] = ΨφιωσρΓδΔθ.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
               d[9] = οΩνΩρωλΨηΛδωδ.F(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆",
                  (byte)62,
                  70
               );
               d[10] = φΨαξωυθανΣφυκη.F("ձբԿԱԯՎլյՒլԸՖըթթՐք՛խԸփՠՍՎ", (byte)62, 70);
               d[11] = ζοηκορΦνΣθγΩ.C("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӿӀӖӈԅӺӆԈӐԑԈӗ", (byte)62, 67);
               d[12] = πχσδΦΦνθΔπ.C("ҧӧҸӀӡҧӘӋҰӮӚӍӈӤӷӠӫҳҰӈӰӫӂӃ", (byte)62, 67);
               d[13] = πηγμΣΔκκ.F("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեպւղՆթՉջևվօ֎զվր֕ՕՒՋ\u058cՒպզ֏Ֆ՝֛֓\u0590օ՟֠ՠրխծ", (byte)62, 70);
               d[14] = ςπυηννναΣ.C("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 67);
               d[15] = λΣΩσμφγχ.B("ŤőŤņŐŋŴŎũŝİœŐűłŏŢűƀųŝőżŅżŠſţśŭƍƌƐŲƓŶƏƃŷŪƈŴŗƓƚŭƁţűƠŻřşƓųƊžƂƦƜƅƪſƢ", (byte)62, 66);
               d[16] = φΨαξωυθανΣφυκη.B("ŦŎĭĴŏűőŏņũŚŃ", (byte)62, 66);
               d[17] = ΣφδσΔζιΠρα.F("Ւ՜ԽէՎըԫԲՈճզոՎնՌԾԻքտՖքՈթֆաօ֎խչե՝աժսծղՔե\u0590ՕՖ֏թ֞՝֗֕ոք֔դոյ֦խծ", (byte)62, 70);
               d[18] = ΠΛΨοδΩσμνΛγΦφβς.F("ՋՑ՝\u0530ՉՊԵՑՆձկՉպկԺնաոկկկՠՍՎ", (byte)62, 70);
               d[19] = ιΠοθΩΦξκ.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
               d[20] = χφπρψπφΦθμπ.C("ҽӗҦҺҼӝӜӀӫӈӒҷ", (byte)62, 67);
               d[21] = ΣφδσΔζιΠρα.B("šĿŮŷŬŵŒĳũŬŎŃ", (byte)62, 66);
               d[22] = ζοηκορΦνΣθγΩ.B("ļĽũŗĲōţŷűĳĽŜŎŰųŚŃĽŹŞőƊũŤŽŮŇƃƆţšŌƃŞŞűƀŮƓŲŹŏƘũƈƏƓƑƒŤŰššƧŮů", (byte)62, 66);
               d[23] = χΠξΦιζΨΣωΦσΨζ.C("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺӜӬӭӮԄӧԉӪԊӪԛӢӣ", (byte)62, 67);
               d[24] = οΩνΩρωλΨηΛδωδ.D("ӣӁҹӠҴӎӍӊӯүӊҷ", (byte)62, 68);
               d[25] = χφπρψπφΦθμπ.C("ӀӆӒҥҾҿҪӆһӦӥӌӡҲӕӟӬӂәӏӋӓҶҼӎӒԂӍӻӻӱӸӘԈӝԌӡӉӡԏӌӿӌӢӳӇԂӏӰԚӕԚӶԇԝәԠӠӿӸԒԘԢԀӡԛӨԠԥԨԎӧӦԃԧԄӰԍӾԫԭԣӳӷԕԺԙӽԪԷԖԝԷԯԺԻ", (byte)62, 67);
               d[26] = ΣφδσΔζιΠρα.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦźŗŻŷƉũŊťƎŉŨťūũƘŠƐťŰƔůƆŨŸŹźƐųƕŶƖŶƧŮů", (byte)62, 65);
               d[27] = ζοηκορΦνΣθγΩ.E("ծՌՄիԿՙ\u0558ՕպԺՕՂ", (byte)62, 69);
               d[28] = ζβησεθωυγτ.E(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւׅ֤֠ֈֵֺׂׂׅ֡֨׆",
                  (byte)62,
                  69
               );
               d[29] = ξψθρΣΠΣς.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӱӕӅԌӊӣԃӗӜӿӪӗ", (byte)62, 67);
               d[30] = οΩνΩρωλΨηΛδωδ.D("ҡӢӄӠӟӦҶӛӀӚӫӋӵҾӣӟҴөӫҵӒӅӂӃ", (byte)62, 68);
               d[31] = βεξΠθρρςΔΦμ.E("ԲԲնլէթԫՂԺԸՍՂ", (byte)62, 69);
               d[32] = ΣφδσΔζιΠρα.E("մՎՎՋ\u0558\u0558էչՖ\u0558Տ\u0558ՖցՁլվհծշևնՍՎ", (byte)62, 69);
               d[33] = πηγμΣΔκκ.D("әӉӦҤҤӘӘӊҼӋӫӛӆӊӒӟҪҸӏӶӰӻӂӃ", (byte)62, 68);
               d[34] = μεςΩΔΣγν.F("ձՊՒԱԿգնԹՋըՖԼ՜ԹմնԹՠգ՞ԿնՍՎ", (byte)62, 70);
               d[35] = ντθΔζβΔζ.C("ӒӁӫӊҦӮӜӂҧӲұҷ", (byte)62, 67);
               d[36] = μζξτΩσσφυδεπλΨ.B("ņħŇĿŔŅĸĺŸžņŃ", (byte)62, 66);
               d[37] = ιΠοθΩΦξκ.A("ŜŎŕŰŮĸŶĵŎŹİĺľŶūőſŻşłŜőŎŏ", (byte)62, 65);
               break;
            case 1:
               d[0] = πψυκΠΨμΛΩβΣφμφσ.B("ŌŒŞıŊŋĶŒŇŲűŋŏřŕŘŕŐŧŝŻőŎŏ", (byte)62, 66);
               d[1] = οοθδΨιοΦΠβδζ.A("ŮşıţŇŨŐŏŖżżŃ", (byte)62, 65);
               d[2] = ΨΦνΨΦωυΩνβςμ.D("ӝқӞӇҤӧҠәӎӪӃӛӫӶӴӅӥӢҶӃҸӔҺӸӈӽӝӠӗԄӢӺӑԀӓӉԆԉӠԁӋӤԋӻԉԐӫԔԅӬԈӣӔӥӢӣ", (byte)62, 68);
               d[3] = βθκςνθΩθυμςτκχ.E("ԬՀՈԨբձը՚չԴՕնԵշՔ՚վռՖցՁնՍՎ", (byte)62, 69);
               d[4] = θεωψξβΛσσ.C("ҹӖӧӪӕӁӯӯҭһӨҷ", (byte)62, 67);
               d[5] = ΨφιωσρΓδΔθ.F("ԻԼըՖԱՌբնհԲԼ՛ՍկղՙՂԼո՝Ր։ըգռխՆւօբՠՋւ՝՝հտխ֒ձոՎ֘֏ծթ֠֎֘հքմ֢֖խծ", (byte)62, 70);
               d[6] = φΨαξωυθανΣφυκη.D("ҡӆҶӂҦӟӘӆӀӐӜӟӤҬҳӣҳӆӬӤӓӇӏӮҽөӿӲӔӮԄӹ", (byte)62, 68);
               d[7] = φδχεθοκψαλΛογλ.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜӜӅӸӉԈӗӥӍӝӈӍӏԁӭԗӧӘӱԒԌӺԈӵӮԚӻӢԕԞӽԏӷԉӤԛӼӤӤԡԤԞӺӭӷ", (byte)62, 68);
               d[8] = χφπρψπφΦθμπ.D("ӁӂӓӦӂӤӪҿӧӪҺҷ", (byte)62, 68);
               d[9] = ΦδφπθΩΩλζξ.B("ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƽƂǂƢƤǀǆǇǍǐƦƵǀǕƠƦƦǏǏƺƚǌƣ", (byte)62, 66);
               d[10] = ΣερμΔσατσκ.C("ӦӗҴҦҤӃӡӪӇӡҭӜӦӑӎӆӆӖӳҴӜӳӞӻӫӏӯӢӾӢӰӟ", (byte)62, 67);
               d[11] = φδχεθοκψαλΛογλ.D("ӘӅӘҺӄҿӨӂӝӑҲӓӜҧӏҿӇҲҸӒӋӎӎҶӵӺҾӋӓӑԇӠӲӜӊԊӸӥԌӯӱԁӎԒӼӡӳӬӢӦӓԍӺԋӢӣ", (byte)62, 68);
               d[12] = ντθΔζβΔζ.C("ҧӧҸӀӡҧӘӋҰӮӓӂӋҾӄӗӈҰӍҸҸӻӂӃ", (byte)62, 67);
               d[13] = βεξΠθρρςΔΦμ.A("ĮĽůŧōũıůŊŉŞļōĺŻŮŶƀŻŤŦŻƃųŇŪŊżƈſƆƏŧſƁƖŖœŌƍœŻũŝŽśŘŲƥŲŷżŽűŮů", (byte)62, 65);
               d[14] = δΛψπξκσβγςα.E("ԮԽՍՑՈգԹհդզՙՂ", (byte)62, 69);
               d[15] = ΣδτΠνεγοΓορητ.D("ӘӅӘҺӄҿӨӂӝӑҤӇӄӥҶӃӖӥӴӧӑӅӰҹӰӔӳӗӏӡԁԀԄӦԇӪԃӷӫӞӼӨӋԇԎӡӵӗӥԔӯӍӓԉԝӑӼәԌӜӰӮԂӶ", (byte)62, 68);
               d[16] = οοθδΨιοΦΠβδζ.C("ӕӛӠҴӈӫөҪӥӆҪӈӁӲӭӤҮӲӎӤӝӫӂӃ", (byte)62, 67);
               d[17] = χΠξΦιζΨΣωΦσΨζ.A("œŝľŨŏũĬĳŉŴŧŹŏŷōĿļƅƀŗƅŉŪƇŢƆƏŮźŦŞŢūžůųŕŦƑŖŗƐŪůŞųŘƣžťŻƈƔŨţŢƂƗƀžƩƟŽƆ", (byte)62, 65);
               d[18] = ιΠοθΩΦξκ.D("ӀӆӒҥҾҿҪӆһӦӥҿӋӶӮӔӋӖӦҳҸӻӂӃ", (byte)62, 68);
               d[19] = ςΦζσμτΓσ.F("՛ՠԮգՃղպՕՔմՑՂ", (byte)62, 70);
               d[20] = ζβησεθωυγτ.B("ŠĭůųĴųŧŰŊŝŖŃ", (byte)62, 66);
               d[21] = βθκςνθΩθυμςτκχ.F("զ\u0530մձԷԱՁՃշԵՙՂ", (byte)62, 70);
               d[22] = πψυκΠΨμΛΩβΣφμφσ.D("ҰұӝӋҦӁӗӫӥҧұӐӂӤӧӎҷұӭӒӅӾӝӘӱӢһӷӺӗӕӀӷӒӒӥӴӢԇӦӭӃԎӉӨөԖԌӥԗӷԓӶӥӢӣ", (byte)62, 68);
               d[23] = ΨφιωσρΓδΔθ.E("ԭԼծզՌը\u0530ծՉՈ՝ԻՌԹպխյտպգեչՖպնֈըՉդ֍Ոէդժը֗՟֏դկ֓ծօ֔\u0590ֈ\u0557֚֝ց֝ե֏֦խծ", (byte)62, 69);
               d[24] = χφπρψπφΦθμπ.C("ӇӒҩҪҺӫӈӨӑӋҭҷ", (byte)62, 67);
               d[25] = φΨαξωυθανΣφυκη.F(
                  "ՋՑ՝\u0530ՉՊԵՑՆձհ\u0557լԽՠժշՍդ՚Ֆ՞ՁՇՙ՝֍\u0558ֆֆռփգ֓ը֗լՔլ֚\u0557֊\u0557խվՒ֍՚ջ֥ՠ֥ց֒֨դ֫ի֊փ֣֭֝\u058bլ֦ճְֳ֫֙ղձ֎ֲ֏ջ֘։ֶָ֮վւַ֠ֆ־ք֡\u05cc֊ֿ֚֝\u05cfׄ\u05cc֧֡דַ֫֙֫֒ד֢",
                  (byte)62,
                  70
               );
               d[26] = βεξΠθρρςΔΦμ.D("ҢұӣӛӁӝҥӣҾҽӒҰӁҮӯӢӪӴӯӘӚӮӋӯӫӽӝҾәԂҽӜәӟӝԌӔԄәӤԈӣӺԆӢԐӓӲӭԚԌӣӱԋӢӣ", (byte)62, 68);
               d[27] = χφπρψπφΦθμπ.D("ӘҢҲҺӘӪҥӤүӠӂҷ", (byte)62, 68);
               d[28] = δΛψπξκσβγςα.B(
                  "ŌŒŞıŊŋĶŒŇŲűŘŭľšūŸŎťśŗşłňŚŞƎřƇƇŽƄŤƔũƘŭŕŭƛŘƋŘŮſœƎśżƦšƦƂƓƩťƬŬƋƄƞƤƮƌŭƧŴƬƱƴƚųŲƏƳƐżƙƊƷƹƯſƃơƼƽƕǌƿƬǀƊǑƿƢǀǆƶƕǑƓƥƪƷƝǐƣ", (byte)62, 66
               );
               d[29] = μεςΩΔΣγν.C("әәӂӟҫӡӢӦӢӣӎӬӔӄӷӮҷӸӢӍҺӇҸөӖӹҺӢӠҾӺӜӖԈӣӔәԊӻԈӐӉӢӗ", (byte)62, 67);
               d[30] = βεξΠθρρςΔΦμ.E("ԬխՏիժձՁզՋեյոյՍՓիվդօՎբֆՍՎ", (byte)62, 69);
               d[31] = λΣΩσμφγχ.B("ůŵŭňŵĴźůũŜŊŃ", (byte)62, 66);
               d[32] = οΩνΩρωλΨηΛδωδ.A("ŵŏŏŌřřŨźŗřŏōřŝŢĻĺĽŅŀžƇŎŏ", (byte)62, 65);
               d[33] = λΣΩσμφγχ.C("әӉӦҤҤӘӘӊҼӋӨӓӥҮӐҶҷӘҺҳӪӕӂӃ", (byte)62, 67);
               d[34] = χφπρψπφΦθμπ.C("ӦҿӇҦҴӘӫҮӀӝӋӍӌӢӗӵӆӂӤӆӳӅӂӃ", (byte)62, 67);
               d[35] = ντθΔζβΔζ.D("ҵөӜӝӘҶӆӧӦӃұҷ", (byte)62, 68);
               d[36] = ΨφιωσρΓδΔθ.F("ՒԿԵՒժՌճՆԹՒ՝Ղ", (byte)62, 70);
               d[37] = πηγμΣΔκκ.D("ӐӂӉӤӢҬӪҩӂӭұӪӬҽҳӕӥәөӭӎӻӂӃ", (byte)62, 68);
               break;
            case 2:
               d[0] = χΠξΦιζΨΣωΦσΨζ.A("ūŞŊŵůũĵŶūŖſžūőŔŤĿƄƄĽŕŸŞŽƂŌŉŞŌŐšű", (byte)62, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = οΩνΩρωλΨηΛδωδ.D("ҞҡӕӇӍӀҠӈӅӈӭӅӵүҲӔӸӐҹӱӅӫӂӃ", (byte)62, 68);
         }
      }
   }

   public void a(PlayerQuitEvent var1) {
      Player var2 = var1.getPlayer();
      ΨαχΨχΣλεΠψΦ var3 = this.e.b().a(var2);
      long var4 = System.nanoTime();
      εσλρΔμΔψχεθυνΔ var6 = this.e.a();

      try {
         try {
            if (ΣλνΨουΩΔοθεβ.ao.ar()) {
               String var7 = var1.getQuitMessage();
               if (var7 != null && var7.toLowerCase(Locale.ENGLISH).contains(c<"㺀">(bx, by ^ bz))) {
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
               ψΓωτιμωκχψΛΨ.c(c<"㺃">(ca, cc) + var1.getClass().getSimpleName() + c<"㺆">(cd & cf, cg) + var3.getName());
            }

            ιηοψσγξςΩγδ var8 = var6.a(var3);
            if (var8 != null) {
               ΩψτσψΣριΣ var9 = var8.d(πβκνλοΛκΠδΦτφλ.g);
               if (var9 != null) {
                  λΓλχΩαοΨωθτοςΓ var10 = (λΓλχΩαοΨωθτοςΓ)this.e.b();
                  var10.a().a(var8, var9, (boolean)cj);
               }
            }

            if (ΣλνΨουΩΔοθεβ.x.ar()) {
               this.e.b().k(var3);
            }

            if (!this.l) {
               super.d(var3);
               return;
            }
         } catch (Throwable var14) {
            ψΓωτιμωκχψΛΨ.c(c<"㺉">(cm & cn, co) + var3.getName() + c<"㺌">(cp, cr), var14);
         }
      } finally {
         var6.l(var3);
         κδξτΦΠωφ.a(ΨΛυνγφυνδΨδγΣ.e, var4);
      }
   }

   public boolean c(Player var1) {
      if (ορΣψφρΔαεδψσθυ.aE) {
         ψΓωτιμωκχψΛΨ.e(
            c<"㺀">(hg, hi ^ hj)
               + var1.getName()
               + c<"㺃">(hk, hl)
               + var1.getUniqueId()
               + c<"㺆">(hn & ho, hp)
               + var1
               + c<"㺉">(hr, ht ^ hu)
               + var1.hashCode()
               + c<"㺌">(hv & hw, hx)
               + var1.getClass().getCanonicalName()
               + c<"㺏">(hz, ib ^ ic)
         );
      }

      if (!var1.hasMetadata(c<"㺒">(ij, ik)) && !var1.hasMetadata(c<"㺕">(im, in ^ io)) && !var1.hasMetadata(c<"㺘">(ip, ir ^ is))) {
         δκυβΦΩαχΩβ var2 = ((μζΔποσηξφΦ)this.e.b()).a();
         return (boolean)(var2 != null && var2.b(var1) ? iw : iz);
      } else {
         return (boolean)it;
      }
   }
}
